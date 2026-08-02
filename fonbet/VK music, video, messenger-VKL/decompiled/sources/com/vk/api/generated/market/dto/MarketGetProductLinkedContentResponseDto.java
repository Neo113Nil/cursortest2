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

/* compiled from: MarketGetProductLinkedContentResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetProductLinkedContentResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetProductLinkedContentResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<MarketProductLinkedContentItemDto> items;

    @pmi0("total_count")
    private final int totalCount;

    /* compiled from: MarketGetProductLinkedContentResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetProductLinkedContentResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetProductLinkedContentResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(MarketProductLinkedContentItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MarketGetProductLinkedContentResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetProductLinkedContentResponseDto[] newArray(int i) {
            return new MarketGetProductLinkedContentResponseDto[i];
        }
    }

    public MarketGetProductLinkedContentResponseDto(int i, List<MarketProductLinkedContentItemDto> list) {
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
        if (!(obj instanceof MarketGetProductLinkedContentResponseDto)) {
            return false;
        }
        MarketGetProductLinkedContentResponseDto marketGetProductLinkedContentResponseDto = (MarketGetProductLinkedContentResponseDto) obj;
        return this.totalCount == marketGetProductLinkedContentResponseDto.totalCount && epx.f(this.items, marketGetProductLinkedContentResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.totalCount) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGetProductLinkedContentResponseDto(totalCount=");
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
