package com.my.tracker.obfuscated;

import android.content.Context;
import com.my.tracker.MyTrackerConfig;

/* loaded from: classes.dex */
public final class g0 {
    private static volatile g0 l;
    private final h a = new h();
    private final y0 b = new y0();
    private final a0 c = new a0();
    private final l0 d = new l0();
    private final u0 e = new u0();
    private final i1 f = new i1();
    private final a1 g = new a1();
    private final k h = new k();
    private final d0 i = new d0();
    private final p j = new p();
    private final i0 k = new i0();

    private g0() {
    }

    public static g0 a() {
        g0 g0Var;
        g0 g0Var2 = l;
        if (g0Var2 != null) {
            return g0Var2;
        }
        synchronized (g0.class) {
            try {
                g0Var = l;
                if (g0Var == null) {
                    g0Var = new g0();
                    l = g0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return g0Var;
    }

    public f0 a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider, boolean z, int i, boolean z2, String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, Context context) {
        c0 c0Var;
        c0 c0Var2;
        h0 a;
        x0 a2;
        z0 a3;
        k0 k0Var;
        t0 t0Var;
        g a4 = this.a.a(context);
        z a5 = this.c.a(context);
        h1 a6 = this.f.a(context);
        j a7 = this.h.a(installedPackagesProvider, context);
        if (z2) {
            c0Var2 = c0.c;
            a3 = z0.g;
            a2 = null;
            k0Var = null;
            t0Var = null;
            a = null;
        } else {
            t0 a8 = this.e.a(context);
            k0 a9 = this.d.a(context);
            if (z) {
                c0Var = this.i.b(context);
            } else {
                c0Var = c0.c;
            }
            c0Var2 = c0Var;
            a = this.k.a(context);
            a2 = this.b.a(str, okHttpClientProvider);
            a3 = this.g.a(i, context);
            k0Var = a9;
            t0Var = a8;
        }
        return new f0(a4, a2, a5, k0Var, t0Var, a6, a3, a7, c0Var2, this.j.a(context), a);
    }
}
