package com.pgl.ssdk;

import android.os.Handler;

/* loaded from: classes4.dex */
public class ar {
    public static void a(Runnable runnable) {
        Handler a;
        if (runnable == null || (a = a()) == null) {
            return;
        }
        a.post(runnable);
    }

    public static Handler b() {
        return az.a().c();
    }

    public static void b(Runnable runnable) {
        a(runnable, 0L);
    }

    private static Handler a() {
        return az.a().b();
    }

    public static void a(Runnable runnable, long j) {
        Handler b;
        if (runnable == null || (b = b()) == null) {
            return;
        }
        b.postDelayed(runnable, j);
    }
}
