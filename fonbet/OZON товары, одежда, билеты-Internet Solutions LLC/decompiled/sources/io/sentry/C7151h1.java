package io.sentry;

import com.google.android.gms.common.Scopes;
import io.sentry.profilemeasurements.a;
import io.sentry.protocol.C7188d;
import io.sentry.protocol.profiling.a;
import io.sentry.protocol.r;
import io.sentry.protocol.t;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7151h1 implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private C7188d f67933a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private io.sentry.protocol.t f67934b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private io.sentry.protocol.t f67935c;

    /* renamed from: d, reason: collision with root package name */
    private io.sentry.protocol.r f67936d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final AbstractMap f67937e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private String f67938f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private String f67939g;

    /* renamed from: h, reason: collision with root package name */
    private String f67940h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private String f67941i;

    /* renamed from: j, reason: collision with root package name */
    private double f67942j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final File f67943k;

    /* renamed from: l, reason: collision with root package name */
    private String f67944l;

    /* renamed from: m, reason: collision with root package name */
    private io.sentry.protocol.profiling.a f67945m;

    /* renamed from: n, reason: collision with root package name */
    private ConcurrentHashMap f67946n;

    /* renamed from: io.sentry.h1$a */
    /* loaded from: classes10.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final io.sentry.protocol.t f67947a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final io.sentry.protocol.t f67948b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final ConcurrentHashMap f67949c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final File f67950d;

        /* renamed from: e, reason: collision with root package name */
        private final double f67951e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final String f67952f = "android";

        public a(@NotNull io.sentry.protocol.t tVar, @NotNull io.sentry.protocol.t tVar2, @NotNull HashMap hashMap, @NotNull File file, @NotNull T1 t12) {
            this.f67947a = tVar;
            this.f67948b = tVar2;
            this.f67949c = new ConcurrentHashMap(hashMap);
            this.f67950d = file;
            this.f67951e = t12.d() / 1.0E9d;
        }

        public final C7151h1 a(W2 w22) {
            ConcurrentHashMap concurrentHashMap = this.f67949c;
            Double valueOf = Double.valueOf(this.f67951e);
            return new C7151h1(this.f67947a, this.f67948b, this.f67950d, concurrentHashMap, valueOf, this.f67952f, w22);
        }
    }

    /* renamed from: io.sentry.h1$b */
    public static final class b implements InterfaceC7174n0<C7151h1> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final C7151h1 a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            C7151h1 c7151h1 = new C7151h1();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "debug_meta":
                        C7188d c7188d = (C7188d) interfaceC7131c1.S(iLogger, new C7188d.a());
                        if (c7188d == null) {
                            break;
                        } else {
                            c7151h1.f67933a = c7188d;
                            break;
                        }
                    case "measurements":
                        HashMap G12 = interfaceC7131c1.G1(iLogger, new a.C1115a());
                        if (G12 == null) {
                            break;
                        } else {
                            c7151h1.f67937e.putAll(G12);
                            break;
                        }
                    case "profile":
                        io.sentry.protocol.profiling.a aVar = (io.sentry.protocol.profiling.a) interfaceC7131c1.S(iLogger, new a.C1117a());
                        if (aVar == null) {
                            break;
                        } else {
                            c7151h1.f67945m = aVar;
                            break;
                        }
                    case "environment":
                        String k02 = interfaceC7131c1.k0();
                        if (k02 == null) {
                            break;
                        } else {
                            c7151h1.f67940h = k02;
                            break;
                        }
                    case "timestamp":
                        Double g12 = interfaceC7131c1.g1();
                        if (g12 == null) {
                            break;
                        } else {
                            c7151h1.f67942j = g12.doubleValue();
                            break;
                        }
                    case "profiler_id":
                        io.sentry.protocol.t tVar = (io.sentry.protocol.t) interfaceC7131c1.S(iLogger, new t.a());
                        if (tVar == null) {
                            break;
                        } else {
                            c7151h1.f67934b = tVar;
                            break;
                        }
                    case "version":
                        String k03 = interfaceC7131c1.k0();
                        if (k03 == null) {
                            break;
                        } else {
                            c7151h1.f67941i = k03;
                            break;
                        }
                    case "release":
                        String k04 = interfaceC7131c1.k0();
                        if (k04 == null) {
                            break;
                        } else {
                            c7151h1.f67939g = k04;
                            break;
                        }
                    case "client_sdk":
                        io.sentry.protocol.r rVar = (io.sentry.protocol.r) interfaceC7131c1.S(iLogger, new r.a());
                        if (rVar == null) {
                            break;
                        } else {
                            c7151h1.f67936d = rVar;
                            break;
                        }
                    case "platform":
                        String k05 = interfaceC7131c1.k0();
                        if (k05 == null) {
                            break;
                        } else {
                            c7151h1.f67938f = k05;
                            break;
                        }
                    case "sampled_profile":
                        String k06 = interfaceC7131c1.k0();
                        if (k06 == null) {
                            break;
                        } else {
                            c7151h1.f67944l = k06;
                            break;
                        }
                    case "chunk_id":
                        io.sentry.protocol.t tVar2 = (io.sentry.protocol.t) interfaceC7131c1.S(iLogger, new t.a());
                        if (tVar2 == null) {
                            break;
                        } else {
                            c7151h1.f67935c = tVar2;
                            break;
                        }
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                        break;
                }
            }
            c7151h1.t(concurrentHashMap);
            interfaceC7131c1.endObject();
            return c7151h1;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C7151h1() {
        this(r1, r1, new File("dummy"), new HashMap(), Double.valueOf(0.0d), "android", W2.empty());
        io.sentry.protocol.t tVar = io.sentry.protocol.t.f68325b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7151h1)) {
            return false;
        }
        C7151h1 c7151h1 = (C7151h1) obj;
        return Objects.equals(this.f67933a, c7151h1.f67933a) && Objects.equals(this.f67934b, c7151h1.f67934b) && Objects.equals(this.f67935c, c7151h1.f67935c) && Objects.equals(this.f67936d, c7151h1.f67936d) && Objects.equals(this.f67937e, c7151h1.f67937e) && Objects.equals(this.f67938f, c7151h1.f67938f) && Objects.equals(this.f67939g, c7151h1.f67939g) && Objects.equals(this.f67940h, c7151h1.f67940h) && Objects.equals(this.f67941i, c7151h1.f67941i) && Objects.equals(this.f67944l, c7151h1.f67944l) && Objects.equals(this.f67946n, c7151h1.f67946n) && Objects.equals(this.f67945m, c7151h1.f67945m);
    }

    public final int hashCode() {
        return Objects.hash(this.f67933a, this.f67934b, this.f67935c, this.f67936d, this.f67937e, this.f67938f, this.f67939g, this.f67940h, this.f67941i, this.f67944l, this.f67945m, this.f67946n);
    }

    @NotNull
    public final io.sentry.protocol.t m() {
        return this.f67935c;
    }

    public final C7188d n() {
        return this.f67933a;
    }

    @NotNull
    public final String o() {
        return this.f67938f;
    }

    @NotNull
    public final File p() {
        return this.f67943k;
    }

    public final void q(C7188d c7188d) {
        this.f67933a = c7188d;
    }

    public final void r(String str) {
        this.f67944l = str;
    }

    public final void s(io.sentry.protocol.profiling.a aVar) {
        this.f67945m = aVar;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        if (this.f67933a != null) {
            c7212v0.g("debug_meta");
            c7212v0.m(iLogger, this.f67933a);
        }
        c7212v0.g("profiler_id");
        c7212v0.m(iLogger, this.f67934b);
        c7212v0.g("chunk_id");
        c7212v0.m(iLogger, this.f67935c);
        if (this.f67936d != null) {
            c7212v0.g("client_sdk");
            c7212v0.m(iLogger, this.f67936d);
        }
        AbstractMap abstractMap = this.f67937e;
        if (!abstractMap.isEmpty()) {
            String e11 = c7212v0.e();
            c7212v0.i("");
            c7212v0.g("measurements");
            c7212v0.m(iLogger, abstractMap);
            c7212v0.i(e11);
        }
        c7212v0.g("platform");
        c7212v0.m(iLogger, this.f67938f);
        c7212v0.g("release");
        c7212v0.m(iLogger, this.f67939g);
        if (this.f67940h != null) {
            c7212v0.g("environment");
            c7212v0.m(iLogger, this.f67940h);
        }
        c7212v0.g("version");
        c7212v0.m(iLogger, this.f67941i);
        if (this.f67944l != null) {
            c7212v0.g("sampled_profile");
            c7212v0.m(iLogger, this.f67944l);
        }
        c7212v0.g("timestamp");
        c7212v0.m(iLogger, BigDecimal.valueOf(this.f67942j).setScale(6, RoundingMode.DOWN));
        if (this.f67945m != null) {
            c7212v0.g(Scopes.PROFILE);
            c7212v0.m(iLogger, this.f67945m);
        }
        ConcurrentHashMap concurrentHashMap = this.f67946n;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f67946n, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }

    public final void t(Map<String, Object> map) {
        this.f67946n = (ConcurrentHashMap) map;
    }

    public C7151h1(@NotNull io.sentry.protocol.t tVar, @NotNull io.sentry.protocol.t tVar2, @NotNull File file, @NotNull AbstractMap abstractMap, @NotNull Double d11, @NotNull String str, @NotNull W2 w22) {
        this.f67944l = null;
        this.f67934b = tVar;
        this.f67935c = tVar2;
        this.f67943k = file;
        this.f67937e = abstractMap;
        this.f67933a = null;
        this.f67936d = w22.getSdkVersion();
        this.f67939g = w22.getRelease() != null ? w22.getRelease() : "";
        this.f67940h = w22.getEnvironment();
        this.f67938f = str;
        this.f67941i = "2";
        this.f67942j = d11.doubleValue();
    }
}
