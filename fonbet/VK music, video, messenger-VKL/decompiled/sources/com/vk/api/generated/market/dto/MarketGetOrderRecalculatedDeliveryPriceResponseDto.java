package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MarketGetOrderRecalculatedDeliveryPriceResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetOrderRecalculatedDeliveryPriceResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetOrderRecalculatedDeliveryPriceResponseDto> CREATOR = new a();

    @pmi0("is_deliverable")
    private final boolean isDeliverable;

    @pmi0("price")
    private final String price;

    /* compiled from: MarketGetOrderRecalculatedDeliveryPriceResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetOrderRecalculatedDeliveryPriceResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetOrderRecalculatedDeliveryPriceResponseDto createFromParcel(Parcel parcel) {
            return new MarketGetOrderRecalculatedDeliveryPriceResponseDto(parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetOrderRecalculatedDeliveryPriceResponseDto[] newArray(int i) {
            return new MarketGetOrderRecalculatedDeliveryPriceResponseDto[i];
        }
    }

    public MarketGetOrderRecalculatedDeliveryPriceResponseDto(boolean z, String str) {
        this.isDeliverable = z;
        this.price = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetOrderRecalculatedDeliveryPriceResponseDto)) {
            return false;
        }
        MarketGetOrderRecalculatedDeliveryPriceResponseDto marketGetOrderRecalculatedDeliveryPriceResponseDto = (MarketGetOrderRecalculatedDeliveryPriceResponseDto) obj;
        return this.isDeliverable == marketGetOrderRecalculatedDeliveryPriceResponseDto.isDeliverable && epx.f(this.price, marketGetOrderRecalculatedDeliveryPriceResponseDto.price);
    }

    public final int hashCode() {
        return this.price.hashCode() + (Boolean.hashCode(this.isDeliverable) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGetOrderRecalculatedDeliveryPriceResponseDto(isDeliverable=");
        sb.append(this.isDeliverable);
        sb.append(", price=");
        return ho8.a(sb, this.price, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isDeliverable ? 1 : 0);
        parcel.writeString(this.price);
    }
}
