package com.apm.insight;

import com.apm.insight.l.g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c {
    private static com.apm.insight.b.a a = new com.apm.insight.b.a();

    public static void a(Throwable th, String str) {
        if (!e.i().isEnsureEnable() || g.a(th)) {
            return;
        }
        com.apm.insight.f.b.a(th, str, "core_exception_monitor");
    }

    public static com.apm.insight.b.a a() {
        return a;
    }
}
