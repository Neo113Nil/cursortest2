package ru.ozon.app.android.fresh.cart.widgets.cartControls.presentation;

import WZ.l;
import WZ.m;
import WZ.t;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipHelper;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipVO;
import ru.ozon.app.android.fresh.cart.R$id;
import ru.ozon.app.android.fresh.cart.widgets.cartControls.presentation.CartControlsVO;
import ru.ozon.app.android.fresh.cart.widgets.cartControls.presentation.CartControlsViewController;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CartControlsViewController$checkTooltip$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ CartControlsVO.TooltipData $tooltipData;
    final /* synthetic */ CartControlsViewController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartControlsViewController$checkTooltip$1(CartControlsViewController cartControlsViewController, CartControlsVO.TooltipData tooltipData) {
        super(0);
        this.this$0 = cartControlsViewController;
        this.$tooltipData = tooltipData;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        CartTooltipHelper cartTooltipHelper;
        CartControlsView cartControlsView;
        CartControlsViewController.Companion companion;
        l lVar;
        cartTooltipHelper = this.this$0.tooltipHelper;
        CartTooltipVO tooltip = this.$tooltipData.getTooltip();
        cartControlsView = this.this$0.containerView;
        View findViewById = cartControlsView.findViewById(R$id.cartControlsMoveItemsButton);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        companion = CartControlsViewController.Companion;
        CartTooltipHelper.onShowTooltip$default(cartTooltipHelper, tooltip, findViewById, companion.getTooltipMargin(), false, 3000L, null, 40, null);
        t tokenizedEvent = this.$tooltipData.getTokenizedEvent();
        if (tokenizedEvent != null) {
            lVar = this.this$0.tokenizedAnalytics;
            m.c(lVar, tokenizedEvent, null);
        }
    }
}
