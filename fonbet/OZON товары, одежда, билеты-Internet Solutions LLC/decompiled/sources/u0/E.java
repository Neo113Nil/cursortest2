package u0;

import D1.InterfaceC2801g;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class E {
    public static final void a(InterfaceC3967k interfaceC3967k, @NotNull androidx.compose.ui.e eVar) {
        F f7 = F.f99600a;
        int I11 = interfaceC3967k.I();
        androidx.compose.ui.e f11 = androidx.compose.ui.c.f(interfaceC3967k, eVar);
        A0 d11 = interfaceC3967k.d();
        InterfaceC2801g.f5440U.getClass();
        Function0 a11 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a11);
        } else {
            interfaceC3967k.e();
        }
        F1.b(interfaceC3967k, f7, InterfaceC2801g.a.e());
        F1.b(interfaceC3967k, d11, InterfaceC2801g.a.g());
        F1.b(interfaceC3967k, f11, InterfaceC2801g.a.f());
        Function2 b11 = InterfaceC2801g.a.b();
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            Nk.a.d(b11, I11, interfaceC3967k, I11);
        }
        interfaceC3967k.f();
    }
}
