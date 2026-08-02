package ru.ozon.app.android.cart.domain;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartChangeSource;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.domain.CartType;
import ru.ozon.app.android.cart.common.domain.local.CartSource;
import ru.ozon.app.android.cart.common.models.CartItemInfo;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001JC\u0010\r\u001a\u00020\f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/cart/domain/CartManager;", "", "", "", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "items", "Lru/ozon/app/android/cart/common/domain/local/CartSource;", "source", "Lru/ozon/app/android/cart/common/domain/CartChangeSource;", "cartChangeSource", "Lru/ozon/app/android/cart/common/domain/CartType;", "cartType", "", "setItems", "(Ljava/util/Map;Lru/ozon/app/android/cart/common/domain/local/CartSource;Lru/ozon/app/android/cart/common/domain/CartChangeSource;Lru/ozon/app/android/cart/common/domain/CartType;)V", "Lru/ozon/app/android/cart/common/domain/CartState;", "getCartStateByCartType", "(Lru/ozon/app/android/cart/common/domain/CartType;)Lru/ozon/app/android/cart/common/domain/CartState;", "clearCart", "(Lru/ozon/app/android/cart/common/domain/CartType;)V", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CartManager {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void clearCart$default(CartManager cartManager, CartType cartType, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearCart");
            }
            if ((i11 & 1) != 0) {
                cartType = CartType.MAIN_CART;
            }
            cartManager.clearCart(cartType);
        }

        public static /* synthetic */ void setItems$default(CartManager cartManager, Map map, CartSource cartSource, CartChangeSource cartChangeSource, CartType cartType, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setItems");
            }
            if ((i11 & 2) != 0) {
                cartSource = CartSource.LOCAL;
            }
            if ((i11 & 4) != 0) {
                cartChangeSource = null;
            }
            if ((i11 & 8) != 0) {
                cartType = CartType.MAIN_CART;
            }
            cartManager.setItems(map, cartSource, cartChangeSource, cartType);
        }
    }

    void clearCart(@NotNull CartType cartType);

    @NotNull
    CartState getCartStateByCartType(@NotNull CartType cartType);

    void setItems(@NotNull Map<Long, CartItemInfo> items, @NotNull CartSource source, CartChangeSource cartChangeSource, @NotNull CartType cartType);
}
