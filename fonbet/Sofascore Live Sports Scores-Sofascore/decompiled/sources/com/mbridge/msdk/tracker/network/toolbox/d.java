package com.mbridge.msdk.tracker.network.toolbox;

import android.text.TextUtils;
import com.mbridge.msdk.tracker.network.t;
import defpackage.mz1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class d {
    public static String a(String str, t<?> tVar) {
        if (TextUtils.isEmpty(str) || tVar == null) {
            return "";
        }
        byte[] b = tVar.b();
        if (b == null || b.length == 0) {
            return str;
        }
        if (str.endsWith("?")) {
            return str.concat(new String(b));
        }
        StringBuilder r = mz1.r(str, "?");
        r.append(new String(b));
        return r.toString();
    }
}
