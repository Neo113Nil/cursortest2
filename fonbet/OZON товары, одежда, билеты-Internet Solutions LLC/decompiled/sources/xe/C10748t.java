package xe;

import org.jetbrains.annotations.NotNull;

/* renamed from: xe.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10748t extends G0 implements InterfaceC10746s {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final H0 f105498e;

    public C10748t(@NotNull H0 h02) {
        this.f105498e = h02;
    }

    @Override // xe.InterfaceC10746s
    public final boolean a(@NotNull Throwable th2) {
        return m().H(th2);
    }

    @Override // xe.G0
    public final boolean n() {
        return true;
    }

    @Override // xe.G0
    public final void o(Throwable th2) {
        this.f105498e.x(m());
    }
}
