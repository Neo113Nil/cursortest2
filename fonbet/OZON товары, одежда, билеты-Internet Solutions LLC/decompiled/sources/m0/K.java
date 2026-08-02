package m0;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class K implements I {

    /* renamed from: a, reason: collision with root package name */
    private final int f73546a;

    /* renamed from: b, reason: collision with root package name */
    private final int f73547b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final E f73548c;

    /* renamed from: d, reason: collision with root package name */
    private final long f73549d;

    /* renamed from: e, reason: collision with root package name */
    private final long f73550e;

    public K(int i11, int i12, @NotNull E e11) {
        this.f73546a = i11;
        this.f73547b = i12;
        this.f73548c = e11;
        this.f73549d = i11 * 1000000;
        this.f73550e = i12 * 1000000;
    }

    @Override // m0.I
    public final long b(float f7, float f11, float f12) {
        return (this.f73547b + this.f73546a) * 1000000;
    }

    @Override // m0.I
    public final float c(float f7, float f11, float f12, long j11) {
        float g10 = this.f73546a == 0 ? 1.0f : kotlin.ranges.h.g(j11 - this.f73550e, 0L, this.f73549d) / this.f73549d;
        if (g10 < 0.0f) {
            g10 = 0.0f;
        }
        float a11 = this.f73548c.a(g10 <= 1.0f ? g10 : 1.0f);
        int i11 = W0.f73625j;
        return (f11 * a11) + ((1 - a11) * f7);
    }

    @Override // m0.I
    public final float d(float f7, float f11, float f12, long j11) {
        long g10 = kotlin.ranges.h.g(j11 - this.f73550e, 0L, this.f73549d);
        if (g10 < 0) {
            return 0.0f;
        }
        if (g10 == 0) {
            return f12;
        }
        return (c(f7, f11, f12, g10) - c(f7, f11, f12, g10 - 1000000)) * 1000.0f;
    }
}
