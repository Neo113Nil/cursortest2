package ru.ozon.uni.ozi.components.navBar.addons;

import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.compose.tokens.UniComposeIconTokensKt;
import ru.ozon.uni.ozi.components.button.OziIconButtonKt;
import ru.ozon.uni.ozi.components.button.presets.OziIconButtonShape;
import ru.ozon.uni.ozi.components.button.presets.size.OziIconButtonSize;
import ru.ozon.uni.ozi.components.button.presets.style.OziIconButtonStyle;
import ru.ozon.uni.ozi.theme.OziTheme;
import t0.q;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class OziNavBarTopStartScope$BackIconButton$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OziNavBarTopStartScope$BackIconButton$2(e eVar, Function0<Unit> function0, boolean z11, q qVar) {
        super(2);
        this.$modifier = eVar;
        this.$onClick = function0;
        this.$enabled = z11;
        this.$interactionSource = qVar;
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
        OziTheme oziTheme = OziTheme.INSTANCE;
        oziTheme.getIcons();
        interfaceC3967k.B(-422861787);
        AbstractC8972b uniPainterResource = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_disclosure_back_filled, "ic_m_disclosure_back_filled", interfaceC3967k, 48);
        interfaceC3967k.K();
        OziIconButtonShape oziIconButtonShape = OziIconButtonShape.Square;
        OziIconButtonStyle.NeutralTransparent neutralTransparent = OziIconButtonStyle.NeutralTransparent.INSTANCE;
        OziIconButtonSize oziIconButtonSize = OziIconButtonSize.Size500;
        OziIconButtonKt.OziIconButton(uniPainterResource, this.$onClick, T.j(this.$modifier, oziTheme.getPaddings().getPadding250(), 0.0f, 0.0f, 0.0f, 14), this.$enabled, oziIconButtonShape, neutralTransparent, oziIconButtonSize, this.$interactionSource, interfaceC3967k, 1794048, 0);
    }
}
