package com.apm.insight.l;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b {
    private static DateFormat a;

    public static DateFormat a() {
        DateFormat dateFormat = a;
        if (dateFormat != null) {
            return dateFormat;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        a = simpleDateFormat;
        return simpleDateFormat;
    }
}
