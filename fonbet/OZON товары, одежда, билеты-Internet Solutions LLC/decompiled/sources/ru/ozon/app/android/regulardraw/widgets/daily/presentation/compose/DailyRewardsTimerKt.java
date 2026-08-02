package ru.ozon.app.android.regulardraw.widgets.daily.presentation.compose;

import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import J0.u3;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import V1.h;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.pdp.ui.compose.time.StableDateTime;
import ru.ozon.app.android.pdp.ui.compose.time.StableTimeWrappersKt;
import ru.ozon.app.android.pdp.ui.compose.time.TimersKt;
import ru.ozon.app.android.regulardraw.R$color;
import ru.ozon.app.android.regulardraw.ui.FormattingKt;
import ru.ozon.app.android.regulardraw.ui.styles.RegularDrawTypographyKt;
import ru.ozon.app.android.regulardraw.widgets.daily.data.DailyVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/daily/data/DailyVO$Timer;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAtomAction", "Landroidx/compose/ui/e;", "modifier", "DailyRewardsTimer", "(Lru/ozon/app/android/regulardraw/widgets/daily/data/DailyVO$Timer;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LS0/k;II)V", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DailyRewardsTimerKt {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DailyRewardsTimer(@NotNull DailyVO.Timer state, @NotNull Function1<? super AtomAction, Unit> onAtomAction, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        boolean z11;
        Object C11;
        int I11;
        C3969l c3969l;
        e eVar3;
        J0 m02;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onAtomAction, "onAtomAction");
        C3969l u11 = interfaceC3967k.u(-175311180);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(onAtomAction) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i13 & 147) == 146 || !u11.b()) {
                e eVar4 = i14 == 0 ? e.f40358c0 : eVar2;
                StableDateTime stable = StableTimeWrappersKt.stable(new DateTime(state.getTimestampEnd()));
                u11.o(1492303417);
                z11 = ((i13 & 112) != 32) | ((i13 & 14) == 4);
                C11 = u11.C();
                if (!z11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new DailyRewardsTimerKt$DailyRewardsTimer$formattedPeriod$1$1(onAtomAction, state);
                    u11.x(C11);
                }
                u11.k();
                String rememberHumanReadableFormattedPeriod = FormattingKt.rememberHumanReadableFormattedPeriod(TimersKt.rememberRemainingPeriod(stable, null, null, (Function0) C11, u11, 0, 6), false, "\u2009:\u2009", u11, 432, 0);
                float f7 = 16;
                e i15 = T.i(a0.e(eVar4, 1.0f), f7, 9, f7, 10);
                C5194q a11 = C5193p.a(C5179b.n(4), InterfaceC6250b.a.g(), u11, 54);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f11 = c.f(u11, i15);
                Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a12);
                }
                Function2 g10 = b.g(u11, a11, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, g10);
                }
                F1.b(u11, f11, InterfaceC2801g.a.f());
                c3969l = u11;
                u3.b(state.getTitle(), null, G1.b.a(u11, R$color.daily_rewards_timer_title_color), 0L, null, 0L, h.a(3), 0L, 0, false, 0, 0, null, RegularDrawTypographyKt.getText_14_16_W500(), c3969l, 0, 0, 65018);
                u3.b(rememberHumanReadableFormattedPeriod, null, G1.b.a(c3969l, R$color.daily_rewards_timer_color), 0L, null, 0L, h.a(3), 0L, 0, false, 0, 0, null, RegularDrawTypographyKt.getText_20_20_W500(), c3969l, 0, 0, 65018);
                c3969l.f();
                eVar3 = eVar4;
            } else {
                u11.j();
                eVar3 = eVar2;
                c3969l = u11;
            }
            m02 = c3969l.m0();
            if (m02 == null) {
                m02.G(new DailyRewardsTimerKt$DailyRewardsTimer$2(state, onAtomAction, eVar3, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i13 & 147) == 146) {
        }
        if (i14 == 0) {
        }
        StableDateTime stable2 = StableTimeWrappersKt.stable(new DateTime(state.getTimestampEnd()));
        u11.o(1492303417);
        z11 = ((i13 & 112) != 32) | ((i13 & 14) == 4);
        C11 = u11.C();
        if (!z11) {
        }
        C11 = new DailyRewardsTimerKt$DailyRewardsTimer$formattedPeriod$1$1(onAtomAction, state);
        u11.x(C11);
        u11.k();
        String rememberHumanReadableFormattedPeriod2 = FormattingKt.rememberHumanReadableFormattedPeriod(TimersKt.rememberRemainingPeriod(stable2, null, null, (Function0) C11, u11, 0, 6), false, "\u2009:\u2009", u11, 432, 0);
        float f72 = 16;
        e i152 = T.i(a0.e(eVar4, 1.0f), f72, 9, f72, 10);
        C5194q a112 = C5193p.a(C5179b.n(4), InterfaceC6250b.a.g(), u11, 54);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f112 = c.f(u11, i152);
        Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g102 = b.g(u11, a112, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, g102);
        F1.b(u11, f112, InterfaceC2801g.a.f());
        c3969l = u11;
        u3.b(state.getTitle(), null, G1.b.a(u11, R$color.daily_rewards_timer_title_color), 0L, null, 0L, h.a(3), 0L, 0, false, 0, 0, null, RegularDrawTypographyKt.getText_14_16_W500(), c3969l, 0, 0, 65018);
        u3.b(rememberHumanReadableFormattedPeriod2, null, G1.b.a(c3969l, R$color.daily_rewards_timer_color), 0L, null, 0L, h.a(3), 0L, 0, false, 0, 0, null, RegularDrawTypographyKt.getText_20_20_W500(), c3969l, 0, 0, 65018);
        c3969l.f();
        eVar3 = eVar4;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }
}
