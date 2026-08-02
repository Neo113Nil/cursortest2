package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class AFb1hSDK {
    public static void getMediationNetwork(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("appsflyerKey")) {
                    String string = jSONObject.getString("appsflyerKey");
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < string.length(); i++) {
                        if (i != 0 && i != string.length() - 1) {
                            sb.append("*");
                        }
                        sb.append(string.charAt(i));
                    }
                    jSONObject.put("appsflyerKey", sb.toString());
                }
                if (jSONObject.has("tcstring")) {
                    jSONObject.put("tcstring", "tcstring");
                }
                if (jSONObject.has("referrer")) {
                    jSONObject.put("referrer", "referrer");
                }
                if (jSONObject.has("pia_token")) {
                    jSONObject.put("pia_token", "pia_token");
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1xSDK aFh1xSDK = AFh1xSDK.OTHER;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(jSONObject);
                aFLogger.i(aFh1xSDK, sb2.toString());
            } catch (JSONException e) {
                AFLogger.INSTANCE.e(AFh1xSDK.OTHER, "Not able to log the payload", e);
            }
        }
    }
}
