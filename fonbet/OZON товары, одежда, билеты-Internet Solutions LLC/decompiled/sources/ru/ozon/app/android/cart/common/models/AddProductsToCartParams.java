package ru.ozon.app.android.cart.common.models;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartType;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/cart/common/models/AddProductsToCartParams;", "", "", "", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "items", "versionId", "Lru/ozon/app/android/cart/common/domain/CartType;", "cartType", "<init>", "(Ljava/util/Map;Ljava/lang/Long;Lru/ozon/app/android/cart/common/domain/CartType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getItems", "()Ljava/util/Map;", "Ljava/lang/Long;", "getVersionId", "()Ljava/lang/Long;", "Lru/ozon/app/android/cart/common/domain/CartType;", "getCartType", "()Lru/ozon/app/android/cart/common/domain/CartType;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AddProductsToCartParams {

    @NotNull
    private final CartType cartType;

    @NotNull
    private final Map<Long, CartItemInfo> items;
    private final Long versionId;

    public AddProductsToCartParams(@NotNull Map<Long, CartItemInfo> items, Long l11, @NotNull CartType cartType) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(cartType, "cartType");
        this.items = items;
        this.versionId = l11;
        this.cartType = cartType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddProductsToCartParams)) {
            return false;
        }
        AddProductsToCartParams addProductsToCartParams = (AddProductsToCartParams) other;
        return Intrinsics.d(this.items, addProductsToCartParams.items) && Intrinsics.d(this.versionId, addProductsToCartParams.versionId) && this.cartType == addProductsToCartParams.cartType;
    }

    @NotNull
    public final CartType getCartType() {
        return this.cartType;
    }

    @NotNull
    public final Map<Long, CartItemInfo> getItems() {
        return this.items;
    }

    public final Long getVersionId() {
        return this.versionId;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        Long l11 = this.versionId;
        return this.cartType.hashCode() + ((hashCode + (l11 == null ? 0 : l11.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "AddProductsToCartParams(items=" + this.items + ", versionId=" + this.versionId + ", cartType=" + this.cartType + ")";
    }

    public /* synthetic */ AddProductsToCartParams(Map map, Long l11, CartType cartType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i11 & 2) != 0 ? null : l11, (i11 & 4) != 0 ? CartType.MAIN_CART : cartType);
    }
}
