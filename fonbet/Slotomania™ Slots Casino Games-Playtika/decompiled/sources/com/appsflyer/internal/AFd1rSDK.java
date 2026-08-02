package com.appsflyer.internal;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AFd1rSDK {
    public static boolean AFAdRevenueData(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int currencyIso4217Code = AFj1cSDK.getCurrencyIso4217Code(str);
        int currencyIso4217Code2 = AFj1cSDK.getCurrencyIso4217Code(str2);
        Pair<Integer, Integer> revenue = AFd1pSDK.getRevenue(str2);
        Pair<Integer, Integer> currencyIso4217Code3 = AFd1pSDK.getCurrencyIso4217Code(str2);
        return (currencyIso4217Code2 == -1 || revenue != null) ? currencyIso4217Code3 != null ? currencyIso4217Code3.getFirst().intValue() <= currencyIso4217Code && currencyIso4217Code <= currencyIso4217Code3.getSecond().intValue() : revenue != null && revenue.getFirst().intValue() <= currencyIso4217Code && currencyIso4217Code <= revenue.getSecond().intValue() : currencyIso4217Code2 == currencyIso4217Code;
    }
}
