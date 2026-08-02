package ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.item;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.CartTileVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$SwipeTileState;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CartTileItemViewHolder$bind$3 extends AbstractC7737t implements Function1<CartTileVO.TileItem.SwipeTileState, Unit> {
    final /* synthetic */ CartTileVO.TileItem $item;
    final /* synthetic */ Function2<CartTileVO.TileItem, CartTileVO.TileItem.SwipeTileState, Unit> $onStateChanged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CartTileItemViewHolder$bind$3(Function2<? super CartTileVO.TileItem, ? super CartTileVO.TileItem.SwipeTileState, Unit> function2, CartTileVO.TileItem tileItem) {
        super(1);
        this.$onStateChanged = function2;
        this.$item = tileItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CartTileVO.TileItem.SwipeTileState swipeTileState) {
        invoke2(swipeTileState);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CartTileVO.TileItem.SwipeTileState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.$onStateChanged.invoke(this.$item, state);
    }
}
