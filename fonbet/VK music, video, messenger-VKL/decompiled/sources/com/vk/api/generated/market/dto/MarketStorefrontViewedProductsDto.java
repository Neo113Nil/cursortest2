package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.urd0;
import xsna.vu5;

/* compiled from: MarketStorefrontViewedProductsDto.kt */
/* loaded from: classes15.dex */
public final class MarketStorefrontViewedProductsDto implements Parcelable {
    public static final Parcelable.Creator<MarketStorefrontViewedProductsDto> CREATOR = new a();

    @pmi0("album_id")
    private final int albumId;

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<MarketMarketItemDto> items;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketStorefrontViewedProductsDto.kt */
    public static final class a implements Parcelable.Creator<MarketStorefrontViewedProductsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketStorefrontViewedProductsDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(MarketStorefrontViewedProductsDto.class, parcel, arrayList, i, 1);
            }
            return new MarketStorefrontViewedProductsDto(readInt, readString, arrayList, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketStorefrontViewedProductsDto[] newArray(int i) {
            return new MarketStorefrontViewedProductsDto[i];
        }
    }

    public MarketStorefrontViewedProductsDto(int i, String str, List<MarketMarketItemDto> list, int i2) {
        this.albumId = i;
        this.title = str;
        this.items = list;
        this.count = i2;
    }

    public final int d() {
        return this.albumId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<MarketMarketItemDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketStorefrontViewedProductsDto)) {
            return false;
        }
        MarketStorefrontViewedProductsDto marketStorefrontViewedProductsDto = (MarketStorefrontViewedProductsDto) obj;
        return this.albumId == marketStorefrontViewedProductsDto.albumId && epx.f(this.title, marketStorefrontViewedProductsDto.title) && epx.f(this.items, marketStorefrontViewedProductsDto.items) && this.count == marketStorefrontViewedProductsDto.count;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return Integer.hashCode(this.count) + fw3.a(urd0.a(Integer.hashCode(this.albumId) * 31, 31, this.title), 31, this.items);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketStorefrontViewedProductsDto(albumId=");
        sb.append(this.albumId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", count=");
        return vu5.b(sb, this.count, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.albumId);
        parcel.writeString(this.title);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeInt(this.count);
    }
}
