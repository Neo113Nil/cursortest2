package com.playtika.pras.sdk.network.models;

import com.playtika.pras.sdk.network.PPSResponse;
import com.playtika.pras.sdk.network.ResponseCode;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PurchaseConfirmation extends PPSResponse {
    private final String purchaseData;
    private final String purchaseDataSignature;

    public PurchaseConfirmation(JSONObject jSONObject) {
        super(jSONObject);
        if (getResponseCode() == ResponseCode.RESULT_OK) {
            this.purchaseData = getJsonString(jSONObject, "purchaseData");
            this.purchaseDataSignature = getJsonString(jSONObject, "purchaseDataSignature");
        } else {
            this.purchaseData = null;
            this.purchaseDataSignature = null;
        }
    }

    public String getPurchaseData() {
        return this.purchaseData;
    }

    public String getPurchaseDataSignature() {
        return this.purchaseDataSignature;
    }

    public PurchaseConfirmation(ResponseCode responseCode, String str, String str2) {
        super(responseCode);
        this.purchaseData = str;
        this.purchaseDataSignature = str2;
    }

    public PurchaseConfirmation(ResponseCode responseCode) {
        this(responseCode, null, null);
    }
}
