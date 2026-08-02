package com.vk.api.generated.friends.dto;

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
import com.vk.api.generated.messages.dto.MessagesContactDto;
import com.vk.api.generated.messagesEdu.dto.MessagesEduEducationalProfileDto;
import com.vk.api.generated.owner.dto.OwnerStateDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.status.dto.StatusImageStatusDto;
import com.vk.api.generated.users.dto.UsersCanNotCallReasonDto;
import com.vk.api.generated.users.dto.UsersCareerDto;
import com.vk.api.generated.users.dto.UsersDonutDto;
import com.vk.api.generated.users.dto.UsersEmojiStatusDto;
import com.vk.api.generated.users.dto.UsersEmployeeWorkingStateDto;
import com.vk.api.generated.users.dto.UsersExportsDto;
import com.vk.api.generated.users.dto.UsersGiftsTooltipDto;
import com.vk.api.generated.users.dto.UsersLastSeenDto;
import com.vk.api.generated.users.dto.UsersMilitaryDto;
import com.vk.api.generated.users.dto.UsersOccupationDto;
import com.vk.api.generated.users.dto.UsersOnlineInfoDto;
import com.vk.api.generated.users.dto.UsersPersonalDto;
import com.vk.api.generated.users.dto.UsersProfileButtonDto;
import com.vk.api.generated.users.dto.UsersPromotionAllowanceDto;
import com.vk.api.generated.users.dto.UsersRelativeDto;
import com.vk.api.generated.users.dto.UsersRightsLocationDto;
import com.vk.api.generated.users.dto.UsersSchoolDto;
import com.vk.api.generated.users.dto.UsersUniversityDto;
import com.vk.api.generated.users.dto.UsersUserCountersDto;
import com.vk.api.generated.users.dto.UsersUserMinDto;
import com.vk.api.generated.users.dto.UsersUserProfileTypeDto;
import com.vk.api.generated.users.dto.UsersUserRelationDto;
import com.vk.api.generated.users.dto.UsersUserTypeDto;
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
import xsna.bo;
import xsna.dn;
import xsna.eok;
import xsna.epx;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: FriendsInterestingRequestDto.kt */
/* loaded from: classes14.dex */
public final class FriendsInterestingRequestDto implements Parcelable {
    public static final Parcelable.Creator<FriendsInterestingRequestDto> CREATOR = new a();

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

    @pmi0("message")
    private final String message;

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

    @pmi0("timestamp")
    private final Integer timestamp;

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

    @pmi0("user_id")
    private final UserId userId;

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
    /* compiled from: FriendsInterestingRequestDto.kt */
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

        /* compiled from: FriendsInterestingRequestDto.kt */
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
    /* compiled from: FriendsInterestingRequestDto.kt */
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

        /* compiled from: FriendsInterestingRequestDto.kt */
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
    /* compiled from: FriendsInterestingRequestDto.kt */
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

        /* compiled from: FriendsInterestingRequestDto.kt */
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
    /* compiled from: FriendsInterestingRequestDto.kt */
    public static final class SocialButtonTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SocialButtonTypeDto[] $VALUES;

        @pmi0("add")
        public static final SocialButtonTypeDto ADD;
        public static final Parcelable.Creator<SocialButtonTypeDto> CREATOR;

        @pmi0("follow")
        public static final SocialButtonTypeDto FOLLOW;
        private final String value;

        /* compiled from: FriendsInterestingRequestDto.kt */
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

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FriendsInterestingRequestDto.kt */
    public static final class WallDefaultDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ WallDefaultDto[] $VALUES;

        @pmi0("all")
        public static final WallDefaultDto ALL;
        public static final Parcelable.Creator<WallDefaultDto> CREATOR;

        @pmi0("owner")
        public static final WallDefaultDto OWNER;
        private final String value;

        /* compiled from: FriendsInterestingRequestDto.kt */
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

