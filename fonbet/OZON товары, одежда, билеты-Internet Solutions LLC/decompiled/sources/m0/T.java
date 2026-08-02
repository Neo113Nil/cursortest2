package m0;

import S0.InterfaceC3967k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m0.O;
import m0.O.a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class T {
    @NotNull
    public static final O.a a(@NotNull O o11, float f7, float f11, @NotNull N n11, String str, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        if ((i12 & 8) != 0) {
            str = "FloatAnimation";
        }
        Float valueOf = Float.valueOf(f7);
        Float valueOf2 = Float.valueOf(f11);
        int i13 = i11 << 3;
        return b(o11, valueOf, valueOf2, W0.b(), n11, str, interfaceC3967k, (i11 & 1022) | (57344 & i13) | (i13 & 458752), 0);
    }

    @NotNull
    public static final O.a b(@NotNull O o11, Number number, Number number2, @NotNull U0 u02, @NotNull N n11, String str, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        O o12;
        Number number3;
        Number number4;
        N n12;
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            o12 = o11;
            number3 = number;
            number4 = number2;
            n12 = n11;
            O.a aVar = o12.new a(number3, number4, u02, n12);
            interfaceC3967k.x(aVar);
            C11 = aVar;
        } else {
            o12 = o11;
            number3 = number;
            number4 = number2;
            n12 = n11;
        }
        O.a aVar2 = (O.a) C11;
        boolean z11 = ((((i11 & 112) ^ 48) > 32 && interfaceC3967k.F(number3)) || (i11 & 48) == 32) | ((((i11 & 896) ^ 384) > 256 && interfaceC3967k.F(number4)) || (i11 & 384) == 256) | ((((57344 & i11) ^ 24576) > 16384 && interfaceC3967k.F(n12)) || (i11 & 24576) == 16384);
        Object C12 = interfaceC3967k.C();
        if (z11 || C12 == InterfaceC3967k.a.a()) {
            C12 = new P(number3, aVar2, number4, n12);
            interfaceC3967k.x(C12);
        }
        int i13 = S0.Q.f25307b;
        interfaceC3967k.g((Function0) C12);
        boolean F11 = interfaceC3967k.F(o12);
        Object C13 = interfaceC3967k.C();
        if (F11 || C13 == InterfaceC3967k.a.a()) {
            C13 = new S(o12, aVar2);
            interfaceC3967k.x(C13);
        }
        S0.Q.c(aVar2, (Function1) C13, interfaceC3967k);
        return aVar2;
    }

    @NotNull
    public static final O c(String str, InterfaceC3967k interfaceC3967k, int i11) {
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = new O();
            interfaceC3967k.x(C11);
        }
        O o11 = (O) C11;
        o11.h(interfaceC3967k, 0);
        return o11;
    }
}
