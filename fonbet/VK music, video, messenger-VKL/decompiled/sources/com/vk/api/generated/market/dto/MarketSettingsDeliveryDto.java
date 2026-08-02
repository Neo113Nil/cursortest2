package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseCityDto;
import com.vk.api.generated.base.dto.BaseCountryDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: MarketSettingsDeliveryDto.kt */
/* loaded from: classes15.dex */
public final class MarketSettingsDeliveryDto implements Parcelable {
    public static final Parcelable.Creator<MarketSettingsDeliveryDto> CREATOR = new a();

    @pmi0("city")
    private final BaseCityDto city;

    @pmi0("collection_days")
    private final Integer collectionDays;

    @pmi0("country")
    private final BaseCountryDto country;

    @pmi0("courier_area_photo")
    private final PhotosPhotoDto courierAreaPhoto;

    @pmi0("courier_enabled")
    private final Boolean courierEnabled;

    @pmi0("courier_options")
    private final List<MarketCourierOptionDto> courierOptions;

    @pmi0("domestic_post")
    private final MarketSettingsDeliveryPostDto domesticPost;

    @pmi0("free_from_price")
    private final MarketPriceDto freeFromPrice;

    @pmi0("free_types")
    private final MarketDeliveryFreeTypesDto freeTypes;

    @pmi0("international_post")
    private final MarketSettingsDeliveryPostDto internationalPost;

    @pmi0("is_boxberry_enabled")
    private final Boolean isBoxberryEnabled;

    @pmi0("is_cdek_enabled")
    private final Boolean isCdekEnabled;

    @pmi0("is_courier_separated_address_enabled")
    private final Boolean isCourierSeparatedAddressEnabled;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("is_free_delivery_enabled")
    private final Boolean isFreeDeliveryEnabled;

    @pmi0("is_pickup_enabled")
    private final Boolean isPickupEnabled;

    @pmi0("seller_comment")
    private final String sellerComment;

