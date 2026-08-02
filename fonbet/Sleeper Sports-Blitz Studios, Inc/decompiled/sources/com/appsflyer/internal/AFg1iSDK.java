package com.appsflyer.internal;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public interface AFg1iSDK {
    void AFAdRevenueData(Map<String, Object> map);

    Long getCurrencyIso4217Code();

    void getCurrencyIso4217Code(AFa1mSDK aFa1mSDK);

    void getMediationNetwork(AFa1mSDK aFa1mSDK);

    void getMediationNetwork(Map<String, Object> map);

    void getMonetizationNetwork(AFa1mSDK aFa1mSDK);

    void getMonetizationNetwork(Map<String, Object> map);

    void getMonetizationNetwork(Map<String, Object> map, boolean z, Function0<String> function0);

    long getRevenue();

    void getRevenue(AFa1mSDK aFa1mSDK);

    void getRevenue(Map<String, Object> map, int i, int i2);
}
