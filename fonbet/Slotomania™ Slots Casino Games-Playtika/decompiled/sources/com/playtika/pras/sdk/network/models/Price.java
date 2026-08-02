package com.playtika.pras.sdk.network.models;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.playtika.pras.sdk.network.ResponseDto;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Price extends ResponseDto {
    String currency;
    String currencyCode;
    String price;
    String tax;
    String taxRate;
    String totalPrice;

    public Price(JSONObject jSONObject) {
        this.totalPrice = getJsonString(jSONObject, "totalPrice");
        this.price = getJsonString(jSONObject, "price");
        this.tax = getJsonString(jSONObject, FirebaseAnalytics.Param.TAX);
        this.taxRate = getJsonString(jSONObject, "taxRate");
        this.currencyCode = getJsonString(jSONObject, "currencyCode");
        this.currency = getJsonString(jSONObject, "currency");
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("totalPrice", this.totalPrice);
            jSONObject.put("price", this.price);
            jSONObject.putOpt(FirebaseAnalytics.Param.TAX, this.tax);
            jSONObject.putOpt("taxRate", this.taxRate);
            jSONObject.put("currencyCode", this.currencyCode);
            jSONObject.put("currency", this.currency);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public String toString() {
        JSONObject json = toJson();
        return json == null ? "" : json.toString();
    }
}
