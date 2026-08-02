package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: MarketGetByIdResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetByIdResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetByIdResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<MarketMarketItemDto> items;

    /* compiled from: MarketGetByIdResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetByIdResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetByIdResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(MarketGetByIdResponseDto.class, parcel, arrayList, i, 1);
            }
            return new MarketGetByIdResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetByIdResponseDto[] newArray(int i) {
            return new MarketGetByIdResponseDto[i];
        }
    }

    public MarketGetByIdResponseDto(int i, List<MarketMarketItemDto> list) {
        this.count = i;
        this.items = list;
    }

    public final List<MarketMarketItemDto> d() {
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
        if (!(obj instanceof MarketGetByIdResponseDto)) {
            return false;
        }
        MarketGetByIdResponseDto marketGetByIdResponseDto = (MarketGetByIdResponseDto) obj;
        return this.count == marketGetByIdResponseDto.count && epx.f(this.items, marketGetByIdResponseDto.items);
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGetByIdResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
