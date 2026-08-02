package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.X3;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.vungle.ads.internal.protos.Sdk;
import org.chromium.base.version_info.VersionConstants;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.sdk.api.login.LoginRequest;
import xsna.asp;
import xsna.eok;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UsersFieldsDto.kt */
/* loaded from: classes.dex */
public final class UsersFieldsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UsersFieldsDto[] $VALUES;

    @pmi0("about")
    public static final UsersFieldsDto ABOUT;

    @pmi0("activities")
    public static final UsersFieldsDto ACTIVITIES;

    @pmi0("activity")
    public static final UsersFieldsDto ACTIVITY;

    @pmi0("age_group")
    public static final UsersFieldsDto AGE_GROUP;

    @pmi0("age_mark")
    public static final UsersFieldsDto AGE_MARK;

    @pmi0("animated_avatar")
    public static final UsersFieldsDto ANIMATED_AVATAR;

    @pmi0("a_plus_mark")
    public static final UsersFieldsDto A_PLUS_MARK;

    @pmi0("bdate")
    public static final UsersFieldsDto BDATE;

    @pmi0("bdate_visibility")
    public static final UsersFieldsDto BDATE_VISIBILITY;

    @pmi0("birthdate")
    public static final UsersFieldsDto BIRTHDATE;

    @pmi0("blacklisted")
    public static final UsersFieldsDto BLACKLISTED;

    @pmi0("blacklisted_by_me")
    public static final UsersFieldsDto BLACKLISTED_BY_ME;

    @pmi0("books")
    public static final UsersFieldsDto BOOKS;

    @pmi0("buttons")
    public static final UsersFieldsDto BUTTONS;

    @pmi0("can_ask_anonymous")
    public static final UsersFieldsDto CAN_ASK_ANONYMOUS;

    @pmi0("can_ask_question")
    public static final UsersFieldsDto CAN_ASK_QUESTION;

    @pmi0("can_ban")
    public static final UsersFieldsDto CAN_BAN;

    @pmi0("can_be_invited_group")
    public static final UsersFieldsDto CAN_BE_INVITED_GROUP;

    @pmi0("can_call")
    public static final UsersFieldsDto CAN_CALL;

    @pmi0("can_call_as_community")
    public static final UsersFieldsDto CAN_CALL_AS_COMMUNITY;

    @pmi0("can_call_from_group")
    public static final UsersFieldsDto CAN_CALL_FROM_GROUP;

    @pmi0("can_invite_as_voicerooms_speaker")
    public static final UsersFieldsDto CAN_INVITE_AS_VOICEROOMS_SPEAKER;

    @pmi0("can_invite_to_chats")
    public static final UsersFieldsDto CAN_INVITE_TO_CHATS;

    @pmi0("can_not_call_reason")
    public static final UsersFieldsDto CAN_NOT_CALL_REASON;

    @pmi0("can_post")
    public static final UsersFieldsDto CAN_POST;

    @pmi0("can_see_all_posts")
    public static final UsersFieldsDto CAN_SEE_ALL_POSTS;

    @pmi0("can_see_audio")
    public static final UsersFieldsDto CAN_SEE_AUDIO;

    @pmi0("can_see_gifts")
    public static final UsersFieldsDto CAN_SEE_GIFTS;

    @pmi0("can_see_wishes")
    public static final UsersFieldsDto CAN_SEE_WISHES;

    @pmi0("can_send_friend_request")
    public static final UsersFieldsDto CAN_SEND_FRIEND_REQUEST;

    @pmi0("can_subscribe_podcasts")
    public static final UsersFieldsDto CAN_SUBSCRIBE_PODCASTS;

    @pmi0("can_subscribe_posts")
    public static final UsersFieldsDto CAN_SUBSCRIBE_POSTS;

    @pmi0("can_subscribe_stories")
    public static final UsersFieldsDto CAN_SUBSCRIBE_STORIES;

    @pmi0("can_upload_doc")
    public static final UsersFieldsDto CAN_UPLOAD_DOC;

    @pmi0("can_write_private_message")
    public static final UsersFieldsDto CAN_WRITE_PRIVATE_MESSAGE;

    @pmi0("career")
    public static final UsersFieldsDto CAREER;

    @pmi0("city")
    public static final UsersFieldsDto CITY;

    @pmi0("clips_count")
    public static final UsersFieldsDto CLIPS_COUNT;

    @pmi0("common_count")
    public static final UsersFieldsDto COMMON_COUNT;

    @pmi0("connections")
    public static final UsersFieldsDto CONNECTIONS;

    @pmi0("contacts")
    public static final UsersFieldsDto CONTACTS;

    @pmi0("contact_id")
    public static final UsersFieldsDto CONTACT_ID;

    @pmi0("contact_name")
    public static final UsersFieldsDto CONTACT_NAME;

    @pmi0("counters")
    public static final UsersFieldsDto COUNTERS;

    @pmi0("country")
    public static final UsersFieldsDto COUNTRY;

    @pmi0("cover")
    public static final UsersFieldsDto COVER;

    @pmi0("co_ownership_enabled")
    public static final UsersFieldsDto CO_OWNERSHIP_ENABLED;
    public static final Parcelable.Creator<UsersFieldsDto> CREATOR;

    @pmi0("crop_photo")
    public static final UsersFieldsDto CROP_PHOTO;

    @pmi0("custom_names_for_calls")
    public static final UsersFieldsDto CUSTOM_NAMES_FOR_CALLS;

    @pmi0("description")
    public static final UsersFieldsDto DESCRIPTION;

    @pmi0("descriptions")
    public static final UsersFieldsDto DESCRIPTIONS;

    @pmi0(X3.j.D)
    public static final UsersFieldsDto DOMAIN;

    @pmi0("donut")
    public static final UsersFieldsDto DONUT;

    @pmi0("education")
    public static final UsersFieldsDto EDUCATION;

    @pmi0("educational_profile")
    public static final UsersFieldsDto EDUCATIONAL_PROFILE;

    @pmi0("edu_roles")
    public static final UsersFieldsDto EDU_ROLES;

    @pmi0("emoji_status")
    public static final UsersFieldsDto EMOJI_STATUS;

    @pmi0("employee_mark")
    public static final UsersFieldsDto EMPLOYEE_MARK;

    @pmi0("employee_working_state")
    public static final UsersFieldsDto EMPLOYEE_WORKING_STATE;

    @pmi0("exports")
    public static final UsersFieldsDto EXPORTS;

    @pmi0("first_name_abl")
    public static final UsersFieldsDto FIRST_NAME_ABL;

    @pmi0("first_name_acc")
    public static final UsersFieldsDto FIRST_NAME_ACC;

    @pmi0("first_name_dat")
    public static final UsersFieldsDto FIRST_NAME_DAT;

    @pmi0("first_name_gen")
    public static final UsersFieldsDto FIRST_NAME_GEN;

    @pmi0("first_name_ins")
    public static final UsersFieldsDto FIRST_NAME_INS;

    @pmi0("first_name_nom")
    public static final UsersFieldsDto FIRST_NAME_NOM;

    @pmi0("followers_count")
    public static final UsersFieldsDto FOLLOWERS_COUNT;

    @pmi0("friendship_weeks")
    public static final UsersFieldsDto FRIENDSHIP_WEEKS;

    @pmi0("friend_status")
    public static final UsersFieldsDto FRIEND_STATUS;

    @pmi0("games")
    public static final UsersFieldsDto GAMES;

    @pmi0("gifts_tooltip")
    public static final UsersFieldsDto GIFTS_TOOLTIP;

    @pmi0("has_email")
    public static final UsersFieldsDto HAS_EMAIL;

    @pmi0("has_mobile")
    public static final UsersFieldsDto HAS_MOBILE;

    @pmi0("has_photo")
    public static final UsersFieldsDto HAS_PHOTO;

    @pmi0("has_related_user_pin")
    public static final UsersFieldsDto HAS_RELATED_USER_PIN;

    @pmi0("has_rights")
    public static final UsersFieldsDto HAS_RIGHTS;

    @pmi0("has_unseen_stories")
    public static final UsersFieldsDto HAS_UNSEEN_STORIES;

    @pmi0("home_town")
    public static final UsersFieldsDto HOME_TOWN;

    @pmi0("image_status")
    public static final UsersFieldsDto IMAGE_STATUS;

    @pmi0("interests")
    public static final UsersFieldsDto INTERESTS;

    @pmi0("is_adult")
    public static final UsersFieldsDto IS_ADULT;

    @pmi0("is_best_friend")
    public static final UsersFieldsDto IS_BEST_FRIEND;

    @pmi0("is_dead")
    public static final UsersFieldsDto IS_DEAD;

    @pmi0("is_don")
    public static final UsersFieldsDto IS_DON;

    @pmi0("is_esia_linked")
    public static final UsersFieldsDto IS_ESIA_LINKED;

    @pmi0("is_esia_verified")
    public static final UsersFieldsDto IS_ESIA_VERIFIED;

    @pmi0("is_favorite")
    public static final UsersFieldsDto IS_FAVORITE;

    @pmi0("is_followers_mode_on")
    public static final UsersFieldsDto IS_FOLLOWERS_MODE_ON;

    @pmi0("is_friend")
    public static final UsersFieldsDto IS_FRIEND;

    @pmi0("is_hidden_from_feed")
    public static final UsersFieldsDto IS_HIDDEN_FROM_FEED;

    @pmi0("is_media_moder")
    public static final UsersFieldsDto IS_MEDIA_MODER;

    @pmi0("is_nft")
    public static final UsersFieldsDto IS_NFT;

    @pmi0("is_no_index")
    public static final UsersFieldsDto IS_NO_INDEX;

    @pmi0("is_personal_ads_easy_promote_enabled")
    public static final UsersFieldsDto IS_PERSONAL_ADS_EASY_PROMOTE_ENABLED;

    @pmi0("is_photo_map_enabled")
    public static final UsersFieldsDto IS_PHOTO_MAP_ENABLED;

    @pmi0("is_sber_linked")
    public static final UsersFieldsDto IS_SBER_LINKED;

    @pmi0("is_sber_verified")
    public static final UsersFieldsDto IS_SBER_VERIFIED;

    @pmi0("is_service_account")
    public static final UsersFieldsDto IS_SERVICE_ACCOUNT;

    @pmi0("is_student")
    public static final UsersFieldsDto IS_STUDENT;

    @pmi0("is_subscribed")
    public static final UsersFieldsDto IS_SUBSCRIBED;

    @pmi0("is_subscribed_podcasts")
    public static final UsersFieldsDto IS_SUBSCRIBED_PODCASTS;

    @pmi0("is_subscribed_stories")
    public static final UsersFieldsDto IS_SUBSCRIBED_STORIES;

    @pmi0("is_teacher")
    public static final UsersFieldsDto IS_TEACHER;

    @pmi0("is_tinkoff_linked")
    public static final UsersFieldsDto IS_TINKOFF_LINKED;

    @pmi0("is_tinkoff_verified")
    public static final UsersFieldsDto IS_TINKOFF_VERIFIED;

    @pmi0("is_verified")
    public static final UsersFieldsDto IS_VERIFIED;

    @pmi0("is_video_live_notifications_blocked")
    public static final UsersFieldsDto IS_VIDEO_LIVE_NOTIFICATIONS_BLOCKED;

    @pmi0("joined")
    public static final UsersFieldsDto JOINED;

    @pmi0("lang")
    public static final UsersFieldsDto LANG;

    @pmi0("language")
    public static final UsersFieldsDto LANGUAGE;

    @pmi0("last_name_abl")
    public static final UsersFieldsDto LAST_NAME_ABL;

    @pmi0("last_name_acc")
    public static final UsersFieldsDto LAST_NAME_ACC;

    @pmi0("last_name_dat")
    public static final UsersFieldsDto LAST_NAME_DAT;

    @pmi0("last_name_gen")
    public static final UsersFieldsDto LAST_NAME_GEN;

    @pmi0("last_name_ins")
    public static final UsersFieldsDto LAST_NAME_INS;

    @pmi0("last_name_nom")
    public static final UsersFieldsDto LAST_NAME_NOM;

    @pmi0("last_seen")
    public static final UsersFieldsDto LAST_SEEN;

    @pmi0("lists")
    public static final UsersFieldsDto LISTS;

    @pmi0("maiden_name")
    public static final UsersFieldsDto MAIDEN_NAME;

    @pmi0("military")
    public static final UsersFieldsDto MILITARY;

    @pmi0("movies")
    public static final UsersFieldsDto MOVIES;

    @pmi0("music")
    public static final UsersFieldsDto MUSIC;

    @pmi0("music_awards")
    public static final UsersFieldsDto MUSIC_AWARDS;

    @pmi0("mutual")
    public static final UsersFieldsDto MUTUAL;

    @pmi0("need_big_msg_btn_in_profile")
    public static final UsersFieldsDto NEED_BIG_MSG_BTN_IN_PROFILE;

    @pmi0("nickname")
    public static final UsersFieldsDto NICKNAME;

    @pmi0("no_index")
    public static final UsersFieldsDto NO_INDEX;

    @pmi0("oauth_linked")
    public static final UsersFieldsDto OAUTH_LINKED;

    @pmi0("oauth_verification")
    public static final UsersFieldsDto OAUTH_VERIFICATION;

    @pmi0("occupation")
    public static final UsersFieldsDto OCCUPATION;

    @pmi0(eok.ONLINE_EXTRAS_KEY)
    public static final UsersFieldsDto ONLINE;

    @pmi0("online_info")
    public static final UsersFieldsDto ONLINE_INFO;

    @pmi0("owner_state")
    public static final UsersFieldsDto OWNER_STATE;

    @pmi0("personal")
    public static final UsersFieldsDto PERSONAL;

    @pmi0("photo")
    public static final UsersFieldsDto PHOTO;

    @pmi0("photo_100")
    public static final UsersFieldsDto PHOTO_100;

    @pmi0("photo_200")
    public static final UsersFieldsDto PHOTO_200;

    @pmi0("photo_200_orig")
    public static final UsersFieldsDto PHOTO_200_ORIG;

    @pmi0("photo_400")
    public static final UsersFieldsDto PHOTO_400;

    @pmi0("photo_400_orig")
    public static final UsersFieldsDto PHOTO_400_ORIG;

    @pmi0("photo_50")
    public static final UsersFieldsDto PHOTO_50;

    @pmi0("photo_avg_color")
    public static final UsersFieldsDto PHOTO_AVG_COLOR;

    @pmi0("photo_base")
    public static final UsersFieldsDto PHOTO_BASE;

    @pmi0("photo_big")
    public static final UsersFieldsDto PHOTO_BIG;

    @pmi0("photo_id")
    public static final UsersFieldsDto PHOTO_ID;

    @pmi0("photo_max")
    public static final UsersFieldsDto PHOTO_MAX;

    @pmi0("photo_max_orig")
    public static final UsersFieldsDto PHOTO_MAX_ORIG;

    @pmi0("photo_max_size")
    public static final UsersFieldsDto PHOTO_MAX_SIZE;

    @pmi0("photo_medium")
    public static final UsersFieldsDto PHOTO_MEDIUM;

    @pmi0("photo_medium_rec")
    public static final UsersFieldsDto PHOTO_MEDIUM_REC;

    @pmi0("photo_rec")
    public static final UsersFieldsDto PHOTO_REC;

    @pmi0("places")
    public static final UsersFieldsDto PLACES;

    @pmi0("profile_buttons")
    public static final UsersFieldsDto PROFILE_BUTTONS;

    @pmi0("profile_buttons_tablet")
    public static final UsersFieldsDto PROFILE_BUTTONS_TABLET;

    @pmi0("promotion_allowance")
    public static final UsersFieldsDto PROMOTION_ALLOWANCE;

    @pmi0("quotes")
    public static final UsersFieldsDto QUOTES;

    @pmi0("relation")
    public static final UsersFieldsDto RELATION;

    @pmi0("relatives")
    public static final UsersFieldsDto RELATIVES;

    @pmi0("rights_location")
    public static final UsersFieldsDto RIGHTS_LOCATION;

    @pmi0("schools")
    public static final UsersFieldsDto SCHOOLS;

    @pmi0("screen_name")
    public static final UsersFieldsDto SCREEN_NAME;

    @pmi0("service_description")
    public static final UsersFieldsDto SERVICE_DESCRIPTION;

    @pmi0("sex")
    public static final UsersFieldsDto SEX;

    @pmi0("site")
    public static final UsersFieldsDto SITE;

    @pmi0("social_button_type")
    public static final UsersFieldsDto SOCIAL_BUTTON_TYPE;

    @pmi0("status")
    public static final UsersFieldsDto STATUS;

    @pmi0("stories_archive_count")
    public static final UsersFieldsDto STORIES_ARCHIVE_COUNT;

    @pmi0("subscription_country")
    public static final UsersFieldsDto SUBSCRIPTION_COUNTRY;

    @pmi0("suggest_subscribe")
    public static final UsersFieldsDto SUGGEST_SUBSCRIBE;

    @pmi0("sys_username")
    public static final UsersFieldsDto SYS_USERNAME;

    @pmi0(LoginRequest.CLIENT_NAME)
    public static final UsersFieldsDto TEST;

    @pmi0("third_party_buttons")
    public static final UsersFieldsDto THIRD_PARTY_BUTTONS;

    @pmi0(AnalyticsBaseParamsConstantsKt.TIMEZONE)
    public static final UsersFieldsDto TIMEZONE;

    @pmi0("trending")
    public static final UsersFieldsDto TRENDING;

    @pmi0("tv")
    public static final UsersFieldsDto TV;

    @pmi0("universities")
    public static final UsersFieldsDto UNIVERSITIES;

    @pmi0("verified")
    public static final UsersFieldsDto VERIFIED;

    @pmi0("video_live")
    public static final UsersFieldsDto VIDEO_LIVE;

    @pmi0("video_live_count")
    public static final UsersFieldsDto VIDEO_LIVE_COUNT;

    @pmi0("video_live_level")
    public static final UsersFieldsDto VIDEO_LIVE_LEVEL;

    @pmi0("wall_comments")
    public static final UsersFieldsDto WALL_COMMENTS;

    @pmi0("wall_default")
    public static final UsersFieldsDto WALL_DEFAULT;

    @pmi0("work")
    public static final UsersFieldsDto WORK;
    private final String value;

    /* compiled from: UsersFieldsDto.kt */
    public static final class a implements Parcelable.Creator<UsersFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersFieldsDto createFromParcel(Parcel parcel) {
            return UsersFieldsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UsersFieldsDto[] newArray(int i) {
            return new UsersFieldsDto[i];
        }
    }

    static {
        UsersFieldsDto usersFieldsDto = new UsersFieldsDto("FIRST_NAME_NOM", 0, "first_name_nom");
        FIRST_NAME_NOM = usersFieldsDto;
        UsersFieldsDto usersFieldsDto2 = new UsersFieldsDto("FIRST_NAME_GEN", 1, "first_name_gen");
        FIRST_NAME_GEN = usersFieldsDto2;
        UsersFieldsDto usersFieldsDto3 = new UsersFieldsDto("FIRST_NAME_DAT", 2, "first_name_dat");
        FIRST_NAME_DAT = usersFieldsDto3;
        UsersFieldsDto usersFieldsDto4 = new UsersFieldsDto("FIRST_NAME_ACC", 3, "first_name_acc");
        FIRST_NAME_ACC = usersFieldsDto4;
        UsersFieldsDto usersFieldsDto5 = new UsersFieldsDto("FIRST_NAME_INS", 4, "first_name_ins");
        FIRST_NAME_INS = usersFieldsDto5;
        UsersFieldsDto usersFieldsDto6 = new UsersFieldsDto("FIRST_NAME_ABL", 5, "first_name_abl");
        FIRST_NAME_ABL = usersFieldsDto6;
        UsersFieldsDto usersFieldsDto7 = new UsersFieldsDto("LAST_NAME_NOM", 6, "last_name_nom");
        LAST_NAME_NOM = usersFieldsDto7;
        UsersFieldsDto usersFieldsDto8 = new UsersFieldsDto("LAST_NAME_GEN", 7, "last_name_gen");
        LAST_NAME_GEN = usersFieldsDto8;
        UsersFieldsDto usersFieldsDto9 = new UsersFieldsDto("LAST_NAME_DAT", 8, "last_name_dat");
        LAST_NAME_DAT = usersFieldsDto9;
        UsersFieldsDto usersFieldsDto10 = new UsersFieldsDto("LAST_NAME_ACC", 9, "last_name_acc");
        LAST_NAME_ACC = usersFieldsDto10;
        UsersFieldsDto usersFieldsDto11 = new UsersFieldsDto("LAST_NAME_INS", 10, "last_name_ins");
        LAST_NAME_INS = usersFieldsDto11;
        UsersFieldsDto usersFieldsDto12 = new UsersFieldsDto("LAST_NAME_ABL", 11, "last_name_abl");
        LAST_NAME_ABL = usersFieldsDto12;
        UsersFieldsDto usersFieldsDto13 = new UsersFieldsDto("PHOTO_ID", 12, "photo_id");
        PHOTO_ID = usersFieldsDto13;
        UsersFieldsDto usersFieldsDto14 = new UsersFieldsDto("VERIFIED", 13, "verified");
        VERIFIED = usersFieldsDto14;
        UsersFieldsDto usersFieldsDto15 = new UsersFieldsDto("SEX", 14, "sex");
        SEX = usersFieldsDto15;
        UsersFieldsDto usersFieldsDto16 = new UsersFieldsDto("BDATE", 15, "bdate");
        BDATE = usersFieldsDto16;
        UsersFieldsDto usersFieldsDto17 = new UsersFieldsDto("BIRTHDATE", 16, "birthdate");
        BIRTHDATE = usersFieldsDto17;
        UsersFieldsDto usersFieldsDto18 = new UsersFieldsDto("BDATE_VISIBILITY", 17, "bdate_visibility");
        BDATE_VISIBILITY = usersFieldsDto18;
        UsersFieldsDto usersFieldsDto19 = new UsersFieldsDto("CITY", 18, "city");
        CITY = usersFieldsDto19;
        UsersFieldsDto usersFieldsDto20 = new UsersFieldsDto("COUNTRY", 19, "country");
        COUNTRY = usersFieldsDto20;
        UsersFieldsDto usersFieldsDto21 = new UsersFieldsDto("HOME_TOWN", 20, "home_town");
        HOME_TOWN = usersFieldsDto21;
        UsersFieldsDto usersFieldsDto22 = new UsersFieldsDto("HAS_PHOTO", 21, "has_photo");
        HAS_PHOTO = usersFieldsDto22;
        UsersFieldsDto usersFieldsDto23 = new UsersFieldsDto("PHOTO", 22, "photo");
        PHOTO = usersFieldsDto23;
        UsersFieldsDto usersFieldsDto24 = new UsersFieldsDto("PHOTO_REC", 23, "photo_rec");
        PHOTO_REC = usersFieldsDto24;
        UsersFieldsDto usersFieldsDto25 = new UsersFieldsDto("PHOTO_50", 24, "photo_50");
        PHOTO_50 = usersFieldsDto25;
        UsersFieldsDto usersFieldsDto26 = new UsersFieldsDto("PHOTO_100", 25, "photo_100");
        PHOTO_100 = usersFieldsDto26;
        UsersFieldsDto usersFieldsDto27 = new UsersFieldsDto("PHOTO_200_ORIG", 26, "photo_200_orig");
        PHOTO_200_ORIG = usersFieldsDto27;
        UsersFieldsDto usersFieldsDto28 = new UsersFieldsDto("PHOTO_200", 27, "photo_200");
        PHOTO_200 = usersFieldsDto28;
        UsersFieldsDto usersFieldsDto29 = new UsersFieldsDto("PHOTO_400", 28, "photo_400");
        PHOTO_400 = usersFieldsDto29;
        UsersFieldsDto usersFieldsDto30 = new UsersFieldsDto("PHOTO_400_ORIG", 29, "photo_400_orig");
        PHOTO_400_ORIG = usersFieldsDto30;
        UsersFieldsDto usersFieldsDto31 = new UsersFieldsDto("PHOTO_BIG", 30, "photo_big");
        PHOTO_BIG = usersFieldsDto31;
        UsersFieldsDto usersFieldsDto32 = new UsersFieldsDto("PHOTO_MEDIUM", 31, "photo_medium");
        PHOTO_MEDIUM = usersFieldsDto32;
        UsersFieldsDto usersFieldsDto33 = new UsersFieldsDto("PHOTO_MEDIUM_REC", 32, "photo_medium_rec");
        PHOTO_MEDIUM_REC = usersFieldsDto33;
        UsersFieldsDto usersFieldsDto34 = new UsersFieldsDto("PHOTO_MAX", 33, "photo_max");
        PHOTO_MAX = usersFieldsDto34;
        UsersFieldsDto usersFieldsDto35 = new UsersFieldsDto("PHOTO_MAX_ORIG", 34, "photo_max_orig");
        PHOTO_MAX_ORIG = usersFieldsDto35;
        UsersFieldsDto usersFieldsDto36 = new UsersFieldsDto("PHOTO_MAX_SIZE", 35, "photo_max_size");
        PHOTO_MAX_SIZE = usersFieldsDto36;
        UsersFieldsDto usersFieldsDto37 = new UsersFieldsDto("PHOTO_AVG_COLOR", 36, "photo_avg_color");
        PHOTO_AVG_COLOR = usersFieldsDto37;
        UsersFieldsDto usersFieldsDto38 = new UsersFieldsDto("PHOTO_BASE", 37, "photo_base");
        PHOTO_BASE = usersFieldsDto38;
        UsersFieldsDto usersFieldsDto39 = new UsersFieldsDto("COVER", 38, "cover");
        COVER = usersFieldsDto39;
        UsersFieldsDto usersFieldsDto40 = new UsersFieldsDto("PROFILE_BUTTONS", 39, "profile_buttons");
        PROFILE_BUTTONS = usersFieldsDto40;
        UsersFieldsDto usersFieldsDto41 = new UsersFieldsDto("PROFILE_BUTTONS_TABLET", 40, "profile_buttons_tablet");
        PROFILE_BUTTONS_TABLET = usersFieldsDto41;
        UsersFieldsDto usersFieldsDto42 = new UsersFieldsDto("THIRD_PARTY_BUTTONS", 41, "third_party_buttons");
        THIRD_PARTY_BUTTONS = usersFieldsDto42;
        UsersFieldsDto usersFieldsDto43 = new UsersFieldsDto("ONLINE", 42, eok.ONLINE_EXTRAS_KEY);
        ONLINE = usersFieldsDto43;
        UsersFieldsDto usersFieldsDto44 = new UsersFieldsDto("LISTS", 43, "lists");
        LISTS = usersFieldsDto44;
        UsersFieldsDto usersFieldsDto45 = new UsersFieldsDto("DOMAIN", 44, X3.j.D);
        DOMAIN = usersFieldsDto45;
        UsersFieldsDto usersFieldsDto46 = new UsersFieldsDto("HAS_MOBILE", 45, "has_mobile");
        HAS_MOBILE = usersFieldsDto46;
        UsersFieldsDto usersFieldsDto47 = new UsersFieldsDto("CONTACTS", 46, "contacts");
        CONTACTS = usersFieldsDto47;
        UsersFieldsDto usersFieldsDto48 = new UsersFieldsDto("LANG", 47, "lang");
        LANG = usersFieldsDto48;
        UsersFieldsDto usersFieldsDto49 = new UsersFieldsDto("LANGUAGE", 48, "language");
        LANGUAGE = usersFieldsDto49;
        UsersFieldsDto usersFieldsDto50 = new UsersFieldsDto("CAN_CALL", 49, "can_call");
        CAN_CALL = usersFieldsDto50;
        UsersFieldsDto usersFieldsDto51 = new UsersFieldsDto("SITE", 50, "site");
        SITE = usersFieldsDto51;
        UsersFieldsDto usersFieldsDto52 = new UsersFieldsDto("EDUCATION", 51, "education");
        EDUCATION = usersFieldsDto52;
        UsersFieldsDto usersFieldsDto53 = new UsersFieldsDto("UNIVERSITIES", 52, "universities");
        UNIVERSITIES = usersFieldsDto53;
        UsersFieldsDto usersFieldsDto54 = new UsersFieldsDto("SCHOOLS", 53, "schools");
        SCHOOLS = usersFieldsDto54;
        UsersFieldsDto usersFieldsDto55 = new UsersFieldsDto(CommonConstant.RETKEY.STATUS, 54, "status");
        STATUS = usersFieldsDto55;
        UsersFieldsDto usersFieldsDto56 = new UsersFieldsDto("LAST_SEEN", 55, "last_seen");
        LAST_SEEN = usersFieldsDto56;
        UsersFieldsDto usersFieldsDto57 = new UsersFieldsDto("FOLLOWERS_COUNT", 56, "followers_count");
        FOLLOWERS_COUNT = usersFieldsDto57;
        UsersFieldsDto usersFieldsDto58 = new UsersFieldsDto("COUNTERS", 57, "counters");
        COUNTERS = usersFieldsDto58;
        UsersFieldsDto usersFieldsDto59 = new UsersFieldsDto("COMMON_COUNT", 58, "common_count");
        COMMON_COUNT = usersFieldsDto59;
        UsersFieldsDto usersFieldsDto60 = new UsersFieldsDto("ONLINE_INFO", 59, "online_info");
        ONLINE_INFO = usersFieldsDto60;
        UsersFieldsDto usersFieldsDto61 = new UsersFieldsDto("CONTACT_NAME", 60, "contact_name");
        CONTACT_NAME = usersFieldsDto61;
        UsersFieldsDto usersFieldsDto62 = new UsersFieldsDto("CONTACT_ID", 61, "contact_id");
        CONTACT_ID = usersFieldsDto62;
        UsersFieldsDto usersFieldsDto63 = new UsersFieldsDto("OCCUPATION", 62, "occupation");
        OCCUPATION = usersFieldsDto63;
        UsersFieldsDto usersFieldsDto64 = new UsersFieldsDto("NICKNAME", 63, "nickname");
        NICKNAME = usersFieldsDto64;
        UsersFieldsDto usersFieldsDto65 = new UsersFieldsDto("RELATIVES", 64, "relatives");
        RELATIVES = usersFieldsDto65;
        UsersFieldsDto usersFieldsDto66 = new UsersFieldsDto("RELATION", 65, "relation");
        RELATION = usersFieldsDto66;
        UsersFieldsDto usersFieldsDto67 = new UsersFieldsDto("PERSONAL", 66, "personal");
        PERSONAL = usersFieldsDto67;
        UsersFieldsDto usersFieldsDto68 = new UsersFieldsDto("CONNECTIONS", 67, "connections");
        CONNECTIONS = usersFieldsDto68;
        UsersFieldsDto usersFieldsDto69 = new UsersFieldsDto("EXPORTS", 68, "exports");
        EXPORTS = usersFieldsDto69;
        UsersFieldsDto usersFieldsDto70 = new UsersFieldsDto("WALL_COMMENTS", 69, "wall_comments");
        WALL_COMMENTS = usersFieldsDto70;
        UsersFieldsDto usersFieldsDto71 = new UsersFieldsDto("WALL_DEFAULT", 70, "wall_default");
        WALL_DEFAULT = usersFieldsDto71;
        UsersFieldsDto usersFieldsDto72 = new UsersFieldsDto("IS_STUDENT", 71, "is_student");
        IS_STUDENT = usersFieldsDto72;
        UsersFieldsDto usersFieldsDto73 = new UsersFieldsDto("ACTIVITIES", 72, "activities");
        ACTIVITIES = usersFieldsDto73;
        UsersFieldsDto usersFieldsDto74 = new UsersFieldsDto("ACTIVITY", 73, "activity");
        ACTIVITY = usersFieldsDto74;
        UsersFieldsDto usersFieldsDto75 = new UsersFieldsDto("INTERESTS", 74, "interests");
        INTERESTS = usersFieldsDto75;
        UsersFieldsDto usersFieldsDto76 = new UsersFieldsDto("IMAGE_STATUS", 75, "image_status");
        IMAGE_STATUS = usersFieldsDto76;
        UsersFieldsDto usersFieldsDto77 = new UsersFieldsDto("MUSIC", 76, "music");
        MUSIC = usersFieldsDto77;
        UsersFieldsDto usersFieldsDto78 = new UsersFieldsDto("MUSIC_AWARDS", 77, "music_awards");
        MUSIC_AWARDS = usersFieldsDto78;
        UsersFieldsDto usersFieldsDto79 = new UsersFieldsDto("MOVIES", 78, "movies");
        MOVIES = usersFieldsDto79;
        UsersFieldsDto usersFieldsDto80 = new UsersFieldsDto("TV", 79, "tv");
        TV = usersFieldsDto80;
        UsersFieldsDto usersFieldsDto81 = new UsersFieldsDto("BOOKS", 80, "books");
        BOOKS = usersFieldsDto81;
        UsersFieldsDto usersFieldsDto82 = new UsersFieldsDto("BUTTONS", 81, "buttons");
        BUTTONS = usersFieldsDto82;
        UsersFieldsDto usersFieldsDto83 = new UsersFieldsDto("IS_NO_INDEX", 82, "is_no_index");
        IS_NO_INDEX = usersFieldsDto83;
        UsersFieldsDto usersFieldsDto84 = new UsersFieldsDto("NO_INDEX", 83, "no_index");
        NO_INDEX = usersFieldsDto84;
        UsersFieldsDto usersFieldsDto85 = new UsersFieldsDto("GAMES", 84, "games");
        GAMES = usersFieldsDto85;
        UsersFieldsDto usersFieldsDto86 = new UsersFieldsDto("ABOUT", 85, "about");
        ABOUT = usersFieldsDto86;
        UsersFieldsDto usersFieldsDto87 = new UsersFieldsDto("QUOTES", 86, "quotes");
        QUOTES = usersFieldsDto87;
        UsersFieldsDto usersFieldsDto88 = new UsersFieldsDto("CAN_POST", 87, "can_post");
        CAN_POST = usersFieldsDto88;
        UsersFieldsDto usersFieldsDto89 = new UsersFieldsDto("CAN_SEE_ALL_POSTS", 88, "can_see_all_posts");
        CAN_SEE_ALL_POSTS = usersFieldsDto89;
        UsersFieldsDto usersFieldsDto90 = new UsersFieldsDto("CAN_SEE_AUDIO", 89, "can_see_audio");
        CAN_SEE_AUDIO = usersFieldsDto90;
        UsersFieldsDto usersFieldsDto91 = new UsersFieldsDto("CAN_SEE_GIFTS", 90, "can_see_gifts");
        CAN_SEE_GIFTS = usersFieldsDto91;
        UsersFieldsDto usersFieldsDto92 = new UsersFieldsDto("WORK", 91, "work");
        WORK = usersFieldsDto92;
        UsersFieldsDto usersFieldsDto93 = new UsersFieldsDto("PLACES", 92, "places");
        PLACES = usersFieldsDto93;
        UsersFieldsDto usersFieldsDto94 = new UsersFieldsDto("CAN_WRITE_PRIVATE_MESSAGE", 93, "can_write_private_message");
        CAN_WRITE_PRIVATE_MESSAGE = usersFieldsDto94;
        UsersFieldsDto usersFieldsDto95 = new UsersFieldsDto("CAN_SEND_FRIEND_REQUEST", 94, "can_send_friend_request");
        CAN_SEND_FRIEND_REQUEST = usersFieldsDto95;
        UsersFieldsDto usersFieldsDto96 = new UsersFieldsDto("CAN_BE_INVITED_GROUP", 95, "can_be_invited_group");
        CAN_BE_INVITED_GROUP = usersFieldsDto96;
        UsersFieldsDto usersFieldsDto97 = new UsersFieldsDto("CAN_UPLOAD_DOC", 96, "can_upload_doc");
        CAN_UPLOAD_DOC = usersFieldsDto97;
        UsersFieldsDto usersFieldsDto98 = new UsersFieldsDto("CAN_BAN", 97, "can_ban");
        CAN_BAN = usersFieldsDto98;
        UsersFieldsDto usersFieldsDto99 = new UsersFieldsDto("IS_FAVORITE", 98, "is_favorite");
        IS_FAVORITE = usersFieldsDto99;
        UsersFieldsDto usersFieldsDto100 = new UsersFieldsDto("IS_HIDDEN_FROM_FEED", 99, "is_hidden_from_feed");
        IS_HIDDEN_FROM_FEED = usersFieldsDto100;
        UsersFieldsDto usersFieldsDto101 = new UsersFieldsDto("TIMEZONE", 100, AnalyticsBaseParamsConstantsKt.TIMEZONE);
        TIMEZONE = usersFieldsDto101;
        UsersFieldsDto usersFieldsDto102 = new UsersFieldsDto("SCREEN_NAME", 101, "screen_name");
        SCREEN_NAME = usersFieldsDto102;
        UsersFieldsDto usersFieldsDto103 = new UsersFieldsDto("MAIDEN_NAME", 102, "maiden_name");
        MAIDEN_NAME = usersFieldsDto103;
        UsersFieldsDto usersFieldsDto104 = new UsersFieldsDto("CROP_PHOTO", 103, "crop_photo");
        CROP_PHOTO = usersFieldsDto104;
        UsersFieldsDto usersFieldsDto105 = new UsersFieldsDto("IS_FRIEND", 104, "is_friend");
        IS_FRIEND = usersFieldsDto105;
        UsersFieldsDto usersFieldsDto106 = new UsersFieldsDto("IS_BEST_FRIEND", 105, "is_best_friend");
        IS_BEST_FRIEND = usersFieldsDto106;
        UsersFieldsDto usersFieldsDto107 = new UsersFieldsDto("FRIEND_STATUS", Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, "friend_status");
        FRIEND_STATUS = usersFieldsDto107;
        UsersFieldsDto usersFieldsDto108 = new UsersFieldsDto("CAREER", ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, "career");
        CAREER = usersFieldsDto108;
        UsersFieldsDto usersFieldsDto109 = new UsersFieldsDto("MILITARY", 108, "military");
        MILITARY = usersFieldsDto109;
        UsersFieldsDto usersFieldsDto110 = new UsersFieldsDto("BLACKLISTED", 109, "blacklisted");
        BLACKLISTED = usersFieldsDto110;
        UsersFieldsDto usersFieldsDto111 = new UsersFieldsDto("BLACKLISTED_BY_ME", 110, "blacklisted_by_me");
        BLACKLISTED_BY_ME = usersFieldsDto111;
        UsersFieldsDto usersFieldsDto112 = new UsersFieldsDto("CAN_SUBSCRIBE_POSTS", 111, "can_subscribe_posts");
        CAN_SUBSCRIBE_POSTS = usersFieldsDto112;
        UsersFieldsDto usersFieldsDto113 = new UsersFieldsDto("DESCRIPTIONS", 112, "descriptions");
        DESCRIPTIONS = usersFieldsDto113;
        UsersFieldsDto usersFieldsDto114 = new UsersFieldsDto("TRENDING", 113, "trending");
        TRENDING = usersFieldsDto114;
        UsersFieldsDto usersFieldsDto115 = new UsersFieldsDto("MUTUAL", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, "mutual");
        MUTUAL = usersFieldsDto115;
        UsersFieldsDto usersFieldsDto116 = new UsersFieldsDto("FRIENDSHIP_WEEKS", Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, "friendship_weeks");
        FRIENDSHIP_WEEKS = usersFieldsDto116;
        UsersFieldsDto usersFieldsDto117 = new UsersFieldsDto("CAN_INVITE_TO_CHATS", 116, "can_invite_to_chats");
        CAN_INVITE_TO_CHATS = usersFieldsDto117;
        UsersFieldsDto usersFieldsDto118 = new UsersFieldsDto("STORIES_ARCHIVE_COUNT", Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, "stories_archive_count");
        STORIES_ARCHIVE_COUNT = usersFieldsDto118;
        UsersFieldsDto usersFieldsDto119 = new UsersFieldsDto("HAS_UNSEEN_STORIES", Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, "has_unseen_stories");
        HAS_UNSEEN_STORIES = usersFieldsDto119;
        UsersFieldsDto usersFieldsDto120 = new UsersFieldsDto("VIDEO_LIVE", Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, "video_live");
        VIDEO_LIVE = usersFieldsDto120;
        UsersFieldsDto usersFieldsDto121 = new UsersFieldsDto("VIDEO_LIVE_LEVEL", 120, "video_live_level");
        VIDEO_LIVE_LEVEL = usersFieldsDto121;
        UsersFieldsDto usersFieldsDto122 = new UsersFieldsDto("VIDEO_LIVE_COUNT", Sdk.SDKError.Reason.TPAT_ERROR_VALUE, "video_live_count");
        VIDEO_LIVE_COUNT = usersFieldsDto122;
        UsersFieldsDto usersFieldsDto123 = new UsersFieldsDto("CLIPS_COUNT", Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, "clips_count");
        CLIPS_COUNT = usersFieldsDto123;
        UsersFieldsDto usersFieldsDto124 = new UsersFieldsDto("SERVICE_DESCRIPTION", 123, "service_description");
        SERVICE_DESCRIPTION = usersFieldsDto124;
        UsersFieldsDto usersFieldsDto125 = new UsersFieldsDto("IS_DEAD", Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, "is_dead");
        IS_DEAD = usersFieldsDto125;
        UsersFieldsDto usersFieldsDto126 = new UsersFieldsDto("TEST", 125, LoginRequest.CLIENT_NAME);
        TEST = usersFieldsDto126;
        UsersFieldsDto usersFieldsDto127 = new UsersFieldsDto("GIFTS_TOOLTIP", Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, "gifts_tooltip");
        GIFTS_TOOLTIP = usersFieldsDto127;
        UsersFieldsDto usersFieldsDto128 = new UsersFieldsDto("EMOJI_STATUS", 127, "emoji_status");
        EMOJI_STATUS = usersFieldsDto128;
        UsersFieldsDto usersFieldsDto129 = new UsersFieldsDto("CAN_CALL_FROM_GROUP", 128, "can_call_from_group");
        CAN_CALL_FROM_GROUP = usersFieldsDto129;
        UsersFieldsDto usersFieldsDto130 = new UsersFieldsDto("CAN_SEE_WISHES", 129, "can_see_wishes");
        CAN_SEE_WISHES = usersFieldsDto130;
        UsersFieldsDto usersFieldsDto131 = new UsersFieldsDto("IS_VIDEO_LIVE_NOTIFICATIONS_BLOCKED", 130, "is_video_live_notifications_blocked");
        IS_VIDEO_LIVE_NOTIFICATIONS_BLOCKED = usersFieldsDto131;
        UsersFieldsDto usersFieldsDto132 = new UsersFieldsDto("IS_ADULT", Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, "is_adult");
        IS_ADULT = usersFieldsDto132;
        UsersFieldsDto usersFieldsDto133 = new UsersFieldsDto("IS_SUBSCRIBED", Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, "is_subscribed");
        IS_SUBSCRIBED = usersFieldsDto133;
        UsersFieldsDto usersFieldsDto134 = new UsersFieldsDto("IS_SUBSCRIBED_STORIES", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "is_subscribed_stories");
        IS_SUBSCRIBED_STORIES = usersFieldsDto134;
        UsersFieldsDto usersFieldsDto135 = new UsersFieldsDto("CAN_SUBSCRIBE_STORIES", 134, "can_subscribe_stories");
        CAN_SUBSCRIBE_STORIES = usersFieldsDto135;
        UsersFieldsDto usersFieldsDto136 = new UsersFieldsDto("CAN_ASK_QUESTION", 135, "can_ask_question");
        CAN_ASK_QUESTION = usersFieldsDto136;
        UsersFieldsDto usersFieldsDto137 = new UsersFieldsDto("CAN_ASK_ANONYMOUS", Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, "can_ask_anonymous");
        CAN_ASK_ANONYMOUS = usersFieldsDto137;
        UsersFieldsDto usersFieldsDto138 = new UsersFieldsDto("IS_SUBSCRIBED_PODCASTS", Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "is_subscribed_podcasts");
        IS_SUBSCRIBED_PODCASTS = usersFieldsDto138;
        UsersFieldsDto usersFieldsDto139 = new UsersFieldsDto("CAN_SUBSCRIBE_PODCASTS", 138, "can_subscribe_podcasts");
        CAN_SUBSCRIBE_PODCASTS = usersFieldsDto139;
        UsersFieldsDto usersFieldsDto140 = new UsersFieldsDto("SUBSCRIPTION_COUNTRY", 139, "subscription_country");
        SUBSCRIPTION_COUNTRY = usersFieldsDto140;
        UsersFieldsDto usersFieldsDto141 = new UsersFieldsDto("HAS_EMAIL", VersionConstants.PRODUCT_MAJOR_VERSION, "has_email");
        HAS_EMAIL = usersFieldsDto141;
        UsersFieldsDto usersFieldsDto142 = new UsersFieldsDto("HAS_RIGHTS", 141, "has_rights");
        HAS_RIGHTS = usersFieldsDto142;
        UsersFieldsDto usersFieldsDto143 = new UsersFieldsDto("SYS_USERNAME", 142, "sys_username");
        SYS_USERNAME = usersFieldsDto143;
        UsersFieldsDto usersFieldsDto144 = new UsersFieldsDto("EMPLOYEE_MARK", 143, "employee_mark");
        EMPLOYEE_MARK = usersFieldsDto144;
        UsersFieldsDto usersFieldsDto145 = new UsersFieldsDto("EMPLOYEE_WORKING_STATE", 144, "employee_working_state");
        EMPLOYEE_WORKING_STATE = usersFieldsDto145;
        UsersFieldsDto usersFieldsDto146 = new UsersFieldsDto("RIGHTS_LOCATION", 145, "rights_location");
        RIGHTS_LOCATION = usersFieldsDto146;
        UsersFieldsDto usersFieldsDto147 = new UsersFieldsDto("CAN_NOT_CALL_REASON", 146, "can_not_call_reason");
        CAN_NOT_CALL_REASON = usersFieldsDto147;
        UsersFieldsDto usersFieldsDto148 = new UsersFieldsDto("CAN_CALL_AS_COMMUNITY", 147, "can_call_as_community");
        CAN_CALL_AS_COMMUNITY = usersFieldsDto148;
        UsersFieldsDto usersFieldsDto149 = new UsersFieldsDto("IS_NFT", 148, "is_nft");
        IS_NFT = usersFieldsDto149;
        UsersFieldsDto usersFieldsDto150 = new UsersFieldsDto("ANIMATED_AVATAR", 149, "animated_avatar");
        ANIMATED_AVATAR = usersFieldsDto150;
        UsersFieldsDto usersFieldsDto151 = new UsersFieldsDto("OWNER_STATE", 150, "owner_state");
        OWNER_STATE = usersFieldsDto151;
        UsersFieldsDto usersFieldsDto152 = new UsersFieldsDto("IS_ESIA_VERIFIED", 151, "is_esia_verified");
        IS_ESIA_VERIFIED = usersFieldsDto152;
        UsersFieldsDto usersFieldsDto153 = new UsersFieldsDto("IS_ESIA_LINKED", 152, "is_esia_linked");
        IS_ESIA_LINKED = usersFieldsDto153;
        UsersFieldsDto usersFieldsDto154 = new UsersFieldsDto("IS_TINKOFF_LINKED", 153, "is_tinkoff_linked");
        IS_TINKOFF_LINKED = usersFieldsDto154;
        UsersFieldsDto usersFieldsDto155 = new UsersFieldsDto("IS_TINKOFF_VERIFIED", 154, "is_tinkoff_verified");
        IS_TINKOFF_VERIFIED = usersFieldsDto155;
        UsersFieldsDto usersFieldsDto156 = new UsersFieldsDto("IS_SBER_VERIFIED", 155, "is_sber_verified");
        IS_SBER_VERIFIED = usersFieldsDto156;
        UsersFieldsDto usersFieldsDto157 = new UsersFieldsDto("IS_VERIFIED", 156, "is_verified");
        IS_VERIFIED = usersFieldsDto157;
        UsersFieldsDto usersFieldsDto158 = new UsersFieldsDto("IS_FOLLOWERS_MODE_ON", 157, "is_followers_mode_on");
        IS_FOLLOWERS_MODE_ON = usersFieldsDto158;
        UsersFieldsDto usersFieldsDto159 = new UsersFieldsDto("SOCIAL_BUTTON_TYPE", 158, "social_button_type");
        SOCIAL_BUTTON_TYPE = usersFieldsDto159;
        UsersFieldsDto usersFieldsDto160 = new UsersFieldsDto("CUSTOM_NAMES_FOR_CALLS", 159, "custom_names_for_calls");
        CUSTOM_NAMES_FOR_CALLS = usersFieldsDto160;
        UsersFieldsDto usersFieldsDto161 = new UsersFieldsDto(NativeAdContent.ViewTag.AD_DESCRIPTION, 160, "description");
        DESCRIPTION = usersFieldsDto161;
        UsersFieldsDto usersFieldsDto162 = new UsersFieldsDto("IS_TEACHER", 161, "is_teacher");
        IS_TEACHER = usersFieldsDto162;
        UsersFieldsDto usersFieldsDto163 = new UsersFieldsDto("OAUTH_LINKED", 162, "oauth_linked");
        OAUTH_LINKED = usersFieldsDto163;
        UsersFieldsDto usersFieldsDto164 = new UsersFieldsDto("OAUTH_VERIFICATION", 163, "oauth_verification");
        OAUTH_VERIFICATION = usersFieldsDto164;
        UsersFieldsDto usersFieldsDto165 = new UsersFieldsDto("IS_SBER_LINKED", 164, "is_sber_linked");
        IS_SBER_LINKED = usersFieldsDto165;
        UsersFieldsDto usersFieldsDto166 = new UsersFieldsDto("AGE_MARK", 165, "age_mark");
        AGE_MARK = usersFieldsDto166;
        UsersFieldsDto usersFieldsDto167 = new UsersFieldsDto("JOINED", 166, "joined");
        JOINED = usersFieldsDto167;
        UsersFieldsDto usersFieldsDto168 = new UsersFieldsDto("IS_PERSONAL_ADS_EASY_PROMOTE_ENABLED", 167, "is_personal_ads_easy_promote_enabled");
        IS_PERSONAL_ADS_EASY_PROMOTE_ENABLED = usersFieldsDto168;
        UsersFieldsDto usersFieldsDto169 = new UsersFieldsDto("NEED_BIG_MSG_BTN_IN_PROFILE", 168, "need_big_msg_btn_in_profile");
        NEED_BIG_MSG_BTN_IN_PROFILE = usersFieldsDto169;
        UsersFieldsDto usersFieldsDto170 = new UsersFieldsDto("IS_SERVICE_ACCOUNT", 169, "is_service_account");
        IS_SERVICE_ACCOUNT = usersFieldsDto170;
        UsersFieldsDto usersFieldsDto171 = new UsersFieldsDto("PROMOTION_ALLOWANCE", 170, "promotion_allowance");
        PROMOTION_ALLOWANCE = usersFieldsDto171;
        UsersFieldsDto usersFieldsDto172 = new UsersFieldsDto("CAN_INVITE_AS_VOICEROOMS_SPEAKER", 171, "can_invite_as_voicerooms_speaker");
        CAN_INVITE_AS_VOICEROOMS_SPEAKER = usersFieldsDto172;
        UsersFieldsDto usersFieldsDto173 = new UsersFieldsDto("CO_OWNERSHIP_ENABLED", 172, "co_ownership_enabled");
        CO_OWNERSHIP_ENABLED = usersFieldsDto173;
        UsersFieldsDto usersFieldsDto174 = new UsersFieldsDto("EDU_ROLES", 173, "edu_roles");
        EDU_ROLES = usersFieldsDto174;
        UsersFieldsDto usersFieldsDto175 = new UsersFieldsDto("AGE_GROUP", 174, "age_group");
        AGE_GROUP = usersFieldsDto175;
        UsersFieldsDto usersFieldsDto176 = new UsersFieldsDto("HAS_RELATED_USER_PIN", 175, "has_related_user_pin");
        HAS_RELATED_USER_PIN = usersFieldsDto176;
        UsersFieldsDto usersFieldsDto177 = new UsersFieldsDto("EDUCATIONAL_PROFILE", 176, "educational_profile");
        EDUCATIONAL_PROFILE = usersFieldsDto177;
        UsersFieldsDto usersFieldsDto178 = new UsersFieldsDto("A_PLUS_MARK", 177, "a_plus_mark");
        A_PLUS_MARK = usersFieldsDto178;
        UsersFieldsDto usersFieldsDto179 = new UsersFieldsDto("IS_DON", 178, "is_don");
        IS_DON = usersFieldsDto179;
        UsersFieldsDto usersFieldsDto180 = new UsersFieldsDto("IS_MEDIA_MODER", 179, "is_media_moder");
        IS_MEDIA_MODER = usersFieldsDto180;
        UsersFieldsDto usersFieldsDto181 = new UsersFieldsDto("IS_PHOTO_MAP_ENABLED", 180, "is_photo_map_enabled");
        IS_PHOTO_MAP_ENABLED = usersFieldsDto181;
        UsersFieldsDto usersFieldsDto182 = new UsersFieldsDto("DONUT", 181, "donut");
        DONUT = usersFieldsDto182;
        UsersFieldsDto usersFieldsDto183 = new UsersFieldsDto("SUGGEST_SUBSCRIBE", 182, "suggest_subscribe");
        SUGGEST_SUBSCRIBE = usersFieldsDto183;
        UsersFieldsDto[] usersFieldsDtoArr = {usersFieldsDto, usersFieldsDto2, usersFieldsDto3, usersFieldsDto4, usersFieldsDto5, usersFieldsDto6, usersFieldsDto7, usersFieldsDto8, usersFieldsDto9, usersFieldsDto10, usersFieldsDto11, usersFieldsDto12, usersFieldsDto13, usersFieldsDto14, usersFieldsDto15, usersFieldsDto16, usersFieldsDto17, usersFieldsDto18, usersFieldsDto19, usersFieldsDto20, usersFieldsDto21, usersFieldsDto22, usersFieldsDto23, usersFieldsDto24, usersFieldsDto25, usersFieldsDto26, usersFieldsDto27, usersFieldsDto28, usersFieldsDto29, usersFieldsDto30, usersFieldsDto31, usersFieldsDto32, usersFieldsDto33, usersFieldsDto34, usersFieldsDto35, usersFieldsDto36, usersFieldsDto37, usersFieldsDto38, usersFieldsDto39, usersFieldsDto40, usersFieldsDto41, usersFieldsDto42, usersFieldsDto43, usersFieldsDto44, usersFieldsDto45, usersFieldsDto46, usersFieldsDto47, usersFieldsDto48, usersFieldsDto49, usersFieldsDto50, usersFieldsDto51, usersFieldsDto52, usersFieldsDto53, usersFieldsDto54, usersFieldsDto55, usersFieldsDto56, usersFieldsDto57, usersFieldsDto58, usersFieldsDto59, usersFieldsDto60, usersFieldsDto61, usersFieldsDto62, usersFieldsDto63, usersFieldsDto64, usersFieldsDto65, usersFieldsDto66, usersFieldsDto67, usersFieldsDto68, usersFieldsDto69, usersFieldsDto70, usersFieldsDto71, usersFieldsDto72, usersFieldsDto73, usersFieldsDto74, usersFieldsDto75, usersFieldsDto76, usersFieldsDto77, usersFieldsDto78, usersFieldsDto79, usersFieldsDto80, usersFieldsDto81, usersFieldsDto82, usersFieldsDto83, usersFieldsDto84, usersFieldsDto85, usersFieldsDto86, usersFieldsDto87, usersFieldsDto88, usersFieldsDto89, usersFieldsDto90, usersFieldsDto91, usersFieldsDto92, usersFieldsDto93, usersFieldsDto94, usersFieldsDto95, usersFieldsDto96, usersFieldsDto97, usersFieldsDto98, usersFieldsDto99, usersFieldsDto100, usersFieldsDto101, usersFieldsDto102, usersFieldsDto103, usersFieldsDto104, usersFieldsDto105, usersFieldsDto106, usersFieldsDto107, usersFieldsDto108, usersFieldsDto109, usersFieldsDto110, usersFieldsDto111, usersFieldsDto112, usersFieldsDto113, usersFieldsDto114, usersFieldsDto115, usersFieldsDto116, usersFieldsDto117, usersFieldsDto118, usersFieldsDto119, usersFieldsDto120, usersFieldsDto121, usersFieldsDto122, usersFieldsDto123, usersFieldsDto124, usersFieldsDto125, usersFieldsDto126, usersFieldsDto127, usersFieldsDto128, usersFieldsDto129, usersFieldsDto130, usersFieldsDto131, usersFieldsDto132, usersFieldsDto133, usersFieldsDto134, usersFieldsDto135, usersFieldsDto136, usersFieldsDto137, usersFieldsDto138, usersFieldsDto139, usersFieldsDto140, usersFieldsDto141, usersFieldsDto142, usersFieldsDto143, usersFieldsDto144, usersFieldsDto145, usersFieldsDto146, usersFieldsDto147, usersFieldsDto148, usersFieldsDto149, usersFieldsDto150, usersFieldsDto151, usersFieldsDto152, usersFieldsDto153, usersFieldsDto154, usersFieldsDto155, usersFieldsDto156, usersFieldsDto157, usersFieldsDto158, usersFieldsDto159, usersFieldsDto160, usersFieldsDto161, usersFieldsDto162, usersFieldsDto163, usersFieldsDto164, usersFieldsDto165, usersFieldsDto166, usersFieldsDto167, usersFieldsDto168, usersFieldsDto169, usersFieldsDto170, usersFieldsDto171, usersFieldsDto172, usersFieldsDto173, usersFieldsDto174, usersFieldsDto175, usersFieldsDto176, usersFieldsDto177, usersFieldsDto178, usersFieldsDto179, usersFieldsDto180, usersFieldsDto181, usersFieldsDto182, usersFieldsDto183};
        $VALUES = usersFieldsDtoArr;
        $ENTRIES = new asp(usersFieldsDtoArr);
        CREATOR = new a();
    }

    private UsersFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static UsersFieldsDto valueOf(String str) {
        return (UsersFieldsDto) Enum.valueOf(UsersFieldsDto.class, str);
    }

    public static UsersFieldsDto[] values() {
        return (UsersFieldsDto[]) $VALUES.clone();
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
