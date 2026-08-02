package ru.ozon.app.android.cart.domain.model;

import De.C2860c;
import G.g;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartType;
import ru.ozon.app.android.cart.common.models.events.ProductTokenizedCartAnalyticsEvent;
import ru.ozon.app.android.cart.common.models.events.TokenizedCartAnalyticsEvent;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b%\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b)\u0010!R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/cart/domain/model/RemoveProductWithTokenizedAnalyticsParams;", "", "", "productId", "selectedDeliverySchema", "", "Lru/ozon/app/android/cart/common/models/events/ProductTokenizedCartAnalyticsEvent;", "analyticsEvent", "Lru/ozon/app/android/cart/common/models/events/TokenizedCartAnalyticsEvent;", "additionalAnalyticsEvent", "", "forStars", "widgetId", "", "", "params", "Lru/ozon/app/android/cart/common/domain/CartType;", "cartType", "<init>", "(JLjava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/util/Map;Lru/ozon/app/android/cart/common/domain/CartType;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getProductId", "()J", "Ljava/lang/Long;", "getSelectedDeliverySchema", "()Ljava/lang/Long;", "Ljava/util/List;", "getAnalyticsEvent", "()Ljava/util/List;", "getAdditionalAnalyticsEvent", "Ljava/lang/Boolean;", "getForStars", "()Ljava/lang/Boolean;", "getWidgetId", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "Lru/ozon/app/android/cart/common/domain/CartType;", "getCartType", "()Lru/ozon/app/android/cart/common/domain/CartType;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RemoveProductWithTokenizedAnalyticsParams {
    private final List<TokenizedCartAnalyticsEvent> additionalAnalyticsEvent;

    @NotNull
    private final List<ProductTokenizedCartAnalyticsEvent> analyticsEvent;

    @NotNull
    private final CartType cartType;
    private final Boolean forStars;
    private final Map<String, String> params;
    private final long productId;
    private final Long selectedDeliverySchema;
    private final Long widgetId;

    public RemoveProductWithTokenizedAnalyticsParams(long j11, Long l11, @NotNull List<ProductTokenizedCartAnalyticsEvent> analyticsEvent, List<TokenizedCartAnalyticsEvent> list, Boolean bool, Long l12, Map<String, String> map, @NotNull CartType cartType) {
        Intrinsics.checkNotNullParameter(analyticsEvent, "analyticsEvent");
        Intrinsics.checkNotNullParameter(cartType, "cartType");
        this.productId = j11;
        this.selectedDeliverySchema = l11;
        this.analyticsEvent = analyticsEvent;
        this.additionalAnalyticsEvent = list;
        this.forStars = bool;
        this.widgetId = l12;
        this.params = map;
        this.cartType = cartType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoveProductWithTokenizedAnalyticsParams)) {
            return false;
        }
        RemoveProductWithTokenizedAnalyticsParams removeProductWithTokenizedAnalyticsParams = (RemoveProductWithTokenizedAnalyticsParams) other;
        return this.productId == removeProductWithTokenizedAnalyticsParams.productId && Intrinsics.d(this.selectedDeliverySchema, removeProductWithTokenizedAnalyticsParams.selectedDeliverySchema) && Intrinsics.d(this.analyticsEvent, removeProductWithTokenizedAnalyticsParams.analyticsEvent) && Intrinsics.d(this.additionalAnalyticsEvent, removeProductWithTokenizedAnalyticsParams.additionalAnalyticsEvent) && Intrinsics.d(this.forStars, removeProductWithTokenizedAnalyticsParams.forStars) && Intrinsics.d(this.widgetId, removeProductWithTokenizedAnalyticsParams.widgetId) && Intrinsics.d(this.params, removeProductWithTokenizedAnalyticsParams.params) && this.cartType == removeProductWithTokenizedAnalyticsParams.cartType;
    }

    public final List<TokenizedCartAnalyticsEvent> getAdditionalAnalyticsEvent() {
        return this.additionalAnalyticsEvent;
    }

    @NotNull
    public final List<ProductTokenizedCartAnalyticsEvent> getAnalyticsEvent() {
        return this.analyticsEvent;
    }

    @NotNull
    public final CartType getCartType() {
        return this.cartType;
    }

    public final Boolean getForStars() {
        return this.forStars;
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    public final long getProductId() {
        return this.productId;
    }

    public final Long getSelectedDeliverySchema() {
        return this.selectedDeliverySchema;
    }

    public final Long getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.productId) * 31;
        Long l11 = this.selectedDeliverySchema;
        int b11 = g.b((hashCode + (l11 == null ? 0 : l11.hashCode())) * 31, 31, this.analyticsEvent);
        List<TokenizedCartAnalyticsEvent> list = this.additionalAnalyticsEvent;
        int hashCode2 = (b11 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.forStars;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l12 = this.widgetId;
        int hashCode4 = (hashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Map<String, String> map = this.params;
        return this.cartType.hashCode() + ((hashCode4 + (map != null ? map.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.productId;
        Long l11 = this.selectedDeliverySchema;
        List<ProductTokenizedCartAnalyticsEvent> list = this.analyticsEvent;
        List<TokenizedCartAnalyticsEvent> list2 = this.additionalAnalyticsEvent;
        Boolean bool = this.forStars;
        Long l12 = this.widgetId;
        Map<String, String> map = this.params;
        CartType cartType = this.cartType;
        StringBuilder sb2 = new StringBuilder("RemoveProductWithTokenizedAnalyticsParams(productId=");
        sb2.append(j11);
        sb2.append(", selectedDeliverySchema=");
        sb2.append(l11);
        C2860c.g(", analyticsEvent=", ", additionalAnalyticsEvent=", sb2, list, list2);
        sb2.append(", forStars=");
        sb2.append(bool);
        sb2.append(", widgetId=");
        sb2.append(l12);
        sb2.append(", params=");
        sb2.append(map);
        sb2.append(", cartType=");
        sb2.append(cartType);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ RemoveProductWithTokenizedAnalyticsParams(long j11, Long l11, List list, List list2, Boolean bool, Long l12, Map map, CartType cartType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, (i11 & 2) != 0 ? null : l11, list, (i11 & 8) != 0 ? null : list2, (i11 & 16) != 0 ? null : bool, (i11 & 32) != 0 ? null : l12, (i11 & 64) != 0 ? null : map, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? CartType.MAIN_CART : cartType);
    }
}
