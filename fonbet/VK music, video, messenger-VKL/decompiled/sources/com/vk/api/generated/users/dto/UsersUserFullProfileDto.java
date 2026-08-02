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
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.messages.dto.MessagesContactDto;
import com.vk.api.generated.messagesEdu.dto.MessagesEduEducationalProfileDto;
import com.vk.api.generated.owner.dto.OwnerStateDto;
import com.vk.api.generated.photos.dto.PhotosPhotoAllDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.status.dto.StatusImageStatusDto;
import com.vk.api.generated.status.dto.StatusStatusDto;
import com.vk.api.generated.stories.dto.StoriesUserFullProfileDto;
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

/* compiled from: UsersUserFullProfileDto.kt */
/* loaded from: classes15.dex */
public final class UsersUserFullProfileDto implements Parcelable {
    public static final Parcelable.Creator<UsersUserFullProfileDto> CREATOR = new a();

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

    @pmi0("ads_easy_promote_onboarding_name")
    private final String adsEasyPromoteOnboardingName;

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

    @pmi0("can_see_archived_posts")
    private final Integer canSeeArchivedPosts;

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
    private final List<UsersUserFullProfileCareerDto> career;

    @pmi0("cities")
    private final List<Integer> cities;

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
    private final Object counters;

    @pmi0("countries")
    private final List<Integer> countries;

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

    @pmi0("display_fields")
    private final List<String> displayFields;

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

    @pmi0("extended_status")
    private final StatusStatusDto extendedStatus;

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

    @pmi0("followers_block")
    private final UsersUserFullProfileFollowersBlockDto followersBlock;

    @pmi0("followers_count")
    private final Integer followersCount;

    @pmi0("friend_status")
    private final FriendsFriendStatusStatusDto friendStatus;

    @pmi0("friends")
    private final List<UsersUserFullDto> friends;

    @pmi0("friends_block")
    private final UsersUserFullProfileFriendsBlockDto friendsBlock;

    @pmi0("friends_recommendations")
    private final Object friendsRecommendations;

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

    @pmi0("mutual_friends")
    private final UsersUserFullProfileMutualFriendDto mutualFriends;

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

    @pmi0("occupation_group")
    private final List<GroupsGroupFullDto> occupationGroup;

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

    @pmi0("photos")
    private final PhotosPhotoAllDto photos;

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

    @pmi0("received_throws")
    private final Object receivedThrows;

    @pmi0("relation")
    private final UsersUserRelationDto relation;

    @pmi0("relation_partner")
    private final UsersUserMinDto relationPartner;

    @pmi0("relatives")
    private final List<UsersRelativeDto> relatives;

    @pmi0("relatives_profiles")
    private final List<UsersUserFullDto> relativesProfiles;

    @pmi0("requests_block")
    private final UsersUserFullProfileRequestsBlockDto requestsBlock;

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

    @pmi0("silent_mode_ended_at")
    private final Integer silentModeEndedAt;

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

    @pmi0("stories")
    private final StoriesUserFullProfileDto stories;

    @pmi0("stories_archive_count")
    private final Integer storiesArchiveCount;

    @pmi0("subscription_country")
    private final String subscriptionCountry;

    @pmi0("sys_username")
    private final String sysUsername;

    @pmi0("tabs")
    private final Object tabs;

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
    /* compiled from: UsersUserFullProfileDto.kt */
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

        /* compiled from: UsersUserFullProfileDto.kt */
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
    /* compiled from: UsersUserFullProfileDto.kt */
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

        /* compiled from: UsersUserFullProfileDto.kt */
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
    /* compiled from: UsersUserFullProfileDto.kt */
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

        /* compiled from: UsersUserFullProfileDto.kt */
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
    /* compiled from: UsersUserFullProfileDto.kt */
    public static final class SocialButtonTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SocialButtonTypeDto[] $VALUES;

        @pmi0("add")
        public static final SocialButtonTypeDto ADD;
        public static final Parcelable.Creator<SocialButtonTypeDto> CREATOR;

        @pmi0("follow")
        public static final SocialButtonTypeDto FOLLOW;
        private final String value;

        /* compiled from: UsersUserFullProfileDto.kt */
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
    /* compiled from: UsersUserFullProfileDto.kt */
    public static final class WallDefaultDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ WallDefaultDto[] $VALUES;

        @pmi0("all")
        public static final WallDefaultDto ALL;
        public static final Parcelable.Creator<WallDefaultDto> CREATOR;

        @pmi0("owner")
        public static final WallDefaultDto OWNER;
        private final String value;

