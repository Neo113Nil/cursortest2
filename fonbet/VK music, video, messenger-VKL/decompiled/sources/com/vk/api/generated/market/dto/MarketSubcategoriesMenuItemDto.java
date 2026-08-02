package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: MarketSubcategoriesMenuItemDto.kt */
/* loaded from: classes15.dex */
public final class MarketSubcategoriesMenuItemDto implements Parcelable {
    public static final Parcelable.Creator<MarketSubcategoriesMenuItemDto> CREATOR = new a();

    @pmi0("category")
    private final MarketMarketCategoryDto category;

    /* compiled from: MarketSubcategoriesMenuItemDto.kt */
    public static final class a implements Parcelable.Creator<MarketSubcategoriesMenuItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSubcategoriesMenuItemDto createFromParcel(Parcel parcel) {
            return new MarketSubcategoriesMenuItemDto((MarketMarketCategoryDto) parcel.readParcelable(MarketSubcategoriesMenuItemDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSubcategoriesMenuItemDto[] newArray(int i) {
            return new MarketSubcategoriesMenuItemDto[i];
        }
    }

    public MarketSubcategoriesMenuItemDto(MarketMarketCategoryDto marketMarketCategoryDto) {
        this.category = marketMarketCategoryDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketSubcategoriesMenuItemDto) && epx.f(this.category, ((MarketSubcategoriesMenuItemDto) obj).category);
    }

    public final int hashCode() {
        return this.category.hashCode();
    }

    public final String toString() {
        return "MarketSubcategoriesMenuItemDto(category=" + this.category + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.category, i);
    }
}
