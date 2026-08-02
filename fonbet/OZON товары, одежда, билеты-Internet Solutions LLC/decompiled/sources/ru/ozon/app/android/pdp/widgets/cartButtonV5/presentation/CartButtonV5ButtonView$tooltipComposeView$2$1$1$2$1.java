package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO;
import ru.ozon.uni.atoms.data.common.TooltipDTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CartButtonV5ButtonView$tooltipComposeView$2$1$1$2$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ CartButtonV5ButtonView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartButtonV5ButtonView$tooltipComposeView$2$1$1$2$1(CartButtonV5ButtonView cartButtonV5ButtonView) {
        super(0);
        this.this$0 = cartButtonV5ButtonView;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        CartButtonV5DTO.CartButton.Button.Tooltip tooltipDto;
        TooltipDTO tooltip;
        CartButtonV5ButtonView cartButtonV5ButtonView = this.this$0;
        tooltipDto = cartButtonV5ButtonView.getTooltipDto();
        cartButtonV5ButtonView.onCloseTooltip((tooltipDto == null || (tooltip = tooltipDto.getTooltip()) == null) ? null : tooltip.getTrackingInfo());
    }
}
