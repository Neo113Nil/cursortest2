package com.vk.ecomm.cart.impl.checkout.ui.compose.item;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CheckoutPriceRow.kt */
/* loaded from: classes18.dex */
public final class CheckoutCell$State {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CheckoutCell$State[] $VALUES;
    public static final CheckoutCell$State Negative;
    public static final CheckoutCell$State Normal;

    static {
        CheckoutCell$State checkoutCell$State = new CheckoutCell$State("Normal", 0);
        Normal = checkoutCell$State;
        CheckoutCell$State checkoutCell$State2 = new CheckoutCell$State("Negative", 1);
        Negative = checkoutCell$State2;
        CheckoutCell$State[] checkoutCell$StateArr = {checkoutCell$State, checkoutCell$State2};
        $VALUES = checkoutCell$StateArr;
        $ENTRIES = new asp(checkoutCell$StateArr);
    }

    public CheckoutCell$State() {
        throw null;
    }

    public static CheckoutCell$State valueOf(String str) {
        return (CheckoutCell$State) Enum.valueOf(CheckoutCell$State.class, str);
    }

    public static CheckoutCell$State[] values() {
        return (CheckoutCell$State[]) $VALUES.clone();
    }
}
