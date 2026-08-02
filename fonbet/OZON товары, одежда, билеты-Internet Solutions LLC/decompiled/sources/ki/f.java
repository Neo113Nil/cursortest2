package ki;

import B1.V;
import D1.InterfaceC2801g;
import Pk0.h;
import S0.A0;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.S;
import S0.m1;
import S0.n1;
import T7.E;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import m0.D0;
import m0.H0;
import m0.U0;
import m0.W0;
import m0.Y;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import t0.p;
import t0.q;

/* loaded from: classes10.dex */
public final class f {
    public static final void a(@NotNull AbstractC8972b icon, @NotNull g style, @NotNull A0.g shape, androidx.compose.ui.e eVar, e.a aVar, boolean z11, q qVar, @NotNull Function0 onClick, InterfaceC3967k interfaceC3967k, int i11) {
        e.a aVar2;
        androidx.compose.ui.e b11;
        C3969l c3969l;
        androidx.compose.ui.e b12;
        androidx.compose.ui.e eVar2;
        q qVar2;
        boolean z12;
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        C3969l u11 = interfaceC3967k.u(-1993166923);
        int i12 = i11 | (u11.n(icon) ? 4 : 2) | (u11.n(style) ? 32 : 16) | (u11.n(shape) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | 115043328 | (u11.F(onClick) ? 536870912 : 268435456);
        if ((306783379 & i12) == 306783378 && u11.b()) {
            u11.j();
            eVar2 = eVar;
            aVar2 = aVar;
            qVar2 = qVar;
            c3969l = u11;
            z12 = z11;
        } else {
            aVar2 = androidx.compose.ui.e.f40358c0;
            u11.o(-1914917559);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = p.a();
                u11.x(C11);
            }
            q rememberIndicationTransition = (q) C11;
            u11.k();
            Intrinsics.checkNotNullParameter(rememberIndicationTransition, "$this$rememberIndicationTransition");
            u11.o(126613213);
            kotlin.time.b.INSTANCE.getClass();
            u11.o(-1196504504);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = n1.f(Boolean.FALSE, D1.f25195a);
                u11.x(C12);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C12;
            Object b13 = h.b(u11, -1196502704);
            if (b13 == InterfaceC3967k.a.a()) {
                b13 = new Y(Boolean.FALSE);
                u11.x(b13);
            }
            Y y11 = (Y) b13;
            u11.k();
            u11.o(-1196498458);
            boolean F11 = u11.F(y11) | u11.s(0L);
            Object C13 = u11.C();
            if (F11 || C13 == InterfaceC3967k.a.a()) {
                C13 = new C7682b(y11, interfaceC3978p0, null);
                u11.x(C13);
            }
            u11.k();
            Q.e(u11, rememberIndicationTransition, (Function2) C13);
            u11.o(-1196483040);
            boolean s11 = u11.s(0L) | u11.F(y11);
            Object C14 = u11.C();
            if (s11 || C14 == InterfaceC3967k.a.a()) {
                C14 = new d(rememberIndicationTransition, y11, interfaceC3978p0, null);
                u11.x(C14);
            }
            u11.k();
            Q.e(u11, rememberIndicationTransition, (Function2) C14);
            D0 h11 = H0.h(y11, u11);
            u11.k();
            Intrinsics.checkNotNullParameter(h11, "<this>");
            u11.o(1867945808);
            U0 b14 = W0.b();
            boolean booleanValue = ((Boolean) h11.h()).booleanValue();
            u11.o(-628102990);
            float f7 = booleanValue ? 0.1f : 0.0f;
            u11.k();
            Float valueOf = Float.valueOf(f7);
            boolean booleanValue2 = ((Boolean) h11.n()).booleanValue();
            u11.o(-628102990);
            float f11 = booleanValue2 ? 0.1f : 0.0f;
            u11.k();
            S a11 = m1.a(H0.d(h11, valueOf, Float.valueOf(f11), C7681a.f71599b.invoke(h11.m(), u11, 0), b14, u11, 196608));
            u11.k();
            V f12 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f13 = androidx.compose.ui.c.f(u11, aVar2);
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f14 = E.f(u11, f12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f14);
            }
            F1.b(u11, f13, InterfaceC2801g.a.f());
            b11 = androidx.compose.foundation.e.b(C6988h.a(a0.j(aVar2, style.c()), shape), style.a(), y0.a());
            c3969l = u11;
            W20.e.a(icon, style.b(), null, i.b(b11, rememberIndicationTransition, null, true, null, I1.i.a(0), onClick, 8), aVar2, c3969l, (i12 & 14) | 1600512);
            c3969l.o(1554856149);
            b12 = androidx.compose.foundation.e.b(C6988h.a(a0.j(aVar2, style.c()), shape), C7807Z.o(a11.getFloatValue(), style.b()), y0.a());
            C5185h.a(b12, c3969l, 0);
            c3969l.k();
            c3969l.f();
            eVar2 = aVar2;
            qVar2 = rememberIndicationTransition;
            z12 = true;
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new e(icon, style, shape, eVar2, aVar2, z12, qVar2, onClick, i11));
        }
    }
}
