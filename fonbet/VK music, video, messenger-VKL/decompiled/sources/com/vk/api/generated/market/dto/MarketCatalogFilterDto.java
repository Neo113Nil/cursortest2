package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.base.dto.BaseCityDto;
import com.vk.api.generated.base.dto.BaseCountryDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintCategories;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MarketCatalogFilterDto.kt */
/* loaded from: classes15.dex */
public final class MarketCatalogFilterDto implements Parcelable {
    public static final Parcelable.Creator<MarketCatalogFilterDto> CREATOR = new a();

    @pmi0("album_id")
    private final Integer albumId;

    @pmi0("album_title")
    private final String albumTitle;

    @pmi0("catalog_context")
    private final String catalogContext;

    @pmi0(HintCategories.PARAM_NAME)
    private final List<MarketCatalogCategoryContextDto> categories;

    @pmi0("categories_tree")
    private final List<MarketMarketCategoryTreeDto> categoriesTree;

    @pmi0("category_id")
    private final Integer categoryId;

    @pmi0("category_tree_id")
    private final Integer categoryTreeId;

    @pmi0("city")
    private final BaseCityDto city;

    @pmi0("classifieds_city_id")
    private final String classifiedsCityId;

    @pmi0("country")
    private final BaseCountryDto country;

    @pmi0("delivery_type")
    private final MarketDeliveryTypeDto deliveryType;

    @pmi0("discount")
    private final Boolean discount;

    @pmi0("distance")
    private final Integer distance;

    @pmi0("distance_default")
    private final Integer distanceDefault;

    @pmi0("distance_options")
    private final List<MarketCatalogDistanceOptionDto> distanceOptions;

    @pmi0("friends_reviews")
    private final Boolean friendsReviews;

    @pmi0("friends_wishlist")
    private final Boolean friendsWishlist;

    @pmi0("icons")
    private final List<BaseImageDto> icons;

    @pmi0("online_payment")
    private final Boolean onlinePayment;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("price_currency")
    private final MarketCurrencyDto priceCurrency;

    @pmi0("price_from")
    private final MarketPriceDto priceFrom;

    @pmi0("price_max")
    private final Integer priceMax;

    @pmi0("price_min")
    private final Integer priceMin;

    @pmi0("price_to")
    private final MarketPriceDto priceTo;

    @pmi0("root_category_id")
    private final Integer rootCategoryId;

    @pmi0("seller_high_rating")
    private final Boolean sellerHighRating;

    @pmi0("status_id")
    private final String statusId;

