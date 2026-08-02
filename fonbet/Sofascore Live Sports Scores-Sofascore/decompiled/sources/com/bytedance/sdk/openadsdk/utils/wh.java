package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.ironsource.U3;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh {
    public static String pcc(String str) {
        if (!com.bytedance.sdk.component.utils.jr.gm() || TextUtils.isEmpty(str)) {
            return str;
        }
        com.bytedance.sdk.openadsdk.core.model.ork orkVar = new com.bytedance.sdk.openadsdk.core.model.ork(com.bytedance.sdk.openadsdk.core.ork.sf().tmg());
        StringBuilder sb = new StringBuilder(str);
        Iterator<String> it = orkVar.sf().iterator();
        while (it.hasNext()) {
            if (sb.toString().contains(it.next())) {
                if (sb.toString().contains("?")) {
                    sb.append(U3.j.c);
                    sb.append(orkVar.pcc());
                } else {
                    sb.append("?");
                    sb.append(orkVar.pcc());
                }
            }
        }
        return sb.toString();
    }
}
