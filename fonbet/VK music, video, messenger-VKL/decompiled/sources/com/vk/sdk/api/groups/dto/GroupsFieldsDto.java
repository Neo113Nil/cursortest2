package com.vk.sdk.api.groups.dto;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.internal.protos.Sdk;
import org.chromium.base.version_info.VersionConstants;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsFieldsDto.kt */
/* loaded from: classes5.dex */
public final class GroupsFieldsDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsFieldsDto[] $VALUES;

    @pmi0("action_button")
    public static final GroupsFieldsDto ACTION_BUTTON;

    @pmi0("activity")
    public static final GroupsFieldsDto ACTIVITY;

    @pmi0("addresses")
    public static final GroupsFieldsDto ADDRESSES;

    @pmi0("admin_level")
    public static final GroupsFieldsDto ADMIN_LEVEL;

    @pmi0("ads_easy_promote")
    public static final GroupsFieldsDto ADS_EASY_PROMOTE;

    @pmi0("ads_easy_promote_allowed")
    public static final GroupsFieldsDto ADS_EASY_PROMOTE_ALLOWED;

    @pmi0("ads_easy_promote_reasons_not_allowed")
    public static final GroupsFieldsDto ADS_EASY_PROMOTE_REASONS_NOT_ALLOWED;

    @pmi0("ads_market_autopromote_allowed")
    public static final GroupsFieldsDto ADS_MARKET_AUTOPROMOTE_ALLOWED;

    @pmi0("ads_market_autopromote_reasons_not_allowed")
    public static final GroupsFieldsDto ADS_MARKET_AUTOPROMOTE_REASONS_NOT_ALLOWED;

    @pmi0("ads_market_easy_promote")
    public static final GroupsFieldsDto ADS_MARKET_EASY_PROMOTE;

    @pmi0("ads_market_services_autopromote_allowed")
    public static final GroupsFieldsDto ADS_MARKET_SERVICES_AUTOPROMOTE_ALLOWED;

    @pmi0("ads_market_services_autopromote_reasons_not_allowed")
    public static final GroupsFieldsDto ADS_MARKET_SERVICES_AUTOPROMOTE_REASONS_NOT_ALLOWED;

    @pmi0("ads_market_services_easy_promote")
    public static final GroupsFieldsDto ADS_MARKET_SERVICES_EASY_PROMOTE;

    @pmi0("ads_posting_restricted_today")
    public static final GroupsFieldsDto ADS_POSTING_RESTRICTED_TODAY;

    @pmi0("ads_posts_info")
    public static final GroupsFieldsDto ADS_POSTS_INFO;

    @pmi0("age_limits")
    public static final GroupsFieldsDto AGE_LIMITS;

    @pmi0("age_mark")
    public static final GroupsFieldsDto AGE_MARK;

    @pmi0("app_button")
    public static final GroupsFieldsDto APP_BUTTON;

    @pmi0("app_buttons")
    public static final GroupsFieldsDto APP_BUTTONS;

    @pmi0("audio_artist_id")
    public static final GroupsFieldsDto AUDIO_ARTIST_ID;

    @pmi0("audio_curator_id")
    public static final GroupsFieldsDto AUDIO_CURATOR_ID;

    @pmi0("authors_marketplace")
    public static final GroupsFieldsDto AUTHORS_MARKETPLACE;

    @pmi0("author_id")
    public static final GroupsFieldsDto AUTHOR_ID;

    @pmi0("banner_ads_main_client")
    public static final GroupsFieldsDto BANNER_ADS_MAIN_CLIENT;

    @pmi0("banner_ads_main_mvk")
    public static final GroupsFieldsDto BANNER_ADS_MAIN_MVK;

    @pmi0("banner_ads_setting_miniapp")
    public static final GroupsFieldsDto BANNER_ADS_SETTING_MINIAPP;

    @pmi0("ban_info")
    public static final GroupsFieldsDto BAN_INFO;

    @pmi0("business_community_tooltips")
    public static final GroupsFieldsDto BUSINESS_COMMUNITY_TOOLTIPS;

    @pmi0("buttons")
    public static final GroupsFieldsDto BUTTONS;

    @pmi0("can_call_to_community")
    public static final GroupsFieldsDto CAN_CALL_TO_COMMUNITY;

    @pmi0("can_create_topic")
    public static final GroupsFieldsDto CAN_CREATE_TOPIC;

    @pmi0("can_manage")
    public static final GroupsFieldsDto CAN_MANAGE;

    @pmi0("can_message")
    public static final GroupsFieldsDto CAN_MESSAGE;

    @pmi0("can_post")
    public static final GroupsFieldsDto CAN_POST;

    @pmi0("can_post_donut")
    public static final GroupsFieldsDto CAN_POST_DONUT;

    @pmi0("can_report")
    public static final GroupsFieldsDto CAN_REPORT;

    @pmi0("can_see_all_posts")
    public static final GroupsFieldsDto CAN_SEE_ALL_POSTS;

    @pmi0("can_see_invite_links")
    public static final GroupsFieldsDto CAN_SEE_INVITE_LINKS;

    @pmi0("can_see_members")
    public static final GroupsFieldsDto CAN_SEE_MEMBERS;

    @pmi0("can_send_notify")
    public static final GroupsFieldsDto CAN_SEND_NOTIFY;

    @pmi0("can_subscribe_podcasts")
    public static final GroupsFieldsDto CAN_SUBSCRIBE_PODCASTS;

    @pmi0("can_subscribe_posts")
    public static final GroupsFieldsDto CAN_SUBSCRIBE_POSTS;

    @pmi0("can_subscribe_stories")
    public static final GroupsFieldsDto CAN_SUBSCRIBE_STORIES;

    @pmi0("can_suggest")
    public static final GroupsFieldsDto CAN_SUGGEST;

    @pmi0("can_upload_clip")
    public static final GroupsFieldsDto CAN_UPLOAD_CLIP;

    @pmi0("can_upload_doc")
    public static final GroupsFieldsDto CAN_UPLOAD_DOC;

    @pmi0("can_upload_story")
    public static final GroupsFieldsDto CAN_UPLOAD_STORY;

    @pmi0("can_upload_video")
    public static final GroupsFieldsDto CAN_UPLOAD_VIDEO;

    @pmi0("can_view_post_reach_stats")
    public static final GroupsFieldsDto CAN_VIEW_POST_REACH_STATS;

    @pmi0("can_view_stats")
    public static final GroupsFieldsDto CAN_VIEW_STATS;

    @pmi0("category1_name")
    public static final GroupsFieldsDto CATEGORY1_NAME;

    @pmi0("category2")
    public static final GroupsFieldsDto CATEGORY2;

    @pmi0("chats_status")
    public static final GroupsFieldsDto CHATS_STATUS;

    @pmi0("city")
    public static final GroupsFieldsDto CITY;

    @pmi0("classifieds_antibaraholka_design_version")
    public static final GroupsFieldsDto CLASSIFIEDS_ANTIBARAHOLKA_DESIGN_VERSION;

    @pmi0("clips_count")
    public static final GroupsFieldsDto CLIPS_COUNT;

    @pmi0("contacts")
    public static final GroupsFieldsDto CONTACTS;

    @pmi0("counters")
    public static final GroupsFieldsDto COUNTERS;

    @pmi0("country")
    public static final GroupsFieldsDto COUNTRY;

    @pmi0("cover")
    public static final GroupsFieldsDto COVER;

    @pmi0("create_date")
    public static final GroupsFieldsDto CREATE_DATE;

    @pmi0("crop_photo")
    public static final GroupsFieldsDto CROP_PHOTO;

    @pmi0("deactivated")
    public static final GroupsFieldsDto DEACTIVATED;

    @pmi0("deactivated_message")
    public static final GroupsFieldsDto DEACTIVATED_MESSAGE;

    @pmi0("deactivated_type")
    public static final GroupsFieldsDto DEACTIVATED_TYPE;

    @pmi0("description")
    public static final GroupsFieldsDto DESCRIPTION;

    @pmi0("donut")
    public static final GroupsFieldsDto DONUT;

    @pmi0("donut_payment_info")
    public static final GroupsFieldsDto DONUT_PAYMENT_INFO;

    @pmi0("est_date")
    public static final GroupsFieldsDto EST_DATE;

    @pmi0("extended_market")
    public static final GroupsFieldsDto EXTENDED_MARKET;

    @pmi0("finish_date")
    public static final GroupsFieldsDto FINISH_DATE;

    @pmi0("fixed_post")
    public static final GroupsFieldsDto FIXED_POST;

    @pmi0("friends")
    public static final GroupsFieldsDto FRIENDS;

    @pmi0("group_channel")
    public static final GroupsFieldsDto GROUP_CHANNEL;

    @pmi0("had_torch")
    public static final GroupsFieldsDto HAD_TORCH;

    @pmi0("has_group_channel")
    public static final GroupsFieldsDto HAS_GROUP_CHANNEL;

    @pmi0("has_live_cover")
    public static final GroupsFieldsDto HAS_LIVE_COVER;

    @pmi0("has_market_app")
    public static final GroupsFieldsDto HAS_MARKET_APP;

    @pmi0("has_photo")
    public static final GroupsFieldsDto HAS_PHOTO;

    @pmi0("has_suggestions")
    public static final GroupsFieldsDto HAS_SUGGESTIONS;

    @pmi0("has_unseen_stories")
    public static final GroupsFieldsDto HAS_UNSEEN_STORIES;

    @pmi0("id")
    public static final GroupsFieldsDto ID;

    @pmi0("inn")
    public static final GroupsFieldsDto INN;

    @pmi0("installed_apps_count")
    public static final GroupsFieldsDto INSTALLED_APPS_COUNT;

    @pmi0("invited_by")
    public static final GroupsFieldsDto INVITED_BY;

    @pmi0("is_admin")
    public static final GroupsFieldsDto IS_ADMIN;

    @pmi0("is_adult")
    public static final GroupsFieldsDto IS_ADULT;

    @pmi0("is_advertiser")
    public static final GroupsFieldsDto IS_ADVERTISER;

    @pmi0("is_business")
    public static final GroupsFieldsDto IS_BUSINESS;

    @pmi0("is_business_category")
    public static final GroupsFieldsDto IS_BUSINESS_CATEGORY;

    @pmi0("is_clips_notifications_ignored")
    public static final GroupsFieldsDto IS_CLIPS_NOTIFICATIONS_IGNORED;

    @pmi0("is_closed")
    public static final GroupsFieldsDto IS_CLOSED;

    @pmi0("is_favorite")
    public static final GroupsFieldsDto IS_FAVORITE;

    @pmi0("is_government_organization")
    public static final GroupsFieldsDto IS_GOVERNMENT_ORGANIZATION;

    @pmi0("is_hidden_from_feed")
    public static final GroupsFieldsDto IS_HIDDEN_FROM_FEED;

    @pmi0("is_market_cart_enabled")
    public static final GroupsFieldsDto IS_MARKET_CART_ENABLED;

    @pmi0("is_media_wall_enabled")
    public static final GroupsFieldsDto IS_MEDIA_WALL_ENABLED;

    @pmi0("is_member")
    public static final GroupsFieldsDto IS_MEMBER;

    @pmi0("is_messages_blocked")
    public static final GroupsFieldsDto IS_MESSAGES_BLOCKED;

    @pmi0("is_set_tab_order")
    public static final GroupsFieldsDto IS_SET_TAB_ORDER;

    @pmi0("is_subscribed")
    public static final GroupsFieldsDto IS_SUBSCRIBED;

    @pmi0("is_subscribed_podcasts")
    public static final GroupsFieldsDto IS_SUBSCRIBED_PODCASTS;

    @pmi0("is_subscribed_stories")
    public static final GroupsFieldsDto IS_SUBSCRIBED_STORIES;

    @pmi0("is_subscribed_textlives")
    public static final GroupsFieldsDto IS_SUBSCRIBED_TEXTLIVES;

    @pmi0("is_video_live_notifications_blocked")
    public static final GroupsFieldsDto IS_VIDEO_LIVE_NOTIFICATIONS_BLOCKED;

    @pmi0("is_widget_messages_enabled")
    public static final GroupsFieldsDto IS_WIDGET_MESSAGES_ENABLED;

    @pmi0("is_youla_posting_to_wall_allowed")
    public static final GroupsFieldsDto IS_YOULA_POSTING_TO_WALL_ALLOWED;

    @pmi0("kpp")
    public static final GroupsFieldsDto KPP;

    @pmi0("leave_mode")
    public static final GroupsFieldsDto LEAVE_MODE;

    @pmi0("like")
    public static final GroupsFieldsDto LIKE;

    @pmi0("links")
    public static final GroupsFieldsDto LINKS;

    @pmi0("live_covers")
    public static final GroupsFieldsDto LIVE_COVERS;

    @pmi0("login_confirmation_status")
    public static final GroupsFieldsDto LOGIN_CONFIRMATION_STATUS;

    @pmi0("main_album_id")
    public static final GroupsFieldsDto MAIN_ALBUM_ID;

    @pmi0("main_section")
    public static final GroupsFieldsDto MAIN_SECTION;

    @pmi0("market")
    public static final GroupsFieldsDto MARKET;

    @pmi0("market_services")
    public static final GroupsFieldsDto MARKET_SERVICES;

    @pmi0("members_count")
    public static final GroupsFieldsDto MEMBERS_COUNT;

    @pmi0("members_count_text")
    public static final GroupsFieldsDto MEMBERS_COUNT_TEXT;

    @pmi0("member_status")
    public static final GroupsFieldsDto MEMBER_STATUS;

    @pmi0("menu")
    public static final GroupsFieldsDto MENU;

    @pmi0("microlanding")
    public static final GroupsFieldsDto MICROLANDING;

    @pmi0("msg_push_allowed")
    public static final GroupsFieldsDto MSG_PUSH_ALLOWED;

    @pmi0("music_awards")
    public static final GroupsFieldsDto MUSIC_AWARDS;

    @pmi0("name")
    public static final GroupsFieldsDto NAME;

    @pmi0("name_history")
    public static final GroupsFieldsDto NAME_HISTORY;

    @pmi0("ogrn")
    public static final GroupsFieldsDto OGRN;

    @pmi0("online_status")
    public static final GroupsFieldsDto ONLINE_STATUS;

    @pmi0("phone")
    public static final GroupsFieldsDto PHONE;

    @pmi0("photo_100")
    public static final GroupsFieldsDto PHOTO_100;

    @pmi0("photo_200")
    public static final GroupsFieldsDto PHOTO_200;

    @pmi0("photo_200_orig")
    public static final GroupsFieldsDto PHOTO_200_ORIG;

    @pmi0("photo_400")
    public static final GroupsFieldsDto PHOTO_400;

    @pmi0("photo_400_orig")
    public static final GroupsFieldsDto PHOTO_400_ORIG;

    @pmi0("photo_50")
    public static final GroupsFieldsDto PHOTO_50;

    @pmi0("photo_avg_color")
    public static final GroupsFieldsDto PHOTO_AVG_COLOR;

    @pmi0("photo_base")
    public static final GroupsFieldsDto PHOTO_BASE;

    @pmi0("photo_max")
    public static final GroupsFieldsDto PHOTO_MAX;

    @pmi0("photo_max_orig")
    public static final GroupsFieldsDto PHOTO_MAX_ORIG;

    @pmi0("photo_max_size")
    public static final GroupsFieldsDto PHOTO_MAX_SIZE;

    @pmi0("place")
    public static final GroupsFieldsDto PLACE;

    @pmi0("post_reach_avg_current_month")
    public static final GroupsFieldsDto POST_REACH_AVG_CURRENT_MONTH;

    @pmi0("public_category")
    public static final GroupsFieldsDto PUBLIC_CATEGORY;

    @pmi0("public_date_label")
    public static final GroupsFieldsDto PUBLIC_DATE_LABEL;

    @pmi0("public_subcategory")
    public static final GroupsFieldsDto PUBLIC_SUBCATEGORY;

    @pmi0(CampaignEx.JSON_KEY_STAR)
    public static final GroupsFieldsDto RATING;

    @pmi0("recommended_tips_widget")
    public static final GroupsFieldsDto RECOMMENDED_TIPS_WIDGET;

    @pmi0(TtmlNode.TAG_REGION)
    public static final GroupsFieldsDto REGION;

    @pmi0("requests_count")
    public static final GroupsFieldsDto REQUESTS_COUNT;

    @pmi0("screen_name")
    public static final GroupsFieldsDto SCREEN_NAME;

    @pmi0("secondary_section")
    public static final GroupsFieldsDto SECONDARY_SECTION;

    @pmi0("service_rating")
    public static final GroupsFieldsDto SERVICE_RATING;

    @pmi0("settings_tooltips_active")
    public static final GroupsFieldsDto SETTINGS_TOOLTIPS_ACTIVE;

    @pmi0("show_suggestions")
    public static final GroupsFieldsDto SHOW_SUGGESTIONS;

    @pmi0("site")
    public static final GroupsFieldsDto SITE;

    @pmi0("start_date")
    public static final GroupsFieldsDto START_DATE;

    @pmi0("status")
    public static final GroupsFieldsDto STATUS;

    @pmi0("status_audio")
    public static final GroupsFieldsDto STATUS_AUDIO;

    @pmi0("stories_archive_count")
    public static final GroupsFieldsDto STORIES_ARCHIVE_COUNT;

    @pmi0("subject")
    public static final GroupsFieldsDto SUBJECT;

    @pmi0("subject_id")
    public static final GroupsFieldsDto SUBJECT_ID;

    @pmi0("targ_artist_id")
    public static final GroupsFieldsDto TARG_ARTIST_ID;

    @pmi0("tariffs")
    public static final GroupsFieldsDto TARIFFS;

    @pmi0("textlive")
    public static final GroupsFieldsDto TEXTLIVE;

    @pmi0("textlives_count")
    public static final GroupsFieldsDto TEXTLIVES_COUNT;

    @pmi0("thematic")
    public static final GroupsFieldsDto THEMATIC;

    @pmi0("trending")
    public static final GroupsFieldsDto TRENDING;

    @pmi0("type")
    public static final GroupsFieldsDto TYPE;

    @pmi0("using_vkpay_market_app")
    public static final GroupsFieldsDto USING_VKPAY_MARKET_APP;

    @pmi0("verification_end_time")
    public static final GroupsFieldsDto VERIFICATION_END_TIME;

    @pmi0("verified")
    public static final GroupsFieldsDto VERIFIED;

    @pmi0("video_live")
    public static final GroupsFieldsDto VIDEO_LIVE;

    @pmi0("video_live_count")
    public static final GroupsFieldsDto VIDEO_LIVE_COUNT;

    @pmi0("video_live_level")
    public static final GroupsFieldsDto VIDEO_LIVE_LEVEL;

    @pmi0("vkpay_can_transfer")
    public static final GroupsFieldsDto VKPAY_CAN_TRANSFER;

    @pmi0("vkpay_receiver_id")
    public static final GroupsFieldsDto VKPAY_RECEIVER_ID;

    @pmi0("vk_admin_status")
    public static final GroupsFieldsDto VK_ADMIN_STATUS;

    @pmi0("wall")
    public static final GroupsFieldsDto WALL;

    @pmi0("warning_notification")
    public static final GroupsFieldsDto WARNING_NOTIFICATION;

    @pmi0("wiki_page")
    public static final GroupsFieldsDto WIKI_PAGE;

    @pmi0("worki_classifieds_vacancy_price")
    public static final GroupsFieldsDto WORKI_CLASSIFIEDS_VACANCY_PRICE;

    @pmi0("worki_use_wallpost_redirect")
    public static final GroupsFieldsDto WORKI_USE_WALLPOST_REDIRECT;

    @pmi0("youla_posting_method")
    public static final GroupsFieldsDto YOULA_POSTING_METHOD;

    @pmi0("youla_status")
    public static final GroupsFieldsDto YOULA_STATUS;

    @pmi0("youla_use_wallpost_redirect")
    public static final GroupsFieldsDto YOULA_USE_WALLPOST_REDIRECT;

    @pmi0("youla_use_wallpost_redirect_onboarding")
    public static final GroupsFieldsDto YOULA_USE_WALLPOST_REDIRECT_ONBOARDING;

    @pmi0("youla_wallpost_redirect_miniapp_url")
    public static final GroupsFieldsDto YOULA_WALLPOST_REDIRECT_MINIAPP_URL;
    private final String value;

    static {
        GroupsFieldsDto groupsFieldsDto = new GroupsFieldsDto("ID", 0, "id");
        ID = groupsFieldsDto;
        GroupsFieldsDto groupsFieldsDto2 = new GroupsFieldsDto("NAME", 1, "name");
        NAME = groupsFieldsDto2;
        GroupsFieldsDto groupsFieldsDto3 = new GroupsFieldsDto("SCREEN_NAME", 2, "screen_name");
        SCREEN_NAME = groupsFieldsDto3;
        GroupsFieldsDto groupsFieldsDto4 = new GroupsFieldsDto("IS_CLOSED", 3, "is_closed");
        IS_CLOSED = groupsFieldsDto4;
        GroupsFieldsDto groupsFieldsDto5 = new GroupsFieldsDto(CredentialProviderBaseController.TYPE_TAG, 4, "type");
        TYPE = groupsFieldsDto5;
        GroupsFieldsDto groupsFieldsDto6 = new GroupsFieldsDto("IS_ADMIN", 5, "is_admin");
        IS_ADMIN = groupsFieldsDto6;
        GroupsFieldsDto groupsFieldsDto7 = new GroupsFieldsDto("ADMIN_LEVEL", 6, "admin_level");
        ADMIN_LEVEL = groupsFieldsDto7;
        GroupsFieldsDto groupsFieldsDto8 = new GroupsFieldsDto("IS_MEMBER", 7, "is_member");
        IS_MEMBER = groupsFieldsDto8;
        GroupsFieldsDto groupsFieldsDto9 = new GroupsFieldsDto("IS_ADVERTISER", 8, "is_advertiser");
        IS_ADVERTISER = groupsFieldsDto9;
        GroupsFieldsDto groupsFieldsDto10 = new GroupsFieldsDto("START_DATE", 9, "start_date");
        START_DATE = groupsFieldsDto10;
        GroupsFieldsDto groupsFieldsDto11 = new GroupsFieldsDto("FINISH_DATE", 10, "finish_date");
        FINISH_DATE = groupsFieldsDto11;
        GroupsFieldsDto groupsFieldsDto12 = new GroupsFieldsDto("DEACTIVATED", 11, "deactivated");
        DEACTIVATED = groupsFieldsDto12;
        GroupsFieldsDto groupsFieldsDto13 = new GroupsFieldsDto("PHOTO_50", 12, "photo_50");
        PHOTO_50 = groupsFieldsDto13;
        GroupsFieldsDto groupsFieldsDto14 = new GroupsFieldsDto("PHOTO_100", 13, "photo_100");
        PHOTO_100 = groupsFieldsDto14;
        GroupsFieldsDto groupsFieldsDto15 = new GroupsFieldsDto("PHOTO_200", 14, "photo_200");
        PHOTO_200 = groupsFieldsDto15;
        GroupsFieldsDto groupsFieldsDto16 = new GroupsFieldsDto("PHOTO_200_ORIG", 15, "photo_200_orig");
        PHOTO_200_ORIG = groupsFieldsDto16;
        GroupsFieldsDto groupsFieldsDto17 = new GroupsFieldsDto("PHOTO_400", 16, "photo_400");
        PHOTO_400 = groupsFieldsDto17;
        GroupsFieldsDto groupsFieldsDto18 = new GroupsFieldsDto("PHOTO_400_ORIG", 17, "photo_400_orig");
        PHOTO_400_ORIG = groupsFieldsDto18;
        GroupsFieldsDto groupsFieldsDto19 = new GroupsFieldsDto("PHOTO_MAX", 18, "photo_max");
        PHOTO_MAX = groupsFieldsDto19;
        GroupsFieldsDto groupsFieldsDto20 = new GroupsFieldsDto("PHOTO_MAX_ORIG", 19, "photo_max_orig");
        PHOTO_MAX_ORIG = groupsFieldsDto20;
        GroupsFieldsDto groupsFieldsDto21 = new GroupsFieldsDto("PHOTO_BASE", 20, "photo_base");
        PHOTO_BASE = groupsFieldsDto21;
        GroupsFieldsDto groupsFieldsDto22 = new GroupsFieldsDto("EST_DATE", 21, "est_date");
        EST_DATE = groupsFieldsDto22;
        GroupsFieldsDto groupsFieldsDto23 = new GroupsFieldsDto("PUBLIC_DATE_LABEL", 22, "public_date_label");
        PUBLIC_DATE_LABEL = groupsFieldsDto23;
        GroupsFieldsDto groupsFieldsDto24 = new GroupsFieldsDto("PHOTO_MAX_SIZE", 23, "photo_max_size");
        PHOTO_MAX_SIZE = groupsFieldsDto24;
        GroupsFieldsDto groupsFieldsDto25 = new GroupsFieldsDto("IS_VIDEO_LIVE_NOTIFICATIONS_BLOCKED", 24, "is_video_live_notifications_blocked");
        IS_VIDEO_LIVE_NOTIFICATIONS_BLOCKED = groupsFieldsDto25;
        GroupsFieldsDto groupsFieldsDto26 = new GroupsFieldsDto("VIDEO_LIVE", 25, "video_live");
        VIDEO_LIVE = groupsFieldsDto26;
        GroupsFieldsDto groupsFieldsDto27 = new GroupsFieldsDto("MARKET", 26, "market");
        MARKET = groupsFieldsDto27;
        GroupsFieldsDto groupsFieldsDto28 = new GroupsFieldsDto("MEMBER_STATUS", 27, "member_status");
        MEMBER_STATUS = groupsFieldsDto28;
        GroupsFieldsDto groupsFieldsDto29 = new GroupsFieldsDto("IS_ADULT", 28, "is_adult");
        IS_ADULT = groupsFieldsDto29;
        GroupsFieldsDto groupsFieldsDto30 = new GroupsFieldsDto("IS_HIDDEN_FROM_FEED", 29, "is_hidden_from_feed");
        IS_HIDDEN_FROM_FEED = groupsFieldsDto30;
        GroupsFieldsDto groupsFieldsDto31 = new GroupsFieldsDto("IS_FAVORITE", 30, "is_favorite");
        IS_FAVORITE = groupsFieldsDto31;
        GroupsFieldsDto groupsFieldsDto32 = new GroupsFieldsDto("IS_SUBSCRIBED", 31, "is_subscribed");
        IS_SUBSCRIBED = groupsFieldsDto32;
        GroupsFieldsDto groupsFieldsDto33 = new GroupsFieldsDto("CITY", 32, "city");
        CITY = groupsFieldsDto33;
        GroupsFieldsDto groupsFieldsDto34 = new GroupsFieldsDto("COUNTRY", 33, "country");
        COUNTRY = groupsFieldsDto34;
        GroupsFieldsDto groupsFieldsDto35 = new GroupsFieldsDto("VERIFIED", 34, "verified");
        VERIFIED = groupsFieldsDto35;
        GroupsFieldsDto groupsFieldsDto36 = new GroupsFieldsDto(NativeAdContent.ViewTag.AD_DESCRIPTION, 35, "description");
        DESCRIPTION = groupsFieldsDto36;
        GroupsFieldsDto groupsFieldsDto37 = new GroupsFieldsDto("WIKI_PAGE", 36, "wiki_page");
        WIKI_PAGE = groupsFieldsDto37;
        GroupsFieldsDto groupsFieldsDto38 = new GroupsFieldsDto("MEMBERS_COUNT", 37, "members_count");
        MEMBERS_COUNT = groupsFieldsDto38;
        GroupsFieldsDto groupsFieldsDto39 = new GroupsFieldsDto("MEMBERS_COUNT_TEXT", 38, "members_count_text");
        MEMBERS_COUNT_TEXT = groupsFieldsDto39;
        GroupsFieldsDto groupsFieldsDto40 = new GroupsFieldsDto("REQUESTS_COUNT", 39, "requests_count");
        REQUESTS_COUNT = groupsFieldsDto40;
        GroupsFieldsDto groupsFieldsDto41 = new GroupsFieldsDto("VIDEO_LIVE_LEVEL", 40, "video_live_level");
        VIDEO_LIVE_LEVEL = groupsFieldsDto41;
        GroupsFieldsDto groupsFieldsDto42 = new GroupsFieldsDto("VIDEO_LIVE_COUNT", 41, "video_live_count");
        VIDEO_LIVE_COUNT = groupsFieldsDto42;
        GroupsFieldsDto groupsFieldsDto43 = new GroupsFieldsDto("CLIPS_COUNT", 42, "clips_count");
        CLIPS_COUNT = groupsFieldsDto43;
        GroupsFieldsDto groupsFieldsDto44 = new GroupsFieldsDto("TEXTLIVES_COUNT", 43, "textlives_count");
        TEXTLIVES_COUNT = groupsFieldsDto44;
        GroupsFieldsDto groupsFieldsDto45 = new GroupsFieldsDto("COUNTERS", 44, "counters");
        COUNTERS = groupsFieldsDto45;
        GroupsFieldsDto groupsFieldsDto46 = new GroupsFieldsDto("COVER", 45, "cover");
        COVER = groupsFieldsDto46;
        GroupsFieldsDto groupsFieldsDto47 = new GroupsFieldsDto("CAN_POST", 46, "can_post");
        CAN_POST = groupsFieldsDto47;
        GroupsFieldsDto groupsFieldsDto48 = new GroupsFieldsDto("CAN_SUGGEST", 47, "can_suggest");
        CAN_SUGGEST = groupsFieldsDto48;
        GroupsFieldsDto groupsFieldsDto49 = new GroupsFieldsDto("CAN_UPLOAD_STORY", 48, "can_upload_story");
        CAN_UPLOAD_STORY = groupsFieldsDto49;
        GroupsFieldsDto groupsFieldsDto50 = new GroupsFieldsDto("CAN_UPLOAD_DOC", 49, "can_upload_doc");
        CAN_UPLOAD_DOC = groupsFieldsDto50;
        GroupsFieldsDto groupsFieldsDto51 = new GroupsFieldsDto("CAN_UPLOAD_VIDEO", 50, "can_upload_video");
        CAN_UPLOAD_VIDEO = groupsFieldsDto51;
        GroupsFieldsDto groupsFieldsDto52 = new GroupsFieldsDto("CAN_UPLOAD_CLIP", 51, "can_upload_clip");
        CAN_UPLOAD_CLIP = groupsFieldsDto52;
        GroupsFieldsDto groupsFieldsDto53 = new GroupsFieldsDto("CAN_SEE_ALL_POSTS", 52, "can_see_all_posts");
        CAN_SEE_ALL_POSTS = groupsFieldsDto53;
        GroupsFieldsDto groupsFieldsDto54 = new GroupsFieldsDto("CAN_CREATE_TOPIC", 53, "can_create_topic");
        CAN_CREATE_TOPIC = groupsFieldsDto54;
        GroupsFieldsDto groupsFieldsDto55 = new GroupsFieldsDto("ACTIVITY", 54, "activity");
        ACTIVITY = groupsFieldsDto55;
        GroupsFieldsDto groupsFieldsDto56 = new GroupsFieldsDto("FIXED_POST", 55, "fixed_post");
        FIXED_POST = groupsFieldsDto56;
        GroupsFieldsDto groupsFieldsDto57 = new GroupsFieldsDto("HAS_PHOTO", 56, "has_photo");
        HAS_PHOTO = groupsFieldsDto57;
        GroupsFieldsDto groupsFieldsDto58 = new GroupsFieldsDto("CROP_PHOTO", 57, "crop_photo");
        CROP_PHOTO = groupsFieldsDto58;
        GroupsFieldsDto groupsFieldsDto59 = new GroupsFieldsDto(CommonConstant.RETKEY.STATUS, 58, "status");
        STATUS = groupsFieldsDto59;
        GroupsFieldsDto groupsFieldsDto60 = new GroupsFieldsDto("STATUS_AUDIO", 59, "status_audio");
        STATUS_AUDIO = groupsFieldsDto60;
        GroupsFieldsDto groupsFieldsDto61 = new GroupsFieldsDto("MAIN_ALBUM_ID", 60, "main_album_id");
        MAIN_ALBUM_ID = groupsFieldsDto61;
        GroupsFieldsDto groupsFieldsDto62 = new GroupsFieldsDto("LINKS", 61, "links");
        LINKS = groupsFieldsDto62;
        GroupsFieldsDto groupsFieldsDto63 = new GroupsFieldsDto("CONTACTS", 62, "contacts");
        CONTACTS = groupsFieldsDto63;
        GroupsFieldsDto groupsFieldsDto64 = new GroupsFieldsDto("WALL", 63, "wall");
        WALL = groupsFieldsDto64;
        GroupsFieldsDto groupsFieldsDto65 = new GroupsFieldsDto("SITE", 64, "site");
        SITE = groupsFieldsDto65;
        GroupsFieldsDto groupsFieldsDto66 = new GroupsFieldsDto("MAIN_SECTION", 65, "main_section");
        MAIN_SECTION = groupsFieldsDto66;
        GroupsFieldsDto groupsFieldsDto67 = new GroupsFieldsDto("SECONDARY_SECTION", 66, "secondary_section");
        SECONDARY_SECTION = groupsFieldsDto67;
        GroupsFieldsDto groupsFieldsDto68 = new GroupsFieldsDto("TRENDING", 67, "trending");
        TRENDING = groupsFieldsDto68;
        GroupsFieldsDto groupsFieldsDto69 = new GroupsFieldsDto("CAN_MESSAGE", 68, "can_message");
        CAN_MESSAGE = groupsFieldsDto69;
        GroupsFieldsDto groupsFieldsDto70 = new GroupsFieldsDto("IS_MESSAGES_BLOCKED", 69, "is_messages_blocked");
        IS_MESSAGES_BLOCKED = groupsFieldsDto70;
        GroupsFieldsDto groupsFieldsDto71 = new GroupsFieldsDto("CAN_SEND_NOTIFY", 70, "can_send_notify");
        CAN_SEND_NOTIFY = groupsFieldsDto71;
        GroupsFieldsDto groupsFieldsDto72 = new GroupsFieldsDto("ONLINE_STATUS", 71, "online_status");
        ONLINE_STATUS = groupsFieldsDto72;
        GroupsFieldsDto groupsFieldsDto73 = new GroupsFieldsDto("INVITED_BY", 72, "invited_by");
        INVITED_BY = groupsFieldsDto73;
        GroupsFieldsDto groupsFieldsDto74 = new GroupsFieldsDto("AGE_LIMITS", 73, "age_limits");
        AGE_LIMITS = groupsFieldsDto74;
        GroupsFieldsDto groupsFieldsDto75 = new GroupsFieldsDto("BAN_INFO", 74, "ban_info");
        BAN_INFO = groupsFieldsDto75;
        GroupsFieldsDto groupsFieldsDto76 = new GroupsFieldsDto("HAS_MARKET_APP", 75, "has_market_app");
        HAS_MARKET_APP = groupsFieldsDto76;
        GroupsFieldsDto groupsFieldsDto77 = new GroupsFieldsDto("USING_VKPAY_MARKET_APP", 76, "using_vkpay_market_app");
        USING_VKPAY_MARKET_APP = groupsFieldsDto77;
        GroupsFieldsDto groupsFieldsDto78 = new GroupsFieldsDto("HAS_GROUP_CHANNEL", 77, "has_group_channel");
        HAS_GROUP_CHANNEL = groupsFieldsDto78;
        GroupsFieldsDto groupsFieldsDto79 = new GroupsFieldsDto("ADDRESSES", 78, "addresses");
        ADDRESSES = groupsFieldsDto79;
        GroupsFieldsDto groupsFieldsDto80 = new GroupsFieldsDto("IS_SUBSCRIBED_PODCASTS", 79, "is_subscribed_podcasts");
        IS_SUBSCRIBED_PODCASTS = groupsFieldsDto80;
        GroupsFieldsDto groupsFieldsDto81 = new GroupsFieldsDto("CAN_SUBSCRIBE_PODCASTS", 80, "can_subscribe_podcasts");
        CAN_SUBSCRIBE_PODCASTS = groupsFieldsDto81;
        GroupsFieldsDto groupsFieldsDto82 = new GroupsFieldsDto("CAN_SUBSCRIBE_POSTS", 81, "can_subscribe_posts");
        CAN_SUBSCRIBE_POSTS = groupsFieldsDto82;
        GroupsFieldsDto groupsFieldsDto83 = new GroupsFieldsDto("LIVE_COVERS", 82, "live_covers");
        LIVE_COVERS = groupsFieldsDto83;
        GroupsFieldsDto groupsFieldsDto84 = new GroupsFieldsDto("STORIES_ARCHIVE_COUNT", 83, "stories_archive_count");
        STORIES_ARCHIVE_COUNT = groupsFieldsDto84;
        GroupsFieldsDto groupsFieldsDto85 = new GroupsFieldsDto("HAS_UNSEEN_STORIES", 84, "has_unseen_stories");
        HAS_UNSEEN_STORIES = groupsFieldsDto85;
        GroupsFieldsDto groupsFieldsDto86 = new GroupsFieldsDto("LIKE", 85, "like");
        LIKE = groupsFieldsDto86;
        GroupsFieldsDto groupsFieldsDto87 = new GroupsFieldsDto(Privacy.FRIENDS, 86, "friends");
        FRIENDS = groupsFieldsDto87;
        GroupsFieldsDto groupsFieldsDto88 = new GroupsFieldsDto("HAD_TORCH", 87, "had_torch");
        HAD_TORCH = groupsFieldsDto88;
        GroupsFieldsDto groupsFieldsDto89 = new GroupsFieldsDto("WORKI_CLASSIFIEDS_VACANCY_PRICE", 88, "worki_classifieds_vacancy_price");
        WORKI_CLASSIFIEDS_VACANCY_PRICE = groupsFieldsDto89;
        GroupsFieldsDto groupsFieldsDto90 = new GroupsFieldsDto("IS_WIDGET_MESSAGES_ENABLED", 89, "is_widget_messages_enabled");
        IS_WIDGET_MESSAGES_ENABLED = groupsFieldsDto90;
        GroupsFieldsDto groupsFieldsDto91 = new GroupsFieldsDto("VKPAY_CAN_TRANSFER", 90, "vkpay_can_transfer");
        VKPAY_CAN_TRANSFER = groupsFieldsDto91;
        GroupsFieldsDto groupsFieldsDto92 = new GroupsFieldsDto("VKPAY_RECEIVER_ID", 91, "vkpay_receiver_id");
        VKPAY_RECEIVER_ID = groupsFieldsDto92;
        GroupsFieldsDto groupsFieldsDto93 = new GroupsFieldsDto("PHONE", 92, "phone");
        PHONE = groupsFieldsDto93;
        GroupsFieldsDto groupsFieldsDto94 = new GroupsFieldsDto("APP_BUTTON", 93, "app_button");
        APP_BUTTON = groupsFieldsDto94;
        GroupsFieldsDto groupsFieldsDto95 = new GroupsFieldsDto("APP_BUTTONS", 94, "app_buttons");
        APP_BUTTONS = groupsFieldsDto95;
        GroupsFieldsDto groupsFieldsDto96 = new GroupsFieldsDto("AUDIO_ARTIST_ID", 95, "audio_artist_id");
        AUDIO_ARTIST_ID = groupsFieldsDto96;
        GroupsFieldsDto groupsFieldsDto97 = new GroupsFieldsDto("AUDIO_CURATOR_ID", 96, "audio_curator_id");
        AUDIO_CURATOR_ID = groupsFieldsDto97;
        GroupsFieldsDto groupsFieldsDto98 = new GroupsFieldsDto("BUTTONS", 97, "buttons");
        BUTTONS = groupsFieldsDto98;
        GroupsFieldsDto groupsFieldsDto99 = new GroupsFieldsDto("MARKET_SERVICES", 98, "market_services");
        MARKET_SERVICES = groupsFieldsDto99;
        GroupsFieldsDto groupsFieldsDto100 = new GroupsFieldsDto("MUSIC_AWARDS", 99, "music_awards");
        MUSIC_AWARDS = groupsFieldsDto100;
        GroupsFieldsDto groupsFieldsDto101 = new GroupsFieldsDto("TEXTLIVE", 100, "textlive");
        TEXTLIVE = groupsFieldsDto101;
        GroupsFieldsDto groupsFieldsDto102 = new GroupsFieldsDto("ACTION_BUTTON", 101, "action_button");
        ACTION_BUTTON = groupsFieldsDto102;
        GroupsFieldsDto groupsFieldsDto103 = new GroupsFieldsDto("AUTHOR_ID", 102, "author_id");
        AUTHOR_ID = groupsFieldsDto103;
        GroupsFieldsDto groupsFieldsDto104 = new GroupsFieldsDto("IS_MARKET_CART_ENABLED", 103, "is_market_cart_enabled");
        IS_MARKET_CART_ENABLED = groupsFieldsDto104;
        GroupsFieldsDto groupsFieldsDto105 = new GroupsFieldsDto("GROUP_CHANNEL", 104, "group_channel");
        GROUP_CHANNEL = groupsFieldsDto105;
        GroupsFieldsDto groupsFieldsDto106 = new GroupsFieldsDto("IS_SUBSCRIBED_STORIES", 105, "is_subscribed_stories");
        IS_SUBSCRIBED_STORIES = groupsFieldsDto106;
        GroupsFieldsDto groupsFieldsDto107 = new GroupsFieldsDto("CAN_SUBSCRIBE_STORIES", Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, "can_subscribe_stories");
        CAN_SUBSCRIBE_STORIES = groupsFieldsDto107;
        GroupsFieldsDto groupsFieldsDto108 = new GroupsFieldsDto("IS_SUBSCRIBED_TEXTLIVES", ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, "is_subscribed_textlives");
        IS_SUBSCRIBED_TEXTLIVES = groupsFieldsDto108;
        GroupsFieldsDto groupsFieldsDto109 = new GroupsFieldsDto("VK_ADMIN_STATUS", 108, "vk_admin_status");
        VK_ADMIN_STATUS = groupsFieldsDto109;
        GroupsFieldsDto groupsFieldsDto110 = new GroupsFieldsDto("MENU", 109, "menu");
        MENU = groupsFieldsDto110;
        GroupsFieldsDto groupsFieldsDto111 = new GroupsFieldsDto("WARNING_NOTIFICATION", 110, "warning_notification");
        WARNING_NOTIFICATION = groupsFieldsDto111;
        GroupsFieldsDto groupsFieldsDto112 = new GroupsFieldsDto("CREATE_DATE", 111, "create_date");
        CREATE_DATE = groupsFieldsDto112;
        GroupsFieldsDto groupsFieldsDto113 = new GroupsFieldsDto("DONUT", 112, "donut");
        DONUT = groupsFieldsDto113;
        GroupsFieldsDto groupsFieldsDto114 = new GroupsFieldsDto("DONUT_PAYMENT_INFO", 113, "donut_payment_info");
        DONUT_PAYMENT_INFO = groupsFieldsDto114;
        GroupsFieldsDto groupsFieldsDto115 = new GroupsFieldsDto("CAN_POST_DONUT", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, "can_post_donut");
        CAN_POST_DONUT = groupsFieldsDto115;
        GroupsFieldsDto groupsFieldsDto116 = new GroupsFieldsDto("CAN_SEE_MEMBERS", Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, "can_see_members");
        CAN_SEE_MEMBERS = groupsFieldsDto116;
        GroupsFieldsDto groupsFieldsDto117 = new GroupsFieldsDto("MSG_PUSH_ALLOWED", 116, "msg_push_allowed");
        MSG_PUSH_ALLOWED = groupsFieldsDto117;
        GroupsFieldsDto groupsFieldsDto118 = new GroupsFieldsDto("CHATS_STATUS", Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, "chats_status");
        CHATS_STATUS = groupsFieldsDto118;
        GroupsFieldsDto groupsFieldsDto119 = new GroupsFieldsDto("CAN_REPORT", Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, "can_report");
        CAN_REPORT = groupsFieldsDto119;
        GroupsFieldsDto groupsFieldsDto120 = new GroupsFieldsDto("IS_BUSINESS", Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, "is_business");
        IS_BUSINESS = groupsFieldsDto120;
        GroupsFieldsDto groupsFieldsDto121 = new GroupsFieldsDto("IS_BUSINESS_CATEGORY", 120, "is_business_category");
        IS_BUSINESS_CATEGORY = groupsFieldsDto121;
        GroupsFieldsDto groupsFieldsDto122 = new GroupsFieldsDto("MICROLANDING", Sdk.SDKError.Reason.TPAT_ERROR_VALUE, "microlanding");
        MICROLANDING = groupsFieldsDto122;
        GroupsFieldsDto groupsFieldsDto123 = new GroupsFieldsDto("TARIFFS", Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, "tariffs");
        TARIFFS = groupsFieldsDto123;
        GroupsFieldsDto groupsFieldsDto124 = new GroupsFieldsDto("VERIFICATION_END_TIME", 123, "verification_end_time");
        VERIFICATION_END_TIME = groupsFieldsDto124;
        GroupsFieldsDto groupsFieldsDto125 = new GroupsFieldsDto("CAN_MANAGE", Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, "can_manage");
        CAN_MANAGE = groupsFieldsDto125;
        GroupsFieldsDto groupsFieldsDto126 = new GroupsFieldsDto("HAS_SUGGESTIONS", 125, "has_suggestions");
        HAS_SUGGESTIONS = groupsFieldsDto126;
        GroupsFieldsDto groupsFieldsDto127 = new GroupsFieldsDto("SHOW_SUGGESTIONS", Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, "show_suggestions");
        SHOW_SUGGESTIONS = groupsFieldsDto127;
        GroupsFieldsDto groupsFieldsDto128 = new GroupsFieldsDto("CAN_VIEW_STATS", 127, "can_view_stats");
        CAN_VIEW_STATS = groupsFieldsDto128;
        GroupsFieldsDto groupsFieldsDto129 = new GroupsFieldsDto("CAN_VIEW_POST_REACH_STATS", 128, "can_view_post_reach_stats");
        CAN_VIEW_POST_REACH_STATS = groupsFieldsDto129;
        GroupsFieldsDto groupsFieldsDto130 = new GroupsFieldsDto("ADS_EASY_PROMOTE", 129, "ads_easy_promote");
        ADS_EASY_PROMOTE = groupsFieldsDto130;
        GroupsFieldsDto groupsFieldsDto131 = new GroupsFieldsDto("ADS_EASY_PROMOTE_ALLOWED", 130, "ads_easy_promote_allowed");
        ADS_EASY_PROMOTE_ALLOWED = groupsFieldsDto131;
        GroupsFieldsDto groupsFieldsDto132 = new GroupsFieldsDto("ADS_POSTING_RESTRICTED_TODAY", Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, "ads_posting_restricted_today");
        ADS_POSTING_RESTRICTED_TODAY = groupsFieldsDto132;
        GroupsFieldsDto groupsFieldsDto133 = new GroupsFieldsDto("ADS_MARKET_AUTOPROMOTE_ALLOWED", Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, "ads_market_autopromote_allowed");
        ADS_MARKET_AUTOPROMOTE_ALLOWED = groupsFieldsDto133;
        GroupsFieldsDto groupsFieldsDto134 = new GroupsFieldsDto("ADS_MARKET_EASY_PROMOTE", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "ads_market_easy_promote");
        ADS_MARKET_EASY_PROMOTE = groupsFieldsDto134;
        GroupsFieldsDto groupsFieldsDto135 = new GroupsFieldsDto("ADS_MARKET_AUTOPROMOTE_REASONS_NOT_ALLOWED", 134, "ads_market_autopromote_reasons_not_allowed");
        ADS_MARKET_AUTOPROMOTE_REASONS_NOT_ALLOWED = groupsFieldsDto135;
        GroupsFieldsDto groupsFieldsDto136 = new GroupsFieldsDto("ADS_MARKET_SERVICES_AUTOPROMOTE_REASONS_NOT_ALLOWED", 135, "ads_market_services_autopromote_reasons_not_allowed");
        ADS_MARKET_SERVICES_AUTOPROMOTE_REASONS_NOT_ALLOWED = groupsFieldsDto136;
        GroupsFieldsDto groupsFieldsDto137 = new GroupsFieldsDto("ADS_MARKET_SERVICES_AUTOPROMOTE_ALLOWED", Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, "ads_market_services_autopromote_allowed");
        ADS_MARKET_SERVICES_AUTOPROMOTE_ALLOWED = groupsFieldsDto137;
        GroupsFieldsDto groupsFieldsDto138 = new GroupsFieldsDto("ADS_MARKET_SERVICES_EASY_PROMOTE", Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "ads_market_services_easy_promote");
        ADS_MARKET_SERVICES_EASY_PROMOTE = groupsFieldsDto138;
        GroupsFieldsDto groupsFieldsDto139 = new GroupsFieldsDto("ADS_EASY_PROMOTE_REASONS_NOT_ALLOWED", 138, "ads_easy_promote_reasons_not_allowed");
        ADS_EASY_PROMOTE_REASONS_NOT_ALLOWED = groupsFieldsDto139;
        GroupsFieldsDto groupsFieldsDto140 = new GroupsFieldsDto("CAN_SEE_INVITE_LINKS", 139, "can_see_invite_links");
        CAN_SEE_INVITE_LINKS = groupsFieldsDto140;
        GroupsFieldsDto groupsFieldsDto141 = new GroupsFieldsDto("SUBJECT_ID", VersionConstants.PRODUCT_MAJOR_VERSION, "subject_id");
        SUBJECT_ID = groupsFieldsDto141;
        GroupsFieldsDto groupsFieldsDto142 = new GroupsFieldsDto("PUBLIC_CATEGORY", 141, "public_category");
        PUBLIC_CATEGORY = groupsFieldsDto142;
        GroupsFieldsDto groupsFieldsDto143 = new GroupsFieldsDto("PUBLIC_SUBCATEGORY", 142, "public_subcategory");
        PUBLIC_SUBCATEGORY = groupsFieldsDto143;
        GroupsFieldsDto groupsFieldsDto144 = new GroupsFieldsDto("INSTALLED_APPS_COUNT", 143, "installed_apps_count");
        INSTALLED_APPS_COUNT = groupsFieldsDto144;
        GroupsFieldsDto groupsFieldsDto145 = new GroupsFieldsDto("LOGIN_CONFIRMATION_STATUS", 144, "login_confirmation_status");
        LOGIN_CONFIRMATION_STATUS = groupsFieldsDto145;
        GroupsFieldsDto groupsFieldsDto146 = new GroupsFieldsDto("YOULA_STATUS", 145, "youla_status");
        YOULA_STATUS = groupsFieldsDto146;
        GroupsFieldsDto groupsFieldsDto147 = new GroupsFieldsDto("EXTENDED_MARKET", 146, "extended_market");
        EXTENDED_MARKET = groupsFieldsDto147;
        GroupsFieldsDto groupsFieldsDto148 = new GroupsFieldsDto("YOULA_USE_WALLPOST_REDIRECT", 147, "youla_use_wallpost_redirect");
        YOULA_USE_WALLPOST_REDIRECT = groupsFieldsDto148;
        GroupsFieldsDto groupsFieldsDto149 = new GroupsFieldsDto("YOULA_USE_WALLPOST_REDIRECT_ONBOARDING", 148, "youla_use_wallpost_redirect_onboarding");
        YOULA_USE_WALLPOST_REDIRECT_ONBOARDING = groupsFieldsDto149;
        GroupsFieldsDto groupsFieldsDto150 = new GroupsFieldsDto("YOULA_WALLPOST_REDIRECT_MINIAPP_URL", 149, "youla_wallpost_redirect_miniapp_url");
        YOULA_WALLPOST_REDIRECT_MINIAPP_URL = groupsFieldsDto150;
        GroupsFieldsDto groupsFieldsDto151 = new GroupsFieldsDto("CLASSIFIEDS_ANTIBARAHOLKA_DESIGN_VERSION", 150, "classifieds_antibaraholka_design_version");
        CLASSIFIEDS_ANTIBARAHOLKA_DESIGN_VERSION = groupsFieldsDto151;
        GroupsFieldsDto groupsFieldsDto152 = new GroupsFieldsDto("IS_YOULA_POSTING_TO_WALL_ALLOWED", 151, "is_youla_posting_to_wall_allowed");
        IS_YOULA_POSTING_TO_WALL_ALLOWED = groupsFieldsDto152;
        GroupsFieldsDto groupsFieldsDto153 = new GroupsFieldsDto("WORKI_USE_WALLPOST_REDIRECT", 152, "worki_use_wallpost_redirect");
        WORKI_USE_WALLPOST_REDIRECT = groupsFieldsDto153;
        GroupsFieldsDto groupsFieldsDto154 = new GroupsFieldsDto("CATEGORY2", 153, "category2");
        CATEGORY2 = groupsFieldsDto154;
        GroupsFieldsDto groupsFieldsDto155 = new GroupsFieldsDto("DEACTIVATED_MESSAGE", 154, "deactivated_message");
        DEACTIVATED_MESSAGE = groupsFieldsDto155;
        GroupsFieldsDto groupsFieldsDto156 = new GroupsFieldsDto("DEACTIVATED_TYPE", 155, "deactivated_type");
        DEACTIVATED_TYPE = groupsFieldsDto156;
        GroupsFieldsDto groupsFieldsDto157 = new GroupsFieldsDto("IS_CLIPS_NOTIFICATIONS_IGNORED", 156, "is_clips_notifications_ignored");
        IS_CLIPS_NOTIFICATIONS_IGNORED = groupsFieldsDto157;
        GroupsFieldsDto groupsFieldsDto158 = new GroupsFieldsDto("YOULA_POSTING_METHOD", 157, "youla_posting_method");
        YOULA_POSTING_METHOD = groupsFieldsDto158;
        GroupsFieldsDto groupsFieldsDto159 = new GroupsFieldsDto("PLACE", 158, "place");
        PLACE = groupsFieldsDto159;
        GroupsFieldsDto groupsFieldsDto160 = new GroupsFieldsDto("TARG_ARTIST_ID", 159, "targ_artist_id");
        TARG_ARTIST_ID = groupsFieldsDto160;
        GroupsFieldsDto groupsFieldsDto161 = new GroupsFieldsDto("IS_GOVERNMENT_ORGANIZATION", 160, "is_government_organization");
        IS_GOVERNMENT_ORGANIZATION = groupsFieldsDto161;
        GroupsFieldsDto groupsFieldsDto162 = new GroupsFieldsDto("SETTINGS_TOOLTIPS_ACTIVE", 161, "settings_tooltips_active");
        SETTINGS_TOOLTIPS_ACTIVE = groupsFieldsDto162;
        GroupsFieldsDto groupsFieldsDto163 = new GroupsFieldsDto(NativeAdContent.ViewTag.RATING, 162, CampaignEx.JSON_KEY_STAR);
        RATING = groupsFieldsDto163;
        GroupsFieldsDto groupsFieldsDto164 = new GroupsFieldsDto("PHOTO_AVG_COLOR", 163, "photo_avg_color");
        PHOTO_AVG_COLOR = groupsFieldsDto164;
        GroupsFieldsDto groupsFieldsDto165 = new GroupsFieldsDto("HAS_LIVE_COVER", 164, "has_live_cover");
        HAS_LIVE_COVER = groupsFieldsDto165;
        GroupsFieldsDto groupsFieldsDto166 = new GroupsFieldsDto("NAME_HISTORY", 165, "name_history");
        NAME_HISTORY = groupsFieldsDto166;
        GroupsFieldsDto groupsFieldsDto167 = new GroupsFieldsDto("SERVICE_RATING", 166, "service_rating");
        SERVICE_RATING = groupsFieldsDto167;
        GroupsFieldsDto groupsFieldsDto168 = new GroupsFieldsDto("RECOMMENDED_TIPS_WIDGET", 167, "recommended_tips_widget");
        RECOMMENDED_TIPS_WIDGET = groupsFieldsDto168;
        GroupsFieldsDto groupsFieldsDto169 = new GroupsFieldsDto("INN", 168, "inn");
        INN = groupsFieldsDto169;
        GroupsFieldsDto groupsFieldsDto170 = new GroupsFieldsDto("OGRN", 169, "ogrn");
        OGRN = groupsFieldsDto170;
        GroupsFieldsDto groupsFieldsDto171 = new GroupsFieldsDto("KPP", 170, "kpp");
        KPP = groupsFieldsDto171;
        GroupsFieldsDto groupsFieldsDto172 = new GroupsFieldsDto("SUBJECT", 171, "subject");
        SUBJECT = groupsFieldsDto172;
        GroupsFieldsDto groupsFieldsDto173 = new GroupsFieldsDto("REGION", 172, TtmlNode.TAG_REGION);
        REGION = groupsFieldsDto173;
        GroupsFieldsDto groupsFieldsDto174 = new GroupsFieldsDto("IS_SET_TAB_ORDER", 173, "is_set_tab_order");
        IS_SET_TAB_ORDER = groupsFieldsDto174;
        GroupsFieldsDto groupsFieldsDto175 = new GroupsFieldsDto("BUSINESS_COMMUNITY_TOOLTIPS", 174, "business_community_tooltips");
        BUSINESS_COMMUNITY_TOOLTIPS = groupsFieldsDto175;
        GroupsFieldsDto groupsFieldsDto176 = new GroupsFieldsDto("CAN_CALL_TO_COMMUNITY", 175, "can_call_to_community");
        CAN_CALL_TO_COMMUNITY = groupsFieldsDto176;
        GroupsFieldsDto groupsFieldsDto177 = new GroupsFieldsDto("POST_REACH_AVG_CURRENT_MONTH", 176, "post_reach_avg_current_month");
        POST_REACH_AVG_CURRENT_MONTH = groupsFieldsDto177;
        GroupsFieldsDto groupsFieldsDto178 = new GroupsFieldsDto("CATEGORY1_NAME", 177, "category1_name");
        CATEGORY1_NAME = groupsFieldsDto178;
        GroupsFieldsDto groupsFieldsDto179 = new GroupsFieldsDto("AUTHORS_MARKETPLACE", 178, "authors_marketplace");
        AUTHORS_MARKETPLACE = groupsFieldsDto179;
        GroupsFieldsDto groupsFieldsDto180 = new GroupsFieldsDto("ADS_POSTS_INFO", 179, "ads_posts_info");
        ADS_POSTS_INFO = groupsFieldsDto180;
        GroupsFieldsDto groupsFieldsDto181 = new GroupsFieldsDto("THEMATIC", 180, "thematic");
        THEMATIC = groupsFieldsDto181;
        GroupsFieldsDto groupsFieldsDto182 = new GroupsFieldsDto("BANNER_ADS_MAIN_CLIENT", 181, "banner_ads_main_client");
        BANNER_ADS_MAIN_CLIENT = groupsFieldsDto182;
        GroupsFieldsDto groupsFieldsDto183 = new GroupsFieldsDto("BANNER_ADS_SETTING_MINIAPP", 182, "banner_ads_setting_miniapp");
        BANNER_ADS_SETTING_MINIAPP = groupsFieldsDto183;
        GroupsFieldsDto groupsFieldsDto184 = new GroupsFieldsDto("LEAVE_MODE", 183, "leave_mode");
        LEAVE_MODE = groupsFieldsDto184;
        GroupsFieldsDto groupsFieldsDto185 = new GroupsFieldsDto("BANNER_ADS_MAIN_MVK", 184, "banner_ads_main_mvk");
        BANNER_ADS_MAIN_MVK = groupsFieldsDto185;
        GroupsFieldsDto groupsFieldsDto186 = new GroupsFieldsDto("AGE_MARK", 185, "age_mark");
        AGE_MARK = groupsFieldsDto186;
        GroupsFieldsDto groupsFieldsDto187 = new GroupsFieldsDto("IS_MEDIA_WALL_ENABLED", 186, "is_media_wall_enabled");
        IS_MEDIA_WALL_ENABLED = groupsFieldsDto187;
        GroupsFieldsDto[] groupsFieldsDtoArr = {groupsFieldsDto, groupsFieldsDto2, groupsFieldsDto3, groupsFieldsDto4, groupsFieldsDto5, groupsFieldsDto6, groupsFieldsDto7, groupsFieldsDto8, groupsFieldsDto9, groupsFieldsDto10, groupsFieldsDto11, groupsFieldsDto12, groupsFieldsDto13, groupsFieldsDto14, groupsFieldsDto15, groupsFieldsDto16, groupsFieldsDto17, groupsFieldsDto18, groupsFieldsDto19, groupsFieldsDto20, groupsFieldsDto21, groupsFieldsDto22, groupsFieldsDto23, groupsFieldsDto24, groupsFieldsDto25, groupsFieldsDto26, groupsFieldsDto27, groupsFieldsDto28, groupsFieldsDto29, groupsFieldsDto30, groupsFieldsDto31, groupsFieldsDto32, groupsFieldsDto33, groupsFieldsDto34, groupsFieldsDto35, groupsFieldsDto36, groupsFieldsDto37, groupsFieldsDto38, groupsFieldsDto39, groupsFieldsDto40, groupsFieldsDto41, groupsFieldsDto42, groupsFieldsDto43, groupsFieldsDto44, groupsFieldsDto45, groupsFieldsDto46, groupsFieldsDto47, groupsFieldsDto48, groupsFieldsDto49, groupsFieldsDto50, groupsFieldsDto51, groupsFieldsDto52, groupsFieldsDto53, groupsFieldsDto54, groupsFieldsDto55, groupsFieldsDto56, groupsFieldsDto57, groupsFieldsDto58, groupsFieldsDto59, groupsFieldsDto60, groupsFieldsDto61, groupsFieldsDto62, groupsFieldsDto63, groupsFieldsDto64, groupsFieldsDto65, groupsFieldsDto66, groupsFieldsDto67, groupsFieldsDto68, groupsFieldsDto69, groupsFieldsDto70, groupsFieldsDto71, groupsFieldsDto72, groupsFieldsDto73, groupsFieldsDto74, groupsFieldsDto75, groupsFieldsDto76, groupsFieldsDto77, groupsFieldsDto78, groupsFieldsDto79, groupsFieldsDto80, groupsFieldsDto81, groupsFieldsDto82, groupsFieldsDto83, groupsFieldsDto84, groupsFieldsDto85, groupsFieldsDto86, groupsFieldsDto87, groupsFieldsDto88, groupsFieldsDto89, groupsFieldsDto90, groupsFieldsDto91, groupsFieldsDto92, groupsFieldsDto93, groupsFieldsDto94, groupsFieldsDto95, groupsFieldsDto96, groupsFieldsDto97, groupsFieldsDto98, groupsFieldsDto99, groupsFieldsDto100, groupsFieldsDto101, groupsFieldsDto102, groupsFieldsDto103, groupsFieldsDto104, groupsFieldsDto105, groupsFieldsDto106, groupsFieldsDto107, groupsFieldsDto108, groupsFieldsDto109, groupsFieldsDto110, groupsFieldsDto111, groupsFieldsDto112, groupsFieldsDto113, groupsFieldsDto114, groupsFieldsDto115, groupsFieldsDto116, groupsFieldsDto117, groupsFieldsDto118, groupsFieldsDto119, groupsFieldsDto120, groupsFieldsDto121, groupsFieldsDto122, groupsFieldsDto123, groupsFieldsDto124, groupsFieldsDto125, groupsFieldsDto126, groupsFieldsDto127, groupsFieldsDto128, groupsFieldsDto129, groupsFieldsDto130, groupsFieldsDto131, groupsFieldsDto132, groupsFieldsDto133, groupsFieldsDto134, groupsFieldsDto135, groupsFieldsDto136, groupsFieldsDto137, groupsFieldsDto138, groupsFieldsDto139, groupsFieldsDto140, groupsFieldsDto141, groupsFieldsDto142, groupsFieldsDto143, groupsFieldsDto144, groupsFieldsDto145, groupsFieldsDto146, groupsFieldsDto147, groupsFieldsDto148, groupsFieldsDto149, groupsFieldsDto150, groupsFieldsDto151, groupsFieldsDto152, groupsFieldsDto153, groupsFieldsDto154, groupsFieldsDto155, groupsFieldsDto156, groupsFieldsDto157, groupsFieldsDto158, groupsFieldsDto159, groupsFieldsDto160, groupsFieldsDto161, groupsFieldsDto162, groupsFieldsDto163, groupsFieldsDto164, groupsFieldsDto165, groupsFieldsDto166, groupsFieldsDto167, groupsFieldsDto168, groupsFieldsDto169, groupsFieldsDto170, groupsFieldsDto171, groupsFieldsDto172, groupsFieldsDto173, groupsFieldsDto174, groupsFieldsDto175, groupsFieldsDto176, groupsFieldsDto177, groupsFieldsDto178, groupsFieldsDto179, groupsFieldsDto180, groupsFieldsDto181, groupsFieldsDto182, groupsFieldsDto183, groupsFieldsDto184, groupsFieldsDto185, groupsFieldsDto186, groupsFieldsDto187};
        $VALUES = groupsFieldsDtoArr;
        $ENTRIES = new asp(groupsFieldsDtoArr);
    }

    private GroupsFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsFieldsDto valueOf(String str) {
        return (GroupsFieldsDto) Enum.valueOf(GroupsFieldsDto.class, str);
    }

    public static GroupsFieldsDto[] values() {
        return (GroupsFieldsDto[]) $VALUES.clone();
    }
}
