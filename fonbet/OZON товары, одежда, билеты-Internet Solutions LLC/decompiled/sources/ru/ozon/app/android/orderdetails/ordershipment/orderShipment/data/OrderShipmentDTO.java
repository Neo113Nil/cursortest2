package ru.ozon.app.android.orderdetails.ordershipment.orderShipment.data;

import Bi.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentDTO;", "", "items", "", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO;", "id", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getItems", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrderShipmentDTO {
    public static final int $stable = 8;

    @NotNull
    private final String id;

    @NotNull
    private final List<OrderShipmentItemDTO> items;

    /* JADX WARN: Multi-variable type inference failed */
    public OrderShipmentDTO(@NotNull List<? extends OrderShipmentItemDTO> items, @NotNull String id2) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(id2, "id");
        this.items = items;
        this.id = id2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderShipmentDTO copy$default(OrderShipmentDTO orderShipmentDTO, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = orderShipmentDTO.items;
        }
        if ((i11 & 2) != 0) {
            str = orderShipmentDTO.id;
        }
        return orderShipmentDTO.copy(list, str);
    }

    @NotNull
    public final List<OrderShipmentItemDTO> component1() {
        return this.items;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final OrderShipmentDTO copy(@NotNull List<? extends OrderShipmentItemDTO> items, @NotNull String id2) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(id2, "id");
        return new OrderShipmentDTO(items, id2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderShipmentDTO)) {
            return false;
        }
        OrderShipmentDTO orderShipmentDTO = (OrderShipmentDTO) other;
        return Intrinsics.d(this.items, orderShipmentDTO.items) && Intrinsics.d(this.id, orderShipmentDTO.id);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<OrderShipmentItemDTO> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.id.hashCode() + (this.items.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return b.e("OrderShipmentDTO(items=", ", id=", this.id, ")", this.items);
    }
}
