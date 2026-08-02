package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: MarketMarketOrderItemDto.kt */
/* loaded from: classes15.dex */
public final class MarketMarketOrderItemDto implements Parcelable {
    public static final Parcelable.Creator<MarketMarketOrderItemDto> CREATOR = new a();

    @pmi0("item_count")
    private final int itemCount;

    @pmi0("market_item")
    private final MarketMarketItemDto marketItem;

    /* compiled from: MarketMarketOrderItemDto.kt */
    public static final class a implements Parcelable.Creator<MarketMarketOrderItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketMarketOrderItemDto createFromParcel(Parcel parcel) {
            return new MarketMarketOrderItemDto((MarketMarketItemDto) parcel.readParcelable(MarketMarketOrderItemDto.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketMarketOrderItemDto[] newArray(int i) {
            return new MarketMarketOrderItemDto[i];
        }
    }

    public MarketMarketOrderItemDto(MarketMarketItemDto marketMarketItemDto, int i) {
        this.marketItem = marketMarketItemDto;
        this.itemCount = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketMarketOrderItemDto)) {
            return false;
        }
        MarketMarketOrderItemDto marketMarketOrderItemDto = (MarketMarketOrderItemDto) obj;
        return epx.f(this.marketItem, marketMarketOrderItemDto.marketItem) && this.itemCount == marketMarketOrderItemDto.itemCount;
    }

    public final int hashCode() {
        return Integer.hashCode(this.itemCount) + (this.marketItem.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketMarketOrderItemDto(marketItem=");
        sb.append(this.marketItem);
        sb.append(", itemCount=");
        return vu5.b(sb, this.itemCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.marketItem, i);
        parcel.writeInt(this.itemCount);
    }
}
