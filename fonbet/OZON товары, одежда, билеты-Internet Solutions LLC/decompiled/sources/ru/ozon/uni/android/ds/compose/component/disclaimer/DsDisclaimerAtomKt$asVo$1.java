package ru.ozon.uni.android.ds.compose.component.disclaimer;

import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class DsDisclaimerAtomKt$asVo$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ boolean $hasIcon;
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;
    final /* synthetic */ DisclaimerDTO.MainButton $this_asVo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DsDisclaimerAtomKt$asVo$1(DisclaimerDTO.MainButton mainButton, boolean z11, Function1<? super AtomAction, Unit> function1) {
        super(2);
        this.$this_asVo = mainButton;
        this.$hasIcon = z11;
        this.$onAction = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        DsDisclaimerButtonStyle mainButtonStyle;
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        mainButtonStyle = DsDisclaimerAtomKt.getMainButtonStyle(this.$this_asVo.getTheme(), this.$this_asVo.getCustomTheme(), interfaceC3967k, 0);
        e j11 = this.$hasIcon ? e.f40358c0 : T.j(e.f40358c0, DsSpacings.INSTANCE.m1854getDp4D9Ej5fM(), 0.0f, 0.0f, 0.0f, 14);
        String title = this.$this_asVo.getTitle();
        ButtonV3DTO buttonV3DTO = new ButtonV3DTO(ButtonV3DTO.StyleTypes.CUSTOM, ButtonV3DTO.Sizes.SIZE_400, title, null, null, null, null, mainButtonStyle.getTextColor().getId(), null, null, null, null, mainButtonStyle.getBackgroundColor().getId(), this.$this_asVo.getCommon(), null, null, null, null, 249720, null);
        CommonControlSettings common = this.$this_asVo.getCommon();
        Function1 function1 = null;
        AtomAction atomAction = common != null ? common.toAtomAction() : null;
        interfaceC3967k.o(-459835097);
        if (atomAction != null) {
            Function1<AtomAction, Unit> function12 = this.$onAction;
            interfaceC3967k.o(1412585822);
            boolean n11 = interfaceC3967k.n(function12);
            Object C11 = interfaceC3967k.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new DsDisclaimerAtomKt$asVo$1$1$1$1(function12);
                interfaceC3967k.x(C11);
            }
            function1 = (Function1) C11;
            interfaceC3967k.k();
        }
        interfaceC3967k.k();
        DsButtonAtomKt.DsButtonAtom(buttonV3DTO, j11, false, function1, interfaceC3967k, 0, 4);
    }
}
