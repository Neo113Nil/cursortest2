package com.huawei.hms.hihealth.data;

/* loaded from: classes13.dex */
public class SubDataRelation {
    private String dataCollectorId;
    private String dataTypeName;
    private long endTime;
    private long startTime;

    public SubDataRelation(long j, long j2, String str, String str2) {
        this.startTime = j;
        this.endTime = j2;
        this.dataCollectorId = str;
        this.dataTypeName = str2;
    }

    public String getDataCollectorId() {
        return this.dataCollectorId;
    }

    public String getDataTypeName() {
        return this.dataTypeName;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public void setDataCollectorId(String str) {
        this.dataCollectorId = str;
    }

    public void setDataTypeName(String str) {
        this.dataTypeName = str;
    }

    public void setEndTime(long j) {
        this.endTime = j;
    }

    public void setStartTime(long j) {
        this.startTime = j;
    }
}
