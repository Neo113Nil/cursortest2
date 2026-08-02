package ru.ozon.uni.android.ds.compose.component.disclaimer;

import P0.E;
import S0.InterfaceC3967k;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.compose.tokens.UniComposeIconTokensKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class DsDisclaimerAtomKt$asVo$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;
    final /* synthetic */ DsDisclaimerStyle $style;
    final /* synthetic */ CommonControlSettings $this_asVo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DsDisclaimerAtomKt$asVo$3(DsDisclaimerStyle dsDisclaimerStyle, e eVar, CommonControlSettings commonControlSettings, Function1<? super AtomAction, Unit> function1) {
        super(2);
        this.$style = dsDisclaimerStyle;
        this.$modifier = eVar;
        this.$this_asVo = commonControlSettings;
        this.$onAction = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        UniTheme.INSTANCE.getIcons();
        interfaceC3967k.B(147133907);
        AbstractC8972b uniPainterResource = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_s_cross_filled_compact, "ic_s_cross_filled_compact", interfaceC3967k, 48);
        interfaceC3967k.K();
        long iconCrossColor = this.$style.getIconCrossColor();
        DsSpacings dsSpacings = DsSpacings.INSTANCE;
        float m1847getDp2D9Ej5fM = dsSpacings.m1847getDp2D9Ej5fM();
        e j11 = T.j(this.$modifier, 0.0f, dsSpacings.m1854getDp4D9Ej5fM(), m1847getDp2D9Ej5fM, 0.0f, 9);
        interfaceC3967k.o(-459770921);
        boolean n11 = interfaceC3967k.n(this.$this_asVo) | interfaceC3967k.n(this.$onAction);
        CommonControlSettings commonControlSettings = this.$this_asVo;
        Function1<AtomAction, Unit> function1 = this.$onAction;
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new DsDisclaimerAtomKt$asVo$3$1$1(commonControlSettings, function1);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        E.a(uniPainterResource, "Close", i.c(j11, false, null, null, (Function0) C11, 7), iconCrossColor, interfaceC3967k, 48);
    }
}
