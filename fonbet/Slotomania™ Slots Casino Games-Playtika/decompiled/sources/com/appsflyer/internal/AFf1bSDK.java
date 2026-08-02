package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class AFf1bSDK {
    public final String AFAdRevenueData;
    public final long getMediationNetwork;
    public final boolean getRevenue;

    public AFf1bSDK(String str, long j, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AFAdRevenueData = str;
        this.getMediationNetwork = j;
        this.getRevenue = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1bSDK)) {
            return false;
        }
        AFf1bSDK aFf1bSDK = (AFf1bSDK) obj;
        return Intrinsics.areEqual(this.AFAdRevenueData, aFf1bSDK.AFAdRevenueData) && this.getMediationNetwork == aFf1bSDK.getMediationNetwork && this.getRevenue == aFf1bSDK.getRevenue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = ((this.AFAdRevenueData.hashCode() * 31) + Long.hashCode(this.getMediationNetwork)) * 31;
        boolean z = this.getRevenue;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AFUninstallToken(token=" + this.AFAdRevenueData + ", receivedTime=" + this.getMediationNetwork + ", isQueued=" + this.getRevenue + ")";
    }
}
