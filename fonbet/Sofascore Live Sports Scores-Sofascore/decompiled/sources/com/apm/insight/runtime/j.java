package com.apm.insight.runtime;

import com.apm.insight.MonitorCrash;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j {
    private static MonitorCrash a = null;
    private static int b = -1;
    private static int c;

    public static MonitorCrash a() {
        if (a == null) {
            MonitorCrash initSDK = MonitorCrash.initSDK(com.apm.insight.e.g(), "239017", 20089L, "2008-20250701130429", "com.apm.insight");
            a = initSDK;
            initSDK.config().setChannel("release");
        }
        return a;
    }

    public static void a(Throwable th, String str) {
        if (com.apm.insight.e.g() == null) {
            return;
        }
        int i = b;
        if (i == -1) {
            i = 5;
            b = 5;
        }
        int i2 = c;
        if (i2 < i) {
            c = i2 + 1;
            a().reportCustomErr(str, "INNER", th);
        }
    }
}
