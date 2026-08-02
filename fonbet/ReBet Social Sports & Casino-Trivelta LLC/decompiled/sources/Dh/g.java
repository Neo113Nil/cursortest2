package Dh;

import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import ph.AbstractC6080k;
import qh.t;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final h f2799a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2800b = false;

    /* renamed from: c, reason: collision with root package name */
    public long f2801c;

    /* renamed from: d, reason: collision with root package name */
    public int f2802d;

    /* renamed from: e, reason: collision with root package name */
    public int f2803e;

    /* renamed from: f, reason: collision with root package name */
    public long f2804f;

    /* renamed from: g, reason: collision with root package name */
    public t f2805g;

    public g(h hVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f2801c = timeUnit.toNanos(5000L);
        this.f2802d = 2048;
        this.f2803e = 512;
        this.f2804f = timeUnit.toNanos(30000L);
        this.f2805g = t.d();
        Objects.requireNonNull(hVar, "spanExporter");
        this.f2799a = hVar;
    }

    public a a() {
        return new a(this.f2799a, this.f2800b, this.f2805g, this.f2801c, this.f2802d, this.f2803e, this.f2804f);
    }

    public g b(long j10, TimeUnit timeUnit) {
        Objects.requireNonNull(timeUnit, "unit");
        AbstractC6080k.a(j10 >= 0, "delay must be non-negative");
        this.f2801c = timeUnit.toNanos(j10);
        return this;
    }

    public g c(Duration duration) {
        long nanos;
        Objects.requireNonNull(duration, "delay");
        nanos = duration.toNanos();
        return b(nanos, TimeUnit.NANOSECONDS);
    }
}
