package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qy {
    public static boolean pcc(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    public static boolean pcc() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            return i >= 32 && pcc("T", Build.VERSION.CODENAME);
        }
        return true;
    }
}
