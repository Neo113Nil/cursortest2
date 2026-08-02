package io.sentry;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7171m1 implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private String f68077a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private String f68078b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private String f68079c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private Long f68080d;

    /* renamed from: e, reason: collision with root package name */
    private Long f68081e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private Long f68082f;

    /* renamed from: g, reason: collision with root package name */
    private Long f68083g;

    /* renamed from: h, reason: collision with root package name */
    private ConcurrentHashMap f68084h;

    /* renamed from: io.sentry.m1$a */
    public static final class a implements InterfaceC7174n0<C7171m1> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final C7171m1 a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            C7171m1 c7171m1 = new C7171m1();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "relative_start_ns":
                        Long D12 = interfaceC7131c1.D1();
                        if (D12 == null) {
                            break;
                        } else {
                            c7171m1.f68080d = D12;
                            break;
                        }
                    case "relative_end_ns":
                        Long D13 = interfaceC7131c1.D1();
                        if (D13 == null) {
                            break;
                        } else {
                            c7171m1.f68081e = D13;
                            break;
                        }
                    case "id":
                        String k02 = interfaceC7131c1.k0();
                        if (k02 == null) {
                            break;
                        } else {
                            c7171m1.f68077a = k02;
                            break;
                        }
                    case "name":
                        String k03 = interfaceC7131c1.k0();
                        if (k03 == null) {
                            break;
                        } else {
                            c7171m1.f68079c = k03;
                            break;
                        }
                    case "trace_id":
                        String k04 = interfaceC7131c1.k0();
                        if (k04 == null) {
                            break;
                        } else {
                            c7171m1.f68078b = k04;
                            break;
                        }
                    case "relative_cpu_end_ms":
                        Long D14 = interfaceC7131c1.D1();
                        if (D14 == null) {
                            break;
                        } else {
                            c7171m1.f68083g = D14;
                            break;
                        }
                    case "relative_cpu_start_ms":
                        Long D15 = interfaceC7131c1.D1();
                        if (D15 == null) {
                            break;
                        } else {
                            c7171m1.f68082f = D15;
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
            c7171m1.l(concurrentHashMap);
            interfaceC7131c1.endObject();
            return c7171m1;
        }
    }

    public C7171m1() {
        this(Y0.t(), 0L, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7171m1.class != obj.getClass()) {
            return false;
        }
        C7171m1 c7171m1 = (C7171m1) obj;
        return this.f68077a.equals(c7171m1.f68077a) && this.f68078b.equals(c7171m1.f68078b) && this.f68079c.equals(c7171m1.f68079c) && this.f68080d.equals(c7171m1.f68080d) && this.f68082f.equals(c7171m1.f68082f) && io.sentry.util.p.a(this.f68083g, c7171m1.f68083g) && io.sentry.util.p.a(this.f68081e, c7171m1.f68081e) && io.sentry.util.p.a(this.f68084h, c7171m1.f68084h);
    }

    @NotNull
    public final String h() {
        return this.f68077a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f68077a, this.f68078b, this.f68079c, this.f68080d, this.f68081e, this.f68082f, this.f68083g, this.f68084h});
    }

    @NotNull
    public final String i() {
        return this.f68079c;
    }

    @NotNull
    public final String j() {
        return this.f68078b;
    }

    public final void k(@NotNull Long l11, @NotNull Long l12, @NotNull Long l13, @NotNull Long l14) {
        if (this.f68081e == null) {
            this.f68081e = Long.valueOf(l11.longValue() - l12.longValue());
            this.f68080d = Long.valueOf(this.f68080d.longValue() - l12.longValue());
            this.f68083g = Long.valueOf(l13.longValue() - l14.longValue());
            this.f68082f = Long.valueOf(this.f68082f.longValue() - l14.longValue());
        }
    }

    public final void l(Map<String, Object> map) {
        this.f68084h = (ConcurrentHashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        c7212v0.g("id");
        c7212v0.m(iLogger, this.f68077a);
        c7212v0.g("trace_id");
        c7212v0.m(iLogger, this.f68078b);
        c7212v0.g(AppMeasurementSdk.ConditionalUserProperty.NAME);
        c7212v0.m(iLogger, this.f68079c);
        c7212v0.g("relative_start_ns");
        c7212v0.m(iLogger, this.f68080d);
        c7212v0.g("relative_end_ns");
        c7212v0.m(iLogger, this.f68081e);
        c7212v0.g("relative_cpu_start_ms");
        c7212v0.m(iLogger, this.f68082f);
        c7212v0.g("relative_cpu_end_ms");
        c7212v0.m(iLogger, this.f68083g);
        ConcurrentHashMap concurrentHashMap = this.f68084h;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f68084h, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }

    public C7171m1(@NotNull InterfaceC7142f0 interfaceC7142f0, @NotNull Long l11, @NotNull Long l12) {
        this.f68077a = interfaceC7142f0.k().toString();
        this.f68078b = interfaceC7142f0.e().o().toString();
        this.f68079c = interfaceC7142f0.getName().isEmpty() ? "unknown" : interfaceC7142f0.getName();
        this.f68080d = l11;
        this.f68082f = l12;
    }
}
