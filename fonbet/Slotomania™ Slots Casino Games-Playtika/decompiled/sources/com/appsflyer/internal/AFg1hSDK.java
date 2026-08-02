package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class AFg1hSDK {
    private static String AFAdRevenueData(String str) {
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

    public static void getRevenue(String str, JSONObject jSONObject) {
        String str2;
        if (jSONObject != null) {
            try {
                if (jSONObject.has("appsflyerKey")) {
                    jSONObject.put("appsflyerKey", AFAdRevenueData(jSONObject.getString("appsflyerKey")));
                }
                if (jSONObject.has("tcstring")) {
                    jSONObject.put("tcstring", "tcstring".length() > 20 ? "tcstring".substring(0, 10) : "tcstring");
                }
                if (jSONObject.has("referrer")) {
                    jSONObject.put("referrer", "referrer".length() > 20 ? "referrer".substring(0, 10) : "referrer");
                }
                if (jSONObject.has("pia_token")) {
                    if ("pia_token".length() <= 20) {
                        str2 = "pia_token";
                    } else {
                        str2 = "pia_token".substring(0, 10);
                    }
                    jSONObject.put("pia_token", str2);
                }
                AFLogger.INSTANCE.i(AFh1zSDK.OTHER, new StringBuilder().append(str).append(jSONObject).toString());
            } catch (JSONException e) {
                AFLogger.INSTANCE.e(AFh1zSDK.OTHER, "Not able to log the payload", e);
            }
        }
    }
}
