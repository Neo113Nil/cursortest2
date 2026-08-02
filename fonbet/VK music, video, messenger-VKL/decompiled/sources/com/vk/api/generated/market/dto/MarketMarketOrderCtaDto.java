package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: MarketMarketOrderCtaDto.kt */
/* loaded from: classes15.dex */
public final class MarketMarketOrderCtaDto implements Parcelable {
    public static final Parcelable.Creator<MarketMarketOrderCtaDto> CREATOR = new a();

    @pmi0("order_id")
    private final int orderId;

    /* compiled from: MarketMarketOrderCtaDto.kt */
    public static final class a implements Parcelable.Creator<MarketMarketOrderCtaDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketMarketOrderCtaDto createFromParcel(Parcel parcel) {
            return new MarketMarketOrderCtaDto(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketMarketOrderCtaDto[] newArray(int i) {
            return new MarketMarketOrderCtaDto[i];
        }
    }

    public MarketMarketOrderCtaDto(int i) {
        this.orderId = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketMarketOrderCtaDto) && this.orderId == ((MarketMarketOrderCtaDto) obj).orderId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.orderId);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("MarketMarketOrderCtaDto(orderId="), this.orderId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.orderId);
    }
}
