package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.wp;
import xsna.zcl;

/* compiled from: GroupsGetSettingsResponseDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGetSettingsResponseDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGetSettingsResponseDto> CREATOR = new a();

    @pmi0("access")
    private final GroupsGroupAccessDto access;

    @pmi0("action_button")
    private final GroupsActionButtonDto actionButton;

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    private final String address;

    @pmi0("addresses")
    private final Boolean addresses;

    @pmi0("age_limits")
    private final GroupsGroupAgeLimitsDto ageLimits;

    @pmi0("articles")
    private final int articles;

    @pmi0("audio")
    private final GroupsGroupAudioDto audio;

    @pmi0("badges")
    private final BaseBoolIntDto badges;

    @pmi0("bot_online_booking_enabled")
    private final BaseBoolIntDto botOnlineBookingEnabled;

    @pmi0("bots_add_to_chat")
    private final BaseBoolIntDto botsAddToChat;

    @pmi0("bots_capabilities")
    private final BaseBoolIntDto botsCapabilities;

    @pmi0("bots_start_button")
    private final BaseBoolIntDto botsStartButton;

    @pmi0("calls_to_community")
    private final Boolean callsToCommunity;

    @pmi0("calls_to_community_privacy")
    private final GroupsGroupCallsToCommunityPrivacyDto callsToCommunityPrivacy;

    @pmi0("city_id")
    private final int cityId;

    @pmi0("city_name")
    private final String cityName;

    @pmi0("clips")
    private final Integer clips;

    @pmi0("co_ownership_disabled")
    private final Boolean coOwnershipDisabled;

    @pmi0("contacts")
    private final BaseBoolIntDto contacts;

    @pmi0(AnalyticsBaseParamsConstantsKt.COUNTRY_ID)
    private final int countryId;

    @pmi0("country_name")
    private final String countryName;

    @pmi0("description")
    private final String description;

    @pmi0("disable_replies_from_groups")
    private final BaseBoolIntDto disableRepliesFromGroups;

    @pmi0("docs")
    private final GroupsGroupDocsDto docs;

    @pmi0("email")
    private final String email;

    @pmi0("enable_replies")
    private final BaseBoolIntDto enableReplies;

    @pmi0("event_group_id")
    private final Integer eventGroupId;

    @pmi0("events")
    private final BaseBoolIntDto events;

    @pmi0("finish_date")
    private final Integer finishDate;

    @pmi0("is_suggested_post_enabled")
    private final Boolean isSuggestedPostEnabled;

    @pmi0("links")
    private final BaseBoolIntDto links;

    @pmi0("links_list")
    private final List<GroupsLinksItemDto> linksList;

    @pmi0("live_covers")
    private final GroupsLiveCoversDto liveCovers;

    @pmi0("main_section")
    private final GroupsGroupFullSectionDto mainSection;

    @pmi0("market")
    private final GroupsSettingsMarketDto market;

    @pmi0("market_services")
    private final GroupsSettingsMarketServicesDto marketServices;

    @pmi0("messages")
    private final BaseBoolIntDto messages;

    @pmi0("narratives")
    private final Integer narratives;

    @pmi0("obscene_filter")
    private final BaseBoolIntDto obsceneFilter;

    @pmi0("obscene_stopwords")
    private final BaseBoolIntDto obsceneStopwords;

    @pmi0("obscene_words")
    private final List<String> obsceneWords;

    @pmi0("phone")
    private final String phone;

    @pmi0("photos")
    private final GroupsGroupPhotosDto photos;

    @pmi0("public_category")
    private final Integer publicCategory;

    @pmi0("public_category_gender")
    private final BaseSexDto publicCategoryGender;

    @pmi0("public_category_list")
    private final List<GroupsGroupPublicCategoryListDto> publicCategoryList;

    @pmi0("public_date")
    private final String publicDate;

    @pmi0("public_date_label")
    private final String publicDateLabel;

    @pmi0("public_subcategory")
    private final Integer publicSubcategory;

    @pmi0("recognize_photo")
    private final Integer recognizePhoto;

    @pmi0(SignalingProtocol.KEY_ROOMS)
    private final Integer rooms;

    @pmi0("rss")
    private final String rss;

    @pmi0("secondary_section")
    private final GroupsGroupFullSectionDto secondarySection;

    @pmi0("sections_list")
    private final List<GroupsSectionsListItemDto> sectionsList;

    @pmi0("start_date")
    private final Integer startDate;

    @pmi0("subject")
    private final Integer subject;

    @pmi0("subject_list")
    private final List<GroupsSubjectItemDto> subjectList;

    @pmi0("suggested_privacy")
    private final GroupsGroupSuggestedPrivacyDto suggestedPrivacy;

    @pmi0("textlives")
    private final BaseBoolIntDto textlives;

    @pmi0("title")
    private final String title;

    @pmi0("topics")
    private final GroupsGroupTopicsDto topics;

    @pmi0("toxic_filter")
    private final BaseBoolIntDto toxicFilter;

    @pmi0("twitter")
    private final GroupsSettingsTwitterDto twitter;

    @pmi0("video")
    private final GroupsGroupVideoDto video;

    @pmi0("wall")
    private final GroupsGroupWallDto wall;

    @pmi0("website")
    private final String website;

    @pmi0("wiki")
    private final GroupsGroupWikiDto wiki;

    @pmi0("youla")
    private final GroupsSettingsYoulaDto youla;

    /* compiled from: GroupsGetSettingsResponseDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGetSettingsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGetSettingsResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            BaseBoolIntDto baseBoolIntDto;
            GroupsGroupAudioDto groupsGroupAudioDto;
            ArrayList arrayList;
            int i;
            Class cls;
            ArrayList arrayList2;
            GroupsLiveCoversDto groupsLiveCoversDto;
            ArrayList arrayList3;
            Boolean valueOf2;
            BaseBoolIntDto baseBoolIntDto2;
            GroupsSettingsMarketDto createFromParcel;
            GroupsSettingsMarketDto groupsSettingsMarketDto;
            GroupsSettingsMarketServicesDto createFromParcel2;
            BaseSexDto baseSexDto;
            GroupsGroupFullSectionDto groupsGroupFullSectionDto;
            ArrayList arrayList4;
            GroupsGroupFullSectionDto groupsGroupFullSectionDto2;
            BaseBoolIntDto baseBoolIntDto3;
            ArrayList arrayList5;
            ArrayList arrayList6;
            Integer num;
            Boolean valueOf3;
            Boolean valueOf4;
            GroupsGroupAudioDto createFromParcel3 = GroupsGroupAudioDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String readString = parcel.readString();
            int readInt3 = parcel.readInt();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            GroupsGroupDocsDto createFromParcel4 = GroupsGroupDocsDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto baseBoolIntDto4 = (BaseBoolIntDto) parcel.readParcelable(GroupsGetSettingsResponseDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto5 = (BaseBoolIntDto) parcel.readParcelable(GroupsGetSettingsResponseDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto6 = (BaseBoolIntDto) parcel.readParcelable(GroupsGetSettingsResponseDto.class.getClassLoader());
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            BaseBoolIntDto baseBoolIntDto7 = (BaseBoolIntDto) parcel.readParcelable(GroupsGetSettingsResponseDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto8 = (BaseBoolIntDto) parcel.readParcelable(GroupsGetSettingsResponseDto.class.getClassLoader());
            GroupsGroupPhotosDto createFromParcel5 = GroupsGroupPhotosDto.CREATOR.createFromParcel(parcel);
            String readString4 = parcel.readString();
            GroupsGroupTopicsDto createFromParcel6 = GroupsGroupTopicsDto.CREATOR.createFromParcel(parcel);
            GroupsGroupVideoDto createFromParcel7 = GroupsGroupVideoDto.CREATOR.createFromParcel(parcel);
            GroupsGroupWallDto createFromParcel8 = GroupsGroupWallDto.CREATOR.createFromParcel(parcel);
            GroupsGroupWikiDto createFromParcel9 = GroupsGroupWikiDto.CREATOR.createFromParcel(parcel);
            GroupsGroupAccessDto createFromParcel10 = parcel.readInt() == 0 ? null : GroupsGroupAccessDto.CREATOR.createFromParcel(parcel);
            GroupsActionButtonDto groupsActionButtonDto = (GroupsActionButtonDto) parcel.readParcelable(GroupsGetSettingsResponseDto.class.getClassLoader());
            String readString5 = parcel.readString();
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            GroupsGroupCallsToCommunityPrivacyDto createFromParcel11 = parcel.readInt() == 0 ? null : GroupsGroupCallsToCommunityPrivacyDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto baseBoolIntDto9 = (BaseBoolIntDto) parcel.readParcelable(GroupsGetSettingsResponseDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto10 = (BaseBoolIntDto) parcel.readParcelable(GroupsGetSettingsResponseDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                baseBoolIntDto = baseBoolIntDto10;
                groupsGroupAudioDto = createFromParcel3;
                i = readInt;
                arrayList = null;
            } else {
                baseBoolIntDto = baseBoolIntDto10;
                int readInt4 = parcel.readInt();
                groupsGroupAudioDto = createFromParcel3;
                arrayList = new ArrayList(readInt4);
                i = readInt;
                int i2 = 0;
                while (i2 != readInt4) {
                    i2 = bo.b(GroupsGetSettingsResponseDto.class, parcel, arrayList, i2, 1);
                    readInt4 = readInt4;
                }
            }
            GroupsLiveCoversDto groupsLiveCoversDto2 = (GroupsLiveCoversDto) parcel.readParcelable(GroupsGetSettingsResponseDto.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int readInt5 = parcel.readInt();
                cls = GroupsGetSettingsResponseDto.class;
                arrayList2 = new ArrayList(readInt5);
                groupsLiveCoversDto = groupsLiveCoversDto2;
                int i3 = 0;
                while (true) {
                    arrayList3 = arrayList;
                    if (i3 == readInt5) {
                        break;
                    }
                    i3 = en.a(GroupsSectionsListItemDto.CREATOR, parcel, arrayList2, i3, 1);
                    arrayList = arrayList3;
                    readInt5 = readInt5;
                }
            } else {
                cls = GroupsGetSettingsResponseDto.class;
                groupsLiveCoversDto = groupsLiveCoversDto2;
                arrayList2 = null;
                arrayList3 = arrayList;
            }
            GroupsGroupFullSectionDto groupsGroupFullSectionDto3 = (GroupsGroupFullSectionDto) parcel.readParcelable(cls.getClassLoader());
            GroupsGroupFullSectionDto groupsGroupFullSectionDto4 = (GroupsGroupFullSectionDto) parcel.readParcelable(cls.getClassLoader());
            GroupsGroupAgeLimitsDto createFromParcel12 = parcel.readInt() == 0 ? null : GroupsGroupAgeLimitsDto.CREATOR.createFromParcel(parcel);
            ArrayList arrayList7 = arrayList2;
            BaseBoolIntDto baseBoolIntDto11 = (BaseBoolIntDto) parcel.readParcelable(cls.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                baseBoolIntDto2 = baseBoolIntDto11;
                createFromParcel = null;
            } else {
                baseBoolIntDto2 = baseBoolIntDto11;
                createFromParcel = GroupsSettingsMarketDto.CREATOR.createFromParcel(parcel);
            }
            GroupsSettingsMarketDto groupsSettingsMarketDto2 = createFromParcel;
            if (parcel.readInt() == 0) {
                groupsSettingsMarketDto = groupsSettingsMarketDto2;
                createFromParcel2 = null;
            } else {
                groupsSettingsMarketDto = groupsSettingsMarketDto2;
                createFromParcel2 = GroupsSettingsMarketServicesDto.CREATOR.createFromParcel(parcel);
            }
            GroupsSettingsMarketServicesDto groupsSettingsMarketServicesDto = createFromParcel2;
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto baseBoolIntDto12 = (BaseBoolIntDto) parcel.readParcelable(cls.getClassLoader());
            BaseBoolIntDto baseBoolIntDto13 = (BaseBoolIntDto) parcel.readParcelable(cls.getClassLoader());
            BaseBoolIntDto baseBoolIntDto14 = (BaseBoolIntDto) parcel.readParcelable(cls.getClassLoader());
            BaseBoolIntDto baseBoolIntDto15 = (BaseBoolIntDto) parcel.readParcelable(cls.getClassLoader());
            BaseBoolIntDto baseBoolIntDto16 = (BaseBoolIntDto) parcel.readParcelable(cls.getClassLoader());
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto baseBoolIntDto17 = (BaseBoolIntDto) parcel.readParcelable(cls.getClassLoader());
            Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseSexDto baseSexDto2 = (BaseSexDto) parcel.readParcelable(cls.getClassLoader());
            if (parcel.readInt() == 0) {
                baseSexDto = baseSexDto2;
                groupsGroupFullSectionDto = groupsGroupFullSectionDto3;
                groupsGroupFullSectionDto2 = groupsGroupFullSectionDto4;
                arrayList4 = null;
            } else {
                baseSexDto = baseSexDto2;
                int readInt6 = parcel.readInt();
                groupsGroupFullSectionDto = groupsGroupFullSectionDto3;
                arrayList4 = new ArrayList(readInt6);
                groupsGroupFullSectionDto2 = groupsGroupFullSectionDto4;
                int i4 = 0;
                while (i4 != readInt6) {
                    i4 = en.a(GroupsGroupPublicCategoryListDto.CREATOR, parcel, arrayList4, i4, 1);
                    readInt6 = readInt6;
                    createFromParcel12 = createFromParcel12;
                }
            }
            GroupsGroupAgeLimitsDto groupsGroupAgeLimitsDto = createFromParcel12;
            String readString6 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto18 = baseBoolIntDto;
            GroupsSettingsMarketDto groupsSettingsMarketDto3 = groupsSettingsMarketDto;
            Integer num2 = valueOf8;
            Integer num3 = valueOf9;
            BaseSexDto baseSexDto3 = baseSexDto;
            String readString7 = parcel.readString();
            Integer valueOf11 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i5 = i;
            GroupsGroupFullSectionDto groupsGroupFullSectionDto5 = groupsGroupFullSectionDto2;
            String readString8 = parcel.readString();
            Integer valueOf12 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf13 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf14 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                baseBoolIntDto3 = baseBoolIntDto17;
                arrayList5 = arrayList4;
                num = valueOf11;
                arrayList6 = null;
            } else {
                baseBoolIntDto3 = baseBoolIntDto17;
                int readInt7 = parcel.readInt();
                arrayList5 = arrayList4;
                arrayList6 = new ArrayList(readInt7);
                num = valueOf11;
                int i6 = 0;
                while (i6 != readInt7) {
                    i6 = en.a(GroupsSubjectItemDto.CREATOR, parcel, arrayList6, i6, 1);
                    readInt7 = readInt7;
                    i5 = i5;
                }
            }
            int i7 = i5;
            GroupsGroupSuggestedPrivacyDto createFromParcel13 = parcel.readInt() == 0 ? null : GroupsGroupSuggestedPrivacyDto.CREATOR.createFromParcel(parcel);
            GroupsSettingsTwitterDto createFromParcel14 = parcel.readInt() == 0 ? null : GroupsSettingsTwitterDto.CREATOR.createFromParcel(parcel);
            GroupsLiveCoversDto groupsLiveCoversDto3 = groupsLiveCoversDto;
            BaseBoolIntDto baseBoolIntDto19 = baseBoolIntDto2;
            Integer num4 = valueOf6;
            Integer num5 = valueOf10;
            ArrayList arrayList8 = arrayList5;
            String readString9 = parcel.readString();
            ArrayList arrayList9 = arrayList3;
            Boolean bool = valueOf2;
            Integer num6 = valueOf7;
            BaseBoolIntDto baseBoolIntDto20 = baseBoolIntDto3;
            GroupsGroupAudioDto groupsGroupAudioDto2 = groupsGroupAudioDto;
            GroupsGroupFullSectionDto groupsGroupFullSectionDto6 = groupsGroupFullSectionDto;
            Integer num7 = num;
            String readString10 = parcel.readString();
            boolean z = false;
            String readString11 = parcel.readString();
            GroupsSettingsYoulaDto createFromParcel15 = parcel.readInt() == 0 ? null : GroupsSettingsYoulaDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto baseBoolIntDto21 = (BaseBoolIntDto) parcel.readParcelable(cls.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                valueOf4 = Boolean.valueOf(z);
            }
            return new GroupsGetSettingsResponseDto(groupsGroupAudioDto2, i7, readInt2, readString, readInt3, readString2, readString3, createFromParcel4, baseBoolIntDto4, baseBoolIntDto5, baseBoolIntDto6, createStringArrayList, baseBoolIntDto7, baseBoolIntDto8, createFromParcel5, readString4, createFromParcel6, createFromParcel7, createFromParcel8, createFromParcel9, createFromParcel10, groupsActionButtonDto, readString5, valueOf5, valueOf, createFromParcel11, baseBoolIntDto9, baseBoolIntDto18, arrayList9, groupsLiveCoversDto3, arrayList7, groupsGroupFullSectionDto6, groupsGroupFullSectionDto5, groupsGroupAgeLimitsDto, baseBoolIntDto19, bool, groupsSettingsMarketDto3, groupsSettingsMarketServicesDto, num4, baseBoolIntDto12, baseBoolIntDto13, baseBoolIntDto14, baseBoolIntDto15, baseBoolIntDto16, num6, num2, baseBoolIntDto20, num3, num5, baseSexDto3, arrayList8, readString6, readString7, num7, readString8, valueOf12, valueOf13, valueOf14, arrayList6, createFromParcel13, createFromParcel14, readString9, readString10, readString11, createFromParcel15, baseBoolIntDto21, valueOf3, valueOf4);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGetSettingsResponseDto[] newArray(int i) {
            return new GroupsGetSettingsResponseDto[i];
        }
    }

    public GroupsGetSettingsResponseDto(GroupsGroupAudioDto groupsGroupAudioDto, int i, int i2, String str, int i3, String str2, String str3, GroupsGroupDocsDto groupsGroupDocsDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, List<String> list, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, GroupsGroupPhotosDto groupsGroupPhotosDto, String str4, GroupsGroupTopicsDto groupsGroupTopicsDto, GroupsGroupVideoDto groupsGroupVideoDto, GroupsGroupWallDto groupsGroupWallDto, GroupsGroupWikiDto groupsGroupWikiDto, GroupsGroupAccessDto groupsGroupAccessDto, GroupsActionButtonDto groupsActionButtonDto, String str5, Integer num, Boolean bool, GroupsGroupCallsToCommunityPrivacyDto groupsGroupCallsToCommunityPrivacyDto, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, List<GroupsLinksItemDto> list2, GroupsLiveCoversDto groupsLiveCoversDto, List<GroupsSectionsListItemDto> list3, GroupsGroupFullSectionDto groupsGroupFullSectionDto, GroupsGroupFullSectionDto groupsGroupFullSectionDto2, GroupsGroupAgeLimitsDto groupsGroupAgeLimitsDto, BaseBoolIntDto baseBoolIntDto8, Boolean bool2, GroupsSettingsMarketDto groupsSettingsMarketDto, GroupsSettingsMarketServicesDto groupsSettingsMarketServicesDto, Integer num2, BaseBoolIntDto baseBoolIntDto9, BaseBoolIntDto baseBoolIntDto10, BaseBoolIntDto baseBoolIntDto11, BaseBoolIntDto baseBoolIntDto12, BaseBoolIntDto baseBoolIntDto13, Integer num3, Integer num4, BaseBoolIntDto baseBoolIntDto14, Integer num5, Integer num6, BaseSexDto baseSexDto, List<GroupsGroupPublicCategoryListDto> list4, String str6, String str7, Integer num7, String str8, Integer num8, Integer num9, Integer num10, List<GroupsSubjectItemDto> list5, GroupsGroupSuggestedPrivacyDto groupsGroupSuggestedPrivacyDto, GroupsSettingsTwitterDto groupsSettingsTwitterDto, String str9, String str10, String str11, GroupsSettingsYoulaDto groupsSettingsYoulaDto, BaseBoolIntDto baseBoolIntDto15, Boolean bool3, Boolean bool4) {
        this.audio = groupsGroupAudioDto;
        this.articles = i;
        this.cityId = i2;
        this.cityName = str;
        this.countryId = i3;
        this.countryName = str2;
        this.description = str3;
        this.docs = groupsGroupDocsDto;
        this.messages = baseBoolIntDto;
        this.obsceneFilter = baseBoolIntDto2;
        this.obsceneStopwords = baseBoolIntDto3;
        this.obsceneWords = list;
        this.toxicFilter = baseBoolIntDto4;
        this.disableRepliesFromGroups = baseBoolIntDto5;
        this.photos = groupsGroupPhotosDto;
        this.title = str4;
        this.topics = groupsGroupTopicsDto;
        this.video = groupsGroupVideoDto;
        this.wall = groupsGroupWallDto;
        this.wiki = groupsGroupWikiDto;
        this.access = groupsGroupAccessDto;
        this.actionButton = groupsActionButtonDto;
        this.address = str5;
        this.recognizePhoto = num;
        this.callsToCommunity = bool;
        this.callsToCommunityPrivacy = groupsGroupCallsToCommunityPrivacyDto;
        this.contacts = baseBoolIntDto6;
        this.links = baseBoolIntDto7;
        this.linksList = list2;
        this.liveCovers = groupsLiveCoversDto;
        this.sectionsList = list3;
        this.mainSection = groupsGroupFullSectionDto;
        this.secondarySection = groupsGroupFullSectionDto2;
        this.ageLimits = groupsGroupAgeLimitsDto;
        this.events = baseBoolIntDto8;
        this.addresses = bool2;
        this.market = groupsSettingsMarketDto;
        this.marketServices = groupsSettingsMarketServicesDto;
        this.narratives = num2;
        this.badges = baseBoolIntDto9;
        this.botsCapabilities = baseBoolIntDto10;
        this.botsStartButton = baseBoolIntDto11;
        this.botsAddToChat = baseBoolIntDto12;
        this.botOnlineBookingEnabled = baseBoolIntDto13;
        this.clips = num3;
        this.rooms = num4;
        this.textlives = baseBoolIntDto14;
        this.eventGroupId = num5;
        this.publicCategory = num6;
        this.publicCategoryGender = baseSexDto;
        this.publicCategoryList = list4;
        this.publicDate = str6;
        this.publicDateLabel = str7;
        this.publicSubcategory = num7;
        this.rss = str8;
        this.startDate = num8;
        this.finishDate = num9;
        this.subject = num10;
        this.subjectList = list5;
        this.suggestedPrivacy = groupsGroupSuggestedPrivacyDto;
        this.twitter = groupsSettingsTwitterDto;
        this.website = str9;
        this.phone = str10;
        this.email = str11;
        this.youla = groupsSettingsYoulaDto;
        this.enableReplies = baseBoolIntDto15;
        this.isSuggestedPostEnabled = bool3;
        this.coOwnershipDisabled = bool4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetSettingsResponseDto)) {
            return false;
        }
        GroupsGetSettingsResponseDto groupsGetSettingsResponseDto = (GroupsGetSettingsResponseDto) obj;
        return this.audio == groupsGetSettingsResponseDto.audio && this.articles == groupsGetSettingsResponseDto.articles && this.cityId == groupsGetSettingsResponseDto.cityId && epx.f(this.cityName, groupsGetSettingsResponseDto.cityName) && this.countryId == groupsGetSettingsResponseDto.countryId && epx.f(this.countryName, groupsGetSettingsResponseDto.countryName) && epx.f(this.description, groupsGetSettingsResponseDto.description) && this.docs == groupsGetSettingsResponseDto.docs && this.messages == groupsGetSettingsResponseDto.messages && this.obsceneFilter == groupsGetSettingsResponseDto.obsceneFilter && this.obsceneStopwords == groupsGetSettingsResponseDto.obsceneStopwords && epx.f(this.obsceneWords, groupsGetSettingsResponseDto.obsceneWords) && this.toxicFilter == groupsGetSettingsResponseDto.toxicFilter && this.disableRepliesFromGroups == groupsGetSettingsResponseDto.disableRepliesFromGroups && this.photos == groupsGetSettingsResponseDto.photos && epx.f(this.title, groupsGetSettingsResponseDto.title) && this.topics == groupsGetSettingsResponseDto.topics && this.video == groupsGetSettingsResponseDto.video && this.wall == groupsGetSettingsResponseDto.wall && this.wiki == groupsGetSettingsResponseDto.wiki && this.access == groupsGetSettingsResponseDto.access && epx.f(this.actionButton, groupsGetSettingsResponseDto.actionButton) && epx.f(this.address, groupsGetSettingsResponseDto.address) && epx.f(this.recognizePhoto, groupsGetSettingsResponseDto.recognizePhoto) && epx.f(this.callsToCommunity, groupsGetSettingsResponseDto.callsToCommunity) && this.callsToCommunityPrivacy == groupsGetSettingsResponseDto.callsToCommunityPrivacy && this.contacts == groupsGetSettingsResponseDto.contacts && this.links == groupsGetSettingsResponseDto.links && epx.f(this.linksList, groupsGetSettingsResponseDto.linksList) && epx.f(this.liveCovers, groupsGetSettingsResponseDto.liveCovers) && epx.f(this.sectionsList, groupsGetSettingsResponseDto.sectionsList) && this.mainSection == groupsGetSettingsResponseDto.mainSection && this.secondarySection == groupsGetSettingsResponseDto.secondarySection && this.ageLimits == groupsGetSettingsResponseDto.ageLimits && this.events == groupsGetSettingsResponseDto.events && epx.f(this.addresses, groupsGetSettingsResponseDto.addresses) && epx.f(this.market, groupsGetSettingsResponseDto.market) && epx.f(this.marketServices, groupsGetSettingsResponseDto.marketServices) && epx.f(this.narratives, groupsGetSettingsResponseDto.narratives) && this.badges == groupsGetSettingsResponseDto.badges && this.botsCapabilities == groupsGetSettingsResponseDto.botsCapabilities && this.botsStartButton == groupsGetSettingsResponseDto.botsStartButton && this.botsAddToChat == groupsGetSettingsResponseDto.botsAddToChat && this.botOnlineBookingEnabled == groupsGetSettingsResponseDto.botOnlineBookingEnabled && epx.f(this.clips, groupsGetSettingsResponseDto.clips) && epx.f(this.rooms, groupsGetSettingsResponseDto.rooms) && this.textlives == groupsGetSettingsResponseDto.textlives && epx.f(this.eventGroupId, groupsGetSettingsResponseDto.eventGroupId) && epx.f(this.publicCategory, groupsGetSettingsResponseDto.publicCategory) && this.publicCategoryGender == groupsGetSettingsResponseDto.publicCategoryGender && epx.f(this.publicCategoryList, groupsGetSettingsResponseDto.publicCategoryList) && epx.f(this.publicDate, groupsGetSettingsResponseDto.publicDate) && epx.f(this.publicDateLabel, groupsGetSettingsResponseDto.publicDateLabel) && epx.f(this.publicSubcategory, groupsGetSettingsResponseDto.publicSubcategory) && epx.f(this.rss, groupsGetSettingsResponseDto.rss) && epx.f(this.startDate, groupsGetSettingsResponseDto.startDate) && epx.f(this.finishDate, groupsGetSettingsResponseDto.finishDate) && epx.f(this.subject, groupsGetSettingsResponseDto.subject) && epx.f(this.subjectList, groupsGetSettingsResponseDto.subjectList) && this.suggestedPrivacy == groupsGetSettingsResponseDto.suggestedPrivacy && epx.f(this.twitter, groupsGetSettingsResponseDto.twitter) && epx.f(this.website, groupsGetSettingsResponseDto.website) && epx.f(this.phone, groupsGetSettingsResponseDto.phone) && epx.f(this.email, groupsGetSettingsResponseDto.email) && epx.f(this.youla, groupsGetSettingsResponseDto.youla) && this.enableReplies == groupsGetSettingsResponseDto.enableReplies && epx.f(this.isSuggestedPostEnabled, groupsGetSettingsResponseDto.isSuggestedPostEnabled) && epx.f(this.coOwnershipDisabled, groupsGetSettingsResponseDto.coOwnershipDisabled);
    }

    public final int hashCode() {
        int hashCode = (this.wiki.hashCode() + ((this.wall.hashCode() + ((this.video.hashCode() + ((this.topics.hashCode() + urd0.a((this.photos.hashCode() + wp.b(this.disableRepliesFromGroups, wp.b(this.toxicFilter, fw3.a(wp.b(this.obsceneStopwords, wp.b(this.obsceneFilter, wp.b(this.messages, (this.docs.hashCode() + urd0.a(urd0.a(shy.a(this.countryId, urd0.a(shy.a(this.cityId, shy.a(this.articles, this.audio.hashCode() * 31, 31), 31), 31, this.cityName), 31), 31, this.countryName), 31, this.description)) * 31, 31), 31), 31), 31, this.obsceneWords), 31), 31)) * 31, 31, this.title)) * 31)) * 31)) * 31)) * 31;
        GroupsGroupAccessDto groupsGroupAccessDto = this.access;
        int hashCode2 = (hashCode + (groupsGroupAccessDto == null ? 0 : groupsGroupAccessDto.hashCode())) * 31;
        GroupsActionButtonDto groupsActionButtonDto = this.actionButton;
        int hashCode3 = (hashCode2 + (groupsActionButtonDto == null ? 0 : groupsActionButtonDto.hashCode())) * 31;
        String str = this.address;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.recognizePhoto;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.callsToCommunity;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        GroupsGroupCallsToCommunityPrivacyDto groupsGroupCallsToCommunityPrivacyDto = this.callsToCommunityPrivacy;
        int hashCode7 = (hashCode6 + (groupsGroupCallsToCommunityPrivacyDto == null ? 0 : groupsGroupCallsToCommunityPrivacyDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.contacts;
        int hashCode8 = (hashCode7 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.links;
        int hashCode9 = (hashCode8 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        List<GroupsLinksItemDto> list = this.linksList;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        GroupsLiveCoversDto groupsLiveCoversDto = this.liveCovers;
        int hashCode11 = (hashCode10 + (groupsLiveCoversDto == null ? 0 : groupsLiveCoversDto.hashCode())) * 31;
        List<GroupsSectionsListItemDto> list2 = this.sectionsList;
        int hashCode12 = (hashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto = this.mainSection;
        int hashCode13 = (hashCode12 + (groupsGroupFullSectionDto == null ? 0 : groupsGroupFullSectionDto.hashCode())) * 31;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto2 = this.secondarySection;
        int hashCode14 = (hashCode13 + (groupsGroupFullSectionDto2 == null ? 0 : groupsGroupFullSectionDto2.hashCode())) * 31;
        GroupsGroupAgeLimitsDto groupsGroupAgeLimitsDto = this.ageLimits;
        int hashCode15 = (hashCode14 + (groupsGroupAgeLimitsDto == null ? 0 : groupsGroupAgeLimitsDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.events;
        int hashCode16 = (hashCode15 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        Boolean bool2 = this.addresses;
        int hashCode17 = (hashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        GroupsSettingsMarketDto groupsSettingsMarketDto = this.market;
        int hashCode18 = (hashCode17 + (groupsSettingsMarketDto == null ? 0 : groupsSettingsMarketDto.hashCode())) * 31;
        GroupsSettingsMarketServicesDto groupsSettingsMarketServicesDto = this.marketServices;
        int hashCode19 = (hashCode18 + (groupsSettingsMarketServicesDto == null ? 0 : groupsSettingsMarketServicesDto.hashCode())) * 31;
        Integer num2 = this.narratives;
        int hashCode20 = (hashCode19 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.badges;
        int hashCode21 = (hashCode20 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto5 = this.botsCapabilities;
        int hashCode22 = (hashCode21 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto6 = this.botsStartButton;
        int hashCode23 = (hashCode22 + (baseBoolIntDto6 == null ? 0 : baseBoolIntDto6.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto7 = this.botsAddToChat;
        int hashCode24 = (hashCode23 + (baseBoolIntDto7 == null ? 0 : baseBoolIntDto7.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto8 = this.botOnlineBookingEnabled;
        int hashCode25 = (hashCode24 + (baseBoolIntDto8 == null ? 0 : baseBoolIntDto8.hashCode())) * 31;
        Integer num3 = this.clips;
        int hashCode26 = (hashCode25 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.rooms;
        int hashCode27 = (hashCode26 + (num4 == null ? 0 : num4.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto9 = this.textlives;
        int hashCode28 = (hashCode27 + (baseBoolIntDto9 == null ? 0 : baseBoolIntDto9.hashCode())) * 31;
        Integer num5 = this.eventGroupId;
        int hashCode29 = (hashCode28 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.publicCategory;
        int hashCode30 = (hashCode29 + (num6 == null ? 0 : num6.hashCode())) * 31;
        BaseSexDto baseSexDto = this.publicCategoryGender;
        int hashCode31 = (hashCode30 + (baseSexDto == null ? 0 : baseSexDto.hashCode())) * 31;
        List<GroupsGroupPublicCategoryListDto> list3 = this.publicCategoryList;
        int hashCode32 = (hashCode31 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str2 = this.publicDate;
        int hashCode33 = (hashCode32 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.publicDateLabel;
        int hashCode34 = (hashCode33 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num7 = this.publicSubcategory;
        int hashCode35 = (hashCode34 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str4 = this.rss;
        int hashCode36 = (hashCode35 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num8 = this.startDate;
        int hashCode37 = (hashCode36 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.finishDate;
        int hashCode38 = (hashCode37 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.subject;
        int hashCode39 = (hashCode38 + (num10 == null ? 0 : num10.hashCode())) * 31;
        List<GroupsSubjectItemDto> list4 = this.subjectList;
        int hashCode40 = (hashCode39 + (list4 == null ? 0 : list4.hashCode())) * 31;
        GroupsGroupSuggestedPrivacyDto groupsGroupSuggestedPrivacyDto = this.suggestedPrivacy;
        int hashCode41 = (hashCode40 + (groupsGroupSuggestedPrivacyDto == null ? 0 : groupsGroupSuggestedPrivacyDto.hashCode())) * 31;
        GroupsSettingsTwitterDto groupsSettingsTwitterDto = this.twitter;
        int hashCode42 = (hashCode41 + (groupsSettingsTwitterDto == null ? 0 : groupsSettingsTwitterDto.hashCode())) * 31;
        String str5 = this.website;
        int hashCode43 = (hashCode42 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.phone;
        int hashCode44 = (hashCode43 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.email;
        int hashCode45 = (hashCode44 + (str7 == null ? 0 : str7.hashCode())) * 31;
        GroupsSettingsYoulaDto groupsSettingsYoulaDto = this.youla;
        int hashCode46 = (hashCode45 + (groupsSettingsYoulaDto == null ? 0 : groupsSettingsYoulaDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto10 = this.enableReplies;
        int hashCode47 = (hashCode46 + (baseBoolIntDto10 == null ? 0 : baseBoolIntDto10.hashCode())) * 31;
        Boolean bool3 = this.isSuggestedPostEnabled;
        int hashCode48 = (hashCode47 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.coOwnershipDisabled;
        return hashCode48 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGetSettingsResponseDto(audio=");
        sb.append(this.audio);
        sb.append(", articles=");
        sb.append(this.articles);
        sb.append(", cityId=");
        sb.append(this.cityId);
        sb.append(", cityName=");
        sb.append(this.cityName);
        sb.append(", countryId=");
        sb.append(this.countryId);
        sb.append(", countryName=");
        sb.append(this.countryName);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", docs=");
        sb.append(this.docs);
        sb.append(", messages=");
        sb.append(this.messages);
        sb.append(", obsceneFilter=");
        sb.append(this.obsceneFilter);
        sb.append(", obsceneStopwords=");
        sb.append(this.obsceneStopwords);
        sb.append(", obsceneWords=");
        sb.append(this.obsceneWords);
        sb.append(", toxicFilter=");
        sb.append(this.toxicFilter);
        sb.append(", disableRepliesFromGroups=");
        sb.append(this.disableRepliesFromGroups);
        sb.append(", photos=");
        sb.append(this.photos);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", topics=");
        sb.append(this.topics);
        sb.append(", video=");
        sb.append(this.video);
        sb.append(", wall=");
        sb.append(this.wall);
        sb.append(", wiki=");
        sb.append(this.wiki);
        sb.append(", access=");
        sb.append(this.access);
        sb.append(", actionButton=");
        sb.append(this.actionButton);
        sb.append(", address=");
        sb.append(this.address);
        sb.append(", recognizePhoto=");
        sb.append(this.recognizePhoto);
        sb.append(", callsToCommunity=");
        sb.append(this.callsToCommunity);
        sb.append(", callsToCommunityPrivacy=");
        sb.append(this.callsToCommunityPrivacy);
        sb.append(", contacts=");
        sb.append(this.contacts);
        sb.append(", links=");
        sb.append(this.links);
        sb.append(", linksList=");
        sb.append(this.linksList);
        sb.append(", liveCovers=");
        sb.append(this.liveCovers);
        sb.append(", sectionsList=");
        sb.append(this.sectionsList);
        sb.append(", mainSection=");
        sb.append(this.mainSection);
        sb.append(", secondarySection=");
        sb.append(this.secondarySection);
        sb.append(", ageLimits=");
        sb.append(this.ageLimits);
        sb.append(", events=");
        sb.append(this.events);
        sb.append(", addresses=");
        sb.append(this.addresses);
        sb.append(", market=");
        sb.append(this.market);
        sb.append(", marketServices=");
        sb.append(this.marketServices);
        sb.append(", narratives=");
        sb.append(this.narratives);
        sb.append(", badges=");
        sb.append(this.badges);
        sb.append(", botsCapabilities=");
        sb.append(this.botsCapabilities);
        sb.append(", botsStartButton=");
        sb.append(this.botsStartButton);
        sb.append(", botsAddToChat=");
        sb.append(this.botsAddToChat);
        sb.append(", botOnlineBookingEnabled=");
        sb.append(this.botOnlineBookingEnabled);
        sb.append(", clips=");
        sb.append(this.clips);
        sb.append(", rooms=");
        sb.append(this.rooms);
        sb.append(", textlives=");
        sb.append(this.textlives);
        sb.append(", eventGroupId=");
        sb.append(this.eventGroupId);
        sb.append(", publicCategory=");
        sb.append(this.publicCategory);
        sb.append(", publicCategoryGender=");
        sb.append(this.publicCategoryGender);
        sb.append(", publicCategoryList=");
        sb.append(this.publicCategoryList);
        sb.append(", publicDate=");
        sb.append(this.publicDate);
        sb.append(", publicDateLabel=");
        sb.append(this.publicDateLabel);
        sb.append(", publicSubcategory=");
        sb.append(this.publicSubcategory);
        sb.append(", rss=");
        sb.append(this.rss);
        sb.append(", startDate=");
        sb.append(this.startDate);
        sb.append(", finishDate=");
        sb.append(this.finishDate);
        sb.append(", subject=");
        sb.append(this.subject);
        sb.append(", subjectList=");
        sb.append(this.subjectList);
        sb.append(", suggestedPrivacy=");
        sb.append(this.suggestedPrivacy);
        sb.append(", twitter=");
        sb.append(this.twitter);
        sb.append(", website=");
        sb.append(this.website);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", email=");
        sb.append(this.email);
        sb.append(", youla=");
        sb.append(this.youla);
        sb.append(", enableReplies=");
        sb.append(this.enableReplies);
        sb.append(", isSuggestedPostEnabled=");
        sb.append(this.isSuggestedPostEnabled);
        sb.append(", coOwnershipDisabled=");
        return tn.a(sb, this.coOwnershipDisabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.audio.writeToParcel(parcel, i);
        parcel.writeInt(this.articles);
        parcel.writeInt(this.cityId);
        parcel.writeString(this.cityName);
        parcel.writeInt(this.countryId);
        parcel.writeString(this.countryName);
        parcel.writeString(this.description);
        this.docs.writeToParcel(parcel, i);
        parcel.writeParcelable(this.messages, i);
        parcel.writeParcelable(this.obsceneFilter, i);
        parcel.writeParcelable(this.obsceneStopwords, i);
        parcel.writeStringList(this.obsceneWords);
        parcel.writeParcelable(this.toxicFilter, i);
        parcel.writeParcelable(this.disableRepliesFromGroups, i);
        this.photos.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        this.topics.writeToParcel(parcel, i);
        this.video.writeToParcel(parcel, i);
        this.wall.writeToParcel(parcel, i);
        this.wiki.writeToParcel(parcel, i);
        GroupsGroupAccessDto groupsGroupAccessDto = this.access;
        if (groupsGroupAccessDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsGroupAccessDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.actionButton, i);
        parcel.writeString(this.address);
        Integer num = this.recognizePhoto;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.callsToCommunity;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        GroupsGroupCallsToCommunityPrivacyDto groupsGroupCallsToCommunityPrivacyDto = this.callsToCommunityPrivacy;
        if (groupsGroupCallsToCommunityPrivacyDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsGroupCallsToCommunityPrivacyDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.contacts, i);
        parcel.writeParcelable(this.links, i);
        List<GroupsLinksItemDto> list = this.linksList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeParcelable(this.liveCovers, i);
        List<GroupsSectionsListItemDto> list2 = this.sectionsList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((GroupsSectionsListItemDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeParcelable(this.mainSection, i);
        parcel.writeParcelable(this.secondarySection, i);
        GroupsGroupAgeLimitsDto groupsGroupAgeLimitsDto = this.ageLimits;
        if (groupsGroupAgeLimitsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsGroupAgeLimitsDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.events, i);
        Boolean bool2 = this.addresses;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        GroupsSettingsMarketDto groupsSettingsMarketDto = this.market;
        if (groupsSettingsMarketDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsSettingsMarketDto.writeToParcel(parcel, i);
        }
        GroupsSettingsMarketServicesDto groupsSettingsMarketServicesDto = this.marketServices;
        if (groupsSettingsMarketServicesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsSettingsMarketServicesDto.writeToParcel(parcel, i);
        }
        Integer num2 = this.narratives;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeParcelable(this.badges, i);
        parcel.writeParcelable(this.botsCapabilities, i);
        parcel.writeParcelable(this.botsStartButton, i);
        parcel.writeParcelable(this.botsAddToChat, i);
        parcel.writeParcelable(this.botOnlineBookingEnabled, i);
        Integer num3 = this.clips;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.rooms;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        parcel.writeParcelable(this.textlives, i);
        Integer num5 = this.eventGroupId;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        Integer num6 = this.publicCategory;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        parcel.writeParcelable(this.publicCategoryGender, i);
        List<GroupsGroupPublicCategoryListDto> list3 = this.publicCategoryList;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((GroupsGroupPublicCategoryListDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.publicDate);
        parcel.writeString(this.publicDateLabel);
        Integer num7 = this.publicSubcategory;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num7);
        }
        parcel.writeString(this.rss);
        Integer num8 = this.startDate;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num8);
        }
        Integer num9 = this.finishDate;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num9);
        }
        Integer num10 = this.subject;
        if (num10 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num10);
        }
        List<GroupsSubjectItemDto> list4 = this.subjectList;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                ((GroupsSubjectItemDto) f4.next()).writeToParcel(parcel, i);
            }
        }
        GroupsGroupSuggestedPrivacyDto groupsGroupSuggestedPrivacyDto = this.suggestedPrivacy;
        if (groupsGroupSuggestedPrivacyDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsGroupSuggestedPrivacyDto.writeToParcel(parcel, i);
        }
        GroupsSettingsTwitterDto groupsSettingsTwitterDto = this.twitter;
        if (groupsSettingsTwitterDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsSettingsTwitterDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.website);
        parcel.writeString(this.phone);
        parcel.writeString(this.email);
        GroupsSettingsYoulaDto groupsSettingsYoulaDto = this.youla;
        if (groupsSettingsYoulaDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsSettingsYoulaDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.enableReplies, i);
        Boolean bool3 = this.isSuggestedPostEnabled;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.coOwnershipDisabled;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
    }

    public /* synthetic */ GroupsGetSettingsResponseDto(GroupsGroupAudioDto groupsGroupAudioDto, int i, int i2, String str, int i3, String str2, String str3, GroupsGroupDocsDto groupsGroupDocsDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, List list, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, GroupsGroupPhotosDto groupsGroupPhotosDto, String str4, GroupsGroupTopicsDto groupsGroupTopicsDto, GroupsGroupVideoDto groupsGroupVideoDto, GroupsGroupWallDto groupsGroupWallDto, GroupsGroupWikiDto groupsGroupWikiDto, GroupsGroupAccessDto groupsGroupAccessDto, GroupsActionButtonDto groupsActionButtonDto, String str5, Integer num, Boolean bool, GroupsGroupCallsToCommunityPrivacyDto groupsGroupCallsToCommunityPrivacyDto, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, List list2, GroupsLiveCoversDto groupsLiveCoversDto, List list3, GroupsGroupFullSectionDto groupsGroupFullSectionDto, GroupsGroupFullSectionDto groupsGroupFullSectionDto2, GroupsGroupAgeLimitsDto groupsGroupAgeLimitsDto, BaseBoolIntDto baseBoolIntDto8, Boolean bool2, GroupsSettingsMarketDto groupsSettingsMarketDto, GroupsSettingsMarketServicesDto groupsSettingsMarketServicesDto, Integer num2, BaseBoolIntDto baseBoolIntDto9, BaseBoolIntDto baseBoolIntDto10, BaseBoolIntDto baseBoolIntDto11, BaseBoolIntDto baseBoolIntDto12, BaseBoolIntDto baseBoolIntDto13, Integer num3, Integer num4, BaseBoolIntDto baseBoolIntDto14, Integer num5, Integer num6, BaseSexDto baseSexDto, List list4, String str6, String str7, Integer num7, String str8, Integer num8, Integer num9, Integer num10, List list5, GroupsGroupSuggestedPrivacyDto groupsGroupSuggestedPrivacyDto, GroupsSettingsTwitterDto groupsSettingsTwitterDto, String str9, String str10, String str11, GroupsSettingsYoulaDto groupsSettingsYoulaDto, BaseBoolIntDto baseBoolIntDto15, Boolean bool3, Boolean bool4, int i4, int i5, int i6, zcl zclVar) {
        this(groupsGroupAudioDto, i, i2, str, i3, str2, str3, groupsGroupDocsDto, baseBoolIntDto, baseBoolIntDto2, baseBoolIntDto3, list, baseBoolIntDto4, baseBoolIntDto5, groupsGroupPhotosDto, str4, groupsGroupTopicsDto, groupsGroupVideoDto, groupsGroupWallDto, groupsGroupWikiDto, (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : groupsGroupAccessDto, (i4 & 2097152) != 0 ? null : groupsActionButtonDto, (i4 & 4194304) != 0 ? null : str5, (i4 & 8388608) != 0 ? null : num, (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : bool, (i4 & 33554432) != 0 ? null : groupsGroupCallsToCommunityPrivacyDto, (i4 & 67108864) != 0 ? null : baseBoolIntDto6, (i4 & 134217728) != 0 ? null : baseBoolIntDto7, (i4 & 268435456) != 0 ? null : list2, (i4 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : groupsLiveCoversDto, (i4 & 1073741824) != 0 ? null : list3, (i4 & Integer.MIN_VALUE) != 0 ? null : groupsGroupFullSectionDto, (i5 & 1) != 0 ? null : groupsGroupFullSectionDto2, (i5 & 2) != 0 ? null : groupsGroupAgeLimitsDto, (i5 & 4) != 0 ? null : baseBoolIntDto8, (i5 & 8) != 0 ? null : bool2, (i5 & 16) != 0 ? null : groupsSettingsMarketDto, (i5 & 32) != 0 ? null : groupsSettingsMarketServicesDto, (i5 & 64) != 0 ? null : num2, (i5 & 128) != 0 ? null : baseBoolIntDto9, (i5 & 256) != 0 ? null : baseBoolIntDto10, (i5 & 512) != 0 ? null : baseBoolIntDto11, (i5 & 1024) != 0 ? null : baseBoolIntDto12, (i5 & 2048) != 0 ? null : baseBoolIntDto13, (i5 & 4096) != 0 ? null : num3, (i5 & 8192) != 0 ? null : num4, (i5 & 16384) != 0 ? null : baseBoolIntDto14, (32768 & i5) != 0 ? null : num5, (65536 & i5) != 0 ? null : num6, (131072 & i5) != 0 ? null : baseSexDto, (262144 & i5) != 0 ? null : list4, (524288 & i5) != 0 ? null : str6, (1048576 & i5) != 0 ? null : str7, (i5 & 2097152) != 0 ? null : num7, (i5 & 4194304) != 0 ? null : str8, (i5 & 8388608) != 0 ? null : num8, (i5 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : num9, (i5 & 33554432) != 0 ? null : num10, (i5 & 67108864) != 0 ? null : list5, (i5 & 134217728) != 0 ? null : groupsGroupSuggestedPrivacyDto, (i5 & 268435456) != 0 ? null : groupsSettingsTwitterDto, (i5 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str9, (i5 & 1073741824) != 0 ? null : str10, (i5 & Integer.MIN_VALUE) != 0 ? null : str11, (i6 & 1) != 0 ? null : groupsSettingsYoulaDto, (i6 & 2) != 0 ? null : baseBoolIntDto15, (i6 & 4) != 0 ? null : bool3, (i6 & 8) != 0 ? null : bool4);
    }
}
