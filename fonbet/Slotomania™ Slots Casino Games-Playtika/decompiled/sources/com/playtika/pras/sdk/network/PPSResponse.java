package com.playtika.pras.sdk.network;

import org.json.JSONObject;

/* loaded from: classes6.dex */
public class PPSResponse extends ResponseDto {
    private final ResponseCode responseCode;

    public PPSResponse(JSONObject jSONObject) {
        super(jSONObject);
        this.responseCode = ResponseCode.fromCode(jSONObject.getInt("responseCode"));
    }

    public ResponseCode getResponseCode() {
        return this.responseCode;
    }

    public PPSResponse(ResponseCode responseCode) {
        this.responseCode = responseCode;
    }
}
