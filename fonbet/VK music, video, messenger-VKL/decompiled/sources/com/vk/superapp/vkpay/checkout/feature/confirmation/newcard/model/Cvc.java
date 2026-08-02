package com.vk.superapp.vkpay.checkout.feature.confirmation.newcard.model;

import java.io.Serializable;
import kotlin.text.Regex;
import xsna.epx;
import xsna.ho8;

/* compiled from: Cvc.kt */
/* loaded from: classes6.dex */
public final class Cvc implements Serializable {
    public static final Regex b = new Regex("\\d{3}");
    private final String value;

    public Cvc(String str) {
        this.value = str;
        if (!b.f(str)) {
            throw new IllegalArgumentException("Cvc must have only 3 digits");
        }
    }

    public final String d() {
        return this.value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Cvc) && epx.f(this.value, ((Cvc) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Cvc(value="), this.value, ')');
    }
}
