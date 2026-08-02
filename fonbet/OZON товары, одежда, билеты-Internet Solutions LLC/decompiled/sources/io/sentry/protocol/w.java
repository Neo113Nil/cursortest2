package io.sentry.protocol;

import B0.A0;
import io.sentry.C7137e;
import io.sentry.C7212v0;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import io.sentry.i3;
import io.sentry.l3;
import io.sentry.n3;
import io.sentry.protocol.k;
import io.sentry.protocol.t;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class w implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Double f68334a;

    /* renamed from: b, reason: collision with root package name */
    private final Double f68335b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final t f68336c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final l3 f68337d;

    /* renamed from: e, reason: collision with root package name */
    private final l3 f68338e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f68339f;

    /* renamed from: g, reason: collision with root package name */
    private final String f68340g;

    /* renamed from: h, reason: collision with root package name */
    private final n3 f68341h;

    /* renamed from: i, reason: collision with root package name */
    private final String f68342i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f68343j;

    /* renamed from: k, reason: collision with root package name */
    private Map<String, Object> f68344k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final Map<String, k> f68345l;

    /* renamed from: m, reason: collision with root package name */
    private ConcurrentHashMap f68346m;

    public static final class a implements InterfaceC7174n0<w> {
        private static IllegalStateException b(String str, ILogger iLogger) {
            String b11 = A0.b("Missing required field \"", str, "\"");
            IllegalStateException illegalStateException = new IllegalStateException(b11);
            iLogger.a(I2.ERROR, b11, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final w a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            char c11;
            interfaceC7131c1.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            Double d11 = null;
            Map map = null;
            t tVar = null;
            l3 l3Var = null;
            HashMap hashMap = null;
            String str = null;
            Double d12 = null;
            l3 l3Var2 = null;
            String str2 = null;
            n3 n3Var = null;
            String str3 = null;
            Map map2 = null;
            while (true) {
                ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                if (interfaceC7131c1.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                    if (d11 == null) {
                        throw b("start_timestamp", iLogger);
                    }
                    if (tVar == null) {
                        throw b("trace_id", iLogger);
                    }
                    if (l3Var == null) {
                        throw b("span_id", iLogger);
                    }
                    if (str == null) {
                        throw b("op", iLogger);
                    }
                    if (map == null) {
                        map = new HashMap();
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    w wVar = new w(d11, d12, tVar, l3Var, l3Var2, str, str2, n3Var, str3, map, hashMap, map2);
                    wVar.h(concurrentHashMap2);
                    interfaceC7131c1.endObject();
                    return wVar;
                }
                String nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName.hashCode()) {
                    case -2011840976:
                        if (nextName.equals("span_id")) {
                            c11 = 0;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1757797477:
                        if (nextName.equals("parent_span_id")) {
                            c11 = 1;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1724546052:
                        if (nextName.equals("description")) {
                            c11 = 2;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1526966919:
                        if (nextName.equals("start_timestamp")) {
                            c11 = 3;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1008619738:
                        if (nextName.equals("origin")) {
                            c11 = 4;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -892481550:
                        if (nextName.equals("status")) {
                            c11 = 5;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -362243017:
                        if (nextName.equals("measurements")) {
                            c11 = 6;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3553:
                        if (nextName.equals("op")) {
                            c11 = 7;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3076010:
                        if (nextName.equals("data")) {
                            c11 = '\b';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3552281:
                        if (nextName.equals("tags")) {
                            c11 = '\t';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 55126294:
                        if (nextName.equals("timestamp")) {
                            c11 = '\n';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1270300245:
                        if (nextName.equals("trace_id")) {
                            c11 = 11;
                            break;
                        }
                        c11 = 65535;
                        break;
                    default:
                        c11 = 65535;
                        break;
                }
                switch (c11) {
                    case 0:
                        l3Var = new l3(interfaceC7131c1.nextString());
                        break;
                    case 1:
                        l3Var2 = (l3) interfaceC7131c1.S(iLogger, new l3.a());
                        break;
                    case 2:
                        str2 = interfaceC7131c1.k0();
                        break;
                    case 3:
                        try {
                            d11 = interfaceC7131c1.g1();
                            break;
                        } catch (NumberFormatException unused) {
                            if (interfaceC7131c1.M(iLogger) == null) {
                                d11 = null;
                                break;
                            } else {
                                d11 = Double.valueOf(r6.getTime() / 1000.0d);
                                break;
                            }
                        }
                    case 4:
                        str3 = interfaceC7131c1.k0();
                        break;
                    case 5:
                        n3Var = (n3) interfaceC7131c1.S(iLogger, new n3.a());
                        break;
                    case 6:
                        hashMap = interfaceC7131c1.G1(iLogger, new k.a());
                        break;
                    case 7:
                        str = interfaceC7131c1.k0();
                        break;
                    case '\b':
                        map2 = (Map) interfaceC7131c1.U1();
                        break;
                    case '\t':
                        map = (Map) interfaceC7131c1.U1();
                        break;
                    case '\n':
                        try {
                            d12 = interfaceC7131c1.g1();
                            break;
                        } catch (NumberFormatException unused2) {
                            if (interfaceC7131c1.M(iLogger) == null) {
                                d12 = null;
                                break;
                            } else {
                                d12 = Double.valueOf(r6.getTime() / 1000.0d);
                                break;
                            }
                        }
                    case 11:
                        tVar = t.a.b(interfaceC7131c1);
                        break;
                    default:
                        concurrentHashMap = concurrentHashMap2 == null ? new ConcurrentHashMap() : concurrentHashMap2;
                        interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                        continue;
                }
                concurrentHashMap = concurrentHashMap2;
            }
        }
    }

    public w() {
        throw null;
    }

    public w(@NotNull i3 i3Var) {
        Map<String, Object> t2 = i3Var.t();
        this.f68340g = i3Var.getDescription();
        this.f68339f = i3Var.v();
        this.f68337d = i3Var.A();
        this.f68338e = i3Var.x();
        this.f68336c = i3Var.C();
        this.f68341h = i3Var.getStatus();
        this.f68342i = i3Var.e().f();
        ConcurrentHashMap a11 = io.sentry.util.c.a(i3Var.B());
        this.f68343j = a11 == null ? new ConcurrentHashMap() : a11;
        ConcurrentHashMap a12 = io.sentry.util.c.a(i3Var.u());
        this.f68345l = a12 == null ? new ConcurrentHashMap() : a12;
        this.f68335b = i3Var.r() == null ? null : Double.valueOf(i3Var.s().c(i3Var.r()) / 1.0E9d);
        this.f68334a = Double.valueOf(i3Var.s().d() / 1.0E9d);
        this.f68344k = t2;
        C7191g featureFlags = ((io.sentry.featureflags.d) i3Var.e().c()).getFeatureFlags();
        if (featureFlags != null) {
            if (this.f68344k == null) {
                this.f68344k = new HashMap();
            }
            for (C7190f c7190f : featureFlags.a()) {
                this.f68344k.put("flag.evaluation." + c7190f.a(), c7190f.b());
            }
        }
    }

    public final Map<String, Object> a() {
        return this.f68344k;
    }

    @NotNull
    public final Map<String, k> b() {
        return this.f68345l;
    }

    @NotNull
    public final String c() {
        return this.f68339f;
    }

    @NotNull
    public final l3 d() {
        return this.f68337d;
    }

    @NotNull
    public final Double e() {
        return this.f68334a;
    }

    public final Double f() {
        return this.f68335b;
    }

    public final void g(Map<String, Object> map) {
        this.f68344k = map;
    }

    public final void h(Map<String, Object> map) {
        this.f68346m = (ConcurrentHashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        c7212v0.g("start_timestamp");
        BigDecimal valueOf = BigDecimal.valueOf(this.f68334a.doubleValue());
        RoundingMode roundingMode = RoundingMode.DOWN;
        c7212v0.m(iLogger, valueOf.setScale(6, roundingMode));
        Double d11 = this.f68335b;
        if (d11 != null) {
            c7212v0.g("timestamp");
            c7212v0.m(iLogger, BigDecimal.valueOf(d11.doubleValue()).setScale(6, roundingMode));
        }
        c7212v0.g("trace_id");
        c7212v0.m(iLogger, this.f68336c);
        c7212v0.g("span_id");
        c7212v0.m(iLogger, this.f68337d);
        l3 l3Var = this.f68338e;
        if (l3Var != null) {
            c7212v0.g("parent_span_id");
            c7212v0.m(iLogger, l3Var);
        }
        c7212v0.g("op");
        c7212v0.p(this.f68339f);
        String str = this.f68340g;
        if (str != null) {
            c7212v0.g("description");
            c7212v0.p(str);
        }
        n3 n3Var = this.f68341h;
        if (n3Var != null) {
            c7212v0.g("status");
            c7212v0.m(iLogger, n3Var);
        }
        String str2 = this.f68342i;
        if (str2 != null) {
            c7212v0.g("origin");
            c7212v0.m(iLogger, str2);
        }
        Map<String, String> map = this.f68343j;
        if (!map.isEmpty()) {
            c7212v0.g("tags");
            c7212v0.m(iLogger, map);
        }
        if (this.f68344k != null) {
            c7212v0.g("data");
            c7212v0.m(iLogger, this.f68344k);
        }
        Map<String, k> map2 = this.f68345l;
        if (!map2.isEmpty()) {
            c7212v0.g("measurements");
            c7212v0.m(iLogger, map2);
        }
        ConcurrentHashMap concurrentHashMap = this.f68346m;
        if (concurrentHashMap != null) {
            for (String str3 : concurrentHashMap.keySet()) {
                C7137e.b(this.f68346m, str3, c7212v0, str3, iLogger);
            }
        }
        c7212v0.d();
    }

    public w(@NotNull Double d11, Double d12, @NotNull t tVar, @NotNull l3 l3Var, l3 l3Var2, @NotNull String str, String str2, n3 n3Var, String str3, @NotNull Map<String, String> map, @NotNull Map<String, k> map2, Map<String, Object> map3) {
        this.f68334a = d11;
        this.f68335b = d12;
        this.f68336c = tVar;
        this.f68337d = l3Var;
        this.f68338e = l3Var2;
        this.f68339f = str;
        this.f68340g = str2;
        this.f68341h = n3Var;
        this.f68342i = str3;
        this.f68343j = map;
        this.f68345l = map2;
        this.f68344k = map3;
    }
}
