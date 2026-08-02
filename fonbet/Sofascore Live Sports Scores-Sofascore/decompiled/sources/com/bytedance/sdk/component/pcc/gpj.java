package com.bytedance.sdk.component.pcc;

import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import defpackage.fc6;
import defpackage.wv8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
class gpj {
    private static boolean pcc;

    public static String pcc(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        String h = (!pcc || z) ? "" : wv8.h(1, 1, str);
        String concat = "{\"code\":1,\"__data\":".concat(String.valueOf(str));
        return !h.isEmpty() ? fc6.n(concat, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, h, "}") : concat.concat("}");
    }

    public static String pcc(Throwable th) {
        return fc6.h(th instanceof dax ? ((dax) th).pcc : 0, "}", new StringBuilder("{\"code\":"));
    }

    public static String pcc() {
        return "";
    }

    public static void pcc(boolean z) {
        pcc = z;
    }
}
