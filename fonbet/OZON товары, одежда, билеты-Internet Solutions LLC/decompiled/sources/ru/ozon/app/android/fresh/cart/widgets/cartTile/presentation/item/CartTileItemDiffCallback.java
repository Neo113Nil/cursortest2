package ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.item;

import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.CartTileVO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/item/CartTileItemDiffCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem;", "<init>", "()V", "oldItem", "newItem", "", "getChangePayload", "(Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem;Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem;)Ljava/lang/Object;", "", "areItemsTheSame", "(Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem;Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem;)Z", "areContentsTheSame", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartTileItemDiffCallback extends i.d<CartTileVO.TileItem> {
    @Override // androidx.recyclerview.widget.i.d
    public boolean areContentsTheSame(@NotNull CartTileVO.TileItem oldItem, @NotNull CartTileVO.TileItem newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.i.d
    public boolean areItemsTheSame(@NotNull CartTileVO.TileItem oldItem, @NotNull CartTileVO.TileItem newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem.getTitle(), newItem.getTitle());
    }

    @Override // androidx.recyclerview.widget.i.d
    public Object getChangePayload(@NotNull CartTileVO.TileItem oldItem, @NotNull CartTileVO.TileItem newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (oldItem.getSwipeState() == newItem.getSwipeState() || !Intrinsics.d(CartTileVO.TileItem.copy$default(oldItem, 0L, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, false, null, newItem.getSwipeState(), null, false, 14680063, null), newItem)) {
            return null;
        }
        return new SwipeStatePayload(newItem.getSwipeState(), true);
    }
}
