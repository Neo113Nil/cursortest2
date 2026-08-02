package com.vk.sdk.api.messages.dto;

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
import com.vk.sdk.api.users.dto.UsersCareerDto;
import com.vk.sdk.api.users.dto.UsersExportsDto;
import com.vk.sdk.api.users.dto.UsersLastSeenDto;
import com.vk.sdk.api.users.dto.UsersMilitaryDto;
import com.vk.sdk.api.users.dto.UsersOccupationDto;
import com.vk.sdk.api.users.dto.UsersOnlineInfoDto;
import com.vk.sdk.api.users.dto.UsersPersonalDto;
import com.vk.sdk.api.users.dto.UsersRelativeDto;
import com.vk.sdk.api.users.dto.UsersSchoolDto;
import com.vk.sdk.api.users.dto.UsersUniversityDto;
import com.vk.sdk.api.users.dto.UsersUserCountersDto;
import com.vk.sdk.api.users.dto.UsersUserMinDto;
import com.vk.sdk.api.users.dto.UsersUserRelationDto;
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

/* compiled from: MessagesUserXtrInvitedByDto.kt */
/* loaded from: classes5.dex */
public final class MessagesUserXtrInvitedByDto {

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

    @pmi0("invited_by")
    private final UserId invitedBy;

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

    @pmi0("name")
    private final String name;

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
    private final MessagesUserTypeForXtrInvitedByDto type;

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
    /* compiled from: MessagesUserXtrInvitedByDto.kt */
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

