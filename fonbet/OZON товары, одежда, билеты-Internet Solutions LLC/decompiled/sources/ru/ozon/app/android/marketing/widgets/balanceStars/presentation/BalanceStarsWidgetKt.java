package ru.ozon.app.android.marketing.widgets.balanceStars.presentation;

import A0.h;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import WZ.l;
import android.content.Context;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import e1.InterfaceC6250b;
import e3.i;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7811b0;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/marketing/widgets/balanceStars/presentation/BalanceStarsVO;", "state", "", "BalanceStarsWidget", "(Lru/ozon/app/android/marketing/widgets/balanceStars/presentation/BalanceStarsVO;LS0/k;I)V", "marketing_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BalanceStarsWidgetKt {
    public static final void BalanceStarsWidget(@NotNull BalanceStarsVO state, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        e b12;
        Intrinsics.checkNotNullParameter(state, "state");
        C3969l u11 = interfaceC3967k.u(1656127655);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
            l lVar = (l) u11.m(f.e());
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            u11.o(307827152);
            boolean F11 = u11.F(state) | u11.F(lVar);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new BalanceStarsWidgetKt$BalanceStarsWidget$1$1(state, lVar);
                u11.x(C11);
            }
            u11.k();
            i.a(aVar, null, (Function0) C11, u11, 6);
            e.a aVar2 = e.f40358c0;
            e e11 = a0.e(aVar2, 1.0f);
            StyleParser styleParser = StyleParser.INSTANCE;
            b11 = androidx.compose.foundation.e.b(e11, C7811b0.b(styleParser.parseColor(context, state.getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId())), y0.a());
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, b11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f12);
            }
            e c11 = GZ.e.c(u11, f11, aVar2, 1.0f);
            Paddings paddings = Paddings.INSTANCE;
            b12 = androidx.compose.foundation.e.b(C6988h.a(T.g(c11, paddings.m786getDp16D9Ej5fM(), paddings.m788getDp8D9Ej5fM()), h.b(paddings.m786getDp16D9Ej5fM())), C7811b0.b(styleParser.parseColor(context, state.getBlockBackgroundColor(), UniColors.BG_PRIMARY.getResId())), y0.a());
            C5194q a12 = C5193p.a(C5179b.b(), InterfaceC6250b.a.g(), u11, 54);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f13 = c.f(u11, b12);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a12, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, g10);
            }
            e j11 = T.j(GZ.e.c(u11, f13, aVar2, 1.0f), paddings.m785getDp12D9Ej5fM(), paddings.m788getDp8D9Ej5fM(), paddings.m785getDp12D9Ej5fM(), 0.0f, 8);
            Y b13 = X.b(C5179b.b(), InterfaceC6250b.a.i(), u11, 54);
            int I13 = u11.I();
            A0 d13 = u11.d();
            e f14 = c.f(u11, j11);
            Function0 a14 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a14);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b13, u11, d13);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                a.d(I13, u11, I13, h11);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            DsIconAtomKt.DsIconAtom(state.getIcon(), a0.n(aVar2, paddings.m787getDp24D9Ej5fM()), u11, IconDTO.$stable | 48, 0);
            DsTextAtomKt.DsTextAtom(state.getTitle(), null, u11, 0, 2);
            u11.f();
            DsTextAtomKt.DsTextAtom(state.getSubtitle(), T.j(aVar2, paddings.m785getDp12D9Ej5fM(), 0.0f, paddings.m785getDp12D9Ej5fM(), paddings.m785getDp12D9Ej5fM(), 2), u11, 48, 0);
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new BalanceStarsWidgetKt$BalanceStarsWidget$3(state, i11));
        }
    }
}
