package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: MarketCurrencyDto.kt */
/* loaded from: classes15.dex */
public final class MarketCurrencyDto implements Parcelable {
    public static final Parcelable.Creator<MarketCurrencyDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketCurrencyDto.kt */
    public static final class a implements Parcelable.Creator<MarketCurrencyDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCurrencyDto createFromParcel(Parcel parcel) {
            return new MarketCurrencyDto(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCurrencyDto[] newArray(int i) {
            return new MarketCurrencyDto[i];
        }
    }

    public MarketCurrencyDto(int i, String str, String str2) {
        this.id = i;
        this.name = str;
        this.title = str2;
    }

    public final String d() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCurrencyDto)) {
            return false;
        }
        MarketCurrencyDto marketCurrencyDto = (MarketCurrencyDto) obj;
        return this.id == marketCurrencyDto.id && epx.f(this.name, marketCurrencyDto.name) && epx.f(this.title, marketCurrencyDto.title);
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.title.hashCode() + urd0.a(Integer.hashCode(this.id) * 31, 31, this.name);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCurrencyDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.title);
    }
}
