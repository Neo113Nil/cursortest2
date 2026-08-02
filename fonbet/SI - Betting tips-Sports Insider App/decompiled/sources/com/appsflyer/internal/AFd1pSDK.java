package com.appsflyer.internal;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class AFd1pSDK {
    public static boolean getCurrencyIso4217Code(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int mediationNetwork = AFk1xSDK.getMediationNetwork(str);
        int mediationNetwork2 = AFk1xSDK.getMediationNetwork(str2);
        Pair<Integer, Integer> monetizationNetwork = AFd1rSDK.getMonetizationNetwork(str2);
        Pair<Integer, Integer> AFAdRevenueData = AFd1rSDK.AFAdRevenueData(str2);
        return (mediationNetwork2 == -1 || monetizationNetwork != null) ? AFAdRevenueData != null ? ((Number) AFAdRevenueData.f19192a).intValue() <= mediationNetwork && mediationNetwork <= ((Number) AFAdRevenueData.f19193b).intValue() : monetizationNetwork != null && ((Number) monetizationNetwork.f19192a).intValue() <= mediationNetwork && mediationNetwork <= ((Number) monetizationNetwork.f19193b).intValue() : mediationNetwork2 == mediationNetwork;
    }
}
