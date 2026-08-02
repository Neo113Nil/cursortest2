package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
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
/* loaded from: classes.dex */
public final class GroupsFieldsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsFieldsDto[] $VALUES;
    public static final Parcelable.Creator<GroupsFieldsDto> CREATOR;
    private final String value;

    @pmi0("id")
    public static final GroupsFieldsDto ID = new GroupsFieldsDto("ID", 0, "id");

    @pmi0("name")
    public static final GroupsFieldsDto NAME = new GroupsFieldsDto("NAME", 1, "name");

    @pmi0("screen_name")
    public static final GroupsFieldsDto SCREEN_NAME = new GroupsFieldsDto("SCREEN_NAME", 2, "screen_name");

    @pmi0("is_closed")
    public static final GroupsFieldsDto IS_CLOSED = new GroupsFieldsDto("IS_CLOSED", 3, "is_closed");

    @pmi0("type")
    public static final GroupsFieldsDto TYPE = new GroupsFieldsDto(CredentialProviderBaseController.TYPE_TAG, 4, "type");

    @pmi0("is_admin")
    public static final GroupsFieldsDto IS_ADMIN = new GroupsFieldsDto("IS_ADMIN", 5, "is_admin");

    @pmi0("admin_level")
    public static final GroupsFieldsDto ADMIN_LEVEL = new GroupsFieldsDto("ADMIN_LEVEL", 6, "admin_level");

    @pmi0("is_member")
    public static final GroupsFieldsDto IS_MEMBER = new GroupsFieldsDto("IS_MEMBER", 7, "is_member");

    @pmi0("is_advertiser")
    public static final GroupsFieldsDto IS_ADVERTISER = new GroupsFieldsDto("IS_ADVERTISER", 8, "is_advertiser");

    @pmi0("start_date")
    public static final GroupsFieldsDto START_DATE = new GroupsFieldsDto("START_DATE", 9, "start_date");

    @pmi0("finish_date")
    public static final GroupsFieldsDto FINISH_DATE = new GroupsFieldsDto("FINISH_DATE", 10, "finish_date");

    @pmi0("deactivated")
    public static final GroupsFieldsDto DEACTIVATED = new GroupsFieldsDto("DEACTIVATED", 11, "deactivated");

    @pmi0("photo_50")
    public static final GroupsFieldsDto PHOTO_50 = new GroupsFieldsDto("PHOTO_50", 12, "photo_50");

    @pmi0("photo_100")
    public static final GroupsFieldsDto PHOTO_100 = new GroupsFieldsDto("PHOTO_100", 13, "photo_100");

    @pmi0("photo_200")
    public static final GroupsFieldsDto PHOTO_200 = new GroupsFieldsDto("PHOTO_200", 14, "photo_200");

    @pmi0("photo_200_orig")
    public static final GroupsFieldsDto PHOTO_200_ORIG = new GroupsFieldsDto("PHOTO_200_ORIG", 15, "photo_200_orig");

    @pmi0("photo_400")
    public static final GroupsFieldsDto PHOTO_400 = new GroupsFieldsDto("PHOTO_400", 16, "photo_400");

    @pmi0("photo_400_orig")
    public static final GroupsFieldsDto PHOTO_400_ORIG = new GroupsFieldsDto("PHOTO_400_ORIG", 17, "photo_400_orig");

    @pmi0("photo_max")
    public static final GroupsFieldsDto PHOTO_MAX = new GroupsFieldsDto("PHOTO_MAX", 18, "photo_max");

    @pmi0("photo_max_orig")
    public static final GroupsFieldsDto PHOTO_MAX_ORIG = new GroupsFieldsDto("PHOTO_MAX_ORIG", 19, "photo_max_orig");

    @pmi0("photo_base")
    public static final GroupsFieldsDto PHOTO_BASE = new GroupsFieldsDto("PHOTO_BASE", 20, "photo_base");

    @pmi0("est_date")
    public static final GroupsFieldsDto EST_DATE = new GroupsFieldsDto("EST_DATE", 21, "est_date");

    @pmi0("public_date_label")
    public static final GroupsFieldsDto PUBLIC_DATE_LABEL = new GroupsFieldsDto("PUBLIC_DATE_LABEL", 22, "public_date_label");

    @pmi0("photo_max_size")
    public static final GroupsFieldsDto PHOTO_MAX_SIZE = new GroupsFieldsDto("PHOTO_MAX_SIZE", 23, "photo_max_size");

    @pmi0("is_video_live_notifications_blocked")
    public static final GroupsFieldsDto IS_VIDEO_LIVE_NOTIFICATIONS_BLOCKED = new GroupsFieldsDto("IS_VIDEO_LIVE_NOTIFICATIONS_BLOCKED", 24, "is_video_live_notifications_blocked");

    @pmi0("video_live")
    public static final GroupsFieldsDto VIDEO_LIVE = new GroupsFieldsDto("VIDEO_LIVE", 25, "video_live");

    @pmi0("market")
    public static final GroupsFieldsDto MARKET = new GroupsFieldsDto("MARKET", 26, "market");

    @pmi0("member_status")
    public static final GroupsFieldsDto MEMBER_STATUS = new GroupsFieldsDto("MEMBER_STATUS", 27, "member_status");

    @pmi0("is_adult")
    public static final GroupsFieldsDto IS_ADULT = new GroupsFieldsDto("IS_ADULT", 28, "is_adult");

    @pmi0("is_hidden_from_feed")
    public static final GroupsFieldsDto IS_HIDDEN_FROM_FEED = new GroupsFieldsDto("IS_HIDDEN_FROM_FEED", 29, "is_hidden_from_feed");

    @pmi0("is_favorite")
    public static final GroupsFieldsDto IS_FAVORITE = new GroupsFieldsDto("IS_FAVORITE", 30, "is_favorite");

    @pmi0("is_subscribed")
    public static final GroupsFieldsDto IS_SUBSCRIBED = new GroupsFieldsDto("IS_SUBSCRIBED", 31, "is_subscribed");

    @pmi0("city")
    public static final GroupsFieldsDto CITY = new GroupsFieldsDto("CITY", 32, "city");

    @pmi0("country")
    public static final GroupsFieldsDto COUNTRY = new GroupsFieldsDto("COUNTRY", 33, "country");

    @pmi0("verified")
    public static final GroupsFieldsDto VERIFIED = new GroupsFieldsDto("VERIFIED", 34, "verified");

    @pmi0("description")
    public static final GroupsFieldsDto DESCRIPTION = new GroupsFieldsDto(NativeAdContent.ViewTag.AD_DESCRIPTION, 35, "description");

    @pmi0("wiki_page")
    public static final GroupsFieldsDto WIKI_PAGE = new GroupsFieldsDto("WIKI_PAGE", 36, "wiki_page");

    @pmi0("members_count")
    public static final GroupsFieldsDto MEMBERS_COUNT = new GroupsFieldsDto("MEMBERS_COUNT", 37, "members_count");

    @pmi0("members_count_text")
    public static final GroupsFieldsDto MEMBERS_COUNT_TEXT = new GroupsFieldsDto("MEMBERS_COUNT_TEXT", 38, "members_count_text");

    @pmi0("requests_count")
    public static final GroupsFieldsDto REQUESTS_COUNT = new GroupsFieldsDto("REQUESTS_COUNT", 39, "requests_count");

    @pmi0("video_live_level")
    public static final GroupsFieldsDto VIDEO_LIVE_LEVEL = new GroupsFieldsDto("VIDEO_LIVE_LEVEL", 40, "video_live_level");

    @pmi0("video_live_count")
    public static final GroupsFieldsDto VIDEO_LIVE_COUNT = new GroupsFieldsDto("VIDEO_LIVE_COUNT", 41, "video_live_count");

    @pmi0("clips_count")
    public static final GroupsFieldsDto CLIPS_COUNT = new GroupsFieldsDto("CLIPS_COUNT", 42, "clips_count");

    @pmi0("textlives_count")
    public static final GroupsFieldsDto TEXTLIVES_COUNT = new GroupsFieldsDto("TEXTLIVES_COUNT", 43, "textlives_count");

    @pmi0("counters")
    public static final GroupsFieldsDto COUNTERS = new GroupsFieldsDto("COUNTERS", 44, "counters");

    @pmi0("cover")
    public static final GroupsFieldsDto COVER = new GroupsFieldsDto("COVER", 45, "cover");

    @pmi0("can_post")
    public static final GroupsFieldsDto CAN_POST = new GroupsFieldsDto("CAN_POST", 46, "can_post");

    @pmi0("can_suggest")
    public static final GroupsFieldsDto CAN_SUGGEST = new GroupsFieldsDto("CAN_SUGGEST", 47, "can_suggest");

    @pmi0("can_upload_story")
    public static final GroupsFieldsDto CAN_UPLOAD_STORY = new GroupsFieldsDto("CAN_UPLOAD_STORY", 48, "can_upload_story");

    @pmi0("can_upload_doc")
    public static final GroupsFieldsDto CAN_UPLOAD_DOC = new GroupsFieldsDto("CAN_UPLOAD_DOC", 49, "can_upload_doc");

    @pmi0("can_upload_video")
    public static final GroupsFieldsDto CAN_UPLOAD_VIDEO = new GroupsFieldsDto("CAN_UPLOAD_VIDEO", 50, "can_upload_video");

    @pmi0("can_upload_clip")
    public static final GroupsFieldsDto CAN_UPLOAD_CLIP = new GroupsFieldsDto("CAN_UPLOAD_CLIP", 51, "can_upload_clip");

    @pmi0("can_see_all_posts")
    public static final GroupsFieldsDto CAN_SEE_ALL_POSTS = new GroupsFieldsDto("CAN_SEE_ALL_POSTS", 52, "can_see_all_posts");

    @pmi0("can_create_topic")
    public static final GroupsFieldsDto CAN_CREATE_TOPIC = new GroupsFieldsDto("CAN_CREATE_TOPIC", 53, "can_create_topic");

    @pmi0("activity")
    public static final GroupsFieldsDto ACTIVITY = new GroupsFieldsDto("ACTIVITY", 54, "activity");

    @pmi0("fixed_post")
    public static final GroupsFieldsDto FIXED_POST = new GroupsFieldsDto("FIXED_POST", 55, "fixed_post");

    @pmi0("has_photo")
    public static final GroupsFieldsDto HAS_PHOTO = new GroupsFieldsDto("HAS_PHOTO", 56, "has_photo");

    @pmi0("crop_photo")
    public static final GroupsFieldsDto CROP_PHOTO = new GroupsFieldsDto("CROP_PHOTO", 57, "crop_photo");

    @pmi0("status")
    public static final GroupsFieldsDto STATUS = new GroupsFieldsDto(CommonConstant.RETKEY.STATUS, 58, "status");

    @pmi0("status_audio")
    public static final GroupsFieldsDto STATUS_AUDIO = new GroupsFieldsDto("STATUS_AUDIO", 59, "status_audio");

    @pmi0("main_album_id")
    public static final GroupsFieldsDto MAIN_ALBUM_ID = new GroupsFieldsDto("MAIN_ALBUM_ID", 60, "main_album_id");

    @pmi0("links")
    public static final GroupsFieldsDto LINKS = new GroupsFieldsDto("LINKS", 61, "links");

    @pmi0("contacts")
    public static final GroupsFieldsDto CONTACTS = new GroupsFieldsDto("CONTACTS", 62, "contacts");

    @pmi0("wall")
    public static final GroupsFieldsDto WALL = new GroupsFieldsDto("WALL", 63, "wall");

    @pmi0("site")
    public static final GroupsFieldsDto SITE = new GroupsFieldsDto("SITE", 64, "site");

    @pmi0("main_section")
    public static final GroupsFieldsDto MAIN_SECTION = new GroupsFieldsDto("MAIN_SECTION", 65, "main_section");

    @pmi0("secondary_section")
    public static final GroupsFieldsDto SECONDARY_SECTION = new GroupsFieldsDto("SECONDARY_SECTION", 66, "secondary_section");

    @pmi0("trending")
    public static final GroupsFieldsDto TRENDING = new GroupsFieldsDto("TRENDING", 67, "trending");

    @pmi0("can_message")
    public static final GroupsFieldsDto CAN_MESSAGE = new GroupsFieldsDto("CAN_MESSAGE", 68, "can_message");

    @pmi0("is_messages_blocked")
    public static final GroupsFieldsDto IS_MESSAGES_BLOCKED = new GroupsFieldsDto("IS_MESSAGES_BLOCKED", 69, "is_messages_blocked");

    @pmi0("can_send_notify")
    public static final GroupsFieldsDto CAN_SEND_NOTIFY = new GroupsFieldsDto("CAN_SEND_NOTIFY", 70, "can_send_notify");

    @pmi0("online_status")
    public static final GroupsFieldsDto ONLINE_STATUS = new GroupsFieldsDto("ONLINE_STATUS", 71, "online_status");

    @pmi0("invited_by")
    public static final GroupsFieldsDto INVITED_BY = new GroupsFieldsDto("INVITED_BY", 72, "invited_by");

    @pmi0("age_limits")
    public static final GroupsFieldsDto AGE_LIMITS = new GroupsFieldsDto("AGE_LIMITS", 73, "age_limits");

    @pmi0("ban_info")
    public static final GroupsFieldsDto BAN_INFO = new GroupsFieldsDto("BAN_INFO", 74, "ban_info");

    @pmi0("has_market_app")
    public static final GroupsFieldsDto HAS_MARKET_APP = new GroupsFieldsDto("HAS_MARKET_APP", 75, "has_market_app");

    @pmi0("using_vkpay_market_app")
    public static final GroupsFieldsDto USING_VKPAY_MARKET_APP = new GroupsFieldsDto("USING_VKPAY_MARKET_APP", 76, "using_vkpay_market_app");

    @pmi0("has_group_channel")
    public static final GroupsFieldsDto HAS_GROUP_CHANNEL = new GroupsFieldsDto("HAS_GROUP_CHANNEL", 77, "has_group_channel");

    @pmi0("addresses")
    public static final GroupsFieldsDto ADDRESSES = new GroupsFieldsDto("ADDRESSES", 78, "addresses");

    @pmi0("messages")
    public static final GroupsFieldsDto MESSAGES = new GroupsFieldsDto("MESSAGES", 79, "messages");

    @pmi0("is_aue")
    public static final GroupsFieldsDto IS_AUE = new GroupsFieldsDto("IS_AUE", 80, "is_aue");

    @pmi0("is_lgbt")
    public static final GroupsFieldsDto IS_LGBT = new GroupsFieldsDto("IS_LGBT", 81, "is_lgbt");

    @pmi0("business_rating")
    public static final GroupsFieldsDto BUSINESS_RATING = new GroupsFieldsDto("BUSINESS_RATING", 82, "business_rating");

    @pmi0("is_subscribed_podcasts")
    public static final GroupsFieldsDto IS_SUBSCRIBED_PODCASTS = new GroupsFieldsDto("IS_SUBSCRIBED_PODCASTS", 83, "is_subscribed_podcasts");

    @pmi0("can_subscribe_podcasts")
    public static final GroupsFieldsDto CAN_SUBSCRIBE_PODCASTS = new GroupsFieldsDto("CAN_SUBSCRIBE_PODCASTS", 84, "can_subscribe_podcasts");

    @pmi0("can_subscribe_posts")
    public static final GroupsFieldsDto CAN_SUBSCRIBE_POSTS = new GroupsFieldsDto("CAN_SUBSCRIBE_POSTS", 85, "can_subscribe_posts");

    @pmi0("live_covers")
    public static final GroupsFieldsDto LIVE_COVERS = new GroupsFieldsDto("LIVE_COVERS", 86, "live_covers");

    @pmi0("stories_archive_count")
    public static final GroupsFieldsDto STORIES_ARCHIVE_COUNT = new GroupsFieldsDto("STORIES_ARCHIVE_COUNT", 87, "stories_archive_count");

    @pmi0("has_unseen_stories")
    public static final GroupsFieldsDto HAS_UNSEEN_STORIES = new GroupsFieldsDto("HAS_UNSEEN_STORIES", 88, "has_unseen_stories");

    @pmi0("like")
    public static final GroupsFieldsDto LIKE = new GroupsFieldsDto("LIKE", 89, "like");

    @pmi0("friends")
    public static final GroupsFieldsDto FRIENDS = new GroupsFieldsDto(Privacy.FRIENDS, 90, "friends");

    @pmi0("had_torch")
    public static final GroupsFieldsDto HAD_TORCH = new GroupsFieldsDto("HAD_TORCH", 91, "had_torch");

    @pmi0("is_widget_messages_enabled")
    public static final GroupsFieldsDto IS_WIDGET_MESSAGES_ENABLED = new GroupsFieldsDto("IS_WIDGET_MESSAGES_ENABLED", 92, "is_widget_messages_enabled");

    @pmi0("vkpay_can_transfer")
    public static final GroupsFieldsDto VKPAY_CAN_TRANSFER = new GroupsFieldsDto("VKPAY_CAN_TRANSFER", 93, "vkpay_can_transfer");

    @pmi0("vkpay_receiver_id")
    public static final GroupsFieldsDto VKPAY_RECEIVER_ID = new GroupsFieldsDto("VKPAY_RECEIVER_ID", 94, "vkpay_receiver_id");

    @pmi0("phone")
    public static final GroupsFieldsDto PHONE = new GroupsFieldsDto("PHONE", 95, "phone");

    @pmi0("app_button")
    public static final GroupsFieldsDto APP_BUTTON = new GroupsFieldsDto("APP_BUTTON", 96, "app_button");

    @pmi0("app_buttons")
    public static final GroupsFieldsDto APP_BUTTONS = new GroupsFieldsDto("APP_BUTTONS", 97, "app_buttons");

    @pmi0("audio_artist_id")
    public static final GroupsFieldsDto AUDIO_ARTIST_ID = new GroupsFieldsDto("AUDIO_ARTIST_ID", 98, "audio_artist_id");

    @pmi0("audio_curator_id")
    public static final GroupsFieldsDto AUDIO_CURATOR_ID = new GroupsFieldsDto("AUDIO_CURATOR_ID", 99, "audio_curator_id");

    @pmi0("buttons")
    public static final GroupsFieldsDto BUTTONS = new GroupsFieldsDto("BUTTONS", 100, "buttons");

    @pmi0("market_services")
    public static final GroupsFieldsDto MARKET_SERVICES = new GroupsFieldsDto("MARKET_SERVICES", 101, "market_services");

    @pmi0("music_awards")
    public static final GroupsFieldsDto MUSIC_AWARDS = new GroupsFieldsDto("MUSIC_AWARDS", 102, "music_awards");

    @pmi0("textlive")
    public static final GroupsFieldsDto TEXTLIVE = new GroupsFieldsDto("TEXTLIVE", 103, "textlive");

    @pmi0("action_button")
    public static final GroupsFieldsDto ACTION_BUTTON = new GroupsFieldsDto("ACTION_BUTTON", 104, "action_button");

    @pmi0("author_id")
    public static final GroupsFieldsDto AUTHOR_ID = new GroupsFieldsDto("AUTHOR_ID", 105, "author_id");

    @pmi0("is_market_cart_enabled")
    public static final GroupsFieldsDto IS_MARKET_CART_ENABLED = new GroupsFieldsDto("IS_MARKET_CART_ENABLED", Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, "is_market_cart_enabled");

    @pmi0("group_channel")
    public static final GroupsFieldsDto GROUP_CHANNEL = new GroupsFieldsDto("GROUP_CHANNEL", ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, "group_channel");

    @pmi0("is_subscribed_stories")
    public static final GroupsFieldsDto IS_SUBSCRIBED_STORIES = new GroupsFieldsDto("IS_SUBSCRIBED_STORIES", 108, "is_subscribed_stories");

    @pmi0("can_subscribe_stories")
    public static final GroupsFieldsDto CAN_SUBSCRIBE_STORIES = new GroupsFieldsDto("CAN_SUBSCRIBE_STORIES", 109, "can_subscribe_stories");

    @pmi0("is_subscribed_textlives")
    public static final GroupsFieldsDto IS_SUBSCRIBED_TEXTLIVES = new GroupsFieldsDto("IS_SUBSCRIBED_TEXTLIVES", 110, "is_subscribed_textlives");

    @pmi0("vk_admin_status")
    public static final GroupsFieldsDto VK_ADMIN_STATUS = new GroupsFieldsDto("VK_ADMIN_STATUS", 111, "vk_admin_status");

    @pmi0("menu")
    public static final GroupsFieldsDto MENU = new GroupsFieldsDto("MENU", 112, "menu");

    @pmi0("warning_notification")
    public static final GroupsFieldsDto WARNING_NOTIFICATION = new GroupsFieldsDto("WARNING_NOTIFICATION", 113, "warning_notification");

    @pmi0("create_date")
    public static final GroupsFieldsDto CREATE_DATE = new GroupsFieldsDto("CREATE_DATE", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, "create_date");

    @pmi0("donut")
    public static final GroupsFieldsDto DONUT = new GroupsFieldsDto("DONUT", Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, "donut");

    @pmi0("donut_payment_info")
    public static final GroupsFieldsDto DONUT_PAYMENT_INFO = new GroupsFieldsDto("DONUT_PAYMENT_INFO", 116, "donut_payment_info");

    @pmi0("can_post_donut")
    public static final GroupsFieldsDto CAN_POST_DONUT = new GroupsFieldsDto("CAN_POST_DONUT", Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, "can_post_donut");

    @pmi0("can_see_members")
    public static final GroupsFieldsDto CAN_SEE_MEMBERS = new GroupsFieldsDto("CAN_SEE_MEMBERS", Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, "can_see_members");

    @pmi0("msg_push_allowed")
    public static final GroupsFieldsDto MSG_PUSH_ALLOWED = new GroupsFieldsDto("MSG_PUSH_ALLOWED", Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, "msg_push_allowed");

    @pmi0("msg_notifications_allowed")
    public static final GroupsFieldsDto MSG_NOTIFICATIONS_ALLOWED = new GroupsFieldsDto("MSG_NOTIFICATIONS_ALLOWED", 120, "msg_notifications_allowed");

    @pmi0("chats_status")
    public static final GroupsFieldsDto CHATS_STATUS = new GroupsFieldsDto("CHATS_STATUS", Sdk.SDKError.Reason.TPAT_ERROR_VALUE, "chats_status");

    @pmi0("can_report")
    public static final GroupsFieldsDto CAN_REPORT = new GroupsFieldsDto("CAN_REPORT", Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, "can_report");

    @pmi0("is_business")
    public static final GroupsFieldsDto IS_BUSINESS = new GroupsFieldsDto("IS_BUSINESS", 123, "is_business");

    @pmi0("is_business_category")
    public static final GroupsFieldsDto IS_BUSINESS_CATEGORY = new GroupsFieldsDto("IS_BUSINESS_CATEGORY", Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, "is_business_category");

    @pmi0("is_confirmed_business")
    public static final GroupsFieldsDto IS_CONFIRMED_BUSINESS = new GroupsFieldsDto("IS_CONFIRMED_BUSINESS", 125, "is_confirmed_business");

    @pmi0("is_golden_marked_business")
    public static final GroupsFieldsDto IS_GOLDEN_MARKED_BUSINESS = new GroupsFieldsDto("IS_GOLDEN_MARKED_BUSINESS", Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, "is_golden_marked_business");

    @pmi0("trust_mark")
    public static final GroupsFieldsDto TRUST_MARK = new GroupsFieldsDto("TRUST_MARK", 127, "trust_mark");

    @pmi0("microlanding")
    public static final GroupsFieldsDto MICROLANDING = new GroupsFieldsDto("MICROLANDING", 128, "microlanding");

    @pmi0("tariffs")
    public static final GroupsFieldsDto TARIFFS = new GroupsFieldsDto("TARIFFS", 129, "tariffs");

    @pmi0("verification_end_time")
    public static final GroupsFieldsDto VERIFICATION_END_TIME = new GroupsFieldsDto("VERIFICATION_END_TIME", 130, "verification_end_time");

    @pmi0("can_manage")
    public static final GroupsFieldsDto CAN_MANAGE = new GroupsFieldsDto("CAN_MANAGE", Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, "can_manage");

    @pmi0("has_suggestions")
    public static final GroupsFieldsDto HAS_SUGGESTIONS = new GroupsFieldsDto("HAS_SUGGESTIONS", Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, "has_suggestions");

    @pmi0("show_suggestions")
    public static final GroupsFieldsDto SHOW_SUGGESTIONS = new GroupsFieldsDto("SHOW_SUGGESTIONS", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "show_suggestions");

    @pmi0("can_view_stats")
    public static final GroupsFieldsDto CAN_VIEW_STATS = new GroupsFieldsDto("CAN_VIEW_STATS", 134, "can_view_stats");

    @pmi0("can_view_post_reach_stats")
    public static final GroupsFieldsDto CAN_VIEW_POST_REACH_STATS = new GroupsFieldsDto("CAN_VIEW_POST_REACH_STATS", 135, "can_view_post_reach_stats");

    @pmi0("ads_easy_promote")
    public static final GroupsFieldsDto ADS_EASY_PROMOTE = new GroupsFieldsDto("ADS_EASY_PROMOTE", Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, "ads_easy_promote");

    @pmi0("ads_easy_promote_allowed")
    public static final GroupsFieldsDto ADS_EASY_PROMOTE_ALLOWED = new GroupsFieldsDto("ADS_EASY_PROMOTE_ALLOWED", Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "ads_easy_promote_allowed");

    @pmi0("ads_posting_restricted_today")
    public static final GroupsFieldsDto ADS_POSTING_RESTRICTED_TODAY = new GroupsFieldsDto("ADS_POSTING_RESTRICTED_TODAY", 138, "ads_posting_restricted_today");

    @pmi0("ads_market_autopromote_allowed")
    public static final GroupsFieldsDto ADS_MARKET_AUTOPROMOTE_ALLOWED = new GroupsFieldsDto("ADS_MARKET_AUTOPROMOTE_ALLOWED", 139, "ads_market_autopromote_allowed");

    @pmi0("ads_market_easy_promote")
    public static final GroupsFieldsDto ADS_MARKET_EASY_PROMOTE = new GroupsFieldsDto("ADS_MARKET_EASY_PROMOTE", VersionConstants.PRODUCT_MAJOR_VERSION, "ads_market_easy_promote");

    @pmi0("ads_market_autopromote_reasons_not_allowed")
    public static final GroupsFieldsDto ADS_MARKET_AUTOPROMOTE_REASONS_NOT_ALLOWED = new GroupsFieldsDto("ADS_MARKET_AUTOPROMOTE_REASONS_NOT_ALLOWED", 141, "ads_market_autopromote_reasons_not_allowed");

    @pmi0("ads_market_services_autopromote_reasons_not_allowed")
    public static final GroupsFieldsDto ADS_MARKET_SERVICES_AUTOPROMOTE_REASONS_NOT_ALLOWED = new GroupsFieldsDto("ADS_MARKET_SERVICES_AUTOPROMOTE_REASONS_NOT_ALLOWED", 142, "ads_market_services_autopromote_reasons_not_allowed");

    @pmi0("ads_market_services_autopromote_allowed")
    public static final GroupsFieldsDto ADS_MARKET_SERVICES_AUTOPROMOTE_ALLOWED = new GroupsFieldsDto("ADS_MARKET_SERVICES_AUTOPROMOTE_ALLOWED", 143, "ads_market_services_autopromote_allowed");

    @pmi0("ads_market_services_easy_promote")
    public static final GroupsFieldsDto ADS_MARKET_SERVICES_EASY_PROMOTE = new GroupsFieldsDto("ADS_MARKET_SERVICES_EASY_PROMOTE", 144, "ads_market_services_easy_promote");

    @pmi0("ads_easy_promote_reasons_not_allowed")
    public static final GroupsFieldsDto ADS_EASY_PROMOTE_REASONS_NOT_ALLOWED = new GroupsFieldsDto("ADS_EASY_PROMOTE_REASONS_NOT_ALLOWED", 145, "ads_easy_promote_reasons_not_allowed");

    @pmi0("can_see_invite_links")
    public static final GroupsFieldsDto CAN_SEE_INVITE_LINKS = new GroupsFieldsDto("CAN_SEE_INVITE_LINKS", 146, "can_see_invite_links");

    @pmi0("subject_id")
    public static final GroupsFieldsDto SUBJECT_ID = new GroupsFieldsDto("SUBJECT_ID", 147, "subject_id");

    @pmi0("public_category")
    public static final GroupsFieldsDto PUBLIC_CATEGORY = new GroupsFieldsDto("PUBLIC_CATEGORY", 148, "public_category");

    @pmi0("public_subcategory")
    public static final GroupsFieldsDto PUBLIC_SUBCATEGORY = new GroupsFieldsDto("PUBLIC_SUBCATEGORY", 149, "public_subcategory");

    @pmi0("primary_block")
    public static final GroupsFieldsDto PRIMARY_BLOCK = new GroupsFieldsDto("PRIMARY_BLOCK", 150, "primary_block");

    @pmi0("tabs")
    public static final GroupsFieldsDto TABS = new GroupsFieldsDto("TABS", 151, "tabs");

    @pmi0("installed_apps_count")
    public static final GroupsFieldsDto INSTALLED_APPS_COUNT = new GroupsFieldsDto("INSTALLED_APPS_COUNT", 152, "installed_apps_count");

    @pmi0("login_confirmation_status")
    public static final GroupsFieldsDto LOGIN_CONFIRMATION_STATUS = new GroupsFieldsDto("LOGIN_CONFIRMATION_STATUS", 153, "login_confirmation_status");

    @pmi0("youla_status")
    public static final GroupsFieldsDto YOULA_STATUS = new GroupsFieldsDto("YOULA_STATUS", 154, "youla_status");

    @pmi0("extended_market")
    public static final GroupsFieldsDto EXTENDED_MARKET = new GroupsFieldsDto("EXTENDED_MARKET", 155, "extended_market");

    @pmi0("youla_use_wallpost_redirect")
    public static final GroupsFieldsDto YOULA_USE_WALLPOST_REDIRECT = new GroupsFieldsDto("YOULA_USE_WALLPOST_REDIRECT", 156, "youla_use_wallpost_redirect");

    @pmi0("youla_wallpost_redirect_miniapp_url")
    public static final GroupsFieldsDto YOULA_WALLPOST_REDIRECT_MINIAPP_URL = new GroupsFieldsDto("YOULA_WALLPOST_REDIRECT_MINIAPP_URL", 157, "youla_wallpost_redirect_miniapp_url");

    @pmi0("classifieds_antibaraholka_design_version")
    public static final GroupsFieldsDto CLASSIFIEDS_ANTIBARAHOLKA_DESIGN_VERSION = new GroupsFieldsDto("CLASSIFIEDS_ANTIBARAHOLKA_DESIGN_VERSION", 158, "classifieds_antibaraholka_design_version");

    @pmi0("is_youla_posting_to_wall_allowed")
    public static final GroupsFieldsDto IS_YOULA_POSTING_TO_WALL_ALLOWED = new GroupsFieldsDto("IS_YOULA_POSTING_TO_WALL_ALLOWED", 159, "is_youla_posting_to_wall_allowed");

    @pmi0("category")
    public static final GroupsFieldsDto CATEGORY = new GroupsFieldsDto("CATEGORY", 160, "category");

    @pmi0("category0")
    public static final GroupsFieldsDto CATEGORY0 = new GroupsFieldsDto("CATEGORY0", 161, "category0");

    @pmi0("category1")
    public static final GroupsFieldsDto CATEGORY1 = new GroupsFieldsDto("CATEGORY1", 162, "category1");

    @pmi0("category2")
    public static final GroupsFieldsDto CATEGORY2 = new GroupsFieldsDto("CATEGORY2", 163, "category2");

    @pmi0("deactivated_message")
    public static final GroupsFieldsDto DEACTIVATED_MESSAGE = new GroupsFieldsDto("DEACTIVATED_MESSAGE", 164, "deactivated_message");

    @pmi0("deactivated_type")
    public static final GroupsFieldsDto DEACTIVATED_TYPE = new GroupsFieldsDto("DEACTIVATED_TYPE", 165, "deactivated_type");

    @pmi0("is_clips_notifications_ignored")
    public static final GroupsFieldsDto IS_CLIPS_NOTIFICATIONS_IGNORED = new GroupsFieldsDto("IS_CLIPS_NOTIFICATIONS_IGNORED", 166, "is_clips_notifications_ignored");

    @pmi0("youla_posting_method")
    public static final GroupsFieldsDto YOULA_POSTING_METHOD = new GroupsFieldsDto("YOULA_POSTING_METHOD", 167, "youla_posting_method");

    @pmi0("place")
    public static final GroupsFieldsDto PLACE = new GroupsFieldsDto("PLACE", 168, "place");

    @pmi0("targ_artist_id")
    public static final GroupsFieldsDto TARG_ARTIST_ID = new GroupsFieldsDto("TARG_ARTIST_ID", 169, "targ_artist_id");

    @pmi0("is_government_organization")
    public static final GroupsFieldsDto IS_GOVERNMENT_ORGANIZATION = new GroupsFieldsDto("IS_GOVERNMENT_ORGANIZATION", 170, "is_government_organization");

    @pmi0("settings_tooltips_active")
    public static final GroupsFieldsDto SETTINGS_TOOLTIPS_ACTIVE = new GroupsFieldsDto("SETTINGS_TOOLTIPS_ACTIVE", 171, "settings_tooltips_active");

    @pmi0("is_yclients_tooltip_active")
    public static final GroupsFieldsDto IS_YCLIENTS_TOOLTIP_ACTIVE = new GroupsFieldsDto("IS_YCLIENTS_TOOLTIP_ACTIVE", 172, "is_yclients_tooltip_active");

    @pmi0(CampaignEx.JSON_KEY_STAR)
    public static final GroupsFieldsDto RATING = new GroupsFieldsDto(NativeAdContent.ViewTag.RATING, 173, CampaignEx.JSON_KEY_STAR);

    @pmi0("photo_avg_color")
    public static final GroupsFieldsDto PHOTO_AVG_COLOR = new GroupsFieldsDto("PHOTO_AVG_COLOR", 174, "photo_avg_color");

    @pmi0("has_live_cover")
    public static final GroupsFieldsDto HAS_LIVE_COVER = new GroupsFieldsDto("HAS_LIVE_COVER", 175, "has_live_cover");

    @pmi0("name_history")
    public static final GroupsFieldsDto NAME_HISTORY = new GroupsFieldsDto("NAME_HISTORY", 176, "name_history");

    @pmi0("service_rating")
    public static final GroupsFieldsDto SERVICE_RATING = new GroupsFieldsDto("SERVICE_RATING", 177, "service_rating");

    @pmi0("recommended_tips_widget")
    public static final GroupsFieldsDto RECOMMENDED_TIPS_WIDGET = new GroupsFieldsDto("RECOMMENDED_TIPS_WIDGET", 178, "recommended_tips_widget");

    @pmi0("inn")
    public static final GroupsFieldsDto INN = new GroupsFieldsDto("INN", 179, "inn");

    @pmi0("ogrn")
    public static final GroupsFieldsDto OGRN = new GroupsFieldsDto("OGRN", 180, "ogrn");

    @pmi0("kpp")
    public static final GroupsFieldsDto KPP = new GroupsFieldsDto("KPP", 181, "kpp");

    @pmi0("subject")
    public static final GroupsFieldsDto SUBJECT = new GroupsFieldsDto("SUBJECT", 182, "subject");

    @pmi0(TtmlNode.TAG_REGION)
    public static final GroupsFieldsDto REGION = new GroupsFieldsDto("REGION", 183, TtmlNode.TAG_REGION);

    @pmi0("is_set_tab_order")
    public static final GroupsFieldsDto IS_SET_TAB_ORDER = new GroupsFieldsDto("IS_SET_TAB_ORDER", 184, "is_set_tab_order");

    @pmi0("business_community_tooltips")
    public static final GroupsFieldsDto BUSINESS_COMMUNITY_TOOLTIPS = new GroupsFieldsDto("BUSINESS_COMMUNITY_TOOLTIPS", 185, "business_community_tooltips");

    @pmi0("can_call_to_community")
    public static final GroupsFieldsDto CAN_CALL_TO_COMMUNITY = new GroupsFieldsDto("CAN_CALL_TO_COMMUNITY", 186, "can_call_to_community");

    @pmi0("category1_name")
    public static final GroupsFieldsDto CATEGORY1_NAME = new GroupsFieldsDto("CATEGORY1_NAME", 187, "category1_name");

    @pmi0("ads_posts_info")
    public static final GroupsFieldsDto ADS_POSTS_INFO = new GroupsFieldsDto("ADS_POSTS_INFO", 188, "ads_posts_info");

    @pmi0("thematic")
    public static final GroupsFieldsDto THEMATIC = new GroupsFieldsDto("THEMATIC", PsExtractor.PRIVATE_STREAM_1, "thematic");

    @pmi0("banner_ads_main_client")
    public static final GroupsFieldsDto BANNER_ADS_MAIN_CLIENT = new GroupsFieldsDto("BANNER_ADS_MAIN_CLIENT", 190, "banner_ads_main_client");

    @pmi0("banner_ads_setting_miniapp")
    public static final GroupsFieldsDto BANNER_ADS_SETTING_MINIAPP = new GroupsFieldsDto("BANNER_ADS_SETTING_MINIAPP", 191, "banner_ads_setting_miniapp");

    @pmi0("leave_mode")
    public static final GroupsFieldsDto LEAVE_MODE = new GroupsFieldsDto("LEAVE_MODE", PsExtractor.AUDIO_STREAM, "leave_mode");

    @pmi0("banner_ads_main_mvk")
    public static final GroupsFieldsDto BANNER_ADS_MAIN_MVK = new GroupsFieldsDto("BANNER_ADS_MAIN_MVK", 193, "banner_ads_main_mvk");

    @pmi0("age_mark")
    public static final GroupsFieldsDto AGE_MARK = new GroupsFieldsDto("AGE_MARK", 194, "age_mark");

    @pmi0("is_media_wall_enabled")
    public static final GroupsFieldsDto IS_MEDIA_WALL_ENABLED = new GroupsFieldsDto("IS_MEDIA_WALL_ENABLED", 195, "is_media_wall_enabled");

    @pmi0("is_monetization_available")
    public static final GroupsFieldsDto IS_MONETIZATION_AVAILABLE = new GroupsFieldsDto("IS_MONETIZATION_AVAILABLE", 196, "is_monetization_available");

    @pmi0("video_notifications_status")
    public static final GroupsFieldsDto VIDEO_NOTIFICATIONS_STATUS = new GroupsFieldsDto("VIDEO_NOTIFICATIONS_STATUS", 197, "video_notifications_status");

    @pmi0("is_video_subscription_hidden")
    public static final GroupsFieldsDto IS_VIDEO_SUBSCRIPTION_HIDDEN = new GroupsFieldsDto("IS_VIDEO_SUBSCRIPTION_HIDDEN", 198, "is_video_subscription_hidden");

    @pmi0("suggested_category_name")
    public static final GroupsFieldsDto SUGGESTED_CATEGORY_NAME = new GroupsFieldsDto("SUGGESTED_CATEGORY_NAME", 199, "suggested_category_name");

    @pmi0("video_cover")
    public static final GroupsFieldsDto VIDEO_COVER = new GroupsFieldsDto("VIDEO_COVER", 200, "video_cover");

    @pmi0("video_lives_data")
    public static final GroupsFieldsDto VIDEO_LIVES_DATA = new GroupsFieldsDto("VIDEO_LIVES_DATA", 201, "video_lives_data");

    @pmi0("vk_ticket")
    public static final GroupsFieldsDto VK_TICKET = new GroupsFieldsDto("VK_TICKET", 202, "vk_ticket");

    @pmi0("is_market_online_booking_setting_enabled")
    public static final GroupsFieldsDto IS_MARKET_ONLINE_BOOKING_SETTING_ENABLED = new GroupsFieldsDto("IS_MARKET_ONLINE_BOOKING_SETTING_ENABLED", 203, "is_market_online_booking_setting_enabled");

    @pmi0("is_binding_to_yclients_service_enabled")
    public static final GroupsFieldsDto IS_BINDING_TO_YCLIENTS_SERVICE_ENABLED = new GroupsFieldsDto("IS_BINDING_TO_YCLIENTS_SERVICE_ENABLED", 204, "is_binding_to_yclients_service_enabled");

    @pmi0("is_market_market_link_attachment_enabled")
    public static final GroupsFieldsDto IS_MARKET_MARKET_LINK_ATTACHMENT_ENABLED = new GroupsFieldsDto("IS_MARKET_MARKET_LINK_ATTACHMENT_ENABLED", 205, "is_market_market_link_attachment_enabled");

    @pmi0("is_market_message_to_bc_attachment_enabled")
    public static final GroupsFieldsDto IS_MARKET_MESSAGE_TO_BC_ATTACHMENT_ENABLED = new GroupsFieldsDto("IS_MARKET_MESSAGE_TO_BC_ATTACHMENT_ENABLED", 206, "is_market_message_to_bc_attachment_enabled");

    @pmi0("is_market_online_booking_action_button_enabled")
    public static final GroupsFieldsDto IS_MARKET_ONLINE_BOOKING_ACTION_BUTTON_ENABLED = new GroupsFieldsDto("IS_MARKET_ONLINE_BOOKING_ACTION_BUTTON_ENABLED", 207, "is_market_online_booking_action_button_enabled");

    @pmi0("is_work_group")
    public static final GroupsFieldsDto IS_WORK_GROUP = new GroupsFieldsDto("IS_WORK_GROUP", Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, "is_work_group");

    @pmi0("work_group_info")
    public static final GroupsFieldsDto WORK_GROUP_INFO = new GroupsFieldsDto("WORK_GROUP_INFO", Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, "work_group_info");

    @pmi0("members_preview")
    public static final GroupsFieldsDto MEMBERS_PREVIEW = new GroupsFieldsDto("MEMBERS_PREVIEW", Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, "members_preview");

    @pmi0("co_ownership_enabled")
    public static final GroupsFieldsDto CO_OWNERSHIP_ENABLED = new GroupsFieldsDto("CO_OWNERSHIP_ENABLED", 211, "co_ownership_enabled");

    @pmi0("can_edit_screen_name")
    public static final GroupsFieldsDto CAN_EDIT_SCREEN_NAME = new GroupsFieldsDto("CAN_EDIT_SCREEN_NAME", Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, "can_edit_screen_name");

    @pmi0("can_create_event")
    public static final GroupsFieldsDto CAN_CREATE_EVENT = new GroupsFieldsDto("CAN_CREATE_EVENT", Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, "can_create_event");

    @pmi0("url")
    public static final GroupsFieldsDto URL = new GroupsFieldsDto("URL", Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, "url");

    @pmi0("tabs_list")
    public static final GroupsFieldsDto TABS_LIST = new GroupsFieldsDto("TABS_LIST", Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, "tabs_list");

    @pmi0("unread_count")
    public static final GroupsFieldsDto UNREAD_COUNT = new GroupsFieldsDto("UNREAD_COUNT", Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, "unread_count");

    @pmi0("videos_count")
    public static final GroupsFieldsDto VIDEOS_COUNT = new GroupsFieldsDto("VIDEOS_COUNT", Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, "videos_count");

    @pmi0("a_plus_mark")
    public static final GroupsFieldsDto A_PLUS_MARK = new GroupsFieldsDto("A_PLUS_MARK", Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, "a_plus_mark");

    @pmi0("is_educational")
    public static final GroupsFieldsDto IS_EDUCATIONAL = new GroupsFieldsDto("IS_EDUCATIONAL", Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, "is_educational");

    @pmi0("yclients_repeat_records")
    public static final GroupsFieldsDto YCLIENTS_REPEAT_RECORDS = new GroupsFieldsDto("YCLIENTS_REPEAT_RECORDS", Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, "yclients_repeat_records");

    @pmi0("channel_info")
    public static final GroupsFieldsDto CHANNEL_INFO = new GroupsFieldsDto("CHANNEL_INFO", Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, "channel_info");

    @pmi0("channel_block")
    public static final GroupsFieldsDto CHANNEL_BLOCK = new GroupsFieldsDto("CHANNEL_BLOCK", Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, "channel_block");

    @pmi0("event_organizer")
    public static final GroupsFieldsDto EVENT_ORGANIZER = new GroupsFieldsDto("EVENT_ORGANIZER", Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, "event_organizer");

    @pmi0("video_channel_data")
    public static final GroupsFieldsDto VIDEO_CHANNEL_DATA = new GroupsFieldsDto("VIDEO_CHANNEL_DATA", 224, "video_channel_data");

    @pmi0("is_group_displayed")
    public static final GroupsFieldsDto IS_GROUP_DISPLAYED = new GroupsFieldsDto("IS_GROUP_DISPLAYED", Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, "is_group_displayed");

    @pmi0("is_market_enabled")
    public static final GroupsFieldsDto IS_MARKET_ENABLED = new GroupsFieldsDto("IS_MARKET_ENABLED", Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, "is_market_enabled");

    @pmi0("content_sections_data")
    public static final GroupsFieldsDto CONTENT_SECTIONS_DATA = new GroupsFieldsDto("CONTENT_SECTIONS_DATA", Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, "content_sections_data");

    @pmi0("community_channel_id")
    public static final GroupsFieldsDto COMMUNITY_CHANNEL_ID = new GroupsFieldsDto("COMMUNITY_CHANNEL_ID", 228, "community_channel_id");

    @pmi0("is_manual_marked_business")
    public static final GroupsFieldsDto IS_MANUAL_MARKED_BUSINESS = new GroupsFieldsDto("IS_MANUAL_MARKED_BUSINESS", 229, "is_manual_marked_business");

    @pmi0("has_stories")
    public static final GroupsFieldsDto HAS_STORIES = new GroupsFieldsDto("HAS_STORIES", 230, "has_stories");

    @pmi0("market_shop_conditions_state")
    public static final GroupsFieldsDto MARKET_SHOP_CONDITIONS_STATE = new GroupsFieldsDto("MARKET_SHOP_CONDITIONS_STATE", 231, "market_shop_conditions_state");

    @pmi0("is_site_displayed")
    public static final GroupsFieldsDto IS_SITE_DISPLAYED = new GroupsFieldsDto("IS_SITE_DISPLAYED", 232, "is_site_displayed");

    @pmi0("strikes_info")
    public static final GroupsFieldsDto STRIKES_INFO = new GroupsFieldsDto("STRIKES_INFO", 233, "strikes_info");

    @pmi0("strikes_restrictions")
    public static final GroupsFieldsDto STRIKES_RESTRICTIONS = new GroupsFieldsDto("STRIKES_RESTRICTIONS", 234, "strikes_restrictions");

    @pmi0("enabled_features")
    public static final GroupsFieldsDto ENABLED_FEATURES = new GroupsFieldsDto("ENABLED_FEATURES", 235, "enabled_features");

    /* compiled from: GroupsFieldsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsFieldsDto createFromParcel(Parcel parcel) {
            return GroupsFieldsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsFieldsDto[] newArray(int i) {
            return new GroupsFieldsDto[i];
        }
    }

    static {
        GroupsFieldsDto[] i = i();
        $VALUES = i;
        $ENTRIES = new asp(i);
        CREATOR = new a();
    }

    private GroupsFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static final /* synthetic */ GroupsFieldsDto[] i() {
        return new GroupsFieldsDto[]{ID, NAME, SCREEN_NAME, IS_CLOSED, TYPE, IS_ADMIN, ADMIN_LEVEL, IS_MEMBER, IS_ADVERTISER, START_DATE, FINISH_DATE, DEACTIVATED, PHOTO_50, PHOTO_100, PHOTO_200, PHOTO_200_ORIG, PHOTO_400, PHOTO_400_ORIG, PHOTO_MAX, PHOTO_MAX_ORIG, PHOTO_BASE, EST_DATE, PUBLIC_DATE_LABEL, PHOTO_MAX_SIZE, IS_VIDEO_LIVE_NOTIFICATIONS_BLOCKED, VIDEO_LIVE, MARKET, MEMBER_STATUS, IS_ADULT, IS_HIDDEN_FROM_FEED, IS_FAVORITE, IS_SUBSCRIBED, CITY, COUNTRY, VERIFIED, DESCRIPTION, WIKI_PAGE, MEMBERS_COUNT, MEMBERS_COUNT_TEXT, REQUESTS_COUNT, VIDEO_LIVE_LEVEL, VIDEO_LIVE_COUNT, CLIPS_COUNT, TEXTLIVES_COUNT, COUNTERS, COVER, CAN_POST, CAN_SUGGEST, CAN_UPLOAD_STORY, CAN_UPLOAD_DOC, CAN_UPLOAD_VIDEO, CAN_UPLOAD_CLIP, CAN_SEE_ALL_POSTS, CAN_CREATE_TOPIC, ACTIVITY, FIXED_POST, HAS_PHOTO, CROP_PHOTO, STATUS, STATUS_AUDIO, MAIN_ALBUM_ID, LINKS, CONTACTS, WALL, SITE, MAIN_SECTION, SECONDARY_SECTION, TRENDING, CAN_MESSAGE, IS_MESSAGES_BLOCKED, CAN_SEND_NOTIFY, ONLINE_STATUS, INVITED_BY, AGE_LIMITS, BAN_INFO, HAS_MARKET_APP, USING_VKPAY_MARKET_APP, HAS_GROUP_CHANNEL, ADDRESSES, MESSAGES, IS_AUE, IS_LGBT, BUSINESS_RATING, IS_SUBSCRIBED_PODCASTS, CAN_SUBSCRIBE_PODCASTS, CAN_SUBSCRIBE_POSTS, LIVE_COVERS, STORIES_ARCHIVE_COUNT, HAS_UNSEEN_STORIES, LIKE, FRIENDS, HAD_TORCH, IS_WIDGET_MESSAGES_ENABLED, VKPAY_CAN_TRANSFER, VKPAY_RECEIVER_ID, PHONE, APP_BUTTON, APP_BUTTONS, AUDIO_ARTIST_ID, AUDIO_CURATOR_ID, BUTTONS, MARKET_SERVICES, MUSIC_AWARDS, TEXTLIVE, ACTION_BUTTON, AUTHOR_ID, IS_MARKET_CART_ENABLED, GROUP_CHANNEL, IS_SUBSCRIBED_STORIES, CAN_SUBSCRIBE_STORIES, IS_SUBSCRIBED_TEXTLIVES, VK_ADMIN_STATUS, MENU, WARNING_NOTIFICATION, CREATE_DATE, DONUT, DONUT_PAYMENT_INFO, CAN_POST_DONUT, CAN_SEE_MEMBERS, MSG_PUSH_ALLOWED, MSG_NOTIFICATIONS_ALLOWED, CHATS_STATUS, CAN_REPORT, IS_BUSINESS, IS_BUSINESS_CATEGORY, IS_CONFIRMED_BUSINESS, IS_GOLDEN_MARKED_BUSINESS, TRUST_MARK, MICROLANDING, TARIFFS, VERIFICATION_END_TIME, CAN_MANAGE, HAS_SUGGESTIONS, SHOW_SUGGESTIONS, CAN_VIEW_STATS, CAN_VIEW_POST_REACH_STATS, ADS_EASY_PROMOTE, ADS_EASY_PROMOTE_ALLOWED, ADS_POSTING_RESTRICTED_TODAY, ADS_MARKET_AUTOPROMOTE_ALLOWED, ADS_MARKET_EASY_PROMOTE, ADS_MARKET_AUTOPROMOTE_REASONS_NOT_ALLOWED, ADS_MARKET_SERVICES_AUTOPROMOTE_REASONS_NOT_ALLOWED, ADS_MARKET_SERVICES_AUTOPROMOTE_ALLOWED, ADS_MARKET_SERVICES_EASY_PROMOTE, ADS_EASY_PROMOTE_REASONS_NOT_ALLOWED, CAN_SEE_INVITE_LINKS, SUBJECT_ID, PUBLIC_CATEGORY, PUBLIC_SUBCATEGORY, PRIMARY_BLOCK, TABS, INSTALLED_APPS_COUNT, LOGIN_CONFIRMATION_STATUS, YOULA_STATUS, EXTENDED_MARKET, YOULA_USE_WALLPOST_REDIRECT, YOULA_WALLPOST_REDIRECT_MINIAPP_URL, CLASSIFIEDS_ANTIBARAHOLKA_DESIGN_VERSION, IS_YOULA_POSTING_TO_WALL_ALLOWED, CATEGORY, CATEGORY0, CATEGORY1, CATEGORY2, DEACTIVATED_MESSAGE, DEACTIVATED_TYPE, IS_CLIPS_NOTIFICATIONS_IGNORED, YOULA_POSTING_METHOD, PLACE, TARG_ARTIST_ID, IS_GOVERNMENT_ORGANIZATION, SETTINGS_TOOLTIPS_ACTIVE, IS_YCLIENTS_TOOLTIP_ACTIVE, RATING, PHOTO_AVG_COLOR, HAS_LIVE_COVER, NAME_HISTORY, SERVICE_RATING, RECOMMENDED_TIPS_WIDGET, INN, OGRN, KPP, SUBJECT, REGION, IS_SET_TAB_ORDER, BUSINESS_COMMUNITY_TOOLTIPS, CAN_CALL_TO_COMMUNITY, CATEGORY1_NAME, ADS_POSTS_INFO, THEMATIC, BANNER_ADS_MAIN_CLIENT, BANNER_ADS_SETTING_MINIAPP, LEAVE_MODE, BANNER_ADS_MAIN_MVK, AGE_MARK, IS_MEDIA_WALL_ENABLED, IS_MONETIZATION_AVAILABLE, VIDEO_NOTIFICATIONS_STATUS, IS_VIDEO_SUBSCRIPTION_HIDDEN, SUGGESTED_CATEGORY_NAME, VIDEO_COVER, VIDEO_LIVES_DATA, VK_TICKET, IS_MARKET_ONLINE_BOOKING_SETTING_ENABLED, IS_BINDING_TO_YCLIENTS_SERVICE_ENABLED, IS_MARKET_MARKET_LINK_ATTACHMENT_ENABLED, IS_MARKET_MESSAGE_TO_BC_ATTACHMENT_ENABLED, IS_MARKET_ONLINE_BOOKING_ACTION_BUTTON_ENABLED, IS_WORK_GROUP, WORK_GROUP_INFO, MEMBERS_PREVIEW, CO_OWNERSHIP_ENABLED, CAN_EDIT_SCREEN_NAME, CAN_CREATE_EVENT, URL, TABS_LIST, UNREAD_COUNT, VIDEOS_COUNT, A_PLUS_MARK, IS_EDUCATIONAL, YCLIENTS_REPEAT_RECORDS, CHANNEL_INFO, CHANNEL_BLOCK, EVENT_ORGANIZER, VIDEO_CHANNEL_DATA, IS_GROUP_DISPLAYED, IS_MARKET_ENABLED, CONTENT_SECTIONS_DATA, COMMUNITY_CHANNEL_ID, IS_MANUAL_MARKED_BUSINESS, HAS_STORIES, MARKET_SHOP_CONDITIONS_STATE, IS_SITE_DISPLAYED, STRIKES_INFO, STRIKES_RESTRICTIONS, ENABLED_FEATURES};
    }

    public static zrp<GroupsFieldsDto> j() {
        return $ENTRIES;
    }

    public static GroupsFieldsDto valueOf(String str) {
        return (GroupsFieldsDto) Enum.valueOf(GroupsFieldsDto.class, str);
    }

    public static GroupsFieldsDto[] values() {
        return (GroupsFieldsDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String k() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
