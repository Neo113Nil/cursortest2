package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import java.util.Map;

/* loaded from: classes8.dex */
public final class AFg1pSDK {
    static void getMediationNetwork(Map<String, Object> map) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1zSDK.getMonetizationNetwork().getRevenue;
        if (appsFlyerConversionListener != null) {
            AFLogger.afDebugLog(new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n").append(map.toString()).toString());
            appsFlyerConversionListener.onConversionDataSuccess(map);
        }
    }

    static void getMonetizationNetwork(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1zSDK.getMonetizationNetwork().getRevenue;
        if (appsFlyerConversionListener != null) {
            AFLogger.afDebugLog("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(str)));
            appsFlyerConversionListener.onConversionDataFail(str);
        }
    }
}
