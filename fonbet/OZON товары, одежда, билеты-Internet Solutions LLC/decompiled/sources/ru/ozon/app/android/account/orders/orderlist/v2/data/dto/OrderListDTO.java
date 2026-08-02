package ru.ozon.app.android.account.orders.orderlist.v2.data.dto;

import H3.c;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderListDTO;", "", "orderList", "", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO;", "<init>", "(Ljava/util/List;)V", "getOrderList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OrderListDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<OrderDTO> orderList;

    public OrderListDTO(@i(name = "orderListApp") @NotNull List<OrderDTO> orderList) {
        Intrinsics.checkNotNullParameter(orderList, "orderList");
        this.orderList = orderList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderListDTO copy$default(OrderListDTO orderListDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = orderListDTO.orderList;
        }
        return orderListDTO.copy(list);
    }

    @NotNull
    public final List<OrderDTO> component1() {
        return this.orderList;
    }

    @NotNull
    public final OrderListDTO copy(@i(name = "orderListApp") @NotNull List<OrderDTO> orderList) {
        Intrinsics.checkNotNullParameter(orderList, "orderList");
        return new OrderListDTO(orderList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OrderListDTO) && Intrinsics.d(this.orderList, ((OrderListDTO) other).orderList);
    }

    @NotNull
    public final List<OrderDTO> getOrderList() {
        return this.orderList;
    }

    public int hashCode() {
        return this.orderList.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("OrderListDTO(orderList=", ")", this.orderList);
    }
}
