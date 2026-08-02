package com.vk.sdk.api.classifieds.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseGeoCoordinatesDto;
import com.vk.sdk.api.base.dto.BaseImageDto;
import com.vk.sdk.api.base.dto.BaseLinkButtonDto;
import com.vk.sdk.api.base.dto.BaseLinkProductStatusDto;
import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import com.vk.sdk.api.market.dto.MarketPriceDto;
import com.vk.sdk.api.photos.dto.PhotosPhotoDto;
import java.util.List;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.kr;
import xsna.mq;
import xsna.n6j;
import xsna.odj;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.vq;
import xsna.vr;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ClassifiedsYoulaItemExtendedDto.kt */
/* loaded from: classes5.dex */
public final class ClassifiedsYoulaItemExtendedDto {

    @pmi0("action_properties")
    private final ClassifiedsYoulaItemActionPropertiesDto actionProperties;

    @pmi0("action_url")
    private final String actionUrl;

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    private final String address;

    @pmi0("attributes")
    private final List<ClassifiedsYoulaItemAttributeDto> attributes;

    @pmi0("author")
    private final ClassifiedsYoulaItemVkAuthorDto author;

    @pmi0("block_mode")
    private final BlockModeDto blockMode;

    @pmi0("block_type_text")
    private final String blockTypeText;

    @pmi0("button_actions")
    private final List<ClassifiedsYoulaItemActionButtonDto> buttonActions;

    @pmi0("category")
    private final String category;

    @pmi0("city")
    private final String city;

    @pmi0("commercial_profile_button")
    private final BaseLinkButtonDto commercialProfileButton;

    @pmi0("description")
    private final String description;

    @pmi0("details_url")
    private final String detailsUrl;

    @pmi0("distance")
    private final Integer distance;

    @pmi0("distance_text")
    private final String distanceText;

    @pmi0("favorite_counter")
    private final Integer favoriteCounter;

    @pmi0("geo")
    private final BaseGeoCoordinatesDto geo;

    @pmi0("group")
    private final GroupsGroupFullDto group;

    @pmi0("id")
    private final String id;

    @pmi0("internal_id")
    private final int internalId;

    @pmi0("internal_owner_id")
    private final int internalOwnerId;

    @pmi0("is_antibaraholka_source")
    private final Boolean isAntibaraholkaSource;

    @pmi0("is_cringe")
    private final Boolean isCringe;

    @pmi0("is_favorite")
    private final Boolean isFavorite;

    @pmi0("is_owner")
    private final Boolean isOwner;

    @pmi0("is_user_blacklisted")
    private final Boolean isUserBlacklisted;

    @pmi0("location_text")
    private final String locationText;

    @pmi0("menu_actions")
    private final List<ClassifiedsYoulaItemActionButtonDto> menuActions;

    @pmi0("on_click_options")
    private final ClassifiedsYoulaItemOnClickOptionsDto onClickOptions;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("photo_total_count_description")
    private final String photoTotalCountDescription;

    @pmi0("photos")
    private final List<ClassifiedsYoulaItemPhotoDto> photos;

    @pmi0("price")
    private final MarketPriceDto price;

    @pmi0("published_date")
    private final Integer publishedDate;

    @pmi0("radius_meters")
    private final Integer radiusMeters;

    @pmi0("root_category")
    private final String rootCategory;

    @pmi0("share_url")
    private final String shareUrl;

    @pmi0("status")
    private final BaseLinkProductStatusDto status;

    @pmi0("status_info")
    private final ClassifiedsYoulaItemStatusInfoDto statusInfo;

    @pmi0("sub_category")
    private final String subCategory;

    @pmi0("thumb")
    private final List<BaseImageDto> thumb;

    @pmi0("title")
    private final String title;

    @pmi0("views")
    private final Integer views;

    @pmi0("youla_owner_name")
    private final String youlaOwnerName;

    @pmi0("youla_user_id")
    private final String youlaUserId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClassifiedsYoulaItemExtendedDto.kt */
    public static final class BlockModeDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BlockModeDto[] $VALUES;

        @pmi0("1")
        public static final BlockModeDto BLOCKED;

        @pmi0("0")
        public static final BlockModeDto NO_BLOCK;

        @pmi0("2")
        public static final BlockModeDto REJECTED;

        @pmi0("3")
        public static final BlockModeDto VK_BLOCKED;
        private final int value;

