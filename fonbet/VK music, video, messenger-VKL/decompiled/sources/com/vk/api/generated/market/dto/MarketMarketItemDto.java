package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bh10;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketMarketItemDto.kt */
/* loaded from: classes15.dex */
public final class MarketMarketItemDto implements Parcelable {
    public static final Parcelable.Creator<MarketMarketItemDto> CREATOR = new a();

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("availability")
    private final MarketMarketItemAvailabilityDto availability;

    @pmi0("available_variant_item_id")
    private final Integer availableVariantItemId;

    @pmi0("badges")
    private final List<MarketBadgeDto> badges;

    @pmi0("button_title")
    private final String buttonTitle;

    @pmi0("buttons")
    private final List<MarketCustomButtonFullDto> buttons;

    @pmi0("cart_quantity")
    private final Integer cartQuantity;

    @pmi0("category")
    private final MarketMarketCategoryDto category;

    @pmi0("category_v2")
    private final MarketMarketCategoryDto categoryV2;

    @pmi0("csrf_hashes")
    private final String csrfHashes;

    @pmi0("date")
    private final Integer date;

    @pmi0("delivery_info")
    private final MarketDeliveryInfoDto deliveryInfo;

    @pmi0("description")
    private final String description;

    @pmi0("description_url")
    private final String descriptionUrl;

    @pmi0("external_id")
    private final String externalId;

    @pmi0("external_url")
    private final String externalUrl;

    @pmi0("has_group_access")
    private final Boolean hasGroupAccess;

    @pmi0("id")
    private final int id;

    @pmi0("integration_info")
    private final MarketMarketItemIntegrationInfoDto integrationInfo;

    @pmi0("is_adult")
    private final Boolean isAdult;

    @pmi0("is_aliexpress_checkout")
    private final Boolean isAliexpressCheckout;

    @pmi0("is_aliexpress_product")
    private final Boolean isAliexpressProduct;

    @pmi0("is_favorite")
    private final Boolean isFavorite;

    @pmi0("is_hardblocked")
    private final Boolean isHardblocked;

    @pmi0("is_main_variant")
    private final Boolean isMainVariant;

    @pmi0("is_owner")
    private final Boolean isOwner;

    @pmi0("is_price_list_service")
    private final Boolean isPriceListService;

    @pmi0("item_rating")
    private final MarketMarketItemRatingDto itemRating;

    @pmi0("item_type")
    private final MarketMarketItemTypeDto itemType;

    @pmi0("market_url")
    private final String marketUrl;

    @pmi0("open_market_link")
    private final String openMarketLink;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("post_id")
    private final Integer postId;

    @pmi0("post_owner_id")
    private final UserId postOwnerId;

    @pmi0("price")
    private final MarketPriceDto price;

    @pmi0("property_values")
    private final List<MarketItemPropertyValueDto> propertyValues;

    @pmi0("reject_info")
    private final MarketItemRejectInfoDto rejectInfo;

    @pmi0("seo_description")
    private final String seoDescription;

    @pmi0("seo_slug")
    private final String seoSlug;

    @pmi0("seo_title")
    private final String seoTitle;

    @pmi0("service_duration")
    private final MarketServicesDurationDto serviceDuration;

    @pmi0("sku")
    private final String sku;

    @pmi0("stock_amount")
    private final Integer stockAmount;

    @pmi0("thumb")
    private final List<BaseImageDto> thumb;

    @pmi0("thumb_photo")
    private final String thumbPhoto;

    @pmi0("thumbs")
    private final List<List<BaseImageDto>> thumbs;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("url")
    private final String url;

    @pmi0("variants_grouping_id")
    private final Integer variantsGroupingId;

