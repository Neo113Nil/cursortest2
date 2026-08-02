package io.sentry.android.core;

import io.sentry.B0;
import io.sentry.C7230z2;
import io.sentry.InterfaceC7097a0;
import io.sentry.InterfaceC7227z;
import io.sentry.android.core.performance.j;
import io.sentry.j3;
import io.sentry.l3;
import io.sentry.n3;
import io.sentry.protocol.C7185a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class f0 implements InterfaceC7227z {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C7102c f67094a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final SentryAndroidOptions f67095b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f67096c = new io.sentry.util.a();

    f0(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull C7102c c7102c) {
        io.sentry.util.p.b(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f67095b = sentryAndroidOptions;
        this.f67094a = c7102c;
    }

    private static void a(@NotNull io.sentry.android.core.performance.j jVar, @NotNull io.sentry.protocol.A a11) {
        j3 j11;
        l3 l3Var;
        if (jVar.j() == j.d.COLD && (j11 = a11.C().j()) != null) {
            io.sentry.protocol.t o11 = j11.o();
            Iterator it = ((ArrayList) a11.l0()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    l3Var = null;
                    break;
                }
                io.sentry.protocol.w wVar = (io.sentry.protocol.w) it.next();
                if (wVar.c().contentEquals("app.start.cold")) {
                    l3Var = wVar.d();
                    break;
                }
            }
            io.sentry.android.core.performance.l d11 = jVar.d();
            if (d11.j() && Math.abs(d11.b()) <= 10000) {
                ((ArrayList) a11.l0()).add(g(d11, l3Var, o11, "process.load"));
            }
            ArrayList l11 = jVar.l();
            if (!l11.isEmpty()) {
                Iterator it2 = l11.iterator();
                while (it2.hasNext()) {
                    ((ArrayList) a11.l0()).add(g((io.sentry.android.core.performance.l) it2.next(), l3Var, o11, "contentprovider.load"));
                }
            }
            io.sentry.android.core.performance.l k11 = jVar.k();
            if (k11.k()) {
                ((ArrayList) a11.l0()).add(g(k11, l3Var, o11, "application.load"));
            }
        }
    }

    private static boolean b(@NotNull io.sentry.protocol.A a11) {
        Iterator it = ((ArrayList) a11.l0()).iterator();
        while (it.hasNext()) {
            io.sentry.protocol.w wVar = (io.sentry.protocol.w) it.next();
            if (wVar.c().contentEquals("app.start.cold") || wVar.c().contentEquals("app.start.warm")) {
                return true;
            }
        }
        j3 j11 = a11.C().j();
        if (j11 != null) {
            return j11.e().equals("app.start.cold") || j11.e().equals("app.start.warm");
        }
        return false;
    }

    private static boolean e(double d11, @NotNull io.sentry.protocol.w wVar) {
        if (d11 >= wVar.e().doubleValue()) {
            return wVar.f() == null || d11 <= wVar.f().doubleValue();
        }
        return false;
    }

    private static void f(io.sentry.protocol.A a11) {
        Object obj;
        Iterator it = ((ArrayList) a11.l0()).iterator();
        io.sentry.protocol.w wVar = null;
        io.sentry.protocol.w wVar2 = null;
        while (it.hasNext()) {
            io.sentry.protocol.w wVar3 = (io.sentry.protocol.w) it.next();
            if ("ui.load.initial_display".equals(wVar3.c())) {
                wVar = wVar3;
            } else if ("ui.load.full_display".equals(wVar3.c())) {
                wVar2 = wVar3;
            }
            if (wVar != null && wVar2 != null) {
                break;
            }
        }
        if (wVar == null && wVar2 == null) {
            return;
        }
        Iterator it2 = ((ArrayList) a11.l0()).iterator();
        while (it2.hasNext()) {
            io.sentry.protocol.w wVar4 = (io.sentry.protocol.w) it2.next();
            if (wVar4 != wVar && wVar4 != wVar2) {
                Map<String, Object> a12 = wVar4.a();
                boolean z11 = false;
                boolean z12 = wVar != null && e(wVar4.e().doubleValue(), wVar) && (a12 == null || (obj = a12.get("thread.name")) == null || "main".equals(obj));
                if (wVar2 != null && e(wVar4.e().doubleValue(), wVar2)) {
                    z11 = true;
                }
                if (z12 || z11) {
                    Map<String, Object> a13 = wVar4.a();
                    if (a13 == null) {
                        a13 = new ConcurrentHashMap<>();
                        wVar4.g(a13);
                    }
                    if (z12) {
                        a13.put("ui.contributes_to_ttid", Boolean.TRUE);
                    }
                    if (z11) {
                        a13.put("ui.contributes_to_ttfd", Boolean.TRUE);
                    }
                }
            }
        }
    }

    @NotNull
    private static io.sentry.protocol.w g(@NotNull io.sentry.android.core.performance.l lVar, l3 l3Var, @NotNull io.sentry.protocol.t tVar, @NotNull String str) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("thread.id", Long.valueOf(io.sentry.android.core.internal.util.d.f67195b));
        hashMap.put("thread.name", "main");
        Boolean bool = Boolean.TRUE;
        hashMap.put("ui.contributes_to_ttid", bool);
        hashMap.put("ui.contributes_to_ttfd", bool);
        return new io.sentry.protocol.w(Double.valueOf(lVar.f()), Double.valueOf(lVar.c() / 1000.0d), tVar, new l3(), l3Var, str, lVar.a(), n3.OK, "auto.ui", new ConcurrentHashMap(), new ConcurrentHashMap(), hashMap);
    }

    @Override // io.sentry.InterfaceC7227z
    public final C7230z2 d(@NotNull C7230z2 c7230z2, @NotNull io.sentry.E e11) {
        return c7230z2;
    }

    @Override // io.sentry.InterfaceC7227z
    @NotNull
    public final io.sentry.protocol.A j(@NotNull io.sentry.protocol.A a11, @NotNull io.sentry.E e11) {
        Map<String, io.sentry.protocol.k> k11;
        SentryAndroidOptions sentryAndroidOptions = this.f67095b;
        InterfaceC7097a0 a12 = this.f67096c.a();
        try {
            if (!sentryAndroidOptions.isTracingEnabled()) {
                a12.close();
                return a11;
            }
            io.sentry.android.core.performance.j m11 = io.sentry.android.core.performance.j.m();
            if (b(a11)) {
                if (m11.u()) {
                    long b11 = m11.i(sentryAndroidOptions).b();
                    if (b11 != 0) {
                        ((HashMap) a11.k0()).put(m11.j() == j.d.COLD ? "app_start_cold" : "app_start_warm", new io.sentry.protocol.k(B0.a.MILLISECOND.apiName(), Float.valueOf(b11)));
                        a(m11, a11);
                        m11.o();
                    }
                }
                C7185a d11 = a11.C().d();
                if (d11 == null) {
                    d11 = new C7185a();
                    a11.C().o(d11);
                }
                d11.v(m11.j() == j.d.COLD ? "cold" : "warm");
            }
            f(a11);
            io.sentry.protocol.t G11 = a11.G();
            j3 j11 = a11.C().j();
            if (G11 != null && j11 != null && j11.e().contentEquals("ui.load") && (k11 = this.f67094a.k(G11)) != null) {
                ((HashMap) a11.k0()).putAll(k11);
            }
            a12.close();
            return a11;
        } catch (Throwable th2) {
            try {
                a12.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
