package com.vk.ecomm.reviews.impl.pinnedreview.domain;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PinReviewSubscriptionDetails.kt */
/* loaded from: classes18.dex */
public final class CardType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CardType[] $VALUES;
    public static final CardType AMEX;
    public static final CardType CREDIT_CARD;
    public static final CardType DINERSCLUB;
    public static final CardType JCB;
    public static final CardType MAESTRO;
    public static final CardType MASTERCARD;
    public static final CardType MIR;
    public static final CardType VISA;

    static {
        CardType cardType = new CardType("JCB", 0);
        JCB = cardType;
        CardType cardType2 = new CardType("DINERSCLUB", 1);
        DINERSCLUB = cardType2;
        CardType cardType3 = new CardType("MIR", 2);
        MIR = cardType3;
        CardType cardType4 = new CardType("AMEX", 3);
        AMEX = cardType4;
        CardType cardType5 = new CardType("MAESTRO", 4);
        MAESTRO = cardType5;
        CardType cardType6 = new CardType("VISA", 5);
        VISA = cardType6;
        CardType cardType7 = new CardType("MASTERCARD", 6);
        MASTERCARD = cardType7;
        CardType cardType8 = new CardType("CREDIT_CARD", 7);
        CREDIT_CARD = cardType8;
        CardType[] cardTypeArr = {cardType, cardType2, cardType3, cardType4, cardType5, cardType6, cardType7, cardType8};
        $VALUES = cardTypeArr;
        $ENTRIES = new asp(cardTypeArr);
    }

    public CardType() {
        throw null;
    }

    public static CardType valueOf(String str) {
        return (CardType) Enum.valueOf(CardType.class, str);
    }

    public static CardType[] values() {
        return (CardType[]) $VALUES.clone();
    }
}
