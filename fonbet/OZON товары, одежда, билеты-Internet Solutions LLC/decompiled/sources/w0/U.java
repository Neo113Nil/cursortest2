package w0;

import I1.C3223b;
import kotlin.Unit;
import n0.EnumC8372M;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;
import ru.ozon.fintech.ui.input.CounterView;
import x0.InterfaceC10585N;

/* loaded from: classes8.dex */
public final class U implements InterfaceC10585N {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ O f103248a;

    U(O o11) {
        this.f103248a = o11;
    }

    @Override // x0.InterfaceC10585N
    public final int a() {
        O o11 = this.f103248a;
        return o11.q().b() + o11.q().c();
    }

    @Override // x0.InterfaceC10585N
    public final Object b(int i11, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        int i12 = O.f103209u;
        O o11 = this.f103248a;
        o11.getClass();
        Object d11 = o11.d(EnumC8372M.Default, new Q(o11, i11, null), (kotlin.coroutines.jvm.internal.c) dVar);
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (d11 != aVar) {
            d11 = Unit.f71690a;
        }
        return d11 == aVar ? d11 : Unit.f71690a;
    }

    @Override // x0.InterfaceC10585N
    public final float c() {
        int m11 = this.f103248a.m();
        return (m11 * CounterView.COUNTER_MAX_DEFAULT) + r0.n();
    }

    @Override // x0.InterfaceC10585N
    public final float d() {
        O o11 = this.f103248a;
        int m11 = o11.m();
        int n11 = o11.n();
        return o11.b() ? (m11 * CounterView.COUNTER_MAX_DEFAULT) + n11 + 100 : (m11 * CounterView.COUNTER_MAX_DEFAULT) + n11;
    }

    @Override // x0.InterfaceC10585N
    @NotNull
    public final C3223b e() {
        return new C3223b(-1, -1);
    }

    @Override // x0.InterfaceC10585N
    public final int f() {
        O o11 = this.f103248a;
        return (int) (o11.q().getOrientation() == EnumC9142v.Vertical ? o11.q().a() & 4294967295L : o11.q().a() >> 32);
    }
}
