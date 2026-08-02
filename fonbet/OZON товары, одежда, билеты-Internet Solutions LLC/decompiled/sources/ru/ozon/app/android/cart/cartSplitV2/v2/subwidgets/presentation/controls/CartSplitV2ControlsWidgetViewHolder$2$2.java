package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.SwipeViewModel;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CartSplitV2ControlsWidgetViewHolder$2$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ CartSplitV2ControlsWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartSplitV2ControlsWidgetViewHolder$2$2(CartSplitV2ControlsWidgetViewHolder cartSplitV2ControlsWidgetViewHolder) {
        super(0);
        this.this$0 = cartSplitV2ControlsWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SwipeViewModel swipeViewModel;
        String swipeGroupId = this.this$0.getSwipeGroupId();
        if (swipeGroupId != null) {
            swipeViewModel = this.this$0.swipeViewModel;
            swipeViewModel.triggerFavoriteClick(swipeGroupId);
        }
    }
}
