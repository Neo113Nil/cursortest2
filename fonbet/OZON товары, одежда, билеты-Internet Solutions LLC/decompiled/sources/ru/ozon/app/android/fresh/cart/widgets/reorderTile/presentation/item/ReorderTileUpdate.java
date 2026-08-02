package ru.ozon.app.android.fresh.cart.widgets.reorderTile.presentation.item;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.cart.widgets.reorderTile.presentation.ReorderTileVO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/item/ReorderTileUpdate;", "LA00/a$J$a;", "", "position", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem;", "tile", "<init>", "(ILru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPosition", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem;", "getTile", "()Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ReorderTileUpdate implements a.J.InterfaceC0007a {
    private final int position;

    @NotNull
    private final ReorderTileVO.TileItem tile;

    public ReorderTileUpdate(int i11, @NotNull ReorderTileVO.TileItem tile) {
        Intrinsics.checkNotNullParameter(tile, "tile");
        this.position = i11;
        this.tile = tile;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReorderTileUpdate)) {
            return false;
        }
        ReorderTileUpdate reorderTileUpdate = (ReorderTileUpdate) other;
        return this.position == reorderTileUpdate.position && Intrinsics.d(this.tile, reorderTileUpdate.tile);
    }

    public final int getPosition() {
        return this.position;
    }

    @NotNull
    public final ReorderTileVO.TileItem getTile() {
        return this.tile;
    }

    public int hashCode() {
        return this.tile.hashCode() + (Integer.hashCode(this.position) * 31);
    }

    @NotNull
    public String toString() {
        return "ReorderTileUpdate(position=" + this.position + ", tile=" + this.tile + ")";
    }
}
