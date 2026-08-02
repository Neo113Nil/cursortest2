package ru.ozon.app.android.regulardraw.widgets.lotteryInformation.presentation;

import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import Tg.b;
import WZ.t;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e1.InterfaceC6250b;
import e1.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButtonDTO;
import ru.ozon.app.android.regulardraw.ui.button.compose.MorkovskShadowButtonKt;
import ru.ozon.app.android.regulardraw.utils.AnalyticsKt;
import ru.ozon.app.android.regulardraw.widgets.lotteryInformation.presentation.LotteryInformationVI;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI;", "state", "Lkotlin/Function1;", "LTg/b;", "", "actionHandler", "LotteryInformationWidget", "(Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "LotteryInformationWidgetContent", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LotteryInformationWidgetKt {
    public static final void LotteryInformationWidget(@NotNull LotteryInformationVI state, @NotNull Function1<? super b, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-1629145996);
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
            u11.o(-1221193945);
            if (tokenizedEvent != null) {
                AnalyticsKt.AnalyticsViewEventsEffect(tokenizedEvent, u11, 0);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            LotteryInformationWidgetContent(state, actionHandler, u11, i12 & 126);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new LotteryInformationWidgetKt$LotteryInformationWidget$2(state, actionHandler, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LotteryInformationWidgetContent(LotteryInformationVI lotteryInformationVI, Function1<? super b, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        float f7;
        int i13;
        Function1<? super b, Unit> function12 = function1;
        C3969l u11 = interfaceC3967k.u(-1897442427);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(lotteryInformationVI) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function12) ? 32 : 16;
        }
        int i14 = i12;
        if ((i14 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = e.f40358c0;
            e e11 = a0.e(aVar, 1.0f);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, e11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            float f12 = ((Configuration) u11.m(AndroidCompositionLocals_androidKt.c())).screenWidthDp >= 375 ? 28 : 12;
            C5194q a13 = C5193p.a(C5179b.n(-19), InterfaceC6250b.a.g(), u11, 54);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f13 = c.f(u11, aVar);
            Function0 a14 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a14);
            } else {
                u11.e();
            }
            Function2 g11 = K00.b.g(u11, a13, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, g11);
            }
            F1.b(u11, f13, InterfaceC2801g.a.f());
            int i15 = i14 & 112;
            LotteryBannerKt.LotteryBanner(lotteryInformationVI.getBanner(), function12, j.a(aVar, 1.0f), u11, i15 | 384, 0);
            LotteryInformationVI.MainInfo mainInfo = lotteryInformationVI.getMainInfo();
            if (mainInfo instanceof LotteryInformationVI.ActiveMainInfo) {
                u11.o(1064773872);
                int i16 = (i14 << 3) & 896;
                i13 = 0;
                f7 = 0.0f;
                LotteryActiveMainInfoKt.LotteryActiveMainInfo((LotteryInformationVI.ActiveMainInfo) lotteryInformationVI.getMainInfo(), T.h(aVar, f12, 0.0f, 2), function1, u11, i16, 0);
                function12 = function1;
                u11.k();
            } else {
                function12 = function1;
                f7 = 0.0f;
                i13 = 0;
                if (!(mainInfo instanceof LotteryInformationVI.EmptyMainInfo)) {
                    u11.o(1064771570);
                    u11.k();
                    throw new o();
                }
                u11.o(1064782716);
                LotteryEmptyMainInfoKt.LotteryEmptyMainInfo((LotteryInformationVI.EmptyMainInfo) lotteryInformationVI.getMainInfo(), T.h(aVar, f12, 0.0f, 2), u11, 0, 0);
                u11.k();
            }
            u11.f();
            u11.o(1875035482);
            if (lotteryInformationVI.getButton() != null) {
                e e12 = a0.e(a0.t(a0.h(T.j(aVar, f12, h.f(358 - ((Configuration) u11.m(AndroidCompositionLocals_androidKt.c())).screenWidthDp, new IntRange(i13, 18, 1)), f12, 0.0f, 8), 68, f7, 2), f7, 334, 1), 1.0f);
                float f14 = 24;
                MorkovskShadowButtonDTO button = lotteryInformationVI.getButton();
                u11.o(1875053406);
                int i17 = i15 != 32 ? i13 : 1;
                Object C11 = u11.C();
                if (i17 != 0 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new LotteryInformationWidgetKt$LotteryInformationWidgetContent$1$2$1(function12);
                    u11.x(C11);
                }
                u11.k();
                MorkovskShadowButtonKt.m913MorkovskShadowButton942rkJo(button, e12, f14, (Function1) C11, u11, 384, 0);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new LotteryInformationWidgetKt$LotteryInformationWidgetContent$2(lotteryInformationVI, function12, i11));
        }
    }
}
