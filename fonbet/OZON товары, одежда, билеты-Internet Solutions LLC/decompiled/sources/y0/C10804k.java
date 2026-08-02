package y0;

import S0.A1;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import a1.C4912a;
import androidx.compose.ui.platform.K0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e1.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import r0.C9125e;
import r0.EnumC9142v;
import r0.InterfaceC9120V;
import r0.InterfaceC9124d;
import s0.InterfaceC9574q;
import u0.C9915y;
import w1.InterfaceC10406a;
import x0.C10608m;
import x0.InterfaceC10585N;

/* renamed from: y0.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10804k {
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02c1, code lost:
    
        if (r8.p(false) != false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x038c, code lost:
    
        if (r8.r(r0) == false) goto L234;
     */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x038f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(@NotNull androidx.compose.ui.e eVar, @NotNull b0 b0Var, @NotNull C9915y c9915y, @NotNull EnumC9142v enumC9142v, @NotNull InterfaceC9120V interfaceC9120V, boolean z11, int i11, float f7, @NotNull C10808o c10808o, @NotNull InterfaceC10406a interfaceC10406a, @NotNull d.a aVar, @NotNull d.b bVar, @NotNull InterfaceC9574q.a aVar2, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i12, int i13) {
        int i14;
        int i15;
        InterfaceC9574q.a aVar3;
        boolean z12;
        int i16;
        boolean z13;
        boolean n11;
        Object m11;
        int i17;
        int i18;
        int i19;
        InterfaceC10406a interfaceC10406a2;
        b0 b0Var2;
        kotlin.reflect.n nVar;
        C3969l c3969l;
        boolean z14;
        boolean p11;
        Object C11;
        boolean z15;
        Object C12;
        boolean n12;
        Object C13;
        boolean z16;
        Object C14;
        b0 b0Var3;
        C3969l c3969l2;
        C3969l u11 = interfaceC3967k.u(538371694);
        if ((i12 & 6) == 0) {
            i14 = i12 | (u11.n(eVar) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= u11.n(b0Var) ? 32 : 16;
        }
        int i21 = i12 & 384;
        int i22 = UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i21 == 0) {
            i14 |= u11.n(c9915y) ? 256 : 128;
        }
        int i23 = i12 & 3072;
        int i24 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i23 == 0) {
            i14 |= u11.p(false) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i14 |= u11.n(enumC9142v) ? 16384 : 8192;
        }
        if ((i12 & 196608) == 0) {
            i14 |= u11.n(interfaceC9120V) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i14 |= u11.p(z11) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i14 |= u11.r(i11) ? 8388608 : 4194304;
        }
        if ((i12 & 100663296) == 0) {
            i14 |= u11.q(f7) ? 67108864 : 33554432;
        }
        if ((i12 & 805306368) == 0) {
            i14 |= u11.n(c10808o) ? 536870912 : 268435456;
        }
        int i25 = i14;
        if ((i13 & 6) == 0) {
            i15 = i13 | (u11.F(interfaceC10406a) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= u11.F(null) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if (u11.n(aVar)) {
                i22 = 256;
            }
            i15 |= i22;
        }
        if ((i13 & 3072) == 0) {
            if (u11.n(bVar)) {
                i24 = 2048;
            }
            i15 |= i24;
        }
        if ((i13 & 24576) == 0) {
            aVar3 = aVar2;
            i15 |= u11.n(aVar3) ? 16384 : 8192;
        } else {
            aVar3 = aVar2;
        }
        if ((i13 & 196608) == 0) {
            i15 |= u11.F(c4912a) ? 131072 : 65536;
        }
        if ((i25 & 306783379) == 306783378 && (i15 & 74899) == 74898 && u11.b()) {
            u11.j();
            b0Var3 = b0Var;
            i19 = i11;
            c3969l2 = u11;
        } else {
            if (i11 < 0) {
                throw new IllegalArgumentException(Ej.b.a(i11, "beyondViewportPageCount should be greater than or equal to 0, you selected ").toString());
            }
            int i26 = i25 & 112;
            boolean z17 = i26 == 32;
            Object C15 = u11.C();
            if (z17 || C15 == InterfaceC3967k.a.a()) {
                C15 = new C10799f(b0Var);
                u11.x(C15);
            }
            Function0 function0 = (Function0) C15;
            int i27 = i25 >> 3;
            int i28 = i27 & 14;
            int i29 = i15 >> 12;
            int i31 = i28 | (i29 & 112) | ((i15 << 3) & 896);
            InterfaceC3978p0 l11 = n1.l(c4912a, u11);
            InterfaceC3978p0 l12 = n1.l(null, u11);
            boolean n13 = ((((i31 & 14) ^ 6) > 4 && u11.n(b0Var)) || (i31 & 6) == 4) | u11.n(l11) | u11.n(l12) | u11.n(function0);
            Object C16 = u11.C();
            if (n13 || C16 == InterfaceC3967k.a.a()) {
                C16 = new C10801h(n1.d(n1.k(), new C10803j(n1.d(n1.k(), new C10802i(function0, l11, l12)), b0Var)), A1.class, AppMeasurementSdk.ConditionalUserProperty.VALUE, "getValue()Ljava/lang/Object;", 0);
                u11.x(C16);
            }
            kotlin.reflect.n nVar2 = (kotlin.reflect.n) C16;
            Object C17 = u11.C();
            if (C17 == InterfaceC3967k.a.a()) {
                C17 = Pk0.f.b(S0.Q.j(kotlin.coroutines.g.f71771a, u11), u11);
            }
            xe.M a11 = ((S0.D) C17).a();
            boolean z18 = i26 == 32;
            Object C18 = u11.C();
            if (z18 || C18 == InterfaceC3967k.a.a()) {
                C18 = new C10798e(b0Var);
                u11.x(C18);
            }
            Function0 function02 = (Function0) C18;
            int i32 = i25 & 7168;
            int i33 = i25 >> 6;
            int i34 = i15 << 18;
            int i35 = (65520 & i25) | (i33 & 458752) | (i33 & 3670016) | (i33 & 29360128) | (i34 & 234881024) | (i34 & 1879048192);
            boolean z19 = ((((i35 & 112) ^ 48) > 32 && u11.n(b0Var)) || (i35 & 48) == 32) | ((((i35 & 896) ^ 384) > 256 && u11.n(c9915y)) || (i35 & 384) == 256);
            if (((i35 & 7168) ^ 3072) <= 2048) {
            }
            if ((i35 & 3072) != 2048) {
                z12 = false;
                boolean n14 = z19 | z12 | ((((57344 & i35) ^ 24576) <= 16384 && u11.n(enumC9142v)) || (i35 & 24576) == 16384) | ((((234881024 & i35) ^ 100663296) <= 67108864 && u11.n(aVar)) || (i35 & 100663296) == 67108864) | ((((1879048192 & i35) ^ 805306368) <= 536870912 && u11.n(bVar)) || (i35 & 805306368) == 536870912) | ((((i35 & 3670016) ^ 1572864) <= 1048576 && u11.q(f7)) || (i35 & 1572864) == 1048576) | ((((29360128 & i35) ^ 12582912) <= 8388608 && u11.n(c10808o)) || (i35 & 12582912) == 8388608) | ((((i29 & 14) ^ 6) <= 4 && u11.n(aVar3)) || (i29 & 6) == 4) | u11.n(function02);
                if (((i35 & 458752) ^ 196608) <= 131072) {
                    i16 = i11;
                } else {
                    i16 = i11;
                }
                if ((i35 & 196608) != 131072) {
                    z13 = false;
                    n11 = n14 | z13 | u11.n(a11);
                    Object C19 = u11.C();
                    if (!n11 || C19 == InterfaceC3967k.a.a()) {
                        C3969l c3969l3 = u11;
                        i17 = i26;
                        i18 = 4;
                        i19 = i16;
                        interfaceC10406a2 = interfaceC10406a;
                        m11 = new M(b0Var, enumC9142v, c9915y, f7, c10808o, nVar2, function02, bVar, aVar, i19, aVar3, a11);
                        b0Var2 = b0Var;
                        nVar = nVar2;
                        c3969l3.x(m11);
                        c3969l = c3969l3;
                    } else {
                        nVar = nVar2;
                        b0Var2 = b0Var;
                        c3969l = u11;
                        i17 = i26;
                        m11 = C19;
                        i18 = 4;
                        i19 = i16;
                        interfaceC10406a2 = interfaceC10406a;
                    }
                    Function2 function2 = (Function2) m11;
                    EnumC9142v enumC9142v2 = EnumC9142v.Vertical;
                    z14 = enumC9142v == enumC9142v2;
                    p11 = (((i28 ^ 6) <= i18 && c3969l.n(b0Var2)) || (i27 & 6) == i18) | c3969l.p(z14);
                    C11 = c3969l.C();
                    if (!p11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new C10805l(b0Var2, z14);
                        c3969l.x(C11);
                    }
                    InterfaceC10585N interfaceC10585N = (InterfaceC10585N) C11;
                    int i36 = i17;
                    z15 = (i36 == 32) | ((i25 & 458752) == 131072);
                    C12 = c3969l.C();
                    if (!z15 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new h0(interfaceC9120V, b0Var2);
                        c3969l.x(C12);
                    }
                    h0 h0Var = (h0) C12;
                    InterfaceC9124d interfaceC9124d = (InterfaceC9124d) c3969l.m(C9125e.a());
                    n12 = (i36 == 32) | c3969l.n(interfaceC9124d);
                    C13 = c3969l.C();
                    if (!n12 || C13 == InterfaceC3967k.a.a()) {
                        C13 = new C10810q(b0Var2, interfaceC9124d);
                        c3969l.x(C13);
                    }
                    C10810q c10810q = (C10810q) C13;
                    androidx.compose.ui.e a12 = androidx.compose.foundation.lazy.layout.p.a(eVar.l0(b0Var2.L()).l0(b0Var2.p()), nVar, interfaceC10585N, enumC9142v, z11);
                    androidx.compose.ui.e l02 = z11 ? a12.l0(I1.o.c(androidx.compose.ui.e.f40358c0, false, new C10817y(enumC9142v == enumC9142v2, b0Var2, a11))) : a12.l0(androidx.compose.ui.e.f40358c0);
                    int i37 = i28 | ((i25 >> 18) & 112);
                    z16 = ((((i37 & 14) ^ 6) <= i18 && c3969l.n(b0Var2)) || (i37 & 6) == i18) | ((((i37 & 112) ^ 48) > 32 && c3969l.r(i19)) || (i37 & 48) == 32);
                    C14 = c3969l.C();
                    if (!z16 || C14 == InterfaceC3967k.a.a()) {
                        C14 = new C10809p(b0Var2, i19);
                        c3969l.x(C14);
                    }
                    androidx.compose.ui.e a13 = C10608m.a(l02, (C10809p) C14, b0Var2.q(), (Z1.s) c3969l.m(K0.k()), enumC9142v, z11, c3969l, (i25 & 3670016) | 512 | i32 | ((i25 << 3) & 458752));
                    t0.q x11 = b0Var2.x();
                    b0 b0Var4 = b0Var2;
                    C3969l c3969l4 = c3969l;
                    androidx.compose.ui.e a14 = n0.e0.a(a13, b0Var4, enumC9142v, z11, false, h0Var, x11, c10810q, c3969l4, 0);
                    b0Var3 = b0Var4;
                    androidx.compose.foundation.lazy.layout.n.a(nVar, androidx.compose.ui.input.nestedscroll.a.a(a14.l0(x1.L.b(androidx.compose.ui.e.f40358c0, b0Var3, new C10800g(b0Var3, null))), interfaceC10406a2, null), b0Var3.J(), function2, c3969l4, 0);
                    c3969l2 = c3969l4;
                }
                z13 = true;
                n11 = n14 | z13 | u11.n(a11);
                Object C192 = u11.C();
                if (n11) {
                }
                C3969l c3969l32 = u11;
                i17 = i26;
                i18 = 4;
                i19 = i16;
                interfaceC10406a2 = interfaceC10406a;
                m11 = new M(b0Var, enumC9142v, c9915y, f7, c10808o, nVar2, function02, bVar, aVar, i19, aVar3, a11);
                b0Var2 = b0Var;
                nVar = nVar2;
                c3969l32.x(m11);
                c3969l = c3969l32;
                Function2 function22 = (Function2) m11;
                EnumC9142v enumC9142v22 = EnumC9142v.Vertical;
                if (enumC9142v == enumC9142v22) {
                }
                p11 = (((i28 ^ 6) <= i18 && c3969l.n(b0Var2)) || (i27 & 6) == i18) | c3969l.p(z14);
                C11 = c3969l.C();
                if (!p11) {
                }
                C11 = new C10805l(b0Var2, z14);
                c3969l.x(C11);
                InterfaceC10585N interfaceC10585N2 = (InterfaceC10585N) C11;
                int i362 = i17;
                z15 = (i362 == 32) | ((i25 & 458752) == 131072);
                C12 = c3969l.C();
                if (!z15) {
                }
                C12 = new h0(interfaceC9120V, b0Var2);
                c3969l.x(C12);
                h0 h0Var2 = (h0) C12;
                InterfaceC9124d interfaceC9124d2 = (InterfaceC9124d) c3969l.m(C9125e.a());
                n12 = (i362 == 32) | c3969l.n(interfaceC9124d2);
                C13 = c3969l.C();
                if (!n12) {
                }
                C13 = new C10810q(b0Var2, interfaceC9124d2);
                c3969l.x(C13);
                C10810q c10810q2 = (C10810q) C13;
                androidx.compose.ui.e a122 = androidx.compose.foundation.lazy.layout.p.a(eVar.l0(b0Var2.L()).l0(b0Var2.p()), nVar, interfaceC10585N2, enumC9142v, z11);
                if (z11) {
                }
                int i372 = i28 | ((i25 >> 18) & 112);
                if (((i372 & 112) ^ 48) > 32) {
                    z16 = ((((i372 & 14) ^ 6) <= i18 && c3969l.n(b0Var2)) || (i372 & 6) == i18) | ((((i372 & 112) ^ 48) > 32 && c3969l.r(i19)) || (i372 & 48) == 32);
                    C14 = c3969l.C();
                    if (!z16) {
                    }
                    C14 = new C10809p(b0Var2, i19);
                    c3969l.x(C14);
                    androidx.compose.ui.e a132 = C10608m.a(l02, (C10809p) C14, b0Var2.q(), (Z1.s) c3969l.m(K0.k()), enumC9142v, z11, c3969l, (i25 & 3670016) | 512 | i32 | ((i25 << 3) & 458752));
                    t0.q x112 = b0Var2.x();
                    b0 b0Var42 = b0Var2;
                    C3969l c3969l42 = c3969l;
                    androidx.compose.ui.e a142 = n0.e0.a(a132, b0Var42, enumC9142v, z11, false, h0Var2, x112, c10810q2, c3969l42, 0);
                    b0Var3 = b0Var42;
                    androidx.compose.foundation.lazy.layout.n.a(nVar, androidx.compose.ui.input.nestedscroll.a.a(a142.l0(x1.L.b(androidx.compose.ui.e.f40358c0, b0Var3, new C10800g(b0Var3, null))), interfaceC10406a2, null), b0Var3.J(), function22, c3969l42, 0);
                    c3969l2 = c3969l42;
                }
                z16 = ((((i372 & 14) ^ 6) <= i18 && c3969l.n(b0Var2)) || (i372 & 6) == i18) | ((((i372 & 112) ^ 48) > 32 && c3969l.r(i19)) || (i372 & 48) == 32);
                C14 = c3969l.C();
                if (!z16) {
                }
                C14 = new C10809p(b0Var2, i19);
                c3969l.x(C14);
                androidx.compose.ui.e a1322 = C10608m.a(l02, (C10809p) C14, b0Var2.q(), (Z1.s) c3969l.m(K0.k()), enumC9142v, z11, c3969l, (i25 & 3670016) | 512 | i32 | ((i25 << 3) & 458752));
                t0.q x1122 = b0Var2.x();
                b0 b0Var422 = b0Var2;
                C3969l c3969l422 = c3969l;
                androidx.compose.ui.e a1422 = n0.e0.a(a1322, b0Var422, enumC9142v, z11, false, h0Var2, x1122, c10810q2, c3969l422, 0);
                b0Var3 = b0Var422;
                androidx.compose.foundation.lazy.layout.n.a(nVar, androidx.compose.ui.input.nestedscroll.a.a(a1422.l0(x1.L.b(androidx.compose.ui.e.f40358c0, b0Var3, new C10800g(b0Var3, null))), interfaceC10406a2, null), b0Var3.J(), function22, c3969l422, 0);
                c3969l2 = c3969l422;
            }
            z12 = true;
            boolean n142 = z19 | z12 | ((((57344 & i35) ^ 24576) <= 16384 && u11.n(enumC9142v)) || (i35 & 24576) == 16384) | ((((234881024 & i35) ^ 100663296) <= 67108864 && u11.n(aVar)) || (i35 & 100663296) == 67108864) | ((((1879048192 & i35) ^ 805306368) <= 536870912 && u11.n(bVar)) || (i35 & 805306368) == 536870912) | ((((i35 & 3670016) ^ 1572864) <= 1048576 && u11.q(f7)) || (i35 & 1572864) == 1048576) | ((((29360128 & i35) ^ 12582912) <= 8388608 && u11.n(c10808o)) || (i35 & 12582912) == 8388608) | ((((i29 & 14) ^ 6) <= 4 && u11.n(aVar3)) || (i29 & 6) == 4) | u11.n(function02);
            if (((i35 & 458752) ^ 196608) <= 131072) {
            }
            if ((i35 & 196608) != 131072) {
            }
            z13 = true;
            n11 = n142 | z13 | u11.n(a11);
            Object C1922 = u11.C();
            if (n11) {
            }
            C3969l c3969l322 = u11;
            i17 = i26;
            i18 = 4;
            i19 = i16;
            interfaceC10406a2 = interfaceC10406a;
            m11 = new M(b0Var, enumC9142v, c9915y, f7, c10808o, nVar2, function02, bVar, aVar, i19, aVar3, a11);
            b0Var2 = b0Var;
            nVar = nVar2;
            c3969l322.x(m11);
            c3969l = c3969l322;
            Function2 function222 = (Function2) m11;
            EnumC9142v enumC9142v222 = EnumC9142v.Vertical;
            if (enumC9142v == enumC9142v222) {
            }
            p11 = (((i28 ^ 6) <= i18 && c3969l.n(b0Var2)) || (i27 & 6) == i18) | c3969l.p(z14);
            C11 = c3969l.C();
            if (!p11) {
            }
            C11 = new C10805l(b0Var2, z14);
            c3969l.x(C11);
            InterfaceC10585N interfaceC10585N22 = (InterfaceC10585N) C11;
            int i3622 = i17;
            z15 = (i3622 == 32) | ((i25 & 458752) == 131072);
            C12 = c3969l.C();
            if (!z15) {
            }
            C12 = new h0(interfaceC9120V, b0Var2);
            c3969l.x(C12);
            h0 h0Var22 = (h0) C12;
            InterfaceC9124d interfaceC9124d22 = (InterfaceC9124d) c3969l.m(C9125e.a());
            n12 = (i3622 == 32) | c3969l.n(interfaceC9124d22);
            C13 = c3969l.C();
            if (!n12) {
            }
            C13 = new C10810q(b0Var2, interfaceC9124d22);
            c3969l.x(C13);
            C10810q c10810q22 = (C10810q) C13;
            androidx.compose.ui.e a1222 = androidx.compose.foundation.lazy.layout.p.a(eVar.l0(b0Var2.L()).l0(b0Var2.p()), nVar, interfaceC10585N22, enumC9142v, z11);
            if (z11) {
            }
            int i3722 = i28 | ((i25 >> 18) & 112);
            z16 = ((((i3722 & 14) ^ 6) <= i18 && c3969l.n(b0Var2)) || (i3722 & 6) == i18) | ((((i3722 & 112) ^ 48) > 32 && c3969l.r(i19)) || (i3722 & 48) == 32);
            C14 = c3969l.C();
            if (!z16) {
            }
            C14 = new C10809p(b0Var2, i19);
            c3969l.x(C14);
            androidx.compose.ui.e a13222 = C10608m.a(l02, (C10809p) C14, b0Var2.q(), (Z1.s) c3969l.m(K0.k()), enumC9142v, z11, c3969l, (i25 & 3670016) | 512 | i32 | ((i25 << 3) & 458752));
            t0.q x11222 = b0Var2.x();
            b0 b0Var4222 = b0Var2;
            C3969l c3969l4222 = c3969l;
            androidx.compose.ui.e a14222 = n0.e0.a(a13222, b0Var4222, enumC9142v, z11, false, h0Var22, x11222, c10810q22, c3969l4222, 0);
            b0Var3 = b0Var4222;
            androidx.compose.foundation.lazy.layout.n.a(nVar, androidx.compose.ui.input.nestedscroll.a.a(a14222.l0(x1.L.b(androidx.compose.ui.e.f40358c0, b0Var3, new C10800g(b0Var3, null))), interfaceC10406a2, null), b0Var3.J(), function222, c3969l4222, 0);
            c3969l2 = c3969l4222;
        }
        J0 m02 = c3969l2.m0();
        if (m02 != null) {
            m02.G(new C10797d(eVar, b0Var3, c9915y, enumC9142v, interfaceC9120V, z11, i19, f7, c10808o, interfaceC10406a, aVar, bVar, aVar2, c4912a, i12, i13));
        }
    }
}
