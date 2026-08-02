package com.appsflyer.internal;

/* loaded from: classes6.dex */
public final class AFi1xSDK {
    public final long AFAdRevenueData;
    public final String areAllFieldsValid;
    public final Throwable component1;
    public final AFi1uSDK component4;
    public final int getCurrencyIso4217Code;
    public final long getMediationNetwork;
    public final String getMonetizationNetwork;
    public final String getRevenue;

    public AFi1xSDK(String str, String str2, long j, long j2, int i, AFi1uSDK aFi1uSDK, String str3, Throwable th) {
        this.getRevenue = str;
        this.getMonetizationNetwork = str2;
        this.getMediationNetwork = j;
        this.AFAdRevenueData = j2;
        this.getCurrencyIso4217Code = i;
        this.component4 = aFi1uSDK;
        this.areAllFieldsValid = str3;
        this.component1 = th;
    }
}
