package ru.ozon.android.messenger.blocks.floatbutton.ai;

import B1.V;
import D1.InterfaceC2801g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import a1.C4912a;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.C7811b0;
import l1.C7835n0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.common.screen.compose.t;
import ru.ozon.uni.core.repository.UniTheme;

/* loaded from: classes10.dex */
public final class q {
    public static final void a(androidx.compose.ui.e eVar, @NotNull g vo, @NotNull Function0 onView, @NotNull Function2 onClick, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(onView, "onView");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        C3969l u11 = interfaceC3967k.u(-1615044951);
        if ((((u11.n(eVar) ? 4 : 2) | i11 | (u11.n(vo) ? 32 : 16) | (u11.F(onView) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | (u11.F(onClick) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL)) & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            t.a(null, a1.c.c(-1321712731, new n(onView, eVar, vo, onClick), u11), u11, 48);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new o(eVar, vo, onView, onClick, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(androidx.compose.ui.e eVar, A0.g gVar, long j11, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        long j12;
        long j13;
        long j14;
        C7835n0 h11;
        long j15;
        long j16;
        long j17;
        C3969l u11 = interfaceC3967k.u(80819);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(gVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.s(j11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            boolean z11 = C7811b0.h(j11) < 0.5f;
            long o11 = C7807Z.o(z11 ? 0.9f : 0.94f, j11);
            u11.o(236648272);
            boolean p11 = u11.p(z11);
            Object C11 = u11.C();
            if (p11 || C11 == InterfaceC3967k.a.a()) {
                if (z11) {
                    AbstractC7799Q.a aVar = AbstractC7799Q.Companion;
                    Float valueOf = Float.valueOf(0.0f);
                    j15 = C7807Z.f72251e;
                    Pair pair = new Pair(valueOf, C7807Z.m(C7807Z.o(0.1f, j15)));
                    Float valueOf2 = Float.valueOf(0.45f);
                    j16 = C7807Z.f72251e;
                    Pair pair2 = new Pair(valueOf2, C7807Z.m(C7807Z.o(0.04f, j16)));
                    Float valueOf3 = Float.valueOf(1.0f);
                    j17 = C7807Z.f72258l;
                    h11 = AbstractC7799Q.a.h(aVar, new Pair[]{pair, pair2, new Pair(valueOf3, C7807Z.m(j17))});
                } else {
                    AbstractC7799Q.a aVar2 = AbstractC7799Q.Companion;
                    Float valueOf4 = Float.valueOf(0.0f);
                    j12 = C7807Z.f72251e;
                    Pair pair3 = new Pair(valueOf4, C7807Z.m(C7807Z.o(0.26f, j12)));
                    Float valueOf5 = Float.valueOf(0.4f);
                    j13 = C7807Z.f72251e;
                    Pair pair4 = new Pair(valueOf5, C7807Z.m(C7807Z.o(0.08f, j13)));
                    Float valueOf6 = Float.valueOf(1.0f);
                    j14 = C7807Z.f72258l;
                    h11 = AbstractC7799Q.a.h(aVar2, new Pair[]{pair3, pair4, new Pair(valueOf6, C7807Z.m(j14))});
                }
                C11 = h11;
                u11.x(C11);
            }
            u11.k();
            C5185h.a(androidx.compose.foundation.e.a(androidx.compose.foundation.e.b(eVar, o11, gVar), (AbstractC7799Q) C11, gVar, 4), u11, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new p(eVar, gVar, j11, i11));
        }
    }

    public static final void c(androidx.compose.ui.e eVar, boolean z11, A0.g gVar, C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        androidx.compose.ui.e customShadow;
        androidx.compose.ui.e eVar2;
        C3969l u11 = interfaceC3967k.u(-260903033);
        int i12 = i11 | 6;
        if ((i11 & 48) == 0) {
            i12 |= u11.p(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(gVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(c4912a) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
            customShadow = eVar;
        } else {
            customShadow = androidx.compose.ui.e.f40358c0;
            u11.o(2063423553);
            boolean z12 = z11 && !S1.p.a(u11);
            u11.k();
            if (z12) {
                long c11 = C7811b0.c(4278190097L);
                A0.g shape = A0.h.e();
                Intrinsics.checkNotNullParameter(customShadow, "$this$customShadow");
                Intrinsics.checkNotNullParameter(shape, "shape");
                eVar2 = androidx.compose.ui.draw.c.d(customShadow, new f(8, 0, 4, shape, c11));
            } else {
                eVar2 = customShadow;
            }
            V f7 = C5185h.f(InterfaceC6250b.a.e(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, eVar2);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            C5187j c5187j = C5187j.f39515a;
            u11.o(-1953757796);
            if (!z11) {
                b(c5187j.b(customShadow), gVar, UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1(), u11, (i12 >> 3) & 112);
            }
            u11.k();
            int i13 = (i12 & 7168) | 54;
            V f13 = C5185h.f(InterfaceC6250b.a.e(), false);
            int I12 = u11.I();
            A0 d12 = u11.d();
            androidx.compose.ui.e f14 = androidx.compose.ui.c.f(u11, customShadow);
            Function0 a12 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f15 = E.f(u11, f13, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                Ep.a.d(I12, u11, I12, f15);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            c4912a.invoke(c5187j, u11, Integer.valueOf(((i13 >> 6) & 112) | 6));
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new h(customShadow, z11, gVar, c4912a, i11));
        }
    }
}
