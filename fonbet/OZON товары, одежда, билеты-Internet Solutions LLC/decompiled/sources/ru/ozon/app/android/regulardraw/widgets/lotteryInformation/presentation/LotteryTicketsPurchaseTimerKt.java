package ru.ozon.app.android.regulardraw.widgets.lotteryInformation.presentation;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import G1.h;
import J0.u3;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import Tg.b;
import WZ.t;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e1.d;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.compose.time.StableDateTime;
import ru.ozon.app.android.pdp.ui.compose.time.StablePeriod;
import ru.ozon.app.android.pdp.ui.compose.time.TimersKt;
import ru.ozon.app.android.regulardraw.R$color;
import ru.ozon.app.android.regulardraw.R$plurals;
import ru.ozon.app.android.regulardraw.ui.CustomTextAtomKt;
import ru.ozon.app.android.regulardraw.ui.styles.RegularDrawTypographyKt;
import ru.ozon.app.android.regulardraw.utils.AnalyticsKt;
import ru.ozon.app.android.regulardraw.widgets.lotteryInformation.presentation.LotteryInformationVI;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import ru.ozon.app.android.utils.DateUtilsKt;
import ru.ozon.uni.core.repository.UniTheme;
import u0.EnumC9909s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$ActiveMainInfo$TicketsPurchaseTimerData;", "data", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function1;", "LTg/b;", "", "actionHandler", "TicketsPurchaseTimer", "(Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$ActiveMainInfo$TicketsPurchaseTimerData;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "Lru/ozon/app/android/pdp/ui/compose/time/StableDateTime;", "date", "Lkotlin/Function0;", "onExpired", "DateTimer", "(Lru/ozon/app/android/pdp/ui/compose/time/StableDateTime;Lkotlin/jvm/functions/Function0;LS0/k;I)V", "", "text", "TimerCell", "(Ljava/lang/String;Landroidx/compose/ui/e;LS0/k;II)V", "TimerDelimiter", "(LS0/k;I)V", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LotteryTicketsPurchaseTimerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void DateTimer(StableDateTime stableDateTime, Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        StableDateTime stableDateTime2;
        Function0<Unit> function02;
        C3969l u11 = interfaceC3967k.u(-1731911070);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(stableDateTime) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function0) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
            stableDateTime2 = stableDateTime;
            function02 = function0;
        } else {
            stableDateTime2 = stableDateTime;
            function02 = function0;
            StablePeriod rememberRemainingPeriod = TimersKt.rememberRemainingPeriod(stableDateTime2, null, null, function02, u11, (i12 & 14) | ((i12 << 6) & 7168), 6);
            if (rememberRemainingPeriod.getDays() >= 1) {
                u11.o(57896576);
                TimerCell(h.a(u11).getQuantityString(R$plurals.regular_draw_days, rememberRemainingPeriod.getDays(), Arrays.copyOf(new Object[]{Integer.valueOf(rememberRemainingPeriod.getDays())}, 1)), null, u11, 0, 2);
                u11.k();
            } else {
                u11.o(58012733);
                C5179b.i n11 = C5179b.n(2);
                d.b i13 = InterfaceC6250b.a.i();
                e.a aVar = e.f40358c0;
                Y b11 = X.b(n11, i13, u11, 54);
                int I11 = u11.I();
                A0 d11 = u11.d();
                e f7 = c.f(u11, aVar);
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
                TimerCell(DateUtilsKt.toTwoDigitString(rememberRemainingPeriod.getHours()), null, u11, 0, 2);
                TimerDelimiter(u11, 0);
                TimerCell(DateUtilsKt.toTwoDigitString(rememberRemainingPeriod.getMinutes()), null, u11, 0, 2);
                TimerDelimiter(u11, 0);
                TimerCell(DateUtilsKt.toTwoDigitString(rememberRemainingPeriod.getSeconds()), null, u11, 0, 2);
                u11.f();
                u11.k();
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new LotteryTicketsPurchaseTimerKt$DateTimer$2(stableDateTime2, function02, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TicketsPurchaseTimer(@NotNull LotteryInformationVI.ActiveMainInfo.TicketsPurchaseTimerData data, e eVar, Function1<? super b, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        Function1<? super b, Unit> function12;
        t tokenizedEvent;
        int I11;
        StableDateTime date;
        Unit unit;
        e eVar3;
        String timerText;
        J0 m02;
        Intrinsics.checkNotNullParameter(data, "data");
        C3969l u11 = interfaceC3967k.u(-1283373513);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(data) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                function12 = function1;
                i13 |= u11.F(function12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                if ((i13 & 147) == 146 || !u11.b()) {
                    e eVar4 = i15 != 0 ? e.f40358c0 : eVar2;
                    if (i14 != 0) {
                        u11.o(-1260577606);
                        Object C11 = u11.C();
                        if (C11 == InterfaceC3967k.a.a()) {
                            C11 = LotteryTicketsPurchaseTimerKt$TicketsPurchaseTimer$1$1.INSTANCE;
                            u11.x(C11);
                        }
                        u11.k();
                        function12 = (Function1) C11;
                    }
                    tokenizedEvent = data.getTokenizedEvent();
                    u11.o(-1260576515);
                    if (tokenizedEvent != null) {
                        AnalyticsKt.AnalyticsViewEventsEffect(tokenizedEvent, u11, 0);
                        Unit unit2 = Unit.f71690a;
                    }
                    u11.k();
                    Y b11 = X.b(C5179b.n(6), InterfaceC6250b.a.i(), u11, 54);
                    I11 = u11.I();
                    A0 d11 = u11.d();
                    e f7 = c.f(u11, eVar4);
                    Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                        u11.H(a11);
                    } else {
                        u11.e();
                    }
                    Function2 h11 = Cm.e.h(u11, b11, u11, d11);
                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                        a.d(I11, u11, I11, h11);
                    }
                    F1.b(u11, f7, InterfaceC2801g.a.f());
                    date = data.getDate();
                    u11.o(-637515114);
                    if (date == null) {
                        unit = null;
                    } else {
                        u11.o(-1636083935);
                        boolean z11 = ((i13 & 896) == 256) | ((i13 & 14) == 4);
                        Object C12 = u11.C();
                        if (z11 || C12 == InterfaceC3967k.a.a()) {
                            C12 = new LotteryTicketsPurchaseTimerKt$TicketsPurchaseTimer$3$1$1$1(data, function12);
                            u11.x(C12);
                        }
                        u11.k();
                        DateTimer(date, (Function0) C12, u11, 0);
                        unit = Unit.f71690a;
                    }
                    u11.k();
                    u11.o(-637515374);
                    if (unit == null && (timerText = data.getTimerText()) != null) {
                        TimerCell(timerText, null, u11, 0, 2);
                    }
                    u11.k();
                    CustomTextAtomKt.CustomTextAtom(data.getText(), RegularDrawTypographyKt.getText_12_14_W500(), e.f40358c0, u11, 384, 0);
                    u11.f();
                    eVar3 = eVar4;
                } else {
                    u11.j();
                    eVar3 = eVar2;
                }
                Function1<? super b, Unit> function13 = function12;
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new LotteryTicketsPurchaseTimerKt$TicketsPurchaseTimer$4(data, eVar3, function13, i11, i12));
                    return;
                }
                return;
            }
            function12 = function1;
            if ((i13 & 147) == 146) {
            }
            if (i15 != 0) {
            }
            if (i14 != 0) {
            }
            tokenizedEvent = data.getTokenizedEvent();
            u11.o(-1260576515);
            if (tokenizedEvent != null) {
            }
            u11.k();
            Y b112 = X.b(C5179b.n(6), InterfaceC6250b.a.i(), u11, 54);
            I11 = u11.I();
            A0 d112 = u11.d();
            e f72 = c.f(u11, eVar4);
            Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 h112 = Cm.e.h(u11, b112, u11, d112);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, h112);
            F1.b(u11, f72, InterfaceC2801g.a.f());
            date = data.getDate();
            u11.o(-637515114);
            if (date == null) {
            }
            u11.k();
            u11.o(-637515374);
            if (unit == null) {
                TimerCell(timerText, null, u11, 0, 2);
            }
            u11.k();
            CustomTextAtomKt.CustomTextAtom(data.getText(), RegularDrawTypographyKt.getText_12_14_W500(), e.f40358c0, u11, 384, 0);
            u11.f();
            eVar3 = eVar4;
            Function1<? super b, Unit> function132 = function12;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        function12 = function1;
        if ((i13 & 147) == 146) {
        }
        if (i15 != 0) {
        }
        if (i14 != 0) {
        }
        tokenizedEvent = data.getTokenizedEvent();
        u11.o(-1260576515);
        if (tokenizedEvent != null) {
        }
        u11.k();
        Y b1122 = X.b(C5179b.n(6), InterfaceC6250b.a.i(), u11, 54);
        I11 = u11.I();
        A0 d1122 = u11.d();
        e f722 = c.f(u11, eVar4);
        Function0 a1122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 h1122 = Cm.e.h(u11, b1122, u11, d1122);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, h1122);
        F1.b(u11, f722, InterfaceC2801g.a.f());
        date = data.getDate();
        u11.o(-637515114);
        if (date == null) {
        }
        u11.k();
        u11.o(-637515374);
        if (unit == null) {
        }
        u11.k();
        CustomTextAtomKt.CustomTextAtom(data.getText(), RegularDrawTypographyKt.getText_12_14_W500(), e.f40358c0, u11, 384, 0);
        u11.f();
        eVar3 = eVar4;
        Function1<? super b, Unit> function1322 = function12;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TimerCell(String str, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int I11;
        C3969l c3969l;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-616411776);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = i11 | (u11.n(str) ? 4 : 2);
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            if ((i13 & 19) == 18 || !u11.b()) {
                e eVar3 = i14 == 0 ? e.f40358c0 : eVar2;
                Z1.d dVar = (Z1.d) u11.m(K0.e());
                e t2 = a0.t(a0.i(T.g(androidx.compose.foundation.e.b(eVar3, UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getClearLightKey300(), A0.h.b(8)), 5, 4), dVar.u1() * 20), dVar.u1() * 26, 0.0f, 2);
                V f7 = C5185h.f(InterfaceC6250b.a.e(), false);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f11 = c.f(u11, t2);
                Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a11);
                }
                Function2 f12 = E.f(u11, f7, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, f12);
                }
                F1.b(u11, f11, InterfaceC2801g.a.f());
                c3969l = u11;
                u3.b(str, M.b(eVar3, EnumC9909s.Min), G1.b.a(u11, R$color.lottery_information_main_info_timer_cell_text_color), 0L, null, 0L, V1.h.a(3), 0L, 0, false, 0, 0, null, RegularDrawTypographyKt.getText_20_20_W500(), c3969l, i13 & 14, 0, 65016);
                c3969l.f();
                eVar2 = eVar3;
            } else {
                u11.j();
                c3969l = u11;
            }
            m02 = c3969l.m0();
            if (m02 == null) {
                m02.G(new LotteryTicketsPurchaseTimerKt$TimerCell$2(str, eVar2, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i13 & 19) == 18) {
        }
        if (i14 == 0) {
        }
        Z1.d dVar2 = (Z1.d) u11.m(K0.e());
        e t22 = a0.t(a0.i(T.g(androidx.compose.foundation.e.b(eVar3, UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getClearLightKey300(), A0.h.b(8)), 5, 4), dVar2.u1() * 20), dVar2.u1() * 26, 0.0f, 2);
        V f72 = C5185h.f(InterfaceC6250b.a.e(), false);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f112 = c.f(u11, t22);
        Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f122 = E.f(u11, f72, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f122);
        F1.b(u11, f112, InterfaceC2801g.a.f());
        c3969l = u11;
        u3.b(str, M.b(eVar3, EnumC9909s.Min), G1.b.a(u11, R$color.lottery_information_main_info_timer_cell_text_color), 0L, null, 0L, V1.h.a(3), 0L, 0, false, 0, 0, null, RegularDrawTypographyKt.getText_20_20_W500(), c3969l, i13 & 14, 0, 65016);
        c3969l.f();
        eVar2 = eVar3;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TimerDelimiter(InterfaceC3967k interfaceC3967k, int i11) {
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(744384299);
        if (i11 == 0 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            c3969l = u11;
            u3.b(ProductContainerDTO.RATIO_DELIMITER, null, G1.b.a(u11, R$color.lottery_information_main_info_timer_delimiter_text_color), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, RegularDrawTypographyKt.getText_16_20_W500(), c3969l, 6, 0, 65530);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new LotteryTicketsPurchaseTimerKt$TimerDelimiter$1(i11));
        }
    }
}
