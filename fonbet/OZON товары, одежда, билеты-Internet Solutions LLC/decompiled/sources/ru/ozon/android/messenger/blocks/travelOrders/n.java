package ru.ozon.android.messenger.blocks.travelOrders;

import B1.V;
import D1.InterfaceC2801g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import S0.Q;
import T7.E;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6988h;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.components.productMedia.UniProductMediaAtomKt;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import u0.C9915y;
import v0.C10164d;
import v0.I;
import v0.M;

/* loaded from: classes10.dex */
public final class n {
    public static final void a(@NotNull p vo, @NotNull ru.ozon.android.messenger.framework.navigation.controller.a controller, e.a aVar, InterfaceC3967k interfaceC3967k, int i11) {
        p pVar;
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(controller, "controller");
        C3969l u11 = interfaceC3967k.u(-1607916176);
        int i12 = (u11.n(vo) ? 4 : 2) | i11 | (u11.n(controller) ? 32 : 16) | 384;
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
            pVar = vo;
        } else {
            e.a aVar2 = androidx.compose.ui.e.f40358c0;
            u11.o(-95084314);
            int i13 = i12 & 112;
            boolean z11 = i13 == 32;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new d(controller);
                u11.x(C11);
            }
            Function1 function1 = (Function1) C11;
            u11.k();
            u11.o(-95078954);
            boolean z12 = i13 == 32;
            Object C12 = u11.C();
            if (z12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new e(controller);
                u11.x(C12);
            }
            u11.k();
            pVar = vo;
            b(pVar, function1, (Function1) C12, aVar2, u11, (i12 & 14) | 3072);
            aVar = aVar2;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new f(pVar, controller, aVar, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(p pVar, Function1 function1, Function1 function12, androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        I i13;
        C3969l c3969l;
        p pVar2 = pVar;
        C3969l u11 = interfaceC3967k.u(-1609656869);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(pVar2) : u11.F(pVar2) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(eVar) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i14 = i12;
        if ((i14 & 1171) == 1170 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            float f7 = ((Configuration) u11.m(AndroidCompositionLocals_androidKt.c())).screenWidthDp;
            I c11 = M.c(0, 0, u11, 3);
            u11.o(1761072836);
            boolean n11 = u11.n(pVar2);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new LinkedHashSet();
                u11.x(C11);
            }
            Set set = (Set) C11;
            u11.k();
            u11.o(1761075424);
            boolean n12 = ((i14 & 896) == 256) | u11.n(c11) | u11.n(set) | u11.F(pVar2);
            Object C12 = u11.C();
            if (n12 || C12 == InterfaceC3967k.a.a()) {
                Object gVar = new g(c11, set, pVar, function12, null);
                i13 = c11;
                pVar2 = pVar;
                u11.x(gVar);
                C12 = gVar;
            } else {
                i13 = c11;
            }
            u11.k();
            Q.e(u11, i13, (Function2) C12);
            float f11 = 12;
            androidx.compose.ui.e j11 = T.j(a0.e(eVar, 1.0f), 0.0f, f11, 0.0f, 4, 5);
            V f12 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f13 = androidx.compose.ui.c.f(u11, j11);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f14 = E.f(u11, f12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f14);
            }
            F1.b(u11, f13, InterfaceC2801g.a.f());
            C9915y a12 = T.a(f11, 2, 0.0f);
            C5179b.i n13 = C5179b.n(6);
            u11.o(1102035045);
            boolean F11 = u11.F(pVar2) | u11.q(f7) | ((i14 & 112) == 32);
            Object C13 = u11.C();
            if (F11 || C13 == InterfaceC3967k.a.a()) {
                C13 = new l(pVar2, f7, function1);
                u11.x(C13);
            }
            u11.k();
            c3969l = u11;
            C10164d.b(null, i13, a12, n13, null, null, false, (Function1) C13, c3969l, 24960, 233);
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new m(pVar2, function1, function12, eVar, i11));
        }
    }

    public static final void c(a aVar, float f7, String str, CornerRadius cornerRadius, Function0 function0, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        androidx.compose.ui.e b11;
        androidx.compose.ui.e eVar;
        C3969l u11 = interfaceC3967k.u(1698613684);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(aVar) : u11.F(aVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.q(f7) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(str) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(cornerRadius) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(function0) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
        } else {
            Z1.h a11 = cornerRadius != null ? Z1.h.a(cornerRadius.getPx()) : null;
            e.a aVar2 = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e l02 = a0.t(aVar2, 0.0f, f7, 1).l0(a11 != null ? C6988h.a(aVar2, A0.h.b(a11.d())) : aVar2);
            C7807Z c7807z = TokenParserKt.tokenToColor(str, u11, (i12 >> 6) & 14);
            b11 = androidx.compose.foundation.e.b(l02, c7807z != null ? c7807z.w() : C7807Z.f72258l, y0.a());
            float f11 = 6;
            androidx.compose.ui.e f12 = T.f(androidx.compose.foundation.i.c(b11, false, null, null, function0, 7), f11);
            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f13 = androidx.compose.ui.c.f(u11, f12);
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f13, InterfaceC2801g.a.f());
            ProductMediaDTO b13 = aVar.b();
            u11.o(-1132622519);
            if (b13 == null) {
                eVar = null;
            } else {
                u11.o(1990069454);
                Object C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = b.f86502b;
                    u11.x(C11);
                }
                u11.k();
                eVar = null;
                UniProductMediaAtomKt.UniProductMediaAtom(b13, aVar2, (Function1) C11, u11, ProductMediaDTO.$stable | 432, 0);
            }
            u11.k();
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
            }
            androidx.compose.ui.e h12 = T.h(new LayoutWeightElement(1.0f, false), f11, 0.0f, 2);
            C5194q a13 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I12 = u11.I();
            A0 d12 = u11.d();
            androidx.compose.ui.e f14 = androidx.compose.ui.c.f(u11, h12);
            Function0 a14 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a14);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a13, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                Ep.a.d(I12, u11, I12, g10);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            DsTextAtomKt.DsTextAtom(aVar.d(), eVar, u11, 0, 2);
            u11.o(1990078340);
            if (aVar.c() != null) {
                ru.ozon.android.messenger.framework.presentation.common.utils.a.a(2, u11);
                DsTextAtomKt.DsTextAtom(aVar.c(), eVar, u11, 0, 2);
            }
            u11.k();
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new c(aVar, f7, str, cornerRadius, function0, i11));
        }
    }
}
