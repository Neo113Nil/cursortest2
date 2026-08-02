package ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.item;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.CartTileVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class CartTileItemAdapter$onBindViewHolder$2 extends C7735q implements Function2<CartTileVO.TileItem, CartTileVO.TileItem.SwipeTileState, Unit> {
    CartTileItemAdapter$onBindViewHolder$2(Object obj) {
        super(2, obj, CartTileItemAdapter.class, "changeSwipeState", "changeSwipeState(Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem;Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$SwipeTileState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(CartTileVO.TileItem tileItem, CartTileVO.TileItem.SwipeTileState swipeTileState) {
        invoke2(tileItem, swipeTileState);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CartTileVO.TileItem p02, CartTileVO.TileItem.SwipeTileState p12) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        ((CartTileItemAdapter) this.receiver).changeSwipeState(p02, p12);
    }
}
