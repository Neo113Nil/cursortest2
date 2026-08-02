package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.ironsource.X3;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class AFi1zSDK {
    public final String AFAdRevenueData;
    private final boolean getCurrencyIso4217Code;
    public final String getMediationNetwork;
    public final AFh1fSDK getMonetizationNetwork;
    public final AFh1iSDK getRevenue;

    public AFi1zSDK(String str) throws JSONException {
        AFh1fSDK aFh1fSDK;
        if (str == null) {
            throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("ver");
            this.AFAdRevenueData = string;
            this.getCurrencyIso4217Code = jSONObject.optBoolean("test_mode");
            this.getMediationNetwork = str;
            if (string.startsWith("default")) {
                aFh1fSDK = AFh1fSDK.DEFAULT;
            } else {
                aFh1fSDK = AFh1fSDK.CUSTOM;
            }
            this.getMonetizationNetwork = aFh1fSDK;
            JSONObject optJSONObject = jSONObject.optJSONObject(X3.a.v);
            this.getRevenue = optJSONObject != null ? new AFh1iSDK(optJSONObject) : null;
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("Error in RC config parsing", e);
            throw new JSONException("Failed to parse remote configuration JSON");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFi1zSDK aFi1zSDK = (AFi1zSDK) obj;
        if (this.getCurrencyIso4217Code == aFi1zSDK.getCurrencyIso4217Code && this.AFAdRevenueData.equals(aFi1zSDK.AFAdRevenueData)) {
            return this.getMediationNetwork.equals(aFi1zSDK.getMediationNetwork);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.getCurrencyIso4217Code ? 1 : 0) * 31) + this.AFAdRevenueData.hashCode()) * 31) + this.getMediationNetwork.hashCode();
        AFh1iSDK aFh1iSDK = this.getRevenue;
        return aFh1iSDK != null ? (hashCode * 31) + aFh1iSDK.hashCode() : hashCode;
    }
}
