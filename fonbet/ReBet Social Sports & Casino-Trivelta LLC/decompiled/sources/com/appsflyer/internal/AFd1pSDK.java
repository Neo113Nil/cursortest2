package com.appsflyer.internal;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFd1pSDK {
    public static boolean getCurrencyIso4217Code(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int mediationNetwork = AFk1xSDK.getMediationNetwork(str);
        int mediationNetwork2 = AFk1xSDK.getMediationNetwork(str2);
        Pair<Integer, Integer> monetizationNetwork = AFd1rSDK.getMonetizationNetwork(str2);
        Pair<Integer, Integer> AFAdRevenueData = AFd1rSDK.AFAdRevenueData(str2);
        return (mediationNetwork2 == -1 || monetizationNetwork != null) ? AFAdRevenueData != null ? AFAdRevenueData.getFirst().intValue() <= mediationNetwork && mediationNetwork <= AFAdRevenueData.getSecond().intValue() : monetizationNetwork != null && monetizationNetwork.getFirst().intValue() <= mediationNetwork && mediationNetwork <= monetizationNetwork.getSecond().intValue() : mediationNetwork2 == mediationNetwork;
    }
}
