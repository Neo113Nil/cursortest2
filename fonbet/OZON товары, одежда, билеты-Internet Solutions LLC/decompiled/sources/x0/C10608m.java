package x0;

import S0.InterfaceC3967k;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;

/* renamed from: x0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10608m {
    @NotNull
    public static final androidx.compose.ui.e a(@NotNull androidx.compose.ui.e eVar, @NotNull InterfaceC10609n interfaceC10609n, @NotNull C10606k c10606k, @NotNull Z1.s sVar, @NotNull EnumC9142v enumC9142v, boolean z11, InterfaceC3967k interfaceC3967k, int i11) {
        if (!z11) {
            interfaceC3967k.o(-1890658823);
            interfaceC3967k.k();
            return eVar;
        }
        interfaceC3967k.o(-1890632411);
        boolean z12 = ((((i11 & 112) ^ 48) > 32 && interfaceC3967k.n(interfaceC10609n)) || (i11 & 48) == 32) | ((((i11 & 896) ^ 384) > 256 && interfaceC3967k.n(c10606k)) || (i11 & 384) == 256) | ((((i11 & 7168) ^ 3072) > 2048 && interfaceC3967k.p(false)) || (i11 & 3072) == 2048) | ((((57344 & i11) ^ 24576) > 16384 && interfaceC3967k.n(sVar)) || (i11 & 24576) == 16384) | ((((458752 & i11) ^ 196608) > 131072 && interfaceC3967k.n(enumC9142v)) || (i11 & 196608) == 131072);
        Object C11 = interfaceC3967k.C();
        if (z12 || C11 == InterfaceC3967k.a.a()) {
            C11 = new C10607l(interfaceC10609n, c10606k, sVar, enumC9142v);
            interfaceC3967k.x(C11);
        }
        androidx.compose.ui.e l02 = eVar.l0((C10607l) C11);
        interfaceC3967k.k();
        return l02;
    }
}
