package ru.ozon.app.android.cart.domain;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.common.data.CartAddItemDTO;
import ru.ozon.app.android.cart.common.data.CartAddItemResponse;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class CartManagerImpl$addProducts$4 extends C7735q implements Function1<CartAddItemResponse, CartAddItemDTO> {
    CartManagerImpl$addProducts$4(Object obj) {
        super(1, obj, CartManagerImpl.class, "mapAddToCart", "mapAddToCart(Lru/ozon/app/android/cart/common/data/CartAddItemResponse;)Lru/ozon/app/android/cart/common/data/CartAddItemDTO;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CartAddItemDTO invoke(CartAddItemResponse p02) {
        CartAddItemDTO mapAddToCart;
        Intrinsics.checkNotNullParameter(p02, "p0");
        mapAddToCart = ((CartManagerImpl) this.receiver).mapAddToCart(p02);
        return mapAddToCart;
    }
}
