package ru.ozon.app.android.regulardraw.widgets.lotteryResult.presentation;

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
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.compose.time.StableDateTime;
import ru.ozon.app.android.regulardraw.R$color;
import ru.ozon.app.android.regulardraw.ui.styles.RegularDrawTypographyKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdp/ui/compose/time/StableDateTime;", "date", "Landroidx/compose/ui/e;", "modifier", "", "LotteryDate", "(Lru/ozon/app/android/pdp/ui/compose/time/StableDateTime;Landroidx/compose/ui/e;LS0/k;II)V", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LotteryDateKt {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LotteryDate(@NotNull StableDateTime date, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        int I11;
        boolean z11;
        Object C11;
        C3969l c3969l;
        J0 m02;
        Intrinsics.checkNotNullParameter(date, "date");
        C3969l u11 = interfaceC3967k.u(-1220808889);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(date) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            i14 = i13;
            if ((i14 & 19) == 18 || !u11.b()) {
                e eVar3 = i15 == 0 ? e.f40358c0 : eVar2;
                C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f7 = c.f(u11, eVar3);
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
                F1.b(u11, f7, InterfaceC2801g.a.f());
                e eVar4 = eVar3;
                u3.b(String.valueOf(date.getDayOfMonth()), null, G1.b.a(u11, R$color.lottery_result_date_title_color), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, RegularDrawTypographyKt.getText_24_24_W800(), u11, 0, 0, 65530);
                u11.o(-115121678);
                z11 = (i14 & 14) != 4;
                C11 = u11.C();
                if (!z11 || C11 == InterfaceC3967k.a.a()) {
                    String a13 = date.getMonthOfYear().a(new Locale("ru", "RU"));
                    Intrinsics.checkNotNullExpressionValue(a13, "getAsShortText(...)");
                    C11 = h.q0(3, a13).toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(C11, "toLowerCase(...)");
                    u11.x(C11);
                }
                u11.k();
                c3969l = u11;
                u3.b((String) C11, null, G1.b.a(u11, R$color.lottery_result_date_subtitle_color), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, RegularDrawTypographyKt.getText_14_16_W500(), c3969l, 0, 0, 65530);
                c3969l.f();
                eVar2 = eVar4;
            } else {
                u11.j();
                c3969l = u11;
            }
            m02 = c3969l.m0();
            if (m02 == null) {
                m02.G(new LotteryDateKt$LotteryDate$2(date, eVar2, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        i14 = i13;
        if ((i14 & 19) == 18) {
        }
        if (i15 == 0) {
        }
        C5194q a112 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f72 = c.f(u11, eVar3);
        Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g102 = b.g(u11, a112, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, g102);
        F1.b(u11, f72, InterfaceC2801g.a.f());
        e eVar42 = eVar3;
        u3.b(String.valueOf(date.getDayOfMonth()), null, G1.b.a(u11, R$color.lottery_result_date_title_color), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, RegularDrawTypographyKt.getText_24_24_W800(), u11, 0, 0, 65530);
        u11.o(-115121678);
        if ((i14 & 14) != 4) {
        }
        C11 = u11.C();
        if (!z11) {
        }
        String a132 = date.getMonthOfYear().a(new Locale("ru", "RU"));
        Intrinsics.checkNotNullExpressionValue(a132, "getAsShortText(...)");
        C11 = h.q0(3, a132).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(C11, "toLowerCase(...)");
        u11.x(C11);
        u11.k();
        c3969l = u11;
        u3.b((String) C11, null, G1.b.a(u11, R$color.lottery_result_date_subtitle_color), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, RegularDrawTypographyKt.getText_14_16_W500(), c3969l, 0, 0, 65530);
        c3969l.f();
        eVar2 = eVar42;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }
}
