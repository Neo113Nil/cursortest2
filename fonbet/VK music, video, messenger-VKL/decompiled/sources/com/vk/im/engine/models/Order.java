package com.vk.im.engine.models;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Order.kt */
/* loaded from: classes2.dex */
public final class Order {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Order[] $VALUES;
    public static final Order ASC;
    public static final Order DESC;
    private final String sqlValue;

    static {
        Order order = new Order("ASC", 0, "ASC");
        ASC = order;
        Order order2 = new Order("DESC", 1, "DESC");
        DESC = order2;
        Order[] orderArr = {order, order2};
        $VALUES = orderArr;
        $ENTRIES = new asp(orderArr);
    }

    public Order(String str, int i, String str2) {
        this.sqlValue = str2;
    }

    public static Order valueOf(String str) {
        return (Order) Enum.valueOf(Order.class, str);
    }

    public static Order[] values() {
        return (Order[]) $VALUES.clone();
    }
}
