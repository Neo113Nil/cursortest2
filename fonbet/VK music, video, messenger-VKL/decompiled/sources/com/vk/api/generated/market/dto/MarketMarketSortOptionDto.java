package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MarketMarketSortOptionDto.kt */
/* loaded from: classes15.dex */
public final class MarketMarketSortOptionDto implements Parcelable {
    public static final Parcelable.Creator<MarketMarketSortOptionDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketMarketSortOptionDto.kt */
    public static final class a implements Parcelable.Creator<MarketMarketSortOptionDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketMarketSortOptionDto createFromParcel(Parcel parcel) {
            return new MarketMarketSortOptionDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketMarketSortOptionDto[] newArray(int i) {
            return new MarketMarketSortOptionDto[i];
        }
    }

    public MarketMarketSortOptionDto(String str, String str2) {
        this.id = str;
        this.title = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketMarketSortOptionDto)) {
            return false;
        }
        MarketMarketSortOptionDto marketMarketSortOptionDto = (MarketMarketSortOptionDto) obj;
        return epx.f(this.id, marketMarketSortOptionDto.id) && epx.f(this.title, marketMarketSortOptionDto.title);
    }

    public final int hashCode() {
        return this.title.hashCode() + (this.id.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketMarketSortOptionDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
    }
}
