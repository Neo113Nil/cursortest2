package com.apm.insight.b;

import android.os.SystemClock;
import com.apm.insight.runtime.m;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c {
    private static long b;
    private final b a;
    private boolean c = false;
    private final Runnable d;

    public c(b bVar) {
        Runnable runnable = new Runnable() { // from class: com.apm.insight.b.c.1
            @Override // java.lang.Runnable
            public final void run() {
                if (c.this.c) {
                    return;
                }
                c.this.a.d();
                long unused = c.b = SystemClock.uptimeMillis();
                if (com.apm.insight.runtime.i.a().b()) {
                    m.a().a(c.this.d, 500L);
                } else {
                    m.a().a(c.this.d, 500L);
                }
                com.apm.insight.runtime.b.a(c.b);
            }
        };
        this.d = runnable;
        this.a = bVar;
        m.a().a(runnable, 5000L);
    }

    public static boolean c() {
        return SystemClock.uptimeMillis() - b <= 15000;
    }

    public final void a() {
        if (this.c) {
            return;
        }
        m.a().a(this.d, 5000L);
    }

    public final void b() {
        this.c = true;
    }
}
