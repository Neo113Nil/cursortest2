package com.playtika.pras.sdk.network.models;

import com.playtika.pras.sdk.network.PPSResponse;
import com.playtika.pras.sdk.network.ResponseCode;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class Purchases extends PPSResponse {
    private final String continuationToken;
    private final ArrayList<String> dataSignatures;
    private final ArrayList<String> purchaseDataList;
    private final ArrayList<String> purchaseItems;

    public Purchases(JSONObject jSONObject) {
        super(jSONObject);
        if (ResponseCode.RESULT_OK == getResponseCode()) {
            this.purchaseItems = getStringArrayList(jSONObject, "skus");
            this.purchaseDataList = getStringArrayList(jSONObject, "purchasesData");
            this.dataSignatures = getStringArrayList(jSONObject, "purchasesDataSignatures");
            this.continuationToken = getJsonString(jSONObject, "continuationToken");
            return;
        }
        this.purchaseItems = null;
        this.purchaseDataList = null;
        this.dataSignatures = null;
        this.continuationToken = null;
    }

    public String getContinuationToken() {
        return this.continuationToken;
    }

    public ArrayList<String> getDataSignatures() {
        return this.dataSignatures;
    }

    public ArrayList<String> getPurchaseDataList() {
        return this.purchaseDataList;
    }

    public ArrayList<String> getPurchaseItems() {
        return this.purchaseItems;
    }

    public Purchases(ResponseCode responseCode) {
        this(responseCode, null, null, null, null);
    }

    private Purchases(ResponseCode responseCode, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, String str) {
        super(responseCode);
        this.purchaseItems = arrayList;
        this.purchaseDataList = arrayList2;
        this.dataSignatures = arrayList3;
        this.continuationToken = str;
    }
}
