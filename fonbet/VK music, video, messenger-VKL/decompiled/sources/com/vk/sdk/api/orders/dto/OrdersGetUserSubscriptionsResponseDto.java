package com.vk.sdk.api.orders.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: OrdersGetUserSubscriptionsResponseDto.kt */
/* loaded from: classes5.dex */
public final class OrdersGetUserSubscriptionsResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<OrdersSubscriptionDto> items;

    public OrdersGetUserSubscriptionsResponseDto(int i, List<OrdersSubscriptionDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersGetUserSubscriptionsResponseDto)) {
            return false;
        }
        OrdersGetUserSubscriptionsResponseDto ordersGetUserSubscriptionsResponseDto = (OrdersGetUserSubscriptionsResponseDto) obj;
        return this.count == ordersGetUserSubscriptionsResponseDto.count && epx.f(this.items, ordersGetUserSubscriptionsResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "OrdersGetUserSubscriptionsResponseDto(count=", ", items=", ")", this.items);
    }
}