    /* compiled from: MarketSettingsDeliveryDto.kt */
    public static final class a implements Parcelable.Creator<MarketSettingsDeliveryDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSettingsDeliveryDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            Boolean valueOf6;
            ArrayList arrayList;
            boolean z = parcel.readInt() != 0;
            BaseCityDto baseCityDto = (BaseCityDto) parcel.readParcelable(MarketSettingsDeliveryDto.class.getClassLoader());
            BaseCountryDto baseCountryDto = (BaseCountryDto) parcel.readParcelable(MarketSettingsDeliveryDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            MarketSettingsDeliveryPostDto createFromParcel = parcel.readInt() == 0 ? null : MarketSettingsDeliveryPostDto.CREATOR.createFromParcel(parcel);
            MarketSettingsDeliveryPostDto createFromParcel2 = parcel.readInt() == 0 ? null : MarketSettingsDeliveryPostDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            MarketPriceDto marketPriceDto = (MarketPriceDto) parcel.readParcelable(MarketSettingsDeliveryDto.class.getClassLoader());
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            PhotosPhotoDto photosPhotoDto = (PhotosPhotoDto) parcel.readParcelable(MarketSettingsDeliveryDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MarketCourierOptionDto.CREATOR, parcel, arrayList2, i, 1);
                    readInt = readInt;
                }
                arrayList = arrayList2;
            }
            return new MarketSettingsDeliveryDto(z, baseCityDto, baseCountryDto, valueOf, valueOf2, valueOf3, createFromParcel, createFromParcel2, valueOf4, marketPriceDto, valueOf7, readString, valueOf5, valueOf6, photosPhotoDto, arrayList, parcel.readInt() == 0 ? null : MarketDeliveryFreeTypesDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSettingsDeliveryDto[] newArray(int i) {
            return new MarketSettingsDeliveryDto[i];
        }
    }

    public MarketSettingsDeliveryDto(boolean z, BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, Boolean bool, Boolean bool2, Boolean bool3, MarketSettingsDeliveryPostDto marketSettingsDeliveryPostDto, MarketSettingsDeliveryPostDto marketSettingsDeliveryPostDto2, Boolean bool4, MarketPriceDto marketPriceDto, Integer num, String str, Boolean bool5, Boolean bool6, PhotosPhotoDto photosPhotoDto, List<MarketCourierOptionDto> list, MarketDeliveryFreeTypesDto marketDeliveryFreeTypesDto) {
        this.isEnabled = z;
        this.city = baseCityDto;
        this.country = baseCountryDto;
        this.isPickupEnabled = bool;
        this.isBoxberryEnabled = bool2;
        this.isCdekEnabled = bool3;
        this.internationalPost = marketSettingsDeliveryPostDto;
        this.domesticPost = marketSettingsDeliveryPostDto2;
        this.isFreeDeliveryEnabled = bool4;
        this.freeFromPrice = marketPriceDto;
        this.collectionDays = num;
        this.sellerComment = str;
        this.courierEnabled = bool5;
        this.isCourierSeparatedAddressEnabled = bool6;
        this.courierAreaPhoto = photosPhotoDto;
        this.courierOptions = list;
        this.freeTypes = marketDeliveryFreeTypesDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketSettingsDeliveryDto)) {
            return false;
        }
        MarketSettingsDeliveryDto marketSettingsDeliveryDto = (MarketSettingsDeliveryDto) obj;
        return this.isEnabled == marketSettingsDeliveryDto.isEnabled && epx.f(this.city, marketSettingsDeliveryDto.city) && epx.f(this.country, marketSettingsDeliveryDto.country) && epx.f(this.isPickupEnabled, marketSettingsDeliveryDto.isPickupEnabled) && epx.f(this.isBoxberryEnabled, marketSettingsDeliveryDto.isBoxberryEnabled) && epx.f(this.isCdekEnabled, marketSettingsDeliveryDto.isCdekEnabled) && epx.f(this.internationalPost, marketSettingsDeliveryDto.internationalPost) && epx.f(this.domesticPost, marketSettingsDeliveryDto.domesticPost) && epx.f(this.isFreeDeliveryEnabled, marketSettingsDeliveryDto.isFreeDeliveryEnabled) && epx.f(this.freeFromPrice, marketSettingsDeliveryDto.freeFromPrice) && epx.f(this.collectionDays, marketSettingsDeliveryDto.collectionDays) && epx.f(this.sellerComment, marketSettingsDeliveryDto.sellerComment) && epx.f(this.courierEnabled, marketSettingsDeliveryDto.courierEnabled) && epx.f(this.isCourierSeparatedAddressEnabled, marketSettingsDeliveryDto.isCourierSeparatedAddressEnabled) && epx.f(this.courierAreaPhoto, marketSettingsDeliveryDto.courierAreaPhoto) && epx.f(this.courierOptions, marketSettingsDeliveryDto.courierOptions) && epx.f(this.freeTypes, marketSettingsDeliveryDto.freeTypes);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        BaseCityDto baseCityDto = this.city;
        int hashCode2 = (hashCode + (baseCityDto == null ? 0 : baseCityDto.hashCode())) * 31;
        BaseCountryDto baseCountryDto = this.country;
        int hashCode3 = (hashCode2 + (baseCountryDto == null ? 0 : baseCountryDto.hashCode())) * 31;
        Boolean bool = this.isPickupEnabled;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isBoxberryEnabled;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isCdekEnabled;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        MarketSettingsDeliveryPostDto marketSettingsDeliveryPostDto = this.internationalPost;
        int hashCode7 = (hashCode6 + (marketSettingsDeliveryPostDto == null ? 0 : marketSettingsDeliveryPostDto.hashCode())) * 31;
        MarketSettingsDeliveryPostDto marketSettingsDeliveryPostDto2 = this.domesticPost;
        int hashCode8 = (hashCode7 + (marketSettingsDeliveryPostDto2 == null ? 0 : marketSettingsDeliveryPostDto2.hashCode())) * 31;
        Boolean bool4 = this.isFreeDeliveryEnabled;
        int hashCode9 = (hashCode8 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        MarketPriceDto marketPriceDto = this.freeFromPrice;
        int hashCode10 = (hashCode9 + (marketPriceDto == null ? 0 : marketPriceDto.hashCode())) * 31;
        Integer num = this.collectionDays;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.sellerComment;
        int hashCode12 = (hashCode11 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool5 = this.courierEnabled;
        int hashCode13 = (hashCode12 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isCourierSeparatedAddressEnabled;
        int hashCode14 = (hashCode13 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.courierAreaPhoto;
        int hashCode15 = (hashCode14 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        List<MarketCourierOptionDto> list = this.courierOptions;
        int hashCode16 = (hashCode15 + (list == null ? 0 : list.hashCode())) * 31;
        MarketDeliveryFreeTypesDto marketDeliveryFreeTypesDto = this.freeTypes;
        return hashCode16 + (marketDeliveryFreeTypesDto != null ? marketDeliveryFreeTypesDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarketSettingsDeliveryDto(isEnabled=" + this.isEnabled + ", city=" + this.city + ", country=" + this.country + ", isPickupEnabled=" + this.isPickupEnabled + ", isBoxberryEnabled=" + this.isBoxberryEnabled + ", isCdekEnabled=" + this.isCdekEnabled + ", internationalPost=" + this.internationalPost + ", domesticPost=" + this.domesticPost + ", isFreeDeliveryEnabled=" + this.isFreeDeliveryEnabled + ", freeFromPrice=" + this.freeFromPrice + ", collectionDays=" + this.collectionDays + ", sellerComment=" + this.sellerComment + ", courierEnabled=" + this.courierEnabled + ", isCourierSeparatedAddressEnabled=" + this.isCourierSeparatedAddressEnabled + ", courierAreaPhoto=" + this.courierAreaPhoto + ", courierOptions=" + this.courierOptions + ", freeTypes=" + this.freeTypes + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isEnabled ? 1 : 0);
        parcel.writeParcelable(this.city, i);
        parcel.writeParcelable(this.country, i);
        Boolean bool = this.isPickupEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isBoxberryEnabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isCdekEnabled;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        MarketSettingsDeliveryPostDto marketSettingsDeliveryPostDto = this.internationalPost;
        if (marketSettingsDeliveryPostDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketSettingsDeliveryPostDto.writeToParcel(parcel, i);
        }
        MarketSettingsDeliveryPostDto marketSettingsDeliveryPostDto2 = this.domesticPost;
        if (marketSettingsDeliveryPostDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketSettingsDeliveryPostDto2.writeToParcel(parcel, i);
        }
        Boolean bool4 = this.isFreeDeliveryEnabled;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        parcel.writeParcelable(this.freeFromPrice, i);
        Integer num = this.collectionDays;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.sellerComment);
        Boolean bool5 = this.courierEnabled;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        Boolean bool6 = this.isCourierSeparatedAddressEnabled;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        parcel.writeParcelable(this.courierAreaPhoto, i);
        List<MarketCourierOptionDto> list = this.courierOptions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MarketCourierOptionDto) f.next()).writeToParcel(parcel, i);
            }
        }
        MarketDeliveryFreeTypesDto marketDeliveryFreeTypesDto = this.freeTypes;
        if (marketDeliveryFreeTypesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketDeliveryFreeTypesDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketSettingsDeliveryDto(boolean z, BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, Boolean bool, Boolean bool2, Boolean bool3, MarketSettingsDeliveryPostDto marketSettingsDeliveryPostDto, MarketSettingsDeliveryPostDto marketSettingsDeliveryPostDto2, Boolean bool4, MarketPriceDto marketPriceDto, Integer num, String str, Boolean bool5, Boolean bool6, PhotosPhotoDto photosPhotoDto, List list, MarketDeliveryFreeTypesDto marketDeliveryFreeTypesDto, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : baseCityDto, (i & 4) != 0 ? null : baseCountryDto, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : marketSettingsDeliveryPostDto, (i & 128) != 0 ? null : marketSettingsDeliveryPostDto2, (i & 256) != 0 ? null : bool4, (i & 512) != 0 ? null : marketPriceDto, (i & 1024) != 0 ? null : num, (i & 2048) != 0 ? null : str, (i & 4096) != 0 ? null : bool5, (i & 8192) != 0 ? null : bool6, (i & 16384) != 0 ? null : photosPhotoDto, (i & 32768) != 0 ? null : list, (i & 65536) != 0 ? null : marketDeliveryFreeTypesDto);
    }
}
