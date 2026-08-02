package com.vk.ecomm.orders.impl.common.model;

import com.huawei.hms.hihealth.data.DeviceInfo;
import com.vkontakte.android.R;
import java.util.Iterator;
import xsna.asp;
import xsna.tlo0;
import xsna.tq;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrderStatus.kt */
/* loaded from: classes18.dex */
public final class OrderStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OrderStatus[] $VALUES;
    public static final OrderStatus Archived;
    public static final OrderStatus Assembling;
    public static final OrderStatus Cancelled;
    public static final a Companion;
    public static final OrderStatus Completed;
    public static final OrderStatus Coordinating;
    public static final OrderStatus Delivering;
    public static final OrderStatus New;
    public static final OrderStatus Payed;
    public static final OrderStatus Returned;
    public static final OrderStatus Unknown;
    private final int key;

    /* compiled from: OrderStatus.kt */
    public static final class a {

        /* compiled from: OrderStatus.kt */
        /* renamed from: com.vk.ecomm.orders.impl.common.model.OrderStatus$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0989a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OrderStatus.values().length];
                try {
                    iArr[OrderStatus.New.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OrderStatus.Coordinating.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[OrderStatus.Assembling.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[OrderStatus.Delivering.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[OrderStatus.Completed.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[OrderStatus.Payed.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[OrderStatus.Cancelled.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[OrderStatus.Returned.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[OrderStatus.Archived.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static tlo0 a(OrderStatus orderStatus) {
            switch (C0989a.$EnumSwitchMapping$0[orderStatus.ordinal()]) {
                case 1:
                    return tq.h(tlo0.Companion, R.string.ecomm_orders_status_new);
                case 2:
                    return tq.h(tlo0.Companion, R.string.ecomm_orders_status_coordinating);
                case 3:
                    return tq.h(tlo0.Companion, R.string.ecomm_orders_status_assembling);
                case 4:
                    return tq.h(tlo0.Companion, R.string.ecomm_orders_status_delivering);
                case 5:
                    return tq.h(tlo0.Companion, R.string.ecomm_orders_status_completed);
                case 6:
                    return tq.h(tlo0.Companion, R.string.ecomm_orders_status_status_payed);
                case 7:
                    return tq.h(tlo0.Companion, R.string.ecomm_orders_status_cancelled);
                case 8:
                    return tq.h(tlo0.Companion, R.string.ecomm_orders_status_returned);
                case 9:
                    return tq.h(tlo0.Companion, R.string.ecomm_orders_status_archived);
                default:
                    tlo0.Companion.getClass();
                    return tlo0.c.a;
            }
        }

        public static OrderStatus b(int i, boolean z) {
            Object obj;
            OrderStatus orderStatus = OrderStatus.Completed;
            if (i == orderStatus.i()) {
                return z ? OrderStatus.Payed : orderStatus;
            }
            Iterator<E> it = OrderStatus.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((OrderStatus) obj).i() == i) {
                    break;
                }
            }
            OrderStatus orderStatus2 = (OrderStatus) obj;
            return orderStatus2 == null ? OrderStatus.Unknown : orderStatus2;
        }
    }

    static {
        OrderStatus orderStatus = new OrderStatus(DeviceInfo.STR_TYPE_UNKNOWN, 0, -1);
        Unknown = orderStatus;
        OrderStatus orderStatus2 = new OrderStatus("New", 1, 0);
        New = orderStatus2;
        OrderStatus orderStatus3 = new OrderStatus("Coordinating", 2, 1);
        Coordinating = orderStatus3;
        OrderStatus orderStatus4 = new OrderStatus("Assembling", 3, 2);
        Assembling = orderStatus4;
        OrderStatus orderStatus5 = new OrderStatus("Delivering", 4, 3);
        Delivering = orderStatus5;
        OrderStatus orderStatus6 = new OrderStatus("Completed", 5, 4);
        Completed = orderStatus6;
        OrderStatus orderStatus7 = new OrderStatus("Payed", 6, 4);
        Payed = orderStatus7;
        OrderStatus orderStatus8 = new OrderStatus("Cancelled", 7, 5);
        Cancelled = orderStatus8;
        OrderStatus orderStatus9 = new OrderStatus("Returned", 8, 6);
        Returned = orderStatus9;
        OrderStatus orderStatus10 = new OrderStatus("Archived", 9, 7);
        Archived = orderStatus10;
        OrderStatus[] orderStatusArr = {orderStatus, orderStatus2, orderStatus3, orderStatus4, orderStatus5, orderStatus6, orderStatus7, orderStatus8, orderStatus9, orderStatus10};
        $VALUES = orderStatusArr;
        $ENTRIES = new asp(orderStatusArr);
        Companion = new a();
    }

    public OrderStatus(String str, int i, int i2) {
        this.key = i2;
    }

    public static zrp<OrderStatus> h() {
        return $ENTRIES;
    }

    public static OrderStatus valueOf(String str) {
        return (OrderStatus) Enum.valueOf(OrderStatus.class, str);
    }

    public static OrderStatus[] values() {
        return (OrderStatus[]) $VALUES.clone();
    }

    public final int i() {
        return this.key;
    }
}
