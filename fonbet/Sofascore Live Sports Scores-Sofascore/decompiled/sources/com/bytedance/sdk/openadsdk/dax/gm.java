package com.bytedance.sdk.openadsdk.dax;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.yt.vj;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm {
    private static volatile boolean gm;
    private static volatile boolean vj;
    private static final HashMap<String, Integer> pcc = new HashMap<>();
    private static volatile int sf = 10000;
    private static volatile boolean oo = true;

    public static void pcc() {
        String pcc2 = vj.pcc("stats_control", "");
        if (!TextUtils.isEmpty(pcc2)) {
            try {
                JSONObject jSONObject = new JSONObject(pcc2);
                sf = jSONObject.optInt("sampling_def", 10000);
                String optString = jSONObject.optString("sampling");
                if (!TextUtils.isEmpty(optString)) {
                    JSONObject jSONObject2 = new JSONObject(optString);
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        pcc.put(next, Integer.valueOf(jSONObject2.optInt(next, sf)));
                    }
                }
            } catch (Exception unused) {
            }
        }
        oo = false;
        gm = false;
        if (sf == 10000 && pcc.isEmpty()) {
            oo = true;
        } else if (sf == 0 && pcc.isEmpty()) {
            gm = true;
        }
        vj = true;
    }

    public static int sf(String str, int i) {
        if (gm) {
            return 0;
        }
        if (!vj) {
            return i;
        }
        Integer num = pcc.get(str);
        if (num == null) {
            num = Integer.valueOf(i);
        }
        return num.intValue();
    }

    public static boolean sf() {
        return gm;
    }

    public static boolean pcc(String str, int i) {
        if (oo || !vj) {
            return true;
        }
        if (gm) {
            return false;
        }
        if (i < 0) {
            i = sf;
        }
        Integer num = pcc.get(str);
        if (num == null) {
            num = Integer.valueOf(i);
        }
        if (num.intValue() <= 0) {
            return false;
        }
        return num.intValue() >= 10000 || ((int) ((Math.random() * 10000.0d) + 1.0d)) <= num.intValue();
    }
}
