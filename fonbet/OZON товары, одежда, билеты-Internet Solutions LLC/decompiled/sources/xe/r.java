package xe;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class r extends G0 {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final C10737n<?> f105496e;

    public r(@NotNull C10737n<?> c10737n) {
        this.f105496e = c10737n;
    }

    @Override // xe.G0
    public final boolean n() {
        return true;
    }

    @Override // xe.G0
    public final void o(Throwable th2) {
        H0 m11 = m();
        C10737n<?> c10737n = this.f105496e;
        c10737n.y(c10737n.m(m11));
    }
}
