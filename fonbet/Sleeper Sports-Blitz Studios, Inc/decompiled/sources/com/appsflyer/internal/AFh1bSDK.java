package com.appsflyer.internal;

import expo.modules.kotlin.activityresult.DataPersistorKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class AFh1bSDK {
    public final String AFAdRevenueData;
    public final long getCurrencyIso4217Code;
    public final int getMonetizationNetwork;
    public final int getRevenue;

    public AFh1bSDK(String str, int i, int i2, long j) {
        this.AFAdRevenueData = str;
        this.getRevenue = i;
        this.getMonetizationNetwork = i2;
        this.getCurrencyIso4217Code = j;
    }

    public final String getMonetizationNetwork() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_ver", this.AFAdRevenueData);
            jSONObject.put("min", this.getRevenue);
            jSONObject.put(DataPersistorKt.EXPIRE_KEY, this.getMonetizationNetwork);
            jSONObject.put("ttl", this.getCurrencyIso4217Code);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final int hashCode() {
        String str = this.AFAdRevenueData;
        return ((((((str != null ? str.hashCode() : 0) * 31) + this.getRevenue) * 31) + this.getMonetizationNetwork) * 31) + ((int) this.getCurrencyIso4217Code);
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AFh1bSDK aFh1bSDK = (AFh1bSDK) obj;
            if (this.getRevenue == aFh1bSDK.getRevenue && this.getMonetizationNetwork == aFh1bSDK.getMonetizationNetwork && this.getCurrencyIso4217Code == aFh1bSDK.getCurrencyIso4217Code && (str = this.AFAdRevenueData) != null && str.equals(aFh1bSDK.AFAdRevenueData)) {
                return true;
            }
        }
        return false;
    }
}
