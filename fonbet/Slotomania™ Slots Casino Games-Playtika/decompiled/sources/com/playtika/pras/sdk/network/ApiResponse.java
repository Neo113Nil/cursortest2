package com.playtika.pras.sdk.network;

import org.json.JSONObject;

/* loaded from: classes8.dex */
public class ApiResponse {
    private Exception exception;
    private JSONObject responseData;

    public ApiResponse(JSONObject jSONObject) {
        this.responseData = jSONObject;
    }

    public Exception getException() {
        return this.exception;
    }

    public JSONObject getResponseData() {
        return this.responseData;
    }

    public ApiResponse(Exception exc) {
        this.exception = exc;
    }
}
