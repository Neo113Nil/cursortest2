package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: MarketCatalogDistanceOptionDto.kt */
/* loaded from: classes15.dex */
public final class MarketCatalogDistanceOptionDto implements Parcelable {
    public static final Parcelable.Creator<MarketCatalogDistanceOptionDto> CREATOR = new a();

    @pmi0("title")
    private final String title;

    @pmi0("value")
    private final int value;

    /* compiled from: MarketCatalogDistanceOptionDto.kt */
    public static final class a implements Parcelable.Creator<MarketCatalogDistanceOptionDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCatalogDistanceOptionDto createFromParcel(Parcel parcel) {
            return new MarketCatalogDistanceOptionDto(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCatalogDistanceOptionDto[] newArray(int i) {
            return new MarketCatalogDistanceOptionDto[i];
        }
    }

    public MarketCatalogDistanceOptionDto(String str, int i) {
        this.title = str;
        this.value = i;
    }

    public final int d() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCatalogDistanceOptionDto)) {
            return false;
        }
        MarketCatalogDistanceOptionDto marketCatalogDistanceOptionDto = (MarketCatalogDistanceOptionDto) obj;
        return epx.f(this.title, marketCatalogDistanceOptionDto.title) && this.value == marketCatalogDistanceOptionDto.value;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value) + (this.title.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCatalogDistanceOptionDto(title=");
        sb.append(this.title);
        sb.append(", value=");
        return vu5.b(sb, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeInt(this.value);
    }
}
