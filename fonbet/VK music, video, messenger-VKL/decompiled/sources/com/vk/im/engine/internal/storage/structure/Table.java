package com.vk.im.engine.internal.storage.structure;

import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.drm0;
import xsna.e43;
import xsna.j5g;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Table.kt */
/* loaded from: classes2.dex */
public final class Table {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Table[] $VALUES;
    public static final Table BOT_BUTTON_IN_LOADING;
    public static final Table CHANNELS;
    public static final Table CHANNELS_HISTORY_COUNT;
    public static final Table CHANNELS_HISTORY_META;
    public static final Table CHANNELS_RECOMMENDATIONS;
    public static final Table CHANNEL_MESSAGES;
    public static final Table CHANNEL_MESSAGES_HISTORY_META;
    public static final Table CHANNEL_MESSAGE_ATTACHES;
    public static final Table CHANNEL_POSTPONED_MESSAGES;
    public static final Table CHANNEL_POSTPONED_MESSAGES_HISTORY_META;
    private static final int COMMON_STATEMENT_LENGTH = 400;
    public static final Table CONTACTS;
    public static final a Companion;
    public static final Table DIALOGS;
    public static final Table DIALOGS_HISTORY_COUNT;
    public static final Table DIALOGS_HISTORY_META;
    public static final Table DIALOG_APPEARANCE;
    public static final Table DIALOG_BACKGROUND;
    public static final Table DIALOG_FOLDER;
    public static final Table DIALOG_MEMBERS;
    public static final Table DIALOG_MEMBERS_META;
    public static final Table DIALOG_PINNED_MSG_ATTACHES;
    public static final Table DIALOG_TAGS;
    public static final Table DIALOG_THEMES;
    public static final Table DIALOG_TO_FOLDER;
    public static final Table DIALOG_TO_SUBLIST;
    public static final Table DIALOG_WEIGHT;
    public static final Table EDU_CONTACT_SECTION;
    public static final Table EDU_ORGANIZATION;
    public static final Table EDU_SCHEDULE;
    public static final Table EDU_USER_ROLES;
    public static final Table EMAILS;
    public static final Table FOLDERS_COUNTERS;
    public static final Table FOLDER_TO_SUBLIST;
    public static final Table GROUPS;
    public static final Table GROUPS_CAN_SEND_PENDING;
    public static final Table IM_ITEM_HISTORY_META;
    public static final Table IM_ITEM_WEIGHT;
    public static final Table INTEGER_GENERATOR;
    public static final Table KEY_VALUE;
    public static final Table MANAGED_GROUPS;
    public static final Table MESSAGES;
    public static final Table MESSAGES_HISTORY_META;
    public static final Table MESSAGES_SEARCH;
    public static final Table MESSAGE_ATTACHES;
    public static final Table MESSAGE_TEMPLATES;
    public static final Table MUTUAL_FRIENDS;
    public static final Table PEERS_SEARCH;
    public static final Table RESUMABLE_UPLOAD;
    public static final Table STORIES_INFO;
    public static final Table SUBLIST_INFO;
    public static final Table UPLOAD_CACHE;
    public static final Table USERS;
    public static final Table VIDEO_MESSAGE_STENCIL;
    private final List<String> columns;
    private final List<String> indices;
    private final boolean isVirtual;
    private final String tableName;
    private final String using;

    /* compiled from: Table.kt */
    public static final class a {
    }

