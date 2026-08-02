package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.Gc;
import com.ironsource.Hb;
import com.ironsource.O6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.actionLinks.dto.ActionLinksActionDto;
import com.vk.api.generated.ads.dto.AdsAdvertiserInfoDto;
import com.vk.api.generated.ads.dto.AdsItemBlockAdStatPixelDto;
import com.vk.api.generated.audio.dto.AudioArtistDto;
import com.vk.api.generated.audio.dto.AudioGenreDto;
import com.vk.api.generated.badges.dto.BadgesCommentInfoDto;
import com.vk.api.generated.badges.dto.BadgesDonutInfoDto;
import com.vk.api.generated.badges.dto.BadgesObjectInfoDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseBottomExtensionDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLikesDto;
import com.vk.api.generated.base.dto.BaseLikesInfoDto;
import com.vk.api.generated.base.dto.BaseObjectCountDto;
import com.vk.api.generated.base.dto.BasePropertyExistsDto;
import com.vk.api.generated.base.dto.BaseRepostsInfoDto;
import com.vk.api.generated.likes.dto.LikesItemReactionsDto;
import com.vk.api.generated.market.dto.MarketBadgeDto;
import com.vk.api.generated.market.dto.MarketCustomButtonFullDto;
import com.vk.api.generated.market.dto.MarketDeliveryInfoDto;
import com.vk.api.generated.market.dto.MarketItemPropertyValueDto;
import com.vk.api.generated.market.dto.MarketItemRejectInfoDto;
import com.vk.api.generated.market.dto.MarketMarketCategoryDto;
import com.vk.api.generated.market.dto.MarketMarketItemAvailabilityDto;
import com.vk.api.generated.market.dto.MarketMarketItemIntegrationInfoDto;
import com.vk.api.generated.market.dto.MarketMarketItemRatingDto;
import com.vk.api.generated.market.dto.MarketMarketItemTypeDto;
import com.vk.api.generated.market.dto.MarketPriceDto;
import com.vk.api.generated.market.dto.MarketServicesDurationDto;
import com.vk.api.generated.media.dto.MediaRestrictionDto;
import com.vk.api.generated.nft.dto.NftGetListItemDto;
import com.vk.api.generated.photos.dto.PhotosImageDto;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesDto;
import com.vk.api.generated.tags.dto.TagsObjectTagDto;
import com.vk.api.generated.video.dto.VideoAccessInfoDto;
import com.vk.api.generated.video.dto.VideoAdsInfoDto;
import com.vk.api.generated.video.dto.VideoDonutDto;
import com.vk.api.generated.video.dto.VideoLinkedToPlaylistMarkDto;
import com.vk.api.generated.video.dto.VideoLiveStatusDto;
import com.vk.api.generated.video.dto.VideoVideoDownloadDto;
import com.vk.api.generated.video.dto.VideoVideoImageDto;
import com.vk.api.generated.video.dto.VideoVideoTrackingInfoDto;
import com.vk.api.generated.wall.dto.WallCoownersDto;
import com.vk.api.generated.wall.dto.WallGeoDto;
import com.vk.api.generated.wall.dto.WallPostActivityDto;
import com.vk.api.generated.wall.dto.WallPostCopyrightDto;
import com.vk.api.generated.wall.dto.WallPostSourceDto;
import com.vk.api.generated.wall.dto.WallPostTypeDto;
import com.vk.api.generated.wall.dto.WallPosterDto;
import com.vk.api.generated.wall.dto.WallPushSubscriptionDto;
import com.vk.api.generated.wall.dto.WallSharingDto;
import com.vk.api.generated.wall.dto.WallViewsDto;
import com.vk.api.generated.wall.dto.WallWallpostAdsEasyPromoteDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentsMetaDto;
import com.vk.api.generated.wall.dto.WallWallpostAuthorDataDto;
import com.vk.api.generated.wall.dto.WallWallpostCategoryActionDto;
import com.vk.api.generated.wall.dto.WallWallpostContentLayoutItemDto;
import com.vk.api.generated.wall.dto.WallWallpostDonutDto;
import com.vk.api.generated.wall.dto.WallWallpostFullDto;
import com.vk.api.generated.wall.dto.WallWallpostRatingDto;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.a9y;
import xsna.ao;
import xsna.asp;
import xsna.b9y;
import xsna.bh10;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.go9;
import xsna.gp;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.sn;
import xsna.up;
import xsna.uqi;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NewsfeedCommentsItemDto.kt */
/* loaded from: classes15.dex */
public abstract class NewsfeedCommentsItemDto implements Parcelable {

