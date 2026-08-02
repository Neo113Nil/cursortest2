package l0;

import kotlin.jvm.internal.Intrinsics;
import l1.N0;
import m0.T0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    private final float f72087a;

    /* renamed from: b, reason: collision with root package name */
    private final long f72088b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final T0 f72089c;

    private g0() {
        throw null;
    }

    public g0(float f7, long j11, T0 t02) {
        this.f72087a = f7;
        this.f72088b = j11;
        this.f72089c = t02;
    }

    @NotNull
    public final m0.H<Float> a() {
        return this.f72089c;
    }

    public final float b() {
        return this.f72087a;
    }

    public final long c() {
        return this.f72088b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Float.compare(this.f72087a, g0Var.f72087a) == 0 && N0.c(this.f72088b, g0Var.f72088b) && Intrinsics.d(this.f72089c, g0Var.f72089c);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.f72087a) * 31;
        int i11 = N0.f72233c;
        return this.f72089c.hashCode() + Pk0.c.a(hashCode, 31, this.f72088b);
    }

    @NotNull
    public final String toString() {
        return "Scale(scale=" + this.f72087a + ", transformOrigin=" + ((Object) N0.f(this.f72088b)) + ", animationSpec=" + this.f72089c + ')';
    }
}
