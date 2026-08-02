package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;

/* loaded from: classes6.dex */
public final class AFd1sSDK implements AFd1pSDK {
    private final SharedPreferences getCurrencyIso4217Code;

    public AFd1sSDK(SharedPreferences sharedPreferences) {
        this.getCurrencyIso4217Code = sharedPreferences;
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getMonetizationNetwork(String str, String str2) {
        this.getCurrencyIso4217Code.edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final String AFAdRevenueData(String str, String str2) {
        try {
            return this.getCurrencyIso4217Code.getString(str, str2);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final boolean AFAdRevenueData(String str) {
        try {
            return this.getCurrencyIso4217Code.getBoolean(str, false);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getMediationNetwork(String str, boolean z) {
        this.getCurrencyIso4217Code.edit().putBoolean(str, z).apply();
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final long getRevenue(String str, long j) {
        try {
            return this.getCurrencyIso4217Code.getLong(str, j);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return j;
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void AFAdRevenueData(String str, long j) {
        this.getCurrencyIso4217Code.edit().putLong(str, j).apply();
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getRevenue(String str, int i) {
        this.getCurrencyIso4217Code.edit().putInt(str, i).apply();
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final int AFAdRevenueData(String str, int i) {
        try {
            return this.getCurrencyIso4217Code.getInt(str, i);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return i;
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final boolean getMonetizationNetwork(String str) {
        return this.getCurrencyIso4217Code.contains(str);
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getMediationNetwork(String str) {
        this.getCurrencyIso4217Code.edit().remove(str).apply();
    }
}
