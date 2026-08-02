package io.sentry.profilemeasurements;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.C7137e;
import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import io.sentry.util.p;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap f68132a;

    /* renamed from: b, reason: collision with root package name */
    private double f68133b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private String f68134c;

    /* renamed from: d, reason: collision with root package name */
    private double f68135d;

    public static final class a implements InterfaceC7174n0<b> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final b a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            Double valueOf;
            interfaceC7131c1.beginObject();
            b bVar = new b();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "elapsed_since_start_ns":
                        String k02 = interfaceC7131c1.k0();
                        if (k02 == null) {
                            break;
                        } else {
                            bVar.f68134c = k02;
                            break;
                        }
                    case "timestamp":
                        try {
                            valueOf = interfaceC7131c1.g1();
                        } catch (NumberFormatException unused) {
                            valueOf = interfaceC7131c1.M(iLogger) != null ? Double.valueOf(r3.getTime() / 1000.0d) : null;
                        }
                        if (valueOf == null) {
                            break;
                        } else {
                            bVar.f68133b = valueOf.doubleValue();
                            break;
                        }
                    case "value":
                        Double g12 = interfaceC7131c1.g1();
                        if (g12 == null) {
                            break;
                        } else {
                            bVar.f68135d = g12.doubleValue();
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
            bVar.d(concurrentHashMap);
            interfaceC7131c1.endObject();
            return bVar;
        }
    }

    public b() {
        this(0L, 0, 0L);
    }

    public final void d(Map<String, Object> map) {
        this.f68132a = (ConcurrentHashMap) map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return p.a(this.f68132a, bVar.f68132a) && this.f68134c.equals(bVar.f68134c) && this.f68135d == bVar.f68135d && this.f68133b == bVar.f68133b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f68132a, this.f68134c, Double.valueOf(this.f68135d)});
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        c7212v0.g(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c7212v0.m(iLogger, Double.valueOf(this.f68135d));
        c7212v0.g("elapsed_since_start_ns");
        c7212v0.m(iLogger, this.f68134c);
        c7212v0.g("timestamp");
        c7212v0.m(iLogger, BigDecimal.valueOf(this.f68133b).setScale(6, RoundingMode.DOWN));
        ConcurrentHashMap concurrentHashMap = this.f68132a;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f68132a, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }

    public b(@NotNull Long l11, @NotNull Number number, long j11) {
        this.f68134c = l11.toString();
        this.f68135d = number.doubleValue();
        this.f68133b = j11 / 1.0E9d;
    }
}
