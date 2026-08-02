package com.vk.superapp.vkpay.checkout.data.model;

import xsna.erm0;

/* compiled from: PayMethodData.kt */
/* loaded from: classes6.dex */
public class Card extends PayMethodData {
    private final String cardMask;
    private final String expDate;
    private final String id;
    private final CreditCard issuer;
    private final String statName;

    public Card() {
        this(null, 15);
    }

    public final String getId() {
        return this.id;
    }

    @Override // com.vk.superapp.vkpay.checkout.data.model.PayMethodData
    public final String h() {
        return this.statName;
    }

    public final String i() {
        return this.cardMask;
    }

    public final String j() {
        return this.expDate;
    }

    public final CreditCard k() {
        return this.issuer;
    }

    public /* synthetic */ Card(String str, int i) {
        this("", (i & 2) != 0 ? "" : str, "", CreditCard.UNKNOWN);
    }

    public Card(String str, String str2, String str3, CreditCard creditCard) {
        super(0);
        this.id = str;
        this.cardMask = str2;
        this.expDate = str3;
        this.issuer = creditCard;
        this.statName = "card_".concat(erm0.E0(4, str2));
    }
}
