package w0;

import S0.A1;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.ui.platform.K0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l1.InterfaceC7823h0;
import n0.e0;
import org.jetbrains.annotations.NotNull;
import r0.C9129i;
import r0.EnumC9142v;
import u0.C9915y;
import x0.C10608m;

/* loaded from: classes8.dex */
public final class z {
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0258, code lost:
    
        if (r11.p(false) != false) goto L167;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(androidx.compose.ui.e eVar, @NotNull O o11, @NotNull M m11, C9915y c9915y, C9129i c9129i, boolean z11, @NotNull C5179b.l lVar, @NotNull C5179b.e eVar2, @NotNull Function1 function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        int i14;
        boolean z12;
        boolean n11;
        Object C11;
        int i15;
        boolean z13;
        boolean z14;
        O o12;
        kotlin.reflect.n nVar;
        boolean z15;
        Object C12;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(-649686062);
        if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= u11.n(o11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= (i11 & UserVerificationMethods.USER_VERIFY_NONE) == 0 ? u11.n(m11) : u11.F(m11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i13 |= u11.n(c9915y) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i13 |= u11.p(false) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i13 |= u11.p(true) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= u11.n(c9129i) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= u11.p(z11) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= u11.n(lVar) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= u11.n(eVar2) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (u11.F(function1) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i13 & 306783379) == 306783378 && (i14 & 3) == 2 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            u11.Q0();
            if ((i11 & 1) != 0 && !u11.w0()) {
                u11.j();
            }
            u11.j0();
            int i16 = i13 >> 3;
            int i17 = i16 & 14;
            int i18 = i17 | ((i14 << 3) & 112);
            InterfaceC3978p0 l11 = n1.l(function1, u11);
            int i19 = i13;
            boolean z16 = (((i18 & 14) ^ 6) > 4 && u11.n(o11)) || (i18 & 6) == 4;
            Object C13 = u11.C();
            if (z16 || C13 == InterfaceC3967k.a.a()) {
                C13 = new C10398n(n1.d(n1.k(), new C10400p(n1.d(n1.k(), new C10399o(l11)), o11)), A1.class, AppMeasurementSdk.ConditionalUserProperty.VALUE, "getValue()Ljava/lang/Object;", 0);
                u11.x(C13);
            }
            kotlin.reflect.n nVar2 = (kotlin.reflect.n) C13;
            int i21 = i19 >> 9;
            int i22 = i17 | (i21 & 112);
            boolean z17 = ((((i22 & 14) ^ 6) > 4 && u11.n(o11)) || (i22 & 6) == 4) | ((((i22 & 112) ^ 48) > 32 && u11.p(false)) || (i22 & 48) == 32);
            Object C14 = u11.C();
            if (z17 || C14 == InterfaceC3967k.a.a()) {
                C14 = new U(o11);
                u11.x(C14);
            }
            U u12 = (U) C14;
            Object C15 = u11.C();
            if (C15 == InterfaceC3967k.a.a()) {
                C15 = Pk0.f.b(S0.Q.j(kotlin.coroutines.g.f71771a, u11), u11);
            }
            xe.M a11 = ((S0.D) C15).a();
            InterfaceC7823h0 interfaceC7823h0 = (InterfaceC7823h0) u11.m(K0.h());
            int i23 = (i19 & 524272) | (i21 & 3670016) | (i16 & 29360128);
            boolean z18 = ((((i23 & 112) ^ 48) > 32 && u11.n(o11)) || (i23 & 48) == 32) | ((((i23 & 896) ^ 384) > 256 && u11.n(m11)) || (i23 & 384) == 256) | ((((i23 & 7168) ^ 3072) > 2048 && u11.n(c9915y)) || (i23 & 3072) == 2048);
            if (((57344 & i23) ^ 24576) <= 16384) {
            }
            if ((i23 & 24576) != 16384) {
                z12 = false;
                n11 = z18 | z12 | ((((458752 & i23) ^ 196608) <= 131072 && u11.p(true)) || (i23 & 196608) == 131072) | ((((i23 & 3670016) ^ 1572864) <= 1048576 && u11.n(eVar2)) || (i23 & 1572864) == 1048576) | ((((i23 & 29360128) ^ 12582912) <= 8388608 && u11.n(lVar)) || (i23 & 12582912) == 8388608) | u11.n(interfaceC7823h0);
                C11 = u11.C();
                if (!n11 || C11 == InterfaceC3967k.a.a()) {
                    i15 = i16;
                    z13 = true;
                    z14 = false;
                    Object yVar = new y(o11, c9915y, nVar2, m11, lVar, eVar2, a11, interfaceC7823h0);
                    o12 = o11;
                    nVar = nVar2;
                    u11.x(yVar);
                    C11 = yVar;
                } else {
                    o12 = o11;
                    nVar = nVar2;
                    i15 = i16;
                    z13 = true;
                    z14 = false;
                }
                Function2 function2 = (Function2) C11;
                EnumC9142v enumC9142v = EnumC9142v.Vertical;
                androidx.compose.ui.e a12 = androidx.compose.foundation.lazy.layout.p.a(eVar.l0(o12.x()).l0(o12.k()), nVar, u12, enumC9142v, z11);
                z15 = (((i17 ^ 6) > 4 || !u11.n(o12)) && (i15 & 6) != 4) ? false : z13;
                C12 = u11.C();
                if (!z15 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new C10389e(o12);
                    u11.x(C12);
                }
                c3969l = u11;
                androidx.compose.foundation.lazy.layout.n.a(nVar, e0.a(C10608m.a(a12, (C10389e) C12, o12.l(), (Z1.s) u11.m(K0.k()), enumC9142v, z11, u11, (i15 & 3670016) | (i15 & 7168) | UserVerificationMethods.USER_VERIFY_NONE).l0(o12.p().f()), o12, enumC9142v, z11, z14, c9129i, o12.o(), null, u11, 64), o11.v(), function2, c3969l, 0);
            }
            z12 = true;
            n11 = z18 | z12 | ((((458752 & i23) ^ 196608) <= 131072 && u11.p(true)) || (i23 & 196608) == 131072) | ((((i23 & 3670016) ^ 1572864) <= 1048576 && u11.n(eVar2)) || (i23 & 1572864) == 1048576) | ((((i23 & 29360128) ^ 12582912) <= 8388608 && u11.n(lVar)) || (i23 & 12582912) == 8388608) | u11.n(interfaceC7823h0);
            C11 = u11.C();
            if (n11) {
            }
            i15 = i16;
            z13 = true;
            z14 = false;
            Object yVar2 = new y(o11, c9915y, nVar2, m11, lVar, eVar2, a11, interfaceC7823h0);
            o12 = o11;
            nVar = nVar2;
            u11.x(yVar2);
            C11 = yVar2;
            Function2 function22 = (Function2) C11;
            EnumC9142v enumC9142v2 = EnumC9142v.Vertical;
            androidx.compose.ui.e a122 = androidx.compose.foundation.lazy.layout.p.a(eVar.l0(o12.x()).l0(o12.k()), nVar, u12, enumC9142v2, z11);
            if ((i17 ^ 6) > 4) {
            }
            C12 = u11.C();
            if (!z15) {
            }
            C12 = new C10389e(o12);
            u11.x(C12);
            c3969l = u11;
            androidx.compose.foundation.lazy.layout.n.a(nVar, e0.a(C10608m.a(a122, (C10389e) C12, o12.l(), (Z1.s) u11.m(K0.k()), enumC9142v2, z11, u11, (i15 & 3670016) | (i15 & 7168) | UserVerificationMethods.USER_VERIFY_NONE).l0(o12.p().f()), o12, enumC9142v2, z11, z14, c9129i, o12.o(), null, u11, 64), o11.v(), function22, c3969l, 0);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new C10403t(eVar, o11, m11, c9915y, c9129i, z11, lVar, eVar2, function1, i11, i12));
        }
    }
}
