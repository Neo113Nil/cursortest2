package io.sentry;

import com.facebook.react.uimanager.ViewProps;
import io.sentry.F3;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public final class F {

    /* renamed from: B, reason: collision with root package name */
    public Boolean f50264B;

    /* renamed from: C, reason: collision with root package name */
    public Boolean f50265C;

    /* renamed from: D, reason: collision with root package name */
    public Boolean f50266D;

    /* renamed from: E, reason: collision with root package name */
    public Boolean f50267E;

    /* renamed from: F, reason: collision with root package name */
    public Boolean f50268F;

    /* renamed from: G, reason: collision with root package name */
    public String f50269G;

    /* renamed from: H, reason: collision with root package name */
    public List f50270H;

    /* renamed from: I, reason: collision with root package name */
    public List f50271I;

    /* renamed from: J, reason: collision with root package name */
    public Boolean f50272J;

    /* renamed from: K, reason: collision with root package name */
    public Boolean f50273K;

    /* renamed from: L, reason: collision with root package name */
    public Boolean f50274L;

    /* renamed from: M, reason: collision with root package name */
    public Boolean f50275M;

    /* renamed from: N, reason: collision with root package name */
    public Boolean f50276N;

    /* renamed from: O, reason: collision with root package name */
    public Boolean f50277O;

    /* renamed from: P, reason: collision with root package name */
    public Boolean f50278P;

    /* renamed from: Q, reason: collision with root package name */
    public Boolean f50279Q;

    /* renamed from: R, reason: collision with root package name */
    public Boolean f50280R;

    /* renamed from: S, reason: collision with root package name */
    public Double f50281S;

    /* renamed from: T, reason: collision with root package name */
    public String f50282T;

    /* renamed from: U, reason: collision with root package name */
    public A1 f50283U;

    /* renamed from: V, reason: collision with root package name */
    public Boolean f50284V;

    /* renamed from: W, reason: collision with root package name */
    public String f50285W;

    /* renamed from: X, reason: collision with root package name */
    public F3.f f50286X;

    /* renamed from: a, reason: collision with root package name */
    public String f50287a;

    /* renamed from: b, reason: collision with root package name */
    public String f50288b;

    /* renamed from: c, reason: collision with root package name */
    public String f50289c;

    /* renamed from: d, reason: collision with root package name */
    public String f50290d;

    /* renamed from: e, reason: collision with root package name */
    public String f50291e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f50292f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f50293g;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f50294h;

    /* renamed from: i, reason: collision with root package name */
    public Double f50295i;

    /* renamed from: j, reason: collision with root package name */
    public Double f50296j;

    /* renamed from: k, reason: collision with root package name */
    public Double f50297k;

    /* renamed from: l, reason: collision with root package name */
    public F3.n f50298l;

    /* renamed from: n, reason: collision with root package name */
    public F3.m f50300n;

    /* renamed from: s, reason: collision with root package name */
    public String f50305s;

    /* renamed from: t, reason: collision with root package name */
    public Long f50306t;

    /* renamed from: u, reason: collision with root package name */
    public Long f50307u;

    /* renamed from: v, reason: collision with root package name */
    public Long f50308v;

    /* renamed from: x, reason: collision with root package name */
    public List f50310x;

    /* renamed from: y, reason: collision with root package name */
    public Boolean f50311y;

    /* renamed from: z, reason: collision with root package name */
    public Boolean f50312z;

    /* renamed from: m, reason: collision with root package name */
    public final Map f50299m = new ConcurrentHashMap();

    /* renamed from: o, reason: collision with root package name */
    public final List f50301o = new CopyOnWriteArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final List f50302p = new CopyOnWriteArrayList();

    /* renamed from: q, reason: collision with root package name */
    public List f50303q = null;

    /* renamed from: r, reason: collision with root package name */
    public final List f50304r = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public final Set f50309w = new CopyOnWriteArraySet();

    /* renamed from: A, reason: collision with root package name */
    public Set f50263A = new CopyOnWriteArraySet();

    public static F g(io.sentry.config.f fVar, ILogger iLogger) {
        F f10 = new F();
        f10.j0(fVar.getProperty("dsn"));
        f10.v0(fVar.getProperty("environment"));
        f10.L0(fVar.getProperty("release"));
        f10.i0(fVar.getProperty("dist"));
        f10.Q0(fVar.getProperty("servername"));
        f10.t0(fVar.getBooleanProperty("uncaught.handler.enabled"));
        f10.E0(fVar.getBooleanProperty("uncaught.handler.print-stacktrace"));
        f10.M0(fVar.b("sample-rate"));
        f10.W0(fVar.b("traces-sample-rate"));
        f10.H0(fVar.b("profiles-sample-rate"));
        f10.h0(fVar.getBooleanProperty("debug"));
        f10.n0(fVar.getBooleanProperty("enable-deduplication"));
        f10.N0(fVar.getBooleanProperty("send-client-reports"));
        f10.w0(fVar.getBooleanProperty("force-init"));
        String property = fVar.getProperty("max-request-body-size");
        if (property != null) {
            f10.C0(F3.n.valueOf(property.toUpperCase(Locale.ROOT)));
        }
        for (Map.Entry entry : fVar.getMap("tags").entrySet()) {
            f10.V0((String) entry.getKey(), (String) entry.getValue());
        }
        String property2 = fVar.getProperty("proxy.host");
        String property3 = fVar.getProperty("proxy.user");
        String property4 = fVar.getProperty("proxy.pass");
        String c10 = fVar.c("proxy.port", "80");
        if (property2 != null) {
            f10.K0(new F3.m(property2, c10, property3, property4));
        }
        Iterator it = fVar.d("in-app-includes").iterator();
        while (it.hasNext()) {
            f10.e((String) it.next());
        }
        Iterator it2 = fVar.d("in-app-excludes").iterator();
        while (it2.hasNext()) {
            f10.d((String) it2.next());
        }
        List d10 = fVar.getProperty("trace-propagation-targets") != null ? fVar.d("trace-propagation-targets") : null;
        if (d10 == null && fVar.getProperty("tracing-origins") != null) {
            d10 = fVar.d("tracing-origins");
        }
        if (d10 != null) {
            Iterator it3 = d10.iterator();
            while (it3.hasNext()) {
                f10.f((String) it3.next());
            }
        }
        Iterator it4 = fVar.d("context-tags").iterator();
        while (it4.hasNext()) {
            f10.b((String) it4.next());
        }
        f10.J0(fVar.getProperty("proguard-uuid"));
        Iterator it5 = fVar.d("bundle-ids").iterator();
        while (it5.hasNext()) {
            f10.a((String) it5.next());
        }
        f10.y0(fVar.a("idle-timeout"));
        f10.S0(fVar.a("shutdown-timeout-millis"));
        f10.R0(fVar.a("session-flush-timeout-millis"));
        f10.A0(fVar.e("ignored-errors"));
        f10.u0(fVar.getBooleanProperty(ViewProps.ENABLED));
        f10.q0(fVar.getBooleanProperty("enable-pretty-serialization-output"));
        f10.P0(fVar.getBooleanProperty("send-modules"));
        f10.O0(fVar.getBooleanProperty("send-default-pii"));
        f10.z0(fVar.e("ignored-checkins"));
        f10.B0(fVar.e("ignored-transactions"));
        f10.k0(fVar.getBooleanProperty("enable-backpressure-handling"));
        f10.m0(fVar.getBooleanProperty("enable-database-transaction-tracing"));
        f10.l0(fVar.getBooleanProperty("enable-cache-tracing"));
        f10.r0(fVar.getBooleanProperty("enable-queue-tracing"));
        f10.x0(fVar.getBooleanProperty("global-hub-mode"));
        f10.f0(fVar.getBooleanProperty("capture-open-telemetry-events"));
        f10.o0(fVar.getBooleanProperty("logs.enabled"));
        f10.p0(fVar.getBooleanProperty("metrics.enabled"));
        for (String str : fVar.d("ignored-exceptions-for-type")) {
            try {
                Class<?> cls = Class.forName(str);
                if (Throwable.class.isAssignableFrom(cls)) {
                    f10.c(cls);
                } else {
                    iLogger.c(EnumC4788n3.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", str, str);
                }
            } catch (ClassNotFoundException unused) {
                iLogger.c(EnumC4788n3.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", str, str);
            }
        }
        Long a10 = fVar.a("cron.default-checkin-margin");
        Long a11 = fVar.a("cron.default-max-runtime");
        String property5 = fVar.getProperty("cron.default-timezone");
        Long a12 = fVar.a("cron.default-failure-issue-threshold");
        Long a13 = fVar.a("cron.default-recovery-threshold");
        if (a10 != null || a11 != null || property5 != null || a12 != null || a13 != null) {
            F3.f fVar2 = new F3.f();
            fVar2.f(a10);
            fVar2.h(a11);
            fVar2.j(property5);
            fVar2.g(a12);
            fVar2.i(a13);
            f10.g0(fVar2);
        }
        f10.U0(fVar.getBooleanProperty("enable-strict-trace-continuation"));
        f10.D0(fVar.getProperty("org-id"));
        f10.s0(fVar.getBooleanProperty("enable-spotlight"));
        f10.T0(fVar.getProperty("spotlight-connection-url"));
        f10.G0(fVar.b("profile-session-sample-rate"));
        f10.I0(fVar.getProperty("profiling-traces-dir-path"));
        String property6 = fVar.getProperty("profile-lifecycle");
        if (property6 != null && !property6.isEmpty()) {
            f10.F0(A1.valueOf(property6.toUpperCase()));
        }
        return f10;
    }

    public A1 A() {
        return this.f50283U;
    }

    public void A0(List list) {
        this.f50310x = list;
    }

    public Double B() {
        return this.f50281S;
    }

    public void B0(List list) {
        this.f50271I = list;
    }

    public Double C() {
        return this.f50297k;
    }

    public void C0(F3.n nVar) {
        this.f50298l = nVar;
    }

    public String D() {
        return this.f50282T;
    }

    public void D0(String str) {
        this.f50285W = str;
    }

    public String E() {
        return this.f50305s;
    }

    public void E0(Boolean bool) {
        this.f50311y = bool;
    }

    public F3.m F() {
        return this.f50300n;
    }

    public void F0(A1 a12) {
        this.f50283U = a12;
    }

    public String G() {
        return this.f50289c;
    }

    public void G0(Double d10) {
        this.f50281S = d10;
    }

    public Double H() {
        return this.f50295i;
    }

    public void H0(Double d10) {
        this.f50297k = d10;
    }

    public Boolean I() {
        return this.f50312z;
    }

    public void I0(String str) {
        this.f50282T = str;
    }

    public String J() {
        return this.f50291e;
    }

    public void J0(String str) {
        this.f50305s = str;
    }

    public Long K() {
        return this.f50308v;
    }

    public void K0(F3.m mVar) {
        this.f50300n = mVar;
    }

    public Long L() {
        return this.f50307u;
    }

    public void L0(String str) {
        this.f50289c = str;
    }

    public String M() {
        return this.f50269G;
    }

    public void M0(Double d10) {
        this.f50295i = d10;
    }

    public Map N() {
        return this.f50299m;
    }

    public void N0(Boolean bool) {
        this.f50312z = bool;
    }

    public List O() {
        return this.f50303q;
    }

    public void O0(Boolean bool) {
        this.f50273K = bool;
    }

    public Double P() {
        return this.f50296j;
    }

    public void P0(Boolean bool) {
        this.f50272J = bool;
    }

    public Boolean Q() {
        return this.f50280R;
    }

    public void Q0(String str) {
        this.f50291e = str;
    }

    public Boolean R() {
        return this.f50274L;
    }

    public void R0(Long l10) {
        this.f50308v = l10;
    }

    public Boolean S() {
        return this.f50276N;
    }

    public void S0(Long l10) {
        this.f50307u = l10;
    }

    public Boolean T() {
        return this.f50275M;
    }

    public void T0(String str) {
        this.f50269G = str;
    }

    public Boolean U() {
        return this.f50267E;
    }

    public void U0(Boolean bool) {
        this.f50284V = bool;
    }

    public Boolean V() {
        return this.f50268F;
    }

    public void V0(String str, String str2) {
        this.f50299m.put(str, str2);
    }

    public Boolean W() {
        return this.f50265C;
    }

    public void W0(Double d10) {
        this.f50296j = d10;
    }

    public Boolean X() {
        return this.f50277O;
    }

    public Boolean Y() {
        return this.f50266D;
    }

    public Boolean Z() {
        return this.f50264B;
    }

    public void a(String str) {
        this.f50263A.add(str);
    }

    public Boolean a0() {
        return this.f50279Q;
    }

    public void b(String str) {
        this.f50304r.add(str);
    }

    public Boolean b0() {
        return this.f50278P;
    }

    public void c(Class cls) {
        this.f50309w.add(cls);
    }

    public Boolean c0() {
        return this.f50273K;
    }

    public void d(String str) {
        this.f50301o.add(str);
    }

    public Boolean d0() {
        return this.f50272J;
    }

    public void e(String str) {
        this.f50302p.add(str);
    }

    public Boolean e0() {
        return this.f50284V;
    }

    public void f(String str) {
        if (this.f50303q == null) {
            this.f50303q = new CopyOnWriteArrayList();
        }
        if (str.isEmpty()) {
            return;
        }
        this.f50303q.add(str);
    }

    public void f0(Boolean bool) {
        this.f50280R = bool;
    }

    public void g0(F3.f fVar) {
        this.f50286X = fVar;
    }

    public Set h() {
        return this.f50263A;
    }

    public void h0(Boolean bool) {
        this.f50293g = bool;
    }

    public List i() {
        return this.f50304r;
    }

    public void i0(String str) {
        this.f50290d = str;
    }

    public F3.f j() {
        return this.f50286X;
    }

    public void j0(String str) {
        this.f50287a = str;
    }

    public Boolean k() {
        return this.f50293g;
    }

    public void k0(Boolean bool) {
        this.f50274L = bool;
    }

    public String l() {
        return this.f50290d;
    }

    public void l0(Boolean bool) {
        this.f50276N = bool;
    }

    public String m() {
        return this.f50287a;
    }

    public void m0(Boolean bool) {
        this.f50275M = bool;
    }

    public Boolean n() {
        return this.f50294h;
    }

    public void n0(Boolean bool) {
        this.f50294h = bool;
    }

    public Boolean o() {
        return this.f50292f;
    }

    public void o0(Boolean bool) {
        this.f50267E = bool;
    }

    public String p() {
        return this.f50288b;
    }

    public void p0(Boolean bool) {
        this.f50268F = bool;
    }

    public Long q() {
        return this.f50306t;
    }

    public void q0(Boolean bool) {
        this.f50265C = bool;
    }

    public List r() {
        return this.f50270H;
    }

    public void r0(Boolean bool) {
        this.f50277O = bool;
    }

    public List s() {
        return this.f50310x;
    }

    public void s0(Boolean bool) {
        this.f50266D = bool;
    }

    public Set t() {
        return this.f50309w;
    }

    public void t0(Boolean bool) {
        this.f50292f = bool;
    }

    public List u() {
        return this.f50271I;
    }

    public void u0(Boolean bool) {
        this.f50264B = bool;
    }

    public List v() {
        return this.f50301o;
    }

    public void v0(String str) {
        this.f50288b = str;
    }

    public List w() {
        return this.f50302p;
    }

    public void w0(Boolean bool) {
        this.f50279Q = bool;
    }

    public F3.n x() {
        return this.f50298l;
    }

    public void x0(Boolean bool) {
        this.f50278P = bool;
    }

    public String y() {
        return this.f50285W;
    }

    public void y0(Long l10) {
        this.f50306t = l10;
    }

    public Boolean z() {
        return this.f50311y;
    }

    public void z0(List list) {
        this.f50270H = list;
    }
}
