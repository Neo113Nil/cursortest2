package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AFi1pSDK {
    public final String AFAdRevenueData;
    public final String getMediationNetwork;
    public final String getMonetizationNetwork;
    private final boolean getRevenue;

    public AFi1pSDK(String str, String str2, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getMonetizationNetwork = str;
        this.getMediationNetwork = str2;
        this.AFAdRevenueData = str3;
        this.getRevenue = z;
    }

    public final boolean getMonetizationNetwork() {
        return this.getRevenue;
    }
}
