package ru.ozon.app.android.cart.common.domain;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0001¨\u0006\u0007"}, d2 = {"getCartType", "Lru/ozon/app/android/cart/common/domain/CartType;", "", "", "isFamilyCart", "", "isMainCart", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartTypeKt {
    @NotNull
    public static final CartType getCartType(Map<String, String> map) {
        Object obj;
        if (map == null || map.isEmpty()) {
            return CartType.MAIN_CART;
        }
        String str = map.get("cartType");
        Iterator<E> it = CartType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((CartType) obj).getType(), str)) {
                break;
            }
        }
        CartType cartType = (CartType) obj;
        return cartType == null ? CartType.MAIN_CART : cartType;
    }

    public static final boolean isFamilyCart(@NotNull CartType cartType) {
        Intrinsics.checkNotNullParameter(cartType, "<this>");
        return cartType == CartType.FAMILY_CART;
    }

    public static final boolean isMainCart(@NotNull CartType cartType) {
        Intrinsics.checkNotNullParameter(cartType, "<this>");
        return cartType == CartType.MAIN_CART;
    }
}
