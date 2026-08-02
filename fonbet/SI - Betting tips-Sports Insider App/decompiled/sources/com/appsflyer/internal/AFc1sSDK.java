package com.appsflyer.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class AFc1sSDK {

    @NotNull
    final String AFAdRevenueData;

    @NotNull
    final List<AFe1pSDK> getMediationNetwork;
    final int getMonetizationNetwork;

    /* JADX WARN: Multi-variable type inference failed */
    public AFc1sSDK(@NotNull String str, @NotNull List<? extends AFe1pSDK> list, int i5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AFAdRevenueData = str;
        this.getMediationNetwork = list;
        this.getMonetizationNetwork = i5;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1sSDK)) {
            return false;
        }
        AFc1sSDK aFc1sSDK = (AFc1sSDK) obj;
        return Intrinsics.areEqual(this.AFAdRevenueData, aFc1sSDK.AFAdRevenueData) && Intrinsics.areEqual(this.getMediationNetwork, aFc1sSDK.getMediationNetwork) && this.getMonetizationNetwork == aFc1sSDK.getMonetizationNetwork;
    }

    public final int hashCode() {
        return ((this.getMediationNetwork.hashCode() + (this.AFAdRevenueData.hashCode() * 31)) * 31) + this.getMonetizationNetwork;
    }

    @NotNull
    public final String toString() {
        String str = this.AFAdRevenueData;
        List<AFe1pSDK> list = this.getMediationNetwork;
        int i5 = this.getMonetizationNetwork;
        StringBuilder sb2 = new StringBuilder("StorageConfigTypeEntry(cacheDirName=");
        sb2.append(str);
        sb2.append(", eventTypes=");
        sb2.append(list);
        sb2.append(", maxCapacity=");
        return r4.k.n(sb2, i5, ")");
    }
}
