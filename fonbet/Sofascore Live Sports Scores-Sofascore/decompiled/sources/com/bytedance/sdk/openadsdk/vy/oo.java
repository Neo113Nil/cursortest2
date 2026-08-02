package com.bytedance.sdk.openadsdk.vy;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.utils.nn;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class oo extends pcc {
    public static gm pcc;

    public static String pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, String str) {
        gm pcc2;
        Map map;
        if (!nn.gm() || (pcc2 = sf.pcc("net")) == null || (map = (Map) pcc2.pcc(1, str)) == null) {
            return str;
        }
        String str2 = (String) map.get("url");
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        Map map2 = (Map) map.get("header");
        if (map2 != null) {
            for (String str3 : map2.keySet()) {
                gmVar.sf(str3, (String) map2.get(str3));
            }
        }
        return str;
    }
}
