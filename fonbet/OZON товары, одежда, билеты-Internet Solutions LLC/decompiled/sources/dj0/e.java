package dj0;

import A0.g;
import B1.V;
import D1.InterfaceC2801g;
import J0.P;
import P0.p2;
import P0.u2;
import P0.v2;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import a1.C4912a;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import dj0.InterfaceC6209a;
import dj0.f;
import e1.InterfaceC6250b;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import m3.C8060b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e {
    public static final void a(androidx.compose.ui.e eVar, Function1 function1, @NotNull C4912a content, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        Function1 function12;
        androidx.compose.ui.e eVar2;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        Intrinsics.checkNotNullParameter(content, "content");
        interfaceC3967k2.o(-1002092534);
        androidx.compose.ui.e eVar3 = (i12 & 1) != 0 ? androidx.compose.ui.e.f40358c0 : eVar;
        if ((i12 & 2) != 0) {
            interfaceC3967k2.o(-1706347696);
            Object C11 = interfaceC3967k2.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = C6210b.f61652b;
                interfaceC3967k2.x(C11);
            }
            function12 = (Function1) C11;
            interfaceC3967k2.k();
        } else {
            function12 = function1;
        }
        f.a aVar = new f.a();
        function12.invoke(aVar);
        f a11 = aVar.a();
        C5194q a12 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), interfaceC3967k2, 0);
        int I11 = interfaceC3967k2.I();
        A0 d11 = interfaceC3967k2.d();
        androidx.compose.ui.e f7 = androidx.compose.ui.c.f(interfaceC3967k2, eVar3);
        InterfaceC2801g.f5440U.getClass();
        Function0 a13 = InterfaceC2801g.a.a();
        if (interfaceC3967k2.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k2.i();
        if (interfaceC3967k2.t()) {
            interfaceC3967k2.H(a13);
        } else {
            interfaceC3967k2.e();
        }
        Function2 c11 = P.c(interfaceC3967k2, a12, interfaceC3967k2, d11);
        if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
            Nk.a.d(c11, I11, interfaceC3967k2, I11);
        }
        F1.b(interfaceC3967k2, f7, InterfaceC2801g.a.f());
        interfaceC3967k2.o(287923079);
        String b11 = a11.b();
        if (b11 == null || h.K(b11)) {
            eVar2 = eVar3;
        } else {
            eVar2 = eVar3;
            p2.b(a11.b(), T.h(T.h(androidx.compose.ui.e.f40358c0, 0.0f, 8, 1), 16, 0.0f, 2), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((u2) interfaceC3967k2.m(v2.a())).n(), interfaceC3967k, 48, 0, 65532);
            interfaceC3967k2 = interfaceC3967k;
        }
        interfaceC3967k2.k();
        b(eVar2, a11.a(), content, interfaceC3967k2, i11 & 910);
        interfaceC3967k2.f();
        interfaceC3967k2.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(androidx.compose.ui.e eVar, Set set, C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-1598345837);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(set) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(c4912a) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            g c11 = A0.h.c(set.contains(InterfaceC6209a.d.f61651a) ? 16 : 0, set.contains(InterfaceC6209a.c.f61650a) ? 16 : 0, set.contains(InterfaceC6209a.C0961a.f61648a) ? 16 : 0, set.contains(InterfaceC6209a.b.f61649a) ? 16 : 0);
            androidx.compose.ui.e b11 = androidx.compose.foundation.e.b(eVar, ((aj0.d) u11.m(Zi0.a.b())).d(), c11);
            u11.o(-614973436);
            boolean n11 = u11.n(c11);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new C6211c(c11);
                u11.x(C11);
            }
            u11.k();
            androidx.compose.ui.e a11 = androidx.compose.ui.graphics.a.a(b11, (Function1) C11);
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, a11);
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            androidx.compose.ui.e f13 = T.f(androidx.compose.ui.e.f40358c0, 16);
            V f14 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I12 = u11.I();
            A0 d12 = u11.d();
            androidx.compose.ui.e f15 = androidx.compose.ui.c.f(u11, f13);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 f16 = E.f(u11, f14, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                Ep.a.d(I12, u11, I12, f16);
            }
            F1.b(u11, f15, InterfaceC2801g.a.f());
            c4912a.invoke(u11, Integer.valueOf((i12 >> 6) & 14));
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C6212d(eVar, set, c4912a, i11));
        }
    }
}
