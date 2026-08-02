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

/* compiled from: FriendsUserRecommendationsDto.kt */
/* loaded from: classes14.dex */
public final class FriendsUserRecommendationsDto implements Parcelable {
    public static final Parcelable.Creator<FriendsUserRecommendationsDto> CREATOR = new a();

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

    @pmi0("button")
    private final FriendsRecBlockButtonDto button;

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
    private final FriendsRecDescriptionGenericDto description;

    @pmi0("descriptions")
    private final List<FriendsRecDescriptionGenericDto> descriptions;

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

    @pmi0("friends_generation_id")
    private final Long friendsGenerationId;

    @pmi0("friends_recommendation_source")
    private final Integer friendsRecommendationSource;

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

    @pmi0("recommendation_state")
    private final String recommendationState;

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
    /* compiled from: FriendsUserRecommendationsDto.kt */
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

        /* compiled from: FriendsUserRecommendationsDto.kt */
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
    /* compiled from: FriendsUserRecommendationsDto.kt */
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

        /* compiled from: FriendsUserRecommendationsDto.kt */
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
    /* compiled from: FriendsUserRecommendationsDto.kt */
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

        /* compiled from: FriendsUserRecommendationsDto.kt */
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
    /* compiled from: FriendsUserRecommendationsDto.kt */
    public static final class SocialButtonTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SocialButtonTypeDto[] $VALUES;

        @pmi0("add")
        public static final SocialButtonTypeDto ADD;
        public static final Parcelable.Creator<SocialButtonTypeDto> CREATOR;

        @pmi0("follow")
        public static final SocialButtonTypeDto FOLLOW;
        private final String value;

        /* compiled from: FriendsUserRecommendationsDto.kt */
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
    /* compiled from: FriendsUserRecommendationsDto.kt */
    public static final class WallDefaultDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ WallDefaultDto[] $VALUES;

        @pmi0("all")
        public static final WallDefaultDto ALL;
        public static final Parcelable.Creator<WallDefaultDto> CREATOR;

        @pmi0("owner")
        public static final WallDefaultDto OWNER;
        private final String value;

        /* compiled from: FriendsUserRecommendationsDto.kt */
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

