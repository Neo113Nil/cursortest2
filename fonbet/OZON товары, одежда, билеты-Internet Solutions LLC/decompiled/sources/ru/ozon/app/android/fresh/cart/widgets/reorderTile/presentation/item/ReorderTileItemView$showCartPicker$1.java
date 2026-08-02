package ru.ozon.app.android.fresh.cart.widgets.reorderTile.presentation.item;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerVO;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerView;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newCartPickerVO", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ReorderTileItemView$showCartPicker$1 extends AbstractC7737t implements Function1<CartPickerVO, Unit> {
    final /* synthetic */ CartPickerVO $cartPicker;
    final /* synthetic */ ReorderTileItemView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReorderTileItemView$showCartPicker$1(CartPickerVO cartPickerVO, ReorderTileItemView reorderTileItemView) {
        super(1);
        this.$cartPicker = cartPickerVO;
        this.this$0 = reorderTileItemView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CartPickerVO cartPickerVO) {
        invoke2(cartPickerVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CartPickerVO newCartPickerVO) {
        int normalizeQuantity;
        CartPickerView cartPickerView;
        Intrinsics.checkNotNullParameter(newCartPickerVO, "newCartPickerVO");
        int value = newCartPickerVO.getQuantity().getValue();
        int minValue = this.$cartPicker.getQuantity().getMinValue();
        int value2 = this.$cartPicker.getQuantity().getValue();
        normalizeQuantity = this.this$0.normalizeQuantity(value2, value, minValue);
        cartPickerView = this.this$0.cartPickerView;
        cartPickerView.setShouldAnimate(normalizeQuantity == 0 || value2 == 0);
    }
}
