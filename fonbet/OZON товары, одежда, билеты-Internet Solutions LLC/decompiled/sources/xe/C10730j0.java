package xe;

import org.jetbrains.annotations.NotNull;

/* renamed from: xe.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10730j0 implements InterfaceC10753v0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f105469a;

    public C10730j0(boolean z11) {
        this.f105469a = z11;
    }

    @Override // xe.InterfaceC10753v0
    public final M0 b() {
        return null;
    }

    @Override // xe.InterfaceC10753v0
    public final boolean isActive() {
        return this.f105469a;
    }

    @NotNull
    public final String toString() {
        return B3.D.c(new StringBuilder("Empty{"), this.f105469a ? "Active" : "New", '}');
    }
}
