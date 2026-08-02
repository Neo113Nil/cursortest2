package q0;

import B1.V;
import D1.InterfaceC2801g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import a1.C4912a;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q0.C8960o;
import x1.L;

/* renamed from: q0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8949d {
    public static final void a(@NotNull C8960o c8960o, @NotNull Function0 function0, androidx.compose.ui.e eVar, @NotNull Function1 function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C8960o c8960o2;
        int i13;
        C3969l u11 = interfaceC3967k.u(645832757);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(c8960o) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function0) ? 32 : 16;
        }
        int i14 = i12 | 384;
        if ((i11 & 3072) == 0) {
            i14 |= u11.F(function1) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i14 & 1171) == 1170 && u11.b()) {
            u11.j();
            c8960o2 = c8960o;
            i13 = i11;
        } else {
            eVar = androidx.compose.ui.e.f40358c0;
            C8960o.a a11 = c8960o.a();
            if (!(a11 instanceof C8960o.a.b)) {
                J0 m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new C8946a(c8960o, function0, eVar, function1, i11));
                    return;
                }
                return;
            }
            c8960o2 = c8960o;
            i13 = i11;
            boolean n11 = u11.n(a11);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new C8956k(Z1.n.b(((C8960o.a.b) a11).a()));
                u11.x(C11);
            }
            C8969x.c((C8956k) C11, function0, eVar, function1, u11, i14 & 8176);
        }
        androidx.compose.ui.e eVar2 = eVar;
        J0 m03 = u11.m0();
        if (m03 != null) {
            m03.G(new C8947b(c8960o2, function0, eVar2, function1, i13));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(@NotNull C8960o c8960o, @NotNull Function0 function0, @NotNull Function1 function1, e.a aVar, boolean z11, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        boolean z12;
        int I11;
        e.a aVar2;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-84584070);
        if ((i11 & 6) == 0) {
            i13 = (u11.n(c8960o) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= u11.F(function0) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i14 = i13 | 3072;
        int i15 = i12 & 16;
        if (i15 != 0) {
            i14 = i13 | 27648;
        } else if ((i11 & 24576) == 0) {
            z12 = z11;
            i14 |= u11.p(z12) ? 16384 : 8192;
            if ((196608 & i11) == 0) {
                i14 |= u11.F(c4912a) ? 131072 : 65536;
            }
            if ((74899 & i14) == 74898 || !u11.b()) {
                e.a aVar3 = androidx.compose.ui.e.f40358c0;
                if (i15 != 0) {
                    z12 = true;
                }
                androidx.compose.ui.e b11 = !z12 ? L.b(aVar3, C8955j.f81320a, new C8952g(c8960o, null)) : aVar3;
                V f7 = C5185h.f(InterfaceC6250b.a.o(), true);
                I11 = u11.I();
                A0 d11 = u11.d();
                androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, b11);
                Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a11);
                }
                Function2 f12 = E.f(u11, f7, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    Ep.a.d(I11, u11, I11, f12);
                }
                F1.b(u11, f11, InterfaceC2801g.a.f());
                c4912a.invoke(u11, Integer.valueOf((i14 >> 15) & 14));
                a(c8960o, function0, null, function1, u11, (i14 & 126) | ((i14 << 3) & 7168));
                u11.f();
                aVar2 = aVar3;
            } else {
                u11.j();
                aVar2 = aVar;
            }
            boolean z13 = z12;
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new C8948c(c8960o, function0, function1, aVar2, z13, c4912a, i11, i12));
                return;
            }
            return;
        }
        z12 = z11;
        if ((196608 & i11) == 0) {
        }
        if ((74899 & i14) == 74898) {
        }
        e.a aVar32 = androidx.compose.ui.e.f40358c0;
        if (i15 != 0) {
        }
        if (!z12) {
        }
        V f72 = C5185h.f(InterfaceC6250b.a.o(), true);
        I11 = u11.I();
        A0 d112 = u11.d();
        androidx.compose.ui.e f112 = androidx.compose.ui.c.f(u11, b11);
        Function0 a112 = Fr.g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f122 = E.f(u11, f72, u11, d112);
        if (!u11.t()) {
        }
        Ep.a.d(I11, u11, I11, f122);
        F1.b(u11, f112, InterfaceC2801g.a.f());
        c4912a.invoke(u11, Integer.valueOf((i14 >> 15) & 14));
        a(c8960o, function0, null, function1, u11, (i14 & 126) | ((i14 << 3) & 7168));
        u11.f();
        aVar2 = aVar32;
        boolean z132 = z12;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }
}
