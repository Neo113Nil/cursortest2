package com.vk.ecomm.orders.impl.common.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrderPaymentResult.kt */
/* loaded from: classes18.dex */
public final class OrderPaymentResult {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OrderPaymentResult[] $VALUES;
    public static final OrderPaymentResult Cancelled;
    public static final OrderPaymentResult Failed;
    public static final OrderPaymentResult Success;

    static {
        OrderPaymentResult orderPaymentResult = new OrderPaymentResult("Success", 0);
        Success = orderPaymentResult;
        OrderPaymentResult orderPaymentResult2 = new OrderPaymentResult("Failed", 1);
        Failed = orderPaymentResult2;
        OrderPaymentResult orderPaymentResult3 = new OrderPaymentResult("Cancelled", 2);
        Cancelled = orderPaymentResult3;
        OrderPaymentResult[] orderPaymentResultArr = {orderPaymentResult, orderPaymentResult2, orderPaymentResult3};
        $VALUES = orderPaymentResultArr;
        $ENTRIES = new asp(orderPaymentResultArr);
    }

    public OrderPaymentResult() {
        throw null;
    }

    public static OrderPaymentResult valueOf(String str) {
        return (OrderPaymentResult) Enum.valueOf(OrderPaymentResult.class, str);
    }

    public static OrderPaymentResult[] values() {
        return (OrderPaymentResult[]) $VALUES.clone();
    }
}
