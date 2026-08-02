package com.appsflyer.internal;

import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.sdk_base.logger.LogTag;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFa1oSDK {
    @Nullable
    public static JSONObject registerClient(String str, AppsFlyerProperties appsFlyerProperties) {
        JSONObject d = AFg1nSDK.d(str);
        if (d != null) {
            try {
                if (d.has("ol_id")) {
                    String optString = d.optString("ol_scheme", null);
                    String optString2 = d.optString("ol_domain", null);
                    String optString3 = d.optString("ol_ver", null);
                    if (optString != null) {
                        appsFlyerProperties.set(AppsFlyerProperties.ONELINK_SCHEME, optString);
                    }
                    if (optString2 != null) {
                        appsFlyerProperties.set(AppsFlyerProperties.ONELINK_DOMAIN, optString2);
                    }
                    if (optString3 != null) {
                        appsFlyerProperties.set(AppsFlyerProperties.ONELINK_VERSION, optString3);
                        return d;
                    }
                }
            } catch (Throwable th) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                LogTag logTag = LogTag.GENERAL;
                StringBuilder sb = new StringBuilder("Error in handleResponse: ");
                sb.append(th.getMessage());
                aFLogger.e(logTag, sb.toString(), th, false, false);
                AFa1zSDK.d().AFKeystoreWrapper.AFLoggerLogLevel().registerClient();
                AFa1zSDK.d().AFKeystoreWrapper.AFLoggerLogLevel().d();
            }
        }
        return d;
    }
}
