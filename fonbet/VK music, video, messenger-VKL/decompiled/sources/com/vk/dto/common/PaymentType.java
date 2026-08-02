package com.vk.dto.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes18.dex */
public final class PaymentType {
    private static final /* synthetic */ PaymentType[] $VALUES;
    public static final PaymentType Balance;
    public static final PaymentType Inapp;
    public static final PaymentType Subs;

    static {
        PaymentType paymentType = new PaymentType("Balance", 0);
        Balance = paymentType;
        PaymentType paymentType2 = new PaymentType("Inapp", 1);
        Inapp = paymentType2;
        PaymentType paymentType3 = new PaymentType("Subs", 2);
        Subs = paymentType3;
        $VALUES = new PaymentType[]{paymentType, paymentType2, paymentType3};
    }

    public PaymentType() {
        throw null;
    }

    public static PaymentType valueOf(String str) {
        return (PaymentType) Enum.valueOf(PaymentType.class, str);
    }

    public static PaymentType[] values() {
        return (PaymentType[]) $VALUES.clone();
    }
}
