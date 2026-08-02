package io.sentry;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.L2;
import io.sentry.l3;
import io.sentry.protocol.t;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class Q2 implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private io.sentry.protocol.t f66718a;

    /* renamed from: b, reason: collision with root package name */
    private l3 f66719b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private Double f66720c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private String f66721d;

    /* renamed from: e, reason: collision with root package name */
    private String f66722e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private String f66723f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private Double f66724g;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, L2> f66725h;

    /* renamed from: i, reason: collision with root package name */
    private HashMap f66726i;

    public static final class a implements InterfaceC7174n0<Q2> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final Q2 a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            HashMap hashMap = null;
            io.sentry.protocol.t tVar = null;
            Double d11 = null;
            String str = null;
            String str2 = null;
            Double d12 = null;
            HashMap hashMap2 = null;
            l3 l3Var = null;
            String str3 = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "span_id":
                        l3Var = (l3) interfaceC7131c1.S(iLogger, new l3.a());
                        break;
                    case "name":
                        str = interfaceC7131c1.k0();
                        break;
                    case "type":
                        str2 = interfaceC7131c1.k0();
                        break;
                    case "unit":
                        str3 = interfaceC7131c1.k0();
                        break;
                    case "timestamp":
                        d11 = interfaceC7131c1.g1();
                        break;
                    case "value":
                        d12 = interfaceC7131c1.g1();
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
            if (str2 == null) {
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"type\"");
                iLogger.a(I2.ERROR, "Missing required field \"type\"", illegalStateException3);
                throw illegalStateException3;
            }
            if (str == null) {
                IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"name\"");
                iLogger.a(I2.ERROR, "Missing required field \"name\"", illegalStateException4);
                throw illegalStateException4;
            }
            if (d12 == null) {
                IllegalStateException illegalStateException5 = new IllegalStateException("Missing required field \"value\"");
                iLogger.a(I2.ERROR, "Missing required field \"value\"", illegalStateException5);
                throw illegalStateException5;
            }
            Q2 q22 = new Q2(tVar, d11, str, str2, d12);
            q22.a(hashMap2);
            q22.b(l3Var);
            q22.c(str3);
            q22.d(hashMap);
            return q22;
        }
    }

    public Q2(@NotNull io.sentry.protocol.t tVar, @NotNull Double d11, @NotNull String str, @NotNull String str2, @NotNull Double d12) {
        this.f66718a = tVar;
        this.f66720c = d11;
        this.f66721d = str;
        this.f66723f = str2;
        this.f66724g = d12;
    }

    public final void a(Map<String, L2> map) {
        this.f66725h = map;
    }

    public final void b(l3 l3Var) {
        this.f66719b = l3Var;
    }

    public final void c(String str) {
        this.f66722e = str;
    }

    public final void d(Map<String, Object> map) {
        this.f66726i = (HashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        c7212v0.g("timestamp");
        c7212v0.m(iLogger, C7165l.a(this.f66720c));
        c7212v0.g("type");
        c7212v0.p(this.f66723f);
        c7212v0.g(AppMeasurementSdk.ConditionalUserProperty.NAME);
        c7212v0.p(this.f66721d);
        c7212v0.g(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c7212v0.o(this.f66724g);
        c7212v0.g("trace_id");
        c7212v0.m(iLogger, this.f66718a);
        if (this.f66719b != null) {
            c7212v0.g("span_id");
            c7212v0.m(iLogger, this.f66719b);
        }
        if (this.f66722e != null) {
            c7212v0.g("unit");
            c7212v0.m(iLogger, this.f66722e);
        }
        if (this.f66725h != null) {
            c7212v0.g("attributes");
            c7212v0.m(iLogger, this.f66725h);
        }
        HashMap hashMap = this.f66726i;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                I1.w.e(this.f66726i, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }
}
