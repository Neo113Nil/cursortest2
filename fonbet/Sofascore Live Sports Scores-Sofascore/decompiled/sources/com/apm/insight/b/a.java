package com.apm.insight.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a {
    public a() {
        com.apm.insight.f.a.a();
    }

    public static void a(String str) {
        if (com.apm.insight.e.i().isEnsureEnable()) {
            com.apm.insight.f.b.a(Thread.currentThread().getStackTrace(), str, "EnsureNotReachHere");
        }
    }
}
