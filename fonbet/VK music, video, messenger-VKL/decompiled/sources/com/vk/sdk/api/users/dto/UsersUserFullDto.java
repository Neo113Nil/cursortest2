package com.vk.sdk.api.users.dto;

import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.common.id.UserId;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.vk.sdk.api.apps.dto.AppsAppMinDto;
import com.vk.sdk.api.audio.dto.AudioAudioDto;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import com.vk.sdk.api.base.dto.BaseCityDto;
import com.vk.sdk.api.base.dto.BaseCountryDto;
import com.vk.sdk.api.base.dto.BaseCropPhotoDto;
import com.vk.sdk.api.base.dto.BaseSexDto;
import com.vk.sdk.api.friends.dto.FriendsFriendStatusStatusDto;
import com.vk.sdk.api.friends.dto.FriendsRequestsMutualDto;
import com.vk.sdk.api.owner.dto.OwnerStateDto;
import com.vk.sdk.api.photos.dto.PhotosPhotoDto;
import com.vk.sdk.api.video.dto.VideoLiveInfoDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import ru.ok.android.sdk.api.login.LoginRequest;
import xsna.asp;
import xsna.eok;
import xsna.epx;
import xsna.kr;
import xsna.mq;
import xsna.n6j;
import xsna.pmi0;
import xsna.rq;
import xsna.sq;
import xsna.to;
import xsna.tq;
import xsna.uq;
import xsna.vq;
import xsna.zcl;
import xsna.zrp;

/* compiled from: UsersUserFullDto.kt */
/* loaded from: classes5.dex */
public final class UsersUserFullDto {

    @pmi0("about")
    private final String about;

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("activities")
    private final String activities;

    @pmi0("activity")
    private final String activity;

    @pmi0("bdate")
    private final String bdate;

    @pmi0("blacklisted")
    private final BaseBoolIntDto blacklisted;

    @pmi0("blacklisted_by_me")
    private final BaseBoolIntDto blacklistedByMe;

    @pmi0("books")
    private final String books;

    @pmi0("can_access_closed")
    private final Boolean canAccessClosed;

    @pmi0("can_ban")
    private final Boolean canBan;

    @pmi0("can_be_invited_group")
    private final Boolean canBeInvitedGroup;

    @pmi0("can_call")
    private final Boolean canCall;

    @pmi0("can_call_from_group")
    private final Boolean canCallFromGroup;

    @pmi0("can_post")
    private final BaseBoolIntDto canPost;

    @pmi0("can_see_all_posts")
    private final BaseBoolIntDto canSeeAllPosts;

    @pmi0("can_see_audio")
    private final BaseBoolIntDto canSeeAudio;

    @pmi0("can_see_gifts")
    private final BaseBoolIntDto canSeeGifts;

    @pmi0("can_see_wishes")
    private final Boolean canSeeWishes;

    @pmi0("can_send_friend_request")
    private final BaseBoolIntDto canSendFriendRequest;

    @pmi0("can_subscribe_podcasts")
    private final Boolean canSubscribePodcasts;

    @pmi0("can_subscribe_posts")
    private final Boolean canSubscribePosts;

    @pmi0("can_upload_doc")
    private final BaseBoolIntDto canUploadDoc;

    @pmi0("can_write_private_message")
    private final BaseBoolIntDto canWritePrivateMessage;

    @pmi0("career")
    private final List<UsersCareerDto> career;

    @pmi0("city")
    private final BaseCityDto city;

    @pmi0("clips_count")
    private final Integer clipsCount;

    @pmi0("common_count")
    private final Integer commonCount;

    @pmi0("contact_id")
    private final Integer contactId;

    @pmi0("contact_name")
    private final String contactName;

    @pmi0("counters")
    private final UsersUserCountersDto counters;

    @pmi0("country")
    private final BaseCountryDto country;

    @pmi0("crop_photo")
    private final BaseCropPhotoDto cropPhoto;

    @pmi0("deactivated")
    private final String deactivated;

    @pmi0("descriptions")
    private final List<String> descriptions;

    @pmi0(X3.j.D)
    private final String domain;

    @pmi0("education_form")
    private final String educationForm;

    @pmi0("education_status")
    private final String educationStatus;

    @pmi0("email")
    private final String email;

    @pmi0("exports")
    private final UsersExportsDto exports;

    @pmi0("facebook")
    private final String facebook;

    @pmi0("facebook_name")
    private final String facebookName;

    @pmi0("faculty")
    private final Integer faculty;

    @pmi0("faculty_name")
    private final String facultyName;

    @pmi0("first_name")
    private final String firstName;

    @pmi0("first_name_abl")
    private final String firstNameAbl;

    @pmi0("first_name_acc")
    private final String firstNameAcc;

    @pmi0("first_name_dat")
    private final String firstNameDat;

    @pmi0("first_name_gen")
    private final String firstNameGen;

    @pmi0("first_name_ins")
    private final String firstNameIns;

    @pmi0("first_name_nom")
    private final String firstNameNom;

    @pmi0("followers_count")
    private final Integer followersCount;

    @pmi0("friend_status")
    private final FriendsFriendStatusStatusDto friendStatus;

    @pmi0("games")
    private final String games;

    @pmi0("graduation")
    private final Integer graduation;

    @pmi0("has_mobile")
    private final BaseBoolIntDto hasMobile;

    @pmi0("has_photo")
    private final BaseBoolIntDto hasPhoto;

    @pmi0("has_unseen_stories")
    private final Boolean hasUnseenStories;

    @pmi0("hash")
    private final String hash;

    @pmi0("hidden")
    private final Integer hidden;

    @pmi0("home_phone")
    private final String homePhone;

    @pmi0("home_town")
    private final String homeTown;

    @pmi0("id")
    private final UserId id;

    @pmi0("instagram")
    private final String instagram;

    @pmi0("interests")
    private final String interests;

    @pmi0("is_best_friend")
    private final Boolean isBestFriend;

    @pmi0("is_closed")
    private final Boolean isClosed;

    @pmi0("is_favorite")
    private final BaseBoolIntDto isFavorite;

    @pmi0("is_friend")
    private final BaseBoolIntDto isFriend;

    @pmi0("is_hidden_from_feed")
    private final BaseBoolIntDto isHiddenFromFeed;

    @pmi0("is_message_request")
    private final Boolean isMessageRequest;

    @pmi0("is_no_index")
    private final Boolean isNoIndex;

    @pmi0("is_service")
    private final Boolean isService;

    @pmi0("is_subscribed_podcasts")
    private final Boolean isSubscribedPodcasts;

    @pmi0("is_video_live_notifications_blocked")
    private final BaseBoolIntDto isVideoLiveNotificationsBlocked;

    @pmi0("language")
    private final String language;

    @pmi0("last_name")
    private final String lastName;

    @pmi0("last_name_abl")
    private final String lastNameAbl;

    @pmi0("last_name_acc")
    private final String lastNameAcc;

    @pmi0("last_name_dat")
    private final String lastNameDat;

    @pmi0("last_name_gen")
    private final String lastNameGen;

    @pmi0("last_name_ins")
    private final String lastNameIns;

    @pmi0("last_name_nom")
    private final String lastNameNom;

    @pmi0("last_seen")
    private final UsersLastSeenDto lastSeen;

    @pmi0("lists")
    private final List<Integer> lists;

    @pmi0("livejournal")
    private final String livejournal;

    @pmi0("maiden_name")
    private final String maidenName;

    @pmi0("military")
    private final List<UsersMilitaryDto> military;

    @pmi0("mobile_phone")
    private final String mobilePhone;

    @pmi0("movies")
    private final String movies;

    @pmi0("music")
    private final String music;

    @pmi0("mutual")
    private final FriendsRequestsMutualDto mutual;

    @pmi0("nickname")
    private final String nickname;

    @pmi0("occupation")
    private final UsersOccupationDto occupation;

    @pmi0(eok.ONLINE_EXTRAS_KEY)
    private final BaseBoolIntDto online;

    @pmi0("online_app")
    private final Integer onlineApp;

    @pmi0("online_info")
    private final UsersOnlineInfoDto onlineInfo;

    @pmi0("online_mobile")
    private final BaseBoolIntDto onlineMobile;

    @pmi0("owner_state")
    private final OwnerStateDto ownerState;

    @pmi0("personal")
    private final UsersPersonalDto personal;

    @pmi0("photo")
    private final String photo;

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

    @pmi0("photo_big")
    private final String photoBig;

    @pmi0("photo_id")
    private final String photoId;

    @pmi0("photo_max")
    private final String photoMax;

    @pmi0("photo_max_orig")
    private final String photoMaxOrig;

    @pmi0("photo_max_size")
    private final PhotosPhotoDto photoMaxSize;

    @pmi0("photo_medium")
    private final String photoMedium;

    @pmi0("photo_medium_rec")
    private final String photoMediumRec;

    @pmi0("photo_rec")
    private final String photoRec;

    @pmi0("quotes")
    private final String quotes;

    @pmi0("relation")
    private final UsersUserRelationDto relation;

    @pmi0("relation_partner")
    private final UsersUserMinDto relationPartner;

    @pmi0("relatives")
    private final List<UsersRelativeDto> relatives;

    @pmi0("schools")
    private final List<UsersSchoolDto> schools;

    @pmi0("screen_name")
    private final String screenName;

    @pmi0("service_description")
    private final String serviceDescription;

    @pmi0("sex")
    private final BaseSexDto sex;

    @pmi0("site")
    private final String site;

    @pmi0("skype")
    private final String skype;

    @pmi0("status")
    private final String status;

    @pmi0("status_app")
    private final AppsAppMinDto statusApp;

    @pmi0("status_audio")
    private final AudioAudioDto statusAudio;

    @pmi0("stories_archive_count")
    private final Integer storiesArchiveCount;

    @pmi0(LoginRequest.CLIENT_NAME)
    private final BaseBoolIntDto test;

    @pmi0(AnalyticsBaseParamsConstantsKt.TIMEZONE)
    private final Float timezone;

    @pmi0("trending")
    private final BaseBoolIntDto trending;

    @pmi0("tv")
    private final String tv;

    @pmi0("twitter")
    private final String twitter;

    @pmi0("type")
    private final UsersUserTypeDto type;

    @pmi0("universities")
    private final List<UsersUniversityDto> universities;

    @pmi0("university")
    private final Integer university;

    @pmi0("university_group_id")
    private final Integer universityGroupId;

    @pmi0("university_name")
    private final String universityName;

    @pmi0("verified")
    private final BaseBoolIntDto verified;

    @pmi0("video_live")
    private final VideoLiveInfoDto videoLive;

    @pmi0("video_live_count")
    private final Integer videoLiveCount;

    @pmi0("video_live_level")
    private final Integer videoLiveLevel;

    @pmi0("wall_comments")
    private final BaseBoolIntDto wallComments;

    @pmi0("wall_default")
    private final WallDefaultDto wallDefault;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UsersUserFullDto.kt */
    public static final class WallDefaultDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ WallDefaultDto[] $VALUES;

        @pmi0("all")
        public static final WallDefaultDto ALL;

        @pmi0("owner")
        public static final WallDefaultDto OWNER;
        private final String value;

