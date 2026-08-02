package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: MarketGetCategoriesNewResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetCategoriesNewResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetCategoriesNewResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<MarketMarketCategoryTreeDto> items;

    /* compiled from: MarketGetCategoriesNewResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetCategoriesNewResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetCategoriesNewResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MarketMarketCategoryTreeDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MarketGetCategoriesNewResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetCategoriesNewResponseDto[] newArray(int i) {
            return new MarketGetCategoriesNewResponseDto[i];
        }
    }

    public MarketGetCategoriesNewResponseDto(List<MarketMarketCategoryTreeDto> list) {
        this.items = list;
    }

    public final List<MarketMarketCategoryTreeDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketGetCategoriesNewResponseDto) && epx.f(this.items, ((MarketGetCategoriesNewResponseDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MarketGetCategoriesNewResponseDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((MarketMarketCategoryTreeDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