    static {
        Table table = new Table("USERS", 0, "users", e43.l("id INTEGER NOT NULL PRIMARY KEY", "contact_id INT", "domain TEXT NOT NULL", "sex INT NOT NULL", "avatar BLOB", "blocked INT NOT NULL", "blocked_by_me INT NOT NULL", "deactivated INT NOT NULL", "verified INT NOT NULL", "online_type INT NOT NULL", "online_last_seen INT NOT NULL", "online_app_id INT NOT NULL", "first_name_nom TEXT NOT NULL", "last_name_nom TEXT NOT NULL", "first_name_acc TEXT NOT NULL", "last_name_acc TEXT NOT NULL", "first_name_gen TEXT NOT NULL", "last_name_gen TEXT NOT NULL", "first_name_dat TEXT NOT NULL", "last_name_dat TEXT NOT NULL", "can_call INT NOT NULL", "is_service INT NOT NULL", "is_service_account INT NOT NULL", "friend_status INT NOT NULL", "mobile_phone TEXT NOT NULL", "is_closed INT NOT NULL", "can_access_closed INT NOT NULL", "can_be_invited_to_chats INT NOT NULL", "sync_time_overall INT NOT NULL", "sync_time_online INT NOT NULL", "image_status BLOB", "country TEXT NOT NULL", "city TEXT NOT NULL", "occupation_type INT NOT NULL", "occupation_name TEXT NOT NULL", "birthday_day INT", "birthday_month INT", "birthday_year INT", "can_send_friend_request INT NOT NULL", "avatar_is_nft INT NOT NULL", "is_oauth_verified INT NOT NULL", "social_button_type TEXT NOT NULL", "can_write_private_message INT NOT NULL", "is_adult INT"), e43.l("CREATE INDEX idx_users_friend_status ON users(friend_status);", "CREATE INDEX idx_users_contact_id ON users(contact_id);", "CREATE INDEX idx_users_mobile_phone ON users(mobile_phone);", "CREATE INDEX idx_users_deactivated ON users(deactivated);", "CREATE INDEX idx_users_time_online ON users(sync_time_online);", "CREATE INDEX idx_users_online_type ON users(online_type);"), 12);
        USERS = table;
        Table table2 = new Table("MUTUAL_FRIENDS", 1, "mutual_friends", e43.l("target_id INT NOT NULL PRIMARY KEY", "mutual_friends_ids BLOB NOT NULL", "sync_time INT NOT NULL"), null, 28);
        MUTUAL_FRIENDS = table2;
        Table table3 = new Table("CONTACTS", 2, "contacts", e43.l("phone TEXT NOT NULL PRIMARY KEY", "id INT NOT NULL", "local_phone TEXT NOT NULL", "local_name TEXT NOT NULL", "name TEXT NOT NULL", "user_id INT", "device_local_id TEXT", "is_new INT NOT NULL", "sync_time INT NOT NULL", "import_time INT NOT NULL", "last_seen_status INT NOT NULL", "avatar BLOB", "can_write INT NOT NULL", "can_call INT NOT NULL", "calls_id TEXT"), e43.l("CREATE INDEX idx_contacts_id ON contacts(id);", "CREATE INDEX idx_contacts_user_id ON contacts(user_id);"), 12);
        CONTACTS = table3;
        Table table4 = new Table("EMAILS", 3, "emails", e43.l("id INTEGER NOT NULL PRIMARY KEY", "email TEXT NOT NULL"), null, 28);
        EMAILS = table4;
        Table table5 = new Table("GROUPS", 4, "groups", e43.l("id INTEGER NOT NULL PRIMARY KEY", "title TEXT NOT NULL", "domain TEXT NOT NULL", "avatar BLOB", "type INT NOT NULL", "is_verified INT NOT NULL", "can_send_msg_to_me INT NOT NULL", "can_send_notify_to_me INT NOT NULL", "sync_time INT NOT NULL", "online_status INT NOT NULL", "answer_minutes INT NOT NULL", "members_count INT NOT NULL", "activity TEXT NOT NULL", "avatar_is_nft INT NOT NULL", "member_status INT NOT NULL", "admin_level INT NOT NULL", "description TEXT NOT NULL", "can_message INT NOT NULL", "is_closed INT NOT NULL", "url TEXT NOT NULL", "deactivated TEXT NOT NULL DEFAULT \"\"", "deactivated_message TEXT NOT NULL DEFAULT \"\"", "deactivated_type TEXT NOT NULL DEFAULT \"\"", "is_premium_business INT NOT NULL DEFAULT 0", "is_confirmed_business INT NOT NULL DEFAULT 0", "can_post_donut INT NOT NULL DEFAULT 0", "age_limits INT NOT NULL DEFAULT 1", "warning_notification INT NOT NULL DEFAULT 0", "is_non_profit_organization INT NOT NULL DEFAULT 0", "need_show_onboarding INT NOT NULL DEFAULT 0", "is_monetization_available INT NOT NULL DEFAULT 0"), null, 28);
        GROUPS = table5;
        Table table6 = new Table("GROUPS_CAN_SEND_PENDING", 5, "groups_can_send_pending", e43.l("group_id INTEGER NOT NULL PRIMARY KEY", "can_send_msg_to_me INT NOT NULL", "can_send_notify_to_me INT NOT NULL"), null, 28);
        GROUPS_CAN_SEND_PENDING = table6;
        Table table7 = new Table("MANAGED_GROUPS", 6, "managed_groups", e43.l("id INTEGER NOT NULL PRIMARY KEY", "title TEXT NOT NULL", "type INT NOT NULL", "access INT NOT NULL", "avatar BLOB", "avatar_is_nft INT NOT NULL", "is_muted INT NOT NULL", "unread_count INT NOT NULL", "activity TEXT NOT NULL"), null, 28);
        MANAGED_GROUPS = table7;
        Table table8 = new Table("DIALOGS", 7, "dialogs", e43.l("id INTEGER NOT NULL PRIMARY KEY", "type INT NOT NULL", "sort_id_server INT NOT NULL", "sort_id_local INT NULL", "weight INT NOT NULL", "read_till_in_msg_cnv_id INT NOT NULL", "read_till_out_msg_cnv_id INT NOT NULL", "last_msg_cnv_id INT NOT NULL", "count_unread INT NOT NULL", "read_till_in_msg_cnv_id_local INT NOT NULL", "count_unread_local INT NOT NULL", "marked_as_unread_server INT NOT NULL", "marked_as_unread_local INT", "push_server_is_use_sound INT NOT NULL", "push_server_disabled_until INT NOT NULL", "push_local_is_use_sound INT", "push_local_disabled_until INT", "write_permission INT NULL", "write_restricted_till INT NOT NULL", "can_send_money INT NOT NULL", "can_receive_money INT NOT NULL", "pinned_msg_visible INT NOT NULL", "pinned_msg_exists INT NOT NULL", "pinned_msg_cnv_msg_id INT", "pinned_msg_is_unavailable INT", "pinned_msg_from_type INT", "pinned_msg_from_id INT", "pinned_msg_time INT", "pinned_msg_title TEXT", "pinned_msg_body TEXT", "pinned_msg_body_format TEXT", "pinned_msg_attaches BLOB", "pinned_msg_nested BLOB", "pinned_carousel BLOB", "conversation_bar_buttons BLOB", "conversation_bar_type TEXT", "conversation_bar_title TEXT", "conversation_bar_subtitle TEXT", "conversation_bar_content TEXT", "conversation_bar_imageurl TEXT", "conversation_bar_id TEXT", "bar_exists INT NOT NULL", "bar_name TEXT", "bar_title TEXT", "bar_text TEXT", "bar_icon TEXT", "bar_lego_icon TEXT", "bar_icon_size INT", "bar_icon_centered INT", "bar_buttons BLOB", "bar_can_hide INT", "bar_hidden_locally INT NOT NULL", "bar_background BLOB", "bar_payload BLOB", "chat_settings_exists INT NOT NULL", "chat_settings_title TEXT", "chat_settings_avatar BLOB", "chat_settings_owner_type INT", "chat_settings_owner_id INT", "chat_settings_admins BLOB", "chat_settings_members_count INT", "chat_settings_is_channel INT", "chat_settings_is_casper INT", "chat_settings_is_writing_disabled INT", "chat_settings_writing_disabled_until INT", "chat_settings_is_kicked INT", "chat_settings_is_left INT", "chat_settings_is_service INT", "chat_settings_is_donut INT", "chat_settings_is_incognito INT", "chat_settings_is_disable_popup_stickers_autoplay INT", "chat_settings_can_change_stickers_popup_autoplay INT DEFAULT 0", "chat_settings_can_invite INT", "chat_settings_can_change_info INT", "chat_settings_can_change_owner INT", "chat_settings_can_change_theme INT", "chat_settings_can_change_pinned_msg INT", "chat_settings_can_promote_users INT", "chat_settings_can_moderate INT", "chat_settings_can_copy INT", "chat_settings_can_call INT", "chat_settings_can_change_service_type INT", "chat_settings_can_see_invite_link INT", "chat_settings_can_use_mass_mentions INT", "chat_settings_can_disable_service_messages INT", "chat_settings_casper_chat_link TEXT", "chat_settings_donut_owner_id INT", "chat_settings_can_send_reactions INT", "chat_settings_short_poll_reactions INT", "chat_settings_is_service_messages_disabled INT", "chat_settings_can_forward_messages INT NOT NULL DEFAULT 1", "chat_settings_can_disable_forward_messages INT NOT NULL DEFAULT 0", "chat_permissions_exists INT", "chat_permissions_who_can_invite TEXT", "chat_permissions_who_can_change_info TEXT", "chat_permissions_who_can_change_theme TEXT", "chat_permissions_who_can_change_pin TEXT", "chat_permissions_who_can_use_mass_mentions TEXT", "chat_permissions_who_can_change_admins TEXT", "chat_permissions_who_can_see_invite_link TEXT", "chat_permissions_who_can_call TEXT", "group_call_join_link TEXT", "group_call_vk_join_link TEXT", "group_call_can_finish_call INT NOT NULL", "group_call_participants BLOB", "group_call_banner_hidden_locally INT NOT NULL", "theme_id TEXT NOT NULL", "keyboard_exists INT NOT NULL", "keyboard_author_type INT", "keyboard_author_id INT", "keyboard_one_time INT", "keyboard_column_count INT", "keyboard_buttons BLOB", "keyboard_visible INT", "draft_msg BLOB", "msg_request_status INT NOT NULL", "msg_request_inviter_type INT NOT NULL", "msg_request_inviter_id INT NOT NULL", "msg_request_date INT NOT NULL", "msg_request_status_pending INT", "msg_request_status_desired INT NOT NULL", "unread_mention_msg_cnv_ids BLOB", "expire_msg_cnv_ids BLOB", "business_notify_info_dialog_id INT", "business_notify_info_last_msg_cnv_id INT", "business_notify_info_count_unread INT", "business_notify_info_visible INT NOT NULL", "phase_id INT NOT NULL", "spam_expiration INT NOT NULL", "is_new INT NOT NULL", "payload TEXT DEFAULT \"\"", "is_archived INT NOT NULL", "is_promo INT NOT NULL", "unread_reactions TEXT", "locally_read_reactions TEXT", "tags BLOB", "flags INTEGER NOT NULL", "version INTEGER NOT NULL", "is_dead INT NOT NULL", "can_promo_gifts INT NOT NULL", "transition_data TEXT", "timestamp INT"), e43.l("CREATE INDEX idx_dialogs_sort_id ON dialogs(sort_id_server);", "CREATE INDEX idx_dialogs_weight ON dialogs(weight);", "CREATE INDEX idx_dialogs_msg_request_status_pending ON dialogs(msg_request_status_pending);", "CREATE INDEX idx_dialogs_filter_requests ON dialogs(msg_request_status_desired, type,id) WHERE msg_request_status_desired = 1 AND type = 0;", "CREATE INDEX idx_dialogs_non_zero_flags ON dialogs(flags) WHERE flags != 0;", "CREATE INDEX idx_dialogs_dead ON dialogs(id) WHERE is_dead = 1;"), 12);
        DIALOGS = table8;
        Table table9 = new Table("DIALOG_WEIGHT", 8, "dialog_weight", e43.l("x_dialog_id INT NOT NULL", "x_folder_id INT NOT NULL", "x_sort_id_server INT NOT NULL", "x_sort_id_local INT NULL", "x_weight INT NOT NULL", "PRIMARY KEY(x_dialog_id, x_folder_id)"), e43.l("CREATE INDEX idx_foldered_dialogs_sort_id ON dialog_weight(x_sort_id_server);", "CREATE INDEX idx_foldered_dialogs_weight ON dialog_weight(x_weight);"), 12);
        DIALOG_WEIGHT = table9;
        Table table10 = new Table("DIALOG_PINNED_MSG_ATTACHES", 9, "dialog_pinned_msg_attaches", e43.l("dialog_id INT NOT NULL", "attach_local_id INT NOT NULL", "content_type INT NOT NULL", "content_id INT NOT NULL", "content_owner_id INT NOT NULL"), e43.l("CREATE INDEX idx_dialog_pinned_msg_attaches_dialog_id ON dialog_pinned_msg_attaches(dialog_id);", "CREATE INDEX idx_dialog_pinned_msg_attaches_find_by_content ON dialog_pinned_msg_attaches(content_type,content_id,content_owner_id);"), 12);
        DIALOG_PINNED_MSG_ATTACHES = table10;
        Table table11 = new Table("DIALOGS_HISTORY_META", 10, "dialogs_history_meta", e43.l("folder_id INTEGER NOT NULL", "filter_id INTEGER NOT NULL", "oldest_sort_id INT NOT NULL", "fully_fetched INT NOT NULL", "phase_id INT NOT NULL", "PRIMARY KEY (folder_id, filter_id)"), null, 28);
        DIALOGS_HISTORY_META = table11;
        Table table12 = new Table("DIALOGS_HISTORY_COUNT", 11, "dialogs_history_count", e43.l("filter_id INTEGER NOT NULL PRIMARY KEY", "count INT NOT NULL", "phase_id INT NOT NULL"), null, 28);
        DIALOGS_HISTORY_COUNT = table12;
        Table table13 = new Table("DIALOG_MEMBERS", 12, "dialog_members", e43.l("dialog_id INT NOT NULL", "member_type INT NOT NULL", "member_id INT NOT NULL", "invited_by_type INT NOT NULL", "invited_by_id INT NOT NULL", "join_date INT NOT NULL", "is_admin INT NOT NULL", "is_request INT NOT NULL", "incognito_id INT", "incognito_name TEXT", "can_kick INT NOT NULL", "is_restricted_to_write INT NOT NULL", "PRIMARY KEY (dialog_id, member_type, member_id, incognito_id)"), Collections.singletonList("CREATE UNIQUE INDEX idx_dialog_member_id ON dialog_members(dialog_id, member_type, member_id, IFNULL(incognito_id, 0));"), 12);
        DIALOG_MEMBERS = table13;
        Table table14 = new Table("DIALOG_MEMBERS_META", 13, "dialog_members_meta", e43.l("dialog_id INTEGER NOT NULL PRIMARY KEY", "phase_id INT NOT NULL", "last_update_pts INT NULL", "pagination_anchor TEXT", "is_diff_dirty INT NULL"), null, 28);
        DIALOG_MEMBERS_META = table14;
        Table table15 = new Table("PEERS_SEARCH", 14, "peers_search", e43.l("member_type", "member_id", "is_from_search", "title", X3.j.D, "hint_position"), null, 16);
        PEERS_SEARCH = table15;
        Table table16 = new Table("MESSAGES", 15, "messages", e43.l("local_id INTEGER NOT NULL PRIMARY KEY", "dialog_id INT NOT NULL", "cnv_msg_id INT NOT NULL", "random_id INT NOT NULL", "time INT NOT NULL", "weight INT NOT NULL", "from_member_type INT NOT NULL", "from_member_id INT NOT NULL", "is_incoming INT NOT NULL", "is_important INT", "is_hidden INT", "is_edited INT", "sync_state INT NOT NULL", "has_space_before INT NOT NULL", "has_space_after INT NOT NULL", "weight_before INT NOT NULL", "weight_after INT NOT NULL", "expire_ttl INT", "delete_ttl INT", "pinned_at INT", "pinned_msg_body TEXT", "pinned_msg_conv_id INT", "is_expired INT NOT NULL", "is_silent INT NOT NULL", "phase_id INT NOT NULL", "type INT NOT NULL", "title TEXT", "avatar BLOB", "member_type INT", "member_id INT", "body TEXT", "body_format TEXT", "payload TEXT", "attach BLOB", "nested BLOB", "was_played_server INT", "was_played_local INT", "ref TEXT", "ref_source TEXT", "keyboard_exists INT NOT NULL", "keyboard_author_type INT", "keyboard_author_id INT", "keyboard_one_time INT", "keyboard_column_count INT", "keyboard_buttons BLOB", "carousel BLOB", "chat_style TEXT", "my_reaction_id INT", "reactions TEXT", "force_autoplay_media INT", "version INT NOT NULL", "source INT NOT NULL", "linked_local_id INT", "linked_cmid INT", "nested_msgs_has_more INT NOT NULL", "nested_msgs_count INT NOT NULL"), e43.l("CREATE INDEX idx_messages_cnv_msg_id ON messages(local_id) WHERE cnv_msg_id = 0;", "CREATE INDEX idx_messages_random_id ON messages(random_id);", "CREATE INDEX idx_messages_sync_state ON messages(sync_state,dialog_id) WHERE sync_state > 0;", "CREATE INDEX idx_messages_dialog_cnv_id ON messages(dialog_id, cnv_msg_id);", "CREATE INDEX idx_messages_dialog_latest ON messages(dialog_id, weight DESC, is_hidden);", "CREATE INDEX idx_messages_time ON messages(time);", "CREATE INDEX idx_messages_expirable ON messages(expire_ttl, is_expired) WHERE expire_ttl > 0;"), 12);
        MESSAGES = table16;
        Table table17 = new Table("MESSAGES_SEARCH", 16, "messages_search", Collections.singletonList("body"), null, 16);
        MESSAGES_SEARCH = table17;
        Table table18 = new Table("MESSAGE_ATTACHES", 17, "message_attaches", e43.l("msg_local_id INT NOT NULL", "attach_local_id INT NOT NULL", "content_type INT NOT NULL", "content_id INT NOT NULL", "content_owner_id INT NOT NULL", "dialog_id INT", "mv_cnv_msg_id INT", "position INT", "msg_date INT", "msg_expire_ttl INT"), e43.l("CREATE INDEX idx_message_attaches_msg_local_id ON message_attaches(msg_local_id);", "CREATE INDEX idx_message_attaches_attach_local_id ON message_attaches(attach_local_id);", "CREATE INDEX idx_message_attaches_attach_content_type ON message_attaches(content_type);", "CREATE INDEX idx_message_attaches_find_by_content ON message_attaches(content_type,content_id,content_owner_id);"), 12);
        MESSAGE_ATTACHES = table18;
        Table table19 = new Table("MESSAGES_HISTORY_META", 18, "messages_history_meta", e43.l("dialog_id INTEGER NOT NULL PRIMARY KEY", "server_is_empty_value INT", "server_is_empty_phase INT"), null, 28);
        MESSAGES_HISTORY_META = table19;
        Table table20 = new Table("VIDEO_MESSAGE_STENCIL", 19, "video_message_stencil", e43.l("id INTEGER NOT NULL PRIMARY KEY", "raw_path TEXT NOT NULL", "start_date_ms INT NOT NULL", "end_date_ms INT NOT NULL"), null, 28);
        VIDEO_MESSAGE_STENCIL = table20;
        Table table21 = new Table("CHANNEL_MESSAGES", 20, "channel_messages", e43.l("local_id INTEGER NOT NULL PRIMARY KEY", "channel_id INT NOT NULL", "cnv_msg_id INT NOT NULL", "time INT NOT NULL", "weight INT NOT NULL", "from_member_type INT NOT NULL", "from_member_id INT NOT NULL", "has_space_before INT NOT NULL", "has_space_after INT NOT NULL", "weight_before INT NOT NULL", "weight_after INT NOT NULL", "type INT NOT NULL", "attach BLOB", "phase_id INT NOT NULL", "local_reaction INT", "source INT NOT NULL", "update_time INT", "post_text TEXT", "access_key TEXT", "owner_id INT NOT NULL", "post_id INT NOT NULL", "from_id INT NOT NULL", "post_type TEXT NOT NULL", "donut BLOB", "author_ad_info_url TEXT", "author_ad_marker TEXT", "track_code TEXT", "deleted_reason TEXT", "deleted_details TEXT", "comments_count INT", "comments_can_view INT", "comments_can_post INT", "comments_can_close INT", "comments_can_open INT", "signer_id INT", "is_advertisement INT", "item_reactions BLOB", "reposts_count INT", "views_count INT", "publish_date INT", "text_live_title TEXT", "text_live_url TEXT", "source_type INT", "source_id INT", "is_viewed INT", "is_verified INT", "parent_id INT NOT NULL DEFAULT 0", "is_fake_news INT", "external_view_tracking BLOB", "is_mute_notification INT", "is_msg_pinned INT", "body_format TEXT", "guid TEXT", "sync_state INT NOT NULL DEFAULT 0", "sync_config TEXT", "is_donut_photos INT NOT NULL DEFAULT 0", "paid_reaction BLOB"), e43.l("CREATE INDEX idx_channel_messages_channel_id_weight ON channel_messages(channel_id, weight DESC);", "CREATE INDEX idx_channel_messages_channel_id_cnv_id ON channel_messages(channel_id,cnv_msg_id);", "CREATE INDEX idx_channel_messages_owner_post_id ON channel_messages(owner_id,post_id);"), 12);
        CHANNEL_MESSAGES = table21;
        Table table22 = new Table("CHANNEL_POSTPONED_MESSAGES", 21, "channel_postponed_messages", e43.l("local_id INTEGER NOT NULL PRIMARY KEY", "channel_id INT NOT NULL", "cnv_msg_id INT NOT NULL", "time INT NOT NULL", "weight INT NOT NULL", "from_member_type INT NOT NULL", "from_member_id INT NOT NULL", "has_space_before INT NOT NULL", "has_space_after INT NOT NULL", "weight_before INT NOT NULL", "weight_after INT NOT NULL", "type INT NOT NULL", "attach BLOB", "phase_id INT NOT NULL", "local_reaction INT", "source INT NOT NULL", "update_time INT", "post_text TEXT", "access_key TEXT", "owner_id INT NOT NULL", "post_id INT NOT NULL", "from_id INT NOT NULL", "post_type TEXT NOT NULL", "donut BLOB", "author_ad_info_url TEXT", "author_ad_marker TEXT", "track_code TEXT", "deleted_reason TEXT", "deleted_details TEXT", "comments_count INT", "comments_can_view INT", "comments_can_post INT", "comments_can_close INT", "comments_can_open INT", "signer_id INT", "is_advertisement INT", "item_reactions BLOB", "reposts_count INT", "views_count INT", "publish_date INT", "text_live_title TEXT", "text_live_url TEXT", "source_type INT", "source_id INT", "is_viewed INT", "is_verified INT", "parent_id INT NOT NULL DEFAULT 0", "is_fake_news INT", "external_view_tracking BLOB", "is_mute_notification INT", "is_msg_pinned INT", "body_format TEXT", "guid TEXT", "sync_state INT NOT NULL DEFAULT 0", "sync_config TEXT", "is_donut_photos INT NOT NULL DEFAULT 0", "paid_reaction BLOB"), e43.l("CREATE INDEX idx_channel_postponed_messages_channel_id_cnv_msg_id ON channel_postponed_messages(channel_id, cnv_msg_id);", "CREATE INDEX idx_channel_postponed_messages_channel_id_weight ON channel_postponed_messages(channel_id, weight DESC);"), 12);
        CHANNEL_POSTPONED_MESSAGES = table22;
        Table table23 = new Table("CHANNEL_MESSAGE_ATTACHES", 22, "channel_message_attaches", e43.l("msg_local_id INT NOT NULL", "attach_local_id INT NOT NULL", "content_type INT NOT NULL", "content_id INT NOT NULL", "content_owner_id INT NOT NULL", "channel_id INT", "mv_cnv_msg_id INT"), e43.l("CREATE INDEX idx_channel_message_attaches_msg_local_id ON channel_message_attaches(msg_local_id);", "CREATE INDEX idx_channel_message_attaches_attach_local_id ON channel_message_attaches(attach_local_id);", "CREATE INDEX idx_channel_message_attaches_find_by_content ON channel_message_attaches(content_type,content_id,content_owner_id);"), 12);
        CHANNEL_MESSAGE_ATTACHES = table23;
        Table table24 = new Table("CHANNEL_MESSAGES_HISTORY_META", 23, "channel_messages_history_meta", e43.l("channel_id INTEGER NOT NULL PRIMARY KEY", "server_is_empty_value INT", "server_is_empty_phase INT"), null, 28);
        CHANNEL_MESSAGES_HISTORY_META = table24;
        Table table25 = new Table("CHANNEL_POSTPONED_MESSAGES_HISTORY_META", 24, "channel_postponed_messages_history_meta", e43.l("channel_id INTEGER NOT NULL PRIMARY KEY", "server_is_empty_value INT", "server_is_empty_phase INT"), null, 28);
        CHANNEL_POSTPONED_MESSAGES_HISTORY_META = table25;
        Table table26 = new Table("KEY_VALUE", 25, "key_value", e43.l("key TEXT NOT NULL PRIMARY KEY", "value_simple TEXT", "value_blob BLOB"), null, 28);
        KEY_VALUE = table26;
        Table table27 = new Table("INTEGER_GENERATOR", 26, "integer_generator", Collections.singletonList("id INTEGER PRIMARY KEY AUTOINCREMENT"), null, 28);
        INTEGER_GENERATOR = table27;
        Table table28 = new Table("RESUMABLE_UPLOAD", 27, "resumable_upload", e43.l("attach_local_id INT NOT NULL", "target_file TEXT NOT NULL", "target_file_removable INT NOT NULL", "is_prepared INT NOT NULL", "content_filename TEXT NOT NULL", "content_type TEXT NOT NULL", "session_id TEXT NOT NULL", "bytes_uploaded INT NOT NULL", "bytes_total INT NOT NULL", "direct_link TEXT", "upload_url TEXT"), null, 28);
        RESUMABLE_UPLOAD = table28;
        Table table29 = new Table("BOT_BUTTON_IN_LOADING", 28, "bot_btn_in_loading", e43.l("event_id TEXT", "position_in_keyboard INT NOT NULL", "msg_cnv_id INT", "dialog_id INT NOT NULL", "carousel_item_position INT", "type_id INT NOT NULL"), null, 28);
        BOT_BUTTON_IN_LOADING = table29;
        Table table30 = new Table("UPLOAD_CACHE", 29, "upload_cache", e43.l("file_hash TEXT NOT NULL", "type TEXT NOT NULL", "media_id INT NOT NULL", "owner_id INT NOT NULL", "access_key TEXT NOT NULL", "PRIMARY KEY (file_hash, type)"), null, 28);
        UPLOAD_CACHE = table30;
        Table table31 = new Table("MESSAGE_TEMPLATES", 30, "message_templates", e43.l("id INTEGER NOT NULL PRIMARY KEY", "name TEXT NOT NULL", "text TEXT NOT NULL"), null, 28);
        MESSAGE_TEMPLATES = table31;
        Table table32 = new Table("DIALOG_TAGS", 31, "dialogs_tags", e43.l("id INTEGER NOT NULL PRIMARY KEY", "name TEXT NOT NULL", "color TEXT NOT NULL"), null, 28);
        DIALOG_TAGS = table32;
        Table table33 = new Table("DIALOG_BACKGROUND", 32, "dialog_background", e43.l("name TEXT NOT NULL", "hash TEXT NOT NULL", "light_uri TEXT NOT NULL", "dark_uri TEXT NOT NULL", "is_archived INT", "is_hidden INT", "update_time INT", "dark_theme_data TEXT", "light_theme_data TEXT", "sort INT"), e43.l("CREATE UNIQUE INDEX idx_background_name ON dialog_background(name);", "CREATE INDEX idx_background_name_hash ON dialog_background(name,hash);", "CREATE INDEX idx_background_archived ON dialog_background(is_archived);"), 12);
        DIALOG_BACKGROUND = table33;
        Table table34 = new Table("DIALOG_FOLDER", 33, "dialog_folder", e43.l("id INTEGER PRIMARY KEY AUTOINCREMENT", "name TEXT NOT NULL", "type TEXT NOT NULL", "flags INT NOT NULL"), null, 28);
        DIALOG_FOLDER = table34;
        Table table35 = new Table("DIALOG_TO_FOLDER", 34, "dialog_to_folder", e43.l("dialog_id INT NOT NULL", "folder_id INT NOT NULL", "PRIMARY KEY (folder_id, dialog_id)"), e43.l("CREATE INDEX idx_dialog_to_folder_dialog ON dialog_to_folder(dialog_id);", "CREATE INDEX idx_dialog_to_folder_folder ON dialog_to_folder(folder_id);"), 12);
        DIALOG_TO_FOLDER = table35;
        Table table36 = new Table("DIALOG_TO_SUBLIST", 35, "dialog_to_sublist", e43.l("dialog_id INT NOT NULL", "sublist_type TEXT NOT NULL", "PRIMARY KEY (dialog_id, sublist_type)"), e43.l("CREATE INDEX idx_dialog_to_sublist_dialog ON dialog_to_sublist(dialog_id);", "CREATE INDEX idx_dialog_to_sublist_sublist ON dialog_to_sublist(sublist_type);"), 12);
        DIALOG_TO_SUBLIST = table36;
        Table table37 = new Table("FOLDERS_COUNTERS", 36, "folders_counters", e43.l("folder_id INTEGER NOT NULL PRIMARY KEY", "unread_unmuted INT NOT NULL", "unread_muted INT NOT NULL"), null, 28);
        FOLDERS_COUNTERS = table37;
        Table table38 = new Table("SUBLIST_INFO", 37, "sublist_info", e43.l("type TEXT NOT NULL PRIMARY KEY", "name TEXT NOT NULL", "description TEXT NOT NULL", "flag_and INTEGER NOT NULL", "flag_xor INTEGER NOT NULL"), Collections.singletonList("CREATE INDEX idx_sublist_info_type ON sublist_info(type);"), 12);
        SUBLIST_INFO = table38;
        Table table39 = new Table("FOLDER_TO_SUBLIST", 38, "folder_to_sublist", e43.l("folder_id INTEGER NOT NULL", "sublist_type TEXT NOT NULL", "PRIMARY KEY (folder_id, sublist_type)"), Collections.singletonList("CREATE INDEX idx_folder_to_sublist_folder ON folder_to_sublist(folder_id);"), 12);
        FOLDER_TO_SUBLIST = table39;
        Table table40 = new Table("CHANNELS", 39, RTCStatsConstants.KEY_CHANNELS, e43.l("id INTEGER NOT NULL PRIMARY KEY", "title TEXT NOT NULL", "avatar TEXT NOT NULL", "last_msg_cnv_id INT NOT NULL", "read_till_in_msg_cnv_id INT NOT NULL", "read_till_in_msg_cnv_id_local INT NOT NULL", "count_unread INT NOT NULL", "count_unread_local INT NOT NULL", "count_postponed INT NOT NULL", "sort_id_server INT NOT NULL", "sort_id_local INT", "weight INT NOT NULL", "is_archived INT NOT NULL", "is_member INT NOT NULL", "is_owner INT NOT NULL", "notif_is_enabled INT NOT NULL", "notif_is_enabled_local INT", "notif_disabled_until INT NOT NULL", "notif_disabled_until_local INT", "phase INT NOT NULL", "action_in_progress INT NOT NULL", "last_history_expired_time INT", "type TEXT", "parent_id INT", "ban_comment TEXT", "ban_end_date INT", "ban_reason INT", "is_suggested INT", "members_count INT", "can_comment INT", "pinned_msgs_phase INT NOT NULL DEFAULT 0", "can_post INT", "admin_level INT", "is_adult INT NOT NULL DEFAULT 0", "is_hidden_in_all_folder INT NOT NULL DEFAULT 0", "can_post_donut INT NOT NULL DEFAULT 0", "paid_reactions_enabled INT NOT NULL DEFAULT 0", "paid_reaction_cost INT NOT NULL DEFAULT 0"), null, 28);
        CHANNELS = table40;
        Table table41 = new Table("CHANNELS_HISTORY_META", 40, "channels_history_meta", e43.l("filter_id INTEGER NOT NULL PRIMARY KEY", "oldest_sort_id INT NOT NULL", "oldest_sort_channel_id INT NOT NULL", "fully_fetched INT NOT NULL", "phase_id INT NOT NULL"), null, 28);
        CHANNELS_HISTORY_META = table41;
        Table table42 = new Table("DIALOG_APPEARANCE", 41, "dialog_appearance", e43.l("name TEXT NOT NULL", "update_time INT", "dark_theme_data TEXT", "light_theme_data TEXT", "is_hidden INT", "sort INT"), Collections.singletonList("CREATE UNIQUE INDEX idx_appearance_name ON dialog_appearance(name);"), 12);
        DIALOG_APPEARANCE = table42;
        Table table43 = new Table("DIALOG_THEMES", 42, "dialog_themes", e43.l("id TEXT NOT NULL", "update_time INT", "appearance_id TEXT", "background_id TEXT", "is_hidden INT", "sort INT", "last_sync_time_ms INT"), Collections.singletonList("CREATE UNIQUE INDEX idx_id ON dialog_themes(id);"), 12);
        DIALOG_THEMES = table43;
        Table table44 = new Table("CHANNELS_HISTORY_COUNT", 43, "channels_history_count", e43.l("type INTEGER NOT NULL PRIMARY KEY", "count INT NOT NULL", "phase_id INT NOT NULL"), null, 28);
        CHANNELS_HISTORY_COUNT = table44;
        Table table45 = new Table("STORIES_INFO", 44, "stories_info", e43.l("owner_id INTEGER NOT NULL PRIMARY KEY", "story_state INT NOT NULL", "last_updated_ttl INT NOT NULL"), null, 28);
        STORIES_INFO = table45;
        Table table46 = new Table("CHANNELS_RECOMMENDATIONS", 45, "channels_recommendations", e43.l("id INTEGER NOT NULL PRIMARY KEY", "last_updated_millis INT NOT NULL", "parent_id INT", "track_code TEXT", "avatar TEXT", "name TEXT"), null, 28);
        CHANNELS_RECOMMENDATIONS = table46;
        Table table47 = new Table("EDU_USER_ROLES", 46, "edu_user_roles", e43.l("update_time INT NOT NULL DEFAULT 0", "user_id INTEGER NOT NULL", "main_roles TEXT NOT NULL", "main_code_roles TEXT NOT NULL", "organization_id INT NOT NULL", "role_code TEXT NOT NULL", "role_detail TEXT", "role_sort INT NOT NULL"), null, 28);
        EDU_USER_ROLES = table47;
        Table table48 = new Table("EDU_ORGANIZATION", 47, "edu_organization", e43.l("id INT NOT NULL PRIMARY KEY", "type TEXT NOT NULL", "name TEXT NOT NULL"), null, 28);
        EDU_ORGANIZATION = table48;
        Table table49 = new Table("EDU_CONTACT_SECTION", 48, "edu_contact_section", e43.l("organization_id INT", "section_name TEXT NOT NULL", "section_order INT NOT NULL", "peer_ids BLOB NOT NULL"), null, 28);
        EDU_CONTACT_SECTION = table49;
        Table table50 = new Table("EDU_SCHEDULE", 49, "edu_schedule", e43.l("user_id INTEGER NOT NULL PRIMARY KEY", "timezone INT NOT NULL DEFAULT 0", "update_time INT NOT NULL DEFAULT 0", "phase INT NOT NULL DEFAULT 0", "user_schedule BLOB"), null, 28);
        EDU_SCHEDULE = table50;
        Table table51 = new Table("IM_ITEM_WEIGHT", 50, "im_item_weight", e43.l("id INT NOT NULL", "type INT NOT NULL", "local_sort_id INT NULL", "weight BLOB(24) NOT NULL", "PRIMARY KEY (id, type)"), Collections.singletonList("CREATE INDEX idx_weight ON im_item_weight(weight DESC)"), 12);
        IM_ITEM_WEIGHT = table51;
        Table table52 = new Table("IM_ITEM_HISTORY_META", 51, "im_item_history_meta", e43.l("folder_id INTEGER NOT NULL PRIMARY KEY", "min_dialogs_weight BLOB(24)", "min_channels_weight BLOB(24)", "dialogs_phase INT NOT NULL DEFAULT 0", "channels_phase INT NOT NULL DEFAULT 0", "history_full INT", "has_dialogs_error INT NOT NULL DEFAULT 0", "has_channels_error INT NOT NULL DEFAULT 0"), null, 28);
        IM_ITEM_HISTORY_META = table52;
        Table[] tableArr = {table, table2, table3, table4, table5, table6, table7, table8, table9, table10, table11, table12, table13, table14, table15, table16, table17, table18, table19, table20, table21, table22, table23, table24, table25, table26, table27, table28, table29, table30, table31, table32, table33, table34, table35, table36, table37, table38, table39, table40, table41, table42, table43, table44, table45, table46, table47, table48, table49, table50, table51, table52};
        $VALUES = tableArr;
        $ENTRIES = new asp(tableArr);
        Companion = new a();
    }