    @pmi0("status_options")
    private final List<MarketCatalogStatusOptionDto> statusOptions;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketCatalogFilterDto.kt */
    public static final class a implements Parcelable.Creator<MarketCatalogFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCatalogFilterDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String str;
            Integer num;
            ArrayList arrayList3;
            ArrayList arrayList4;
            String str2;
            ArrayList arrayList5;
            ArrayList arrayList6;
            Integer num2;
            Integer num3;
            ArrayList arrayList7;
            ArrayList arrayList8;
            ArrayList arrayList9;
            String str3;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(MarketCatalogFilterDto.class, parcel, arrayList10, i, 1);
                }
                arrayList = arrayList10;
            }
            String readString2 = parcel.readString();
            UserId userId = (UserId) parcel.readParcelable(MarketCatalogFilterDto.class.getClassLoader());
            BaseCityDto baseCityDto = (BaseCityDto) parcel.readParcelable(MarketCatalogFilterDto.class.getClassLoader());
            BaseCountryDto baseCountryDto = (BaseCountryDto) parcel.readParcelable(MarketCatalogFilterDto.class.getClassLoader());
            MarketPriceDto marketPriceDto = (MarketPriceDto) parcel.readParcelable(MarketCatalogFilterDto.class.getClassLoader());
            MarketPriceDto marketPriceDto2 = (MarketPriceDto) parcel.readParcelable(MarketCatalogFilterDto.class.getClassLoader());
            MarketCurrencyDto marketCurrencyDto = (MarketCurrencyDto) parcel.readParcelable(MarketCatalogFilterDto.class.getClassLoader());
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (true) {
                    str = readString;
                    if (i2 == readInt2) {
                        break;
                    }
                    i2 = en.a(MarketCatalogCategoryContextDto.CREATOR, parcel, arrayList2, i2, 1);
                    readString = str;
                }
            } else {
                arrayList2 = null;
                str = readString;
            }
            Integer num4 = valueOf6;
            String readString3 = parcel.readString();
            Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                num = valueOf8;
                arrayList3 = new ArrayList(readInt3);
                arrayList4 = arrayList;
                int i3 = 0;
                while (true) {
                    str2 = readString2;
                    if (i3 == readInt3) {
                        break;
                    }
                    i3 = en.a(MarketMarketCategoryTreeDto.CREATOR, parcel, arrayList3, i3, 1);
                    readString2 = str2;
                    readInt3 = readInt3;
                }
            } else {
                num = valueOf8;
                arrayList4 = arrayList;
                arrayList3 = null;
                str2 = readString2;
            }
            Integer valueOf11 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf12 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList5 = arrayList3;
                arrayList6 = new ArrayList(readInt4);
                num2 = valueOf11;
                int i4 = 0;
                while (true) {
                    num3 = valueOf12;
                    if (i4 == readInt4) {
                        break;
                    }
                    i4 = en.a(MarketCatalogDistanceOptionDto.CREATOR, parcel, arrayList6, i4, 1);
                    valueOf12 = num3;
                    readInt4 = readInt4;
                }
            } else {
                arrayList5 = arrayList3;
                num2 = valueOf11;
                arrayList6 = null;
                num3 = valueOf12;
            }
            Integer valueOf13 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ArrayList arrayList11 = arrayList4;
            String readString4 = parcel.readString();
            UserId userId2 = userId;
            ArrayList arrayList12 = arrayList2;
            Integer num5 = valueOf7;
            Integer num6 = num;
            Integer num7 = valueOf13;
            String str4 = str2;
            String readString5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList7 = arrayList6;
                arrayList8 = arrayList11;
                str3 = str4;
                arrayList9 = null;
            } else {
                arrayList7 = arrayList6;
                int readInt5 = parcel.readInt();
                arrayList8 = arrayList11;
                arrayList9 = new ArrayList(readInt5);
                str3 = str4;
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = en.a(MarketCatalogStatusOptionDto.CREATOR, parcel, arrayList9, i5, 1);
                    readInt5 = readInt5;
                    userId2 = userId2;
                }
            }
            UserId userId3 = userId2;
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
            MarketDeliveryTypeDto createFromParcel = parcel.readInt() == 0 ? null : MarketDeliveryTypeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketCatalogFilterDto(str, arrayList8, str3, userId3, baseCityDto, baseCountryDto, marketPriceDto, marketPriceDto2, marketCurrencyDto, num4, num5, arrayList12, readString3, num6, valueOf9, valueOf10, arrayList5, num2, num3, arrayList7, num7, readString4, readString5, arrayList9, valueOf, valueOf2, createFromParcel, valueOf3, valueOf4, valueOf5);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCatalogFilterDto[] newArray(int i) {
            return new MarketCatalogFilterDto[i];
        }
    }

    public MarketCatalogFilterDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741823, null);
    }

    public final Boolean B() {
        return this.onlinePayment;
    }

    public final MarketCurrencyDto C() {
        return this.priceCurrency;
    }

    public final Integer D() {
        return this.priceMax;
    }

    public final Integer F() {
        return this.priceMin;
    }

    public final Integer G() {
        return this.rootCategoryId;
    }

    public final Boolean K() {
        return this.sellerHighRating;
    }

    public final String M() {
        return this.statusId;
    }

    public final List<MarketCatalogStatusOptionDto> R() {
        return this.statusOptions;
    }

    public final String d() {
        return this.catalogContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<MarketCatalogCategoryContextDto> e() {
        return this.categories;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCatalogFilterDto)) {
            return false;
        }
        MarketCatalogFilterDto marketCatalogFilterDto = (MarketCatalogFilterDto) obj;
        return epx.f(this.title, marketCatalogFilterDto.title) && epx.f(this.icons, marketCatalogFilterDto.icons) && epx.f(this.catalogContext, marketCatalogFilterDto.catalogContext) && epx.f(this.ownerId, marketCatalogFilterDto.ownerId) && epx.f(this.city, marketCatalogFilterDto.city) && epx.f(this.country, marketCatalogFilterDto.country) && epx.f(this.priceFrom, marketCatalogFilterDto.priceFrom) && epx.f(this.priceTo, marketCatalogFilterDto.priceTo) && epx.f(this.priceCurrency, marketCatalogFilterDto.priceCurrency) && epx.f(this.priceMin, marketCatalogFilterDto.priceMin) && epx.f(this.priceMax, marketCatalogFilterDto.priceMax) && epx.f(this.categories, marketCatalogFilterDto.categories) && epx.f(this.classifiedsCityId, marketCatalogFilterDto.classifiedsCityId) && epx.f(this.rootCategoryId, marketCatalogFilterDto.rootCategoryId) && epx.f(this.categoryTreeId, marketCatalogFilterDto.categoryTreeId) && epx.f(this.categoryId, marketCatalogFilterDto.categoryId) && epx.f(this.categoriesTree, marketCatalogFilterDto.categoriesTree) && epx.f(this.distance, marketCatalogFilterDto.distance) && epx.f(this.distanceDefault, marketCatalogFilterDto.distanceDefault) && epx.f(this.distanceOptions, marketCatalogFilterDto.distanceOptions) && epx.f(this.albumId, marketCatalogFilterDto.albumId) && epx.f(this.albumTitle, marketCatalogFilterDto.albumTitle) && epx.f(this.statusId, marketCatalogFilterDto.statusId) && epx.f(this.statusOptions, marketCatalogFilterDto.statusOptions) && epx.f(this.onlinePayment, marketCatalogFilterDto.onlinePayment) && epx.f(this.discount, marketCatalogFilterDto.discount) && this.deliveryType == marketCatalogFilterDto.deliveryType && epx.f(this.friendsReviews, marketCatalogFilterDto.friendsReviews) && epx.f(this.friendsWishlist, marketCatalogFilterDto.friendsWishlist) && epx.f(this.sellerHighRating, marketCatalogFilterDto.sellerHighRating);
    }

    public final List<MarketMarketCategoryTreeDto> f() {
        return this.categoriesTree;
    }

    public final Integer g() {
        return this.categoryId;
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<BaseImageDto> list = this.icons;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.catalogContext;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UserId userId = this.ownerId;
        int hashCode4 = (hashCode3 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        BaseCityDto baseCityDto = this.city;
        int hashCode5 = (hashCode4 + (baseCityDto == null ? 0 : baseCityDto.hashCode())) * 31;
        BaseCountryDto baseCountryDto = this.country;
        int hashCode6 = (hashCode5 + (baseCountryDto == null ? 0 : baseCountryDto.hashCode())) * 31;
        MarketPriceDto marketPriceDto = this.priceFrom;
        int hashCode7 = (hashCode6 + (marketPriceDto == null ? 0 : marketPriceDto.hashCode())) * 31;
        MarketPriceDto marketPriceDto2 = this.priceTo;
        int hashCode8 = (hashCode7 + (marketPriceDto2 == null ? 0 : marketPriceDto2.hashCode())) * 31;
        MarketCurrencyDto marketCurrencyDto = this.priceCurrency;
        int hashCode9 = (hashCode8 + (marketCurrencyDto == null ? 0 : marketCurrencyDto.hashCode())) * 31;
        Integer num = this.priceMin;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.priceMax;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<MarketCatalogCategoryContextDto> list2 = this.categories;
        int hashCode12 = (hashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.classifiedsCityId;
        int hashCode13 = (hashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.rootCategoryId;
        int hashCode14 = (hashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.categoryTreeId;
        int hashCode15 = (hashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.categoryId;
        int hashCode16 = (hashCode15 + (num5 == null ? 0 : num5.hashCode())) * 31;
        List<MarketMarketCategoryTreeDto> list3 = this.categoriesTree;
        int hashCode17 = (hashCode16 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num6 = this.distance;
        int hashCode18 = (hashCode17 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.distanceDefault;
        int hashCode19 = (hashCode18 + (num7 == null ? 0 : num7.hashCode())) * 31;
        List<MarketCatalogDistanceOptionDto> list4 = this.distanceOptions;
        int hashCode20 = (hashCode19 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Integer num8 = this.albumId;
        int hashCode21 = (hashCode20 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str4 = this.albumTitle;
        int hashCode22 = (hashCode21 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.statusId;
        int hashCode23 = (hashCode22 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<MarketCatalogStatusOptionDto> list5 = this.statusOptions;
        int hashCode24 = (hashCode23 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Boolean bool = this.onlinePayment;
        int hashCode25 = (hashCode24 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.discount;
        int hashCode26 = (hashCode25 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        MarketDeliveryTypeDto marketDeliveryTypeDto = this.deliveryType;
        int hashCode27 = (hashCode26 + (marketDeliveryTypeDto == null ? 0 : marketDeliveryTypeDto.hashCode())) * 31;
        Boolean bool3 = this.friendsReviews;
        int hashCode28 = (hashCode27 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.friendsWishlist;
        int hashCode29 = (hashCode28 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.sellerHighRating;
        return hashCode29 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final String i() {
        return this.classifiedsCityId;
    }

    public final MarketDeliveryTypeDto j() {
        return this.deliveryType;
    }

    public final Boolean k() {
        return this.discount;
    }

    public final Integer l() {
        return this.distance;
    }

    public final Integer n() {
        return this.distanceDefault;
    }

    public final List<MarketCatalogDistanceOptionDto> o() {
        return this.distanceOptions;
    }

    public final Boolean p() {
        return this.friendsReviews;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCatalogFilterDto(title=");
        sb.append(this.title);
        sb.append(", icons=");
        sb.append(this.icons);
        sb.append(", catalogContext=");
        sb.append(this.catalogContext);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", city=");
        sb.append(this.city);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", priceFrom=");
        sb.append(this.priceFrom);
        sb.append(", priceTo=");
        sb.append(this.priceTo);
        sb.append(", priceCurrency=");
        sb.append(this.priceCurrency);
        sb.append(", priceMin=");
        sb.append(this.priceMin);
        sb.append(", priceMax=");
        sb.append(this.priceMax);
        sb.append(", categories=");
        sb.append(this.categories);
        sb.append(", classifiedsCityId=");
        sb.append(this.classifiedsCityId);
        sb.append(", rootCategoryId=");
        sb.append(this.rootCategoryId);
        sb.append(", categoryTreeId=");
        sb.append(this.categoryTreeId);
        sb.append(", categoryId=");
        sb.append(this.categoryId);
        sb.append(", categoriesTree=");
        sb.append(this.categoriesTree);
        sb.append(", distance=");
        sb.append(this.distance);
        sb.append(", distanceDefault=");
        sb.append(this.distanceDefault);
        sb.append(", distanceOptions=");
        sb.append(this.distanceOptions);
        sb.append(", albumId=");
        sb.append(this.albumId);
        sb.append(", albumTitle=");
        sb.append(this.albumTitle);
        sb.append(", statusId=");
        sb.append(this.statusId);
        sb.append(", statusOptions=");
        sb.append(this.statusOptions);
        sb.append(", onlinePayment=");
        sb.append(this.onlinePayment);
        sb.append(", discount=");
        sb.append(this.discount);
        sb.append(", deliveryType=");
        sb.append(this.deliveryType);
        sb.append(", friendsReviews=");
        sb.append(this.friendsReviews);
        sb.append(", friendsWishlist=");
        sb.append(this.friendsWishlist);
        sb.append(", sellerHighRating=");
        return tn.a(sb, this.sellerHighRating, ')');
    }

    public final Boolean u() {
        return this.friendsWishlist;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        List<BaseImageDto> list = this.icons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.catalogContext);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeParcelable(this.city, i);
        parcel.writeParcelable(this.country, i);
        parcel.writeParcelable(this.priceFrom, i);
        parcel.writeParcelable(this.priceTo, i);
        parcel.writeParcelable(this.priceCurrency, i);
        Integer num = this.priceMin;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.priceMax;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        List<MarketCatalogCategoryContextDto> list2 = this.categories;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((MarketCatalogCategoryContextDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.classifiedsCityId);
        Integer num3 = this.rootCategoryId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.categoryTreeId;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Integer num5 = this.categoryId;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        List<MarketMarketCategoryTreeDto> list3 = this.categoriesTree;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((MarketMarketCategoryTreeDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        Integer num6 = this.distance;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        Integer num7 = this.distanceDefault;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num7);
        }
        List<MarketCatalogDistanceOptionDto> list4 = this.distanceOptions;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                ((MarketCatalogDistanceOptionDto) f4.next()).writeToParcel(parcel, i);
            }
        }
        Integer num8 = this.albumId;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num8);
        }
        parcel.writeString(this.albumTitle);
        parcel.writeString(this.statusId);
        List<MarketCatalogStatusOptionDto> list5 = this.statusOptions;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                ((MarketCatalogStatusOptionDto) f5.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.onlinePayment;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.discount;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        MarketDeliveryTypeDto marketDeliveryTypeDto = this.deliveryType;
        if (marketDeliveryTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketDeliveryTypeDto.writeToParcel(parcel, i);
        }
        Boolean bool3 = this.friendsReviews;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.friendsWishlist;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.sellerHighRating;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
    }

    public MarketCatalogFilterDto(String str, List<BaseImageDto> list, String str2, UserId userId, BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, MarketPriceDto marketPriceDto, MarketPriceDto marketPriceDto2, MarketCurrencyDto marketCurrencyDto, Integer num, Integer num2, List<MarketCatalogCategoryContextDto> list2, String str3, Integer num3, Integer num4, Integer num5, List<MarketMarketCategoryTreeDto> list3, Integer num6, Integer num7, List<MarketCatalogDistanceOptionDto> list4, Integer num8, String str4, String str5, List<MarketCatalogStatusOptionDto> list5, Boolean bool, Boolean bool2, MarketDeliveryTypeDto marketDeliveryTypeDto, Boolean bool3, Boolean bool4, Boolean bool5) {
        this.title = str;
        this.icons = list;
        this.catalogContext = str2;
        this.ownerId = userId;
        this.city = baseCityDto;
        this.country = baseCountryDto;
        this.priceFrom = marketPriceDto;
        this.priceTo = marketPriceDto2;
        this.priceCurrency = marketCurrencyDto;
        this.priceMin = num;
        this.priceMax = num2;
        this.categories = list2;
        this.classifiedsCityId = str3;
        this.rootCategoryId = num3;
        this.categoryTreeId = num4;
        this.categoryId = num5;
        this.categoriesTree = list3;
        this.distance = num6;
        this.distanceDefault = num7;
        this.distanceOptions = list4;
        this.albumId = num8;
        this.albumTitle = str4;
        this.statusId = str5;
        this.statusOptions = list5;
        this.onlinePayment = bool;
        this.discount = bool2;
        this.deliveryType = marketDeliveryTypeDto;
        this.friendsReviews = bool3;
        this.friendsWishlist = bool4;
        this.sellerHighRating = bool5;
    }

    public /* synthetic */ MarketCatalogFilterDto(String str, List list, String str2, UserId userId, BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, MarketPriceDto marketPriceDto, MarketPriceDto marketPriceDto2, MarketCurrencyDto marketCurrencyDto, Integer num, Integer num2, List list2, String str3, Integer num3, Integer num4, Integer num5, List list3, Integer num6, Integer num7, List list4, Integer num8, String str4, String str5, List list5, Boolean bool, Boolean bool2, MarketDeliveryTypeDto marketDeliveryTypeDto, Boolean bool3, Boolean bool4, Boolean bool5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : userId, (i & 16) != 0 ? null : baseCityDto, (i & 32) != 0 ? null : baseCountryDto, (i & 64) != 0 ? null : marketPriceDto, (i & 128) != 0 ? null : marketPriceDto2, (i & 256) != 0 ? null : marketCurrencyDto, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : num2, (i & 2048) != 0 ? null : list2, (i & 4096) != 0 ? null : str3, (i & 8192) != 0 ? null : num3, (i & 16384) != 0 ? null : num4, (i & 32768) != 0 ? null : num5, (i & 65536) != 0 ? null : list3, (i & 131072) != 0 ? null : num6, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num7, (i & 524288) != 0 ? null : list4, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num8, (i & 2097152) != 0 ? null : str4, (i & 4194304) != 0 ? null : str5, (i & 8388608) != 0 ? null : list5, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : bool, (i & 33554432) != 0 ? null : bool2, (i & 67108864) != 0 ? null : marketDeliveryTypeDto, (i & 134217728) != 0 ? null : bool3, (i & 268435456) != 0 ? null : bool4, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool5);
    }
}
