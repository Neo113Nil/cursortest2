package xe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class G0 extends De.o implements InterfaceC10724g0, InterfaceC10753v0 {

    /* renamed from: d, reason: collision with root package name */
    public H0 f105380d;

    @Override // xe.InterfaceC10753v0
    public final M0 b() {
        return null;
    }

    @Override // xe.InterfaceC10724g0
    public final void dispose() {
        m().n0(this);
    }

    @NotNull
    public B0 getParent() {
        return m();
    }

    @Override // xe.InterfaceC10753v0
    public final boolean isActive() {
        return true;
    }

    @NotNull
    public final H0 m() {
        H0 h02 = this.f105380d;
        if (h02 != null) {
            return h02;
        }
        Intrinsics.n("job");
        throw null;
    }

    public abstract boolean n();

    public abstract void o(Throwable th2);

    @Override // De.o
    @NotNull
    public final String toString() {
        return getClass().getSimpleName() + '@' + Q.a(this) + "[job@" + Q.a(m()) + ']';
    }
}
