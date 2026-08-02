package m0;

import org.jetbrains.annotations.NotNull;

/* renamed from: m0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8023x {

    /* renamed from: a, reason: collision with root package name */
    private double f73902a;

    /* renamed from: b, reason: collision with root package name */
    private double f73903b;

    public C8023x(double d11, double d12) {
        this.f73902a = d11;
        this.f73903b = d12;
    }

    public final double e() {
        return this.f73903b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8023x)) {
            return false;
        }
        C8023x c8023x = (C8023x) obj;
        return Double.compare(this.f73902a, c8023x.f73902a) == 0 && Double.compare(this.f73903b, c8023x.f73903b) == 0;
    }

    public final double f() {
        return this.f73902a;
    }

    public final int hashCode() {
        return Double.hashCode(this.f73903b) + (Double.hashCode(this.f73902a) * 31);
    }

    @NotNull
    public final String toString() {
        return "ComplexDouble(_real=" + this.f73902a + ", _imaginary=" + this.f73903b + ')';
    }
}
