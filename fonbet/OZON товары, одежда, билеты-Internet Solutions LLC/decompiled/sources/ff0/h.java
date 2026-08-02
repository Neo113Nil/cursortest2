package ff0;

import B4.L;
import B4.M;
import B4.P;
import B4.b0;
import B4.d0;
import D4.C2848x;
import S0.C3969l;
import S0.C3996z;
import S0.H0;
import S0.InterfaceC3967k;
import S0.J0;
import S0.Q;
import e1.InterfaceC6250b;
import jf0.AbstractC7421a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lf0.C7951b;
import mf0.C8140b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(@NotNull AbstractC7421a start, androidx.compose.ui.e eVar, e1.d dVar, P p11, C8140b c8140b, C7951b c7951b, @NotNull Function1 builder, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        androidx.compose.ui.e eVar2;
        int i13;
        C8140b c8140b2;
        int i14;
        int i15;
        androidx.compose.ui.e eVar3;
        e1.d e11;
        P b11;
        Object C11;
        C7951b c7951b2;
        int i16;
        boolean n11;
        Object C12;
        boolean F11;
        Object C13;
        C7951b c7951b3;
        C8140b c8140b3;
        J0 m02;
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(builder, "builder");
        C3969l u11 = interfaceC3967k.u(-1681081329);
        int i17 = i12 & 2;
        if (i17 != 0) {
            i13 = i11 | 48;
            eVar2 = eVar;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 = i11 | (u11.n(eVar2) ? 32 : 16);
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        int i18 = i13 | 1408;
        if ((i12 & 16) == 0) {
            c8140b2 = c8140b;
            if (u11.F(c8140b2)) {
                i14 = 16384;
                i15 = i18 | i14 | 65536;
                if ((i11 & 1572864) == 0) {
                    i15 |= u11.F(builder) ? 1048576 : 524288;
                }
                if ((599187 & i15) == 599186 || !u11.b()) {
                    u11.Q0();
                    if ((i11 & 1) != 0 || u11.w0()) {
                        eVar3 = i17 == 0 ? androidx.compose.ui.e.f40358c0 : eVar2;
                        e11 = InterfaceC6250b.a.e();
                        b11 = C2848x.b(new b0[0], u11);
                        int i19 = i15 & (-7169);
                        if ((i12 & 16) != 0) {
                            u11.B(-900586300);
                            Object C14 = u11.C();
                            if (C14 == InterfaceC3967k.a.a()) {
                                C14 = new C8140b();
                                u11.x(C14);
                            }
                            c8140b2 = (C8140b) C14;
                            u11.K();
                            i19 = i15 & (-64513);
                        }
                        u11.B(-900583997);
                        C11 = u11.C();
                        if (C11 == InterfaceC3967k.a.a()) {
                            C11 = new C7951b(c8140b2, b11);
                            u11.x(C11);
                        }
                        c7951b2 = (C7951b) C11;
                        u11.K();
                        i16 = i19 & (-458753);
                    } else {
                        u11.j();
                        int i21 = i15 & (-7169);
                        if ((i12 & 16) != 0) {
                            i21 = i15 & (-64513);
                        }
                        b11 = p11;
                        c7951b2 = c7951b;
                        i16 = i21 & (-458753);
                        eVar3 = eVar2;
                        e11 = dVar;
                    }
                    u11.j0();
                    int i22 = ((i16 >> 12) & 896) | 48;
                    Intrinsics.checkNotNullParameter(b11, "<this>");
                    Intrinsics.checkNotNullParameter(start, "start");
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    u11.B(915554309);
                    u11.B(-1132245922);
                    n11 = u11.n(start) | ((((i22 & 896) ^ 384) > 256 && u11.n(builder)) || (i22 & 384) == 256);
                    C12 = u11.C();
                    if (!n11 || C12 == InterfaceC3967k.a.a()) {
                        d0 D11 = b11.D();
                        Intrinsics.checkNotNullParameter(start, "<this>");
                        M m11 = new M(D11, start.a(), null);
                        builder.invoke(new C6557d(m11));
                        C12 = m11.b();
                        u11.x(C12);
                    }
                    L l11 = (L) C12;
                    u11.K();
                    u11.K();
                    Unit unit = Unit.f71690a;
                    u11.B(-900576014);
                    F11 = u11.F(c7951b2);
                    C13 = u11.C();
                    if (!F11 || C13 == InterfaceC3967k.a.a()) {
                        C13 = new C6559f(c7951b2, null);
                        u11.x(C13);
                    }
                    u11.K();
                    Q.e(u11, unit, (Function2) C13);
                    C3996z.b(new H0[]{C6554a.a().c(c8140b2)}, a1.c.b(new C6560g(b11, l11, eVar3, e11), u11, 1580257487), u11, 48);
                    C8140b c8140b4 = c8140b2;
                    c7951b3 = c7951b2;
                    c8140b3 = c8140b4;
                } else {
                    u11.j();
                    b11 = p11;
                    eVar3 = eVar2;
                    c8140b3 = c8140b2;
                    e11 = dVar;
                    c7951b3 = c7951b;
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new C6558e(start, eVar3, e11, b11, c8140b3, c7951b3, builder, i11, i12));
                    return;
                }
                return;
            }
        } else {
            c8140b2 = c8140b;
        }
        i14 = 8192;
        i15 = i18 | i14 | 65536;
        if ((i11 & 1572864) == 0) {
        }
        if ((599187 & i15) == 599186) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i17 == 0) {
        }
        e11 = InterfaceC6250b.a.e();
        b11 = C2848x.b(new b0[0], u11);
        int i192 = i15 & (-7169);
        if ((i12 & 16) != 0) {
        }
        u11.B(-900583997);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        c7951b2 = (C7951b) C11;
        u11.K();
        i16 = i192 & (-458753);
        u11.j0();
        int i222 = ((i16 >> 12) & 896) | 48;
        Intrinsics.checkNotNullParameter(b11, "<this>");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(builder, "builder");
        u11.B(915554309);
        u11.B(-1132245922);
        if (((i222 & 896) ^ 384) > 256) {
            n11 = u11.n(start) | ((((i222 & 896) ^ 384) > 256 && u11.n(builder)) || (i222 & 384) == 256);
            C12 = u11.C();
            if (!n11) {
            }
            d0 D112 = b11.D();
            Intrinsics.checkNotNullParameter(start, "<this>");
            M m112 = new M(D112, start.a(), null);
            builder.invoke(new C6557d(m112));
            C12 = m112.b();
            u11.x(C12);
            L l112 = (L) C12;
            u11.K();
            u11.K();
            Unit unit2 = Unit.f71690a;
            u11.B(-900576014);
            F11 = u11.F(c7951b2);
            C13 = u11.C();
            if (!F11) {
            }
            C13 = new C6559f(c7951b2, null);
            u11.x(C13);
            u11.K();
            Q.e(u11, unit2, (Function2) C13);
            C3996z.b(new H0[]{C6554a.a().c(c8140b2)}, a1.c.b(new C6560g(b11, l112, eVar3, e11), u11, 1580257487), u11, 48);
            C8140b c8140b42 = c8140b2;
            c7951b3 = c7951b2;
            c8140b3 = c8140b42;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        n11 = u11.n(start) | ((((i222 & 896) ^ 384) > 256 && u11.n(builder)) || (i222 & 384) == 256);
        C12 = u11.C();
        if (!n11) {
        }
        d0 D1122 = b11.D();
        Intrinsics.checkNotNullParameter(start, "<this>");
        M m1122 = new M(D1122, start.a(), null);
        builder.invoke(new C6557d(m1122));
        C12 = m1122.b();
        u11.x(C12);
        L l1122 = (L) C12;
        u11.K();
        u11.K();
        Unit unit22 = Unit.f71690a;
        u11.B(-900576014);
        F11 = u11.F(c7951b2);
        C13 = u11.C();
        if (!F11) {
        }
        C13 = new C6559f(c7951b2, null);
        u11.x(C13);
        u11.K();
        Q.e(u11, unit22, (Function2) C13);
        C3996z.b(new H0[]{C6554a.a().c(c8140b2)}, a1.c.b(new C6560g(b11, l1122, eVar3, e11), u11, 1580257487), u11, 48);
        C8140b c8140b422 = c8140b2;
        c7951b3 = c7951b2;
        c8140b3 = c8140b422;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }
}
