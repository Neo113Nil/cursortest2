package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: MarketMarketCategoryMappingDto.kt */
/* loaded from: classes15.dex */
public final class MarketMarketCategoryMappingDto implements Parcelable {
    public static final Parcelable.Creator<MarketMarketCategoryMappingDto> CREATOR = new a();

    @pmi0("items")
    private final List<String> items;

    @pmi0("mapping")
    private final String mapping;

    /* compiled from: MarketMarketCategoryMappingDto.kt */
    public static final class a implements Parcelable.Creator<MarketMarketCategoryMappingDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketMarketCategoryMappingDto createFromParcel(Parcel parcel) {
            return new MarketMarketCategoryMappingDto(parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketMarketCategoryMappingDto[] newArray(int i) {
            return new MarketMarketCategoryMappingDto[i];
        }
    }

    public MarketMarketCategoryMappingDto(String str, List<String> list) {
        this.mapping = str;
        this.items = list;
    }

    public final List<String> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.mapping;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketMarketCategoryMappingDto)) {
            return false;
        }
        MarketMarketCategoryMappingDto marketMarketCategoryMappingDto = (MarketMarketCategoryMappingDto) obj;
        return epx.f(this.mapping, marketMarketCategoryMappingDto.mapping) && epx.f(this.items, marketMarketCategoryMappingDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (this.mapping.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketMarketCategoryMappingDto(mapping=");
        sb.append(this.mapping);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mapping);
        parcel.writeStringList(this.items);
    }
}
