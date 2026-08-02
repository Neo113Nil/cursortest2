package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketGetCartTotalQuantityResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetCartTotalQuantityResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetCartTotalQuantityResponseDto> CREATOR = new a();

    @pmi0("banner")
    private final MarketItemBannerDto banner;

    @pmi0("count")
    private final int count;

    @pmi0("failure_min_order_price_text")
    private final String failureMinOrderPriceText;

    @pmi0("min_order_price")
    private final MarketPriceDto minOrderPrice;

    @pmi0("total_price")
    private final MarketPriceDto totalPrice;

    /* compiled from: MarketGetCartTotalQuantityResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetCartTotalQuantityResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetCartTotalQuantityResponseDto createFromParcel(Parcel parcel) {
            return new MarketGetCartTotalQuantityResponseDto(parcel.readInt(), (MarketPriceDto) parcel.readParcelable(MarketGetCartTotalQuantityResponseDto.class.getClassLoader()), parcel.readInt() == 0 ? null : MarketItemBannerDto.CREATOR.createFromParcel(parcel), (MarketPriceDto) parcel.readParcelable(MarketGetCartTotalQuantityResponseDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetCartTotalQuantityResponseDto[] newArray(int i) {
            return new MarketGetCartTotalQuantityResponseDto[i];
        }
    }

    public MarketGetCartTotalQuantityResponseDto(int i, MarketPriceDto marketPriceDto, MarketItemBannerDto marketItemBannerDto, MarketPriceDto marketPriceDto2, String str) {
        this.count = i;
        this.totalPrice = marketPriceDto;
        this.banner = marketItemBannerDto;
        this.minOrderPrice = marketPriceDto2;
        this.failureMinOrderPriceText = str;
    }

    public final String d() {
        return this.failureMinOrderPriceText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MarketPriceDto e() {
        return this.totalPrice;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetCartTotalQuantityResponseDto)) {
            return false;
        }
        MarketGetCartTotalQuantityResponseDto marketGetCartTotalQuantityResponseDto = (MarketGetCartTotalQuantityResponseDto) obj;
        return this.count == marketGetCartTotalQuantityResponseDto.count && epx.f(this.totalPrice, marketGetCartTotalQuantityResponseDto.totalPrice) && epx.f(this.banner, marketGetCartTotalQuantityResponseDto.banner) && epx.f(this.minOrderPrice, marketGetCartTotalQuantityResponseDto.minOrderPrice) && epx.f(this.failureMinOrderPriceText, marketGetCartTotalQuantityResponseDto.failureMinOrderPriceText);
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int hashCode = (this.totalPrice.hashCode() + (Integer.hashCode(this.count) * 31)) * 31;
        MarketItemBannerDto marketItemBannerDto = this.banner;
        int hashCode2 = (hashCode + (marketItemBannerDto == null ? 0 : marketItemBannerDto.hashCode())) * 31;
        MarketPriceDto marketPriceDto = this.minOrderPrice;
        int hashCode3 = (hashCode2 + (marketPriceDto == null ? 0 : marketPriceDto.hashCode())) * 31;
        String str = this.failureMinOrderPriceText;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGetCartTotalQuantityResponseDto(count=");
        sb.append(this.count);
        sb.append(", totalPrice=");
        sb.append(this.totalPrice);
        sb.append(", banner=");
        sb.append(this.banner);
        sb.append(", minOrderPrice=");
        sb.append(this.minOrderPrice);
        sb.append(", failureMinOrderPriceText=");
        return ho8.a(sb, this.failureMinOrderPriceText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        parcel.writeParcelable(this.totalPrice, i);
        MarketItemBannerDto marketItemBannerDto = this.banner;
        if (marketItemBannerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketItemBannerDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.minOrderPrice, i);
        parcel.writeString(this.failureMinOrderPriceText);
    }

    public /* synthetic */ MarketGetCartTotalQuantityResponseDto(int i, MarketPriceDto marketPriceDto, MarketItemBannerDto marketItemBannerDto, MarketPriceDto marketPriceDto2, String str, int i2, zcl zclVar) {
        this(i, marketPriceDto, (i2 & 4) != 0 ? null : marketItemBannerDto, (i2 & 8) != 0 ? null : marketPriceDto2, (i2 & 16) != 0 ? null : str);
    }
}
