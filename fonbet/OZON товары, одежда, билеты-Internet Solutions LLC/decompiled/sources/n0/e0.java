package n0;

import S0.InterfaceC3967k;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.K0;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;
import r0.InterfaceC9108I;
import r0.InterfaceC9124d;
import r0.InterfaceC9138r;

/* loaded from: classes.dex */
public final class e0 {
    @NotNull
    public static final androidx.compose.ui.e a(@NotNull androidx.compose.ui.e eVar, @NotNull InterfaceC9108I interfaceC9108I, @NotNull EnumC9142v enumC9142v, boolean z11, boolean z12, InterfaceC9138r interfaceC9138r, t0.q qVar, InterfaceC9124d interfaceC9124d, InterfaceC3967k interfaceC3967k, int i11) {
        W w11;
        EnumC9142v enumC9142v2;
        InterfaceC9138r interfaceC9138r2;
        t0.q qVar2;
        androidx.compose.ui.e eVar2;
        boolean z13;
        InterfaceC9108I interfaceC9108I2;
        boolean z14;
        InterfaceC9124d interfaceC9124d2 = (i11 & 64) != 0 ? null : interfaceC9124d;
        Context context = (Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d());
        C8379U c8379u = (C8379U) interfaceC3967k.m(V.a());
        if (c8379u != null) {
            interfaceC3967k.o(1586021609);
            boolean n11 = interfaceC3967k.n(context) | interfaceC3967k.n(c8379u);
            Object C11 = interfaceC3967k.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new C8380a(context, c8379u);
                interfaceC3967k.x(C11);
            }
            w11 = (C8380a) C11;
            interfaceC3967k.k();
        } else {
            interfaceC3967k.o(1586120933);
            interfaceC3967k.k();
            w11 = C8378T.f76120a;
        }
        W w12 = w11;
        androidx.compose.ui.e l02 = C8395p.a(eVar, enumC9142v).l0(w12.b());
        boolean z15 = !z12;
        if (((Z1.s) interfaceC3967k.m(K0.k())) != Z1.s.Rtl || enumC9142v == EnumC9142v.Vertical) {
            enumC9142v2 = enumC9142v;
            interfaceC9138r2 = interfaceC9138r;
            qVar2 = qVar;
            eVar2 = l02;
            z13 = z15;
            interfaceC9108I2 = interfaceC9108I;
            z14 = z11;
        } else {
            enumC9142v2 = enumC9142v;
            z14 = z11;
            z13 = z12;
            interfaceC9138r2 = interfaceC9138r;
            qVar2 = qVar;
            eVar2 = l02;
            interfaceC9108I2 = interfaceC9108I;
        }
        return androidx.compose.foundation.gestures.J.f(eVar2, interfaceC9108I2, enumC9142v2, w12, z14, z13, interfaceC9138r2, qVar2, interfaceC9124d2);
    }
}
