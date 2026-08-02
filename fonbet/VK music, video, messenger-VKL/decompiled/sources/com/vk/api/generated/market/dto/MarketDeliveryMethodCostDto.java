package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketDeliveryMethodCostDto.kt */
/* loaded from: classes15.dex */
public final class MarketDeliveryMethodCostDto implements Parcelable {
    public static final Parcelable.Creator<MarketDeliveryMethodCostDto> CREATOR = new a();

    @pmi0("days")
    private final Integer days;

    @pmi0("method")
    private final MarketDeliveryMethodTypeDto method;

    @pmi0("price")
    private final MarketPriceDto price;

    /* compiled from: MarketDeliveryMethodCostDto.kt */
    public static final class a implements Parcelable.Creator<MarketDeliveryMethodCostDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketDeliveryMethodCostDto createFromParcel(Parcel parcel) {
            return new MarketDeliveryMethodCostDto(MarketDeliveryMethodTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (MarketPriceDto) parcel.readParcelable(MarketDeliveryMethodCostDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketDeliveryMethodCostDto[] newArray(int i) {
            return new MarketDeliveryMethodCostDto[i];
        }
    }

    public MarketDeliveryMethodCostDto(MarketDeliveryMethodTypeDto marketDeliveryMethodTypeDto, Integer num, MarketPriceDto marketPriceDto) {
        this.method = marketDeliveryMethodTypeDto;
        this.days = num;
        this.price = marketPriceDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketDeliveryMethodCostDto)) {
            return false;
        }
        MarketDeliveryMethodCostDto marketDeliveryMethodCostDto = (MarketDeliveryMethodCostDto) obj;
        return epx.f(this.method, marketDeliveryMethodCostDto.method) && epx.f(this.days, marketDeliveryMethodCostDto.days) && epx.f(this.price, marketDeliveryMethodCostDto.price);
    }

    public final int hashCode() {
        int hashCode = this.method.hashCode() * 31;
        Integer num = this.days;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        MarketPriceDto marketPriceDto = this.price;
        return hashCode2 + (marketPriceDto != null ? marketPriceDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarketDeliveryMethodCostDto(method=" + this.method + ", days=" + this.days + ", price=" + this.price + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.method.writeToParcel(parcel, i);
        Integer num = this.days;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.price, i);
    }

    public /* synthetic */ MarketDeliveryMethodCostDto(MarketDeliveryMethodTypeDto marketDeliveryMethodTypeDto, Integer num, MarketPriceDto marketPriceDto, int i, zcl zclVar) {
        this(marketDeliveryMethodTypeDto, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : marketPriceDto);
    }
}
