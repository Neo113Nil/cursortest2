package xe;

import org.jetbrains.annotations.NotNull;

/* renamed from: xe.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10751u0 implements InterfaceC10753v0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final M0 f105500a;

    public C10751u0(@NotNull M0 m02) {
        this.f105500a = m02;
    }

    @Override // xe.InterfaceC10753v0
    @NotNull
    public final M0 b() {
        return this.f105500a;
    }

    @Override // xe.InterfaceC10753v0
    public final boolean isActive() {
        return false;
    }
}
