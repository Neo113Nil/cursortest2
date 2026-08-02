package l0;

import D1.InterfaceC2801g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import a1.C4912a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import java.util.ListIterator;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.D0;
import m0.H0;
import org.jetbrains.annotations.NotNull;

/* renamed from: l0.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7770n {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(Object obj, androidx.compose.ui.e eVar, Function1 function1, e1.d dVar, String str, Function1 function12, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        androidx.compose.ui.e eVar2;
        int i14;
        e1.d dVar2;
        int i15;
        String str2;
        androidx.compose.ui.e eVar3;
        e1.d dVar3;
        Function1 function13;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(2132720749);
        if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? u11.n(obj) : u11.F(obj) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i16 = i12 & 2;
        if (i16 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            if ((i11 & 384) == 0) {
                i13 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            i14 = i12 & 8;
            if (i14 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                dVar2 = dVar;
                i13 |= u11.n(dVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                i15 = i13 | 221184;
                if ((1572864 & i11) == 0) {
                    i15 |= u11.F(c4912a) ? 1048576 : 524288;
                }
                if ((599187 & i15) == 599186 || !u11.b()) {
                    androidx.compose.ui.e eVar4 = i16 != 0 ? androidx.compose.ui.e.f40358c0 : eVar2;
                    e1.d o11 = i14 != 0 ? InterfaceC6250b.a.o() : dVar2;
                    C7758b c7758b = C7758b.f72064b;
                    D0 g10 = H0.g(obj, "AnimatedContent", u11, (i15 & 14) | ((i15 >> 9) & 112));
                    int i17 = i15 & 8176;
                    int i18 = i15 >> 3;
                    b(g10, eVar4, function1, o11, c7758b, c4912a, u11, i17 | (57344 & i18) | (i18 & 458752));
                    str2 = "AnimatedContent";
                    eVar3 = eVar4;
                    dVar3 = o11;
                    function13 = c7758b;
                } else {
                    u11.j();
                    function13 = function12;
                    eVar3 = eVar2;
                    dVar3 = dVar2;
                    str2 = str;
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new C7759c(obj, eVar3, function1, dVar3, str2, function13, c4912a, i11, i12));
                    return;
                }
                return;
            }
            dVar2 = dVar;
            i15 = i13 | 221184;
            if ((1572864 & i11) == 0) {
            }
            if ((599187 & i15) == 599186) {
            }
            if (i16 != 0) {
            }
            if (i14 != 0) {
            }
            C7758b c7758b2 = C7758b.f72064b;
            D0 g102 = H0.g(obj, "AnimatedContent", u11, (i15 & 14) | ((i15 >> 9) & 112));
            int i172 = i15 & 8176;
            int i182 = i15 >> 3;
            b(g102, eVar4, function1, o11, c7758b2, c4912a, u11, i172 | (57344 & i182) | (i182 & 458752));
            str2 = "AnimatedContent";
            eVar3 = eVar4;
            dVar3 = o11;
            function13 = c7758b2;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        if ((i11 & 384) == 0) {
        }
        i14 = i12 & 8;
        if (i14 == 0) {
        }
        dVar2 = dVar;
        i15 = i13 | 221184;
        if ((1572864 & i11) == 0) {
        }
        if ((599187 & i15) == 599186) {
        }
        if (i16 != 0) {
        }
        if (i14 != 0) {
        }
        C7758b c7758b22 = C7758b.f72064b;
        D0 g1022 = H0.g(obj, "AnimatedContent", u11, (i15 & 14) | ((i15 >> 9) & 112));
        int i1722 = i15 & 8176;
        int i1822 = i15 >> 3;
        b(g1022, eVar4, function1, o11, c7758b22, c4912a, u11, i1722 | (57344 & i1822) | (i1822 & 458752));
        str2 = "AnimatedContent";
        eVar3 = eVar4;
        dVar3 = o11;
        function13 = c7758b22;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c7, code lost:
    
        if (r14 == S0.InterfaceC3967k.a.a()) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(@NotNull D0 d02, androidx.compose.ui.e eVar, Function1 function1, InterfaceC6250b interfaceC6250b, Function1 function12, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        Object obj;
        int i12;
        D0 d03 = d02;
        boolean z11 = true;
        C3969l u11 = interfaceC3967k.u(-114689412);
        int i13 = (i11 & 6) == 0 ? (u11.n(d03) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i13 |= u11.n(interfaceC6250b) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i13 |= u11.F(function12) ? 16384 : 8192;
        }
        C4912a c4912a2 = c4912a;
        if ((196608 & i11) == 0) {
            i13 |= u11.F(c4912a2) ? 131072 : 65536;
        }
        if ((74899 & i13) == 74898 && u11.b()) {
            u11.j();
        } else {
            int i14 = i13 & 14;
            int i15 = 0;
            boolean z12 = i14 == 4;
            Object C11 = u11.C();
            if (z12 || C11 == InterfaceC3967k.a.a()) {
                C11 = new C7774s(d03, interfaceC6250b);
                u11.x(C11);
            }
            C7774s c7774s = (C7774s) C11;
            boolean z13 = i14 == 4;
            Object C12 = u11.C();
            if (!z13) {
                obj = C12;
            }
            Object[] objArr = {d03.h()};
            c1.u uVar = new c1.u();
            uVar.addAll(C7705l.f0(objArr));
            u11.x(uVar);
            obj = uVar;
            c1.u uVar2 = (c1.u) obj;
            boolean z14 = i14 == 4;
            Object C13 = u11.C();
            if (z14 || C13 == InterfaceC3967k.a.a()) {
                long[] jArr = androidx.collection.W.f38661a;
                C13 = new androidx.collection.L((Object) null);
                u11.x(C13);
            }
            androidx.collection.L l11 = (androidx.collection.L) C13;
            if (!uVar2.contains(d03.h())) {
                uVar2.clear();
                uVar2.add(d03.h());
            }
            if (Intrinsics.d(d03.h(), d03.n())) {
                if (uVar2.size() != 1 || !Intrinsics.d(uVar2.get(0), d03.h())) {
                    uVar2.clear();
                    uVar2.add(d03.h());
                }
                if (l11.f38660e != 1 || l11.a(d03.h())) {
                    l11.c();
                }
                c7774s.g(interfaceC6250b);
            }
            if (Intrinsics.d(d03.h(), d03.n()) || uVar2.contains(d03.n())) {
                i12 = 0;
            } else {
                ListIterator listIterator = uVar2.listIterator();
                int i16 = 0;
                while (true) {
                    boolean z15 = z11;
                    if (!listIterator.hasNext()) {
                        i12 = i15;
                        i16 = -1;
                        break;
                    }
                    i12 = i15;
                    if (Intrinsics.d(function12.invoke(listIterator.next()), function12.invoke(d03.n()))) {
                        break;
                    }
                    i16++;
                    i15 = i12;
                    z11 = z15;
                }
                if (i16 == -1) {
                    uVar2.add(d03.n());
                } else {
                    uVar2.set(i16, d03.n());
                }
            }
            if (l11.a(d03.n()) && l11.a(d03.h())) {
                u11.o(915535767);
                u11.k();
            } else {
                u11.o(912931457);
                l11.c();
                int size = uVar2.size();
                int i17 = i12;
                while (i17 < size) {
                    Object obj2 = uVar2.get(i17);
                    l11.i(obj2, a1.c.c(885640742, new C7767k(d03, obj2, function1, c7774s, uVar2, c4912a2), u11));
                    i17++;
                    d03 = d02;
                    c4912a2 = c4912a;
                }
                u11.k();
            }
            boolean n11 = u11.n(d02.m()) | u11.n(c7774s);
            Object C14 = u11.C();
            if (n11 || C14 == InterfaceC3967k.a.a()) {
                C14 = (N) function1.invoke(c7774s);
                u11.x(C14);
            }
            androidx.compose.ui.e l02 = eVar.l0(c7774s.d((N) C14, u11));
            Object C15 = u11.C();
            if (C15 == InterfaceC3967k.a.a()) {
                C15 = new C7771o(c7774s);
                u11.x(C15);
            }
            C7771o c7771o = (C7771o) C15;
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, l02);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            F1.b(u11, c7771o, InterfaceC2801g.a.e());
            F1.b(u11, d11, InterfaceC2801g.a.g());
            Function2 b11 = InterfaceC2801g.a.b();
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, b11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            u11.o(-1491001814);
            int size2 = uVar2.size();
            for (int i18 = i12; i18 < size2; i18++) {
                Object obj3 = uVar2.get(i18);
                u11.G(1908315325, function12.invoke(obj3));
                Function2 function2 = (Function2) l11.b(obj3);
                if (function2 == null) {
                    u11.o(-971711888);
                } else {
                    u11.o(1908317105);
                    function2.invoke(u11, Integer.valueOf(i12));
                }
                u11.k();
                u11.J();
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C7768l(d02, eVar, function1, interfaceC6250b, function12, c4912a, i11));
        }
    }

    @NotNull
    public static final N c(@NotNull androidx.compose.animation.q qVar, @NotNull androidx.compose.animation.s sVar) {
        return new N(qVar, sVar, 0.0f, new j0(C7769m.f72118b));
    }
}
