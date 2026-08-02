package io.sentry;

import io.sentry.W2;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class B {

    /* renamed from: B, reason: collision with root package name */
    private Boolean f66542B;

    /* renamed from: C, reason: collision with root package name */
    private Boolean f66543C;

    /* renamed from: D, reason: collision with root package name */
    private Boolean f66544D;

    /* renamed from: E, reason: collision with root package name */
    private Boolean f66545E;

    /* renamed from: F, reason: collision with root package name */
    private Boolean f66546F;

    /* renamed from: G, reason: collision with root package name */
    private String f66547G;

    /* renamed from: H, reason: collision with root package name */
    private List<String> f66548H;

    /* renamed from: I, reason: collision with root package name */
    private List<String> f66549I;

    /* renamed from: J, reason: collision with root package name */
    private Boolean f66550J;

    /* renamed from: K, reason: collision with root package name */
    private Boolean f66551K;

    /* renamed from: L, reason: collision with root package name */
    private Boolean f66552L;

    /* renamed from: M, reason: collision with root package name */
    private Boolean f66553M;

    /* renamed from: N, reason: collision with root package name */
    private Boolean f66554N;

    /* renamed from: O, reason: collision with root package name */
    private Boolean f66555O;

    /* renamed from: P, reason: collision with root package name */
    private Boolean f66556P;

    /* renamed from: Q, reason: collision with root package name */
    private Double f66557Q;

    /* renamed from: R, reason: collision with root package name */
    private String f66558R;

    /* renamed from: S, reason: collision with root package name */
    private EnumC7159j1 f66559S;

    /* renamed from: T, reason: collision with root package name */
    private W2.f f66560T;

    /* renamed from: a, reason: collision with root package name */
    private String f66561a;

    /* renamed from: b, reason: collision with root package name */
    private String f66562b;

    /* renamed from: c, reason: collision with root package name */
    private String f66563c;

    /* renamed from: d, reason: collision with root package name */
    private String f66564d;

    /* renamed from: e, reason: collision with root package name */
    private String f66565e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f66566f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f66567g;

    /* renamed from: h, reason: collision with root package name */
    private Boolean f66568h;

    /* renamed from: i, reason: collision with root package name */
    private Double f66569i;

    /* renamed from: j, reason: collision with root package name */
    private Double f66570j;

    /* renamed from: k, reason: collision with root package name */
    private Double f66571k;

    /* renamed from: l, reason: collision with root package name */
    private W2.n f66572l;

    /* renamed from: n, reason: collision with root package name */
    private W2.m f66574n;

    /* renamed from: s, reason: collision with root package name */
    private String f66579s;

    /* renamed from: t, reason: collision with root package name */
    private Long f66580t;

    /* renamed from: u, reason: collision with root package name */
    private Long f66581u;

    /* renamed from: v, reason: collision with root package name */
    private Long f66582v;

    /* renamed from: x, reason: collision with root package name */
    private List<String> f66584x;

    /* renamed from: y, reason: collision with root package name */
    private Boolean f66585y;

    /* renamed from: z, reason: collision with root package name */
    private Boolean f66586z;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap f66573m = new ConcurrentHashMap();

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArrayList f66575o = new CopyOnWriteArrayList();

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArrayList f66576p = new CopyOnWriteArrayList();

    /* renamed from: q, reason: collision with root package name */
    private CopyOnWriteArrayList f66577q = null;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArrayList f66578r = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArraySet f66583w = new CopyOnWriteArraySet();

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    private CopyOnWriteArraySet f66541A = new CopyOnWriteArraySet();

    @NotNull
    public static B a(@NotNull io.sentry.config.f fVar, @NotNull ILogger iLogger) {
        B b11 = new B();
        b11.f66561a = fVar.f("dsn");
        b11.f66562b = fVar.f("environment");
        b11.f66563c = fVar.f("release");
        b11.f66564d = fVar.f("dist");
        b11.f66565e = fVar.f("servername");
        b11.f66566f = fVar.c("uncaught.handler.enabled");
        b11.f66585y = fVar.c("uncaught.handler.print-stacktrace");
        b11.f66569i = fVar.a("sample-rate");
        b11.f66570j = fVar.a("traces-sample-rate");
        b11.f66571k = fVar.a("profiles-sample-rate");
        b11.f66567g = fVar.c("debug");
        b11.f66568h = fVar.c("enable-deduplication");
        b11.f66586z = fVar.c("send-client-reports");
        b11.f66555O = fVar.c("force-init");
        String f7 = fVar.f("max-request-body-size");
        if (f7 != null) {
            b11.f66572l = W2.n.valueOf(f7.toUpperCase(Locale.ROOT));
        }
        for (Map.Entry entry : ((ConcurrentHashMap) fVar.getMap()).entrySet()) {
            b11.f66573m.put((String) entry.getKey(), (String) entry.getValue());
        }
        String f11 = fVar.f("proxy.host");
        String f12 = fVar.f("proxy.user");
        String f13 = fVar.f("proxy.pass");
        String f14 = fVar.f("proxy.port");
        if (f14 == null) {
            f14 = "80";
        }
        if (f11 != null) {
            b11.f66574n = new W2.m(f11, f14, f12, f13);
        }
        Iterator<String> it = fVar.b("in-app-includes").iterator();
        while (it.hasNext()) {
            b11.f66576p.add(it.next());
        }
        Iterator<String> it2 = fVar.b("in-app-excludes").iterator();
        while (it2.hasNext()) {
            b11.f66575o.add(it2.next());
        }
        List<String> b12 = fVar.f("trace-propagation-targets") != null ? fVar.b("trace-propagation-targets") : null;
        if (b12 == null && fVar.f("tracing-origins") != null) {
            b12 = fVar.b("tracing-origins");
        }
        if (b12 != null) {
            for (String str : b12) {
                if (b11.f66577q == null) {
                    b11.f66577q = new CopyOnWriteArrayList();
                }
                if (!str.isEmpty()) {
                    b11.f66577q.add(str);
                }
            }
        }
        Iterator<String> it3 = fVar.b("context-tags").iterator();
        while (it3.hasNext()) {
            b11.f66578r.add(it3.next());
        }
        b11.f66579s = fVar.f("proguard-uuid");
        Iterator<String> it4 = fVar.b("bundle-ids").iterator();
        while (it4.hasNext()) {
            b11.f66541A.add(it4.next());
        }
        b11.f66580t = fVar.e("idle-timeout");
        b11.f66581u = fVar.e("shutdown-timeout-millis");
        b11.f66582v = fVar.e("session-flush-timeout-millis");
        b11.f66584x = fVar.d("ignored-errors");
        b11.f66542B = fVar.c("enabled");
        b11.f66543C = fVar.c("enable-pretty-serialization-output");
        b11.f66550J = fVar.c("send-modules");
        b11.f66551K = fVar.c("send-default-pii");
        b11.f66548H = fVar.d("ignored-checkins");
        b11.f66549I = fVar.d("ignored-transactions");
        b11.f66552L = fVar.c("enable-backpressure-handling");
        b11.f66553M = fVar.c("enable-database-transaction-tracing");
        b11.f66554N = fVar.c("global-hub-mode");
        b11.f66556P = fVar.c("capture-open-telemetry-events");
        b11.f66545E = fVar.c("logs.enabled");
        b11.f66546F = fVar.c("metrics.enabled");
        for (String str2 : fVar.b("ignored-exceptions-for-type")) {
            try {
                Class<?> cls = Class.forName(str2);
                if (Throwable.class.isAssignableFrom(cls)) {
                    b11.f66583w.add(cls);
                } else {
                    iLogger.c(I2.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", str2, str2);
                }
            } catch (ClassNotFoundException unused) {
                iLogger.c(I2.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", str2, str2);
            }
        }
        Long e11 = fVar.e("cron.default-checkin-margin");
        Long e12 = fVar.e("cron.default-max-runtime");
        String f15 = fVar.f("cron.default-timezone");
        Long e13 = fVar.e("cron.default-failure-issue-threshold");
        Long e14 = fVar.e("cron.default-recovery-threshold");
        if (e11 != null || e12 != null || f15 != null || e13 != null || e14 != null) {
            W2.f fVar2 = new W2.f();
            fVar2.f(e11);
            fVar2.h(e12);
            fVar2.j(f15);
            fVar2.g(e13);
            fVar2.i(e14);
            b11.f66560T = fVar2;
        }
        b11.f66544D = fVar.c("enable-spotlight");
        b11.f66547G = fVar.f("spotlight-connection-url");
        b11.f66557Q = fVar.a("profile-session-sample-rate");
        b11.f66558R = fVar.f("profiling-traces-dir-path");
        String f16 = fVar.f("profile-lifecycle");
        if (f16 != null && !f16.isEmpty()) {
            b11.f66559S = EnumC7159j1.valueOf(f16.toUpperCase());
        }
        return b11;
    }

    public final Double A() {
        return this.f66569i;
    }

    public final Boolean B() {
        return this.f66586z;
    }

    public final String C() {
        return this.f66565e;
    }

    public final Long D() {
        return this.f66582v;
    }

    public final Long E() {
        return this.f66581u;
    }

    public final String F() {
        return this.f66547G;
    }

    @NotNull
    public final ConcurrentHashMap G() {
        return this.f66573m;
    }

    public final List<String> H() {
        return this.f66577q;
    }

    public final Double I() {
        return this.f66570j;
    }

    public final Boolean J() {
        return this.f66556P;
    }

    public final Boolean K() {
        return this.f66552L;
    }

    public final Boolean L() {
        return this.f66553M;
    }

    public final Boolean M() {
        return this.f66545E;
    }

    public final Boolean N() {
        return this.f66546F;
    }

    public final Boolean O() {
        return this.f66543C;
    }

    public final Boolean P() {
        return this.f66544D;
    }

    public final Boolean Q() {
        return this.f66542B;
    }

    public final Boolean R() {
        return this.f66555O;
    }

    public final Boolean S() {
        return this.f66554N;
    }

    public final Boolean T() {
        return this.f66551K;
    }

    public final Boolean U() {
        return this.f66550J;
    }

    @NotNull
    public final CopyOnWriteArraySet b() {
        return this.f66541A;
    }

    @NotNull
    public final CopyOnWriteArrayList c() {
        return this.f66578r;
    }

    public final W2.f d() {
        return this.f66560T;
    }

    public final Boolean e() {
        return this.f66567g;
    }

    public final String f() {
        return this.f66564d;
    }

    public final String g() {
        return this.f66561a;
    }

    public final Boolean h() {
        return this.f66568h;
    }

    public final Boolean i() {
        return this.f66566f;
    }

    public final String j() {
        return this.f66562b;
    }

    public final Long k() {
        return this.f66580t;
    }

    public final List<String> l() {
        return this.f66548H;
    }

    public final List<String> m() {
        return this.f66584x;
    }

    @NotNull
    public final CopyOnWriteArraySet n() {
        return this.f66583w;
    }

    public final List<String> o() {
        return this.f66549I;
    }

    @NotNull
    public final CopyOnWriteArrayList p() {
        return this.f66575o;
    }

    @NotNull
    public final CopyOnWriteArrayList q() {
        return this.f66576p;
    }

    public final W2.n r() {
        return this.f66572l;
    }

    public final Boolean s() {
        return this.f66585y;
    }

    public final EnumC7159j1 t() {
        return this.f66559S;
    }

    public final Double u() {
        return this.f66557Q;
    }

    public final Double v() {
        return this.f66571k;
    }

    public final String w() {
        return this.f66558R;
    }

    public final String x() {
        return this.f66579s;
    }

    public final W2.m y() {
        return this.f66574n;
    }

    public final String z() {
        return this.f66563c;
    }
}
