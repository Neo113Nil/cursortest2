package ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator.presentation.compose;

import B1.V;
import D1.InterfaceC2801g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import androidx.lifecycle.AbstractC5434v;
import e1.InterfaceC6250b;
import e3.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.data.icon.IconDTO;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final float f84081a = 124;

    public static final void a(@NotNull ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator.presentation.a state, Function1 function1, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(state, "state");
        C3969l u11 = interfaceC3967k.u(1634069836);
        int i12 = (u11.n(state) ? 4 : 2) | i11 | (u11.F(function1) ? 32 : 16);
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            u11.o(2138957468);
            boolean F11 = ((i12 & 112) == 32) | u11.F(state);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new a(function1, state);
                u11.x(C11);
            }
            u11.k();
            i.a(aVar, null, (Function0) C11, u11, 6);
            e.a aVar2 = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e a11 = Q1.a(aVar2, state.a());
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            androidx.compose.ui.e f7 = a0.f(a0.e(T.j(a11, dsSpacings.m1842getDp12D9Ej5fM(), dsSpacings.m1854getDp4D9Ej5fM(), 0.0f, 0.0f, 12), 1.0f), f84081a);
            V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f12 = androidx.compose.ui.c.f(u11, f7);
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f13 = E.f(u11, f11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f13);
            }
            androidx.compose.ui.e c11 = GZ.e.c(u11, f12, aVar2, 1.0f);
            Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I12 = u11.I();
            A0 d12 = u11.d();
            androidx.compose.ui.e f14 = androidx.compose.ui.c.f(u11, c11);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b11, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                Ep.a.d(I12, u11, I12, h11);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            DsIconAtomKt.DsIconAtom(state.b(), null, u11, IconDTO.$stable, 2);
            ru.ozon.android.messenger.framework.presentation.common.utils.a.b(dsSpacings.m1861getDp8D9Ej5fM(), u11);
            d.a(state.c(), u11, 0);
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new b(state, function1, i11));
        }
    }

    public static final float b() {
        return f84081a;
    }
}
