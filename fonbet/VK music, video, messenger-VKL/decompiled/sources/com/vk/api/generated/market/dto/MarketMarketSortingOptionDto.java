package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MarketMarketSortingOptionDto.kt */
/* loaded from: classes15.dex */
public final class MarketMarketSortingOptionDto implements Parcelable {
    public static final Parcelable.Creator<MarketMarketSortingOptionDto> CREATOR = new a();

    @pmi0("id")
    private final MarketMarketSortingOptionIdDto id;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketMarketSortingOptionDto.kt */
    public static final class a implements Parcelable.Creator<MarketMarketSortingOptionDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketMarketSortingOptionDto createFromParcel(Parcel parcel) {
            return new MarketMarketSortingOptionDto(MarketMarketSortingOptionIdDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketMarketSortingOptionDto[] newArray(int i) {
            return new MarketMarketSortingOptionDto[i];
        }
    }

    public MarketMarketSortingOptionDto(MarketMarketSortingOptionIdDto marketMarketSortingOptionIdDto, String str) {
        this.id = marketMarketSortingOptionIdDto;
        this.title = str;
    }

    public final MarketMarketSortingOptionIdDto d() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketMarketSortingOptionDto)) {
            return false;
        }
        MarketMarketSortingOptionDto marketMarketSortingOptionDto = (MarketMarketSortingOptionDto) obj;
        return this.id == marketMarketSortingOptionDto.id && epx.f(this.title, marketMarketSortingOptionDto.title);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.title.hashCode() + (this.id.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketMarketSortingOptionDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.id.writeToParcel(parcel, i);
        parcel.writeString(this.title);
    }
}
