package com.vk.sdk.api.groups.dto;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.audio.dto.AudioAudioDto;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import com.vk.sdk.api.base.dto.BaseCountryDto;
import com.vk.sdk.api.base.dto.BaseCropPhotoDto;
import com.vk.sdk.api.base.dto.BaseObjectDto;
import com.vk.sdk.api.base.dto.BaseOwnerCoverDto;
import com.vk.sdk.api.video.dto.VideoLiveInfoDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.kr;
import xsna.l4;
import xsna.mq;
import xsna.n6j;
import xsna.pmi0;
import xsna.sq;
import xsna.to;
import xsna.tq;
import xsna.xq;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GroupsGroupFullDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGroupFullDto {

    @pmi0("activity")
    private final String activity;

    @pmi0("addresses")
    private final GroupsAddressesInfoDto addresses;

    @pmi0("admin_level")
    private final GroupsGroupAdminLevelDto adminLevel;

    @pmi0("age_limits")
    private final GroupsGroupFullAgeLimitsDto ageLimits;

    @pmi0("ban_info")
    private final GroupsGroupBanInfoDto banInfo;

    @pmi0("can_call_to_community")
    private final Boolean canCallToCommunity;

    @pmi0("can_create_topic")
    private final BaseBoolIntDto canCreateTopic;

    @pmi0("can_message")
    private final BaseBoolIntDto canMessage;

    @pmi0("can_post")
    private final BaseBoolIntDto canPost;

    @pmi0("can_see_all_posts")
    private final BaseBoolIntDto canSeeAllPosts;

    @pmi0("can_send_notify")
    private final BaseBoolIntDto canSendNotify;

    @pmi0("can_subscribe_podcasts")
    private final Boolean canSubscribePodcasts;

    @pmi0("can_subscribe_posts")
    private final Boolean canSubscribePosts;

    @pmi0("can_suggest")
    private final BaseBoolIntDto canSuggest;

    @pmi0("can_upload_doc")
    private final BaseBoolIntDto canUploadDoc;

    @pmi0("can_upload_story")
    private final BaseBoolIntDto canUploadStory;

    @pmi0("can_upload_video")
    private final BaseBoolIntDto canUploadVideo;

    @pmi0("city")
    private final BaseObjectDto city;

    @pmi0("clips_count")
    private final Integer clipsCount;

    @pmi0("contacts")
    private final List<GroupsContactsItemDto> contacts;

    @pmi0("counters")
    private final GroupsCountersGroupDto counters;

    @pmi0("country")
    private final BaseCountryDto country;

    @pmi0("cover")
    private final BaseOwnerCoverDto cover;

    @pmi0("crop_photo")
    private final BaseCropPhotoDto cropPhoto;

    @pmi0("deactivated")
    private final String deactivated;

    @pmi0("description")
    private final String description;

    @pmi0("est_date")
    private final String estDate;

    @pmi0("finish_date")
    private final Integer finishDate;

    @pmi0("fixed_post")
    private final Integer fixedPost;

    @pmi0("has_group_channel")
    private final Boolean hasGroupChannel;

    @pmi0("has_market_app")
    private final Boolean hasMarketApp;

    @pmi0("has_photo")
    private final BaseBoolIntDto hasPhoto;

    @pmi0("has_unseen_stories")
    private final Boolean hasUnseenStories;

    @pmi0("id")
    private final UserId id;

    @pmi0("invited_by")
    private final Integer invitedBy;

    @pmi0("is_admin")
    private final BaseBoolIntDto isAdmin;

    @pmi0("is_adult")
    private final BaseBoolIntDto isAdult;

    @pmi0("is_advertiser")
    private final BaseBoolIntDto isAdvertiser;

    @pmi0("is_closed")
    private final GroupsGroupIsClosedDto isClosed;

    @pmi0("is_favorite")
    private final BaseBoolIntDto isFavorite;

    @pmi0("is_hidden_from_feed")
    private final BaseBoolIntDto isHiddenFromFeed;

    @pmi0("is_member")
    private final BaseBoolIntDto isMember;

    @pmi0("is_messages_blocked")
    private final BaseBoolIntDto isMessagesBlocked;

    @pmi0("is_subscribed")
    private final BaseBoolIntDto isSubscribed;

    @pmi0("is_subscribed_podcasts")
    private final Boolean isSubscribedPodcasts;

    @pmi0("is_video_live_notifications_blocked")
    private final BaseBoolIntDto isVideoLiveNotificationsBlocked;

    @pmi0("links")
    private final List<GroupsLinksItemDto> links;

    @pmi0("live_covers")
    private final GroupsLiveCoversDto liveCovers;

    @pmi0("main_album_id")
    private final Integer mainAlbumId;

    @pmi0("main_section")
    private final GroupsGroupFullSectionDto mainSection;

    @pmi0("market")
    private final GroupsMarketInfoDto market;

    @pmi0("member_status")
    private final GroupsGroupFullMemberStatusDto memberStatus;

    @pmi0("members_count")
    private final Integer membersCount;

    @pmi0("members_count_text")
    private final String membersCountText;

    @pmi0("name")
    private final String name;

    @pmi0("online_status")
    private final GroupsOnlineStatusDto onlineStatus;

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("photo_200_orig")
    private final String photo200Orig;

    @pmi0("photo_400")
    private final String photo400;

    @pmi0("photo_400_orig")
    private final String photo400Orig;

    @pmi0("photo_50")
    private final String photo50;

    @pmi0("photo_max")
    private final String photoMax;

    @pmi0("photo_max_orig")
    private final String photoMaxOrig;

    @pmi0("photo_max_size")
    private final GroupsPhotoSizeDto photoMaxSize;

    @pmi0("public_date_label")
    private final String publicDateLabel;

    @pmi0("requests_count")
    private final Integer requestsCount;

    @pmi0("screen_name")
    private final String screenName;

    @pmi0("secondary_section")
    private final GroupsGroupFullSectionDto secondarySection;

    @pmi0("site")
    private final String site;

    @pmi0("start_date")
    private final Integer startDate;

    @pmi0("status")
    private final String status;

    @pmi0("status_audio")
    private final AudioAudioDto statusAudio;

    @pmi0("stories_archive_count")
    private final Integer storiesArchiveCount;

    @pmi0("trending")
    private final BaseBoolIntDto trending;

    @pmi0("type")
    private final GroupsGroupTypeDto type;

    @pmi0("using_vkpay_market_app")
    private final Boolean usingVkpayMarketApp;

    @pmi0("verified")
    private final BaseBoolIntDto verified;

    @pmi0("video_live")
    private final VideoLiveInfoDto videoLive;

    @pmi0("video_live_count")
    private final Integer videoLiveCount;

    @pmi0("video_live_level")
    private final Integer videoLiveLevel;

    @pmi0("wall")
    private final WallDto wall;

    @pmi0("wiki_page")
    private final String wikiPage;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsGroupFullDto.kt */
    public static final class WallDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ WallDto[] $VALUES;

        @pmi0("0")
        public static final WallDto DISABLED;

        @pmi0("2")
        public static final WallDto LIMITED;

        @pmi0("1")
        public static final WallDto OPEN;

        @pmi0("3")
        public static final WallDto RESTRICTED;
        private final int value;

        static {
            WallDto wallDto = new WallDto("DISABLED", 0, 0);
            DISABLED = wallDto;
            WallDto wallDto2 = new WallDto("OPEN", 1, 1);
            OPEN = wallDto2;
            WallDto wallDto3 = new WallDto("LIMITED", 2, 2);
            LIMITED = wallDto3;
            WallDto wallDto4 = new WallDto("RESTRICTED", 3, 3);
            RESTRICTED = wallDto4;
            WallDto[] wallDtoArr = {wallDto, wallDto2, wallDto3, wallDto4};
            $VALUES = wallDtoArr;
            $ENTRIES = new asp(wallDtoArr);
        }

        private WallDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static WallDto valueOf(String str) {
            return (WallDto) Enum.valueOf(WallDto.class, str);
        }

        public static WallDto[] values() {
            return (WallDto[]) $VALUES.clone();
        }
    }

    public GroupsGroupFullDto(UserId userId, GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, BaseObjectDto baseObjectDto, BaseCountryDto baseCountryDto, String str, String str2, Integer num, String str3, Integer num2, Integer num3, Integer num4, Integer num5, GroupsCountersGroupDto groupsCountersGroupDto, BaseOwnerCoverDto baseOwnerCoverDto, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, Boolean bool, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, BaseBoolIntDto baseBoolIntDto10, BaseBoolIntDto baseBoolIntDto11, String str4, Integer num6, BaseBoolIntDto baseBoolIntDto12, BaseCropPhotoDto baseCropPhotoDto, String str5, AudioAudioDto audioAudioDto, Integer num7, List<GroupsLinksItemDto> list, List<GroupsContactsItemDto> list2, WallDto wallDto, String str6, GroupsGroupFullSectionDto groupsGroupFullSectionDto, GroupsGroupFullSectionDto groupsGroupFullSectionDto2, BaseBoolIntDto baseBoolIntDto13, BaseBoolIntDto baseBoolIntDto14, BaseBoolIntDto baseBoolIntDto15, BaseBoolIntDto baseBoolIntDto16, GroupsOnlineStatusDto groupsOnlineStatusDto, Integer num8, GroupsGroupFullAgeLimitsDto groupsGroupFullAgeLimitsDto, GroupsGroupBanInfoDto groupsGroupBanInfoDto, Boolean bool2, GroupsAddressesInfoDto groupsAddressesInfoDto, Boolean bool3, Boolean bool4, Boolean bool5, GroupsLiveCoversDto groupsLiveCoversDto, Integer num9, Boolean bool6, String str7, String str8, GroupsGroupIsClosedDto groupsGroupIsClosedDto, GroupsGroupTypeDto groupsGroupTypeDto, BaseBoolIntDto baseBoolIntDto17, GroupsGroupAdminLevelDto groupsGroupAdminLevelDto, BaseBoolIntDto baseBoolIntDto18, BaseBoolIntDto baseBoolIntDto19, Integer num10, Integer num11, BaseBoolIntDto baseBoolIntDto20, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, GroupsPhotoSizeDto groupsPhotoSizeDto, BaseBoolIntDto baseBoolIntDto21, VideoLiveInfoDto videoLiveInfoDto, GroupsMarketInfoDto groupsMarketInfoDto, Boolean bool7, Boolean bool8) {
        this.id = userId;
        this.memberStatus = groupsGroupFullMemberStatusDto;
        this.isAdult = baseBoolIntDto;
        this.isHiddenFromFeed = baseBoolIntDto2;
        this.isFavorite = baseBoolIntDto3;
        this.isSubscribed = baseBoolIntDto4;
        this.city = baseObjectDto;
        this.country = baseCountryDto;
        this.description = str;
        this.wikiPage = str2;
        this.membersCount = num;
        this.membersCountText = str3;
        this.requestsCount = num2;
        this.videoLiveLevel = num3;
        this.videoLiveCount = num4;
        this.clipsCount = num5;
        this.counters = groupsCountersGroupDto;
        this.cover = baseOwnerCoverDto;
        this.canPost = baseBoolIntDto5;
        this.canSuggest = baseBoolIntDto6;
        this.canUploadStory = baseBoolIntDto7;
        this.canCallToCommunity = bool;
        this.canUploadDoc = baseBoolIntDto8;
        this.canUploadVideo = baseBoolIntDto9;
        this.canSeeAllPosts = baseBoolIntDto10;
        this.canCreateTopic = baseBoolIntDto11;
        this.activity = str4;
        this.fixedPost = num6;
        this.hasPhoto = baseBoolIntDto12;
        this.cropPhoto = baseCropPhotoDto;
        this.status = str5;
        this.statusAudio = audioAudioDto;
        this.mainAlbumId = num7;
        this.links = list;
        this.contacts = list2;
        this.wall = wallDto;
        this.site = str6;
        this.mainSection = groupsGroupFullSectionDto;
        this.secondarySection = groupsGroupFullSectionDto2;
        this.trending = baseBoolIntDto13;
        this.canMessage = baseBoolIntDto14;
        this.isMessagesBlocked = baseBoolIntDto15;
        this.canSendNotify = baseBoolIntDto16;
        this.onlineStatus = groupsOnlineStatusDto;
        this.invitedBy = num8;
        this.ageLimits = groupsGroupFullAgeLimitsDto;
        this.banInfo = groupsGroupBanInfoDto;
        this.hasGroupChannel = bool2;
        this.addresses = groupsAddressesInfoDto;
        this.isSubscribedPodcasts = bool3;
        this.canSubscribePodcasts = bool4;
        this.canSubscribePosts = bool5;
        this.liveCovers = groupsLiveCoversDto;
        this.storiesArchiveCount = num9;
        this.hasUnseenStories = bool6;
        this.name = str7;
        this.screenName = str8;
        this.isClosed = groupsGroupIsClosedDto;
        this.type = groupsGroupTypeDto;
        this.isAdmin = baseBoolIntDto17;
        this.adminLevel = groupsGroupAdminLevelDto;
        this.isMember = baseBoolIntDto18;
        this.isAdvertiser = baseBoolIntDto19;
        this.startDate = num10;
        this.finishDate = num11;
        this.verified = baseBoolIntDto20;
        this.deactivated = str9;
        this.photo50 = str10;
        this.photo100 = str11;
        this.photo200 = str12;
        this.photo200Orig = str13;
        this.photo400 = str14;
        this.photo400Orig = str15;
        this.photoMax = str16;
        this.photoMaxOrig = str17;
        this.estDate = str18;
        this.publicDateLabel = str19;
        this.photoMaxSize = groupsPhotoSizeDto;
        this.isVideoLiveNotificationsBlocked = baseBoolIntDto21;
        this.videoLive = videoLiveInfoDto;
        this.market = groupsMarketInfoDto;
        this.hasMarketApp = bool7;
        this.usingVkpayMarketApp = bool8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupFullDto)) {
            return false;
        }
        GroupsGroupFullDto groupsGroupFullDto = (GroupsGroupFullDto) obj;
        return epx.f(this.id, groupsGroupFullDto.id) && this.memberStatus == groupsGroupFullDto.memberStatus && this.isAdult == groupsGroupFullDto.isAdult && this.isHiddenFromFeed == groupsGroupFullDto.isHiddenFromFeed && this.isFavorite == groupsGroupFullDto.isFavorite && this.isSubscribed == groupsGroupFullDto.isSubscribed && epx.f(this.city, groupsGroupFullDto.city) && epx.f(this.country, groupsGroupFullDto.country) && epx.f(this.description, groupsGroupFullDto.description) && epx.f(this.wikiPage, groupsGroupFullDto.wikiPage) && epx.f(this.membersCount, groupsGroupFullDto.membersCount) && epx.f(this.membersCountText, groupsGroupFullDto.membersCountText) && epx.f(this.requestsCount, groupsGroupFullDto.requestsCount) && epx.f(this.videoLiveLevel, groupsGroupFullDto.videoLiveLevel) && epx.f(this.videoLiveCount, groupsGroupFullDto.videoLiveCount) && epx.f(this.clipsCount, groupsGroupFullDto.clipsCount) && epx.f(this.counters, groupsGroupFullDto.counters) && epx.f(this.cover, groupsGroupFullDto.cover) && this.canPost == groupsGroupFullDto.canPost && this.canSuggest == groupsGroupFullDto.canSuggest && this.canUploadStory == groupsGroupFullDto.canUploadStory && epx.f(this.canCallToCommunity, groupsGroupFullDto.canCallToCommunity) && this.canUploadDoc == groupsGroupFullDto.canUploadDoc && this.canUploadVideo == groupsGroupFullDto.canUploadVideo && this.canSeeAllPosts == groupsGroupFullDto.canSeeAllPosts && this.canCreateTopic == groupsGroupFullDto.canCreateTopic && epx.f(this.activity, groupsGroupFullDto.activity) && epx.f(this.fixedPost, groupsGroupFullDto.fixedPost) && this.hasPhoto == groupsGroupFullDto.hasPhoto && epx.f(this.cropPhoto, groupsGroupFullDto.cropPhoto) && epx.f(this.status, groupsGroupFullDto.status) && epx.f(this.statusAudio, groupsGroupFullDto.statusAudio) && epx.f(this.mainAlbumId, groupsGroupFullDto.mainAlbumId) && epx.f(this.links, groupsGroupFullDto.links) && epx.f(this.contacts, groupsGroupFullDto.contacts) && this.wall == groupsGroupFullDto.wall && epx.f(this.site, groupsGroupFullDto.site) && this.mainSection == groupsGroupFullDto.mainSection && this.secondarySection == groupsGroupFullDto.secondarySection && this.trending == groupsGroupFullDto.trending && this.canMessage == groupsGroupFullDto.canMessage && this.isMessagesBlocked == groupsGroupFullDto.isMessagesBlocked && this.canSendNotify == groupsGroupFullDto.canSendNotify && epx.f(this.onlineStatus, groupsGroupFullDto.onlineStatus) && epx.f(this.invitedBy, groupsGroupFullDto.invitedBy) && this.ageLimits == groupsGroupFullDto.ageLimits && epx.f(this.banInfo, groupsGroupFullDto.banInfo) && epx.f(this.hasGroupChannel, groupsGroupFullDto.hasGroupChannel) && epx.f(this.addresses, groupsGroupFullDto.addresses) && epx.f(this.isSubscribedPodcasts, groupsGroupFullDto.isSubscribedPodcasts) && epx.f(this.canSubscribePodcasts, groupsGroupFullDto.canSubscribePodcasts) && epx.f(this.canSubscribePosts, groupsGroupFullDto.canSubscribePosts) && epx.f(this.liveCovers, groupsGroupFullDto.liveCovers) && epx.f(this.storiesArchiveCount, groupsGroupFullDto.storiesArchiveCount) && epx.f(this.hasUnseenStories, groupsGroupFullDto.hasUnseenStories) && epx.f(this.name, groupsGroupFullDto.name) && epx.f(this.screenName, groupsGroupFullDto.screenName) && this.isClosed == groupsGroupFullDto.isClosed && this.type == groupsGroupFullDto.type && this.isAdmin == groupsGroupFullDto.isAdmin && this.adminLevel == groupsGroupFullDto.adminLevel && this.isMember == groupsGroupFullDto.isMember && this.isAdvertiser == groupsGroupFullDto.isAdvertiser && epx.f(this.startDate, groupsGroupFullDto.startDate) && epx.f(this.finishDate, groupsGroupFullDto.finishDate) && this.verified == groupsGroupFullDto.verified && epx.f(this.deactivated, groupsGroupFullDto.deactivated) && epx.f(this.photo50, groupsGroupFullDto.photo50) && epx.f(this.photo100, groupsGroupFullDto.photo100) && epx.f(this.photo200, groupsGroupFullDto.photo200) && epx.f(this.photo200Orig, groupsGroupFullDto.photo200Orig) && epx.f(this.photo400, groupsGroupFullDto.photo400) && epx.f(this.photo400Orig, groupsGroupFullDto.photo400Orig) && epx.f(this.photoMax, groupsGroupFullDto.photoMax) && epx.f(this.photoMaxOrig, groupsGroupFullDto.photoMaxOrig) && epx.f(this.estDate, groupsGroupFullDto.estDate) && epx.f(this.publicDateLabel, groupsGroupFullDto.publicDateLabel) && epx.f(this.photoMaxSize, groupsGroupFullDto.photoMaxSize) && this.isVideoLiveNotificationsBlocked == groupsGroupFullDto.isVideoLiveNotificationsBlocked && epx.f(this.videoLive, groupsGroupFullDto.videoLive) && epx.f(this.market, groupsGroupFullDto.market) && epx.f(this.hasMarketApp, groupsGroupFullDto.hasMarketApp) && epx.f(this.usingVkpayMarketApp, groupsGroupFullDto.usingVkpayMarketApp);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.id.b) * 31;
        GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto = this.memberStatus;
        int hashCode2 = (hashCode + (groupsGroupFullMemberStatusDto == null ? 0 : groupsGroupFullMemberStatusDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.isAdult;
        int hashCode3 = (hashCode2 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.isHiddenFromFeed;
        int hashCode4 = (hashCode3 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.isFavorite;
        int hashCode5 = (hashCode4 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.isSubscribed;
        int hashCode6 = (hashCode5 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        BaseObjectDto baseObjectDto = this.city;
        int hashCode7 = (hashCode6 + (baseObjectDto == null ? 0 : baseObjectDto.hashCode())) * 31;
        BaseCountryDto baseCountryDto = this.country;
        int hashCode8 = (hashCode7 + (baseCountryDto == null ? 0 : baseCountryDto.hashCode())) * 31;
        String str = this.description;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.wikiPage;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.membersCount;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.membersCountText;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.requestsCount;
        int hashCode13 = (hashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.videoLiveLevel;
        int hashCode14 = (hashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.videoLiveCount;
        int hashCode15 = (hashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.clipsCount;
        int hashCode16 = (hashCode15 + (num5 == null ? 0 : num5.hashCode())) * 31;
        GroupsCountersGroupDto groupsCountersGroupDto = this.counters;
        int hashCode17 = (hashCode16 + (groupsCountersGroupDto == null ? 0 : groupsCountersGroupDto.hashCode())) * 31;
        BaseOwnerCoverDto baseOwnerCoverDto = this.cover;
        int hashCode18 = (hashCode17 + (baseOwnerCoverDto == null ? 0 : baseOwnerCoverDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto5 = this.canPost;
        int hashCode19 = (hashCode18 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto6 = this.canSuggest;
        int hashCode20 = (hashCode19 + (baseBoolIntDto6 == null ? 0 : baseBoolIntDto6.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto7 = this.canUploadStory;
        int hashCode21 = (hashCode20 + (baseBoolIntDto7 == null ? 0 : baseBoolIntDto7.hashCode())) * 31;
        Boolean bool = this.canCallToCommunity;
        int hashCode22 = (hashCode21 + (bool == null ? 0 : bool.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto8 = this.canUploadDoc;
        int hashCode23 = (hashCode22 + (baseBoolIntDto8 == null ? 0 : baseBoolIntDto8.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto9 = this.canUploadVideo;
        int hashCode24 = (hashCode23 + (baseBoolIntDto9 == null ? 0 : baseBoolIntDto9.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto10 = this.canSeeAllPosts;
        int hashCode25 = (hashCode24 + (baseBoolIntDto10 == null ? 0 : baseBoolIntDto10.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto11 = this.canCreateTopic;
        int hashCode26 = (hashCode25 + (baseBoolIntDto11 == null ? 0 : baseBoolIntDto11.hashCode())) * 31;
        String str4 = this.activity;
        int hashCode27 = (hashCode26 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num6 = this.fixedPost;
        int hashCode28 = (hashCode27 + (num6 == null ? 0 : num6.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto12 = this.hasPhoto;
        int hashCode29 = (hashCode28 + (baseBoolIntDto12 == null ? 0 : baseBoolIntDto12.hashCode())) * 31;
        BaseCropPhotoDto baseCropPhotoDto = this.cropPhoto;
        int hashCode30 = (hashCode29 + (baseCropPhotoDto == null ? 0 : baseCropPhotoDto.hashCode())) * 31;
        String str5 = this.status;
        int hashCode31 = (hashCode30 + (str5 == null ? 0 : str5.hashCode())) * 31;
        AudioAudioDto audioAudioDto = this.statusAudio;
        int hashCode32 = (hashCode31 + (audioAudioDto == null ? 0 : audioAudioDto.hashCode())) * 31;
        Integer num7 = this.mainAlbumId;
        int hashCode33 = (hashCode32 + (num7 == null ? 0 : num7.hashCode())) * 31;
        List<GroupsLinksItemDto> list = this.links;
        int hashCode34 = (hashCode33 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsContactsItemDto> list2 = this.contacts;
        int hashCode35 = (hashCode34 + (list2 == null ? 0 : list2.hashCode())) * 31;
        WallDto wallDto = this.wall;
        int hashCode36 = (hashCode35 + (wallDto == null ? 0 : wallDto.hashCode())) * 31;
        String str6 = this.site;
        int hashCode37 = (hashCode36 + (str6 == null ? 0 : str6.hashCode())) * 31;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto = this.mainSection;
        int hashCode38 = (hashCode37 + (groupsGroupFullSectionDto == null ? 0 : groupsGroupFullSectionDto.hashCode())) * 31;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto2 = this.secondarySection;
        int hashCode39 = (hashCode38 + (groupsGroupFullSectionDto2 == null ? 0 : groupsGroupFullSectionDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto13 = this.trending;
        int hashCode40 = (hashCode39 + (baseBoolIntDto13 == null ? 0 : baseBoolIntDto13.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto14 = this.canMessage;
        int hashCode41 = (hashCode40 + (baseBoolIntDto14 == null ? 0 : baseBoolIntDto14.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto15 = this.isMessagesBlocked;
        int hashCode42 = (hashCode41 + (baseBoolIntDto15 == null ? 0 : baseBoolIntDto15.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto16 = this.canSendNotify;
        int hashCode43 = (hashCode42 + (baseBoolIntDto16 == null ? 0 : baseBoolIntDto16.hashCode())) * 31;
        GroupsOnlineStatusDto groupsOnlineStatusDto = this.onlineStatus;
        int hashCode44 = (hashCode43 + (groupsOnlineStatusDto == null ? 0 : groupsOnlineStatusDto.hashCode())) * 31;
        Integer num8 = this.invitedBy;
        int hashCode45 = (hashCode44 + (num8 == null ? 0 : num8.hashCode())) * 31;
        GroupsGroupFullAgeLimitsDto groupsGroupFullAgeLimitsDto = this.ageLimits;
        int hashCode46 = (hashCode45 + (groupsGroupFullAgeLimitsDto == null ? 0 : groupsGroupFullAgeLimitsDto.hashCode())) * 31;
        GroupsGroupBanInfoDto groupsGroupBanInfoDto = this.banInfo;
        int hashCode47 = (hashCode46 + (groupsGroupBanInfoDto == null ? 0 : groupsGroupBanInfoDto.hashCode())) * 31;
        Boolean bool2 = this.hasGroupChannel;
        int hashCode48 = (hashCode47 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        GroupsAddressesInfoDto groupsAddressesInfoDto = this.addresses;
        int hashCode49 = (hashCode48 + (groupsAddressesInfoDto == null ? 0 : groupsAddressesInfoDto.hashCode())) * 31;
        Boolean bool3 = this.isSubscribedPodcasts;
        int hashCode50 = (hashCode49 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.canSubscribePodcasts;
        int hashCode51 = (hashCode50 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.canSubscribePosts;
        int hashCode52 = (hashCode51 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        GroupsLiveCoversDto groupsLiveCoversDto = this.liveCovers;
        int hashCode53 = (hashCode52 + (groupsLiveCoversDto == null ? 0 : groupsLiveCoversDto.hashCode())) * 31;
        Integer num9 = this.storiesArchiveCount;
        int hashCode54 = (hashCode53 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Boolean bool6 = this.hasUnseenStories;
        int hashCode55 = (hashCode54 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str7 = this.name;
        int hashCode56 = (hashCode55 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.screenName;
        int hashCode57 = (hashCode56 + (str8 == null ? 0 : str8.hashCode())) * 31;
        GroupsGroupIsClosedDto groupsGroupIsClosedDto = this.isClosed;
        int hashCode58 = (hashCode57 + (groupsGroupIsClosedDto == null ? 0 : groupsGroupIsClosedDto.hashCode())) * 31;
        GroupsGroupTypeDto groupsGroupTypeDto = this.type;
        int hashCode59 = (hashCode58 + (groupsGroupTypeDto == null ? 0 : groupsGroupTypeDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto17 = this.isAdmin;
        int hashCode60 = (hashCode59 + (baseBoolIntDto17 == null ? 0 : baseBoolIntDto17.hashCode())) * 31;
        GroupsGroupAdminLevelDto groupsGroupAdminLevelDto = this.adminLevel;
        int hashCode61 = (hashCode60 + (groupsGroupAdminLevelDto == null ? 0 : groupsGroupAdminLevelDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto18 = this.isMember;
        int hashCode62 = (hashCode61 + (baseBoolIntDto18 == null ? 0 : baseBoolIntDto18.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto19 = this.isAdvertiser;
        int hashCode63 = (hashCode62 + (baseBoolIntDto19 == null ? 0 : baseBoolIntDto19.hashCode())) * 31;
        Integer num10 = this.startDate;
        int hashCode64 = (hashCode63 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.finishDate;
        int hashCode65 = (hashCode64 + (num11 == null ? 0 : num11.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto20 = this.verified;
        int hashCode66 = (hashCode65 + (baseBoolIntDto20 == null ? 0 : baseBoolIntDto20.hashCode())) * 31;
        String str9 = this.deactivated;
        int hashCode67 = (hashCode66 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.photo50;
        int hashCode68 = (hashCode67 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.photo100;
        int hashCode69 = (hashCode68 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.photo200;
        int hashCode70 = (hashCode69 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.photo200Orig;
        int hashCode71 = (hashCode70 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.photo400;
        int hashCode72 = (hashCode71 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.photo400Orig;
        int hashCode73 = (hashCode72 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.photoMax;
        int hashCode74 = (hashCode73 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.photoMaxOrig;
        int hashCode75 = (hashCode74 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.estDate;
        int hashCode76 = (hashCode75 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.publicDateLabel;
        int hashCode77 = (hashCode76 + (str19 == null ? 0 : str19.hashCode())) * 31;
        GroupsPhotoSizeDto groupsPhotoSizeDto = this.photoMaxSize;
        int hashCode78 = (hashCode77 + (groupsPhotoSizeDto == null ? 0 : groupsPhotoSizeDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto21 = this.isVideoLiveNotificationsBlocked;
        int hashCode79 = (hashCode78 + (baseBoolIntDto21 == null ? 0 : baseBoolIntDto21.hashCode())) * 31;
        VideoLiveInfoDto videoLiveInfoDto = this.videoLive;
        int hashCode80 = (hashCode79 + (videoLiveInfoDto == null ? 0 : videoLiveInfoDto.hashCode())) * 31;
        GroupsMarketInfoDto groupsMarketInfoDto = this.market;
        int hashCode81 = (hashCode80 + (groupsMarketInfoDto == null ? 0 : groupsMarketInfoDto.hashCode())) * 31;
        Boolean bool7 = this.hasMarketApp;
        int hashCode82 = (hashCode81 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.usingVkpayMarketApp;
        return hashCode82 + (bool8 != null ? bool8.hashCode() : 0);
    }

    public final String toString() {
        UserId userId = this.id;
        GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto = this.memberStatus;
        BaseBoolIntDto baseBoolIntDto = this.isAdult;
        BaseBoolIntDto baseBoolIntDto2 = this.isHiddenFromFeed;
        BaseBoolIntDto baseBoolIntDto3 = this.isFavorite;
        BaseBoolIntDto baseBoolIntDto4 = this.isSubscribed;
        BaseObjectDto baseObjectDto = this.city;
        BaseCountryDto baseCountryDto = this.country;
        String str = this.description;
        String str2 = this.wikiPage;
        Integer num = this.membersCount;
        String str3 = this.membersCountText;
        Integer num2 = this.requestsCount;
        Integer num3 = this.videoLiveLevel;
        Integer num4 = this.videoLiveCount;
        Integer num5 = this.clipsCount;
        GroupsCountersGroupDto groupsCountersGroupDto = this.counters;
        BaseOwnerCoverDto baseOwnerCoverDto = this.cover;
        BaseBoolIntDto baseBoolIntDto5 = this.canPost;
        BaseBoolIntDto baseBoolIntDto6 = this.canSuggest;
        BaseBoolIntDto baseBoolIntDto7 = this.canUploadStory;
        Boolean bool = this.canCallToCommunity;
        BaseBoolIntDto baseBoolIntDto8 = this.canUploadDoc;
        BaseBoolIntDto baseBoolIntDto9 = this.canUploadVideo;
        BaseBoolIntDto baseBoolIntDto10 = this.canSeeAllPosts;
        BaseBoolIntDto baseBoolIntDto11 = this.canCreateTopic;
        String str4 = this.activity;
        Integer num6 = this.fixedPost;
        BaseBoolIntDto baseBoolIntDto12 = this.hasPhoto;
        BaseCropPhotoDto baseCropPhotoDto = this.cropPhoto;
        String str5 = this.status;
        AudioAudioDto audioAudioDto = this.statusAudio;
        Integer num7 = this.mainAlbumId;
        List<GroupsLinksItemDto> list = this.links;
        List<GroupsContactsItemDto> list2 = this.contacts;
        WallDto wallDto = this.wall;
        String str6 = this.site;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto = this.mainSection;
        GroupsGroupFullSectionDto groupsGroupFullSectionDto2 = this.secondarySection;
        BaseBoolIntDto baseBoolIntDto13 = this.trending;
        BaseBoolIntDto baseBoolIntDto14 = this.canMessage;
        BaseBoolIntDto baseBoolIntDto15 = this.isMessagesBlocked;
        BaseBoolIntDto baseBoolIntDto16 = this.canSendNotify;
        GroupsOnlineStatusDto groupsOnlineStatusDto = this.onlineStatus;
        Integer num8 = this.invitedBy;
        GroupsGroupFullAgeLimitsDto groupsGroupFullAgeLimitsDto = this.ageLimits;
        GroupsGroupBanInfoDto groupsGroupBanInfoDto = this.banInfo;
        Boolean bool2 = this.hasGroupChannel;
        GroupsAddressesInfoDto groupsAddressesInfoDto = this.addresses;
        Boolean bool3 = this.isSubscribedPodcasts;
        Boolean bool4 = this.canSubscribePodcasts;
        Boolean bool5 = this.canSubscribePosts;
        GroupsLiveCoversDto groupsLiveCoversDto = this.liveCovers;
        Integer num9 = this.storiesArchiveCount;
        Boolean bool6 = this.hasUnseenStories;
        String str7 = this.name;
        String str8 = this.screenName;
        GroupsGroupIsClosedDto groupsGroupIsClosedDto = this.isClosed;
        GroupsGroupTypeDto groupsGroupTypeDto = this.type;
        BaseBoolIntDto baseBoolIntDto17 = this.isAdmin;
        GroupsGroupAdminLevelDto groupsGroupAdminLevelDto = this.adminLevel;
        BaseBoolIntDto baseBoolIntDto18 = this.isMember;
        BaseBoolIntDto baseBoolIntDto19 = this.isAdvertiser;
        Integer num10 = this.startDate;
        Integer num11 = this.finishDate;
        BaseBoolIntDto baseBoolIntDto20 = this.verified;
        String str9 = this.deactivated;
        String str10 = this.photo50;
        String str11 = this.photo100;
        String str12 = this.photo200;
        String str13 = this.photo200Orig;
        String str14 = this.photo400;
        String str15 = this.photo400Orig;
        String str16 = this.photoMax;
        String str17 = this.photoMaxOrig;
        String str18 = this.estDate;
        String str19 = this.publicDateLabel;
        GroupsPhotoSizeDto groupsPhotoSizeDto = this.photoMaxSize;
        BaseBoolIntDto baseBoolIntDto21 = this.isVideoLiveNotificationsBlocked;
        VideoLiveInfoDto videoLiveInfoDto = this.videoLive;
        GroupsMarketInfoDto groupsMarketInfoDto = this.market;
        Boolean bool7 = this.hasMarketApp;
        Boolean bool8 = this.usingVkpayMarketApp;
        StringBuilder sb = new StringBuilder("GroupsGroupFullDto(id=");
        sb.append(userId);
        sb.append(", memberStatus=");
        sb.append(groupsGroupFullMemberStatusDto);
        sb.append(", isAdult=");
        to.b(sb, baseBoolIntDto, ", isHiddenFromFeed=", baseBoolIntDto2, ", isFavorite=");
        to.b(sb, baseBoolIntDto3, ", isSubscribed=", baseBoolIntDto4, ", city=");
        sb.append(baseObjectDto);
        sb.append(", country=");
        sb.append(baseCountryDto);
        sb.append(", description=");
        n6j.b(sb, str, ", wikiPage=", str2, ", membersCount=");
        mq.b(num, ", membersCountText=", str3, ", requestsCount=", sb);
        sq.b(sb, num2, ", videoLiveLevel=", num3, ", videoLiveCount=");
        sq.b(sb, num4, ", clipsCount=", num5, ", counters=");
        sb.append(groupsCountersGroupDto);
        sb.append(", cover=");
        sb.append(baseOwnerCoverDto);
        sb.append(", canPost=");
        to.b(sb, baseBoolIntDto5, ", canSuggest=", baseBoolIntDto6, ", canUploadStory=");
        sb.append(baseBoolIntDto7);
        sb.append(", canCallToCommunity=");
        sb.append(bool);
        sb.append(", canUploadDoc=");
        to.b(sb, baseBoolIntDto8, ", canUploadVideo=", baseBoolIntDto9, ", canSeeAllPosts=");
        to.b(sb, baseBoolIntDto10, ", canCreateTopic=", baseBoolIntDto11, ", activity=");
        kr.b(num6, str4, ", fixedPost=", ", hasPhoto=", sb);
        sb.append(baseBoolIntDto12);
        sb.append(", cropPhoto=");
        sb.append(baseCropPhotoDto);
        sb.append(", status=");
        sb.append(str5);
        sb.append(", statusAudio=");
        sb.append(audioAudioDto);
        sb.append(", mainAlbumId=");
        sb.append(num7);
        sb.append(", links=");
        sb.append(list);
        sb.append(", contacts=");
        sb.append(list2);
        sb.append(", wall=");
        sb.append(wallDto);
        sb.append(", site=");
        sb.append(str6);
        sb.append(", mainSection=");
        sb.append(groupsGroupFullSectionDto);
        sb.append(", secondarySection=");
        sb.append(groupsGroupFullSectionDto2);
        sb.append(", trending=");
        sb.append(baseBoolIntDto13);
        sb.append(", canMessage=");
        to.b(sb, baseBoolIntDto14, ", isMessagesBlocked=", baseBoolIntDto15, ", canSendNotify=");
        sb.append(baseBoolIntDto16);
        sb.append(", onlineStatus=");
        sb.append(groupsOnlineStatusDto);
        sb.append(", invitedBy=");
        sb.append(num8);
        sb.append(", ageLimits=");
        sb.append(groupsGroupFullAgeLimitsDto);
        sb.append(", banInfo=");
        sb.append(groupsGroupBanInfoDto);
        sb.append(", hasGroupChannel=");
        sb.append(bool2);
        sb.append(", addresses=");
        sb.append(groupsAddressesInfoDto);
        sb.append(", isSubscribedPodcasts=");
        sb.append(bool3);
        sb.append(", canSubscribePodcasts=");
        tq.i(sb, bool4, ", canSubscribePosts=", bool5, ", liveCovers=");
        sb.append(groupsLiveCoversDto);
        sb.append(", storiesArchiveCount=");
        sb.append(num9);
        sb.append(", hasUnseenStories=");
        l4.i(bool6, ", name=", str7, ", screenName=", sb);
        sb.append(str8);
        sb.append(", isClosed=");
        sb.append(groupsGroupIsClosedDto);
        sb.append(", type=");
        sb.append(groupsGroupTypeDto);
        sb.append(", isAdmin=");
        sb.append(baseBoolIntDto17);
        sb.append(", adminLevel=");
        sb.append(groupsGroupAdminLevelDto);
        sb.append(", isMember=");
        sb.append(baseBoolIntDto18);
        sb.append(", isAdvertiser=");
        sb.append(baseBoolIntDto19);
        sb.append(", startDate=");
        sb.append(num10);
        sb.append(", finishDate=");
        sb.append(num11);
        sb.append(", verified=");
        sb.append(baseBoolIntDto20);
        sb.append(", deactivated=");
        n6j.b(sb, str9, ", photo50=", str10, ", photo100=");
        n6j.b(sb, str11, ", photo200=", str12, ", photo200Orig=");
        n6j.b(sb, str13, ", photo400=", str14, ", photo400Orig=");
        n6j.b(sb, str15, ", photoMax=", str16, ", photoMaxOrig=");
        n6j.b(sb, str17, ", estDate=", str18, ", publicDateLabel=");
        sb.append(str19);
        sb.append(", photoMaxSize=");
        sb.append(groupsPhotoSizeDto);
        sb.append(", isVideoLiveNotificationsBlocked=");
        sb.append(baseBoolIntDto21);
        sb.append(", videoLive=");
        sb.append(videoLiveInfoDto);
        sb.append(", market=");
        sb.append(groupsMarketInfoDto);
        sb.append(", hasMarketApp=");
        sb.append(bool7);
        sb.append(", usingVkpayMarketApp=");
        return xq.d(sb, bool8, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ GroupsGroupFullDto(UserId userId, GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, BaseObjectDto baseObjectDto, BaseCountryDto baseCountryDto, String str, String str2, Integer num, String str3, Integer num2, Integer num3, Integer num4, Integer num5, GroupsCountersGroupDto groupsCountersGroupDto, BaseOwnerCoverDto baseOwnerCoverDto, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, Boolean bool, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, BaseBoolIntDto baseBoolIntDto10, BaseBoolIntDto baseBoolIntDto11, String str4, Integer num6, BaseBoolIntDto baseBoolIntDto12, BaseCropPhotoDto baseCropPhotoDto, String str5, AudioAudioDto audioAudioDto, Integer num7, List list, List list2, WallDto wallDto, String str6, GroupsGroupFullSectionDto groupsGroupFullSectionDto, GroupsGroupFullSectionDto groupsGroupFullSectionDto2, BaseBoolIntDto baseBoolIntDto13, BaseBoolIntDto baseBoolIntDto14, BaseBoolIntDto baseBoolIntDto15, BaseBoolIntDto baseBoolIntDto16, GroupsOnlineStatusDto groupsOnlineStatusDto, Integer num8, GroupsGroupFullAgeLimitsDto groupsGroupFullAgeLimitsDto, GroupsGroupBanInfoDto groupsGroupBanInfoDto, Boolean bool2, GroupsAddressesInfoDto groupsAddressesInfoDto, Boolean bool3, Boolean bool4, Boolean bool5, GroupsLiveCoversDto groupsLiveCoversDto, Integer num9, Boolean bool6, String str7, String str8, GroupsGroupIsClosedDto groupsGroupIsClosedDto, GroupsGroupTypeDto groupsGroupTypeDto, BaseBoolIntDto baseBoolIntDto17, GroupsGroupAdminLevelDto groupsGroupAdminLevelDto, BaseBoolIntDto baseBoolIntDto18, BaseBoolIntDto baseBoolIntDto19, Integer num10, Integer num11, BaseBoolIntDto baseBoolIntDto20, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, GroupsPhotoSizeDto groupsPhotoSizeDto, BaseBoolIntDto baseBoolIntDto21, VideoLiveInfoDto videoLiveInfoDto, GroupsMarketInfoDto groupsMarketInfoDto, Boolean bool7, Boolean bool8, int i, int i2, int i3, zcl zclVar) {
        this(userId, r68, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r4, r3, r17, r19, r21, r23, r25, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r0, (i2 & 1) != 0 ? null : num7, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : wallDto, (i2 & 16) != 0 ? null : str6, (i2 & 32) != 0 ? null : groupsGroupFullSectionDto, (i2 & 64) != 0 ? null : groupsGroupFullSectionDto2, (i2 & 128) != 0 ? null : baseBoolIntDto13, (i2 & 256) != 0 ? null : baseBoolIntDto14, (i2 & 512) != 0 ? null : baseBoolIntDto15, (i2 & 1024) != 0 ? null : baseBoolIntDto16, (i2 & 2048) != 0 ? null : groupsOnlineStatusDto, (i2 & 4096) != 0 ? null : num8, (i2 & 8192) != 0 ? null : groupsGroupFullAgeLimitsDto, (i2 & 16384) != 0 ? null : groupsGroupBanInfoDto, (i2 & 32768) != 0 ? null : bool2, (i2 & 65536) != 0 ? null : groupsAddressesInfoDto, (i2 & 131072) != 0 ? null : bool3, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool4, (i2 & 524288) != 0 ? null : bool5, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : groupsLiveCoversDto, (i2 & 2097152) != 0 ? null : num9, (i2 & 4194304) != 0 ? null : bool6, (i2 & 8388608) != 0 ? null : str7, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str8, (i2 & 33554432) != 0 ? null : groupsGroupIsClosedDto, (i2 & 67108864) != 0 ? null : groupsGroupTypeDto, (i2 & 134217728) != 0 ? null : baseBoolIntDto17, (i2 & 268435456) != 0 ? null : groupsGroupAdminLevelDto, (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : baseBoolIntDto18, (i2 & 1073741824) != 0 ? null : baseBoolIntDto19, (i2 & Integer.MIN_VALUE) != 0 ? null : num10, (i3 & 1) != 0 ? null : num11, (i3 & 2) != 0 ? null : baseBoolIntDto20, (i3 & 4) != 0 ? null : str9, (i3 & 8) != 0 ? null : str10, (i3 & 16) != 0 ? null : str11, (i3 & 32) != 0 ? null : str12, (i3 & 64) != 0 ? null : str13, (i3 & 128) != 0 ? null : str14, (i3 & 256) != 0 ? null : str15, (i3 & 512) != 0 ? null : str16, (i3 & 1024) != 0 ? null : str17, (i3 & 2048) != 0 ? null : str18, (i3 & 4096) != 0 ? null : str19, (i3 & 8192) != 0 ? null : groupsPhotoSizeDto, (i3 & 16384) != 0 ? null : baseBoolIntDto21, (i3 & 32768) != 0 ? null : videoLiveInfoDto, (i3 & 65536) != 0 ? null : groupsMarketInfoDto, (i3 & 131072) != 0 ? null : bool7, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool8);
        GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto2 = (i & 2) != 0 ? null : groupsGroupFullMemberStatusDto;
        BaseBoolIntDto baseBoolIntDto22 = (i & 4) != 0 ? null : baseBoolIntDto;
        BaseBoolIntDto baseBoolIntDto23 = (i & 8) != 0 ? null : baseBoolIntDto2;
        BaseBoolIntDto baseBoolIntDto24 = (i & 16) != 0 ? null : baseBoolIntDto3;
        BaseBoolIntDto baseBoolIntDto25 = (i & 32) != 0 ? null : baseBoolIntDto4;
        BaseObjectDto baseObjectDto2 = (i & 64) != 0 ? null : baseObjectDto;
        BaseCountryDto baseCountryDto2 = (i & 128) != 0 ? null : baseCountryDto;
        String str20 = (i & 256) != 0 ? null : str;
        String str21 = (i & 512) != 0 ? null : str2;
        Integer num12 = (i & 1024) != 0 ? null : num;
        String str22 = (i & 2048) != 0 ? null : str3;
        Integer num13 = (i & 4096) != 0 ? null : num2;
        Integer num14 = (i & 8192) != 0 ? null : num3;
        GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto3 = groupsGroupFullMemberStatusDto2;
        Integer num15 = (i & 16384) != 0 ? null : num4;
        Integer num16 = (i & 32768) != 0 ? null : num5;
        GroupsCountersGroupDto groupsCountersGroupDto2 = (i & 65536) != 0 ? null : groupsCountersGroupDto;
        BaseOwnerCoverDto baseOwnerCoverDto2 = (i & 131072) != 0 ? null : baseOwnerCoverDto;
        BaseBoolIntDto baseBoolIntDto26 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : baseBoolIntDto5;
        BaseBoolIntDto baseBoolIntDto27 = (i & 524288) != 0 ? null : baseBoolIntDto6;
        BaseBoolIntDto baseBoolIntDto28 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : baseBoolIntDto7;
        Boolean bool9 = (i & 2097152) != 0 ? null : bool;
        BaseBoolIntDto baseBoolIntDto29 = (i & 4194304) != 0 ? null : baseBoolIntDto8;
        BaseBoolIntDto baseBoolIntDto30 = (i & 8388608) != 0 ? null : baseBoolIntDto9;
        BaseBoolIntDto baseBoolIntDto31 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : baseBoolIntDto10;
        BaseBoolIntDto baseBoolIntDto32 = (i & 33554432) != 0 ? null : baseBoolIntDto11;
        String str23 = (i & 67108864) != 0 ? null : str4;
        Integer num17 = (i & 134217728) != 0 ? null : num6;
        BaseBoolIntDto baseBoolIntDto33 = (i & 268435456) != 0 ? null : baseBoolIntDto12;
        BaseCropPhotoDto baseCropPhotoDto2 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : baseCropPhotoDto;
        String str24 = (i & 1073741824) != 0 ? null : str5;
        AudioAudioDto audioAudioDto2 = (i & Integer.MIN_VALUE) != 0 ? null : audioAudioDto;
    }
}
