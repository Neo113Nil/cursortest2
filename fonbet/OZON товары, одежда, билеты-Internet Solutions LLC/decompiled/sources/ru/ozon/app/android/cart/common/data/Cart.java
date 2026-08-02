package ru.ozon.app.android.cart.common.data;

import Ak.C2436a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/cart/common/data/Cart;", "", "cartItems", "", "Lru/ozon/app/android/cart/common/data/CartItemResponse;", "cartItemsFamily", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getCartItems", "()Ljava/util/List;", "getCartItemsFamily", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Cart {

    @NotNull
    private final List<CartItemResponse> cartItems;
    private final List<CartItemResponse> cartItemsFamily;

    public Cart(@NotNull List<CartItemResponse> cartItems, List<CartItemResponse> list) {
        Intrinsics.checkNotNullParameter(cartItems, "cartItems");
        this.cartItems = cartItems;
        this.cartItemsFamily = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cart copy$default(Cart cart, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = cart.cartItems;
        }
        if ((i11 & 2) != 0) {
            list2 = cart.cartItemsFamily;
        }
        return cart.copy(list, list2);
    }

    @NotNull
    public final List<CartItemResponse> component1() {
        return this.cartItems;
    }

    public final List<CartItemResponse> component2() {
        return this.cartItemsFamily;
    }

    @NotNull
    public final Cart copy(@NotNull List<CartItemResponse> cartItems, List<CartItemResponse> cartItemsFamily) {
        Intrinsics.checkNotNullParameter(cartItems, "cartItems");
        return new Cart(cartItems, cartItemsFamily);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cart)) {
            return false;
        }
        Cart cart = (Cart) other;
        return Intrinsics.d(this.cartItems, cart.cartItems) && Intrinsics.d(this.cartItemsFamily, cart.cartItemsFamily);
    }

    @NotNull
    public final List<CartItemResponse> getCartItems() {
        return this.cartItems;
    }

    public final List<CartItemResponse> getCartItemsFamily() {
        return this.cartItemsFamily;
    }

    public int hashCode() {
        int hashCode = this.cartItems.hashCode() * 31;
        List<CartItemResponse> list = this.cartItemsFamily;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return C2436a.b("Cart(cartItems=", this.cartItems, ", cartItemsFamily=", ")", this.cartItemsFamily);
    }
}
