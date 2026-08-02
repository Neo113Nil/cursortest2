package xe;

import org.jetbrains.annotations.NotNull;

/* renamed from: xe.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10728i0 extends G0 {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC10724g0 f105466e;

    public C10728i0(@NotNull InterfaceC10724g0 interfaceC10724g0) {
        this.f105466e = interfaceC10724g0;
    }

    @Override // xe.G0
    public final boolean n() {
        return false;
    }

    @Override // xe.G0
    public final void o(Throwable th2) {
        this.f105466e.dispose();
    }
}
