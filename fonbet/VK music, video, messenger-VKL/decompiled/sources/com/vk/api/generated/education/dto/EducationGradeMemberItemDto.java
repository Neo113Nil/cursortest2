package com.vk.api.generated.education.dto;

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
import com.vk.api.generated.groups.dto.GroupsMemberRolePermissionDto;
import com.vk.api.generated.groups.dto.GroupsRoleOptionsDto;
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

/* compiled from: EducationGradeMemberItemDto.kt */
/* loaded from: classes14.dex */
public final class EducationGradeMemberItemDto implements Parcelable {
    public static final Parcelable.Creator<EducationGradeMemberItemDto> CREATOR = new a();

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

    @pmi0(SignalingProtocol.KEY_ROLES)
    private final List<EducationGradeRoleItemDto> roles;

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

    @pmi0("title")
    private final String title;

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
    /* compiled from: EducationGradeMemberItemDto.kt */
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

        /* compiled from: EducationGradeMemberItemDto.kt */
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
    /* compiled from: EducationGradeMemberItemDto.kt */
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

        /* compiled from: EducationGradeMemberItemDto.kt */
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
    /* compiled from: EducationGradeMemberItemDto.kt */
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

        /* compiled from: EducationGradeMemberItemDto.kt */
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
    /* compiled from: EducationGradeMemberItemDto.kt */
    public static final class SocialButtonTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SocialButtonTypeDto[] $VALUES;

        @pmi0("add")
        public static final SocialButtonTypeDto ADD;
        public static final Parcelable.Creator<SocialButtonTypeDto> CREATOR;

        @pmi0("follow")
        public static final SocialButtonTypeDto FOLLOW;
        private final String value;

        /* compiled from: EducationGradeMemberItemDto.kt */
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
    /* compiled from: EducationGradeMemberItemDto.kt */
    public static final class WallDefaultDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ WallDefaultDto[] $VALUES;

        @pmi0("all")
        public static final WallDefaultDto ALL;
        public static final Parcelable.Creator<WallDefaultDto> CREATOR;

        @pmi0("owner")
        public static final WallDefaultDto OWNER;
        private final String value;

        /* compiled from: EducationGradeMemberItemDto.kt */
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

