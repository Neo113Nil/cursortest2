package com.appsflyer.internal;

import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFg1kSDK {
    public static void AFKeystoreWrapper(String str, @Nullable JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("appsflyerKey")) {
                    jSONObject.put("appsflyerKey", d(jSONObject.getString("appsflyerKey")));
                }
                if (jSONObject.has("tcstring")) {
                    jSONObject.put("tcstring", unregisterClient("tcstring"));
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                LogTag logTag = LogTag.OTHER;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(jSONObject);
                aFLogger.i(logTag, sb.toString());
            } catch (JSONException e) {
                AFLogger.INSTANCE.e(LogTag.OTHER, "Not able to log the payload", e);
            }
        }
    }

    private static String d(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == str.length() - 1) {
                sb.append(str.charAt(i));
            } else {
                sb.append("*");
            }
        }
        return sb.toString();
    }

    public static String unregisterClient(String str) {
        return str.length() > 20 ? str.substring(0, 10).concat("...") : str;
    }
}
