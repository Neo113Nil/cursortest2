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

/* compiled from: MarketGetProductLinkedContentResponseObjectDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetProductLinkedContentResponseObjectDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetProductLinkedContentResponseObjectDto> CREATOR = new a();

    @pmi0("items")
    private final List<MarketProductLinkedContentItemDto> items;

    @pmi0("total_count")
    private final int totalCount;

    /* compiled from: MarketGetProductLinkedContentResponseObjectDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetProductLinkedContentResponseObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetProductLinkedContentResponseObjectDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(MarketProductLinkedContentItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MarketGetProductLinkedContentResponseObjectDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetProductLinkedContentResponseObjectDto[] newArray(int i) {
            return new MarketGetProductLinkedContentResponseObjectDto[i];
        }
    }

    public MarketGetProductLinkedContentResponseObjectDto(int i, List<MarketProductLinkedContentItemDto> list) {
        this.totalCount = i;
        this.items = list;
    }

    public final List<MarketProductLinkedContentItemDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.totalCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetProductLinkedContentResponseObjectDto)) {
            return false;
        }
        MarketGetProductLinkedContentResponseObjectDto marketGetProductLinkedContentResponseObjectDto = (MarketGetProductLinkedContentResponseObjectDto) obj;
        return this.totalCount == marketGetProductLinkedContentResponseObjectDto.totalCount && epx.f(this.items, marketGetProductLinkedContentResponseObjectDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.totalCount) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGetProductLinkedContentResponseObjectDto(totalCount=");
        sb.append(this.totalCount);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.totalCount);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((MarketProductLinkedContentItemDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
