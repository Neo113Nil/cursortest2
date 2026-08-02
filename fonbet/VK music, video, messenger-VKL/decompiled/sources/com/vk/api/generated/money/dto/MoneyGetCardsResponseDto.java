package com.vk.api.generated.money.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MoneyGetCardsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MoneyGetCardsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MoneyGetCardsResponseDto> CREATOR = new a();

    @pmi0("cards")
    private final MoneyCardsDto cards;

    @pmi0("selected_card")
    private final String selectedCard;

    /* compiled from: MoneyGetCardsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MoneyGetCardsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MoneyGetCardsResponseDto createFromParcel(Parcel parcel) {
            return new MoneyGetCardsResponseDto(parcel.readInt() == 0 ? null : MoneyCardsDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MoneyGetCardsResponseDto[] newArray(int i) {
            return new MoneyGetCardsResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MoneyGetCardsResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyGetCardsResponseDto)) {
            return false;
        }
        MoneyGetCardsResponseDto moneyGetCardsResponseDto = (MoneyGetCardsResponseDto) obj;
        return epx.f(this.cards, moneyGetCardsResponseDto.cards) && epx.f(this.selectedCard, moneyGetCardsResponseDto.selectedCard);
    }

    public final int hashCode() {
        MoneyCardsDto moneyCardsDto = this.cards;
        int hashCode = (moneyCardsDto == null ? 0 : moneyCardsDto.hashCode()) * 31;
        String str = this.selectedCard;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneyGetCardsResponseDto(cards=");
        sb.append(this.cards);
        sb.append(", selectedCard=");
        return ho8.a(sb, this.selectedCard, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MoneyCardsDto moneyCardsDto = this.cards;
        if (moneyCardsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            moneyCardsDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.selectedCard);
    }

    public MoneyGetCardsResponseDto(MoneyCardsDto moneyCardsDto, String str) {
        this.cards = moneyCardsDto;
        this.selectedCard = str;
    }

    public /* synthetic */ MoneyGetCardsResponseDto(MoneyCardsDto moneyCardsDto, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : moneyCardsDto, (i & 2) != 0 ? null : str);
    }
}