        static {
            BlockModeDto blockModeDto = new BlockModeDto("NO_BLOCK", 0, 0);
            NO_BLOCK = blockModeDto;
            BlockModeDto blockModeDto2 = new BlockModeDto("BLOCKED", 1, 1);
            BLOCKED = blockModeDto2;
            BlockModeDto blockModeDto3 = new BlockModeDto("REJECTED", 2, 2);
            REJECTED = blockModeDto3;
            BlockModeDto blockModeDto4 = new BlockModeDto("VK_BLOCKED", 3, 3);
            VK_BLOCKED = blockModeDto4;
            BlockModeDto[] blockModeDtoArr = {blockModeDto, blockModeDto2, blockModeDto3, blockModeDto4};
            $VALUES = blockModeDtoArr;
            $ENTRIES = new asp(blockModeDtoArr);
        }

        private BlockModeDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static BlockModeDto valueOf(String str) {
            return (BlockModeDto) Enum.valueOf(BlockModeDto.class, str);
        }

        public static BlockModeDto[] values() {
            return (BlockModeDto[]) $VALUES.clone();
        }
    }

    public ClassifiedsYoulaItemExtendedDto(int i, int i2, String str, UserId userId, MarketPriceDto marketPriceDto, Boolean bool, String str2, BaseGeoCoordinatesDto baseGeoCoordinatesDto, String str3, Integer num, String str4, BlockModeDto blockModeDto, String str5, String str6, List<ClassifiedsYoulaItemPhotoDto> list, String str7, BaseLinkButtonDto baseLinkButtonDto, String str8, String str9, String str10, Integer num2, GroupsGroupFullDto groupsGroupFullDto, List<ClassifiedsYoulaItemAttributeDto> list2, ClassifiedsYoulaItemActionPropertiesDto classifiedsYoulaItemActionPropertiesDto, String str11, Integer num3, String str12, ClassifiedsYoulaItemStatusInfoDto classifiedsYoulaItemStatusInfoDto, List<ClassifiedsYoulaItemActionButtonDto> list3, List<ClassifiedsYoulaItemActionButtonDto> list4, Boolean bool2, Integer num4, Integer num5, String str13, String str14, ClassifiedsYoulaItemVkAuthorDto classifiedsYoulaItemVkAuthorDto, String str15, String str16, String str17, ClassifiedsYoulaItemOnClickOptionsDto classifiedsYoulaItemOnClickOptionsDto, Boolean bool3, List<BaseImageDto> list5, PhotosPhotoDto photosPhotoDto, Boolean bool4, BaseLinkProductStatusDto baseLinkProductStatusDto, Boolean bool5) {
        this.internalOwnerId = i;
        this.internalId = i2;
        this.id = str;
        this.ownerId = userId;
        this.price = marketPriceDto;
        this.isOwner = bool;
        this.description = str2;
        this.geo = baseGeoCoordinatesDto;
        this.locationText = str3;
        this.distance = num;
        this.city = str4;
        this.blockMode = blockModeDto;
        this.detailsUrl = str5;
        this.actionUrl = str6;
        this.photos = list;
        this.photoTotalCountDescription = str7;
        this.commercialProfileButton = baseLinkButtonDto;
        this.rootCategory = str8;
        this.category = str9;
        this.subCategory = str10;
        this.publishedDate = num2;
        this.group = groupsGroupFullDto;
        this.attributes = list2;
        this.actionProperties = classifiedsYoulaItemActionPropertiesDto;
        this.address = str11;
        this.radiusMeters = num3;
        this.distanceText = str12;
        this.statusInfo = classifiedsYoulaItemStatusInfoDto;
        this.menuActions = list3;
        this.buttonActions = list4;
        this.isUserBlacklisted = bool2;
        this.favoriteCounter = num4;
        this.views = num5;
        this.blockTypeText = str13;
        this.shareUrl = str14;
        this.author = classifiedsYoulaItemVkAuthorDto;
        this.youlaOwnerName = str15;
        this.youlaUserId = str16;
        this.title = str17;
        this.onClickOptions = classifiedsYoulaItemOnClickOptionsDto;
        this.isFavorite = bool3;
        this.thumb = list5;
        this.photo = photosPhotoDto;
        this.isAntibaraholkaSource = bool4;
        this.status = baseLinkProductStatusDto;
        this.isCringe = bool5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaItemExtendedDto)) {
            return false;
        }
        ClassifiedsYoulaItemExtendedDto classifiedsYoulaItemExtendedDto = (ClassifiedsYoulaItemExtendedDto) obj;
        return this.internalOwnerId == classifiedsYoulaItemExtendedDto.internalOwnerId && this.internalId == classifiedsYoulaItemExtendedDto.internalId && epx.f(this.id, classifiedsYoulaItemExtendedDto.id) && epx.f(this.ownerId, classifiedsYoulaItemExtendedDto.ownerId) && epx.f(this.price, classifiedsYoulaItemExtendedDto.price) && epx.f(this.isOwner, classifiedsYoulaItemExtendedDto.isOwner) && epx.f(this.description, classifiedsYoulaItemExtendedDto.description) && epx.f(this.geo, classifiedsYoulaItemExtendedDto.geo) && epx.f(this.locationText, classifiedsYoulaItemExtendedDto.locationText) && epx.f(this.distance, classifiedsYoulaItemExtendedDto.distance) && epx.f(this.city, classifiedsYoulaItemExtendedDto.city) && this.blockMode == classifiedsYoulaItemExtendedDto.blockMode && epx.f(this.detailsUrl, classifiedsYoulaItemExtendedDto.detailsUrl) && epx.f(this.actionUrl, classifiedsYoulaItemExtendedDto.actionUrl) && epx.f(this.photos, classifiedsYoulaItemExtendedDto.photos) && epx.f(this.photoTotalCountDescription, classifiedsYoulaItemExtendedDto.photoTotalCountDescription) && epx.f(this.commercialProfileButton, classifiedsYoulaItemExtendedDto.commercialProfileButton) && epx.f(this.rootCategory, classifiedsYoulaItemExtendedDto.rootCategory) && epx.f(this.category, classifiedsYoulaItemExtendedDto.category) && epx.f(this.subCategory, classifiedsYoulaItemExtendedDto.subCategory) && epx.f(this.publishedDate, classifiedsYoulaItemExtendedDto.publishedDate) && epx.f(this.group, classifiedsYoulaItemExtendedDto.group) && epx.f(this.attributes, classifiedsYoulaItemExtendedDto.attributes) && epx.f(this.actionProperties, classifiedsYoulaItemExtendedDto.actionProperties) && epx.f(this.address, classifiedsYoulaItemExtendedDto.address) && epx.f(this.radiusMeters, classifiedsYoulaItemExtendedDto.radiusMeters) && epx.f(this.distanceText, classifiedsYoulaItemExtendedDto.distanceText) && epx.f(this.statusInfo, classifiedsYoulaItemExtendedDto.statusInfo) && epx.f(this.menuActions, classifiedsYoulaItemExtendedDto.menuActions) && epx.f(this.buttonActions, classifiedsYoulaItemExtendedDto.buttonActions) && epx.f(this.isUserBlacklisted, classifiedsYoulaItemExtendedDto.isUserBlacklisted) && epx.f(this.favoriteCounter, classifiedsYoulaItemExtendedDto.favoriteCounter) && epx.f(this.views, classifiedsYoulaItemExtendedDto.views) && epx.f(this.blockTypeText, classifiedsYoulaItemExtendedDto.blockTypeText) && epx.f(this.shareUrl, classifiedsYoulaItemExtendedDto.shareUrl) && epx.f(this.author, classifiedsYoulaItemExtendedDto.author) && epx.f(this.youlaOwnerName, classifiedsYoulaItemExtendedDto.youlaOwnerName) && epx.f(this.youlaUserId, classifiedsYoulaItemExtendedDto.youlaUserId) && epx.f(this.title, classifiedsYoulaItemExtendedDto.title) && epx.f(this.onClickOptions, classifiedsYoulaItemExtendedDto.onClickOptions) && epx.f(this.isFavorite, classifiedsYoulaItemExtendedDto.isFavorite) && epx.f(this.thumb, classifiedsYoulaItemExtendedDto.thumb) && epx.f(this.photo, classifiedsYoulaItemExtendedDto.photo) && epx.f(this.isAntibaraholkaSource, classifiedsYoulaItemExtendedDto.isAntibaraholkaSource) && this.status == classifiedsYoulaItemExtendedDto.status && epx.f(this.isCringe, classifiedsYoulaItemExtendedDto.isCringe);
    }

    public final int hashCode() {
        int hashCode = (this.price.hashCode() + bh10.a(urd0.a(shy.a(this.internalId, Integer.hashCode(this.internalOwnerId) * 31, 31), 31, this.id), 31, this.ownerId.b)) * 31;
        Boolean bool = this.isOwner;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.description;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        BaseGeoCoordinatesDto baseGeoCoordinatesDto = this.geo;
        int hashCode4 = (hashCode3 + (baseGeoCoordinatesDto == null ? 0 : baseGeoCoordinatesDto.hashCode())) * 31;
        String str2 = this.locationText;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.distance;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.city;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BlockModeDto blockModeDto = this.blockMode;
        int hashCode8 = (hashCode7 + (blockModeDto == null ? 0 : blockModeDto.hashCode())) * 31;
        String str4 = this.detailsUrl;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.actionUrl;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<ClassifiedsYoulaItemPhotoDto> list = this.photos;
        int hashCode11 = (hashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.photoTotalCountDescription;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        BaseLinkButtonDto baseLinkButtonDto = this.commercialProfileButton;
        int hashCode13 = (hashCode12 + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode())) * 31;
        String str7 = this.rootCategory;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.category;
        int hashCode15 = (hashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.subCategory;
        int hashCode16 = (hashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num2 = this.publishedDate;
        int hashCode17 = (hashCode16 + (num2 == null ? 0 : num2.hashCode())) * 31;
        GroupsGroupFullDto groupsGroupFullDto = this.group;
        int hashCode18 = (hashCode17 + (groupsGroupFullDto == null ? 0 : groupsGroupFullDto.hashCode())) * 31;
        List<ClassifiedsYoulaItemAttributeDto> list2 = this.attributes;
        int hashCode19 = (hashCode18 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ClassifiedsYoulaItemActionPropertiesDto classifiedsYoulaItemActionPropertiesDto = this.actionProperties;
        int hashCode20 = (hashCode19 + (classifiedsYoulaItemActionPropertiesDto == null ? 0 : classifiedsYoulaItemActionPropertiesDto.hashCode())) * 31;
        String str10 = this.address;
        int hashCode21 = (hashCode20 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num3 = this.radiusMeters;
        int hashCode22 = (hashCode21 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str11 = this.distanceText;
        int hashCode23 = (hashCode22 + (str11 == null ? 0 : str11.hashCode())) * 31;
        ClassifiedsYoulaItemStatusInfoDto classifiedsYoulaItemStatusInfoDto = this.statusInfo;
        int hashCode24 = (hashCode23 + (classifiedsYoulaItemStatusInfoDto == null ? 0 : classifiedsYoulaItemStatusInfoDto.hashCode())) * 31;
        List<ClassifiedsYoulaItemActionButtonDto> list3 = this.menuActions;
        int hashCode25 = (hashCode24 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<ClassifiedsYoulaItemActionButtonDto> list4 = this.buttonActions;
        int hashCode26 = (hashCode25 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Boolean bool2 = this.isUserBlacklisted;
        int hashCode27 = (hashCode26 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num4 = this.favoriteCounter;
        int hashCode28 = (hashCode27 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.views;
        int hashCode29 = (hashCode28 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str12 = this.blockTypeText;
        int hashCode30 = (hashCode29 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.shareUrl;
        int hashCode31 = (hashCode30 + (str13 == null ? 0 : str13.hashCode())) * 31;
        ClassifiedsYoulaItemVkAuthorDto classifiedsYoulaItemVkAuthorDto = this.author;
        int hashCode32 = (hashCode31 + (classifiedsYoulaItemVkAuthorDto == null ? 0 : classifiedsYoulaItemVkAuthorDto.hashCode())) * 31;
        String str14 = this.youlaOwnerName;
        int hashCode33 = (hashCode32 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.youlaUserId;
        int hashCode34 = (hashCode33 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.title;
        int hashCode35 = (hashCode34 + (str16 == null ? 0 : str16.hashCode())) * 31;
        ClassifiedsYoulaItemOnClickOptionsDto classifiedsYoulaItemOnClickOptionsDto = this.onClickOptions;
        int hashCode36 = (hashCode35 + (classifiedsYoulaItemOnClickOptionsDto == null ? 0 : classifiedsYoulaItemOnClickOptionsDto.hashCode())) * 31;
        Boolean bool3 = this.isFavorite;
        int hashCode37 = (hashCode36 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<BaseImageDto> list5 = this.thumb;
        int hashCode38 = (hashCode37 + (list5 == null ? 0 : list5.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode39 = (hashCode38 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        Boolean bool4 = this.isAntibaraholkaSource;
        int hashCode40 = (hashCode39 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        BaseLinkProductStatusDto baseLinkProductStatusDto = this.status;
        int hashCode41 = (hashCode40 + (baseLinkProductStatusDto == null ? 0 : baseLinkProductStatusDto.hashCode())) * 31;
        Boolean bool5 = this.isCringe;
        return hashCode41 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final String toString() {
        int i = this.internalOwnerId;
        int i2 = this.internalId;
        String str = this.id;
        UserId userId = this.ownerId;
        MarketPriceDto marketPriceDto = this.price;
        Boolean bool = this.isOwner;
        String str2 = this.description;
        BaseGeoCoordinatesDto baseGeoCoordinatesDto = this.geo;
        String str3 = this.locationText;
        Integer num = this.distance;
        String str4 = this.city;
        BlockModeDto blockModeDto = this.blockMode;
        String str5 = this.detailsUrl;
        String str6 = this.actionUrl;
        List<ClassifiedsYoulaItemPhotoDto> list = this.photos;
        String str7 = this.photoTotalCountDescription;
        BaseLinkButtonDto baseLinkButtonDto = this.commercialProfileButton;
        String str8 = this.rootCategory;
        String str9 = this.category;
        String str10 = this.subCategory;
        Integer num2 = this.publishedDate;
        GroupsGroupFullDto groupsGroupFullDto = this.group;
        List<ClassifiedsYoulaItemAttributeDto> list2 = this.attributes;
        ClassifiedsYoulaItemActionPropertiesDto classifiedsYoulaItemActionPropertiesDto = this.actionProperties;
        String str11 = this.address;
        Integer num3 = this.radiusMeters;
        String str12 = this.distanceText;
        ClassifiedsYoulaItemStatusInfoDto classifiedsYoulaItemStatusInfoDto = this.statusInfo;
        List<ClassifiedsYoulaItemActionButtonDto> list3 = this.menuActions;
        List<ClassifiedsYoulaItemActionButtonDto> list4 = this.buttonActions;
        Boolean bool2 = this.isUserBlacklisted;
        Integer num4 = this.favoriteCounter;
        Integer num5 = this.views;
        String str13 = this.blockTypeText;
        String str14 = this.shareUrl;
        ClassifiedsYoulaItemVkAuthorDto classifiedsYoulaItemVkAuthorDto = this.author;
        String str15 = this.youlaOwnerName;
        String str16 = this.youlaUserId;
        String str17 = this.title;
        ClassifiedsYoulaItemOnClickOptionsDto classifiedsYoulaItemOnClickOptionsDto = this.onClickOptions;
        Boolean bool3 = this.isFavorite;
        List<BaseImageDto> list5 = this.thumb;
        PhotosPhotoDto photosPhotoDto = this.photo;
        Boolean bool4 = this.isAntibaraholkaSource;
        BaseLinkProductStatusDto baseLinkProductStatusDto = this.status;
        Boolean bool5 = this.isCringe;
        StringBuilder a = odj.a(i, i2, "ClassifiedsYoulaItemExtendedDto(internalOwnerId=", ", internalId=", ", id=");
        a.append(str);
        a.append(", ownerId=");
        a.append(userId);
        a.append(", price=");
        a.append(marketPriceDto);
        a.append(", isOwner=");
        a.append(bool);
        a.append(", description=");
        a.append(str2);
        a.append(", geo=");
        a.append(baseGeoCoordinatesDto);
        a.append(", locationText=");
        kr.b(num, str3, ", distance=", ", city=", a);
        a.append(str4);
        a.append(", blockMode=");
        a.append(blockModeDto);
        a.append(", detailsUrl=");
        n6j.b(a, str5, ", actionUrl=", str6, ", photos=");
        vr.c(", photoTotalCountDescription=", str7, ", commercialProfileButton=", a, list);
        a.append(baseLinkButtonDto);
        a.append(", rootCategory=");
        a.append(str8);
        a.append(", category=");
        n6j.b(a, str9, ", subCategory=", str10, ", publishedDate=");
        a.append(num2);
        a.append(", group=");
        a.append(groupsGroupFullDto);
        a.append(", attributes=");
        a.append(list2);
        a.append(", actionProperties=");
        a.append(classifiedsYoulaItemActionPropertiesDto);
        a.append(", address=");
        kr.b(num3, str11, ", radiusMeters=", ", distanceText=", a);
        a.append(str12);
        a.append(", statusInfo=");
        a.append(classifiedsYoulaItemStatusInfoDto);
        a.append(", menuActions=");
        vq.d(a, list3, ", buttonActions=", list4, ", isUserBlacklisted=");
        a.append(bool2);
        a.append(", favoriteCounter=");
        a.append(num4);
        a.append(", views=");
        mq.b(num5, ", blockTypeText=", str13, ", shareUrl=", a);
        a.append(str14);
        a.append(", author=");
        a.append(classifiedsYoulaItemVkAuthorDto);
        a.append(", youlaOwnerName=");
        n6j.b(a, str15, ", youlaUserId=", str16, ", title=");
        a.append(str17);
        a.append(", onClickOptions=");
        a.append(classifiedsYoulaItemOnClickOptionsDto);
        a.append(", isFavorite=");
        a.append(bool3);
        a.append(", thumb=");
        a.append(list5);
        a.append(", photo=");
        a.append(photosPhotoDto);
        a.append(", isAntibaraholkaSource=");
        a.append(bool4);
        a.append(", status=");
        a.append(baseLinkProductStatusDto);
        a.append(", isCringe=");
        a.append(bool5);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ ClassifiedsYoulaItemExtendedDto(int i, int i2, String str, UserId userId, MarketPriceDto marketPriceDto, Boolean bool, String str2, BaseGeoCoordinatesDto baseGeoCoordinatesDto, String str3, Integer num, String str4, BlockModeDto blockModeDto, String str5, String str6, List list, String str7, BaseLinkButtonDto baseLinkButtonDto, String str8, String str9, String str10, Integer num2, GroupsGroupFullDto groupsGroupFullDto, List list2, ClassifiedsYoulaItemActionPropertiesDto classifiedsYoulaItemActionPropertiesDto, String str11, Integer num3, String str12, ClassifiedsYoulaItemStatusInfoDto classifiedsYoulaItemStatusInfoDto, List list3, List list4, Boolean bool2, Integer num4, Integer num5, String str13, String str14, ClassifiedsYoulaItemVkAuthorDto classifiedsYoulaItemVkAuthorDto, String str15, String str16, String str17, ClassifiedsYoulaItemOnClickOptionsDto classifiedsYoulaItemOnClickOptionsDto, Boolean bool3, List list5, PhotosPhotoDto photosPhotoDto, Boolean bool4, BaseLinkProductStatusDto baseLinkProductStatusDto, Boolean bool5, int i3, int i4, zcl zclVar) {
        this(i, i2, str, userId, marketPriceDto, (i3 & 32) != 0 ? null : bool, (i3 & 64) != 0 ? null : str2, (i3 & 128) != 0 ? null : baseGeoCoordinatesDto, (i3 & 256) != 0 ? null : str3, (i3 & 512) != 0 ? null : num, (i3 & 1024) != 0 ? null : str4, (i3 & 2048) != 0 ? null : blockModeDto, (i3 & 4096) != 0 ? null : str5, (i3 & 8192) != 0 ? null : str6, (i3 & 16384) != 0 ? null : list, (32768 & i3) != 0 ? null : str7, (65536 & i3) != 0 ? null : baseLinkButtonDto, (131072 & i3) != 0 ? null : str8, (262144 & i3) != 0 ? null : str9, (524288 & i3) != 0 ? null : str10, (1048576 & i3) != 0 ? null : num2, (2097152 & i3) != 0 ? null : groupsGroupFullDto, (4194304 & i3) != 0 ? null : list2, (8388608 & i3) != 0 ? null : classifiedsYoulaItemActionPropertiesDto, (16777216 & i3) != 0 ? null : str11, (33554432 & i3) != 0 ? null : num3, (67108864 & i3) != 0 ? null : str12, (134217728 & i3) != 0 ? null : classifiedsYoulaItemStatusInfoDto, (268435456 & i3) != 0 ? null : list3, (536870912 & i3) != 0 ? null : list4, (1073741824 & i3) != 0 ? null : bool2, (i3 & Integer.MIN_VALUE) != 0 ? null : num4, (i4 & 1) != 0 ? null : num5, (i4 & 2) != 0 ? null : str13, (i4 & 4) != 0 ? null : str14, (i4 & 8) != 0 ? null : classifiedsYoulaItemVkAuthorDto, (i4 & 16) != 0 ? null : str15, (i4 & 32) != 0 ? null : str16, (i4 & 64) != 0 ? null : str17, (i4 & 128) != 0 ? null : classifiedsYoulaItemOnClickOptionsDto, (i4 & 256) != 0 ? null : bool3, (i4 & 512) != 0 ? null : list5, (i4 & 1024) != 0 ? null : photosPhotoDto, (i4 & 2048) != 0 ? null : bool4, (i4 & 4096) != 0 ? null : baseLinkProductStatusDto, (i4 & 8192) != 0 ? null : bool5);
    }
}
