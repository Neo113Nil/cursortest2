package y0;

import B1.o0;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;
import x0.InterfaceC10609n;

/* renamed from: y0.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10809p implements InterfaceC10609n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b0 f105845a;

    /* renamed from: b, reason: collision with root package name */
    private final int f105846b;

    public C10809p(@NotNull b0 b0Var, int i11) {
        this.f105845a = b0Var;
        this.f105846b = i11;
    }

    @Override // x0.InterfaceC10609n
    public final void a() {
        o0 K11 = this.f105845a.K();
        if (K11 != null) {
            K11.b();
        }
    }

    @Override // x0.InterfaceC10609n
    public final int b() {
        return Math.max(0, this.f105845a.u() - this.f105846b);
    }

    @Override // x0.InterfaceC10609n
    public final boolean c() {
        return !this.f105845a.z().f().isEmpty();
    }

    @Override // x0.InterfaceC10609n
    public final int d() {
        return Math.min(r0.C() - 1, ((InterfaceC10807n) C7714v.X(this.f105845a.z().f())).getIndex() + this.f105846b);
    }

    @Override // x0.InterfaceC10609n
    public final int getItemCount() {
        return this.f105845a.C();
    }
}
