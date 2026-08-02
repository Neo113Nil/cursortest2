package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLikesDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.base.dto.BaseLinkDto;
import com.vk.api.generated.base.dto.BaseRepostsInfoDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.likes.dto.LikesItemReactionsDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bh10;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketMarketItemFullDto.kt */
/* loaded from: classes15.dex */
public final class MarketMarketItemFullDto implements Parcelable {
    public static final Parcelable.Creator<MarketMarketItemFullDto> CREATOR = new a();

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("action_buttons")
    private final List<BaseLinkButtonDto> actionButtons;

    @pmi0("ad_id")
    private final Integer adId;

    @pmi0("addresses")
    private final MarketItemAddressesDto addresses;

    @pmi0("ads_label")
    private final String adsLabel;

    @pmi0("albums_ids")
    private final List<Integer> albumsIds;

    @pmi0("availability")
    private final MarketMarketItemAvailabilityDto availability;

    @pmi0("available_variant_item_id")
    private final Integer availableVariantItemId;

    @pmi0("badges")
    private final List<MarketBadgeDto> badges;

    @pmi0("banner")
    private final MarketItemBannerDto banner;

    @pmi0("button_title")
    private final String buttonTitle;

    @pmi0("buttons")
    private final List<MarketCustomButtonFullDto> buttons;

    @pmi0("can_comment")
    private final BaseBoolIntDto canComment;

    @pmi0("can_delete")
    private final Boolean canDelete;

    @pmi0("can_delete_image")
    private final Boolean canDeleteImage;

    @pmi0("can_delete_with_reason")
    private final Boolean canDeleteWithReason;

    @pmi0("can_edit")
    private final Boolean canEdit;

    @pmi0("can_recover")
    private final Boolean canRecover;

    @pmi0("can_repost")
    private final BaseBoolIntDto canRepost;

    @pmi0("can_show_convert_to_service")
    private final Boolean canShowConvertToService;

    @pmi0("cancel_info")
    private final BaseLinkDto cancelInfo;

    @pmi0("cart_quantity")
    private final Integer cartQuantity;

    @pmi0("category")
    private final MarketMarketCategoryDto category;

    @pmi0("category_v2")
    private final MarketMarketCategoryDto categoryV2;

    @pmi0("characteristics")
    private final List<MarketItemCharacteristicDto> characteristics;

    @pmi0("csrf_hashes")
    private final String csrfHashes;

    @pmi0("custom_buttons")
    private final List<MarketCustomButtonFullDto> customButtons;

    @pmi0("date")
    private final Integer date;

    @pmi0("delivery_info")
    private final MarketDeliveryInfoDto deliveryInfo;

    @pmi0("delivery_methods_info")
    private final MarketDeliveryMethodsInfoDto deliveryMethodsInfo;

    @pmi0("description")
    private final String description;

    @pmi0("description_url")
    private final String descriptionUrl;

    @pmi0("dimensions")
    private final MarketItemDimensionsDto dimensions;

    @pmi0("external_id")
    private final String externalId;

    @pmi0("external_url")
    private final String externalUrl;

    @pmi0("group")
    private final GroupsGroupFullDto group;

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

    @pmi0("labels")
    private final List<MarketItemLabelDto> labels;

    @pmi0("likes")
    private final BaseLikesDto likes;

    @pmi0("market_url")
    private final String marketUrl;

    @pmi0("open_market_link")
    private final String openMarketLink;

    @pmi0("orders_count")
    private final Integer ordersCount;

    @pmi0("other_items")
    private final List<MarketMarketItemOtherItemsDto> otherItems;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("owner_info")
    private final MarketItemOwnerInfoDto ownerInfo;

    @pmi0("photos")
    private final List<PhotosPhotoDto> photos;

    @pmi0("post_id")
    private final Integer postId;

    @pmi0("post_owner_id")
    private final UserId postOwnerId;

    @pmi0("price")
    private final MarketPriceDto price;

    @pmi0("promotion")
    private final MarketItemPromotionInfoDto promotion;

    @pmi0("properties")
    private final List<MarketPropertyDto> properties;

    @pmi0("property_values")
    private final List<MarketItemPropertyValueDto> propertyValues;

    @pmi0(CampaignEx.JSON_KEY_STAR)
    private final Float rating;

    @pmi0("reaction_set_id")
    private final String reactionSetId;

    @pmi0("reactions")
    private final LikesItemReactionsDto reactions;

    @pmi0("reject_info")
    private final MarketItemRejectInfoDto rejectInfo;

    @pmi0("reposts")
    private final BaseRepostsInfoDto reposts;

    @pmi0("seo_description")
    private final String seoDescription;

    @pmi0("seo_slug")
    private final String seoSlug;

    @pmi0("seo_title")
    private final String seoTitle;

    @pmi0("service_duration")
    private final MarketServicesDurationDto serviceDuration;

    @pmi0("show_comments")
    private final BaseBoolIntDto showComments;

    @pmi0("show_reviews")
    private final BaseBoolIntDto showReviews;

    @pmi0("similar_items")
    private final List<MarketSimilarItemsDto> similarItems;

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

    @pmi0("user_agreement_info")
    private final String userAgreementInfo;

    @pmi0("variants")
    private final List<MarketItemPropertyVariantsDto> variants;

    @pmi0("variants_grid")
    private final List<MarketVariantsGridPropertyDto> variantsGrid;

    @pmi0("variants_grouping_id")
    private final Integer variantsGroupingId;

    @pmi0("videos")
    private final List<MarketItemVideoDto> videos;

    @pmi0("views_count")
    private final Integer viewsCount;

    @pmi0("vk_pay_discount")
    private final Integer vkPayDiscount;

    @pmi0("weight")
    private final Integer weight;

    @pmi0("wishlist_item_id")
    private final Integer wishlistItemId;

