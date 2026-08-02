package com.ironsource;

import com.ironsource.C2578o8;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class V9 {
    static String a = "ManRewInst_";

    public static String a(JSONObject jSONObject) {
        return jSONObject.optBoolean("rewarded") ? a + jSONObject.optString("name") : jSONObject.optString("name");
    }

    public static String b() {
        return UUID.randomUUID().toString();
    }

    public static String a() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static String a(J9 j9) {
        if (j9.i()) {
            return C2578o8.e.Banner.toString();
        }
        if (j9.n()) {
            return C2578o8.e.RewardedVideo.toString();
        }
        return C2578o8.e.Interstitial.toString();
    }
}
