package je;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ud.InterfaceC10023a;
import ud.InterfaceC10030h;

/* loaded from: classes.dex */
public abstract class N implements InterfaceC10023a, ne.g {

    /* renamed from: a, reason: collision with root package name */
    private int f69849a;

    public /* synthetic */ N(int i11) {
        this();
    }

    @NotNull
    public abstract List<y0> F0();

    @NotNull
    public abstract o0 G0();

    @NotNull
    public abstract s0 H0();

    public abstract boolean I0();

    @NotNull
    public abstract N J0(@NotNull ke.h hVar);

    @NotNull
    public abstract K0 K0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n11 = (N) obj;
        if (I0() != n11.I0()) {
            return false;
        }
        K0 a11 = K0();
        K0 b11 = n11.K0();
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        return C7374d.b(ke.u.f71512a, a11, b11);
    }

    @Override // ud.InterfaceC10023a
    @NotNull
    public final InterfaceC10030h getAnnotations() {
        return C7397q.a(G0());
    }

    public final int hashCode() {
        int hashCode;
        int i11 = this.f69849a;
        if (i11 != 0) {
            return i11;
        }
        if (S.a(this)) {
            hashCode = super.hashCode();
        } else {
            hashCode = (I0() ? 1 : 0) + ((F0().hashCode() + (H0().hashCode() * 31)) * 31);
        }
        this.f69849a = hashCode;
        return hashCode;
    }

    @NotNull
    public abstract ce.l p();

    private N() {
    }
}
