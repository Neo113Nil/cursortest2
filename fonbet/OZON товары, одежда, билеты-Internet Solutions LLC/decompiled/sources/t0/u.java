package t0;

import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import S0.n1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class u {
    @NotNull
    public static final InterfaceC3978p0 a(@NotNull o oVar, InterfaceC3967k interfaceC3967k, int i11) {
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = n1.f(Boolean.FALSE, D1.f25195a);
            interfaceC3967k.x(C11);
        }
        InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
        boolean z11 = (((i11 & 14) ^ 6) > 4 && interfaceC3967k.n(oVar)) || (i11 & 6) == 4;
        Object C12 = interfaceC3967k.C();
        if (z11 || C12 == InterfaceC3967k.a.a()) {
            C12 = new t(oVar, interfaceC3978p0, null);
            interfaceC3967k.x(C12);
        }
        Q.e(interfaceC3967k, oVar, (Function2) C12);
        return interfaceC3978p0;
    }
}
