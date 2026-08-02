package com.vk.ecomm.cart.impl.checkout.ui.compose.item;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CheckoutPriceRow.kt */
/* loaded from: classes18.dex */
public final class CheckoutCell$Type {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CheckoutCell$Type[] $VALUES;
    public static final CheckoutCell$Type Base;
    public static final CheckoutCell$Type Total;

    static {
        CheckoutCell$Type checkoutCell$Type = new CheckoutCell$Type("Base", 0);
        Base = checkoutCell$Type;
        CheckoutCell$Type checkoutCell$Type2 = new CheckoutCell$Type("Total", 1);
        Total = checkoutCell$Type2;
        CheckoutCell$Type[] checkoutCell$TypeArr = {checkoutCell$Type, checkoutCell$Type2};
        $VALUES = checkoutCell$TypeArr;
        $ENTRIES = new asp(checkoutCell$TypeArr);
    }

    public CheckoutCell$Type() {
        throw null;
    }

    public static CheckoutCell$Type valueOf(String str) {
        return (CheckoutCell$Type) Enum.valueOf(CheckoutCell$Type.class, str);
    }

    public static CheckoutCell$Type[] values() {
        return (CheckoutCell$Type[]) $VALUES.clone();
    }
}
