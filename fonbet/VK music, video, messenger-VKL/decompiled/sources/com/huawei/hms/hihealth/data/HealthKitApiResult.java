package com.huawei.hms.hihealth.data;

/* loaded from: classes13.dex */
public class HealthKitApiResult {
    private boolean isResultGzipped = false;
    private String response;

    public String getResponse() {
        return this.response;
    }

    public boolean isResultGzipped() {
        return this.isResultGzipped;
    }

    public void setResponse(String str) {
        this.response = str;
    }

    public void setResultGzipped(boolean z) {
        this.isResultGzipped = z;
    }
}
