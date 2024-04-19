package kr.co.seesoft.nemo.starnemoapp.nemoapi.ro;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class NemoAppInfoRO implements Serializable {

    /**  */
    @SerializedName("ver")
    private String ver;

    /**  */
    @SerializedName("delImgDt")
    private String delImgDt;

    /**  */
    @SerializedName("fileUrl")
    private String fileUrl;


    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public String getDelImgDt() {
        return delImgDt;
    }

    public void setDelImgDt(String delImgDt) {
        this.delImgDt = delImgDt;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    @Override
    public String toString() {
        return "NemoAppInfoRO{" +
                "ver='" + ver + '\'' +
                ", delImgDt='" + delImgDt + '\'' +
                ", fileUrl='" + fileUrl + '\'' +
                '}';
    }
}
