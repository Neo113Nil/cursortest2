package com.vk.ecomm.reviews.impl.subscriptionpayment.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PaymentResult.kt */
/* loaded from: classes18.dex */
public final class PaymentResult {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PaymentResult[] $VALUES;
    public static final PaymentResult CANCEL;
    public static final PaymentResult FAIL;
    public static final PaymentResult SUCCESS;

    static {
        PaymentResult paymentResult = new PaymentResult("SUCCESS", 0);
        SUCCESS = paymentResult;
        PaymentResult paymentResult2 = new PaymentResult("FAIL", 1);
        FAIL = paymentResult2;
        PaymentResult paymentResult3 = new PaymentResult("CANCEL", 2);
        CANCEL = paymentResult3;
        PaymentResult[] paymentResultArr = {paymentResult, paymentResult2, paymentResult3};
        $VALUES = paymentResultArr;
        $ENTRIES = new asp(paymentResultArr);
    }

    public PaymentResult() {
        throw null;
    }

    public static PaymentResult valueOf(String str) {
        return (PaymentResult) Enum.valueOf(PaymentResult.class, str);
    }

    public static PaymentResult[] values() {
        return (PaymentResult[]) $VALUES.clone();
    }
}
