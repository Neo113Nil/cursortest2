package w0;

import B1.o0;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;
import x0.InterfaceC10609n;

/* renamed from: w0.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10389e implements InterfaceC10609n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final O f103258a;

    public C10389e(@NotNull O o11) {
        this.f103258a = o11;
    }

    @Override // x0.InterfaceC10609n
    public final void a() {
        o0 w11 = this.f103258a.w();
        if (w11 != null) {
            ((D1.H) w11).b();
        }
    }

    @Override // x0.InterfaceC10609n
    public final int b() {
        return this.f103258a.m();
    }

    @Override // x0.InterfaceC10609n
    public final boolean c() {
        return !this.f103258a.q().g().isEmpty();
    }

    @Override // x0.InterfaceC10609n
    public final int d() {
        return ((InterfaceC10395k) C7714v.X(this.f103258a.q().g())).getIndex();
    }

    @Override // x0.InterfaceC10609n
    public final int getItemCount() {
        return this.f103258a.q().d();
    }
}
