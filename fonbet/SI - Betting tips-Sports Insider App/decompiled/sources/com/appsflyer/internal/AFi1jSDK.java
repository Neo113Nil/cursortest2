package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class AFi1jSDK {

    @Nullable
    public final String AFAdRevenueData;
    public final long getCurrencyIso4217Code;
    public final long getMediationNetwork;

    @Nullable
    public final String getRevenue;

    public AFi1jSDK(long j, long j6, @Nullable String str, @Nullable String str2) {
        this.getMediationNetwork = j;
        this.getCurrencyIso4217Code = j6;
        this.getRevenue = str;
        this.AFAdRevenueData = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFi1jSDK)) {
            return false;
        }
        AFi1jSDK aFi1jSDK = (AFi1jSDK) obj;
        return this.getMediationNetwork == aFi1jSDK.getMediationNetwork && this.getCurrencyIso4217Code == aFi1jSDK.getCurrencyIso4217Code && Intrinsics.areEqual(this.getRevenue, aFi1jSDK.getRevenue) && Intrinsics.areEqual(this.AFAdRevenueData, aFi1jSDK.AFAdRevenueData);
    }

    public final int hashCode() {
        long j = this.getMediationNetwork;
        long j6 = this.getCurrencyIso4217Code;
        int i5 = ((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j6 >>> 32) ^ j6))) * 31;
        String str = this.getRevenue;
        int hashCode = (i5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.AFAdRevenueData;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        long j = this.getMediationNetwork;
        long j6 = this.getCurrencyIso4217Code;
        String str = this.getRevenue;
        String str2 = this.AFAdRevenueData;
        StringBuilder p10 = r4.k.p(j, "PlayIntegrityApiData(piaTimestamp=", ", ttrMillis=");
        p10.append(j6);
        p10.append(", piaToken=");
        p10.append(str);
        return d9.e.m(p10, ", errorCode=", str2, ")");
    }
}
