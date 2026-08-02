package ru.ozon.app.android.regulardraw.widgets.lotteryResult.presentation;

import A0.h;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import G1.b;
import J0.T0;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e1.InterfaceC6250b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.app.android.regulardraw.R$color;
import ru.ozon.app.android.regulardraw.ui.FontScaleKt;
import ru.ozon.app.android.regulardraw.widgets.lotteryResult.presentation.LotteryResultVI;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.compose.tokens.UniComposeIconTokensKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/lotteryResult/presentation/LotteryResultVI$Values;", "values", "Landroidx/compose/ui/e;", "modifier", "", "LotteryValues", "(Lru/ozon/app/android/regulardraw/widgets/lotteryResult/presentation/LotteryResultVI$Values;Landroidx/compose/ui/e;LS0/k;II)V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "SingleValue", "(Ljava/lang/String;Landroidx/compose/ui/e;LS0/k;II)V", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LotteryValuesKt {
    public static final void LotteryValues(@NotNull LotteryResultVI.Values values, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(values, "values");
        C3969l u11 = interfaceC3967k.u(-1669261349);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(values) ? 4 : 2) | i11;
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
            e w11 = a0.w(eVar, InterfaceC6250b.a.k(), true);
            float f7 = 2;
            Y b11 = X.b(C5179b.n(f7), InterfaceC6250b.a.l(), u11, 6);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, w11);
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
            F1.b(u11, f11, InterfaceC2801g.a.f());
            u11.o(-1665557481);
            Iterator<T> it = values.getLeft().iterator();
            while (it.hasNext()) {
                SingleValue((String) it.next(), null, u11, 0, 2);
            }
            u11.k();
            u11.o(-1665555517);
            if (!values.getLeft().isEmpty() && !values.getRight().isEmpty()) {
                e l02 = a0.n(T.h(e.f40358c0, f7, 0.0f, 2), 10).l0(new VerticalAlignElement(InterfaceC6250b.a.i()));
                UniTheme.INSTANCE.getIcons();
                u11.B(448266119);
                AbstractC8972b uniPainterResource = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_s_plus_sign_filled, "ic_s_plus_sign_filled", u11, 48);
                u11.K();
                T0.a(uniPainterResource, null, l02, b.a(u11, R$color.lottery_result_values_plus_icon_color), u11, 48);
            }
            u11.k();
            u11.o(-1665540297);
            Iterator<T> it2 = values.getRight().iterator();
            while (it2.hasNext()) {
                SingleValue((String) it2.next(), null, u11, 0, 2);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new LotteryValuesKt$LotteryValues$2(values, eVar, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SingleValue(String str, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        C3969l u11 = interfaceC3967k.u(-821955894);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(str) ? 4 : 2) | i11;
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
            e n11 = a0.n(androidx.compose.foundation.e.b(eVar, b.a(u11, R$color.lottery_result_values_background_color), h.e()), 24);
            V f7 = C5185h.f(InterfaceC6250b.a.e(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, n11);
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
            FontScaleKt.FixedFontScale(0.0f, a1.c.c(1410404613, new LotteryValuesKt$SingleValue$1$1(str), u11), u11, 48, 1);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new LotteryValuesKt$SingleValue$2(str, eVar, i11, i12));
        }
    }
}
