package com.vk.ecomm.orders.impl.order.presentation.mvi.state;

import com.huawei.hms.hihealth.data.DeviceInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrderError.kt */
/* loaded from: classes18.dex */
public final class OrderError {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OrderError[] $VALUES;
    public static final OrderError AccessDenied;
    public static final OrderError Internet;
    public static final OrderError Unknown;

    static {
        OrderError orderError = new OrderError("Internet", 0);
        Internet = orderError;
        OrderError orderError2 = new OrderError("AccessDenied", 1);
        AccessDenied = orderError2;
        OrderError orderError3 = new OrderError(DeviceInfo.STR_TYPE_UNKNOWN, 2);
        Unknown = orderError3;
        OrderError[] orderErrorArr = {orderError, orderError2, orderError3};
        $VALUES = orderErrorArr;
        $ENTRIES = new asp(orderErrorArr);
    }

    public OrderError() {
        throw null;
    }

    public static OrderError valueOf(String str) {
        return (OrderError) Enum.valueOf(OrderError.class, str);
    }

    public static OrderError[] values() {
        return (OrderError[]) $VALUES.clone();
    }
}
