package com.appsflyer.internal;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class AFi1wSDK {
    public final String AFAdRevenueData;
    public final AFi1ySDK areAllFieldsValid;
    public final Throwable component1;
    public final String component2;
    public final long getCurrencyIso4217Code;
    public final int getMediationNetwork;

    @NonNull
    public final String getMonetizationNetwork;
    public final long getRevenue;

    public AFi1wSDK(String str, @NonNull String str2, long j, long j6, int i5, AFi1ySDK aFi1ySDK, String str3, Throwable th2) {
        this.AFAdRevenueData = str;
        this.getMonetizationNetwork = str2;
        this.getCurrencyIso4217Code = j;
        this.getRevenue = j6;
        this.getMediationNetwork = i5;
        this.areAllFieldsValid = aFi1ySDK;
        this.component2 = str3;
        this.component1 = th2;
    }
}
