package y0;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import a1.C4912a;
import androidx.compose.ui.platform.K0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e1.d;
import l0.m0;
import m0.C8004n;
import m0.C8011q0;
import m0.InterfaceC7976A;
import m0.l1;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;
import r0.InterfaceC9120V;
import s0.C9562e;
import s0.C9563f;
import s0.C9568k;
import s0.C9573p;
import s0.InterfaceC9574q;
import u0.C9915y;
import w1.InterfaceC10406a;

/* renamed from: y0.B, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10792B {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(@NotNull b0 b0Var, androidx.compose.ui.e eVar, C9915y c9915y, C10808o c10808o, int i11, float f7, d.b bVar, InterfaceC9120V interfaceC9120V, boolean z11, InterfaceC10406a interfaceC10406a, InterfaceC9574q.a aVar, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i12, int i13) {
        int i14;
        androidx.compose.ui.e eVar2;
        int i15;
        C9915y c9915y2;
        int i16;
        float f11;
        int i17;
        C10808o c10808o2;
        boolean n11;
        Object C11;
        boolean z12;
        Object C12;
        InterfaceC9120V interfaceC9120V2;
        androidx.compose.ui.e eVar3;
        int i18;
        C9915y c9915y3;
        InterfaceC10406a interfaceC10406a2;
        float f12;
        d.b bVar2;
        InterfaceC9574q.a aVar2;
        boolean z13;
        InterfaceC9120V interfaceC9120V3;
        C10808o c10808o3;
        C9915y c9915y4;
        float f13;
        InterfaceC10406a interfaceC10406a3;
        d.b bVar3;
        InterfaceC9574q.a aVar3;
        androidx.compose.ui.e eVar4;
        boolean z14;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(1870896258);
        if ((i12 & 6) == 0) {
            i14 = (u11.n(b0Var) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i19 = i13 & 2;
        if (i19 != 0) {
            i14 |= 48;
        } else if ((i12 & 48) == 0) {
            eVar2 = eVar;
            i14 |= u11.n(eVar2) ? 32 : 16;
            i15 = i13 & 4;
            if (i15 == 0) {
                i14 |= 384;
            } else if ((i12 & 384) == 0) {
                c9915y2 = c9915y;
                i14 |= u11.n(c9915y2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                int i21 = i14 | 3072;
                if ((i12 & 24576) == 0) {
                    i21 |= u11.r(i11) ? 16384 : 8192;
                }
                i16 = i13 & 32;
                if (i16 != 0) {
                    i21 |= 196608;
                } else if ((i12 & 196608) == 0) {
                    f11 = f7;
                    i21 |= u11.q(f11) ? 131072 : 65536;
                    int i22 = 1572864 | i21;
                    if ((12582912 & i12) == 0) {
                        i22 = 5767168 | i21;
                    }
                    i17 = 905969664 | i22;
                    if ((306783379 & i17) == 306783378 || !u11.b()) {
                        u11.Q0();
                        if ((i12 & 1) != 0 || u11.w0()) {
                            androidx.compose.ui.e eVar5 = i19 == 0 ? androidx.compose.ui.e.f40358c0 : eVar2;
                            if (i15 != 0) {
                                float f14 = 0;
                                c9915y2 = new C9915y(f14, f14, f14, f14);
                            }
                            c10808o2 = C10808o.f105844a;
                            float f15 = i16 == 0 ? 0 : f11;
                            d.b i23 = InterfaceC6250b.a.i();
                            int i24 = 196608 | (i17 & 14);
                            S s11 = new S();
                            InterfaceC7976A b11 = m0.b(u11);
                            int i25 = l1.f73821b;
                            C8011q0 c11 = C8004n.c(400.0f, Float.valueOf(1), 1);
                            Object obj = (Z1.d) u11.m(K0.e());
                            Z1.s sVar = (Z1.s) u11.m(K0.k());
                            float f16 = f15;
                            n11 = ((((i24 & 14) ^ 6) <= 4 && u11.n(b0Var)) || (i24 & 6) == 4) | u11.n(b11) | u11.n(c11) | u11.n(s11) | u11.n(obj) | u11.n(sVar);
                            C11 = u11.C();
                            if (!n11 || C11 == InterfaceC3967k.a.a()) {
                                C9562e a11 = C9563f.a(new r(b0Var, sVar), s11, b0Var);
                                int i26 = C9573p.f98089b;
                                C11 = new C9568k(a11, b11, c11);
                                u11.x(C11);
                            }
                            InterfaceC9120V interfaceC9120V4 = (InterfaceC9120V) C11;
                            int i27 = i17 & (-29360129);
                            EnumC9142v enumC9142v = EnumC9142v.Horizontal;
                            int i28 = (i17 & 14) | 432;
                            z12 = (((i28 & 14) ^ 6) <= 4 && u11.n(b0Var)) || (i28 & 6) == 4;
                            C12 = u11.C();
                            if (!z12 || C12 == InterfaceC3967k.a.a()) {
                                C12 = new C10794a(b0Var, enumC9142v);
                                u11.x(C12);
                            }
                            androidx.compose.ui.e eVar6 = eVar5;
                            interfaceC9120V2 = interfaceC9120V4;
                            eVar3 = eVar6;
                            i18 = i27;
                            c9915y3 = c9915y2;
                            interfaceC10406a2 = (C10794a) C12;
                            f12 = f16;
                            bVar2 = i23;
                            aVar2 = InterfaceC9574q.a.f98090a;
                            z13 = true;
                        } else {
                            u11.j();
                            c10808o2 = c10808o;
                            bVar2 = bVar;
                            interfaceC9120V2 = interfaceC9120V;
                            z13 = z11;
                            i18 = i17 & (-29360129);
                            eVar3 = eVar2;
                            c9915y3 = c9915y2;
                            f12 = f11;
                            interfaceC10406a2 = interfaceC10406a;
                            aVar2 = aVar;
                        }
                        u11.j0();
                        int i29 = i18 << 9;
                        C10804k.a(eVar3, b0Var, c9915y3, EnumC9142v.Horizontal, interfaceC9120V2, z13, i11, f12, c10808o2, interfaceC10406a2, InterfaceC6250b.a.g(), bVar2, aVar2, c4912a, u11, ((i18 << 18) & 1879048192) | ((i18 >> 3) & 14) | 24576 | ((i18 << 3) & 112) | (i18 & 896) | ((i18 >> 18) & 7168) | ((i18 >> 6) & 3670016) | (i29 & 29360128) | (i29 & 234881024), ((i18 >> 9) & 7168) | 221616);
                        C10808o c10808o4 = c10808o2;
                        interfaceC9120V3 = interfaceC9120V2;
                        c10808o3 = c10808o4;
                        c9915y4 = c9915y3;
                        f13 = f12;
                        interfaceC10406a3 = interfaceC10406a2;
                        bVar3 = bVar2;
                        aVar3 = aVar2;
                        eVar4 = eVar3;
                        z14 = z13;
                    } else {
                        u11.j();
                        c10808o3 = c10808o;
                        interfaceC9120V3 = interfaceC9120V;
                        interfaceC10406a3 = interfaceC10406a;
                        aVar3 = aVar;
                        eVar4 = eVar2;
                        c9915y4 = c9915y2;
                        f13 = f11;
                        bVar3 = bVar;
                        z14 = z11;
                    }
                    m02 = u11.m0();
                    if (m02 == null) {
                        m02.G(new C10812t(b0Var, eVar4, c9915y4, c10808o3, i11, f13, bVar3, interfaceC9120V3, z14, interfaceC10406a3, aVar3, c4912a, i12, i13));
                        return;
                    }
                    return;
                }
                f11 = f7;
                int i222 = 1572864 | i21;
                if ((12582912 & i12) == 0) {
                }
                i17 = 905969664 | i222;
                if ((306783379 & i17) == 306783378) {
                }
                u11.Q0();
                if ((i12 & 1) != 0) {
                }
                if (i19 == 0) {
                }
                if (i15 != 0) {
                }
                c10808o2 = C10808o.f105844a;
                if (i16 == 0) {
                }
                d.b i232 = InterfaceC6250b.a.i();
                int i242 = 196608 | (i17 & 14);
                S s112 = new S();
                InterfaceC7976A b112 = m0.b(u11);
                int i252 = l1.f73821b;
                C8011q0 c112 = C8004n.c(400.0f, Float.valueOf(1), 1);
                Object obj2 = (Z1.d) u11.m(K0.e());
                Z1.s sVar2 = (Z1.s) u11.m(K0.k());
                float f162 = f15;
                n11 = ((((i242 & 14) ^ 6) <= 4 && u11.n(b0Var)) || (i242 & 6) == 4) | u11.n(b112) | u11.n(c112) | u11.n(s112) | u11.n(obj2) | u11.n(sVar2);
                C11 = u11.C();
                if (!n11) {
                }
                C9562e a112 = C9563f.a(new r(b0Var, sVar2), s112, b0Var);
                int i262 = C9573p.f98089b;
                C11 = new C9568k(a112, b112, c112);
                u11.x(C11);
                InterfaceC9120V interfaceC9120V42 = (InterfaceC9120V) C11;
                int i272 = i17 & (-29360129);
                EnumC9142v enumC9142v2 = EnumC9142v.Horizontal;
                int i282 = (i17 & 14) | 432;
                if (((i282 & 14) ^ 6) <= 4) {
                }
                C12 = u11.C();
                if (!z12) {
                }
                C12 = new C10794a(b0Var, enumC9142v2);
                u11.x(C12);
                androidx.compose.ui.e eVar62 = eVar5;
                interfaceC9120V2 = interfaceC9120V42;
                eVar3 = eVar62;
                i18 = i272;
                c9915y3 = c9915y2;
                interfaceC10406a2 = (C10794a) C12;
                f12 = f162;
                bVar2 = i232;
                aVar2 = InterfaceC9574q.a.f98090a;
                z13 = true;
                u11.j0();
                int i292 = i18 << 9;
                C10804k.a(eVar3, b0Var, c9915y3, EnumC9142v.Horizontal, interfaceC9120V2, z13, i11, f12, c10808o2, interfaceC10406a2, InterfaceC6250b.a.g(), bVar2, aVar2, c4912a, u11, ((i18 << 18) & 1879048192) | ((i18 >> 3) & 14) | 24576 | ((i18 << 3) & 112) | (i18 & 896) | ((i18 >> 18) & 7168) | ((i18 >> 6) & 3670016) | (i292 & 29360128) | (i292 & 234881024), ((i18 >> 9) & 7168) | 221616);
                C10808o c10808o42 = c10808o2;
                interfaceC9120V3 = interfaceC9120V2;
                c10808o3 = c10808o42;
                c9915y4 = c9915y3;
                f13 = f12;
                interfaceC10406a3 = interfaceC10406a2;
                bVar3 = bVar2;
                aVar3 = aVar2;
                eVar4 = eVar3;
                z14 = z13;
                m02 = u11.m0();
                if (m02 == null) {
                }
            }
            c9915y2 = c9915y;
            int i212 = i14 | 3072;
            if ((i12 & 24576) == 0) {
            }
            i16 = i13 & 32;
            if (i16 != 0) {
            }
            f11 = f7;
            int i2222 = 1572864 | i212;
            if ((12582912 & i12) == 0) {
            }
            i17 = 905969664 | i2222;
            if ((306783379 & i17) == 306783378) {
            }
            u11.Q0();
            if ((i12 & 1) != 0) {
            }
            if (i19 == 0) {
            }
            if (i15 != 0) {
            }
            c10808o2 = C10808o.f105844a;
            if (i16 == 0) {
            }
            d.b i2322 = InterfaceC6250b.a.i();
            int i2422 = 196608 | (i17 & 14);
            S s1122 = new S();
            InterfaceC7976A b1122 = m0.b(u11);
            int i2522 = l1.f73821b;
            C8011q0 c1122 = C8004n.c(400.0f, Float.valueOf(1), 1);
            Object obj22 = (Z1.d) u11.m(K0.e());
            Z1.s sVar22 = (Z1.s) u11.m(K0.k());
            float f1622 = f15;
            n11 = ((((i2422 & 14) ^ 6) <= 4 && u11.n(b0Var)) || (i2422 & 6) == 4) | u11.n(b1122) | u11.n(c1122) | u11.n(s1122) | u11.n(obj22) | u11.n(sVar22);
            C11 = u11.C();
            if (!n11) {
            }
            C9562e a1122 = C9563f.a(new r(b0Var, sVar22), s1122, b0Var);
            int i2622 = C9573p.f98089b;
            C11 = new C9568k(a1122, b1122, c1122);
            u11.x(C11);
            InterfaceC9120V interfaceC9120V422 = (InterfaceC9120V) C11;
            int i2722 = i17 & (-29360129);
            EnumC9142v enumC9142v22 = EnumC9142v.Horizontal;
            int i2822 = (i17 & 14) | 432;
            if (((i2822 & 14) ^ 6) <= 4) {
            }
            C12 = u11.C();
            if (!z12) {
            }
            C12 = new C10794a(b0Var, enumC9142v22);
            u11.x(C12);
            androidx.compose.ui.e eVar622 = eVar5;
            interfaceC9120V2 = interfaceC9120V422;
            eVar3 = eVar622;
            i18 = i2722;
            c9915y3 = c9915y2;
            interfaceC10406a2 = (C10794a) C12;
            f12 = f1622;
            bVar2 = i2322;
            aVar2 = InterfaceC9574q.a.f98090a;
            z13 = true;
            u11.j0();
            int i2922 = i18 << 9;
            C10804k.a(eVar3, b0Var, c9915y3, EnumC9142v.Horizontal, interfaceC9120V2, z13, i11, f12, c10808o2, interfaceC10406a2, InterfaceC6250b.a.g(), bVar2, aVar2, c4912a, u11, ((i18 << 18) & 1879048192) | ((i18 >> 3) & 14) | 24576 | ((i18 << 3) & 112) | (i18 & 896) | ((i18 >> 18) & 7168) | ((i18 >> 6) & 3670016) | (i2922 & 29360128) | (i2922 & 234881024), ((i18 >> 9) & 7168) | 221616);
            C10808o c10808o422 = c10808o2;
            interfaceC9120V3 = interfaceC9120V2;
            c10808o3 = c10808o422;
            c9915y4 = c9915y3;
            f13 = f12;
            interfaceC10406a3 = interfaceC10406a2;
            bVar3 = bVar2;
            aVar3 = aVar2;
            eVar4 = eVar3;
            z14 = z13;
            m02 = u11.m0();
            if (m02 == null) {
            }
        }
        eVar2 = eVar;
        i15 = i13 & 4;
        if (i15 == 0) {
        }
        c9915y2 = c9915y;
        int i2122 = i14 | 3072;
        if ((i12 & 24576) == 0) {
        }
        i16 = i13 & 32;
        if (i16 != 0) {
        }
        f11 = f7;
        int i22222 = 1572864 | i2122;
        if ((12582912 & i12) == 0) {
        }
        i17 = 905969664 | i22222;
        if ((306783379 & i17) == 306783378) {
        }
        u11.Q0();
        if ((i12 & 1) != 0) {
        }
        if (i19 == 0) {
        }
        if (i15 != 0) {
        }
        c10808o2 = C10808o.f105844a;
        if (i16 == 0) {
        }
        d.b i23222 = InterfaceC6250b.a.i();
        int i24222 = 196608 | (i17 & 14);
        S s11222 = new S();
        InterfaceC7976A b11222 = m0.b(u11);
        int i25222 = l1.f73821b;
        C8011q0 c11222 = C8004n.c(400.0f, Float.valueOf(1), 1);
        Object obj222 = (Z1.d) u11.m(K0.e());
        Z1.s sVar222 = (Z1.s) u11.m(K0.k());
        float f16222 = f15;
        n11 = ((((i24222 & 14) ^ 6) <= 4 && u11.n(b0Var)) || (i24222 & 6) == 4) | u11.n(b11222) | u11.n(c11222) | u11.n(s11222) | u11.n(obj222) | u11.n(sVar222);
        C11 = u11.C();
        if (!n11) {
        }
        C9562e a11222 = C9563f.a(new r(b0Var, sVar222), s11222, b0Var);
        int i26222 = C9573p.f98089b;
        C11 = new C9568k(a11222, b11222, c11222);
        u11.x(C11);
        InterfaceC9120V interfaceC9120V4222 = (InterfaceC9120V) C11;
        int i27222 = i17 & (-29360129);
        EnumC9142v enumC9142v222 = EnumC9142v.Horizontal;
        int i28222 = (i17 & 14) | 432;
        if (((i28222 & 14) ^ 6) <= 4) {
        }
        C12 = u11.C();
        if (!z12) {
        }
        C12 = new C10794a(b0Var, enumC9142v222);
        u11.x(C12);
        androidx.compose.ui.e eVar6222 = eVar5;
        interfaceC9120V2 = interfaceC9120V4222;
        eVar3 = eVar6222;
        i18 = i27222;
        c9915y3 = c9915y2;
        interfaceC10406a2 = (C10794a) C12;
        f12 = f16222;
        bVar2 = i23222;
        aVar2 = InterfaceC9574q.a.f98090a;
        z13 = true;
        u11.j0();
        int i29222 = i18 << 9;
        C10804k.a(eVar3, b0Var, c9915y3, EnumC9142v.Horizontal, interfaceC9120V2, z13, i11, f12, c10808o2, interfaceC10406a2, InterfaceC6250b.a.g(), bVar2, aVar2, c4912a, u11, ((i18 << 18) & 1879048192) | ((i18 >> 3) & 14) | 24576 | ((i18 << 3) & 112) | (i18 & 896) | ((i18 >> 18) & 7168) | ((i18 >> 6) & 3670016) | (i29222 & 29360128) | (i29222 & 234881024), ((i18 >> 9) & 7168) | 221616);
        C10808o c10808o4222 = c10808o2;
        interfaceC9120V3 = interfaceC9120V2;
        c10808o3 = c10808o4222;
        c9915y4 = c9915y3;
        f13 = f12;
        interfaceC10406a3 = interfaceC10406a2;
        bVar3 = bVar2;
        aVar3 = aVar2;
        eVar4 = eVar3;
        z14 = z13;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }
}
