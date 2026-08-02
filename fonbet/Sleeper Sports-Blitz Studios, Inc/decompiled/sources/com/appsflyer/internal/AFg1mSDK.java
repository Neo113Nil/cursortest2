package com.appsflyer.internal;

/* loaded from: classes6.dex */
public final class AFg1mSDK {
    public final long AFAdRevenueData;
    private final boolean getCurrencyIso4217Code;
    public final String getRevenue;

    public AFg1mSDK(String str, long j, boolean z) {
        this.getRevenue = str;
        this.AFAdRevenueData = j;
        this.getCurrencyIso4217Code = z;
    }

    public final boolean getMonetizationNetwork() {
        return this.getCurrencyIso4217Code;
    }
}