    /* compiled from: FriendsUserRecommendationsDto.kt */
    public static final class a implements Parcelable.Creator<FriendsUserRecommendationsDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsUserRecommendationsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            UserId userId;
            BaseCropPhotoDto baseCropPhotoDto;
            FriendsRecBlockButtonDto createFromParcel;
            FriendsRecBlockButtonDto friendsRecBlockButtonDto;
            SocialButtonTypeDto createFromParcel2;
            SocialButtonTypeDto socialButtonTypeDto;
            BdateVisibilityDto createFromParcel3;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            Boolean valueOf6;
            PhotosPhotoDto photosPhotoDto;
            ArrayList arrayList2;
            ArrayList arrayList3;
            UserId userId2;
            ArrayList arrayList4;
            ArrayList arrayList5;
            Boolean valueOf7;
            UserId userId3;
            WallDefaultDto createFromParcel4;
            Boolean valueOf8;
            Boolean valueOf9;
            Boolean valueOf10;
            Boolean valueOf11;
            ArrayList arrayList6;
            ArrayList arrayList7;
            ArrayList arrayList8;
            Boolean valueOf12;
            UsersOccupationDto usersOccupationDto;
            ArrayList arrayList9;
            ArrayList arrayList10;
            BaseBoolIntDto baseBoolIntDto;
            ArrayList arrayList11;
            ArrayList arrayList12;
            UsersPersonalDto usersPersonalDto;
            Integer num;
            ArrayList arrayList13;
            BaseBoolIntDto baseBoolIntDto2;
            ArrayList arrayList14;
            ArrayList arrayList15;
            ArrayList arrayList16;
            ArrayList arrayList17;
            Boolean valueOf13;
            Boolean valueOf14;
            Boolean valueOf15;
            Boolean valueOf16;
            Boolean valueOf17;
            UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto;
            EmployeeMarkDto createFromParcel5;
            Boolean valueOf18;
            Boolean valueOf19;
            Boolean valueOf20;
            Boolean valueOf21;
            UsersGiftsTooltipDto usersGiftsTooltipDto;
            NoIndexDto createFromParcel6;
            Boolean valueOf22;
            MessagesContactDto messagesContactDto;
            Boolean bool;
            ArrayList arrayList18;
            ArrayList arrayList19;
            Boolean valueOf23;
            Boolean valueOf24;
            Boolean valueOf25;
            Boolean valueOf26;
            BaseImageDto baseImageDto;
            ArrayList arrayList20;
            ArrayList arrayList21;
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
            UserId userId4 = (UserId) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            FriendsRecDescriptionGenericDto friendsRecDescriptionGenericDto = (FriendsRecDescriptionGenericDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            String readString = parcel.readString();
            Long valueOf45 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer valueOf46 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            FriendsRequestsMutualDto friendsRequestsMutualDto = (FriendsRequestsMutualDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            BaseSexDto baseSexDto = (BaseSexDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            Integer valueOf47 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                userId = userId4;
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                userId = userId4;
                int i = 0;
                while (i != readInt) {
                    i = bo.b(FriendsUserRecommendationsDto.class, parcel, arrayList, i, 1);
                    readInt = readInt;
                }
            }
            FriendsFriendStatusStatusDto friendsFriendStatusStatusDto = (FriendsFriendStatusStatusDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto3 = (BaseBoolIntDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto4 = (BaseBoolIntDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto5 = (BaseBoolIntDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            UserId userId5 = userId;
            String readString9 = parcel.readString();
            BaseCropPhotoDto baseCropPhotoDto2 = (BaseCropPhotoDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                baseCropPhotoDto = baseCropPhotoDto2;
                createFromParcel = null;
            } else {
                baseCropPhotoDto = baseCropPhotoDto2;
                createFromParcel = FriendsRecBlockButtonDto.CREATOR.createFromParcel(parcel);
            }
            FriendsRecBlockButtonDto friendsRecBlockButtonDto2 = createFromParcel;
            if (parcel.readInt() == 0) {
                friendsRecBlockButtonDto = friendsRecBlockButtonDto2;
                createFromParcel2 = null;
            } else {
                friendsRecBlockButtonDto = friendsRecBlockButtonDto2;
                createFromParcel2 = SocialButtonTypeDto.CREATOR.createFromParcel(parcel);
            }
            SocialButtonTypeDto socialButtonTypeDto2 = createFromParcel2;
            FriendsRecBlockButtonDto friendsRecBlockButtonDto3 = friendsRecBlockButtonDto;
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
            String readString20 = parcel.readString();
            String readString21 = parcel.readString();
            String readString22 = parcel.readString();
            String readString23 = parcel.readString();
            String readString24 = parcel.readString();
            String readString25 = parcel.readString();
            String readString26 = parcel.readString();
            if (parcel.readInt() == 0) {
                socialButtonTypeDto = socialButtonTypeDto2;
                createFromParcel3 = null;
            } else {
                socialButtonTypeDto = socialButtonTypeDto2;
                createFromParcel3 = BdateVisibilityDto.CREATOR.createFromParcel(parcel);
            }
            BdateVisibilityDto bdateVisibilityDto = createFromParcel3;
            BaseCityDto baseCityDto = (BaseCityDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            BaseCountryDto baseCountryDto = (BaseCountryDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            Float valueOf48 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            OwnerStateDto ownerStateDto = (OwnerStateDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            String readString27 = parcel.readString();
            String readString28 = parcel.readString();
            String readString29 = parcel.readString();
            String readString30 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto6 = (BaseBoolIntDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            BaseOwnerCoverDto baseOwnerCoverDto = (BaseOwnerCoverDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            String readString31 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto7 = (BaseBoolIntDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto8 = (BaseBoolIntDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            BaseBoolIntDto baseBoolIntDto9 = (BaseBoolIntDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto10 = (BaseBoolIntDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto11 = (BaseBoolIntDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto12 = (BaseBoolIntDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            UsersUserTypeDto usersUserTypeDto = (UsersUserTypeDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            BaseCropPhotoDto baseCropPhotoDto3 = baseCropPhotoDto;
            SocialButtonTypeDto socialButtonTypeDto3 = socialButtonTypeDto;
            Float f = valueOf48;
            String readString32 = parcel.readString();
            String readString33 = parcel.readString();
            String readString34 = parcel.readString();
            String readString35 = parcel.readString();
            String readString36 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto13 = (BaseBoolIntDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto14 = (BaseBoolIntDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
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
            String readString37 = parcel.readString();
            Boolean bool3 = valueOf2;
            Boolean bool4 = valueOf3;
            Boolean bool5 = valueOf4;
            Boolean bool6 = valueOf5;
            String readString38 = parcel.readString();
            String readString39 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto15 = (BaseBoolIntDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            VideoLiveInfoDto videoLiveInfoDto = (VideoLiveInfoDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto16 = (BaseBoolIntDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString40 = parcel.readString();
            Boolean bool7 = valueOf;
            Boolean bool8 = valueOf6;
            String readString41 = parcel.readString();
            String readString42 = parcel.readString();
            String readString43 = parcel.readString();
            String readString44 = parcel.readString();
            String readString45 = parcel.readString();
            PhotosPhotoDto photosPhotoDto2 = (PhotosPhotoDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                photosPhotoDto = photosPhotoDto2;
                arrayList2 = arrayList;
                userId2 = userId5;
                arrayList3 = null;
            } else {
                photosPhotoDto = photosPhotoDto2;
                int readInt2 = parcel.readInt();
                arrayList2 = arrayList;
                arrayList3 = new ArrayList(readInt2);
                userId2 = userId5;
                int i2 = 0;
                while (i2 != readInt2) {
                    int i3 = readInt2;
                    int readInt3 = parcel.readInt();
                    int i4 = i2;
                    ArrayList arrayList22 = new ArrayList(readInt3);
                    FriendsRecDescriptionGenericDto friendsRecDescriptionGenericDto2 = friendsRecDescriptionGenericDto;
                    int i5 = 0;
                    while (i5 != readInt3) {
                        i5 = bo.b(FriendsUserRecommendationsDto.class, parcel, arrayList22, i5, 1);
                        readInt3 = readInt3;
                    }
                    arrayList3.add(arrayList22);
                    i2 = i4 + 1;
                    readInt2 = i3;
                    friendsRecDescriptionGenericDto = friendsRecDescriptionGenericDto2;
                }
            }
            FriendsRecDescriptionGenericDto friendsRecDescriptionGenericDto3 = friendsRecDescriptionGenericDto;
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                int i6 = 0;
                while (i6 != readInt4) {
                    int i7 = readInt4;
                    int readInt5 = parcel.readInt();
                    ArrayList arrayList23 = arrayList3;
                    ArrayList arrayList24 = new ArrayList(readInt5);
                    int i8 = i6;
                    int i9 = 0;
                    while (i9 != readInt5) {
                        i9 = bo.b(FriendsUserRecommendationsDto.class, parcel, arrayList24, i9, 1);
                        readInt5 = readInt5;
                    }
                    arrayList4.add(arrayList24);
                    i6 = i8 + 1;
                    readInt4 = i7;
                    arrayList3 = arrayList23;
                }
            }
            ArrayList arrayList25 = arrayList3;
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int readInt6 = parcel.readInt();
                arrayList5 = new ArrayList(readInt6);
                int i10 = 0;
                while (i10 != readInt6) {
                    i10 = bo.b(FriendsUserRecommendationsDto.class, parcel, arrayList5, i10, 1);
                    readInt6 = readInt6;
                }
            }
            UserId userId6 = userId2;
            String readString46 = parcel.readString();
            Integer valueOf49 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf7 = null;
            } else {
                valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                userId3 = userId6;
                createFromParcel4 = null;
            } else {
                userId3 = userId6;
                createFromParcel4 = WallDefaultDto.CREATOR.createFromParcel(parcel);
            }
            WallDefaultDto wallDefaultDto = createFromParcel4;
            AudioMusicAwardsDto audioMusicAwardsDto = (AudioMusicAwardsDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
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
            BaseBoolIntDto baseBoolIntDto17 = (BaseBoolIntDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList6 = arrayList5;
                arrayList8 = arrayList4;
                arrayList7 = null;
            } else {
                int readInt7 = parcel.readInt();
                arrayList6 = arrayList5;
                arrayList7 = new ArrayList(readInt7);
                arrayList8 = arrayList4;
                int i11 = 0;
                while (i11 != readInt7) {
                    i11 = bo.b(FriendsUserRecommendationsDto.class, parcel, arrayList7, i11, 1);
                    readInt7 = readInt7;
                }
                baseBoolIntDto17 = baseBoolIntDto17;
            }
            String readString47 = parcel.readString();
            ArrayList arrayList26 = arrayList2;
            ArrayList arrayList27 = arrayList6;
            String readString48 = parcel.readString();
            PhotosPhotoDto photosPhotoDto3 = photosPhotoDto;
            ArrayList arrayList28 = arrayList8;
            String readString49 = parcel.readString();
            String readString50 = parcel.readString();
            String readString51 = parcel.readString();
            String readString52 = parcel.readString();
            String readString53 = parcel.readString();
            String readString54 = parcel.readString();
            String readString55 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto18 = (BaseBoolIntDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf12 = null;
            } else {
                valueOf12 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString56 = parcel.readString();
            Boolean bool9 = valueOf12;
            String readString57 = parcel.readString();
            String readString58 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto19 = baseBoolIntDto17;
            AudioAudioDto audioAudioDto = (AudioAudioDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            Boolean bool10 = valueOf7;
            Boolean bool11 = valueOf8;
            Boolean bool12 = valueOf9;
            Boolean bool13 = valueOf10;
            Boolean bool14 = valueOf11;
            String readString59 = parcel.readString();
            String readString60 = parcel.readString();
            AppsAppMinDto appsAppMinDto = (AppsAppMinDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            UsersLastSeenDto usersLastSeenDto = (UsersLastSeenDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            UsersExportsDto usersExportsDto = (UsersExportsDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            Integer valueOf50 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf51 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf52 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf53 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto baseBoolIntDto20 = (BaseBoolIntDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto21 = (BaseBoolIntDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto22 = (BaseBoolIntDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto23 = (BaseBoolIntDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            UsersOccupationDto usersOccupationDto2 = (UsersOccupationDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                usersOccupationDto = usersOccupationDto2;
                arrayList9 = arrayList7;
                baseBoolIntDto = baseBoolIntDto18;
                arrayList10 = null;
            } else {
                usersOccupationDto = usersOccupationDto2;
                int readInt8 = parcel.readInt();
                arrayList9 = arrayList7;
                arrayList10 = new ArrayList(readInt8);
                baseBoolIntDto = baseBoolIntDto18;
                int i12 = 0;
                while (i12 != readInt8) {
                    i12 = bo.b(FriendsUserRecommendationsDto.class, parcel, arrayList10, i12, 1);
                    readInt8 = readInt8;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList12 = arrayList10;
                arrayList11 = null;
            } else {
                int readInt9 = parcel.readInt();
                arrayList11 = new ArrayList(readInt9);
                arrayList12 = arrayList10;
                int i13 = 0;
                while (i13 != readInt9) {
                    i13 = bo.b(FriendsUserRecommendationsDto.class, parcel, arrayList11, i13, 1);
                    readInt9 = readInt9;
                }
            }
            Integer valueOf54 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto baseBoolIntDto24 = baseBoolIntDto;
            String readString61 = parcel.readString();
            Integer valueOf55 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf56 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString62 = parcel.readString();
            Integer valueOf57 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString63 = parcel.readString();
            ArrayList arrayList29 = arrayList12;
            Integer num2 = valueOf55;
            Integer num3 = valueOf56;
            Integer num4 = valueOf57;
            String readString64 = parcel.readString();
            String readString65 = parcel.readString();
            ArrayList arrayList30 = arrayList11;
            UsersUserRelationDto usersUserRelationDto = (UsersUserRelationDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            UsersUserMinDto usersUserMinDto = (UsersUserMinDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            UsersPersonalDto usersPersonalDto2 = (UsersPersonalDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                usersPersonalDto = usersPersonalDto2;
                num = valueOf54;
                baseBoolIntDto2 = baseBoolIntDto24;
                arrayList13 = null;
            } else {
                usersPersonalDto = usersPersonalDto2;
                int readInt10 = parcel.readInt();
                num = valueOf54;
                arrayList13 = new ArrayList(readInt10);
                baseBoolIntDto2 = baseBoolIntDto24;
                int i14 = 0;
                while (i14 != readInt10) {
                    i14 = bo.b(FriendsUserRecommendationsDto.class, parcel, arrayList13, i14, 1);
                    readInt10 = readInt10;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList15 = arrayList13;
                arrayList14 = null;
            } else {
                int readInt11 = parcel.readInt();
                arrayList14 = new ArrayList(readInt11);
                arrayList15 = arrayList13;
                int i15 = 0;
                while (i15 != readInt11) {
                    i15 = bo.b(FriendsUserRecommendationsDto.class, parcel, arrayList14, i15, 1);
                    readInt11 = readInt11;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList17 = arrayList14;
                arrayList16 = null;
            } else {
                int readInt12 = parcel.readInt();
                arrayList16 = new ArrayList(readInt12);
                arrayList17 = arrayList14;
                int i16 = 0;
                while (i16 != readInt12) {
                    i16 = bo.b(FriendsUserRecommendationsDto.class, parcel, arrayList16, i16, 1);
                    readInt12 = readInt12;
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
            String readString66 = parcel.readString();
            Boolean bool15 = valueOf13;
            UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto2 = (UsersEmployeeWorkingStateDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                usersEmployeeWorkingStateDto = usersEmployeeWorkingStateDto2;
                createFromParcel5 = null;
            } else {
                usersEmployeeWorkingStateDto = usersEmployeeWorkingStateDto2;
                createFromParcel5 = EmployeeMarkDto.CREATOR.createFromParcel(parcel);
            }
            EmployeeMarkDto employeeMarkDto = createFromParcel5;
            UsersRightsLocationDto usersRightsLocationDto = (UsersRightsLocationDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf18 = null;
            } else {
                valueOf18 = Boolean.valueOf(parcel.readInt() != 0);
            }
            UsersEmojiStatusDto usersEmojiStatusDto = (UsersEmojiStatusDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            StatusImageStatusDto statusImageStatusDto = (StatusImageStatusDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            UsersUserCountersDto usersUserCountersDto = (UsersUserCountersDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            UsersPersonalDto usersPersonalDto3 = usersPersonalDto;
            ArrayList arrayList31 = arrayList17;
            Boolean bool16 = valueOf15;
            Boolean bool17 = valueOf16;
            Boolean bool18 = valueOf17;
            UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto3 = usersEmployeeWorkingStateDto;
            String readString67 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto25 = (BaseBoolIntDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf19 = null;
            } else {
                valueOf19 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            BaseBoolIntDto baseBoolIntDto26 = baseBoolIntDto2;
            Boolean bool19 = valueOf18;
            Boolean bool20 = valueOf19;
            String readString68 = parcel.readString();
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
            UsersGiftsTooltipDto usersGiftsTooltipDto2 = (UsersGiftsTooltipDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                usersGiftsTooltipDto = usersGiftsTooltipDto2;
                createFromParcel6 = null;
            } else {
                usersGiftsTooltipDto = usersGiftsTooltipDto2;
                createFromParcel6 = NoIndexDto.CREATOR.createFromParcel(parcel);
            }
            NoIndexDto noIndexDto = createFromParcel6;
            Integer valueOf58 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            MessagesContactDto messagesContactDto2 = (MessagesContactDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf22 = null;
            } else {
                valueOf22 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                messagesContactDto = messagesContactDto2;
                bool = valueOf14;
                arrayList19 = arrayList16;
                arrayList18 = null;
            } else {
                messagesContactDto = messagesContactDto2;
                int readInt13 = parcel.readInt();
                bool = valueOf14;
                arrayList18 = new ArrayList(readInt13);
                arrayList19 = arrayList16;
                int i17 = 0;
                while (i17 != readInt13) {
                    i17 = pm0.b(parcel, arrayList18, i17, 1);
                    readInt13 = readInt13;
                }
            }
            Integer valueOf59 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
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
            Integer num5 = valueOf59;
            UsersUserProfileTypeDto usersUserProfileTypeDto = (UsersUserProfileTypeDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            UsersCanNotCallReasonDto usersCanNotCallReasonDto = (UsersCanNotCallReasonDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
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
            BaseImageDto baseImageDto2 = (BaseImageDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                baseImageDto = baseImageDto2;
                arrayList20 = arrayList18;
                bool2 = valueOf23;
                arrayList21 = null;
            } else {
                baseImageDto = baseImageDto2;
                int readInt14 = parcel.readInt();
                arrayList20 = arrayList18;
                arrayList21 = new ArrayList(readInt14);
                bool2 = valueOf23;
                int i18 = 0;
                while (i18 != readInt14) {
                    i18 = bo.b(FriendsUserRecommendationsDto.class, parcel, arrayList21, i18, 1);
                    readInt14 = readInt14;
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
            if (parcel.readInt() == 0) {
                valueOf34 = null;
            } else {
                valueOf34 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            Integer num6 = valueOf50;
            Integer num7 = valueOf51;
            Integer num8 = valueOf52;
            Integer num9 = valueOf53;
            UsersOccupationDto usersOccupationDto3 = usersOccupationDto;
            ArrayList arrayList32 = arrayList15;
            Boolean bool21 = bool;
            Boolean bool22 = bool2;
            Boolean bool23 = valueOf29;
            Boolean bool24 = valueOf30;
            Boolean bool25 = valueOf31;
            Boolean bool26 = valueOf32;
            Boolean bool27 = valueOf33;
            Boolean bool28 = valueOf34;
            ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                valueOf35 = null;
            } else {
                valueOf35 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf60 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf61 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf36 = null;
            } else {
                valueOf36 = Boolean.valueOf(parcel.readInt() != 0);
            }
            UsersPromotionAllowanceDto usersPromotionAllowanceDto = (UsersPromotionAllowanceDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf37 = null;
            } else {
                valueOf37 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf62 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf38 = null;
            } else {
                valueOf38 = Boolean.valueOf(parcel.readInt() != 0);
            }
            MessagesEduEducationalProfileDto messagesEduEducationalProfileDto = (MessagesEduEducationalProfileDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            BaseAPlusMarkDto baseAPlusMarkDto = (BaseAPlusMarkDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
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
            UsersDonutDto usersDonutDto = (UsersDonutDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            String readString69 = parcel.readString();
            String readString70 = parcel.readString();
            UsersOnlineInfoDto usersOnlineInfoDto = (UsersOnlineInfoDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto27 = (BaseBoolIntDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto28 = (BaseBoolIntDto) parcel.readParcelable(FriendsUserRecommendationsDto.class.getClassLoader());
            Integer valueOf63 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString71 = parcel.readString();
            Integer valueOf64 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
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
                valueOf44 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FriendsUserRecommendationsDto(userId3, friendsRecDescriptionGenericDto3, readString, valueOf45, valueOf46, readString2, readString3, friendsRequestsMutualDto, baseSexDto, readString4, readString5, readString6, readString7, readString8, valueOf47, arrayList26, friendsFriendStatusStatusDto, baseBoolIntDto3, baseBoolIntDto4, baseBoolIntDto5, readString9, baseCropPhotoDto3, friendsRecBlockButtonDto3, socialButtonTypeDto3, readString10, readString11, readString12, readString13, readString14, readString15, readString16, readString17, readString18, readString19, readString20, readString21, readString22, readString23, readString24, readString25, readString26, bdateVisibilityDto, baseCityDto, baseCountryDto, f, ownerStateDto, readString27, readString28, readString29, readString30, baseBoolIntDto6, baseOwnerCoverDto, readString31, baseBoolIntDto7, baseBoolIntDto8, bool7, baseBoolIntDto9, baseBoolIntDto10, baseBoolIntDto11, baseBoolIntDto12, usersUserTypeDto, readString32, readString33, readString34, readString35, readString36, baseBoolIntDto13, baseBoolIntDto14, bool3, bool4, bool5, bool6, readString37, readString38, readString39, baseBoolIntDto15, videoLiveInfoDto, baseBoolIntDto16, bool8, readString40, readString41, readString42, readString43, readString44, readString45, photosPhotoDto3, arrayList25, arrayList28, arrayList27, readString46, valueOf49, bool10, wallDefaultDto, audioMusicAwardsDto, bool11, bool12, bool13, bool14, baseBoolIntDto19, arrayList9, readString47, readString48, readString49, readString50, readString51, readString52, readString53, readString54, readString55, baseBoolIntDto26, bool9, readString56, readString57, readString58, audioAudioDto, readString59, readString60, appsAppMinDto, usersLastSeenDto, usersExportsDto, num6, num7, num8, num9, baseBoolIntDto20, baseBoolIntDto21, baseBoolIntDto22, baseBoolIntDto23, usersOccupationDto3, arrayList29, arrayList30, num, readString61, num2, num3, readString62, num4, readString63, readString64, readString65, usersUserRelationDto, usersUserMinDto, usersPersonalDto3, arrayList32, arrayList31, arrayList19, bool15, bool21, bool16, bool17, bool18, readString66, usersEmployeeWorkingStateDto3, employeeMarkDto, usersRightsLocationDto, bool19, usersEmojiStatusDto, statusImageStatusDto, usersUserCountersDto, readString67, baseBoolIntDto25, bool20, createStringArrayList, readString68, valueOf20, valueOf21, usersGiftsTooltipDto, noIndexDto, valueOf58, messagesContactDto, valueOf22, arrayList20, num5, bool22, valueOf24, usersUserProfileTypeDto, usersCanNotCallReasonDto, valueOf25, valueOf26, baseImageDto, arrayList21, valueOf27, valueOf28, bool23, bool24, bool25, bool26, bool27, bool28, createStringArrayList2, createStringArrayList3, valueOf35, valueOf60, valueOf61, valueOf36, usersPromotionAllowanceDto, valueOf37, valueOf62, valueOf38, messagesEduEducationalProfileDto, baseAPlusMarkDto, valueOf39, valueOf40, valueOf41, usersDonutDto, readString69, readString70, usersOnlineInfoDto, baseBoolIntDto27, baseBoolIntDto28, valueOf63, readString71, valueOf64, valueOf42, valueOf43, valueOf44);
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsUserRecommendationsDto[] newArray(int i) {
            return new FriendsUserRecommendationsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FriendsUserRecommendationsDto(UserId userId, FriendsRecDescriptionGenericDto friendsRecDescriptionGenericDto, String str, Long l, Integer num, String str2, String str3, FriendsRequestsMutualDto friendsRequestsMutualDto, BaseSexDto baseSexDto, String str4, String str5, String str6, String str7, String str8, Integer num2, List<? extends FriendsRecDescriptionGenericDto> list, FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, String str9, BaseCropPhotoDto baseCropPhotoDto, FriendsRecBlockButtonDto friendsRecBlockButtonDto, SocialButtonTypeDto socialButtonTypeDto, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, BdateVisibilityDto bdateVisibilityDto, BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, Float f, OwnerStateDto ownerStateDto, String str27, String str28, String str29, String str30, BaseBoolIntDto baseBoolIntDto4, BaseOwnerCoverDto baseOwnerCoverDto, String str31, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, Boolean bool, BaseBoolIntDto baseBoolIntDto7, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, BaseBoolIntDto baseBoolIntDto10, UsersUserTypeDto usersUserTypeDto, String str32, String str33, String str34, String str35, String str36, BaseBoolIntDto baseBoolIntDto11, BaseBoolIntDto baseBoolIntDto12, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str37, String str38, String str39, BaseBoolIntDto baseBoolIntDto13, VideoLiveInfoDto videoLiveInfoDto, BaseBoolIntDto baseBoolIntDto14, Boolean bool6, String str40, String str41, String str42, String str43, String str44, String str45, PhotosPhotoDto photosPhotoDto, List<? extends List<UsersProfileButtonDto>> list2, List<? extends List<UsersProfileButtonDto>> list3, List<UsersProfileButtonDto> list4, String str46, Integer num3, Boolean bool7, WallDefaultDto wallDefaultDto, AudioMusicAwardsDto audioMusicAwardsDto, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, BaseBoolIntDto baseBoolIntDto15, List<BaseOwnerButtonDto> list5, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, BaseBoolIntDto baseBoolIntDto16, Boolean bool12, String str56, String str57, String str58, AudioAudioDto audioAudioDto, String str59, String str60, AppsAppMinDto appsAppMinDto, UsersLastSeenDto usersLastSeenDto, UsersExportsDto usersExportsDto, Integer num4, Integer num5, Integer num6, Integer num7, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, BaseBoolIntDto baseBoolIntDto19, BaseBoolIntDto baseBoolIntDto20, UsersOccupationDto usersOccupationDto, List<UsersCareerDto> list6, List<UsersMilitaryDto> list7, Integer num8, String str61, Integer num9, Integer num10, String str62, Integer num11, String str63, String str64, String str65, UsersUserRelationDto usersUserRelationDto, UsersUserMinDto usersUserMinDto, UsersPersonalDto usersPersonalDto, List<UsersUniversityDto> list8, List<UsersSchoolDto> list9, List<UsersRelativeDto> list10, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, String str66, UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto, EmployeeMarkDto employeeMarkDto, UsersRightsLocationDto usersRightsLocationDto, Boolean bool18, UsersEmojiStatusDto usersEmojiStatusDto, StatusImageStatusDto statusImageStatusDto, UsersUserCountersDto usersUserCountersDto, String str67, BaseBoolIntDto baseBoolIntDto21, Boolean bool19, List<String> list11, String str68, Boolean bool20, Boolean bool21, UsersGiftsTooltipDto usersGiftsTooltipDto, NoIndexDto noIndexDto, Integer num12, MessagesContactDto messagesContactDto, Boolean bool22, List<Integer> list12, Integer num13, Boolean bool23, Boolean bool24, UsersUserProfileTypeDto usersUserProfileTypeDto, UsersCanNotCallReasonDto usersCanNotCallReasonDto, Boolean bool25, Boolean bool26, BaseImageDto baseImageDto, List<CallsCustomNameForCallDto> list13, Boolean bool27, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, Boolean bool33, Boolean bool34, List<String> list14, List<String> list15, Boolean bool35, Integer num14, Integer num15, Boolean bool36, UsersPromotionAllowanceDto usersPromotionAllowanceDto, Boolean bool37, Integer num16, Boolean bool38, MessagesEduEducationalProfileDto messagesEduEducationalProfileDto, BaseAPlusMarkDto baseAPlusMarkDto, Boolean bool39, Boolean bool40, Boolean bool41, UsersDonutDto usersDonutDto, String str69, String str70, UsersOnlineInfoDto usersOnlineInfoDto, BaseBoolIntDto baseBoolIntDto22, BaseBoolIntDto baseBoolIntDto23, Integer num17, String str71, Integer num18, Boolean bool42, Boolean bool43, Boolean bool44) {
        this.id = userId;
        this.description = friendsRecDescriptionGenericDto;
        this.recommendationState = str;
        this.friendsGenerationId = l;
        this.friendsRecommendationSource = num;
        this.firstName = str2;
        this.lastName = str3;
        this.mutual = friendsRequestsMutualDto;
        this.sex = baseSexDto;
        this.photo100 = str4;
        this.photo200 = str5;
        this.photo400Orig = str6;
        this.photo400 = str7;
        this.photoBase = str8;
        this.commonCount = num2;
        this.descriptions = list;
        this.friendStatus = friendsFriendStatusStatusDto;
        this.verified = baseBoolIntDto;
        this.trending = baseBoolIntDto2;
        this.canWritePrivateMessage = baseBoolIntDto3;
        this.trackCode = str9;
        this.cropPhoto = baseCropPhotoDto;
        this.button = friendsRecBlockButtonDto;
        this.socialButtonType = socialButtonTypeDto;
        this.firstNameNom = str10;
        this.firstNameGen = str11;
        this.firstNameDat = str12;
        this.firstNameAcc = str13;
        this.firstNameIns = str14;
        this.firstNameAbl = str15;
        this.lastNameNom = str16;
        this.lastNameGen = str17;
        this.lastNameDat = str18;
        this.lastNameAcc = str19;
        this.lastNameIns = str20;
        this.lastNameAbl = str21;
        this.nickname = str22;
        this.maidenName = str23;
        this.contactName = str24;
        this.domain = str25;
        this.bdate = str26;
        this.bdateVisibility = bdateVisibilityDto;
        this.city = baseCityDto;
        this.country = baseCountryDto;
        this.timezone = f;
        this.ownerState = ownerStateDto;
        this.photoMax = str27;
        this.photo200Orig = str28;
        this.photoMaxOrig = str29;
        this.photoId = str30;
        this.hasPhoto = baseBoolIntDto4;
        this.cover = baseOwnerCoverDto;
        this.photoAvgColor = str31;
        this.hasMobile = baseBoolIntDto5;
        this.isFriend = baseBoolIntDto6;
        this.isBestFriend = bool;
        this.wallComments = baseBoolIntDto7;
        this.canPost = baseBoolIntDto8;
        this.canSeeAllPosts = baseBoolIntDto9;
        this.canSeeAudio = baseBoolIntDto10;
        this.type = usersUserTypeDto;
        this.email = str32;
        this.skype = str33;
        this.facebook = str34;
        this.facebookName = str35;
        this.twitter = str36;
        this.isAdult = baseBoolIntDto11;
        this.isSubscribed = baseBoolIntDto12;
        this.isSubscribedStories = bool2;
        this.canSubscribeStories = bool3;
        this.canAskQuestion = bool4;
        this.canAskAnonymous = bool5;
        this.subscriptionCountry = str37;
        this.livejournal = str38;
        this.instagram = str39;
        this.test = baseBoolIntDto13;
        this.videoLive = videoLiveInfoDto;
        this.isVideoLiveNotificationsBlocked = baseBoolIntDto14;
        this.isService = bool6;
        this.serviceDescription = str40;
        this.photoRec = str41;
        this.photoMedium = str42;
        this.photoMediumRec = str43;
        this.photo = str44;
        this.photoBig = str45;
        this.photoMaxSize = photosPhotoDto;
        this.profileButtons = list2;
        this.profileButtonsTablet = list3;
        this.thirdPartyButtons = list4;
        this.language = str46;
        this.storiesArchiveCount = num3;
        this.hasUnseenStories = bool7;
        this.wallDefault = wallDefaultDto;
        this.musicAwards = audioMusicAwardsDto;
        this.canCall = bool8;
        this.canCallFromGroup = bool9;
        this.canInviteAsVoiceroomsSpeaker = bool10;
        this.canSeeWishes = bool11;
        this.canSeeGifts = baseBoolIntDto15;
        this.buttons = list5;
        this.interests = str47;
        this.books = str48;
        this.tv = str49;
        this.quotes = str50;
        this.about = str51;
        this.games = str52;
        this.movies = str53;
        this.activities = str54;
        this.music = str55;
        this.canSendFriendRequest = baseBoolIntDto16;
        this.canBeInvitedGroup = bool12;
        this.mobilePhone = str56;
        this.homePhone = str57;
        this.site = str58;
        this.statusAudio = audioAudioDto;
        this.status = str59;
        this.activity = str60;
        this.statusApp = appsAppMinDto;
        this.lastSeen = usersLastSeenDto;
        this.exports = usersExportsDto;
        this.followersCount = num4;
        this.videoLiveLevel = num5;
        this.videoLiveCount = num6;
        this.clipsCount = num7;
        this.blacklisted = baseBoolIntDto17;
        this.blacklistedByMe = baseBoolIntDto18;
        this.isFavorite = baseBoolIntDto19;
        this.isHiddenFromFeed = baseBoolIntDto20;
        this.occupation = usersOccupationDto;
        this.career = list6;
        this.military = list7;
        this.university = num8;
        this.universityName = str61;
        this.universityGroupId = num9;
        this.faculty = num10;
        this.facultyName = str62;
        this.graduation = num11;
        this.educationForm = str63;
        this.educationStatus = str64;
        this.homeTown = str65;
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
        this.sysUsername = str66;
        this.employeeWorkingState = usersEmployeeWorkingStateDto;
        this.employeeMark = employeeMarkDto;
        this.rightsLocation = usersRightsLocationDto;
        this.canInviteToChats = bool18;
        this.emojiStatus = usersEmojiStatusDto;
        this.imageStatus = statusImageStatusDto;
        this.counters = usersUserCountersDto;
        this.accessKey = str67;
        this.canUploadDoc = baseBoolIntDto21;
        this.canBan = bool19;
        this.eduDetails = list11;
        this.hash = str68;
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
        this.screenName = str69;
        this.photo50 = str70;
        this.onlineInfo = usersOnlineInfoDto;
        this.online = baseBoolIntDto22;
        this.onlineMobile = baseBoolIntDto23;
        this.onlineApp = num17;
        this.deactivated = str71;
        this.hidden = num18;
        this.canAccessClosed = bool42;
        this.isClosed = bool43;
        this.isCached = bool44;
    }

    public final BaseCountryDto B() {
        return this.country;
    }

    public final Boolean B1() {
        return this.isService;
    }

    public final BaseCropPhotoDto C() {
        return this.cropPhoto;
    }

    public final String D() {
        return this.deactivated;
    }

    public final String D0() {
        return this.lastNameDat;
    }

    public final Boolean D1() {
        return this.isServiceAccount;
    }

    public final Boolean E1() {
        return this.isVerified;
    }

    public final FriendsRecDescriptionGenericDto F() {
        return this.description;
    }

    public final String F0() {
        return this.lastNameGen;
    }

    public final List<FriendsRecDescriptionGenericDto> G() {
        return this.descriptions;
    }

    public final String H0() {
        return this.lastNameNom;
    }

    public final String K() {
        return this.domain;
    }

    public final String K0() {
        return this.mobilePhone;
    }

    public final String M() {
        return this.firstName;
    }

    public final FriendsRequestsMutualDto N0() {
        return this.mutual;
    }

    public final UsersOccupationDto P0() {
        return this.occupation;
    }

    public final String R() {
        return this.firstNameAcc;
    }

    public final UsersOnlineInfoDto S0() {
        return this.onlineInfo;
    }

    public final String T() {
        return this.firstNameDat;
    }

    public final String U0() {
        return this.photo100;
    }

    public final String V0() {
        return this.photo200;
    }

    public final String W() {
        return this.firstNameGen;
    }

    public final String Z() {
        return this.firstNameNom;
    }

    public final FriendsFriendStatusStatusDto a0() {
        return this.friendStatus;
    }

    public final String b1() {
        return this.photo400;
    }

    public final String d() {
        return this.bdate;
    }

    public final String d1() {
        return this.photo50;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BaseBoolIntDto e() {
        return this.blacklisted;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsUserRecommendationsDto)) {
            return false;
        }
        FriendsUserRecommendationsDto friendsUserRecommendationsDto = (FriendsUserRecommendationsDto) obj;
        return epx.f(this.id, friendsUserRecommendationsDto.id) && epx.f(this.description, friendsUserRecommendationsDto.description) && epx.f(this.recommendationState, friendsUserRecommendationsDto.recommendationState) && epx.f(this.friendsGenerationId, friendsUserRecommendationsDto.friendsGenerationId) && epx.f(this.friendsRecommendationSource, friendsUserRecommendationsDto.friendsRecommendationSource) && epx.f(this.firstName, friendsUserRecommendationsDto.firstName) && epx.f(this.lastName, friendsUserRecommendationsDto.lastName) && epx.f(this.mutual, friendsUserRecommendationsDto.mutual) && this.sex == friendsUserRecommendationsDto.sex && epx.f(this.photo100, friendsUserRecommendationsDto.photo100) && epx.f(this.photo200, friendsUserRecommendationsDto.photo200) && epx.f(this.photo400Orig, friendsUserRecommendationsDto.photo400Orig) && epx.f(this.photo400, friendsUserRecommendationsDto.photo400) && epx.f(this.photoBase, friendsUserRecommendationsDto.photoBase) && epx.f(this.commonCount, friendsUserRecommendationsDto.commonCount) && epx.f(this.descriptions, friendsUserRecommendationsDto.descriptions) && this.friendStatus == friendsUserRecommendationsDto.friendStatus && this.verified == friendsUserRecommendationsDto.verified && this.trending == friendsUserRecommendationsDto.trending && this.canWritePrivateMessage == friendsUserRecommendationsDto.canWritePrivateMessage && epx.f(this.trackCode, friendsUserRecommendationsDto.trackCode) && epx.f(this.cropPhoto, friendsUserRecommendationsDto.cropPhoto) && epx.f(this.button, friendsUserRecommendationsDto.button) && this.socialButtonType == friendsUserRecommendationsDto.socialButtonType && epx.f(this.firstNameNom, friendsUserRecommendationsDto.firstNameNom) && epx.f(this.firstNameGen, friendsUserRecommendationsDto.firstNameGen) && epx.f(this.firstNameDat, friendsUserRecommendationsDto.firstNameDat) && epx.f(this.firstNameAcc, friendsUserRecommendationsDto.firstNameAcc) && epx.f(this.firstNameIns, friendsUserRecommendationsDto.firstNameIns) && epx.f(this.firstNameAbl, friendsUserRecommendationsDto.firstNameAbl) && epx.f(this.lastNameNom, friendsUserRecommendationsDto.lastNameNom) && epx.f(this.lastNameGen, friendsUserRecommendationsDto.lastNameGen) && epx.f(this.lastNameDat, friendsUserRecommendationsDto.lastNameDat) && epx.f(this.lastNameAcc, friendsUserRecommendationsDto.lastNameAcc) && epx.f(this.lastNameIns, friendsUserRecommendationsDto.lastNameIns) && epx.f(this.lastNameAbl, friendsUserRecommendationsDto.lastNameAbl) && epx.f(this.nickname, friendsUserRecommendationsDto.nickname) && epx.f(this.maidenName, friendsUserRecommendationsDto.maidenName) && epx.f(this.contactName, friendsUserRecommendationsDto.contactName) && epx.f(this.domain, friendsUserRecommendationsDto.domain) && epx.f(this.bdate, friendsUserRecommendationsDto.bdate) && this.bdateVisibility == friendsUserRecommendationsDto.bdateVisibility && epx.f(this.city, friendsUserRecommendationsDto.city) && epx.f(this.country, friendsUserRecommendationsDto.country) && epx.f(this.timezone, friendsUserRecommendationsDto.timezone) && epx.f(this.ownerState, friendsUserRecommendationsDto.ownerState) && epx.f(this.photoMax, friendsUserRecommendationsDto.photoMax) && epx.f(this.photo200Orig, friendsUserRecommendationsDto.photo200Orig) && epx.f(this.photoMaxOrig, friendsUserRecommendationsDto.photoMaxOrig) && epx.f(this.photoId, friendsUserRecommendationsDto.photoId) && this.hasPhoto == friendsUserRecommendationsDto.hasPhoto && epx.f(this.cover, friendsUserRecommendationsDto.cover) && epx.f(this.photoAvgColor, friendsUserRecommendationsDto.photoAvgColor) && this.hasMobile == friendsUserRecommendationsDto.hasMobile && this.isFriend == friendsUserRecommendationsDto.isFriend && epx.f(this.isBestFriend, friendsUserRecommendationsDto.isBestFriend) && this.wallComments == friendsUserRecommendationsDto.wallComments && this.canPost == friendsUserRecommendationsDto.canPost && this.canSeeAllPosts == friendsUserRecommendationsDto.canSeeAllPosts && this.canSeeAudio == friendsUserRecommendationsDto.canSeeAudio && this.type == friendsUserRecommendationsDto.type && epx.f(this.email, friendsUserRecommendationsDto.email) && epx.f(this.skype, friendsUserRecommendationsDto.skype) && epx.f(this.facebook, friendsUserRecommendationsDto.facebook) && epx.f(this.facebookName, friendsUserRecommendationsDto.facebookName) && epx.f(this.twitter, friendsUserRecommendationsDto.twitter) && this.isAdult == friendsUserRecommendationsDto.isAdult && this.isSubscribed == friendsUserRecommendationsDto.isSubscribed && epx.f(this.isSubscribedStories, friendsUserRecommendationsDto.isSubscribedStories) && epx.f(this.canSubscribeStories, friendsUserRecommendationsDto.canSubscribeStories) && epx.f(this.canAskQuestion, friendsUserRecommendationsDto.canAskQuestion) && epx.f(this.canAskAnonymous, friendsUserRecommendationsDto.canAskAnonymous) && epx.f(this.subscriptionCountry, friendsUserRecommendationsDto.subscriptionCountry) && epx.f(this.livejournal, friendsUserRecommendationsDto.livejournal) && epx.f(this.instagram, friendsUserRecommendationsDto.instagram) && this.test == friendsUserRecommendationsDto.test && epx.f(this.videoLive, friendsUserRecommendationsDto.videoLive) && this.isVideoLiveNotificationsBlocked == friendsUserRecommendationsDto.isVideoLiveNotificationsBlocked && epx.f(this.isService, friendsUserRecommendationsDto.isService) && epx.f(this.serviceDescription, friendsUserRecommendationsDto.serviceDescription) && epx.f(this.photoRec, friendsUserRecommendationsDto.photoRec) && epx.f(this.photoMedium, friendsUserRecommendationsDto.photoMedium) && epx.f(this.photoMediumRec, friendsUserRecommendationsDto.photoMediumRec) && epx.f(this.photo, friendsUserRecommendationsDto.photo) && epx.f(this.photoBig, friendsUserRecommendationsDto.photoBig) && epx.f(this.photoMaxSize, friendsUserRecommendationsDto.photoMaxSize) && epx.f(this.profileButtons, friendsUserRecommendationsDto.profileButtons) && epx.f(this.profileButtonsTablet, friendsUserRecommendationsDto.profileButtonsTablet) && epx.f(this.thirdPartyButtons, friendsUserRecommendationsDto.thirdPartyButtons) && epx.f(this.language, friendsUserRecommendationsDto.language) && epx.f(this.storiesArchiveCount, friendsUserRecommendationsDto.storiesArchiveCount) && epx.f(this.hasUnseenStories, friendsUserRecommendationsDto.hasUnseenStories) && this.wallDefault == friendsUserRecommendationsDto.wallDefault && epx.f(this.musicAwards, friendsUserRecommendationsDto.musicAwards) && epx.f(this.canCall, friendsUserRecommendationsDto.canCall) && epx.f(this.canCallFromGroup, friendsUserRecommendationsDto.canCallFromGroup) && epx.f(this.canInviteAsVoiceroomsSpeaker, friendsUserRecommendationsDto.canInviteAsVoiceroomsSpeaker) && epx.f(this.canSeeWishes, friendsUserRecommendationsDto.canSeeWishes) && this.canSeeGifts == friendsUserRecommendationsDto.canSeeGifts && epx.f(this.buttons, friendsUserRecommendationsDto.buttons) && epx.f(this.interests, friendsUserRecommendationsDto.interests) && epx.f(this.books, friendsUserRecommendationsDto.books) && epx.f(this.tv, friendsUserRecommendationsDto.tv) && epx.f(this.quotes, friendsUserRecommendationsDto.quotes) && epx.f(this.about, friendsUserRecommendationsDto.about) && epx.f(this.games, friendsUserRecommendationsDto.games) && epx.f(this.movies, friendsUserRecommendationsDto.movies) && epx.f(this.activities, friendsUserRecommendationsDto.activities) && epx.f(this.music, friendsUserRecommendationsDto.music) && this.canSendFriendRequest == friendsUserRecommendationsDto.canSendFriendRequest && epx.f(this.canBeInvitedGroup, friendsUserRecommendationsDto.canBeInvitedGroup) && epx.f(this.mobilePhone, friendsUserRecommendationsDto.mobilePhone) && epx.f(this.homePhone, friendsUserRecommendationsDto.homePhone) && epx.f(this.site, friendsUserRecommendationsDto.site) && epx.f(this.statusAudio, friendsUserRecommendationsDto.statusAudio) && epx.f(this.status, friendsUserRecommendationsDto.status) && epx.f(this.activity, friendsUserRecommendationsDto.activity) && epx.f(this.statusApp, friendsUserRecommendationsDto.statusApp) && epx.f(this.lastSeen, friendsUserRecommendationsDto.lastSeen) && epx.f(this.exports, friendsUserRecommendationsDto.exports) && epx.f(this.followersCount, friendsUserRecommendationsDto.followersCount) && epx.f(this.videoLiveLevel, friendsUserRecommendationsDto.videoLiveLevel) && epx.f(this.videoLiveCount, friendsUserRecommendationsDto.videoLiveCount) && epx.f(this.clipsCount, friendsUserRecommendationsDto.clipsCount) && this.blacklisted == friendsUserRecommendationsDto.blacklisted && this.blacklistedByMe == friendsUserRecommendationsDto.blacklistedByMe && this.isFavorite == friendsUserRecommendationsDto.isFavorite && this.isHiddenFromFeed == friendsUserRecommendationsDto.isHiddenFromFeed && epx.f(this.occupation, friendsUserRecommendationsDto.occupation) && epx.f(this.career, friendsUserRecommendationsDto.career) && epx.f(this.military, friendsUserRecommendationsDto.military) && epx.f(this.university, friendsUserRecommendationsDto.university) && epx.f(this.universityName, friendsUserRecommendationsDto.universityName) && epx.f(this.universityGroupId, friendsUserRecommendationsDto.universityGroupId) && epx.f(this.faculty, friendsUserRecommendationsDto.faculty) && epx.f(this.facultyName, friendsUserRecommendationsDto.facultyName) && epx.f(this.graduation, friendsUserRecommendationsDto.graduation) && epx.f(this.educationForm, friendsUserRecommendationsDto.educationForm) && epx.f(this.educationStatus, friendsUserRecommendationsDto.educationStatus) && epx.f(this.homeTown, friendsUserRecommendationsDto.homeTown) && this.relation == friendsUserRecommendationsDto.relation && epx.f(this.relationPartner, friendsUserRecommendationsDto.relationPartner) && epx.f(this.personal, friendsUserRecommendationsDto.personal) && epx.f(this.universities, friendsUserRecommendationsDto.universities) && epx.f(this.schools, friendsUserRecommendationsDto.schools) && epx.f(this.relatives, friendsUserRecommendationsDto.relatives) && epx.f(this.isSubscribedPodcasts, friendsUserRecommendationsDto.isSubscribedPodcasts) && epx.f(this.canSubscribePodcasts, friendsUserRecommendationsDto.canSubscribePodcasts) && epx.f(this.canSubscribePosts, friendsUserRecommendationsDto.canSubscribePosts) && epx.f(this.isStudent, friendsUserRecommendationsDto.isStudent) && epx.f(this.hasRights, friendsUserRecommendationsDto.hasRights) && epx.f(this.sysUsername, friendsUserRecommendationsDto.sysUsername) && epx.f(this.employeeWorkingState, friendsUserRecommendationsDto.employeeWorkingState) && this.employeeMark == friendsUserRecommendationsDto.employeeMark && epx.f(this.rightsLocation, friendsUserRecommendationsDto.rightsLocation) && epx.f(this.canInviteToChats, friendsUserRecommendationsDto.canInviteToChats) && epx.f(this.emojiStatus, friendsUserRecommendationsDto.emojiStatus) && epx.f(this.imageStatus, friendsUserRecommendationsDto.imageStatus) && epx.f(this.counters, friendsUserRecommendationsDto.counters) && epx.f(this.accessKey, friendsUserRecommendationsDto.accessKey) && this.canUploadDoc == friendsUserRecommendationsDto.canUploadDoc && epx.f(this.canBan, friendsUserRecommendationsDto.canBan) && epx.f(this.eduDetails, friendsUserRecommendationsDto.eduDetails) && epx.f(this.hash, friendsUserRecommendationsDto.hash) && epx.f(this.hasEmail, friendsUserRecommendationsDto.hasEmail) && epx.f(this.isDead, friendsUserRecommendationsDto.isDead) && epx.f(this.giftsTooltip, friendsUserRecommendationsDto.giftsTooltip) && this.noIndex == friendsUserRecommendationsDto.noIndex && epx.f(this.contactId, friendsUserRecommendationsDto.contactId) && epx.f(this.contact, friendsUserRecommendationsDto.contact) && epx.f(this.isMessageRequest, friendsUserRecommendationsDto.isMessageRequest) && epx.f(this.lists, friendsUserRecommendationsDto.lists) && epx.f(this.friendshipWeeks, friendsUserRecommendationsDto.friendshipWeeks) && epx.f(this.isPersonalAdsEasyPromoteEnabled, friendsUserRecommendationsDto.isPersonalAdsEasyPromoteEnabled) && epx.f(this.needBigMsgBtnInProfile, friendsUserRecommendationsDto.needBigMsgBtnInProfile) && this.profileType == friendsUserRecommendationsDto.profileType && this.canNotCallReason == friendsUserRecommendationsDto.canNotCallReason && epx.f(this.canCallAsCommunity, friendsUserRecommendationsDto.canCallAsCommunity) && epx.f(this.isNft, friendsUserRecommendationsDto.isNft) && epx.f(this.animatedAvatar, friendsUserRecommendationsDto.animatedAvatar) && epx.f(this.customNamesForCalls, friendsUserRecommendationsDto.customNamesForCalls) && epx.f(this.isEsiaVerified, friendsUserRecommendationsDto.isEsiaVerified) && epx.f(this.isEsiaLinked, friendsUserRecommendationsDto.isEsiaLinked) && epx.f(this.isTinkoffVerified, friendsUserRecommendationsDto.isTinkoffVerified) && epx.f(this.isTinkoffLinked, friendsUserRecommendationsDto.isTinkoffLinked) && epx.f(this.isSberVerified, friendsUserRecommendationsDto.isSberVerified) && epx.f(this.isVerified, friendsUserRecommendationsDto.isVerified) && epx.f(this.isFollowersModeOn, friendsUserRecommendationsDto.isFollowersModeOn) && epx.f(this.isTeacher, friendsUserRecommendationsDto.isTeacher) && epx.f(this.oauthLinked, friendsUserRecommendationsDto.oauthLinked) && epx.f(this.oauthVerification, friendsUserRecommendationsDto.oauthVerification) && epx.f(this.isSberLinked, friendsUserRecommendationsDto.isSberLinked) && epx.f(this.ageMark, friendsUserRecommendationsDto.ageMark) && epx.f(this.joined, friendsUserRecommendationsDto.joined) && epx.f(this.isServiceAccount, friendsUserRecommendationsDto.isServiceAccount) && epx.f(this.promotionAllowance, friendsUserRecommendationsDto.promotionAllowance) && epx.f(this.coOwnershipEnabled, friendsUserRecommendationsDto.coOwnershipEnabled) && epx.f(this.ageGroup, friendsUserRecommendationsDto.ageGroup) && epx.f(this.hasRelatedUserPin, friendsUserRecommendationsDto.hasRelatedUserPin) && epx.f(this.educationalProfile, friendsUserRecommendationsDto.educationalProfile) && epx.f(this.aPlusMark, friendsUserRecommendationsDto.aPlusMark) && epx.f(this.isDon, friendsUserRecommendationsDto.isDon) && epx.f(this.isMediaModer, friendsUserRecommendationsDto.isMediaModer) && epx.f(this.isPhotoMapEnabled, friendsUserRecommendationsDto.isPhotoMapEnabled) && epx.f(this.donut, friendsUserRecommendationsDto.donut) && epx.f(this.screenName, friendsUserRecommendationsDto.screenName) && epx.f(this.photo50, friendsUserRecommendationsDto.photo50) && epx.f(this.onlineInfo, friendsUserRecommendationsDto.onlineInfo) && this.online == friendsUserRecommendationsDto.online && this.onlineMobile == friendsUserRecommendationsDto.onlineMobile && epx.f(this.onlineApp, friendsUserRecommendationsDto.onlineApp) && epx.f(this.deactivated, friendsUserRecommendationsDto.deactivated) && epx.f(this.hidden, friendsUserRecommendationsDto.hidden) && epx.f(this.canAccessClosed, friendsUserRecommendationsDto.canAccessClosed) && epx.f(this.isClosed, friendsUserRecommendationsDto.isClosed) && epx.f(this.isCached, friendsUserRecommendationsDto.isCached);
    }

    public final BaseBoolIntDto f() {
        return this.blacklistedByMe;
    }

    public final FriendsRecBlockButtonDto g() {
        return this.button;
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        FriendsRecDescriptionGenericDto friendsRecDescriptionGenericDto = this.description;
        int hashCode2 = (hashCode + (friendsRecDescriptionGenericDto == null ? 0 : friendsRecDescriptionGenericDto.hashCode())) * 31;
        String str = this.recommendationState;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.friendsGenerationId;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.friendsRecommendationSource;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.firstName;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        FriendsRequestsMutualDto friendsRequestsMutualDto = this.mutual;
        int hashCode8 = (hashCode7 + (friendsRequestsMutualDto == null ? 0 : friendsRequestsMutualDto.hashCode())) * 31;
        BaseSexDto baseSexDto = this.sex;
        int hashCode9 = (hashCode8 + (baseSexDto == null ? 0 : baseSexDto.hashCode())) * 31;
        String str4 = this.photo100;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.photo200;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.photo400Orig;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.photo400;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.photoBase;
        int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num2 = this.commonCount;
        int hashCode15 = (hashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<FriendsRecDescriptionGenericDto> list = this.descriptions;
        int hashCode16 = (hashCode15 + (list == null ? 0 : list.hashCode())) * 31;
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto = this.friendStatus;
        int hashCode17 = (hashCode16 + (friendsFriendStatusStatusDto == null ? 0 : friendsFriendStatusStatusDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.verified;
        int hashCode18 = (hashCode17 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.trending;
        int hashCode19 = (hashCode18 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.canWritePrivateMessage;
        int hashCode20 = (hashCode19 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        String str9 = this.trackCode;
        int hashCode21 = (hashCode20 + (str9 == null ? 0 : str9.hashCode())) * 31;
        BaseCropPhotoDto baseCropPhotoDto = this.cropPhoto;
        int hashCode22 = (hashCode21 + (baseCropPhotoDto == null ? 0 : baseCropPhotoDto.hashCode())) * 31;
        FriendsRecBlockButtonDto friendsRecBlockButtonDto = this.button;
        int hashCode23 = (hashCode22 + (friendsRecBlockButtonDto == null ? 0 : friendsRecBlockButtonDto.hashCode())) * 31;
        SocialButtonTypeDto socialButtonTypeDto = this.socialButtonType;
        int hashCode24 = (hashCode23 + (socialButtonTypeDto == null ? 0 : socialButtonTypeDto.hashCode())) * 31;
        String str10 = this.firstNameNom;
        int hashCode25 = (hashCode24 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.firstNameGen;
        int hashCode26 = (hashCode25 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.firstNameDat;
        int hashCode27 = (hashCode26 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.firstNameAcc;
        int hashCode28 = (hashCode27 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.firstNameIns;
        int hashCode29 = (hashCode28 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.firstNameAbl;
        int hashCode30 = (hashCode29 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.lastNameNom;
        int hashCode31 = (hashCode30 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.lastNameGen;
        int hashCode32 = (hashCode31 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.lastNameDat;
        int hashCode33 = (hashCode32 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.lastNameAcc;
        int hashCode34 = (hashCode33 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.lastNameIns;
        int hashCode35 = (hashCode34 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.lastNameAbl;
        int hashCode36 = (hashCode35 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.nickname;
        int hashCode37 = (hashCode36 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.maidenName;
        int hashCode38 = (hashCode37 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.contactName;
        int hashCode39 = (hashCode38 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.domain;
        int hashCode40 = (hashCode39 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.bdate;
        int hashCode41 = (hashCode40 + (str26 == null ? 0 : str26.hashCode())) * 31;
        BdateVisibilityDto bdateVisibilityDto = this.bdateVisibility;
        int hashCode42 = (hashCode41 + (bdateVisibilityDto == null ? 0 : bdateVisibilityDto.hashCode())) * 31;
        BaseCityDto baseCityDto = this.city;
        int hashCode43 = (hashCode42 + (baseCityDto == null ? 0 : baseCityDto.hashCode())) * 31;
        BaseCountryDto baseCountryDto = this.country;
        int hashCode44 = (hashCode43 + (baseCountryDto == null ? 0 : baseCountryDto.hashCode())) * 31;
        Float f = this.timezone;
        int hashCode45 = (hashCode44 + (f == null ? 0 : f.hashCode())) * 31;
        OwnerStateDto ownerStateDto = this.ownerState;
        int hashCode46 = (hashCode45 + (ownerStateDto == null ? 0 : ownerStateDto.hashCode())) * 31;
        String str27 = this.photoMax;
        int hashCode47 = (hashCode46 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.photo200Orig;
        int hashCode48 = (hashCode47 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.photoMaxOrig;
        int hashCode49 = (hashCode48 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.photoId;
        int hashCode50 = (hashCode49 + (str30 == null ? 0 : str30.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.hasPhoto;
        int hashCode51 = (hashCode50 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        BaseOwnerCoverDto baseOwnerCoverDto = this.cover;
        int hashCode52 = (hashCode51 + (baseOwnerCoverDto == null ? 0 : baseOwnerCoverDto.hashCode())) * 31;
        String str31 = this.photoAvgColor;
        int hashCode53 = (hashCode52 + (str31 == null ? 0 : str31.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto5 = this.hasMobile;
        int hashCode54 = (hashCode53 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto6 = this.isFriend;
        int hashCode55 = (hashCode54 + (baseBoolIntDto6 == null ? 0 : baseBoolIntDto6.hashCode())) * 31;
        Boolean bool = this.isBestFriend;
        int hashCode56 = (hashCode55 + (bool == null ? 0 : bool.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto7 = this.wallComments;
        int hashCode57 = (hashCode56 + (baseBoolIntDto7 == null ? 0 : baseBoolIntDto7.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto8 = this.canPost;
        int hashCode58 = (hashCode57 + (baseBoolIntDto8 == null ? 0 : baseBoolIntDto8.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto9 = this.canSeeAllPosts;
        int hashCode59 = (hashCode58 + (baseBoolIntDto9 == null ? 0 : baseBoolIntDto9.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto10 = this.canSeeAudio;
        int hashCode60 = (hashCode59 + (baseBoolIntDto10 == null ? 0 : baseBoolIntDto10.hashCode())) * 31;
        UsersUserTypeDto usersUserTypeDto = this.type;
        int hashCode61 = (hashCode60 + (usersUserTypeDto == null ? 0 : usersUserTypeDto.hashCode())) * 31;
        String str32 = this.email;
        int hashCode62 = (hashCode61 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.skype;
        int hashCode63 = (hashCode62 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.facebook;
        int hashCode64 = (hashCode63 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.facebookName;
        int hashCode65 = (hashCode64 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.twitter;
        int hashCode66 = (hashCode65 + (str36 == null ? 0 : str36.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto11 = this.isAdult;
        int hashCode67 = (hashCode66 + (baseBoolIntDto11 == null ? 0 : baseBoolIntDto11.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto12 = this.isSubscribed;
        int hashCode68 = (hashCode67 + (baseBoolIntDto12 == null ? 0 : baseBoolIntDto12.hashCode())) * 31;
        Boolean bool2 = this.isSubscribedStories;
        int hashCode69 = (hashCode68 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.canSubscribeStories;
        int hashCode70 = (hashCode69 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.canAskQuestion;
        int hashCode71 = (hashCode70 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.canAskAnonymous;
        int hashCode72 = (hashCode71 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str37 = this.subscriptionCountry;
        int hashCode73 = (hashCode72 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.livejournal;
        int hashCode74 = (hashCode73 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.instagram;
        int hashCode75 = (hashCode74 + (str39 == null ? 0 : str39.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto13 = this.test;
        int hashCode76 = (hashCode75 + (baseBoolIntDto13 == null ? 0 : baseBoolIntDto13.hashCode())) * 31;
        VideoLiveInfoDto videoLiveInfoDto = this.videoLive;
        int hashCode77 = (hashCode76 + (videoLiveInfoDto == null ? 0 : videoLiveInfoDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto14 = this.isVideoLiveNotificationsBlocked;
        int hashCode78 = (hashCode77 + (baseBoolIntDto14 == null ? 0 : baseBoolIntDto14.hashCode())) * 31;
        Boolean bool6 = this.isService;
        int hashCode79 = (hashCode78 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str40 = this.serviceDescription;
        int hashCode80 = (hashCode79 + (str40 == null ? 0 : str40.hashCode())) * 31;
        String str41 = this.photoRec;
        int hashCode81 = (hashCode80 + (str41 == null ? 0 : str41.hashCode())) * 31;
        String str42 = this.photoMedium;
        int hashCode82 = (hashCode81 + (str42 == null ? 0 : str42.hashCode())) * 31;
        String str43 = this.photoMediumRec;
        int hashCode83 = (hashCode82 + (str43 == null ? 0 : str43.hashCode())) * 31;
        String str44 = this.photo;
        int hashCode84 = (hashCode83 + (str44 == null ? 0 : str44.hashCode())) * 31;
        String str45 = this.photoBig;
        int hashCode85 = (hashCode84 + (str45 == null ? 0 : str45.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photoMaxSize;
        int hashCode86 = (hashCode85 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        List<List<UsersProfileButtonDto>> list2 = this.profileButtons;
        int hashCode87 = (hashCode86 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<List<UsersProfileButtonDto>> list3 = this.profileButtonsTablet;
        int hashCode88 = (hashCode87 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<UsersProfileButtonDto> list4 = this.thirdPartyButtons;
        int hashCode89 = (hashCode88 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str46 = this.language;
        int hashCode90 = (hashCode89 + (str46 == null ? 0 : str46.hashCode())) * 31;
        Integer num3 = this.storiesArchiveCount;
        int hashCode91 = (hashCode90 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool7 = this.hasUnseenStories;
        int hashCode92 = (hashCode91 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        WallDefaultDto wallDefaultDto = this.wallDefault;
        int hashCode93 = (hashCode92 + (wallDefaultDto == null ? 0 : wallDefaultDto.hashCode())) * 31;
        AudioMusicAwardsDto audioMusicAwardsDto = this.musicAwards;
        int hashCode94 = (hashCode93 + (audioMusicAwardsDto == null ? 0 : audioMusicAwardsDto.hashCode())) * 31;
        Boolean bool8 = this.canCall;
        int hashCode95 = (hashCode94 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.canCallFromGroup;
        int hashCode96 = (hashCode95 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.canInviteAsVoiceroomsSpeaker;
        int hashCode97 = (hashCode96 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.canSeeWishes;
        int hashCode98 = (hashCode97 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto15 = this.canSeeGifts;
        int hashCode99 = (hashCode98 + (baseBoolIntDto15 == null ? 0 : baseBoolIntDto15.hashCode())) * 31;
        List<BaseOwnerButtonDto> list5 = this.buttons;
        int hashCode100 = (hashCode99 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str47 = this.interests;
        int hashCode101 = (hashCode100 + (str47 == null ? 0 : str47.hashCode())) * 31;
        String str48 = this.books;
        int hashCode102 = (hashCode101 + (str48 == null ? 0 : str48.hashCode())) * 31;
        String str49 = this.tv;
        int hashCode103 = (hashCode102 + (str49 == null ? 0 : str49.hashCode())) * 31;
        String str50 = this.quotes;
        int hashCode104 = (hashCode103 + (str50 == null ? 0 : str50.hashCode())) * 31;
        String str51 = this.about;
        int hashCode105 = (hashCode104 + (str51 == null ? 0 : str51.hashCode())) * 31;
        String str52 = this.games;
        int hashCode106 = (hashCode105 + (str52 == null ? 0 : str52.hashCode())) * 31;
        String str53 = this.movies;
        int hashCode107 = (hashCode106 + (str53 == null ? 0 : str53.hashCode())) * 31;
        String str54 = this.activities;
        int hashCode108 = (hashCode107 + (str54 == null ? 0 : str54.hashCode())) * 31;
        String str55 = this.music;
        int hashCode109 = (hashCode108 + (str55 == null ? 0 : str55.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto16 = this.canSendFriendRequest;
        int hashCode110 = (hashCode109 + (baseBoolIntDto16 == null ? 0 : baseBoolIntDto16.hashCode())) * 31;
        Boolean bool12 = this.canBeInvitedGroup;
        int hashCode111 = (hashCode110 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        String str56 = this.mobilePhone;
        int hashCode112 = (hashCode111 + (str56 == null ? 0 : str56.hashCode())) * 31;
        String str57 = this.homePhone;
        int hashCode113 = (hashCode112 + (str57 == null ? 0 : str57.hashCode())) * 31;
        String str58 = this.site;
        int hashCode114 = (hashCode113 + (str58 == null ? 0 : str58.hashCode())) * 31;
        AudioAudioDto audioAudioDto = this.statusAudio;
        int hashCode115 = (hashCode114 + (audioAudioDto == null ? 0 : audioAudioDto.hashCode())) * 31;
        String str59 = this.status;
        int hashCode116 = (hashCode115 + (str59 == null ? 0 : str59.hashCode())) * 31;
        String str60 = this.activity;
        int hashCode117 = (hashCode116 + (str60 == null ? 0 : str60.hashCode())) * 31;
        AppsAppMinDto appsAppMinDto = this.statusApp;
        int hashCode118 = (hashCode117 + (appsAppMinDto == null ? 0 : appsAppMinDto.hashCode())) * 31;
        UsersLastSeenDto usersLastSeenDto = this.lastSeen;
        int hashCode119 = (hashCode118 + (usersLastSeenDto == null ? 0 : usersLastSeenDto.hashCode())) * 31;
        UsersExportsDto usersExportsDto = this.exports;
        int hashCode120 = (hashCode119 + (usersExportsDto == null ? 0 : usersExportsDto.hashCode())) * 31;
        Integer num4 = this.followersCount;
        int hashCode121 = (hashCode120 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.videoLiveLevel;
        int hashCode122 = (hashCode121 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.videoLiveCount;
        int hashCode123 = (hashCode122 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.clipsCount;
        int hashCode124 = (hashCode123 + (num7 == null ? 0 : num7.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto17 = this.blacklisted;
        int hashCode125 = (hashCode124 + (baseBoolIntDto17 == null ? 0 : baseBoolIntDto17.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto18 = this.blacklistedByMe;
        int hashCode126 = (hashCode125 + (baseBoolIntDto18 == null ? 0 : baseBoolIntDto18.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto19 = this.isFavorite;
        int hashCode127 = (hashCode126 + (baseBoolIntDto19 == null ? 0 : baseBoolIntDto19.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto20 = this.isHiddenFromFeed;
        int hashCode128 = (hashCode127 + (baseBoolIntDto20 == null ? 0 : baseBoolIntDto20.hashCode())) * 31;
        UsersOccupationDto usersOccupationDto = this.occupation;
        int hashCode129 = (hashCode128 + (usersOccupationDto == null ? 0 : usersOccupationDto.hashCode())) * 31;
        List<UsersCareerDto> list6 = this.career;
        int hashCode130 = (hashCode129 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<UsersMilitaryDto> list7 = this.military;
        int hashCode131 = (hashCode130 + (list7 == null ? 0 : list7.hashCode())) * 31;
        Integer num8 = this.university;
        int hashCode132 = (hashCode131 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str61 = this.universityName;
        int hashCode133 = (hashCode132 + (str61 == null ? 0 : str61.hashCode())) * 31;
        Integer num9 = this.universityGroupId;
        int hashCode134 = (hashCode133 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.faculty;
        int hashCode135 = (hashCode134 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str62 = this.facultyName;
        int hashCode136 = (hashCode135 + (str62 == null ? 0 : str62.hashCode())) * 31;
        Integer num11 = this.graduation;
        int hashCode137 = (hashCode136 + (num11 == null ? 0 : num11.hashCode())) * 31;
        String str63 = this.educationForm;
        int hashCode138 = (hashCode137 + (str63 == null ? 0 : str63.hashCode())) * 31;
        String str64 = this.educationStatus;
        int hashCode139 = (hashCode138 + (str64 == null ? 0 : str64.hashCode())) * 31;
        String str65 = this.homeTown;
        int hashCode140 = (hashCode139 + (str65 == null ? 0 : str65.hashCode())) * 31;
        UsersUserRelationDto usersUserRelationDto = this.relation;
        int hashCode141 = (hashCode140 + (usersUserRelationDto == null ? 0 : usersUserRelationDto.hashCode())) * 31;
        UsersUserMinDto usersUserMinDto = this.relationPartner;
        int hashCode142 = (hashCode141 + (usersUserMinDto == null ? 0 : usersUserMinDto.hashCode())) * 31;
        UsersPersonalDto usersPersonalDto = this.personal;
        int hashCode143 = (hashCode142 + (usersPersonalDto == null ? 0 : usersPersonalDto.hashCode())) * 31;
        List<UsersUniversityDto> list8 = this.universities;
        int hashCode144 = (hashCode143 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<UsersSchoolDto> list9 = this.schools;
        int hashCode145 = (hashCode144 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<UsersRelativeDto> list10 = this.relatives;
        int hashCode146 = (hashCode145 + (list10 == null ? 0 : list10.hashCode())) * 31;
        Boolean bool13 = this.isSubscribedPodcasts;
        int hashCode147 = (hashCode146 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.canSubscribePodcasts;
        int hashCode148 = (hashCode147 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.canSubscribePosts;
        int hashCode149 = (hashCode148 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.isStudent;
        int hashCode150 = (hashCode149 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        Boolean bool17 = this.hasRights;
        int hashCode151 = (hashCode150 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        String str66 = this.sysUsername;
        int hashCode152 = (hashCode151 + (str66 == null ? 0 : str66.hashCode())) * 31;
        UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto = this.employeeWorkingState;
        int hashCode153 = (hashCode152 + (usersEmployeeWorkingStateDto == null ? 0 : usersEmployeeWorkingStateDto.hashCode())) * 31;
        EmployeeMarkDto employeeMarkDto = this.employeeMark;
        int hashCode154 = (hashCode153 + (employeeMarkDto == null ? 0 : employeeMarkDto.hashCode())) * 31;
        UsersRightsLocationDto usersRightsLocationDto = this.rightsLocation;
        int hashCode155 = (hashCode154 + (usersRightsLocationDto == null ? 0 : usersRightsLocationDto.hashCode())) * 31;
        Boolean bool18 = this.canInviteToChats;
        int hashCode156 = (hashCode155 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        UsersEmojiStatusDto usersEmojiStatusDto = this.emojiStatus;
        int hashCode157 = (hashCode156 + (usersEmojiStatusDto == null ? 0 : usersEmojiStatusDto.hashCode())) * 31;
        StatusImageStatusDto statusImageStatusDto = this.imageStatus;
        int hashCode158 = (hashCode157 + (statusImageStatusDto == null ? 0 : statusImageStatusDto.hashCode())) * 31;
        UsersUserCountersDto usersUserCountersDto = this.counters;
        int hashCode159 = (hashCode158 + (usersUserCountersDto == null ? 0 : usersUserCountersDto.hashCode())) * 31;
        String str67 = this.accessKey;
        int hashCode160 = (hashCode159 + (str67 == null ? 0 : str67.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto21 = this.canUploadDoc;
        int hashCode161 = (hashCode160 + (baseBoolIntDto21 == null ? 0 : baseBoolIntDto21.hashCode())) * 31;
        Boolean bool19 = this.canBan;
        int hashCode162 = (hashCode161 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        List<String> list11 = this.eduDetails;
        int hashCode163 = (hashCode162 + (list11 == null ? 0 : list11.hashCode())) * 31;
        String str68 = this.hash;
        int hashCode164 = (hashCode163 + (str68 == null ? 0 : str68.hashCode())) * 31;
        Boolean bool20 = this.hasEmail;
        int hashCode165 = (hashCode164 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        Boolean bool21 = this.isDead;
        int hashCode166 = (hashCode165 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
        UsersGiftsTooltipDto usersGiftsTooltipDto = this.giftsTooltip;
        int hashCode167 = (hashCode166 + (usersGiftsTooltipDto == null ? 0 : usersGiftsTooltipDto.hashCode())) * 31;
        NoIndexDto noIndexDto = this.noIndex;
        int hashCode168 = (hashCode167 + (noIndexDto == null ? 0 : noIndexDto.hashCode())) * 31;
        Integer num12 = this.contactId;
        int hashCode169 = (hashCode168 + (num12 == null ? 0 : num12.hashCode())) * 31;
        MessagesContactDto messagesContactDto = this.contact;
        int hashCode170 = (hashCode169 + (messagesContactDto == null ? 0 : messagesContactDto.hashCode())) * 31;
        Boolean bool22 = this.isMessageRequest;
        int hashCode171 = (hashCode170 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
        List<Integer> list12 = this.lists;
        int hashCode172 = (hashCode171 + (list12 == null ? 0 : list12.hashCode())) * 31;
        Integer num13 = this.friendshipWeeks;
        int hashCode173 = (hashCode172 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Boolean bool23 = this.isPersonalAdsEasyPromoteEnabled;
        int hashCode174 = (hashCode173 + (bool23 == null ? 0 : bool23.hashCode())) * 31;
        Boolean bool24 = this.needBigMsgBtnInProfile;
        int hashCode175 = (hashCode174 + (bool24 == null ? 0 : bool24.hashCode())) * 31;
        UsersUserProfileTypeDto usersUserProfileTypeDto = this.profileType;
        int hashCode176 = (hashCode175 + (usersUserProfileTypeDto == null ? 0 : usersUserProfileTypeDto.hashCode())) * 31;
        UsersCanNotCallReasonDto usersCanNotCallReasonDto = this.canNotCallReason;
        int hashCode177 = (hashCode176 + (usersCanNotCallReasonDto == null ? 0 : usersCanNotCallReasonDto.hashCode())) * 31;
        Boolean bool25 = this.canCallAsCommunity;
        int hashCode178 = (hashCode177 + (bool25 == null ? 0 : bool25.hashCode())) * 31;
        Boolean bool26 = this.isNft;
        int hashCode179 = (hashCode178 + (bool26 == null ? 0 : bool26.hashCode())) * 31;
        BaseImageDto baseImageDto = this.animatedAvatar;
        int hashCode180 = (hashCode179 + (baseImageDto == null ? 0 : baseImageDto.hashCode())) * 31;
        List<CallsCustomNameForCallDto> list13 = this.customNamesForCalls;
        int hashCode181 = (hashCode180 + (list13 == null ? 0 : list13.hashCode())) * 31;
        Boolean bool27 = this.isEsiaVerified;
        int hashCode182 = (hashCode181 + (bool27 == null ? 0 : bool27.hashCode())) * 31;
        Boolean bool28 = this.isEsiaLinked;
        int hashCode183 = (hashCode182 + (bool28 == null ? 0 : bool28.hashCode())) * 31;
        Boolean bool29 = this.isTinkoffVerified;
        int hashCode184 = (hashCode183 + (bool29 == null ? 0 : bool29.hashCode())) * 31;
        Boolean bool30 = this.isTinkoffLinked;
        int hashCode185 = (hashCode184 + (bool30 == null ? 0 : bool30.hashCode())) * 31;
        Boolean bool31 = this.isSberVerified;
        int hashCode186 = (hashCode185 + (bool31 == null ? 0 : bool31.hashCode())) * 31;
        Boolean bool32 = this.isVerified;
        int hashCode187 = (hashCode186 + (bool32 == null ? 0 : bool32.hashCode())) * 31;
        Boolean bool33 = this.isFollowersModeOn;
        int hashCode188 = (hashCode187 + (bool33 == null ? 0 : bool33.hashCode())) * 31;
        Boolean bool34 = this.isTeacher;
        int hashCode189 = (hashCode188 + (bool34 == null ? 0 : bool34.hashCode())) * 31;
        List<String> list14 = this.oauthLinked;
        int hashCode190 = (hashCode189 + (list14 == null ? 0 : list14.hashCode())) * 31;
        List<String> list15 = this.oauthVerification;
        int hashCode191 = (hashCode190 + (list15 == null ? 0 : list15.hashCode())) * 31;
        Boolean bool35 = this.isSberLinked;
        int hashCode192 = (hashCode191 + (bool35 == null ? 0 : bool35.hashCode())) * 31;
        Integer num14 = this.ageMark;
        int hashCode193 = (hashCode192 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.joined;
        int hashCode194 = (hashCode193 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Boolean bool36 = this.isServiceAccount;
        int hashCode195 = (hashCode194 + (bool36 == null ? 0 : bool36.hashCode())) * 31;
        UsersPromotionAllowanceDto usersPromotionAllowanceDto = this.promotionAllowance;
        int hashCode196 = (hashCode195 + (usersPromotionAllowanceDto == null ? 0 : usersPromotionAllowanceDto.hashCode())) * 31;
        Boolean bool37 = this.coOwnershipEnabled;
        int hashCode197 = (hashCode196 + (bool37 == null ? 0 : bool37.hashCode())) * 31;
        Integer num16 = this.ageGroup;
        int hashCode198 = (hashCode197 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Boolean bool38 = this.hasRelatedUserPin;
        int hashCode199 = (hashCode198 + (bool38 == null ? 0 : bool38.hashCode())) * 31;
        MessagesEduEducationalProfileDto messagesEduEducationalProfileDto = this.educationalProfile;
        int hashCode200 = (hashCode199 + (messagesEduEducationalProfileDto == null ? 0 : messagesEduEducationalProfileDto.hashCode())) * 31;
        BaseAPlusMarkDto baseAPlusMarkDto = this.aPlusMark;
        int hashCode201 = (hashCode200 + (baseAPlusMarkDto == null ? 0 : baseAPlusMarkDto.hashCode())) * 31;
        Boolean bool39 = this.isDon;
        int hashCode202 = (hashCode201 + (bool39 == null ? 0 : bool39.hashCode())) * 31;
        Boolean bool40 = this.isMediaModer;
        int hashCode203 = (hashCode202 + (bool40 == null ? 0 : bool40.hashCode())) * 31;
        Boolean bool41 = this.isPhotoMapEnabled;
        int hashCode204 = (hashCode203 + (bool41 == null ? 0 : bool41.hashCode())) * 31;
        UsersDonutDto usersDonutDto = this.donut;
        int hashCode205 = (hashCode204 + (usersDonutDto == null ? 0 : usersDonutDto.hashCode())) * 31;
        String str69 = this.screenName;
        int hashCode206 = (hashCode205 + (str69 == null ? 0 : str69.hashCode())) * 31;
        String str70 = this.photo50;
        int hashCode207 = (hashCode206 + (str70 == null ? 0 : str70.hashCode())) * 31;
        UsersOnlineInfoDto usersOnlineInfoDto = this.onlineInfo;
        int hashCode208 = (hashCode207 + (usersOnlineInfoDto == null ? 0 : usersOnlineInfoDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto22 = this.online;
        int hashCode209 = (hashCode208 + (baseBoolIntDto22 == null ? 0 : baseBoolIntDto22.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto23 = this.onlineMobile;
        int hashCode210 = (hashCode209 + (baseBoolIntDto23 == null ? 0 : baseBoolIntDto23.hashCode())) * 31;
        Integer num17 = this.onlineApp;
        int hashCode211 = (hashCode210 + (num17 == null ? 0 : num17.hashCode())) * 31;
        String str71 = this.deactivated;
        int hashCode212 = (hashCode211 + (str71 == null ? 0 : str71.hashCode())) * 31;
        Integer num18 = this.hidden;
        int hashCode213 = (hashCode212 + (num18 == null ? 0 : num18.hashCode())) * 31;
        Boolean bool42 = this.canAccessClosed;
        int hashCode214 = (hashCode213 + (bool42 == null ? 0 : bool42.hashCode())) * 31;
        Boolean bool43 = this.isClosed;
        int hashCode215 = (hashCode214 + (bool43 == null ? 0 : bool43.hashCode())) * 31;
        Boolean bool44 = this.isCached;
        return hashCode215 + (bool44 != null ? bool44.hashCode() : 0);
    }

    public final Boolean i() {
        return this.canAccessClosed;
    }

    public final Boolean j() {
        return this.canCall;
    }

    public final Boolean k() {
        return this.canInviteToChats;
    }

    public final BaseBoolIntDto l() {
        return this.canSendFriendRequest;
    }

    public final UserId l0() {
        return this.id;
    }

    public final BaseBoolIntDto n() {
        return this.canWritePrivateMessage;
    }

    public final String n1() {
        return this.photoBase;
    }

    public final BaseCityDto o() {
        return this.city;
    }

    public final String o1() {
        return this.photoMaxOrig;
    }

    public final Integer p() {
        return this.contactId;
    }

    public final String r() {
        return this.trackCode;
    }

    public final BaseSexDto s1() {
        return this.sex;
    }

    public final SocialButtonTypeDto t1() {
        return this.socialButtonType;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsUserRecommendationsDto(id=");
        sb.append(this.id);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", recommendationState=");
        sb.append(this.recommendationState);
        sb.append(", friendsGenerationId=");
        sb.append(this.friendsGenerationId);
        sb.append(", friendsRecommendationSource=");
        sb.append(this.friendsRecommendationSource);
        sb.append(", firstName=");
        sb.append(this.firstName);
        sb.append(", lastName=");
        sb.append(this.lastName);
        sb.append(", mutual=");
        sb.append(this.mutual);
        sb.append(", sex=");
        sb.append(this.sex);
        sb.append(", photo100=");
        sb.append(this.photo100);
        sb.append(", photo200=");
        sb.append(this.photo200);
        sb.append(", photo400Orig=");
        sb.append(this.photo400Orig);
        sb.append(", photo400=");
        sb.append(this.photo400);
        sb.append(", photoBase=");
        sb.append(this.photoBase);
        sb.append(", commonCount=");
        sb.append(this.commonCount);
        sb.append(", descriptions=");
        sb.append(this.descriptions);
        sb.append(", friendStatus=");
        sb.append(this.friendStatus);
        sb.append(", verified=");
        sb.append(this.verified);
        sb.append(", trending=");
        sb.append(this.trending);
        sb.append(", canWritePrivateMessage=");
        sb.append(this.canWritePrivateMessage);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", cropPhoto=");
        sb.append(this.cropPhoto);
        sb.append(", button=");
        sb.append(this.button);
        sb.append(", socialButtonType=");
        sb.append(this.socialButtonType);
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
        sb.append(", photoMax=");
        sb.append(this.photoMax);
        sb.append(", photo200Orig=");
        sb.append(this.photo200Orig);
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
        sb.append(", screenName=");
        sb.append(this.screenName);
        sb.append(", photo50=");
        sb.append(this.photo50);
        sb.append(", onlineInfo=");
        sb.append(this.onlineInfo);
        sb.append(", online=");
        sb.append(this.online);
        sb.append(", onlineMobile=");
        sb.append(this.onlineMobile);
        sb.append(", onlineApp=");
        sb.append(this.onlineApp);
        sb.append(", deactivated=");
        sb.append(this.deactivated);
        sb.append(", hidden=");
        sb.append(this.hidden);
        sb.append(", canAccessClosed=");
        sb.append(this.canAccessClosed);
        sb.append(", isClosed=");
        sb.append(this.isClosed);
        sb.append(", isCached=");
        return tn.a(sb, this.isCached, ')');
    }

    public final String u() {
        return this.contactName;
    }

    public final StatusImageStatusDto v0() {
        return this.imageStatus;
    }

    public final String w0() {
        return this.lastName;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        parcel.writeParcelable(this.description, i);
        parcel.writeString(this.recommendationState);
        Long l = this.friendsGenerationId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        Integer num = this.friendsRecommendationSource;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeParcelable(this.mutual, i);
        parcel.writeParcelable(this.sex, i);
        parcel.writeString(this.photo100);
        parcel.writeString(this.photo200);
        parcel.writeString(this.photo400Orig);
        parcel.writeString(this.photo400);
        parcel.writeString(this.photoBase);
        Integer num2 = this.commonCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        List<FriendsRecDescriptionGenericDto> list = this.descriptions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeParcelable(this.friendStatus, i);
        parcel.writeParcelable(this.verified, i);
        parcel.writeParcelable(this.trending, i);
        parcel.writeParcelable(this.canWritePrivateMessage, i);
        parcel.writeString(this.trackCode);
        parcel.writeParcelable(this.cropPhoto, i);
        FriendsRecBlockButtonDto friendsRecBlockButtonDto = this.button;
        if (friendsRecBlockButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            friendsRecBlockButtonDto.writeToParcel(parcel, i);
        }
        SocialButtonTypeDto socialButtonTypeDto = this.socialButtonType;
        if (socialButtonTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            socialButtonTypeDto.writeToParcel(parcel, i);
        }
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
        Float f2 = this.timezone;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
        parcel.writeParcelable(this.ownerState, i);
        parcel.writeString(this.photoMax);
        parcel.writeString(this.photo200Orig);
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
        parcel.writeParcelable(this.photoMaxSize, i);
        List<List<UsersProfileButtonDto>> list2 = this.profileButtons;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list2, 1);
            while (f3.hasNext()) {
                Iterator a2 = ao.a(parcel, (List) f3.next());
                while (a2.hasNext()) {
                    parcel.writeParcelable((Parcelable) a2.next(), i);
                }
            }
        }
        List<List<UsersProfileButtonDto>> list3 = this.profileButtonsTablet;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list3, 1);
            while (f4.hasNext()) {
                Iterator a3 = ao.a(parcel, (List) f4.next());
                while (a3.hasNext()) {
                    parcel.writeParcelable((Parcelable) a3.next(), i);
                }
            }
        }
        List<UsersProfileButtonDto> list4 = this.thirdPartyButtons;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list4, 1);
            while (f5.hasNext()) {
                parcel.writeParcelable((Parcelable) f5.next(), i);
            }
        }
        parcel.writeString(this.language);
        Integer num3 = this.storiesArchiveCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
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
        List<BaseOwnerButtonDto> list5 = this.buttons;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f6 = dn.f(parcel, list5, 1);
            while (f6.hasNext()) {
                parcel.writeParcelable((Parcelable) f6.next(), i);
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
        Integer num4 = this.followersCount;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Integer num5 = this.videoLiveLevel;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        Integer num6 = this.videoLiveCount;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        Integer num7 = this.clipsCount;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num7);
        }
        parcel.writeParcelable(this.blacklisted, i);
        parcel.writeParcelable(this.blacklistedByMe, i);
        parcel.writeParcelable(this.isFavorite, i);
        parcel.writeParcelable(this.isHiddenFromFeed, i);
        parcel.writeParcelable(this.occupation, i);
        List<UsersCareerDto> list6 = this.career;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f7 = dn.f(parcel, list6, 1);
            while (f7.hasNext()) {
                parcel.writeParcelable((Parcelable) f7.next(), i);
            }
        }
        List<UsersMilitaryDto> list7 = this.military;
        if (list7 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f8 = dn.f(parcel, list7, 1);
            while (f8.hasNext()) {
                parcel.writeParcelable((Parcelable) f8.next(), i);
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
        List<UsersUniversityDto> list8 = this.universities;
        if (list8 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f9 = dn.f(parcel, list8, 1);
            while (f9.hasNext()) {
                parcel.writeParcelable((Parcelable) f9.next(), i);
            }
        }
        List<UsersSchoolDto> list9 = this.schools;
        if (list9 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f10 = dn.f(parcel, list9, 1);
            while (f10.hasNext()) {
                parcel.writeParcelable((Parcelable) f10.next(), i);
            }
        }
        List<UsersRelativeDto> list10 = this.relatives;
        if (list10 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f11 = dn.f(parcel, list10, 1);
            while (f11.hasNext()) {
                parcel.writeParcelable((Parcelable) f11.next(), i);
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
        List<Integer> list11 = this.lists;
        if (list11 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f12 = dn.f(parcel, list11, 1);
            while (f12.hasNext()) {
                parcel.writeInt(((Number) f12.next()).intValue());
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
        List<CallsCustomNameForCallDto> list12 = this.customNamesForCalls;
        if (list12 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f13 = dn.f(parcel, list12, 1);
            while (f13.hasNext()) {
                parcel.writeParcelable((Parcelable) f13.next(), i);
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
        parcel.writeString(this.screenName);
        parcel.writeString(this.photo50);
        parcel.writeParcelable(this.onlineInfo, i);
        parcel.writeParcelable(this.online, i);
        parcel.writeParcelable(this.onlineMobile, i);
        Integer num17 = this.onlineApp;
        if (num17 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num17);
        }
        parcel.writeString(this.deactivated);
        Integer num18 = this.hidden;
        if (num18 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num18);
        }
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

    public final BaseBoolIntDto x1() {
        return this.trending;
    }

    public final String y0() {
        return this.lastNameAcc;
    }

    public final BaseBoolIntDto y1() {
        return this.verified;
    }

    public final Boolean z1() {
        return this.isClosed;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ FriendsUserRecommendationsDto(UserId userId, FriendsRecDescriptionGenericDto friendsRecDescriptionGenericDto, String str, Long l, Integer num, String str2, String str3, FriendsRequestsMutualDto friendsRequestsMutualDto, BaseSexDto baseSexDto, String str4, String str5, String str6, String str7, String str8, Integer num2, List list, FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, String str9, BaseCropPhotoDto baseCropPhotoDto, FriendsRecBlockButtonDto friendsRecBlockButtonDto, SocialButtonTypeDto socialButtonTypeDto, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, BdateVisibilityDto bdateVisibilityDto, BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, Float f, OwnerStateDto ownerStateDto, String str27, String str28, String str29, String str30, BaseBoolIntDto baseBoolIntDto4, BaseOwnerCoverDto baseOwnerCoverDto, String str31, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, Boolean bool, BaseBoolIntDto baseBoolIntDto7, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, BaseBoolIntDto baseBoolIntDto10, UsersUserTypeDto usersUserTypeDto, String str32, String str33, String str34, String str35, String str36, BaseBoolIntDto baseBoolIntDto11, BaseBoolIntDto baseBoolIntDto12, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str37, String str38, String str39, BaseBoolIntDto baseBoolIntDto13, VideoLiveInfoDto videoLiveInfoDto, BaseBoolIntDto baseBoolIntDto14, Boolean bool6, String str40, String str41, String str42, String str43, String str44, String str45, PhotosPhotoDto photosPhotoDto, List list2, List list3, List list4, String str46, Integer num3, Boolean bool7, WallDefaultDto wallDefaultDto, AudioMusicAwardsDto audioMusicAwardsDto, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, BaseBoolIntDto baseBoolIntDto15, List list5, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, BaseBoolIntDto baseBoolIntDto16, Boolean bool12, String str56, String str57, String str58, AudioAudioDto audioAudioDto, String str59, String str60, AppsAppMinDto appsAppMinDto, UsersLastSeenDto usersLastSeenDto, UsersExportsDto usersExportsDto, Integer num4, Integer num5, Integer num6, Integer num7, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, BaseBoolIntDto baseBoolIntDto19, BaseBoolIntDto baseBoolIntDto20, UsersOccupationDto usersOccupationDto, List list6, List list7, Integer num8, String str61, Integer num9, Integer num10, String str62, Integer num11, String str63, String str64, String str65, UsersUserRelationDto usersUserRelationDto, UsersUserMinDto usersUserMinDto, UsersPersonalDto usersPersonalDto, List list8, List list9, List list10, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, String str66, UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto, EmployeeMarkDto employeeMarkDto, UsersRightsLocationDto usersRightsLocationDto, Boolean bool18, UsersEmojiStatusDto usersEmojiStatusDto, StatusImageStatusDto statusImageStatusDto, UsersUserCountersDto usersUserCountersDto, String str67, BaseBoolIntDto baseBoolIntDto21, Boolean bool19, List list11, String str68, Boolean bool20, Boolean bool21, UsersGiftsTooltipDto usersGiftsTooltipDto, NoIndexDto noIndexDto, Integer num12, MessagesContactDto messagesContactDto, Boolean bool22, List list12, Integer num13, Boolean bool23, Boolean bool24, UsersUserProfileTypeDto usersUserProfileTypeDto, UsersCanNotCallReasonDto usersCanNotCallReasonDto, Boolean bool25, Boolean bool26, BaseImageDto baseImageDto, List list13, Boolean bool27, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, Boolean bool33, Boolean bool34, List list14, List list15, Boolean bool35, Integer num14, Integer num15, Boolean bool36, UsersPromotionAllowanceDto usersPromotionAllowanceDto, Boolean bool37, Integer num16, Boolean bool38, MessagesEduEducationalProfileDto messagesEduEducationalProfileDto, BaseAPlusMarkDto baseAPlusMarkDto, Boolean bool39, Boolean bool40, Boolean bool41, UsersDonutDto usersDonutDto, String str69, String str70, UsersOnlineInfoDto usersOnlineInfoDto, BaseBoolIntDto baseBoolIntDto22, BaseBoolIntDto baseBoolIntDto23, Integer num17, String str71, Integer num18, Boolean bool42, Boolean bool43, Boolean bool44, int i, int i2, int i3, int i4, int i5, int i6, int i7, zcl zclVar) {
        this(userId, r165, r9, r10, r11, r12, r13, r14, r15, r8, r166, r167, r168, r169, r7, r17, r19, r21, r23, r25, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r170, r39, r40, r41, r42, r43, r44, r45, r171, r172, r173, r174, r175, r176, r177, r178, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r1, r62, r63, r64, r65, r66, r67, r68, r179, r180, r181, r182, r183, r184, r185, r186, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r2, r85, r86, r87, r88, r89, r90, r91, r187, r188, r189, r190, r191, r192, r193, r194, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r3, r108, r109, r110, r111, r112, r113, r114, r195, r196, r197, r198, r199, r200, r201, r0, (i5 & 32768) != 0 ? null : list8, (i5 & 65536) != 0 ? null : list9, (i5 & 131072) != 0 ? null : list10, (i5 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool13, (i5 & 524288) != 0 ? null : bool14, (i5 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool15, (i5 & 2097152) != 0 ? null : bool16, (i5 & 4194304) != 0 ? null : bool17, (i5 & 8388608) != 0 ? null : str66, (i5 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : usersEmployeeWorkingStateDto, (i5 & 33554432) != 0 ? null : employeeMarkDto, (i5 & 67108864) != 0 ? null : usersRightsLocationDto, (i5 & 134217728) != 0 ? null : bool18, (i5 & 268435456) != 0 ? null : usersEmojiStatusDto, (i5 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : statusImageStatusDto, (i5 & 1073741824) != 0 ? null : usersUserCountersDto, (i5 & Integer.MIN_VALUE) != 0 ? null : str67, (i6 & 1) != 0 ? null : baseBoolIntDto21, (i6 & 2) != 0 ? null : bool19, (i6 & 4) != 0 ? null : list11, (i6 & 8) != 0 ? null : str68, (i6 & 16) != 0 ? null : bool20, (i6 & 32) != 0 ? null : bool21, (i6 & 64) != 0 ? null : usersGiftsTooltipDto, (i6 & 128) != 0 ? null : noIndexDto, (i6 & 256) != 0 ? null : num12, (i6 & 512) != 0 ? null : messagesContactDto, (i6 & 1024) != 0 ? null : bool22, (i6 & 2048) != 0 ? null : list12, (i6 & 4096) != 0 ? null : num13, (i6 & 8192) != 0 ? null : bool23, (i6 & 16384) != 0 ? null : bool24, (i6 & 32768) != 0 ? null : usersUserProfileTypeDto, (i6 & 65536) != 0 ? null : usersCanNotCallReasonDto, (i6 & 131072) != 0 ? null : bool25, (i6 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool26, (i6 & 524288) != 0 ? null : baseImageDto, (i6 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : list13, (i6 & 2097152) != 0 ? null : bool27, (i6 & 4194304) != 0 ? null : bool28, (i6 & 8388608) != 0 ? null : bool29, (i6 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : bool30, (i6 & 33554432) != 0 ? null : bool31, (i6 & 67108864) != 0 ? null : bool32, (i6 & 134217728) != 0 ? null : bool33, (i6 & 268435456) != 0 ? null : bool34, (i6 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : list14, (i6 & 1073741824) != 0 ? null : list15, (i6 & Integer.MIN_VALUE) != 0 ? null : bool35, (i7 & 1) != 0 ? null : num14, (i7 & 2) != 0 ? null : num15, (i7 & 4) != 0 ? null : bool36, (i7 & 8) != 0 ? null : usersPromotionAllowanceDto, (i7 & 16) != 0 ? null : bool37, (i7 & 32) != 0 ? null : num16, (i7 & 64) != 0 ? null : bool38, (i7 & 128) != 0 ? null : messagesEduEducationalProfileDto, (i7 & 256) != 0 ? null : baseAPlusMarkDto, (i7 & 512) != 0 ? null : bool39, (i7 & 1024) != 0 ? null : bool40, (i7 & 2048) != 0 ? null : bool41, (i7 & 4096) != 0 ? null : usersDonutDto, (i7 & 8192) != 0 ? null : str69, (i7 & 16384) != 0 ? null : str70, (i7 & 32768) != 0 ? null : usersOnlineInfoDto, (i7 & 65536) != 0 ? null : baseBoolIntDto22, (i7 & 131072) != 0 ? null : baseBoolIntDto23, (i7 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num17, (i7 & 524288) != 0 ? null : str71, (i7 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num18, (i7 & 2097152) != 0 ? null : bool42, (i7 & 4194304) != 0 ? null : bool43, (i7 & 8388608) != 0 ? null : bool44);
        FriendsRecDescriptionGenericDto friendsRecDescriptionGenericDto2 = (i & 2) != 0 ? null : friendsRecDescriptionGenericDto;
        String str72 = (i & 4) != 0 ? null : str;
        Long l2 = (i & 8) != 0 ? null : l;
        Integer num19 = (i & 16) != 0 ? null : num;
        String str73 = (i & 32) != 0 ? null : str2;
        String str74 = (i & 64) != 0 ? null : str3;
        FriendsRequestsMutualDto friendsRequestsMutualDto2 = (i & 128) != 0 ? null : friendsRequestsMutualDto;
        BaseSexDto baseSexDto2 = (i & 256) != 0 ? null : baseSexDto;
        String str75 = (i & 512) != 0 ? null : str4;
        FriendsRecDescriptionGenericDto friendsRecDescriptionGenericDto3 = friendsRecDescriptionGenericDto2;
        String str76 = (i & 1024) != 0 ? null : str5;
        String str77 = (i & 2048) != 0 ? null : str6;
        String str78 = (i & 4096) != 0 ? null : str7;
        String str79 = (i & 8192) != 0 ? null : str8;
        Integer num20 = (i & 16384) != 0 ? null : num2;
        List list16 = (i & 32768) != 0 ? null : list;
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto2 = (i & 65536) != 0 ? null : friendsFriendStatusStatusDto;
        BaseBoolIntDto baseBoolIntDto24 = (i & 131072) != 0 ? null : baseBoolIntDto;
        BaseBoolIntDto baseBoolIntDto25 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : baseBoolIntDto2;
        BaseBoolIntDto baseBoolIntDto26 = (i & 524288) != 0 ? null : baseBoolIntDto3;
        String str80 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str9;
        BaseCropPhotoDto baseCropPhotoDto2 = (i & 2097152) != 0 ? null : baseCropPhotoDto;
        FriendsRecBlockButtonDto friendsRecBlockButtonDto2 = (i & 4194304) != 0 ? null : friendsRecBlockButtonDto;
        SocialButtonTypeDto socialButtonTypeDto2 = (i & 8388608) != 0 ? null : socialButtonTypeDto;
        String str81 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str10;
        String str82 = (i & 33554432) != 0 ? null : str11;
        String str83 = (i & 67108864) != 0 ? null : str12;
        String str84 = (i & 134217728) != 0 ? null : str13;
        String str85 = (i & 268435456) != 0 ? null : str14;
        String str86 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str15;
        String str87 = (i & 1073741824) != 0 ? null : str16;
        String str88 = (i & Integer.MIN_VALUE) != 0 ? null : str17;
        String str89 = (i2 & 1) != 0 ? null : str18;
        String str90 = (i2 & 2) != 0 ? null : str19;
        String str91 = (i2 & 4) != 0 ? null : str20;
        String str92 = (i2 & 8) != 0 ? null : str21;
        String str93 = (i2 & 16) != 0 ? null : str22;
        String str94 = (i2 & 32) != 0 ? null : str23;
        String str95 = (i2 & 64) != 0 ? null : str24;
        String str96 = str88;
        String str97 = (i2 & 128) != 0 ? null : str25;
        String str98 = (i2 & 256) != 0 ? null : str26;
        BdateVisibilityDto bdateVisibilityDto2 = (i2 & 512) != 0 ? null : bdateVisibilityDto;
        BaseCityDto baseCityDto2 = (i2 & 1024) != 0 ? null : baseCityDto;
        BaseCountryDto baseCountryDto2 = (i2 & 2048) != 0 ? null : baseCountryDto;
        Float f2 = (i2 & 4096) != 0 ? null : f;
        OwnerStateDto ownerStateDto2 = (i2 & 8192) != 0 ? null : ownerStateDto;
        String str99 = (i2 & 16384) != 0 ? null : str27;
        String str100 = (i2 & 32768) != 0 ? null : str28;
        String str101 = (i2 & 65536) != 0 ? null : str29;
        String str102 = (i2 & 131072) != 0 ? null : str30;
        BaseBoolIntDto baseBoolIntDto27 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : baseBoolIntDto4;
        BaseOwnerCoverDto baseOwnerCoverDto2 = (i2 & 524288) != 0 ? null : baseOwnerCoverDto;
        String str103 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str31;
        BaseBoolIntDto baseBoolIntDto28 = (i2 & 2097152) != 0 ? null : baseBoolIntDto5;
        BaseBoolIntDto baseBoolIntDto29 = (i2 & 4194304) != 0 ? null : baseBoolIntDto6;
        Boolean bool45 = (i2 & 8388608) != 0 ? null : bool;
        BaseBoolIntDto baseBoolIntDto30 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : baseBoolIntDto7;
        BaseBoolIntDto baseBoolIntDto31 = (i2 & 33554432) != 0 ? null : baseBoolIntDto8;
        BaseBoolIntDto baseBoolIntDto32 = (i2 & 67108864) != 0 ? null : baseBoolIntDto9;
        BaseBoolIntDto baseBoolIntDto33 = (i2 & 134217728) != 0 ? null : baseBoolIntDto10;
        UsersUserTypeDto usersUserTypeDto2 = (i2 & 268435456) != 0 ? null : usersUserTypeDto;
        String str104 = (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str32;
        String str105 = (i2 & 1073741824) != 0 ? null : str33;
        String str106 = (i2 & Integer.MIN_VALUE) != 0 ? null : str34;
        String str107 = (i3 & 1) != 0 ? null : str35;
        String str108 = (i3 & 2) != 0 ? null : str36;
        BaseBoolIntDto baseBoolIntDto34 = (i3 & 4) != 0 ? null : baseBoolIntDto11;
        BaseBoolIntDto baseBoolIntDto35 = (i3 & 8) != 0 ? null : baseBoolIntDto12;
        Boolean bool46 = (i3 & 16) != 0 ? null : bool2;
        Boolean bool47 = (i3 & 32) != 0 ? null : bool3;
        Boolean bool48 = (i3 & 64) != 0 ? null : bool4;
        String str109 = str99;
        Boolean bool49 = (i3 & 128) != 0 ? null : bool5;
        String str110 = (i3 & 256) != 0 ? null : str37;
        String str111 = (i3 & 512) != 0 ? null : str38;
        String str112 = (i3 & 1024) != 0 ? null : str39;
        BaseBoolIntDto baseBoolIntDto36 = (i3 & 2048) != 0 ? null : baseBoolIntDto13;
        VideoLiveInfoDto videoLiveInfoDto2 = (i3 & 4096) != 0 ? null : videoLiveInfoDto;
        BaseBoolIntDto baseBoolIntDto37 = (i3 & 8192) != 0 ? null : baseBoolIntDto14;
        Boolean bool50 = (i3 & 16384) != 0 ? null : bool6;
        String str113 = (i3 & 32768) != 0 ? null : str40;
        String str114 = (i3 & 65536) != 0 ? null : str41;
        String str115 = (i3 & 131072) != 0 ? null : str42;
        String str116 = (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str43;
        String str117 = (i3 & 524288) != 0 ? null : str44;
        String str118 = (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str45;
        PhotosPhotoDto photosPhotoDto2 = (i3 & 2097152) != 0 ? null : photosPhotoDto;
        List list17 = (i3 & 4194304) != 0 ? null : list2;
        List list18 = (i3 & 8388608) != 0 ? null : list3;
        List list19 = (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : list4;
        String str119 = (i3 & 33554432) != 0 ? null : str46;
        Integer num21 = (i3 & 67108864) != 0 ? null : num3;
        Boolean bool51 = (i3 & 134217728) != 0 ? null : bool7;
        WallDefaultDto wallDefaultDto2 = (i3 & 268435456) != 0 ? null : wallDefaultDto;
        AudioMusicAwardsDto audioMusicAwardsDto2 = (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : audioMusicAwardsDto;
        Boolean bool52 = (i3 & 1073741824) != 0 ? null : bool8;
        Boolean bool53 = (i3 & Integer.MIN_VALUE) != 0 ? null : bool9;
        Boolean bool54 = (i4 & 1) != 0 ? null : bool10;
        Boolean bool55 = (i4 & 2) != 0 ? null : bool11;
        BaseBoolIntDto baseBoolIntDto38 = (i4 & 4) != 0 ? null : baseBoolIntDto15;
        List list20 = (i4 & 8) != 0 ? null : list5;
        String str120 = (i4 & 16) != 0 ? null : str47;
        String str121 = (i4 & 32) != 0 ? null : str48;
        String str122 = (i4 & 64) != 0 ? null : str49;
        Boolean bool56 = bool50;
        String str123 = (i4 & 128) != 0 ? null : str50;
        String str124 = (i4 & 256) != 0 ? null : str51;
        String str125 = (i4 & 512) != 0 ? null : str52;
        String str126 = (i4 & 1024) != 0 ? null : str53;
        String str127 = (i4 & 2048) != 0 ? null : str54;
        String str128 = (i4 & 4096) != 0 ? null : str55;
        BaseBoolIntDto baseBoolIntDto39 = (i4 & 8192) != 0 ? null : baseBoolIntDto16;
        Boolean bool57 = (i4 & 16384) != 0 ? null : bool12;
        String str129 = (i4 & 32768) != 0 ? null : str56;
        String str130 = (i4 & 65536) != 0 ? null : str57;
        String str131 = (i4 & 131072) != 0 ? null : str58;
        AudioAudioDto audioAudioDto2 = (i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : audioAudioDto;
        String str132 = (i4 & 524288) != 0 ? null : str59;
        String str133 = (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str60;
        AppsAppMinDto appsAppMinDto2 = (i4 & 2097152) != 0 ? null : appsAppMinDto;
        UsersLastSeenDto usersLastSeenDto2 = (i4 & 4194304) != 0 ? null : usersLastSeenDto;
        UsersExportsDto usersExportsDto2 = (i4 & 8388608) != 0 ? null : usersExportsDto;
        Integer num22 = (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : num4;
        Integer num23 = (i4 & 33554432) != 0 ? null : num5;
        Integer num24 = (i4 & 67108864) != 0 ? null : num6;
        Integer num25 = (i4 & 134217728) != 0 ? null : num7;
        BaseBoolIntDto baseBoolIntDto40 = (i4 & 268435456) != 0 ? null : baseBoolIntDto17;
        BaseBoolIntDto baseBoolIntDto41 = (i4 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : baseBoolIntDto18;
        BaseBoolIntDto baseBoolIntDto42 = (i4 & 1073741824) != 0 ? null : baseBoolIntDto19;
        BaseBoolIntDto baseBoolIntDto43 = (i4 & Integer.MIN_VALUE) != 0 ? null : baseBoolIntDto20;
        UsersOccupationDto usersOccupationDto2 = (i5 & 1) != 0 ? null : usersOccupationDto;
        List list21 = (i5 & 2) != 0 ? null : list6;
        List list22 = (i5 & 4) != 0 ? null : list7;
        Integer num26 = (i5 & 8) != 0 ? null : num8;
        String str134 = (i5 & 16) != 0 ? null : str61;
        Integer num27 = (i5 & 32) != 0 ? null : num9;
        Integer num28 = (i5 & 64) != 0 ? null : num10;
        Boolean bool58 = bool57;
        String str135 = (i5 & 128) != 0 ? null : str62;
        Integer num29 = (i5 & 256) != 0 ? null : num11;
        String str136 = (i5 & 512) != 0 ? null : str63;
        String str137 = (i5 & 1024) != 0 ? null : str64;
        String str138 = (i5 & 2048) != 0 ? null : str65;
        UsersUserRelationDto usersUserRelationDto2 = (i5 & 4096) != 0 ? null : usersUserRelationDto;
        UsersUserMinDto usersUserMinDto2 = (i5 & 8192) != 0 ? null : usersUserMinDto;
        UsersPersonalDto usersPersonalDto2 = (i5 & 16384) != 0 ? null : usersPersonalDto;
    }
}
