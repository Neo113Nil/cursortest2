package ru.ozon.app.android.account.orders.orderProduct.data.dto;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/account/orders/orderProduct/data/dto/OrderProductDTO;", "", "orderProducts", "", "Lru/ozon/app/android/account/orders/orderProduct/data/dto/OrderProductItemDTO;", "<init>", "(Ljava/util/List;)V", "getOrderProducts", "()Ljava/util/List;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderProductDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<OrderProductItemDTO> orderProducts;

    public OrderProductDTO(@NotNull List<OrderProductItemDTO> orderProducts) {
        Intrinsics.checkNotNullParameter(orderProducts, "orderProducts");
        this.orderProducts = orderProducts;
    }

    @NotNull
    public final List<OrderProductItemDTO> getOrderProducts() {
        return this.orderProducts;
    }
}
