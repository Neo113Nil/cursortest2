package com.appsflyer.internal;

import java.util.Map;

/* loaded from: classes7.dex */
public interface AFg1tSDK {
    long AFAdRevenueData();

    void AFAdRevenueData(AFh1tSDK aFh1tSDK);

    void AFAdRevenueData(Map<String, Object> map, int i, int i2);

    Long getCurrencyIso4217Code();

    void getCurrencyIso4217Code(AFh1tSDK aFh1tSDK);

    void getCurrencyIso4217Code(Map<String, Object> map);

    void getMediationNetwork(AFh1tSDK aFh1tSDK);

    void getMediationNetwork(Map<String, Object> map);

    void getMonetizationNetwork(AFh1tSDK aFh1tSDK);

    void getRevenue(AFh1tSDK aFh1tSDK);

    void getRevenue(Map<String, Object> map);
}
