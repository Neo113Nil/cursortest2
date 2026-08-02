package io.sentry.android.core;

import io.sentry.AbstractC4856v2;
import io.sentry.C4733c3;
import io.sentry.InterfaceC4765j0;
import io.sentry.K0;
import io.sentry.a4;
import io.sentry.android.core.performance.m;
import io.sentry.d4;
import io.sentry.f4;
import io.sentry.protocol.C4799a;
import io.sentry.util.C4843a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class R0 implements io.sentry.D {

    /* renamed from: b, reason: collision with root package name */
    public final C4682i f50772b;

    /* renamed from: c, reason: collision with root package name */
    public final SentryAndroidOptions f50773c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f50771a = false;

    /* renamed from: d, reason: collision with root package name */
    public final C4843a f50774d = new C4843a();

    public R0(SentryAndroidOptions sentryAndroidOptions, C4682i c4682i) {
        this.f50773c = (SentryAndroidOptions) io.sentry.util.w.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f50772b = (C4682i) io.sentry.util.w.c(c4682i, "ActivityFramesTracker is required");
    }

    public static boolean c(double d10, io.sentry.protocol.x xVar) {
        if (d10 >= xVar.e().doubleValue()) {
            return xVar.f() == null || d10 <= xVar.f().doubleValue();
        }
        return false;
    }

    public static io.sentry.protocol.x f(io.sentry.android.core.performance.n nVar, d4 d4Var, io.sentry.protocol.u uVar, String str, boolean z10) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("thread.id", Long.valueOf(io.sentry.android.core.internal.util.k.f51134b));
        hashMap.put("thread.name", "main");
        if (!z10) {
            Boolean bool = Boolean.TRUE;
            hashMap.put("ui.contributes_to_ttid", bool);
            hashMap.put("ui.contributes_to_ttfd", bool);
        }
        return new io.sentry.protocol.x(Double.valueOf(nVar.i()), Double.valueOf(nVar.f()), uVar, new d4(), d4Var, str, nVar.b(), f4.OK, "auto.ui", new ConcurrentHashMap(), new ConcurrentHashMap(), hashMap);
    }

    public final void a(io.sentry.android.core.performance.m mVar, io.sentry.protocol.B b10) {
        a4 j10;
        d4 d4Var;
        if (mVar.s() == m.b.COLD && (j10 = b10.C().j()) != null) {
            io.sentry.protocol.u q10 = j10.q();
            Iterator it = b10.o0().iterator();
            while (true) {
                if (!it.hasNext()) {
                    d4Var = null;
                    break;
                }
                io.sentry.protocol.x xVar = (io.sentry.protocol.x) it.next();
                if (xVar.c().contentEquals("app.start.cold")) {
                    d4Var = xVar.d();
                    break;
                }
            }
            if (d4Var == null && "app.start".equals(j10.g())) {
                d4Var = j10.n();
            }
            boolean equals = "app.start".equals(j10.g());
            io.sentry.android.core.performance.n e10 = mVar.e();
            if (e10.m() && Math.abs(e10.c()) <= 10000) {
                b10.o0().add(f(e10, d4Var, q10, "process.load", equals));
            }
            List u10 = mVar.u();
            if (!u10.isEmpty()) {
                Iterator it2 = u10.iterator();
                while (it2.hasNext()) {
                    b10.o0().add(f((io.sentry.android.core.performance.n) it2.next(), d4Var, q10, "contentprovider.load", equals));
                }
            }
            io.sentry.android.core.performance.n t10 = mVar.t();
            if (t10.n()) {
                b10.o0().add(f(t10, d4Var, q10, "application.load", equals));
            }
        }
    }

    public final boolean b(io.sentry.protocol.B b10) {
        for (io.sentry.protocol.x xVar : b10.o0()) {
            if (xVar.c().contentEquals("app.start.cold") || xVar.c().contentEquals("app.start.warm")) {
                return true;
            }
        }
        a4 j10 = b10.C().j();
        return j10 != null && j10.g().equals("app.start");
    }

    public final void e(io.sentry.protocol.B b10) {
        Object obj;
        io.sentry.protocol.x xVar = null;
        io.sentry.protocol.x xVar2 = null;
        for (io.sentry.protocol.x xVar3 : b10.o0()) {
            if ("ui.load.initial_display".equals(xVar3.c())) {
                xVar = xVar3;
            } else if ("ui.load.full_display".equals(xVar3.c())) {
                xVar2 = xVar3;
            }
            if (xVar != null && xVar2 != null) {
                break;
            }
        }
        if (xVar == null && xVar2 == null) {
            return;
        }
        for (io.sentry.protocol.x xVar4 : b10.o0()) {
            if (xVar4 != xVar && xVar4 != xVar2) {
                Map a10 = xVar4.a();
                boolean z10 = false;
                boolean z11 = xVar != null && c(xVar4.e().doubleValue(), xVar) && (a10 == null || (obj = a10.get("thread.name")) == null || "main".equals(obj));
                if (xVar2 != null && c(xVar4.e().doubleValue(), xVar2)) {
                    z10 = true;
                }
                if (z11 || z10) {
                    Map a11 = xVar4.a();
                    if (a11 == null) {
                        a11 = new ConcurrentHashMap();
                        xVar4.g(a11);
                    }
                    if (z11) {
                        a11.put("ui.contributes_to_ttid", Boolean.TRUE);
                    }
                    if (z10) {
                        a11.put("ui.contributes_to_ttfd", Boolean.TRUE);
                    }
                }
            }
        }
    }

    @Override // io.sentry.D
    public C4733c3 k(C4733c3 c4733c3, io.sentry.J j10) {
        return c4733c3;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    @Override // io.sentry.D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public io.sentry.protocol.B r(io.sentry.protocol.B b10, io.sentry.J j10) {
        Map n10;
        InterfaceC4765j0 d10 = this.f50774d.d();
        try {
            if (!this.f50773c.isTracingEnabled()) {
                if (d10 != null) {
                    d10.close();
                }
                return b10;
            }
            io.sentry.android.core.performance.m v10 = io.sentry.android.core.performance.m.v();
            if (b(b10)) {
                a4 j11 = b10.C().j();
                boolean z10 = true;
                boolean z11 = false;
                boolean z12 = (j11 == null || !(j11 != null && "app.start".equals(j11.g())) || j11.c().containsKey("app.vitals.start.screen")) ? false : true;
                if (v10.M(z12)) {
                    io.sentry.android.core.performance.n p10 = z12 ? v10.p() : v10.q(this.f50773c);
                    long c10 = p10.c();
                    C4673d0 j12 = v10.j();
                    if (j12.e()) {
                        AbstractC4856v2 c11 = j12.c();
                        if (c11 == null || !p10.m()) {
                            z10 = p10.m();
                            c10 = 0;
                            if (z10) {
                                if (z11) {
                                    b10.m0().put(v10.s() == m.b.COLD ? "app_start_cold" : "app_start_warm", new io.sentry.protocol.l(Float.valueOf(c10), K0.a.MILLISECOND.apiName()));
                                }
                                a(v10, b10);
                                v10.z();
                            }
                        } else {
                            c10 = Math.max(c10, TimeUnit.NANOSECONDS.toMillis(c11.f()) - p10.h());
                            if (c10 != 0) {
                                z11 = z10;
                                if (z10) {
                                }
                            }
                            z10 = false;
                            z11 = z10;
                            if (z10) {
                            }
                        }
                    } else {
                        if (c10 != 0) {
                            z11 = z10;
                            if (z10) {
                            }
                        }
                        z10 = false;
                        z11 = z10;
                        if (z10) {
                        }
                    }
                }
                C4799a d11 = b10.C().d();
                if (d11 == null) {
                    d11 = new C4799a();
                    b10.C().o(d11);
                }
                d11.v(v10.s() == m.b.COLD ? "cold" : "warm");
            }
            e(b10);
            io.sentry.protocol.u G10 = b10.G();
            a4 j13 = b10.C().j();
            if (G10 != null && j13 != null && j13.g().contentEquals("ui.load") && (n10 = this.f50772b.n(G10)) != null) {
                b10.m0().putAll(n10);
            }
            if (d10 != null) {
                d10.close();
            }
            return b10;
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
