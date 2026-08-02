package ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerBinder;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerVO;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.StickyTotalVO;
import ru.ozon.tracker.model.TrinityEventEntityKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerBinder$CartPickerActionType;", "cartPickerState", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class StickyTotalOverlayViewHolder$bindControlOrGone$1$2 extends AbstractC7737t implements Function2<CartPickerBinder.CartPickerActionType, CartPickerVO, Unit> {
    final /* synthetic */ StickyTotalVO $item;
    final /* synthetic */ StickyTotalVO $this_with;
    final /* synthetic */ StickyTotalOverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StickyTotalOverlayViewHolder$bindControlOrGone$1$2(StickyTotalOverlayViewHolder stickyTotalOverlayViewHolder, StickyTotalVO stickyTotalVO, StickyTotalVO stickyTotalVO2) {
        super(2);
        this.this$0 = stickyTotalOverlayViewHolder;
        this.$item = stickyTotalVO;
        this.$this_with = stickyTotalVO2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(CartPickerBinder.CartPickerActionType cartPickerActionType, CartPickerVO cartPickerVO) {
        invoke2(cartPickerActionType, cartPickerVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CartPickerBinder.CartPickerActionType actionType, CartPickerVO cartPickerState) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(cartPickerState, "cartPickerState");
        this.this$0.handlePickerAction(actionType, cartPickerState, this.$item, (StickyTotalVO.State.Pdp) this.$this_with.getState());
    }
}
