package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.huawei.hms.android.SystemUtils;
import com.ironsource.D1;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.stat.scheme.SchemeStat$EventBenchmarkMain;
import com.vungle.ads.internal.protos.Sdk;
import org.chromium.base.version_info.VersionConstants;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.bh10;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.uay;
import xsna.urd0;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsCorePushesStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem implements SchemeStat$EventBenchmarkMain.b {
    public final transient String a;

    @pmi0("app_id")
    private final int appId;
    public final transient String b;

    @pmi0("content_owner_id")
    private final Long contentOwnerId;

    @pmi0("device_activity_group")
    private final DeviceActivityGroup deviceActivityGroup;

    @pmi0("hash")
    private final FilteredString filteredHash;

    @pmi0("sub_type")
    private final FilteredString filteredSubType;

    @pmi0("is_feedback")
    private final Boolean isFeedback;

    @pmi0("log_id")
    private final long logId;

    @pmi0("network_info")
    private final MobileOfficialAppsCoreDeviceStat$NetworkInfo networkInfo;

    @pmi0(IronSourceConstants.EVENTS_PROVIDER)
    private final Provider provider;

    @pmi0("to_id")
    private final long toId;

    @pmi0("ts_dispatched")
    private final long tsDispatched;

    @pmi0("ts_received")
    private final long tsReceived;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCorePushesStat.kt */
    public static final class DeviceActivityGroup {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DeviceActivityGroup[] $VALUES;

        @pmi0("month")
        public static final DeviceActivityGroup MONTH;

        @pmi0("today")
        public static final DeviceActivityGroup TODAY;

        @pmi0("week")
        public static final DeviceActivityGroup WEEK;

        @pmi0("yesterday")
        public static final DeviceActivityGroup YESTERDAY;

        static {
            DeviceActivityGroup deviceActivityGroup = new DeviceActivityGroup("TODAY", 0);
            TODAY = deviceActivityGroup;
            DeviceActivityGroup deviceActivityGroup2 = new DeviceActivityGroup("YESTERDAY", 1);
            YESTERDAY = deviceActivityGroup2;
            DeviceActivityGroup deviceActivityGroup3 = new DeviceActivityGroup("WEEK", 2);
            WEEK = deviceActivityGroup3;
            DeviceActivityGroup deviceActivityGroup4 = new DeviceActivityGroup("MONTH", 3);
            MONTH = deviceActivityGroup4;
            DeviceActivityGroup[] deviceActivityGroupArr = {deviceActivityGroup, deviceActivityGroup2, deviceActivityGroup3, deviceActivityGroup4};
            $VALUES = deviceActivityGroupArr;
            $ENTRIES = new asp(deviceActivityGroupArr);
        }

        private DeviceActivityGroup(String str, int i) {
        }

        public static DeviceActivityGroup valueOf(String str) {
            return (DeviceActivityGroup) Enum.valueOf(DeviceActivityGroup.class, str);
        }

        public static DeviceActivityGroup[] values() {
            return (DeviceActivityGroup[]) $VALUES.clone();
        }
    }

    /* compiled from: MobileOfficialAppsCorePushesStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem>, a9y<MobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem(fai.p(x9yVar, "app_id"), (DeviceActivityGroup) dq.f(x9yVar, "device_activity_group", tru.a(), DeviceActivityGroup.class), fai.s(x9yVar, "hash"), fai.q(x9yVar, "log_id"), (Provider) dq.f(x9yVar, IronSourceConstants.EVENTS_PROVIDER, tru.a(), Provider.class), (MobileOfficialAppsCoreDeviceStat$NetworkInfo) dq.f(x9yVar, "network_info", tru.a(), MobileOfficialAppsCoreDeviceStat$NetworkInfo.class), fai.q(x9yVar, "to_id"), fai.q(x9yVar, "ts_dispatched"), fai.q(x9yVar, "ts_received"), (Type) dq.f(x9yVar, "type", tru.a(), Type.class), fai.B(x9yVar, "content_owner_id"), fai.y(x9yVar, "is_feedback"), fai.C(x9yVar, "sub_type"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem = (MobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.n("app_id", Integer.valueOf(mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem.a()));
            x9yVar.o("device_activity_group", tru.a().toJson(mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem.c()));
            x9yVar.o("hash", mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem.a);
            x9yVar.n("log_id", Long.valueOf(mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem.d()));
            x9yVar.o(IronSourceConstants.EVENTS_PROVIDER, tru.a().toJson(mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem.f()));
            x9yVar.o("network_info", tru.a().toJson(mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem.e()));
            x9yVar.n("to_id", Long.valueOf(mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem.g()));
            x9yVar.n("ts_dispatched", Long.valueOf(mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem.h()));
            x9yVar.n("ts_received", Long.valueOf(mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem.i()));
            x9yVar.o("type", tru.a().toJson(mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem.j()));
            x9yVar.n("content_owner_id", mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem.b());
            x9yVar.m(mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem.k(), "is_feedback");
            x9yVar.o("sub_type", mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem.b);
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCorePushesStat.kt */
    public static final class Provider {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Provider[] $VALUES;

        @pmi0("apns")
        public static final Provider APNS;

        @pmi0("fcm")
        public static final Provider FCM;

        @pmi0("gcm")
        public static final Provider GCM;

        @pmi0("huawei")
        public static final Provider HUAWEI;

        @pmi0("rustore")
        public static final Provider RUSTORE;

        static {
            Provider provider = new Provider("APNS", 0);
            APNS = provider;
            Provider provider2 = new Provider(SystemUtils.PRODUCT_HUAWEI, 1);
            HUAWEI = provider2;
            Provider provider3 = new Provider("FCM", 2);
            FCM = provider3;
            Provider provider4 = new Provider("RUSTORE", 3);
            RUSTORE = provider4;
            Provider provider5 = new Provider("GCM", 4);
            GCM = provider5;
            Provider[] providerArr = {provider, provider2, provider3, provider4, provider5};
            $VALUES = providerArr;
            $ENTRIES = new asp(providerArr);
        }

        private Provider(String str, int i) {
        }

        public static Provider valueOf(String str) {
            return (Provider) Enum.valueOf(Provider.class, str);
        }

        public static Provider[] values() {
            return (Provider[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCorePushesStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)
        public static final Type ADS;

        @pmi0("advice")
        public static final Type ADVICE;

        @pmi0("android_feed_promo")
        public static final Type ANDROID_FEED_PROMO;

        @pmi0("anonymous_token_signing")
        public static final Type ANONYMOUS_TOKEN_SIGNING;

        @pmi0("app_promo")
        public static final Type APP_PROMO;

        @pmi0("app_request")
        public static final Type APP_REQUEST;

        @pmi0("artist_event")
        public static final Type ARTIST_EVENT;

        @pmi0("associated_events")
        public static final Type ASSOCIATED_EVENTS;

        @pmi0("audio_pre_save_album")
        public static final Type AUDIO_PRE_SAVE_ALBUM;

        @pmi0("author_mention")
        public static final Type AUTHOR_MENTION;

        @pmi0("badge")
        public static final Type BADGE;

        @pmi0("birthday")
        public static final Type BIRTHDAY;

        @pmi0("blockchain_nft_market")
        public static final Type BLOCKCHAIN_NFT_MARKET;

        @pmi0("blockchain_nft_retention")
        public static final Type BLOCKCHAIN_NFT_RETENTION;

        @pmi0("board_post")
        public static final Type BOARD_POST;

        @pmi0("bugtracker_events")
        public static final Type BUGTRACKER_EVENTS;

        @pmi0("business_notify")
        public static final Type BUSINESS_NOTIFY;

        @pmi0(NotificationCompat.CATEGORY_CALL)
        public static final Type CALL;

        @pmi0(RTCStatsConstants.KEY_CHANNELS)
        public static final Type CHANNELS;

        @pmi0("channel_activation")
        public static final Type CHANNEL_ACTIVATION;

        @pmi0("channel_activation_erase")
        public static final Type CHANNEL_ACTIVATION_ERASE;

        @pmi0("channel_msg")
        public static final Type CHANNEL_MSG;

        @pmi0("chat")
        public static final Type CHAT;

        @pmi0("chat_mention")
        public static final Type CHAT_MENTION;

        @pmi0("clips_duet_created")
        public static final Type CLIPS_DUET_CREATED;

        @pmi0("clips_promo")
        public static final Type CLIPS_PROMO;

        @pmi0("clips_school_promo")
        public static final Type CLIPS_SCHOOL_PROMO;

        @pmi0("clip_co_owner_status")
        public static final Type CLIP_CO_OWNER_STATUS;

        @pmi0("clip_from_video_created")
        public static final Type CLIP_FROM_VIDEO_CREATED;

        @pmi0("comment")
        public static final Type COMMENT;

        @pmi0("comment_commented")
        public static final Type COMMENT_COMMENTED;

        @pmi0("comment_mention")
        public static final Type COMMENT_MENTION;

        @pmi0("community_msg")
        public static final Type COMMUNITY_MSG;

        @pmi0("community_msg_del")
        public static final Type COMMUNITY_MSG_DEL;

        @pmi0("community_msg_del_till")
        public static final Type COMMUNITY_MSG_DEL_TILL;

        @pmi0("content_achievements")
        public static final Type CONTENT_ACHIEVEMENTS;

        @pmi0("converting_videos_to_short_videos_notifications")
        public static final Type CONVERTING_VIDEOS_TO_SHORT_VIDEOS_NOTIFICATIONS;

        @pmi0("co_ownership")
        public static final Type CO_OWNERSHIP;

        @pmi0("custom")
        public static final Type CUSTOM;

        @pmi0("dating_silent")
        public static final Type DATING_SILENT;

        @pmi0("discover_top_post")
        public static final Type DISCOVER_TOP_POST;

        @pmi0("donut")
        public static final Type DONUT;

        @pmi0("email_not_working")
        public static final Type EMAIL_NOT_WORKING;

        @pmi0("email_soft_bouncing")
        public static final Type EMAIL_SOFT_BOUNCING;

        @pmi0("erase")
        public static final Type ERASE;

        @pmi0("erase_message")
        public static final Type ERASE_MESSAGE;

        @pmi0("erase_messages")
        public static final Type ERASE_MESSAGES;

        @pmi0("event_block_settings")
        public static final Type EVENT_BLOCK_SETTINGS;

        @pmi0("event_soon")
        public static final Type EVENT_SOON;

        @pmi0(D1.e)
        public static final Type EXTERNAL;

        @pmi0("feed_promo")
        public static final Type FEED_PROMO;

        @pmi0("follow")
        public static final Type FOLLOW;

        @pmi0("follower")
        public static final Type FOLLOWER;

        @pmi0("followers_migration")
        public static final Type FOLLOWERS_MIGRATION;

        @pmi0("followers_mode_force_enabled")
        public static final Type FOLLOWERS_MODE_FORCE_ENABLED;

        @pmi0("friend")
        public static final Type FRIEND;

        @pmi0("friend_accepted")
        public static final Type FRIEND_ACCEPTED;

        @pmi0("friend_found")
        public static final Type FRIEND_FOUND;

        @pmi0("gift")
        public static final Type GIFT;

        @pmi0("group_accepted")
        public static final Type GROUP_ACCEPTED;

        @pmi0("group_channel")
        public static final Type GROUP_CHANNEL;

        @pmi0("group_invite")
        public static final Type GROUP_INVITE;

        @pmi0("group_main_admin")
        public static final Type GROUP_MAIN_ADMIN;

        @pmi0("group_officer")
        public static final Type GROUP_OFFICER;

        @pmi0("instagram_import_account_approved")
        public static final Type INSTAGRAM_IMPORT_ACCOUNT_APPROVED;

        @pmi0("instagram_import_account_denied")
        public static final Type INSTAGRAM_IMPORT_ACCOUNT_DENIED;

        @pmi0("instagram_import_audience_imported")
        public static final Type INSTAGRAM_IMPORT_AUDIENCE_IMPORTED;

        @pmi0("instagram_import_content_parsed")
        public static final Type INSTAGRAM_IMPORT_CONTENT_PARSED;

        @pmi0("instagram_import_content_published")
        public static final Type INSTAGRAM_IMPORT_CONTENT_PUBLISHED;

        @pmi0("instagram_import_process_failed")
        public static final Type INSTAGRAM_IMPORT_PROCESS_FAILED;

        @pmi0("interest_post")
        public static final Type INTEREST_POST;

        @pmi0("invited_friend_found")
        public static final Type INVITED_FRIEND_FOUND;

        @pmi0("iphone_feed_promo")
        public static final Type IPHONE_FEED_PROMO;

        @pmi0("join_request")
        public static final Type JOIN_REQUEST;

        @pmi0("lib_verify")
        public static final Type LIB_VERIFY;

        @pmi0("like")
        public static final Type LIKE;

        @pmi0("live")
        public static final Type LIVE;

        @pmi0("live_notify")
        public static final Type LIVE_NOTIFY;

        @pmi0("live_start")
        public static final Type LIVE_START;

        @pmi0("login")
        public static final Type LOGIN;

        @pmi0("long_time_post")
        public static final Type LONG_TIME_POST;

        @pmi0("lovina_notifications")
        public static final Type LOVINA_NOTIFICATIONS;

        @pmi0("marketing")
        public static final Type MARKETING;

        @pmi0("market_community_got_review")
        public static final Type MARKET_COMMUNITY_GOT_REVIEW;

        @pmi0("market_community_update_delete_pinned_review")
        public static final Type MARKET_COMMUNITY_UPDATE_DELETE_PINNED_REVIEW;

        @pmi0("market_digest_notifications")
        public static final Type MARKET_DIGEST_NOTIFICATIONS;

        @pmi0("market_leave_item_review")
        public static final Type MARKET_LEAVE_ITEM_REVIEW;

        @pmi0("market_new_order_for_admin")
        public static final Type MARKET_NEW_ORDER_FOR_ADMIN;

        @pmi0("market_status_import_notifications")
        public static final Type MARKET_STATUS_IMPORT_NOTIFICATIONS;

        @pmi0("market_user_review_published")
        public static final Type MARKET_USER_REVIEW_PUBLISHED;

        @pmi0("mask")
        public static final Type MASK;

        @pmi0("memories")
        public static final Type MEMORIES;

        @pmi0("mention")
        public static final Type MENTION;

        @pmi0("message_from_community")
        public static final Type MESSAGE_FROM_COMMUNITY;

        @pmi0("message_from_important_user")
        public static final Type MESSAGE_FROM_IMPORTANT_USER;

        @pmi0("message_from_unfamiliar_user")
        public static final Type MESSAGE_FROM_UNFAMILIAR_USER;

        @pmi0("message_mention")
        public static final Type MESSAGE_MENTION;

        @pmi0("message_new")
        public static final Type MESSAGE_NEW;

        @pmi0("message_request")
        public static final Type MESSAGE_REQUEST;

        @pmi0("message_request_accepted")
        public static final Type MESSAGE_REQUEST_ACCEPTED;

        @pmi0(NotificationCompat.CATEGORY_MISSED_CALL)
        public static final Type MISSED_CALL;

        @pmi0("money")
        public static final Type MONEY;

        @pmi0("money_request")
        public static final Type MONEY_REQUEST;

        @pmi0("money_send")
        public static final Type MONEY_SEND;

        @pmi0("money_transfer_old")
        public static final Type MONEY_TRANSFER_OLD;

        @pmi0(NotificationCompat.CATEGORY_MESSAGE)
        public static final Type MSG;

        @pmi0("msg_reaction_del")
        public static final Type MSG_REACTION_DEL;

        @pmi0("msg_reaction_set")
        public static final Type MSG_REACTION_SET;

        @pmi0("multiple_friends_recommended_mini_app")
        public static final Type MULTIPLE_FRIENDS_RECOMMENDED_MINI_APP;

        @pmi0("new_audio_album")
        public static final Type NEW_AUDIO_ALBUM;

        @pmi0("new_post")
        public static final Type NEW_POST;

        @pmi0("new_user")
        public static final Type NEW_USER;

        @pmi0("notifications_mailbox_binding")
        public static final Type NOTIFICATIONS_MAILBOX_BINDING;

        @pmi0("open_url")
        public static final Type OPEN_URL;

        @pmi0("photo_comment")
        public static final Type PHOTO_COMMENT;

        @pmi0("photo_long_time")
        public static final Type PHOTO_LONG_TIME;

        @pmi0("podcasts")
        public static final Type PODCASTS;

        @pmi0("post_comment")
        public static final Type POST_COMMENT;

        @pmi0("post_co_owner_status")
        public static final Type POST_CO_OWNER_STATUS;

        @pmi0("private_group_post")
        public static final Type PRIVATE_GROUP_POST;

        @pmi0("push_msg_group")
        public static final Type PUSH_MSG_GROUP;

        @pmi0("question")
        public static final Type QUESTION;

        @pmi0(NotificationCompat.CATEGORY_REMINDER)
        public static final Type REMINDER;

        @pmi0("reply")
        public static final Type REPLY;

        @pmi0("repost")
        public static final Type REPOST;

        @pmi0("retention_bookmarks")
        public static final Type RETENTION_BOOKMARKS;

        @pmi0("retention_bookmarks_by_types")
        public static final Type RETENTION_BOOKMARKS_BY_TYPES;

        @pmi0("retention_first_story")
        public static final Type RETENTION_FIRST_STORY;

        @pmi0("retention_friend_swipe")
        public static final Type RETENTION_FRIEND_SWIPE;

        @pmi0("retention_group_recommendation")
        public static final Type RETENTION_GROUP_RECOMMENDATION;

        @pmi0("retention_recommended_friends_swipe")
        public static final Type RETENTION_RECOMMENDED_FRIENDS_SWIPE;

        @pmi0("retention_top_clip")
        public static final Type RETENTION_TOP_CLIP;

        @pmi0("retention_waiting_for_message_reply")
        public static final Type RETENTION_WAITING_FOR_MESSAGE_REPLY;

        @pmi0("sdk_open")
        public static final Type SDK_OPEN;

        @pmi0("service_installation")
        public static final Type SERVICE_INSTALLATION;

        @pmi0("show_message")
        public static final Type SHOW_MESSAGE;

        @pmi0("stickers_bonus_discounts_expiration_1")
        public static final Type STICKERS_BONUS_DISCOUNTS_EXPIRATION_1;

        @pmi0("stickers_bonus_discounts_expiration_2")
        public static final Type STICKERS_BONUS_DISCOUNTS_EXPIRATION_2;

        @pmi0("stickers_bonus_expiration_1")
        public static final Type STICKERS_BONUS_EXPIRATION_1;

        @pmi0("stickers_bonus_expiration_2")
        public static final Type STICKERS_BONUS_EXPIRATION_2;

        @pmi0("story_birthday")
        public static final Type STORY_BIRTHDAY;

        @pmi0("story_birthday_invite")
        public static final Type STORY_BIRTHDAY_INVITE;

        @pmi0("story_interaction")
        public static final Type STORY_INTERACTION;

        @pmi0("story_long_time")
        public static final Type STORY_LONG_TIME;

        @pmi0("story_mention")
        public static final Type STORY_MENTION;

        @pmi0("story_music_shared")
        public static final Type STORY_MUSIC_SHARED;

        @pmi0("story_question_answered")
        public static final Type STORY_QUESTION_ANSWERED;

        @pmi0("story_question_asked")
        public static final Type STORY_QUESTION_ASKED;

        @pmi0("story_reply")
        public static final Type STORY_REPLY;

        @pmi0("story_subscription")
        public static final Type STORY_SUBSCRIPTION;

        @pmi0("story_year_memories_generated")
        public static final Type STORY_YEAR_MEMORIES_GENERATED;

        @pmi0("suggested_post")
        public static final Type SUGGESTED_POST;

        @pmi0("support_reply")
        public static final Type SUPPORT_REPLY;

        @pmi0("tag_photo")
        public static final Type TAG_PHOTO;

        @pmi0("textlive_post")
        public static final Type TEXTLIVE_POST;

        @pmi0("textlive_start")
        public static final Type TEXTLIVE_START;

        @pmi0("top_clips_authors")
        public static final Type TOP_CLIPS_AUTHORS;

        @pmi0("unread_messages")
        public static final Type UNREAD_MESSAGES;

        @pmi0("user_recommended_mini_app")
        public static final Type USER_RECOMMENDED_MINI_APP;

        @pmi0("uxpoll")
        public static final Type UXPOLL;

        @pmi0("uxpoll_video")
        public static final Type UXPOLL_VIDEO;

        @pmi0("validate_action")
        public static final Type VALIDATE_ACTION;

        @pmi0("validate_device")
        public static final Type VALIDATE_DEVICE;

        @pmi0("video_child_account")
        public static final Type VIDEO_CHILD_ACCOUNT;

        @pmi0("video_dcp_publish")
        public static final Type VIDEO_DCP_PUBLISH;

        @pmi0("video_deepfake_processed")
        public static final Type VIDEO_DEEPFAKE_PROCESSED;

        @pmi0("video_groups_publish")
        public static final Type VIDEO_GROUPS_PUBLISH;

        @pmi0("video_groups_publish_pref")
        public static final Type VIDEO_GROUPS_PUBLISH_PREF;

        @pmi0("video_groups_top_pref")
        public static final Type VIDEO_GROUPS_TOP_PREF;

        @pmi0("video_motivation")
        public static final Type VIDEO_MOTIVATION;

        @pmi0("video_playlists")
        public static final Type VIDEO_PLAYLISTS;

        @pmi0("video_postcard_created")
        public static final Type VIDEO_POSTCARD_CREATED;

        @pmi0("video_retention")
        public static final Type VIDEO_RETENTION;

        @pmi0("video_thumb_deleted")
        public static final Type VIDEO_THUMB_DELETED;

        @pmi0("vkcom_email_announce")
        public static final Type VKCOM_EMAIL_ANNOUNCE;

        @pmi0("vkcom_email_app_promo")
        public static final Type VKCOM_EMAIL_APP_PROMO;

        @pmi0("vkdating_like")
        public static final Type VKDATING_LIKE;

        @pmi0("vkdating_match")
        public static final Type VKDATING_MATCH;

        @pmi0("vkdating_message")
        public static final Type VKDATING_MESSAGE;

        @pmi0("vkdating_message_reaction")
        public static final Type VKDATING_MESSAGE_REACTION;

        @pmi0("vkdating_news_and_updates")
        public static final Type VKDATING_NEWS_AND_UPDATES;

        @pmi0("vkdating_service")
        public static final Type VKDATING_SERVICE;

        @pmi0("vkdating_superlike")
        public static final Type VKDATING_SUPERLIKE;

        @pmi0("vkgo")
        public static final Type VKGO;

        @pmi0("vkme_install_push")
        public static final Type VKME_INSTALL_PUSH;

        @pmi0("vkmusic_artist_release_follower")
        public static final Type VKMUSIC_ARTIST_RELEASE_FOLLOWER;

        @pmi0("vkmusic_artist_release_superfan")
        public static final Type VKMUSIC_ARTIST_RELEASE_SUPERFAN;

        @pmi0("vkmusic_promo")
        public static final Type VKMUSIC_PROMO;

        @pmi0("vk_apps_open_url")
        public static final Type VK_APPS_OPEN_URL;

        @pmi0("vk_health_notifications")
        public static final Type VK_HEALTH_NOTIFICATIONS;

        @pmi0("vk_pay_transaction")
        public static final Type VK_PAY_TRANSACTION;

        @pmi0("vk_video_promo")
        public static final Type VK_VIDEO_PROMO;

        @pmi0("voting_expired")
        public static final Type VOTING_EXPIRED;

        @pmi0("wake_up")
        public static final Type WAKE_UP;

        @pmi0("wall_mention")
        public static final Type WALL_MENTION;

        @pmi0("wall_post")
        public static final Type WALL_POST;

        @pmi0("wall_post_copyright_mention")
        public static final Type WALL_POST_COPYRIGHT_MENTION;

        @pmi0("wall_publish")
        public static final Type WALL_PUBLISH;

        @pmi0("web_feed_promo")
        public static final Type WEB_FEED_PROMO;

        @pmi0("wldating_compliment")
        public static final Type WLDATING_COMPLIMENT;

        @pmi0("wldating_like")
        public static final Type WLDATING_LIKE;

        @pmi0("wldating_match")
        public static final Type WLDATING_MATCH;

        @pmi0("wldating_message")
        public static final Type WLDATING_MESSAGE;

        @pmi0("wldating_message_reaction")
        public static final Type WLDATING_MESSAGE_REACTION;

        @pmi0("wldating_news_and_updates")
        public static final Type WLDATING_NEWS_AND_UPDATES;

        @pmi0("wldating_service")
        public static final Type WLDATING_SERVICE;

        @pmi0("youla_notifications")
        public static final Type YOULA_NOTIFICATIONS;

        static {
            Type type = new Type("CALL", 0);
            CALL = type;
            Type type2 = new Type("CHAT", 1);
            CHAT = type2;
            Type type3 = new Type("CHAT_MENTION", 2);
            CHAT_MENTION = type3;
            Type type4 = new Type("COMMUNITY_MSG", 3);
            COMMUNITY_MSG = type4;
            Type type5 = new Type("COMMUNITY_MSG_DEL", 4);
            COMMUNITY_MSG_DEL = type5;
            Type type6 = new Type("COMMUNITY_MSG_DEL_TILL", 5);
            COMMUNITY_MSG_DEL_TILL = type6;
            Type type7 = new Type("CHANNEL_ACTIVATION", 6);
            CHANNEL_ACTIVATION = type7;
            Type type8 = new Type("CHANNEL_ACTIVATION_ERASE", 7);
            CHANNEL_ACTIVATION_ERASE = type8;
            Type type9 = new Type("ERASE", 8);
            ERASE = type9;
            Type type10 = new Type("ERASE_MESSAGE", 9);
            ERASE_MESSAGE = type10;
            Type type11 = new Type("ERASE_MESSAGES", 10);
            ERASE_MESSAGES = type11;
            Type type12 = new Type("MESSAGE_REQUEST", 11);
            MESSAGE_REQUEST = type12;
            Type type13 = new Type("MESSAGE_REQUEST_ACCEPTED", 12);
            MESSAGE_REQUEST_ACCEPTED = type13;
            Type type14 = new Type("MISSED_CALL", 13);
            MISSED_CALL = type14;
            Type type15 = new Type("MSG", 14);
            MSG = type15;
            Type type16 = new Type("MSG_REACTION_DEL", 15);
            MSG_REACTION_DEL = type16;
            Type type17 = new Type("MSG_REACTION_SET", 16);
            MSG_REACTION_SET = type17;
            Type type18 = new Type("RETENTION_WAITING_FOR_MESSAGE_REPLY", 17);
            RETENTION_WAITING_FOR_MESSAGE_REPLY = type18;
            Type type19 = new Type("UNREAD_MESSAGES", 18);
            UNREAD_MESSAGES = type19;
            Type type20 = new Type("GROUP_CHANNEL", 19);
            GROUP_CHANNEL = type20;
            Type type21 = new Type("GIFT", 20);
            GIFT = type21;
            Type type22 = new Type("BUSINESS_NOTIFY", 21);
            BUSINESS_NOTIFY = type22;
            Type type23 = new Type("MESSAGE_NEW", 22);
            MESSAGE_NEW = type23;
            Type type24 = new Type("PUSH_MSG_GROUP", 23);
            PUSH_MSG_GROUP = type24;
            Type type25 = new Type("MESSAGE_MENTION", 24);
            MESSAGE_MENTION = type25;
            Type type26 = new Type("MONEY", 25);
            MONEY = type26;
            Type type27 = new Type("MONEY_TRANSFER_OLD", 26);
            MONEY_TRANSFER_OLD = type27;
            Type type28 = new Type("MONEY_SEND", 27);
            MONEY_SEND = type28;
            Type type29 = new Type("MONEY_REQUEST", 28);
            MONEY_REQUEST = type29;
            Type type30 = new Type("LIKE", 29);
            LIKE = type30;
            Type type31 = new Type("REPOST", 30);
            REPOST = type31;
            Type type32 = new Type("COMMENT", 31);
            COMMENT = type32;
            Type type33 = new Type("MENTION", 32);
            MENTION = type33;
            Type type34 = new Type("REPLY", 33);
            REPLY = type34;
            Type type35 = new Type("NEW_POST", 34);
            NEW_POST = type35;
            Type type36 = new Type("WALL_POST", 35);
            WALL_POST = type36;
            Type type37 = new Type("WALL_PUBLISH", 36);
            WALL_PUBLISH = type37;
            Type type38 = new Type("INTEREST_POST", 37);
            INTEREST_POST = type38;
            Type type39 = new Type("STORY_LONG_TIME", 38);
            STORY_LONG_TIME = type39;
            Type type40 = new Type("PHOTO_LONG_TIME", 39);
            PHOTO_LONG_TIME = type40;
            Type type41 = new Type("STORY_SUBSCRIPTION", 40);
            STORY_SUBSCRIPTION = type41;
            Type type42 = new Type("FRIEND", 41);
            FRIEND = type42;
            Type type43 = new Type("FOLLOW", 42);
            FOLLOW = type43;
            Type type44 = new Type("FRIEND_FOUND", 43);
            FRIEND_FOUND = type44;
            Type type45 = new Type("INVITED_FRIEND_FOUND", 44);
            INVITED_FRIEND_FOUND = type45;
            Type type46 = new Type("FRIEND_ACCEPTED", 45);
            FRIEND_ACCEPTED = type46;
            Type type47 = new Type("GROUP_INVITE", 46);
            GROUP_INVITE = type47;
            Type type48 = new Type("GROUP_ACCEPTED", 47);
            GROUP_ACCEPTED = type48;
            Type type49 = new Type("GROUP_MAIN_ADMIN", 48);
            GROUP_MAIN_ADMIN = type49;
            Type type50 = new Type("TAG_PHOTO", 49);
            TAG_PHOTO = type50;
            Type type51 = new Type("BIRTHDAY", 50);
            BIRTHDAY = type51;
            Type type52 = new Type("EVENT_SOON", 51);
            EVENT_SOON = type52;
            Type type53 = new Type("VKGO", 52);
            VKGO = type53;
            Type type54 = new Type("APP_REQUEST", 53);
            APP_REQUEST = type54;
            Type type55 = new Type("APP_PROMO", 54);
            APP_PROMO = type55;
            Type type56 = new Type("SDK_OPEN", 55);
            SDK_OPEN = type56;
            Type type57 = new Type("ADS", 56);
            ADS = type57;
            Type type58 = new Type("LIVE", 57);
            LIVE = type58;
            Type type59 = new Type("VIDEO_PLAYLISTS", 58);
            VIDEO_PLAYLISTS = type59;
            Type type60 = new Type("VIDEO_GROUPS_PUBLISH", 59);
            VIDEO_GROUPS_PUBLISH = type60;
            Type type61 = new Type("VIDEO_GROUPS_PUBLISH_PREF", 60);
            VIDEO_GROUPS_PUBLISH_PREF = type61;
            Type type62 = new Type("VIDEO_GROUPS_TOP_PREF", 61);
            VIDEO_GROUPS_TOP_PREF = type62;
            Type type63 = new Type("VIDEO_POSTCARD_CREATED", 62);
            VIDEO_POSTCARD_CREATED = type63;
            Type type64 = new Type("VIDEO_DEEPFAKE_PROCESSED", 63);
            VIDEO_DEEPFAKE_PROCESSED = type64;
            Type type65 = new Type("VIDEO_THUMB_DELETED", 64);
            VIDEO_THUMB_DELETED = type65;
            Type type66 = new Type("VIDEO_CHILD_ACCOUNT", 65);
            VIDEO_CHILD_ACCOUNT = type66;
            Type type67 = new Type("VIDEO_RETENTION", 66);
            VIDEO_RETENTION = type67;
            Type type68 = new Type("VIDEO_DCP_PUBLISH", 67);
            VIDEO_DCP_PUBLISH = type68;
            Type type69 = new Type("VIDEO_MOTIVATION", 68);
            VIDEO_MOTIVATION = type69;
            Type type70 = new Type("LOGIN", 69);
            LOGIN = type70;
            Type type71 = new Type("VALIDATE_DEVICE", 70);
            VALIDATE_DEVICE = type71;
            Type type72 = new Type("VALIDATE_ACTION", 71);
            VALIDATE_ACTION = type72;
            Type type73 = new Type("STORY_REPLY", 72);
            STORY_REPLY = type73;
            Type type74 = new Type("STORY_QUESTION_ASKED", 73);
            STORY_QUESTION_ASKED = type74;
            Type type75 = new Type("STORY_QUESTION_ANSWERED", 74);
            STORY_QUESTION_ANSWERED = type75;
            Type type76 = new Type("STORY_INTERACTION", 75);
            STORY_INTERACTION = type76;
            Type type77 = new Type("STORY_MUSIC_SHARED", 76);
            STORY_MUSIC_SHARED = type77;
            Type type78 = new Type("STORY_BIRTHDAY", 77);
            STORY_BIRTHDAY = type78;
            Type type79 = new Type("STORY_YEAR_MEMORIES_GENERATED", 78);
            STORY_YEAR_MEMORIES_GENERATED = type79;
            Type type80 = new Type("STORY_BIRTHDAY_INVITE", 79);
            STORY_BIRTHDAY_INVITE = type80;
            Type type81 = new Type("ADVICE", 80);
            ADVICE = type81;
            Type type82 = new Type("QUESTION", 81);
            QUESTION = type82;
            Type type83 = new Type("MASK", 82);
            MASK = type83;
            Type type84 = new Type("NEW_USER", 83);
            NEW_USER = type84;
            Type type85 = new Type("PRIVATE_GROUP_POST", 84);
            PRIVATE_GROUP_POST = type85;
            Type type86 = new Type("ASSOCIATED_EVENTS", 85);
            ASSOCIATED_EVENTS = type86;
            Type type87 = new Type("BUGTRACKER_EVENTS", 86);
            BUGTRACKER_EVENTS = type87;
            Type type88 = new Type("NEW_AUDIO_ALBUM", 87);
            NEW_AUDIO_ALBUM = type88;
            Type type89 = new Type("MARKETING", 88);
            MARKETING = type89;
            Type type90 = new Type("VK_APPS_OPEN_URL", 89);
            VK_APPS_OPEN_URL = type90;
            Type type91 = new Type("SERVICE_INSTALLATION", 90);
            SERVICE_INSTALLATION = type91;
            Type type92 = new Type("USER_RECOMMENDED_MINI_APP", 91);
            USER_RECOMMENDED_MINI_APP = type92;
            Type type93 = new Type("MULTIPLE_FRIENDS_RECOMMENDED_MINI_APP", 92);
            MULTIPLE_FRIENDS_RECOMMENDED_MINI_APP = type93;
            Type type94 = new Type("CONTENT_ACHIEVEMENTS", 93);
            CONTENT_ACHIEVEMENTS = type94;
            Type type95 = new Type("PODCASTS", 94);
            PODCASTS = type95;
            Type type96 = new Type("COMMENT_COMMENTED", 95);
            COMMENT_COMMENTED = type96;
            Type type97 = new Type("REMINDER", 96);
            REMINDER = type97;
            Type type98 = new Type("MEMORIES", 97);
            MEMORIES = type98;
            Type type99 = new Type("MARKET_NEW_ORDER_FOR_ADMIN", 98);
            MARKET_NEW_ORDER_FOR_ADMIN = type99;
            Type type100 = new Type("YOULA_NOTIFICATIONS", 99);
            YOULA_NOTIFICATIONS = type100;
            Type type101 = new Type("LOVINA_NOTIFICATIONS", 100);
            LOVINA_NOTIFICATIONS = type101;
            Type type102 = new Type("VKDATING_LIKE", 101);
            VKDATING_LIKE = type102;
            Type type103 = new Type("VKDATING_SUPERLIKE", 102);
            VKDATING_SUPERLIKE = type103;
            Type type104 = new Type("VKDATING_MATCH", 103);
            VKDATING_MATCH = type104;
            Type type105 = new Type("VKDATING_MESSAGE", 104);
            VKDATING_MESSAGE = type105;
            Type type106 = new Type("VKDATING_MESSAGE_REACTION", 105);
            VKDATING_MESSAGE_REACTION = type106;
            Type type107 = new Type("VKDATING_SERVICE", Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE);
            VKDATING_SERVICE = type107;
            Type type108 = new Type("VKDATING_NEWS_AND_UPDATES", ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED);
            VKDATING_NEWS_AND_UPDATES = type108;
            Type type109 = new Type("WLDATING_LIKE", 108);
            WLDATING_LIKE = type109;
            Type type110 = new Type("WLDATING_COMPLIMENT", 109);
            WLDATING_COMPLIMENT = type110;
            Type type111 = new Type("WLDATING_MATCH", 110);
            WLDATING_MATCH = type111;
            Type type112 = new Type("WLDATING_MESSAGE", 111);
            WLDATING_MESSAGE = type112;
            Type type113 = new Type("WLDATING_MESSAGE_REACTION", 112);
            WLDATING_MESSAGE_REACTION = type113;
            Type type114 = new Type("WLDATING_SERVICE", 113);
            WLDATING_SERVICE = type114;
            Type type115 = new Type("WLDATING_NEWS_AND_UPDATES", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            WLDATING_NEWS_AND_UPDATES = type115;
            Type type116 = new Type("DATING_SILENT", Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
            DATING_SILENT = type116;
            Type type117 = new Type("MARKET_DIGEST_NOTIFICATIONS", 116);
            MARKET_DIGEST_NOTIFICATIONS = type117;
            Type type118 = new Type("MARKET_STATUS_IMPORT_NOTIFICATIONS", Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
            MARKET_STATUS_IMPORT_NOTIFICATIONS = type118;
            Type type119 = new Type("LONG_TIME_POST", Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
            LONG_TIME_POST = type119;
            Type type120 = new Type("FOLLOWERS_MODE_FORCE_ENABLED", Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
            FOLLOWERS_MODE_FORCE_ENABLED = type120;
            Type type121 = new Type("FOLLOWERS_MIGRATION", 120);
            FOLLOWERS_MIGRATION = type121;
            Type type122 = new Type("MESSAGE_FROM_IMPORTANT_USER", Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
            MESSAGE_FROM_IMPORTANT_USER = type122;
            Type type123 = new Type("MESSAGE_FROM_UNFAMILIAR_USER", Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            MESSAGE_FROM_UNFAMILIAR_USER = type123;
            Type type124 = new Type("MESSAGE_FROM_COMMUNITY", 123);
            MESSAGE_FROM_COMMUNITY = type124;
            Type type125 = new Type("STICKERS_BONUS_EXPIRATION_1", Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            STICKERS_BONUS_EXPIRATION_1 = type125;
            Type type126 = new Type("STICKERS_BONUS_EXPIRATION_2", 125);
            STICKERS_BONUS_EXPIRATION_2 = type126;
            Type type127 = new Type("STICKERS_BONUS_DISCOUNTS_EXPIRATION_1", Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            STICKERS_BONUS_DISCOUNTS_EXPIRATION_1 = type127;
            Type type128 = new Type("STICKERS_BONUS_DISCOUNTS_EXPIRATION_2", 127);
            STICKERS_BONUS_DISCOUNTS_EXPIRATION_2 = type128;
            Type type129 = new Type("CUSTOM", 128);
            CUSTOM = type129;
            Type type130 = new Type("OPEN_URL", 129);
            OPEN_URL = type130;
            Type type131 = new Type("SHOW_MESSAGE", 130);
            SHOW_MESSAGE = type131;
            Type type132 = new Type("WAKE_UP", Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);
            WAKE_UP = type132;
            Type type133 = new Type("LIVE_START", Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
            LIVE_START = type133;
            Type type134 = new Type("LIVE_NOTIFY", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE);
            LIVE_NOTIFY = type134;
            Type type135 = new Type("LIB_VERIFY", 134);
            LIB_VERIFY = type135;
            Type type136 = new Type("POST_COMMENT", 135);
            POST_COMMENT = type136;
            Type type137 = new Type("SUGGESTED_POST", Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
            SUGGESTED_POST = type137;
            Type type138 = new Type("WALL_MENTION", Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE);
            WALL_MENTION = type138;
            Type type139 = new Type("COMMENT_MENTION", 138);
            COMMENT_MENTION = type139;
            Type type140 = new Type("PHOTO_COMMENT", 139);
            PHOTO_COMMENT = type140;
            Type type141 = new Type("BOARD_POST", VersionConstants.PRODUCT_MAJOR_VERSION);
            BOARD_POST = type141;
            Type type142 = new Type("JOIN_REQUEST", 141);
            JOIN_REQUEST = type142;
            Type type143 = new Type("STORY_MENTION", 142);
            STORY_MENTION = type143;
            Type type144 = new Type("WALL_POST_COPYRIGHT_MENTION", 143);
            WALL_POST_COPYRIGHT_MENTION = type144;
            Type type145 = new Type("VOTING_EXPIRED", 144);
            VOTING_EXPIRED = type145;
            Type type146 = new Type("FOLLOWER", 145);
            FOLLOWER = type146;
            Type type147 = new Type("ARTIST_EVENT", 146);
            ARTIST_EVENT = type147;
            Type type148 = new Type("EVENT_BLOCK_SETTINGS", 147);
            EVENT_BLOCK_SETTINGS = type148;
            Type type149 = new Type("CO_OWNERSHIP", 148);
            CO_OWNERSHIP = type149;
            Type type150 = new Type("VK_PAY_TRANSACTION", 149);
            VK_PAY_TRANSACTION = type150;
            Type type151 = new Type("AUTHOR_MENTION", 150);
            AUTHOR_MENTION = type151;
            Type type152 = new Type("DONUT", 151);
            DONUT = type152;
            Type type153 = new Type("GROUP_OFFICER", 152);
            GROUP_OFFICER = type153;
            Type type154 = new Type("FEED_PROMO", 153);
            FEED_PROMO = type154;
            Type type155 = new Type("CLIPS_PROMO", 154);
            CLIPS_PROMO = type155;
            Type type156 = new Type("ANDROID_FEED_PROMO", 155);
            ANDROID_FEED_PROMO = type156;
            Type type157 = new Type("IPHONE_FEED_PROMO", 156);
            IPHONE_FEED_PROMO = type157;
            Type type158 = new Type("WEB_FEED_PROMO", 157);
            WEB_FEED_PROMO = type158;
            Type type159 = new Type("AUDIO_PRE_SAVE_ALBUM", 158);
            AUDIO_PRE_SAVE_ALBUM = type159;
            Type type160 = new Type("VKMUSIC_ARTIST_RELEASE_FOLLOWER", 159);
            VKMUSIC_ARTIST_RELEASE_FOLLOWER = type160;
            Type type161 = new Type("VKMUSIC_ARTIST_RELEASE_SUPERFAN", 160);
            VKMUSIC_ARTIST_RELEASE_SUPERFAN = type161;
            Type type162 = new Type("VKMUSIC_PROMO", 161);
            VKMUSIC_PROMO = type162;
            Type type163 = new Type("DISCOVER_TOP_POST", 162);
            DISCOVER_TOP_POST = type163;
            Type type164 = new Type("RETENTION_FIRST_STORY", 163);
            RETENTION_FIRST_STORY = type164;
            Type type165 = new Type("RETENTION_BOOKMARKS", 164);
            RETENTION_BOOKMARKS = type165;
            Type type166 = new Type("RETENTION_BOOKMARKS_BY_TYPES", 165);
            RETENTION_BOOKMARKS_BY_TYPES = type166;
            Type type167 = new Type("RETENTION_TOP_CLIP", 166);
            RETENTION_TOP_CLIP = type167;
            Type type168 = new Type("TOP_CLIPS_AUTHORS", 167);
            TOP_CLIPS_AUTHORS = type168;
            Type type169 = new Type("CLIPS_DUET_CREATED", 168);
            CLIPS_DUET_CREATED = type169;
            Type type170 = new Type("CLIP_FROM_VIDEO_CREATED", 169);
            CLIP_FROM_VIDEO_CREATED = type170;
            Type type171 = new Type("RETENTION_GROUP_RECOMMENDATION", 170);
            RETENTION_GROUP_RECOMMENDATION = type171;
            Type type172 = new Type("RETENTION_FRIEND_SWIPE", 171);
            RETENTION_FRIEND_SWIPE = type172;
            Type type173 = new Type("RETENTION_RECOMMENDED_FRIENDS_SWIPE", 172);
            RETENTION_RECOMMENDED_FRIENDS_SWIPE = type173;
            Type type174 = new Type("VKME_INSTALL_PUSH", 173);
            VKME_INSTALL_PUSH = type174;
            Type type175 = new Type("SUPPORT_REPLY", 174);
            SUPPORT_REPLY = type175;
            Type type176 = new Type("TEXTLIVE_POST", 175);
            TEXTLIVE_POST = type176;
            Type type177 = new Type("TEXTLIVE_START", 176);
            TEXTLIVE_START = type177;
            Type type178 = new Type("EMAIL_NOT_WORKING", 177);
            EMAIL_NOT_WORKING = type178;
            Type type179 = new Type("EMAIL_SOFT_BOUNCING", 178);
            EMAIL_SOFT_BOUNCING = type179;
            Type type180 = new Type("VKCOM_EMAIL_ANNOUNCE", 179);
            VKCOM_EMAIL_ANNOUNCE = type180;
            Type type181 = new Type("VKCOM_EMAIL_APP_PROMO", 180);
            VKCOM_EMAIL_APP_PROMO = type181;
            Type type182 = new Type("NOTIFICATIONS_MAILBOX_BINDING", 181);
            NOTIFICATIONS_MAILBOX_BINDING = type182;
            Type type183 = new Type("MARKET_LEAVE_ITEM_REVIEW", 182);
            MARKET_LEAVE_ITEM_REVIEW = type183;
            Type type184 = new Type("MARKET_COMMUNITY_UPDATE_DELETE_PINNED_REVIEW", 183);
            MARKET_COMMUNITY_UPDATE_DELETE_PINNED_REVIEW = type184;
            Type type185 = new Type("MARKET_USER_REVIEW_PUBLISHED", 184);
            MARKET_USER_REVIEW_PUBLISHED = type185;
            Type type186 = new Type("MARKET_COMMUNITY_GOT_REVIEW", 185);
            MARKET_COMMUNITY_GOT_REVIEW = type186;
            Type type187 = new Type("ANONYMOUS_TOKEN_SIGNING", 186);
            ANONYMOUS_TOKEN_SIGNING = type187;
            Type type188 = new Type("BADGE", 187);
            BADGE = type188;
            Type type189 = new Type("UXPOLL", 188);
            UXPOLL = type189;
            Type type190 = new Type("UXPOLL_VIDEO", PsExtractor.PRIVATE_STREAM_1);
            UXPOLL_VIDEO = type190;
            Type type191 = new Type("EXTERNAL", 190);
            EXTERNAL = type191;
            Type type192 = new Type("CLIPS_SCHOOL_PROMO", 191);
            CLIPS_SCHOOL_PROMO = type192;
            Type type193 = new Type("BLOCKCHAIN_NFT_RETENTION", PsExtractor.AUDIO_STREAM);
            BLOCKCHAIN_NFT_RETENTION = type193;
            Type type194 = new Type("BLOCKCHAIN_NFT_MARKET", 193);
            BLOCKCHAIN_NFT_MARKET = type194;
            Type type195 = new Type("INSTAGRAM_IMPORT_ACCOUNT_APPROVED", 194);
            INSTAGRAM_IMPORT_ACCOUNT_APPROVED = type195;
            Type type196 = new Type("INSTAGRAM_IMPORT_ACCOUNT_DENIED", 195);
            INSTAGRAM_IMPORT_ACCOUNT_DENIED = type196;
            Type type197 = new Type("INSTAGRAM_IMPORT_CONTENT_PARSED", 196);
            INSTAGRAM_IMPORT_CONTENT_PARSED = type197;
            Type type198 = new Type("INSTAGRAM_IMPORT_CONTENT_PUBLISHED", 197);
            INSTAGRAM_IMPORT_CONTENT_PUBLISHED = type198;
            Type type199 = new Type("INSTAGRAM_IMPORT_AUDIENCE_IMPORTED", 198);
            INSTAGRAM_IMPORT_AUDIENCE_IMPORTED = type199;
            Type type200 = new Type("INSTAGRAM_IMPORT_PROCESS_FAILED", 199);
            INSTAGRAM_IMPORT_PROCESS_FAILED = type200;
            Type type201 = new Type("VK_VIDEO_PROMO", 200);
            VK_VIDEO_PROMO = type201;
            Type type202 = new Type("VK_HEALTH_NOTIFICATIONS", 201);
            VK_HEALTH_NOTIFICATIONS = type202;
            Type type203 = new Type("CONVERTING_VIDEOS_TO_SHORT_VIDEOS_NOTIFICATIONS", 202);
            CONVERTING_VIDEOS_TO_SHORT_VIDEOS_NOTIFICATIONS = type203;
            Type type204 = new Type("POST_CO_OWNER_STATUS", 203);
            POST_CO_OWNER_STATUS = type204;
            Type type205 = new Type("CLIP_CO_OWNER_STATUS", 204);
            CLIP_CO_OWNER_STATUS = type205;
            Type type206 = new Type("CHANNEL_MSG", 205);
            CHANNEL_MSG = type206;
            Type type207 = new Type("CHANNELS", 206);
            CHANNELS = type207;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17, type18, type19, type20, type21, type22, type23, type24, type25, type26, type27, type28, type29, type30, type31, type32, type33, type34, type35, type36, type37, type38, type39, type40, type41, type42, type43, type44, type45, type46, type47, type48, type49, type50, type51, type52, type53, type54, type55, type56, type57, type58, type59, type60, type61, type62, type63, type64, type65, type66, type67, type68, type69, type70, type71, type72, type73, type74, type75, type76, type77, type78, type79, type80, type81, type82, type83, type84, type85, type86, type87, type88, type89, type90, type91, type92, type93, type94, type95, type96, type97, type98, type99, type100, type101, type102, type103, type104, type105, type106, type107, type108, type109, type110, type111, type112, type113, type114, type115, type116, type117, type118, type119, type120, type121, type122, type123, type124, type125, type126, type127, type128, type129, type130, type131, type132, type133, type134, type135, type136, type137, type138, type139, type140, type141, type142, type143, type144, type145, type146, type147, type148, type149, type150, type151, type152, type153, type154, type155, type156, type157, type158, type159, type160, type161, type162, type163, type164, type165, type166, type167, type168, type169, type170, type171, type172, type173, type174, type175, type176, type177, type178, type179, type180, type181, type182, type183, type184, type185, type186, type187, type188, type189, type190, type191, type192, type193, type194, type195, type196, type197, type198, type199, type200, type201, type202, type203, type204, type205, type206, type207};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem(int i, DeviceActivityGroup deviceActivityGroup, String str, long j, Provider provider, MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo, long j2, long j3, long j4, Type type, Long l, Boolean bool, String str2) {
        this.appId = i;
        this.deviceActivityGroup = deviceActivityGroup;
        this.a = str;
        this.logId = j;
        this.provider = provider;
        this.networkInfo = mobileOfficialAppsCoreDeviceStat$NetworkInfo;
        this.toId = j2;
        this.tsDispatched = j3;
        this.tsReceived = j4;
        this.type = type;
        this.contentOwnerId = l;
        this.isFeedback = bool;
        this.b = str2;
        FilteredString filteredString = new FilteredString(lhg.b(32));
        this.filteredHash = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(128));
        this.filteredSubType = filteredString2;
        filteredString.a(str);
        filteredString2.a(str2);
    }

    public final int a() {
        return this.appId;
    }

    public final Long b() {
        return this.contentOwnerId;
    }

    public final DeviceActivityGroup c() {
        return this.deviceActivityGroup;
    }

    public final long d() {
        return this.logId;
    }

    public final MobileOfficialAppsCoreDeviceStat$NetworkInfo e() {
        return this.networkInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem)) {
            return false;
        }
        MobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem = (MobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem) obj;
        return this.appId == mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem.appId && this.deviceActivityGroup == mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem.deviceActivityGroup && epx.f(this.a, mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem.a) && this.logId == mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem.logId && this.provider == mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem.provider && epx.f(this.networkInfo, mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem.networkInfo) && this.toId == mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem.toId && this.tsDispatched == mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem.tsDispatched && this.tsReceived == mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem.tsReceived && this.type == mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem.type && epx.f(this.contentOwnerId, mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem.contentOwnerId) && epx.f(this.isFeedback, mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem.isFeedback) && epx.f(this.b, mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem.b);
    }

    public final Provider f() {
        return this.provider;
    }

    public final long g() {
        return this.toId;
    }

    public final long h() {
        return this.tsDispatched;
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + bh10.a(bh10.a(bh10.a((this.networkInfo.hashCode() + ((this.provider.hashCode() + bh10.a(urd0.a((this.deviceActivityGroup.hashCode() + (Integer.hashCode(this.appId) * 31)) * 31, 31, this.a), 31, this.logId)) * 31)) * 31, 31, this.toId), 31, this.tsDispatched), 31, this.tsReceived)) * 31;
        Long l = this.contentOwnerId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.isFeedback;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.b;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final long i() {
        return this.tsReceived;
    }

    public final Type j() {
        return this.type;
    }

    public final Boolean k() {
        return this.isFeedback;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypePushNotificationDeliveryRateItem(appId=");
        sb.append(this.appId);
        sb.append(", deviceActivityGroup=");
        sb.append(this.deviceActivityGroup);
        sb.append(", hash=");
        sb.append(this.a);
        sb.append(", logId=");
        sb.append(this.logId);
        sb.append(", provider=");
        sb.append(this.provider);
        sb.append(", networkInfo=");
        sb.append(this.networkInfo);
        sb.append(", toId=");
        sb.append(this.toId);
        sb.append(", tsDispatched=");
        sb.append(this.tsDispatched);
        sb.append(", tsReceived=");
        sb.append(this.tsReceived);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", contentOwnerId=");
        sb.append(this.contentOwnerId);
        sb.append(", isFeedback=");
        sb.append(this.isFeedback);
        sb.append(", subType=");
        return ho8.a(sb, this.b, ')');
    }

    public /* synthetic */ MobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem(int i, DeviceActivityGroup deviceActivityGroup, String str, long j, Provider provider, MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo, long j2, long j3, long j4, Type type, Long l, Boolean bool, String str2, int i2, zcl zclVar) {
        this(i, deviceActivityGroup, str, j, provider, mobileOfficialAppsCoreDeviceStat$NetworkInfo, j2, j3, j4, type, (i2 & 1024) != 0 ? null : l, (i2 & 2048) != 0 ? null : bool, (i2 & 4096) != 0 ? null : str2);
    }
}
