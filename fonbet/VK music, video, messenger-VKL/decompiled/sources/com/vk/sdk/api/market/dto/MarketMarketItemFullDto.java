package com.vk.sdk.api.market.dto;

import com.vk.dto.common.id.UserId;
import com.vk.movika.sdk.base.model.history.b;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import com.vk.sdk.api.base.dto.BaseLikesDto;
import com.vk.sdk.api.base.dto.BaseLinkDto;
import com.vk.sdk.api.base.dto.BaseRepostsInfoDto;
import com.vk.sdk.api.photos.dto.PhotosPhotoDto;
import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.kr;
import xsna.n6j;
import xsna.nyh0;
import xsna.pmi0;
import xsna.rq;
import xsna.shy;
import xsna.tq;
import xsna.uq;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketMarketItemFullDto.kt */
/* loaded from: classes5.dex */
public final class MarketMarketItemFullDto {

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("ad_id")
    private final Integer adId;

    @pmi0("albums_ids")
    private final List<Integer> albumsIds;

    @pmi0("availability")
    private final MarketMarketItemAvailabilityDto availability;

    @pmi0("button_title")
    private final String buttonTitle;

    @pmi0("can_comment")
    private final BaseBoolIntDto canComment;

    @pmi0("can_delete")
    private final Boolean canDelete;

    @pmi0("can_edit")
    private final Boolean canEdit;

    @pmi0("can_repost")
    private final BaseBoolIntDto canRepost;

    @pmi0("can_show_convert_to_service")
    private final Boolean canShowConvertToService;

    @pmi0("cancel_info")
    private final BaseLinkDto cancelInfo;

    @pmi0("category")
    private final MarketMarketCategoryDto category;

    @pmi0("category_v2")
    private final MarketMarketCategoryDto categoryV2;

    @pmi0("date")
    private final Integer date;

    @pmi0("description")
    private final String description;

    @pmi0("external_id")
    private final String externalId;

    @pmi0("id")
    private final int id;

    @pmi0("is_adult")
    private final Boolean isAdult;

    @pmi0("is_favorite")
    private final Boolean isFavorite;

    @pmi0("is_main_variant")
    private final Boolean isMainVariant;

    @pmi0("is_owner")
    private final Boolean isOwner;

    @pmi0("likes")
    private final BaseLikesDto likes;

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

    @pmi0("reposts")
    private final BaseRepostsInfoDto reposts;

    @pmi0("sku")
    private final String sku;

    @pmi0("thumb_photo")
    private final String thumbPhoto;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    @pmi0("user_agreement_info")
    private final String userAgreementInfo;

    @pmi0("variants_grouping_id")
    private final Integer variantsGroupingId;

    @pmi0("views_count")
    private final Integer viewsCount;

    @pmi0("vk_pay_discount")
    private final Integer vkPayDiscount;

    @pmi0("wishlist_item_id")
    private final Integer wishlistItemId;

