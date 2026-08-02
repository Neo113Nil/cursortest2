package com.appsflyer.internal;

import android.content.pm.PackageManager;

/* loaded from: classes5.dex */
public interface AFd1sSDK {
    void AFAdRevenueData();

    void AFAdRevenueData(String str, String... strArr);

    void AFAdRevenueData(Throwable th);

    boolean areAllFieldsValid();

    void getCurrencyIso4217Code(String str, String str2);

    boolean getCurrencyIso4217Code();

    void getMediationNetwork();

    void getMonetizationNetwork();

    void getMonetizationNetwork(String str, int i, String str2);

    void getMonetizationNetwork(String str, String str2);

    void getRevenue();

    void o_(String str, PackageManager packageManager);
}
