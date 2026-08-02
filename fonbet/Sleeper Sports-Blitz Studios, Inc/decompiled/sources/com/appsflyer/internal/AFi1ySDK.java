package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class AFi1ySDK {
    public final AFh1aSDK AFAdRevenueData;
    public final String getCurrencyIso4217Code;
    private final boolean getMediationNetwork;
    public final String getMonetizationNetwork;
    public final AFh1dSDK getRevenue;

    public AFi1ySDK(String str) throws JSONException {
        AFh1aSDK aFh1aSDK;
        if (str == null) {
            throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("ver");
            this.getCurrencyIso4217Code = string;
            this.getMediationNetwork = jSONObject.optBoolean("test_mode");
            this.getMonetizationNetwork = str;
            if (string.startsWith("default")) {
                aFh1aSDK = AFh1aSDK.DEFAULT;
            } else {
                aFh1aSDK = AFh1aSDK.CUSTOM;
            }
            this.AFAdRevenueData = aFh1aSDK;
            JSONObject optJSONObject = jSONObject.optJSONObject("features");
            this.getRevenue = optJSONObject != null ? new AFh1dSDK(optJSONObject) : null;
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
        AFi1ySDK aFi1ySDK = (AFi1ySDK) obj;
        if (this.getMediationNetwork == aFi1ySDK.getMediationNetwork && this.getCurrencyIso4217Code.equals(aFi1ySDK.getCurrencyIso4217Code)) {
            return this.getMonetizationNetwork.equals(aFi1ySDK.getMonetizationNetwork);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.getMediationNetwork ? 1 : 0) * 31) + this.getCurrencyIso4217Code.hashCode()) * 31) + this.getMonetizationNetwork.hashCode();
        AFh1dSDK aFh1dSDK = this.getRevenue;
        return aFh1dSDK != null ? (hashCode * 31) + aFh1dSDK.hashCode() : hashCode;
    }
}
