package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.dto.common.id.UserId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: CatalogButtonDto.kt */
/* loaded from: classes14.dex */
public final class CatalogButtonDto implements Parcelable {
    public static final Parcelable.Creator<CatalogButtonDto> CREATOR = new a();

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0("album_id")
    private final Integer albumId;

    @pmi0("app_screen")
    private final String appScreen;

    @pmi0("artist_id")
    private final String artistId;

    @pmi0("badge")
    private final Integer badge;

    @pmi0("block_id")
    private final String blockId;

    @pmi0("click_event_type")
    private final String clickEventType;

    @pmi0("collapsed_amount")
    private final Integer collapsedAmount;

    @pmi0("counter")
    private final Integer counter;

    @pmi0("curator_id")
    private final String curatorId;

    @pmi0("default_option")
    private final CatalogButtonOptionsDto defaultOption;

    @pmi0("description")
    private final String description;

    @pmi0("dropdown_actions")
    private final List<CatalogButtonDto> dropdownActions;

    @pmi0("enabled")
    private final Boolean enabled;

    @pmi0("entity_id")
    private final String entityId;

    @pmi0("foreground_images")
    private final List<BaseImageDto> foregroundImages;

    @pmi0("friends_requests_ids")
    private final List<Integer> friendsRequestsIds;

    @pmi0("group_id")
    private final String groupId;

    @pmi0("hint_id")
    private final String hintId;

    @pmi0("icon")
    private final String icon;

    @pmi0("id")
    private final String id;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("is_following")
    private final Boolean isFollowing;

    @pmi0("mix_id")
    private final String mixId;

    @pmi0("mix_options")
    private final String mixOptions;

    @pmi0("option_ids")
    private final List<String> optionIds;

    @pmi0(SignalingProtocol.KEY_OPTIONS)
    private final List<CatalogButtonOptionsDto> options;

    @pmi0("options_title")
    private final String optionsTitle;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("placeholder")
    private final String placeholder;

    @pmi0("ref_data_type")
    private final String refDataType;

    @pmi0("ref_items_count")
    private final Integer refItemsCount;

    @pmi0("ref_layout_name")
    private final String refLayoutName;

    @pmi0("ref_title")
    private final String refTitle;

    @pmi0("search_tab")
    private final String searchTab;

    @pmi0("search_type")
    private final String searchType;

    @pmi0("section_id")
    private final String sectionId;

    @pmi0("target")
    private final String target;

    @pmi0("target_block_ids")
    private final List<String> targetBlockIds;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("video_raw_id")
    private final String videoRawId;

