package com.vk.superapp.vkpay.checkout.feature.confirmation.vkpay;

import xsna.epx;
import xsna.vu5;

/* compiled from: WalletPayMethod.kt */
/* loaded from: classes6.dex */
public final class WithCard extends WalletPayMethod {
    private final String bindId;
    private final int chargeAmount;

    public WithCard(String str, int i) {
        super(0);
        this.bindId = str;
        this.chargeAmount = i;
    }

    public final String d() {
        return this.bindId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WithCard)) {
            return false;
        }
        WithCard withCard = (WithCard) obj;
        return epx.f(this.bindId, withCard.bindId) && this.chargeAmount == withCard.chargeAmount;
    }

    public final int g() {
        return this.chargeAmount;
    }

    public final int hashCode() {
        return Integer.hashCode(this.chargeAmount) + (this.bindId.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WithCard(bindId=");
        sb.append(this.bindId);
        sb.append(", chargeAmount=");
        return vu5.b(sb, this.chargeAmount, ')');
    }
}