    /* compiled from: NewsfeedCommentsItemDto.kt */
    public static final class Deserializer implements a9y<NewsfeedCommentsItemDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                switch (f.hashCode()) {
                    case -1081306052:
                        if (f.equals("market")) {
                            return (NewsfeedCommentsItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedCommentsItemTypeMarketDto.class);
                        }
                        break;
                    case 3446944:
                        if (f.equals("post")) {
                            return (NewsfeedCommentsItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedCommentsItemTypePostDto.class);
                        }
                        break;
                    case 105008833:
                        if (f.equals("notes")) {
                            return (NewsfeedCommentsItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedCommentsItemTypeNotesDto.class);
                        }
                        break;
                    case 106642994:
                        if (f.equals("photo")) {
                            return (NewsfeedCommentsItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedCommentsItemTypePhotoDto.class);
                        }
                        break;
                    case 110546223:
                        if (f.equals("topic")) {
                            return (NewsfeedCommentsItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedCommentsItemTypeTopicDto.class);
                        }
                        break;
                    case 112202875:
                        if (f.equals("video")) {
                            return (NewsfeedCommentsItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedCommentsItemTypeVideoDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: NewsfeedCommentsItemDto.kt */
    public static final class NewsfeedCommentsItemTypeMarketDto extends NewsfeedCommentsItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedCommentsItemTypeMarketDto> CREATOR = new a();

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

        @pmi0("comments")
        private final NewsfeedCommentsBaseDto comments;

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

        @pmi0("likes")
        private final BaseLikesDto likes;

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

        @pmi0("source_id")
        private final UserId sourceId;

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

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        @pmi0("url")
        private final String url;

        @pmi0("variants_grouping_id")
        private final Integer variantsGroupingId;

        /* compiled from: NewsfeedCommentsItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedCommentsItemTypeMarketDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedCommentsItemTypeMarketDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                Boolean valueOf4;
                Boolean valueOf5;
                Boolean bool;
                MarketServicesDurationDto marketServicesDurationDto;
                ArrayList arrayList;
                MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto;
                Boolean valueOf6;
                Integer num;
                ArrayList arrayList2;
                ArrayList arrayList3;
                MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto2;
                Boolean valueOf7;
                ArrayList arrayList4;
                ArrayList arrayList5;
                Integer num2;
                Boolean bool2;
                Integer num3;
                Boolean bool3;
                Boolean valueOf8;
                MarketMarketItemRatingDto marketMarketItemRatingDto;
                ArrayList arrayList6;
                ArrayList arrayList7;
                MarketItemRejectInfoDto marketItemRejectInfoDto;
                ArrayList arrayList8;
                Boolean valueOf9;
                MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto3 = (MarketMarketItemAvailabilityDto) parcel.readParcelable(NewsfeedCommentsItemTypeMarketDto.class.getClassLoader());
                MarketMarketCategoryDto marketMarketCategoryDto = (MarketMarketCategoryDto) parcel.readParcelable(NewsfeedCommentsItemTypeMarketDto.class.getClassLoader());
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                UserId userId = (UserId) parcel.readParcelable(NewsfeedCommentsItemTypeMarketDto.class.getClassLoader());
                MarketPriceDto marketPriceDto = (MarketPriceDto) parcel.readParcelable(NewsfeedCommentsItemTypeMarketDto.class.getClassLoader());
                String readString2 = parcel.readString();
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedCommentsItemTypeMarketDto.class.getClassLoader());
                NewsfeedCommentsBaseDto createFromParcel = parcel.readInt() == 0 ? null : NewsfeedCommentsBaseDto.CREATOR.createFromParcel(parcel);
                BaseLikesDto baseLikesDto = (BaseLikesDto) parcel.readParcelable(NewsfeedCommentsItemTypeMarketDto.class.getClassLoader());
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                MarketMarketCategoryDto marketMarketCategoryDto2 = (MarketMarketCategoryDto) parcel.readParcelable(NewsfeedCommentsItemTypeMarketDto.class.getClassLoader());
                Integer valueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                MarketMarketItemTypeDto marketMarketItemTypeDto = (MarketMarketItemTypeDto) parcel.readParcelable(NewsfeedCommentsItemTypeMarketDto.class.getClassLoader());
                MarketMarketItemIntegrationInfoDto marketMarketItemIntegrationInfoDto = (MarketMarketItemIntegrationInfoDto) parcel.readParcelable(NewsfeedCommentsItemTypeMarketDto.class.getClassLoader());
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
                MarketServicesDurationDto marketServicesDurationDto2 = (MarketServicesDurationDto) parcel.readParcelable(NewsfeedCommentsItemTypeMarketDto.class.getClassLoader());
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
                    bool = valueOf;
                    marketServicesDurationDto = marketServicesDurationDto2;
                    marketMarketItemAvailabilityDto = marketMarketItemAvailabilityDto3;
                    arrayList = null;
                } else {
                    bool = valueOf;
                    int readInt2 = parcel.readInt();
                    marketServicesDurationDto = marketServicesDurationDto2;
                    arrayList = new ArrayList(readInt2);
                    marketMarketItemAvailabilityDto = marketMarketItemAvailabilityDto3;
                    int i = 0;
                    while (i != readInt2) {
                        i = bo.b(NewsfeedCommentsItemTypeMarketDto.class, parcel, arrayList, i, 1);
                        readInt2 = readInt2;
                    }
                }
                Integer valueOf13 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                MarketDeliveryInfoDto marketDeliveryInfoDto = (MarketDeliveryInfoDto) parcel.readParcelable(NewsfeedCommentsItemTypeMarketDto.class.getClassLoader());
                Boolean bool4 = valueOf2;
                Boolean bool5 = valueOf3;
                Boolean bool6 = valueOf4;
                MarketServicesDurationDto marketServicesDurationDto3 = marketServicesDurationDto;
                MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto4 = marketMarketItemAvailabilityDto;
                String readString9 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString10 = parcel.readString();
                if (parcel.readInt() == 0) {
                    num = valueOf13;
                    arrayList2 = arrayList;
                    marketMarketItemAvailabilityDto2 = marketMarketItemAvailabilityDto4;
                    arrayList3 = null;
                } else {
                    num = valueOf13;
                    int readInt3 = parcel.readInt();
                    arrayList2 = arrayList;
                    arrayList3 = new ArrayList(readInt3);
                    marketMarketItemAvailabilityDto2 = marketMarketItemAvailabilityDto4;
                    int i2 = 0;
                    while (i2 != readInt3) {
                        i2 = bo.b(NewsfeedCommentsItemTypeMarketDto.class, parcel, arrayList3, i2, 1);
                        readInt3 = readInt3;
                    }
                }
                if (parcel.readInt() == 0) {
                    valueOf7 = null;
                } else {
                    valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Integer valueOf14 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    Integer num4 = num;
                    bool3 = valueOf7;
                    bool2 = bool;
                    num3 = num4;
                    arrayList4 = arrayList3;
                    num2 = valueOf14;
                    arrayList5 = null;
                } else {
                    Boolean bool7 = valueOf7;
                    int readInt4 = parcel.readInt();
                    arrayList4 = arrayList3;
                    arrayList5 = new ArrayList(readInt4);
                    num2 = valueOf14;
                    int i3 = 0;
                    while (i3 != readInt4) {
                        i3 = bo.b(NewsfeedCommentsItemTypeMarketDto.class, parcel, arrayList5, i3, 1);
                        readInt4 = readInt4;
                    }
                    bool2 = bool;
                    num3 = num;
                    bool3 = bool7;
                }
                String readString11 = parcel.readString();
                MarketItemRejectInfoDto marketItemRejectInfoDto2 = (MarketItemRejectInfoDto) parcel.readParcelable(NewsfeedCommentsItemTypeMarketDto.class.getClassLoader());
                Integer valueOf15 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                UserId userId2 = (UserId) parcel.readParcelable(NewsfeedCommentsItemTypeMarketDto.class.getClassLoader());
                String readString12 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf8 = null;
                } else {
                    valueOf8 = Boolean.valueOf(parcel.readInt() != 0);
                }
                MarketMarketItemRatingDto marketMarketItemRatingDto2 = (MarketMarketItemRatingDto) parcel.readParcelable(NewsfeedCommentsItemTypeMarketDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    marketMarketItemRatingDto = marketMarketItemRatingDto2;
                    arrayList6 = arrayList5;
                    marketItemRejectInfoDto = marketItemRejectInfoDto2;
                    arrayList7 = null;
                } else {
                    marketMarketItemRatingDto = marketMarketItemRatingDto2;
                    int readInt5 = parcel.readInt();
                    arrayList6 = arrayList5;
                    arrayList7 = new ArrayList(readInt5);
                    marketItemRejectInfoDto = marketItemRejectInfoDto2;
                    int i4 = 0;
                    while (i4 != readInt5) {
                        int i5 = readInt5;
                        int readInt6 = parcel.readInt();
                        int i6 = i4;
                        ArrayList arrayList9 = new ArrayList(readInt6);
                        MarketMarketCategoryDto marketMarketCategoryDto3 = marketMarketCategoryDto;
                        int i7 = 0;
                        while (i7 != readInt6) {
                            i7 = bo.b(NewsfeedCommentsItemTypeMarketDto.class, parcel, arrayList9, i7, 1);
                            readInt6 = readInt6;
                        }
                        arrayList7.add(arrayList9);
                        i4 = i6 + 1;
                        readInt5 = i5;
                        marketMarketCategoryDto = marketMarketCategoryDto3;
                    }
                }
                MarketMarketCategoryDto marketMarketCategoryDto4 = marketMarketCategoryDto;
                if (parcel.readInt() == 0) {
                    arrayList8 = null;
                } else {
                    int readInt7 = parcel.readInt();
                    arrayList8 = new ArrayList(readInt7);
                    int i8 = 0;
                    while (i8 != readInt7) {
                        i8 = bo.b(NewsfeedCommentsItemTypeMarketDto.class, parcel, arrayList8, i8, 1);
                        readInt7 = readInt7;
                    }
                }
                if (parcel.readInt() == 0) {
                    valueOf9 = null;
                } else {
                    valueOf9 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NewsfeedCommentsItemTypeMarketDto(marketMarketItemAvailabilityDto2, marketMarketCategoryDto4, readString, readInt, userId, marketPriceDto, readString2, newsfeedNewsfeedItemTypeDto, createFromParcel, baseLikesDto, readString3, readString4, marketMarketCategoryDto2, valueOf10, readString5, readString6, marketMarketItemTypeDto, marketMarketItemIntegrationInfoDto, bool2, bool4, bool5, bool6, marketServicesDurationDto3, readString7, readString8, valueOf11, valueOf5, valueOf12, arrayList2, num3, marketDeliveryInfoDto, readString9, valueOf6, readString10, arrayList4, bool3, num2, arrayList6, readString11, marketItemRejectInfoDto, valueOf15, userId2, readString12, valueOf8, marketMarketItemRatingDto, arrayList7, arrayList8, valueOf9, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (UserId) parcel.readParcelable(NewsfeedCommentsItemTypeMarketDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedCommentsItemTypeMarketDto[] newArray(int i) {
                return new NewsfeedCommentsItemTypeMarketDto[i];
            }
        }

        public /* synthetic */ NewsfeedCommentsItemTypeMarketDto(MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto, MarketMarketCategoryDto marketMarketCategoryDto, String str, int i, UserId userId, MarketPriceDto marketPriceDto, String str2, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, NewsfeedCommentsBaseDto newsfeedCommentsBaseDto, BaseLikesDto baseLikesDto, String str3, String str4, MarketMarketCategoryDto marketMarketCategoryDto2, Integer num, String str5, String str6, MarketMarketItemTypeDto marketMarketItemTypeDto, MarketMarketItemIntegrationInfoDto marketMarketItemIntegrationInfoDto, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, MarketServicesDurationDto marketServicesDurationDto, String str7, String str8, Integer num2, Boolean bool5, Integer num3, List list, Integer num4, MarketDeliveryInfoDto marketDeliveryInfoDto, String str9, Boolean bool6, String str10, List list2, Boolean bool7, Integer num5, List list3, String str11, MarketItemRejectInfoDto marketItemRejectInfoDto, Integer num6, UserId userId2, String str12, Boolean bool8, MarketMarketItemRatingDto marketMarketItemRatingDto, List list4, List list5, Boolean bool9, String str13, String str14, String str15, String str16, String str17, UserId userId3, int i2, int i3, zcl zclVar) {
            this(marketMarketItemAvailabilityDto, marketMarketCategoryDto, str, i, userId, marketPriceDto, str2, newsfeedNewsfeedItemTypeDto, (i2 & 256) != 0 ? null : newsfeedCommentsBaseDto, (i2 & 512) != 0 ? null : baseLikesDto, (i2 & 1024) != 0 ? null : str3, (i2 & 2048) != 0 ? null : str4, (i2 & 4096) != 0 ? null : marketMarketCategoryDto2, (i2 & 8192) != 0 ? null : num, (i2 & 16384) != 0 ? null : str5, (i2 & 32768) != 0 ? null : str6, (i2 & 65536) != 0 ? null : marketMarketItemTypeDto, (i2 & 131072) != 0 ? null : marketMarketItemIntegrationInfoDto, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool, (i2 & 524288) != 0 ? null : bool2, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool3, (i2 & 2097152) != 0 ? null : bool4, (4194304 & i2) != 0 ? null : marketServicesDurationDto, (8388608 & i2) != 0 ? null : str7, (16777216 & i2) != 0 ? null : str8, (33554432 & i2) != 0 ? null : num2, (67108864 & i2) != 0 ? null : bool5, (134217728 & i2) != 0 ? null : num3, (268435456 & i2) != 0 ? null : list, (536870912 & i2) != 0 ? null : num4, (1073741824 & i2) != 0 ? null : marketDeliveryInfoDto, (i2 & Integer.MIN_VALUE) != 0 ? null : str9, (i3 & 1) != 0 ? null : bool6, (i3 & 2) != 0 ? null : str10, (i3 & 4) != 0 ? null : list2, (i3 & 8) != 0 ? null : bool7, (i3 & 16) != 0 ? null : num5, (i3 & 32) != 0 ? null : list3, (i3 & 64) != 0 ? null : str11, (i3 & 128) != 0 ? null : marketItemRejectInfoDto, (i3 & 256) != 0 ? null : num6, (i3 & 512) != 0 ? null : userId2, (i3 & 1024) != 0 ? null : str12, (i3 & 2048) != 0 ? null : bool8, (i3 & 4096) != 0 ? null : marketMarketItemRatingDto, (i3 & 8192) != 0 ? null : list4, (i3 & 16384) != 0 ? null : list5, (i3 & 32768) != 0 ? null : bool9, (i3 & 65536) != 0 ? null : str13, (i3 & 131072) != 0 ? null : str14, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str15, (i3 & 524288) != 0 ? null : str16, (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str17, (i3 & 2097152) != 0 ? null : userId3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedCommentsItemTypeMarketDto)) {
                return false;
            }
            NewsfeedCommentsItemTypeMarketDto newsfeedCommentsItemTypeMarketDto = (NewsfeedCommentsItemTypeMarketDto) obj;
            return this.availability == newsfeedCommentsItemTypeMarketDto.availability && epx.f(this.category, newsfeedCommentsItemTypeMarketDto.category) && epx.f(this.description, newsfeedCommentsItemTypeMarketDto.description) && this.id == newsfeedCommentsItemTypeMarketDto.id && epx.f(this.ownerId, newsfeedCommentsItemTypeMarketDto.ownerId) && epx.f(this.price, newsfeedCommentsItemTypeMarketDto.price) && epx.f(this.title, newsfeedCommentsItemTypeMarketDto.title) && this.type == newsfeedCommentsItemTypeMarketDto.type && epx.f(this.comments, newsfeedCommentsItemTypeMarketDto.comments) && epx.f(this.likes, newsfeedCommentsItemTypeMarketDto.likes) && epx.f(this.accessKey, newsfeedCommentsItemTypeMarketDto.accessKey) && epx.f(this.buttonTitle, newsfeedCommentsItemTypeMarketDto.buttonTitle) && epx.f(this.categoryV2, newsfeedCommentsItemTypeMarketDto.categoryV2) && epx.f(this.date, newsfeedCommentsItemTypeMarketDto.date) && epx.f(this.descriptionUrl, newsfeedCommentsItemTypeMarketDto.descriptionUrl) && epx.f(this.externalId, newsfeedCommentsItemTypeMarketDto.externalId) && this.itemType == newsfeedCommentsItemTypeMarketDto.itemType && epx.f(this.integrationInfo, newsfeedCommentsItemTypeMarketDto.integrationInfo) && epx.f(this.isFavorite, newsfeedCommentsItemTypeMarketDto.isFavorite) && epx.f(this.isPriceListService, newsfeedCommentsItemTypeMarketDto.isPriceListService) && epx.f(this.isOwner, newsfeedCommentsItemTypeMarketDto.isOwner) && epx.f(this.isAdult, newsfeedCommentsItemTypeMarketDto.isAdult) && epx.f(this.serviceDuration, newsfeedCommentsItemTypeMarketDto.serviceDuration) && epx.f(this.thumbPhoto, newsfeedCommentsItemTypeMarketDto.thumbPhoto) && epx.f(this.url, newsfeedCommentsItemTypeMarketDto.url) && epx.f(this.variantsGroupingId, newsfeedCommentsItemTypeMarketDto.variantsGroupingId) && epx.f(this.isMainVariant, newsfeedCommentsItemTypeMarketDto.isMainVariant) && epx.f(this.availableVariantItemId, newsfeedCommentsItemTypeMarketDto.availableVariantItemId) && epx.f(this.propertyValues, newsfeedCommentsItemTypeMarketDto.propertyValues) && epx.f(this.cartQuantity, newsfeedCommentsItemTypeMarketDto.cartQuantity) && epx.f(this.deliveryInfo, newsfeedCommentsItemTypeMarketDto.deliveryInfo) && epx.f(this.sku, newsfeedCommentsItemTypeMarketDto.sku) && epx.f(this.isAliexpressProduct, newsfeedCommentsItemTypeMarketDto.isAliexpressProduct) && epx.f(this.csrfHashes, newsfeedCommentsItemTypeMarketDto.csrfHashes) && epx.f(this.thumb, newsfeedCommentsItemTypeMarketDto.thumb) && epx.f(this.isAliexpressCheckout, newsfeedCommentsItemTypeMarketDto.isAliexpressCheckout) && epx.f(this.stockAmount, newsfeedCommentsItemTypeMarketDto.stockAmount) && epx.f(this.badges, newsfeedCommentsItemTypeMarketDto.badges) && epx.f(this.trackCode, newsfeedCommentsItemTypeMarketDto.trackCode) && epx.f(this.rejectInfo, newsfeedCommentsItemTypeMarketDto.rejectInfo) && epx.f(this.postId, newsfeedCommentsItemTypeMarketDto.postId) && epx.f(this.postOwnerId, newsfeedCommentsItemTypeMarketDto.postOwnerId) && epx.f(this.openMarketLink, newsfeedCommentsItemTypeMarketDto.openMarketLink) && epx.f(this.isHardblocked, newsfeedCommentsItemTypeMarketDto.isHardblocked) && epx.f(this.itemRating, newsfeedCommentsItemTypeMarketDto.itemRating) && epx.f(this.thumbs, newsfeedCommentsItemTypeMarketDto.thumbs) && epx.f(this.buttons, newsfeedCommentsItemTypeMarketDto.buttons) && epx.f(this.hasGroupAccess, newsfeedCommentsItemTypeMarketDto.hasGroupAccess) && epx.f(this.seoSlug, newsfeedCommentsItemTypeMarketDto.seoSlug) && epx.f(this.seoTitle, newsfeedCommentsItemTypeMarketDto.seoTitle) && epx.f(this.seoDescription, newsfeedCommentsItemTypeMarketDto.seoDescription) && epx.f(this.externalUrl, newsfeedCommentsItemTypeMarketDto.externalUrl) && epx.f(this.marketUrl, newsfeedCommentsItemTypeMarketDto.marketUrl) && epx.f(this.sourceId, newsfeedCommentsItemTypeMarketDto.sourceId);
        }

        public final int hashCode() {
            int hashCode = (this.type.hashCode() + urd0.a((this.price.hashCode() + bh10.a(shy.a(this.id, urd0.a((this.category.hashCode() + (this.availability.hashCode() * 31)) * 31, 31, this.description), 31), 31, this.ownerId.b)) * 31, 31, this.title)) * 31;
            NewsfeedCommentsBaseDto newsfeedCommentsBaseDto = this.comments;
            int hashCode2 = (hashCode + (newsfeedCommentsBaseDto == null ? 0 : newsfeedCommentsBaseDto.hashCode())) * 31;
            BaseLikesDto baseLikesDto = this.likes;
            int hashCode3 = (hashCode2 + (baseLikesDto == null ? 0 : baseLikesDto.hashCode())) * 31;
            String str = this.accessKey;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.buttonTitle;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            MarketMarketCategoryDto marketMarketCategoryDto = this.categoryV2;
            int hashCode6 = (hashCode5 + (marketMarketCategoryDto == null ? 0 : marketMarketCategoryDto.hashCode())) * 31;
            Integer num = this.date;
            int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.descriptionUrl;
            int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.externalId;
            int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
            MarketMarketItemTypeDto marketMarketItemTypeDto = this.itemType;
            int hashCode10 = (hashCode9 + (marketMarketItemTypeDto == null ? 0 : marketMarketItemTypeDto.hashCode())) * 31;
            MarketMarketItemIntegrationInfoDto marketMarketItemIntegrationInfoDto = this.integrationInfo;
            int hashCode11 = (hashCode10 + (marketMarketItemIntegrationInfoDto == null ? 0 : marketMarketItemIntegrationInfoDto.hashCode())) * 31;
            Boolean bool = this.isFavorite;
            int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isPriceListService;
            int hashCode13 = (hashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.isOwner;
            int hashCode14 = (hashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.isAdult;
            int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            MarketServicesDurationDto marketServicesDurationDto = this.serviceDuration;
            int hashCode16 = (hashCode15 + (marketServicesDurationDto == null ? 0 : marketServicesDurationDto.hashCode())) * 31;
            String str5 = this.thumbPhoto;
            int hashCode17 = (hashCode16 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.url;
            int hashCode18 = (hashCode17 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num2 = this.variantsGroupingId;
            int hashCode19 = (hashCode18 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Boolean bool5 = this.isMainVariant;
            int hashCode20 = (hashCode19 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            Integer num3 = this.availableVariantItemId;
            int hashCode21 = (hashCode20 + (num3 == null ? 0 : num3.hashCode())) * 31;
            List<MarketItemPropertyValueDto> list = this.propertyValues;
            int hashCode22 = (hashCode21 + (list == null ? 0 : list.hashCode())) * 31;
            Integer num4 = this.cartQuantity;
            int hashCode23 = (hashCode22 + (num4 == null ? 0 : num4.hashCode())) * 31;
            MarketDeliveryInfoDto marketDeliveryInfoDto = this.deliveryInfo;
            int hashCode24 = (hashCode23 + (marketDeliveryInfoDto == null ? 0 : marketDeliveryInfoDto.hashCode())) * 31;
            String str7 = this.sku;
            int hashCode25 = (hashCode24 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Boolean bool6 = this.isAliexpressProduct;
            int hashCode26 = (hashCode25 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            String str8 = this.csrfHashes;
            int hashCode27 = (hashCode26 + (str8 == null ? 0 : str8.hashCode())) * 31;
            List<BaseImageDto> list2 = this.thumb;
            int hashCode28 = (hashCode27 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Boolean bool7 = this.isAliexpressCheckout;
            int hashCode29 = (hashCode28 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            Integer num5 = this.stockAmount;
            int hashCode30 = (hashCode29 + (num5 == null ? 0 : num5.hashCode())) * 31;
            List<MarketBadgeDto> list3 = this.badges;
            int hashCode31 = (hashCode30 + (list3 == null ? 0 : list3.hashCode())) * 31;
            String str9 = this.trackCode;
            int hashCode32 = (hashCode31 + (str9 == null ? 0 : str9.hashCode())) * 31;
            MarketItemRejectInfoDto marketItemRejectInfoDto = this.rejectInfo;
            int hashCode33 = (hashCode32 + (marketItemRejectInfoDto == null ? 0 : marketItemRejectInfoDto.hashCode())) * 31;
            Integer num6 = this.postId;
            int hashCode34 = (hashCode33 + (num6 == null ? 0 : num6.hashCode())) * 31;
            UserId userId = this.postOwnerId;
            int hashCode35 = (hashCode34 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            String str10 = this.openMarketLink;
            int hashCode36 = (hashCode35 + (str10 == null ? 0 : str10.hashCode())) * 31;
            Boolean bool8 = this.isHardblocked;
            int hashCode37 = (hashCode36 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
            MarketMarketItemRatingDto marketMarketItemRatingDto = this.itemRating;
            int hashCode38 = (hashCode37 + (marketMarketItemRatingDto == null ? 0 : marketMarketItemRatingDto.hashCode())) * 31;
            List<List<BaseImageDto>> list4 = this.thumbs;
            int hashCode39 = (hashCode38 + (list4 == null ? 0 : list4.hashCode())) * 31;
            List<MarketCustomButtonFullDto> list5 = this.buttons;
            int hashCode40 = (hashCode39 + (list5 == null ? 0 : list5.hashCode())) * 31;
            Boolean bool9 = this.hasGroupAccess;
            int hashCode41 = (hashCode40 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
            String str11 = this.seoSlug;
            int hashCode42 = (hashCode41 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.seoTitle;
            int hashCode43 = (hashCode42 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.seoDescription;
            int hashCode44 = (hashCode43 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.externalUrl;
            int hashCode45 = (hashCode44 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.marketUrl;
            int hashCode46 = (hashCode45 + (str15 == null ? 0 : str15.hashCode())) * 31;
            UserId userId2 = this.sourceId;
            return hashCode46 + (userId2 != null ? Long.hashCode(userId2.b) : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedCommentsItemTypeMarketDto(availability=");
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
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", comments=");
            sb.append(this.comments);
            sb.append(", likes=");
            sb.append(this.likes);
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
            sb.append(this.marketUrl);
            sb.append(", sourceId=");
            return gp.b(sb, this.sourceId, ')');
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
            parcel.writeParcelable(this.type, i);
            NewsfeedCommentsBaseDto newsfeedCommentsBaseDto = this.comments;
            if (newsfeedCommentsBaseDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedCommentsBaseDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.likes, i);
            parcel.writeString(this.accessKey);
            parcel.writeString(this.buttonTitle);
            parcel.writeParcelable(this.categoryV2, i);
            Integer num = this.date;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeString(this.descriptionUrl);
            parcel.writeString(this.externalId);
            parcel.writeParcelable(this.itemType, i);
            parcel.writeParcelable(this.integrationInfo, i);
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
            parcel.writeParcelable(this.serviceDuration, i);
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
                    parcel.writeParcelable((Parcelable) f.next(), i);
                }
            }
            Integer num4 = this.cartQuantity;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num4);
            }
            parcel.writeParcelable(this.deliveryInfo, i);
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
                    parcel.writeParcelable((Parcelable) f2.next(), i);
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
                    parcel.writeParcelable((Parcelable) f3.next(), i);
                }
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.rejectInfo, i);
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
            parcel.writeParcelable(this.itemRating, i);
            List<List<BaseImageDto>> list4 = this.thumbs;
            if (list4 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f4 = dn.f(parcel, list4, 1);
                while (f4.hasNext()) {
                    Iterator a2 = ao.a(parcel, (List) f4.next());
                    while (a2.hasNext()) {
                        parcel.writeParcelable((Parcelable) a2.next(), i);
                    }
                }
            }
            List<MarketCustomButtonFullDto> list5 = this.buttons;
            if (list5 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f5 = dn.f(parcel, list5, 1);
                while (f5.hasNext()) {
                    parcel.writeParcelable((Parcelable) f5.next(), i);
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
            parcel.writeParcelable(this.sourceId, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NewsfeedCommentsItemTypeMarketDto(MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto, MarketMarketCategoryDto marketMarketCategoryDto, String str, int i, UserId userId, MarketPriceDto marketPriceDto, String str2, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, NewsfeedCommentsBaseDto newsfeedCommentsBaseDto, BaseLikesDto baseLikesDto, String str3, String str4, MarketMarketCategoryDto marketMarketCategoryDto2, Integer num, String str5, String str6, MarketMarketItemTypeDto marketMarketItemTypeDto, MarketMarketItemIntegrationInfoDto marketMarketItemIntegrationInfoDto, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, MarketServicesDurationDto marketServicesDurationDto, String str7, String str8, Integer num2, Boolean bool5, Integer num3, List<MarketItemPropertyValueDto> list, Integer num4, MarketDeliveryInfoDto marketDeliveryInfoDto, String str9, Boolean bool6, String str10, List<BaseImageDto> list2, Boolean bool7, Integer num5, List<MarketBadgeDto> list3, String str11, MarketItemRejectInfoDto marketItemRejectInfoDto, Integer num6, UserId userId2, String str12, Boolean bool8, MarketMarketItemRatingDto marketMarketItemRatingDto, List<? extends List<BaseImageDto>> list4, List<MarketCustomButtonFullDto> list5, Boolean bool9, String str13, String str14, String str15, String str16, String str17, UserId userId3) {
            super(null);
            this.availability = marketMarketItemAvailabilityDto;
            this.category = marketMarketCategoryDto;
            this.description = str;
            this.id = i;
            this.ownerId = userId;
            this.price = marketPriceDto;
            this.title = str2;
            this.type = newsfeedNewsfeedItemTypeDto;
            this.comments = newsfeedCommentsBaseDto;
            this.likes = baseLikesDto;
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
            this.sourceId = userId3;
        }
    }

    /* compiled from: NewsfeedCommentsItemDto.kt */
    public static final class NewsfeedCommentsItemTypeNotesDto extends NewsfeedCommentsItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedCommentsItemTypeNotesDto> CREATOR = new a();

        @pmi0("comments")
        private final NewsfeedCommentsBaseDto comments;

        @pmi0("date")
        private final Integer date;

        @pmi0("likes")
        private final BaseLikesDto likes;

        @pmi0("post_id")
        private final Integer postId;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("text")
        private final String text;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* compiled from: NewsfeedCommentsItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedCommentsItemTypeNotesDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedCommentsItemTypeNotesDto createFromParcel(Parcel parcel) {
                return new NewsfeedCommentsItemTypeNotesDto((NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedCommentsItemTypeNotesDto.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : NewsfeedCommentsBaseDto.CREATOR.createFromParcel(parcel), (BaseLikesDto) parcel.readParcelable(NewsfeedCommentsItemTypeNotesDto.class.getClassLoader()), (UserId) parcel.readParcelable(NewsfeedCommentsItemTypeNotesDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedCommentsItemTypeNotesDto[] newArray(int i) {
                return new NewsfeedCommentsItemTypeNotesDto[i];
            }
        }

        public /* synthetic */ NewsfeedCommentsItemTypeNotesDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, String str, NewsfeedCommentsBaseDto newsfeedCommentsBaseDto, BaseLikesDto baseLikesDto, UserId userId, Integer num, Integer num2, int i, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : newsfeedCommentsBaseDto, (i & 8) != 0 ? null : baseLikesDto, (i & 16) != 0 ? null : userId, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedCommentsItemTypeNotesDto)) {
                return false;
            }
            NewsfeedCommentsItemTypeNotesDto newsfeedCommentsItemTypeNotesDto = (NewsfeedCommentsItemTypeNotesDto) obj;
            return this.type == newsfeedCommentsItemTypeNotesDto.type && epx.f(this.text, newsfeedCommentsItemTypeNotesDto.text) && epx.f(this.comments, newsfeedCommentsItemTypeNotesDto.comments) && epx.f(this.likes, newsfeedCommentsItemTypeNotesDto.likes) && epx.f(this.sourceId, newsfeedCommentsItemTypeNotesDto.sourceId) && epx.f(this.date, newsfeedCommentsItemTypeNotesDto.date) && epx.f(this.postId, newsfeedCommentsItemTypeNotesDto.postId);
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            String str = this.text;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            NewsfeedCommentsBaseDto newsfeedCommentsBaseDto = this.comments;
            int hashCode3 = (hashCode2 + (newsfeedCommentsBaseDto == null ? 0 : newsfeedCommentsBaseDto.hashCode())) * 31;
            BaseLikesDto baseLikesDto = this.likes;
            int hashCode4 = (hashCode3 + (baseLikesDto == null ? 0 : baseLikesDto.hashCode())) * 31;
            UserId userId = this.sourceId;
            int hashCode5 = (hashCode4 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            Integer num = this.date;
            int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.postId;
            return hashCode6 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedCommentsItemTypeNotesDto(type=");
            sb.append(this.type);
            sb.append(", text=");
            sb.append(this.text);
            sb.append(", comments=");
            sb.append(this.comments);
            sb.append(", likes=");
            sb.append(this.likes);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", postId=");
            return uqi.b(sb, this.postId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.type, i);
            parcel.writeString(this.text);
            NewsfeedCommentsBaseDto newsfeedCommentsBaseDto = this.comments;
            if (newsfeedCommentsBaseDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedCommentsBaseDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.likes, i);
            parcel.writeParcelable(this.sourceId, i);
            Integer num = this.date;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            Integer num2 = this.postId;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num2);
            }
        }

        public NewsfeedCommentsItemTypeNotesDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, String str, NewsfeedCommentsBaseDto newsfeedCommentsBaseDto, BaseLikesDto baseLikesDto, UserId userId, Integer num, Integer num2) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.text = str;
            this.comments = newsfeedCommentsBaseDto;
            this.likes = baseLikesDto;
            this.sourceId = userId;
            this.date = num;
            this.postId = num2;
        }
    }

    /* compiled from: NewsfeedCommentsItemDto.kt */
    public static final class NewsfeedCommentsItemTypePhotoDto extends NewsfeedCommentsItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedCommentsItemTypePhotoDto> CREATOR = new a();

        @pmi0("access_key")
        private final String accessKey;

        @pmi0("album_id")
        private final int albumId;

        @pmi0("blur_mask")
        private final String blurMask;

        @pmi0("blurred_id")
        private final Integer blurredId;

        @pmi0("blurred_sizes")
        private final List<PhotosPhotoSizesDto> blurredSizes;

        @pmi0("can_be_owner_photo")
        private final BaseBoolIntDto canBeOwnerPhoto;

        @pmi0("can_comment")
        private final BaseBoolIntDto canComment;

        @pmi0("can_repost")
        private final BaseBoolIntDto canRepost;

        @pmi0("comments")
        private final NewsfeedCommentsBaseDto comments;

        @pmi0("content_tags")
        private final List<TagsObjectTagDto> contentTags;

        @pmi0("crop_data")
        private final List<Integer> cropData;

        @pmi0("date")
        private final int date;

        @pmi0("feed_pinned")
        private final Boolean feedPinned;

        @pmi0("has_tags")
        private final boolean hasTags;

        @pmi0("height")
        private final Integer height;

        @pmi0("hidden")
        private final BasePropertyExistsDto hidden;

        @pmi0("id")
        private final int id;

        @pmi0("images")
        private final List<PhotosImageDto> images;

        @pmi0("is_donut")
        private final Boolean isDonut;

        @pmi0(O6.s)
        private final Float lat;

        @pmi0("likes")
        private final BaseLikesDto likes;

        /* renamed from: long, reason: not valid java name */
        @pmi0("long")
        private final Float f11long;

        @pmi0("nft")
        private final NftGetListItemDto nft;

        @pmi0("orig_photo")
        private final PhotosImageDto origPhoto;

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("photo_256")
        private final String photo256;

        @pmi0("photo_before_crop")
        private final PhotosImageDto photoBeforeCrop;

        @pmi0("place")
        private final String place;

        @pmi0("post_id")
        private final Integer postId;

        @pmi0("real_offset")
        private final Integer realOffset;

        @pmi0("reposts")
        private final BaseRepostsInfoDto reposts;

        @pmi0("restrictions")
        private final MediaRestrictionDto restrictions;

        @pmi0("sizes")
        private final List<PhotosPhotoSizesDto> sizes;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("square_crop")
        private final String squareCrop;

        @pmi0("src_big")
        private final String srcBig;

        @pmi0("src_small")
        private final String srcSmall;

        @pmi0("tags")
        private final BaseObjectCountDto tags;

        @pmi0("text")
        private final String text;

        @pmi0("thumb_hash")
        private final String thumbHash;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        @pmi0("user_id")
        private final UserId userId;

        @pmi0("vertical_align")
        private final VerticalAlignDto verticalAlign;

        @pmi0("web_view_token")
        private final String webViewToken;

        @pmi0("width")
        private final Integer width;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedCommentsItemDto.kt */
        public static final class VerticalAlignDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ VerticalAlignDto[] $VALUES;

            @pmi0("bottom")
            public static final VerticalAlignDto BOTTOM;
            public static final Parcelable.Creator<VerticalAlignDto> CREATOR;

            @pmi0("middle")
            public static final VerticalAlignDto MIDDLE;

            @pmi0("top")
            public static final VerticalAlignDto TOP;
            private final String value;

            /* compiled from: NewsfeedCommentsItemDto.kt */
            public static final class a implements Parcelable.Creator<VerticalAlignDto> {
                @Override // android.os.Parcelable.Creator
                public final VerticalAlignDto createFromParcel(Parcel parcel) {
                    return VerticalAlignDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final VerticalAlignDto[] newArray(int i) {
                    return new VerticalAlignDto[i];
                }
            }

            static {
                VerticalAlignDto verticalAlignDto = new VerticalAlignDto("TOP", 0, "top");
                TOP = verticalAlignDto;
                VerticalAlignDto verticalAlignDto2 = new VerticalAlignDto("MIDDLE", 1, "middle");
                MIDDLE = verticalAlignDto2;
                VerticalAlignDto verticalAlignDto3 = new VerticalAlignDto("BOTTOM", 2, "bottom");
                BOTTOM = verticalAlignDto3;
                VerticalAlignDto[] verticalAlignDtoArr = {verticalAlignDto, verticalAlignDto2, verticalAlignDto3};
                $VALUES = verticalAlignDtoArr;
                $ENTRIES = new asp(verticalAlignDtoArr);
                CREATOR = new a();
            }

            private VerticalAlignDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static VerticalAlignDto valueOf(String str) {
                return (VerticalAlignDto) Enum.valueOf(VerticalAlignDto.class, str);
            }

            public static VerticalAlignDto[] values() {
                return (VerticalAlignDto[]) $VALUES.clone();
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

        /* compiled from: NewsfeedCommentsItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedCommentsItemTypePhotoDto> {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final NewsfeedCommentsItemTypePhotoDto createFromParcel(Parcel parcel) {
                UserId userId;
                boolean z;
                ArrayList arrayList;
                int i;
                int i2;
                ArrayList arrayList2;
                int i3;
                ArrayList arrayList3;
                ArrayList arrayList4;
                ArrayList arrayList5;
                ArrayList arrayList6;
                Boolean valueOf;
                Integer valueOf2;
                ArrayList arrayList7;
                BasePropertyExistsDto basePropertyExistsDto;
                Object createFromParcel;
                Object obj;
                PhotosImageDto photosImageDto;
                NftGetListItemDto nftGetListItemDto;
                ArrayList arrayList8;
                int i4;
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                UserId userId2 = (UserId) parcel.readParcelable(NewsfeedCommentsItemTypePhotoDto.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    userId = userId2;
                    z = true;
                } else {
                    userId = userId2;
                    z = false;
                }
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedCommentsItemTypePhotoDto.class.getClassLoader());
                NewsfeedCommentsBaseDto createFromParcel2 = parcel.readInt() == 0 ? null : NewsfeedCommentsBaseDto.CREATOR.createFromParcel(parcel);
                BaseLikesDto baseLikesDto = (BaseLikesDto) parcel.readParcelable(NewsfeedCommentsItemTypePhotoDto.class.getClassLoader());
                UserId userId3 = userId;
                String readString = parcel.readString();
                Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt4 = parcel.readInt();
                    ArrayList arrayList9 = new ArrayList(readInt4);
                    int i5 = 0;
                    while (i5 != readInt4) {
                        i5 = bo.b(NewsfeedCommentsItemTypePhotoDto.class, parcel, arrayList9, i5, 1);
                    }
                    arrayList = arrayList9;
                }
                Float valueOf4 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                Float valueOf5 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                Float f = valueOf4;
                Integer num = valueOf3;
                String readString2 = parcel.readString();
                Float f2 = valueOf5;
                String readString3 = parcel.readString();
                BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypePhotoDto.class.getClassLoader());
                String readString4 = parcel.readString();
                Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    i = readInt;
                    i2 = readInt2;
                    i3 = readInt3;
                    arrayList2 = null;
                } else {
                    i = readInt;
                    int readInt5 = parcel.readInt();
                    i2 = readInt2;
                    arrayList2 = new ArrayList(readInt5);
                    i3 = readInt3;
                    int i6 = 0;
                    while (i6 != readInt5) {
                        i6 = pm0.b(parcel, arrayList2, i6, 1);
                        readInt5 = readInt5;
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList4 = arrayList2;
                    arrayList3 = null;
                } else {
                    int readInt6 = parcel.readInt();
                    arrayList3 = new ArrayList(readInt6);
                    arrayList4 = arrayList2;
                    int i7 = 0;
                    while (i7 != readInt6) {
                        i7 = bo.b(NewsfeedCommentsItemTypePhotoDto.class, parcel, arrayList3, i7, 1);
                        readInt6 = readInt6;
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList6 = arrayList3;
                    arrayList5 = null;
                } else {
                    int readInt7 = parcel.readInt();
                    arrayList5 = new ArrayList(readInt7);
                    arrayList6 = arrayList3;
                    int i8 = 0;
                    while (i8 != readInt7) {
                        i8 = bo.b(NewsfeedCommentsItemTypePhotoDto.class, parcel, arrayList5, i8, 1);
                        readInt7 = readInt7;
                    }
                }
                Integer num2 = valueOf6;
                String readString5 = parcel.readString();
                int i9 = i;
                String readString6 = parcel.readString();
                NftGetListItemDto nftGetListItemDto2 = (NftGetListItemDto) parcel.readParcelable(NewsfeedCommentsItemTypePhotoDto.class.getClassLoader());
                UserId userId4 = (UserId) parcel.readParcelable(NewsfeedCommentsItemTypePhotoDto.class.getClassLoader());
                ArrayList arrayList10 = arrayList4;
                String readString7 = parcel.readString();
                Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                MediaRestrictionDto mediaRestrictionDto = (MediaRestrictionDto) parcel.readParcelable(NewsfeedCommentsItemTypePhotoDto.class.getClassLoader());
                BaseRepostsInfoDto baseRepostsInfoDto = (BaseRepostsInfoDto) parcel.readParcelable(NewsfeedCommentsItemTypePhotoDto.class.getClassLoader());
                BaseObjectCountDto baseObjectCountDto = (BaseObjectCountDto) parcel.readParcelable(NewsfeedCommentsItemTypePhotoDto.class.getClassLoader());
                PhotosImageDto photosImageDto2 = (PhotosImageDto) parcel.readParcelable(NewsfeedCommentsItemTypePhotoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto2 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypePhotoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto3 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypePhotoDto.class.getClassLoader());
                BasePropertyExistsDto basePropertyExistsDto2 = (BasePropertyExistsDto) parcel.readParcelable(NewsfeedCommentsItemTypePhotoDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                    arrayList7 = null;
                } else {
                    valueOf2 = Integer.valueOf(parcel.readInt());
                    arrayList7 = null;
                }
                ArrayList arrayList11 = arrayList5;
                int i10 = i3;
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                if (parcel.readInt() == 0) {
                    basePropertyExistsDto = basePropertyExistsDto2;
                    createFromParcel = arrayList7;
                } else {
                    basePropertyExistsDto = basePropertyExistsDto2;
                    createFromParcel = VerticalAlignDto.CREATOR.createFromParcel(parcel);
                }
                VerticalAlignDto verticalAlignDto = (VerticalAlignDto) createFromParcel;
                PhotosImageDto photosImageDto3 = (PhotosImageDto) parcel.readParcelable(NewsfeedCommentsItemTypePhotoDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    obj = arrayList7;
                } else {
                    obj = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString10 = parcel.readString();
                Object valueOf8 = parcel.readInt() == 0 ? arrayList7 : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    nftGetListItemDto = nftGetListItemDto2;
                    i4 = i10;
                    arrayList8 = arrayList7;
                    photosImageDto = photosImageDto3;
                } else {
                    photosImageDto = photosImageDto3;
                    int readInt8 = parcel.readInt();
                    nftGetListItemDto = nftGetListItemDto2;
                    arrayList8 = new ArrayList(readInt8);
                    i4 = i10;
                    int i11 = 0;
                    while (i11 != readInt8) {
                        i11 = bo.b(NewsfeedCommentsItemTypePhotoDto.class, parcel, arrayList8, i11, 1);
                        readInt8 = readInt8;
                    }
                }
                return new NewsfeedCommentsItemTypePhotoDto(i9, i2, i4, userId3, z, newsfeedNewsfeedItemTypeDto, createFromParcel2, baseLikesDto, readString, num, arrayList, f, f2, readString2, readString3, baseBoolIntDto, readString4, num2, arrayList10, arrayList6, arrayList11, readString5, readString6, nftGetListItemDto, userId4, readString7, valueOf7, mediaRestrictionDto, baseRepostsInfoDto, baseObjectCountDto, photosImageDto2, baseBoolIntDto2, baseBoolIntDto3, basePropertyExistsDto, valueOf, valueOf2, readString8, readString9, verticalAlignDto, photosImageDto, obj, readString10, valueOf8, arrayList8, (UserId) parcel.readParcelable(NewsfeedCommentsItemTypePhotoDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedCommentsItemTypePhotoDto[] newArray(int i) {
                return new NewsfeedCommentsItemTypePhotoDto[i];
            }
        }

        public /* synthetic */ NewsfeedCommentsItemTypePhotoDto(int i, int i2, int i3, UserId userId, boolean z, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, NewsfeedCommentsBaseDto newsfeedCommentsBaseDto, BaseLikesDto baseLikesDto, String str, Integer num, List list, Float f, Float f2, String str2, String str3, BaseBoolIntDto baseBoolIntDto, String str4, Integer num2, List list2, List list3, List list4, String str5, String str6, NftGetListItemDto nftGetListItemDto, UserId userId2, String str7, Integer num3, MediaRestrictionDto mediaRestrictionDto, BaseRepostsInfoDto baseRepostsInfoDto, BaseObjectCountDto baseObjectCountDto, PhotosImageDto photosImageDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BasePropertyExistsDto basePropertyExistsDto, Boolean bool, Integer num4, String str8, String str9, VerticalAlignDto verticalAlignDto, PhotosImageDto photosImageDto2, Boolean bool2, String str10, Integer num5, List list5, UserId userId3, int i4, int i5, zcl zclVar) {
            this(i, i2, i3, userId, z, newsfeedNewsfeedItemTypeDto, (i4 & 64) != 0 ? null : newsfeedCommentsBaseDto, (i4 & 128) != 0 ? null : baseLikesDto, (i4 & 256) != 0 ? null : str, (i4 & 512) != 0 ? null : num, (i4 & 1024) != 0 ? null : list, (i4 & 2048) != 0 ? null : f, (i4 & 4096) != 0 ? null : f2, (i4 & 8192) != 0 ? null : str2, (i4 & 16384) != 0 ? null : str3, (32768 & i4) != 0 ? null : baseBoolIntDto, (65536 & i4) != 0 ? null : str4, (131072 & i4) != 0 ? null : num2, (262144 & i4) != 0 ? null : list2, (524288 & i4) != 0 ? null : list3, (1048576 & i4) != 0 ? null : list4, (2097152 & i4) != 0 ? null : str5, (4194304 & i4) != 0 ? null : str6, (8388608 & i4) != 0 ? null : nftGetListItemDto, (16777216 & i4) != 0 ? null : userId2, (33554432 & i4) != 0 ? null : str7, (67108864 & i4) != 0 ? null : num3, (134217728 & i4) != 0 ? null : mediaRestrictionDto, (268435456 & i4) != 0 ? null : baseRepostsInfoDto, (536870912 & i4) != 0 ? null : baseObjectCountDto, (1073741824 & i4) != 0 ? null : photosImageDto, (i4 & Integer.MIN_VALUE) != 0 ? null : baseBoolIntDto2, (i5 & 1) != 0 ? null : baseBoolIntDto3, (i5 & 2) != 0 ? null : basePropertyExistsDto, (i5 & 4) != 0 ? null : bool, (i5 & 8) != 0 ? null : num4, (i5 & 16) != 0 ? null : str8, (i5 & 32) != 0 ? null : str9, (i5 & 64) != 0 ? null : verticalAlignDto, (i5 & 128) != 0 ? null : photosImageDto2, (i5 & 256) != 0 ? null : bool2, (i5 & 512) != 0 ? null : str10, (i5 & 1024) != 0 ? null : num5, (i5 & 2048) != 0 ? null : list5, (i5 & 4096) != 0 ? null : userId3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedCommentsItemTypePhotoDto)) {
                return false;
            }
            NewsfeedCommentsItemTypePhotoDto newsfeedCommentsItemTypePhotoDto = (NewsfeedCommentsItemTypePhotoDto) obj;
            return this.albumId == newsfeedCommentsItemTypePhotoDto.albumId && this.date == newsfeedCommentsItemTypePhotoDto.date && this.id == newsfeedCommentsItemTypePhotoDto.id && epx.f(this.ownerId, newsfeedCommentsItemTypePhotoDto.ownerId) && this.hasTags == newsfeedCommentsItemTypePhotoDto.hasTags && this.type == newsfeedCommentsItemTypePhotoDto.type && epx.f(this.comments, newsfeedCommentsItemTypePhotoDto.comments) && epx.f(this.likes, newsfeedCommentsItemTypePhotoDto.likes) && epx.f(this.accessKey, newsfeedCommentsItemTypePhotoDto.accessKey) && epx.f(this.height, newsfeedCommentsItemTypePhotoDto.height) && epx.f(this.images, newsfeedCommentsItemTypePhotoDto.images) && epx.f(this.lat, newsfeedCommentsItemTypePhotoDto.lat) && epx.f(this.f11long, newsfeedCommentsItemTypePhotoDto.f11long) && epx.f(this.photo256, newsfeedCommentsItemTypePhotoDto.photo256) && epx.f(this.thumbHash, newsfeedCommentsItemTypePhotoDto.thumbHash) && this.canComment == newsfeedCommentsItemTypePhotoDto.canComment && epx.f(this.place, newsfeedCommentsItemTypePhotoDto.place) && epx.f(this.postId, newsfeedCommentsItemTypePhotoDto.postId) && epx.f(this.cropData, newsfeedCommentsItemTypePhotoDto.cropData) && epx.f(this.sizes, newsfeedCommentsItemTypePhotoDto.sizes) && epx.f(this.blurredSizes, newsfeedCommentsItemTypePhotoDto.blurredSizes) && epx.f(this.squareCrop, newsfeedCommentsItemTypePhotoDto.squareCrop) && epx.f(this.text, newsfeedCommentsItemTypePhotoDto.text) && epx.f(this.nft, newsfeedCommentsItemTypePhotoDto.nft) && epx.f(this.userId, newsfeedCommentsItemTypePhotoDto.userId) && epx.f(this.webViewToken, newsfeedCommentsItemTypePhotoDto.webViewToken) && epx.f(this.width, newsfeedCommentsItemTypePhotoDto.width) && epx.f(this.restrictions, newsfeedCommentsItemTypePhotoDto.restrictions) && epx.f(this.reposts, newsfeedCommentsItemTypePhotoDto.reposts) && epx.f(this.tags, newsfeedCommentsItemTypePhotoDto.tags) && epx.f(this.origPhoto, newsfeedCommentsItemTypePhotoDto.origPhoto) && this.canBeOwnerPhoto == newsfeedCommentsItemTypePhotoDto.canBeOwnerPhoto && this.canRepost == newsfeedCommentsItemTypePhotoDto.canRepost && this.hidden == newsfeedCommentsItemTypePhotoDto.hidden && epx.f(this.feedPinned, newsfeedCommentsItemTypePhotoDto.feedPinned) && epx.f(this.realOffset, newsfeedCommentsItemTypePhotoDto.realOffset) && epx.f(this.srcSmall, newsfeedCommentsItemTypePhotoDto.srcSmall) && epx.f(this.srcBig, newsfeedCommentsItemTypePhotoDto.srcBig) && this.verticalAlign == newsfeedCommentsItemTypePhotoDto.verticalAlign && epx.f(this.photoBeforeCrop, newsfeedCommentsItemTypePhotoDto.photoBeforeCrop) && epx.f(this.isDonut, newsfeedCommentsItemTypePhotoDto.isDonut) && epx.f(this.blurMask, newsfeedCommentsItemTypePhotoDto.blurMask) && epx.f(this.blurredId, newsfeedCommentsItemTypePhotoDto.blurredId) && epx.f(this.contentTags, newsfeedCommentsItemTypePhotoDto.contentTags) && epx.f(this.sourceId, newsfeedCommentsItemTypePhotoDto.sourceId);
        }

        public final int hashCode() {
            int hashCode = (this.type.hashCode() + qoy.b(bh10.a(shy.a(this.id, shy.a(this.date, Integer.hashCode(this.albumId) * 31, 31), 31), 31, this.ownerId.b), 31, this.hasTags)) * 31;
            NewsfeedCommentsBaseDto newsfeedCommentsBaseDto = this.comments;
            int hashCode2 = (hashCode + (newsfeedCommentsBaseDto == null ? 0 : newsfeedCommentsBaseDto.hashCode())) * 31;
            BaseLikesDto baseLikesDto = this.likes;
            int hashCode3 = (hashCode2 + (baseLikesDto == null ? 0 : baseLikesDto.hashCode())) * 31;
            String str = this.accessKey;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.height;
            int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            List<PhotosImageDto> list = this.images;
            int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            Float f = this.lat;
            int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
            Float f2 = this.f11long;
            int hashCode8 = (hashCode7 + (f2 == null ? 0 : f2.hashCode())) * 31;
            String str2 = this.photo256;
            int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.thumbHash;
            int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto = this.canComment;
            int hashCode11 = (hashCode10 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
            String str4 = this.place;
            int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num2 = this.postId;
            int hashCode13 = (hashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
            List<Integer> list2 = this.cropData;
            int hashCode14 = (hashCode13 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<PhotosPhotoSizesDto> list3 = this.sizes;
            int hashCode15 = (hashCode14 + (list3 == null ? 0 : list3.hashCode())) * 31;
            List<PhotosPhotoSizesDto> list4 = this.blurredSizes;
            int hashCode16 = (hashCode15 + (list4 == null ? 0 : list4.hashCode())) * 31;
            String str5 = this.squareCrop;
            int hashCode17 = (hashCode16 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.text;
            int hashCode18 = (hashCode17 + (str6 == null ? 0 : str6.hashCode())) * 31;
            NftGetListItemDto nftGetListItemDto = this.nft;
            int hashCode19 = (hashCode18 + (nftGetListItemDto == null ? 0 : nftGetListItemDto.hashCode())) * 31;
            UserId userId = this.userId;
            int hashCode20 = (hashCode19 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            String str7 = this.webViewToken;
            int hashCode21 = (hashCode20 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Integer num3 = this.width;
            int hashCode22 = (hashCode21 + (num3 == null ? 0 : num3.hashCode())) * 31;
            MediaRestrictionDto mediaRestrictionDto = this.restrictions;
            int hashCode23 = (hashCode22 + (mediaRestrictionDto == null ? 0 : mediaRestrictionDto.hashCode())) * 31;
            BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
            int hashCode24 = (hashCode23 + (baseRepostsInfoDto == null ? 0 : baseRepostsInfoDto.hashCode())) * 31;
            BaseObjectCountDto baseObjectCountDto = this.tags;
            int hashCode25 = (hashCode24 + (baseObjectCountDto == null ? 0 : baseObjectCountDto.hashCode())) * 31;
            PhotosImageDto photosImageDto = this.origPhoto;
            int hashCode26 = (hashCode25 + (photosImageDto == null ? 0 : photosImageDto.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto2 = this.canBeOwnerPhoto;
            int hashCode27 = (hashCode26 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto3 = this.canRepost;
            int hashCode28 = (hashCode27 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
            BasePropertyExistsDto basePropertyExistsDto = this.hidden;
            int hashCode29 = (hashCode28 + (basePropertyExistsDto == null ? 0 : basePropertyExistsDto.hashCode())) * 31;
            Boolean bool = this.feedPinned;
            int hashCode30 = (hashCode29 + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num4 = this.realOffset;
            int hashCode31 = (hashCode30 + (num4 == null ? 0 : num4.hashCode())) * 31;
            String str8 = this.srcSmall;
            int hashCode32 = (hashCode31 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.srcBig;
            int hashCode33 = (hashCode32 + (str9 == null ? 0 : str9.hashCode())) * 31;
            VerticalAlignDto verticalAlignDto = this.verticalAlign;
            int hashCode34 = (hashCode33 + (verticalAlignDto == null ? 0 : verticalAlignDto.hashCode())) * 31;
            PhotosImageDto photosImageDto2 = this.photoBeforeCrop;
            int hashCode35 = (hashCode34 + (photosImageDto2 == null ? 0 : photosImageDto2.hashCode())) * 31;
            Boolean bool2 = this.isDonut;
            int hashCode36 = (hashCode35 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str10 = this.blurMask;
            int hashCode37 = (hashCode36 + (str10 == null ? 0 : str10.hashCode())) * 31;
            Integer num5 = this.blurredId;
            int hashCode38 = (hashCode37 + (num5 == null ? 0 : num5.hashCode())) * 31;
            List<TagsObjectTagDto> list5 = this.contentTags;
            int hashCode39 = (hashCode38 + (list5 == null ? 0 : list5.hashCode())) * 31;
            UserId userId2 = this.sourceId;
            return hashCode39 + (userId2 != null ? Long.hashCode(userId2.b) : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedCommentsItemTypePhotoDto(albumId=");
            sb.append(this.albumId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", id=");
            sb.append(this.id);
            sb.append(", ownerId=");
            sb.append(this.ownerId);
            sb.append(", hasTags=");
            sb.append(this.hasTags);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", comments=");
            sb.append(this.comments);
            sb.append(", likes=");
            sb.append(this.likes);
            sb.append(", accessKey=");
            sb.append(this.accessKey);
            sb.append(", height=");
            sb.append(this.height);
            sb.append(", images=");
            sb.append(this.images);
            sb.append(", lat=");
            sb.append(this.lat);
            sb.append(", long=");
            sb.append(this.f11long);
            sb.append(", photo256=");
            sb.append(this.photo256);
            sb.append(", thumbHash=");
            sb.append(this.thumbHash);
            sb.append(", canComment=");
            sb.append(this.canComment);
            sb.append(", place=");
            sb.append(this.place);
            sb.append(", postId=");
            sb.append(this.postId);
            sb.append(", cropData=");
            sb.append(this.cropData);
            sb.append(", sizes=");
            sb.append(this.sizes);
            sb.append(", blurredSizes=");
            sb.append(this.blurredSizes);
            sb.append(", squareCrop=");
            sb.append(this.squareCrop);
            sb.append(", text=");
            sb.append(this.text);
            sb.append(", nft=");
            sb.append(this.nft);
            sb.append(", userId=");
            sb.append(this.userId);
            sb.append(", webViewToken=");
            sb.append(this.webViewToken);
            sb.append(", width=");
            sb.append(this.width);
            sb.append(", restrictions=");
            sb.append(this.restrictions);
            sb.append(", reposts=");
            sb.append(this.reposts);
            sb.append(", tags=");
            sb.append(this.tags);
            sb.append(", origPhoto=");
            sb.append(this.origPhoto);
            sb.append(", canBeOwnerPhoto=");
            sb.append(this.canBeOwnerPhoto);
            sb.append(", canRepost=");
            sb.append(this.canRepost);
            sb.append(", hidden=");
            sb.append(this.hidden);
            sb.append(", feedPinned=");
            sb.append(this.feedPinned);
            sb.append(", realOffset=");
            sb.append(this.realOffset);
            sb.append(", srcSmall=");
            sb.append(this.srcSmall);
            sb.append(", srcBig=");
            sb.append(this.srcBig);
            sb.append(", verticalAlign=");
            sb.append(this.verticalAlign);
            sb.append(", photoBeforeCrop=");
            sb.append(this.photoBeforeCrop);
            sb.append(", isDonut=");
            sb.append(this.isDonut);
            sb.append(", blurMask=");
            sb.append(this.blurMask);
            sb.append(", blurredId=");
            sb.append(this.blurredId);
            sb.append(", contentTags=");
            sb.append(this.contentTags);
            sb.append(", sourceId=");
            return gp.b(sb, this.sourceId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.albumId);
            parcel.writeInt(this.date);
            parcel.writeInt(this.id);
            parcel.writeParcelable(this.ownerId, i);
            parcel.writeInt(this.hasTags ? 1 : 0);
            parcel.writeParcelable(this.type, i);
            NewsfeedCommentsBaseDto newsfeedCommentsBaseDto = this.comments;
            if (newsfeedCommentsBaseDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedCommentsBaseDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.likes, i);
            parcel.writeString(this.accessKey);
            Integer num = this.height;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            List<PhotosImageDto> list = this.images;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    parcel.writeParcelable((Parcelable) f.next(), i);
                }
            }
            Float f2 = this.lat;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            Float f3 = this.f11long;
            if (f3 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f3);
            }
            parcel.writeString(this.photo256);
            parcel.writeString(this.thumbHash);
            parcel.writeParcelable(this.canComment, i);
            parcel.writeString(this.place);
            Integer num2 = this.postId;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num2);
            }
            List<Integer> list2 = this.cropData;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f4 = dn.f(parcel, list2, 1);
                while (f4.hasNext()) {
                    parcel.writeInt(((Number) f4.next()).intValue());
                }
            }
            List<PhotosPhotoSizesDto> list3 = this.sizes;
            if (list3 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f5 = dn.f(parcel, list3, 1);
                while (f5.hasNext()) {
                    parcel.writeParcelable((Parcelable) f5.next(), i);
                }
            }
            List<PhotosPhotoSizesDto> list4 = this.blurredSizes;
            if (list4 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f6 = dn.f(parcel, list4, 1);
                while (f6.hasNext()) {
                    parcel.writeParcelable((Parcelable) f6.next(), i);
                }
            }
            parcel.writeString(this.squareCrop);
            parcel.writeString(this.text);
            parcel.writeParcelable(this.nft, i);
            parcel.writeParcelable(this.userId, i);
            parcel.writeString(this.webViewToken);
            Integer num3 = this.width;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num3);
            }
            parcel.writeParcelable(this.restrictions, i);
            parcel.writeParcelable(this.reposts, i);
            parcel.writeParcelable(this.tags, i);
            parcel.writeParcelable(this.origPhoto, i);
            parcel.writeParcelable(this.canBeOwnerPhoto, i);
            parcel.writeParcelable(this.canRepost, i);
            parcel.writeParcelable(this.hidden, i);
            Boolean bool = this.feedPinned;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Integer num4 = this.realOffset;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num4);
            }
            parcel.writeString(this.srcSmall);
            parcel.writeString(this.srcBig);
            VerticalAlignDto verticalAlignDto = this.verticalAlign;
            if (verticalAlignDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                verticalAlignDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.photoBeforeCrop, i);
            Boolean bool2 = this.isDonut;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeString(this.blurMask);
            Integer num5 = this.blurredId;
            if (num5 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num5);
            }
            List<TagsObjectTagDto> list5 = this.contentTags;
            if (list5 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f7 = dn.f(parcel, list5, 1);
                while (f7.hasNext()) {
                    parcel.writeParcelable((Parcelable) f7.next(), i);
                }
            }
            parcel.writeParcelable(this.sourceId, i);
        }

        public NewsfeedCommentsItemTypePhotoDto(int i, int i2, int i3, UserId userId, boolean z, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, NewsfeedCommentsBaseDto newsfeedCommentsBaseDto, BaseLikesDto baseLikesDto, String str, Integer num, List<PhotosImageDto> list, Float f, Float f2, String str2, String str3, BaseBoolIntDto baseBoolIntDto, String str4, Integer num2, List<Integer> list2, List<PhotosPhotoSizesDto> list3, List<PhotosPhotoSizesDto> list4, String str5, String str6, NftGetListItemDto nftGetListItemDto, UserId userId2, String str7, Integer num3, MediaRestrictionDto mediaRestrictionDto, BaseRepostsInfoDto baseRepostsInfoDto, BaseObjectCountDto baseObjectCountDto, PhotosImageDto photosImageDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BasePropertyExistsDto basePropertyExistsDto, Boolean bool, Integer num4, String str8, String str9, VerticalAlignDto verticalAlignDto, PhotosImageDto photosImageDto2, Boolean bool2, String str10, Integer num5, List<TagsObjectTagDto> list5, UserId userId3) {
            super(null);
            this.albumId = i;
            this.date = i2;
            this.id = i3;
            this.ownerId = userId;
            this.hasTags = z;
            this.type = newsfeedNewsfeedItemTypeDto;
            this.comments = newsfeedCommentsBaseDto;
            this.likes = baseLikesDto;
            this.accessKey = str;
            this.height = num;
            this.images = list;
            this.lat = f;
            this.f11long = f2;
            this.photo256 = str2;
            this.thumbHash = str3;
            this.canComment = baseBoolIntDto;
            this.place = str4;
            this.postId = num2;
            this.cropData = list2;
            this.sizes = list3;
            this.blurredSizes = list4;
            this.squareCrop = str5;
            this.text = str6;
            this.nft = nftGetListItemDto;
            this.userId = userId2;
            this.webViewToken = str7;
            this.width = num3;
            this.restrictions = mediaRestrictionDto;
            this.reposts = baseRepostsInfoDto;
            this.tags = baseObjectCountDto;
            this.origPhoto = photosImageDto;
            this.canBeOwnerPhoto = baseBoolIntDto2;
            this.canRepost = baseBoolIntDto3;
            this.hidden = basePropertyExistsDto;
            this.feedPinned = bool;
            this.realOffset = num4;
            this.srcSmall = str8;
            this.srcBig = str9;
            this.verticalAlign = verticalAlignDto;
            this.photoBeforeCrop = photosImageDto2;
            this.isDonut = bool2;
            this.blurMask = str10;
            this.blurredId = num5;
            this.contentTags = list5;
            this.sourceId = userId3;
        }
    }

    /* compiled from: NewsfeedCommentsItemDto.kt */
    public static final class NewsfeedCommentsItemTypePostDto extends NewsfeedCommentsItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedCommentsItemTypePostDto> CREATOR = new a();

        @pmi0("access_key")
        private final String accessKey;

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("ad_data")
        private final String adData;

        @pmi0("ad_moderation_checksum")
        private final String adModerationChecksum;

        @pmi0("ads_easy_promote")
        private final WallWallpostAdsEasyPromoteDto adsEasyPromote;

        @pmi0("ads_easy_promote_three_dots")
        private final Boolean adsEasyPromoteThreeDots;

        @pmi0("attachments")
        private final List<WallWallpostAttachmentDto> attachments;

        @pmi0("attachments_meta")
        private final WallWallpostAttachmentsMetaDto attachmentsMeta;

        @pmi0("author_ad")
        private final AdsAdvertiserInfoDto authorAd;

        @pmi0("away_params")
        private final Object awayParams;

        @pmi0("badge_id")
        private final Integer badgeId;

        @pmi0("badge_info")
        private final BadgesCommentInfoDto badgeInfo;

        @pmi0("badges")
        private final BadgesObjectInfoDto badges;

        @pmi0("best_friends_only")
        private final BaseBoolIntDto bestFriendsOnly;

        @pmi0("bottom_extension")
        private final BaseBottomExtensionDto bottomExtension;

        @pmi0("can_archive")
        private final Boolean canArchive;

        @pmi0("can_delete")
        private final BaseBoolIntDto canDelete;

        @pmi0("can_doubt_category")
        private final Boolean canDoubtCategory;

        @pmi0("can_edit")
        private final BaseBoolIntDto canEdit;

        @pmi0("can_pin")
        private final BaseBoolIntDto canPin;

        @pmi0("can_publish")
        private final BaseBoolIntDto canPublish;

        @pmi0("can_set_category")
        private final Boolean canSetCategory;

        @pmi0("can_view_stats")
        private final BaseBoolIntDto canViewStats;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("carousel_offset")
        private final Integer carouselOffset;

        @pmi0("category_action")
        private final WallWallpostCategoryActionDto categoryAction;

        @pmi0("check_sign")
        private final Boolean checkSign;

        @pmi0("comments")
        private final NewsfeedCommentsBaseDto comments;

        @pmi0("compact_attachments_before_cut")
        private final Integer compactAttachmentsBeforeCut;

        @pmi0("content_layout")
        private final List<WallWallpostContentLayoutItemDto> contentLayout;

        @pmi0("coowners")
        private final WallCoownersDto coowners;

        @pmi0("copy_history")
        private final List<WallWallpostFullDto> copyHistory;

        @pmi0("copyright")
        private final WallPostCopyrightDto copyright;

        @pmi0("created_by")
        private final UserId createdBy;

        @pmi0("date")
        private final Integer date;

        @pmi0("deleted_details")
        private final String deletedDetails;

        @pmi0("deleted_reason")
        private final String deletedReason;

        @pmi0("donut")
        private final WallWallpostDonutDto donut;

        @pmi0("donut_badge_info")
        private final BadgesDonutInfoDto donutBadgeInfo;

        @pmi0("donut_miniapp_url")
        private final String donutMiniappUrl;

        @pmi0("edited")
        private final Integer edited;

        @pmi0("facebook_export")
        private final Integer facebookExport;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("final_post")
        private final BaseBoolIntDto finalPost;

        @pmi0("friends_only")
        private final BaseBoolIntDto friendsOnly;

        @pmi0("from_id")
        private final UserId fromId;

        @pmi0("geo")
        private final WallGeoDto geo;

        @pmi0("has_market_link")
        private final Boolean hasMarketLink;

        @pmi0("has_translation")
        private final Boolean hasTranslation;

        @pmi0("has_video_autoplay")
        private final Boolean hasVideoAutoplay;

        @pmi0("hash")
        private final String hash;

        @pmi0("header")
        private final NewsfeedNewsfeedItemHeaderDto header;

        @pmi0("hide_likes")
        private final Boolean hideLikes;

        @pmi0("id")
        private final Integer id;

        @pmi0("inner_type")
        private final InnerTypeDto innerType;

        @pmi0("is_added_to_main_tab")
        private final Boolean isAddedToMainTab;

        @pmi0("is_archived")
        private final Boolean isArchived;

        @pmi0("is_blacklisted")
        private final Boolean isBlacklisted;

        @pmi0("is_deleted")
        private final Boolean isDeleted;

        @pmi0("is_favorite")
        private final Boolean isFavorite;

        @pmi0("is_from_private_group")
        private final Boolean isFromPrivateGroup;

        @pmi0("is_pinned")
        private final BaseBoolIntDto isPinned;

        @pmi0("is_promoted_post_stealth")
        private final Boolean isPromotedPostStealth;

        @pmi0("likes")
        private final BaseLikesInfoDto likes;

        @pmi0("marked_as_ads")
        private final BaseBoolIntDto markedAsAds;

        @pmi0("marked_as_author_ad")
        private final Boolean markedAsAuthorAd;

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("parents_stack")
        private final List<Integer> parentsStack;

        @pmi0("post_author_data")
        private final WallWallpostAuthorDataDto postAuthorData;

        @pmi0("post_id")
        private final Integer postId;

        @pmi0("post_source")
        private final WallPostSourceDto postSource;

        @pmi0("post_type")
        private final WallPostTypeDto postType;

        @pmi0("poster")
        private final WallPosterDto poster;

        @pmi0("postponed_id")
        private final Integer postponedId;

        @pmi0("push_subscription")
        private final WallPushSubscriptionDto pushSubscription;

        @pmi0(CampaignEx.JSON_KEY_STAR)
        private final WallWallpostRatingDto rating;

        @pmi0("reaction_set_id")
        private final String reactionSetId;

        @pmi0("reactions")
        private final LikesItemReactionsDto reactions;

        @pmi0("reply_count")
        private final Integer replyCount;

        @pmi0("reply_owner_id")
        private final UserId replyOwnerId;

        @pmi0("reply_post_id")
        private final Integer replyPostId;

        @pmi0("reply_to")
        private final UserId replyTo;

        @pmi0("reposts")
        private final BaseRepostsInfoDto reposts;

        @pmi0("research")
        private final NewsfeedMediascopeResearchDto research;

        @pmi0("share_url")
        private final String shareUrl;

        @pmi0("sharing")
        private final WallSharingDto sharing;

        @pmi0("short_attach_count")
        private final Integer shortAttachCount;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("signer_id")
        private final UserId signerId;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("text")
        private final String text;

        @pmi0("thumbs_max_height")
        private final Float thumbsMaxHeight;

        @pmi0("to_id")
        private final UserId toId;

        @pmi0("topic_id")
        private final TopicIdDto topicId;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("translation_lang")
        private final String translationLang;

        @pmi0("trending")
        private final Boolean trending;

        @pmi0("twitter_export")
        private final Integer twitterExport;

        @pmi0("type")
        private final WallPostTypeDto type;

        @pmi0("views")
        private final WallViewsDto views;

        @pmi0("zoom_text")
        private final Boolean zoomText;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedCommentsItemDto.kt */
        public static final class InnerTypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ InnerTypeDto[] $VALUES;
            public static final Parcelable.Creator<InnerTypeDto> CREATOR;

            @pmi0("wall_wallpost")
            public static final InnerTypeDto WALL_WALLPOST;
            private final String value;

            /* compiled from: NewsfeedCommentsItemDto.kt */
            public static final class a implements Parcelable.Creator<InnerTypeDto> {
                @Override // android.os.Parcelable.Creator
                public final InnerTypeDto createFromParcel(Parcel parcel) {
                    return InnerTypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final InnerTypeDto[] newArray(int i) {
                    return new InnerTypeDto[i];
                }
            }

            static {
                InnerTypeDto innerTypeDto = new InnerTypeDto("WALL_WALLPOST", 0, "wall_wallpost");
                WALL_WALLPOST = innerTypeDto;
                InnerTypeDto[] innerTypeDtoArr = {innerTypeDto};
                $VALUES = innerTypeDtoArr;
                $ENTRIES = new asp(innerTypeDtoArr);
                CREATOR = new a();
            }

            private InnerTypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static InnerTypeDto valueOf(String str) {
                return (InnerTypeDto) Enum.valueOf(InnerTypeDto.class, str);
            }

            public static InnerTypeDto[] values() {
                return (InnerTypeDto[]) $VALUES.clone();
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

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedCommentsItemDto.kt */
        public static final class TopicIdDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TopicIdDto[] $VALUES;

            @pmi0("1")
            public static final TopicIdDto ART;
            public static final Parcelable.Creator<TopicIdDto> CREATOR;

            @pmi0("0")
            public static final TopicIdDto EMPTY_TOPIC;

            @pmi0("43")
            public static final TopicIdDto FASHION;

            @pmi0("12")
            public static final TopicIdDto GAMES;

            @pmi0("32")
            public static final TopicIdDto HUMOR;

            @pmi0(Gc.e)
            public static final TopicIdDto IT;

            @pmi0("16")
            public static final TopicIdDto MUSIC;

            @pmi0("19")
            public static final TopicIdDto PHOTO;

            @pmi0("21")
            public static final TopicIdDto SCIENCE_AND_TECH;

            @pmi0("23")
            public static final TopicIdDto SPORT;

            @pmi0("25")
            public static final TopicIdDto TRAVEL;

            @pmi0("26")
            public static final TopicIdDto TV_AND_CINEMA;
            private final int value;

            /* compiled from: NewsfeedCommentsItemDto.kt */
            public static final class a implements Parcelable.Creator<TopicIdDto> {
                @Override // android.os.Parcelable.Creator
                public final TopicIdDto createFromParcel(Parcel parcel) {
                    return TopicIdDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TopicIdDto[] newArray(int i) {
                    return new TopicIdDto[i];
                }
            }

            static {
                TopicIdDto topicIdDto = new TopicIdDto("EMPTY_TOPIC", 0, 0);
                EMPTY_TOPIC = topicIdDto;
                TopicIdDto topicIdDto2 = new TopicIdDto("ART", 1, 1);
                ART = topicIdDto2;
                TopicIdDto topicIdDto3 = new TopicIdDto("IT", 2, 7);
                IT = topicIdDto3;
                TopicIdDto topicIdDto4 = new TopicIdDto("GAMES", 3, 12);
                GAMES = topicIdDto4;
                TopicIdDto topicIdDto5 = new TopicIdDto("MUSIC", 4, 16);
                MUSIC = topicIdDto5;
                TopicIdDto topicIdDto6 = new TopicIdDto("PHOTO", 5, 19);
                PHOTO = topicIdDto6;
                TopicIdDto topicIdDto7 = new TopicIdDto("SCIENCE_AND_TECH", 6, 21);
                SCIENCE_AND_TECH = topicIdDto7;
                TopicIdDto topicIdDto8 = new TopicIdDto("SPORT", 7, 23);
                SPORT = topicIdDto8;
                TopicIdDto topicIdDto9 = new TopicIdDto("TRAVEL", 8, 25);
                TRAVEL = topicIdDto9;
                TopicIdDto topicIdDto10 = new TopicIdDto("TV_AND_CINEMA", 9, 26);
                TV_AND_CINEMA = topicIdDto10;
                TopicIdDto topicIdDto11 = new TopicIdDto("HUMOR", 10, 32);
                HUMOR = topicIdDto11;
                TopicIdDto topicIdDto12 = new TopicIdDto("FASHION", 11, 43);
                FASHION = topicIdDto12;
                TopicIdDto[] topicIdDtoArr = {topicIdDto, topicIdDto2, topicIdDto3, topicIdDto4, topicIdDto5, topicIdDto6, topicIdDto7, topicIdDto8, topicIdDto9, topicIdDto10, topicIdDto11, topicIdDto12};
                $VALUES = topicIdDtoArr;
                $ENTRIES = new asp(topicIdDtoArr);
                CREATOR = new a();
            }

            private TopicIdDto(String str, int i, int i2) {
                this.value = i2;
            }

            public static TopicIdDto valueOf(String str) {
                return (TopicIdDto) Enum.valueOf(TopicIdDto.class, str);
            }

            public static TopicIdDto[] values() {
                return (TopicIdDto[]) $VALUES.clone();
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

        /* compiled from: NewsfeedCommentsItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedCommentsItemTypePostDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedCommentsItemTypePostDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                ArrayList arrayList;
                Boolean valueOf2;
                Boolean valueOf3;
                BaseBoolIntDto baseBoolIntDto;
                AdsAdvertiserInfoDto createFromParcel;
                Boolean valueOf4;
                Boolean valueOf5;
                WallPostActivityDto wallPostActivityDto;
                WallWallpostRatingDto createFromParcel2;
                Boolean valueOf6;
                Boolean valueOf7;
                WallWallpostRatingDto wallWallpostRatingDto;
                WallWallpostCategoryActionDto createFromParcel3;
                WallWallpostCategoryActionDto wallWallpostCategoryActionDto;
                TopicIdDto createFromParcel4;
                Boolean valueOf8;
                UserId userId;
                WallCoownersDto createFromParcel5;
                Boolean valueOf9;
                Boolean valueOf10;
                Boolean valueOf11;
                Boolean valueOf12;
                Object obj;
                WallPostTypeDto createFromParcel6;
                Boolean valueOf13;
                Boolean valueOf14;
                UserId userId2;
                WallPushSubscriptionDto createFromParcel7;
                WallPushSubscriptionDto wallPushSubscriptionDto;
                WallWallpostAuthorDataDto createFromParcel8;
                WallWallpostAuthorDataDto wallWallpostAuthorDataDto;
                NewsfeedMediascopeResearchDto createFromParcel9;
                Boolean valueOf15;
                Boolean valueOf16;
                Boolean valueOf17;
                NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto;
                InnerTypeDto innerTypeDto;
                ArrayList arrayList2;
                UserId userId3;
                WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto;
                ArrayList arrayList3;
                ArrayList arrayList4;
                Boolean valueOf18;
                BaseBoolIntDto baseBoolIntDto2;
                WallPostCopyrightDto createFromParcel10;
                WallGeoDto wallGeoDto;
                NewsfeedNewsfeedItemHeaderDto createFromParcel11;
                Boolean valueOf19;
                Boolean valueOf20;
                LikesItemReactionsDto likesItemReactionsDto;
                BadgesObjectInfoDto createFromParcel12;
                UserId userId4;
                WallPosterDto createFromParcel13;
                WallPosterDto wallPosterDto;
                ArrayList arrayList5;
                ArrayList arrayList6;
                Integer num;
                UserId userId5;
                WallViewsDto createFromParcel14;
                InnerTypeDto createFromParcel15 = InnerTypeDto.CREATOR.createFromParcel(parcel);
                UserId userId6 = (UserId) parcel.readParcelable(NewsfeedCommentsItemTypePostDto.class.getClassLoader());
                NewsfeedCommentsBaseDto createFromParcel16 = parcel.readInt() == 0 ? null : NewsfeedCommentsBaseDto.CREATOR.createFromParcel(parcel);
                WallWallpostAdsEasyPromoteDto createFromParcel17 = parcel.readInt() == 0 ? null : WallWallpostAdsEasyPromoteDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(WallWallpostFullDto.CREATOR, parcel, arrayList, i, 1);
                    }
                }
                BaseBoolIntDto baseBoolIntDto3 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypePostDto.class.getClassLoader());
                UserId userId7 = (UserId) parcel.readParcelable(NewsfeedCommentsItemTypePostDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto4 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypePostDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto5 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypePostDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto6 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypePostDto.class.getClassLoader());
                WallWallpostDonutDto createFromParcel18 = parcel.readInt() == 0 ? null : WallWallpostDonutDto.CREATOR.createFromParcel(parcel);
                BaseBoolIntDto baseBoolIntDto7 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypePostDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto8 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypePostDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto9 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypePostDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                BaseBoolIntDto baseBoolIntDto10 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypePostDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto11 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypePostDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    baseBoolIntDto = baseBoolIntDto11;
                    createFromParcel = null;
                } else {
                    baseBoolIntDto = baseBoolIntDto11;
                    createFromParcel = AdsAdvertiserInfoDto.CREATOR.createFromParcel(parcel);
                }
                AdsAdvertiserInfoDto adsAdvertiserInfoDto = createFromParcel;
                WallPostActivityDto wallPostActivityDto2 = (WallPostActivityDto) parcel.readParcelable(NewsfeedCommentsItemTypePostDto.class.getClassLoader());
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
                    wallPostActivityDto = wallPostActivityDto2;
                    createFromParcel2 = null;
                } else {
                    wallPostActivityDto = wallPostActivityDto2;
                    createFromParcel2 = WallWallpostRatingDto.CREATOR.createFromParcel(parcel);
                }
                WallWallpostRatingDto wallWallpostRatingDto2 = createFromParcel2;
                if (parcel.readInt() == 0) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf7 = null;
                } else {
                    valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    wallWallpostRatingDto = wallWallpostRatingDto2;
                    createFromParcel3 = null;
                } else {
                    wallWallpostRatingDto = wallWallpostRatingDto2;
                    createFromParcel3 = WallWallpostCategoryActionDto.CREATOR.createFromParcel(parcel);
                }
                WallWallpostCategoryActionDto wallWallpostCategoryActionDto2 = createFromParcel3;
                if (parcel.readInt() == 0) {
                    wallWallpostCategoryActionDto = wallWallpostCategoryActionDto2;
                    createFromParcel4 = null;
                } else {
                    wallWallpostCategoryActionDto = wallWallpostCategoryActionDto2;
                    createFromParcel4 = TopicIdDto.CREATOR.createFromParcel(parcel);
                }
                TopicIdDto topicIdDto = createFromParcel4;
                if (parcel.readInt() == 0) {
                    valueOf8 = null;
                } else {
                    valueOf8 = Boolean.valueOf(parcel.readInt() != 0);
                }
                BaseBottomExtensionDto baseBottomExtensionDto = (BaseBottomExtensionDto) parcel.readParcelable(NewsfeedCommentsItemTypePostDto.class.getClassLoader());
                Float valueOf21 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                Integer valueOf22 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                UserId userId8 = (UserId) parcel.readParcelable(NewsfeedCommentsItemTypePostDto.class.getClassLoader());
                Integer valueOf23 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    userId = userId8;
                    createFromParcel5 = null;
                } else {
                    userId = userId8;
                    createFromParcel5 = WallCoownersDto.CREATOR.createFromParcel(parcel);
                }
                WallCoownersDto wallCoownersDto = createFromParcel5;
                Float valueOf24 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                Boolean bool = valueOf2;
                BaseBoolIntDto baseBoolIntDto12 = baseBoolIntDto;
                Boolean bool2 = valueOf4;
                WallWallpostRatingDto wallWallpostRatingDto3 = wallWallpostRatingDto;
                Boolean bool3 = valueOf8;
                Float f = valueOf21;
                UserId userId9 = userId;
                String readString = parcel.readString();
                Boolean bool4 = valueOf3;
                WallPostActivityDto wallPostActivityDto3 = wallPostActivityDto;
                Boolean bool5 = valueOf7;
                Integer num2 = valueOf22;
                Integer num3 = valueOf23;
                Float f2 = valueOf24;
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedCommentsItemTypePostDto.class.getClassLoader());
                String readString4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf9 = null;
                } else {
                    valueOf9 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Integer valueOf25 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf26 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf27 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    valueOf10 = null;
                } else {
                    valueOf10 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf11 = null;
                } else {
                    valueOf11 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Object readValue = parcel.readValue(NewsfeedCommentsItemTypePostDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf12 = null;
                } else {
                    valueOf12 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    obj = readValue;
                    createFromParcel6 = null;
                } else {
                    obj = readValue;
                    createFromParcel6 = WallPostTypeDto.CREATOR.createFromParcel(parcel);
                }
                WallPostTypeDto wallPostTypeDto = createFromParcel6;
                NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedCommentsItemTypePostDto.class.getClassLoader());
                UserId userId10 = (UserId) parcel.readParcelable(NewsfeedCommentsItemTypePostDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf13 = null;
                } else {
                    valueOf13 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf14 = null;
                } else {
                    valueOf14 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    userId2 = userId10;
                    createFromParcel7 = null;
                } else {
                    userId2 = userId10;
                    createFromParcel7 = WallPushSubscriptionDto.CREATOR.createFromParcel(parcel);
                }
                WallPushSubscriptionDto wallPushSubscriptionDto2 = createFromParcel7;
                if (parcel.readInt() == 0) {
                    wallPushSubscriptionDto = wallPushSubscriptionDto2;
                    createFromParcel8 = null;
                } else {
                    wallPushSubscriptionDto = wallPushSubscriptionDto2;
                    createFromParcel8 = WallWallpostAuthorDataDto.CREATOR.createFromParcel(parcel);
                }
                WallWallpostAuthorDataDto wallWallpostAuthorDataDto2 = createFromParcel8;
                if (parcel.readInt() == 0) {
                    wallWallpostAuthorDataDto = wallWallpostAuthorDataDto2;
                    createFromParcel9 = null;
                } else {
                    wallWallpostAuthorDataDto = wallWallpostAuthorDataDto2;
                    createFromParcel9 = NewsfeedMediascopeResearchDto.CREATOR.createFromParcel(parcel);
                }
                NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto2 = createFromParcel9;
                if (parcel.readInt() == 0) {
                    valueOf15 = null;
                } else {
                    valueOf15 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf16 = null;
                } else {
                    valueOf16 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Boolean bool6 = valueOf13;
                WallPushSubscriptionDto wallPushSubscriptionDto3 = wallPushSubscriptionDto;
                Boolean bool7 = valueOf15;
                String readString5 = parcel.readString();
                Integer valueOf28 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString6 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf17 = null;
                } else {
                    valueOf17 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString7 = parcel.readString();
                Integer num4 = valueOf25;
                Integer num5 = valueOf27;
                Boolean bool8 = valueOf11;
                Boolean bool9 = valueOf12;
                Boolean bool10 = valueOf14;
                WallWallpostAuthorDataDto wallWallpostAuthorDataDto3 = wallWallpostAuthorDataDto;
                Boolean bool11 = valueOf16;
                Integer num6 = valueOf28;
                Boolean bool12 = valueOf17;
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                if (parcel.readInt() == 0) {
                    newsfeedMediascopeResearchDto = newsfeedMediascopeResearchDto2;
                    innerTypeDto = createFromParcel15;
                    userId3 = userId6;
                    arrayList2 = null;
                } else {
                    newsfeedMediascopeResearchDto = newsfeedMediascopeResearchDto2;
                    int readInt2 = parcel.readInt();
                    innerTypeDto = createFromParcel15;
                    arrayList2 = new ArrayList(readInt2);
                    userId3 = userId6;
                    int i2 = 0;
                    while (i2 != readInt2) {
                        i2 = bo.b(NewsfeedCommentsItemTypePostDto.class, parcel, arrayList2, i2, 1);
                        readInt2 = readInt2;
                    }
                }
                WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto2 = (WallWallpostAttachmentsMetaDto) parcel.readParcelable(NewsfeedCommentsItemTypePostDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    wallWallpostAttachmentsMetaDto = wallWallpostAttachmentsMetaDto2;
                    arrayList4 = arrayList2;
                    arrayList3 = null;
                } else {
                    int readInt3 = parcel.readInt();
                    wallWallpostAttachmentsMetaDto = wallWallpostAttachmentsMetaDto2;
                    arrayList3 = new ArrayList(readInt3);
                    arrayList4 = arrayList2;
                    int i3 = 0;
                    while (i3 != readInt3) {
                        i3 = bo.b(NewsfeedCommentsItemTypePostDto.class, parcel, arrayList3, i3, 1);
                        readInt3 = readInt3;
                    }
                }
                Integer valueOf29 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                BadgesCommentInfoDto badgesCommentInfoDto = (BadgesCommentInfoDto) parcel.readParcelable(NewsfeedCommentsItemTypePostDto.class.getClassLoader());
                BadgesDonutInfoDto badgesDonutInfoDto = (BadgesDonutInfoDto) parcel.readParcelable(NewsfeedCommentsItemTypePostDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf18 = null;
                } else {
                    valueOf18 = Boolean.valueOf(parcel.readInt() != 0);
                }
                BaseBoolIntDto baseBoolIntDto13 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypePostDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    baseBoolIntDto2 = baseBoolIntDto13;
                    createFromParcel10 = null;
                } else {
                    baseBoolIntDto2 = baseBoolIntDto13;
                    createFromParcel10 = WallPostCopyrightDto.CREATOR.createFromParcel(parcel);
                }
                WallPostCopyrightDto wallPostCopyrightDto = createFromParcel10;
                Integer valueOf30 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf31 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                WallGeoDto wallGeoDto2 = (WallGeoDto) parcel.readParcelable(NewsfeedCommentsItemTypePostDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    wallGeoDto = wallGeoDto2;
                    createFromParcel11 = null;
                } else {
                    wallGeoDto = wallGeoDto2;
                    createFromParcel11 = NewsfeedNewsfeedItemHeaderDto.CREATOR.createFromParcel(parcel);
                }
                NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = createFromParcel11;
                Integer valueOf32 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    valueOf19 = null;
                } else {
                    valueOf19 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf20 = null;
                } else {
                    valueOf20 = Boolean.valueOf(parcel.readInt() != 0);
                }
                BaseLikesInfoDto baseLikesInfoDto = (BaseLikesInfoDto) parcel.readParcelable(NewsfeedCommentsItemTypePostDto.class.getClassLoader());
                ArrayList arrayList7 = arrayList4;
                Boolean bool13 = valueOf18;
                Integer num7 = valueOf32;
                Boolean bool14 = valueOf20;
                String readString10 = parcel.readString();
                LikesItemReactionsDto likesItemReactionsDto2 = (LikesItemReactionsDto) parcel.readParcelable(NewsfeedCommentsItemTypePostDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    likesItemReactionsDto = likesItemReactionsDto2;
                    createFromParcel12 = null;
                } else {
                    likesItemReactionsDto = likesItemReactionsDto2;
                    createFromParcel12 = BadgesObjectInfoDto.CREATOR.createFromParcel(parcel);
                }
                BadgesObjectInfoDto badgesObjectInfoDto = createFromParcel12;
                UserId userId11 = (UserId) parcel.readParcelable(NewsfeedCommentsItemTypePostDto.class.getClassLoader());
                UserId userId12 = (UserId) parcel.readParcelable(NewsfeedCommentsItemTypePostDto.class.getClassLoader());
                Integer valueOf33 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                UserId userId13 = (UserId) parcel.readParcelable(NewsfeedCommentsItemTypePostDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    userId4 = userId13;
                    createFromParcel13 = null;
                } else {
                    userId4 = userId13;
                    createFromParcel13 = WallPosterDto.CREATOR.createFromParcel(parcel);
                }
                WallPosterDto wallPosterDto2 = createFromParcel13;
                Integer valueOf34 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    wallPosterDto = wallPosterDto2;
                    arrayList5 = arrayList3;
                    num = valueOf29;
                    arrayList6 = null;
                } else {
                    wallPosterDto = wallPosterDto2;
                    int readInt4 = parcel.readInt();
                    arrayList5 = arrayList3;
                    arrayList6 = new ArrayList(readInt4);
                    num = valueOf29;
                    int i4 = 0;
                    while (i4 != readInt4) {
                        i4 = pm0.b(parcel, arrayList6, i4, 1);
                        readInt4 = readInt4;
                    }
                }
                WallPostSourceDto createFromParcel19 = parcel.readInt() == 0 ? null : WallPostSourceDto.CREATOR.createFromParcel(parcel);
                WallPostTypeDto createFromParcel20 = parcel.readInt() == 0 ? null : WallPostTypeDto.CREATOR.createFromParcel(parcel);
                BaseRepostsInfoDto baseRepostsInfoDto = (BaseRepostsInfoDto) parcel.readParcelable(NewsfeedCommentsItemTypePostDto.class.getClassLoader());
                UserId userId14 = (UserId) parcel.readParcelable(NewsfeedCommentsItemTypePostDto.class.getClassLoader());
                String readString11 = parcel.readString();
                if (parcel.readInt() == 0) {
                    userId5 = userId14;
                    createFromParcel14 = null;
                } else {
                    userId5 = userId14;
                    createFromParcel14 = WallViewsDto.CREATOR.createFromParcel(parcel);
                }
                return new NewsfeedCommentsItemTypePostDto(innerTypeDto, userId3, createFromParcel16, createFromParcel17, valueOf, arrayList, baseBoolIntDto3, userId7, baseBoolIntDto4, baseBoolIntDto5, baseBoolIntDto6, createFromParcel18, baseBoolIntDto7, baseBoolIntDto8, baseBoolIntDto9, bool, baseBoolIntDto10, baseBoolIntDto12, bool4, adsAdvertiserInfoDto, wallPostActivityDto3, bool2, valueOf5, wallWallpostRatingDto3, valueOf6, bool5, wallWallpostCategoryActionDto, topicIdDto, bool3, baseBottomExtensionDto, f, num2, userId9, num3, wallCoownersDto, f2, readString, readString2, readString3, newsfeedNewsfeedItemCaptionDto, readString4, valueOf9, num4, valueOf26, num5, valueOf10, bool8, obj, bool9, wallPostTypeDto, newsfeedItemWallpostFeedbackDto, userId2, bool6, bool10, wallPushSubscriptionDto3, wallWallpostAuthorDataDto3, newsfeedMediascopeResearchDto, bool7, bool11, readString5, num6, readString6, bool12, readString7, readString8, readString9, arrayList7, wallWallpostAttachmentsMetaDto, arrayList5, num, badgesCommentInfoDto, badgesDonutInfoDto, bool13, baseBoolIntDto2, wallPostCopyrightDto, valueOf30, valueOf31, wallGeoDto, newsfeedNewsfeedItemHeaderDto, num7, valueOf19, bool14, baseLikesInfoDto, readString10, likesItemReactionsDto, badgesObjectInfoDto, userId11, userId12, valueOf33, userId4, wallPosterDto, valueOf34, arrayList6, createFromParcel19, createFromParcel20, baseRepostsInfoDto, userId5, readString11, createFromParcel14, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : WallSharingDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedCommentsItemTypePostDto[] newArray(int i) {
                return new NewsfeedCommentsItemTypePostDto[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ NewsfeedCommentsItemTypePostDto(InnerTypeDto innerTypeDto, UserId userId, NewsfeedCommentsBaseDto newsfeedCommentsBaseDto, WallWallpostAdsEasyPromoteDto wallWallpostAdsEasyPromoteDto, Boolean bool, List list, BaseBoolIntDto baseBoolIntDto, UserId userId2, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, WallWallpostDonutDto wallWallpostDonutDto, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, Boolean bool2, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, Boolean bool3, AdsAdvertiserInfoDto adsAdvertiserInfoDto, WallPostActivityDto wallPostActivityDto, Boolean bool4, Boolean bool5, WallWallpostRatingDto wallWallpostRatingDto, Boolean bool6, Boolean bool7, WallWallpostCategoryActionDto wallWallpostCategoryActionDto, TopicIdDto topicIdDto, Boolean bool8, BaseBottomExtensionDto baseBottomExtensionDto, Float f, Integer num, UserId userId3, Integer num2, WallCoownersDto wallCoownersDto, Float f2, String str, String str2, String str3, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, String str4, Boolean bool9, Integer num3, Integer num4, Integer num5, Boolean bool10, Boolean bool11, Object obj, Boolean bool12, WallPostTypeDto wallPostTypeDto, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, UserId userId4, Boolean bool13, Boolean bool14, WallPushSubscriptionDto wallPushSubscriptionDto, WallWallpostAuthorDataDto wallWallpostAuthorDataDto, NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto, Boolean bool15, Boolean bool16, String str5, Integer num6, String str6, Boolean bool17, String str7, String str8, String str9, List list2, WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto, List list3, Integer num7, BadgesCommentInfoDto badgesCommentInfoDto, BadgesDonutInfoDto badgesDonutInfoDto, Boolean bool18, BaseBoolIntDto baseBoolIntDto10, WallPostCopyrightDto wallPostCopyrightDto, Integer num8, Integer num9, WallGeoDto wallGeoDto, NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto, Integer num10, Boolean bool19, Boolean bool20, BaseLikesInfoDto baseLikesInfoDto, String str10, LikesItemReactionsDto likesItemReactionsDto, BadgesObjectInfoDto badgesObjectInfoDto, UserId userId5, UserId userId6, Integer num11, UserId userId7, WallPosterDto wallPosterDto, Integer num12, List list4, WallPostSourceDto wallPostSourceDto, WallPostTypeDto wallPostTypeDto2, BaseRepostsInfoDto baseRepostsInfoDto, UserId userId8, String str11, WallViewsDto wallViewsDto, Integer num13, String str12, WallSharingDto wallSharingDto, int i, int i2, int i3, int i4, zcl zclVar) {
            this(innerTypeDto, r86, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r4, r3, r17, r19, r21, r23, r25, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r0, (i2 & 1) != 0 ? null : userId3, (i2 & 2) != 0 ? null : num2, (i2 & 4) != 0 ? null : wallCoownersDto, (i2 & 8) != 0 ? null : f2, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 256) != 0 ? null : str4, (i2 & 512) != 0 ? null : bool9, (i2 & 1024) != 0 ? null : num3, (i2 & 2048) != 0 ? null : num4, (i2 & 4096) != 0 ? null : num5, (i2 & 8192) != 0 ? null : bool10, (i2 & 16384) != 0 ? null : bool11, (i2 & 32768) != 0 ? null : obj, (i2 & 65536) != 0 ? null : bool12, (i2 & 131072) != 0 ? null : wallPostTypeDto, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 524288) != 0 ? null : userId4, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool13, (i2 & 2097152) != 0 ? null : bool14, (i2 & 4194304) != 0 ? null : wallPushSubscriptionDto, (i2 & 8388608) != 0 ? null : wallWallpostAuthorDataDto, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : newsfeedMediascopeResearchDto, (i2 & 33554432) != 0 ? null : bool15, (i2 & 67108864) != 0 ? null : bool16, (i2 & 134217728) != 0 ? null : str5, (i2 & 268435456) != 0 ? null : num6, (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str6, (i2 & 1073741824) != 0 ? null : bool17, (i2 & Integer.MIN_VALUE) != 0 ? null : str7, (i3 & 1) != 0 ? null : str8, (i3 & 2) != 0 ? null : str9, (i3 & 4) != 0 ? null : list2, (i3 & 8) != 0 ? null : wallWallpostAttachmentsMetaDto, (i3 & 16) != 0 ? null : list3, (i3 & 32) != 0 ? null : num7, (i3 & 64) != 0 ? null : badgesCommentInfoDto, (i3 & 128) != 0 ? null : badgesDonutInfoDto, (i3 & 256) != 0 ? null : bool18, (i3 & 512) != 0 ? null : baseBoolIntDto10, (i3 & 1024) != 0 ? null : wallPostCopyrightDto, (i3 & 2048) != 0 ? null : num8, (i3 & 4096) != 0 ? null : num9, (i3 & 8192) != 0 ? null : wallGeoDto, (i3 & 16384) != 0 ? null : newsfeedNewsfeedItemHeaderDto, (i3 & 32768) != 0 ? null : num10, (i3 & 65536) != 0 ? null : bool19, (i3 & 131072) != 0 ? null : bool20, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : baseLikesInfoDto, (i3 & 524288) != 0 ? null : str10, (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : likesItemReactionsDto, (i3 & 2097152) != 0 ? null : badgesObjectInfoDto, (i3 & 4194304) != 0 ? null : userId5, (i3 & 8388608) != 0 ? null : userId6, (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : num11, (i3 & 33554432) != 0 ? null : userId7, (i3 & 67108864) != 0 ? null : wallPosterDto, (i3 & 134217728) != 0 ? null : num12, (i3 & 268435456) != 0 ? null : list4, (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : wallPostSourceDto, (i3 & 1073741824) != 0 ? null : wallPostTypeDto2, (i3 & Integer.MIN_VALUE) != 0 ? null : baseRepostsInfoDto, (i4 & 1) != 0 ? null : userId8, (i4 & 2) != 0 ? null : str11, (i4 & 4) != 0 ? null : wallViewsDto, (i4 & 8) != 0 ? null : num13, (i4 & 16) != 0 ? null : str12, (i4 & 32) != 0 ? null : wallSharingDto);
            UserId userId9 = (i & 2) != 0 ? null : userId;
            NewsfeedCommentsBaseDto newsfeedCommentsBaseDto2 = (i & 4) != 0 ? null : newsfeedCommentsBaseDto;
            WallWallpostAdsEasyPromoteDto wallWallpostAdsEasyPromoteDto2 = (i & 8) != 0 ? null : wallWallpostAdsEasyPromoteDto;
            Boolean bool21 = (i & 16) != 0 ? null : bool;
            List list5 = (i & 32) != 0 ? null : list;
            BaseBoolIntDto baseBoolIntDto11 = (i & 64) != 0 ? null : baseBoolIntDto;
            UserId userId10 = (i & 128) != 0 ? null : userId2;
            BaseBoolIntDto baseBoolIntDto12 = (i & 256) != 0 ? null : baseBoolIntDto2;
            BaseBoolIntDto baseBoolIntDto13 = (i & 512) != 0 ? null : baseBoolIntDto3;
            BaseBoolIntDto baseBoolIntDto14 = (i & 1024) != 0 ? null : baseBoolIntDto4;
            WallWallpostDonutDto wallWallpostDonutDto2 = (i & 2048) != 0 ? null : wallWallpostDonutDto;
            BaseBoolIntDto baseBoolIntDto15 = (i & 4096) != 0 ? null : baseBoolIntDto5;
            BaseBoolIntDto baseBoolIntDto16 = (i & 8192) != 0 ? null : baseBoolIntDto6;
            UserId userId11 = userId9;
            BaseBoolIntDto baseBoolIntDto17 = (i & 16384) != 0 ? null : baseBoolIntDto7;
            Boolean bool22 = (i & 32768) != 0 ? null : bool2;
            BaseBoolIntDto baseBoolIntDto18 = (i & 65536) != 0 ? null : baseBoolIntDto8;
            BaseBoolIntDto baseBoolIntDto19 = (i & 131072) != 0 ? null : baseBoolIntDto9;
            Boolean bool23 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool3;
            AdsAdvertiserInfoDto adsAdvertiserInfoDto2 = (i & 524288) != 0 ? null : adsAdvertiserInfoDto;
            WallPostActivityDto wallPostActivityDto2 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : wallPostActivityDto;
            Boolean bool24 = (i & 2097152) != 0 ? null : bool4;
            Boolean bool25 = (i & 4194304) != 0 ? null : bool5;
            WallWallpostRatingDto wallWallpostRatingDto2 = (i & 8388608) != 0 ? null : wallWallpostRatingDto;
            Boolean bool26 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : bool6;
            Boolean bool27 = (i & 33554432) != 0 ? null : bool7;
            WallWallpostCategoryActionDto wallWallpostCategoryActionDto2 = (i & 67108864) != 0 ? null : wallWallpostCategoryActionDto;
            TopicIdDto topicIdDto2 = (i & 134217728) != 0 ? null : topicIdDto;
            Boolean bool28 = (i & 268435456) != 0 ? null : bool8;
            BaseBottomExtensionDto baseBottomExtensionDto2 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : baseBottomExtensionDto;
            Float f3 = (i & 1073741824) != 0 ? null : f;
            Integer num14 = (i & Integer.MIN_VALUE) != 0 ? null : num;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedCommentsItemTypePostDto)) {
                return false;
            }
            NewsfeedCommentsItemTypePostDto newsfeedCommentsItemTypePostDto = (NewsfeedCommentsItemTypePostDto) obj;
            return this.innerType == newsfeedCommentsItemTypePostDto.innerType && epx.f(this.fromId, newsfeedCommentsItemTypePostDto.fromId) && epx.f(this.comments, newsfeedCommentsItemTypePostDto.comments) && epx.f(this.adsEasyPromote, newsfeedCommentsItemTypePostDto.adsEasyPromote) && epx.f(this.adsEasyPromoteThreeDots, newsfeedCommentsItemTypePostDto.adsEasyPromoteThreeDots) && epx.f(this.copyHistory, newsfeedCommentsItemTypePostDto.copyHistory) && this.canEdit == newsfeedCommentsItemTypePostDto.canEdit && epx.f(this.createdBy, newsfeedCommentsItemTypePostDto.createdBy) && this.canDelete == newsfeedCommentsItemTypePostDto.canDelete && this.canPublish == newsfeedCommentsItemTypePostDto.canPublish && this.canPin == newsfeedCommentsItemTypePostDto.canPin && epx.f(this.donut, newsfeedCommentsItemTypePostDto.donut) && this.friendsOnly == newsfeedCommentsItemTypePostDto.friendsOnly && this.bestFriendsOnly == newsfeedCommentsItemTypePostDto.bestFriendsOnly && this.finalPost == newsfeedCommentsItemTypePostDto.finalPost && epx.f(this.checkSign, newsfeedCommentsItemTypePostDto.checkSign) && this.isPinned == newsfeedCommentsItemTypePostDto.isPinned && this.markedAsAds == newsfeedCommentsItemTypePostDto.markedAsAds && epx.f(this.markedAsAuthorAd, newsfeedCommentsItemTypePostDto.markedAsAuthorAd) && epx.f(this.authorAd, newsfeedCommentsItemTypePostDto.authorAd) && epx.f(this.activity, newsfeedCommentsItemTypePostDto.activity) && epx.f(this.suggestSubscribe, newsfeedCommentsItemTypePostDto.suggestSubscribe) && epx.f(this.zoomText, newsfeedCommentsItemTypePostDto.zoomText) && epx.f(this.rating, newsfeedCommentsItemTypePostDto.rating) && epx.f(this.canSetCategory, newsfeedCommentsItemTypePostDto.canSetCategory) && epx.f(this.canDoubtCategory, newsfeedCommentsItemTypePostDto.canDoubtCategory) && epx.f(this.categoryAction, newsfeedCommentsItemTypePostDto.categoryAction) && this.topicId == newsfeedCommentsItemTypePostDto.topicId && epx.f(this.trending, newsfeedCommentsItemTypePostDto.trending) && epx.f(this.bottomExtension, newsfeedCommentsItemTypePostDto.bottomExtension) && epx.f(this.shortTextRate, newsfeedCommentsItemTypePostDto.shortTextRate) && epx.f(this.shortAttachCount, newsfeedCommentsItemTypePostDto.shortAttachCount) && epx.f(this.sourceId, newsfeedCommentsItemTypePostDto.sourceId) && epx.f(this.compactAttachmentsBeforeCut, newsfeedCommentsItemTypePostDto.compactAttachmentsBeforeCut) && epx.f(this.coowners, newsfeedCommentsItemTypePostDto.coowners) && epx.f(this.thumbsMaxHeight, newsfeedCommentsItemTypePostDto.thumbsMaxHeight) && epx.f(this.hash, newsfeedCommentsItemTypePostDto.hash) && epx.f(this.adData, newsfeedCommentsItemTypePostDto.adData) && epx.f(this.adModerationChecksum, newsfeedCommentsItemTypePostDto.adModerationChecksum) && epx.f(this.caption, newsfeedCommentsItemTypePostDto.caption) && epx.f(this.translationLang, newsfeedCommentsItemTypePostDto.translationLang) && epx.f(this.hasTranslation, newsfeedCommentsItemTypePostDto.hasTranslation) && epx.f(this.facebookExport, newsfeedCommentsItemTypePostDto.facebookExport) && epx.f(this.twitterExport, newsfeedCommentsItemTypePostDto.twitterExport) && epx.f(this.postponedId, newsfeedCommentsItemTypePostDto.postponedId) && epx.f(this.isPromotedPostStealth, newsfeedCommentsItemTypePostDto.isPromotedPostStealth) && epx.f(this.hasVideoAutoplay, newsfeedCommentsItemTypePostDto.hasVideoAutoplay) && epx.f(this.awayParams, newsfeedCommentsItemTypePostDto.awayParams) && epx.f(this.hideLikes, newsfeedCommentsItemTypePostDto.hideLikes) && this.type == newsfeedCommentsItemTypePostDto.type && epx.f(this.feedback, newsfeedCommentsItemTypePostDto.feedback) && epx.f(this.toId, newsfeedCommentsItemTypePostDto.toId) && epx.f(this.hasMarketLink, newsfeedCommentsItemTypePostDto.hasMarketLink) && epx.f(this.isFromPrivateGroup, newsfeedCommentsItemTypePostDto.isFromPrivateGroup) && epx.f(this.pushSubscription, newsfeedCommentsItemTypePostDto.pushSubscription) && epx.f(this.postAuthorData, newsfeedCommentsItemTypePostDto.postAuthorData) && epx.f(this.research, newsfeedCommentsItemTypePostDto.research) && epx.f(this.isAddedToMainTab, newsfeedCommentsItemTypePostDto.isAddedToMainTab) && epx.f(this.isBlacklisted, newsfeedCommentsItemTypePostDto.isBlacklisted) && epx.f(this.shareUrl, newsfeedCommentsItemTypePostDto.shareUrl) && epx.f(this.carouselOffset, newsfeedCommentsItemTypePostDto.carouselOffset) && epx.f(this.accessKey, newsfeedCommentsItemTypePostDto.accessKey) && epx.f(this.isDeleted, newsfeedCommentsItemTypePostDto.isDeleted) && epx.f(this.deletedReason, newsfeedCommentsItemTypePostDto.deletedReason) && epx.f(this.deletedDetails, newsfeedCommentsItemTypePostDto.deletedDetails) && epx.f(this.donutMiniappUrl, newsfeedCommentsItemTypePostDto.donutMiniappUrl) && epx.f(this.attachments, newsfeedCommentsItemTypePostDto.attachments) && epx.f(this.attachmentsMeta, newsfeedCommentsItemTypePostDto.attachmentsMeta) && epx.f(this.contentLayout, newsfeedCommentsItemTypePostDto.contentLayout) && epx.f(this.badgeId, newsfeedCommentsItemTypePostDto.badgeId) && epx.f(this.badgeInfo, newsfeedCommentsItemTypePostDto.badgeInfo) && epx.f(this.donutBadgeInfo, newsfeedCommentsItemTypePostDto.donutBadgeInfo) && epx.f(this.canArchive, newsfeedCommentsItemTypePostDto.canArchive) && this.canViewStats == newsfeedCommentsItemTypePostDto.canViewStats && epx.f(this.copyright, newsfeedCommentsItemTypePostDto.copyright) && epx.f(this.date, newsfeedCommentsItemTypePostDto.date) && epx.f(this.edited, newsfeedCommentsItemTypePostDto.edited) && epx.f(this.geo, newsfeedCommentsItemTypePostDto.geo) && epx.f(this.header, newsfeedCommentsItemTypePostDto.header) && epx.f(this.id, newsfeedCommentsItemTypePostDto.id) && epx.f(this.isArchived, newsfeedCommentsItemTypePostDto.isArchived) && epx.f(this.isFavorite, newsfeedCommentsItemTypePostDto.isFavorite) && epx.f(this.likes, newsfeedCommentsItemTypePostDto.likes) && epx.f(this.reactionSetId, newsfeedCommentsItemTypePostDto.reactionSetId) && epx.f(this.reactions, newsfeedCommentsItemTypePostDto.reactions) && epx.f(this.badges, newsfeedCommentsItemTypePostDto.badges) && epx.f(this.ownerId, newsfeedCommentsItemTypePostDto.ownerId) && epx.f(this.replyOwnerId, newsfeedCommentsItemTypePostDto.replyOwnerId) && epx.f(this.replyPostId, newsfeedCommentsItemTypePostDto.replyPostId) && epx.f(this.replyTo, newsfeedCommentsItemTypePostDto.replyTo) && epx.f(this.poster, newsfeedCommentsItemTypePostDto.poster) && epx.f(this.postId, newsfeedCommentsItemTypePostDto.postId) && epx.f(this.parentsStack, newsfeedCommentsItemTypePostDto.parentsStack) && epx.f(this.postSource, newsfeedCommentsItemTypePostDto.postSource) && this.postType == newsfeedCommentsItemTypePostDto.postType && epx.f(this.reposts, newsfeedCommentsItemTypePostDto.reposts) && epx.f(this.signerId, newsfeedCommentsItemTypePostDto.signerId) && epx.f(this.text, newsfeedCommentsItemTypePostDto.text) && epx.f(this.views, newsfeedCommentsItemTypePostDto.views) && epx.f(this.replyCount, newsfeedCommentsItemTypePostDto.replyCount) && epx.f(this.trackCode, newsfeedCommentsItemTypePostDto.trackCode) && epx.f(this.sharing, newsfeedCommentsItemTypePostDto.sharing);
        }

        public final int hashCode() {
            int hashCode = this.innerType.hashCode() * 31;
            UserId userId = this.fromId;
            int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            NewsfeedCommentsBaseDto newsfeedCommentsBaseDto = this.comments;
            int hashCode3 = (hashCode2 + (newsfeedCommentsBaseDto == null ? 0 : newsfeedCommentsBaseDto.hashCode())) * 31;
            WallWallpostAdsEasyPromoteDto wallWallpostAdsEasyPromoteDto = this.adsEasyPromote;
            int hashCode4 = (hashCode3 + (wallWallpostAdsEasyPromoteDto == null ? 0 : wallWallpostAdsEasyPromoteDto.hashCode())) * 31;
            Boolean bool = this.adsEasyPromoteThreeDots;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            List<WallWallpostFullDto> list = this.copyHistory;
            int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto = this.canEdit;
            int hashCode7 = (hashCode6 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
            UserId userId2 = this.createdBy;
            int hashCode8 = (hashCode7 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
            BaseBoolIntDto baseBoolIntDto2 = this.canDelete;
            int hashCode9 = (hashCode8 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto3 = this.canPublish;
            int hashCode10 = (hashCode9 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto4 = this.canPin;
            int hashCode11 = (hashCode10 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
            WallWallpostDonutDto wallWallpostDonutDto = this.donut;
            int hashCode12 = (hashCode11 + (wallWallpostDonutDto == null ? 0 : wallWallpostDonutDto.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto5 = this.friendsOnly;
            int hashCode13 = (hashCode12 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto6 = this.bestFriendsOnly;
            int hashCode14 = (hashCode13 + (baseBoolIntDto6 == null ? 0 : baseBoolIntDto6.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto7 = this.finalPost;
            int hashCode15 = (hashCode14 + (baseBoolIntDto7 == null ? 0 : baseBoolIntDto7.hashCode())) * 31;
            Boolean bool2 = this.checkSign;
            int hashCode16 = (hashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto8 = this.isPinned;
            int hashCode17 = (hashCode16 + (baseBoolIntDto8 == null ? 0 : baseBoolIntDto8.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto9 = this.markedAsAds;
            int hashCode18 = (hashCode17 + (baseBoolIntDto9 == null ? 0 : baseBoolIntDto9.hashCode())) * 31;
            Boolean bool3 = this.markedAsAuthorAd;
            int hashCode19 = (hashCode18 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            AdsAdvertiserInfoDto adsAdvertiserInfoDto = this.authorAd;
            int hashCode20 = (hashCode19 + (adsAdvertiserInfoDto == null ? 0 : adsAdvertiserInfoDto.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode21 = (hashCode20 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Boolean bool4 = this.suggestSubscribe;
            int hashCode22 = (hashCode21 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.zoomText;
            int hashCode23 = (hashCode22 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            WallWallpostRatingDto wallWallpostRatingDto = this.rating;
            int hashCode24 = (hashCode23 + (wallWallpostRatingDto == null ? 0 : wallWallpostRatingDto.hashCode())) * 31;
            Boolean bool6 = this.canSetCategory;
            int hashCode25 = (hashCode24 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            Boolean bool7 = this.canDoubtCategory;
            int hashCode26 = (hashCode25 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            WallWallpostCategoryActionDto wallWallpostCategoryActionDto = this.categoryAction;
            int hashCode27 = (hashCode26 + (wallWallpostCategoryActionDto == null ? 0 : wallWallpostCategoryActionDto.hashCode())) * 31;
            TopicIdDto topicIdDto = this.topicId;
            int hashCode28 = (hashCode27 + (topicIdDto == null ? 0 : topicIdDto.hashCode())) * 31;
            Boolean bool8 = this.trending;
            int hashCode29 = (hashCode28 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
            BaseBottomExtensionDto baseBottomExtensionDto = this.bottomExtension;
            int hashCode30 = (hashCode29 + (baseBottomExtensionDto == null ? 0 : baseBottomExtensionDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode31 = (hashCode30 + (f == null ? 0 : f.hashCode())) * 31;
            Integer num = this.shortAttachCount;
            int hashCode32 = (hashCode31 + (num == null ? 0 : num.hashCode())) * 31;
            UserId userId3 = this.sourceId;
            int hashCode33 = (hashCode32 + (userId3 == null ? 0 : Long.hashCode(userId3.b))) * 31;
            Integer num2 = this.compactAttachmentsBeforeCut;
            int hashCode34 = (hashCode33 + (num2 == null ? 0 : num2.hashCode())) * 31;
            WallCoownersDto wallCoownersDto = this.coowners;
            int hashCode35 = (hashCode34 + (wallCoownersDto == null ? 0 : wallCoownersDto.hashCode())) * 31;
            Float f2 = this.thumbsMaxHeight;
            int hashCode36 = (hashCode35 + (f2 == null ? 0 : f2.hashCode())) * 31;
            String str = this.hash;
            int hashCode37 = (hashCode36 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.adData;
            int hashCode38 = (hashCode37 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.adModerationChecksum;
            int hashCode39 = (hashCode38 + (str3 == null ? 0 : str3.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode40 = (hashCode39 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            String str4 = this.translationLang;
            int hashCode41 = (hashCode40 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool9 = this.hasTranslation;
            int hashCode42 = (hashCode41 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
            Integer num3 = this.facebookExport;
            int hashCode43 = (hashCode42 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.twitterExport;
            int hashCode44 = (hashCode43 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.postponedId;
            int hashCode45 = (hashCode44 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Boolean bool10 = this.isPromotedPostStealth;
            int hashCode46 = (hashCode45 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
            Boolean bool11 = this.hasVideoAutoplay;
            int hashCode47 = (hashCode46 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
            Object obj = this.awayParams;
            int hashCode48 = (hashCode47 + (obj == null ? 0 : obj.hashCode())) * 31;
            Boolean bool12 = this.hideLikes;
            int hashCode49 = (hashCode48 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
            WallPostTypeDto wallPostTypeDto = this.type;
            int hashCode50 = (hashCode49 + (wallPostTypeDto == null ? 0 : wallPostTypeDto.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode51 = (hashCode50 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            UserId userId4 = this.toId;
            int hashCode52 = (hashCode51 + (userId4 == null ? 0 : Long.hashCode(userId4.b))) * 31;
            Boolean bool13 = this.hasMarketLink;
            int hashCode53 = (hashCode52 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
            Boolean bool14 = this.isFromPrivateGroup;
            int hashCode54 = (hashCode53 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
            WallPushSubscriptionDto wallPushSubscriptionDto = this.pushSubscription;
            int hashCode55 = (hashCode54 + (wallPushSubscriptionDto == null ? 0 : wallPushSubscriptionDto.hashCode())) * 31;
            WallWallpostAuthorDataDto wallWallpostAuthorDataDto = this.postAuthorData;
            int hashCode56 = (hashCode55 + (wallWallpostAuthorDataDto == null ? 0 : wallWallpostAuthorDataDto.hashCode())) * 31;
            NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto = this.research;
            int hashCode57 = (hashCode56 + (newsfeedMediascopeResearchDto == null ? 0 : newsfeedMediascopeResearchDto.hashCode())) * 31;
            Boolean bool15 = this.isAddedToMainTab;
            int hashCode58 = (hashCode57 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
            Boolean bool16 = this.isBlacklisted;
            int hashCode59 = (hashCode58 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
            String str5 = this.shareUrl;
            int hashCode60 = (hashCode59 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num6 = this.carouselOffset;
            int hashCode61 = (hashCode60 + (num6 == null ? 0 : num6.hashCode())) * 31;
            String str6 = this.accessKey;
            int hashCode62 = (hashCode61 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Boolean bool17 = this.isDeleted;
            int hashCode63 = (hashCode62 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
            String str7 = this.deletedReason;
            int hashCode64 = (hashCode63 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.deletedDetails;
            int hashCode65 = (hashCode64 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.donutMiniappUrl;
            int hashCode66 = (hashCode65 + (str9 == null ? 0 : str9.hashCode())) * 31;
            List<WallWallpostAttachmentDto> list2 = this.attachments;
            int hashCode67 = (hashCode66 + (list2 == null ? 0 : list2.hashCode())) * 31;
            WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto = this.attachmentsMeta;
            int hashCode68 = (hashCode67 + (wallWallpostAttachmentsMetaDto == null ? 0 : wallWallpostAttachmentsMetaDto.hashCode())) * 31;
            List<WallWallpostContentLayoutItemDto> list3 = this.contentLayout;
            int hashCode69 = (hashCode68 + (list3 == null ? 0 : list3.hashCode())) * 31;
            Integer num7 = this.badgeId;
            int hashCode70 = (hashCode69 + (num7 == null ? 0 : num7.hashCode())) * 31;
            BadgesCommentInfoDto badgesCommentInfoDto = this.badgeInfo;
            int hashCode71 = (hashCode70 + (badgesCommentInfoDto == null ? 0 : badgesCommentInfoDto.hashCode())) * 31;
            BadgesDonutInfoDto badgesDonutInfoDto = this.donutBadgeInfo;
            int hashCode72 = (hashCode71 + (badgesDonutInfoDto == null ? 0 : badgesDonutInfoDto.hashCode())) * 31;
            Boolean bool18 = this.canArchive;
            int hashCode73 = (hashCode72 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto10 = this.canViewStats;
            int hashCode74 = (hashCode73 + (baseBoolIntDto10 == null ? 0 : baseBoolIntDto10.hashCode())) * 31;
            WallPostCopyrightDto wallPostCopyrightDto = this.copyright;
            int hashCode75 = (hashCode74 + (wallPostCopyrightDto == null ? 0 : wallPostCopyrightDto.hashCode())) * 31;
            Integer num8 = this.date;
            int hashCode76 = (hashCode75 + (num8 == null ? 0 : num8.hashCode())) * 31;
            Integer num9 = this.edited;
            int hashCode77 = (hashCode76 + (num9 == null ? 0 : num9.hashCode())) * 31;
            WallGeoDto wallGeoDto = this.geo;
            int hashCode78 = (hashCode77 + (wallGeoDto == null ? 0 : wallGeoDto.hashCode())) * 31;
            NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = this.header;
            int hashCode79 = (hashCode78 + (newsfeedNewsfeedItemHeaderDto == null ? 0 : newsfeedNewsfeedItemHeaderDto.hashCode())) * 31;
            Integer num10 = this.id;
            int hashCode80 = (hashCode79 + (num10 == null ? 0 : num10.hashCode())) * 31;
            Boolean bool19 = this.isArchived;
            int hashCode81 = (hashCode80 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
            Boolean bool20 = this.isFavorite;
            int hashCode82 = (hashCode81 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
            BaseLikesInfoDto baseLikesInfoDto = this.likes;
            int hashCode83 = (hashCode82 + (baseLikesInfoDto == null ? 0 : baseLikesInfoDto.hashCode())) * 31;
            String str10 = this.reactionSetId;
            int hashCode84 = (hashCode83 + (str10 == null ? 0 : str10.hashCode())) * 31;
            LikesItemReactionsDto likesItemReactionsDto = this.reactions;
            int hashCode85 = (hashCode84 + (likesItemReactionsDto == null ? 0 : likesItemReactionsDto.hashCode())) * 31;
            BadgesObjectInfoDto badgesObjectInfoDto = this.badges;
            int hashCode86 = (hashCode85 + (badgesObjectInfoDto == null ? 0 : badgesObjectInfoDto.hashCode())) * 31;
            UserId userId5 = this.ownerId;
            int hashCode87 = (hashCode86 + (userId5 == null ? 0 : Long.hashCode(userId5.b))) * 31;
            UserId userId6 = this.replyOwnerId;
            int hashCode88 = (hashCode87 + (userId6 == null ? 0 : Long.hashCode(userId6.b))) * 31;
            Integer num11 = this.replyPostId;
            int hashCode89 = (hashCode88 + (num11 == null ? 0 : num11.hashCode())) * 31;
            UserId userId7 = this.replyTo;
            int hashCode90 = (hashCode89 + (userId7 == null ? 0 : Long.hashCode(userId7.b))) * 31;
            WallPosterDto wallPosterDto = this.poster;
            int hashCode91 = (hashCode90 + (wallPosterDto == null ? 0 : wallPosterDto.hashCode())) * 31;
            Integer num12 = this.postId;
            int hashCode92 = (hashCode91 + (num12 == null ? 0 : num12.hashCode())) * 31;
            List<Integer> list4 = this.parentsStack;
            int hashCode93 = (hashCode92 + (list4 == null ? 0 : list4.hashCode())) * 31;
            WallPostSourceDto wallPostSourceDto = this.postSource;
            int hashCode94 = (hashCode93 + (wallPostSourceDto == null ? 0 : wallPostSourceDto.hashCode())) * 31;
            WallPostTypeDto wallPostTypeDto2 = this.postType;
            int hashCode95 = (hashCode94 + (wallPostTypeDto2 == null ? 0 : wallPostTypeDto2.hashCode())) * 31;
            BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
            int hashCode96 = (hashCode95 + (baseRepostsInfoDto == null ? 0 : baseRepostsInfoDto.hashCode())) * 31;
            UserId userId8 = this.signerId;
            int hashCode97 = (hashCode96 + (userId8 == null ? 0 : Long.hashCode(userId8.b))) * 31;
            String str11 = this.text;
            int hashCode98 = (hashCode97 + (str11 == null ? 0 : str11.hashCode())) * 31;
            WallViewsDto wallViewsDto = this.views;
            int hashCode99 = (hashCode98 + (wallViewsDto == null ? 0 : wallViewsDto.hashCode())) * 31;
            Integer num13 = this.replyCount;
            int hashCode100 = (hashCode99 + (num13 == null ? 0 : num13.hashCode())) * 31;
            String str12 = this.trackCode;
            int hashCode101 = (hashCode100 + (str12 == null ? 0 : str12.hashCode())) * 31;
            WallSharingDto wallSharingDto = this.sharing;
            return hashCode101 + (wallSharingDto != null ? wallSharingDto.hashCode() : 0);
        }

        public final String toString() {
            return "NewsfeedCommentsItemTypePostDto(innerType=" + this.innerType + ", fromId=" + this.fromId + ", comments=" + this.comments + ", adsEasyPromote=" + this.adsEasyPromote + ", adsEasyPromoteThreeDots=" + this.adsEasyPromoteThreeDots + ", copyHistory=" + this.copyHistory + ", canEdit=" + this.canEdit + ", createdBy=" + this.createdBy + ", canDelete=" + this.canDelete + ", canPublish=" + this.canPublish + ", canPin=" + this.canPin + ", donut=" + this.donut + ", friendsOnly=" + this.friendsOnly + ", bestFriendsOnly=" + this.bestFriendsOnly + ", finalPost=" + this.finalPost + ", checkSign=" + this.checkSign + ", isPinned=" + this.isPinned + ", markedAsAds=" + this.markedAsAds + ", markedAsAuthorAd=" + this.markedAsAuthorAd + ", authorAd=" + this.authorAd + ", activity=" + this.activity + ", suggestSubscribe=" + this.suggestSubscribe + ", zoomText=" + this.zoomText + ", rating=" + this.rating + ", canSetCategory=" + this.canSetCategory + ", canDoubtCategory=" + this.canDoubtCategory + ", categoryAction=" + this.categoryAction + ", topicId=" + this.topicId + ", trending=" + this.trending + ", bottomExtension=" + this.bottomExtension + ", shortTextRate=" + this.shortTextRate + ", shortAttachCount=" + this.shortAttachCount + ", sourceId=" + this.sourceId + ", compactAttachmentsBeforeCut=" + this.compactAttachmentsBeforeCut + ", coowners=" + this.coowners + ", thumbsMaxHeight=" + this.thumbsMaxHeight + ", hash=" + this.hash + ", adData=" + this.adData + ", adModerationChecksum=" + this.adModerationChecksum + ", caption=" + this.caption + ", translationLang=" + this.translationLang + ", hasTranslation=" + this.hasTranslation + ", facebookExport=" + this.facebookExport + ", twitterExport=" + this.twitterExport + ", postponedId=" + this.postponedId + ", isPromotedPostStealth=" + this.isPromotedPostStealth + ", hasVideoAutoplay=" + this.hasVideoAutoplay + ", awayParams=" + this.awayParams + ", hideLikes=" + this.hideLikes + ", type=" + this.type + ", feedback=" + this.feedback + ", toId=" + this.toId + ", hasMarketLink=" + this.hasMarketLink + ", isFromPrivateGroup=" + this.isFromPrivateGroup + ", pushSubscription=" + this.pushSubscription + ", postAuthorData=" + this.postAuthorData + ", research=" + this.research + ", isAddedToMainTab=" + this.isAddedToMainTab + ", isBlacklisted=" + this.isBlacklisted + ", shareUrl=" + this.shareUrl + ", carouselOffset=" + this.carouselOffset + ", accessKey=" + this.accessKey + ", isDeleted=" + this.isDeleted + ", deletedReason=" + this.deletedReason + ", deletedDetails=" + this.deletedDetails + ", donutMiniappUrl=" + this.donutMiniappUrl + ", attachments=" + this.attachments + ", attachmentsMeta=" + this.attachmentsMeta + ", contentLayout=" + this.contentLayout + ", badgeId=" + this.badgeId + ", badgeInfo=" + this.badgeInfo + ", donutBadgeInfo=" + this.donutBadgeInfo + ", canArchive=" + this.canArchive + ", canViewStats=" + this.canViewStats + ", copyright=" + this.copyright + ", date=" + this.date + ", edited=" + this.edited + ", geo=" + this.geo + ", header=" + this.header + ", id=" + this.id + ", isArchived=" + this.isArchived + ", isFavorite=" + this.isFavorite + ", likes=" + this.likes + ", reactionSetId=" + this.reactionSetId + ", reactions=" + this.reactions + ", badges=" + this.badges + ", ownerId=" + this.ownerId + ", replyOwnerId=" + this.replyOwnerId + ", replyPostId=" + this.replyPostId + ", replyTo=" + this.replyTo + ", poster=" + this.poster + ", postId=" + this.postId + ", parentsStack=" + this.parentsStack + ", postSource=" + this.postSource + ", postType=" + this.postType + ", reposts=" + this.reposts + ", signerId=" + this.signerId + ", text=" + this.text + ", views=" + this.views + ", replyCount=" + this.replyCount + ", trackCode=" + this.trackCode + ", sharing=" + this.sharing + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.innerType.writeToParcel(parcel, i);
            parcel.writeParcelable(this.fromId, i);
            NewsfeedCommentsBaseDto newsfeedCommentsBaseDto = this.comments;
            if (newsfeedCommentsBaseDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedCommentsBaseDto.writeToParcel(parcel, i);
            }
            WallWallpostAdsEasyPromoteDto wallWallpostAdsEasyPromoteDto = this.adsEasyPromote;
            if (wallWallpostAdsEasyPromoteDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallWallpostAdsEasyPromoteDto.writeToParcel(parcel, i);
            }
            Boolean bool = this.adsEasyPromoteThreeDots;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            List<WallWallpostFullDto> list = this.copyHistory;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((WallWallpostFullDto) f.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeParcelable(this.canEdit, i);
            parcel.writeParcelable(this.createdBy, i);
            parcel.writeParcelable(this.canDelete, i);
            parcel.writeParcelable(this.canPublish, i);
            parcel.writeParcelable(this.canPin, i);
            WallWallpostDonutDto wallWallpostDonutDto = this.donut;
            if (wallWallpostDonutDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallWallpostDonutDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.friendsOnly, i);
            parcel.writeParcelable(this.bestFriendsOnly, i);
            parcel.writeParcelable(this.finalPost, i);
            Boolean bool2 = this.checkSign;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.isPinned, i);
            parcel.writeParcelable(this.markedAsAds, i);
            Boolean bool3 = this.markedAsAuthorAd;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            AdsAdvertiserInfoDto adsAdvertiserInfoDto = this.authorAd;
            if (adsAdvertiserInfoDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                adsAdvertiserInfoDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.activity, i);
            Boolean bool4 = this.suggestSubscribe;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            Boolean bool5 = this.zoomText;
            if (bool5 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool5);
            }
            WallWallpostRatingDto wallWallpostRatingDto = this.rating;
            if (wallWallpostRatingDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallWallpostRatingDto.writeToParcel(parcel, i);
            }
            Boolean bool6 = this.canSetCategory;
            if (bool6 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool6);
            }
            Boolean bool7 = this.canDoubtCategory;
            if (bool7 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool7);
            }
            WallWallpostCategoryActionDto wallWallpostCategoryActionDto = this.categoryAction;
            if (wallWallpostCategoryActionDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallWallpostCategoryActionDto.writeToParcel(parcel, i);
            }
            TopicIdDto topicIdDto = this.topicId;
            if (topicIdDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                topicIdDto.writeToParcel(parcel, i);
            }
            Boolean bool8 = this.trending;
            if (bool8 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool8);
            }
            parcel.writeParcelable(this.bottomExtension, i);
            Float f2 = this.shortTextRate;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f2);
            }
            Integer num = this.shortAttachCount;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeParcelable(this.sourceId, i);
            Integer num2 = this.compactAttachmentsBeforeCut;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num2);
            }
            WallCoownersDto wallCoownersDto = this.coowners;
            if (wallCoownersDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallCoownersDto.writeToParcel(parcel, i);
            }
            Float f3 = this.thumbsMaxHeight;
            if (f3 == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f3);
            }
            parcel.writeString(this.hash);
            parcel.writeString(this.adData);
            parcel.writeString(this.adModerationChecksum);
            parcel.writeParcelable(this.caption, i);
            parcel.writeString(this.translationLang);
            Boolean bool9 = this.hasTranslation;
            if (bool9 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool9);
            }
            Integer num3 = this.facebookExport;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num3);
            }
            Integer num4 = this.twitterExport;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num4);
            }
            Integer num5 = this.postponedId;
            if (num5 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num5);
            }
            Boolean bool10 = this.isPromotedPostStealth;
            if (bool10 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool10);
            }
            Boolean bool11 = this.hasVideoAutoplay;
            if (bool11 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool11);
            }
            parcel.writeValue(this.awayParams);
            Boolean bool12 = this.hideLikes;
            if (bool12 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool12);
            }
            WallPostTypeDto wallPostTypeDto = this.type;
            if (wallPostTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallPostTypeDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.toId, i);
            Boolean bool13 = this.hasMarketLink;
            if (bool13 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool13);
            }
            Boolean bool14 = this.isFromPrivateGroup;
            if (bool14 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool14);
            }
            WallPushSubscriptionDto wallPushSubscriptionDto = this.pushSubscription;
            if (wallPushSubscriptionDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallPushSubscriptionDto.writeToParcel(parcel, i);
            }
            WallWallpostAuthorDataDto wallWallpostAuthorDataDto = this.postAuthorData;
            if (wallWallpostAuthorDataDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallWallpostAuthorDataDto.writeToParcel(parcel, i);
            }
            NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto = this.research;
            if (newsfeedMediascopeResearchDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedMediascopeResearchDto.writeToParcel(parcel, i);
            }
            Boolean bool15 = this.isAddedToMainTab;
            if (bool15 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool15);
            }
            Boolean bool16 = this.isBlacklisted;
            if (bool16 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool16);
            }
            parcel.writeString(this.shareUrl);
            Integer num6 = this.carouselOffset;
            if (num6 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num6);
            }
            parcel.writeString(this.accessKey);
            Boolean bool17 = this.isDeleted;
            if (bool17 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool17);
            }
            parcel.writeString(this.deletedReason);
            parcel.writeString(this.deletedDetails);
            parcel.writeString(this.donutMiniappUrl);
            List<WallWallpostAttachmentDto> list2 = this.attachments;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f4 = dn.f(parcel, list2, 1);
                while (f4.hasNext()) {
                    parcel.writeParcelable((Parcelable) f4.next(), i);
                }
            }
            parcel.writeParcelable(this.attachmentsMeta, i);
            List<WallWallpostContentLayoutItemDto> list3 = this.contentLayout;
            if (list3 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f5 = dn.f(parcel, list3, 1);
                while (f5.hasNext()) {
                    parcel.writeParcelable((Parcelable) f5.next(), i);
                }
            }
            Integer num7 = this.badgeId;
            if (num7 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num7);
            }
            parcel.writeParcelable(this.badgeInfo, i);
            parcel.writeParcelable(this.donutBadgeInfo, i);
            Boolean bool18 = this.canArchive;
            if (bool18 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool18);
            }
            parcel.writeParcelable(this.canViewStats, i);
            WallPostCopyrightDto wallPostCopyrightDto = this.copyright;
            if (wallPostCopyrightDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallPostCopyrightDto.writeToParcel(parcel, i);
            }
            Integer num8 = this.date;
            if (num8 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num8);
            }
            Integer num9 = this.edited;
            if (num9 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num9);
            }
            parcel.writeParcelable(this.geo, i);
            NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = this.header;
            if (newsfeedNewsfeedItemHeaderDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedNewsfeedItemHeaderDto.writeToParcel(parcel, i);
            }
            Integer num10 = this.id;
            if (num10 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num10);
            }
            Boolean bool19 = this.isArchived;
            if (bool19 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool19);
            }
            Boolean bool20 = this.isFavorite;
            if (bool20 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool20);
            }
            parcel.writeParcelable(this.likes, i);
            parcel.writeString(this.reactionSetId);
            parcel.writeParcelable(this.reactions, i);
            BadgesObjectInfoDto badgesObjectInfoDto = this.badges;
            if (badgesObjectInfoDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                badgesObjectInfoDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.ownerId, i);
            parcel.writeParcelable(this.replyOwnerId, i);
            Integer num11 = this.replyPostId;
            if (num11 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num11);
            }
            parcel.writeParcelable(this.replyTo, i);
            WallPosterDto wallPosterDto = this.poster;
            if (wallPosterDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallPosterDto.writeToParcel(parcel, i);
            }
            Integer num12 = this.postId;
            if (num12 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num12);
            }
            List<Integer> list4 = this.parentsStack;
            if (list4 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f6 = dn.f(parcel, list4, 1);
                while (f6.hasNext()) {
                    parcel.writeInt(((Number) f6.next()).intValue());
                }
            }
            WallPostSourceDto wallPostSourceDto = this.postSource;
            if (wallPostSourceDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallPostSourceDto.writeToParcel(parcel, i);
            }
            WallPostTypeDto wallPostTypeDto2 = this.postType;
            if (wallPostTypeDto2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallPostTypeDto2.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.reposts, i);
            parcel.writeParcelable(this.signerId, i);
            parcel.writeString(this.text);
            WallViewsDto wallViewsDto = this.views;
            if (wallViewsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallViewsDto.writeToParcel(parcel, i);
            }
            Integer num13 = this.replyCount;
            if (num13 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num13);
            }
            parcel.writeString(this.trackCode);
            WallSharingDto wallSharingDto = this.sharing;
            if (wallSharingDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallSharingDto.writeToParcel(parcel, i);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NewsfeedCommentsItemTypePostDto(InnerTypeDto innerTypeDto, UserId userId, NewsfeedCommentsBaseDto newsfeedCommentsBaseDto, WallWallpostAdsEasyPromoteDto wallWallpostAdsEasyPromoteDto, Boolean bool, List<WallWallpostFullDto> list, BaseBoolIntDto baseBoolIntDto, UserId userId2, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, WallWallpostDonutDto wallWallpostDonutDto, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, Boolean bool2, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, Boolean bool3, AdsAdvertiserInfoDto adsAdvertiserInfoDto, WallPostActivityDto wallPostActivityDto, Boolean bool4, Boolean bool5, WallWallpostRatingDto wallWallpostRatingDto, Boolean bool6, Boolean bool7, WallWallpostCategoryActionDto wallWallpostCategoryActionDto, TopicIdDto topicIdDto, Boolean bool8, BaseBottomExtensionDto baseBottomExtensionDto, Float f, Integer num, UserId userId3, Integer num2, WallCoownersDto wallCoownersDto, Float f2, String str, String str2, String str3, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, String str4, Boolean bool9, Integer num3, Integer num4, Integer num5, Boolean bool10, Boolean bool11, Object obj, Boolean bool12, WallPostTypeDto wallPostTypeDto, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, UserId userId4, Boolean bool13, Boolean bool14, WallPushSubscriptionDto wallPushSubscriptionDto, WallWallpostAuthorDataDto wallWallpostAuthorDataDto, NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto, Boolean bool15, Boolean bool16, String str5, Integer num6, String str6, Boolean bool17, String str7, String str8, String str9, List<WallWallpostAttachmentDto> list2, WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto, List<? extends WallWallpostContentLayoutItemDto> list3, Integer num7, BadgesCommentInfoDto badgesCommentInfoDto, BadgesDonutInfoDto badgesDonutInfoDto, Boolean bool18, BaseBoolIntDto baseBoolIntDto10, WallPostCopyrightDto wallPostCopyrightDto, Integer num8, Integer num9, WallGeoDto wallGeoDto, NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto, Integer num10, Boolean bool19, Boolean bool20, BaseLikesInfoDto baseLikesInfoDto, String str10, LikesItemReactionsDto likesItemReactionsDto, BadgesObjectInfoDto badgesObjectInfoDto, UserId userId5, UserId userId6, Integer num11, UserId userId7, WallPosterDto wallPosterDto, Integer num12, List<Integer> list4, WallPostSourceDto wallPostSourceDto, WallPostTypeDto wallPostTypeDto2, BaseRepostsInfoDto baseRepostsInfoDto, UserId userId8, String str11, WallViewsDto wallViewsDto, Integer num13, String str12, WallSharingDto wallSharingDto) {
            super(null);
            this.innerType = innerTypeDto;
            this.fromId = userId;
            this.comments = newsfeedCommentsBaseDto;
            this.adsEasyPromote = wallWallpostAdsEasyPromoteDto;
            this.adsEasyPromoteThreeDots = bool;
            this.copyHistory = list;
            this.canEdit = baseBoolIntDto;
            this.createdBy = userId2;
            this.canDelete = baseBoolIntDto2;
            this.canPublish = baseBoolIntDto3;
            this.canPin = baseBoolIntDto4;
            this.donut = wallWallpostDonutDto;
            this.friendsOnly = baseBoolIntDto5;
            this.bestFriendsOnly = baseBoolIntDto6;
            this.finalPost = baseBoolIntDto7;
            this.checkSign = bool2;
            this.isPinned = baseBoolIntDto8;
            this.markedAsAds = baseBoolIntDto9;
            this.markedAsAuthorAd = bool3;
            this.authorAd = adsAdvertiserInfoDto;
            this.activity = wallPostActivityDto;
            this.suggestSubscribe = bool4;
            this.zoomText = bool5;
            this.rating = wallWallpostRatingDto;
            this.canSetCategory = bool6;
            this.canDoubtCategory = bool7;
            this.categoryAction = wallWallpostCategoryActionDto;
            this.topicId = topicIdDto;
            this.trending = bool8;
            this.bottomExtension = baseBottomExtensionDto;
            this.shortTextRate = f;
            this.shortAttachCount = num;
            this.sourceId = userId3;
            this.compactAttachmentsBeforeCut = num2;
            this.coowners = wallCoownersDto;
            this.thumbsMaxHeight = f2;
            this.hash = str;
            this.adData = str2;
            this.adModerationChecksum = str3;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.translationLang = str4;
            this.hasTranslation = bool9;
            this.facebookExport = num3;
            this.twitterExport = num4;
            this.postponedId = num5;
            this.isPromotedPostStealth = bool10;
            this.hasVideoAutoplay = bool11;
            this.awayParams = obj;
            this.hideLikes = bool12;
            this.type = wallPostTypeDto;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.toId = userId4;
            this.hasMarketLink = bool13;
            this.isFromPrivateGroup = bool14;
            this.pushSubscription = wallPushSubscriptionDto;
            this.postAuthorData = wallWallpostAuthorDataDto;
            this.research = newsfeedMediascopeResearchDto;
            this.isAddedToMainTab = bool15;
            this.isBlacklisted = bool16;
            this.shareUrl = str5;
            this.carouselOffset = num6;
            this.accessKey = str6;
            this.isDeleted = bool17;
            this.deletedReason = str7;
            this.deletedDetails = str8;
            this.donutMiniappUrl = str9;
            this.attachments = list2;
            this.attachmentsMeta = wallWallpostAttachmentsMetaDto;
            this.contentLayout = list3;
            this.badgeId = num7;
            this.badgeInfo = badgesCommentInfoDto;
            this.donutBadgeInfo = badgesDonutInfoDto;
            this.canArchive = bool18;
            this.canViewStats = baseBoolIntDto10;
            this.copyright = wallPostCopyrightDto;
            this.date = num8;
            this.edited = num9;
            this.geo = wallGeoDto;
            this.header = newsfeedNewsfeedItemHeaderDto;
            this.id = num10;
            this.isArchived = bool19;
            this.isFavorite = bool20;
            this.likes = baseLikesInfoDto;
            this.reactionSetId = str10;
            this.reactions = likesItemReactionsDto;
            this.badges = badgesObjectInfoDto;
            this.ownerId = userId5;
            this.replyOwnerId = userId6;
            this.replyPostId = num11;
            this.replyTo = userId7;
            this.poster = wallPosterDto;
            this.postId = num12;
            this.parentsStack = list4;
            this.postSource = wallPostSourceDto;
            this.postType = wallPostTypeDto2;
            this.reposts = baseRepostsInfoDto;
            this.signerId = userId8;
            this.text = str11;
            this.views = wallViewsDto;
            this.replyCount = num13;
            this.trackCode = str12;
            this.sharing = wallSharingDto;
        }
    }

    /* compiled from: NewsfeedCommentsItemDto.kt */
    public static final class NewsfeedCommentsItemTypeTopicDto extends NewsfeedCommentsItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedCommentsItemTypeTopicDto> CREATOR = new a();

        @pmi0("comments")
        private final NewsfeedCommentsBaseDto comments;

        @pmi0("date")
        private final Integer date;

        @pmi0("likes")
        private final BaseLikesDto likes;

        @pmi0("post_id")
        private final Integer postId;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("text")
        private final String text;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* compiled from: NewsfeedCommentsItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedCommentsItemTypeTopicDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedCommentsItemTypeTopicDto createFromParcel(Parcel parcel) {
                return new NewsfeedCommentsItemTypeTopicDto((NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedCommentsItemTypeTopicDto.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : NewsfeedCommentsBaseDto.CREATOR.createFromParcel(parcel), (BaseLikesDto) parcel.readParcelable(NewsfeedCommentsItemTypeTopicDto.class.getClassLoader()), (UserId) parcel.readParcelable(NewsfeedCommentsItemTypeTopicDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedCommentsItemTypeTopicDto[] newArray(int i) {
                return new NewsfeedCommentsItemTypeTopicDto[i];
            }
        }

        public /* synthetic */ NewsfeedCommentsItemTypeTopicDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, String str, NewsfeedCommentsBaseDto newsfeedCommentsBaseDto, BaseLikesDto baseLikesDto, UserId userId, Integer num, Integer num2, int i, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : newsfeedCommentsBaseDto, (i & 8) != 0 ? null : baseLikesDto, (i & 16) != 0 ? null : userId, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedCommentsItemTypeTopicDto)) {
                return false;
            }
            NewsfeedCommentsItemTypeTopicDto newsfeedCommentsItemTypeTopicDto = (NewsfeedCommentsItemTypeTopicDto) obj;
            return this.type == newsfeedCommentsItemTypeTopicDto.type && epx.f(this.text, newsfeedCommentsItemTypeTopicDto.text) && epx.f(this.comments, newsfeedCommentsItemTypeTopicDto.comments) && epx.f(this.likes, newsfeedCommentsItemTypeTopicDto.likes) && epx.f(this.sourceId, newsfeedCommentsItemTypeTopicDto.sourceId) && epx.f(this.date, newsfeedCommentsItemTypeTopicDto.date) && epx.f(this.postId, newsfeedCommentsItemTypeTopicDto.postId);
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            String str = this.text;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            NewsfeedCommentsBaseDto newsfeedCommentsBaseDto = this.comments;
            int hashCode3 = (hashCode2 + (newsfeedCommentsBaseDto == null ? 0 : newsfeedCommentsBaseDto.hashCode())) * 31;
            BaseLikesDto baseLikesDto = this.likes;
            int hashCode4 = (hashCode3 + (baseLikesDto == null ? 0 : baseLikesDto.hashCode())) * 31;
            UserId userId = this.sourceId;
            int hashCode5 = (hashCode4 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            Integer num = this.date;
            int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.postId;
            return hashCode6 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedCommentsItemTypeTopicDto(type=");
            sb.append(this.type);
            sb.append(", text=");
            sb.append(this.text);
            sb.append(", comments=");
            sb.append(this.comments);
            sb.append(", likes=");
            sb.append(this.likes);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", postId=");
            return uqi.b(sb, this.postId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.type, i);
            parcel.writeString(this.text);
            NewsfeedCommentsBaseDto newsfeedCommentsBaseDto = this.comments;
            if (newsfeedCommentsBaseDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedCommentsBaseDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.likes, i);
            parcel.writeParcelable(this.sourceId, i);
            Integer num = this.date;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            Integer num2 = this.postId;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num2);
            }
        }

        public NewsfeedCommentsItemTypeTopicDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, String str, NewsfeedCommentsBaseDto newsfeedCommentsBaseDto, BaseLikesDto baseLikesDto, UserId userId, Integer num, Integer num2) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.text = str;
            this.comments = newsfeedCommentsBaseDto;
            this.likes = baseLikesDto;
            this.sourceId = userId;
            this.date = num;
            this.postId = num2;
        }
    }

    /* compiled from: NewsfeedCommentsItemDto.kt */
    public static final class NewsfeedCommentsItemTypeVideoDto extends NewsfeedCommentsItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedCommentsItemTypeVideoDto> CREATOR = new a();

        @pmi0("access_info")
        private final VideoAccessInfoDto accessInfo;

        @pmi0("access_key")
        private final String accessKey;

        @pmi0("added")
        private final BaseBoolIntDto added;

        @pmi0("adding_date")
        private final Integer addingDate;

        @pmi0("ads_info")
        private final VideoAdsInfoDto adsInfo;

        @pmi0("ads_stat_pixels")
        private final List<AdsItemBlockAdStatPixelDto> adsStatPixels;

        @pmi0("album_id")
        private final Integer albumId;

        @pmi0("archival_content_published_date")
        private final Integer archivalContentPublishedDate;

        @pmi0("balance")
        private final Integer balance;

        @pmi0("can_add")
        private final BaseBoolIntDto canAdd;

        @pmi0("can_add_to_faves")
        private final BaseBoolIntDto canAddToFaves;

        @pmi0("can_attach_link")
        private final BaseBoolIntDto canAttachLink;

        @pmi0("can_be_promoted")
        private final BaseBoolIntDto canBePromoted;

        @pmi0("can_comment")
        private final BaseBoolIntDto canComment;

        @pmi0("can_cut_to_short_video")
        private final BaseBoolIntDto canCutToShortVideo;

        @pmi0("can_delete")
        private final BaseBoolIntDto canDelete;

        @pmi0("can_dislike")
        private final BaseBoolIntDto canDislike;

        @pmi0("can_download")
        private final Integer canDownload;

        @pmi0("can_edit")
        private final BaseBoolIntDto canEdit;

        @pmi0("can_edit_privacy")
        private final BaseBoolIntDto canEditPrivacy;

        @pmi0("can_like")
        private final BaseBoolIntDto canLike;

        @pmi0("can_play_in_background")
        private final BaseBoolIntDto canPlayInBackground;

        @pmi0("can_remove_from_recommendations")
        private final BaseBoolIntDto canRemoveFromRecommendations;

        @pmi0("can_report")
        private final BaseBoolIntDto canReport;

        @pmi0("can_repost")
        private final Integer canRepost;

        @pmi0("can_subscribe")
        private final BaseBoolIntDto canSubscribe;

        @pmi0("comments")
        private final NewsfeedCommentsBaseDto comments;

        @pmi0("content_restricted")
        private final Integer contentRestricted;

        @pmi0("content_restricted_message")
        private final String contentRestrictedMessage;

        @pmi0("context")
        private final String context;

        @pmi0("converting")
        private final BaseBoolIntDto converting;

        @pmi0("date")
        private final Integer date;

        @pmi0("description")
        private final String description;

        @pmi0("donut")
        private final VideoDonutDto donut;

        @pmi0("donut_level_id")
        private final Integer donutLevelId;

        @pmi0("download")
        private final VideoVideoDownloadDto download;

        @pmi0("duration")
        private final Integer duration;

        @pmi0("featured_artists")
        private final List<AudioArtistDto> featuredArtists;

        @pmi0("first_frame")
        private final List<VideoVideoImageDto> firstFrame;

        @pmi0("genres")
        private final List<AudioGenreDto> genres;

        @pmi0("height")
        private final Integer height;

        @pmi0("id")
        private final Integer id;

        @pmi0("image")
        private final List<VideoVideoImageDto> image;

        @pmi0("is_archival_content")
        private final Boolean isArchivalContent;

        @pmi0("is_author")
        private final Boolean isAuthor;

        @pmi0("is_draft")
        private final BaseBoolIntDto isDraft;

        @pmi0("is_explicit")
        private final BaseBoolIntDto isExplicit;

        @pmi0("is_favorite")
        private final Boolean isFavorite;

        @pmi0("is_from_message")
        private final BaseBoolIntDto isFromMessage;

        @pmi0("is_mobile_live")
        private final Boolean isMobileLive;

        @pmi0("is_private")
        private final BaseBoolIntDto isPrivate;

        @pmi0("is_spherical")
        private final Boolean isSpherical;

        @pmi0("is_subscribed")
        private final BaseBoolIntDto isSubscribed;

        @pmi0("is_united_video")
        private final BaseBoolIntDto isUnitedVideo;

        @pmi0("likes")
        private final BaseLikesDto likes;

        @pmi0("linked_to_playlist_marks")
        private final List<VideoLinkedToPlaylistMarkDto> linkedToPlaylistMarks;

        @pmi0("live_notify")
        private final BaseBoolIntDto liveNotify;

        @pmi0("live_start_time")
        private final Integer liveStartTime;

        @pmi0("live_status")
        private final VideoLiveStatusDto liveStatus;

        @pmi0("local_views")
        private final Integer localViews;

        @pmi0("main_artists")
        private final List<AudioArtistDto> mainArtists;

        @pmi0("moderation_status")
        private final Integer moderationStatus;

        @pmi0("need_mute")
        private final BasePropertyExistsDto needMute;

        @pmi0("no_autoplay")
        private final BasePropertyExistsDto noAutoplay;

        @pmi0("ov_id")
        private final String ovId;

        @pmi0("ov_provider_id")
        private final Integer ovProviderId;

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("partner_text")
        private final String partnerText;

        @pmi0("platform")
        private final String platform;

        @pmi0("player")
        private final String player;

        @pmi0("post_id")
        private final Integer postId;

        @pmi0("processing")
        private final BasePropertyExistsDto processing;

        @pmi0("promo_post_hash")
        private final String promoPostHash;

        @pmi0("published_at")
        private final Integer publishedAt;

        @pmi0("random_tag")
        private final String randomTag;

        @pmi0("release_date")
        private final Integer releaseDate;

        @pmi0("repeat")
        private final BasePropertyExistsDto repeat;

        @pmi0("reposts")
        private final BaseRepostsInfoDto reposts;

        @pmi0(CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE)
        private final ResponseTypeDto responseType;

        @pmi0("restriction")
        private final MediaRestrictionDto restriction;

        @pmi0(Hb.a)
        private final Integer server;

        @pmi0("should_stretch")
        private final Boolean shouldStretch;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("spectators")
        private final Integer spectators;

        @pmi0("subtitle")
        private final String subtitle;

        @pmi0("text")
        private final String text;

        @pmi0("thumb_hash")
        private final String thumbHash;

        @pmi0("title")
        private final String title;

        @pmi0("title_action")
        private final ActionLinksActionDto titleAction;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("tracking_info")
        private final VideoVideoTrackingInfoDto trackingInfo;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("uma_track_id")
        private final Integer umaTrackId;

        @pmi0("user_id")
        private final UserId userId;

        @pmi0("uv_stats_place")
        private final String uvStatsPlace;

        @pmi0("views")
        private final Integer views;

        @pmi0("vk_live_channel_name")
        private final String vkLiveChannelName;

        @pmi0("vk_live_channel_url")
        private final String vkLiveChannelUrl;

        @pmi0("vk_live_slot_url")
        private final String vkLiveSlotUrl;

        @pmi0("vk_live_video_id")
        private final String vkLiveVideoId;

        @pmi0("wall_post_id")
        private final Integer wallPostId;

        @pmi0("width")
        private final Integer width;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedCommentsItemDto.kt */
        public static final class ResponseTypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ResponseTypeDto[] $VALUES;
            public static final Parcelable.Creator<ResponseTypeDto> CREATOR;

            @pmi0("full")
            public static final ResponseTypeDto FULL;

            @pmi0(UcumUtils.UCUM_MINUTES)
            public static final ResponseTypeDto MIN;
            private final String value;

            /* compiled from: NewsfeedCommentsItemDto.kt */
            public static final class a implements Parcelable.Creator<ResponseTypeDto> {
                @Override // android.os.Parcelable.Creator
                public final ResponseTypeDto createFromParcel(Parcel parcel) {
                    return ResponseTypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ResponseTypeDto[] newArray(int i) {
                    return new ResponseTypeDto[i];
                }
            }

            static {
                ResponseTypeDto responseTypeDto = new ResponseTypeDto("MIN", 0, UcumUtils.UCUM_MINUTES);
                MIN = responseTypeDto;
                ResponseTypeDto responseTypeDto2 = new ResponseTypeDto("FULL", 1, "full");
                FULL = responseTypeDto2;
                ResponseTypeDto[] responseTypeDtoArr = {responseTypeDto, responseTypeDto2};
                $VALUES = responseTypeDtoArr;
                $ENTRIES = new asp(responseTypeDtoArr);
                CREATOR = new a();
            }

            private ResponseTypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static ResponseTypeDto valueOf(String str) {
                return (ResponseTypeDto) Enum.valueOf(ResponseTypeDto.class, str);
            }

            public static ResponseTypeDto[] values() {
                return (ResponseTypeDto[]) $VALUES.clone();
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

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedCommentsItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("live")
            public static final TypeDto LIVE;

            @pmi0("movie")
            public static final TypeDto MOVIE;

            @pmi0("music_video")
            public static final TypeDto MUSIC_VIDEO;

            @pmi0("short_video")
            public static final TypeDto SHORT_VIDEO;

            @pmi0("ugc_music_video")
            public static final TypeDto UGC_MUSIC_VIDEO;

            @pmi0("video")
            public static final TypeDto VIDEO;
            private final String value;

            /* compiled from: NewsfeedCommentsItemDto.kt */
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
                TypeDto typeDto = new TypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 0, "video");
                VIDEO = typeDto;
                TypeDto typeDto2 = new TypeDto("MUSIC_VIDEO", 1, "music_video");
                MUSIC_VIDEO = typeDto2;
                TypeDto typeDto3 = new TypeDto(SignalingProtocol.KEY_STREAM_TYPE_MOVIE, 2, "movie");
                MOVIE = typeDto3;
                TypeDto typeDto4 = new TypeDto("LIVE", 3, "live");
                LIVE = typeDto4;
                TypeDto typeDto5 = new TypeDto("SHORT_VIDEO", 4, "short_video");
                SHORT_VIDEO = typeDto5;
                TypeDto typeDto6 = new TypeDto("UGC_MUSIC_VIDEO", 5, "ugc_music_video");
                UGC_MUSIC_VIDEO = typeDto6;
                TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6};
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

        /* compiled from: NewsfeedCommentsItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedCommentsItemTypeVideoDto> {
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v135, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r1v137, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r1v138 */
            /* JADX WARN: Type inference failed for: r1v140 */
            /* JADX WARN: Type inference failed for: r2v18, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v19 */
            /* JADX WARN: Type inference failed for: r2v21, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v22 */
            /* JADX WARN: Type inference failed for: r2v37 */
            /* JADX WARN: Type inference failed for: r2v38 */
            /* JADX WARN: Type inference failed for: r76v4, types: [java.lang.Boolean] */
            /* JADX WARN: Type inference failed for: r77v1, types: [java.lang.Boolean] */
            /* JADX WARN: Type inference failed for: r87v4, types: [java.lang.Boolean] */
            /* JADX WARN: Type inference failed for: r97v1, types: [java.util.List] */
            @Override // android.os.Parcelable.Creator
            public final NewsfeedCommentsItemTypeVideoDto createFromParcel(Parcel parcel) {
                NewsfeedCommentsBaseDto newsfeedCommentsBaseDto;
                ArrayList arrayList;
                BaseBoolIntDto baseBoolIntDto;
                Boolean valueOf;
                String str;
                NewsfeedCommentsBaseDto newsfeedCommentsBaseDto2;
                ArrayList arrayList2;
                BaseLikesDto baseLikesDto;
                ArrayList arrayList3;
                ArrayList arrayList4;
                Boolean valueOf2;
                Boolean valueOf3;
                Integer valueOf4;
                Integer num;
                Object obj;
                Object obj2;
                VideoAccessInfoDto videoAccessInfoDto;
                NewsfeedCommentsBaseDto newsfeedCommentsBaseDto3;
                ?? arrayList5;
                BaseLikesDto baseLikesDto2;
                Object obj3;
                BaseBoolIntDto baseBoolIntDto2;
                NewsfeedCommentsBaseDto newsfeedCommentsBaseDto4;
                ?? arrayList6;
                BaseLikesDto baseLikesDto3;
                List list;
                Integer num2;
                Integer num3;
                Integer num4;
                List arrayList7;
                Integer num5;
                String readString = parcel.readString();
                NewsfeedCommentsBaseDto createFromParcel = parcel.readInt() == 0 ? null : NewsfeedCommentsBaseDto.CREATOR.createFromParcel(parcel);
                BaseLikesDto baseLikesDto4 = (BaseLikesDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                TypeDto createFromParcel2 = parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel);
                ResponseTypeDto createFromParcel3 = parcel.readInt() == 0 ? null : ResponseTypeDto.CREATOR.createFromParcel(parcel);
                String readString2 = parcel.readString();
                Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                VideoAdsInfoDto videoAdsInfoDto = (VideoAdsInfoDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto3 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto4 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto5 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto6 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                BaseBoolIntDto baseBoolIntDto7 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto8 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto9 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto10 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto11 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto12 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                BaseBoolIntDto baseBoolIntDto13 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto14 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                VideoVideoDownloadDto videoVideoDownloadDto = (VideoVideoDownloadDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    newsfeedCommentsBaseDto = createFromParcel;
                    baseBoolIntDto = baseBoolIntDto7;
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    newsfeedCommentsBaseDto = createFromParcel;
                    arrayList = new ArrayList(readInt);
                    baseBoolIntDto = baseBoolIntDto7;
                    int i = 0;
                    while (i != readInt) {
                        i = bo.b(NewsfeedCommentsItemTypeVideoDto.class, parcel, arrayList, i, 1);
                        readInt = readInt;
                    }
                }
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Boolean bool = valueOf;
                BaseBoolIntDto baseBoolIntDto15 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto16 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto17 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer num6 = valueOf8;
                Integer num7 = valueOf5;
                Integer num8 = valueOf6;
                ArrayList arrayList8 = arrayList;
                NewsfeedCommentsBaseDto newsfeedCommentsBaseDto5 = newsfeedCommentsBaseDto;
                Integer num9 = valueOf7;
                String readString3 = parcel.readString();
                Integer valueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    str = readString;
                    newsfeedCommentsBaseDto2 = newsfeedCommentsBaseDto5;
                    baseLikesDto = baseLikesDto4;
                    arrayList2 = null;
                } else {
                    str = readString;
                    int readInt2 = parcel.readInt();
                    newsfeedCommentsBaseDto2 = newsfeedCommentsBaseDto5;
                    arrayList2 = new ArrayList(readInt2);
                    baseLikesDto = baseLikesDto4;
                    int i2 = 0;
                    while (i2 != readInt2) {
                        i2 = bo.b(NewsfeedCommentsItemTypeVideoDto.class, parcel, arrayList2, i2, 1);
                        readInt2 = readInt2;
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList4 = arrayList2;
                    arrayList3 = null;
                } else {
                    int readInt3 = parcel.readInt();
                    arrayList3 = new ArrayList(readInt3);
                    arrayList4 = arrayList2;
                    int i3 = 0;
                    while (i3 != readInt3) {
                        i3 = bo.b(NewsfeedCommentsItemTypeVideoDto.class, parcel, arrayList3, i3, 1);
                        readInt3 = readInt3;
                    }
                }
                Integer valueOf11 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf12 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf13 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                ArrayList arrayList9 = arrayList3;
                UserId userId = (UserId) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                UserId userId2 = (UserId) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Integer num10 = valueOf10;
                Integer num11 = valueOf12;
                BaseLikesDto baseLikesDto5 = baseLikesDto;
                String str2 = str;
                Integer num12 = valueOf13;
                String readString4 = parcel.readString();
                BaseBoolIntDto baseBoolIntDto18 = baseBoolIntDto;
                Integer num13 = valueOf9;
                String readString5 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                BasePropertyExistsDto basePropertyExistsDto = (BasePropertyExistsDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                String readString6 = parcel.readString();
                BasePropertyExistsDto basePropertyExistsDto2 = (BasePropertyExistsDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto19 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                MediaRestrictionDto mediaRestrictionDto = (MediaRestrictionDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto20 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto21 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                String readString7 = parcel.readString();
                VideoVideoTrackingInfoDto videoVideoTrackingInfoDto = (VideoVideoTrackingInfoDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                BasePropertyExistsDto basePropertyExistsDto3 = (BasePropertyExistsDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                String readString8 = parcel.readString();
                Integer valueOf14 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf15 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                    num = null;
                } else {
                    valueOf4 = Integer.valueOf(parcel.readInt());
                    num = null;
                }
                String readString9 = parcel.readString();
                Integer valueOf16 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
                ArrayList arrayList10 = arrayList4;
                Boolean bool2 = valueOf2;
                Integer num14 = valueOf15;
                String readString10 = parcel.readString();
                Integer valueOf17 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
                VideoLiveStatusDto videoLiveStatusDto = (VideoLiveStatusDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                Integer valueOf18 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
                BaseBoolIntDto baseBoolIntDto22 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                Integer valueOf19 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
                String readString11 = parcel.readString();
                BaseRepostsInfoDto baseRepostsInfoDto = (BaseRepostsInfoDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                Integer valueOf20 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
                BasePropertyExistsDto basePropertyExistsDto4 = (BasePropertyExistsDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto23 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                Integer valueOf21 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
                Integer valueOf22 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
                Integer num15 = valueOf14;
                Integer num16 = valueOf16;
                Integer num17 = valueOf18;
                String readString12 = parcel.readString();
                Integer num18 = valueOf11;
                NewsfeedCommentsBaseDto newsfeedCommentsBaseDto6 = newsfeedCommentsBaseDto2;
                Boolean bool3 = valueOf3;
                Integer num19 = valueOf4;
                Integer num20 = valueOf17;
                Integer num21 = valueOf19;
                String readString13 = parcel.readString();
                Integer valueOf23 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    obj = num;
                } else {
                    obj = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    obj2 = num;
                } else {
                    obj2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                BaseBoolIntDto baseBoolIntDto24 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                ActionLinksActionDto actionLinksActionDto = (ActionLinksActionDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                Integer valueOf24 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
                ?? r77 = obj2;
                String readString14 = parcel.readString();
                VideoAccessInfoDto videoAccessInfoDto2 = (VideoAccessInfoDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                Integer valueOf25 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    videoAccessInfoDto = videoAccessInfoDto2;
                    newsfeedCommentsBaseDto3 = newsfeedCommentsBaseDto6;
                    baseLikesDto2 = baseLikesDto5;
                    arrayList5 = num;
                } else {
                    videoAccessInfoDto = videoAccessInfoDto2;
                    int readInt4 = parcel.readInt();
                    newsfeedCommentsBaseDto3 = newsfeedCommentsBaseDto6;
                    arrayList5 = new ArrayList(readInt4);
                    baseLikesDto2 = baseLikesDto5;
                    int i4 = 0;
                    while (i4 != readInt4) {
                        i4 = bo.b(NewsfeedCommentsItemTypeVideoDto.class, parcel, arrayList5, i4, 1);
                        readInt4 = readInt4;
                    }
                }
                Integer valueOf26 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
                Integer num22 = valueOf21;
                Integer num23 = valueOf23;
                String readString15 = parcel.readString();
                if (parcel.readInt() == 0) {
                    obj3 = num;
                } else {
                    obj3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                VideoAccessInfoDto videoAccessInfoDto3 = videoAccessInfoDto;
                String readString16 = parcel.readString();
                Integer num24 = num;
                Integer num25 = valueOf20;
                Integer num26 = valueOf22;
                ?? r76 = obj;
                Integer num27 = valueOf24;
                List list2 = arrayList5;
                NewsfeedCommentsBaseDto newsfeedCommentsBaseDto7 = newsfeedCommentsBaseDto3;
                String readString17 = parcel.readString();
                Integer num28 = valueOf26;
                BaseLikesDto baseLikesDto6 = baseLikesDto2;
                String readString18 = parcel.readString();
                Integer num29 = valueOf25;
                ?? r87 = obj3;
                String readString19 = parcel.readString();
                VideoDonutDto videoDonutDto = (VideoDonutDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto25 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto26 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto27 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    baseBoolIntDto2 = baseBoolIntDto27;
                    newsfeedCommentsBaseDto4 = newsfeedCommentsBaseDto7;
                    baseLikesDto3 = baseLikesDto6;
                    arrayList6 = num24;
                } else {
                    baseBoolIntDto2 = baseBoolIntDto27;
                    int readInt5 = parcel.readInt();
                    newsfeedCommentsBaseDto4 = newsfeedCommentsBaseDto7;
                    arrayList6 = new ArrayList(readInt5);
                    baseLikesDto3 = baseLikesDto6;
                    int i5 = 0;
                    while (i5 != readInt5) {
                        i5 = bo.b(NewsfeedCommentsItemTypeVideoDto.class, parcel, arrayList6, i5, 1);
                        readInt5 = readInt5;
                    }
                }
                if (parcel.readInt() == 0) {
                    list = arrayList6;
                    Integer num30 = num24;
                    num2 = num30;
                    num3 = num30;
                } else {
                    int readInt6 = parcel.readInt();
                    ?? arrayList11 = new ArrayList(readInt6);
                    list = arrayList6;
                    int i6 = 0;
                    while (i6 != readInt6) {
                        i6 = bo.b(NewsfeedCommentsItemTypeVideoDto.class, parcel, arrayList11, i6, 1);
                        readInt6 = readInt6;
                    }
                    num2 = num24;
                    num3 = arrayList11;
                }
                String readString20 = parcel.readString();
                Integer valueOf27 = parcel.readInt() == 0 ? num2 : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    num4 = num3;
                    arrayList7 = num2;
                    num5 = valueOf27;
                } else {
                    int readInt7 = parcel.readInt();
                    num4 = num3;
                    arrayList7 = new ArrayList(readInt7);
                    num5 = valueOf27;
                    int i7 = 0;
                    while (i7 != readInt7) {
                        i7 = bo.b(NewsfeedCommentsItemTypeVideoDto.class, parcel, arrayList7, i7, 1);
                        readInt7 = readInt7;
                    }
                }
                return new NewsfeedCommentsItemTypeVideoDto(str2, newsfeedCommentsBaseDto4, baseLikesDto3, createFromParcel2, createFromParcel3, readString2, num7, videoAdsInfoDto, baseBoolIntDto3, baseBoolIntDto4, baseBoolIntDto5, baseBoolIntDto6, num8, baseBoolIntDto18, baseBoolIntDto8, baseBoolIntDto9, baseBoolIntDto10, baseBoolIntDto11, baseBoolIntDto12, num9, baseBoolIntDto13, baseBoolIntDto14, videoVideoDownloadDto, arrayList8, bool, num6, baseBoolIntDto15, baseBoolIntDto16, baseBoolIntDto17, num13, readString3, num10, arrayList10, arrayList9, num18, num11, num12, userId, userId2, bool2, readString4, readString5, bool3, basePropertyExistsDto, readString6, basePropertyExistsDto2, baseBoolIntDto19, mediaRestrictionDto, baseBoolIntDto20, baseBoolIntDto21, readString7, videoVideoTrackingInfoDto, basePropertyExistsDto3, readString8, num15, num14, num19, readString9, num16, readString10, num20, videoLiveStatusDto, num17, baseBoolIntDto22, num21, readString11, baseRepostsInfoDto, num25, basePropertyExistsDto4, baseBoolIntDto23, num22, num26, readString12, readString13, num23, r76, r77, baseBoolIntDto24, actionLinksActionDto, num27, readString14, videoAccessInfoDto3, num29, list2, num28, readString15, r87, readString16, readString17, readString18, readString19, videoDonutDto, baseBoolIntDto25, baseBoolIntDto26, baseBoolIntDto2, list, num4, readString20, num5, arrayList7, (UserId) parcel.readParcelable(NewsfeedCommentsItemTypeVideoDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedCommentsItemTypeVideoDto[] newArray(int i) {
                return new NewsfeedCommentsItemTypeVideoDto[i];
            }
        }

        public NewsfeedCommentsItemTypeVideoDto() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, 63, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedCommentsItemTypeVideoDto)) {
                return false;
            }
            NewsfeedCommentsItemTypeVideoDto newsfeedCommentsItemTypeVideoDto = (NewsfeedCommentsItemTypeVideoDto) obj;
            return epx.f(this.text, newsfeedCommentsItemTypeVideoDto.text) && epx.f(this.comments, newsfeedCommentsItemTypeVideoDto.comments) && epx.f(this.likes, newsfeedCommentsItemTypeVideoDto.likes) && this.type == newsfeedCommentsItemTypeVideoDto.type && this.responseType == newsfeedCommentsItemTypeVideoDto.responseType && epx.f(this.accessKey, newsfeedCommentsItemTypeVideoDto.accessKey) && epx.f(this.addingDate, newsfeedCommentsItemTypeVideoDto.addingDate) && epx.f(this.adsInfo, newsfeedCommentsItemTypeVideoDto.adsInfo) && this.canComment == newsfeedCommentsItemTypeVideoDto.canComment && this.canEdit == newsfeedCommentsItemTypeVideoDto.canEdit && this.canDelete == newsfeedCommentsItemTypeVideoDto.canDelete && this.canLike == newsfeedCommentsItemTypeVideoDto.canLike && epx.f(this.canRepost, newsfeedCommentsItemTypeVideoDto.canRepost) && this.canSubscribe == newsfeedCommentsItemTypeVideoDto.canSubscribe && this.canBePromoted == newsfeedCommentsItemTypeVideoDto.canBePromoted && this.canAddToFaves == newsfeedCommentsItemTypeVideoDto.canAddToFaves && this.canAdd == newsfeedCommentsItemTypeVideoDto.canAdd && this.canAttachLink == newsfeedCommentsItemTypeVideoDto.canAttachLink && this.canPlayInBackground == newsfeedCommentsItemTypeVideoDto.canPlayInBackground && epx.f(this.canDownload, newsfeedCommentsItemTypeVideoDto.canDownload) && this.canEditPrivacy == newsfeedCommentsItemTypeVideoDto.canEditPrivacy && this.canRemoveFromRecommendations == newsfeedCommentsItemTypeVideoDto.canRemoveFromRecommendations && epx.f(this.download, newsfeedCommentsItemTypeVideoDto.download) && epx.f(this.linkedToPlaylistMarks, newsfeedCommentsItemTypeVideoDto.linkedToPlaylistMarks) && epx.f(this.isArchivalContent, newsfeedCommentsItemTypeVideoDto.isArchivalContent) && epx.f(this.archivalContentPublishedDate, newsfeedCommentsItemTypeVideoDto.archivalContentPublishedDate) && this.isPrivate == newsfeedCommentsItemTypeVideoDto.isPrivate && this.isFromMessage == newsfeedCommentsItemTypeVideoDto.isFromMessage && this.isDraft == newsfeedCommentsItemTypeVideoDto.isDraft && epx.f(this.date, newsfeedCommentsItemTypeVideoDto.date) && epx.f(this.description, newsfeedCommentsItemTypeVideoDto.description) && epx.f(this.duration, newsfeedCommentsItemTypeVideoDto.duration) && epx.f(this.image, newsfeedCommentsItemTypeVideoDto.image) && epx.f(this.firstFrame, newsfeedCommentsItemTypeVideoDto.firstFrame) && epx.f(this.width, newsfeedCommentsItemTypeVideoDto.width) && epx.f(this.height, newsfeedCommentsItemTypeVideoDto.height) && epx.f(this.id, newsfeedCommentsItemTypeVideoDto.id) && epx.f(this.ownerId, newsfeedCommentsItemTypeVideoDto.ownerId) && epx.f(this.userId, newsfeedCommentsItemTypeVideoDto.userId) && epx.f(this.isAuthor, newsfeedCommentsItemTypeVideoDto.isAuthor) && epx.f(this.ovId, newsfeedCommentsItemTypeVideoDto.ovId) && epx.f(this.title, newsfeedCommentsItemTypeVideoDto.title) && epx.f(this.isFavorite, newsfeedCommentsItemTypeVideoDto.isFavorite) && this.noAutoplay == newsfeedCommentsItemTypeVideoDto.noAutoplay && epx.f(this.player, newsfeedCommentsItemTypeVideoDto.player) && this.processing == newsfeedCommentsItemTypeVideoDto.processing && this.converting == newsfeedCommentsItemTypeVideoDto.converting && epx.f(this.restriction, newsfeedCommentsItemTypeVideoDto.restriction) && this.added == newsfeedCommentsItemTypeVideoDto.added && this.isSubscribed == newsfeedCommentsItemTypeVideoDto.isSubscribed && epx.f(this.trackCode, newsfeedCommentsItemTypeVideoDto.trackCode) && epx.f(this.trackingInfo, newsfeedCommentsItemTypeVideoDto.trackingInfo) && this.repeat == newsfeedCommentsItemTypeVideoDto.repeat && epx.f(this.partnerText, newsfeedCommentsItemTypeVideoDto.partnerText) && epx.f(this.views, newsfeedCommentsItemTypeVideoDto.views) && epx.f(this.localViews, newsfeedCommentsItemTypeVideoDto.localViews) && epx.f(this.contentRestricted, newsfeedCommentsItemTypeVideoDto.contentRestricted) && epx.f(this.contentRestrictedMessage, newsfeedCommentsItemTypeVideoDto.contentRestrictedMessage) && epx.f(this.albumId, newsfeedCommentsItemTypeVideoDto.albumId) && epx.f(this.context, newsfeedCommentsItemTypeVideoDto.context) && epx.f(this.balance, newsfeedCommentsItemTypeVideoDto.balance) && this.liveStatus == newsfeedCommentsItemTypeVideoDto.liveStatus && epx.f(this.liveStartTime, newsfeedCommentsItemTypeVideoDto.liveStartTime) && this.liveNotify == newsfeedCommentsItemTypeVideoDto.liveNotify && epx.f(this.spectators, newsfeedCommentsItemTypeVideoDto.spectators) && epx.f(this.platform, newsfeedCommentsItemTypeVideoDto.platform) && epx.f(this.reposts, newsfeedCommentsItemTypeVideoDto.reposts) && epx.f(this.moderationStatus, newsfeedCommentsItemTypeVideoDto.moderationStatus) && this.needMute == newsfeedCommentsItemTypeVideoDto.needMute && this.isUnitedVideo == newsfeedCommentsItemTypeVideoDto.isUnitedVideo && epx.f(this.umaTrackId, newsfeedCommentsItemTypeVideoDto.umaTrackId) && epx.f(this.ovProviderId, newsfeedCommentsItemTypeVideoDto.ovProviderId) && epx.f(this.randomTag, newsfeedCommentsItemTypeVideoDto.randomTag) && epx.f(this.uvStatsPlace, newsfeedCommentsItemTypeVideoDto.uvStatsPlace) && epx.f(this.server, newsfeedCommentsItemTypeVideoDto.server) && epx.f(this.isMobileLive, newsfeedCommentsItemTypeVideoDto.isMobileLive) && epx.f(this.isSpherical, newsfeedCommentsItemTypeVideoDto.isSpherical) && this.canDislike == newsfeedCommentsItemTypeVideoDto.canDislike && epx.f(this.titleAction, newsfeedCommentsItemTypeVideoDto.titleAction) && epx.f(this.publishedAt, newsfeedCommentsItemTypeVideoDto.publishedAt) && epx.f(this.thumbHash, newsfeedCommentsItemTypeVideoDto.thumbHash) && epx.f(this.accessInfo, newsfeedCommentsItemTypeVideoDto.accessInfo) && epx.f(this.wallPostId, newsfeedCommentsItemTypeVideoDto.wallPostId) && epx.f(this.adsStatPixels, newsfeedCommentsItemTypeVideoDto.adsStatPixels) && epx.f(this.donutLevelId, newsfeedCommentsItemTypeVideoDto.donutLevelId) && epx.f(this.promoPostHash, newsfeedCommentsItemTypeVideoDto.promoPostHash) && epx.f(this.shouldStretch, newsfeedCommentsItemTypeVideoDto.shouldStretch) && epx.f(this.vkLiveChannelUrl, newsfeedCommentsItemTypeVideoDto.vkLiveChannelUrl) && epx.f(this.vkLiveChannelName, newsfeedCommentsItemTypeVideoDto.vkLiveChannelName) && epx.f(this.vkLiveVideoId, newsfeedCommentsItemTypeVideoDto.vkLiveVideoId) && epx.f(this.vkLiveSlotUrl, newsfeedCommentsItemTypeVideoDto.vkLiveSlotUrl) && epx.f(this.donut, newsfeedCommentsItemTypeVideoDto.donut) && this.canReport == newsfeedCommentsItemTypeVideoDto.canReport && this.canCutToShortVideo == newsfeedCommentsItemTypeVideoDto.canCutToShortVideo && this.isExplicit == newsfeedCommentsItemTypeVideoDto.isExplicit && epx.f(this.mainArtists, newsfeedCommentsItemTypeVideoDto.mainArtists) && epx.f(this.featuredArtists, newsfeedCommentsItemTypeVideoDto.featuredArtists) && epx.f(this.subtitle, newsfeedCommentsItemTypeVideoDto.subtitle) && epx.f(this.releaseDate, newsfeedCommentsItemTypeVideoDto.releaseDate) && epx.f(this.genres, newsfeedCommentsItemTypeVideoDto.genres) && epx.f(this.sourceId, newsfeedCommentsItemTypeVideoDto.sourceId) && epx.f(this.postId, newsfeedCommentsItemTypeVideoDto.postId);
        }

        public final int hashCode() {
            String str = this.text;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            NewsfeedCommentsBaseDto newsfeedCommentsBaseDto = this.comments;
            int hashCode2 = (hashCode + (newsfeedCommentsBaseDto == null ? 0 : newsfeedCommentsBaseDto.hashCode())) * 31;
            BaseLikesDto baseLikesDto = this.likes;
            int hashCode3 = (hashCode2 + (baseLikesDto == null ? 0 : baseLikesDto.hashCode())) * 31;
            TypeDto typeDto = this.type;
            int hashCode4 = (hashCode3 + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
            ResponseTypeDto responseTypeDto = this.responseType;
            int hashCode5 = (hashCode4 + (responseTypeDto == null ? 0 : responseTypeDto.hashCode())) * 31;
            String str2 = this.accessKey;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.addingDate;
            int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
            VideoAdsInfoDto videoAdsInfoDto = this.adsInfo;
            int hashCode8 = (hashCode7 + (videoAdsInfoDto == null ? 0 : videoAdsInfoDto.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto = this.canComment;
            int hashCode9 = (hashCode8 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto2 = this.canEdit;
            int hashCode10 = (hashCode9 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto3 = this.canDelete;
            int hashCode11 = (hashCode10 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto4 = this.canLike;
            int hashCode12 = (hashCode11 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
            Integer num2 = this.canRepost;
            int hashCode13 = (hashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto5 = this.canSubscribe;
            int hashCode14 = (hashCode13 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto6 = this.canBePromoted;
            int hashCode15 = (hashCode14 + (baseBoolIntDto6 == null ? 0 : baseBoolIntDto6.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto7 = this.canAddToFaves;
            int hashCode16 = (hashCode15 + (baseBoolIntDto7 == null ? 0 : baseBoolIntDto7.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto8 = this.canAdd;
            int hashCode17 = (hashCode16 + (baseBoolIntDto8 == null ? 0 : baseBoolIntDto8.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto9 = this.canAttachLink;
            int hashCode18 = (hashCode17 + (baseBoolIntDto9 == null ? 0 : baseBoolIntDto9.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto10 = this.canPlayInBackground;
            int hashCode19 = (hashCode18 + (baseBoolIntDto10 == null ? 0 : baseBoolIntDto10.hashCode())) * 31;
            Integer num3 = this.canDownload;
            int hashCode20 = (hashCode19 + (num3 == null ? 0 : num3.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto11 = this.canEditPrivacy;
            int hashCode21 = (hashCode20 + (baseBoolIntDto11 == null ? 0 : baseBoolIntDto11.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto12 = this.canRemoveFromRecommendations;
            int hashCode22 = (hashCode21 + (baseBoolIntDto12 == null ? 0 : baseBoolIntDto12.hashCode())) * 31;
            VideoVideoDownloadDto videoVideoDownloadDto = this.download;
            int hashCode23 = (hashCode22 + (videoVideoDownloadDto == null ? 0 : videoVideoDownloadDto.hashCode())) * 31;
            List<VideoLinkedToPlaylistMarkDto> list = this.linkedToPlaylistMarks;
            int hashCode24 = (hashCode23 + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.isArchivalContent;
            int hashCode25 = (hashCode24 + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num4 = this.archivalContentPublishedDate;
            int hashCode26 = (hashCode25 + (num4 == null ? 0 : num4.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto13 = this.isPrivate;
            int hashCode27 = (hashCode26 + (baseBoolIntDto13 == null ? 0 : baseBoolIntDto13.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto14 = this.isFromMessage;
            int hashCode28 = (hashCode27 + (baseBoolIntDto14 == null ? 0 : baseBoolIntDto14.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto15 = this.isDraft;
            int hashCode29 = (hashCode28 + (baseBoolIntDto15 == null ? 0 : baseBoolIntDto15.hashCode())) * 31;
            Integer num5 = this.date;
            int hashCode30 = (hashCode29 + (num5 == null ? 0 : num5.hashCode())) * 31;
            String str3 = this.description;
            int hashCode31 = (hashCode30 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num6 = this.duration;
            int hashCode32 = (hashCode31 + (num6 == null ? 0 : num6.hashCode())) * 31;
            List<VideoVideoImageDto> list2 = this.image;
            int hashCode33 = (hashCode32 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<VideoVideoImageDto> list3 = this.firstFrame;
            int hashCode34 = (hashCode33 + (list3 == null ? 0 : list3.hashCode())) * 31;
            Integer num7 = this.width;
            int hashCode35 = (hashCode34 + (num7 == null ? 0 : num7.hashCode())) * 31;
            Integer num8 = this.height;
            int hashCode36 = (hashCode35 + (num8 == null ? 0 : num8.hashCode())) * 31;
            Integer num9 = this.id;
            int hashCode37 = (hashCode36 + (num9 == null ? 0 : num9.hashCode())) * 31;
            UserId userId = this.ownerId;
            int hashCode38 = (hashCode37 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            UserId userId2 = this.userId;
            int hashCode39 = (hashCode38 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
            Boolean bool2 = this.isAuthor;
            int hashCode40 = (hashCode39 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str4 = this.ovId;
            int hashCode41 = (hashCode40 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.title;
            int hashCode42 = (hashCode41 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Boolean bool3 = this.isFavorite;
            int hashCode43 = (hashCode42 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            BasePropertyExistsDto basePropertyExistsDto = this.noAutoplay;
            int hashCode44 = (hashCode43 + (basePropertyExistsDto == null ? 0 : basePropertyExistsDto.hashCode())) * 31;
            String str6 = this.player;
            int hashCode45 = (hashCode44 + (str6 == null ? 0 : str6.hashCode())) * 31;
            BasePropertyExistsDto basePropertyExistsDto2 = this.processing;
            int hashCode46 = (hashCode45 + (basePropertyExistsDto2 == null ? 0 : basePropertyExistsDto2.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto16 = this.converting;
            int hashCode47 = (hashCode46 + (baseBoolIntDto16 == null ? 0 : baseBoolIntDto16.hashCode())) * 31;
            MediaRestrictionDto mediaRestrictionDto = this.restriction;
            int hashCode48 = (hashCode47 + (mediaRestrictionDto == null ? 0 : mediaRestrictionDto.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto17 = this.added;
            int hashCode49 = (hashCode48 + (baseBoolIntDto17 == null ? 0 : baseBoolIntDto17.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto18 = this.isSubscribed;
            int hashCode50 = (hashCode49 + (baseBoolIntDto18 == null ? 0 : baseBoolIntDto18.hashCode())) * 31;
            String str7 = this.trackCode;
            int hashCode51 = (hashCode50 + (str7 == null ? 0 : str7.hashCode())) * 31;
            VideoVideoTrackingInfoDto videoVideoTrackingInfoDto = this.trackingInfo;
            int hashCode52 = (hashCode51 + (videoVideoTrackingInfoDto == null ? 0 : videoVideoTrackingInfoDto.hashCode())) * 31;
            BasePropertyExistsDto basePropertyExistsDto3 = this.repeat;
            int hashCode53 = (hashCode52 + (basePropertyExistsDto3 == null ? 0 : basePropertyExistsDto3.hashCode())) * 31;
            String str8 = this.partnerText;
            int hashCode54 = (hashCode53 + (str8 == null ? 0 : str8.hashCode())) * 31;
            Integer num10 = this.views;
            int hashCode55 = (hashCode54 + (num10 == null ? 0 : num10.hashCode())) * 31;
            Integer num11 = this.localViews;
            int hashCode56 = (hashCode55 + (num11 == null ? 0 : num11.hashCode())) * 31;
            Integer num12 = this.contentRestricted;
            int hashCode57 = (hashCode56 + (num12 == null ? 0 : num12.hashCode())) * 31;
            String str9 = this.contentRestrictedMessage;
            int hashCode58 = (hashCode57 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Integer num13 = this.albumId;
            int hashCode59 = (hashCode58 + (num13 == null ? 0 : num13.hashCode())) * 31;
            String str10 = this.context;
            int hashCode60 = (hashCode59 + (str10 == null ? 0 : str10.hashCode())) * 31;
            Integer num14 = this.balance;
            int hashCode61 = (hashCode60 + (num14 == null ? 0 : num14.hashCode())) * 31;
            VideoLiveStatusDto videoLiveStatusDto = this.liveStatus;
            int hashCode62 = (hashCode61 + (videoLiveStatusDto == null ? 0 : videoLiveStatusDto.hashCode())) * 31;
            Integer num15 = this.liveStartTime;
            int hashCode63 = (hashCode62 + (num15 == null ? 0 : num15.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto19 = this.liveNotify;
            int hashCode64 = (hashCode63 + (baseBoolIntDto19 == null ? 0 : baseBoolIntDto19.hashCode())) * 31;
            Integer num16 = this.spectators;
            int hashCode65 = (hashCode64 + (num16 == null ? 0 : num16.hashCode())) * 31;
            String str11 = this.platform;
            int hashCode66 = (hashCode65 + (str11 == null ? 0 : str11.hashCode())) * 31;
            BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
            int hashCode67 = (hashCode66 + (baseRepostsInfoDto == null ? 0 : baseRepostsInfoDto.hashCode())) * 31;
            Integer num17 = this.moderationStatus;
            int hashCode68 = (hashCode67 + (num17 == null ? 0 : num17.hashCode())) * 31;
            BasePropertyExistsDto basePropertyExistsDto4 = this.needMute;
            int hashCode69 = (hashCode68 + (basePropertyExistsDto4 == null ? 0 : basePropertyExistsDto4.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto20 = this.isUnitedVideo;
            int hashCode70 = (hashCode69 + (baseBoolIntDto20 == null ? 0 : baseBoolIntDto20.hashCode())) * 31;
            Integer num18 = this.umaTrackId;
            int hashCode71 = (hashCode70 + (num18 == null ? 0 : num18.hashCode())) * 31;
            Integer num19 = this.ovProviderId;
            int hashCode72 = (hashCode71 + (num19 == null ? 0 : num19.hashCode())) * 31;
            String str12 = this.randomTag;
            int hashCode73 = (hashCode72 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.uvStatsPlace;
            int hashCode74 = (hashCode73 + (str13 == null ? 0 : str13.hashCode())) * 31;
            Integer num20 = this.server;
            int hashCode75 = (hashCode74 + (num20 == null ? 0 : num20.hashCode())) * 31;
            Boolean bool4 = this.isMobileLive;
            int hashCode76 = (hashCode75 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.isSpherical;
            int hashCode77 = (hashCode76 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto21 = this.canDislike;
            int hashCode78 = (hashCode77 + (baseBoolIntDto21 == null ? 0 : baseBoolIntDto21.hashCode())) * 31;
            ActionLinksActionDto actionLinksActionDto = this.titleAction;
            int hashCode79 = (hashCode78 + (actionLinksActionDto == null ? 0 : actionLinksActionDto.hashCode())) * 31;
            Integer num21 = this.publishedAt;
            int hashCode80 = (hashCode79 + (num21 == null ? 0 : num21.hashCode())) * 31;
            String str14 = this.thumbHash;
            int hashCode81 = (hashCode80 + (str14 == null ? 0 : str14.hashCode())) * 31;
            VideoAccessInfoDto videoAccessInfoDto = this.accessInfo;
            int hashCode82 = (hashCode81 + (videoAccessInfoDto == null ? 0 : videoAccessInfoDto.hashCode())) * 31;
            Integer num22 = this.wallPostId;
            int hashCode83 = (hashCode82 + (num22 == null ? 0 : num22.hashCode())) * 31;
            List<AdsItemBlockAdStatPixelDto> list4 = this.adsStatPixels;
            int hashCode84 = (hashCode83 + (list4 == null ? 0 : list4.hashCode())) * 31;
            Integer num23 = this.donutLevelId;
            int hashCode85 = (hashCode84 + (num23 == null ? 0 : num23.hashCode())) * 31;
            String str15 = this.promoPostHash;
            int hashCode86 = (hashCode85 + (str15 == null ? 0 : str15.hashCode())) * 31;
            Boolean bool6 = this.shouldStretch;
            int hashCode87 = (hashCode86 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            String str16 = this.vkLiveChannelUrl;
            int hashCode88 = (hashCode87 + (str16 == null ? 0 : str16.hashCode())) * 31;
            String str17 = this.vkLiveChannelName;
            int hashCode89 = (hashCode88 + (str17 == null ? 0 : str17.hashCode())) * 31;
            String str18 = this.vkLiveVideoId;
            int hashCode90 = (hashCode89 + (str18 == null ? 0 : str18.hashCode())) * 31;
            String str19 = this.vkLiveSlotUrl;
            int hashCode91 = (hashCode90 + (str19 == null ? 0 : str19.hashCode())) * 31;
            VideoDonutDto videoDonutDto = this.donut;
            int hashCode92 = (hashCode91 + (videoDonutDto == null ? 0 : videoDonutDto.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto22 = this.canReport;
            int hashCode93 = (hashCode92 + (baseBoolIntDto22 == null ? 0 : baseBoolIntDto22.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto23 = this.canCutToShortVideo;
            int hashCode94 = (hashCode93 + (baseBoolIntDto23 == null ? 0 : baseBoolIntDto23.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto24 = this.isExplicit;
            int hashCode95 = (hashCode94 + (baseBoolIntDto24 == null ? 0 : baseBoolIntDto24.hashCode())) * 31;
            List<AudioArtistDto> list5 = this.mainArtists;
            int hashCode96 = (hashCode95 + (list5 == null ? 0 : list5.hashCode())) * 31;
            List<AudioArtistDto> list6 = this.featuredArtists;
            int hashCode97 = (hashCode96 + (list6 == null ? 0 : list6.hashCode())) * 31;
            String str20 = this.subtitle;
            int hashCode98 = (hashCode97 + (str20 == null ? 0 : str20.hashCode())) * 31;
            Integer num24 = this.releaseDate;
            int hashCode99 = (hashCode98 + (num24 == null ? 0 : num24.hashCode())) * 31;
            List<AudioGenreDto> list7 = this.genres;
            int hashCode100 = (hashCode99 + (list7 == null ? 0 : list7.hashCode())) * 31;
            UserId userId3 = this.sourceId;
            int hashCode101 = (hashCode100 + (userId3 == null ? 0 : Long.hashCode(userId3.b))) * 31;
            Integer num25 = this.postId;
            return hashCode101 + (num25 != null ? num25.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedCommentsItemTypeVideoDto(text=");
            sb.append(this.text);
            sb.append(", comments=");
            sb.append(this.comments);
            sb.append(", likes=");
            sb.append(this.likes);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", responseType=");
            sb.append(this.responseType);
            sb.append(", accessKey=");
            sb.append(this.accessKey);
            sb.append(", addingDate=");
            sb.append(this.addingDate);
            sb.append(", adsInfo=");
            sb.append(this.adsInfo);
            sb.append(", canComment=");
            sb.append(this.canComment);
            sb.append(", canEdit=");
            sb.append(this.canEdit);
            sb.append(", canDelete=");
            sb.append(this.canDelete);
            sb.append(", canLike=");
            sb.append(this.canLike);
            sb.append(", canRepost=");
            sb.append(this.canRepost);
            sb.append(", canSubscribe=");
            sb.append(this.canSubscribe);
            sb.append(", canBePromoted=");
            sb.append(this.canBePromoted);
            sb.append(", canAddToFaves=");
            sb.append(this.canAddToFaves);
            sb.append(", canAdd=");
            sb.append(this.canAdd);
            sb.append(", canAttachLink=");
            sb.append(this.canAttachLink);
            sb.append(", canPlayInBackground=");
            sb.append(this.canPlayInBackground);
            sb.append(", canDownload=");
            sb.append(this.canDownload);
            sb.append(", canEditPrivacy=");
            sb.append(this.canEditPrivacy);
            sb.append(", canRemoveFromRecommendations=");
            sb.append(this.canRemoveFromRecommendations);
            sb.append(", download=");
            sb.append(this.download);
            sb.append(", linkedToPlaylistMarks=");
            sb.append(this.linkedToPlaylistMarks);
            sb.append(", isArchivalContent=");
            sb.append(this.isArchivalContent);
            sb.append(", archivalContentPublishedDate=");
            sb.append(this.archivalContentPublishedDate);
            sb.append(", isPrivate=");
            sb.append(this.isPrivate);
            sb.append(", isFromMessage=");
            sb.append(this.isFromMessage);
            sb.append(", isDraft=");
            sb.append(this.isDraft);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", description=");
            sb.append(this.description);
            sb.append(", duration=");
            sb.append(this.duration);
            sb.append(", image=");
            sb.append(this.image);
            sb.append(", firstFrame=");
            sb.append(this.firstFrame);
            sb.append(", width=");
            sb.append(this.width);
            sb.append(", height=");
            sb.append(this.height);
            sb.append(", id=");
            sb.append(this.id);
            sb.append(", ownerId=");
            sb.append(this.ownerId);
            sb.append(", userId=");
            sb.append(this.userId);
            sb.append(", isAuthor=");
            sb.append(this.isAuthor);
            sb.append(", ovId=");
            sb.append(this.ovId);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", isFavorite=");
            sb.append(this.isFavorite);
            sb.append(", noAutoplay=");
            sb.append(this.noAutoplay);
            sb.append(", player=");
            sb.append(this.player);
            sb.append(", processing=");
            sb.append(this.processing);
            sb.append(", converting=");
            sb.append(this.converting);
            sb.append(", restriction=");
            sb.append(this.restriction);
            sb.append(", added=");
            sb.append(this.added);
            sb.append(", isSubscribed=");
            sb.append(this.isSubscribed);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", trackingInfo=");
            sb.append(this.trackingInfo);
            sb.append(", repeat=");
            sb.append(this.repeat);
            sb.append(", partnerText=");
            sb.append(this.partnerText);
            sb.append(", views=");
            sb.append(this.views);
            sb.append(", localViews=");
            sb.append(this.localViews);
            sb.append(", contentRestricted=");
            sb.append(this.contentRestricted);
            sb.append(", contentRestrictedMessage=");
            sb.append(this.contentRestrictedMessage);
            sb.append(", albumId=");
            sb.append(this.albumId);
            sb.append(", context=");
            sb.append(this.context);
            sb.append(", balance=");
            sb.append(this.balance);
            sb.append(", liveStatus=");
            sb.append(this.liveStatus);
            sb.append(", liveStartTime=");
            sb.append(this.liveStartTime);
            sb.append(", liveNotify=");
            sb.append(this.liveNotify);
            sb.append(", spectators=");
            sb.append(this.spectators);
            sb.append(", platform=");
            sb.append(this.platform);
            sb.append(", reposts=");
            sb.append(this.reposts);
            sb.append(", moderationStatus=");
            sb.append(this.moderationStatus);
            sb.append(", needMute=");
            sb.append(this.needMute);
            sb.append(", isUnitedVideo=");
            sb.append(this.isUnitedVideo);
            sb.append(", umaTrackId=");
            sb.append(this.umaTrackId);
            sb.append(", ovProviderId=");
            sb.append(this.ovProviderId);
            sb.append(", randomTag=");
            sb.append(this.randomTag);
            sb.append(", uvStatsPlace=");
            sb.append(this.uvStatsPlace);
            sb.append(", server=");
            sb.append(this.server);
            sb.append(", isMobileLive=");
            sb.append(this.isMobileLive);
            sb.append(", isSpherical=");
            sb.append(this.isSpherical);
            sb.append(", canDislike=");
            sb.append(this.canDislike);
            sb.append(", titleAction=");
            sb.append(this.titleAction);
            sb.append(", publishedAt=");
            sb.append(this.publishedAt);
            sb.append(", thumbHash=");
            sb.append(this.thumbHash);
            sb.append(", accessInfo=");
            sb.append(this.accessInfo);
            sb.append(", wallPostId=");
            sb.append(this.wallPostId);
            sb.append(", adsStatPixels=");
            sb.append(this.adsStatPixels);
            sb.append(", donutLevelId=");
            sb.append(this.donutLevelId);
            sb.append(", promoPostHash=");
            sb.append(this.promoPostHash);
            sb.append(", shouldStretch=");
            sb.append(this.shouldStretch);
            sb.append(", vkLiveChannelUrl=");
            sb.append(this.vkLiveChannelUrl);
            sb.append(", vkLiveChannelName=");
            sb.append(this.vkLiveChannelName);
            sb.append(", vkLiveVideoId=");
            sb.append(this.vkLiveVideoId);
            sb.append(", vkLiveSlotUrl=");
            sb.append(this.vkLiveSlotUrl);
            sb.append(", donut=");
            sb.append(this.donut);
            sb.append(", canReport=");
            sb.append(this.canReport);
            sb.append(", canCutToShortVideo=");
            sb.append(this.canCutToShortVideo);
            sb.append(", isExplicit=");
            sb.append(this.isExplicit);
            sb.append(", mainArtists=");
            sb.append(this.mainArtists);
            sb.append(", featuredArtists=");
            sb.append(this.featuredArtists);
            sb.append(", subtitle=");
            sb.append(this.subtitle);
            sb.append(", releaseDate=");
            sb.append(this.releaseDate);
            sb.append(", genres=");
            sb.append(this.genres);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", postId=");
            return uqi.b(sb, this.postId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.text);
            NewsfeedCommentsBaseDto newsfeedCommentsBaseDto = this.comments;
            if (newsfeedCommentsBaseDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedCommentsBaseDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.likes, i);
            TypeDto typeDto = this.type;
            if (typeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                typeDto.writeToParcel(parcel, i);
            }
            ResponseTypeDto responseTypeDto = this.responseType;
            if (responseTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                responseTypeDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.accessKey);
            Integer num = this.addingDate;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeParcelable(this.adsInfo, i);
            parcel.writeParcelable(this.canComment, i);
            parcel.writeParcelable(this.canEdit, i);
            parcel.writeParcelable(this.canDelete, i);
            parcel.writeParcelable(this.canLike, i);
            Integer num2 = this.canRepost;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num2);
            }
            parcel.writeParcelable(this.canSubscribe, i);
            parcel.writeParcelable(this.canBePromoted, i);
            parcel.writeParcelable(this.canAddToFaves, i);
            parcel.writeParcelable(this.canAdd, i);
            parcel.writeParcelable(this.canAttachLink, i);
            parcel.writeParcelable(this.canPlayInBackground, i);
            Integer num3 = this.canDownload;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num3);
            }
            parcel.writeParcelable(this.canEditPrivacy, i);
            parcel.writeParcelable(this.canRemoveFromRecommendations, i);
            parcel.writeParcelable(this.download, i);
            List<VideoLinkedToPlaylistMarkDto> list = this.linkedToPlaylistMarks;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    parcel.writeParcelable((Parcelable) f.next(), i);
                }
            }
            Boolean bool = this.isArchivalContent;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Integer num4 = this.archivalContentPublishedDate;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num4);
            }
            parcel.writeParcelable(this.isPrivate, i);
            parcel.writeParcelable(this.isFromMessage, i);
            parcel.writeParcelable(this.isDraft, i);
            Integer num5 = this.date;
            if (num5 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num5);
            }
            parcel.writeString(this.description);
            Integer num6 = this.duration;
            if (num6 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num6);
            }
            List<VideoVideoImageDto> list2 = this.image;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f2 = dn.f(parcel, list2, 1);
                while (f2.hasNext()) {
                    parcel.writeParcelable((Parcelable) f2.next(), i);
                }
            }
            List<VideoVideoImageDto> list3 = this.firstFrame;
            if (list3 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f3 = dn.f(parcel, list3, 1);
                while (f3.hasNext()) {
                    parcel.writeParcelable((Parcelable) f3.next(), i);
                }
            }
            Integer num7 = this.width;
            if (num7 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num7);
            }
            Integer num8 = this.height;
            if (num8 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num8);
            }
            Integer num9 = this.id;
            if (num9 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num9);
            }
            parcel.writeParcelable(this.ownerId, i);
            parcel.writeParcelable(this.userId, i);
            Boolean bool2 = this.isAuthor;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeString(this.ovId);
            parcel.writeString(this.title);
            Boolean bool3 = this.isFavorite;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeParcelable(this.noAutoplay, i);
            parcel.writeString(this.player);
            parcel.writeParcelable(this.processing, i);
            parcel.writeParcelable(this.converting, i);
            parcel.writeParcelable(this.restriction, i);
            parcel.writeParcelable(this.added, i);
            parcel.writeParcelable(this.isSubscribed, i);
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.trackingInfo, i);
            parcel.writeParcelable(this.repeat, i);
            parcel.writeString(this.partnerText);
            Integer num10 = this.views;
            if (num10 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num10);
            }
            Integer num11 = this.localViews;
            if (num11 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num11);
            }
            Integer num12 = this.contentRestricted;
            if (num12 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num12);
            }
            parcel.writeString(this.contentRestrictedMessage);
            Integer num13 = this.albumId;
            if (num13 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num13);
            }
            parcel.writeString(this.context);
            Integer num14 = this.balance;
            if (num14 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num14);
            }
            parcel.writeParcelable(this.liveStatus, i);
            Integer num15 = this.liveStartTime;
            if (num15 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num15);
            }
            parcel.writeParcelable(this.liveNotify, i);
            Integer num16 = this.spectators;
            if (num16 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num16);
            }
            parcel.writeString(this.platform);
            parcel.writeParcelable(this.reposts, i);
            Integer num17 = this.moderationStatus;
            if (num17 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num17);
            }
            parcel.writeParcelable(this.needMute, i);
            parcel.writeParcelable(this.isUnitedVideo, i);
            Integer num18 = this.umaTrackId;
            if (num18 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num18);
            }
            Integer num19 = this.ovProviderId;
            if (num19 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num19);
            }
            parcel.writeString(this.randomTag);
            parcel.writeString(this.uvStatsPlace);
            Integer num20 = this.server;
            if (num20 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num20);
            }
            Boolean bool4 = this.isMobileLive;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            Boolean bool5 = this.isSpherical;
            if (bool5 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool5);
            }
            parcel.writeParcelable(this.canDislike, i);
            parcel.writeParcelable(this.titleAction, i);
            Integer num21 = this.publishedAt;
            if (num21 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num21);
            }
            parcel.writeString(this.thumbHash);
            parcel.writeParcelable(this.accessInfo, i);
            Integer num22 = this.wallPostId;
            if (num22 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num22);
            }
            List<AdsItemBlockAdStatPixelDto> list4 = this.adsStatPixels;
            if (list4 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f4 = dn.f(parcel, list4, 1);
                while (f4.hasNext()) {
                    parcel.writeParcelable((Parcelable) f4.next(), i);
                }
            }
            Integer num23 = this.donutLevelId;
            if (num23 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num23);
            }
            parcel.writeString(this.promoPostHash);
            Boolean bool6 = this.shouldStretch;
            if (bool6 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool6);
            }
            parcel.writeString(this.vkLiveChannelUrl);
            parcel.writeString(this.vkLiveChannelName);
            parcel.writeString(this.vkLiveVideoId);
            parcel.writeString(this.vkLiveSlotUrl);
            parcel.writeParcelable(this.donut, i);
            parcel.writeParcelable(this.canReport, i);
            parcel.writeParcelable(this.canCutToShortVideo, i);
            parcel.writeParcelable(this.isExplicit, i);
            List<AudioArtistDto> list5 = this.mainArtists;
            if (list5 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f5 = dn.f(parcel, list5, 1);
                while (f5.hasNext()) {
                    parcel.writeParcelable((Parcelable) f5.next(), i);
                }
            }
            List<AudioArtistDto> list6 = this.featuredArtists;
            if (list6 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f6 = dn.f(parcel, list6, 1);
                while (f6.hasNext()) {
                    parcel.writeParcelable((Parcelable) f6.next(), i);
                }
            }
            parcel.writeString(this.subtitle);
            Integer num24 = this.releaseDate;
            if (num24 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num24);
            }
            List<AudioGenreDto> list7 = this.genres;
            if (list7 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f7 = dn.f(parcel, list7, 1);
                while (f7.hasNext()) {
                    parcel.writeParcelable((Parcelable) f7.next(), i);
                }
            }
            parcel.writeParcelable(this.sourceId, i);
            Integer num25 = this.postId;
            if (num25 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num25);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ NewsfeedCommentsItemTypeVideoDto(String str, NewsfeedCommentsBaseDto newsfeedCommentsBaseDto, BaseLikesDto baseLikesDto, TypeDto typeDto, ResponseTypeDto responseTypeDto, String str2, Integer num, VideoAdsInfoDto videoAdsInfoDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, Integer num2, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, BaseBoolIntDto baseBoolIntDto10, Integer num3, BaseBoolIntDto baseBoolIntDto11, BaseBoolIntDto baseBoolIntDto12, VideoVideoDownloadDto videoVideoDownloadDto, List list, Boolean bool, Integer num4, BaseBoolIntDto baseBoolIntDto13, BaseBoolIntDto baseBoolIntDto14, BaseBoolIntDto baseBoolIntDto15, Integer num5, String str3, Integer num6, List list2, List list3, Integer num7, Integer num8, Integer num9, UserId userId, UserId userId2, Boolean bool2, String str4, String str5, Boolean bool3, BasePropertyExistsDto basePropertyExistsDto, String str6, BasePropertyExistsDto basePropertyExistsDto2, BaseBoolIntDto baseBoolIntDto16, MediaRestrictionDto mediaRestrictionDto, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, String str7, VideoVideoTrackingInfoDto videoVideoTrackingInfoDto, BasePropertyExistsDto basePropertyExistsDto3, String str8, Integer num10, Integer num11, Integer num12, String str9, Integer num13, String str10, Integer num14, VideoLiveStatusDto videoLiveStatusDto, Integer num15, BaseBoolIntDto baseBoolIntDto19, Integer num16, String str11, BaseRepostsInfoDto baseRepostsInfoDto, Integer num17, BasePropertyExistsDto basePropertyExistsDto4, BaseBoolIntDto baseBoolIntDto20, Integer num18, Integer num19, String str12, String str13, Integer num20, Boolean bool4, Boolean bool5, BaseBoolIntDto baseBoolIntDto21, ActionLinksActionDto actionLinksActionDto, Integer num21, String str14, VideoAccessInfoDto videoAccessInfoDto, Integer num22, List list4, Integer num23, String str15, Boolean bool6, String str16, String str17, String str18, String str19, VideoDonutDto videoDonutDto, BaseBoolIntDto baseBoolIntDto22, BaseBoolIntDto baseBoolIntDto23, BaseBoolIntDto baseBoolIntDto24, List list5, List list6, String str20, Integer num24, List list7, UserId userId3, Integer num25, int i, int i2, int i3, int i4, zcl zclVar) {
            this(r85, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r4, r86, r3, r17, r19, r21, r23, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r0, (i2 & 1) != 0 ? null : list2, (i2 & 2) != 0 ? null : list3, (i2 & 4) != 0 ? null : num7, (i2 & 8) != 0 ? null : num8, (i2 & 16) != 0 ? null : num9, (i2 & 32) != 0 ? null : userId, (i2 & 64) != 0 ? null : userId2, (i2 & 128) != 0 ? null : bool2, (i2 & 256) != 0 ? null : str4, (i2 & 512) != 0 ? null : str5, (i2 & 1024) != 0 ? null : bool3, (i2 & 2048) != 0 ? null : basePropertyExistsDto, (i2 & 4096) != 0 ? null : str6, (i2 & 8192) != 0 ? null : basePropertyExistsDto2, (i2 & 16384) != 0 ? null : baseBoolIntDto16, (i2 & 32768) != 0 ? null : mediaRestrictionDto, (i2 & 65536) != 0 ? null : baseBoolIntDto17, (i2 & 131072) != 0 ? null : baseBoolIntDto18, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str7, (i2 & 524288) != 0 ? null : videoVideoTrackingInfoDto, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : basePropertyExistsDto3, (i2 & 2097152) != 0 ? null : str8, (i2 & 4194304) != 0 ? null : num10, (i2 & 8388608) != 0 ? null : num11, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : num12, (i2 & 33554432) != 0 ? null : str9, (i2 & 67108864) != 0 ? null : num13, (i2 & 134217728) != 0 ? null : str10, (i2 & 268435456) != 0 ? null : num14, (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : videoLiveStatusDto, (i2 & 1073741824) != 0 ? null : num15, (i2 & Integer.MIN_VALUE) != 0 ? null : baseBoolIntDto19, (i3 & 1) != 0 ? null : num16, (i3 & 2) != 0 ? null : str11, (i3 & 4) != 0 ? null : baseRepostsInfoDto, (i3 & 8) != 0 ? null : num17, (i3 & 16) != 0 ? null : basePropertyExistsDto4, (i3 & 32) != 0 ? null : baseBoolIntDto20, (i3 & 64) != 0 ? null : num18, (i3 & 128) != 0 ? null : num19, (i3 & 256) != 0 ? null : str12, (i3 & 512) != 0 ? null : str13, (i3 & 1024) != 0 ? null : num20, (i3 & 2048) != 0 ? null : bool4, (i3 & 4096) != 0 ? null : bool5, (i3 & 8192) != 0 ? null : baseBoolIntDto21, (i3 & 16384) != 0 ? null : actionLinksActionDto, (i3 & 32768) != 0 ? null : num21, (i3 & 65536) != 0 ? null : str14, (i3 & 131072) != 0 ? null : videoAccessInfoDto, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num22, (i3 & 524288) != 0 ? null : list4, (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num23, (i3 & 2097152) != 0 ? null : str15, (i3 & 4194304) != 0 ? null : bool6, (i3 & 8388608) != 0 ? null : str16, (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str17, (i3 & 33554432) != 0 ? null : str18, (i3 & 67108864) != 0 ? null : str19, (i3 & 134217728) != 0 ? null : videoDonutDto, (i3 & 268435456) != 0 ? null : baseBoolIntDto22, (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : baseBoolIntDto23, (i3 & 1073741824) != 0 ? null : baseBoolIntDto24, (i3 & Integer.MIN_VALUE) != 0 ? null : list5, (i4 & 1) != 0 ? null : list6, (i4 & 2) != 0 ? null : str20, (i4 & 4) != 0 ? null : num24, (i4 & 8) != 0 ? null : list7, (i4 & 16) != 0 ? null : userId3, (i4 & 32) != 0 ? null : num25);
            String str21 = (i & 1) != 0 ? null : str;
            NewsfeedCommentsBaseDto newsfeedCommentsBaseDto2 = (i & 2) != 0 ? null : newsfeedCommentsBaseDto;
            BaseLikesDto baseLikesDto2 = (i & 4) != 0 ? null : baseLikesDto;
            TypeDto typeDto2 = (i & 8) != 0 ? null : typeDto;
            ResponseTypeDto responseTypeDto2 = (i & 16) != 0 ? null : responseTypeDto;
            String str22 = (i & 32) != 0 ? null : str2;
            Integer num26 = (i & 64) != 0 ? null : num;
            VideoAdsInfoDto videoAdsInfoDto2 = (i & 128) != 0 ? null : videoAdsInfoDto;
            BaseBoolIntDto baseBoolIntDto25 = (i & 256) != 0 ? null : baseBoolIntDto;
            BaseBoolIntDto baseBoolIntDto26 = (i & 512) != 0 ? null : baseBoolIntDto2;
            BaseBoolIntDto baseBoolIntDto27 = (i & 1024) != 0 ? null : baseBoolIntDto3;
            BaseBoolIntDto baseBoolIntDto28 = (i & 2048) != 0 ? null : baseBoolIntDto4;
            Integer num27 = (i & 4096) != 0 ? null : num2;
            String str23 = str21;
            BaseBoolIntDto baseBoolIntDto29 = (i & 8192) != 0 ? null : baseBoolIntDto5;
            BaseBoolIntDto baseBoolIntDto30 = (i & 16384) != 0 ? null : baseBoolIntDto6;
            BaseBoolIntDto baseBoolIntDto31 = (i & 32768) != 0 ? null : baseBoolIntDto7;
            BaseBoolIntDto baseBoolIntDto32 = (i & 65536) != 0 ? null : baseBoolIntDto8;
            BaseBoolIntDto baseBoolIntDto33 = (i & 131072) != 0 ? null : baseBoolIntDto9;
            BaseBoolIntDto baseBoolIntDto34 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : baseBoolIntDto10;
            Integer num28 = (i & 524288) != 0 ? null : num3;
            BaseBoolIntDto baseBoolIntDto35 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : baseBoolIntDto11;
            BaseBoolIntDto baseBoolIntDto36 = (i & 2097152) != 0 ? null : baseBoolIntDto12;
            VideoVideoDownloadDto videoVideoDownloadDto2 = (i & 4194304) != 0 ? null : videoVideoDownloadDto;
            List list8 = (i & 8388608) != 0 ? null : list;
            Boolean bool7 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : bool;
            Integer num29 = (i & 33554432) != 0 ? null : num4;
            BaseBoolIntDto baseBoolIntDto37 = (i & 67108864) != 0 ? null : baseBoolIntDto13;
            BaseBoolIntDto baseBoolIntDto38 = (i & 134217728) != 0 ? null : baseBoolIntDto14;
            BaseBoolIntDto baseBoolIntDto39 = (i & 268435456) != 0 ? null : baseBoolIntDto15;
            Integer num30 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : num5;
            String str24 = (i & 1073741824) != 0 ? null : str3;
            Integer num31 = (i & Integer.MIN_VALUE) != 0 ? null : num6;
        }

        public NewsfeedCommentsItemTypeVideoDto(String str, NewsfeedCommentsBaseDto newsfeedCommentsBaseDto, BaseLikesDto baseLikesDto, TypeDto typeDto, ResponseTypeDto responseTypeDto, String str2, Integer num, VideoAdsInfoDto videoAdsInfoDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, Integer num2, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, BaseBoolIntDto baseBoolIntDto10, Integer num3, BaseBoolIntDto baseBoolIntDto11, BaseBoolIntDto baseBoolIntDto12, VideoVideoDownloadDto videoVideoDownloadDto, List<VideoLinkedToPlaylistMarkDto> list, Boolean bool, Integer num4, BaseBoolIntDto baseBoolIntDto13, BaseBoolIntDto baseBoolIntDto14, BaseBoolIntDto baseBoolIntDto15, Integer num5, String str3, Integer num6, List<VideoVideoImageDto> list2, List<VideoVideoImageDto> list3, Integer num7, Integer num8, Integer num9, UserId userId, UserId userId2, Boolean bool2, String str4, String str5, Boolean bool3, BasePropertyExistsDto basePropertyExistsDto, String str6, BasePropertyExistsDto basePropertyExistsDto2, BaseBoolIntDto baseBoolIntDto16, MediaRestrictionDto mediaRestrictionDto, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, String str7, VideoVideoTrackingInfoDto videoVideoTrackingInfoDto, BasePropertyExistsDto basePropertyExistsDto3, String str8, Integer num10, Integer num11, Integer num12, String str9, Integer num13, String str10, Integer num14, VideoLiveStatusDto videoLiveStatusDto, Integer num15, BaseBoolIntDto baseBoolIntDto19, Integer num16, String str11, BaseRepostsInfoDto baseRepostsInfoDto, Integer num17, BasePropertyExistsDto basePropertyExistsDto4, BaseBoolIntDto baseBoolIntDto20, Integer num18, Integer num19, String str12, String str13, Integer num20, Boolean bool4, Boolean bool5, BaseBoolIntDto baseBoolIntDto21, ActionLinksActionDto actionLinksActionDto, Integer num21, String str14, VideoAccessInfoDto videoAccessInfoDto, Integer num22, List<AdsItemBlockAdStatPixelDto> list4, Integer num23, String str15, Boolean bool6, String str16, String str17, String str18, String str19, VideoDonutDto videoDonutDto, BaseBoolIntDto baseBoolIntDto22, BaseBoolIntDto baseBoolIntDto23, BaseBoolIntDto baseBoolIntDto24, List<AudioArtistDto> list5, List<AudioArtistDto> list6, String str20, Integer num24, List<AudioGenreDto> list7, UserId userId3, Integer num25) {
            super(null);
            this.text = str;
            this.comments = newsfeedCommentsBaseDto;
            this.likes = baseLikesDto;
            this.type = typeDto;
            this.responseType = responseTypeDto;
            this.accessKey = str2;
            this.addingDate = num;
            this.adsInfo = videoAdsInfoDto;
            this.canComment = baseBoolIntDto;
            this.canEdit = baseBoolIntDto2;
            this.canDelete = baseBoolIntDto3;
            this.canLike = baseBoolIntDto4;
            this.canRepost = num2;
            this.canSubscribe = baseBoolIntDto5;
            this.canBePromoted = baseBoolIntDto6;
            this.canAddToFaves = baseBoolIntDto7;
            this.canAdd = baseBoolIntDto8;
            this.canAttachLink = baseBoolIntDto9;
            this.canPlayInBackground = baseBoolIntDto10;
            this.canDownload = num3;
            this.canEditPrivacy = baseBoolIntDto11;
            this.canRemoveFromRecommendations = baseBoolIntDto12;
            this.download = videoVideoDownloadDto;
            this.linkedToPlaylistMarks = list;
            this.isArchivalContent = bool;
            this.archivalContentPublishedDate = num4;
            this.isPrivate = baseBoolIntDto13;
            this.isFromMessage = baseBoolIntDto14;
            this.isDraft = baseBoolIntDto15;
            this.date = num5;
            this.description = str3;
            this.duration = num6;
            this.image = list2;
            this.firstFrame = list3;
            this.width = num7;
            this.height = num8;
            this.id = num9;
            this.ownerId = userId;
            this.userId = userId2;
            this.isAuthor = bool2;
            this.ovId = str4;
            this.title = str5;
            this.isFavorite = bool3;
            this.noAutoplay = basePropertyExistsDto;
            this.player = str6;
            this.processing = basePropertyExistsDto2;
            this.converting = baseBoolIntDto16;
            this.restriction = mediaRestrictionDto;
            this.added = baseBoolIntDto17;
            this.isSubscribed = baseBoolIntDto18;
            this.trackCode = str7;
            this.trackingInfo = videoVideoTrackingInfoDto;
            this.repeat = basePropertyExistsDto3;
            this.partnerText = str8;
            this.views = num10;
            this.localViews = num11;
            this.contentRestricted = num12;
            this.contentRestrictedMessage = str9;
            this.albumId = num13;
            this.context = str10;
            this.balance = num14;
            this.liveStatus = videoLiveStatusDto;
            this.liveStartTime = num15;
            this.liveNotify = baseBoolIntDto19;
            this.spectators = num16;
            this.platform = str11;
            this.reposts = baseRepostsInfoDto;
            this.moderationStatus = num17;
            this.needMute = basePropertyExistsDto4;
            this.isUnitedVideo = baseBoolIntDto20;
            this.umaTrackId = num18;
            this.ovProviderId = num19;
            this.randomTag = str12;
            this.uvStatsPlace = str13;
            this.server = num20;
            this.isMobileLive = bool4;
            this.isSpherical = bool5;
            this.canDislike = baseBoolIntDto21;
            this.titleAction = actionLinksActionDto;
            this.publishedAt = num21;
            this.thumbHash = str14;
            this.accessInfo = videoAccessInfoDto;
            this.wallPostId = num22;
            this.adsStatPixels = list4;
            this.donutLevelId = num23;
            this.promoPostHash = str15;
            this.shouldStretch = bool6;
            this.vkLiveChannelUrl = str16;
            this.vkLiveChannelName = str17;
            this.vkLiveVideoId = str18;
            this.vkLiveSlotUrl = str19;
            this.donut = videoDonutDto;
            this.canReport = baseBoolIntDto22;
            this.canCutToShortVideo = baseBoolIntDto23;
            this.isExplicit = baseBoolIntDto24;
            this.mainArtists = list5;
            this.featuredArtists = list6;
            this.subtitle = str20;
            this.releaseDate = num24;
            this.genres = list7;
            this.sourceId = userId3;
            this.postId = num25;
        }
    }

    public /* synthetic */ NewsfeedCommentsItemDto(zcl zclVar) {
        this();
    }

    private NewsfeedCommentsItemDto() {
    }
}
