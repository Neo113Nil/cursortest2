package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class AFf1bSDK {
    final int AFAdRevenueData;
    final int getCurrencyIso4217Code;
    final int getMediationNetwork;

    @NotNull
    final String getMonetizationNetwork;
    final int getRevenue;

    public AFf1bSDK(int i5, int i10, int i11, int i12, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getCurrencyIso4217Code = i5;
        this.getMediationNetwork = i10;
        this.AFAdRevenueData = i11;
        this.getRevenue = i12;
        this.getMonetizationNetwork = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1bSDK)) {
            return false;
        }
        AFf1bSDK aFf1bSDK = (AFf1bSDK) obj;
        return this.getCurrencyIso4217Code == aFf1bSDK.getCurrencyIso4217Code && this.getMediationNetwork == aFf1bSDK.getMediationNetwork && this.AFAdRevenueData == aFf1bSDK.AFAdRevenueData && this.getRevenue == aFf1bSDK.getRevenue && Intrinsics.areEqual(this.getMonetizationNetwork, aFf1bSDK.getMonetizationNetwork);
    }

    public final int hashCode() {
        return this.getMonetizationNetwork.hashCode() + (((((((this.getCurrencyIso4217Code * 31) + this.getMediationNetwork) * 31) + this.AFAdRevenueData) * 31) + this.getRevenue) * 31);
    }

    @NotNull
    public final String toString() {
        int i5 = this.getCurrencyIso4217Code;
        int i10 = this.getMediationNetwork;
        int i11 = this.AFAdRevenueData;
        int i12 = this.getRevenue;
        String str = this.getMonetizationNetwork;
        StringBuilder sb2 = new StringBuilder("CmpTcfData(policyVersion=");
        sb2.append(i5);
        sb2.append(", gdprApplies=");
        sb2.append(i10);
        sb2.append(", cmpSdkId=");
        sb2.append(i11);
        sb2.append(", cmpSdkVersion=");
        sb2.append(i12);
        sb2.append(", tcString=");
        return d9.e.l(sb2, str, ")");
    }
}
