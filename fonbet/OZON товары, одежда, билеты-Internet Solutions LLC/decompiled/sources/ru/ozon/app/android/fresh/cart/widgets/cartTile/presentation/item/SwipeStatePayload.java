package ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.item;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.CartTileVO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/item/SwipeStatePayload;", "", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$SwipeTileState;", "state", "", "animate", "<init>", "(Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$SwipeTileState;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$SwipeTileState;", "getState", "()Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$SwipeTileState;", "Z", "getAnimate", "()Z", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SwipeStatePayload {
    private final boolean animate;

    @NotNull
    private final CartTileVO.TileItem.SwipeTileState state;

    public SwipeStatePayload(@NotNull CartTileVO.TileItem.SwipeTileState state, boolean z11) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        this.animate = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwipeStatePayload)) {
            return false;
        }
        SwipeStatePayload swipeStatePayload = (SwipeStatePayload) other;
        return this.state == swipeStatePayload.state && this.animate == swipeStatePayload.animate;
    }

    public final boolean getAnimate() {
        return this.animate;
    }

    @NotNull
    public final CartTileVO.TileItem.SwipeTileState getState() {
        return this.state;
    }

    public int hashCode() {
        return Boolean.hashCode(this.animate) + (this.state.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "SwipeStatePayload(state=" + this.state + ", animate=" + this.animate + ")";
    }
}
