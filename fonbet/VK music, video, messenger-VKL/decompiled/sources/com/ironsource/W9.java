package com.ironsource;

import com.ironsource.C4492p8;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class W9 {
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

    public static String a(K9 k9) {
        if (k9.i()) {
            return C4492p8.e.Banner.toString();
        }
        if (k9.n()) {
            return C4492p8.e.RewardedVideo.toString();
        }
        return C4492p8.e.Interstitial.toString();
    }
}
