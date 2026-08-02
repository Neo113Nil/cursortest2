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

/* compiled from: MarketRelatedCategoriesBlockDto.kt */
/* loaded from: classes15.dex */
public final class MarketRelatedCategoriesBlockDto implements Parcelable {
    public static final Parcelable.Creator<MarketRelatedCategoriesBlockDto> CREATOR = new a();

    @pmi0("related_categories")
    private final List<MarketRelatedCategoryDto> relatedCategories;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketRelatedCategoriesBlockDto.kt */
    public static final class a implements Parcelable.Creator<MarketRelatedCategoriesBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketRelatedCategoriesBlockDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MarketRelatedCategoryDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MarketRelatedCategoriesBlockDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketRelatedCategoriesBlockDto[] newArray(int i) {
            return new MarketRelatedCategoriesBlockDto[i];
        }
    }

    public MarketRelatedCategoriesBlockDto(String str, List<MarketRelatedCategoryDto> list) {
        this.title = str;
        this.relatedCategories = list;
    }

    public final List<MarketRelatedCategoryDto> d() {
        return this.relatedCategories;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketRelatedCategoriesBlockDto)) {
            return false;
        }
        MarketRelatedCategoriesBlockDto marketRelatedCategoriesBlockDto = (MarketRelatedCategoriesBlockDto) obj;
        return epx.f(this.title, marketRelatedCategoriesBlockDto.title) && epx.f(this.relatedCategories, marketRelatedCategoriesBlockDto.relatedCategories);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.relatedCategories.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketRelatedCategoriesBlockDto(title=");
        sb.append(this.title);
        sb.append(", relatedCategories=");
        return ms9.a(')', sb, this.relatedCategories);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        Iterator a2 = ao.a(parcel, this.relatedCategories);
        while (a2.hasNext()) {
            ((MarketRelatedCategoryDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
