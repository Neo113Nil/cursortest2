package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.view;

import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import d2.C6041S;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.ds.compose.component.tooltip.DsTooltipAtomKt;
import ru.ozon.uni.atoms.data.common.TooltipDTO;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ e $animatedModifier;
    final /* synthetic */ Function0<Unit> $onCloseClick;
    final /* synthetic */ Function0<Unit> $onDismissRequest;
    final /* synthetic */ AndroidViewTooltipPositionProvider $positionProvider;
    final /* synthetic */ C6041S $properties;
    final /* synthetic */ TooltipDTO $tooltip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$3(TooltipDTO tooltipDTO, e eVar, AndroidViewTooltipPositionProvider androidViewTooltipPositionProvider, C6041S c6041s, Function0<Unit> function0, Function0<Unit> function02) {
        super(2);
        this.$tooltip = tooltipDTO;
        this.$animatedModifier = eVar;
        this.$positionProvider = androidViewTooltipPositionProvider;
        this.$properties = c6041s;
        this.$onDismissRequest = function0;
        this.$onCloseClick = function02;
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
        TooltipDTO tooltipDTO = this.$tooltip;
        e eVar = this.$animatedModifier;
        AndroidViewTooltipPositionProvider androidViewTooltipPositionProvider = this.$positionProvider;
        DsTooltipAtomKt.DsTooltipAtom(tooltipDTO, eVar, androidViewTooltipPositionProvider, androidViewTooltipPositionProvider.getBeakOffset(), this.$properties, this.$onDismissRequest, this.$onCloseClick, interfaceC3967k, TooltipDTO.$stable, 0);
    }
}
