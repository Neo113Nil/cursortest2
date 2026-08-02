package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.market.dto.MarketMarketItemRatingDto;
import com.vk.api.generated.market.dto.MarketMarketItemTypeDto;
import com.vk.api.generated.market.dto.MarketPriceDto;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: BaseLinkProductDto.kt */
/* loaded from: classes14.dex */
public final class BaseLinkProductDto implements Parcelable {
    public static final Parcelable.Creator<BaseLinkProductDto> CREATOR = new a();

    @pmi0("ads_label")
    private final String adsLabel;

    @pmi0("category")
    private final BaseLinkProductCategoryDto category;

    @pmi0("city")
    private final String city;

    @pmi0("distance")
    private final Integer distance;

    @pmi0("geo")
    private final BaseGeoCoordinatesDto geo;

    @pmi0("item_rating")
    private final MarketMarketItemRatingDto itemRating;

    @pmi0("item_type")
    private final MarketMarketItemTypeDto itemType;

    @pmi0("merchant")
    private final String merchant;

    @pmi0("orders_count")
    private final Integer ordersCount;

    @pmi0("price")
    private final MarketPriceDto price;

    @pmi0("status")
    private final BaseLinkProductStatusDto status;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BaseLinkProductDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("product")
        public static final TypeDto PRODUCT;
        private final String value;

        /* compiled from: BaseLinkProductDto.kt */
        public static final class a implements Parcelable.Creator<TypeDto> {
            @Override // android.os.Parcelable.Creator
            public final TypeDto createFromParcel(Parcel parcel) {
                return TypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TypeDto[] newArray(int i) {
                return new TypeDto[i];
            }
        }