        static {
            WallDefaultDto wallDefaultDto = new WallDefaultDto("OWNER", 0, "owner");
            OWNER = wallDefaultDto;
            WallDefaultDto wallDefaultDto2 = new WallDefaultDto("ALL", 1, "all");
            ALL = wallDefaultDto2;
            WallDefaultDto[] wallDefaultDtoArr = {wallDefaultDto, wallDefaultDto2};
            $VALUES = wallDefaultDtoArr;
            $ENTRIES = new asp(wallDefaultDtoArr);
        }

        private WallDefaultDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static WallDefaultDto valueOf(String str) {
            return (WallDefaultDto) Enum.valueOf(WallDefaultDto.class, str);
        }

        public static WallDefaultDto[] values() {
            return (WallDefaultDto[]) $VALUES.clone();
        }
    }

    public UsersUserFullDto(UserId userId, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, Float f, OwnerStateDto ownerStateDto, String str18, String str19, String str20, String str21, String str22, String str23, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Boolean bool, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, UsersUserTypeDto usersUserTypeDto, String str24, String str25, String str26, String str27, String str28, String str29, String str30, BaseBoolIntDto baseBoolIntDto8, VideoLiveInfoDto videoLiveInfoDto, BaseBoolIntDto baseBoolIntDto9, Boolean bool2, String str31, String str32, String str33, String str34, String str35, String str36, String str37, PhotosPhotoDto photosPhotoDto, String str38, Integer num, Boolean bool3, WallDefaultDto wallDefaultDto, Boolean bool4, Boolean bool5, Boolean bool6, BaseBoolIntDto baseBoolIntDto10, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, BaseBoolIntDto baseBoolIntDto11, BaseBoolIntDto baseBoolIntDto12, Boolean bool7, String str48, String str49, String str50, AudioAudioDto audioAudioDto, String str51, String str52, AppsAppMinDto appsAppMinDto, UsersLastSeenDto usersLastSeenDto, UsersExportsDto usersExportsDto, BaseCropPhotoDto baseCropPhotoDto, Integer num2, Integer num3, Integer num4, Integer num5, BaseBoolIntDto baseBoolIntDto13, BaseBoolIntDto baseBoolIntDto14, BaseBoolIntDto baseBoolIntDto15, BaseBoolIntDto baseBoolIntDto16, Integer num6, UsersOccupationDto usersOccupationDto, List<UsersCareerDto> list, List<UsersMilitaryDto> list2, Integer num7, String str53, Integer num8, Integer num9, String str54, Integer num10, String str55, String str56, String str57, UsersUserRelationDto usersUserRelationDto, UsersUserMinDto usersUserMinDto, UsersPersonalDto usersPersonalDto, List<UsersUniversityDto> list3, List<UsersSchoolDto> list4, List<UsersRelativeDto> list5, Boolean bool8, Boolean bool9, Boolean bool10, UsersUserCountersDto usersUserCountersDto, String str58, BaseBoolIntDto baseBoolIntDto17, Boolean bool11, String str59, Boolean bool12, Integer num11, Boolean bool13, List<String> list6, List<Integer> list7, BaseSexDto baseSexDto, String str60, String str61, String str62, UsersOnlineInfoDto usersOnlineInfoDto, BaseBoolIntDto baseBoolIntDto18, BaseBoolIntDto baseBoolIntDto19, Integer num12, BaseBoolIntDto baseBoolIntDto20, BaseBoolIntDto baseBoolIntDto21, FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, FriendsRequestsMutualDto friendsRequestsMutualDto, String str63, String str64, Integer num13, String str65, Boolean bool14, Boolean bool15) {
        this.id = userId;
        this.firstNameNom = str;
        this.firstNameGen = str2;
        this.firstNameDat = str3;
        this.firstNameAcc = str4;
        this.firstNameIns = str5;
        this.firstNameAbl = str6;
        this.lastNameNom = str7;
        this.lastNameGen = str8;
        this.lastNameDat = str9;
        this.lastNameAcc = str10;
        this.lastNameIns = str11;
        this.lastNameAbl = str12;
        this.nickname = str13;
        this.maidenName = str14;
        this.contactName = str15;
        this.domain = str16;
        this.bdate = str17;
        this.city = baseCityDto;
        this.country = baseCountryDto;
        this.timezone = f;
        this.ownerState = ownerStateDto;
        this.photo200 = str18;
        this.photoMax = str19;
        this.photo200Orig = str20;
        this.photo400Orig = str21;
        this.photoMaxOrig = str22;
        this.photoId = str23;
        this.hasPhoto = baseBoolIntDto;
        this.hasMobile = baseBoolIntDto2;
        this.isFriend = baseBoolIntDto3;
        this.isBestFriend = bool;
        this.wallComments = baseBoolIntDto4;
        this.canPost = baseBoolIntDto5;
        this.canSeeAllPosts = baseBoolIntDto6;
        this.canSeeAudio = baseBoolIntDto7;
        this.type = usersUserTypeDto;
        this.email = str24;
        this.skype = str25;
        this.facebook = str26;
        this.facebookName = str27;
        this.twitter = str28;
        this.livejournal = str29;
        this.instagram = str30;
        this.test = baseBoolIntDto8;
        this.videoLive = videoLiveInfoDto;
        this.isVideoLiveNotificationsBlocked = baseBoolIntDto9;
        this.isService = bool2;
        this.serviceDescription = str31;
        this.photoRec = str32;
        this.photoMedium = str33;
        this.photoMediumRec = str34;
        this.photo = str35;
        this.photoBig = str36;
        this.photo400 = str37;
        this.photoMaxSize = photosPhotoDto;
        this.language = str38;
        this.storiesArchiveCount = num;
        this.hasUnseenStories = bool3;
        this.wallDefault = wallDefaultDto;
        this.canCall = bool4;
        this.canCallFromGroup = bool5;
        this.canSeeWishes = bool6;
        this.canSeeGifts = baseBoolIntDto10;
        this.interests = str39;
        this.books = str40;
        this.tv = str41;
        this.quotes = str42;
        this.about = str43;
        this.games = str44;
        this.movies = str45;
        this.activities = str46;
        this.music = str47;
        this.canWritePrivateMessage = baseBoolIntDto11;
        this.canSendFriendRequest = baseBoolIntDto12;
        this.canBeInvitedGroup = bool7;
        this.mobilePhone = str48;
        this.homePhone = str49;
        this.site = str50;
        this.statusAudio = audioAudioDto;
        this.status = str51;
        this.activity = str52;
        this.statusApp = appsAppMinDto;
        this.lastSeen = usersLastSeenDto;
        this.exports = usersExportsDto;
        this.cropPhoto = baseCropPhotoDto;
        this.followersCount = num2;
        this.videoLiveLevel = num3;
        this.videoLiveCount = num4;
        this.clipsCount = num5;
        this.blacklisted = baseBoolIntDto13;
        this.blacklistedByMe = baseBoolIntDto14;
        this.isFavorite = baseBoolIntDto15;
        this.isHiddenFromFeed = baseBoolIntDto16;
        this.commonCount = num6;
        this.occupation = usersOccupationDto;
        this.career = list;
        this.military = list2;
        this.university = num7;
        this.universityName = str53;
        this.universityGroupId = num8;
        this.faculty = num9;
        this.facultyName = str54;
        this.graduation = num10;
        this.educationForm = str55;
        this.educationStatus = str56;
        this.homeTown = str57;
        this.relation = usersUserRelationDto;
        this.relationPartner = usersUserMinDto;
        this.personal = usersPersonalDto;
        this.universities = list3;
        this.schools = list4;
        this.relatives = list5;
        this.isSubscribedPodcasts = bool8;
        this.canSubscribePodcasts = bool9;
        this.canSubscribePosts = bool10;
        this.counters = usersUserCountersDto;
        this.accessKey = str58;
        this.canUploadDoc = baseBoolIntDto17;
        this.canBan = bool11;
        this.hash = str59;
        this.isNoIndex = bool12;
        this.contactId = num11;
        this.isMessageRequest = bool13;
        this.descriptions = list6;
        this.lists = list7;
        this.sex = baseSexDto;
        this.screenName = str60;
        this.photo50 = str61;
        this.photo100 = str62;
        this.onlineInfo = usersOnlineInfoDto;
        this.online = baseBoolIntDto18;
        this.onlineMobile = baseBoolIntDto19;
        this.onlineApp = num12;
        this.verified = baseBoolIntDto20;
        this.trending = baseBoolIntDto21;
        this.friendStatus = friendsFriendStatusStatusDto;
        this.mutual = friendsRequestsMutualDto;
        this.deactivated = str63;
        this.firstName = str64;
        this.hidden = num13;
        this.lastName = str65;
        this.canAccessClosed = bool14;
        this.isClosed = bool15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersUserFullDto)) {
            return false;
        }
        UsersUserFullDto usersUserFullDto = (UsersUserFullDto) obj;
        return epx.f(this.id, usersUserFullDto.id) && epx.f(this.firstNameNom, usersUserFullDto.firstNameNom) && epx.f(this.firstNameGen, usersUserFullDto.firstNameGen) && epx.f(this.firstNameDat, usersUserFullDto.firstNameDat) && epx.f(this.firstNameAcc, usersUserFullDto.firstNameAcc) && epx.f(this.firstNameIns, usersUserFullDto.firstNameIns) && epx.f(this.firstNameAbl, usersUserFullDto.firstNameAbl) && epx.f(this.lastNameNom, usersUserFullDto.lastNameNom) && epx.f(this.lastNameGen, usersUserFullDto.lastNameGen) && epx.f(this.lastNameDat, usersUserFullDto.lastNameDat) && epx.f(this.lastNameAcc, usersUserFullDto.lastNameAcc) && epx.f(this.lastNameIns, usersUserFullDto.lastNameIns) && epx.f(this.lastNameAbl, usersUserFullDto.lastNameAbl) && epx.f(this.nickname, usersUserFullDto.nickname) && epx.f(this.maidenName, usersUserFullDto.maidenName) && epx.f(this.contactName, usersUserFullDto.contactName) && epx.f(this.domain, usersUserFullDto.domain) && epx.f(this.bdate, usersUserFullDto.bdate) && epx.f(this.city, usersUserFullDto.city) && epx.f(this.country, usersUserFullDto.country) && epx.f(this.timezone, usersUserFullDto.timezone) && epx.f(this.ownerState, usersUserFullDto.ownerState) && epx.f(this.photo200, usersUserFullDto.photo200) && epx.f(this.photoMax, usersUserFullDto.photoMax) && epx.f(this.photo200Orig, usersUserFullDto.photo200Orig) && epx.f(this.photo400Orig, usersUserFullDto.photo400Orig) && epx.f(this.photoMaxOrig, usersUserFullDto.photoMaxOrig) && epx.f(this.photoId, usersUserFullDto.photoId) && this.hasPhoto == usersUserFullDto.hasPhoto && this.hasMobile == usersUserFullDto.hasMobile && this.isFriend == usersUserFullDto.isFriend && epx.f(this.isBestFriend, usersUserFullDto.isBestFriend) && this.wallComments == usersUserFullDto.wallComments && this.canPost == usersUserFullDto.canPost && this.canSeeAllPosts == usersUserFullDto.canSeeAllPosts && this.canSeeAudio == usersUserFullDto.canSeeAudio && this.type == usersUserFullDto.type && epx.f(this.email, usersUserFullDto.email) && epx.f(this.skype, usersUserFullDto.skype) && epx.f(this.facebook, usersUserFullDto.facebook) && epx.f(this.facebookName, usersUserFullDto.facebookName) && epx.f(this.twitter, usersUserFullDto.twitter) && epx.f(this.livejournal, usersUserFullDto.livejournal) && epx.f(this.instagram, usersUserFullDto.instagram) && this.test == usersUserFullDto.test && epx.f(this.videoLive, usersUserFullDto.videoLive) && this.isVideoLiveNotificationsBlocked == usersUserFullDto.isVideoLiveNotificationsBlocked && epx.f(this.isService, usersUserFullDto.isService) && epx.f(this.serviceDescription, usersUserFullDto.serviceDescription) && epx.f(this.photoRec, usersUserFullDto.photoRec) && epx.f(this.photoMedium, usersUserFullDto.photoMedium) && epx.f(this.photoMediumRec, usersUserFullDto.photoMediumRec) && epx.f(this.photo, usersUserFullDto.photo) && epx.f(this.photoBig, usersUserFullDto.photoBig) && epx.f(this.photo400, usersUserFullDto.photo400) && epx.f(this.photoMaxSize, usersUserFullDto.photoMaxSize) && epx.f(this.language, usersUserFullDto.language) && epx.f(this.storiesArchiveCount, usersUserFullDto.storiesArchiveCount) && epx.f(this.hasUnseenStories, usersUserFullDto.hasUnseenStories) && this.wallDefault == usersUserFullDto.wallDefault && epx.f(this.canCall, usersUserFullDto.canCall) && epx.f(this.canCallFromGroup, usersUserFullDto.canCallFromGroup) && epx.f(this.canSeeWishes, usersUserFullDto.canSeeWishes) && this.canSeeGifts == usersUserFullDto.canSeeGifts && epx.f(this.interests, usersUserFullDto.interests) && epx.f(this.books, usersUserFullDto.books) && epx.f(this.tv, usersUserFullDto.tv) && epx.f(this.quotes, usersUserFullDto.quotes) && epx.f(this.about, usersUserFullDto.about) && epx.f(this.games, usersUserFullDto.games) && epx.f(this.movies, usersUserFullDto.movies) && epx.f(this.activities, usersUserFullDto.activities) && epx.f(this.music, usersUserFullDto.music) && this.canWritePrivateMessage == usersUserFullDto.canWritePrivateMessage && this.canSendFriendRequest == usersUserFullDto.canSendFriendRequest && epx.f(this.canBeInvitedGroup, usersUserFullDto.canBeInvitedGroup) && epx.f(this.mobilePhone, usersUserFullDto.mobilePhone) && epx.f(this.homePhone, usersUserFullDto.homePhone) && epx.f(this.site, usersUserFullDto.site) && epx.f(this.statusAudio, usersUserFullDto.statusAudio) && epx.f(this.status, usersUserFullDto.status) && epx.f(this.activity, usersUserFullDto.activity) && epx.f(this.statusApp, usersUserFullDto.statusApp) && epx.f(this.lastSeen, usersUserFullDto.lastSeen) && epx.f(this.exports, usersUserFullDto.exports) && epx.f(this.cropPhoto, usersUserFullDto.cropPhoto) && epx.f(this.followersCount, usersUserFullDto.followersCount) && epx.f(this.videoLiveLevel, usersUserFullDto.videoLiveLevel) && epx.f(this.videoLiveCount, usersUserFullDto.videoLiveCount) && epx.f(this.clipsCount, usersUserFullDto.clipsCount) && this.blacklisted == usersUserFullDto.blacklisted && this.blacklistedByMe == usersUserFullDto.blacklistedByMe && this.isFavorite == usersUserFullDto.isFavorite && this.isHiddenFromFeed == usersUserFullDto.isHiddenFromFeed && epx.f(this.commonCount, usersUserFullDto.commonCount) && epx.f(this.occupation, usersUserFullDto.occupation) && epx.f(this.career, usersUserFullDto.career) && epx.f(this.military, usersUserFullDto.military) && epx.f(this.university, usersUserFullDto.university) && epx.f(this.universityName, usersUserFullDto.universityName) && epx.f(this.universityGroupId, usersUserFullDto.universityGroupId) && epx.f(this.faculty, usersUserFullDto.faculty) && epx.f(this.facultyName, usersUserFullDto.facultyName) && epx.f(this.graduation, usersUserFullDto.graduation) && epx.f(this.educationForm, usersUserFullDto.educationForm) && epx.f(this.educationStatus, usersUserFullDto.educationStatus) && epx.f(this.homeTown, usersUserFullDto.homeTown) && this.relation == usersUserFullDto.relation && epx.f(this.relationPartner, usersUserFullDto.relationPartner) && epx.f(this.personal, usersUserFullDto.personal) && epx.f(this.universities, usersUserFullDto.universities) && epx.f(this.schools, usersUserFullDto.schools) && epx.f(this.relatives, usersUserFullDto.relatives) && epx.f(this.isSubscribedPodcasts, usersUserFullDto.isSubscribedPodcasts) && epx.f(this.canSubscribePodcasts, usersUserFullDto.canSubscribePodcasts) && epx.f(this.canSubscribePosts, usersUserFullDto.canSubscribePosts) && epx.f(this.counters, usersUserFullDto.counters) && epx.f(this.accessKey, usersUserFullDto.accessKey) && this.canUploadDoc == usersUserFullDto.canUploadDoc && epx.f(this.canBan, usersUserFullDto.canBan) && epx.f(this.hash, usersUserFullDto.hash) && epx.f(this.isNoIndex, usersUserFullDto.isNoIndex) && epx.f(this.contactId, usersUserFullDto.contactId) && epx.f(this.isMessageRequest, usersUserFullDto.isMessageRequest) && epx.f(this.descriptions, usersUserFullDto.descriptions) && epx.f(this.lists, usersUserFullDto.lists) && this.sex == usersUserFullDto.sex && epx.f(this.screenName, usersUserFullDto.screenName) && epx.f(this.photo50, usersUserFullDto.photo50) && epx.f(this.photo100, usersUserFullDto.photo100) && epx.f(this.onlineInfo, usersUserFullDto.onlineInfo) && this.online == usersUserFullDto.online && this.onlineMobile == usersUserFullDto.onlineMobile && epx.f(this.onlineApp, usersUserFullDto.onlineApp) && this.verified == usersUserFullDto.verified && this.trending == usersUserFullDto.trending && this.friendStatus == usersUserFullDto.friendStatus && epx.f(this.mutual, usersUserFullDto.mutual) && epx.f(this.deactivated, usersUserFullDto.deactivated) && epx.f(this.firstName, usersUserFullDto.firstName) && epx.f(this.hidden, usersUserFullDto.hidden) && epx.f(this.lastName, usersUserFullDto.lastName) && epx.f(this.canAccessClosed, usersUserFullDto.canAccessClosed) && epx.f(this.isClosed, usersUserFullDto.isClosed);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.id.b) * 31;
        String str = this.firstNameNom;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firstNameGen;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firstNameDat;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.firstNameAcc;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.firstNameIns;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.firstNameAbl;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.lastNameNom;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.lastNameGen;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.lastNameDat;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.lastNameAcc;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.lastNameIns;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.lastNameAbl;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.nickname;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.maidenName;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.contactName;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.domain;
        int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.bdate;
        int hashCode18 = (hashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        BaseCityDto baseCityDto = this.city;
        int hashCode19 = (hashCode18 + (baseCityDto == null ? 0 : baseCityDto.hashCode())) * 31;
        BaseCountryDto baseCountryDto = this.country;
        int hashCode20 = (hashCode19 + (baseCountryDto == null ? 0 : baseCountryDto.hashCode())) * 31;
        Float f = this.timezone;
        int hashCode21 = (hashCode20 + (f == null ? 0 : f.hashCode())) * 31;
        OwnerStateDto ownerStateDto = this.ownerState;
        int hashCode22 = (hashCode21 + (ownerStateDto == null ? 0 : ownerStateDto.hashCode())) * 31;
        String str18 = this.photo200;
        int hashCode23 = (hashCode22 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.photoMax;
        int hashCode24 = (hashCode23 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.photo200Orig;
        int hashCode25 = (hashCode24 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.photo400Orig;
        int hashCode26 = (hashCode25 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.photoMaxOrig;
        int hashCode27 = (hashCode26 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.photoId;
        int hashCode28 = (hashCode27 + (str23 == null ? 0 : str23.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.hasPhoto;
        int hashCode29 = (hashCode28 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.hasMobile;
        int hashCode30 = (hashCode29 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.isFriend;
        int hashCode31 = (hashCode30 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        Boolean bool = this.isBestFriend;
        int hashCode32 = (hashCode31 + (bool == null ? 0 : bool.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.wallComments;
        int hashCode33 = (hashCode32 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto5 = this.canPost;
        int hashCode34 = (hashCode33 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto6 = this.canSeeAllPosts;
        int hashCode35 = (hashCode34 + (baseBoolIntDto6 == null ? 0 : baseBoolIntDto6.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto7 = this.canSeeAudio;
        int hashCode36 = (hashCode35 + (baseBoolIntDto7 == null ? 0 : baseBoolIntDto7.hashCode())) * 31;
        UsersUserTypeDto usersUserTypeDto = this.type;
        int hashCode37 = (hashCode36 + (usersUserTypeDto == null ? 0 : usersUserTypeDto.hashCode())) * 31;
        String str24 = this.email;
        int hashCode38 = (hashCode37 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.skype;
        int hashCode39 = (hashCode38 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.facebook;
        int hashCode40 = (hashCode39 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.facebookName;
        int hashCode41 = (hashCode40 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.twitter;
        int hashCode42 = (hashCode41 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.livejournal;
        int hashCode43 = (hashCode42 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.instagram;
        int hashCode44 = (hashCode43 + (str30 == null ? 0 : str30.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto8 = this.test;
        int hashCode45 = (hashCode44 + (baseBoolIntDto8 == null ? 0 : baseBoolIntDto8.hashCode())) * 31;
        VideoLiveInfoDto videoLiveInfoDto = this.videoLive;
        int hashCode46 = (hashCode45 + (videoLiveInfoDto == null ? 0 : videoLiveInfoDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto9 = this.isVideoLiveNotificationsBlocked;
        int hashCode47 = (hashCode46 + (baseBoolIntDto9 == null ? 0 : baseBoolIntDto9.hashCode())) * 31;
        Boolean bool2 = this.isService;
        int hashCode48 = (hashCode47 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str31 = this.serviceDescription;
        int hashCode49 = (hashCode48 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.photoRec;
        int hashCode50 = (hashCode49 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.photoMedium;
        int hashCode51 = (hashCode50 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.photoMediumRec;
        int hashCode52 = (hashCode51 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.photo;
        int hashCode53 = (hashCode52 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.photoBig;
        int hashCode54 = (hashCode53 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.photo400;
        int hashCode55 = (hashCode54 + (str37 == null ? 0 : str37.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photoMaxSize;
        int hashCode56 = (hashCode55 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        String str38 = this.language;
        int hashCode57 = (hashCode56 + (str38 == null ? 0 : str38.hashCode())) * 31;
        Integer num = this.storiesArchiveCount;
        int hashCode58 = (hashCode57 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.hasUnseenStories;
        int hashCode59 = (hashCode58 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        WallDefaultDto wallDefaultDto = this.wallDefault;
        int hashCode60 = (hashCode59 + (wallDefaultDto == null ? 0 : wallDefaultDto.hashCode())) * 31;
        Boolean bool4 = this.canCall;
        int hashCode61 = (hashCode60 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.canCallFromGroup;
        int hashCode62 = (hashCode61 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.canSeeWishes;
        int hashCode63 = (hashCode62 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto10 = this.canSeeGifts;
        int hashCode64 = (hashCode63 + (baseBoolIntDto10 == null ? 0 : baseBoolIntDto10.hashCode())) * 31;
        String str39 = this.interests;
        int hashCode65 = (hashCode64 + (str39 == null ? 0 : str39.hashCode())) * 31;
        String str40 = this.books;
        int hashCode66 = (hashCode65 + (str40 == null ? 0 : str40.hashCode())) * 31;
        String str41 = this.tv;
        int hashCode67 = (hashCode66 + (str41 == null ? 0 : str41.hashCode())) * 31;
        String str42 = this.quotes;
        int hashCode68 = (hashCode67 + (str42 == null ? 0 : str42.hashCode())) * 31;
        String str43 = this.about;
        int hashCode69 = (hashCode68 + (str43 == null ? 0 : str43.hashCode())) * 31;
        String str44 = this.games;
        int hashCode70 = (hashCode69 + (str44 == null ? 0 : str44.hashCode())) * 31;
        String str45 = this.movies;
        int hashCode71 = (hashCode70 + (str45 == null ? 0 : str45.hashCode())) * 31;
        String str46 = this.activities;
        int hashCode72 = (hashCode71 + (str46 == null ? 0 : str46.hashCode())) * 31;
        String str47 = this.music;
        int hashCode73 = (hashCode72 + (str47 == null ? 0 : str47.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto11 = this.canWritePrivateMessage;
        int hashCode74 = (hashCode73 + (baseBoolIntDto11 == null ? 0 : baseBoolIntDto11.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto12 = this.canSendFriendRequest;
        int hashCode75 = (hashCode74 + (baseBoolIntDto12 == null ? 0 : baseBoolIntDto12.hashCode())) * 31;
        Boolean bool7 = this.canBeInvitedGroup;
        int hashCode76 = (hashCode75 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str48 = this.mobilePhone;
        int hashCode77 = (hashCode76 + (str48 == null ? 0 : str48.hashCode())) * 31;
        String str49 = this.homePhone;
        int hashCode78 = (hashCode77 + (str49 == null ? 0 : str49.hashCode())) * 31;
        String str50 = this.site;
        int hashCode79 = (hashCode78 + (str50 == null ? 0 : str50.hashCode())) * 31;
        AudioAudioDto audioAudioDto = this.statusAudio;
        int hashCode80 = (hashCode79 + (audioAudioDto == null ? 0 : audioAudioDto.hashCode())) * 31;
        String str51 = this.status;
        int hashCode81 = (hashCode80 + (str51 == null ? 0 : str51.hashCode())) * 31;
        String str52 = this.activity;
        int hashCode82 = (hashCode81 + (str52 == null ? 0 : str52.hashCode())) * 31;
        AppsAppMinDto appsAppMinDto = this.statusApp;
        int hashCode83 = (hashCode82 + (appsAppMinDto == null ? 0 : appsAppMinDto.hashCode())) * 31;
        UsersLastSeenDto usersLastSeenDto = this.lastSeen;
        int hashCode84 = (hashCode83 + (usersLastSeenDto == null ? 0 : usersLastSeenDto.hashCode())) * 31;
        UsersExportsDto usersExportsDto = this.exports;
        int hashCode85 = (hashCode84 + (usersExportsDto == null ? 0 : usersExportsDto.hashCode())) * 31;
        BaseCropPhotoDto baseCropPhotoDto = this.cropPhoto;
        int hashCode86 = (hashCode85 + (baseCropPhotoDto == null ? 0 : baseCropPhotoDto.hashCode())) * 31;
        Integer num2 = this.followersCount;
        int hashCode87 = (hashCode86 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.videoLiveLevel;
        int hashCode88 = (hashCode87 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.videoLiveCount;
        int hashCode89 = (hashCode88 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.clipsCount;
        int hashCode90 = (hashCode89 + (num5 == null ? 0 : num5.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto13 = this.blacklisted;
        int hashCode91 = (hashCode90 + (baseBoolIntDto13 == null ? 0 : baseBoolIntDto13.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto14 = this.blacklistedByMe;
        int hashCode92 = (hashCode91 + (baseBoolIntDto14 == null ? 0 : baseBoolIntDto14.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto15 = this.isFavorite;
        int hashCode93 = (hashCode92 + (baseBoolIntDto15 == null ? 0 : baseBoolIntDto15.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto16 = this.isHiddenFromFeed;
        int hashCode94 = (hashCode93 + (baseBoolIntDto16 == null ? 0 : baseBoolIntDto16.hashCode())) * 31;
        Integer num6 = this.commonCount;
        int hashCode95 = (hashCode94 + (num6 == null ? 0 : num6.hashCode())) * 31;
        UsersOccupationDto usersOccupationDto = this.occupation;
        int hashCode96 = (hashCode95 + (usersOccupationDto == null ? 0 : usersOccupationDto.hashCode())) * 31;
        List<UsersCareerDto> list = this.career;
        int hashCode97 = (hashCode96 + (list == null ? 0 : list.hashCode())) * 31;
        List<UsersMilitaryDto> list2 = this.military;
        int hashCode98 = (hashCode97 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num7 = this.university;
        int hashCode99 = (hashCode98 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str53 = this.universityName;
        int hashCode100 = (hashCode99 + (str53 == null ? 0 : str53.hashCode())) * 31;
        Integer num8 = this.universityGroupId;
        int hashCode101 = (hashCode100 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.faculty;
        int hashCode102 = (hashCode101 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str54 = this.facultyName;
        int hashCode103 = (hashCode102 + (str54 == null ? 0 : str54.hashCode())) * 31;
        Integer num10 = this.graduation;
        int hashCode104 = (hashCode103 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str55 = this.educationForm;
        int hashCode105 = (hashCode104 + (str55 == null ? 0 : str55.hashCode())) * 31;
        String str56 = this.educationStatus;
        int hashCode106 = (hashCode105 + (str56 == null ? 0 : str56.hashCode())) * 31;
        String str57 = this.homeTown;
        int hashCode107 = (hashCode106 + (str57 == null ? 0 : str57.hashCode())) * 31;
        UsersUserRelationDto usersUserRelationDto = this.relation;
        int hashCode108 = (hashCode107 + (usersUserRelationDto == null ? 0 : usersUserRelationDto.hashCode())) * 31;
        UsersUserMinDto usersUserMinDto = this.relationPartner;
        int hashCode109 = (hashCode108 + (usersUserMinDto == null ? 0 : usersUserMinDto.hashCode())) * 31;
        UsersPersonalDto usersPersonalDto = this.personal;
        int hashCode110 = (hashCode109 + (usersPersonalDto == null ? 0 : usersPersonalDto.hashCode())) * 31;
        List<UsersUniversityDto> list3 = this.universities;
        int hashCode111 = (hashCode110 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<UsersSchoolDto> list4 = this.schools;
        int hashCode112 = (hashCode111 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<UsersRelativeDto> list5 = this.relatives;
        int hashCode113 = (hashCode112 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Boolean bool8 = this.isSubscribedPodcasts;
        int hashCode114 = (hashCode113 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.canSubscribePodcasts;
        int hashCode115 = (hashCode114 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.canSubscribePosts;
        int hashCode116 = (hashCode115 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        UsersUserCountersDto usersUserCountersDto = this.counters;
        int hashCode117 = (hashCode116 + (usersUserCountersDto == null ? 0 : usersUserCountersDto.hashCode())) * 31;
        String str58 = this.accessKey;
        int hashCode118 = (hashCode117 + (str58 == null ? 0 : str58.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto17 = this.canUploadDoc;
        int hashCode119 = (hashCode118 + (baseBoolIntDto17 == null ? 0 : baseBoolIntDto17.hashCode())) * 31;
        Boolean bool11 = this.canBan;
        int hashCode120 = (hashCode119 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        String str59 = this.hash;
        int hashCode121 = (hashCode120 + (str59 == null ? 0 : str59.hashCode())) * 31;
        Boolean bool12 = this.isNoIndex;
        int hashCode122 = (hashCode121 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Integer num11 = this.contactId;
        int hashCode123 = (hashCode122 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Boolean bool13 = this.isMessageRequest;
        int hashCode124 = (hashCode123 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        List<String> list6 = this.descriptions;
        int hashCode125 = (hashCode124 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<Integer> list7 = this.lists;
        int hashCode126 = (hashCode125 + (list7 == null ? 0 : list7.hashCode())) * 31;
        BaseSexDto baseSexDto = this.sex;
        int hashCode127 = (hashCode126 + (baseSexDto == null ? 0 : baseSexDto.hashCode())) * 31;
        String str60 = this.screenName;
        int hashCode128 = (hashCode127 + (str60 == null ? 0 : str60.hashCode())) * 31;
        String str61 = this.photo50;
        int hashCode129 = (hashCode128 + (str61 == null ? 0 : str61.hashCode())) * 31;
        String str62 = this.photo100;
        int hashCode130 = (hashCode129 + (str62 == null ? 0 : str62.hashCode())) * 31;
        UsersOnlineInfoDto usersOnlineInfoDto = this.onlineInfo;
        int hashCode131 = (hashCode130 + (usersOnlineInfoDto == null ? 0 : usersOnlineInfoDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto18 = this.online;
        int hashCode132 = (hashCode131 + (baseBoolIntDto18 == null ? 0 : baseBoolIntDto18.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto19 = this.onlineMobile;
        int hashCode133 = (hashCode132 + (baseBoolIntDto19 == null ? 0 : baseBoolIntDto19.hashCode())) * 31;
        Integer num12 = this.onlineApp;
        int hashCode134 = (hashCode133 + (num12 == null ? 0 : num12.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto20 = this.verified;
        int hashCode135 = (hashCode134 + (baseBoolIntDto20 == null ? 0 : baseBoolIntDto20.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto21 = this.trending;
        int hashCode136 = (hashCode135 + (baseBoolIntDto21 == null ? 0 : baseBoolIntDto21.hashCode())) * 31;
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto = this.friendStatus;
        int hashCode137 = (hashCode136 + (friendsFriendStatusStatusDto == null ? 0 : friendsFriendStatusStatusDto.hashCode())) * 31;
        FriendsRequestsMutualDto friendsRequestsMutualDto = this.mutual;
        int hashCode138 = (hashCode137 + (friendsRequestsMutualDto == null ? 0 : friendsRequestsMutualDto.hashCode())) * 31;
        String str63 = this.deactivated;
        int hashCode139 = (hashCode138 + (str63 == null ? 0 : str63.hashCode())) * 31;
        String str64 = this.firstName;
        int hashCode140 = (hashCode139 + (str64 == null ? 0 : str64.hashCode())) * 31;
        Integer num13 = this.hidden;
        int hashCode141 = (hashCode140 + (num13 == null ? 0 : num13.hashCode())) * 31;
        String str65 = this.lastName;
        int hashCode142 = (hashCode141 + (str65 == null ? 0 : str65.hashCode())) * 31;
        Boolean bool14 = this.canAccessClosed;
        int hashCode143 = (hashCode142 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.isClosed;
        return hashCode143 + (bool15 != null ? bool15.hashCode() : 0);
    }

    public final String toString() {
        UserId userId = this.id;
        String str = this.firstNameNom;
        String str2 = this.firstNameGen;
        String str3 = this.firstNameDat;
        String str4 = this.firstNameAcc;
        String str5 = this.firstNameIns;
        String str6 = this.firstNameAbl;
        String str7 = this.lastNameNom;
        String str8 = this.lastNameGen;
        String str9 = this.lastNameDat;
        String str10 = this.lastNameAcc;
        String str11 = this.lastNameIns;
        String str12 = this.lastNameAbl;
        String str13 = this.nickname;
        String str14 = this.maidenName;
        String str15 = this.contactName;
        String str16 = this.domain;
        String str17 = this.bdate;
        BaseCityDto baseCityDto = this.city;
        BaseCountryDto baseCountryDto = this.country;
        Float f = this.timezone;
        OwnerStateDto ownerStateDto = this.ownerState;
        String str18 = this.photo200;
        String str19 = this.photoMax;
        String str20 = this.photo200Orig;
        String str21 = this.photo400Orig;
        String str22 = this.photoMaxOrig;
        String str23 = this.photoId;
        BaseBoolIntDto baseBoolIntDto = this.hasPhoto;
        BaseBoolIntDto baseBoolIntDto2 = this.hasMobile;
        BaseBoolIntDto baseBoolIntDto3 = this.isFriend;
        Boolean bool = this.isBestFriend;
        BaseBoolIntDto baseBoolIntDto4 = this.wallComments;
        BaseBoolIntDto baseBoolIntDto5 = this.canPost;
        BaseBoolIntDto baseBoolIntDto6 = this.canSeeAllPosts;
        BaseBoolIntDto baseBoolIntDto7 = this.canSeeAudio;
        UsersUserTypeDto usersUserTypeDto = this.type;
        String str24 = this.email;
        String str25 = this.skype;
        String str26 = this.facebook;
        String str27 = this.facebookName;
        String str28 = this.twitter;
        String str29 = this.livejournal;
        String str30 = this.instagram;
        BaseBoolIntDto baseBoolIntDto8 = this.test;
        VideoLiveInfoDto videoLiveInfoDto = this.videoLive;
        BaseBoolIntDto baseBoolIntDto9 = this.isVideoLiveNotificationsBlocked;
        Boolean bool2 = this.isService;
        String str31 = this.serviceDescription;
        String str32 = this.photoRec;
        String str33 = this.photoMedium;
        String str34 = this.photoMediumRec;
        String str35 = this.photo;
        String str36 = this.photoBig;
        String str37 = this.photo400;
        PhotosPhotoDto photosPhotoDto = this.photoMaxSize;
        String str38 = this.language;
        Integer num = this.storiesArchiveCount;
        Boolean bool3 = this.hasUnseenStories;
        WallDefaultDto wallDefaultDto = this.wallDefault;
        Boolean bool4 = this.canCall;
        Boolean bool5 = this.canCallFromGroup;
        Boolean bool6 = this.canSeeWishes;
        BaseBoolIntDto baseBoolIntDto10 = this.canSeeGifts;
        String str39 = this.interests;
        String str40 = this.books;
        String str41 = this.tv;
        String str42 = this.quotes;
        String str43 = this.about;
        String str44 = this.games;
        String str45 = this.movies;
        String str46 = this.activities;
        String str47 = this.music;
        BaseBoolIntDto baseBoolIntDto11 = this.canWritePrivateMessage;
        BaseBoolIntDto baseBoolIntDto12 = this.canSendFriendRequest;
        Boolean bool7 = this.canBeInvitedGroup;
        String str48 = this.mobilePhone;
        String str49 = this.homePhone;
        String str50 = this.site;
        AudioAudioDto audioAudioDto = this.statusAudio;
        String str51 = this.status;
        String str52 = this.activity;
        AppsAppMinDto appsAppMinDto = this.statusApp;
        UsersLastSeenDto usersLastSeenDto = this.lastSeen;
        UsersExportsDto usersExportsDto = this.exports;
        BaseCropPhotoDto baseCropPhotoDto = this.cropPhoto;
        Integer num2 = this.followersCount;
        Integer num3 = this.videoLiveLevel;
        Integer num4 = this.videoLiveCount;
        Integer num5 = this.clipsCount;
        BaseBoolIntDto baseBoolIntDto13 = this.blacklisted;
        BaseBoolIntDto baseBoolIntDto14 = this.blacklistedByMe;
        BaseBoolIntDto baseBoolIntDto15 = this.isFavorite;
        BaseBoolIntDto baseBoolIntDto16 = this.isHiddenFromFeed;
        Integer num6 = this.commonCount;
        UsersOccupationDto usersOccupationDto = this.occupation;
        List<UsersCareerDto> list = this.career;
        List<UsersMilitaryDto> list2 = this.military;
        Integer num7 = this.university;
        String str53 = this.universityName;
        Integer num8 = this.universityGroupId;
        Integer num9 = this.faculty;
        String str54 = this.facultyName;
        Integer num10 = this.graduation;
        String str55 = this.educationForm;
        String str56 = this.educationStatus;
        String str57 = this.homeTown;
        UsersUserRelationDto usersUserRelationDto = this.relation;
        UsersUserMinDto usersUserMinDto = this.relationPartner;
        UsersPersonalDto usersPersonalDto = this.personal;
        List<UsersUniversityDto> list3 = this.universities;
        List<UsersSchoolDto> list4 = this.schools;
        List<UsersRelativeDto> list5 = this.relatives;
        Boolean bool8 = this.isSubscribedPodcasts;
        Boolean bool9 = this.canSubscribePodcasts;
        Boolean bool10 = this.canSubscribePosts;
        UsersUserCountersDto usersUserCountersDto = this.counters;
        String str58 = this.accessKey;
        BaseBoolIntDto baseBoolIntDto17 = this.canUploadDoc;
        Boolean bool11 = this.canBan;
        String str59 = this.hash;
        Boolean bool12 = this.isNoIndex;
        Integer num11 = this.contactId;
        Boolean bool13 = this.isMessageRequest;
        List<String> list6 = this.descriptions;
        List<Integer> list7 = this.lists;
        BaseSexDto baseSexDto = this.sex;
        String str60 = this.screenName;
        String str61 = this.photo50;
        String str62 = this.photo100;
        UsersOnlineInfoDto usersOnlineInfoDto = this.onlineInfo;
        BaseBoolIntDto baseBoolIntDto18 = this.online;
        BaseBoolIntDto baseBoolIntDto19 = this.onlineMobile;
        Integer num12 = this.onlineApp;
        BaseBoolIntDto baseBoolIntDto20 = this.verified;
        BaseBoolIntDto baseBoolIntDto21 = this.trending;
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto = this.friendStatus;
        FriendsRequestsMutualDto friendsRequestsMutualDto = this.mutual;
        String str63 = this.deactivated;
        String str64 = this.firstName;
        Integer num13 = this.hidden;
        String str65 = this.lastName;
        Boolean bool14 = this.canAccessClosed;
        Boolean bool15 = this.isClosed;
        StringBuilder sb = new StringBuilder("UsersUserFullDto(id=");
        sb.append(userId);
        sb.append(", firstNameNom=");
        sb.append(str);
        sb.append(", firstNameGen=");
        n6j.b(sb, str2, ", firstNameDat=", str3, ", firstNameAcc=");
        n6j.b(sb, str4, ", firstNameIns=", str5, ", firstNameAbl=");
        n6j.b(sb, str6, ", lastNameNom=", str7, ", lastNameGen=");
        n6j.b(sb, str8, ", lastNameDat=", str9, ", lastNameAcc=");
        n6j.b(sb, str10, ", lastNameIns=", str11, ", lastNameAbl=");
        n6j.b(sb, str12, ", nickname=", str13, ", maidenName=");
        n6j.b(sb, str14, ", contactName=", str15, ", domain=");
        n6j.b(sb, str16, ", bdate=", str17, ", city=");
        sb.append(baseCityDto);
        sb.append(", country=");
        sb.append(baseCountryDto);
        sb.append(", timezone=");
        sb.append(f);
        sb.append(", ownerState=");
        sb.append(ownerStateDto);
        sb.append(", photo200=");
        n6j.b(sb, str18, ", photoMax=", str19, ", photo200Orig=");
        n6j.b(sb, str20, ", photo400Orig=", str21, ", photoMaxOrig=");
        n6j.b(sb, str22, ", photoId=", str23, ", hasPhoto=");
        to.b(sb, baseBoolIntDto, ", hasMobile=", baseBoolIntDto2, ", isFriend=");
        sb.append(baseBoolIntDto3);
        sb.append(", isBestFriend=");
        sb.append(bool);
        sb.append(", wallComments=");
        to.b(sb, baseBoolIntDto4, ", canPost=", baseBoolIntDto5, ", canSeeAllPosts=");
        to.b(sb, baseBoolIntDto6, ", canSeeAudio=", baseBoolIntDto7, ", type=");
        sb.append(usersUserTypeDto);
        sb.append(", email=");
        sb.append(str24);
        sb.append(", skype=");
        n6j.b(sb, str25, ", facebook=", str26, ", facebookName=");
        n6j.b(sb, str27, ", twitter=", str28, ", livejournal=");
        n6j.b(sb, str29, ", instagram=", str30, ", test=");
        sb.append(baseBoolIntDto8);
        sb.append(", videoLive=");
        sb.append(videoLiveInfoDto);
        sb.append(", isVideoLiveNotificationsBlocked=");
        sb.append(baseBoolIntDto9);
        sb.append(", isService=");
        sb.append(bool2);
        sb.append(", serviceDescription=");
        n6j.b(sb, str31, ", photoRec=", str32, ", photoMedium=");
        n6j.b(sb, str33, ", photoMediumRec=", str34, ", photo=");
        n6j.b(sb, str35, ", photoBig=", str36, ", photo400=");
        sb.append(str37);
        sb.append(", photoMaxSize=");
        sb.append(photosPhotoDto);
        sb.append(", language=");
        kr.b(num, str38, ", storiesArchiveCount=", ", hasUnseenStories=", sb);
        sb.append(bool3);
        sb.append(", wallDefault=");
        sb.append(wallDefaultDto);
        sb.append(", canCall=");
        tq.i(sb, bool4, ", canCallFromGroup=", bool5, ", canSeeWishes=");
        sb.append(bool6);
        sb.append(", canSeeGifts=");
        sb.append(baseBoolIntDto10);
        sb.append(", interests=");
        n6j.b(sb, str39, ", books=", str40, ", tv=");
        n6j.b(sb, str41, ", quotes=", str42, ", about=");
        n6j.b(sb, str43, ", games=", str44, ", movies=");
        n6j.b(sb, str45, ", activities=", str46, ", music=");
        sb.append(str47);
        sb.append(", canWritePrivateMessage=");
        sb.append(baseBoolIntDto11);
        sb.append(", canSendFriendRequest=");
        sb.append(baseBoolIntDto12);
        sb.append(", canBeInvitedGroup=");
        sb.append(bool7);
        sb.append(", mobilePhone=");
        n6j.b(sb, str48, ", homePhone=", str49, ", site=");
        sb.append(str50);
        sb.append(", statusAudio=");
        sb.append(audioAudioDto);
        sb.append(", status=");
        n6j.b(sb, str51, ", activity=", str52, ", statusApp=");
        sb.append(appsAppMinDto);
        sb.append(", lastSeen=");
        sb.append(usersLastSeenDto);
        sb.append(", exports=");
        sb.append(usersExportsDto);
        sb.append(", cropPhoto=");
        sb.append(baseCropPhotoDto);
        sb.append(", followersCount=");
        sq.b(sb, num2, ", videoLiveLevel=", num3, ", videoLiveCount=");
        sq.b(sb, num4, ", clipsCount=", num5, ", blacklisted=");
        to.b(sb, baseBoolIntDto13, ", blacklistedByMe=", baseBoolIntDto14, ", isFavorite=");
        to.b(sb, baseBoolIntDto15, ", isHiddenFromFeed=", baseBoolIntDto16, ", commonCount=");
        sb.append(num6);
        sb.append(", occupation=");
        sb.append(usersOccupationDto);
        sb.append(", career=");
        vq.d(sb, list, ", military=", list2, ", university=");
        mq.b(num7, ", universityName=", str53, ", universityGroupId=", sb);
        sq.b(sb, num8, ", faculty=", num9, ", facultyName=");
        kr.b(num10, str54, ", graduation=", ", educationForm=", sb);
        n6j.b(sb, str55, ", educationStatus=", str56, ", homeTown=");
        sb.append(str57);
        sb.append(", relation=");
        sb.append(usersUserRelationDto);
        sb.append(", relationPartner=");
        sb.append(usersUserMinDto);
        sb.append(", personal=");
        sb.append(usersPersonalDto);
        sb.append(", universities=");
        vq.d(sb, list3, ", schools=", list4, ", relatives=");
        sb.append(list5);
        sb.append(", isSubscribedPodcasts=");
        sb.append(bool8);
        sb.append(", canSubscribePodcasts=");
        tq.i(sb, bool9, ", canSubscribePosts=", bool10, ", counters=");
        sb.append(usersUserCountersDto);
        sb.append(", accessKey=");
        sb.append(str58);
        sb.append(", canUploadDoc=");
        sb.append(baseBoolIntDto17);
        sb.append(", canBan=");
        sb.append(bool11);
        sb.append(", hash=");
        uq.c(bool12, str59, ", isNoIndex=", ", contactId=", sb);
        rq.h(sb, num11, ", isMessageRequest=", bool13, ", descriptions=");
        vq.d(sb, list6, ", lists=", list7, ", sex=");
        sb.append(baseSexDto);
        sb.append(", screenName=");
        sb.append(str60);
        sb.append(", photo50=");
        n6j.b(sb, str61, ", photo100=", str62, ", onlineInfo=");
        sb.append(usersOnlineInfoDto);
        sb.append(", online=");
        sb.append(baseBoolIntDto18);
        sb.append(", onlineMobile=");
        sb.append(baseBoolIntDto19);
        sb.append(", onlineApp=");
        sb.append(num12);
        sb.append(", verified=");
        to.b(sb, baseBoolIntDto20, ", trending=", baseBoolIntDto21, ", friendStatus=");
        sb.append(friendsFriendStatusStatusDto);
        sb.append(", mutual=");
        sb.append(friendsRequestsMutualDto);
        sb.append(", deactivated=");
        n6j.b(sb, str63, ", firstName=", str64, ", hidden=");
        mq.b(num13, ", lastName=", str65, ", canAccessClosed=", sb);
        sb.append(bool14);
        sb.append(", isClosed=");
        sb.append(bool15);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ UsersUserFullDto(UserId userId, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, Float f, OwnerStateDto ownerStateDto, String str18, String str19, String str20, String str21, String str22, String str23, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Boolean bool, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, UsersUserTypeDto usersUserTypeDto, String str24, String str25, String str26, String str27, String str28, String str29, String str30, BaseBoolIntDto baseBoolIntDto8, VideoLiveInfoDto videoLiveInfoDto, BaseBoolIntDto baseBoolIntDto9, Boolean bool2, String str31, String str32, String str33, String str34, String str35, String str36, String str37, PhotosPhotoDto photosPhotoDto, String str38, Integer num, Boolean bool3, WallDefaultDto wallDefaultDto, Boolean bool4, Boolean bool5, Boolean bool6, BaseBoolIntDto baseBoolIntDto10, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, BaseBoolIntDto baseBoolIntDto11, BaseBoolIntDto baseBoolIntDto12, Boolean bool7, String str48, String str49, String str50, AudioAudioDto audioAudioDto, String str51, String str52, AppsAppMinDto appsAppMinDto, UsersLastSeenDto usersLastSeenDto, UsersExportsDto usersExportsDto, BaseCropPhotoDto baseCropPhotoDto, Integer num2, Integer num3, Integer num4, Integer num5, BaseBoolIntDto baseBoolIntDto13, BaseBoolIntDto baseBoolIntDto14, BaseBoolIntDto baseBoolIntDto15, BaseBoolIntDto baseBoolIntDto16, Integer num6, UsersOccupationDto usersOccupationDto, List list, List list2, Integer num7, String str53, Integer num8, Integer num9, String str54, Integer num10, String str55, String str56, String str57, UsersUserRelationDto usersUserRelationDto, UsersUserMinDto usersUserMinDto, UsersPersonalDto usersPersonalDto, List list3, List list4, List list5, Boolean bool8, Boolean bool9, Boolean bool10, UsersUserCountersDto usersUserCountersDto, String str58, BaseBoolIntDto baseBoolIntDto17, Boolean bool11, String str59, Boolean bool12, Integer num11, Boolean bool13, List list6, List list7, BaseSexDto baseSexDto, String str60, String str61, String str62, UsersOnlineInfoDto usersOnlineInfoDto, BaseBoolIntDto baseBoolIntDto18, BaseBoolIntDto baseBoolIntDto19, Integer num12, BaseBoolIntDto baseBoolIntDto20, BaseBoolIntDto baseBoolIntDto21, FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, FriendsRequestsMutualDto friendsRequestsMutualDto, String str63, String str64, Integer num13, String str65, Boolean bool14, Boolean bool15, int i, int i2, int i3, int i4, int i5, zcl zclVar) {
        this(userId, r111, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147, r148, r149, r150, r151, r152, r153, r154, r155, r156, r157, r158, r159, r160, r161, r162, r163, r164, r165, r166, r167, r168, r169, r170, r171, r172, r173, r174, r175, r176, r177, r178, r179, r180, r181, r182, r183, r184, r185, r186, r187, r188, r189, r190, r191, r192, r193, r194, r195, r196, r197, r198, r199, r200, r201, r202, r203, r204, r205, r206, r207, r208, r209, r210, r211, r212, r213, r214, r215, r216, r217, r218, r219, r220, r221, r222, r223, r224, r225, r226, r227, r228, r229, r230, r231, r232, r233, r234, r235, r236, r237, r238, r239, r240, r241, r242, r243, r244, r245, r246, r247, r248, r249, r250, r251, r252, r253, r254, r255);
        Boolean bool16;
        String str66;
        String str67;
        String str68;
        String str69;
        String str70;
        BaseBoolIntDto baseBoolIntDto22;
        VideoLiveInfoDto videoLiveInfoDto2;
        BaseBoolIntDto baseBoolIntDto23;
        String str71;
        String str72;
        BaseBoolIntDto baseBoolIntDto24;
        BaseBoolIntDto baseBoolIntDto25;
        Boolean bool17;
        String str73;
        String str74;
        String str75;
        Integer num14;
        String str76;
        String str77;
        String str78;
        UsersUserRelationDto usersUserRelationDto2;
        UsersUserMinDto usersUserMinDto2;
        UsersPersonalDto usersPersonalDto2;
        List list8;
        BaseBoolIntDto baseBoolIntDto26;
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto2;
        FriendsRequestsMutualDto friendsRequestsMutualDto2;
        String str79;
        String str80;
        Integer num15;
        Boolean bool18;
        BaseBoolIntDto baseBoolIntDto27;
        UsersOccupationDto usersOccupationDto2;
        String str81;
        String str82;
        String str83;
        String str84;
        String str85;
        String str86;
        String str87;
        String str88;
        String str89;
        String str90;
        String str91;
        String str92;
        List list9;
        String str93;
        Boolean bool19;
        String str94;
        Boolean bool20;
        BaseCityDto baseCityDto2;
        Boolean bool21;
        BaseCountryDto baseCountryDto2;
        UsersUserCountersDto usersUserCountersDto2;
        Float f2;
        String str95;
        OwnerStateDto ownerStateDto2;
        String str96;
        String str97;
        String str98;
        String str99;
        String str100;
        String str101;
        BaseBoolIntDto baseBoolIntDto28;
        BaseBoolIntDto baseBoolIntDto29;
        BaseBoolIntDto baseBoolIntDto30;
        BaseBoolIntDto baseBoolIntDto31;
        BaseBoolIntDto baseBoolIntDto32;
        BaseBoolIntDto baseBoolIntDto33;
        UsersUserTypeDto usersUserTypeDto2;
        String str102;
        String str103;
        Boolean bool22;
        String str104;
        String str105;
        String str106;
        String str107;
        String str108;
        String str109;
        String str110;
        PhotosPhotoDto photosPhotoDto2;
        String str111;
        Integer num16;
        Boolean bool23;
        WallDefaultDto wallDefaultDto2;
        Boolean bool24;
        Boolean bool25;
        Boolean bool26;
        String str112;
        String str113;
        String str114;
        String str115;
        String str116;
        String str117;
        String str118;
        AudioAudioDto audioAudioDto2;
        String str119;
        String str120;
        AppsAppMinDto appsAppMinDto2;
        UsersLastSeenDto usersLastSeenDto2;
        UsersExportsDto usersExportsDto2;
        BaseCropPhotoDto baseCropPhotoDto2;
        Integer num17;
        Integer num18;
        Integer num19;
        Integer num20;
        BaseBoolIntDto baseBoolIntDto34;
        BaseBoolIntDto baseBoolIntDto35;
        BaseBoolIntDto baseBoolIntDto36;
        BaseBoolIntDto baseBoolIntDto37;
        Integer num21;
        List list10;
        List list11;
        Integer num22;
        String str121;
        Integer num23;
        Integer num24;
        String str122;
        List list12;
        BaseBoolIntDto baseBoolIntDto38;
        Boolean bool27;
        String str123;
        Boolean bool28;
        Integer num25;
        Boolean bool29;
        List list13;
        List list14;
        BaseSexDto baseSexDto2;
        String str124;
        String str125;
        UsersOnlineInfoDto usersOnlineInfoDto2;
        BaseBoolIntDto baseBoolIntDto39;
        BaseBoolIntDto baseBoolIntDto40;
        Integer num26;
        BaseBoolIntDto baseBoolIntDto41;
        String str126;
        String str127;
        Boolean bool30;
        String str128;
        String str129;
        BaseBoolIntDto baseBoolIntDto42;
        String str130 = (i & 2) != 0 ? null : str;
        String str131 = (i & 4) != 0 ? null : str2;
        String str132 = (i & 8) != 0 ? null : str3;
        String str133 = (i & 16) != 0 ? null : str4;
        String str134 = (i & 32) != 0 ? null : str5;
        String str135 = (i & 64) != 0 ? null : str6;
        String str136 = (i & 128) != 0 ? null : str7;
        String str137 = (i & 256) != 0 ? null : str8;
        String str138 = (i & 512) != 0 ? null : str9;
        String str139 = (i & 1024) != 0 ? null : str10;
        String str140 = (i & 2048) != 0 ? null : str11;
        String str141 = str130;
        String str142 = (i & 4096) != 0 ? null : str12;
        String str143 = (i & 8192) != 0 ? null : str13;
        String str144 = (i & 16384) != 0 ? null : str14;
        String str145 = (i & 32768) != 0 ? null : str15;
        String str146 = (i & 65536) != 0 ? null : str16;
        String str147 = (i & 131072) != 0 ? null : str17;
        BaseCityDto baseCityDto3 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : baseCityDto;
        BaseCountryDto baseCountryDto3 = (i & 524288) != 0 ? null : baseCountryDto;
        Float f3 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : f;
        OwnerStateDto ownerStateDto3 = (i & 2097152) != 0 ? null : ownerStateDto;
        String str148 = (i & 4194304) != 0 ? null : str18;
        String str149 = (i & 8388608) != 0 ? null : str19;
        String str150 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str20;
        String str151 = (i & 33554432) != 0 ? null : str21;
        String str152 = (i & 67108864) != 0 ? null : str22;
        String str153 = (i & 134217728) != 0 ? null : str23;
        BaseBoolIntDto baseBoolIntDto43 = (i & 268435456) != 0 ? null : baseBoolIntDto;
        BaseBoolIntDto baseBoolIntDto44 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : baseBoolIntDto2;
        BaseBoolIntDto baseBoolIntDto45 = (i & 1073741824) != 0 ? null : baseBoolIntDto3;
        Boolean bool31 = (i & Integer.MIN_VALUE) != 0 ? null : bool;
        BaseBoolIntDto baseBoolIntDto46 = (i2 & 1) != 0 ? null : baseBoolIntDto4;
        BaseBoolIntDto baseBoolIntDto47 = (i2 & 2) != 0 ? null : baseBoolIntDto5;
        BaseBoolIntDto baseBoolIntDto48 = (i2 & 4) != 0 ? null : baseBoolIntDto6;
        BaseBoolIntDto baseBoolIntDto49 = (i2 & 8) != 0 ? null : baseBoolIntDto7;
        UsersUserTypeDto usersUserTypeDto3 = (i2 & 16) != 0 ? null : usersUserTypeDto;
        String str154 = (i2 & 32) != 0 ? null : str24;
        String str155 = (i2 & 64) != 0 ? null : str25;
        Boolean bool32 = bool31;
        String str156 = (i2 & 128) != 0 ? null : str26;
        String str157 = (i2 & 256) != 0 ? null : str27;
        String str158 = (i2 & 512) != 0 ? null : str28;
        String str159 = (i2 & 1024) != 0 ? null : str29;
        String str160 = (i2 & 2048) != 0 ? null : str30;
        BaseBoolIntDto baseBoolIntDto50 = (i2 & 4096) != 0 ? null : baseBoolIntDto8;
        VideoLiveInfoDto videoLiveInfoDto3 = (i2 & 8192) != 0 ? null : videoLiveInfoDto;
        BaseBoolIntDto baseBoolIntDto51 = (i2 & 16384) != 0 ? null : baseBoolIntDto9;
        Boolean bool33 = (i2 & 32768) != 0 ? null : bool2;
        String str161 = (i2 & 65536) != 0 ? null : str31;
        String str162 = (i2 & 131072) != 0 ? null : str32;
        String str163 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str33;
        String str164 = (i2 & 524288) != 0 ? null : str34;
        String str165 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str35;
        String str166 = (i2 & 2097152) != 0 ? null : str36;
        String str167 = (i2 & 4194304) != 0 ? null : str37;
        PhotosPhotoDto photosPhotoDto3 = (i2 & 8388608) != 0 ? null : photosPhotoDto;
        String str168 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str38;
        Integer num27 = (i2 & 33554432) != 0 ? null : num;
        Boolean bool34 = (i2 & 67108864) != 0 ? null : bool3;
        WallDefaultDto wallDefaultDto3 = (i2 & 134217728) != 0 ? null : wallDefaultDto;
        Boolean bool35 = (i2 & 268435456) != 0 ? null : bool4;
        Boolean bool36 = (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool5;
        Boolean bool37 = (i2 & 1073741824) != 0 ? null : bool6;
        BaseBoolIntDto baseBoolIntDto52 = (i2 & Integer.MIN_VALUE) != 0 ? null : baseBoolIntDto10;
        String str169 = (i3 & 1) != 0 ? null : str39;
        String str170 = (i3 & 2) != 0 ? null : str40;
        String str171 = (i3 & 4) != 0 ? null : str41;
        String str172 = (i3 & 8) != 0 ? null : str42;
        String str173 = (i3 & 16) != 0 ? null : str43;
        String str174 = (i3 & 32) != 0 ? null : str44;
        String str175 = (i3 & 64) != 0 ? null : str45;
        BaseBoolIntDto baseBoolIntDto53 = baseBoolIntDto51;
        String str176 = (i3 & 128) != 0 ? null : str46;
        String str177 = (i3 & 256) != 0 ? null : str47;
        BaseBoolIntDto baseBoolIntDto54 = (i3 & 512) != 0 ? null : baseBoolIntDto11;
        BaseBoolIntDto baseBoolIntDto55 = (i3 & 1024) != 0 ? null : baseBoolIntDto12;
        Boolean bool38 = (i3 & 2048) != 0 ? null : bool7;
        String str178 = (i3 & 4096) != 0 ? null : str48;
        String str179 = (i3 & 8192) != 0 ? null : str49;
        String str180 = (i3 & 16384) != 0 ? null : str50;
        AudioAudioDto audioAudioDto3 = (i3 & 32768) != 0 ? null : audioAudioDto;
        String str181 = (i3 & 65536) != 0 ? null : str51;
        String str182 = (i3 & 131072) != 0 ? null : str52;
        AppsAppMinDto appsAppMinDto3 = (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : appsAppMinDto;
        UsersLastSeenDto usersLastSeenDto3 = (i3 & 524288) != 0 ? null : usersLastSeenDto;
        UsersExportsDto usersExportsDto3 = (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : usersExportsDto;
        BaseCropPhotoDto baseCropPhotoDto3 = (i3 & 2097152) != 0 ? null : baseCropPhotoDto;
        Integer num28 = (i3 & 4194304) != 0 ? null : num2;
        Integer num29 = (i3 & 8388608) != 0 ? null : num3;
        Integer num30 = (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : num4;
        Integer num31 = (i3 & 33554432) != 0 ? null : num5;
        BaseBoolIntDto baseBoolIntDto56 = (i3 & 67108864) != 0 ? null : baseBoolIntDto13;
        BaseBoolIntDto baseBoolIntDto57 = (i3 & 134217728) != 0 ? null : baseBoolIntDto14;
        BaseBoolIntDto baseBoolIntDto58 = (i3 & 268435456) != 0 ? null : baseBoolIntDto15;
        BaseBoolIntDto baseBoolIntDto59 = (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : baseBoolIntDto16;
        Integer num32 = (i3 & 1073741824) != 0 ? null : num6;
        UsersOccupationDto usersOccupationDto3 = (i3 & Integer.MIN_VALUE) != 0 ? null : usersOccupationDto;
        List list15 = (i4 & 1) != 0 ? null : list;
        List list16 = (i4 & 2) != 0 ? null : list2;
        Integer num33 = (i4 & 4) != 0 ? null : num7;
        String str183 = (i4 & 8) != 0 ? null : str53;
        Integer num34 = (i4 & 16) != 0 ? null : num8;
        Integer num35 = (i4 & 32) != 0 ? null : num9;
        String str184 = (i4 & 64) != 0 ? null : str54;
        String str185 = str180;
        Integer num36 = (i4 & 128) != 0 ? null : num10;
        String str186 = (i4 & 256) != 0 ? null : str55;
        String str187 = (i4 & 512) != 0 ? null : str56;
        String str188 = (i4 & 1024) != 0 ? null : str57;
        UsersUserRelationDto usersUserRelationDto3 = (i4 & 2048) != 0 ? null : usersUserRelationDto;
        UsersUserMinDto usersUserMinDto3 = (i4 & 4096) != 0 ? null : usersUserMinDto;
        UsersPersonalDto usersPersonalDto3 = (i4 & 8192) != 0 ? null : usersPersonalDto;
        List list17 = (i4 & 16384) != 0 ? null : list3;
        List list18 = (i4 & 32768) != 0 ? null : list4;
        List list19 = (i4 & 65536) != 0 ? null : list5;
        Boolean bool39 = (i4 & 131072) != 0 ? null : bool8;
        Boolean bool40 = (i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool9;
        Boolean bool41 = (i4 & 524288) != 0 ? null : bool10;
        UsersUserCountersDto usersUserCountersDto3 = (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : usersUserCountersDto;
        String str189 = (i4 & 2097152) != 0 ? null : str58;
        BaseBoolIntDto baseBoolIntDto60 = (i4 & 4194304) != 0 ? null : baseBoolIntDto17;
        Boolean bool42 = (i4 & 8388608) != 0 ? null : bool11;
        String str190 = (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str59;
        Boolean bool43 = (i4 & 33554432) != 0 ? null : bool12;
        Integer num37 = (i4 & 67108864) != 0 ? null : num11;
        Boolean bool44 = (i4 & 134217728) != 0 ? null : bool13;
        List list20 = (i4 & 268435456) != 0 ? null : list6;
        List list21 = (i4 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : list7;
        BaseSexDto baseSexDto3 = (i4 & 1073741824) != 0 ? null : baseSexDto;
        String str191 = (i4 & Integer.MIN_VALUE) != 0 ? null : str60;
        String str192 = (i5 & 1) != 0 ? null : str61;
        String str193 = (i5 & 2) != 0 ? null : str62;
        UsersOnlineInfoDto usersOnlineInfoDto3 = (i5 & 4) != 0 ? null : usersOnlineInfoDto;
        BaseBoolIntDto baseBoolIntDto61 = (i5 & 8) != 0 ? null : baseBoolIntDto18;
        BaseBoolIntDto baseBoolIntDto62 = (i5 & 16) != 0 ? null : baseBoolIntDto19;
        Integer num38 = (i5 & 32) != 0 ? null : num12;
        BaseBoolIntDto baseBoolIntDto63 = (i5 & 64) != 0 ? null : baseBoolIntDto20;
        List list22 = list17;
        BaseBoolIntDto baseBoolIntDto64 = (i5 & 128) != 0 ? null : baseBoolIntDto21;
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto3 = (i5 & 256) != 0 ? null : friendsFriendStatusStatusDto;
        FriendsRequestsMutualDto friendsRequestsMutualDto3 = (i5 & 512) != 0 ? null : friendsRequestsMutualDto;
        String str194 = (i5 & 1024) != 0 ? null : str63;
        String str195 = (i5 & 2048) != 0 ? null : str64;
        Integer num39 = (i5 & 4096) != 0 ? null : num13;
        String str196 = (i5 & 8192) != 0 ? null : str65;
        Boolean bool45 = (i5 & 16384) != 0 ? null : bool14;
        if ((i5 & 32768) != 0) {
            bool16 = null;
            str66 = str156;
            str67 = str157;
            str68 = str158;
            str69 = str159;
            str70 = str160;
            baseBoolIntDto22 = baseBoolIntDto50;
            videoLiveInfoDto2 = videoLiveInfoDto3;
            baseBoolIntDto23 = baseBoolIntDto53;
            str71 = str176;
            str72 = str177;
            baseBoolIntDto24 = baseBoolIntDto54;
            baseBoolIntDto25 = baseBoolIntDto55;
            bool17 = bool38;
            str73 = str178;
            str74 = str179;
            str75 = str185;
            num14 = num36;
            str76 = str186;
            str77 = str187;
            str78 = str188;
            usersUserRelationDto2 = usersUserRelationDto3;
            usersUserMinDto2 = usersUserMinDto3;
            usersPersonalDto2 = usersPersonalDto3;
            list8 = list22;
            baseBoolIntDto26 = baseBoolIntDto64;
            friendsFriendStatusStatusDto2 = friendsFriendStatusStatusDto3;
            friendsRequestsMutualDto2 = friendsRequestsMutualDto3;
            str79 = str194;
            str80 = str195;
            num15 = num39;
            str128 = str196;
            bool18 = bool45;
            baseBoolIntDto27 = baseBoolIntDto52;
            usersOccupationDto2 = usersOccupationDto3;
            str81 = str191;
            str82 = str144;
            str83 = str140;
            str84 = str132;
            str85 = str133;
            str86 = str134;
            str87 = str135;
            str88 = str136;
            str89 = str137;
            str90 = str138;
            str91 = str139;
            str92 = str145;
            list9 = list19;
            str93 = str146;
            bool19 = bool39;
            str94 = str147;
            bool20 = bool40;
            baseCityDto2 = baseCityDto3;
            bool21 = bool41;
            baseCountryDto2 = baseCountryDto3;
            usersUserCountersDto2 = usersUserCountersDto3;
            f2 = f3;
            str95 = str189;
            ownerStateDto2 = ownerStateDto3;
            str96 = str148;
            str97 = str149;
            str98 = str150;
            str99 = str151;
            str100 = str152;
            str101 = str153;
            baseBoolIntDto28 = baseBoolIntDto43;
            baseBoolIntDto29 = baseBoolIntDto44;
            baseBoolIntDto30 = baseBoolIntDto45;
            baseBoolIntDto31 = baseBoolIntDto46;
            baseBoolIntDto42 = baseBoolIntDto47;
            baseBoolIntDto32 = baseBoolIntDto48;
            baseBoolIntDto33 = baseBoolIntDto49;
            usersUserTypeDto2 = usersUserTypeDto3;
            str102 = str154;
            str103 = str155;
            bool22 = bool33;
            str104 = str161;
            str105 = str162;
            str106 = str163;
            str107 = str164;
            str108 = str165;
            str109 = str166;
            str110 = str167;
            photosPhotoDto2 = photosPhotoDto3;
            str111 = str168;
            num16 = num27;
            bool23 = bool34;
            wallDefaultDto2 = wallDefaultDto3;
            bool24 = bool35;
            bool25 = bool36;
            bool26 = bool37;
            str112 = str169;
            str113 = str170;
            str114 = str171;
            str115 = str172;
            str116 = str173;
            str117 = str174;
            str118 = str175;
            audioAudioDto2 = audioAudioDto3;
            str119 = str181;
            str120 = str182;
            appsAppMinDto2 = appsAppMinDto3;
            usersLastSeenDto2 = usersLastSeenDto3;
            usersExportsDto2 = usersExportsDto3;
            baseCropPhotoDto2 = baseCropPhotoDto3;
            num17 = num28;
            num18 = num29;
            num19 = num30;
            num20 = num31;
            baseBoolIntDto34 = baseBoolIntDto56;
            baseBoolIntDto35 = baseBoolIntDto57;
            baseBoolIntDto36 = baseBoolIntDto58;
            baseBoolIntDto37 = baseBoolIntDto59;
            num21 = num32;
            list10 = list15;
            list11 = list16;
            num22 = num33;
            str121 = str183;
            num23 = num34;
            num24 = num35;
            str122 = str184;
            list12 = list18;
            baseBoolIntDto38 = baseBoolIntDto60;
            bool27 = bool42;
            str123 = str190;
            bool28 = bool43;
            num25 = num37;
            bool29 = bool44;
            list13 = list20;
            list14 = list21;
            baseSexDto2 = baseSexDto3;
            str124 = str192;
            str125 = str193;
            usersOnlineInfoDto2 = usersOnlineInfoDto3;
            baseBoolIntDto39 = baseBoolIntDto61;
            baseBoolIntDto40 = baseBoolIntDto62;
            num26 = num38;
            baseBoolIntDto41 = baseBoolIntDto63;
            str126 = str142;
            str127 = str143;
            bool30 = bool32;
            str129 = str131;
        } else {
            bool16 = bool15;
            str66 = str156;
            str67 = str157;
            str68 = str158;
            str69 = str159;
            str70 = str160;
            baseBoolIntDto22 = baseBoolIntDto50;
            videoLiveInfoDto2 = videoLiveInfoDto3;
            baseBoolIntDto23 = baseBoolIntDto53;
            str71 = str176;
            str72 = str177;
            baseBoolIntDto24 = baseBoolIntDto54;
            baseBoolIntDto25 = baseBoolIntDto55;
            bool17 = bool38;
            str73 = str178;
            str74 = str179;
            str75 = str185;
            num14 = num36;
            str76 = str186;
            str77 = str187;
            str78 = str188;
            usersUserRelationDto2 = usersUserRelationDto3;
            usersUserMinDto2 = usersUserMinDto3;
            usersPersonalDto2 = usersPersonalDto3;
            list8 = list22;
            baseBoolIntDto26 = baseBoolIntDto64;
            friendsFriendStatusStatusDto2 = friendsFriendStatusStatusDto3;
            friendsRequestsMutualDto2 = friendsRequestsMutualDto3;
            str79 = str194;
            str80 = str195;
            num15 = num39;
            bool18 = bool45;
            baseBoolIntDto27 = baseBoolIntDto52;
            usersOccupationDto2 = usersOccupationDto3;
            str81 = str191;
            str82 = str144;
            str83 = str140;
            str84 = str132;
            str85 = str133;
            str86 = str134;
            str87 = str135;
            str88 = str136;
            str89 = str137;
            str90 = str138;
            str91 = str139;
            str92 = str145;
            list9 = list19;
            str93 = str146;
            bool19 = bool39;
            str94 = str147;
            bool20 = bool40;
            baseCityDto2 = baseCityDto3;
            bool21 = bool41;
            baseCountryDto2 = baseCountryDto3;
            usersUserCountersDto2 = usersUserCountersDto3;
            f2 = f3;
            str95 = str189;
            ownerStateDto2 = ownerStateDto3;
            str96 = str148;
            str97 = str149;
            str98 = str150;
            str99 = str151;
            str100 = str152;
            str101 = str153;
            baseBoolIntDto28 = baseBoolIntDto43;
            baseBoolIntDto29 = baseBoolIntDto44;
            baseBoolIntDto30 = baseBoolIntDto45;
            baseBoolIntDto31 = baseBoolIntDto46;
            baseBoolIntDto32 = baseBoolIntDto48;
            baseBoolIntDto33 = baseBoolIntDto49;
            usersUserTypeDto2 = usersUserTypeDto3;
            str102 = str154;
            str103 = str155;
            bool22 = bool33;
            str104 = str161;
            str105 = str162;
            str106 = str163;
            str107 = str164;
            str108 = str165;
            str109 = str166;
            str110 = str167;
            photosPhotoDto2 = photosPhotoDto3;
            str111 = str168;
            num16 = num27;
            bool23 = bool34;
            wallDefaultDto2 = wallDefaultDto3;
            bool24 = bool35;
            bool25 = bool36;
            bool26 = bool37;
            str112 = str169;
            str113 = str170;
            str114 = str171;
            str115 = str172;
            str116 = str173;
            str117 = str174;
            str118 = str175;
            audioAudioDto2 = audioAudioDto3;
            str119 = str181;
            str120 = str182;
            appsAppMinDto2 = appsAppMinDto3;
            usersLastSeenDto2 = usersLastSeenDto3;
            usersExportsDto2 = usersExportsDto3;
            baseCropPhotoDto2 = baseCropPhotoDto3;
            num17 = num28;
            num18 = num29;
            num19 = num30;
            num20 = num31;
            baseBoolIntDto34 = baseBoolIntDto56;
            baseBoolIntDto35 = baseBoolIntDto57;
            baseBoolIntDto36 = baseBoolIntDto58;
            baseBoolIntDto37 = baseBoolIntDto59;
            num21 = num32;
            list10 = list15;
            list11 = list16;
            num22 = num33;
            str121 = str183;
            num23 = num34;
            num24 = num35;
            str122 = str184;
            list12 = list18;
            baseBoolIntDto38 = baseBoolIntDto60;
            bool27 = bool42;
            str123 = str190;
            bool28 = bool43;
            num25 = num37;
            bool29 = bool44;
            list13 = list20;
            list14 = list21;
            baseSexDto2 = baseSexDto3;
            str124 = str192;
            str125 = str193;
            usersOnlineInfoDto2 = usersOnlineInfoDto3;
            baseBoolIntDto39 = baseBoolIntDto61;
            baseBoolIntDto40 = baseBoolIntDto62;
            num26 = num38;
            baseBoolIntDto41 = baseBoolIntDto63;
            str126 = str142;
            str127 = str143;
            bool30 = bool32;
            str128 = str196;
            str129 = str131;
            baseBoolIntDto42 = baseBoolIntDto47;
        }
    }
}
