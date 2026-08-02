package ru.ozon.app.android.orders.cml.deliveryOrderList.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orders.cml.common.data.VerticalPadding;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderList/data/DeliveryOrderListDTO;", "", "orderList", "", "Lru/ozon/app/android/orders/cml/deliveryOrderList/data/DeliveryOrderDTO;", "verticalPadding", "Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;)V", "getOrderList", "()Ljava/util/List;", "getVerticalPadding", "()Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DeliveryOrderListDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<DeliveryOrderDTO> orderList;
    private final VerticalPadding verticalPadding;

    public DeliveryOrderListDTO(@NotNull List<DeliveryOrderDTO> orderList, VerticalPadding verticalPadding) {
        Intrinsics.checkNotNullParameter(orderList, "orderList");
        this.orderList = orderList;
        this.verticalPadding = verticalPadding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveryOrderListDTO copy$default(DeliveryOrderListDTO deliveryOrderListDTO, List list, VerticalPadding verticalPadding, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = deliveryOrderListDTO.orderList;
        }
        if ((i11 & 2) != 0) {
            verticalPadding = deliveryOrderListDTO.verticalPadding;
        }
        return deliveryOrderListDTO.copy(list, verticalPadding);
    }

    @NotNull
    public final List<DeliveryOrderDTO> component1() {
        return this.orderList;
    }

    /* renamed from: component2, reason: from getter */
    public final VerticalPadding getVerticalPadding() {
        return this.verticalPadding;
    }

    @NotNull
    public final DeliveryOrderListDTO copy(@NotNull List<DeliveryOrderDTO> orderList, VerticalPadding verticalPadding) {
        Intrinsics.checkNotNullParameter(orderList, "orderList");
        return new DeliveryOrderListDTO(orderList, verticalPadding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryOrderListDTO)) {
            return false;
        }
        DeliveryOrderListDTO deliveryOrderListDTO = (DeliveryOrderListDTO) other;
        return Intrinsics.d(this.orderList, deliveryOrderListDTO.orderList) && Intrinsics.d(this.verticalPadding, deliveryOrderListDTO.verticalPadding);
    }

    @NotNull
    public final List<DeliveryOrderDTO> getOrderList() {
        return this.orderList;
    }

    public final VerticalPadding getVerticalPadding() {
        return this.verticalPadding;
    }

    public int hashCode() {
        int hashCode = this.orderList.hashCode() * 31;
        VerticalPadding verticalPadding = this.verticalPadding;
        return hashCode + (verticalPadding == null ? 0 : verticalPadding.hashCode());
    }

    @NotNull
    public String toString() {
        return "DeliveryOrderListDTO(orderList=" + this.orderList + ", verticalPadding=" + this.verticalPadding + ")";
    }
}