    /* compiled from: EducationGradeMemberItemDto.kt */
    public static final class a implements Parcelable.Creator<EducationGradeMemberItemDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationGradeMemberItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
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
            ArrayList arrayList3;
            UserId userId;
            ArrayList arrayList4;
            ArrayList arrayList5;
            Boolean valueOf13;
            UserId userId2;
            WallDefaultDto createFromParcel;
            Boolean valueOf14;
            Boolean valueOf15;
            Boolean valueOf16;
            Boolean valueOf17;
            ArrayList arrayList6;
            ArrayList arrayList7;
            ArrayList arrayList8;
            Boolean valueOf18;
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
            ArrayList arrayList18;
            ArrayList arrayList19;
            Boolean valueOf29;
            Boolean valueOf30;
            Boolean valueOf31;
            Boolean valueOf32;
            BaseImageDto baseImageDto;
            ArrayList arrayList20;
            ArrayList arrayList21;
            UsersUserProfileTypeDto usersUserProfileTypeDto;
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
            Boolean valueOf45;
            Boolean valueOf46;
            Boolean valueOf47;
            Boolean valueOf48;
            Boolean valueOf49;
            UserId userId3 = (UserId) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(EducationGradeRoleItemDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(EducationGradeMemberItemDto.class, parcel, arrayList2, i2, 1);
                }
            }
            GroupsRoleOptionsDto groupsRoleOptionsDto = (GroupsRoleOptionsDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
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
            String readString2 = parcel.readString();
            ArrayList arrayList22 = arrayList2;
            Boolean bool2 = valueOf;
            Boolean bool3 = valueOf2;
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
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
            String readString5 = parcel.readString();
            Boolean bool4 = valueOf3;
            Boolean bool5 = valueOf4;
            Boolean bool6 = valueOf5;
            Boolean bool7 = valueOf6;
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
            String readString21 = parcel.readString();
            BdateVisibilityDto createFromParcel4 = parcel.readInt() == 0 ? null : BdateVisibilityDto.CREATOR.createFromParcel(parcel);
            BaseCityDto baseCityDto2 = (BaseCityDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            BaseCountryDto baseCountryDto = (BaseCountryDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            Float valueOf50 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            OwnerStateDto ownerStateDto = (OwnerStateDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            String readString22 = parcel.readString();
            String readString23 = parcel.readString();
            String readString24 = parcel.readString();
            String readString25 = parcel.readString();
            String readString26 = parcel.readString();
            String readString27 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto3 = (BaseBoolIntDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            BaseOwnerCoverDto baseOwnerCoverDto = (BaseOwnerCoverDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            String readString28 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto4 = (BaseBoolIntDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto5 = (BaseBoolIntDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf7 = null;
            } else {
                valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            BaseBoolIntDto baseBoolIntDto6 = (BaseBoolIntDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto7 = (BaseBoolIntDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto8 = (BaseBoolIntDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto9 = (BaseBoolIntDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            UsersUserTypeDto usersUserTypeDto = (UsersUserTypeDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            ArrayList arrayList23 = arrayList;
            Float f = valueOf50;
            String readString29 = parcel.readString();
            String readString30 = parcel.readString();
            String readString31 = parcel.readString();
            String readString32 = parcel.readString();
            String readString33 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto10 = (BaseBoolIntDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto11 = (BaseBoolIntDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
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
            String readString34 = parcel.readString();
            Boolean bool8 = valueOf8;
            Boolean bool9 = valueOf9;
            Boolean bool10 = valueOf10;
            Boolean bool11 = valueOf11;
            String readString35 = parcel.readString();
            String readString36 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto12 = (BaseBoolIntDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            VideoLiveInfoDto videoLiveInfoDto = (VideoLiveInfoDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto13 = (BaseBoolIntDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf12 = null;
            } else {
                valueOf12 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString37 = parcel.readString();
            Boolean bool12 = valueOf7;
            Boolean bool13 = valueOf12;
            String readString38 = parcel.readString();
            String readString39 = parcel.readString();
            String readString40 = parcel.readString();
            String readString41 = parcel.readString();
            String readString42 = parcel.readString();
            String readString43 = parcel.readString();
            PhotosPhotoDto photosPhotoDto2 = (PhotosPhotoDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                photosPhotoDto = photosPhotoDto2;
                baseCityDto = baseCityDto2;
                userId = userId3;
                arrayList3 = null;
            } else {
                photosPhotoDto = photosPhotoDto2;
                int readInt3 = parcel.readInt();
                baseCityDto = baseCityDto2;
                arrayList3 = new ArrayList(readInt3);
                userId = userId3;
                int i3 = 0;
                while (i3 != readInt3) {
                    int i4 = readInt3;
                    int readInt4 = parcel.readInt();
                    int i5 = i3;
                    ArrayList arrayList24 = new ArrayList(readInt4);
                    String str = readString;
                    int i6 = 0;
                    while (i6 != readInt4) {
                        i6 = bo.b(EducationGradeMemberItemDto.class, parcel, arrayList24, i6, 1);
                        readInt4 = readInt4;
                    }
                    arrayList3.add(arrayList24);
                    i3 = i5 + 1;
                    readInt3 = i4;
                    readString = str;
                }
            }
            String str2 = readString;
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList4 = new ArrayList(readInt5);
                int i7 = 0;
                while (i7 != readInt5) {
                    int i8 = readInt5;
                    int readInt6 = parcel.readInt();
                    ArrayList arrayList25 = arrayList3;
                    ArrayList arrayList26 = new ArrayList(readInt6);
                    int i9 = i7;
                    int i10 = 0;
                    while (i10 != readInt6) {
                        i10 = bo.b(EducationGradeMemberItemDto.class, parcel, arrayList26, i10, 1);
                        readInt6 = readInt6;
                    }
                    arrayList4.add(arrayList26);
                    i7 = i9 + 1;
                    readInt5 = i8;
                    arrayList3 = arrayList25;
                }
            }
            ArrayList arrayList27 = arrayList3;
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int readInt7 = parcel.readInt();
                arrayList5 = new ArrayList(readInt7);
                int i11 = 0;
                while (i11 != readInt7) {
                    i11 = bo.b(EducationGradeMemberItemDto.class, parcel, arrayList5, i11, 1);
                    readInt7 = readInt7;
                }
            }
            UserId userId4 = userId;
            String readString44 = parcel.readString();
            Integer valueOf51 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
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
            AudioMusicAwardsDto audioMusicAwardsDto = (AudioMusicAwardsDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
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
            BaseBoolIntDto baseBoolIntDto14 = (BaseBoolIntDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList6 = arrayList5;
                arrayList8 = arrayList4;
                arrayList7 = null;
            } else {
                int readInt8 = parcel.readInt();
                arrayList6 = arrayList5;
                arrayList7 = new ArrayList(readInt8);
                arrayList8 = arrayList4;
                int i12 = 0;
                while (i12 != readInt8) {
                    i12 = bo.b(EducationGradeMemberItemDto.class, parcel, arrayList7, i12, 1);
                    readInt8 = readInt8;
                }
                baseBoolIntDto14 = baseBoolIntDto14;
            }
            String readString45 = parcel.readString();
            BaseCityDto baseCityDto3 = baseCityDto;
            ArrayList arrayList28 = arrayList6;
            String readString46 = parcel.readString();
            PhotosPhotoDto photosPhotoDto3 = photosPhotoDto;
            ArrayList arrayList29 = arrayList8;
            String readString47 = parcel.readString();
            String readString48 = parcel.readString();
            String readString49 = parcel.readString();
            String readString50 = parcel.readString();
            String readString51 = parcel.readString();
            String readString52 = parcel.readString();
            String readString53 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto15 = (BaseBoolIntDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto16 = baseBoolIntDto14;
            BaseBoolIntDto baseBoolIntDto17 = (BaseBoolIntDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf18 = null;
            } else {
                valueOf18 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString54 = parcel.readString();
            Boolean bool14 = valueOf13;
            Boolean bool15 = valueOf14;
            Boolean bool16 = valueOf15;
            Boolean bool17 = valueOf16;
            Boolean bool18 = valueOf17;
            Boolean bool19 = valueOf18;
            String readString55 = parcel.readString();
            String readString56 = parcel.readString();
            AudioAudioDto audioAudioDto = (AudioAudioDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            String readString57 = parcel.readString();
            String readString58 = parcel.readString();
            AppsAppMinDto appsAppMinDto = (AppsAppMinDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            UsersLastSeenDto usersLastSeenDto = (UsersLastSeenDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            UsersExportsDto usersExportsDto = (UsersExportsDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            BaseCropPhotoDto baseCropPhotoDto = (BaseCropPhotoDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            Integer valueOf52 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf53 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf54 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf55 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto baseBoolIntDto18 = (BaseBoolIntDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto19 = (BaseBoolIntDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto20 = (BaseBoolIntDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto21 = (BaseBoolIntDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            Integer valueOf56 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            UsersOccupationDto usersOccupationDto2 = (UsersOccupationDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                usersOccupationDto = usersOccupationDto2;
                arrayList9 = arrayList7;
                baseBoolIntDto = baseBoolIntDto15;
                arrayList10 = null;
            } else {
                usersOccupationDto = usersOccupationDto2;
                int readInt9 = parcel.readInt();
                arrayList9 = arrayList7;
                arrayList10 = new ArrayList(readInt9);
                baseBoolIntDto = baseBoolIntDto15;
                int i13 = 0;
                while (i13 != readInt9) {
                    i13 = bo.b(EducationGradeMemberItemDto.class, parcel, arrayList10, i13, 1);
                    readInt9 = readInt9;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList12 = arrayList10;
                arrayList11 = null;
            } else {
                int readInt10 = parcel.readInt();
                arrayList11 = new ArrayList(readInt10);
                arrayList12 = arrayList10;
                int i14 = 0;
                while (i14 != readInt10) {
                    i14 = bo.b(EducationGradeMemberItemDto.class, parcel, arrayList11, i14, 1);
                    readInt10 = readInt10;
                }
            }
            Integer valueOf57 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto baseBoolIntDto22 = baseBoolIntDto;
            String readString59 = parcel.readString();
            Integer valueOf58 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf59 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString60 = parcel.readString();
            Integer valueOf60 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString61 = parcel.readString();
            ArrayList arrayList30 = arrayList12;
            Integer num2 = valueOf58;
            Integer num3 = valueOf59;
            Integer num4 = valueOf60;
            String readString62 = parcel.readString();
            String readString63 = parcel.readString();
            ArrayList arrayList31 = arrayList11;
            UsersUserRelationDto usersUserRelationDto = (UsersUserRelationDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            UsersUserMinDto usersUserMinDto = (UsersUserMinDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            UsersPersonalDto usersPersonalDto2 = (UsersPersonalDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                usersPersonalDto = usersPersonalDto2;
                num = valueOf57;
                baseBoolIntDto2 = baseBoolIntDto22;
                arrayList13 = null;
            } else {
                usersPersonalDto = usersPersonalDto2;
                int readInt11 = parcel.readInt();
                num = valueOf57;
                arrayList13 = new ArrayList(readInt11);
                baseBoolIntDto2 = baseBoolIntDto22;
                int i15 = 0;
                while (i15 != readInt11) {
                    i15 = bo.b(EducationGradeMemberItemDto.class, parcel, arrayList13, i15, 1);
                    readInt11 = readInt11;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList15 = arrayList13;
                arrayList14 = null;
            } else {
                int readInt12 = parcel.readInt();
                arrayList14 = new ArrayList(readInt12);
                arrayList15 = arrayList13;
                int i16 = 0;
                while (i16 != readInt12) {
                    i16 = bo.b(EducationGradeMemberItemDto.class, parcel, arrayList14, i16, 1);
                    readInt12 = readInt12;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList17 = arrayList14;
                arrayList16 = null;
            } else {
                int readInt13 = parcel.readInt();
                arrayList16 = new ArrayList(readInt13);
                arrayList17 = arrayList14;
                int i17 = 0;
                while (i17 != readInt13) {
                    i17 = bo.b(EducationGradeMemberItemDto.class, parcel, arrayList16, i17, 1);
                    readInt13 = readInt13;
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
            String readString64 = parcel.readString();
            Boolean bool20 = valueOf19;
            UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto2 = (UsersEmployeeWorkingStateDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                usersEmployeeWorkingStateDto = usersEmployeeWorkingStateDto2;
                createFromParcel2 = null;
            } else {
                usersEmployeeWorkingStateDto = usersEmployeeWorkingStateDto2;
                createFromParcel2 = EmployeeMarkDto.CREATOR.createFromParcel(parcel);
            }
            EmployeeMarkDto employeeMarkDto = createFromParcel2;
            UsersRightsLocationDto usersRightsLocationDto = (UsersRightsLocationDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf24 = null;
            } else {
                valueOf24 = Boolean.valueOf(parcel.readInt() != 0);
            }
            UsersEmojiStatusDto usersEmojiStatusDto = (UsersEmojiStatusDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            StatusImageStatusDto statusImageStatusDto = (StatusImageStatusDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            UsersUserCountersDto usersUserCountersDto = (UsersUserCountersDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            UsersPersonalDto usersPersonalDto3 = usersPersonalDto;
            ArrayList arrayList32 = arrayList17;
            Boolean bool21 = valueOf21;
            Boolean bool22 = valueOf22;
            Boolean bool23 = valueOf23;
            UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto3 = usersEmployeeWorkingStateDto;
            String readString65 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto23 = (BaseBoolIntDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf25 = null;
            } else {
                valueOf25 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            BaseBoolIntDto baseBoolIntDto24 = baseBoolIntDto2;
            Boolean bool24 = valueOf24;
            Boolean bool25 = valueOf25;
            String readString66 = parcel.readString();
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
            UsersGiftsTooltipDto usersGiftsTooltipDto2 = (UsersGiftsTooltipDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                usersGiftsTooltipDto = usersGiftsTooltipDto2;
                createFromParcel3 = null;
            } else {
                usersGiftsTooltipDto = usersGiftsTooltipDto2;
                createFromParcel3 = NoIndexDto.CREATOR.createFromParcel(parcel);
            }
            NoIndexDto noIndexDto = createFromParcel3;
            Integer valueOf61 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            MessagesContactDto messagesContactDto2 = (MessagesContactDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf28 = null;
            } else {
                valueOf28 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                messagesContactDto = messagesContactDto2;
                bool = valueOf20;
                arrayList19 = arrayList16;
                arrayList18 = null;
            } else {
                messagesContactDto = messagesContactDto2;
                int readInt14 = parcel.readInt();
                bool = valueOf20;
                arrayList18 = new ArrayList(readInt14);
                arrayList19 = arrayList16;
                int i18 = 0;
                while (i18 != readInt14) {
                    i18 = pm0.b(parcel, arrayList18, i18, 1);
                    readInt14 = readInt14;
                }
            }
            Integer valueOf62 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer num5 = valueOf52;
            Integer num6 = valueOf53;
            Integer num7 = valueOf54;
            Integer num8 = valueOf55;
            Integer num9 = valueOf56;
            UsersOccupationDto usersOccupationDto3 = usersOccupationDto;
            ArrayList arrayList33 = arrayList15;
            Boolean bool26 = bool;
            String readString67 = parcel.readString();
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
            UsersUserProfileTypeDto usersUserProfileTypeDto2 = (UsersUserProfileTypeDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            Integer num10 = valueOf62;
            UsersCanNotCallReasonDto usersCanNotCallReasonDto = (UsersCanNotCallReasonDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
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
            BaseImageDto baseImageDto2 = (BaseImageDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                baseImageDto = baseImageDto2;
                arrayList20 = arrayList18;
                usersUserProfileTypeDto = usersUserProfileTypeDto2;
                arrayList21 = null;
            } else {
                baseImageDto = baseImageDto2;
                int readInt15 = parcel.readInt();
                arrayList20 = arrayList18;
                arrayList21 = new ArrayList(readInt15);
                usersUserProfileTypeDto = usersUserProfileTypeDto2;
                int i19 = 0;
                while (i19 != readInt15) {
                    i19 = bo.b(EducationGradeMemberItemDto.class, parcel, arrayList21, i19, 1);
                    readInt15 = readInt15;
                }
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
            SocialButtonTypeDto createFromParcel5 = parcel.readInt() == 0 ? null : SocialButtonTypeDto.CREATOR.createFromParcel(parcel);
            String readString68 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf40 = null;
            } else {
                valueOf40 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
            Boolean bool27 = valueOf40;
            ArrayList<String> createStringArrayList4 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                valueOf41 = null;
            } else {
                valueOf41 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf63 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf64 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf42 = null;
            } else {
                valueOf42 = Boolean.valueOf(parcel.readInt() != 0);
            }
            UsersPromotionAllowanceDto usersPromotionAllowanceDto = (UsersPromotionAllowanceDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf43 = null;
            } else {
                valueOf43 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf65 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf44 = null;
            } else {
                valueOf44 = Boolean.valueOf(parcel.readInt() != 0);
            }
            MessagesEduEducationalProfileDto messagesEduEducationalProfileDto = (MessagesEduEducationalProfileDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            BaseAPlusMarkDto baseAPlusMarkDto = (BaseAPlusMarkDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf45 = null;
            } else {
                valueOf45 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf46 = null;
            } else {
                valueOf46 = Boolean.valueOf(parcel.readInt() != 0);
            }
            UsersDonutDto usersDonutDto = (UsersDonutDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            BaseSexDto baseSexDto = (BaseSexDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            Boolean bool28 = valueOf43;
            Integer num11 = valueOf65;
            Boolean bool29 = valueOf44;
            Boolean bool30 = valueOf45;
            Boolean bool31 = valueOf46;
            String readString69 = parcel.readString();
            String readString70 = parcel.readString();
            String readString71 = parcel.readString();
            String readString72 = parcel.readString();
            UsersOnlineInfoDto usersOnlineInfoDto = (UsersOnlineInfoDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto25 = (BaseBoolIntDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto26 = (BaseBoolIntDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            Integer valueOf66 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto baseBoolIntDto27 = (BaseBoolIntDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto28 = (BaseBoolIntDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            FriendsFriendStatusStatusDto friendsFriendStatusStatusDto = (FriendsFriendStatusStatusDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            FriendsRequestsMutualDto friendsRequestsMutualDto = (FriendsRequestsMutualDto) parcel.readParcelable(EducationGradeMemberItemDto.class.getClassLoader());
            Boolean bool32 = valueOf41;
            Integer num12 = valueOf63;
            Integer num13 = valueOf64;
            Boolean bool33 = valueOf42;
            Integer num14 = valueOf66;
            String readString73 = parcel.readString();
            String readString74 = parcel.readString();
            Integer valueOf67 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString75 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf47 = null;
            } else {
                valueOf47 = Boolean.valueOf(parcel.readInt() != 0);
            }
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
            return new EducationGradeMemberItemDto(userId2, str2, arrayList23, arrayList22, groupsRoleOptionsDto, bool2, bool3, readString2, readString3, readString4, bool4, bool5, bool6, bool7, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, readString14, readString15, readString16, readString17, readString18, readString19, readString20, readString21, createFromParcel4, baseCityDto3, baseCountryDto, f, ownerStateDto, readString22, readString23, readString24, readString25, readString26, readString27, baseBoolIntDto3, baseOwnerCoverDto, readString28, baseBoolIntDto4, baseBoolIntDto5, bool12, baseBoolIntDto6, baseBoolIntDto7, baseBoolIntDto8, baseBoolIntDto9, usersUserTypeDto, readString29, readString30, readString31, readString32, readString33, baseBoolIntDto10, baseBoolIntDto11, bool8, bool9, bool10, bool11, readString34, readString35, readString36, baseBoolIntDto12, videoLiveInfoDto, baseBoolIntDto13, bool13, readString37, readString38, readString39, readString40, readString41, readString42, readString43, photosPhotoDto3, arrayList27, arrayList29, arrayList28, readString44, valueOf51, bool14, wallDefaultDto, audioMusicAwardsDto, bool15, bool16, bool17, bool18, baseBoolIntDto16, arrayList9, readString45, readString46, readString47, readString48, readString49, readString50, readString51, readString52, readString53, baseBoolIntDto24, baseBoolIntDto17, bool19, readString54, readString55, readString56, audioAudioDto, readString57, readString58, appsAppMinDto, usersLastSeenDto, usersExportsDto, baseCropPhotoDto, num5, num6, num7, num8, baseBoolIntDto18, baseBoolIntDto19, baseBoolIntDto20, baseBoolIntDto21, num9, usersOccupationDto3, arrayList30, arrayList31, num, readString59, num2, num3, readString60, num4, readString61, readString62, readString63, usersUserRelationDto, usersUserMinDto, usersPersonalDto3, arrayList33, arrayList32, arrayList19, bool20, bool26, bool21, bool22, bool23, readString64, usersEmployeeWorkingStateDto3, employeeMarkDto, usersRightsLocationDto, bool24, usersEmojiStatusDto, statusImageStatusDto, usersUserCountersDto, readString65, baseBoolIntDto23, bool25, createStringArrayList, readString66, valueOf26, valueOf27, usersGiftsTooltipDto, noIndexDto, valueOf61, messagesContactDto, valueOf28, createStringArrayList2, arrayList20, num10, readString67, valueOf29, valueOf30, usersUserProfileTypeDto, usersCanNotCallReasonDto, valueOf31, valueOf32, baseImageDto, arrayList21, valueOf33, valueOf34, valueOf35, valueOf36, valueOf37, valueOf38, valueOf39, createFromParcel5, readString68, bool27, createStringArrayList3, createStringArrayList4, bool32, num12, num13, bool33, usersPromotionAllowanceDto, bool28, num11, bool29, messagesEduEducationalProfileDto, baseAPlusMarkDto, bool30, bool31, usersDonutDto, baseSexDto, readString69, readString70, readString71, readString72, usersOnlineInfoDto, baseBoolIntDto25, baseBoolIntDto26, num14, baseBoolIntDto27, baseBoolIntDto28, friendsFriendStatusStatusDto, friendsRequestsMutualDto, readString73, readString74, valueOf67, readString75, valueOf47, valueOf48, valueOf49);
        }

        @Override // android.os.Parcelable.Creator
        public final EducationGradeMemberItemDto[] newArray(int i) {
            return new EducationGradeMemberItemDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EducationGradeMemberItemDto(UserId userId, String str, List<EducationGradeRoleItemDto> list, List<? extends GroupsMemberRolePermissionDto> list2, GroupsRoleOptionsDto groupsRoleOptionsDto, Boolean bool, Boolean bool2, String str2, String str3, String str4, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, BdateVisibilityDto bdateVisibilityDto, BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, Float f, OwnerStateDto ownerStateDto, String str22, String str23, String str24, String str25, String str26, String str27, BaseBoolIntDto baseBoolIntDto, BaseOwnerCoverDto baseOwnerCoverDto, String str28, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Boolean bool7, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, UsersUserTypeDto usersUserTypeDto, String str29, String str30, String str31, String str32, String str33, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, String str34, String str35, String str36, BaseBoolIntDto baseBoolIntDto10, VideoLiveInfoDto videoLiveInfoDto, BaseBoolIntDto baseBoolIntDto11, Boolean bool12, String str37, String str38, String str39, String str40, String str41, String str42, String str43, PhotosPhotoDto photosPhotoDto, List<? extends List<UsersProfileButtonDto>> list3, List<? extends List<UsersProfileButtonDto>> list4, List<UsersProfileButtonDto> list5, String str44, Integer num, Boolean bool13, WallDefaultDto wallDefaultDto, AudioMusicAwardsDto audioMusicAwardsDto, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, BaseBoolIntDto baseBoolIntDto12, List<BaseOwnerButtonDto> list6, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, BaseBoolIntDto baseBoolIntDto13, BaseBoolIntDto baseBoolIntDto14, Boolean bool18, String str54, String str55, String str56, AudioAudioDto audioAudioDto, String str57, String str58, AppsAppMinDto appsAppMinDto, UsersLastSeenDto usersLastSeenDto, UsersExportsDto usersExportsDto, BaseCropPhotoDto baseCropPhotoDto, Integer num2, Integer num3, Integer num4, Integer num5, BaseBoolIntDto baseBoolIntDto15, BaseBoolIntDto baseBoolIntDto16, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, Integer num6, UsersOccupationDto usersOccupationDto, List<UsersCareerDto> list7, List<UsersMilitaryDto> list8, Integer num7, String str59, Integer num8, Integer num9, String str60, Integer num10, String str61, String str62, String str63, UsersUserRelationDto usersUserRelationDto, UsersUserMinDto usersUserMinDto, UsersPersonalDto usersPersonalDto, List<UsersUniversityDto> list9, List<UsersSchoolDto> list10, List<UsersRelativeDto> list11, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, String str64, UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto, EmployeeMarkDto employeeMarkDto, UsersRightsLocationDto usersRightsLocationDto, Boolean bool24, UsersEmojiStatusDto usersEmojiStatusDto, StatusImageStatusDto statusImageStatusDto, UsersUserCountersDto usersUserCountersDto, String str65, BaseBoolIntDto baseBoolIntDto19, Boolean bool25, List<String> list12, String str66, Boolean bool26, Boolean bool27, UsersGiftsTooltipDto usersGiftsTooltipDto, NoIndexDto noIndexDto, Integer num11, MessagesContactDto messagesContactDto, Boolean bool28, List<String> list13, List<Integer> list14, Integer num12, String str67, Boolean bool29, Boolean bool30, UsersUserProfileTypeDto usersUserProfileTypeDto, UsersCanNotCallReasonDto usersCanNotCallReasonDto, Boolean bool31, Boolean bool32, BaseImageDto baseImageDto, List<CallsCustomNameForCallDto> list15, Boolean bool33, Boolean bool34, Boolean bool35, Boolean bool36, Boolean bool37, Boolean bool38, Boolean bool39, SocialButtonTypeDto socialButtonTypeDto, String str68, Boolean bool40, List<String> list16, List<String> list17, Boolean bool41, Integer num13, Integer num14, Boolean bool42, UsersPromotionAllowanceDto usersPromotionAllowanceDto, Boolean bool43, Integer num15, Boolean bool44, MessagesEduEducationalProfileDto messagesEduEducationalProfileDto, BaseAPlusMarkDto baseAPlusMarkDto, Boolean bool45, Boolean bool46, UsersDonutDto usersDonutDto, BaseSexDto baseSexDto, String str69, String str70, String str71, String str72, UsersOnlineInfoDto usersOnlineInfoDto, BaseBoolIntDto baseBoolIntDto20, BaseBoolIntDto baseBoolIntDto21, Integer num16, BaseBoolIntDto baseBoolIntDto22, BaseBoolIntDto baseBoolIntDto23, FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, FriendsRequestsMutualDto friendsRequestsMutualDto, String str73, String str74, Integer num17, String str75, Boolean bool47, Boolean bool48, Boolean bool49) {
        this.id = userId;
        this.title = str;
        this.roles = list;
        this.permissions = list2;
        this.role = groupsRoleOptionsDto;
        this.isContact = bool;
        this.isCallOperator = bool2;
        this.contactPhone = str2;
        this.contactEmail = str3;
        this.contactPosition = str4;
        this.inGroup = bool3;
        this.blacklistedByGroup = bool4;
        this.isDon = bool5;
        this.isExecutorInPayoutAccount = bool6;
        this.firstNameNom = str5;
        this.firstNameGen = str6;
        this.firstNameDat = str7;
        this.firstNameAcc = str8;
        this.firstNameIns = str9;
        this.firstNameAbl = str10;
        this.lastNameNom = str11;
        this.lastNameGen = str12;
        this.lastNameDat = str13;
        this.lastNameAcc = str14;
        this.lastNameIns = str15;
        this.lastNameAbl = str16;
        this.nickname = str17;
        this.maidenName = str18;
        this.contactName = str19;
        this.domain = str20;
        this.bdate = str21;
        this.bdateVisibility = bdateVisibilityDto;
        this.city = baseCityDto;
        this.country = baseCountryDto;
        this.timezone = f;
        this.ownerState = ownerStateDto;
        this.photo200 = str22;
        this.photoMax = str23;
        this.photo200Orig = str24;
        this.photo400Orig = str25;
        this.photoMaxOrig = str26;
        this.photoId = str27;
        this.hasPhoto = baseBoolIntDto;
        this.cover = baseOwnerCoverDto;
        this.photoAvgColor = str28;
        this.hasMobile = baseBoolIntDto2;
        this.isFriend = baseBoolIntDto3;
        this.isBestFriend = bool7;
        this.wallComments = baseBoolIntDto4;
        this.canPost = baseBoolIntDto5;
        this.canSeeAllPosts = baseBoolIntDto6;
        this.canSeeAudio = baseBoolIntDto7;
        this.type = usersUserTypeDto;
        this.email = str29;
        this.skype = str30;
        this.facebook = str31;
        this.facebookName = str32;
        this.twitter = str33;
        this.isAdult = baseBoolIntDto8;
        this.isSubscribed = baseBoolIntDto9;
        this.isSubscribedStories = bool8;
        this.canSubscribeStories = bool9;
        this.canAskQuestion = bool10;
        this.canAskAnonymous = bool11;
        this.subscriptionCountry = str34;
        this.livejournal = str35;
        this.instagram = str36;
        this.test = baseBoolIntDto10;
        this.videoLive = videoLiveInfoDto;
        this.isVideoLiveNotificationsBlocked = baseBoolIntDto11;
        this.isService = bool12;
        this.serviceDescription = str37;
        this.photoRec = str38;
        this.photoMedium = str39;
        this.photoMediumRec = str40;
        this.photo = str41;
        this.photoBig = str42;
        this.photo400 = str43;
        this.photoMaxSize = photosPhotoDto;
        this.profileButtons = list3;
        this.profileButtonsTablet = list4;
        this.thirdPartyButtons = list5;
        this.language = str44;
        this.storiesArchiveCount = num;
        this.hasUnseenStories = bool13;
        this.wallDefault = wallDefaultDto;
        this.musicAwards = audioMusicAwardsDto;
        this.canCall = bool14;
        this.canCallFromGroup = bool15;
        this.canInviteAsVoiceroomsSpeaker = bool16;
        this.canSeeWishes = bool17;
        this.canSeeGifts = baseBoolIntDto12;
        this.buttons = list6;
        this.interests = str45;
        this.books = str46;
        this.tv = str47;
        this.quotes = str48;
        this.about = str49;
        this.games = str50;
        this.movies = str51;
        this.activities = str52;
        this.music = str53;
        this.canWritePrivateMessage = baseBoolIntDto13;
        this.canSendFriendRequest = baseBoolIntDto14;
        this.canBeInvitedGroup = bool18;
        this.mobilePhone = str54;
        this.homePhone = str55;
        this.site = str56;
        this.statusAudio = audioAudioDto;
        this.status = str57;
        this.activity = str58;
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
        this.career = list7;
        this.military = list8;
        this.university = num7;
        this.universityName = str59;
        this.universityGroupId = num8;
        this.faculty = num9;
        this.facultyName = str60;
        this.graduation = num10;
        this.educationForm = str61;
        this.educationStatus = str62;
        this.homeTown = str63;
        this.relation = usersUserRelationDto;
        this.relationPartner = usersUserMinDto;
        this.personal = usersPersonalDto;
        this.universities = list9;
        this.schools = list10;
        this.relatives = list11;
        this.isSubscribedPodcasts = bool19;
        this.canSubscribePodcasts = bool20;
        this.canSubscribePosts = bool21;
        this.isStudent = bool22;
        this.hasRights = bool23;
        this.sysUsername = str64;
        this.employeeWorkingState = usersEmployeeWorkingStateDto;
        this.employeeMark = employeeMarkDto;
        this.rightsLocation = usersRightsLocationDto;
        this.canInviteToChats = bool24;
        this.emojiStatus = usersEmojiStatusDto;
        this.imageStatus = statusImageStatusDto;
        this.counters = usersUserCountersDto;
        this.accessKey = str65;
        this.canUploadDoc = baseBoolIntDto19;
        this.canBan = bool25;
        this.eduDetails = list12;
        this.hash = str66;
        this.hasEmail = bool26;
        this.isDead = bool27;
        this.giftsTooltip = usersGiftsTooltipDto;
        this.noIndex = noIndexDto;
        this.contactId = num11;
        this.contact = messagesContactDto;
        this.isMessageRequest = bool28;
        this.descriptions = list13;
        this.lists = list14;
        this.friendshipWeeks = num12;
        this.trackCode = str67;
        this.isPersonalAdsEasyPromoteEnabled = bool29;
        this.needBigMsgBtnInProfile = bool30;
        this.profileType = usersUserProfileTypeDto;
        this.canNotCallReason = usersCanNotCallReasonDto;
        this.canCallAsCommunity = bool31;
        this.isNft = bool32;
        this.animatedAvatar = baseImageDto;
        this.customNamesForCalls = list15;
        this.isEsiaVerified = bool33;
        this.isEsiaLinked = bool34;
        this.isTinkoffVerified = bool35;
        this.isTinkoffLinked = bool36;
        this.isSberVerified = bool37;
        this.isVerified = bool38;
        this.isFollowersModeOn = bool39;
        this.socialButtonType = socialButtonTypeDto;
        this.description = str68;
        this.isTeacher = bool40;
        this.oauthLinked = list16;
        this.oauthVerification = list17;
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
        this.screenName = str69;
        this.photo50 = str70;
        this.photo100 = str71;
        this.photoBase = str72;
        this.onlineInfo = usersOnlineInfoDto;
        this.online = baseBoolIntDto20;
        this.onlineMobile = baseBoolIntDto21;
        this.onlineApp = num16;
        this.verified = baseBoolIntDto22;
        this.trending = baseBoolIntDto23;
        this.friendStatus = friendsFriendStatusStatusDto;
        this.mutual = friendsRequestsMutualDto;
        this.deactivated = str73;
        this.firstName = str74;
        this.hidden = num17;
        this.lastName = str75;
        this.canAccessClosed = bool47;
        this.isClosed = bool48;
        this.isCached = bool49;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationGradeMemberItemDto)) {
            return false;
        }
        EducationGradeMemberItemDto educationGradeMemberItemDto = (EducationGradeMemberItemDto) obj;
        return epx.f(this.id, educationGradeMemberItemDto.id) && epx.f(this.title, educationGradeMemberItemDto.title) && epx.f(this.roles, educationGradeMemberItemDto.roles) && epx.f(this.permissions, educationGradeMemberItemDto.permissions) && this.role == educationGradeMemberItemDto.role && epx.f(this.isContact, educationGradeMemberItemDto.isContact) && epx.f(this.isCallOperator, educationGradeMemberItemDto.isCallOperator) && epx.f(this.contactPhone, educationGradeMemberItemDto.contactPhone) && epx.f(this.contactEmail, educationGradeMemberItemDto.contactEmail) && epx.f(this.contactPosition, educationGradeMemberItemDto.contactPosition) && epx.f(this.inGroup, educationGradeMemberItemDto.inGroup) && epx.f(this.blacklistedByGroup, educationGradeMemberItemDto.blacklistedByGroup) && epx.f(this.isDon, educationGradeMemberItemDto.isDon) && epx.f(this.isExecutorInPayoutAccount, educationGradeMemberItemDto.isExecutorInPayoutAccount) && epx.f(this.firstNameNom, educationGradeMemberItemDto.firstNameNom) && epx.f(this.firstNameGen, educationGradeMemberItemDto.firstNameGen) && epx.f(this.firstNameDat, educationGradeMemberItemDto.firstNameDat) && epx.f(this.firstNameAcc, educationGradeMemberItemDto.firstNameAcc) && epx.f(this.firstNameIns, educationGradeMemberItemDto.firstNameIns) && epx.f(this.firstNameAbl, educationGradeMemberItemDto.firstNameAbl) && epx.f(this.lastNameNom, educationGradeMemberItemDto.lastNameNom) && epx.f(this.lastNameGen, educationGradeMemberItemDto.lastNameGen) && epx.f(this.lastNameDat, educationGradeMemberItemDto.lastNameDat) && epx.f(this.lastNameAcc, educationGradeMemberItemDto.lastNameAcc) && epx.f(this.lastNameIns, educationGradeMemberItemDto.lastNameIns) && epx.f(this.lastNameAbl, educationGradeMemberItemDto.lastNameAbl) && epx.f(this.nickname, educationGradeMemberItemDto.nickname) && epx.f(this.maidenName, educationGradeMemberItemDto.maidenName) && epx.f(this.contactName, educationGradeMemberItemDto.contactName) && epx.f(this.domain, educationGradeMemberItemDto.domain) && epx.f(this.bdate, educationGradeMemberItemDto.bdate) && this.bdateVisibility == educationGradeMemberItemDto.bdateVisibility && epx.f(this.city, educationGradeMemberItemDto.city) && epx.f(this.country, educationGradeMemberItemDto.country) && epx.f(this.timezone, educationGradeMemberItemDto.timezone) && epx.f(this.ownerState, educationGradeMemberItemDto.ownerState) && epx.f(this.photo200, educationGradeMemberItemDto.photo200) && epx.f(this.photoMax, educationGradeMemberItemDto.photoMax) && epx.f(this.photo200Orig, educationGradeMemberItemDto.photo200Orig) && epx.f(this.photo400Orig, educationGradeMemberItemDto.photo400Orig) && epx.f(this.photoMaxOrig, educationGradeMemberItemDto.photoMaxOrig) && epx.f(this.photoId, educationGradeMemberItemDto.photoId) && this.hasPhoto == educationGradeMemberItemDto.hasPhoto && epx.f(this.cover, educationGradeMemberItemDto.cover) && epx.f(this.photoAvgColor, educationGradeMemberItemDto.photoAvgColor) && this.hasMobile == educationGradeMemberItemDto.hasMobile && this.isFriend == educationGradeMemberItemDto.isFriend && epx.f(this.isBestFriend, educationGradeMemberItemDto.isBestFriend) && this.wallComments == educationGradeMemberItemDto.wallComments && this.canPost == educationGradeMemberItemDto.canPost && this.canSeeAllPosts == educationGradeMemberItemDto.canSeeAllPosts && this.canSeeAudio == educationGradeMemberItemDto.canSeeAudio && this.type == educationGradeMemberItemDto.type && epx.f(this.email, educationGradeMemberItemDto.email) && epx.f(this.skype, educationGradeMemberItemDto.skype) && epx.f(this.facebook, educationGradeMemberItemDto.facebook) && epx.f(this.facebookName, educationGradeMemberItemDto.facebookName) && epx.f(this.twitter, educationGradeMemberItemDto.twitter) && this.isAdult == educationGradeMemberItemDto.isAdult && this.isSubscribed == educationGradeMemberItemDto.isSubscribed && epx.f(this.isSubscribedStories, educationGradeMemberItemDto.isSubscribedStories) && epx.f(this.canSubscribeStories, educationGradeMemberItemDto.canSubscribeStories) && epx.f(this.canAskQuestion, educationGradeMemberItemDto.canAskQuestion) && epx.f(this.canAskAnonymous, educationGradeMemberItemDto.canAskAnonymous) && epx.f(this.subscriptionCountry, educationGradeMemberItemDto.subscriptionCountry) && epx.f(this.livejournal, educationGradeMemberItemDto.livejournal) && epx.f(this.instagram, educationGradeMemberItemDto.instagram) && this.test == educationGradeMemberItemDto.test && epx.f(this.videoLive, educationGradeMemberItemDto.videoLive) && this.isVideoLiveNotificationsBlocked == educationGradeMemberItemDto.isVideoLiveNotificationsBlocked && epx.f(this.isService, educationGradeMemberItemDto.isService) && epx.f(this.serviceDescription, educationGradeMemberItemDto.serviceDescription) && epx.f(this.photoRec, educationGradeMemberItemDto.photoRec) && epx.f(this.photoMedium, educationGradeMemberItemDto.photoMedium) && epx.f(this.photoMediumRec, educationGradeMemberItemDto.photoMediumRec) && epx.f(this.photo, educationGradeMemberItemDto.photo) && epx.f(this.photoBig, educationGradeMemberItemDto.photoBig) && epx.f(this.photo400, educationGradeMemberItemDto.photo400) && epx.f(this.photoMaxSize, educationGradeMemberItemDto.photoMaxSize) && epx.f(this.profileButtons, educationGradeMemberItemDto.profileButtons) && epx.f(this.profileButtonsTablet, educationGradeMemberItemDto.profileButtonsTablet) && epx.f(this.thirdPartyButtons, educationGradeMemberItemDto.thirdPartyButtons) && epx.f(this.language, educationGradeMemberItemDto.language) && epx.f(this.storiesArchiveCount, educationGradeMemberItemDto.storiesArchiveCount) && epx.f(this.hasUnseenStories, educationGradeMemberItemDto.hasUnseenStories) && this.wallDefault == educationGradeMemberItemDto.wallDefault && epx.f(this.musicAwards, educationGradeMemberItemDto.musicAwards) && epx.f(this.canCall, educationGradeMemberItemDto.canCall) && epx.f(this.canCallFromGroup, educationGradeMemberItemDto.canCallFromGroup) && epx.f(this.canInviteAsVoiceroomsSpeaker, educationGradeMemberItemDto.canInviteAsVoiceroomsSpeaker) && epx.f(this.canSeeWishes, educationGradeMemberItemDto.canSeeWishes) && this.canSeeGifts == educationGradeMemberItemDto.canSeeGifts && epx.f(this.buttons, educationGradeMemberItemDto.buttons) && epx.f(this.interests, educationGradeMemberItemDto.interests) && epx.f(this.books, educationGradeMemberItemDto.books) && epx.f(this.tv, educationGradeMemberItemDto.tv) && epx.f(this.quotes, educationGradeMemberItemDto.quotes) && epx.f(this.about, educationGradeMemberItemDto.about) && epx.f(this.games, educationGradeMemberItemDto.games) && epx.f(this.movies, educationGradeMemberItemDto.movies) && epx.f(this.activities, educationGradeMemberItemDto.activities) && epx.f(this.music, educationGradeMemberItemDto.music) && this.canWritePrivateMessage == educationGradeMemberItemDto.canWritePrivateMessage && this.canSendFriendRequest == educationGradeMemberItemDto.canSendFriendRequest && epx.f(this.canBeInvitedGroup, educationGradeMemberItemDto.canBeInvitedGroup) && epx.f(this.mobilePhone, educationGradeMemberItemDto.mobilePhone) && epx.f(this.homePhone, educationGradeMemberItemDto.homePhone) && epx.f(this.site, educationGradeMemberItemDto.site) && epx.f(this.statusAudio, educationGradeMemberItemDto.statusAudio) && epx.f(this.status, educationGradeMemberItemDto.status) && epx.f(this.activity, educationGradeMemberItemDto.activity) && epx.f(this.statusApp, educationGradeMemberItemDto.statusApp) && epx.f(this.lastSeen, educationGradeMemberItemDto.lastSeen) && epx.f(this.exports, educationGradeMemberItemDto.exports) && epx.f(this.cropPhoto, educationGradeMemberItemDto.cropPhoto) && epx.f(this.followersCount, educationGradeMemberItemDto.followersCount) && epx.f(this.videoLiveLevel, educationGradeMemberItemDto.videoLiveLevel) && epx.f(this.videoLiveCount, educationGradeMemberItemDto.videoLiveCount) && epx.f(this.clipsCount, educationGradeMemberItemDto.clipsCount) && this.blacklisted == educationGradeMemberItemDto.blacklisted && this.blacklistedByMe == educationGradeMemberItemDto.blacklistedByMe && this.isFavorite == educationGradeMemberItemDto.isFavorite && this.isHiddenFromFeed == educationGradeMemberItemDto.isHiddenFromFeed && epx.f(this.commonCount, educationGradeMemberItemDto.commonCount) && epx.f(this.occupation, educationGradeMemberItemDto.occupation) && epx.f(this.career, educationGradeMemberItemDto.career) && epx.f(this.military, educationGradeMemberItemDto.military) && epx.f(this.university, educationGradeMemberItemDto.university) && epx.f(this.universityName, educationGradeMemberItemDto.universityName) && epx.f(this.universityGroupId, educationGradeMemberItemDto.universityGroupId) && epx.f(this.faculty, educationGradeMemberItemDto.faculty) && epx.f(this.facultyName, educationGradeMemberItemDto.facultyName) && epx.f(this.graduation, educationGradeMemberItemDto.graduation) && epx.f(this.educationForm, educationGradeMemberItemDto.educationForm) && epx.f(this.educationStatus, educationGradeMemberItemDto.educationStatus) && epx.f(this.homeTown, educationGradeMemberItemDto.homeTown) && this.relation == educationGradeMemberItemDto.relation && epx.f(this.relationPartner, educationGradeMemberItemDto.relationPartner) && epx.f(this.personal, educationGradeMemberItemDto.personal) && epx.f(this.universities, educationGradeMemberItemDto.universities) && epx.f(this.schools, educationGradeMemberItemDto.schools) && epx.f(this.relatives, educationGradeMemberItemDto.relatives) && epx.f(this.isSubscribedPodcasts, educationGradeMemberItemDto.isSubscribedPodcasts) && epx.f(this.canSubscribePodcasts, educationGradeMemberItemDto.canSubscribePodcasts) && epx.f(this.canSubscribePosts, educationGradeMemberItemDto.canSubscribePosts) && epx.f(this.isStudent, educationGradeMemberItemDto.isStudent) && epx.f(this.hasRights, educationGradeMemberItemDto.hasRights) && epx.f(this.sysUsername, educationGradeMemberItemDto.sysUsername) && epx.f(this.employeeWorkingState, educationGradeMemberItemDto.employeeWorkingState) && this.employeeMark == educationGradeMemberItemDto.employeeMark && epx.f(this.rightsLocation, educationGradeMemberItemDto.rightsLocation) && epx.f(this.canInviteToChats, educationGradeMemberItemDto.canInviteToChats) && epx.f(this.emojiStatus, educationGradeMemberItemDto.emojiStatus) && epx.f(this.imageStatus, educationGradeMemberItemDto.imageStatus) && epx.f(this.counters, educationGradeMemberItemDto.counters) && epx.f(this.accessKey, educationGradeMemberItemDto.accessKey) && this.canUploadDoc == educationGradeMemberItemDto.canUploadDoc && epx.f(this.canBan, educationGradeMemberItemDto.canBan) && epx.f(this.eduDetails, educationGradeMemberItemDto.eduDetails) && epx.f(this.hash, educationGradeMemberItemDto.hash) && epx.f(this.hasEmail, educationGradeMemberItemDto.hasEmail) && epx.f(this.isDead, educationGradeMemberItemDto.isDead) && epx.f(this.giftsTooltip, educationGradeMemberItemDto.giftsTooltip) && this.noIndex == educationGradeMemberItemDto.noIndex && epx.f(this.contactId, educationGradeMemberItemDto.contactId) && epx.f(this.contact, educationGradeMemberItemDto.contact) && epx.f(this.isMessageRequest, educationGradeMemberItemDto.isMessageRequest) && epx.f(this.descriptions, educationGradeMemberItemDto.descriptions) && epx.f(this.lists, educationGradeMemberItemDto.lists) && epx.f(this.friendshipWeeks, educationGradeMemberItemDto.friendshipWeeks) && epx.f(this.trackCode, educationGradeMemberItemDto.trackCode) && epx.f(this.isPersonalAdsEasyPromoteEnabled, educationGradeMemberItemDto.isPersonalAdsEasyPromoteEnabled) && epx.f(this.needBigMsgBtnInProfile, educationGradeMemberItemDto.needBigMsgBtnInProfile) && this.profileType == educationGradeMemberItemDto.profileType && this.canNotCallReason == educationGradeMemberItemDto.canNotCallReason && epx.f(this.canCallAsCommunity, educationGradeMemberItemDto.canCallAsCommunity) && epx.f(this.isNft, educationGradeMemberItemDto.isNft) && epx.f(this.animatedAvatar, educationGradeMemberItemDto.animatedAvatar) && epx.f(this.customNamesForCalls, educationGradeMemberItemDto.customNamesForCalls) && epx.f(this.isEsiaVerified, educationGradeMemberItemDto.isEsiaVerified) && epx.f(this.isEsiaLinked, educationGradeMemberItemDto.isEsiaLinked) && epx.f(this.isTinkoffVerified, educationGradeMemberItemDto.isTinkoffVerified) && epx.f(this.isTinkoffLinked, educationGradeMemberItemDto.isTinkoffLinked) && epx.f(this.isSberVerified, educationGradeMemberItemDto.isSberVerified) && epx.f(this.isVerified, educationGradeMemberItemDto.isVerified) && epx.f(this.isFollowersModeOn, educationGradeMemberItemDto.isFollowersModeOn) && this.socialButtonType == educationGradeMemberItemDto.socialButtonType && epx.f(this.description, educationGradeMemberItemDto.description) && epx.f(this.isTeacher, educationGradeMemberItemDto.isTeacher) && epx.f(this.oauthLinked, educationGradeMemberItemDto.oauthLinked) && epx.f(this.oauthVerification, educationGradeMemberItemDto.oauthVerification) && epx.f(this.isSberLinked, educationGradeMemberItemDto.isSberLinked) && epx.f(this.ageMark, educationGradeMemberItemDto.ageMark) && epx.f(this.joined, educationGradeMemberItemDto.joined) && epx.f(this.isServiceAccount, educationGradeMemberItemDto.isServiceAccount) && epx.f(this.promotionAllowance, educationGradeMemberItemDto.promotionAllowance) && epx.f(this.coOwnershipEnabled, educationGradeMemberItemDto.coOwnershipEnabled) && epx.f(this.ageGroup, educationGradeMemberItemDto.ageGroup) && epx.f(this.hasRelatedUserPin, educationGradeMemberItemDto.hasRelatedUserPin) && epx.f(this.educationalProfile, educationGradeMemberItemDto.educationalProfile) && epx.f(this.aPlusMark, educationGradeMemberItemDto.aPlusMark) && epx.f(this.isMediaModer, educationGradeMemberItemDto.isMediaModer) && epx.f(this.isPhotoMapEnabled, educationGradeMemberItemDto.isPhotoMapEnabled) && epx.f(this.donut, educationGradeMemberItemDto.donut) && this.sex == educationGradeMemberItemDto.sex && epx.f(this.screenName, educationGradeMemberItemDto.screenName) && epx.f(this.photo50, educationGradeMemberItemDto.photo50) && epx.f(this.photo100, educationGradeMemberItemDto.photo100) && epx.f(this.photoBase, educationGradeMemberItemDto.photoBase) && epx.f(this.onlineInfo, educationGradeMemberItemDto.onlineInfo) && this.online == educationGradeMemberItemDto.online && this.onlineMobile == educationGradeMemberItemDto.onlineMobile && epx.f(this.onlineApp, educationGradeMemberItemDto.onlineApp) && this.verified == educationGradeMemberItemDto.verified && this.trending == educationGradeMemberItemDto.trending && this.friendStatus == educationGradeMemberItemDto.friendStatus && epx.f(this.mutual, educationGradeMemberItemDto.mutual) && epx.f(this.deactivated, educationGradeMemberItemDto.deactivated) && epx.f(this.firstName, educationGradeMemberItemDto.firstName) && epx.f(this.hidden, educationGradeMemberItemDto.hidden) && epx.f(this.lastName, educationGradeMemberItemDto.lastName) && epx.f(this.canAccessClosed, educationGradeMemberItemDto.canAccessClosed) && epx.f(this.isClosed, educationGradeMemberItemDto.isClosed) && epx.f(this.isCached, educationGradeMemberItemDto.isCached);
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<EducationGradeRoleItemDto> list = this.roles;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsMemberRolePermissionDto> list2 = this.permissions;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        GroupsRoleOptionsDto groupsRoleOptionsDto = this.role;
        int hashCode5 = (hashCode4 + (groupsRoleOptionsDto == null ? 0 : groupsRoleOptionsDto.hashCode())) * 31;
        Boolean bool = this.isContact;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isCallOperator;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.contactPhone;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.contactEmail;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.contactPosition;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool3 = this.inGroup;
        int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.blacklistedByGroup;
        int hashCode12 = (hashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isDon;
        int hashCode13 = (hashCode12 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isExecutorInPayoutAccount;
        int hashCode14 = (hashCode13 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str5 = this.firstNameNom;
        int hashCode15 = (hashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.firstNameGen;
        int hashCode16 = (hashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.firstNameDat;
        int hashCode17 = (hashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.firstNameAcc;
        int hashCode18 = (hashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.firstNameIns;
        int hashCode19 = (hashCode18 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.firstNameAbl;
        int hashCode20 = (hashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.lastNameNom;
        int hashCode21 = (hashCode20 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.lastNameGen;
        int hashCode22 = (hashCode21 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.lastNameDat;
        int hashCode23 = (hashCode22 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.lastNameAcc;
        int hashCode24 = (hashCode23 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.lastNameIns;
        int hashCode25 = (hashCode24 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.lastNameAbl;
        int hashCode26 = (hashCode25 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.nickname;
        int hashCode27 = (hashCode26 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.maidenName;
        int hashCode28 = (hashCode27 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.contactName;
        int hashCode29 = (hashCode28 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.domain;
        int hashCode30 = (hashCode29 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.bdate;
        int hashCode31 = (hashCode30 + (str21 == null ? 0 : str21.hashCode())) * 31;
        BdateVisibilityDto bdateVisibilityDto = this.bdateVisibility;
        int hashCode32 = (hashCode31 + (bdateVisibilityDto == null ? 0 : bdateVisibilityDto.hashCode())) * 31;
        BaseCityDto baseCityDto = this.city;
        int hashCode33 = (hashCode32 + (baseCityDto == null ? 0 : baseCityDto.hashCode())) * 31;
        BaseCountryDto baseCountryDto = this.country;
        int hashCode34 = (hashCode33 + (baseCountryDto == null ? 0 : baseCountryDto.hashCode())) * 31;
        Float f = this.timezone;
        int hashCode35 = (hashCode34 + (f == null ? 0 : f.hashCode())) * 31;
        OwnerStateDto ownerStateDto = this.ownerState;
        int hashCode36 = (hashCode35 + (ownerStateDto == null ? 0 : ownerStateDto.hashCode())) * 31;
        String str22 = this.photo200;
        int hashCode37 = (hashCode36 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.photoMax;
        int hashCode38 = (hashCode37 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.photo200Orig;
        int hashCode39 = (hashCode38 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.photo400Orig;
        int hashCode40 = (hashCode39 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.photoMaxOrig;
        int hashCode41 = (hashCode40 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.photoId;
        int hashCode42 = (hashCode41 + (str27 == null ? 0 : str27.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.hasPhoto;
        int hashCode43 = (hashCode42 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseOwnerCoverDto baseOwnerCoverDto = this.cover;
        int hashCode44 = (hashCode43 + (baseOwnerCoverDto == null ? 0 : baseOwnerCoverDto.hashCode())) * 31;
        String str28 = this.photoAvgColor;
        int hashCode45 = (hashCode44 + (str28 == null ? 0 : str28.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.hasMobile;
        int hashCode46 = (hashCode45 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.isFriend;
        int hashCode47 = (hashCode46 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        Boolean bool7 = this.isBestFriend;
        int hashCode48 = (hashCode47 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.wallComments;
        int hashCode49 = (hashCode48 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto5 = this.canPost;
        int hashCode50 = (hashCode49 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto6 = this.canSeeAllPosts;
        int hashCode51 = (hashCode50 + (baseBoolIntDto6 == null ? 0 : baseBoolIntDto6.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto7 = this.canSeeAudio;
        int hashCode52 = (hashCode51 + (baseBoolIntDto7 == null ? 0 : baseBoolIntDto7.hashCode())) * 31;
        UsersUserTypeDto usersUserTypeDto = this.type;
        int hashCode53 = (hashCode52 + (usersUserTypeDto == null ? 0 : usersUserTypeDto.hashCode())) * 31;
        String str29 = this.email;
        int hashCode54 = (hashCode53 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.skype;
        int hashCode55 = (hashCode54 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.facebook;
        int hashCode56 = (hashCode55 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.facebookName;
        int hashCode57 = (hashCode56 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.twitter;
        int hashCode58 = (hashCode57 + (str33 == null ? 0 : str33.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto8 = this.isAdult;
        int hashCode59 = (hashCode58 + (baseBoolIntDto8 == null ? 0 : baseBoolIntDto8.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto9 = this.isSubscribed;
        int hashCode60 = (hashCode59 + (baseBoolIntDto9 == null ? 0 : baseBoolIntDto9.hashCode())) * 31;
        Boolean bool8 = this.isSubscribedStories;
        int hashCode61 = (hashCode60 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.canSubscribeStories;
        int hashCode62 = (hashCode61 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.canAskQuestion;
        int hashCode63 = (hashCode62 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.canAskAnonymous;
        int hashCode64 = (hashCode63 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        String str34 = this.subscriptionCountry;
        int hashCode65 = (hashCode64 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.livejournal;
        int hashCode66 = (hashCode65 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.instagram;
        int hashCode67 = (hashCode66 + (str36 == null ? 0 : str36.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto10 = this.test;
        int hashCode68 = (hashCode67 + (baseBoolIntDto10 == null ? 0 : baseBoolIntDto10.hashCode())) * 31;
        VideoLiveInfoDto videoLiveInfoDto = this.videoLive;
        int hashCode69 = (hashCode68 + (videoLiveInfoDto == null ? 0 : videoLiveInfoDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto11 = this.isVideoLiveNotificationsBlocked;
        int hashCode70 = (hashCode69 + (baseBoolIntDto11 == null ? 0 : baseBoolIntDto11.hashCode())) * 31;
        Boolean bool12 = this.isService;
        int hashCode71 = (hashCode70 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        String str37 = this.serviceDescription;
        int hashCode72 = (hashCode71 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.photoRec;
        int hashCode73 = (hashCode72 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.photoMedium;
        int hashCode74 = (hashCode73 + (str39 == null ? 0 : str39.hashCode())) * 31;
        String str40 = this.photoMediumRec;
        int hashCode75 = (hashCode74 + (str40 == null ? 0 : str40.hashCode())) * 31;
        String str41 = this.photo;
        int hashCode76 = (hashCode75 + (str41 == null ? 0 : str41.hashCode())) * 31;
        String str42 = this.photoBig;
        int hashCode77 = (hashCode76 + (str42 == null ? 0 : str42.hashCode())) * 31;
        String str43 = this.photo400;
        int hashCode78 = (hashCode77 + (str43 == null ? 0 : str43.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photoMaxSize;
        int hashCode79 = (hashCode78 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        List<List<UsersProfileButtonDto>> list3 = this.profileButtons;
        int hashCode80 = (hashCode79 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<List<UsersProfileButtonDto>> list4 = this.profileButtonsTablet;
        int hashCode81 = (hashCode80 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<UsersProfileButtonDto> list5 = this.thirdPartyButtons;
        int hashCode82 = (hashCode81 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str44 = this.language;
        int hashCode83 = (hashCode82 + (str44 == null ? 0 : str44.hashCode())) * 31;
        Integer num = this.storiesArchiveCount;
        int hashCode84 = (hashCode83 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool13 = this.hasUnseenStories;
        int hashCode85 = (hashCode84 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        WallDefaultDto wallDefaultDto = this.wallDefault;
        int hashCode86 = (hashCode85 + (wallDefaultDto == null ? 0 : wallDefaultDto.hashCode())) * 31;
        AudioMusicAwardsDto audioMusicAwardsDto = this.musicAwards;
        int hashCode87 = (hashCode86 + (audioMusicAwardsDto == null ? 0 : audioMusicAwardsDto.hashCode())) * 31;
        Boolean bool14 = this.canCall;
        int hashCode88 = (hashCode87 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.canCallFromGroup;
        int hashCode89 = (hashCode88 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.canInviteAsVoiceroomsSpeaker;
        int hashCode90 = (hashCode89 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        Boolean bool17 = this.canSeeWishes;
        int hashCode91 = (hashCode90 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto12 = this.canSeeGifts;
        int hashCode92 = (hashCode91 + (baseBoolIntDto12 == null ? 0 : baseBoolIntDto12.hashCode())) * 31;
        List<BaseOwnerButtonDto> list6 = this.buttons;
        int hashCode93 = (hashCode92 + (list6 == null ? 0 : list6.hashCode())) * 31;
        String str45 = this.interests;
        int hashCode94 = (hashCode93 + (str45 == null ? 0 : str45.hashCode())) * 31;
        String str46 = this.books;
        int hashCode95 = (hashCode94 + (str46 == null ? 0 : str46.hashCode())) * 31;
        String str47 = this.tv;
        int hashCode96 = (hashCode95 + (str47 == null ? 0 : str47.hashCode())) * 31;
        String str48 = this.quotes;
        int hashCode97 = (hashCode96 + (str48 == null ? 0 : str48.hashCode())) * 31;
        String str49 = this.about;
        int hashCode98 = (hashCode97 + (str49 == null ? 0 : str49.hashCode())) * 31;
        String str50 = this.games;
        int hashCode99 = (hashCode98 + (str50 == null ? 0 : str50.hashCode())) * 31;
        String str51 = this.movies;
        int hashCode100 = (hashCode99 + (str51 == null ? 0 : str51.hashCode())) * 31;
        String str52 = this.activities;
        int hashCode101 = (hashCode100 + (str52 == null ? 0 : str52.hashCode())) * 31;
        String str53 = this.music;
        int hashCode102 = (hashCode101 + (str53 == null ? 0 : str53.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto13 = this.canWritePrivateMessage;
        int hashCode103 = (hashCode102 + (baseBoolIntDto13 == null ? 0 : baseBoolIntDto13.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto14 = this.canSendFriendRequest;
        int hashCode104 = (hashCode103 + (baseBoolIntDto14 == null ? 0 : baseBoolIntDto14.hashCode())) * 31;
        Boolean bool18 = this.canBeInvitedGroup;
        int hashCode105 = (hashCode104 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        String str54 = this.mobilePhone;
        int hashCode106 = (hashCode105 + (str54 == null ? 0 : str54.hashCode())) * 31;
        String str55 = this.homePhone;
        int hashCode107 = (hashCode106 + (str55 == null ? 0 : str55.hashCode())) * 31;
        String str56 = this.site;
        int hashCode108 = (hashCode107 + (str56 == null ? 0 : str56.hashCode())) * 31;
        AudioAudioDto audioAudioDto = this.statusAudio;
        int hashCode109 = (hashCode108 + (audioAudioDto == null ? 0 : audioAudioDto.hashCode())) * 31;
        String str57 = this.status;
        int hashCode110 = (hashCode109 + (str57 == null ? 0 : str57.hashCode())) * 31;
        String str58 = this.activity;
        int hashCode111 = (hashCode110 + (str58 == null ? 0 : str58.hashCode())) * 31;
        AppsAppMinDto appsAppMinDto = this.statusApp;
        int hashCode112 = (hashCode111 + (appsAppMinDto == null ? 0 : appsAppMinDto.hashCode())) * 31;
        UsersLastSeenDto usersLastSeenDto = this.lastSeen;
        int hashCode113 = (hashCode112 + (usersLastSeenDto == null ? 0 : usersLastSeenDto.hashCode())) * 31;
        UsersExportsDto usersExportsDto = this.exports;
        int hashCode114 = (hashCode113 + (usersExportsDto == null ? 0 : usersExportsDto.hashCode())) * 31;
        BaseCropPhotoDto baseCropPhotoDto = this.cropPhoto;
        int hashCode115 = (hashCode114 + (baseCropPhotoDto == null ? 0 : baseCropPhotoDto.hashCode())) * 31;
        Integer num2 = this.followersCount;
        int hashCode116 = (hashCode115 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.videoLiveLevel;
        int hashCode117 = (hashCode116 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.videoLiveCount;
        int hashCode118 = (hashCode117 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.clipsCount;
        int hashCode119 = (hashCode118 + (num5 == null ? 0 : num5.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto15 = this.blacklisted;
        int hashCode120 = (hashCode119 + (baseBoolIntDto15 == null ? 0 : baseBoolIntDto15.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto16 = this.blacklistedByMe;
        int hashCode121 = (hashCode120 + (baseBoolIntDto16 == null ? 0 : baseBoolIntDto16.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto17 = this.isFavorite;
        int hashCode122 = (hashCode121 + (baseBoolIntDto17 == null ? 0 : baseBoolIntDto17.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto18 = this.isHiddenFromFeed;
        int hashCode123 = (hashCode122 + (baseBoolIntDto18 == null ? 0 : baseBoolIntDto18.hashCode())) * 31;
        Integer num6 = this.commonCount;
        int hashCode124 = (hashCode123 + (num6 == null ? 0 : num6.hashCode())) * 31;
        UsersOccupationDto usersOccupationDto = this.occupation;
        int hashCode125 = (hashCode124 + (usersOccupationDto == null ? 0 : usersOccupationDto.hashCode())) * 31;
        List<UsersCareerDto> list7 = this.career;
        int hashCode126 = (hashCode125 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<UsersMilitaryDto> list8 = this.military;
        int hashCode127 = (hashCode126 + (list8 == null ? 0 : list8.hashCode())) * 31;
        Integer num7 = this.university;
        int hashCode128 = (hashCode127 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str59 = this.universityName;
        int hashCode129 = (hashCode128 + (str59 == null ? 0 : str59.hashCode())) * 31;
        Integer num8 = this.universityGroupId;
        int hashCode130 = (hashCode129 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.faculty;
        int hashCode131 = (hashCode130 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str60 = this.facultyName;
        int hashCode132 = (hashCode131 + (str60 == null ? 0 : str60.hashCode())) * 31;
        Integer num10 = this.graduation;
        int hashCode133 = (hashCode132 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str61 = this.educationForm;
        int hashCode134 = (hashCode133 + (str61 == null ? 0 : str61.hashCode())) * 31;
        String str62 = this.educationStatus;
        int hashCode135 = (hashCode134 + (str62 == null ? 0 : str62.hashCode())) * 31;
        String str63 = this.homeTown;
        int hashCode136 = (hashCode135 + (str63 == null ? 0 : str63.hashCode())) * 31;
        UsersUserRelationDto usersUserRelationDto = this.relation;
        int hashCode137 = (hashCode136 + (usersUserRelationDto == null ? 0 : usersUserRelationDto.hashCode())) * 31;
        UsersUserMinDto usersUserMinDto = this.relationPartner;
        int hashCode138 = (hashCode137 + (usersUserMinDto == null ? 0 : usersUserMinDto.hashCode())) * 31;
        UsersPersonalDto usersPersonalDto = this.personal;
        int hashCode139 = (hashCode138 + (usersPersonalDto == null ? 0 : usersPersonalDto.hashCode())) * 31;
        List<UsersUniversityDto> list9 = this.universities;
        int hashCode140 = (hashCode139 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<UsersSchoolDto> list10 = this.schools;
        int hashCode141 = (hashCode140 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<UsersRelativeDto> list11 = this.relatives;
        int hashCode142 = (hashCode141 + (list11 == null ? 0 : list11.hashCode())) * 31;
        Boolean bool19 = this.isSubscribedPodcasts;
        int hashCode143 = (hashCode142 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        Boolean bool20 = this.canSubscribePodcasts;
        int hashCode144 = (hashCode143 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        Boolean bool21 = this.canSubscribePosts;
        int hashCode145 = (hashCode144 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
        Boolean bool22 = this.isStudent;
        int hashCode146 = (hashCode145 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
        Boolean bool23 = this.hasRights;
        int hashCode147 = (hashCode146 + (bool23 == null ? 0 : bool23.hashCode())) * 31;
        String str64 = this.sysUsername;
        int hashCode148 = (hashCode147 + (str64 == null ? 0 : str64.hashCode())) * 31;
        UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto = this.employeeWorkingState;
        int hashCode149 = (hashCode148 + (usersEmployeeWorkingStateDto == null ? 0 : usersEmployeeWorkingStateDto.hashCode())) * 31;
        EmployeeMarkDto employeeMarkDto = this.employeeMark;
        int hashCode150 = (hashCode149 + (employeeMarkDto == null ? 0 : employeeMarkDto.hashCode())) * 31;
        UsersRightsLocationDto usersRightsLocationDto = this.rightsLocation;
        int hashCode151 = (hashCode150 + (usersRightsLocationDto == null ? 0 : usersRightsLocationDto.hashCode())) * 31;
        Boolean bool24 = this.canInviteToChats;
        int hashCode152 = (hashCode151 + (bool24 == null ? 0 : bool24.hashCode())) * 31;
        UsersEmojiStatusDto usersEmojiStatusDto = this.emojiStatus;
        int hashCode153 = (hashCode152 + (usersEmojiStatusDto == null ? 0 : usersEmojiStatusDto.hashCode())) * 31;
        StatusImageStatusDto statusImageStatusDto = this.imageStatus;
        int hashCode154 = (hashCode153 + (statusImageStatusDto == null ? 0 : statusImageStatusDto.hashCode())) * 31;
        UsersUserCountersDto usersUserCountersDto = this.counters;
        int hashCode155 = (hashCode154 + (usersUserCountersDto == null ? 0 : usersUserCountersDto.hashCode())) * 31;
        String str65 = this.accessKey;
        int hashCode156 = (hashCode155 + (str65 == null ? 0 : str65.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto19 = this.canUploadDoc;
        int hashCode157 = (hashCode156 + (baseBoolIntDto19 == null ? 0 : baseBoolIntDto19.hashCode())) * 31;
        Boolean bool25 = this.canBan;
        int hashCode158 = (hashCode157 + (bool25 == null ? 0 : bool25.hashCode())) * 31;
        List<String> list12 = this.eduDetails;
        int hashCode159 = (hashCode158 + (list12 == null ? 0 : list12.hashCode())) * 31;
        String str66 = this.hash;
        int hashCode160 = (hashCode159 + (str66 == null ? 0 : str66.hashCode())) * 31;
        Boolean bool26 = this.hasEmail;
        int hashCode161 = (hashCode160 + (bool26 == null ? 0 : bool26.hashCode())) * 31;
        Boolean bool27 = this.isDead;
        int hashCode162 = (hashCode161 + (bool27 == null ? 0 : bool27.hashCode())) * 31;
        UsersGiftsTooltipDto usersGiftsTooltipDto = this.giftsTooltip;
        int hashCode163 = (hashCode162 + (usersGiftsTooltipDto == null ? 0 : usersGiftsTooltipDto.hashCode())) * 31;
        NoIndexDto noIndexDto = this.noIndex;
        int hashCode164 = (hashCode163 + (noIndexDto == null ? 0 : noIndexDto.hashCode())) * 31;
        Integer num11 = this.contactId;
        int hashCode165 = (hashCode164 + (num11 == null ? 0 : num11.hashCode())) * 31;
        MessagesContactDto messagesContactDto = this.contact;
        int hashCode166 = (hashCode165 + (messagesContactDto == null ? 0 : messagesContactDto.hashCode())) * 31;
        Boolean bool28 = this.isMessageRequest;
        int hashCode167 = (hashCode166 + (bool28 == null ? 0 : bool28.hashCode())) * 31;
        List<String> list13 = this.descriptions;
        int hashCode168 = (hashCode167 + (list13 == null ? 0 : list13.hashCode())) * 31;
        List<Integer> list14 = this.lists;
        int hashCode169 = (hashCode168 + (list14 == null ? 0 : list14.hashCode())) * 31;
        Integer num12 = this.friendshipWeeks;
        int hashCode170 = (hashCode169 + (num12 == null ? 0 : num12.hashCode())) * 31;
        String str67 = this.trackCode;
        int hashCode171 = (hashCode170 + (str67 == null ? 0 : str67.hashCode())) * 31;
        Boolean bool29 = this.isPersonalAdsEasyPromoteEnabled;
        int hashCode172 = (hashCode171 + (bool29 == null ? 0 : bool29.hashCode())) * 31;
        Boolean bool30 = this.needBigMsgBtnInProfile;
        int hashCode173 = (hashCode172 + (bool30 == null ? 0 : bool30.hashCode())) * 31;
        UsersUserProfileTypeDto usersUserProfileTypeDto = this.profileType;
        int hashCode174 = (hashCode173 + (usersUserProfileTypeDto == null ? 0 : usersUserProfileTypeDto.hashCode())) * 31;
        UsersCanNotCallReasonDto usersCanNotCallReasonDto = this.canNotCallReason;
        int hashCode175 = (hashCode174 + (usersCanNotCallReasonDto == null ? 0 : usersCanNotCallReasonDto.hashCode())) * 31;
        Boolean bool31 = this.canCallAsCommunity;
        int hashCode176 = (hashCode175 + (bool31 == null ? 0 : bool31.hashCode())) * 31;
        Boolean bool32 = this.isNft;
        int hashCode177 = (hashCode176 + (bool32 == null ? 0 : bool32.hashCode())) * 31;
        BaseImageDto baseImageDto = this.animatedAvatar;
        int hashCode178 = (hashCode177 + (baseImageDto == null ? 0 : baseImageDto.hashCode())) * 31;
        List<CallsCustomNameForCallDto> list15 = this.customNamesForCalls;
        int hashCode179 = (hashCode178 + (list15 == null ? 0 : list15.hashCode())) * 31;
        Boolean bool33 = this.isEsiaVerified;
        int hashCode180 = (hashCode179 + (bool33 == null ? 0 : bool33.hashCode())) * 31;
        Boolean bool34 = this.isEsiaLinked;
        int hashCode181 = (hashCode180 + (bool34 == null ? 0 : bool34.hashCode())) * 31;
        Boolean bool35 = this.isTinkoffVerified;
        int hashCode182 = (hashCode181 + (bool35 == null ? 0 : bool35.hashCode())) * 31;
        Boolean bool36 = this.isTinkoffLinked;
        int hashCode183 = (hashCode182 + (bool36 == null ? 0 : bool36.hashCode())) * 31;
        Boolean bool37 = this.isSberVerified;
        int hashCode184 = (hashCode183 + (bool37 == null ? 0 : bool37.hashCode())) * 31;
        Boolean bool38 = this.isVerified;
        int hashCode185 = (hashCode184 + (bool38 == null ? 0 : bool38.hashCode())) * 31;
        Boolean bool39 = this.isFollowersModeOn;
        int hashCode186 = (hashCode185 + (bool39 == null ? 0 : bool39.hashCode())) * 31;
        SocialButtonTypeDto socialButtonTypeDto = this.socialButtonType;
        int hashCode187 = (hashCode186 + (socialButtonTypeDto == null ? 0 : socialButtonTypeDto.hashCode())) * 31;
        String str68 = this.description;
        int hashCode188 = (hashCode187 + (str68 == null ? 0 : str68.hashCode())) * 31;
        Boolean bool40 = this.isTeacher;
        int hashCode189 = (hashCode188 + (bool40 == null ? 0 : bool40.hashCode())) * 31;
        List<String> list16 = this.oauthLinked;
        int hashCode190 = (hashCode189 + (list16 == null ? 0 : list16.hashCode())) * 31;
        List<String> list17 = this.oauthVerification;
        int hashCode191 = (hashCode190 + (list17 == null ? 0 : list17.hashCode())) * 31;
        Boolean bool41 = this.isSberLinked;
        int hashCode192 = (hashCode191 + (bool41 == null ? 0 : bool41.hashCode())) * 31;
        Integer num13 = this.ageMark;
        int hashCode193 = (hashCode192 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.joined;
        int hashCode194 = (hashCode193 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Boolean bool42 = this.isServiceAccount;
        int hashCode195 = (hashCode194 + (bool42 == null ? 0 : bool42.hashCode())) * 31;
        UsersPromotionAllowanceDto usersPromotionAllowanceDto = this.promotionAllowance;
        int hashCode196 = (hashCode195 + (usersPromotionAllowanceDto == null ? 0 : usersPromotionAllowanceDto.hashCode())) * 31;
        Boolean bool43 = this.coOwnershipEnabled;
        int hashCode197 = (hashCode196 + (bool43 == null ? 0 : bool43.hashCode())) * 31;
        Integer num15 = this.ageGroup;
        int hashCode198 = (hashCode197 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Boolean bool44 = this.hasRelatedUserPin;
        int hashCode199 = (hashCode198 + (bool44 == null ? 0 : bool44.hashCode())) * 31;
        MessagesEduEducationalProfileDto messagesEduEducationalProfileDto = this.educationalProfile;
        int hashCode200 = (hashCode199 + (messagesEduEducationalProfileDto == null ? 0 : messagesEduEducationalProfileDto.hashCode())) * 31;
        BaseAPlusMarkDto baseAPlusMarkDto = this.aPlusMark;
        int hashCode201 = (hashCode200 + (baseAPlusMarkDto == null ? 0 : baseAPlusMarkDto.hashCode())) * 31;
        Boolean bool45 = this.isMediaModer;
        int hashCode202 = (hashCode201 + (bool45 == null ? 0 : bool45.hashCode())) * 31;
        Boolean bool46 = this.isPhotoMapEnabled;
        int hashCode203 = (hashCode202 + (bool46 == null ? 0 : bool46.hashCode())) * 31;
        UsersDonutDto usersDonutDto = this.donut;
        int hashCode204 = (hashCode203 + (usersDonutDto == null ? 0 : usersDonutDto.hashCode())) * 31;
        BaseSexDto baseSexDto = this.sex;
        int hashCode205 = (hashCode204 + (baseSexDto == null ? 0 : baseSexDto.hashCode())) * 31;
        String str69 = this.screenName;
        int hashCode206 = (hashCode205 + (str69 == null ? 0 : str69.hashCode())) * 31;
        String str70 = this.photo50;
        int hashCode207 = (hashCode206 + (str70 == null ? 0 : str70.hashCode())) * 31;
        String str71 = this.photo100;
        int hashCode208 = (hashCode207 + (str71 == null ? 0 : str71.hashCode())) * 31;
        String str72 = this.photoBase;
        int hashCode209 = (hashCode208 + (str72 == null ? 0 : str72.hashCode())) * 31;
        UsersOnlineInfoDto usersOnlineInfoDto = this.onlineInfo;
        int hashCode210 = (hashCode209 + (usersOnlineInfoDto == null ? 0 : usersOnlineInfoDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto20 = this.online;
        int hashCode211 = (hashCode210 + (baseBoolIntDto20 == null ? 0 : baseBoolIntDto20.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto21 = this.onlineMobile;
        int hashCode212 = (hashCode211 + (baseBoolIntDto21 == null ? 0 : baseBoolIntDto21.hashCode())) * 31;
        Integer num16 = this.onlineApp;
        int hashCode213 = (hashCode212 + (num16 == null ? 0 : num16.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto22 = this.verified;
        int hashCode214 = (hashCode213 + (baseBoolIntDto22 == null ? 0 : baseBoolIntDto22.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto23 = this.trending;
        int hashCode215 = (hashCode214 + (baseBoolIntDto23 == null ? 0 : baseBoolIntDto23.hashCode())) * 31;
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto = this.friendStatus;
        int hashCode216 = (hashCode215 + (friendsFriendStatusStatusDto == null ? 0 : friendsFriendStatusStatusDto.hashCode())) * 31;
        FriendsRequestsMutualDto friendsRequestsMutualDto = this.mutual;
        int hashCode217 = (hashCode216 + (friendsRequestsMutualDto == null ? 0 : friendsRequestsMutualDto.hashCode())) * 31;
        String str73 = this.deactivated;
        int hashCode218 = (hashCode217 + (str73 == null ? 0 : str73.hashCode())) * 31;
        String str74 = this.firstName;
        int hashCode219 = (hashCode218 + (str74 == null ? 0 : str74.hashCode())) * 31;
        Integer num17 = this.hidden;
        int hashCode220 = (hashCode219 + (num17 == null ? 0 : num17.hashCode())) * 31;
        String str75 = this.lastName;
        int hashCode221 = (hashCode220 + (str75 == null ? 0 : str75.hashCode())) * 31;
        Boolean bool47 = this.canAccessClosed;
        int hashCode222 = (hashCode221 + (bool47 == null ? 0 : bool47.hashCode())) * 31;
        Boolean bool48 = this.isClosed;
        int hashCode223 = (hashCode222 + (bool48 == null ? 0 : bool48.hashCode())) * 31;
        Boolean bool49 = this.isCached;
        return hashCode223 + (bool49 != null ? bool49.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EducationGradeMemberItemDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", roles=");
        sb.append(this.roles);
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

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        parcel.writeString(this.title);
        List<EducationGradeRoleItemDto> list = this.roles;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((EducationGradeRoleItemDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<GroupsMemberRolePermissionDto> list2 = this.permissions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        parcel.writeParcelable(this.role, i);
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
        Float f3 = this.timezone;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f3);
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
        List<List<UsersProfileButtonDto>> list3 = this.profileButtons;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list3, 1);
            while (f4.hasNext()) {
                Iterator a2 = ao.a(parcel, (List) f4.next());
                while (a2.hasNext()) {
                    parcel.writeParcelable((Parcelable) a2.next(), i);
                }
            }
        }
        List<List<UsersProfileButtonDto>> list4 = this.profileButtonsTablet;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list4, 1);
            while (f5.hasNext()) {
                Iterator a3 = ao.a(parcel, (List) f5.next());
                while (a3.hasNext()) {
                    parcel.writeParcelable((Parcelable) a3.next(), i);
                }
            }
        }
        List<UsersProfileButtonDto> list5 = this.thirdPartyButtons;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f6 = dn.f(parcel, list5, 1);
            while (f6.hasNext()) {
                parcel.writeParcelable((Parcelable) f6.next(), i);
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
        List<BaseOwnerButtonDto> list6 = this.buttons;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f7 = dn.f(parcel, list6, 1);
            while (f7.hasNext()) {
                parcel.writeParcelable((Parcelable) f7.next(), i);
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
        List<UsersCareerDto> list7 = this.career;
        if (list7 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f8 = dn.f(parcel, list7, 1);
            while (f8.hasNext()) {
                parcel.writeParcelable((Parcelable) f8.next(), i);
            }
        }
        List<UsersMilitaryDto> list8 = this.military;
        if (list8 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f9 = dn.f(parcel, list8, 1);
            while (f9.hasNext()) {
                parcel.writeParcelable((Parcelable) f9.next(), i);
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
        List<UsersUniversityDto> list9 = this.universities;
        if (list9 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f10 = dn.f(parcel, list9, 1);
            while (f10.hasNext()) {
                parcel.writeParcelable((Parcelable) f10.next(), i);
            }
        }
        List<UsersSchoolDto> list10 = this.schools;
        if (list10 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f11 = dn.f(parcel, list10, 1);
            while (f11.hasNext()) {
                parcel.writeParcelable((Parcelable) f11.next(), i);
            }
        }
        List<UsersRelativeDto> list11 = this.relatives;
        if (list11 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f12 = dn.f(parcel, list11, 1);
            while (f12.hasNext()) {
                parcel.writeParcelable((Parcelable) f12.next(), i);
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
        List<Integer> list12 = this.lists;
        if (list12 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f13 = dn.f(parcel, list12, 1);
            while (f13.hasNext()) {
                parcel.writeInt(((Number) f13.next()).intValue());
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
        List<CallsCustomNameForCallDto> list13 = this.customNamesForCalls;
        if (list13 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f14 = dn.f(parcel, list13, 1);
            while (f14.hasNext()) {
                parcel.writeParcelable((Parcelable) f14.next(), i);
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ EducationGradeMemberItemDto(UserId userId, String str, List list, List list2, GroupsRoleOptionsDto groupsRoleOptionsDto, Boolean bool, Boolean bool2, String str2, String str3, String str4, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, BdateVisibilityDto bdateVisibilityDto, BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, Float f, OwnerStateDto ownerStateDto, String str22, String str23, String str24, String str25, String str26, String str27, BaseBoolIntDto baseBoolIntDto, BaseOwnerCoverDto baseOwnerCoverDto, String str28, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Boolean bool7, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, UsersUserTypeDto usersUserTypeDto, String str29, String str30, String str31, String str32, String str33, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, String str34, String str35, String str36, BaseBoolIntDto baseBoolIntDto10, VideoLiveInfoDto videoLiveInfoDto, BaseBoolIntDto baseBoolIntDto11, Boolean bool12, String str37, String str38, String str39, String str40, String str41, String str42, String str43, PhotosPhotoDto photosPhotoDto, List list3, List list4, List list5, String str44, Integer num, Boolean bool13, WallDefaultDto wallDefaultDto, AudioMusicAwardsDto audioMusicAwardsDto, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, BaseBoolIntDto baseBoolIntDto12, List list6, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, BaseBoolIntDto baseBoolIntDto13, BaseBoolIntDto baseBoolIntDto14, Boolean bool18, String str54, String str55, String str56, AudioAudioDto audioAudioDto, String str57, String str58, AppsAppMinDto appsAppMinDto, UsersLastSeenDto usersLastSeenDto, UsersExportsDto usersExportsDto, BaseCropPhotoDto baseCropPhotoDto, Integer num2, Integer num3, Integer num4, Integer num5, BaseBoolIntDto baseBoolIntDto15, BaseBoolIntDto baseBoolIntDto16, BaseBoolIntDto baseBoolIntDto17, BaseBoolIntDto baseBoolIntDto18, Integer num6, UsersOccupationDto usersOccupationDto, List list7, List list8, Integer num7, String str59, Integer num8, Integer num9, String str60, Integer num10, String str61, String str62, String str63, UsersUserRelationDto usersUserRelationDto, UsersUserMinDto usersUserMinDto, UsersPersonalDto usersPersonalDto, List list9, List list10, List list11, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, String str64, UsersEmployeeWorkingStateDto usersEmployeeWorkingStateDto, EmployeeMarkDto employeeMarkDto, UsersRightsLocationDto usersRightsLocationDto, Boolean bool24, UsersEmojiStatusDto usersEmojiStatusDto, StatusImageStatusDto statusImageStatusDto, UsersUserCountersDto usersUserCountersDto, String str65, BaseBoolIntDto baseBoolIntDto19, Boolean bool25, List list12, String str66, Boolean bool26, Boolean bool27, UsersGiftsTooltipDto usersGiftsTooltipDto, NoIndexDto noIndexDto, Integer num11, MessagesContactDto messagesContactDto, Boolean bool28, List list13, List list14, Integer num12, String str67, Boolean bool29, Boolean bool30, UsersUserProfileTypeDto usersUserProfileTypeDto, UsersCanNotCallReasonDto usersCanNotCallReasonDto, Boolean bool31, Boolean bool32, BaseImageDto baseImageDto, List list15, Boolean bool33, Boolean bool34, Boolean bool35, Boolean bool36, Boolean bool37, Boolean bool38, Boolean bool39, SocialButtonTypeDto socialButtonTypeDto, String str68, Boolean bool40, List list16, List list17, Boolean bool41, Integer num13, Integer num14, Boolean bool42, UsersPromotionAllowanceDto usersPromotionAllowanceDto, Boolean bool43, Integer num15, Boolean bool44, MessagesEduEducationalProfileDto messagesEduEducationalProfileDto, BaseAPlusMarkDto baseAPlusMarkDto, Boolean bool45, Boolean bool46, UsersDonutDto usersDonutDto, BaseSexDto baseSexDto, String str69, String str70, String str71, String str72, UsersOnlineInfoDto usersOnlineInfoDto, BaseBoolIntDto baseBoolIntDto20, BaseBoolIntDto baseBoolIntDto21, Integer num16, BaseBoolIntDto baseBoolIntDto22, BaseBoolIntDto baseBoolIntDto23, FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, FriendsRequestsMutualDto friendsRequestsMutualDto, String str73, String str74, Integer num17, String str75, Boolean bool47, Boolean bool48, Boolean bool49, int i, int i2, int i3, int i4, int i5, int i6, int i7, zcl zclVar) {
        this(userId, r173, r9, r10, r11, r12, r13, r14, r15, r8, r174, r175, r176, r177, r7, r17, r19, r21, r23, r25, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r178, r39, r40, r41, r42, r43, r44, r45, r179, r180, r181, r182, r183, r184, r185, r186, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r1, r62, r63, r64, r65, r66, r67, r68, r187, r188, r189, r190, r191, r192, r193, r194, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r2, r85, r86, r87, r88, r89, r90, r91, r195, r196, r197, r198, r199, r200, r201, r202, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r3, r108, r109, r110, r111, r112, r113, r114, r203, r204, r205, r206, r207, r208, r209, r0, (i5 & 32768) != 0 ? null : bool20, (i5 & 65536) != 0 ? null : bool21, (i5 & 131072) != 0 ? null : bool22, (i5 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool23, (i5 & 524288) != 0 ? null : str64, (i5 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : usersEmployeeWorkingStateDto, (i5 & 2097152) != 0 ? null : employeeMarkDto, (i5 & 4194304) != 0 ? null : usersRightsLocationDto, (i5 & 8388608) != 0 ? null : bool24, (i5 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : usersEmojiStatusDto, (i5 & 33554432) != 0 ? null : statusImageStatusDto, (i5 & 67108864) != 0 ? null : usersUserCountersDto, (i5 & 134217728) != 0 ? null : str65, (i5 & 268435456) != 0 ? null : baseBoolIntDto19, (i5 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool25, (i5 & 1073741824) != 0 ? null : list12, (i5 & Integer.MIN_VALUE) != 0 ? null : str66, (i6 & 1) != 0 ? null : bool26, (i6 & 2) != 0 ? null : bool27, (i6 & 4) != 0 ? null : usersGiftsTooltipDto, (i6 & 8) != 0 ? null : noIndexDto, (i6 & 16) != 0 ? null : num11, (i6 & 32) != 0 ? null : messagesContactDto, (i6 & 64) != 0 ? null : bool28, (i6 & 128) != 0 ? null : list13, (i6 & 256) != 0 ? null : list14, (i6 & 512) != 0 ? null : num12, (i6 & 1024) != 0 ? null : str67, (i6 & 2048) != 0 ? null : bool29, (i6 & 4096) != 0 ? null : bool30, (i6 & 8192) != 0 ? null : usersUserProfileTypeDto, (i6 & 16384) != 0 ? null : usersCanNotCallReasonDto, (i6 & 32768) != 0 ? null : bool31, (i6 & 65536) != 0 ? null : bool32, (i6 & 131072) != 0 ? null : baseImageDto, (i6 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : list15, (i6 & 524288) != 0 ? null : bool33, (i6 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool34, (i6 & 2097152) != 0 ? null : bool35, (i6 & 4194304) != 0 ? null : bool36, (i6 & 8388608) != 0 ? null : bool37, (i6 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : bool38, (i6 & 33554432) != 0 ? null : bool39, (i6 & 67108864) != 0 ? null : socialButtonTypeDto, (i6 & 134217728) != 0 ? null : str68, (i6 & 268435456) != 0 ? null : bool40, (i6 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : list16, (i6 & 1073741824) != 0 ? null : list17, (i6 & Integer.MIN_VALUE) != 0 ? null : bool41, (i7 & 1) != 0 ? null : num13, (i7 & 2) != 0 ? null : num14, (i7 & 4) != 0 ? null : bool42, (i7 & 8) != 0 ? null : usersPromotionAllowanceDto, (i7 & 16) != 0 ? null : bool43, (i7 & 32) != 0 ? null : num15, (i7 & 64) != 0 ? null : bool44, (i7 & 128) != 0 ? null : messagesEduEducationalProfileDto, (i7 & 256) != 0 ? null : baseAPlusMarkDto, (i7 & 512) != 0 ? null : bool45, (i7 & 1024) != 0 ? null : bool46, (i7 & 2048) != 0 ? null : usersDonutDto, (i7 & 4096) != 0 ? null : baseSexDto, (i7 & 8192) != 0 ? null : str69, (i7 & 16384) != 0 ? null : str70, (i7 & 32768) != 0 ? null : str71, (i7 & 65536) != 0 ? null : str72, (i7 & 131072) != 0 ? null : usersOnlineInfoDto, (i7 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : baseBoolIntDto20, (i7 & 524288) != 0 ? null : baseBoolIntDto21, (i7 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num16, (i7 & 2097152) != 0 ? null : baseBoolIntDto22, (i7 & 4194304) != 0 ? null : baseBoolIntDto23, (i7 & 8388608) != 0 ? null : friendsFriendStatusStatusDto, (i7 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : friendsRequestsMutualDto, (i7 & 33554432) != 0 ? null : str73, (i7 & 67108864) != 0 ? null : str74, (i7 & 134217728) != 0 ? null : num17, (i7 & 268435456) != 0 ? null : str75, (i7 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool47, (i7 & 1073741824) != 0 ? null : bool48, (i7 & Integer.MIN_VALUE) != 0 ? null : bool49);
        String str76 = (i & 2) != 0 ? null : str;
        List list18 = (i & 4) != 0 ? null : list;
        List list19 = (i & 8) != 0 ? null : list2;
        GroupsRoleOptionsDto groupsRoleOptionsDto2 = (i & 16) != 0 ? null : groupsRoleOptionsDto;
        Boolean bool50 = (i & 32) != 0 ? null : bool;
        Boolean bool51 = (i & 64) != 0 ? null : bool2;
        String str77 = (i & 128) != 0 ? null : str2;
        String str78 = (i & 256) != 0 ? null : str3;
        String str79 = (i & 512) != 0 ? null : str4;
        String str80 = str76;
        Boolean bool52 = (i & 1024) != 0 ? null : bool3;
        Boolean bool53 = (i & 2048) != 0 ? null : bool4;
        Boolean bool54 = (i & 4096) != 0 ? null : bool5;
        Boolean bool55 = (i & 8192) != 0 ? null : bool6;
        String str81 = (i & 16384) != 0 ? null : str5;
        String str82 = (i & 32768) != 0 ? null : str6;
        String str83 = (i & 65536) != 0 ? null : str7;
        String str84 = (i & 131072) != 0 ? null : str8;
        String str85 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str9;
        String str86 = (i & 524288) != 0 ? null : str10;
        String str87 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str11;
        String str88 = (i & 2097152) != 0 ? null : str12;
        String str89 = (i & 4194304) != 0 ? null : str13;
        String str90 = (i & 8388608) != 0 ? null : str14;
        String str91 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str15;
        String str92 = (i & 33554432) != 0 ? null : str16;
        String str93 = (i & 67108864) != 0 ? null : str17;
        String str94 = (i & 134217728) != 0 ? null : str18;
        String str95 = (i & 268435456) != 0 ? null : str19;
        String str96 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str20;
        String str97 = (i & 1073741824) != 0 ? null : str21;
        BdateVisibilityDto bdateVisibilityDto2 = (i & Integer.MIN_VALUE) != 0 ? null : bdateVisibilityDto;
        BaseCityDto baseCityDto2 = (i2 & 1) != 0 ? null : baseCityDto;
        BaseCountryDto baseCountryDto2 = (i2 & 2) != 0 ? null : baseCountryDto;
        Float f2 = (i2 & 4) != 0 ? null : f;
        OwnerStateDto ownerStateDto2 = (i2 & 8) != 0 ? null : ownerStateDto;
        String str98 = (i2 & 16) != 0 ? null : str22;
        String str99 = (i2 & 32) != 0 ? null : str23;
        String str100 = (i2 & 64) != 0 ? null : str24;
        BdateVisibilityDto bdateVisibilityDto3 = bdateVisibilityDto2;
        String str101 = (i2 & 128) != 0 ? null : str25;
        String str102 = (i2 & 256) != 0 ? null : str26;
        String str103 = (i2 & 512) != 0 ? null : str27;
        BaseBoolIntDto baseBoolIntDto24 = (i2 & 1024) != 0 ? null : baseBoolIntDto;
        BaseOwnerCoverDto baseOwnerCoverDto2 = (i2 & 2048) != 0 ? null : baseOwnerCoverDto;
        String str104 = (i2 & 4096) != 0 ? null : str28;
        BaseBoolIntDto baseBoolIntDto25 = (i2 & 8192) != 0 ? null : baseBoolIntDto2;
        BaseBoolIntDto baseBoolIntDto26 = (i2 & 16384) != 0 ? null : baseBoolIntDto3;
        Boolean bool56 = (i2 & 32768) != 0 ? null : bool7;
        BaseBoolIntDto baseBoolIntDto27 = (i2 & 65536) != 0 ? null : baseBoolIntDto4;
        BaseBoolIntDto baseBoolIntDto28 = (i2 & 131072) != 0 ? null : baseBoolIntDto5;
        BaseBoolIntDto baseBoolIntDto29 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : baseBoolIntDto6;
        BaseBoolIntDto baseBoolIntDto30 = (i2 & 524288) != 0 ? null : baseBoolIntDto7;
        UsersUserTypeDto usersUserTypeDto2 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : usersUserTypeDto;
        String str105 = (i2 & 2097152) != 0 ? null : str29;
        String str106 = (i2 & 4194304) != 0 ? null : str30;
        String str107 = (i2 & 8388608) != 0 ? null : str31;
        String str108 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str32;
        String str109 = (i2 & 33554432) != 0 ? null : str33;
        BaseBoolIntDto baseBoolIntDto31 = (i2 & 67108864) != 0 ? null : baseBoolIntDto8;
        BaseBoolIntDto baseBoolIntDto32 = (i2 & 134217728) != 0 ? null : baseBoolIntDto9;
        Boolean bool57 = (i2 & 268435456) != 0 ? null : bool8;
        Boolean bool58 = (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool9;
        Boolean bool59 = (i2 & 1073741824) != 0 ? null : bool10;
        Boolean bool60 = (i2 & Integer.MIN_VALUE) != 0 ? null : bool11;
        String str110 = (i3 & 1) != 0 ? null : str34;
        String str111 = (i3 & 2) != 0 ? null : str35;
        String str112 = (i3 & 4) != 0 ? null : str36;
        BaseBoolIntDto baseBoolIntDto33 = (i3 & 8) != 0 ? null : baseBoolIntDto10;
        VideoLiveInfoDto videoLiveInfoDto2 = (i3 & 16) != 0 ? null : videoLiveInfoDto;
        BaseBoolIntDto baseBoolIntDto34 = (i3 & 32) != 0 ? null : baseBoolIntDto11;
        Boolean bool61 = (i3 & 64) != 0 ? null : bool12;
        BaseBoolIntDto baseBoolIntDto35 = baseBoolIntDto26;
        String str113 = (i3 & 128) != 0 ? null : str37;
        String str114 = (i3 & 256) != 0 ? null : str38;
        String str115 = (i3 & 512) != 0 ? null : str39;
        String str116 = (i3 & 1024) != 0 ? null : str40;
        String str117 = (i3 & 2048) != 0 ? null : str41;
        String str118 = (i3 & 4096) != 0 ? null : str42;
        String str119 = (i3 & 8192) != 0 ? null : str43;
        PhotosPhotoDto photosPhotoDto2 = (i3 & 16384) != 0 ? null : photosPhotoDto;
        List list20 = (i3 & 32768) != 0 ? null : list3;
        List list21 = (i3 & 65536) != 0 ? null : list4;
        List list22 = (i3 & 131072) != 0 ? null : list5;
        String str120 = (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str44;
        Integer num18 = (i3 & 524288) != 0 ? null : num;
        Boolean bool62 = (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool13;
        WallDefaultDto wallDefaultDto2 = (i3 & 2097152) != 0 ? null : wallDefaultDto;
        AudioMusicAwardsDto audioMusicAwardsDto2 = (i3 & 4194304) != 0 ? null : audioMusicAwardsDto;
        Boolean bool63 = (i3 & 8388608) != 0 ? null : bool14;
        Boolean bool64 = (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : bool15;
        Boolean bool65 = (i3 & 33554432) != 0 ? null : bool16;
        Boolean bool66 = (i3 & 67108864) != 0 ? null : bool17;
        BaseBoolIntDto baseBoolIntDto36 = (i3 & 134217728) != 0 ? null : baseBoolIntDto12;
        List list23 = (i3 & 268435456) != 0 ? null : list6;
        String str121 = (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str45;
        String str122 = (i3 & 1073741824) != 0 ? null : str46;
        String str123 = (i3 & Integer.MIN_VALUE) != 0 ? null : str47;
        String str124 = (i4 & 1) != 0 ? null : str48;
        String str125 = (i4 & 2) != 0 ? null : str49;
        String str126 = (i4 & 4) != 0 ? null : str50;
        String str127 = (i4 & 8) != 0 ? null : str51;
        String str128 = (i4 & 16) != 0 ? null : str52;
        String str129 = (i4 & 32) != 0 ? null : str53;
        BaseBoolIntDto baseBoolIntDto37 = (i4 & 64) != 0 ? null : baseBoolIntDto13;
        PhotosPhotoDto photosPhotoDto3 = photosPhotoDto2;
        BaseBoolIntDto baseBoolIntDto38 = (i4 & 128) != 0 ? null : baseBoolIntDto14;
        Boolean bool67 = (i4 & 256) != 0 ? null : bool18;
        String str130 = (i4 & 512) != 0 ? null : str54;
        String str131 = (i4 & 1024) != 0 ? null : str55;
        String str132 = (i4 & 2048) != 0 ? null : str56;
        AudioAudioDto audioAudioDto2 = (i4 & 4096) != 0 ? null : audioAudioDto;
        String str133 = (i4 & 8192) != 0 ? null : str57;
        String str134 = (i4 & 16384) != 0 ? null : str58;
        AppsAppMinDto appsAppMinDto2 = (i4 & 32768) != 0 ? null : appsAppMinDto;
        UsersLastSeenDto usersLastSeenDto2 = (i4 & 65536) != 0 ? null : usersLastSeenDto;
        UsersExportsDto usersExportsDto2 = (i4 & 131072) != 0 ? null : usersExportsDto;
        BaseCropPhotoDto baseCropPhotoDto2 = (i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : baseCropPhotoDto;
        Integer num19 = (i4 & 524288) != 0 ? null : num2;
        Integer num20 = (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num3;
        Integer num21 = (i4 & 2097152) != 0 ? null : num4;
        Integer num22 = (i4 & 4194304) != 0 ? null : num5;
        BaseBoolIntDto baseBoolIntDto39 = (i4 & 8388608) != 0 ? null : baseBoolIntDto15;
        BaseBoolIntDto baseBoolIntDto40 = (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : baseBoolIntDto16;
        BaseBoolIntDto baseBoolIntDto41 = (i4 & 33554432) != 0 ? null : baseBoolIntDto17;
        BaseBoolIntDto baseBoolIntDto42 = (i4 & 67108864) != 0 ? null : baseBoolIntDto18;
        Integer num23 = (i4 & 134217728) != 0 ? null : num6;
        UsersOccupationDto usersOccupationDto2 = (i4 & 268435456) != 0 ? null : usersOccupationDto;
        List list24 = (i4 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : list7;
        List list25 = (i4 & 1073741824) != 0 ? null : list8;
        Integer num24 = (i4 & Integer.MIN_VALUE) != 0 ? null : num7;
        String str135 = (i5 & 1) != 0 ? null : str59;
        Integer num25 = (i5 & 2) != 0 ? null : num8;
        Integer num26 = (i5 & 4) != 0 ? null : num9;
        String str136 = (i5 & 8) != 0 ? null : str60;
        Integer num27 = (i5 & 16) != 0 ? null : num10;
        String str137 = (i5 & 32) != 0 ? null : str61;
        String str138 = (i5 & 64) != 0 ? null : str62;
        String str139 = str134;
        String str140 = (i5 & 128) != 0 ? null : str63;
        UsersUserRelationDto usersUserRelationDto2 = (i5 & 256) != 0 ? null : usersUserRelationDto;
        UsersUserMinDto usersUserMinDto2 = (i5 & 512) != 0 ? null : usersUserMinDto;
        UsersPersonalDto usersPersonalDto2 = (i5 & 1024) != 0 ? null : usersPersonalDto;
        List list26 = (i5 & 2048) != 0 ? null : list9;
        List list27 = (i5 & 4096) != 0 ? null : list10;
        List list28 = (i5 & 8192) != 0 ? null : list11;
        Boolean bool68 = (i5 & 16384) != 0 ? null : bool19;
    }
}
