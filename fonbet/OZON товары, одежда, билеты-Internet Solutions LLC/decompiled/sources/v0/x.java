package v0;

import S0.A1;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.ui.platform.K0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e1.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l1.InterfaceC7823h0;
import n0.e0;
import org.jetbrains.annotations.NotNull;
import r0.C9129i;
import r0.EnumC9142v;
import u0.C9915y;
import x0.C10608m;
import x0.InterfaceC10585N;

/* loaded from: classes.dex */
public final class x {
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02bf, code lost:
    
        if (r7.p(false) == false) goto L181;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(@NotNull androidx.compose.ui.e eVar, @NotNull I i11, @NotNull C9915y c9915y, boolean z11, @NotNull C9129i c9129i, boolean z12, d.a aVar, C5179b.l lVar, d.b bVar, C5179b.e eVar2, @NotNull Function1 function1, InterfaceC3967k interfaceC3967k, int i12, int i13, int i14) {
        int i15;
        int i16;
        C5179b.l lVar2;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        boolean z13;
        Object C11;
        boolean z14;
        Object C12;
        Object C13;
        int i24;
        boolean z15;
        boolean n11;
        Object C14;
        int i25;
        C3969l c3969l;
        boolean z16;
        I i26;
        C5179b.l lVar3;
        C5179b.e eVar3;
        d.a aVar2;
        d.b bVar2;
        kotlin.reflect.n nVar;
        int i27;
        boolean z17;
        boolean z18;
        boolean z19;
        Object C15;
        C3969l c3969l2;
        d.a aVar3;
        C5179b.l lVar4;
        d.b bVar3;
        C5179b.e eVar4;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(620764179);
        if ((i12 & 6) == 0) {
            i15 = (u11.n(eVar) ? 4 : 2) | i12;
        } else {
            i15 = i12;
        }
        if ((i12 & 48) == 0) {
            i15 |= u11.n(i11) ? 32 : 16;
        }
        int i28 = i12 & 384;
        int i29 = UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i28 == 0) {
            i15 |= u11.n(c9915y) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i15 |= u11.p(false) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 24576) == 0) {
            i15 |= u11.p(z11) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i15 |= u11.n(c9129i) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i15 |= u11.p(z12) ? 1048576 : 524288;
        }
        int i31 = i15 | 12582912;
        int i32 = i14 & 256;
        if (i32 != 0) {
            i31 = i15 | 113246208;
        } else if ((i12 & 100663296) == 0) {
            i31 |= u11.n(aVar) ? 67108864 : 33554432;
            i16 = i14 & UserVerificationMethods.USER_VERIFY_NONE;
            if (i16 == 0) {
                i31 |= 805306368;
                lVar2 = lVar;
            } else {
                lVar2 = lVar;
                if ((i12 & 805306368) == 0) {
                    i31 |= u11.n(lVar2) ? 536870912 : 268435456;
                }
            }
            i17 = i31;
            i18 = i14 & UserVerificationMethods.USER_VERIFY_ALL;
            if (i18 == 0) {
                i21 = i13 | 6;
                i19 = i18;
            } else if ((i13 & 6) == 0) {
                i19 = i18;
                i21 = i13 | (u11.n(bVar) ? 4 : 2);
            } else {
                i19 = i18;
                i21 = i13;
            }
            i22 = i14 & 2048;
            if (i22 == 0) {
                i21 |= 48;
            } else if ((i13 & 48) == 0) {
                i21 |= u11.n(eVar2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (u11.F(function1)) {
                    i29 = 256;
                }
                i21 |= i29;
            }
            i23 = i21;
            if ((i17 & 306783379) != 306783378 && (i23 & 147) == 146 && u11.b()) {
                u11.j();
                bVar3 = bVar;
                eVar4 = eVar2;
                c3969l2 = u11;
                lVar4 = lVar2;
                aVar3 = aVar;
            } else {
                d.a aVar4 = i32 == 0 ? null : aVar;
                if (i16 != 0) {
                    lVar2 = null;
                }
                d.b bVar4 = i19 == 0 ? null : bVar;
                C5179b.e eVar5 = i22 == 0 ? eVar2 : null;
                int i33 = (i17 >> 3) & 14;
                int i34 = i33 | ((i23 >> 3) & 112);
                InterfaceC3978p0 l11 = n1.l(function1, u11);
                z13 = (((i34 & 14) ^ 6) <= 4 && u11.n(i11)) || (i34 & 6) == 4;
                C11 = u11.C();
                if (!z13 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new q(n1.d(n1.k(), new s(n1.d(n1.k(), new r(l11)), i11, new androidx.compose.foundation.lazy.a())), A1.class, AppMeasurementSdk.ConditionalUserProperty.VALUE, "getValue()Ljava/lang/Object;", 0);
                    u11.x(C11);
                }
                kotlin.reflect.n nVar2 = (kotlin.reflect.n) C11;
                int i35 = i33 | ((i17 >> 9) & 112);
                z14 = ((((i35 & 112) ^ 48) <= 32 && u11.p(z11)) || (i35 & 48) == 32) | ((((i35 & 14) ^ 6) <= 4 && u11.n(i11)) || (i35 & 6) == 4);
                C12 = u11.C();
                if (!z14 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new C10166f(i11, z11);
                    u11.x(C12);
                }
                InterfaceC10585N interfaceC10585N = (InterfaceC10585N) C12;
                C13 = u11.C();
                if (C13 == InterfaceC3967k.a.a()) {
                    C13 = Pk0.f.b(Q.j(kotlin.coroutines.g.f71771a, u11), u11);
                }
                xe.M a11 = ((S0.D) C13).a();
                InterfaceC7823h0 interfaceC7823h0 = (InterfaceC7823h0) u11.m(K0.h());
                boolean z21 = !((Boolean) u11.m(K0.n())).booleanValue();
                int i36 = i17 & 7168;
                int i37 = i17 >> 6;
                int i38 = i23 << 21;
                i24 = (i17 & 65520) | (i37 & 458752) | (i37 & 3670016) | (i38 & 29360128) | (i38 & 234881024) | (i17 & 1879048192);
                boolean z22 = ((((i24 & 896) ^ 384) <= 256 && u11.n(c9915y)) || (i24 & 384) == 256) | ((((i24 & 112) ^ 48) <= 32 && u11.n(i11)) || (i24 & 48) == 32);
                if (((i24 & 7168) ^ 3072) <= 2048) {
                }
                if ((i24 & 3072) != 2048) {
                    z15 = false;
                    n11 = z22 | z15 | ((((57344 & i24) ^ 24576) <= 16384 && u11.p(z11)) || (i24 & 24576) == 16384) | ((((i24 & 3670016) ^ 1572864) <= 1048576 && u11.n(aVar4)) || (i24 & 1572864) == 1048576) | ((((i24 & 29360128) ^ 12582912) <= 8388608 && u11.n(bVar4)) || (i24 & 12582912) == 8388608) | ((((i24 & 234881024) ^ 100663296) <= 67108864 && u11.n(eVar5)) || (i24 & 100663296) == 67108864) | ((((i24 & 1879048192) ^ 805306368) <= 536870912 && u11.n(lVar2)) || (i24 & 805306368) == 536870912) | u11.n(interfaceC7823h0) | u11.p(z21);
                    C14 = u11.C();
                    if (!n11 || C14 == InterfaceC3967k.a.a()) {
                        C5179b.l lVar5 = lVar2;
                        d.b bVar5 = bVar4;
                        C5179b.e eVar6 = eVar5;
                        i25 = i17;
                        c3969l = u11;
                        z16 = false;
                        Object wVar = new w(i11, z11, c9915y, nVar2, lVar5, eVar6, z21, a11, interfaceC7823h0, aVar4, bVar5);
                        i26 = i11;
                        lVar3 = lVar5;
                        eVar3 = eVar6;
                        aVar2 = aVar4;
                        bVar2 = bVar5;
                        nVar = nVar2;
                        c3969l.x(wVar);
                        C14 = wVar;
                    } else {
                        i26 = i11;
                        i25 = i17;
                        eVar3 = eVar5;
                        c3969l = u11;
                        bVar2 = bVar4;
                        aVar2 = aVar4;
                        lVar3 = lVar2;
                        z16 = false;
                        nVar = nVar2;
                    }
                    Function2 function2 = (Function2) C14;
                    EnumC9142v enumC9142v = z11 ? EnumC9142v.Vertical : EnumC9142v.Horizontal;
                    androidx.compose.ui.e a12 = androidx.compose.foundation.lazy.layout.p.a(eVar.l0(i26.B()).l0(i26.m()), nVar, interfaceC10585N, enumC9142v, z12);
                    i27 = i33 | ((i25 >> 18) & 112);
                    boolean z23 = (((i27 & 14) ^ 6) <= 4 && c3969l.n(i26)) || (i27 & 6) == 4;
                    if (((i27 & 112) ^ 48) > 32) {
                        z17 = false;
                        if (c3969l.r(0)) {
                            z18 = true;
                            z19 = z23 | z18;
                            C15 = c3969l.C();
                            if (!z19 || C15 == InterfaceC3967k.a.a()) {
                                C15 = new C10168h(i26);
                                c3969l.x(C15);
                            }
                            androidx.compose.ui.e l02 = C10608m.a(a12, (C10168h) C15, i26.n(), (Z1.s) c3969l.m(K0.k()), enumC9142v, z12, c3969l, 512 | i36 | (i25 & 3670016)).l0(i26.s().f());
                            t0.q r11 = i26.r();
                            I i39 = i26;
                            C3969l c3969l3 = c3969l;
                            androidx.compose.foundation.lazy.layout.n.a(nVar, e0.a(l02, i39, enumC9142v, z12, z16, c9129i, r11, null, c3969l3, 64), i11.z(), function2, c3969l3, 0);
                            c3969l2 = c3969l3;
                            aVar3 = aVar2;
                            lVar4 = lVar3;
                            bVar3 = bVar2;
                            eVar4 = eVar3;
                        }
                    } else {
                        z17 = false;
                    }
                    z18 = z17;
                    z19 = z23 | z18;
                    C15 = c3969l.C();
                    if (!z19) {
                    }
                    C15 = new C10168h(i26);
                    c3969l.x(C15);
                    androidx.compose.ui.e l022 = C10608m.a(a12, (C10168h) C15, i26.n(), (Z1.s) c3969l.m(K0.k()), enumC9142v, z12, c3969l, 512 | i36 | (i25 & 3670016)).l0(i26.s().f());
                    t0.q r112 = i26.r();
                    I i392 = i26;
                    C3969l c3969l32 = c3969l;
                    androidx.compose.foundation.lazy.layout.n.a(nVar, e0.a(l022, i392, enumC9142v, z12, z16, c9129i, r112, null, c3969l32, 64), i11.z(), function2, c3969l32, 0);
                    c3969l2 = c3969l32;
                    aVar3 = aVar2;
                    lVar4 = lVar3;
                    bVar3 = bVar2;
                    eVar4 = eVar3;
                }
                z15 = true;
                n11 = z22 | z15 | ((((57344 & i24) ^ 24576) <= 16384 && u11.p(z11)) || (i24 & 24576) == 16384) | ((((i24 & 3670016) ^ 1572864) <= 1048576 && u11.n(aVar4)) || (i24 & 1572864) == 1048576) | ((((i24 & 29360128) ^ 12582912) <= 8388608 && u11.n(bVar4)) || (i24 & 12582912) == 8388608) | ((((i24 & 234881024) ^ 100663296) <= 67108864 && u11.n(eVar5)) || (i24 & 100663296) == 67108864) | ((((i24 & 1879048192) ^ 805306368) <= 536870912 && u11.n(lVar2)) || (i24 & 805306368) == 536870912) | u11.n(interfaceC7823h0) | u11.p(z21);
                C14 = u11.C();
                if (n11) {
                }
                C5179b.l lVar52 = lVar2;
                d.b bVar52 = bVar4;
                C5179b.e eVar62 = eVar5;
                i25 = i17;
                c3969l = u11;
                z16 = false;
                Object wVar2 = new w(i11, z11, c9915y, nVar2, lVar52, eVar62, z21, a11, interfaceC7823h0, aVar4, bVar52);
                i26 = i11;
                lVar3 = lVar52;
                eVar3 = eVar62;
                aVar2 = aVar4;
                bVar2 = bVar52;
                nVar = nVar2;
                c3969l.x(wVar2);
                C14 = wVar2;
                Function2 function22 = (Function2) C14;
                EnumC9142v enumC9142v2 = z11 ? EnumC9142v.Vertical : EnumC9142v.Horizontal;
                androidx.compose.ui.e a122 = androidx.compose.foundation.lazy.layout.p.a(eVar.l0(i26.B()).l0(i26.m()), nVar, interfaceC10585N, enumC9142v2, z12);
                i27 = i33 | ((i25 >> 18) & 112);
                if (((i27 & 14) ^ 6) <= 4) {
                }
                if (((i27 & 112) ^ 48) > 32) {
                }
                z18 = z17;
                z19 = z23 | z18;
                C15 = c3969l.C();
                if (!z19) {
                }
                C15 = new C10168h(i26);
                c3969l.x(C15);
                androidx.compose.ui.e l0222 = C10608m.a(a122, (C10168h) C15, i26.n(), (Z1.s) c3969l.m(K0.k()), enumC9142v2, z12, c3969l, 512 | i36 | (i25 & 3670016)).l0(i26.s().f());
                t0.q r1122 = i26.r();
                I i3922 = i26;
                C3969l c3969l322 = c3969l;
                androidx.compose.foundation.lazy.layout.n.a(nVar, e0.a(l0222, i3922, enumC9142v2, z12, z16, c9129i, r1122, null, c3969l322, 64), i11.z(), function22, c3969l322, 0);
                c3969l2 = c3969l322;
                aVar3 = aVar2;
                lVar4 = lVar3;
                bVar3 = bVar2;
                eVar4 = eVar3;
            }
            m02 = c3969l2.m0();
            if (m02 == null) {
                m02.G(new t(eVar, i11, c9915y, z11, c9129i, z12, aVar3, lVar4, bVar3, eVar4, function1, i12, i13, i14));
                return;
            }
            return;
        }
        i16 = i14 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i16 == 0) {
        }
        i17 = i31;
        i18 = i14 & UserVerificationMethods.USER_VERIFY_ALL;
        if (i18 == 0) {
        }
        i22 = i14 & 2048;
        if (i22 == 0) {
        }
        if ((i13 & 384) == 0) {
        }
        i23 = i21;
        if ((i17 & 306783379) != 306783378) {
        }
        if (i32 == 0) {
        }
        if (i16 != 0) {
        }
        if (i19 == 0) {
        }
        if (i22 == 0) {
        }
        int i332 = (i17 >> 3) & 14;
        int i342 = i332 | ((i23 >> 3) & 112);
        InterfaceC3978p0 l112 = n1.l(function1, u11);
        if (((i342 & 14) ^ 6) <= 4) {
        }
        C11 = u11.C();
        if (!z13) {
        }
        C11 = new q(n1.d(n1.k(), new s(n1.d(n1.k(), new r(l112)), i11, new androidx.compose.foundation.lazy.a())), A1.class, AppMeasurementSdk.ConditionalUserProperty.VALUE, "getValue()Ljava/lang/Object;", 0);
        u11.x(C11);
        kotlin.reflect.n nVar22 = (kotlin.reflect.n) C11;
        int i352 = i332 | ((i17 >> 9) & 112);
        if (((i352 & 14) ^ 6) <= 4) {
        }
        z14 = ((((i352 & 112) ^ 48) <= 32 && u11.p(z11)) || (i352 & 48) == 32) | ((((i352 & 14) ^ 6) <= 4 && u11.n(i11)) || (i352 & 6) == 4);
        C12 = u11.C();
        if (!z14) {
        }
        C12 = new C10166f(i11, z11);
        u11.x(C12);
        InterfaceC10585N interfaceC10585N2 = (InterfaceC10585N) C12;
        C13 = u11.C();
        if (C13 == InterfaceC3967k.a.a()) {
        }
        xe.M a112 = ((S0.D) C13).a();
        InterfaceC7823h0 interfaceC7823h02 = (InterfaceC7823h0) u11.m(K0.h());
        boolean z212 = !((Boolean) u11.m(K0.n())).booleanValue();
        int i362 = i17 & 7168;
        int i372 = i17 >> 6;
        int i382 = i23 << 21;
        i24 = (i17 & 65520) | (i372 & 458752) | (i372 & 3670016) | (i382 & 29360128) | (i382 & 234881024) | (i17 & 1879048192);
        if (((i24 & 112) ^ 48) <= 32) {
        }
        boolean z222 = ((((i24 & 896) ^ 384) <= 256 && u11.n(c9915y)) || (i24 & 384) == 256) | ((((i24 & 112) ^ 48) <= 32 && u11.n(i11)) || (i24 & 48) == 32);
        if (((i24 & 7168) ^ 3072) <= 2048) {
        }
        if ((i24 & 3072) != 2048) {
        }
        z15 = true;
        n11 = z222 | z15 | ((((57344 & i24) ^ 24576) <= 16384 && u11.p(z11)) || (i24 & 24576) == 16384) | ((((i24 & 3670016) ^ 1572864) <= 1048576 && u11.n(aVar4)) || (i24 & 1572864) == 1048576) | ((((i24 & 29360128) ^ 12582912) <= 8388608 && u11.n(bVar4)) || (i24 & 12582912) == 8388608) | ((((i24 & 234881024) ^ 100663296) <= 67108864 && u11.n(eVar5)) || (i24 & 100663296) == 67108864) | ((((i24 & 1879048192) ^ 805306368) <= 536870912 && u11.n(lVar2)) || (i24 & 805306368) == 536870912) | u11.n(interfaceC7823h02) | u11.p(z212);
        C14 = u11.C();
        if (n11) {
        }
        C5179b.l lVar522 = lVar2;
        d.b bVar522 = bVar4;
        C5179b.e eVar622 = eVar5;
        i25 = i17;
        c3969l = u11;
        z16 = false;
        Object wVar22 = new w(i11, z11, c9915y, nVar22, lVar522, eVar622, z212, a112, interfaceC7823h02, aVar4, bVar522);
        i26 = i11;
        lVar3 = lVar522;
        eVar3 = eVar622;
        aVar2 = aVar4;
        bVar2 = bVar522;
        nVar = nVar22;
        c3969l.x(wVar22);
        C14 = wVar22;
        Function2 function222 = (Function2) C14;
        EnumC9142v enumC9142v22 = z11 ? EnumC9142v.Vertical : EnumC9142v.Horizontal;
        androidx.compose.ui.e a1222 = androidx.compose.foundation.lazy.layout.p.a(eVar.l0(i26.B()).l0(i26.m()), nVar, interfaceC10585N2, enumC9142v22, z12);
        i27 = i332 | ((i25 >> 18) & 112);
        if (((i27 & 14) ^ 6) <= 4) {
        }
        if (((i27 & 112) ^ 48) > 32) {
        }
        z18 = z17;
        z19 = z23 | z18;
        C15 = c3969l.C();
        if (!z19) {
        }
        C15 = new C10168h(i26);
        c3969l.x(C15);
        androidx.compose.ui.e l02222 = C10608m.a(a1222, (C10168h) C15, i26.n(), (Z1.s) c3969l.m(K0.k()), enumC9142v22, z12, c3969l, 512 | i362 | (i25 & 3670016)).l0(i26.s().f());
        t0.q r11222 = i26.r();
        I i39222 = i26;
        C3969l c3969l3222 = c3969l;
        androidx.compose.foundation.lazy.layout.n.a(nVar, e0.a(l02222, i39222, enumC9142v22, z12, z16, c9129i, r11222, null, c3969l3222, 64), i11.z(), function222, c3969l3222, 0);
        c3969l2 = c3969l3222;
        aVar3 = aVar2;
        lVar4 = lVar3;
        bVar3 = bVar2;
        eVar4 = eVar3;
        m02 = c3969l2.m0();
        if (m02 == null) {
        }
    }
}
