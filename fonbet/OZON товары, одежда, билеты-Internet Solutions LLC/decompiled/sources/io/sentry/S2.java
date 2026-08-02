package io.sentry;

import java.util.Date;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class S2 extends T1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Date f66739a;

    /* renamed from: b, reason: collision with root package name */
    private final long f66740b;

    public S2() {
        this(C7165l.b(), System.nanoTime());
    }

    @Override // io.sentry.T1, java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(@NotNull T1 t12) {
        if (!(t12 instanceof S2)) {
            return super.compareTo(t12);
        }
        S2 s22 = (S2) t12;
        long time = this.f66739a.getTime();
        long time2 = s22.f66739a.getTime();
        return time == time2 ? Long.valueOf(this.f66740b).compareTo(Long.valueOf(s22.f66740b)) : Long.valueOf(time).compareTo(Long.valueOf(time2));
    }

    @Override // io.sentry.T1
    public final long b(@NotNull T1 t12) {
        return t12 instanceof S2 ? this.f66740b - ((S2) t12).f66740b : super.b(t12);
    }

    @Override // io.sentry.T1
    public final long c(T1 t12) {
        if (t12 == null || !(t12 instanceof S2)) {
            return super.c(t12);
        }
        S2 s22 = (S2) t12;
        int compareTo = compareTo(t12);
        long j11 = this.f66740b;
        long j12 = s22.f66740b;
        if (compareTo < 0) {
            return d() + (j12 - j11);
        }
        return s22.d() + (j11 - j12);
    }

    @Override // io.sentry.T1
    public final long d() {
        return this.f66739a.getTime() * 1000000;
    }

    public S2(@NotNull Date date, long j11) {
        this.f66739a = date;
        this.f66740b = j11;
    }
}
