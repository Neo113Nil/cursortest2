package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.C4324ta;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class nn {
    private static String pcc;

    public static boolean gm() {
        return false;
    }

    public static String pcc(String str) {
        try {
            if (!pcc()) {
                return str;
            }
            String lu = com.bytedance.sdk.openadsdk.core.ork.sf().lu();
            if (TextUtils.isEmpty(lu)) {
                return str;
            }
            "AnyDoorId=".concat(String.valueOf(lu));
            return Uri.parse(str).buildUpon().appendQueryParameter(sf(), lu).appendQueryParameter(C4324ta.b, "5001121").toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    public static String sf() {
        if (TextUtils.isEmpty(pcc)) {
            pcc = new String(Base64.decode("ZGV2aWNlX2lk", 0));
        }
        return pcc;
    }

    public static boolean pcc() {
        return com.bytedance.sdk.component.utils.jr.gm() && com.bytedance.sdk.openadsdk.core.ork.sf().jr() && com.bytedance.sdk.openadsdk.core.ork.sf().nac();
    }
}
