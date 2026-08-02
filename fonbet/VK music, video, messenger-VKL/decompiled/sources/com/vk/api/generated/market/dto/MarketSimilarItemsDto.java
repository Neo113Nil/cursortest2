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

/* compiled from: MarketSimilarItemsDto.kt */
/* loaded from: classes15.dex */
public final class MarketSimilarItemsDto implements Parcelable {
    public static final Parcelable.Creator<MarketSimilarItemsDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("item_id")
    private final String itemId;

    @pmi0("items")
    private final List<MarketMarketItemBasicWithGroupDto> items;

    /* compiled from: MarketSimilarItemsDto.kt */
    public static final class a implements Parcelable.Creator<MarketSimilarItemsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSimilarItemsDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(MarketMarketItemBasicWithGroupDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MarketSimilarItemsDto(readString, readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSimilarItemsDto[] newArray(int i) {
            return new MarketSimilarItemsDto[i];
        }
    }

    public MarketSimilarItemsDto(String str, int i, List<MarketMarketItemBasicWithGroupDto> list) {
        this.itemId = str;
        this.count = i;
        this.items = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketSimilarItemsDto)) {
            return false;
        }
        MarketSimilarItemsDto marketSimilarItemsDto = (MarketSimilarItemsDto) obj;
        return epx.f(this.itemId, marketSimilarItemsDto.itemId) && this.count == marketSimilarItemsDto.count && epx.f(this.items, marketSimilarItemsDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + shy.a(this.count, this.itemId.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketSimilarItemsDto(itemId=");
        sb.append(this.itemId);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.itemId);
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((MarketMarketItemBasicWithGroupDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
