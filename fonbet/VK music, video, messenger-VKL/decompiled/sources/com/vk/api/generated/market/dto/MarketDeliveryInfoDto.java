package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketDeliveryInfoDto.kt */
/* loaded from: classes15.dex */
public final class MarketDeliveryInfoDto implements Parcelable {
    public static final Parcelable.Creator<MarketDeliveryInfoDto> CREATOR = new a();

    @pmi0("cost")
    private final MarketPriceDto cost;

    @pmi0("days")
    private final Integer days;

    @pmi0("text")
    private final String text;

    /* compiled from: MarketDeliveryInfoDto.kt */
    public static final class a implements Parcelable.Creator<MarketDeliveryInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketDeliveryInfoDto createFromParcel(Parcel parcel) {
            return new MarketDeliveryInfoDto(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? MarketPriceDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketDeliveryInfoDto[] newArray(int i) {
            return new MarketDeliveryInfoDto[i];
        }
    }

    public MarketDeliveryInfoDto(String str, Integer num, MarketPriceDto marketPriceDto) {
        this.text = str;
        this.days = num;
        this.cost = marketPriceDto;
    }

    public final String d() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketDeliveryInfoDto)) {
            return false;
        }
        MarketDeliveryInfoDto marketDeliveryInfoDto = (MarketDeliveryInfoDto) obj;
        return epx.f(this.text, marketDeliveryInfoDto.text) && epx.f(this.days, marketDeliveryInfoDto.days) && epx.f(this.cost, marketDeliveryInfoDto.cost);
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        Integer num = this.days;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        MarketPriceDto marketPriceDto = this.cost;
        return hashCode2 + (marketPriceDto != null ? marketPriceDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarketDeliveryInfoDto(text=" + this.text + ", days=" + this.days + ", cost=" + this.cost + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        Integer num = this.days;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        MarketPriceDto marketPriceDto = this.cost;
        if (marketPriceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketPriceDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketDeliveryInfoDto(String str, Integer num, MarketPriceDto marketPriceDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : marketPriceDto);
    }
}
