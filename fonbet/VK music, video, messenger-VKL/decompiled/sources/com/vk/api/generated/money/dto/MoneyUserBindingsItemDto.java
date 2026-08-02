package com.vk.api.generated.money.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.DomainCampaignEx;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zrp;

/* compiled from: MoneyUserBindingsItemDto.kt */
/* loaded from: classes15.dex */
public final class MoneyUserBindingsItemDto implements Parcelable {
    public static final Parcelable.Creator<MoneyUserBindingsItemDto> CREATOR = new a();

    @pmi0("added")
    private final String added;

    @pmi0(DomainCampaignEx.KEY_BIND_ID)
    private final String bindId;

    @pmi0("card_type")
    private final CardTypeDto cardType;

    @pmi0("description")
    private final String description;

    @pmi0("exp_date")
    private final String expDate;

    @pmi0("pc_id")
    private final String pcId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MoneyUserBindingsItemDto.kt */
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

        /* compiled from: MoneyUserBindingsItemDto.kt */
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

    /* compiled from: MoneyUserBindingsItemDto.kt */
    public static final class a implements Parcelable.Creator<MoneyUserBindingsItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MoneyUserBindingsItemDto createFromParcel(Parcel parcel) {
            return new MoneyUserBindingsItemDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), CardTypeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MoneyUserBindingsItemDto[] newArray(int i) {
            return new MoneyUserBindingsItemDto[i];
        }
    }

    public MoneyUserBindingsItemDto(String str, String str2, String str3, String str4, String str5, CardTypeDto cardTypeDto) {
        this.bindId = str;
        this.pcId = str2;
        this.added = str3;
        this.description = str4;
        this.expDate = str5;
        this.cardType = cardTypeDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyUserBindingsItemDto)) {
            return false;
        }
        MoneyUserBindingsItemDto moneyUserBindingsItemDto = (MoneyUserBindingsItemDto) obj;
        return epx.f(this.bindId, moneyUserBindingsItemDto.bindId) && epx.f(this.pcId, moneyUserBindingsItemDto.pcId) && epx.f(this.added, moneyUserBindingsItemDto.added) && epx.f(this.description, moneyUserBindingsItemDto.description) && epx.f(this.expDate, moneyUserBindingsItemDto.expDate) && this.cardType == moneyUserBindingsItemDto.cardType;
    }

    public final int hashCode() {
        return this.cardType.hashCode() + urd0.a(urd0.a(urd0.a(urd0.a(this.bindId.hashCode() * 31, 31, this.pcId), 31, this.added), 31, this.description), 31, this.expDate);
    }

    public final String toString() {
        return "MoneyUserBindingsItemDto(bindId=" + this.bindId + ", pcId=" + this.pcId + ", added=" + this.added + ", description=" + this.description + ", expDate=" + this.expDate + ", cardType=" + this.cardType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.bindId);
        parcel.writeString(this.pcId);
        parcel.writeString(this.added);
        parcel.writeString(this.description);
        parcel.writeString(this.expDate);
        this.cardType.writeToParcel(parcel, i);
    }
}