    public Table() {
        throw null;
    }

    public Table(String str, int i, String str2, List list, List list2, int i2) {
        boolean z = (i2 & 4) == 0;
        String str3 = (i2 & 8) != 0 ? "" : "fts4";
        list2 = (i2 & 16) != 0 ? EmptyList.b : list2;
        this.tableName = str2;
        this.columns = list;
        this.isVirtual = z;
        this.using = str3;
        this.indices = list2;
    }

    public static Table valueOf(String str) {
        return (Table) Enum.valueOf(Table.class, str);
    }

    public static Table[] values() {
        return (Table[]) $VALUES.clone();
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder(400);
        sb.append("CREATE ");
        if (this.isVirtual) {
            sb.append("VIRTUAL ");
        }
        sb.append("TABLE ");
        sb.append(this.tableName);
        if (!drm0.N(this.using)) {
            sb.append(" USING ");
            sb.append(this.using);
        }
        if (!this.columns.isEmpty()) {
            sb.append('(');
            sb.append(j5g.g0(this.columns, StringUtils.COMMA, null, null, 0, null, 62));
            sb.append(')');
        }
        sb.append(";");
        sQLiteDatabase.execSQL(sb.toString());
        Iterator<T> it = this.indices.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL((String) it.next());
        }
    }

    public final List<String> h() {
        return this.columns;
    }

    public final String i() {
        return this.tableName;
    }
}
