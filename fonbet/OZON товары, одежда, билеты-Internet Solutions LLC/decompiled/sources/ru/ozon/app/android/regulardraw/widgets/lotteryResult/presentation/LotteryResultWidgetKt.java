package ru.ozon.app.android.regulardraw.widgets.lotteryResult.presentation;

import A0.h;
import B1.V;
import D1.InterfaceC2801g;
import E0.C2942q;
import Ep.a;
import Fr.g;
import J0.T0;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import Tg.b;
import WZ.t;
import android.content.res.Configuration;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.B;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.app.android.regulardraw.utils.AnalyticsKt;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\b\u0010\u0007\u001a!\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/lotteryResult/presentation/LotteryResultVI;", "state", "Lkotlin/Function1;", "LTg/b;", "", "actionHandler", "LotteryResultWidget", "(Lru/ozon/app/android/regulardraw/widgets/lotteryResult/presentation/LotteryResultVI;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "LotteryResultWidgetContent", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "dto", "Landroidx/compose/ui/e;", "modifier", "RightIcon", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Landroidx/compose/ui/e;LS0/k;II)V", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LotteryResultWidgetKt {
    public static final void LotteryResultWidget(@NotNull LotteryResultVI state, @NotNull Function1<? super b, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-1867640128);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            t tokenizedEvent = state.getTokenizedEvent();
            u11.o(2062753365);
            if (tokenizedEvent != null) {
                AnalyticsKt.AnalyticsViewEventsEffect(tokenizedEvent, u11, 0);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            LotteryResultWidgetContent(state, actionHandler, u11, i12 & 126);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new LotteryResultWidgetKt$LotteryResultWidget$2(state, actionHandler, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LotteryResultWidgetContent(LotteryResultVI lotteryResultVI, Function1<? super b, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        J j11;
        int i13;
        int i14;
        C3969l u11 = interfaceC3967k.u(114683105);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(lotteryResultVI) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = e.f40358c0;
            e h11 = T.h(a0.e(aVar, 1.0f), ((Configuration) u11.m(AndroidCompositionLocals_androidKt.c())).screenWidthDp >= 375 ? 28 : 12, 0.0f, 2);
            V f7 = C5185h.f(InterfaceC6250b.a.e(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, h11);
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
            F1.b(u11, f11, InterfaceC2801g.a.f());
            e b11 = C6988h.b(androidx.compose.foundation.e.b(a0.t(aVar, 0.0f, 334, 1), UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getClearLightKey300(), h.b(16)));
            u11.o(-1092217582);
            boolean z11 = ((i12 & 14) == 4) | ((i12 & 112) == 32);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new LotteryResultWidgetKt$LotteryResultWidgetContent$1$1$1(lotteryResultVI, function1);
                u11.x(C11);
            }
            u11.k();
            float f13 = 6;
            float f14 = 9;
            e i15 = T.i(i.b(b11, null, null, false, null, null, (Function0) C11, 28), f13, f14, 10, f14);
            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f15 = c.f(u11, i15);
            Function0 a12 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 h12 = Cm.e.h(u11, b12, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, h12);
            }
            F1.b(u11, f15, InterfaceC2801g.a.f());
            LotteryDateKt.LotteryDate(lotteryResultVI.getDate(), T.h(aVar, 8, 0.0f, 2), u11, 48, 0);
            float f16 = 4;
            u0.E.a(u11, a0.r(aVar, f16));
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            e l02 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true).l0(new VerticalAlignElement(InterfaceC6250b.a.l()));
            C5194q a13 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I13 = u11.I();
            A0 d13 = u11.d();
            e f17 = c.f(u11, l02);
            Function0 a14 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a14);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a13, u11, d13);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                a.d(I13, u11, I13, g10);
            }
            F1.b(u11, f17, InterfaceC2801g.a.f());
            e j12 = T.j(aVar, 0.0f, 0.0f, 0.0f, f13, 7);
            C5179b.i n11 = C5179b.n(f16);
            C5179b.i n12 = C5179b.n(2);
            j11 = J.f39354b;
            B.a(j12, n11, n12, 0, 0, j11, a1.c.c(-1354878340, new LotteryResultWidgetKt$LotteryResultWidgetContent$1$2$1$1(lotteryResultVI, function1), u11), u11, 1573302, 24);
            u11.o(-1477262845);
            if (lotteryResultVI.getDrawStatus() != null) {
                i13 = 2;
                i14 = 0;
                LotteryDrawStatusBadgeKt.LotteryDrawStatusBadge(lotteryResultVI.getDrawStatus(), null, function1, u11, (i12 << 3) & 896, 2);
            } else {
                i13 = 2;
                i14 = 0;
            }
            u11.k();
            u11.o(-1477255357);
            if (lotteryResultVI.getValues() != null) {
                LotteryValuesKt.LotteryValues(lotteryResultVI.getValues(), null, u11, i14, i13);
            }
            u11.k();
            u11.f();
            RightIcon(lotteryResultVI.getRightIcon(), null, u11, IconButtonV3DTO.$stable, i13);
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new LotteryResultWidgetKt$LotteryResultWidgetContent$2(lotteryResultVI, function1, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RightIcon(IconButtonV3DTO iconButtonV3DTO, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        C3969l u11 = interfaceC3967k.u(921828115);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? u11.n(iconButtonV3DTO) : u11.F(iconButtonV3DTO) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            AbstractC8972b abstractC8972b = TokenParserKt.tokenToIcon(iconButtonV3DTO.getIcon(), u11, 0);
            if (abstractC8972b != null) {
                e n11 = a0.n(eVar, 20);
                String iconColor = iconButtonV3DTO.getIconColor();
                u11.o(-93275991);
                C7807Z c7807z = iconColor == null ? null : TokenParserKt.tokenToColor(iconColor, u11, 0);
                u11.k();
                T0.a(abstractC8972b, null, n11, c7807z != null ? c7807z.w() : C7807Z.f72259m, u11, 48);
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new LotteryResultWidgetKt$RightIcon$2(iconButtonV3DTO, eVar, i11, i12));
        }
    }
}
