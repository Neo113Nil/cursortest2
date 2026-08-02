package xe;

import org.jetbrains.annotations.NotNull;

/* renamed from: xe.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10726h0 implements InterfaceC10731k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC10724g0 f105464a;

    public C10726h0(@NotNull InterfaceC10724g0 interfaceC10724g0) {
        this.f105464a = interfaceC10724g0;
    }

    @Override // xe.InterfaceC10731k
    public final void b(Throwable th2) {
        this.f105464a.dispose();
    }

    @NotNull
    public final String toString() {
        return "DisposeOnCancel[" + this.f105464a + ']';
    }
}