        /* compiled from: UsersUserFullProfileDto.kt */
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

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: UsersUserFullProfileDto.kt */
    public static final class a implements Parcelable.Creator<UsersUserFullProfileDto> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r15v0, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r15v1 */
        /* JADX WARN: Type inference failed for: r15v3 */
        @Override // android.os.Parcelable.Creator
        public final UsersUserFullProfileDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Integer num;
            Object obj;
            ?? arrayList4;
            PhotosPhotoAllDto photosPhotoAllDto;
            UsersUserFullProfileMutualFriendDto usersUserFullProfileMutualFriendDto;
            ArrayList arrayList5;
            UserId userId;
            UsersUserFullProfileRequestsBlockDto usersUserFullProfileRequestsBlockDto;
            ArrayList arrayList6;
            ArrayList arrayList7;
            UsersUserFullProfileFollowersBlockDto usersUserFullProfileFollowersBlockDto;
            Object obj2;
            BdateVisibilityDto createFromParcel;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            Boolean valueOf6;
            PhotosPhotoDto photosPhotoDto;
            ArrayList arrayList8;
            ArrayList arrayList9;
            UsersUserFullProfileFriendsBlockDto usersUserFullProfileFriendsBlockDto;
            ArrayList arrayList10;
            ArrayList arrayList11;
            Boolean valueOf7;
            ArrayList arrayList12;
            WallDefaultDto createFromParcel2;
            Boolean valueOf8;
            Boolean valueOf9;
            Boolean valueOf10;
            Boolean valueOf11;
            ArrayList arrayList13;
            ArrayList arrayList14;
            ArrayList arrayList15;
            Boolean valueOf12;
            UsersOccupationDto usersOccupationDto;
            ArrayList arrayList16;
            ArrayList arrayList17;
            UserId userId2;
            UsersPersonalDto usersPersonalDto;
            ArrayList arrayList18;
            ArrayList arrayList19;
            UserId userId3;
            ArrayList arrayList20;
            ArrayList arrayList21;
            ArrayList arrayList22;
            ArrayList arrayList23;
            Boolean valueOf13;
            Boolean valueOf14;
            Boolean valueOf15;
            Boolean valueOf16;
            Boolean valueOf17;
            UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto;
            EmployeeMarkDto createFromParcel3;
            Boolean valueOf18;
            Boolean valueOf19;
            Boolean valueOf20;
            Boolean valueOf21;
            UsersGiftsTooltipDto usersGiftsTooltipDto;
            NoIndexDto createFromParcel4;
            Boolean valueOf22;
            MessagesContactDto messagesContactDto;
            Boolean bool;
            ArrayList arrayList24;
            UserId userId4;
            Boolean valueOf23;
            Boolean valueOf24;
            Boolean valueOf25;
            BaseImageDto baseImageDto;
            ArrayList arrayList25;
            ArrayList arrayList26;
            UsersUserProfileTypeDto usersUserProfileTypeDto;
            Boolean valueOf26;
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
            UserId userId5 = (UserId) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(UsersUserFullProfileCareerDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = pm0.b(parcel, arrayList2, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                num = null;
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = pm0.b(parcel, arrayList3, i3, 1);
                }
                num = null;
            }
            ArrayList arrayList27 = arrayList2;
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            Integer valueOf44 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                obj = num;
            } else {
                obj = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString = parcel.readString();
            Integer valueOf45 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList4 = num;
            } else {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = bo.b(UsersUserFullProfileDto.class, parcel, arrayList4, i4, 1);
                }
            }
            StatusStatusDto createFromParcel5 = parcel.readInt() == 0 ? null : StatusStatusDto.CREATOR.createFromParcel(parcel);
            PhotosPhotoAllDto createFromParcel6 = parcel.readInt() == 0 ? null : PhotosPhotoAllDto.CREATOR.createFromParcel(parcel);
            Object readValue = parcel.readValue(UsersUserFullProfileDto.class.getClassLoader());
            UsersUserFullProfileMutualFriendDto createFromParcel7 = parcel.readInt() == 0 ? null : UsersUserFullProfileMutualFriendDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                photosPhotoAllDto = createFromParcel6;
                usersUserFullProfileMutualFriendDto = createFromParcel7;
                userId = userId5;
                arrayList5 = null;
            } else {
                photosPhotoAllDto = createFromParcel6;
                int readInt5 = parcel.readInt();
                usersUserFullProfileMutualFriendDto = createFromParcel7;
                arrayList5 = new ArrayList(readInt5);
                userId = userId5;
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = bo.b(UsersUserFullProfileDto.class, parcel, arrayList5, i5, 1);
                    readInt5 = readInt5;
                }
            }
            UsersUserFullProfileRequestsBlockDto createFromParcel8 = parcel.readInt() == 0 ? null : UsersUserFullProfileRequestsBlockDto.CREATOR.createFromParcel(parcel);
            UsersUserFullProfileFollowersBlockDto createFromParcel9 = parcel.readInt() == 0 ? null : UsersUserFullProfileFollowersBlockDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                usersUserFullProfileRequestsBlockDto = createFromParcel8;
                arrayList6 = arrayList5;
                usersUserFullProfileFollowersBlockDto = createFromParcel9;
                arrayList7 = null;
            } else {
                usersUserFullProfileRequestsBlockDto = createFromParcel8;
                int readInt6 = parcel.readInt();
                arrayList6 = arrayList5;
                arrayList7 = new ArrayList(readInt6);
                usersUserFullProfileFollowersBlockDto = createFromParcel9;
                int i6 = 0;
                while (i6 != readInt6) {
                    i6 = bo.b(UsersUserFullProfileDto.class, parcel, arrayList7, i6, 1);
                    readInt6 = readInt6;
                }
            }
            StoriesUserFullProfileDto createFromParcel10 = parcel.readInt() == 0 ? null : StoriesUserFullProfileDto.CREATOR.createFromParcel(parcel);
            UsersUserFullProfileFriendsBlockDto createFromParcel11 = parcel.readInt() == 0 ? null : UsersUserFullProfileFriendsBlockDto.CREATOR.createFromParcel(parcel);
            Object readValue2 = parcel.readValue(UsersUserFullProfileDto.class.getClassLoader());
            Object readValue3 = parcel.readValue(UsersUserFullProfileDto.class.getClassLoader());
            Object readValue4 = parcel.readValue(UsersUserFullProfileDto.class.getClassLoader());
            ArrayList arrayList28 = arrayList;
            ArrayList arrayList29 = arrayList3;
            Integer num2 = valueOf44;
            ?? r10 = obj;
            Integer num3 = valueOf45;
            List list = arrayList4;
            PhotosPhotoAllDto photosPhotoAllDto2 = photosPhotoAllDto;
            UsersUserFullProfileRequestsBlockDto usersUserFullProfileRequestsBlockDto2 = usersUserFullProfileRequestsBlockDto;
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
            String readString18 = parcel.readString();
            if (parcel.readInt() == 0) {
                obj2 = readValue4;
                createFromParcel = null;
            } else {
                obj2 = readValue4;
                createFromParcel = BdateVisibilityDto.CREATOR.createFromParcel(parcel);
            }
            BdateVisibilityDto bdateVisibilityDto = createFromParcel;
            BaseCityDto baseCityDto = (BaseCityDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            BaseCountryDto baseCountryDto = (BaseCountryDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            Float valueOf46 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            OwnerStateDto ownerStateDto = (OwnerStateDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            String readString19 = parcel.readString();
            String readString20 = parcel.readString();
            String readString21 = parcel.readString();
            String readString22 = parcel.readString();
            String readString23 = parcel.readString();
            String readString24 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            BaseOwnerCoverDto baseOwnerCoverDto = (BaseOwnerCoverDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            String readString25 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto2 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto3 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            BaseBoolIntDto baseBoolIntDto4 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto5 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto6 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto7 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            UsersUserTypeDto usersUserTypeDto = (UsersUserTypeDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            UsersUserFullProfileMutualFriendDto usersUserFullProfileMutualFriendDto2 = usersUserFullProfileMutualFriendDto;
            UsersUserFullProfileFollowersBlockDto usersUserFullProfileFollowersBlockDto2 = usersUserFullProfileFollowersBlockDto;
            Object obj3 = obj2;
            Float f = valueOf46;
            String readString26 = parcel.readString();
            String readString27 = parcel.readString();
            String readString28 = parcel.readString();
            String readString29 = parcel.readString();
            String readString30 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto8 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto9 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
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
            String readString31 = parcel.readString();
            Boolean bool2 = valueOf2;
            Boolean bool3 = valueOf3;
            Boolean bool4 = valueOf4;
            Boolean bool5 = valueOf5;
            String readString32 = parcel.readString();
            String readString33 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto10 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            VideoLiveInfoDto videoLiveInfoDto = (VideoLiveInfoDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto11 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString34 = parcel.readString();
            Boolean bool6 = valueOf;
            Boolean bool7 = valueOf6;
            String readString35 = parcel.readString();
            String readString36 = parcel.readString();
            String readString37 = parcel.readString();
            String readString38 = parcel.readString();
            String readString39 = parcel.readString();
            String readString40 = parcel.readString();
            PhotosPhotoDto photosPhotoDto2 = (PhotosPhotoDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                photosPhotoDto = photosPhotoDto2;
                arrayList8 = arrayList7;
                usersUserFullProfileFriendsBlockDto = createFromParcel11;
                arrayList9 = null;
            } else {
                photosPhotoDto = photosPhotoDto2;
                int readInt7 = parcel.readInt();
                arrayList8 = arrayList7;
                arrayList9 = new ArrayList(readInt7);
                usersUserFullProfileFriendsBlockDto = createFromParcel11;
                int i7 = 0;
                while (i7 != readInt7) {
                    int i8 = readInt7;
                    int readInt8 = parcel.readInt();
                    int i9 = i7;
                    ArrayList arrayList30 = new ArrayList(readInt8);
                    ArrayList arrayList31 = arrayList28;
                    int i10 = 0;
                    while (i10 != readInt8) {
                        i10 = bo.b(UsersUserFullProfileDto.class, parcel, arrayList30, i10, 1);
                        readInt8 = readInt8;
                    }
                    arrayList9.add(arrayList30);
                    i7 = i9 + 1;
                    readInt7 = i8;
                    arrayList28 = arrayList31;
                }
            }
            ArrayList arrayList32 = arrayList28;
            if (parcel.readInt() == 0) {
                arrayList10 = null;
            } else {
                int readInt9 = parcel.readInt();
                arrayList10 = new ArrayList(readInt9);
                int i11 = 0;
                while (i11 != readInt9) {
                    int i12 = readInt9;
                    int readInt10 = parcel.readInt();
                    ArrayList arrayList33 = arrayList9;
                    ArrayList arrayList34 = new ArrayList(readInt10);
                    int i13 = i11;
                    int i14 = 0;
                    while (i14 != readInt10) {
                        i14 = bo.b(UsersUserFullProfileDto.class, parcel, arrayList34, i14, 1);
                        readInt10 = readInt10;
                    }
                    arrayList10.add(arrayList34);
                    i11 = i13 + 1;
                    readInt9 = i12;
                    arrayList9 = arrayList33;
                }
            }
            ArrayList arrayList35 = arrayList9;
            if (parcel.readInt() == 0) {
                arrayList11 = null;
            } else {
                int readInt11 = parcel.readInt();
                arrayList11 = new ArrayList(readInt11);
                int i15 = 0;
                while (i15 != readInt11) {
                    i15 = bo.b(UsersUserFullProfileDto.class, parcel, arrayList11, i15, 1);
                    readInt11 = readInt11;
                }
            }
            ArrayList arrayList36 = arrayList6;
            UsersUserFullProfileFriendsBlockDto usersUserFullProfileFriendsBlockDto2 = usersUserFullProfileFriendsBlockDto;
            String readString41 = parcel.readString();
            Integer valueOf47 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf7 = null;
            } else {
                valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList12 = arrayList36;
                createFromParcel2 = null;
            } else {
                arrayList12 = arrayList36;
                createFromParcel2 = WallDefaultDto.CREATOR.createFromParcel(parcel);
            }
            WallDefaultDto wallDefaultDto = createFromParcel2;
            AudioMusicAwardsDto audioMusicAwardsDto = (AudioMusicAwardsDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
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
            BaseBoolIntDto baseBoolIntDto12 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList13 = arrayList11;
                arrayList15 = arrayList10;
                arrayList14 = null;
            } else {
                int readInt12 = parcel.readInt();
                arrayList13 = arrayList11;
                arrayList14 = new ArrayList(readInt12);
                arrayList15 = arrayList10;
                int i16 = 0;
                while (i16 != readInt12) {
                    i16 = bo.b(UsersUserFullProfileDto.class, parcel, arrayList14, i16, 1);
                    readInt12 = readInt12;
                }
                baseBoolIntDto12 = baseBoolIntDto12;
            }
            String readString42 = parcel.readString();
            UserId userId6 = userId;
            ArrayList arrayList37 = arrayList8;
            ArrayList arrayList38 = arrayList13;
            String readString43 = parcel.readString();
            PhotosPhotoDto photosPhotoDto3 = photosPhotoDto;
            ArrayList arrayList39 = arrayList15;
            String readString44 = parcel.readString();
            String readString45 = parcel.readString();
            String readString46 = parcel.readString();
            String readString47 = parcel.readString();
            String readString48 = parcel.readString();
            String readString49 = parcel.readString();
            String readString50 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto13 = baseBoolIntDto12;
            BaseBoolIntDto baseBoolIntDto14 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto15 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf12 = null;
            } else {
                valueOf12 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString51 = parcel.readString();
            Boolean bool8 = valueOf12;
            String readString52 = parcel.readString();
            String readString53 = parcel.readString();
            AudioAudioDto audioAudioDto = (AudioAudioDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            Boolean bool9 = valueOf7;
            Boolean bool10 = valueOf8;
            Boolean bool11 = valueOf9;
            Boolean bool12 = valueOf10;
            Boolean bool13 = valueOf11;
            String readString54 = parcel.readString();
            String readString55 = parcel.readString();
            AppsAppMinDto appsAppMinDto = (AppsAppMinDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            UsersLastSeenDto usersLastSeenDto = (UsersLastSeenDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            UsersExportsDto usersExportsDto = (UsersExportsDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            BaseCropPhotoDto baseCropPhotoDto = (BaseCropPhotoDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            Integer valueOf48 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf49 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf50 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf51 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto baseBoolIntDto16 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto17 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto18 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto19 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            Integer valueOf52 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            UsersOccupationDto usersOccupationDto2 = (UsersOccupationDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                usersOccupationDto = usersOccupationDto2;
                arrayList16 = arrayList14;
                userId2 = userId6;
                arrayList17 = null;
            } else {
                usersOccupationDto = usersOccupationDto2;
                int readInt13 = parcel.readInt();
                arrayList16 = arrayList14;
                arrayList17 = new ArrayList(readInt13);
                userId2 = userId6;
                int i17 = 0;
                while (i17 != readInt13) {
                    i17 = bo.b(UsersUserFullProfileDto.class, parcel, arrayList17, i17, 1);
                    readInt13 = readInt13;
                }
            }
            Integer valueOf53 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ArrayList arrayList40 = arrayList12;
            ArrayList arrayList41 = arrayList16;
            String readString56 = parcel.readString();
            Integer valueOf54 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf55 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString57 = parcel.readString();
            Integer valueOf56 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString58 = parcel.readString();
            UserId userId7 = userId2;
            Integer num4 = valueOf54;
            Integer num5 = valueOf55;
            Integer num6 = valueOf56;
            String readString59 = parcel.readString();
            String readString60 = parcel.readString();
            Integer num7 = valueOf53;
            UsersUserRelationDto usersUserRelationDto = (UsersUserRelationDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            UsersUserMinDto usersUserMinDto = (UsersUserMinDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            UsersPersonalDto usersPersonalDto2 = (UsersPersonalDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                usersPersonalDto = usersPersonalDto2;
                arrayList18 = arrayList17;
                userId3 = userId7;
                arrayList19 = null;
            } else {
                usersPersonalDto = usersPersonalDto2;
                int readInt14 = parcel.readInt();
                arrayList18 = arrayList17;
                arrayList19 = new ArrayList(readInt14);
                userId3 = userId7;
                int i18 = 0;
                while (i18 != readInt14) {
                    i18 = bo.b(UsersUserFullProfileDto.class, parcel, arrayList19, i18, 1);
                    readInt14 = readInt14;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList21 = arrayList19;
                arrayList20 = null;
            } else {
                int readInt15 = parcel.readInt();
                arrayList20 = new ArrayList(readInt15);
                arrayList21 = arrayList19;
                int i19 = 0;
                while (i19 != readInt15) {
                    i19 = bo.b(UsersUserFullProfileDto.class, parcel, arrayList20, i19, 1);
                    readInt15 = readInt15;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList23 = arrayList20;
                arrayList22 = null;
            } else {
                int readInt16 = parcel.readInt();
                arrayList22 = new ArrayList(readInt16);
                arrayList23 = arrayList20;
                int i20 = 0;
                while (i20 != readInt16) {
                    i20 = bo.b(UsersUserFullProfileDto.class, parcel, arrayList22, i20, 1);
                    readInt16 = readInt16;
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
            String readString61 = parcel.readString();
            Boolean bool14 = valueOf13;
            UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto2 = (UsersEmployeeWorkingStateDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                usersEmployeeWorkingStateDto = usersEmployeeWorkingStateDto2;
                createFromParcel3 = null;
            } else {
                usersEmployeeWorkingStateDto = usersEmployeeWorkingStateDto2;
                createFromParcel3 = EmployeeMarkDto.CREATOR.createFromParcel(parcel);
            }
            EmployeeMarkDto employeeMarkDto = createFromParcel3;
            UsersRightsLocationDto usersRightsLocationDto = (UsersRightsLocationDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf18 = null;
            } else {
                valueOf18 = Boolean.valueOf(parcel.readInt() != 0);
            }
            UsersEmojiStatusDto usersEmojiStatusDto = (UsersEmojiStatusDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            StatusImageStatusDto statusImageStatusDto = (StatusImageStatusDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            ArrayList arrayList42 = arrayList18;
            ArrayList arrayList43 = arrayList22;
            UserId userId8 = userId3;
            Boolean bool15 = valueOf18;
            String readString62 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto20 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf19 = null;
            } else {
                valueOf19 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            UsersPersonalDto usersPersonalDto3 = usersPersonalDto;
            ArrayList arrayList44 = arrayList23;
            Boolean bool16 = valueOf15;
            Boolean bool17 = valueOf16;
            Boolean bool18 = valueOf17;
            UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto3 = usersEmployeeWorkingStateDto;
            Boolean bool19 = valueOf19;
            String readString63 = parcel.readString();
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
            UsersGiftsTooltipDto usersGiftsTooltipDto2 = (UsersGiftsTooltipDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                usersGiftsTooltipDto = usersGiftsTooltipDto2;
                createFromParcel4 = null;
            } else {
                usersGiftsTooltipDto = usersGiftsTooltipDto2;
                createFromParcel4 = NoIndexDto.CREATOR.createFromParcel(parcel);
            }
            NoIndexDto noIndexDto = createFromParcel4;
            Integer valueOf57 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            MessagesContactDto messagesContactDto2 = (MessagesContactDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf22 = null;
            } else {
                valueOf22 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                messagesContactDto = messagesContactDto2;
                bool = valueOf14;
                userId4 = userId8;
                arrayList24 = null;
            } else {
                messagesContactDto = messagesContactDto2;
                int readInt17 = parcel.readInt();
                bool = valueOf14;
                arrayList24 = new ArrayList(readInt17);
                userId4 = userId8;
                int i21 = 0;
                while (i21 != readInt17) {
                    i21 = pm0.b(parcel, arrayList24, i21, 1);
                    readInt17 = readInt17;
                }
            }
            Integer valueOf58 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer num8 = valueOf48;
            Integer num9 = valueOf49;
            Integer num10 = valueOf50;
            Integer num11 = valueOf51;
            Integer num12 = valueOf52;
            UsersOccupationDto usersOccupationDto3 = usersOccupationDto;
            ArrayList arrayList45 = arrayList21;
            Boolean bool20 = bool;
            String readString64 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf23 = null;
            } else {
                valueOf23 = Boolean.valueOf(parcel.readInt() != 0);
            }
            UsersUserProfileTypeDto usersUserProfileTypeDto2 = (UsersUserProfileTypeDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            Integer num13 = valueOf58;
            UsersCanNotCallReasonDto usersCanNotCallReasonDto = (UsersCanNotCallReasonDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf24 = null;
            } else {
                valueOf24 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf25 = null;
            } else {
                valueOf25 = Boolean.valueOf(parcel.readInt() != 0);
            }
            BaseImageDto baseImageDto2 = (BaseImageDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                baseImageDto = baseImageDto2;
                arrayList25 = arrayList24;
                usersUserProfileTypeDto = usersUserProfileTypeDto2;
                arrayList26 = null;
            } else {
                baseImageDto = baseImageDto2;
                int readInt18 = parcel.readInt();
                arrayList25 = arrayList24;
                arrayList26 = new ArrayList(readInt18);
                usersUserProfileTypeDto = usersUserProfileTypeDto2;
                int i22 = 0;
                while (i22 != readInt18) {
                    i22 = bo.b(UsersUserFullProfileDto.class, parcel, arrayList26, i22, 1);
                    readInt18 = readInt18;
                }
            }
            if (parcel.readInt() == 0) {
                valueOf26 = null;
            } else {
                valueOf26 = Boolean.valueOf(parcel.readInt() != 0);
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
            SocialButtonTypeDto createFromParcel12 = parcel.readInt() == 0 ? null : SocialButtonTypeDto.CREATOR.createFromParcel(parcel);
            String readString65 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf33 = null;
            } else {
                valueOf33 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> createStringArrayList4 = parcel.createStringArrayList();
            Boolean bool21 = valueOf33;
            ArrayList<String> createStringArrayList5 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                valueOf34 = null;
            } else {
                valueOf34 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf59 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf60 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf35 = null;
            } else {
                valueOf35 = Boolean.valueOf(parcel.readInt() != 0);
            }
            UsersPromotionAllowanceDto usersPromotionAllowanceDto = (UsersPromotionAllowanceDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf36 = null;
            } else {
                valueOf36 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf61 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf37 = null;
            } else {
                valueOf37 = Boolean.valueOf(parcel.readInt() != 0);
            }
            MessagesEduEducationalProfileDto messagesEduEducationalProfileDto = (MessagesEduEducationalProfileDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            BaseAPlusMarkDto baseAPlusMarkDto = (BaseAPlusMarkDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf38 = null;
            } else {
                valueOf38 = Boolean.valueOf(parcel.readInt() != 0);
            }
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
            UsersDonutDto usersDonutDto = (UsersDonutDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            BaseSexDto baseSexDto = (BaseSexDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            Boolean bool22 = valueOf36;
            Integer num14 = valueOf61;
            Boolean bool23 = valueOf37;
            Boolean bool24 = valueOf38;
            Boolean bool25 = valueOf39;
            Boolean bool26 = valueOf40;
            String readString66 = parcel.readString();
            String readString67 = parcel.readString();
            String readString68 = parcel.readString();
            String readString69 = parcel.readString();
            UsersOnlineInfoDto usersOnlineInfoDto = (UsersOnlineInfoDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto21 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto22 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            Integer valueOf62 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto baseBoolIntDto23 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto24 = (BaseBoolIntDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            FriendsFriendStatusStatusDto friendsFriendStatusStatusDto = (FriendsFriendStatusStatusDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            FriendsRequestsMutualDto friendsRequestsMutualDto = (FriendsRequestsMutualDto) parcel.readParcelable(UsersUserFullProfileDto.class.getClassLoader());
            Boolean bool27 = valueOf34;
            Integer num15 = valueOf59;
            Integer num16 = valueOf60;
            Boolean bool28 = valueOf35;
            Integer num17 = valueOf62;
            String readString70 = parcel.readString();
            String readString71 = parcel.readString();
            Integer valueOf63 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString72 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf41 = null;
            } else {
                valueOf41 = Boolean.valueOf(parcel.readInt() != 0);
            }
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
            return new UsersUserFullProfileDto(userId4, arrayList32, arrayList27, arrayList29, createStringArrayList, num2, r10, readString, num3, list, createFromParcel5, photosPhotoAllDto2, readValue, usersUserFullProfileMutualFriendDto2, arrayList40, usersUserFullProfileRequestsBlockDto2, usersUserFullProfileFollowersBlockDto2, arrayList37, createFromParcel10, usersUserFullProfileFriendsBlockDto2, readValue2, readValue3, obj3, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, readString14, readString15, readString16, readString17, readString18, bdateVisibilityDto, baseCityDto, baseCountryDto, f, ownerStateDto, readString19, readString20, readString21, readString22, readString23, readString24, baseBoolIntDto, baseOwnerCoverDto, readString25, baseBoolIntDto2, baseBoolIntDto3, bool6, baseBoolIntDto4, baseBoolIntDto5, baseBoolIntDto6, baseBoolIntDto7, usersUserTypeDto, readString26, readString27, readString28, readString29, readString30, baseBoolIntDto8, baseBoolIntDto9, bool2, bool3, bool4, bool5, readString31, readString32, readString33, baseBoolIntDto10, videoLiveInfoDto, baseBoolIntDto11, bool7, readString34, readString35, readString36, readString37, readString38, readString39, readString40, photosPhotoDto3, arrayList35, arrayList39, arrayList38, readString41, valueOf47, bool9, wallDefaultDto, audioMusicAwardsDto, bool10, bool11, bool12, bool13, baseBoolIntDto13, arrayList41, readString42, readString43, readString44, readString45, readString46, readString47, readString48, readString49, readString50, baseBoolIntDto14, baseBoolIntDto15, bool8, readString51, readString52, readString53, audioAudioDto, readString54, readString55, appsAppMinDto, usersLastSeenDto, usersExportsDto, baseCropPhotoDto, num8, num9, num10, num11, baseBoolIntDto16, baseBoolIntDto17, baseBoolIntDto18, baseBoolIntDto19, num12, usersOccupationDto3, arrayList42, num7, readString56, num4, num5, readString57, num6, readString58, readString59, readString60, usersUserRelationDto, usersUserMinDto, usersPersonalDto3, arrayList45, arrayList44, arrayList43, bool14, bool20, bool16, bool17, bool18, readString61, usersEmployeeWorkingStateDto3, employeeMarkDto, usersRightsLocationDto, bool15, usersEmojiStatusDto, statusImageStatusDto, readString62, baseBoolIntDto20, bool19, createStringArrayList2, readString63, valueOf20, valueOf21, usersGiftsTooltipDto, noIndexDto, valueOf57, messagesContactDto, valueOf22, createStringArrayList3, arrayList25, num13, readString64, valueOf23, usersUserProfileTypeDto, usersCanNotCallReasonDto, valueOf24, valueOf25, baseImageDto, arrayList26, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, createFromParcel12, readString65, bool21, createStringArrayList4, createStringArrayList5, bool27, num15, num16, bool28, usersPromotionAllowanceDto, bool22, num14, bool23, messagesEduEducationalProfileDto, baseAPlusMarkDto, bool24, bool25, bool26, usersDonutDto, baseSexDto, readString66, readString67, readString68, readString69, usersOnlineInfoDto, baseBoolIntDto21, baseBoolIntDto22, num17, baseBoolIntDto23, baseBoolIntDto24, friendsFriendStatusStatusDto, friendsRequestsMutualDto, readString70, readString71, valueOf63, readString72, valueOf41, valueOf42, valueOf43);
        }

        @Override // android.os.Parcelable.Creator
        public final UsersUserFullProfileDto[] newArray(int i) {
            return new UsersUserFullProfileDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UsersUserFullProfileDto(UserId userId, List<UsersUserFullProfileCareerDto> list, List<Integer> list2, List<Integer> list3, List<String> list4, Integer num, Boolean bool, String str, Integer num2, List<UsersUserFullDto> list5, StatusStatusDto statusStatusDto, PhotosPhotoAllDto photosPhotoAllDto, Object obj, UsersUserFullProfileMutualFriendDto usersUserFullProfileMutualFriendDto, List<UsersUserFullDto> list6, UsersUserFullProfileRequestsBlockDto usersUserFullProfileRequestsBlockDto, UsersUserFullProfileFollowersBlockDto usersUserFullProfileFollowersBlockDto, List<GroupsGroupFullDto> list7, StoriesUserFullProfileDto storiesUserFullProfileDto, UsersUserFullProfileFriendsBlockDto usersUserFullProfileFriendsBlockDto, Object obj2, Object obj3, Object obj4, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, BdateVisibilityDto bdateVisibilityDto, BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, Float f, OwnerStateDto ownerStateDto, String str19, String str20, String str21, String str22, String str23, String str24, BaseBoolIntDto baseBoolIntDto, BaseOwnerCoverDto baseOwnerCoverDto, String str25, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Boolean bool2, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, UsersUserTypeDto usersUserTypeDto, String str26, String str27, String str28, String str29, String str30, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str31, String str32, String str33, BaseBoolIntDto baseBoolIntDto10, VideoLiveInfoDto videoLiveInfoDto, BaseBoolIntDto baseBoolIntDto11, Boolean bool7, String str34, String str35, String str36, String str37, String str38, String str39, String str40, PhotosPhotoDto photosPhotoDto, List<? extends List<UsersProfileButtonDto>> list8, List<? extends List<UsersProfileButtonDto>> list9, List<UsersProfileButtonDto> list10, String str41, Integer num3, Boolean bool8, WallDefaultDto wallDefaultDto, AudioMusicAwardsDto audioMusicAwardsDto, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, BaseBoolIntDto baseBoolIntDto12, List<BaseOwnerButtonDto> list11, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, BaseBoolIntDto baseBoolIntDto13, BaseBoolIntDto baseBoolIntDto14, Boolean bool13, String str51, String str52, String str53, AudioAudioDto audioAudioDto, String str54, String str55, AppsAppMinDto appsAppMinDto, UsersLastSeenDto usersLastSeenDto, UsersExportsDto usersExportsDto, BaseCropPhotoDto baseCropPhotoDto, Integer num4, Integer num5, Integer num6, Integer num7, BaseBoolIntDto baseBoolIntDto15, BaseBoolIntDto baseBoolIntDto16, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, Integer num8, UsersOccupationDto usersOccupationDto, List<UsersMilitaryDto> list12, Integer num9, String str56, Integer num10, Integer num11, String str57, Integer num12, String str58, String str59, String str60, UsersUserRelationDto usersUserRelationDto, UsersUserMinDto usersUserMinDto, UsersPersonalDto usersPersonalDto, List<UsersUniversityDto> list13, List<UsersSchoolDto> list14, List<UsersRelativeDto> list15, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, String str61, UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto, EmployeeMarkDto employeeMarkDto, UsersRightsLocationDto usersRightsLocationDto, Boolean bool19, UsersEmojiStatusDto usersEmojiStatusDto, StatusImageStatusDto statusImageStatusDto, String str62, BaseBoolIntDto baseBoolIntDto19, Boolean bool20, List<String> list16, String str63, Boolean bool21, Boolean bool22, UsersGiftsTooltipDto usersGiftsTooltipDto, NoIndexDto noIndexDto, Integer num13, MessagesContactDto messagesContactDto, Boolean bool23, List<String> list17, List<Integer> list18, Integer num14, String str64, Boolean bool24, UsersUserProfileTypeDto usersUserProfileTypeDto, UsersCanNotCallReasonDto usersCanNotCallReasonDto, Boolean bool25, Boolean bool26, BaseImageDto baseImageDto, List<CallsCustomNameForCallDto> list19, Boolean bool27, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, Boolean bool33, SocialButtonTypeDto socialButtonTypeDto, String str65, Boolean bool34, List<String> list20, List<String> list21, Boolean bool35, Integer num15, Integer num16, Boolean bool36, UsersPromotionAllowanceDto usersPromotionAllowanceDto, Boolean bool37, Integer num17, Boolean bool38, MessagesEduEducationalProfileDto messagesEduEducationalProfileDto, BaseAPlusMarkDto baseAPlusMarkDto, Boolean bool39, Boolean bool40, Boolean bool41, UsersDonutDto usersDonutDto, BaseSexDto baseSexDto, String str66, String str67, String str68, String str69, UsersOnlineInfoDto usersOnlineInfoDto, BaseBoolIntDto baseBoolIntDto20, BaseBoolIntDto baseBoolIntDto21, Integer num18, BaseBoolIntDto baseBoolIntDto22, BaseBoolIntDto baseBoolIntDto23, FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, FriendsRequestsMutualDto friendsRequestsMutualDto, String str70, String str71, Integer num19, String str72, Boolean bool42, Boolean bool43, Boolean bool44) {
        this.id = userId;
        this.career = list;
        this.cities = list2;
        this.countries = list3;
        this.displayFields = list4;
        this.silentModeEndedAt = num;
        this.isPersonalAdsEasyPromoteEnabled = bool;
        this.adsEasyPromoteOnboardingName = str;
        this.canSeeArchivedPosts = num2;
        this.relativesProfiles = list5;
        this.extendedStatus = statusStatusDto;
        this.photos = photosPhotoAllDto;
        this.counters = obj;
        this.mutualFriends = usersUserFullProfileMutualFriendDto;
        this.friends = list6;
        this.requestsBlock = usersUserFullProfileRequestsBlockDto;
        this.followersBlock = usersUserFullProfileFollowersBlockDto;
        this.occupationGroup = list7;
        this.stories = storiesUserFullProfileDto;
        this.friendsBlock = usersUserFullProfileFriendsBlockDto;
        this.tabs = obj2;
        this.receivedThrows = obj3;
        this.friendsRecommendations = obj4;
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
        this.bdateVisibility = bdateVisibilityDto;
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
        this.cover = baseOwnerCoverDto;
        this.photoAvgColor = str25;
        this.hasMobile = baseBoolIntDto2;
        this.isFriend = baseBoolIntDto3;
        this.isBestFriend = bool2;
        this.wallComments = baseBoolIntDto4;
        this.canPost = baseBoolIntDto5;
        this.canSeeAllPosts = baseBoolIntDto6;
        this.canSeeAudio = baseBoolIntDto7;
        this.type = usersUserTypeDto;
        this.email = str26;
        this.skype = str27;
        this.facebook = str28;
        this.facebookName = str29;
        this.twitter = str30;
        this.isAdult = baseBoolIntDto8;
        this.isSubscribed = baseBoolIntDto9;
        this.isSubscribedStories = bool3;
        this.canSubscribeStories = bool4;
        this.canAskQuestion = bool5;
        this.canAskAnonymous = bool6;
        this.subscriptionCountry = str31;
        this.livejournal = str32;
        this.instagram = str33;
        this.test = baseBoolIntDto10;
        this.videoLive = videoLiveInfoDto;
        this.isVideoLiveNotificationsBlocked = baseBoolIntDto11;
        this.isService = bool7;
        this.serviceDescription = str34;
        this.photoRec = str35;
        this.photoMedium = str36;
        this.photoMediumRec = str37;
        this.photo = str38;
        this.photoBig = str39;
        this.photo400 = str40;
        this.photoMaxSize = photosPhotoDto;
        this.profileButtons = list8;
        this.profileButtonsTablet = list9;
        this.thirdPartyButtons = list10;
        this.language = str41;
        this.storiesArchiveCount = num3;
        this.hasUnseenStories = bool8;
        this.wallDefault = wallDefaultDto;
        this.musicAwards = audioMusicAwardsDto;
        this.canCall = bool9;
        this.canCallFromGroup = bool10;
        this.canInviteAsVoiceroomsSpeaker = bool11;
        this.canSeeWishes = bool12;
        this.canSeeGifts = baseBoolIntDto12;
        this.buttons = list11;
        this.interests = str42;
        this.books = str43;
        this.tv = str44;
        this.quotes = str45;
        this.about = str46;
        this.games = str47;
        this.movies = str48;
        this.activities = str49;
        this.music = str50;
        this.canWritePrivateMessage = baseBoolIntDto13;
        this.canSendFriendRequest = baseBoolIntDto14;
        this.canBeInvitedGroup = bool13;
        this.mobilePhone = str51;
        this.homePhone = str52;
        this.site = str53;
        this.statusAudio = audioAudioDto;
        this.status = str54;
        this.activity = str55;
        this.statusApp = appsAppMinDto;
        this.lastSeen = usersLastSeenDto;
        this.exports = usersExportsDto;
        this.cropPhoto = baseCropPhotoDto;
        this.followersCount = num4;
        this.videoLiveLevel = num5;
        this.videoLiveCount = num6;
        this.clipsCount = num7;
        this.blacklisted = baseBoolIntDto15;
        this.blacklistedByMe = baseBoolIntDto16;
        this.isFavorite = baseBoolIntDto17;
        this.isHiddenFromFeed = baseBoolIntDto18;
        this.commonCount = num8;
        this.occupation = usersOccupationDto;
        this.military = list12;
        this.university = num9;
        this.universityName = str56;
        this.universityGroupId = num10;
        this.faculty = num11;
        this.facultyName = str57;
        this.graduation = num12;
        this.educationForm = str58;
        this.educationStatus = str59;
        this.homeTown = str60;
        this.relation = usersUserRelationDto;
        this.relationPartner = usersUserMinDto;
        this.personal = usersPersonalDto;
        this.universities = list13;
        this.schools = list14;
        this.relatives = list15;
        this.isSubscribedPodcasts = bool14;
        this.canSubscribePodcasts = bool15;
        this.canSubscribePosts = bool16;
        this.isStudent = bool17;
        this.hasRights = bool18;
        this.sysUsername = str61;
        this.employeeWorkingState = usersEmployeeWorkingStateDto;
        this.employeeMark = employeeMarkDto;
        this.rightsLocation = usersRightsLocationDto;
        this.canInviteToChats = bool19;
        this.emojiStatus = usersEmojiStatusDto;
        this.imageStatus = statusImageStatusDto;
        this.accessKey = str62;
        this.canUploadDoc = baseBoolIntDto19;
        this.canBan = bool20;
        this.eduDetails = list16;
        this.hash = str63;
        this.hasEmail = bool21;
        this.isDead = bool22;
        this.giftsTooltip = usersGiftsTooltipDto;
        this.noIndex = noIndexDto;
        this.contactId = num13;
        this.contact = messagesContactDto;
        this.isMessageRequest = bool23;
        this.descriptions = list17;
        this.lists = list18;
        this.friendshipWeeks = num14;
        this.trackCode = str64;
        this.needBigMsgBtnInProfile = bool24;
        this.profileType = usersUserProfileTypeDto;
        this.canNotCallReason = usersCanNotCallReasonDto;
        this.canCallAsCommunity = bool25;
        this.isNft = bool26;
        this.animatedAvatar = baseImageDto;
        this.customNamesForCalls = list19;
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
        this.oauthLinked = list20;
        this.oauthVerification = list21;
        this.isSberLinked = bool35;
        this.ageMark = num15;
        this.joined = num16;
        this.isServiceAccount = bool36;
        this.promotionAllowance = usersPromotionAllowanceDto;
        this.coOwnershipEnabled = bool37;
        this.ageGroup = num17;
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
        this.onlineApp = num18;
        this.verified = baseBoolIntDto22;
        this.trending = baseBoolIntDto23;
        this.friendStatus = friendsFriendStatusStatusDto;
        this.mutual = friendsRequestsMutualDto;
        this.deactivated = str70;
        this.firstName = str71;
        this.hidden = num19;
        this.lastName = str72;
        this.canAccessClosed = bool42;
        this.isClosed = bool43;
        this.isCached = bool44;
    }

    public final Boolean B() {
        return this.canBan;
    }

    public final UserId B1() {
        return this.id;
    }

    public final UsersOnlineInfoDto B2() {
        return this.onlineInfo;
    }

    public final Object B3() {
        return this.tabs;
    }

    public final Boolean C() {
        return this.canInviteToChats;
    }

    public final BaseBoolIntDto D() {
        return this.canPost;
    }

    public final UsersEmojiStatusDto D0() {
        return this.emojiStatus;
    }

    public final StatusImageStatusDto D1() {
        return this.imageStatus;
    }

    public final List<UsersProfileButtonDto> D3() {
        return this.thirdPartyButtons;
    }

    public final String E1() {
        return this.instagram;
    }

    public final OwnerStateDto E2() {
        return this.ownerState;
    }

    public final BaseBoolIntDto E3() {
        return this.trending;
    }

    public final BaseBoolIntDto F() {
        return this.canSeeAllPosts;
    }

    public final String F0() {
        return this.facebook;
    }

    public final String F3() {
        return this.tv;
    }

    public final Integer G() {
        return this.canSeeArchivedPosts;
    }

    public final UsersPersonalDto G2() {
        return this.personal;
    }

    public final String G3() {
        return this.twitter;
    }

    public final String H0() {
        return this.facebookName;
    }

    public final String I2() {
        return this.photoAvgColor;
    }

    public final List<UsersUniversityDto> I3() {
        return this.universities;
    }

    public final String J2() {
        return this.photoBase;
    }

    public final Boolean K() {
        return this.canSeeWishes;
    }

    public final String K0() {
        return this.firstName;
    }

    public final String L1() {
        return this.interests;
    }

    public final PhotosPhotoAllDto L2() {
        return this.photos;
    }

    public final BaseBoolIntDto M() {
        return this.canSendFriendRequest;
    }

    public final List<List<UsersProfileButtonDto>> M2() {
        return this.profileButtons;
    }

    public final BaseBoolIntDto M3() {
        return this.verified;
    }

    public final String N0() {
        return this.firstNameAcc;
    }

    public final String N1() {
        return this.lastName;
    }

    public final List<List<UsersProfileButtonDto>> N2() {
        return this.profileButtonsTablet;
    }

    public final VideoLiveInfoDto N3() {
        return this.videoLive;
    }

    public final String O2() {
        return this.quotes;
    }

    public final WallDefaultDto O3() {
        return this.wallDefault;
    }

    public final String P0() {
        return this.firstNameDat;
    }

    public final Object Q2() {
        return this.receivedThrows;
    }

    public final Boolean Q3() {
        return this.isBestFriend;
    }

    public final Boolean R() {
        return this.canSubscribePosts;
    }

    public final String R1() {
        return this.lastNameAcc;
    }

    public final UsersUserRelationDto R2() {
        return this.relation;
    }

    public final Boolean R3() {
        return this.isClosed;
    }

    public final String S0() {
        return this.firstNameGen;
    }

    public final Boolean T() {
        return this.canSubscribeStories;
    }

    public final UsersUserMinDto T2() {
        return this.relationPartner;
    }

    public final String U0() {
        return this.firstNameIns;
    }

    public final String U1() {
        return this.lastNameDat;
    }

    public final UsersUserFullProfileFollowersBlockDto V0() {
        return this.followersBlock;
    }

    public final String V1() {
        return this.lastNameGen;
    }

    public final List<UsersRelativeDto> V2() {
        return this.relatives;
    }

    public final BaseBoolIntDto W() {
        return this.canWritePrivateMessage;
    }

    public final String W1() {
        return this.lastNameIns;
    }

    public final List<UsersUserFullDto> W2() {
        return this.relativesProfiles;
    }

    public final Boolean W3() {
        return this.isDead;
    }

    public final String X1() {
        return this.livejournal;
    }

    public final BaseBoolIntDto X3() {
        return this.isFavorite;
    }

    public final List<UsersUserFullProfileCareerDto> Z() {
        return this.career;
    }

    public final BaseCityDto a0() {
        return this.city;
    }

    public final Boolean a4() {
        return this.isFollowersModeOn;
    }

    public final FriendsFriendStatusStatusDto b1() {
        return this.friendStatus;
    }

    public final BaseBoolIntDto b4() {
        return this.isHiddenFromFeed;
    }

    public final Boolean c4() {
        return this.isNft;
    }

    public final BaseAPlusMarkDto d() {
        return this.aPlusMark;
    }

    public final List<UsersUserFullDto> d1() {
        return this.friends;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.about;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersUserFullProfileDto)) {
            return false;
        }
        UsersUserFullProfileDto usersUserFullProfileDto = (UsersUserFullProfileDto) obj;
        return epx.f(this.id, usersUserFullProfileDto.id) && epx.f(this.career, usersUserFullProfileDto.career) && epx.f(this.cities, usersUserFullProfileDto.cities) && epx.f(this.countries, usersUserFullProfileDto.countries) && epx.f(this.displayFields, usersUserFullProfileDto.displayFields) && epx.f(this.silentModeEndedAt, usersUserFullProfileDto.silentModeEndedAt) && epx.f(this.isPersonalAdsEasyPromoteEnabled, usersUserFullProfileDto.isPersonalAdsEasyPromoteEnabled) && epx.f(this.adsEasyPromoteOnboardingName, usersUserFullProfileDto.adsEasyPromoteOnboardingName) && epx.f(this.canSeeArchivedPosts, usersUserFullProfileDto.canSeeArchivedPosts) && epx.f(this.relativesProfiles, usersUserFullProfileDto.relativesProfiles) && epx.f(this.extendedStatus, usersUserFullProfileDto.extendedStatus) && epx.f(this.photos, usersUserFullProfileDto.photos) && epx.f(this.counters, usersUserFullProfileDto.counters) && epx.f(this.mutualFriends, usersUserFullProfileDto.mutualFriends) && epx.f(this.friends, usersUserFullProfileDto.friends) && epx.f(this.requestsBlock, usersUserFullProfileDto.requestsBlock) && epx.f(this.followersBlock, usersUserFullProfileDto.followersBlock) && epx.f(this.occupationGroup, usersUserFullProfileDto.occupationGroup) && epx.f(this.stories, usersUserFullProfileDto.stories) && epx.f(this.friendsBlock, usersUserFullProfileDto.friendsBlock) && epx.f(this.tabs, usersUserFullProfileDto.tabs) && epx.f(this.receivedThrows, usersUserFullProfileDto.receivedThrows) && epx.f(this.friendsRecommendations, usersUserFullProfileDto.friendsRecommendations) && epx.f(this.firstNameNom, usersUserFullProfileDto.firstNameNom) && epx.f(this.firstNameGen, usersUserFullProfileDto.firstNameGen) && epx.f(this.firstNameDat, usersUserFullProfileDto.firstNameDat) && epx.f(this.firstNameAcc, usersUserFullProfileDto.firstNameAcc) && epx.f(this.firstNameIns, usersUserFullProfileDto.firstNameIns) && epx.f(this.firstNameAbl, usersUserFullProfileDto.firstNameAbl) && epx.f(this.lastNameNom, usersUserFullProfileDto.lastNameNom) && epx.f(this.lastNameGen, usersUserFullProfileDto.lastNameGen) && epx.f(this.lastNameDat, usersUserFullProfileDto.lastNameDat) && epx.f(this.lastNameAcc, usersUserFullProfileDto.lastNameAcc) && epx.f(this.lastNameIns, usersUserFullProfileDto.lastNameIns) && epx.f(this.lastNameAbl, usersUserFullProfileDto.lastNameAbl) && epx.f(this.nickname, usersUserFullProfileDto.nickname) && epx.f(this.maidenName, usersUserFullProfileDto.maidenName) && epx.f(this.contactName, usersUserFullProfileDto.contactName) && epx.f(this.domain, usersUserFullProfileDto.domain) && epx.f(this.bdate, usersUserFullProfileDto.bdate) && this.bdateVisibility == usersUserFullProfileDto.bdateVisibility && epx.f(this.city, usersUserFullProfileDto.city) && epx.f(this.country, usersUserFullProfileDto.country) && epx.f(this.timezone, usersUserFullProfileDto.timezone) && epx.f(this.ownerState, usersUserFullProfileDto.ownerState) && epx.f(this.photo200, usersUserFullProfileDto.photo200) && epx.f(this.photoMax, usersUserFullProfileDto.photoMax) && epx.f(this.photo200Orig, usersUserFullProfileDto.photo200Orig) && epx.f(this.photo400Orig, usersUserFullProfileDto.photo400Orig) && epx.f(this.photoMaxOrig, usersUserFullProfileDto.photoMaxOrig) && epx.f(this.photoId, usersUserFullProfileDto.photoId) && this.hasPhoto == usersUserFullProfileDto.hasPhoto && epx.f(this.cover, usersUserFullProfileDto.cover) && epx.f(this.photoAvgColor, usersUserFullProfileDto.photoAvgColor) && this.hasMobile == usersUserFullProfileDto.hasMobile && this.isFriend == usersUserFullProfileDto.isFriend && epx.f(this.isBestFriend, usersUserFullProfileDto.isBestFriend) && this.wallComments == usersUserFullProfileDto.wallComments && this.canPost == usersUserFullProfileDto.canPost && this.canSeeAllPosts == usersUserFullProfileDto.canSeeAllPosts && this.canSeeAudio == usersUserFullProfileDto.canSeeAudio && this.type == usersUserFullProfileDto.type && epx.f(this.email, usersUserFullProfileDto.email) && epx.f(this.skype, usersUserFullProfileDto.skype) && epx.f(this.facebook, usersUserFullProfileDto.facebook) && epx.f(this.facebookName, usersUserFullProfileDto.facebookName) && epx.f(this.twitter, usersUserFullProfileDto.twitter) && this.isAdult == usersUserFullProfileDto.isAdult && this.isSubscribed == usersUserFullProfileDto.isSubscribed && epx.f(this.isSubscribedStories, usersUserFullProfileDto.isSubscribedStories) && epx.f(this.canSubscribeStories, usersUserFullProfileDto.canSubscribeStories) && epx.f(this.canAskQuestion, usersUserFullProfileDto.canAskQuestion) && epx.f(this.canAskAnonymous, usersUserFullProfileDto.canAskAnonymous) && epx.f(this.subscriptionCountry, usersUserFullProfileDto.subscriptionCountry) && epx.f(this.livejournal, usersUserFullProfileDto.livejournal) && epx.f(this.instagram, usersUserFullProfileDto.instagram) && this.test == usersUserFullProfileDto.test && epx.f(this.videoLive, usersUserFullProfileDto.videoLive) && this.isVideoLiveNotificationsBlocked == usersUserFullProfileDto.isVideoLiveNotificationsBlocked && epx.f(this.isService, usersUserFullProfileDto.isService) && epx.f(this.serviceDescription, usersUserFullProfileDto.serviceDescription) && epx.f(this.photoRec, usersUserFullProfileDto.photoRec) && epx.f(this.photoMedium, usersUserFullProfileDto.photoMedium) && epx.f(this.photoMediumRec, usersUserFullProfileDto.photoMediumRec) && epx.f(this.photo, usersUserFullProfileDto.photo) && epx.f(this.photoBig, usersUserFullProfileDto.photoBig) && epx.f(this.photo400, usersUserFullProfileDto.photo400) && epx.f(this.photoMaxSize, usersUserFullProfileDto.photoMaxSize) && epx.f(this.profileButtons, usersUserFullProfileDto.profileButtons) && epx.f(this.profileButtonsTablet, usersUserFullProfileDto.profileButtonsTablet) && epx.f(this.thirdPartyButtons, usersUserFullProfileDto.thirdPartyButtons) && epx.f(this.language, usersUserFullProfileDto.language) && epx.f(this.storiesArchiveCount, usersUserFullProfileDto.storiesArchiveCount) && epx.f(this.hasUnseenStories, usersUserFullProfileDto.hasUnseenStories) && this.wallDefault == usersUserFullProfileDto.wallDefault && epx.f(this.musicAwards, usersUserFullProfileDto.musicAwards) && epx.f(this.canCall, usersUserFullProfileDto.canCall) && epx.f(this.canCallFromGroup, usersUserFullProfileDto.canCallFromGroup) && epx.f(this.canInviteAsVoiceroomsSpeaker, usersUserFullProfileDto.canInviteAsVoiceroomsSpeaker) && epx.f(this.canSeeWishes, usersUserFullProfileDto.canSeeWishes) && this.canSeeGifts == usersUserFullProfileDto.canSeeGifts && epx.f(this.buttons, usersUserFullProfileDto.buttons) && epx.f(this.interests, usersUserFullProfileDto.interests) && epx.f(this.books, usersUserFullProfileDto.books) && epx.f(this.tv, usersUserFullProfileDto.tv) && epx.f(this.quotes, usersUserFullProfileDto.quotes) && epx.f(this.about, usersUserFullProfileDto.about) && epx.f(this.games, usersUserFullProfileDto.games) && epx.f(this.movies, usersUserFullProfileDto.movies) && epx.f(this.activities, usersUserFullProfileDto.activities) && epx.f(this.music, usersUserFullProfileDto.music) && this.canWritePrivateMessage == usersUserFullProfileDto.canWritePrivateMessage && this.canSendFriendRequest == usersUserFullProfileDto.canSendFriendRequest && epx.f(this.canBeInvitedGroup, usersUserFullProfileDto.canBeInvitedGroup) && epx.f(this.mobilePhone, usersUserFullProfileDto.mobilePhone) && epx.f(this.homePhone, usersUserFullProfileDto.homePhone) && epx.f(this.site, usersUserFullProfileDto.site) && epx.f(this.statusAudio, usersUserFullProfileDto.statusAudio) && epx.f(this.status, usersUserFullProfileDto.status) && epx.f(this.activity, usersUserFullProfileDto.activity) && epx.f(this.statusApp, usersUserFullProfileDto.statusApp) && epx.f(this.lastSeen, usersUserFullProfileDto.lastSeen) && epx.f(this.exports, usersUserFullProfileDto.exports) && epx.f(this.cropPhoto, usersUserFullProfileDto.cropPhoto) && epx.f(this.followersCount, usersUserFullProfileDto.followersCount) && epx.f(this.videoLiveLevel, usersUserFullProfileDto.videoLiveLevel) && epx.f(this.videoLiveCount, usersUserFullProfileDto.videoLiveCount) && epx.f(this.clipsCount, usersUserFullProfileDto.clipsCount) && this.blacklisted == usersUserFullProfileDto.blacklisted && this.blacklistedByMe == usersUserFullProfileDto.blacklistedByMe && this.isFavorite == usersUserFullProfileDto.isFavorite && this.isHiddenFromFeed == usersUserFullProfileDto.isHiddenFromFeed && epx.f(this.commonCount, usersUserFullProfileDto.commonCount) && epx.f(this.occupation, usersUserFullProfileDto.occupation) && epx.f(this.military, usersUserFullProfileDto.military) && epx.f(this.university, usersUserFullProfileDto.university) && epx.f(this.universityName, usersUserFullProfileDto.universityName) && epx.f(this.universityGroupId, usersUserFullProfileDto.universityGroupId) && epx.f(this.faculty, usersUserFullProfileDto.faculty) && epx.f(this.facultyName, usersUserFullProfileDto.facultyName) && epx.f(this.graduation, usersUserFullProfileDto.graduation) && epx.f(this.educationForm, usersUserFullProfileDto.educationForm) && epx.f(this.educationStatus, usersUserFullProfileDto.educationStatus) && epx.f(this.homeTown, usersUserFullProfileDto.homeTown) && this.relation == usersUserFullProfileDto.relation && epx.f(this.relationPartner, usersUserFullProfileDto.relationPartner) && epx.f(this.personal, usersUserFullProfileDto.personal) && epx.f(this.universities, usersUserFullProfileDto.universities) && epx.f(this.schools, usersUserFullProfileDto.schools) && epx.f(this.relatives, usersUserFullProfileDto.relatives) && epx.f(this.isSubscribedPodcasts, usersUserFullProfileDto.isSubscribedPodcasts) && epx.f(this.canSubscribePodcasts, usersUserFullProfileDto.canSubscribePodcasts) && epx.f(this.canSubscribePosts, usersUserFullProfileDto.canSubscribePosts) && epx.f(this.isStudent, usersUserFullProfileDto.isStudent) && epx.f(this.hasRights, usersUserFullProfileDto.hasRights) && epx.f(this.sysUsername, usersUserFullProfileDto.sysUsername) && epx.f(this.employeeWorkingState, usersUserFullProfileDto.employeeWorkingState) && this.employeeMark == usersUserFullProfileDto.employeeMark && epx.f(this.rightsLocation, usersUserFullProfileDto.rightsLocation) && epx.f(this.canInviteToChats, usersUserFullProfileDto.canInviteToChats) && epx.f(this.emojiStatus, usersUserFullProfileDto.emojiStatus) && epx.f(this.imageStatus, usersUserFullProfileDto.imageStatus) && epx.f(this.accessKey, usersUserFullProfileDto.accessKey) && this.canUploadDoc == usersUserFullProfileDto.canUploadDoc && epx.f(this.canBan, usersUserFullProfileDto.canBan) && epx.f(this.eduDetails, usersUserFullProfileDto.eduDetails) && epx.f(this.hash, usersUserFullProfileDto.hash) && epx.f(this.hasEmail, usersUserFullProfileDto.hasEmail) && epx.f(this.isDead, usersUserFullProfileDto.isDead) && epx.f(this.giftsTooltip, usersUserFullProfileDto.giftsTooltip) && this.noIndex == usersUserFullProfileDto.noIndex && epx.f(this.contactId, usersUserFullProfileDto.contactId) && epx.f(this.contact, usersUserFullProfileDto.contact) && epx.f(this.isMessageRequest, usersUserFullProfileDto.isMessageRequest) && epx.f(this.descriptions, usersUserFullProfileDto.descriptions) && epx.f(this.lists, usersUserFullProfileDto.lists) && epx.f(this.friendshipWeeks, usersUserFullProfileDto.friendshipWeeks) && epx.f(this.trackCode, usersUserFullProfileDto.trackCode) && epx.f(this.needBigMsgBtnInProfile, usersUserFullProfileDto.needBigMsgBtnInProfile) && this.profileType == usersUserFullProfileDto.profileType && this.canNotCallReason == usersUserFullProfileDto.canNotCallReason && epx.f(this.canCallAsCommunity, usersUserFullProfileDto.canCallAsCommunity) && epx.f(this.isNft, usersUserFullProfileDto.isNft) && epx.f(this.animatedAvatar, usersUserFullProfileDto.animatedAvatar) && epx.f(this.customNamesForCalls, usersUserFullProfileDto.customNamesForCalls) && epx.f(this.isEsiaVerified, usersUserFullProfileDto.isEsiaVerified) && epx.f(this.isEsiaLinked, usersUserFullProfileDto.isEsiaLinked) && epx.f(this.isTinkoffVerified, usersUserFullProfileDto.isTinkoffVerified) && epx.f(this.isTinkoffLinked, usersUserFullProfileDto.isTinkoffLinked) && epx.f(this.isSberVerified, usersUserFullProfileDto.isSberVerified) && epx.f(this.isVerified, usersUserFullProfileDto.isVerified) && epx.f(this.isFollowersModeOn, usersUserFullProfileDto.isFollowersModeOn) && this.socialButtonType == usersUserFullProfileDto.socialButtonType && epx.f(this.description, usersUserFullProfileDto.description) && epx.f(this.isTeacher, usersUserFullProfileDto.isTeacher) && epx.f(this.oauthLinked, usersUserFullProfileDto.oauthLinked) && epx.f(this.oauthVerification, usersUserFullProfileDto.oauthVerification) && epx.f(this.isSberLinked, usersUserFullProfileDto.isSberLinked) && epx.f(this.ageMark, usersUserFullProfileDto.ageMark) && epx.f(this.joined, usersUserFullProfileDto.joined) && epx.f(this.isServiceAccount, usersUserFullProfileDto.isServiceAccount) && epx.f(this.promotionAllowance, usersUserFullProfileDto.promotionAllowance) && epx.f(this.coOwnershipEnabled, usersUserFullProfileDto.coOwnershipEnabled) && epx.f(this.ageGroup, usersUserFullProfileDto.ageGroup) && epx.f(this.hasRelatedUserPin, usersUserFullProfileDto.hasRelatedUserPin) && epx.f(this.educationalProfile, usersUserFullProfileDto.educationalProfile) && epx.f(this.aPlusMark, usersUserFullProfileDto.aPlusMark) && epx.f(this.isDon, usersUserFullProfileDto.isDon) && epx.f(this.isMediaModer, usersUserFullProfileDto.isMediaModer) && epx.f(this.isPhotoMapEnabled, usersUserFullProfileDto.isPhotoMapEnabled) && epx.f(this.donut, usersUserFullProfileDto.donut) && this.sex == usersUserFullProfileDto.sex && epx.f(this.screenName, usersUserFullProfileDto.screenName) && epx.f(this.photo50, usersUserFullProfileDto.photo50) && epx.f(this.photo100, usersUserFullProfileDto.photo100) && epx.f(this.photoBase, usersUserFullProfileDto.photoBase) && epx.f(this.onlineInfo, usersUserFullProfileDto.onlineInfo) && this.online == usersUserFullProfileDto.online && this.onlineMobile == usersUserFullProfileDto.onlineMobile && epx.f(this.onlineApp, usersUserFullProfileDto.onlineApp) && this.verified == usersUserFullProfileDto.verified && this.trending == usersUserFullProfileDto.trending && this.friendStatus == usersUserFullProfileDto.friendStatus && epx.f(this.mutual, usersUserFullProfileDto.mutual) && epx.f(this.deactivated, usersUserFullProfileDto.deactivated) && epx.f(this.firstName, usersUserFullProfileDto.firstName) && epx.f(this.hidden, usersUserFullProfileDto.hidden) && epx.f(this.lastName, usersUserFullProfileDto.lastName) && epx.f(this.canAccessClosed, usersUserFullProfileDto.canAccessClosed) && epx.f(this.isClosed, usersUserFullProfileDto.isClosed) && epx.f(this.isCached, usersUserFullProfileDto.isCached);
    }

    public final String f() {
        return this.activities;
    }

    public final UsersUserFullProfileRequestsBlockDto f3() {
        return this.requestsBlock;
    }

    public final Boolean f4() {
        return this.isPersonalAdsEasyPromoteEnabled;
    }

    public final String g() {
        return this.activity;
    }

    public final List<UsersSchoolDto> g3() {
        return this.schools;
    }

    public final String h3() {
        return this.screenName;
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        List<UsersUserFullProfileCareerDto> list = this.career;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.cities;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Integer> list3 = this.countries;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.displayFields;
        int hashCode5 = (hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Integer num = this.silentModeEndedAt;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isPersonalAdsEasyPromoteEnabled;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.adsEasyPromoteOnboardingName;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.canSeeArchivedPosts;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<UsersUserFullDto> list5 = this.relativesProfiles;
        int hashCode10 = (hashCode9 + (list5 == null ? 0 : list5.hashCode())) * 31;
        StatusStatusDto statusStatusDto = this.extendedStatus;
        int hashCode11 = (hashCode10 + (statusStatusDto == null ? 0 : statusStatusDto.hashCode())) * 31;
        PhotosPhotoAllDto photosPhotoAllDto = this.photos;
        int hashCode12 = (hashCode11 + (photosPhotoAllDto == null ? 0 : photosPhotoAllDto.hashCode())) * 31;
        Object obj = this.counters;
        int hashCode13 = (hashCode12 + (obj == null ? 0 : obj.hashCode())) * 31;
        UsersUserFullProfileMutualFriendDto usersUserFullProfileMutualFriendDto = this.mutualFriends;
        int hashCode14 = (hashCode13 + (usersUserFullProfileMutualFriendDto == null ? 0 : usersUserFullProfileMutualFriendDto.hashCode())) * 31;
        List<UsersUserFullDto> list6 = this.friends;
        int hashCode15 = (hashCode14 + (list6 == null ? 0 : list6.hashCode())) * 31;
        UsersUserFullProfileRequestsBlockDto usersUserFullProfileRequestsBlockDto = this.requestsBlock;
        int hashCode16 = (hashCode15 + (usersUserFullProfileRequestsBlockDto == null ? 0 : usersUserFullProfileRequestsBlockDto.hashCode())) * 31;
        UsersUserFullProfileFollowersBlockDto usersUserFullProfileFollowersBlockDto = this.followersBlock;
        int hashCode17 = (hashCode16 + (usersUserFullProfileFollowersBlockDto == null ? 0 : usersUserFullProfileFollowersBlockDto.hashCode())) * 31;
        List<GroupsGroupFullDto> list7 = this.occupationGroup;
        int hashCode18 = (hashCode17 + (list7 == null ? 0 : list7.hashCode())) * 31;
        StoriesUserFullProfileDto storiesUserFullProfileDto = this.stories;
        int hashCode19 = (hashCode18 + (storiesUserFullProfileDto == null ? 0 : storiesUserFullProfileDto.hashCode())) * 31;
        UsersUserFullProfileFriendsBlockDto usersUserFullProfileFriendsBlockDto = this.friendsBlock;
        int hashCode20 = (hashCode19 + (usersUserFullProfileFriendsBlockDto == null ? 0 : usersUserFullProfileFriendsBlockDto.hashCode())) * 31;
        Object obj2 = this.tabs;
        int hashCode21 = (hashCode20 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.receivedThrows;
        int hashCode22 = (hashCode21 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.friendsRecommendations;
        int hashCode23 = (hashCode22 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        String str2 = this.firstNameNom;
        int hashCode24 = (hashCode23 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firstNameGen;
        int hashCode25 = (hashCode24 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.firstNameDat;
        int hashCode26 = (hashCode25 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.firstNameAcc;
        int hashCode27 = (hashCode26 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.firstNameIns;
        int hashCode28 = (hashCode27 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.firstNameAbl;
        int hashCode29 = (hashCode28 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.lastNameNom;
        int hashCode30 = (hashCode29 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.lastNameGen;
        int hashCode31 = (hashCode30 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.lastNameDat;
        int hashCode32 = (hashCode31 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.lastNameAcc;
        int hashCode33 = (hashCode32 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.lastNameIns;
        int hashCode34 = (hashCode33 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.lastNameAbl;
        int hashCode35 = (hashCode34 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.nickname;
        int hashCode36 = (hashCode35 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.maidenName;
        int hashCode37 = (hashCode36 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.contactName;
        int hashCode38 = (hashCode37 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.domain;
        int hashCode39 = (hashCode38 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.bdate;
        int hashCode40 = (hashCode39 + (str18 == null ? 0 : str18.hashCode())) * 31;
        BdateVisibilityDto bdateVisibilityDto = this.bdateVisibility;
        int hashCode41 = (hashCode40 + (bdateVisibilityDto == null ? 0 : bdateVisibilityDto.hashCode())) * 31;
        BaseCityDto baseCityDto = this.city;
        int hashCode42 = (hashCode41 + (baseCityDto == null ? 0 : baseCityDto.hashCode())) * 31;
        BaseCountryDto baseCountryDto = this.country;
        int hashCode43 = (hashCode42 + (baseCountryDto == null ? 0 : baseCountryDto.hashCode())) * 31;
        Float f = this.timezone;
        int hashCode44 = (hashCode43 + (f == null ? 0 : f.hashCode())) * 31;
        OwnerStateDto ownerStateDto = this.ownerState;
        int hashCode45 = (hashCode44 + (ownerStateDto == null ? 0 : ownerStateDto.hashCode())) * 31;
        String str19 = this.photo200;
        int hashCode46 = (hashCode45 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.photoMax;
        int hashCode47 = (hashCode46 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.photo200Orig;
        int hashCode48 = (hashCode47 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.photo400Orig;
        int hashCode49 = (hashCode48 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.photoMaxOrig;
        int hashCode50 = (hashCode49 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.photoId;
        int hashCode51 = (hashCode50 + (str24 == null ? 0 : str24.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.hasPhoto;
        int hashCode52 = (hashCode51 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseOwnerCoverDto baseOwnerCoverDto = this.cover;
        int hashCode53 = (hashCode52 + (baseOwnerCoverDto == null ? 0 : baseOwnerCoverDto.hashCode())) * 31;
        String str25 = this.photoAvgColor;
        int hashCode54 = (hashCode53 + (str25 == null ? 0 : str25.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.hasMobile;
        int hashCode55 = (hashCode54 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.isFriend;
        int hashCode56 = (hashCode55 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        Boolean bool2 = this.isBestFriend;
        int hashCode57 = (hashCode56 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.wallComments;
        int hashCode58 = (hashCode57 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto5 = this.canPost;
        int hashCode59 = (hashCode58 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto6 = this.canSeeAllPosts;
        int hashCode60 = (hashCode59 + (baseBoolIntDto6 == null ? 0 : baseBoolIntDto6.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto7 = this.canSeeAudio;
        int hashCode61 = (hashCode60 + (baseBoolIntDto7 == null ? 0 : baseBoolIntDto7.hashCode())) * 31;
        UsersUserTypeDto usersUserTypeDto = this.type;
        int hashCode62 = (hashCode61 + (usersUserTypeDto == null ? 0 : usersUserTypeDto.hashCode())) * 31;
        String str26 = this.email;
        int hashCode63 = (hashCode62 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.skype;
        int hashCode64 = (hashCode63 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.facebook;
        int hashCode65 = (hashCode64 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.facebookName;
        int hashCode66 = (hashCode65 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.twitter;
        int hashCode67 = (hashCode66 + (str30 == null ? 0 : str30.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto8 = this.isAdult;
        int hashCode68 = (hashCode67 + (baseBoolIntDto8 == null ? 0 : baseBoolIntDto8.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto9 = this.isSubscribed;
        int hashCode69 = (hashCode68 + (baseBoolIntDto9 == null ? 0 : baseBoolIntDto9.hashCode())) * 31;
        Boolean bool3 = this.isSubscribedStories;
        int hashCode70 = (hashCode69 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.canSubscribeStories;
        int hashCode71 = (hashCode70 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.canAskQuestion;
        int hashCode72 = (hashCode71 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.canAskAnonymous;
        int hashCode73 = (hashCode72 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str31 = this.subscriptionCountry;
        int hashCode74 = (hashCode73 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.livejournal;
        int hashCode75 = (hashCode74 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.instagram;
        int hashCode76 = (hashCode75 + (str33 == null ? 0 : str33.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto10 = this.test;
        int hashCode77 = (hashCode76 + (baseBoolIntDto10 == null ? 0 : baseBoolIntDto10.hashCode())) * 31;
        VideoLiveInfoDto videoLiveInfoDto = this.videoLive;
        int hashCode78 = (hashCode77 + (videoLiveInfoDto == null ? 0 : videoLiveInfoDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto11 = this.isVideoLiveNotificationsBlocked;
        int hashCode79 = (hashCode78 + (baseBoolIntDto11 == null ? 0 : baseBoolIntDto11.hashCode())) * 31;
        Boolean bool7 = this.isService;
        int hashCode80 = (hashCode79 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str34 = this.serviceDescription;
        int hashCode81 = (hashCode80 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.photoRec;
        int hashCode82 = (hashCode81 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.photoMedium;
        int hashCode83 = (hashCode82 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.photoMediumRec;
        int hashCode84 = (hashCode83 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.photo;
        int hashCode85 = (hashCode84 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.photoBig;
        int hashCode86 = (hashCode85 + (str39 == null ? 0 : str39.hashCode())) * 31;
        String str40 = this.photo400;
        int hashCode87 = (hashCode86 + (str40 == null ? 0 : str40.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photoMaxSize;
        int hashCode88 = (hashCode87 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        List<List<UsersProfileButtonDto>> list8 = this.profileButtons;
        int hashCode89 = (hashCode88 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<List<UsersProfileButtonDto>> list9 = this.profileButtonsTablet;
        int hashCode90 = (hashCode89 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<UsersProfileButtonDto> list10 = this.thirdPartyButtons;
        int hashCode91 = (hashCode90 + (list10 == null ? 0 : list10.hashCode())) * 31;
        String str41 = this.language;
        int hashCode92 = (hashCode91 + (str41 == null ? 0 : str41.hashCode())) * 31;
        Integer num3 = this.storiesArchiveCount;
        int hashCode93 = (hashCode92 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool8 = this.hasUnseenStories;
        int hashCode94 = (hashCode93 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        WallDefaultDto wallDefaultDto = this.wallDefault;
        int hashCode95 = (hashCode94 + (wallDefaultDto == null ? 0 : wallDefaultDto.hashCode())) * 31;
        AudioMusicAwardsDto audioMusicAwardsDto = this.musicAwards;
        int hashCode96 = (hashCode95 + (audioMusicAwardsDto == null ? 0 : audioMusicAwardsDto.hashCode())) * 31;
        Boolean bool9 = this.canCall;
        int hashCode97 = (hashCode96 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.canCallFromGroup;
        int hashCode98 = (hashCode97 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.canInviteAsVoiceroomsSpeaker;
        int hashCode99 = (hashCode98 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.canSeeWishes;
        int hashCode100 = (hashCode99 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto12 = this.canSeeGifts;
        int hashCode101 = (hashCode100 + (baseBoolIntDto12 == null ? 0 : baseBoolIntDto12.hashCode())) * 31;
        List<BaseOwnerButtonDto> list11 = this.buttons;
        int hashCode102 = (hashCode101 + (list11 == null ? 0 : list11.hashCode())) * 31;
        String str42 = this.interests;
        int hashCode103 = (hashCode102 + (str42 == null ? 0 : str42.hashCode())) * 31;
        String str43 = this.books;
        int hashCode104 = (hashCode103 + (str43 == null ? 0 : str43.hashCode())) * 31;
        String str44 = this.tv;
        int hashCode105 = (hashCode104 + (str44 == null ? 0 : str44.hashCode())) * 31;
        String str45 = this.quotes;
        int hashCode106 = (hashCode105 + (str45 == null ? 0 : str45.hashCode())) * 31;
        String str46 = this.about;
        int hashCode107 = (hashCode106 + (str46 == null ? 0 : str46.hashCode())) * 31;
        String str47 = this.games;
        int hashCode108 = (hashCode107 + (str47 == null ? 0 : str47.hashCode())) * 31;
        String str48 = this.movies;
        int hashCode109 = (hashCode108 + (str48 == null ? 0 : str48.hashCode())) * 31;
        String str49 = this.activities;
        int hashCode110 = (hashCode109 + (str49 == null ? 0 : str49.hashCode())) * 31;
        String str50 = this.music;
        int hashCode111 = (hashCode110 + (str50 == null ? 0 : str50.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto13 = this.canWritePrivateMessage;
        int hashCode112 = (hashCode111 + (baseBoolIntDto13 == null ? 0 : baseBoolIntDto13.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto14 = this.canSendFriendRequest;
        int hashCode113 = (hashCode112 + (baseBoolIntDto14 == null ? 0 : baseBoolIntDto14.hashCode())) * 31;
        Boolean bool13 = this.canBeInvitedGroup;
        int hashCode114 = (hashCode113 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        String str51 = this.mobilePhone;
        int hashCode115 = (hashCode114 + (str51 == null ? 0 : str51.hashCode())) * 31;
        String str52 = this.homePhone;
        int hashCode116 = (hashCode115 + (str52 == null ? 0 : str52.hashCode())) * 31;
        String str53 = this.site;
        int hashCode117 = (hashCode116 + (str53 == null ? 0 : str53.hashCode())) * 31;
        AudioAudioDto audioAudioDto = this.statusAudio;
        int hashCode118 = (hashCode117 + (audioAudioDto == null ? 0 : audioAudioDto.hashCode())) * 31;
        String str54 = this.status;
        int hashCode119 = (hashCode118 + (str54 == null ? 0 : str54.hashCode())) * 31;
        String str55 = this.activity;
        int hashCode120 = (hashCode119 + (str55 == null ? 0 : str55.hashCode())) * 31;
        AppsAppMinDto appsAppMinDto = this.statusApp;
        int hashCode121 = (hashCode120 + (appsAppMinDto == null ? 0 : appsAppMinDto.hashCode())) * 31;
        UsersLastSeenDto usersLastSeenDto = this.lastSeen;
        int hashCode122 = (hashCode121 + (usersLastSeenDto == null ? 0 : usersLastSeenDto.hashCode())) * 31;
        UsersExportsDto usersExportsDto = this.exports;
        int hashCode123 = (hashCode122 + (usersExportsDto == null ? 0 : usersExportsDto.hashCode())) * 31;
        BaseCropPhotoDto baseCropPhotoDto = this.cropPhoto;
        int hashCode124 = (hashCode123 + (baseCropPhotoDto == null ? 0 : baseCropPhotoDto.hashCode())) * 31;
        Integer num4 = this.followersCount;
        int hashCode125 = (hashCode124 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.videoLiveLevel;
        int hashCode126 = (hashCode125 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.videoLiveCount;
        int hashCode127 = (hashCode126 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.clipsCount;
        int hashCode128 = (hashCode127 + (num7 == null ? 0 : num7.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto15 = this.blacklisted;
        int hashCode129 = (hashCode128 + (baseBoolIntDto15 == null ? 0 : baseBoolIntDto15.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto16 = this.blacklistedByMe;
        int hashCode130 = (hashCode129 + (baseBoolIntDto16 == null ? 0 : baseBoolIntDto16.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto17 = this.isFavorite;
        int hashCode131 = (hashCode130 + (baseBoolIntDto17 == null ? 0 : baseBoolIntDto17.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto18 = this.isHiddenFromFeed;
        int hashCode132 = (hashCode131 + (baseBoolIntDto18 == null ? 0 : baseBoolIntDto18.hashCode())) * 31;
        Integer num8 = this.commonCount;
        int hashCode133 = (hashCode132 + (num8 == null ? 0 : num8.hashCode())) * 31;
        UsersOccupationDto usersOccupationDto = this.occupation;
        int hashCode134 = (hashCode133 + (usersOccupationDto == null ? 0 : usersOccupationDto.hashCode())) * 31;
        List<UsersMilitaryDto> list12 = this.military;
        int hashCode135 = (hashCode134 + (list12 == null ? 0 : list12.hashCode())) * 31;
        Integer num9 = this.university;
        int hashCode136 = (hashCode135 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str56 = this.universityName;
        int hashCode137 = (hashCode136 + (str56 == null ? 0 : str56.hashCode())) * 31;
        Integer num10 = this.universityGroupId;
        int hashCode138 = (hashCode137 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.faculty;
        int hashCode139 = (hashCode138 + (num11 == null ? 0 : num11.hashCode())) * 31;
        String str57 = this.facultyName;
        int hashCode140 = (hashCode139 + (str57 == null ? 0 : str57.hashCode())) * 31;
        Integer num12 = this.graduation;
        int hashCode141 = (hashCode140 + (num12 == null ? 0 : num12.hashCode())) * 31;
        String str58 = this.educationForm;
        int hashCode142 = (hashCode141 + (str58 == null ? 0 : str58.hashCode())) * 31;
        String str59 = this.educationStatus;
        int hashCode143 = (hashCode142 + (str59 == null ? 0 : str59.hashCode())) * 31;
        String str60 = this.homeTown;
        int hashCode144 = (hashCode143 + (str60 == null ? 0 : str60.hashCode())) * 31;
        UsersUserRelationDto usersUserRelationDto = this.relation;
        int hashCode145 = (hashCode144 + (usersUserRelationDto == null ? 0 : usersUserRelationDto.hashCode())) * 31;
        UsersUserMinDto usersUserMinDto = this.relationPartner;
        int hashCode146 = (hashCode145 + (usersUserMinDto == null ? 0 : usersUserMinDto.hashCode())) * 31;
        UsersPersonalDto usersPersonalDto = this.personal;
        int hashCode147 = (hashCode146 + (usersPersonalDto == null ? 0 : usersPersonalDto.hashCode())) * 31;
        List<UsersUniversityDto> list13 = this.universities;
        int hashCode148 = (hashCode147 + (list13 == null ? 0 : list13.hashCode())) * 31;
        List<UsersSchoolDto> list14 = this.schools;
        int hashCode149 = (hashCode148 + (list14 == null ? 0 : list14.hashCode())) * 31;
        List<UsersRelativeDto> list15 = this.relatives;
        int hashCode150 = (hashCode149 + (list15 == null ? 0 : list15.hashCode())) * 31;
        Boolean bool14 = this.isSubscribedPodcasts;
        int hashCode151 = (hashCode150 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.canSubscribePodcasts;
        int hashCode152 = (hashCode151 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.canSubscribePosts;
        int hashCode153 = (hashCode152 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        Boolean bool17 = this.isStudent;
        int hashCode154 = (hashCode153 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Boolean bool18 = this.hasRights;
        int hashCode155 = (hashCode154 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        String str61 = this.sysUsername;
        int hashCode156 = (hashCode155 + (str61 == null ? 0 : str61.hashCode())) * 31;
        UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto = this.employeeWorkingState;
        int hashCode157 = (hashCode156 + (usersEmployeeWorkingStateDto == null ? 0 : usersEmployeeWorkingStateDto.hashCode())) * 31;
        EmployeeMarkDto employeeMarkDto = this.employeeMark;
        int hashCode158 = (hashCode157 + (employeeMarkDto == null ? 0 : employeeMarkDto.hashCode())) * 31;
        UsersRightsLocationDto usersRightsLocationDto = this.rightsLocation;
        int hashCode159 = (hashCode158 + (usersRightsLocationDto == null ? 0 : usersRightsLocationDto.hashCode())) * 31;
        Boolean bool19 = this.canInviteToChats;
        int hashCode160 = (hashCode159 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        UsersEmojiStatusDto usersEmojiStatusDto = this.emojiStatus;
        int hashCode161 = (hashCode160 + (usersEmojiStatusDto == null ? 0 : usersEmojiStatusDto.hashCode())) * 31;
        StatusImageStatusDto statusImageStatusDto = this.imageStatus;
        int hashCode162 = (hashCode161 + (statusImageStatusDto == null ? 0 : statusImageStatusDto.hashCode())) * 31;
        String str62 = this.accessKey;
        int hashCode163 = (hashCode162 + (str62 == null ? 0 : str62.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto19 = this.canUploadDoc;
        int hashCode164 = (hashCode163 + (baseBoolIntDto19 == null ? 0 : baseBoolIntDto19.hashCode())) * 31;
        Boolean bool20 = this.canBan;
        int hashCode165 = (hashCode164 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        List<String> list16 = this.eduDetails;
        int hashCode166 = (hashCode165 + (list16 == null ? 0 : list16.hashCode())) * 31;
        String str63 = this.hash;
        int hashCode167 = (hashCode166 + (str63 == null ? 0 : str63.hashCode())) * 31;
        Boolean bool21 = this.hasEmail;
        int hashCode168 = (hashCode167 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
        Boolean bool22 = this.isDead;
        int hashCode169 = (hashCode168 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
        UsersGiftsTooltipDto usersGiftsTooltipDto = this.giftsTooltip;
        int hashCode170 = (hashCode169 + (usersGiftsTooltipDto == null ? 0 : usersGiftsTooltipDto.hashCode())) * 31;
        NoIndexDto noIndexDto = this.noIndex;
        int hashCode171 = (hashCode170 + (noIndexDto == null ? 0 : noIndexDto.hashCode())) * 31;
        Integer num13 = this.contactId;
        int hashCode172 = (hashCode171 + (num13 == null ? 0 : num13.hashCode())) * 31;
        MessagesContactDto messagesContactDto = this.contact;
        int hashCode173 = (hashCode172 + (messagesContactDto == null ? 0 : messagesContactDto.hashCode())) * 31;
        Boolean bool23 = this.isMessageRequest;
        int hashCode174 = (hashCode173 + (bool23 == null ? 0 : bool23.hashCode())) * 31;
        List<String> list17 = this.descriptions;
        int hashCode175 = (hashCode174 + (list17 == null ? 0 : list17.hashCode())) * 31;
        List<Integer> list18 = this.lists;
        int hashCode176 = (hashCode175 + (list18 == null ? 0 : list18.hashCode())) * 31;
        Integer num14 = this.friendshipWeeks;
        int hashCode177 = (hashCode176 + (num14 == null ? 0 : num14.hashCode())) * 31;
        String str64 = this.trackCode;
        int hashCode178 = (hashCode177 + (str64 == null ? 0 : str64.hashCode())) * 31;
        Boolean bool24 = this.needBigMsgBtnInProfile;
        int hashCode179 = (hashCode178 + (bool24 == null ? 0 : bool24.hashCode())) * 31;
        UsersUserProfileTypeDto usersUserProfileTypeDto = this.profileType;
        int hashCode180 = (hashCode179 + (usersUserProfileTypeDto == null ? 0 : usersUserProfileTypeDto.hashCode())) * 31;
        UsersCanNotCallReasonDto usersCanNotCallReasonDto = this.canNotCallReason;
        int hashCode181 = (hashCode180 + (usersCanNotCallReasonDto == null ? 0 : usersCanNotCallReasonDto.hashCode())) * 31;
        Boolean bool25 = this.canCallAsCommunity;
        int hashCode182 = (hashCode181 + (bool25 == null ? 0 : bool25.hashCode())) * 31;
        Boolean bool26 = this.isNft;
        int hashCode183 = (hashCode182 + (bool26 == null ? 0 : bool26.hashCode())) * 31;
        BaseImageDto baseImageDto = this.animatedAvatar;
        int hashCode184 = (hashCode183 + (baseImageDto == null ? 0 : baseImageDto.hashCode())) * 31;
        List<CallsCustomNameForCallDto> list19 = this.customNamesForCalls;
        int hashCode185 = (hashCode184 + (list19 == null ? 0 : list19.hashCode())) * 31;
        Boolean bool27 = this.isEsiaVerified;
        int hashCode186 = (hashCode185 + (bool27 == null ? 0 : bool27.hashCode())) * 31;
        Boolean bool28 = this.isEsiaLinked;
        int hashCode187 = (hashCode186 + (bool28 == null ? 0 : bool28.hashCode())) * 31;
        Boolean bool29 = this.isTinkoffVerified;
        int hashCode188 = (hashCode187 + (bool29 == null ? 0 : bool29.hashCode())) * 31;
        Boolean bool30 = this.isTinkoffLinked;
        int hashCode189 = (hashCode188 + (bool30 == null ? 0 : bool30.hashCode())) * 31;
        Boolean bool31 = this.isSberVerified;
        int hashCode190 = (hashCode189 + (bool31 == null ? 0 : bool31.hashCode())) * 31;
        Boolean bool32 = this.isVerified;
        int hashCode191 = (hashCode190 + (bool32 == null ? 0 : bool32.hashCode())) * 31;
        Boolean bool33 = this.isFollowersModeOn;
        int hashCode192 = (hashCode191 + (bool33 == null ? 0 : bool33.hashCode())) * 31;
        SocialButtonTypeDto socialButtonTypeDto = this.socialButtonType;
        int hashCode193 = (hashCode192 + (socialButtonTypeDto == null ? 0 : socialButtonTypeDto.hashCode())) * 31;
        String str65 = this.description;
        int hashCode194 = (hashCode193 + (str65 == null ? 0 : str65.hashCode())) * 31;
        Boolean bool34 = this.isTeacher;
        int hashCode195 = (hashCode194 + (bool34 == null ? 0 : bool34.hashCode())) * 31;
        List<String> list20 = this.oauthLinked;
        int hashCode196 = (hashCode195 + (list20 == null ? 0 : list20.hashCode())) * 31;
        List<String> list21 = this.oauthVerification;
        int hashCode197 = (hashCode196 + (list21 == null ? 0 : list21.hashCode())) * 31;
        Boolean bool35 = this.isSberLinked;
        int hashCode198 = (hashCode197 + (bool35 == null ? 0 : bool35.hashCode())) * 31;
        Integer num15 = this.ageMark;
        int hashCode199 = (hashCode198 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.joined;
        int hashCode200 = (hashCode199 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Boolean bool36 = this.isServiceAccount;
        int hashCode201 = (hashCode200 + (bool36 == null ? 0 : bool36.hashCode())) * 31;
        UsersPromotionAllowanceDto usersPromotionAllowanceDto = this.promotionAllowance;
        int hashCode202 = (hashCode201 + (usersPromotionAllowanceDto == null ? 0 : usersPromotionAllowanceDto.hashCode())) * 31;
        Boolean bool37 = this.coOwnershipEnabled;
        int hashCode203 = (hashCode202 + (bool37 == null ? 0 : bool37.hashCode())) * 31;
        Integer num17 = this.ageGroup;
        int hashCode204 = (hashCode203 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Boolean bool38 = this.hasRelatedUserPin;
        int hashCode205 = (hashCode204 + (bool38 == null ? 0 : bool38.hashCode())) * 31;
        MessagesEduEducationalProfileDto messagesEduEducationalProfileDto = this.educationalProfile;
        int hashCode206 = (hashCode205 + (messagesEduEducationalProfileDto == null ? 0 : messagesEduEducationalProfileDto.hashCode())) * 31;
        BaseAPlusMarkDto baseAPlusMarkDto = this.aPlusMark;
        int hashCode207 = (hashCode206 + (baseAPlusMarkDto == null ? 0 : baseAPlusMarkDto.hashCode())) * 31;
        Boolean bool39 = this.isDon;
        int hashCode208 = (hashCode207 + (bool39 == null ? 0 : bool39.hashCode())) * 31;
        Boolean bool40 = this.isMediaModer;
        int hashCode209 = (hashCode208 + (bool40 == null ? 0 : bool40.hashCode())) * 31;
        Boolean bool41 = this.isPhotoMapEnabled;
        int hashCode210 = (hashCode209 + (bool41 == null ? 0 : bool41.hashCode())) * 31;
        UsersDonutDto usersDonutDto = this.donut;
        int hashCode211 = (hashCode210 + (usersDonutDto == null ? 0 : usersDonutDto.hashCode())) * 31;
        BaseSexDto baseSexDto = this.sex;
        int hashCode212 = (hashCode211 + (baseSexDto == null ? 0 : baseSexDto.hashCode())) * 31;
        String str66 = this.screenName;
        int hashCode213 = (hashCode212 + (str66 == null ? 0 : str66.hashCode())) * 31;
        String str67 = this.photo50;
        int hashCode214 = (hashCode213 + (str67 == null ? 0 : str67.hashCode())) * 31;
        String str68 = this.photo100;
        int hashCode215 = (hashCode214 + (str68 == null ? 0 : str68.hashCode())) * 31;
        String str69 = this.photoBase;
        int hashCode216 = (hashCode215 + (str69 == null ? 0 : str69.hashCode())) * 31;
        UsersOnlineInfoDto usersOnlineInfoDto = this.onlineInfo;
        int hashCode217 = (hashCode216 + (usersOnlineInfoDto == null ? 0 : usersOnlineInfoDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto20 = this.online;
        int hashCode218 = (hashCode217 + (baseBoolIntDto20 == null ? 0 : baseBoolIntDto20.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto21 = this.onlineMobile;
        int hashCode219 = (hashCode218 + (baseBoolIntDto21 == null ? 0 : baseBoolIntDto21.hashCode())) * 31;
        Integer num18 = this.onlineApp;
        int hashCode220 = (hashCode219 + (num18 == null ? 0 : num18.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto22 = this.verified;
        int hashCode221 = (hashCode220 + (baseBoolIntDto22 == null ? 0 : baseBoolIntDto22.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto23 = this.trending;
        int hashCode222 = (hashCode221 + (baseBoolIntDto23 == null ? 0 : baseBoolIntDto23.hashCode())) * 31;
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto = this.friendStatus;
        int hashCode223 = (hashCode222 + (friendsFriendStatusStatusDto == null ? 0 : friendsFriendStatusStatusDto.hashCode())) * 31;
        FriendsRequestsMutualDto friendsRequestsMutualDto = this.mutual;
        int hashCode224 = (hashCode223 + (friendsRequestsMutualDto == null ? 0 : friendsRequestsMutualDto.hashCode())) * 31;
        String str70 = this.deactivated;
        int hashCode225 = (hashCode224 + (str70 == null ? 0 : str70.hashCode())) * 31;
        String str71 = this.firstName;
        int hashCode226 = (hashCode225 + (str71 == null ? 0 : str71.hashCode())) * 31;
        Integer num19 = this.hidden;
        int hashCode227 = (hashCode226 + (num19 == null ? 0 : num19.hashCode())) * 31;
        String str72 = this.lastName;
        int hashCode228 = (hashCode227 + (str72 == null ? 0 : str72.hashCode())) * 31;
        Boolean bool42 = this.canAccessClosed;
        int hashCode229 = (hashCode228 + (bool42 == null ? 0 : bool42.hashCode())) * 31;
        Boolean bool43 = this.isClosed;
        int hashCode230 = (hashCode229 + (bool43 == null ? 0 : bool43.hashCode())) * 31;
        Boolean bool44 = this.isCached;
        return hashCode230 + (bool44 != null ? bool44.hashCode() : 0);
    }

    public final String i() {
        return this.adsEasyPromoteOnboardingName;
    }

    public final List<UsersMilitaryDto> i2() {
        return this.military;
    }

    public final String i3() {
        return this.serviceDescription;
    }

    public final Boolean i4() {
        return this.isService;
    }

    public final String j() {
        return this.bdate;
    }

    public final BaseBoolIntDto k() {
        return this.blacklisted;
    }

    public final BaseBoolIntDto l() {
        return this.blacklistedByMe;
    }

    public final Object l0() {
        return this.counters;
    }

    public final String l2() {
        return this.mobilePhone;
    }

    public final BaseBoolIntDto l4() {
        return this.isSubscribed;
    }

    public final String m2() {
        return this.movies;
    }

    public final String n() {
        return this.books;
    }

    public final UsersUserFullProfileFriendsBlockDto n1() {
        return this.friendsBlock;
    }

    public final List<BaseOwnerButtonDto> o() {
        return this.buttons;
    }

    public final Object o1() {
        return this.friendsRecommendations;
    }

    public final String o2() {
        return this.music;
    }

    public final BaseSexDto o3() {
        return this.sex;
    }

    public final Boolean p() {
        return this.canAccessClosed;
    }

    public final Integer p3() {
        return this.silentModeEndedAt;
    }

    public final Boolean p4() {
        return this.isSubscribedStories;
    }

    public final UsersUserFullProfileMutualFriendDto q2() {
        return this.mutualFriends;
    }

    public final UsersOccupationDto r2() {
        return this.occupation;
    }

    public final String r3() {
        return this.site;
    }

    public final String s1() {
        return this.games;
    }

    public final Boolean s4() {
        return this.isVerified;
    }

    public final UsersGiftsTooltipDto t1() {
        return this.giftsTooltip;
    }

    public final String t3() {
        return this.skype;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersUserFullProfileDto(id=");
        sb.append(this.id);
        sb.append(", career=");
        sb.append(this.career);
        sb.append(", cities=");
        sb.append(this.cities);
        sb.append(", countries=");
        sb.append(this.countries);
        sb.append(", displayFields=");
        sb.append(this.displayFields);
        sb.append(", silentModeEndedAt=");
        sb.append(this.silentModeEndedAt);
        sb.append(", isPersonalAdsEasyPromoteEnabled=");
        sb.append(this.isPersonalAdsEasyPromoteEnabled);
        sb.append(", adsEasyPromoteOnboardingName=");
        sb.append(this.adsEasyPromoteOnboardingName);
        sb.append(", canSeeArchivedPosts=");
        sb.append(this.canSeeArchivedPosts);
        sb.append(", relativesProfiles=");
        sb.append(this.relativesProfiles);
        sb.append(", extendedStatus=");
        sb.append(this.extendedStatus);
        sb.append(", photos=");
        sb.append(this.photos);
        sb.append(", counters=");
        sb.append(this.counters);
        sb.append(", mutualFriends=");
        sb.append(this.mutualFriends);
        sb.append(", friends=");
        sb.append(this.friends);
        sb.append(", requestsBlock=");
        sb.append(this.requestsBlock);
        sb.append(", followersBlock=");
        sb.append(this.followersBlock);
        sb.append(", occupationGroup=");
        sb.append(this.occupationGroup);
        sb.append(", stories=");
        sb.append(this.stories);
        sb.append(", friendsBlock=");
        sb.append(this.friendsBlock);
        sb.append(", tabs=");
        sb.append(this.tabs);
        sb.append(", receivedThrows=");
        sb.append(this.receivedThrows);
        sb.append(", friendsRecommendations=");
        sb.append(this.friendsRecommendations);
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

    public final Boolean u() {
        return this.canAskAnonymous;
    }

    public final SocialButtonTypeDto u3() {
        return this.socialButtonType;
    }

    public final BaseCountryDto v0() {
        return this.country;
    }

    public final BaseOwnerCoverDto w0() {
        return this.cover;
    }

    public final String w3() {
        return this.status;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        List<UsersUserFullProfileCareerDto> list = this.career;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((UsersUserFullProfileCareerDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<Integer> list2 = this.cities;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeInt(((Number) f2.next()).intValue());
            }
        }
        List<Integer> list3 = this.countries;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeInt(((Number) f3.next()).intValue());
            }
        }
        parcel.writeStringList(this.displayFields);
        Integer num = this.silentModeEndedAt;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.isPersonalAdsEasyPromoteEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.adsEasyPromoteOnboardingName);
        Integer num2 = this.canSeeArchivedPosts;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        List<UsersUserFullDto> list4 = this.relativesProfiles;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                parcel.writeParcelable((Parcelable) f4.next(), i);
            }
        }
        StatusStatusDto statusStatusDto = this.extendedStatus;
        if (statusStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            statusStatusDto.writeToParcel(parcel, i);
        }
        PhotosPhotoAllDto photosPhotoAllDto = this.photos;
        if (photosPhotoAllDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photosPhotoAllDto.writeToParcel(parcel, i);
        }
        parcel.writeValue(this.counters);
        UsersUserFullProfileMutualFriendDto usersUserFullProfileMutualFriendDto = this.mutualFriends;
        if (usersUserFullProfileMutualFriendDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersUserFullProfileMutualFriendDto.writeToParcel(parcel, i);
        }
        List<UsersUserFullDto> list5 = this.friends;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                parcel.writeParcelable((Parcelable) f5.next(), i);
            }
        }
        UsersUserFullProfileRequestsBlockDto usersUserFullProfileRequestsBlockDto = this.requestsBlock;
        if (usersUserFullProfileRequestsBlockDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersUserFullProfileRequestsBlockDto.writeToParcel(parcel, i);
        }
        UsersUserFullProfileFollowersBlockDto usersUserFullProfileFollowersBlockDto = this.followersBlock;
        if (usersUserFullProfileFollowersBlockDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersUserFullProfileFollowersBlockDto.writeToParcel(parcel, i);
        }
        List<GroupsGroupFullDto> list6 = this.occupationGroup;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f6 = dn.f(parcel, list6, 1);
            while (f6.hasNext()) {
                parcel.writeParcelable((Parcelable) f6.next(), i);
            }
        }
        StoriesUserFullProfileDto storiesUserFullProfileDto = this.stories;
        if (storiesUserFullProfileDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storiesUserFullProfileDto.writeToParcel(parcel, i);
        }
        UsersUserFullProfileFriendsBlockDto usersUserFullProfileFriendsBlockDto = this.friendsBlock;
        if (usersUserFullProfileFriendsBlockDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersUserFullProfileFriendsBlockDto.writeToParcel(parcel, i);
        }
        parcel.writeValue(this.tabs);
        parcel.writeValue(this.receivedThrows);
        parcel.writeValue(this.friendsRecommendations);
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
        Float f7 = this.timezone;
        if (f7 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f7);
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
        Boolean bool2 = this.isBestFriend;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
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
        Boolean bool3 = this.isSubscribedStories;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.canSubscribeStories;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.canAskQuestion;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        Boolean bool6 = this.canAskAnonymous;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        parcel.writeString(this.subscriptionCountry);
        parcel.writeString(this.livejournal);
        parcel.writeString(this.instagram);
        parcel.writeParcelable(this.test, i);
        parcel.writeParcelable(this.videoLive, i);
        parcel.writeParcelable(this.isVideoLiveNotificationsBlocked, i);
        Boolean bool7 = this.isService;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        parcel.writeString(this.serviceDescription);
        parcel.writeString(this.photoRec);
        parcel.writeString(this.photoMedium);
        parcel.writeString(this.photoMediumRec);
        parcel.writeString(this.photo);
        parcel.writeString(this.photoBig);
        parcel.writeString(this.photo400);
        parcel.writeParcelable(this.photoMaxSize, i);
        List<List<UsersProfileButtonDto>> list7 = this.profileButtons;
        if (list7 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f8 = dn.f(parcel, list7, 1);
            while (f8.hasNext()) {
                Iterator a2 = ao.a(parcel, (List) f8.next());
                while (a2.hasNext()) {
                    parcel.writeParcelable((Parcelable) a2.next(), i);
                }
            }
        }
        List<List<UsersProfileButtonDto>> list8 = this.profileButtonsTablet;
        if (list8 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f9 = dn.f(parcel, list8, 1);
            while (f9.hasNext()) {
                Iterator a3 = ao.a(parcel, (List) f9.next());
                while (a3.hasNext()) {
                    parcel.writeParcelable((Parcelable) a3.next(), i);
                }
            }
        }
        List<UsersProfileButtonDto> list9 = this.thirdPartyButtons;
        if (list9 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f10 = dn.f(parcel, list9, 1);
            while (f10.hasNext()) {
                parcel.writeParcelable((Parcelable) f10.next(), i);
            }
        }
        parcel.writeString(this.language);
        Integer num3 = this.storiesArchiveCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Boolean bool8 = this.hasUnseenStories;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool8);
        }
        WallDefaultDto wallDefaultDto = this.wallDefault;
        if (wallDefaultDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallDefaultDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.musicAwards, i);
        Boolean bool9 = this.canCall;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool9);
        }
        Boolean bool10 = this.canCallFromGroup;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool10);
        }
        Boolean bool11 = this.canInviteAsVoiceroomsSpeaker;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool11);
        }
        Boolean bool12 = this.canSeeWishes;
        if (bool12 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool12);
        }
        parcel.writeParcelable(this.canSeeGifts, i);
        List<BaseOwnerButtonDto> list10 = this.buttons;
        if (list10 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f11 = dn.f(parcel, list10, 1);
            while (f11.hasNext()) {
                parcel.writeParcelable((Parcelable) f11.next(), i);
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
        Boolean bool13 = this.canBeInvitedGroup;
        if (bool13 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool13);
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
        Integer num8 = this.commonCount;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num8);
        }
        parcel.writeParcelable(this.occupation, i);
        List<UsersMilitaryDto> list11 = this.military;
        if (list11 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f12 = dn.f(parcel, list11, 1);
            while (f12.hasNext()) {
                parcel.writeParcelable((Parcelable) f12.next(), i);
            }
        }
        Integer num9 = this.university;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num9);
        }
        parcel.writeString(this.universityName);
        Integer num10 = this.universityGroupId;
        if (num10 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num10);
        }
        Integer num11 = this.faculty;
        if (num11 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num11);
        }
        parcel.writeString(this.facultyName);
        Integer num12 = this.graduation;
        if (num12 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num12);
        }
        parcel.writeString(this.educationForm);
        parcel.writeString(this.educationStatus);
        parcel.writeString(this.homeTown);
        parcel.writeParcelable(this.relation, i);
        parcel.writeParcelable(this.relationPartner, i);
        parcel.writeParcelable(this.personal, i);
        List<UsersUniversityDto> list12 = this.universities;
        if (list12 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f13 = dn.f(parcel, list12, 1);
            while (f13.hasNext()) {
                parcel.writeParcelable((Parcelable) f13.next(), i);
            }
        }
        List<UsersSchoolDto> list13 = this.schools;
        if (list13 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f14 = dn.f(parcel, list13, 1);
            while (f14.hasNext()) {
                parcel.writeParcelable((Parcelable) f14.next(), i);
            }
        }
        List<UsersRelativeDto> list14 = this.relatives;
        if (list14 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f15 = dn.f(parcel, list14, 1);
            while (f15.hasNext()) {
                parcel.writeParcelable((Parcelable) f15.next(), i);
            }
        }
        Boolean bool14 = this.isSubscribedPodcasts;
        if (bool14 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool14);
        }
        Boolean bool15 = this.canSubscribePodcasts;
        if (bool15 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool15);
        }
        Boolean bool16 = this.canSubscribePosts;
        if (bool16 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool16);
        }
        Boolean bool17 = this.isStudent;
        if (bool17 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool17);
        }
        Boolean bool18 = this.hasRights;
        if (bool18 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool18);
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
        Boolean bool19 = this.canInviteToChats;
        if (bool19 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool19);
        }
        parcel.writeParcelable(this.emojiStatus, i);
        parcel.writeParcelable(this.imageStatus, i);
        parcel.writeString(this.accessKey);
        parcel.writeParcelable(this.canUploadDoc, i);
        Boolean bool20 = this.canBan;
        if (bool20 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool20);
        }
        parcel.writeStringList(this.eduDetails);
        parcel.writeString(this.hash);
        Boolean bool21 = this.hasEmail;
        if (bool21 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool21);
        }
        Boolean bool22 = this.isDead;
        if (bool22 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool22);
        }
        parcel.writeParcelable(this.giftsTooltip, i);
        NoIndexDto noIndexDto = this.noIndex;
        if (noIndexDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            noIndexDto.writeToParcel(parcel, i);
        }
        Integer num13 = this.contactId;
        if (num13 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num13);
        }
        parcel.writeParcelable(this.contact, i);
        Boolean bool23 = this.isMessageRequest;
        if (bool23 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool23);
        }
        parcel.writeStringList(this.descriptions);
        List<Integer> list15 = this.lists;
        if (list15 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f16 = dn.f(parcel, list15, 1);
            while (f16.hasNext()) {
                parcel.writeInt(((Number) f16.next()).intValue());
            }
        }
        Integer num14 = this.friendshipWeeks;
        if (num14 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num14);
        }
        parcel.writeString(this.trackCode);
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
        List<CallsCustomNameForCallDto> list16 = this.customNamesForCalls;
        if (list16 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f17 = dn.f(parcel, list16, 1);
            while (f17.hasNext()) {
                parcel.writeParcelable((Parcelable) f17.next(), i);
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
        Integer num15 = this.ageMark;
        if (num15 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num15);
        }
        Integer num16 = this.joined;
        if (num16 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num16);
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
        Integer num17 = this.ageGroup;
        if (num17 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num17);
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
        Integer num18 = this.onlineApp;
        if (num18 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num18);
        }
        parcel.writeParcelable(this.verified, i);
        parcel.writeParcelable(this.trending, i);
        parcel.writeParcelable(this.friendStatus, i);
        parcel.writeParcelable(this.mutual, i);
        parcel.writeString(this.deactivated);
        parcel.writeString(this.firstName);
        Integer num19 = this.hidden;
        if (num19 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num19);
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

    public final BaseBoolIntDto x1() {
        return this.hasPhoto;
    }

    public final UsersDonutDto y0() {
        return this.donut;
    }

    public final String y1() {
        return this.homePhone;
    }

    public final List<GroupsGroupFullDto> y2() {
        return this.occupationGroup;
    }

    public final AudioAudioDto y3() {
        return this.statusAudio;
    }

    public final String z1() {
        return this.homeTown;
    }

    public final StoriesUserFullProfileDto z3() {
        return this.stories;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ UsersUserFullProfileDto(UserId userId, List list, List list2, List list3, List list4, Integer num, Boolean bool, String str, Integer num2, List list5, StatusStatusDto statusStatusDto, PhotosPhotoAllDto photosPhotoAllDto, Object obj, UsersUserFullProfileMutualFriendDto usersUserFullProfileMutualFriendDto, List list6, UsersUserFullProfileRequestsBlockDto usersUserFullProfileRequestsBlockDto, UsersUserFullProfileFollowersBlockDto usersUserFullProfileFollowersBlockDto, List list7, StoriesUserFullProfileDto storiesUserFullProfileDto, UsersUserFullProfileFriendsBlockDto usersUserFullProfileFriendsBlockDto, Object obj2, Object obj3, Object obj4, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, BdateVisibilityDto bdateVisibilityDto, BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, Float f, OwnerStateDto ownerStateDto, String str19, String str20, String str21, String str22, String str23, String str24, BaseBoolIntDto baseBoolIntDto, BaseOwnerCoverDto baseOwnerCoverDto, String str25, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Boolean bool2, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, UsersUserTypeDto usersUserTypeDto, String str26, String str27, String str28, String str29, String str30, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str31, String str32, String str33, BaseBoolIntDto baseBoolIntDto10, VideoLiveInfoDto videoLiveInfoDto, BaseBoolIntDto baseBoolIntDto11, Boolean bool7, String str34, String str35, String str36, String str37, String str38, String str39, String str40, PhotosPhotoDto photosPhotoDto, List list8, List list9, List list10, String str41, Integer num3, Boolean bool8, WallDefaultDto wallDefaultDto, AudioMusicAwardsDto audioMusicAwardsDto, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, BaseBoolIntDto baseBoolIntDto12, List list11, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, BaseBoolIntDto baseBoolIntDto13, BaseBoolIntDto baseBoolIntDto14, Boolean bool13, String str51, String str52, String str53, AudioAudioDto audioAudioDto, String str54, String str55, AppsAppMinDto appsAppMinDto, UsersLastSeenDto usersLastSeenDto, UsersExportsDto usersExportsDto, BaseCropPhotoDto baseCropPhotoDto, Integer num4, Integer num5, Integer num6, Integer num7, BaseBoolIntDto baseBoolIntDto15, BaseBoolIntDto baseBoolIntDto16, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, Integer num8, UsersOccupationDto usersOccupationDto, List list12, Integer num9, String str56, Integer num10, Integer num11, String str57, Integer num12, String str58, String str59, String str60, UsersUserRelationDto usersUserRelationDto, UsersUserMinDto usersUserMinDto, UsersPersonalDto usersPersonalDto, List list13, List list14, List list15, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, String str61, UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto, EmployeeMarkDto employeeMarkDto, UsersRightsLocationDto usersRightsLocationDto, Boolean bool19, UsersEmojiStatusDto usersEmojiStatusDto, StatusImageStatusDto statusImageStatusDto, String str62, BaseBoolIntDto baseBoolIntDto19, Boolean bool20, List list16, String str63, Boolean bool21, Boolean bool22, UsersGiftsTooltipDto usersGiftsTooltipDto, NoIndexDto noIndexDto, Integer num13, MessagesContactDto messagesContactDto, Boolean bool23, List list17, List list18, Integer num14, String str64, Boolean bool24, UsersUserProfileTypeDto usersUserProfileTypeDto, UsersCanNotCallReasonDto usersCanNotCallReasonDto, Boolean bool25, Boolean bool26, BaseImageDto baseImageDto, List list19, Boolean bool27, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, Boolean bool33, SocialButtonTypeDto socialButtonTypeDto, String str65, Boolean bool34, List list20, List list21, Boolean bool35, Integer num15, Integer num16, Boolean bool36, UsersPromotionAllowanceDto usersPromotionAllowanceDto, Boolean bool37, Integer num17, Boolean bool38, MessagesEduEducationalProfileDto messagesEduEducationalProfileDto, BaseAPlusMarkDto baseAPlusMarkDto, Boolean bool39, Boolean bool40, Boolean bool41, UsersDonutDto usersDonutDto, BaseSexDto baseSexDto, String str66, String str67, String str68, String str69, UsersOnlineInfoDto usersOnlineInfoDto, BaseBoolIntDto baseBoolIntDto20, BaseBoolIntDto baseBoolIntDto21, Integer num18, BaseBoolIntDto baseBoolIntDto22, BaseBoolIntDto baseBoolIntDto23, FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, FriendsRequestsMutualDto friendsRequestsMutualDto, String str70, String str71, Integer num19, String str72, Boolean bool42, Boolean bool43, Boolean bool44, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, zcl zclVar) {
        this(userId, r178, r10, r11, r12, r13, r14, r15, r9, r179, r180, r181, r182, r183, r8, r17, r19, r21, r23, r25, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r184, r39, r40, r41, r42, r43, r44, r45, r185, r186, r187, r188, r189, r190, r191, r192, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r1, r62, r63, r64, r65, r66, r67, r68, r193, r194, r195, r196, r197, r198, r199, r200, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r2, r85, r86, r87, r88, r89, r90, r91, r201, r202, r203, r204, r205, r206, r207, r208, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r3, r108, r109, r110, r111, r112, r113, r114, r209, r210, r211, r212, r213, r214, r215, r0, (i5 & 32768) != 0 ? null : str60, (i5 & 65536) != 0 ? null : usersUserRelationDto, (i5 & 131072) != 0 ? null : usersUserMinDto, (i5 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : usersPersonalDto, (i5 & 524288) != 0 ? null : list13, (i5 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : list14, (i5 & 2097152) != 0 ? null : list15, (i5 & 4194304) != 0 ? null : bool14, (i5 & 8388608) != 0 ? null : bool15, (i5 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : bool16, (i5 & 33554432) != 0 ? null : bool17, (i5 & 67108864) != 0 ? null : bool18, (i5 & 134217728) != 0 ? null : str61, (i5 & 268435456) != 0 ? null : usersEmployeeWorkingStateDto, (i5 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : employeeMarkDto, (i5 & 1073741824) != 0 ? null : usersRightsLocationDto, (i5 & Integer.MIN_VALUE) != 0 ? null : bool19, (i6 & 1) != 0 ? null : usersEmojiStatusDto, (i6 & 2) != 0 ? null : statusImageStatusDto, (i6 & 4) != 0 ? null : str62, (i6 & 8) != 0 ? null : baseBoolIntDto19, (i6 & 16) != 0 ? null : bool20, (i6 & 32) != 0 ? null : list16, (i6 & 64) != 0 ? null : str63, (i6 & 128) != 0 ? null : bool21, (i6 & 256) != 0 ? null : bool22, (i6 & 512) != 0 ? null : usersGiftsTooltipDto, (i6 & 1024) != 0 ? null : noIndexDto, (i6 & 2048) != 0 ? null : num13, (i6 & 4096) != 0 ? null : messagesContactDto, (i6 & 8192) != 0 ? null : bool23, (i6 & 16384) != 0 ? null : list17, (i6 & 32768) != 0 ? null : list18, (i6 & 65536) != 0 ? null : num14, (i6 & 131072) != 0 ? null : str64, (i6 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool24, (i6 & 524288) != 0 ? null : usersUserProfileTypeDto, (i6 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : usersCanNotCallReasonDto, (i6 & 2097152) != 0 ? null : bool25, (i6 & 4194304) != 0 ? null : bool26, (i6 & 8388608) != 0 ? null : baseImageDto, (i6 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : list19, (i6 & 33554432) != 0 ? null : bool27, (i6 & 67108864) != 0 ? null : bool28, (i6 & 134217728) != 0 ? null : bool29, (i6 & 268435456) != 0 ? null : bool30, (i6 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool31, (i6 & 1073741824) != 0 ? null : bool32, (i6 & Integer.MIN_VALUE) != 0 ? null : bool33, (i7 & 1) != 0 ? null : socialButtonTypeDto, (i7 & 2) != 0 ? null : str65, (i7 & 4) != 0 ? null : bool34, (i7 & 8) != 0 ? null : list20, (i7 & 16) != 0 ? null : list21, (i7 & 32) != 0 ? null : bool35, (i7 & 64) != 0 ? null : num15, (i7 & 128) != 0 ? null : num16, (i7 & 256) != 0 ? null : bool36, (i7 & 512) != 0 ? null : usersPromotionAllowanceDto, (i7 & 1024) != 0 ? null : bool37, (i7 & 2048) != 0 ? null : num17, (i7 & 4096) != 0 ? null : bool38, (i7 & 8192) != 0 ? null : messagesEduEducationalProfileDto, (i7 & 16384) != 0 ? null : baseAPlusMarkDto, (i7 & 32768) != 0 ? null : bool39, (i7 & 65536) != 0 ? null : bool40, (i7 & 131072) != 0 ? null : bool41, (i7 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : usersDonutDto, (i7 & 524288) != 0 ? null : baseSexDto, (i7 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str66, (i7 & 2097152) != 0 ? null : str67, (i7 & 4194304) != 0 ? null : str68, (i7 & 8388608) != 0 ? null : str69, (i7 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : usersOnlineInfoDto, (i7 & 33554432) != 0 ? null : baseBoolIntDto20, (i7 & 67108864) != 0 ? null : baseBoolIntDto21, (i7 & 134217728) != 0 ? null : num18, (i7 & 268435456) != 0 ? null : baseBoolIntDto22, (i7 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : baseBoolIntDto23, (i7 & 1073741824) != 0 ? null : friendsFriendStatusStatusDto, (i7 & Integer.MIN_VALUE) != 0 ? null : friendsRequestsMutualDto, (i8 & 1) != 0 ? null : str70, (i8 & 2) != 0 ? null : str71, (i8 & 4) != 0 ? null : num19, (i8 & 8) != 0 ? null : str72, (i8 & 16) != 0 ? null : bool42, (i8 & 32) != 0 ? null : bool43, (i8 & 64) != 0 ? null : bool44);
        List list22 = (i & 2) != 0 ? null : list;
        List list23 = (i & 4) != 0 ? null : list2;
        List list24 = (i & 8) != 0 ? null : list3;
        List list25 = (i & 16) != 0 ? null : list4;
        Integer num20 = (i & 32) != 0 ? null : num;
        Boolean bool45 = (i & 64) != 0 ? null : bool;
        String str73 = (i & 128) != 0 ? null : str;
        Integer num21 = (i & 256) != 0 ? null : num2;
        List list26 = list22;
        List list27 = (i & 512) != 0 ? null : list5;
        StatusStatusDto statusStatusDto2 = (i & 1024) != 0 ? null : statusStatusDto;
        PhotosPhotoAllDto photosPhotoAllDto2 = (i & 2048) != 0 ? null : photosPhotoAllDto;
        Object obj5 = (i & 4096) != 0 ? null : obj;
        UsersUserFullProfileMutualFriendDto usersUserFullProfileMutualFriendDto2 = (i & 8192) != 0 ? null : usersUserFullProfileMutualFriendDto;
        List list28 = (i & 16384) != 0 ? null : list6;
        UsersUserFullProfileRequestsBlockDto usersUserFullProfileRequestsBlockDto2 = (i & 32768) != 0 ? null : usersUserFullProfileRequestsBlockDto;
        UsersUserFullProfileFollowersBlockDto usersUserFullProfileFollowersBlockDto2 = (i & 65536) != 0 ? null : usersUserFullProfileFollowersBlockDto;
        List list29 = (i & 131072) != 0 ? null : list7;
        StoriesUserFullProfileDto storiesUserFullProfileDto2 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : storiesUserFullProfileDto;
        UsersUserFullProfileFriendsBlockDto usersUserFullProfileFriendsBlockDto2 = (i & 524288) != 0 ? null : usersUserFullProfileFriendsBlockDto;
        Object obj6 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : obj2;
        Object obj7 = (i & 2097152) != 0 ? null : obj3;
        Object obj8 = (i & 4194304) != 0 ? null : obj4;
        String str74 = (i & 8388608) != 0 ? null : str2;
        String str75 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str3;
        String str76 = (i & 33554432) != 0 ? null : str4;
        String str77 = (i & 67108864) != 0 ? null : str5;
        String str78 = (i & 134217728) != 0 ? null : str6;
        String str79 = (i & 268435456) != 0 ? null : str7;
        String str80 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str8;
        String str81 = (i & 1073741824) != 0 ? null : str9;
        String str82 = (i & Integer.MIN_VALUE) != 0 ? null : str10;
        String str83 = (i2 & 1) != 0 ? null : str11;
        String str84 = (i2 & 2) != 0 ? null : str12;
        String str85 = (i2 & 4) != 0 ? null : str13;
        String str86 = (i2 & 8) != 0 ? null : str14;
        String str87 = (i2 & 16) != 0 ? null : str15;
        String str88 = (i2 & 32) != 0 ? null : str16;
        String str89 = (i2 & 64) != 0 ? null : str17;
        String str90 = str82;
        String str91 = (i2 & 128) != 0 ? null : str18;
        BdateVisibilityDto bdateVisibilityDto2 = (i2 & 256) != 0 ? null : bdateVisibilityDto;
        BaseCityDto baseCityDto2 = (i2 & 512) != 0 ? null : baseCityDto;
        BaseCountryDto baseCountryDto2 = (i2 & 1024) != 0 ? null : baseCountryDto;
        Float f2 = (i2 & 2048) != 0 ? null : f;
        OwnerStateDto ownerStateDto2 = (i2 & 4096) != 0 ? null : ownerStateDto;
        String str92 = (i2 & 8192) != 0 ? null : str19;
        String str93 = (i2 & 16384) != 0 ? null : str20;
        String str94 = (i2 & 32768) != 0 ? null : str21;
        String str95 = (i2 & 65536) != 0 ? null : str22;
        String str96 = (i2 & 131072) != 0 ? null : str23;
        String str97 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str24;
        BaseBoolIntDto baseBoolIntDto24 = (i2 & 524288) != 0 ? null : baseBoolIntDto;
        BaseOwnerCoverDto baseOwnerCoverDto2 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : baseOwnerCoverDto;
        String str98 = (i2 & 2097152) != 0 ? null : str25;
        BaseBoolIntDto baseBoolIntDto25 = (i2 & 4194304) != 0 ? null : baseBoolIntDto2;
        BaseBoolIntDto baseBoolIntDto26 = (i2 & 8388608) != 0 ? null : baseBoolIntDto3;
        Boolean bool46 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : bool2;
        BaseBoolIntDto baseBoolIntDto27 = (i2 & 33554432) != 0 ? null : baseBoolIntDto4;
        BaseBoolIntDto baseBoolIntDto28 = (i2 & 67108864) != 0 ? null : baseBoolIntDto5;
        BaseBoolIntDto baseBoolIntDto29 = (i2 & 134217728) != 0 ? null : baseBoolIntDto6;
        BaseBoolIntDto baseBoolIntDto30 = (i2 & 268435456) != 0 ? null : baseBoolIntDto7;
        UsersUserTypeDto usersUserTypeDto2 = (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : usersUserTypeDto;
        String str99 = (i2 & 1073741824) != 0 ? null : str26;
        String str100 = (i2 & Integer.MIN_VALUE) != 0 ? null : str27;
        String str101 = (i3 & 1) != 0 ? null : str28;
        String str102 = (i3 & 2) != 0 ? null : str29;
        String str103 = (i3 & 4) != 0 ? null : str30;
        BaseBoolIntDto baseBoolIntDto31 = (i3 & 8) != 0 ? null : baseBoolIntDto8;
        BaseBoolIntDto baseBoolIntDto32 = (i3 & 16) != 0 ? null : baseBoolIntDto9;
        Boolean bool47 = (i3 & 32) != 0 ? null : bool3;
        Boolean bool48 = (i3 & 64) != 0 ? null : bool4;
        String str104 = str93;
        Boolean bool49 = (i3 & 128) != 0 ? null : bool5;
        Boolean bool50 = (i3 & 256) != 0 ? null : bool6;
        String str105 = (i3 & 512) != 0 ? null : str31;
        String str106 = (i3 & 1024) != 0 ? null : str32;
        String str107 = (i3 & 2048) != 0 ? null : str33;
        BaseBoolIntDto baseBoolIntDto33 = (i3 & 4096) != 0 ? null : baseBoolIntDto10;
        VideoLiveInfoDto videoLiveInfoDto2 = (i3 & 8192) != 0 ? null : videoLiveInfoDto;
        BaseBoolIntDto baseBoolIntDto34 = (i3 & 16384) != 0 ? null : baseBoolIntDto11;
        Boolean bool51 = (i3 & 32768) != 0 ? null : bool7;
        String str108 = (i3 & 65536) != 0 ? null : str34;
        String str109 = (i3 & 131072) != 0 ? null : str35;
        String str110 = (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str36;
        String str111 = (i3 & 524288) != 0 ? null : str37;
        String str112 = (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str38;
        String str113 = (i3 & 2097152) != 0 ? null : str39;
        String str114 = (i3 & 4194304) != 0 ? null : str40;
        PhotosPhotoDto photosPhotoDto2 = (i3 & 8388608) != 0 ? null : photosPhotoDto;
        List list30 = (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : list8;
        List list31 = (i3 & 33554432) != 0 ? null : list9;
        List list32 = (i3 & 67108864) != 0 ? null : list10;
        String str115 = (i3 & 134217728) != 0 ? null : str41;
        Integer num22 = (i3 & 268435456) != 0 ? null : num3;
        Boolean bool52 = (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool8;
        WallDefaultDto wallDefaultDto2 = (i3 & 1073741824) != 0 ? null : wallDefaultDto;
        AudioMusicAwardsDto audioMusicAwardsDto2 = (i3 & Integer.MIN_VALUE) != 0 ? null : audioMusicAwardsDto;
        Boolean bool53 = (i4 & 1) != 0 ? null : bool9;
        Boolean bool54 = (i4 & 2) != 0 ? null : bool10;
        Boolean bool55 = (i4 & 4) != 0 ? null : bool11;
        Boolean bool56 = (i4 & 8) != 0 ? null : bool12;
        BaseBoolIntDto baseBoolIntDto35 = (i4 & 16) != 0 ? null : baseBoolIntDto12;
        List list33 = (i4 & 32) != 0 ? null : list11;
        String str116 = (i4 & 64) != 0 ? null : str42;
        BaseBoolIntDto baseBoolIntDto36 = baseBoolIntDto34;
        String str117 = (i4 & 128) != 0 ? null : str43;
        String str118 = (i4 & 256) != 0 ? null : str44;
        String str119 = (i4 & 512) != 0 ? null : str45;
        String str120 = (i4 & 1024) != 0 ? null : str46;
        String str121 = (i4 & 2048) != 0 ? null : str47;
        String str122 = (i4 & 4096) != 0 ? null : str48;
        String str123 = (i4 & 8192) != 0 ? null : str49;
        String str124 = (i4 & 16384) != 0 ? null : str50;
        BaseBoolIntDto baseBoolIntDto37 = (i4 & 32768) != 0 ? null : baseBoolIntDto13;
        BaseBoolIntDto baseBoolIntDto38 = (i4 & 65536) != 0 ? null : baseBoolIntDto14;
        Boolean bool57 = (i4 & 131072) != 0 ? null : bool13;
        String str125 = (i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str51;
        String str126 = (i4 & 524288) != 0 ? null : str52;
        String str127 = (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str53;
        AudioAudioDto audioAudioDto2 = (i4 & 2097152) != 0 ? null : audioAudioDto;
        String str128 = (i4 & 4194304) != 0 ? null : str54;
        String str129 = (i4 & 8388608) != 0 ? null : str55;
        AppsAppMinDto appsAppMinDto2 = (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : appsAppMinDto;
        UsersLastSeenDto usersLastSeenDto2 = (i4 & 33554432) != 0 ? null : usersLastSeenDto;
        UsersExportsDto usersExportsDto2 = (i4 & 67108864) != 0 ? null : usersExportsDto;
        BaseCropPhotoDto baseCropPhotoDto2 = (i4 & 134217728) != 0 ? null : baseCropPhotoDto;
        Integer num23 = (i4 & 268435456) != 0 ? null : num4;
        Integer num24 = (i4 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : num5;
        Integer num25 = (i4 & 1073741824) != 0 ? null : num6;
        Integer num26 = (i4 & Integer.MIN_VALUE) != 0 ? null : num7;
        BaseBoolIntDto baseBoolIntDto39 = (i5 & 1) != 0 ? null : baseBoolIntDto15;
        BaseBoolIntDto baseBoolIntDto40 = (i5 & 2) != 0 ? null : baseBoolIntDto16;
        BaseBoolIntDto baseBoolIntDto41 = (i5 & 4) != 0 ? null : baseBoolIntDto17;
        BaseBoolIntDto baseBoolIntDto42 = (i5 & 8) != 0 ? null : baseBoolIntDto18;
        Integer num27 = (i5 & 16) != 0 ? null : num8;
        UsersOccupationDto usersOccupationDto2 = (i5 & 32) != 0 ? null : usersOccupationDto;
        List list34 = (i5 & 64) != 0 ? null : list12;
        String str130 = str124;
        Integer num28 = (i5 & 128) != 0 ? null : num9;
        String str131 = (i5 & 256) != 0 ? null : str56;
        Integer num29 = (i5 & 512) != 0 ? null : num10;
        Integer num30 = (i5 & 1024) != 0 ? null : num11;
        String str132 = (i5 & 2048) != 0 ? null : str57;
        Integer num31 = (i5 & 4096) != 0 ? null : num12;
        String str133 = (i5 & 8192) != 0 ? null : str58;
        String str134 = (i5 & 16384) != 0 ? null : str59;
    }
}
