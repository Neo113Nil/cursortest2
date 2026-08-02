package x0;

import B1.k0;
import B1.l0;
import S0.C3969l;
import S0.C3996z;
import S0.InterfaceC3967k;
import S0.J0;
import a1.C4912a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: x0.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10582K {
    public static final void a(Object obj, int i11, @NotNull C10583L c10583l, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i12) {
        int i13;
        C3969l u11 = interfaceC3967k.u(-2079116560);
        if ((i12 & 6) == 0) {
            i13 = (u11.F(obj) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= u11.r(i11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= u11.F(c10583l) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 3072) == 0) {
            i13 |= u11.F(c4912a) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            boolean n11 = u11.n(obj) | u11.n(c10583l);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new C10578G(obj, c10583l);
                u11.x(C11);
            }
            C10578G c10578g = (C10578G) C11;
            c10578g.c(i11);
            c10578g.d((k0) u11.m(l0.a()));
            boolean n12 = u11.n(c10578g);
            Object C12 = u11.C();
            if (n12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new C10580I(c10578g);
                u11.x(C12);
            }
            S0.Q.c(c10578g, (Function1) C12, u11);
            C3996z.a(l0.a().c(c10578g), c4912a, u11, ((i13 >> 6) & 112) | 8);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C10581J(obj, i11, c10583l, c4912a, i12));
        }
    }
}
