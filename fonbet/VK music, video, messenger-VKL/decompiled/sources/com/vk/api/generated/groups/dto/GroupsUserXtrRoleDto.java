package com.vk.api.generated.groups.dto;

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
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
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

/* compiled from: GroupsUserXtrRoleDto.kt */
/* loaded from: classes14.dex */
public final class GroupsUserXtrRoleDto implements Parcelable {
    public static final Parcelable.Creator<GroupsUserXtrRoleDto> CREATOR = new a();

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

    @pmi0("blacklisted_by_group")
    private final Boolean blacklistedByGroup;

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

    @pmi0("contact_email")
    private final String contactEmail;

    @pmi0("contact_id")
    private final Integer contactId;

    @pmi0("contact_name")
    private final String contactName;

    @pmi0("contact_phone")
    private final String contactPhone;

    @pmi0("contact_position")
    private final String contactPosition;

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

    @pmi0("in_group")
    private final Boolean inGroup;

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

    @pmi0("is_call_operator")
    private final Boolean isCallOperator;

    @pmi0("is_closed")
    private final Boolean isClosed;

    @pmi0("is_contact")
    private final Boolean isContact;

    @pmi0("is_dead")
    private final Boolean isDead;

    @pmi0("is_don")
    private final Boolean isDon;

    @pmi0("is_esia_linked")
    private final Boolean isEsiaLinked;

    @pmi0("is_esia_verified")
    private final Boolean isEsiaVerified;

    @pmi0("is_executor_in_payout_account")
    private final Boolean isExecutorInPayoutAccount;

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

    @pmi0(SignalingProtocol.KEY_PERMISSIONS)
    private final List<GroupsMemberRolePermissionDto> permissions;

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

    @pmi0("role")
    private final GroupsRoleOptionsDto role;

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
    /* compiled from: GroupsUserXtrRoleDto.kt */
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

        /* compiled from: GroupsUserXtrRoleDto.kt */
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
    /* compiled from: GroupsUserXtrRoleDto.kt */
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

        /* compiled from: GroupsUserXtrRoleDto.kt */
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
    /* compiled from: GroupsUserXtrRoleDto.kt */
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

        /* compiled from: GroupsUserXtrRoleDto.kt */
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
    /* compiled from: GroupsUserXtrRoleDto.kt */
    public static final class SocialButtonTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SocialButtonTypeDto[] $VALUES;

        @pmi0("add")
        public static final SocialButtonTypeDto ADD;
        public static final Parcelable.Creator<SocialButtonTypeDto> CREATOR;

        @pmi0("follow")
        public static final SocialButtonTypeDto FOLLOW;
        private final String value;

        /* compiled from: GroupsUserXtrRoleDto.kt */
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
    /* compiled from: GroupsUserXtrRoleDto.kt */
    public static final class WallDefaultDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ WallDefaultDto[] $VALUES;

        @pmi0("all")
        public static final WallDefaultDto ALL;
        public static final Parcelable.Creator<WallDefaultDto> CREATOR;

        @pmi0("owner")
        public static final WallDefaultDto OWNER;
        private final String value;

        /* compiled from: GroupsUserXtrRoleDto.kt */
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

