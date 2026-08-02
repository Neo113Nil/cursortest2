package ru.ozon.app.android.monetization.widgets.countDownTimer.presentation;

import D1.InterfaceC2801g;
import E0.C2942q;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import Tg.b;
import WZ.l;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import e1.InterfaceC6250b;
import e3.i;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Duration;
import ru.ozon.app.android.pdp.ui.compose.time.StableDateTime;
import ru.ozon.app.android.pdp.ui.compose.time.StablePeriod;
import ru.ozon.app.android.pdp.ui.compose.time.TimersKt;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import ru.ozon.app.android.utils.DateUtilsKt;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/monetization/widgets/countDownTimer/presentation/CountDownTimerVI;", "state", "Lkotlin/Function1;", "LTg/b;", "", "actionHandler", "CountDownTimerWidget", "(Lru/ozon/app/android/monetization/widgets/countDownTimer/presentation/CountDownTimerVI;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "monetization_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CountDownTimerWidgetKt {
    public static final void CountDownTimerWidget(@NotNull CountDownTimerVI state, @NotNull Function1<? super b, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(38369839);
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
            c3969l = u11;
        } else {
            u11.o(1876662470);
            if (state.getTokenizedEvent() != null) {
                l lVar = (l) u11.m(f.e());
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(1876667331);
                boolean F11 = ((i12 & 14) == 4) | u11.F(lVar);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new CountDownTimerWidgetKt$CountDownTimerWidget$1$1(lVar, state);
                    u11.x(C11);
                }
                u11.k();
                i.a(aVar, null, (Function0) C11, u11, 6);
            }
            u11.k();
            e g10 = T.g(e.f40358c0, 16, 6);
            Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, g10);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            InterfaceC7851b interfaceC7851b = (InterfaceC7851b) u11.m(f.c());
            StableDateTime deadlineDate = state.getDeadlineDate();
            Duration e11 = Duration.e();
            Intrinsics.checkNotNullExpressionValue(e11, "standardMinutes(...)");
            u11.o(743584711);
            boolean F12 = ((i12 & 112) == 32) | ((i12 & 14) == 4) | u11.F(interfaceC7851b);
            Object C12 = u11.C();
            if (F12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new CountDownTimerWidgetKt$CountDownTimerWidget$2$period$1$1(interfaceC7851b, state, actionHandler);
                u11.x(C12);
            }
            u11.k();
            c3969l = u11;
            StablePeriod rememberRemainingPeriod = TimersKt.rememberRemainingPeriod(deadlineDate, null, e11, (Function0) C12, c3969l, 0, 2);
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            C5194q a12 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), c3969l, 0);
            int I12 = c3969l.I();
            A0 d12 = c3969l.d();
            e f11 = c.f(c3969l, layoutWeightElement);
            Function0 a13 = InterfaceC2801g.a.a();
            c3969l.i();
            if (c3969l.t()) {
                c3969l.H(a13);
            } else {
                c3969l.e();
            }
            Function2 g11 = K00.b.g(c3969l, a12, c3969l, d12);
            if (c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I12))) {
                a.d(I12, c3969l, I12, g11);
            }
            F1.b(c3969l, f11, InterfaceC2801g.a.f());
            boolean isExpired = rememberRemainingPeriod.isExpired();
            c3969l.o(751886028);
            boolean p11 = c3969l.p(isExpired);
            Object C13 = c3969l.C();
            if (p11 || C13 == InterfaceC3967k.a.a()) {
                C13 = rememberRemainingPeriod.isExpired() ? new Pair(state.getExpiredTitle(), state.getExpiredSubtitle()) : new Pair(state.getDefaultTitle(), state.getDefaultSubtitle());
                c3969l.x(C13);
            }
            Pair pair = (Pair) C13;
            c3969l.k();
            TextDTO textDTO = (TextDTO) pair.a();
            TextDTO textDTO2 = (TextDTO) pair.b();
            DsTextAtomKt.DsTextAtom(textDTO, null, c3969l, 0, 2);
            c3969l.o(751895321);
            if (textDTO2 != null) {
                DsTextAtomKt.DsTextAtom(textDTO2, null, c3969l, 0, 2);
            }
            c3969l.k();
            c3969l.f();
            BadgeDTO timerBadge = state.getTimerBadge();
            c3969l.o(743606104);
            boolean n11 = c3969l.n(timerBadge) | c3969l.n(rememberRemainingPeriod);
            Object C14 = c3969l.C();
            if (n11 || C14 == InterfaceC3967k.a.a()) {
                BadgeDTO timerBadge2 = state.getTimerBadge();
                BadgeDTO copy$default = timerBadge2 != null ? BadgeDTO.copy$default(timerBadge2, G.g.c(DateUtilsKt.toTwoDigitString(rememberRemainingPeriod.getWholeHours()), ProductContainerDTO.RATIO_DELIMITER, DateUtilsKt.toTwoDigitString(rememberRemainingPeriod.getMinutes())), null, null, null, null, null, null, null, null, null, null, null, 4094, null) : null;
                c3969l.x(copy$default);
                C14 = copy$default;
            }
            BadgeDTO badgeDTO = (BadgeDTO) C14;
            c3969l.k();
            c3969l.o(743611692);
            if (badgeDTO != null && !rememberRemainingPeriod.isExpired()) {
                DsBadgeAtomKt.DsBadgeAtom(badgeDTO, null, null, c3969l, 0, 6);
                c3969l = c3969l;
            }
            c3969l.k();
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new CountDownTimerWidgetKt$CountDownTimerWidget$3(state, actionHandler, i11));
        }
    }
}
