package ru.ozon.app.android.cart.common.models;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/cart/common/models/CartItemInfo;", "", "", "quantity", "", "selectedDeliverySchema", "sortAfterSku", "", "forStars", "wholeQuant", "", "", "params", "<init>", "(ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getQuantity", "Ljava/lang/Long;", "getSelectedDeliverySchema", "()Ljava/lang/Long;", "getSortAfterSku", "Ljava/lang/Boolean;", "getForStars", "()Ljava/lang/Boolean;", "getWholeQuant", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CartItemInfo {
    private final Boolean forStars;
    private final Map<String, String> params;
    private final int quantity;
    private final Long selectedDeliverySchema;
    private final Long sortAfterSku;
    private final Boolean wholeQuant;

    public CartItemInfo(int i11, Long l11, Long l12, Boolean bool, Boolean bool2, Map<String, String> map) {
        this.quantity = i11;
        this.selectedDeliverySchema = l11;
        this.sortAfterSku = l12;
        this.forStars = bool;
        this.wholeQuant = bool2;
        this.params = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartItemInfo)) {
            return false;
        }
        CartItemInfo cartItemInfo = (CartItemInfo) other;
        return this.quantity == cartItemInfo.quantity && Intrinsics.d(this.selectedDeliverySchema, cartItemInfo.selectedDeliverySchema) && Intrinsics.d(this.sortAfterSku, cartItemInfo.sortAfterSku) && Intrinsics.d(this.forStars, cartItemInfo.forStars) && Intrinsics.d(this.wholeQuant, cartItemInfo.wholeQuant) && Intrinsics.d(this.params, cartItemInfo.params);
    }

    public final Boolean getForStars() {
        return this.forStars;
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final Long getSelectedDeliverySchema() {
        return this.selectedDeliverySchema;
    }

    public final Long getSortAfterSku() {
        return this.sortAfterSku;
    }

    public final Boolean getWholeQuant() {
        return this.wholeQuant;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.quantity) * 31;
        Long l11 = this.selectedDeliverySchema;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.sortAfterSku;
        int hashCode3 = (hashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Boolean bool = this.forStars;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.wholeQuant;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Map<String, String> map = this.params;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CartItemInfo(quantity=" + this.quantity + ", selectedDeliverySchema=" + this.selectedDeliverySchema + ", sortAfterSku=" + this.sortAfterSku + ", forStars=" + this.forStars + ", wholeQuant=" + this.wholeQuant + ", params=" + this.params + ")";
    }

    public /* synthetic */ CartItemInfo(int i11, Long l11, Long l12, Boolean bool, Boolean bool2, Map map, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? null : l11, (i12 & 4) != 0 ? null : l12, (i12 & 8) != 0 ? null : bool, (i12 & 16) != 0 ? null : bool2, (i12 & 32) != 0 ? null : map);
    }
}