    /* compiled from: MarketMarketItemDto.kt */
    public static final class a implements Parcelable.Creator<MarketMarketItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketMarketItemDto createFromParcel(Parcel parcel) {
            Integer num;
            MarketMarketItemIntegrationInfoDto createFromParcel;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            MarketServicesDurationDto marketServicesDurationDto;
            Class cls;
            ArrayList arrayList;
            MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto;
            Boolean valueOf6;
            Integer num2;
            ArrayList arrayList2;
            ArrayList arrayList3;
            MarketDeliveryInfoDto marketDeliveryInfoDto;
            Boolean valueOf7;
            Boolean bool;
            ArrayList arrayList4;
            ArrayList arrayList5;
            Integer num3;
            Boolean valueOf8;
            UserId userId;
            MarketMarketItemRatingDto createFromParcel2;
            MarketMarketItemRatingDto marketMarketItemRatingDto;
            MarketItemRejectInfoDto marketItemRejectInfoDto;
            ArrayList arrayList6;
            MarketDeliveryInfoDto marketDeliveryInfoDto2;
            ArrayList arrayList7;
            Boolean valueOf9;
            MarketMarketItemAvailabilityDto createFromParcel3 = MarketMarketItemAvailabilityDto.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<MarketMarketCategoryDto> creator = MarketMarketCategoryDto.CREATOR;
            MarketMarketCategoryDto createFromParcel4 = creator.createFromParcel(parcel);
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            UserId userId2 = (UserId) parcel.readParcelable(MarketMarketItemDto.class.getClassLoader());
            MarketPriceDto createFromParcel5 = MarketPriceDto.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            MarketMarketCategoryDto createFromParcel6 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            Integer valueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            MarketMarketItemTypeDto createFromParcel7 = parcel.readInt() == 0 ? null : MarketMarketItemTypeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                num = valueOf10;
                createFromParcel = null;
            } else {
                num = valueOf10;
                createFromParcel = MarketMarketItemIntegrationInfoDto.CREATOR.createFromParcel(parcel);
            }
            MarketMarketItemIntegrationInfoDto marketMarketItemIntegrationInfoDto = createFromParcel;
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
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            MarketServicesDurationDto createFromParcel8 = parcel.readInt() == 0 ? null : MarketServicesDurationDto.CREATOR.createFromParcel(parcel);
            Boolean bool2 = valueOf2;
            Boolean bool3 = valueOf4;
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            Integer valueOf11 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf12 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                marketServicesDurationDto = createFromParcel8;
                cls = MarketMarketItemDto.class;
                marketMarketItemAvailabilityDto = createFromParcel3;
                arrayList = null;
            } else {
                marketServicesDurationDto = createFromParcel8;
                int readInt2 = parcel.readInt();
                cls = MarketMarketItemDto.class;
                arrayList = new ArrayList(readInt2);
                marketMarketItemAvailabilityDto = createFromParcel3;
                int i = 0;
                while (i != readInt2) {
                    i = en.a(MarketItemPropertyValueDto.CREATOR, parcel, arrayList, i, 1);
                    readInt2 = readInt2;
                    createFromParcel4 = createFromParcel4;
                }
            }
            MarketMarketCategoryDto marketMarketCategoryDto = createFromParcel4;
            Integer valueOf13 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            MarketDeliveryInfoDto createFromParcel9 = parcel.readInt() == 0 ? null : MarketDeliveryInfoDto.CREATOR.createFromParcel(parcel);
            Class cls2 = cls;
            String readString9 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString10 = parcel.readString();
            if (parcel.readInt() == 0) {
                num2 = valueOf13;
                arrayList2 = arrayList;
                marketDeliveryInfoDto = createFromParcel9;
                arrayList3 = null;
            } else {
                num2 = valueOf13;
                int readInt3 = parcel.readInt();
                arrayList2 = arrayList;
                arrayList3 = new ArrayList(readInt3);
                marketDeliveryInfoDto = createFromParcel9;
                int i2 = 0;
                while (i2 != readInt3) {
                    i2 = en.a(BaseImageDto.CREATOR, parcel, arrayList3, i2, 1);
                    readInt3 = readInt3;
                    cls2 = cls2;
                }
            }
            Class cls3 = cls2;
            if (parcel.readInt() == 0) {
                valueOf7 = null;
            } else {
                valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf14 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                bool = valueOf7;
                arrayList4 = new ArrayList(readInt4);
                arrayList5 = arrayList3;
                int i3 = 0;
                while (true) {
                    num3 = valueOf14;
                    if (i3 == readInt4) {
                        break;
                    }
                    i3 = en.a(MarketBadgeDto.CREATOR, parcel, arrayList4, i3, 1);
                    valueOf14 = num3;
                    readInt4 = readInt4;
                }
            } else {
                bool = valueOf7;
                arrayList5 = arrayList3;
                arrayList4 = null;
                num3 = valueOf14;
            }
            MarketDeliveryInfoDto marketDeliveryInfoDto3 = marketDeliveryInfoDto;
            String readString11 = parcel.readString();
            MarketItemRejectInfoDto createFromParcel10 = parcel.readInt() == 0 ? null : MarketItemRejectInfoDto.CREATOR.createFromParcel(parcel);
            Integer valueOf15 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ArrayList arrayList8 = arrayList4;
            UserId userId3 = (UserId) parcel.readParcelable(cls3.getClassLoader());
            Integer num4 = valueOf11;
            Integer num5 = valueOf12;
            Integer num6 = num2;
            Integer num7 = num3;
            String readString12 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf8 = null;
            } else {
                valueOf8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                userId = userId3;
                createFromParcel2 = null;
            } else {
                userId = userId3;
                createFromParcel2 = MarketMarketItemRatingDto.CREATOR.createFromParcel(parcel);
            }
            MarketMarketItemRatingDto marketMarketItemRatingDto2 = createFromParcel2;
            if (parcel.readInt() == 0) {
                marketMarketItemRatingDto = marketMarketItemRatingDto2;
                marketItemRejectInfoDto = createFromParcel10;
                marketDeliveryInfoDto2 = marketDeliveryInfoDto3;
                arrayList6 = null;
            } else {
                marketMarketItemRatingDto = marketMarketItemRatingDto2;
                int readInt5 = parcel.readInt();
                marketItemRejectInfoDto = createFromParcel10;
                arrayList6 = new ArrayList(readInt5);
                marketDeliveryInfoDto2 = marketDeliveryInfoDto3;
                int i4 = 0;
                while (i4 != readInt5) {
                    int i5 = readInt5;
                    int readInt6 = parcel.readInt();
                    int i6 = i4;
                    ArrayList arrayList9 = new ArrayList(readInt6);
                    Integer num8 = valueOf15;
                    int i7 = 0;
                    while (i7 != readInt6) {
                        i7 = en.a(BaseImageDto.CREATOR, parcel, arrayList9, i7, 1);
                        readInt6 = readInt6;
                        readString = readString;
                    }
                    arrayList6.add(arrayList9);
                    i4 = i6 + 1;
                    readInt5 = i5;
                    valueOf15 = num8;
                }
            }
            Integer num9 = valueOf15;
            String str = readString;
            if (parcel.readInt() == 0) {
                arrayList7 = null;
            } else {
                int readInt7 = parcel.readInt();
                arrayList7 = new ArrayList(readInt7);
                int i8 = 0;
                while (i8 != readInt7) {
                    i8 = en.a(MarketCustomButtonFullDto.CREATOR, parcel, arrayList7, i8, 1);
                    readInt7 = readInt7;
                }
            }
            if (parcel.readInt() == 0) {
                valueOf9 = null;
            } else {
                valueOf9 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketMarketItemDto(marketMarketItemAvailabilityDto, marketMarketCategoryDto, str, readInt, userId2, createFromParcel5, readString2, readString3, readString4, createFromParcel6, num, readString5, readString6, createFromParcel7, marketMarketItemIntegrationInfoDto, valueOf, bool2, valueOf3, bool3, marketServicesDurationDto, readString7, readString8, num4, valueOf5, num5, arrayList2, num6, marketDeliveryInfoDto2, readString9, valueOf6, readString10, arrayList5, bool, num7, arrayList8, readString11, marketItemRejectInfoDto, num9, userId, readString12, valueOf8, marketMarketItemRatingDto, arrayList6, arrayList7, valueOf9, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketMarketItemDto[] newArray(int i) {
            return new MarketMarketItemDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketMarketItemDto(MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto, MarketMarketCategoryDto marketMarketCategoryDto, String str, int i, UserId userId, MarketPriceDto marketPriceDto, String str2, String str3, String str4, MarketMarketCategoryDto marketMarketCategoryDto2, Integer num, String str5, String str6, MarketMarketItemTypeDto marketMarketItemTypeDto, MarketMarketItemIntegrationInfoDto marketMarketItemIntegrationInfoDto, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, MarketServicesDurationDto marketServicesDurationDto, String str7, String str8, Integer num2, Boolean bool5, Integer num3, List<MarketItemPropertyValueDto> list, Integer num4, MarketDeliveryInfoDto marketDeliveryInfoDto, String str9, Boolean bool6, String str10, List<BaseImageDto> list2, Boolean bool7, Integer num5, List<MarketBadgeDto> list3, String str11, MarketItemRejectInfoDto marketItemRejectInfoDto, Integer num6, UserId userId2, String str12, Boolean bool8, MarketMarketItemRatingDto marketMarketItemRatingDto, List<? extends List<BaseImageDto>> list4, List<MarketCustomButtonFullDto> list5, Boolean bool9, String str13, String str14, String str15, String str16, String str17) {
        this.availability = marketMarketItemAvailabilityDto;
        this.category = marketMarketCategoryDto;
        this.description = str;
        this.id = i;
        this.ownerId = userId;
        this.price = marketPriceDto;
        this.title = str2;
        this.accessKey = str3;
        this.buttonTitle = str4;
        this.categoryV2 = marketMarketCategoryDto2;
        this.date = num;
        this.descriptionUrl = str5;
        this.externalId = str6;
        this.itemType = marketMarketItemTypeDto;
        this.integrationInfo = marketMarketItemIntegrationInfoDto;
        this.isFavorite = bool;
        this.isPriceListService = bool2;
        this.isOwner = bool3;
        this.isAdult = bool4;
        this.serviceDuration = marketServicesDurationDto;
        this.thumbPhoto = str7;
        this.url = str8;
        this.variantsGroupingId = num2;
        this.isMainVariant = bool5;
        this.availableVariantItemId = num3;
        this.propertyValues = list;
        this.cartQuantity = num4;
        this.deliveryInfo = marketDeliveryInfoDto;
        this.sku = str9;
        this.isAliexpressProduct = bool6;
        this.csrfHashes = str10;
        this.thumb = list2;
        this.isAliexpressCheckout = bool7;
        this.stockAmount = num5;
        this.badges = list3;
        this.trackCode = str11;
        this.rejectInfo = marketItemRejectInfoDto;
        this.postId = num6;
        this.postOwnerId = userId2;
        this.openMarketLink = str12;
        this.isHardblocked = bool8;
        this.itemRating = marketMarketItemRatingDto;
        this.thumbs = list4;
        this.buttons = list5;
        this.hasGroupAccess = bool9;
        this.seoSlug = str13;
        this.seoTitle = str14;
        this.seoDescription = str15;
        this.externalUrl = str16;
        this.marketUrl = str17;
    }

    public final MarketMarketItemTypeDto B() {
        return this.itemType;
    }

    public final String C() {
        return this.marketUrl;
    }

    public final String D() {
        return this.openMarketLink;
    }

    public final Boolean D0() {
        return this.isOwner;
    }

    public final MarketPriceDto F() {
        return this.price;
    }

    public final Boolean F0() {
        return this.isPriceListService;
    }

    public final List<MarketItemPropertyValueDto> G() {
        return this.propertyValues;
    }

    public final MarketItemRejectInfoDto K() {
        return this.rejectInfo;
    }

    public final MarketServicesDurationDto M() {
        return this.serviceDuration;
    }

    public final String R() {
        return this.sku;
    }

    public final Integer T() {
        return this.stockAmount;
    }

    public final List<BaseImageDto> W() {
        return this.thumb;
    }

    public final String Z() {
        return this.thumbPhoto;
    }

    public final List<List<BaseImageDto>> a0() {
        return this.thumbs;
    }

    public final MarketMarketItemAvailabilityDto d() {
        return this.availability;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.availableVariantItemId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketMarketItemDto)) {
            return false;
        }
        MarketMarketItemDto marketMarketItemDto = (MarketMarketItemDto) obj;
        return this.availability == marketMarketItemDto.availability && epx.f(this.category, marketMarketItemDto.category) && epx.f(this.description, marketMarketItemDto.description) && this.id == marketMarketItemDto.id && epx.f(this.ownerId, marketMarketItemDto.ownerId) && epx.f(this.price, marketMarketItemDto.price) && epx.f(this.title, marketMarketItemDto.title) && epx.f(this.accessKey, marketMarketItemDto.accessKey) && epx.f(this.buttonTitle, marketMarketItemDto.buttonTitle) && epx.f(this.categoryV2, marketMarketItemDto.categoryV2) && epx.f(this.date, marketMarketItemDto.date) && epx.f(this.descriptionUrl, marketMarketItemDto.descriptionUrl) && epx.f(this.externalId, marketMarketItemDto.externalId) && this.itemType == marketMarketItemDto.itemType && epx.f(this.integrationInfo, marketMarketItemDto.integrationInfo) && epx.f(this.isFavorite, marketMarketItemDto.isFavorite) && epx.f(this.isPriceListService, marketMarketItemDto.isPriceListService) && epx.f(this.isOwner, marketMarketItemDto.isOwner) && epx.f(this.isAdult, marketMarketItemDto.isAdult) && epx.f(this.serviceDuration, marketMarketItemDto.serviceDuration) && epx.f(this.thumbPhoto, marketMarketItemDto.thumbPhoto) && epx.f(this.url, marketMarketItemDto.url) && epx.f(this.variantsGroupingId, marketMarketItemDto.variantsGroupingId) && epx.f(this.isMainVariant, marketMarketItemDto.isMainVariant) && epx.f(this.availableVariantItemId, marketMarketItemDto.availableVariantItemId) && epx.f(this.propertyValues, marketMarketItemDto.propertyValues) && epx.f(this.cartQuantity, marketMarketItemDto.cartQuantity) && epx.f(this.deliveryInfo, marketMarketItemDto.deliveryInfo) && epx.f(this.sku, marketMarketItemDto.sku) && epx.f(this.isAliexpressProduct, marketMarketItemDto.isAliexpressProduct) && epx.f(this.csrfHashes, marketMarketItemDto.csrfHashes) && epx.f(this.thumb, marketMarketItemDto.thumb) && epx.f(this.isAliexpressCheckout, marketMarketItemDto.isAliexpressCheckout) && epx.f(this.stockAmount, marketMarketItemDto.stockAmount) && epx.f(this.badges, marketMarketItemDto.badges) && epx.f(this.trackCode, marketMarketItemDto.trackCode) && epx.f(this.rejectInfo, marketMarketItemDto.rejectInfo) && epx.f(this.postId, marketMarketItemDto.postId) && epx.f(this.postOwnerId, marketMarketItemDto.postOwnerId) && epx.f(this.openMarketLink, marketMarketItemDto.openMarketLink) && epx.f(this.isHardblocked, marketMarketItemDto.isHardblocked) && epx.f(this.itemRating, marketMarketItemDto.itemRating) && epx.f(this.thumbs, marketMarketItemDto.thumbs) && epx.f(this.buttons, marketMarketItemDto.buttons) && epx.f(this.hasGroupAccess, marketMarketItemDto.hasGroupAccess) && epx.f(this.seoSlug, marketMarketItemDto.seoSlug) && epx.f(this.seoTitle, marketMarketItemDto.seoTitle) && epx.f(this.seoDescription, marketMarketItemDto.seoDescription) && epx.f(this.externalUrl, marketMarketItemDto.externalUrl) && epx.f(this.marketUrl, marketMarketItemDto.marketUrl);
    }

    public final List<MarketBadgeDto> f() {
        return this.badges;
    }

    public final List<MarketCustomButtonFullDto> g() {
        return this.buttons;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int a2 = urd0.a((this.price.hashCode() + bh10.a(shy.a(this.id, urd0.a((this.category.hashCode() + (this.availability.hashCode() * 31)) * 31, 31, this.description), 31), 31, this.ownerId.b)) * 31, 31, this.title);
        String str = this.accessKey;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.buttonTitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        MarketMarketCategoryDto marketMarketCategoryDto = this.categoryV2;
        int hashCode3 = (hashCode2 + (marketMarketCategoryDto == null ? 0 : marketMarketCategoryDto.hashCode())) * 31;
        Integer num = this.date;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.descriptionUrl;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.externalId;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        MarketMarketItemTypeDto marketMarketItemTypeDto = this.itemType;
        int hashCode7 = (hashCode6 + (marketMarketItemTypeDto == null ? 0 : marketMarketItemTypeDto.hashCode())) * 31;
        MarketMarketItemIntegrationInfoDto marketMarketItemIntegrationInfoDto = this.integrationInfo;
        int hashCode8 = (hashCode7 + (marketMarketItemIntegrationInfoDto == null ? 0 : marketMarketItemIntegrationInfoDto.hashCode())) * 31;
        Boolean bool = this.isFavorite;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isPriceListService;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isOwner;
        int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isAdult;
        int hashCode12 = (hashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        MarketServicesDurationDto marketServicesDurationDto = this.serviceDuration;
        int hashCode13 = (hashCode12 + (marketServicesDurationDto == null ? 0 : marketServicesDurationDto.hashCode())) * 31;
        String str5 = this.thumbPhoto;
        int hashCode14 = (hashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.url;
        int hashCode15 = (hashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.variantsGroupingId;
        int hashCode16 = (hashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool5 = this.isMainVariant;
        int hashCode17 = (hashCode16 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.availableVariantItemId;
        int hashCode18 = (hashCode17 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<MarketItemPropertyValueDto> list = this.propertyValues;
        int hashCode19 = (hashCode18 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num4 = this.cartQuantity;
        int hashCode20 = (hashCode19 + (num4 == null ? 0 : num4.hashCode())) * 31;
        MarketDeliveryInfoDto marketDeliveryInfoDto = this.deliveryInfo;
        int hashCode21 = (hashCode20 + (marketDeliveryInfoDto == null ? 0 : marketDeliveryInfoDto.hashCode())) * 31;
        String str7 = this.sku;
        int hashCode22 = (hashCode21 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool6 = this.isAliexpressProduct;
        int hashCode23 = (hashCode22 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str8 = this.csrfHashes;
        int hashCode24 = (hashCode23 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<BaseImageDto> list2 = this.thumb;
        int hashCode25 = (hashCode24 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool7 = this.isAliexpressCheckout;
        int hashCode26 = (hashCode25 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Integer num5 = this.stockAmount;
        int hashCode27 = (hashCode26 + (num5 == null ? 0 : num5.hashCode())) * 31;
        List<MarketBadgeDto> list3 = this.badges;
        int hashCode28 = (hashCode27 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str9 = this.trackCode;
        int hashCode29 = (hashCode28 + (str9 == null ? 0 : str9.hashCode())) * 31;
        MarketItemRejectInfoDto marketItemRejectInfoDto = this.rejectInfo;
        int hashCode30 = (hashCode29 + (marketItemRejectInfoDto == null ? 0 : marketItemRejectInfoDto.hashCode())) * 31;
        Integer num6 = this.postId;
        int hashCode31 = (hashCode30 + (num6 == null ? 0 : num6.hashCode())) * 31;
        UserId userId = this.postOwnerId;
        int hashCode32 = (hashCode31 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str10 = this.openMarketLink;
        int hashCode33 = (hashCode32 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool8 = this.isHardblocked;
        int hashCode34 = (hashCode33 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        MarketMarketItemRatingDto marketMarketItemRatingDto = this.itemRating;
        int hashCode35 = (hashCode34 + (marketMarketItemRatingDto == null ? 0 : marketMarketItemRatingDto.hashCode())) * 31;
        List<List<BaseImageDto>> list4 = this.thumbs;
        int hashCode36 = (hashCode35 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<MarketCustomButtonFullDto> list5 = this.buttons;
        int hashCode37 = (hashCode36 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Boolean bool9 = this.hasGroupAccess;
        int hashCode38 = (hashCode37 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        String str11 = this.seoSlug;
        int hashCode39 = (hashCode38 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.seoTitle;
        int hashCode40 = (hashCode39 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.seoDescription;
        int hashCode41 = (hashCode40 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.externalUrl;
        int hashCode42 = (hashCode41 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.marketUrl;
        return hashCode42 + (str15 != null ? str15.hashCode() : 0);
    }

    public final Integer i() {
        return this.cartQuantity;
    }

    public final MarketMarketCategoryDto j() {
        return this.category;
    }

    public final Integer k() {
        return this.date;
    }

    public final MarketDeliveryInfoDto l() {
        return this.deliveryInfo;
    }

    public final Integer l0() {
        return this.variantsGroupingId;
    }

    public final String n() {
        return this.descriptionUrl;
    }

    public final String o() {
        return this.externalId;
    }

    public final MarketMarketItemIntegrationInfoDto p() {
        return this.integrationInfo;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketMarketItemDto(availability=");
        sb.append(this.availability);
        sb.append(", category=");
        sb.append(this.category);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", accessKey=");
        sb.append(this.accessKey);
        sb.append(", buttonTitle=");
        sb.append(this.buttonTitle);
        sb.append(", categoryV2=");
        sb.append(this.categoryV2);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", descriptionUrl=");
        sb.append(this.descriptionUrl);
        sb.append(", externalId=");
        sb.append(this.externalId);
        sb.append(", itemType=");
        sb.append(this.itemType);
        sb.append(", integrationInfo=");
        sb.append(this.integrationInfo);
        sb.append(", isFavorite=");
        sb.append(this.isFavorite);
        sb.append(", isPriceListService=");
        sb.append(this.isPriceListService);
        sb.append(", isOwner=");
        sb.append(this.isOwner);
        sb.append(", isAdult=");
        sb.append(this.isAdult);
        sb.append(", serviceDuration=");
        sb.append(this.serviceDuration);
        sb.append(", thumbPhoto=");
        sb.append(this.thumbPhoto);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", variantsGroupingId=");
        sb.append(this.variantsGroupingId);
        sb.append(", isMainVariant=");
        sb.append(this.isMainVariant);
        sb.append(", availableVariantItemId=");
        sb.append(this.availableVariantItemId);
        sb.append(", propertyValues=");
        sb.append(this.propertyValues);
        sb.append(", cartQuantity=");
        sb.append(this.cartQuantity);
        sb.append(", deliveryInfo=");
        sb.append(this.deliveryInfo);
        sb.append(", sku=");
        sb.append(this.sku);
        sb.append(", isAliexpressProduct=");
        sb.append(this.isAliexpressProduct);
        sb.append(", csrfHashes=");
        sb.append(this.csrfHashes);
        sb.append(", thumb=");
        sb.append(this.thumb);
        sb.append(", isAliexpressCheckout=");
        sb.append(this.isAliexpressCheckout);
        sb.append(", stockAmount=");
        sb.append(this.stockAmount);
        sb.append(", badges=");
        sb.append(this.badges);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", rejectInfo=");
        sb.append(this.rejectInfo);
        sb.append(", postId=");
        sb.append(this.postId);
        sb.append(", postOwnerId=");
        sb.append(this.postOwnerId);
        sb.append(", openMarketLink=");
        sb.append(this.openMarketLink);
        sb.append(", isHardblocked=");
        sb.append(this.isHardblocked);
        sb.append(", itemRating=");
        sb.append(this.itemRating);
        sb.append(", thumbs=");
        sb.append(this.thumbs);
        sb.append(", buttons=");
        sb.append(this.buttons);
        sb.append(", hasGroupAccess=");
        sb.append(this.hasGroupAccess);
        sb.append(", seoSlug=");
        sb.append(this.seoSlug);
        sb.append(", seoTitle=");
        sb.append(this.seoTitle);
        sb.append(", seoDescription=");
        sb.append(this.seoDescription);
        sb.append(", externalUrl=");
        sb.append(this.externalUrl);
        sb.append(", marketUrl=");
        return ho8.a(sb, this.marketUrl, ')');
    }

    public final MarketMarketItemRatingDto u() {
        return this.itemRating;
    }

    public final Boolean v0() {
        return this.isAdult;
    }

    public final Boolean w0() {
        return this.isFavorite;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.availability.writeToParcel(parcel, i);
        this.category.writeToParcel(parcel, i);
        parcel.writeString(this.description);
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        this.price.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.accessKey);
        parcel.writeString(this.buttonTitle);
        MarketMarketCategoryDto marketMarketCategoryDto = this.categoryV2;
        if (marketMarketCategoryDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketMarketCategoryDto.writeToParcel(parcel, i);
        }
        Integer num = this.date;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.descriptionUrl);
        parcel.writeString(this.externalId);
        MarketMarketItemTypeDto marketMarketItemTypeDto = this.itemType;
        if (marketMarketItemTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketMarketItemTypeDto.writeToParcel(parcel, i);
        }
        MarketMarketItemIntegrationInfoDto marketMarketItemIntegrationInfoDto = this.integrationInfo;
        if (marketMarketItemIntegrationInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketMarketItemIntegrationInfoDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.isFavorite;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isPriceListService;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isOwner;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.isAdult;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        MarketServicesDurationDto marketServicesDurationDto = this.serviceDuration;
        if (marketServicesDurationDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketServicesDurationDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.thumbPhoto);
        parcel.writeString(this.url);
        Integer num2 = this.variantsGroupingId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Boolean bool5 = this.isMainVariant;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        Integer num3 = this.availableVariantItemId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        List<MarketItemPropertyValueDto> list = this.propertyValues;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MarketItemPropertyValueDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Integer num4 = this.cartQuantity;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        MarketDeliveryInfoDto marketDeliveryInfoDto = this.deliveryInfo;
        if (marketDeliveryInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketDeliveryInfoDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.sku);
        Boolean bool6 = this.isAliexpressProduct;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        parcel.writeString(this.csrfHashes);
        List<BaseImageDto> list2 = this.thumb;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((BaseImageDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool7 = this.isAliexpressCheckout;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        Integer num5 = this.stockAmount;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        List<MarketBadgeDto> list3 = this.badges;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((MarketBadgeDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.trackCode);
        MarketItemRejectInfoDto marketItemRejectInfoDto = this.rejectInfo;
        if (marketItemRejectInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketItemRejectInfoDto.writeToParcel(parcel, i);
        }
        Integer num6 = this.postId;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        parcel.writeParcelable(this.postOwnerId, i);
        parcel.writeString(this.openMarketLink);
        Boolean bool8 = this.isHardblocked;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool8);
        }
        MarketMarketItemRatingDto marketMarketItemRatingDto = this.itemRating;
        if (marketMarketItemRatingDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketMarketItemRatingDto.writeToParcel(parcel, i);
        }
        List<List<BaseImageDto>> list4 = this.thumbs;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                Iterator a2 = ao.a(parcel, (List) f4.next());
                while (a2.hasNext()) {
                    ((BaseImageDto) a2.next()).writeToParcel(parcel, i);
                }
            }
        }
        List<MarketCustomButtonFullDto> list5 = this.buttons;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                ((MarketCustomButtonFullDto) f5.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool9 = this.hasGroupAccess;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool9);
        }
        parcel.writeString(this.seoSlug);
        parcel.writeString(this.seoTitle);
        parcel.writeString(this.seoDescription);
        parcel.writeString(this.externalUrl);
        parcel.writeString(this.marketUrl);
    }

    public final Boolean y0() {
        return this.isHardblocked;
    }

    public /* synthetic */ MarketMarketItemDto(MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto, MarketMarketCategoryDto marketMarketCategoryDto, String str, int i, UserId userId, MarketPriceDto marketPriceDto, String str2, String str3, String str4, MarketMarketCategoryDto marketMarketCategoryDto2, Integer num, String str5, String str6, MarketMarketItemTypeDto marketMarketItemTypeDto, MarketMarketItemIntegrationInfoDto marketMarketItemIntegrationInfoDto, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, MarketServicesDurationDto marketServicesDurationDto, String str7, String str8, Integer num2, Boolean bool5, Integer num3, List list, Integer num4, MarketDeliveryInfoDto marketDeliveryInfoDto, String str9, Boolean bool6, String str10, List list2, Boolean bool7, Integer num5, List list3, String str11, MarketItemRejectInfoDto marketItemRejectInfoDto, Integer num6, UserId userId2, String str12, Boolean bool8, MarketMarketItemRatingDto marketMarketItemRatingDto, List list4, List list5, Boolean bool9, String str13, String str14, String str15, String str16, String str17, int i2, int i3, zcl zclVar) {
        this(marketMarketItemAvailabilityDto, marketMarketCategoryDto, str, i, userId, marketPriceDto, str2, (i2 & 128) != 0 ? null : str3, (i2 & 256) != 0 ? null : str4, (i2 & 512) != 0 ? null : marketMarketCategoryDto2, (i2 & 1024) != 0 ? null : num, (i2 & 2048) != 0 ? null : str5, (i2 & 4096) != 0 ? null : str6, (i2 & 8192) != 0 ? null : marketMarketItemTypeDto, (i2 & 16384) != 0 ? null : marketMarketItemIntegrationInfoDto, (i2 & 32768) != 0 ? null : bool, (i2 & 65536) != 0 ? null : bool2, (i2 & 131072) != 0 ? null : bool3, (262144 & i2) != 0 ? null : bool4, (524288 & i2) != 0 ? null : marketServicesDurationDto, (1048576 & i2) != 0 ? null : str7, (2097152 & i2) != 0 ? null : str8, (4194304 & i2) != 0 ? null : num2, (8388608 & i2) != 0 ? null : bool5, (16777216 & i2) != 0 ? null : num3, (33554432 & i2) != 0 ? null : list, (67108864 & i2) != 0 ? null : num4, (134217728 & i2) != 0 ? null : marketDeliveryInfoDto, (268435456 & i2) != 0 ? null : str9, (536870912 & i2) != 0 ? null : bool6, (1073741824 & i2) != 0 ? null : str10, (i2 & Integer.MIN_VALUE) != 0 ? null : list2, (i3 & 1) != 0 ? null : bool7, (i3 & 2) != 0 ? null : num5, (i3 & 4) != 0 ? null : list3, (i3 & 8) != 0 ? null : str11, (i3 & 16) != 0 ? null : marketItemRejectInfoDto, (i3 & 32) != 0 ? null : num6, (i3 & 64) != 0 ? null : userId2, (i3 & 128) != 0 ? null : str12, (i3 & 256) != 0 ? null : bool8, (i3 & 512) != 0 ? null : marketMarketItemRatingDto, (i3 & 1024) != 0 ? null : list4, (i3 & 2048) != 0 ? null : list5, (i3 & 4096) != 0 ? null : bool9, (i3 & 8192) != 0 ? null : str13, (i3 & 16384) != 0 ? null : str14, (i3 & 32768) != 0 ? null : str15, (i3 & 65536) != 0 ? null : str16, (i3 & 131072) != 0 ? null : str17);
    }
}
