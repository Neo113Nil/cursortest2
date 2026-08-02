package ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.item;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerVO;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.CartTileVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "cartPickerVO", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CartTileItemViewHolder$bind$2 extends AbstractC7737t implements Function1<CartPickerVO, Unit> {
    final /* synthetic */ CartTileVO.TileItem $item;
    final /* synthetic */ Function1<CartTileVO.TileItem, Unit> $tileUpdateCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CartTileItemViewHolder$bind$2(CartTileVO.TileItem tileItem, Function1<? super CartTileVO.TileItem, Unit> function1) {
        super(1);
        this.$item = tileItem;
        this.$tileUpdateCallback = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CartPickerVO cartPickerVO) {
        invoke2(cartPickerVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CartPickerVO cartPickerVO) {
        CartTileVO.TileItem tileItem;
        Intrinsics.checkNotNullParameter(cartPickerVO, "cartPickerVO");
        if (this.$item.getTileControl() instanceof CartTileVO.TileItem.TileControl.AvailableControl) {
            CartTileVO.TileItem tileItem2 = this.$item;
            tileItem = CartTileVO.TileItem.copy$default(tileItem2, 0L, null, null, ((CartTileVO.TileItem.TileControl.AvailableControl) tileItem2.getTileControl()).copy(cartPickerVO), null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, 16777207, null);
        } else {
            tileItem = this.$item;
        }
        this.$tileUpdateCallback.invoke(tileItem);
    }
}
