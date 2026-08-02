package com.vk.sdk.api.orders.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrdersChangeStateActionDto.kt */
/* loaded from: classes5.dex */
public final class OrdersChangeStateActionDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OrdersChangeStateActionDto[] $VALUES;

    @pmi0("cancel")
    public static final OrdersChangeStateActionDto CANCEL;

    @pmi0("charge")
    public static final OrdersChangeStateActionDto CHARGE;

    @pmi0("refund")
    public static final OrdersChangeStateActionDto REFUND;
    private final String value;

    static {
        OrdersChangeStateActionDto ordersChangeStateActionDto = new OrdersChangeStateActionDto("CANCEL", 0, "cancel");
        CANCEL = ordersChangeStateActionDto;
        OrdersChangeStateActionDto ordersChangeStateActionDto2 = new OrdersChangeStateActionDto("CHARGE", 1, "charge");
        CHARGE = ordersChangeStateActionDto2;
        OrdersChangeStateActionDto ordersChangeStateActionDto3 = new OrdersChangeStateActionDto("REFUND", 2, "refund");
        REFUND = ordersChangeStateActionDto3;
        OrdersChangeStateActionDto[] ordersChangeStateActionDtoArr = {ordersChangeStateActionDto, ordersChangeStateActionDto2, ordersChangeStateActionDto3};
        $VALUES = ordersChangeStateActionDtoArr;
        $ENTRIES = new asp(ordersChangeStateActionDtoArr);
    }

    private OrdersChangeStateActionDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static OrdersChangeStateActionDto valueOf(String str) {
        return (OrdersChangeStateActionDto) Enum.valueOf(OrdersChangeStateActionDto.class, str);
    }

    public static OrdersChangeStateActionDto[] values() {
        return (OrdersChangeStateActionDto[]) $VALUES.clone();
    }
}
