package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.apps.dto.AppsAppMinDto;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioMusicAwardsDto;
import com.vk.api.generated.base.dto.BaseAPlusMarkDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseCityDto;
import com.vk.api.generated.base.dto.BaseCountryDto;
import com.vk.api.generated.base.dto.BaseCropPhotoDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseOwnerButtonDto;
import com.vk.api.generated.base.dto.BaseOwnerCoverDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.calls.dto.CallsCustomNameForCallDto;
import com.vk.api.generated.friends.dto.FriendsFriendStatusStatusDto;
import com.vk.api.generated.friends.dto.FriendsRequestsMutualDto;
import com.vk.api.generated.messages.dto.MessagesContactDto;
import com.vk.api.generated.messagesEdu.dto.MessagesEduEducationalProfileDto;
import com.vk.api.generated.owner.dto.OwnerStateDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.status.dto.StatusImageStatusDto;
import com.vk.api.generated.video.dto.VideoLiveInfoDto;
import com.vk.dto.common.id.UserId;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.reactivex.rxjava3.subjects.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.sdk.api.login.LoginRequest;
import xsna.ao;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.eok;
import xsna.epx;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: UsersUserFullDto.kt */
/* loaded from: classes15.dex */
public final class UsersUserFullDto implements Parcelable {
    public static final Parcelable.Creator<UsersUserFullDto> CREATOR = new a();

    @pmi0("a_plus_mark")
    private final BaseAPlusMarkDto aPlusMark;

    @pmi0("about")
    private final String about;

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("activities")
    private final String activities;

    @pmi0("activity")
    private final String activity;

    @pmi0("age_group")
    private final Integer ageGroup;

    @pmi0("age_mark")
    private final Integer ageMark;

    @pmi0("animated_avatar")
    private final BaseImageDto animatedAvatar;

    @pmi0("bdate")
    private final String bdate;

    @pmi0("bdate_visibility")
    private final BdateVisibilityDto bdateVisibility;

    @pmi0("blacklisted")
    private final BaseBoolIntDto blacklisted;

    @pmi0("blacklisted_by_me")
    private final BaseBoolIntDto blacklistedByMe;

    @pmi0("books")
    private final String books;

    @pmi0("buttons")
    private final List<BaseOwnerButtonDto> buttons;

    @pmi0("can_access_closed")
    private final Boolean canAccessClosed;

    @pmi0("can_ask_anonymous")
    private final Boolean canAskAnonymous;

    @pmi0("can_ask_question")
    private final Boolean canAskQuestion;

    @pmi0("can_ban")
    private final Boolean canBan;

    @pmi0("can_be_invited_group")
    private final Boolean canBeInvitedGroup;

    @pmi0("can_call")
    private final Boolean canCall;

    @pmi0("can_call_as_community")
    private final Boolean canCallAsCommunity;

    @pmi0("can_call_from_group")
    private final Boolean canCallFromGroup;

    @pmi0("can_invite_as_voicerooms_speaker")
    private final Boolean canInviteAsVoiceroomsSpeaker;

    @pmi0("can_invite_to_chats")
    private final Boolean canInviteToChats;

    @pmi0("can_not_call_reason")
    private final UsersCanNotCallReasonDto canNotCallReason;

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

    @pmi0("can_subscribe_stories")
    private final Boolean canSubscribeStories;

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

    @pmi0("co_ownership_enabled")
    private final Boolean coOwnershipEnabled;

    @pmi0("common_count")
    private final Integer commonCount;

    @pmi0("contact")
    private final MessagesContactDto contact;

    @pmi0("contact_id")
    private final Integer contactId;

    @pmi0("contact_name")
    private final String contactName;

    @pmi0("counters")
    private final UsersUserCountersDto counters;

    @pmi0("country")
    private final BaseCountryDto country;

    @pmi0("cover")
    private final BaseOwnerCoverDto cover;

    @pmi0("crop_photo")
    private final BaseCropPhotoDto cropPhoto;

    @pmi0("custom_names_for_calls")
    private final List<CallsCustomNameForCallDto> customNamesForCalls;

    @pmi0("deactivated")
    private final String deactivated;

    @pmi0("description")
    private final String description;

    @pmi0("descriptions")
    private final List<String> descriptions;

    @pmi0(X3.j.D)
    private final String domain;

    @pmi0("donut")
    private final UsersDonutDto donut;

    @pmi0("edu_details")
    private final List<String> eduDetails;

    @pmi0("education_form")
    private final String educationForm;

    @pmi0("education_status")
    private final String educationStatus;

    @pmi0("educational_profile")
    private final MessagesEduEducationalProfileDto educationalProfile;

    @pmi0("email")
    private final String email;

    @pmi0("emoji_status")
    private final UsersEmojiStatusDto emojiStatus;

    @pmi0("employee_mark")
    private final EmployeeMarkDto employeeMark;

    @pmi0("employee_working_state")
    private final UsersEmployeeWorkingStateDto employeeWorkingState;

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

    @pmi0("friendship_weeks")
    private final Integer friendshipWeeks;

    @pmi0("games")
    private final String games;

    @pmi0("gifts_tooltip")
    private final UsersGiftsTooltipDto giftsTooltip;

    @pmi0("graduation")
    private final Integer graduation;

    @pmi0("has_email")
    private final Boolean hasEmail;

    @pmi0("has_mobile")
    private final BaseBoolIntDto hasMobile;

    @pmi0("has_photo")
    private final BaseBoolIntDto hasPhoto;

    @pmi0("has_related_user_pin")
    private final Boolean hasRelatedUserPin;

    @pmi0("has_rights")
    private final Boolean hasRights;

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

    @pmi0("image_status")
    private final StatusImageStatusDto imageStatus;

    @pmi0("instagram")
    private final String instagram;

    @pmi0("interests")
    private final String interests;

    @pmi0("is_adult")
    private final BaseBoolIntDto isAdult;

    @pmi0("is_best_friend")
    private final Boolean isBestFriend;

    @pmi0("is_cached")
    private final Boolean isCached;

    @pmi0("is_closed")
    private final Boolean isClosed;

    @pmi0("is_dead")
    private final Boolean isDead;

    @pmi0("is_don")
    private final Boolean isDon;

    @pmi0("is_esia_linked")
    private final Boolean isEsiaLinked;

    @pmi0("is_esia_verified")
    private final Boolean isEsiaVerified;

    @pmi0("is_favorite")
    private final BaseBoolIntDto isFavorite;

    @pmi0("is_followers_mode_on")
    private final Boolean isFollowersModeOn;

    @pmi0("is_friend")
    private final BaseBoolIntDto isFriend;

    @pmi0("is_hidden_from_feed")
    private final BaseBoolIntDto isHiddenFromFeed;

    @pmi0("is_media_moder")
    private final Boolean isMediaModer;

    @pmi0("is_message_request")
    private final Boolean isMessageRequest;

    @pmi0("is_nft")
    private final Boolean isNft;

    @pmi0("is_personal_ads_easy_promote_enabled")
    private final Boolean isPersonalAdsEasyPromoteEnabled;

    @pmi0("is_photo_map_enabled")
    private final Boolean isPhotoMapEnabled;

    @pmi0("is_sber_linked")
    private final Boolean isSberLinked;

    @pmi0("is_sber_verified")
    private final Boolean isSberVerified;

    @pmi0("is_service")
    private final Boolean isService;

    @pmi0("is_service_account")
    private final Boolean isServiceAccount;

    @pmi0("is_student")
    private final Boolean isStudent;

    @pmi0("is_subscribed")
    private final BaseBoolIntDto isSubscribed;

    @pmi0("is_subscribed_podcasts")
    private final Boolean isSubscribedPodcasts;

    @pmi0("is_subscribed_stories")
    private final Boolean isSubscribedStories;

    @pmi0("is_teacher")
    private final Boolean isTeacher;

    @pmi0("is_tinkoff_linked")
    private final Boolean isTinkoffLinked;

    @pmi0("is_tinkoff_verified")
    private final Boolean isTinkoffVerified;

    @pmi0("is_verified")
    private final Boolean isVerified;

    @pmi0("is_video_live_notifications_blocked")
    private final BaseBoolIntDto isVideoLiveNotificationsBlocked;

    @pmi0("joined")
    private final Integer joined;

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

    @pmi0("music_awards")
    private final AudioMusicAwardsDto musicAwards;

    @pmi0("mutual")
    private final FriendsRequestsMutualDto mutual;

    @pmi0("need_big_msg_btn_in_profile")
    private final Boolean needBigMsgBtnInProfile;

    @pmi0("nickname")
    private final String nickname;

    @pmi0("no_index")
    private final NoIndexDto noIndex;

    @pmi0("oauth_linked")
    private final List<String> oauthLinked;

    @pmi0("oauth_verification")
    private final List<String> oauthVerification;

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

    @pmi0("photo_avg_color")
    private final String photoAvgColor;

    @pmi0("photo_base")
    private final String photoBase;

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

    @pmi0("profile_buttons")
    private final List<List<UsersProfileButtonDto>> profileButtons;

    @pmi0("profile_buttons_tablet")
    private final List<List<UsersProfileButtonDto>> profileButtonsTablet;

    @pmi0("profile_type")
    private final UsersUserProfileTypeDto profileType;

    @pmi0("promotion_allowance")
    private final UsersPromotionAllowanceDto promotionAllowance;

    @pmi0("quotes")
    private final String quotes;

    @pmi0("relation")
    private final UsersUserRelationDto relation;

    @pmi0("relation_partner")
    private final UsersUserMinDto relationPartner;

    @pmi0("relatives")
    private final List<UsersRelativeDto> relatives;

    @pmi0("rights_location")
    private final UsersRightsLocationDto rightsLocation;

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

    @pmi0("social_button_type")
    private final SocialButtonTypeDto socialButtonType;

    @pmi0("status")
    private final String status;

    @pmi0("status_app")
    private final AppsAppMinDto statusApp;

    @pmi0("status_audio")
    private final AudioAudioDto statusAudio;

    @pmi0("stories_archive_count")
    private final Integer storiesArchiveCount;

    @pmi0("subscription_country")
    private final String subscriptionCountry;

    @pmi0("sys_username")
    private final String sysUsername;

    @pmi0(LoginRequest.CLIENT_NAME)
    private final BaseBoolIntDto test;

    @pmi0("third_party_buttons")
    private final List<UsersProfileButtonDto> thirdPartyButtons;

    @pmi0(AnalyticsBaseParamsConstantsKt.TIMEZONE)
    private final Float timezone;

    @pmi0("track_code")
    private final String trackCode;

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
    public static final class BdateVisibilityDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BdateVisibilityDto[] $VALUES;
        public static final Parcelable.Creator<BdateVisibilityDto> CREATOR;

        @pmi0("2")
        public static final BdateVisibilityDto DAY_AND_MONTH_ONLY;

        @pmi0("0")
        public static final BdateVisibilityDto IS_HIDDEN;

        @pmi0("1")
        public static final BdateVisibilityDto IS_VISIBLE;
        private final int value;

        /* compiled from: UsersUserFullDto.kt */
        public static final class a implements Parcelable.Creator<BdateVisibilityDto> {
            @Override // android.os.Parcelable.Creator
            public final BdateVisibilityDto createFromParcel(Parcel parcel) {
                return BdateVisibilityDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BdateVisibilityDto[] newArray(int i) {
                return new BdateVisibilityDto[i];
            }
        }

        static {
            BdateVisibilityDto bdateVisibilityDto = new BdateVisibilityDto("IS_HIDDEN", 0, 0);
            IS_HIDDEN = bdateVisibilityDto;
            BdateVisibilityDto bdateVisibilityDto2 = new BdateVisibilityDto("IS_VISIBLE", 1, 1);
            IS_VISIBLE = bdateVisibilityDto2;
            BdateVisibilityDto bdateVisibilityDto3 = new BdateVisibilityDto("DAY_AND_MONTH_ONLY", 2, 2);
            DAY_AND_MONTH_ONLY = bdateVisibilityDto3;
            BdateVisibilityDto[] bdateVisibilityDtoArr = {bdateVisibilityDto, bdateVisibilityDto2, bdateVisibilityDto3};
            $VALUES = bdateVisibilityDtoArr;
            $ENTRIES = new asp(bdateVisibilityDtoArr);
            CREATOR = new a();
        }

        private BdateVisibilityDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static BdateVisibilityDto valueOf(String str) {
            return (BdateVisibilityDto) Enum.valueOf(BdateVisibilityDto.class, str);
        }

