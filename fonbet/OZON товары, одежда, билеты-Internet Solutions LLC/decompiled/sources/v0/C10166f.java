package v0;

import I1.C3223b;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;
import ru.ozon.fintech.ui.input.CounterView;
import x0.InterfaceC10585N;

/* renamed from: v0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10166f implements InterfaceC10585N {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ I f101542a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f101543b;

    C10166f(I i11, boolean z11) {
        this.f101542a = i11;
        this.f101543b = z11;
    }

    @Override // x0.InterfaceC10585N
    public final int a() {
        I i11 = this.f101542a;
        return i11.t().b() + i11.t().c();
    }

    @Override // x0.InterfaceC10585N
    public final Object b(int i11, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        int i12 = I.f101468y;
        Object G11 = this.f101542a.G(i11, 0, (kotlin.coroutines.jvm.internal.j) dVar);
        return G11 == Wc.a.COROUTINE_SUSPENDED ? G11 : Unit.f71690a;
    }

    @Override // x0.InterfaceC10585N
    public final float c() {
        int o11 = this.f101542a.o();
        return (o11 * CounterView.COUNTER_MAX_DEFAULT) + r0.p();
    }

    @Override // x0.InterfaceC10585N
    public final float d() {
        I i11 = this.f101542a;
        int o11 = i11.o();
        int p11 = i11.p();
        return i11.b() ? (o11 * CounterView.COUNTER_MAX_DEFAULT) + p11 + 100 : (o11 * CounterView.COUNTER_MAX_DEFAULT) + p11;
    }

    @Override // x0.InterfaceC10585N
    @NotNull
    public final C3223b e() {
        return this.f101543b ? new C3223b(-1, 1) : new C3223b(1, -1);
    }

    @Override // x0.InterfaceC10585N
    public final int f() {
        I i11 = this.f101542a;
        return (int) (i11.t().getOrientation() == EnumC9142v.Vertical ? i11.t().a() & 4294967295L : i11.t().a() >> 32);
    }
}
