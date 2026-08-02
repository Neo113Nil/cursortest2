package ru.ozon.app.android.cart.common.models;

import G.g;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartType;
import ru.ozon.app.android.cart.common.models.events.ProductTokenizedCartAnalyticsEvent;
import ru.ozon.app.android.cart.common.models.events.TokenizedCartAnalyticsEvent;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/cart/common/models/AddProductsWithTokenizedAnalytics;", "", "", "", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "items", "", "Lru/ozon/app/android/cart/common/models/events/ProductTokenizedCartAnalyticsEvent;", "analyticsEvent", "Lru/ozon/app/android/cart/common/models/events/TokenizedCartAnalyticsEvent;", "additionalAnalyticsEvent", "widgetId", "Lru/ozon/app/android/cart/common/domain/CartType;", "cartType", "<init>", "(Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lru/ozon/app/android/cart/common/domain/CartType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getItems", "()Ljava/util/Map;", "Ljava/util/List;", "getAnalyticsEvent", "()Ljava/util/List;", "getAdditionalAnalyticsEvent", "Ljava/lang/Long;", "getWidgetId", "()Ljava/lang/Long;", "Lru/ozon/app/android/cart/common/domain/CartType;", "getCartType", "()Lru/ozon/app/android/cart/common/domain/CartType;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AddProductsWithTokenizedAnalytics {
    private final List<TokenizedCartAnalyticsEvent> additionalAnalyticsEvent;

    @NotNull
    private final List<ProductTokenizedCartAnalyticsEvent> analyticsEvent;

    @NotNull
    private final CartType cartType;

    @NotNull
    private final Map<Long, CartItemInfo> items;
    private final Long widgetId;

    public AddProductsWithTokenizedAnalytics(@NotNull Map<Long, CartItemInfo> items, @NotNull List<ProductTokenizedCartAnalyticsEvent> analyticsEvent, List<TokenizedCartAnalyticsEvent> list, Long l11, @NotNull CartType cartType) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(analyticsEvent, "analyticsEvent");
        Intrinsics.checkNotNullParameter(cartType, "cartType");
        this.items = items;
        this.analyticsEvent = analyticsEvent;
        this.additionalAnalyticsEvent = list;
        this.widgetId = l11;
        this.cartType = cartType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddProductsWithTokenizedAnalytics)) {
            return false;
        }
        AddProductsWithTokenizedAnalytics addProductsWithTokenizedAnalytics = (AddProductsWithTokenizedAnalytics) other;
        return Intrinsics.d(this.items, addProductsWithTokenizedAnalytics.items) && Intrinsics.d(this.analyticsEvent, addProductsWithTokenizedAnalytics.analyticsEvent) && Intrinsics.d(this.additionalAnalyticsEvent, addProductsWithTokenizedAnalytics.additionalAnalyticsEvent) && Intrinsics.d(this.widgetId, addProductsWithTokenizedAnalytics.widgetId) && this.cartType == addProductsWithTokenizedAnalytics.cartType;
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

    @NotNull
    public final Map<Long, CartItemInfo> getItems() {
        return this.items;
    }

    public final Long getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int b11 = g.b(this.items.hashCode() * 31, 31, this.analyticsEvent);
        List<TokenizedCartAnalyticsEvent> list = this.additionalAnalyticsEvent;
        int hashCode = (b11 + (list == null ? 0 : list.hashCode())) * 31;
        Long l11 = this.widgetId;
        return this.cartType.hashCode() + ((hashCode + (l11 != null ? l11.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "AddProductsWithTokenizedAnalytics(items=" + this.items + ", analyticsEvent=" + this.analyticsEvent + ", additionalAnalyticsEvent=" + this.additionalAnalyticsEvent + ", widgetId=" + this.widgetId + ", cartType=" + this.cartType + ")";
    }

    public /* synthetic */ AddProductsWithTokenizedAnalytics(Map map, List list, List list2, Long l11, CartType cartType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, list, (i11 & 4) != 0 ? null : list2, (i11 & 8) != 0 ? null : l11, (i11 & 16) != 0 ? CartType.MAIN_CART : cartType);
    }
}
