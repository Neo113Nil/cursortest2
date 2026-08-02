package com.vk.superapp.api.internal.requests.app;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrdersCancelUserSubscriptionResult.kt */
/* loaded from: classes6.dex */
public final class OrdersCancelUserSubscriptionResult {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OrdersCancelUserSubscriptionResult[] $VALUES;
    public static final OrdersCancelUserSubscriptionResult ERROR;
    public static final OrdersCancelUserSubscriptionResult SUCCESS;

    static {
        OrdersCancelUserSubscriptionResult ordersCancelUserSubscriptionResult = new OrdersCancelUserSubscriptionResult("SUCCESS", 0);
        SUCCESS = ordersCancelUserSubscriptionResult;
        OrdersCancelUserSubscriptionResult ordersCancelUserSubscriptionResult2 = new OrdersCancelUserSubscriptionResult("ERROR", 1);
        ERROR = ordersCancelUserSubscriptionResult2;
        OrdersCancelUserSubscriptionResult[] ordersCancelUserSubscriptionResultArr = {ordersCancelUserSubscriptionResult, ordersCancelUserSubscriptionResult2};
        $VALUES = ordersCancelUserSubscriptionResultArr;
        $ENTRIES = new asp(ordersCancelUserSubscriptionResultArr);
    }

    public OrdersCancelUserSubscriptionResult() {
        throw null;
    }

    public static OrdersCancelUserSubscriptionResult valueOf(String str) {
        return (OrdersCancelUserSubscriptionResult) Enum.valueOf(OrdersCancelUserSubscriptionResult.class, str);
    }

    public static OrdersCancelUserSubscriptionResult[] values() {
        return (OrdersCancelUserSubscriptionResult[]) $VALUES.clone();
    }
}
