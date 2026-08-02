package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import java.util.Map;

/* loaded from: classes6.dex */
public final class AFg1bSDK {
    static void getCurrencyIso4217Code(Map<String, Object> map) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1rSDK.getRevenue().getRevenue;
        if (appsFlyerConversionListener != null) {
            StringBuilder sb = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
            sb.append(map.toString());
            AFLogger.afDebugLog(sb.toString());
            appsFlyerConversionListener.onConversionDataSuccess(map);
        }
    }

    static void getCurrencyIso4217Code(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1rSDK.getRevenue().getRevenue;
        if (appsFlyerConversionListener != null) {
            AFLogger.afDebugLog("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(str)));
            appsFlyerConversionListener.onConversionDataFail(str);
        }
    }
}
