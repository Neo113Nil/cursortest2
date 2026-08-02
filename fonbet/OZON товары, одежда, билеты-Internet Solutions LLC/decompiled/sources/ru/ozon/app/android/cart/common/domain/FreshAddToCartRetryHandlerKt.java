package ru.ozon.app.android.cart.common.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.models.CartItemInfo;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¨\u0006\u0006"}, d2 = {"mapItemsToProducts", "", "Lru/ozon/app/android/cart/common/domain/AddressPopUpProduct;", "", "", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FreshAddToCartRetryHandlerKt {
    @NotNull
    public static final List<AddressPopUpProduct> mapItemsToProducts(Map<Long, CartItemInfo> map) {
        ArrayList arrayList;
        if (map != null) {
            arrayList = new ArrayList(map.size());
            for (Map.Entry<Long, CartItemInfo> entry : map.entrySet()) {
                arrayList.add(new AddressPopUpProduct(entry.getKey().longValue(), entry.getValue().getQuantity(), entry.getValue().getSelectedDeliverySchema()));
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? K.f71697a : arrayList;
    }
}
