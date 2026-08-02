package com.vk.sdk.api.base.dto;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.X3;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.asp;
import xsna.eok;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BaseUserGroupFieldsDto.kt */
/* loaded from: classes5.dex */
public final class BaseUserGroupFieldsDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BaseUserGroupFieldsDto[] $VALUES;

    @pmi0("about")
    public static final BaseUserGroupFieldsDto ABOUT;

    @pmi0("action_button")
    public static final BaseUserGroupFieldsDto ACTION_BUTTON;

    @pmi0("activities")
    public static final BaseUserGroupFieldsDto ACTIVITIES;

    @pmi0("activity")
    public static final BaseUserGroupFieldsDto ACTIVITY;

    @pmi0("addresses")
    public static final BaseUserGroupFieldsDto ADDRESSES;

    @pmi0("admin_level")
    public static final BaseUserGroupFieldsDto ADMIN_LEVEL;

    @pmi0("age_limits")
    public static final BaseUserGroupFieldsDto AGE_LIMITS;

    @pmi0("age_mark")
    public static final BaseUserGroupFieldsDto AGE_MARK;

    @pmi0("author_id")
    public static final BaseUserGroupFieldsDto AUTHOR_ID;

    @pmi0("ban_info")
    public static final BaseUserGroupFieldsDto BAN_INFO;

    @pmi0("bdate")
    public static final BaseUserGroupFieldsDto BDATE;

    @pmi0("blacklisted")
    public static final BaseUserGroupFieldsDto BLACKLISTED;

    @pmi0("blacklisted_by_me")
    public static final BaseUserGroupFieldsDto BLACKLISTED_BY_ME;

    @pmi0("books")
    public static final BaseUserGroupFieldsDto BOOKS;

    @pmi0("can_ban")
    public static final BaseUserGroupFieldsDto CAN_BAN;

    @pmi0("can_create_topic")
    public static final BaseUserGroupFieldsDto CAN_CREATE_TOPIC;

    @pmi0("can_message")
    public static final BaseUserGroupFieldsDto CAN_MESSAGE;

    @pmi0("can_post")
    public static final BaseUserGroupFieldsDto CAN_POST;

    @pmi0("can_see_all_posts")
    public static final BaseUserGroupFieldsDto CAN_SEE_ALL_POSTS;

    @pmi0("can_see_audio")
    public static final BaseUserGroupFieldsDto CAN_SEE_AUDIO;

    @pmi0("can_send_friend_request")
    public static final BaseUserGroupFieldsDto CAN_SEND_FRIEND_REQUEST;

    @pmi0("can_send_notify")
    public static final BaseUserGroupFieldsDto CAN_SEND_NOTIFY;

    @pmi0("can_subscribe_stories")
    public static final BaseUserGroupFieldsDto CAN_SUBSCRIBE_STORIES;

    @pmi0("can_upload_story")
    public static final BaseUserGroupFieldsDto CAN_UPLOAD_STORY;

    @pmi0("can_upload_video")
    public static final BaseUserGroupFieldsDto CAN_UPLOAD_VIDEO;

    @pmi0("can_write_private_message")
    public static final BaseUserGroupFieldsDto CAN_WRITE_PRIVATE_MESSAGE;

    @pmi0("career")
    public static final BaseUserGroupFieldsDto CAREER;

    @pmi0("city")
    public static final BaseUserGroupFieldsDto CITY;

    @pmi0("clips_count")
    public static final BaseUserGroupFieldsDto CLIPS_COUNT;

    @pmi0("common_count")
    public static final BaseUserGroupFieldsDto COMMON_COUNT;

    @pmi0("connections")
    public static final BaseUserGroupFieldsDto CONNECTIONS;

    @pmi0("contacts")
    public static final BaseUserGroupFieldsDto CONTACTS;

    @pmi0("counters")
    public static final BaseUserGroupFieldsDto COUNTERS;

    @pmi0("country")
    public static final BaseUserGroupFieldsDto COUNTRY;

    @pmi0("cover")
    public static final BaseUserGroupFieldsDto COVER;

    @pmi0("crop_photo")
    public static final BaseUserGroupFieldsDto CROP_PHOTO;

    @pmi0("deactivated")
    public static final BaseUserGroupFieldsDto DEACTIVATED;

    @pmi0("description")
    public static final BaseUserGroupFieldsDto DESCRIPTION;

    @pmi0(X3.j.D)
    public static final BaseUserGroupFieldsDto DOMAIN;

    @pmi0("education")
    public static final BaseUserGroupFieldsDto EDUCATION;

    @pmi0("emoji_status")
    public static final BaseUserGroupFieldsDto EMOJI_STATUS;

    @pmi0("exports")
    public static final BaseUserGroupFieldsDto EXPORTS;

    @pmi0("finish_date")
    public static final BaseUserGroupFieldsDto FINISH_DATE;

    @pmi0("first_name")
    public static final BaseUserGroupFieldsDto FIRST_NAME;

    @pmi0("first_name_acc")
    public static final BaseUserGroupFieldsDto FIRST_NAME_ACC;

    @pmi0("first_name_dat")
    public static final BaseUserGroupFieldsDto FIRST_NAME_DAT;

    @pmi0("first_name_gen")
    public static final BaseUserGroupFieldsDto FIRST_NAME_GEN;

    @pmi0("fixed_post")
    public static final BaseUserGroupFieldsDto FIXED_POST;

    @pmi0("followers_count")
    public static final BaseUserGroupFieldsDto FOLLOWERS_COUNT;

    @pmi0("friend_status")
    public static final BaseUserGroupFieldsDto FRIEND_STATUS;

    @pmi0("games")
    public static final BaseUserGroupFieldsDto GAMES;

    @pmi0("has_market_app")
    public static final BaseUserGroupFieldsDto HAS_MARKET_APP;

    @pmi0("has_mobile")
    public static final BaseUserGroupFieldsDto HAS_MOBILE;

    @pmi0("has_photo")
    public static final BaseUserGroupFieldsDto HAS_PHOTO;

    @pmi0("has_unseen_stories")
    public static final BaseUserGroupFieldsDto HAS_UNSEEN_STORIES;

    @pmi0("home_town")
    public static final BaseUserGroupFieldsDto HOME_TOWN;

    @pmi0("id")
    public static final BaseUserGroupFieldsDto ID;

    @pmi0("image_status")
    public static final BaseUserGroupFieldsDto IMAGE_STATUS;

    @pmi0("interests")
    public static final BaseUserGroupFieldsDto INTERESTS;

    @pmi0("is_admin")
    public static final BaseUserGroupFieldsDto IS_ADMIN;

    @pmi0("is_best_friend")
    public static final BaseUserGroupFieldsDto IS_BEST_FRIEND;

    @pmi0("is_closed")
    public static final BaseUserGroupFieldsDto IS_CLOSED;

    @pmi0("is_esia_verified")
    public static final BaseUserGroupFieldsDto IS_ESIA_VERIFIED;

    @pmi0("is_favorite")
    public static final BaseUserGroupFieldsDto IS_FAVORITE;

    @pmi0("is_friend")
    public static final BaseUserGroupFieldsDto IS_FRIEND;

    @pmi0("is_government_organization")
    public static final BaseUserGroupFieldsDto IS_GOVERNMENT_ORGANIZATION;

    @pmi0("is_hidden_from_feed")
    public static final BaseUserGroupFieldsDto IS_HIDDEN_FROM_FEED;

    @pmi0("is_member")
    public static final BaseUserGroupFieldsDto IS_MEMBER;

    @pmi0("is_messages_blocked")
    public static final BaseUserGroupFieldsDto IS_MESSAGES_BLOCKED;

    @pmi0("is_nft")
    public static final BaseUserGroupFieldsDto IS_NFT;

    @pmi0("is_nft_photo")
    public static final BaseUserGroupFieldsDto IS_NFT_PHOTO;

    @pmi0("is_sber_verified")
    public static final BaseUserGroupFieldsDto IS_SBER_VERIFIED;

    @pmi0("is_subscribed")
    public static final BaseUserGroupFieldsDto IS_SUBSCRIBED;

    @pmi0("is_subscribed_stories")
    public static final BaseUserGroupFieldsDto IS_SUBSCRIBED_STORIES;

    @pmi0("is_tinkoff_verified")
    public static final BaseUserGroupFieldsDto IS_TINKOFF_VERIFIED;

    @pmi0("is_widget_messages_enabled")
    public static final BaseUserGroupFieldsDto IS_WIDGET_MESSAGES_ENABLED;

    @pmi0("last_name")
    public static final BaseUserGroupFieldsDto LAST_NAME;

    @pmi0("last_name_acc")
    public static final BaseUserGroupFieldsDto LAST_NAME_ACC;

    @pmi0("last_name_dat")
    public static final BaseUserGroupFieldsDto LAST_NAME_DAT;

    @pmi0("last_name_gen")
    public static final BaseUserGroupFieldsDto LAST_NAME_GEN;

    @pmi0("last_seen")
    public static final BaseUserGroupFieldsDto LAST_SEEN;

    @pmi0("links")
    public static final BaseUserGroupFieldsDto LINKS;

    @pmi0("lists")
    public static final BaseUserGroupFieldsDto LISTS;

    @pmi0("maiden_name")
    public static final BaseUserGroupFieldsDto MAIDEN_NAME;

    @pmi0("main_album_id")
    public static final BaseUserGroupFieldsDto MAIN_ALBUM_ID;

    @pmi0("main_section")
    public static final BaseUserGroupFieldsDto MAIN_SECTION;

    @pmi0("market")
    public static final BaseUserGroupFieldsDto MARKET;

    @pmi0("members_count")
    public static final BaseUserGroupFieldsDto MEMBERS_COUNT;

    @pmi0("member_status")
    public static final BaseUserGroupFieldsDto MEMBER_STATUS;

    @pmi0("military")
    public static final BaseUserGroupFieldsDto MILITARY;

    @pmi0("movies")
    public static final BaseUserGroupFieldsDto MOVIES;

    @pmi0("music")
    public static final BaseUserGroupFieldsDto MUSIC;

    @pmi0("name")
    public static final BaseUserGroupFieldsDto NAME;

    @pmi0("nickname")
    public static final BaseUserGroupFieldsDto NICKNAME;

    @pmi0("occupation")
    public static final BaseUserGroupFieldsDto OCCUPATION;

    @pmi0(eok.ONLINE_EXTRAS_KEY)
    public static final BaseUserGroupFieldsDto ONLINE;

    @pmi0("online_status")
    public static final BaseUserGroupFieldsDto ONLINE_STATUS;

    @pmi0("personal")
    public static final BaseUserGroupFieldsDto PERSONAL;

    @pmi0("phone")
    public static final BaseUserGroupFieldsDto PHONE;

    @pmi0("photo_100")
    public static final BaseUserGroupFieldsDto PHOTO_100;

    @pmi0("photo_200")
    public static final BaseUserGroupFieldsDto PHOTO_200;

    @pmi0("photo_200_orig")
    public static final BaseUserGroupFieldsDto PHOTO_200_ORIG;

    @pmi0("photo_400_orig")
    public static final BaseUserGroupFieldsDto PHOTO_400_ORIG;

    @pmi0("photo_50")
    public static final BaseUserGroupFieldsDto PHOTO_50;

    @pmi0("photo_avg_color")
    public static final BaseUserGroupFieldsDto PHOTO_AVG_COLOR;

    @pmi0("photo_base")
    public static final BaseUserGroupFieldsDto PHOTO_BASE;

    @pmi0("photo_id")
    public static final BaseUserGroupFieldsDto PHOTO_ID;

    @pmi0("photo_max")
    public static final BaseUserGroupFieldsDto PHOTO_MAX;

    @pmi0("photo_max_orig")
    public static final BaseUserGroupFieldsDto PHOTO_MAX_ORIG;

    @pmi0("quotes")
    public static final BaseUserGroupFieldsDto QUOTES;

    @pmi0("relation")
    public static final BaseUserGroupFieldsDto RELATION;

    @pmi0("relatives")
    public static final BaseUserGroupFieldsDto RELATIVES;

    @pmi0("schools")
    public static final BaseUserGroupFieldsDto SCHOOLS;

    @pmi0("screen_name")
    public static final BaseUserGroupFieldsDto SCREEN_NAME;

    @pmi0("sex")
    public static final BaseUserGroupFieldsDto SEX;

    @pmi0("site")
    public static final BaseUserGroupFieldsDto SITE;

    @pmi0("start_date")
    public static final BaseUserGroupFieldsDto START_DATE;

    @pmi0("status")
    public static final BaseUserGroupFieldsDto STATUS;

    @pmi0(AnalyticsBaseParamsConstantsKt.TIMEZONE)
    public static final BaseUserGroupFieldsDto TIMEZONE;

    @pmi0("trending")
    public static final BaseUserGroupFieldsDto TRENDING;

    @pmi0("tv")
    public static final BaseUserGroupFieldsDto TV;

    @pmi0("type")
    public static final BaseUserGroupFieldsDto TYPE;

    @pmi0("universities")
    public static final BaseUserGroupFieldsDto UNIVERSITIES;

    @pmi0("verified")
    public static final BaseUserGroupFieldsDto VERIFIED;

    @pmi0("video_files")
    public static final BaseUserGroupFieldsDto VIDEO_FILES;

    @pmi0("vk_admin_status")
    public static final BaseUserGroupFieldsDto VK_ADMIN_STATUS;

    @pmi0("wall_comments")
    public static final BaseUserGroupFieldsDto WALL_COMMENTS;

    @pmi0("wiki_page")
    public static final BaseUserGroupFieldsDto WIKI_PAGE;
    private final String value;

    static {
        BaseUserGroupFieldsDto baseUserGroupFieldsDto = new BaseUserGroupFieldsDto("ABOUT", 0, "about");
        ABOUT = baseUserGroupFieldsDto;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto2 = new BaseUserGroupFieldsDto("ACTION_BUTTON", 1, "action_button");
        ACTION_BUTTON = baseUserGroupFieldsDto2;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto3 = new BaseUserGroupFieldsDto("ACTIVITIES", 2, "activities");
        ACTIVITIES = baseUserGroupFieldsDto3;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto4 = new BaseUserGroupFieldsDto("ACTIVITY", 3, "activity");
        ACTIVITY = baseUserGroupFieldsDto4;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto5 = new BaseUserGroupFieldsDto("ADDRESSES", 4, "addresses");
        ADDRESSES = baseUserGroupFieldsDto5;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto6 = new BaseUserGroupFieldsDto("ADMIN_LEVEL", 5, "admin_level");
        ADMIN_LEVEL = baseUserGroupFieldsDto6;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto7 = new BaseUserGroupFieldsDto("AGE_LIMITS", 6, "age_limits");
        AGE_LIMITS = baseUserGroupFieldsDto7;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto8 = new BaseUserGroupFieldsDto("AUTHOR_ID", 7, "author_id");
        AUTHOR_ID = baseUserGroupFieldsDto8;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto9 = new BaseUserGroupFieldsDto("BAN_INFO", 8, "ban_info");
        BAN_INFO = baseUserGroupFieldsDto9;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto10 = new BaseUserGroupFieldsDto("BDATE", 9, "bdate");
        BDATE = baseUserGroupFieldsDto10;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto11 = new BaseUserGroupFieldsDto("BLACKLISTED", 10, "blacklisted");
        BLACKLISTED = baseUserGroupFieldsDto11;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto12 = new BaseUserGroupFieldsDto("BLACKLISTED_BY_ME", 11, "blacklisted_by_me");
        BLACKLISTED_BY_ME = baseUserGroupFieldsDto12;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto13 = new BaseUserGroupFieldsDto("BOOKS", 12, "books");
        BOOKS = baseUserGroupFieldsDto13;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto14 = new BaseUserGroupFieldsDto("CAN_BAN", 13, "can_ban");
        CAN_BAN = baseUserGroupFieldsDto14;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto15 = new BaseUserGroupFieldsDto("CAN_CREATE_TOPIC", 14, "can_create_topic");
        CAN_CREATE_TOPIC = baseUserGroupFieldsDto15;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto16 = new BaseUserGroupFieldsDto("CAN_MESSAGE", 15, "can_message");
        CAN_MESSAGE = baseUserGroupFieldsDto16;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto17 = new BaseUserGroupFieldsDto("IS_WIDGET_MESSAGES_ENABLED", 16, "is_widget_messages_enabled");
        IS_WIDGET_MESSAGES_ENABLED = baseUserGroupFieldsDto17;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto18 = new BaseUserGroupFieldsDto("CAN_POST", 17, "can_post");
        CAN_POST = baseUserGroupFieldsDto18;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto19 = new BaseUserGroupFieldsDto("CAN_SEE_ALL_POSTS", 18, "can_see_all_posts");
        CAN_SEE_ALL_POSTS = baseUserGroupFieldsDto19;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto20 = new BaseUserGroupFieldsDto("CAN_SEE_AUDIO", 19, "can_see_audio");
        CAN_SEE_AUDIO = baseUserGroupFieldsDto20;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto21 = new BaseUserGroupFieldsDto("CAN_SEND_FRIEND_REQUEST", 20, "can_send_friend_request");
        CAN_SEND_FRIEND_REQUEST = baseUserGroupFieldsDto21;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto22 = new BaseUserGroupFieldsDto("CAN_UPLOAD_VIDEO", 21, "can_upload_video");
        CAN_UPLOAD_VIDEO = baseUserGroupFieldsDto22;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto23 = new BaseUserGroupFieldsDto("CAN_WRITE_PRIVATE_MESSAGE", 22, "can_write_private_message");
        CAN_WRITE_PRIVATE_MESSAGE = baseUserGroupFieldsDto23;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto24 = new BaseUserGroupFieldsDto("CAREER", 23, "career");
        CAREER = baseUserGroupFieldsDto24;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto25 = new BaseUserGroupFieldsDto("CITY", 24, "city");
        CITY = baseUserGroupFieldsDto25;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto26 = new BaseUserGroupFieldsDto("COMMON_COUNT", 25, "common_count");
        COMMON_COUNT = baseUserGroupFieldsDto26;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto27 = new BaseUserGroupFieldsDto("CONNECTIONS", 26, "connections");
        CONNECTIONS = baseUserGroupFieldsDto27;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto28 = new BaseUserGroupFieldsDto("CONTACTS", 27, "contacts");
        CONTACTS = baseUserGroupFieldsDto28;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto29 = new BaseUserGroupFieldsDto("COUNTERS", 28, "counters");
        COUNTERS = baseUserGroupFieldsDto29;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto30 = new BaseUserGroupFieldsDto("COUNTRY", 29, "country");
        COUNTRY = baseUserGroupFieldsDto30;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto31 = new BaseUserGroupFieldsDto("COVER", 30, "cover");
        COVER = baseUserGroupFieldsDto31;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto32 = new BaseUserGroupFieldsDto("CROP_PHOTO", 31, "crop_photo");
        CROP_PHOTO = baseUserGroupFieldsDto32;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto33 = new BaseUserGroupFieldsDto("DEACTIVATED", 32, "deactivated");
        DEACTIVATED = baseUserGroupFieldsDto33;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto34 = new BaseUserGroupFieldsDto(NativeAdContent.ViewTag.AD_DESCRIPTION, 33, "description");
        DESCRIPTION = baseUserGroupFieldsDto34;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto35 = new BaseUserGroupFieldsDto("DOMAIN", 34, X3.j.D);
        DOMAIN = baseUserGroupFieldsDto35;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto36 = new BaseUserGroupFieldsDto("EDUCATION", 35, "education");
        EDUCATION = baseUserGroupFieldsDto36;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto37 = new BaseUserGroupFieldsDto("EXPORTS", 36, "exports");
        EXPORTS = baseUserGroupFieldsDto37;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto38 = new BaseUserGroupFieldsDto("FINISH_DATE", 37, "finish_date");
        FINISH_DATE = baseUserGroupFieldsDto38;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto39 = new BaseUserGroupFieldsDto("FIXED_POST", 38, "fixed_post");
        FIXED_POST = baseUserGroupFieldsDto39;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto40 = new BaseUserGroupFieldsDto("FOLLOWERS_COUNT", 39, "followers_count");
        FOLLOWERS_COUNT = baseUserGroupFieldsDto40;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto41 = new BaseUserGroupFieldsDto("FRIEND_STATUS", 40, "friend_status");
        FRIEND_STATUS = baseUserGroupFieldsDto41;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto42 = new BaseUserGroupFieldsDto("GAMES", 41, "games");
        GAMES = baseUserGroupFieldsDto42;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto43 = new BaseUserGroupFieldsDto("HAS_MARKET_APP", 42, "has_market_app");
        HAS_MARKET_APP = baseUserGroupFieldsDto43;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto44 = new BaseUserGroupFieldsDto("HAS_MOBILE", 43, "has_mobile");
        HAS_MOBILE = baseUserGroupFieldsDto44;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto45 = new BaseUserGroupFieldsDto("HAS_PHOTO", 44, "has_photo");
        HAS_PHOTO = baseUserGroupFieldsDto45;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto46 = new BaseUserGroupFieldsDto("HOME_TOWN", 45, "home_town");
        HOME_TOWN = baseUserGroupFieldsDto46;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto47 = new BaseUserGroupFieldsDto("ID", 46, "id");
        ID = baseUserGroupFieldsDto47;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto48 = new BaseUserGroupFieldsDto("INTERESTS", 47, "interests");
        INTERESTS = baseUserGroupFieldsDto48;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto49 = new BaseUserGroupFieldsDto("IS_ADMIN", 48, "is_admin");
        IS_ADMIN = baseUserGroupFieldsDto49;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto50 = new BaseUserGroupFieldsDto("IS_CLOSED", 49, "is_closed");
        IS_CLOSED = baseUserGroupFieldsDto50;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto51 = new BaseUserGroupFieldsDto("IS_FAVORITE", 50, "is_favorite");
        IS_FAVORITE = baseUserGroupFieldsDto51;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto52 = new BaseUserGroupFieldsDto("IS_FRIEND", 51, "is_friend");
        IS_FRIEND = baseUserGroupFieldsDto52;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto53 = new BaseUserGroupFieldsDto("IS_BEST_FRIEND", 52, "is_best_friend");
        IS_BEST_FRIEND = baseUserGroupFieldsDto53;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto54 = new BaseUserGroupFieldsDto("IS_HIDDEN_FROM_FEED", 53, "is_hidden_from_feed");
        IS_HIDDEN_FROM_FEED = baseUserGroupFieldsDto54;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto55 = new BaseUserGroupFieldsDto("IS_MEMBER", 54, "is_member");
        IS_MEMBER = baseUserGroupFieldsDto55;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto56 = new BaseUserGroupFieldsDto("IS_MESSAGES_BLOCKED", 55, "is_messages_blocked");
        IS_MESSAGES_BLOCKED = baseUserGroupFieldsDto56;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto57 = new BaseUserGroupFieldsDto("CAN_SEND_NOTIFY", 56, "can_send_notify");
        CAN_SEND_NOTIFY = baseUserGroupFieldsDto57;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto58 = new BaseUserGroupFieldsDto("IS_SUBSCRIBED", 57, "is_subscribed");
        IS_SUBSCRIBED = baseUserGroupFieldsDto58;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto59 = new BaseUserGroupFieldsDto("LAST_SEEN", 58, "last_seen");
        LAST_SEEN = baseUserGroupFieldsDto59;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto60 = new BaseUserGroupFieldsDto("LINKS", 59, "links");
        LINKS = baseUserGroupFieldsDto60;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto61 = new BaseUserGroupFieldsDto("LISTS", 60, "lists");
        LISTS = baseUserGroupFieldsDto61;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto62 = new BaseUserGroupFieldsDto("MAIDEN_NAME", 61, "maiden_name");
        MAIDEN_NAME = baseUserGroupFieldsDto62;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto63 = new BaseUserGroupFieldsDto("MAIN_ALBUM_ID", 62, "main_album_id");
        MAIN_ALBUM_ID = baseUserGroupFieldsDto63;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto64 = new BaseUserGroupFieldsDto("MAIN_SECTION", 63, "main_section");
        MAIN_SECTION = baseUserGroupFieldsDto64;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto65 = new BaseUserGroupFieldsDto("MARKET", 64, "market");
        MARKET = baseUserGroupFieldsDto65;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto66 = new BaseUserGroupFieldsDto("MEMBER_STATUS", 65, "member_status");
        MEMBER_STATUS = baseUserGroupFieldsDto66;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto67 = new BaseUserGroupFieldsDto("MEMBERS_COUNT", 66, "members_count");
        MEMBERS_COUNT = baseUserGroupFieldsDto67;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto68 = new BaseUserGroupFieldsDto("MILITARY", 67, "military");
        MILITARY = baseUserGroupFieldsDto68;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto69 = new BaseUserGroupFieldsDto("MOVIES", 68, "movies");
        MOVIES = baseUserGroupFieldsDto69;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto70 = new BaseUserGroupFieldsDto("MUSIC", 69, "music");
        MUSIC = baseUserGroupFieldsDto70;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto71 = new BaseUserGroupFieldsDto("NAME", 70, "name");
        NAME = baseUserGroupFieldsDto71;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto72 = new BaseUserGroupFieldsDto("NICKNAME", 71, "nickname");
        NICKNAME = baseUserGroupFieldsDto72;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto73 = new BaseUserGroupFieldsDto("OCCUPATION", 72, "occupation");
        OCCUPATION = baseUserGroupFieldsDto73;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto74 = new BaseUserGroupFieldsDto("ONLINE", 73, eok.ONLINE_EXTRAS_KEY);
        ONLINE = baseUserGroupFieldsDto74;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto75 = new BaseUserGroupFieldsDto("ONLINE_STATUS", 74, "online_status");
        ONLINE_STATUS = baseUserGroupFieldsDto75;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto76 = new BaseUserGroupFieldsDto("PERSONAL", 75, "personal");
        PERSONAL = baseUserGroupFieldsDto76;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto77 = new BaseUserGroupFieldsDto("PHONE", 76, "phone");
        PHONE = baseUserGroupFieldsDto77;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto78 = new BaseUserGroupFieldsDto("PHOTO_100", 77, "photo_100");
        PHOTO_100 = baseUserGroupFieldsDto78;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto79 = new BaseUserGroupFieldsDto("PHOTO_200", 78, "photo_200");
        PHOTO_200 = baseUserGroupFieldsDto79;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto80 = new BaseUserGroupFieldsDto("PHOTO_200_ORIG", 79, "photo_200_orig");
        PHOTO_200_ORIG = baseUserGroupFieldsDto80;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto81 = new BaseUserGroupFieldsDto("PHOTO_400_ORIG", 80, "photo_400_orig");
        PHOTO_400_ORIG = baseUserGroupFieldsDto81;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto82 = new BaseUserGroupFieldsDto("PHOTO_50", 81, "photo_50");
        PHOTO_50 = baseUserGroupFieldsDto82;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto83 = new BaseUserGroupFieldsDto("PHOTO_ID", 82, "photo_id");
        PHOTO_ID = baseUserGroupFieldsDto83;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto84 = new BaseUserGroupFieldsDto("PHOTO_MAX", 83, "photo_max");
        PHOTO_MAX = baseUserGroupFieldsDto84;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto85 = new BaseUserGroupFieldsDto("PHOTO_MAX_ORIG", 84, "photo_max_orig");
        PHOTO_MAX_ORIG = baseUserGroupFieldsDto85;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto86 = new BaseUserGroupFieldsDto("PHOTO_AVG_COLOR", 85, "photo_avg_color");
        PHOTO_AVG_COLOR = baseUserGroupFieldsDto86;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto87 = new BaseUserGroupFieldsDto("PHOTO_BASE", 86, "photo_base");
        PHOTO_BASE = baseUserGroupFieldsDto87;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto88 = new BaseUserGroupFieldsDto("QUOTES", 87, "quotes");
        QUOTES = baseUserGroupFieldsDto88;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto89 = new BaseUserGroupFieldsDto("RELATION", 88, "relation");
        RELATION = baseUserGroupFieldsDto89;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto90 = new BaseUserGroupFieldsDto("RELATIVES", 89, "relatives");
        RELATIVES = baseUserGroupFieldsDto90;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto91 = new BaseUserGroupFieldsDto("SCHOOLS", 90, "schools");
        SCHOOLS = baseUserGroupFieldsDto91;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto92 = new BaseUserGroupFieldsDto("SCREEN_NAME", 91, "screen_name");
        SCREEN_NAME = baseUserGroupFieldsDto92;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto93 = new BaseUserGroupFieldsDto("SEX", 92, "sex");
        SEX = baseUserGroupFieldsDto93;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto94 = new BaseUserGroupFieldsDto("SITE", 93, "site");
        SITE = baseUserGroupFieldsDto94;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto95 = new BaseUserGroupFieldsDto("START_DATE", 94, "start_date");
        START_DATE = baseUserGroupFieldsDto95;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto96 = new BaseUserGroupFieldsDto(CommonConstant.RETKEY.STATUS, 95, "status");
        STATUS = baseUserGroupFieldsDto96;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto97 = new BaseUserGroupFieldsDto("TIMEZONE", 96, AnalyticsBaseParamsConstantsKt.TIMEZONE);
        TIMEZONE = baseUserGroupFieldsDto97;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto98 = new BaseUserGroupFieldsDto("TRENDING", 97, "trending");
        TRENDING = baseUserGroupFieldsDto98;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto99 = new BaseUserGroupFieldsDto("TV", 98, "tv");
        TV = baseUserGroupFieldsDto99;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto100 = new BaseUserGroupFieldsDto(CredentialProviderBaseController.TYPE_TAG, 99, "type");
        TYPE = baseUserGroupFieldsDto100;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto101 = new BaseUserGroupFieldsDto("UNIVERSITIES", 100, "universities");
        UNIVERSITIES = baseUserGroupFieldsDto101;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto102 = new BaseUserGroupFieldsDto("VERIFIED", 101, "verified");
        VERIFIED = baseUserGroupFieldsDto102;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto103 = new BaseUserGroupFieldsDto("WALL_COMMENTS", 102, "wall_comments");
        WALL_COMMENTS = baseUserGroupFieldsDto103;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto104 = new BaseUserGroupFieldsDto("WIKI_PAGE", 103, "wiki_page");
        WIKI_PAGE = baseUserGroupFieldsDto104;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto105 = new BaseUserGroupFieldsDto("FIRST_NAME", 104, "first_name");
        FIRST_NAME = baseUserGroupFieldsDto105;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto106 = new BaseUserGroupFieldsDto("FIRST_NAME_ACC", 105, "first_name_acc");
        FIRST_NAME_ACC = baseUserGroupFieldsDto106;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto107 = new BaseUserGroupFieldsDto("FIRST_NAME_DAT", Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, "first_name_dat");
        FIRST_NAME_DAT = baseUserGroupFieldsDto107;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto108 = new BaseUserGroupFieldsDto("FIRST_NAME_GEN", ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, "first_name_gen");
        FIRST_NAME_GEN = baseUserGroupFieldsDto108;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto109 = new BaseUserGroupFieldsDto("LAST_NAME", 108, "last_name");
        LAST_NAME = baseUserGroupFieldsDto109;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto110 = new BaseUserGroupFieldsDto("LAST_NAME_ACC", 109, "last_name_acc");
        LAST_NAME_ACC = baseUserGroupFieldsDto110;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto111 = new BaseUserGroupFieldsDto("LAST_NAME_DAT", 110, "last_name_dat");
        LAST_NAME_DAT = baseUserGroupFieldsDto111;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto112 = new BaseUserGroupFieldsDto("LAST_NAME_GEN", 111, "last_name_gen");
        LAST_NAME_GEN = baseUserGroupFieldsDto112;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto113 = new BaseUserGroupFieldsDto("CAN_SUBSCRIBE_STORIES", 112, "can_subscribe_stories");
        CAN_SUBSCRIBE_STORIES = baseUserGroupFieldsDto113;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto114 = new BaseUserGroupFieldsDto("IS_SUBSCRIBED_STORIES", 113, "is_subscribed_stories");
        IS_SUBSCRIBED_STORIES = baseUserGroupFieldsDto114;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto115 = new BaseUserGroupFieldsDto("VK_ADMIN_STATUS", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, "vk_admin_status");
        VK_ADMIN_STATUS = baseUserGroupFieldsDto115;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto116 = new BaseUserGroupFieldsDto("CAN_UPLOAD_STORY", Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, "can_upload_story");
        CAN_UPLOAD_STORY = baseUserGroupFieldsDto116;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto117 = new BaseUserGroupFieldsDto("CLIPS_COUNT", 116, "clips_count");
        CLIPS_COUNT = baseUserGroupFieldsDto117;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto118 = new BaseUserGroupFieldsDto("IMAGE_STATUS", Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, "image_status");
        IMAGE_STATUS = baseUserGroupFieldsDto118;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto119 = new BaseUserGroupFieldsDto("IS_NFT", Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, "is_nft");
        IS_NFT = baseUserGroupFieldsDto119;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto120 = new BaseUserGroupFieldsDto("IS_NFT_PHOTO", Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, "is_nft_photo");
        IS_NFT_PHOTO = baseUserGroupFieldsDto120;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto121 = new BaseUserGroupFieldsDto("VIDEO_FILES", 120, "video_files");
        VIDEO_FILES = baseUserGroupFieldsDto121;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto122 = new BaseUserGroupFieldsDto("EMOJI_STATUS", Sdk.SDKError.Reason.TPAT_ERROR_VALUE, "emoji_status");
        EMOJI_STATUS = baseUserGroupFieldsDto122;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto123 = new BaseUserGroupFieldsDto("HAS_UNSEEN_STORIES", Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, "has_unseen_stories");
        HAS_UNSEEN_STORIES = baseUserGroupFieldsDto123;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto124 = new BaseUserGroupFieldsDto("IS_GOVERNMENT_ORGANIZATION", 123, "is_government_organization");
        IS_GOVERNMENT_ORGANIZATION = baseUserGroupFieldsDto124;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto125 = new BaseUserGroupFieldsDto("IS_ESIA_VERIFIED", Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, "is_esia_verified");
        IS_ESIA_VERIFIED = baseUserGroupFieldsDto125;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto126 = new BaseUserGroupFieldsDto("IS_TINKOFF_VERIFIED", 125, "is_tinkoff_verified");
        IS_TINKOFF_VERIFIED = baseUserGroupFieldsDto126;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto127 = new BaseUserGroupFieldsDto("IS_SBER_VERIFIED", Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, "is_sber_verified");
        IS_SBER_VERIFIED = baseUserGroupFieldsDto127;
        BaseUserGroupFieldsDto baseUserGroupFieldsDto128 = new BaseUserGroupFieldsDto("AGE_MARK", 127, "age_mark");
        AGE_MARK = baseUserGroupFieldsDto128;
        BaseUserGroupFieldsDto[] baseUserGroupFieldsDtoArr = {baseUserGroupFieldsDto, baseUserGroupFieldsDto2, baseUserGroupFieldsDto3, baseUserGroupFieldsDto4, baseUserGroupFieldsDto5, baseUserGroupFieldsDto6, baseUserGroupFieldsDto7, baseUserGroupFieldsDto8, baseUserGroupFieldsDto9, baseUserGroupFieldsDto10, baseUserGroupFieldsDto11, baseUserGroupFieldsDto12, baseUserGroupFieldsDto13, baseUserGroupFieldsDto14, baseUserGroupFieldsDto15, baseUserGroupFieldsDto16, baseUserGroupFieldsDto17, baseUserGroupFieldsDto18, baseUserGroupFieldsDto19, baseUserGroupFieldsDto20, baseUserGroupFieldsDto21, baseUserGroupFieldsDto22, baseUserGroupFieldsDto23, baseUserGroupFieldsDto24, baseUserGroupFieldsDto25, baseUserGroupFieldsDto26, baseUserGroupFieldsDto27, baseUserGroupFieldsDto28, baseUserGroupFieldsDto29, baseUserGroupFieldsDto30, baseUserGroupFieldsDto31, baseUserGroupFieldsDto32, baseUserGroupFieldsDto33, baseUserGroupFieldsDto34, baseUserGroupFieldsDto35, baseUserGroupFieldsDto36, baseUserGroupFieldsDto37, baseUserGroupFieldsDto38, baseUserGroupFieldsDto39, baseUserGroupFieldsDto40, baseUserGroupFieldsDto41, baseUserGroupFieldsDto42, baseUserGroupFieldsDto43, baseUserGroupFieldsDto44, baseUserGroupFieldsDto45, baseUserGroupFieldsDto46, baseUserGroupFieldsDto47, baseUserGroupFieldsDto48, baseUserGroupFieldsDto49, baseUserGroupFieldsDto50, baseUserGroupFieldsDto51, baseUserGroupFieldsDto52, baseUserGroupFieldsDto53, baseUserGroupFieldsDto54, baseUserGroupFieldsDto55, baseUserGroupFieldsDto56, baseUserGroupFieldsDto57, baseUserGroupFieldsDto58, baseUserGroupFieldsDto59, baseUserGroupFieldsDto60, baseUserGroupFieldsDto61, baseUserGroupFieldsDto62, baseUserGroupFieldsDto63, baseUserGroupFieldsDto64, baseUserGroupFieldsDto65, baseUserGroupFieldsDto66, baseUserGroupFieldsDto67, baseUserGroupFieldsDto68, baseUserGroupFieldsDto69, baseUserGroupFieldsDto70, baseUserGroupFieldsDto71, baseUserGroupFieldsDto72, baseUserGroupFieldsDto73, baseUserGroupFieldsDto74, baseUserGroupFieldsDto75, baseUserGroupFieldsDto76, baseUserGroupFieldsDto77, baseUserGroupFieldsDto78, baseUserGroupFieldsDto79, baseUserGroupFieldsDto80, baseUserGroupFieldsDto81, baseUserGroupFieldsDto82, baseUserGroupFieldsDto83, baseUserGroupFieldsDto84, baseUserGroupFieldsDto85, baseUserGroupFieldsDto86, baseUserGroupFieldsDto87, baseUserGroupFieldsDto88, baseUserGroupFieldsDto89, baseUserGroupFieldsDto90, baseUserGroupFieldsDto91, baseUserGroupFieldsDto92, baseUserGroupFieldsDto93, baseUserGroupFieldsDto94, baseUserGroupFieldsDto95, baseUserGroupFieldsDto96, baseUserGroupFieldsDto97, baseUserGroupFieldsDto98, baseUserGroupFieldsDto99, baseUserGroupFieldsDto100, baseUserGroupFieldsDto101, baseUserGroupFieldsDto102, baseUserGroupFieldsDto103, baseUserGroupFieldsDto104, baseUserGroupFieldsDto105, baseUserGroupFieldsDto106, baseUserGroupFieldsDto107, baseUserGroupFieldsDto108, baseUserGroupFieldsDto109, baseUserGroupFieldsDto110, baseUserGroupFieldsDto111, baseUserGroupFieldsDto112, baseUserGroupFieldsDto113, baseUserGroupFieldsDto114, baseUserGroupFieldsDto115, baseUserGroupFieldsDto116, baseUserGroupFieldsDto117, baseUserGroupFieldsDto118, baseUserGroupFieldsDto119, baseUserGroupFieldsDto120, baseUserGroupFieldsDto121, baseUserGroupFieldsDto122, baseUserGroupFieldsDto123, baseUserGroupFieldsDto124, baseUserGroupFieldsDto125, baseUserGroupFieldsDto126, baseUserGroupFieldsDto127, baseUserGroupFieldsDto128};
        $VALUES = baseUserGroupFieldsDtoArr;
        $ENTRIES = new asp(baseUserGroupFieldsDtoArr);
    }

    private BaseUserGroupFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static BaseUserGroupFieldsDto valueOf(String str) {
        return (BaseUserGroupFieldsDto) Enum.valueOf(BaseUserGroupFieldsDto.class, str);
    }

    public static BaseUserGroupFieldsDto[] values() {
        return (BaseUserGroupFieldsDto[]) $VALUES.clone();
    }
}
