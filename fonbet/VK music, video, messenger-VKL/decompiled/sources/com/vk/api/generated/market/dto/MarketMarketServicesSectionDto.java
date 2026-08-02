package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: MarketMarketServicesSectionDto.kt */
/* loaded from: classes15.dex */
public final class MarketMarketServicesSectionDto implements Parcelable {
    public static final Parcelable.Creator<MarketMarketServicesSectionDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("id")
    private final String id;

    @pmi0("item_ids")
    private final List<String> itemIds;

    @pmi0("title")
    private final String title;

    @pmi0("view_type")
    private final MarketServicesViewTypeDto viewType;

    /* compiled from: MarketMarketServicesSectionDto.kt */
    public static final class a implements Parcelable.Creator<MarketMarketServicesSectionDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketMarketServicesSectionDto createFromParcel(Parcel parcel) {
            return new MarketMarketServicesSectionDto(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), MarketServicesViewTypeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketMarketServicesSectionDto[] newArray(int i) {
            return new MarketMarketServicesSectionDto[i];
        }
    }

    public MarketMarketServicesSectionDto(int i, String str, String str2, List<String> list, MarketServicesViewTypeDto marketServicesViewTypeDto) {
        this.count = i;
        this.id = str;
        this.title = str2;
        this.itemIds = list;
        this.viewType = marketServicesViewTypeDto;
    }

    public final List<String> d() {
        return this.itemIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MarketServicesViewTypeDto e() {
        return this.viewType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketMarketServicesSectionDto)) {
            return false;
        }
        MarketMarketServicesSectionDto marketMarketServicesSectionDto = (MarketMarketServicesSectionDto) obj;
        return this.count == marketMarketServicesSectionDto.count && epx.f(this.id, marketMarketServicesSectionDto.id) && epx.f(this.title, marketMarketServicesSectionDto.title) && epx.f(this.itemIds, marketMarketServicesSectionDto.itemIds) && this.viewType == marketMarketServicesSectionDto.viewType;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.viewType.hashCode() + fw3.a(urd0.a(urd0.a(Integer.hashCode(this.count) * 31, 31, this.id), 31, this.title), 31, this.itemIds);
    }

    public final String toString() {
        return "MarketMarketServicesSectionDto(count=" + this.count + ", id=" + this.id + ", title=" + this.title + ", itemIds=" + this.itemIds + ", viewType=" + this.viewType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeStringList(this.itemIds);
        this.viewType.writeToParcel(parcel, i);
    }
}
