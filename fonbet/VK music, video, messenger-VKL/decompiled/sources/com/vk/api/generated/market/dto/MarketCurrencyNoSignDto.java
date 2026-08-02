package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MarketCurrencyNoSignDto.kt */
/* loaded from: classes15.dex */
public final class MarketCurrencyNoSignDto implements Parcelable {
    public static final Parcelable.Creator<MarketCurrencyNoSignDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketCurrencyNoSignDto.kt */
    public static final class a implements Parcelable.Creator<MarketCurrencyNoSignDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCurrencyNoSignDto createFromParcel(Parcel parcel) {
            return new MarketCurrencyNoSignDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCurrencyNoSignDto[] newArray(int i) {
            return new MarketCurrencyNoSignDto[i];
        }
    }

    public MarketCurrencyNoSignDto(int i, String str) {
        this.id = i;
        this.title = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCurrencyNoSignDto)) {
            return false;
        }
        MarketCurrencyNoSignDto marketCurrencyNoSignDto = (MarketCurrencyNoSignDto) obj;
        return this.id == marketCurrencyNoSignDto.id && epx.f(this.title, marketCurrencyNoSignDto.title);
    }

    public final int hashCode() {
        return this.title.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCurrencyNoSignDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
    }
}