    /* compiled from: FriendsInterestingRequestDto.kt */
    public static final class a implements Parcelable.Creator<FriendsInterestingRequestDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsInterestingRequestDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            Boolean valueOf6;
            PhotosPhotoDto photosPhotoDto;
            BaseBoolIntDto baseBoolIntDto;
            ArrayList arrayList;
            UserId userId;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Boolean valueOf7;
            UserId userId2;
            WallDefaultDto createFromParcel;
            Boolean valueOf8;
            Boolean valueOf9;
            Boolean valueOf10;
            Boolean valueOf11;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            Boolean valueOf12;
            UsersOccupationDto usersOccupationDto;
            ArrayList arrayList7;
            ArrayList arrayList8;
            BaseBoolIntDto baseBoolIntDto2;
            ArrayList arrayList9;
            ArrayList arrayList10;
            UsersPersonalDto usersPersonalDto;
            Integer num;
            ArrayList arrayList11;
            BaseBoolIntDto baseBoolIntDto3;
            ArrayList arrayList12;
            ArrayList arrayList13;
            ArrayList arrayList14;
            ArrayList arrayList15;
            Boolean valueOf13;
            Boolean valueOf14;
            Boolean valueOf15;
            Boolean valueOf16;
            Boolean valueOf17;
            UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto;
            EmployeeMarkDto createFromParcel2;
            Boolean valueOf18;
            Boolean valueOf19;
            Boolean valueOf20;
            Boolean valueOf21;
            UsersGiftsTooltipDto usersGiftsTooltipDto;
            NoIndexDto createFromParcel3;
            Boolean valueOf22;
            MessagesContactDto messagesContactDto;
            Boolean bool;
            ArrayList arrayList16;
            ArrayList arrayList17;
            Boolean valueOf23;
            Boolean valueOf24;
            Boolean valueOf25;
            Boolean valueOf26;
            BaseImageDto baseImageDto;
            ArrayList arrayList18;
            ArrayList arrayList19;
            Boolean bool2;
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
            Boolean valueOf37;
            Boolean valueOf38;
            Boolean valueOf39;
            Boolean valueOf40;
            Boolean valueOf41;
            Boolean valueOf42;
            Boolean valueOf43;
            Boolean valueOf44;
            UserId userId3 = (UserId) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            String readString = parcel.readString();
            UserId userId4 = (UserId) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            Integer valueOf45 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString2 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
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
            String readString18 = parcel.readString();
            String readString19 = parcel.readString();
            BdateVisibilityDto createFromParcel4 = parcel.readInt() == 0 ? null : BdateVisibilityDto.CREATOR.createFromParcel(parcel);
            BaseCityDto baseCityDto = (BaseCityDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            BaseCountryDto baseCountryDto = (BaseCountryDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            Float valueOf46 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            OwnerStateDto ownerStateDto = (OwnerStateDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            String readString20 = parcel.readString();
            String readString21 = parcel.readString();
            String readString22 = parcel.readString();
            String readString23 = parcel.readString();
            String readString24 = parcel.readString();
            String readString25 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto4 = (BaseBoolIntDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            BaseOwnerCoverDto baseOwnerCoverDto = (BaseOwnerCoverDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            String readString26 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto5 = (BaseBoolIntDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto6 = (BaseBoolIntDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            BaseBoolIntDto baseBoolIntDto7 = (BaseBoolIntDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            Boolean bool3 = valueOf;
            BaseBoolIntDto baseBoolIntDto8 = (BaseBoolIntDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto9 = (BaseBoolIntDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto10 = (BaseBoolIntDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            UsersUserTypeDto usersUserTypeDto = (UsersUserTypeDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            String readString27 = parcel.readString();
            String readString28 = parcel.readString();
            String readString29 = parcel.readString();
            String readString30 = parcel.readString();
            String readString31 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto11 = (BaseBoolIntDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto12 = (BaseBoolIntDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
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
            String readString32 = parcel.readString();
            Boolean bool4 = valueOf2;
            Boolean bool5 = valueOf3;
            Boolean bool6 = valueOf4;
            Boolean bool7 = valueOf5;
            String readString33 = parcel.readString();
            String readString34 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto13 = (BaseBoolIntDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            VideoLiveInfoDto videoLiveInfoDto = (VideoLiveInfoDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto14 = (BaseBoolIntDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString35 = parcel.readString();
            Boolean bool8 = valueOf6;
            String readString36 = parcel.readString();
            String readString37 = parcel.readString();
            String readString38 = parcel.readString();
            String readString39 = parcel.readString();
            String readString40 = parcel.readString();
            String readString41 = parcel.readString();
            PhotosPhotoDto photosPhotoDto2 = (PhotosPhotoDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                photosPhotoDto = photosPhotoDto2;
                baseBoolIntDto = baseBoolIntDto7;
                userId = userId3;
                arrayList = null;
            } else {
                photosPhotoDto = photosPhotoDto2;
                int readInt = parcel.readInt();
                baseBoolIntDto = baseBoolIntDto7;
                arrayList = new ArrayList(readInt);
                userId = userId3;
                int i = 0;
                while (i != readInt) {
                    int i2 = readInt;
                    int readInt2 = parcel.readInt();
                    int i3 = i;
                    ArrayList arrayList20 = new ArrayList(readInt2);
                    String str = readString;
                    int i4 = 0;
                    while (i4 != readInt2) {
                        i4 = bo.b(FriendsInterestingRequestDto.class, parcel, arrayList20, i4, 1);
                        readInt2 = readInt2;
                    }
                    arrayList.add(arrayList20);
                    i = i3 + 1;
                    readInt = i2;
                    readString = str;
                }
            }
            String str2 = readString;
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                int i5 = 0;
                while (i5 != readInt3) {
                    int i6 = readInt3;
                    int readInt4 = parcel.readInt();
                    ArrayList arrayList21 = arrayList;
                    ArrayList arrayList22 = new ArrayList(readInt4);
                    int i7 = i5;
                    int i8 = 0;
                    while (i8 != readInt4) {
                        i8 = bo.b(FriendsInterestingRequestDto.class, parcel, arrayList22, i8, 1);
                        readInt4 = readInt4;
                    }
                    arrayList2.add(arrayList22);
                    i5 = i7 + 1;
                    readInt3 = i6;
                    arrayList = arrayList21;
                }
            }
            ArrayList arrayList23 = arrayList;
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList3 = new ArrayList(readInt5);
                int i9 = 0;
                while (i9 != readInt5) {
                    i9 = bo.b(FriendsInterestingRequestDto.class, parcel, arrayList3, i9, 1);
                    readInt5 = readInt5;
                }
            }
            UserId userId5 = userId;
            String readString42 = parcel.readString();
            Integer valueOf47 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf7 = null;
            } else {
                valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                userId2 = userId5;
                createFromParcel = null;
            } else {
                userId2 = userId5;
                createFromParcel = WallDefaultDto.CREATOR.createFromParcel(parcel);
            }
            WallDefaultDto wallDefaultDto = createFromParcel;
            AudioMusicAwardsDto audioMusicAwardsDto = (AudioMusicAwardsDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
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
            BaseBoolIntDto baseBoolIntDto15 = (BaseBoolIntDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
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
                    i10 = bo.b(FriendsInterestingRequestDto.class, parcel, arrayList5, i10, 1);
                    readInt6 = readInt6;
                }
                baseBoolIntDto15 = baseBoolIntDto15;
            }
            String readString43 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto16 = baseBoolIntDto;
            ArrayList arrayList24 = arrayList4;
            String readString44 = parcel.readString();
            PhotosPhotoDto photosPhotoDto3 = photosPhotoDto;
            ArrayList arrayList25 = arrayList6;
            String readString45 = parcel.readString();
            String readString46 = parcel.readString();
            String readString47 = parcel.readString();
            String readString48 = parcel.readString();
            String readString49 = parcel.readString();
            String readString50 = parcel.readString();
            String readString51 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto17 = (BaseBoolIntDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto18 = baseBoolIntDto15;
            BaseBoolIntDto baseBoolIntDto19 = (BaseBoolIntDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf12 = null;
            } else {
                valueOf12 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString52 = parcel.readString();
            Boolean bool9 = valueOf7;
            Boolean bool10 = valueOf8;
            Boolean bool11 = valueOf9;
            Boolean bool12 = valueOf10;
            Boolean bool13 = valueOf11;
            Boolean bool14 = valueOf12;
            String readString53 = parcel.readString();
            String readString54 = parcel.readString();
            AudioAudioDto audioAudioDto = (AudioAudioDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            String readString55 = parcel.readString();
            String readString56 = parcel.readString();
            AppsAppMinDto appsAppMinDto = (AppsAppMinDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            UsersLastSeenDto usersLastSeenDto = (UsersLastSeenDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            UsersExportsDto usersExportsDto = (UsersExportsDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            BaseCropPhotoDto baseCropPhotoDto = (BaseCropPhotoDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            Integer valueOf48 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf49 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf50 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf51 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto baseBoolIntDto20 = (BaseBoolIntDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto21 = (BaseBoolIntDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto22 = (BaseBoolIntDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto23 = (BaseBoolIntDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            Integer valueOf52 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            UsersOccupationDto usersOccupationDto2 = (UsersOccupationDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                usersOccupationDto = usersOccupationDto2;
                arrayList7 = arrayList5;
                baseBoolIntDto2 = baseBoolIntDto17;
                arrayList8 = null;
            } else {
                usersOccupationDto = usersOccupationDto2;
                int readInt7 = parcel.readInt();
                arrayList7 = arrayList5;
                arrayList8 = new ArrayList(readInt7);
                baseBoolIntDto2 = baseBoolIntDto17;
                int i11 = 0;
                while (i11 != readInt7) {
                    i11 = bo.b(FriendsInterestingRequestDto.class, parcel, arrayList8, i11, 1);
                    readInt7 = readInt7;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList10 = arrayList8;
                arrayList9 = null;
            } else {
                int readInt8 = parcel.readInt();
                arrayList9 = new ArrayList(readInt8);
                arrayList10 = arrayList8;
                int i12 = 0;
                while (i12 != readInt8) {
                    i12 = bo.b(FriendsInterestingRequestDto.class, parcel, arrayList9, i12, 1);
                    readInt8 = readInt8;
                }
            }
            Integer valueOf53 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto baseBoolIntDto24 = baseBoolIntDto2;
            String readString57 = parcel.readString();
            Integer valueOf54 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf55 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString58 = parcel.readString();
            Integer valueOf56 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString59 = parcel.readString();
            ArrayList arrayList26 = arrayList10;
            Integer num2 = valueOf54;
            Integer num3 = valueOf55;
            Integer num4 = valueOf56;
            String readString60 = parcel.readString();
            String readString61 = parcel.readString();
            ArrayList arrayList27 = arrayList9;
            UsersUserRelationDto usersUserRelationDto = (UsersUserRelationDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            UsersUserMinDto usersUserMinDto = (UsersUserMinDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            UsersPersonalDto usersPersonalDto2 = (UsersPersonalDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                usersPersonalDto = usersPersonalDto2;
                num = valueOf53;
                baseBoolIntDto3 = baseBoolIntDto24;
                arrayList11 = null;
            } else {
                usersPersonalDto = usersPersonalDto2;
                int readInt9 = parcel.readInt();
                num = valueOf53;
                arrayList11 = new ArrayList(readInt9);
                baseBoolIntDto3 = baseBoolIntDto24;
                int i13 = 0;
                while (i13 != readInt9) {
                    i13 = bo.b(FriendsInterestingRequestDto.class, parcel, arrayList11, i13, 1);
                    readInt9 = readInt9;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList13 = arrayList11;
                arrayList12 = null;
            } else {
                int readInt10 = parcel.readInt();
                arrayList12 = new ArrayList(readInt10);
                arrayList13 = arrayList11;
                int i14 = 0;
                while (i14 != readInt10) {
                    i14 = bo.b(FriendsInterestingRequestDto.class, parcel, arrayList12, i14, 1);
                    readInt10 = readInt10;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList15 = arrayList12;
                arrayList14 = null;
            } else {
                int readInt11 = parcel.readInt();
                arrayList14 = new ArrayList(readInt11);
                arrayList15 = arrayList12;
                int i15 = 0;
                while (i15 != readInt11) {
                    i15 = bo.b(FriendsInterestingRequestDto.class, parcel, arrayList14, i15, 1);
                    readInt11 = readInt11;
                }
            }
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
            String readString62 = parcel.readString();
            Boolean bool15 = valueOf13;
            UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto2 = (UsersEmployeeWorkingStateDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                usersEmployeeWorkingStateDto = usersEmployeeWorkingStateDto2;
                createFromParcel2 = null;
            } else {
                usersEmployeeWorkingStateDto = usersEmployeeWorkingStateDto2;
                createFromParcel2 = EmployeeMarkDto.CREATOR.createFromParcel(parcel);
            }
            EmployeeMarkDto employeeMarkDto = createFromParcel2;
            UsersRightsLocationDto usersRightsLocationDto = (UsersRightsLocationDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf18 = null;
            } else {
                valueOf18 = Boolean.valueOf(parcel.readInt() != 0);
            }
            UsersEmojiStatusDto usersEmojiStatusDto = (UsersEmojiStatusDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            StatusImageStatusDto statusImageStatusDto = (StatusImageStatusDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            UsersUserCountersDto usersUserCountersDto = (UsersUserCountersDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            UsersPersonalDto usersPersonalDto3 = usersPersonalDto;
            ArrayList arrayList28 = arrayList15;
            Boolean bool16 = valueOf15;
            Boolean bool17 = valueOf16;
            Boolean bool18 = valueOf17;
            UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto3 = usersEmployeeWorkingStateDto;
            String readString63 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto25 = (BaseBoolIntDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf19 = null;
            } else {
                valueOf19 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            BaseBoolIntDto baseBoolIntDto26 = baseBoolIntDto3;
            Boolean bool19 = valueOf18;
            Boolean bool20 = valueOf19;
            String readString64 = parcel.readString();
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
            UsersGiftsTooltipDto usersGiftsTooltipDto2 = (UsersGiftsTooltipDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                usersGiftsTooltipDto = usersGiftsTooltipDto2;
                createFromParcel3 = null;
            } else {
                usersGiftsTooltipDto = usersGiftsTooltipDto2;
                createFromParcel3 = NoIndexDto.CREATOR.createFromParcel(parcel);
            }
            NoIndexDto noIndexDto = createFromParcel3;
            Integer valueOf57 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            MessagesContactDto messagesContactDto2 = (MessagesContactDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf22 = null;
            } else {
                valueOf22 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                messagesContactDto = messagesContactDto2;
                bool = valueOf14;
                arrayList17 = arrayList14;
                arrayList16 = null;
            } else {
                messagesContactDto = messagesContactDto2;
                int readInt12 = parcel.readInt();
                bool = valueOf14;
                arrayList16 = new ArrayList(readInt12);
                arrayList17 = arrayList14;
                int i16 = 0;
                while (i16 != readInt12) {
                    i16 = pm0.b(parcel, arrayList16, i16, 1);
                    readInt12 = readInt12;
                }
            }
            Integer valueOf58 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
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
            Integer num5 = valueOf58;
            UsersUserProfileTypeDto usersUserProfileTypeDto = (UsersUserProfileTypeDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            UsersCanNotCallReasonDto usersCanNotCallReasonDto = (UsersCanNotCallReasonDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
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
            BaseImageDto baseImageDto2 = (BaseImageDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                baseImageDto = baseImageDto2;
                arrayList18 = arrayList16;
                bool2 = valueOf23;
                arrayList19 = null;
            } else {
                baseImageDto = baseImageDto2;
                int readInt13 = parcel.readInt();
                arrayList18 = arrayList16;
                arrayList19 = new ArrayList(readInt13);
                bool2 = valueOf23;
                int i17 = 0;
                while (i17 != readInt13) {
                    i17 = bo.b(FriendsInterestingRequestDto.class, parcel, arrayList19, i17, 1);
                    readInt13 = readInt13;
                }
            }
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
            SocialButtonTypeDto createFromParcel5 = parcel.readInt() == 0 ? null : SocialButtonTypeDto.CREATOR.createFromParcel(parcel);
            String readString65 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf34 = null;
            } else {
                valueOf34 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
            Boolean bool21 = valueOf34;
            ArrayList<String> createStringArrayList4 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                valueOf35 = null;
            } else {
                valueOf35 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf59 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf60 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf36 = null;
            } else {
                valueOf36 = Boolean.valueOf(parcel.readInt() != 0);
            }
            UsersPromotionAllowanceDto usersPromotionAllowanceDto = (UsersPromotionAllowanceDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf37 = null;
            } else {
                valueOf37 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf61 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf38 = null;
            } else {
                valueOf38 = Boolean.valueOf(parcel.readInt() != 0);
            }
            MessagesEduEducationalProfileDto messagesEduEducationalProfileDto = (MessagesEduEducationalProfileDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            BaseAPlusMarkDto baseAPlusMarkDto = (BaseAPlusMarkDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
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
            UsersDonutDto usersDonutDto = (UsersDonutDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            BaseSexDto baseSexDto = (BaseSexDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            Boolean bool22 = valueOf37;
            Integer num6 = valueOf61;
            Boolean bool23 = valueOf38;
            Boolean bool24 = valueOf39;
            Boolean bool25 = valueOf40;
            Boolean bool26 = valueOf41;
            String readString66 = parcel.readString();
            String readString67 = parcel.readString();
            String readString68 = parcel.readString();
            String readString69 = parcel.readString();
            UsersOnlineInfoDto usersOnlineInfoDto = (UsersOnlineInfoDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto27 = (BaseBoolIntDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto28 = (BaseBoolIntDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            Integer valueOf62 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto baseBoolIntDto29 = (BaseBoolIntDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto30 = (BaseBoolIntDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            FriendsFriendStatusStatusDto friendsFriendStatusStatusDto = (FriendsFriendStatusStatusDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            FriendsRequestsMutualDto friendsRequestsMutualDto = (FriendsRequestsMutualDto) parcel.readParcelable(FriendsInterestingRequestDto.class.getClassLoader());
            boolean z = true;
            Boolean bool27 = valueOf35;
            Integer num7 = valueOf59;
            Integer num8 = valueOf60;
            Boolean bool28 = valueOf36;
            Integer num9 = valueOf62;
            String readString70 = parcel.readString();
            String readString71 = parcel.readString();
            Integer valueOf63 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString72 = parcel.readString();
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
            return new FriendsInterestingRequestDto(userId2, str2, userId4, valueOf45, readString2, createStringArrayList, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, readString14, readString15, readString16, readString17, readString18, readString19, createFromParcel4, baseCityDto, baseCountryDto, valueOf46, ownerStateDto, readString20, readString21, readString22, readString23, readString24, readString25, baseBoolIntDto4, baseOwnerCoverDto, readString26, baseBoolIntDto5, baseBoolIntDto6, bool3, baseBoolIntDto16, baseBoolIntDto8, baseBoolIntDto9, baseBoolIntDto10, usersUserTypeDto, readString27, readString28, readString29, readString30, readString31, baseBoolIntDto11, baseBoolIntDto12, bool4, bool5, bool6, bool7, readString32, readString33, readString34, baseBoolIntDto13, videoLiveInfoDto, baseBoolIntDto14, bool8, readString35, readString36, readString37, readString38, readString39, readString40, readString41, photosPhotoDto3, arrayList23, arrayList25, arrayList24, readString42, valueOf47, bool9, wallDefaultDto, audioMusicAwardsDto, bool10, bool11, bool12, bool13, baseBoolIntDto18, arrayList7, readString43, readString44, readString45, readString46, readString47, readString48, readString49, readString50, readString51, baseBoolIntDto26, baseBoolIntDto19, bool14, readString52, readString53, readString54, audioAudioDto, readString55, readString56, appsAppMinDto, usersLastSeenDto, usersExportsDto, baseCropPhotoDto, valueOf48, valueOf49, valueOf50, valueOf51, baseBoolIntDto20, baseBoolIntDto21, baseBoolIntDto22, baseBoolIntDto23, valueOf52, usersOccupationDto, arrayList26, arrayList27, num, readString57, num2, num3, readString58, num4, readString59, readString60, readString61, usersUserRelationDto, usersUserMinDto, usersPersonalDto3, arrayList13, arrayList28, arrayList17, bool15, bool, bool16, bool17, bool18, readString62, usersEmployeeWorkingStateDto3, employeeMarkDto, usersRightsLocationDto, bool19, usersEmojiStatusDto, statusImageStatusDto, usersUserCountersDto, readString63, baseBoolIntDto25, bool20, createStringArrayList2, readString64, valueOf20, valueOf21, usersGiftsTooltipDto, noIndexDto, valueOf57, messagesContactDto, valueOf22, arrayList18, num5, bool2, valueOf24, usersUserProfileTypeDto, usersCanNotCallReasonDto, valueOf25, valueOf26, baseImageDto, arrayList19, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, createFromParcel5, readString65, bool21, createStringArrayList3, createStringArrayList4, bool27, num7, num8, bool28, usersPromotionAllowanceDto, bool22, num6, bool23, messagesEduEducationalProfileDto, baseAPlusMarkDto, bool24, bool25, bool26, usersDonutDto, baseSexDto, readString66, readString67, readString68, readString69, usersOnlineInfoDto, baseBoolIntDto27, baseBoolIntDto28, num9, baseBoolIntDto29, baseBoolIntDto30, friendsFriendStatusStatusDto, friendsRequestsMutualDto, readString70, readString71, valueOf63, readString72, valueOf42, valueOf43, valueOf44);
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsInterestingRequestDto[] newArray(int i) {
            return new FriendsInterestingRequestDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FriendsInterestingRequestDto(UserId userId, String str, UserId userId2, Integer num, String str2, List<String> list, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, BdateVisibilityDto bdateVisibilityDto, BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, Float f, OwnerStateDto ownerStateDto, String str20, String str21, String str22, String str23, String str24, String str25, BaseBoolIntDto baseBoolIntDto, BaseOwnerCoverDto baseOwnerCoverDto, String str26, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Boolean bool, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, UsersUserTypeDto usersUserTypeDto, String str27, String str28, String str29, String str30, String str31, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str32, String str33, String str34, BaseBoolIntDto baseBoolIntDto10, VideoLiveInfoDto videoLiveInfoDto, BaseBoolIntDto baseBoolIntDto11, Boolean bool6, String str35, String str36, String str37, String str38, String str39, String str40, String str41, PhotosPhotoDto photosPhotoDto, List<? extends List<UsersProfileButtonDto>> list2, List<? extends List<UsersProfileButtonDto>> list3, List<UsersProfileButtonDto> list4, String str42, Integer num2, Boolean bool7, WallDefaultDto wallDefaultDto, AudioMusicAwardsDto audioMusicAwardsDto, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, BaseBoolIntDto baseBoolIntDto12, List<BaseOwnerButtonDto> list5, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, BaseBoolIntDto baseBoolIntDto13, BaseBoolIntDto baseBoolIntDto14, Boolean bool12, String str52, String str53, String str54, AudioAudioDto audioAudioDto, String str55, String str56, AppsAppMinDto appsAppMinDto, UsersLastSeenDto usersLastSeenDto, UsersExportsDto usersExportsDto, BaseCropPhotoDto baseCropPhotoDto, Integer num3, Integer num4, Integer num5, Integer num6, BaseBoolIntDto baseBoolIntDto15, BaseBoolIntDto baseBoolIntDto16, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, Integer num7, UsersOccupationDto usersOccupationDto, List<UsersCareerDto> list6, List<UsersMilitaryDto> list7, Integer num8, String str57, Integer num9, Integer num10, String str58, Integer num11, String str59, String str60, String str61, UsersUserRelationDto usersUserRelationDto, UsersUserMinDto usersUserMinDto, UsersPersonalDto usersPersonalDto, List<UsersUniversityDto> list8, List<UsersSchoolDto> list9, List<UsersRelativeDto> list10, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, String str62, UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto, EmployeeMarkDto employeeMarkDto, UsersRightsLocationDto usersRightsLocationDto, Boolean bool18, UsersEmojiStatusDto usersEmojiStatusDto, StatusImageStatusDto statusImageStatusDto, UsersUserCountersDto usersUserCountersDto, String str63, BaseBoolIntDto baseBoolIntDto19, Boolean bool19, List<String> list11, String str64, Boolean bool20, Boolean bool21, UsersGiftsTooltipDto usersGiftsTooltipDto, NoIndexDto noIndexDto, Integer num12, MessagesContactDto messagesContactDto, Boolean bool22, List<Integer> list12, Integer num13, Boolean bool23, Boolean bool24, UsersUserProfileTypeDto usersUserProfileTypeDto, UsersCanNotCallReasonDto usersCanNotCallReasonDto, Boolean bool25, Boolean bool26, BaseImageDto baseImageDto, List<CallsCustomNameForCallDto> list13, Boolean bool27, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, Boolean bool33, SocialButtonTypeDto socialButtonTypeDto, String str65, Boolean bool34, List<String> list14, List<String> list15, Boolean bool35, Integer num14, Integer num15, Boolean bool36, UsersPromotionAllowanceDto usersPromotionAllowanceDto, Boolean bool37, Integer num16, Boolean bool38, MessagesEduEducationalProfileDto messagesEduEducationalProfileDto, BaseAPlusMarkDto baseAPlusMarkDto, Boolean bool39, Boolean bool40, Boolean bool41, UsersDonutDto usersDonutDto, BaseSexDto baseSexDto, String str66, String str67, String str68, String str69, UsersOnlineInfoDto usersOnlineInfoDto, BaseBoolIntDto baseBoolIntDto20, BaseBoolIntDto baseBoolIntDto21, Integer num17, BaseBoolIntDto baseBoolIntDto22, BaseBoolIntDto baseBoolIntDto23, FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, FriendsRequestsMutualDto friendsRequestsMutualDto, String str70, String str71, Integer num18, String str72, Boolean bool42, Boolean bool43, Boolean bool44) {
        this.id = userId;
        this.trackCode = str;
        this.userId = userId2;
        this.timestamp = num;
        this.message = str2;
        this.descriptions = list;
        this.firstNameNom = str3;
        this.firstNameGen = str4;
        this.firstNameDat = str5;
        this.firstNameAcc = str6;
        this.firstNameIns = str7;
        this.firstNameAbl = str8;
        this.lastNameNom = str9;
        this.lastNameGen = str10;
        this.lastNameDat = str11;
        this.lastNameAcc = str12;
        this.lastNameIns = str13;
        this.lastNameAbl = str14;
        this.nickname = str15;
        this.maidenName = str16;
        this.contactName = str17;
        this.domain = str18;
        this.bdate = str19;
        this.bdateVisibility = bdateVisibilityDto;
        this.city = baseCityDto;
        this.country = baseCountryDto;
        this.timezone = f;
        this.ownerState = ownerStateDto;
        this.photo200 = str20;
        this.photoMax = str21;
        this.photo200Orig = str22;
        this.photo400Orig = str23;
        this.photoMaxOrig = str24;
        this.photoId = str25;
        this.hasPhoto = baseBoolIntDto;
        this.cover = baseOwnerCoverDto;
        this.photoAvgColor = str26;
        this.hasMobile = baseBoolIntDto2;
        this.isFriend = baseBoolIntDto3;
        this.isBestFriend = bool;
        this.wallComments = baseBoolIntDto4;
        this.canPost = baseBoolIntDto5;
        this.canSeeAllPosts = baseBoolIntDto6;
        this.canSeeAudio = baseBoolIntDto7;
        this.type = usersUserTypeDto;
        this.email = str27;
        this.skype = str28;
        this.facebook = str29;
        this.facebookName = str30;
        this.twitter = str31;
        this.isAdult = baseBoolIntDto8;
        this.isSubscribed = baseBoolIntDto9;
        this.isSubscribedStories = bool2;
        this.canSubscribeStories = bool3;
        this.canAskQuestion = bool4;
        this.canAskAnonymous = bool5;
        this.subscriptionCountry = str32;
        this.livejournal = str33;
        this.instagram = str34;
        this.test = baseBoolIntDto10;
        this.videoLive = videoLiveInfoDto;
        this.isVideoLiveNotificationsBlocked = baseBoolIntDto11;
        this.isService = bool6;
        this.serviceDescription = str35;
        this.photoRec = str36;
        this.photoMedium = str37;
        this.photoMediumRec = str38;
        this.photo = str39;
        this.photoBig = str40;
        this.photo400 = str41;
        this.photoMaxSize = photosPhotoDto;
        this.profileButtons = list2;
        this.profileButtonsTablet = list3;
        this.thirdPartyButtons = list4;
        this.language = str42;
        this.storiesArchiveCount = num2;
        this.hasUnseenStories = bool7;
        this.wallDefault = wallDefaultDto;
        this.musicAwards = audioMusicAwardsDto;
        this.canCall = bool8;
        this.canCallFromGroup = bool9;
        this.canInviteAsVoiceroomsSpeaker = bool10;
        this.canSeeWishes = bool11;
        this.canSeeGifts = baseBoolIntDto12;
        this.buttons = list5;
        this.interests = str43;
        this.books = str44;
        this.tv = str45;
        this.quotes = str46;
        this.about = str47;
        this.games = str48;
        this.movies = str49;
        this.activities = str50;
        this.music = str51;
        this.canWritePrivateMessage = baseBoolIntDto13;
        this.canSendFriendRequest = baseBoolIntDto14;
        this.canBeInvitedGroup = bool12;
        this.mobilePhone = str52;
        this.homePhone = str53;
        this.site = str54;
        this.statusAudio = audioAudioDto;
        this.status = str55;
        this.activity = str56;
        this.statusApp = appsAppMinDto;
        this.lastSeen = usersLastSeenDto;
        this.exports = usersExportsDto;
        this.cropPhoto = baseCropPhotoDto;
        this.followersCount = num3;
        this.videoLiveLevel = num4;
        this.videoLiveCount = num5;
        this.clipsCount = num6;
        this.blacklisted = baseBoolIntDto15;
        this.blacklistedByMe = baseBoolIntDto16;
        this.isFavorite = baseBoolIntDto17;
        this.isHiddenFromFeed = baseBoolIntDto18;
        this.commonCount = num7;
        this.occupation = usersOccupationDto;
        this.career = list6;
        this.military = list7;
        this.university = num8;
        this.universityName = str57;
        this.universityGroupId = num9;
        this.faculty = num10;
        this.facultyName = str58;
        this.graduation = num11;
        this.educationForm = str59;
        this.educationStatus = str60;
        this.homeTown = str61;
        this.relation = usersUserRelationDto;
        this.relationPartner = usersUserMinDto;
        this.personal = usersPersonalDto;
        this.universities = list8;
        this.schools = list9;
        this.relatives = list10;
        this.isSubscribedPodcasts = bool13;
        this.canSubscribePodcasts = bool14;
        this.canSubscribePosts = bool15;
        this.isStudent = bool16;
        this.hasRights = bool17;
        this.sysUsername = str62;
        this.employeeWorkingState = usersEmployeeWorkingStateDto;
        this.employeeMark = employeeMarkDto;
        this.rightsLocation = usersRightsLocationDto;
        this.canInviteToChats = bool18;
        this.emojiStatus = usersEmojiStatusDto;
        this.imageStatus = statusImageStatusDto;
        this.counters = usersUserCountersDto;
        this.accessKey = str63;
        this.canUploadDoc = baseBoolIntDto19;
        this.canBan = bool19;
        this.eduDetails = list11;
        this.hash = str64;
        this.hasEmail = bool20;
        this.isDead = bool21;
        this.giftsTooltip = usersGiftsTooltipDto;
        this.noIndex = noIndexDto;
        this.contactId = num12;
        this.contact = messagesContactDto;
        this.isMessageRequest = bool22;
        this.lists = list12;
        this.friendshipWeeks = num13;
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
        this.description = str65;
        this.isTeacher = bool34;
        this.oauthLinked = list14;
        this.oauthVerification = list15;
        this.isSberLinked = bool35;
        this.ageMark = num14;
        this.joined = num15;
        this.isServiceAccount = bool36;
        this.promotionAllowance = usersPromotionAllowanceDto;
        this.coOwnershipEnabled = bool37;
        this.ageGroup = num16;
        this.hasRelatedUserPin = bool38;
        this.educationalProfile = messagesEduEducationalProfileDto;
        this.aPlusMark = baseAPlusMarkDto;
        this.isDon = bool39;
        this.isMediaModer = bool40;
        this.isPhotoMapEnabled = bool41;
        this.donut = usersDonutDto;
        this.sex = baseSexDto;
        this.screenName = str66;
        this.photo50 = str67;
        this.photo100 = str68;
        this.photoBase = str69;
        this.onlineInfo = usersOnlineInfoDto;
        this.online = baseBoolIntDto20;
        this.onlineMobile = baseBoolIntDto21;
        this.onlineApp = num17;
        this.verified = baseBoolIntDto22;
        this.trending = baseBoolIntDto23;
        this.friendStatus = friendsFriendStatusStatusDto;
        this.mutual = friendsRequestsMutualDto;
        this.deactivated = str70;
        this.firstName = str71;
        this.hidden = num18;
        this.lastName = str72;
        this.canAccessClosed = bool42;
        this.isClosed = bool43;
        this.isCached = bool44;
    }

    public final FriendsRequestsMutualDto d() {
        return this.mutual;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsInterestingRequestDto)) {
            return false;
        }
        FriendsInterestingRequestDto friendsInterestingRequestDto = (FriendsInterestingRequestDto) obj;
        return epx.f(this.id, friendsInterestingRequestDto.id) && epx.f(this.trackCode, friendsInterestingRequestDto.trackCode) && epx.f(this.userId, friendsInterestingRequestDto.userId) && epx.f(this.timestamp, friendsInterestingRequestDto.timestamp) && epx.f(this.message, friendsInterestingRequestDto.message) && epx.f(this.descriptions, friendsInterestingRequestDto.descriptions) && epx.f(this.firstNameNom, friendsInterestingRequestDto.firstNameNom) && epx.f(this.firstNameGen, friendsInterestingRequestDto.firstNameGen) && epx.f(this.firstNameDat, friendsInterestingRequestDto.firstNameDat) && epx.f(this.firstNameAcc, friendsInterestingRequestDto.firstNameAcc) && epx.f(this.firstNameIns, friendsInterestingRequestDto.firstNameIns) && epx.f(this.firstNameAbl, friendsInterestingRequestDto.firstNameAbl) && epx.f(this.lastNameNom, friendsInterestingRequestDto.lastNameNom) && epx.f(this.lastNameGen, friendsInterestingRequestDto.lastNameGen) && epx.f(this.lastNameDat, friendsInterestingRequestDto.lastNameDat) && epx.f(this.lastNameAcc, friendsInterestingRequestDto.lastNameAcc) && epx.f(this.lastNameIns, friendsInterestingRequestDto.lastNameIns) && epx.f(this.lastNameAbl, friendsInterestingRequestDto.lastNameAbl) && epx.f(this.nickname, friendsInterestingRequestDto.nickname) && epx.f(this.maidenName, friendsInterestingRequestDto.maidenName) && epx.f(this.contactName, friendsInterestingRequestDto.contactName) && epx.f(this.domain, friendsInterestingRequestDto.domain) && epx.f(this.bdate, friendsInterestingRequestDto.bdate) && this.bdateVisibility == friendsInterestingRequestDto.bdateVisibility && epx.f(this.city, friendsInterestingRequestDto.city) && epx.f(this.country, friendsInterestingRequestDto.country) && epx.f(this.timezone, friendsInterestingRequestDto.timezone) && epx.f(this.ownerState, friendsInterestingRequestDto.ownerState) && epx.f(this.photo200, friendsInterestingRequestDto.photo200) && epx.f(this.photoMax, friendsInterestingRequestDto.photoMax) && epx.f(this.photo200Orig, friendsInterestingRequestDto.photo200Orig) && epx.f(this.photo400Orig, friendsInterestingRequestDto.photo400Orig) && epx.f(this.photoMaxOrig, friendsInterestingRequestDto.photoMaxOrig) && epx.f(this.photoId, friendsInterestingRequestDto.photoId) && this.hasPhoto == friendsInterestingRequestDto.hasPhoto && epx.f(this.cover, friendsInterestingRequestDto.cover) && epx.f(this.photoAvgColor, friendsInterestingRequestDto.photoAvgColor) && this.hasMobile == friendsInterestingRequestDto.hasMobile && this.isFriend == friendsInterestingRequestDto.isFriend && epx.f(this.isBestFriend, friendsInterestingRequestDto.isBestFriend) && this.wallComments == friendsInterestingRequestDto.wallComments && this.canPost == friendsInterestingRequestDto.canPost && this.canSeeAllPosts == friendsInterestingRequestDto.canSeeAllPosts && this.canSeeAudio == friendsInterestingRequestDto.canSeeAudio && this.type == friendsInterestingRequestDto.type && epx.f(this.email, friendsInterestingRequestDto.email) && epx.f(this.skype, friendsInterestingRequestDto.skype) && epx.f(this.facebook, friendsInterestingRequestDto.facebook) && epx.f(this.facebookName, friendsInterestingRequestDto.facebookName) && epx.f(this.twitter, friendsInterestingRequestDto.twitter) && this.isAdult == friendsInterestingRequestDto.isAdult && this.isSubscribed == friendsInterestingRequestDto.isSubscribed && epx.f(this.isSubscribedStories, friendsInterestingRequestDto.isSubscribedStories) && epx.f(this.canSubscribeStories, friendsInterestingRequestDto.canSubscribeStories) && epx.f(this.canAskQuestion, friendsInterestingRequestDto.canAskQuestion) && epx.f(this.canAskAnonymous, friendsInterestingRequestDto.canAskAnonymous) && epx.f(this.subscriptionCountry, friendsInterestingRequestDto.subscriptionCountry) && epx.f(this.livejournal, friendsInterestingRequestDto.livejournal) && epx.f(this.instagram, friendsInterestingRequestDto.instagram) && this.test == friendsInterestingRequestDto.test && epx.f(this.videoLive, friendsInterestingRequestDto.videoLive) && this.isVideoLiveNotificationsBlocked == friendsInterestingRequestDto.isVideoLiveNotificationsBlocked && epx.f(this.isService, friendsInterestingRequestDto.isService) && epx.f(this.serviceDescription, friendsInterestingRequestDto.serviceDescription) && epx.f(this.photoRec, friendsInterestingRequestDto.photoRec) && epx.f(this.photoMedium, friendsInterestingRequestDto.photoMedium) && epx.f(this.photoMediumRec, friendsInterestingRequestDto.photoMediumRec) && epx.f(this.photo, friendsInterestingRequestDto.photo) && epx.f(this.photoBig, friendsInterestingRequestDto.photoBig) && epx.f(this.photo400, friendsInterestingRequestDto.photo400) && epx.f(this.photoMaxSize, friendsInterestingRequestDto.photoMaxSize) && epx.f(this.profileButtons, friendsInterestingRequestDto.profileButtons) && epx.f(this.profileButtonsTablet, friendsInterestingRequestDto.profileButtonsTablet) && epx.f(this.thirdPartyButtons, friendsInterestingRequestDto.thirdPartyButtons) && epx.f(this.language, friendsInterestingRequestDto.language) && epx.f(this.storiesArchiveCount, friendsInterestingRequestDto.storiesArchiveCount) && epx.f(this.hasUnseenStories, friendsInterestingRequestDto.hasUnseenStories) && this.wallDefault == friendsInterestingRequestDto.wallDefault && epx.f(this.musicAwards, friendsInterestingRequestDto.musicAwards) && epx.f(this.canCall, friendsInterestingRequestDto.canCall) && epx.f(this.canCallFromGroup, friendsInterestingRequestDto.canCallFromGroup) && epx.f(this.canInviteAsVoiceroomsSpeaker, friendsInterestingRequestDto.canInviteAsVoiceroomsSpeaker) && epx.f(this.canSeeWishes, friendsInterestingRequestDto.canSeeWishes) && this.canSeeGifts == friendsInterestingRequestDto.canSeeGifts && epx.f(this.buttons, friendsInterestingRequestDto.buttons) && epx.f(this.interests, friendsInterestingRequestDto.interests) && epx.f(this.books, friendsInterestingRequestDto.books) && epx.f(this.tv, friendsInterestingRequestDto.tv) && epx.f(this.quotes, friendsInterestingRequestDto.quotes) && epx.f(this.about, friendsInterestingRequestDto.about) && epx.f(this.games, friendsInterestingRequestDto.games) && epx.f(this.movies, friendsInterestingRequestDto.movies) && epx.f(this.activities, friendsInterestingRequestDto.activities) && epx.f(this.music, friendsInterestingRequestDto.music) && this.canWritePrivateMessage == friendsInterestingRequestDto.canWritePrivateMessage && this.canSendFriendRequest == friendsInterestingRequestDto.canSendFriendRequest && epx.f(this.canBeInvitedGroup, friendsInterestingRequestDto.canBeInvitedGroup) && epx.f(this.mobilePhone, friendsInterestingRequestDto.mobilePhone) && epx.f(this.homePhone, friendsInterestingRequestDto.homePhone) && epx.f(this.site, friendsInterestingRequestDto.site) && epx.f(this.statusAudio, friendsInterestingRequestDto.statusAudio) && epx.f(this.status, friendsInterestingRequestDto.status) && epx.f(this.activity, friendsInterestingRequestDto.activity) && epx.f(this.statusApp, friendsInterestingRequestDto.statusApp) && epx.f(this.lastSeen, friendsInterestingRequestDto.lastSeen) && epx.f(this.exports, friendsInterestingRequestDto.exports) && epx.f(this.cropPhoto, friendsInterestingRequestDto.cropPhoto) && epx.f(this.followersCount, friendsInterestingRequestDto.followersCount) && epx.f(this.videoLiveLevel, friendsInterestingRequestDto.videoLiveLevel) && epx.f(this.videoLiveCount, friendsInterestingRequestDto.videoLiveCount) && epx.f(this.clipsCount, friendsInterestingRequestDto.clipsCount) && this.blacklisted == friendsInterestingRequestDto.blacklisted && this.blacklistedByMe == friendsInterestingRequestDto.blacklistedByMe && this.isFavorite == friendsInterestingRequestDto.isFavorite && this.isHiddenFromFeed == friendsInterestingRequestDto.isHiddenFromFeed && epx.f(this.commonCount, friendsInterestingRequestDto.commonCount) && epx.f(this.occupation, friendsInterestingRequestDto.occupation) && epx.f(this.career, friendsInterestingRequestDto.career) && epx.f(this.military, friendsInterestingRequestDto.military) && epx.f(this.university, friendsInterestingRequestDto.university) && epx.f(this.universityName, friendsInterestingRequestDto.universityName) && epx.f(this.universityGroupId, friendsInterestingRequestDto.universityGroupId) && epx.f(this.faculty, friendsInterestingRequestDto.faculty) && epx.f(this.facultyName, friendsInterestingRequestDto.facultyName) && epx.f(this.graduation, friendsInterestingRequestDto.graduation) && epx.f(this.educationForm, friendsInterestingRequestDto.educationForm) && epx.f(this.educationStatus, friendsInterestingRequestDto.educationStatus) && epx.f(this.homeTown, friendsInterestingRequestDto.homeTown) && this.relation == friendsInterestingRequestDto.relation && epx.f(this.relationPartner, friendsInterestingRequestDto.relationPartner) && epx.f(this.personal, friendsInterestingRequestDto.personal) && epx.f(this.universities, friendsInterestingRequestDto.universities) && epx.f(this.schools, friendsInterestingRequestDto.schools) && epx.f(this.relatives, friendsInterestingRequestDto.relatives) && epx.f(this.isSubscribedPodcasts, friendsInterestingRequestDto.isSubscribedPodcasts) && epx.f(this.canSubscribePodcasts, friendsInterestingRequestDto.canSubscribePodcasts) && epx.f(this.canSubscribePosts, friendsInterestingRequestDto.canSubscribePosts) && epx.f(this.isStudent, friendsInterestingRequestDto.isStudent) && epx.f(this.hasRights, friendsInterestingRequestDto.hasRights) && epx.f(this.sysUsername, friendsInterestingRequestDto.sysUsername) && epx.f(this.employeeWorkingState, friendsInterestingRequestDto.employeeWorkingState) && this.employeeMark == friendsInterestingRequestDto.employeeMark && epx.f(this.rightsLocation, friendsInterestingRequestDto.rightsLocation) && epx.f(this.canInviteToChats, friendsInterestingRequestDto.canInviteToChats) && epx.f(this.emojiStatus, friendsInterestingRequestDto.emojiStatus) && epx.f(this.imageStatus, friendsInterestingRequestDto.imageStatus) && epx.f(this.counters, friendsInterestingRequestDto.counters) && epx.f(this.accessKey, friendsInterestingRequestDto.accessKey) && this.canUploadDoc == friendsInterestingRequestDto.canUploadDoc && epx.f(this.canBan, friendsInterestingRequestDto.canBan) && epx.f(this.eduDetails, friendsInterestingRequestDto.eduDetails) && epx.f(this.hash, friendsInterestingRequestDto.hash) && epx.f(this.hasEmail, friendsInterestingRequestDto.hasEmail) && epx.f(this.isDead, friendsInterestingRequestDto.isDead) && epx.f(this.giftsTooltip, friendsInterestingRequestDto.giftsTooltip) && this.noIndex == friendsInterestingRequestDto.noIndex && epx.f(this.contactId, friendsInterestingRequestDto.contactId) && epx.f(this.contact, friendsInterestingRequestDto.contact) && epx.f(this.isMessageRequest, friendsInterestingRequestDto.isMessageRequest) && epx.f(this.lists, friendsInterestingRequestDto.lists) && epx.f(this.friendshipWeeks, friendsInterestingRequestDto.friendshipWeeks) && epx.f(this.isPersonalAdsEasyPromoteEnabled, friendsInterestingRequestDto.isPersonalAdsEasyPromoteEnabled) && epx.f(this.needBigMsgBtnInProfile, friendsInterestingRequestDto.needBigMsgBtnInProfile) && this.profileType == friendsInterestingRequestDto.profileType && this.canNotCallReason == friendsInterestingRequestDto.canNotCallReason && epx.f(this.canCallAsCommunity, friendsInterestingRequestDto.canCallAsCommunity) && epx.f(this.isNft, friendsInterestingRequestDto.isNft) && epx.f(this.animatedAvatar, friendsInterestingRequestDto.animatedAvatar) && epx.f(this.customNamesForCalls, friendsInterestingRequestDto.customNamesForCalls) && epx.f(this.isEsiaVerified, friendsInterestingRequestDto.isEsiaVerified) && epx.f(this.isEsiaLinked, friendsInterestingRequestDto.isEsiaLinked) && epx.f(this.isTinkoffVerified, friendsInterestingRequestDto.isTinkoffVerified) && epx.f(this.isTinkoffLinked, friendsInterestingRequestDto.isTinkoffLinked) && epx.f(this.isSberVerified, friendsInterestingRequestDto.isSberVerified) && epx.f(this.isVerified, friendsInterestingRequestDto.isVerified) && epx.f(this.isFollowersModeOn, friendsInterestingRequestDto.isFollowersModeOn) && this.socialButtonType == friendsInterestingRequestDto.socialButtonType && epx.f(this.description, friendsInterestingRequestDto.description) && epx.f(this.isTeacher, friendsInterestingRequestDto.isTeacher) && epx.f(this.oauthLinked, friendsInterestingRequestDto.oauthLinked) && epx.f(this.oauthVerification, friendsInterestingRequestDto.oauthVerification) && epx.f(this.isSberLinked, friendsInterestingRequestDto.isSberLinked) && epx.f(this.ageMark, friendsInterestingRequestDto.ageMark) && epx.f(this.joined, friendsInterestingRequestDto.joined) && epx.f(this.isServiceAccount, friendsInterestingRequestDto.isServiceAccount) && epx.f(this.promotionAllowance, friendsInterestingRequestDto.promotionAllowance) && epx.f(this.coOwnershipEnabled, friendsInterestingRequestDto.coOwnershipEnabled) && epx.f(this.ageGroup, friendsInterestingRequestDto.ageGroup) && epx.f(this.hasRelatedUserPin, friendsInterestingRequestDto.hasRelatedUserPin) && epx.f(this.educationalProfile, friendsInterestingRequestDto.educationalProfile) && epx.f(this.aPlusMark, friendsInterestingRequestDto.aPlusMark) && epx.f(this.isDon, friendsInterestingRequestDto.isDon) && epx.f(this.isMediaModer, friendsInterestingRequestDto.isMediaModer) && epx.f(this.isPhotoMapEnabled, friendsInterestingRequestDto.isPhotoMapEnabled) && epx.f(this.donut, friendsInterestingRequestDto.donut) && this.sex == friendsInterestingRequestDto.sex && epx.f(this.screenName, friendsInterestingRequestDto.screenName) && epx.f(this.photo50, friendsInterestingRequestDto.photo50) && epx.f(this.photo100, friendsInterestingRequestDto.photo100) && epx.f(this.photoBase, friendsInterestingRequestDto.photoBase) && epx.f(this.onlineInfo, friendsInterestingRequestDto.onlineInfo) && this.online == friendsInterestingRequestDto.online && this.onlineMobile == friendsInterestingRequestDto.onlineMobile && epx.f(this.onlineApp, friendsInterestingRequestDto.onlineApp) && this.verified == friendsInterestingRequestDto.verified && this.trending == friendsInterestingRequestDto.trending && this.friendStatus == friendsInterestingRequestDto.friendStatus && epx.f(this.mutual, friendsInterestingRequestDto.mutual) && epx.f(this.deactivated, friendsInterestingRequestDto.deactivated) && epx.f(this.firstName, friendsInterestingRequestDto.firstName) && epx.f(this.hidden, friendsInterestingRequestDto.hidden) && epx.f(this.lastName, friendsInterestingRequestDto.lastName) && epx.f(this.canAccessClosed, friendsInterestingRequestDto.canAccessClosed) && epx.f(this.isClosed, friendsInterestingRequestDto.isClosed) && epx.f(this.isCached, friendsInterestingRequestDto.isCached);
    }

    public final UserId getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.trackCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        UserId userId = this.userId;
        int hashCode3 = (hashCode2 + (userId == null ? 0 : userId.hashCode())) * 31;
        Integer num = this.timestamp;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.message;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.descriptions;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.firstNameNom;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.firstNameGen;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.firstNameDat;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.firstNameAcc;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.firstNameIns;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.firstNameAbl;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.lastNameNom;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.lastNameGen;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.lastNameDat;
        int hashCode15 = (hashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.lastNameAcc;
        int hashCode16 = (hashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.lastNameIns;
        int hashCode17 = (hashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.lastNameAbl;
        int hashCode18 = (hashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.nickname;
        int hashCode19 = (hashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.maidenName;
        int hashCode20 = (hashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.contactName;
        int hashCode21 = (hashCode20 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.domain;
        int hashCode22 = (hashCode21 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.bdate;
        int hashCode23 = (hashCode22 + (str19 == null ? 0 : str19.hashCode())) * 31;
        BdateVisibilityDto bdateVisibilityDto = this.bdateVisibility;
        int hashCode24 = (hashCode23 + (bdateVisibilityDto == null ? 0 : bdateVisibilityDto.hashCode())) * 31;
        BaseCityDto baseCityDto = this.city;
        int hashCode25 = (hashCode24 + (baseCityDto == null ? 0 : baseCityDto.hashCode())) * 31;
        BaseCountryDto baseCountryDto = this.country;
        int hashCode26 = (hashCode25 + (baseCountryDto == null ? 0 : baseCountryDto.hashCode())) * 31;
        Float f = this.timezone;
        int hashCode27 = (hashCode26 + (f == null ? 0 : f.hashCode())) * 31;
        OwnerStateDto ownerStateDto = this.ownerState;
        int hashCode28 = (hashCode27 + (ownerStateDto == null ? 0 : ownerStateDto.hashCode())) * 31;
        String str20 = this.photo200;
        int hashCode29 = (hashCode28 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.photoMax;
        int hashCode30 = (hashCode29 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.photo200Orig;
        int hashCode31 = (hashCode30 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.photo400Orig;
        int hashCode32 = (hashCode31 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.photoMaxOrig;
        int hashCode33 = (hashCode32 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.photoId;
        int hashCode34 = (hashCode33 + (str25 == null ? 0 : str25.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.hasPhoto;
        int hashCode35 = (hashCode34 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseOwnerCoverDto baseOwnerCoverDto = this.cover;
        int hashCode36 = (hashCode35 + (baseOwnerCoverDto == null ? 0 : baseOwnerCoverDto.hashCode())) * 31;
        String str26 = this.photoAvgColor;
        int hashCode37 = (hashCode36 + (str26 == null ? 0 : str26.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.hasMobile;
        int hashCode38 = (hashCode37 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.isFriend;
        int hashCode39 = (hashCode38 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        Boolean bool = this.isBestFriend;
        int hashCode40 = (hashCode39 + (bool == null ? 0 : bool.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.wallComments;
        int hashCode41 = (hashCode40 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto5 = this.canPost;
        int hashCode42 = (hashCode41 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto6 = this.canSeeAllPosts;
        int hashCode43 = (hashCode42 + (baseBoolIntDto6 == null ? 0 : baseBoolIntDto6.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto7 = this.canSeeAudio;
        int hashCode44 = (hashCode43 + (baseBoolIntDto7 == null ? 0 : baseBoolIntDto7.hashCode())) * 31;
        UsersUserTypeDto usersUserTypeDto = this.type;
        int hashCode45 = (hashCode44 + (usersUserTypeDto == null ? 0 : usersUserTypeDto.hashCode())) * 31;
        String str27 = this.email;
        int hashCode46 = (hashCode45 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.skype;
        int hashCode47 = (hashCode46 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.facebook;
        int hashCode48 = (hashCode47 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.facebookName;
        int hashCode49 = (hashCode48 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.twitter;
        int hashCode50 = (hashCode49 + (str31 == null ? 0 : str31.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto8 = this.isAdult;
        int hashCode51 = (hashCode50 + (baseBoolIntDto8 == null ? 0 : baseBoolIntDto8.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto9 = this.isSubscribed;
        int hashCode52 = (hashCode51 + (baseBoolIntDto9 == null ? 0 : baseBoolIntDto9.hashCode())) * 31;
        Boolean bool2 = this.isSubscribedStories;
        int hashCode53 = (hashCode52 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.canSubscribeStories;
        int hashCode54 = (hashCode53 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.canAskQuestion;
        int hashCode55 = (hashCode54 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.canAskAnonymous;
        int hashCode56 = (hashCode55 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str32 = this.subscriptionCountry;
        int hashCode57 = (hashCode56 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.livejournal;
        int hashCode58 = (hashCode57 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.instagram;
        int hashCode59 = (hashCode58 + (str34 == null ? 0 : str34.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto10 = this.test;
        int hashCode60 = (hashCode59 + (baseBoolIntDto10 == null ? 0 : baseBoolIntDto10.hashCode())) * 31;
        VideoLiveInfoDto videoLiveInfoDto = this.videoLive;
        int hashCode61 = (hashCode60 + (videoLiveInfoDto == null ? 0 : videoLiveInfoDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto11 = this.isVideoLiveNotificationsBlocked;
        int hashCode62 = (hashCode61 + (baseBoolIntDto11 == null ? 0 : baseBoolIntDto11.hashCode())) * 31;
        Boolean bool6 = this.isService;
        int hashCode63 = (hashCode62 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str35 = this.serviceDescription;
        int hashCode64 = (hashCode63 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.photoRec;
        int hashCode65 = (hashCode64 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.photoMedium;
        int hashCode66 = (hashCode65 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.photoMediumRec;
        int hashCode67 = (hashCode66 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.photo;
        int hashCode68 = (hashCode67 + (str39 == null ? 0 : str39.hashCode())) * 31;
        String str40 = this.photoBig;
        int hashCode69 = (hashCode68 + (str40 == null ? 0 : str40.hashCode())) * 31;
        String str41 = this.photo400;
        int hashCode70 = (hashCode69 + (str41 == null ? 0 : str41.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photoMaxSize;
        int hashCode71 = (hashCode70 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        List<List<UsersProfileButtonDto>> list2 = this.profileButtons;
        int hashCode72 = (hashCode71 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<List<UsersProfileButtonDto>> list3 = this.profileButtonsTablet;
        int hashCode73 = (hashCode72 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<UsersProfileButtonDto> list4 = this.thirdPartyButtons;
        int hashCode74 = (hashCode73 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str42 = this.language;
        int hashCode75 = (hashCode74 + (str42 == null ? 0 : str42.hashCode())) * 31;
        Integer num2 = this.storiesArchiveCount;
        int hashCode76 = (hashCode75 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool7 = this.hasUnseenStories;
        int hashCode77 = (hashCode76 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        WallDefaultDto wallDefaultDto = this.wallDefault;
        int hashCode78 = (hashCode77 + (wallDefaultDto == null ? 0 : wallDefaultDto.hashCode())) * 31;
        AudioMusicAwardsDto audioMusicAwardsDto = this.musicAwards;
        int hashCode79 = (hashCode78 + (audioMusicAwardsDto == null ? 0 : audioMusicAwardsDto.hashCode())) * 31;
        Boolean bool8 = this.canCall;
        int hashCode80 = (hashCode79 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.canCallFromGroup;
        int hashCode81 = (hashCode80 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.canInviteAsVoiceroomsSpeaker;
        int hashCode82 = (hashCode81 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.canSeeWishes;
        int hashCode83 = (hashCode82 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto12 = this.canSeeGifts;
        int hashCode84 = (hashCode83 + (baseBoolIntDto12 == null ? 0 : baseBoolIntDto12.hashCode())) * 31;
        List<BaseOwnerButtonDto> list5 = this.buttons;
        int hashCode85 = (hashCode84 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str43 = this.interests;
        int hashCode86 = (hashCode85 + (str43 == null ? 0 : str43.hashCode())) * 31;
        String str44 = this.books;
        int hashCode87 = (hashCode86 + (str44 == null ? 0 : str44.hashCode())) * 31;
        String str45 = this.tv;
        int hashCode88 = (hashCode87 + (str45 == null ? 0 : str45.hashCode())) * 31;
        String str46 = this.quotes;
        int hashCode89 = (hashCode88 + (str46 == null ? 0 : str46.hashCode())) * 31;
        String str47 = this.about;
        int hashCode90 = (hashCode89 + (str47 == null ? 0 : str47.hashCode())) * 31;
        String str48 = this.games;
        int hashCode91 = (hashCode90 + (str48 == null ? 0 : str48.hashCode())) * 31;
        String str49 = this.movies;
        int hashCode92 = (hashCode91 + (str49 == null ? 0 : str49.hashCode())) * 31;
        String str50 = this.activities;
        int hashCode93 = (hashCode92 + (str50 == null ? 0 : str50.hashCode())) * 31;
        String str51 = this.music;
        int hashCode94 = (hashCode93 + (str51 == null ? 0 : str51.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto13 = this.canWritePrivateMessage;
        int hashCode95 = (hashCode94 + (baseBoolIntDto13 == null ? 0 : baseBoolIntDto13.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto14 = this.canSendFriendRequest;
        int hashCode96 = (hashCode95 + (baseBoolIntDto14 == null ? 0 : baseBoolIntDto14.hashCode())) * 31;
        Boolean bool12 = this.canBeInvitedGroup;
        int hashCode97 = (hashCode96 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        String str52 = this.mobilePhone;
        int hashCode98 = (hashCode97 + (str52 == null ? 0 : str52.hashCode())) * 31;
        String str53 = this.homePhone;
        int hashCode99 = (hashCode98 + (str53 == null ? 0 : str53.hashCode())) * 31;
        String str54 = this.site;
        int hashCode100 = (hashCode99 + (str54 == null ? 0 : str54.hashCode())) * 31;
        AudioAudioDto audioAudioDto = this.statusAudio;
        int hashCode101 = (hashCode100 + (audioAudioDto == null ? 0 : audioAudioDto.hashCode())) * 31;
        String str55 = this.status;
        int hashCode102 = (hashCode101 + (str55 == null ? 0 : str55.hashCode())) * 31;
        String str56 = this.activity;
        int hashCode103 = (hashCode102 + (str56 == null ? 0 : str56.hashCode())) * 31;
        AppsAppMinDto appsAppMinDto = this.statusApp;
        int hashCode104 = (hashCode103 + (appsAppMinDto == null ? 0 : appsAppMinDto.hashCode())) * 31;
        UsersLastSeenDto usersLastSeenDto = this.lastSeen;
        int hashCode105 = (hashCode104 + (usersLastSeenDto == null ? 0 : usersLastSeenDto.hashCode())) * 31;
        UsersExportsDto usersExportsDto = this.exports;
        int hashCode106 = (hashCode105 + (usersExportsDto == null ? 0 : usersExportsDto.hashCode())) * 31;
        BaseCropPhotoDto baseCropPhotoDto = this.cropPhoto;
        int hashCode107 = (hashCode106 + (baseCropPhotoDto == null ? 0 : baseCropPhotoDto.hashCode())) * 31;
        Integer num3 = this.followersCount;
        int hashCode108 = (hashCode107 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.videoLiveLevel;
        int hashCode109 = (hashCode108 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.videoLiveCount;
        int hashCode110 = (hashCode109 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.clipsCount;
        int hashCode111 = (hashCode110 + (num6 == null ? 0 : num6.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto15 = this.blacklisted;
        int hashCode112 = (hashCode111 + (baseBoolIntDto15 == null ? 0 : baseBoolIntDto15.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto16 = this.blacklistedByMe;
        int hashCode113 = (hashCode112 + (baseBoolIntDto16 == null ? 0 : baseBoolIntDto16.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto17 = this.isFavorite;
        int hashCode114 = (hashCode113 + (baseBoolIntDto17 == null ? 0 : baseBoolIntDto17.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto18 = this.isHiddenFromFeed;
        int hashCode115 = (hashCode114 + (baseBoolIntDto18 == null ? 0 : baseBoolIntDto18.hashCode())) * 31;
        Integer num7 = this.commonCount;
        int hashCode116 = (hashCode115 + (num7 == null ? 0 : num7.hashCode())) * 31;
        UsersOccupationDto usersOccupationDto = this.occupation;
        int hashCode117 = (hashCode116 + (usersOccupationDto == null ? 0 : usersOccupationDto.hashCode())) * 31;
        List<UsersCareerDto> list6 = this.career;
        int hashCode118 = (hashCode117 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<UsersMilitaryDto> list7 = this.military;
        int hashCode119 = (hashCode118 + (list7 == null ? 0 : list7.hashCode())) * 31;
        Integer num8 = this.university;
        int hashCode120 = (hashCode119 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str57 = this.universityName;
        int hashCode121 = (hashCode120 + (str57 == null ? 0 : str57.hashCode())) * 31;
        Integer num9 = this.universityGroupId;
        int hashCode122 = (hashCode121 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.faculty;
        int hashCode123 = (hashCode122 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str58 = this.facultyName;
        int hashCode124 = (hashCode123 + (str58 == null ? 0 : str58.hashCode())) * 31;
        Integer num11 = this.graduation;
        int hashCode125 = (hashCode124 + (num11 == null ? 0 : num11.hashCode())) * 31;
        String str59 = this.educationForm;
        int hashCode126 = (hashCode125 + (str59 == null ? 0 : str59.hashCode())) * 31;
        String str60 = this.educationStatus;
        int hashCode127 = (hashCode126 + (str60 == null ? 0 : str60.hashCode())) * 31;
        String str61 = this.homeTown;
        int hashCode128 = (hashCode127 + (str61 == null ? 0 : str61.hashCode())) * 31;
        UsersUserRelationDto usersUserRelationDto = this.relation;
        int hashCode129 = (hashCode128 + (usersUserRelationDto == null ? 0 : usersUserRelationDto.hashCode())) * 31;
        UsersUserMinDto usersUserMinDto = this.relationPartner;
        int hashCode130 = (hashCode129 + (usersUserMinDto == null ? 0 : usersUserMinDto.hashCode())) * 31;
        UsersPersonalDto usersPersonalDto = this.personal;
        int hashCode131 = (hashCode130 + (usersPersonalDto == null ? 0 : usersPersonalDto.hashCode())) * 31;
        List<UsersUniversityDto> list8 = this.universities;
        int hashCode132 = (hashCode131 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<UsersSchoolDto> list9 = this.schools;
        int hashCode133 = (hashCode132 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<UsersRelativeDto> list10 = this.relatives;
        int hashCode134 = (hashCode133 + (list10 == null ? 0 : list10.hashCode())) * 31;
        Boolean bool13 = this.isSubscribedPodcasts;
        int hashCode135 = (hashCode134 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.canSubscribePodcasts;
        int hashCode136 = (hashCode135 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.canSubscribePosts;
        int hashCode137 = (hashCode136 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.isStudent;
        int hashCode138 = (hashCode137 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        Boolean bool17 = this.hasRights;
        int hashCode139 = (hashCode138 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        String str62 = this.sysUsername;
        int hashCode140 = (hashCode139 + (str62 == null ? 0 : str62.hashCode())) * 31;
        UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto = this.employeeWorkingState;
        int hashCode141 = (hashCode140 + (usersEmployeeWorkingStateDto == null ? 0 : usersEmployeeWorkingStateDto.hashCode())) * 31;
        EmployeeMarkDto employeeMarkDto = this.employeeMark;
        int hashCode142 = (hashCode141 + (employeeMarkDto == null ? 0 : employeeMarkDto.hashCode())) * 31;
        UsersRightsLocationDto usersRightsLocationDto = this.rightsLocation;
        int hashCode143 = (hashCode142 + (usersRightsLocationDto == null ? 0 : usersRightsLocationDto.hashCode())) * 31;
        Boolean bool18 = this.canInviteToChats;
        int hashCode144 = (hashCode143 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        UsersEmojiStatusDto usersEmojiStatusDto = this.emojiStatus;
        int hashCode145 = (hashCode144 + (usersEmojiStatusDto == null ? 0 : usersEmojiStatusDto.hashCode())) * 31;
        StatusImageStatusDto statusImageStatusDto = this.imageStatus;
        int hashCode146 = (hashCode145 + (statusImageStatusDto == null ? 0 : statusImageStatusDto.hashCode())) * 31;
        UsersUserCountersDto usersUserCountersDto = this.counters;
        int hashCode147 = (hashCode146 + (usersUserCountersDto == null ? 0 : usersUserCountersDto.hashCode())) * 31;
        String str63 = this.accessKey;
        int hashCode148 = (hashCode147 + (str63 == null ? 0 : str63.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto19 = this.canUploadDoc;
        int hashCode149 = (hashCode148 + (baseBoolIntDto19 == null ? 0 : baseBoolIntDto19.hashCode())) * 31;
        Boolean bool19 = this.canBan;
        int hashCode150 = (hashCode149 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        List<String> list11 = this.eduDetails;
        int hashCode151 = (hashCode150 + (list11 == null ? 0 : list11.hashCode())) * 31;
        String str64 = this.hash;
        int hashCode152 = (hashCode151 + (str64 == null ? 0 : str64.hashCode())) * 31;
        Boolean bool20 = this.hasEmail;
        int hashCode153 = (hashCode152 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        Boolean bool21 = this.isDead;
        int hashCode154 = (hashCode153 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
        UsersGiftsTooltipDto usersGiftsTooltipDto = this.giftsTooltip;
        int hashCode155 = (hashCode154 + (usersGiftsTooltipDto == null ? 0 : usersGiftsTooltipDto.hashCode())) * 31;
        NoIndexDto noIndexDto = this.noIndex;
        int hashCode156 = (hashCode155 + (noIndexDto == null ? 0 : noIndexDto.hashCode())) * 31;
        Integer num12 = this.contactId;
        int hashCode157 = (hashCode156 + (num12 == null ? 0 : num12.hashCode())) * 31;
        MessagesContactDto messagesContactDto = this.contact;
        int hashCode158 = (hashCode157 + (messagesContactDto == null ? 0 : messagesContactDto.hashCode())) * 31;
        Boolean bool22 = this.isMessageRequest;
        int hashCode159 = (hashCode158 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
        List<Integer> list12 = this.lists;
        int hashCode160 = (hashCode159 + (list12 == null ? 0 : list12.hashCode())) * 31;
        Integer num13 = this.friendshipWeeks;
        int hashCode161 = (hashCode160 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Boolean bool23 = this.isPersonalAdsEasyPromoteEnabled;
        int hashCode162 = (hashCode161 + (bool23 == null ? 0 : bool23.hashCode())) * 31;
        Boolean bool24 = this.needBigMsgBtnInProfile;
        int hashCode163 = (hashCode162 + (bool24 == null ? 0 : bool24.hashCode())) * 31;
        UsersUserProfileTypeDto usersUserProfileTypeDto = this.profileType;
        int hashCode164 = (hashCode163 + (usersUserProfileTypeDto == null ? 0 : usersUserProfileTypeDto.hashCode())) * 31;
        UsersCanNotCallReasonDto usersCanNotCallReasonDto = this.canNotCallReason;
        int hashCode165 = (hashCode164 + (usersCanNotCallReasonDto == null ? 0 : usersCanNotCallReasonDto.hashCode())) * 31;
        Boolean bool25 = this.canCallAsCommunity;
        int hashCode166 = (hashCode165 + (bool25 == null ? 0 : bool25.hashCode())) * 31;
        Boolean bool26 = this.isNft;
        int hashCode167 = (hashCode166 + (bool26 == null ? 0 : bool26.hashCode())) * 31;
        BaseImageDto baseImageDto = this.animatedAvatar;
        int hashCode168 = (hashCode167 + (baseImageDto == null ? 0 : baseImageDto.hashCode())) * 31;
        List<CallsCustomNameForCallDto> list13 = this.customNamesForCalls;
        int hashCode169 = (hashCode168 + (list13 == null ? 0 : list13.hashCode())) * 31;
        Boolean bool27 = this.isEsiaVerified;
        int hashCode170 = (hashCode169 + (bool27 == null ? 0 : bool27.hashCode())) * 31;
        Boolean bool28 = this.isEsiaLinked;
        int hashCode171 = (hashCode170 + (bool28 == null ? 0 : bool28.hashCode())) * 31;
        Boolean bool29 = this.isTinkoffVerified;
        int hashCode172 = (hashCode171 + (bool29 == null ? 0 : bool29.hashCode())) * 31;
        Boolean bool30 = this.isTinkoffLinked;
        int hashCode173 = (hashCode172 + (bool30 == null ? 0 : bool30.hashCode())) * 31;
        Boolean bool31 = this.isSberVerified;
        int hashCode174 = (hashCode173 + (bool31 == null ? 0 : bool31.hashCode())) * 31;
        Boolean bool32 = this.isVerified;
        int hashCode175 = (hashCode174 + (bool32 == null ? 0 : bool32.hashCode())) * 31;
        Boolean bool33 = this.isFollowersModeOn;
        int hashCode176 = (hashCode175 + (bool33 == null ? 0 : bool33.hashCode())) * 31;
        SocialButtonTypeDto socialButtonTypeDto = this.socialButtonType;
        int hashCode177 = (hashCode176 + (socialButtonTypeDto == null ? 0 : socialButtonTypeDto.hashCode())) * 31;
        String str65 = this.description;
        int hashCode178 = (hashCode177 + (str65 == null ? 0 : str65.hashCode())) * 31;
        Boolean bool34 = this.isTeacher;
        int hashCode179 = (hashCode178 + (bool34 == null ? 0 : bool34.hashCode())) * 31;
        List<String> list14 = this.oauthLinked;
        int hashCode180 = (hashCode179 + (list14 == null ? 0 : list14.hashCode())) * 31;
        List<String> list15 = this.oauthVerification;
        int hashCode181 = (hashCode180 + (list15 == null ? 0 : list15.hashCode())) * 31;
        Boolean bool35 = this.isSberLinked;
        int hashCode182 = (hashCode181 + (bool35 == null ? 0 : bool35.hashCode())) * 31;
        Integer num14 = this.ageMark;
        int hashCode183 = (hashCode182 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.joined;
        int hashCode184 = (hashCode183 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Boolean bool36 = this.isServiceAccount;
        int hashCode185 = (hashCode184 + (bool36 == null ? 0 : bool36.hashCode())) * 31;
        UsersPromotionAllowanceDto usersPromotionAllowanceDto = this.promotionAllowance;
        int hashCode186 = (hashCode185 + (usersPromotionAllowanceDto == null ? 0 : usersPromotionAllowanceDto.hashCode())) * 31;
        Boolean bool37 = this.coOwnershipEnabled;
        int hashCode187 = (hashCode186 + (bool37 == null ? 0 : bool37.hashCode())) * 31;
        Integer num16 = this.ageGroup;
        int hashCode188 = (hashCode187 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Boolean bool38 = this.hasRelatedUserPin;
        int hashCode189 = (hashCode188 + (bool38 == null ? 0 : bool38.hashCode())) * 31;
        MessagesEduEducationalProfileDto messagesEduEducationalProfileDto = this.educationalProfile;
        int hashCode190 = (hashCode189 + (messagesEduEducationalProfileDto == null ? 0 : messagesEduEducationalProfileDto.hashCode())) * 31;
        BaseAPlusMarkDto baseAPlusMarkDto = this.aPlusMark;
        int hashCode191 = (hashCode190 + (baseAPlusMarkDto == null ? 0 : baseAPlusMarkDto.hashCode())) * 31;
        Boolean bool39 = this.isDon;
        int hashCode192 = (hashCode191 + (bool39 == null ? 0 : bool39.hashCode())) * 31;
        Boolean bool40 = this.isMediaModer;
        int hashCode193 = (hashCode192 + (bool40 == null ? 0 : bool40.hashCode())) * 31;
        Boolean bool41 = this.isPhotoMapEnabled;
        int hashCode194 = (hashCode193 + (bool41 == null ? 0 : bool41.hashCode())) * 31;
        UsersDonutDto usersDonutDto = this.donut;
        int hashCode195 = (hashCode194 + (usersDonutDto == null ? 0 : usersDonutDto.hashCode())) * 31;
        BaseSexDto baseSexDto = this.sex;
        int hashCode196 = (hashCode195 + (baseSexDto == null ? 0 : baseSexDto.hashCode())) * 31;
        String str66 = this.screenName;
        int hashCode197 = (hashCode196 + (str66 == null ? 0 : str66.hashCode())) * 31;
        String str67 = this.photo50;
        int hashCode198 = (hashCode197 + (str67 == null ? 0 : str67.hashCode())) * 31;
        String str68 = this.photo100;
        int hashCode199 = (hashCode198 + (str68 == null ? 0 : str68.hashCode())) * 31;
        String str69 = this.photoBase;
        int hashCode200 = (hashCode199 + (str69 == null ? 0 : str69.hashCode())) * 31;
        UsersOnlineInfoDto usersOnlineInfoDto = this.onlineInfo;
        int hashCode201 = (hashCode200 + (usersOnlineInfoDto == null ? 0 : usersOnlineInfoDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto20 = this.online;
        int hashCode202 = (hashCode201 + (baseBoolIntDto20 == null ? 0 : baseBoolIntDto20.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto21 = this.onlineMobile;
        int hashCode203 = (hashCode202 + (baseBoolIntDto21 == null ? 0 : baseBoolIntDto21.hashCode())) * 31;
        Integer num17 = this.onlineApp;
        int hashCode204 = (hashCode203 + (num17 == null ? 0 : num17.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto22 = this.verified;
        int hashCode205 = (hashCode204 + (baseBoolIntDto22 == null ? 0 : baseBoolIntDto22.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto23 = this.trending;
        int hashCode206 = (hashCode205 + (baseBoolIntDto23 == null ? 0 : baseBoolIntDto23.hashCode())) * 31;
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto = this.friendStatus;
        int hashCode207 = (hashCode206 + (friendsFriendStatusStatusDto == null ? 0 : friendsFriendStatusStatusDto.hashCode())) * 31;
        FriendsRequestsMutualDto friendsRequestsMutualDto = this.mutual;
        int hashCode208 = (hashCode207 + (friendsRequestsMutualDto == null ? 0 : friendsRequestsMutualDto.hashCode())) * 31;
        String str70 = this.deactivated;
        int hashCode209 = (hashCode208 + (str70 == null ? 0 : str70.hashCode())) * 31;
        String str71 = this.firstName;
        int hashCode210 = (hashCode209 + (str71 == null ? 0 : str71.hashCode())) * 31;
        Integer num18 = this.hidden;
        int hashCode211 = (hashCode210 + (num18 == null ? 0 : num18.hashCode())) * 31;
        String str72 = this.lastName;
        int hashCode212 = (hashCode211 + (str72 == null ? 0 : str72.hashCode())) * 31;
        Boolean bool42 = this.canAccessClosed;
        int hashCode213 = (hashCode212 + (bool42 == null ? 0 : bool42.hashCode())) * 31;
        Boolean bool43 = this.isClosed;
        int hashCode214 = (hashCode213 + (bool43 == null ? 0 : bool43.hashCode())) * 31;
        Boolean bool44 = this.isCached;
        return hashCode214 + (bool44 != null ? bool44.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsInterestingRequestDto(id=");
        sb.append(this.id);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", descriptions=");
        sb.append(this.descriptions);
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
        sb.append(", lists=");
        sb.append(this.lists);
        sb.append(", friendshipWeeks=");
        sb.append(this.friendshipWeeks);
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

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        parcel.writeString(this.trackCode);
        parcel.writeParcelable(this.userId, i);
        Integer num = this.timestamp;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.message);
        parcel.writeStringList(this.descriptions);
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
        parcel.writeParcelable(this.city, i);
        parcel.writeParcelable(this.country, i);
        Float f = this.timezone;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        parcel.writeParcelable(this.ownerState, i);
        parcel.writeString(this.photo200);
        parcel.writeString(this.photoMax);
        parcel.writeString(this.photo200Orig);
        parcel.writeString(this.photo400Orig);
        parcel.writeString(this.photoMaxOrig);
        parcel.writeString(this.photoId);
        parcel.writeParcelable(this.hasPhoto, i);
        parcel.writeParcelable(this.cover, i);
        parcel.writeString(this.photoAvgColor);
        parcel.writeParcelable(this.hasMobile, i);
        parcel.writeParcelable(this.isFriend, i);
        Boolean bool = this.isBestFriend;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeParcelable(this.wallComments, i);
        parcel.writeParcelable(this.canPost, i);
        parcel.writeParcelable(this.canSeeAllPosts, i);
        parcel.writeParcelable(this.canSeeAudio, i);
        parcel.writeParcelable(this.type, i);
        parcel.writeString(this.email);
        parcel.writeString(this.skype);
        parcel.writeString(this.facebook);
        parcel.writeString(this.facebookName);
        parcel.writeString(this.twitter);
        parcel.writeParcelable(this.isAdult, i);
        parcel.writeParcelable(this.isSubscribed, i);
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
        parcel.writeParcelable(this.test, i);
        parcel.writeParcelable(this.videoLive, i);
        parcel.writeParcelable(this.isVideoLiveNotificationsBlocked, i);
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
        parcel.writeParcelable(this.photoMaxSize, i);
        List<List<UsersProfileButtonDto>> list = this.profileButtons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list, 1);
            while (f2.hasNext()) {
                Iterator a2 = ao.a(parcel, (List) f2.next());
                while (a2.hasNext()) {
                    parcel.writeParcelable((Parcelable) a2.next(), i);
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
                    parcel.writeParcelable((Parcelable) a3.next(), i);
                }
            }
        }
        List<UsersProfileButtonDto> list3 = this.thirdPartyButtons;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list3, 1);
            while (f4.hasNext()) {
                parcel.writeParcelable((Parcelable) f4.next(), i);
            }
        }
        parcel.writeString(this.language);
        Integer num2 = this.storiesArchiveCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
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
        parcel.writeParcelable(this.musicAwards, i);
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
        parcel.writeParcelable(this.canSeeGifts, i);
        List<BaseOwnerButtonDto> list4 = this.buttons;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list4, 1);
            while (f5.hasNext()) {
                parcel.writeParcelable((Parcelable) f5.next(), i);
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
        parcel.writeParcelable(this.canWritePrivateMessage, i);
        parcel.writeParcelable(this.canSendFriendRequest, i);
        Boolean bool12 = this.canBeInvitedGroup;
        if (bool12 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool12);
        }
        parcel.writeString(this.mobilePhone);
        parcel.writeString(this.homePhone);
        parcel.writeString(this.site);
        parcel.writeParcelable(this.statusAudio, i);
        parcel.writeString(this.status);
        parcel.writeString(this.activity);
        parcel.writeParcelable(this.statusApp, i);
        parcel.writeParcelable(this.lastSeen, i);
        parcel.writeParcelable(this.exports, i);
        parcel.writeParcelable(this.cropPhoto, i);
        Integer num3 = this.followersCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.videoLiveLevel;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Integer num5 = this.videoLiveCount;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        Integer num6 = this.clipsCount;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        parcel.writeParcelable(this.blacklisted, i);
        parcel.writeParcelable(this.blacklistedByMe, i);
        parcel.writeParcelable(this.isFavorite, i);
        parcel.writeParcelable(this.isHiddenFromFeed, i);
        Integer num7 = this.commonCount;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num7);
        }
        parcel.writeParcelable(this.occupation, i);
        List<UsersCareerDto> list5 = this.career;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f6 = dn.f(parcel, list5, 1);
            while (f6.hasNext()) {
                parcel.writeParcelable((Parcelable) f6.next(), i);
            }
        }
        List<UsersMilitaryDto> list6 = this.military;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f7 = dn.f(parcel, list6, 1);
            while (f7.hasNext()) {
                parcel.writeParcelable((Parcelable) f7.next(), i);
            }
        }
        Integer num8 = this.university;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num8);
        }
        parcel.writeString(this.universityName);
        Integer num9 = this.universityGroupId;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num9);
        }
        Integer num10 = this.faculty;
        if (num10 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num10);
        }
        parcel.writeString(this.facultyName);
        Integer num11 = this.graduation;
        if (num11 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num11);
        }
        parcel.writeString(this.educationForm);
        parcel.writeString(this.educationStatus);
        parcel.writeString(this.homeTown);
        parcel.writeParcelable(this.relation, i);
        parcel.writeParcelable(this.relationPartner, i);
        parcel.writeParcelable(this.personal, i);
        List<UsersUniversityDto> list7 = this.universities;
        if (list7 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f8 = dn.f(parcel, list7, 1);
            while (f8.hasNext()) {
                parcel.writeParcelable((Parcelable) f8.next(), i);
            }
        }
        List<UsersSchoolDto> list8 = this.schools;
        if (list8 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f9 = dn.f(parcel, list8, 1);
            while (f9.hasNext()) {
                parcel.writeParcelable((Parcelable) f9.next(), i);
            }
        }
        List<UsersRelativeDto> list9 = this.relatives;
        if (list9 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f10 = dn.f(parcel, list9, 1);
            while (f10.hasNext()) {
                parcel.writeParcelable((Parcelable) f10.next(), i);
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
        parcel.writeParcelable(this.employeeWorkingState, i);
        EmployeeMarkDto employeeMarkDto = this.employeeMark;
        if (employeeMarkDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            employeeMarkDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.rightsLocation, i);
        Boolean bool18 = this.canInviteToChats;
        if (bool18 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool18);
        }
        parcel.writeParcelable(this.emojiStatus, i);
        parcel.writeParcelable(this.imageStatus, i);
        parcel.writeParcelable(this.counters, i);
        parcel.writeString(this.accessKey);
        parcel.writeParcelable(this.canUploadDoc, i);
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
        parcel.writeParcelable(this.giftsTooltip, i);
        NoIndexDto noIndexDto = this.noIndex;
        if (noIndexDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            noIndexDto.writeToParcel(parcel, i);
        }
        Integer num12 = this.contactId;
        if (num12 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num12);
        }
        parcel.writeParcelable(this.contact, i);
        Boolean bool22 = this.isMessageRequest;
        if (bool22 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool22);
        }
        List<Integer> list10 = this.lists;
        if (list10 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f11 = dn.f(parcel, list10, 1);
            while (f11.hasNext()) {
                parcel.writeInt(((Number) f11.next()).intValue());
            }
        }
        Integer num13 = this.friendshipWeeks;
        if (num13 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num13);
        }
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
        parcel.writeParcelable(this.profileType, i);
        parcel.writeParcelable(this.canNotCallReason, i);
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
        parcel.writeParcelable(this.animatedAvatar, i);
        List<CallsCustomNameForCallDto> list11 = this.customNamesForCalls;
        if (list11 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f12 = dn.f(parcel, list11, 1);
            while (f12.hasNext()) {
                parcel.writeParcelable((Parcelable) f12.next(), i);
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
        Integer num14 = this.ageMark;
        if (num14 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num14);
        }
        Integer num15 = this.joined;
        if (num15 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num15);
        }
        Boolean bool36 = this.isServiceAccount;
        if (bool36 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool36);
        }
        parcel.writeParcelable(this.promotionAllowance, i);
        Boolean bool37 = this.coOwnershipEnabled;
        if (bool37 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool37);
        }
        Integer num16 = this.ageGroup;
        if (num16 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num16);
        }
        Boolean bool38 = this.hasRelatedUserPin;
        if (bool38 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool38);
        }
        parcel.writeParcelable(this.educationalProfile, i);
        parcel.writeParcelable(this.aPlusMark, i);
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
        parcel.writeParcelable(this.donut, i);
        parcel.writeParcelable(this.sex, i);
        parcel.writeString(this.screenName);
        parcel.writeString(this.photo50);
        parcel.writeString(this.photo100);
        parcel.writeString(this.photoBase);
        parcel.writeParcelable(this.onlineInfo, i);
        parcel.writeParcelable(this.online, i);
        parcel.writeParcelable(this.onlineMobile, i);
        Integer num17 = this.onlineApp;
        if (num17 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num17);
        }
        parcel.writeParcelable(this.verified, i);
        parcel.writeParcelable(this.trending, i);
        parcel.writeParcelable(this.friendStatus, i);
        parcel.writeParcelable(this.mutual, i);
        parcel.writeString(this.deactivated);
        parcel.writeString(this.firstName);
        Integer num18 = this.hidden;
        if (num18 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num18);
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ FriendsInterestingRequestDto(UserId userId, String str, UserId userId2, Integer num, String str2, List list, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, BdateVisibilityDto bdateVisibilityDto, BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, Float f, OwnerStateDto ownerStateDto, String str20, String str21, String str22, String str23, String str24, String str25, BaseBoolIntDto baseBoolIntDto, BaseOwnerCoverDto baseOwnerCoverDto, String str26, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Boolean bool, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, UsersUserTypeDto usersUserTypeDto, String str27, String str28, String str29, String str30, String str31, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str32, String str33, String str34, BaseBoolIntDto baseBoolIntDto10, VideoLiveInfoDto videoLiveInfoDto, BaseBoolIntDto baseBoolIntDto11, Boolean bool6, String str35, String str36, String str37, String str38, String str39, String str40, String str41, PhotosPhotoDto photosPhotoDto, List list2, List list3, List list4, String str42, Integer num2, Boolean bool7, WallDefaultDto wallDefaultDto, AudioMusicAwardsDto audioMusicAwardsDto, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, BaseBoolIntDto baseBoolIntDto12, List list5, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, BaseBoolIntDto baseBoolIntDto13, BaseBoolIntDto baseBoolIntDto14, Boolean bool12, String str52, String str53, String str54, AudioAudioDto audioAudioDto, String str55, String str56, AppsAppMinDto appsAppMinDto, UsersLastSeenDto usersLastSeenDto, UsersExportsDto usersExportsDto, BaseCropPhotoDto baseCropPhotoDto, Integer num3, Integer num4, Integer num5, Integer num6, BaseBoolIntDto baseBoolIntDto15, BaseBoolIntDto baseBoolIntDto16, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, Integer num7, UsersOccupationDto usersOccupationDto, List list6, List list7, Integer num8, String str57, Integer num9, Integer num10, String str58, Integer num11, String str59, String str60, String str61, UsersUserRelationDto usersUserRelationDto, UsersUserMinDto usersUserMinDto, UsersPersonalDto usersPersonalDto, List list8, List list9, List list10, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, String str62, UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto, EmployeeMarkDto employeeMarkDto, UsersRightsLocationDto usersRightsLocationDto, Boolean bool18, UsersEmojiStatusDto usersEmojiStatusDto, StatusImageStatusDto statusImageStatusDto, UsersUserCountersDto usersUserCountersDto, String str63, BaseBoolIntDto baseBoolIntDto19, Boolean bool19, List list11, String str64, Boolean bool20, Boolean bool21, UsersGiftsTooltipDto usersGiftsTooltipDto, NoIndexDto noIndexDto, Integer num12, MessagesContactDto messagesContactDto, Boolean bool22, List list12, Integer num13, Boolean bool23, Boolean bool24, UsersUserProfileTypeDto usersUserProfileTypeDto, UsersCanNotCallReasonDto usersCanNotCallReasonDto, Boolean bool25, Boolean bool26, BaseImageDto baseImageDto, List list13, Boolean bool27, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, Boolean bool33, SocialButtonTypeDto socialButtonTypeDto, String str65, Boolean bool34, List list14, List list15, Boolean bool35, Integer num14, Integer num15, Boolean bool36, UsersPromotionAllowanceDto usersPromotionAllowanceDto, Boolean bool37, Integer num16, Boolean bool38, MessagesEduEducationalProfileDto messagesEduEducationalProfileDto, BaseAPlusMarkDto baseAPlusMarkDto, Boolean bool39, Boolean bool40, Boolean bool41, UsersDonutDto usersDonutDto, BaseSexDto baseSexDto, String str66, String str67, String str68, String str69, UsersOnlineInfoDto usersOnlineInfoDto, BaseBoolIntDto baseBoolIntDto20, BaseBoolIntDto baseBoolIntDto21, Integer num17, BaseBoolIntDto baseBoolIntDto22, BaseBoolIntDto baseBoolIntDto23, FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, FriendsRequestsMutualDto friendsRequestsMutualDto, String str70, String str71, Integer num18, String str72, Boolean bool42, Boolean bool43, Boolean bool44, int i, int i2, int i3, int i4, int i5, int i6, int i7, zcl zclVar) {
        this(userId, r164, r9, r10, r11, r12, r13, r14, r15, r8, r165, r166, r167, r168, r7, r17, r19, r21, r23, r25, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r169, r39, r40, r41, r42, r43, r44, r45, r170, r171, r172, r173, r174, r175, r176, r177, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r1, r62, r63, r64, r65, r66, r67, r68, r178, r179, r180, r181, r182, r183, r184, r185, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r2, r85, r86, r87, r88, r89, r90, r91, r186, r187, r188, r189, r190, r191, r192, r193, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r3, r108, r109, r110, r111, r112, r113, r114, r194, r195, r196, r197, r198, r199, r200, r0, (i5 & 32768) != 0 ? null : bool18, (i5 & 65536) != 0 ? null : usersEmojiStatusDto, (i5 & 131072) != 0 ? null : statusImageStatusDto, (i5 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : usersUserCountersDto, (i5 & 524288) != 0 ? null : str63, (i5 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : baseBoolIntDto19, (i5 & 2097152) != 0 ? null : bool19, (i5 & 4194304) != 0 ? null : list11, (i5 & 8388608) != 0 ? null : str64, (i5 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : bool20, (i5 & 33554432) != 0 ? null : bool21, (i5 & 67108864) != 0 ? null : usersGiftsTooltipDto, (i5 & 134217728) != 0 ? null : noIndexDto, (i5 & 268435456) != 0 ? null : num12, (i5 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : messagesContactDto, (i5 & 1073741824) != 0 ? null : bool22, (i5 & Integer.MIN_VALUE) != 0 ? null : list12, (i6 & 1) != 0 ? null : num13, (i6 & 2) != 0 ? null : bool23, (i6 & 4) != 0 ? null : bool24, (i6 & 8) != 0 ? null : usersUserProfileTypeDto, (i6 & 16) != 0 ? null : usersCanNotCallReasonDto, (i6 & 32) != 0 ? null : bool25, (i6 & 64) != 0 ? null : bool26, (i6 & 128) != 0 ? null : baseImageDto, (i6 & 256) != 0 ? null : list13, (i6 & 512) != 0 ? null : bool27, (i6 & 1024) != 0 ? null : bool28, (i6 & 2048) != 0 ? null : bool29, (i6 & 4096) != 0 ? null : bool30, (i6 & 8192) != 0 ? null : bool31, (i6 & 16384) != 0 ? null : bool32, (i6 & 32768) != 0 ? null : bool33, (i6 & 65536) != 0 ? null : socialButtonTypeDto, (i6 & 131072) != 0 ? null : str65, (i6 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool34, (i6 & 524288) != 0 ? null : list14, (i6 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : list15, (i6 & 2097152) != 0 ? null : bool35, (i6 & 4194304) != 0 ? null : num14, (i6 & 8388608) != 0 ? null : num15, (i6 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : bool36, (i6 & 33554432) != 0 ? null : usersPromotionAllowanceDto, (i6 & 67108864) != 0 ? null : bool37, (i6 & 134217728) != 0 ? null : num16, (i6 & 268435456) != 0 ? null : bool38, (i6 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : messagesEduEducationalProfileDto, (i6 & 1073741824) != 0 ? null : baseAPlusMarkDto, (i6 & Integer.MIN_VALUE) != 0 ? null : bool39, (i7 & 1) != 0 ? null : bool40, (i7 & 2) != 0 ? null : bool41, (i7 & 4) != 0 ? null : usersDonutDto, (i7 & 8) != 0 ? null : baseSexDto, (i7 & 16) != 0 ? null : str66, (i7 & 32) != 0 ? null : str67, (i7 & 64) != 0 ? null : str68, (i7 & 128) != 0 ? null : str69, (i7 & 256) != 0 ? null : usersOnlineInfoDto, (i7 & 512) != 0 ? null : baseBoolIntDto20, (i7 & 1024) != 0 ? null : baseBoolIntDto21, (i7 & 2048) != 0 ? null : num17, (i7 & 4096) != 0 ? null : baseBoolIntDto22, (i7 & 8192) != 0 ? null : baseBoolIntDto23, (i7 & 16384) != 0 ? null : friendsFriendStatusStatusDto, (i7 & 32768) != 0 ? null : friendsRequestsMutualDto, (i7 & 65536) != 0 ? null : str70, (i7 & 131072) != 0 ? null : str71, (i7 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num18, (i7 & 524288) != 0 ? null : str72, (i7 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool42, (i7 & 2097152) != 0 ? null : bool43, (i7 & 4194304) != 0 ? null : bool44);
        String str73 = (i & 2) != 0 ? null : str;
        UserId userId3 = (i & 4) != 0 ? null : userId2;
        Integer num19 = (i & 8) != 0 ? null : num;
        String str74 = (i & 16) != 0 ? null : str2;
        List list16 = (i & 32) != 0 ? null : list;
        String str75 = (i & 64) != 0 ? null : str3;
        String str76 = (i & 128) != 0 ? null : str4;
        String str77 = (i & 256) != 0 ? null : str5;
        String str78 = (i & 512) != 0 ? null : str6;
        String str79 = str73;
        String str80 = (i & 1024) != 0 ? null : str7;
        String str81 = (i & 2048) != 0 ? null : str8;
        String str82 = (i & 4096) != 0 ? null : str9;
        String str83 = (i & 8192) != 0 ? null : str10;
        String str84 = (i & 16384) != 0 ? null : str11;
        String str85 = (i & 32768) != 0 ? null : str12;
        String str86 = (i & 65536) != 0 ? null : str13;
        String str87 = (i & 131072) != 0 ? null : str14;
        String str88 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str15;
        String str89 = (i & 524288) != 0 ? null : str16;
        String str90 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str17;
        String str91 = (i & 2097152) != 0 ? null : str18;
        String str92 = (i & 4194304) != 0 ? null : str19;
        BdateVisibilityDto bdateVisibilityDto2 = (i & 8388608) != 0 ? null : bdateVisibilityDto;
        BaseCityDto baseCityDto2 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : baseCityDto;
        BaseCountryDto baseCountryDto2 = (i & 33554432) != 0 ? null : baseCountryDto;
        Float f2 = (i & 67108864) != 0 ? null : f;
        OwnerStateDto ownerStateDto2 = (i & 134217728) != 0 ? null : ownerStateDto;
        String str93 = (i & 268435456) != 0 ? null : str20;
        String str94 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str21;
        String str95 = (i & 1073741824) != 0 ? null : str22;
        String str96 = (i & Integer.MIN_VALUE) != 0 ? null : str23;
        String str97 = (i2 & 1) != 0 ? null : str24;
        String str98 = (i2 & 2) != 0 ? null : str25;
        BaseBoolIntDto baseBoolIntDto24 = (i2 & 4) != 0 ? null : baseBoolIntDto;
        BaseOwnerCoverDto baseOwnerCoverDto2 = (i2 & 8) != 0 ? null : baseOwnerCoverDto;
        String str99 = (i2 & 16) != 0 ? null : str26;
        BaseBoolIntDto baseBoolIntDto25 = (i2 & 32) != 0 ? null : baseBoolIntDto2;
        BaseBoolIntDto baseBoolIntDto26 = (i2 & 64) != 0 ? null : baseBoolIntDto3;
        String str100 = str96;
        Boolean bool45 = (i2 & 128) != 0 ? null : bool;
        BaseBoolIntDto baseBoolIntDto27 = (i2 & 256) != 0 ? null : baseBoolIntDto4;
        BaseBoolIntDto baseBoolIntDto28 = (i2 & 512) != 0 ? null : baseBoolIntDto5;
        BaseBoolIntDto baseBoolIntDto29 = (i2 & 1024) != 0 ? null : baseBoolIntDto6;
        BaseBoolIntDto baseBoolIntDto30 = (i2 & 2048) != 0 ? null : baseBoolIntDto7;
        UsersUserTypeDto usersUserTypeDto2 = (i2 & 4096) != 0 ? null : usersUserTypeDto;
        String str101 = (i2 & 8192) != 0 ? null : str27;
        String str102 = (i2 & 16384) != 0 ? null : str28;
        String str103 = (i2 & 32768) != 0 ? null : str29;
        String str104 = (i2 & 65536) != 0 ? null : str30;
        String str105 = (i2 & 131072) != 0 ? null : str31;
        BaseBoolIntDto baseBoolIntDto31 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : baseBoolIntDto8;
        BaseBoolIntDto baseBoolIntDto32 = (i2 & 524288) != 0 ? null : baseBoolIntDto9;
        Boolean bool46 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool2;
        Boolean bool47 = (i2 & 2097152) != 0 ? null : bool3;
        Boolean bool48 = (i2 & 4194304) != 0 ? null : bool4;
        Boolean bool49 = (i2 & 8388608) != 0 ? null : bool5;
        String str106 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str32;
        String str107 = (i2 & 33554432) != 0 ? null : str33;
        String str108 = (i2 & 67108864) != 0 ? null : str34;
        BaseBoolIntDto baseBoolIntDto33 = (i2 & 134217728) != 0 ? null : baseBoolIntDto10;
        VideoLiveInfoDto videoLiveInfoDto2 = (i2 & 268435456) != 0 ? null : videoLiveInfoDto;
        BaseBoolIntDto baseBoolIntDto34 = (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : baseBoolIntDto11;
        Boolean bool50 = (i2 & 1073741824) != 0 ? null : bool6;
        String str109 = (i2 & Integer.MIN_VALUE) != 0 ? null : str35;
        String str110 = (i3 & 1) != 0 ? null : str36;
        String str111 = (i3 & 2) != 0 ? null : str37;
        String str112 = (i3 & 4) != 0 ? null : str38;
        String str113 = (i3 & 8) != 0 ? null : str39;
        String str114 = (i3 & 16) != 0 ? null : str40;
        String str115 = (i3 & 32) != 0 ? null : str41;
        PhotosPhotoDto photosPhotoDto2 = (i3 & 64) != 0 ? null : photosPhotoDto;
        String str116 = str102;
        List list17 = (i3 & 128) != 0 ? null : list2;
        List list18 = (i3 & 256) != 0 ? null : list3;
        List list19 = (i3 & 512) != 0 ? null : list4;
        String str117 = (i3 & 1024) != 0 ? null : str42;
        Integer num20 = (i3 & 2048) != 0 ? null : num2;
        Boolean bool51 = (i3 & 4096) != 0 ? null : bool7;
        WallDefaultDto wallDefaultDto2 = (i3 & 8192) != 0 ? null : wallDefaultDto;
        AudioMusicAwardsDto audioMusicAwardsDto2 = (i3 & 16384) != 0 ? null : audioMusicAwardsDto;
        Boolean bool52 = (i3 & 32768) != 0 ? null : bool8;
        Boolean bool53 = (i3 & 65536) != 0 ? null : bool9;
        Boolean bool54 = (i3 & 131072) != 0 ? null : bool10;
        Boolean bool55 = (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool11;
        BaseBoolIntDto baseBoolIntDto35 = (i3 & 524288) != 0 ? null : baseBoolIntDto12;
        List list20 = (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : list5;
        String str118 = (i3 & 2097152) != 0 ? null : str43;
        String str119 = (i3 & 4194304) != 0 ? null : str44;
        String str120 = (i3 & 8388608) != 0 ? null : str45;
        String str121 = (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str46;
        String str122 = (i3 & 33554432) != 0 ? null : str47;
        String str123 = (i3 & 67108864) != 0 ? null : str48;
        String str124 = (i3 & 134217728) != 0 ? null : str49;
        String str125 = (i3 & 268435456) != 0 ? null : str50;
        String str126 = (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str51;
        BaseBoolIntDto baseBoolIntDto36 = (i3 & 1073741824) != 0 ? null : baseBoolIntDto13;
        BaseBoolIntDto baseBoolIntDto37 = (i3 & Integer.MIN_VALUE) != 0 ? null : baseBoolIntDto14;
        Boolean bool56 = (i4 & 1) != 0 ? null : bool12;
        String str127 = (i4 & 2) != 0 ? null : str52;
        String str128 = (i4 & 4) != 0 ? null : str53;
        String str129 = (i4 & 8) != 0 ? null : str54;
        AudioAudioDto audioAudioDto2 = (i4 & 16) != 0 ? null : audioAudioDto;
        String str130 = (i4 & 32) != 0 ? null : str55;
        String str131 = (i4 & 64) != 0 ? null : str56;
        AudioMusicAwardsDto audioMusicAwardsDto3 = audioMusicAwardsDto2;
        AppsAppMinDto appsAppMinDto2 = (i4 & 128) != 0 ? null : appsAppMinDto;
        UsersLastSeenDto usersLastSeenDto2 = (i4 & 256) != 0 ? null : usersLastSeenDto;
        UsersExportsDto usersExportsDto2 = (i4 & 512) != 0 ? null : usersExportsDto;
        BaseCropPhotoDto baseCropPhotoDto2 = (i4 & 1024) != 0 ? null : baseCropPhotoDto;
        Integer num21 = (i4 & 2048) != 0 ? null : num3;
        Integer num22 = (i4 & 4096) != 0 ? null : num4;
        Integer num23 = (i4 & 8192) != 0 ? null : num5;
        Integer num24 = (i4 & 16384) != 0 ? null : num6;
        BaseBoolIntDto baseBoolIntDto38 = (i4 & 32768) != 0 ? null : baseBoolIntDto15;
        BaseBoolIntDto baseBoolIntDto39 = (i4 & 65536) != 0 ? null : baseBoolIntDto16;
        BaseBoolIntDto baseBoolIntDto40 = (i4 & 131072) != 0 ? null : baseBoolIntDto17;
        BaseBoolIntDto baseBoolIntDto41 = (i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : baseBoolIntDto18;
        Integer num25 = (i4 & 524288) != 0 ? null : num7;
        UsersOccupationDto usersOccupationDto2 = (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : usersOccupationDto;
        List list21 = (i4 & 2097152) != 0 ? null : list6;
        List list22 = (i4 & 4194304) != 0 ? null : list7;
        Integer num26 = (i4 & 8388608) != 0 ? null : num8;
        String str132 = (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str57;
        Integer num27 = (i4 & 33554432) != 0 ? null : num9;
        Integer num28 = (i4 & 67108864) != 0 ? null : num10;
        String str133 = (i4 & 134217728) != 0 ? null : str58;
        Integer num29 = (i4 & 268435456) != 0 ? null : num11;
        String str134 = (i4 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str59;
        String str135 = (i4 & 1073741824) != 0 ? null : str60;
        String str136 = (i4 & Integer.MIN_VALUE) != 0 ? null : str61;
        UsersUserRelationDto usersUserRelationDto2 = (i5 & 1) != 0 ? null : usersUserRelationDto;
        UsersUserMinDto usersUserMinDto2 = (i5 & 2) != 0 ? null : usersUserMinDto;
        UsersPersonalDto usersPersonalDto2 = (i5 & 4) != 0 ? null : usersPersonalDto;
        List list23 = (i5 & 8) != 0 ? null : list8;
        List list24 = (i5 & 16) != 0 ? null : list9;
        List list25 = (i5 & 32) != 0 ? null : list10;
        Boolean bool57 = (i5 & 64) != 0 ? null : bool13;
        Integer num30 = num24;
        Boolean bool58 = (i5 & 128) != 0 ? null : bool14;
        Boolean bool59 = (i5 & 256) != 0 ? null : bool15;
        Boolean bool60 = (i5 & 512) != 0 ? null : bool16;
        Boolean bool61 = (i5 & 1024) != 0 ? null : bool17;
        String str137 = (i5 & 2048) != 0 ? null : str62;
        UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto2 = (i5 & 4096) != 0 ? null : usersEmployeeWorkingStateDto;
        EmployeeMarkDto employeeMarkDto2 = (i5 & 8192) != 0 ? null : employeeMarkDto;
        UsersRightsLocationDto usersRightsLocationDto2 = (i5 & 16384) != 0 ? null : usersRightsLocationDto;
    }
}
