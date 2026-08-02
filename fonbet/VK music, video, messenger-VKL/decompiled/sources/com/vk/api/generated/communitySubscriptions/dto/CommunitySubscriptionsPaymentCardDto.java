package com.vk.api.generated.communitySubscriptions.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommunitySubscriptionsPaymentCardDto.kt */
/* loaded from: classes14.dex */
public final class CommunitySubscriptionsPaymentCardDto implements Parcelable {
    public static final Parcelable.Creator<CommunitySubscriptionsPaymentCardDto> CREATOR = new a();

    @pmi0("card_number")
    private final String cardNumber;

    @pmi0("card_type")
    private final CardTypeDto cardType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommunitySubscriptionsPaymentCardDto.kt */
    public static final class CardTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CardTypeDto[] $VALUES;

        @pmi0("AmEx")
        public static final CardTypeDto AMEX;
        public static final Parcelable.Creator<CardTypeDto> CREATOR;

        @pmi0("Credit card")
        public static final CardTypeDto CREDIT_CARD;

        @pmi0("DinersClub")
        public static final CardTypeDto DINERSCLUB;

        @pmi0("JCB")
        public static final CardTypeDto JCB;

        @pmi0("Maestro")
        public static final CardTypeDto MAESTRO;

        @pmi0("Mastercard")
        public static final CardTypeDto MASTERCARD;

        @pmi0("MIR")
        public static final CardTypeDto MIR;

        @pmi0("VISA")
        public static final CardTypeDto VISA;
        private final String value;

        /* compiled from: CommunitySubscriptionsPaymentCardDto.kt */
        public static final class a implements Parcelable.Creator<CardTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final CardTypeDto createFromParcel(Parcel parcel) {
                return CardTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CardTypeDto[] newArray(int i) {
                return new CardTypeDto[i];
            }
        }

        static {
            CardTypeDto cardTypeDto = new CardTypeDto("JCB", 0, "JCB");
            JCB = cardTypeDto;
            CardTypeDto cardTypeDto2 = new CardTypeDto("DINERSCLUB", 1, "DinersClub");
            DINERSCLUB = cardTypeDto2;
            CardTypeDto cardTypeDto3 = new CardTypeDto("MIR", 2, "MIR");
            MIR = cardTypeDto3;
            CardTypeDto cardTypeDto4 = new CardTypeDto("AMEX", 3, "AmEx");
            AMEX = cardTypeDto4;
            CardTypeDto cardTypeDto5 = new CardTypeDto("MAESTRO", 4, "Maestro");
            MAESTRO = cardTypeDto5;
            CardTypeDto cardTypeDto6 = new CardTypeDto("VISA", 5, "VISA");
            VISA = cardTypeDto6;
            CardTypeDto cardTypeDto7 = new CardTypeDto("MASTERCARD", 6, "Mastercard");
            MASTERCARD = cardTypeDto7;
            CardTypeDto cardTypeDto8 = new CardTypeDto("CREDIT_CARD", 7, "Credit card");
            CREDIT_CARD = cardTypeDto8;
            CardTypeDto[] cardTypeDtoArr = {cardTypeDto, cardTypeDto2, cardTypeDto3, cardTypeDto4, cardTypeDto5, cardTypeDto6, cardTypeDto7, cardTypeDto8};
            $VALUES = cardTypeDtoArr;
            $ENTRIES = new asp(cardTypeDtoArr);
            CREATOR = new a();
        }

        private CardTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static CardTypeDto valueOf(String str) {
            return (CardTypeDto) Enum.valueOf(CardTypeDto.class, str);
        }

        public static CardTypeDto[] values() {
            return (CardTypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: CommunitySubscriptionsPaymentCardDto.kt */
    public static final class a implements Parcelable.Creator<CommunitySubscriptionsPaymentCardDto> {
        @Override // android.os.Parcelable.Creator
        public final CommunitySubscriptionsPaymentCardDto createFromParcel(Parcel parcel) {
            return new CommunitySubscriptionsPaymentCardDto(CardTypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CommunitySubscriptionsPaymentCardDto[] newArray(int i) {
            return new CommunitySubscriptionsPaymentCardDto[i];
        }
    }

    public CommunitySubscriptionsPaymentCardDto(CardTypeDto cardTypeDto, String str) {
        this.cardType = cardTypeDto;
        this.cardNumber = str;
    }

    public final String d() {
        return this.cardNumber;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final CardTypeDto e() {
        return this.cardType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunitySubscriptionsPaymentCardDto)) {
            return false;
        }
        CommunitySubscriptionsPaymentCardDto communitySubscriptionsPaymentCardDto = (CommunitySubscriptionsPaymentCardDto) obj;
        return this.cardType == communitySubscriptionsPaymentCardDto.cardType && epx.f(this.cardNumber, communitySubscriptionsPaymentCardDto.cardNumber);
    }

    public final int hashCode() {
        return this.cardNumber.hashCode() + (this.cardType.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunitySubscriptionsPaymentCardDto(cardType=");
        sb.append(this.cardType);
        sb.append(", cardNumber=");
        return ho8.a(sb, this.cardNumber, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.cardType.writeToParcel(parcel, i);
        parcel.writeString(this.cardNumber);
    }
}
