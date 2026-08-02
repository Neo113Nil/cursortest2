package ru.ozon.app.android.fresh.unsorted.widgets.wholesale.presentation;

import B0.C2454a;
import Ql.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b!\u0010\u001d¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/CartItemParams;", "", "", "skuId", "", "quantity", "deliverySchema", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "widgetId", "<init>", "(JILjava/lang/Long;Ljava/util/Map;Ljava/lang/Long;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSkuId", "()J", "I", "getQuantity", "Ljava/lang/Long;", "getDeliverySchema", "()Ljava/lang/Long;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "getWidgetId", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CartItemParams {
    private final Long deliverySchema;
    private final int quantity;
    private final long skuId;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final Long widgetId;

    public CartItemParams(long j11, int i11, Long l11, Map<String, TokenizedTrackingInfo> map, Long l12) {
        this.skuId = j11;
        this.quantity = i11;
        this.deliverySchema = l11;
        this.trackingInfo = map;
        this.widgetId = l12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartItemParams)) {
            return false;
        }
        CartItemParams cartItemParams = (CartItemParams) other;
        return this.skuId == cartItemParams.skuId && this.quantity == cartItemParams.quantity && Intrinsics.d(this.deliverySchema, cartItemParams.deliverySchema) && Intrinsics.d(this.trackingInfo, cartItemParams.trackingInfo) && Intrinsics.d(this.widgetId, cartItemParams.widgetId);
    }

    public final Long getDeliverySchema() {
        return this.deliverySchema;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final long getSkuId() {
        return this.skuId;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final Long getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.quantity, Long.hashCode(this.skuId) * 31, 31);
        Long l11 = this.deliverySchema;
        int hashCode = (a11 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Long l12 = this.widgetId;
        return hashCode2 + (l12 != null ? l12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.skuId;
        int i11 = this.quantity;
        Long l11 = this.deliverySchema;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Long l12 = this.widgetId;
        StringBuilder b11 = c.b(j11, "CartItemParams(skuId=", i11, ", quantity=");
        b11.append(", deliverySchema=");
        b11.append(l11);
        b11.append(", trackingInfo=");
        b11.append(map);
        b11.append(", widgetId=");
        b11.append(l12);
        b11.append(")");
        return b11.toString();
    }
}
