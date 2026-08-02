package l1;

import Sc.C;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class K0 extends AbstractC7799Q {

    /* renamed from: a, reason: collision with root package name */
    private final long f72227a;

    public K0(long j11) {
        super(null);
        this.f72227a = j11;
    }

    public final long a() {
        return this.f72227a;
    }

    @Override // l1.AbstractC7799Q
    /* renamed from: applyTo-Pq9zytI */
    public final void mo69applyToPq9zytI(long j11, @NotNull r0 r0Var, float f7) {
        r0Var.setAlpha(1.0f);
        long j12 = this.f72227a;
        if (f7 != 1.0f) {
            j12 = C7807Z.o(C7807Z.q(j12) * f7, j12);
        }
        r0Var.b(j12);
        if (r0Var.e() != null) {
            r0Var.f(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof K0) {
            return C7807Z.p(this.f72227a, ((K0) obj).f72227a);
        }
        return false;
    }

    public final int hashCode() {
        int i11 = C7807Z.f72260n;
        C.Companion companion = Sc.C.INSTANCE;
        return Long.hashCode(this.f72227a);
    }

    @NotNull
    public final String toString() {
        return "SolidColor(value=" + ((Object) C7807Z.v(this.f72227a)) + ')';
    }
}
