package ru.ozon.app.android.cart.common.domain;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cart/common/domain/FreshAddToCartRetryHandler;", "", "<init>", "()V", "addressPopUpProducts", "", "Lru/ozon/app/android/cart/common/domain/AddressPopUpProduct;", "saveAddressPopUpProducts", "", "products", "getAddressPopUpProducts", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FreshAddToCartRetryHandler {

    @NotNull
    private List<AddressPopUpProduct> addressPopUpProducts = K.f71697a;

    @NotNull
    public final List<AddressPopUpProduct> getAddressPopUpProducts() {
        return this.addressPopUpProducts;
    }

    public final void saveAddressPopUpProducts(@NotNull List<AddressPopUpProduct> products) {
        Intrinsics.checkNotNullParameter(products, "products");
        this.addressPopUpProducts = products;
    }
}
