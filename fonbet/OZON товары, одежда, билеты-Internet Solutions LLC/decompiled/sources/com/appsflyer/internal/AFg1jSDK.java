package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFg1jSDK {
    static void AFInAppEventParameterName(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1tSDK.valueOf().AFInAppEventType;
        if (appsFlyerConversionListener != null) {
            AFLogger.afDebugLog("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(str)));
            appsFlyerConversionListener.onConversionDataFail(str);
        }
    }

    static void AFInAppEventType(Map<String, Object> map) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1tSDK.valueOf().AFInAppEventType;
        if (appsFlyerConversionListener != null) {
            StringBuilder sb2 = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
            sb2.append(map.toString());
            AFLogger.afDebugLog(sb2.toString());
            appsFlyerConversionListener.onConversionDataSuccess(map);
        }
    }
}
