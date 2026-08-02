package v0;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.C5179b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e1.d;
import kotlin.jvm.functions.Function1;
import l0.m0;
import m0.InterfaceC7976A;
import org.jetbrains.annotations.NotNull;
import r0.C9129i;
import u0.C9915y;

/* renamed from: v0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10164d {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(androidx.compose.ui.e eVar, I i11, C9915y c9915y, C5179b.l lVar, d.a aVar, C9129i c9129i, boolean z11, @NotNull Function1 function1, InterfaceC3967k interfaceC3967k, int i12, int i13) {
        androidx.compose.ui.e eVar2;
        int i14;
        I i15;
        C9915y c9915y2;
        C5179b.l lVar2;
        int i16;
        Function1 function12;
        I i17;
        C9915y c9915y3;
        boolean n11;
        Object C11;
        I i18;
        d.a aVar2;
        C9915y c9915y4;
        C9129i c9129i2;
        boolean z12;
        androidx.compose.ui.e eVar3;
        int i19;
        C3969l c3969l;
        androidx.compose.ui.e eVar4;
        I i21;
        C9915y c9915y5;
        C9129i c9129i3;
        boolean z13;
        d.a aVar3;
        C5179b.l lVar3;
        J0 m02;
        int i22;
        int i23;
        C3969l u11 = interfaceC3967k.u(-740714857);
        int i24 = i13 & 1;
        if (i24 != 0) {
            i14 = i12 | 6;
            eVar2 = eVar;
        } else if ((i12 & 6) == 0) {
            eVar2 = eVar;
            i14 = (u11.n(eVar2) ? 4 : 2) | i12;
        } else {
            eVar2 = eVar;
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            if ((i13 & 2) == 0) {
                i15 = i11;
                if (u11.n(i15)) {
                    i23 = 32;
                    i14 |= i23;
                }
            } else {
                i15 = i11;
            }
            i23 = 16;
            i14 |= i23;
        } else {
            i15 = i11;
        }
        int i25 = i13 & 4;
        if (i25 != 0) {
            i14 |= 384;
        } else if ((i12 & 384) == 0) {
            c9915y2 = c9915y;
            i14 |= u11.n(c9915y2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            int i26 = i14 | 3072;
            if ((i12 & 24576) != 0) {
                if ((i13 & 16) == 0) {
                    lVar2 = lVar;
                    if (u11.n(lVar2)) {
                        i22 = 16384;
                        i26 |= i22;
                    }
                } else {
                    lVar2 = lVar;
                }
                i22 = 8192;
                i26 |= i22;
            } else {
                lVar2 = lVar;
            }
            int i27 = 196608 | i26;
            if ((1572864 & i12) == 0) {
                i27 = 720896 | i26;
            }
            i16 = 12582912 | i27;
            if ((100663296 & i12) != 0) {
                function12 = function1;
                i16 |= u11.F(function12) ? 67108864 : 33554432;
            } else {
                function12 = function1;
            }
            if ((38347923 & i16) == 38347922 || !u11.b()) {
                u11.Q0();
                if ((i12 & 1) != 0 || u11.w0()) {
                    androidx.compose.ui.e eVar5 = i24 == 0 ? androidx.compose.ui.e.f40358c0 : eVar2;
                    if ((i13 & 2) == 0) {
                        i17 = M.c(0, 0, u11, 3);
                        i16 &= -113;
                    } else {
                        i17 = i15;
                    }
                    if (i25 == 0) {
                        float f7 = 0;
                        c9915y3 = new C9915y(f7, f7, f7, f7);
                    } else {
                        c9915y3 = c9915y2;
                    }
                    if ((i13 & 16) != 0) {
                        i16 &= -57345;
                        lVar2 = C5179b.g();
                    }
                    d.a k11 = InterfaceC6250b.a.k();
                    InterfaceC7976A b11 = m0.b(u11);
                    n11 = u11.n(b11);
                    C11 = u11.C();
                    if (!n11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new C9129i(b11);
                        u11.x(C11);
                    }
                    C9129i c9129i4 = (C9129i) C11;
                    i18 = i17;
                    aVar2 = k11;
                    c9915y4 = c9915y3;
                    c9129i2 = c9129i4;
                    z12 = true;
                    eVar3 = eVar5;
                    i19 = i16 & (-3670017);
                } else {
                    u11.j();
                    if ((i13 & 2) != 0) {
                        i16 &= -113;
                    }
                    if ((i13 & 16) != 0) {
                        i16 &= -57345;
                    }
                    i19 = i16 & (-3670017);
                    aVar2 = aVar;
                    c9129i2 = c9129i;
                    z12 = z11;
                    eVar3 = eVar2;
                    i18 = i15;
                    c9915y4 = c9915y2;
                }
                C5179b.l lVar4 = lVar2;
                u11.j0();
                c3969l = u11;
                x.a(eVar3, i18, c9915y4, true, c9129i2, z12, aVar2, lVar4, null, null, function12, c3969l, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | ((i19 >> 3) & 3670016) | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
                eVar4 = eVar3;
                i21 = i18;
                c9915y5 = c9915y4;
                c9129i3 = c9129i2;
                z13 = z12;
                aVar3 = aVar2;
                lVar3 = lVar4;
            } else {
                u11.j();
                aVar3 = aVar;
                c3969l = u11;
                eVar4 = eVar2;
                i21 = i15;
                c9915y5 = c9915y2;
                lVar3 = lVar2;
                c9129i3 = c9129i;
                z13 = z11;
            }
            m02 = c3969l.m0();
            if (m02 == null) {
                m02.G(new C10162b(eVar4, i21, c9915y5, lVar3, aVar3, c9129i3, z13, function1, i12, i13));
                return;
            }
            return;
        }
        c9915y2 = c9915y;
        int i262 = i14 | 3072;
        if ((i12 & 24576) != 0) {
        }
        int i272 = 196608 | i262;
        if ((1572864 & i12) == 0) {
        }
        i16 = 12582912 | i272;
        if ((100663296 & i12) != 0) {
        }
        if ((38347923 & i16) == 38347922) {
        }
        u11.Q0();
        if ((i12 & 1) != 0) {
        }
        if (i24 == 0) {
        }
        if ((i13 & 2) == 0) {
        }
        if (i25 == 0) {
        }
        if ((i13 & 16) != 0) {
        }
        d.a k112 = InterfaceC6250b.a.k();
        InterfaceC7976A b112 = m0.b(u11);
        n11 = u11.n(b112);
        C11 = u11.C();
        if (!n11) {
        }
        C11 = new C9129i(b112);
        u11.x(C11);
        C9129i c9129i42 = (C9129i) C11;
        i18 = i17;
        aVar2 = k112;
        c9915y4 = c9915y3;
        c9129i2 = c9129i42;
        z12 = true;
        eVar3 = eVar5;
        i19 = i16 & (-3670017);
        C5179b.l lVar42 = lVar2;
        u11.j0();
        c3969l = u11;
        x.a(eVar3, i18, c9915y4, true, c9129i2, z12, aVar2, lVar42, null, null, function12, c3969l, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | ((i19 >> 3) & 3670016) | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
        eVar4 = eVar3;
        i21 = i18;
        c9915y5 = c9915y4;
        c9129i3 = c9129i2;
        z13 = z12;
        aVar3 = aVar2;
        lVar3 = lVar42;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(androidx.compose.ui.e eVar, I i11, C9915y c9915y, C5179b.e eVar2, d.b bVar, C9129i c9129i, boolean z11, @NotNull Function1 function1, InterfaceC3967k interfaceC3967k, int i12, int i13) {
        androidx.compose.ui.e eVar3;
        int i14;
        I i15;
        C9915y c9915y2;
        int i16;
        C5179b.e eVar4;
        int i17;
        d.b bVar2;
        int i18;
        boolean z12;
        I i19;
        C9915y c9915y3;
        boolean n11;
        Object C11;
        I i21;
        C9129i c9129i2;
        C5179b.e eVar5;
        d.b bVar3;
        boolean z13;
        androidx.compose.ui.e eVar6;
        int i22;
        C9915y c9915y4;
        C3969l c3969l;
        androidx.compose.ui.e eVar7;
        I i23;
        C9915y c9915y5;
        C9129i c9129i3;
        boolean z14;
        d.b bVar4;
        C5179b.e eVar8;
        J0 m02;
        int i24;
        int i25;
        C3969l u11 = interfaceC3967k.u(-1724297413);
        int i26 = i13 & 1;
        if (i26 != 0) {
            i14 = i12 | 6;
            eVar3 = eVar;
        } else if ((i12 & 6) == 0) {
            eVar3 = eVar;
            i14 = (u11.n(eVar3) ? 4 : 2) | i12;
        } else {
            eVar3 = eVar;
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            if ((i13 & 2) == 0) {
                i15 = i11;
                if (u11.n(i15)) {
                    i25 = 32;
                    i14 |= i25;
                }
            } else {
                i15 = i11;
            }
            i25 = 16;
            i14 |= i25;
        } else {
            i15 = i11;
        }
        int i27 = i13 & 4;
        if (i27 != 0) {
            i14 |= 384;
        } else if ((i12 & 384) == 0) {
            c9915y2 = c9915y;
            i14 |= u11.n(c9915y2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            i16 = i14 | 3072;
            if ((i12 & 24576) != 0) {
                if ((i13 & 16) == 0) {
                    eVar4 = eVar2;
                    if (u11.n(eVar4)) {
                        i24 = 16384;
                        i16 |= i24;
                    }
                } else {
                    eVar4 = eVar2;
                }
                i24 = 8192;
                i16 |= i24;
            } else {
                eVar4 = eVar2;
            }
            i17 = i13 & 32;
            if (i17 == 0) {
                i16 |= 196608;
            } else if ((196608 & i12) == 0) {
                bVar2 = bVar;
                i16 |= u11.n(bVar2) ? 131072 : 65536;
                if ((1572864 & i12) == 0) {
                    i16 |= 524288;
                }
                i18 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i18 != 0) {
                    i16 |= 12582912;
                } else if ((12582912 & i12) == 0) {
                    z12 = z11;
                    i16 |= u11.p(z12) ? 8388608 : 4194304;
                    if ((100663296 & i12) == 0) {
                        i16 |= u11.F(function1) ? 67108864 : 33554432;
                    }
                    if ((38347923 & i16) == 38347922 || !u11.b()) {
                        u11.Q0();
                        if ((i12 & 1) != 0 || u11.w0()) {
                            androidx.compose.ui.e eVar9 = i26 == 0 ? androidx.compose.ui.e.f40358c0 : eVar3;
                            if ((i13 & 2) == 0) {
                                i19 = M.c(0, 0, u11, 3);
                                i16 &= -113;
                            } else {
                                i19 = i15;
                            }
                            if (i27 == 0) {
                                float f7 = 0;
                                c9915y3 = new C9915y(f7, f7, f7, f7);
                            } else {
                                c9915y3 = c9915y2;
                            }
                            if ((i13 & 16) != 0) {
                                i16 &= -57345;
                                eVar4 = C5179b.f();
                            }
                            if (i17 != 0) {
                                bVar2 = InterfaceC6250b.a.l();
                            }
                            InterfaceC7976A b11 = m0.b(u11);
                            n11 = u11.n(b11);
                            C11 = u11.C();
                            if (!n11 || C11 == InterfaceC3967k.a.a()) {
                                C11 = new C9129i(b11);
                                u11.x(C11);
                            }
                            C9129i c9129i4 = (C9129i) C11;
                            int i28 = i16 & (-3670017);
                            if (i18 == 0) {
                                i21 = i19;
                                c9129i2 = c9129i4;
                                c9915y4 = c9915y3;
                                z13 = true;
                                eVar5 = eVar4;
                                bVar3 = bVar2;
                                eVar6 = eVar9;
                                i22 = i28;
                            } else {
                                i21 = i19;
                                c9129i2 = c9129i4;
                                eVar5 = eVar4;
                                bVar3 = bVar2;
                                z13 = z12;
                                eVar6 = eVar9;
                                i22 = i28;
                                c9915y4 = c9915y3;
                            }
                        } else {
                            u11.j();
                            if ((i13 & 2) != 0) {
                                i16 &= -113;
                            }
                            if ((i13 & 16) != 0) {
                                i16 &= -57345;
                            }
                            i22 = i16 & (-3670017);
                            c9129i2 = c9129i;
                            i21 = i15;
                            eVar5 = eVar4;
                            bVar3 = bVar2;
                            z13 = z12;
                            eVar6 = eVar3;
                            c9915y4 = c9915y2;
                        }
                        u11.j0();
                        c3969l = u11;
                        x.a(eVar6, i21, c9915y4, false, c9129i2, z13, null, null, bVar3, eVar5, function1, c3969l, (i22 & 14) | 24576 | (i22 & 112) | (i22 & 896) | (i22 & 7168) | ((i22 >> 3) & 3670016), ((i22 >> 15) & 14) | ((i22 >> 9) & 112) | ((i22 >> 18) & 896), 896);
                        eVar7 = eVar6;
                        i23 = i21;
                        c9915y5 = c9915y4;
                        c9129i3 = c9129i2;
                        z14 = z13;
                        bVar4 = bVar3;
                        eVar8 = eVar5;
                    } else {
                        u11.j();
                        c3969l = u11;
                        eVar7 = eVar3;
                        i23 = i15;
                        c9915y5 = c9915y2;
                        eVar8 = eVar4;
                        bVar4 = bVar2;
                        z14 = z12;
                        c9129i3 = c9129i;
                    }
                    m02 = c3969l.m0();
                    if (m02 == null) {
                        m02.G(new C10163c(eVar7, i23, c9915y5, eVar8, bVar4, c9129i3, z14, function1, i12, i13));
                        return;
                    }
                    return;
                }
                z12 = z11;
                if ((100663296 & i12) == 0) {
                }
                if ((38347923 & i16) == 38347922) {
                }
                u11.Q0();
                if ((i12 & 1) != 0) {
                }
                if (i26 == 0) {
                }
                if ((i13 & 2) == 0) {
                }
                if (i27 == 0) {
                }
                if ((i13 & 16) != 0) {
                }
                if (i17 != 0) {
                }
                InterfaceC7976A b112 = m0.b(u11);
                n11 = u11.n(b112);
                C11 = u11.C();
                if (!n11) {
                }
                C11 = new C9129i(b112);
                u11.x(C11);
                C9129i c9129i42 = (C9129i) C11;
                int i282 = i16 & (-3670017);
                if (i18 == 0) {
                }
                u11.j0();
                c3969l = u11;
                x.a(eVar6, i21, c9915y4, false, c9129i2, z13, null, null, bVar3, eVar5, function1, c3969l, (i22 & 14) | 24576 | (i22 & 112) | (i22 & 896) | (i22 & 7168) | ((i22 >> 3) & 3670016), ((i22 >> 15) & 14) | ((i22 >> 9) & 112) | ((i22 >> 18) & 896), 896);
                eVar7 = eVar6;
                i23 = i21;
                c9915y5 = c9915y4;
                c9129i3 = c9129i2;
                z14 = z13;
                bVar4 = bVar3;
                eVar8 = eVar5;
                m02 = c3969l.m0();
                if (m02 == null) {
                }
            }
            bVar2 = bVar;
            if ((1572864 & i12) == 0) {
            }
            i18 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i18 != 0) {
            }
            z12 = z11;
            if ((100663296 & i12) == 0) {
            }
            if ((38347923 & i16) == 38347922) {
            }
            u11.Q0();
            if ((i12 & 1) != 0) {
            }
            if (i26 == 0) {
            }
            if ((i13 & 2) == 0) {
            }
            if (i27 == 0) {
            }
            if ((i13 & 16) != 0) {
            }
            if (i17 != 0) {
            }
            InterfaceC7976A b1122 = m0.b(u11);
            n11 = u11.n(b1122);
            C11 = u11.C();
            if (!n11) {
            }
            C11 = new C9129i(b1122);
            u11.x(C11);
            C9129i c9129i422 = (C9129i) C11;
            int i2822 = i16 & (-3670017);
            if (i18 == 0) {
            }
            u11.j0();
            c3969l = u11;
            x.a(eVar6, i21, c9915y4, false, c9129i2, z13, null, null, bVar3, eVar5, function1, c3969l, (i22 & 14) | 24576 | (i22 & 112) | (i22 & 896) | (i22 & 7168) | ((i22 >> 3) & 3670016), ((i22 >> 15) & 14) | ((i22 >> 9) & 112) | ((i22 >> 18) & 896), 896);
            eVar7 = eVar6;
            i23 = i21;
            c9915y5 = c9915y4;
            c9129i3 = c9129i2;
            z14 = z13;
            bVar4 = bVar3;
            eVar8 = eVar5;
            m02 = c3969l.m0();
            if (m02 == null) {
            }
        }
        c9915y2 = c9915y;
        i16 = i14 | 3072;
        if ((i12 & 24576) != 0) {
        }
        i17 = i13 & 32;
        if (i17 == 0) {
        }
        bVar2 = bVar;
        if ((1572864 & i12) == 0) {
        }
        i18 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i18 != 0) {
        }
        z12 = z11;
        if ((100663296 & i12) == 0) {
        }
        if ((38347923 & i16) == 38347922) {
        }
        u11.Q0();
        if ((i12 & 1) != 0) {
        }
        if (i26 == 0) {
        }
        if ((i13 & 2) == 0) {
        }
        if (i27 == 0) {
        }
        if ((i13 & 16) != 0) {
        }
        if (i17 != 0) {
        }
        InterfaceC7976A b11222 = m0.b(u11);
        n11 = u11.n(b11222);
        C11 = u11.C();
        if (!n11) {
        }
        C11 = new C9129i(b11222);
        u11.x(C11);
        C9129i c9129i4222 = (C9129i) C11;
        int i28222 = i16 & (-3670017);
        if (i18 == 0) {
        }
        u11.j0();
        c3969l = u11;
        x.a(eVar6, i21, c9915y4, false, c9129i2, z13, null, null, bVar3, eVar5, function1, c3969l, (i22 & 14) | 24576 | (i22 & 112) | (i22 & 896) | (i22 & 7168) | ((i22 >> 3) & 3670016), ((i22 >> 15) & 14) | ((i22 >> 9) & 112) | ((i22 >> 18) & 896), 896);
        eVar7 = eVar6;
        i23 = i21;
        c9915y5 = c9915y4;
        c9129i3 = c9129i2;
        z14 = z13;
        bVar4 = bVar3;
        eVar8 = eVar5;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }
}
