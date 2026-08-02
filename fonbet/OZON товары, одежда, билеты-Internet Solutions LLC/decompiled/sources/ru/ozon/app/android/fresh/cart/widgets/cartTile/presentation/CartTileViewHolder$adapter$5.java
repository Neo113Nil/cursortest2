package ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.CartTileVO;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.item.CartTileRemoveTile;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "tile", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CartTileViewHolder$adapter$5 extends AbstractC7737t implements Function1<CartTileVO.TileItem, Unit> {
    final /* synthetic */ ComposerReferences $refs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartTileViewHolder$adapter$5(ComposerReferences composerReferences) {
        super(1);
        this.$refs = composerReferences;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CartTileVO.TileItem tileItem) {
        invoke2(tileItem);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CartTileVO.TileItem tile) {
        Intrinsics.checkNotNullParameter(tile, "tile");
        this.$refs.getController().update(new CartTileRemoveTile(tile));
    }
}