        public static BdateVisibilityDto[] values() {
            return (BdateVisibilityDto[]) $VALUES.clone();
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
    /* compiled from: UsersUserFullDto.kt */
    public static final class EmployeeMarkDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EmployeeMarkDto[] $VALUES;

        @pmi0("business_trip")
        public static final EmployeeMarkDto BUSINESS_TRIP;
        public static final Parcelable.Creator<EmployeeMarkDto> CREATOR;

        @pmi0("mrg_unit")
        public static final EmployeeMarkDto MRG_UNIT;

        @pmi0("normal")
        public static final EmployeeMarkDto NORMAL;

        @pmi0("outsourcer")
        public static final EmployeeMarkDto OUTSOURCER;

        @pmi0("vacation")
        public static final EmployeeMarkDto VACATION;
        private final String value;

        /* compiled from: UsersUserFullDto.kt */
        public static final class a implements Parcelable.Creator<EmployeeMarkDto> {
            @Override // android.os.Parcelable.Creator
            public final EmployeeMarkDto createFromParcel(Parcel parcel) {
                return EmployeeMarkDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EmployeeMarkDto[] newArray(int i) {
                return new EmployeeMarkDto[i];
            }
        }

        static {
            EmployeeMarkDto employeeMarkDto = new EmployeeMarkDto("VACATION", 0, "vacation");
            VACATION = employeeMarkDto;
            EmployeeMarkDto employeeMarkDto2 = new EmployeeMarkDto("BUSINESS_TRIP", 1, "business_trip");
            BUSINESS_TRIP = employeeMarkDto2;
            EmployeeMarkDto employeeMarkDto3 = new EmployeeMarkDto("MRG_UNIT", 2, "mrg_unit");
            MRG_UNIT = employeeMarkDto3;
            EmployeeMarkDto employeeMarkDto4 = new EmployeeMarkDto("NORMAL", 3, "normal");
            NORMAL = employeeMarkDto4;
            EmployeeMarkDto employeeMarkDto5 = new EmployeeMarkDto("OUTSOURCER", 4, "outsourcer");
            OUTSOURCER = employeeMarkDto5;
            EmployeeMarkDto[] employeeMarkDtoArr = {employeeMarkDto, employeeMarkDto2, employeeMarkDto3, employeeMarkDto4, employeeMarkDto5};
            $VALUES = employeeMarkDtoArr;
            $ENTRIES = new asp(employeeMarkDtoArr);
            CREATOR = new a();
        }

        private EmployeeMarkDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static EmployeeMarkDto valueOf(String str) {
            return (EmployeeMarkDto) Enum.valueOf(EmployeeMarkDto.class, str);
        }

        public static EmployeeMarkDto[] values() {
            return (EmployeeMarkDto[]) $VALUES.clone();
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
    /* compiled from: UsersUserFullDto.kt */
    public static final class NoIndexDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NoIndexDto[] $VALUES;

        @pmi0("all")
        public static final NoIndexDto ALL;

        @pmi0("all_except_of_search_engines")
        public static final NoIndexDto ALL_EXCEPT_OF_SEARCH_ENGINES;
        public static final Parcelable.Creator<NoIndexDto> CREATOR;

        @pmi0("vk_users_only")
        public static final NoIndexDto VK_USERS_ONLY;
        private final String value;

        /* compiled from: UsersUserFullDto.kt */
        public static final class a implements Parcelable.Creator<NoIndexDto> {
            @Override // android.os.Parcelable.Creator
            public final NoIndexDto createFromParcel(Parcel parcel) {
                return NoIndexDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NoIndexDto[] newArray(int i) {
                return new NoIndexDto[i];
            }
        }

        static {
            NoIndexDto noIndexDto = new NoIndexDto("ALL", 0, "all");
            ALL = noIndexDto;
            NoIndexDto noIndexDto2 = new NoIndexDto("ALL_EXCEPT_OF_SEARCH_ENGINES", 1, "all_except_of_search_engines");
            ALL_EXCEPT_OF_SEARCH_ENGINES = noIndexDto2;
            NoIndexDto noIndexDto3 = new NoIndexDto("VK_USERS_ONLY", 2, "vk_users_only");
            VK_USERS_ONLY = noIndexDto3;
            NoIndexDto[] noIndexDtoArr = {noIndexDto, noIndexDto2, noIndexDto3};
            $VALUES = noIndexDtoArr;
            $ENTRIES = new asp(noIndexDtoArr);
            CREATOR = new a();
        }

        private NoIndexDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static NoIndexDto valueOf(String str) {
            return (NoIndexDto) Enum.valueOf(NoIndexDto.class, str);
        }

        public static NoIndexDto[] values() {
            return (NoIndexDto[]) $VALUES.clone();
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
    /* compiled from: UsersUserFullDto.kt */
    public static final class SocialButtonTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SocialButtonTypeDto[] $VALUES;

        @pmi0("add")
        public static final SocialButtonTypeDto ADD;
        public static final Parcelable.Creator<SocialButtonTypeDto> CREATOR;

        @pmi0("follow")
        public static final SocialButtonTypeDto FOLLOW;
        private final String value;

        /* compiled from: UsersUserFullDto.kt */
        public static final class a implements Parcelable.Creator<SocialButtonTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final SocialButtonTypeDto createFromParcel(Parcel parcel) {
                return SocialButtonTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SocialButtonTypeDto[] newArray(int i) {
                return new SocialButtonTypeDto[i];
            }
        }

        static {
            SocialButtonTypeDto socialButtonTypeDto = new SocialButtonTypeDto("FOLLOW", 0, "follow");
            FOLLOW = socialButtonTypeDto;
            SocialButtonTypeDto socialButtonTypeDto2 = new SocialButtonTypeDto("ADD", 1, "add");
            ADD = socialButtonTypeDto2;
            SocialButtonTypeDto[] socialButtonTypeDtoArr = {socialButtonTypeDto, socialButtonTypeDto2};
            $VALUES = socialButtonTypeDtoArr;
            $ENTRIES = new asp(socialButtonTypeDtoArr);
            CREATOR = new a();
        }

        private SocialButtonTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static SocialButtonTypeDto valueOf(String str) {
            return (SocialButtonTypeDto) Enum.valueOf(SocialButtonTypeDto.class, str);
        }

        public static SocialButtonTypeDto[] values() {
            return (SocialButtonTypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UsersUserFullDto.kt */
    public static final class WallDefaultDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ WallDefaultDto[] $VALUES;

        @pmi0("all")
        public static final WallDefaultDto ALL;
        public static final Parcelable.Creator<WallDefaultDto> CREATOR;

        @pmi0("owner")
        public static final WallDefaultDto OWNER;
        private final String value;

        /* compiled from: UsersUserFullDto.kt */
        public static final class a implements Parcelable.Creator<WallDefaultDto> {
            @Override // android.os.Parcelable.Creator
            public final WallDefaultDto createFromParcel(Parcel parcel) {
                return WallDefaultDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final WallDefaultDto[] newArray(int i) {
                return new WallDefaultDto[i];
            }
        }

        static {
            WallDefaultDto wallDefaultDto = new WallDefaultDto("OWNER", 0, "owner");
            OWNER = wallDefaultDto;
            WallDefaultDto wallDefaultDto2 = new WallDefaultDto("ALL", 1, "all");
            ALL = wallDefaultDto2;
            WallDefaultDto[] wallDefaultDtoArr = {wallDefaultDto, wallDefaultDto2};
            $VALUES = wallDefaultDtoArr;
            $ENTRIES = new asp(wallDefaultDtoArr);
            CREATOR = new a();
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

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: UsersUserFullDto.kt */
    public static final class a implements Parcelable.Creator<UsersUserFullDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersUserFullDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean bool;
            BaseBoolIntDto createFromParcel;
            BaseBoolIntDto baseBoolIntDto;
            BaseBoolIntDto createFromParcel2;
            BaseBoolIntDto baseBoolIntDto2;
            BaseBoolIntDto createFromParcel3;
            BaseBoolIntDto baseBoolIntDto3;
            UsersUserTypeDto createFromParcel4;
            UsersUserTypeDto usersUserTypeDto;
            BaseBoolIntDto createFromParcel5;
            BaseBoolIntDto baseBoolIntDto4;
            BaseBoolIntDto createFromParcel6;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            BaseBoolIntDto baseBoolIntDto5;
            BaseBoolIntDto createFromParcel7;
            BaseBoolIntDto baseBoolIntDto6;
            VideoLiveInfoDto createFromParcel8;
            VideoLiveInfoDto videoLiveInfoDto;
            BaseBoolIntDto createFromParcel9;
            Boolean valueOf6;
            BaseBoolIntDto baseBoolIntDto7;
            PhotosPhotoDto createFromParcel10;
            PhotosPhotoDto photosPhotoDto;
            BaseBoolIntDto baseBoolIntDto8;
            ArrayList arrayList;
            UserId userId;
            ArrayList arrayList2;
            int i;
            ArrayList arrayList3;
            Boolean valueOf7;
            UserId userId2;
            AudioMusicAwardsDto createFromParcel11;
            Boolean valueOf8;
            Boolean valueOf9;
            Boolean valueOf10;
            Boolean valueOf11;
            AudioMusicAwardsDto audioMusicAwardsDto;
            BaseBoolIntDto createFromParcel12;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            Boolean valueOf12;
            BaseBoolIntDto baseBoolIntDto9;
            AudioAudioDto createFromParcel13;
            AudioAudioDto audioAudioDto;
            AppsAppMinDto createFromParcel14;
            AppsAppMinDto appsAppMinDto;
            UsersLastSeenDto createFromParcel15;
            UsersLastSeenDto usersLastSeenDto;
            UsersExportsDto createFromParcel16;
            UsersExportsDto usersExportsDto;
            BaseCropPhotoDto createFromParcel17;
            BaseCropPhotoDto baseCropPhotoDto;
            BaseBoolIntDto createFromParcel18;
            BaseBoolIntDto baseBoolIntDto10;
            BaseBoolIntDto createFromParcel19;
            BaseBoolIntDto baseBoolIntDto11;
            BaseBoolIntDto createFromParcel20;
            BaseBoolIntDto baseBoolIntDto12;
            BaseBoolIntDto createFromParcel21;
            BaseBoolIntDto baseBoolIntDto13;
            UsersOccupationDto createFromParcel22;
            UsersOccupationDto usersOccupationDto;
            ArrayList arrayList7;
            ArrayList arrayList8;
            BaseBoolIntDto baseBoolIntDto14;
            ArrayList arrayList9;
            Integer num;
            UsersUserRelationDto createFromParcel23;
            UsersUserRelationDto usersUserRelationDto;
            UsersUserMinDto createFromParcel24;
            UsersUserMinDto usersUserMinDto;
            UsersPersonalDto createFromParcel25;
            UsersPersonalDto usersPersonalDto;
            BaseBoolIntDto baseBoolIntDto15;
            ArrayList arrayList10;
            ArrayList arrayList11;
            ArrayList arrayList12;
            ArrayList arrayList13;
            Boolean valueOf13;
            Boolean valueOf14;
            Boolean valueOf15;
            Boolean valueOf16;
            Boolean valueOf17;
            Boolean bool2;
            UsersEmployeeWorkingStateDto createFromParcel26;
            UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto;
            EmployeeMarkDto createFromParcel27;
            EmployeeMarkDto employeeMarkDto;
            UsersRightsLocationDto createFromParcel28;
            Boolean valueOf18;
            UsersRightsLocationDto usersRightsLocationDto;
            UsersEmojiStatusDto createFromParcel29;
            UsersEmojiStatusDto usersEmojiStatusDto;
            StatusImageStatusDto createFromParcel30;
            StatusImageStatusDto statusImageStatusDto;
            UsersUserCountersDto createFromParcel31;
            UsersUserCountersDto usersUserCountersDto;
            BaseBoolIntDto createFromParcel32;
            Boolean valueOf19;
            Boolean valueOf20;
            Boolean valueOf21;
            BaseBoolIntDto baseBoolIntDto16;
            UsersGiftsTooltipDto createFromParcel33;
            UsersGiftsTooltipDto usersGiftsTooltipDto;
            NoIndexDto createFromParcel34;
            NoIndexDto noIndexDto;
            MessagesContactDto createFromParcel35;
            Boolean valueOf22;
            MessagesContactDto messagesContactDto;
            ArrayList arrayList14;
            ArrayList arrayList15;
            Boolean bool3;
            Boolean valueOf23;
            Boolean valueOf24;
            Integer num2;
            UsersCanNotCallReasonDto createFromParcel36;
            Boolean valueOf25;
            Boolean valueOf26;
            UsersCanNotCallReasonDto usersCanNotCallReasonDto;
            BaseImageDto createFromParcel37;
            BaseImageDto baseImageDto;
            ArrayList arrayList16;
            ArrayList arrayList17;
            UsersUserProfileTypeDto usersUserProfileTypeDto;
            Boolean valueOf27;
            Boolean valueOf28;
            Boolean valueOf29;
            Boolean valueOf30;
            Boolean valueOf31;
            Boolean valueOf32;
            Boolean valueOf33;
            Boolean valueOf34;
            Boolean valueOf35;
            Boolean valueOf36;
            Boolean bool4;
            UsersPromotionAllowanceDto createFromParcel38;
            Boolean valueOf37;
            Boolean valueOf38;
            UsersPromotionAllowanceDto usersPromotionAllowanceDto;
            MessagesEduEducationalProfileDto createFromParcel39;
            MessagesEduEducationalProfileDto messagesEduEducationalProfileDto;
            BaseAPlusMarkDto createFromParcel40;
            Boolean valueOf39;
            Boolean valueOf40;
            Boolean valueOf41;
            BaseAPlusMarkDto baseAPlusMarkDto;
            UsersDonutDto createFromParcel41;
            UsersDonutDto usersDonutDto;
            BaseSexDto createFromParcel42;
            BaseSexDto baseSexDto;
            UsersOnlineInfoDto createFromParcel43;
            UsersOnlineInfoDto usersOnlineInfoDto;
            BaseBoolIntDto createFromParcel44;
            BaseBoolIntDto baseBoolIntDto17;
            BaseBoolIntDto createFromParcel45;
            BaseBoolIntDto baseBoolIntDto18;
            BaseBoolIntDto createFromParcel46;
            BaseBoolIntDto baseBoolIntDto19;
            BaseBoolIntDto createFromParcel47;
            BaseBoolIntDto baseBoolIntDto20;
            FriendsFriendStatusStatusDto createFromParcel48;
            FriendsFriendStatusStatusDto friendsFriendStatusStatusDto;
            FriendsRequestsMutualDto createFromParcel49;
            Boolean valueOf42;
            Boolean valueOf43;
            Boolean valueOf44;
            UserId userId3 = (UserId) parcel.readParcelable(UsersUserFullDto.class.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            String readString17 = parcel.readString();
            BdateVisibilityDto createFromParcel50 = parcel.readInt() == 0 ? null : BdateVisibilityDto.CREATOR.createFromParcel(parcel);
            BaseCityDto createFromParcel51 = parcel.readInt() == 0 ? null : BaseCityDto.CREATOR.createFromParcel(parcel);
            BaseCountryDto createFromParcel52 = parcel.readInt() == 0 ? null : BaseCountryDto.CREATOR.createFromParcel(parcel);
            Float valueOf45 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            OwnerStateDto createFromParcel53 = parcel.readInt() == 0 ? null : OwnerStateDto.CREATOR.createFromParcel(parcel);
            String readString18 = parcel.readString();
            String readString19 = parcel.readString();
            String readString20 = parcel.readString();
            String readString21 = parcel.readString();
            String readString22 = parcel.readString();
            String readString23 = parcel.readString();
            BaseBoolIntDto createFromParcel54 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            BaseOwnerCoverDto createFromParcel55 = parcel.readInt() == 0 ? null : BaseOwnerCoverDto.CREATOR.createFromParcel(parcel);
            String readString24 = parcel.readString();
            BaseBoolIntDto createFromParcel56 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto createFromParcel57 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            BaseBoolIntDto createFromParcel58 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                bool = valueOf;
                createFromParcel = null;
            } else {
                bool = valueOf;
                createFromParcel = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto21 = createFromParcel;
            if (parcel.readInt() == 0) {
                baseBoolIntDto = baseBoolIntDto21;
                createFromParcel2 = null;
            } else {
                baseBoolIntDto = baseBoolIntDto21;
                createFromParcel2 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto22 = createFromParcel2;
            if (parcel.readInt() == 0) {
                baseBoolIntDto2 = baseBoolIntDto22;
                createFromParcel3 = null;
            } else {
                baseBoolIntDto2 = baseBoolIntDto22;
                createFromParcel3 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto23 = createFromParcel3;
            if (parcel.readInt() == 0) {
                baseBoolIntDto3 = baseBoolIntDto23;
                createFromParcel4 = null;
            } else {
                baseBoolIntDto3 = baseBoolIntDto23;
                createFromParcel4 = UsersUserTypeDto.CREATOR.createFromParcel(parcel);
            }
            UsersUserTypeDto usersUserTypeDto2 = createFromParcel4;
            BaseBoolIntDto baseBoolIntDto24 = baseBoolIntDto;
            BaseBoolIntDto baseBoolIntDto25 = baseBoolIntDto3;
            String readString25 = parcel.readString();
            String readString26 = parcel.readString();
            String readString27 = parcel.readString();
            String readString28 = parcel.readString();
            String readString29 = parcel.readString();
            if (parcel.readInt() == 0) {
                usersUserTypeDto = usersUserTypeDto2;
                createFromParcel5 = null;
            } else {
                usersUserTypeDto = usersUserTypeDto2;
                createFromParcel5 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto26 = createFromParcel5;
            if (parcel.readInt() == 0) {
                baseBoolIntDto4 = baseBoolIntDto26;
                createFromParcel6 = null;
            } else {
                baseBoolIntDto4 = baseBoolIntDto26;
                createFromParcel6 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto27 = createFromParcel6;
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
            String readString30 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto28 = baseBoolIntDto4;
            Boolean bool5 = valueOf2;
            Boolean bool6 = valueOf3;
            Boolean bool7 = valueOf4;
            Boolean bool8 = valueOf5;
            String readString31 = parcel.readString();
            String readString32 = parcel.readString();
            if (parcel.readInt() == 0) {
                baseBoolIntDto5 = baseBoolIntDto27;
                createFromParcel7 = null;
            } else {
                baseBoolIntDto5 = baseBoolIntDto27;
                createFromParcel7 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto29 = createFromParcel7;
            if (parcel.readInt() == 0) {
                baseBoolIntDto6 = baseBoolIntDto29;
                createFromParcel8 = null;
            } else {
                baseBoolIntDto6 = baseBoolIntDto29;
                createFromParcel8 = VideoLiveInfoDto.CREATOR.createFromParcel(parcel);
            }
            VideoLiveInfoDto videoLiveInfoDto2 = createFromParcel8;
            if (parcel.readInt() == 0) {
                videoLiveInfoDto = videoLiveInfoDto2;
                createFromParcel9 = null;
            } else {
                videoLiveInfoDto = videoLiveInfoDto2;
                createFromParcel9 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto30 = createFromParcel9;
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString33 = parcel.readString();
            Boolean bool9 = bool;
            BaseBoolIntDto baseBoolIntDto31 = baseBoolIntDto2;
            UsersUserTypeDto usersUserTypeDto3 = usersUserTypeDto;
            BaseBoolIntDto baseBoolIntDto32 = baseBoolIntDto5;
            VideoLiveInfoDto videoLiveInfoDto3 = videoLiveInfoDto;
            Boolean bool10 = valueOf6;
            String readString34 = parcel.readString();
            String readString35 = parcel.readString();
            String readString36 = parcel.readString();
            String readString37 = parcel.readString();
            String readString38 = parcel.readString();
            String readString39 = parcel.readString();
            if (parcel.readInt() == 0) {
                baseBoolIntDto7 = baseBoolIntDto30;
                createFromParcel10 = null;
            } else {
                baseBoolIntDto7 = baseBoolIntDto30;
                createFromParcel10 = PhotosPhotoDto.CREATOR.createFromParcel(parcel);
            }
            PhotosPhotoDto photosPhotoDto2 = createFromParcel10;
            if (parcel.readInt() == 0) {
                photosPhotoDto = photosPhotoDto2;
                baseBoolIntDto8 = createFromParcel58;
                userId = userId3;
                arrayList = null;
            } else {
                photosPhotoDto = photosPhotoDto2;
                int readInt = parcel.readInt();
                baseBoolIntDto8 = createFromParcel58;
                arrayList = new ArrayList(readInt);
                userId = userId3;
                int i2 = 0;
                while (i2 != readInt) {
                    int i3 = readInt;
                    int readInt2 = parcel.readInt();
                    int i4 = i2;
                    ArrayList arrayList18 = new ArrayList(readInt2);
                    String str = readString;
                    int i5 = 0;
                    while (i5 != readInt2) {
                        i5 = en.a(UsersProfileButtonDto.CREATOR, parcel, arrayList18, i5, 1);
                        readInt2 = readInt2;
                        readString2 = readString2;
                    }
                    arrayList.add(arrayList18);
                    i2 = i4 + 1;
                    readInt = i3;
                    readString = str;
                }
            }
            String str2 = readString;
            String str3 = readString2;
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                int i6 = 0;
                while (i6 != readInt3) {
                    int readInt4 = parcel.readInt();
                    int i7 = readInt3;
                    ArrayList arrayList19 = new ArrayList(readInt4);
                    ArrayList arrayList20 = arrayList;
                    int i8 = 0;
                    while (true) {
                        i = i6;
                        if (i8 != readInt4) {
                            i8 = en.a(UsersProfileButtonDto.CREATOR, parcel, arrayList19, i8, 1);
                            i6 = i;
                            readInt4 = readInt4;
                        }
                    }
                    arrayList2.add(arrayList19);
                    i6 = i + 1;
                    readInt3 = i7;
                    arrayList = arrayList20;
                }
            }
            ArrayList arrayList21 = arrayList;
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList3 = new ArrayList(readInt5);
                int i9 = 0;
                while (i9 != readInt5) {
                    i9 = en.a(UsersProfileButtonDto.CREATOR, parcel, arrayList3, i9, 1);
                    readInt5 = readInt5;
                }
            }
            UserId userId4 = userId;
            String readString40 = parcel.readString();
            Integer valueOf46 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf7 = null;
            } else {
                valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            WallDefaultDto createFromParcel59 = parcel.readInt() == 0 ? null : WallDefaultDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                userId2 = userId4;
                createFromParcel11 = null;
            } else {
                userId2 = userId4;
                createFromParcel11 = AudioMusicAwardsDto.CREATOR.createFromParcel(parcel);
            }
            AudioMusicAwardsDto audioMusicAwardsDto2 = createFromParcel11;
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
            if (parcel.readInt() == 0) {
                valueOf11 = null;
            } else {
                valueOf11 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                audioMusicAwardsDto = audioMusicAwardsDto2;
                createFromParcel12 = null;
            } else {
                audioMusicAwardsDto = audioMusicAwardsDto2;
                createFromParcel12 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto33 = createFromParcel12;
            if (parcel.readInt() == 0) {
                arrayList4 = arrayList3;
                arrayList6 = arrayList2;
                arrayList5 = null;
            } else {
                int readInt6 = parcel.readInt();
                arrayList4 = arrayList3;
                arrayList5 = new ArrayList(readInt6);
                arrayList6 = arrayList2;
                int i10 = 0;
                while (i10 != readInt6) {
                    i10 = en.a(BaseOwnerButtonDto.CREATOR, parcel, arrayList5, i10, 1);
                    readInt6 = readInt6;
                    valueOf7 = valueOf7;
                }
                baseBoolIntDto33 = baseBoolIntDto33;
            }
            Boolean bool11 = valueOf7;
            String readString41 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto34 = baseBoolIntDto8;
            ArrayList arrayList22 = arrayList4;
            String readString42 = parcel.readString();
            PhotosPhotoDto photosPhotoDto3 = photosPhotoDto;
            ArrayList arrayList23 = arrayList6;
            String readString43 = parcel.readString();
            String readString44 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto35 = baseBoolIntDto6;
            BaseBoolIntDto baseBoolIntDto36 = baseBoolIntDto7;
            String readString45 = parcel.readString();
            String readString46 = parcel.readString();
            String readString47 = parcel.readString();
            String readString48 = parcel.readString();
            String readString49 = parcel.readString();
            BaseBoolIntDto createFromParcel60 = parcel.readInt() != 0 ? BaseBoolIntDto.CREATOR.createFromParcel(parcel) : null;
            BaseBoolIntDto createFromParcel61 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf12 = null;
            } else {
                valueOf12 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString50 = parcel.readString();
            Boolean bool12 = valueOf12;
            String readString51 = parcel.readString();
            String readString52 = parcel.readString();
            if (parcel.readInt() == 0) {
                baseBoolIntDto9 = baseBoolIntDto33;
                createFromParcel13 = null;
            } else {
                baseBoolIntDto9 = baseBoolIntDto33;
                createFromParcel13 = AudioAudioDto.CREATOR.createFromParcel(parcel);
            }
            AudioAudioDto audioAudioDto2 = createFromParcel13;
            String str4 = str2;
            Boolean bool13 = valueOf8;
            Boolean bool14 = valueOf9;
            Boolean bool15 = valueOf10;
            Boolean bool16 = valueOf11;
            BaseBoolIntDto baseBoolIntDto37 = baseBoolIntDto9;
            String readString53 = parcel.readString();
            String readString54 = parcel.readString();
            if (parcel.readInt() == 0) {
                audioAudioDto = audioAudioDto2;
                createFromParcel14 = null;
            } else {
                audioAudioDto = audioAudioDto2;
                createFromParcel14 = AppsAppMinDto.CREATOR.createFromParcel(parcel);
            }
            AppsAppMinDto appsAppMinDto2 = createFromParcel14;
            if (parcel.readInt() == 0) {
                appsAppMinDto = appsAppMinDto2;
                createFromParcel15 = null;
            } else {
                appsAppMinDto = appsAppMinDto2;
                createFromParcel15 = UsersLastSeenDto.CREATOR.createFromParcel(parcel);
            }
            UsersLastSeenDto usersLastSeenDto2 = createFromParcel15;
            if (parcel.readInt() == 0) {
                usersLastSeenDto = usersLastSeenDto2;
                createFromParcel16 = null;
            } else {
                usersLastSeenDto = usersLastSeenDto2;
                createFromParcel16 = UsersExportsDto.CREATOR.createFromParcel(parcel);
            }
            UsersExportsDto usersExportsDto2 = createFromParcel16;
            if (parcel.readInt() == 0) {
                usersExportsDto = usersExportsDto2;
                createFromParcel17 = null;
            } else {
                usersExportsDto = usersExportsDto2;
                createFromParcel17 = BaseCropPhotoDto.CREATOR.createFromParcel(parcel);
            }
            BaseCropPhotoDto baseCropPhotoDto2 = createFromParcel17;
            Integer valueOf47 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf48 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf49 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf50 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                baseCropPhotoDto = baseCropPhotoDto2;
                createFromParcel18 = null;
            } else {
                baseCropPhotoDto = baseCropPhotoDto2;
                createFromParcel18 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto38 = createFromParcel18;
            if (parcel.readInt() == 0) {
                baseBoolIntDto10 = baseBoolIntDto38;
                createFromParcel19 = null;
            } else {
                baseBoolIntDto10 = baseBoolIntDto38;
                createFromParcel19 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto39 = createFromParcel19;
            if (parcel.readInt() == 0) {
                baseBoolIntDto11 = baseBoolIntDto39;
                createFromParcel20 = null;
            } else {
                baseBoolIntDto11 = baseBoolIntDto39;
                createFromParcel20 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto40 = createFromParcel20;
            if (parcel.readInt() == 0) {
                baseBoolIntDto12 = baseBoolIntDto40;
                createFromParcel21 = null;
            } else {
                baseBoolIntDto12 = baseBoolIntDto40;
                createFromParcel21 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto41 = createFromParcel21;
            Integer valueOf51 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                baseBoolIntDto13 = baseBoolIntDto41;
                createFromParcel22 = null;
            } else {
                baseBoolIntDto13 = baseBoolIntDto41;
                createFromParcel22 = UsersOccupationDto.CREATOR.createFromParcel(parcel);
            }
            UsersOccupationDto usersOccupationDto2 = createFromParcel22;
            if (parcel.readInt() == 0) {
                usersOccupationDto = usersOccupationDto2;
                arrayList7 = arrayList5;
                baseBoolIntDto14 = createFromParcel60;
                arrayList8 = null;
            } else {
                usersOccupationDto = usersOccupationDto2;
                int readInt7 = parcel.readInt();
                arrayList7 = arrayList5;
                arrayList8 = new ArrayList(readInt7);
                baseBoolIntDto14 = createFromParcel60;
                int i11 = 0;
                while (i11 != readInt7) {
                    i11 = en.a(UsersCareerDto.CREATOR, parcel, arrayList8, i11, 1);
                    readInt7 = readInt7;
                    str4 = str4;
                }
            }
            String str5 = str4;
            if (parcel.readInt() == 0) {
                arrayList9 = null;
            } else {
                int readInt8 = parcel.readInt();
                arrayList9 = new ArrayList(readInt8);
                int i12 = 0;
                while (i12 != readInt8) {
                    i12 = en.a(UsersMilitaryDto.CREATOR, parcel, arrayList9, i12, 1);
                    readInt8 = readInt8;
                    arrayList8 = arrayList8;
                }
            }
            ArrayList arrayList24 = arrayList8;
            Integer valueOf52 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto baseBoolIntDto42 = baseBoolIntDto14;
            String readString55 = parcel.readString();
            Integer valueOf53 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf54 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            AudioAudioDto audioAudioDto3 = audioAudioDto;
            UsersLastSeenDto usersLastSeenDto3 = usersLastSeenDto;
            BaseCropPhotoDto baseCropPhotoDto3 = baseCropPhotoDto;
            BaseBoolIntDto baseBoolIntDto43 = baseBoolIntDto11;
            BaseBoolIntDto baseBoolIntDto44 = baseBoolIntDto13;
            String readString56 = parcel.readString();
            Integer valueOf55 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString57 = parcel.readString();
            Integer num3 = valueOf55;
            String readString58 = parcel.readString();
            String readString59 = parcel.readString();
            if (parcel.readInt() == 0) {
                num = valueOf52;
                createFromParcel23 = null;
            } else {
                num = valueOf52;
                createFromParcel23 = UsersUserRelationDto.CREATOR.createFromParcel(parcel);
            }
            UsersUserRelationDto usersUserRelationDto2 = createFromParcel23;
            if (parcel.readInt() == 0) {
                usersUserRelationDto = usersUserRelationDto2;
                createFromParcel24 = null;
            } else {
                usersUserRelationDto = usersUserRelationDto2;
                createFromParcel24 = UsersUserMinDto.CREATOR.createFromParcel(parcel);
            }
            UsersUserMinDto usersUserMinDto2 = createFromParcel24;
            if (parcel.readInt() == 0) {
                usersUserMinDto = usersUserMinDto2;
                createFromParcel25 = null;
            } else {
                usersUserMinDto = usersUserMinDto2;
                createFromParcel25 = UsersPersonalDto.CREATOR.createFromParcel(parcel);
            }
            UsersPersonalDto usersPersonalDto2 = createFromParcel25;
            if (parcel.readInt() == 0) {
                usersPersonalDto = usersPersonalDto2;
                baseBoolIntDto15 = baseBoolIntDto24;
                arrayList11 = arrayList9;
                arrayList10 = null;
            } else {
                usersPersonalDto = usersPersonalDto2;
                int readInt9 = parcel.readInt();
                baseBoolIntDto15 = baseBoolIntDto24;
                arrayList10 = new ArrayList(readInt9);
                arrayList11 = arrayList9;
                int i13 = 0;
                while (i13 != readInt9) {
                    i13 = en.a(UsersUniversityDto.CREATOR, parcel, arrayList10, i13, 1);
                    readInt9 = readInt9;
                    valueOf54 = valueOf54;
                }
            }
            Integer num4 = valueOf54;
            if (parcel.readInt() == 0) {
                arrayList12 = null;
            } else {
                int readInt10 = parcel.readInt();
                arrayList12 = new ArrayList(readInt10);
                int i14 = 0;
                while (i14 != readInt10) {
                    i14 = en.a(UsersSchoolDto.CREATOR, parcel, arrayList12, i14, 1);
                    readInt10 = readInt10;
                    arrayList10 = arrayList10;
                }
            }
            ArrayList arrayList25 = arrayList10;
            if (parcel.readInt() == 0) {
                arrayList13 = null;
            } else {
                int readInt11 = parcel.readInt();
                arrayList13 = new ArrayList(readInt11);
                int i15 = 0;
                while (i15 != readInt11) {
                    i15 = en.a(UsersRelativeDto.CREATOR, parcel, arrayList13, i15, 1);
                    readInt11 = readInt11;
                    arrayList12 = arrayList12;
                }
            }
            ArrayList arrayList26 = arrayList12;
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
                valueOf15 = null;
            } else {
                valueOf15 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf16 = null;
            } else {
                valueOf16 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf17 = null;
            } else {
                valueOf17 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString60 = parcel.readString();
            if (parcel.readInt() == 0) {
                bool2 = valueOf13;
                createFromParcel26 = null;
            } else {
                bool2 = valueOf13;
                createFromParcel26 = UsersEmployeeWorkingStateDto.CREATOR.createFromParcel(parcel);
            }
            UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto2 = createFromParcel26;
            if (parcel.readInt() == 0) {
                usersEmployeeWorkingStateDto = usersEmployeeWorkingStateDto2;
                createFromParcel27 = null;
            } else {
                usersEmployeeWorkingStateDto = usersEmployeeWorkingStateDto2;
                createFromParcel27 = EmployeeMarkDto.CREATOR.createFromParcel(parcel);
            }
            EmployeeMarkDto employeeMarkDto2 = createFromParcel27;
            if (parcel.readInt() == 0) {
                employeeMarkDto = employeeMarkDto2;
                createFromParcel28 = null;
            } else {
                employeeMarkDto = employeeMarkDto2;
                createFromParcel28 = UsersRightsLocationDto.CREATOR.createFromParcel(parcel);
            }
            UsersRightsLocationDto usersRightsLocationDto2 = createFromParcel28;
            if (parcel.readInt() == 0) {
                valueOf18 = null;
            } else {
                valueOf18 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                usersRightsLocationDto = usersRightsLocationDto2;
                createFromParcel29 = null;
            } else {
                usersRightsLocationDto = usersRightsLocationDto2;
                createFromParcel29 = UsersEmojiStatusDto.CREATOR.createFromParcel(parcel);
            }
            UsersEmojiStatusDto usersEmojiStatusDto2 = createFromParcel29;
            if (parcel.readInt() == 0) {
                usersEmojiStatusDto = usersEmojiStatusDto2;
                createFromParcel30 = null;
            } else {
                usersEmojiStatusDto = usersEmojiStatusDto2;
                createFromParcel30 = StatusImageStatusDto.CREATOR.createFromParcel(parcel);
            }
            StatusImageStatusDto statusImageStatusDto2 = createFromParcel30;
            if (parcel.readInt() == 0) {
                statusImageStatusDto = statusImageStatusDto2;
                createFromParcel31 = null;
            } else {
                statusImageStatusDto = statusImageStatusDto2;
                createFromParcel31 = UsersUserCountersDto.CREATOR.createFromParcel(parcel);
            }
            UsersUserCountersDto usersUserCountersDto2 = createFromParcel31;
            UsersUserRelationDto usersUserRelationDto3 = usersUserRelationDto;
            UsersPersonalDto usersPersonalDto3 = usersPersonalDto;
            Boolean bool17 = valueOf17;
            UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto3 = usersEmployeeWorkingStateDto;
            UsersRightsLocationDto usersRightsLocationDto3 = usersRightsLocationDto;
            StatusImageStatusDto statusImageStatusDto3 = statusImageStatusDto;
            String readString61 = parcel.readString();
            if (parcel.readInt() == 0) {
                usersUserCountersDto = usersUserCountersDto2;
                createFromParcel32 = null;
            } else {
                usersUserCountersDto = usersUserCountersDto2;
                createFromParcel32 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto45 = createFromParcel32;
            if (parcel.readInt() == 0) {
                valueOf19 = null;
            } else {
                valueOf19 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            AppsAppMinDto appsAppMinDto3 = appsAppMinDto;
            UsersExportsDto usersExportsDto3 = usersExportsDto;
            Integer num5 = valueOf47;
            Integer num6 = valueOf48;
            Integer num7 = valueOf49;
            Integer num8 = valueOf50;
            BaseBoolIntDto baseBoolIntDto46 = baseBoolIntDto10;
            BaseBoolIntDto baseBoolIntDto47 = baseBoolIntDto12;
            Integer num9 = valueOf51;
            UsersOccupationDto usersOccupationDto3 = usersOccupationDto;
            ArrayList arrayList27 = arrayList11;
            Boolean bool18 = bool2;
            EmployeeMarkDto employeeMarkDto3 = employeeMarkDto;
            Boolean bool19 = valueOf18;
            UsersEmojiStatusDto usersEmojiStatusDto3 = usersEmojiStatusDto;
            UsersUserCountersDto usersUserCountersDto3 = usersUserCountersDto;
            Boolean bool20 = valueOf19;
            String readString62 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf20 = null;
            } else {
                valueOf20 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf21 = null;
            } else {
                valueOf21 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                baseBoolIntDto16 = baseBoolIntDto45;
                createFromParcel33 = null;
            } else {
                baseBoolIntDto16 = baseBoolIntDto45;
                createFromParcel33 = UsersGiftsTooltipDto.CREATOR.createFromParcel(parcel);
            }
            UsersGiftsTooltipDto usersGiftsTooltipDto2 = createFromParcel33;
            if (parcel.readInt() == 0) {
                usersGiftsTooltipDto = usersGiftsTooltipDto2;
                createFromParcel34 = null;
            } else {
                usersGiftsTooltipDto = usersGiftsTooltipDto2;
                createFromParcel34 = NoIndexDto.CREATOR.createFromParcel(parcel);
            }
            NoIndexDto noIndexDto2 = createFromParcel34;
            Integer valueOf56 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                noIndexDto = noIndexDto2;
                createFromParcel35 = null;
            } else {
                noIndexDto = noIndexDto2;
                createFromParcel35 = MessagesContactDto.CREATOR.createFromParcel(parcel);
            }
            MessagesContactDto messagesContactDto2 = createFromParcel35;
            if (parcel.readInt() == 0) {
                valueOf22 = null;
            } else {
                valueOf22 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                messagesContactDto = messagesContactDto2;
                arrayList14 = arrayList13;
                bool3 = valueOf15;
                arrayList15 = null;
            } else {
                messagesContactDto = messagesContactDto2;
                int readInt12 = parcel.readInt();
                arrayList14 = arrayList13;
                arrayList15 = new ArrayList(readInt12);
                bool3 = valueOf15;
                int i16 = 0;
                while (i16 != readInt12) {
                    i16 = pm0.b(parcel, arrayList15, i16, 1);
                    readInt12 = readInt12;
                }
            }
            Integer valueOf57 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto baseBoolIntDto48 = baseBoolIntDto15;
            ArrayList arrayList28 = arrayList14;
            String readString63 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf23 = null;
            } else {
                valueOf23 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf24 = null;
            } else {
                valueOf24 = Boolean.valueOf(parcel.readInt() != 0);
            }
            UsersUserProfileTypeDto createFromParcel62 = parcel.readInt() == 0 ? null : UsersUserProfileTypeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                num2 = valueOf57;
                createFromParcel36 = null;
            } else {
                num2 = valueOf57;
                createFromParcel36 = UsersCanNotCallReasonDto.CREATOR.createFromParcel(parcel);
            }
            UsersCanNotCallReasonDto usersCanNotCallReasonDto2 = createFromParcel36;
            if (parcel.readInt() == 0) {
                valueOf25 = null;
            } else {
                valueOf25 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf26 = null;
            } else {
                valueOf26 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                usersCanNotCallReasonDto = usersCanNotCallReasonDto2;
                createFromParcel37 = null;
            } else {
                usersCanNotCallReasonDto = usersCanNotCallReasonDto2;
                createFromParcel37 = BaseImageDto.CREATOR.createFromParcel(parcel);
            }
            BaseImageDto baseImageDto2 = createFromParcel37;
            if (parcel.readInt() == 0) {
                baseImageDto = baseImageDto2;
                arrayList16 = arrayList15;
                usersUserProfileTypeDto = createFromParcel62;
                arrayList17 = null;
            } else {
                baseImageDto = baseImageDto2;
                int readInt13 = parcel.readInt();
                arrayList16 = arrayList15;
                arrayList17 = new ArrayList(readInt13);
                usersUserProfileTypeDto = createFromParcel62;
                int i17 = 0;
                while (i17 != readInt13) {
                    i17 = en.a(CallsCustomNameForCallDto.CREATOR, parcel, arrayList17, i17, 1);
                    readInt13 = readInt13;
                    valueOf16 = valueOf16;
                }
            }
            Boolean bool21 = valueOf16;
            if (parcel.readInt() == 0) {
                valueOf27 = null;
            } else {
                valueOf27 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf28 = null;
            } else {
                valueOf28 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf29 = null;
            } else {
                valueOf29 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf30 = null;
            } else {
                valueOf30 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf31 = null;
            } else {
                valueOf31 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf32 = null;
            } else {
                valueOf32 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf33 = null;
            } else {
                valueOf33 = Boolean.valueOf(parcel.readInt() != 0);
            }
            SocialButtonTypeDto createFromParcel63 = parcel.readInt() == 0 ? null : SocialButtonTypeDto.CREATOR.createFromParcel(parcel);
            String readString64 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf34 = null;
            } else {
                valueOf34 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
            Boolean bool22 = valueOf34;
            ArrayList<String> createStringArrayList4 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                valueOf35 = null;
            } else {
                valueOf35 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf58 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf59 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf36 = null;
            } else {
                valueOf36 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool4 = valueOf27;
                createFromParcel38 = null;
            } else {
                bool4 = valueOf27;
                createFromParcel38 = UsersPromotionAllowanceDto.CREATOR.createFromParcel(parcel);
            }
            UsersPromotionAllowanceDto usersPromotionAllowanceDto2 = createFromParcel38;
            if (parcel.readInt() == 0) {
                valueOf37 = null;
            } else {
                valueOf37 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf60 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf38 = null;
            } else {
                valueOf38 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                usersPromotionAllowanceDto = usersPromotionAllowanceDto2;
                createFromParcel39 = null;
            } else {
                usersPromotionAllowanceDto = usersPromotionAllowanceDto2;
                createFromParcel39 = MessagesEduEducationalProfileDto.CREATOR.createFromParcel(parcel);
            }
            MessagesEduEducationalProfileDto messagesEduEducationalProfileDto2 = createFromParcel39;
            if (parcel.readInt() == 0) {
                messagesEduEducationalProfileDto = messagesEduEducationalProfileDto2;
                createFromParcel40 = null;
            } else {
                messagesEduEducationalProfileDto = messagesEduEducationalProfileDto2;
                createFromParcel40 = BaseAPlusMarkDto.CREATOR.createFromParcel(parcel);
            }
            BaseAPlusMarkDto baseAPlusMarkDto2 = createFromParcel40;
            if (parcel.readInt() == 0) {
                valueOf39 = null;
            } else {
                valueOf39 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf40 = null;
            } else {
                valueOf40 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf41 = null;
            } else {
                valueOf41 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                baseAPlusMarkDto = baseAPlusMarkDto2;
                createFromParcel41 = null;
            } else {
                baseAPlusMarkDto = baseAPlusMarkDto2;
                createFromParcel41 = UsersDonutDto.CREATOR.createFromParcel(parcel);
            }
            UsersDonutDto usersDonutDto2 = createFromParcel41;
            if (parcel.readInt() == 0) {
                usersDonutDto = usersDonutDto2;
                createFromParcel42 = null;
            } else {
                usersDonutDto = usersDonutDto2;
                createFromParcel42 = BaseSexDto.CREATOR.createFromParcel(parcel);
            }
            BaseSexDto baseSexDto2 = createFromParcel42;
            Boolean bool23 = valueOf20;
            Boolean bool24 = valueOf21;
            UsersGiftsTooltipDto usersGiftsTooltipDto3 = usersGiftsTooltipDto;
            Integer num10 = valueOf56;
            MessagesContactDto messagesContactDto3 = messagesContactDto;
            Integer num11 = num2;
            Boolean bool25 = valueOf25;
            Boolean bool26 = valueOf26;
            BaseImageDto baseImageDto3 = baseImageDto;
            Boolean bool27 = bool4;
            Boolean bool28 = valueOf37;
            Integer num12 = valueOf60;
            Boolean bool29 = valueOf38;
            MessagesEduEducationalProfileDto messagesEduEducationalProfileDto3 = messagesEduEducationalProfileDto;
            Boolean bool30 = valueOf39;
            Boolean bool31 = valueOf40;
            Boolean bool32 = valueOf41;
            UsersDonutDto usersDonutDto3 = usersDonutDto;
            String readString65 = parcel.readString();
            String readString66 = parcel.readString();
            String readString67 = parcel.readString();
            String readString68 = parcel.readString();
            if (parcel.readInt() == 0) {
                baseSexDto = baseSexDto2;
                createFromParcel43 = null;
            } else {
                baseSexDto = baseSexDto2;
                createFromParcel43 = UsersOnlineInfoDto.CREATOR.createFromParcel(parcel);
            }
            UsersOnlineInfoDto usersOnlineInfoDto2 = createFromParcel43;
            if (parcel.readInt() == 0) {
                usersOnlineInfoDto = usersOnlineInfoDto2;
                createFromParcel44 = null;
            } else {
                usersOnlineInfoDto = usersOnlineInfoDto2;
                createFromParcel44 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto49 = createFromParcel44;
            if (parcel.readInt() == 0) {
                baseBoolIntDto17 = baseBoolIntDto49;
                createFromParcel45 = null;
            } else {
                baseBoolIntDto17 = baseBoolIntDto49;
                createFromParcel45 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto50 = createFromParcel45;
            Integer valueOf61 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                baseBoolIntDto18 = baseBoolIntDto50;
                createFromParcel46 = null;
            } else {
                baseBoolIntDto18 = baseBoolIntDto50;
                createFromParcel46 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto51 = createFromParcel46;
            if (parcel.readInt() == 0) {
                baseBoolIntDto19 = baseBoolIntDto51;
                createFromParcel47 = null;
            } else {
                baseBoolIntDto19 = baseBoolIntDto51;
                createFromParcel47 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto52 = createFromParcel47;
            if (parcel.readInt() == 0) {
                baseBoolIntDto20 = baseBoolIntDto52;
                createFromParcel48 = null;
            } else {
                baseBoolIntDto20 = baseBoolIntDto52;
                createFromParcel48 = FriendsFriendStatusStatusDto.CREATOR.createFromParcel(parcel);
            }
            FriendsFriendStatusStatusDto friendsFriendStatusStatusDto2 = createFromParcel48;
            if (parcel.readInt() == 0) {
                friendsFriendStatusStatusDto = friendsFriendStatusStatusDto2;
                createFromParcel49 = null;
            } else {
                friendsFriendStatusStatusDto = friendsFriendStatusStatusDto2;
                createFromParcel49 = FriendsRequestsMutualDto.CREATOR.createFromParcel(parcel);
            }
            FriendsRequestsMutualDto friendsRequestsMutualDto = createFromParcel49;
            Boolean bool33 = valueOf35;
            Integer num13 = valueOf58;
            Integer num14 = valueOf59;
            Boolean bool34 = valueOf36;
            UsersPromotionAllowanceDto usersPromotionAllowanceDto3 = usersPromotionAllowanceDto;
            BaseAPlusMarkDto baseAPlusMarkDto3 = baseAPlusMarkDto;
            BaseSexDto baseSexDto3 = baseSexDto;
            BaseBoolIntDto baseBoolIntDto53 = baseBoolIntDto17;
            Integer num15 = valueOf61;
            BaseBoolIntDto baseBoolIntDto54 = baseBoolIntDto19;
            FriendsFriendStatusStatusDto friendsFriendStatusStatusDto3 = friendsFriendStatusStatusDto;
            String readString69 = parcel.readString();
            boolean z = true;
            String readString70 = parcel.readString();
            Integer valueOf62 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString71 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf42 = null;
            } else {
                valueOf42 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf43 = null;
            } else {
                valueOf43 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf44 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                valueOf44 = Boolean.valueOf(z);
            }
            return new UsersUserFullDto(userId2, str5, str3, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, readString14, readString15, readString16, readString17, createFromParcel50, createFromParcel51, createFromParcel52, valueOf45, createFromParcel53, readString18, readString19, readString20, readString21, readString22, readString23, createFromParcel54, createFromParcel55, readString24, createFromParcel56, createFromParcel57, bool9, baseBoolIntDto34, baseBoolIntDto48, baseBoolIntDto31, baseBoolIntDto25, usersUserTypeDto3, readString25, readString26, readString27, readString28, readString29, baseBoolIntDto28, baseBoolIntDto32, bool5, bool6, bool7, bool8, readString30, readString31, readString32, baseBoolIntDto35, videoLiveInfoDto3, baseBoolIntDto36, bool10, readString33, readString34, readString35, readString36, readString37, readString38, readString39, photosPhotoDto3, arrayList21, arrayList23, arrayList22, readString40, valueOf46, bool11, createFromParcel59, audioMusicAwardsDto, bool13, bool14, bool15, bool16, baseBoolIntDto37, arrayList7, readString41, readString42, readString43, readString44, readString45, readString46, readString47, readString48, readString49, baseBoolIntDto42, createFromParcel61, bool12, readString50, readString51, readString52, audioAudioDto3, readString53, readString54, appsAppMinDto3, usersLastSeenDto3, usersExportsDto3, baseCropPhotoDto3, num5, num6, num7, num8, baseBoolIntDto46, baseBoolIntDto43, baseBoolIntDto47, baseBoolIntDto44, num9, usersOccupationDto3, arrayList24, arrayList27, num, readString55, valueOf53, num4, readString56, num3, readString57, readString58, readString59, usersUserRelationDto3, usersUserMinDto, usersPersonalDto3, arrayList25, arrayList26, arrayList28, bool18, valueOf14, bool3, bool21, bool17, readString60, usersEmployeeWorkingStateDto3, employeeMarkDto3, usersRightsLocationDto3, bool19, usersEmojiStatusDto3, statusImageStatusDto3, usersUserCountersDto3, readString61, baseBoolIntDto16, bool20, createStringArrayList, readString62, bool23, bool24, usersGiftsTooltipDto3, noIndexDto, num10, messagesContactDto3, valueOf22, createStringArrayList2, arrayList16, num11, readString63, valueOf23, valueOf24, usersUserProfileTypeDto, usersCanNotCallReasonDto, bool25, bool26, baseImageDto3, arrayList17, bool27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, createFromParcel63, readString64, bool22, createStringArrayList3, createStringArrayList4, bool33, num13, num14, bool34, usersPromotionAllowanceDto3, bool28, num12, bool29, messagesEduEducationalProfileDto3, baseAPlusMarkDto3, bool30, bool31, bool32, usersDonutDto3, baseSexDto3, readString65, readString66, readString67, readString68, usersOnlineInfoDto, baseBoolIntDto53, baseBoolIntDto18, num15, baseBoolIntDto54, baseBoolIntDto20, friendsFriendStatusStatusDto3, friendsRequestsMutualDto, readString69, readString70, valueOf62, readString71, valueOf42, valueOf43, valueOf44);
        }

        @Override // android.os.Parcelable.Creator
        public final UsersUserFullDto[] newArray(int i) {
            return new UsersUserFullDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UsersUserFullDto(UserId userId, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, BdateVisibilityDto bdateVisibilityDto, BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, Float f, OwnerStateDto ownerStateDto, String str18, String str19, String str20, String str21, String str22, String str23, BaseBoolIntDto baseBoolIntDto, BaseOwnerCoverDto baseOwnerCoverDto, String str24, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Boolean bool, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, UsersUserTypeDto usersUserTypeDto, String str25, String str26, String str27, String str28, String str29, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str30, String str31, String str32, BaseBoolIntDto baseBoolIntDto10, VideoLiveInfoDto videoLiveInfoDto, BaseBoolIntDto baseBoolIntDto11, Boolean bool6, String str33, String str34, String str35, String str36, String str37, String str38, String str39, PhotosPhotoDto photosPhotoDto, List<? extends List<UsersProfileButtonDto>> list, List<? extends List<UsersProfileButtonDto>> list2, List<UsersProfileButtonDto> list3, String str40, Integer num, Boolean bool7, WallDefaultDto wallDefaultDto, AudioMusicAwardsDto audioMusicAwardsDto, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, BaseBoolIntDto baseBoolIntDto12, List<BaseOwnerButtonDto> list4, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, BaseBoolIntDto baseBoolIntDto13, BaseBoolIntDto baseBoolIntDto14, Boolean bool12, String str50, String str51, String str52, AudioAudioDto audioAudioDto, String str53, String str54, AppsAppMinDto appsAppMinDto, UsersLastSeenDto usersLastSeenDto, UsersExportsDto usersExportsDto, BaseCropPhotoDto baseCropPhotoDto, Integer num2, Integer num3, Integer num4, Integer num5, BaseBoolIntDto baseBoolIntDto15, BaseBoolIntDto baseBoolIntDto16, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, Integer num6, UsersOccupationDto usersOccupationDto, List<UsersCareerDto> list5, List<UsersMilitaryDto> list6, Integer num7, String str55, Integer num8, Integer num9, String str56, Integer num10, String str57, String str58, String str59, UsersUserRelationDto usersUserRelationDto, UsersUserMinDto usersUserMinDto, UsersPersonalDto usersPersonalDto, List<UsersUniversityDto> list7, List<UsersSchoolDto> list8, List<UsersRelativeDto> list9, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, String str60, UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto, EmployeeMarkDto employeeMarkDto, UsersRightsLocationDto usersRightsLocationDto, Boolean bool18, UsersEmojiStatusDto usersEmojiStatusDto, StatusImageStatusDto statusImageStatusDto, UsersUserCountersDto usersUserCountersDto, String str61, BaseBoolIntDto baseBoolIntDto19, Boolean bool19, List<String> list10, String str62, Boolean bool20, Boolean bool21, UsersGiftsTooltipDto usersGiftsTooltipDto, NoIndexDto noIndexDto, Integer num11, MessagesContactDto messagesContactDto, Boolean bool22, List<String> list11, List<Integer> list12, Integer num12, String str63, Boolean bool23, Boolean bool24, UsersUserProfileTypeDto usersUserProfileTypeDto, UsersCanNotCallReasonDto usersCanNotCallReasonDto, Boolean bool25, Boolean bool26, BaseImageDto baseImageDto, List<CallsCustomNameForCallDto> list13, Boolean bool27, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, Boolean bool33, SocialButtonTypeDto socialButtonTypeDto, String str64, Boolean bool34, List<String> list14, List<String> list15, Boolean bool35, Integer num13, Integer num14, Boolean bool36, UsersPromotionAllowanceDto usersPromotionAllowanceDto, Boolean bool37, Integer num15, Boolean bool38, MessagesEduEducationalProfileDto messagesEduEducationalProfileDto, BaseAPlusMarkDto baseAPlusMarkDto, Boolean bool39, Boolean bool40, Boolean bool41, UsersDonutDto usersDonutDto, BaseSexDto baseSexDto, String str65, String str66, String str67, String str68, UsersOnlineInfoDto usersOnlineInfoDto, BaseBoolIntDto baseBoolIntDto20, BaseBoolIntDto baseBoolIntDto21, Integer num16, BaseBoolIntDto baseBoolIntDto22, BaseBoolIntDto baseBoolIntDto23, FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, FriendsRequestsMutualDto friendsRequestsMutualDto, String str69, String str70, Integer num17, String str71, Boolean bool42, Boolean bool43, Boolean bool44) {
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
        this.bdateVisibility = bdateVisibilityDto;
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
        this.cover = baseOwnerCoverDto;
        this.photoAvgColor = str24;
        this.hasMobile = baseBoolIntDto2;
        this.isFriend = baseBoolIntDto3;
        this.isBestFriend = bool;
        this.wallComments = baseBoolIntDto4;
        this.canPost = baseBoolIntDto5;
        this.canSeeAllPosts = baseBoolIntDto6;
        this.canSeeAudio = baseBoolIntDto7;
        this.type = usersUserTypeDto;
        this.email = str25;
        this.skype = str26;
        this.facebook = str27;
        this.facebookName = str28;
        this.twitter = str29;
        this.isAdult = baseBoolIntDto8;
        this.isSubscribed = baseBoolIntDto9;
        this.isSubscribedStories = bool2;
        this.canSubscribeStories = bool3;
        this.canAskQuestion = bool4;
        this.canAskAnonymous = bool5;
        this.subscriptionCountry = str30;
        this.livejournal = str31;
        this.instagram = str32;
        this.test = baseBoolIntDto10;
        this.videoLive = videoLiveInfoDto;
        this.isVideoLiveNotificationsBlocked = baseBoolIntDto11;
        this.isService = bool6;
        this.serviceDescription = str33;
        this.photoRec = str34;
        this.photoMedium = str35;
        this.photoMediumRec = str36;
        this.photo = str37;
        this.photoBig = str38;
        this.photo400 = str39;
        this.photoMaxSize = photosPhotoDto;
        this.profileButtons = list;
        this.profileButtonsTablet = list2;
        this.thirdPartyButtons = list3;
        this.language = str40;
        this.storiesArchiveCount = num;
        this.hasUnseenStories = bool7;
        this.wallDefault = wallDefaultDto;
        this.musicAwards = audioMusicAwardsDto;
        this.canCall = bool8;
        this.canCallFromGroup = bool9;
        this.canInviteAsVoiceroomsSpeaker = bool10;
        this.canSeeWishes = bool11;
        this.canSeeGifts = baseBoolIntDto12;
        this.buttons = list4;
        this.interests = str41;
        this.books = str42;
        this.tv = str43;
        this.quotes = str44;
        this.about = str45;
        this.games = str46;
        this.movies = str47;
        this.activities = str48;
        this.music = str49;
        this.canWritePrivateMessage = baseBoolIntDto13;
        this.canSendFriendRequest = baseBoolIntDto14;
        this.canBeInvitedGroup = bool12;
        this.mobilePhone = str50;
        this.homePhone = str51;
        this.site = str52;
        this.statusAudio = audioAudioDto;
        this.status = str53;
        this.activity = str54;
        this.statusApp = appsAppMinDto;
        this.lastSeen = usersLastSeenDto;
        this.exports = usersExportsDto;
        this.cropPhoto = baseCropPhotoDto;
        this.followersCount = num2;
        this.videoLiveLevel = num3;
        this.videoLiveCount = num4;
        this.clipsCount = num5;
        this.blacklisted = baseBoolIntDto15;
        this.blacklistedByMe = baseBoolIntDto16;
        this.isFavorite = baseBoolIntDto17;
        this.isHiddenFromFeed = baseBoolIntDto18;
        this.commonCount = num6;
        this.occupation = usersOccupationDto;
        this.career = list5;
        this.military = list6;
        this.university = num7;
        this.universityName = str55;
        this.universityGroupId = num8;
        this.faculty = num9;
        this.facultyName = str56;
        this.graduation = num10;
        this.educationForm = str57;
        this.educationStatus = str58;
        this.homeTown = str59;
        this.relation = usersUserRelationDto;
        this.relationPartner = usersUserMinDto;
        this.personal = usersPersonalDto;
        this.universities = list7;
        this.schools = list8;
        this.relatives = list9;
        this.isSubscribedPodcasts = bool13;
        this.canSubscribePodcasts = bool14;
        this.canSubscribePosts = bool15;
        this.isStudent = bool16;
        this.hasRights = bool17;
        this.sysUsername = str60;
        this.employeeWorkingState = usersEmployeeWorkingStateDto;
        this.employeeMark = employeeMarkDto;
        this.rightsLocation = usersRightsLocationDto;
        this.canInviteToChats = bool18;
        this.emojiStatus = usersEmojiStatusDto;
        this.imageStatus = statusImageStatusDto;
        this.counters = usersUserCountersDto;
        this.accessKey = str61;
        this.canUploadDoc = baseBoolIntDto19;
        this.canBan = bool19;
        this.eduDetails = list10;
        this.hash = str62;
        this.hasEmail = bool20;
        this.isDead = bool21;
        this.giftsTooltip = usersGiftsTooltipDto;
        this.noIndex = noIndexDto;
        this.contactId = num11;
        this.contact = messagesContactDto;
        this.isMessageRequest = bool22;
        this.descriptions = list11;
        this.lists = list12;
        this.friendshipWeeks = num12;
        this.trackCode = str63;
        this.isPersonalAdsEasyPromoteEnabled = bool23;
        this.needBigMsgBtnInProfile = bool24;
        this.profileType = usersUserProfileTypeDto;
        this.canNotCallReason = usersCanNotCallReasonDto;
        this.canCallAsCommunity = bool25;
        this.isNft = bool26;
        this.animatedAvatar = baseImageDto;
        this.customNamesForCalls = list13;
        this.isEsiaVerified = bool27;
        this.isEsiaLinked = bool28;
        this.isTinkoffVerified = bool29;
        this.isTinkoffLinked = bool30;
        this.isSberVerified = bool31;
        this.isVerified = bool32;
        this.isFollowersModeOn = bool33;
        this.socialButtonType = socialButtonTypeDto;
        this.description = str64;
        this.isTeacher = bool34;
        this.oauthLinked = list14;
        this.oauthVerification = list15;
        this.isSberLinked = bool35;
        this.ageMark = num13;
        this.joined = num14;
        this.isServiceAccount = bool36;
        this.promotionAllowance = usersPromotionAllowanceDto;
        this.coOwnershipEnabled = bool37;
        this.ageGroup = num15;
        this.hasRelatedUserPin = bool38;
        this.educationalProfile = messagesEduEducationalProfileDto;
        this.aPlusMark = baseAPlusMarkDto;
        this.isDon = bool39;
        this.isMediaModer = bool40;
        this.isPhotoMapEnabled = bool41;
        this.donut = usersDonutDto;
        this.sex = baseSexDto;
        this.screenName = str65;
        this.photo50 = str66;
        this.photo100 = str67;
        this.photoBase = str68;
        this.onlineInfo = usersOnlineInfoDto;
        this.online = baseBoolIntDto20;
        this.onlineMobile = baseBoolIntDto21;
        this.onlineApp = num16;
        this.verified = baseBoolIntDto22;
        this.trending = baseBoolIntDto23;
        this.friendStatus = friendsFriendStatusStatusDto;
        this.mutual = friendsRequestsMutualDto;
        this.deactivated = str69;
        this.firstName = str70;
        this.hidden = num17;
        this.lastName = str71;
        this.canAccessClosed = bool42;
        this.isClosed = bool43;
        this.isCached = bool44;
    }

    public final BaseBoolIntDto B() {
        return this.canSendFriendRequest;
    }

    public final String B1() {
        return this.lastNameDat;
    }

    public final String B2() {
        return this.photoMaxOrig;
    }

    public final Boolean C() {
        return this.canSubscribeStories;
    }

    public final BaseBoolIntDto D() {
        return this.canWritePrivateMessage;
    }

    public final String D0() {
        return this.firstName;
    }

    public final String D1() {
        return this.lastNameGen;
    }

    public final String E1() {
        return this.lastNameIns;
    }

    public final String E2() {
        return this.photoMedium;
    }

    public final List<UsersCareerDto> F() {
        return this.career;
    }

    public final String F0() {
        return this.firstNameAbl;
    }

    public final BaseCityDto G() {
        return this.city;
    }

    public final String G2() {
        return this.photoMediumRec;
    }

    public final String H0() {
        return this.firstNameAcc;
    }

    public final UsersUserProfileTypeDto I2() {
        return this.profileType;
    }

    public final String J2() {
        return this.screenName;
    }

    public final Integer K() {
        return this.clipsCount;
    }

    public final String K0() {
        return this.firstNameDat;
    }

    public final String L1() {
        return this.lastNameNom;
    }

    public final BaseSexDto L2() {
        return this.sex;
    }

    public final String M() {
        return this.contactName;
    }

    public final SocialButtonTypeDto M2() {
        return this.socialButtonType;
    }

    public final String N0() {
        return this.firstNameGen;
    }

    public final List<Integer> N1() {
        return this.lists;
    }

    public final String N2() {
        return this.status;
    }

    public final BaseBoolIntDto O2() {
        return this.trending;
    }

    public final String P0() {
        return this.firstNameIns;
    }

    public final String Q2() {
        return this.universityName;
    }

    public final UsersUserCountersDto R() {
        return this.counters;
    }

    public final FriendsRequestsMutualDto R1() {
        return this.mutual;
    }

    public final BaseBoolIntDto R2() {
        return this.verified;
    }

    public final String S0() {
        return this.firstNameNom;
    }

    public final BaseCountryDto T() {
        return this.country;
    }

    public final Boolean T2() {
        return this.isClosed;
    }

    public final Integer U0() {
        return this.followersCount;
    }

    public final UsersOnlineInfoDto U1() {
        return this.onlineInfo;
    }

    public final FriendsFriendStatusStatusDto V0() {
        return this.friendStatus;
    }

    public final OwnerStateDto V1() {
        return this.ownerState;
    }

    public final Boolean V2() {
        return this.isDead;
    }

    public final BaseOwnerCoverDto W() {
        return this.cover;
    }

    public final String W1() {
        return this.photo;
    }

    public final BaseBoolIntDto W2() {
        return this.isFavorite;
    }

    public final String X1() {
        return this.photo100;
    }

    public final BaseCropPhotoDto Z() {
        return this.cropPhoto;
    }

    public final List<CallsCustomNameForCallDto> a0() {
        return this.customNamesForCalls;
    }

    public final Integer b1() {
        return this.graduation;
    }

    public final String d() {
        return this.about;
    }

    public final BaseBoolIntDto d1() {
        return this.hasPhoto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.accessKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersUserFullDto)) {
            return false;
        }
        UsersUserFullDto usersUserFullDto = (UsersUserFullDto) obj;
        return epx.f(this.id, usersUserFullDto.id) && epx.f(this.firstNameNom, usersUserFullDto.firstNameNom) && epx.f(this.firstNameGen, usersUserFullDto.firstNameGen) && epx.f(this.firstNameDat, usersUserFullDto.firstNameDat) && epx.f(this.firstNameAcc, usersUserFullDto.firstNameAcc) && epx.f(this.firstNameIns, usersUserFullDto.firstNameIns) && epx.f(this.firstNameAbl, usersUserFullDto.firstNameAbl) && epx.f(this.lastNameNom, usersUserFullDto.lastNameNom) && epx.f(this.lastNameGen, usersUserFullDto.lastNameGen) && epx.f(this.lastNameDat, usersUserFullDto.lastNameDat) && epx.f(this.lastNameAcc, usersUserFullDto.lastNameAcc) && epx.f(this.lastNameIns, usersUserFullDto.lastNameIns) && epx.f(this.lastNameAbl, usersUserFullDto.lastNameAbl) && epx.f(this.nickname, usersUserFullDto.nickname) && epx.f(this.maidenName, usersUserFullDto.maidenName) && epx.f(this.contactName, usersUserFullDto.contactName) && epx.f(this.domain, usersUserFullDto.domain) && epx.f(this.bdate, usersUserFullDto.bdate) && this.bdateVisibility == usersUserFullDto.bdateVisibility && epx.f(this.city, usersUserFullDto.city) && epx.f(this.country, usersUserFullDto.country) && epx.f(this.timezone, usersUserFullDto.timezone) && epx.f(this.ownerState, usersUserFullDto.ownerState) && epx.f(this.photo200, usersUserFullDto.photo200) && epx.f(this.photoMax, usersUserFullDto.photoMax) && epx.f(this.photo200Orig, usersUserFullDto.photo200Orig) && epx.f(this.photo400Orig, usersUserFullDto.photo400Orig) && epx.f(this.photoMaxOrig, usersUserFullDto.photoMaxOrig) && epx.f(this.photoId, usersUserFullDto.photoId) && this.hasPhoto == usersUserFullDto.hasPhoto && epx.f(this.cover, usersUserFullDto.cover) && epx.f(this.photoAvgColor, usersUserFullDto.photoAvgColor) && this.hasMobile == usersUserFullDto.hasMobile && this.isFriend == usersUserFullDto.isFriend && epx.f(this.isBestFriend, usersUserFullDto.isBestFriend) && this.wallComments == usersUserFullDto.wallComments && this.canPost == usersUserFullDto.canPost && this.canSeeAllPosts == usersUserFullDto.canSeeAllPosts && this.canSeeAudio == usersUserFullDto.canSeeAudio && this.type == usersUserFullDto.type && epx.f(this.email, usersUserFullDto.email) && epx.f(this.skype, usersUserFullDto.skype) && epx.f(this.facebook, usersUserFullDto.facebook) && epx.f(this.facebookName, usersUserFullDto.facebookName) && epx.f(this.twitter, usersUserFullDto.twitter) && this.isAdult == usersUserFullDto.isAdult && this.isSubscribed == usersUserFullDto.isSubscribed && epx.f(this.isSubscribedStories, usersUserFullDto.isSubscribedStories) && epx.f(this.canSubscribeStories, usersUserFullDto.canSubscribeStories) && epx.f(this.canAskQuestion, usersUserFullDto.canAskQuestion) && epx.f(this.canAskAnonymous, usersUserFullDto.canAskAnonymous) && epx.f(this.subscriptionCountry, usersUserFullDto.subscriptionCountry) && epx.f(this.livejournal, usersUserFullDto.livejournal) && epx.f(this.instagram, usersUserFullDto.instagram) && this.test == usersUserFullDto.test && epx.f(this.videoLive, usersUserFullDto.videoLive) && this.isVideoLiveNotificationsBlocked == usersUserFullDto.isVideoLiveNotificationsBlocked && epx.f(this.isService, usersUserFullDto.isService) && epx.f(this.serviceDescription, usersUserFullDto.serviceDescription) && epx.f(this.photoRec, usersUserFullDto.photoRec) && epx.f(this.photoMedium, usersUserFullDto.photoMedium) && epx.f(this.photoMediumRec, usersUserFullDto.photoMediumRec) && epx.f(this.photo, usersUserFullDto.photo) && epx.f(this.photoBig, usersUserFullDto.photoBig) && epx.f(this.photo400, usersUserFullDto.photo400) && epx.f(this.photoMaxSize, usersUserFullDto.photoMaxSize) && epx.f(this.profileButtons, usersUserFullDto.profileButtons) && epx.f(this.profileButtonsTablet, usersUserFullDto.profileButtonsTablet) && epx.f(this.thirdPartyButtons, usersUserFullDto.thirdPartyButtons) && epx.f(this.language, usersUserFullDto.language) && epx.f(this.storiesArchiveCount, usersUserFullDto.storiesArchiveCount) && epx.f(this.hasUnseenStories, usersUserFullDto.hasUnseenStories) && this.wallDefault == usersUserFullDto.wallDefault && epx.f(this.musicAwards, usersUserFullDto.musicAwards) && epx.f(this.canCall, usersUserFullDto.canCall) && epx.f(this.canCallFromGroup, usersUserFullDto.canCallFromGroup) && epx.f(this.canInviteAsVoiceroomsSpeaker, usersUserFullDto.canInviteAsVoiceroomsSpeaker) && epx.f(this.canSeeWishes, usersUserFullDto.canSeeWishes) && this.canSeeGifts == usersUserFullDto.canSeeGifts && epx.f(this.buttons, usersUserFullDto.buttons) && epx.f(this.interests, usersUserFullDto.interests) && epx.f(this.books, usersUserFullDto.books) && epx.f(this.tv, usersUserFullDto.tv) && epx.f(this.quotes, usersUserFullDto.quotes) && epx.f(this.about, usersUserFullDto.about) && epx.f(this.games, usersUserFullDto.games) && epx.f(this.movies, usersUserFullDto.movies) && epx.f(this.activities, usersUserFullDto.activities) && epx.f(this.music, usersUserFullDto.music) && this.canWritePrivateMessage == usersUserFullDto.canWritePrivateMessage && this.canSendFriendRequest == usersUserFullDto.canSendFriendRequest && epx.f(this.canBeInvitedGroup, usersUserFullDto.canBeInvitedGroup) && epx.f(this.mobilePhone, usersUserFullDto.mobilePhone) && epx.f(this.homePhone, usersUserFullDto.homePhone) && epx.f(this.site, usersUserFullDto.site) && epx.f(this.statusAudio, usersUserFullDto.statusAudio) && epx.f(this.status, usersUserFullDto.status) && epx.f(this.activity, usersUserFullDto.activity) && epx.f(this.statusApp, usersUserFullDto.statusApp) && epx.f(this.lastSeen, usersUserFullDto.lastSeen) && epx.f(this.exports, usersUserFullDto.exports) && epx.f(this.cropPhoto, usersUserFullDto.cropPhoto) && epx.f(this.followersCount, usersUserFullDto.followersCount) && epx.f(this.videoLiveLevel, usersUserFullDto.videoLiveLevel) && epx.f(this.videoLiveCount, usersUserFullDto.videoLiveCount) && epx.f(this.clipsCount, usersUserFullDto.clipsCount) && this.blacklisted == usersUserFullDto.blacklisted && this.blacklistedByMe == usersUserFullDto.blacklistedByMe && this.isFavorite == usersUserFullDto.isFavorite && this.isHiddenFromFeed == usersUserFullDto.isHiddenFromFeed && epx.f(this.commonCount, usersUserFullDto.commonCount) && epx.f(this.occupation, usersUserFullDto.occupation) && epx.f(this.career, usersUserFullDto.career) && epx.f(this.military, usersUserFullDto.military) && epx.f(this.university, usersUserFullDto.university) && epx.f(this.universityName, usersUserFullDto.universityName) && epx.f(this.universityGroupId, usersUserFullDto.universityGroupId) && epx.f(this.faculty, usersUserFullDto.faculty) && epx.f(this.facultyName, usersUserFullDto.facultyName) && epx.f(this.graduation, usersUserFullDto.graduation) && epx.f(this.educationForm, usersUserFullDto.educationForm) && epx.f(this.educationStatus, usersUserFullDto.educationStatus) && epx.f(this.homeTown, usersUserFullDto.homeTown) && this.relation == usersUserFullDto.relation && epx.f(this.relationPartner, usersUserFullDto.relationPartner) && epx.f(this.personal, usersUserFullDto.personal) && epx.f(this.universities, usersUserFullDto.universities) && epx.f(this.schools, usersUserFullDto.schools) && epx.f(this.relatives, usersUserFullDto.relatives) && epx.f(this.isSubscribedPodcasts, usersUserFullDto.isSubscribedPodcasts) && epx.f(this.canSubscribePodcasts, usersUserFullDto.canSubscribePodcasts) && epx.f(this.canSubscribePosts, usersUserFullDto.canSubscribePosts) && epx.f(this.isStudent, usersUserFullDto.isStudent) && epx.f(this.hasRights, usersUserFullDto.hasRights) && epx.f(this.sysUsername, usersUserFullDto.sysUsername) && epx.f(this.employeeWorkingState, usersUserFullDto.employeeWorkingState) && this.employeeMark == usersUserFullDto.employeeMark && epx.f(this.rightsLocation, usersUserFullDto.rightsLocation) && epx.f(this.canInviteToChats, usersUserFullDto.canInviteToChats) && epx.f(this.emojiStatus, usersUserFullDto.emojiStatus) && epx.f(this.imageStatus, usersUserFullDto.imageStatus) && epx.f(this.counters, usersUserFullDto.counters) && epx.f(this.accessKey, usersUserFullDto.accessKey) && this.canUploadDoc == usersUserFullDto.canUploadDoc && epx.f(this.canBan, usersUserFullDto.canBan) && epx.f(this.eduDetails, usersUserFullDto.eduDetails) && epx.f(this.hash, usersUserFullDto.hash) && epx.f(this.hasEmail, usersUserFullDto.hasEmail) && epx.f(this.isDead, usersUserFullDto.isDead) && epx.f(this.giftsTooltip, usersUserFullDto.giftsTooltip) && this.noIndex == usersUserFullDto.noIndex && epx.f(this.contactId, usersUserFullDto.contactId) && epx.f(this.contact, usersUserFullDto.contact) && epx.f(this.isMessageRequest, usersUserFullDto.isMessageRequest) && epx.f(this.descriptions, usersUserFullDto.descriptions) && epx.f(this.lists, usersUserFullDto.lists) && epx.f(this.friendshipWeeks, usersUserFullDto.friendshipWeeks) && epx.f(this.trackCode, usersUserFullDto.trackCode) && epx.f(this.isPersonalAdsEasyPromoteEnabled, usersUserFullDto.isPersonalAdsEasyPromoteEnabled) && epx.f(this.needBigMsgBtnInProfile, usersUserFullDto.needBigMsgBtnInProfile) && this.profileType == usersUserFullDto.profileType && this.canNotCallReason == usersUserFullDto.canNotCallReason && epx.f(this.canCallAsCommunity, usersUserFullDto.canCallAsCommunity) && epx.f(this.isNft, usersUserFullDto.isNft) && epx.f(this.animatedAvatar, usersUserFullDto.animatedAvatar) && epx.f(this.customNamesForCalls, usersUserFullDto.customNamesForCalls) && epx.f(this.isEsiaVerified, usersUserFullDto.isEsiaVerified) && epx.f(this.isEsiaLinked, usersUserFullDto.isEsiaLinked) && epx.f(this.isTinkoffVerified, usersUserFullDto.isTinkoffVerified) && epx.f(this.isTinkoffLinked, usersUserFullDto.isTinkoffLinked) && epx.f(this.isSberVerified, usersUserFullDto.isSberVerified) && epx.f(this.isVerified, usersUserFullDto.isVerified) && epx.f(this.isFollowersModeOn, usersUserFullDto.isFollowersModeOn) && this.socialButtonType == usersUserFullDto.socialButtonType && epx.f(this.description, usersUserFullDto.description) && epx.f(this.isTeacher, usersUserFullDto.isTeacher) && epx.f(this.oauthLinked, usersUserFullDto.oauthLinked) && epx.f(this.oauthVerification, usersUserFullDto.oauthVerification) && epx.f(this.isSberLinked, usersUserFullDto.isSberLinked) && epx.f(this.ageMark, usersUserFullDto.ageMark) && epx.f(this.joined, usersUserFullDto.joined) && epx.f(this.isServiceAccount, usersUserFullDto.isServiceAccount) && epx.f(this.promotionAllowance, usersUserFullDto.promotionAllowance) && epx.f(this.coOwnershipEnabled, usersUserFullDto.coOwnershipEnabled) && epx.f(this.ageGroup, usersUserFullDto.ageGroup) && epx.f(this.hasRelatedUserPin, usersUserFullDto.hasRelatedUserPin) && epx.f(this.educationalProfile, usersUserFullDto.educationalProfile) && epx.f(this.aPlusMark, usersUserFullDto.aPlusMark) && epx.f(this.isDon, usersUserFullDto.isDon) && epx.f(this.isMediaModer, usersUserFullDto.isMediaModer) && epx.f(this.isPhotoMapEnabled, usersUserFullDto.isPhotoMapEnabled) && epx.f(this.donut, usersUserFullDto.donut) && this.sex == usersUserFullDto.sex && epx.f(this.screenName, usersUserFullDto.screenName) && epx.f(this.photo50, usersUserFullDto.photo50) && epx.f(this.photo100, usersUserFullDto.photo100) && epx.f(this.photoBase, usersUserFullDto.photoBase) && epx.f(this.onlineInfo, usersUserFullDto.onlineInfo) && this.online == usersUserFullDto.online && this.onlineMobile == usersUserFullDto.onlineMobile && epx.f(this.onlineApp, usersUserFullDto.onlineApp) && this.verified == usersUserFullDto.verified && this.trending == usersUserFullDto.trending && this.friendStatus == usersUserFullDto.friendStatus && epx.f(this.mutual, usersUserFullDto.mutual) && epx.f(this.deactivated, usersUserFullDto.deactivated) && epx.f(this.firstName, usersUserFullDto.firstName) && epx.f(this.hidden, usersUserFullDto.hidden) && epx.f(this.lastName, usersUserFullDto.lastName) && epx.f(this.canAccessClosed, usersUserFullDto.canAccessClosed) && epx.f(this.isClosed, usersUserFullDto.isClosed) && epx.f(this.isCached, usersUserFullDto.isCached);
    }

    public final Integer f() {
        return this.ageMark;
    }

    public final Boolean f3() {
        return this.isFollowersModeOn;
    }

    public final BaseImageDto g() {
        return this.animatedAvatar;
    }

    public final BaseBoolIntDto g3() {
        return this.isFriend;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Boolean h3() {
        return this.isNft;
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode() * 31;
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
        BdateVisibilityDto bdateVisibilityDto = this.bdateVisibility;
        int hashCode19 = (hashCode18 + (bdateVisibilityDto == null ? 0 : bdateVisibilityDto.hashCode())) * 31;
        BaseCityDto baseCityDto = this.city;
        int hashCode20 = (hashCode19 + (baseCityDto == null ? 0 : baseCityDto.hashCode())) * 31;
        BaseCountryDto baseCountryDto = this.country;
        int hashCode21 = (hashCode20 + (baseCountryDto == null ? 0 : baseCountryDto.hashCode())) * 31;
        Float f = this.timezone;
        int hashCode22 = (hashCode21 + (f == null ? 0 : f.hashCode())) * 31;
        OwnerStateDto ownerStateDto = this.ownerState;
        int hashCode23 = (hashCode22 + (ownerStateDto == null ? 0 : ownerStateDto.hashCode())) * 31;
        String str18 = this.photo200;
        int hashCode24 = (hashCode23 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.photoMax;
        int hashCode25 = (hashCode24 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.photo200Orig;
        int hashCode26 = (hashCode25 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.photo400Orig;
        int hashCode27 = (hashCode26 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.photoMaxOrig;
        int hashCode28 = (hashCode27 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.photoId;
        int hashCode29 = (hashCode28 + (str23 == null ? 0 : str23.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.hasPhoto;
        int hashCode30 = (hashCode29 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseOwnerCoverDto baseOwnerCoverDto = this.cover;
        int hashCode31 = (hashCode30 + (baseOwnerCoverDto == null ? 0 : baseOwnerCoverDto.hashCode())) * 31;
        String str24 = this.photoAvgColor;
        int hashCode32 = (hashCode31 + (str24 == null ? 0 : str24.hashCode())) * 31;
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
        UsersUserTypeDto usersUserTypeDto = this.type;
        int hashCode40 = (hashCode39 + (usersUserTypeDto == null ? 0 : usersUserTypeDto.hashCode())) * 31;
        String str25 = this.email;
        int hashCode41 = (hashCode40 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.skype;
        int hashCode42 = (hashCode41 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.facebook;
        int hashCode43 = (hashCode42 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.facebookName;
        int hashCode44 = (hashCode43 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.twitter;
        int hashCode45 = (hashCode44 + (str29 == null ? 0 : str29.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto8 = this.isAdult;
        int hashCode46 = (hashCode45 + (baseBoolIntDto8 == null ? 0 : baseBoolIntDto8.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto9 = this.isSubscribed;
        int hashCode47 = (hashCode46 + (baseBoolIntDto9 == null ? 0 : baseBoolIntDto9.hashCode())) * 31;
        Boolean bool2 = this.isSubscribedStories;
        int hashCode48 = (hashCode47 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.canSubscribeStories;
        int hashCode49 = (hashCode48 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.canAskQuestion;
        int hashCode50 = (hashCode49 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.canAskAnonymous;
        int hashCode51 = (hashCode50 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str30 = this.subscriptionCountry;
        int hashCode52 = (hashCode51 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.livejournal;
        int hashCode53 = (hashCode52 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.instagram;
        int hashCode54 = (hashCode53 + (str32 == null ? 0 : str32.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto10 = this.test;
        int hashCode55 = (hashCode54 + (baseBoolIntDto10 == null ? 0 : baseBoolIntDto10.hashCode())) * 31;
        VideoLiveInfoDto videoLiveInfoDto = this.videoLive;
        int hashCode56 = (hashCode55 + (videoLiveInfoDto == null ? 0 : videoLiveInfoDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto11 = this.isVideoLiveNotificationsBlocked;
        int hashCode57 = (hashCode56 + (baseBoolIntDto11 == null ? 0 : baseBoolIntDto11.hashCode())) * 31;
        Boolean bool6 = this.isService;
        int hashCode58 = (hashCode57 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str33 = this.serviceDescription;
        int hashCode59 = (hashCode58 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.photoRec;
        int hashCode60 = (hashCode59 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.photoMedium;
        int hashCode61 = (hashCode60 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.photoMediumRec;
        int hashCode62 = (hashCode61 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.photo;
        int hashCode63 = (hashCode62 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.photoBig;
        int hashCode64 = (hashCode63 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.photo400;
        int hashCode65 = (hashCode64 + (str39 == null ? 0 : str39.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photoMaxSize;
        int hashCode66 = (hashCode65 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        List<List<UsersProfileButtonDto>> list = this.profileButtons;
        int hashCode67 = (hashCode66 + (list == null ? 0 : list.hashCode())) * 31;
        List<List<UsersProfileButtonDto>> list2 = this.profileButtonsTablet;
        int hashCode68 = (hashCode67 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<UsersProfileButtonDto> list3 = this.thirdPartyButtons;
        int hashCode69 = (hashCode68 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str40 = this.language;
        int hashCode70 = (hashCode69 + (str40 == null ? 0 : str40.hashCode())) * 31;
        Integer num = this.storiesArchiveCount;
        int hashCode71 = (hashCode70 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool7 = this.hasUnseenStories;
        int hashCode72 = (hashCode71 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        WallDefaultDto wallDefaultDto = this.wallDefault;
        int hashCode73 = (hashCode72 + (wallDefaultDto == null ? 0 : wallDefaultDto.hashCode())) * 31;
        AudioMusicAwardsDto audioMusicAwardsDto = this.musicAwards;
        int hashCode74 = (hashCode73 + (audioMusicAwardsDto == null ? 0 : audioMusicAwardsDto.hashCode())) * 31;
        Boolean bool8 = this.canCall;
        int hashCode75 = (hashCode74 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.canCallFromGroup;
        int hashCode76 = (hashCode75 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.canInviteAsVoiceroomsSpeaker;
        int hashCode77 = (hashCode76 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.canSeeWishes;
        int hashCode78 = (hashCode77 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto12 = this.canSeeGifts;
        int hashCode79 = (hashCode78 + (baseBoolIntDto12 == null ? 0 : baseBoolIntDto12.hashCode())) * 31;
        List<BaseOwnerButtonDto> list4 = this.buttons;
        int hashCode80 = (hashCode79 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str41 = this.interests;
        int hashCode81 = (hashCode80 + (str41 == null ? 0 : str41.hashCode())) * 31;
        String str42 = this.books;
        int hashCode82 = (hashCode81 + (str42 == null ? 0 : str42.hashCode())) * 31;
        String str43 = this.tv;
        int hashCode83 = (hashCode82 + (str43 == null ? 0 : str43.hashCode())) * 31;
        String str44 = this.quotes;
        int hashCode84 = (hashCode83 + (str44 == null ? 0 : str44.hashCode())) * 31;
        String str45 = this.about;
        int hashCode85 = (hashCode84 + (str45 == null ? 0 : str45.hashCode())) * 31;
        String str46 = this.games;
        int hashCode86 = (hashCode85 + (str46 == null ? 0 : str46.hashCode())) * 31;
        String str47 = this.movies;
        int hashCode87 = (hashCode86 + (str47 == null ? 0 : str47.hashCode())) * 31;
        String str48 = this.activities;
        int hashCode88 = (hashCode87 + (str48 == null ? 0 : str48.hashCode())) * 31;
        String str49 = this.music;
        int hashCode89 = (hashCode88 + (str49 == null ? 0 : str49.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto13 = this.canWritePrivateMessage;
        int hashCode90 = (hashCode89 + (baseBoolIntDto13 == null ? 0 : baseBoolIntDto13.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto14 = this.canSendFriendRequest;
        int hashCode91 = (hashCode90 + (baseBoolIntDto14 == null ? 0 : baseBoolIntDto14.hashCode())) * 31;
        Boolean bool12 = this.canBeInvitedGroup;
        int hashCode92 = (hashCode91 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        String str50 = this.mobilePhone;
        int hashCode93 = (hashCode92 + (str50 == null ? 0 : str50.hashCode())) * 31;
        String str51 = this.homePhone;
        int hashCode94 = (hashCode93 + (str51 == null ? 0 : str51.hashCode())) * 31;
        String str52 = this.site;
        int hashCode95 = (hashCode94 + (str52 == null ? 0 : str52.hashCode())) * 31;
        AudioAudioDto audioAudioDto = this.statusAudio;
        int hashCode96 = (hashCode95 + (audioAudioDto == null ? 0 : audioAudioDto.hashCode())) * 31;
        String str53 = this.status;
        int hashCode97 = (hashCode96 + (str53 == null ? 0 : str53.hashCode())) * 31;
        String str54 = this.activity;
        int hashCode98 = (hashCode97 + (str54 == null ? 0 : str54.hashCode())) * 31;
        AppsAppMinDto appsAppMinDto = this.statusApp;
        int hashCode99 = (hashCode98 + (appsAppMinDto == null ? 0 : appsAppMinDto.hashCode())) * 31;
        UsersLastSeenDto usersLastSeenDto = this.lastSeen;
        int hashCode100 = (hashCode99 + (usersLastSeenDto == null ? 0 : usersLastSeenDto.hashCode())) * 31;
        UsersExportsDto usersExportsDto = this.exports;
        int hashCode101 = (hashCode100 + (usersExportsDto == null ? 0 : usersExportsDto.hashCode())) * 31;
        BaseCropPhotoDto baseCropPhotoDto = this.cropPhoto;
        int hashCode102 = (hashCode101 + (baseCropPhotoDto == null ? 0 : baseCropPhotoDto.hashCode())) * 31;
        Integer num2 = this.followersCount;
        int hashCode103 = (hashCode102 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.videoLiveLevel;
        int hashCode104 = (hashCode103 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.videoLiveCount;
        int hashCode105 = (hashCode104 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.clipsCount;
        int hashCode106 = (hashCode105 + (num5 == null ? 0 : num5.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto15 = this.blacklisted;
        int hashCode107 = (hashCode106 + (baseBoolIntDto15 == null ? 0 : baseBoolIntDto15.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto16 = this.blacklistedByMe;
        int hashCode108 = (hashCode107 + (baseBoolIntDto16 == null ? 0 : baseBoolIntDto16.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto17 = this.isFavorite;
        int hashCode109 = (hashCode108 + (baseBoolIntDto17 == null ? 0 : baseBoolIntDto17.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto18 = this.isHiddenFromFeed;
        int hashCode110 = (hashCode109 + (baseBoolIntDto18 == null ? 0 : baseBoolIntDto18.hashCode())) * 31;
        Integer num6 = this.commonCount;
        int hashCode111 = (hashCode110 + (num6 == null ? 0 : num6.hashCode())) * 31;
        UsersOccupationDto usersOccupationDto = this.occupation;
        int hashCode112 = (hashCode111 + (usersOccupationDto == null ? 0 : usersOccupationDto.hashCode())) * 31;
        List<UsersCareerDto> list5 = this.career;
        int hashCode113 = (hashCode112 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<UsersMilitaryDto> list6 = this.military;
        int hashCode114 = (hashCode113 + (list6 == null ? 0 : list6.hashCode())) * 31;
        Integer num7 = this.university;
        int hashCode115 = (hashCode114 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str55 = this.universityName;
        int hashCode116 = (hashCode115 + (str55 == null ? 0 : str55.hashCode())) * 31;
        Integer num8 = this.universityGroupId;
        int hashCode117 = (hashCode116 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.faculty;
        int hashCode118 = (hashCode117 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str56 = this.facultyName;
        int hashCode119 = (hashCode118 + (str56 == null ? 0 : str56.hashCode())) * 31;
        Integer num10 = this.graduation;
        int hashCode120 = (hashCode119 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str57 = this.educationForm;
        int hashCode121 = (hashCode120 + (str57 == null ? 0 : str57.hashCode())) * 31;
        String str58 = this.educationStatus;
        int hashCode122 = (hashCode121 + (str58 == null ? 0 : str58.hashCode())) * 31;
        String str59 = this.homeTown;
        int hashCode123 = (hashCode122 + (str59 == null ? 0 : str59.hashCode())) * 31;
        UsersUserRelationDto usersUserRelationDto = this.relation;
        int hashCode124 = (hashCode123 + (usersUserRelationDto == null ? 0 : usersUserRelationDto.hashCode())) * 31;
        UsersUserMinDto usersUserMinDto = this.relationPartner;
        int hashCode125 = (hashCode124 + (usersUserMinDto == null ? 0 : usersUserMinDto.hashCode())) * 31;
        UsersPersonalDto usersPersonalDto = this.personal;
        int hashCode126 = (hashCode125 + (usersPersonalDto == null ? 0 : usersPersonalDto.hashCode())) * 31;
        List<UsersUniversityDto> list7 = this.universities;
        int hashCode127 = (hashCode126 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<UsersSchoolDto> list8 = this.schools;
        int hashCode128 = (hashCode127 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<UsersRelativeDto> list9 = this.relatives;
        int hashCode129 = (hashCode128 + (list9 == null ? 0 : list9.hashCode())) * 31;
        Boolean bool13 = this.isSubscribedPodcasts;
        int hashCode130 = (hashCode129 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.canSubscribePodcasts;
        int hashCode131 = (hashCode130 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.canSubscribePosts;
        int hashCode132 = (hashCode131 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.isStudent;
        int hashCode133 = (hashCode132 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        Boolean bool17 = this.hasRights;
        int hashCode134 = (hashCode133 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        String str60 = this.sysUsername;
        int hashCode135 = (hashCode134 + (str60 == null ? 0 : str60.hashCode())) * 31;
        UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto = this.employeeWorkingState;
        int hashCode136 = (hashCode135 + (usersEmployeeWorkingStateDto == null ? 0 : usersEmployeeWorkingStateDto.hashCode())) * 31;
        EmployeeMarkDto employeeMarkDto = this.employeeMark;
        int hashCode137 = (hashCode136 + (employeeMarkDto == null ? 0 : employeeMarkDto.hashCode())) * 31;
        UsersRightsLocationDto usersRightsLocationDto = this.rightsLocation;
        int hashCode138 = (hashCode137 + (usersRightsLocationDto == null ? 0 : usersRightsLocationDto.hashCode())) * 31;
        Boolean bool18 = this.canInviteToChats;
        int hashCode139 = (hashCode138 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        UsersEmojiStatusDto usersEmojiStatusDto = this.emojiStatus;
        int hashCode140 = (hashCode139 + (usersEmojiStatusDto == null ? 0 : usersEmojiStatusDto.hashCode())) * 31;
        StatusImageStatusDto statusImageStatusDto = this.imageStatus;
        int hashCode141 = (hashCode140 + (statusImageStatusDto == null ? 0 : statusImageStatusDto.hashCode())) * 31;
        UsersUserCountersDto usersUserCountersDto = this.counters;
        int hashCode142 = (hashCode141 + (usersUserCountersDto == null ? 0 : usersUserCountersDto.hashCode())) * 31;
        String str61 = this.accessKey;
        int hashCode143 = (hashCode142 + (str61 == null ? 0 : str61.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto19 = this.canUploadDoc;
        int hashCode144 = (hashCode143 + (baseBoolIntDto19 == null ? 0 : baseBoolIntDto19.hashCode())) * 31;
        Boolean bool19 = this.canBan;
        int hashCode145 = (hashCode144 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        List<String> list10 = this.eduDetails;
        int hashCode146 = (hashCode145 + (list10 == null ? 0 : list10.hashCode())) * 31;
        String str62 = this.hash;
        int hashCode147 = (hashCode146 + (str62 == null ? 0 : str62.hashCode())) * 31;
        Boolean bool20 = this.hasEmail;
        int hashCode148 = (hashCode147 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        Boolean bool21 = this.isDead;
        int hashCode149 = (hashCode148 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
        UsersGiftsTooltipDto usersGiftsTooltipDto = this.giftsTooltip;
        int hashCode150 = (hashCode149 + (usersGiftsTooltipDto == null ? 0 : usersGiftsTooltipDto.hashCode())) * 31;
        NoIndexDto noIndexDto = this.noIndex;
        int hashCode151 = (hashCode150 + (noIndexDto == null ? 0 : noIndexDto.hashCode())) * 31;
        Integer num11 = this.contactId;
        int hashCode152 = (hashCode151 + (num11 == null ? 0 : num11.hashCode())) * 31;
        MessagesContactDto messagesContactDto = this.contact;
        int hashCode153 = (hashCode152 + (messagesContactDto == null ? 0 : messagesContactDto.hashCode())) * 31;
        Boolean bool22 = this.isMessageRequest;
        int hashCode154 = (hashCode153 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
        List<String> list11 = this.descriptions;
        int hashCode155 = (hashCode154 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<Integer> list12 = this.lists;
        int hashCode156 = (hashCode155 + (list12 == null ? 0 : list12.hashCode())) * 31;
        Integer num12 = this.friendshipWeeks;
        int hashCode157 = (hashCode156 + (num12 == null ? 0 : num12.hashCode())) * 31;
        String str63 = this.trackCode;
        int hashCode158 = (hashCode157 + (str63 == null ? 0 : str63.hashCode())) * 31;
        Boolean bool23 = this.isPersonalAdsEasyPromoteEnabled;
        int hashCode159 = (hashCode158 + (bool23 == null ? 0 : bool23.hashCode())) * 31;
        Boolean bool24 = this.needBigMsgBtnInProfile;
        int hashCode160 = (hashCode159 + (bool24 == null ? 0 : bool24.hashCode())) * 31;
        UsersUserProfileTypeDto usersUserProfileTypeDto = this.profileType;
        int hashCode161 = (hashCode160 + (usersUserProfileTypeDto == null ? 0 : usersUserProfileTypeDto.hashCode())) * 31;
        UsersCanNotCallReasonDto usersCanNotCallReasonDto = this.canNotCallReason;
        int hashCode162 = (hashCode161 + (usersCanNotCallReasonDto == null ? 0 : usersCanNotCallReasonDto.hashCode())) * 31;
        Boolean bool25 = this.canCallAsCommunity;
        int hashCode163 = (hashCode162 + (bool25 == null ? 0 : bool25.hashCode())) * 31;
        Boolean bool26 = this.isNft;
        int hashCode164 = (hashCode163 + (bool26 == null ? 0 : bool26.hashCode())) * 31;
        BaseImageDto baseImageDto = this.animatedAvatar;
        int hashCode165 = (hashCode164 + (baseImageDto == null ? 0 : baseImageDto.hashCode())) * 31;
        List<CallsCustomNameForCallDto> list13 = this.customNamesForCalls;
        int hashCode166 = (hashCode165 + (list13 == null ? 0 : list13.hashCode())) * 31;
        Boolean bool27 = this.isEsiaVerified;
        int hashCode167 = (hashCode166 + (bool27 == null ? 0 : bool27.hashCode())) * 31;
        Boolean bool28 = this.isEsiaLinked;
        int hashCode168 = (hashCode167 + (bool28 == null ? 0 : bool28.hashCode())) * 31;
        Boolean bool29 = this.isTinkoffVerified;
        int hashCode169 = (hashCode168 + (bool29 == null ? 0 : bool29.hashCode())) * 31;
        Boolean bool30 = this.isTinkoffLinked;
        int hashCode170 = (hashCode169 + (bool30 == null ? 0 : bool30.hashCode())) * 31;
        Boolean bool31 = this.isSberVerified;
        int hashCode171 = (hashCode170 + (bool31 == null ? 0 : bool31.hashCode())) * 31;
        Boolean bool32 = this.isVerified;
        int hashCode172 = (hashCode171 + (bool32 == null ? 0 : bool32.hashCode())) * 31;
        Boolean bool33 = this.isFollowersModeOn;
        int hashCode173 = (hashCode172 + (bool33 == null ? 0 : bool33.hashCode())) * 31;
        SocialButtonTypeDto socialButtonTypeDto = this.socialButtonType;
        int hashCode174 = (hashCode173 + (socialButtonTypeDto == null ? 0 : socialButtonTypeDto.hashCode())) * 31;
        String str64 = this.description;
        int hashCode175 = (hashCode174 + (str64 == null ? 0 : str64.hashCode())) * 31;
        Boolean bool34 = this.isTeacher;
        int hashCode176 = (hashCode175 + (bool34 == null ? 0 : bool34.hashCode())) * 31;
        List<String> list14 = this.oauthLinked;
        int hashCode177 = (hashCode176 + (list14 == null ? 0 : list14.hashCode())) * 31;
        List<String> list15 = this.oauthVerification;
        int hashCode178 = (hashCode177 + (list15 == null ? 0 : list15.hashCode())) * 31;
        Boolean bool35 = this.isSberLinked;
        int hashCode179 = (hashCode178 + (bool35 == null ? 0 : bool35.hashCode())) * 31;
        Integer num13 = this.ageMark;
        int hashCode180 = (hashCode179 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.joined;
        int hashCode181 = (hashCode180 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Boolean bool36 = this.isServiceAccount;
        int hashCode182 = (hashCode181 + (bool36 == null ? 0 : bool36.hashCode())) * 31;
        UsersPromotionAllowanceDto usersPromotionAllowanceDto = this.promotionAllowance;
        int hashCode183 = (hashCode182 + (usersPromotionAllowanceDto == null ? 0 : usersPromotionAllowanceDto.hashCode())) * 31;
        Boolean bool37 = this.coOwnershipEnabled;
        int hashCode184 = (hashCode183 + (bool37 == null ? 0 : bool37.hashCode())) * 31;
        Integer num15 = this.ageGroup;
        int hashCode185 = (hashCode184 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Boolean bool38 = this.hasRelatedUserPin;
        int hashCode186 = (hashCode185 + (bool38 == null ? 0 : bool38.hashCode())) * 31;
        MessagesEduEducationalProfileDto messagesEduEducationalProfileDto = this.educationalProfile;
        int hashCode187 = (hashCode186 + (messagesEduEducationalProfileDto == null ? 0 : messagesEduEducationalProfileDto.hashCode())) * 31;
        BaseAPlusMarkDto baseAPlusMarkDto = this.aPlusMark;
        int hashCode188 = (hashCode187 + (baseAPlusMarkDto == null ? 0 : baseAPlusMarkDto.hashCode())) * 31;
        Boolean bool39 = this.isDon;
        int hashCode189 = (hashCode188 + (bool39 == null ? 0 : bool39.hashCode())) * 31;
        Boolean bool40 = this.isMediaModer;
        int hashCode190 = (hashCode189 + (bool40 == null ? 0 : bool40.hashCode())) * 31;
        Boolean bool41 = this.isPhotoMapEnabled;
        int hashCode191 = (hashCode190 + (bool41 == null ? 0 : bool41.hashCode())) * 31;
        UsersDonutDto usersDonutDto = this.donut;
        int hashCode192 = (hashCode191 + (usersDonutDto == null ? 0 : usersDonutDto.hashCode())) * 31;
        BaseSexDto baseSexDto = this.sex;
        int hashCode193 = (hashCode192 + (baseSexDto == null ? 0 : baseSexDto.hashCode())) * 31;
        String str65 = this.screenName;
        int hashCode194 = (hashCode193 + (str65 == null ? 0 : str65.hashCode())) * 31;
        String str66 = this.photo50;
        int hashCode195 = (hashCode194 + (str66 == null ? 0 : str66.hashCode())) * 31;
        String str67 = this.photo100;
        int hashCode196 = (hashCode195 + (str67 == null ? 0 : str67.hashCode())) * 31;
        String str68 = this.photoBase;
        int hashCode197 = (hashCode196 + (str68 == null ? 0 : str68.hashCode())) * 31;
        UsersOnlineInfoDto usersOnlineInfoDto = this.onlineInfo;
        int hashCode198 = (hashCode197 + (usersOnlineInfoDto == null ? 0 : usersOnlineInfoDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto20 = this.online;
        int hashCode199 = (hashCode198 + (baseBoolIntDto20 == null ? 0 : baseBoolIntDto20.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto21 = this.onlineMobile;
        int hashCode200 = (hashCode199 + (baseBoolIntDto21 == null ? 0 : baseBoolIntDto21.hashCode())) * 31;
        Integer num16 = this.onlineApp;
        int hashCode201 = (hashCode200 + (num16 == null ? 0 : num16.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto22 = this.verified;
        int hashCode202 = (hashCode201 + (baseBoolIntDto22 == null ? 0 : baseBoolIntDto22.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto23 = this.trending;
        int hashCode203 = (hashCode202 + (baseBoolIntDto23 == null ? 0 : baseBoolIntDto23.hashCode())) * 31;
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto = this.friendStatus;
        int hashCode204 = (hashCode203 + (friendsFriendStatusStatusDto == null ? 0 : friendsFriendStatusStatusDto.hashCode())) * 31;
        FriendsRequestsMutualDto friendsRequestsMutualDto = this.mutual;
        int hashCode205 = (hashCode204 + (friendsRequestsMutualDto == null ? 0 : friendsRequestsMutualDto.hashCode())) * 31;
        String str69 = this.deactivated;
        int hashCode206 = (hashCode205 + (str69 == null ? 0 : str69.hashCode())) * 31;
        String str70 = this.firstName;
        int hashCode207 = (hashCode206 + (str70 == null ? 0 : str70.hashCode())) * 31;
        Integer num17 = this.hidden;
        int hashCode208 = (hashCode207 + (num17 == null ? 0 : num17.hashCode())) * 31;
        String str71 = this.lastName;
        int hashCode209 = (hashCode208 + (str71 == null ? 0 : str71.hashCode())) * 31;
        Boolean bool42 = this.canAccessClosed;
        int hashCode210 = (hashCode209 + (bool42 == null ? 0 : bool42.hashCode())) * 31;
        Boolean bool43 = this.isClosed;
        int hashCode211 = (hashCode210 + (bool43 == null ? 0 : bool43.hashCode())) * 31;
        Boolean bool44 = this.isCached;
        return hashCode211 + (bool44 != null ? bool44.hashCode() : 0);
    }

    public final String i() {
        return this.bdate;
    }

    public final String i2() {
        return this.photo200;
    }

    public final Boolean i3() {
        return this.isSubscribedStories;
    }

    public final BaseBoolIntDto j() {
        return this.blacklisted;
    }

    public final BaseBoolIntDto k() {
        return this.blacklistedByMe;
    }

    public final Boolean l() {
        return this.canAccessClosed;
    }

    public final String l0() {
        return this.deactivated;
    }

    public final String l2() {
        return this.photo400;
    }

    public final String m2() {
        return this.photo400Orig;
    }

    public final Boolean n() {
        return this.canBan;
    }

    public final Boolean n1() {
        return this.hasUnseenStories;
    }

    public final Boolean o() {
        return this.canCall;
    }

    public final Integer o1() {
        return this.hidden;
    }

    public final String o2() {
        return this.photo50;
    }

    public final Boolean o3() {
        return this.isVerified;
    }

    public final UsersCanNotCallReasonDto p() {
        return this.canNotCallReason;
    }

    public final BaseBoolIntDto p3() {
        return this.isVideoLiveNotificationsBlocked;
    }

    public final String q2() {
        return this.photoAvgColor;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String r2() {
        return this.photoBase;
    }

    public final UserId s1() {
        return this.id;
    }

    public final StatusImageStatusDto t1() {
        return this.imageStatus;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersUserFullDto(id=");
        sb.append(this.id);
        sb.append(", firstNameNom=");
        sb.append(this.firstNameNom);
        sb.append(", firstNameGen=");
        sb.append(this.firstNameGen);
        sb.append(", firstNameDat=");
        sb.append(this.firstNameDat);
        sb.append(", firstNameAcc=");
        sb.append(this.firstNameAcc);
        sb.append(", firstNameIns=");
        sb.append(this.firstNameIns);
        sb.append(", firstNameAbl=");
        sb.append(this.firstNameAbl);
        sb.append(", lastNameNom=");
        sb.append(this.lastNameNom);
        sb.append(", lastNameGen=");
        sb.append(this.lastNameGen);
        sb.append(", lastNameDat=");
        sb.append(this.lastNameDat);
        sb.append(", lastNameAcc=");
        sb.append(this.lastNameAcc);
        sb.append(", lastNameIns=");
        sb.append(this.lastNameIns);
        sb.append(", lastNameAbl=");
        sb.append(this.lastNameAbl);
        sb.append(", nickname=");
        sb.append(this.nickname);
        sb.append(", maidenName=");
        sb.append(this.maidenName);
        sb.append(", contactName=");
        sb.append(this.contactName);
        sb.append(", domain=");
        sb.append(this.domain);
        sb.append(", bdate=");
        sb.append(this.bdate);
        sb.append(", bdateVisibility=");
        sb.append(this.bdateVisibility);
        sb.append(", city=");
        sb.append(this.city);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", timezone=");
        sb.append(this.timezone);
        sb.append(", ownerState=");
        sb.append(this.ownerState);
        sb.append(", photo200=");
        sb.append(this.photo200);
        sb.append(", photoMax=");
        sb.append(this.photoMax);
        sb.append(", photo200Orig=");
        sb.append(this.photo200Orig);
        sb.append(", photo400Orig=");
        sb.append(this.photo400Orig);
        sb.append(", photoMaxOrig=");
        sb.append(this.photoMaxOrig);
        sb.append(", photoId=");
        sb.append(this.photoId);
        sb.append(", hasPhoto=");
        sb.append(this.hasPhoto);
        sb.append(", cover=");
        sb.append(this.cover);
        sb.append(", photoAvgColor=");
        sb.append(this.photoAvgColor);
        sb.append(", hasMobile=");
        sb.append(this.hasMobile);
        sb.append(", isFriend=");
        sb.append(this.isFriend);
        sb.append(", isBestFriend=");
        sb.append(this.isBestFriend);
        sb.append(", wallComments=");
        sb.append(this.wallComments);
        sb.append(", canPost=");
        sb.append(this.canPost);
        sb.append(", canSeeAllPosts=");
        sb.append(this.canSeeAllPosts);
        sb.append(", canSeeAudio=");
        sb.append(this.canSeeAudio);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", email=");
        sb.append(this.email);
        sb.append(", skype=");
        sb.append(this.skype);
        sb.append(", facebook=");
        sb.append(this.facebook);
        sb.append(", facebookName=");
        sb.append(this.facebookName);
        sb.append(", twitter=");
        sb.append(this.twitter);
        sb.append(", isAdult=");
        sb.append(this.isAdult);
        sb.append(", isSubscribed=");
        sb.append(this.isSubscribed);
        sb.append(", isSubscribedStories=");
        sb.append(this.isSubscribedStories);
        sb.append(", canSubscribeStories=");
        sb.append(this.canSubscribeStories);
        sb.append(", canAskQuestion=");
        sb.append(this.canAskQuestion);
        sb.append(", canAskAnonymous=");
        sb.append(this.canAskAnonymous);
        sb.append(", subscriptionCountry=");
        sb.append(this.subscriptionCountry);
        sb.append(", livejournal=");
        sb.append(this.livejournal);
        sb.append(", instagram=");
        sb.append(this.instagram);
        sb.append(", test=");
        sb.append(this.test);
        sb.append(", videoLive=");
        sb.append(this.videoLive);
        sb.append(", isVideoLiveNotificationsBlocked=");
        sb.append(this.isVideoLiveNotificationsBlocked);
        sb.append(", isService=");
        sb.append(this.isService);
        sb.append(", serviceDescription=");
        sb.append(this.serviceDescription);
        sb.append(", photoRec=");
        sb.append(this.photoRec);
        sb.append(", photoMedium=");
        sb.append(this.photoMedium);
        sb.append(", photoMediumRec=");
        sb.append(this.photoMediumRec);
        sb.append(", photo=");
        sb.append(this.photo);
        sb.append(", photoBig=");
        sb.append(this.photoBig);
        sb.append(", photo400=");
        sb.append(this.photo400);
        sb.append(", photoMaxSize=");
        sb.append(this.photoMaxSize);
        sb.append(", profileButtons=");
        sb.append(this.profileButtons);
        sb.append(", profileButtonsTablet=");
        sb.append(this.profileButtonsTablet);
        sb.append(", thirdPartyButtons=");
        sb.append(this.thirdPartyButtons);
        sb.append(", language=");
        sb.append(this.language);
        sb.append(", storiesArchiveCount=");
        sb.append(this.storiesArchiveCount);
        sb.append(", hasUnseenStories=");
        sb.append(this.hasUnseenStories);
        sb.append(", wallDefault=");
        sb.append(this.wallDefault);
        sb.append(", musicAwards=");
        sb.append(this.musicAwards);
        sb.append(", canCall=");
        sb.append(this.canCall);
        sb.append(", canCallFromGroup=");
        sb.append(this.canCallFromGroup);
        sb.append(", canInviteAsVoiceroomsSpeaker=");
        sb.append(this.canInviteAsVoiceroomsSpeaker);
        sb.append(", canSeeWishes=");
        sb.append(this.canSeeWishes);
        sb.append(", canSeeGifts=");
        sb.append(this.canSeeGifts);
        sb.append(", buttons=");
        sb.append(this.buttons);
        sb.append(", interests=");
        sb.append(this.interests);
        sb.append(", books=");
        sb.append(this.books);
        sb.append(", tv=");
        sb.append(this.tv);
        sb.append(", quotes=");
        sb.append(this.quotes);
        sb.append(", about=");
        sb.append(this.about);
        sb.append(", games=");
        sb.append(this.games);
        sb.append(", movies=");
        sb.append(this.movies);
        sb.append(", activities=");
        sb.append(this.activities);
        sb.append(", music=");
        sb.append(this.music);
        sb.append(", canWritePrivateMessage=");
        sb.append(this.canWritePrivateMessage);
        sb.append(", canSendFriendRequest=");
        sb.append(this.canSendFriendRequest);
        sb.append(", canBeInvitedGroup=");
        sb.append(this.canBeInvitedGroup);
        sb.append(", mobilePhone=");
        sb.append(this.mobilePhone);
        sb.append(", homePhone=");
        sb.append(this.homePhone);
        sb.append(", site=");
        sb.append(this.site);
        sb.append(", statusAudio=");
        sb.append(this.statusAudio);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", activity=");
        sb.append(this.activity);
        sb.append(", statusApp=");
        sb.append(this.statusApp);
        sb.append(", lastSeen=");
        sb.append(this.lastSeen);
        sb.append(", exports=");
        sb.append(this.exports);
        sb.append(", cropPhoto=");
        sb.append(this.cropPhoto);
        sb.append(", followersCount=");
        sb.append(this.followersCount);
        sb.append(", videoLiveLevel=");
        sb.append(this.videoLiveLevel);
        sb.append(", videoLiveCount=");
        sb.append(this.videoLiveCount);
        sb.append(", clipsCount=");
        sb.append(this.clipsCount);
        sb.append(", blacklisted=");
        sb.append(this.blacklisted);
        sb.append(", blacklistedByMe=");
        sb.append(this.blacklistedByMe);
        sb.append(", isFavorite=");
        sb.append(this.isFavorite);
        sb.append(", isHiddenFromFeed=");
        sb.append(this.isHiddenFromFeed);
        sb.append(", commonCount=");
        sb.append(this.commonCount);
        sb.append(", occupation=");
        sb.append(this.occupation);
        sb.append(", career=");
        sb.append(this.career);
        sb.append(", military=");
        sb.append(this.military);
        sb.append(", university=");
        sb.append(this.university);
        sb.append(", universityName=");
        sb.append(this.universityName);
        sb.append(", universityGroupId=");
        sb.append(this.universityGroupId);
        sb.append(", faculty=");
        sb.append(this.faculty);
        sb.append(", facultyName=");
        sb.append(this.facultyName);
        sb.append(", graduation=");
        sb.append(this.graduation);
        sb.append(", educationForm=");
        sb.append(this.educationForm);
        sb.append(", educationStatus=");
        sb.append(this.educationStatus);
        sb.append(", homeTown=");
        sb.append(this.homeTown);
        sb.append(", relation=");
        sb.append(this.relation);
        sb.append(", relationPartner=");
        sb.append(this.relationPartner);
        sb.append(", personal=");
        sb.append(this.personal);
        sb.append(", universities=");
        sb.append(this.universities);
        sb.append(", schools=");
        sb.append(this.schools);
        sb.append(", relatives=");
        sb.append(this.relatives);
        sb.append(", isSubscribedPodcasts=");
        sb.append(this.isSubscribedPodcasts);
        sb.append(", canSubscribePodcasts=");
        sb.append(this.canSubscribePodcasts);
        sb.append(", canSubscribePosts=");
        sb.append(this.canSubscribePosts);
        sb.append(", isStudent=");
        sb.append(this.isStudent);
        sb.append(", hasRights=");
        sb.append(this.hasRights);
        sb.append(", sysUsername=");
        sb.append(this.sysUsername);
        sb.append(", employeeWorkingState=");
        sb.append(this.employeeWorkingState);
        sb.append(", employeeMark=");
        sb.append(this.employeeMark);
        sb.append(", rightsLocation=");
        sb.append(this.rightsLocation);
        sb.append(", canInviteToChats=");
        sb.append(this.canInviteToChats);
        sb.append(", emojiStatus=");
        sb.append(this.emojiStatus);
        sb.append(", imageStatus=");
        sb.append(this.imageStatus);
        sb.append(", counters=");
        sb.append(this.counters);
        sb.append(", accessKey=");
        sb.append(this.accessKey);
        sb.append(", canUploadDoc=");
        sb.append(this.canUploadDoc);
        sb.append(", canBan=");
        sb.append(this.canBan);
        sb.append(", eduDetails=");
        sb.append(this.eduDetails);
        sb.append(", hash=");
        sb.append(this.hash);
        sb.append(", hasEmail=");
        sb.append(this.hasEmail);
        sb.append(", isDead=");
        sb.append(this.isDead);
        sb.append(", giftsTooltip=");
        sb.append(this.giftsTooltip);
        sb.append(", noIndex=");
        sb.append(this.noIndex);
        sb.append(", contactId=");
        sb.append(this.contactId);
        sb.append(", contact=");
        sb.append(this.contact);
        sb.append(", isMessageRequest=");
        sb.append(this.isMessageRequest);
        sb.append(", descriptions=");
        sb.append(this.descriptions);
        sb.append(", lists=");
        sb.append(this.lists);
        sb.append(", friendshipWeeks=");
        sb.append(this.friendshipWeeks);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", isPersonalAdsEasyPromoteEnabled=");
        sb.append(this.isPersonalAdsEasyPromoteEnabled);
        sb.append(", needBigMsgBtnInProfile=");
        sb.append(this.needBigMsgBtnInProfile);
        sb.append(", profileType=");
        sb.append(this.profileType);
        sb.append(", canNotCallReason=");
        sb.append(this.canNotCallReason);
        sb.append(", canCallAsCommunity=");
        sb.append(this.canCallAsCommunity);
        sb.append(", isNft=");
        sb.append(this.isNft);
        sb.append(", animatedAvatar=");
        sb.append(this.animatedAvatar);
        sb.append(", customNamesForCalls=");
        sb.append(this.customNamesForCalls);
        sb.append(", isEsiaVerified=");
        sb.append(this.isEsiaVerified);
        sb.append(", isEsiaLinked=");
        sb.append(this.isEsiaLinked);
        sb.append(", isTinkoffVerified=");
        sb.append(this.isTinkoffVerified);
        sb.append(", isTinkoffLinked=");
        sb.append(this.isTinkoffLinked);
        sb.append(", isSberVerified=");
        sb.append(this.isSberVerified);
        sb.append(", isVerified=");
        sb.append(this.isVerified);
        sb.append(", isFollowersModeOn=");
        sb.append(this.isFollowersModeOn);
        sb.append(", socialButtonType=");
        sb.append(this.socialButtonType);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", isTeacher=");
        sb.append(this.isTeacher);
        sb.append(", oauthLinked=");
        sb.append(this.oauthLinked);
        sb.append(", oauthVerification=");
        sb.append(this.oauthVerification);
        sb.append(", isSberLinked=");
        sb.append(this.isSberLinked);
        sb.append(", ageMark=");
        sb.append(this.ageMark);
        sb.append(", joined=");
        sb.append(this.joined);
        sb.append(", isServiceAccount=");
        sb.append(this.isServiceAccount);
        sb.append(", promotionAllowance=");
        sb.append(this.promotionAllowance);
        sb.append(", coOwnershipEnabled=");
        sb.append(this.coOwnershipEnabled);
        sb.append(", ageGroup=");
        sb.append(this.ageGroup);
        sb.append(", hasRelatedUserPin=");
        sb.append(this.hasRelatedUserPin);
        sb.append(", educationalProfile=");
        sb.append(this.educationalProfile);
        sb.append(", aPlusMark=");
        sb.append(this.aPlusMark);
        sb.append(", isDon=");
        sb.append(this.isDon);
        sb.append(", isMediaModer=");
        sb.append(this.isMediaModer);
        sb.append(", isPhotoMapEnabled=");
        sb.append(this.isPhotoMapEnabled);
        sb.append(", donut=");
        sb.append(this.donut);
        sb.append(", sex=");
        sb.append(this.sex);
        sb.append(", screenName=");
        sb.append(this.screenName);
        sb.append(", photo50=");
        sb.append(this.photo50);
        sb.append(", photo100=");
        sb.append(this.photo100);
        sb.append(", photoBase=");
        sb.append(this.photoBase);
        sb.append(", onlineInfo=");
        sb.append(this.onlineInfo);
        sb.append(", online=");
        sb.append(this.online);
        sb.append(", onlineMobile=");
        sb.append(this.onlineMobile);
        sb.append(", onlineApp=");
        sb.append(this.onlineApp);
        sb.append(", verified=");
        sb.append(this.verified);
        sb.append(", trending=");
        sb.append(this.trending);
        sb.append(", friendStatus=");
        sb.append(this.friendStatus);
        sb.append(", mutual=");
        sb.append(this.mutual);
        sb.append(", deactivated=");
        sb.append(this.deactivated);
        sb.append(", firstName=");
        sb.append(this.firstName);
        sb.append(", hidden=");
        sb.append(this.hidden);
        sb.append(", lastName=");
        sb.append(this.lastName);
        sb.append(", canAccessClosed=");
        sb.append(this.canAccessClosed);
        sb.append(", isClosed=");
        sb.append(this.isClosed);
        sb.append(", isCached=");
        return tn.a(sb, this.isCached, ')');
    }

    public final BaseBoolIntDto u() {
        return this.canSeeGifts;
    }

    public final List<String> v0() {
        return this.descriptions;
    }

    public final String w0() {
        return this.domain;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        parcel.writeString(this.firstNameNom);
        parcel.writeString(this.firstNameGen);
        parcel.writeString(this.firstNameDat);
        parcel.writeString(this.firstNameAcc);
        parcel.writeString(this.firstNameIns);
        parcel.writeString(this.firstNameAbl);
        parcel.writeString(this.lastNameNom);
        parcel.writeString(this.lastNameGen);
        parcel.writeString(this.lastNameDat);
        parcel.writeString(this.lastNameAcc);
        parcel.writeString(this.lastNameIns);
        parcel.writeString(this.lastNameAbl);
        parcel.writeString(this.nickname);
        parcel.writeString(this.maidenName);
        parcel.writeString(this.contactName);
        parcel.writeString(this.domain);
        parcel.writeString(this.bdate);
        BdateVisibilityDto bdateVisibilityDto = this.bdateVisibility;
        if (bdateVisibilityDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bdateVisibilityDto.writeToParcel(parcel, i);
        }
        BaseCityDto baseCityDto = this.city;
        if (baseCityDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseCityDto.writeToParcel(parcel, i);
        }
        BaseCountryDto baseCountryDto = this.country;
        if (baseCountryDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseCountryDto.writeToParcel(parcel, i);
        }
        Float f = this.timezone;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        OwnerStateDto ownerStateDto = this.ownerState;
        if (ownerStateDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ownerStateDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.photo200);
        parcel.writeString(this.photoMax);
        parcel.writeString(this.photo200Orig);
        parcel.writeString(this.photo400Orig);
        parcel.writeString(this.photoMaxOrig);
        parcel.writeString(this.photoId);
        BaseBoolIntDto baseBoolIntDto = this.hasPhoto;
        if (baseBoolIntDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto.writeToParcel(parcel, i);
        }
        BaseOwnerCoverDto baseOwnerCoverDto = this.cover;
        if (baseOwnerCoverDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseOwnerCoverDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.photoAvgColor);
        BaseBoolIntDto baseBoolIntDto2 = this.hasMobile;
        if (baseBoolIntDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto2.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto3 = this.isFriend;
        if (baseBoolIntDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto3.writeToParcel(parcel, i);
        }
        Boolean bool = this.isBestFriend;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        BaseBoolIntDto baseBoolIntDto4 = this.wallComments;
        if (baseBoolIntDto4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto4.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto5 = this.canPost;
        if (baseBoolIntDto5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto5.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto6 = this.canSeeAllPosts;
        if (baseBoolIntDto6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto6.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto7 = this.canSeeAudio;
        if (baseBoolIntDto7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto7.writeToParcel(parcel, i);
        }
        UsersUserTypeDto usersUserTypeDto = this.type;
        if (usersUserTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersUserTypeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.email);
        parcel.writeString(this.skype);
        parcel.writeString(this.facebook);
        parcel.writeString(this.facebookName);
        parcel.writeString(this.twitter);
        BaseBoolIntDto baseBoolIntDto8 = this.isAdult;
        if (baseBoolIntDto8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto8.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto9 = this.isSubscribed;
        if (baseBoolIntDto9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto9.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.isSubscribedStories;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.canSubscribeStories;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.canAskQuestion;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.canAskAnonymous;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        parcel.writeString(this.subscriptionCountry);
        parcel.writeString(this.livejournal);
        parcel.writeString(this.instagram);
        BaseBoolIntDto baseBoolIntDto10 = this.test;
        if (baseBoolIntDto10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto10.writeToParcel(parcel, i);
        }
        VideoLiveInfoDto videoLiveInfoDto = this.videoLive;
        if (videoLiveInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoLiveInfoDto.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto11 = this.isVideoLiveNotificationsBlocked;
        if (baseBoolIntDto11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto11.writeToParcel(parcel, i);
        }
        Boolean bool6 = this.isService;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        parcel.writeString(this.serviceDescription);
        parcel.writeString(this.photoRec);
        parcel.writeString(this.photoMedium);
        parcel.writeString(this.photoMediumRec);
        parcel.writeString(this.photo);
        parcel.writeString(this.photoBig);
        parcel.writeString(this.photo400);
        PhotosPhotoDto photosPhotoDto = this.photoMaxSize;
        if (photosPhotoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photosPhotoDto.writeToParcel(parcel, i);
        }
        List<List<UsersProfileButtonDto>> list = this.profileButtons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list, 1);
            while (f2.hasNext()) {
                Iterator a2 = ao.a(parcel, (List) f2.next());
                while (a2.hasNext()) {
                    ((UsersProfileButtonDto) a2.next()).writeToParcel(parcel, i);
                }
            }
        }
        List<List<UsersProfileButtonDto>> list2 = this.profileButtonsTablet;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list2, 1);
            while (f3.hasNext()) {
                Iterator a3 = ao.a(parcel, (List) f3.next());
                while (a3.hasNext()) {
                    ((UsersProfileButtonDto) a3.next()).writeToParcel(parcel, i);
                }
            }
        }
        List<UsersProfileButtonDto> list3 = this.thirdPartyButtons;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list3, 1);
            while (f4.hasNext()) {
                ((UsersProfileButtonDto) f4.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.language);
        Integer num = this.storiesArchiveCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool7 = this.hasUnseenStories;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        WallDefaultDto wallDefaultDto = this.wallDefault;
        if (wallDefaultDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallDefaultDto.writeToParcel(parcel, i);
        }
        AudioMusicAwardsDto audioMusicAwardsDto = this.musicAwards;
        if (audioMusicAwardsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioMusicAwardsDto.writeToParcel(parcel, i);
        }
        Boolean bool8 = this.canCall;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool8);
        }
        Boolean bool9 = this.canCallFromGroup;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool9);
        }
        Boolean bool10 = this.canInviteAsVoiceroomsSpeaker;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool10);
        }
        Boolean bool11 = this.canSeeWishes;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool11);
        }
        BaseBoolIntDto baseBoolIntDto12 = this.canSeeGifts;
        if (baseBoolIntDto12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto12.writeToParcel(parcel, i);
        }
        List<BaseOwnerButtonDto> list4 = this.buttons;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list4, 1);
            while (f5.hasNext()) {
                ((BaseOwnerButtonDto) f5.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.interests);
        parcel.writeString(this.books);
        parcel.writeString(this.tv);
        parcel.writeString(this.quotes);
        parcel.writeString(this.about);
        parcel.writeString(this.games);
        parcel.writeString(this.movies);
        parcel.writeString(this.activities);
        parcel.writeString(this.music);
        BaseBoolIntDto baseBoolIntDto13 = this.canWritePrivateMessage;
        if (baseBoolIntDto13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto13.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto14 = this.canSendFriendRequest;
        if (baseBoolIntDto14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto14.writeToParcel(parcel, i);
        }
        Boolean bool12 = this.canBeInvitedGroup;
        if (bool12 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool12);
        }
        parcel.writeString(this.mobilePhone);
        parcel.writeString(this.homePhone);
        parcel.writeString(this.site);
        AudioAudioDto audioAudioDto = this.statusAudio;
        if (audioAudioDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioAudioDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.status);
        parcel.writeString(this.activity);
        AppsAppMinDto appsAppMinDto = this.statusApp;
        if (appsAppMinDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAppMinDto.writeToParcel(parcel, i);
        }
        UsersLastSeenDto usersLastSeenDto = this.lastSeen;
        if (usersLastSeenDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersLastSeenDto.writeToParcel(parcel, i);
        }
        UsersExportsDto usersExportsDto = this.exports;
        if (usersExportsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersExportsDto.writeToParcel(parcel, i);
        }
        BaseCropPhotoDto baseCropPhotoDto = this.cropPhoto;
        if (baseCropPhotoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseCropPhotoDto.writeToParcel(parcel, i);
        }
        Integer num2 = this.followersCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.videoLiveLevel;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.videoLiveCount;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Integer num5 = this.clipsCount;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        BaseBoolIntDto baseBoolIntDto15 = this.blacklisted;
        if (baseBoolIntDto15 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto15.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto16 = this.blacklistedByMe;
        if (baseBoolIntDto16 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto16.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto17 = this.isFavorite;
        if (baseBoolIntDto17 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto17.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto18 = this.isHiddenFromFeed;
        if (baseBoolIntDto18 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto18.writeToParcel(parcel, i);
        }
        Integer num6 = this.commonCount;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        UsersOccupationDto usersOccupationDto = this.occupation;
        if (usersOccupationDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersOccupationDto.writeToParcel(parcel, i);
        }
        List<UsersCareerDto> list5 = this.career;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f6 = dn.f(parcel, list5, 1);
            while (f6.hasNext()) {
                ((UsersCareerDto) f6.next()).writeToParcel(parcel, i);
            }
        }
        List<UsersMilitaryDto> list6 = this.military;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f7 = dn.f(parcel, list6, 1);
            while (f7.hasNext()) {
                ((UsersMilitaryDto) f7.next()).writeToParcel(parcel, i);
            }
        }
        Integer num7 = this.university;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num7);
        }
        parcel.writeString(this.universityName);
        Integer num8 = this.universityGroupId;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num8);
        }
        Integer num9 = this.faculty;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num9);
        }
        parcel.writeString(this.facultyName);
        Integer num10 = this.graduation;
        if (num10 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num10);
        }
        parcel.writeString(this.educationForm);
        parcel.writeString(this.educationStatus);
        parcel.writeString(this.homeTown);
        UsersUserRelationDto usersUserRelationDto = this.relation;
        if (usersUserRelationDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersUserRelationDto.writeToParcel(parcel, i);
        }
        UsersUserMinDto usersUserMinDto = this.relationPartner;
        if (usersUserMinDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersUserMinDto.writeToParcel(parcel, i);
        }
        UsersPersonalDto usersPersonalDto = this.personal;
        if (usersPersonalDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersPersonalDto.writeToParcel(parcel, i);
        }
        List<UsersUniversityDto> list7 = this.universities;
        if (list7 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f8 = dn.f(parcel, list7, 1);
            while (f8.hasNext()) {
                ((UsersUniversityDto) f8.next()).writeToParcel(parcel, i);
            }
        }
        List<UsersSchoolDto> list8 = this.schools;
        if (list8 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f9 = dn.f(parcel, list8, 1);
            while (f9.hasNext()) {
                ((UsersSchoolDto) f9.next()).writeToParcel(parcel, i);
            }
        }
        List<UsersRelativeDto> list9 = this.relatives;
        if (list9 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f10 = dn.f(parcel, list9, 1);
            while (f10.hasNext()) {
                ((UsersRelativeDto) f10.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool13 = this.isSubscribedPodcasts;
        if (bool13 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool13);
        }
        Boolean bool14 = this.canSubscribePodcasts;
        if (bool14 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool14);
        }
        Boolean bool15 = this.canSubscribePosts;
        if (bool15 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool15);
        }
        Boolean bool16 = this.isStudent;
        if (bool16 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool16);
        }
        Boolean bool17 = this.hasRights;
        if (bool17 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool17);
        }
        parcel.writeString(this.sysUsername);
        UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto = this.employeeWorkingState;
        if (usersEmployeeWorkingStateDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersEmployeeWorkingStateDto.writeToParcel(parcel, i);
        }
        EmployeeMarkDto employeeMarkDto = this.employeeMark;
        if (employeeMarkDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            employeeMarkDto.writeToParcel(parcel, i);
        }
        UsersRightsLocationDto usersRightsLocationDto = this.rightsLocation;
        if (usersRightsLocationDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersRightsLocationDto.writeToParcel(parcel, i);
        }
        Boolean bool18 = this.canInviteToChats;
        if (bool18 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool18);
        }
        UsersEmojiStatusDto usersEmojiStatusDto = this.emojiStatus;
        if (usersEmojiStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersEmojiStatusDto.writeToParcel(parcel, i);
        }
        StatusImageStatusDto statusImageStatusDto = this.imageStatus;
        if (statusImageStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            statusImageStatusDto.writeToParcel(parcel, i);
        }
        UsersUserCountersDto usersUserCountersDto = this.counters;
        if (usersUserCountersDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersUserCountersDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.accessKey);
        BaseBoolIntDto baseBoolIntDto19 = this.canUploadDoc;
        if (baseBoolIntDto19 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto19.writeToParcel(parcel, i);
        }
        Boolean bool19 = this.canBan;
        if (bool19 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool19);
        }
        parcel.writeStringList(this.eduDetails);
        parcel.writeString(this.hash);
        Boolean bool20 = this.hasEmail;
        if (bool20 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool20);
        }
        Boolean bool21 = this.isDead;
        if (bool21 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool21);
        }
        UsersGiftsTooltipDto usersGiftsTooltipDto = this.giftsTooltip;
        if (usersGiftsTooltipDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersGiftsTooltipDto.writeToParcel(parcel, i);
        }
        NoIndexDto noIndexDto = this.noIndex;
        if (noIndexDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            noIndexDto.writeToParcel(parcel, i);
        }
        Integer num11 = this.contactId;
        if (num11 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num11);
        }
        MessagesContactDto messagesContactDto = this.contact;
        if (messagesContactDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesContactDto.writeToParcel(parcel, i);
        }
        Boolean bool22 = this.isMessageRequest;
        if (bool22 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool22);
        }
        parcel.writeStringList(this.descriptions);
        List<Integer> list10 = this.lists;
        if (list10 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f11 = dn.f(parcel, list10, 1);
            while (f11.hasNext()) {
                parcel.writeInt(((Number) f11.next()).intValue());
            }
        }
        Integer num12 = this.friendshipWeeks;
        if (num12 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num12);
        }
        parcel.writeString(this.trackCode);
        Boolean bool23 = this.isPersonalAdsEasyPromoteEnabled;
        if (bool23 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool23);
        }
        Boolean bool24 = this.needBigMsgBtnInProfile;
        if (bool24 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool24);
        }
        UsersUserProfileTypeDto usersUserProfileTypeDto = this.profileType;
        if (usersUserProfileTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersUserProfileTypeDto.writeToParcel(parcel, i);
        }
        UsersCanNotCallReasonDto usersCanNotCallReasonDto = this.canNotCallReason;
        if (usersCanNotCallReasonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersCanNotCallReasonDto.writeToParcel(parcel, i);
        }
        Boolean bool25 = this.canCallAsCommunity;
        if (bool25 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool25);
        }
        Boolean bool26 = this.isNft;
        if (bool26 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool26);
        }
        BaseImageDto baseImageDto = this.animatedAvatar;
        if (baseImageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseImageDto.writeToParcel(parcel, i);
        }
        List<CallsCustomNameForCallDto> list11 = this.customNamesForCalls;
        if (list11 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f12 = dn.f(parcel, list11, 1);
            while (f12.hasNext()) {
                ((CallsCustomNameForCallDto) f12.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool27 = this.isEsiaVerified;
        if (bool27 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool27);
        }
        Boolean bool28 = this.isEsiaLinked;
        if (bool28 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool28);
        }
        Boolean bool29 = this.isTinkoffVerified;
        if (bool29 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool29);
        }
        Boolean bool30 = this.isTinkoffLinked;
        if (bool30 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool30);
        }
        Boolean bool31 = this.isSberVerified;
        if (bool31 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool31);
        }
        Boolean bool32 = this.isVerified;
        if (bool32 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool32);
        }
        Boolean bool33 = this.isFollowersModeOn;
        if (bool33 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool33);
        }
        SocialButtonTypeDto socialButtonTypeDto = this.socialButtonType;
        if (socialButtonTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            socialButtonTypeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.description);
        Boolean bool34 = this.isTeacher;
        if (bool34 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool34);
        }
        parcel.writeStringList(this.oauthLinked);
        parcel.writeStringList(this.oauthVerification);
        Boolean bool35 = this.isSberLinked;
        if (bool35 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool35);
        }
        Integer num13 = this.ageMark;
        if (num13 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num13);
        }
        Integer num14 = this.joined;
        if (num14 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num14);
        }
        Boolean bool36 = this.isServiceAccount;
        if (bool36 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool36);
        }
        UsersPromotionAllowanceDto usersPromotionAllowanceDto = this.promotionAllowance;
        if (usersPromotionAllowanceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersPromotionAllowanceDto.writeToParcel(parcel, i);
        }
        Boolean bool37 = this.coOwnershipEnabled;
        if (bool37 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool37);
        }
        Integer num15 = this.ageGroup;
        if (num15 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num15);
        }
        Boolean bool38 = this.hasRelatedUserPin;
        if (bool38 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool38);
        }
        MessagesEduEducationalProfileDto messagesEduEducationalProfileDto = this.educationalProfile;
        if (messagesEduEducationalProfileDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesEduEducationalProfileDto.writeToParcel(parcel, i);
        }
        BaseAPlusMarkDto baseAPlusMarkDto = this.aPlusMark;
        if (baseAPlusMarkDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseAPlusMarkDto.writeToParcel(parcel, i);
        }
        Boolean bool39 = this.isDon;
        if (bool39 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool39);
        }
        Boolean bool40 = this.isMediaModer;
        if (bool40 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool40);
        }
        Boolean bool41 = this.isPhotoMapEnabled;
        if (bool41 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool41);
        }
        UsersDonutDto usersDonutDto = this.donut;
        if (usersDonutDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersDonutDto.writeToParcel(parcel, i);
        }
        BaseSexDto baseSexDto = this.sex;
        if (baseSexDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseSexDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.screenName);
        parcel.writeString(this.photo50);
        parcel.writeString(this.photo100);
        parcel.writeString(this.photoBase);
        UsersOnlineInfoDto usersOnlineInfoDto = this.onlineInfo;
        if (usersOnlineInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersOnlineInfoDto.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto20 = this.online;
        if (baseBoolIntDto20 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto20.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto21 = this.onlineMobile;
        if (baseBoolIntDto21 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto21.writeToParcel(parcel, i);
        }
        Integer num16 = this.onlineApp;
        if (num16 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num16);
        }
        BaseBoolIntDto baseBoolIntDto22 = this.verified;
        if (baseBoolIntDto22 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto22.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto23 = this.trending;
        if (baseBoolIntDto23 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto23.writeToParcel(parcel, i);
        }
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto = this.friendStatus;
        if (friendsFriendStatusStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            friendsFriendStatusStatusDto.writeToParcel(parcel, i);
        }
        FriendsRequestsMutualDto friendsRequestsMutualDto = this.mutual;
        if (friendsRequestsMutualDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            friendsRequestsMutualDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.deactivated);
        parcel.writeString(this.firstName);
        Integer num17 = this.hidden;
        if (num17 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num17);
        }
        parcel.writeString(this.lastName);
        Boolean bool42 = this.canAccessClosed;
        if (bool42 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool42);
        }
        Boolean bool43 = this.isClosed;
        if (bool43 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool43);
        }
        Boolean bool44 = this.isCached;
        if (bool44 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool44);
        }
    }

    public final String x1() {
        return this.lastName;
    }

    public final UsersEmojiStatusDto y0() {
        return this.emojiStatus;
    }

    public final String y1() {
        return this.lastNameAbl;
    }

    public final String y2() {
        return this.photoMax;
    }

    public final String z1() {
        return this.lastNameAcc;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ UsersUserFullDto(UserId userId, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, BdateVisibilityDto bdateVisibilityDto, BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, Float f, OwnerStateDto ownerStateDto, String str18, String str19, String str20, String str21, String str22, String str23, BaseBoolIntDto baseBoolIntDto, BaseOwnerCoverDto baseOwnerCoverDto, String str24, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Boolean bool, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, UsersUserTypeDto usersUserTypeDto, String str25, String str26, String str27, String str28, String str29, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str30, String str31, String str32, BaseBoolIntDto baseBoolIntDto10, VideoLiveInfoDto videoLiveInfoDto, BaseBoolIntDto baseBoolIntDto11, Boolean bool6, String str33, String str34, String str35, String str36, String str37, String str38, String str39, PhotosPhotoDto photosPhotoDto, List list, List list2, List list3, String str40, Integer num, Boolean bool7, WallDefaultDto wallDefaultDto, AudioMusicAwardsDto audioMusicAwardsDto, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, BaseBoolIntDto baseBoolIntDto12, List list4, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, BaseBoolIntDto baseBoolIntDto13, BaseBoolIntDto baseBoolIntDto14, Boolean bool12, String str50, String str51, String str52, AudioAudioDto audioAudioDto, String str53, String str54, AppsAppMinDto appsAppMinDto, UsersLastSeenDto usersLastSeenDto, UsersExportsDto usersExportsDto, BaseCropPhotoDto baseCropPhotoDto, Integer num2, Integer num3, Integer num4, Integer num5, BaseBoolIntDto baseBoolIntDto15, BaseBoolIntDto baseBoolIntDto16, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, Integer num6, UsersOccupationDto usersOccupationDto, List list5, List list6, Integer num7, String str55, Integer num8, Integer num9, String str56, Integer num10, String str57, String str58, String str59, UsersUserRelationDto usersUserRelationDto, UsersUserMinDto usersUserMinDto, UsersPersonalDto usersPersonalDto, List list7, List list8, List list9, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, String str60, UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto, EmployeeMarkDto employeeMarkDto, UsersRightsLocationDto usersRightsLocationDto, Boolean bool18, UsersEmojiStatusDto usersEmojiStatusDto, StatusImageStatusDto statusImageStatusDto, UsersUserCountersDto usersUserCountersDto, String str61, BaseBoolIntDto baseBoolIntDto19, Boolean bool19, List list10, String str62, Boolean bool20, Boolean bool21, UsersGiftsTooltipDto usersGiftsTooltipDto, NoIndexDto noIndexDto, Integer num11, MessagesContactDto messagesContactDto, Boolean bool22, List list11, List list12, Integer num12, String str63, Boolean bool23, Boolean bool24, UsersUserProfileTypeDto usersUserProfileTypeDto, UsersCanNotCallReasonDto usersCanNotCallReasonDto, Boolean bool25, Boolean bool26, BaseImageDto baseImageDto, List list13, Boolean bool27, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, Boolean bool33, SocialButtonTypeDto socialButtonTypeDto, String str64, Boolean bool34, List list14, List list15, Boolean bool35, Integer num13, Integer num14, Boolean bool36, UsersPromotionAllowanceDto usersPromotionAllowanceDto, Boolean bool37, Integer num15, Boolean bool38, MessagesEduEducationalProfileDto messagesEduEducationalProfileDto, BaseAPlusMarkDto baseAPlusMarkDto, Boolean bool39, Boolean bool40, Boolean bool41, UsersDonutDto usersDonutDto, BaseSexDto baseSexDto, String str65, String str66, String str67, String str68, UsersOnlineInfoDto usersOnlineInfoDto, BaseBoolIntDto baseBoolIntDto20, BaseBoolIntDto baseBoolIntDto21, Integer num16, BaseBoolIntDto baseBoolIntDto22, BaseBoolIntDto baseBoolIntDto23, FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, FriendsRequestsMutualDto friendsRequestsMutualDto, String str69, String str70, Integer num17, String str71, Boolean bool42, Boolean bool43, Boolean bool44, int i, int i2, int i3, int i4, int i5, int i6, int i7, zcl zclVar) {
        this(userId, r161, r9, r10, r11, r12, r13, r14, r15, r8, r162, r163, r164, r165, r7, r17, r19, r21, r23, r25, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r166, r39, r40, r41, r42, r43, r44, r45, r167, r168, r169, r170, r171, r172, r173, r174, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r1, r62, r63, r64, r65, r66, r67, r68, r175, r176, r177, r178, r179, r180, r181, r182, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r2, r85, r86, r87, r88, r89, r90, r91, r183, r184, r185, r186, r187, r188, r189, r190, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r3, r108, r109, r110, r111, r112, r113, r114, r191, r192, r193, r194, r195, r196, r197, r0, (i5 & 32768) != 0 ? null : baseBoolIntDto19, (i5 & 65536) != 0 ? null : bool19, (i5 & 131072) != 0 ? null : list10, (i5 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str62, (i5 & 524288) != 0 ? null : bool20, (i5 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool21, (i5 & 2097152) != 0 ? null : usersGiftsTooltipDto, (i5 & 4194304) != 0 ? null : noIndexDto, (i5 & 8388608) != 0 ? null : num11, (i5 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : messagesContactDto, (i5 & 33554432) != 0 ? null : bool22, (i5 & 67108864) != 0 ? null : list11, (i5 & 134217728) != 0 ? null : list12, (i5 & 268435456) != 0 ? null : num12, (i5 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str63, (i5 & 1073741824) != 0 ? null : bool23, (i5 & Integer.MIN_VALUE) != 0 ? null : bool24, (i6 & 1) != 0 ? null : usersUserProfileTypeDto, (i6 & 2) != 0 ? null : usersCanNotCallReasonDto, (i6 & 4) != 0 ? null : bool25, (i6 & 8) != 0 ? null : bool26, (i6 & 16) != 0 ? null : baseImageDto, (i6 & 32) != 0 ? null : list13, (i6 & 64) != 0 ? null : bool27, (i6 & 128) != 0 ? null : bool28, (i6 & 256) != 0 ? null : bool29, (i6 & 512) != 0 ? null : bool30, (i6 & 1024) != 0 ? null : bool31, (i6 & 2048) != 0 ? null : bool32, (i6 & 4096) != 0 ? null : bool33, (i6 & 8192) != 0 ? null : socialButtonTypeDto, (i6 & 16384) != 0 ? null : str64, (i6 & 32768) != 0 ? null : bool34, (i6 & 65536) != 0 ? null : list14, (i6 & 131072) != 0 ? null : list15, (i6 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool35, (i6 & 524288) != 0 ? null : num13, (i6 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num14, (i6 & 2097152) != 0 ? null : bool36, (i6 & 4194304) != 0 ? null : usersPromotionAllowanceDto, (i6 & 8388608) != 0 ? null : bool37, (i6 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : num15, (i6 & 33554432) != 0 ? null : bool38, (i6 & 67108864) != 0 ? null : messagesEduEducationalProfileDto, (i6 & 134217728) != 0 ? null : baseAPlusMarkDto, (i6 & 268435456) != 0 ? null : bool39, (i6 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool40, (i6 & 1073741824) != 0 ? null : bool41, (i6 & Integer.MIN_VALUE) != 0 ? null : usersDonutDto, (i7 & 1) != 0 ? null : baseSexDto, (i7 & 2) != 0 ? null : str65, (i7 & 4) != 0 ? null : str66, (i7 & 8) != 0 ? null : str67, (i7 & 16) != 0 ? null : str68, (i7 & 32) != 0 ? null : usersOnlineInfoDto, (i7 & 64) != 0 ? null : baseBoolIntDto20, (i7 & 128) != 0 ? null : baseBoolIntDto21, (i7 & 256) != 0 ? null : num16, (i7 & 512) != 0 ? null : baseBoolIntDto22, (i7 & 1024) != 0 ? null : baseBoolIntDto23, (i7 & 2048) != 0 ? null : friendsFriendStatusStatusDto, (i7 & 4096) != 0 ? null : friendsRequestsMutualDto, (i7 & 8192) != 0 ? null : str69, (i7 & 16384) != 0 ? null : str70, (i7 & 32768) != 0 ? null : num17, (i7 & 65536) != 0 ? null : str71, (i7 & 131072) != 0 ? null : bool42, (i7 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool43, (i7 & 524288) != 0 ? null : bool44);
        String str72 = (i & 2) != 0 ? null : str;
        String str73 = (i & 4) != 0 ? null : str2;
        String str74 = (i & 8) != 0 ? null : str3;
        String str75 = (i & 16) != 0 ? null : str4;
        String str76 = (i & 32) != 0 ? null : str5;
        String str77 = (i & 64) != 0 ? null : str6;
        String str78 = (i & 128) != 0 ? null : str7;
        String str79 = (i & 256) != 0 ? null : str8;
        String str80 = (i & 512) != 0 ? null : str9;
        String str81 = str72;
        String str82 = (i & 1024) != 0 ? null : str10;
        String str83 = (i & 2048) != 0 ? null : str11;
        String str84 = (i & 4096) != 0 ? null : str12;
        String str85 = (i & 8192) != 0 ? null : str13;
        String str86 = (i & 16384) != 0 ? null : str14;
        String str87 = (i & 32768) != 0 ? null : str15;
        String str88 = (i & 65536) != 0 ? null : str16;
        String str89 = (i & 131072) != 0 ? null : str17;
        BdateVisibilityDto bdateVisibilityDto2 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bdateVisibilityDto;
        BaseCityDto baseCityDto2 = (i & 524288) != 0 ? null : baseCityDto;
        BaseCountryDto baseCountryDto2 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : baseCountryDto;
        Float f2 = (i & 2097152) != 0 ? null : f;
        OwnerStateDto ownerStateDto2 = (i & 4194304) != 0 ? null : ownerStateDto;
        String str90 = (i & 8388608) != 0 ? null : str18;
        String str91 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str19;
        String str92 = (i & 33554432) != 0 ? null : str20;
        String str93 = (i & 67108864) != 0 ? null : str21;
        String str94 = (i & 134217728) != 0 ? null : str22;
        String str95 = (i & 268435456) != 0 ? null : str23;
        BaseBoolIntDto baseBoolIntDto24 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : baseBoolIntDto;
        BaseOwnerCoverDto baseOwnerCoverDto2 = (i & 1073741824) != 0 ? null : baseOwnerCoverDto;
        String str96 = (i & Integer.MIN_VALUE) != 0 ? null : str24;
        BaseBoolIntDto baseBoolIntDto25 = (i2 & 1) != 0 ? null : baseBoolIntDto2;
        BaseBoolIntDto baseBoolIntDto26 = (i2 & 2) != 0 ? null : baseBoolIntDto3;
        Boolean bool45 = (i2 & 4) != 0 ? null : bool;
        BaseBoolIntDto baseBoolIntDto27 = (i2 & 8) != 0 ? null : baseBoolIntDto4;
        BaseBoolIntDto baseBoolIntDto28 = (i2 & 16) != 0 ? null : baseBoolIntDto5;
        BaseBoolIntDto baseBoolIntDto29 = (i2 & 32) != 0 ? null : baseBoolIntDto6;
        BaseBoolIntDto baseBoolIntDto30 = (i2 & 64) != 0 ? null : baseBoolIntDto7;
        String str97 = str96;
        UsersUserTypeDto usersUserTypeDto2 = (i2 & 128) != 0 ? null : usersUserTypeDto;
        String str98 = (i2 & 256) != 0 ? null : str25;
        String str99 = (i2 & 512) != 0 ? null : str26;
        String str100 = (i2 & 1024) != 0 ? null : str27;
        String str101 = (i2 & 2048) != 0 ? null : str28;
        String str102 = (i2 & 4096) != 0 ? null : str29;
        BaseBoolIntDto baseBoolIntDto31 = (i2 & 8192) != 0 ? null : baseBoolIntDto8;
        BaseBoolIntDto baseBoolIntDto32 = (i2 & 16384) != 0 ? null : baseBoolIntDto9;
        Boolean bool46 = (i2 & 32768) != 0 ? null : bool2;
        Boolean bool47 = (i2 & 65536) != 0 ? null : bool3;
        Boolean bool48 = (i2 & 131072) != 0 ? null : bool4;
        Boolean bool49 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool5;
        String str103 = (i2 & 524288) != 0 ? null : str30;
        String str104 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str31;
        String str105 = (i2 & 2097152) != 0 ? null : str32;
        BaseBoolIntDto baseBoolIntDto33 = (i2 & 4194304) != 0 ? null : baseBoolIntDto10;
        VideoLiveInfoDto videoLiveInfoDto2 = (i2 & 8388608) != 0 ? null : videoLiveInfoDto;
        BaseBoolIntDto baseBoolIntDto34 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : baseBoolIntDto11;
        Boolean bool50 = (i2 & 33554432) != 0 ? null : bool6;
        String str106 = (i2 & 67108864) != 0 ? null : str33;
        String str107 = (i2 & 134217728) != 0 ? null : str34;
        String str108 = (i2 & 268435456) != 0 ? null : str35;
        String str109 = (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str36;
        String str110 = (i2 & 1073741824) != 0 ? null : str37;
        String str111 = (i2 & Integer.MIN_VALUE) != 0 ? null : str38;
        String str112 = (i3 & 1) != 0 ? null : str39;
        PhotosPhotoDto photosPhotoDto2 = (i3 & 2) != 0 ? null : photosPhotoDto;
        List list16 = (i3 & 4) != 0 ? null : list;
        List list17 = (i3 & 8) != 0 ? null : list2;
        List list18 = (i3 & 16) != 0 ? null : list3;
        String str113 = (i3 & 32) != 0 ? null : str40;
        Integer num18 = (i3 & 64) != 0 ? null : num;
        BaseBoolIntDto baseBoolIntDto35 = baseBoolIntDto32;
        Boolean bool51 = (i3 & 128) != 0 ? null : bool7;
        WallDefaultDto wallDefaultDto2 = (i3 & 256) != 0 ? null : wallDefaultDto;
        AudioMusicAwardsDto audioMusicAwardsDto2 = (i3 & 512) != 0 ? null : audioMusicAwardsDto;
        Boolean bool52 = (i3 & 1024) != 0 ? null : bool8;
        Boolean bool53 = (i3 & 2048) != 0 ? null : bool9;
        Boolean bool54 = (i3 & 4096) != 0 ? null : bool10;
        Boolean bool55 = (i3 & 8192) != 0 ? null : bool11;
        BaseBoolIntDto baseBoolIntDto36 = (i3 & 16384) != 0 ? null : baseBoolIntDto12;
        List list19 = (i3 & 32768) != 0 ? null : list4;
        String str114 = (i3 & 65536) != 0 ? null : str41;
        String str115 = (i3 & 131072) != 0 ? null : str42;
        String str116 = (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str43;
        String str117 = (i3 & 524288) != 0 ? null : str44;
        String str118 = (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str45;
        String str119 = (i3 & 2097152) != 0 ? null : str46;
        String str120 = (i3 & 4194304) != 0 ? null : str47;
        String str121 = (i3 & 8388608) != 0 ? null : str48;
        String str122 = (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str49;
        BaseBoolIntDto baseBoolIntDto37 = (i3 & 33554432) != 0 ? null : baseBoolIntDto13;
        BaseBoolIntDto baseBoolIntDto38 = (i3 & 67108864) != 0 ? null : baseBoolIntDto14;
        Boolean bool56 = (i3 & 134217728) != 0 ? null : bool12;
        String str123 = (i3 & 268435456) != 0 ? null : str50;
        String str124 = (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str51;
        String str125 = (i3 & 1073741824) != 0 ? null : str52;
        AudioAudioDto audioAudioDto2 = (i3 & Integer.MIN_VALUE) != 0 ? null : audioAudioDto;
        String str126 = (i4 & 1) != 0 ? null : str53;
        String str127 = (i4 & 2) != 0 ? null : str54;
        AppsAppMinDto appsAppMinDto2 = (i4 & 4) != 0 ? null : appsAppMinDto;
        UsersLastSeenDto usersLastSeenDto2 = (i4 & 8) != 0 ? null : usersLastSeenDto;
        UsersExportsDto usersExportsDto2 = (i4 & 16) != 0 ? null : usersExportsDto;
        BaseCropPhotoDto baseCropPhotoDto2 = (i4 & 32) != 0 ? null : baseCropPhotoDto;
        Integer num19 = (i4 & 64) != 0 ? null : num2;
        BaseBoolIntDto baseBoolIntDto39 = baseBoolIntDto36;
        Integer num20 = (i4 & 128) != 0 ? null : num3;
        Integer num21 = (i4 & 256) != 0 ? null : num4;
        Integer num22 = (i4 & 512) != 0 ? null : num5;
        BaseBoolIntDto baseBoolIntDto40 = (i4 & 1024) != 0 ? null : baseBoolIntDto15;
        BaseBoolIntDto baseBoolIntDto41 = (i4 & 2048) != 0 ? null : baseBoolIntDto16;
        BaseBoolIntDto baseBoolIntDto42 = (i4 & 4096) != 0 ? null : baseBoolIntDto17;
        BaseBoolIntDto baseBoolIntDto43 = (i4 & 8192) != 0 ? null : baseBoolIntDto18;
        Integer num23 = (i4 & 16384) != 0 ? null : num6;
        UsersOccupationDto usersOccupationDto2 = (i4 & 32768) != 0 ? null : usersOccupationDto;
        List list20 = (i4 & 65536) != 0 ? null : list5;
        List list21 = (i4 & 131072) != 0 ? null : list6;
        Integer num24 = (i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num7;
        String str128 = (i4 & 524288) != 0 ? null : str55;
        Integer num25 = (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num8;
        Integer num26 = (i4 & 2097152) != 0 ? null : num9;
        String str129 = (i4 & 4194304) != 0 ? null : str56;
        Integer num27 = (i4 & 8388608) != 0 ? null : num10;
        String str130 = (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str57;
        String str131 = (i4 & 33554432) != 0 ? null : str58;
        String str132 = (i4 & 67108864) != 0 ? null : str59;
        UsersUserRelationDto usersUserRelationDto2 = (i4 & 134217728) != 0 ? null : usersUserRelationDto;
        UsersUserMinDto usersUserMinDto2 = (i4 & 268435456) != 0 ? null : usersUserMinDto;
        UsersPersonalDto usersPersonalDto2 = (i4 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : usersPersonalDto;
        List list22 = (i4 & 1073741824) != 0 ? null : list7;
        List list23 = (i4 & Integer.MIN_VALUE) != 0 ? null : list8;
        List list24 = (i5 & 1) != 0 ? null : list9;
        Boolean bool57 = (i5 & 2) != 0 ? null : bool13;
        Boolean bool58 = (i5 & 4) != 0 ? null : bool14;
        Boolean bool59 = (i5 & 8) != 0 ? null : bool15;
        Boolean bool60 = (i5 & 16) != 0 ? null : bool16;
        Boolean bool61 = (i5 & 32) != 0 ? null : bool17;
        String str133 = (i5 & 64) != 0 ? null : str60;
        Integer num28 = num23;
        UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto2 = (i5 & 128) != 0 ? null : usersEmployeeWorkingStateDto;
        EmployeeMarkDto employeeMarkDto2 = (i5 & 256) != 0 ? null : employeeMarkDto;
        UsersRightsLocationDto usersRightsLocationDto2 = (i5 & 512) != 0 ? null : usersRightsLocationDto;
        Boolean bool62 = (i5 & 1024) != 0 ? null : bool18;
        UsersEmojiStatusDto usersEmojiStatusDto2 = (i5 & 2048) != 0 ? null : usersEmojiStatusDto;
        StatusImageStatusDto statusImageStatusDto2 = (i5 & 4096) != 0 ? null : statusImageStatusDto;
        UsersUserCountersDto usersUserCountersDto2 = (i5 & 8192) != 0 ? null : usersUserCountersDto;
        String str134 = (i5 & 16384) != 0 ? null : str61;
    }
}