    /* compiled from: MarketMarketItemFullDto.kt */
    public static final class a implements Parcelable.Creator<MarketMarketItemFullDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketMarketItemFullDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            MarketItemBannerDto marketItemBannerDto;
            ArrayList arrayList3;
            MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto;
            ArrayList arrayList4;
            BaseRepostsInfoDto baseRepostsInfoDto;
            BaseBoolIntDto baseBoolIntDto;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ArrayList arrayList7;
            ArrayList arrayList8;
            MarketItemAddressesDto marketItemAddressesDto;
            ArrayList arrayList9;
            ArrayList arrayList10;
            BaseLinkDto baseLinkDto;
            MarketItemOwnerInfoDto createFromParcel;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            Boolean valueOf6;
            MarketItemOwnerInfoDto marketItemOwnerInfoDto;
            MarketItemPromotionInfoDto createFromParcel2;
            MarketItemPromotionInfoDto marketItemPromotionInfoDto;
            ArrayList arrayList11;
            ArrayList arrayList12;
            Float f;
            ArrayList arrayList13;
            ArrayList arrayList14;
            ArrayList arrayList15;
            MarketItemAddressesDto marketItemAddressesDto2;
            ArrayList arrayList16;
            GroupsGroupFullDto groupsGroupFullDto;
            Boolean valueOf7;
            Boolean valueOf8;
            Boolean valueOf9;
            Boolean valueOf10;
            Boolean valueOf11;
            MarketServicesDurationDto marketServicesDurationDto;
            BaseBoolIntDto baseBoolIntDto2;
            ArrayList arrayList17;
            MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto2;
            Boolean valueOf12;
            Integer num;
            ArrayList arrayList18;
            ArrayList arrayList19;
            MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto3;
            Boolean valueOf13;
            ArrayList arrayList20;
            ArrayList arrayList21;
            Integer num2;
            MarketServicesDurationDto marketServicesDurationDto2;
            Integer num3;
            Boolean bool;
            Boolean valueOf14;
            MarketMarketItemRatingDto marketMarketItemRatingDto;
            ArrayList arrayList22;
            ArrayList arrayList23;
            MarketItemRejectInfoDto marketItemRejectInfoDto;
            ArrayList arrayList24;
            Boolean valueOf15;
            MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto4 = (MarketMarketItemAvailabilityDto) parcel.readParcelable(MarketMarketItemFullDto.class.getClassLoader());
            MarketMarketCategoryDto marketMarketCategoryDto = (MarketMarketCategoryDto) parcel.readParcelable(MarketMarketItemFullDto.class.getClassLoader());
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(MarketMarketItemFullDto.class.getClassLoader());
            MarketPriceDto marketPriceDto = (MarketPriceDto) parcel.readParcelable(MarketMarketItemFullDto.class.getClassLoader());
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = en.a(MarketMarketItemOtherItemsDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            MarketItemBannerDto createFromParcel3 = parcel.readInt() == 0 ? null : MarketItemBannerDto.CREATOR.createFromParcel(parcel);
            MarketItemDimensionsDto createFromParcel4 = parcel.readInt() == 0 ? null : MarketItemDimensionsDto.CREATOR.createFromParcel(parcel);
            Integer valueOf16 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                marketItemBannerDto = createFromParcel3;
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                marketItemBannerDto = createFromParcel3;
                int i2 = 0;
                while (i2 != readInt3) {
                    i2 = pm0.b(parcel, arrayList2, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                marketMarketItemAvailabilityDto = marketMarketItemAvailabilityDto4;
                arrayList3 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList3 = new ArrayList(readInt4);
                marketMarketItemAvailabilityDto = marketMarketItemAvailabilityDto4;
                int i3 = 0;
                while (i3 != readInt4) {
                    i3 = bo.b(MarketMarketItemFullDto.class, parcel, arrayList3, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList4 = new ArrayList(readInt5);
                int i4 = 0;
                while (i4 != readInt5) {
                    i4 = en.a(MarketItemVideoDto.CREATOR, parcel, arrayList4, i4, 1);
                    readInt5 = readInt5;
                    marketMarketCategoryDto = marketMarketCategoryDto;
                }
            }
            MarketMarketCategoryDto marketMarketCategoryDto2 = marketMarketCategoryDto;
            BaseBoolIntDto baseBoolIntDto3 = (BaseBoolIntDto) parcel.readParcelable(MarketMarketItemFullDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto4 = (BaseBoolIntDto) parcel.readParcelable(MarketMarketItemFullDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto5 = (BaseBoolIntDto) parcel.readParcelable(MarketMarketItemFullDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto6 = (BaseBoolIntDto) parcel.readParcelable(MarketMarketItemFullDto.class.getClassLoader());
            BaseLikesDto baseLikesDto = (BaseLikesDto) parcel.readParcelable(MarketMarketItemFullDto.class.getClassLoader());
            ArrayList arrayList25 = arrayList3;
            ArrayList arrayList26 = arrayList;
            Integer num4 = valueOf16;
            ArrayList arrayList27 = arrayList2;
            MarketItemBannerDto marketItemBannerDto2 = marketItemBannerDto;
            String readString3 = parcel.readString();
            LikesItemReactionsDto likesItemReactionsDto = (LikesItemReactionsDto) parcel.readParcelable(MarketMarketItemFullDto.class.getClassLoader());
            BaseRepostsInfoDto baseRepostsInfoDto2 = (BaseRepostsInfoDto) parcel.readParcelable(MarketMarketItemFullDto.class.getClassLoader());
            Integer valueOf17 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                baseRepostsInfoDto = baseRepostsInfoDto2;
                baseBoolIntDto = baseBoolIntDto4;
                arrayList6 = arrayList4;
                arrayList5 = null;
            } else {
                baseRepostsInfoDto = baseRepostsInfoDto2;
                int readInt6 = parcel.readInt();
                baseBoolIntDto = baseBoolIntDto4;
                arrayList5 = new ArrayList(readInt6);
                arrayList6 = arrayList4;
                int i5 = 0;
                while (i5 != readInt6) {
                    i5 = en.a(MarketPropertyDto.CREATOR, parcel, arrayList5, i5, 1);
                    readInt6 = readInt6;
                    baseBoolIntDto5 = baseBoolIntDto5;
                }
            }
            BaseBoolIntDto baseBoolIntDto7 = baseBoolIntDto5;
            if (parcel.readInt() == 0) {
                arrayList7 = null;
            } else {
                int readInt7 = parcel.readInt();
                arrayList7 = new ArrayList(readInt7);
                int i6 = 0;
                while (i6 != readInt7) {
                    i6 = en.a(MarketItemPropertyVariantsDto.CREATOR, parcel, arrayList7, i6, 1);
                    readInt7 = readInt7;
                    arrayList5 = arrayList5;
                }
            }
            ArrayList arrayList28 = arrayList5;
            MarketItemAddressesDto createFromParcel5 = parcel.readInt() == 0 ? null : MarketItemAddressesDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                marketItemAddressesDto = createFromParcel5;
                arrayList8 = null;
            } else {
                int readInt8 = parcel.readInt();
                arrayList8 = new ArrayList(readInt8);
                marketItemAddressesDto = createFromParcel5;
                int i7 = 0;
                while (i7 != readInt8) {
                    i7 = en.a(MarketVariantsGridPropertyDto.CREATOR, parcel, arrayList8, i7, 1);
                    readInt8 = readInt8;
                    arrayList7 = arrayList7;
                }
            }
            ArrayList arrayList29 = arrayList7;
            if (parcel.readInt() == 0) {
                arrayList10 = arrayList8;
                arrayList9 = null;
            } else {
                int readInt9 = parcel.readInt();
                arrayList9 = new ArrayList(readInt9);
                arrayList10 = arrayList8;
                int i8 = 0;
                while (i8 != readInt9) {
                    i8 = bo.b(MarketMarketItemFullDto.class, parcel, arrayList9, i8, 1);
                }
            }
            Integer valueOf18 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Float valueOf19 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Integer valueOf20 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer num5 = valueOf18;
            BaseLinkDto baseLinkDto2 = (BaseLinkDto) parcel.readParcelable(MarketMarketItemFullDto.class.getClassLoader());
            String readString4 = parcel.readString();
            Integer valueOf21 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                baseLinkDto = baseLinkDto2;
                createFromParcel = null;
            } else {
                baseLinkDto = baseLinkDto2;
                createFromParcel = MarketItemOwnerInfoDto.CREATOR.createFromParcel(parcel);
            }
            MarketItemOwnerInfoDto marketItemOwnerInfoDto2 = createFromParcel;
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
            if (parcel.readInt() == 0) {
                marketItemOwnerInfoDto = marketItemOwnerInfoDto2;
                createFromParcel2 = null;
            } else {
                marketItemOwnerInfoDto = marketItemOwnerInfoDto2;
                createFromParcel2 = MarketItemPromotionInfoDto.CREATOR.createFromParcel(parcel);
            }
            MarketItemPromotionInfoDto marketItemPromotionInfoDto2 = createFromParcel2;
            Integer valueOf22 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                marketItemPromotionInfoDto = marketItemPromotionInfoDto2;
                arrayList11 = arrayList9;
                f = valueOf19;
                arrayList12 = null;
            } else {
                marketItemPromotionInfoDto = marketItemPromotionInfoDto2;
                int readInt10 = parcel.readInt();
                arrayList11 = arrayList9;
                arrayList12 = new ArrayList(readInt10);
                f = valueOf19;
                int i9 = 0;
                while (i9 != readInt10) {
                    i9 = en.a(MarketSimilarItemsDto.CREATOR, parcel, arrayList12, i9, 1);
                    readInt10 = readInt10;
                    valueOf20 = valueOf20;
                }
            }
            Integer num6 = valueOf20;
            if (parcel.readInt() == 0) {
                arrayList14 = arrayList12;
                arrayList13 = null;
            } else {
                int readInt11 = parcel.readInt();
                arrayList13 = new ArrayList(readInt11);
                arrayList14 = arrayList12;
                int i10 = 0;
                while (i10 != readInt11) {
                    i10 = bo.b(MarketMarketItemFullDto.class, parcel, arrayList13, i10, 1);
                }
            }
            MarketItemAddressesDto marketItemAddressesDto3 = marketItemAddressesDto;
            ArrayList arrayList30 = arrayList11;
            String readString5 = parcel.readString();
            if (parcel.readInt() == 0) {
                marketItemAddressesDto2 = marketItemAddressesDto3;
                arrayList15 = null;
            } else {
                int readInt12 = parcel.readInt();
                arrayList15 = new ArrayList(readInt12);
                marketItemAddressesDto2 = marketItemAddressesDto3;
                int i11 = 0;
                while (i11 != readInt12) {
                    i11 = en.a(MarketItemLabelDto.CREATOR, parcel, arrayList15, i11, 1);
                    readInt12 = readInt12;
                    arrayList13 = arrayList13;
                }
            }
            ArrayList arrayList31 = arrayList13;
            GroupsGroupFullDto groupsGroupFullDto2 = (GroupsGroupFullDto) parcel.readParcelable(MarketMarketItemFullDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                groupsGroupFullDto = groupsGroupFullDto2;
                arrayList16 = null;
            } else {
                int readInt13 = parcel.readInt();
                arrayList16 = new ArrayList(readInt13);
                groupsGroupFullDto = groupsGroupFullDto2;
                int i12 = 0;
                while (i12 != readInt13) {
                    i12 = en.a(MarketItemCharacteristicDto.CREATOR, parcel, arrayList16, i12, 1);
                    readInt13 = readInt13;
                    arrayList15 = arrayList15;
                }
            }
            ArrayList arrayList32 = arrayList15;
            MarketDeliveryMethodsInfoDto createFromParcel6 = parcel.readInt() == 0 ? null : MarketDeliveryMethodsInfoDto.CREATOR.createFromParcel(parcel);
            Integer num7 = valueOf21;
            MarketItemOwnerInfoDto marketItemOwnerInfoDto3 = marketItemOwnerInfoDto;
            Integer num8 = valueOf22;
            ArrayList arrayList33 = arrayList14;
            GroupsGroupFullDto groupsGroupFullDto3 = groupsGroupFullDto;
            String readString6 = parcel.readString();
            MarketMarketCategoryDto marketMarketCategoryDto3 = marketMarketCategoryDto2;
            BaseRepostsInfoDto baseRepostsInfoDto3 = baseRepostsInfoDto;
            BaseLinkDto baseLinkDto3 = baseLinkDto;
            Boolean bool2 = valueOf;
            Boolean bool3 = valueOf2;
            Boolean bool4 = valueOf3;
            Boolean bool5 = valueOf4;
            Boolean bool6 = valueOf5;
            Boolean bool7 = valueOf6;
            MarketItemPromotionInfoDto marketItemPromotionInfoDto3 = marketItemPromotionInfoDto;
            String readString7 = parcel.readString();
            MarketMarketCategoryDto marketMarketCategoryDto4 = (MarketMarketCategoryDto) parcel.readParcelable(MarketMarketItemFullDto.class.getClassLoader());
            Integer valueOf23 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString8 = parcel.readString();
            Integer num9 = valueOf17;
            Float f2 = f;
            Integer num10 = valueOf23;
            String readString9 = parcel.readString();
            MarketMarketItemTypeDto marketMarketItemTypeDto = (MarketMarketItemTypeDto) parcel.readParcelable(MarketMarketItemFullDto.class.getClassLoader());
            MarketMarketItemIntegrationInfoDto marketMarketItemIntegrationInfoDto = (MarketMarketItemIntegrationInfoDto) parcel.readParcelable(MarketMarketItemFullDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf7 = null;
            } else {
                valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf8 = null;
            } else {
                valueOf8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf9 = null;
            } else {
                valueOf9 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf10 = null;
            } else {
                valueOf10 = Boolean.valueOf(parcel.readInt() != 0);
            }
            MarketServicesDurationDto marketServicesDurationDto3 = (MarketServicesDurationDto) parcel.readParcelable(MarketMarketItemFullDto.class.getClassLoader());
            ArrayList arrayList34 = arrayList6;
            ArrayList arrayList35 = arrayList10;
            ArrayList arrayList36 = arrayList16;
            MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto5 = marketMarketItemAvailabilityDto;
            BaseBoolIntDto baseBoolIntDto8 = baseBoolIntDto;
            MarketItemAddressesDto marketItemAddressesDto4 = marketItemAddressesDto2;
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            Integer valueOf24 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf11 = null;
            } else {
                valueOf11 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf25 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                marketServicesDurationDto = marketServicesDurationDto3;
                baseBoolIntDto2 = baseBoolIntDto7;
                marketMarketItemAvailabilityDto2 = marketMarketItemAvailabilityDto5;
                arrayList17 = null;
            } else {
                marketServicesDurationDto = marketServicesDurationDto3;
                int readInt14 = parcel.readInt();
                baseBoolIntDto2 = baseBoolIntDto7;
                arrayList17 = new ArrayList(readInt14);
                marketMarketItemAvailabilityDto2 = marketMarketItemAvailabilityDto5;
                int i13 = 0;
                while (i13 != readInt14) {
                    i13 = bo.b(MarketMarketItemFullDto.class, parcel, arrayList17, i13, 1);
                    readInt14 = readInt14;
                }
            }
            Integer valueOf26 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            MarketDeliveryInfoDto marketDeliveryInfoDto = (MarketDeliveryInfoDto) parcel.readParcelable(MarketMarketItemFullDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto9 = baseBoolIntDto2;
            MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto6 = marketMarketItemAvailabilityDto2;
            String readString12 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf12 = null;
            } else {
                valueOf12 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString13 = parcel.readString();
            if (parcel.readInt() == 0) {
                num = valueOf26;
                arrayList18 = arrayList17;
                marketMarketItemAvailabilityDto3 = marketMarketItemAvailabilityDto6;
                arrayList19 = null;
            } else {
                num = valueOf26;
                int readInt15 = parcel.readInt();
                arrayList18 = arrayList17;
                arrayList19 = new ArrayList(readInt15);
                marketMarketItemAvailabilityDto3 = marketMarketItemAvailabilityDto6;
                int i14 = 0;
                while (i14 != readInt15) {
                    i14 = bo.b(MarketMarketItemFullDto.class, parcel, arrayList19, i14, 1);
                    readInt15 = readInt15;
                }
            }
            if (parcel.readInt() == 0) {
                valueOf13 = null;
            } else {
                valueOf13 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf27 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                Integer num11 = num;
                bool = valueOf13;
                marketServicesDurationDto2 = marketServicesDurationDto;
                num3 = num11;
                arrayList20 = arrayList19;
                num2 = valueOf27;
                arrayList21 = null;
            } else {
                Boolean bool8 = valueOf13;
                int readInt16 = parcel.readInt();
                arrayList20 = arrayList19;
                arrayList21 = new ArrayList(readInt16);
                num2 = valueOf27;
                int i15 = 0;
                while (i15 != readInt16) {
                    i15 = bo.b(MarketMarketItemFullDto.class, parcel, arrayList21, i15, 1);
                    readInt16 = readInt16;
                }
                marketServicesDurationDto2 = marketServicesDurationDto;
                num3 = num;
                bool = bool8;
            }
            String readString14 = parcel.readString();
            MarketItemRejectInfoDto marketItemRejectInfoDto2 = (MarketItemRejectInfoDto) parcel.readParcelable(MarketMarketItemFullDto.class.getClassLoader());
            Integer valueOf28 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            MarketServicesDurationDto marketServicesDurationDto4 = marketServicesDurationDto2;
            UserId userId2 = (UserId) parcel.readParcelable(MarketMarketItemFullDto.class.getClassLoader());
            Boolean bool9 = valueOf7;
            Boolean bool10 = valueOf8;
            Boolean bool11 = valueOf9;
            Boolean bool12 = valueOf10;
            String readString15 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf14 = null;
            } else {
                valueOf14 = Boolean.valueOf(parcel.readInt() != 0);
            }
            MarketMarketItemRatingDto marketMarketItemRatingDto2 = (MarketMarketItemRatingDto) parcel.readParcelable(MarketMarketItemFullDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                marketMarketItemRatingDto = marketMarketItemRatingDto2;
                arrayList22 = arrayList21;
                marketItemRejectInfoDto = marketItemRejectInfoDto2;
                arrayList23 = null;
            } else {
                marketMarketItemRatingDto = marketMarketItemRatingDto2;
                int readInt17 = parcel.readInt();
                arrayList22 = arrayList21;
                arrayList23 = new ArrayList(readInt17);
                marketItemRejectInfoDto = marketItemRejectInfoDto2;
                int i16 = 0;
                while (i16 != readInt17) {
                    int i17 = readInt17;
                    int readInt18 = parcel.readInt();
                    int i18 = i16;
                    ArrayList arrayList37 = new ArrayList(readInt18);
                    MarketMarketCategoryDto marketMarketCategoryDto5 = marketMarketCategoryDto3;
                    int i19 = 0;
                    while (i19 != readInt18) {
                        i19 = bo.b(MarketMarketItemFullDto.class, parcel, arrayList37, i19, 1);
                        readInt18 = readInt18;
                    }
                    arrayList23.add(arrayList37);
                    i16 = i18 + 1;
                    readInt17 = i17;
                    marketMarketCategoryDto3 = marketMarketCategoryDto5;
                }
            }
            MarketMarketCategoryDto marketMarketCategoryDto6 = marketMarketCategoryDto3;
            if (parcel.readInt() == 0) {
                arrayList24 = null;
            } else {
                int readInt19 = parcel.readInt();
                arrayList24 = new ArrayList(readInt19);
                int i20 = 0;
                while (i20 != readInt19) {
                    i20 = bo.b(MarketMarketItemFullDto.class, parcel, arrayList24, i20, 1);
                    readInt19 = readInt19;
                }
            }
            if (parcel.readInt() == 0) {
                valueOf15 = null;
            } else {
                valueOf15 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketMarketItemFullDto(marketMarketItemAvailabilityDto3, marketMarketCategoryDto6, readString, readInt, userId, marketPriceDto, readString2, arrayList26, marketItemBannerDto2, createFromParcel4, num4, arrayList27, arrayList25, arrayList34, baseBoolIntDto3, baseBoolIntDto8, baseBoolIntDto9, baseBoolIntDto6, baseLikesDto, readString3, likesItemReactionsDto, baseRepostsInfoDto3, num9, arrayList28, arrayList29, marketItemAddressesDto4, arrayList35, arrayList30, num5, f2, num6, baseLinkDto3, readString4, num7, marketItemOwnerInfoDto3, bool2, bool3, bool4, bool5, bool6, bool7, marketItemPromotionInfoDto3, num8, arrayList33, arrayList31, readString5, arrayList32, groupsGroupFullDto3, arrayList36, createFromParcel6, readString6, readString7, marketMarketCategoryDto4, num10, readString8, readString9, marketMarketItemTypeDto, marketMarketItemIntegrationInfoDto, bool9, bool10, bool11, bool12, marketServicesDurationDto4, readString10, readString11, valueOf24, valueOf11, valueOf25, arrayList18, num3, marketDeliveryInfoDto, readString12, valueOf12, readString13, arrayList20, bool, num2, arrayList22, readString14, marketItemRejectInfoDto, valueOf28, userId2, readString15, valueOf14, marketMarketItemRatingDto, arrayList23, arrayList24, valueOf15, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketMarketItemFullDto[] newArray(int i) {
            return new MarketMarketItemFullDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketMarketItemFullDto(MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto, MarketMarketCategoryDto marketMarketCategoryDto, String str, int i, UserId userId, MarketPriceDto marketPriceDto, String str2, List<MarketMarketItemOtherItemsDto> list, MarketItemBannerDto marketItemBannerDto, MarketItemDimensionsDto marketItemDimensionsDto, Integer num, List<Integer> list2, List<PhotosPhotoDto> list3, List<MarketItemVideoDto> list4, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, BaseLikesDto baseLikesDto, String str3, LikesItemReactionsDto likesItemReactionsDto, BaseRepostsInfoDto baseRepostsInfoDto, Integer num2, List<MarketPropertyDto> list5, List<MarketItemPropertyVariantsDto> list6, MarketItemAddressesDto marketItemAddressesDto, List<MarketVariantsGridPropertyDto> list7, List<BaseLinkButtonDto> list8, Integer num3, Float f, Integer num4, BaseLinkDto baseLinkDto, String str4, Integer num5, MarketItemOwnerInfoDto marketItemOwnerInfoDto, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, MarketItemPromotionInfoDto marketItemPromotionInfoDto, Integer num6, List<MarketSimilarItemsDto> list9, List<MarketCustomButtonFullDto> list10, String str5, List<MarketItemLabelDto> list11, GroupsGroupFullDto groupsGroupFullDto, List<MarketItemCharacteristicDto> list12, MarketDeliveryMethodsInfoDto marketDeliveryMethodsInfoDto, String str6, String str7, MarketMarketCategoryDto marketMarketCategoryDto2, Integer num7, String str8, String str9, MarketMarketItemTypeDto marketMarketItemTypeDto, MarketMarketItemIntegrationInfoDto marketMarketItemIntegrationInfoDto, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, MarketServicesDurationDto marketServicesDurationDto, String str10, String str11, Integer num8, Boolean bool11, Integer num9, List<MarketItemPropertyValueDto> list13, Integer num10, MarketDeliveryInfoDto marketDeliveryInfoDto, String str12, Boolean bool12, String str13, List<BaseImageDto> list14, Boolean bool13, Integer num11, List<MarketBadgeDto> list15, String str14, MarketItemRejectInfoDto marketItemRejectInfoDto, Integer num12, UserId userId2, String str15, Boolean bool14, MarketMarketItemRatingDto marketMarketItemRatingDto, List<? extends List<BaseImageDto>> list16, List<MarketCustomButtonFullDto> list17, Boolean bool15, String str16, String str17, String str18, String str19, String str20) {
        this.availability = marketMarketItemAvailabilityDto;
        this.category = marketMarketCategoryDto;
        this.description = str;
        this.id = i;
        this.ownerId = userId;
        this.price = marketPriceDto;
        this.title = str2;
        this.otherItems = list;
        this.banner = marketItemBannerDto;
        this.dimensions = marketItemDimensionsDto;
        this.weight = num;
        this.albumsIds = list2;
        this.photos = list3;
        this.videos = list4;
        this.canComment = baseBoolIntDto;
        this.showComments = baseBoolIntDto2;
        this.showReviews = baseBoolIntDto3;
        this.canRepost = baseBoolIntDto4;
        this.likes = baseLikesDto;
        this.reactionSetId = str3;
        this.reactions = likesItemReactionsDto;
        this.reposts = baseRepostsInfoDto;
        this.viewsCount = num2;
        this.properties = list5;
        this.variants = list6;
        this.addresses = marketItemAddressesDto;
        this.variantsGrid = list7;
        this.actionButtons = list8;
        this.wishlistItemId = num3;
        this.rating = f;
        this.ordersCount = num4;
        this.cancelInfo = baseLinkDto;
        this.userAgreementInfo = str4;
        this.adId = num5;
        this.ownerInfo = marketItemOwnerInfoDto;
        this.canEdit = bool;
        this.canDelete = bool2;
        this.canDeleteImage = bool3;
        this.canDeleteWithReason = bool4;
        this.canRecover = bool5;
        this.canShowConvertToService = bool6;
        this.promotion = marketItemPromotionInfoDto;
        this.vkPayDiscount = num6;
        this.similarItems = list9;
        this.customButtons = list10;
        this.adsLabel = str5;
        this.labels = list11;
        this.group = groupsGroupFullDto;
        this.characteristics = list12;
        this.deliveryMethodsInfo = marketDeliveryMethodsInfoDto;
        this.accessKey = str6;
        this.buttonTitle = str7;
        this.categoryV2 = marketMarketCategoryDto2;
        this.date = num7;
        this.descriptionUrl = str8;
        this.externalId = str9;
        this.itemType = marketMarketItemTypeDto;
        this.integrationInfo = marketMarketItemIntegrationInfoDto;
        this.isFavorite = bool7;
        this.isPriceListService = bool8;
        this.isOwner = bool9;
        this.isAdult = bool10;
        this.serviceDuration = marketServicesDurationDto;
        this.thumbPhoto = str10;
        this.url = str11;
        this.variantsGroupingId = num8;
        this.isMainVariant = bool11;
        this.availableVariantItemId = num9;
        this.propertyValues = list13;
        this.cartQuantity = num10;
        this.deliveryInfo = marketDeliveryInfoDto;
        this.sku = str12;
        this.isAliexpressProduct = bool12;
        this.csrfHashes = str13;
        this.thumb = list14;
        this.isAliexpressCheckout = bool13;
        this.stockAmount = num11;
        this.badges = list15;
        this.trackCode = str14;
        this.rejectInfo = marketItemRejectInfoDto;
        this.postId = num12;
        this.postOwnerId = userId2;
        this.openMarketLink = str15;
        this.isHardblocked = bool14;
        this.itemRating = marketMarketItemRatingDto;
        this.thumbs = list16;
        this.buttons = list17;
        this.hasGroupAccess = bool15;
        this.seoSlug = str16;
        this.seoTitle = str17;
        this.seoDescription = str18;
        this.externalUrl = str19;
        this.marketUrl = str20;
    }

    public final String B() {
        return this.descriptionUrl;
    }

    public final String C() {
        return this.externalId;
    }

    public final MarketMarketItemIntegrationInfoDto D() {
        return this.integrationInfo;
    }

    public final BaseBoolIntDto D0() {
        return this.showReviews;
    }

    public final MarketMarketItemRatingDto F() {
        return this.itemRating;
    }

    public final String F0() {
        return this.sku;
    }

    public final MarketMarketItemTypeDto G() {
        return this.itemType;
    }

    public final Integer H0() {
        return this.stockAmount;
    }

    public final List<MarketItemLabelDto> K() {
        return this.labels;
    }

    public final List<BaseImageDto> K0() {
        return this.thumb;
    }

    public final String M() {
        return this.marketUrl;
    }

    public final List<List<BaseImageDto>> N0() {
        return this.thumbs;
    }

    public final List<MarketItemPropertyVariantsDto> P0() {
        return this.variants;
    }

    public final String R() {
        return this.openMarketLink;
    }

    public final List<MarketVariantsGridPropertyDto> S0() {
        return this.variantsGrid;
    }

    public final List<MarketMarketItemOtherItemsDto> T() {
        return this.otherItems;
    }

    public final Integer U0() {
        return this.variantsGroupingId;
    }

    public final Integer V0() {
        return this.viewsCount;
    }

    public final MarketItemOwnerInfoDto W() {
        return this.ownerInfo;
    }

    public final List<PhotosPhotoDto> Z() {
        return this.photos;
    }

    public final MarketPriceDto a0() {
        return this.price;
    }

    public final Boolean b1() {
        return this.isAdult;
    }

    public final List<BaseLinkButtonDto> d() {
        return this.actionButtons;
    }

    public final Boolean d1() {
        return this.isFavorite;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MarketItemAddressesDto e() {
        return this.addresses;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketMarketItemFullDto)) {
            return false;
        }
        MarketMarketItemFullDto marketMarketItemFullDto = (MarketMarketItemFullDto) obj;
        return this.availability == marketMarketItemFullDto.availability && epx.f(this.category, marketMarketItemFullDto.category) && epx.f(this.description, marketMarketItemFullDto.description) && this.id == marketMarketItemFullDto.id && epx.f(this.ownerId, marketMarketItemFullDto.ownerId) && epx.f(this.price, marketMarketItemFullDto.price) && epx.f(this.title, marketMarketItemFullDto.title) && epx.f(this.otherItems, marketMarketItemFullDto.otherItems) && epx.f(this.banner, marketMarketItemFullDto.banner) && epx.f(this.dimensions, marketMarketItemFullDto.dimensions) && epx.f(this.weight, marketMarketItemFullDto.weight) && epx.f(this.albumsIds, marketMarketItemFullDto.albumsIds) && epx.f(this.photos, marketMarketItemFullDto.photos) && epx.f(this.videos, marketMarketItemFullDto.videos) && this.canComment == marketMarketItemFullDto.canComment && this.showComments == marketMarketItemFullDto.showComments && this.showReviews == marketMarketItemFullDto.showReviews && this.canRepost == marketMarketItemFullDto.canRepost && epx.f(this.likes, marketMarketItemFullDto.likes) && epx.f(this.reactionSetId, marketMarketItemFullDto.reactionSetId) && epx.f(this.reactions, marketMarketItemFullDto.reactions) && epx.f(this.reposts, marketMarketItemFullDto.reposts) && epx.f(this.viewsCount, marketMarketItemFullDto.viewsCount) && epx.f(this.properties, marketMarketItemFullDto.properties) && epx.f(this.variants, marketMarketItemFullDto.variants) && epx.f(this.addresses, marketMarketItemFullDto.addresses) && epx.f(this.variantsGrid, marketMarketItemFullDto.variantsGrid) && epx.f(this.actionButtons, marketMarketItemFullDto.actionButtons) && epx.f(this.wishlistItemId, marketMarketItemFullDto.wishlistItemId) && epx.f(this.rating, marketMarketItemFullDto.rating) && epx.f(this.ordersCount, marketMarketItemFullDto.ordersCount) && epx.f(this.cancelInfo, marketMarketItemFullDto.cancelInfo) && epx.f(this.userAgreementInfo, marketMarketItemFullDto.userAgreementInfo) && epx.f(this.adId, marketMarketItemFullDto.adId) && epx.f(this.ownerInfo, marketMarketItemFullDto.ownerInfo) && epx.f(this.canEdit, marketMarketItemFullDto.canEdit) && epx.f(this.canDelete, marketMarketItemFullDto.canDelete) && epx.f(this.canDeleteImage, marketMarketItemFullDto.canDeleteImage) && epx.f(this.canDeleteWithReason, marketMarketItemFullDto.canDeleteWithReason) && epx.f(this.canRecover, marketMarketItemFullDto.canRecover) && epx.f(this.canShowConvertToService, marketMarketItemFullDto.canShowConvertToService) && epx.f(this.promotion, marketMarketItemFullDto.promotion) && epx.f(this.vkPayDiscount, marketMarketItemFullDto.vkPayDiscount) && epx.f(this.similarItems, marketMarketItemFullDto.similarItems) && epx.f(this.customButtons, marketMarketItemFullDto.customButtons) && epx.f(this.adsLabel, marketMarketItemFullDto.adsLabel) && epx.f(this.labels, marketMarketItemFullDto.labels) && epx.f(this.group, marketMarketItemFullDto.group) && epx.f(this.characteristics, marketMarketItemFullDto.characteristics) && epx.f(this.deliveryMethodsInfo, marketMarketItemFullDto.deliveryMethodsInfo) && epx.f(this.accessKey, marketMarketItemFullDto.accessKey) && epx.f(this.buttonTitle, marketMarketItemFullDto.buttonTitle) && epx.f(this.categoryV2, marketMarketItemFullDto.categoryV2) && epx.f(this.date, marketMarketItemFullDto.date) && epx.f(this.descriptionUrl, marketMarketItemFullDto.descriptionUrl) && epx.f(this.externalId, marketMarketItemFullDto.externalId) && this.itemType == marketMarketItemFullDto.itemType && epx.f(this.integrationInfo, marketMarketItemFullDto.integrationInfo) && epx.f(this.isFavorite, marketMarketItemFullDto.isFavorite) && epx.f(this.isPriceListService, marketMarketItemFullDto.isPriceListService) && epx.f(this.isOwner, marketMarketItemFullDto.isOwner) && epx.f(this.isAdult, marketMarketItemFullDto.isAdult) && epx.f(this.serviceDuration, marketMarketItemFullDto.serviceDuration) && epx.f(this.thumbPhoto, marketMarketItemFullDto.thumbPhoto) && epx.f(this.url, marketMarketItemFullDto.url) && epx.f(this.variantsGroupingId, marketMarketItemFullDto.variantsGroupingId) && epx.f(this.isMainVariant, marketMarketItemFullDto.isMainVariant) && epx.f(this.availableVariantItemId, marketMarketItemFullDto.availableVariantItemId) && epx.f(this.propertyValues, marketMarketItemFullDto.propertyValues) && epx.f(this.cartQuantity, marketMarketItemFullDto.cartQuantity) && epx.f(this.deliveryInfo, marketMarketItemFullDto.deliveryInfo) && epx.f(this.sku, marketMarketItemFullDto.sku) && epx.f(this.isAliexpressProduct, marketMarketItemFullDto.isAliexpressProduct) && epx.f(this.csrfHashes, marketMarketItemFullDto.csrfHashes) && epx.f(this.thumb, marketMarketItemFullDto.thumb) && epx.f(this.isAliexpressCheckout, marketMarketItemFullDto.isAliexpressCheckout) && epx.f(this.stockAmount, marketMarketItemFullDto.stockAmount) && epx.f(this.badges, marketMarketItemFullDto.badges) && epx.f(this.trackCode, marketMarketItemFullDto.trackCode) && epx.f(this.rejectInfo, marketMarketItemFullDto.rejectInfo) && epx.f(this.postId, marketMarketItemFullDto.postId) && epx.f(this.postOwnerId, marketMarketItemFullDto.postOwnerId) && epx.f(this.openMarketLink, marketMarketItemFullDto.openMarketLink) && epx.f(this.isHardblocked, marketMarketItemFullDto.isHardblocked) && epx.f(this.itemRating, marketMarketItemFullDto.itemRating) && epx.f(this.thumbs, marketMarketItemFullDto.thumbs) && epx.f(this.buttons, marketMarketItemFullDto.buttons) && epx.f(this.hasGroupAccess, marketMarketItemFullDto.hasGroupAccess) && epx.f(this.seoSlug, marketMarketItemFullDto.seoSlug) && epx.f(this.seoTitle, marketMarketItemFullDto.seoTitle) && epx.f(this.seoDescription, marketMarketItemFullDto.seoDescription) && epx.f(this.externalUrl, marketMarketItemFullDto.externalUrl) && epx.f(this.marketUrl, marketMarketItemFullDto.marketUrl);
    }

    public final MarketMarketItemAvailabilityDto f() {
        return this.availability;
    }

    public final List<MarketBadgeDto> g() {
        return this.badges;
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

    public final int hashCode() {
        int a2 = urd0.a((this.price.hashCode() + bh10.a(shy.a(this.id, urd0.a((this.category.hashCode() + (this.availability.hashCode() * 31)) * 31, 31, this.description), 31), 31, this.ownerId.b)) * 31, 31, this.title);
        List<MarketMarketItemOtherItemsDto> list = this.otherItems;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        MarketItemBannerDto marketItemBannerDto = this.banner;
        int hashCode2 = (hashCode + (marketItemBannerDto == null ? 0 : marketItemBannerDto.hashCode())) * 31;
        MarketItemDimensionsDto marketItemDimensionsDto = this.dimensions;
        int hashCode3 = (hashCode2 + (marketItemDimensionsDto == null ? 0 : marketItemDimensionsDto.hashCode())) * 31;
        Integer num = this.weight;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List<Integer> list2 = this.albumsIds;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<PhotosPhotoDto> list3 = this.photos;
        int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<MarketItemVideoDto> list4 = this.videos;
        int hashCode7 = (hashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.canComment;
        int hashCode8 = (hashCode7 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.showComments;
        int hashCode9 = (hashCode8 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.showReviews;
        int hashCode10 = (hashCode9 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.canRepost;
        int hashCode11 = (hashCode10 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        BaseLikesDto baseLikesDto = this.likes;
        int hashCode12 = (hashCode11 + (baseLikesDto == null ? 0 : baseLikesDto.hashCode())) * 31;
        String str = this.reactionSetId;
        int hashCode13 = (hashCode12 + (str == null ? 0 : str.hashCode())) * 31;
        LikesItemReactionsDto likesItemReactionsDto = this.reactions;
        int hashCode14 = (hashCode13 + (likesItemReactionsDto == null ? 0 : likesItemReactionsDto.hashCode())) * 31;
        BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
        int hashCode15 = (hashCode14 + (baseRepostsInfoDto == null ? 0 : baseRepostsInfoDto.hashCode())) * 31;
        Integer num2 = this.viewsCount;
        int hashCode16 = (hashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<MarketPropertyDto> list5 = this.properties;
        int hashCode17 = (hashCode16 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<MarketItemPropertyVariantsDto> list6 = this.variants;
        int hashCode18 = (hashCode17 + (list6 == null ? 0 : list6.hashCode())) * 31;
        MarketItemAddressesDto marketItemAddressesDto = this.addresses;
        int hashCode19 = (hashCode18 + (marketItemAddressesDto == null ? 0 : marketItemAddressesDto.hashCode())) * 31;
        List<MarketVariantsGridPropertyDto> list7 = this.variantsGrid;
        int hashCode20 = (hashCode19 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<BaseLinkButtonDto> list8 = this.actionButtons;
        int hashCode21 = (hashCode20 + (list8 == null ? 0 : list8.hashCode())) * 31;
        Integer num3 = this.wishlistItemId;
        int hashCode22 = (hashCode21 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f = this.rating;
        int hashCode23 = (hashCode22 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num4 = this.ordersCount;
        int hashCode24 = (hashCode23 + (num4 == null ? 0 : num4.hashCode())) * 31;
        BaseLinkDto baseLinkDto = this.cancelInfo;
        int hashCode25 = (hashCode24 + (baseLinkDto == null ? 0 : baseLinkDto.hashCode())) * 31;
        String str2 = this.userAgreementInfo;
        int hashCode26 = (hashCode25 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num5 = this.adId;
        int hashCode27 = (hashCode26 + (num5 == null ? 0 : num5.hashCode())) * 31;
        MarketItemOwnerInfoDto marketItemOwnerInfoDto = this.ownerInfo;
        int hashCode28 = (hashCode27 + (marketItemOwnerInfoDto == null ? 0 : marketItemOwnerInfoDto.hashCode())) * 31;
        Boolean bool = this.canEdit;
        int hashCode29 = (hashCode28 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canDelete;
        int hashCode30 = (hashCode29 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.canDeleteImage;
        int hashCode31 = (hashCode30 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.canDeleteWithReason;
        int hashCode32 = (hashCode31 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.canRecover;
        int hashCode33 = (hashCode32 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.canShowConvertToService;
        int hashCode34 = (hashCode33 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        MarketItemPromotionInfoDto marketItemPromotionInfoDto = this.promotion;
        int hashCode35 = (hashCode34 + (marketItemPromotionInfoDto == null ? 0 : marketItemPromotionInfoDto.hashCode())) * 31;
        Integer num6 = this.vkPayDiscount;
        int hashCode36 = (hashCode35 + (num6 == null ? 0 : num6.hashCode())) * 31;
        List<MarketSimilarItemsDto> list9 = this.similarItems;
        int hashCode37 = (hashCode36 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<MarketCustomButtonFullDto> list10 = this.customButtons;
        int hashCode38 = (hashCode37 + (list10 == null ? 0 : list10.hashCode())) * 31;
        String str3 = this.adsLabel;
        int hashCode39 = (hashCode38 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<MarketItemLabelDto> list11 = this.labels;
        int hashCode40 = (hashCode39 + (list11 == null ? 0 : list11.hashCode())) * 31;
        GroupsGroupFullDto groupsGroupFullDto = this.group;
        int hashCode41 = (hashCode40 + (groupsGroupFullDto == null ? 0 : groupsGroupFullDto.hashCode())) * 31;
        List<MarketItemCharacteristicDto> list12 = this.characteristics;
        int hashCode42 = (hashCode41 + (list12 == null ? 0 : list12.hashCode())) * 31;
        MarketDeliveryMethodsInfoDto marketDeliveryMethodsInfoDto = this.deliveryMethodsInfo;
        int hashCode43 = (hashCode42 + (marketDeliveryMethodsInfoDto == null ? 0 : marketDeliveryMethodsInfoDto.hashCode())) * 31;
        String str4 = this.accessKey;
        int hashCode44 = (hashCode43 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.buttonTitle;
        int hashCode45 = (hashCode44 + (str5 == null ? 0 : str5.hashCode())) * 31;
        MarketMarketCategoryDto marketMarketCategoryDto = this.categoryV2;
        int hashCode46 = (hashCode45 + (marketMarketCategoryDto == null ? 0 : marketMarketCategoryDto.hashCode())) * 31;
        Integer num7 = this.date;
        int hashCode47 = (hashCode46 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str6 = this.descriptionUrl;
        int hashCode48 = (hashCode47 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.externalId;
        int hashCode49 = (hashCode48 + (str7 == null ? 0 : str7.hashCode())) * 31;
        MarketMarketItemTypeDto marketMarketItemTypeDto = this.itemType;
        int hashCode50 = (hashCode49 + (marketMarketItemTypeDto == null ? 0 : marketMarketItemTypeDto.hashCode())) * 31;
        MarketMarketItemIntegrationInfoDto marketMarketItemIntegrationInfoDto = this.integrationInfo;
        int hashCode51 = (hashCode50 + (marketMarketItemIntegrationInfoDto == null ? 0 : marketMarketItemIntegrationInfoDto.hashCode())) * 31;
        Boolean bool7 = this.isFavorite;
        int hashCode52 = (hashCode51 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.isPriceListService;
        int hashCode53 = (hashCode52 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.isOwner;
        int hashCode54 = (hashCode53 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.isAdult;
        int hashCode55 = (hashCode54 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        MarketServicesDurationDto marketServicesDurationDto = this.serviceDuration;
        int hashCode56 = (hashCode55 + (marketServicesDurationDto == null ? 0 : marketServicesDurationDto.hashCode())) * 31;
        String str8 = this.thumbPhoto;
        int hashCode57 = (hashCode56 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.url;
        int hashCode58 = (hashCode57 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num8 = this.variantsGroupingId;
        int hashCode59 = (hashCode58 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Boolean bool11 = this.isMainVariant;
        int hashCode60 = (hashCode59 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Integer num9 = this.availableVariantItemId;
        int hashCode61 = (hashCode60 + (num9 == null ? 0 : num9.hashCode())) * 31;
        List<MarketItemPropertyValueDto> list13 = this.propertyValues;
        int hashCode62 = (hashCode61 + (list13 == null ? 0 : list13.hashCode())) * 31;
        Integer num10 = this.cartQuantity;
        int hashCode63 = (hashCode62 + (num10 == null ? 0 : num10.hashCode())) * 31;
        MarketDeliveryInfoDto marketDeliveryInfoDto = this.deliveryInfo;
        int hashCode64 = (hashCode63 + (marketDeliveryInfoDto == null ? 0 : marketDeliveryInfoDto.hashCode())) * 31;
        String str10 = this.sku;
        int hashCode65 = (hashCode64 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool12 = this.isAliexpressProduct;
        int hashCode66 = (hashCode65 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        String str11 = this.csrfHashes;
        int hashCode67 = (hashCode66 + (str11 == null ? 0 : str11.hashCode())) * 31;
        List<BaseImageDto> list14 = this.thumb;
        int hashCode68 = (hashCode67 + (list14 == null ? 0 : list14.hashCode())) * 31;
        Boolean bool13 = this.isAliexpressCheckout;
        int hashCode69 = (hashCode68 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Integer num11 = this.stockAmount;
        int hashCode70 = (hashCode69 + (num11 == null ? 0 : num11.hashCode())) * 31;
        List<MarketBadgeDto> list15 = this.badges;
        int hashCode71 = (hashCode70 + (list15 == null ? 0 : list15.hashCode())) * 31;
        String str12 = this.trackCode;
        int hashCode72 = (hashCode71 + (str12 == null ? 0 : str12.hashCode())) * 31;
        MarketItemRejectInfoDto marketItemRejectInfoDto = this.rejectInfo;
        int hashCode73 = (hashCode72 + (marketItemRejectInfoDto == null ? 0 : marketItemRejectInfoDto.hashCode())) * 31;
        Integer num12 = this.postId;
        int hashCode74 = (hashCode73 + (num12 == null ? 0 : num12.hashCode())) * 31;
        UserId userId = this.postOwnerId;
        int hashCode75 = (hashCode74 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str13 = this.openMarketLink;
        int hashCode76 = (hashCode75 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool14 = this.isHardblocked;
        int hashCode77 = (hashCode76 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        MarketMarketItemRatingDto marketMarketItemRatingDto = this.itemRating;
        int hashCode78 = (hashCode77 + (marketMarketItemRatingDto == null ? 0 : marketMarketItemRatingDto.hashCode())) * 31;
        List<List<BaseImageDto>> list16 = this.thumbs;
        int hashCode79 = (hashCode78 + (list16 == null ? 0 : list16.hashCode())) * 31;
        List<MarketCustomButtonFullDto> list17 = this.buttons;
        int hashCode80 = (hashCode79 + (list17 == null ? 0 : list17.hashCode())) * 31;
        Boolean bool15 = this.hasGroupAccess;
        int hashCode81 = (hashCode80 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        String str14 = this.seoSlug;
        int hashCode82 = (hashCode81 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.seoTitle;
        int hashCode83 = (hashCode82 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.seoDescription;
        int hashCode84 = (hashCode83 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.externalUrl;
        int hashCode85 = (hashCode84 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.marketUrl;
        return hashCode85 + (str18 != null ? str18.hashCode() : 0);
    }

    public final MarketItemBannerDto i() {
        return this.banner;
    }

    public final List<MarketCustomButtonFullDto> j() {
        return this.buttons;
    }

    public final BaseBoolIntDto k() {
        return this.canComment;
    }

    public final Integer l() {
        return this.cartQuantity;
    }

    public final List<MarketItemPropertyValueDto> l0() {
        return this.propertyValues;
    }

    public final MarketMarketCategoryDto n() {
        return this.category;
    }

    public final Boolean n1() {
        return this.isHardblocked;
    }

    public final List<MarketItemCharacteristicDto> o() {
        return this.characteristics;
    }

    public final Boolean o1() {
        return this.isOwner;
    }

    public final Integer p() {
        return this.date;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String r() {
        return this.trackCode;
    }

    public final Boolean s1() {
        return this.isPriceListService;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketMarketItemFullDto(availability=");
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
        sb.append(", otherItems=");
        sb.append(this.otherItems);
        sb.append(", banner=");
        sb.append(this.banner);
        sb.append(", dimensions=");
        sb.append(this.dimensions);
        sb.append(", weight=");
        sb.append(this.weight);
        sb.append(", albumsIds=");
        sb.append(this.albumsIds);
        sb.append(", photos=");
        sb.append(this.photos);
        sb.append(", videos=");
        sb.append(this.videos);
        sb.append(", canComment=");
        sb.append(this.canComment);
        sb.append(", showComments=");
        sb.append(this.showComments);
        sb.append(", showReviews=");
        sb.append(this.showReviews);
        sb.append(", canRepost=");
        sb.append(this.canRepost);
        sb.append(", likes=");
        sb.append(this.likes);
        sb.append(", reactionSetId=");
        sb.append(this.reactionSetId);
        sb.append(", reactions=");
        sb.append(this.reactions);
        sb.append(", reposts=");
        sb.append(this.reposts);
        sb.append(", viewsCount=");
        sb.append(this.viewsCount);
        sb.append(", properties=");
        sb.append(this.properties);
        sb.append(", variants=");
        sb.append(this.variants);
        sb.append(", addresses=");
        sb.append(this.addresses);
        sb.append(", variantsGrid=");
        sb.append(this.variantsGrid);
        sb.append(", actionButtons=");
        sb.append(this.actionButtons);
        sb.append(", wishlistItemId=");
        sb.append(this.wishlistItemId);
        sb.append(", rating=");
        sb.append(this.rating);
        sb.append(", ordersCount=");
        sb.append(this.ordersCount);
        sb.append(", cancelInfo=");
        sb.append(this.cancelInfo);
        sb.append(", userAgreementInfo=");
        sb.append(this.userAgreementInfo);
        sb.append(", adId=");
        sb.append(this.adId);
        sb.append(", ownerInfo=");
        sb.append(this.ownerInfo);
        sb.append(", canEdit=");
        sb.append(this.canEdit);
        sb.append(", canDelete=");
        sb.append(this.canDelete);
        sb.append(", canDeleteImage=");
        sb.append(this.canDeleteImage);
        sb.append(", canDeleteWithReason=");
        sb.append(this.canDeleteWithReason);
        sb.append(", canRecover=");
        sb.append(this.canRecover);
        sb.append(", canShowConvertToService=");
        sb.append(this.canShowConvertToService);
        sb.append(", promotion=");
        sb.append(this.promotion);
        sb.append(", vkPayDiscount=");
        sb.append(this.vkPayDiscount);
        sb.append(", similarItems=");
        sb.append(this.similarItems);
        sb.append(", customButtons=");
        sb.append(this.customButtons);
        sb.append(", adsLabel=");
        sb.append(this.adsLabel);
        sb.append(", labels=");
        sb.append(this.labels);
        sb.append(", group=");
        sb.append(this.group);
        sb.append(", characteristics=");
        sb.append(this.characteristics);
        sb.append(", deliveryMethodsInfo=");
        sb.append(this.deliveryMethodsInfo);
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

    public final MarketDeliveryInfoDto u() {
        return this.deliveryInfo;
    }

    public final MarketItemRejectInfoDto v0() {
        return this.rejectInfo;
    }

    public final MarketServicesDurationDto w0() {
        return this.serviceDuration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.availability, i);
        parcel.writeParcelable(this.category, i);
        parcel.writeString(this.description);
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeParcelable(this.price, i);
        parcel.writeString(this.title);
        List<MarketMarketItemOtherItemsDto> list = this.otherItems;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MarketMarketItemOtherItemsDto) f.next()).writeToParcel(parcel, i);
            }
        }
        MarketItemBannerDto marketItemBannerDto = this.banner;
        if (marketItemBannerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketItemBannerDto.writeToParcel(parcel, i);
        }
        MarketItemDimensionsDto marketItemDimensionsDto = this.dimensions;
        if (marketItemDimensionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketItemDimensionsDto.writeToParcel(parcel, i);
        }
        Integer num = this.weight;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<Integer> list2 = this.albumsIds;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeInt(((Number) f2.next()).intValue());
            }
        }
        List<PhotosPhotoDto> list3 = this.photos;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        List<MarketItemVideoDto> list4 = this.videos;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                ((MarketItemVideoDto) f4.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeParcelable(this.canComment, i);
        parcel.writeParcelable(this.showComments, i);
        parcel.writeParcelable(this.showReviews, i);
        parcel.writeParcelable(this.canRepost, i);
        parcel.writeParcelable(this.likes, i);
        parcel.writeString(this.reactionSetId);
        parcel.writeParcelable(this.reactions, i);
        parcel.writeParcelable(this.reposts, i);
        Integer num2 = this.viewsCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        List<MarketPropertyDto> list5 = this.properties;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                ((MarketPropertyDto) f5.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketItemPropertyVariantsDto> list6 = this.variants;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f6 = dn.f(parcel, list6, 1);
            while (f6.hasNext()) {
                ((MarketItemPropertyVariantsDto) f6.next()).writeToParcel(parcel, i);
            }
        }
        MarketItemAddressesDto marketItemAddressesDto = this.addresses;
        if (marketItemAddressesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketItemAddressesDto.writeToParcel(parcel, i);
        }
        List<MarketVariantsGridPropertyDto> list7 = this.variantsGrid;
        if (list7 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f7 = dn.f(parcel, list7, 1);
            while (f7.hasNext()) {
                ((MarketVariantsGridPropertyDto) f7.next()).writeToParcel(parcel, i);
            }
        }
        List<BaseLinkButtonDto> list8 = this.actionButtons;
        if (list8 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f8 = dn.f(parcel, list8, 1);
            while (f8.hasNext()) {
                parcel.writeParcelable((Parcelable) f8.next(), i);
            }
        }
        Integer num3 = this.wishlistItemId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Float f9 = this.rating;
        if (f9 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f9);
        }
        Integer num4 = this.ordersCount;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        parcel.writeParcelable(this.cancelInfo, i);
        parcel.writeString(this.userAgreementInfo);
        Integer num5 = this.adId;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        MarketItemOwnerInfoDto marketItemOwnerInfoDto = this.ownerInfo;
        if (marketItemOwnerInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketItemOwnerInfoDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.canEdit;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.canDelete;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.canDeleteImage;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.canDeleteWithReason;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.canRecover;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        Boolean bool6 = this.canShowConvertToService;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        MarketItemPromotionInfoDto marketItemPromotionInfoDto = this.promotion;
        if (marketItemPromotionInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketItemPromotionInfoDto.writeToParcel(parcel, i);
        }
        Integer num6 = this.vkPayDiscount;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        List<MarketSimilarItemsDto> list9 = this.similarItems;
        if (list9 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f10 = dn.f(parcel, list9, 1);
            while (f10.hasNext()) {
                ((MarketSimilarItemsDto) f10.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketCustomButtonFullDto> list10 = this.customButtons;
        if (list10 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f11 = dn.f(parcel, list10, 1);
            while (f11.hasNext()) {
                parcel.writeParcelable((Parcelable) f11.next(), i);
            }
        }
        parcel.writeString(this.adsLabel);
        List<MarketItemLabelDto> list11 = this.labels;
        if (list11 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f12 = dn.f(parcel, list11, 1);
            while (f12.hasNext()) {
                ((MarketItemLabelDto) f12.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeParcelable(this.group, i);
        List<MarketItemCharacteristicDto> list12 = this.characteristics;
        if (list12 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f13 = dn.f(parcel, list12, 1);
            while (f13.hasNext()) {
                ((MarketItemCharacteristicDto) f13.next()).writeToParcel(parcel, i);
            }
        }
        MarketDeliveryMethodsInfoDto marketDeliveryMethodsInfoDto = this.deliveryMethodsInfo;
        if (marketDeliveryMethodsInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketDeliveryMethodsInfoDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.accessKey);
        parcel.writeString(this.buttonTitle);
        parcel.writeParcelable(this.categoryV2, i);
        Integer num7 = this.date;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num7);
        }
        parcel.writeString(this.descriptionUrl);
        parcel.writeString(this.externalId);
        parcel.writeParcelable(this.itemType, i);
        parcel.writeParcelable(this.integrationInfo, i);
        Boolean bool7 = this.isFavorite;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        Boolean bool8 = this.isPriceListService;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool8);
        }
        Boolean bool9 = this.isOwner;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool9);
        }
        Boolean bool10 = this.isAdult;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool10);
        }
        parcel.writeParcelable(this.serviceDuration, i);
        parcel.writeString(this.thumbPhoto);
        parcel.writeString(this.url);
        Integer num8 = this.variantsGroupingId;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num8);
        }
        Boolean bool11 = this.isMainVariant;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool11);
        }
        Integer num9 = this.availableVariantItemId;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num9);
        }
        List<MarketItemPropertyValueDto> list13 = this.propertyValues;
        if (list13 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f14 = dn.f(parcel, list13, 1);
            while (f14.hasNext()) {
                parcel.writeParcelable((Parcelable) f14.next(), i);
            }
        }
        Integer num10 = this.cartQuantity;
        if (num10 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num10);
        }
        parcel.writeParcelable(this.deliveryInfo, i);
        parcel.writeString(this.sku);
        Boolean bool12 = this.isAliexpressProduct;
        if (bool12 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool12);
        }
        parcel.writeString(this.csrfHashes);
        List<BaseImageDto> list14 = this.thumb;
        if (list14 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f15 = dn.f(parcel, list14, 1);
            while (f15.hasNext()) {
                parcel.writeParcelable((Parcelable) f15.next(), i);
            }
        }
        Boolean bool13 = this.isAliexpressCheckout;
        if (bool13 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool13);
        }
        Integer num11 = this.stockAmount;
        if (num11 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num11);
        }
        List<MarketBadgeDto> list15 = this.badges;
        if (list15 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f16 = dn.f(parcel, list15, 1);
            while (f16.hasNext()) {
                parcel.writeParcelable((Parcelable) f16.next(), i);
            }
        }
        parcel.writeString(this.trackCode);
        parcel.writeParcelable(this.rejectInfo, i);
        Integer num12 = this.postId;
        if (num12 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num12);
        }
        parcel.writeParcelable(this.postOwnerId, i);
        parcel.writeString(this.openMarketLink);
        Boolean bool14 = this.isHardblocked;
        if (bool14 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool14);
        }
        parcel.writeParcelable(this.itemRating, i);
        List<List<BaseImageDto>> list16 = this.thumbs;
        if (list16 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f17 = dn.f(parcel, list16, 1);
            while (f17.hasNext()) {
                Iterator a2 = ao.a(parcel, (List) f17.next());
                while (a2.hasNext()) {
                    parcel.writeParcelable((Parcelable) a2.next(), i);
                }
            }
        }
        List<MarketCustomButtonFullDto> list17 = this.buttons;
        if (list17 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f18 = dn.f(parcel, list17, 1);
            while (f18.hasNext()) {
                parcel.writeParcelable((Parcelable) f18.next(), i);
            }
        }
        Boolean bool15 = this.hasGroupAccess;
        if (bool15 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool15);
        }
        parcel.writeString(this.seoSlug);
        parcel.writeString(this.seoTitle);
        parcel.writeString(this.seoDescription);
        parcel.writeString(this.externalUrl);
        parcel.writeString(this.marketUrl);
    }

    public final BaseBoolIntDto y0() {
        return this.showComments;
    }

    public /* synthetic */ MarketMarketItemFullDto(MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto, MarketMarketCategoryDto marketMarketCategoryDto, String str, int i, UserId userId, MarketPriceDto marketPriceDto, String str2, List list, MarketItemBannerDto marketItemBannerDto, MarketItemDimensionsDto marketItemDimensionsDto, Integer num, List list2, List list3, List list4, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, BaseLikesDto baseLikesDto, String str3, LikesItemReactionsDto likesItemReactionsDto, BaseRepostsInfoDto baseRepostsInfoDto, Integer num2, List list5, List list6, MarketItemAddressesDto marketItemAddressesDto, List list7, List list8, Integer num3, Float f, Integer num4, BaseLinkDto baseLinkDto, String str4, Integer num5, MarketItemOwnerInfoDto marketItemOwnerInfoDto, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, MarketItemPromotionInfoDto marketItemPromotionInfoDto, Integer num6, List list9, List list10, String str5, List list11, GroupsGroupFullDto groupsGroupFullDto, List list12, MarketDeliveryMethodsInfoDto marketDeliveryMethodsInfoDto, String str6, String str7, MarketMarketCategoryDto marketMarketCategoryDto2, Integer num7, String str8, String str9, MarketMarketItemTypeDto marketMarketItemTypeDto, MarketMarketItemIntegrationInfoDto marketMarketItemIntegrationInfoDto, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, MarketServicesDurationDto marketServicesDurationDto, String str10, String str11, Integer num8, Boolean bool11, Integer num9, List list13, Integer num10, MarketDeliveryInfoDto marketDeliveryInfoDto, String str12, Boolean bool12, String str13, List list14, Boolean bool13, Integer num11, List list15, String str14, MarketItemRejectInfoDto marketItemRejectInfoDto, Integer num12, UserId userId2, String str15, Boolean bool14, MarketMarketItemRatingDto marketMarketItemRatingDto, List list16, List list17, Boolean bool15, String str16, String str17, String str18, String str19, String str20, int i2, int i3, int i4, zcl zclVar) {
        this(marketMarketItemAvailabilityDto, marketMarketCategoryDto, str, i, userId, marketPriceDto, str2, (i2 & 128) != 0 ? null : list, (i2 & 256) != 0 ? null : marketItemBannerDto, (i2 & 512) != 0 ? null : marketItemDimensionsDto, (i2 & 1024) != 0 ? null : num, (i2 & 2048) != 0 ? null : list2, (i2 & 4096) != 0 ? null : list3, (i2 & 8192) != 0 ? null : list4, (i2 & 16384) != 0 ? null : baseBoolIntDto, (i2 & 32768) != 0 ? null : baseBoolIntDto2, (i2 & 65536) != 0 ? null : baseBoolIntDto3, (i2 & 131072) != 0 ? null : baseBoolIntDto4, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : baseLikesDto, (i2 & 524288) != 0 ? null : str3, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : likesItemReactionsDto, (i2 & 2097152) != 0 ? null : baseRepostsInfoDto, (i2 & 4194304) != 0 ? null : num2, (i2 & 8388608) != 0 ? null : list5, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : list6, (i2 & 33554432) != 0 ? null : marketItemAddressesDto, (i2 & 67108864) != 0 ? null : list7, (i2 & 134217728) != 0 ? null : list8, (i2 & 268435456) != 0 ? null : num3, (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : f, (i2 & 1073741824) != 0 ? null : num4, (i2 & Integer.MIN_VALUE) != 0 ? null : baseLinkDto, (i3 & 1) != 0 ? null : str4, (i3 & 2) != 0 ? null : num5, (i3 & 4) != 0 ? null : marketItemOwnerInfoDto, (i3 & 8) != 0 ? null : bool, (i3 & 16) != 0 ? null : bool2, (i3 & 32) != 0 ? null : bool3, (i3 & 64) != 0 ? null : bool4, (i3 & 128) != 0 ? null : bool5, (i3 & 256) != 0 ? null : bool6, (i3 & 512) != 0 ? null : marketItemPromotionInfoDto, (i3 & 1024) != 0 ? null : num6, (i3 & 2048) != 0 ? null : list9, (i3 & 4096) != 0 ? null : list10, (i3 & 8192) != 0 ? null : str5, (i3 & 16384) != 0 ? null : list11, (i3 & 32768) != 0 ? null : groupsGroupFullDto, (i3 & 65536) != 0 ? null : list12, (i3 & 131072) != 0 ? null : marketDeliveryMethodsInfoDto, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str6, (i3 & 524288) != 0 ? null : str7, (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : marketMarketCategoryDto2, (i3 & 2097152) != 0 ? null : num7, (i3 & 4194304) != 0 ? null : str8, (i3 & 8388608) != 0 ? null : str9, (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : marketMarketItemTypeDto, (i3 & 33554432) != 0 ? null : marketMarketItemIntegrationInfoDto, (i3 & 67108864) != 0 ? null : bool7, (i3 & 134217728) != 0 ? null : bool8, (268435456 & i3) != 0 ? null : bool9, (536870912 & i3) != 0 ? null : bool10, (1073741824 & i3) != 0 ? null : marketServicesDurationDto, (i3 & Integer.MIN_VALUE) != 0 ? null : str10, (i4 & 1) != 0 ? null : str11, (i4 & 2) != 0 ? null : num8, (i4 & 4) != 0 ? null : bool11, (i4 & 8) != 0 ? null : num9, (i4 & 16) != 0 ? null : list13, (i4 & 32) != 0 ? null : num10, (i4 & 64) != 0 ? null : marketDeliveryInfoDto, (i4 & 128) != 0 ? null : str12, (i4 & 256) != 0 ? null : bool12, (i4 & 512) != 0 ? null : str13, (i4 & 1024) != 0 ? null : list14, (i4 & 2048) != 0 ? null : bool13, (i4 & 4096) != 0 ? null : num11, (i4 & 8192) != 0 ? null : list15, (i4 & 16384) != 0 ? null : str14, (i4 & 32768) != 0 ? null : marketItemRejectInfoDto, (i4 & 65536) != 0 ? null : num12, (i4 & 131072) != 0 ? null : userId2, (i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str15, (i4 & 524288) != 0 ? null : bool14, (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : marketMarketItemRatingDto, (i4 & 2097152) != 0 ? null : list16, (i4 & 4194304) != 0 ? null : list17, (i4 & 8388608) != 0 ? null : bool15, (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str16, (i4 & 33554432) != 0 ? null : str17, (i4 & 67108864) != 0 ? null : str18, (i4 & 134217728) != 0 ? null : str19, (268435456 & i4) != 0 ? null : str20);
    }
}
