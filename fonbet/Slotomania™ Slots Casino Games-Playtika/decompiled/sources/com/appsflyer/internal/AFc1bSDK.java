package com.appsflyer.internal;

/* loaded from: classes3.dex */
public interface AFc1bSDK {

    public interface AFa1vSDK {
        void onConfigurationChanged(boolean z);
    }

    void getCurrencyIso4217Code();

    void getMediationNetwork();

    void getMediationNetwork(AFa1vSDK aFa1vSDK);

    void getRevenue(Throwable th, String str);
}
