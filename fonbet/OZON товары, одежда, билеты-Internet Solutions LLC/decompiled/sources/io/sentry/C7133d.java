package io.sentry;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7133d {

    /* renamed from: f, reason: collision with root package name */
    private static final b f67847f = new b();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<String, String> f67848a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f67849b;

    /* renamed from: c, reason: collision with root package name */
    private Double f67850c;

    /* renamed from: d, reason: collision with root package name */
    private Double f67851d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f67852e;

    /* renamed from: io.sentry.d$a */
    /* loaded from: classes10.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final List<String> f67853a = Arrays.asList("sentry-trace_id", "sentry-public_key", "sentry-release", "sentry-user_id", "sentry-environment", "sentry-transaction", "sentry-sample_rate", "sentry-sample_rand", "sentry-sampled", "sentry-replay_id");
    }

    /* renamed from: io.sentry.d$b */
    private static class b extends ThreadLocal<DecimalFormat> {
        @Override // java.lang.ThreadLocal
        protected final DecimalFormat initialValue() {
            return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT));
        }
    }

    public C7133d(@NotNull ILogger iLogger) {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        this.f67849b = new io.sentry.util.a();
        this.f67848a = concurrentHashMap;
        this.f67850c = null;
        this.f67851d = null;
        this.f67852e = true;
    }

    @NotNull
    public static C7133d b(@NotNull O1 o12, String str, @NotNull W2 w22) {
        C7133d c7133d = new C7133d(w22.getLogger());
        j3 j11 = o12.C().j();
        c7133d.g("sentry-trace_id", j11 != null ? j11.o().toString() : null);
        c7133d.g("sentry-public_key", w22.retrieveParsedDsn().a());
        c7133d.g("sentry-release", o12.J());
        c7133d.g("sentry-environment", o12.F());
        c7133d.g("sentry-transaction", str);
        if (c7133d.f67852e) {
            c7133d.f67850c = null;
        }
        c7133d.g("sentry-sampled", null);
        c7133d.h(null);
        Object c11 = o12.C().c("replay_id");
        if (c11 != null && !c11.toString().equals(io.sentry.protocol.t.f68325b.toString())) {
            c7133d.g("sentry-replay_id", c11.toString());
            o12.C().n();
        }
        c7133d.f67852e = false;
        return c7133d;
    }

    public final void a() {
        this.f67852e = false;
    }

    public final String c(String str) {
        return this.f67848a.get(str);
    }

    public final Double d() {
        return this.f67851d;
    }

    public final Double e() {
        return this.f67850c;
    }

    public final boolean f() {
        return this.f67852e;
    }

    public final void g(@NotNull String str, String str2) {
        if (this.f67852e) {
            ConcurrentHashMap<String, String> concurrentHashMap = this.f67848a;
            if (str2 == null) {
                concurrentHashMap.remove(str);
            } else {
                concurrentHashMap.put(str, str2);
            }
        }
    }

    public final void h(Double d11) {
        if (this.f67852e) {
            this.f67851d = d11;
        }
    }

    public final void i(s3 s3Var) {
        if (s3Var == null) {
            return;
        }
        Boolean e11 = s3Var.e();
        int i11 = io.sentry.util.w.f68605c;
        g("sentry-sampled", e11 == null ? null : e11.toString());
        if (s3Var.c() != null) {
            h(s3Var.c());
        }
        if (s3Var.d() != null) {
            this.f67850c = s3Var.d();
        }
    }

    public final void j(@NotNull U u11, @NotNull W2 w22) {
        C7175n1 H11 = u11.H();
        io.sentry.protocol.t y11 = u11.y();
        g("sentry-trace_id", H11.d().toString());
        g("sentry-public_key", w22.retrieveParsedDsn().a());
        g("sentry-release", w22.getRelease());
        g("sentry-environment", w22.getEnvironment());
        if (!io.sentry.protocol.t.f68325b.equals(y11)) {
            g("sentry-replay_id", y11.toString());
        }
        g("sentry-transaction", null);
        if (this.f67852e) {
            this.f67850c = null;
        }
        g("sentry-sampled", null);
    }

    public final void k(@NotNull io.sentry.protocol.t tVar, io.sentry.protocol.t tVar2, @NotNull W2 w22, s3 s3Var, String str, io.sentry.protocol.D d11) {
        g("sentry-trace_id", tVar.toString());
        g("sentry-public_key", w22.retrieveParsedDsn().a());
        g("sentry-release", w22.getRelease());
        g("sentry-environment", w22.getEnvironment());
        if (d11 == null || io.sentry.protocol.D.URL.equals(d11)) {
            str = null;
        }
        g("sentry-transaction", str);
        if (tVar2 != null && !io.sentry.protocol.t.f68325b.equals(tVar2)) {
            g("sentry-replay_id", tVar2.toString());
        }
        Double d12 = s3Var == null ? null : s3Var.d();
        if (this.f67852e) {
            this.f67850c = d12;
        }
        Boolean e11 = s3Var == null ? null : s3Var.e();
        g("sentry-sampled", e11 == null ? null : e11.toString());
        h(s3Var != null ? s3Var.c() : null);
    }

    public final q3 l() {
        String c11 = c("sentry-trace_id");
        String c12 = c("sentry-replay_id");
        String c13 = c("sentry-public_key");
        if (c11 == null || c13 == null) {
            return null;
        }
        io.sentry.protocol.t tVar = new io.sentry.protocol.t(c11);
        String c14 = c("sentry-release");
        String c15 = c("sentry-environment");
        String c16 = c("sentry-user_id");
        String c17 = c("sentry-transaction");
        Double d11 = this.f67850c;
        boolean h11 = io.sentry.util.t.h(d11);
        b bVar = f67847f;
        String format = !h11 ? null : bVar.get().format(d11);
        String c18 = c("sentry-sampled");
        io.sentry.protocol.t tVar2 = c12 == null ? null : new io.sentry.protocol.t(c12);
        Double d12 = this.f67851d;
        q3 q3Var = new q3(tVar, c13, c14, c15, c16, c17, format, c18, tVar2, io.sentry.util.t.h(d12) ? bVar.get().format(d12) : null);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        InterfaceC7097a0 a11 = this.f67849b.a();
        try {
            for (Map.Entry<String, String> entry : this.f67848a.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!a.f67853a.contains(key) && value != null) {
                    concurrentHashMap.put(key.replaceFirst("sentry-", ""), value);
                }
            }
            a11.close();
            q3Var.c(concurrentHashMap);
            return q3Var;
        } finally {
        }
    }
}
