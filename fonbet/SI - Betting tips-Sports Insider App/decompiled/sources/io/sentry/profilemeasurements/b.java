package io.sentry.profilemeasurements;

import d9.e;
import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import j$.util.concurrent.ConcurrentHashMap;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap f16729a;

    /* renamed from: b, reason: collision with root package name */
    public double f16730b;

    /* renamed from: c, reason: collision with root package name */
    public String f16731c;

    /* renamed from: d, reason: collision with root package name */
    public double f16732d;

    public b(Long l6, Number number, long j) {
        this.f16731c = l6.toString();
        this.f16732d = number.doubleValue();
        this.f16730b = j / 1.0E9d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return y4.a.s(this.f16729a, bVar.f16729a) && this.f16731c.equals(bVar.f16731c) && this.f16732d == bVar.f16732d && this.f16730b == bVar.f16730b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16729a, this.f16731c, Double.valueOf(this.f16732d)});
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("value");
        aVar.H(iLogger, Double.valueOf(this.f16732d));
        aVar.u("elapsed_since_start_ns");
        aVar.H(iLogger, this.f16731c);
        aVar.u("timestamp");
        aVar.H(iLogger, BigDecimal.valueOf(this.f16730b).setScale(6, RoundingMode.DOWN));
        ConcurrentHashMap concurrentHashMap = this.f16729a;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                e.v(this.f16729a, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }
}
