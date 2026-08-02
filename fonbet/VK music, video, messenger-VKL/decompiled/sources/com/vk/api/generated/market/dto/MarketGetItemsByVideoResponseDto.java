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

/* compiled from: MarketGetItemsByVideoResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetItemsByVideoResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetItemsByVideoResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<MarketMarketItemDto> items;

    /* compiled from: MarketGetItemsByVideoResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetItemsByVideoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetItemsByVideoResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(MarketGetItemsByVideoResponseDto.class, parcel, arrayList, i, 1);
            }
            return new MarketGetItemsByVideoResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetItemsByVideoResponseDto[] newArray(int i) {
            return new MarketGetItemsByVideoResponseDto[i];
        }
    }

    public MarketGetItemsByVideoResponseDto(List<MarketMarketItemDto> list) {
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
        return (obj instanceof MarketGetItemsByVideoResponseDto) && epx.f(this.items, ((MarketGetItemsByVideoResponseDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MarketGetItemsByVideoResponseDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
