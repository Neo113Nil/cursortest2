package q0;

import B0.K;
import Bl0.C2652m;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import a1.C4912a;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* renamed from: q0.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8957l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c1.u<InterfaceC6511n<C8950e, InterfaceC3967k, Integer, Unit>> f81322a = new c1.u<>();

    /* renamed from: q0.l$a */
    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C8950e f81324c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C8950e c8950e, int i11) {
            super(2);
            this.f81324c = c8950e;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(1);
            C8957l.this.a(this.f81324c, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public static void c(C8957l c8957l, K k11, boolean z11, Function0 function0) {
        e.a aVar = androidx.compose.ui.e.f40358c0;
        c8957l.getClass();
        c8957l.f81322a.add(new C4912a(true, 262103052, new C8958m(k11, z11, aVar, function0)));
    }

    public final void a(@NotNull C8950e c8950e, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(1320309496);
        int i12 = (u11.n(c8950e) ? 4 : 2) | i11 | (u11.n(this) ? 32 : 16);
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            c1.u<InterfaceC6511n<C8950e, InterfaceC3967k, Integer, Unit>> uVar = this.f81322a;
            int size = uVar.size();
            for (int i13 = 0; i13 < size; i13++) {
                uVar.get(i13).invoke(c8950e, u11, Integer.valueOf(i12 & 14));
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new a(c8950e, i11));
        }
    }

    public final void b() {
        this.f81322a.clear();
    }
}
