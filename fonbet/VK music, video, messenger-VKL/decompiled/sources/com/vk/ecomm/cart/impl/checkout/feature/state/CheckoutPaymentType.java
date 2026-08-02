package com.vk.ecomm.cart.impl.checkout.feature.state;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CheckoutPaymentType.kt */
/* loaded from: classes18.dex */
public final class CheckoutPaymentType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CheckoutPaymentType[] $VALUES;
    public static final a Companion;
    public static final CheckoutPaymentType IN_CHAT;
    public static final CheckoutPaymentType NOW;
    private final String value;

    /* compiled from: CheckoutPaymentType.kt */
    public static final class a {
    }

    static {
        CheckoutPaymentType checkoutPaymentType = new CheckoutPaymentType("NOW", 0, "now");
        NOW = checkoutPaymentType;
        CheckoutPaymentType checkoutPaymentType2 = new CheckoutPaymentType("IN_CHAT", 1, "in_chat");
        IN_CHAT = checkoutPaymentType2;
        CheckoutPaymentType[] checkoutPaymentTypeArr = {checkoutPaymentType, checkoutPaymentType2};
        $VALUES = checkoutPaymentTypeArr;
        $ENTRIES = new asp(checkoutPaymentTypeArr);
        Companion = new a();
    }

    public CheckoutPaymentType(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<CheckoutPaymentType> h() {
        return $ENTRIES;
    }

    public static CheckoutPaymentType valueOf(String str) {
        return (CheckoutPaymentType) Enum.valueOf(CheckoutPaymentType.class, str);
    }

    public static CheckoutPaymentType[] values() {
        return (CheckoutPaymentType[]) $VALUES.clone();
    }

    public final String i() {
        return this.value;
    }
}
