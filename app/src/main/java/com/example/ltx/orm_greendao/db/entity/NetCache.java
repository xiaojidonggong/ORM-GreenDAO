package com.example.ltx.orm_greendao.db.entity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table NET_CACHE.
 */
public class NetCache {

    private Long id;
    private long netId;
    private String url;
    private String json;
    private java.util.Date createTime;
    private java.util.Date modifyTime;

    public NetCache() {
    }

    public NetCache(Long id) {
        this.id = id;
    }

    public NetCache(Long id, long netId, String url, String json, java.util.Date createTime, java.util.Date modifyTime) {
        this.id = id;
        this.netId = netId;
        this.url = url;
        this.json = json;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getNetId() {
        return netId;
    }

    public void setNetId(long netId) {
        this.netId = netId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    public java.util.Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(java.util.Date modifyTime) {
        this.modifyTime = modifyTime;
    }

}