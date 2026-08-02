package xe;

import Sc.r;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class R0<T> extends G0 {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C10737n<T> f105414e;

    /* JADX WARN: Multi-variable type inference failed */
    public R0(@NotNull C10737n<? super T> c10737n) {
        this.f105414e = c10737n;
    }

    @Override // xe.G0
    public final boolean n() {
        return false;
    }

    @Override // xe.G0
    public final void o(Throwable th2) {
        Object U10 = m().U();
        boolean z11 = U10 instanceof C10760z;
        C10737n<T> c10737n = this.f105414e;
        if (z11) {
            r.Companion companion = Sc.r.INSTANCE;
            c10737n.resumeWith(Sc.s.a(((C10760z) U10).f105510a));
        } else {
            r.Companion companion2 = Sc.r.INSTANCE;
            c10737n.resumeWith(I0.g(U10));
        }
    }
}
