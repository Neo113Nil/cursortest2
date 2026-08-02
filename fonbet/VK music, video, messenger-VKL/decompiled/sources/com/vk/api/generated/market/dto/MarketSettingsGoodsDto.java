package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketSettingsGoodsDto.kt */
/* loaded from: classes15.dex */
public final class MarketSettingsGoodsDto implements Parcelable {
    public static final Parcelable.Creator<MarketSettingsGoodsDto> CREATOR = new a();

    @pmi0("enabled")
    private final boolean enabled;

    @pmi0("promotion")
    private final MarketSettingsGoodsPromotionDto promotion;

    @pmi0("properties")
    private final MarketSettingsGoodsPropertiesDto properties;

    @pmi0("stocks")
    private final MarketSettingsGoodsStocksDto stocks;

    /* compiled from: MarketSettingsGoodsDto.kt */
    public static final class a implements Parcelable.Creator<MarketSettingsGoodsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSettingsGoodsDto createFromParcel(Parcel parcel) {
            return new MarketSettingsGoodsDto(parcel.readInt() != 0, parcel.readInt() == 0 ? null : MarketSettingsGoodsPropertiesDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MarketSettingsGoodsPromotionDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MarketSettingsGoodsStocksDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSettingsGoodsDto[] newArray(int i) {
            return new MarketSettingsGoodsDto[i];
        }
    }

    public MarketSettingsGoodsDto(boolean z, MarketSettingsGoodsPropertiesDto marketSettingsGoodsPropertiesDto, MarketSettingsGoodsPromotionDto marketSettingsGoodsPromotionDto, MarketSettingsGoodsStocksDto marketSettingsGoodsStocksDto) {
        this.enabled = z;
        this.properties = marketSettingsGoodsPropertiesDto;
        this.promotion = marketSettingsGoodsPromotionDto;
        this.stocks = marketSettingsGoodsStocksDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketSettingsGoodsDto)) {
            return false;
        }
        MarketSettingsGoodsDto marketSettingsGoodsDto = (MarketSettingsGoodsDto) obj;
        return this.enabled == marketSettingsGoodsDto.enabled && epx.f(this.properties, marketSettingsGoodsDto.properties) && epx.f(this.promotion, marketSettingsGoodsDto.promotion) && epx.f(this.stocks, marketSettingsGoodsDto.stocks);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.enabled) * 31;
        MarketSettingsGoodsPropertiesDto marketSettingsGoodsPropertiesDto = this.properties;
        int hashCode2 = (hashCode + (marketSettingsGoodsPropertiesDto == null ? 0 : marketSettingsGoodsPropertiesDto.hashCode())) * 31;
        MarketSettingsGoodsPromotionDto marketSettingsGoodsPromotionDto = this.promotion;
        int hashCode3 = (hashCode2 + (marketSettingsGoodsPromotionDto == null ? 0 : marketSettingsGoodsPromotionDto.hashCode())) * 31;
        MarketSettingsGoodsStocksDto marketSettingsGoodsStocksDto = this.stocks;
        return hashCode3 + (marketSettingsGoodsStocksDto != null ? marketSettingsGoodsStocksDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarketSettingsGoodsDto(enabled=" + this.enabled + ", properties=" + this.properties + ", promotion=" + this.promotion + ", stocks=" + this.stocks + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enabled ? 1 : 0);
        MarketSettingsGoodsPropertiesDto marketSettingsGoodsPropertiesDto = this.properties;
        if (marketSettingsGoodsPropertiesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketSettingsGoodsPropertiesDto.writeToParcel(parcel, i);
        }
        MarketSettingsGoodsPromotionDto marketSettingsGoodsPromotionDto = this.promotion;
        if (marketSettingsGoodsPromotionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketSettingsGoodsPromotionDto.writeToParcel(parcel, i);
        }
        MarketSettingsGoodsStocksDto marketSettingsGoodsStocksDto = this.stocks;
        if (marketSettingsGoodsStocksDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketSettingsGoodsStocksDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketSettingsGoodsDto(boolean z, MarketSettingsGoodsPropertiesDto marketSettingsGoodsPropertiesDto, MarketSettingsGoodsPromotionDto marketSettingsGoodsPromotionDto, MarketSettingsGoodsStocksDto marketSettingsGoodsStocksDto, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : marketSettingsGoodsPropertiesDto, (i & 4) != 0 ? null : marketSettingsGoodsPromotionDto, (i & 8) != 0 ? null : marketSettingsGoodsStocksDto);
    }
}
