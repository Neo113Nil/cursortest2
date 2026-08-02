package n0;

import B1.InterfaceC2547p;
import D1.InterfaceC2801g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7809a0;
import l1.InterfaceC7829k0;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import q1.C8971a;

/* renamed from: n0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8366G {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(@NotNull AbstractC8972b abstractC8972b, String str, androidx.compose.ui.e eVar, e1.d dVar, InterfaceC2547p interfaceC2547p, float f7, C7809a0 c7809a0, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        androidx.compose.ui.e eVar2;
        int i14;
        e1.d dVar2;
        int i15;
        InterfaceC2547p interfaceC2547p2;
        int i16;
        float f11;
        int i17;
        C7809a0 c7809a02;
        androidx.compose.ui.e eVar3;
        int I11;
        androidx.compose.ui.e eVar4;
        e1.d dVar3;
        InterfaceC2547p interfaceC2547p3;
        C7809a0 c7809a03;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(1142754848);
        if ((i11 & 6) == 0) {
            i13 = (u11.F(abstractC8972b) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= u11.n(str) ? 32 : 16;
        }
        int i18 = i12 & 4;
        if (i18 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            i14 = i12 & 8;
            if (i14 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                dVar2 = dVar;
                i13 |= u11.n(dVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                i15 = i12 & 16;
                if (i15 != 0) {
                    i13 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    interfaceC2547p2 = interfaceC2547p;
                    i13 |= u11.n(interfaceC2547p2) ? 16384 : 8192;
                    i16 = i12 & 32;
                    if (i16 == 0) {
                        i13 |= 196608;
                    } else if ((196608 & i11) == 0) {
                        f11 = f7;
                        i13 |= u11.q(f11) ? 131072 : 65536;
                        i17 = i12 & 64;
                        if (i17 != 0) {
                            i13 |= 1572864;
                        } else if ((1572864 & i11) == 0) {
                            c7809a02 = c7809a0;
                            i13 |= u11.n(c7809a02) ? 1048576 : 524288;
                            int i19 = i13;
                            if ((i13 & 599187) == 599186 || !u11.b()) {
                                androidx.compose.ui.e eVar5 = i18 == 0 ? androidx.compose.ui.e.f40358c0 : eVar2;
                                if (i14 != 0) {
                                    dVar2 = InterfaceC6250b.a.e();
                                }
                                if (i15 != 0) {
                                    interfaceC2547p2 = InterfaceC2547p.a.d();
                                }
                                if (i16 != 0) {
                                    f11 = 1.0f;
                                }
                                C7809a0 c7809a04 = i17 == 0 ? null : c7809a02;
                                if (str == null) {
                                    u11.o(1040258775);
                                    e.a aVar = androidx.compose.ui.e.f40358c0;
                                    boolean z11 = (i19 & 112) == 32;
                                    Object C11 = u11.C();
                                    if (z11 || C11 == InterfaceC3967k.a.a()) {
                                        C11 = new C8365F(str);
                                        u11.x(C11);
                                    }
                                    eVar3 = I1.o.c(aVar, false, (Function1) C11);
                                    u11.k();
                                } else {
                                    u11.o(1040398089);
                                    u11.k();
                                    eVar3 = androidx.compose.ui.e.f40358c0;
                                }
                                InterfaceC2547p interfaceC2547p4 = interfaceC2547p2;
                                e1.d dVar4 = dVar2;
                                androidx.compose.ui.e a11 = androidx.compose.ui.draw.e.a(C6988h.b(eVar5.l0(eVar3)), abstractC8972b, dVar4, interfaceC2547p4, f11, c7809a04, 2);
                                C8363D c8363d = C8363D.f76060a;
                                I11 = u11.I();
                                androidx.compose.ui.e f12 = androidx.compose.ui.c.f(u11, a11);
                                A0 d11 = u11.d();
                                Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                                if (u11.t()) {
                                    u11.e();
                                } else {
                                    u11.H(a12);
                                }
                                F1.b(u11, c8363d, InterfaceC2801g.a.e());
                                F1.b(u11, d11, InterfaceC2801g.a.g());
                                F1.b(u11, f12, InterfaceC2801g.a.f());
                                Function2 b11 = InterfaceC2801g.a.b();
                                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                                    Ep.a.d(I11, u11, I11, b11);
                                }
                                u11.f();
                                eVar4 = eVar5;
                                dVar3 = dVar4;
                                interfaceC2547p3 = interfaceC2547p4;
                                c7809a03 = c7809a04;
                            } else {
                                u11.j();
                                eVar4 = eVar2;
                                dVar3 = dVar2;
                                interfaceC2547p3 = interfaceC2547p2;
                                c7809a03 = c7809a02;
                            }
                            float f13 = f11;
                            m02 = u11.m0();
                            if (m02 == null) {
                                m02.G(new C8364E(abstractC8972b, str, eVar4, dVar3, interfaceC2547p3, f13, c7809a03, i11, i12));
                                return;
                            }
                            return;
                        }
                        c7809a02 = c7809a0;
                        int i192 = i13;
                        if ((i13 & 599187) == 599186) {
                        }
                        if (i18 == 0) {
                        }
                        if (i14 != 0) {
                        }
                        if (i15 != 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (str == null) {
                        }
                        InterfaceC2547p interfaceC2547p42 = interfaceC2547p2;
                        e1.d dVar42 = dVar2;
                        androidx.compose.ui.e a112 = androidx.compose.ui.draw.e.a(C6988h.b(eVar5.l0(eVar3)), abstractC8972b, dVar42, interfaceC2547p42, f11, c7809a04, 2);
                        C8363D c8363d2 = C8363D.f76060a;
                        I11 = u11.I();
                        androidx.compose.ui.e f122 = androidx.compose.ui.c.f(u11, a112);
                        A0 d112 = u11.d();
                        Function0 a122 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                        }
                        F1.b(u11, c8363d2, InterfaceC2801g.a.e());
                        F1.b(u11, d112, InterfaceC2801g.a.g());
                        F1.b(u11, f122, InterfaceC2801g.a.f());
                        Function2 b112 = InterfaceC2801g.a.b();
                        if (!u11.t()) {
                        }
                        Ep.a.d(I11, u11, I11, b112);
                        u11.f();
                        eVar4 = eVar5;
                        dVar3 = dVar42;
                        interfaceC2547p3 = interfaceC2547p42;
                        c7809a03 = c7809a04;
                        float f132 = f11;
                        m02 = u11.m0();
                        if (m02 == null) {
                        }
                    }
                    f11 = f7;
                    i17 = i12 & 64;
                    if (i17 != 0) {
                    }
                    c7809a02 = c7809a0;
                    int i1922 = i13;
                    if ((i13 & 599187) == 599186) {
                    }
                    if (i18 == 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (str == null) {
                    }
                    InterfaceC2547p interfaceC2547p422 = interfaceC2547p2;
                    e1.d dVar422 = dVar2;
                    androidx.compose.ui.e a1122 = androidx.compose.ui.draw.e.a(C6988h.b(eVar5.l0(eVar3)), abstractC8972b, dVar422, interfaceC2547p422, f11, c7809a04, 2);
                    C8363D c8363d22 = C8363D.f76060a;
                    I11 = u11.I();
                    androidx.compose.ui.e f1222 = androidx.compose.ui.c.f(u11, a1122);
                    A0 d1122 = u11.d();
                    Function0 a1222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                    }
                    F1.b(u11, c8363d22, InterfaceC2801g.a.e());
                    F1.b(u11, d1122, InterfaceC2801g.a.g());
                    F1.b(u11, f1222, InterfaceC2801g.a.f());
                    Function2 b1122 = InterfaceC2801g.a.b();
                    if (!u11.t()) {
                    }
                    Ep.a.d(I11, u11, I11, b1122);
                    u11.f();
                    eVar4 = eVar5;
                    dVar3 = dVar422;
                    interfaceC2547p3 = interfaceC2547p422;
                    c7809a03 = c7809a04;
                    float f1322 = f11;
                    m02 = u11.m0();
                    if (m02 == null) {
                    }
                }
                interfaceC2547p2 = interfaceC2547p;
                i16 = i12 & 32;
                if (i16 == 0) {
                }
                f11 = f7;
                i17 = i12 & 64;
                if (i17 != 0) {
                }
                c7809a02 = c7809a0;
                int i19222 = i13;
                if ((i13 & 599187) == 599186) {
                }
                if (i18 == 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 == 0) {
                }
                if (str == null) {
                }
                InterfaceC2547p interfaceC2547p4222 = interfaceC2547p2;
                e1.d dVar4222 = dVar2;
                androidx.compose.ui.e a11222 = androidx.compose.ui.draw.e.a(C6988h.b(eVar5.l0(eVar3)), abstractC8972b, dVar4222, interfaceC2547p4222, f11, c7809a04, 2);
                C8363D c8363d222 = C8363D.f76060a;
                I11 = u11.I();
                androidx.compose.ui.e f12222 = androidx.compose.ui.c.f(u11, a11222);
                A0 d11222 = u11.d();
                Function0 a12222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                F1.b(u11, c8363d222, InterfaceC2801g.a.e());
                F1.b(u11, d11222, InterfaceC2801g.a.g());
                F1.b(u11, f12222, InterfaceC2801g.a.f());
                Function2 b11222 = InterfaceC2801g.a.b();
                if (!u11.t()) {
                }
                Ep.a.d(I11, u11, I11, b11222);
                u11.f();
                eVar4 = eVar5;
                dVar3 = dVar4222;
                interfaceC2547p3 = interfaceC2547p4222;
                c7809a03 = c7809a04;
                float f13222 = f11;
                m02 = u11.m0();
                if (m02 == null) {
                }
            }
            dVar2 = dVar;
            i15 = i12 & 16;
            if (i15 != 0) {
            }
            interfaceC2547p2 = interfaceC2547p;
            i16 = i12 & 32;
            if (i16 == 0) {
            }
            f11 = f7;
            i17 = i12 & 64;
            if (i17 != 0) {
            }
            c7809a02 = c7809a0;
            int i192222 = i13;
            if ((i13 & 599187) == 599186) {
            }
            if (i18 == 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 == 0) {
            }
            if (str == null) {
            }
            InterfaceC2547p interfaceC2547p42222 = interfaceC2547p2;
            e1.d dVar42222 = dVar2;
            androidx.compose.ui.e a112222 = androidx.compose.ui.draw.e.a(C6988h.b(eVar5.l0(eVar3)), abstractC8972b, dVar42222, interfaceC2547p42222, f11, c7809a04, 2);
            C8363D c8363d2222 = C8363D.f76060a;
            I11 = u11.I();
            androidx.compose.ui.e f122222 = androidx.compose.ui.c.f(u11, a112222);
            A0 d112222 = u11.d();
            Function0 a122222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            F1.b(u11, c8363d2222, InterfaceC2801g.a.e());
            F1.b(u11, d112222, InterfaceC2801g.a.g());
            F1.b(u11, f122222, InterfaceC2801g.a.f());
            Function2 b112222 = InterfaceC2801g.a.b();
            if (!u11.t()) {
            }
            Ep.a.d(I11, u11, I11, b112222);
            u11.f();
            eVar4 = eVar5;
            dVar3 = dVar42222;
            interfaceC2547p3 = interfaceC2547p42222;
            c7809a03 = c7809a04;
            float f132222 = f11;
            m02 = u11.m0();
            if (m02 == null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 8;
        if (i14 == 0) {
        }
        dVar2 = dVar;
        i15 = i12 & 16;
        if (i15 != 0) {
        }
        interfaceC2547p2 = interfaceC2547p;
        i16 = i12 & 32;
        if (i16 == 0) {
        }
        f11 = f7;
        i17 = i12 & 64;
        if (i17 != 0) {
        }
        c7809a02 = c7809a0;
        int i1922222 = i13;
        if ((i13 & 599187) == 599186) {
        }
        if (i18 == 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 == 0) {
        }
        if (str == null) {
        }
        InterfaceC2547p interfaceC2547p422222 = interfaceC2547p2;
        e1.d dVar422222 = dVar2;
        androidx.compose.ui.e a1122222 = androidx.compose.ui.draw.e.a(C6988h.b(eVar5.l0(eVar3)), abstractC8972b, dVar422222, interfaceC2547p422222, f11, c7809a04, 2);
        C8363D c8363d22222 = C8363D.f76060a;
        I11 = u11.I();
        androidx.compose.ui.e f1222222 = androidx.compose.ui.c.f(u11, a1122222);
        A0 d1122222 = u11.d();
        Function0 a1222222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        F1.b(u11, c8363d22222, InterfaceC2801g.a.e());
        F1.b(u11, d1122222, InterfaceC2801g.a.g());
        F1.b(u11, f1222222, InterfaceC2801g.a.f());
        Function2 b1122222 = InterfaceC2801g.a.b();
        if (!u11.t()) {
        }
        Ep.a.d(I11, u11, I11, b1122222);
        u11.f();
        eVar4 = eVar5;
        dVar3 = dVar422222;
        interfaceC2547p3 = interfaceC2547p422222;
        c7809a03 = c7809a04;
        float f1322222 = f11;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    public static final void b(@NotNull InterfaceC7829k0 interfaceC7829k0, androidx.compose.ui.e eVar, InterfaceC2547p.a.b bVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e1.d e11 = InterfaceC6250b.a.e();
        InterfaceC2547p interfaceC2547p = bVar;
        if ((i12 & 16) != 0) {
            interfaceC2547p = InterfaceC2547p.a.d();
        }
        InterfaceC2547p interfaceC2547p2 = interfaceC2547p;
        boolean n11 = interfaceC3967k.n(interfaceC7829k0);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = C8971a.a(interfaceC7829k0, 1);
            interfaceC3967k.x(C11);
        }
        a((BitmapPainter) C11, null, eVar, e11, interfaceC2547p2, 1.0f, null, interfaceC3967k, i11 & 4194288, 0);
    }
}
