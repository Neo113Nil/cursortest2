package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MarketItemCharacteristicValueDto.kt */
/* loaded from: classes15.dex */
public final class MarketItemCharacteristicValueDto implements Parcelable {
    public static final Parcelable.Creator<MarketItemCharacteristicValueDto> CREATOR = new a();

    @pmi0("text")
    private final String text;

    /* compiled from: MarketItemCharacteristicValueDto.kt */
    public static final class a implements Parcelable.Creator<MarketItemCharacteristicValueDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemCharacteristicValueDto createFromParcel(Parcel parcel) {
            return new MarketItemCharacteristicValueDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemCharacteristicValueDto[] newArray(int i) {
            return new MarketItemCharacteristicValueDto[i];
        }
    }

    public MarketItemCharacteristicValueDto(String str) {
        this.text = str;
    }

    public final String d() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketItemCharacteristicValueDto) && epx.f(this.text, ((MarketItemCharacteristicValueDto) obj).text);
    }

    public final int hashCode() {
        return this.text.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("MarketItemCharacteristicValueDto(text="), this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
    }
}
