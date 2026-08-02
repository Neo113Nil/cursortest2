package l0;

import D1.InterfaceC2801g;
import S0.A0;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import a1.C4912a;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.C8004n;
import m0.D0;
import m0.H0;
import m0.l1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class G {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(@NotNull D0 d02, @NotNull Function1 function1, @NotNull androidx.compose.ui.e eVar, @NotNull androidx.compose.animation.q qVar, @NotNull androidx.compose.animation.s sVar, @NotNull Function2 function2, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-891967166);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(d02) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(eVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(qVar) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.n(sVar) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(function2) ? 131072 : 65536;
        }
        int i13 = i12 | 1572864;
        if ((12582912 & i11) == 0) {
            i13 |= u11.F(c4912a) ? 8388608 : 4194304;
        }
        if ((4793491 & i13) == 4793490 && u11.b()) {
            u11.j();
        } else if (((Boolean) function1.invoke(d02.n())).booleanValue() || ((Boolean) function1.invoke(d02.h())).booleanValue() || d02.p() || d02.i()) {
            u11.o(1787977937);
            int i14 = i13 & 14;
            int i15 = i14 | 48;
            int i16 = i15 & 14;
            boolean z11 = ((i16 ^ 6) > 4 && u11.n(d02)) || (i15 & 6) == 4;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = d02.h();
                u11.x(C11);
            }
            if (d02.p()) {
                C11 = d02.h();
            }
            u11.o(-466616829);
            O f7 = f(d02, function1, C11, u11);
            u11.k();
            Object n11 = d02.n();
            u11.o(-466616829);
            O f11 = f(d02, function1, n11, u11);
            u11.k();
            D0 b11 = H0.b(d02, f7, f11, u11, i16 | 3072);
            InterfaceC3978p0 l11 = n1.l(function2, u11);
            Object invoke = function2.invoke(b11.h(), b11.n());
            boolean n12 = u11.n(b11) | u11.n(l11);
            Object C12 = u11.C();
            if (n12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new C7777v(b11, l11, null);
                u11.x(C12);
            }
            InterfaceC3978p0 i17 = n1.i(u11, invoke, (Function2) C12);
            Object h11 = b11.h();
            O o11 = O.PostExit;
            if (h11 == o11 && b11.n() == o11 && ((Boolean) i17.getValue()).booleanValue()) {
                u11.o(1790256282);
                u11.k();
            } else {
                u11.o(1788869559);
                boolean z12 = i14 == 4;
                Object C13 = u11.C();
                if (z12 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new I();
                    u11.x(C13);
                }
                I i18 = (I) C13;
                int i19 = i13 >> 6;
                androidx.compose.ui.e d11 = androidx.compose.animation.b.d(b11, qVar, sVar, u11, (i19 & 896) | (i19 & 112) | 24576);
                u11.o(1581766416);
                u11.k();
                androidx.compose.ui.e l02 = eVar.l0(d11.l0(androidx.compose.ui.e.f40358c0));
                Object C14 = u11.C();
                if (C14 == InterfaceC3967k.a.a()) {
                    C14 = new C7775t(i18);
                    u11.x(C14);
                }
                C7775t c7775t = (C7775t) C14;
                int I11 = u11.I();
                A0 d12 = u11.d();
                androidx.compose.ui.e f12 = androidx.compose.ui.c.f(u11, l02);
                Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.H(a11);
                } else {
                    u11.e();
                }
                F1.b(u11, c7775t, InterfaceC2801g.a.e());
                F1.b(u11, d12, InterfaceC2801g.a.g());
                Function2 b12 = InterfaceC2801g.a.b();
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    Ep.a.d(I11, u11, I11, b12);
                }
                F1.b(u11, f12, InterfaceC2801g.a.f());
                c4912a.invoke(i18, u11, Integer.valueOf((i13 >> 18) & 112));
                u11.f();
                u11.k();
            }
            u11.k();
        } else {
            u11.o(1790262234);
            u11.k();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C7776u(d02, function1, eVar, qVar, sVar, function2, c4912a, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(boolean z11, e.a aVar, androidx.compose.animation.q qVar, androidx.compose.animation.s sVar, String str, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e.a aVar2;
        int i13;
        androidx.compose.animation.q qVar2;
        int i14;
        androidx.compose.animation.s sVar2;
        int i15;
        String str2;
        e.a aVar3;
        androidx.compose.animation.q qVar3;
        androidx.compose.animation.s sVar3;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(1766503102);
        int i16 = (u11.p(z11) ? 32 : 16) | i11;
        int i17 = i12 & 2;
        if (i17 != 0) {
            i16 |= 384;
        } else if ((i11 & 384) == 0) {
            aVar2 = aVar;
            i16 |= u11.n(aVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            i13 = i12 & 4;
            if (i13 == 0) {
                i16 |= 3072;
            } else if ((i11 & 3072) == 0) {
                qVar2 = qVar;
                i16 |= u11.n(qVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                i14 = i12 & 8;
                if (i14 != 0) {
                    i16 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    sVar2 = sVar;
                    i16 |= u11.n(sVar2) ? 16384 : 8192;
                    i15 = i16 | 196608;
                    if ((599185 & i15) == 599184 || !u11.b()) {
                        e.a aVar4 = i17 == 0 ? androidx.compose.ui.e.f40358c0 : aVar2;
                        androidx.compose.animation.q c11 = i13 == 0 ? androidx.compose.animation.b.h(null, 3).c(androidx.compose.animation.b.g(null, 15)) : qVar2;
                        androidx.compose.animation.s c12 = i14 == 0 ? androidx.compose.animation.b.i(null, 3).c(androidx.compose.animation.b.n(null, 15)) : sVar2;
                        str2 = "AnimatedVisibility";
                        androidx.compose.animation.q qVar4 = c11;
                        e(H0.g(Boolean.valueOf(z11), "AnimatedVisibility", u11, ((i15 >> 3) & 14) | 48), C7756A.f72001b, aVar4, qVar4, c12, c4912a, u11, (i15 & 57344) | (i15 & 896) | 48 | (i15 & 7168) | 196608);
                        aVar3 = aVar4;
                        qVar3 = qVar4;
                        sVar3 = c12;
                    } else {
                        u11.j();
                        aVar3 = aVar2;
                        qVar3 = qVar2;
                        sVar3 = sVar2;
                        str2 = str;
                    }
                    m02 = u11.m0();
                    if (m02 == null) {
                        m02.G(new B(z11, aVar3, qVar3, sVar3, str2, c4912a, i11, i12));
                        return;
                    }
                    return;
                }
                sVar2 = sVar;
                i15 = i16 | 196608;
                if ((599185 & i15) == 599184) {
                }
                if (i17 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                str2 = "AnimatedVisibility";
                androidx.compose.animation.q qVar42 = c11;
                e(H0.g(Boolean.valueOf(z11), "AnimatedVisibility", u11, ((i15 >> 3) & 14) | 48), C7756A.f72001b, aVar4, qVar42, c12, c4912a, u11, (i15 & 57344) | (i15 & 896) | 48 | (i15 & 7168) | 196608);
                aVar3 = aVar4;
                qVar3 = qVar42;
                sVar3 = c12;
                m02 = u11.m0();
                if (m02 == null) {
                }
            }
            qVar2 = qVar;
            i14 = i12 & 8;
            if (i14 != 0) {
            }
            sVar2 = sVar;
            i15 = i16 | 196608;
            if ((599185 & i15) == 599184) {
            }
            if (i17 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            str2 = "AnimatedVisibility";
            androidx.compose.animation.q qVar422 = c11;
            e(H0.g(Boolean.valueOf(z11), "AnimatedVisibility", u11, ((i15 >> 3) & 14) | 48), C7756A.f72001b, aVar4, qVar422, c12, c4912a, u11, (i15 & 57344) | (i15 & 896) | 48 | (i15 & 7168) | 196608);
            aVar3 = aVar4;
            qVar3 = qVar422;
            sVar3 = c12;
            m02 = u11.m0();
            if (m02 == null) {
            }
        }
        aVar2 = aVar;
        i13 = i12 & 4;
        if (i13 == 0) {
        }
        qVar2 = qVar;
        i14 = i12 & 8;
        if (i14 != 0) {
        }
        sVar2 = sVar;
        i15 = i16 | 196608;
        if ((599185 & i15) == 599184) {
        }
        if (i17 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        str2 = "AnimatedVisibility";
        androidx.compose.animation.q qVar4222 = c11;
        e(H0.g(Boolean.valueOf(z11), "AnimatedVisibility", u11, ((i15 >> 3) & 14) | 48), C7756A.f72001b, aVar4, qVar4222, c12, c4912a, u11, (i15 & 57344) | (i15 & 896) | 48 | (i15 & 7168) | 196608);
        aVar3 = aVar4;
        qVar3 = qVar4222;
        sVar3 = c12;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(boolean z11, androidx.compose.ui.e eVar, androidx.compose.animation.q qVar, androidx.compose.animation.s sVar, String str, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        boolean z12;
        int i13;
        androidx.compose.ui.e eVar2;
        int i14;
        androidx.compose.animation.q qVar2;
        int i15;
        androidx.compose.animation.s sVar2;
        int i16;
        androidx.compose.animation.q qVar3;
        androidx.compose.animation.s sVar3;
        String str2;
        androidx.compose.ui.e eVar3;
        androidx.compose.animation.q qVar4;
        androidx.compose.animation.s sVar4;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(2088733774);
        if ((i11 & 6) == 0) {
            z12 = z11;
            i13 = (u11.p(z12) ? 4 : 2) | i11;
        } else {
            z12 = z11;
            i13 = i11;
        }
        int i17 = i12 & 2;
        if (i17 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                qVar2 = qVar;
                i13 |= u11.n(qVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                i15 = i12 & 8;
                if (i15 != 0) {
                    i13 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    sVar2 = sVar;
                    i13 |= u11.n(sVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    i16 = i13 | 24576;
                    if ((196608 & i11) == 0) {
                        i16 |= u11.F(c4912a) ? 131072 : 65536;
                    }
                    if ((74899 & i16) == 74898 || !u11.b()) {
                        androidx.compose.ui.e eVar4 = i17 == 0 ? androidx.compose.ui.e.f40358c0 : eVar2;
                        if (i14 == 0) {
                            androidx.compose.animation.q h11 = androidx.compose.animation.b.h(null, 3);
                            int i18 = l1.f73821b;
                            qVar3 = h11.c(androidx.compose.animation.b.f(InterfaceC6250b.a.c(), Y.f72057b, C8004n.c(400.0f, Z1.q.a(Z1.r.a(1, 1)), 1)));
                        } else {
                            qVar3 = qVar2;
                        }
                        if (i15 == 0) {
                            int i19 = androidx.compose.animation.b.f38768e;
                            int i21 = l1.f73821b;
                            sVar3 = androidx.compose.animation.b.m(InterfaceC6250b.a.c(), Z.f72058b, C8004n.c(400.0f, Z1.q.a(Z1.r.a(1, 1)), 1)).c(androidx.compose.animation.b.i(null, 3));
                        } else {
                            sVar3 = sVar2;
                        }
                        int i22 = i16 << 3;
                        androidx.compose.animation.q qVar5 = qVar3;
                        e(H0.g(Boolean.valueOf(z12), "AnimatedVisibility", u11, (i16 & 14) | ((i16 >> 9) & 112)), C7778w.f72165b, eVar4, qVar5, sVar3, c4912a, u11, (i22 & 57344) | (i22 & 896) | 48 | (i22 & 7168) | (458752 & i16));
                        str2 = "AnimatedVisibility";
                        eVar3 = eVar4;
                        qVar4 = qVar5;
                        sVar4 = sVar3;
                    } else {
                        u11.j();
                        eVar3 = eVar2;
                        qVar4 = qVar2;
                        sVar4 = sVar2;
                        str2 = str;
                    }
                    m02 = u11.m0();
                    if (m02 == null) {
                        m02.G(new C7779x(z11, eVar3, qVar4, sVar4, str2, c4912a, i11, i12));
                        return;
                    }
                    return;
                }
                sVar2 = sVar;
                i16 = i13 | 24576;
                if ((196608 & i11) == 0) {
                }
                if ((74899 & i16) == 74898) {
                }
                if (i17 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                int i222 = i16 << 3;
                androidx.compose.animation.q qVar52 = qVar3;
                e(H0.g(Boolean.valueOf(z12), "AnimatedVisibility", u11, (i16 & 14) | ((i16 >> 9) & 112)), C7778w.f72165b, eVar4, qVar52, sVar3, c4912a, u11, (i222 & 57344) | (i222 & 896) | 48 | (i222 & 7168) | (458752 & i16));
                str2 = "AnimatedVisibility";
                eVar3 = eVar4;
                qVar4 = qVar52;
                sVar4 = sVar3;
                m02 = u11.m0();
                if (m02 == null) {
                }
            }
            qVar2 = qVar;
            i15 = i12 & 8;
            if (i15 != 0) {
            }
            sVar2 = sVar;
            i16 = i13 | 24576;
            if ((196608 & i11) == 0) {
            }
            if ((74899 & i16) == 74898) {
            }
            if (i17 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            int i2222 = i16 << 3;
            androidx.compose.animation.q qVar522 = qVar3;
            e(H0.g(Boolean.valueOf(z12), "AnimatedVisibility", u11, (i16 & 14) | ((i16 >> 9) & 112)), C7778w.f72165b, eVar4, qVar522, sVar3, c4912a, u11, (i2222 & 57344) | (i2222 & 896) | 48 | (i2222 & 7168) | (458752 & i16));
            str2 = "AnimatedVisibility";
            eVar3 = eVar4;
            qVar4 = qVar522;
            sVar4 = sVar3;
            m02 = u11.m0();
            if (m02 == null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        qVar2 = qVar;
        i15 = i12 & 8;
        if (i15 != 0) {
        }
        sVar2 = sVar;
        i16 = i13 | 24576;
        if ((196608 & i11) == 0) {
        }
        if ((74899 & i16) == 74898) {
        }
        if (i17 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        int i22222 = i16 << 3;
        androidx.compose.animation.q qVar5222 = qVar3;
        e(H0.g(Boolean.valueOf(z12), "AnimatedVisibility", u11, (i16 & 14) | ((i16 >> 9) & 112)), C7778w.f72165b, eVar4, qVar5222, sVar3, c4912a, u11, (i22222 & 57344) | (i22222 & 896) | 48 | (i22222 & 7168) | (458752 & i16));
        str2 = "AnimatedVisibility";
        eVar3 = eVar4;
        qVar4 = qVar5222;
        sVar4 = sVar3;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(boolean z11, androidx.compose.ui.e eVar, androidx.compose.animation.q qVar, androidx.compose.animation.s sVar, String str, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        androidx.compose.ui.e eVar2;
        int i13;
        androidx.compose.animation.q qVar2;
        int i14;
        androidx.compose.animation.s sVar2;
        int i15;
        String str2;
        androidx.compose.ui.e eVar3;
        androidx.compose.animation.q qVar3;
        androidx.compose.animation.s sVar3;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-1741346906);
        int i16 = (u11.p(z11) ? 32 : 16) | i11;
        int i17 = i12 & 2;
        if (i17 != 0) {
            i13 = i16 | 384;
            eVar2 = eVar;
        } else {
            eVar2 = eVar;
            i13 = i16 | (u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN);
        }
        int i18 = i12 & 4;
        if (i18 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            qVar2 = qVar;
            i13 |= u11.n(qVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            i14 = i12 & 8;
            if (i14 == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                sVar2 = sVar;
                i13 |= u11.n(sVar2) ? 16384 : 8192;
                i15 = i13 | 196608;
                if ((599185 & i15) == 599184 || !u11.b()) {
                    androidx.compose.ui.e eVar4 = i17 != 0 ? androidx.compose.ui.e.f40358c0 : eVar2;
                    androidx.compose.animation.q c11 = i18 != 0 ? androidx.compose.animation.b.h(null, 3).c(androidx.compose.animation.b.e()) : qVar2;
                    androidx.compose.animation.s c12 = i14 != 0 ? androidx.compose.animation.b.i(null, 3).c(androidx.compose.animation.b.l()) : sVar2;
                    e(H0.g(Boolean.valueOf(z11), "AnimatedVisibility", u11, ((i15 >> 3) & 14) | 48), C7780y.f72174b, eVar4, c11, c12, c4912a, u11, (i15 & 57344) | (i15 & 896) | 48 | (i15 & 7168) | 196608);
                    str2 = "AnimatedVisibility";
                    eVar3 = eVar4;
                    qVar3 = c11;
                    sVar3 = c12;
                } else {
                    u11.j();
                    eVar3 = eVar2;
                    qVar3 = qVar2;
                    sVar3 = sVar2;
                    str2 = str;
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new C7781z(z11, eVar3, qVar3, sVar3, str2, c4912a, i11, i12));
                    return;
                }
                return;
            }
            sVar2 = sVar;
            i15 = i13 | 196608;
            if ((599185 & i15) == 599184) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i14 != 0) {
            }
            e(H0.g(Boolean.valueOf(z11), "AnimatedVisibility", u11, ((i15 >> 3) & 14) | 48), C7780y.f72174b, eVar4, c11, c12, c4912a, u11, (i15 & 57344) | (i15 & 896) | 48 | (i15 & 7168) | 196608);
            str2 = "AnimatedVisibility";
            eVar3 = eVar4;
            qVar3 = c11;
            sVar3 = c12;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        qVar2 = qVar;
        i14 = i12 & 8;
        if (i14 == 0) {
        }
        sVar2 = sVar;
        i15 = i13 | 196608;
        if ((599185 & i15) == 599184) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i14 != 0) {
        }
        e(H0.g(Boolean.valueOf(z11), "AnimatedVisibility", u11, ((i15 >> 3) & 14) | 48), C7780y.f72174b, eVar4, c11, c12, c4912a, u11, (i15 & 57344) | (i15 & 896) | 48 | (i15 & 7168) | 196608);
        str2 = "AnimatedVisibility";
        eVar3 = eVar4;
        qVar3 = c11;
        sVar3 = c12;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    public static final void e(@NotNull D0 d02, @NotNull Function1 function1, @NotNull androidx.compose.ui.e eVar, @NotNull androidx.compose.animation.q qVar, @NotNull androidx.compose.animation.s sVar, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        androidx.compose.animation.q qVar2;
        androidx.compose.animation.s sVar2;
        C4912a c4912a2;
        C3969l u11 = interfaceC3967k.u(429978603);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(d02) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(eVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            qVar2 = qVar;
            i12 |= u11.n(qVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        } else {
            qVar2 = qVar;
        }
        if ((i11 & 24576) == 0) {
            sVar2 = sVar;
            i12 |= u11.n(sVar2) ? 16384 : 8192;
        } else {
            sVar2 = sVar;
        }
        if ((i11 & 196608) == 0) {
            c4912a2 = c4912a;
            i12 |= u11.F(c4912a2) ? 131072 : 65536;
        } else {
            c4912a2 = c4912a;
        }
        if ((74899 & i12) == 74898 && u11.b()) {
            u11.j();
        } else {
            int i13 = i12 & 112;
            int i14 = i12 & 14;
            boolean z11 = (i13 == 32) | (i14 == 4);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new D(function1, d02);
                u11.x(C11);
            }
            a(d02, function1, androidx.compose.ui.layout.b.a((InterfaceC6511n) C11, eVar), qVar2, sVar2, E.f72013b, c4912a2, u11, i14 | 196608 | i13 | (i12 & 7168) | (57344 & i12) | ((i12 << 6) & 29360128));
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new F(d02, function1, eVar, qVar, sVar, c4912a, i11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final O f(D0 d02, Function1 function1, Object obj, InterfaceC3967k interfaceC3967k) {
        O o11;
        interfaceC3967k.G(-902048200, d02);
        if (d02.p()) {
            interfaceC3967k.o(2101296683);
            interfaceC3967k.k();
            o11 = ((Boolean) function1.invoke(obj)).booleanValue() ? O.Visible : ((Boolean) function1.invoke(d02.h())).booleanValue() ? O.PostExit : O.PreEnter;
        } else {
            interfaceC3967k.o(2101530516);
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(Boolean.FALSE, D1.f25195a);
                interfaceC3967k.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            if (((Boolean) function1.invoke(d02.h())).booleanValue()) {
                interfaceC3978p0.setValue(Boolean.TRUE);
            }
            o11 = ((Boolean) function1.invoke(obj)).booleanValue() ? O.Visible : ((Boolean) interfaceC3978p0.getValue()).booleanValue() ? O.PostExit : O.PreEnter;
            interfaceC3967k.k();
        }
        interfaceC3967k.J();
        return o11;
    }
}
