package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AFi1gSDK {
    public final String getCurrencyIso4217Code;
    public final String getMediationNetwork;
    public final long getMonetizationNetwork;
    public final long getRevenue;

    public AFi1gSDK(long j, long j2, String str, String str2) {
        this.getMonetizationNetwork = j;
        this.getRevenue = j2;
        this.getCurrencyIso4217Code = str;
        this.getMediationNetwork = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFi1gSDK)) {
            return false;
        }
        AFi1gSDK aFi1gSDK = (AFi1gSDK) obj;
        return this.getMonetizationNetwork == aFi1gSDK.getMonetizationNetwork && this.getRevenue == aFi1gSDK.getRevenue && Intrinsics.areEqual(this.getCurrencyIso4217Code, aFi1gSDK.getCurrencyIso4217Code) && Intrinsics.areEqual(this.getMediationNetwork, aFi1gSDK.getMediationNetwork);
    }

    public final int hashCode() {
        int hashCode = ((Long.hashCode(this.getMonetizationNetwork) * 31) + Long.hashCode(this.getRevenue)) * 31;
        String str = this.getCurrencyIso4217Code;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.getMediationNetwork;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "PlayIntegrityApiData(piaTimestamp=" + this.getMonetizationNetwork + ", ttrMillis=" + this.getRevenue + ", piaToken=" + this.getCurrencyIso4217Code + ", errorCode=" + this.getMediationNetwork + ")";
    }
}
