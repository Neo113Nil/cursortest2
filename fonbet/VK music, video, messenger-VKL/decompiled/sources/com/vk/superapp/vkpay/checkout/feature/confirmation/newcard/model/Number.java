package com.vk.superapp.vkpay.checkout.feature.confirmation.newcard.model;

import java.io.Serializable;
import xsna.epx;
import xsna.ho8;
import xsna.ro;

/* compiled from: Number.kt */
/* loaded from: classes6.dex */
public final class Number implements Serializable {
    private final String value;

    public Number(String str) {
        this.value = str;
        int length = str.length();
        if (length < 16 || length > 19) {
            throw new IllegalArgumentException("Card number must have 16..19 digits");
        }
        int f = ro.f(str.charAt(str.length() - 1));
        int length2 = str.length() % 2;
        for (int length3 = str.length() - 2; -1 < length3; length3--) {
            int f2 = ro.f(str.charAt(length3));
            if (length3 % 2 == length2 && (f2 = f2 * 2) > 9) {
                f2 -= 9;
            }
            f += f2;
        }
        if (f % 10 != 0) {
            throw new IllegalArgumentException("Invalid card number");
        }
    }

    public final String d() {
        return this.value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Number) && epx.f(this.value, ((Number) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Number(value="), this.value, ')');
    }
}
