package ru.ozon.app.android.cart.common.presentation.addToCart;

import B0.C2454a;
import D3.h;
import N3.C3660k;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0003Jj\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartProductInfo;", "", "id", "", "quantity", "", "selectedDeliverySchema", "", "sortAfterSku", "forStars", "", "wholeQuant", "params", "", "<init>", "(Ljava/lang/String;ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getQuantity", "()I", "getSelectedDeliverySchema", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSortAfterSku", "getForStars", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getWholeQuant", "getParams", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Map;)Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartProductInfo;", "equals", "other", "hashCode", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AddToCartProductInfo {
    private final Boolean forStars;

    @NotNull
    private final String id;
    private final Map<String, String> params;
    private final int quantity;
    private final Long selectedDeliverySchema;
    private final Long sortAfterSku;
    private final Boolean wholeQuant;

    public AddToCartProductInfo(@NotNull String id2, int i11, Long l11, Long l12, Boolean bool, Boolean bool2, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.quantity = i11;
        this.selectedDeliverySchema = l11;
        this.sortAfterSku = l12;
        this.forStars = bool;
        this.wholeQuant = bool2;
        this.params = map;
    }

    public static /* synthetic */ AddToCartProductInfo copy$default(AddToCartProductInfo addToCartProductInfo, String str, int i11, Long l11, Long l12, Boolean bool, Boolean bool2, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = addToCartProductInfo.id;
        }
        if ((i12 & 2) != 0) {
            i11 = addToCartProductInfo.quantity;
        }
        if ((i12 & 4) != 0) {
            l11 = addToCartProductInfo.selectedDeliverySchema;
        }
        if ((i12 & 8) != 0) {
            l12 = addToCartProductInfo.sortAfterSku;
        }
        if ((i12 & 16) != 0) {
            bool = addToCartProductInfo.forStars;
        }
        if ((i12 & 32) != 0) {
            bool2 = addToCartProductInfo.wholeQuant;
        }
        if ((i12 & 64) != 0) {
            map = addToCartProductInfo.params;
        }
        Boolean bool3 = bool2;
        Map map2 = map;
        Boolean bool4 = bool;
        Long l13 = l11;
        return addToCartProductInfo.copy(str, i11, l13, l12, bool4, bool3, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
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
    public final AddToCartProductInfo copy(@NotNull String id2, int quantity, Long selectedDeliverySchema, Long sortAfterSku, Boolean forStars, Boolean wholeQuant, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new AddToCartProductInfo(id2, quantity, selectedDeliverySchema, sortAfterSku, forStars, wholeQuant, params);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddToCartProductInfo)) {
            return false;
        }
        AddToCartProductInfo addToCartProductInfo = (AddToCartProductInfo) other;
        return Intrinsics.d(this.id, addToCartProductInfo.id) && this.quantity == addToCartProductInfo.quantity && Intrinsics.d(this.selectedDeliverySchema, addToCartProductInfo.selectedDeliverySchema) && Intrinsics.d(this.sortAfterSku, addToCartProductInfo.sortAfterSku) && Intrinsics.d(this.forStars, addToCartProductInfo.forStars) && Intrinsics.d(this.wholeQuant, addToCartProductInfo.wholeQuant) && Intrinsics.d(this.params, addToCartProductInfo.params);
    }

    public final Boolean getForStars() {
        return this.forStars;
    }

    @NotNull
    public final String getId() {
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
        int a11 = C2454a.a(this.quantity, this.id.hashCode() * 31, 31);
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
        String str = this.id;
        int i11 = this.quantity;
        Long l11 = this.selectedDeliverySchema;
        Long l12 = this.sortAfterSku;
        Boolean bool = this.forStars;
        Boolean bool2 = this.wholeQuant;
        Map<String, String> map = this.params;
        StringBuilder c11 = C3660k.c(i11, "AddToCartProductInfo(id=", str, ", quantity=", ", selectedDeliverySchema=");
        TY.a.e(c11, l11, ", sortAfterSku=", l12, ", forStars=");
        h.h(c11, bool, ", wholeQuant=", bool2, ", params=");
        return P.f(c11, map, ")");
    }

    public /* synthetic */ AddToCartProductInfo(String str, int i11, Long l11, Long l12, Boolean bool, Boolean bool2, Map map, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, l11, l12, (i12 & 16) != 0 ? null : bool, (i12 & 32) != 0 ? null : bool2, (i12 & 64) != 0 ? null : map);
    }
}
