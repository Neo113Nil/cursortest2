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
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class DsDisclaimerAtomKt$asVo$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ boolean $hasIcon;
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;
    final /* synthetic */ DisclaimerDTO.AdditionalButton $this_asVo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DsDisclaimerAtomKt$asVo$2(boolean z11, DisclaimerDTO.AdditionalButton additionalButton, Function1<? super AtomAction, Unit> function1) {
        super(2);
        this.$hasIcon = z11;
        this.$this_asVo = additionalButton;
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
        e j11 = this.$hasIcon ? e.f40358c0 : T.j(e.f40358c0, DsSpacings.INSTANCE.m1854getDp4D9Ej5fM(), 0.0f, 0.0f, 0.0f, 14);
        String title = this.$this_asVo.getTitle();
        ButtonV3DTO.Sizes sizes = ButtonV3DTO.Sizes.SIZE_400;
        UniTheme uniTheme = UniTheme.INSTANCE;
        ButtonV3DTO buttonV3DTO = new ButtonV3DTO(ButtonV3DTO.StyleTypes.CUSTOM, sizes, title, null, null, null, null, uniTheme.getColorTokens().getTextPrimary().getId(), null, null, null, null, uniTheme.getColorTokens().getBgOverlap().getId(), this.$this_asVo.getCommon(), null, null, null, null, 249720, null);
        interfaceC3967k.o(-459787713);
        boolean n11 = interfaceC3967k.n(this.$this_asVo) | interfaceC3967k.n(this.$onAction);
        DisclaimerDTO.AdditionalButton additionalButton = this.$this_asVo;
        Function1<AtomAction, Unit> function1 = this.$onAction;
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new DsDisclaimerAtomKt$asVo$2$1$1(additionalButton, function1);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        DsButtonAtomKt.DsButtonAtom(buttonV3DTO, j11, false, (Function1) C11, interfaceC3967k, 0, 4);
    }
}
