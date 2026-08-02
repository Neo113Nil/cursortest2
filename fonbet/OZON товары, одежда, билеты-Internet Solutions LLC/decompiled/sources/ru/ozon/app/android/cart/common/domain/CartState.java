package ru.ozon.app.android.cart.common.domain;

import Pk0.c;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.local.CartSource;
import ru.ozon.app.android.cart.common.models.CartItemInfo;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b*\u0010 R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b+\u0010 R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R\u0011\u00100\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b/\u0010\u001a¨\u00061"}, d2 = {"Lru/ozon/app/android/cart/common/domain/CartState;", "", "", "", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "items", "actionVersionId", "Lru/ozon/app/android/cart/common/domain/local/CartSource;", "source", "Lru/ozon/app/android/cart/common/domain/CartChangeSource;", "changeReason", "changedItems", "originalItems", "Lru/ozon/app/android/cart/common/domain/CartType;", "cartType", "<init>", "(Ljava/util/Map;JLru/ozon/app/android/cart/common/domain/local/CartSource;Lru/ozon/app/android/cart/common/domain/CartChangeSource;Ljava/util/Map;Ljava/util/Map;Lru/ozon/app/android/cart/common/domain/CartType;)V", "productId", "", "hasProduct", "(J)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getItems", "()Ljava/util/Map;", "J", "getActionVersionId", "()J", "Lru/ozon/app/android/cart/common/domain/local/CartSource;", "getSource", "()Lru/ozon/app/android/cart/common/domain/local/CartSource;", "Lru/ozon/app/android/cart/common/domain/CartChangeSource;", "getChangeReason", "()Lru/ozon/app/android/cart/common/domain/CartChangeSource;", "getChangedItems", "getOriginalItems", "Lru/ozon/app/android/cart/common/domain/CartType;", "getCartType", "()Lru/ozon/app/android/cart/common/domain/CartType;", "getTotalCount", "totalCount", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CartState {
    private final long actionVersionId;

    @NotNull
    private final CartType cartType;
    private final CartChangeSource changeReason;

    @NotNull
    private final Map<Long, CartItemInfo> changedItems;

    @NotNull
    private final Map<Long, CartItemInfo> items;

    @NotNull
    private final Map<Long, CartItemInfo> originalItems;

    @NotNull
    private final CartSource source;

    public CartState() {
        this(null, 0L, null, null, null, null, null, 127, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartState)) {
            return false;
        }
        CartState cartState = (CartState) other;
        return Intrinsics.d(this.items, cartState.items) && this.actionVersionId == cartState.actionVersionId && this.source == cartState.source && this.changeReason == cartState.changeReason && Intrinsics.d(this.changedItems, cartState.changedItems) && Intrinsics.d(this.originalItems, cartState.originalItems) && this.cartType == cartState.cartType;
    }

    public final long getActionVersionId() {
        return this.actionVersionId;
    }

    @NotNull
    public final CartType getCartType() {
        return this.cartType;
    }

    public final CartChangeSource getChangeReason() {
        return this.changeReason;
    }

    @NotNull
    public final Map<Long, CartItemInfo> getItems() {
        return this.items;
    }

    @NotNull
    public final Map<Long, CartItemInfo> getOriginalItems() {
        return this.originalItems;
    }

    @NotNull
    public final CartSource getSource() {
        return this.source;
    }

    public final int getTotalCount() {
        Iterator<T> it = this.items.values().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += ((CartItemInfo) it.next()).getQuantity();
        }
        return i11;
    }

    public final boolean hasProduct(long productId) {
        CartItemInfo cartItemInfo = this.items.get(Long.valueOf(productId));
        return (cartItemInfo == null || cartItemInfo.getQuantity() == 0) ? false : true;
    }

    public int hashCode() {
        int hashCode = (this.source.hashCode() + c.a(this.items.hashCode() * 31, 31, this.actionVersionId)) * 31;
        CartChangeSource cartChangeSource = this.changeReason;
        return this.cartType.hashCode() + D40.c.a(this.originalItems, D40.c.a(this.changedItems, (hashCode + (cartChangeSource == null ? 0 : cartChangeSource.hashCode())) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "CartState(items=" + this.items + ", actionVersionId=" + this.actionVersionId + ", source=" + this.source + ", changeReason=" + this.changeReason + ", changedItems=" + this.changedItems + ", originalItems=" + this.originalItems + ", cartType=" + this.cartType + ")";
    }

    public CartState(@NotNull Map<Long, CartItemInfo> items, long j11, @NotNull CartSource source, CartChangeSource cartChangeSource, @NotNull Map<Long, CartItemInfo> changedItems, @NotNull Map<Long, CartItemInfo> originalItems, @NotNull CartType cartType) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(changedItems, "changedItems");
        Intrinsics.checkNotNullParameter(originalItems, "originalItems");
        Intrinsics.checkNotNullParameter(cartType, "cartType");
        this.items = items;
        this.actionVersionId = j11;
        this.source = source;
        this.changeReason = cartChangeSource;
        this.changedItems = changedItems;
        this.originalItems = originalItems;
        this.cartType = cartType;
    }

    public /* synthetic */ CartState(Map map, long j11, CartSource cartSource, CartChangeSource cartChangeSource, Map map2, Map map3, CartType cartType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? U.c() : map, (i11 & 2) != 0 ? Long.MIN_VALUE : j11, (i11 & 4) != 0 ? CartSource.LOCAL : cartSource, (i11 & 8) != 0 ? null : cartChangeSource, (i11 & 16) != 0 ? U.c() : map2, (i11 & 32) != 0 ? U.c() : map3, (i11 & 64) != 0 ? CartType.MAIN_CART : cartType);
    }
}
