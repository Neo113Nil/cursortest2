package v0;

import B1.o0;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;
import x0.InterfaceC10609n;

/* renamed from: v0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10168h implements InterfaceC10609n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final I f101545a;

    public C10168h(@NotNull I i11) {
        this.f101545a = i11;
    }

    @Override // x0.InterfaceC10609n
    public final void a() {
        o0 A11 = this.f101545a.A();
        if (A11 != null) {
            ((D1.H) A11).b();
        }
    }

    @Override // x0.InterfaceC10609n
    public final int b() {
        return Math.max(0, this.f101545a.o());
    }

    @Override // x0.InterfaceC10609n
    public final boolean c() {
        return !this.f101545a.t().g().isEmpty();
    }

    @Override // x0.InterfaceC10609n
    public final int d() {
        return Math.min(getItemCount() - 1, ((InterfaceC10174n) C7714v.X(this.f101545a.t().g())).getIndex());
    }

    @Override // x0.InterfaceC10609n
    public final int getItemCount() {
        return this.f101545a.t().d();
    }
}
