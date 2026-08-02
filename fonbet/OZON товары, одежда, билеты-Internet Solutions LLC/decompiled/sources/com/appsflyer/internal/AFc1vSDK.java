package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFc1vSDK {
    static JSONObject values(String str) {
        JSONObject values = AFa1qSDK.values(str);
        if (values != null) {
            try {
                if (values.has("ol_id")) {
                    String optString = values.optString("ol_scheme", null);
                    String optString2 = values.optString("ol_domain", null);
                    String optString3 = values.optString("ol_ver", null);
                    if (optString != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_SCHEME, optString);
                    }
                    if (optString2 != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_DOMAIN, optString2);
                    }
                    if (optString3 != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_VERSION, optString3);
                        return values;
                    }
                }
            } catch (Throwable th2) {
                StringBuilder sb2 = new StringBuilder("Error in handleResponse: ");
                sb2.append(th2.getMessage());
                AFLogger.afErrorLogForExcManagerOnly(sb2.toString(), th2);
                AFb1tSDK.valueOf().values().i().AFInAppEventType();
                AFb1tSDK.valueOf().values().i().AFKeystoreWrapper();
            }
        }
        return values;
    }
}
