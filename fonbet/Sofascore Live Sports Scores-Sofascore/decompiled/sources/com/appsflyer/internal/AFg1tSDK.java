package com.appsflyer.internal;

import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.AppsFlyerConversionListener;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFg1tSDK {
    public static void AFKeystoreWrapper(Map<String, Object> map, @Nullable AppsFlyerConversionListener appsFlyerConversionListener) {
        if (appsFlyerConversionListener != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.GCD;
            StringBuilder sb = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
            sb.append(map.toString());
            aFLogger.d(logTag, sb.toString());
            appsFlyerConversionListener.onConversionDataSuccess(map);
        }
    }

    public static void registerClient(String str, @Nullable AppsFlyerConversionListener appsFlyerConversionListener) {
        if (appsFlyerConversionListener != null) {
            AFLogger.INSTANCE.d(LogTag.GCD, "[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(str)));
            appsFlyerConversionListener.onConversionDataFail(str);
        }
    }
}
