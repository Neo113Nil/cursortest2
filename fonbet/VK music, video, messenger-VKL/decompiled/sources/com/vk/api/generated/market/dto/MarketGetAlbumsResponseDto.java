package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;

/* compiled from: MarketGetAlbumsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetAlbumsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetAlbumsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("is_skip_items_count")
    private final boolean isSkipItemsCount;

    @pmi0("items")
    private final List<MarketMarketAlbumDto> items;

    /* compiled from: MarketGetAlbumsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetAlbumsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetAlbumsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(MarketGetAlbumsResponseDto.class, parcel, arrayList, i, 1);
            }
            return new MarketGetAlbumsResponseDto(readInt, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetAlbumsResponseDto[] newArray(int i) {
            return new MarketGetAlbumsResponseDto[i];
        }
    }

    public MarketGetAlbumsResponseDto(int i, List<MarketMarketAlbumDto> list, boolean z) {
        this.count = i;
        this.items = list;
        this.isSkipItemsCount = z;
    }

    public final List<MarketMarketAlbumDto> d() {
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
        if (!(obj instanceof MarketGetAlbumsResponseDto)) {
            return false;
        }
        MarketGetAlbumsResponseDto marketGetAlbumsResponseDto = (MarketGetAlbumsResponseDto) obj;
        return this.count == marketGetAlbumsResponseDto.count && epx.f(this.items, marketGetAlbumsResponseDto.items) && this.isSkipItemsCount == marketGetAlbumsResponseDto.isSkipItemsCount;
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isSkipItemsCount) + fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGetAlbumsResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", isSkipItemsCount=");
        return q0.a(sb, this.isSkipItemsCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeInt(this.isSkipItemsCount ? 1 : 0);
    }
}
