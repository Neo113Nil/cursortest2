package com.ironsource;

import com.ironsource.C4197m8;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class V9 {
    static String a = "ManRewInst_";

    public static String a(JSONObject jSONObject) {
        if (!jSONObject.optBoolean("rewarded")) {
            return jSONObject.optString("name");
        }
        return a + jSONObject.optString("name");
    }

    public static String b() {
        return UUID.randomUUID().toString();
    }

    public static String a() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static String a(J9 j9) {
        if (j9.i()) {
            return C4197m8.e.Banner.toString();
        }
        if (j9.n()) {
            return C4197m8.e.RewardedVideo.toString();
        }
        return C4197m8.e.Interstitial.toString();
    }
}
