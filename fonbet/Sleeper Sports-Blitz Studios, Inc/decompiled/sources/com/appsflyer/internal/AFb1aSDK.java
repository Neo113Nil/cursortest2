package com.appsflyer.internal;

import android.content.pm.PackageManager;

/* loaded from: classes6.dex */
public interface AFb1aSDK {
    void AFAdRevenueData();

    void AFAdRevenueData(String str, int i, String str2);

    void AFAdRevenueData(String str, String str2);

    boolean component2();

    void getCurrencyIso4217Code();

    void getCurrencyIso4217Code(Throwable th);

    void getMediationNetwork();

    void getMediationNetwork(String str, String... strArr);

    void getMonetizationNetwork();

    void getRevenue(String str, String str2);

    boolean getRevenue();

    void k_(String str, PackageManager packageManager);
}
