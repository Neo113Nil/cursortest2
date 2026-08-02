package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class of {
    public static final String[] gm = {"api16-access-ttp.tiktokpangle.us", "api16-access-ttp-b.tiktokpangle.us", "api16-access-ttp.tiktokpangle-b.us", "api16-access-ttp-b.tiktokpangle-b.us"};
    public static int pcc = Integer.MIN_VALUE;
    public static int sf = Integer.MIN_VALUE;

    public static void pcc(com.bytedance.sdk.component.vy.qf qfVar, String str) {
        if (TextUtils.isEmpty(str) || qfVar == null) {
            return;
        }
        try {
            JSONObject jSONObject = (JSONObject) com.bytedance.sdk.openadsdk.yt.vj.pcc("pag_additional_headers", (Object) null, com.bytedance.sdk.openadsdk.yt.sf.pcc);
            HashMap hashMap = new HashMap();
            boolean z = false;
            if (jSONObject != null) {
                z = jSONObject.optBoolean(a.k, false);
                JSONObject optJSONObject = jSONObject.optJSONObject("header_value");
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String optString = optJSONObject.optString(next);
                        if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString)) {
                            hashMap.put(next, optString);
                        }
                    }
                }
            }
            if (!z) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("Referer", TTAdConstant.REQUEST_HEAD_REFERER);
                qfVar.pcc(str, hashMap2);
            } else if (hashMap.isEmpty()) {
                qfVar.a_(str);
            } else {
                qfVar.pcc(str, hashMap);
            }
        } catch (Throwable unused) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("Referer", TTAdConstant.REQUEST_HEAD_REFERER);
            qfVar.pcc(str, hashMap3);
        }
    }

    public static synchronized void sf() {
        synchronized (of.class) {
            if (sf == 0) {
                return;
            }
            sf = 0;
            com.bytedance.sdk.openadsdk.core.ork.sf(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0016, code lost:
    
        r2 = com.bytedance.sdk.openadsdk.utils.of.pcc + 1;
        com.bytedance.sdk.openadsdk.utils.of.pcc = r2;
        com.bytedance.sdk.openadsdk.core.ork.pcc(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:16:0x0028, B:18:0x0030, B:23:0x003b, B:25:0x0041, B:26:0x0047, B:28:0x004e, B:29:0x006b, B:34:0x0025, B:9:0x0009, B:11:0x000e, B:15:0x0016), top: B:8:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:16:0x0028, B:18:0x0030, B:23:0x003b, B:25:0x0041, B:26:0x0047, B:28:0x004e, B:29:0x006b, B:34:0x0025, B:9:0x0009, B:11:0x000e, B:15:0x0016), top: B:8:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:16:0x0028, B:18:0x0030, B:23:0x003b, B:25:0x0041, B:26:0x0047, B:28:0x004e, B:29:0x006b, B:34:0x0025, B:9:0x0009, B:11:0x000e, B:15:0x0016), top: B:8:0x0009, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized void pcc(String str) {
        int i;
        int i2;
        synchronized (of.class) {
            if (str == null) {
                return;
            }
            int i3 = 0;
            while (true) {
                try {
                    try {
                        String[] strArr = gm;
                        if (i3 >= strArr.length) {
                            break;
                        } else if (str.contains(strArr[i3])) {
                            break;
                        } else {
                            i3++;
                        }
                    } finally {
                        if (!str.contains("/api/ad/union/sdk/settings/")) {
                        }
                        i = sf;
                        if (i == Integer.MIN_VALUE) {
                        }
                        i2 = i + 1;
                        sf = i2;
                        if (i2 >= 3) {
                        }
                        com.bytedance.sdk.openadsdk.core.ork.sf(sf);
                    }
                } catch (Throwable th) {
                }
            }
            if (!str.contains("/api/ad/union/sdk/settings/")) {
                if (!str.contains("/api/ad/union/sdk/strategies/adn")) {
                }
            }
            i = sf;
            if (i == Integer.MIN_VALUE) {
                i = com.bytedance.sdk.openadsdk.core.ork.wh();
                sf = i;
            }
            i2 = i + 1;
            sf = i2;
            if (i2 >= 3) {
                final String kun = com.bytedance.sdk.openadsdk.core.settings.vh.sf().kun();
                final int i4 = sf;
                com.bytedance.sdk.openadsdk.core.settings.vh.sf().jy();
                sf = 0;
                com.bytedance.sdk.openadsdk.dax.oo.pcc("clear_domain", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.utils.of.1
                    @Override // com.bytedance.sdk.openadsdk.dax.sf
                    public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put(U3.j.D, kun);
                            jSONObject.put("times", i4);
                        } catch (Exception unused) {
                        }
                        return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("clear_domain").sf(jSONObject.toString());
                    }
                });
            }
            com.bytedance.sdk.openadsdk.core.ork.sf(sf);
        }
    }

    public static String pcc() {
        int i = pcc;
        if (i == Integer.MIN_VALUE) {
            i = com.bytedance.sdk.openadsdk.core.ork.vj();
            pcc = i;
        }
        if (i < 0) {
            pcc = 0;
            i = 0;
        }
        String[] strArr = gm;
        try {
            return strArr[i % strArr.length];
        } catch (Throwable unused) {
            return strArr[0];
        }
    }
}
