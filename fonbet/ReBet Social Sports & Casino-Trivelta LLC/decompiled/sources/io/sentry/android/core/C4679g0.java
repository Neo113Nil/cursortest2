package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import io.sentry.AbstractC4772k2;
import io.sentry.AbstractC4810q2;
import io.sentry.C4733c3;
import io.sentry.C4738d3;
import io.sentry.C4870y1;
import io.sentry.C4875z1;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4729c;
import io.sentry.J3;
import io.sentry.a4;
import io.sentry.android.core.AbstractC4704q0;
import io.sentry.protocol.C4799a;
import io.sentry.protocol.C4802d;
import io.sentry.protocol.C4803e;
import io.sentry.protocol.C4804f;
import io.sentry.protocol.DebugImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: io.sentry.android.core.g0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4679g0 implements InterfaceC4729c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f50968a;

    /* renamed from: b, reason: collision with root package name */
    public final SentryAndroidOptions f50969b;

    /* renamed from: c, reason: collision with root package name */
    public final C4683i0 f50970c;

    /* renamed from: d, reason: collision with root package name */
    public final C4738d3 f50971d;

    /* renamed from: e, reason: collision with root package name */
    public final io.sentry.cache.t f50972e;

    /* renamed from: f, reason: collision with root package name */
    public final List f50973f = Collections.singletonList(new b());

    /* renamed from: io.sentry.android.core.g0$b */
    public final class b implements c {
        public b() {
        }

        @Override // io.sentry.android.core.C4679g0.c
        public void a(C4733c3 c4733c3, io.sentry.hints.c cVar, Object obj) {
            boolean h10 = h(obj);
            C4679g0.this.u(c4733c3);
            i(c4733c3, cVar, h10);
        }

        @Override // io.sentry.android.core.C4679g0.c
        public boolean b(Object obj) {
            return obj instanceof io.sentry.hints.a;
        }

        @Override // io.sentry.android.core.C4679g0.c
        public void c(C4733c3 c4733c3, io.sentry.hints.c cVar, Object obj) {
            boolean h10 = h(obj);
            if (C4679g0.this.f50969b.isAnrProfilingEnabled()) {
                d(c4733c3, cVar, h10);
            }
            k(c4733c3, h10);
            j(c4733c3, !h10);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void d(C4733c3 c4733c3, io.sentry.hints.c cVar, boolean z10) {
            String cacheDirPath;
            long time;
            io.sentry.android.core.anr.d dVar;
            if (z10 || (cacheDirPath = C4679g0.this.f50969b.getCacheDirPath()) == null) {
                return;
            }
            File file = new File(cacheDirPath);
            if (cVar instanceof io.sentry.hints.a) {
                Long a10 = ((io.sentry.hints.a) cVar).a();
                if (a10 != null) {
                    time = a10.longValue();
                } else if (c4733c3.v0() == null) {
                    return;
                } else {
                    time = c4733c3.v0().getTime();
                }
                try {
                    File c10 = io.sentry.android.core.anr.f.c(file);
                    if (c10.exists()) {
                        C4679g0.this.f50969b.getLogger().c(EnumC4788n3.DEBUG, "Reading ANR profile", new Object[0]);
                        io.sentry.android.core.anr.e eVar = new io.sentry.android.core.anr.e(C4679g0.this.f50969b, c10);
                        try {
                            dVar = eVar.r();
                            try {
                                eVar.close();
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    ILogger logger = C4679g0.this.f50969b.getLogger();
                                    EnumC4788n3 enumC4788n3 = EnumC4788n3.INFO;
                                    logger.b(enumC4788n3, "Could not retrieve ANR profile", th);
                                    if (!io.sentry.android.core.anr.f.a(file)) {
                                    }
                                    if (dVar == null) {
                                    }
                                } catch (Throwable th3) {
                                    if (!io.sentry.android.core.anr.f.a(file)) {
                                        C4679g0.this.f50969b.getLogger().c(EnumC4788n3.INFO, "Could not delete ANR profile file", new Object[0]);
                                    }
                                    throw th3;
                                }
                            }
                        } finally {
                        }
                    } else {
                        C4679g0.this.f50969b.getLogger().c(EnumC4788n3.DEBUG, "No ANR profile file found", new Object[0]);
                        dVar = null;
                    }
                    if (!io.sentry.android.core.anr.f.a(file)) {
                        C4679g0.this.f50969b.getLogger().c(EnumC4788n3.INFO, "Could not delete ANR profile file", new Object[0]);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    dVar = null;
                    ILogger logger2 = C4679g0.this.f50969b.getLogger();
                    EnumC4788n3 enumC4788n32 = EnumC4788n3.INFO;
                    logger2.b(enumC4788n32, "Could not retrieve ANR profile", th);
                    if (!io.sentry.android.core.anr.f.a(file)) {
                        C4679g0.this.f50969b.getLogger().c(enumC4788n32, "Could not delete ANR profile file", new Object[0]);
                    }
                    if (dVar == null) {
                    }
                }
                if (dVar == null) {
                    return;
                }
                C4679g0.this.f50969b.getLogger().c(EnumC4788n3.INFO, "ANR profile found", new Object[0]);
                if (time < dVar.f50906b || time > dVar.f50907c) {
                    C4679g0.this.f50969b.getLogger().c(EnumC4788n3.DEBUG, "ANR profile found, but doesn't match", new Object[0]);
                    return;
                }
                io.sentry.android.core.anr.a b10 = io.sentry.android.core.anr.c.b(dVar.f50905a);
                if (b10 == null) {
                    return;
                }
                io.sentry.protocol.u e10 = e(time, dVar);
                StackTraceElement[] b11 = b10.b();
                if (b11.length > 0) {
                    StackTraceElement stackTraceElement = b11[0];
                    ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName());
                    applicationNotResponding.setStackTrace(b11);
                    io.sentry.protocol.m mVar = new io.sentry.protocol.m();
                    mVar.r("ANR");
                    c4733c3.A0(C4679g0.this.f50971d.d(new io.sentry.exception.a(mVar, applicationNotResponding, null, false)));
                    if (e10 != null) {
                        c4733c3.C().w(new C4875z1(e10));
                    }
                }
            }
        }

        public final io.sentry.protocol.u e(long j10, io.sentry.android.core.anr.d dVar) {
            io.sentry.protocol.profiling.a a10 = io.sentry.android.core.anr.j.a(dVar);
            C4870y1 c4870y1 = new C4870y1(new io.sentry.protocol.u(), new io.sentry.protocol.u(), null, new HashMap(0), Double.valueOf(j10 / 1000.0d), "java", C4679g0.this.f50969b);
            c4870y1.t(a10);
            if (io.sentry.protocol.u.f52477c.equals(AbstractC4772k2.p().r(c4870y1))) {
                return null;
            }
            return c4870y1.p();
        }

        public final io.sentry.protocol.A f(List list) {
            if (list == null) {
                return null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                io.sentry.protocol.A a10 = (io.sentry.protocol.A) it.next();
                String m10 = a10.m();
                if (m10 != null && m10.equals("main")) {
                    return a10;
                }
            }
            return null;
        }

        public final boolean g(C4733c3 c4733c3) {
            List<io.sentry.protocol.y> e10;
            List p02 = c4733c3.p0();
            if (p02 == null || p02.isEmpty()) {
                return false;
            }
            Iterator it = p02.iterator();
            while (it.hasNext()) {
                io.sentry.protocol.z i10 = ((io.sentry.protocol.t) it.next()).i();
                if (i10 != null && (e10 = i10.e()) != null && !e10.isEmpty()) {
                    for (io.sentry.protocol.y yVar : e10) {
                        if (yVar.w() != null && yVar.w().booleanValue()) {
                            return false;
                        }
                        String v10 = yVar.v();
                        if (v10 != null && !io.sentry.android.core.anr.c.c(v10)) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }

        public final boolean h(Object obj) {
            if (obj instanceof io.sentry.hints.a) {
                return "anr_background".equals(((io.sentry.hints.a) obj).h());
            }
            return false;
        }

        public final void i(C4733c3 c4733c3, io.sentry.hints.c cVar, boolean z10) {
            if (c4733c3.p0() != null) {
                return;
            }
            io.sentry.protocol.m mVar = new io.sentry.protocol.m();
            if (cVar.b()) {
                mVar.r("AppExitInfo");
            } else {
                mVar.r("HistoricalAppExitInfo");
            }
            String str = "ANR";
            if (z10) {
                str = "Background ANR";
            }
            ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(str, Thread.currentThread());
            io.sentry.protocol.A f10 = f(c4733c3.u0());
            if (f10 == null) {
                f10 = new io.sentry.protocol.A();
                f10.y(new io.sentry.protocol.z());
            }
            c4733c3.A0(C4679g0.this.f50971d.f(f10, mVar, applicationNotResponding));
        }

        public final void j(AbstractC4810q2 abstractC4810q2, boolean z10) {
            C4799a d10 = abstractC4810q2.C().d();
            if (d10 == null) {
                d10 = new C4799a();
                abstractC4810q2.C().o(d10);
            }
            if (d10.l() == null) {
                d10.r(Boolean.valueOf(z10));
            }
        }

        public final void k(C4733c3 c4733c3, boolean z10) {
            if (c4733c3.q0() != null) {
                return;
            }
            if (C4679g0.this.f50969b.isEnableAnrFingerprinting() && g(c4733c3)) {
                c4733c3.B0(Arrays.asList("system-frames-only-anr", z10 ? "background-anr" : "foreground-anr"));
            } else {
                c4733c3.B0(Arrays.asList("{{ default }}", z10 ? "background-anr" : "foreground-anr"));
            }
        }
    }

    /* renamed from: io.sentry.android.core.g0$c */
    public interface c {
        void a(C4733c3 c4733c3, io.sentry.hints.c cVar, Object obj);

        boolean b(Object obj);

        void c(C4733c3 c4733c3, io.sentry.hints.c cVar, Object obj);
    }

    public C4679g0(Context context, SentryAndroidOptions sentryAndroidOptions, C4683i0 c4683i0) {
        this.f50968a = AbstractC4704q0.g(context);
        this.f50969b = sentryAndroidOptions;
        this.f50970c = c4683i0;
        this.f50972e = sentryAndroidOptions.findPersistingScopeObserver();
        this.f50971d = new C4738d3(new J3(sentryAndroidOptions));
    }

    public final void A(C4733c3 c4733c3) {
        EnumC4788n3 enumC4788n3 = (EnumC4788n3) n(this.f50969b, "level.json", EnumC4788n3.class);
        if (c4733c3.r0() == null) {
            c4733c3.C0(enumC4788n3);
        }
    }

    public final void B(AbstractC4810q2 abstractC4810q2) {
        Map map = (Map) io.sentry.cache.h.i(this.f50969b, "tags.json", Map.class);
        if (map == null) {
            return;
        }
        if (abstractC4810q2.N() == null) {
            abstractC4810q2.e0(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!abstractC4810q2.N().containsKey(entry.getKey())) {
                abstractC4810q2.d0((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    public final void C(AbstractC4810q2 abstractC4810q2) {
        if (abstractC4810q2.J() == null) {
            abstractC4810q2.Z((String) io.sentry.cache.h.i(this.f50969b, "release.json", String.class));
        }
    }

    public final void D(C4733c3 c4733c3) {
        String str = (String) n(this.f50969b, "replay.json", String.class);
        String cacheDirPath = this.f50969b.getCacheDirPath();
        if (cacheDirPath == null) {
            return;
        }
        if (!new File(cacheDirPath, "replay_" + str).exists()) {
            if (!o(c4733c3)) {
                return;
            }
            File[] listFiles = new File(cacheDirPath).listFiles();
            String str2 = null;
            if (listFiles != null) {
                long j10 = Long.MIN_VALUE;
                for (File file : listFiles) {
                    if (file.isDirectory() && file.getName().startsWith("replay_") && file.lastModified() > j10 && file.lastModified() <= c4733c3.v0().getTime()) {
                        j10 = file.lastModified();
                        str2 = file.getName().substring(7);
                    }
                }
            }
            str = str2;
        }
        if (str == null) {
            return;
        }
        io.sentry.cache.t.G(this.f50969b, str, "replay.json");
        c4733c3.C().l("replay_id", str);
    }

    public final void E(AbstractC4810q2 abstractC4810q2) {
        if (abstractC4810q2.K() == null) {
            abstractC4810q2.a0((io.sentry.protocol.p) n(this.f50969b, "request.json", io.sentry.protocol.p.class));
        }
    }

    public final void F(AbstractC4810q2 abstractC4810q2) {
        Map map = (Map) n(this.f50969b, "tags.json", Map.class);
        if (map == null) {
            return;
        }
        if (abstractC4810q2.N() == null) {
            abstractC4810q2.e0(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!abstractC4810q2.N().containsKey(entry.getKey())) {
                abstractC4810q2.d0((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    public final void G(AbstractC4810q2 abstractC4810q2) {
        if (abstractC4810q2.L() == null) {
            abstractC4810q2.b0((io.sentry.protocol.s) io.sentry.cache.h.i(this.f50969b, "sdk-version.json", io.sentry.protocol.s.class));
        }
    }

    public final void H(AbstractC4810q2 abstractC4810q2) {
        try {
            AbstractC4704q0.a l10 = C4713v0.i(this.f50968a, this.f50969b).l();
            if (l10 != null) {
                for (Map.Entry entry : l10.a().entrySet()) {
                    abstractC4810q2.d0((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th2) {
            this.f50969b.getLogger().b(EnumC4788n3.ERROR, "Error getting side loaded info.", th2);
        }
    }

    public final void I(C4733c3 c4733c3) {
        m(c4733c3);
        H(c4733c3);
    }

    public final void J(C4733c3 c4733c3) {
        a4 a4Var = (a4) n(this.f50969b, "trace.json", a4.class);
        if (c4733c3.C().j() != null || a4Var == null) {
            return;
        }
        c4733c3.C().A(a4Var);
    }

    public final void K(C4733c3 c4733c3) {
        String str = (String) n(this.f50969b, "transaction.json", String.class);
        if (c4733c3.w0() == null) {
            c4733c3.H0(str);
        }
    }

    public final void L(AbstractC4810q2 abstractC4810q2) {
        if (abstractC4810q2.Q() == null) {
            abstractC4810q2.f0((io.sentry.protocol.F) n(this.f50969b, "user.json", io.sentry.protocol.F.class));
        }
    }

    public final void e(C4733c3 c4733c3) {
        C(c4733c3);
        x(c4733c3);
        w(c4733c3);
        t(c4733c3);
        G(c4733c3);
        p(c4733c3);
        B(c4733c3);
    }

    public final void f(C4733c3 c4733c3) {
        E(c4733c3);
        L(c4733c3);
        F(c4733c3);
        q(c4733c3);
        y(c4733c3);
        s(c4733c3);
        K(c4733c3);
        z(c4733c3);
        A(c4733c3);
        J(c4733c3);
        D(c4733c3);
    }

    public final c g(Object obj) {
        for (c cVar : this.f50973f) {
            if (cVar.b(obj)) {
                return cVar;
            }
        }
        return null;
    }

    public final C4804f h() {
        C4804f c4804f = new C4804f();
        c4804f.b0(Build.MANUFACTURER);
        c4804f.P(Build.BRAND);
        c4804f.V(AbstractC4704q0.l(this.f50969b.getLogger()));
        c4804f.d0(Build.MODEL);
        c4804f.e0(Build.ID);
        c4804f.L(AbstractC4704q0.j());
        ActivityManager.MemoryInfo n10 = AbstractC4704q0.n(this.f50968a, this.f50969b.getLogger());
        if (n10 != null) {
            c4804f.c0(j(n10));
        }
        c4804f.n0(this.f50970c.f());
        DisplayMetrics k10 = AbstractC4704q0.k(this.f50968a, this.f50969b.getLogger());
        if (k10 != null) {
            c4804f.m0(Integer.valueOf(k10.widthPixels));
            c4804f.l0(Integer.valueOf(k10.heightPixels));
            c4804f.j0(Float.valueOf(k10.density));
            c4804f.k0(Integer.valueOf(k10.densityDpi));
        }
        if (c4804f.J() == null) {
            c4804f.Y(i());
        }
        List c10 = io.sentry.android.core.internal.util.n.a().c();
        if (!c10.isEmpty()) {
            c4804f.i0(Double.valueOf(((Integer) Collections.max(c10)).doubleValue()));
            c4804f.h0(Integer.valueOf(c10.size()));
        }
        return c4804f;
    }

    public final String i() {
        try {
            return D0.a(this.f50968a);
        } catch (Throwable th2) {
            this.f50969b.getLogger().b(EnumC4788n3.ERROR, "Error getting installationId.", th2);
            return null;
        }
    }

    public final Long j(ActivityManager.MemoryInfo memoryInfo) {
        return Long.valueOf(memoryInfo.totalMem);
    }

    @Override // io.sentry.D
    public C4733c3 k(C4733c3 c4733c3, io.sentry.J j10) {
        Object e10 = io.sentry.util.l.e(j10);
        if (!(e10 instanceof io.sentry.hints.c)) {
            this.f50969b.getLogger().c(EnumC4788n3.WARNING, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping.", new Object[0]);
            return c4733c3;
        }
        io.sentry.hints.c cVar = (io.sentry.hints.c) e10;
        c g10 = g(e10);
        if (g10 != null) {
            g10.a(c4733c3, cVar, e10);
        }
        l(c4733c3);
        v(c4733c3);
        if (!cVar.b()) {
            this.f50969b.getLogger().c(EnumC4788n3.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
            return c4733c3;
        }
        f(c4733c3);
        e(c4733c3);
        I(c4733c3);
        if (g10 != null) {
            g10.c(c4733c3, cVar, e10);
        }
        return c4733c3;
    }

    public final void l(AbstractC4810q2 abstractC4810q2) {
        String str;
        io.sentry.protocol.o h10 = abstractC4810q2.C().h();
        abstractC4810q2.C().v(C4713v0.i(this.f50968a, this.f50969b).j());
        if (h10 != null) {
            String g10 = h10.g();
            if (g10 == null || g10.isEmpty()) {
                str = "os_1";
            } else {
                str = "os_" + g10.trim().toLowerCase(Locale.ROOT);
            }
            abstractC4810q2.C().l(str, h10);
        }
    }

    public final void m(AbstractC4810q2 abstractC4810q2) {
        io.sentry.protocol.F Q10 = abstractC4810q2.Q();
        if (Q10 == null) {
            Q10 = new io.sentry.protocol.F();
            abstractC4810q2.f0(Q10);
        }
        if (Q10.i() == null) {
            Q10.m(i());
        }
        if (Q10.j() == null && this.f50969b.isSendDefaultPii()) {
            Q10.n("{{auto}}");
        }
    }

    public final Object n(F3 f32, String str, Class cls) {
        io.sentry.cache.t tVar = this.f50972e;
        if (tVar == null) {
            return null;
        }
        return tVar.C(f32, str, cls);
    }

    public final boolean o(C4733c3 c4733c3) {
        String str = (String) io.sentry.cache.h.i(this.f50969b, "replay-error-sample-rate.json", String.class);
        if (str == null) {
            return false;
        }
        try {
            if (Double.parseDouble(str) >= io.sentry.util.B.a().c()) {
                return true;
            }
            this.f50969b.getLogger().c(EnumC4788n3.DEBUG, "Not capturing replay for ANR %s due to not being sampled.", c4733c3.G());
            return false;
        } catch (Throwable th2) {
            this.f50969b.getLogger().b(EnumC4788n3.ERROR, "Error parsing replay sample rate.", th2);
            return false;
        }
    }

    public final void p(AbstractC4810q2 abstractC4810q2) {
        C4799a d10 = abstractC4810q2.C().d();
        if (d10 == null) {
            d10 = new C4799a();
        }
        d10.o(AbstractC4704q0.i(this.f50968a));
        PackageInfo p10 = AbstractC4704q0.p(this.f50968a, this.f50970c);
        if (p10 != null) {
            d10.n(p10.packageName);
        }
        String J10 = abstractC4810q2.J() != null ? abstractC4810q2.J() : (String) io.sentry.cache.h.i(this.f50969b, "release.json", String.class);
        if (J10 != null) {
            try {
                String substring = J10.substring(J10.indexOf(64) + 1, J10.indexOf(43));
                String substring2 = J10.substring(J10.indexOf(43) + 1);
                d10.q(substring);
                d10.m(substring2);
            } catch (Throwable unused) {
                this.f50969b.getLogger().c(EnumC4788n3.WARNING, "Failed to parse release from scope cache: %s", J10);
            }
        }
        try {
            AbstractC4704q0.b m10 = C4713v0.i(this.f50968a, this.f50969b).m();
            if (m10 != null) {
                d10.t(Boolean.valueOf(m10.b()));
                if (m10.a() != null) {
                    d10.u(Arrays.asList(m10.a()));
                }
            }
        } catch (Throwable th2) {
            this.f50969b.getLogger().b(EnumC4788n3.ERROR, "Error getting split apks info.", th2);
        }
        abstractC4810q2.C().o(d10);
    }

    public final void q(AbstractC4810q2 abstractC4810q2) {
        List list = (List) n(this.f50969b, "breadcrumbs.json", List.class);
        if (list == null) {
            return;
        }
        if (abstractC4810q2.B() == null) {
            abstractC4810q2.S(list);
        } else {
            abstractC4810q2.B().addAll(list);
        }
    }

    @Override // io.sentry.D
    public io.sentry.protocol.B r(io.sentry.protocol.B b10, io.sentry.J j10) {
        return b10;
    }

    public final void s(AbstractC4810q2 abstractC4810q2) {
        C4802d c4802d = (C4802d) n(this.f50969b, "contexts.json", C4802d.class);
        if (c4802d == null) {
            return;
        }
        C4802d C10 = abstractC4810q2.C();
        for (Map.Entry entry : new C4802d(c4802d).b()) {
            Object value = entry.getValue();
            if (!"trace".equals(entry.getKey()) || !(value instanceof a4)) {
                if (!C10.a(entry.getKey())) {
                    C10.l((String) entry.getKey(), value);
                }
            }
        }
    }

    public final void t(AbstractC4810q2 abstractC4810q2) {
        C4803e D10 = abstractC4810q2.D();
        if (D10 == null) {
            D10 = new C4803e();
        }
        if (D10.d() == null) {
            D10.e(new ArrayList());
        }
        List d10 = D10.d();
        if (d10 != null) {
            String str = (String) io.sentry.cache.h.i(this.f50969b, "proguard-uuid.json", String.class);
            if (str != null) {
                DebugImage debugImage = new DebugImage();
                debugImage.setType(DebugImage.PROGUARD);
                debugImage.setUuid(str);
                d10.add(debugImage);
            }
            abstractC4810q2.T(D10);
        }
    }

    public final void u(AbstractC4810q2 abstractC4810q2) {
        if (abstractC4810q2.I() == null) {
            abstractC4810q2.Y("java");
        }
    }

    public final void v(AbstractC4810q2 abstractC4810q2) {
        if (abstractC4810q2.C().e() == null) {
            abstractC4810q2.C().r(h());
        }
    }

    public final void w(AbstractC4810q2 abstractC4810q2) {
        String str;
        if (abstractC4810q2.E() == null) {
            abstractC4810q2.U((String) io.sentry.cache.h.i(this.f50969b, "dist.json", String.class));
        }
        if (abstractC4810q2.E() != null || (str = (String) io.sentry.cache.h.i(this.f50969b, "release.json", String.class)) == null) {
            return;
        }
        try {
            abstractC4810q2.U(str.substring(str.indexOf(43) + 1));
        } catch (Throwable unused) {
            this.f50969b.getLogger().c(EnumC4788n3.WARNING, "Failed to parse release from scope cache: %s", str);
        }
    }

    public final void x(AbstractC4810q2 abstractC4810q2) {
        if (abstractC4810q2.F() == null) {
            String str = (String) io.sentry.cache.h.i(this.f50969b, "environment.json", String.class);
            if (str == null) {
                str = this.f50969b.getEnvironment();
            }
            abstractC4810q2.V(str);
        }
    }

    public final void y(AbstractC4810q2 abstractC4810q2) {
        Map map = (Map) n(this.f50969b, "extras.json", Map.class);
        if (map == null) {
            return;
        }
        if (abstractC4810q2.H() == null) {
            abstractC4810q2.X(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!abstractC4810q2.H().containsKey(entry.getKey())) {
                abstractC4810q2.H().put((String) entry.getKey(), entry.getValue());
            }
        }
    }

    public final void z(C4733c3 c4733c3) {
        List list = (List) n(this.f50969b, "fingerprint.json", List.class);
        if (c4733c3.q0() == null) {
            c4733c3.B0(list);
        }
    }
}
