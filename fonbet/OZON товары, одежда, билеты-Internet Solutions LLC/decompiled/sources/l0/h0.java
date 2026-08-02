package l0;

import S0.A1;
import S0.InterfaceC3967k;
import l0.M;
import l1.C7807Z;
import m0.C7990g;
import m0.C8004n;
import m0.C8011q0;
import m0.InterfaceC8002m;
import m0.T0;
import m0.U0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C8011q0<C7807Z> f72093a = C8004n.c(0.0f, null, 7);

    @NotNull
    public static final A1 a(long j11, T0 t02, String str, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        InterfaceC8002m interfaceC8002m = t02;
        if ((i12 & 2) != 0) {
            interfaceC8002m = f72093a;
        }
        InterfaceC8002m interfaceC8002m2 = interfaceC8002m;
        if ((i12 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        boolean n11 = interfaceC3967k.n(C7807Z.s(j11));
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = (U0) ((M.a) M.a()).invoke(C7807Z.s(j11));
            interfaceC3967k.x(C11);
        }
        return C7990g.c(C7807Z.m(j11), (U0) C11, interfaceC8002m2, null, str2, interfaceC3967k, ((i11 << 3) & 896) | ((i11 << 6) & 57344), 8);
    }
}
