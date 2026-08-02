package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseGeoCoordinatesDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.base.dto.BaseLinkProductStatusDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.market.dto.MarketPriceDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.bh10;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ClassifiedsYoulaItemExtendedDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsYoulaItemExtendedDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsYoulaItemExtendedDto> CREATOR = new a();

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

    @pmi0("is_youla_profile_blocked")
    private final Boolean isYoulaProfileBlocked;

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
    public static final class BlockModeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BlockModeDto[] $VALUES;

        @pmi0("1")
        public static final BlockModeDto BLOCKED;
        public static final Parcelable.Creator<BlockModeDto> CREATOR;

        @pmi0("0")
        public static final BlockModeDto NO_BLOCK;

        @pmi0("2")
        public static final BlockModeDto REJECTED;

        @pmi0("3")
        public static final BlockModeDto VK_BLOCKED;
        private final int value;

        /* compiled from: ClassifiedsYoulaItemExtendedDto.kt */
        public static final class a implements Parcelable.Creator<BlockModeDto> {
            @Override // android.os.Parcelable.Creator
            public final BlockModeDto createFromParcel(Parcel parcel) {
                return BlockModeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BlockModeDto[] newArray(int i) {
                return new BlockModeDto[i];
            }
        }

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
            CREATOR = new a();
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

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: ClassifiedsYoulaItemExtendedDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsYoulaItemExtendedDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsYoulaItemExtendedDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int i;
            ArrayList arrayList;
            int i2;
            String str;
            int i3;
            ArrayList arrayList2;
            GroupsGroupFullDto groupsGroupFullDto;
            BaseLinkButtonDto baseLinkButtonDto;
            ArrayList arrayList3;
            int i4;
            ArrayList arrayList4;
            Integer num;
            ArrayList arrayList5;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean bool;
            ClassifiedsYoulaItemVkAuthorDto createFromParcel;
            int i5;
            ClassifiedsYoulaItemOnClickOptionsDto createFromParcel2;
            Boolean valueOf4;
            ClassifiedsYoulaItemOnClickOptionsDto classifiedsYoulaItemOnClickOptionsDto;
            int i6;
            ArrayList arrayList6;
            String str2;
            Boolean valueOf5;
            Boolean valueOf6;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String readString = parcel.readString();
            UserId userId = (UserId) parcel.readParcelable(ClassifiedsYoulaItemExtendedDto.class.getClassLoader());
            MarketPriceDto marketPriceDto = (MarketPriceDto) parcel.readParcelable(ClassifiedsYoulaItemExtendedDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString2 = parcel.readString();
            BaseGeoCoordinatesDto baseGeoCoordinatesDto = (BaseGeoCoordinatesDto) parcel.readParcelable(ClassifiedsYoulaItemExtendedDto.class.getClassLoader());
            String readString3 = parcel.readString();
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            MarketPriceDto marketPriceDto2 = marketPriceDto;
            Boolean bool2 = valueOf;
            String readString4 = parcel.readString();
            BlockModeDto createFromParcel3 = parcel.readInt() == 0 ? null : BlockModeDto.CREATOR.createFromParcel(parcel);
            String readString5 = parcel.readString();
            Integer num2 = valueOf7;
            String readString6 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                i = readInt;
                arrayList = new ArrayList(readInt3);
                i2 = readInt2;
                int i7 = 0;
                while (true) {
                    str = readString;
                    if (i7 == readInt3) {
                        break;
                    }
                    i7 = bo.b(ClassifiedsYoulaItemExtendedDto.class, parcel, arrayList, i7, 1);
                    readString = str;
                }
            } else {
                i = readInt;
                i2 = readInt2;
                arrayList = null;
                str = readString;
            }
            String readString7 = parcel.readString();
            BaseLinkButtonDto baseLinkButtonDto2 = (BaseLinkButtonDto) parcel.readParcelable(ClassifiedsYoulaItemExtendedDto.class.getClassLoader());
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            ArrayList arrayList7 = arrayList;
            int i8 = i;
            String readString10 = parcel.readString();
            Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            GroupsGroupFullDto groupsGroupFullDto2 = (GroupsGroupFullDto) parcel.readParcelable(ClassifiedsYoulaItemExtendedDto.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                i3 = i8;
                arrayList2 = new ArrayList(readInt4);
                groupsGroupFullDto = groupsGroupFullDto2;
                int i9 = 0;
                while (true) {
                    baseLinkButtonDto = baseLinkButtonDto2;
                    if (i9 == readInt4) {
                        break;
                    }
                    i9 = en.a(ClassifiedsYoulaItemAttributeDto.CREATOR, parcel, arrayList2, i9, 1);
                    baseLinkButtonDto2 = baseLinkButtonDto;
                    marketPriceDto2 = marketPriceDto2;
                }
            } else {
                i3 = i8;
                groupsGroupFullDto = groupsGroupFullDto2;
                arrayList2 = null;
                baseLinkButtonDto = baseLinkButtonDto2;
            }
            MarketPriceDto marketPriceDto3 = marketPriceDto2;
            ClassifiedsYoulaItemActionPropertiesDto createFromParcel4 = parcel.readInt() == 0 ? null : ClassifiedsYoulaItemActionPropertiesDto.CREATOR.createFromParcel(parcel);
            UserId userId2 = userId;
            int i10 = i2;
            Integer num3 = valueOf8;
            String readString11 = parcel.readString();
            Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString12 = parcel.readString();
            ClassifiedsYoulaItemStatusInfoDto createFromParcel5 = parcel.readInt() != 0 ? ClassifiedsYoulaItemStatusInfoDto.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() == 0) {
                arrayList3 = arrayList2;
                i4 = i10;
                num = valueOf9;
                arrayList4 = null;
            } else {
                arrayList3 = arrayList2;
                int readInt5 = parcel.readInt();
                i4 = i10;
                arrayList4 = new ArrayList(readInt5);
                num = valueOf9;
                int i11 = 0;
                while (i11 != readInt5) {
                    i11 = en.a(ClassifiedsYoulaItemActionButtonDto.CREATOR, parcel, arrayList4, i11, 1);
                    readInt5 = readInt5;
                    userId2 = userId2;
                }
            }
            UserId userId3 = userId2;
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int readInt6 = parcel.readInt();
                arrayList5 = new ArrayList(readInt6);
                int i12 = 0;
                while (i12 != readInt6) {
                    i12 = en.a(ClassifiedsYoulaItemActionButtonDto.CREATOR, parcel, arrayList5, i12, 1);
                    readInt6 = readInt6;
                    arrayList4 = arrayList4;
                }
            }
            ArrayList arrayList8 = arrayList4;
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf11 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer num4 = valueOf10;
            int i13 = i4;
            String readString13 = parcel.readString();
            Integer num5 = num;
            String readString14 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool = valueOf2;
                createFromParcel = null;
            } else {
                bool = valueOf2;
                createFromParcel = ClassifiedsYoulaItemVkAuthorDto.CREATOR.createFromParcel(parcel);
            }
            ClassifiedsYoulaItemVkAuthorDto classifiedsYoulaItemVkAuthorDto = createFromParcel;
            int i14 = i3;
            BaseLinkButtonDto baseLinkButtonDto3 = baseLinkButtonDto;
            ArrayList arrayList9 = arrayList5;
            String str3 = str;
            GroupsGroupFullDto groupsGroupFullDto3 = groupsGroupFullDto;
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            Boolean bool3 = valueOf3;
            String readString17 = parcel.readString();
            if (parcel.readInt() == 0) {
                i5 = i14;
                createFromParcel2 = null;
            } else {
                i5 = i14;
                createFromParcel2 = ClassifiedsYoulaItemOnClickOptionsDto.CREATOR.createFromParcel(parcel);
            }
            ClassifiedsYoulaItemOnClickOptionsDto classifiedsYoulaItemOnClickOptionsDto2 = createFromParcel2;
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                classifiedsYoulaItemOnClickOptionsDto = classifiedsYoulaItemOnClickOptionsDto2;
                i6 = i13;
                str2 = str3;
                arrayList6 = null;
            } else {
                classifiedsYoulaItemOnClickOptionsDto = classifiedsYoulaItemOnClickOptionsDto2;
                int readInt7 = parcel.readInt();
                i6 = i13;
                arrayList6 = new ArrayList(readInt7);
                str2 = str3;
                int i15 = 0;
                while (i15 != readInt7) {
                    i15 = bo.b(ClassifiedsYoulaItemExtendedDto.class, parcel, arrayList6, i15, 1);
                    readInt7 = readInt7;
                }
            }
            PhotosPhotoDto photosPhotoDto = (PhotosPhotoDto) parcel.readParcelable(ClassifiedsYoulaItemExtendedDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            BaseLinkProductStatusDto baseLinkProductStatusDto = (BaseLinkProductStatusDto) parcel.readParcelable(ClassifiedsYoulaItemExtendedDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ClassifiedsYoulaItemExtendedDto(i5, i6, str2, userId3, marketPriceDto3, bool2, readString2, baseGeoCoordinatesDto, readString3, num2, readString4, createFromParcel3, readString5, readString6, arrayList7, readString7, baseLinkButtonDto3, readString8, readString9, readString10, num3, groupsGroupFullDto3, arrayList3, createFromParcel4, readString11, num5, readString12, createFromParcel5, arrayList8, arrayList9, bool, num4, valueOf11, readString13, readString14, bool3, classifiedsYoulaItemVkAuthorDto, readString15, readString16, readString17, classifiedsYoulaItemOnClickOptionsDto, valueOf4, arrayList6, photosPhotoDto, valueOf5, baseLinkProductStatusDto, valueOf6);
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsYoulaItemExtendedDto[] newArray(int i) {
            return new ClassifiedsYoulaItemExtendedDto[i];
        }
    }

    public ClassifiedsYoulaItemExtendedDto(int i, int i2, String str, UserId userId, MarketPriceDto marketPriceDto, Boolean bool, String str2, BaseGeoCoordinatesDto baseGeoCoordinatesDto, String str3, Integer num, String str4, BlockModeDto blockModeDto, String str5, String str6, List<ClassifiedsYoulaItemPhotoDto> list, String str7, BaseLinkButtonDto baseLinkButtonDto, String str8, String str9, String str10, Integer num2, GroupsGroupFullDto groupsGroupFullDto, List<ClassifiedsYoulaItemAttributeDto> list2, ClassifiedsYoulaItemActionPropertiesDto classifiedsYoulaItemActionPropertiesDto, String str11, Integer num3, String str12, ClassifiedsYoulaItemStatusInfoDto classifiedsYoulaItemStatusInfoDto, List<ClassifiedsYoulaItemActionButtonDto> list3, List<ClassifiedsYoulaItemActionButtonDto> list4, Boolean bool2, Integer num4, Integer num5, String str13, String str14, Boolean bool3, ClassifiedsYoulaItemVkAuthorDto classifiedsYoulaItemVkAuthorDto, String str15, String str16, String str17, ClassifiedsYoulaItemOnClickOptionsDto classifiedsYoulaItemOnClickOptionsDto, Boolean bool4, List<BaseImageDto> list5, PhotosPhotoDto photosPhotoDto, Boolean bool5, BaseLinkProductStatusDto baseLinkProductStatusDto, Boolean bool6) {
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
        this.isYoulaProfileBlocked = bool3;
        this.author = classifiedsYoulaItemVkAuthorDto;
        this.youlaOwnerName = str15;
        this.youlaUserId = str16;
        this.title = str17;
        this.onClickOptions = classifiedsYoulaItemOnClickOptionsDto;
        this.isFavorite = bool4;
        this.thumb = list5;
        this.photo = photosPhotoDto;
        this.isAntibaraholkaSource = bool5;
        this.status = baseLinkProductStatusDto;
        this.isCringe = bool6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaItemExtendedDto)) {
            return false;
        }
        ClassifiedsYoulaItemExtendedDto classifiedsYoulaItemExtendedDto = (ClassifiedsYoulaItemExtendedDto) obj;
        return this.internalOwnerId == classifiedsYoulaItemExtendedDto.internalOwnerId && this.internalId == classifiedsYoulaItemExtendedDto.internalId && epx.f(this.id, classifiedsYoulaItemExtendedDto.id) && epx.f(this.ownerId, classifiedsYoulaItemExtendedDto.ownerId) && epx.f(this.price, classifiedsYoulaItemExtendedDto.price) && epx.f(this.isOwner, classifiedsYoulaItemExtendedDto.isOwner) && epx.f(this.description, classifiedsYoulaItemExtendedDto.description) && epx.f(this.geo, classifiedsYoulaItemExtendedDto.geo) && epx.f(this.locationText, classifiedsYoulaItemExtendedDto.locationText) && epx.f(this.distance, classifiedsYoulaItemExtendedDto.distance) && epx.f(this.city, classifiedsYoulaItemExtendedDto.city) && this.blockMode == classifiedsYoulaItemExtendedDto.blockMode && epx.f(this.detailsUrl, classifiedsYoulaItemExtendedDto.detailsUrl) && epx.f(this.actionUrl, classifiedsYoulaItemExtendedDto.actionUrl) && epx.f(this.photos, classifiedsYoulaItemExtendedDto.photos) && epx.f(this.photoTotalCountDescription, classifiedsYoulaItemExtendedDto.photoTotalCountDescription) && epx.f(this.commercialProfileButton, classifiedsYoulaItemExtendedDto.commercialProfileButton) && epx.f(this.rootCategory, classifiedsYoulaItemExtendedDto.rootCategory) && epx.f(this.category, classifiedsYoulaItemExtendedDto.category) && epx.f(this.subCategory, classifiedsYoulaItemExtendedDto.subCategory) && epx.f(this.publishedDate, classifiedsYoulaItemExtendedDto.publishedDate) && epx.f(this.group, classifiedsYoulaItemExtendedDto.group) && epx.f(this.attributes, classifiedsYoulaItemExtendedDto.attributes) && epx.f(this.actionProperties, classifiedsYoulaItemExtendedDto.actionProperties) && epx.f(this.address, classifiedsYoulaItemExtendedDto.address) && epx.f(this.radiusMeters, classifiedsYoulaItemExtendedDto.radiusMeters) && epx.f(this.distanceText, classifiedsYoulaItemExtendedDto.distanceText) && epx.f(this.statusInfo, classifiedsYoulaItemExtendedDto.statusInfo) && epx.f(this.menuActions, classifiedsYoulaItemExtendedDto.menuActions) && epx.f(this.buttonActions, classifiedsYoulaItemExtendedDto.buttonActions) && epx.f(this.isUserBlacklisted, classifiedsYoulaItemExtendedDto.isUserBlacklisted) && epx.f(this.favoriteCounter, classifiedsYoulaItemExtendedDto.favoriteCounter) && epx.f(this.views, classifiedsYoulaItemExtendedDto.views) && epx.f(this.blockTypeText, classifiedsYoulaItemExtendedDto.blockTypeText) && epx.f(this.shareUrl, classifiedsYoulaItemExtendedDto.shareUrl) && epx.f(this.isYoulaProfileBlocked, classifiedsYoulaItemExtendedDto.isYoulaProfileBlocked) && epx.f(this.author, classifiedsYoulaItemExtendedDto.author) && epx.f(this.youlaOwnerName, classifiedsYoulaItemExtendedDto.youlaOwnerName) && epx.f(this.youlaUserId, classifiedsYoulaItemExtendedDto.youlaUserId) && epx.f(this.title, classifiedsYoulaItemExtendedDto.title) && epx.f(this.onClickOptions, classifiedsYoulaItemExtendedDto.onClickOptions) && epx.f(this.isFavorite, classifiedsYoulaItemExtendedDto.isFavorite) && epx.f(this.thumb, classifiedsYoulaItemExtendedDto.thumb) && epx.f(this.photo, classifiedsYoulaItemExtendedDto.photo) && epx.f(this.isAntibaraholkaSource, classifiedsYoulaItemExtendedDto.isAntibaraholkaSource) && this.status == classifiedsYoulaItemExtendedDto.status && epx.f(this.isCringe, classifiedsYoulaItemExtendedDto.isCringe);
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
        Boolean bool3 = this.isYoulaProfileBlocked;
        int hashCode32 = (hashCode31 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        ClassifiedsYoulaItemVkAuthorDto classifiedsYoulaItemVkAuthorDto = this.author;
        int hashCode33 = (hashCode32 + (classifiedsYoulaItemVkAuthorDto == null ? 0 : classifiedsYoulaItemVkAuthorDto.hashCode())) * 31;
        String str14 = this.youlaOwnerName;
        int hashCode34 = (hashCode33 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.youlaUserId;
        int hashCode35 = (hashCode34 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.title;
        int hashCode36 = (hashCode35 + (str16 == null ? 0 : str16.hashCode())) * 31;
        ClassifiedsYoulaItemOnClickOptionsDto classifiedsYoulaItemOnClickOptionsDto = this.onClickOptions;
        int hashCode37 = (hashCode36 + (classifiedsYoulaItemOnClickOptionsDto == null ? 0 : classifiedsYoulaItemOnClickOptionsDto.hashCode())) * 31;
        Boolean bool4 = this.isFavorite;
        int hashCode38 = (hashCode37 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List<BaseImageDto> list5 = this.thumb;
        int hashCode39 = (hashCode38 + (list5 == null ? 0 : list5.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode40 = (hashCode39 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        Boolean bool5 = this.isAntibaraholkaSource;
        int hashCode41 = (hashCode40 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        BaseLinkProductStatusDto baseLinkProductStatusDto = this.status;
        int hashCode42 = (hashCode41 + (baseLinkProductStatusDto == null ? 0 : baseLinkProductStatusDto.hashCode())) * 31;
        Boolean bool6 = this.isCringe;
        return hashCode42 + (bool6 != null ? bool6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassifiedsYoulaItemExtendedDto(internalOwnerId=");
        sb.append(this.internalOwnerId);
        sb.append(", internalId=");
        sb.append(this.internalId);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", isOwner=");
        sb.append(this.isOwner);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", geo=");
        sb.append(this.geo);
        sb.append(", locationText=");
        sb.append(this.locationText);
        sb.append(", distance=");
        sb.append(this.distance);
        sb.append(", city=");
        sb.append(this.city);
        sb.append(", blockMode=");
        sb.append(this.blockMode);
        sb.append(", detailsUrl=");
        sb.append(this.detailsUrl);
        sb.append(", actionUrl=");
        sb.append(this.actionUrl);
        sb.append(", photos=");
        sb.append(this.photos);
        sb.append(", photoTotalCountDescription=");
        sb.append(this.photoTotalCountDescription);
        sb.append(", commercialProfileButton=");
        sb.append(this.commercialProfileButton);
        sb.append(", rootCategory=");
        sb.append(this.rootCategory);
        sb.append(", category=");
        sb.append(this.category);
        sb.append(", subCategory=");
        sb.append(this.subCategory);
        sb.append(", publishedDate=");
        sb.append(this.publishedDate);
        sb.append(", group=");
        sb.append(this.group);
        sb.append(", attributes=");
        sb.append(this.attributes);
        sb.append(", actionProperties=");
        sb.append(this.actionProperties);
        sb.append(", address=");
        sb.append(this.address);
        sb.append(", radiusMeters=");
        sb.append(this.radiusMeters);
        sb.append(", distanceText=");
        sb.append(this.distanceText);
        sb.append(", statusInfo=");
        sb.append(this.statusInfo);
        sb.append(", menuActions=");
        sb.append(this.menuActions);
        sb.append(", buttonActions=");
        sb.append(this.buttonActions);
        sb.append(", isUserBlacklisted=");
        sb.append(this.isUserBlacklisted);
        sb.append(", favoriteCounter=");
        sb.append(this.favoriteCounter);
        sb.append(", views=");
        sb.append(this.views);
        sb.append(", blockTypeText=");
        sb.append(this.blockTypeText);
        sb.append(", shareUrl=");
        sb.append(this.shareUrl);
        sb.append(", isYoulaProfileBlocked=");
        sb.append(this.isYoulaProfileBlocked);
        sb.append(", author=");
        sb.append(this.author);
        sb.append(", youlaOwnerName=");
        sb.append(this.youlaOwnerName);
        sb.append(", youlaUserId=");
        sb.append(this.youlaUserId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", onClickOptions=");
        sb.append(this.onClickOptions);
        sb.append(", isFavorite=");
        sb.append(this.isFavorite);
        sb.append(", thumb=");
        sb.append(this.thumb);
        sb.append(", photo=");
        sb.append(this.photo);
        sb.append(", isAntibaraholkaSource=");
        sb.append(this.isAntibaraholkaSource);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", isCringe=");
        return tn.a(sb, this.isCringe, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.internalOwnerId);
        parcel.writeInt(this.internalId);
        parcel.writeString(this.id);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeParcelable(this.price, i);
        Boolean bool = this.isOwner;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.description);
        parcel.writeParcelable(this.geo, i);
        parcel.writeString(this.locationText);
        Integer num = this.distance;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.city);
        BlockModeDto blockModeDto = this.blockMode;
        if (blockModeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            blockModeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.detailsUrl);
        parcel.writeString(this.actionUrl);
        List<ClassifiedsYoulaItemPhotoDto> list = this.photos;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.photoTotalCountDescription);
        parcel.writeParcelable(this.commercialProfileButton, i);
        parcel.writeString(this.rootCategory);
        parcel.writeString(this.category);
        parcel.writeString(this.subCategory);
        Integer num2 = this.publishedDate;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeParcelable(this.group, i);
        List<ClassifiedsYoulaItemAttributeDto> list2 = this.attributes;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((ClassifiedsYoulaItemAttributeDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        ClassifiedsYoulaItemActionPropertiesDto classifiedsYoulaItemActionPropertiesDto = this.actionProperties;
        if (classifiedsYoulaItemActionPropertiesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            classifiedsYoulaItemActionPropertiesDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.address);
        Integer num3 = this.radiusMeters;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeString(this.distanceText);
        ClassifiedsYoulaItemStatusInfoDto classifiedsYoulaItemStatusInfoDto = this.statusInfo;
        if (classifiedsYoulaItemStatusInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            classifiedsYoulaItemStatusInfoDto.writeToParcel(parcel, i);
        }
        List<ClassifiedsYoulaItemActionButtonDto> list3 = this.menuActions;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((ClassifiedsYoulaItemActionButtonDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        List<ClassifiedsYoulaItemActionButtonDto> list4 = this.buttonActions;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                ((ClassifiedsYoulaItemActionButtonDto) f4.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool2 = this.isUserBlacklisted;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Integer num4 = this.favoriteCounter;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Integer num5 = this.views;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        parcel.writeString(this.blockTypeText);
        parcel.writeString(this.shareUrl);
        Boolean bool3 = this.isYoulaProfileBlocked;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        ClassifiedsYoulaItemVkAuthorDto classifiedsYoulaItemVkAuthorDto = this.author;
        if (classifiedsYoulaItemVkAuthorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            classifiedsYoulaItemVkAuthorDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.youlaOwnerName);
        parcel.writeString(this.youlaUserId);
        parcel.writeString(this.title);
        ClassifiedsYoulaItemOnClickOptionsDto classifiedsYoulaItemOnClickOptionsDto = this.onClickOptions;
        if (classifiedsYoulaItemOnClickOptionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            classifiedsYoulaItemOnClickOptionsDto.writeToParcel(parcel, i);
        }
        Boolean bool4 = this.isFavorite;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        List<BaseImageDto> list5 = this.thumb;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                parcel.writeParcelable((Parcelable) f5.next(), i);
            }
        }
        parcel.writeParcelable(this.photo, i);
        Boolean bool5 = this.isAntibaraholkaSource;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        parcel.writeParcelable(this.status, i);
        Boolean bool6 = this.isCringe;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
    }

    public /* synthetic */ ClassifiedsYoulaItemExtendedDto(int i, int i2, String str, UserId userId, MarketPriceDto marketPriceDto, Boolean bool, String str2, BaseGeoCoordinatesDto baseGeoCoordinatesDto, String str3, Integer num, String str4, BlockModeDto blockModeDto, String str5, String str6, List list, String str7, BaseLinkButtonDto baseLinkButtonDto, String str8, String str9, String str10, Integer num2, GroupsGroupFullDto groupsGroupFullDto, List list2, ClassifiedsYoulaItemActionPropertiesDto classifiedsYoulaItemActionPropertiesDto, String str11, Integer num3, String str12, ClassifiedsYoulaItemStatusInfoDto classifiedsYoulaItemStatusInfoDto, List list3, List list4, Boolean bool2, Integer num4, Integer num5, String str13, String str14, Boolean bool3, ClassifiedsYoulaItemVkAuthorDto classifiedsYoulaItemVkAuthorDto, String str15, String str16, String str17, ClassifiedsYoulaItemOnClickOptionsDto classifiedsYoulaItemOnClickOptionsDto, Boolean bool4, List list5, PhotosPhotoDto photosPhotoDto, Boolean bool5, BaseLinkProductStatusDto baseLinkProductStatusDto, Boolean bool6, int i3, int i4, zcl zclVar) {
        this(i, i2, str, userId, marketPriceDto, (i3 & 32) != 0 ? null : bool, (i3 & 64) != 0 ? null : str2, (i3 & 128) != 0 ? null : baseGeoCoordinatesDto, (i3 & 256) != 0 ? null : str3, (i3 & 512) != 0 ? null : num, (i3 & 1024) != 0 ? null : str4, (i3 & 2048) != 0 ? null : blockModeDto, (i3 & 4096) != 0 ? null : str5, (i3 & 8192) != 0 ? null : str6, (i3 & 16384) != 0 ? null : list, (32768 & i3) != 0 ? null : str7, (65536 & i3) != 0 ? null : baseLinkButtonDto, (131072 & i3) != 0 ? null : str8, (262144 & i3) != 0 ? null : str9, (524288 & i3) != 0 ? null : str10, (1048576 & i3) != 0 ? null : num2, (2097152 & i3) != 0 ? null : groupsGroupFullDto, (4194304 & i3) != 0 ? null : list2, (8388608 & i3) != 0 ? null : classifiedsYoulaItemActionPropertiesDto, (16777216 & i3) != 0 ? null : str11, (33554432 & i3) != 0 ? null : num3, (67108864 & i3) != 0 ? null : str12, (134217728 & i3) != 0 ? null : classifiedsYoulaItemStatusInfoDto, (268435456 & i3) != 0 ? null : list3, (536870912 & i3) != 0 ? null : list4, (1073741824 & i3) != 0 ? null : bool2, (i3 & Integer.MIN_VALUE) != 0 ? null : num4, (i4 & 1) != 0 ? null : num5, (i4 & 2) != 0 ? null : str13, (i4 & 4) != 0 ? null : str14, (i4 & 8) != 0 ? null : bool3, (i4 & 16) != 0 ? null : classifiedsYoulaItemVkAuthorDto, (i4 & 32) != 0 ? null : str15, (i4 & 64) != 0 ? null : str16, (i4 & 128) != 0 ? null : str17, (i4 & 256) != 0 ? null : classifiedsYoulaItemOnClickOptionsDto, (i4 & 512) != 0 ? null : bool4, (i4 & 1024) != 0 ? null : list5, (i4 & 2048) != 0 ? null : photosPhotoDto, (i4 & 4096) != 0 ? null : bool5, (i4 & 8192) != 0 ? null : baseLinkProductStatusDto, (i4 & 16384) != 0 ? null : bool6);
    }
}
