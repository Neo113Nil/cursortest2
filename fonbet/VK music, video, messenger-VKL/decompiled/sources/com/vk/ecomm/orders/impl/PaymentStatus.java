package com.vk.ecomm.orders.impl;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PaymentStatus.kt */
/* loaded from: classes18.dex */
public final class PaymentStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PaymentStatus[] $VALUES;
    public static final PaymentStatus CANCEL;
    public static final PaymentStatus FAIL;
    public static final PaymentStatus SUCCESS;
    private final int code;

    static {
        PaymentStatus paymentStatus = new PaymentStatus("CANCEL", 0, 0);
        CANCEL = paymentStatus;
        PaymentStatus paymentStatus2 = new PaymentStatus("SUCCESS", 1, 1);
        SUCCESS = paymentStatus2;
        PaymentStatus paymentStatus3 = new PaymentStatus("FAIL", 2, 2);
        FAIL = paymentStatus3;
        PaymentStatus[] paymentStatusArr = {paymentStatus, paymentStatus2, paymentStatus3};
        $VALUES = paymentStatusArr;
        $ENTRIES = new asp(paymentStatusArr);
    }

    public PaymentStatus(String str, int i, int i2) {
        this.code = i2;
    }

    public static PaymentStatus valueOf(String str) {
        return (PaymentStatus) Enum.valueOf(PaymentStatus.class, str);
    }

    public static PaymentStatus[] values() {
        return (PaymentStatus[]) $VALUES.clone();
    }

    public final int h() {
        return this.code;
    }
}
