package io.sentry;

import io.sentry.L2;
import io.sentry.N2;
import io.sentry.l3;
import io.sentry.protocol.t;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class K2 implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private io.sentry.protocol.t f66662a;

    /* renamed from: b, reason: collision with root package name */
    private l3 f66663b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private Double f66664c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private String f66665d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private N2 f66666e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f66667f;

    /* renamed from: g, reason: collision with root package name */
    private Map<String, L2> f66668g;

    /* renamed from: h, reason: collision with root package name */
    private HashMap f66669h;

    public static final class a implements InterfaceC7174n0<K2> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final K2 a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            io.sentry.protocol.t tVar = null;
            Double d11 = null;
            String str = null;
            HashMap hashMap = null;
            N2 n22 = null;
            HashMap hashMap2 = null;
            Integer num = null;
            l3 l3Var = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "span_id":
                        l3Var = (l3) interfaceC7131c1.S(iLogger, new l3.a());
                        break;
                    case "severity_number":
                        num = interfaceC7131c1.A1();
                        break;
                    case "body":
                        str = interfaceC7131c1.k0();
                        break;
                    case "timestamp":
                        d11 = interfaceC7131c1.g1();
                        break;
                    case "level":
                        n22 = (N2) interfaceC7131c1.S(iLogger, new N2.a());
                        break;
                    case "attributes":
                        hashMap2 = interfaceC7131c1.G1(iLogger, new L2.a());
                        break;
                    case "trace_id":
                        tVar = (io.sentry.protocol.t) interfaceC7131c1.S(iLogger, new t.a());
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        interfaceC7131c1.Q0(iLogger, hashMap, nextName);
                        break;
                }
            }
            interfaceC7131c1.endObject();
            if (tVar == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                iLogger.a(I2.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (d11 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"timestamp\"");
                iLogger.a(I2.ERROR, "Missing required field \"timestamp\"", illegalStateException2);
                throw illegalStateException2;
            }
            if (str == null) {
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"body\"");
                iLogger.a(I2.ERROR, "Missing required field \"body\"", illegalStateException3);
                throw illegalStateException3;
            }
            if (n22 == null) {
                IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"level\"");
                iLogger.a(I2.ERROR, "Missing required field \"level\"", illegalStateException4);
                throw illegalStateException4;
            }
            K2 k22 = new K2(tVar, d11, str, n22);
            k22.a(hashMap2);
            k22.b(num);
            k22.c(l3Var);
            k22.d(hashMap);
            return k22;
        }
    }

    public K2(@NotNull io.sentry.protocol.t tVar, @NotNull Double d11, @NotNull String str, @NotNull N2 n22) {
        this.f66662a = tVar;
        this.f66664c = d11;
        this.f66665d = str;
        this.f66666e = n22;
    }

    public final void a(Map<String, L2> map) {
        this.f66668g = map;
    }

    public final void b(Integer num) {
        this.f66667f = num;
    }

    public final void c(l3 l3Var) {
        this.f66663b = l3Var;
    }

    public final void d(Map<String, Object> map) {
        this.f66669h = (HashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        c7212v0.g("timestamp");
        c7212v0.m(iLogger, C7165l.a(this.f66664c));
        c7212v0.g("trace_id");
        c7212v0.m(iLogger, this.f66662a);
        if (this.f66663b != null) {
            c7212v0.g("span_id");
            c7212v0.m(iLogger, this.f66663b);
        }
        c7212v0.g("body");
        c7212v0.p(this.f66665d);
        c7212v0.g("level");
        c7212v0.m(iLogger, this.f66666e);
        if (this.f66667f != null) {
            c7212v0.g("severity_number");
            c7212v0.m(iLogger, this.f66667f);
        }
        if (this.f66668g != null) {
            c7212v0.g("attributes");
            c7212v0.m(iLogger, this.f66668g);
        }
        HashMap hashMap = this.f66669h;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                I1.w.e(this.f66669h, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }
}
