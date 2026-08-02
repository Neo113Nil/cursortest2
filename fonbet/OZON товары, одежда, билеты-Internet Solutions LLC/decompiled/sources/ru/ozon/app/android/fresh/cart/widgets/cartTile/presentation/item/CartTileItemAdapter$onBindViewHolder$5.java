package ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.item;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.CartTileVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "tile", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CartTileItemAdapter$onBindViewHolder$5 extends AbstractC7737t implements Function1<CartTileVO.TileItem, Unit> {
    final /* synthetic */ int $position;
    final /* synthetic */ CartTileItemAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartTileItemAdapter$onBindViewHolder$5(CartTileItemAdapter cartTileItemAdapter, int i11) {
        super(1);
        this.this$0 = cartTileItemAdapter;
        this.$position = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CartTileVO.TileItem tileItem) {
        invoke2(tileItem);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CartTileVO.TileItem tile) {
        List items;
        Function1 function1;
        List items2;
        Intrinsics.checkNotNullParameter(tile, "tile");
        items = this.this$0.getItems();
        if (C7714v.Q(this.$position, items) != null) {
            function1 = this.this$0.tileUpdateCallback;
            items2 = this.this$0.getItems();
            ArrayList W02 = C7714v.W0(items2);
            W02.set(this.$position, tile);
            function1.invoke(W02);
        }
    }
}