        static {
            TypeDto typeDto = new TypeDto("PRODUCT", 0, "product");
            PRODUCT = typeDto;
            TypeDto[] typeDtoArr = {typeDto};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: BaseLinkProductDto.kt */
    public static final class a implements Parcelable.Creator<BaseLinkProductDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseLinkProductDto createFromParcel(Parcel parcel) {
            return new BaseLinkProductDto(MarketPriceDto.CREATOR.createFromParcel(parcel), parcel.readString(), (BaseLinkProductCategoryDto) parcel.readParcelable(BaseLinkProductDto.class.getClassLoader()), parcel.readInt() == 0 ? null : BaseGeoCoordinatesDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : BaseLinkProductStatusDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : MarketMarketItemRatingDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MarketMarketItemTypeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final BaseLinkProductDto[] newArray(int i) {
            return new BaseLinkProductDto[i];
        }
    }

    public BaseLinkProductDto(MarketPriceDto marketPriceDto, String str, BaseLinkProductCategoryDto baseLinkProductCategoryDto, BaseGeoCoordinatesDto baseGeoCoordinatesDto, Integer num, String str2, BaseLinkProductStatusDto baseLinkProductStatusDto, Integer num2, TypeDto typeDto, String str3, MarketMarketItemRatingDto marketMarketItemRatingDto, MarketMarketItemTypeDto marketMarketItemTypeDto) {
        this.price = marketPriceDto;
        this.merchant = str;
        this.category = baseLinkProductCategoryDto;
        this.geo = baseGeoCoordinatesDto;
        this.distance = num;
        this.city = str2;
        this.status = baseLinkProductStatusDto;
        this.ordersCount = num2;
        this.type = typeDto;
        this.adsLabel = str3;
        this.itemRating = marketMarketItemRatingDto;
        this.itemType = marketMarketItemTypeDto;
    }

    public final String d() {
        return this.adsLabel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BaseLinkProductCategoryDto e() {
        return this.category;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLinkProductDto)) {
            return false;
        }
        BaseLinkProductDto baseLinkProductDto = (BaseLinkProductDto) obj;
        return epx.f(this.price, baseLinkProductDto.price) && epx.f(this.merchant, baseLinkProductDto.merchant) && epx.f(this.category, baseLinkProductDto.category) && epx.f(this.geo, baseLinkProductDto.geo) && epx.f(this.distance, baseLinkProductDto.distance) && epx.f(this.city, baseLinkProductDto.city) && this.status == baseLinkProductDto.status && epx.f(this.ordersCount, baseLinkProductDto.ordersCount) && this.type == baseLinkProductDto.type && epx.f(this.adsLabel, baseLinkProductDto.adsLabel) && epx.f(this.itemRating, baseLinkProductDto.itemRating) && this.itemType == baseLinkProductDto.itemType;
    }

    public final MarketMarketItemRatingDto f() {
        return this.itemRating;
    }

    public final MarketMarketItemTypeDto g() {
        return this.itemType;
    }

    public final int hashCode() {
        int hashCode = this.price.hashCode() * 31;
        String str = this.merchant;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BaseLinkProductCategoryDto baseLinkProductCategoryDto = this.category;
        int hashCode3 = (hashCode2 + (baseLinkProductCategoryDto == null ? 0 : baseLinkProductCategoryDto.hashCode())) * 31;
        BaseGeoCoordinatesDto baseGeoCoordinatesDto = this.geo;
        int hashCode4 = (hashCode3 + (baseGeoCoordinatesDto == null ? 0 : baseGeoCoordinatesDto.hashCode())) * 31;
        Integer num = this.distance;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.city;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BaseLinkProductStatusDto baseLinkProductStatusDto = this.status;
        int hashCode7 = (hashCode6 + (baseLinkProductStatusDto == null ? 0 : baseLinkProductStatusDto.hashCode())) * 31;
        Integer num2 = this.ordersCount;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        TypeDto typeDto = this.type;
        int hashCode9 = (hashCode8 + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
        String str3 = this.adsLabel;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MarketMarketItemRatingDto marketMarketItemRatingDto = this.itemRating;
        int hashCode11 = (hashCode10 + (marketMarketItemRatingDto == null ? 0 : marketMarketItemRatingDto.hashCode())) * 31;
        MarketMarketItemTypeDto marketMarketItemTypeDto = this.itemType;
        return hashCode11 + (marketMarketItemTypeDto != null ? marketMarketItemTypeDto.hashCode() : 0);
    }

    public final String i() {
        return this.merchant;
    }

    public final Integer j() {
        return this.ordersCount;
    }

    public final MarketPriceDto k() {
        return this.price;
    }

    public final String toString() {
        return "BaseLinkProductDto(price=" + this.price + ", merchant=" + this.merchant + ", category=" + this.category + ", geo=" + this.geo + ", distance=" + this.distance + ", city=" + this.city + ", status=" + this.status + ", ordersCount=" + this.ordersCount + ", type=" + this.type + ", adsLabel=" + this.adsLabel + ", itemRating=" + this.itemRating + ", itemType=" + this.itemType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.price.writeToParcel(parcel, i);
        parcel.writeString(this.merchant);
        parcel.writeParcelable(this.category, i);
        BaseGeoCoordinatesDto baseGeoCoordinatesDto = this.geo;
        if (baseGeoCoordinatesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseGeoCoordinatesDto.writeToParcel(parcel, i);
        }
        Integer num = this.distance;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.city);
        BaseLinkProductStatusDto baseLinkProductStatusDto = this.status;
        if (baseLinkProductStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkProductStatusDto.writeToParcel(parcel, i);
        }
        Integer num2 = this.ordersCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.adsLabel);
        MarketMarketItemRatingDto marketMarketItemRatingDto = this.itemRating;
        if (marketMarketItemRatingDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketMarketItemRatingDto.writeToParcel(parcel, i);
        }
        MarketMarketItemTypeDto marketMarketItemTypeDto = this.itemType;
        if (marketMarketItemTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketMarketItemTypeDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ BaseLinkProductDto(MarketPriceDto marketPriceDto, String str, BaseLinkProductCategoryDto baseLinkProductCategoryDto, BaseGeoCoordinatesDto baseGeoCoordinatesDto, Integer num, String str2, BaseLinkProductStatusDto baseLinkProductStatusDto, Integer num2, TypeDto typeDto, String str3, MarketMarketItemRatingDto marketMarketItemRatingDto, MarketMarketItemTypeDto marketMarketItemTypeDto, int i, zcl zclVar) {
        this(marketPriceDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : baseLinkProductCategoryDto, (i & 8) != 0 ? null : baseGeoCoordinatesDto, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : baseLinkProductStatusDto, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : typeDto, (i & 512) != 0 ? null : str3, (i & 1024) != 0 ? null : marketMarketItemRatingDto, (i & 2048) != 0 ? null : marketMarketItemTypeDto);
    }
}