    public MarketMarketItemFullDto(MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto, MarketMarketCategoryDto marketMarketCategoryDto, String str, int i, UserId userId, MarketPriceDto marketPriceDto, String str2, List<Integer> list, List<PhotosPhotoDto> list2, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseLikesDto baseLikesDto, BaseRepostsInfoDto baseRepostsInfoDto, Integer num, Integer num2, BaseLinkDto baseLinkDto, String str3, Integer num3, MarketItemOwnerInfoDto marketItemOwnerInfoDto, Boolean bool, Boolean bool2, Boolean bool3, MarketItemPromotionInfoDto marketItemPromotionInfoDto, Integer num4, String str4, String str5, MarketMarketCategoryDto marketMarketCategoryDto2, Integer num5, String str6, Boolean bool4, Boolean bool5, Boolean bool6, String str7, String str8, Integer num6, Boolean bool7, String str9, Integer num7, UserId userId2) {
        this.availability = marketMarketItemAvailabilityDto;
        this.category = marketMarketCategoryDto;
        this.description = str;
        this.id = i;
        this.ownerId = userId;
        this.price = marketPriceDto;
        this.title = str2;
        this.albumsIds = list;
        this.photos = list2;
        this.canComment = baseBoolIntDto;
        this.canRepost = baseBoolIntDto2;
        this.likes = baseLikesDto;
        this.reposts = baseRepostsInfoDto;
        this.viewsCount = num;
        this.wishlistItemId = num2;
        this.cancelInfo = baseLinkDto;
        this.userAgreementInfo = str3;
        this.adId = num3;
        this.ownerInfo = marketItemOwnerInfoDto;
        this.canEdit = bool;
        this.canDelete = bool2;
        this.canShowConvertToService = bool3;
        this.promotion = marketItemPromotionInfoDto;
        this.vkPayDiscount = num4;
        this.accessKey = str4;
        this.buttonTitle = str5;
        this.categoryV2 = marketMarketCategoryDto2;
        this.date = num5;
        this.externalId = str6;
        this.isFavorite = bool4;
        this.isOwner = bool5;
        this.isAdult = bool6;
        this.thumbPhoto = str7;
        this.url = str8;
        this.variantsGroupingId = num6;
        this.isMainVariant = bool7;
        this.sku = str9;
        this.postId = num7;
        this.postOwnerId = userId2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketMarketItemFullDto)) {
            return false;
        }
        MarketMarketItemFullDto marketMarketItemFullDto = (MarketMarketItemFullDto) obj;
        return this.availability == marketMarketItemFullDto.availability && epx.f(this.category, marketMarketItemFullDto.category) && epx.f(this.description, marketMarketItemFullDto.description) && this.id == marketMarketItemFullDto.id && epx.f(this.ownerId, marketMarketItemFullDto.ownerId) && epx.f(this.price, marketMarketItemFullDto.price) && epx.f(this.title, marketMarketItemFullDto.title) && epx.f(this.albumsIds, marketMarketItemFullDto.albumsIds) && epx.f(this.photos, marketMarketItemFullDto.photos) && this.canComment == marketMarketItemFullDto.canComment && this.canRepost == marketMarketItemFullDto.canRepost && epx.f(this.likes, marketMarketItemFullDto.likes) && epx.f(this.reposts, marketMarketItemFullDto.reposts) && epx.f(this.viewsCount, marketMarketItemFullDto.viewsCount) && epx.f(this.wishlistItemId, marketMarketItemFullDto.wishlistItemId) && epx.f(this.cancelInfo, marketMarketItemFullDto.cancelInfo) && epx.f(this.userAgreementInfo, marketMarketItemFullDto.userAgreementInfo) && epx.f(this.adId, marketMarketItemFullDto.adId) && epx.f(this.ownerInfo, marketMarketItemFullDto.ownerInfo) && epx.f(this.canEdit, marketMarketItemFullDto.canEdit) && epx.f(this.canDelete, marketMarketItemFullDto.canDelete) && epx.f(this.canShowConvertToService, marketMarketItemFullDto.canShowConvertToService) && epx.f(this.promotion, marketMarketItemFullDto.promotion) && epx.f(this.vkPayDiscount, marketMarketItemFullDto.vkPayDiscount) && epx.f(this.accessKey, marketMarketItemFullDto.accessKey) && epx.f(this.buttonTitle, marketMarketItemFullDto.buttonTitle) && epx.f(this.categoryV2, marketMarketItemFullDto.categoryV2) && epx.f(this.date, marketMarketItemFullDto.date) && epx.f(this.externalId, marketMarketItemFullDto.externalId) && epx.f(this.isFavorite, marketMarketItemFullDto.isFavorite) && epx.f(this.isOwner, marketMarketItemFullDto.isOwner) && epx.f(this.isAdult, marketMarketItemFullDto.isAdult) && epx.f(this.thumbPhoto, marketMarketItemFullDto.thumbPhoto) && epx.f(this.url, marketMarketItemFullDto.url) && epx.f(this.variantsGroupingId, marketMarketItemFullDto.variantsGroupingId) && epx.f(this.isMainVariant, marketMarketItemFullDto.isMainVariant) && epx.f(this.sku, marketMarketItemFullDto.sku) && epx.f(this.postId, marketMarketItemFullDto.postId) && epx.f(this.postOwnerId, marketMarketItemFullDto.postOwnerId);
    }

    public final int hashCode() {
        int a = urd0.a((this.price.hashCode() + bh10.a(shy.a(this.id, urd0.a((this.category.hashCode() + (this.availability.hashCode() * 31)) * 31, 31, this.description), 31), 31, this.ownerId.b)) * 31, 31, this.title);
        List<Integer> list = this.albumsIds;
        int hashCode = (a + (list == null ? 0 : list.hashCode())) * 31;
        List<PhotosPhotoDto> list2 = this.photos;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.canComment;
        int hashCode3 = (hashCode2 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.canRepost;
        int hashCode4 = (hashCode3 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseLikesDto baseLikesDto = this.likes;
        int hashCode5 = (hashCode4 + (baseLikesDto == null ? 0 : baseLikesDto.hashCode())) * 31;
        BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
        int hashCode6 = (hashCode5 + (baseRepostsInfoDto == null ? 0 : baseRepostsInfoDto.hashCode())) * 31;
        Integer num = this.viewsCount;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.wishlistItemId;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BaseLinkDto baseLinkDto = this.cancelInfo;
        int hashCode9 = (hashCode8 + (baseLinkDto == null ? 0 : baseLinkDto.hashCode())) * 31;
        String str = this.userAgreementInfo;
        int hashCode10 = (hashCode9 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.adId;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        MarketItemOwnerInfoDto marketItemOwnerInfoDto = this.ownerInfo;
        int hashCode12 = (hashCode11 + (marketItemOwnerInfoDto == null ? 0 : marketItemOwnerInfoDto.hashCode())) * 31;
        Boolean bool = this.canEdit;
        int hashCode13 = (hashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canDelete;
        int hashCode14 = (hashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.canShowConvertToService;
        int hashCode15 = (hashCode14 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        MarketItemPromotionInfoDto marketItemPromotionInfoDto = this.promotion;
        int hashCode16 = (hashCode15 + (marketItemPromotionInfoDto == null ? 0 : marketItemPromotionInfoDto.hashCode())) * 31;
        Integer num4 = this.vkPayDiscount;
        int hashCode17 = (hashCode16 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.accessKey;
        int hashCode18 = (hashCode17 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonTitle;
        int hashCode19 = (hashCode18 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MarketMarketCategoryDto marketMarketCategoryDto = this.categoryV2;
        int hashCode20 = (hashCode19 + (marketMarketCategoryDto == null ? 0 : marketMarketCategoryDto.hashCode())) * 31;
        Integer num5 = this.date;
        int hashCode21 = (hashCode20 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str4 = this.externalId;
        int hashCode22 = (hashCode21 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool4 = this.isFavorite;
        int hashCode23 = (hashCode22 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isOwner;
        int hashCode24 = (hashCode23 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isAdult;
        int hashCode25 = (hashCode24 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str5 = this.thumbPhoto;
        int hashCode26 = (hashCode25 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.url;
        int hashCode27 = (hashCode26 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num6 = this.variantsGroupingId;
        int hashCode28 = (hashCode27 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Boolean bool7 = this.isMainVariant;
        int hashCode29 = (hashCode28 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str7 = this.sku;
        int hashCode30 = (hashCode29 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num7 = this.postId;
        int hashCode31 = (hashCode30 + (num7 == null ? 0 : num7.hashCode())) * 31;
        UserId userId = this.postOwnerId;
        return hashCode31 + (userId != null ? Long.hashCode(userId.b) : 0);
    }

    public final String toString() {
        MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto = this.availability;
        MarketMarketCategoryDto marketMarketCategoryDto = this.category;
        String str = this.description;
        int i = this.id;
        UserId userId = this.ownerId;
        MarketPriceDto marketPriceDto = this.price;
        String str2 = this.title;
        List<Integer> list = this.albumsIds;
        List<PhotosPhotoDto> list2 = this.photos;
        BaseBoolIntDto baseBoolIntDto = this.canComment;
        BaseBoolIntDto baseBoolIntDto2 = this.canRepost;
        BaseLikesDto baseLikesDto = this.likes;
        BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
        Integer num = this.viewsCount;
        Integer num2 = this.wishlistItemId;
        BaseLinkDto baseLinkDto = this.cancelInfo;
        String str3 = this.userAgreementInfo;
        Integer num3 = this.adId;
        MarketItemOwnerInfoDto marketItemOwnerInfoDto = this.ownerInfo;
        Boolean bool = this.canEdit;
        Boolean bool2 = this.canDelete;
        Boolean bool3 = this.canShowConvertToService;
        MarketItemPromotionInfoDto marketItemPromotionInfoDto = this.promotion;
        Integer num4 = this.vkPayDiscount;
        String str4 = this.accessKey;
        String str5 = this.buttonTitle;
        MarketMarketCategoryDto marketMarketCategoryDto2 = this.categoryV2;
        Integer num5 = this.date;
        String str6 = this.externalId;
        Boolean bool4 = this.isFavorite;
        Boolean bool5 = this.isOwner;
        Boolean bool6 = this.isAdult;
        String str7 = this.thumbPhoto;
        String str8 = this.url;
        Integer num6 = this.variantsGroupingId;
        Boolean bool7 = this.isMainVariant;
        String str9 = this.sku;
        Integer num7 = this.postId;
        UserId userId2 = this.postOwnerId;
        StringBuilder sb = new StringBuilder("MarketMarketItemFullDto(availability=");
        sb.append(marketMarketItemAvailabilityDto);
        sb.append(", category=");
        sb.append(marketMarketCategoryDto);
        sb.append(", description=");
        nyh0.a(i, str, ", id=", ", ownerId=", sb);
        sb.append(userId);
        sb.append(", price=");
        sb.append(marketPriceDto);
        sb.append(", title=");
        b.c(str2, ", albumsIds=", ", photos=", sb, list);
        sb.append(list2);
        sb.append(", canComment=");
        sb.append(baseBoolIntDto);
        sb.append(", canRepost=");
        sb.append(baseBoolIntDto2);
        sb.append(", likes=");
        sb.append(baseLikesDto);
        sb.append(", reposts=");
        sb.append(baseRepostsInfoDto);
        sb.append(", viewsCount=");
        sb.append(num);
        sb.append(", wishlistItemId=");
        sb.append(num2);
        sb.append(", cancelInfo=");
        sb.append(baseLinkDto);
        sb.append(", userAgreementInfo=");
        kr.b(num3, str3, ", adId=", ", ownerInfo=", sb);
        sb.append(marketItemOwnerInfoDto);
        sb.append(", canEdit=");
        sb.append(bool);
        sb.append(", canDelete=");
        tq.i(sb, bool2, ", canShowConvertToService=", bool3, ", promotion=");
        sb.append(marketItemPromotionInfoDto);
        sb.append(", vkPayDiscount=");
        sb.append(num4);
        sb.append(", accessKey=");
        n6j.b(sb, str4, ", buttonTitle=", str5, ", categoryV2=");
        sb.append(marketMarketCategoryDto2);
        sb.append(", date=");
        sb.append(num5);
        sb.append(", externalId=");
        uq.c(bool4, str6, ", isFavorite=", ", isOwner=", sb);
        tq.i(sb, bool5, ", isAdult=", bool6, ", thumbPhoto=");
        n6j.b(sb, str7, ", url=", str8, ", variantsGroupingId=");
        rq.h(sb, num6, ", isMainVariant=", bool7, ", sku=");
        kr.b(num7, str9, ", postId=", ", postOwnerId=", sb);
        sb.append(userId2);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ MarketMarketItemFullDto(MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto, MarketMarketCategoryDto marketMarketCategoryDto, String str, int i, UserId userId, MarketPriceDto marketPriceDto, String str2, List list, List list2, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseLikesDto baseLikesDto, BaseRepostsInfoDto baseRepostsInfoDto, Integer num, Integer num2, BaseLinkDto baseLinkDto, String str3, Integer num3, MarketItemOwnerInfoDto marketItemOwnerInfoDto, Boolean bool, Boolean bool2, Boolean bool3, MarketItemPromotionInfoDto marketItemPromotionInfoDto, Integer num4, String str4, String str5, MarketMarketCategoryDto marketMarketCategoryDto2, Integer num5, String str6, Boolean bool4, Boolean bool5, Boolean bool6, String str7, String str8, Integer num6, Boolean bool7, String str9, Integer num7, UserId userId2, int i2, int i3, zcl zclVar) {
        this(marketMarketItemAvailabilityDto, marketMarketCategoryDto, str, i, userId, marketPriceDto, str2, (i2 & 128) != 0 ? null : list, (i2 & 256) != 0 ? null : list2, (i2 & 512) != 0 ? null : baseBoolIntDto, (i2 & 1024) != 0 ? null : baseBoolIntDto2, (i2 & 2048) != 0 ? null : baseLikesDto, (i2 & 4096) != 0 ? null : baseRepostsInfoDto, (i2 & 8192) != 0 ? null : num, (i2 & 16384) != 0 ? null : num2, (32768 & i2) != 0 ? null : baseLinkDto, (65536 & i2) != 0 ? null : str3, (131072 & i2) != 0 ? null : num3, (262144 & i2) != 0 ? null : marketItemOwnerInfoDto, (524288 & i2) != 0 ? null : bool, (1048576 & i2) != 0 ? null : bool2, (2097152 & i2) != 0 ? null : bool3, (4194304 & i2) != 0 ? null : marketItemPromotionInfoDto, (8388608 & i2) != 0 ? null : num4, (16777216 & i2) != 0 ? null : str4, (33554432 & i2) != 0 ? null : str5, (67108864 & i2) != 0 ? null : marketMarketCategoryDto2, (134217728 & i2) != 0 ? null : num5, (268435456 & i2) != 0 ? null : str6, (536870912 & i2) != 0 ? null : bool4, (1073741824 & i2) != 0 ? null : bool5, (i2 & Integer.MIN_VALUE) != 0 ? null : bool6, (i3 & 1) != 0 ? null : str7, (i3 & 2) != 0 ? null : str8, (i3 & 4) != 0 ? null : num6, (i3 & 8) != 0 ? null : bool7, (i3 & 16) != 0 ? null : str9, (i3 & 32) != 0 ? null : num7, (i3 & 64) != 0 ? null : userId2);
    }
}
