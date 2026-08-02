package com.vk.superapp.vkpay.checkout.feature.confirmation.vkpay;

import com.vk.superapp.vkpay.checkout.feature.confirmation.newcard.model.Card;
import xsna.epx;
import xsna.vu5;

/* compiled from: WalletPayMethod.kt */
/* loaded from: classes6.dex */
public final class NewCard extends WalletPayMethod {
    private final Card cardData;
    private final int chargeAmount;

    public NewCard(Card card, int i) {
        super(0);
        this.cardData = card;
        this.chargeAmount = i;
    }

    public final Card d() {
        return this.cardData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewCard)) {
            return false;
        }
        NewCard newCard = (NewCard) obj;
        return epx.f(this.cardData, newCard.cardData) && this.chargeAmount == newCard.chargeAmount;
    }

    public final int g() {
        return this.chargeAmount;
    }

    public final int hashCode() {
        return Integer.hashCode(this.chargeAmount) + (this.cardData.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewCard(cardData=");
        sb.append(this.cardData);
        sb.append(", chargeAmount=");
        return vu5.b(sb, this.chargeAmount, ')');
    }
}
