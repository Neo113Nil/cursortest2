package x0;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import b1.InterfaceC5505h;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* renamed from: x0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10619x {
    public static final void a(InterfaceC10620y interfaceC10620y, InterfaceC5505h interfaceC5505h, int i11, Object obj, InterfaceC3967k interfaceC3967k, int i12) {
        int i13;
        C3969l u11 = interfaceC3967k.u(1439843069);
        if ((i12 & 6) == 0) {
            i13 = (u11.n(interfaceC10620y) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= u11.n(interfaceC5505h) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= u11.r(i11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 3072) == 0) {
            i13 |= u11.n(obj) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            interfaceC5505h.c(obj, a1.c.c(980966366, new C10617v(i11, obj, interfaceC10620y), u11), u11, 48);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C10618w(interfaceC10620y, interfaceC5505h, i11, obj, i12));
        }
    }
}
