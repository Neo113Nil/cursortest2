package com.appsflyer.internal;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AFe1wSDK {
    public static boolean getRevenue(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int AFAdRevenueData = AFc1tSDK.AFAdRevenueData(str);
        int AFAdRevenueData2 = AFc1tSDK.AFAdRevenueData(str2);
        Pair<Integer, Integer> monetizationNetwork = AFe1ySDK.getMonetizationNetwork(str2);
        Pair<Integer, Integer> currencyIso4217Code = AFe1ySDK.getCurrencyIso4217Code(str2);
        return (AFAdRevenueData2 == -1 || monetizationNetwork != null) ? currencyIso4217Code != null ? currencyIso4217Code.getFirst().intValue() <= AFAdRevenueData && AFAdRevenueData <= currencyIso4217Code.getSecond().intValue() : monetizationNetwork != null && monetizationNetwork.getFirst().intValue() <= AFAdRevenueData && AFAdRevenueData <= monetizationNetwork.getSecond().intValue() : AFAdRevenueData2 == AFAdRevenueData;
    }
}
