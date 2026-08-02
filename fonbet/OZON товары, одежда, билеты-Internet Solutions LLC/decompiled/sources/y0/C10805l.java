package y0;

import I1.C3223b;
import hd.C6915b;
import kotlin.Unit;
import n0.EnumC8372M;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;
import x0.InterfaceC10585N;

/* renamed from: y0.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10805l implements InterfaceC10585N {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b0 f105830a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f105831b;

    C10805l(b0 b0Var, boolean z11) {
        this.f105830a = b0Var;
        this.f105831b = z11;
    }

    @Override // x0.InterfaceC10585N
    public final int a() {
        b0 b0Var = this.f105830a;
        return b0Var.z().b() + b0Var.z().c();
    }

    @Override // x0.InterfaceC10585N
    public final Object b(int i11, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        b0 b0Var = this.f105830a;
        Object d11 = b0Var.d(EnumC8372M.Default, new X(b0Var, i11, null), (kotlin.coroutines.jvm.internal.c) dVar);
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (d11 != aVar) {
            d11 = Unit.f71690a;
        }
        return d11 == aVar ? d11 : Unit.f71690a;
    }

    @Override // x0.InterfaceC10585N
    public final float c() {
        b0 b0Var = this.f105830a;
        return C6915b.d(b0Var.s() * b0Var.E()) + (b0Var.r() * b0Var.E());
    }

    @Override // x0.InterfaceC10585N
    public final float d() {
        b0 b0Var = this.f105830a;
        return c0.b(b0Var.z(), b0Var.C());
    }

    @Override // x0.InterfaceC10585N
    @NotNull
    public final C3223b e() {
        boolean z11 = this.f105831b;
        b0 b0Var = this.f105830a;
        return z11 ? new C3223b(b0Var.C(), 1) : new C3223b(1, b0Var.C());
    }

    @Override // x0.InterfaceC10585N
    public final int f() {
        b0 b0Var = this.f105830a;
        return (int) (b0Var.z().getOrientation() == EnumC9142v.Vertical ? b0Var.z().a() & 4294967295L : b0Var.z().a() >> 32);
    }
}