    /* compiled from: CatalogButtonDto.kt */
    public static final class a implements Parcelable.Creator<CatalogButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogButtonDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ArrayList arrayList;
            Boolean bool;
            BaseLinkButtonActionDto baseLinkButtonActionDto;
            ArrayList arrayList2;
            ArrayList arrayList3;
            CatalogButtonOptionsDto catalogButtonOptionsDto;
            Boolean valueOf2;
            ArrayList arrayList4;
            ArrayList arrayList5;
            Integer num;
            ArrayList arrayList6;
            ArrayList arrayList7;
            Integer num2;
            ArrayList arrayList8;
            ArrayList arrayList9;
            BaseLinkButtonActionDto baseLinkButtonActionDto2 = (BaseLinkButtonActionDto) parcel.readParcelable(CatalogButtonDto.class.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            UserId userId = (UserId) parcel.readParcelable(CatalogButtonDto.class.getClassLoader());
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                bool = valueOf;
                int i = 0;
                while (true) {
                    baseLinkButtonActionDto = baseLinkButtonActionDto2;
                    if (i == readInt) {
                        break;
                    }
                    i = en.a(CatalogButtonOptionsDto.CREATOR, parcel, arrayList, i, 1);
                    baseLinkButtonActionDto2 = baseLinkButtonActionDto;
                    readString = readString;
                }
            } else {
                bool = valueOf;
                arrayList = null;
                baseLinkButtonActionDto = baseLinkButtonActionDto2;
            }
            String str = readString;
            String readString9 = parcel.readString();
            CatalogButtonOptionsDto createFromParcel = parcel.readInt() == 0 ? null : CatalogButtonOptionsDto.CREATOR.createFromParcel(parcel);
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                arrayList3 = arrayList;
                int i2 = 0;
                while (true) {
                    catalogButtonOptionsDto = createFromParcel;
                    if (i2 == readInt2) {
                        break;
                    }
                    i2 = pm0.b(parcel, arrayList2, i2, 1);
                    createFromParcel = catalogButtonOptionsDto;
                }
            } else {
                arrayList3 = arrayList;
                arrayList2 = null;
                catalogButtonOptionsDto = createFromParcel;
            }
            Boolean bool2 = bool;
            Integer num3 = valueOf4;
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            String readString10 = parcel.readString();
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            CatalogButtonOptionsDto catalogButtonOptionsDto2 = catalogButtonOptionsDto;
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString15 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList4 = arrayList2;
                num = valueOf5;
                arrayList5 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList4 = arrayList2;
                arrayList5 = new ArrayList(readInt3);
                num = valueOf5;
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(CatalogButtonDto.class, parcel, arrayList5, i3, 1);
                    readInt3 = readInt3;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList7 = arrayList5;
                arrayList6 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList6 = new ArrayList(readInt4);
                arrayList7 = arrayList5;
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = bo.b(CatalogButtonDto.class, parcel, arrayList6, i4, 1);
                    readInt4 = readInt4;
                }
            }
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ArrayList arrayList10 = arrayList3;
            Integer num4 = num;
            String readString16 = parcel.readString();
            CatalogButtonOptionsDto catalogButtonOptionsDto3 = catalogButtonOptionsDto2;
            Boolean bool3 = valueOf2;
            ArrayList arrayList11 = arrayList7;
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            String readString17 = parcel.readString();
            String readString18 = parcel.readString();
            String readString19 = parcel.readString();
            String readString20 = parcel.readString();
            String readString21 = parcel.readString();
            String readString22 = parcel.readString();
            String readString23 = parcel.readString();
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString24 = parcel.readString();
            String readString25 = parcel.readString();
            if (parcel.readInt() == 0) {
                num2 = valueOf6;
                arrayList8 = arrayList6;
                arrayList9 = null;
            } else {
                int readInt5 = parcel.readInt();
                num2 = valueOf6;
                ArrayList arrayList12 = new ArrayList(readInt5);
                arrayList8 = arrayList6;
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = en.a(CatalogButtonDto.CREATOR, parcel, arrayList12, i5, 1);
                    readInt5 = readInt5;
                    catalogButtonOptionsDto3 = catalogButtonOptionsDto3;
                }
                arrayList9 = arrayList12;
            }
            return new CatalogButtonDto(baseLinkButtonActionDto, str, readString2, userId, readString3, readString4, valueOf3, readString5, readString6, readString7, readString8, bool2, arrayList10, readString9, catalogButtonOptionsDto3, num3, arrayList4, createStringArrayList, readString10, num4, readString11, readString12, readString13, readString14, bool3, readString15, arrayList11, arrayList8, num2, readString16, createStringArrayList2, readString17, readString18, readString19, readString20, readString21, readString22, readString23, valueOf7, readString24, readString25, arrayList9);
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogButtonDto[] newArray(int i) {
            return new CatalogButtonDto[i];
        }
    }

    public CatalogButtonDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    public final String B() {
        return this.mixId;
    }

    public final String C() {
        return this.mixOptions;
    }

    public final List<String> D() {
        return this.optionIds;
    }

    public final List<CatalogButtonOptionsDto> F() {
        return this.options;
    }

    public final String G() {
        return this.optionsTitle;
    }

    public final String K() {
        return this.placeholder;
    }

    public final Integer M() {
        return this.refItemsCount;
    }

    public final String R() {
        return this.refLayoutName;
    }

    public final String T() {
        return this.searchType;
    }

    public final String W() {
        return this.sectionId;
    }

    public final List<String> Z() {
        return this.targetBlockIds;
    }

    public final BaseLinkButtonActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.albumId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonDto)) {
            return false;
        }
        CatalogButtonDto catalogButtonDto = (CatalogButtonDto) obj;
        return epx.f(this.action, catalogButtonDto.action) && epx.f(this.trackCode, catalogButtonDto.trackCode) && epx.f(this.sectionId, catalogButtonDto.sectionId) && epx.f(this.ownerId, catalogButtonDto.ownerId) && epx.f(this.title, catalogButtonDto.title) && epx.f(this.description, catalogButtonDto.description) && epx.f(this.badge, catalogButtonDto.badge) && epx.f(this.blockId, catalogButtonDto.blockId) && epx.f(this.artistId, catalogButtonDto.artistId) && epx.f(this.groupId, catalogButtonDto.groupId) && epx.f(this.curatorId, catalogButtonDto.curatorId) && epx.f(this.isFollowing, catalogButtonDto.isFollowing) && epx.f(this.options, catalogButtonDto.options) && epx.f(this.optionsTitle, catalogButtonDto.optionsTitle) && epx.f(this.defaultOption, catalogButtonDto.defaultOption) && epx.f(this.counter, catalogButtonDto.counter) && epx.f(this.friendsRequestsIds, catalogButtonDto.friendsRequestsIds) && epx.f(this.targetBlockIds, catalogButtonDto.targetBlockIds) && epx.f(this.appScreen, catalogButtonDto.appScreen) && epx.f(this.refItemsCount, catalogButtonDto.refItemsCount) && epx.f(this.refLayoutName, catalogButtonDto.refLayoutName) && epx.f(this.refDataType, catalogButtonDto.refDataType) && epx.f(this.hintId, catalogButtonDto.hintId) && epx.f(this.searchTab, catalogButtonDto.searchTab) && epx.f(this.enabled, catalogButtonDto.enabled) && epx.f(this.icon, catalogButtonDto.icon) && epx.f(this.images, catalogButtonDto.images) && epx.f(this.foregroundImages, catalogButtonDto.foregroundImages) && epx.f(this.albumId, catalogButtonDto.albumId) && epx.f(this.id, catalogButtonDto.id) && epx.f(this.optionIds, catalogButtonDto.optionIds) && epx.f(this.searchType, catalogButtonDto.searchType) && epx.f(this.videoRawId, catalogButtonDto.videoRawId) && epx.f(this.clickEventType, catalogButtonDto.clickEventType) && epx.f(this.placeholder, catalogButtonDto.placeholder) && epx.f(this.mixId, catalogButtonDto.mixId) && epx.f(this.mixOptions, catalogButtonDto.mixOptions) && epx.f(this.entityId, catalogButtonDto.entityId) && epx.f(this.collapsedAmount, catalogButtonDto.collapsedAmount) && epx.f(this.refTitle, catalogButtonDto.refTitle) && epx.f(this.target, catalogButtonDto.target) && epx.f(this.dropdownActions, catalogButtonDto.dropdownActions);
    }

    public final String f() {
        return this.appScreen;
    }

    public final String g() {
        return this.artistId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.action;
        int hashCode = (baseLinkButtonActionDto == null ? 0 : baseLinkButtonActionDto.hashCode()) * 31;
        String str = this.trackCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sectionId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UserId userId = this.ownerId;
        int hashCode4 = (hashCode3 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str3 = this.title;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.badge;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.blockId;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.artistId;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.groupId;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.curatorId;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.isFollowing;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<CatalogButtonOptionsDto> list = this.options;
        int hashCode13 = (hashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        String str9 = this.optionsTitle;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        CatalogButtonOptionsDto catalogButtonOptionsDto = this.defaultOption;
        int hashCode15 = (hashCode14 + (catalogButtonOptionsDto == null ? 0 : catalogButtonOptionsDto.hashCode())) * 31;
        Integer num2 = this.counter;
        int hashCode16 = (hashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<Integer> list2 = this.friendsRequestsIds;
        int hashCode17 = (hashCode16 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.targetBlockIds;
        int hashCode18 = (hashCode17 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str10 = this.appScreen;
        int hashCode19 = (hashCode18 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num3 = this.refItemsCount;
        int hashCode20 = (hashCode19 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str11 = this.refLayoutName;
        int hashCode21 = (hashCode20 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.refDataType;
        int hashCode22 = (hashCode21 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.hintId;
        int hashCode23 = (hashCode22 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.searchTab;
        int hashCode24 = (hashCode23 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Boolean bool2 = this.enabled;
        int hashCode25 = (hashCode24 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str15 = this.icon;
        int hashCode26 = (hashCode25 + (str15 == null ? 0 : str15.hashCode())) * 31;
        List<BaseImageDto> list4 = this.images;
        int hashCode27 = (hashCode26 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<BaseImageDto> list5 = this.foregroundImages;
        int hashCode28 = (hashCode27 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Integer num4 = this.albumId;
        int hashCode29 = (hashCode28 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str16 = this.id;
        int hashCode30 = (hashCode29 + (str16 == null ? 0 : str16.hashCode())) * 31;
        List<String> list6 = this.optionIds;
        int hashCode31 = (hashCode30 + (list6 == null ? 0 : list6.hashCode())) * 31;
        String str17 = this.searchType;
        int hashCode32 = (hashCode31 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.videoRawId;
        int hashCode33 = (hashCode32 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.clickEventType;
        int hashCode34 = (hashCode33 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.placeholder;
        int hashCode35 = (hashCode34 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.mixId;
        int hashCode36 = (hashCode35 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.mixOptions;
        int hashCode37 = (hashCode36 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.entityId;
        int hashCode38 = (hashCode37 + (str23 == null ? 0 : str23.hashCode())) * 31;
        Integer num5 = this.collapsedAmount;
        int hashCode39 = (hashCode38 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str24 = this.refTitle;
        int hashCode40 = (hashCode39 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.target;
        int hashCode41 = (hashCode40 + (str25 == null ? 0 : str25.hashCode())) * 31;
        List<CatalogButtonDto> list7 = this.dropdownActions;
        return hashCode41 + (list7 != null ? list7.hashCode() : 0);
    }

    public final String i() {
        return this.blockId;
    }

    public final String j() {
        return this.clickEventType;
    }

    public final Boolean k() {
        return this.enabled;
    }

    public final String l() {
        return this.entityId;
    }

    public final List<BaseImageDto> n() {
        return this.foregroundImages;
    }

    public final String o() {
        return this.hintId;
    }

    public final String p() {
        return this.icon;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonDto(action=");
        sb.append(this.action);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", sectionId=");
        sb.append(this.sectionId);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", badge=");
        sb.append(this.badge);
        sb.append(", blockId=");
        sb.append(this.blockId);
        sb.append(", artistId=");
        sb.append(this.artistId);
        sb.append(", groupId=");
        sb.append(this.groupId);
        sb.append(", curatorId=");
        sb.append(this.curatorId);
        sb.append(", isFollowing=");
        sb.append(this.isFollowing);
        sb.append(", options=");
        sb.append(this.options);
        sb.append(", optionsTitle=");
        sb.append(this.optionsTitle);
        sb.append(", defaultOption=");
        sb.append(this.defaultOption);
        sb.append(", counter=");
        sb.append(this.counter);
        sb.append(", friendsRequestsIds=");
        sb.append(this.friendsRequestsIds);
        sb.append(", targetBlockIds=");
        sb.append(this.targetBlockIds);
        sb.append(", appScreen=");
        sb.append(this.appScreen);
        sb.append(", refItemsCount=");
        sb.append(this.refItemsCount);
        sb.append(", refLayoutName=");
        sb.append(this.refLayoutName);
        sb.append(", refDataType=");
        sb.append(this.refDataType);
        sb.append(", hintId=");
        sb.append(this.hintId);
        sb.append(", searchTab=");
        sb.append(this.searchTab);
        sb.append(", enabled=");
        sb.append(this.enabled);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", images=");
        sb.append(this.images);
        sb.append(", foregroundImages=");
        sb.append(this.foregroundImages);
        sb.append(", albumId=");
        sb.append(this.albumId);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", optionIds=");
        sb.append(this.optionIds);
        sb.append(", searchType=");
        sb.append(this.searchType);
        sb.append(", videoRawId=");
        sb.append(this.videoRawId);
        sb.append(", clickEventType=");
        sb.append(this.clickEventType);
        sb.append(", placeholder=");
        sb.append(this.placeholder);
        sb.append(", mixId=");
        sb.append(this.mixId);
        sb.append(", mixOptions=");
        sb.append(this.mixOptions);
        sb.append(", entityId=");
        sb.append(this.entityId);
        sb.append(", collapsedAmount=");
        sb.append(this.collapsedAmount);
        sb.append(", refTitle=");
        sb.append(this.refTitle);
        sb.append(", target=");
        sb.append(this.target);
        sb.append(", dropdownActions=");
        return ms9.a(')', sb, this.dropdownActions);
    }

    public final List<BaseImageDto> u() {
        return this.images;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.action, i);
        parcel.writeString(this.trackCode);
        parcel.writeString(this.sectionId);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        Integer num = this.badge;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.blockId);
        parcel.writeString(this.artistId);
        parcel.writeString(this.groupId);
        parcel.writeString(this.curatorId);
        Boolean bool = this.isFollowing;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        List<CatalogButtonOptionsDto> list = this.options;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((CatalogButtonOptionsDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.optionsTitle);
        CatalogButtonOptionsDto catalogButtonOptionsDto = this.defaultOption;
        if (catalogButtonOptionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogButtonOptionsDto.writeToParcel(parcel, i);
        }
        Integer num2 = this.counter;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        List<Integer> list2 = this.friendsRequestsIds;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeInt(((Number) f2.next()).intValue());
            }
        }
        parcel.writeStringList(this.targetBlockIds);
        parcel.writeString(this.appScreen);
        Integer num3 = this.refItemsCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeString(this.refLayoutName);
        parcel.writeString(this.refDataType);
        parcel.writeString(this.hintId);
        parcel.writeString(this.searchTab);
        Boolean bool2 = this.enabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.icon);
        List<BaseImageDto> list3 = this.images;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        List<BaseImageDto> list4 = this.foregroundImages;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                parcel.writeParcelable((Parcelable) f4.next(), i);
            }
        }
        Integer num4 = this.albumId;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        parcel.writeString(this.id);
        parcel.writeStringList(this.optionIds);
        parcel.writeString(this.searchType);
        parcel.writeString(this.videoRawId);
        parcel.writeString(this.clickEventType);
        parcel.writeString(this.placeholder);
        parcel.writeString(this.mixId);
        parcel.writeString(this.mixOptions);
        parcel.writeString(this.entityId);
        Integer num5 = this.collapsedAmount;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        parcel.writeString(this.refTitle);
        parcel.writeString(this.target);
        List<CatalogButtonDto> list5 = this.dropdownActions;
        if (list5 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f5 = dn.f(parcel, list5, 1);
        while (f5.hasNext()) {
            ((CatalogButtonDto) f5.next()).writeToParcel(parcel, i);
        }
    }

    public CatalogButtonDto(BaseLinkButtonActionDto baseLinkButtonActionDto, String str, String str2, UserId userId, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, Boolean bool, List<CatalogButtonOptionsDto> list, String str9, CatalogButtonOptionsDto catalogButtonOptionsDto, Integer num2, List<Integer> list2, List<String> list3, String str10, Integer num3, String str11, String str12, String str13, String str14, Boolean bool2, String str15, List<BaseImageDto> list4, List<BaseImageDto> list5, Integer num4, String str16, List<String> list6, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Integer num5, String str24, String str25, List<CatalogButtonDto> list7) {
        this.action = baseLinkButtonActionDto;
        this.trackCode = str;
        this.sectionId = str2;
        this.ownerId = userId;
        this.title = str3;
        this.description = str4;
        this.badge = num;
        this.blockId = str5;
        this.artistId = str6;
        this.groupId = str7;
        this.curatorId = str8;
        this.isFollowing = bool;
        this.options = list;
        this.optionsTitle = str9;
        this.defaultOption = catalogButtonOptionsDto;
        this.counter = num2;
        this.friendsRequestsIds = list2;
        this.targetBlockIds = list3;
        this.appScreen = str10;
        this.refItemsCount = num3;
        this.refLayoutName = str11;
        this.refDataType = str12;
        this.hintId = str13;
        this.searchTab = str14;
        this.enabled = bool2;
        this.icon = str15;
        this.images = list4;
        this.foregroundImages = list5;
        this.albumId = num4;
        this.id = str16;
        this.optionIds = list6;
        this.searchType = str17;
        this.videoRawId = str18;
        this.clickEventType = str19;
        this.placeholder = str20;
        this.mixId = str21;
        this.mixOptions = str22;
        this.entityId = str23;
        this.collapsedAmount = num5;
        this.refTitle = str24;
        this.target = str25;
        this.dropdownActions = list7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CatalogButtonDto(BaseLinkButtonActionDto baseLinkButtonActionDto, String str, String str2, UserId userId, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, Boolean bool, List list, String str9, CatalogButtonOptionsDto catalogButtonOptionsDto, Integer num2, List list2, List list3, String str10, Integer num3, String str11, String str12, String str13, String str14, Boolean bool2, String str15, List list4, List list5, Integer num4, String str16, List list6, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Integer num5, String str24, String str25, List list7, int i, int i2, zcl zclVar) {
        this(r2, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : userId, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : bool, (i & 4096) != 0 ? null : list, (i & 8192) != 0 ? null : str9, (i & 16384) != 0 ? null : catalogButtonOptionsDto, (i & 32768) != 0 ? null : num2, (i & 65536) != 0 ? null : list2, (i & 131072) != 0 ? null : list3, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str10, (i & 524288) != 0 ? null : num3, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str11, (i & 2097152) != 0 ? null : str12, (i & 4194304) != 0 ? null : str13, (i & 8388608) != 0 ? null : str14, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : bool2, (i & 33554432) != 0 ? null : str15, (i & 67108864) != 0 ? null : list4, (i & 134217728) != 0 ? null : list5, (i & 268435456) != 0 ? null : num4, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str16, (i & 1073741824) != 0 ? null : list6, (i & Integer.MIN_VALUE) != 0 ? null : str17, (i2 & 1) != 0 ? null : str18, (i2 & 2) != 0 ? null : str19, (i2 & 4) != 0 ? null : str20, (i2 & 8) != 0 ? null : str21, (i2 & 16) != 0 ? null : str22, (i2 & 32) != 0 ? null : str23, (i2 & 64) != 0 ? null : num5, (i2 & 128) != 0 ? null : str24, (i2 & 256) != 0 ? null : str25, (i2 & 512) != 0 ? null : list7);
        BaseLinkButtonActionDto baseLinkButtonActionDto2 = (i & 1) != 0 ? null : baseLinkButtonActionDto;
    }
}
