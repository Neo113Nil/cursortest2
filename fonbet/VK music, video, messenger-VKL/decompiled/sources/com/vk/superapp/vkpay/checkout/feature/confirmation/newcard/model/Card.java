package com.vk.superapp.vkpay.checkout.feature.confirmation.newcard.model;

import java.io.Serializable;
import xsna.epx;

/* compiled from: Card.kt */
/* loaded from: classes6.dex */
public final class Card implements Serializable {
    private final Cvc cvc;
    private final ExpireDate expireDate;
    private final Number number;

    public Card(Number number, ExpireDate expireDate, Cvc cvc) {
        this.number = number;
        this.expireDate = expireDate;
        this.cvc = cvc;
    }

    public final Number d() {
        return this.number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Card)) {
            return false;
        }
        Card card = (Card) obj;
        return epx.f(this.number, card.number) && epx.f(this.expireDate, card.expireDate) && epx.f(this.cvc, card.cvc);
    }

    public final ExpireDate g() {
        return this.expireDate;
    }

    public final Cvc h() {
        return this.cvc;
    }

    public final int hashCode() {
        return this.cvc.hashCode() + ((this.expireDate.hashCode() + (this.number.hashCode() * 31)) * 31);
    }

    public final Cvc i() {
        return this.cvc;
    }

    public final ExpireDate j() {
        return this.expireDate;
    }

    public final Number k() {
        return this.number;
    }

    public final String toString() {
        return "Card(number=" + this.number + ", expireDate=" + this.expireDate + ", cvc=" + this.cvc + ')';
    }
}
