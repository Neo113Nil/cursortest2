package ru.ozon.app.android.cart.common.data;

import B0.C2454a;
import Bl.C2639a;
import Ql.c;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003Jj\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\t\u0010*\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lru/ozon/app/android/cart/common/data/CartItemRequest;", "", "id", "", "quantity", "", "selectedDeliverySchema", "sortAfterSku", "forStars", "", "wholeQuant", "params", "", "", "<init>", "(JILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Map;)V", "getId", "()J", "getQuantity", "()I", "getSelectedDeliverySchema", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSortAfterSku", "getForStars", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getWholeQuant", "getParams", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(JILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Map;)Lru/ozon/app/android/cart/common/data/CartItemRequest;", "equals", "other", "hashCode", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CartItemRequest {
    private final Boolean forStars;
    private final long id;
    private final Map<String, String> params;
    private final int quantity;
    private final Long selectedDeliverySchema;
    private final Long sortAfterSku;
    private final Boolean wholeQuant;

    public CartItemRequest(long j11, int i11, Long l11, Long l12, Boolean bool, Boolean bool2, Map<String, String> map) {
        this.id = j11;
        this.quantity = i11;
        this.selectedDeliverySchema = l11;
        this.sortAfterSku = l12;
        this.forStars = bool;
        this.wholeQuant = bool2;
        this.params = map;
    }

    public static /* synthetic */ CartItemRequest copy$default(CartItemRequest cartItemRequest, long j11, int i11, Long l11, Long l12, Boolean bool, Boolean bool2, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = cartItemRequest.id;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            i11 = cartItemRequest.quantity;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            l11 = cartItemRequest.selectedDeliverySchema;
        }
        Long l13 = l11;
        if ((i12 & 8) != 0) {
            l12 = cartItemRequest.sortAfterSku;
        }
        Long l14 = l12;
        if ((i12 & 16) != 0) {
            bool = cartItemRequest.forStars;
        }
        return cartItemRequest.copy(j12, i13, l13, l14, bool, (i12 & 32) != 0 ? cartItemRequest.wholeQuant : bool2, (i12 & 64) != 0 ? cartItemRequest.params : map);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getSelectedDeliverySchema() {
        return this.selectedDeliverySchema;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getSortAfterSku() {
        return this.sortAfterSku;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getForStars() {
        return this.forStars;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getWholeQuant() {
        return this.wholeQuant;
    }

    public final Map<String, String> component7() {
        return this.params;
    }

    @NotNull
    public final CartItemRequest copy(long id2, int quantity, Long selectedDeliverySchema, Long sortAfterSku, Boolean forStars, Boolean wholeQuant, Map<String, String> params) {
        return new CartItemRequest(id2, quantity, selectedDeliverySchema, sortAfterSku, forStars, wholeQuant, params);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartItemRequest)) {
            return false;
        }
        CartItemRequest cartItemRequest = (CartItemRequest) other;
        return this.id == cartItemRequest.id && this.quantity == cartItemRequest.quantity && Intrinsics.d(this.selectedDeliverySchema, cartItemRequest.selectedDeliverySchema) && Intrinsics.d(this.sortAfterSku, cartItemRequest.sortAfterSku) && Intrinsics.d(this.forStars, cartItemRequest.forStars) && Intrinsics.d(this.wholeQuant, cartItemRequest.wholeQuant) && Intrinsics.d(this.params, cartItemRequest.params);
    }

    public final Boolean getForStars() {
        return this.forStars;
    }

    public final long getId() {
        return this.id;
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
        int a11 = C2454a.a(this.quantity, Long.hashCode(this.id) * 31, 31);
        Long l11 = this.selectedDeliverySchema;
        int hashCode = (a11 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.sortAfterSku;
        int hashCode2 = (hashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        Boolean bool = this.forStars;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.wholeQuant;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Map<String, String> map = this.params;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        int i11 = this.quantity;
        Long l11 = this.selectedDeliverySchema;
        Long l12 = this.sortAfterSku;
        Boolean bool = this.forStars;
        Boolean bool2 = this.wholeQuant;
        Map<String, String> map = this.params;
        StringBuilder b11 = c.b(j11, "CartItemRequest(id=", i11, ", quantity=");
        b11.append(", selectedDeliverySchema=");
        b11.append(l11);
        b11.append(", sortAfterSku=");
        b11.append(l12);
        b11.append(", forStars=");
        b11.append(bool);
        b11.append(", wholeQuant=");
        b11.append(bool2);
        return C2639a.b(b11, ", params=", map, ")");
    }

    public /* synthetic */ CartItemRequest(long j11, int i11, Long l11, Long l12, Boolean bool, Boolean bool2, Map map, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, i11, l11, (i12 & 8) != 0 ? null : l12, (i12 & 16) != 0 ? null : bool, (i12 & 32) != 0 ? null : bool2, (i12 & 64) != 0 ? null : map);
    }
}
