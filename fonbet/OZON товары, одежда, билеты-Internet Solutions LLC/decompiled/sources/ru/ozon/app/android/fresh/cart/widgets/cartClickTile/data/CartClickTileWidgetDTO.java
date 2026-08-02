package ru.ozon.app.android.fresh.cart.widgets.cartClickTile.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.molecules.cartClickTile.data.CartClickTileDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartClickTile/data/CartClickTileWidgetDTO;", "", "cartClickTile", "Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/data/CartClickTileDTO;", "<init>", "(Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/data/CartClickTileDTO;)V", "getCartClickTile", "()Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/data/CartClickTileDTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CartClickTileWidgetDTO {
    public static final int $stable = 8;

    @NotNull
    private final CartClickTileDTO cartClickTile;

    public CartClickTileWidgetDTO(@NotNull CartClickTileDTO cartClickTile) {
        Intrinsics.checkNotNullParameter(cartClickTile, "cartClickTile");
        this.cartClickTile = cartClickTile;
    }

    public static /* synthetic */ CartClickTileWidgetDTO copy$default(CartClickTileWidgetDTO cartClickTileWidgetDTO, CartClickTileDTO cartClickTileDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cartClickTileDTO = cartClickTileWidgetDTO.cartClickTile;
        }
        return cartClickTileWidgetDTO.copy(cartClickTileDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CartClickTileDTO getCartClickTile() {
        return this.cartClickTile;
    }

    @NotNull
    public final CartClickTileWidgetDTO copy(@NotNull CartClickTileDTO cartClickTile) {
        Intrinsics.checkNotNullParameter(cartClickTile, "cartClickTile");
        return new CartClickTileWidgetDTO(cartClickTile);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CartClickTileWidgetDTO) && Intrinsics.d(this.cartClickTile, ((CartClickTileWidgetDTO) other).cartClickTile);
    }

    @NotNull
    public final CartClickTileDTO getCartClickTile() {
        return this.cartClickTile;
    }

    public int hashCode() {
        return this.cartClickTile.hashCode();
    }

    @NotNull
    public String toString() {
        return "CartClickTileWidgetDTO(cartClickTile=" + this.cartClickTile + ")";
    }
}
