package ru.ozon.android.composerCommonViewKit.compose.widget.commondisclaimerv2.presentation;

import B0.C2454a;
import B1.V;
import D1.InterfaceC2801g;
import Nk.a;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import Tg.b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import m3.C8060b;
import ru.ozon.android.composerCommonViewKit.compose.widget.commondisclaimerv2.data.LayoutPaddings;
import ru.ozon.uni.android.ds.compose.component.disclaimer.DsDisclaimerAtomKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class CommonDisclaimerV2Kt$DisclaimerV2$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function1<b, Unit> $onAction;
    final /* synthetic */ CommonDisclaimerV2V0 $vo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CommonDisclaimerV2Kt$DisclaimerV2$1(CommonDisclaimerV2V0 commonDisclaimerV2V0, Function1<? super b, Unit> function1) {
        super(2);
        this.$vo = commonDisclaimerV2V0;
        this.$onAction = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        e b11;
        Paddings paddings;
        Paddings paddings2;
        Paddings bottomPadding;
        Paddings topPadding;
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        e.a aVar = e.f40358c0;
        C7807Z c7807z = TokenParserKt.tokenToColor(this.$vo.getBackgroundColor(), interfaceC3967k, 0);
        interfaceC3967k.o(1161049740);
        long layerFloor1 = c7807z == null ? UniTheme.INSTANCE.getColors(interfaceC3967k, UniTheme.$stable).getLayerFloor1() : c7807z.w();
        interfaceC3967k.k();
        b11 = androidx.compose.foundation.e.b(aVar, layerFloor1, y0.a());
        CommonDisclaimerV2V0 commonDisclaimerV2V0 = this.$vo;
        Function1<b, Unit> function1 = this.$onAction;
        V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
        int I11 = interfaceC3967k.I();
        A0 d11 = interfaceC3967k.d();
        e f11 = c.f(interfaceC3967k, b11);
        InterfaceC2801g.f5440U.getClass();
        Function0 a11 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a11);
        } else {
            interfaceC3967k.e();
        }
        Function2 d12 = C2454a.d(interfaceC3967k, f7, interfaceC3967k, d11);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            a.d(d12, I11, interfaceC3967k, I11);
        }
        F1.b(interfaceC3967k, f11, InterfaceC2801g.a.f());
        DisclaimerDTO disclaimer = commonDisclaimerV2V0.getDisclaimer();
        LayoutPaddings paddings3 = commonDisclaimerV2V0.getPaddings();
        float m1867getDpD9Ej5fM = (paddings3 == null || (topPadding = paddings3.getTopPadding()) == null) ? 0 : topPadding.m1867getDpD9Ej5fM();
        LayoutPaddings paddings4 = commonDisclaimerV2V0.getPaddings();
        float m1867getDpD9Ej5fM2 = (paddings4 == null || (bottomPadding = paddings4.getBottomPadding()) == null) ? 0 : bottomPadding.m1867getDpD9Ej5fM();
        LayoutPaddings paddings5 = commonDisclaimerV2V0.getPaddings();
        if (paddings5 == null || (paddings = paddings5.getLeftPadding()) == null) {
            paddings = Paddings.PADDING_300;
        }
        float m1867getDpD9Ej5fM3 = paddings.m1867getDpD9Ej5fM();
        LayoutPaddings paddings6 = commonDisclaimerV2V0.getPaddings();
        if (paddings6 == null || (paddings2 = paddings6.getRightPadding()) == null) {
            paddings2 = Paddings.PADDING_300;
        }
        DsDisclaimerAtomKt.DsDisclaimerAtom(disclaimer, T.i(aVar, m1867getDpD9Ej5fM3, m1867getDpD9Ej5fM, paddings2.m1867getDpD9Ej5fM(), m1867getDpD9Ej5fM2), function1, interfaceC3967k, DisclaimerDTO.$stable, 0);
        interfaceC3967k.f();
    }
}
