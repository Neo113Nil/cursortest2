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
import xsna.shy;

/* compiled from: MarketUserReviewsItemsResponseObjectDto.kt */
/* loaded from: classes15.dex */
public final class MarketUserReviewsItemsResponseObjectDto implements Parcelable {
    public static final Parcelable.Creator<MarketUserReviewsItemsResponseObjectDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items_reviews")
    private final List<MarketUserReviewsItemsReviewDto> itemsReviews;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketUserReviewsItemsResponseObjectDto.kt */
    public static final class a implements Parcelable.Creator<MarketUserReviewsItemsResponseObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketUserReviewsItemsResponseObjectDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(MarketUserReviewsItemsReviewDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MarketUserReviewsItemsResponseObjectDto(readString, readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketUserReviewsItemsResponseObjectDto[] newArray(int i) {
            return new MarketUserReviewsItemsResponseObjectDto[i];
        }
    }

    public MarketUserReviewsItemsResponseObjectDto(String str, int i, List<MarketUserReviewsItemsReviewDto> list) {
        this.title = str;
        this.count = i;
        this.itemsReviews = list;
    }

    public final List<MarketUserReviewsItemsReviewDto> d() {
        return this.itemsReviews;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketUserReviewsItemsResponseObjectDto)) {
            return false;
        }
        MarketUserReviewsItemsResponseObjectDto marketUserReviewsItemsResponseObjectDto = (MarketUserReviewsItemsResponseObjectDto) obj;
        return epx.f(this.title, marketUserReviewsItemsResponseObjectDto.title) && this.count == marketUserReviewsItemsResponseObjectDto.count && epx.f(this.itemsReviews, marketUserReviewsItemsResponseObjectDto.itemsReviews);
    }

    public final int getCount() {
        return this.count;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.itemsReviews.hashCode() + shy.a(this.count, this.title.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketUserReviewsItemsResponseObjectDto(title=");
        sb.append(this.title);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", itemsReviews=");
        return ms9.a(')', sb, this.itemsReviews);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.itemsReviews);
        while (a2.hasNext()) {
            ((MarketUserReviewsItemsReviewDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
