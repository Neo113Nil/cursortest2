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

/* compiled from: MarketUserReviewsItemsForReviewObjectDto.kt */
/* loaded from: classes15.dex */
public final class MarketUserReviewsItemsForReviewObjectDto implements Parcelable {
    public static final Parcelable.Creator<MarketUserReviewsItemsForReviewObjectDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<MarketItemForReviewDto> items;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketUserReviewsItemsForReviewObjectDto.kt */
    public static final class a implements Parcelable.Creator<MarketUserReviewsItemsForReviewObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketUserReviewsItemsForReviewObjectDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(MarketItemForReviewDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MarketUserReviewsItemsForReviewObjectDto(readString, readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketUserReviewsItemsForReviewObjectDto[] newArray(int i) {
            return new MarketUserReviewsItemsForReviewObjectDto[i];
        }
    }

    public MarketUserReviewsItemsForReviewObjectDto(String str, int i, List<MarketItemForReviewDto> list) {
        this.title = str;
        this.count = i;
        this.items = list;
    }

    public final List<MarketItemForReviewDto> d() {
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
        if (!(obj instanceof MarketUserReviewsItemsForReviewObjectDto)) {
            return false;
        }
        MarketUserReviewsItemsForReviewObjectDto marketUserReviewsItemsForReviewObjectDto = (MarketUserReviewsItemsForReviewObjectDto) obj;
        return epx.f(this.title, marketUserReviewsItemsForReviewObjectDto.title) && this.count == marketUserReviewsItemsForReviewObjectDto.count && epx.f(this.items, marketUserReviewsItemsForReviewObjectDto.items);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.items.hashCode() + shy.a(this.count, this.title.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketUserReviewsItemsForReviewObjectDto(title=");
        sb.append(this.title);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((MarketItemForReviewDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
