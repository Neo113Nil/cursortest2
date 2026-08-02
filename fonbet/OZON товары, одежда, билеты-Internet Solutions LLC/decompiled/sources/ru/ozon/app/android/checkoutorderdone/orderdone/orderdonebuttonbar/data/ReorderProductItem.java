package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.data;

import B0.C2454a;
import N3.C3660k;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JF\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/data/ReorderProductItem;", "", "sku", "", "quantity", "", "selectedDeliverySchema", "", "toCartTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;ILjava/lang/Long;Ljava/util/Map;)V", "getSku", "()Ljava/lang/String;", "getQuantity", "()I", "getSelectedDeliverySchema", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getToCartTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;ILjava/lang/Long;Ljava/util/Map;)Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/data/ReorderProductItem;", "equals", "", "other", "hashCode", "toString", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ReorderProductItem {
    public static final int $stable = 8;
    private final int quantity;
    private final Long selectedDeliverySchema;

    @NotNull
    private final String sku;
    private final Map<String, TokenizedTrackingInfo> toCartTrackingInfo;

    public ReorderProductItem(@NotNull String sku, int i11, Long l11, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        this.sku = sku;
        this.quantity = i11;
        this.selectedDeliverySchema = l11;
        this.toCartTrackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReorderProductItem copy$default(ReorderProductItem reorderProductItem, String str, int i11, Long l11, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = reorderProductItem.sku;
        }
        if ((i12 & 2) != 0) {
            i11 = reorderProductItem.quantity;
        }
        if ((i12 & 4) != 0) {
            l11 = reorderProductItem.selectedDeliverySchema;
        }
        if ((i12 & 8) != 0) {
            map = reorderProductItem.toCartTrackingInfo;
        }
        return reorderProductItem.copy(str, i11, l11, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    /* renamed from: component2, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getSelectedDeliverySchema() {
        return this.selectedDeliverySchema;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.toCartTrackingInfo;
    }

    @NotNull
    public final ReorderProductItem copy(@NotNull String sku, int quantity, Long selectedDeliverySchema, Map<String, TokenizedTrackingInfo> toCartTrackingInfo) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        return new ReorderProductItem(sku, quantity, selectedDeliverySchema, toCartTrackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReorderProductItem)) {
            return false;
        }
        ReorderProductItem reorderProductItem = (ReorderProductItem) other;
        return Intrinsics.d(this.sku, reorderProductItem.sku) && this.quantity == reorderProductItem.quantity && Intrinsics.d(this.selectedDeliverySchema, reorderProductItem.selectedDeliverySchema) && Intrinsics.d(this.toCartTrackingInfo, reorderProductItem.toCartTrackingInfo);
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final Long getSelectedDeliverySchema() {
        return this.selectedDeliverySchema;
    }

    @NotNull
    public final String getSku() {
        return this.sku;
    }

    public final Map<String, TokenizedTrackingInfo> getToCartTrackingInfo() {
        return this.toCartTrackingInfo;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.quantity, this.sku.hashCode() * 31, 31);
        Long l11 = this.selectedDeliverySchema;
        int hashCode = (a11 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.toCartTrackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.sku;
        int i11 = this.quantity;
        Long l11 = this.selectedDeliverySchema;
        Map<String, TokenizedTrackingInfo> map = this.toCartTrackingInfo;
        StringBuilder c11 = C3660k.c(i11, "ReorderProductItem(sku=", str, ", quantity=", ", selectedDeliverySchema=");
        c11.append(l11);
        c11.append(", toCartTrackingInfo=");
        c11.append(map);
        c11.append(")");
        return c11.toString();
    }
}
