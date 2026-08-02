package ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.item;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.CartTileVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class CartTileItemAdapter$onBindViewHolder$4 extends C7735q implements Function1<CartTileVO.TileItem, Unit> {
    CartTileItemAdapter$onBindViewHolder$4(Object obj) {
        super(1, obj, CartTileItemAdapter.class, "removeItem", "removeItem(Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CartTileVO.TileItem tileItem) {
        invoke2(tileItem);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CartTileVO.TileItem p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((CartTileItemAdapter) this.receiver).removeItem(p02);
    }
}