    /* compiled from: GroupsUserXtrRoleDto.kt */
    public static final class a implements Parcelable.Creator<GroupsUserXtrRoleDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsUserXtrRoleDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            Boolean valueOf6;
            Boolean valueOf7;
            Boolean valueOf8;
            Boolean valueOf9;
            Boolean valueOf10;
            Boolean valueOf11;
            Boolean valueOf12;
            PhotosPhotoDto photosPhotoDto;
            BaseCityDto baseCityDto;
            ArrayList arrayList2;
            UserId userId;
            ArrayList arrayList3;
            ArrayList arrayList4;
            Boolean valueOf13;
            UserId userId2;
            WallDefaultDto createFromParcel;
            Boolean valueOf14;
            Boolean valueOf15;
            Boolean valueOf16;
            Boolean valueOf17;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ArrayList arrayList7;
            Boolean valueOf18;
            UsersOccupationDto usersOccupationDto;
            ArrayList arrayList8;
            ArrayList arrayList9;
            BaseBoolIntDto baseBoolIntDto;
            ArrayList arrayList10;
            ArrayList arrayList11;
            UsersPersonalDto usersPersonalDto;
            Integer num;
            ArrayList arrayList12;
            BaseBoolIntDto baseBoolIntDto2;
            ArrayList arrayList13;
            ArrayList arrayList14;
            ArrayList arrayList15;
            ArrayList arrayList16;
            Boolean valueOf19;
            Boolean valueOf20;
            Boolean valueOf21;
            Boolean valueOf22;
            Boolean valueOf23;
            UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto;
            EmployeeMarkDto createFromParcel2;
            Boolean valueOf24;
            Boolean valueOf25;
            Boolean valueOf26;
            Boolean valueOf27;
            UsersGiftsTooltipDto usersGiftsTooltipDto;
            NoIndexDto createFromParcel3;
            Boolean valueOf28;
            MessagesContactDto messagesContactDto;
            Boolean bool;
            ArrayList arrayList17;
            ArrayList arrayList18;
            Integer valueOf29;
            Boolean bool2;
            Boolean valueOf30;
            Boolean valueOf31;
            Boolean valueOf32;
            Boolean valueOf33;
            BaseImageDto baseImageDto;
            ArrayList arrayList19;
            ArrayList arrayList20;
            UsersUserProfileTypeDto usersUserProfileTypeDto;
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
            Boolean valueOf45;
            Boolean valueOf46;
            Boolean valueOf47;
            Boolean valueOf48;
            Boolean valueOf49;
            Boolean valueOf50;
            UserId userId3 = (UserId) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(GroupsMemberRolePermissionDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            GroupsRoleOptionsDto createFromParcel4 = parcel.readInt() == 0 ? null : GroupsRoleOptionsDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString = parcel.readString();
            ArrayList arrayList21 = arrayList;
            Boolean bool3 = valueOf;
            Boolean bool4 = valueOf2;
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
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
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString4 = parcel.readString();
            Boolean bool5 = valueOf3;
            Boolean bool6 = valueOf4;
            Boolean bool7 = valueOf5;
            Boolean bool8 = valueOf6;
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
            String readString20 = parcel.readString();
            BdateVisibilityDto createFromParcel5 = parcel.readInt() == 0 ? null : BdateVisibilityDto.CREATOR.createFromParcel(parcel);
            BaseCityDto baseCityDto2 = (BaseCityDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            BaseCountryDto baseCountryDto = (BaseCountryDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            Float valueOf51 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            OwnerStateDto ownerStateDto = (OwnerStateDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            String readString21 = parcel.readString();
            String readString22 = parcel.readString();
            String readString23 = parcel.readString();
            String readString24 = parcel.readString();
            String readString25 = parcel.readString();
            String readString26 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto3 = (BaseBoolIntDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            BaseOwnerCoverDto baseOwnerCoverDto = (BaseOwnerCoverDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            String readString27 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto4 = (BaseBoolIntDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto5 = (BaseBoolIntDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf7 = null;
            } else {
                valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            BaseBoolIntDto baseBoolIntDto6 = (BaseBoolIntDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto7 = (BaseBoolIntDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto8 = (BaseBoolIntDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto9 = (BaseBoolIntDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            UsersUserTypeDto usersUserTypeDto = (UsersUserTypeDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            Float f = valueOf51;
            String readString28 = parcel.readString();
            String readString29 = parcel.readString();
            String readString30 = parcel.readString();
            String readString31 = parcel.readString();
            String readString32 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto10 = (BaseBoolIntDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto11 = (BaseBoolIntDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
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
            String readString33 = parcel.readString();
            Boolean bool9 = valueOf8;
            Boolean bool10 = valueOf9;
            Boolean bool11 = valueOf10;
            Boolean bool12 = valueOf11;
            String readString34 = parcel.readString();
            String readString35 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto12 = (BaseBoolIntDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            VideoLiveInfoDto videoLiveInfoDto = (VideoLiveInfoDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto13 = (BaseBoolIntDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf12 = null;
            } else {
                valueOf12 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString36 = parcel.readString();
            Boolean bool13 = valueOf7;
            Boolean bool14 = valueOf12;
            String readString37 = parcel.readString();
            String readString38 = parcel.readString();
            String readString39 = parcel.readString();
            String readString40 = parcel.readString();
            String readString41 = parcel.readString();
            String readString42 = parcel.readString();
            PhotosPhotoDto photosPhotoDto2 = (PhotosPhotoDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                photosPhotoDto = photosPhotoDto2;
                baseCityDto = baseCityDto2;
                userId = userId3;
                arrayList2 = null;
            } else {
                photosPhotoDto = photosPhotoDto2;
                int readInt2 = parcel.readInt();
                baseCityDto = baseCityDto2;
                arrayList2 = new ArrayList(readInt2);
                userId = userId3;
                int i2 = 0;
                while (i2 != readInt2) {
                    int i3 = readInt2;
                    int readInt3 = parcel.readInt();
                    int i4 = i2;
                    ArrayList arrayList22 = new ArrayList(readInt3);
                    ArrayList arrayList23 = arrayList21;
                    int i5 = 0;
                    while (i5 != readInt3) {
                        i5 = bo.b(GroupsUserXtrRoleDto.class, parcel, arrayList22, i5, 1);
                        readInt3 = readInt3;
                    }
                    arrayList2.add(arrayList22);
                    i2 = i4 + 1;
                    readInt2 = i3;
                    arrayList21 = arrayList23;
                }
            }
            ArrayList arrayList24 = arrayList21;
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList3 = new ArrayList(readInt4);
                int i6 = 0;
                while (i6 != readInt4) {
                    int i7 = readInt4;
                    int readInt5 = parcel.readInt();
                    ArrayList arrayList25 = arrayList2;
                    ArrayList arrayList26 = new ArrayList(readInt5);
                    int i8 = i6;
                    int i9 = 0;
                    while (i9 != readInt5) {
                        i9 = bo.b(GroupsUserXtrRoleDto.class, parcel, arrayList26, i9, 1);
                        readInt5 = readInt5;
                    }
                    arrayList3.add(arrayList26);
                    i6 = i8 + 1;
                    readInt4 = i7;
                    arrayList2 = arrayList25;
                }
            }
            ArrayList arrayList27 = arrayList2;
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt6 = parcel.readInt();
                arrayList4 = new ArrayList(readInt6);
                int i10 = 0;
                while (i10 != readInt6) {
                    i10 = bo.b(GroupsUserXtrRoleDto.class, parcel, arrayList4, i10, 1);
                    readInt6 = readInt6;
                }
            }
            UserId userId4 = userId;
            String readString43 = parcel.readString();
            Integer valueOf52 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf13 = null;
            } else {
                valueOf13 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                userId2 = userId4;
                createFromParcel = null;
            } else {
                userId2 = userId4;
                createFromParcel = WallDefaultDto.CREATOR.createFromParcel(parcel);
            }
            WallDefaultDto wallDefaultDto = createFromParcel;
            AudioMusicAwardsDto audioMusicAwardsDto = (AudioMusicAwardsDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
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
            BaseBoolIntDto baseBoolIntDto14 = (BaseBoolIntDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList5 = arrayList4;
                arrayList7 = arrayList3;
                arrayList6 = null;
            } else {
                int readInt7 = parcel.readInt();
                arrayList5 = arrayList4;
                arrayList6 = new ArrayList(readInt7);
                arrayList7 = arrayList3;
                int i11 = 0;
                while (i11 != readInt7) {
                    i11 = bo.b(GroupsUserXtrRoleDto.class, parcel, arrayList6, i11, 1);
                    readInt7 = readInt7;
                }
                baseBoolIntDto14 = baseBoolIntDto14;
            }
            String readString44 = parcel.readString();
            BaseCityDto baseCityDto3 = baseCityDto;
            ArrayList arrayList28 = arrayList5;
            String readString45 = parcel.readString();
            PhotosPhotoDto photosPhotoDto3 = photosPhotoDto;
            ArrayList arrayList29 = arrayList7;
            String readString46 = parcel.readString();
            String readString47 = parcel.readString();
            String readString48 = parcel.readString();
            String readString49 = parcel.readString();
            String readString50 = parcel.readString();
            String readString51 = parcel.readString();
            String readString52 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto15 = (BaseBoolIntDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto16 = baseBoolIntDto14;
            BaseBoolIntDto baseBoolIntDto17 = (BaseBoolIntDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf18 = null;
            } else {
                valueOf18 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString53 = parcel.readString();
            Boolean bool15 = valueOf13;
            Boolean bool16 = valueOf14;
            Boolean bool17 = valueOf15;
            Boolean bool18 = valueOf16;
            Boolean bool19 = valueOf17;
            Boolean bool20 = valueOf18;
            String readString54 = parcel.readString();
            String readString55 = parcel.readString();
            AudioAudioDto audioAudioDto = (AudioAudioDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            String readString56 = parcel.readString();
            String readString57 = parcel.readString();
            AppsAppMinDto appsAppMinDto = (AppsAppMinDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            UsersLastSeenDto usersLastSeenDto = (UsersLastSeenDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            UsersExportsDto usersExportsDto = (UsersExportsDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            BaseCropPhotoDto baseCropPhotoDto = (BaseCropPhotoDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            Integer valueOf53 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf54 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf55 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf56 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto baseBoolIntDto18 = (BaseBoolIntDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto19 = (BaseBoolIntDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto20 = (BaseBoolIntDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto21 = (BaseBoolIntDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            Integer valueOf57 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            UsersOccupationDto usersOccupationDto2 = (UsersOccupationDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                usersOccupationDto = usersOccupationDto2;
                arrayList8 = arrayList6;
                baseBoolIntDto = baseBoolIntDto15;
                arrayList9 = null;
            } else {
                usersOccupationDto = usersOccupationDto2;
                int readInt8 = parcel.readInt();
                arrayList8 = arrayList6;
                arrayList9 = new ArrayList(readInt8);
                baseBoolIntDto = baseBoolIntDto15;
                int i12 = 0;
                while (i12 != readInt8) {
                    i12 = bo.b(GroupsUserXtrRoleDto.class, parcel, arrayList9, i12, 1);
                    readInt8 = readInt8;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList11 = arrayList9;
                arrayList10 = null;
            } else {
                int readInt9 = parcel.readInt();
                arrayList10 = new ArrayList(readInt9);
                arrayList11 = arrayList9;
                int i13 = 0;
                while (i13 != readInt9) {
                    i13 = bo.b(GroupsUserXtrRoleDto.class, parcel, arrayList10, i13, 1);
                    readInt9 = readInt9;
                }
            }
            Integer valueOf58 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto baseBoolIntDto22 = baseBoolIntDto;
            String readString58 = parcel.readString();
            Integer valueOf59 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf60 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString59 = parcel.readString();
            Integer valueOf61 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString60 = parcel.readString();
            ArrayList arrayList30 = arrayList11;
            Integer num2 = valueOf59;
            Integer num3 = valueOf60;
            Integer num4 = valueOf61;
            String readString61 = parcel.readString();
            String readString62 = parcel.readString();
            ArrayList arrayList31 = arrayList10;
            UsersUserRelationDto usersUserRelationDto = (UsersUserRelationDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            UsersUserMinDto usersUserMinDto = (UsersUserMinDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            UsersPersonalDto usersPersonalDto2 = (UsersPersonalDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                usersPersonalDto = usersPersonalDto2;
                num = valueOf58;
                baseBoolIntDto2 = baseBoolIntDto22;
                arrayList12 = null;
            } else {
                usersPersonalDto = usersPersonalDto2;
                int readInt10 = parcel.readInt();
                num = valueOf58;
                arrayList12 = new ArrayList(readInt10);
                baseBoolIntDto2 = baseBoolIntDto22;
                int i14 = 0;
                while (i14 != readInt10) {
                    i14 = bo.b(GroupsUserXtrRoleDto.class, parcel, arrayList12, i14, 1);
                    readInt10 = readInt10;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList14 = arrayList12;
                arrayList13 = null;
            } else {
                int readInt11 = parcel.readInt();
                arrayList13 = new ArrayList(readInt11);
                arrayList14 = arrayList12;
                int i15 = 0;
                while (i15 != readInt11) {
                    i15 = bo.b(GroupsUserXtrRoleDto.class, parcel, arrayList13, i15, 1);
                    readInt11 = readInt11;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList16 = arrayList13;
                arrayList15 = null;
            } else {
                int readInt12 = parcel.readInt();
                arrayList15 = new ArrayList(readInt12);
                arrayList16 = arrayList13;
                int i16 = 0;
                while (i16 != readInt12) {
                    i16 = bo.b(GroupsUserXtrRoleDto.class, parcel, arrayList15, i16, 1);
                    readInt12 = readInt12;
                }
            }
            if (parcel.readInt() == 0) {
                valueOf19 = null;
            } else {
                valueOf19 = Boolean.valueOf(parcel.readInt() != 0);
            }
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
                valueOf22 = null;
            } else {
                valueOf22 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf23 = null;
            } else {
                valueOf23 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString63 = parcel.readString();
            Boolean bool21 = valueOf19;
            UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto2 = (UsersEmployeeWorkingStateDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                usersEmployeeWorkingStateDto = usersEmployeeWorkingStateDto2;
                createFromParcel2 = null;
            } else {
                usersEmployeeWorkingStateDto = usersEmployeeWorkingStateDto2;
                createFromParcel2 = EmployeeMarkDto.CREATOR.createFromParcel(parcel);
            }
            EmployeeMarkDto employeeMarkDto = createFromParcel2;
            UsersRightsLocationDto usersRightsLocationDto = (UsersRightsLocationDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf24 = null;
            } else {
                valueOf24 = Boolean.valueOf(parcel.readInt() != 0);
            }
            UsersEmojiStatusDto usersEmojiStatusDto = (UsersEmojiStatusDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            StatusImageStatusDto statusImageStatusDto = (StatusImageStatusDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            UsersUserCountersDto usersUserCountersDto = (UsersUserCountersDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            boolean z = false;
            UsersPersonalDto usersPersonalDto3 = usersPersonalDto;
            ArrayList arrayList32 = arrayList16;
            Boolean bool22 = valueOf21;
            Boolean bool23 = valueOf22;
            Boolean bool24 = valueOf23;
            UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto3 = usersEmployeeWorkingStateDto;
            String readString64 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto23 = (BaseBoolIntDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf25 = null;
            } else {
                valueOf25 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            BaseBoolIntDto baseBoolIntDto24 = baseBoolIntDto2;
            Boolean bool25 = valueOf24;
            Boolean bool26 = valueOf25;
            String readString65 = parcel.readString();
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
            UsersGiftsTooltipDto usersGiftsTooltipDto2 = (UsersGiftsTooltipDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                usersGiftsTooltipDto = usersGiftsTooltipDto2;
                createFromParcel3 = null;
            } else {
                usersGiftsTooltipDto = usersGiftsTooltipDto2;
                createFromParcel3 = NoIndexDto.CREATOR.createFromParcel(parcel);
            }
            NoIndexDto noIndexDto = createFromParcel3;
            Integer valueOf62 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            MessagesContactDto messagesContactDto2 = (MessagesContactDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf28 = null;
            } else {
                valueOf28 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                messagesContactDto = messagesContactDto2;
                bool = valueOf20;
                arrayList18 = arrayList15;
                arrayList17 = null;
            } else {
                messagesContactDto = messagesContactDto2;
                int readInt13 = parcel.readInt();
                bool = valueOf20;
                arrayList17 = new ArrayList(readInt13);
                arrayList18 = arrayList15;
                int i17 = 0;
                while (i17 != readInt13) {
                    i17 = pm0.b(parcel, arrayList17, i17, 1);
                    readInt13 = readInt13;
                }
            }
            if (parcel.readInt() == 0) {
                valueOf29 = null;
                bool2 = null;
            } else {
                valueOf29 = Integer.valueOf(parcel.readInt());
                bool2 = null;
            }
            Integer num5 = valueOf53;
            Integer num6 = valueOf54;
            Integer num7 = valueOf55;
            Integer num8 = valueOf56;
            Integer num9 = valueOf57;
            UsersOccupationDto usersOccupationDto3 = usersOccupationDto;
            ArrayList arrayList33 = arrayList14;
            Boolean bool27 = bool;
            String readString66 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf30 = bool2;
            } else {
                valueOf30 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf31 = bool2;
            } else {
                valueOf31 = Boolean.valueOf(parcel.readInt() != 0);
            }
            UsersUserProfileTypeDto usersUserProfileTypeDto2 = (UsersUserProfileTypeDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            Integer num10 = valueOf29;
            UsersCanNotCallReasonDto usersCanNotCallReasonDto = (UsersCanNotCallReasonDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
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
            BaseImageDto baseImageDto2 = (BaseImageDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                baseImageDto = baseImageDto2;
                arrayList19 = arrayList17;
                usersUserProfileTypeDto = usersUserProfileTypeDto2;
                arrayList20 = null;
            } else {
                baseImageDto = baseImageDto2;
                int readInt14 = parcel.readInt();
                arrayList19 = arrayList17;
                arrayList20 = new ArrayList(readInt14);
                usersUserProfileTypeDto = usersUserProfileTypeDto2;
                int i18 = 0;
                while (i18 != readInt14) {
                    i18 = bo.b(GroupsUserXtrRoleDto.class, parcel, arrayList20, i18, 1);
                    readInt14 = readInt14;
                }
            }
            if (parcel.readInt() == 0) {
                valueOf34 = null;
            } else {
                valueOf34 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf35 = null;
            } else {
                valueOf35 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf36 = null;
            } else {
                valueOf36 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf37 = null;
            } else {
                valueOf37 = Boolean.valueOf(parcel.readInt() != 0);
            }
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
            SocialButtonTypeDto createFromParcel6 = parcel.readInt() == 0 ? null : SocialButtonTypeDto.CREATOR.createFromParcel(parcel);
            String readString67 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf41 = null;
            } else {
                valueOf41 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
            Boolean bool28 = valueOf41;
            ArrayList<String> createStringArrayList4 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                valueOf42 = null;
            } else {
                valueOf42 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf63 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf64 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf43 = null;
            } else {
                valueOf43 = Boolean.valueOf(parcel.readInt() != 0);
            }
            UsersPromotionAllowanceDto usersPromotionAllowanceDto = (UsersPromotionAllowanceDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf44 = null;
            } else {
                valueOf44 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf65 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf45 = null;
            } else {
                valueOf45 = Boolean.valueOf(parcel.readInt() != 0);
            }
            MessagesEduEducationalProfileDto messagesEduEducationalProfileDto = (MessagesEduEducationalProfileDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            BaseAPlusMarkDto baseAPlusMarkDto = (BaseAPlusMarkDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf46 = null;
            } else {
                valueOf46 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf47 = null;
            } else {
                valueOf47 = Boolean.valueOf(parcel.readInt() != 0);
            }
            UsersDonutDto usersDonutDto = (UsersDonutDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            BaseSexDto baseSexDto = (BaseSexDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            Boolean bool29 = valueOf44;
            Integer num11 = valueOf65;
            Boolean bool30 = valueOf45;
            Boolean bool31 = valueOf46;
            Boolean bool32 = valueOf47;
            String readString68 = parcel.readString();
            String readString69 = parcel.readString();
            String readString70 = parcel.readString();
            String readString71 = parcel.readString();
            UsersOnlineInfoDto usersOnlineInfoDto = (UsersOnlineInfoDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto25 = (BaseBoolIntDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto26 = (BaseBoolIntDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            Integer valueOf66 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto baseBoolIntDto27 = (BaseBoolIntDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto28 = (BaseBoolIntDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            FriendsFriendStatusStatusDto friendsFriendStatusStatusDto = (FriendsFriendStatusStatusDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            FriendsRequestsMutualDto friendsRequestsMutualDto = (FriendsRequestsMutualDto) parcel.readParcelable(GroupsUserXtrRoleDto.class.getClassLoader());
            Boolean bool33 = valueOf42;
            Integer num12 = valueOf63;
            Integer num13 = valueOf64;
            Boolean bool34 = valueOf43;
            Integer num14 = valueOf66;
            String readString72 = parcel.readString();
            String readString73 = parcel.readString();
            Integer valueOf67 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString74 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf48 = null;
            } else {
                valueOf48 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf49 = null;
            } else {
                valueOf49 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf50 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                valueOf50 = Boolean.valueOf(z);
            }
            return new GroupsUserXtrRoleDto(userId2, arrayList24, createFromParcel4, bool3, bool4, readString, readString2, readString3, bool5, bool6, bool7, bool8, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, readString14, readString15, readString16, readString17, readString18, readString19, readString20, createFromParcel5, baseCityDto3, baseCountryDto, f, ownerStateDto, readString21, readString22, readString23, readString24, readString25, readString26, baseBoolIntDto3, baseOwnerCoverDto, readString27, baseBoolIntDto4, baseBoolIntDto5, bool13, baseBoolIntDto6, baseBoolIntDto7, baseBoolIntDto8, baseBoolIntDto9, usersUserTypeDto, readString28, readString29, readString30, readString31, readString32, baseBoolIntDto10, baseBoolIntDto11, bool9, bool10, bool11, bool12, readString33, readString34, readString35, baseBoolIntDto12, videoLiveInfoDto, baseBoolIntDto13, bool14, readString36, readString37, readString38, readString39, readString40, readString41, readString42, photosPhotoDto3, arrayList27, arrayList29, arrayList28, readString43, valueOf52, bool15, wallDefaultDto, audioMusicAwardsDto, bool16, bool17, bool18, bool19, baseBoolIntDto16, arrayList8, readString44, readString45, readString46, readString47, readString48, readString49, readString50, readString51, readString52, baseBoolIntDto24, baseBoolIntDto17, bool20, readString53, readString54, readString55, audioAudioDto, readString56, readString57, appsAppMinDto, usersLastSeenDto, usersExportsDto, baseCropPhotoDto, num5, num6, num7, num8, baseBoolIntDto18, baseBoolIntDto19, baseBoolIntDto20, baseBoolIntDto21, num9, usersOccupationDto3, arrayList30, arrayList31, num, readString58, num2, num3, readString59, num4, readString60, readString61, readString62, usersUserRelationDto, usersUserMinDto, usersPersonalDto3, arrayList33, arrayList32, arrayList18, bool21, bool27, bool22, bool23, bool24, readString63, usersEmployeeWorkingStateDto3, employeeMarkDto, usersRightsLocationDto, bool25, usersEmojiStatusDto, statusImageStatusDto, usersUserCountersDto, readString64, baseBoolIntDto23, bool26, createStringArrayList, readString65, valueOf26, valueOf27, usersGiftsTooltipDto, noIndexDto, valueOf62, messagesContactDto, valueOf28, createStringArrayList2, arrayList19, num10, readString66, valueOf30, valueOf31, usersUserProfileTypeDto, usersCanNotCallReasonDto, valueOf32, valueOf33, baseImageDto, arrayList20, valueOf34, valueOf35, valueOf36, valueOf37, valueOf38, valueOf39, valueOf40, createFromParcel6, readString67, bool28, createStringArrayList3, createStringArrayList4, bool33, num12, num13, bool34, usersPromotionAllowanceDto, bool29, num11, bool30, messagesEduEducationalProfileDto, baseAPlusMarkDto, bool31, bool32, usersDonutDto, baseSexDto, readString68, readString69, readString70, readString71, usersOnlineInfoDto, baseBoolIntDto25, baseBoolIntDto26, num14, baseBoolIntDto27, baseBoolIntDto28, friendsFriendStatusStatusDto, friendsRequestsMutualDto, readString72, readString73, valueOf67, readString74, valueOf48, valueOf49, valueOf50);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsUserXtrRoleDto[] newArray(int i) {
            return new GroupsUserXtrRoleDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupsUserXtrRoleDto(UserId userId, List<? extends GroupsMemberRolePermissionDto> list, GroupsRoleOptionsDto groupsRoleOptionsDto, Boolean bool, Boolean bool2, String str, String str2, String str3, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, BdateVisibilityDto bdateVisibilityDto, BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, Float f, OwnerStateDto ownerStateDto, String str21, String str22, String str23, String str24, String str25, String str26, BaseBoolIntDto baseBoolIntDto, BaseOwnerCoverDto baseOwnerCoverDto, String str27, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Boolean bool7, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, UsersUserTypeDto usersUserTypeDto, String str28, String str29, String str30, String str31, String str32, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, String str33, String str34, String str35, BaseBoolIntDto baseBoolIntDto10, VideoLiveInfoDto videoLiveInfoDto, BaseBoolIntDto baseBoolIntDto11, Boolean bool12, String str36, String str37, String str38, String str39, String str40, String str41, String str42, PhotosPhotoDto photosPhotoDto, List<? extends List<UsersProfileButtonDto>> list2, List<? extends List<UsersProfileButtonDto>> list3, List<UsersProfileButtonDto> list4, String str43, Integer num, Boolean bool13, WallDefaultDto wallDefaultDto, AudioMusicAwardsDto audioMusicAwardsDto, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, BaseBoolIntDto baseBoolIntDto12, List<BaseOwnerButtonDto> list5, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, BaseBoolIntDto baseBoolIntDto13, BaseBoolIntDto baseBoolIntDto14, Boolean bool18, String str53, String str54, String str55, AudioAudioDto audioAudioDto, String str56, String str57, AppsAppMinDto appsAppMinDto, UsersLastSeenDto usersLastSeenDto, UsersExportsDto usersExportsDto, BaseCropPhotoDto baseCropPhotoDto, Integer num2, Integer num3, Integer num4, Integer num5, BaseBoolIntDto baseBoolIntDto15, BaseBoolIntDto baseBoolIntDto16, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, Integer num6, UsersOccupationDto usersOccupationDto, List<UsersCareerDto> list6, List<UsersMilitaryDto> list7, Integer num7, String str58, Integer num8, Integer num9, String str59, Integer num10, String str60, String str61, String str62, UsersUserRelationDto usersUserRelationDto, UsersUserMinDto usersUserMinDto, UsersPersonalDto usersPersonalDto, List<UsersUniversityDto> list8, List<UsersSchoolDto> list9, List<UsersRelativeDto> list10, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, String str63, UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto, EmployeeMarkDto employeeMarkDto, UsersRightsLocationDto usersRightsLocationDto, Boolean bool24, UsersEmojiStatusDto usersEmojiStatusDto, StatusImageStatusDto statusImageStatusDto, UsersUserCountersDto usersUserCountersDto, String str64, BaseBoolIntDto baseBoolIntDto19, Boolean bool25, List<String> list11, String str65, Boolean bool26, Boolean bool27, UsersGiftsTooltipDto usersGiftsTooltipDto, NoIndexDto noIndexDto, Integer num11, MessagesContactDto messagesContactDto, Boolean bool28, List<String> list12, List<Integer> list13, Integer num12, String str66, Boolean bool29, Boolean bool30, UsersUserProfileTypeDto usersUserProfileTypeDto, UsersCanNotCallReasonDto usersCanNotCallReasonDto, Boolean bool31, Boolean bool32, BaseImageDto baseImageDto, List<CallsCustomNameForCallDto> list14, Boolean bool33, Boolean bool34, Boolean bool35, Boolean bool36, Boolean bool37, Boolean bool38, Boolean bool39, SocialButtonTypeDto socialButtonTypeDto, String str67, Boolean bool40, List<String> list15, List<String> list16, Boolean bool41, Integer num13, Integer num14, Boolean bool42, UsersPromotionAllowanceDto usersPromotionAllowanceDto, Boolean bool43, Integer num15, Boolean bool44, MessagesEduEducationalProfileDto messagesEduEducationalProfileDto, BaseAPlusMarkDto baseAPlusMarkDto, Boolean bool45, Boolean bool46, UsersDonutDto usersDonutDto, BaseSexDto baseSexDto, String str68, String str69, String str70, String str71, UsersOnlineInfoDto usersOnlineInfoDto, BaseBoolIntDto baseBoolIntDto20, BaseBoolIntDto baseBoolIntDto21, Integer num16, BaseBoolIntDto baseBoolIntDto22, BaseBoolIntDto baseBoolIntDto23, FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, FriendsRequestsMutualDto friendsRequestsMutualDto, String str72, String str73, Integer num17, String str74, Boolean bool47, Boolean bool48, Boolean bool49) {
        this.id = userId;
        this.permissions = list;
        this.role = groupsRoleOptionsDto;
        this.isContact = bool;
        this.isCallOperator = bool2;
        this.contactPhone = str;
        this.contactEmail = str2;
        this.contactPosition = str3;
        this.inGroup = bool3;
        this.blacklistedByGroup = bool4;
        this.isDon = bool5;
        this.isExecutorInPayoutAccount = bool6;
        this.firstNameNom = str4;
        this.firstNameGen = str5;
        this.firstNameDat = str6;
        this.firstNameAcc = str7;
        this.firstNameIns = str8;
        this.firstNameAbl = str9;
        this.lastNameNom = str10;
        this.lastNameGen = str11;
        this.lastNameDat = str12;
        this.lastNameAcc = str13;
        this.lastNameIns = str14;
        this.lastNameAbl = str15;
        this.nickname = str16;
        this.maidenName = str17;
        this.contactName = str18;
        this.domain = str19;
        this.bdate = str20;
        this.bdateVisibility = bdateVisibilityDto;
        this.city = baseCityDto;
        this.country = baseCountryDto;
        this.timezone = f;
        this.ownerState = ownerStateDto;
        this.photo200 = str21;
        this.photoMax = str22;
        this.photo200Orig = str23;
        this.photo400Orig = str24;
        this.photoMaxOrig = str25;
        this.photoId = str26;
        this.hasPhoto = baseBoolIntDto;
        this.cover = baseOwnerCoverDto;
        this.photoAvgColor = str27;
        this.hasMobile = baseBoolIntDto2;
        this.isFriend = baseBoolIntDto3;
        this.isBestFriend = bool7;
        this.wallComments = baseBoolIntDto4;
        this.canPost = baseBoolIntDto5;
        this.canSeeAllPosts = baseBoolIntDto6;
        this.canSeeAudio = baseBoolIntDto7;
        this.type = usersUserTypeDto;
        this.email = str28;
        this.skype = str29;
        this.facebook = str30;
        this.facebookName = str31;
        this.twitter = str32;
        this.isAdult = baseBoolIntDto8;
        this.isSubscribed = baseBoolIntDto9;
        this.isSubscribedStories = bool8;
        this.canSubscribeStories = bool9;
        this.canAskQuestion = bool10;
        this.canAskAnonymous = bool11;
        this.subscriptionCountry = str33;
        this.livejournal = str34;
        this.instagram = str35;
        this.test = baseBoolIntDto10;
        this.videoLive = videoLiveInfoDto;
        this.isVideoLiveNotificationsBlocked = baseBoolIntDto11;
        this.isService = bool12;
        this.serviceDescription = str36;
        this.photoRec = str37;
        this.photoMedium = str38;
        this.photoMediumRec = str39;
        this.photo = str40;
        this.photoBig = str41;
        this.photo400 = str42;
        this.photoMaxSize = photosPhotoDto;
        this.profileButtons = list2;
        this.profileButtonsTablet = list3;
        this.thirdPartyButtons = list4;
        this.language = str43;
        this.storiesArchiveCount = num;
        this.hasUnseenStories = bool13;
        this.wallDefault = wallDefaultDto;
        this.musicAwards = audioMusicAwardsDto;
        this.canCall = bool14;
        this.canCallFromGroup = bool15;
        this.canInviteAsVoiceroomsSpeaker = bool16;
        this.canSeeWishes = bool17;
        this.canSeeGifts = baseBoolIntDto12;
        this.buttons = list5;
        this.interests = str44;
        this.books = str45;
        this.tv = str46;
        this.quotes = str47;
        this.about = str48;
        this.games = str49;
        this.movies = str50;
        this.activities = str51;
        this.music = str52;
        this.canWritePrivateMessage = baseBoolIntDto13;
        this.canSendFriendRequest = baseBoolIntDto14;
        this.canBeInvitedGroup = bool18;
        this.mobilePhone = str53;
        this.homePhone = str54;
        this.site = str55;
        this.statusAudio = audioAudioDto;
        this.status = str56;
        this.activity = str57;
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
        this.career = list6;
        this.military = list7;
        this.university = num7;
        this.universityName = str58;
        this.universityGroupId = num8;
        this.faculty = num9;
        this.facultyName = str59;
        this.graduation = num10;
        this.educationForm = str60;
        this.educationStatus = str61;
        this.homeTown = str62;
        this.relation = usersUserRelationDto;
        this.relationPartner = usersUserMinDto;
        this.personal = usersPersonalDto;
        this.universities = list8;
        this.schools = list9;
        this.relatives = list10;
        this.isSubscribedPodcasts = bool19;
        this.canSubscribePodcasts = bool20;
        this.canSubscribePosts = bool21;
        this.isStudent = bool22;
        this.hasRights = bool23;
        this.sysUsername = str63;
        this.employeeWorkingState = usersEmployeeWorkingStateDto;
        this.employeeMark = employeeMarkDto;
        this.rightsLocation = usersRightsLocationDto;
        this.canInviteToChats = bool24;
        this.emojiStatus = usersEmojiStatusDto;
        this.imageStatus = statusImageStatusDto;
        this.counters = usersUserCountersDto;
        this.accessKey = str64;
        this.canUploadDoc = baseBoolIntDto19;
        this.canBan = bool25;
        this.eduDetails = list11;
        this.hash = str65;
        this.hasEmail = bool26;
        this.isDead = bool27;
        this.giftsTooltip = usersGiftsTooltipDto;
        this.noIndex = noIndexDto;
        this.contactId = num11;
        this.contact = messagesContactDto;
        this.isMessageRequest = bool28;
        this.descriptions = list12;
        this.lists = list13;
        this.friendshipWeeks = num12;
        this.trackCode = str66;
        this.isPersonalAdsEasyPromoteEnabled = bool29;
        this.needBigMsgBtnInProfile = bool30;
        this.profileType = usersUserProfileTypeDto;
        this.canNotCallReason = usersCanNotCallReasonDto;
        this.canCallAsCommunity = bool31;
        this.isNft = bool32;
        this.animatedAvatar = baseImageDto;
        this.customNamesForCalls = list14;
        this.isEsiaVerified = bool33;
        this.isEsiaLinked = bool34;
        this.isTinkoffVerified = bool35;
        this.isTinkoffLinked = bool36;
        this.isSberVerified = bool37;
        this.isVerified = bool38;
        this.isFollowersModeOn = bool39;
        this.socialButtonType = socialButtonTypeDto;
        this.description = str67;
        this.isTeacher = bool40;
        this.oauthLinked = list15;
        this.oauthVerification = list16;
        this.isSberLinked = bool41;
        this.ageMark = num13;
        this.joined = num14;
        this.isServiceAccount = bool42;
        this.promotionAllowance = usersPromotionAllowanceDto;
        this.coOwnershipEnabled = bool43;
        this.ageGroup = num15;
        this.hasRelatedUserPin = bool44;
        this.educationalProfile = messagesEduEducationalProfileDto;
        this.aPlusMark = baseAPlusMarkDto;
        this.isMediaModer = bool45;
        this.isPhotoMapEnabled = bool46;
        this.donut = usersDonutDto;
        this.sex = baseSexDto;
        this.screenName = str68;
        this.photo50 = str69;
        this.photo100 = str70;
        this.photoBase = str71;
        this.onlineInfo = usersOnlineInfoDto;
        this.online = baseBoolIntDto20;
        this.onlineMobile = baseBoolIntDto21;
        this.onlineApp = num16;
        this.verified = baseBoolIntDto22;
        this.trending = baseBoolIntDto23;
        this.friendStatus = friendsFriendStatusStatusDto;
        this.mutual = friendsRequestsMutualDto;
        this.deactivated = str72;
        this.firstName = str73;
        this.hidden = num17;
        this.lastName = str74;
        this.canAccessClosed = bool47;
        this.isClosed = bool48;
        this.isCached = bool49;
    }

    public final BaseCropPhotoDto B() {
        return this.cropPhoto;
    }

    public final SocialButtonTypeDto B1() {
        return this.socialButtonType;
    }

    public final String C() {
        return this.deactivated;
    }

    public final List<String> D() {
        return this.descriptions;
    }

    public final UserId D0() {
        return this.id;
    }

    public final String D1() {
        return this.status;
    }

    public final BaseBoolIntDto E1() {
        return this.trending;
    }

    public final String F() {
        return this.domain;
    }

    public final StatusImageStatusDto F0() {
        return this.imageStatus;
    }

    public final String G() {
        return this.firstName;
    }

    public final String H0() {
        return this.lastName;
    }

    public final String K() {
        return this.firstNameAbl;
    }

    public final String K0() {
        return this.lastNameAbl;
    }

    public final String L1() {
        return this.universityName;
    }

    public final String M() {
        return this.firstNameAcc;
    }

    public final String N0() {
        return this.lastNameAcc;
    }

    public final BaseBoolIntDto N1() {
        return this.verified;
    }

    public final String P0() {
        return this.lastNameDat;
    }

    public final String R() {
        return this.firstNameDat;
    }

    public final Boolean R1() {
        return this.isDead;
    }

    public final String S0() {
        return this.lastNameGen;
    }

    public final String T() {
        return this.firstNameGen;
    }

    public final String U0() {
        return this.lastNameIns;
    }

    public final Boolean U1() {
        return this.isDon;
    }

    public final String V0() {
        return this.lastNameNom;
    }

    public final BaseBoolIntDto V1() {
        return this.isFavorite;
    }

    public final String W() {
        return this.firstNameIns;
    }

    public final Boolean W1() {
        return this.isFollowersModeOn;
    }

    public final BaseBoolIntDto X1() {
        return this.isFriend;
    }

    public final String Z() {
        return this.firstNameNom;
    }

    public final Integer a0() {
        return this.followersCount;
    }

    public final FriendsRequestsMutualDto b1() {
        return this.mutual;
    }

    public final String d() {
        return this.bdate;
    }

    public final UsersOnlineInfoDto d1() {
        return this.onlineInfo;
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
        if (!(obj instanceof GroupsUserXtrRoleDto)) {
            return false;
        }
        GroupsUserXtrRoleDto groupsUserXtrRoleDto = (GroupsUserXtrRoleDto) obj;
        return epx.f(this.id, groupsUserXtrRoleDto.id) && epx.f(this.permissions, groupsUserXtrRoleDto.permissions) && this.role == groupsUserXtrRoleDto.role && epx.f(this.isContact, groupsUserXtrRoleDto.isContact) && epx.f(this.isCallOperator, groupsUserXtrRoleDto.isCallOperator) && epx.f(this.contactPhone, groupsUserXtrRoleDto.contactPhone) && epx.f(this.contactEmail, groupsUserXtrRoleDto.contactEmail) && epx.f(this.contactPosition, groupsUserXtrRoleDto.contactPosition) && epx.f(this.inGroup, groupsUserXtrRoleDto.inGroup) && epx.f(this.blacklistedByGroup, groupsUserXtrRoleDto.blacklistedByGroup) && epx.f(this.isDon, groupsUserXtrRoleDto.isDon) && epx.f(this.isExecutorInPayoutAccount, groupsUserXtrRoleDto.isExecutorInPayoutAccount) && epx.f(this.firstNameNom, groupsUserXtrRoleDto.firstNameNom) && epx.f(this.firstNameGen, groupsUserXtrRoleDto.firstNameGen) && epx.f(this.firstNameDat, groupsUserXtrRoleDto.firstNameDat) && epx.f(this.firstNameAcc, groupsUserXtrRoleDto.firstNameAcc) && epx.f(this.firstNameIns, groupsUserXtrRoleDto.firstNameIns) && epx.f(this.firstNameAbl, groupsUserXtrRoleDto.firstNameAbl) && epx.f(this.lastNameNom, groupsUserXtrRoleDto.lastNameNom) && epx.f(this.lastNameGen, groupsUserXtrRoleDto.lastNameGen) && epx.f(this.lastNameDat, groupsUserXtrRoleDto.lastNameDat) && epx.f(this.lastNameAcc, groupsUserXtrRoleDto.lastNameAcc) && epx.f(this.lastNameIns, groupsUserXtrRoleDto.lastNameIns) && epx.f(this.lastNameAbl, groupsUserXtrRoleDto.lastNameAbl) && epx.f(this.nickname, groupsUserXtrRoleDto.nickname) && epx.f(this.maidenName, groupsUserXtrRoleDto.maidenName) && epx.f(this.contactName, groupsUserXtrRoleDto.contactName) && epx.f(this.domain, groupsUserXtrRoleDto.domain) && epx.f(this.bdate, groupsUserXtrRoleDto.bdate) && this.bdateVisibility == groupsUserXtrRoleDto.bdateVisibility && epx.f(this.city, groupsUserXtrRoleDto.city) && epx.f(this.country, groupsUserXtrRoleDto.country) && epx.f(this.timezone, groupsUserXtrRoleDto.timezone) && epx.f(this.ownerState, groupsUserXtrRoleDto.ownerState) && epx.f(this.photo200, groupsUserXtrRoleDto.photo200) && epx.f(this.photoMax, groupsUserXtrRoleDto.photoMax) && epx.f(this.photo200Orig, groupsUserXtrRoleDto.photo200Orig) && epx.f(this.photo400Orig, groupsUserXtrRoleDto.photo400Orig) && epx.f(this.photoMaxOrig, groupsUserXtrRoleDto.photoMaxOrig) && epx.f(this.photoId, groupsUserXtrRoleDto.photoId) && this.hasPhoto == groupsUserXtrRoleDto.hasPhoto && epx.f(this.cover, groupsUserXtrRoleDto.cover) && epx.f(this.photoAvgColor, groupsUserXtrRoleDto.photoAvgColor) && this.hasMobile == groupsUserXtrRoleDto.hasMobile && this.isFriend == groupsUserXtrRoleDto.isFriend && epx.f(this.isBestFriend, groupsUserXtrRoleDto.isBestFriend) && this.wallComments == groupsUserXtrRoleDto.wallComments && this.canPost == groupsUserXtrRoleDto.canPost && this.canSeeAllPosts == groupsUserXtrRoleDto.canSeeAllPosts && this.canSeeAudio == groupsUserXtrRoleDto.canSeeAudio && this.type == groupsUserXtrRoleDto.type && epx.f(this.email, groupsUserXtrRoleDto.email) && epx.f(this.skype, groupsUserXtrRoleDto.skype) && epx.f(this.facebook, groupsUserXtrRoleDto.facebook) && epx.f(this.facebookName, groupsUserXtrRoleDto.facebookName) && epx.f(this.twitter, groupsUserXtrRoleDto.twitter) && this.isAdult == groupsUserXtrRoleDto.isAdult && this.isSubscribed == groupsUserXtrRoleDto.isSubscribed && epx.f(this.isSubscribedStories, groupsUserXtrRoleDto.isSubscribedStories) && epx.f(this.canSubscribeStories, groupsUserXtrRoleDto.canSubscribeStories) && epx.f(this.canAskQuestion, groupsUserXtrRoleDto.canAskQuestion) && epx.f(this.canAskAnonymous, groupsUserXtrRoleDto.canAskAnonymous) && epx.f(this.subscriptionCountry, groupsUserXtrRoleDto.subscriptionCountry) && epx.f(this.livejournal, groupsUserXtrRoleDto.livejournal) && epx.f(this.instagram, groupsUserXtrRoleDto.instagram) && this.test == groupsUserXtrRoleDto.test && epx.f(this.videoLive, groupsUserXtrRoleDto.videoLive) && this.isVideoLiveNotificationsBlocked == groupsUserXtrRoleDto.isVideoLiveNotificationsBlocked && epx.f(this.isService, groupsUserXtrRoleDto.isService) && epx.f(this.serviceDescription, groupsUserXtrRoleDto.serviceDescription) && epx.f(this.photoRec, groupsUserXtrRoleDto.photoRec) && epx.f(this.photoMedium, groupsUserXtrRoleDto.photoMedium) && epx.f(this.photoMediumRec, groupsUserXtrRoleDto.photoMediumRec) && epx.f(this.photo, groupsUserXtrRoleDto.photo) && epx.f(this.photoBig, groupsUserXtrRoleDto.photoBig) && epx.f(this.photo400, groupsUserXtrRoleDto.photo400) && epx.f(this.photoMaxSize, groupsUserXtrRoleDto.photoMaxSize) && epx.f(this.profileButtons, groupsUserXtrRoleDto.profileButtons) && epx.f(this.profileButtonsTablet, groupsUserXtrRoleDto.profileButtonsTablet) && epx.f(this.thirdPartyButtons, groupsUserXtrRoleDto.thirdPartyButtons) && epx.f(this.language, groupsUserXtrRoleDto.language) && epx.f(this.storiesArchiveCount, groupsUserXtrRoleDto.storiesArchiveCount) && epx.f(this.hasUnseenStories, groupsUserXtrRoleDto.hasUnseenStories) && this.wallDefault == groupsUserXtrRoleDto.wallDefault && epx.f(this.musicAwards, groupsUserXtrRoleDto.musicAwards) && epx.f(this.canCall, groupsUserXtrRoleDto.canCall) && epx.f(this.canCallFromGroup, groupsUserXtrRoleDto.canCallFromGroup) && epx.f(this.canInviteAsVoiceroomsSpeaker, groupsUserXtrRoleDto.canInviteAsVoiceroomsSpeaker) && epx.f(this.canSeeWishes, groupsUserXtrRoleDto.canSeeWishes) && this.canSeeGifts == groupsUserXtrRoleDto.canSeeGifts && epx.f(this.buttons, groupsUserXtrRoleDto.buttons) && epx.f(this.interests, groupsUserXtrRoleDto.interests) && epx.f(this.books, groupsUserXtrRoleDto.books) && epx.f(this.tv, groupsUserXtrRoleDto.tv) && epx.f(this.quotes, groupsUserXtrRoleDto.quotes) && epx.f(this.about, groupsUserXtrRoleDto.about) && epx.f(this.games, groupsUserXtrRoleDto.games) && epx.f(this.movies, groupsUserXtrRoleDto.movies) && epx.f(this.activities, groupsUserXtrRoleDto.activities) && epx.f(this.music, groupsUserXtrRoleDto.music) && this.canWritePrivateMessage == groupsUserXtrRoleDto.canWritePrivateMessage && this.canSendFriendRequest == groupsUserXtrRoleDto.canSendFriendRequest && epx.f(this.canBeInvitedGroup, groupsUserXtrRoleDto.canBeInvitedGroup) && epx.f(this.mobilePhone, groupsUserXtrRoleDto.mobilePhone) && epx.f(this.homePhone, groupsUserXtrRoleDto.homePhone) && epx.f(this.site, groupsUserXtrRoleDto.site) && epx.f(this.statusAudio, groupsUserXtrRoleDto.statusAudio) && epx.f(this.status, groupsUserXtrRoleDto.status) && epx.f(this.activity, groupsUserXtrRoleDto.activity) && epx.f(this.statusApp, groupsUserXtrRoleDto.statusApp) && epx.f(this.lastSeen, groupsUserXtrRoleDto.lastSeen) && epx.f(this.exports, groupsUserXtrRoleDto.exports) && epx.f(this.cropPhoto, groupsUserXtrRoleDto.cropPhoto) && epx.f(this.followersCount, groupsUserXtrRoleDto.followersCount) && epx.f(this.videoLiveLevel, groupsUserXtrRoleDto.videoLiveLevel) && epx.f(this.videoLiveCount, groupsUserXtrRoleDto.videoLiveCount) && epx.f(this.clipsCount, groupsUserXtrRoleDto.clipsCount) && this.blacklisted == groupsUserXtrRoleDto.blacklisted && this.blacklistedByMe == groupsUserXtrRoleDto.blacklistedByMe && this.isFavorite == groupsUserXtrRoleDto.isFavorite && this.isHiddenFromFeed == groupsUserXtrRoleDto.isHiddenFromFeed && epx.f(this.commonCount, groupsUserXtrRoleDto.commonCount) && epx.f(this.occupation, groupsUserXtrRoleDto.occupation) && epx.f(this.career, groupsUserXtrRoleDto.career) && epx.f(this.military, groupsUserXtrRoleDto.military) && epx.f(this.university, groupsUserXtrRoleDto.university) && epx.f(this.universityName, groupsUserXtrRoleDto.universityName) && epx.f(this.universityGroupId, groupsUserXtrRoleDto.universityGroupId) && epx.f(this.faculty, groupsUserXtrRoleDto.faculty) && epx.f(this.facultyName, groupsUserXtrRoleDto.facultyName) && epx.f(this.graduation, groupsUserXtrRoleDto.graduation) && epx.f(this.educationForm, groupsUserXtrRoleDto.educationForm) && epx.f(this.educationStatus, groupsUserXtrRoleDto.educationStatus) && epx.f(this.homeTown, groupsUserXtrRoleDto.homeTown) && this.relation == groupsUserXtrRoleDto.relation && epx.f(this.relationPartner, groupsUserXtrRoleDto.relationPartner) && epx.f(this.personal, groupsUserXtrRoleDto.personal) && epx.f(this.universities, groupsUserXtrRoleDto.universities) && epx.f(this.schools, groupsUserXtrRoleDto.schools) && epx.f(this.relatives, groupsUserXtrRoleDto.relatives) && epx.f(this.isSubscribedPodcasts, groupsUserXtrRoleDto.isSubscribedPodcasts) && epx.f(this.canSubscribePodcasts, groupsUserXtrRoleDto.canSubscribePodcasts) && epx.f(this.canSubscribePosts, groupsUserXtrRoleDto.canSubscribePosts) && epx.f(this.isStudent, groupsUserXtrRoleDto.isStudent) && epx.f(this.hasRights, groupsUserXtrRoleDto.hasRights) && epx.f(this.sysUsername, groupsUserXtrRoleDto.sysUsername) && epx.f(this.employeeWorkingState, groupsUserXtrRoleDto.employeeWorkingState) && this.employeeMark == groupsUserXtrRoleDto.employeeMark && epx.f(this.rightsLocation, groupsUserXtrRoleDto.rightsLocation) && epx.f(this.canInviteToChats, groupsUserXtrRoleDto.canInviteToChats) && epx.f(this.emojiStatus, groupsUserXtrRoleDto.emojiStatus) && epx.f(this.imageStatus, groupsUserXtrRoleDto.imageStatus) && epx.f(this.counters, groupsUserXtrRoleDto.counters) && epx.f(this.accessKey, groupsUserXtrRoleDto.accessKey) && this.canUploadDoc == groupsUserXtrRoleDto.canUploadDoc && epx.f(this.canBan, groupsUserXtrRoleDto.canBan) && epx.f(this.eduDetails, groupsUserXtrRoleDto.eduDetails) && epx.f(this.hash, groupsUserXtrRoleDto.hash) && epx.f(this.hasEmail, groupsUserXtrRoleDto.hasEmail) && epx.f(this.isDead, groupsUserXtrRoleDto.isDead) && epx.f(this.giftsTooltip, groupsUserXtrRoleDto.giftsTooltip) && this.noIndex == groupsUserXtrRoleDto.noIndex && epx.f(this.contactId, groupsUserXtrRoleDto.contactId) && epx.f(this.contact, groupsUserXtrRoleDto.contact) && epx.f(this.isMessageRequest, groupsUserXtrRoleDto.isMessageRequest) && epx.f(this.descriptions, groupsUserXtrRoleDto.descriptions) && epx.f(this.lists, groupsUserXtrRoleDto.lists) && epx.f(this.friendshipWeeks, groupsUserXtrRoleDto.friendshipWeeks) && epx.f(this.trackCode, groupsUserXtrRoleDto.trackCode) && epx.f(this.isPersonalAdsEasyPromoteEnabled, groupsUserXtrRoleDto.isPersonalAdsEasyPromoteEnabled) && epx.f(this.needBigMsgBtnInProfile, groupsUserXtrRoleDto.needBigMsgBtnInProfile) && this.profileType == groupsUserXtrRoleDto.profileType && this.canNotCallReason == groupsUserXtrRoleDto.canNotCallReason && epx.f(this.canCallAsCommunity, groupsUserXtrRoleDto.canCallAsCommunity) && epx.f(this.isNft, groupsUserXtrRoleDto.isNft) && epx.f(this.animatedAvatar, groupsUserXtrRoleDto.animatedAvatar) && epx.f(this.customNamesForCalls, groupsUserXtrRoleDto.customNamesForCalls) && epx.f(this.isEsiaVerified, groupsUserXtrRoleDto.isEsiaVerified) && epx.f(this.isEsiaLinked, groupsUserXtrRoleDto.isEsiaLinked) && epx.f(this.isTinkoffVerified, groupsUserXtrRoleDto.isTinkoffVerified) && epx.f(this.isTinkoffLinked, groupsUserXtrRoleDto.isTinkoffLinked) && epx.f(this.isSberVerified, groupsUserXtrRoleDto.isSberVerified) && epx.f(this.isVerified, groupsUserXtrRoleDto.isVerified) && epx.f(this.isFollowersModeOn, groupsUserXtrRoleDto.isFollowersModeOn) && this.socialButtonType == groupsUserXtrRoleDto.socialButtonType && epx.f(this.description, groupsUserXtrRoleDto.description) && epx.f(this.isTeacher, groupsUserXtrRoleDto.isTeacher) && epx.f(this.oauthLinked, groupsUserXtrRoleDto.oauthLinked) && epx.f(this.oauthVerification, groupsUserXtrRoleDto.oauthVerification) && epx.f(this.isSberLinked, groupsUserXtrRoleDto.isSberLinked) && epx.f(this.ageMark, groupsUserXtrRoleDto.ageMark) && epx.f(this.joined, groupsUserXtrRoleDto.joined) && epx.f(this.isServiceAccount, groupsUserXtrRoleDto.isServiceAccount) && epx.f(this.promotionAllowance, groupsUserXtrRoleDto.promotionAllowance) && epx.f(this.coOwnershipEnabled, groupsUserXtrRoleDto.coOwnershipEnabled) && epx.f(this.ageGroup, groupsUserXtrRoleDto.ageGroup) && epx.f(this.hasRelatedUserPin, groupsUserXtrRoleDto.hasRelatedUserPin) && epx.f(this.educationalProfile, groupsUserXtrRoleDto.educationalProfile) && epx.f(this.aPlusMark, groupsUserXtrRoleDto.aPlusMark) && epx.f(this.isMediaModer, groupsUserXtrRoleDto.isMediaModer) && epx.f(this.isPhotoMapEnabled, groupsUserXtrRoleDto.isPhotoMapEnabled) && epx.f(this.donut, groupsUserXtrRoleDto.donut) && this.sex == groupsUserXtrRoleDto.sex && epx.f(this.screenName, groupsUserXtrRoleDto.screenName) && epx.f(this.photo50, groupsUserXtrRoleDto.photo50) && epx.f(this.photo100, groupsUserXtrRoleDto.photo100) && epx.f(this.photoBase, groupsUserXtrRoleDto.photoBase) && epx.f(this.onlineInfo, groupsUserXtrRoleDto.onlineInfo) && this.online == groupsUserXtrRoleDto.online && this.onlineMobile == groupsUserXtrRoleDto.onlineMobile && epx.f(this.onlineApp, groupsUserXtrRoleDto.onlineApp) && this.verified == groupsUserXtrRoleDto.verified && this.trending == groupsUserXtrRoleDto.trending && this.friendStatus == groupsUserXtrRoleDto.friendStatus && epx.f(this.mutual, groupsUserXtrRoleDto.mutual) && epx.f(this.deactivated, groupsUserXtrRoleDto.deactivated) && epx.f(this.firstName, groupsUserXtrRoleDto.firstName) && epx.f(this.hidden, groupsUserXtrRoleDto.hidden) && epx.f(this.lastName, groupsUserXtrRoleDto.lastName) && epx.f(this.canAccessClosed, groupsUserXtrRoleDto.canAccessClosed) && epx.f(this.isClosed, groupsUserXtrRoleDto.isClosed) && epx.f(this.isCached, groupsUserXtrRoleDto.isCached);
    }

    public final BaseBoolIntDto f() {
        return this.blacklistedByMe;
    }

    public final Boolean g() {
        return this.canBan;
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        List<GroupsMemberRolePermissionDto> list = this.permissions;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        GroupsRoleOptionsDto groupsRoleOptionsDto = this.role;
        int hashCode3 = (hashCode2 + (groupsRoleOptionsDto == null ? 0 : groupsRoleOptionsDto.hashCode())) * 31;
        Boolean bool = this.isContact;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isCallOperator;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.contactPhone;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.contactEmail;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.contactPosition;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool3 = this.inGroup;
        int hashCode9 = (hashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.blacklistedByGroup;
        int hashCode10 = (hashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isDon;
        int hashCode11 = (hashCode10 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isExecutorInPayoutAccount;
        int hashCode12 = (hashCode11 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str4 = this.firstNameNom;
        int hashCode13 = (hashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.firstNameGen;
        int hashCode14 = (hashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.firstNameDat;
        int hashCode15 = (hashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.firstNameAcc;
        int hashCode16 = (hashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.firstNameIns;
        int hashCode17 = (hashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.firstNameAbl;
        int hashCode18 = (hashCode17 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.lastNameNom;
        int hashCode19 = (hashCode18 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.lastNameGen;
        int hashCode20 = (hashCode19 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.lastNameDat;
        int hashCode21 = (hashCode20 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.lastNameAcc;
        int hashCode22 = (hashCode21 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.lastNameIns;
        int hashCode23 = (hashCode22 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.lastNameAbl;
        int hashCode24 = (hashCode23 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.nickname;
        int hashCode25 = (hashCode24 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.maidenName;
        int hashCode26 = (hashCode25 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.contactName;
        int hashCode27 = (hashCode26 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.domain;
        int hashCode28 = (hashCode27 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.bdate;
        int hashCode29 = (hashCode28 + (str20 == null ? 0 : str20.hashCode())) * 31;
        BdateVisibilityDto bdateVisibilityDto = this.bdateVisibility;
        int hashCode30 = (hashCode29 + (bdateVisibilityDto == null ? 0 : bdateVisibilityDto.hashCode())) * 31;
        BaseCityDto baseCityDto = this.city;
        int hashCode31 = (hashCode30 + (baseCityDto == null ? 0 : baseCityDto.hashCode())) * 31;
        BaseCountryDto baseCountryDto = this.country;
        int hashCode32 = (hashCode31 + (baseCountryDto == null ? 0 : baseCountryDto.hashCode())) * 31;
        Float f = this.timezone;
        int hashCode33 = (hashCode32 + (f == null ? 0 : f.hashCode())) * 31;
        OwnerStateDto ownerStateDto = this.ownerState;
        int hashCode34 = (hashCode33 + (ownerStateDto == null ? 0 : ownerStateDto.hashCode())) * 31;
        String str21 = this.photo200;
        int hashCode35 = (hashCode34 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.photoMax;
        int hashCode36 = (hashCode35 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.photo200Orig;
        int hashCode37 = (hashCode36 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.photo400Orig;
        int hashCode38 = (hashCode37 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.photoMaxOrig;
        int hashCode39 = (hashCode38 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.photoId;
        int hashCode40 = (hashCode39 + (str26 == null ? 0 : str26.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.hasPhoto;
        int hashCode41 = (hashCode40 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseOwnerCoverDto baseOwnerCoverDto = this.cover;
        int hashCode42 = (hashCode41 + (baseOwnerCoverDto == null ? 0 : baseOwnerCoverDto.hashCode())) * 31;
        String str27 = this.photoAvgColor;
        int hashCode43 = (hashCode42 + (str27 == null ? 0 : str27.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.hasMobile;
        int hashCode44 = (hashCode43 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.isFriend;
        int hashCode45 = (hashCode44 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        Boolean bool7 = this.isBestFriend;
        int hashCode46 = (hashCode45 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.wallComments;
        int hashCode47 = (hashCode46 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto5 = this.canPost;
        int hashCode48 = (hashCode47 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto6 = this.canSeeAllPosts;
        int hashCode49 = (hashCode48 + (baseBoolIntDto6 == null ? 0 : baseBoolIntDto6.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto7 = this.canSeeAudio;
        int hashCode50 = (hashCode49 + (baseBoolIntDto7 == null ? 0 : baseBoolIntDto7.hashCode())) * 31;
        UsersUserTypeDto usersUserTypeDto = this.type;
        int hashCode51 = (hashCode50 + (usersUserTypeDto == null ? 0 : usersUserTypeDto.hashCode())) * 31;
        String str28 = this.email;
        int hashCode52 = (hashCode51 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.skype;
        int hashCode53 = (hashCode52 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.facebook;
        int hashCode54 = (hashCode53 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.facebookName;
        int hashCode55 = (hashCode54 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.twitter;
        int hashCode56 = (hashCode55 + (str32 == null ? 0 : str32.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto8 = this.isAdult;
        int hashCode57 = (hashCode56 + (baseBoolIntDto8 == null ? 0 : baseBoolIntDto8.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto9 = this.isSubscribed;
        int hashCode58 = (hashCode57 + (baseBoolIntDto9 == null ? 0 : baseBoolIntDto9.hashCode())) * 31;
        Boolean bool8 = this.isSubscribedStories;
        int hashCode59 = (hashCode58 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.canSubscribeStories;
        int hashCode60 = (hashCode59 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.canAskQuestion;
        int hashCode61 = (hashCode60 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.canAskAnonymous;
        int hashCode62 = (hashCode61 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        String str33 = this.subscriptionCountry;
        int hashCode63 = (hashCode62 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.livejournal;
        int hashCode64 = (hashCode63 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.instagram;
        int hashCode65 = (hashCode64 + (str35 == null ? 0 : str35.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto10 = this.test;
        int hashCode66 = (hashCode65 + (baseBoolIntDto10 == null ? 0 : baseBoolIntDto10.hashCode())) * 31;
        VideoLiveInfoDto videoLiveInfoDto = this.videoLive;
        int hashCode67 = (hashCode66 + (videoLiveInfoDto == null ? 0 : videoLiveInfoDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto11 = this.isVideoLiveNotificationsBlocked;
        int hashCode68 = (hashCode67 + (baseBoolIntDto11 == null ? 0 : baseBoolIntDto11.hashCode())) * 31;
        Boolean bool12 = this.isService;
        int hashCode69 = (hashCode68 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        String str36 = this.serviceDescription;
        int hashCode70 = (hashCode69 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.photoRec;
        int hashCode71 = (hashCode70 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.photoMedium;
        int hashCode72 = (hashCode71 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.photoMediumRec;
        int hashCode73 = (hashCode72 + (str39 == null ? 0 : str39.hashCode())) * 31;
        String str40 = this.photo;
        int hashCode74 = (hashCode73 + (str40 == null ? 0 : str40.hashCode())) * 31;
        String str41 = this.photoBig;
        int hashCode75 = (hashCode74 + (str41 == null ? 0 : str41.hashCode())) * 31;
        String str42 = this.photo400;
        int hashCode76 = (hashCode75 + (str42 == null ? 0 : str42.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photoMaxSize;
        int hashCode77 = (hashCode76 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        List<List<UsersProfileButtonDto>> list2 = this.profileButtons;
        int hashCode78 = (hashCode77 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<List<UsersProfileButtonDto>> list3 = this.profileButtonsTablet;
        int hashCode79 = (hashCode78 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<UsersProfileButtonDto> list4 = this.thirdPartyButtons;
        int hashCode80 = (hashCode79 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str43 = this.language;
        int hashCode81 = (hashCode80 + (str43 == null ? 0 : str43.hashCode())) * 31;
        Integer num = this.storiesArchiveCount;
        int hashCode82 = (hashCode81 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool13 = this.hasUnseenStories;
        int hashCode83 = (hashCode82 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        WallDefaultDto wallDefaultDto = this.wallDefault;
        int hashCode84 = (hashCode83 + (wallDefaultDto == null ? 0 : wallDefaultDto.hashCode())) * 31;
        AudioMusicAwardsDto audioMusicAwardsDto = this.musicAwards;
        int hashCode85 = (hashCode84 + (audioMusicAwardsDto == null ? 0 : audioMusicAwardsDto.hashCode())) * 31;
        Boolean bool14 = this.canCall;
        int hashCode86 = (hashCode85 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.canCallFromGroup;
        int hashCode87 = (hashCode86 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.canInviteAsVoiceroomsSpeaker;
        int hashCode88 = (hashCode87 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        Boolean bool17 = this.canSeeWishes;
        int hashCode89 = (hashCode88 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto12 = this.canSeeGifts;
        int hashCode90 = (hashCode89 + (baseBoolIntDto12 == null ? 0 : baseBoolIntDto12.hashCode())) * 31;
        List<BaseOwnerButtonDto> list5 = this.buttons;
        int hashCode91 = (hashCode90 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str44 = this.interests;
        int hashCode92 = (hashCode91 + (str44 == null ? 0 : str44.hashCode())) * 31;
        String str45 = this.books;
        int hashCode93 = (hashCode92 + (str45 == null ? 0 : str45.hashCode())) * 31;
        String str46 = this.tv;
        int hashCode94 = (hashCode93 + (str46 == null ? 0 : str46.hashCode())) * 31;
        String str47 = this.quotes;
        int hashCode95 = (hashCode94 + (str47 == null ? 0 : str47.hashCode())) * 31;
        String str48 = this.about;
        int hashCode96 = (hashCode95 + (str48 == null ? 0 : str48.hashCode())) * 31;
        String str49 = this.games;
        int hashCode97 = (hashCode96 + (str49 == null ? 0 : str49.hashCode())) * 31;
        String str50 = this.movies;
        int hashCode98 = (hashCode97 + (str50 == null ? 0 : str50.hashCode())) * 31;
        String str51 = this.activities;
        int hashCode99 = (hashCode98 + (str51 == null ? 0 : str51.hashCode())) * 31;
        String str52 = this.music;
        int hashCode100 = (hashCode99 + (str52 == null ? 0 : str52.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto13 = this.canWritePrivateMessage;
        int hashCode101 = (hashCode100 + (baseBoolIntDto13 == null ? 0 : baseBoolIntDto13.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto14 = this.canSendFriendRequest;
        int hashCode102 = (hashCode101 + (baseBoolIntDto14 == null ? 0 : baseBoolIntDto14.hashCode())) * 31;
        Boolean bool18 = this.canBeInvitedGroup;
        int hashCode103 = (hashCode102 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        String str53 = this.mobilePhone;
        int hashCode104 = (hashCode103 + (str53 == null ? 0 : str53.hashCode())) * 31;
        String str54 = this.homePhone;
        int hashCode105 = (hashCode104 + (str54 == null ? 0 : str54.hashCode())) * 31;
        String str55 = this.site;
        int hashCode106 = (hashCode105 + (str55 == null ? 0 : str55.hashCode())) * 31;
        AudioAudioDto audioAudioDto = this.statusAudio;
        int hashCode107 = (hashCode106 + (audioAudioDto == null ? 0 : audioAudioDto.hashCode())) * 31;
        String str56 = this.status;
        int hashCode108 = (hashCode107 + (str56 == null ? 0 : str56.hashCode())) * 31;
        String str57 = this.activity;
        int hashCode109 = (hashCode108 + (str57 == null ? 0 : str57.hashCode())) * 31;
        AppsAppMinDto appsAppMinDto = this.statusApp;
        int hashCode110 = (hashCode109 + (appsAppMinDto == null ? 0 : appsAppMinDto.hashCode())) * 31;
        UsersLastSeenDto usersLastSeenDto = this.lastSeen;
        int hashCode111 = (hashCode110 + (usersLastSeenDto == null ? 0 : usersLastSeenDto.hashCode())) * 31;
        UsersExportsDto usersExportsDto = this.exports;
        int hashCode112 = (hashCode111 + (usersExportsDto == null ? 0 : usersExportsDto.hashCode())) * 31;
        BaseCropPhotoDto baseCropPhotoDto = this.cropPhoto;
        int hashCode113 = (hashCode112 + (baseCropPhotoDto == null ? 0 : baseCropPhotoDto.hashCode())) * 31;
        Integer num2 = this.followersCount;
        int hashCode114 = (hashCode113 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.videoLiveLevel;
        int hashCode115 = (hashCode114 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.videoLiveCount;
        int hashCode116 = (hashCode115 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.clipsCount;
        int hashCode117 = (hashCode116 + (num5 == null ? 0 : num5.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto15 = this.blacklisted;
        int hashCode118 = (hashCode117 + (baseBoolIntDto15 == null ? 0 : baseBoolIntDto15.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto16 = this.blacklistedByMe;
        int hashCode119 = (hashCode118 + (baseBoolIntDto16 == null ? 0 : baseBoolIntDto16.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto17 = this.isFavorite;
        int hashCode120 = (hashCode119 + (baseBoolIntDto17 == null ? 0 : baseBoolIntDto17.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto18 = this.isHiddenFromFeed;
        int hashCode121 = (hashCode120 + (baseBoolIntDto18 == null ? 0 : baseBoolIntDto18.hashCode())) * 31;
        Integer num6 = this.commonCount;
        int hashCode122 = (hashCode121 + (num6 == null ? 0 : num6.hashCode())) * 31;
        UsersOccupationDto usersOccupationDto = this.occupation;
        int hashCode123 = (hashCode122 + (usersOccupationDto == null ? 0 : usersOccupationDto.hashCode())) * 31;
        List<UsersCareerDto> list6 = this.career;
        int hashCode124 = (hashCode123 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<UsersMilitaryDto> list7 = this.military;
        int hashCode125 = (hashCode124 + (list7 == null ? 0 : list7.hashCode())) * 31;
        Integer num7 = this.university;
        int hashCode126 = (hashCode125 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str58 = this.universityName;
        int hashCode127 = (hashCode126 + (str58 == null ? 0 : str58.hashCode())) * 31;
        Integer num8 = this.universityGroupId;
        int hashCode128 = (hashCode127 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.faculty;
        int hashCode129 = (hashCode128 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str59 = this.facultyName;
        int hashCode130 = (hashCode129 + (str59 == null ? 0 : str59.hashCode())) * 31;
        Integer num10 = this.graduation;
        int hashCode131 = (hashCode130 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str60 = this.educationForm;
        int hashCode132 = (hashCode131 + (str60 == null ? 0 : str60.hashCode())) * 31;
        String str61 = this.educationStatus;
        int hashCode133 = (hashCode132 + (str61 == null ? 0 : str61.hashCode())) * 31;
        String str62 = this.homeTown;
        int hashCode134 = (hashCode133 + (str62 == null ? 0 : str62.hashCode())) * 31;
        UsersUserRelationDto usersUserRelationDto = this.relation;
        int hashCode135 = (hashCode134 + (usersUserRelationDto == null ? 0 : usersUserRelationDto.hashCode())) * 31;
        UsersUserMinDto usersUserMinDto = this.relationPartner;
        int hashCode136 = (hashCode135 + (usersUserMinDto == null ? 0 : usersUserMinDto.hashCode())) * 31;
        UsersPersonalDto usersPersonalDto = this.personal;
        int hashCode137 = (hashCode136 + (usersPersonalDto == null ? 0 : usersPersonalDto.hashCode())) * 31;
        List<UsersUniversityDto> list8 = this.universities;
        int hashCode138 = (hashCode137 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<UsersSchoolDto> list9 = this.schools;
        int hashCode139 = (hashCode138 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<UsersRelativeDto> list10 = this.relatives;
        int hashCode140 = (hashCode139 + (list10 == null ? 0 : list10.hashCode())) * 31;
        Boolean bool19 = this.isSubscribedPodcasts;
        int hashCode141 = (hashCode140 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        Boolean bool20 = this.canSubscribePodcasts;
        int hashCode142 = (hashCode141 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        Boolean bool21 = this.canSubscribePosts;
        int hashCode143 = (hashCode142 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
        Boolean bool22 = this.isStudent;
        int hashCode144 = (hashCode143 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
        Boolean bool23 = this.hasRights;
        int hashCode145 = (hashCode144 + (bool23 == null ? 0 : bool23.hashCode())) * 31;
        String str63 = this.sysUsername;
        int hashCode146 = (hashCode145 + (str63 == null ? 0 : str63.hashCode())) * 31;
        UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto = this.employeeWorkingState;
        int hashCode147 = (hashCode146 + (usersEmployeeWorkingStateDto == null ? 0 : usersEmployeeWorkingStateDto.hashCode())) * 31;
        EmployeeMarkDto employeeMarkDto = this.employeeMark;
        int hashCode148 = (hashCode147 + (employeeMarkDto == null ? 0 : employeeMarkDto.hashCode())) * 31;
        UsersRightsLocationDto usersRightsLocationDto = this.rightsLocation;
        int hashCode149 = (hashCode148 + (usersRightsLocationDto == null ? 0 : usersRightsLocationDto.hashCode())) * 31;
        Boolean bool24 = this.canInviteToChats;
        int hashCode150 = (hashCode149 + (bool24 == null ? 0 : bool24.hashCode())) * 31;
        UsersEmojiStatusDto usersEmojiStatusDto = this.emojiStatus;
        int hashCode151 = (hashCode150 + (usersEmojiStatusDto == null ? 0 : usersEmojiStatusDto.hashCode())) * 31;
        StatusImageStatusDto statusImageStatusDto = this.imageStatus;
        int hashCode152 = (hashCode151 + (statusImageStatusDto == null ? 0 : statusImageStatusDto.hashCode())) * 31;
        UsersUserCountersDto usersUserCountersDto = this.counters;
        int hashCode153 = (hashCode152 + (usersUserCountersDto == null ? 0 : usersUserCountersDto.hashCode())) * 31;
        String str64 = this.accessKey;
        int hashCode154 = (hashCode153 + (str64 == null ? 0 : str64.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto19 = this.canUploadDoc;
        int hashCode155 = (hashCode154 + (baseBoolIntDto19 == null ? 0 : baseBoolIntDto19.hashCode())) * 31;
        Boolean bool25 = this.canBan;
        int hashCode156 = (hashCode155 + (bool25 == null ? 0 : bool25.hashCode())) * 31;
        List<String> list11 = this.eduDetails;
        int hashCode157 = (hashCode156 + (list11 == null ? 0 : list11.hashCode())) * 31;
        String str65 = this.hash;
        int hashCode158 = (hashCode157 + (str65 == null ? 0 : str65.hashCode())) * 31;
        Boolean bool26 = this.hasEmail;
        int hashCode159 = (hashCode158 + (bool26 == null ? 0 : bool26.hashCode())) * 31;
        Boolean bool27 = this.isDead;
        int hashCode160 = (hashCode159 + (bool27 == null ? 0 : bool27.hashCode())) * 31;
        UsersGiftsTooltipDto usersGiftsTooltipDto = this.giftsTooltip;
        int hashCode161 = (hashCode160 + (usersGiftsTooltipDto == null ? 0 : usersGiftsTooltipDto.hashCode())) * 31;
        NoIndexDto noIndexDto = this.noIndex;
        int hashCode162 = (hashCode161 + (noIndexDto == null ? 0 : noIndexDto.hashCode())) * 31;
        Integer num11 = this.contactId;
        int hashCode163 = (hashCode162 + (num11 == null ? 0 : num11.hashCode())) * 31;
        MessagesContactDto messagesContactDto = this.contact;
        int hashCode164 = (hashCode163 + (messagesContactDto == null ? 0 : messagesContactDto.hashCode())) * 31;
        Boolean bool28 = this.isMessageRequest;
        int hashCode165 = (hashCode164 + (bool28 == null ? 0 : bool28.hashCode())) * 31;
        List<String> list12 = this.descriptions;
        int hashCode166 = (hashCode165 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List<Integer> list13 = this.lists;
        int hashCode167 = (hashCode166 + (list13 == null ? 0 : list13.hashCode())) * 31;
        Integer num12 = this.friendshipWeeks;
        int hashCode168 = (hashCode167 + (num12 == null ? 0 : num12.hashCode())) * 31;
        String str66 = this.trackCode;
        int hashCode169 = (hashCode168 + (str66 == null ? 0 : str66.hashCode())) * 31;
        Boolean bool29 = this.isPersonalAdsEasyPromoteEnabled;
        int hashCode170 = (hashCode169 + (bool29 == null ? 0 : bool29.hashCode())) * 31;
        Boolean bool30 = this.needBigMsgBtnInProfile;
        int hashCode171 = (hashCode170 + (bool30 == null ? 0 : bool30.hashCode())) * 31;
        UsersUserProfileTypeDto usersUserProfileTypeDto = this.profileType;
        int hashCode172 = (hashCode171 + (usersUserProfileTypeDto == null ? 0 : usersUserProfileTypeDto.hashCode())) * 31;
        UsersCanNotCallReasonDto usersCanNotCallReasonDto = this.canNotCallReason;
        int hashCode173 = (hashCode172 + (usersCanNotCallReasonDto == null ? 0 : usersCanNotCallReasonDto.hashCode())) * 31;
        Boolean bool31 = this.canCallAsCommunity;
        int hashCode174 = (hashCode173 + (bool31 == null ? 0 : bool31.hashCode())) * 31;
        Boolean bool32 = this.isNft;
        int hashCode175 = (hashCode174 + (bool32 == null ? 0 : bool32.hashCode())) * 31;
        BaseImageDto baseImageDto = this.animatedAvatar;
        int hashCode176 = (hashCode175 + (baseImageDto == null ? 0 : baseImageDto.hashCode())) * 31;
        List<CallsCustomNameForCallDto> list14 = this.customNamesForCalls;
        int hashCode177 = (hashCode176 + (list14 == null ? 0 : list14.hashCode())) * 31;
        Boolean bool33 = this.isEsiaVerified;
        int hashCode178 = (hashCode177 + (bool33 == null ? 0 : bool33.hashCode())) * 31;
        Boolean bool34 = this.isEsiaLinked;
        int hashCode179 = (hashCode178 + (bool34 == null ? 0 : bool34.hashCode())) * 31;
        Boolean bool35 = this.isTinkoffVerified;
        int hashCode180 = (hashCode179 + (bool35 == null ? 0 : bool35.hashCode())) * 31;
        Boolean bool36 = this.isTinkoffLinked;
        int hashCode181 = (hashCode180 + (bool36 == null ? 0 : bool36.hashCode())) * 31;
        Boolean bool37 = this.isSberVerified;
        int hashCode182 = (hashCode181 + (bool37 == null ? 0 : bool37.hashCode())) * 31;
        Boolean bool38 = this.isVerified;
        int hashCode183 = (hashCode182 + (bool38 == null ? 0 : bool38.hashCode())) * 31;
        Boolean bool39 = this.isFollowersModeOn;
        int hashCode184 = (hashCode183 + (bool39 == null ? 0 : bool39.hashCode())) * 31;
        SocialButtonTypeDto socialButtonTypeDto = this.socialButtonType;
        int hashCode185 = (hashCode184 + (socialButtonTypeDto == null ? 0 : socialButtonTypeDto.hashCode())) * 31;
        String str67 = this.description;
        int hashCode186 = (hashCode185 + (str67 == null ? 0 : str67.hashCode())) * 31;
        Boolean bool40 = this.isTeacher;
        int hashCode187 = (hashCode186 + (bool40 == null ? 0 : bool40.hashCode())) * 31;
        List<String> list15 = this.oauthLinked;
        int hashCode188 = (hashCode187 + (list15 == null ? 0 : list15.hashCode())) * 31;
        List<String> list16 = this.oauthVerification;
        int hashCode189 = (hashCode188 + (list16 == null ? 0 : list16.hashCode())) * 31;
        Boolean bool41 = this.isSberLinked;
        int hashCode190 = (hashCode189 + (bool41 == null ? 0 : bool41.hashCode())) * 31;
        Integer num13 = this.ageMark;
        int hashCode191 = (hashCode190 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.joined;
        int hashCode192 = (hashCode191 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Boolean bool42 = this.isServiceAccount;
        int hashCode193 = (hashCode192 + (bool42 == null ? 0 : bool42.hashCode())) * 31;
        UsersPromotionAllowanceDto usersPromotionAllowanceDto = this.promotionAllowance;
        int hashCode194 = (hashCode193 + (usersPromotionAllowanceDto == null ? 0 : usersPromotionAllowanceDto.hashCode())) * 31;
        Boolean bool43 = this.coOwnershipEnabled;
        int hashCode195 = (hashCode194 + (bool43 == null ? 0 : bool43.hashCode())) * 31;
        Integer num15 = this.ageGroup;
        int hashCode196 = (hashCode195 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Boolean bool44 = this.hasRelatedUserPin;
        int hashCode197 = (hashCode196 + (bool44 == null ? 0 : bool44.hashCode())) * 31;
        MessagesEduEducationalProfileDto messagesEduEducationalProfileDto = this.educationalProfile;
        int hashCode198 = (hashCode197 + (messagesEduEducationalProfileDto == null ? 0 : messagesEduEducationalProfileDto.hashCode())) * 31;
        BaseAPlusMarkDto baseAPlusMarkDto = this.aPlusMark;
        int hashCode199 = (hashCode198 + (baseAPlusMarkDto == null ? 0 : baseAPlusMarkDto.hashCode())) * 31;
        Boolean bool45 = this.isMediaModer;
        int hashCode200 = (hashCode199 + (bool45 == null ? 0 : bool45.hashCode())) * 31;
        Boolean bool46 = this.isPhotoMapEnabled;
        int hashCode201 = (hashCode200 + (bool46 == null ? 0 : bool46.hashCode())) * 31;
        UsersDonutDto usersDonutDto = this.donut;
        int hashCode202 = (hashCode201 + (usersDonutDto == null ? 0 : usersDonutDto.hashCode())) * 31;
        BaseSexDto baseSexDto = this.sex;
        int hashCode203 = (hashCode202 + (baseSexDto == null ? 0 : baseSexDto.hashCode())) * 31;
        String str68 = this.screenName;
        int hashCode204 = (hashCode203 + (str68 == null ? 0 : str68.hashCode())) * 31;
        String str69 = this.photo50;
        int hashCode205 = (hashCode204 + (str69 == null ? 0 : str69.hashCode())) * 31;
        String str70 = this.photo100;
        int hashCode206 = (hashCode205 + (str70 == null ? 0 : str70.hashCode())) * 31;
        String str71 = this.photoBase;
        int hashCode207 = (hashCode206 + (str71 == null ? 0 : str71.hashCode())) * 31;
        UsersOnlineInfoDto usersOnlineInfoDto = this.onlineInfo;
        int hashCode208 = (hashCode207 + (usersOnlineInfoDto == null ? 0 : usersOnlineInfoDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto20 = this.online;
        int hashCode209 = (hashCode208 + (baseBoolIntDto20 == null ? 0 : baseBoolIntDto20.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto21 = this.onlineMobile;
        int hashCode210 = (hashCode209 + (baseBoolIntDto21 == null ? 0 : baseBoolIntDto21.hashCode())) * 31;
        Integer num16 = this.onlineApp;
        int hashCode211 = (hashCode210 + (num16 == null ? 0 : num16.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto22 = this.verified;
        int hashCode212 = (hashCode211 + (baseBoolIntDto22 == null ? 0 : baseBoolIntDto22.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto23 = this.trending;
        int hashCode213 = (hashCode212 + (baseBoolIntDto23 == null ? 0 : baseBoolIntDto23.hashCode())) * 31;
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto = this.friendStatus;
        int hashCode214 = (hashCode213 + (friendsFriendStatusStatusDto == null ? 0 : friendsFriendStatusStatusDto.hashCode())) * 31;
        FriendsRequestsMutualDto friendsRequestsMutualDto = this.mutual;
        int hashCode215 = (hashCode214 + (friendsRequestsMutualDto == null ? 0 : friendsRequestsMutualDto.hashCode())) * 31;
        String str72 = this.deactivated;
        int hashCode216 = (hashCode215 + (str72 == null ? 0 : str72.hashCode())) * 31;
        String str73 = this.firstName;
        int hashCode217 = (hashCode216 + (str73 == null ? 0 : str73.hashCode())) * 31;
        Integer num17 = this.hidden;
        int hashCode218 = (hashCode217 + (num17 == null ? 0 : num17.hashCode())) * 31;
        String str74 = this.lastName;
        int hashCode219 = (hashCode218 + (str74 == null ? 0 : str74.hashCode())) * 31;
        Boolean bool47 = this.canAccessClosed;
        int hashCode220 = (hashCode219 + (bool47 == null ? 0 : bool47.hashCode())) * 31;
        Boolean bool48 = this.isClosed;
        int hashCode221 = (hashCode220 + (bool48 == null ? 0 : bool48.hashCode())) * 31;
        Boolean bool49 = this.isCached;
        return hashCode221 + (bool49 != null ? bool49.hashCode() : 0);
    }

    public final Boolean i() {
        return this.canCall;
    }

    public final Boolean i2() {
        return this.isNft;
    }

    public final BaseBoolIntDto j() {
        return this.canSendFriendRequest;
    }

    public final Boolean k() {
        return this.canSubscribeStories;
    }

    public final BaseBoolIntDto l() {
        return this.canWritePrivateMessage;
    }

    public final FriendsFriendStatusStatusDto l0() {
        return this.friendStatus;
    }

    public final Boolean l2() {
        return this.isSubscribedStories;
    }

    public final BaseBoolIntDto m2() {
        return this.isVideoLiveNotificationsBlocked;
    }

    public final List<UsersCareerDto> n() {
        return this.career;
    }

    public final OwnerStateDto n1() {
        return this.ownerState;
    }

    public final BaseCityDto o() {
        return this.city;
    }

    public final String o1() {
        return this.photo100;
    }

    public final Integer p() {
        return this.clipsCount;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String s1() {
        return this.photo50;
    }

    public final String t1() {
        return this.photoBase;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsUserXtrRoleDto(id=");
        sb.append(this.id);
        sb.append(", permissions=");
        sb.append(this.permissions);
        sb.append(", role=");
        sb.append(this.role);
        sb.append(", isContact=");
        sb.append(this.isContact);
        sb.append(", isCallOperator=");
        sb.append(this.isCallOperator);
        sb.append(", contactPhone=");
        sb.append(this.contactPhone);
        sb.append(", contactEmail=");
        sb.append(this.contactEmail);
        sb.append(", contactPosition=");
        sb.append(this.contactPosition);
        sb.append(", inGroup=");
        sb.append(this.inGroup);
        sb.append(", blacklistedByGroup=");
        sb.append(this.blacklistedByGroup);
        sb.append(", isDon=");
        sb.append(this.isDon);
        sb.append(", isExecutorInPayoutAccount=");
        sb.append(this.isExecutorInPayoutAccount);
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

    public final BaseCountryDto u() {
        return this.country;
    }

    public final Integer v0() {
        return this.graduation;
    }

    public final BaseBoolIntDto w0() {
        return this.hasPhoto;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        List<GroupsMemberRolePermissionDto> list = this.permissions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((GroupsMemberRolePermissionDto) f.next()).writeToParcel(parcel, i);
            }
        }
        GroupsRoleOptionsDto groupsRoleOptionsDto = this.role;
        if (groupsRoleOptionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsRoleOptionsDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.isContact;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isCallOperator;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.contactPhone);
        parcel.writeString(this.contactEmail);
        parcel.writeString(this.contactPosition);
        Boolean bool3 = this.inGroup;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.blacklistedByGroup;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.isDon;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        Boolean bool6 = this.isExecutorInPayoutAccount;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
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
        Boolean bool7 = this.isBestFriend;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
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
        Boolean bool8 = this.isSubscribedStories;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool8);
        }
        Boolean bool9 = this.canSubscribeStories;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool9);
        }
        Boolean bool10 = this.canAskQuestion;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool10);
        }
        Boolean bool11 = this.canAskAnonymous;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool11);
        }
        parcel.writeString(this.subscriptionCountry);
        parcel.writeString(this.livejournal);
        parcel.writeString(this.instagram);
        parcel.writeParcelable(this.test, i);
        parcel.writeParcelable(this.videoLive, i);
        parcel.writeParcelable(this.isVideoLiveNotificationsBlocked, i);
        Boolean bool12 = this.isService;
        if (bool12 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool12);
        }
        parcel.writeString(this.serviceDescription);
        parcel.writeString(this.photoRec);
        parcel.writeString(this.photoMedium);
        parcel.writeString(this.photoMediumRec);
        parcel.writeString(this.photo);
        parcel.writeString(this.photoBig);
        parcel.writeString(this.photo400);
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
        Integer num = this.storiesArchiveCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool13 = this.hasUnseenStories;
        if (bool13 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool13);
        }
        WallDefaultDto wallDefaultDto = this.wallDefault;
        if (wallDefaultDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallDefaultDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.musicAwards, i);
        Boolean bool14 = this.canCall;
        if (bool14 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool14);
        }
        Boolean bool15 = this.canCallFromGroup;
        if (bool15 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool15);
        }
        Boolean bool16 = this.canInviteAsVoiceroomsSpeaker;
        if (bool16 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool16);
        }
        Boolean bool17 = this.canSeeWishes;
        if (bool17 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool17);
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
        parcel.writeParcelable(this.canWritePrivateMessage, i);
        parcel.writeParcelable(this.canSendFriendRequest, i);
        Boolean bool18 = this.canBeInvitedGroup;
        if (bool18 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool18);
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
        parcel.writeParcelable(this.blacklisted, i);
        parcel.writeParcelable(this.blacklistedByMe, i);
        parcel.writeParcelable(this.isFavorite, i);
        parcel.writeParcelable(this.isHiddenFromFeed, i);
        Integer num6 = this.commonCount;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
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
        Boolean bool19 = this.isSubscribedPodcasts;
        if (bool19 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool19);
        }
        Boolean bool20 = this.canSubscribePodcasts;
        if (bool20 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool20);
        }
        Boolean bool21 = this.canSubscribePosts;
        if (bool21 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool21);
        }
        Boolean bool22 = this.isStudent;
        if (bool22 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool22);
        }
        Boolean bool23 = this.hasRights;
        if (bool23 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool23);
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
        Boolean bool24 = this.canInviteToChats;
        if (bool24 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool24);
        }
        parcel.writeParcelable(this.emojiStatus, i);
        parcel.writeParcelable(this.imageStatus, i);
        parcel.writeParcelable(this.counters, i);
        parcel.writeString(this.accessKey);
        parcel.writeParcelable(this.canUploadDoc, i);
        Boolean bool25 = this.canBan;
        if (bool25 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool25);
        }
        parcel.writeStringList(this.eduDetails);
        parcel.writeString(this.hash);
        Boolean bool26 = this.hasEmail;
        if (bool26 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool26);
        }
        Boolean bool27 = this.isDead;
        if (bool27 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool27);
        }
        parcel.writeParcelable(this.giftsTooltip, i);
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
        parcel.writeParcelable(this.contact, i);
        Boolean bool28 = this.isMessageRequest;
        if (bool28 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool28);
        }
        parcel.writeStringList(this.descriptions);
        List<Integer> list11 = this.lists;
        if (list11 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f12 = dn.f(parcel, list11, 1);
            while (f12.hasNext()) {
                parcel.writeInt(((Number) f12.next()).intValue());
            }
        }
        Integer num12 = this.friendshipWeeks;
        if (num12 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num12);
        }
        parcel.writeString(this.trackCode);
        Boolean bool29 = this.isPersonalAdsEasyPromoteEnabled;
        if (bool29 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool29);
        }
        Boolean bool30 = this.needBigMsgBtnInProfile;
        if (bool30 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool30);
        }
        parcel.writeParcelable(this.profileType, i);
        parcel.writeParcelable(this.canNotCallReason, i);
        Boolean bool31 = this.canCallAsCommunity;
        if (bool31 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool31);
        }
        Boolean bool32 = this.isNft;
        if (bool32 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool32);
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
        Boolean bool33 = this.isEsiaVerified;
        if (bool33 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool33);
        }
        Boolean bool34 = this.isEsiaLinked;
        if (bool34 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool34);
        }
        Boolean bool35 = this.isTinkoffVerified;
        if (bool35 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool35);
        }
        Boolean bool36 = this.isTinkoffLinked;
        if (bool36 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool36);
        }
        Boolean bool37 = this.isSberVerified;
        if (bool37 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool37);
        }
        Boolean bool38 = this.isVerified;
        if (bool38 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool38);
        }
        Boolean bool39 = this.isFollowersModeOn;
        if (bool39 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool39);
        }
        SocialButtonTypeDto socialButtonTypeDto = this.socialButtonType;
        if (socialButtonTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            socialButtonTypeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.description);
        Boolean bool40 = this.isTeacher;
        if (bool40 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool40);
        }
        parcel.writeStringList(this.oauthLinked);
        parcel.writeStringList(this.oauthVerification);
        Boolean bool41 = this.isSberLinked;
        if (bool41 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool41);
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
        Boolean bool42 = this.isServiceAccount;
        if (bool42 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool42);
        }
        parcel.writeParcelable(this.promotionAllowance, i);
        Boolean bool43 = this.coOwnershipEnabled;
        if (bool43 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool43);
        }
        Integer num15 = this.ageGroup;
        if (num15 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num15);
        }
        Boolean bool44 = this.hasRelatedUserPin;
        if (bool44 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool44);
        }
        parcel.writeParcelable(this.educationalProfile, i);
        parcel.writeParcelable(this.aPlusMark, i);
        Boolean bool45 = this.isMediaModer;
        if (bool45 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool45);
        }
        Boolean bool46 = this.isPhotoMapEnabled;
        if (bool46 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool46);
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
        Integer num16 = this.onlineApp;
        if (num16 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num16);
        }
        parcel.writeParcelable(this.verified, i);
        parcel.writeParcelable(this.trending, i);
        parcel.writeParcelable(this.friendStatus, i);
        parcel.writeParcelable(this.mutual, i);
        parcel.writeString(this.deactivated);
        parcel.writeString(this.firstName);
        Integer num17 = this.hidden;
        if (num17 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num17);
        }
        parcel.writeString(this.lastName);
        Boolean bool47 = this.canAccessClosed;
        if (bool47 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool47);
        }
        Boolean bool48 = this.isClosed;
        if (bool48 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool48);
        }
        Boolean bool49 = this.isCached;
        if (bool49 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool49);
        }
    }

    public final String x1() {
        return this.photoMaxOrig;
    }

    public final Boolean y0() {
        return this.hasUnseenStories;
    }

    public final String y1() {
        return this.screenName;
    }

    public final BaseSexDto z1() {
        return this.sex;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ GroupsUserXtrRoleDto(UserId userId, List list, GroupsRoleOptionsDto groupsRoleOptionsDto, Boolean bool, Boolean bool2, String str, String str2, String str3, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, BdateVisibilityDto bdateVisibilityDto, BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, Float f, OwnerStateDto ownerStateDto, String str21, String str22, String str23, String str24, String str25, String str26, BaseBoolIntDto baseBoolIntDto, BaseOwnerCoverDto baseOwnerCoverDto, String str27, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Boolean bool7, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, UsersUserTypeDto usersUserTypeDto, String str28, String str29, String str30, String str31, String str32, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, String str33, String str34, String str35, BaseBoolIntDto baseBoolIntDto10, VideoLiveInfoDto videoLiveInfoDto, BaseBoolIntDto baseBoolIntDto11, Boolean bool12, String str36, String str37, String str38, String str39, String str40, String str41, String str42, PhotosPhotoDto photosPhotoDto, List list2, List list3, List list4, String str43, Integer num, Boolean bool13, WallDefaultDto wallDefaultDto, AudioMusicAwardsDto audioMusicAwardsDto, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, BaseBoolIntDto baseBoolIntDto12, List list5, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, BaseBoolIntDto baseBoolIntDto13, BaseBoolIntDto baseBoolIntDto14, Boolean bool18, String str53, String str54, String str55, AudioAudioDto audioAudioDto, String str56, String str57, AppsAppMinDto appsAppMinDto, UsersLastSeenDto usersLastSeenDto, UsersExportsDto usersExportsDto, BaseCropPhotoDto baseCropPhotoDto, Integer num2, Integer num3, Integer num4, Integer num5, BaseBoolIntDto baseBoolIntDto15, BaseBoolIntDto baseBoolIntDto16, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, Integer num6, UsersOccupationDto usersOccupationDto, List list6, List list7, Integer num7, String str58, Integer num8, Integer num9, String str59, Integer num10, String str60, String str61, String str62, UsersUserRelationDto usersUserRelationDto, UsersUserMinDto usersUserMinDto, UsersPersonalDto usersPersonalDto, List list8, List list9, List list10, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, String str63, UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto, EmployeeMarkDto employeeMarkDto, UsersRightsLocationDto usersRightsLocationDto, Boolean bool24, UsersEmojiStatusDto usersEmojiStatusDto, StatusImageStatusDto statusImageStatusDto, UsersUserCountersDto usersUserCountersDto, String str64, BaseBoolIntDto baseBoolIntDto19, Boolean bool25, List list11, String str65, Boolean bool26, Boolean bool27, UsersGiftsTooltipDto usersGiftsTooltipDto, NoIndexDto noIndexDto, Integer num11, MessagesContactDto messagesContactDto, Boolean bool28, List list12, List list13, Integer num12, String str66, Boolean bool29, Boolean bool30, UsersUserProfileTypeDto usersUserProfileTypeDto, UsersCanNotCallReasonDto usersCanNotCallReasonDto, Boolean bool31, Boolean bool32, BaseImageDto baseImageDto, List list14, Boolean bool33, Boolean bool34, Boolean bool35, Boolean bool36, Boolean bool37, Boolean bool38, Boolean bool39, SocialButtonTypeDto socialButtonTypeDto, String str67, Boolean bool40, List list15, List list16, Boolean bool41, Integer num13, Integer num14, Boolean bool42, UsersPromotionAllowanceDto usersPromotionAllowanceDto, Boolean bool43, Integer num15, Boolean bool44, MessagesEduEducationalProfileDto messagesEduEducationalProfileDto, BaseAPlusMarkDto baseAPlusMarkDto, Boolean bool45, Boolean bool46, UsersDonutDto usersDonutDto, BaseSexDto baseSexDto, String str68, String str69, String str70, String str71, UsersOnlineInfoDto usersOnlineInfoDto, BaseBoolIntDto baseBoolIntDto20, BaseBoolIntDto baseBoolIntDto21, Integer num16, BaseBoolIntDto baseBoolIntDto22, BaseBoolIntDto baseBoolIntDto23, FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, FriendsRequestsMutualDto friendsRequestsMutualDto, String str72, String str73, Integer num17, String str74, Boolean bool47, Boolean bool48, Boolean bool49, int i, int i2, int i3, int i4, int i5, int i6, int i7, zcl zclVar) {
        this(userId, r171, r9, r10, r11, r12, r13, r14, r15, r8, r172, r173, r174, r175, r7, r17, r19, r21, r23, r25, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r176, r39, r40, r41, r42, r43, r44, r45, r177, r178, r179, r180, r181, r182, r183, r184, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r1, r62, r63, r64, r65, r66, r67, r68, r185, r186, r187, r188, r189, r190, r191, r192, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r2, r85, r86, r87, r88, r89, r90, r91, r193, r194, r195, r196, r197, r198, r199, r200, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r3, r108, r109, r110, r111, r112, r113, r114, r201, r202, r203, r204, r205, r206, r207, r0, (i5 & 32768) != 0 ? null : bool22, (i5 & 65536) != 0 ? null : bool23, (i5 & 131072) != 0 ? null : str63, (i5 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : usersEmployeeWorkingStateDto, (i5 & 524288) != 0 ? null : employeeMarkDto, (i5 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : usersRightsLocationDto, (i5 & 2097152) != 0 ? null : bool24, (i5 & 4194304) != 0 ? null : usersEmojiStatusDto, (i5 & 8388608) != 0 ? null : statusImageStatusDto, (i5 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : usersUserCountersDto, (i5 & 33554432) != 0 ? null : str64, (i5 & 67108864) != 0 ? null : baseBoolIntDto19, (i5 & 134217728) != 0 ? null : bool25, (i5 & 268435456) != 0 ? null : list11, (i5 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str65, (i5 & 1073741824) != 0 ? null : bool26, (i5 & Integer.MIN_VALUE) != 0 ? null : bool27, (i6 & 1) != 0 ? null : usersGiftsTooltipDto, (i6 & 2) != 0 ? null : noIndexDto, (i6 & 4) != 0 ? null : num11, (i6 & 8) != 0 ? null : messagesContactDto, (i6 & 16) != 0 ? null : bool28, (i6 & 32) != 0 ? null : list12, (i6 & 64) != 0 ? null : list13, (i6 & 128) != 0 ? null : num12, (i6 & 256) != 0 ? null : str66, (i6 & 512) != 0 ? null : bool29, (i6 & 1024) != 0 ? null : bool30, (i6 & 2048) != 0 ? null : usersUserProfileTypeDto, (i6 & 4096) != 0 ? null : usersCanNotCallReasonDto, (i6 & 8192) != 0 ? null : bool31, (i6 & 16384) != 0 ? null : bool32, (i6 & 32768) != 0 ? null : baseImageDto, (i6 & 65536) != 0 ? null : list14, (i6 & 131072) != 0 ? null : bool33, (i6 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool34, (i6 & 524288) != 0 ? null : bool35, (i6 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool36, (i6 & 2097152) != 0 ? null : bool37, (i6 & 4194304) != 0 ? null : bool38, (i6 & 8388608) != 0 ? null : bool39, (i6 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : socialButtonTypeDto, (i6 & 33554432) != 0 ? null : str67, (i6 & 67108864) != 0 ? null : bool40, (i6 & 134217728) != 0 ? null : list15, (i6 & 268435456) != 0 ? null : list16, (i6 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool41, (i6 & 1073741824) != 0 ? null : num13, (i6 & Integer.MIN_VALUE) != 0 ? null : num14, (i7 & 1) != 0 ? null : bool42, (i7 & 2) != 0 ? null : usersPromotionAllowanceDto, (i7 & 4) != 0 ? null : bool43, (i7 & 8) != 0 ? null : num15, (i7 & 16) != 0 ? null : bool44, (i7 & 32) != 0 ? null : messagesEduEducationalProfileDto, (i7 & 64) != 0 ? null : baseAPlusMarkDto, (i7 & 128) != 0 ? null : bool45, (i7 & 256) != 0 ? null : bool46, (i7 & 512) != 0 ? null : usersDonutDto, (i7 & 1024) != 0 ? null : baseSexDto, (i7 & 2048) != 0 ? null : str68, (i7 & 4096) != 0 ? null : str69, (i7 & 8192) != 0 ? null : str70, (i7 & 16384) != 0 ? null : str71, (i7 & 32768) != 0 ? null : usersOnlineInfoDto, (i7 & 65536) != 0 ? null : baseBoolIntDto20, (i7 & 131072) != 0 ? null : baseBoolIntDto21, (i7 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num16, (i7 & 524288) != 0 ? null : baseBoolIntDto22, (i7 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : baseBoolIntDto23, (i7 & 2097152) != 0 ? null : friendsFriendStatusStatusDto, (i7 & 4194304) != 0 ? null : friendsRequestsMutualDto, (i7 & 8388608) != 0 ? null : str72, (i7 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str73, (i7 & 33554432) != 0 ? null : num17, (i7 & 67108864) != 0 ? null : str74, (i7 & 134217728) != 0 ? null : bool47, (i7 & 268435456) != 0 ? null : bool48, (i7 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool49);
        List list17 = (i & 2) != 0 ? null : list;
        GroupsRoleOptionsDto groupsRoleOptionsDto2 = (i & 4) != 0 ? null : groupsRoleOptionsDto;
        Boolean bool50 = (i & 8) != 0 ? null : bool;
        Boolean bool51 = (i & 16) != 0 ? null : bool2;
        String str75 = (i & 32) != 0 ? null : str;
        String str76 = (i & 64) != 0 ? null : str2;
        String str77 = (i & 128) != 0 ? null : str3;
        Boolean bool52 = (i & 256) != 0 ? null : bool3;
        Boolean bool53 = (i & 512) != 0 ? null : bool4;
        List list18 = list17;
        Boolean bool54 = (i & 1024) != 0 ? null : bool5;
        Boolean bool55 = (i & 2048) != 0 ? null : bool6;
        String str78 = (i & 4096) != 0 ? null : str4;
        String str79 = (i & 8192) != 0 ? null : str5;
        String str80 = (i & 16384) != 0 ? null : str6;
        String str81 = (i & 32768) != 0 ? null : str7;
        String str82 = (i & 65536) != 0 ? null : str8;
        String str83 = (i & 131072) != 0 ? null : str9;
        String str84 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str10;
        String str85 = (i & 524288) != 0 ? null : str11;
        String str86 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str12;
        String str87 = (i & 2097152) != 0 ? null : str13;
        String str88 = (i & 4194304) != 0 ? null : str14;
        String str89 = (i & 8388608) != 0 ? null : str15;
        String str90 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str16;
        String str91 = (i & 33554432) != 0 ? null : str17;
        String str92 = (i & 67108864) != 0 ? null : str18;
        String str93 = (i & 134217728) != 0 ? null : str19;
        String str94 = (i & 268435456) != 0 ? null : str20;
        BdateVisibilityDto bdateVisibilityDto2 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bdateVisibilityDto;
        BaseCityDto baseCityDto2 = (i & 1073741824) != 0 ? null : baseCityDto;
        BaseCountryDto baseCountryDto2 = (i & Integer.MIN_VALUE) != 0 ? null : baseCountryDto;
        Float f2 = (i2 & 1) != 0 ? null : f;
        OwnerStateDto ownerStateDto2 = (i2 & 2) != 0 ? null : ownerStateDto;
        String str95 = (i2 & 4) != 0 ? null : str21;
        String str96 = (i2 & 8) != 0 ? null : str22;
        String str97 = (i2 & 16) != 0 ? null : str23;
        String str98 = (i2 & 32) != 0 ? null : str24;
        String str99 = (i2 & 64) != 0 ? null : str25;
        BaseCountryDto baseCountryDto3 = baseCountryDto2;
        String str100 = (i2 & 128) != 0 ? null : str26;
        BaseBoolIntDto baseBoolIntDto24 = (i2 & 256) != 0 ? null : baseBoolIntDto;
        BaseOwnerCoverDto baseOwnerCoverDto2 = (i2 & 512) != 0 ? null : baseOwnerCoverDto;
        String str101 = (i2 & 1024) != 0 ? null : str27;
        BaseBoolIntDto baseBoolIntDto25 = (i2 & 2048) != 0 ? null : baseBoolIntDto2;
        BaseBoolIntDto baseBoolIntDto26 = (i2 & 4096) != 0 ? null : baseBoolIntDto3;
        Boolean bool56 = (i2 & 8192) != 0 ? null : bool7;
        BaseBoolIntDto baseBoolIntDto27 = (i2 & 16384) != 0 ? null : baseBoolIntDto4;
        BaseBoolIntDto baseBoolIntDto28 = (i2 & 32768) != 0 ? null : baseBoolIntDto5;
        BaseBoolIntDto baseBoolIntDto29 = (i2 & 65536) != 0 ? null : baseBoolIntDto6;
        BaseBoolIntDto baseBoolIntDto30 = (i2 & 131072) != 0 ? null : baseBoolIntDto7;
        UsersUserTypeDto usersUserTypeDto2 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : usersUserTypeDto;
        String str102 = (i2 & 524288) != 0 ? null : str28;
        String str103 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str29;
        String str104 = (i2 & 2097152) != 0 ? null : str30;
        String str105 = (i2 & 4194304) != 0 ? null : str31;
        String str106 = (i2 & 8388608) != 0 ? null : str32;
        BaseBoolIntDto baseBoolIntDto31 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : baseBoolIntDto8;
        BaseBoolIntDto baseBoolIntDto32 = (i2 & 33554432) != 0 ? null : baseBoolIntDto9;
        Boolean bool57 = (i2 & 67108864) != 0 ? null : bool8;
        Boolean bool58 = (i2 & 134217728) != 0 ? null : bool9;
        Boolean bool59 = (i2 & 268435456) != 0 ? null : bool10;
        Boolean bool60 = (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool11;
        String str107 = (i2 & 1073741824) != 0 ? null : str33;
        String str108 = (i2 & Integer.MIN_VALUE) != 0 ? null : str34;
        String str109 = (i3 & 1) != 0 ? null : str35;
        BaseBoolIntDto baseBoolIntDto33 = (i3 & 2) != 0 ? null : baseBoolIntDto10;
        VideoLiveInfoDto videoLiveInfoDto2 = (i3 & 4) != 0 ? null : videoLiveInfoDto;
        BaseBoolIntDto baseBoolIntDto34 = (i3 & 8) != 0 ? null : baseBoolIntDto11;
        Boolean bool61 = (i3 & 16) != 0 ? null : bool12;
        String str110 = (i3 & 32) != 0 ? null : str36;
        String str111 = (i3 & 64) != 0 ? null : str37;
        BaseBoolIntDto baseBoolIntDto35 = baseBoolIntDto27;
        String str112 = (i3 & 128) != 0 ? null : str38;
        String str113 = (i3 & 256) != 0 ? null : str39;
        String str114 = (i3 & 512) != 0 ? null : str40;
        String str115 = (i3 & 1024) != 0 ? null : str41;
        String str116 = (i3 & 2048) != 0 ? null : str42;
        PhotosPhotoDto photosPhotoDto2 = (i3 & 4096) != 0 ? null : photosPhotoDto;
        List list19 = (i3 & 8192) != 0 ? null : list2;
        List list20 = (i3 & 16384) != 0 ? null : list3;
        List list21 = (i3 & 32768) != 0 ? null : list4;
        String str117 = (i3 & 65536) != 0 ? null : str43;
        Integer num18 = (i3 & 131072) != 0 ? null : num;
        Boolean bool62 = (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool13;
        WallDefaultDto wallDefaultDto2 = (i3 & 524288) != 0 ? null : wallDefaultDto;
        AudioMusicAwardsDto audioMusicAwardsDto2 = (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : audioMusicAwardsDto;
        Boolean bool63 = (i3 & 2097152) != 0 ? null : bool14;
        Boolean bool64 = (i3 & 4194304) != 0 ? null : bool15;
        Boolean bool65 = (i3 & 8388608) != 0 ? null : bool16;
        Boolean bool66 = (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : bool17;
        BaseBoolIntDto baseBoolIntDto36 = (i3 & 33554432) != 0 ? null : baseBoolIntDto12;
        List list22 = (i3 & 67108864) != 0 ? null : list5;
        String str118 = (i3 & 134217728) != 0 ? null : str44;
        String str119 = (i3 & 268435456) != 0 ? null : str45;
        String str120 = (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str46;
        String str121 = (i3 & 1073741824) != 0 ? null : str47;
        String str122 = (i3 & Integer.MIN_VALUE) != 0 ? null : str48;
        String str123 = (i4 & 1) != 0 ? null : str49;
        String str124 = (i4 & 2) != 0 ? null : str50;
        String str125 = (i4 & 4) != 0 ? null : str51;
        String str126 = (i4 & 8) != 0 ? null : str52;
        BaseBoolIntDto baseBoolIntDto37 = (i4 & 16) != 0 ? null : baseBoolIntDto13;
        BaseBoolIntDto baseBoolIntDto38 = (i4 & 32) != 0 ? null : baseBoolIntDto14;
        Boolean bool67 = (i4 & 64) != 0 ? null : bool18;
        List list23 = list20;
        String str127 = (i4 & 128) != 0 ? null : str53;
        String str128 = (i4 & 256) != 0 ? null : str54;
        String str129 = (i4 & 512) != 0 ? null : str55;
        AudioAudioDto audioAudioDto2 = (i4 & 1024) != 0 ? null : audioAudioDto;
        String str130 = (i4 & 2048) != 0 ? null : str56;
        String str131 = (i4 & 4096) != 0 ? null : str57;
        AppsAppMinDto appsAppMinDto2 = (i4 & 8192) != 0 ? null : appsAppMinDto;
        UsersLastSeenDto usersLastSeenDto2 = (i4 & 16384) != 0 ? null : usersLastSeenDto;
        UsersExportsDto usersExportsDto2 = (i4 & 32768) != 0 ? null : usersExportsDto;
        BaseCropPhotoDto baseCropPhotoDto2 = (i4 & 65536) != 0 ? null : baseCropPhotoDto;
        Integer num19 = (i4 & 131072) != 0 ? null : num2;
        Integer num20 = (i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num3;
        Integer num21 = (i4 & 524288) != 0 ? null : num4;
        Integer num22 = (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num5;
        BaseBoolIntDto baseBoolIntDto39 = (i4 & 2097152) != 0 ? null : baseBoolIntDto15;
        BaseBoolIntDto baseBoolIntDto40 = (i4 & 4194304) != 0 ? null : baseBoolIntDto16;
        BaseBoolIntDto baseBoolIntDto41 = (i4 & 8388608) != 0 ? null : baseBoolIntDto17;
        BaseBoolIntDto baseBoolIntDto42 = (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : baseBoolIntDto18;
        Integer num23 = (i4 & 33554432) != 0 ? null : num6;
        UsersOccupationDto usersOccupationDto2 = (i4 & 67108864) != 0 ? null : usersOccupationDto;
        List list24 = (i4 & 134217728) != 0 ? null : list6;
        List list25 = (i4 & 268435456) != 0 ? null : list7;
        Integer num24 = (i4 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : num7;
        String str132 = (i4 & 1073741824) != 0 ? null : str58;
        Integer num25 = (i4 & Integer.MIN_VALUE) != 0 ? null : num8;
        Integer num26 = (i5 & 1) != 0 ? null : num9;
        String str133 = (i5 & 2) != 0 ? null : str59;
        Integer num27 = (i5 & 4) != 0 ? null : num10;
        String str134 = (i5 & 8) != 0 ? null : str60;
        String str135 = (i5 & 16) != 0 ? null : str61;
        String str136 = (i5 & 32) != 0 ? null : str62;
        UsersUserRelationDto usersUserRelationDto2 = (i5 & 64) != 0 ? null : usersUserRelationDto;
        UsersLastSeenDto usersLastSeenDto3 = usersLastSeenDto2;
        UsersUserMinDto usersUserMinDto2 = (i5 & 128) != 0 ? null : usersUserMinDto;
        UsersPersonalDto usersPersonalDto2 = (i5 & 256) != 0 ? null : usersPersonalDto;
        List list26 = (i5 & 512) != 0 ? null : list8;
        List list27 = (i5 & 1024) != 0 ? null : list9;
        List list28 = (i5 & 2048) != 0 ? null : list10;
        Boolean bool68 = (i5 & 4096) != 0 ? null : bool19;
        Boolean bool69 = (i5 & 8192) != 0 ? null : bool20;
        Boolean bool70 = (i5 & 16384) != 0 ? null : bool21;
    }
}
