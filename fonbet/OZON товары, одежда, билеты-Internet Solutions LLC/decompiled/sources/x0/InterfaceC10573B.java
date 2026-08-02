package x0;

import B1.m0;
import java.util.List;
import k1.C7464j;
import org.jetbrains.annotations.NotNull;

/* renamed from: x0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC10573B extends B1.Y {
    @Override // Z1.d
    default float B(int i11) {
        return i11 / g();
    }

    @Override // Z1.d
    default float C(float f7) {
        return f7 / g();
    }

    @Override // Z1.k
    default long F(float f7) {
        return Hj0.T.f(f7 / u1(), 4294967296L);
    }

    @NotNull
    List<m0> Z(int i11, long j11);

    @Override // Z1.d
    default long o(long j11) {
        if (j11 != 9205357640488583168L) {
            return Ra.h.d(C(C7464j.f(j11)), C(C7464j.d(j11)));
        }
        return 9205357640488583168L;
    }

    @Override // Z1.k
    default float p(long j11) {
        if (!Z1.v.b(Z1.u.d(j11), 4294967296L)) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        return u1() * Z1.u.e(j11);
    }

    @Override // Z1.d
    default long r(float f7) {
        return Hj0.T.f(f7 / (g() * u1()), 4294967296L);
    }
}