    public MessagesUserXtrInvitedByDto(UserId userId, UserId userId2, String str, MessagesUserTypeForXtrInvitedByDto messagesUserTypeForXtrInvitedByDto, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, Float f, OwnerStateDto ownerStateDto, String str19, String str20, String str21, String str22, String str23, String str24, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Boolean bool, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, String str25, String str26, String str27, String str28, String str29, String str30, String str31, BaseBoolIntDto baseBoolIntDto8, VideoLiveInfoDto videoLiveInfoDto, BaseBoolIntDto baseBoolIntDto9, Boolean bool2, String str32, String str33, String str34, String str35, String str36, String str37, String str38, PhotosPhotoDto photosPhotoDto, String str39, Integer num, Boolean bool3, WallDefaultDto wallDefaultDto, Boolean bool4, Boolean bool5, Boolean bool6, BaseBoolIntDto baseBoolIntDto10, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, BaseBoolIntDto baseBoolIntDto11, BaseBoolIntDto baseBoolIntDto12, Boolean bool7, String str49, String str50, String str51, AudioAudioDto audioAudioDto, String str52, String str53, AppsAppMinDto appsAppMinDto, UsersLastSeenDto usersLastSeenDto, UsersExportsDto usersExportsDto, BaseCropPhotoDto baseCropPhotoDto, Integer num2, Integer num3, Integer num4, Integer num5, BaseBoolIntDto baseBoolIntDto13, BaseBoolIntDto baseBoolIntDto14, BaseBoolIntDto baseBoolIntDto15, BaseBoolIntDto baseBoolIntDto16, Integer num6, UsersOccupationDto usersOccupationDto, List<UsersCareerDto> list, List<UsersMilitaryDto> list2, Integer num7, String str54, Integer num8, Integer num9, String str55, Integer num10, String str56, String str57, String str58, UsersUserRelationDto usersUserRelationDto, UsersUserMinDto usersUserMinDto, UsersPersonalDto usersPersonalDto, List<UsersUniversityDto> list3, List<UsersSchoolDto> list4, List<UsersRelativeDto> list5, Boolean bool8, Boolean bool9, Boolean bool10, UsersUserCountersDto usersUserCountersDto, String str59, BaseBoolIntDto baseBoolIntDto17, Boolean bool11, String str60, Boolean bool12, Integer num11, Boolean bool13, List<String> list6, List<Integer> list7, BaseSexDto baseSexDto, String str61, String str62, String str63, UsersOnlineInfoDto usersOnlineInfoDto, BaseBoolIntDto baseBoolIntDto18, BaseBoolIntDto baseBoolIntDto19, Integer num12, BaseBoolIntDto baseBoolIntDto20, BaseBoolIntDto baseBoolIntDto21, FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, FriendsRequestsMutualDto friendsRequestsMutualDto, String str64, String str65, Integer num13, String str66, Boolean bool14, Boolean bool15) {
        this.id = userId;
        this.invitedBy = userId2;
        this.name = str;
        this.type = messagesUserTypeForXtrInvitedByDto;
        this.firstNameNom = str2;
        this.firstNameGen = str3;
        this.firstNameDat = str4;
        this.firstNameAcc = str5;
        this.firstNameIns = str6;
        this.firstNameAbl = str7;
        this.lastNameNom = str8;
        this.lastNameGen = str9;
        this.lastNameDat = str10;
        this.lastNameAcc = str11;
        this.lastNameIns = str12;
        this.lastNameAbl = str13;
        this.nickname = str14;
        this.maidenName = str15;
        this.contactName = str16;
        this.domain = str17;
        this.bdate = str18;
        this.city = baseCityDto;
        this.country = baseCountryDto;
        this.timezone = f;
        this.ownerState = ownerStateDto;
        this.photo200 = str19;
        this.photoMax = str20;
        this.photo200Orig = str21;
        this.photo400Orig = str22;
        this.photoMaxOrig = str23;
        this.photoId = str24;
        this.hasPhoto = baseBoolIntDto;
        this.hasMobile = baseBoolIntDto2;
        this.isFriend = baseBoolIntDto3;
        this.isBestFriend = bool;
        this.wallComments = baseBoolIntDto4;
        this.canPost = baseBoolIntDto5;
        this.canSeeAllPosts = baseBoolIntDto6;
        this.canSeeAudio = baseBoolIntDto7;
        this.email = str25;
        this.skype = str26;
        this.facebook = str27;
        this.facebookName = str28;
        this.twitter = str29;
        this.livejournal = str30;
        this.instagram = str31;
        this.test = baseBoolIntDto8;
        this.videoLive = videoLiveInfoDto;
        this.isVideoLiveNotificationsBlocked = baseBoolIntDto9;
        this.isService = bool2;
        this.serviceDescription = str32;
        this.photoRec = str33;
        this.photoMedium = str34;
        this.photoMediumRec = str35;
        this.photo = str36;
        this.photoBig = str37;
        this.photo400 = str38;
        this.photoMaxSize = photosPhotoDto;
        this.language = str39;
        this.storiesArchiveCount = num;
        this.hasUnseenStories = bool3;
        this.wallDefault = wallDefaultDto;
        this.canCall = bool4;
        this.canCallFromGroup = bool5;
        this.canSeeWishes = bool6;
        this.canSeeGifts = baseBoolIntDto10;
        this.interests = str40;
        this.books = str41;
        this.tv = str42;
        this.quotes = str43;
        this.about = str44;
        this.games = str45;
        this.movies = str46;
        this.activities = str47;
        this.music = str48;
        this.canWritePrivateMessage = baseBoolIntDto11;
        this.canSendFriendRequest = baseBoolIntDto12;
        this.canBeInvitedGroup = bool7;
        this.mobilePhone = str49;
        this.homePhone = str50;
        this.site = str51;
        this.statusAudio = audioAudioDto;
        this.status = str52;
        this.activity = str53;
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
        this.universityName = str54;
        this.universityGroupId = num8;
        this.faculty = num9;
        this.facultyName = str55;
        this.graduation = num10;
        this.educationForm = str56;
        this.educationStatus = str57;
        this.homeTown = str58;
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
        this.accessKey = str59;
        this.canUploadDoc = baseBoolIntDto17;
        this.canBan = bool11;
        this.hash = str60;
        this.isNoIndex = bool12;
        this.contactId = num11;
        this.isMessageRequest = bool13;
        this.descriptions = list6;
        this.lists = list7;
        this.sex = baseSexDto;
        this.screenName = str61;
        this.photo50 = str62;
        this.photo100 = str63;
        this.onlineInfo = usersOnlineInfoDto;
        this.online = baseBoolIntDto18;
        this.onlineMobile = baseBoolIntDto19;
        this.onlineApp = num12;
        this.verified = baseBoolIntDto20;
        this.trending = baseBoolIntDto21;
        this.friendStatus = friendsFriendStatusStatusDto;
        this.mutual = friendsRequestsMutualDto;
        this.deactivated = str64;
        this.firstName = str65;
        this.hidden = num13;
        this.lastName = str66;
        this.canAccessClosed = bool14;
        this.isClosed = bool15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesUserXtrInvitedByDto)) {
            return false;
        }
        MessagesUserXtrInvitedByDto messagesUserXtrInvitedByDto = (MessagesUserXtrInvitedByDto) obj;
        return epx.f(this.id, messagesUserXtrInvitedByDto.id) && epx.f(this.invitedBy, messagesUserXtrInvitedByDto.invitedBy) && epx.f(this.name, messagesUserXtrInvitedByDto.name) && this.type == messagesUserXtrInvitedByDto.type && epx.f(this.firstNameNom, messagesUserXtrInvitedByDto.firstNameNom) && epx.f(this.firstNameGen, messagesUserXtrInvitedByDto.firstNameGen) && epx.f(this.firstNameDat, messagesUserXtrInvitedByDto.firstNameDat) && epx.f(this.firstNameAcc, messagesUserXtrInvitedByDto.firstNameAcc) && epx.f(this.firstNameIns, messagesUserXtrInvitedByDto.firstNameIns) && epx.f(this.firstNameAbl, messagesUserXtrInvitedByDto.firstNameAbl) && epx.f(this.lastNameNom, messagesUserXtrInvitedByDto.lastNameNom) && epx.f(this.lastNameGen, messagesUserXtrInvitedByDto.lastNameGen) && epx.f(this.lastNameDat, messagesUserXtrInvitedByDto.lastNameDat) && epx.f(this.lastNameAcc, messagesUserXtrInvitedByDto.lastNameAcc) && epx.f(this.lastNameIns, messagesUserXtrInvitedByDto.lastNameIns) && epx.f(this.lastNameAbl, messagesUserXtrInvitedByDto.lastNameAbl) && epx.f(this.nickname, messagesUserXtrInvitedByDto.nickname) && epx.f(this.maidenName, messagesUserXtrInvitedByDto.maidenName) && epx.f(this.contactName, messagesUserXtrInvitedByDto.contactName) && epx.f(this.domain, messagesUserXtrInvitedByDto.domain) && epx.f(this.bdate, messagesUserXtrInvitedByDto.bdate) && epx.f(this.city, messagesUserXtrInvitedByDto.city) && epx.f(this.country, messagesUserXtrInvitedByDto.country) && epx.f(this.timezone, messagesUserXtrInvitedByDto.timezone) && epx.f(this.ownerState, messagesUserXtrInvitedByDto.ownerState) && epx.f(this.photo200, messagesUserXtrInvitedByDto.photo200) && epx.f(this.photoMax, messagesUserXtrInvitedByDto.photoMax) && epx.f(this.photo200Orig, messagesUserXtrInvitedByDto.photo200Orig) && epx.f(this.photo400Orig, messagesUserXtrInvitedByDto.photo400Orig) && epx.f(this.photoMaxOrig, messagesUserXtrInvitedByDto.photoMaxOrig) && epx.f(this.photoId, messagesUserXtrInvitedByDto.photoId) && this.hasPhoto == messagesUserXtrInvitedByDto.hasPhoto && this.hasMobile == messagesUserXtrInvitedByDto.hasMobile && this.isFriend == messagesUserXtrInvitedByDto.isFriend && epx.f(this.isBestFriend, messagesUserXtrInvitedByDto.isBestFriend) && this.wallComments == messagesUserXtrInvitedByDto.wallComments && this.canPost == messagesUserXtrInvitedByDto.canPost && this.canSeeAllPosts == messagesUserXtrInvitedByDto.canSeeAllPosts && this.canSeeAudio == messagesUserXtrInvitedByDto.canSeeAudio && epx.f(this.email, messagesUserXtrInvitedByDto.email) && epx.f(this.skype, messagesUserXtrInvitedByDto.skype) && epx.f(this.facebook, messagesUserXtrInvitedByDto.facebook) && epx.f(this.facebookName, messagesUserXtrInvitedByDto.facebookName) && epx.f(this.twitter, messagesUserXtrInvitedByDto.twitter) && epx.f(this.livejournal, messagesUserXtrInvitedByDto.livejournal) && epx.f(this.instagram, messagesUserXtrInvitedByDto.instagram) && this.test == messagesUserXtrInvitedByDto.test && epx.f(this.videoLive, messagesUserXtrInvitedByDto.videoLive) && this.isVideoLiveNotificationsBlocked == messagesUserXtrInvitedByDto.isVideoLiveNotificationsBlocked && epx.f(this.isService, messagesUserXtrInvitedByDto.isService) && epx.f(this.serviceDescription, messagesUserXtrInvitedByDto.serviceDescription) && epx.f(this.photoRec, messagesUserXtrInvitedByDto.photoRec) && epx.f(this.photoMedium, messagesUserXtrInvitedByDto.photoMedium) && epx.f(this.photoMediumRec, messagesUserXtrInvitedByDto.photoMediumRec) && epx.f(this.photo, messagesUserXtrInvitedByDto.photo) && epx.f(this.photoBig, messagesUserXtrInvitedByDto.photoBig) && epx.f(this.photo400, messagesUserXtrInvitedByDto.photo400) && epx.f(this.photoMaxSize, messagesUserXtrInvitedByDto.photoMaxSize) && epx.f(this.language, messagesUserXtrInvitedByDto.language) && epx.f(this.storiesArchiveCount, messagesUserXtrInvitedByDto.storiesArchiveCount) && epx.f(this.hasUnseenStories, messagesUserXtrInvitedByDto.hasUnseenStories) && this.wallDefault == messagesUserXtrInvitedByDto.wallDefault && epx.f(this.canCall, messagesUserXtrInvitedByDto.canCall) && epx.f(this.canCallFromGroup, messagesUserXtrInvitedByDto.canCallFromGroup) && epx.f(this.canSeeWishes, messagesUserXtrInvitedByDto.canSeeWishes) && this.canSeeGifts == messagesUserXtrInvitedByDto.canSeeGifts && epx.f(this.interests, messagesUserXtrInvitedByDto.interests) && epx.f(this.books, messagesUserXtrInvitedByDto.books) && epx.f(this.tv, messagesUserXtrInvitedByDto.tv) && epx.f(this.quotes, messagesUserXtrInvitedByDto.quotes) && epx.f(this.about, messagesUserXtrInvitedByDto.about) && epx.f(this.games, messagesUserXtrInvitedByDto.games) && epx.f(this.movies, messagesUserXtrInvitedByDto.movies) && epx.f(this.activities, messagesUserXtrInvitedByDto.activities) && epx.f(this.music, messagesUserXtrInvitedByDto.music) && this.canWritePrivateMessage == messagesUserXtrInvitedByDto.canWritePrivateMessage && this.canSendFriendRequest == messagesUserXtrInvitedByDto.canSendFriendRequest && epx.f(this.canBeInvitedGroup, messagesUserXtrInvitedByDto.canBeInvitedGroup) && epx.f(this.mobilePhone, messagesUserXtrInvitedByDto.mobilePhone) && epx.f(this.homePhone, messagesUserXtrInvitedByDto.homePhone) && epx.f(this.site, messagesUserXtrInvitedByDto.site) && epx.f(this.statusAudio, messagesUserXtrInvitedByDto.statusAudio) && epx.f(this.status, messagesUserXtrInvitedByDto.status) && epx.f(this.activity, messagesUserXtrInvitedByDto.activity) && epx.f(this.statusApp, messagesUserXtrInvitedByDto.statusApp) && epx.f(this.lastSeen, messagesUserXtrInvitedByDto.lastSeen) && epx.f(this.exports, messagesUserXtrInvitedByDto.exports) && epx.f(this.cropPhoto, messagesUserXtrInvitedByDto.cropPhoto) && epx.f(this.followersCount, messagesUserXtrInvitedByDto.followersCount) && epx.f(this.videoLiveLevel, messagesUserXtrInvitedByDto.videoLiveLevel) && epx.f(this.videoLiveCount, messagesUserXtrInvitedByDto.videoLiveCount) && epx.f(this.clipsCount, messagesUserXtrInvitedByDto.clipsCount) && this.blacklisted == messagesUserXtrInvitedByDto.blacklisted && this.blacklistedByMe == messagesUserXtrInvitedByDto.blacklistedByMe && this.isFavorite == messagesUserXtrInvitedByDto.isFavorite && this.isHiddenFromFeed == messagesUserXtrInvitedByDto.isHiddenFromFeed && epx.f(this.commonCount, messagesUserXtrInvitedByDto.commonCount) && epx.f(this.occupation, messagesUserXtrInvitedByDto.occupation) && epx.f(this.career, messagesUserXtrInvitedByDto.career) && epx.f(this.military, messagesUserXtrInvitedByDto.military) && epx.f(this.university, messagesUserXtrInvitedByDto.university) && epx.f(this.universityName, messagesUserXtrInvitedByDto.universityName) && epx.f(this.universityGroupId, messagesUserXtrInvitedByDto.universityGroupId) && epx.f(this.faculty, messagesUserXtrInvitedByDto.faculty) && epx.f(this.facultyName, messagesUserXtrInvitedByDto.facultyName) && epx.f(this.graduation, messagesUserXtrInvitedByDto.graduation) && epx.f(this.educationForm, messagesUserXtrInvitedByDto.educationForm) && epx.f(this.educationStatus, messagesUserXtrInvitedByDto.educationStatus) && epx.f(this.homeTown, messagesUserXtrInvitedByDto.homeTown) && this.relation == messagesUserXtrInvitedByDto.relation && epx.f(this.relationPartner, messagesUserXtrInvitedByDto.relationPartner) && epx.f(this.personal, messagesUserXtrInvitedByDto.personal) && epx.f(this.universities, messagesUserXtrInvitedByDto.universities) && epx.f(this.schools, messagesUserXtrInvitedByDto.schools) && epx.f(this.relatives, messagesUserXtrInvitedByDto.relatives) && epx.f(this.isSubscribedPodcasts, messagesUserXtrInvitedByDto.isSubscribedPodcasts) && epx.f(this.canSubscribePodcasts, messagesUserXtrInvitedByDto.canSubscribePodcasts) && epx.f(this.canSubscribePosts, messagesUserXtrInvitedByDto.canSubscribePosts) && epx.f(this.counters, messagesUserXtrInvitedByDto.counters) && epx.f(this.accessKey, messagesUserXtrInvitedByDto.accessKey) && this.canUploadDoc == messagesUserXtrInvitedByDto.canUploadDoc && epx.f(this.canBan, messagesUserXtrInvitedByDto.canBan) && epx.f(this.hash, messagesUserXtrInvitedByDto.hash) && epx.f(this.isNoIndex, messagesUserXtrInvitedByDto.isNoIndex) && epx.f(this.contactId, messagesUserXtrInvitedByDto.contactId) && epx.f(this.isMessageRequest, messagesUserXtrInvitedByDto.isMessageRequest) && epx.f(this.descriptions, messagesUserXtrInvitedByDto.descriptions) && epx.f(this.lists, messagesUserXtrInvitedByDto.lists) && this.sex == messagesUserXtrInvitedByDto.sex && epx.f(this.screenName, messagesUserXtrInvitedByDto.screenName) && epx.f(this.photo50, messagesUserXtrInvitedByDto.photo50) && epx.f(this.photo100, messagesUserXtrInvitedByDto.photo100) && epx.f(this.onlineInfo, messagesUserXtrInvitedByDto.onlineInfo) && this.online == messagesUserXtrInvitedByDto.online && this.onlineMobile == messagesUserXtrInvitedByDto.onlineMobile && epx.f(this.onlineApp, messagesUserXtrInvitedByDto.onlineApp) && this.verified == messagesUserXtrInvitedByDto.verified && this.trending == messagesUserXtrInvitedByDto.trending && this.friendStatus == messagesUserXtrInvitedByDto.friendStatus && epx.f(this.mutual, messagesUserXtrInvitedByDto.mutual) && epx.f(this.deactivated, messagesUserXtrInvitedByDto.deactivated) && epx.f(this.firstName, messagesUserXtrInvitedByDto.firstName) && epx.f(this.hidden, messagesUserXtrInvitedByDto.hidden) && epx.f(this.lastName, messagesUserXtrInvitedByDto.lastName) && epx.f(this.canAccessClosed, messagesUserXtrInvitedByDto.canAccessClosed) && epx.f(this.isClosed, messagesUserXtrInvitedByDto.isClosed);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.id.b) * 31;
        UserId userId = this.invitedBy;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str = this.name;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        MessagesUserTypeForXtrInvitedByDto messagesUserTypeForXtrInvitedByDto = this.type;
        int hashCode4 = (hashCode3 + (messagesUserTypeForXtrInvitedByDto == null ? 0 : messagesUserTypeForXtrInvitedByDto.hashCode())) * 31;
        String str2 = this.firstNameNom;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firstNameGen;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.firstNameDat;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.firstNameAcc;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.firstNameIns;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.firstNameAbl;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.lastNameNom;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.lastNameGen;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.lastNameDat;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.lastNameAcc;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.lastNameIns;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.lastNameAbl;
        int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.nickname;
        int hashCode17 = (hashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.maidenName;
        int hashCode18 = (hashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.contactName;
        int hashCode19 = (hashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.domain;
        int hashCode20 = (hashCode19 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.bdate;
        int hashCode21 = (hashCode20 + (str18 == null ? 0 : str18.hashCode())) * 31;
        BaseCityDto baseCityDto = this.city;
        int hashCode22 = (hashCode21 + (baseCityDto == null ? 0 : baseCityDto.hashCode())) * 31;
        BaseCountryDto baseCountryDto = this.country;
        int hashCode23 = (hashCode22 + (baseCountryDto == null ? 0 : baseCountryDto.hashCode())) * 31;
        Float f = this.timezone;
        int hashCode24 = (hashCode23 + (f == null ? 0 : f.hashCode())) * 31;
        OwnerStateDto ownerStateDto = this.ownerState;
        int hashCode25 = (hashCode24 + (ownerStateDto == null ? 0 : ownerStateDto.hashCode())) * 31;
        String str19 = this.photo200;
        int hashCode26 = (hashCode25 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.photoMax;
        int hashCode27 = (hashCode26 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.photo200Orig;
        int hashCode28 = (hashCode27 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.photo400Orig;
        int hashCode29 = (hashCode28 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.photoMaxOrig;
        int hashCode30 = (hashCode29 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.photoId;
        int hashCode31 = (hashCode30 + (str24 == null ? 0 : str24.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.hasPhoto;
        int hashCode32 = (hashCode31 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.hasMobile;
        int hashCode33 = (hashCode32 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.isFriend;
        int hashCode34 = (hashCode33 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        Boolean bool = this.isBestFriend;
        int hashCode35 = (hashCode34 + (bool == null ? 0 : bool.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.wallComments;
        int hashCode36 = (hashCode35 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto5 = this.canPost;
        int hashCode37 = (hashCode36 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto6 = this.canSeeAllPosts;
        int hashCode38 = (hashCode37 + (baseBoolIntDto6 == null ? 0 : baseBoolIntDto6.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto7 = this.canSeeAudio;
        int hashCode39 = (hashCode38 + (baseBoolIntDto7 == null ? 0 : baseBoolIntDto7.hashCode())) * 31;
        String str25 = this.email;
        int hashCode40 = (hashCode39 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.skype;
        int hashCode41 = (hashCode40 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.facebook;
        int hashCode42 = (hashCode41 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.facebookName;
        int hashCode43 = (hashCode42 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.twitter;
        int hashCode44 = (hashCode43 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.livejournal;
        int hashCode45 = (hashCode44 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.instagram;
        int hashCode46 = (hashCode45 + (str31 == null ? 0 : str31.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto8 = this.test;
        int hashCode47 = (hashCode46 + (baseBoolIntDto8 == null ? 0 : baseBoolIntDto8.hashCode())) * 31;
        VideoLiveInfoDto videoLiveInfoDto = this.videoLive;
        int hashCode48 = (hashCode47 + (videoLiveInfoDto == null ? 0 : videoLiveInfoDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto9 = this.isVideoLiveNotificationsBlocked;
        int hashCode49 = (hashCode48 + (baseBoolIntDto9 == null ? 0 : baseBoolIntDto9.hashCode())) * 31;
        Boolean bool2 = this.isService;
        int hashCode50 = (hashCode49 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str32 = this.serviceDescription;
        int hashCode51 = (hashCode50 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.photoRec;
        int hashCode52 = (hashCode51 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.photoMedium;
        int hashCode53 = (hashCode52 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.photoMediumRec;
        int hashCode54 = (hashCode53 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.photo;
        int hashCode55 = (hashCode54 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.photoBig;
        int hashCode56 = (hashCode55 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.photo400;
        int hashCode57 = (hashCode56 + (str38 == null ? 0 : str38.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photoMaxSize;
        int hashCode58 = (hashCode57 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        String str39 = this.language;
        int hashCode59 = (hashCode58 + (str39 == null ? 0 : str39.hashCode())) * 31;
        Integer num = this.storiesArchiveCount;
        int hashCode60 = (hashCode59 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.hasUnseenStories;
        int hashCode61 = (hashCode60 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        WallDefaultDto wallDefaultDto = this.wallDefault;
        int hashCode62 = (hashCode61 + (wallDefaultDto == null ? 0 : wallDefaultDto.hashCode())) * 31;
        Boolean bool4 = this.canCall;
        int hashCode63 = (hashCode62 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.canCallFromGroup;
        int hashCode64 = (hashCode63 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.canSeeWishes;
        int hashCode65 = (hashCode64 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto10 = this.canSeeGifts;
        int hashCode66 = (hashCode65 + (baseBoolIntDto10 == null ? 0 : baseBoolIntDto10.hashCode())) * 31;
        String str40 = this.interests;
        int hashCode67 = (hashCode66 + (str40 == null ? 0 : str40.hashCode())) * 31;
        String str41 = this.books;
        int hashCode68 = (hashCode67 + (str41 == null ? 0 : str41.hashCode())) * 31;
        String str42 = this.tv;
        int hashCode69 = (hashCode68 + (str42 == null ? 0 : str42.hashCode())) * 31;
        String str43 = this.quotes;
        int hashCode70 = (hashCode69 + (str43 == null ? 0 : str43.hashCode())) * 31;
        String str44 = this.about;
        int hashCode71 = (hashCode70 + (str44 == null ? 0 : str44.hashCode())) * 31;
        String str45 = this.games;
        int hashCode72 = (hashCode71 + (str45 == null ? 0 : str45.hashCode())) * 31;
        String str46 = this.movies;
        int hashCode73 = (hashCode72 + (str46 == null ? 0 : str46.hashCode())) * 31;
        String str47 = this.activities;
        int hashCode74 = (hashCode73 + (str47 == null ? 0 : str47.hashCode())) * 31;
        String str48 = this.music;
        int hashCode75 = (hashCode74 + (str48 == null ? 0 : str48.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto11 = this.canWritePrivateMessage;
        int hashCode76 = (hashCode75 + (baseBoolIntDto11 == null ? 0 : baseBoolIntDto11.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto12 = this.canSendFriendRequest;
        int hashCode77 = (hashCode76 + (baseBoolIntDto12 == null ? 0 : baseBoolIntDto12.hashCode())) * 31;
        Boolean bool7 = this.canBeInvitedGroup;
        int hashCode78 = (hashCode77 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str49 = this.mobilePhone;
        int hashCode79 = (hashCode78 + (str49 == null ? 0 : str49.hashCode())) * 31;
        String str50 = this.homePhone;
        int hashCode80 = (hashCode79 + (str50 == null ? 0 : str50.hashCode())) * 31;
        String str51 = this.site;
        int hashCode81 = (hashCode80 + (str51 == null ? 0 : str51.hashCode())) * 31;
        AudioAudioDto audioAudioDto = this.statusAudio;
        int hashCode82 = (hashCode81 + (audioAudioDto == null ? 0 : audioAudioDto.hashCode())) * 31;
        String str52 = this.status;
        int hashCode83 = (hashCode82 + (str52 == null ? 0 : str52.hashCode())) * 31;
        String str53 = this.activity;
        int hashCode84 = (hashCode83 + (str53 == null ? 0 : str53.hashCode())) * 31;
        AppsAppMinDto appsAppMinDto = this.statusApp;
        int hashCode85 = (hashCode84 + (appsAppMinDto == null ? 0 : appsAppMinDto.hashCode())) * 31;
        UsersLastSeenDto usersLastSeenDto = this.lastSeen;
        int hashCode86 = (hashCode85 + (usersLastSeenDto == null ? 0 : usersLastSeenDto.hashCode())) * 31;
        UsersExportsDto usersExportsDto = this.exports;
        int hashCode87 = (hashCode86 + (usersExportsDto == null ? 0 : usersExportsDto.hashCode())) * 31;
        BaseCropPhotoDto baseCropPhotoDto = this.cropPhoto;
        int hashCode88 = (hashCode87 + (baseCropPhotoDto == null ? 0 : baseCropPhotoDto.hashCode())) * 31;
        Integer num2 = this.followersCount;
        int hashCode89 = (hashCode88 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.videoLiveLevel;
        int hashCode90 = (hashCode89 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.videoLiveCount;
        int hashCode91 = (hashCode90 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.clipsCount;
        int hashCode92 = (hashCode91 + (num5 == null ? 0 : num5.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto13 = this.blacklisted;
        int hashCode93 = (hashCode92 + (baseBoolIntDto13 == null ? 0 : baseBoolIntDto13.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto14 = this.blacklistedByMe;
        int hashCode94 = (hashCode93 + (baseBoolIntDto14 == null ? 0 : baseBoolIntDto14.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto15 = this.isFavorite;
        int hashCode95 = (hashCode94 + (baseBoolIntDto15 == null ? 0 : baseBoolIntDto15.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto16 = this.isHiddenFromFeed;
        int hashCode96 = (hashCode95 + (baseBoolIntDto16 == null ? 0 : baseBoolIntDto16.hashCode())) * 31;
        Integer num6 = this.commonCount;
        int hashCode97 = (hashCode96 + (num6 == null ? 0 : num6.hashCode())) * 31;
        UsersOccupationDto usersOccupationDto = this.occupation;
        int hashCode98 = (hashCode97 + (usersOccupationDto == null ? 0 : usersOccupationDto.hashCode())) * 31;
        List<UsersCareerDto> list = this.career;
        int hashCode99 = (hashCode98 + (list == null ? 0 : list.hashCode())) * 31;
        List<UsersMilitaryDto> list2 = this.military;
        int hashCode100 = (hashCode99 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num7 = this.university;
        int hashCode101 = (hashCode100 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str54 = this.universityName;
        int hashCode102 = (hashCode101 + (str54 == null ? 0 : str54.hashCode())) * 31;
        Integer num8 = this.universityGroupId;
        int hashCode103 = (hashCode102 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.faculty;
        int hashCode104 = (hashCode103 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str55 = this.facultyName;
        int hashCode105 = (hashCode104 + (str55 == null ? 0 : str55.hashCode())) * 31;
        Integer num10 = this.graduation;
        int hashCode106 = (hashCode105 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str56 = this.educationForm;
        int hashCode107 = (hashCode106 + (str56 == null ? 0 : str56.hashCode())) * 31;
        String str57 = this.educationStatus;
        int hashCode108 = (hashCode107 + (str57 == null ? 0 : str57.hashCode())) * 31;
        String str58 = this.homeTown;
        int hashCode109 = (hashCode108 + (str58 == null ? 0 : str58.hashCode())) * 31;
        UsersUserRelationDto usersUserRelationDto = this.relation;
        int hashCode110 = (hashCode109 + (usersUserRelationDto == null ? 0 : usersUserRelationDto.hashCode())) * 31;
        UsersUserMinDto usersUserMinDto = this.relationPartner;
        int hashCode111 = (hashCode110 + (usersUserMinDto == null ? 0 : usersUserMinDto.hashCode())) * 31;
        UsersPersonalDto usersPersonalDto = this.personal;
        int hashCode112 = (hashCode111 + (usersPersonalDto == null ? 0 : usersPersonalDto.hashCode())) * 31;
        List<UsersUniversityDto> list3 = this.universities;
        int hashCode113 = (hashCode112 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<UsersSchoolDto> list4 = this.schools;
        int hashCode114 = (hashCode113 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<UsersRelativeDto> list5 = this.relatives;
        int hashCode115 = (hashCode114 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Boolean bool8 = this.isSubscribedPodcasts;
        int hashCode116 = (hashCode115 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.canSubscribePodcasts;
        int hashCode117 = (hashCode116 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.canSubscribePosts;
        int hashCode118 = (hashCode117 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        UsersUserCountersDto usersUserCountersDto = this.counters;
        int hashCode119 = (hashCode118 + (usersUserCountersDto == null ? 0 : usersUserCountersDto.hashCode())) * 31;
        String str59 = this.accessKey;
        int hashCode120 = (hashCode119 + (str59 == null ? 0 : str59.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto17 = this.canUploadDoc;
        int hashCode121 = (hashCode120 + (baseBoolIntDto17 == null ? 0 : baseBoolIntDto17.hashCode())) * 31;
        Boolean bool11 = this.canBan;
        int hashCode122 = (hashCode121 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        String str60 = this.hash;
        int hashCode123 = (hashCode122 + (str60 == null ? 0 : str60.hashCode())) * 31;
        Boolean bool12 = this.isNoIndex;
        int hashCode124 = (hashCode123 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Integer num11 = this.contactId;
        int hashCode125 = (hashCode124 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Boolean bool13 = this.isMessageRequest;
        int hashCode126 = (hashCode125 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        List<String> list6 = this.descriptions;
        int hashCode127 = (hashCode126 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<Integer> list7 = this.lists;
        int hashCode128 = (hashCode127 + (list7 == null ? 0 : list7.hashCode())) * 31;
        BaseSexDto baseSexDto = this.sex;
        int hashCode129 = (hashCode128 + (baseSexDto == null ? 0 : baseSexDto.hashCode())) * 31;
        String str61 = this.screenName;
        int hashCode130 = (hashCode129 + (str61 == null ? 0 : str61.hashCode())) * 31;
        String str62 = this.photo50;
        int hashCode131 = (hashCode130 + (str62 == null ? 0 : str62.hashCode())) * 31;
        String str63 = this.photo100;
        int hashCode132 = (hashCode131 + (str63 == null ? 0 : str63.hashCode())) * 31;
        UsersOnlineInfoDto usersOnlineInfoDto = this.onlineInfo;
        int hashCode133 = (hashCode132 + (usersOnlineInfoDto == null ? 0 : usersOnlineInfoDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto18 = this.online;
        int hashCode134 = (hashCode133 + (baseBoolIntDto18 == null ? 0 : baseBoolIntDto18.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto19 = this.onlineMobile;
        int hashCode135 = (hashCode134 + (baseBoolIntDto19 == null ? 0 : baseBoolIntDto19.hashCode())) * 31;
        Integer num12 = this.onlineApp;
        int hashCode136 = (hashCode135 + (num12 == null ? 0 : num12.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto20 = this.verified;
        int hashCode137 = (hashCode136 + (baseBoolIntDto20 == null ? 0 : baseBoolIntDto20.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto21 = this.trending;
        int hashCode138 = (hashCode137 + (baseBoolIntDto21 == null ? 0 : baseBoolIntDto21.hashCode())) * 31;
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto = this.friendStatus;
        int hashCode139 = (hashCode138 + (friendsFriendStatusStatusDto == null ? 0 : friendsFriendStatusStatusDto.hashCode())) * 31;
        FriendsRequestsMutualDto friendsRequestsMutualDto = this.mutual;
        int hashCode140 = (hashCode139 + (friendsRequestsMutualDto == null ? 0 : friendsRequestsMutualDto.hashCode())) * 31;
        String str64 = this.deactivated;
        int hashCode141 = (hashCode140 + (str64 == null ? 0 : str64.hashCode())) * 31;
        String str65 = this.firstName;
        int hashCode142 = (hashCode141 + (str65 == null ? 0 : str65.hashCode())) * 31;
        Integer num13 = this.hidden;
        int hashCode143 = (hashCode142 + (num13 == null ? 0 : num13.hashCode())) * 31;
        String str66 = this.lastName;
        int hashCode144 = (hashCode143 + (str66 == null ? 0 : str66.hashCode())) * 31;
        Boolean bool14 = this.canAccessClosed;
        int hashCode145 = (hashCode144 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.isClosed;
        return hashCode145 + (bool15 != null ? bool15.hashCode() : 0);
    }

    public final String toString() {
        UserId userId = this.id;
        UserId userId2 = this.invitedBy;
        String str = this.name;
        MessagesUserTypeForXtrInvitedByDto messagesUserTypeForXtrInvitedByDto = this.type;
        String str2 = this.firstNameNom;
        String str3 = this.firstNameGen;
        String str4 = this.firstNameDat;
        String str5 = this.firstNameAcc;
        String str6 = this.firstNameIns;
        String str7 = this.firstNameAbl;
        String str8 = this.lastNameNom;
        String str9 = this.lastNameGen;
        String str10 = this.lastNameDat;
        String str11 = this.lastNameAcc;
        String str12 = this.lastNameIns;
        String str13 = this.lastNameAbl;
        String str14 = this.nickname;
        String str15 = this.maidenName;
        String str16 = this.contactName;
        String str17 = this.domain;
        String str18 = this.bdate;
        BaseCityDto baseCityDto = this.city;
        BaseCountryDto baseCountryDto = this.country;
        Float f = this.timezone;
        OwnerStateDto ownerStateDto = this.ownerState;
        String str19 = this.photo200;
        String str20 = this.photoMax;
        String str21 = this.photo200Orig;
        String str22 = this.photo400Orig;
        String str23 = this.photoMaxOrig;
        String str24 = this.photoId;
        BaseBoolIntDto baseBoolIntDto = this.hasPhoto;
        BaseBoolIntDto baseBoolIntDto2 = this.hasMobile;
        BaseBoolIntDto baseBoolIntDto3 = this.isFriend;
        Boolean bool = this.isBestFriend;
        BaseBoolIntDto baseBoolIntDto4 = this.wallComments;
        BaseBoolIntDto baseBoolIntDto5 = this.canPost;
        BaseBoolIntDto baseBoolIntDto6 = this.canSeeAllPosts;
        BaseBoolIntDto baseBoolIntDto7 = this.canSeeAudio;
        String str25 = this.email;
        String str26 = this.skype;
        String str27 = this.facebook;
        String str28 = this.facebookName;
        String str29 = this.twitter;
        String str30 = this.livejournal;
        String str31 = this.instagram;
        BaseBoolIntDto baseBoolIntDto8 = this.test;
        VideoLiveInfoDto videoLiveInfoDto = this.videoLive;
        BaseBoolIntDto baseBoolIntDto9 = this.isVideoLiveNotificationsBlocked;
        Boolean bool2 = this.isService;
        String str32 = this.serviceDescription;
        String str33 = this.photoRec;
        String str34 = this.photoMedium;
        String str35 = this.photoMediumRec;
        String str36 = this.photo;
        String str37 = this.photoBig;
        String str38 = this.photo400;
        PhotosPhotoDto photosPhotoDto = this.photoMaxSize;
        String str39 = this.language;
        Integer num = this.storiesArchiveCount;
        Boolean bool3 = this.hasUnseenStories;
        WallDefaultDto wallDefaultDto = this.wallDefault;
        Boolean bool4 = this.canCall;
        Boolean bool5 = this.canCallFromGroup;
        Boolean bool6 = this.canSeeWishes;
        BaseBoolIntDto baseBoolIntDto10 = this.canSeeGifts;
        String str40 = this.interests;
        String str41 = this.books;
        String str42 = this.tv;
        String str43 = this.quotes;
        String str44 = this.about;
        String str45 = this.games;
        String str46 = this.movies;
        String str47 = this.activities;
        String str48 = this.music;
        BaseBoolIntDto baseBoolIntDto11 = this.canWritePrivateMessage;
        BaseBoolIntDto baseBoolIntDto12 = this.canSendFriendRequest;
        Boolean bool7 = this.canBeInvitedGroup;
        String str49 = this.mobilePhone;
        String str50 = this.homePhone;
        String str51 = this.site;
        AudioAudioDto audioAudioDto = this.statusAudio;
        String str52 = this.status;
        String str53 = this.activity;
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
        String str54 = this.universityName;
        Integer num8 = this.universityGroupId;
        Integer num9 = this.faculty;
        String str55 = this.facultyName;
        Integer num10 = this.graduation;
        String str56 = this.educationForm;
        String str57 = this.educationStatus;
        String str58 = this.homeTown;
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
        String str59 = this.accessKey;
        BaseBoolIntDto baseBoolIntDto17 = this.canUploadDoc;
        Boolean bool11 = this.canBan;
        String str60 = this.hash;
        Boolean bool12 = this.isNoIndex;
        Integer num11 = this.contactId;
        Boolean bool13 = this.isMessageRequest;
        List<String> list6 = this.descriptions;
        List<Integer> list7 = this.lists;
        BaseSexDto baseSexDto = this.sex;
        String str61 = this.screenName;
        String str62 = this.photo50;
        String str63 = this.photo100;
        UsersOnlineInfoDto usersOnlineInfoDto = this.onlineInfo;
        BaseBoolIntDto baseBoolIntDto18 = this.online;
        BaseBoolIntDto baseBoolIntDto19 = this.onlineMobile;
        Integer num12 = this.onlineApp;
        BaseBoolIntDto baseBoolIntDto20 = this.verified;
        BaseBoolIntDto baseBoolIntDto21 = this.trending;
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto = this.friendStatus;
        FriendsRequestsMutualDto friendsRequestsMutualDto = this.mutual;
        String str64 = this.deactivated;
        String str65 = this.firstName;
        Integer num13 = this.hidden;
        String str66 = this.lastName;
        Boolean bool14 = this.canAccessClosed;
        Boolean bool15 = this.isClosed;
        StringBuilder sb = new StringBuilder("MessagesUserXtrInvitedByDto(id=");
        sb.append(userId);
        sb.append(", invitedBy=");
        sb.append(userId2);
        sb.append(", name=");
        sb.append(str);
        sb.append(", type=");
        sb.append(messagesUserTypeForXtrInvitedByDto);
        sb.append(", firstNameNom=");
        n6j.b(sb, str2, ", firstNameGen=", str3, ", firstNameDat=");
        n6j.b(sb, str4, ", firstNameAcc=", str5, ", firstNameIns=");
        n6j.b(sb, str6, ", firstNameAbl=", str7, ", lastNameNom=");
        n6j.b(sb, str8, ", lastNameGen=", str9, ", lastNameDat=");
        n6j.b(sb, str10, ", lastNameAcc=", str11, ", lastNameIns=");
        n6j.b(sb, str12, ", lastNameAbl=", str13, ", nickname=");
        n6j.b(sb, str14, ", maidenName=", str15, ", contactName=");
        n6j.b(sb, str16, ", domain=", str17, ", bdate=");
        sb.append(str18);
        sb.append(", city=");
        sb.append(baseCityDto);
        sb.append(", country=");
        sb.append(baseCountryDto);
        sb.append(", timezone=");
        sb.append(f);
        sb.append(", ownerState=");
        sb.append(ownerStateDto);
        sb.append(", photo200=");
        sb.append(str19);
        sb.append(", photoMax=");
        n6j.b(sb, str20, ", photo200Orig=", str21, ", photo400Orig=");
        n6j.b(sb, str22, ", photoMaxOrig=", str23, ", photoId=");
        sb.append(str24);
        sb.append(", hasPhoto=");
        sb.append(baseBoolIntDto);
        sb.append(", hasMobile=");
        to.b(sb, baseBoolIntDto2, ", isFriend=", baseBoolIntDto3, ", isBestFriend=");
        sb.append(bool);
        sb.append(", wallComments=");
        sb.append(baseBoolIntDto4);
        sb.append(", canPost=");
        to.b(sb, baseBoolIntDto5, ", canSeeAllPosts=", baseBoolIntDto6, ", canSeeAudio=");
        sb.append(baseBoolIntDto7);
        sb.append(", email=");
        sb.append(str25);
        sb.append(", skype=");
        n6j.b(sb, str26, ", facebook=", str27, ", facebookName=");
        n6j.b(sb, str28, ", twitter=", str29, ", livejournal=");
        n6j.b(sb, str30, ", instagram=", str31, ", test=");
        sb.append(baseBoolIntDto8);
        sb.append(", videoLive=");
        sb.append(videoLiveInfoDto);
        sb.append(", isVideoLiveNotificationsBlocked=");
        sb.append(baseBoolIntDto9);
        sb.append(", isService=");
        sb.append(bool2);
        sb.append(", serviceDescription=");
        n6j.b(sb, str32, ", photoRec=", str33, ", photoMedium=");
        n6j.b(sb, str34, ", photoMediumRec=", str35, ", photo=");
        n6j.b(sb, str36, ", photoBig=", str37, ", photo400=");
        sb.append(str38);
        sb.append(", photoMaxSize=");
        sb.append(photosPhotoDto);
        sb.append(", language=");
        kr.b(num, str39, ", storiesArchiveCount=", ", hasUnseenStories=", sb);
        sb.append(bool3);
        sb.append(", wallDefault=");
        sb.append(wallDefaultDto);
        sb.append(", canCall=");
        tq.i(sb, bool4, ", canCallFromGroup=", bool5, ", canSeeWishes=");
        sb.append(bool6);
        sb.append(", canSeeGifts=");
        sb.append(baseBoolIntDto10);
        sb.append(", interests=");
        n6j.b(sb, str40, ", books=", str41, ", tv=");
        n6j.b(sb, str42, ", quotes=", str43, ", about=");
        n6j.b(sb, str44, ", games=", str45, ", movies=");
        n6j.b(sb, str46, ", activities=", str47, ", music=");
        sb.append(str48);
        sb.append(", canWritePrivateMessage=");
        sb.append(baseBoolIntDto11);
        sb.append(", canSendFriendRequest=");
        sb.append(baseBoolIntDto12);
        sb.append(", canBeInvitedGroup=");
        sb.append(bool7);
        sb.append(", mobilePhone=");
        n6j.b(sb, str49, ", homePhone=", str50, ", site=");
        sb.append(str51);
        sb.append(", statusAudio=");
        sb.append(audioAudioDto);
        sb.append(", status=");
        n6j.b(sb, str52, ", activity=", str53, ", statusApp=");
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
        mq.b(num7, ", universityName=", str54, ", universityGroupId=", sb);
        sq.b(sb, num8, ", faculty=", num9, ", facultyName=");
        kr.b(num10, str55, ", graduation=", ", educationForm=", sb);
        n6j.b(sb, str56, ", educationStatus=", str57, ", homeTown=");
        sb.append(str58);
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
        sb.append(str59);
        sb.append(", canUploadDoc=");
        sb.append(baseBoolIntDto17);
        sb.append(", canBan=");
        sb.append(bool11);
        sb.append(", hash=");
        uq.c(bool12, str60, ", isNoIndex=", ", contactId=", sb);
        rq.h(sb, num11, ", isMessageRequest=", bool13, ", descriptions=");
        vq.d(sb, list6, ", lists=", list7, ", sex=");
        sb.append(baseSexDto);
        sb.append(", screenName=");
        sb.append(str61);
        sb.append(", photo50=");
        n6j.b(sb, str62, ", photo100=", str63, ", onlineInfo=");
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
        n6j.b(sb, str64, ", firstName=", str65, ", hidden=");
        mq.b(num13, ", lastName=", str66, ", canAccessClosed=", sb);
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
    public /* synthetic */ MessagesUserXtrInvitedByDto(UserId userId, UserId userId2, String str, MessagesUserTypeForXtrInvitedByDto messagesUserTypeForXtrInvitedByDto, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, Float f, OwnerStateDto ownerStateDto, String str19, String str20, String str21, String str22, String str23, String str24, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Boolean bool, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, String str25, String str26, String str27, String str28, String str29, String str30, String str31, BaseBoolIntDto baseBoolIntDto8, VideoLiveInfoDto videoLiveInfoDto, BaseBoolIntDto baseBoolIntDto9, Boolean bool2, String str32, String str33, String str34, String str35, String str36, String str37, String str38, PhotosPhotoDto photosPhotoDto, String str39, Integer num, Boolean bool3, WallDefaultDto wallDefaultDto, Boolean bool4, Boolean bool5, Boolean bool6, BaseBoolIntDto baseBoolIntDto10, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, BaseBoolIntDto baseBoolIntDto11, BaseBoolIntDto baseBoolIntDto12, Boolean bool7, String str49, String str50, String str51, AudioAudioDto audioAudioDto, String str52, String str53, AppsAppMinDto appsAppMinDto, UsersLastSeenDto usersLastSeenDto, UsersExportsDto usersExportsDto, BaseCropPhotoDto baseCropPhotoDto, Integer num2, Integer num3, Integer num4, Integer num5, BaseBoolIntDto baseBoolIntDto13, BaseBoolIntDto baseBoolIntDto14, BaseBoolIntDto baseBoolIntDto15, BaseBoolIntDto baseBoolIntDto16, Integer num6, UsersOccupationDto usersOccupationDto, List list, List list2, Integer num7, String str54, Integer num8, Integer num9, String str55, Integer num10, String str56, String str57, String str58, UsersUserRelationDto usersUserRelationDto, UsersUserMinDto usersUserMinDto, UsersPersonalDto usersPersonalDto, List list3, List list4, List list5, Boolean bool8, Boolean bool9, Boolean bool10, UsersUserCountersDto usersUserCountersDto, String str59, BaseBoolIntDto baseBoolIntDto17, Boolean bool11, String str60, Boolean bool12, Integer num11, Boolean bool13, List list6, List list7, BaseSexDto baseSexDto, String str61, String str62, String str63, UsersOnlineInfoDto usersOnlineInfoDto, BaseBoolIntDto baseBoolIntDto18, BaseBoolIntDto baseBoolIntDto19, Integer num12, BaseBoolIntDto baseBoolIntDto20, BaseBoolIntDto baseBoolIntDto21, FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, FriendsRequestsMutualDto friendsRequestsMutualDto, String str64, String str65, Integer num13, String str66, Boolean bool14, Boolean bool15, int i, int i2, int i3, int i4, int i5, zcl zclVar) {
        this(userId, r113, r7, r8, r9, r10, r11, r12, r13, r14, r15, r6, r114, r115, r5, r17, r19, r21, r23, r25, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r116, r39, r40, r41, r42, r43, r44, r45, r117, r118, r119, r120, r121, r122, r123, r124, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r1, r62, r63, r64, r65, r66, r67, r68, r125, r126, r127, r128, r129, r130, r131, r0, (i3 & 32768) != 0 ? null : str50, (i3 & 65536) != 0 ? null : str51, (i3 & 131072) != 0 ? null : audioAudioDto, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str52, (i3 & 524288) != 0 ? null : str53, (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : appsAppMinDto, (i3 & 2097152) != 0 ? null : usersLastSeenDto, (i3 & 4194304) != 0 ? null : usersExportsDto, (i3 & 8388608) != 0 ? null : baseCropPhotoDto, (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : num2, (i3 & 33554432) != 0 ? null : num3, (i3 & 67108864) != 0 ? null : num4, (i3 & 134217728) != 0 ? null : num5, (i3 & 268435456) != 0 ? null : baseBoolIntDto13, (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : baseBoolIntDto14, (i3 & 1073741824) != 0 ? null : baseBoolIntDto15, (i3 & Integer.MIN_VALUE) != 0 ? null : baseBoolIntDto16, (i4 & 1) != 0 ? null : num6, (i4 & 2) != 0 ? null : usersOccupationDto, (i4 & 4) != 0 ? null : list, (i4 & 8) != 0 ? null : list2, (i4 & 16) != 0 ? null : num7, (i4 & 32) != 0 ? null : str54, (i4 & 64) != 0 ? null : num8, (i4 & 128) != 0 ? null : num9, (i4 & 256) != 0 ? null : str55, (i4 & 512) != 0 ? null : num10, (i4 & 1024) != 0 ? null : str56, (i4 & 2048) != 0 ? null : str57, (i4 & 4096) != 0 ? null : str58, (i4 & 8192) != 0 ? null : usersUserRelationDto, (i4 & 16384) != 0 ? null : usersUserMinDto, (i4 & 32768) != 0 ? null : usersPersonalDto, (i4 & 65536) != 0 ? null : list3, (i4 & 131072) != 0 ? null : list4, (i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : list5, (i4 & 524288) != 0 ? null : bool8, (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool9, (i4 & 2097152) != 0 ? null : bool10, (i4 & 4194304) != 0 ? null : usersUserCountersDto, (i4 & 8388608) != 0 ? null : str59, (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : baseBoolIntDto17, (i4 & 33554432) != 0 ? null : bool11, (i4 & 67108864) != 0 ? null : str60, (i4 & 134217728) != 0 ? null : bool12, (i4 & 268435456) != 0 ? null : num11, (i4 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool13, (i4 & 1073741824) != 0 ? null : list6, (i4 & Integer.MIN_VALUE) != 0 ? null : list7, (i5 & 1) != 0 ? null : baseSexDto, (i5 & 2) != 0 ? null : str61, (i5 & 4) != 0 ? null : str62, (i5 & 8) != 0 ? null : str63, (i5 & 16) != 0 ? null : usersOnlineInfoDto, (i5 & 32) != 0 ? null : baseBoolIntDto18, (i5 & 64) != 0 ? null : baseBoolIntDto19, (i5 & 128) != 0 ? null : num12, (i5 & 256) != 0 ? null : baseBoolIntDto20, (i5 & 512) != 0 ? null : baseBoolIntDto21, (i5 & 1024) != 0 ? null : friendsFriendStatusStatusDto, (i5 & 2048) != 0 ? null : friendsRequestsMutualDto, (i5 & 4096) != 0 ? null : str64, (i5 & 8192) != 0 ? null : str65, (i5 & 16384) != 0 ? null : num13, (i5 & 32768) != 0 ? null : str66, (i5 & 65536) != 0 ? null : bool14, (i5 & 131072) != 0 ? null : bool15);
        UserId userId3 = (i & 2) != 0 ? null : userId2;
        String str67 = (i & 4) != 0 ? null : str;
        MessagesUserTypeForXtrInvitedByDto messagesUserTypeForXtrInvitedByDto2 = (i & 8) != 0 ? null : messagesUserTypeForXtrInvitedByDto;
        String str68 = (i & 16) != 0 ? null : str2;
        String str69 = (i & 32) != 0 ? null : str3;
        String str70 = (i & 64) != 0 ? null : str4;
        String str71 = (i & 128) != 0 ? null : str5;
        String str72 = (i & 256) != 0 ? null : str6;
        String str73 = (i & 512) != 0 ? null : str7;
        String str74 = (i & 1024) != 0 ? null : str8;
        String str75 = (i & 2048) != 0 ? null : str9;
        UserId userId4 = userId3;
        String str76 = (i & 4096) != 0 ? null : str10;
        String str77 = (i & 8192) != 0 ? null : str11;
        String str78 = (i & 16384) != 0 ? null : str12;
        String str79 = (i & 32768) != 0 ? null : str13;
        String str80 = (i & 65536) != 0 ? null : str14;
        String str81 = (i & 131072) != 0 ? null : str15;
        String str82 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str16;
        String str83 = (i & 524288) != 0 ? null : str17;
        String str84 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str18;
        BaseCityDto baseCityDto2 = (i & 2097152) != 0 ? null : baseCityDto;
        BaseCountryDto baseCountryDto2 = (i & 4194304) != 0 ? null : baseCountryDto;
        Float f2 = (i & 8388608) != 0 ? null : f;
        OwnerStateDto ownerStateDto2 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : ownerStateDto;
        String str85 = (i & 33554432) != 0 ? null : str19;
        String str86 = (i & 67108864) != 0 ? null : str20;
        String str87 = (i & 134217728) != 0 ? null : str21;
        String str88 = (i & 268435456) != 0 ? null : str22;
        String str89 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str23;
        String str90 = (i & 1073741824) != 0 ? null : str24;
        BaseBoolIntDto baseBoolIntDto22 = (i & Integer.MIN_VALUE) != 0 ? null : baseBoolIntDto;
        BaseBoolIntDto baseBoolIntDto23 = (i2 & 1) != 0 ? null : baseBoolIntDto2;
        BaseBoolIntDto baseBoolIntDto24 = (i2 & 2) != 0 ? null : baseBoolIntDto3;
        Boolean bool16 = (i2 & 4) != 0 ? null : bool;
        BaseBoolIntDto baseBoolIntDto25 = (i2 & 8) != 0 ? null : baseBoolIntDto4;
        BaseBoolIntDto baseBoolIntDto26 = (i2 & 16) != 0 ? null : baseBoolIntDto5;
        BaseBoolIntDto baseBoolIntDto27 = (i2 & 32) != 0 ? null : baseBoolIntDto6;
        BaseBoolIntDto baseBoolIntDto28 = (i2 & 64) != 0 ? null : baseBoolIntDto7;
        BaseBoolIntDto baseBoolIntDto29 = baseBoolIntDto22;
        String str91 = (i2 & 128) != 0 ? null : str25;
        String str92 = (i2 & 256) != 0 ? null : str26;
        String str93 = (i2 & 512) != 0 ? null : str27;
        String str94 = (i2 & 1024) != 0 ? null : str28;
        String str95 = (i2 & 2048) != 0 ? null : str29;
        String str96 = (i2 & 4096) != 0 ? null : str30;
        String str97 = (i2 & 8192) != 0 ? null : str31;
        BaseBoolIntDto baseBoolIntDto30 = (i2 & 16384) != 0 ? null : baseBoolIntDto8;
        VideoLiveInfoDto videoLiveInfoDto2 = (i2 & 32768) != 0 ? null : videoLiveInfoDto;
        BaseBoolIntDto baseBoolIntDto31 = (i2 & 65536) != 0 ? null : baseBoolIntDto9;
        Boolean bool17 = (i2 & 131072) != 0 ? null : bool2;
        String str98 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str32;
        String str99 = (i2 & 524288) != 0 ? null : str33;
        String str100 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str34;
        String str101 = (i2 & 2097152) != 0 ? null : str35;
        String str102 = (i2 & 4194304) != 0 ? null : str36;
        String str103 = (i2 & 8388608) != 0 ? null : str37;
        String str104 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str38;
        PhotosPhotoDto photosPhotoDto2 = (i2 & 33554432) != 0 ? null : photosPhotoDto;
        String str105 = (i2 & 67108864) != 0 ? null : str39;
        Integer num14 = (i2 & 134217728) != 0 ? null : num;
        Boolean bool18 = (i2 & 268435456) != 0 ? null : bool3;
        WallDefaultDto wallDefaultDto2 = (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : wallDefaultDto;
        Boolean bool19 = (i2 & 1073741824) != 0 ? null : bool4;
        Boolean bool20 = (i2 & Integer.MIN_VALUE) != 0 ? null : bool5;
        Boolean bool21 = (i3 & 1) != 0 ? null : bool6;
        BaseBoolIntDto baseBoolIntDto32 = (i3 & 2) != 0 ? null : baseBoolIntDto10;
        String str106 = (i3 & 4) != 0 ? null : str40;
        String str107 = (i3 & 8) != 0 ? null : str41;
        String str108 = (i3 & 16) != 0 ? null : str42;
        String str109 = (i3 & 32) != 0 ? null : str43;
        String str110 = (i3 & 64) != 0 ? null : str44;
        BaseBoolIntDto baseBoolIntDto33 = baseBoolIntDto30;
        String str111 = (i3 & 128) != 0 ? null : str45;
        String str112 = (i3 & 256) != 0 ? null : str46;
        String str113 = (i3 & 512) != 0 ? null : str47;
        String str114 = (i3 & 1024) != 0 ? null : str48;
        BaseBoolIntDto baseBoolIntDto34 = (i3 & 2048) != 0 ? null : baseBoolIntDto11;
        BaseBoolIntDto baseBoolIntDto35 = (i3 & 4096) != 0 ? null : baseBoolIntDto12;
        Boolean bool22 = (i3 & 8192) != 0 ? null : bool7;
        String str115 = (i3 & 16384) != 0 ? null : str49;
    }
}
