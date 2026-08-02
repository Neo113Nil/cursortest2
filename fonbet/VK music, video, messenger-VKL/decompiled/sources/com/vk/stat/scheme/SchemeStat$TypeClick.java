package com.vk.stat.scheme;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.stat.scheme.SchemeStat$EventProductMain;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import org.chromium.base.version_info.VersionConstants;
import org.chromium.net.NetError;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.commons.http.Http;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.atv0;
import xsna.e370;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public interface SchemeStat$TypeClick extends SchemeStat$EventProductMain.b {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_audio_tap_goto_event_item")
        public static final Type TYPE_AUDIO_TAP_GOTO_EVENT_ITEM = new Type("TYPE_AUDIO_TAP_GOTO_EVENT_ITEM", 0);

        @pmi0("type_audio_tap_equalizer_event_item")
        public static final Type TYPE_AUDIO_TAP_EQUALIZER_EVENT_ITEM = new Type("TYPE_AUDIO_TAP_EQUALIZER_EVENT_ITEM", 1);

        @pmi0("type_audio_tap_popup_event_item")
        public static final Type TYPE_AUDIO_TAP_POPUP_EVENT_ITEM = new Type("TYPE_AUDIO_TAP_POPUP_EVENT_ITEM", 2);

        @pmi0("type_audio_tap_settings_event_item")
        public static final Type TYPE_AUDIO_TAP_SETTINGS_EVENT_ITEM = new Type("TYPE_AUDIO_TAP_SETTINGS_EVENT_ITEM", 3);

        @pmi0("type_feed_posting_snippet_edit_item")
        public static final Type TYPE_FEED_POSTING_SNIPPET_EDIT_ITEM = new Type("TYPE_FEED_POSTING_SNIPPET_EDIT_ITEM", 4);

        @pmi0("type_navigation_tab_click")
        public static final Type TYPE_NAVIGATION_TAB_CLICK = new Type("TYPE_NAVIGATION_TAB_CLICK", 5);

        @pmi0("type_im_item")
        public static final Type TYPE_IM_ITEM = new Type("TYPE_IM_ITEM", 6);

        @pmi0("type_market_item")
        public static final Type TYPE_MARKET_ITEM = new Type("TYPE_MARKET_ITEM", 7);

        @pmi0("type_market_marketplace_item")
        public static final Type TYPE_MARKET_MARKETPLACE_ITEM = new Type("TYPE_MARKET_MARKETPLACE_ITEM", 8);

        @pmi0("type_superapp_screen_item")
        public static final Type TYPE_SUPERAPP_SCREEN_ITEM = new Type("TYPE_SUPERAPP_SCREEN_ITEM", 9);

        @pmi0("type_mini_app_item")
        public static final Type TYPE_MINI_APP_ITEM = new Type("TYPE_MINI_APP_ITEM", 10);

        @pmi0("type_video_card_event")
        public static final Type TYPE_VIDEO_CARD_EVENT = new Type("TYPE_VIDEO_CARD_EVENT", 11);

        @pmi0("type_click_item")
        public static final Type TYPE_CLICK_ITEM = new Type("TYPE_CLICK_ITEM", 12);

        @pmi0("type_click_preference_item")
        public static final Type TYPE_CLICK_PREFERENCE_ITEM = new Type("TYPE_CLICK_PREFERENCE_ITEM", 13);

        @pmi0("type_click_preference_with_value_item")
        public static final Type TYPE_CLICK_PREFERENCE_WITH_VALUE_ITEM = new Type("TYPE_CLICK_PREFERENCE_WITH_VALUE_ITEM", 14);

        @pmi0("type_click_preference_value_item")
        public static final Type TYPE_CLICK_PREFERENCE_VALUE_ITEM = new Type("TYPE_CLICK_PREFERENCE_VALUE_ITEM", 15);

        @pmi0("type_catalog_banner_event_item")
        public static final Type TYPE_CATALOG_BANNER_EVENT_ITEM = new Type("TYPE_CATALOG_BANNER_EVENT_ITEM", 16);

        @pmi0("type_ui_hint_item")
        public static final Type TYPE_UI_HINT_ITEM = new Type("TYPE_UI_HINT_ITEM", 17);

        @pmi0("type_clip_viewer_item")
        public static final Type TYPE_CLIP_VIEWER_ITEM = new Type("TYPE_CLIP_VIEWER_ITEM", 18);

        @pmi0("type_video_player_button_click")
        public static final Type TYPE_VIDEO_PLAYER_BUTTON_CLICK = new Type("TYPE_VIDEO_PLAYER_BUTTON_CLICK", 19);

        @pmi0("type_video_player_cast_click")
        public static final Type TYPE_VIDEO_PLAYER_CAST_CLICK = new Type("TYPE_VIDEO_PLAYER_CAST_CLICK", 20);

        @pmi0("type_video_player_seek_click")
        public static final Type TYPE_VIDEO_PLAYER_SEEK_CLICK = new Type("TYPE_VIDEO_PLAYER_SEEK_CLICK", 21);

        @pmi0("type_video_to_clip_attach")
        public static final Type TYPE_VIDEO_TO_CLIP_ATTACH = new Type("TYPE_VIDEO_TO_CLIP_ATTACH", 22);

        @pmi0("type_clips_grid_item")
        public static final Type TYPE_CLIPS_GRID_ITEM = new Type("TYPE_CLIPS_GRID_ITEM", 23);

        @pmi0("type_audio_artist_click_item")
        public static final Type TYPE_AUDIO_ARTIST_CLICK_ITEM = new Type("TYPE_AUDIO_ARTIST_CLICK_ITEM", 24);

        @pmi0("type_clip_in_feed_overlay_click_item")
        public static final Type TYPE_CLIP_IN_FEED_OVERLAY_CLICK_ITEM = new Type("TYPE_CLIP_IN_FEED_OVERLAY_CLICK_ITEM", 25);

        @pmi0("type_superapp_settings_item")
        public static final Type TYPE_SUPERAPP_SETTINGS_ITEM = new Type("TYPE_SUPERAPP_SETTINGS_ITEM", 26);

        @pmi0("type_marusia_conversation_item")
        public static final Type TYPE_MARUSIA_CONVERSATION_ITEM = new Type("TYPE_MARUSIA_CONVERSATION_ITEM", 27);

        @pmi0("type_marusia_reading_item")
        public static final Type TYPE_MARUSIA_READING_ITEM = new Type("TYPE_MARUSIA_READING_ITEM", 28);

        @pmi0("type_video_pip_item")
        public static final Type TYPE_VIDEO_PIP_ITEM = new Type("TYPE_VIDEO_PIP_ITEM", 29);

        @pmi0("type_video_miniplayer_item")
        public static final Type TYPE_VIDEO_MINIPLAYER_ITEM = new Type("TYPE_VIDEO_MINIPLAYER_ITEM", 30);

        @pmi0("type_video_download_item")
        public static final Type TYPE_VIDEO_DOWNLOAD_ITEM = new Type("TYPE_VIDEO_DOWNLOAD_ITEM", 31);

        @pmi0("type_video_not_interesting")
        public static final Type TYPE_VIDEO_NOT_INTERESTING = new Type("TYPE_VIDEO_NOT_INTERESTING", 32);

        @pmi0("type_video_do_not_recommend_author")
        public static final Type TYPE_VIDEO_DO_NOT_RECOMMEND_AUTHOR = new Type("TYPE_VIDEO_DO_NOT_RECOMMEND_AUTHOR", 33);

        @pmi0("type_video_tv_program")
        public static final Type TYPE_VIDEO_TV_PROGRAM = new Type("TYPE_VIDEO_TV_PROGRAM", 34);

        @pmi0("type_video_watch_later")
        public static final Type TYPE_VIDEO_WATCH_LATER = new Type("TYPE_VIDEO_WATCH_LATER", 35);

        @pmi0("type_video_background_listening_item")
        public static final Type TYPE_VIDEO_BACKGROUND_LISTENING_ITEM = new Type("TYPE_VIDEO_BACKGROUND_LISTENING_ITEM", 36);

        @pmi0("type_classifieds_click")
        public static final Type TYPE_CLASSIFIEDS_CLICK = new Type("TYPE_CLASSIFIEDS_CLICK", 37);

        @pmi0("type_aliexpress_click")
        public static final Type TYPE_ALIEXPRESS_CLICK = new Type("TYPE_ALIEXPRESS_CLICK", 38);

        @pmi0("type_market_carousel_click")
        public static final Type TYPE_MARKET_CAROUSEL_CLICK = new Type("TYPE_MARKET_CAROUSEL_CLICK", 39);

        @pmi0("type_feed_click_to_shops_more_button")
        public static final Type TYPE_FEED_CLICK_TO_SHOPS_MORE_BUTTON = new Type("TYPE_FEED_CLICK_TO_SHOPS_MORE_BUTTON", 40);

        @pmi0("type_market_click")
        public static final Type TYPE_MARKET_CLICK = new Type("TYPE_MARKET_CLICK", 41);

        @pmi0("type_search_click_item")
        public static final Type TYPE_SEARCH_CLICK_ITEM = new Type("TYPE_SEARCH_CLICK_ITEM", 42);

        @pmi0("type_search_local_click_item")
        public static final Type TYPE_SEARCH_LOCAL_CLICK_ITEM = new Type("TYPE_SEARCH_LOCAL_CLICK_ITEM", 43);

        @pmi0("type_messaging_contact_recommendations_item")
        public static final Type TYPE_MESSAGING_CONTACT_RECOMMENDATIONS_ITEM = new Type("TYPE_MESSAGING_CONTACT_RECOMMENDATIONS_ITEM", 44);

        @pmi0("type_im_conversation_click_item")
        public static final Type TYPE_IM_CONVERSATION_CLICK_ITEM = new Type("TYPE_IM_CONVERSATION_CLICK_ITEM", 45);

        @pmi0("type_messaging_sync_contacts_click_item")
        public static final Type TYPE_MESSAGING_SYNC_CONTACTS_CLICK_ITEM = new Type("TYPE_MESSAGING_SYNC_CONTACTS_CLICK_ITEM", 46);

        @pmi0("type_im_share_from_chat_profile_click_item")
        public static final Type TYPE_IM_SHARE_FROM_CHAT_PROFILE_CLICK_ITEM = new Type("TYPE_IM_SHARE_FROM_CHAT_PROFILE_CLICK_ITEM", 47);

        @pmi0("type_im_go_archive_click_item")
        public static final Type TYPE_IM_GO_ARCHIVE_CLICK_ITEM = new Type("TYPE_IM_GO_ARCHIVE_CLICK_ITEM", 48);

        @pmi0("type_im_pinned_message_click_item")
        public static final Type TYPE_IM_PINNED_MESSAGE_CLICK_ITEM = new Type("TYPE_IM_PINNED_MESSAGE_CLICK_ITEM", 49);

        @pmi0("type_im_phone_number_call_click_item")
        public static final Type TYPE_IM_PHONE_NUMBER_CALL_CLICK_ITEM = new Type("TYPE_IM_PHONE_NUMBER_CALL_CLICK_ITEM", 50);

        @pmi0("type_im_go_to_profile_click_item")
        public static final Type TYPE_IM_GO_TO_PROFILE_CLICK_ITEM = new Type("TYPE_IM_GO_TO_PROFILE_CLICK_ITEM", 51);

        @pmi0("type_im_chat_item")
        public static final Type TYPE_IM_CHAT_ITEM = new Type("TYPE_IM_CHAT_ITEM", 52);

        @pmi0("type_profile_action_button_item")
        public static final Type TYPE_PROFILE_ACTION_BUTTON_ITEM = new Type("TYPE_PROFILE_ACTION_BUTTON_ITEM", 53);

        @pmi0("type_share_item")
        public static final Type TYPE_SHARE_ITEM = new Type("TYPE_SHARE_ITEM", 54);

        @pmi0("type_sharing_link_open")
        public static final Type TYPE_SHARING_LINK_OPEN = new Type("TYPE_SHARING_LINK_OPEN", 55);

        @pmi0("type_question_item")
        public static final Type TYPE_QUESTION_ITEM = new Type("TYPE_QUESTION_ITEM", 56);

        @pmi0("type_badges_item")
        public static final Type TYPE_BADGES_ITEM = new Type("TYPE_BADGES_ITEM", 57);

        @pmi0("type_wishlist_item")
        public static final Type TYPE_WISHLIST_ITEM = new Type("TYPE_WISHLIST_ITEM", 58);

        @pmi0("type_owner_button_app_click")
        public static final Type TYPE_OWNER_BUTTON_APP_CLICK = new Type("TYPE_OWNER_BUTTON_APP_CLICK", 59);

        @pmi0("type_games_catalog_click")
        public static final Type TYPE_GAMES_CATALOG_CLICK = new Type("TYPE_GAMES_CATALOG_CLICK", 60);

        @pmi0("type_video_card_longtap")
        public static final Type TYPE_VIDEO_CARD_LONGTAP = new Type("TYPE_VIDEO_CARD_LONGTAP", 61);

        @pmi0("type_soft_update_click")
        public static final Type TYPE_SOFT_UPDATE_CLICK = new Type("TYPE_SOFT_UPDATE_CLICK", 62);

        @pmi0("type_friend_entrypoint_block_item")
        public static final Type TYPE_FRIEND_ENTRYPOINT_BLOCK_ITEM = new Type("TYPE_FRIEND_ENTRYPOINT_BLOCK_ITEM", 63);

        @pmi0("type_superapp_onboarding_click_item")
        public static final Type TYPE_SUPERAPP_ONBOARDING_CLICK_ITEM = new Type("TYPE_SUPERAPP_ONBOARDING_CLICK_ITEM", 64);

        @pmi0("type_photo_editor_item")
        public static final Type TYPE_PHOTO_EDITOR_ITEM = new Type("TYPE_PHOTO_EDITOR_ITEM", 65);

        @pmi0("type_profile_item")
        public static final Type TYPE_PROFILE_ITEM = new Type("TYPE_PROFILE_ITEM", 66);

        @pmi0("type_community_channel_item_click")
        public static final Type TYPE_COMMUNITY_CHANNEL_ITEM_CLICK = new Type("TYPE_COMMUNITY_CHANNEL_ITEM_CLICK", 67);

        @pmi0("type_groups_event_item")
        public static final Type TYPE_GROUPS_EVENT_ITEM = new Type("TYPE_GROUPS_EVENT_ITEM", 68);

        @pmi0("type_stickers_click_item")
        public static final Type TYPE_STICKERS_CLICK_ITEM = new Type("TYPE_STICKERS_CLICK_ITEM", 69);

        @pmi0("type_rating_click")
        public static final Type TYPE_RATING_CLICK = new Type("TYPE_RATING_CLICK", 70);

        @pmi0("type_calls_item")
        public static final Type TYPE_CALLS_ITEM = new Type("TYPE_CALLS_ITEM", 71);

        @pmi0("type_admin_tips_click")
        public static final Type TYPE_ADMIN_TIPS_CLICK = new Type("TYPE_ADMIN_TIPS_CLICK", 72);

        @pmi0("type_nft_item")
        public static final Type TYPE_NFT_ITEM = new Type("TYPE_NFT_ITEM", 73);

        @pmi0("type_feed_media_discover_item")
        public static final Type TYPE_FEED_MEDIA_DISCOVER_ITEM = new Type("TYPE_FEED_MEDIA_DISCOVER_ITEM", 74);

        @pmi0("type_feed_media_discover_block")
        public static final Type TYPE_FEED_MEDIA_DISCOVER_BLOCK = new Type("TYPE_FEED_MEDIA_DISCOVER_BLOCK", 75);

        @pmi0("type_feed_open_similar_posts")
        public static final Type TYPE_FEED_OPEN_SIMILAR_POSTS = new Type("TYPE_FEED_OPEN_SIMILAR_POSTS", 76);

        @pmi0("type_feed_open_comments_modal")
        public static final Type TYPE_FEED_OPEN_COMMENTS_MODAL = new Type("TYPE_FEED_OPEN_COMMENTS_MODAL", 77);

        @pmi0("type_feed_open_reactions_modal")
        public static final Type TYPE_FEED_OPEN_REACTIONS_MODAL = new Type("TYPE_FEED_OPEN_REACTIONS_MODAL", 78);

        @pmi0("type_feed_start_fast_chat")
        public static final Type TYPE_FEED_START_FAST_CHAT = new Type("TYPE_FEED_START_FAST_CHAT", 79);

        @pmi0("type_feed_comment_thread_button_show_more")
        public static final Type TYPE_FEED_COMMENT_THREAD_BUTTON_SHOW_MORE = new Type("TYPE_FEED_COMMENT_THREAD_BUTTON_SHOW_MORE", 80);

        @pmi0("type_feed_community_media_item")
        public static final Type TYPE_FEED_COMMUNITY_MEDIA_ITEM = new Type("TYPE_FEED_COMMUNITY_MEDIA_ITEM", 81);

        @pmi0("type_feed_interaction_item")
        public static final Type TYPE_FEED_INTERACTION_ITEM = new Type("TYPE_FEED_INTERACTION_ITEM", 82);

        @pmi0("type_feed_item_menu_action")
        public static final Type TYPE_FEED_ITEM_MENU_ACTION = new Type("TYPE_FEED_ITEM_MENU_ACTION", 83);

        @pmi0("type_feed_open_item")
        public static final Type TYPE_FEED_OPEN_ITEM = new Type("TYPE_FEED_OPEN_ITEM", 84);

        @pmi0("type_photo_save_to_album_menu_item")
        public static final Type TYPE_PHOTO_SAVE_TO_ALBUM_MENU_ITEM = new Type("TYPE_PHOTO_SAVE_TO_ALBUM_MENU_ITEM", 85);

        @pmi0("type_photo_share_to_message_item")
        public static final Type TYPE_PHOTO_SHARE_TO_MESSAGE_ITEM = new Type("TYPE_PHOTO_SHARE_TO_MESSAGE_ITEM", 86);

        @pmi0("type_obscene_word")
        public static final Type TYPE_OBSCENE_WORD = new Type("TYPE_OBSCENE_WORD", 87);

        @pmi0("type_reveal_obscene_words")
        public static final Type TYPE_REVEAL_OBSCENE_WORDS = new Type("TYPE_REVEAL_OBSCENE_WORDS", 88);

        @pmi0("type_badges_screen_item")
        public static final Type TYPE_BADGES_SCREEN_ITEM = new Type("TYPE_BADGES_SCREEN_ITEM", 89);

        @pmi0("type_dzen_article_item")
        public static final Type TYPE_DZEN_ARTICLE_ITEM = new Type("TYPE_DZEN_ARTICLE_ITEM", 90);

        @pmi0("type_dzen_story_click")
        public static final Type TYPE_DZEN_STORY_CLICK = new Type("TYPE_DZEN_STORY_CLICK", 91);

        @pmi0("type_dzen_story_item_click")
        public static final Type TYPE_DZEN_STORY_ITEM_CLICK = new Type("TYPE_DZEN_STORY_ITEM_CLICK", 92);

        @pmi0("type_dzen_show_more_click")
        public static final Type TYPE_DZEN_SHOW_MORE_CLICK = new Type("TYPE_DZEN_SHOW_MORE_CLICK", 93);

        @pmi0("type_hidden_source_open_profile")
        public static final Type TYPE_HIDDEN_SOURCE_OPEN_PROFILE = new Type("TYPE_HIDDEN_SOURCE_OPEN_PROFILE", 94);

        @pmi0("type_hidden_source_unban_button")
        public static final Type TYPE_HIDDEN_SOURCE_UNBAN_BUTTON = new Type("TYPE_HIDDEN_SOURCE_UNBAN_BUTTON", 95);

        @pmi0("type_hidden_source_unban_cancel_button")
        public static final Type TYPE_HIDDEN_SOURCE_UNBAN_CANCEL_BUTTON = new Type("TYPE_HIDDEN_SOURCE_UNBAN_CANCEL_BUTTON", 96);

        @pmi0("type_community_onboarding_click")
        public static final Type TYPE_COMMUNITY_ONBOARDING_CLICK = new Type("TYPE_COMMUNITY_ONBOARDING_CLICK", 97);

        @pmi0("type_followers_mode_onboarding_click")
        public static final Type TYPE_FOLLOWERS_MODE_ONBOARDING_CLICK = new Type("TYPE_FOLLOWERS_MODE_ONBOARDING_CLICK", 98);

        @pmi0("type_followers_mode_switch_state")
        public static final Type TYPE_FOLLOWERS_MODE_SWITCH_STATE = new Type("TYPE_FOLLOWERS_MODE_SWITCH_STATE", 99);

        @pmi0("type_feed_carousel_longtap")
        public static final Type TYPE_FEED_CAROUSEL_LONGTAP = new Type("TYPE_FEED_CAROUSEL_LONGTAP", 100);

        @pmi0("type_feed_carousel_longtap_scroll")
        public static final Type TYPE_FEED_CAROUSEL_LONGTAP_SCROLL = new Type("TYPE_FEED_CAROUSEL_LONGTAP_SCROLL", 101);

        @pmi0("type_feed_carousel_onboarding_scroll")
        public static final Type TYPE_FEED_CAROUSEL_ONBOARDING_SCROLL = new Type("TYPE_FEED_CAROUSEL_ONBOARDING_SCROLL", 102);

        @pmi0("type_posting_item")
        public static final Type TYPE_POSTING_ITEM = new Type("TYPE_POSTING_ITEM", 103);

        @pmi0("type_market_item_review_click")
        public static final Type TYPE_MARKET_ITEM_REVIEW_CLICK = new Type("TYPE_MARKET_ITEM_REVIEW_CLICK", 104);

        @pmi0("type_mini_app_policy_item")
        public static final Type TYPE_MINI_APP_POLICY_ITEM = new Type("TYPE_MINI_APP_POLICY_ITEM", 105);

        @pmi0("type_mini_app_permission_box_item")
        public static final Type TYPE_MINI_APP_PERMISSION_BOX_ITEM = new Type("TYPE_MINI_APP_PERMISSION_BOX_ITEM", Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE);

        @pmi0("type_community_review_click")
        public static final Type TYPE_COMMUNITY_REVIEW_CLICK = new Type("TYPE_COMMUNITY_REVIEW_CLICK", ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED);

        @pmi0("type_photos_item")
        public static final Type TYPE_PHOTOS_ITEM = new Type("TYPE_PHOTOS_ITEM", 108);

        @pmi0("type_open_quality_index_settings")
        public static final Type TYPE_OPEN_QUALITY_INDEX_SETTINGS = new Type("TYPE_OPEN_QUALITY_INDEX_SETTINGS", 109);

        @pmi0("type_audio_popup_item")
        public static final Type TYPE_AUDIO_POPUP_ITEM = new Type("TYPE_AUDIO_POPUP_ITEM", 110);

        @pmi0("type_ugc_stickers_item")
        public static final Type TYPE_UGC_STICKERS_ITEM = new Type("TYPE_UGC_STICKERS_ITEM", 111);

        @pmi0("type_banner_click")
        public static final Type TYPE_BANNER_CLICK = new Type("TYPE_BANNER_CLICK", 112);

        @pmi0("type_video_in_app_review_click")
        public static final Type TYPE_VIDEO_IN_APP_REVIEW_CLICK = new Type("TYPE_VIDEO_IN_APP_REVIEW_CLICK", 113);

        @pmi0("type_system_push_click")
        public static final Type TYPE_SYSTEM_PUSH_CLICK = new Type("TYPE_SYSTEM_PUSH_CLICK", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);

        @pmi0("type_autoplay_turn_click")
        public static final Type TYPE_AUTOPLAY_TURN_CLICK = new Type("TYPE_AUTOPLAY_TURN_CLICK", Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);

        @pmi0("type_ecomm_click")
        public static final Type TYPE_ECOMM_CLICK = new Type("TYPE_ECOMM_CLICK", 116);

        @pmi0("type_video_author_filter_click")
        public static final Type TYPE_VIDEO_AUTHOR_FILTER_CLICK = new Type("TYPE_VIDEO_AUTHOR_FILTER_CLICK", Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);

        @pmi0("type_video_kids_mode_click")
        public static final Type TYPE_VIDEO_KIDS_MODE_CLICK = new Type("TYPE_VIDEO_KIDS_MODE_CLICK", Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);

        @pmi0("type_video_playlist_show_all_click")
        public static final Type TYPE_VIDEO_PLAYLIST_SHOW_ALL_CLICK = new Type("TYPE_VIDEO_PLAYLIST_SHOW_ALL_CLICK", Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);

        @pmi0("type_video_catalog_button_extended_click")
        public static final Type TYPE_VIDEO_CATALOG_BUTTON_EXTENDED_CLICK = new Type("TYPE_VIDEO_CATALOG_BUTTON_EXTENDED_CLICK", 120);

        @pmi0("type_video_catalog_block_item_click")
        public static final Type TYPE_VIDEO_CATALOG_BLOCK_ITEM_CLICK = new Type("TYPE_VIDEO_CATALOG_BLOCK_ITEM_CLICK", Sdk.SDKError.Reason.TPAT_ERROR_VALUE);

        @pmi0("type_video_suggest_downloads_click")
        public static final Type TYPE_VIDEO_SUGGEST_DOWNLOADS_CLICK = new Type("TYPE_VIDEO_SUGGEST_DOWNLOADS_CLICK", Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);

        @pmi0("type_video_description_click")
        public static final Type TYPE_VIDEO_DESCRIPTION_CLICK = new Type("TYPE_VIDEO_DESCRIPTION_CLICK", 123);

        @pmi0("type_video_download_click")
        public static final Type TYPE_VIDEO_DOWNLOAD_CLICK = new Type("TYPE_VIDEO_DOWNLOAD_CLICK", Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);

        @pmi0("type_video_restriction_click_item")
        public static final Type TYPE_VIDEO_RESTRICTION_CLICK_ITEM = new Type("TYPE_VIDEO_RESTRICTION_CLICK_ITEM", 125);

        @pmi0("type_video_comment_click")
        public static final Type TYPE_VIDEO_COMMENT_CLICK = new Type("TYPE_VIDEO_COMMENT_CLICK", Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);

        @pmi0("type_video_screen_comment_click")
        public static final Type TYPE_VIDEO_SCREEN_COMMENT_CLICK = new Type("TYPE_VIDEO_SCREEN_COMMENT_CLICK", 127);

        @pmi0("type_video_comments_sort_tab_click")
        public static final Type TYPE_VIDEO_COMMENTS_SORT_TAB_CLICK = new Type("TYPE_VIDEO_COMMENTS_SORT_TAB_CLICK", 128);

        @pmi0("type_video_discovery_logo_click")
        public static final Type TYPE_VIDEO_DISCOVERY_LOGO_CLICK = new Type("TYPE_VIDEO_DISCOVERY_LOGO_CLICK", 129);

        @pmi0("type_video_pushes_ad_click")
        public static final Type TYPE_VIDEO_PUSHES_AD_CLICK = new Type("TYPE_VIDEO_PUSHES_AD_CLICK", 130);

        @pmi0("type_video_stop_recommending_creator")
        public static final Type TYPE_VIDEO_STOP_RECOMMENDING_CREATOR = new Type("TYPE_VIDEO_STOP_RECOMMENDING_CREATOR", Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);

        @pmi0("type_video_undo_stop_recommending_creator")
        public static final Type TYPE_VIDEO_UNDO_STOP_RECOMMENDING_CREATOR = new Type("TYPE_VIDEO_UNDO_STOP_RECOMMENDING_CREATOR", Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);

        @pmi0("type_snowball_events")
        public static final Type TYPE_SNOWBALL_EVENTS = new Type("TYPE_SNOWBALL_EVENTS", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE);

        @pmi0("type_mini_app_snowball_modal_action")
        public static final Type TYPE_MINI_APP_SNOWBALL_MODAL_ACTION = new Type("TYPE_MINI_APP_SNOWBALL_MODAL_ACTION", 134);

        @pmi0("type_video_open_fullscreen_with_swipe")
        public static final Type TYPE_VIDEO_OPEN_FULLSCREEN_WITH_SWIPE = new Type("TYPE_VIDEO_OPEN_FULLSCREEN_WITH_SWIPE", 135);

        @pmi0("type_video_attach_short_video")
        public static final Type TYPE_VIDEO_ATTACH_SHORT_VIDEO = new Type("TYPE_VIDEO_ATTACH_SHORT_VIDEO", Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);

        @pmi0("type_click_secure_lock_settings_item")
        public static final Type TYPE_CLICK_SECURE_LOCK_SETTINGS_ITEM = new Type("TYPE_CLICK_SECURE_LOCK_SETTINGS_ITEM", Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE);

        @pmi0("type_feed_comments_sort_tab_click")
        public static final Type TYPE_FEED_COMMENTS_SORT_TAB_CLICK = new Type("TYPE_FEED_COMMENTS_SORT_TAB_CLICK", 138);

        @pmi0("type_legal_notice_click")
        public static final Type TYPE_LEGAL_NOTICE_CLICK = new Type("TYPE_LEGAL_NOTICE_CLICK", 139);

        @pmi0("type_video_create_clip")
        public static final Type TYPE_VIDEO_CREATE_CLIP = new Type("TYPE_VIDEO_CREATE_CLIP", VersionConstants.PRODUCT_MAJOR_VERSION);

        @pmi0("type_community_tab_item_click")
        public static final Type TYPE_COMMUNITY_TAB_ITEM_CLICK = new Type("TYPE_COMMUNITY_TAB_ITEM_CLICK", 141);

        @pmi0("type_donut_goal_click_item")
        public static final Type TYPE_DONUT_GOAL_CLICK_ITEM = new Type("TYPE_DONUT_GOAL_CLICK_ITEM", 142);

        @pmi0("type_communities_donut_click")
        public static final Type TYPE_COMMUNITIES_DONUT_CLICK = new Type("TYPE_COMMUNITIES_DONUT_CLICK", 143);

        @pmi0("type_donut_banner_click")
        public static final Type TYPE_DONUT_BANNER_CLICK = new Type("TYPE_DONUT_BANNER_CLICK", 144);

        @pmi0("type_donut_support_author_click")
        public static final Type TYPE_DONUT_SUPPORT_AUTHOR_CLICK = new Type("TYPE_DONUT_SUPPORT_AUTHOR_CLICK", 145);

        @pmi0("type_video_direct_url_start_item")
        public static final Type TYPE_VIDEO_DIRECT_URL_START_ITEM = new Type("TYPE_VIDEO_DIRECT_URL_START_ITEM", 146);

        @pmi0("type_promo_click_item")
        public static final Type TYPE_PROMO_CLICK_ITEM = new Type("TYPE_PROMO_CLICK_ITEM", 147);

        @pmi0("type_onboarding_event")
        public static final Type TYPE_ONBOARDING_EVENT = new Type("TYPE_ONBOARDING_EVENT", 148);

        @pmi0("type_notification_item_click")
        public static final Type TYPE_NOTIFICATION_ITEM_CLICK = new Type("TYPE_NOTIFICATION_ITEM_CLICK", 149);

        @pmi0("type_feed_open_user_click")
        public static final Type TYPE_FEED_OPEN_USER_CLICK = new Type("TYPE_FEED_OPEN_USER_CLICK", 150);

        @pmi0("type_feed_open_group_click")
        public static final Type TYPE_FEED_OPEN_GROUP_CLICK = new Type("TYPE_FEED_OPEN_GROUP_CLICK", 151);

        @pmi0("type_feed_open_reposted_item_user_click")
        public static final Type TYPE_FEED_OPEN_REPOSTED_ITEM_USER_CLICK = new Type("TYPE_FEED_OPEN_REPOSTED_ITEM_USER_CLICK", 152);

        @pmi0("type_feed_open_reposted_item_group_click")
        public static final Type TYPE_FEED_OPEN_REPOSTED_ITEM_GROUP_CLICK = new Type("TYPE_FEED_OPEN_REPOSTED_ITEM_GROUP_CLICK", 153);

        @pmi0("type_feed_open_story_click")
        public static final Type TYPE_FEED_OPEN_STORY_CLICK = new Type("TYPE_FEED_OPEN_STORY_CLICK", 154);

        @pmi0("type_feed_follow_click")
        public static final Type TYPE_FEED_FOLLOW_CLICK = new Type("TYPE_FEED_FOLLOW_CLICK", 155);

        @pmi0("type_feed_hide_product_pin_click")
        public static final Type TYPE_FEED_HIDE_PRODUCT_PIN_CLICK = new Type("TYPE_FEED_HIDE_PRODUCT_PIN_CLICK", 156);

        @pmi0("type_feed_hide_ticket_item_pin")
        public static final Type TYPE_FEED_HIDE_TICKET_ITEM_PIN = new Type("TYPE_FEED_HIDE_TICKET_ITEM_PIN", 157);

        @pmi0("type_feed_open_market_item_click")
        public static final Type TYPE_FEED_OPEN_MARKET_ITEM_CLICK = new Type("TYPE_FEED_OPEN_MARKET_ITEM_CLICK", 158);

        @pmi0("type_feed_ticket_item_click")
        public static final Type TYPE_FEED_TICKET_ITEM_CLICK = new Type("TYPE_FEED_TICKET_ITEM_CLICK", 159);

        @pmi0("type_feed_show_products_modal_card_click")
        public static final Type TYPE_FEED_SHOW_PRODUCTS_MODAL_CARD_CLICK = new Type("TYPE_FEED_SHOW_PRODUCTS_MODAL_CARD_CLICK", 160);

        @pmi0("type_feed_unfollow_click")
        public static final Type TYPE_FEED_UNFOLLOW_CLICK = new Type("TYPE_FEED_UNFOLLOW_CLICK", 161);

        @pmi0("type_feed_post_expand_text")
        public static final Type TYPE_FEED_POST_EXPAND_TEXT = new Type("TYPE_FEED_POST_EXPAND_TEXT", 162);

        @pmi0("type_feed_post_collapse_text")
        public static final Type TYPE_FEED_POST_COLLAPSE_TEXT = new Type("TYPE_FEED_POST_COLLAPSE_TEXT", 163);

        @pmi0("type_modal_sharing_open")
        public static final Type TYPE_MODAL_SHARING_OPEN = new Type("TYPE_MODAL_SHARING_OPEN", 164);

        @pmi0("type_modal_sharing_click")
        public static final Type TYPE_MODAL_SHARING_CLICK = new Type("TYPE_MODAL_SHARING_CLICK", 165);

        @pmi0("type_modal_sharing_close")
        public static final Type TYPE_MODAL_SHARING_CLOSE = new Type("TYPE_MODAL_SHARING_CLOSE", 166);

        @pmi0("type_video_modal_sharing_click")
        public static final Type TYPE_VIDEO_MODAL_SHARING_CLICK = new Type("TYPE_VIDEO_MODAL_SHARING_CLICK", 167);

        @pmi0("type_tv_kid_mode_item")
        public static final Type TYPE_TV_KID_MODE_ITEM = new Type("TYPE_TV_KID_MODE_ITEM", 168);

        @pmi0("type_open_community_chats")
        public static final Type TYPE_OPEN_COMMUNITY_CHATS = new Type("TYPE_OPEN_COMMUNITY_CHATS", 169);

        @pmi0("type_feed_post_unmute_audio")
        public static final Type TYPE_FEED_POST_UNMUTE_AUDIO = new Type("TYPE_FEED_POST_UNMUTE_AUDIO", 170);

        @pmi0("type_feed_post_mute_audio")
        public static final Type TYPE_FEED_POST_MUTE_AUDIO = new Type("TYPE_FEED_POST_MUTE_AUDIO", 171);

        @pmi0("type_feed_post_pause_audio")
        public static final Type TYPE_FEED_POST_PAUSE_AUDIO = new Type("TYPE_FEED_POST_PAUSE_AUDIO", 172);

        @pmi0("type_feed_post_open_audio")
        public static final Type TYPE_FEED_POST_OPEN_AUDIO = new Type("TYPE_FEED_POST_OPEN_AUDIO", 173);

        @pmi0("type_feed_post_added_audio")
        public static final Type TYPE_FEED_POST_ADDED_AUDIO = new Type("TYPE_FEED_POST_ADDED_AUDIO", 174);

        @pmi0("type_feed_post_removed_audio")
        public static final Type TYPE_FEED_POST_REMOVED_AUDIO = new Type("TYPE_FEED_POST_REMOVED_AUDIO", 175);

        @pmi0("type_feed_post_open_playlist")
        public static final Type TYPE_FEED_POST_OPEN_PLAYLIST = new Type("TYPE_FEED_POST_OPEN_PLAYLIST", 176);

        @pmi0("type_feed_post_added_playlist")
        public static final Type TYPE_FEED_POST_ADDED_PLAYLIST = new Type("TYPE_FEED_POST_ADDED_PLAYLIST", 177);

        @pmi0("type_feed_post_removed_playlist")
        public static final Type TYPE_FEED_POST_REMOVED_PLAYLIST = new Type("TYPE_FEED_POST_REMOVED_PLAYLIST", 178);

        @pmi0("type_feed_coowners_event")
        public static final Type TYPE_FEED_COOWNERS_EVENT = new Type("TYPE_FEED_COOWNERS_EVENT", 179);

        @pmi0("type_feed_view_authors")
        public static final Type TYPE_FEED_VIEW_AUTHORS = new Type("TYPE_FEED_VIEW_AUTHORS", 180);

        @pmi0("type_feed_view_reposted_item_authors")
        public static final Type TYPE_FEED_VIEW_REPOSTED_ITEM_AUTHORS = new Type("TYPE_FEED_VIEW_REPOSTED_ITEM_AUTHORS", 181);

        @pmi0("video_card_longtap")
        public static final Type VIDEO_CARD_LONGTAP = new Type("VIDEO_CARD_LONGTAP", 182);

        @pmi0("type_action_button_click")
        public static final Type TYPE_ACTION_BUTTON_CLICK = new Type("TYPE_ACTION_BUTTON_CLICK", 183);

        @pmi0("type_video_kids_age_filter_button_tap")
        public static final Type TYPE_VIDEO_KIDS_AGE_FILTER_BUTTON_TAP = new Type("TYPE_VIDEO_KIDS_AGE_FILTER_BUTTON_TAP", 184);

        @pmi0("type_tv_qr_modal_action")
        public static final Type TYPE_TV_QR_MODAL_ACTION = new Type("TYPE_TV_QR_MODAL_ACTION", 185);

        @pmi0("type_move_youtube_subs_onboarding_item")
        public static final Type TYPE_MOVE_YOUTUBE_SUBS_ONBOARDING_ITEM = new Type("TYPE_MOVE_YOUTUBE_SUBS_ONBOARDING_ITEM", 186);

        @pmi0("type_move_youtube_subs_click_item")
        public static final Type TYPE_MOVE_YOUTUBE_SUBS_CLICK_ITEM = new Type("TYPE_MOVE_YOUTUBE_SUBS_CLICK_ITEM", 187);

        @pmi0("type_select_creators_click_item")
        public static final Type TYPE_SELECT_CREATORS_CLICK_ITEM = new Type("TYPE_SELECT_CREATORS_CLICK_ITEM", 188);

        @pmi0("type_select_creators_screen_confirm_click")
        public static final Type TYPE_SELECT_CREATORS_SCREEN_CONFIRM_CLICK = new Type("TYPE_SELECT_CREATORS_SCREEN_CONFIRM_CLICK", PsExtractor.PRIVATE_STREAM_1);

        @pmi0("type_creator_hide_undo_hide_click")
        public static final Type TYPE_CREATOR_HIDE_UNDO_HIDE_CLICK = new Type("TYPE_CREATOR_HIDE_UNDO_HIDE_CLICK", 190);

        @pmi0("type_skip_video_button_click")
        public static final Type TYPE_SKIP_VIDEO_BUTTON_CLICK = new Type("TYPE_SKIP_VIDEO_BUTTON_CLICK", 191);

        @pmi0("type_next_video_announcement_click")
        public static final Type TYPE_NEXT_VIDEO_ANNOUNCEMENT_CLICK = new Type("TYPE_NEXT_VIDEO_ANNOUNCEMENT_CLICK", PsExtractor.AUDIO_STREAM);

        @pmi0("type_video_postponed_publication_click")
        public static final Type TYPE_VIDEO_POSTPONED_PUBLICATION_CLICK = new Type("TYPE_VIDEO_POSTPONED_PUBLICATION_CLICK", 193);

        @pmi0("type_video_upload_option_click")
        public static final Type TYPE_VIDEO_UPLOAD_OPTION_CLICK = new Type("TYPE_VIDEO_UPLOAD_OPTION_CLICK", 194);

        @pmi0("type_video_upload_privacy_click")
        public static final Type TYPE_VIDEO_UPLOAD_PRIVACY_CLICK = new Type("TYPE_VIDEO_UPLOAD_PRIVACY_CLICK", 195);

        @pmi0("type_video_upload_additional_option_click")
        public static final Type TYPE_VIDEO_UPLOAD_ADDITIONAL_OPTION_CLICK = new Type("TYPE_VIDEO_UPLOAD_ADDITIONAL_OPTION_CLICK", 196);

        @pmi0("type_video_create_playlist_click")
        public static final Type TYPE_VIDEO_CREATE_PLAYLIST_CLICK = new Type("TYPE_VIDEO_CREATE_PLAYLIST_CLICK", 197);

        @pmi0("type_video_next_prev_video_button_tap")
        public static final Type TYPE_VIDEO_NEXT_PREV_VIDEO_BUTTON_TAP = new Type("TYPE_VIDEO_NEXT_PREV_VIDEO_BUTTON_TAP", 198);

        @pmi0("type_video_toggle_fullscreen")
        public static final Type TYPE_VIDEO_TOGGLE_FULLSCREEN = new Type("TYPE_VIDEO_TOGGLE_FULLSCREEN", 199);

        @pmi0("type_video_music_track_add")
        public static final Type TYPE_VIDEO_MUSIC_TRACK_ADD = new Type("TYPE_VIDEO_MUSIC_TRACK_ADD", 200);

        @pmi0("type_video_music_track_delete")
        public static final Type TYPE_VIDEO_MUSIC_TRACK_DELETE = new Type("TYPE_VIDEO_MUSIC_TRACK_DELETE", 201);

        @pmi0("type_video_music_track_card_continue_watch")
        public static final Type TYPE_VIDEO_MUSIC_TRACK_CARD_CONTINUE_WATCH = new Type("TYPE_VIDEO_MUSIC_TRACK_CARD_CONTINUE_WATCH", 202);

        @pmi0("type_video_music_track_card_open_playlist")
        public static final Type TYPE_VIDEO_MUSIC_TRACK_CARD_OPEN_PLAYLIST = new Type("TYPE_VIDEO_MUSIC_TRACK_CARD_OPEN_PLAYLIST", 203);

        @pmi0("type_video_music_track_card_similar_music_click")
        public static final Type TYPE_VIDEO_MUSIC_TRACK_CARD_SIMILAR_MUSIC_CLICK = new Type("TYPE_VIDEO_MUSIC_TRACK_CARD_SIMILAR_MUSIC_CLICK", 204);

        @pmi0("type_video_player_music_track_click")
        public static final Type TYPE_VIDEO_PLAYER_MUSIC_TRACK_CLICK = new Type("TYPE_VIDEO_PLAYER_MUSIC_TRACK_CLICK", 205);

        @pmi0("type_video_music_stream_mix_watch_click")
        public static final Type TYPE_VIDEO_MUSIC_STREAM_MIX_WATCH_CLICK = new Type("TYPE_VIDEO_MUSIC_STREAM_MIX_WATCH_CLICK", 206);

        @pmi0("type_video_ad_subscription_offer_click")
        public static final Type TYPE_VIDEO_AD_SUBSCRIPTION_OFFER_CLICK = new Type("TYPE_VIDEO_AD_SUBSCRIPTION_OFFER_CLICK", 207);

        @pmi0("type_video_ad_subscription_offer_close")
        public static final Type TYPE_VIDEO_AD_SUBSCRIPTION_OFFER_CLOSE = new Type("TYPE_VIDEO_AD_SUBSCRIPTION_OFFER_CLOSE", Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE);

        @pmi0("type_video_ad_trial_click")
        public static final Type TYPE_VIDEO_AD_TRIAL_CLICK = new Type("TYPE_VIDEO_AD_TRIAL_CLICK", Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE);

        @pmi0("type_video_info_about_drug_click")
        public static final Type TYPE_VIDEO_INFO_ABOUT_DRUG_CLICK = new Type("TYPE_VIDEO_INFO_ABOUT_DRUG_CLICK", Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE);

        @pmi0("type_video_click_with_active_player")
        public static final Type TYPE_VIDEO_CLICK_WITH_ACTIVE_PLAYER = new Type("TYPE_VIDEO_CLICK_WITH_ACTIVE_PLAYER", 211);

        @pmi0("type_video_additional_actions_click")
        public static final Type TYPE_VIDEO_ADDITIONAL_ACTIONS_CLICK = new Type("TYPE_VIDEO_ADDITIONAL_ACTIONS_CLICK", Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE);

        @pmi0("type_end_video_click")
        public static final Type TYPE_END_VIDEO_CLICK = new Type("TYPE_END_VIDEO_CLICK", Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE);

        @pmi0("type_feed_inline_comment_input_click")
        public static final Type TYPE_FEED_INLINE_COMMENT_INPUT_CLICK = new Type("TYPE_FEED_INLINE_COMMENT_INPUT_CLICK", Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE);

        @pmi0("type_video_album_create_click")
        public static final Type TYPE_VIDEO_ALBUM_CREATE_CLICK = new Type("TYPE_VIDEO_ALBUM_CREATE_CLICK", Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE);

        @pmi0("type_video_album_edit_click")
        public static final Type TYPE_VIDEO_ALBUM_EDIT_CLICK = new Type("TYPE_VIDEO_ALBUM_EDIT_CLICK", Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE);

        @pmi0("type_video_album_editor_cover_click")
        public static final Type TYPE_VIDEO_ALBUM_EDITOR_COVER_CLICK = new Type("TYPE_VIDEO_ALBUM_EDITOR_COVER_CLICK", Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE);

        @pmi0("type_video_album_editor_privacy_click")
        public static final Type TYPE_VIDEO_ALBUM_EDITOR_PRIVACY_CLICK = new Type("TYPE_VIDEO_ALBUM_EDITOR_PRIVACY_CLICK", Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE);

        @pmi0("type_video_add_to_album_click")
        public static final Type TYPE_VIDEO_ADD_TO_ALBUM_CLICK = new Type("TYPE_VIDEO_ADD_TO_ALBUM_CLICK", Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE);

        @pmi0("type_video_share_album_click")
        public static final Type TYPE_VIDEO_SHARE_ALBUM_CLICK = new Type("TYPE_VIDEO_SHARE_ALBUM_CLICK", Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);

        @pmi0("type_video_upload_click")
        public static final Type TYPE_VIDEO_UPLOAD_CLICK = new Type("TYPE_VIDEO_UPLOAD_CLICK", Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE);

        @pmi0("type_video_draft_click")
        public static final Type TYPE_VIDEO_DRAFT_CLICK = new Type("TYPE_VIDEO_DRAFT_CLICK", Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE);

        @pmi0("type_video_change_profile_button_tap")
        public static final Type TYPE_VIDEO_CHANGE_PROFILE_BUTTON_TAP = new Type("TYPE_VIDEO_CHANGE_PROFILE_BUTTON_TAP", Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);

        @pmi0("type_video_upload_cover_click")
        public static final Type TYPE_VIDEO_UPLOAD_COVER_CLICK = new Type("TYPE_VIDEO_UPLOAD_COVER_CLICK", 224);

        @pmi0("type_video_create_channel_click")
        public static final Type TYPE_VIDEO_CREATE_CHANNEL_CLICK = new Type("TYPE_VIDEO_CREATE_CHANNEL_CLICK", Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE);

        @pmi0("type_video_channel_onboarding_click")
        public static final Type TYPE_VIDEO_CHANNEL_ONBOARDING_CLICK = new Type("TYPE_VIDEO_CHANNEL_ONBOARDING_CLICK", Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE);

        @pmi0("type_video_show_full_video_from_clip_button_tap")
        public static final Type TYPE_VIDEO_SHOW_FULL_VIDEO_FROM_CLIP_BUTTON_TAP = new Type("TYPE_VIDEO_SHOW_FULL_VIDEO_FROM_CLIP_BUTTON_TAP", Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE);

        @pmi0("type_im_counter_settings_click")
        public static final Type TYPE_IM_COUNTER_SETTINGS_CLICK = new Type("TYPE_IM_COUNTER_SETTINGS_CLICK", 228);

        @pmi0("type_im_push_notifications_settings_click")
        public static final Type TYPE_IM_PUSH_NOTIFICATIONS_SETTINGS_CLICK = new Type("TYPE_IM_PUSH_NOTIFICATIONS_SETTINGS_CLICK", 229);

        @pmi0("type_feed_post_text_action")
        public static final Type TYPE_FEED_POST_TEXT_ACTION = new Type("TYPE_FEED_POST_TEXT_ACTION", 230);

        @pmi0("type_video_catalog_warmup_click")
        public static final Type TYPE_VIDEO_CATALOG_WARMUP_CLICK = new Type("TYPE_VIDEO_CATALOG_WARMUP_CLICK", 231);

        @pmi0("type_video_child_profile_clicks")
        public static final Type TYPE_VIDEO_CHILD_PROFILE_CLICKS = new Type("TYPE_VIDEO_CHILD_PROFILE_CLICKS", 232);

        @pmi0("type_feed_post_donut_payment_click")
        public static final Type TYPE_FEED_POST_DONUT_PAYMENT_CLICK = new Type("TYPE_FEED_POST_DONUT_PAYMENT_CLICK", 233);

        @pmi0("type_video_quality_change_in_player")
        public static final Type TYPE_VIDEO_QUALITY_CHANGE_IN_PLAYER = new Type("TYPE_VIDEO_QUALITY_CHANGE_IN_PLAYER", 234);

        @pmi0("idfa_permission_screen_click")
        public static final Type IDFA_PERMISSION_SCREEN_CLICK = new Type("IDFA_PERMISSION_SCREEN_CLICK", 235);

        @pmi0("type_audio_ui_click_item")
        public static final Type TYPE_AUDIO_UI_CLICK_ITEM = new Type("TYPE_AUDIO_UI_CLICK_ITEM", 236);

        @pmi0("type_audio_player_ui_click_item")
        public static final Type TYPE_AUDIO_PLAYER_UI_CLICK_ITEM = new Type("TYPE_AUDIO_PLAYER_UI_CLICK_ITEM", 237);

        @pmi0("type_audio_track_menu_ui_click_item")
        public static final Type TYPE_AUDIO_TRACK_MENU_UI_CLICK_ITEM = new Type("TYPE_AUDIO_TRACK_MENU_UI_CLICK_ITEM", 238);

        @pmi0("type_video_topshelf_mute_click")
        public static final Type TYPE_VIDEO_TOPSHELF_MUTE_CLICK = new Type("TYPE_VIDEO_TOPSHELF_MUTE_CLICK", 239);

        @pmi0("type_click_skip_item")
        public static final Type TYPE_CLICK_SKIP_ITEM = new Type("TYPE_CLICK_SKIP_ITEM", PsExtractor.VIDEO_STREAM_MASK);

        @pmi0("type_video_topshelf_click")
        public static final Type TYPE_VIDEO_TOPSHELF_CLICK = new Type("TYPE_VIDEO_TOPSHELF_CLICK", 241);

        @pmi0("type_video_category_block_item_click")
        public static final Type TYPE_VIDEO_CATEGORY_BLOCK_ITEM_CLICK = new Type("TYPE_VIDEO_CATEGORY_BLOCK_ITEM_CLICK", 242);

        @pmi0("type_video_profile_click_link")
        public static final Type TYPE_VIDEO_PROFILE_CLICK_LINK = new Type("TYPE_VIDEO_PROFILE_CLICK_LINK", 243);

        @pmi0("type_video_install_trap_click")
        public static final Type TYPE_VIDEO_INSTALL_TRAP_CLICK = new Type("TYPE_VIDEO_INSTALL_TRAP_CLICK", 244);

        @pmi0("type_feed_post_component_click")
        public static final Type TYPE_FEED_POST_COMPONENT_CLICK = new Type("TYPE_FEED_POST_COMPONENT_CLICK", 245);

        @pmi0("type_video_playlist_add_item_click")
        public static final Type TYPE_VIDEO_PLAYLIST_ADD_ITEM_CLICK = new Type("TYPE_VIDEO_PLAYLIST_ADD_ITEM_CLICK", 246);

        @pmi0("type_video_playlist_add_item_search_click")
        public static final Type TYPE_VIDEO_PLAYLIST_ADD_ITEM_SEARCH_CLICK = new Type("TYPE_VIDEO_PLAYLIST_ADD_ITEM_SEARCH_CLICK", 247);

        @pmi0("type_video_action_at_external_link")
        public static final Type TYPE_VIDEO_ACTION_AT_EXTERNAL_LINK = new Type("TYPE_VIDEO_ACTION_AT_EXTERNAL_LINK", 248);

        @pmi0("type_video_click_toggle_show_channel_links")
        public static final Type TYPE_VIDEO_CLICK_TOGGLE_SHOW_CHANNEL_LINKS = new Type("TYPE_VIDEO_CLICK_TOGGLE_SHOW_CHANNEL_LINKS", 249);

        @pmi0("type_video_movie_page_button_click")
        public static final Type TYPE_VIDEO_MOVIE_PAGE_BUTTON_CLICK = new Type("TYPE_VIDEO_MOVIE_PAGE_BUTTON_CLICK", 250);

        @pmi0("type_video_action_menu_button_click")
        public static final Type TYPE_VIDEO_ACTION_MENU_BUTTON_CLICK = new Type("TYPE_VIDEO_ACTION_MENU_BUTTON_CLICK", 251);

        @pmi0("type_video_subscribtion_button_click")
        public static final Type TYPE_VIDEO_SUBSCRIBTION_BUTTON_CLICK = new Type("TYPE_VIDEO_SUBSCRIBTION_BUTTON_CLICK", 252);

        @pmi0("type_video_open_comments_click")
        public static final Type TYPE_VIDEO_OPEN_COMMENTS_CLICK = new Type("TYPE_VIDEO_OPEN_COMMENTS_CLICK", 253);

        @pmi0("type_voip_share_click")
        public static final Type TYPE_VOIP_SHARE_CLICK = new Type("TYPE_VOIP_SHARE_CLICK", 254);

        @pmi0("type_voip_import_contacts_click")
        public static final Type TYPE_VOIP_IMPORT_CONTACTS_CLICK = new Type("TYPE_VOIP_IMPORT_CONTACTS_CLICK", 255);

        @pmi0("type_voip_sync_contacts_modal_click")
        public static final Type TYPE_VOIP_SYNC_CONTACTS_MODAL_CLICK = new Type("TYPE_VOIP_SYNC_CONTACTS_MODAL_CLICK", 256);

        @pmi0("type_voip_outgoing_call_click")
        public static final Type TYPE_VOIP_OUTGOING_CALL_CLICK = new Type("TYPE_VOIP_OUTGOING_CALL_CLICK", 257);

        @pmi0("type_voip_more_menu_click")
        public static final Type TYPE_VOIP_MORE_MENU_CLICK = new Type("TYPE_VOIP_MORE_MENU_CLICK", 258);

        @pmi0("type_voip_join_call_click")
        public static final Type TYPE_VOIP_JOIN_CALL_CLICK = new Type("TYPE_VOIP_JOIN_CALL_CLICK", 259);

        @pmi0("type_voip_calls_services_click")
        public static final Type TYPE_VOIP_CALLS_SERVICES_CLICK = new Type("TYPE_VOIP_CALLS_SERVICES_CLICK", 260);

        @pmi0("type_overlay_ad_click")
        public static final Type TYPE_OVERLAY_AD_CLICK = new Type("TYPE_OVERLAY_AD_CLICK", 261);

        @pmi0("type_video_add_to_my_videos_click")
        public static final Type TYPE_VIDEO_ADD_TO_MY_VIDEOS_CLICK = new Type("TYPE_VIDEO_ADD_TO_MY_VIDEOS_CLICK", 262);

        @pmi0("type_video_like_click")
        public static final Type TYPE_VIDEO_LIKE_CLICK = new Type("TYPE_VIDEO_LIKE_CLICK", 263);

        @pmi0("type_community_sport_block_video_live_click")
        public static final Type TYPE_COMMUNITY_SPORT_BLOCK_VIDEO_LIVE_CLICK = new Type("TYPE_COMMUNITY_SPORT_BLOCK_VIDEO_LIVE_CLICK", 264);

        @pmi0("type_video_age_mark_click")
        public static final Type TYPE_VIDEO_AGE_MARK_CLICK = new Type("TYPE_VIDEO_AGE_MARK_CLICK", 265);

        @pmi0("type_video_channel_a_plus_tag_click")
        public static final Type TYPE_VIDEO_CHANNEL_A_PLUS_TAG_CLICK = new Type("TYPE_VIDEO_CHANNEL_A_PLUS_TAG_CLICK", 266);

        @pmi0("type_video_content_warning_modal_click")
        public static final Type TYPE_VIDEO_CONTENT_WARNING_MODAL_CLICK = new Type("TYPE_VIDEO_CONTENT_WARNING_MODAL_CLICK", 267);

        @pmi0("type_feed_sdk_ad_click")
        public static final Type TYPE_FEED_SDK_AD_CLICK = new Type("TYPE_FEED_SDK_AD_CLICK", 268);

        @pmi0("type_communities_click")
        public static final Type TYPE_COMMUNITIES_CLICK = new Type("TYPE_COMMUNITIES_CLICK", 269);

        @pmi0("type_delete_item_click")
        public static final Type TYPE_DELETE_ITEM_CLICK = new Type("TYPE_DELETE_ITEM_CLICK", atv0.b);

        @pmi0("type_video_open_description_modal_click")
        public static final Type TYPE_VIDEO_OPEN_DESCRIPTION_MODAL_CLICK = new Type("TYPE_VIDEO_OPEN_DESCRIPTION_MODAL_CLICK", 271);

        @pmi0("type_close_cast_connect_offer_modal")
        public static final Type TYPE_CLOSE_CAST_CONNECT_OFFER_MODAL = new Type("TYPE_CLOSE_CAST_CONNECT_OFFER_MODAL", 272);

        @pmi0("type_voip_share_to_user_click")
        public static final Type TYPE_VOIP_SHARE_TO_USER_CLICK = new Type("TYPE_VOIP_SHARE_TO_USER_CLICK", 273);

        @pmi0("type_voip_service_privacy_message_click")
        public static final Type TYPE_VOIP_SERVICE_PRIVACY_MESSAGE_CLICK = new Type("TYPE_VOIP_SERVICE_PRIVACY_MESSAGE_CLICK", 274);

        @pmi0("type_video_open_playlist_click")
        public static final Type TYPE_VIDEO_OPEN_PLAYLIST_CLICK = new Type("TYPE_VIDEO_OPEN_PLAYLIST_CLICK", 275);

        @pmi0("type_video_open_author_cabinet_click")
        public static final Type TYPE_VIDEO_OPEN_AUTHOR_CABINET_CLICK = new Type("TYPE_VIDEO_OPEN_AUTHOR_CABINET_CLICK", 276);

        @pmi0("type_video_playlist_change_order")
        public static final Type TYPE_VIDEO_PLAYLIST_CHANGE_ORDER = new Type("TYPE_VIDEO_PLAYLIST_CHANGE_ORDER", 277);

        @pmi0("type_channel_item")
        public static final Type TYPE_CHANNEL_ITEM = new Type("TYPE_CHANNEL_ITEM", 278);

        @pmi0("type_video_filter_block_click")
        public static final Type TYPE_VIDEO_FILTER_BLOCK_CLICK = new Type("TYPE_VIDEO_FILTER_BLOCK_CLICK", 279);

        @pmi0("type_open_profile_click")
        public static final Type TYPE_OPEN_PROFILE_CLICK = new Type("TYPE_OPEN_PROFILE_CLICK", 280);

        @pmi0("type_profile_friend_add_click")
        public static final Type TYPE_PROFILE_FRIEND_ADD_CLICK = new Type("TYPE_PROFILE_FRIEND_ADD_CLICK", 281);

        @pmi0("type_profile_friend_confirm_click")
        public static final Type TYPE_PROFILE_FRIEND_CONFIRM_CLICK = new Type("TYPE_PROFILE_FRIEND_CONFIRM_CLICK", 282);

        @pmi0("type_video_modal_episode_open_click")
        public static final Type TYPE_VIDEO_MODAL_EPISODE_OPEN_CLICK = new Type("TYPE_VIDEO_MODAL_EPISODE_OPEN_CLICK", 283);

        @pmi0("type_click_to_author_community")
        public static final Type TYPE_CLICK_TO_AUTHOR_COMMUNITY = new Type("TYPE_CLICK_TO_AUTHOR_COMMUNITY", 284);

        @pmi0("type_video_report_button_click")
        public static final Type TYPE_VIDEO_REPORT_BUTTON_CLICK = new Type("TYPE_VIDEO_REPORT_BUTTON_CLICK", 285);

        @pmi0("type_community_screen_load_retry_click")
        public static final Type TYPE_COMMUNITY_SCREEN_LOAD_RETRY_CLICK = new Type("TYPE_COMMUNITY_SCREEN_LOAD_RETRY_CLICK", 286);

        @pmi0("type_community_screen_tab_load_retry_click")
        public static final Type TYPE_COMMUNITY_SCREEN_TAB_LOAD_RETRY_CLICK = new Type("TYPE_COMMUNITY_SCREEN_TAB_LOAD_RETRY_CLICK", MBSupportMuteAdType.INTERSTITIAL_VIDEO);

        @pmi0("type_video_tab_block_click")
        public static final Type TYPE_VIDEO_TAB_BLOCK_CLICK = new Type("TYPE_VIDEO_TAB_BLOCK_CLICK", 288);

        @pmi0("type_video_offline_snackbar_click")
        public static final Type TYPE_VIDEO_OFFLINE_SNACKBAR_CLICK = new Type("TYPE_VIDEO_OFFLINE_SNACKBAR_CLICK", 289);

        @pmi0("type_video_sort_comments_click")
        public static final Type TYPE_VIDEO_SORT_COMMENTS_CLICK = new Type("TYPE_VIDEO_SORT_COMMENTS_CLICK", 290);

        @pmi0("type_video_landing_tv_install_click")
        public static final Type TYPE_VIDEO_LANDING_TV_INSTALL_CLICK = new Type("TYPE_VIDEO_LANDING_TV_INSTALL_CLICK", 291);

        @pmi0("type_similar_channels_card_click")
        public static final Type TYPE_SIMILAR_CHANNELS_CARD_CLICK = new Type("TYPE_SIMILAR_CHANNELS_CARD_CLICK", 292);

        @pmi0("type_similar_channels_subscription_click")
        public static final Type TYPE_SIMILAR_CHANNELS_SUBSCRIPTION_CLICK = new Type("TYPE_SIMILAR_CHANNELS_SUBSCRIPTION_CLICK", 293);

        @pmi0("type_dzen_block_article_click")
        public static final Type TYPE_DZEN_BLOCK_ARTICLE_CLICK = new Type("TYPE_DZEN_BLOCK_ARTICLE_CLICK", 294);

        @pmi0("type_overlay_live_product_card_click")
        public static final Type TYPE_OVERLAY_LIVE_PRODUCT_CARD_CLICK = new Type("TYPE_OVERLAY_LIVE_PRODUCT_CARD_CLICK", 295);

        @pmi0("type_overlay_live_product_close_click")
        public static final Type TYPE_OVERLAY_LIVE_PRODUCT_CLOSE_CLICK = new Type("TYPE_OVERLAY_LIVE_PRODUCT_CLOSE_CLICK", 296);

        @pmi0("type_superapp_vkvideo_banner")
        public static final Type TYPE_SUPERAPP_VKVIDEO_BANNER = new Type("TYPE_SUPERAPP_VKVIDEO_BANNER", 297);

        @pmi0("type_install_vkvideo_modal")
        public static final Type TYPE_INSTALL_VKVIDEO_MODAL = new Type("TYPE_INSTALL_VKVIDEO_MODAL", 298);

        @pmi0("type_video_assistant_chat_open_click")
        public static final Type TYPE_VIDEO_ASSISTANT_CHAT_OPEN_CLICK = new Type("TYPE_VIDEO_ASSISTANT_CHAT_OPEN_CLICK", 299);

        @pmi0("type_video_assistant_chat_close_click")
        public static final Type TYPE_VIDEO_ASSISTANT_CHAT_CLOSE_CLICK = new Type("TYPE_VIDEO_ASSISTANT_CHAT_CLOSE_CLICK", 300);

        @pmi0("type_video_assistant_message_send_click")
        public static final Type TYPE_VIDEO_ASSISTANT_MESSAGE_SEND_CLICK = new Type("TYPE_VIDEO_ASSISTANT_MESSAGE_SEND_CLICK", 301);

        @pmi0("type_video_assistant_message_set_like_click")
        public static final Type TYPE_VIDEO_ASSISTANT_MESSAGE_SET_LIKE_CLICK = new Type("TYPE_VIDEO_ASSISTANT_MESSAGE_SET_LIKE_CLICK", 302);

        @pmi0("type_video_assistant_message_unset_like_click")
        public static final Type TYPE_VIDEO_ASSISTANT_MESSAGE_UNSET_LIKE_CLICK = new Type("TYPE_VIDEO_ASSISTANT_MESSAGE_UNSET_LIKE_CLICK", Http.StatusCode.SEE_OTHER);

        @pmi0("type_video_assistant_message_set_dislike_click")
        public static final Type TYPE_VIDEO_ASSISTANT_MESSAGE_SET_DISLIKE_CLICK = new Type("TYPE_VIDEO_ASSISTANT_MESSAGE_SET_DISLIKE_CLICK", Sdk.SDKError.Reason.AD_EXPIRED_VALUE);

        @pmi0("type_video_assistant_message_unset_dislike_click")
        public static final Type TYPE_VIDEO_ASSISTANT_MESSAGE_UNSET_DISLIKE_CLICK = new Type("TYPE_VIDEO_ASSISTANT_MESSAGE_UNSET_DISLIKE_CLICK", Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE);

        @pmi0("type_video_assistant_feedback_send_click")
        public static final Type TYPE_VIDEO_ASSISTANT_FEEDBACK_SEND_CLICK = new Type("TYPE_VIDEO_ASSISTANT_FEEDBACK_SEND_CLICK", 306);

        @pmi0("type_video_assistant_playlist_add_click")
        public static final Type TYPE_VIDEO_ASSISTANT_PLAYLIST_ADD_CLICK = new Type("TYPE_VIDEO_ASSISTANT_PLAYLIST_ADD_CLICK", 307);

        @pmi0("type_video_assistant_playlist_open_click")
        public static final Type TYPE_VIDEO_ASSISTANT_PLAYLIST_OPEN_CLICK = new Type("TYPE_VIDEO_ASSISTANT_PLAYLIST_OPEN_CLICK", Sdk.SDKError.Reason.AD_WIN_NOTIFICATION_ERROR_VALUE);

        @pmi0("type_open_in_vkvideo_banner_click")
        public static final Type TYPE_OPEN_IN_VKVIDEO_BANNER_CLICK = new Type("TYPE_OPEN_IN_VKVIDEO_BANNER_CLICK", Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE);

        @pmi0("type_open_in_vkvideo_bottom_banner_click")
        public static final Type TYPE_OPEN_IN_VKVIDEO_BOTTOM_BANNER_CLICK = new Type("TYPE_OPEN_IN_VKVIDEO_BOTTOM_BANNER_CLICK", Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE);

        @pmi0("type_install_vkvideo_modal_close")
        public static final Type TYPE_INSTALL_VKVIDEO_MODAL_CLOSE = new Type("TYPE_INSTALL_VKVIDEO_MODAL_CLOSE", Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE);

        @pmi0("type_video_assistant_video_open_click")
        public static final Type TYPE_VIDEO_ASSISTANT_VIDEO_OPEN_CLICK = new Type("TYPE_VIDEO_ASSISTANT_VIDEO_OPEN_CLICK", Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE);

        @pmi0("type_video_assistant_delete_click")
        public static final Type TYPE_VIDEO_ASSISTANT_DELETE_CLICK = new Type("TYPE_VIDEO_ASSISTANT_DELETE_CLICK", Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE);

        @pmi0("type_video_assistant_chats_list_click")
        public static final Type TYPE_VIDEO_ASSISTANT_CHATS_LIST_CLICK = new Type("TYPE_VIDEO_ASSISTANT_CHATS_LIST_CLICK", Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE);

        @pmi0("type_video_assistant_chats_list_menu_click")
        public static final Type TYPE_VIDEO_ASSISTANT_CHATS_LIST_MENU_CLICK = new Type("TYPE_VIDEO_ASSISTANT_CHATS_LIST_MENU_CLICK", Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE);

        @pmi0("type_video_assistant_playlist_toast_open_click")
        public static final Type TYPE_VIDEO_ASSISTANT_PLAYLIST_TOAST_OPEN_CLICK = new Type("TYPE_VIDEO_ASSISTANT_PLAYLIST_TOAST_OPEN_CLICK", Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE);

        static {
            Type[] h = h();
            $VALUES = h;
            $ENTRIES = e370.d(h);
        }

        private Type(String str, int i) {
        }

        public static final /* synthetic */ Type[] h() {
            return new Type[]{TYPE_AUDIO_TAP_GOTO_EVENT_ITEM, TYPE_AUDIO_TAP_EQUALIZER_EVENT_ITEM, TYPE_AUDIO_TAP_POPUP_EVENT_ITEM, TYPE_AUDIO_TAP_SETTINGS_EVENT_ITEM, TYPE_FEED_POSTING_SNIPPET_EDIT_ITEM, TYPE_NAVIGATION_TAB_CLICK, TYPE_IM_ITEM, TYPE_MARKET_ITEM, TYPE_MARKET_MARKETPLACE_ITEM, TYPE_SUPERAPP_SCREEN_ITEM, TYPE_MINI_APP_ITEM, TYPE_VIDEO_CARD_EVENT, TYPE_CLICK_ITEM, TYPE_CLICK_PREFERENCE_ITEM, TYPE_CLICK_PREFERENCE_WITH_VALUE_ITEM, TYPE_CLICK_PREFERENCE_VALUE_ITEM, TYPE_CATALOG_BANNER_EVENT_ITEM, TYPE_UI_HINT_ITEM, TYPE_CLIP_VIEWER_ITEM, TYPE_VIDEO_PLAYER_BUTTON_CLICK, TYPE_VIDEO_PLAYER_CAST_CLICK, TYPE_VIDEO_PLAYER_SEEK_CLICK, TYPE_VIDEO_TO_CLIP_ATTACH, TYPE_CLIPS_GRID_ITEM, TYPE_AUDIO_ARTIST_CLICK_ITEM, TYPE_CLIP_IN_FEED_OVERLAY_CLICK_ITEM, TYPE_SUPERAPP_SETTINGS_ITEM, TYPE_MARUSIA_CONVERSATION_ITEM, TYPE_MARUSIA_READING_ITEM, TYPE_VIDEO_PIP_ITEM, TYPE_VIDEO_MINIPLAYER_ITEM, TYPE_VIDEO_DOWNLOAD_ITEM, TYPE_VIDEO_NOT_INTERESTING, TYPE_VIDEO_DO_NOT_RECOMMEND_AUTHOR, TYPE_VIDEO_TV_PROGRAM, TYPE_VIDEO_WATCH_LATER, TYPE_VIDEO_BACKGROUND_LISTENING_ITEM, TYPE_CLASSIFIEDS_CLICK, TYPE_ALIEXPRESS_CLICK, TYPE_MARKET_CAROUSEL_CLICK, TYPE_FEED_CLICK_TO_SHOPS_MORE_BUTTON, TYPE_MARKET_CLICK, TYPE_SEARCH_CLICK_ITEM, TYPE_SEARCH_LOCAL_CLICK_ITEM, TYPE_MESSAGING_CONTACT_RECOMMENDATIONS_ITEM, TYPE_IM_CONVERSATION_CLICK_ITEM, TYPE_MESSAGING_SYNC_CONTACTS_CLICK_ITEM, TYPE_IM_SHARE_FROM_CHAT_PROFILE_CLICK_ITEM, TYPE_IM_GO_ARCHIVE_CLICK_ITEM, TYPE_IM_PINNED_MESSAGE_CLICK_ITEM, TYPE_IM_PHONE_NUMBER_CALL_CLICK_ITEM, TYPE_IM_GO_TO_PROFILE_CLICK_ITEM, TYPE_IM_CHAT_ITEM, TYPE_PROFILE_ACTION_BUTTON_ITEM, TYPE_SHARE_ITEM, TYPE_SHARING_LINK_OPEN, TYPE_QUESTION_ITEM, TYPE_BADGES_ITEM, TYPE_WISHLIST_ITEM, TYPE_OWNER_BUTTON_APP_CLICK, TYPE_GAMES_CATALOG_CLICK, TYPE_VIDEO_CARD_LONGTAP, TYPE_SOFT_UPDATE_CLICK, TYPE_FRIEND_ENTRYPOINT_BLOCK_ITEM, TYPE_SUPERAPP_ONBOARDING_CLICK_ITEM, TYPE_PHOTO_EDITOR_ITEM, TYPE_PROFILE_ITEM, TYPE_COMMUNITY_CHANNEL_ITEM_CLICK, TYPE_GROUPS_EVENT_ITEM, TYPE_STICKERS_CLICK_ITEM, TYPE_RATING_CLICK, TYPE_CALLS_ITEM, TYPE_ADMIN_TIPS_CLICK, TYPE_NFT_ITEM, TYPE_FEED_MEDIA_DISCOVER_ITEM, TYPE_FEED_MEDIA_DISCOVER_BLOCK, TYPE_FEED_OPEN_SIMILAR_POSTS, TYPE_FEED_OPEN_COMMENTS_MODAL, TYPE_FEED_OPEN_REACTIONS_MODAL, TYPE_FEED_START_FAST_CHAT, TYPE_FEED_COMMENT_THREAD_BUTTON_SHOW_MORE, TYPE_FEED_COMMUNITY_MEDIA_ITEM, TYPE_FEED_INTERACTION_ITEM, TYPE_FEED_ITEM_MENU_ACTION, TYPE_FEED_OPEN_ITEM, TYPE_PHOTO_SAVE_TO_ALBUM_MENU_ITEM, TYPE_PHOTO_SHARE_TO_MESSAGE_ITEM, TYPE_OBSCENE_WORD, TYPE_REVEAL_OBSCENE_WORDS, TYPE_BADGES_SCREEN_ITEM, TYPE_DZEN_ARTICLE_ITEM, TYPE_DZEN_STORY_CLICK, TYPE_DZEN_STORY_ITEM_CLICK, TYPE_DZEN_SHOW_MORE_CLICK, TYPE_HIDDEN_SOURCE_OPEN_PROFILE, TYPE_HIDDEN_SOURCE_UNBAN_BUTTON, TYPE_HIDDEN_SOURCE_UNBAN_CANCEL_BUTTON, TYPE_COMMUNITY_ONBOARDING_CLICK, TYPE_FOLLOWERS_MODE_ONBOARDING_CLICK, TYPE_FOLLOWERS_MODE_SWITCH_STATE, TYPE_FEED_CAROUSEL_LONGTAP, TYPE_FEED_CAROUSEL_LONGTAP_SCROLL, TYPE_FEED_CAROUSEL_ONBOARDING_SCROLL, TYPE_POSTING_ITEM, TYPE_MARKET_ITEM_REVIEW_CLICK, TYPE_MINI_APP_POLICY_ITEM, TYPE_MINI_APP_PERMISSION_BOX_ITEM, TYPE_COMMUNITY_REVIEW_CLICK, TYPE_PHOTOS_ITEM, TYPE_OPEN_QUALITY_INDEX_SETTINGS, TYPE_AUDIO_POPUP_ITEM, TYPE_UGC_STICKERS_ITEM, TYPE_BANNER_CLICK, TYPE_VIDEO_IN_APP_REVIEW_CLICK, TYPE_SYSTEM_PUSH_CLICK, TYPE_AUTOPLAY_TURN_CLICK, TYPE_ECOMM_CLICK, TYPE_VIDEO_AUTHOR_FILTER_CLICK, TYPE_VIDEO_KIDS_MODE_CLICK, TYPE_VIDEO_PLAYLIST_SHOW_ALL_CLICK, TYPE_VIDEO_CATALOG_BUTTON_EXTENDED_CLICK, TYPE_VIDEO_CATALOG_BLOCK_ITEM_CLICK, TYPE_VIDEO_SUGGEST_DOWNLOADS_CLICK, TYPE_VIDEO_DESCRIPTION_CLICK, TYPE_VIDEO_DOWNLOAD_CLICK, TYPE_VIDEO_RESTRICTION_CLICK_ITEM, TYPE_VIDEO_COMMENT_CLICK, TYPE_VIDEO_SCREEN_COMMENT_CLICK, TYPE_VIDEO_COMMENTS_SORT_TAB_CLICK, TYPE_VIDEO_DISCOVERY_LOGO_CLICK, TYPE_VIDEO_PUSHES_AD_CLICK, TYPE_VIDEO_STOP_RECOMMENDING_CREATOR, TYPE_VIDEO_UNDO_STOP_RECOMMENDING_CREATOR, TYPE_SNOWBALL_EVENTS, TYPE_MINI_APP_SNOWBALL_MODAL_ACTION, TYPE_VIDEO_OPEN_FULLSCREEN_WITH_SWIPE, TYPE_VIDEO_ATTACH_SHORT_VIDEO, TYPE_CLICK_SECURE_LOCK_SETTINGS_ITEM, TYPE_FEED_COMMENTS_SORT_TAB_CLICK, TYPE_LEGAL_NOTICE_CLICK, TYPE_VIDEO_CREATE_CLIP, TYPE_COMMUNITY_TAB_ITEM_CLICK, TYPE_DONUT_GOAL_CLICK_ITEM, TYPE_COMMUNITIES_DONUT_CLICK, TYPE_DONUT_BANNER_CLICK, TYPE_DONUT_SUPPORT_AUTHOR_CLICK, TYPE_VIDEO_DIRECT_URL_START_ITEM, TYPE_PROMO_CLICK_ITEM, TYPE_ONBOARDING_EVENT, TYPE_NOTIFICATION_ITEM_CLICK, TYPE_FEED_OPEN_USER_CLICK, TYPE_FEED_OPEN_GROUP_CLICK, TYPE_FEED_OPEN_REPOSTED_ITEM_USER_CLICK, TYPE_FEED_OPEN_REPOSTED_ITEM_GROUP_CLICK, TYPE_FEED_OPEN_STORY_CLICK, TYPE_FEED_FOLLOW_CLICK, TYPE_FEED_HIDE_PRODUCT_PIN_CLICK, TYPE_FEED_HIDE_TICKET_ITEM_PIN, TYPE_FEED_OPEN_MARKET_ITEM_CLICK, TYPE_FEED_TICKET_ITEM_CLICK, TYPE_FEED_SHOW_PRODUCTS_MODAL_CARD_CLICK, TYPE_FEED_UNFOLLOW_CLICK, TYPE_FEED_POST_EXPAND_TEXT, TYPE_FEED_POST_COLLAPSE_TEXT, TYPE_MODAL_SHARING_OPEN, TYPE_MODAL_SHARING_CLICK, TYPE_MODAL_SHARING_CLOSE, TYPE_VIDEO_MODAL_SHARING_CLICK, TYPE_TV_KID_MODE_ITEM, TYPE_OPEN_COMMUNITY_CHATS, TYPE_FEED_POST_UNMUTE_AUDIO, TYPE_FEED_POST_MUTE_AUDIO, TYPE_FEED_POST_PAUSE_AUDIO, TYPE_FEED_POST_OPEN_AUDIO, TYPE_FEED_POST_ADDED_AUDIO, TYPE_FEED_POST_REMOVED_AUDIO, TYPE_FEED_POST_OPEN_PLAYLIST, TYPE_FEED_POST_ADDED_PLAYLIST, TYPE_FEED_POST_REMOVED_PLAYLIST, TYPE_FEED_COOWNERS_EVENT, TYPE_FEED_VIEW_AUTHORS, TYPE_FEED_VIEW_REPOSTED_ITEM_AUTHORS, VIDEO_CARD_LONGTAP, TYPE_ACTION_BUTTON_CLICK, TYPE_VIDEO_KIDS_AGE_FILTER_BUTTON_TAP, TYPE_TV_QR_MODAL_ACTION, TYPE_MOVE_YOUTUBE_SUBS_ONBOARDING_ITEM, TYPE_MOVE_YOUTUBE_SUBS_CLICK_ITEM, TYPE_SELECT_CREATORS_CLICK_ITEM, TYPE_SELECT_CREATORS_SCREEN_CONFIRM_CLICK, TYPE_CREATOR_HIDE_UNDO_HIDE_CLICK, TYPE_SKIP_VIDEO_BUTTON_CLICK, TYPE_NEXT_VIDEO_ANNOUNCEMENT_CLICK, TYPE_VIDEO_POSTPONED_PUBLICATION_CLICK, TYPE_VIDEO_UPLOAD_OPTION_CLICK, TYPE_VIDEO_UPLOAD_PRIVACY_CLICK, TYPE_VIDEO_UPLOAD_ADDITIONAL_OPTION_CLICK, TYPE_VIDEO_CREATE_PLAYLIST_CLICK, TYPE_VIDEO_NEXT_PREV_VIDEO_BUTTON_TAP, TYPE_VIDEO_TOGGLE_FULLSCREEN, TYPE_VIDEO_MUSIC_TRACK_ADD, TYPE_VIDEO_MUSIC_TRACK_DELETE, TYPE_VIDEO_MUSIC_TRACK_CARD_CONTINUE_WATCH, TYPE_VIDEO_MUSIC_TRACK_CARD_OPEN_PLAYLIST, TYPE_VIDEO_MUSIC_TRACK_CARD_SIMILAR_MUSIC_CLICK, TYPE_VIDEO_PLAYER_MUSIC_TRACK_CLICK, TYPE_VIDEO_MUSIC_STREAM_MIX_WATCH_CLICK, TYPE_VIDEO_AD_SUBSCRIPTION_OFFER_CLICK, TYPE_VIDEO_AD_SUBSCRIPTION_OFFER_CLOSE, TYPE_VIDEO_AD_TRIAL_CLICK, TYPE_VIDEO_INFO_ABOUT_DRUG_CLICK, TYPE_VIDEO_CLICK_WITH_ACTIVE_PLAYER, TYPE_VIDEO_ADDITIONAL_ACTIONS_CLICK, TYPE_END_VIDEO_CLICK, TYPE_FEED_INLINE_COMMENT_INPUT_CLICK, TYPE_VIDEO_ALBUM_CREATE_CLICK, TYPE_VIDEO_ALBUM_EDIT_CLICK, TYPE_VIDEO_ALBUM_EDITOR_COVER_CLICK, TYPE_VIDEO_ALBUM_EDITOR_PRIVACY_CLICK, TYPE_VIDEO_ADD_TO_ALBUM_CLICK, TYPE_VIDEO_SHARE_ALBUM_CLICK, TYPE_VIDEO_UPLOAD_CLICK, TYPE_VIDEO_DRAFT_CLICK, TYPE_VIDEO_CHANGE_PROFILE_BUTTON_TAP, TYPE_VIDEO_UPLOAD_COVER_CLICK, TYPE_VIDEO_CREATE_CHANNEL_CLICK, TYPE_VIDEO_CHANNEL_ONBOARDING_CLICK, TYPE_VIDEO_SHOW_FULL_VIDEO_FROM_CLIP_BUTTON_TAP, TYPE_IM_COUNTER_SETTINGS_CLICK, TYPE_IM_PUSH_NOTIFICATIONS_SETTINGS_CLICK, TYPE_FEED_POST_TEXT_ACTION, TYPE_VIDEO_CATALOG_WARMUP_CLICK, TYPE_VIDEO_CHILD_PROFILE_CLICKS, TYPE_FEED_POST_DONUT_PAYMENT_CLICK, TYPE_VIDEO_QUALITY_CHANGE_IN_PLAYER, IDFA_PERMISSION_SCREEN_CLICK, TYPE_AUDIO_UI_CLICK_ITEM, TYPE_AUDIO_PLAYER_UI_CLICK_ITEM, TYPE_AUDIO_TRACK_MENU_UI_CLICK_ITEM, TYPE_VIDEO_TOPSHELF_MUTE_CLICK, TYPE_CLICK_SKIP_ITEM, TYPE_VIDEO_TOPSHELF_CLICK, TYPE_VIDEO_CATEGORY_BLOCK_ITEM_CLICK, TYPE_VIDEO_PROFILE_CLICK_LINK, TYPE_VIDEO_INSTALL_TRAP_CLICK, TYPE_FEED_POST_COMPONENT_CLICK, TYPE_VIDEO_PLAYLIST_ADD_ITEM_CLICK, TYPE_VIDEO_PLAYLIST_ADD_ITEM_SEARCH_CLICK, TYPE_VIDEO_ACTION_AT_EXTERNAL_LINK, TYPE_VIDEO_CLICK_TOGGLE_SHOW_CHANNEL_LINKS, TYPE_VIDEO_MOVIE_PAGE_BUTTON_CLICK, TYPE_VIDEO_ACTION_MENU_BUTTON_CLICK, TYPE_VIDEO_SUBSCRIBTION_BUTTON_CLICK, TYPE_VIDEO_OPEN_COMMENTS_CLICK, TYPE_VOIP_SHARE_CLICK, TYPE_VOIP_IMPORT_CONTACTS_CLICK, TYPE_VOIP_SYNC_CONTACTS_MODAL_CLICK, TYPE_VOIP_OUTGOING_CALL_CLICK, TYPE_VOIP_MORE_MENU_CLICK, TYPE_VOIP_JOIN_CALL_CLICK, TYPE_VOIP_CALLS_SERVICES_CLICK, TYPE_OVERLAY_AD_CLICK, TYPE_VIDEO_ADD_TO_MY_VIDEOS_CLICK, TYPE_VIDEO_LIKE_CLICK, TYPE_COMMUNITY_SPORT_BLOCK_VIDEO_LIVE_CLICK, TYPE_VIDEO_AGE_MARK_CLICK, TYPE_VIDEO_CHANNEL_A_PLUS_TAG_CLICK, TYPE_VIDEO_CONTENT_WARNING_MODAL_CLICK, TYPE_FEED_SDK_AD_CLICK, TYPE_COMMUNITIES_CLICK, TYPE_DELETE_ITEM_CLICK, TYPE_VIDEO_OPEN_DESCRIPTION_MODAL_CLICK, TYPE_CLOSE_CAST_CONNECT_OFFER_MODAL, TYPE_VOIP_SHARE_TO_USER_CLICK, TYPE_VOIP_SERVICE_PRIVACY_MESSAGE_CLICK, TYPE_VIDEO_OPEN_PLAYLIST_CLICK, TYPE_VIDEO_OPEN_AUTHOR_CABINET_CLICK, TYPE_VIDEO_PLAYLIST_CHANGE_ORDER, TYPE_CHANNEL_ITEM, TYPE_VIDEO_FILTER_BLOCK_CLICK, TYPE_OPEN_PROFILE_CLICK, TYPE_PROFILE_FRIEND_ADD_CLICK, TYPE_PROFILE_FRIEND_CONFIRM_CLICK, TYPE_VIDEO_MODAL_EPISODE_OPEN_CLICK, TYPE_CLICK_TO_AUTHOR_COMMUNITY, TYPE_VIDEO_REPORT_BUTTON_CLICK, TYPE_COMMUNITY_SCREEN_LOAD_RETRY_CLICK, TYPE_COMMUNITY_SCREEN_TAB_LOAD_RETRY_CLICK, TYPE_VIDEO_TAB_BLOCK_CLICK, TYPE_VIDEO_OFFLINE_SNACKBAR_CLICK, TYPE_VIDEO_SORT_COMMENTS_CLICK, TYPE_VIDEO_LANDING_TV_INSTALL_CLICK, TYPE_SIMILAR_CHANNELS_CARD_CLICK, TYPE_SIMILAR_CHANNELS_SUBSCRIPTION_CLICK, TYPE_DZEN_BLOCK_ARTICLE_CLICK, TYPE_OVERLAY_LIVE_PRODUCT_CARD_CLICK, TYPE_OVERLAY_LIVE_PRODUCT_CLOSE_CLICK, TYPE_SUPERAPP_VKVIDEO_BANNER, TYPE_INSTALL_VKVIDEO_MODAL, TYPE_VIDEO_ASSISTANT_CHAT_OPEN_CLICK, TYPE_VIDEO_ASSISTANT_CHAT_CLOSE_CLICK, TYPE_VIDEO_ASSISTANT_MESSAGE_SEND_CLICK, TYPE_VIDEO_ASSISTANT_MESSAGE_SET_LIKE_CLICK, TYPE_VIDEO_ASSISTANT_MESSAGE_UNSET_LIKE_CLICK, TYPE_VIDEO_ASSISTANT_MESSAGE_SET_DISLIKE_CLICK, TYPE_VIDEO_ASSISTANT_MESSAGE_UNSET_DISLIKE_CLICK, TYPE_VIDEO_ASSISTANT_FEEDBACK_SEND_CLICK, TYPE_VIDEO_ASSISTANT_PLAYLIST_ADD_CLICK, TYPE_VIDEO_ASSISTANT_PLAYLIST_OPEN_CLICK, TYPE_OPEN_IN_VKVIDEO_BANNER_CLICK, TYPE_OPEN_IN_VKVIDEO_BOTTOM_BANNER_CLICK, TYPE_INSTALL_VKVIDEO_MODAL_CLOSE, TYPE_VIDEO_ASSISTANT_VIDEO_OPEN_CLICK, TYPE_VIDEO_ASSISTANT_DELETE_CLICK, TYPE_VIDEO_ASSISTANT_CHATS_LIST_CLICK, TYPE_VIDEO_ASSISTANT_CHATS_LIST_MENU_CLICK, TYPE_VIDEO_ASSISTANT_PLAYLIST_TOAST_OPEN_CLICK};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: SchemeStat.kt */
    public static final class a {
        public static SchemeStat$TypeClick a(SchemeStat$EventItem schemeStat$EventItem, Integer num, b bVar) {
            if (bVar != null) {
                SchemeStat$TypeClick c = c(schemeStat$EventItem, num, bVar);
                if (c != null) {
                    return c;
                }
                SchemeStat$TypeClick d = d(schemeStat$EventItem, num, bVar);
                if (d != null) {
                    return d;
                }
                throw new IllegalArgumentException("payload must be one of(TypeAudioTapGotoEventItem, TypeAudioTapEqualizerEventItem, TypeAudioTapPopupEventItem, TypeAudioTapSettingsEventItem, TypeFeedPostingSnippetEditItem, TypeNavigationTabClick, TypeImItem, TypeMarketItem, TypeMarketMarketplaceItem, TypeSuperappScreenItem, TypeMiniAppItem, TypeVideoCardEvent, TypeClickItem, TypeClickPreferenceItem, TypeClickPreferenceWithValueItem, TypeClickPreferenceValueItem, TypeUiHintItem, TypeClipViewerItem, TypeVideoPlayerButtonClick, TypeVideoPlayerCastClick, TypeVideoPlayerSeekClick, TypeVideoToClipAttach, TypeClipsGridItem, TypeAudioArtistClickItem, TypeClipInFeedOverlayClickItem, TypeSuperappSettingsItem, TypeConversationItem, TypeReadingItem, TypeVideoPipItem, TypeVideoMiniplayerItem, TypeVideoDownloadItem, TypeVideoNotInteresting, TypeVideoDoNotRecommendAuthor, TypeVideoTvProgram, TypeVideoWatchLater, TypeVideoBackgroundListeningItem, TypeClassifiedsClick, TypeAliexpressClick, TypeMarketCarouselClick, TypeFeedClickToShopsMoreButton, TypeMarketClick, TypeSearchClickItem, TypeSearchLocalClickItem, TypeMessagingContactRecommendationsItem, TypeImConversationClickItem, TypeMessagingSyncContactsClickItem, TypeImShareFromChatProfileClickItem, TypeImGoArchiveClickItem, TypeImPinnedMessageClickItem, TypeImPhoneNumberCallClickItem, TypeImGoToProfileClickItem, TypeImChatItem, TypeProfileActionButtonItem, TypeShareItem, TypeSharingLinkOpen, TypeQuestionItem, TypeBadgesItem, TypeWishlistItem, TypeOwnerButtonAppClick, TypeGamesCatalogClick, TypeVideoCardLongtap, TypeSoftUpdateClick, TypeFriendEntrypointBlockItem, TypeSuperappOnboardingClickItem, TypePhotoEditorItem, TypeProfileItem, TypeChannelItemClick, TypeGroupsEventItem, TypeStickersClickItem, TypeRatingClick, TypeCallsItem, TypeAdminTipsClick, TypeNftItem, TypeFeedMediaDiscoverItem, TypeFeedMediaDiscoverBlock, TypeFeedOpenSimilarPosts, TypeFeedOpenCommentsModal, TypeFeedOpenReactionsModal, TypeFeedStartFastChat, TypeFeedCommentThreadButtonShowMore, TypeFeedCommunityMediaItem, TypeFeedInteractionItem, TypeFeedItemMenuAction, TypeFeedOpenItem, TypePhotoSaveToAlbumMenuItem, TypePhotoShareToMessageItem, TypeObsceneWord, TypeRevealObsceneWords, TypeBadgesScreenItem, TypeDzenArticleItem, TypeDzenStoryClick, TypeDzenStoryItemClick, TypeDzenShowMoreClick, TypeHiddenSourceOpenProfile, TypeHiddenSourceUnbanButton, TypeHiddenSourceUnbanCancelButton, TypeCommunityOnboardingClick, FollowersModeOnboardingClick, FollowersModeSwitchState, TypeFeedCarouselLongtap, TypeFeedCarouselLongtapScroll, TypeFeedCarouselOnboardingScroll, TypePostingItem, TypeMarketItemReviewClick, TypeMiniAppPolicyItem, TypeMiniAppPermissionBoxItem, TypeCommunityReviewClick, TypePhotosItem, TypeOpenQualityIndexSettings, TypeAudioPopupItem, TypeUgcStickersItem, TypeBannerClick, TypeVideoInAppReviewClick, TypeSystemPushClick, TypeAutoplayTurnClick, TypeEcommClickItem, TypeVideoAuthorFilterClick, TypeVideoKidsModeClick, TypeVideoPlaylistShowAllClick, TypeVideoCatalogButtonExtendedClick, TypeVideoCatalogBlockItemClick, TypeVideoSuggestDownloadsClick, TypeVideoDescriptionClick, TypeVideoDownloadClick, TypeVideoRestrictionClickItem, TypeVideoCommentClick, TypeVideoScreenCommentClick, TypeVideoCommentsSortTabClick, TypeVideoDiscoveryLogoClick, TypeVideoPushesAdClick, TypeVideoStopRecommendingCreator, TypeVideoUndoStopRecommendingCreator, TypeSnowballEvents, TypeMiniAppSnowballModalAction, TypeVideoOpenFullscreenWithSwipe, TypeVideoAttachShortVideo, TypeClickSecureLockSettingsItem, TypeFeedCommentsSortTabClick, TypeLegalNoticeClick, TypeVideoCreateClip, TypeTabItemClick, TypeDonutGoal, TypeDonutClick, TypeDonutBanner, TypeDonutSupportAuthor, TypeVideoDirectUrlStartItem, TypePromoClickItem, TypeOnboardingEvent, TypeNotificationItemClick, TypeFeedOpenUserClick, TypeFeedOpenGroupClick, TypeFeedOpenRepostedItemUserClick, TypeFeedOpenRepostedItemGroupClick, TypeFeedOpenStoryClick, TypeFeedFollowClick, TypeFeedHideProductPinClick, TypeFeedHideTicketItemPin, TypeFeedOpenMarketItemClick, TypeFeedTicketItemClick, TypeFeedShowProductsModalCardClick, TypeFeedUnfollowClick, TypeFeedPostExpandText, TypeFeedPostCollapseText, TypeModalSharingOpen, TypeModalSharingClick, TypeModalSharingClose, TypeVideoModalSharingClick, TypeTvKidModeItem, TypeOpenCommunityChats, TypeFeedPostUnmuteAudio, TypeFeedPostMuteAudio, TypeFeedPostPauseAudio, TypeFeedPostOpenAudio, TypeFeedPostAddedAudio, TypeFeedPostRemovedAudio, TypeFeedPostOpenPlaylist, TypeFeedPostAddedPlaylist, TypeFeedPostRemovedPlaylist, TypeFeedCoownersEvent, TypeFeedViewAuthors, TypeFeedViewRepostedItemAuthors, TypeActionButtonClick, TypeVideoKidsAgeFilterButtonTap, TypeTvQrModalAction, TypeMoveYoutubeSubsOnboardingItem, TypeMoveYoutubeSubsClickItem, TypeSelectCreatorsClickItem, TypeSelectCreatorsScreenConfirmClick, TypeCreatorHideUndoHideClick, TypeSkipVideoButtonClick, TypeNextVideoAnnouncement, TypeVideoPostponedPublicationClick, TypeVideoUploadOptionClick, TypeVideoUploadPrivacyClick, TypeVideoUploadAdditionalOptionClick, TypeVideoCreatePlaylistClick, TypeNextPrevVideoButtonTap, TypeVideoToggleFullscreen, TypeVideoMusicTrackAdd, TypeVideoMusicTrackDelete, TypeVideoMusicTrackCardContinueWatch, TypeVideoMusicTrackCardOpenPlaylist, TypeVideoMusicTrackCardSimilarMusicClick, TypeVideoPlayerMusicTrackClick, TypeVideoMusicStreamMixWatchClick, TypeVideoAdSubscriptionOfferClick, TypeVideoAdSubscriptionOfferClose, TypeVideoAdTrialClick, TypeVideoInfoAboutDrugClick, TypeVideoClickWithActivePlayer, TypeVideoAdditionalActionsClick, TypeEndVideoClick, TypeFeedInlineCommentInputClick, TypeVideoAlbumCreateClick, TypeVideoAlbumEditClick, TypeVideoAlbumEditorCoverClick, TypeVideoAlbumEditorPrivacyClick, TypeVideoAddToAlbumClick, TypeVideoUploadClick, TypeVideoDraftClick, TypeVideoChangeProfileButtonTap, TypeVideoUploadCoverClick, TypeVideoCreateChannelClick, TypeVideoChannelOnboardingClick, TypeVideoShowFullVideoFromClipButtonTap, TypeImCounterSettingsClick, TypeImPushNotificationsSettingsClick, TypeFeedPostTextAction, TypeVideoCatalogWarmupClick, TypeVideoChildProfileClicks, TypeFeedPostDonutPaymentClick, TypeVideoQualityChangeInPlayer, IdfaPermissionScreenClick, TypeAudioUiClickItem, TypeAudioPlayerUiClickItem, TypeAudioTrackMenuUiClickItem, TypeVideoTopshelfMuteClick, TypeClickSkipItem, TypeVideoTopshelfClick, TypeVideoCategoryBlockItemClick, TypeVideoProfileClickLink, TypeVideoInstallTrapClick, TypeFeedPostComponentClick, TypeVideoPlaylistAddItemClick, TypeVideoPlaylistAddItemSearchClick, TypeVideoActionAtExternalLink, TypeVideoClickToggleShowChannelLinks, TypeVideoMoviePageButtonClick, TypeVideoActionMenuButtonClick, TypeVideoSubscribtionButtonClick, TypeVideoOpenCommentsClick, TypeVoipShareClick, TypeVoipImportContactsClick, TypeVoipSyncContactsModalClick, TypeVoipOutgoingCallClick, TypeVoipMoreMenuClick, TypeVoipJoinCallClick, TypeVoipCallsServicesClick, TypeOverlayAdClick, TypeVideoAddToMyVideosClick, TypeVideoLikeClick, TypeSportBlockVideoLiveClick, TypeVideoAgeMarkClick, TypeVideoChannelAPlusTagClick, TypeVideoContentWarningModalClick, TypeFeedSdkAdClick, TypeCommunitiesClick, TypeDeleteItemClick, TypeVideoOpenDescriptionModalClick, TypeCloseCastConnectOfferModal, TypeVoipShareToUserClick, TypeVoipServicePrivacyMessageClick, TypeVideoOpenPlaylistClick, TypeVideoOpenAuthorCabinetClick, TypeVideoPlaylistChangeOrder, TypeChannelItem, TypeVideoFilterBlockClick, TypeOpenProfileClick, TypeProfileFriendAddClick, TypeProfileFriendConfirmClick, TypeVideoModalEpisodeOpenClick, TypeClickToAuthorCommunity, TypeVideoReportButtonClick, TypeCommunityScreenLoadRetryClick, TypeCommunityScreenTabLoadRetryClick, TypeVideoTabBlockClick, TypeVideoOfflineSnackbarEvent, TypeVideoSortCommentsClick, TypeVideoLandingTvInstallClick, TypeSimilarChannelsCardClick, TypeSimilarChannelsSubscriptionClick, TypeDzenBlockArticleClick, TypeOverlayLiveProductCardClick, TypeOverlayLiveProductCloseClick, TypeSuperappVkvideoBanner, TypeInstallVkvideoModal, TypeVideoAssistantChatOpenClick, TypeVideoAssistantChatCloseClick, TypeVideoAssistantMessageSendClick, TypeVideoAssistantMessageSetLikeClick, TypeVideoAssistantMessageUnsetLikeClick, TypeVideoAssistantMessageSetDislikeClick, TypeVideoAssistantMessageUnsetDislikeClick, TypeVideoAssistantFeedbackSendClick, TypeVideoAssistantPlaylistAddClick, TypeVideoAssistantPlaylistOpenClick, TypeVideoAssistantVideoOpenClick, TypeVideoAssistantDeleteClick, TypeVideoAssistantChatsListClick, TypeVideoAssistantChatsListMenuClick, TypeVideoAssistantPlaylistToastOpenClick)");
            }
            return new TypeClick1(schemeStat$EventItem, num, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -1, 2047, null);
        }

        public static /* synthetic */ SchemeStat$TypeClick b(SchemeStat$EventItem schemeStat$EventItem, b bVar, int i) {
            if ((i & 4) != 0) {
                bVar = null;
            }
            return a(schemeStat$EventItem, null, bVar);
        }

        public static SchemeStat$TypeClick c(SchemeStat$EventItem schemeStat$EventItem, Integer num, b bVar) {
            if (bVar instanceof CommonAudioStat$TypeAudioTapGotoEventItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_AUDIO_TAP_GOTO_EVENT_ITEM, null, null, (CommonAudioStat$TypeAudioTapGotoEventItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -40, -1, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioTapEqualizerEventItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_AUDIO_TAP_EQUALIZER_EVENT_ITEM, null, null, null, null, (CommonAudioStat$TypeAudioTapEqualizerEventItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, NetError.ERR_PROXY_CERTIFICATE_INVALID, -1, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioTapPopupEventItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_AUDIO_TAP_POPUP_EVENT_ITEM, null, null, null, null, null, null, (CommonAudioStat$TypeAudioTapPopupEventItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -520, -1, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioTapSettingsEventItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_AUDIO_TAP_SETTINGS_EVENT_ITEM, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioTapSettingsEventItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1032, -1, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_POSTING_SNIPPET_EDIT_ITEM, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -72, -1, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof SchemeStat$TypeNavigationTabClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_NAVIGATION_TAB_CLICK, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeNavigationTabClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4104, -1, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof SchemeStat$TypeImItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_IM_ITEM, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeImItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16392, -1, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof SchemeStat$TypeMarketItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_MARKET_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeMarketItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32776, -1, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof SchemeStat$TypeMarketMarketplaceItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_MARKET_MARKETPLACE_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeMarketMarketplaceItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65544, -1, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof SchemeStat$TypeSuperappScreenItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_SUPERAPP_SCREEN_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeSuperappScreenItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -131080, -1, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof SchemeStat$TypeMiniAppItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_MINI_APP_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeMiniAppItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262152, -1, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoCardEvent) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_CARD_EVENT, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoCardEvent) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524296, -1, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof SchemeStat$TypeClickItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_CLICK_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1048584, -1, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof SchemeStat$TypeClickPreferenceItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_CLICK_PREFERENCE_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeClickPreferenceItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388616, -1, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_CLICK_PREFERENCE_WITH_VALUE_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777224, -1, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof SchemeStat$TypeClickPreferenceValueItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_CLICK_PREFERENCE_VALUE_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeClickPreferenceValueItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33554440, -1, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof CommonOnboardingStat$TypeUiHintItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_UI_HINT_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonOnboardingStat$TypeUiHintItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -536870920, -1, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof SchemeStat$TypeClipViewerItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_CLIP_VIEWER_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeClipViewerItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1073741832, -1, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_PLAYER_BUTTON_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147483640, -1, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoPlayerCastClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_PLAYER_CAST_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoPlayerCastClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -2, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_PLAYER_SEEK_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -3, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoToClipAttach) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_TO_CLIP_ATTACH, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoToClipAttach) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -5, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsClipsStat$TypeClipsGridItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_CLIPS_GRID_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsClipsStat$TypeClipsGridItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -65, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioArtistClickItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_AUDIO_ARTIST_CLICK_ITEM, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioArtistClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2056, -1, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_CLIP_IN_FEED_OVERLAY_CLICK_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -9, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof SchemeStat$TypeSuperappSettingsItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_SUPERAPP_SETTINGS_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeSuperappSettingsItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -129, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsMarusiaStat$TypeConversationItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_MARUSIA_CONVERSATION_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarusiaStat$TypeConversationItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -257, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsMarusiaStat$TypeReadingItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_MARUSIA_READING_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarusiaStat$TypeReadingItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -513, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof SchemeStat$TypeVideoPipItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_PIP_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeVideoPipItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1025, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof SchemeStat$TypeVideoMiniplayerItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_MINIPLAYER_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeVideoMiniplayerItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -2049, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoDownloadItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_DOWNLOAD_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoDownloadItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -4097, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoNotInteresting) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_NOT_INTERESTING, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoNotInteresting) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -8193, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoDoNotRecommendAuthor) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_DO_NOT_RECOMMEND_AUTHOR, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoDoNotRecommendAuthor) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -16385, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoTvProgram) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_TV_PROGRAM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoTvProgram) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -32769, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoWatchLater) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_WATCH_LATER, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoWatchLater) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -65537, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof SchemeStat$TypeVideoBackgroundListeningItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_BACKGROUND_LISTENING_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeVideoBackgroundListeningItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -131073, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof SchemeStat$TypeClassifiedsClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_CLASSIFIEDS_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeClassifiedsClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -2097153, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof SchemeStat$TypeAliexpressClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_ALIEXPRESS_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeAliexpressClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -4194305, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeMarketCarouselClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_MARKET_CAROUSEL_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeMarketCarouselClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -8388609, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedClickToShopsMoreButton) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_CLICK_TO_SHOPS_MORE_BUTTON, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedClickToShopsMoreButton) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -16777217, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsMarketStat$TypeMarketClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_MARKET_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarketStat$TypeMarketClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -33554433, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsSearchStat$TypeSearchClickItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_SEARCH_CLICK_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsSearchStat$TypeSearchClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -524289, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof CommonSearchStat$TypeSearchLocalClickItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_SEARCH_LOCAL_CLICK_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonSearchStat$TypeSearchLocalClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1048577, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof SchemeStat$TypeMessagingContactRecommendationsItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_MESSAGING_CONTACT_RECOMMENDATIONS_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeMessagingContactRecommendationsItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -67108865, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsImStat$TypeImConversationClickItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_IM_CONVERSATION_CLICK_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsImStat$TypeImConversationClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -134217729, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof SchemeStat$TypeMessagingSyncContactsClickItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_MESSAGING_SYNC_CONTACTS_CLICK_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeMessagingSyncContactsClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -268435457, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_IM_SHARE_FROM_CHAT_PROFILE_CLICK_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, Integer.MAX_VALUE, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsImStat$TypeImGoArchiveClickItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_IM_GO_ARCHIVE_CLICK_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsImStat$TypeImGoArchiveClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -2, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsImStat$TypeImPinnedMessageClickItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_IM_PINNED_MESSAGE_CLICK_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsImStat$TypeImPinnedMessageClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -3, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsImStat$TypeImPhoneNumberCallClickItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_IM_PHONE_NUMBER_CALL_CLICK_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsImStat$TypeImPhoneNumberCallClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1073741825, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsImStat$TypeImGoToProfileClickItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_IM_GO_TO_PROFILE_CLICK_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsImStat$TypeImGoToProfileClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -536870913, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof SchemeStat$TypeImChatItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_IM_CHAT_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeImChatItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -5, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof SchemeStat$TypeProfileActionButtonItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_PROFILE_ACTION_BUTTON_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeProfileActionButtonItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -9, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof SchemeStat$TypeShareItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_SHARE_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeShareItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -17, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsSharingStat$TypeSharingLinkOpen) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_SHARING_LINK_OPEN, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsSharingStat$TypeSharingLinkOpen) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -33, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof SchemeStat$TypeQuestionItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_QUESTION_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeQuestionItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -65, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof SchemeStat$TypeBadgesItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_BADGES_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeBadgesItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -129, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof SchemeStat$TypeWishlistItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_WISHLIST_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeWishlistItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -257, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof SchemeStat$TypeOwnerButtonAppClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_OWNER_BUTTON_APP_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeOwnerButtonAppClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -513, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof SchemeStat$TypeGamesCatalogClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_GAMES_CATALOG_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeGamesCatalogClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2097160, -1, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoCardLongtap) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_CARD_LONGTAP, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoCardLongtap) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4194312, -1, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeSoftUpdateClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_SOFT_UPDATE_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeSoftUpdateClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -67108872, -1, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof c0) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FRIEND_ENTRYPOINT_BLOCK_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (c0) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1025, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsSuperappStat$TypeSuperappOnboardingClickItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_SUPERAPP_ONBOARDING_CLICK_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsSuperappStat$TypeSuperappOnboardingClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -2049, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_PHOTO_EDITOR_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -4097, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsProfileStat$TypeProfileItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_PROFILE_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsProfileStat$TypeProfileItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -8193, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof CommonCommunitiesStat$TypeChannelItemClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_COMMUNITY_CHANNEL_ITEM_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonCommunitiesStat$TypeChannelItemClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -16385, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsGroupsStat$TypeGroupsEventItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_GROUPS_EVENT_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsGroupsStat$TypeGroupsEventItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -32769, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsStickersStat$TypeStickersClickItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_STICKERS_CLICK_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsStickersStat$TypeStickersClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -65537, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof CommonMarketStat$TypeRatingClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_RATING_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeRatingClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -131073, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsCallsStat$TypeCallsItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_CALLS_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsCallsStat$TypeCallsItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -262145, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsEcommStat$TypeAdminTipsClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_ADMIN_TIPS_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsEcommStat$TypeAdminTipsClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -524289, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsNftStat$TypeNftItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_NFT_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsNftStat$TypeNftItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1048577, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedMediaDiscoverItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_MEDIA_DISCOVER_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedMediaDiscoverItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -2097153, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedMediaDiscoverBlock) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_MEDIA_DISCOVER_BLOCK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedMediaDiscoverBlock) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -4194305, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_OPEN_SIMILAR_POSTS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -8388609, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_OPEN_COMMENTS_MODAL, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -16777217, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_OPEN_REACTIONS_MODAL, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -33554433, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedStartFastChat) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_START_FAST_CHAT, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedStartFastChat) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -67108865, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedCommentThreadButtonShowMore) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_COMMENT_THREAD_BUTTON_SHOW_MORE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedCommentThreadButtonShowMore) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -134217729, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedCommunityMediaItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_COMMUNITY_MEDIA_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedCommunityMediaItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -268435457, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedInteractionItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_INTERACTION_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedInteractionItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -134217736, -1, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedItemMenuAction) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_ITEM_MENU_ACTION, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedItemMenuAction) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -536870913, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedOpenItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_OPEN_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedOpenItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1073741825, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypePhotoSaveToAlbumMenuItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_PHOTO_SAVE_TO_ALBUM_MENU_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypePhotoSaveToAlbumMenuItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, Integer.MAX_VALUE, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypePhotoShareToMessageItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_PHOTO_SHARE_TO_MESSAGE_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypePhotoShareToMessageItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -2, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeObsceneWord) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_OBSCENE_WORD, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeObsceneWord) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -3, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeRevealObsceneWords) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_REVEAL_OBSCENE_WORDS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeRevealObsceneWords) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -5, -1, -1, 2047, null);
            }
            if (bVar instanceof CommonVasStat$TypeBadgesScreenItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_BADGES_SCREEN_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVasStat$TypeBadgesScreenItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -9, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsConDzenStat$TypeDzenArticleItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_DZEN_ARTICLE_ITEM, null, (MobileOfficialAppsConDzenStat$TypeDzenArticleItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -24, -1, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeDzenStoryClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_DZEN_STORY_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeDzenStoryClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -17, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeDzenStoryItemClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_DZEN_STORY_ITEM_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeDzenStoryItemClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -33, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeDzenShowMoreClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_DZEN_SHOW_MORE_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeDzenShowMoreClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -65, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeHiddenSourceOpenProfile) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_HIDDEN_SOURCE_OPEN_PROFILE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeHiddenSourceOpenProfile) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -129, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeHiddenSourceUnbanButton) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_HIDDEN_SOURCE_UNBAN_BUTTON, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeHiddenSourceUnbanButton) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -257, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeHiddenSourceUnbanCancelButton) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_HIDDEN_SOURCE_UNBAN_CANCEL_BUTTON, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeHiddenSourceUnbanCancelButton) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -513, -1, -1, 2047, null);
            }
            if (bVar instanceof CommonCommunitiesStat$TypeCommunityOnboardingClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_COMMUNITY_ONBOARDING_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonCommunitiesStat$TypeCommunityOnboardingClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -8193, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FOLLOWERS_MODE_ONBOARDING_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -16385, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsSocGraphStat$FollowersModeSwitchState) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FOLLOWERS_MODE_SWITCH_STATE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsSocGraphStat$FollowersModeSwitchState) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -32769, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedCarouselLongtap) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_CAROUSEL_LONGTAP, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedCarouselLongtap) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1025, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_CAROUSEL_LONGTAP_SCROLL, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -2049, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingScroll) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_CAROUSEL_ONBOARDING_SCROLL, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingScroll) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -4097, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsConPostingStat$TypePostingItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_POSTING_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsConPostingStat$TypePostingItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -65537, -1, -1, 2047, null);
            }
            if (bVar instanceof CommonMarketStat$TypeMarketItemReviewClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_MARKET_ITEM_REVIEW_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonMarketStat$TypeMarketItemReviewClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -131073, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_MINI_APP_POLICY_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -262145, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_MINI_APP_PERMISSION_BOX_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -524289, -1, -1, 2047, null);
            }
            if (bVar instanceof CommonCommunitiesStat$TypeCommunityReviewClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_COMMUNITY_REVIEW_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonCommunitiesStat$TypeCommunityReviewClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1048577, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsConPhotosStat$TypePhotosItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_PHOTOS_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsConPhotosStat$TypePhotosItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -2097153, -1, -1, 2047, null);
            }
            if (bVar instanceof t) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_OPEN_QUALITY_INDEX_SETTINGS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (t) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -4194305, -1, -1, 2047, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioPopupItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_AUDIO_POPUP_ITEM, null, null, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioPopupItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8200, -1, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof CommonVasStat$TypeUgcStickersItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_UGC_STICKERS_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVasStat$TypeUgcStickersItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -8388609, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsEcommStat$TypeBannerClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_BANNER_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsEcommStat$TypeBannerClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -16777217, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoInAppReviewClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_IN_APP_REVIEW_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoInAppReviewClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -33554433, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeSystemPushClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_SYSTEM_PUSH_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeSystemPushClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -67108865, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeAutoplayTurnClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_AUTOPLAY_TURN_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeAutoplayTurnClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -134217729, -1, -1, 2047, null);
            }
            if (bVar instanceof CommonEcommStat$TypeEcommClickItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_ECOMM_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonEcommStat$TypeEcommClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -268435457, -1, -1, 2047, null);
            }
            if (bVar instanceof l0) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_AUTHOR_FILTER_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (l0) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, Integer.MAX_VALUE, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoKidsModeClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_KIDS_MODE_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoKidsModeClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1073741825, -1, -1, 2047, null);
            }
            if (bVar instanceof p0) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_PLAYLIST_SHOW_ALL_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (p0) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -2, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_CATALOG_BUTTON_EXTENDED_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -3, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoCatalogBlockItemClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_CATALOG_BLOCK_ITEM_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoCatalogBlockItemClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -5, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoSuggestDownloadsClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_SUGGEST_DOWNLOADS_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoSuggestDownloadsClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -536870913, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoDescriptionClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_DESCRIPTION_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoDescriptionClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -33, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoDownloadClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_DOWNLOAD_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoDownloadClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -65, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_RESTRICTION_CLICK_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -129, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoCommentClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_COMMENT_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoCommentClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -257, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoScreenCommentClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_SCREEN_COMMENT_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoScreenCommentClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -513, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoCommentsSortTabClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_COMMENTS_SORT_TAB_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoCommentsSortTabClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1025, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoDiscoveryLogoClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_DISCOVERY_LOGO_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoDiscoveryLogoClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -2049, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoPushesAdClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_PUSHES_AD_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoPushesAdClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -4097, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_STOP_RECOMMENDING_CREATOR, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -8193, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_UNDO_STOP_RECOMMENDING_CREATOR, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -16385, -1, 2047, null);
            }
            if (bVar instanceof SchemeStat$TypeSnowballEvents) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_SNOWBALL_EVENTS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeSnowballEvents) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -65537, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_MINI_APP_SNOWBALL_MODAL_ACTION, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -131073, -1, 2047, null);
            }
            if (bVar instanceof o0) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_OPEN_FULLSCREEN_WITH_SWIPE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (o0) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -262145, -1, 2047, null);
            }
            if (bVar instanceof k0) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_ATTACH_SHORT_VIDEO, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (k0) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -524289, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_CLICK_SECURE_LOCK_SETTINGS_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1048577, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_COMMENTS_SORT_TAB_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -2097153, -1, 2047, null);
            }
            if (bVar instanceof SchemeStat$TypeLegalNoticeClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_LEGAL_NOTICE_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeLegalNoticeClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -4194305, -1, 2047, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoCreateClip) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_CREATE_CLIP, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoCreateClip) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -17, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof CommonCommunitiesStat$TypeTabItemClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_COMMUNITY_TAB_ITEM_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonCommunitiesStat$TypeTabItemClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -8388609, -1, 2047, null);
            }
            if (bVar instanceof CommonCommunitiesStat$TypeDonutGoal) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_DONUT_GOAL_CLICK_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonCommunitiesStat$TypeDonutGoal) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -16777217, -1, 2047, null);
            }
            if (bVar instanceof CommonCommunitiesStat$TypeDonutClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_COMMUNITIES_DONUT_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonCommunitiesStat$TypeDonutClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -33554433, -1, 2047, null);
            }
            if (bVar instanceof CommonCommunitiesStat$TypeDonutBanner) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_DONUT_BANNER_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonCommunitiesStat$TypeDonutBanner) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -67108865, -1, 2047, null);
            }
            if (bVar instanceof CommonCommunitiesStat$TypeDonutSupportAuthor) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_DONUT_SUPPORT_AUTHOR_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonCommunitiesStat$TypeDonutSupportAuthor) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -134217729, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoDirectUrlStartItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_DIRECT_URL_START_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoDirectUrlStartItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -268435457, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsPromoStat$TypePromoClickItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_PROMO_CLICK_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsPromoStat$TypePromoClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -536870913, -1, 2047, null);
            }
            if (bVar instanceof CommonOnboardingStat$TypeOnboardingEvent) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_ONBOARDING_EVENT, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonOnboardingStat$TypeOnboardingEvent) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1073741825, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsNotificationsStat$TypeNotificationItemClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_NOTIFICATION_ITEM_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsNotificationsStat$TypeNotificationItemClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, Integer.MAX_VALUE, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedOpenUserClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_OPEN_USER_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedOpenUserClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -2, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedOpenGroupClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_OPEN_GROUP_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedOpenGroupClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -3, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemUserClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_OPEN_REPOSTED_ITEM_USER_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemUserClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -5, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_OPEN_REPOSTED_ITEM_GROUP_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -9, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedOpenStoryClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_OPEN_STORY_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedOpenStoryClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -17, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedFollowClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_FOLLOW_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedFollowClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -1025, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedHideProductPinClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_HIDE_PRODUCT_PIN_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedHideProductPinClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -33, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedHideTicketItemPin) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_HIDE_TICKET_ITEM_PIN, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedHideTicketItemPin) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -65, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_OPEN_MARKET_ITEM_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -129, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedTicketItemClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_TICKET_ITEM_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedTicketItemClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -257, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedShowProductsModalCardClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_SHOW_PRODUCTS_MODAL_CARD_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedShowProductsModalCardClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -513, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedUnfollowClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_UNFOLLOW_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedUnfollowClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -2049, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedPostExpandText) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_POST_EXPAND_TEXT, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedPostExpandText) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -4097, 2047, null);
            }
            if (bVar instanceof a0) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_POST_COLLAPSE_TEXT, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (a0) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -8193, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsSharingStat$TypeModalSharingOpen) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_MODAL_SHARING_OPEN, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsSharingStat$TypeModalSharingOpen) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -16385, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsSharingStat$TypeModalSharingClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_MODAL_SHARING_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsSharingStat$TypeModalSharingClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -32769, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsSharingStat$TypeModalSharingClose) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_MODAL_SHARING_CLOSE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsSharingStat$TypeModalSharingClose) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -65537, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoModalSharingClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_MODAL_SHARING_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoModalSharingClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -131073, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeTvKidModeItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_TV_KID_MODE_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeTvKidModeItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -262145, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsImStat$TypeOpenCommunityChats) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_OPEN_COMMUNITY_CHATS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsImStat$TypeOpenCommunityChats) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -524289, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedPostUnmuteAudio) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_POST_UNMUTE_AUDIO, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedPostUnmuteAudio) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -1048577, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedPostMuteAudio) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_POST_MUTE_AUDIO, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedPostMuteAudio) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -2097153, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedPostPauseAudio) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_POST_PAUSE_AUDIO, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedPostPauseAudio) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -4194305, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedPostOpenAudio) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_POST_OPEN_AUDIO, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedPostOpenAudio) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -8388609, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedPostAddedAudio) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_POST_ADDED_AUDIO, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedPostAddedAudio) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -16777217, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedPostRemovedAudio) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_POST_REMOVED_AUDIO, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedPostRemovedAudio) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -33554433, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedPostOpenPlaylist) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_POST_OPEN_PLAYLIST, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedPostOpenPlaylist) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -67108865, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedPostAddedPlaylist) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_POST_ADDED_PLAYLIST, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedPostAddedPlaylist) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -134217729, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_POST_REMOVED_PLAYLIST, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -268435457, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedCoownersEvent) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_COOWNERS_EVENT, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedCoownersEvent) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -536870913, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedViewAuthors) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_VIEW_AUTHORS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedViewAuthors) bVar, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -1073741825, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_FEED_VIEW_REPOSTED_ITEM_AUTHORS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors) bVar, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, Integer.MAX_VALUE, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeActionButtonClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_ACTION_BUTTON_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeActionButtonClick) bVar, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -1, 2046, null);
            }
            if (bVar instanceof n0) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_KIDS_AGE_FILTER_BUTTON_TAP, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (n0) bVar, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -1, 2045, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeTvQrModalAction) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_TV_QR_MODAL_ACTION, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeTvQrModalAction) bVar, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -1, 2043, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_MOVE_YOUTUBE_SUBS_ONBOARDING_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingItem) bVar, null, null, null, null, null, null, null, -8, -1, -1, -1, -1, -1, 2039, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_MOVE_YOUTUBE_SUBS_CLICK_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem) bVar, null, null, null, null, null, null, -8, -1, -1, -1, -1, -1, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS, null);
            }
            if (bVar instanceof j0) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_SELECT_CREATORS_CLICK_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (j0) bVar, null, null, null, null, null, -8, -1, -1, -1, -1, -1, 2015, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_SELECT_CREATORS_SCREEN_CONFIRM_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick) bVar, null, null, null, null, -8, -1, -1, -1, -1, -1, 1983, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_CREATOR_HIDE_UNDO_HIDE_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick) bVar, null, null, null, -8, -1, -1, -1, -1, -1, 1919, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeSkipVideoButtonClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_SKIP_VIDEO_BUTTON_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeSkipVideoButtonClick) bVar, null, null, -8, -1, -1, -1, -1, -1, 1791, null);
            }
            if (bVar instanceof CommonVideoStat$TypeNextVideoAnnouncement) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_NEXT_VIDEO_ANNOUNCEMENT_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeNextVideoAnnouncement) bVar, null, -8, -1, -1, -1, -1, -1, 1535, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_POSTPONED_PUBLICATION_CLICK, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16392, -1, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoUploadOptionClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_UPLOAD_OPTION_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoUploadOptionClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -9, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_UPLOAD_PRIVACY_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -17, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoUploadAdditionalOptionClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_UPLOAD_ADDITIONAL_OPTION_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoUploadAdditionalOptionClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -33, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoCreatePlaylistClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_CREATE_PLAYLIST_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoCreatePlaylistClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -65, 262143, null);
            }
            if (bVar instanceof CommonVideoStat$TypeNextPrevVideoButtonTap) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_NEXT_PREV_VIDEO_BUTTON_TAP, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeNextPrevVideoButtonTap) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32776, -1, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoToggleFullscreen) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_TOGGLE_FULLSCREEN, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoToggleFullscreen) bVar, -8, -1, -1, -1, -1, -1, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoMusicTrackAdd) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_MUSIC_TRACK_ADD, (CommonVideoStat$TypeVideoMusicTrackAdd) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16, -1, -1, 262143, null);
            }
            if (!(bVar instanceof CommonVideoStat$TypeVideoMusicTrackDelete)) {
                return null;
            }
            return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_MUSIC_TRACK_DELETE, null, (CommonVideoStat$TypeVideoMusicTrackDelete) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -24, -1, -1, 262143, null);
        }

        public static SchemeStat$TypeClick d(SchemeStat$EventItem schemeStat$EventItem, Integer num, b bVar) {
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoMusicTrackCardContinueWatch) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_MUSIC_TRACK_CARD_CONTINUE_WATCH, null, null, (MobileOfficialAppsVideoStat$TypeVideoMusicTrackCardContinueWatch) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -40, -1, -1, 262143, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoMusicTrackCardOpenPlaylist) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_MUSIC_TRACK_CARD_OPEN_PLAYLIST, null, null, null, (CommonVideoStat$TypeVideoMusicTrackCardOpenPlaylist) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -72, -1, -1, 262143, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoMusicTrackCardSimilarMusicClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_MUSIC_TRACK_CARD_SIMILAR_MUSIC_CLICK, null, null, null, null, (CommonVideoStat$TypeVideoMusicTrackCardSimilarMusicClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, NetError.ERR_PROXY_CERTIFICATE_INVALID, -1, -1, 262143, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoPlayerMusicTrackClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_PLAYER_MUSIC_TRACK_CLICK, null, null, null, null, null, (CommonVideoStat$TypeVideoPlayerMusicTrackClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -264, -1, -1, 262143, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoMusicStreamMixWatchClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_MUSIC_STREAM_MIX_WATCH_CLICK, null, null, null, null, null, null, (CommonVideoStat$TypeVideoMusicStreamMixWatchClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -520, -1, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_AD_SUBSCRIPTION_OFFER_CLICK, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1032, -1, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClose) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_AD_SUBSCRIPTION_OFFER_CLOSE, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClose) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2056, -1, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoAdTrialClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_AD_TRIAL_CLICK, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoAdTrialClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4104, -1, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_INFO_ABOUT_DRUG_CLICK, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8200, -1, -1, 262143, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoClickWithActivePlayer) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_CLICK_WITH_ACTIVE_PLAYER, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoClickWithActivePlayer) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -262145, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_ADDITIONAL_ACTIONS_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -9, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeEndVideoClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_END_VIDEO_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeEndVideoClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -17, -1, 2047, null);
            }
            if (bVar instanceof z) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_FEED_INLINE_COMMENT_INPUT_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, (z) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65544, -1, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoAlbumCreateClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_ALBUM_CREATE_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoAlbumCreateClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -131080, -1, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoAlbumEditClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_ALBUM_EDIT_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoAlbumEditClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262152, -1, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoAlbumEditorCoverClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_ALBUM_EDITOR_COVER_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoAlbumEditorCoverClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524296, -1, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoAlbumEditorPrivacyClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_ALBUM_EDITOR_PRIVACY_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoAlbumEditorPrivacyClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1048584, -1, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_ADD_TO_ALBUM_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2097160, -1, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoUploadClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_UPLOAD_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoUploadClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4194312, -1, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoDraftClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_DRAFT_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoDraftClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388616, -1, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoChangeProfileButtonTap) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_CHANGE_PROFILE_BUTTON_TAP, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoChangeProfileButtonTap) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777224, -1, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoUploadCoverClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_UPLOAD_COVER_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoUploadCoverClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33554440, -1, -1, 262143, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoCreateChannelClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_CREATE_CHANNEL_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoCreateChannelClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -67108872, -1, -1, 262143, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoChannelOnboardingClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_CHANNEL_ONBOARDING_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoChannelOnboardingClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -134217736, -1, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoShowFullVideoFromClipButtonTap) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_SHOW_FULL_VIDEO_FROM_CLIP_BUTTON_TAP, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoShowFullVideoFromClipButtonTap) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -268435464, -1, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsImStat$TypeImCounterSettingsClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_IM_COUNTER_SETTINGS_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsImStat$TypeImCounterSettingsClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -536870920, -1, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_IM_PUSH_NOTIFICATIONS_SETTINGS_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1073741832, -1, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedPostTextAction) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_FEED_POST_TEXT_ACTION, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedPostTextAction) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147483640, -1, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoCatalogWarmupClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_CATALOG_WARMUP_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoCatalogWarmupClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -2, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoChildProfileClicks) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_CHILD_PROFILE_CLICKS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoChildProfileClicks) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -3, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_FEED_POST_DONUT_PAYMENT_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -5, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoQualityChangeInPlayer) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_QUALITY_CHANGE_IN_PLAYER, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoQualityChangeInPlayer) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -9, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$IdfaPermissionScreenClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.IDFA_PERMISSION_SCREEN_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$IdfaPermissionScreenClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -17, -1, 262143, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioUiClickItem) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_AUDIO_UI_CLICK_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioUiClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -33, -1, 262143, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioPlayerUiClickItem) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_AUDIO_PLAYER_UI_CLICK_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioPlayerUiClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -65, -1, 262143, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioTrackMenuUiClickItem) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_AUDIO_TRACK_MENU_UI_CLICK_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonAudioStat$TypeAudioTrackMenuUiClickItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -129, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoTopshelfMuteClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_TOPSHELF_MUTE_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoTopshelfMuteClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -257, -1, 262143, null);
            }
            if (bVar instanceof CommonVideoStat$TypeClickSkipItem) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_CLICK_SKIP_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeClickSkipItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -513, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoTopshelfClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_TOPSHELF_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoTopshelfClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1025, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoCategoryBlockItemClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_CATEGORY_BLOCK_ITEM_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoCategoryBlockItemClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -2049, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoProfileClickLink) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_PROFILE_CLICK_LINK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoProfileClickLink) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -4097, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoInstallTrapClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_INSTALL_TRAP_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoInstallTrapClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -8193, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedPostComponentClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_FEED_POST_COMPONENT_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedPostComponentClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -16385, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_PLAYLIST_ADD_ITEM_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -32769, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemSearchClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_PLAYLIST_ADD_ITEM_SEARCH_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemSearchClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -65537, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoActionAtExternalLink) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_ACTION_AT_EXTERNAL_LINK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoActionAtExternalLink) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -131073, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoClickToggleShowChannelLinks) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_CLICK_TOGGLE_SHOW_CHANNEL_LINKS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoClickToggleShowChannelLinks) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -262145, -1, 262143, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoMoviePageButtonClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_MOVIE_PAGE_BUTTON_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoMoviePageButtonClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -524289, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoActionMenuButtonClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_ACTION_MENU_BUTTON_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoActionMenuButtonClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1048577, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_SUBSCRIBTION_BUTTON_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -2097153, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoOpenCommentsClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_OPEN_COMMENTS_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoOpenCommentsClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -4194305, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsCallsStat$TypeVoipShareClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VOIP_SHARE_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsCallsStat$TypeVoipShareClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -8388609, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsCallsStat$TypeVoipImportContactsClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VOIP_IMPORT_CONTACTS_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsCallsStat$TypeVoipImportContactsClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -16777217, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VOIP_SYNC_CONTACTS_MODAL_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -33554433, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VOIP_OUTGOING_CALL_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -67108865, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsCallsStat$TypeVoipMoreMenuClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VOIP_MORE_MENU_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsCallsStat$TypeVoipMoreMenuClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -134217729, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsCallsStat$TypeVoipJoinCallClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VOIP_JOIN_CALL_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsCallsStat$TypeVoipJoinCallClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -268435457, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsCallsStat$TypeVoipCallsServicesClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VOIP_CALLS_SERVICES_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsCallsStat$TypeVoipCallsServicesClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -536870913, -1, 262143, null);
            }
            if (bVar instanceof CommonVideoAdsStat$TypeOverlayAdClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_OVERLAY_AD_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoAdsStat$TypeOverlayAdClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -268435464, -1, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoAddToMyVideosClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_ADD_TO_MY_VIDEOS_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoAddToMyVideosClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -2, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoLikeClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_LIKE_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoLikeClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -3, 262143, null);
            }
            if (bVar instanceof e0) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_COMMUNITY_SPORT_BLOCK_VIDEO_LIVE_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (e0) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -5, 262143, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoAgeMarkClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_AGE_MARK_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoAgeMarkClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -129, 262143, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoChannelAPlusTagClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_CHANNEL_A_PLUS_TAG_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoChannelAPlusTagClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -257, 262143, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoContentWarningModalClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_CONTENT_WARNING_MODAL_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoContentWarningModalClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -513, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsAdsStat$TypeFeedSdkAdClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_FEED_SDK_AD_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsAdsStat$TypeFeedSdkAdClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1025, 262143, null);
            }
            if (bVar instanceof CommonCommunitiesStat$TypeCommunitiesClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_COMMUNITIES_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonCommunitiesStat$TypeCommunitiesClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -2049, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeDeleteItemClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_DELETE_ITEM_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeDeleteItemClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -4097, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoOpenDescriptionModalClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_OPEN_DESCRIPTION_MODAL_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoOpenDescriptionModalClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -8193, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeCloseCastConnectOfferModal) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_CLOSE_CAST_CONNECT_OFFER_MODAL, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeCloseCastConnectOfferModal) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -264, -1, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsCallsStat$TypeVoipShareToUserClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VOIP_SHARE_TO_USER_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsCallsStat$TypeVoipShareToUserClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1073741825, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VOIP_SERVICE_PRIVACY_MESSAGE_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, Integer.MAX_VALUE, -1, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_OPEN_PLAYLIST_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -16385, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoOpenAuthorCabinetClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_OPEN_AUTHOR_CABINET_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoOpenAuthorCabinetClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -32769, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoPlaylistChangeOrder) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_PLAYLIST_CHANGE_ORDER, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoPlaylistChangeOrder) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -65537, 262143, null);
            }
            if (bVar instanceof SchemeStat$TypeChannelItem) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_CHANNEL_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeChannelItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -131073, 262143, null);
            }
            if (bVar instanceof m0) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_VIDEO_FILTER_BLOCK_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (m0) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, -1, -32769, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsProfileStat$TypeOpenProfileClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_OPEN_PROFILE_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsProfileStat$TypeOpenProfileClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1048577, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsProfileStat$TypeProfileFriendAddClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_PROFILE_FRIEND_ADD_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsProfileStat$TypeProfileFriendAddClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -2097153, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsProfileStat$TypeProfileFriendConfirmClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_PROFILE_FRIEND_CONFIRM_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsProfileStat$TypeProfileFriendConfirmClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -4194305, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoModalEpisodeOpenClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_MODAL_EPISODE_OPEN_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoModalEpisodeOpenClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -8388609, 262143, null);
            }
            if (bVar instanceof CommonVideoStat$TypeClickToAuthorCommunity) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_CLICK_TO_AUTHOR_COMMUNITY, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeClickToAuthorCommunity) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -33, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoReportButtonClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_REPORT_BUTTON_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoReportButtonClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -16777217, 262143, null);
            }
            if (bVar instanceof CommonCommunitiesStat$TypeCommunityScreenLoadRetryClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_COMMUNITY_SCREEN_LOAD_RETRY_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonCommunitiesStat$TypeCommunityScreenLoadRetryClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -33554433, 262143, null);
            }
            if (bVar instanceof CommonCommunitiesStat$TypeCommunityScreenTabLoadRetryClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_COMMUNITY_SCREEN_TAB_LOAD_RETRY_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonCommunitiesStat$TypeCommunityScreenTabLoadRetryClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -67108865, 262143, null);
            }
            if (bVar instanceof r0) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_TAB_BLOCK_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (r0) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -134217729, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_OFFLINE_SNACKBAR_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -268435457, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoSortCommentsClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_SORT_COMMENTS_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoSortCommentsClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -536870913, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeVideoLandingTvInstallClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_LANDING_TV_INSTALL_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeVideoLandingTvInstallClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1073741825, 262143, null);
            }
            if (bVar instanceof CommonVideoOtherChannelsStat$TypeSimilarChannelsCardClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_SIMILAR_CHANNELS_CARD_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoOtherChannelsStat$TypeSimilarChannelsCardClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -262145, 262143, null);
            }
            if (bVar instanceof CommonVideoOtherChannelsStat$TypeSimilarChannelsSubscriptionClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_SIMILAR_CHANNELS_SUBSCRIPTION_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoOtherChannelsStat$TypeSimilarChannelsSubscriptionClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -524289, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeDzenBlockArticleClick) {
                return new TypeClick1(schemeStat$EventItem, num, Type.TYPE_DZEN_BLOCK_ARTICLE_CLICK, (MobileOfficialAppsFeedStat$TypeDzenBlockArticleClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16, -1, -1, -1, -1, -1, 2047, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_OVERLAY_LIVE_PRODUCT_CARD_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, Integer.MAX_VALUE, 262143, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeOverlayLiveProductCloseClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_OVERLAY_LIVE_PRODUCT_CLOSE_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeOverlayLiveProductCloseClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, 262142, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_SUPERAPP_VKVIDEO_BANNER, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, 262141, null);
            }
            if (bVar instanceof MobileOfficialAppsVideoStat$TypeInstallVkvideoModal) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_INSTALL_VKVIDEO_MODAL, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsVideoStat$TypeInstallVkvideoModal) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, 262139, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoAssistantChatOpenClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_ASSISTANT_CHAT_OPEN_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoAssistantChatOpenClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, 262135, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoAssistantChatCloseClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_ASSISTANT_CHAT_CLOSE_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoAssistantChatCloseClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, 262127, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoAssistantMessageSendClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_ASSISTANT_MESSAGE_SEND_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoAssistantMessageSendClick) bVar, null, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, 262111, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoAssistantMessageSetLikeClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_ASSISTANT_MESSAGE_SET_LIKE_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoAssistantMessageSetLikeClick) bVar, null, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, 262079, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoAssistantMessageUnsetLikeClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_ASSISTANT_MESSAGE_UNSET_LIKE_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoAssistantMessageUnsetLikeClick) bVar, null, null, null, null, null, null, null, null, null, null, -8, -1, -1, 262015, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoAssistantMessageSetDislikeClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_ASSISTANT_MESSAGE_SET_DISLIKE_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoAssistantMessageSetDislikeClick) bVar, null, null, null, null, null, null, null, null, null, -8, -1, -1, 261887, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_ASSISTANT_MESSAGE_UNSET_DISLIKE_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick) bVar, null, null, null, null, null, null, null, null, -8, -1, -1, 261631, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoAssistantFeedbackSendClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_ASSISTANT_FEEDBACK_SEND_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoAssistantFeedbackSendClick) bVar, null, null, null, null, null, null, null, -8, -1, -1, 261119, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoAssistantPlaylistAddClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_ASSISTANT_PLAYLIST_ADD_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoAssistantPlaylistAddClick) bVar, null, null, null, null, null, null, -8, -1, -1, 260095, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoAssistantPlaylistOpenClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_ASSISTANT_PLAYLIST_OPEN_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoAssistantPlaylistOpenClick) bVar, null, null, null, null, null, -8, -1, -1, 258047, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoAssistantVideoOpenClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_ASSISTANT_VIDEO_OPEN_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoAssistantVideoOpenClick) bVar, null, null, null, null, -8, -1, -1, 253951, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoAssistantDeleteClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_ASSISTANT_DELETE_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoAssistantDeleteClick) bVar, null, null, null, -8, -1, -1, 245759, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoAssistantChatsListClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_ASSISTANT_CHATS_LIST_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoAssistantChatsListClick) bVar, null, null, -8, -1, -1, 229375, null);
            }
            if (bVar instanceof CommonVideoStat$TypeVideoAssistantChatsListMenuClick) {
                return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_ASSISTANT_CHATS_LIST_MENU_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoAssistantChatsListMenuClick) bVar, null, -8, -1, -1, 196607, null);
            }
            if (!(bVar instanceof CommonVideoStat$TypeVideoAssistantPlaylistToastOpenClick)) {
                return null;
            }
            return new TypeClick2(schemeStat$EventItem, num, Type.TYPE_VIDEO_ASSISTANT_PLAYLIST_TOAST_OPEN_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (CommonVideoStat$TypeVideoAssistantPlaylistToastOpenClick) bVar, -8, -1, -1, 131071, null);
        }
    }

    /* compiled from: SchemeStat.kt */
    /* loaded from: classes11.dex */
    public interface b {
    }

    /* compiled from: SchemeStat.kt */
    public static final class TypeClick2 implements SchemeStat$TypeClick {

        @pmi0("idfa_permission_screen_click")
        private final MobileOfficialAppsVideoStat$IdfaPermissionScreenClick idfaPermissionScreenClick;

        @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
        private final SchemeStat$EventItem item;

        @pmi0(X3.i.L)
        private final Integer position;

        @pmi0("type")
        private final Type type;

        @pmi0("type_audio_player_ui_click_item")
        private final CommonAudioStat$TypeAudioPlayerUiClickItem typeAudioPlayerUiClickItem;

        @pmi0("type_audio_track_menu_ui_click_item")
        private final CommonAudioStat$TypeAudioTrackMenuUiClickItem typeAudioTrackMenuUiClickItem;

        @pmi0("type_audio_ui_click_item")
        private final CommonAudioStat$TypeAudioUiClickItem typeAudioUiClickItem;

        @pmi0("type_channel_item")
        private final SchemeStat$TypeChannelItem typeChannelItem;

        @pmi0("type_click_skip_item")
        private final CommonVideoStat$TypeClickSkipItem typeClickSkipItem;

        @pmi0("type_communities_click")
        private final CommonCommunitiesStat$TypeCommunitiesClick typeCommunitiesClick;

        @pmi0("type_community_screen_load_retry_click")
        private final CommonCommunitiesStat$TypeCommunityScreenLoadRetryClick typeCommunityScreenLoadRetryClick;

        @pmi0("type_community_screen_tab_load_retry_click")
        private final CommonCommunitiesStat$TypeCommunityScreenTabLoadRetryClick typeCommunityScreenTabLoadRetryClick;

        @pmi0("type_community_sport_block_video_live_click")
        private final e0 typeCommunitySportBlockVideoLiveClick;

        @pmi0("type_delete_item_click")
        private final MobileOfficialAppsVideoStat$TypeDeleteItemClick typeDeleteItemClick;

        @pmi0("type_feed_inline_comment_input_click")
        private final z typeFeedInlineCommentInputClick;

        @pmi0("type_feed_post_component_click")
        private final MobileOfficialAppsFeedStat$TypeFeedPostComponentClick typeFeedPostComponentClick;

        @pmi0("type_feed_post_donut_payment_click")
        private final MobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick typeFeedPostDonutPaymentClick;

        @pmi0("type_feed_post_text_action")
        private final MobileOfficialAppsFeedStat$TypeFeedPostTextAction typeFeedPostTextAction;

        @pmi0("type_feed_sdk_ad_click")
        private final MobileOfficialAppsAdsStat$TypeFeedSdkAdClick typeFeedSdkAdClick;

        @pmi0("type_im_counter_settings_click")
        private final MobileOfficialAppsImStat$TypeImCounterSettingsClick typeImCounterSettingsClick;

        @pmi0("type_im_push_notifications_settings_click")
        private final MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick typeImPushNotificationsSettingsClick;

        @pmi0("type_install_vkvideo_modal")
        private final MobileOfficialAppsVideoStat$TypeInstallVkvideoModal typeInstallVkvideoModal;

        @pmi0("type_open_profile_click")
        private final MobileOfficialAppsProfileStat$TypeOpenProfileClick typeOpenProfileClick;

        @pmi0("type_overlay_live_product_card_click")
        private final MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClick typeOverlayLiveProductCardClick;

        @pmi0("type_overlay_live_product_close_click")
        private final MobileOfficialAppsVideoStat$TypeOverlayLiveProductCloseClick typeOverlayLiveProductCloseClick;

        @pmi0("type_profile_friend_add_click")
        private final MobileOfficialAppsProfileStat$TypeProfileFriendAddClick typeProfileFriendAddClick;

        @pmi0("type_profile_friend_confirm_click")
        private final MobileOfficialAppsProfileStat$TypeProfileFriendConfirmClick typeProfileFriendConfirmClick;

        @pmi0("type_similar_channels_card_click")
        private final CommonVideoOtherChannelsStat$TypeSimilarChannelsCardClick typeSimilarChannelsCardClick;

        @pmi0("type_similar_channels_subscription_click")
        private final CommonVideoOtherChannelsStat$TypeSimilarChannelsSubscriptionClick typeSimilarChannelsSubscriptionClick;

        @pmi0("type_superapp_vkvideo_banner")
        private final MobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner typeSuperappVkvideoBanner;

        @pmi0("type_video_action_at_external_link")
        private final MobileOfficialAppsVideoStat$TypeVideoActionAtExternalLink typeVideoActionAtExternalLink;

        @pmi0("type_video_action_menu_button_click")
        private final MobileOfficialAppsVideoStat$TypeVideoActionMenuButtonClick typeVideoActionMenuButtonClick;

        @pmi0("type_video_ad_subscription_offer_click")
        private final MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick typeVideoAdSubscriptionOfferClick;

        @pmi0("type_video_ad_subscription_offer_close")
        private final MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClose typeVideoAdSubscriptionOfferClose;

        @pmi0("type_video_ad_trial_click")
        private final MobileOfficialAppsVideoStat$TypeVideoAdTrialClick typeVideoAdTrialClick;

        @pmi0("type_video_add_to_album_click")
        private final MobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick typeVideoAddToAlbumClick;

        @pmi0("type_video_add_to_my_videos_click")
        private final MobileOfficialAppsVideoStat$TypeVideoAddToMyVideosClick typeVideoAddToMyVideosClick;

        @pmi0("type_video_age_mark_click")
        private final CommonVideoStat$TypeVideoAgeMarkClick typeVideoAgeMarkClick;

        @pmi0("type_video_album_create_click")
        private final MobileOfficialAppsVideoStat$TypeVideoAlbumCreateClick typeVideoAlbumCreateClick;

        @pmi0("type_video_album_edit_click")
        private final MobileOfficialAppsVideoStat$TypeVideoAlbumEditClick typeVideoAlbumEditClick;

        @pmi0("type_video_album_editor_cover_click")
        private final MobileOfficialAppsVideoStat$TypeVideoAlbumEditorCoverClick typeVideoAlbumEditorCoverClick;

        @pmi0("type_video_album_editor_privacy_click")
        private final MobileOfficialAppsVideoStat$TypeVideoAlbumEditorPrivacyClick typeVideoAlbumEditorPrivacyClick;

        @pmi0("type_video_assistant_chat_close_click")
        private final CommonVideoStat$TypeVideoAssistantChatCloseClick typeVideoAssistantChatCloseClick;

        @pmi0("type_video_assistant_chat_open_click")
        private final CommonVideoStat$TypeVideoAssistantChatOpenClick typeVideoAssistantChatOpenClick;

        @pmi0("type_video_assistant_chats_list_click")
        private final CommonVideoStat$TypeVideoAssistantChatsListClick typeVideoAssistantChatsListClick;

        @pmi0("type_video_assistant_chats_list_menu_click")
        private final CommonVideoStat$TypeVideoAssistantChatsListMenuClick typeVideoAssistantChatsListMenuClick;

        @pmi0("type_video_assistant_delete_click")
        private final CommonVideoStat$TypeVideoAssistantDeleteClick typeVideoAssistantDeleteClick;

        @pmi0("type_video_assistant_feedback_send_click")
        private final CommonVideoStat$TypeVideoAssistantFeedbackSendClick typeVideoAssistantFeedbackSendClick;

        @pmi0("type_video_assistant_message_send_click")
        private final CommonVideoStat$TypeVideoAssistantMessageSendClick typeVideoAssistantMessageSendClick;

        @pmi0("type_video_assistant_message_set_dislike_click")
        private final CommonVideoStat$TypeVideoAssistantMessageSetDislikeClick typeVideoAssistantMessageSetDislikeClick;

        @pmi0("type_video_assistant_message_set_like_click")
        private final CommonVideoStat$TypeVideoAssistantMessageSetLikeClick typeVideoAssistantMessageSetLikeClick;

        @pmi0("type_video_assistant_message_unset_dislike_click")
        private final CommonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick typeVideoAssistantMessageUnsetDislikeClick;

        @pmi0("type_video_assistant_message_unset_like_click")
        private final CommonVideoStat$TypeVideoAssistantMessageUnsetLikeClick typeVideoAssistantMessageUnsetLikeClick;

        @pmi0("type_video_assistant_playlist_add_click")
        private final CommonVideoStat$TypeVideoAssistantPlaylistAddClick typeVideoAssistantPlaylistAddClick;

        @pmi0("type_video_assistant_playlist_open_click")
        private final CommonVideoStat$TypeVideoAssistantPlaylistOpenClick typeVideoAssistantPlaylistOpenClick;

        @pmi0("type_video_assistant_playlist_toast_open_click")
        private final CommonVideoStat$TypeVideoAssistantPlaylistToastOpenClick typeVideoAssistantPlaylistToastOpenClick;

        @pmi0("type_video_assistant_video_open_click")
        private final CommonVideoStat$TypeVideoAssistantVideoOpenClick typeVideoAssistantVideoOpenClick;

        @pmi0("type_video_catalog_warmup_click")
        private final MobileOfficialAppsVideoStat$TypeVideoCatalogWarmupClick typeVideoCatalogWarmupClick;

        @pmi0("type_video_category_block_item_click")
        private final MobileOfficialAppsVideoStat$TypeVideoCategoryBlockItemClick typeVideoCategoryBlockItemClick;

        @pmi0("type_video_change_profile_button_tap")
        private final MobileOfficialAppsVideoStat$TypeVideoChangeProfileButtonTap typeVideoChangeProfileButtonTap;

        @pmi0("type_video_channel_a_plus_tag_click")
        private final CommonVideoStat$TypeVideoChannelAPlusTagClick typeVideoChannelAPlusTagClick;

        @pmi0("type_video_channel_onboarding_click")
        private final CommonVideoStat$TypeVideoChannelOnboardingClick typeVideoChannelOnboardingClick;

        @pmi0("type_video_child_profile_clicks")
        private final MobileOfficialAppsVideoStat$TypeVideoChildProfileClicks typeVideoChildProfileClicks;

        @pmi0("type_video_click_toggle_show_channel_links")
        private final MobileOfficialAppsVideoStat$TypeVideoClickToggleShowChannelLinks typeVideoClickToggleShowChannelLinks;

        @pmi0("type_video_content_warning_modal_click")
        private final CommonVideoStat$TypeVideoContentWarningModalClick typeVideoContentWarningModalClick;

        @pmi0("type_video_create_channel_click")
        private final CommonVideoStat$TypeVideoCreateChannelClick typeVideoCreateChannelClick;

        @pmi0("type_video_create_playlist_click")
        private final MobileOfficialAppsVideoStat$TypeVideoCreatePlaylistClick typeVideoCreatePlaylistClick;

        @pmi0("type_video_draft_click")
        private final MobileOfficialAppsVideoStat$TypeVideoDraftClick typeVideoDraftClick;

        @pmi0("type_video_info_about_drug_click")
        private final MobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugClick typeVideoInfoAboutDrugClick;

        @pmi0("type_video_install_trap_click")
        private final MobileOfficialAppsVideoStat$TypeVideoInstallTrapClick typeVideoInstallTrapClick;

        @pmi0("type_video_landing_tv_install_click")
        private final MobileOfficialAppsVideoStat$TypeVideoLandingTvInstallClick typeVideoLandingTvInstallClick;

        @pmi0("type_video_like_click")
        private final MobileOfficialAppsVideoStat$TypeVideoLikeClick typeVideoLikeClick;

        @pmi0("type_video_modal_episode_open_click")
        private final MobileOfficialAppsVideoStat$TypeVideoModalEpisodeOpenClick typeVideoModalEpisodeOpenClick;

        @pmi0("type_video_movie_page_button_click")
        private final CommonVideoStat$TypeVideoMoviePageButtonClick typeVideoMoviePageButtonClick;

        @pmi0("type_video_music_stream_mix_watch_click")
        private final CommonVideoStat$TypeVideoMusicStreamMixWatchClick typeVideoMusicStreamMixWatchClick;

        @pmi0("type_video_music_track_add")
        private final CommonVideoStat$TypeVideoMusicTrackAdd typeVideoMusicTrackAdd;

        @pmi0("type_video_music_track_card_continue_watch")
        private final MobileOfficialAppsVideoStat$TypeVideoMusicTrackCardContinueWatch typeVideoMusicTrackCardContinueWatch;

        @pmi0("type_video_music_track_card_open_playlist")
        private final CommonVideoStat$TypeVideoMusicTrackCardOpenPlaylist typeVideoMusicTrackCardOpenPlaylist;

        @pmi0("type_video_music_track_card_similar_music_click")
        private final CommonVideoStat$TypeVideoMusicTrackCardSimilarMusicClick typeVideoMusicTrackCardSimilarMusicClick;

        @pmi0("type_video_music_track_delete")
        private final CommonVideoStat$TypeVideoMusicTrackDelete typeVideoMusicTrackDelete;

        @pmi0("type_video_next_prev_video_button_tap")
        private final CommonVideoStat$TypeNextPrevVideoButtonTap typeVideoNextPrevVideoButtonTap;

        @pmi0("type_video_offline_snackbar_click")
        private final MobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent typeVideoOfflineSnackbarClick;

        @pmi0("type_video_open_author_cabinet_click")
        private final MobileOfficialAppsVideoStat$TypeVideoOpenAuthorCabinetClick typeVideoOpenAuthorCabinetClick;

        @pmi0("type_video_open_comments_click")
        private final MobileOfficialAppsVideoStat$TypeVideoOpenCommentsClick typeVideoOpenCommentsClick;

        @pmi0("type_video_open_description_modal_click")
        private final MobileOfficialAppsVideoStat$TypeVideoOpenDescriptionModalClick typeVideoOpenDescriptionModalClick;

        @pmi0("type_video_open_playlist_click")
        private final MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick typeVideoOpenPlaylistClick;

        @pmi0("type_video_player_music_track_click")
        private final CommonVideoStat$TypeVideoPlayerMusicTrackClick typeVideoPlayerMusicTrackClick;

        @pmi0("type_video_playlist_add_item_click")
        private final MobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemClick typeVideoPlaylistAddItemClick;

        @pmi0("type_video_playlist_add_item_search_click")
        private final MobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemSearchClick typeVideoPlaylistAddItemSearchClick;

        @pmi0("type_video_playlist_change_order")
        private final MobileOfficialAppsVideoStat$TypeVideoPlaylistChangeOrder typeVideoPlaylistChangeOrder;

        @pmi0("type_video_postponed_publication_click")
        private final MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick typeVideoPostponedPublicationClick;

        @pmi0("type_video_profile_click_link")
        private final MobileOfficialAppsVideoStat$TypeVideoProfileClickLink typeVideoProfileClickLink;

        @pmi0("type_video_quality_change_in_player")
        private final MobileOfficialAppsVideoStat$TypeVideoQualityChangeInPlayer typeVideoQualityChangeInPlayer;

        @pmi0("type_video_report_button_click")
        private final MobileOfficialAppsVideoStat$TypeVideoReportButtonClick typeVideoReportButtonClick;

        @pmi0("type_video_show_full_video_from_clip_button_tap")
        private final MobileOfficialAppsVideoStat$TypeVideoShowFullVideoFromClipButtonTap typeVideoShowFullVideoFromClipButtonTap;

        @pmi0("type_video_sort_comments_click")
        private final MobileOfficialAppsVideoStat$TypeVideoSortCommentsClick typeVideoSortCommentsClick;

        @pmi0("type_video_subscribtion_button_click")
        private final MobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick typeVideoSubscribtionButtonClick;

        @pmi0("type_video_tab_block_click")
        private final r0 typeVideoTabBlockClick;

        @pmi0("type_video_topshelf_click")
        private final MobileOfficialAppsVideoStat$TypeVideoTopshelfClick typeVideoTopshelfClick;

        @pmi0("type_video_topshelf_mute_click")
        private final MobileOfficialAppsVideoStat$TypeVideoTopshelfMuteClick typeVideoTopshelfMuteClick;

        @pmi0("type_video_upload_additional_option_click")
        private final MobileOfficialAppsVideoStat$TypeVideoUploadAdditionalOptionClick typeVideoUploadAdditionalOptionClick;

        @pmi0("type_video_upload_click")
        private final MobileOfficialAppsVideoStat$TypeVideoUploadClick typeVideoUploadClick;

        @pmi0("type_video_upload_cover_click")
        private final MobileOfficialAppsVideoStat$TypeVideoUploadCoverClick typeVideoUploadCoverClick;

        @pmi0("type_video_upload_option_click")
        private final MobileOfficialAppsVideoStat$TypeVideoUploadOptionClick typeVideoUploadOptionClick;

        @pmi0("type_video_upload_privacy_click")
        private final MobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick typeVideoUploadPrivacyClick;

        @pmi0("type_voip_calls_services_click")
        private final MobileOfficialAppsCallsStat$TypeVoipCallsServicesClick typeVoipCallsServicesClick;

        @pmi0("type_voip_import_contacts_click")
        private final MobileOfficialAppsCallsStat$TypeVoipImportContactsClick typeVoipImportContactsClick;

        @pmi0("type_voip_join_call_click")
        private final MobileOfficialAppsCallsStat$TypeVoipJoinCallClick typeVoipJoinCallClick;

        @pmi0("type_voip_more_menu_click")
        private final MobileOfficialAppsCallsStat$TypeVoipMoreMenuClick typeVoipMoreMenuClick;

        @pmi0("type_voip_outgoing_call_click")
        private final MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick typeVoipOutgoingCallClick;

        @pmi0("type_voip_service_privacy_message_click")
        private final MobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick typeVoipServicePrivacyMessageClick;

        @pmi0("type_voip_share_click")
        private final MobileOfficialAppsCallsStat$TypeVoipShareClick typeVoipShareClick;

        @pmi0("type_voip_share_to_user_click")
        private final MobileOfficialAppsCallsStat$TypeVoipShareToUserClick typeVoipShareToUserClick;

        @pmi0("type_voip_sync_contacts_modal_click")
        private final MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalClick typeVoipSyncContactsModalClick;

        public TypeClick2(SchemeStat$EventItem schemeStat$EventItem, Integer num, Type type, CommonVideoStat$TypeVideoMusicTrackAdd commonVideoStat$TypeVideoMusicTrackAdd, CommonVideoStat$TypeVideoMusicTrackDelete commonVideoStat$TypeVideoMusicTrackDelete, MobileOfficialAppsVideoStat$TypeVideoMusicTrackCardContinueWatch mobileOfficialAppsVideoStat$TypeVideoMusicTrackCardContinueWatch, CommonVideoStat$TypeVideoMusicTrackCardOpenPlaylist commonVideoStat$TypeVideoMusicTrackCardOpenPlaylist, CommonVideoStat$TypeVideoMusicTrackCardSimilarMusicClick commonVideoStat$TypeVideoMusicTrackCardSimilarMusicClick, CommonVideoStat$TypeVideoPlayerMusicTrackClick commonVideoStat$TypeVideoPlayerMusicTrackClick, CommonVideoStat$TypeVideoMusicStreamMixWatchClick commonVideoStat$TypeVideoMusicStreamMixWatchClick, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClose mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClose, MobileOfficialAppsVideoStat$TypeVideoAdTrialClick mobileOfficialAppsVideoStat$TypeVideoAdTrialClick, MobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugClick mobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugClick, MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick mobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick, CommonVideoStat$TypeNextPrevVideoButtonTap commonVideoStat$TypeNextPrevVideoButtonTap, z zVar, MobileOfficialAppsVideoStat$TypeVideoAlbumCreateClick mobileOfficialAppsVideoStat$TypeVideoAlbumCreateClick, MobileOfficialAppsVideoStat$TypeVideoAlbumEditClick mobileOfficialAppsVideoStat$TypeVideoAlbumEditClick, MobileOfficialAppsVideoStat$TypeVideoAlbumEditorCoverClick mobileOfficialAppsVideoStat$TypeVideoAlbumEditorCoverClick, MobileOfficialAppsVideoStat$TypeVideoAlbumEditorPrivacyClick mobileOfficialAppsVideoStat$TypeVideoAlbumEditorPrivacyClick, MobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick mobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick, MobileOfficialAppsVideoStat$TypeVideoUploadClick mobileOfficialAppsVideoStat$TypeVideoUploadClick, MobileOfficialAppsVideoStat$TypeVideoDraftClick mobileOfficialAppsVideoStat$TypeVideoDraftClick, MobileOfficialAppsVideoStat$TypeVideoChangeProfileButtonTap mobileOfficialAppsVideoStat$TypeVideoChangeProfileButtonTap, MobileOfficialAppsVideoStat$TypeVideoUploadCoverClick mobileOfficialAppsVideoStat$TypeVideoUploadCoverClick, CommonVideoStat$TypeVideoCreateChannelClick commonVideoStat$TypeVideoCreateChannelClick, CommonVideoStat$TypeVideoChannelOnboardingClick commonVideoStat$TypeVideoChannelOnboardingClick, MobileOfficialAppsVideoStat$TypeVideoShowFullVideoFromClipButtonTap mobileOfficialAppsVideoStat$TypeVideoShowFullVideoFromClipButtonTap, MobileOfficialAppsImStat$TypeImCounterSettingsClick mobileOfficialAppsImStat$TypeImCounterSettingsClick, MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick mobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick, MobileOfficialAppsFeedStat$TypeFeedPostTextAction mobileOfficialAppsFeedStat$TypeFeedPostTextAction, MobileOfficialAppsVideoStat$TypeVideoCatalogWarmupClick mobileOfficialAppsVideoStat$TypeVideoCatalogWarmupClick, MobileOfficialAppsVideoStat$TypeVideoChildProfileClicks mobileOfficialAppsVideoStat$TypeVideoChildProfileClicks, MobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick mobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick, MobileOfficialAppsVideoStat$TypeVideoQualityChangeInPlayer mobileOfficialAppsVideoStat$TypeVideoQualityChangeInPlayer, MobileOfficialAppsVideoStat$IdfaPermissionScreenClick mobileOfficialAppsVideoStat$IdfaPermissionScreenClick, CommonAudioStat$TypeAudioUiClickItem commonAudioStat$TypeAudioUiClickItem, CommonAudioStat$TypeAudioPlayerUiClickItem commonAudioStat$TypeAudioPlayerUiClickItem, CommonAudioStat$TypeAudioTrackMenuUiClickItem commonAudioStat$TypeAudioTrackMenuUiClickItem, MobileOfficialAppsVideoStat$TypeVideoTopshelfMuteClick mobileOfficialAppsVideoStat$TypeVideoTopshelfMuteClick, CommonVideoStat$TypeClickSkipItem commonVideoStat$TypeClickSkipItem, MobileOfficialAppsVideoStat$TypeVideoTopshelfClick mobileOfficialAppsVideoStat$TypeVideoTopshelfClick, MobileOfficialAppsVideoStat$TypeVideoCategoryBlockItemClick mobileOfficialAppsVideoStat$TypeVideoCategoryBlockItemClick, MobileOfficialAppsVideoStat$TypeVideoProfileClickLink mobileOfficialAppsVideoStat$TypeVideoProfileClickLink, MobileOfficialAppsVideoStat$TypeVideoInstallTrapClick mobileOfficialAppsVideoStat$TypeVideoInstallTrapClick, MobileOfficialAppsFeedStat$TypeFeedPostComponentClick mobileOfficialAppsFeedStat$TypeFeedPostComponentClick, MobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemClick mobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemClick, MobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemSearchClick mobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemSearchClick, MobileOfficialAppsVideoStat$TypeVideoActionAtExternalLink mobileOfficialAppsVideoStat$TypeVideoActionAtExternalLink, MobileOfficialAppsVideoStat$TypeVideoClickToggleShowChannelLinks mobileOfficialAppsVideoStat$TypeVideoClickToggleShowChannelLinks, CommonVideoStat$TypeVideoMoviePageButtonClick commonVideoStat$TypeVideoMoviePageButtonClick, MobileOfficialAppsVideoStat$TypeVideoActionMenuButtonClick mobileOfficialAppsVideoStat$TypeVideoActionMenuButtonClick, MobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick mobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick, MobileOfficialAppsVideoStat$TypeVideoOpenCommentsClick mobileOfficialAppsVideoStat$TypeVideoOpenCommentsClick, MobileOfficialAppsCallsStat$TypeVoipShareClick mobileOfficialAppsCallsStat$TypeVoipShareClick, MobileOfficialAppsCallsStat$TypeVoipImportContactsClick mobileOfficialAppsCallsStat$TypeVoipImportContactsClick, MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalClick mobileOfficialAppsCallsStat$TypeVoipSyncContactsModalClick, MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick mobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick, MobileOfficialAppsCallsStat$TypeVoipMoreMenuClick mobileOfficialAppsCallsStat$TypeVoipMoreMenuClick, MobileOfficialAppsCallsStat$TypeVoipJoinCallClick mobileOfficialAppsCallsStat$TypeVoipJoinCallClick, MobileOfficialAppsCallsStat$TypeVoipCallsServicesClick mobileOfficialAppsCallsStat$TypeVoipCallsServicesClick, MobileOfficialAppsCallsStat$TypeVoipShareToUserClick mobileOfficialAppsCallsStat$TypeVoipShareToUserClick, MobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick mobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick, MobileOfficialAppsVideoStat$TypeVideoAddToMyVideosClick mobileOfficialAppsVideoStat$TypeVideoAddToMyVideosClick, MobileOfficialAppsVideoStat$TypeVideoLikeClick mobileOfficialAppsVideoStat$TypeVideoLikeClick, e0 e0Var, MobileOfficialAppsVideoStat$TypeVideoUploadOptionClick mobileOfficialAppsVideoStat$TypeVideoUploadOptionClick, MobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick mobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick, MobileOfficialAppsVideoStat$TypeVideoUploadAdditionalOptionClick mobileOfficialAppsVideoStat$TypeVideoUploadAdditionalOptionClick, MobileOfficialAppsVideoStat$TypeVideoCreatePlaylistClick mobileOfficialAppsVideoStat$TypeVideoCreatePlaylistClick, CommonVideoStat$TypeVideoAgeMarkClick commonVideoStat$TypeVideoAgeMarkClick, CommonVideoStat$TypeVideoChannelAPlusTagClick commonVideoStat$TypeVideoChannelAPlusTagClick, CommonVideoStat$TypeVideoContentWarningModalClick commonVideoStat$TypeVideoContentWarningModalClick, MobileOfficialAppsAdsStat$TypeFeedSdkAdClick mobileOfficialAppsAdsStat$TypeFeedSdkAdClick, CommonCommunitiesStat$TypeCommunitiesClick commonCommunitiesStat$TypeCommunitiesClick, MobileOfficialAppsVideoStat$TypeDeleteItemClick mobileOfficialAppsVideoStat$TypeDeleteItemClick, MobileOfficialAppsVideoStat$TypeVideoOpenDescriptionModalClick mobileOfficialAppsVideoStat$TypeVideoOpenDescriptionModalClick, MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick mobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick, MobileOfficialAppsVideoStat$TypeVideoOpenAuthorCabinetClick mobileOfficialAppsVideoStat$TypeVideoOpenAuthorCabinetClick, MobileOfficialAppsVideoStat$TypeVideoPlaylistChangeOrder mobileOfficialAppsVideoStat$TypeVideoPlaylistChangeOrder, SchemeStat$TypeChannelItem schemeStat$TypeChannelItem, CommonVideoOtherChannelsStat$TypeSimilarChannelsCardClick commonVideoOtherChannelsStat$TypeSimilarChannelsCardClick, CommonVideoOtherChannelsStat$TypeSimilarChannelsSubscriptionClick commonVideoOtherChannelsStat$TypeSimilarChannelsSubscriptionClick, MobileOfficialAppsProfileStat$TypeOpenProfileClick mobileOfficialAppsProfileStat$TypeOpenProfileClick, MobileOfficialAppsProfileStat$TypeProfileFriendAddClick mobileOfficialAppsProfileStat$TypeProfileFriendAddClick, MobileOfficialAppsProfileStat$TypeProfileFriendConfirmClick mobileOfficialAppsProfileStat$TypeProfileFriendConfirmClick, MobileOfficialAppsVideoStat$TypeVideoModalEpisodeOpenClick mobileOfficialAppsVideoStat$TypeVideoModalEpisodeOpenClick, MobileOfficialAppsVideoStat$TypeVideoReportButtonClick mobileOfficialAppsVideoStat$TypeVideoReportButtonClick, CommonCommunitiesStat$TypeCommunityScreenLoadRetryClick commonCommunitiesStat$TypeCommunityScreenLoadRetryClick, CommonCommunitiesStat$TypeCommunityScreenTabLoadRetryClick commonCommunitiesStat$TypeCommunityScreenTabLoadRetryClick, r0 r0Var, MobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent mobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent, MobileOfficialAppsVideoStat$TypeVideoSortCommentsClick mobileOfficialAppsVideoStat$TypeVideoSortCommentsClick, MobileOfficialAppsVideoStat$TypeVideoLandingTvInstallClick mobileOfficialAppsVideoStat$TypeVideoLandingTvInstallClick, MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClick mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClick, MobileOfficialAppsVideoStat$TypeOverlayLiveProductCloseClick mobileOfficialAppsVideoStat$TypeOverlayLiveProductCloseClick, MobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner mobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner, MobileOfficialAppsVideoStat$TypeInstallVkvideoModal mobileOfficialAppsVideoStat$TypeInstallVkvideoModal, CommonVideoStat$TypeVideoAssistantChatOpenClick commonVideoStat$TypeVideoAssistantChatOpenClick, CommonVideoStat$TypeVideoAssistantChatCloseClick commonVideoStat$TypeVideoAssistantChatCloseClick, CommonVideoStat$TypeVideoAssistantMessageSendClick commonVideoStat$TypeVideoAssistantMessageSendClick, CommonVideoStat$TypeVideoAssistantMessageSetLikeClick commonVideoStat$TypeVideoAssistantMessageSetLikeClick, CommonVideoStat$TypeVideoAssistantMessageUnsetLikeClick commonVideoStat$TypeVideoAssistantMessageUnsetLikeClick, CommonVideoStat$TypeVideoAssistantMessageSetDislikeClick commonVideoStat$TypeVideoAssistantMessageSetDislikeClick, CommonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick commonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick, CommonVideoStat$TypeVideoAssistantFeedbackSendClick commonVideoStat$TypeVideoAssistantFeedbackSendClick, CommonVideoStat$TypeVideoAssistantPlaylistAddClick commonVideoStat$TypeVideoAssistantPlaylistAddClick, CommonVideoStat$TypeVideoAssistantPlaylistOpenClick commonVideoStat$TypeVideoAssistantPlaylistOpenClick, CommonVideoStat$TypeVideoAssistantVideoOpenClick commonVideoStat$TypeVideoAssistantVideoOpenClick, CommonVideoStat$TypeVideoAssistantDeleteClick commonVideoStat$TypeVideoAssistantDeleteClick, CommonVideoStat$TypeVideoAssistantChatsListClick commonVideoStat$TypeVideoAssistantChatsListClick, CommonVideoStat$TypeVideoAssistantChatsListMenuClick commonVideoStat$TypeVideoAssistantChatsListMenuClick, CommonVideoStat$TypeVideoAssistantPlaylistToastOpenClick commonVideoStat$TypeVideoAssistantPlaylistToastOpenClick) {
            this.item = schemeStat$EventItem;
            this.position = num;
            this.type = type;
            this.typeVideoMusicTrackAdd = commonVideoStat$TypeVideoMusicTrackAdd;
            this.typeVideoMusicTrackDelete = commonVideoStat$TypeVideoMusicTrackDelete;
            this.typeVideoMusicTrackCardContinueWatch = mobileOfficialAppsVideoStat$TypeVideoMusicTrackCardContinueWatch;
            this.typeVideoMusicTrackCardOpenPlaylist = commonVideoStat$TypeVideoMusicTrackCardOpenPlaylist;
            this.typeVideoMusicTrackCardSimilarMusicClick = commonVideoStat$TypeVideoMusicTrackCardSimilarMusicClick;
            this.typeVideoPlayerMusicTrackClick = commonVideoStat$TypeVideoPlayerMusicTrackClick;
            this.typeVideoMusicStreamMixWatchClick = commonVideoStat$TypeVideoMusicStreamMixWatchClick;
            this.typeVideoAdSubscriptionOfferClick = mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick;
            this.typeVideoAdSubscriptionOfferClose = mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClose;
            this.typeVideoAdTrialClick = mobileOfficialAppsVideoStat$TypeVideoAdTrialClick;
            this.typeVideoInfoAboutDrugClick = mobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugClick;
            this.typeVideoPostponedPublicationClick = mobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick;
            this.typeVideoNextPrevVideoButtonTap = commonVideoStat$TypeNextPrevVideoButtonTap;
            this.typeFeedInlineCommentInputClick = zVar;
            this.typeVideoAlbumCreateClick = mobileOfficialAppsVideoStat$TypeVideoAlbumCreateClick;
            this.typeVideoAlbumEditClick = mobileOfficialAppsVideoStat$TypeVideoAlbumEditClick;
            this.typeVideoAlbumEditorCoverClick = mobileOfficialAppsVideoStat$TypeVideoAlbumEditorCoverClick;
            this.typeVideoAlbumEditorPrivacyClick = mobileOfficialAppsVideoStat$TypeVideoAlbumEditorPrivacyClick;
            this.typeVideoAddToAlbumClick = mobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick;
            this.typeVideoUploadClick = mobileOfficialAppsVideoStat$TypeVideoUploadClick;
            this.typeVideoDraftClick = mobileOfficialAppsVideoStat$TypeVideoDraftClick;
            this.typeVideoChangeProfileButtonTap = mobileOfficialAppsVideoStat$TypeVideoChangeProfileButtonTap;
            this.typeVideoUploadCoverClick = mobileOfficialAppsVideoStat$TypeVideoUploadCoverClick;
            this.typeVideoCreateChannelClick = commonVideoStat$TypeVideoCreateChannelClick;
            this.typeVideoChannelOnboardingClick = commonVideoStat$TypeVideoChannelOnboardingClick;
            this.typeVideoShowFullVideoFromClipButtonTap = mobileOfficialAppsVideoStat$TypeVideoShowFullVideoFromClipButtonTap;
            this.typeImCounterSettingsClick = mobileOfficialAppsImStat$TypeImCounterSettingsClick;
            this.typeImPushNotificationsSettingsClick = mobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick;
            this.typeFeedPostTextAction = mobileOfficialAppsFeedStat$TypeFeedPostTextAction;
            this.typeVideoCatalogWarmupClick = mobileOfficialAppsVideoStat$TypeVideoCatalogWarmupClick;
            this.typeVideoChildProfileClicks = mobileOfficialAppsVideoStat$TypeVideoChildProfileClicks;
            this.typeFeedPostDonutPaymentClick = mobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick;
            this.typeVideoQualityChangeInPlayer = mobileOfficialAppsVideoStat$TypeVideoQualityChangeInPlayer;
            this.idfaPermissionScreenClick = mobileOfficialAppsVideoStat$IdfaPermissionScreenClick;
            this.typeAudioUiClickItem = commonAudioStat$TypeAudioUiClickItem;
            this.typeAudioPlayerUiClickItem = commonAudioStat$TypeAudioPlayerUiClickItem;
            this.typeAudioTrackMenuUiClickItem = commonAudioStat$TypeAudioTrackMenuUiClickItem;
            this.typeVideoTopshelfMuteClick = mobileOfficialAppsVideoStat$TypeVideoTopshelfMuteClick;
            this.typeClickSkipItem = commonVideoStat$TypeClickSkipItem;
            this.typeVideoTopshelfClick = mobileOfficialAppsVideoStat$TypeVideoTopshelfClick;
            this.typeVideoCategoryBlockItemClick = mobileOfficialAppsVideoStat$TypeVideoCategoryBlockItemClick;
            this.typeVideoProfileClickLink = mobileOfficialAppsVideoStat$TypeVideoProfileClickLink;
            this.typeVideoInstallTrapClick = mobileOfficialAppsVideoStat$TypeVideoInstallTrapClick;
            this.typeFeedPostComponentClick = mobileOfficialAppsFeedStat$TypeFeedPostComponentClick;
            this.typeVideoPlaylistAddItemClick = mobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemClick;
            this.typeVideoPlaylistAddItemSearchClick = mobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemSearchClick;
            this.typeVideoActionAtExternalLink = mobileOfficialAppsVideoStat$TypeVideoActionAtExternalLink;
            this.typeVideoClickToggleShowChannelLinks = mobileOfficialAppsVideoStat$TypeVideoClickToggleShowChannelLinks;
            this.typeVideoMoviePageButtonClick = commonVideoStat$TypeVideoMoviePageButtonClick;
            this.typeVideoActionMenuButtonClick = mobileOfficialAppsVideoStat$TypeVideoActionMenuButtonClick;
            this.typeVideoSubscribtionButtonClick = mobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick;
            this.typeVideoOpenCommentsClick = mobileOfficialAppsVideoStat$TypeVideoOpenCommentsClick;
            this.typeVoipShareClick = mobileOfficialAppsCallsStat$TypeVoipShareClick;
            this.typeVoipImportContactsClick = mobileOfficialAppsCallsStat$TypeVoipImportContactsClick;
            this.typeVoipSyncContactsModalClick = mobileOfficialAppsCallsStat$TypeVoipSyncContactsModalClick;
            this.typeVoipOutgoingCallClick = mobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick;
            this.typeVoipMoreMenuClick = mobileOfficialAppsCallsStat$TypeVoipMoreMenuClick;
            this.typeVoipJoinCallClick = mobileOfficialAppsCallsStat$TypeVoipJoinCallClick;
            this.typeVoipCallsServicesClick = mobileOfficialAppsCallsStat$TypeVoipCallsServicesClick;
            this.typeVoipShareToUserClick = mobileOfficialAppsCallsStat$TypeVoipShareToUserClick;
            this.typeVoipServicePrivacyMessageClick = mobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick;
            this.typeVideoAddToMyVideosClick = mobileOfficialAppsVideoStat$TypeVideoAddToMyVideosClick;
            this.typeVideoLikeClick = mobileOfficialAppsVideoStat$TypeVideoLikeClick;
            this.typeCommunitySportBlockVideoLiveClick = e0Var;
            this.typeVideoUploadOptionClick = mobileOfficialAppsVideoStat$TypeVideoUploadOptionClick;
            this.typeVideoUploadPrivacyClick = mobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick;
            this.typeVideoUploadAdditionalOptionClick = mobileOfficialAppsVideoStat$TypeVideoUploadAdditionalOptionClick;
            this.typeVideoCreatePlaylistClick = mobileOfficialAppsVideoStat$TypeVideoCreatePlaylistClick;
            this.typeVideoAgeMarkClick = commonVideoStat$TypeVideoAgeMarkClick;
            this.typeVideoChannelAPlusTagClick = commonVideoStat$TypeVideoChannelAPlusTagClick;
            this.typeVideoContentWarningModalClick = commonVideoStat$TypeVideoContentWarningModalClick;
            this.typeFeedSdkAdClick = mobileOfficialAppsAdsStat$TypeFeedSdkAdClick;
            this.typeCommunitiesClick = commonCommunitiesStat$TypeCommunitiesClick;
            this.typeDeleteItemClick = mobileOfficialAppsVideoStat$TypeDeleteItemClick;
            this.typeVideoOpenDescriptionModalClick = mobileOfficialAppsVideoStat$TypeVideoOpenDescriptionModalClick;
            this.typeVideoOpenPlaylistClick = mobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick;
            this.typeVideoOpenAuthorCabinetClick = mobileOfficialAppsVideoStat$TypeVideoOpenAuthorCabinetClick;
            this.typeVideoPlaylistChangeOrder = mobileOfficialAppsVideoStat$TypeVideoPlaylistChangeOrder;
            this.typeChannelItem = schemeStat$TypeChannelItem;
            this.typeSimilarChannelsCardClick = commonVideoOtherChannelsStat$TypeSimilarChannelsCardClick;
            this.typeSimilarChannelsSubscriptionClick = commonVideoOtherChannelsStat$TypeSimilarChannelsSubscriptionClick;
            this.typeOpenProfileClick = mobileOfficialAppsProfileStat$TypeOpenProfileClick;
            this.typeProfileFriendAddClick = mobileOfficialAppsProfileStat$TypeProfileFriendAddClick;
            this.typeProfileFriendConfirmClick = mobileOfficialAppsProfileStat$TypeProfileFriendConfirmClick;
            this.typeVideoModalEpisodeOpenClick = mobileOfficialAppsVideoStat$TypeVideoModalEpisodeOpenClick;
            this.typeVideoReportButtonClick = mobileOfficialAppsVideoStat$TypeVideoReportButtonClick;
            this.typeCommunityScreenLoadRetryClick = commonCommunitiesStat$TypeCommunityScreenLoadRetryClick;
            this.typeCommunityScreenTabLoadRetryClick = commonCommunitiesStat$TypeCommunityScreenTabLoadRetryClick;
            this.typeVideoTabBlockClick = r0Var;
            this.typeVideoOfflineSnackbarClick = mobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent;
            this.typeVideoSortCommentsClick = mobileOfficialAppsVideoStat$TypeVideoSortCommentsClick;
            this.typeVideoLandingTvInstallClick = mobileOfficialAppsVideoStat$TypeVideoLandingTvInstallClick;
            this.typeOverlayLiveProductCardClick = mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClick;
            this.typeOverlayLiveProductCloseClick = mobileOfficialAppsVideoStat$TypeOverlayLiveProductCloseClick;
            this.typeSuperappVkvideoBanner = mobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner;
            this.typeInstallVkvideoModal = mobileOfficialAppsVideoStat$TypeInstallVkvideoModal;
            this.typeVideoAssistantChatOpenClick = commonVideoStat$TypeVideoAssistantChatOpenClick;
            this.typeVideoAssistantChatCloseClick = commonVideoStat$TypeVideoAssistantChatCloseClick;
            this.typeVideoAssistantMessageSendClick = commonVideoStat$TypeVideoAssistantMessageSendClick;
            this.typeVideoAssistantMessageSetLikeClick = commonVideoStat$TypeVideoAssistantMessageSetLikeClick;
            this.typeVideoAssistantMessageUnsetLikeClick = commonVideoStat$TypeVideoAssistantMessageUnsetLikeClick;
            this.typeVideoAssistantMessageSetDislikeClick = commonVideoStat$TypeVideoAssistantMessageSetDislikeClick;
            this.typeVideoAssistantMessageUnsetDislikeClick = commonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick;
            this.typeVideoAssistantFeedbackSendClick = commonVideoStat$TypeVideoAssistantFeedbackSendClick;
            this.typeVideoAssistantPlaylistAddClick = commonVideoStat$TypeVideoAssistantPlaylistAddClick;
            this.typeVideoAssistantPlaylistOpenClick = commonVideoStat$TypeVideoAssistantPlaylistOpenClick;
            this.typeVideoAssistantVideoOpenClick = commonVideoStat$TypeVideoAssistantVideoOpenClick;
            this.typeVideoAssistantDeleteClick = commonVideoStat$TypeVideoAssistantDeleteClick;
            this.typeVideoAssistantChatsListClick = commonVideoStat$TypeVideoAssistantChatsListClick;
            this.typeVideoAssistantChatsListMenuClick = commonVideoStat$TypeVideoAssistantChatsListMenuClick;
            this.typeVideoAssistantPlaylistToastOpenClick = commonVideoStat$TypeVideoAssistantPlaylistToastOpenClick;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TypeClick2)) {
                return false;
            }
            TypeClick2 typeClick2 = (TypeClick2) obj;
            return epx.f(this.item, typeClick2.item) && epx.f(this.position, typeClick2.position) && this.type == typeClick2.type && epx.f(this.typeVideoMusicTrackAdd, typeClick2.typeVideoMusicTrackAdd) && epx.f(this.typeVideoMusicTrackDelete, typeClick2.typeVideoMusicTrackDelete) && epx.f(this.typeVideoMusicTrackCardContinueWatch, typeClick2.typeVideoMusicTrackCardContinueWatch) && epx.f(this.typeVideoMusicTrackCardOpenPlaylist, typeClick2.typeVideoMusicTrackCardOpenPlaylist) && epx.f(this.typeVideoMusicTrackCardSimilarMusicClick, typeClick2.typeVideoMusicTrackCardSimilarMusicClick) && epx.f(this.typeVideoPlayerMusicTrackClick, typeClick2.typeVideoPlayerMusicTrackClick) && epx.f(this.typeVideoMusicStreamMixWatchClick, typeClick2.typeVideoMusicStreamMixWatchClick) && epx.f(this.typeVideoAdSubscriptionOfferClick, typeClick2.typeVideoAdSubscriptionOfferClick) && epx.f(this.typeVideoAdSubscriptionOfferClose, typeClick2.typeVideoAdSubscriptionOfferClose) && epx.f(this.typeVideoAdTrialClick, typeClick2.typeVideoAdTrialClick) && epx.f(this.typeVideoInfoAboutDrugClick, typeClick2.typeVideoInfoAboutDrugClick) && epx.f(this.typeVideoPostponedPublicationClick, typeClick2.typeVideoPostponedPublicationClick) && epx.f(this.typeVideoNextPrevVideoButtonTap, typeClick2.typeVideoNextPrevVideoButtonTap) && epx.f(this.typeFeedInlineCommentInputClick, typeClick2.typeFeedInlineCommentInputClick) && epx.f(this.typeVideoAlbumCreateClick, typeClick2.typeVideoAlbumCreateClick) && epx.f(this.typeVideoAlbumEditClick, typeClick2.typeVideoAlbumEditClick) && epx.f(this.typeVideoAlbumEditorCoverClick, typeClick2.typeVideoAlbumEditorCoverClick) && epx.f(this.typeVideoAlbumEditorPrivacyClick, typeClick2.typeVideoAlbumEditorPrivacyClick) && epx.f(this.typeVideoAddToAlbumClick, typeClick2.typeVideoAddToAlbumClick) && epx.f(this.typeVideoUploadClick, typeClick2.typeVideoUploadClick) && epx.f(this.typeVideoDraftClick, typeClick2.typeVideoDraftClick) && epx.f(this.typeVideoChangeProfileButtonTap, typeClick2.typeVideoChangeProfileButtonTap) && epx.f(this.typeVideoUploadCoverClick, typeClick2.typeVideoUploadCoverClick) && epx.f(this.typeVideoCreateChannelClick, typeClick2.typeVideoCreateChannelClick) && epx.f(this.typeVideoChannelOnboardingClick, typeClick2.typeVideoChannelOnboardingClick) && epx.f(this.typeVideoShowFullVideoFromClipButtonTap, typeClick2.typeVideoShowFullVideoFromClipButtonTap) && epx.f(this.typeImCounterSettingsClick, typeClick2.typeImCounterSettingsClick) && epx.f(this.typeImPushNotificationsSettingsClick, typeClick2.typeImPushNotificationsSettingsClick) && epx.f(this.typeFeedPostTextAction, typeClick2.typeFeedPostTextAction) && epx.f(this.typeVideoCatalogWarmupClick, typeClick2.typeVideoCatalogWarmupClick) && epx.f(this.typeVideoChildProfileClicks, typeClick2.typeVideoChildProfileClicks) && epx.f(this.typeFeedPostDonutPaymentClick, typeClick2.typeFeedPostDonutPaymentClick) && epx.f(this.typeVideoQualityChangeInPlayer, typeClick2.typeVideoQualityChangeInPlayer) && epx.f(this.idfaPermissionScreenClick, typeClick2.idfaPermissionScreenClick) && epx.f(this.typeAudioUiClickItem, typeClick2.typeAudioUiClickItem) && epx.f(this.typeAudioPlayerUiClickItem, typeClick2.typeAudioPlayerUiClickItem) && epx.f(this.typeAudioTrackMenuUiClickItem, typeClick2.typeAudioTrackMenuUiClickItem) && epx.f(this.typeVideoTopshelfMuteClick, typeClick2.typeVideoTopshelfMuteClick) && epx.f(this.typeClickSkipItem, typeClick2.typeClickSkipItem) && epx.f(this.typeVideoTopshelfClick, typeClick2.typeVideoTopshelfClick) && epx.f(this.typeVideoCategoryBlockItemClick, typeClick2.typeVideoCategoryBlockItemClick) && epx.f(this.typeVideoProfileClickLink, typeClick2.typeVideoProfileClickLink) && epx.f(this.typeVideoInstallTrapClick, typeClick2.typeVideoInstallTrapClick) && epx.f(this.typeFeedPostComponentClick, typeClick2.typeFeedPostComponentClick) && epx.f(this.typeVideoPlaylistAddItemClick, typeClick2.typeVideoPlaylistAddItemClick) && epx.f(this.typeVideoPlaylistAddItemSearchClick, typeClick2.typeVideoPlaylistAddItemSearchClick) && epx.f(this.typeVideoActionAtExternalLink, typeClick2.typeVideoActionAtExternalLink) && epx.f(this.typeVideoClickToggleShowChannelLinks, typeClick2.typeVideoClickToggleShowChannelLinks) && epx.f(this.typeVideoMoviePageButtonClick, typeClick2.typeVideoMoviePageButtonClick) && epx.f(this.typeVideoActionMenuButtonClick, typeClick2.typeVideoActionMenuButtonClick) && epx.f(this.typeVideoSubscribtionButtonClick, typeClick2.typeVideoSubscribtionButtonClick) && epx.f(this.typeVideoOpenCommentsClick, typeClick2.typeVideoOpenCommentsClick) && epx.f(this.typeVoipShareClick, typeClick2.typeVoipShareClick) && epx.f(this.typeVoipImportContactsClick, typeClick2.typeVoipImportContactsClick) && epx.f(this.typeVoipSyncContactsModalClick, typeClick2.typeVoipSyncContactsModalClick) && epx.f(this.typeVoipOutgoingCallClick, typeClick2.typeVoipOutgoingCallClick) && epx.f(this.typeVoipMoreMenuClick, typeClick2.typeVoipMoreMenuClick) && epx.f(this.typeVoipJoinCallClick, typeClick2.typeVoipJoinCallClick) && epx.f(this.typeVoipCallsServicesClick, typeClick2.typeVoipCallsServicesClick) && epx.f(this.typeVoipShareToUserClick, typeClick2.typeVoipShareToUserClick) && epx.f(this.typeVoipServicePrivacyMessageClick, typeClick2.typeVoipServicePrivacyMessageClick) && epx.f(this.typeVideoAddToMyVideosClick, typeClick2.typeVideoAddToMyVideosClick) && epx.f(this.typeVideoLikeClick, typeClick2.typeVideoLikeClick) && epx.f(this.typeCommunitySportBlockVideoLiveClick, typeClick2.typeCommunitySportBlockVideoLiveClick) && epx.f(this.typeVideoUploadOptionClick, typeClick2.typeVideoUploadOptionClick) && epx.f(this.typeVideoUploadPrivacyClick, typeClick2.typeVideoUploadPrivacyClick) && epx.f(this.typeVideoUploadAdditionalOptionClick, typeClick2.typeVideoUploadAdditionalOptionClick) && epx.f(this.typeVideoCreatePlaylistClick, typeClick2.typeVideoCreatePlaylistClick) && epx.f(this.typeVideoAgeMarkClick, typeClick2.typeVideoAgeMarkClick) && epx.f(this.typeVideoChannelAPlusTagClick, typeClick2.typeVideoChannelAPlusTagClick) && epx.f(this.typeVideoContentWarningModalClick, typeClick2.typeVideoContentWarningModalClick) && epx.f(this.typeFeedSdkAdClick, typeClick2.typeFeedSdkAdClick) && epx.f(this.typeCommunitiesClick, typeClick2.typeCommunitiesClick) && epx.f(this.typeDeleteItemClick, typeClick2.typeDeleteItemClick) && epx.f(this.typeVideoOpenDescriptionModalClick, typeClick2.typeVideoOpenDescriptionModalClick) && epx.f(this.typeVideoOpenPlaylistClick, typeClick2.typeVideoOpenPlaylistClick) && epx.f(this.typeVideoOpenAuthorCabinetClick, typeClick2.typeVideoOpenAuthorCabinetClick) && epx.f(this.typeVideoPlaylistChangeOrder, typeClick2.typeVideoPlaylistChangeOrder) && epx.f(this.typeChannelItem, typeClick2.typeChannelItem) && epx.f(this.typeSimilarChannelsCardClick, typeClick2.typeSimilarChannelsCardClick) && epx.f(this.typeSimilarChannelsSubscriptionClick, typeClick2.typeSimilarChannelsSubscriptionClick) && epx.f(this.typeOpenProfileClick, typeClick2.typeOpenProfileClick) && epx.f(this.typeProfileFriendAddClick, typeClick2.typeProfileFriendAddClick) && epx.f(this.typeProfileFriendConfirmClick, typeClick2.typeProfileFriendConfirmClick) && epx.f(this.typeVideoModalEpisodeOpenClick, typeClick2.typeVideoModalEpisodeOpenClick) && epx.f(this.typeVideoReportButtonClick, typeClick2.typeVideoReportButtonClick) && epx.f(this.typeCommunityScreenLoadRetryClick, typeClick2.typeCommunityScreenLoadRetryClick) && epx.f(this.typeCommunityScreenTabLoadRetryClick, typeClick2.typeCommunityScreenTabLoadRetryClick) && epx.f(this.typeVideoTabBlockClick, typeClick2.typeVideoTabBlockClick) && epx.f(this.typeVideoOfflineSnackbarClick, typeClick2.typeVideoOfflineSnackbarClick) && epx.f(this.typeVideoSortCommentsClick, typeClick2.typeVideoSortCommentsClick) && epx.f(this.typeVideoLandingTvInstallClick, typeClick2.typeVideoLandingTvInstallClick) && epx.f(this.typeOverlayLiveProductCardClick, typeClick2.typeOverlayLiveProductCardClick) && epx.f(this.typeOverlayLiveProductCloseClick, typeClick2.typeOverlayLiveProductCloseClick) && epx.f(this.typeSuperappVkvideoBanner, typeClick2.typeSuperappVkvideoBanner) && epx.f(this.typeInstallVkvideoModal, typeClick2.typeInstallVkvideoModal) && epx.f(this.typeVideoAssistantChatOpenClick, typeClick2.typeVideoAssistantChatOpenClick) && epx.f(this.typeVideoAssistantChatCloseClick, typeClick2.typeVideoAssistantChatCloseClick) && epx.f(this.typeVideoAssistantMessageSendClick, typeClick2.typeVideoAssistantMessageSendClick) && epx.f(this.typeVideoAssistantMessageSetLikeClick, typeClick2.typeVideoAssistantMessageSetLikeClick) && epx.f(this.typeVideoAssistantMessageUnsetLikeClick, typeClick2.typeVideoAssistantMessageUnsetLikeClick) && epx.f(this.typeVideoAssistantMessageSetDislikeClick, typeClick2.typeVideoAssistantMessageSetDislikeClick) && epx.f(this.typeVideoAssistantMessageUnsetDislikeClick, typeClick2.typeVideoAssistantMessageUnsetDislikeClick) && epx.f(this.typeVideoAssistantFeedbackSendClick, typeClick2.typeVideoAssistantFeedbackSendClick) && epx.f(this.typeVideoAssistantPlaylistAddClick, typeClick2.typeVideoAssistantPlaylistAddClick) && epx.f(this.typeVideoAssistantPlaylistOpenClick, typeClick2.typeVideoAssistantPlaylistOpenClick) && epx.f(this.typeVideoAssistantVideoOpenClick, typeClick2.typeVideoAssistantVideoOpenClick) && epx.f(this.typeVideoAssistantDeleteClick, typeClick2.typeVideoAssistantDeleteClick) && epx.f(this.typeVideoAssistantChatsListClick, typeClick2.typeVideoAssistantChatsListClick) && epx.f(this.typeVideoAssistantChatsListMenuClick, typeClick2.typeVideoAssistantChatsListMenuClick) && epx.f(this.typeVideoAssistantPlaylistToastOpenClick, typeClick2.typeVideoAssistantPlaylistToastOpenClick);
        }

        public final int hashCode() {
            int hashCode = this.item.hashCode() * 31;
            Integer num = this.position;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Type type = this.type;
            int hashCode3 = (hashCode2 + (type == null ? 0 : type.hashCode())) * 31;
            CommonVideoStat$TypeVideoMusicTrackAdd commonVideoStat$TypeVideoMusicTrackAdd = this.typeVideoMusicTrackAdd;
            int hashCode4 = (hashCode3 + (commonVideoStat$TypeVideoMusicTrackAdd == null ? 0 : commonVideoStat$TypeVideoMusicTrackAdd.hashCode())) * 31;
            CommonVideoStat$TypeVideoMusicTrackDelete commonVideoStat$TypeVideoMusicTrackDelete = this.typeVideoMusicTrackDelete;
            int hashCode5 = (hashCode4 + (commonVideoStat$TypeVideoMusicTrackDelete == null ? 0 : commonVideoStat$TypeVideoMusicTrackDelete.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoMusicTrackCardContinueWatch mobileOfficialAppsVideoStat$TypeVideoMusicTrackCardContinueWatch = this.typeVideoMusicTrackCardContinueWatch;
            int hashCode6 = (hashCode5 + (mobileOfficialAppsVideoStat$TypeVideoMusicTrackCardContinueWatch == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoMusicTrackCardContinueWatch.hashCode())) * 31;
            CommonVideoStat$TypeVideoMusicTrackCardOpenPlaylist commonVideoStat$TypeVideoMusicTrackCardOpenPlaylist = this.typeVideoMusicTrackCardOpenPlaylist;
            int hashCode7 = (hashCode6 + (commonVideoStat$TypeVideoMusicTrackCardOpenPlaylist == null ? 0 : commonVideoStat$TypeVideoMusicTrackCardOpenPlaylist.hashCode())) * 31;
            CommonVideoStat$TypeVideoMusicTrackCardSimilarMusicClick commonVideoStat$TypeVideoMusicTrackCardSimilarMusicClick = this.typeVideoMusicTrackCardSimilarMusicClick;
            int hashCode8 = (hashCode7 + (commonVideoStat$TypeVideoMusicTrackCardSimilarMusicClick == null ? 0 : commonVideoStat$TypeVideoMusicTrackCardSimilarMusicClick.hashCode())) * 31;
            CommonVideoStat$TypeVideoPlayerMusicTrackClick commonVideoStat$TypeVideoPlayerMusicTrackClick = this.typeVideoPlayerMusicTrackClick;
            int hashCode9 = (hashCode8 + (commonVideoStat$TypeVideoPlayerMusicTrackClick == null ? 0 : commonVideoStat$TypeVideoPlayerMusicTrackClick.hashCode())) * 31;
            CommonVideoStat$TypeVideoMusicStreamMixWatchClick commonVideoStat$TypeVideoMusicStreamMixWatchClick = this.typeVideoMusicStreamMixWatchClick;
            int hashCode10 = (hashCode9 + (commonVideoStat$TypeVideoMusicStreamMixWatchClick == null ? 0 : commonVideoStat$TypeVideoMusicStreamMixWatchClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick = this.typeVideoAdSubscriptionOfferClick;
            int hashCode11 = (hashCode10 + (mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClose mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClose = this.typeVideoAdSubscriptionOfferClose;
            int hashCode12 = (hashCode11 + (mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClose == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClose.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoAdTrialClick mobileOfficialAppsVideoStat$TypeVideoAdTrialClick = this.typeVideoAdTrialClick;
            int hashCode13 = (hashCode12 + (mobileOfficialAppsVideoStat$TypeVideoAdTrialClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoAdTrialClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugClick mobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugClick = this.typeVideoInfoAboutDrugClick;
            int hashCode14 = (hashCode13 + (mobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick mobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick = this.typeVideoPostponedPublicationClick;
            int hashCode15 = (hashCode14 + (mobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick.hashCode())) * 31;
            CommonVideoStat$TypeNextPrevVideoButtonTap commonVideoStat$TypeNextPrevVideoButtonTap = this.typeVideoNextPrevVideoButtonTap;
            int hashCode16 = (hashCode15 + (commonVideoStat$TypeNextPrevVideoButtonTap == null ? 0 : commonVideoStat$TypeNextPrevVideoButtonTap.hashCode())) * 31;
            z zVar = this.typeFeedInlineCommentInputClick;
            int hashCode17 = (hashCode16 + (zVar == null ? 0 : zVar.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoAlbumCreateClick mobileOfficialAppsVideoStat$TypeVideoAlbumCreateClick = this.typeVideoAlbumCreateClick;
            int hashCode18 = (hashCode17 + (mobileOfficialAppsVideoStat$TypeVideoAlbumCreateClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoAlbumCreateClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoAlbumEditClick mobileOfficialAppsVideoStat$TypeVideoAlbumEditClick = this.typeVideoAlbumEditClick;
            int hashCode19 = (hashCode18 + (mobileOfficialAppsVideoStat$TypeVideoAlbumEditClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoAlbumEditClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoAlbumEditorCoverClick mobileOfficialAppsVideoStat$TypeVideoAlbumEditorCoverClick = this.typeVideoAlbumEditorCoverClick;
            int hashCode20 = (hashCode19 + (mobileOfficialAppsVideoStat$TypeVideoAlbumEditorCoverClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoAlbumEditorCoverClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoAlbumEditorPrivacyClick mobileOfficialAppsVideoStat$TypeVideoAlbumEditorPrivacyClick = this.typeVideoAlbumEditorPrivacyClick;
            int hashCode21 = (hashCode20 + (mobileOfficialAppsVideoStat$TypeVideoAlbumEditorPrivacyClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoAlbumEditorPrivacyClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick mobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick = this.typeVideoAddToAlbumClick;
            int hashCode22 = (hashCode21 + (mobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoUploadClick mobileOfficialAppsVideoStat$TypeVideoUploadClick = this.typeVideoUploadClick;
            int hashCode23 = (hashCode22 + (mobileOfficialAppsVideoStat$TypeVideoUploadClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoUploadClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoDraftClick mobileOfficialAppsVideoStat$TypeVideoDraftClick = this.typeVideoDraftClick;
            int hashCode24 = (hashCode23 + (mobileOfficialAppsVideoStat$TypeVideoDraftClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoDraftClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoChangeProfileButtonTap mobileOfficialAppsVideoStat$TypeVideoChangeProfileButtonTap = this.typeVideoChangeProfileButtonTap;
            int hashCode25 = (hashCode24 + (mobileOfficialAppsVideoStat$TypeVideoChangeProfileButtonTap == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoChangeProfileButtonTap.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoUploadCoverClick mobileOfficialAppsVideoStat$TypeVideoUploadCoverClick = this.typeVideoUploadCoverClick;
            int hashCode26 = (hashCode25 + (mobileOfficialAppsVideoStat$TypeVideoUploadCoverClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoUploadCoverClick.hashCode())) * 31;
            CommonVideoStat$TypeVideoCreateChannelClick commonVideoStat$TypeVideoCreateChannelClick = this.typeVideoCreateChannelClick;
            int hashCode27 = (hashCode26 + (commonVideoStat$TypeVideoCreateChannelClick == null ? 0 : commonVideoStat$TypeVideoCreateChannelClick.hashCode())) * 31;
            CommonVideoStat$TypeVideoChannelOnboardingClick commonVideoStat$TypeVideoChannelOnboardingClick = this.typeVideoChannelOnboardingClick;
            int hashCode28 = (hashCode27 + (commonVideoStat$TypeVideoChannelOnboardingClick == null ? 0 : commonVideoStat$TypeVideoChannelOnboardingClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoShowFullVideoFromClipButtonTap mobileOfficialAppsVideoStat$TypeVideoShowFullVideoFromClipButtonTap = this.typeVideoShowFullVideoFromClipButtonTap;
            int hashCode29 = (hashCode28 + (mobileOfficialAppsVideoStat$TypeVideoShowFullVideoFromClipButtonTap == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoShowFullVideoFromClipButtonTap.hashCode())) * 31;
            MobileOfficialAppsImStat$TypeImCounterSettingsClick mobileOfficialAppsImStat$TypeImCounterSettingsClick = this.typeImCounterSettingsClick;
            int hashCode30 = (hashCode29 + (mobileOfficialAppsImStat$TypeImCounterSettingsClick == null ? 0 : mobileOfficialAppsImStat$TypeImCounterSettingsClick.hashCode())) * 31;
            MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick mobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick = this.typeImPushNotificationsSettingsClick;
            int hashCode31 = (hashCode30 + (mobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick == null ? 0 : mobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedPostTextAction mobileOfficialAppsFeedStat$TypeFeedPostTextAction = this.typeFeedPostTextAction;
            int hashCode32 = (hashCode31 + (mobileOfficialAppsFeedStat$TypeFeedPostTextAction == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedPostTextAction.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoCatalogWarmupClick mobileOfficialAppsVideoStat$TypeVideoCatalogWarmupClick = this.typeVideoCatalogWarmupClick;
            int hashCode33 = (hashCode32 + (mobileOfficialAppsVideoStat$TypeVideoCatalogWarmupClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoCatalogWarmupClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoChildProfileClicks mobileOfficialAppsVideoStat$TypeVideoChildProfileClicks = this.typeVideoChildProfileClicks;
            int hashCode34 = (hashCode33 + (mobileOfficialAppsVideoStat$TypeVideoChildProfileClicks == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoChildProfileClicks.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick mobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick = this.typeFeedPostDonutPaymentClick;
            int hashCode35 = (hashCode34 + (mobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoQualityChangeInPlayer mobileOfficialAppsVideoStat$TypeVideoQualityChangeInPlayer = this.typeVideoQualityChangeInPlayer;
            int hashCode36 = (hashCode35 + (mobileOfficialAppsVideoStat$TypeVideoQualityChangeInPlayer == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoQualityChangeInPlayer.hashCode())) * 31;
            MobileOfficialAppsVideoStat$IdfaPermissionScreenClick mobileOfficialAppsVideoStat$IdfaPermissionScreenClick = this.idfaPermissionScreenClick;
            int hashCode37 = (hashCode36 + (mobileOfficialAppsVideoStat$IdfaPermissionScreenClick == null ? 0 : mobileOfficialAppsVideoStat$IdfaPermissionScreenClick.hashCode())) * 31;
            CommonAudioStat$TypeAudioUiClickItem commonAudioStat$TypeAudioUiClickItem = this.typeAudioUiClickItem;
            int hashCode38 = (hashCode37 + (commonAudioStat$TypeAudioUiClickItem == null ? 0 : commonAudioStat$TypeAudioUiClickItem.hashCode())) * 31;
            CommonAudioStat$TypeAudioPlayerUiClickItem commonAudioStat$TypeAudioPlayerUiClickItem = this.typeAudioPlayerUiClickItem;
            int hashCode39 = (hashCode38 + (commonAudioStat$TypeAudioPlayerUiClickItem == null ? 0 : commonAudioStat$TypeAudioPlayerUiClickItem.hashCode())) * 31;
            CommonAudioStat$TypeAudioTrackMenuUiClickItem commonAudioStat$TypeAudioTrackMenuUiClickItem = this.typeAudioTrackMenuUiClickItem;
            int hashCode40 = (hashCode39 + (commonAudioStat$TypeAudioTrackMenuUiClickItem == null ? 0 : commonAudioStat$TypeAudioTrackMenuUiClickItem.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoTopshelfMuteClick mobileOfficialAppsVideoStat$TypeVideoTopshelfMuteClick = this.typeVideoTopshelfMuteClick;
            int hashCode41 = (hashCode40 + (mobileOfficialAppsVideoStat$TypeVideoTopshelfMuteClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoTopshelfMuteClick.hashCode())) * 31;
            CommonVideoStat$TypeClickSkipItem commonVideoStat$TypeClickSkipItem = this.typeClickSkipItem;
            int hashCode42 = (hashCode41 + (commonVideoStat$TypeClickSkipItem == null ? 0 : commonVideoStat$TypeClickSkipItem.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoTopshelfClick mobileOfficialAppsVideoStat$TypeVideoTopshelfClick = this.typeVideoTopshelfClick;
            int hashCode43 = (hashCode42 + (mobileOfficialAppsVideoStat$TypeVideoTopshelfClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoTopshelfClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoCategoryBlockItemClick mobileOfficialAppsVideoStat$TypeVideoCategoryBlockItemClick = this.typeVideoCategoryBlockItemClick;
            int hashCode44 = (hashCode43 + (mobileOfficialAppsVideoStat$TypeVideoCategoryBlockItemClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoCategoryBlockItemClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoProfileClickLink mobileOfficialAppsVideoStat$TypeVideoProfileClickLink = this.typeVideoProfileClickLink;
            int hashCode45 = (hashCode44 + (mobileOfficialAppsVideoStat$TypeVideoProfileClickLink == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoProfileClickLink.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoInstallTrapClick mobileOfficialAppsVideoStat$TypeVideoInstallTrapClick = this.typeVideoInstallTrapClick;
            int hashCode46 = (hashCode45 + (mobileOfficialAppsVideoStat$TypeVideoInstallTrapClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoInstallTrapClick.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedPostComponentClick mobileOfficialAppsFeedStat$TypeFeedPostComponentClick = this.typeFeedPostComponentClick;
            int hashCode47 = (hashCode46 + (mobileOfficialAppsFeedStat$TypeFeedPostComponentClick == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedPostComponentClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemClick mobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemClick = this.typeVideoPlaylistAddItemClick;
            int hashCode48 = (hashCode47 + (mobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemSearchClick mobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemSearchClick = this.typeVideoPlaylistAddItemSearchClick;
            int hashCode49 = (hashCode48 + (mobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemSearchClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemSearchClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoActionAtExternalLink mobileOfficialAppsVideoStat$TypeVideoActionAtExternalLink = this.typeVideoActionAtExternalLink;
            int hashCode50 = (hashCode49 + (mobileOfficialAppsVideoStat$TypeVideoActionAtExternalLink == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoActionAtExternalLink.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoClickToggleShowChannelLinks mobileOfficialAppsVideoStat$TypeVideoClickToggleShowChannelLinks = this.typeVideoClickToggleShowChannelLinks;
            int hashCode51 = (hashCode50 + (mobileOfficialAppsVideoStat$TypeVideoClickToggleShowChannelLinks == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoClickToggleShowChannelLinks.hashCode())) * 31;
            CommonVideoStat$TypeVideoMoviePageButtonClick commonVideoStat$TypeVideoMoviePageButtonClick = this.typeVideoMoviePageButtonClick;
            int hashCode52 = (hashCode51 + (commonVideoStat$TypeVideoMoviePageButtonClick == null ? 0 : commonVideoStat$TypeVideoMoviePageButtonClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoActionMenuButtonClick mobileOfficialAppsVideoStat$TypeVideoActionMenuButtonClick = this.typeVideoActionMenuButtonClick;
            int hashCode53 = (hashCode52 + (mobileOfficialAppsVideoStat$TypeVideoActionMenuButtonClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoActionMenuButtonClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick mobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick = this.typeVideoSubscribtionButtonClick;
            int hashCode54 = (hashCode53 + (mobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoOpenCommentsClick mobileOfficialAppsVideoStat$TypeVideoOpenCommentsClick = this.typeVideoOpenCommentsClick;
            int hashCode55 = (hashCode54 + (mobileOfficialAppsVideoStat$TypeVideoOpenCommentsClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoOpenCommentsClick.hashCode())) * 31;
            MobileOfficialAppsCallsStat$TypeVoipShareClick mobileOfficialAppsCallsStat$TypeVoipShareClick = this.typeVoipShareClick;
            int hashCode56 = (hashCode55 + (mobileOfficialAppsCallsStat$TypeVoipShareClick == null ? 0 : mobileOfficialAppsCallsStat$TypeVoipShareClick.hashCode())) * 31;
            MobileOfficialAppsCallsStat$TypeVoipImportContactsClick mobileOfficialAppsCallsStat$TypeVoipImportContactsClick = this.typeVoipImportContactsClick;
            int hashCode57 = (hashCode56 + (mobileOfficialAppsCallsStat$TypeVoipImportContactsClick == null ? 0 : mobileOfficialAppsCallsStat$TypeVoipImportContactsClick.hashCode())) * 31;
            MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalClick mobileOfficialAppsCallsStat$TypeVoipSyncContactsModalClick = this.typeVoipSyncContactsModalClick;
            int hashCode58 = (hashCode57 + (mobileOfficialAppsCallsStat$TypeVoipSyncContactsModalClick == null ? 0 : mobileOfficialAppsCallsStat$TypeVoipSyncContactsModalClick.hashCode())) * 31;
            MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick mobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick = this.typeVoipOutgoingCallClick;
            int hashCode59 = (hashCode58 + (mobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick == null ? 0 : mobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.hashCode())) * 31;
            MobileOfficialAppsCallsStat$TypeVoipMoreMenuClick mobileOfficialAppsCallsStat$TypeVoipMoreMenuClick = this.typeVoipMoreMenuClick;
            int hashCode60 = (hashCode59 + (mobileOfficialAppsCallsStat$TypeVoipMoreMenuClick == null ? 0 : mobileOfficialAppsCallsStat$TypeVoipMoreMenuClick.hashCode())) * 31;
            MobileOfficialAppsCallsStat$TypeVoipJoinCallClick mobileOfficialAppsCallsStat$TypeVoipJoinCallClick = this.typeVoipJoinCallClick;
            int hashCode61 = (hashCode60 + (mobileOfficialAppsCallsStat$TypeVoipJoinCallClick == null ? 0 : mobileOfficialAppsCallsStat$TypeVoipJoinCallClick.hashCode())) * 31;
            MobileOfficialAppsCallsStat$TypeVoipCallsServicesClick mobileOfficialAppsCallsStat$TypeVoipCallsServicesClick = this.typeVoipCallsServicesClick;
            int hashCode62 = (hashCode61 + (mobileOfficialAppsCallsStat$TypeVoipCallsServicesClick == null ? 0 : mobileOfficialAppsCallsStat$TypeVoipCallsServicesClick.hashCode())) * 31;
            MobileOfficialAppsCallsStat$TypeVoipShareToUserClick mobileOfficialAppsCallsStat$TypeVoipShareToUserClick = this.typeVoipShareToUserClick;
            int hashCode63 = (hashCode62 + (mobileOfficialAppsCallsStat$TypeVoipShareToUserClick == null ? 0 : mobileOfficialAppsCallsStat$TypeVoipShareToUserClick.hashCode())) * 31;
            MobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick mobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick = this.typeVoipServicePrivacyMessageClick;
            int hashCode64 = (hashCode63 + (mobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick == null ? 0 : mobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoAddToMyVideosClick mobileOfficialAppsVideoStat$TypeVideoAddToMyVideosClick = this.typeVideoAddToMyVideosClick;
            int hashCode65 = (hashCode64 + (mobileOfficialAppsVideoStat$TypeVideoAddToMyVideosClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoAddToMyVideosClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoLikeClick mobileOfficialAppsVideoStat$TypeVideoLikeClick = this.typeVideoLikeClick;
            int hashCode66 = (hashCode65 + (mobileOfficialAppsVideoStat$TypeVideoLikeClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoLikeClick.hashCode())) * 31;
            e0 e0Var = this.typeCommunitySportBlockVideoLiveClick;
            int hashCode67 = (hashCode66 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoUploadOptionClick mobileOfficialAppsVideoStat$TypeVideoUploadOptionClick = this.typeVideoUploadOptionClick;
            int hashCode68 = (hashCode67 + (mobileOfficialAppsVideoStat$TypeVideoUploadOptionClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoUploadOptionClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick mobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick = this.typeVideoUploadPrivacyClick;
            int hashCode69 = (hashCode68 + (mobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoUploadAdditionalOptionClick mobileOfficialAppsVideoStat$TypeVideoUploadAdditionalOptionClick = this.typeVideoUploadAdditionalOptionClick;
            int hashCode70 = (hashCode69 + (mobileOfficialAppsVideoStat$TypeVideoUploadAdditionalOptionClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoUploadAdditionalOptionClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoCreatePlaylistClick mobileOfficialAppsVideoStat$TypeVideoCreatePlaylistClick = this.typeVideoCreatePlaylistClick;
            int hashCode71 = (hashCode70 + (mobileOfficialAppsVideoStat$TypeVideoCreatePlaylistClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoCreatePlaylistClick.hashCode())) * 31;
            CommonVideoStat$TypeVideoAgeMarkClick commonVideoStat$TypeVideoAgeMarkClick = this.typeVideoAgeMarkClick;
            int hashCode72 = (hashCode71 + (commonVideoStat$TypeVideoAgeMarkClick == null ? 0 : commonVideoStat$TypeVideoAgeMarkClick.hashCode())) * 31;
            CommonVideoStat$TypeVideoChannelAPlusTagClick commonVideoStat$TypeVideoChannelAPlusTagClick = this.typeVideoChannelAPlusTagClick;
            int hashCode73 = (hashCode72 + (commonVideoStat$TypeVideoChannelAPlusTagClick == null ? 0 : commonVideoStat$TypeVideoChannelAPlusTagClick.hashCode())) * 31;
            CommonVideoStat$TypeVideoContentWarningModalClick commonVideoStat$TypeVideoContentWarningModalClick = this.typeVideoContentWarningModalClick;
            int hashCode74 = (hashCode73 + (commonVideoStat$TypeVideoContentWarningModalClick == null ? 0 : commonVideoStat$TypeVideoContentWarningModalClick.hashCode())) * 31;
            MobileOfficialAppsAdsStat$TypeFeedSdkAdClick mobileOfficialAppsAdsStat$TypeFeedSdkAdClick = this.typeFeedSdkAdClick;
            int hashCode75 = (hashCode74 + (mobileOfficialAppsAdsStat$TypeFeedSdkAdClick == null ? 0 : mobileOfficialAppsAdsStat$TypeFeedSdkAdClick.hashCode())) * 31;
            CommonCommunitiesStat$TypeCommunitiesClick commonCommunitiesStat$TypeCommunitiesClick = this.typeCommunitiesClick;
            int hashCode76 = (hashCode75 + (commonCommunitiesStat$TypeCommunitiesClick == null ? 0 : commonCommunitiesStat$TypeCommunitiesClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeDeleteItemClick mobileOfficialAppsVideoStat$TypeDeleteItemClick = this.typeDeleteItemClick;
            int hashCode77 = (hashCode76 + (mobileOfficialAppsVideoStat$TypeDeleteItemClick == null ? 0 : mobileOfficialAppsVideoStat$TypeDeleteItemClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoOpenDescriptionModalClick mobileOfficialAppsVideoStat$TypeVideoOpenDescriptionModalClick = this.typeVideoOpenDescriptionModalClick;
            int hashCode78 = (hashCode77 + (mobileOfficialAppsVideoStat$TypeVideoOpenDescriptionModalClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoOpenDescriptionModalClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick mobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick = this.typeVideoOpenPlaylistClick;
            int hashCode79 = (hashCode78 + (mobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoOpenAuthorCabinetClick mobileOfficialAppsVideoStat$TypeVideoOpenAuthorCabinetClick = this.typeVideoOpenAuthorCabinetClick;
            int hashCode80 = (hashCode79 + (mobileOfficialAppsVideoStat$TypeVideoOpenAuthorCabinetClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoOpenAuthorCabinetClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoPlaylistChangeOrder mobileOfficialAppsVideoStat$TypeVideoPlaylistChangeOrder = this.typeVideoPlaylistChangeOrder;
            int hashCode81 = (hashCode80 + (mobileOfficialAppsVideoStat$TypeVideoPlaylistChangeOrder == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoPlaylistChangeOrder.hashCode())) * 31;
            SchemeStat$TypeChannelItem schemeStat$TypeChannelItem = this.typeChannelItem;
            int hashCode82 = (hashCode81 + (schemeStat$TypeChannelItem == null ? 0 : schemeStat$TypeChannelItem.hashCode())) * 31;
            CommonVideoOtherChannelsStat$TypeSimilarChannelsCardClick commonVideoOtherChannelsStat$TypeSimilarChannelsCardClick = this.typeSimilarChannelsCardClick;
            int hashCode83 = (hashCode82 + (commonVideoOtherChannelsStat$TypeSimilarChannelsCardClick == null ? 0 : commonVideoOtherChannelsStat$TypeSimilarChannelsCardClick.hashCode())) * 31;
            CommonVideoOtherChannelsStat$TypeSimilarChannelsSubscriptionClick commonVideoOtherChannelsStat$TypeSimilarChannelsSubscriptionClick = this.typeSimilarChannelsSubscriptionClick;
            int hashCode84 = (hashCode83 + (commonVideoOtherChannelsStat$TypeSimilarChannelsSubscriptionClick == null ? 0 : commonVideoOtherChannelsStat$TypeSimilarChannelsSubscriptionClick.hashCode())) * 31;
            MobileOfficialAppsProfileStat$TypeOpenProfileClick mobileOfficialAppsProfileStat$TypeOpenProfileClick = this.typeOpenProfileClick;
            int hashCode85 = (hashCode84 + (mobileOfficialAppsProfileStat$TypeOpenProfileClick == null ? 0 : mobileOfficialAppsProfileStat$TypeOpenProfileClick.hashCode())) * 31;
            MobileOfficialAppsProfileStat$TypeProfileFriendAddClick mobileOfficialAppsProfileStat$TypeProfileFriendAddClick = this.typeProfileFriendAddClick;
            int hashCode86 = (hashCode85 + (mobileOfficialAppsProfileStat$TypeProfileFriendAddClick == null ? 0 : mobileOfficialAppsProfileStat$TypeProfileFriendAddClick.hashCode())) * 31;
            MobileOfficialAppsProfileStat$TypeProfileFriendConfirmClick mobileOfficialAppsProfileStat$TypeProfileFriendConfirmClick = this.typeProfileFriendConfirmClick;
            int hashCode87 = (hashCode86 + (mobileOfficialAppsProfileStat$TypeProfileFriendConfirmClick == null ? 0 : mobileOfficialAppsProfileStat$TypeProfileFriendConfirmClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoModalEpisodeOpenClick mobileOfficialAppsVideoStat$TypeVideoModalEpisodeOpenClick = this.typeVideoModalEpisodeOpenClick;
            int hashCode88 = (hashCode87 + (mobileOfficialAppsVideoStat$TypeVideoModalEpisodeOpenClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoModalEpisodeOpenClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoReportButtonClick mobileOfficialAppsVideoStat$TypeVideoReportButtonClick = this.typeVideoReportButtonClick;
            int hashCode89 = (hashCode88 + (mobileOfficialAppsVideoStat$TypeVideoReportButtonClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoReportButtonClick.hashCode())) * 31;
            CommonCommunitiesStat$TypeCommunityScreenLoadRetryClick commonCommunitiesStat$TypeCommunityScreenLoadRetryClick = this.typeCommunityScreenLoadRetryClick;
            int hashCode90 = (hashCode89 + (commonCommunitiesStat$TypeCommunityScreenLoadRetryClick == null ? 0 : commonCommunitiesStat$TypeCommunityScreenLoadRetryClick.hashCode())) * 31;
            CommonCommunitiesStat$TypeCommunityScreenTabLoadRetryClick commonCommunitiesStat$TypeCommunityScreenTabLoadRetryClick = this.typeCommunityScreenTabLoadRetryClick;
            int hashCode91 = (hashCode90 + (commonCommunitiesStat$TypeCommunityScreenTabLoadRetryClick == null ? 0 : commonCommunitiesStat$TypeCommunityScreenTabLoadRetryClick.hashCode())) * 31;
            r0 r0Var = this.typeVideoTabBlockClick;
            int hashCode92 = (hashCode91 + (r0Var == null ? 0 : r0Var.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent mobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent = this.typeVideoOfflineSnackbarClick;
            int hashCode93 = (hashCode92 + (mobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoSortCommentsClick mobileOfficialAppsVideoStat$TypeVideoSortCommentsClick = this.typeVideoSortCommentsClick;
            int hashCode94 = (hashCode93 + (mobileOfficialAppsVideoStat$TypeVideoSortCommentsClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoSortCommentsClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoLandingTvInstallClick mobileOfficialAppsVideoStat$TypeVideoLandingTvInstallClick = this.typeVideoLandingTvInstallClick;
            int hashCode95 = (hashCode94 + (mobileOfficialAppsVideoStat$TypeVideoLandingTvInstallClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoLandingTvInstallClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClick mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClick = this.typeOverlayLiveProductCardClick;
            int hashCode96 = (hashCode95 + (mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClick == null ? 0 : mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeOverlayLiveProductCloseClick mobileOfficialAppsVideoStat$TypeOverlayLiveProductCloseClick = this.typeOverlayLiveProductCloseClick;
            int hashCode97 = (hashCode96 + (mobileOfficialAppsVideoStat$TypeOverlayLiveProductCloseClick == null ? 0 : mobileOfficialAppsVideoStat$TypeOverlayLiveProductCloseClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner mobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner = this.typeSuperappVkvideoBanner;
            int hashCode98 = (hashCode97 + (mobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner == null ? 0 : mobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeInstallVkvideoModal mobileOfficialAppsVideoStat$TypeInstallVkvideoModal = this.typeInstallVkvideoModal;
            int hashCode99 = (hashCode98 + (mobileOfficialAppsVideoStat$TypeInstallVkvideoModal == null ? 0 : mobileOfficialAppsVideoStat$TypeInstallVkvideoModal.hashCode())) * 31;
            CommonVideoStat$TypeVideoAssistantChatOpenClick commonVideoStat$TypeVideoAssistantChatOpenClick = this.typeVideoAssistantChatOpenClick;
            int hashCode100 = (hashCode99 + (commonVideoStat$TypeVideoAssistantChatOpenClick == null ? 0 : commonVideoStat$TypeVideoAssistantChatOpenClick.hashCode())) * 31;
            CommonVideoStat$TypeVideoAssistantChatCloseClick commonVideoStat$TypeVideoAssistantChatCloseClick = this.typeVideoAssistantChatCloseClick;
            int hashCode101 = (hashCode100 + (commonVideoStat$TypeVideoAssistantChatCloseClick == null ? 0 : commonVideoStat$TypeVideoAssistantChatCloseClick.hashCode())) * 31;
            CommonVideoStat$TypeVideoAssistantMessageSendClick commonVideoStat$TypeVideoAssistantMessageSendClick = this.typeVideoAssistantMessageSendClick;
            int hashCode102 = (hashCode101 + (commonVideoStat$TypeVideoAssistantMessageSendClick == null ? 0 : commonVideoStat$TypeVideoAssistantMessageSendClick.hashCode())) * 31;
            CommonVideoStat$TypeVideoAssistantMessageSetLikeClick commonVideoStat$TypeVideoAssistantMessageSetLikeClick = this.typeVideoAssistantMessageSetLikeClick;
            int hashCode103 = (hashCode102 + (commonVideoStat$TypeVideoAssistantMessageSetLikeClick == null ? 0 : commonVideoStat$TypeVideoAssistantMessageSetLikeClick.hashCode())) * 31;
            CommonVideoStat$TypeVideoAssistantMessageUnsetLikeClick commonVideoStat$TypeVideoAssistantMessageUnsetLikeClick = this.typeVideoAssistantMessageUnsetLikeClick;
            int hashCode104 = (hashCode103 + (commonVideoStat$TypeVideoAssistantMessageUnsetLikeClick == null ? 0 : commonVideoStat$TypeVideoAssistantMessageUnsetLikeClick.hashCode())) * 31;
            CommonVideoStat$TypeVideoAssistantMessageSetDislikeClick commonVideoStat$TypeVideoAssistantMessageSetDislikeClick = this.typeVideoAssistantMessageSetDislikeClick;
            int hashCode105 = (hashCode104 + (commonVideoStat$TypeVideoAssistantMessageSetDislikeClick == null ? 0 : commonVideoStat$TypeVideoAssistantMessageSetDislikeClick.hashCode())) * 31;
            CommonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick commonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick = this.typeVideoAssistantMessageUnsetDislikeClick;
            int hashCode106 = (hashCode105 + (commonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick == null ? 0 : commonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick.hashCode())) * 31;
            CommonVideoStat$TypeVideoAssistantFeedbackSendClick commonVideoStat$TypeVideoAssistantFeedbackSendClick = this.typeVideoAssistantFeedbackSendClick;
            int hashCode107 = (hashCode106 + (commonVideoStat$TypeVideoAssistantFeedbackSendClick == null ? 0 : commonVideoStat$TypeVideoAssistantFeedbackSendClick.hashCode())) * 31;
            CommonVideoStat$TypeVideoAssistantPlaylistAddClick commonVideoStat$TypeVideoAssistantPlaylistAddClick = this.typeVideoAssistantPlaylistAddClick;
            int hashCode108 = (hashCode107 + (commonVideoStat$TypeVideoAssistantPlaylistAddClick == null ? 0 : commonVideoStat$TypeVideoAssistantPlaylistAddClick.hashCode())) * 31;
            CommonVideoStat$TypeVideoAssistantPlaylistOpenClick commonVideoStat$TypeVideoAssistantPlaylistOpenClick = this.typeVideoAssistantPlaylistOpenClick;
            int hashCode109 = (hashCode108 + (commonVideoStat$TypeVideoAssistantPlaylistOpenClick == null ? 0 : commonVideoStat$TypeVideoAssistantPlaylistOpenClick.hashCode())) * 31;
            CommonVideoStat$TypeVideoAssistantVideoOpenClick commonVideoStat$TypeVideoAssistantVideoOpenClick = this.typeVideoAssistantVideoOpenClick;
            int hashCode110 = (hashCode109 + (commonVideoStat$TypeVideoAssistantVideoOpenClick == null ? 0 : commonVideoStat$TypeVideoAssistantVideoOpenClick.hashCode())) * 31;
            CommonVideoStat$TypeVideoAssistantDeleteClick commonVideoStat$TypeVideoAssistantDeleteClick = this.typeVideoAssistantDeleteClick;
            int hashCode111 = (hashCode110 + (commonVideoStat$TypeVideoAssistantDeleteClick == null ? 0 : commonVideoStat$TypeVideoAssistantDeleteClick.hashCode())) * 31;
            CommonVideoStat$TypeVideoAssistantChatsListClick commonVideoStat$TypeVideoAssistantChatsListClick = this.typeVideoAssistantChatsListClick;
            int hashCode112 = (hashCode111 + (commonVideoStat$TypeVideoAssistantChatsListClick == null ? 0 : commonVideoStat$TypeVideoAssistantChatsListClick.hashCode())) * 31;
            CommonVideoStat$TypeVideoAssistantChatsListMenuClick commonVideoStat$TypeVideoAssistantChatsListMenuClick = this.typeVideoAssistantChatsListMenuClick;
            int hashCode113 = (hashCode112 + (commonVideoStat$TypeVideoAssistantChatsListMenuClick == null ? 0 : commonVideoStat$TypeVideoAssistantChatsListMenuClick.hashCode())) * 31;
            CommonVideoStat$TypeVideoAssistantPlaylistToastOpenClick commonVideoStat$TypeVideoAssistantPlaylistToastOpenClick = this.typeVideoAssistantPlaylistToastOpenClick;
            return hashCode113 + (commonVideoStat$TypeVideoAssistantPlaylistToastOpenClick != null ? commonVideoStat$TypeVideoAssistantPlaylistToastOpenClick.hashCode() : 0);
        }

        public final String toString() {
            return "TypeClick2(item=" + this.item + ", position=" + this.position + ", type=" + this.type + ", typeVideoMusicTrackAdd=" + this.typeVideoMusicTrackAdd + ", typeVideoMusicTrackDelete=" + this.typeVideoMusicTrackDelete + ", typeVideoMusicTrackCardContinueWatch=" + this.typeVideoMusicTrackCardContinueWatch + ", typeVideoMusicTrackCardOpenPlaylist=" + this.typeVideoMusicTrackCardOpenPlaylist + ", typeVideoMusicTrackCardSimilarMusicClick=" + this.typeVideoMusicTrackCardSimilarMusicClick + ", typeVideoPlayerMusicTrackClick=" + this.typeVideoPlayerMusicTrackClick + ", typeVideoMusicStreamMixWatchClick=" + this.typeVideoMusicStreamMixWatchClick + ", typeVideoAdSubscriptionOfferClick=" + this.typeVideoAdSubscriptionOfferClick + ", typeVideoAdSubscriptionOfferClose=" + this.typeVideoAdSubscriptionOfferClose + ", typeVideoAdTrialClick=" + this.typeVideoAdTrialClick + ", typeVideoInfoAboutDrugClick=" + this.typeVideoInfoAboutDrugClick + ", typeVideoPostponedPublicationClick=" + this.typeVideoPostponedPublicationClick + ", typeVideoNextPrevVideoButtonTap=" + this.typeVideoNextPrevVideoButtonTap + ", typeFeedInlineCommentInputClick=" + this.typeFeedInlineCommentInputClick + ", typeVideoAlbumCreateClick=" + this.typeVideoAlbumCreateClick + ", typeVideoAlbumEditClick=" + this.typeVideoAlbumEditClick + ", typeVideoAlbumEditorCoverClick=" + this.typeVideoAlbumEditorCoverClick + ", typeVideoAlbumEditorPrivacyClick=" + this.typeVideoAlbumEditorPrivacyClick + ", typeVideoAddToAlbumClick=" + this.typeVideoAddToAlbumClick + ", typeVideoUploadClick=" + this.typeVideoUploadClick + ", typeVideoDraftClick=" + this.typeVideoDraftClick + ", typeVideoChangeProfileButtonTap=" + this.typeVideoChangeProfileButtonTap + ", typeVideoUploadCoverClick=" + this.typeVideoUploadCoverClick + ", typeVideoCreateChannelClick=" + this.typeVideoCreateChannelClick + ", typeVideoChannelOnboardingClick=" + this.typeVideoChannelOnboardingClick + ", typeVideoShowFullVideoFromClipButtonTap=" + this.typeVideoShowFullVideoFromClipButtonTap + ", typeImCounterSettingsClick=" + this.typeImCounterSettingsClick + ", typeImPushNotificationsSettingsClick=" + this.typeImPushNotificationsSettingsClick + ", typeFeedPostTextAction=" + this.typeFeedPostTextAction + ", typeVideoCatalogWarmupClick=" + this.typeVideoCatalogWarmupClick + ", typeVideoChildProfileClicks=" + this.typeVideoChildProfileClicks + ", typeFeedPostDonutPaymentClick=" + this.typeFeedPostDonutPaymentClick + ", typeVideoQualityChangeInPlayer=" + this.typeVideoQualityChangeInPlayer + ", idfaPermissionScreenClick=" + this.idfaPermissionScreenClick + ", typeAudioUiClickItem=" + this.typeAudioUiClickItem + ", typeAudioPlayerUiClickItem=" + this.typeAudioPlayerUiClickItem + ", typeAudioTrackMenuUiClickItem=" + this.typeAudioTrackMenuUiClickItem + ", typeVideoTopshelfMuteClick=" + this.typeVideoTopshelfMuteClick + ", typeClickSkipItem=" + this.typeClickSkipItem + ", typeVideoTopshelfClick=" + this.typeVideoTopshelfClick + ", typeVideoCategoryBlockItemClick=" + this.typeVideoCategoryBlockItemClick + ", typeVideoProfileClickLink=" + this.typeVideoProfileClickLink + ", typeVideoInstallTrapClick=" + this.typeVideoInstallTrapClick + ", typeFeedPostComponentClick=" + this.typeFeedPostComponentClick + ", typeVideoPlaylistAddItemClick=" + this.typeVideoPlaylistAddItemClick + ", typeVideoPlaylistAddItemSearchClick=" + this.typeVideoPlaylistAddItemSearchClick + ", typeVideoActionAtExternalLink=" + this.typeVideoActionAtExternalLink + ", typeVideoClickToggleShowChannelLinks=" + this.typeVideoClickToggleShowChannelLinks + ", typeVideoMoviePageButtonClick=" + this.typeVideoMoviePageButtonClick + ", typeVideoActionMenuButtonClick=" + this.typeVideoActionMenuButtonClick + ", typeVideoSubscribtionButtonClick=" + this.typeVideoSubscribtionButtonClick + ", typeVideoOpenCommentsClick=" + this.typeVideoOpenCommentsClick + ", typeVoipShareClick=" + this.typeVoipShareClick + ", typeVoipImportContactsClick=" + this.typeVoipImportContactsClick + ", typeVoipSyncContactsModalClick=" + this.typeVoipSyncContactsModalClick + ", typeVoipOutgoingCallClick=" + this.typeVoipOutgoingCallClick + ", typeVoipMoreMenuClick=" + this.typeVoipMoreMenuClick + ", typeVoipJoinCallClick=" + this.typeVoipJoinCallClick + ", typeVoipCallsServicesClick=" + this.typeVoipCallsServicesClick + ", typeVoipShareToUserClick=" + this.typeVoipShareToUserClick + ", typeVoipServicePrivacyMessageClick=" + this.typeVoipServicePrivacyMessageClick + ", typeVideoAddToMyVideosClick=" + this.typeVideoAddToMyVideosClick + ", typeVideoLikeClick=" + this.typeVideoLikeClick + ", typeCommunitySportBlockVideoLiveClick=" + this.typeCommunitySportBlockVideoLiveClick + ", typeVideoUploadOptionClick=" + this.typeVideoUploadOptionClick + ", typeVideoUploadPrivacyClick=" + this.typeVideoUploadPrivacyClick + ", typeVideoUploadAdditionalOptionClick=" + this.typeVideoUploadAdditionalOptionClick + ", typeVideoCreatePlaylistClick=" + this.typeVideoCreatePlaylistClick + ", typeVideoAgeMarkClick=" + this.typeVideoAgeMarkClick + ", typeVideoChannelAPlusTagClick=" + this.typeVideoChannelAPlusTagClick + ", typeVideoContentWarningModalClick=" + this.typeVideoContentWarningModalClick + ", typeFeedSdkAdClick=" + this.typeFeedSdkAdClick + ", typeCommunitiesClick=" + this.typeCommunitiesClick + ", typeDeleteItemClick=" + this.typeDeleteItemClick + ", typeVideoOpenDescriptionModalClick=" + this.typeVideoOpenDescriptionModalClick + ", typeVideoOpenPlaylistClick=" + this.typeVideoOpenPlaylistClick + ", typeVideoOpenAuthorCabinetClick=" + this.typeVideoOpenAuthorCabinetClick + ", typeVideoPlaylistChangeOrder=" + this.typeVideoPlaylistChangeOrder + ", typeChannelItem=" + this.typeChannelItem + ", typeSimilarChannelsCardClick=" + this.typeSimilarChannelsCardClick + ", typeSimilarChannelsSubscriptionClick=" + this.typeSimilarChannelsSubscriptionClick + ", typeOpenProfileClick=" + this.typeOpenProfileClick + ", typeProfileFriendAddClick=" + this.typeProfileFriendAddClick + ", typeProfileFriendConfirmClick=" + this.typeProfileFriendConfirmClick + ", typeVideoModalEpisodeOpenClick=" + this.typeVideoModalEpisodeOpenClick + ", typeVideoReportButtonClick=" + this.typeVideoReportButtonClick + ", typeCommunityScreenLoadRetryClick=" + this.typeCommunityScreenLoadRetryClick + ", typeCommunityScreenTabLoadRetryClick=" + this.typeCommunityScreenTabLoadRetryClick + ", typeVideoTabBlockClick=" + this.typeVideoTabBlockClick + ", typeVideoOfflineSnackbarClick=" + this.typeVideoOfflineSnackbarClick + ", typeVideoSortCommentsClick=" + this.typeVideoSortCommentsClick + ", typeVideoLandingTvInstallClick=" + this.typeVideoLandingTvInstallClick + ", typeOverlayLiveProductCardClick=" + this.typeOverlayLiveProductCardClick + ", typeOverlayLiveProductCloseClick=" + this.typeOverlayLiveProductCloseClick + ", typeSuperappVkvideoBanner=" + this.typeSuperappVkvideoBanner + ", typeInstallVkvideoModal=" + this.typeInstallVkvideoModal + ", typeVideoAssistantChatOpenClick=" + this.typeVideoAssistantChatOpenClick + ", typeVideoAssistantChatCloseClick=" + this.typeVideoAssistantChatCloseClick + ", typeVideoAssistantMessageSendClick=" + this.typeVideoAssistantMessageSendClick + ", typeVideoAssistantMessageSetLikeClick=" + this.typeVideoAssistantMessageSetLikeClick + ", typeVideoAssistantMessageUnsetLikeClick=" + this.typeVideoAssistantMessageUnsetLikeClick + ", typeVideoAssistantMessageSetDislikeClick=" + this.typeVideoAssistantMessageSetDislikeClick + ", typeVideoAssistantMessageUnsetDislikeClick=" + this.typeVideoAssistantMessageUnsetDislikeClick + ", typeVideoAssistantFeedbackSendClick=" + this.typeVideoAssistantFeedbackSendClick + ", typeVideoAssistantPlaylistAddClick=" + this.typeVideoAssistantPlaylistAddClick + ", typeVideoAssistantPlaylistOpenClick=" + this.typeVideoAssistantPlaylistOpenClick + ", typeVideoAssistantVideoOpenClick=" + this.typeVideoAssistantVideoOpenClick + ", typeVideoAssistantDeleteClick=" + this.typeVideoAssistantDeleteClick + ", typeVideoAssistantChatsListClick=" + this.typeVideoAssistantChatsListClick + ", typeVideoAssistantChatsListMenuClick=" + this.typeVideoAssistantChatsListMenuClick + ", typeVideoAssistantPlaylistToastOpenClick=" + this.typeVideoAssistantPlaylistToastOpenClick + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ TypeClick2(SchemeStat$EventItem schemeStat$EventItem, Integer num, Type type, CommonVideoStat$TypeVideoMusicTrackAdd commonVideoStat$TypeVideoMusicTrackAdd, CommonVideoStat$TypeVideoMusicTrackDelete commonVideoStat$TypeVideoMusicTrackDelete, MobileOfficialAppsVideoStat$TypeVideoMusicTrackCardContinueWatch mobileOfficialAppsVideoStat$TypeVideoMusicTrackCardContinueWatch, CommonVideoStat$TypeVideoMusicTrackCardOpenPlaylist commonVideoStat$TypeVideoMusicTrackCardOpenPlaylist, CommonVideoStat$TypeVideoMusicTrackCardSimilarMusicClick commonVideoStat$TypeVideoMusicTrackCardSimilarMusicClick, CommonVideoStat$TypeVideoPlayerMusicTrackClick commonVideoStat$TypeVideoPlayerMusicTrackClick, CommonVideoStat$TypeVideoMusicStreamMixWatchClick commonVideoStat$TypeVideoMusicStreamMixWatchClick, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClose mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClose, MobileOfficialAppsVideoStat$TypeVideoAdTrialClick mobileOfficialAppsVideoStat$TypeVideoAdTrialClick, MobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugClick mobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugClick, MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick mobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick, CommonVideoStat$TypeNextPrevVideoButtonTap commonVideoStat$TypeNextPrevVideoButtonTap, z zVar, MobileOfficialAppsVideoStat$TypeVideoAlbumCreateClick mobileOfficialAppsVideoStat$TypeVideoAlbumCreateClick, MobileOfficialAppsVideoStat$TypeVideoAlbumEditClick mobileOfficialAppsVideoStat$TypeVideoAlbumEditClick, MobileOfficialAppsVideoStat$TypeVideoAlbumEditorCoverClick mobileOfficialAppsVideoStat$TypeVideoAlbumEditorCoverClick, MobileOfficialAppsVideoStat$TypeVideoAlbumEditorPrivacyClick mobileOfficialAppsVideoStat$TypeVideoAlbumEditorPrivacyClick, MobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick mobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick, MobileOfficialAppsVideoStat$TypeVideoUploadClick mobileOfficialAppsVideoStat$TypeVideoUploadClick, MobileOfficialAppsVideoStat$TypeVideoDraftClick mobileOfficialAppsVideoStat$TypeVideoDraftClick, MobileOfficialAppsVideoStat$TypeVideoChangeProfileButtonTap mobileOfficialAppsVideoStat$TypeVideoChangeProfileButtonTap, MobileOfficialAppsVideoStat$TypeVideoUploadCoverClick mobileOfficialAppsVideoStat$TypeVideoUploadCoverClick, CommonVideoStat$TypeVideoCreateChannelClick commonVideoStat$TypeVideoCreateChannelClick, CommonVideoStat$TypeVideoChannelOnboardingClick commonVideoStat$TypeVideoChannelOnboardingClick, MobileOfficialAppsVideoStat$TypeVideoShowFullVideoFromClipButtonTap mobileOfficialAppsVideoStat$TypeVideoShowFullVideoFromClipButtonTap, MobileOfficialAppsImStat$TypeImCounterSettingsClick mobileOfficialAppsImStat$TypeImCounterSettingsClick, MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick mobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick, MobileOfficialAppsFeedStat$TypeFeedPostTextAction mobileOfficialAppsFeedStat$TypeFeedPostTextAction, MobileOfficialAppsVideoStat$TypeVideoCatalogWarmupClick mobileOfficialAppsVideoStat$TypeVideoCatalogWarmupClick, MobileOfficialAppsVideoStat$TypeVideoChildProfileClicks mobileOfficialAppsVideoStat$TypeVideoChildProfileClicks, MobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick mobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick, MobileOfficialAppsVideoStat$TypeVideoQualityChangeInPlayer mobileOfficialAppsVideoStat$TypeVideoQualityChangeInPlayer, MobileOfficialAppsVideoStat$IdfaPermissionScreenClick mobileOfficialAppsVideoStat$IdfaPermissionScreenClick, CommonAudioStat$TypeAudioUiClickItem commonAudioStat$TypeAudioUiClickItem, CommonAudioStat$TypeAudioPlayerUiClickItem commonAudioStat$TypeAudioPlayerUiClickItem, CommonAudioStat$TypeAudioTrackMenuUiClickItem commonAudioStat$TypeAudioTrackMenuUiClickItem, MobileOfficialAppsVideoStat$TypeVideoTopshelfMuteClick mobileOfficialAppsVideoStat$TypeVideoTopshelfMuteClick, CommonVideoStat$TypeClickSkipItem commonVideoStat$TypeClickSkipItem, MobileOfficialAppsVideoStat$TypeVideoTopshelfClick mobileOfficialAppsVideoStat$TypeVideoTopshelfClick, MobileOfficialAppsVideoStat$TypeVideoCategoryBlockItemClick mobileOfficialAppsVideoStat$TypeVideoCategoryBlockItemClick, MobileOfficialAppsVideoStat$TypeVideoProfileClickLink mobileOfficialAppsVideoStat$TypeVideoProfileClickLink, MobileOfficialAppsVideoStat$TypeVideoInstallTrapClick mobileOfficialAppsVideoStat$TypeVideoInstallTrapClick, MobileOfficialAppsFeedStat$TypeFeedPostComponentClick mobileOfficialAppsFeedStat$TypeFeedPostComponentClick, MobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemClick mobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemClick, MobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemSearchClick mobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemSearchClick, MobileOfficialAppsVideoStat$TypeVideoActionAtExternalLink mobileOfficialAppsVideoStat$TypeVideoActionAtExternalLink, MobileOfficialAppsVideoStat$TypeVideoClickToggleShowChannelLinks mobileOfficialAppsVideoStat$TypeVideoClickToggleShowChannelLinks, CommonVideoStat$TypeVideoMoviePageButtonClick commonVideoStat$TypeVideoMoviePageButtonClick, MobileOfficialAppsVideoStat$TypeVideoActionMenuButtonClick mobileOfficialAppsVideoStat$TypeVideoActionMenuButtonClick, MobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick mobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick, MobileOfficialAppsVideoStat$TypeVideoOpenCommentsClick mobileOfficialAppsVideoStat$TypeVideoOpenCommentsClick, MobileOfficialAppsCallsStat$TypeVoipShareClick mobileOfficialAppsCallsStat$TypeVoipShareClick, MobileOfficialAppsCallsStat$TypeVoipImportContactsClick mobileOfficialAppsCallsStat$TypeVoipImportContactsClick, MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalClick mobileOfficialAppsCallsStat$TypeVoipSyncContactsModalClick, MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick mobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick, MobileOfficialAppsCallsStat$TypeVoipMoreMenuClick mobileOfficialAppsCallsStat$TypeVoipMoreMenuClick, MobileOfficialAppsCallsStat$TypeVoipJoinCallClick mobileOfficialAppsCallsStat$TypeVoipJoinCallClick, MobileOfficialAppsCallsStat$TypeVoipCallsServicesClick mobileOfficialAppsCallsStat$TypeVoipCallsServicesClick, MobileOfficialAppsCallsStat$TypeVoipShareToUserClick mobileOfficialAppsCallsStat$TypeVoipShareToUserClick, MobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick mobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick, MobileOfficialAppsVideoStat$TypeVideoAddToMyVideosClick mobileOfficialAppsVideoStat$TypeVideoAddToMyVideosClick, MobileOfficialAppsVideoStat$TypeVideoLikeClick mobileOfficialAppsVideoStat$TypeVideoLikeClick, e0 e0Var, MobileOfficialAppsVideoStat$TypeVideoUploadOptionClick mobileOfficialAppsVideoStat$TypeVideoUploadOptionClick, MobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick mobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick, MobileOfficialAppsVideoStat$TypeVideoUploadAdditionalOptionClick mobileOfficialAppsVideoStat$TypeVideoUploadAdditionalOptionClick, MobileOfficialAppsVideoStat$TypeVideoCreatePlaylistClick mobileOfficialAppsVideoStat$TypeVideoCreatePlaylistClick, CommonVideoStat$TypeVideoAgeMarkClick commonVideoStat$TypeVideoAgeMarkClick, CommonVideoStat$TypeVideoChannelAPlusTagClick commonVideoStat$TypeVideoChannelAPlusTagClick, CommonVideoStat$TypeVideoContentWarningModalClick commonVideoStat$TypeVideoContentWarningModalClick, MobileOfficialAppsAdsStat$TypeFeedSdkAdClick mobileOfficialAppsAdsStat$TypeFeedSdkAdClick, CommonCommunitiesStat$TypeCommunitiesClick commonCommunitiesStat$TypeCommunitiesClick, MobileOfficialAppsVideoStat$TypeDeleteItemClick mobileOfficialAppsVideoStat$TypeDeleteItemClick, MobileOfficialAppsVideoStat$TypeVideoOpenDescriptionModalClick mobileOfficialAppsVideoStat$TypeVideoOpenDescriptionModalClick, MobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick mobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick, MobileOfficialAppsVideoStat$TypeVideoOpenAuthorCabinetClick mobileOfficialAppsVideoStat$TypeVideoOpenAuthorCabinetClick, MobileOfficialAppsVideoStat$TypeVideoPlaylistChangeOrder mobileOfficialAppsVideoStat$TypeVideoPlaylistChangeOrder, SchemeStat$TypeChannelItem schemeStat$TypeChannelItem, CommonVideoOtherChannelsStat$TypeSimilarChannelsCardClick commonVideoOtherChannelsStat$TypeSimilarChannelsCardClick, CommonVideoOtherChannelsStat$TypeSimilarChannelsSubscriptionClick commonVideoOtherChannelsStat$TypeSimilarChannelsSubscriptionClick, MobileOfficialAppsProfileStat$TypeOpenProfileClick mobileOfficialAppsProfileStat$TypeOpenProfileClick, MobileOfficialAppsProfileStat$TypeProfileFriendAddClick mobileOfficialAppsProfileStat$TypeProfileFriendAddClick, MobileOfficialAppsProfileStat$TypeProfileFriendConfirmClick mobileOfficialAppsProfileStat$TypeProfileFriendConfirmClick, MobileOfficialAppsVideoStat$TypeVideoModalEpisodeOpenClick mobileOfficialAppsVideoStat$TypeVideoModalEpisodeOpenClick, MobileOfficialAppsVideoStat$TypeVideoReportButtonClick mobileOfficialAppsVideoStat$TypeVideoReportButtonClick, CommonCommunitiesStat$TypeCommunityScreenLoadRetryClick commonCommunitiesStat$TypeCommunityScreenLoadRetryClick, CommonCommunitiesStat$TypeCommunityScreenTabLoadRetryClick commonCommunitiesStat$TypeCommunityScreenTabLoadRetryClick, r0 r0Var, MobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent mobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent, MobileOfficialAppsVideoStat$TypeVideoSortCommentsClick mobileOfficialAppsVideoStat$TypeVideoSortCommentsClick, MobileOfficialAppsVideoStat$TypeVideoLandingTvInstallClick mobileOfficialAppsVideoStat$TypeVideoLandingTvInstallClick, MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClick mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClick, MobileOfficialAppsVideoStat$TypeOverlayLiveProductCloseClick mobileOfficialAppsVideoStat$TypeOverlayLiveProductCloseClick, MobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner mobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner, MobileOfficialAppsVideoStat$TypeInstallVkvideoModal mobileOfficialAppsVideoStat$TypeInstallVkvideoModal, CommonVideoStat$TypeVideoAssistantChatOpenClick commonVideoStat$TypeVideoAssistantChatOpenClick, CommonVideoStat$TypeVideoAssistantChatCloseClick commonVideoStat$TypeVideoAssistantChatCloseClick, CommonVideoStat$TypeVideoAssistantMessageSendClick commonVideoStat$TypeVideoAssistantMessageSendClick, CommonVideoStat$TypeVideoAssistantMessageSetLikeClick commonVideoStat$TypeVideoAssistantMessageSetLikeClick, CommonVideoStat$TypeVideoAssistantMessageUnsetLikeClick commonVideoStat$TypeVideoAssistantMessageUnsetLikeClick, CommonVideoStat$TypeVideoAssistantMessageSetDislikeClick commonVideoStat$TypeVideoAssistantMessageSetDislikeClick, CommonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick commonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick, CommonVideoStat$TypeVideoAssistantFeedbackSendClick commonVideoStat$TypeVideoAssistantFeedbackSendClick, CommonVideoStat$TypeVideoAssistantPlaylistAddClick commonVideoStat$TypeVideoAssistantPlaylistAddClick, CommonVideoStat$TypeVideoAssistantPlaylistOpenClick commonVideoStat$TypeVideoAssistantPlaylistOpenClick, CommonVideoStat$TypeVideoAssistantVideoOpenClick commonVideoStat$TypeVideoAssistantVideoOpenClick, CommonVideoStat$TypeVideoAssistantDeleteClick commonVideoStat$TypeVideoAssistantDeleteClick, CommonVideoStat$TypeVideoAssistantChatsListClick commonVideoStat$TypeVideoAssistantChatsListClick, CommonVideoStat$TypeVideoAssistantChatsListMenuClick commonVideoStat$TypeVideoAssistantChatsListMenuClick, CommonVideoStat$TypeVideoAssistantPlaylistToastOpenClick commonVideoStat$TypeVideoAssistantPlaylistToastOpenClick, int i, int i2, int i3, int i4, zcl zclVar) {
            this(schemeStat$EventItem, r90, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r5, r91, r4, r17, r19, r21, r23, r25, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r92, r39, r40, r41, r42, r43, r44, r45, r93, r94, r95, r96, r97, r98, r99, r0, (i2 & 32768) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemClick, (i2 & 65536) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoPlaylistAddItemSearchClick, (i2 & 131072) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoActionAtExternalLink, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoClickToggleShowChannelLinks, (i2 & 524288) != 0 ? null : commonVideoStat$TypeVideoMoviePageButtonClick, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoActionMenuButtonClick, (i2 & 2097152) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick, (i2 & 4194304) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoOpenCommentsClick, (i2 & 8388608) != 0 ? null : mobileOfficialAppsCallsStat$TypeVoipShareClick, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : mobileOfficialAppsCallsStat$TypeVoipImportContactsClick, (i2 & 33554432) != 0 ? null : mobileOfficialAppsCallsStat$TypeVoipSyncContactsModalClick, (i2 & 67108864) != 0 ? null : mobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick, (i2 & 134217728) != 0 ? null : mobileOfficialAppsCallsStat$TypeVoipMoreMenuClick, (i2 & 268435456) != 0 ? null : mobileOfficialAppsCallsStat$TypeVoipJoinCallClick, (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : mobileOfficialAppsCallsStat$TypeVoipCallsServicesClick, (i2 & 1073741824) != 0 ? null : mobileOfficialAppsCallsStat$TypeVoipShareToUserClick, (i2 & Integer.MIN_VALUE) != 0 ? null : mobileOfficialAppsCallsStat$TypeVoipServicePrivacyMessageClick, (i3 & 1) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoAddToMyVideosClick, (i3 & 2) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoLikeClick, (i3 & 4) != 0 ? null : e0Var, (i3 & 8) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoUploadOptionClick, (i3 & 16) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoUploadPrivacyClick, (i3 & 32) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoUploadAdditionalOptionClick, (i3 & 64) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoCreatePlaylistClick, (i3 & 128) != 0 ? null : commonVideoStat$TypeVideoAgeMarkClick, (i3 & 256) != 0 ? null : commonVideoStat$TypeVideoChannelAPlusTagClick, (i3 & 512) != 0 ? null : commonVideoStat$TypeVideoContentWarningModalClick, (i3 & 1024) != 0 ? null : mobileOfficialAppsAdsStat$TypeFeedSdkAdClick, (i3 & 2048) != 0 ? null : commonCommunitiesStat$TypeCommunitiesClick, (i3 & 4096) != 0 ? null : mobileOfficialAppsVideoStat$TypeDeleteItemClick, (i3 & 8192) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoOpenDescriptionModalClick, (i3 & 16384) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoOpenPlaylistClick, (i3 & 32768) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoOpenAuthorCabinetClick, (i3 & 65536) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoPlaylistChangeOrder, (i3 & 131072) != 0 ? null : schemeStat$TypeChannelItem, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : commonVideoOtherChannelsStat$TypeSimilarChannelsCardClick, (i3 & 524288) != 0 ? null : commonVideoOtherChannelsStat$TypeSimilarChannelsSubscriptionClick, (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : mobileOfficialAppsProfileStat$TypeOpenProfileClick, (i3 & 2097152) != 0 ? null : mobileOfficialAppsProfileStat$TypeProfileFriendAddClick, (i3 & 4194304) != 0 ? null : mobileOfficialAppsProfileStat$TypeProfileFriendConfirmClick, (i3 & 8388608) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoModalEpisodeOpenClick, (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoReportButtonClick, (i3 & 33554432) != 0 ? null : commonCommunitiesStat$TypeCommunityScreenLoadRetryClick, (i3 & 67108864) != 0 ? null : commonCommunitiesStat$TypeCommunityScreenTabLoadRetryClick, (i3 & 134217728) != 0 ? null : r0Var, (i3 & 268435456) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoOfflineSnackbarEvent, (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoSortCommentsClick, (i3 & 1073741824) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoLandingTvInstallClick, (i3 & Integer.MIN_VALUE) != 0 ? null : mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClick, (i4 & 1) != 0 ? null : mobileOfficialAppsVideoStat$TypeOverlayLiveProductCloseClick, (i4 & 2) != 0 ? null : mobileOfficialAppsVideoStat$TypeSuperappVkvideoBanner, (i4 & 4) != 0 ? null : mobileOfficialAppsVideoStat$TypeInstallVkvideoModal, (i4 & 8) != 0 ? null : commonVideoStat$TypeVideoAssistantChatOpenClick, (i4 & 16) != 0 ? null : commonVideoStat$TypeVideoAssistantChatCloseClick, (i4 & 32) != 0 ? null : commonVideoStat$TypeVideoAssistantMessageSendClick, (i4 & 64) != 0 ? null : commonVideoStat$TypeVideoAssistantMessageSetLikeClick, (i4 & 128) != 0 ? null : commonVideoStat$TypeVideoAssistantMessageUnsetLikeClick, (i4 & 256) != 0 ? null : commonVideoStat$TypeVideoAssistantMessageSetDislikeClick, (i4 & 512) != 0 ? null : commonVideoStat$TypeVideoAssistantMessageUnsetDislikeClick, (i4 & 1024) != 0 ? null : commonVideoStat$TypeVideoAssistantFeedbackSendClick, (i4 & 2048) != 0 ? null : commonVideoStat$TypeVideoAssistantPlaylistAddClick, (i4 & 4096) != 0 ? null : commonVideoStat$TypeVideoAssistantPlaylistOpenClick, (i4 & 8192) != 0 ? null : commonVideoStat$TypeVideoAssistantVideoOpenClick, (i4 & 16384) != 0 ? null : commonVideoStat$TypeVideoAssistantDeleteClick, (i4 & 32768) != 0 ? null : commonVideoStat$TypeVideoAssistantChatsListClick, (i4 & 65536) != 0 ? null : commonVideoStat$TypeVideoAssistantChatsListMenuClick, (i4 & 131072) != 0 ? null : commonVideoStat$TypeVideoAssistantPlaylistToastOpenClick);
            Integer num2 = (i & 2) != 0 ? null : num;
            Type type2 = (i & 4) != 0 ? null : type;
            CommonVideoStat$TypeVideoMusicTrackAdd commonVideoStat$TypeVideoMusicTrackAdd2 = (i & 8) != 0 ? null : commonVideoStat$TypeVideoMusicTrackAdd;
            CommonVideoStat$TypeVideoMusicTrackDelete commonVideoStat$TypeVideoMusicTrackDelete2 = (i & 16) != 0 ? null : commonVideoStat$TypeVideoMusicTrackDelete;
            MobileOfficialAppsVideoStat$TypeVideoMusicTrackCardContinueWatch mobileOfficialAppsVideoStat$TypeVideoMusicTrackCardContinueWatch2 = (i & 32) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoMusicTrackCardContinueWatch;
            CommonVideoStat$TypeVideoMusicTrackCardOpenPlaylist commonVideoStat$TypeVideoMusicTrackCardOpenPlaylist2 = (i & 64) != 0 ? null : commonVideoStat$TypeVideoMusicTrackCardOpenPlaylist;
            CommonVideoStat$TypeVideoMusicTrackCardSimilarMusicClick commonVideoStat$TypeVideoMusicTrackCardSimilarMusicClick2 = (i & 128) != 0 ? null : commonVideoStat$TypeVideoMusicTrackCardSimilarMusicClick;
            CommonVideoStat$TypeVideoPlayerMusicTrackClick commonVideoStat$TypeVideoPlayerMusicTrackClick2 = (i & 256) != 0 ? null : commonVideoStat$TypeVideoPlayerMusicTrackClick;
            CommonVideoStat$TypeVideoMusicStreamMixWatchClick commonVideoStat$TypeVideoMusicStreamMixWatchClick2 = (i & 512) != 0 ? null : commonVideoStat$TypeVideoMusicStreamMixWatchClick;
            MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick2 = (i & 1024) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick;
            MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClose mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClose2 = (i & 2048) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClose;
            MobileOfficialAppsVideoStat$TypeVideoAdTrialClick mobileOfficialAppsVideoStat$TypeVideoAdTrialClick2 = (i & 4096) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoAdTrialClick;
            Integer num3 = num2;
            MobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugClick mobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugClick2 = (i & 8192) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoInfoAboutDrugClick;
            MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick mobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick2 = (i & 16384) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick;
            CommonVideoStat$TypeNextPrevVideoButtonTap commonVideoStat$TypeNextPrevVideoButtonTap2 = (i & 32768) != 0 ? null : commonVideoStat$TypeNextPrevVideoButtonTap;
            z zVar2 = (i & 65536) != 0 ? null : zVar;
            MobileOfficialAppsVideoStat$TypeVideoAlbumCreateClick mobileOfficialAppsVideoStat$TypeVideoAlbumCreateClick2 = (i & 131072) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoAlbumCreateClick;
            MobileOfficialAppsVideoStat$TypeVideoAlbumEditClick mobileOfficialAppsVideoStat$TypeVideoAlbumEditClick2 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoAlbumEditClick;
            MobileOfficialAppsVideoStat$TypeVideoAlbumEditorCoverClick mobileOfficialAppsVideoStat$TypeVideoAlbumEditorCoverClick2 = (i & 524288) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoAlbumEditorCoverClick;
            MobileOfficialAppsVideoStat$TypeVideoAlbumEditorPrivacyClick mobileOfficialAppsVideoStat$TypeVideoAlbumEditorPrivacyClick2 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoAlbumEditorPrivacyClick;
            MobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick mobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick2 = (i & 2097152) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoAddToAlbumClick;
            MobileOfficialAppsVideoStat$TypeVideoUploadClick mobileOfficialAppsVideoStat$TypeVideoUploadClick2 = (i & 4194304) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoUploadClick;
            MobileOfficialAppsVideoStat$TypeVideoDraftClick mobileOfficialAppsVideoStat$TypeVideoDraftClick2 = (i & 8388608) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoDraftClick;
            MobileOfficialAppsVideoStat$TypeVideoChangeProfileButtonTap mobileOfficialAppsVideoStat$TypeVideoChangeProfileButtonTap2 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoChangeProfileButtonTap;
            MobileOfficialAppsVideoStat$TypeVideoUploadCoverClick mobileOfficialAppsVideoStat$TypeVideoUploadCoverClick2 = (i & 33554432) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoUploadCoverClick;
            CommonVideoStat$TypeVideoCreateChannelClick commonVideoStat$TypeVideoCreateChannelClick2 = (i & 67108864) != 0 ? null : commonVideoStat$TypeVideoCreateChannelClick;
            CommonVideoStat$TypeVideoChannelOnboardingClick commonVideoStat$TypeVideoChannelOnboardingClick2 = (i & 134217728) != 0 ? null : commonVideoStat$TypeVideoChannelOnboardingClick;
            MobileOfficialAppsVideoStat$TypeVideoShowFullVideoFromClipButtonTap mobileOfficialAppsVideoStat$TypeVideoShowFullVideoFromClipButtonTap2 = (i & 268435456) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoShowFullVideoFromClipButtonTap;
            MobileOfficialAppsImStat$TypeImCounterSettingsClick mobileOfficialAppsImStat$TypeImCounterSettingsClick2 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : mobileOfficialAppsImStat$TypeImCounterSettingsClick;
            MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick mobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick2 = (i & 1073741824) != 0 ? null : mobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick;
            MobileOfficialAppsFeedStat$TypeFeedPostTextAction mobileOfficialAppsFeedStat$TypeFeedPostTextAction2 = (i & Integer.MIN_VALUE) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedPostTextAction;
            MobileOfficialAppsVideoStat$TypeVideoCatalogWarmupClick mobileOfficialAppsVideoStat$TypeVideoCatalogWarmupClick2 = (i2 & 1) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoCatalogWarmupClick;
            MobileOfficialAppsVideoStat$TypeVideoChildProfileClicks mobileOfficialAppsVideoStat$TypeVideoChildProfileClicks2 = (i2 & 2) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoChildProfileClicks;
            MobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick mobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick2 = (i2 & 4) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick;
            MobileOfficialAppsVideoStat$TypeVideoQualityChangeInPlayer mobileOfficialAppsVideoStat$TypeVideoQualityChangeInPlayer2 = (i2 & 8) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoQualityChangeInPlayer;
            MobileOfficialAppsVideoStat$IdfaPermissionScreenClick mobileOfficialAppsVideoStat$IdfaPermissionScreenClick2 = (i2 & 16) != 0 ? null : mobileOfficialAppsVideoStat$IdfaPermissionScreenClick;
            CommonAudioStat$TypeAudioUiClickItem commonAudioStat$TypeAudioUiClickItem2 = (i2 & 32) != 0 ? null : commonAudioStat$TypeAudioUiClickItem;
            CommonAudioStat$TypeAudioPlayerUiClickItem commonAudioStat$TypeAudioPlayerUiClickItem2 = (i2 & 64) != 0 ? null : commonAudioStat$TypeAudioPlayerUiClickItem;
            MobileOfficialAppsFeedStat$TypeFeedPostTextAction mobileOfficialAppsFeedStat$TypeFeedPostTextAction3 = mobileOfficialAppsFeedStat$TypeFeedPostTextAction2;
            CommonAudioStat$TypeAudioTrackMenuUiClickItem commonAudioStat$TypeAudioTrackMenuUiClickItem2 = (i2 & 128) != 0 ? null : commonAudioStat$TypeAudioTrackMenuUiClickItem;
            MobileOfficialAppsVideoStat$TypeVideoTopshelfMuteClick mobileOfficialAppsVideoStat$TypeVideoTopshelfMuteClick2 = (i2 & 256) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoTopshelfMuteClick;
            CommonVideoStat$TypeClickSkipItem commonVideoStat$TypeClickSkipItem2 = (i2 & 512) != 0 ? null : commonVideoStat$TypeClickSkipItem;
            MobileOfficialAppsVideoStat$TypeVideoTopshelfClick mobileOfficialAppsVideoStat$TypeVideoTopshelfClick2 = (i2 & 1024) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoTopshelfClick;
            MobileOfficialAppsVideoStat$TypeVideoCategoryBlockItemClick mobileOfficialAppsVideoStat$TypeVideoCategoryBlockItemClick2 = (i2 & 2048) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoCategoryBlockItemClick;
            MobileOfficialAppsVideoStat$TypeVideoProfileClickLink mobileOfficialAppsVideoStat$TypeVideoProfileClickLink2 = (i2 & 4096) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoProfileClickLink;
            MobileOfficialAppsVideoStat$TypeVideoInstallTrapClick mobileOfficialAppsVideoStat$TypeVideoInstallTrapClick2 = (i2 & 8192) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoInstallTrapClick;
            MobileOfficialAppsFeedStat$TypeFeedPostComponentClick mobileOfficialAppsFeedStat$TypeFeedPostComponentClick2 = (i2 & 16384) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedPostComponentClick;
        }
    }

    /* compiled from: SchemeStat.kt */
    public static final class TypeClick1 implements SchemeStat$TypeClick {

        @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
        private final SchemeStat$EventItem item;

        @pmi0(X3.i.L)
        private final Integer position;

        @pmi0("type")
        private final Type type;

        @pmi0("type_action_button_click")
        private final MobileOfficialAppsFeedStat$TypeActionButtonClick typeActionButtonClick;

        @pmi0("type_admin_tips_click")
        private final MobileOfficialAppsEcommStat$TypeAdminTipsClick typeAdminTipsClick;

        @pmi0("type_aliexpress_click")
        private final SchemeStat$TypeAliexpressClick typeAliexpressClick;

        @pmi0("type_audio_artist_click_item")
        private final CommonAudioStat$TypeAudioArtistClickItem typeAudioArtistClickItem;

        @pmi0("type_audio_popup_item")
        private final CommonAudioStat$TypeAudioPopupItem typeAudioPopupItem;

        @pmi0("type_audio_tap_equalizer_event_item")
        private final CommonAudioStat$TypeAudioTapEqualizerEventItem typeAudioTapEqualizerEventItem;

        @pmi0("type_audio_tap_goto_event_item")
        private final CommonAudioStat$TypeAudioTapGotoEventItem typeAudioTapGotoEventItem;

        @pmi0("type_audio_tap_popup_event_item")
        private final CommonAudioStat$TypeAudioTapPopupEventItem typeAudioTapPopupEventItem;

        @pmi0("type_audio_tap_settings_event_item")
        private final CommonAudioStat$TypeAudioTapSettingsEventItem typeAudioTapSettingsEventItem;

        @pmi0("type_autoplay_turn_click")
        private final MobileOfficialAppsVideoStat$TypeAutoplayTurnClick typeAutoplayTurnClick;

        @pmi0("type_badges_item")
        private final SchemeStat$TypeBadgesItem typeBadgesItem;

        @pmi0("type_badges_screen_item")
        private final CommonVasStat$TypeBadgesScreenItem typeBadgesScreenItem;

        @pmi0("type_banner_click")
        private final MobileOfficialAppsEcommStat$TypeBannerClick typeBannerClick;

        @pmi0("type_calls_item")
        private final MobileOfficialAppsCallsStat$TypeCallsItem typeCallsItem;

        @pmi0("type_classifieds_click")
        private final SchemeStat$TypeClassifiedsClick typeClassifiedsClick;

        @pmi0("type_click_item")
        private final SchemeStat$TypeClickItem typeClickItem;

        @pmi0("type_click_preference_item")
        private final SchemeStat$TypeClickPreferenceItem typeClickPreferenceItem;

        @pmi0("type_click_preference_value_item")
        private final SchemeStat$TypeClickPreferenceValueItem typeClickPreferenceValueItem;

        @pmi0("type_click_preference_with_value_item")
        private final MobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem typeClickPreferenceWithValueItem;

        @pmi0("type_click_secure_lock_settings_item")
        private final MobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem typeClickSecureLockSettingsItem;

        @pmi0("type_click_to_author_community")
        private final CommonVideoStat$TypeClickToAuthorCommunity typeClickToAuthorCommunity;

        @pmi0("type_clip_in_feed_overlay_click_item")
        private final MobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem typeClipInFeedOverlayClickItem;

        @pmi0("type_clip_viewer_item")
        private final SchemeStat$TypeClipViewerItem typeClipViewerItem;

        @pmi0("type_clips_grid_item")
        private final MobileOfficialAppsClipsStat$TypeClipsGridItem typeClipsGridItem;

        @pmi0("type_close_cast_connect_offer_modal")
        private final MobileOfficialAppsVideoStat$TypeCloseCastConnectOfferModal typeCloseCastConnectOfferModal;

        @pmi0("type_communities_donut_click")
        private final CommonCommunitiesStat$TypeDonutClick typeCommunitiesDonutClick;

        @pmi0("type_community_channel_item_click")
        private final CommonCommunitiesStat$TypeChannelItemClick typeCommunityChannelItemClick;

        @pmi0("type_community_onboarding_click")
        private final CommonCommunitiesStat$TypeCommunityOnboardingClick typeCommunityOnboardingClick;

        @pmi0("type_community_review_click")
        private final CommonCommunitiesStat$TypeCommunityReviewClick typeCommunityReviewClick;

        @pmi0("type_community_tab_item_click")
        private final CommonCommunitiesStat$TypeTabItemClick typeCommunityTabItemClick;

        @pmi0("type_creator_hide_undo_hide_click")
        private final MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick typeCreatorHideUndoHideClick;

        @pmi0("type_donut_banner_click")
        private final CommonCommunitiesStat$TypeDonutBanner typeDonutBannerClick;

        @pmi0("type_donut_goal_click_item")
        private final CommonCommunitiesStat$TypeDonutGoal typeDonutGoalClickItem;

        @pmi0("type_donut_support_author_click")
        private final CommonCommunitiesStat$TypeDonutSupportAuthor typeDonutSupportAuthorClick;

        @pmi0("type_dzen_article_item")
        private final MobileOfficialAppsConDzenStat$TypeDzenArticleItem typeDzenArticleItem;

        @pmi0("type_dzen_block_article_click")
        private final MobileOfficialAppsFeedStat$TypeDzenBlockArticleClick typeDzenBlockArticleClick;

        @pmi0("type_dzen_show_more_click")
        private final MobileOfficialAppsFeedStat$TypeDzenShowMoreClick typeDzenShowMoreClick;

        @pmi0("type_dzen_story_click")
        private final MobileOfficialAppsFeedStat$TypeDzenStoryClick typeDzenStoryClick;

        @pmi0("type_dzen_story_item_click")
        private final MobileOfficialAppsFeedStat$TypeDzenStoryItemClick typeDzenStoryItemClick;

        @pmi0("type_ecomm_click")
        private final CommonEcommStat$TypeEcommClickItem typeEcommClick;

        @pmi0("type_end_video_click")
        private final MobileOfficialAppsVideoStat$TypeEndVideoClick typeEndVideoClick;

        @pmi0("type_feed_carousel_longtap")
        private final MobileOfficialAppsFeedStat$TypeFeedCarouselLongtap typeFeedCarouselLongtap;

        @pmi0("type_feed_carousel_longtap_scroll")
        private final MobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll typeFeedCarouselLongtapScroll;

        @pmi0("type_feed_carousel_onboarding_scroll")
        private final MobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingScroll typeFeedCarouselOnboardingScroll;

        @pmi0("type_feed_click_to_shops_more_button")
        private final MobileOfficialAppsFeedStat$TypeFeedClickToShopsMoreButton typeFeedClickToShopsMoreButton;

        @pmi0("type_feed_comment_thread_button_show_more")
        private final MobileOfficialAppsFeedStat$TypeFeedCommentThreadButtonShowMore typeFeedCommentThreadButtonShowMore;

        @pmi0("type_feed_comments_sort_tab_click")
        private final MobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick typeFeedCommentsSortTabClick;

        @pmi0("type_feed_community_media_item")
        private final MobileOfficialAppsFeedStat$TypeFeedCommunityMediaItem typeFeedCommunityMediaItem;

        @pmi0("type_feed_coowners_event")
        private final MobileOfficialAppsFeedStat$TypeFeedCoownersEvent typeFeedCoownersEvent;

        @pmi0("type_feed_follow_click")
        private final MobileOfficialAppsFeedStat$TypeFeedFollowClick typeFeedFollowClick;

        @pmi0("type_feed_hide_product_pin_click")
        private final MobileOfficialAppsFeedStat$TypeFeedHideProductPinClick typeFeedHideProductPinClick;

        @pmi0("type_feed_hide_ticket_item_pin")
        private final MobileOfficialAppsFeedStat$TypeFeedHideTicketItemPin typeFeedHideTicketItemPin;

        @pmi0("type_feed_interaction_item")
        private final MobileOfficialAppsFeedStat$TypeFeedInteractionItem typeFeedInteractionItem;

        @pmi0("type_feed_item_menu_action")
        private final MobileOfficialAppsFeedStat$TypeFeedItemMenuAction typeFeedItemMenuAction;

        @pmi0("type_feed_media_discover_block")
        private final MobileOfficialAppsFeedStat$TypeFeedMediaDiscoverBlock typeFeedMediaDiscoverBlock;

        @pmi0("type_feed_media_discover_item")
        private final MobileOfficialAppsFeedStat$TypeFeedMediaDiscoverItem typeFeedMediaDiscoverItem;

        @pmi0("type_feed_open_comments_modal")
        private final MobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal typeFeedOpenCommentsModal;

        @pmi0("type_feed_open_group_click")
        private final MobileOfficialAppsFeedStat$TypeFeedOpenGroupClick typeFeedOpenGroupClick;

        @pmi0("type_feed_open_item")
        private final MobileOfficialAppsFeedStat$TypeFeedOpenItem typeFeedOpenItem;

        @pmi0("type_feed_open_market_item_click")
        private final MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick typeFeedOpenMarketItemClick;

        @pmi0("type_feed_open_reactions_modal")
        private final MobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal typeFeedOpenReactionsModal;

        @pmi0("type_feed_open_reposted_item_group_click")
        private final MobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick typeFeedOpenRepostedItemGroupClick;

        @pmi0("type_feed_open_reposted_item_user_click")
        private final MobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemUserClick typeFeedOpenRepostedItemUserClick;

        @pmi0("type_feed_open_similar_posts")
        private final MobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts typeFeedOpenSimilarPosts;

        @pmi0("type_feed_open_story_click")
        private final MobileOfficialAppsFeedStat$TypeFeedOpenStoryClick typeFeedOpenStoryClick;

        @pmi0("type_feed_open_user_click")
        private final MobileOfficialAppsFeedStat$TypeFeedOpenUserClick typeFeedOpenUserClick;

        @pmi0("type_feed_post_added_audio")
        private final MobileOfficialAppsFeedStat$TypeFeedPostAddedAudio typeFeedPostAddedAudio;

        @pmi0("type_feed_post_added_playlist")
        private final MobileOfficialAppsFeedStat$TypeFeedPostAddedPlaylist typeFeedPostAddedPlaylist;

        @pmi0("type_feed_post_collapse_text")
        private final a0 typeFeedPostCollapseText;

        @pmi0("type_feed_post_expand_text")
        private final MobileOfficialAppsFeedStat$TypeFeedPostExpandText typeFeedPostExpandText;

        @pmi0("type_feed_post_mute_audio")
        private final MobileOfficialAppsFeedStat$TypeFeedPostMuteAudio typeFeedPostMuteAudio;

        @pmi0("type_feed_post_open_audio")
        private final MobileOfficialAppsFeedStat$TypeFeedPostOpenAudio typeFeedPostOpenAudio;

        @pmi0("type_feed_post_open_playlist")
        private final MobileOfficialAppsFeedStat$TypeFeedPostOpenPlaylist typeFeedPostOpenPlaylist;

        @pmi0("type_feed_post_pause_audio")
        private final MobileOfficialAppsFeedStat$TypeFeedPostPauseAudio typeFeedPostPauseAudio;

        @pmi0("type_feed_post_removed_audio")
        private final MobileOfficialAppsFeedStat$TypeFeedPostRemovedAudio typeFeedPostRemovedAudio;

        @pmi0("type_feed_post_removed_playlist")
        private final MobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist typeFeedPostRemovedPlaylist;

        @pmi0("type_feed_post_unmute_audio")
        private final MobileOfficialAppsFeedStat$TypeFeedPostUnmuteAudio typeFeedPostUnmuteAudio;

        @pmi0("type_feed_posting_snippet_edit_item")
        private final MobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem typeFeedPostingSnippetEditItem;

        @pmi0("type_feed_show_products_modal_card_click")
        private final MobileOfficialAppsFeedStat$TypeFeedShowProductsModalCardClick typeFeedShowProductsModalCardClick;

        @pmi0("type_feed_start_fast_chat")
        private final MobileOfficialAppsFeedStat$TypeFeedStartFastChat typeFeedStartFastChat;

        @pmi0("type_feed_ticket_item_click")
        private final MobileOfficialAppsFeedStat$TypeFeedTicketItemClick typeFeedTicketItemClick;

        @pmi0("type_feed_unfollow_click")
        private final MobileOfficialAppsFeedStat$TypeFeedUnfollowClick typeFeedUnfollowClick;

        @pmi0("type_feed_view_authors")
        private final MobileOfficialAppsFeedStat$TypeFeedViewAuthors typeFeedViewAuthors;

        @pmi0("type_feed_view_reposted_item_authors")
        private final MobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors typeFeedViewRepostedItemAuthors;

        @pmi0("type_followers_mode_onboarding_click")
        private final MobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick typeFollowersModeOnboardingClick;

        @pmi0("type_followers_mode_switch_state")
        private final MobileOfficialAppsSocGraphStat$FollowersModeSwitchState typeFollowersModeSwitchState;

        @pmi0("type_friend_entrypoint_block_item")
        private final c0 typeFriendEntrypointBlockItem;

        @pmi0("type_games_catalog_click")
        private final SchemeStat$TypeGamesCatalogClick typeGamesCatalogClick;

        @pmi0("type_groups_event_item")
        private final MobileOfficialAppsGroupsStat$TypeGroupsEventItem typeGroupsEventItem;

        @pmi0("type_hidden_source_open_profile")
        private final MobileOfficialAppsFeedStat$TypeHiddenSourceOpenProfile typeHiddenSourceOpenProfile;

        @pmi0("type_hidden_source_unban_button")
        private final MobileOfficialAppsFeedStat$TypeHiddenSourceUnbanButton typeHiddenSourceUnbanButton;

        @pmi0("type_hidden_source_unban_cancel_button")
        private final MobileOfficialAppsFeedStat$TypeHiddenSourceUnbanCancelButton typeHiddenSourceUnbanCancelButton;

        @pmi0("type_im_chat_item")
        private final SchemeStat$TypeImChatItem typeImChatItem;

        @pmi0("type_im_conversation_click_item")
        private final MobileOfficialAppsImStat$TypeImConversationClickItem typeImConversationClickItem;

        @pmi0("type_im_go_archive_click_item")
        private final MobileOfficialAppsImStat$TypeImGoArchiveClickItem typeImGoArchiveClickItem;

        @pmi0("type_im_go_to_profile_click_item")
        private final MobileOfficialAppsImStat$TypeImGoToProfileClickItem typeImGoToProfileClickItem;

        @pmi0("type_im_item")
        private final SchemeStat$TypeImItem typeImItem;

        @pmi0("type_im_phone_number_call_click_item")
        private final MobileOfficialAppsImStat$TypeImPhoneNumberCallClickItem typeImPhoneNumberCallClickItem;

        @pmi0("type_im_pinned_message_click_item")
        private final MobileOfficialAppsImStat$TypeImPinnedMessageClickItem typeImPinnedMessageClickItem;

        @pmi0("type_im_share_from_chat_profile_click_item")
        private final MobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem typeImShareFromChatProfileClickItem;

        @pmi0("type_legal_notice_click")
        private final SchemeStat$TypeLegalNoticeClick typeLegalNoticeClick;

        @pmi0("type_market_carousel_click")
        private final MobileOfficialAppsFeedStat$TypeMarketCarouselClick typeMarketCarouselClick;

        @pmi0("type_market_click")
        private final MobileOfficialAppsMarketStat$TypeMarketClick typeMarketClick;

        @pmi0("type_market_item")
        private final SchemeStat$TypeMarketItem typeMarketItem;

        @pmi0("type_market_item_review_click")
        private final CommonMarketStat$TypeMarketItemReviewClick typeMarketItemReviewClick;

        @pmi0("type_market_marketplace_item")
        private final SchemeStat$TypeMarketMarketplaceItem typeMarketMarketplaceItem;

        @pmi0("type_marusia_conversation_item")
        private final MobileOfficialAppsMarusiaStat$TypeConversationItem typeMarusiaConversationItem;

        @pmi0("type_marusia_reading_item")
        private final MobileOfficialAppsMarusiaStat$TypeReadingItem typeMarusiaReadingItem;

        @pmi0("type_messaging_contact_recommendations_item")
        private final SchemeStat$TypeMessagingContactRecommendationsItem typeMessagingContactRecommendationsItem;

        @pmi0("type_messaging_sync_contacts_click_item")
        private final SchemeStat$TypeMessagingSyncContactsClickItem typeMessagingSyncContactsClickItem;

        @pmi0("type_mini_app_item")
        private final SchemeStat$TypeMiniAppItem typeMiniAppItem;

        @pmi0("type_mini_app_permission_box_item")
        private final MobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem typeMiniAppPermissionBoxItem;

        @pmi0("type_mini_app_policy_item")
        private final MobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem typeMiniAppPolicyItem;

        @pmi0("type_mini_app_snowball_modal_action")
        private final MobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction typeMiniAppSnowballModalAction;

        @pmi0("type_modal_sharing_click")
        private final MobileOfficialAppsSharingStat$TypeModalSharingClick typeModalSharingClick;

        @pmi0("type_modal_sharing_close")
        private final MobileOfficialAppsSharingStat$TypeModalSharingClose typeModalSharingClose;

        @pmi0("type_modal_sharing_open")
        private final MobileOfficialAppsSharingStat$TypeModalSharingOpen typeModalSharingOpen;

        @pmi0("type_move_youtube_subs_click_item")
        private final MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem typeMoveYoutubeSubsClickItem;

        @pmi0("type_move_youtube_subs_onboarding_item")
        private final MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingItem typeMoveYoutubeSubsOnboardingItem;

        @pmi0("type_navigation_tab_click")
        private final SchemeStat$TypeNavigationTabClick typeNavigationTabClick;

        @pmi0("type_next_video_announcement_click")
        private final CommonVideoStat$TypeNextVideoAnnouncement typeNextVideoAnnouncementClick;

        @pmi0("type_nft_item")
        private final MobileOfficialAppsNftStat$TypeNftItem typeNftItem;

        @pmi0("type_notification_item_click")
        private final MobileOfficialAppsNotificationsStat$TypeNotificationItemClick typeNotificationItemClick;

        @pmi0("type_obscene_word")
        private final MobileOfficialAppsFeedStat$TypeObsceneWord typeObsceneWord;

        @pmi0("type_onboarding_event")
        private final CommonOnboardingStat$TypeOnboardingEvent typeOnboardingEvent;

        @pmi0("type_open_community_chats")
        private final MobileOfficialAppsImStat$TypeOpenCommunityChats typeOpenCommunityChats;

        @pmi0("type_open_quality_index_settings")
        private final t typeOpenQualityIndexSettings;

        @pmi0("type_overlay_ad_click")
        private final CommonVideoAdsStat$TypeOverlayAdClick typeOverlayAdClick;

        @pmi0("type_owner_button_app_click")
        private final SchemeStat$TypeOwnerButtonAppClick typeOwnerButtonAppClick;

        @pmi0("type_photo_editor_item")
        private final MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem typePhotoEditorItem;

        @pmi0("type_photo_save_to_album_menu_item")
        private final MobileOfficialAppsFeedStat$TypePhotoSaveToAlbumMenuItem typePhotoSaveToAlbumMenuItem;

        @pmi0("type_photo_share_to_message_item")
        private final MobileOfficialAppsFeedStat$TypePhotoShareToMessageItem typePhotoShareToMessageItem;

        @pmi0("type_photos_item")
        private final MobileOfficialAppsConPhotosStat$TypePhotosItem typePhotosItem;

        @pmi0("type_posting_item")
        private final MobileOfficialAppsConPostingStat$TypePostingItem typePostingItem;

        @pmi0("type_profile_action_button_item")
        private final SchemeStat$TypeProfileActionButtonItem typeProfileActionButtonItem;

        @pmi0("type_profile_item")
        private final MobileOfficialAppsProfileStat$TypeProfileItem typeProfileItem;

        @pmi0("type_promo_click_item")
        private final MobileOfficialAppsPromoStat$TypePromoClickItem typePromoClickItem;

        @pmi0("type_question_item")
        private final SchemeStat$TypeQuestionItem typeQuestionItem;

        @pmi0("type_rating_click")
        private final CommonMarketStat$TypeRatingClick typeRatingClick;

        @pmi0("type_reveal_obscene_words")
        private final MobileOfficialAppsFeedStat$TypeRevealObsceneWords typeRevealObsceneWords;

        @pmi0("type_search_click_item")
        private final MobileOfficialAppsSearchStat$TypeSearchClickItem typeSearchClickItem;

        @pmi0("type_search_local_click_item")
        private final CommonSearchStat$TypeSearchLocalClickItem typeSearchLocalClickItem;

        @pmi0("type_select_creators_click_item")
        private final j0 typeSelectCreatorsClickItem;

        @pmi0("type_select_creators_screen_confirm_click")
        private final MobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick typeSelectCreatorsScreenConfirmClick;

        @pmi0("type_share_item")
        private final SchemeStat$TypeShareItem typeShareItem;

        @pmi0("type_sharing_link_open")
        private final MobileOfficialAppsSharingStat$TypeSharingLinkOpen typeSharingLinkOpen;

        @pmi0("type_skip_video_button_click")
        private final MobileOfficialAppsVideoStat$TypeSkipVideoButtonClick typeSkipVideoButtonClick;

        @pmi0("type_snowball_events")
        private final SchemeStat$TypeSnowballEvents typeSnowballEvents;

        @pmi0("type_soft_update_click")
        private final MobileOfficialAppsVideoStat$TypeSoftUpdateClick typeSoftUpdateClick;

        @pmi0("type_stickers_click_item")
        private final MobileOfficialAppsStickersStat$TypeStickersClickItem typeStickersClickItem;

        @pmi0("type_superapp_onboarding_click_item")
        private final MobileOfficialAppsSuperappStat$TypeSuperappOnboardingClickItem typeSuperappOnboardingClickItem;

        @pmi0("type_superapp_screen_item")
        private final SchemeStat$TypeSuperappScreenItem typeSuperappScreenItem;

        @pmi0("type_superapp_settings_item")
        private final SchemeStat$TypeSuperappSettingsItem typeSuperappSettingsItem;

        @pmi0("type_system_push_click")
        private final MobileOfficialAppsVideoStat$TypeSystemPushClick typeSystemPushClick;

        @pmi0("type_tv_kid_mode_item")
        private final MobileOfficialAppsVideoStat$TypeTvKidModeItem typeTvKidModeItem;

        @pmi0("type_tv_qr_modal_action")
        private final MobileOfficialAppsVideoStat$TypeTvQrModalAction typeTvQrModalAction;

        @pmi0("type_ugc_stickers_item")
        private final CommonVasStat$TypeUgcStickersItem typeUgcStickersItem;

        @pmi0("type_ui_hint_item")
        private final CommonOnboardingStat$TypeUiHintItem typeUiHintItem;

        @pmi0("type_video_additional_actions_click")
        private final MobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick typeVideoAdditionalActionsClick;

        @pmi0("type_video_attach_short_video")
        private final k0 typeVideoAttachShortVideo;

        @pmi0("type_video_author_filter_click")
        private final l0 typeVideoAuthorFilterClick;

        @pmi0("type_video_background_listening_item")
        private final SchemeStat$TypeVideoBackgroundListeningItem typeVideoBackgroundListeningItem;

        @pmi0("type_video_card_event")
        private final CommonVideoStat$TypeVideoCardEvent typeVideoCardEvent;

        @pmi0("type_video_card_longtap")
        private final MobileOfficialAppsVideoStat$TypeVideoCardLongtap typeVideoCardLongtap;

        @pmi0("type_video_catalog_block_item_click")
        private final MobileOfficialAppsVideoStat$TypeVideoCatalogBlockItemClick typeVideoCatalogBlockItemClick;

        @pmi0("type_video_catalog_button_extended_click")
        private final MobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick typeVideoCatalogButtonExtendedClick;

        @pmi0("type_video_click_with_active_player")
        private final CommonVideoStat$TypeVideoClickWithActivePlayer typeVideoClickWithActivePlayer;

        @pmi0("type_video_comment_click")
        private final MobileOfficialAppsVideoStat$TypeVideoCommentClick typeVideoCommentClick;

        @pmi0("type_video_comments_sort_tab_click")
        private final MobileOfficialAppsVideoStat$TypeVideoCommentsSortTabClick typeVideoCommentsSortTabClick;

        @pmi0("type_video_create_clip")
        private final CommonVideoStat$TypeVideoCreateClip typeVideoCreateClip;

        @pmi0("type_video_description_click")
        private final MobileOfficialAppsVideoStat$TypeVideoDescriptionClick typeVideoDescriptionClick;

        @pmi0("type_video_direct_url_start_item")
        private final MobileOfficialAppsVideoStat$TypeVideoDirectUrlStartItem typeVideoDirectUrlStartItem;

        @pmi0("type_video_discovery_logo_click")
        private final MobileOfficialAppsVideoStat$TypeVideoDiscoveryLogoClick typeVideoDiscoveryLogoClick;

        @pmi0("type_video_do_not_recommend_author")
        private final MobileOfficialAppsVideoStat$TypeVideoDoNotRecommendAuthor typeVideoDoNotRecommendAuthor;

        @pmi0("type_video_download_click")
        private final MobileOfficialAppsVideoStat$TypeVideoDownloadClick typeVideoDownloadClick;

        @pmi0("type_video_download_item")
        private final MobileOfficialAppsVideoStat$TypeVideoDownloadItem typeVideoDownloadItem;

        @pmi0("type_video_filter_block_click")
        private final m0 typeVideoFilterBlockClick;

        @pmi0("type_video_in_app_review_click")
        private final MobileOfficialAppsVideoStat$TypeVideoInAppReviewClick typeVideoInAppReviewClick;

        @pmi0("type_video_kids_age_filter_button_tap")
        private final n0 typeVideoKidsAgeFilterButtonTap;

        @pmi0("type_video_kids_mode_click")
        private final MobileOfficialAppsVideoStat$TypeVideoKidsModeClick typeVideoKidsModeClick;

        @pmi0("type_video_miniplayer_item")
        private final SchemeStat$TypeVideoMiniplayerItem typeVideoMiniplayerItem;

        @pmi0("type_video_modal_sharing_click")
        private final MobileOfficialAppsVideoStat$TypeVideoModalSharingClick typeVideoModalSharingClick;

        @pmi0("type_video_not_interesting")
        private final MobileOfficialAppsVideoStat$TypeVideoNotInteresting typeVideoNotInteresting;

        @pmi0("type_video_open_fullscreen_with_swipe")
        private final o0 typeVideoOpenFullscreenWithSwipe;

        @pmi0("type_video_pip_item")
        private final SchemeStat$TypeVideoPipItem typeVideoPipItem;

        @pmi0("type_video_player_button_click")
        private final MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick typeVideoPlayerButtonClick;

        @pmi0("type_video_player_cast_click")
        private final MobileOfficialAppsVideoStat$TypeVideoPlayerCastClick typeVideoPlayerCastClick;

        @pmi0("type_video_player_seek_click")
        private final MobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick typeVideoPlayerSeekClick;

        @pmi0("type_video_playlist_show_all_click")
        private final p0 typeVideoPlaylistShowAllClick;

        @pmi0("type_video_pushes_ad_click")
        private final MobileOfficialAppsVideoStat$TypeVideoPushesAdClick typeVideoPushesAdClick;

        @pmi0("type_video_restriction_click_item")
        private final MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem typeVideoRestrictionClickItem;

        @pmi0("type_video_screen_comment_click")
        private final MobileOfficialAppsVideoStat$TypeVideoScreenCommentClick typeVideoScreenCommentClick;

        @pmi0("type_video_stop_recommending_creator")
        private final MobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator typeVideoStopRecommendingCreator;

        @pmi0("type_video_suggest_downloads_click")
        private final MobileOfficialAppsVideoStat$TypeVideoSuggestDownloadsClick typeVideoSuggestDownloadsClick;

        @pmi0("type_video_to_clip_attach")
        private final MobileOfficialAppsVideoStat$TypeVideoToClipAttach typeVideoToClipAttach;

        @pmi0("type_video_toggle_fullscreen")
        private final MobileOfficialAppsVideoStat$TypeVideoToggleFullscreen typeVideoToggleFullscreen;

        @pmi0("type_video_tv_program")
        private final MobileOfficialAppsVideoStat$TypeVideoTvProgram typeVideoTvProgram;

        @pmi0("type_video_undo_stop_recommending_creator")
        private final MobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator typeVideoUndoStopRecommendingCreator;

        @pmi0("type_video_watch_later")
        private final MobileOfficialAppsVideoStat$TypeVideoWatchLater typeVideoWatchLater;

        @pmi0("type_wishlist_item")
        private final SchemeStat$TypeWishlistItem typeWishlistItem;

        public TypeClick1(SchemeStat$EventItem schemeStat$EventItem, Integer num, Type type, MobileOfficialAppsFeedStat$TypeDzenBlockArticleClick mobileOfficialAppsFeedStat$TypeDzenBlockArticleClick, MobileOfficialAppsConDzenStat$TypeDzenArticleItem mobileOfficialAppsConDzenStat$TypeDzenArticleItem, CommonAudioStat$TypeAudioTapGotoEventItem commonAudioStat$TypeAudioTapGotoEventItem, MobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem mobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem, CommonAudioStat$TypeAudioTapEqualizerEventItem commonAudioStat$TypeAudioTapEqualizerEventItem, MobileOfficialAppsVideoStat$TypeCloseCastConnectOfferModal mobileOfficialAppsVideoStat$TypeCloseCastConnectOfferModal, CommonAudioStat$TypeAudioTapPopupEventItem commonAudioStat$TypeAudioTapPopupEventItem, CommonAudioStat$TypeAudioTapSettingsEventItem commonAudioStat$TypeAudioTapSettingsEventItem, CommonAudioStat$TypeAudioArtistClickItem commonAudioStat$TypeAudioArtistClickItem, SchemeStat$TypeNavigationTabClick schemeStat$TypeNavigationTabClick, CommonAudioStat$TypeAudioPopupItem commonAudioStat$TypeAudioPopupItem, SchemeStat$TypeImItem schemeStat$TypeImItem, SchemeStat$TypeMarketItem schemeStat$TypeMarketItem, SchemeStat$TypeMarketMarketplaceItem schemeStat$TypeMarketMarketplaceItem, SchemeStat$TypeSuperappScreenItem schemeStat$TypeSuperappScreenItem, SchemeStat$TypeMiniAppItem schemeStat$TypeMiniAppItem, CommonVideoStat$TypeVideoCardEvent commonVideoStat$TypeVideoCardEvent, SchemeStat$TypeClickItem schemeStat$TypeClickItem, SchemeStat$TypeGamesCatalogClick schemeStat$TypeGamesCatalogClick, MobileOfficialAppsVideoStat$TypeVideoCardLongtap mobileOfficialAppsVideoStat$TypeVideoCardLongtap, SchemeStat$TypeClickPreferenceItem schemeStat$TypeClickPreferenceItem, MobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem mobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem, SchemeStat$TypeClickPreferenceValueItem schemeStat$TypeClickPreferenceValueItem, MobileOfficialAppsVideoStat$TypeSoftUpdateClick mobileOfficialAppsVideoStat$TypeSoftUpdateClick, MobileOfficialAppsFeedStat$TypeFeedInteractionItem mobileOfficialAppsFeedStat$TypeFeedInteractionItem, CommonVideoAdsStat$TypeOverlayAdClick commonVideoAdsStat$TypeOverlayAdClick, CommonOnboardingStat$TypeUiHintItem commonOnboardingStat$TypeUiHintItem, SchemeStat$TypeClipViewerItem schemeStat$TypeClipViewerItem, MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick mobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick, MobileOfficialAppsVideoStat$TypeVideoPlayerCastClick mobileOfficialAppsVideoStat$TypeVideoPlayerCastClick, MobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick mobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick, MobileOfficialAppsVideoStat$TypeVideoToClipAttach mobileOfficialAppsVideoStat$TypeVideoToClipAttach, MobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem mobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem, CommonVideoStat$TypeVideoCreateClip commonVideoStat$TypeVideoCreateClip, CommonVideoStat$TypeClickToAuthorCommunity commonVideoStat$TypeClickToAuthorCommunity, MobileOfficialAppsClipsStat$TypeClipsGridItem mobileOfficialAppsClipsStat$TypeClipsGridItem, SchemeStat$TypeSuperappSettingsItem schemeStat$TypeSuperappSettingsItem, MobileOfficialAppsMarusiaStat$TypeConversationItem mobileOfficialAppsMarusiaStat$TypeConversationItem, MobileOfficialAppsMarusiaStat$TypeReadingItem mobileOfficialAppsMarusiaStat$TypeReadingItem, SchemeStat$TypeVideoPipItem schemeStat$TypeVideoPipItem, SchemeStat$TypeVideoMiniplayerItem schemeStat$TypeVideoMiniplayerItem, MobileOfficialAppsVideoStat$TypeVideoDownloadItem mobileOfficialAppsVideoStat$TypeVideoDownloadItem, MobileOfficialAppsVideoStat$TypeVideoNotInteresting mobileOfficialAppsVideoStat$TypeVideoNotInteresting, MobileOfficialAppsVideoStat$TypeVideoDoNotRecommendAuthor mobileOfficialAppsVideoStat$TypeVideoDoNotRecommendAuthor, MobileOfficialAppsVideoStat$TypeVideoTvProgram mobileOfficialAppsVideoStat$TypeVideoTvProgram, MobileOfficialAppsVideoStat$TypeVideoWatchLater mobileOfficialAppsVideoStat$TypeVideoWatchLater, SchemeStat$TypeVideoBackgroundListeningItem schemeStat$TypeVideoBackgroundListeningItem, CommonVideoStat$TypeVideoClickWithActivePlayer commonVideoStat$TypeVideoClickWithActivePlayer, MobileOfficialAppsSearchStat$TypeSearchClickItem mobileOfficialAppsSearchStat$TypeSearchClickItem, CommonSearchStat$TypeSearchLocalClickItem commonSearchStat$TypeSearchLocalClickItem, SchemeStat$TypeClassifiedsClick schemeStat$TypeClassifiedsClick, SchemeStat$TypeAliexpressClick schemeStat$TypeAliexpressClick, MobileOfficialAppsFeedStat$TypeMarketCarouselClick mobileOfficialAppsFeedStat$TypeMarketCarouselClick, MobileOfficialAppsFeedStat$TypeFeedClickToShopsMoreButton mobileOfficialAppsFeedStat$TypeFeedClickToShopsMoreButton, MobileOfficialAppsMarketStat$TypeMarketClick mobileOfficialAppsMarketStat$TypeMarketClick, SchemeStat$TypeMessagingContactRecommendationsItem schemeStat$TypeMessagingContactRecommendationsItem, MobileOfficialAppsImStat$TypeImConversationClickItem mobileOfficialAppsImStat$TypeImConversationClickItem, SchemeStat$TypeMessagingSyncContactsClickItem schemeStat$TypeMessagingSyncContactsClickItem, MobileOfficialAppsImStat$TypeImGoToProfileClickItem mobileOfficialAppsImStat$TypeImGoToProfileClickItem, MobileOfficialAppsImStat$TypeImPhoneNumberCallClickItem mobileOfficialAppsImStat$TypeImPhoneNumberCallClickItem, MobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem mobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem, MobileOfficialAppsImStat$TypeImGoArchiveClickItem mobileOfficialAppsImStat$TypeImGoArchiveClickItem, MobileOfficialAppsImStat$TypeImPinnedMessageClickItem mobileOfficialAppsImStat$TypeImPinnedMessageClickItem, SchemeStat$TypeImChatItem schemeStat$TypeImChatItem, SchemeStat$TypeProfileActionButtonItem schemeStat$TypeProfileActionButtonItem, SchemeStat$TypeShareItem schemeStat$TypeShareItem, MobileOfficialAppsSharingStat$TypeSharingLinkOpen mobileOfficialAppsSharingStat$TypeSharingLinkOpen, SchemeStat$TypeQuestionItem schemeStat$TypeQuestionItem, SchemeStat$TypeBadgesItem schemeStat$TypeBadgesItem, SchemeStat$TypeWishlistItem schemeStat$TypeWishlistItem, SchemeStat$TypeOwnerButtonAppClick schemeStat$TypeOwnerButtonAppClick, c0 c0Var, MobileOfficialAppsSuperappStat$TypeSuperappOnboardingClickItem mobileOfficialAppsSuperappStat$TypeSuperappOnboardingClickItem, MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem mobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem, MobileOfficialAppsProfileStat$TypeProfileItem mobileOfficialAppsProfileStat$TypeProfileItem, CommonCommunitiesStat$TypeChannelItemClick commonCommunitiesStat$TypeChannelItemClick, MobileOfficialAppsGroupsStat$TypeGroupsEventItem mobileOfficialAppsGroupsStat$TypeGroupsEventItem, MobileOfficialAppsStickersStat$TypeStickersClickItem mobileOfficialAppsStickersStat$TypeStickersClickItem, CommonMarketStat$TypeRatingClick commonMarketStat$TypeRatingClick, MobileOfficialAppsCallsStat$TypeCallsItem mobileOfficialAppsCallsStat$TypeCallsItem, MobileOfficialAppsEcommStat$TypeAdminTipsClick mobileOfficialAppsEcommStat$TypeAdminTipsClick, MobileOfficialAppsNftStat$TypeNftItem mobileOfficialAppsNftStat$TypeNftItem, MobileOfficialAppsFeedStat$TypeFeedMediaDiscoverItem mobileOfficialAppsFeedStat$TypeFeedMediaDiscoverItem, MobileOfficialAppsFeedStat$TypeFeedMediaDiscoverBlock mobileOfficialAppsFeedStat$TypeFeedMediaDiscoverBlock, MobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts mobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts, MobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal mobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal, MobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal mobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal, MobileOfficialAppsFeedStat$TypeFeedStartFastChat mobileOfficialAppsFeedStat$TypeFeedStartFastChat, MobileOfficialAppsFeedStat$TypeFeedCommentThreadButtonShowMore mobileOfficialAppsFeedStat$TypeFeedCommentThreadButtonShowMore, MobileOfficialAppsFeedStat$TypeFeedCommunityMediaItem mobileOfficialAppsFeedStat$TypeFeedCommunityMediaItem, MobileOfficialAppsFeedStat$TypeFeedItemMenuAction mobileOfficialAppsFeedStat$TypeFeedItemMenuAction, MobileOfficialAppsFeedStat$TypeFeedOpenItem mobileOfficialAppsFeedStat$TypeFeedOpenItem, MobileOfficialAppsFeedStat$TypePhotoSaveToAlbumMenuItem mobileOfficialAppsFeedStat$TypePhotoSaveToAlbumMenuItem, MobileOfficialAppsFeedStat$TypePhotoShareToMessageItem mobileOfficialAppsFeedStat$TypePhotoShareToMessageItem, MobileOfficialAppsFeedStat$TypeObsceneWord mobileOfficialAppsFeedStat$TypeObsceneWord, MobileOfficialAppsFeedStat$TypeRevealObsceneWords mobileOfficialAppsFeedStat$TypeRevealObsceneWords, CommonVasStat$TypeBadgesScreenItem commonVasStat$TypeBadgesScreenItem, MobileOfficialAppsFeedStat$TypeDzenStoryClick mobileOfficialAppsFeedStat$TypeDzenStoryClick, MobileOfficialAppsFeedStat$TypeDzenStoryItemClick mobileOfficialAppsFeedStat$TypeDzenStoryItemClick, MobileOfficialAppsFeedStat$TypeDzenShowMoreClick mobileOfficialAppsFeedStat$TypeDzenShowMoreClick, MobileOfficialAppsFeedStat$TypeHiddenSourceOpenProfile mobileOfficialAppsFeedStat$TypeHiddenSourceOpenProfile, MobileOfficialAppsFeedStat$TypeHiddenSourceUnbanButton mobileOfficialAppsFeedStat$TypeHiddenSourceUnbanButton, MobileOfficialAppsFeedStat$TypeHiddenSourceUnbanCancelButton mobileOfficialAppsFeedStat$TypeHiddenSourceUnbanCancelButton, MobileOfficialAppsFeedStat$TypeFeedCarouselLongtap mobileOfficialAppsFeedStat$TypeFeedCarouselLongtap, MobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll mobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll, MobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingScroll mobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingScroll, CommonCommunitiesStat$TypeCommunityOnboardingClick commonCommunitiesStat$TypeCommunityOnboardingClick, MobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick mobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick, MobileOfficialAppsSocGraphStat$FollowersModeSwitchState mobileOfficialAppsSocGraphStat$FollowersModeSwitchState, MobileOfficialAppsConPostingStat$TypePostingItem mobileOfficialAppsConPostingStat$TypePostingItem, CommonMarketStat$TypeMarketItemReviewClick commonMarketStat$TypeMarketItemReviewClick, MobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem mobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem, MobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem mobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem, CommonCommunitiesStat$TypeCommunityReviewClick commonCommunitiesStat$TypeCommunityReviewClick, MobileOfficialAppsConPhotosStat$TypePhotosItem mobileOfficialAppsConPhotosStat$TypePhotosItem, t tVar, CommonVasStat$TypeUgcStickersItem commonVasStat$TypeUgcStickersItem, MobileOfficialAppsEcommStat$TypeBannerClick mobileOfficialAppsEcommStat$TypeBannerClick, MobileOfficialAppsVideoStat$TypeVideoInAppReviewClick mobileOfficialAppsVideoStat$TypeVideoInAppReviewClick, MobileOfficialAppsVideoStat$TypeSystemPushClick mobileOfficialAppsVideoStat$TypeSystemPushClick, MobileOfficialAppsVideoStat$TypeAutoplayTurnClick mobileOfficialAppsVideoStat$TypeAutoplayTurnClick, CommonEcommStat$TypeEcommClickItem commonEcommStat$TypeEcommClickItem, MobileOfficialAppsVideoStat$TypeVideoSuggestDownloadsClick mobileOfficialAppsVideoStat$TypeVideoSuggestDownloadsClick, MobileOfficialAppsVideoStat$TypeVideoKidsModeClick mobileOfficialAppsVideoStat$TypeVideoKidsModeClick, l0 l0Var, p0 p0Var, MobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick mobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick, MobileOfficialAppsVideoStat$TypeVideoCatalogBlockItemClick mobileOfficialAppsVideoStat$TypeVideoCatalogBlockItemClick, MobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick mobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick, MobileOfficialAppsVideoStat$TypeEndVideoClick mobileOfficialAppsVideoStat$TypeEndVideoClick, MobileOfficialAppsVideoStat$TypeVideoDescriptionClick mobileOfficialAppsVideoStat$TypeVideoDescriptionClick, MobileOfficialAppsVideoStat$TypeVideoDownloadClick mobileOfficialAppsVideoStat$TypeVideoDownloadClick, MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem mobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem, MobileOfficialAppsVideoStat$TypeVideoCommentClick mobileOfficialAppsVideoStat$TypeVideoCommentClick, MobileOfficialAppsVideoStat$TypeVideoScreenCommentClick mobileOfficialAppsVideoStat$TypeVideoScreenCommentClick, MobileOfficialAppsVideoStat$TypeVideoCommentsSortTabClick mobileOfficialAppsVideoStat$TypeVideoCommentsSortTabClick, MobileOfficialAppsVideoStat$TypeVideoDiscoveryLogoClick mobileOfficialAppsVideoStat$TypeVideoDiscoveryLogoClick, MobileOfficialAppsVideoStat$TypeVideoPushesAdClick mobileOfficialAppsVideoStat$TypeVideoPushesAdClick, MobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator mobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator, MobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator mobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator, m0 m0Var, SchemeStat$TypeSnowballEvents schemeStat$TypeSnowballEvents, MobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction mobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction, o0 o0Var, k0 k0Var, MobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem mobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem, MobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick mobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick, SchemeStat$TypeLegalNoticeClick schemeStat$TypeLegalNoticeClick, CommonCommunitiesStat$TypeTabItemClick commonCommunitiesStat$TypeTabItemClick, CommonCommunitiesStat$TypeDonutGoal commonCommunitiesStat$TypeDonutGoal, CommonCommunitiesStat$TypeDonutClick commonCommunitiesStat$TypeDonutClick, CommonCommunitiesStat$TypeDonutBanner commonCommunitiesStat$TypeDonutBanner, CommonCommunitiesStat$TypeDonutSupportAuthor commonCommunitiesStat$TypeDonutSupportAuthor, MobileOfficialAppsVideoStat$TypeVideoDirectUrlStartItem mobileOfficialAppsVideoStat$TypeVideoDirectUrlStartItem, MobileOfficialAppsPromoStat$TypePromoClickItem mobileOfficialAppsPromoStat$TypePromoClickItem, CommonOnboardingStat$TypeOnboardingEvent commonOnboardingStat$TypeOnboardingEvent, MobileOfficialAppsNotificationsStat$TypeNotificationItemClick mobileOfficialAppsNotificationsStat$TypeNotificationItemClick, MobileOfficialAppsFeedStat$TypeFeedOpenUserClick mobileOfficialAppsFeedStat$TypeFeedOpenUserClick, MobileOfficialAppsFeedStat$TypeFeedOpenGroupClick mobileOfficialAppsFeedStat$TypeFeedOpenGroupClick, MobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemUserClick mobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemUserClick, MobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick mobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick, MobileOfficialAppsFeedStat$TypeFeedOpenStoryClick mobileOfficialAppsFeedStat$TypeFeedOpenStoryClick, MobileOfficialAppsFeedStat$TypeFeedHideProductPinClick mobileOfficialAppsFeedStat$TypeFeedHideProductPinClick, MobileOfficialAppsFeedStat$TypeFeedHideTicketItemPin mobileOfficialAppsFeedStat$TypeFeedHideTicketItemPin, MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick mobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick, MobileOfficialAppsFeedStat$TypeFeedTicketItemClick mobileOfficialAppsFeedStat$TypeFeedTicketItemClick, MobileOfficialAppsFeedStat$TypeFeedShowProductsModalCardClick mobileOfficialAppsFeedStat$TypeFeedShowProductsModalCardClick, MobileOfficialAppsFeedStat$TypeFeedFollowClick mobileOfficialAppsFeedStat$TypeFeedFollowClick, MobileOfficialAppsFeedStat$TypeFeedUnfollowClick mobileOfficialAppsFeedStat$TypeFeedUnfollowClick, MobileOfficialAppsFeedStat$TypeFeedPostExpandText mobileOfficialAppsFeedStat$TypeFeedPostExpandText, a0 a0Var, MobileOfficialAppsSharingStat$TypeModalSharingOpen mobileOfficialAppsSharingStat$TypeModalSharingOpen, MobileOfficialAppsSharingStat$TypeModalSharingClick mobileOfficialAppsSharingStat$TypeModalSharingClick, MobileOfficialAppsSharingStat$TypeModalSharingClose mobileOfficialAppsSharingStat$TypeModalSharingClose, MobileOfficialAppsVideoStat$TypeVideoModalSharingClick mobileOfficialAppsVideoStat$TypeVideoModalSharingClick, MobileOfficialAppsVideoStat$TypeTvKidModeItem mobileOfficialAppsVideoStat$TypeTvKidModeItem, MobileOfficialAppsImStat$TypeOpenCommunityChats mobileOfficialAppsImStat$TypeOpenCommunityChats, MobileOfficialAppsFeedStat$TypeFeedPostUnmuteAudio mobileOfficialAppsFeedStat$TypeFeedPostUnmuteAudio, MobileOfficialAppsFeedStat$TypeFeedPostMuteAudio mobileOfficialAppsFeedStat$TypeFeedPostMuteAudio, MobileOfficialAppsFeedStat$TypeFeedPostPauseAudio mobileOfficialAppsFeedStat$TypeFeedPostPauseAudio, MobileOfficialAppsFeedStat$TypeFeedPostOpenAudio mobileOfficialAppsFeedStat$TypeFeedPostOpenAudio, MobileOfficialAppsFeedStat$TypeFeedPostAddedAudio mobileOfficialAppsFeedStat$TypeFeedPostAddedAudio, MobileOfficialAppsFeedStat$TypeFeedPostRemovedAudio mobileOfficialAppsFeedStat$TypeFeedPostRemovedAudio, MobileOfficialAppsFeedStat$TypeFeedPostOpenPlaylist mobileOfficialAppsFeedStat$TypeFeedPostOpenPlaylist, MobileOfficialAppsFeedStat$TypeFeedPostAddedPlaylist mobileOfficialAppsFeedStat$TypeFeedPostAddedPlaylist, MobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist mobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist, MobileOfficialAppsFeedStat$TypeFeedCoownersEvent mobileOfficialAppsFeedStat$TypeFeedCoownersEvent, MobileOfficialAppsFeedStat$TypeFeedViewAuthors mobileOfficialAppsFeedStat$TypeFeedViewAuthors, MobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors mobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors, MobileOfficialAppsFeedStat$TypeActionButtonClick mobileOfficialAppsFeedStat$TypeActionButtonClick, n0 n0Var, MobileOfficialAppsVideoStat$TypeTvQrModalAction mobileOfficialAppsVideoStat$TypeTvQrModalAction, MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingItem mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingItem, MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem, j0 j0Var, MobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick mobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick, MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick mobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick, MobileOfficialAppsVideoStat$TypeSkipVideoButtonClick mobileOfficialAppsVideoStat$TypeSkipVideoButtonClick, CommonVideoStat$TypeNextVideoAnnouncement commonVideoStat$TypeNextVideoAnnouncement, MobileOfficialAppsVideoStat$TypeVideoToggleFullscreen mobileOfficialAppsVideoStat$TypeVideoToggleFullscreen) {
            this.item = schemeStat$EventItem;
            this.position = num;
            this.type = type;
            this.typeDzenBlockArticleClick = mobileOfficialAppsFeedStat$TypeDzenBlockArticleClick;
            this.typeDzenArticleItem = mobileOfficialAppsConDzenStat$TypeDzenArticleItem;
            this.typeAudioTapGotoEventItem = commonAudioStat$TypeAudioTapGotoEventItem;
            this.typeFeedPostingSnippetEditItem = mobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem;
            this.typeAudioTapEqualizerEventItem = commonAudioStat$TypeAudioTapEqualizerEventItem;
            this.typeCloseCastConnectOfferModal = mobileOfficialAppsVideoStat$TypeCloseCastConnectOfferModal;
            this.typeAudioTapPopupEventItem = commonAudioStat$TypeAudioTapPopupEventItem;
            this.typeAudioTapSettingsEventItem = commonAudioStat$TypeAudioTapSettingsEventItem;
            this.typeAudioArtistClickItem = commonAudioStat$TypeAudioArtistClickItem;
            this.typeNavigationTabClick = schemeStat$TypeNavigationTabClick;
            this.typeAudioPopupItem = commonAudioStat$TypeAudioPopupItem;
            this.typeImItem = schemeStat$TypeImItem;
            this.typeMarketItem = schemeStat$TypeMarketItem;
            this.typeMarketMarketplaceItem = schemeStat$TypeMarketMarketplaceItem;
            this.typeSuperappScreenItem = schemeStat$TypeSuperappScreenItem;
            this.typeMiniAppItem = schemeStat$TypeMiniAppItem;
            this.typeVideoCardEvent = commonVideoStat$TypeVideoCardEvent;
            this.typeClickItem = schemeStat$TypeClickItem;
            this.typeGamesCatalogClick = schemeStat$TypeGamesCatalogClick;
            this.typeVideoCardLongtap = mobileOfficialAppsVideoStat$TypeVideoCardLongtap;
            this.typeClickPreferenceItem = schemeStat$TypeClickPreferenceItem;
            this.typeClickPreferenceWithValueItem = mobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem;
            this.typeClickPreferenceValueItem = schemeStat$TypeClickPreferenceValueItem;
            this.typeSoftUpdateClick = mobileOfficialAppsVideoStat$TypeSoftUpdateClick;
            this.typeFeedInteractionItem = mobileOfficialAppsFeedStat$TypeFeedInteractionItem;
            this.typeOverlayAdClick = commonVideoAdsStat$TypeOverlayAdClick;
            this.typeUiHintItem = commonOnboardingStat$TypeUiHintItem;
            this.typeClipViewerItem = schemeStat$TypeClipViewerItem;
            this.typeVideoPlayerButtonClick = mobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick;
            this.typeVideoPlayerCastClick = mobileOfficialAppsVideoStat$TypeVideoPlayerCastClick;
            this.typeVideoPlayerSeekClick = mobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick;
            this.typeVideoToClipAttach = mobileOfficialAppsVideoStat$TypeVideoToClipAttach;
            this.typeClipInFeedOverlayClickItem = mobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem;
            this.typeVideoCreateClip = commonVideoStat$TypeVideoCreateClip;
            this.typeClickToAuthorCommunity = commonVideoStat$TypeClickToAuthorCommunity;
            this.typeClipsGridItem = mobileOfficialAppsClipsStat$TypeClipsGridItem;
            this.typeSuperappSettingsItem = schemeStat$TypeSuperappSettingsItem;
            this.typeMarusiaConversationItem = mobileOfficialAppsMarusiaStat$TypeConversationItem;
            this.typeMarusiaReadingItem = mobileOfficialAppsMarusiaStat$TypeReadingItem;
            this.typeVideoPipItem = schemeStat$TypeVideoPipItem;
            this.typeVideoMiniplayerItem = schemeStat$TypeVideoMiniplayerItem;
            this.typeVideoDownloadItem = mobileOfficialAppsVideoStat$TypeVideoDownloadItem;
            this.typeVideoNotInteresting = mobileOfficialAppsVideoStat$TypeVideoNotInteresting;
            this.typeVideoDoNotRecommendAuthor = mobileOfficialAppsVideoStat$TypeVideoDoNotRecommendAuthor;
            this.typeVideoTvProgram = mobileOfficialAppsVideoStat$TypeVideoTvProgram;
            this.typeVideoWatchLater = mobileOfficialAppsVideoStat$TypeVideoWatchLater;
            this.typeVideoBackgroundListeningItem = schemeStat$TypeVideoBackgroundListeningItem;
            this.typeVideoClickWithActivePlayer = commonVideoStat$TypeVideoClickWithActivePlayer;
            this.typeSearchClickItem = mobileOfficialAppsSearchStat$TypeSearchClickItem;
            this.typeSearchLocalClickItem = commonSearchStat$TypeSearchLocalClickItem;
            this.typeClassifiedsClick = schemeStat$TypeClassifiedsClick;
            this.typeAliexpressClick = schemeStat$TypeAliexpressClick;
            this.typeMarketCarouselClick = mobileOfficialAppsFeedStat$TypeMarketCarouselClick;
            this.typeFeedClickToShopsMoreButton = mobileOfficialAppsFeedStat$TypeFeedClickToShopsMoreButton;
            this.typeMarketClick = mobileOfficialAppsMarketStat$TypeMarketClick;
            this.typeMessagingContactRecommendationsItem = schemeStat$TypeMessagingContactRecommendationsItem;
            this.typeImConversationClickItem = mobileOfficialAppsImStat$TypeImConversationClickItem;
            this.typeMessagingSyncContactsClickItem = schemeStat$TypeMessagingSyncContactsClickItem;
            this.typeImGoToProfileClickItem = mobileOfficialAppsImStat$TypeImGoToProfileClickItem;
            this.typeImPhoneNumberCallClickItem = mobileOfficialAppsImStat$TypeImPhoneNumberCallClickItem;
            this.typeImShareFromChatProfileClickItem = mobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem;
            this.typeImGoArchiveClickItem = mobileOfficialAppsImStat$TypeImGoArchiveClickItem;
            this.typeImPinnedMessageClickItem = mobileOfficialAppsImStat$TypeImPinnedMessageClickItem;
            this.typeImChatItem = schemeStat$TypeImChatItem;
            this.typeProfileActionButtonItem = schemeStat$TypeProfileActionButtonItem;
            this.typeShareItem = schemeStat$TypeShareItem;
            this.typeSharingLinkOpen = mobileOfficialAppsSharingStat$TypeSharingLinkOpen;
            this.typeQuestionItem = schemeStat$TypeQuestionItem;
            this.typeBadgesItem = schemeStat$TypeBadgesItem;
            this.typeWishlistItem = schemeStat$TypeWishlistItem;
            this.typeOwnerButtonAppClick = schemeStat$TypeOwnerButtonAppClick;
            this.typeFriendEntrypointBlockItem = c0Var;
            this.typeSuperappOnboardingClickItem = mobileOfficialAppsSuperappStat$TypeSuperappOnboardingClickItem;
            this.typePhotoEditorItem = mobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem;
            this.typeProfileItem = mobileOfficialAppsProfileStat$TypeProfileItem;
            this.typeCommunityChannelItemClick = commonCommunitiesStat$TypeChannelItemClick;
            this.typeGroupsEventItem = mobileOfficialAppsGroupsStat$TypeGroupsEventItem;
            this.typeStickersClickItem = mobileOfficialAppsStickersStat$TypeStickersClickItem;
            this.typeRatingClick = commonMarketStat$TypeRatingClick;
            this.typeCallsItem = mobileOfficialAppsCallsStat$TypeCallsItem;
            this.typeAdminTipsClick = mobileOfficialAppsEcommStat$TypeAdminTipsClick;
            this.typeNftItem = mobileOfficialAppsNftStat$TypeNftItem;
            this.typeFeedMediaDiscoverItem = mobileOfficialAppsFeedStat$TypeFeedMediaDiscoverItem;
            this.typeFeedMediaDiscoverBlock = mobileOfficialAppsFeedStat$TypeFeedMediaDiscoverBlock;
            this.typeFeedOpenSimilarPosts = mobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts;
            this.typeFeedOpenCommentsModal = mobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal;
            this.typeFeedOpenReactionsModal = mobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal;
            this.typeFeedStartFastChat = mobileOfficialAppsFeedStat$TypeFeedStartFastChat;
            this.typeFeedCommentThreadButtonShowMore = mobileOfficialAppsFeedStat$TypeFeedCommentThreadButtonShowMore;
            this.typeFeedCommunityMediaItem = mobileOfficialAppsFeedStat$TypeFeedCommunityMediaItem;
            this.typeFeedItemMenuAction = mobileOfficialAppsFeedStat$TypeFeedItemMenuAction;
            this.typeFeedOpenItem = mobileOfficialAppsFeedStat$TypeFeedOpenItem;
            this.typePhotoSaveToAlbumMenuItem = mobileOfficialAppsFeedStat$TypePhotoSaveToAlbumMenuItem;
            this.typePhotoShareToMessageItem = mobileOfficialAppsFeedStat$TypePhotoShareToMessageItem;
            this.typeObsceneWord = mobileOfficialAppsFeedStat$TypeObsceneWord;
            this.typeRevealObsceneWords = mobileOfficialAppsFeedStat$TypeRevealObsceneWords;
            this.typeBadgesScreenItem = commonVasStat$TypeBadgesScreenItem;
            this.typeDzenStoryClick = mobileOfficialAppsFeedStat$TypeDzenStoryClick;
            this.typeDzenStoryItemClick = mobileOfficialAppsFeedStat$TypeDzenStoryItemClick;
            this.typeDzenShowMoreClick = mobileOfficialAppsFeedStat$TypeDzenShowMoreClick;
            this.typeHiddenSourceOpenProfile = mobileOfficialAppsFeedStat$TypeHiddenSourceOpenProfile;
            this.typeHiddenSourceUnbanButton = mobileOfficialAppsFeedStat$TypeHiddenSourceUnbanButton;
            this.typeHiddenSourceUnbanCancelButton = mobileOfficialAppsFeedStat$TypeHiddenSourceUnbanCancelButton;
            this.typeFeedCarouselLongtap = mobileOfficialAppsFeedStat$TypeFeedCarouselLongtap;
            this.typeFeedCarouselLongtapScroll = mobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll;
            this.typeFeedCarouselOnboardingScroll = mobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingScroll;
            this.typeCommunityOnboardingClick = commonCommunitiesStat$TypeCommunityOnboardingClick;
            this.typeFollowersModeOnboardingClick = mobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick;
            this.typeFollowersModeSwitchState = mobileOfficialAppsSocGraphStat$FollowersModeSwitchState;
            this.typePostingItem = mobileOfficialAppsConPostingStat$TypePostingItem;
            this.typeMarketItemReviewClick = commonMarketStat$TypeMarketItemReviewClick;
            this.typeMiniAppPolicyItem = mobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem;
            this.typeMiniAppPermissionBoxItem = mobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem;
            this.typeCommunityReviewClick = commonCommunitiesStat$TypeCommunityReviewClick;
            this.typePhotosItem = mobileOfficialAppsConPhotosStat$TypePhotosItem;
            this.typeOpenQualityIndexSettings = tVar;
            this.typeUgcStickersItem = commonVasStat$TypeUgcStickersItem;
            this.typeBannerClick = mobileOfficialAppsEcommStat$TypeBannerClick;
            this.typeVideoInAppReviewClick = mobileOfficialAppsVideoStat$TypeVideoInAppReviewClick;
            this.typeSystemPushClick = mobileOfficialAppsVideoStat$TypeSystemPushClick;
            this.typeAutoplayTurnClick = mobileOfficialAppsVideoStat$TypeAutoplayTurnClick;
            this.typeEcommClick = commonEcommStat$TypeEcommClickItem;
            this.typeVideoSuggestDownloadsClick = mobileOfficialAppsVideoStat$TypeVideoSuggestDownloadsClick;
            this.typeVideoKidsModeClick = mobileOfficialAppsVideoStat$TypeVideoKidsModeClick;
            this.typeVideoAuthorFilterClick = l0Var;
            this.typeVideoPlaylistShowAllClick = p0Var;
            this.typeVideoCatalogButtonExtendedClick = mobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick;
            this.typeVideoCatalogBlockItemClick = mobileOfficialAppsVideoStat$TypeVideoCatalogBlockItemClick;
            this.typeVideoAdditionalActionsClick = mobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick;
            this.typeEndVideoClick = mobileOfficialAppsVideoStat$TypeEndVideoClick;
            this.typeVideoDescriptionClick = mobileOfficialAppsVideoStat$TypeVideoDescriptionClick;
            this.typeVideoDownloadClick = mobileOfficialAppsVideoStat$TypeVideoDownloadClick;
            this.typeVideoRestrictionClickItem = mobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem;
            this.typeVideoCommentClick = mobileOfficialAppsVideoStat$TypeVideoCommentClick;
            this.typeVideoScreenCommentClick = mobileOfficialAppsVideoStat$TypeVideoScreenCommentClick;
            this.typeVideoCommentsSortTabClick = mobileOfficialAppsVideoStat$TypeVideoCommentsSortTabClick;
            this.typeVideoDiscoveryLogoClick = mobileOfficialAppsVideoStat$TypeVideoDiscoveryLogoClick;
            this.typeVideoPushesAdClick = mobileOfficialAppsVideoStat$TypeVideoPushesAdClick;
            this.typeVideoStopRecommendingCreator = mobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator;
            this.typeVideoUndoStopRecommendingCreator = mobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator;
            this.typeVideoFilterBlockClick = m0Var;
            this.typeSnowballEvents = schemeStat$TypeSnowballEvents;
            this.typeMiniAppSnowballModalAction = mobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction;
            this.typeVideoOpenFullscreenWithSwipe = o0Var;
            this.typeVideoAttachShortVideo = k0Var;
            this.typeClickSecureLockSettingsItem = mobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem;
            this.typeFeedCommentsSortTabClick = mobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick;
            this.typeLegalNoticeClick = schemeStat$TypeLegalNoticeClick;
            this.typeCommunityTabItemClick = commonCommunitiesStat$TypeTabItemClick;
            this.typeDonutGoalClickItem = commonCommunitiesStat$TypeDonutGoal;
            this.typeCommunitiesDonutClick = commonCommunitiesStat$TypeDonutClick;
            this.typeDonutBannerClick = commonCommunitiesStat$TypeDonutBanner;
            this.typeDonutSupportAuthorClick = commonCommunitiesStat$TypeDonutSupportAuthor;
            this.typeVideoDirectUrlStartItem = mobileOfficialAppsVideoStat$TypeVideoDirectUrlStartItem;
            this.typePromoClickItem = mobileOfficialAppsPromoStat$TypePromoClickItem;
            this.typeOnboardingEvent = commonOnboardingStat$TypeOnboardingEvent;
            this.typeNotificationItemClick = mobileOfficialAppsNotificationsStat$TypeNotificationItemClick;
            this.typeFeedOpenUserClick = mobileOfficialAppsFeedStat$TypeFeedOpenUserClick;
            this.typeFeedOpenGroupClick = mobileOfficialAppsFeedStat$TypeFeedOpenGroupClick;
            this.typeFeedOpenRepostedItemUserClick = mobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemUserClick;
            this.typeFeedOpenRepostedItemGroupClick = mobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick;
            this.typeFeedOpenStoryClick = mobileOfficialAppsFeedStat$TypeFeedOpenStoryClick;
            this.typeFeedHideProductPinClick = mobileOfficialAppsFeedStat$TypeFeedHideProductPinClick;
            this.typeFeedHideTicketItemPin = mobileOfficialAppsFeedStat$TypeFeedHideTicketItemPin;
            this.typeFeedOpenMarketItemClick = mobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick;
            this.typeFeedTicketItemClick = mobileOfficialAppsFeedStat$TypeFeedTicketItemClick;
            this.typeFeedShowProductsModalCardClick = mobileOfficialAppsFeedStat$TypeFeedShowProductsModalCardClick;
            this.typeFeedFollowClick = mobileOfficialAppsFeedStat$TypeFeedFollowClick;
            this.typeFeedUnfollowClick = mobileOfficialAppsFeedStat$TypeFeedUnfollowClick;
            this.typeFeedPostExpandText = mobileOfficialAppsFeedStat$TypeFeedPostExpandText;
            this.typeFeedPostCollapseText = a0Var;
            this.typeModalSharingOpen = mobileOfficialAppsSharingStat$TypeModalSharingOpen;
            this.typeModalSharingClick = mobileOfficialAppsSharingStat$TypeModalSharingClick;
            this.typeModalSharingClose = mobileOfficialAppsSharingStat$TypeModalSharingClose;
            this.typeVideoModalSharingClick = mobileOfficialAppsVideoStat$TypeVideoModalSharingClick;
            this.typeTvKidModeItem = mobileOfficialAppsVideoStat$TypeTvKidModeItem;
            this.typeOpenCommunityChats = mobileOfficialAppsImStat$TypeOpenCommunityChats;
            this.typeFeedPostUnmuteAudio = mobileOfficialAppsFeedStat$TypeFeedPostUnmuteAudio;
            this.typeFeedPostMuteAudio = mobileOfficialAppsFeedStat$TypeFeedPostMuteAudio;
            this.typeFeedPostPauseAudio = mobileOfficialAppsFeedStat$TypeFeedPostPauseAudio;
            this.typeFeedPostOpenAudio = mobileOfficialAppsFeedStat$TypeFeedPostOpenAudio;
            this.typeFeedPostAddedAudio = mobileOfficialAppsFeedStat$TypeFeedPostAddedAudio;
            this.typeFeedPostRemovedAudio = mobileOfficialAppsFeedStat$TypeFeedPostRemovedAudio;
            this.typeFeedPostOpenPlaylist = mobileOfficialAppsFeedStat$TypeFeedPostOpenPlaylist;
            this.typeFeedPostAddedPlaylist = mobileOfficialAppsFeedStat$TypeFeedPostAddedPlaylist;
            this.typeFeedPostRemovedPlaylist = mobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist;
            this.typeFeedCoownersEvent = mobileOfficialAppsFeedStat$TypeFeedCoownersEvent;
            this.typeFeedViewAuthors = mobileOfficialAppsFeedStat$TypeFeedViewAuthors;
            this.typeFeedViewRepostedItemAuthors = mobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors;
            this.typeActionButtonClick = mobileOfficialAppsFeedStat$TypeActionButtonClick;
            this.typeVideoKidsAgeFilterButtonTap = n0Var;
            this.typeTvQrModalAction = mobileOfficialAppsVideoStat$TypeTvQrModalAction;
            this.typeMoveYoutubeSubsOnboardingItem = mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingItem;
            this.typeMoveYoutubeSubsClickItem = mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem;
            this.typeSelectCreatorsClickItem = j0Var;
            this.typeSelectCreatorsScreenConfirmClick = mobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick;
            this.typeCreatorHideUndoHideClick = mobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick;
            this.typeSkipVideoButtonClick = mobileOfficialAppsVideoStat$TypeSkipVideoButtonClick;
            this.typeNextVideoAnnouncementClick = commonVideoStat$TypeNextVideoAnnouncement;
            this.typeVideoToggleFullscreen = mobileOfficialAppsVideoStat$TypeVideoToggleFullscreen;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TypeClick1)) {
                return false;
            }
            TypeClick1 typeClick1 = (TypeClick1) obj;
            return epx.f(this.item, typeClick1.item) && epx.f(this.position, typeClick1.position) && this.type == typeClick1.type && epx.f(this.typeDzenBlockArticleClick, typeClick1.typeDzenBlockArticleClick) && epx.f(this.typeDzenArticleItem, typeClick1.typeDzenArticleItem) && epx.f(this.typeAudioTapGotoEventItem, typeClick1.typeAudioTapGotoEventItem) && epx.f(this.typeFeedPostingSnippetEditItem, typeClick1.typeFeedPostingSnippetEditItem) && epx.f(this.typeAudioTapEqualizerEventItem, typeClick1.typeAudioTapEqualizerEventItem) && epx.f(this.typeCloseCastConnectOfferModal, typeClick1.typeCloseCastConnectOfferModal) && epx.f(this.typeAudioTapPopupEventItem, typeClick1.typeAudioTapPopupEventItem) && epx.f(this.typeAudioTapSettingsEventItem, typeClick1.typeAudioTapSettingsEventItem) && epx.f(this.typeAudioArtistClickItem, typeClick1.typeAudioArtistClickItem) && epx.f(this.typeNavigationTabClick, typeClick1.typeNavigationTabClick) && epx.f(this.typeAudioPopupItem, typeClick1.typeAudioPopupItem) && epx.f(this.typeImItem, typeClick1.typeImItem) && epx.f(this.typeMarketItem, typeClick1.typeMarketItem) && epx.f(this.typeMarketMarketplaceItem, typeClick1.typeMarketMarketplaceItem) && epx.f(this.typeSuperappScreenItem, typeClick1.typeSuperappScreenItem) && epx.f(this.typeMiniAppItem, typeClick1.typeMiniAppItem) && epx.f(this.typeVideoCardEvent, typeClick1.typeVideoCardEvent) && epx.f(this.typeClickItem, typeClick1.typeClickItem) && epx.f(this.typeGamesCatalogClick, typeClick1.typeGamesCatalogClick) && epx.f(this.typeVideoCardLongtap, typeClick1.typeVideoCardLongtap) && epx.f(this.typeClickPreferenceItem, typeClick1.typeClickPreferenceItem) && epx.f(this.typeClickPreferenceWithValueItem, typeClick1.typeClickPreferenceWithValueItem) && epx.f(this.typeClickPreferenceValueItem, typeClick1.typeClickPreferenceValueItem) && epx.f(this.typeSoftUpdateClick, typeClick1.typeSoftUpdateClick) && epx.f(this.typeFeedInteractionItem, typeClick1.typeFeedInteractionItem) && epx.f(this.typeOverlayAdClick, typeClick1.typeOverlayAdClick) && epx.f(this.typeUiHintItem, typeClick1.typeUiHintItem) && epx.f(this.typeClipViewerItem, typeClick1.typeClipViewerItem) && epx.f(this.typeVideoPlayerButtonClick, typeClick1.typeVideoPlayerButtonClick) && epx.f(this.typeVideoPlayerCastClick, typeClick1.typeVideoPlayerCastClick) && epx.f(this.typeVideoPlayerSeekClick, typeClick1.typeVideoPlayerSeekClick) && epx.f(this.typeVideoToClipAttach, typeClick1.typeVideoToClipAttach) && epx.f(this.typeClipInFeedOverlayClickItem, typeClick1.typeClipInFeedOverlayClickItem) && epx.f(this.typeVideoCreateClip, typeClick1.typeVideoCreateClip) && epx.f(this.typeClickToAuthorCommunity, typeClick1.typeClickToAuthorCommunity) && epx.f(this.typeClipsGridItem, typeClick1.typeClipsGridItem) && epx.f(this.typeSuperappSettingsItem, typeClick1.typeSuperappSettingsItem) && epx.f(this.typeMarusiaConversationItem, typeClick1.typeMarusiaConversationItem) && epx.f(this.typeMarusiaReadingItem, typeClick1.typeMarusiaReadingItem) && epx.f(this.typeVideoPipItem, typeClick1.typeVideoPipItem) && epx.f(this.typeVideoMiniplayerItem, typeClick1.typeVideoMiniplayerItem) && epx.f(this.typeVideoDownloadItem, typeClick1.typeVideoDownloadItem) && epx.f(this.typeVideoNotInteresting, typeClick1.typeVideoNotInteresting) && epx.f(this.typeVideoDoNotRecommendAuthor, typeClick1.typeVideoDoNotRecommendAuthor) && epx.f(this.typeVideoTvProgram, typeClick1.typeVideoTvProgram) && epx.f(this.typeVideoWatchLater, typeClick1.typeVideoWatchLater) && epx.f(this.typeVideoBackgroundListeningItem, typeClick1.typeVideoBackgroundListeningItem) && epx.f(this.typeVideoClickWithActivePlayer, typeClick1.typeVideoClickWithActivePlayer) && epx.f(this.typeSearchClickItem, typeClick1.typeSearchClickItem) && epx.f(this.typeSearchLocalClickItem, typeClick1.typeSearchLocalClickItem) && epx.f(this.typeClassifiedsClick, typeClick1.typeClassifiedsClick) && epx.f(this.typeAliexpressClick, typeClick1.typeAliexpressClick) && epx.f(this.typeMarketCarouselClick, typeClick1.typeMarketCarouselClick) && epx.f(this.typeFeedClickToShopsMoreButton, typeClick1.typeFeedClickToShopsMoreButton) && epx.f(this.typeMarketClick, typeClick1.typeMarketClick) && epx.f(this.typeMessagingContactRecommendationsItem, typeClick1.typeMessagingContactRecommendationsItem) && epx.f(this.typeImConversationClickItem, typeClick1.typeImConversationClickItem) && epx.f(this.typeMessagingSyncContactsClickItem, typeClick1.typeMessagingSyncContactsClickItem) && epx.f(this.typeImGoToProfileClickItem, typeClick1.typeImGoToProfileClickItem) && epx.f(this.typeImPhoneNumberCallClickItem, typeClick1.typeImPhoneNumberCallClickItem) && epx.f(this.typeImShareFromChatProfileClickItem, typeClick1.typeImShareFromChatProfileClickItem) && epx.f(this.typeImGoArchiveClickItem, typeClick1.typeImGoArchiveClickItem) && epx.f(this.typeImPinnedMessageClickItem, typeClick1.typeImPinnedMessageClickItem) && epx.f(this.typeImChatItem, typeClick1.typeImChatItem) && epx.f(this.typeProfileActionButtonItem, typeClick1.typeProfileActionButtonItem) && epx.f(this.typeShareItem, typeClick1.typeShareItem) && epx.f(this.typeSharingLinkOpen, typeClick1.typeSharingLinkOpen) && epx.f(this.typeQuestionItem, typeClick1.typeQuestionItem) && epx.f(this.typeBadgesItem, typeClick1.typeBadgesItem) && epx.f(this.typeWishlistItem, typeClick1.typeWishlistItem) && epx.f(this.typeOwnerButtonAppClick, typeClick1.typeOwnerButtonAppClick) && epx.f(this.typeFriendEntrypointBlockItem, typeClick1.typeFriendEntrypointBlockItem) && epx.f(this.typeSuperappOnboardingClickItem, typeClick1.typeSuperappOnboardingClickItem) && epx.f(this.typePhotoEditorItem, typeClick1.typePhotoEditorItem) && epx.f(this.typeProfileItem, typeClick1.typeProfileItem) && epx.f(this.typeCommunityChannelItemClick, typeClick1.typeCommunityChannelItemClick) && epx.f(this.typeGroupsEventItem, typeClick1.typeGroupsEventItem) && epx.f(this.typeStickersClickItem, typeClick1.typeStickersClickItem) && epx.f(this.typeRatingClick, typeClick1.typeRatingClick) && epx.f(this.typeCallsItem, typeClick1.typeCallsItem) && epx.f(this.typeAdminTipsClick, typeClick1.typeAdminTipsClick) && epx.f(this.typeNftItem, typeClick1.typeNftItem) && epx.f(this.typeFeedMediaDiscoverItem, typeClick1.typeFeedMediaDiscoverItem) && epx.f(this.typeFeedMediaDiscoverBlock, typeClick1.typeFeedMediaDiscoverBlock) && epx.f(this.typeFeedOpenSimilarPosts, typeClick1.typeFeedOpenSimilarPosts) && epx.f(this.typeFeedOpenCommentsModal, typeClick1.typeFeedOpenCommentsModal) && epx.f(this.typeFeedOpenReactionsModal, typeClick1.typeFeedOpenReactionsModal) && epx.f(this.typeFeedStartFastChat, typeClick1.typeFeedStartFastChat) && epx.f(this.typeFeedCommentThreadButtonShowMore, typeClick1.typeFeedCommentThreadButtonShowMore) && epx.f(this.typeFeedCommunityMediaItem, typeClick1.typeFeedCommunityMediaItem) && epx.f(this.typeFeedItemMenuAction, typeClick1.typeFeedItemMenuAction) && epx.f(this.typeFeedOpenItem, typeClick1.typeFeedOpenItem) && epx.f(this.typePhotoSaveToAlbumMenuItem, typeClick1.typePhotoSaveToAlbumMenuItem) && epx.f(this.typePhotoShareToMessageItem, typeClick1.typePhotoShareToMessageItem) && epx.f(this.typeObsceneWord, typeClick1.typeObsceneWord) && epx.f(this.typeRevealObsceneWords, typeClick1.typeRevealObsceneWords) && epx.f(this.typeBadgesScreenItem, typeClick1.typeBadgesScreenItem) && epx.f(this.typeDzenStoryClick, typeClick1.typeDzenStoryClick) && epx.f(this.typeDzenStoryItemClick, typeClick1.typeDzenStoryItemClick) && epx.f(this.typeDzenShowMoreClick, typeClick1.typeDzenShowMoreClick) && epx.f(this.typeHiddenSourceOpenProfile, typeClick1.typeHiddenSourceOpenProfile) && epx.f(this.typeHiddenSourceUnbanButton, typeClick1.typeHiddenSourceUnbanButton) && epx.f(this.typeHiddenSourceUnbanCancelButton, typeClick1.typeHiddenSourceUnbanCancelButton) && epx.f(this.typeFeedCarouselLongtap, typeClick1.typeFeedCarouselLongtap) && epx.f(this.typeFeedCarouselLongtapScroll, typeClick1.typeFeedCarouselLongtapScroll) && epx.f(this.typeFeedCarouselOnboardingScroll, typeClick1.typeFeedCarouselOnboardingScroll) && epx.f(this.typeCommunityOnboardingClick, typeClick1.typeCommunityOnboardingClick) && epx.f(this.typeFollowersModeOnboardingClick, typeClick1.typeFollowersModeOnboardingClick) && epx.f(this.typeFollowersModeSwitchState, typeClick1.typeFollowersModeSwitchState) && epx.f(this.typePostingItem, typeClick1.typePostingItem) && epx.f(this.typeMarketItemReviewClick, typeClick1.typeMarketItemReviewClick) && epx.f(this.typeMiniAppPolicyItem, typeClick1.typeMiniAppPolicyItem) && epx.f(this.typeMiniAppPermissionBoxItem, typeClick1.typeMiniAppPermissionBoxItem) && epx.f(this.typeCommunityReviewClick, typeClick1.typeCommunityReviewClick) && epx.f(this.typePhotosItem, typeClick1.typePhotosItem) && epx.f(this.typeOpenQualityIndexSettings, typeClick1.typeOpenQualityIndexSettings) && epx.f(this.typeUgcStickersItem, typeClick1.typeUgcStickersItem) && epx.f(this.typeBannerClick, typeClick1.typeBannerClick) && epx.f(this.typeVideoInAppReviewClick, typeClick1.typeVideoInAppReviewClick) && epx.f(this.typeSystemPushClick, typeClick1.typeSystemPushClick) && epx.f(this.typeAutoplayTurnClick, typeClick1.typeAutoplayTurnClick) && epx.f(this.typeEcommClick, typeClick1.typeEcommClick) && epx.f(this.typeVideoSuggestDownloadsClick, typeClick1.typeVideoSuggestDownloadsClick) && epx.f(this.typeVideoKidsModeClick, typeClick1.typeVideoKidsModeClick) && epx.f(this.typeVideoAuthorFilterClick, typeClick1.typeVideoAuthorFilterClick) && epx.f(this.typeVideoPlaylistShowAllClick, typeClick1.typeVideoPlaylistShowAllClick) && epx.f(this.typeVideoCatalogButtonExtendedClick, typeClick1.typeVideoCatalogButtonExtendedClick) && epx.f(this.typeVideoCatalogBlockItemClick, typeClick1.typeVideoCatalogBlockItemClick) && epx.f(this.typeVideoAdditionalActionsClick, typeClick1.typeVideoAdditionalActionsClick) && epx.f(this.typeEndVideoClick, typeClick1.typeEndVideoClick) && epx.f(this.typeVideoDescriptionClick, typeClick1.typeVideoDescriptionClick) && epx.f(this.typeVideoDownloadClick, typeClick1.typeVideoDownloadClick) && epx.f(this.typeVideoRestrictionClickItem, typeClick1.typeVideoRestrictionClickItem) && epx.f(this.typeVideoCommentClick, typeClick1.typeVideoCommentClick) && epx.f(this.typeVideoScreenCommentClick, typeClick1.typeVideoScreenCommentClick) && epx.f(this.typeVideoCommentsSortTabClick, typeClick1.typeVideoCommentsSortTabClick) && epx.f(this.typeVideoDiscoveryLogoClick, typeClick1.typeVideoDiscoveryLogoClick) && epx.f(this.typeVideoPushesAdClick, typeClick1.typeVideoPushesAdClick) && epx.f(this.typeVideoStopRecommendingCreator, typeClick1.typeVideoStopRecommendingCreator) && epx.f(this.typeVideoUndoStopRecommendingCreator, typeClick1.typeVideoUndoStopRecommendingCreator) && epx.f(this.typeVideoFilterBlockClick, typeClick1.typeVideoFilterBlockClick) && epx.f(this.typeSnowballEvents, typeClick1.typeSnowballEvents) && epx.f(this.typeMiniAppSnowballModalAction, typeClick1.typeMiniAppSnowballModalAction) && epx.f(this.typeVideoOpenFullscreenWithSwipe, typeClick1.typeVideoOpenFullscreenWithSwipe) && epx.f(this.typeVideoAttachShortVideo, typeClick1.typeVideoAttachShortVideo) && epx.f(this.typeClickSecureLockSettingsItem, typeClick1.typeClickSecureLockSettingsItem) && epx.f(this.typeFeedCommentsSortTabClick, typeClick1.typeFeedCommentsSortTabClick) && epx.f(this.typeLegalNoticeClick, typeClick1.typeLegalNoticeClick) && epx.f(this.typeCommunityTabItemClick, typeClick1.typeCommunityTabItemClick) && epx.f(this.typeDonutGoalClickItem, typeClick1.typeDonutGoalClickItem) && epx.f(this.typeCommunitiesDonutClick, typeClick1.typeCommunitiesDonutClick) && epx.f(this.typeDonutBannerClick, typeClick1.typeDonutBannerClick) && epx.f(this.typeDonutSupportAuthorClick, typeClick1.typeDonutSupportAuthorClick) && epx.f(this.typeVideoDirectUrlStartItem, typeClick1.typeVideoDirectUrlStartItem) && epx.f(this.typePromoClickItem, typeClick1.typePromoClickItem) && epx.f(this.typeOnboardingEvent, typeClick1.typeOnboardingEvent) && epx.f(this.typeNotificationItemClick, typeClick1.typeNotificationItemClick) && epx.f(this.typeFeedOpenUserClick, typeClick1.typeFeedOpenUserClick) && epx.f(this.typeFeedOpenGroupClick, typeClick1.typeFeedOpenGroupClick) && epx.f(this.typeFeedOpenRepostedItemUserClick, typeClick1.typeFeedOpenRepostedItemUserClick) && epx.f(this.typeFeedOpenRepostedItemGroupClick, typeClick1.typeFeedOpenRepostedItemGroupClick) && epx.f(this.typeFeedOpenStoryClick, typeClick1.typeFeedOpenStoryClick) && epx.f(this.typeFeedHideProductPinClick, typeClick1.typeFeedHideProductPinClick) && epx.f(this.typeFeedHideTicketItemPin, typeClick1.typeFeedHideTicketItemPin) && epx.f(this.typeFeedOpenMarketItemClick, typeClick1.typeFeedOpenMarketItemClick) && epx.f(this.typeFeedTicketItemClick, typeClick1.typeFeedTicketItemClick) && epx.f(this.typeFeedShowProductsModalCardClick, typeClick1.typeFeedShowProductsModalCardClick) && epx.f(this.typeFeedFollowClick, typeClick1.typeFeedFollowClick) && epx.f(this.typeFeedUnfollowClick, typeClick1.typeFeedUnfollowClick) && epx.f(this.typeFeedPostExpandText, typeClick1.typeFeedPostExpandText) && epx.f(this.typeFeedPostCollapseText, typeClick1.typeFeedPostCollapseText) && epx.f(this.typeModalSharingOpen, typeClick1.typeModalSharingOpen) && epx.f(this.typeModalSharingClick, typeClick1.typeModalSharingClick) && epx.f(this.typeModalSharingClose, typeClick1.typeModalSharingClose) && epx.f(this.typeVideoModalSharingClick, typeClick1.typeVideoModalSharingClick) && epx.f(this.typeTvKidModeItem, typeClick1.typeTvKidModeItem) && epx.f(this.typeOpenCommunityChats, typeClick1.typeOpenCommunityChats) && epx.f(this.typeFeedPostUnmuteAudio, typeClick1.typeFeedPostUnmuteAudio) && epx.f(this.typeFeedPostMuteAudio, typeClick1.typeFeedPostMuteAudio) && epx.f(this.typeFeedPostPauseAudio, typeClick1.typeFeedPostPauseAudio) && epx.f(this.typeFeedPostOpenAudio, typeClick1.typeFeedPostOpenAudio) && epx.f(this.typeFeedPostAddedAudio, typeClick1.typeFeedPostAddedAudio) && epx.f(this.typeFeedPostRemovedAudio, typeClick1.typeFeedPostRemovedAudio) && epx.f(this.typeFeedPostOpenPlaylist, typeClick1.typeFeedPostOpenPlaylist) && epx.f(this.typeFeedPostAddedPlaylist, typeClick1.typeFeedPostAddedPlaylist) && epx.f(this.typeFeedPostRemovedPlaylist, typeClick1.typeFeedPostRemovedPlaylist) && epx.f(this.typeFeedCoownersEvent, typeClick1.typeFeedCoownersEvent) && epx.f(this.typeFeedViewAuthors, typeClick1.typeFeedViewAuthors) && epx.f(this.typeFeedViewRepostedItemAuthors, typeClick1.typeFeedViewRepostedItemAuthors) && epx.f(this.typeActionButtonClick, typeClick1.typeActionButtonClick) && epx.f(this.typeVideoKidsAgeFilterButtonTap, typeClick1.typeVideoKidsAgeFilterButtonTap) && epx.f(this.typeTvQrModalAction, typeClick1.typeTvQrModalAction) && epx.f(this.typeMoveYoutubeSubsOnboardingItem, typeClick1.typeMoveYoutubeSubsOnboardingItem) && epx.f(this.typeMoveYoutubeSubsClickItem, typeClick1.typeMoveYoutubeSubsClickItem) && epx.f(this.typeSelectCreatorsClickItem, typeClick1.typeSelectCreatorsClickItem) && epx.f(this.typeSelectCreatorsScreenConfirmClick, typeClick1.typeSelectCreatorsScreenConfirmClick) && epx.f(this.typeCreatorHideUndoHideClick, typeClick1.typeCreatorHideUndoHideClick) && epx.f(this.typeSkipVideoButtonClick, typeClick1.typeSkipVideoButtonClick) && epx.f(this.typeNextVideoAnnouncementClick, typeClick1.typeNextVideoAnnouncementClick) && epx.f(this.typeVideoToggleFullscreen, typeClick1.typeVideoToggleFullscreen);
        }

        public final int hashCode() {
            int hashCode = this.item.hashCode() * 31;
            Integer num = this.position;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Type type = this.type;
            int hashCode3 = (hashCode2 + (type == null ? 0 : type.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeDzenBlockArticleClick mobileOfficialAppsFeedStat$TypeDzenBlockArticleClick = this.typeDzenBlockArticleClick;
            int hashCode4 = (hashCode3 + (mobileOfficialAppsFeedStat$TypeDzenBlockArticleClick == null ? 0 : mobileOfficialAppsFeedStat$TypeDzenBlockArticleClick.hashCode())) * 31;
            MobileOfficialAppsConDzenStat$TypeDzenArticleItem mobileOfficialAppsConDzenStat$TypeDzenArticleItem = this.typeDzenArticleItem;
            int hashCode5 = (hashCode4 + (mobileOfficialAppsConDzenStat$TypeDzenArticleItem == null ? 0 : mobileOfficialAppsConDzenStat$TypeDzenArticleItem.hashCode())) * 31;
            CommonAudioStat$TypeAudioTapGotoEventItem commonAudioStat$TypeAudioTapGotoEventItem = this.typeAudioTapGotoEventItem;
            int hashCode6 = (hashCode5 + (commonAudioStat$TypeAudioTapGotoEventItem == null ? 0 : commonAudioStat$TypeAudioTapGotoEventItem.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem mobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem = this.typeFeedPostingSnippetEditItem;
            int hashCode7 = (hashCode6 + (mobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem.hashCode())) * 31;
            CommonAudioStat$TypeAudioTapEqualizerEventItem commonAudioStat$TypeAudioTapEqualizerEventItem = this.typeAudioTapEqualizerEventItem;
            int hashCode8 = (hashCode7 + (commonAudioStat$TypeAudioTapEqualizerEventItem == null ? 0 : commonAudioStat$TypeAudioTapEqualizerEventItem.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeCloseCastConnectOfferModal mobileOfficialAppsVideoStat$TypeCloseCastConnectOfferModal = this.typeCloseCastConnectOfferModal;
            int hashCode9 = (hashCode8 + (mobileOfficialAppsVideoStat$TypeCloseCastConnectOfferModal == null ? 0 : mobileOfficialAppsVideoStat$TypeCloseCastConnectOfferModal.hashCode())) * 31;
            CommonAudioStat$TypeAudioTapPopupEventItem commonAudioStat$TypeAudioTapPopupEventItem = this.typeAudioTapPopupEventItem;
            int hashCode10 = (hashCode9 + (commonAudioStat$TypeAudioTapPopupEventItem == null ? 0 : commonAudioStat$TypeAudioTapPopupEventItem.hashCode())) * 31;
            CommonAudioStat$TypeAudioTapSettingsEventItem commonAudioStat$TypeAudioTapSettingsEventItem = this.typeAudioTapSettingsEventItem;
            int hashCode11 = (hashCode10 + (commonAudioStat$TypeAudioTapSettingsEventItem == null ? 0 : commonAudioStat$TypeAudioTapSettingsEventItem.hashCode())) * 31;
            CommonAudioStat$TypeAudioArtistClickItem commonAudioStat$TypeAudioArtistClickItem = this.typeAudioArtistClickItem;
            int hashCode12 = (hashCode11 + (commonAudioStat$TypeAudioArtistClickItem == null ? 0 : commonAudioStat$TypeAudioArtistClickItem.hashCode())) * 31;
            SchemeStat$TypeNavigationTabClick schemeStat$TypeNavigationTabClick = this.typeNavigationTabClick;
            int hashCode13 = (hashCode12 + (schemeStat$TypeNavigationTabClick == null ? 0 : schemeStat$TypeNavigationTabClick.hashCode())) * 31;
            CommonAudioStat$TypeAudioPopupItem commonAudioStat$TypeAudioPopupItem = this.typeAudioPopupItem;
            int hashCode14 = (hashCode13 + (commonAudioStat$TypeAudioPopupItem == null ? 0 : commonAudioStat$TypeAudioPopupItem.hashCode())) * 31;
            SchemeStat$TypeImItem schemeStat$TypeImItem = this.typeImItem;
            int hashCode15 = (hashCode14 + (schemeStat$TypeImItem == null ? 0 : schemeStat$TypeImItem.hashCode())) * 31;
            SchemeStat$TypeMarketItem schemeStat$TypeMarketItem = this.typeMarketItem;
            int hashCode16 = (hashCode15 + (schemeStat$TypeMarketItem == null ? 0 : schemeStat$TypeMarketItem.hashCode())) * 31;
            SchemeStat$TypeMarketMarketplaceItem schemeStat$TypeMarketMarketplaceItem = this.typeMarketMarketplaceItem;
            int hashCode17 = (hashCode16 + (schemeStat$TypeMarketMarketplaceItem == null ? 0 : schemeStat$TypeMarketMarketplaceItem.hashCode())) * 31;
            SchemeStat$TypeSuperappScreenItem schemeStat$TypeSuperappScreenItem = this.typeSuperappScreenItem;
            int hashCode18 = (hashCode17 + (schemeStat$TypeSuperappScreenItem == null ? 0 : schemeStat$TypeSuperappScreenItem.hashCode())) * 31;
            SchemeStat$TypeMiniAppItem schemeStat$TypeMiniAppItem = this.typeMiniAppItem;
            int hashCode19 = (hashCode18 + (schemeStat$TypeMiniAppItem == null ? 0 : schemeStat$TypeMiniAppItem.hashCode())) * 31;
            CommonVideoStat$TypeVideoCardEvent commonVideoStat$TypeVideoCardEvent = this.typeVideoCardEvent;
            int hashCode20 = (hashCode19 + (commonVideoStat$TypeVideoCardEvent == null ? 0 : commonVideoStat$TypeVideoCardEvent.hashCode())) * 31;
            SchemeStat$TypeClickItem schemeStat$TypeClickItem = this.typeClickItem;
            int hashCode21 = (hashCode20 + (schemeStat$TypeClickItem == null ? 0 : schemeStat$TypeClickItem.hashCode())) * 31;
            SchemeStat$TypeGamesCatalogClick schemeStat$TypeGamesCatalogClick = this.typeGamesCatalogClick;
            int hashCode22 = (hashCode21 + (schemeStat$TypeGamesCatalogClick == null ? 0 : schemeStat$TypeGamesCatalogClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoCardLongtap mobileOfficialAppsVideoStat$TypeVideoCardLongtap = this.typeVideoCardLongtap;
            int hashCode23 = (hashCode22 + (mobileOfficialAppsVideoStat$TypeVideoCardLongtap == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoCardLongtap.hashCode())) * 31;
            SchemeStat$TypeClickPreferenceItem schemeStat$TypeClickPreferenceItem = this.typeClickPreferenceItem;
            int hashCode24 = (hashCode23 + (schemeStat$TypeClickPreferenceItem == null ? 0 : schemeStat$TypeClickPreferenceItem.hashCode())) * 31;
            MobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem mobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem = this.typeClickPreferenceWithValueItem;
            int hashCode25 = (hashCode24 + (mobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem == null ? 0 : mobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem.hashCode())) * 31;
            SchemeStat$TypeClickPreferenceValueItem schemeStat$TypeClickPreferenceValueItem = this.typeClickPreferenceValueItem;
            int hashCode26 = (hashCode25 + (schemeStat$TypeClickPreferenceValueItem == null ? 0 : schemeStat$TypeClickPreferenceValueItem.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeSoftUpdateClick mobileOfficialAppsVideoStat$TypeSoftUpdateClick = this.typeSoftUpdateClick;
            int hashCode27 = (hashCode26 + (mobileOfficialAppsVideoStat$TypeSoftUpdateClick == null ? 0 : mobileOfficialAppsVideoStat$TypeSoftUpdateClick.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedInteractionItem mobileOfficialAppsFeedStat$TypeFeedInteractionItem = this.typeFeedInteractionItem;
            int hashCode28 = (hashCode27 + (mobileOfficialAppsFeedStat$TypeFeedInteractionItem == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedInteractionItem.hashCode())) * 31;
            CommonVideoAdsStat$TypeOverlayAdClick commonVideoAdsStat$TypeOverlayAdClick = this.typeOverlayAdClick;
            int hashCode29 = (hashCode28 + (commonVideoAdsStat$TypeOverlayAdClick == null ? 0 : commonVideoAdsStat$TypeOverlayAdClick.hashCode())) * 31;
            CommonOnboardingStat$TypeUiHintItem commonOnboardingStat$TypeUiHintItem = this.typeUiHintItem;
            int hashCode30 = (hashCode29 + (commonOnboardingStat$TypeUiHintItem == null ? 0 : commonOnboardingStat$TypeUiHintItem.hashCode())) * 31;
            SchemeStat$TypeClipViewerItem schemeStat$TypeClipViewerItem = this.typeClipViewerItem;
            int hashCode31 = (hashCode30 + (schemeStat$TypeClipViewerItem == null ? 0 : schemeStat$TypeClipViewerItem.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick mobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick = this.typeVideoPlayerButtonClick;
            int hashCode32 = (hashCode31 + (mobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoPlayerCastClick mobileOfficialAppsVideoStat$TypeVideoPlayerCastClick = this.typeVideoPlayerCastClick;
            int hashCode33 = (hashCode32 + (mobileOfficialAppsVideoStat$TypeVideoPlayerCastClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoPlayerCastClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick mobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick = this.typeVideoPlayerSeekClick;
            int hashCode34 = (hashCode33 + (mobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoToClipAttach mobileOfficialAppsVideoStat$TypeVideoToClipAttach = this.typeVideoToClipAttach;
            int hashCode35 = (hashCode34 + (mobileOfficialAppsVideoStat$TypeVideoToClipAttach == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoToClipAttach.hashCode())) * 31;
            MobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem mobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem = this.typeClipInFeedOverlayClickItem;
            int hashCode36 = (hashCode35 + (mobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem == null ? 0 : mobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem.hashCode())) * 31;
            CommonVideoStat$TypeVideoCreateClip commonVideoStat$TypeVideoCreateClip = this.typeVideoCreateClip;
            int hashCode37 = (hashCode36 + (commonVideoStat$TypeVideoCreateClip == null ? 0 : commonVideoStat$TypeVideoCreateClip.hashCode())) * 31;
            CommonVideoStat$TypeClickToAuthorCommunity commonVideoStat$TypeClickToAuthorCommunity = this.typeClickToAuthorCommunity;
            int hashCode38 = (hashCode37 + (commonVideoStat$TypeClickToAuthorCommunity == null ? 0 : commonVideoStat$TypeClickToAuthorCommunity.hashCode())) * 31;
            MobileOfficialAppsClipsStat$TypeClipsGridItem mobileOfficialAppsClipsStat$TypeClipsGridItem = this.typeClipsGridItem;
            int hashCode39 = (hashCode38 + (mobileOfficialAppsClipsStat$TypeClipsGridItem == null ? 0 : mobileOfficialAppsClipsStat$TypeClipsGridItem.hashCode())) * 31;
            SchemeStat$TypeSuperappSettingsItem schemeStat$TypeSuperappSettingsItem = this.typeSuperappSettingsItem;
            int hashCode40 = (hashCode39 + (schemeStat$TypeSuperappSettingsItem == null ? 0 : schemeStat$TypeSuperappSettingsItem.hashCode())) * 31;
            MobileOfficialAppsMarusiaStat$TypeConversationItem mobileOfficialAppsMarusiaStat$TypeConversationItem = this.typeMarusiaConversationItem;
            int hashCode41 = (hashCode40 + (mobileOfficialAppsMarusiaStat$TypeConversationItem == null ? 0 : mobileOfficialAppsMarusiaStat$TypeConversationItem.hashCode())) * 31;
            MobileOfficialAppsMarusiaStat$TypeReadingItem mobileOfficialAppsMarusiaStat$TypeReadingItem = this.typeMarusiaReadingItem;
            int hashCode42 = (hashCode41 + (mobileOfficialAppsMarusiaStat$TypeReadingItem == null ? 0 : mobileOfficialAppsMarusiaStat$TypeReadingItem.hashCode())) * 31;
            SchemeStat$TypeVideoPipItem schemeStat$TypeVideoPipItem = this.typeVideoPipItem;
            int hashCode43 = (hashCode42 + (schemeStat$TypeVideoPipItem == null ? 0 : schemeStat$TypeVideoPipItem.hashCode())) * 31;
            SchemeStat$TypeVideoMiniplayerItem schemeStat$TypeVideoMiniplayerItem = this.typeVideoMiniplayerItem;
            int hashCode44 = (hashCode43 + (schemeStat$TypeVideoMiniplayerItem == null ? 0 : schemeStat$TypeVideoMiniplayerItem.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoDownloadItem mobileOfficialAppsVideoStat$TypeVideoDownloadItem = this.typeVideoDownloadItem;
            int hashCode45 = (hashCode44 + (mobileOfficialAppsVideoStat$TypeVideoDownloadItem == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoDownloadItem.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoNotInteresting mobileOfficialAppsVideoStat$TypeVideoNotInteresting = this.typeVideoNotInteresting;
            int hashCode46 = (hashCode45 + (mobileOfficialAppsVideoStat$TypeVideoNotInteresting == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoNotInteresting.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoDoNotRecommendAuthor mobileOfficialAppsVideoStat$TypeVideoDoNotRecommendAuthor = this.typeVideoDoNotRecommendAuthor;
            int hashCode47 = (hashCode46 + (mobileOfficialAppsVideoStat$TypeVideoDoNotRecommendAuthor == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoDoNotRecommendAuthor.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoTvProgram mobileOfficialAppsVideoStat$TypeVideoTvProgram = this.typeVideoTvProgram;
            int hashCode48 = (hashCode47 + (mobileOfficialAppsVideoStat$TypeVideoTvProgram == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoTvProgram.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoWatchLater mobileOfficialAppsVideoStat$TypeVideoWatchLater = this.typeVideoWatchLater;
            int hashCode49 = (hashCode48 + (mobileOfficialAppsVideoStat$TypeVideoWatchLater == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoWatchLater.hashCode())) * 31;
            SchemeStat$TypeVideoBackgroundListeningItem schemeStat$TypeVideoBackgroundListeningItem = this.typeVideoBackgroundListeningItem;
            int hashCode50 = (hashCode49 + (schemeStat$TypeVideoBackgroundListeningItem == null ? 0 : schemeStat$TypeVideoBackgroundListeningItem.hashCode())) * 31;
            CommonVideoStat$TypeVideoClickWithActivePlayer commonVideoStat$TypeVideoClickWithActivePlayer = this.typeVideoClickWithActivePlayer;
            int hashCode51 = (hashCode50 + (commonVideoStat$TypeVideoClickWithActivePlayer == null ? 0 : commonVideoStat$TypeVideoClickWithActivePlayer.hashCode())) * 31;
            MobileOfficialAppsSearchStat$TypeSearchClickItem mobileOfficialAppsSearchStat$TypeSearchClickItem = this.typeSearchClickItem;
            int hashCode52 = (hashCode51 + (mobileOfficialAppsSearchStat$TypeSearchClickItem == null ? 0 : mobileOfficialAppsSearchStat$TypeSearchClickItem.hashCode())) * 31;
            CommonSearchStat$TypeSearchLocalClickItem commonSearchStat$TypeSearchLocalClickItem = this.typeSearchLocalClickItem;
            int hashCode53 = (hashCode52 + (commonSearchStat$TypeSearchLocalClickItem == null ? 0 : commonSearchStat$TypeSearchLocalClickItem.hashCode())) * 31;
            SchemeStat$TypeClassifiedsClick schemeStat$TypeClassifiedsClick = this.typeClassifiedsClick;
            int hashCode54 = (hashCode53 + (schemeStat$TypeClassifiedsClick == null ? 0 : schemeStat$TypeClassifiedsClick.hashCode())) * 31;
            SchemeStat$TypeAliexpressClick schemeStat$TypeAliexpressClick = this.typeAliexpressClick;
            int hashCode55 = (hashCode54 + (schemeStat$TypeAliexpressClick == null ? 0 : schemeStat$TypeAliexpressClick.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeMarketCarouselClick mobileOfficialAppsFeedStat$TypeMarketCarouselClick = this.typeMarketCarouselClick;
            int hashCode56 = (hashCode55 + (mobileOfficialAppsFeedStat$TypeMarketCarouselClick == null ? 0 : mobileOfficialAppsFeedStat$TypeMarketCarouselClick.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedClickToShopsMoreButton mobileOfficialAppsFeedStat$TypeFeedClickToShopsMoreButton = this.typeFeedClickToShopsMoreButton;
            int hashCode57 = (hashCode56 + (mobileOfficialAppsFeedStat$TypeFeedClickToShopsMoreButton == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedClickToShopsMoreButton.hashCode())) * 31;
            MobileOfficialAppsMarketStat$TypeMarketClick mobileOfficialAppsMarketStat$TypeMarketClick = this.typeMarketClick;
            int hashCode58 = (hashCode57 + (mobileOfficialAppsMarketStat$TypeMarketClick == null ? 0 : mobileOfficialAppsMarketStat$TypeMarketClick.hashCode())) * 31;
            SchemeStat$TypeMessagingContactRecommendationsItem schemeStat$TypeMessagingContactRecommendationsItem = this.typeMessagingContactRecommendationsItem;
            int hashCode59 = (hashCode58 + (schemeStat$TypeMessagingContactRecommendationsItem == null ? 0 : schemeStat$TypeMessagingContactRecommendationsItem.hashCode())) * 31;
            MobileOfficialAppsImStat$TypeImConversationClickItem mobileOfficialAppsImStat$TypeImConversationClickItem = this.typeImConversationClickItem;
            int hashCode60 = (hashCode59 + (mobileOfficialAppsImStat$TypeImConversationClickItem == null ? 0 : mobileOfficialAppsImStat$TypeImConversationClickItem.hashCode())) * 31;
            SchemeStat$TypeMessagingSyncContactsClickItem schemeStat$TypeMessagingSyncContactsClickItem = this.typeMessagingSyncContactsClickItem;
            int hashCode61 = (hashCode60 + (schemeStat$TypeMessagingSyncContactsClickItem == null ? 0 : schemeStat$TypeMessagingSyncContactsClickItem.hashCode())) * 31;
            MobileOfficialAppsImStat$TypeImGoToProfileClickItem mobileOfficialAppsImStat$TypeImGoToProfileClickItem = this.typeImGoToProfileClickItem;
            int hashCode62 = (hashCode61 + (mobileOfficialAppsImStat$TypeImGoToProfileClickItem == null ? 0 : mobileOfficialAppsImStat$TypeImGoToProfileClickItem.hashCode())) * 31;
            MobileOfficialAppsImStat$TypeImPhoneNumberCallClickItem mobileOfficialAppsImStat$TypeImPhoneNumberCallClickItem = this.typeImPhoneNumberCallClickItem;
            int hashCode63 = (hashCode62 + (mobileOfficialAppsImStat$TypeImPhoneNumberCallClickItem == null ? 0 : mobileOfficialAppsImStat$TypeImPhoneNumberCallClickItem.hashCode())) * 31;
            MobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem mobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem = this.typeImShareFromChatProfileClickItem;
            int hashCode64 = (hashCode63 + (mobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem == null ? 0 : mobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem.hashCode())) * 31;
            MobileOfficialAppsImStat$TypeImGoArchiveClickItem mobileOfficialAppsImStat$TypeImGoArchiveClickItem = this.typeImGoArchiveClickItem;
            int hashCode65 = (hashCode64 + (mobileOfficialAppsImStat$TypeImGoArchiveClickItem == null ? 0 : mobileOfficialAppsImStat$TypeImGoArchiveClickItem.hashCode())) * 31;
            MobileOfficialAppsImStat$TypeImPinnedMessageClickItem mobileOfficialAppsImStat$TypeImPinnedMessageClickItem = this.typeImPinnedMessageClickItem;
            int hashCode66 = (hashCode65 + (mobileOfficialAppsImStat$TypeImPinnedMessageClickItem == null ? 0 : mobileOfficialAppsImStat$TypeImPinnedMessageClickItem.hashCode())) * 31;
            SchemeStat$TypeImChatItem schemeStat$TypeImChatItem = this.typeImChatItem;
            int hashCode67 = (hashCode66 + (schemeStat$TypeImChatItem == null ? 0 : schemeStat$TypeImChatItem.hashCode())) * 31;
            SchemeStat$TypeProfileActionButtonItem schemeStat$TypeProfileActionButtonItem = this.typeProfileActionButtonItem;
            int hashCode68 = (hashCode67 + (schemeStat$TypeProfileActionButtonItem == null ? 0 : schemeStat$TypeProfileActionButtonItem.hashCode())) * 31;
            SchemeStat$TypeShareItem schemeStat$TypeShareItem = this.typeShareItem;
            int hashCode69 = (hashCode68 + (schemeStat$TypeShareItem == null ? 0 : schemeStat$TypeShareItem.hashCode())) * 31;
            MobileOfficialAppsSharingStat$TypeSharingLinkOpen mobileOfficialAppsSharingStat$TypeSharingLinkOpen = this.typeSharingLinkOpen;
            int hashCode70 = (hashCode69 + (mobileOfficialAppsSharingStat$TypeSharingLinkOpen == null ? 0 : mobileOfficialAppsSharingStat$TypeSharingLinkOpen.hashCode())) * 31;
            SchemeStat$TypeQuestionItem schemeStat$TypeQuestionItem = this.typeQuestionItem;
            int hashCode71 = (hashCode70 + (schemeStat$TypeQuestionItem == null ? 0 : schemeStat$TypeQuestionItem.hashCode())) * 31;
            SchemeStat$TypeBadgesItem schemeStat$TypeBadgesItem = this.typeBadgesItem;
            int hashCode72 = (hashCode71 + (schemeStat$TypeBadgesItem == null ? 0 : schemeStat$TypeBadgesItem.hashCode())) * 31;
            SchemeStat$TypeWishlistItem schemeStat$TypeWishlistItem = this.typeWishlistItem;
            int hashCode73 = (hashCode72 + (schemeStat$TypeWishlistItem == null ? 0 : schemeStat$TypeWishlistItem.hashCode())) * 31;
            SchemeStat$TypeOwnerButtonAppClick schemeStat$TypeOwnerButtonAppClick = this.typeOwnerButtonAppClick;
            int hashCode74 = (hashCode73 + (schemeStat$TypeOwnerButtonAppClick == null ? 0 : schemeStat$TypeOwnerButtonAppClick.hashCode())) * 31;
            c0 c0Var = this.typeFriendEntrypointBlockItem;
            int hashCode75 = (hashCode74 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
            MobileOfficialAppsSuperappStat$TypeSuperappOnboardingClickItem mobileOfficialAppsSuperappStat$TypeSuperappOnboardingClickItem = this.typeSuperappOnboardingClickItem;
            int hashCode76 = (hashCode75 + (mobileOfficialAppsSuperappStat$TypeSuperappOnboardingClickItem == null ? 0 : mobileOfficialAppsSuperappStat$TypeSuperappOnboardingClickItem.hashCode())) * 31;
            MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem mobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem = this.typePhotoEditorItem;
            int hashCode77 = (hashCode76 + (mobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem == null ? 0 : mobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.hashCode())) * 31;
            MobileOfficialAppsProfileStat$TypeProfileItem mobileOfficialAppsProfileStat$TypeProfileItem = this.typeProfileItem;
            int hashCode78 = (hashCode77 + (mobileOfficialAppsProfileStat$TypeProfileItem == null ? 0 : mobileOfficialAppsProfileStat$TypeProfileItem.hashCode())) * 31;
            CommonCommunitiesStat$TypeChannelItemClick commonCommunitiesStat$TypeChannelItemClick = this.typeCommunityChannelItemClick;
            int hashCode79 = (hashCode78 + (commonCommunitiesStat$TypeChannelItemClick == null ? 0 : commonCommunitiesStat$TypeChannelItemClick.hashCode())) * 31;
            MobileOfficialAppsGroupsStat$TypeGroupsEventItem mobileOfficialAppsGroupsStat$TypeGroupsEventItem = this.typeGroupsEventItem;
            int hashCode80 = (hashCode79 + (mobileOfficialAppsGroupsStat$TypeGroupsEventItem == null ? 0 : mobileOfficialAppsGroupsStat$TypeGroupsEventItem.hashCode())) * 31;
            MobileOfficialAppsStickersStat$TypeStickersClickItem mobileOfficialAppsStickersStat$TypeStickersClickItem = this.typeStickersClickItem;
            int hashCode81 = (hashCode80 + (mobileOfficialAppsStickersStat$TypeStickersClickItem == null ? 0 : mobileOfficialAppsStickersStat$TypeStickersClickItem.hashCode())) * 31;
            CommonMarketStat$TypeRatingClick commonMarketStat$TypeRatingClick = this.typeRatingClick;
            int hashCode82 = (hashCode81 + (commonMarketStat$TypeRatingClick == null ? 0 : commonMarketStat$TypeRatingClick.hashCode())) * 31;
            MobileOfficialAppsCallsStat$TypeCallsItem mobileOfficialAppsCallsStat$TypeCallsItem = this.typeCallsItem;
            int hashCode83 = (hashCode82 + (mobileOfficialAppsCallsStat$TypeCallsItem == null ? 0 : mobileOfficialAppsCallsStat$TypeCallsItem.hashCode())) * 31;
            MobileOfficialAppsEcommStat$TypeAdminTipsClick mobileOfficialAppsEcommStat$TypeAdminTipsClick = this.typeAdminTipsClick;
            int hashCode84 = (hashCode83 + (mobileOfficialAppsEcommStat$TypeAdminTipsClick == null ? 0 : mobileOfficialAppsEcommStat$TypeAdminTipsClick.hashCode())) * 31;
            MobileOfficialAppsNftStat$TypeNftItem mobileOfficialAppsNftStat$TypeNftItem = this.typeNftItem;
            int hashCode85 = (hashCode84 + (mobileOfficialAppsNftStat$TypeNftItem == null ? 0 : mobileOfficialAppsNftStat$TypeNftItem.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedMediaDiscoverItem mobileOfficialAppsFeedStat$TypeFeedMediaDiscoverItem = this.typeFeedMediaDiscoverItem;
            int hashCode86 = (hashCode85 + (mobileOfficialAppsFeedStat$TypeFeedMediaDiscoverItem == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedMediaDiscoverItem.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedMediaDiscoverBlock mobileOfficialAppsFeedStat$TypeFeedMediaDiscoverBlock = this.typeFeedMediaDiscoverBlock;
            int hashCode87 = (hashCode86 + (mobileOfficialAppsFeedStat$TypeFeedMediaDiscoverBlock == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedMediaDiscoverBlock.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts mobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts = this.typeFeedOpenSimilarPosts;
            int hashCode88 = (hashCode87 + (mobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal mobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal = this.typeFeedOpenCommentsModal;
            int hashCode89 = (hashCode88 + (mobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal mobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal = this.typeFeedOpenReactionsModal;
            int hashCode90 = (hashCode89 + (mobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedStartFastChat mobileOfficialAppsFeedStat$TypeFeedStartFastChat = this.typeFeedStartFastChat;
            int hashCode91 = (hashCode90 + (mobileOfficialAppsFeedStat$TypeFeedStartFastChat == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedStartFastChat.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedCommentThreadButtonShowMore mobileOfficialAppsFeedStat$TypeFeedCommentThreadButtonShowMore = this.typeFeedCommentThreadButtonShowMore;
            int hashCode92 = (hashCode91 + (mobileOfficialAppsFeedStat$TypeFeedCommentThreadButtonShowMore == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedCommentThreadButtonShowMore.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedCommunityMediaItem mobileOfficialAppsFeedStat$TypeFeedCommunityMediaItem = this.typeFeedCommunityMediaItem;
            int hashCode93 = (hashCode92 + (mobileOfficialAppsFeedStat$TypeFeedCommunityMediaItem == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedCommunityMediaItem.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedItemMenuAction mobileOfficialAppsFeedStat$TypeFeedItemMenuAction = this.typeFeedItemMenuAction;
            int hashCode94 = (hashCode93 + (mobileOfficialAppsFeedStat$TypeFeedItemMenuAction == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedItemMenuAction.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedOpenItem mobileOfficialAppsFeedStat$TypeFeedOpenItem = this.typeFeedOpenItem;
            int hashCode95 = (hashCode94 + (mobileOfficialAppsFeedStat$TypeFeedOpenItem == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedOpenItem.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypePhotoSaveToAlbumMenuItem mobileOfficialAppsFeedStat$TypePhotoSaveToAlbumMenuItem = this.typePhotoSaveToAlbumMenuItem;
            int hashCode96 = (hashCode95 + (mobileOfficialAppsFeedStat$TypePhotoSaveToAlbumMenuItem == null ? 0 : mobileOfficialAppsFeedStat$TypePhotoSaveToAlbumMenuItem.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypePhotoShareToMessageItem mobileOfficialAppsFeedStat$TypePhotoShareToMessageItem = this.typePhotoShareToMessageItem;
            int hashCode97 = (hashCode96 + (mobileOfficialAppsFeedStat$TypePhotoShareToMessageItem == null ? 0 : mobileOfficialAppsFeedStat$TypePhotoShareToMessageItem.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeObsceneWord mobileOfficialAppsFeedStat$TypeObsceneWord = this.typeObsceneWord;
            int hashCode98 = (hashCode97 + (mobileOfficialAppsFeedStat$TypeObsceneWord == null ? 0 : mobileOfficialAppsFeedStat$TypeObsceneWord.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeRevealObsceneWords mobileOfficialAppsFeedStat$TypeRevealObsceneWords = this.typeRevealObsceneWords;
            int hashCode99 = (hashCode98 + (mobileOfficialAppsFeedStat$TypeRevealObsceneWords == null ? 0 : mobileOfficialAppsFeedStat$TypeRevealObsceneWords.hashCode())) * 31;
            CommonVasStat$TypeBadgesScreenItem commonVasStat$TypeBadgesScreenItem = this.typeBadgesScreenItem;
            int hashCode100 = (hashCode99 + (commonVasStat$TypeBadgesScreenItem == null ? 0 : commonVasStat$TypeBadgesScreenItem.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeDzenStoryClick mobileOfficialAppsFeedStat$TypeDzenStoryClick = this.typeDzenStoryClick;
            int hashCode101 = (hashCode100 + (mobileOfficialAppsFeedStat$TypeDzenStoryClick == null ? 0 : mobileOfficialAppsFeedStat$TypeDzenStoryClick.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeDzenStoryItemClick mobileOfficialAppsFeedStat$TypeDzenStoryItemClick = this.typeDzenStoryItemClick;
            int hashCode102 = (hashCode101 + (mobileOfficialAppsFeedStat$TypeDzenStoryItemClick == null ? 0 : mobileOfficialAppsFeedStat$TypeDzenStoryItemClick.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeDzenShowMoreClick mobileOfficialAppsFeedStat$TypeDzenShowMoreClick = this.typeDzenShowMoreClick;
            int hashCode103 = (hashCode102 + (mobileOfficialAppsFeedStat$TypeDzenShowMoreClick == null ? 0 : mobileOfficialAppsFeedStat$TypeDzenShowMoreClick.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeHiddenSourceOpenProfile mobileOfficialAppsFeedStat$TypeHiddenSourceOpenProfile = this.typeHiddenSourceOpenProfile;
            int hashCode104 = (hashCode103 + (mobileOfficialAppsFeedStat$TypeHiddenSourceOpenProfile == null ? 0 : mobileOfficialAppsFeedStat$TypeHiddenSourceOpenProfile.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeHiddenSourceUnbanButton mobileOfficialAppsFeedStat$TypeHiddenSourceUnbanButton = this.typeHiddenSourceUnbanButton;
            int hashCode105 = (hashCode104 + (mobileOfficialAppsFeedStat$TypeHiddenSourceUnbanButton == null ? 0 : mobileOfficialAppsFeedStat$TypeHiddenSourceUnbanButton.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeHiddenSourceUnbanCancelButton mobileOfficialAppsFeedStat$TypeHiddenSourceUnbanCancelButton = this.typeHiddenSourceUnbanCancelButton;
            int hashCode106 = (hashCode105 + (mobileOfficialAppsFeedStat$TypeHiddenSourceUnbanCancelButton == null ? 0 : mobileOfficialAppsFeedStat$TypeHiddenSourceUnbanCancelButton.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedCarouselLongtap mobileOfficialAppsFeedStat$TypeFeedCarouselLongtap = this.typeFeedCarouselLongtap;
            int hashCode107 = (hashCode106 + (mobileOfficialAppsFeedStat$TypeFeedCarouselLongtap == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedCarouselLongtap.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll mobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll = this.typeFeedCarouselLongtapScroll;
            int hashCode108 = (hashCode107 + (mobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingScroll mobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingScroll = this.typeFeedCarouselOnboardingScroll;
            int hashCode109 = (hashCode108 + (mobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingScroll == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingScroll.hashCode())) * 31;
            CommonCommunitiesStat$TypeCommunityOnboardingClick commonCommunitiesStat$TypeCommunityOnboardingClick = this.typeCommunityOnboardingClick;
            int hashCode110 = (hashCode109 + (commonCommunitiesStat$TypeCommunityOnboardingClick == null ? 0 : commonCommunitiesStat$TypeCommunityOnboardingClick.hashCode())) * 31;
            MobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick mobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick = this.typeFollowersModeOnboardingClick;
            int hashCode111 = (hashCode110 + (mobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick == null ? 0 : mobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick.hashCode())) * 31;
            MobileOfficialAppsSocGraphStat$FollowersModeSwitchState mobileOfficialAppsSocGraphStat$FollowersModeSwitchState = this.typeFollowersModeSwitchState;
            int hashCode112 = (hashCode111 + (mobileOfficialAppsSocGraphStat$FollowersModeSwitchState == null ? 0 : mobileOfficialAppsSocGraphStat$FollowersModeSwitchState.hashCode())) * 31;
            MobileOfficialAppsConPostingStat$TypePostingItem mobileOfficialAppsConPostingStat$TypePostingItem = this.typePostingItem;
            int hashCode113 = (hashCode112 + (mobileOfficialAppsConPostingStat$TypePostingItem == null ? 0 : mobileOfficialAppsConPostingStat$TypePostingItem.hashCode())) * 31;
            CommonMarketStat$TypeMarketItemReviewClick commonMarketStat$TypeMarketItemReviewClick = this.typeMarketItemReviewClick;
            int hashCode114 = (hashCode113 + (commonMarketStat$TypeMarketItemReviewClick == null ? 0 : commonMarketStat$TypeMarketItemReviewClick.hashCode())) * 31;
            MobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem mobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem = this.typeMiniAppPolicyItem;
            int hashCode115 = (hashCode114 + (mobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem == null ? 0 : mobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem.hashCode())) * 31;
            MobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem mobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem = this.typeMiniAppPermissionBoxItem;
            int hashCode116 = (hashCode115 + (mobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem == null ? 0 : mobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem.hashCode())) * 31;
            CommonCommunitiesStat$TypeCommunityReviewClick commonCommunitiesStat$TypeCommunityReviewClick = this.typeCommunityReviewClick;
            int hashCode117 = (hashCode116 + (commonCommunitiesStat$TypeCommunityReviewClick == null ? 0 : commonCommunitiesStat$TypeCommunityReviewClick.hashCode())) * 31;
            MobileOfficialAppsConPhotosStat$TypePhotosItem mobileOfficialAppsConPhotosStat$TypePhotosItem = this.typePhotosItem;
            int hashCode118 = (hashCode117 + (mobileOfficialAppsConPhotosStat$TypePhotosItem == null ? 0 : mobileOfficialAppsConPhotosStat$TypePhotosItem.hashCode())) * 31;
            t tVar = this.typeOpenQualityIndexSettings;
            int hashCode119 = (hashCode118 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            CommonVasStat$TypeUgcStickersItem commonVasStat$TypeUgcStickersItem = this.typeUgcStickersItem;
            int hashCode120 = (hashCode119 + (commonVasStat$TypeUgcStickersItem == null ? 0 : commonVasStat$TypeUgcStickersItem.hashCode())) * 31;
            MobileOfficialAppsEcommStat$TypeBannerClick mobileOfficialAppsEcommStat$TypeBannerClick = this.typeBannerClick;
            int hashCode121 = (hashCode120 + (mobileOfficialAppsEcommStat$TypeBannerClick == null ? 0 : mobileOfficialAppsEcommStat$TypeBannerClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoInAppReviewClick mobileOfficialAppsVideoStat$TypeVideoInAppReviewClick = this.typeVideoInAppReviewClick;
            int hashCode122 = (hashCode121 + (mobileOfficialAppsVideoStat$TypeVideoInAppReviewClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoInAppReviewClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeSystemPushClick mobileOfficialAppsVideoStat$TypeSystemPushClick = this.typeSystemPushClick;
            int hashCode123 = (hashCode122 + (mobileOfficialAppsVideoStat$TypeSystemPushClick == null ? 0 : mobileOfficialAppsVideoStat$TypeSystemPushClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeAutoplayTurnClick mobileOfficialAppsVideoStat$TypeAutoplayTurnClick = this.typeAutoplayTurnClick;
            int hashCode124 = (hashCode123 + (mobileOfficialAppsVideoStat$TypeAutoplayTurnClick == null ? 0 : mobileOfficialAppsVideoStat$TypeAutoplayTurnClick.hashCode())) * 31;
            CommonEcommStat$TypeEcommClickItem commonEcommStat$TypeEcommClickItem = this.typeEcommClick;
            int hashCode125 = (hashCode124 + (commonEcommStat$TypeEcommClickItem == null ? 0 : commonEcommStat$TypeEcommClickItem.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoSuggestDownloadsClick mobileOfficialAppsVideoStat$TypeVideoSuggestDownloadsClick = this.typeVideoSuggestDownloadsClick;
            int hashCode126 = (hashCode125 + (mobileOfficialAppsVideoStat$TypeVideoSuggestDownloadsClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoSuggestDownloadsClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoKidsModeClick mobileOfficialAppsVideoStat$TypeVideoKidsModeClick = this.typeVideoKidsModeClick;
            int hashCode127 = (hashCode126 + (mobileOfficialAppsVideoStat$TypeVideoKidsModeClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoKidsModeClick.hashCode())) * 31;
            l0 l0Var = this.typeVideoAuthorFilterClick;
            int hashCode128 = (hashCode127 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
            p0 p0Var = this.typeVideoPlaylistShowAllClick;
            int hashCode129 = (hashCode128 + (p0Var == null ? 0 : p0Var.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick mobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick = this.typeVideoCatalogButtonExtendedClick;
            int hashCode130 = (hashCode129 + (mobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoCatalogBlockItemClick mobileOfficialAppsVideoStat$TypeVideoCatalogBlockItemClick = this.typeVideoCatalogBlockItemClick;
            int hashCode131 = (hashCode130 + (mobileOfficialAppsVideoStat$TypeVideoCatalogBlockItemClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoCatalogBlockItemClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick mobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick = this.typeVideoAdditionalActionsClick;
            int hashCode132 = (hashCode131 + (mobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeEndVideoClick mobileOfficialAppsVideoStat$TypeEndVideoClick = this.typeEndVideoClick;
            int hashCode133 = (hashCode132 + (mobileOfficialAppsVideoStat$TypeEndVideoClick == null ? 0 : mobileOfficialAppsVideoStat$TypeEndVideoClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoDescriptionClick mobileOfficialAppsVideoStat$TypeVideoDescriptionClick = this.typeVideoDescriptionClick;
            int hashCode134 = (hashCode133 + (mobileOfficialAppsVideoStat$TypeVideoDescriptionClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoDescriptionClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoDownloadClick mobileOfficialAppsVideoStat$TypeVideoDownloadClick = this.typeVideoDownloadClick;
            int hashCode135 = (hashCode134 + (mobileOfficialAppsVideoStat$TypeVideoDownloadClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoDownloadClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem mobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem = this.typeVideoRestrictionClickItem;
            int hashCode136 = (hashCode135 + (mobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoCommentClick mobileOfficialAppsVideoStat$TypeVideoCommentClick = this.typeVideoCommentClick;
            int hashCode137 = (hashCode136 + (mobileOfficialAppsVideoStat$TypeVideoCommentClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoCommentClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoScreenCommentClick mobileOfficialAppsVideoStat$TypeVideoScreenCommentClick = this.typeVideoScreenCommentClick;
            int hashCode138 = (hashCode137 + (mobileOfficialAppsVideoStat$TypeVideoScreenCommentClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoScreenCommentClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoCommentsSortTabClick mobileOfficialAppsVideoStat$TypeVideoCommentsSortTabClick = this.typeVideoCommentsSortTabClick;
            int hashCode139 = (hashCode138 + (mobileOfficialAppsVideoStat$TypeVideoCommentsSortTabClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoCommentsSortTabClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoDiscoveryLogoClick mobileOfficialAppsVideoStat$TypeVideoDiscoveryLogoClick = this.typeVideoDiscoveryLogoClick;
            int hashCode140 = (hashCode139 + (mobileOfficialAppsVideoStat$TypeVideoDiscoveryLogoClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoDiscoveryLogoClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoPushesAdClick mobileOfficialAppsVideoStat$TypeVideoPushesAdClick = this.typeVideoPushesAdClick;
            int hashCode141 = (hashCode140 + (mobileOfficialAppsVideoStat$TypeVideoPushesAdClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoPushesAdClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator mobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator = this.typeVideoStopRecommendingCreator;
            int hashCode142 = (hashCode141 + (mobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator mobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator = this.typeVideoUndoStopRecommendingCreator;
            int hashCode143 = (hashCode142 + (mobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator.hashCode())) * 31;
            m0 m0Var = this.typeVideoFilterBlockClick;
            int hashCode144 = (hashCode143 + (m0Var == null ? 0 : m0Var.hashCode())) * 31;
            SchemeStat$TypeSnowballEvents schemeStat$TypeSnowballEvents = this.typeSnowballEvents;
            int hashCode145 = (hashCode144 + (schemeStat$TypeSnowballEvents == null ? 0 : schemeStat$TypeSnowballEvents.hashCode())) * 31;
            MobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction mobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction = this.typeMiniAppSnowballModalAction;
            int hashCode146 = (hashCode145 + (mobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction == null ? 0 : mobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction.hashCode())) * 31;
            o0 o0Var = this.typeVideoOpenFullscreenWithSwipe;
            int hashCode147 = (hashCode146 + (o0Var == null ? 0 : o0Var.hashCode())) * 31;
            k0 k0Var = this.typeVideoAttachShortVideo;
            int hashCode148 = (hashCode147 + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
            MobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem mobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem = this.typeClickSecureLockSettingsItem;
            int hashCode149 = (hashCode148 + (mobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem == null ? 0 : mobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick mobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick = this.typeFeedCommentsSortTabClick;
            int hashCode150 = (hashCode149 + (mobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick.hashCode())) * 31;
            SchemeStat$TypeLegalNoticeClick schemeStat$TypeLegalNoticeClick = this.typeLegalNoticeClick;
            int hashCode151 = (hashCode150 + (schemeStat$TypeLegalNoticeClick == null ? 0 : schemeStat$TypeLegalNoticeClick.hashCode())) * 31;
            CommonCommunitiesStat$TypeTabItemClick commonCommunitiesStat$TypeTabItemClick = this.typeCommunityTabItemClick;
            int hashCode152 = (hashCode151 + (commonCommunitiesStat$TypeTabItemClick == null ? 0 : commonCommunitiesStat$TypeTabItemClick.hashCode())) * 31;
            CommonCommunitiesStat$TypeDonutGoal commonCommunitiesStat$TypeDonutGoal = this.typeDonutGoalClickItem;
            int hashCode153 = (hashCode152 + (commonCommunitiesStat$TypeDonutGoal == null ? 0 : commonCommunitiesStat$TypeDonutGoal.hashCode())) * 31;
            CommonCommunitiesStat$TypeDonutClick commonCommunitiesStat$TypeDonutClick = this.typeCommunitiesDonutClick;
            int hashCode154 = (hashCode153 + (commonCommunitiesStat$TypeDonutClick == null ? 0 : commonCommunitiesStat$TypeDonutClick.hashCode())) * 31;
            CommonCommunitiesStat$TypeDonutBanner commonCommunitiesStat$TypeDonutBanner = this.typeDonutBannerClick;
            int hashCode155 = (hashCode154 + (commonCommunitiesStat$TypeDonutBanner == null ? 0 : commonCommunitiesStat$TypeDonutBanner.hashCode())) * 31;
            CommonCommunitiesStat$TypeDonutSupportAuthor commonCommunitiesStat$TypeDonutSupportAuthor = this.typeDonutSupportAuthorClick;
            int hashCode156 = (hashCode155 + (commonCommunitiesStat$TypeDonutSupportAuthor == null ? 0 : commonCommunitiesStat$TypeDonutSupportAuthor.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoDirectUrlStartItem mobileOfficialAppsVideoStat$TypeVideoDirectUrlStartItem = this.typeVideoDirectUrlStartItem;
            int hashCode157 = (hashCode156 + (mobileOfficialAppsVideoStat$TypeVideoDirectUrlStartItem == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoDirectUrlStartItem.hashCode())) * 31;
            MobileOfficialAppsPromoStat$TypePromoClickItem mobileOfficialAppsPromoStat$TypePromoClickItem = this.typePromoClickItem;
            int hashCode158 = (hashCode157 + (mobileOfficialAppsPromoStat$TypePromoClickItem == null ? 0 : mobileOfficialAppsPromoStat$TypePromoClickItem.hashCode())) * 31;
            CommonOnboardingStat$TypeOnboardingEvent commonOnboardingStat$TypeOnboardingEvent = this.typeOnboardingEvent;
            int hashCode159 = (hashCode158 + (commonOnboardingStat$TypeOnboardingEvent == null ? 0 : commonOnboardingStat$TypeOnboardingEvent.hashCode())) * 31;
            MobileOfficialAppsNotificationsStat$TypeNotificationItemClick mobileOfficialAppsNotificationsStat$TypeNotificationItemClick = this.typeNotificationItemClick;
            int hashCode160 = (hashCode159 + (mobileOfficialAppsNotificationsStat$TypeNotificationItemClick == null ? 0 : mobileOfficialAppsNotificationsStat$TypeNotificationItemClick.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedOpenUserClick mobileOfficialAppsFeedStat$TypeFeedOpenUserClick = this.typeFeedOpenUserClick;
            int hashCode161 = (hashCode160 + (mobileOfficialAppsFeedStat$TypeFeedOpenUserClick == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedOpenUserClick.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedOpenGroupClick mobileOfficialAppsFeedStat$TypeFeedOpenGroupClick = this.typeFeedOpenGroupClick;
            int hashCode162 = (hashCode161 + (mobileOfficialAppsFeedStat$TypeFeedOpenGroupClick == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedOpenGroupClick.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemUserClick mobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemUserClick = this.typeFeedOpenRepostedItemUserClick;
            int hashCode163 = (hashCode162 + (mobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemUserClick == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemUserClick.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick mobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick = this.typeFeedOpenRepostedItemGroupClick;
            int hashCode164 = (hashCode163 + (mobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedOpenStoryClick mobileOfficialAppsFeedStat$TypeFeedOpenStoryClick = this.typeFeedOpenStoryClick;
            int hashCode165 = (hashCode164 + (mobileOfficialAppsFeedStat$TypeFeedOpenStoryClick == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedOpenStoryClick.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedHideProductPinClick mobileOfficialAppsFeedStat$TypeFeedHideProductPinClick = this.typeFeedHideProductPinClick;
            int hashCode166 = (hashCode165 + (mobileOfficialAppsFeedStat$TypeFeedHideProductPinClick == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedHideProductPinClick.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedHideTicketItemPin mobileOfficialAppsFeedStat$TypeFeedHideTicketItemPin = this.typeFeedHideTicketItemPin;
            int hashCode167 = (hashCode166 + (mobileOfficialAppsFeedStat$TypeFeedHideTicketItemPin == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedHideTicketItemPin.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick mobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick = this.typeFeedOpenMarketItemClick;
            int hashCode168 = (hashCode167 + (mobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedTicketItemClick mobileOfficialAppsFeedStat$TypeFeedTicketItemClick = this.typeFeedTicketItemClick;
            int hashCode169 = (hashCode168 + (mobileOfficialAppsFeedStat$TypeFeedTicketItemClick == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedTicketItemClick.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedShowProductsModalCardClick mobileOfficialAppsFeedStat$TypeFeedShowProductsModalCardClick = this.typeFeedShowProductsModalCardClick;
            int hashCode170 = (hashCode169 + (mobileOfficialAppsFeedStat$TypeFeedShowProductsModalCardClick == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedShowProductsModalCardClick.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedFollowClick mobileOfficialAppsFeedStat$TypeFeedFollowClick = this.typeFeedFollowClick;
            int hashCode171 = (hashCode170 + (mobileOfficialAppsFeedStat$TypeFeedFollowClick == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedFollowClick.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedUnfollowClick mobileOfficialAppsFeedStat$TypeFeedUnfollowClick = this.typeFeedUnfollowClick;
            int hashCode172 = (hashCode171 + (mobileOfficialAppsFeedStat$TypeFeedUnfollowClick == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedUnfollowClick.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedPostExpandText mobileOfficialAppsFeedStat$TypeFeedPostExpandText = this.typeFeedPostExpandText;
            int hashCode173 = (hashCode172 + (mobileOfficialAppsFeedStat$TypeFeedPostExpandText == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedPostExpandText.hashCode())) * 31;
            a0 a0Var = this.typeFeedPostCollapseText;
            int hashCode174 = (hashCode173 + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
            MobileOfficialAppsSharingStat$TypeModalSharingOpen mobileOfficialAppsSharingStat$TypeModalSharingOpen = this.typeModalSharingOpen;
            int hashCode175 = (hashCode174 + (mobileOfficialAppsSharingStat$TypeModalSharingOpen == null ? 0 : mobileOfficialAppsSharingStat$TypeModalSharingOpen.hashCode())) * 31;
            MobileOfficialAppsSharingStat$TypeModalSharingClick mobileOfficialAppsSharingStat$TypeModalSharingClick = this.typeModalSharingClick;
            int hashCode176 = (hashCode175 + (mobileOfficialAppsSharingStat$TypeModalSharingClick == null ? 0 : mobileOfficialAppsSharingStat$TypeModalSharingClick.hashCode())) * 31;
            MobileOfficialAppsSharingStat$TypeModalSharingClose mobileOfficialAppsSharingStat$TypeModalSharingClose = this.typeModalSharingClose;
            int hashCode177 = (hashCode176 + (mobileOfficialAppsSharingStat$TypeModalSharingClose == null ? 0 : mobileOfficialAppsSharingStat$TypeModalSharingClose.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoModalSharingClick mobileOfficialAppsVideoStat$TypeVideoModalSharingClick = this.typeVideoModalSharingClick;
            int hashCode178 = (hashCode177 + (mobileOfficialAppsVideoStat$TypeVideoModalSharingClick == null ? 0 : mobileOfficialAppsVideoStat$TypeVideoModalSharingClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeTvKidModeItem mobileOfficialAppsVideoStat$TypeTvKidModeItem = this.typeTvKidModeItem;
            int hashCode179 = (hashCode178 + (mobileOfficialAppsVideoStat$TypeTvKidModeItem == null ? 0 : mobileOfficialAppsVideoStat$TypeTvKidModeItem.hashCode())) * 31;
            MobileOfficialAppsImStat$TypeOpenCommunityChats mobileOfficialAppsImStat$TypeOpenCommunityChats = this.typeOpenCommunityChats;
            int hashCode180 = (hashCode179 + (mobileOfficialAppsImStat$TypeOpenCommunityChats == null ? 0 : mobileOfficialAppsImStat$TypeOpenCommunityChats.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedPostUnmuteAudio mobileOfficialAppsFeedStat$TypeFeedPostUnmuteAudio = this.typeFeedPostUnmuteAudio;
            int hashCode181 = (hashCode180 + (mobileOfficialAppsFeedStat$TypeFeedPostUnmuteAudio == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedPostUnmuteAudio.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedPostMuteAudio mobileOfficialAppsFeedStat$TypeFeedPostMuteAudio = this.typeFeedPostMuteAudio;
            int hashCode182 = (hashCode181 + (mobileOfficialAppsFeedStat$TypeFeedPostMuteAudio == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedPostMuteAudio.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedPostPauseAudio mobileOfficialAppsFeedStat$TypeFeedPostPauseAudio = this.typeFeedPostPauseAudio;
            int hashCode183 = (hashCode182 + (mobileOfficialAppsFeedStat$TypeFeedPostPauseAudio == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedPostPauseAudio.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedPostOpenAudio mobileOfficialAppsFeedStat$TypeFeedPostOpenAudio = this.typeFeedPostOpenAudio;
            int hashCode184 = (hashCode183 + (mobileOfficialAppsFeedStat$TypeFeedPostOpenAudio == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedPostOpenAudio.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedPostAddedAudio mobileOfficialAppsFeedStat$TypeFeedPostAddedAudio = this.typeFeedPostAddedAudio;
            int hashCode185 = (hashCode184 + (mobileOfficialAppsFeedStat$TypeFeedPostAddedAudio == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedPostAddedAudio.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedPostRemovedAudio mobileOfficialAppsFeedStat$TypeFeedPostRemovedAudio = this.typeFeedPostRemovedAudio;
            int hashCode186 = (hashCode185 + (mobileOfficialAppsFeedStat$TypeFeedPostRemovedAudio == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedPostRemovedAudio.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedPostOpenPlaylist mobileOfficialAppsFeedStat$TypeFeedPostOpenPlaylist = this.typeFeedPostOpenPlaylist;
            int hashCode187 = (hashCode186 + (mobileOfficialAppsFeedStat$TypeFeedPostOpenPlaylist == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedPostOpenPlaylist.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedPostAddedPlaylist mobileOfficialAppsFeedStat$TypeFeedPostAddedPlaylist = this.typeFeedPostAddedPlaylist;
            int hashCode188 = (hashCode187 + (mobileOfficialAppsFeedStat$TypeFeedPostAddedPlaylist == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedPostAddedPlaylist.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist mobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist = this.typeFeedPostRemovedPlaylist;
            int hashCode189 = (hashCode188 + (mobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedCoownersEvent mobileOfficialAppsFeedStat$TypeFeedCoownersEvent = this.typeFeedCoownersEvent;
            int hashCode190 = (hashCode189 + (mobileOfficialAppsFeedStat$TypeFeedCoownersEvent == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedCoownersEvent.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedViewAuthors mobileOfficialAppsFeedStat$TypeFeedViewAuthors = this.typeFeedViewAuthors;
            int hashCode191 = (hashCode190 + (mobileOfficialAppsFeedStat$TypeFeedViewAuthors == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedViewAuthors.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors mobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors = this.typeFeedViewRepostedItemAuthors;
            int hashCode192 = (hashCode191 + (mobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors.hashCode())) * 31;
            MobileOfficialAppsFeedStat$TypeActionButtonClick mobileOfficialAppsFeedStat$TypeActionButtonClick = this.typeActionButtonClick;
            int hashCode193 = (hashCode192 + (mobileOfficialAppsFeedStat$TypeActionButtonClick == null ? 0 : mobileOfficialAppsFeedStat$TypeActionButtonClick.hashCode())) * 31;
            n0 n0Var = this.typeVideoKidsAgeFilterButtonTap;
            int hashCode194 = (hashCode193 + (n0Var == null ? 0 : n0Var.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeTvQrModalAction mobileOfficialAppsVideoStat$TypeTvQrModalAction = this.typeTvQrModalAction;
            int hashCode195 = (hashCode194 + (mobileOfficialAppsVideoStat$TypeTvQrModalAction == null ? 0 : mobileOfficialAppsVideoStat$TypeTvQrModalAction.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingItem mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingItem = this.typeMoveYoutubeSubsOnboardingItem;
            int hashCode196 = (hashCode195 + (mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingItem == null ? 0 : mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingItem.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem = this.typeMoveYoutubeSubsClickItem;
            int hashCode197 = (hashCode196 + (mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem == null ? 0 : mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem.hashCode())) * 31;
            j0 j0Var = this.typeSelectCreatorsClickItem;
            int hashCode198 = (hashCode197 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick mobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick = this.typeSelectCreatorsScreenConfirmClick;
            int hashCode199 = (hashCode198 + (mobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick == null ? 0 : mobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick mobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick = this.typeCreatorHideUndoHideClick;
            int hashCode200 = (hashCode199 + (mobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick == null ? 0 : mobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeSkipVideoButtonClick mobileOfficialAppsVideoStat$TypeSkipVideoButtonClick = this.typeSkipVideoButtonClick;
            int hashCode201 = (hashCode200 + (mobileOfficialAppsVideoStat$TypeSkipVideoButtonClick == null ? 0 : mobileOfficialAppsVideoStat$TypeSkipVideoButtonClick.hashCode())) * 31;
            CommonVideoStat$TypeNextVideoAnnouncement commonVideoStat$TypeNextVideoAnnouncement = this.typeNextVideoAnnouncementClick;
            int hashCode202 = (hashCode201 + (commonVideoStat$TypeNextVideoAnnouncement == null ? 0 : commonVideoStat$TypeNextVideoAnnouncement.hashCode())) * 31;
            MobileOfficialAppsVideoStat$TypeVideoToggleFullscreen mobileOfficialAppsVideoStat$TypeVideoToggleFullscreen = this.typeVideoToggleFullscreen;
            return hashCode202 + (mobileOfficialAppsVideoStat$TypeVideoToggleFullscreen != null ? mobileOfficialAppsVideoStat$TypeVideoToggleFullscreen.hashCode() : 0);
        }

        public final String toString() {
            return "TypeClick1(item=" + this.item + ", position=" + this.position + ", type=" + this.type + ", typeDzenBlockArticleClick=" + this.typeDzenBlockArticleClick + ", typeDzenArticleItem=" + this.typeDzenArticleItem + ", typeAudioTapGotoEventItem=" + this.typeAudioTapGotoEventItem + ", typeFeedPostingSnippetEditItem=" + this.typeFeedPostingSnippetEditItem + ", typeAudioTapEqualizerEventItem=" + this.typeAudioTapEqualizerEventItem + ", typeCloseCastConnectOfferModal=" + this.typeCloseCastConnectOfferModal + ", typeAudioTapPopupEventItem=" + this.typeAudioTapPopupEventItem + ", typeAudioTapSettingsEventItem=" + this.typeAudioTapSettingsEventItem + ", typeAudioArtistClickItem=" + this.typeAudioArtistClickItem + ", typeNavigationTabClick=" + this.typeNavigationTabClick + ", typeAudioPopupItem=" + this.typeAudioPopupItem + ", typeImItem=" + this.typeImItem + ", typeMarketItem=" + this.typeMarketItem + ", typeMarketMarketplaceItem=" + this.typeMarketMarketplaceItem + ", typeSuperappScreenItem=" + this.typeSuperappScreenItem + ", typeMiniAppItem=" + this.typeMiniAppItem + ", typeVideoCardEvent=" + this.typeVideoCardEvent + ", typeClickItem=" + this.typeClickItem + ", typeGamesCatalogClick=" + this.typeGamesCatalogClick + ", typeVideoCardLongtap=" + this.typeVideoCardLongtap + ", typeClickPreferenceItem=" + this.typeClickPreferenceItem + ", typeClickPreferenceWithValueItem=" + this.typeClickPreferenceWithValueItem + ", typeClickPreferenceValueItem=" + this.typeClickPreferenceValueItem + ", typeSoftUpdateClick=" + this.typeSoftUpdateClick + ", typeFeedInteractionItem=" + this.typeFeedInteractionItem + ", typeOverlayAdClick=" + this.typeOverlayAdClick + ", typeUiHintItem=" + this.typeUiHintItem + ", typeClipViewerItem=" + this.typeClipViewerItem + ", typeVideoPlayerButtonClick=" + this.typeVideoPlayerButtonClick + ", typeVideoPlayerCastClick=" + this.typeVideoPlayerCastClick + ", typeVideoPlayerSeekClick=" + this.typeVideoPlayerSeekClick + ", typeVideoToClipAttach=" + this.typeVideoToClipAttach + ", typeClipInFeedOverlayClickItem=" + this.typeClipInFeedOverlayClickItem + ", typeVideoCreateClip=" + this.typeVideoCreateClip + ", typeClickToAuthorCommunity=" + this.typeClickToAuthorCommunity + ", typeClipsGridItem=" + this.typeClipsGridItem + ", typeSuperappSettingsItem=" + this.typeSuperappSettingsItem + ", typeMarusiaConversationItem=" + this.typeMarusiaConversationItem + ", typeMarusiaReadingItem=" + this.typeMarusiaReadingItem + ", typeVideoPipItem=" + this.typeVideoPipItem + ", typeVideoMiniplayerItem=" + this.typeVideoMiniplayerItem + ", typeVideoDownloadItem=" + this.typeVideoDownloadItem + ", typeVideoNotInteresting=" + this.typeVideoNotInteresting + ", typeVideoDoNotRecommendAuthor=" + this.typeVideoDoNotRecommendAuthor + ", typeVideoTvProgram=" + this.typeVideoTvProgram + ", typeVideoWatchLater=" + this.typeVideoWatchLater + ", typeVideoBackgroundListeningItem=" + this.typeVideoBackgroundListeningItem + ", typeVideoClickWithActivePlayer=" + this.typeVideoClickWithActivePlayer + ", typeSearchClickItem=" + this.typeSearchClickItem + ", typeSearchLocalClickItem=" + this.typeSearchLocalClickItem + ", typeClassifiedsClick=" + this.typeClassifiedsClick + ", typeAliexpressClick=" + this.typeAliexpressClick + ", typeMarketCarouselClick=" + this.typeMarketCarouselClick + ", typeFeedClickToShopsMoreButton=" + this.typeFeedClickToShopsMoreButton + ", typeMarketClick=" + this.typeMarketClick + ", typeMessagingContactRecommendationsItem=" + this.typeMessagingContactRecommendationsItem + ", typeImConversationClickItem=" + this.typeImConversationClickItem + ", typeMessagingSyncContactsClickItem=" + this.typeMessagingSyncContactsClickItem + ", typeImGoToProfileClickItem=" + this.typeImGoToProfileClickItem + ", typeImPhoneNumberCallClickItem=" + this.typeImPhoneNumberCallClickItem + ", typeImShareFromChatProfileClickItem=" + this.typeImShareFromChatProfileClickItem + ", typeImGoArchiveClickItem=" + this.typeImGoArchiveClickItem + ", typeImPinnedMessageClickItem=" + this.typeImPinnedMessageClickItem + ", typeImChatItem=" + this.typeImChatItem + ", typeProfileActionButtonItem=" + this.typeProfileActionButtonItem + ", typeShareItem=" + this.typeShareItem + ", typeSharingLinkOpen=" + this.typeSharingLinkOpen + ", typeQuestionItem=" + this.typeQuestionItem + ", typeBadgesItem=" + this.typeBadgesItem + ", typeWishlistItem=" + this.typeWishlistItem + ", typeOwnerButtonAppClick=" + this.typeOwnerButtonAppClick + ", typeFriendEntrypointBlockItem=" + this.typeFriendEntrypointBlockItem + ", typeSuperappOnboardingClickItem=" + this.typeSuperappOnboardingClickItem + ", typePhotoEditorItem=" + this.typePhotoEditorItem + ", typeProfileItem=" + this.typeProfileItem + ", typeCommunityChannelItemClick=" + this.typeCommunityChannelItemClick + ", typeGroupsEventItem=" + this.typeGroupsEventItem + ", typeStickersClickItem=" + this.typeStickersClickItem + ", typeRatingClick=" + this.typeRatingClick + ", typeCallsItem=" + this.typeCallsItem + ", typeAdminTipsClick=" + this.typeAdminTipsClick + ", typeNftItem=" + this.typeNftItem + ", typeFeedMediaDiscoverItem=" + this.typeFeedMediaDiscoverItem + ", typeFeedMediaDiscoverBlock=" + this.typeFeedMediaDiscoverBlock + ", typeFeedOpenSimilarPosts=" + this.typeFeedOpenSimilarPosts + ", typeFeedOpenCommentsModal=" + this.typeFeedOpenCommentsModal + ", typeFeedOpenReactionsModal=" + this.typeFeedOpenReactionsModal + ", typeFeedStartFastChat=" + this.typeFeedStartFastChat + ", typeFeedCommentThreadButtonShowMore=" + this.typeFeedCommentThreadButtonShowMore + ", typeFeedCommunityMediaItem=" + this.typeFeedCommunityMediaItem + ", typeFeedItemMenuAction=" + this.typeFeedItemMenuAction + ", typeFeedOpenItem=" + this.typeFeedOpenItem + ", typePhotoSaveToAlbumMenuItem=" + this.typePhotoSaveToAlbumMenuItem + ", typePhotoShareToMessageItem=" + this.typePhotoShareToMessageItem + ", typeObsceneWord=" + this.typeObsceneWord + ", typeRevealObsceneWords=" + this.typeRevealObsceneWords + ", typeBadgesScreenItem=" + this.typeBadgesScreenItem + ", typeDzenStoryClick=" + this.typeDzenStoryClick + ", typeDzenStoryItemClick=" + this.typeDzenStoryItemClick + ", typeDzenShowMoreClick=" + this.typeDzenShowMoreClick + ", typeHiddenSourceOpenProfile=" + this.typeHiddenSourceOpenProfile + ", typeHiddenSourceUnbanButton=" + this.typeHiddenSourceUnbanButton + ", typeHiddenSourceUnbanCancelButton=" + this.typeHiddenSourceUnbanCancelButton + ", typeFeedCarouselLongtap=" + this.typeFeedCarouselLongtap + ", typeFeedCarouselLongtapScroll=" + this.typeFeedCarouselLongtapScroll + ", typeFeedCarouselOnboardingScroll=" + this.typeFeedCarouselOnboardingScroll + ", typeCommunityOnboardingClick=" + this.typeCommunityOnboardingClick + ", typeFollowersModeOnboardingClick=" + this.typeFollowersModeOnboardingClick + ", typeFollowersModeSwitchState=" + this.typeFollowersModeSwitchState + ", typePostingItem=" + this.typePostingItem + ", typeMarketItemReviewClick=" + this.typeMarketItemReviewClick + ", typeMiniAppPolicyItem=" + this.typeMiniAppPolicyItem + ", typeMiniAppPermissionBoxItem=" + this.typeMiniAppPermissionBoxItem + ", typeCommunityReviewClick=" + this.typeCommunityReviewClick + ", typePhotosItem=" + this.typePhotosItem + ", typeOpenQualityIndexSettings=" + this.typeOpenQualityIndexSettings + ", typeUgcStickersItem=" + this.typeUgcStickersItem + ", typeBannerClick=" + this.typeBannerClick + ", typeVideoInAppReviewClick=" + this.typeVideoInAppReviewClick + ", typeSystemPushClick=" + this.typeSystemPushClick + ", typeAutoplayTurnClick=" + this.typeAutoplayTurnClick + ", typeEcommClick=" + this.typeEcommClick + ", typeVideoSuggestDownloadsClick=" + this.typeVideoSuggestDownloadsClick + ", typeVideoKidsModeClick=" + this.typeVideoKidsModeClick + ", typeVideoAuthorFilterClick=" + this.typeVideoAuthorFilterClick + ", typeVideoPlaylistShowAllClick=" + this.typeVideoPlaylistShowAllClick + ", typeVideoCatalogButtonExtendedClick=" + this.typeVideoCatalogButtonExtendedClick + ", typeVideoCatalogBlockItemClick=" + this.typeVideoCatalogBlockItemClick + ", typeVideoAdditionalActionsClick=" + this.typeVideoAdditionalActionsClick + ", typeEndVideoClick=" + this.typeEndVideoClick + ", typeVideoDescriptionClick=" + this.typeVideoDescriptionClick + ", typeVideoDownloadClick=" + this.typeVideoDownloadClick + ", typeVideoRestrictionClickItem=" + this.typeVideoRestrictionClickItem + ", typeVideoCommentClick=" + this.typeVideoCommentClick + ", typeVideoScreenCommentClick=" + this.typeVideoScreenCommentClick + ", typeVideoCommentsSortTabClick=" + this.typeVideoCommentsSortTabClick + ", typeVideoDiscoveryLogoClick=" + this.typeVideoDiscoveryLogoClick + ", typeVideoPushesAdClick=" + this.typeVideoPushesAdClick + ", typeVideoStopRecommendingCreator=" + this.typeVideoStopRecommendingCreator + ", typeVideoUndoStopRecommendingCreator=" + this.typeVideoUndoStopRecommendingCreator + ", typeVideoFilterBlockClick=" + this.typeVideoFilterBlockClick + ", typeSnowballEvents=" + this.typeSnowballEvents + ", typeMiniAppSnowballModalAction=" + this.typeMiniAppSnowballModalAction + ", typeVideoOpenFullscreenWithSwipe=" + this.typeVideoOpenFullscreenWithSwipe + ", typeVideoAttachShortVideo=" + this.typeVideoAttachShortVideo + ", typeClickSecureLockSettingsItem=" + this.typeClickSecureLockSettingsItem + ", typeFeedCommentsSortTabClick=" + this.typeFeedCommentsSortTabClick + ", typeLegalNoticeClick=" + this.typeLegalNoticeClick + ", typeCommunityTabItemClick=" + this.typeCommunityTabItemClick + ", typeDonutGoalClickItem=" + this.typeDonutGoalClickItem + ", typeCommunitiesDonutClick=" + this.typeCommunitiesDonutClick + ", typeDonutBannerClick=" + this.typeDonutBannerClick + ", typeDonutSupportAuthorClick=" + this.typeDonutSupportAuthorClick + ", typeVideoDirectUrlStartItem=" + this.typeVideoDirectUrlStartItem + ", typePromoClickItem=" + this.typePromoClickItem + ", typeOnboardingEvent=" + this.typeOnboardingEvent + ", typeNotificationItemClick=" + this.typeNotificationItemClick + ", typeFeedOpenUserClick=" + this.typeFeedOpenUserClick + ", typeFeedOpenGroupClick=" + this.typeFeedOpenGroupClick + ", typeFeedOpenRepostedItemUserClick=" + this.typeFeedOpenRepostedItemUserClick + ", typeFeedOpenRepostedItemGroupClick=" + this.typeFeedOpenRepostedItemGroupClick + ", typeFeedOpenStoryClick=" + this.typeFeedOpenStoryClick + ", typeFeedHideProductPinClick=" + this.typeFeedHideProductPinClick + ", typeFeedHideTicketItemPin=" + this.typeFeedHideTicketItemPin + ", typeFeedOpenMarketItemClick=" + this.typeFeedOpenMarketItemClick + ", typeFeedTicketItemClick=" + this.typeFeedTicketItemClick + ", typeFeedShowProductsModalCardClick=" + this.typeFeedShowProductsModalCardClick + ", typeFeedFollowClick=" + this.typeFeedFollowClick + ", typeFeedUnfollowClick=" + this.typeFeedUnfollowClick + ", typeFeedPostExpandText=" + this.typeFeedPostExpandText + ", typeFeedPostCollapseText=" + this.typeFeedPostCollapseText + ", typeModalSharingOpen=" + this.typeModalSharingOpen + ", typeModalSharingClick=" + this.typeModalSharingClick + ", typeModalSharingClose=" + this.typeModalSharingClose + ", typeVideoModalSharingClick=" + this.typeVideoModalSharingClick + ", typeTvKidModeItem=" + this.typeTvKidModeItem + ", typeOpenCommunityChats=" + this.typeOpenCommunityChats + ", typeFeedPostUnmuteAudio=" + this.typeFeedPostUnmuteAudio + ", typeFeedPostMuteAudio=" + this.typeFeedPostMuteAudio + ", typeFeedPostPauseAudio=" + this.typeFeedPostPauseAudio + ", typeFeedPostOpenAudio=" + this.typeFeedPostOpenAudio + ", typeFeedPostAddedAudio=" + this.typeFeedPostAddedAudio + ", typeFeedPostRemovedAudio=" + this.typeFeedPostRemovedAudio + ", typeFeedPostOpenPlaylist=" + this.typeFeedPostOpenPlaylist + ", typeFeedPostAddedPlaylist=" + this.typeFeedPostAddedPlaylist + ", typeFeedPostRemovedPlaylist=" + this.typeFeedPostRemovedPlaylist + ", typeFeedCoownersEvent=" + this.typeFeedCoownersEvent + ", typeFeedViewAuthors=" + this.typeFeedViewAuthors + ", typeFeedViewRepostedItemAuthors=" + this.typeFeedViewRepostedItemAuthors + ", typeActionButtonClick=" + this.typeActionButtonClick + ", typeVideoKidsAgeFilterButtonTap=" + this.typeVideoKidsAgeFilterButtonTap + ", typeTvQrModalAction=" + this.typeTvQrModalAction + ", typeMoveYoutubeSubsOnboardingItem=" + this.typeMoveYoutubeSubsOnboardingItem + ", typeMoveYoutubeSubsClickItem=" + this.typeMoveYoutubeSubsClickItem + ", typeSelectCreatorsClickItem=" + this.typeSelectCreatorsClickItem + ", typeSelectCreatorsScreenConfirmClick=" + this.typeSelectCreatorsScreenConfirmClick + ", typeCreatorHideUndoHideClick=" + this.typeCreatorHideUndoHideClick + ", typeSkipVideoButtonClick=" + this.typeSkipVideoButtonClick + ", typeNextVideoAnnouncementClick=" + this.typeNextVideoAnnouncementClick + ", typeVideoToggleFullscreen=" + this.typeVideoToggleFullscreen + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ TypeClick1(SchemeStat$EventItem schemeStat$EventItem, Integer num, Type type, MobileOfficialAppsFeedStat$TypeDzenBlockArticleClick mobileOfficialAppsFeedStat$TypeDzenBlockArticleClick, MobileOfficialAppsConDzenStat$TypeDzenArticleItem mobileOfficialAppsConDzenStat$TypeDzenArticleItem, CommonAudioStat$TypeAudioTapGotoEventItem commonAudioStat$TypeAudioTapGotoEventItem, MobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem mobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem, CommonAudioStat$TypeAudioTapEqualizerEventItem commonAudioStat$TypeAudioTapEqualizerEventItem, MobileOfficialAppsVideoStat$TypeCloseCastConnectOfferModal mobileOfficialAppsVideoStat$TypeCloseCastConnectOfferModal, CommonAudioStat$TypeAudioTapPopupEventItem commonAudioStat$TypeAudioTapPopupEventItem, CommonAudioStat$TypeAudioTapSettingsEventItem commonAudioStat$TypeAudioTapSettingsEventItem, CommonAudioStat$TypeAudioArtistClickItem commonAudioStat$TypeAudioArtistClickItem, SchemeStat$TypeNavigationTabClick schemeStat$TypeNavigationTabClick, CommonAudioStat$TypeAudioPopupItem commonAudioStat$TypeAudioPopupItem, SchemeStat$TypeImItem schemeStat$TypeImItem, SchemeStat$TypeMarketItem schemeStat$TypeMarketItem, SchemeStat$TypeMarketMarketplaceItem schemeStat$TypeMarketMarketplaceItem, SchemeStat$TypeSuperappScreenItem schemeStat$TypeSuperappScreenItem, SchemeStat$TypeMiniAppItem schemeStat$TypeMiniAppItem, CommonVideoStat$TypeVideoCardEvent commonVideoStat$TypeVideoCardEvent, SchemeStat$TypeClickItem schemeStat$TypeClickItem, SchemeStat$TypeGamesCatalogClick schemeStat$TypeGamesCatalogClick, MobileOfficialAppsVideoStat$TypeVideoCardLongtap mobileOfficialAppsVideoStat$TypeVideoCardLongtap, SchemeStat$TypeClickPreferenceItem schemeStat$TypeClickPreferenceItem, MobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem mobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem, SchemeStat$TypeClickPreferenceValueItem schemeStat$TypeClickPreferenceValueItem, MobileOfficialAppsVideoStat$TypeSoftUpdateClick mobileOfficialAppsVideoStat$TypeSoftUpdateClick, MobileOfficialAppsFeedStat$TypeFeedInteractionItem mobileOfficialAppsFeedStat$TypeFeedInteractionItem, CommonVideoAdsStat$TypeOverlayAdClick commonVideoAdsStat$TypeOverlayAdClick, CommonOnboardingStat$TypeUiHintItem commonOnboardingStat$TypeUiHintItem, SchemeStat$TypeClipViewerItem schemeStat$TypeClipViewerItem, MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick mobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick, MobileOfficialAppsVideoStat$TypeVideoPlayerCastClick mobileOfficialAppsVideoStat$TypeVideoPlayerCastClick, MobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick mobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick, MobileOfficialAppsVideoStat$TypeVideoToClipAttach mobileOfficialAppsVideoStat$TypeVideoToClipAttach, MobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem mobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem, CommonVideoStat$TypeVideoCreateClip commonVideoStat$TypeVideoCreateClip, CommonVideoStat$TypeClickToAuthorCommunity commonVideoStat$TypeClickToAuthorCommunity, MobileOfficialAppsClipsStat$TypeClipsGridItem mobileOfficialAppsClipsStat$TypeClipsGridItem, SchemeStat$TypeSuperappSettingsItem schemeStat$TypeSuperappSettingsItem, MobileOfficialAppsMarusiaStat$TypeConversationItem mobileOfficialAppsMarusiaStat$TypeConversationItem, MobileOfficialAppsMarusiaStat$TypeReadingItem mobileOfficialAppsMarusiaStat$TypeReadingItem, SchemeStat$TypeVideoPipItem schemeStat$TypeVideoPipItem, SchemeStat$TypeVideoMiniplayerItem schemeStat$TypeVideoMiniplayerItem, MobileOfficialAppsVideoStat$TypeVideoDownloadItem mobileOfficialAppsVideoStat$TypeVideoDownloadItem, MobileOfficialAppsVideoStat$TypeVideoNotInteresting mobileOfficialAppsVideoStat$TypeVideoNotInteresting, MobileOfficialAppsVideoStat$TypeVideoDoNotRecommendAuthor mobileOfficialAppsVideoStat$TypeVideoDoNotRecommendAuthor, MobileOfficialAppsVideoStat$TypeVideoTvProgram mobileOfficialAppsVideoStat$TypeVideoTvProgram, MobileOfficialAppsVideoStat$TypeVideoWatchLater mobileOfficialAppsVideoStat$TypeVideoWatchLater, SchemeStat$TypeVideoBackgroundListeningItem schemeStat$TypeVideoBackgroundListeningItem, CommonVideoStat$TypeVideoClickWithActivePlayer commonVideoStat$TypeVideoClickWithActivePlayer, MobileOfficialAppsSearchStat$TypeSearchClickItem mobileOfficialAppsSearchStat$TypeSearchClickItem, CommonSearchStat$TypeSearchLocalClickItem commonSearchStat$TypeSearchLocalClickItem, SchemeStat$TypeClassifiedsClick schemeStat$TypeClassifiedsClick, SchemeStat$TypeAliexpressClick schemeStat$TypeAliexpressClick, MobileOfficialAppsFeedStat$TypeMarketCarouselClick mobileOfficialAppsFeedStat$TypeMarketCarouselClick, MobileOfficialAppsFeedStat$TypeFeedClickToShopsMoreButton mobileOfficialAppsFeedStat$TypeFeedClickToShopsMoreButton, MobileOfficialAppsMarketStat$TypeMarketClick mobileOfficialAppsMarketStat$TypeMarketClick, SchemeStat$TypeMessagingContactRecommendationsItem schemeStat$TypeMessagingContactRecommendationsItem, MobileOfficialAppsImStat$TypeImConversationClickItem mobileOfficialAppsImStat$TypeImConversationClickItem, SchemeStat$TypeMessagingSyncContactsClickItem schemeStat$TypeMessagingSyncContactsClickItem, MobileOfficialAppsImStat$TypeImGoToProfileClickItem mobileOfficialAppsImStat$TypeImGoToProfileClickItem, MobileOfficialAppsImStat$TypeImPhoneNumberCallClickItem mobileOfficialAppsImStat$TypeImPhoneNumberCallClickItem, MobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem mobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem, MobileOfficialAppsImStat$TypeImGoArchiveClickItem mobileOfficialAppsImStat$TypeImGoArchiveClickItem, MobileOfficialAppsImStat$TypeImPinnedMessageClickItem mobileOfficialAppsImStat$TypeImPinnedMessageClickItem, SchemeStat$TypeImChatItem schemeStat$TypeImChatItem, SchemeStat$TypeProfileActionButtonItem schemeStat$TypeProfileActionButtonItem, SchemeStat$TypeShareItem schemeStat$TypeShareItem, MobileOfficialAppsSharingStat$TypeSharingLinkOpen mobileOfficialAppsSharingStat$TypeSharingLinkOpen, SchemeStat$TypeQuestionItem schemeStat$TypeQuestionItem, SchemeStat$TypeBadgesItem schemeStat$TypeBadgesItem, SchemeStat$TypeWishlistItem schemeStat$TypeWishlistItem, SchemeStat$TypeOwnerButtonAppClick schemeStat$TypeOwnerButtonAppClick, c0 c0Var, MobileOfficialAppsSuperappStat$TypeSuperappOnboardingClickItem mobileOfficialAppsSuperappStat$TypeSuperappOnboardingClickItem, MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem mobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem, MobileOfficialAppsProfileStat$TypeProfileItem mobileOfficialAppsProfileStat$TypeProfileItem, CommonCommunitiesStat$TypeChannelItemClick commonCommunitiesStat$TypeChannelItemClick, MobileOfficialAppsGroupsStat$TypeGroupsEventItem mobileOfficialAppsGroupsStat$TypeGroupsEventItem, MobileOfficialAppsStickersStat$TypeStickersClickItem mobileOfficialAppsStickersStat$TypeStickersClickItem, CommonMarketStat$TypeRatingClick commonMarketStat$TypeRatingClick, MobileOfficialAppsCallsStat$TypeCallsItem mobileOfficialAppsCallsStat$TypeCallsItem, MobileOfficialAppsEcommStat$TypeAdminTipsClick mobileOfficialAppsEcommStat$TypeAdminTipsClick, MobileOfficialAppsNftStat$TypeNftItem mobileOfficialAppsNftStat$TypeNftItem, MobileOfficialAppsFeedStat$TypeFeedMediaDiscoverItem mobileOfficialAppsFeedStat$TypeFeedMediaDiscoverItem, MobileOfficialAppsFeedStat$TypeFeedMediaDiscoverBlock mobileOfficialAppsFeedStat$TypeFeedMediaDiscoverBlock, MobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts mobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts, MobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal mobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal, MobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal mobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal, MobileOfficialAppsFeedStat$TypeFeedStartFastChat mobileOfficialAppsFeedStat$TypeFeedStartFastChat, MobileOfficialAppsFeedStat$TypeFeedCommentThreadButtonShowMore mobileOfficialAppsFeedStat$TypeFeedCommentThreadButtonShowMore, MobileOfficialAppsFeedStat$TypeFeedCommunityMediaItem mobileOfficialAppsFeedStat$TypeFeedCommunityMediaItem, MobileOfficialAppsFeedStat$TypeFeedItemMenuAction mobileOfficialAppsFeedStat$TypeFeedItemMenuAction, MobileOfficialAppsFeedStat$TypeFeedOpenItem mobileOfficialAppsFeedStat$TypeFeedOpenItem, MobileOfficialAppsFeedStat$TypePhotoSaveToAlbumMenuItem mobileOfficialAppsFeedStat$TypePhotoSaveToAlbumMenuItem, MobileOfficialAppsFeedStat$TypePhotoShareToMessageItem mobileOfficialAppsFeedStat$TypePhotoShareToMessageItem, MobileOfficialAppsFeedStat$TypeObsceneWord mobileOfficialAppsFeedStat$TypeObsceneWord, MobileOfficialAppsFeedStat$TypeRevealObsceneWords mobileOfficialAppsFeedStat$TypeRevealObsceneWords, CommonVasStat$TypeBadgesScreenItem commonVasStat$TypeBadgesScreenItem, MobileOfficialAppsFeedStat$TypeDzenStoryClick mobileOfficialAppsFeedStat$TypeDzenStoryClick, MobileOfficialAppsFeedStat$TypeDzenStoryItemClick mobileOfficialAppsFeedStat$TypeDzenStoryItemClick, MobileOfficialAppsFeedStat$TypeDzenShowMoreClick mobileOfficialAppsFeedStat$TypeDzenShowMoreClick, MobileOfficialAppsFeedStat$TypeHiddenSourceOpenProfile mobileOfficialAppsFeedStat$TypeHiddenSourceOpenProfile, MobileOfficialAppsFeedStat$TypeHiddenSourceUnbanButton mobileOfficialAppsFeedStat$TypeHiddenSourceUnbanButton, MobileOfficialAppsFeedStat$TypeHiddenSourceUnbanCancelButton mobileOfficialAppsFeedStat$TypeHiddenSourceUnbanCancelButton, MobileOfficialAppsFeedStat$TypeFeedCarouselLongtap mobileOfficialAppsFeedStat$TypeFeedCarouselLongtap, MobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll mobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll, MobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingScroll mobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingScroll, CommonCommunitiesStat$TypeCommunityOnboardingClick commonCommunitiesStat$TypeCommunityOnboardingClick, MobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick mobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick, MobileOfficialAppsSocGraphStat$FollowersModeSwitchState mobileOfficialAppsSocGraphStat$FollowersModeSwitchState, MobileOfficialAppsConPostingStat$TypePostingItem mobileOfficialAppsConPostingStat$TypePostingItem, CommonMarketStat$TypeMarketItemReviewClick commonMarketStat$TypeMarketItemReviewClick, MobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem mobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem, MobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem mobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem, CommonCommunitiesStat$TypeCommunityReviewClick commonCommunitiesStat$TypeCommunityReviewClick, MobileOfficialAppsConPhotosStat$TypePhotosItem mobileOfficialAppsConPhotosStat$TypePhotosItem, t tVar, CommonVasStat$TypeUgcStickersItem commonVasStat$TypeUgcStickersItem, MobileOfficialAppsEcommStat$TypeBannerClick mobileOfficialAppsEcommStat$TypeBannerClick, MobileOfficialAppsVideoStat$TypeVideoInAppReviewClick mobileOfficialAppsVideoStat$TypeVideoInAppReviewClick, MobileOfficialAppsVideoStat$TypeSystemPushClick mobileOfficialAppsVideoStat$TypeSystemPushClick, MobileOfficialAppsVideoStat$TypeAutoplayTurnClick mobileOfficialAppsVideoStat$TypeAutoplayTurnClick, CommonEcommStat$TypeEcommClickItem commonEcommStat$TypeEcommClickItem, MobileOfficialAppsVideoStat$TypeVideoSuggestDownloadsClick mobileOfficialAppsVideoStat$TypeVideoSuggestDownloadsClick, MobileOfficialAppsVideoStat$TypeVideoKidsModeClick mobileOfficialAppsVideoStat$TypeVideoKidsModeClick, l0 l0Var, p0 p0Var, MobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick mobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick, MobileOfficialAppsVideoStat$TypeVideoCatalogBlockItemClick mobileOfficialAppsVideoStat$TypeVideoCatalogBlockItemClick, MobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick mobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick, MobileOfficialAppsVideoStat$TypeEndVideoClick mobileOfficialAppsVideoStat$TypeEndVideoClick, MobileOfficialAppsVideoStat$TypeVideoDescriptionClick mobileOfficialAppsVideoStat$TypeVideoDescriptionClick, MobileOfficialAppsVideoStat$TypeVideoDownloadClick mobileOfficialAppsVideoStat$TypeVideoDownloadClick, MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem mobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem, MobileOfficialAppsVideoStat$TypeVideoCommentClick mobileOfficialAppsVideoStat$TypeVideoCommentClick, MobileOfficialAppsVideoStat$TypeVideoScreenCommentClick mobileOfficialAppsVideoStat$TypeVideoScreenCommentClick, MobileOfficialAppsVideoStat$TypeVideoCommentsSortTabClick mobileOfficialAppsVideoStat$TypeVideoCommentsSortTabClick, MobileOfficialAppsVideoStat$TypeVideoDiscoveryLogoClick mobileOfficialAppsVideoStat$TypeVideoDiscoveryLogoClick, MobileOfficialAppsVideoStat$TypeVideoPushesAdClick mobileOfficialAppsVideoStat$TypeVideoPushesAdClick, MobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator mobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator, MobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator mobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator, m0 m0Var, SchemeStat$TypeSnowballEvents schemeStat$TypeSnowballEvents, MobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction mobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction, o0 o0Var, k0 k0Var, MobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem mobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem, MobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick mobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick, SchemeStat$TypeLegalNoticeClick schemeStat$TypeLegalNoticeClick, CommonCommunitiesStat$TypeTabItemClick commonCommunitiesStat$TypeTabItemClick, CommonCommunitiesStat$TypeDonutGoal commonCommunitiesStat$TypeDonutGoal, CommonCommunitiesStat$TypeDonutClick commonCommunitiesStat$TypeDonutClick, CommonCommunitiesStat$TypeDonutBanner commonCommunitiesStat$TypeDonutBanner, CommonCommunitiesStat$TypeDonutSupportAuthor commonCommunitiesStat$TypeDonutSupportAuthor, MobileOfficialAppsVideoStat$TypeVideoDirectUrlStartItem mobileOfficialAppsVideoStat$TypeVideoDirectUrlStartItem, MobileOfficialAppsPromoStat$TypePromoClickItem mobileOfficialAppsPromoStat$TypePromoClickItem, CommonOnboardingStat$TypeOnboardingEvent commonOnboardingStat$TypeOnboardingEvent, MobileOfficialAppsNotificationsStat$TypeNotificationItemClick mobileOfficialAppsNotificationsStat$TypeNotificationItemClick, MobileOfficialAppsFeedStat$TypeFeedOpenUserClick mobileOfficialAppsFeedStat$TypeFeedOpenUserClick, MobileOfficialAppsFeedStat$TypeFeedOpenGroupClick mobileOfficialAppsFeedStat$TypeFeedOpenGroupClick, MobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemUserClick mobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemUserClick, MobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick mobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick, MobileOfficialAppsFeedStat$TypeFeedOpenStoryClick mobileOfficialAppsFeedStat$TypeFeedOpenStoryClick, MobileOfficialAppsFeedStat$TypeFeedHideProductPinClick mobileOfficialAppsFeedStat$TypeFeedHideProductPinClick, MobileOfficialAppsFeedStat$TypeFeedHideTicketItemPin mobileOfficialAppsFeedStat$TypeFeedHideTicketItemPin, MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick mobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick, MobileOfficialAppsFeedStat$TypeFeedTicketItemClick mobileOfficialAppsFeedStat$TypeFeedTicketItemClick, MobileOfficialAppsFeedStat$TypeFeedShowProductsModalCardClick mobileOfficialAppsFeedStat$TypeFeedShowProductsModalCardClick, MobileOfficialAppsFeedStat$TypeFeedFollowClick mobileOfficialAppsFeedStat$TypeFeedFollowClick, MobileOfficialAppsFeedStat$TypeFeedUnfollowClick mobileOfficialAppsFeedStat$TypeFeedUnfollowClick, MobileOfficialAppsFeedStat$TypeFeedPostExpandText mobileOfficialAppsFeedStat$TypeFeedPostExpandText, a0 a0Var, MobileOfficialAppsSharingStat$TypeModalSharingOpen mobileOfficialAppsSharingStat$TypeModalSharingOpen, MobileOfficialAppsSharingStat$TypeModalSharingClick mobileOfficialAppsSharingStat$TypeModalSharingClick, MobileOfficialAppsSharingStat$TypeModalSharingClose mobileOfficialAppsSharingStat$TypeModalSharingClose, MobileOfficialAppsVideoStat$TypeVideoModalSharingClick mobileOfficialAppsVideoStat$TypeVideoModalSharingClick, MobileOfficialAppsVideoStat$TypeTvKidModeItem mobileOfficialAppsVideoStat$TypeTvKidModeItem, MobileOfficialAppsImStat$TypeOpenCommunityChats mobileOfficialAppsImStat$TypeOpenCommunityChats, MobileOfficialAppsFeedStat$TypeFeedPostUnmuteAudio mobileOfficialAppsFeedStat$TypeFeedPostUnmuteAudio, MobileOfficialAppsFeedStat$TypeFeedPostMuteAudio mobileOfficialAppsFeedStat$TypeFeedPostMuteAudio, MobileOfficialAppsFeedStat$TypeFeedPostPauseAudio mobileOfficialAppsFeedStat$TypeFeedPostPauseAudio, MobileOfficialAppsFeedStat$TypeFeedPostOpenAudio mobileOfficialAppsFeedStat$TypeFeedPostOpenAudio, MobileOfficialAppsFeedStat$TypeFeedPostAddedAudio mobileOfficialAppsFeedStat$TypeFeedPostAddedAudio, MobileOfficialAppsFeedStat$TypeFeedPostRemovedAudio mobileOfficialAppsFeedStat$TypeFeedPostRemovedAudio, MobileOfficialAppsFeedStat$TypeFeedPostOpenPlaylist mobileOfficialAppsFeedStat$TypeFeedPostOpenPlaylist, MobileOfficialAppsFeedStat$TypeFeedPostAddedPlaylist mobileOfficialAppsFeedStat$TypeFeedPostAddedPlaylist, MobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist mobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist, MobileOfficialAppsFeedStat$TypeFeedCoownersEvent mobileOfficialAppsFeedStat$TypeFeedCoownersEvent, MobileOfficialAppsFeedStat$TypeFeedViewAuthors mobileOfficialAppsFeedStat$TypeFeedViewAuthors, MobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors mobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors, MobileOfficialAppsFeedStat$TypeActionButtonClick mobileOfficialAppsFeedStat$TypeActionButtonClick, n0 n0Var, MobileOfficialAppsVideoStat$TypeTvQrModalAction mobileOfficialAppsVideoStat$TypeTvQrModalAction, MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingItem mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingItem, MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem, j0 j0Var, MobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick mobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick, MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick mobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick, MobileOfficialAppsVideoStat$TypeSkipVideoButtonClick mobileOfficialAppsVideoStat$TypeSkipVideoButtonClick, CommonVideoStat$TypeNextVideoAnnouncement commonVideoStat$TypeNextVideoAnnouncement, MobileOfficialAppsVideoStat$TypeVideoToggleFullscreen mobileOfficialAppsVideoStat$TypeVideoToggleFullscreen, int i, int i2, int i3, int i4, int i5, int i6, int i7, zcl zclVar) {
            this(r157, r158, r159, r160, r161, r162, r163, r164, r165, r166, r167, r168, r169, r170, r171, r172, r173, r174, r175, r176, r177, r178, r179, r180, r181, r182, r183, r184, r185, r186, r187, r188, r189, r190, r191, r192, r193, r194, r195, r196, r197, r198, r199, r200, r201, r202, r203, r204, r205, r206, r207, r208, r209, r210, r211, r212, r213, r214, r215, r216, r217, r218, r219, r220, r221, r222, r223, r224, r225, r226, r227, r228, r229, r230, r231, r232, r233, r234, r235, r236, r237, r238, r239, r240, r241, r242, r243, r244, r245, r246, r247, r248, r249, r250, r251, r252, r253, r254, r255, r256, r257, r258, r259, r260, r261, r262, r263, r264, r265, r266, r267, r268, r269, r270, r271, r272, r273, r274, r275, r276, r277, r278, r279, r280, r281, r282, r283, r284, r285, r286, r287, r288, r289, r290, r291, r292, r293, r294, r295, r296, r297, r298, r299, r300, r301, r302, r303, r304, r305, r306, r307, r308, r309, r310, r311, r312, r313, r314, r315, r316, r317, r318, r319, r320, r321, r322, r323, r324, r325, r326, r327, r328, r329, r330, r331, r332, r333, r334, r335, r336, r337, r338, r339, r340, r341, r342, r343, r344, r345, r346, r347, r348, r349, r350, r351, r352, r353, r354, r355, r356, r357, r358, r359);
            MobileOfficialAppsVideoStat$TypeVideoToggleFullscreen mobileOfficialAppsVideoStat$TypeVideoToggleFullscreen2;
            SchemeStat$TypeBadgesItem schemeStat$TypeBadgesItem2;
            SchemeStat$TypeWishlistItem schemeStat$TypeWishlistItem2;
            SchemeStat$TypeOwnerButtonAppClick schemeStat$TypeOwnerButtonAppClick2;
            c0 c0Var2;
            MobileOfficialAppsSuperappStat$TypeSuperappOnboardingClickItem mobileOfficialAppsSuperappStat$TypeSuperappOnboardingClickItem2;
            MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem mobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem2;
            MobileOfficialAppsProfileStat$TypeProfileItem mobileOfficialAppsProfileStat$TypeProfileItem2;
            CommonCommunitiesStat$TypeChannelItemClick commonCommunitiesStat$TypeChannelItemClick2;
            MobileOfficialAppsFeedStat$TypeHiddenSourceOpenProfile mobileOfficialAppsFeedStat$TypeHiddenSourceOpenProfile2;
            MobileOfficialAppsFeedStat$TypeHiddenSourceUnbanButton mobileOfficialAppsFeedStat$TypeHiddenSourceUnbanButton2;
            MobileOfficialAppsFeedStat$TypeHiddenSourceUnbanCancelButton mobileOfficialAppsFeedStat$TypeHiddenSourceUnbanCancelButton2;
            MobileOfficialAppsFeedStat$TypeFeedCarouselLongtap mobileOfficialAppsFeedStat$TypeFeedCarouselLongtap2;
            MobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll mobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll2;
            MobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingScroll mobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingScroll2;
            CommonCommunitiesStat$TypeCommunityOnboardingClick commonCommunitiesStat$TypeCommunityOnboardingClick2;
            MobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick mobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick2;
            MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem mobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem2;
            MobileOfficialAppsVideoStat$TypeVideoCommentClick mobileOfficialAppsVideoStat$TypeVideoCommentClick2;
            MobileOfficialAppsVideoStat$TypeVideoScreenCommentClick mobileOfficialAppsVideoStat$TypeVideoScreenCommentClick2;
            MobileOfficialAppsVideoStat$TypeVideoCommentsSortTabClick mobileOfficialAppsVideoStat$TypeVideoCommentsSortTabClick2;
            MobileOfficialAppsVideoStat$TypeVideoDiscoveryLogoClick mobileOfficialAppsVideoStat$TypeVideoDiscoveryLogoClick2;
            MobileOfficialAppsVideoStat$TypeVideoPushesAdClick mobileOfficialAppsVideoStat$TypeVideoPushesAdClick2;
            MobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator mobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator2;
            MobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator mobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator2;
            MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick mobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick2;
            MobileOfficialAppsFeedStat$TypeFeedTicketItemClick mobileOfficialAppsFeedStat$TypeFeedTicketItemClick2;
            MobileOfficialAppsFeedStat$TypeFeedShowProductsModalCardClick mobileOfficialAppsFeedStat$TypeFeedShowProductsModalCardClick2;
            MobileOfficialAppsFeedStat$TypeFeedFollowClick mobileOfficialAppsFeedStat$TypeFeedFollowClick2;
            MobileOfficialAppsFeedStat$TypeFeedUnfollowClick mobileOfficialAppsFeedStat$TypeFeedUnfollowClick2;
            MobileOfficialAppsFeedStat$TypeFeedPostExpandText mobileOfficialAppsFeedStat$TypeFeedPostExpandText2;
            a0 a0Var2;
            MobileOfficialAppsSharingStat$TypeModalSharingOpen mobileOfficialAppsSharingStat$TypeModalSharingOpen2;
            MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick mobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick2;
            CommonVideoStat$TypeNextVideoAnnouncement commonVideoStat$TypeNextVideoAnnouncement2;
            MobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem mobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem2;
            MobileOfficialAppsFeedStat$TypePhotoSaveToAlbumMenuItem mobileOfficialAppsFeedStat$TypePhotoSaveToAlbumMenuItem2;
            l0 l0Var2;
            MobileOfficialAppsNotificationsStat$TypeNotificationItemClick mobileOfficialAppsNotificationsStat$TypeNotificationItemClick2;
            MobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors mobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors2;
            SchemeStat$TypeImItem schemeStat$TypeImItem2;
            MobileOfficialAppsSharingStat$TypeModalSharingClick mobileOfficialAppsSharingStat$TypeModalSharingClick2;
            SchemeStat$TypeMarketItem schemeStat$TypeMarketItem2;
            MobileOfficialAppsSharingStat$TypeModalSharingClose mobileOfficialAppsSharingStat$TypeModalSharingClose2;
            SchemeStat$TypeMarketMarketplaceItem schemeStat$TypeMarketMarketplaceItem2;
            MobileOfficialAppsVideoStat$TypeVideoModalSharingClick mobileOfficialAppsVideoStat$TypeVideoModalSharingClick2;
            SchemeStat$TypeSuperappScreenItem schemeStat$TypeSuperappScreenItem2;
            MobileOfficialAppsVideoStat$TypeTvKidModeItem mobileOfficialAppsVideoStat$TypeTvKidModeItem2;
            SchemeStat$TypeMiniAppItem schemeStat$TypeMiniAppItem2;
            MobileOfficialAppsImStat$TypeOpenCommunityChats mobileOfficialAppsImStat$TypeOpenCommunityChats2;
            CommonVideoStat$TypeVideoCardEvent commonVideoStat$TypeVideoCardEvent2;
            MobileOfficialAppsFeedStat$TypeFeedPostUnmuteAudio mobileOfficialAppsFeedStat$TypeFeedPostUnmuteAudio2;
            SchemeStat$TypeClickItem schemeStat$TypeClickItem2;
            MobileOfficialAppsFeedStat$TypeFeedPostMuteAudio mobileOfficialAppsFeedStat$TypeFeedPostMuteAudio2;
            SchemeStat$TypeGamesCatalogClick schemeStat$TypeGamesCatalogClick2;
            MobileOfficialAppsVideoStat$TypeVideoCardLongtap mobileOfficialAppsVideoStat$TypeVideoCardLongtap2;
            SchemeStat$TypeClickPreferenceItem schemeStat$TypeClickPreferenceItem2;
            MobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem mobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem2;
            SchemeStat$TypeClickPreferenceValueItem schemeStat$TypeClickPreferenceValueItem2;
            MobileOfficialAppsVideoStat$TypeSoftUpdateClick mobileOfficialAppsVideoStat$TypeSoftUpdateClick2;
            MobileOfficialAppsFeedStat$TypeFeedInteractionItem mobileOfficialAppsFeedStat$TypeFeedInteractionItem2;
            CommonVideoAdsStat$TypeOverlayAdClick commonVideoAdsStat$TypeOverlayAdClick2;
            CommonOnboardingStat$TypeUiHintItem commonOnboardingStat$TypeUiHintItem2;
            SchemeStat$TypeClipViewerItem schemeStat$TypeClipViewerItem2;
            MobileOfficialAppsVideoStat$TypeVideoPlayerCastClick mobileOfficialAppsVideoStat$TypeVideoPlayerCastClick2;
            MobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick mobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick2;
            MobileOfficialAppsVideoStat$TypeVideoToClipAttach mobileOfficialAppsVideoStat$TypeVideoToClipAttach2;
            MobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem mobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem2;
            CommonVideoStat$TypeVideoCreateClip commonVideoStat$TypeVideoCreateClip2;
            CommonVideoStat$TypeClickToAuthorCommunity commonVideoStat$TypeClickToAuthorCommunity2;
            MobileOfficialAppsClipsStat$TypeClipsGridItem mobileOfficialAppsClipsStat$TypeClipsGridItem2;
            MobileOfficialAppsVideoStat$TypeVideoTvProgram mobileOfficialAppsVideoStat$TypeVideoTvProgram2;
            MobileOfficialAppsVideoStat$TypeVideoWatchLater mobileOfficialAppsVideoStat$TypeVideoWatchLater2;
            SchemeStat$TypeVideoBackgroundListeningItem schemeStat$TypeVideoBackgroundListeningItem2;
            CommonVideoStat$TypeVideoClickWithActivePlayer commonVideoStat$TypeVideoClickWithActivePlayer2;
            MobileOfficialAppsSearchStat$TypeSearchClickItem mobileOfficialAppsSearchStat$TypeSearchClickItem2;
            CommonSearchStat$TypeSearchLocalClickItem commonSearchStat$TypeSearchLocalClickItem2;
            SchemeStat$TypeClassifiedsClick schemeStat$TypeClassifiedsClick2;
            SchemeStat$TypeAliexpressClick schemeStat$TypeAliexpressClick2;
            MobileOfficialAppsFeedStat$TypeMarketCarouselClick mobileOfficialAppsFeedStat$TypeMarketCarouselClick2;
            MobileOfficialAppsFeedStat$TypeFeedClickToShopsMoreButton mobileOfficialAppsFeedStat$TypeFeedClickToShopsMoreButton2;
            MobileOfficialAppsMarketStat$TypeMarketClick mobileOfficialAppsMarketStat$TypeMarketClick2;
            SchemeStat$TypeMessagingContactRecommendationsItem schemeStat$TypeMessagingContactRecommendationsItem2;
            MobileOfficialAppsImStat$TypeImConversationClickItem mobileOfficialAppsImStat$TypeImConversationClickItem2;
            SchemeStat$TypeMessagingSyncContactsClickItem schemeStat$TypeMessagingSyncContactsClickItem2;
            MobileOfficialAppsImStat$TypeImGoToProfileClickItem mobileOfficialAppsImStat$TypeImGoToProfileClickItem2;
            MobileOfficialAppsImStat$TypeImPhoneNumberCallClickItem mobileOfficialAppsImStat$TypeImPhoneNumberCallClickItem2;
            MobileOfficialAppsImStat$TypeImGoArchiveClickItem mobileOfficialAppsImStat$TypeImGoArchiveClickItem2;
            MobileOfficialAppsImStat$TypeImPinnedMessageClickItem mobileOfficialAppsImStat$TypeImPinnedMessageClickItem2;
            SchemeStat$TypeImChatItem schemeStat$TypeImChatItem2;
            SchemeStat$TypeProfileActionButtonItem schemeStat$TypeProfileActionButtonItem2;
            SchemeStat$TypeShareItem schemeStat$TypeShareItem2;
            MobileOfficialAppsSharingStat$TypeSharingLinkOpen mobileOfficialAppsSharingStat$TypeSharingLinkOpen2;
            SchemeStat$TypeQuestionItem schemeStat$TypeQuestionItem2;
            MobileOfficialAppsGroupsStat$TypeGroupsEventItem mobileOfficialAppsGroupsStat$TypeGroupsEventItem2;
            MobileOfficialAppsStickersStat$TypeStickersClickItem mobileOfficialAppsStickersStat$TypeStickersClickItem2;
            CommonMarketStat$TypeRatingClick commonMarketStat$TypeRatingClick2;
            MobileOfficialAppsCallsStat$TypeCallsItem mobileOfficialAppsCallsStat$TypeCallsItem2;
            MobileOfficialAppsEcommStat$TypeAdminTipsClick mobileOfficialAppsEcommStat$TypeAdminTipsClick2;
            MobileOfficialAppsNftStat$TypeNftItem mobileOfficialAppsNftStat$TypeNftItem2;
            MobileOfficialAppsFeedStat$TypeFeedMediaDiscoverItem mobileOfficialAppsFeedStat$TypeFeedMediaDiscoverItem2;
            MobileOfficialAppsFeedStat$TypeFeedMediaDiscoverBlock mobileOfficialAppsFeedStat$TypeFeedMediaDiscoverBlock2;
            MobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts mobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts2;
            MobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal mobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal2;
            MobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal mobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal2;
            MobileOfficialAppsFeedStat$TypeFeedStartFastChat mobileOfficialAppsFeedStat$TypeFeedStartFastChat2;
            MobileOfficialAppsFeedStat$TypeFeedCommentThreadButtonShowMore mobileOfficialAppsFeedStat$TypeFeedCommentThreadButtonShowMore2;
            MobileOfficialAppsFeedStat$TypeFeedCommunityMediaItem mobileOfficialAppsFeedStat$TypeFeedCommunityMediaItem2;
            MobileOfficialAppsFeedStat$TypeFeedItemMenuAction mobileOfficialAppsFeedStat$TypeFeedItemMenuAction2;
            MobileOfficialAppsFeedStat$TypeFeedOpenItem mobileOfficialAppsFeedStat$TypeFeedOpenItem2;
            MobileOfficialAppsFeedStat$TypePhotoShareToMessageItem mobileOfficialAppsFeedStat$TypePhotoShareToMessageItem2;
            MobileOfficialAppsFeedStat$TypeObsceneWord mobileOfficialAppsFeedStat$TypeObsceneWord2;
            MobileOfficialAppsFeedStat$TypeRevealObsceneWords mobileOfficialAppsFeedStat$TypeRevealObsceneWords2;
            CommonVasStat$TypeBadgesScreenItem commonVasStat$TypeBadgesScreenItem2;
            MobileOfficialAppsFeedStat$TypeDzenStoryClick mobileOfficialAppsFeedStat$TypeDzenStoryClick2;
            MobileOfficialAppsFeedStat$TypeDzenStoryItemClick mobileOfficialAppsFeedStat$TypeDzenStoryItemClick2;
            MobileOfficialAppsFeedStat$TypeDzenShowMoreClick mobileOfficialAppsFeedStat$TypeDzenShowMoreClick2;
            MobileOfficialAppsSocGraphStat$FollowersModeSwitchState mobileOfficialAppsSocGraphStat$FollowersModeSwitchState2;
            MobileOfficialAppsConPostingStat$TypePostingItem mobileOfficialAppsConPostingStat$TypePostingItem2;
            CommonMarketStat$TypeMarketItemReviewClick commonMarketStat$TypeMarketItemReviewClick2;
            MobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem mobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem2;
            MobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem mobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem2;
            CommonCommunitiesStat$TypeCommunityReviewClick commonCommunitiesStat$TypeCommunityReviewClick2;
            MobileOfficialAppsConPhotosStat$TypePhotosItem mobileOfficialAppsConPhotosStat$TypePhotosItem2;
            t tVar2;
            CommonVasStat$TypeUgcStickersItem commonVasStat$TypeUgcStickersItem2;
            MobileOfficialAppsEcommStat$TypeBannerClick mobileOfficialAppsEcommStat$TypeBannerClick2;
            MobileOfficialAppsVideoStat$TypeVideoInAppReviewClick mobileOfficialAppsVideoStat$TypeVideoInAppReviewClick2;
            MobileOfficialAppsVideoStat$TypeSystemPushClick mobileOfficialAppsVideoStat$TypeSystemPushClick2;
            MobileOfficialAppsVideoStat$TypeAutoplayTurnClick mobileOfficialAppsVideoStat$TypeAutoplayTurnClick2;
            CommonEcommStat$TypeEcommClickItem commonEcommStat$TypeEcommClickItem2;
            MobileOfficialAppsVideoStat$TypeVideoSuggestDownloadsClick mobileOfficialAppsVideoStat$TypeVideoSuggestDownloadsClick2;
            MobileOfficialAppsVideoStat$TypeVideoKidsModeClick mobileOfficialAppsVideoStat$TypeVideoKidsModeClick2;
            p0 p0Var2;
            MobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick mobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick2;
            MobileOfficialAppsVideoStat$TypeVideoCatalogBlockItemClick mobileOfficialAppsVideoStat$TypeVideoCatalogBlockItemClick2;
            MobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick mobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick2;
            MobileOfficialAppsVideoStat$TypeEndVideoClick mobileOfficialAppsVideoStat$TypeEndVideoClick2;
            MobileOfficialAppsVideoStat$TypeVideoDescriptionClick mobileOfficialAppsVideoStat$TypeVideoDescriptionClick2;
            MobileOfficialAppsVideoStat$TypeVideoDownloadClick mobileOfficialAppsVideoStat$TypeVideoDownloadClick2;
            m0 m0Var2;
            SchemeStat$TypeSnowballEvents schemeStat$TypeSnowballEvents2;
            MobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction mobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction2;
            o0 o0Var2;
            k0 k0Var2;
            MobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem mobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem2;
            MobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick mobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick2;
            SchemeStat$TypeLegalNoticeClick schemeStat$TypeLegalNoticeClick2;
            CommonCommunitiesStat$TypeTabItemClick commonCommunitiesStat$TypeTabItemClick2;
            CommonCommunitiesStat$TypeDonutGoal commonCommunitiesStat$TypeDonutGoal2;
            CommonCommunitiesStat$TypeDonutClick commonCommunitiesStat$TypeDonutClick2;
            CommonCommunitiesStat$TypeDonutBanner commonCommunitiesStat$TypeDonutBanner2;
            CommonCommunitiesStat$TypeDonutSupportAuthor commonCommunitiesStat$TypeDonutSupportAuthor2;
            MobileOfficialAppsVideoStat$TypeVideoDirectUrlStartItem mobileOfficialAppsVideoStat$TypeVideoDirectUrlStartItem2;
            MobileOfficialAppsPromoStat$TypePromoClickItem mobileOfficialAppsPromoStat$TypePromoClickItem2;
            CommonOnboardingStat$TypeOnboardingEvent commonOnboardingStat$TypeOnboardingEvent2;
            MobileOfficialAppsFeedStat$TypeFeedOpenUserClick mobileOfficialAppsFeedStat$TypeFeedOpenUserClick2;
            MobileOfficialAppsFeedStat$TypeFeedOpenGroupClick mobileOfficialAppsFeedStat$TypeFeedOpenGroupClick2;
            MobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemUserClick mobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemUserClick2;
            MobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick mobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick2;
            MobileOfficialAppsFeedStat$TypeFeedOpenStoryClick mobileOfficialAppsFeedStat$TypeFeedOpenStoryClick2;
            MobileOfficialAppsFeedStat$TypeFeedHideProductPinClick mobileOfficialAppsFeedStat$TypeFeedHideProductPinClick2;
            MobileOfficialAppsFeedStat$TypeFeedHideTicketItemPin mobileOfficialAppsFeedStat$TypeFeedHideTicketItemPin2;
            MobileOfficialAppsFeedStat$TypeFeedPostPauseAudio mobileOfficialAppsFeedStat$TypeFeedPostPauseAudio2;
            MobileOfficialAppsFeedStat$TypeFeedPostOpenAudio mobileOfficialAppsFeedStat$TypeFeedPostOpenAudio2;
            MobileOfficialAppsFeedStat$TypeFeedPostAddedAudio mobileOfficialAppsFeedStat$TypeFeedPostAddedAudio2;
            MobileOfficialAppsFeedStat$TypeFeedPostRemovedAudio mobileOfficialAppsFeedStat$TypeFeedPostRemovedAudio2;
            MobileOfficialAppsFeedStat$TypeFeedPostOpenPlaylist mobileOfficialAppsFeedStat$TypeFeedPostOpenPlaylist2;
            MobileOfficialAppsFeedStat$TypeFeedPostAddedPlaylist mobileOfficialAppsFeedStat$TypeFeedPostAddedPlaylist2;
            MobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist mobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist2;
            MobileOfficialAppsFeedStat$TypeFeedCoownersEvent mobileOfficialAppsFeedStat$TypeFeedCoownersEvent2;
            MobileOfficialAppsFeedStat$TypeFeedViewAuthors mobileOfficialAppsFeedStat$TypeFeedViewAuthors2;
            MobileOfficialAppsFeedStat$TypeActionButtonClick mobileOfficialAppsFeedStat$TypeActionButtonClick2;
            n0 n0Var2;
            MobileOfficialAppsVideoStat$TypeTvQrModalAction mobileOfficialAppsVideoStat$TypeTvQrModalAction2;
            MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingItem mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingItem2;
            MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem2;
            j0 j0Var2;
            MobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick mobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick2;
            CommonAudioStat$TypeAudioPopupItem commonAudioStat$TypeAudioPopupItem2;
            MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick mobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick2;
            SchemeStat$TypeSuperappSettingsItem schemeStat$TypeSuperappSettingsItem2;
            MobileOfficialAppsMarusiaStat$TypeConversationItem mobileOfficialAppsMarusiaStat$TypeConversationItem2;
            MobileOfficialAppsMarusiaStat$TypeReadingItem mobileOfficialAppsMarusiaStat$TypeReadingItem2;
            SchemeStat$TypeVideoPipItem schemeStat$TypeVideoPipItem2;
            SchemeStat$TypeVideoMiniplayerItem schemeStat$TypeVideoMiniplayerItem2;
            MobileOfficialAppsVideoStat$TypeVideoDownloadItem mobileOfficialAppsVideoStat$TypeVideoDownloadItem2;
            MobileOfficialAppsVideoStat$TypeVideoNotInteresting mobileOfficialAppsVideoStat$TypeVideoNotInteresting2;
            MobileOfficialAppsVideoStat$TypeSkipVideoButtonClick mobileOfficialAppsVideoStat$TypeSkipVideoButtonClick2;
            CommonAudioStat$TypeAudioTapPopupEventItem commonAudioStat$TypeAudioTapPopupEventItem2;
            MobileOfficialAppsFeedStat$TypeDzenBlockArticleClick mobileOfficialAppsFeedStat$TypeDzenBlockArticleClick2;
            MobileOfficialAppsConDzenStat$TypeDzenArticleItem mobileOfficialAppsConDzenStat$TypeDzenArticleItem2;
            CommonAudioStat$TypeAudioTapGotoEventItem commonAudioStat$TypeAudioTapGotoEventItem2;
            MobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem mobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem2;
            CommonAudioStat$TypeAudioTapEqualizerEventItem commonAudioStat$TypeAudioTapEqualizerEventItem2;
            MobileOfficialAppsVideoStat$TypeCloseCastConnectOfferModal mobileOfficialAppsVideoStat$TypeCloseCastConnectOfferModal2;
            CommonAudioStat$TypeAudioTapSettingsEventItem commonAudioStat$TypeAudioTapSettingsEventItem2;
            CommonAudioStat$TypeAudioArtistClickItem commonAudioStat$TypeAudioArtistClickItem2;
            MobileOfficialAppsVideoStat$TypeVideoDoNotRecommendAuthor mobileOfficialAppsVideoStat$TypeVideoDoNotRecommendAuthor2;
            SchemeStat$EventItem schemeStat$EventItem2;
            Integer num2;
            SchemeStat$TypeNavigationTabClick schemeStat$TypeNavigationTabClick2;
            Type type2;
            Integer num3 = (i & 2) != 0 ? null : num;
            Type type3 = (i & 4) != 0 ? null : type;
            MobileOfficialAppsFeedStat$TypeDzenBlockArticleClick mobileOfficialAppsFeedStat$TypeDzenBlockArticleClick3 = (i & 8) != 0 ? null : mobileOfficialAppsFeedStat$TypeDzenBlockArticleClick;
            MobileOfficialAppsConDzenStat$TypeDzenArticleItem mobileOfficialAppsConDzenStat$TypeDzenArticleItem3 = (i & 16) != 0 ? null : mobileOfficialAppsConDzenStat$TypeDzenArticleItem;
            CommonAudioStat$TypeAudioTapGotoEventItem commonAudioStat$TypeAudioTapGotoEventItem3 = (i & 32) != 0 ? null : commonAudioStat$TypeAudioTapGotoEventItem;
            MobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem mobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem3 = (i & 64) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem;
            CommonAudioStat$TypeAudioTapEqualizerEventItem commonAudioStat$TypeAudioTapEqualizerEventItem3 = (i & 128) != 0 ? null : commonAudioStat$TypeAudioTapEqualizerEventItem;
            MobileOfficialAppsVideoStat$TypeCloseCastConnectOfferModal mobileOfficialAppsVideoStat$TypeCloseCastConnectOfferModal3 = (i & 256) != 0 ? null : mobileOfficialAppsVideoStat$TypeCloseCastConnectOfferModal;
            CommonAudioStat$TypeAudioTapPopupEventItem commonAudioStat$TypeAudioTapPopupEventItem3 = (i & 512) != 0 ? null : commonAudioStat$TypeAudioTapPopupEventItem;
            Integer num4 = num3;
            CommonAudioStat$TypeAudioTapSettingsEventItem commonAudioStat$TypeAudioTapSettingsEventItem3 = (i & 1024) != 0 ? null : commonAudioStat$TypeAudioTapSettingsEventItem;
            CommonAudioStat$TypeAudioArtistClickItem commonAudioStat$TypeAudioArtistClickItem3 = (i & 2048) != 0 ? null : commonAudioStat$TypeAudioArtistClickItem;
            SchemeStat$TypeNavigationTabClick schemeStat$TypeNavigationTabClick3 = (i & 4096) != 0 ? null : schemeStat$TypeNavigationTabClick;
            CommonAudioStat$TypeAudioPopupItem commonAudioStat$TypeAudioPopupItem3 = (i & 8192) != 0 ? null : commonAudioStat$TypeAudioPopupItem;
            SchemeStat$TypeImItem schemeStat$TypeImItem3 = (i & 16384) != 0 ? null : schemeStat$TypeImItem;
            SchemeStat$TypeMarketItem schemeStat$TypeMarketItem3 = (i & 32768) != 0 ? null : schemeStat$TypeMarketItem;
            SchemeStat$TypeMarketMarketplaceItem schemeStat$TypeMarketMarketplaceItem3 = (i & 65536) != 0 ? null : schemeStat$TypeMarketMarketplaceItem;
            SchemeStat$TypeSuperappScreenItem schemeStat$TypeSuperappScreenItem3 = (i & 131072) != 0 ? null : schemeStat$TypeSuperappScreenItem;
            SchemeStat$TypeMiniAppItem schemeStat$TypeMiniAppItem3 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : schemeStat$TypeMiniAppItem;
            CommonVideoStat$TypeVideoCardEvent commonVideoStat$TypeVideoCardEvent3 = (i & 524288) != 0 ? null : commonVideoStat$TypeVideoCardEvent;
            SchemeStat$TypeClickItem schemeStat$TypeClickItem3 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : schemeStat$TypeClickItem;
            SchemeStat$TypeGamesCatalogClick schemeStat$TypeGamesCatalogClick3 = (i & 2097152) != 0 ? null : schemeStat$TypeGamesCatalogClick;
            MobileOfficialAppsVideoStat$TypeVideoCardLongtap mobileOfficialAppsVideoStat$TypeVideoCardLongtap3 = (i & 4194304) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoCardLongtap;
            SchemeStat$TypeClickPreferenceItem schemeStat$TypeClickPreferenceItem3 = (i & 8388608) != 0 ? null : schemeStat$TypeClickPreferenceItem;
            MobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem mobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem3 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : mobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem;
            SchemeStat$TypeClickPreferenceValueItem schemeStat$TypeClickPreferenceValueItem3 = (i & 33554432) != 0 ? null : schemeStat$TypeClickPreferenceValueItem;
            MobileOfficialAppsVideoStat$TypeSoftUpdateClick mobileOfficialAppsVideoStat$TypeSoftUpdateClick3 = (i & 67108864) != 0 ? null : mobileOfficialAppsVideoStat$TypeSoftUpdateClick;
            MobileOfficialAppsFeedStat$TypeFeedInteractionItem mobileOfficialAppsFeedStat$TypeFeedInteractionItem3 = (i & 134217728) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedInteractionItem;
            CommonVideoAdsStat$TypeOverlayAdClick commonVideoAdsStat$TypeOverlayAdClick3 = (i & 268435456) != 0 ? null : commonVideoAdsStat$TypeOverlayAdClick;
            CommonOnboardingStat$TypeUiHintItem commonOnboardingStat$TypeUiHintItem3 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : commonOnboardingStat$TypeUiHintItem;
            SchemeStat$TypeClipViewerItem schemeStat$TypeClipViewerItem3 = (i & 1073741824) != 0 ? null : schemeStat$TypeClipViewerItem;
            MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick mobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick3 = (i & Integer.MIN_VALUE) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick;
            MobileOfficialAppsVideoStat$TypeVideoPlayerCastClick mobileOfficialAppsVideoStat$TypeVideoPlayerCastClick3 = (i2 & 1) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoPlayerCastClick;
            MobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick mobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick3 = (i2 & 2) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick;
            MobileOfficialAppsVideoStat$TypeVideoToClipAttach mobileOfficialAppsVideoStat$TypeVideoToClipAttach3 = (i2 & 4) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoToClipAttach;
            MobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem mobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem3 = (i2 & 8) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem;
            CommonVideoStat$TypeVideoCreateClip commonVideoStat$TypeVideoCreateClip3 = (i2 & 16) != 0 ? null : commonVideoStat$TypeVideoCreateClip;
            CommonVideoStat$TypeClickToAuthorCommunity commonVideoStat$TypeClickToAuthorCommunity3 = (i2 & 32) != 0 ? null : commonVideoStat$TypeClickToAuthorCommunity;
            MobileOfficialAppsClipsStat$TypeClipsGridItem mobileOfficialAppsClipsStat$TypeClipsGridItem3 = (i2 & 64) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipsGridItem;
            MobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick mobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick4 = mobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick3;
            SchemeStat$TypeSuperappSettingsItem schemeStat$TypeSuperappSettingsItem3 = (i2 & 128) != 0 ? null : schemeStat$TypeSuperappSettingsItem;
            MobileOfficialAppsMarusiaStat$TypeConversationItem mobileOfficialAppsMarusiaStat$TypeConversationItem3 = (i2 & 256) != 0 ? null : mobileOfficialAppsMarusiaStat$TypeConversationItem;
            MobileOfficialAppsMarusiaStat$TypeReadingItem mobileOfficialAppsMarusiaStat$TypeReadingItem3 = (i2 & 512) != 0 ? null : mobileOfficialAppsMarusiaStat$TypeReadingItem;
            SchemeStat$TypeVideoPipItem schemeStat$TypeVideoPipItem3 = (i2 & 1024) != 0 ? null : schemeStat$TypeVideoPipItem;
            SchemeStat$TypeVideoMiniplayerItem schemeStat$TypeVideoMiniplayerItem3 = (i2 & 2048) != 0 ? null : schemeStat$TypeVideoMiniplayerItem;
            MobileOfficialAppsVideoStat$TypeVideoDownloadItem mobileOfficialAppsVideoStat$TypeVideoDownloadItem3 = (i2 & 4096) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoDownloadItem;
            MobileOfficialAppsVideoStat$TypeVideoNotInteresting mobileOfficialAppsVideoStat$TypeVideoNotInteresting3 = (i2 & 8192) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoNotInteresting;
            MobileOfficialAppsVideoStat$TypeVideoDoNotRecommendAuthor mobileOfficialAppsVideoStat$TypeVideoDoNotRecommendAuthor3 = (i2 & 16384) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoDoNotRecommendAuthor;
            MobileOfficialAppsVideoStat$TypeVideoTvProgram mobileOfficialAppsVideoStat$TypeVideoTvProgram3 = (i2 & 32768) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoTvProgram;
            MobileOfficialAppsVideoStat$TypeVideoWatchLater mobileOfficialAppsVideoStat$TypeVideoWatchLater3 = (i2 & 65536) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoWatchLater;
            SchemeStat$TypeVideoBackgroundListeningItem schemeStat$TypeVideoBackgroundListeningItem3 = (i2 & 131072) != 0 ? null : schemeStat$TypeVideoBackgroundListeningItem;
            CommonVideoStat$TypeVideoClickWithActivePlayer commonVideoStat$TypeVideoClickWithActivePlayer3 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : commonVideoStat$TypeVideoClickWithActivePlayer;
            MobileOfficialAppsSearchStat$TypeSearchClickItem mobileOfficialAppsSearchStat$TypeSearchClickItem3 = (i2 & 524288) != 0 ? null : mobileOfficialAppsSearchStat$TypeSearchClickItem;
            CommonSearchStat$TypeSearchLocalClickItem commonSearchStat$TypeSearchLocalClickItem3 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : commonSearchStat$TypeSearchLocalClickItem;
            SchemeStat$TypeClassifiedsClick schemeStat$TypeClassifiedsClick3 = (i2 & 2097152) != 0 ? null : schemeStat$TypeClassifiedsClick;
            SchemeStat$TypeAliexpressClick schemeStat$TypeAliexpressClick3 = (i2 & 4194304) != 0 ? null : schemeStat$TypeAliexpressClick;
            MobileOfficialAppsFeedStat$TypeMarketCarouselClick mobileOfficialAppsFeedStat$TypeMarketCarouselClick3 = (i2 & 8388608) != 0 ? null : mobileOfficialAppsFeedStat$TypeMarketCarouselClick;
            MobileOfficialAppsFeedStat$TypeFeedClickToShopsMoreButton mobileOfficialAppsFeedStat$TypeFeedClickToShopsMoreButton3 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedClickToShopsMoreButton;
            MobileOfficialAppsMarketStat$TypeMarketClick mobileOfficialAppsMarketStat$TypeMarketClick3 = (i2 & 33554432) != 0 ? null : mobileOfficialAppsMarketStat$TypeMarketClick;
            SchemeStat$TypeMessagingContactRecommendationsItem schemeStat$TypeMessagingContactRecommendationsItem3 = (i2 & 67108864) != 0 ? null : schemeStat$TypeMessagingContactRecommendationsItem;
            MobileOfficialAppsImStat$TypeImConversationClickItem mobileOfficialAppsImStat$TypeImConversationClickItem3 = (i2 & 134217728) != 0 ? null : mobileOfficialAppsImStat$TypeImConversationClickItem;
            SchemeStat$TypeMessagingSyncContactsClickItem schemeStat$TypeMessagingSyncContactsClickItem3 = (i2 & 268435456) != 0 ? null : schemeStat$TypeMessagingSyncContactsClickItem;
            MobileOfficialAppsImStat$TypeImGoToProfileClickItem mobileOfficialAppsImStat$TypeImGoToProfileClickItem3 = (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : mobileOfficialAppsImStat$TypeImGoToProfileClickItem;
            MobileOfficialAppsImStat$TypeImPhoneNumberCallClickItem mobileOfficialAppsImStat$TypeImPhoneNumberCallClickItem3 = (i2 & 1073741824) != 0 ? null : mobileOfficialAppsImStat$TypeImPhoneNumberCallClickItem;
            MobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem mobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem3 = (i2 & Integer.MIN_VALUE) != 0 ? null : mobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem;
            MobileOfficialAppsImStat$TypeImGoArchiveClickItem mobileOfficialAppsImStat$TypeImGoArchiveClickItem3 = (i3 & 1) != 0 ? null : mobileOfficialAppsImStat$TypeImGoArchiveClickItem;
            MobileOfficialAppsImStat$TypeImPinnedMessageClickItem mobileOfficialAppsImStat$TypeImPinnedMessageClickItem3 = (i3 & 2) != 0 ? null : mobileOfficialAppsImStat$TypeImPinnedMessageClickItem;
            SchemeStat$TypeImChatItem schemeStat$TypeImChatItem3 = (i3 & 4) != 0 ? null : schemeStat$TypeImChatItem;
            SchemeStat$TypeProfileActionButtonItem schemeStat$TypeProfileActionButtonItem3 = (i3 & 8) != 0 ? null : schemeStat$TypeProfileActionButtonItem;
            SchemeStat$TypeShareItem schemeStat$TypeShareItem3 = (i3 & 16) != 0 ? null : schemeStat$TypeShareItem;
            MobileOfficialAppsSharingStat$TypeSharingLinkOpen mobileOfficialAppsSharingStat$TypeSharingLinkOpen3 = (i3 & 32) != 0 ? null : mobileOfficialAppsSharingStat$TypeSharingLinkOpen;
            SchemeStat$TypeQuestionItem schemeStat$TypeQuestionItem3 = (i3 & 64) != 0 ? null : schemeStat$TypeQuestionItem;
            MobileOfficialAppsVideoStat$TypeVideoDoNotRecommendAuthor mobileOfficialAppsVideoStat$TypeVideoDoNotRecommendAuthor4 = mobileOfficialAppsVideoStat$TypeVideoDoNotRecommendAuthor3;
            SchemeStat$TypeBadgesItem schemeStat$TypeBadgesItem3 = (i3 & 128) != 0 ? null : schemeStat$TypeBadgesItem;
            SchemeStat$TypeWishlistItem schemeStat$TypeWishlistItem3 = (i3 & 256) != 0 ? null : schemeStat$TypeWishlistItem;
            SchemeStat$TypeOwnerButtonAppClick schemeStat$TypeOwnerButtonAppClick3 = (i3 & 512) != 0 ? null : schemeStat$TypeOwnerButtonAppClick;
            c0 c0Var3 = (i3 & 1024) != 0 ? null : c0Var;
            MobileOfficialAppsSuperappStat$TypeSuperappOnboardingClickItem mobileOfficialAppsSuperappStat$TypeSuperappOnboardingClickItem3 = (i3 & 2048) != 0 ? null : mobileOfficialAppsSuperappStat$TypeSuperappOnboardingClickItem;
            MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem mobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem3 = (i3 & 4096) != 0 ? null : mobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem;
            MobileOfficialAppsProfileStat$TypeProfileItem mobileOfficialAppsProfileStat$TypeProfileItem3 = (i3 & 8192) != 0 ? null : mobileOfficialAppsProfileStat$TypeProfileItem;
            CommonCommunitiesStat$TypeChannelItemClick commonCommunitiesStat$TypeChannelItemClick3 = (i3 & 16384) != 0 ? null : commonCommunitiesStat$TypeChannelItemClick;
            MobileOfficialAppsGroupsStat$TypeGroupsEventItem mobileOfficialAppsGroupsStat$TypeGroupsEventItem3 = (i3 & 32768) != 0 ? null : mobileOfficialAppsGroupsStat$TypeGroupsEventItem;
            MobileOfficialAppsStickersStat$TypeStickersClickItem mobileOfficialAppsStickersStat$TypeStickersClickItem3 = (i3 & 65536) != 0 ? null : mobileOfficialAppsStickersStat$TypeStickersClickItem;
            CommonMarketStat$TypeRatingClick commonMarketStat$TypeRatingClick3 = (i3 & 131072) != 0 ? null : commonMarketStat$TypeRatingClick;
            MobileOfficialAppsCallsStat$TypeCallsItem mobileOfficialAppsCallsStat$TypeCallsItem3 = (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : mobileOfficialAppsCallsStat$TypeCallsItem;
            MobileOfficialAppsEcommStat$TypeAdminTipsClick mobileOfficialAppsEcommStat$TypeAdminTipsClick3 = (i3 & 524288) != 0 ? null : mobileOfficialAppsEcommStat$TypeAdminTipsClick;
            MobileOfficialAppsNftStat$TypeNftItem mobileOfficialAppsNftStat$TypeNftItem3 = (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : mobileOfficialAppsNftStat$TypeNftItem;
            MobileOfficialAppsFeedStat$TypeFeedMediaDiscoverItem mobileOfficialAppsFeedStat$TypeFeedMediaDiscoverItem3 = (i3 & 2097152) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedMediaDiscoverItem;
            MobileOfficialAppsFeedStat$TypeFeedMediaDiscoverBlock mobileOfficialAppsFeedStat$TypeFeedMediaDiscoverBlock3 = (i3 & 4194304) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedMediaDiscoverBlock;
            MobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts mobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts3 = (i3 & 8388608) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts;
            MobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal mobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal3 = (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal;
            MobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal mobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal3 = (i3 & 33554432) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal;
            MobileOfficialAppsFeedStat$TypeFeedStartFastChat mobileOfficialAppsFeedStat$TypeFeedStartFastChat3 = (i3 & 67108864) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedStartFastChat;
            MobileOfficialAppsFeedStat$TypeFeedCommentThreadButtonShowMore mobileOfficialAppsFeedStat$TypeFeedCommentThreadButtonShowMore3 = (i3 & 134217728) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedCommentThreadButtonShowMore;
            MobileOfficialAppsFeedStat$TypeFeedCommunityMediaItem mobileOfficialAppsFeedStat$TypeFeedCommunityMediaItem3 = (i3 & 268435456) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedCommunityMediaItem;
            MobileOfficialAppsFeedStat$TypeFeedItemMenuAction mobileOfficialAppsFeedStat$TypeFeedItemMenuAction3 = (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedItemMenuAction;
            MobileOfficialAppsFeedStat$TypeFeedOpenItem mobileOfficialAppsFeedStat$TypeFeedOpenItem3 = (i3 & 1073741824) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedOpenItem;
            MobileOfficialAppsFeedStat$TypePhotoSaveToAlbumMenuItem mobileOfficialAppsFeedStat$TypePhotoSaveToAlbumMenuItem3 = (i3 & Integer.MIN_VALUE) != 0 ? null : mobileOfficialAppsFeedStat$TypePhotoSaveToAlbumMenuItem;
            MobileOfficialAppsFeedStat$TypePhotoShareToMessageItem mobileOfficialAppsFeedStat$TypePhotoShareToMessageItem3 = (i4 & 1) != 0 ? null : mobileOfficialAppsFeedStat$TypePhotoShareToMessageItem;
            MobileOfficialAppsFeedStat$TypeObsceneWord mobileOfficialAppsFeedStat$TypeObsceneWord3 = (i4 & 2) != 0 ? null : mobileOfficialAppsFeedStat$TypeObsceneWord;
            MobileOfficialAppsFeedStat$TypeRevealObsceneWords mobileOfficialAppsFeedStat$TypeRevealObsceneWords3 = (i4 & 4) != 0 ? null : mobileOfficialAppsFeedStat$TypeRevealObsceneWords;
            CommonVasStat$TypeBadgesScreenItem commonVasStat$TypeBadgesScreenItem3 = (i4 & 8) != 0 ? null : commonVasStat$TypeBadgesScreenItem;
            MobileOfficialAppsFeedStat$TypeDzenStoryClick mobileOfficialAppsFeedStat$TypeDzenStoryClick3 = (i4 & 16) != 0 ? null : mobileOfficialAppsFeedStat$TypeDzenStoryClick;
            MobileOfficialAppsFeedStat$TypeDzenStoryItemClick mobileOfficialAppsFeedStat$TypeDzenStoryItemClick3 = (i4 & 32) != 0 ? null : mobileOfficialAppsFeedStat$TypeDzenStoryItemClick;
            MobileOfficialAppsFeedStat$TypeDzenShowMoreClick mobileOfficialAppsFeedStat$TypeDzenShowMoreClick3 = (i4 & 64) != 0 ? null : mobileOfficialAppsFeedStat$TypeDzenShowMoreClick;
            CommonCommunitiesStat$TypeChannelItemClick commonCommunitiesStat$TypeChannelItemClick4 = commonCommunitiesStat$TypeChannelItemClick3;
            MobileOfficialAppsFeedStat$TypeHiddenSourceOpenProfile mobileOfficialAppsFeedStat$TypeHiddenSourceOpenProfile3 = (i4 & 128) != 0 ? null : mobileOfficialAppsFeedStat$TypeHiddenSourceOpenProfile;
            MobileOfficialAppsFeedStat$TypeHiddenSourceUnbanButton mobileOfficialAppsFeedStat$TypeHiddenSourceUnbanButton3 = (i4 & 256) != 0 ? null : mobileOfficialAppsFeedStat$TypeHiddenSourceUnbanButton;
            MobileOfficialAppsFeedStat$TypeHiddenSourceUnbanCancelButton mobileOfficialAppsFeedStat$TypeHiddenSourceUnbanCancelButton3 = (i4 & 512) != 0 ? null : mobileOfficialAppsFeedStat$TypeHiddenSourceUnbanCancelButton;
            MobileOfficialAppsFeedStat$TypeFeedCarouselLongtap mobileOfficialAppsFeedStat$TypeFeedCarouselLongtap3 = (i4 & 1024) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedCarouselLongtap;
            MobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll mobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll3 = (i4 & 2048) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll;
            MobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingScroll mobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingScroll3 = (i4 & 4096) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingScroll;
            CommonCommunitiesStat$TypeCommunityOnboardingClick commonCommunitiesStat$TypeCommunityOnboardingClick3 = (i4 & 8192) != 0 ? null : commonCommunitiesStat$TypeCommunityOnboardingClick;
            MobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick mobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick3 = (i4 & 16384) != 0 ? null : mobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick;
            MobileOfficialAppsSocGraphStat$FollowersModeSwitchState mobileOfficialAppsSocGraphStat$FollowersModeSwitchState3 = (i4 & 32768) != 0 ? null : mobileOfficialAppsSocGraphStat$FollowersModeSwitchState;
            MobileOfficialAppsConPostingStat$TypePostingItem mobileOfficialAppsConPostingStat$TypePostingItem3 = (i4 & 65536) != 0 ? null : mobileOfficialAppsConPostingStat$TypePostingItem;
            CommonMarketStat$TypeMarketItemReviewClick commonMarketStat$TypeMarketItemReviewClick3 = (i4 & 131072) != 0 ? null : commonMarketStat$TypeMarketItemReviewClick;
            MobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem mobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem3 = (i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : mobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem;
            MobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem mobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem3 = (i4 & 524288) != 0 ? null : mobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem;
            CommonCommunitiesStat$TypeCommunityReviewClick commonCommunitiesStat$TypeCommunityReviewClick3 = (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : commonCommunitiesStat$TypeCommunityReviewClick;
            MobileOfficialAppsConPhotosStat$TypePhotosItem mobileOfficialAppsConPhotosStat$TypePhotosItem3 = (i4 & 2097152) != 0 ? null : mobileOfficialAppsConPhotosStat$TypePhotosItem;
            t tVar3 = (i4 & 4194304) != 0 ? null : tVar;
            CommonVasStat$TypeUgcStickersItem commonVasStat$TypeUgcStickersItem3 = (i4 & 8388608) != 0 ? null : commonVasStat$TypeUgcStickersItem;
            MobileOfficialAppsEcommStat$TypeBannerClick mobileOfficialAppsEcommStat$TypeBannerClick3 = (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : mobileOfficialAppsEcommStat$TypeBannerClick;
            MobileOfficialAppsVideoStat$TypeVideoInAppReviewClick mobileOfficialAppsVideoStat$TypeVideoInAppReviewClick3 = (i4 & 33554432) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoInAppReviewClick;
            MobileOfficialAppsVideoStat$TypeSystemPushClick mobileOfficialAppsVideoStat$TypeSystemPushClick3 = (i4 & 67108864) != 0 ? null : mobileOfficialAppsVideoStat$TypeSystemPushClick;
            MobileOfficialAppsVideoStat$TypeAutoplayTurnClick mobileOfficialAppsVideoStat$TypeAutoplayTurnClick3 = (i4 & 134217728) != 0 ? null : mobileOfficialAppsVideoStat$TypeAutoplayTurnClick;
            CommonEcommStat$TypeEcommClickItem commonEcommStat$TypeEcommClickItem3 = (i4 & 268435456) != 0 ? null : commonEcommStat$TypeEcommClickItem;
            MobileOfficialAppsVideoStat$TypeVideoSuggestDownloadsClick mobileOfficialAppsVideoStat$TypeVideoSuggestDownloadsClick3 = (i4 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoSuggestDownloadsClick;
            MobileOfficialAppsVideoStat$TypeVideoKidsModeClick mobileOfficialAppsVideoStat$TypeVideoKidsModeClick3 = (i4 & 1073741824) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoKidsModeClick;
            l0 l0Var3 = (i4 & Integer.MIN_VALUE) != 0 ? null : l0Var;
            p0 p0Var3 = (i5 & 1) != 0 ? null : p0Var;
            MobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick mobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick3 = (i5 & 2) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick;
            MobileOfficialAppsVideoStat$TypeVideoCatalogBlockItemClick mobileOfficialAppsVideoStat$TypeVideoCatalogBlockItemClick3 = (i5 & 4) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoCatalogBlockItemClick;
            MobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick mobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick3 = (i5 & 8) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick;
            MobileOfficialAppsVideoStat$TypeEndVideoClick mobileOfficialAppsVideoStat$TypeEndVideoClick3 = (i5 & 16) != 0 ? null : mobileOfficialAppsVideoStat$TypeEndVideoClick;
            MobileOfficialAppsVideoStat$TypeVideoDescriptionClick mobileOfficialAppsVideoStat$TypeVideoDescriptionClick3 = (i5 & 32) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoDescriptionClick;
            MobileOfficialAppsVideoStat$TypeVideoDownloadClick mobileOfficialAppsVideoStat$TypeVideoDownloadClick3 = (i5 & 64) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoDownloadClick;
            MobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick mobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick4 = mobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick3;
            MobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem mobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem3 = (i5 & 128) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem;
            MobileOfficialAppsVideoStat$TypeVideoCommentClick mobileOfficialAppsVideoStat$TypeVideoCommentClick3 = (i5 & 256) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoCommentClick;
            MobileOfficialAppsVideoStat$TypeVideoScreenCommentClick mobileOfficialAppsVideoStat$TypeVideoScreenCommentClick3 = (i5 & 512) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoScreenCommentClick;
            MobileOfficialAppsVideoStat$TypeVideoCommentsSortTabClick mobileOfficialAppsVideoStat$TypeVideoCommentsSortTabClick3 = (i5 & 1024) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoCommentsSortTabClick;
            MobileOfficialAppsVideoStat$TypeVideoDiscoveryLogoClick mobileOfficialAppsVideoStat$TypeVideoDiscoveryLogoClick3 = (i5 & 2048) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoDiscoveryLogoClick;
            MobileOfficialAppsVideoStat$TypeVideoPushesAdClick mobileOfficialAppsVideoStat$TypeVideoPushesAdClick3 = (i5 & 4096) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoPushesAdClick;
            MobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator mobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator3 = (i5 & 8192) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator;
            MobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator mobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator3 = (i5 & 16384) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator;
            m0 m0Var3 = (i5 & 32768) != 0 ? null : m0Var;
            SchemeStat$TypeSnowballEvents schemeStat$TypeSnowballEvents3 = (i5 & 65536) != 0 ? null : schemeStat$TypeSnowballEvents;
            MobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction mobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction3 = (i5 & 131072) != 0 ? null : mobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction;
            o0 o0Var3 = (i5 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : o0Var;
            k0 k0Var3 = (i5 & 524288) != 0 ? null : k0Var;
            MobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem mobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem3 = (i5 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : mobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem;
            MobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick mobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick3 = (i5 & 2097152) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick;
            SchemeStat$TypeLegalNoticeClick schemeStat$TypeLegalNoticeClick3 = (i5 & 4194304) != 0 ? null : schemeStat$TypeLegalNoticeClick;
            CommonCommunitiesStat$TypeTabItemClick commonCommunitiesStat$TypeTabItemClick3 = (i5 & 8388608) != 0 ? null : commonCommunitiesStat$TypeTabItemClick;
            CommonCommunitiesStat$TypeDonutGoal commonCommunitiesStat$TypeDonutGoal3 = (i5 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : commonCommunitiesStat$TypeDonutGoal;
            CommonCommunitiesStat$TypeDonutClick commonCommunitiesStat$TypeDonutClick3 = (i5 & 33554432) != 0 ? null : commonCommunitiesStat$TypeDonutClick;
            CommonCommunitiesStat$TypeDonutBanner commonCommunitiesStat$TypeDonutBanner3 = (i5 & 67108864) != 0 ? null : commonCommunitiesStat$TypeDonutBanner;
            CommonCommunitiesStat$TypeDonutSupportAuthor commonCommunitiesStat$TypeDonutSupportAuthor3 = (i5 & 134217728) != 0 ? null : commonCommunitiesStat$TypeDonutSupportAuthor;
            MobileOfficialAppsVideoStat$TypeVideoDirectUrlStartItem mobileOfficialAppsVideoStat$TypeVideoDirectUrlStartItem3 = (i5 & 268435456) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoDirectUrlStartItem;
            MobileOfficialAppsPromoStat$TypePromoClickItem mobileOfficialAppsPromoStat$TypePromoClickItem3 = (i5 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : mobileOfficialAppsPromoStat$TypePromoClickItem;
            CommonOnboardingStat$TypeOnboardingEvent commonOnboardingStat$TypeOnboardingEvent3 = (i5 & 1073741824) != 0 ? null : commonOnboardingStat$TypeOnboardingEvent;
            MobileOfficialAppsNotificationsStat$TypeNotificationItemClick mobileOfficialAppsNotificationsStat$TypeNotificationItemClick3 = (i5 & Integer.MIN_VALUE) != 0 ? null : mobileOfficialAppsNotificationsStat$TypeNotificationItemClick;
            MobileOfficialAppsFeedStat$TypeFeedOpenUserClick mobileOfficialAppsFeedStat$TypeFeedOpenUserClick3 = (i6 & 1) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedOpenUserClick;
            MobileOfficialAppsFeedStat$TypeFeedOpenGroupClick mobileOfficialAppsFeedStat$TypeFeedOpenGroupClick3 = (i6 & 2) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedOpenGroupClick;
            MobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemUserClick mobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemUserClick3 = (i6 & 4) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemUserClick;
            MobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick mobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick3 = (i6 & 8) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick;
            MobileOfficialAppsFeedStat$TypeFeedOpenStoryClick mobileOfficialAppsFeedStat$TypeFeedOpenStoryClick3 = (i6 & 16) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedOpenStoryClick;
            MobileOfficialAppsFeedStat$TypeFeedHideProductPinClick mobileOfficialAppsFeedStat$TypeFeedHideProductPinClick3 = (i6 & 32) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedHideProductPinClick;
            MobileOfficialAppsFeedStat$TypeFeedHideTicketItemPin mobileOfficialAppsFeedStat$TypeFeedHideTicketItemPin3 = (i6 & 64) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedHideTicketItemPin;
            MobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator mobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator4 = mobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator3;
            MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick mobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick3 = (i6 & 128) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick;
            MobileOfficialAppsFeedStat$TypeFeedTicketItemClick mobileOfficialAppsFeedStat$TypeFeedTicketItemClick3 = (i6 & 256) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedTicketItemClick;
            MobileOfficialAppsFeedStat$TypeFeedShowProductsModalCardClick mobileOfficialAppsFeedStat$TypeFeedShowProductsModalCardClick3 = (i6 & 512) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedShowProductsModalCardClick;
            MobileOfficialAppsFeedStat$TypeFeedFollowClick mobileOfficialAppsFeedStat$TypeFeedFollowClick3 = (i6 & 1024) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedFollowClick;
            MobileOfficialAppsFeedStat$TypeFeedUnfollowClick mobileOfficialAppsFeedStat$TypeFeedUnfollowClick3 = (i6 & 2048) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedUnfollowClick;
            MobileOfficialAppsFeedStat$TypeFeedPostExpandText mobileOfficialAppsFeedStat$TypeFeedPostExpandText3 = (i6 & 4096) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedPostExpandText;
            a0 a0Var3 = (i6 & 8192) != 0 ? null : a0Var;
            MobileOfficialAppsSharingStat$TypeModalSharingOpen mobileOfficialAppsSharingStat$TypeModalSharingOpen3 = (i6 & 16384) != 0 ? null : mobileOfficialAppsSharingStat$TypeModalSharingOpen;
            MobileOfficialAppsSharingStat$TypeModalSharingClick mobileOfficialAppsSharingStat$TypeModalSharingClick3 = (i6 & 32768) != 0 ? null : mobileOfficialAppsSharingStat$TypeModalSharingClick;
            MobileOfficialAppsSharingStat$TypeModalSharingClose mobileOfficialAppsSharingStat$TypeModalSharingClose3 = (i6 & 65536) != 0 ? null : mobileOfficialAppsSharingStat$TypeModalSharingClose;
            MobileOfficialAppsVideoStat$TypeVideoModalSharingClick mobileOfficialAppsVideoStat$TypeVideoModalSharingClick3 = (i6 & 131072) != 0 ? null : mobileOfficialAppsVideoStat$TypeVideoModalSharingClick;
            MobileOfficialAppsVideoStat$TypeTvKidModeItem mobileOfficialAppsVideoStat$TypeTvKidModeItem3 = (i6 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : mobileOfficialAppsVideoStat$TypeTvKidModeItem;
            MobileOfficialAppsImStat$TypeOpenCommunityChats mobileOfficialAppsImStat$TypeOpenCommunityChats3 = (i6 & 524288) != 0 ? null : mobileOfficialAppsImStat$TypeOpenCommunityChats;
            MobileOfficialAppsFeedStat$TypeFeedPostUnmuteAudio mobileOfficialAppsFeedStat$TypeFeedPostUnmuteAudio3 = (i6 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedPostUnmuteAudio;
            MobileOfficialAppsFeedStat$TypeFeedPostMuteAudio mobileOfficialAppsFeedStat$TypeFeedPostMuteAudio3 = (i6 & 2097152) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedPostMuteAudio;
            MobileOfficialAppsFeedStat$TypeFeedPostPauseAudio mobileOfficialAppsFeedStat$TypeFeedPostPauseAudio3 = (i6 & 4194304) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedPostPauseAudio;
            MobileOfficialAppsFeedStat$TypeFeedPostOpenAudio mobileOfficialAppsFeedStat$TypeFeedPostOpenAudio3 = (i6 & 8388608) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedPostOpenAudio;
            MobileOfficialAppsFeedStat$TypeFeedPostAddedAudio mobileOfficialAppsFeedStat$TypeFeedPostAddedAudio3 = (i6 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedPostAddedAudio;
            MobileOfficialAppsFeedStat$TypeFeedPostRemovedAudio mobileOfficialAppsFeedStat$TypeFeedPostRemovedAudio3 = (i6 & 33554432) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedPostRemovedAudio;
            MobileOfficialAppsFeedStat$TypeFeedPostOpenPlaylist mobileOfficialAppsFeedStat$TypeFeedPostOpenPlaylist3 = (i6 & 67108864) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedPostOpenPlaylist;
            MobileOfficialAppsFeedStat$TypeFeedPostAddedPlaylist mobileOfficialAppsFeedStat$TypeFeedPostAddedPlaylist3 = (i6 & 134217728) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedPostAddedPlaylist;
            MobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist mobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist3 = (i6 & 268435456) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist;
            MobileOfficialAppsFeedStat$TypeFeedCoownersEvent mobileOfficialAppsFeedStat$TypeFeedCoownersEvent3 = (i6 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedCoownersEvent;
            MobileOfficialAppsFeedStat$TypeFeedViewAuthors mobileOfficialAppsFeedStat$TypeFeedViewAuthors3 = (i6 & 1073741824) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedViewAuthors;
            MobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors mobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors3 = (i6 & Integer.MIN_VALUE) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors;
            MobileOfficialAppsFeedStat$TypeActionButtonClick mobileOfficialAppsFeedStat$TypeActionButtonClick3 = (i7 & 1) != 0 ? null : mobileOfficialAppsFeedStat$TypeActionButtonClick;
            n0 n0Var3 = (i7 & 2) != 0 ? null : n0Var;
            MobileOfficialAppsVideoStat$TypeTvQrModalAction mobileOfficialAppsVideoStat$TypeTvQrModalAction3 = (i7 & 4) != 0 ? null : mobileOfficialAppsVideoStat$TypeTvQrModalAction;
            MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingItem mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingItem3 = (i7 & 8) != 0 ? null : mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingItem;
            MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem3 = (i7 & 16) != 0 ? null : mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem;
            j0 j0Var3 = (i7 & 32) != 0 ? null : j0Var;
            MobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick mobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick3 = (i7 & 64) != 0 ? null : mobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick;
            MobileOfficialAppsSharingStat$TypeModalSharingOpen mobileOfficialAppsSharingStat$TypeModalSharingOpen4 = mobileOfficialAppsSharingStat$TypeModalSharingOpen3;
            MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick mobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick3 = (i7 & 128) != 0 ? null : mobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick;
            MobileOfficialAppsVideoStat$TypeSkipVideoButtonClick mobileOfficialAppsVideoStat$TypeSkipVideoButtonClick3 = (i7 & 256) != 0 ? null : mobileOfficialAppsVideoStat$TypeSkipVideoButtonClick;
            CommonVideoStat$TypeNextVideoAnnouncement commonVideoStat$TypeNextVideoAnnouncement3 = (i7 & 512) != 0 ? null : commonVideoStat$TypeNextVideoAnnouncement;
            if ((i7 & 1024) != 0) {
                mobileOfficialAppsVideoStat$TypeVideoToggleFullscreen2 = null;
                schemeStat$TypeBadgesItem2 = schemeStat$TypeBadgesItem3;
                schemeStat$TypeWishlistItem2 = schemeStat$TypeWishlistItem3;
                schemeStat$TypeOwnerButtonAppClick2 = schemeStat$TypeOwnerButtonAppClick3;
                c0Var2 = c0Var3;
                mobileOfficialAppsSuperappStat$TypeSuperappOnboardingClickItem2 = mobileOfficialAppsSuperappStat$TypeSuperappOnboardingClickItem3;
                mobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem2 = mobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem3;
                mobileOfficialAppsProfileStat$TypeProfileItem2 = mobileOfficialAppsProfileStat$TypeProfileItem3;
                commonCommunitiesStat$TypeChannelItemClick2 = commonCommunitiesStat$TypeChannelItemClick4;
                mobileOfficialAppsFeedStat$TypeHiddenSourceOpenProfile2 = mobileOfficialAppsFeedStat$TypeHiddenSourceOpenProfile3;
                mobileOfficialAppsFeedStat$TypeHiddenSourceUnbanButton2 = mobileOfficialAppsFeedStat$TypeHiddenSourceUnbanButton3;
                mobileOfficialAppsFeedStat$TypeHiddenSourceUnbanCancelButton2 = mobileOfficialAppsFeedStat$TypeHiddenSourceUnbanCancelButton3;
                mobileOfficialAppsFeedStat$TypeFeedCarouselLongtap2 = mobileOfficialAppsFeedStat$TypeFeedCarouselLongtap3;
                mobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll2 = mobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll3;
                mobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingScroll2 = mobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingScroll3;
                commonCommunitiesStat$TypeCommunityOnboardingClick2 = commonCommunitiesStat$TypeCommunityOnboardingClick3;
                mobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick2 = mobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick4;
                mobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem2 = mobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem3;
                mobileOfficialAppsVideoStat$TypeVideoCommentClick2 = mobileOfficialAppsVideoStat$TypeVideoCommentClick3;
                mobileOfficialAppsVideoStat$TypeVideoScreenCommentClick2 = mobileOfficialAppsVideoStat$TypeVideoScreenCommentClick3;
                mobileOfficialAppsVideoStat$TypeVideoCommentsSortTabClick2 = mobileOfficialAppsVideoStat$TypeVideoCommentsSortTabClick3;
                mobileOfficialAppsVideoStat$TypeVideoDiscoveryLogoClick2 = mobileOfficialAppsVideoStat$TypeVideoDiscoveryLogoClick3;
                mobileOfficialAppsVideoStat$TypeVideoPushesAdClick2 = mobileOfficialAppsVideoStat$TypeVideoPushesAdClick3;
                mobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator2 = mobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator3;
                mobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator2 = mobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator4;
                mobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick2 = mobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick3;
                mobileOfficialAppsFeedStat$TypeFeedTicketItemClick2 = mobileOfficialAppsFeedStat$TypeFeedTicketItemClick3;
                mobileOfficialAppsFeedStat$TypeFeedShowProductsModalCardClick2 = mobileOfficialAppsFeedStat$TypeFeedShowProductsModalCardClick3;
                mobileOfficialAppsFeedStat$TypeFeedFollowClick2 = mobileOfficialAppsFeedStat$TypeFeedFollowClick3;
                mobileOfficialAppsFeedStat$TypeFeedUnfollowClick2 = mobileOfficialAppsFeedStat$TypeFeedUnfollowClick3;
                mobileOfficialAppsFeedStat$TypeFeedPostExpandText2 = mobileOfficialAppsFeedStat$TypeFeedPostExpandText3;
                a0Var2 = a0Var3;
                mobileOfficialAppsSharingStat$TypeModalSharingOpen2 = mobileOfficialAppsSharingStat$TypeModalSharingOpen4;
                mobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick2 = mobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick3;
                mobileOfficialAppsVideoStat$TypeSkipVideoButtonClick2 = mobileOfficialAppsVideoStat$TypeSkipVideoButtonClick3;
                commonVideoStat$TypeNextVideoAnnouncement2 = commonVideoStat$TypeNextVideoAnnouncement3;
                mobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem2 = mobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem3;
                mobileOfficialAppsFeedStat$TypePhotoSaveToAlbumMenuItem2 = mobileOfficialAppsFeedStat$TypePhotoSaveToAlbumMenuItem3;
                l0Var2 = l0Var3;
                mobileOfficialAppsNotificationsStat$TypeNotificationItemClick2 = mobileOfficialAppsNotificationsStat$TypeNotificationItemClick3;
                mobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors2 = mobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors3;
                schemeStat$TypeImItem2 = schemeStat$TypeImItem3;
                mobileOfficialAppsSharingStat$TypeModalSharingClick2 = mobileOfficialAppsSharingStat$TypeModalSharingClick3;
                schemeStat$TypeMarketItem2 = schemeStat$TypeMarketItem3;
                mobileOfficialAppsSharingStat$TypeModalSharingClose2 = mobileOfficialAppsSharingStat$TypeModalSharingClose3;
                schemeStat$TypeMarketMarketplaceItem2 = schemeStat$TypeMarketMarketplaceItem3;
                mobileOfficialAppsVideoStat$TypeVideoModalSharingClick2 = mobileOfficialAppsVideoStat$TypeVideoModalSharingClick3;
                schemeStat$TypeSuperappScreenItem2 = schemeStat$TypeSuperappScreenItem3;
                mobileOfficialAppsVideoStat$TypeTvKidModeItem2 = mobileOfficialAppsVideoStat$TypeTvKidModeItem3;
                schemeStat$TypeMiniAppItem2 = schemeStat$TypeMiniAppItem3;
                mobileOfficialAppsImStat$TypeOpenCommunityChats2 = mobileOfficialAppsImStat$TypeOpenCommunityChats3;
                commonVideoStat$TypeVideoCardEvent2 = commonVideoStat$TypeVideoCardEvent3;
                mobileOfficialAppsFeedStat$TypeFeedPostUnmuteAudio2 = mobileOfficialAppsFeedStat$TypeFeedPostUnmuteAudio3;
                schemeStat$TypeClickItem2 = schemeStat$TypeClickItem3;
                mobileOfficialAppsFeedStat$TypeFeedPostMuteAudio2 = mobileOfficialAppsFeedStat$TypeFeedPostMuteAudio3;
                schemeStat$TypeGamesCatalogClick2 = schemeStat$TypeGamesCatalogClick3;
                mobileOfficialAppsVideoStat$TypeVideoCardLongtap2 = mobileOfficialAppsVideoStat$TypeVideoCardLongtap3;
                schemeStat$TypeClickPreferenceItem2 = schemeStat$TypeClickPreferenceItem3;
                mobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem2 = mobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem3;
                schemeStat$TypeClickPreferenceValueItem2 = schemeStat$TypeClickPreferenceValueItem3;
                mobileOfficialAppsVideoStat$TypeSoftUpdateClick2 = mobileOfficialAppsVideoStat$TypeSoftUpdateClick3;
                mobileOfficialAppsFeedStat$TypeFeedInteractionItem2 = mobileOfficialAppsFeedStat$TypeFeedInteractionItem3;
                commonVideoAdsStat$TypeOverlayAdClick2 = commonVideoAdsStat$TypeOverlayAdClick3;
                commonOnboardingStat$TypeUiHintItem2 = commonOnboardingStat$TypeUiHintItem3;
                schemeStat$TypeClipViewerItem2 = schemeStat$TypeClipViewerItem3;
                mobileOfficialAppsVideoStat$TypeVideoPlayerCastClick2 = mobileOfficialAppsVideoStat$TypeVideoPlayerCastClick3;
                mobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick2 = mobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick3;
                mobileOfficialAppsVideoStat$TypeVideoToClipAttach2 = mobileOfficialAppsVideoStat$TypeVideoToClipAttach3;
                mobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem2 = mobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem3;
                commonVideoStat$TypeVideoCreateClip2 = commonVideoStat$TypeVideoCreateClip3;
                commonVideoStat$TypeClickToAuthorCommunity2 = commonVideoStat$TypeClickToAuthorCommunity3;
                mobileOfficialAppsClipsStat$TypeClipsGridItem2 = mobileOfficialAppsClipsStat$TypeClipsGridItem3;
                mobileOfficialAppsVideoStat$TypeVideoTvProgram2 = mobileOfficialAppsVideoStat$TypeVideoTvProgram3;
                mobileOfficialAppsVideoStat$TypeVideoWatchLater2 = mobileOfficialAppsVideoStat$TypeVideoWatchLater3;
                schemeStat$TypeVideoBackgroundListeningItem2 = schemeStat$TypeVideoBackgroundListeningItem3;
                commonVideoStat$TypeVideoClickWithActivePlayer2 = commonVideoStat$TypeVideoClickWithActivePlayer3;
                mobileOfficialAppsSearchStat$TypeSearchClickItem2 = mobileOfficialAppsSearchStat$TypeSearchClickItem3;
                commonSearchStat$TypeSearchLocalClickItem2 = commonSearchStat$TypeSearchLocalClickItem3;
                schemeStat$TypeClassifiedsClick2 = schemeStat$TypeClassifiedsClick3;
                schemeStat$TypeAliexpressClick2 = schemeStat$TypeAliexpressClick3;
                mobileOfficialAppsFeedStat$TypeMarketCarouselClick2 = mobileOfficialAppsFeedStat$TypeMarketCarouselClick3;
                mobileOfficialAppsFeedStat$TypeFeedClickToShopsMoreButton2 = mobileOfficialAppsFeedStat$TypeFeedClickToShopsMoreButton3;
                mobileOfficialAppsMarketStat$TypeMarketClick2 = mobileOfficialAppsMarketStat$TypeMarketClick3;
                schemeStat$TypeMessagingContactRecommendationsItem2 = schemeStat$TypeMessagingContactRecommendationsItem3;
                mobileOfficialAppsImStat$TypeImConversationClickItem2 = mobileOfficialAppsImStat$TypeImConversationClickItem3;
                schemeStat$TypeMessagingSyncContactsClickItem2 = schemeStat$TypeMessagingSyncContactsClickItem3;
                mobileOfficialAppsImStat$TypeImGoToProfileClickItem2 = mobileOfficialAppsImStat$TypeImGoToProfileClickItem3;
                mobileOfficialAppsImStat$TypeImPhoneNumberCallClickItem2 = mobileOfficialAppsImStat$TypeImPhoneNumberCallClickItem3;
                mobileOfficialAppsImStat$TypeImGoArchiveClickItem2 = mobileOfficialAppsImStat$TypeImGoArchiveClickItem3;
                mobileOfficialAppsImStat$TypeImPinnedMessageClickItem2 = mobileOfficialAppsImStat$TypeImPinnedMessageClickItem3;
                schemeStat$TypeImChatItem2 = schemeStat$TypeImChatItem3;
                schemeStat$TypeProfileActionButtonItem2 = schemeStat$TypeProfileActionButtonItem3;
                schemeStat$TypeShareItem2 = schemeStat$TypeShareItem3;
                mobileOfficialAppsSharingStat$TypeSharingLinkOpen2 = mobileOfficialAppsSharingStat$TypeSharingLinkOpen3;
                schemeStat$TypeQuestionItem2 = schemeStat$TypeQuestionItem3;
                mobileOfficialAppsGroupsStat$TypeGroupsEventItem2 = mobileOfficialAppsGroupsStat$TypeGroupsEventItem3;
                mobileOfficialAppsStickersStat$TypeStickersClickItem2 = mobileOfficialAppsStickersStat$TypeStickersClickItem3;
                commonMarketStat$TypeRatingClick2 = commonMarketStat$TypeRatingClick3;
                mobileOfficialAppsCallsStat$TypeCallsItem2 = mobileOfficialAppsCallsStat$TypeCallsItem3;
                mobileOfficialAppsEcommStat$TypeAdminTipsClick2 = mobileOfficialAppsEcommStat$TypeAdminTipsClick3;
                mobileOfficialAppsNftStat$TypeNftItem2 = mobileOfficialAppsNftStat$TypeNftItem3;
                mobileOfficialAppsFeedStat$TypeFeedMediaDiscoverItem2 = mobileOfficialAppsFeedStat$TypeFeedMediaDiscoverItem3;
                mobileOfficialAppsFeedStat$TypeFeedMediaDiscoverBlock2 = mobileOfficialAppsFeedStat$TypeFeedMediaDiscoverBlock3;
                mobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts2 = mobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts3;
                mobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal2 = mobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal3;
                mobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal2 = mobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal3;
                mobileOfficialAppsFeedStat$TypeFeedStartFastChat2 = mobileOfficialAppsFeedStat$TypeFeedStartFastChat3;
                mobileOfficialAppsFeedStat$TypeFeedCommentThreadButtonShowMore2 = mobileOfficialAppsFeedStat$TypeFeedCommentThreadButtonShowMore3;
                mobileOfficialAppsFeedStat$TypeFeedCommunityMediaItem2 = mobileOfficialAppsFeedStat$TypeFeedCommunityMediaItem3;
                mobileOfficialAppsFeedStat$TypeFeedItemMenuAction2 = mobileOfficialAppsFeedStat$TypeFeedItemMenuAction3;
                mobileOfficialAppsFeedStat$TypeFeedOpenItem2 = mobileOfficialAppsFeedStat$TypeFeedOpenItem3;
                mobileOfficialAppsFeedStat$TypePhotoShareToMessageItem2 = mobileOfficialAppsFeedStat$TypePhotoShareToMessageItem3;
                mobileOfficialAppsFeedStat$TypeObsceneWord2 = mobileOfficialAppsFeedStat$TypeObsceneWord3;
                mobileOfficialAppsFeedStat$TypeRevealObsceneWords2 = mobileOfficialAppsFeedStat$TypeRevealObsceneWords3;
                commonVasStat$TypeBadgesScreenItem2 = commonVasStat$TypeBadgesScreenItem3;
                mobileOfficialAppsFeedStat$TypeDzenStoryClick2 = mobileOfficialAppsFeedStat$TypeDzenStoryClick3;
                mobileOfficialAppsFeedStat$TypeDzenStoryItemClick2 = mobileOfficialAppsFeedStat$TypeDzenStoryItemClick3;
                mobileOfficialAppsFeedStat$TypeDzenShowMoreClick2 = mobileOfficialAppsFeedStat$TypeDzenShowMoreClick3;
                mobileOfficialAppsSocGraphStat$FollowersModeSwitchState2 = mobileOfficialAppsSocGraphStat$FollowersModeSwitchState3;
                mobileOfficialAppsConPostingStat$TypePostingItem2 = mobileOfficialAppsConPostingStat$TypePostingItem3;
                commonMarketStat$TypeMarketItemReviewClick2 = commonMarketStat$TypeMarketItemReviewClick3;
                mobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem2 = mobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem3;
                mobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem2 = mobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem3;
                commonCommunitiesStat$TypeCommunityReviewClick2 = commonCommunitiesStat$TypeCommunityReviewClick3;
                mobileOfficialAppsConPhotosStat$TypePhotosItem2 = mobileOfficialAppsConPhotosStat$TypePhotosItem3;
                tVar2 = tVar3;
                commonVasStat$TypeUgcStickersItem2 = commonVasStat$TypeUgcStickersItem3;
                mobileOfficialAppsEcommStat$TypeBannerClick2 = mobileOfficialAppsEcommStat$TypeBannerClick3;
                mobileOfficialAppsVideoStat$TypeVideoInAppReviewClick2 = mobileOfficialAppsVideoStat$TypeVideoInAppReviewClick3;
                mobileOfficialAppsVideoStat$TypeSystemPushClick2 = mobileOfficialAppsVideoStat$TypeSystemPushClick3;
                mobileOfficialAppsVideoStat$TypeAutoplayTurnClick2 = mobileOfficialAppsVideoStat$TypeAutoplayTurnClick3;
                commonEcommStat$TypeEcommClickItem2 = commonEcommStat$TypeEcommClickItem3;
                mobileOfficialAppsVideoStat$TypeVideoSuggestDownloadsClick2 = mobileOfficialAppsVideoStat$TypeVideoSuggestDownloadsClick3;
                mobileOfficialAppsVideoStat$TypeVideoKidsModeClick2 = mobileOfficialAppsVideoStat$TypeVideoKidsModeClick3;
                p0Var2 = p0Var3;
                mobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick2 = mobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick3;
                mobileOfficialAppsVideoStat$TypeVideoCatalogBlockItemClick2 = mobileOfficialAppsVideoStat$TypeVideoCatalogBlockItemClick3;
                mobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick2 = mobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick3;
                mobileOfficialAppsVideoStat$TypeEndVideoClick2 = mobileOfficialAppsVideoStat$TypeEndVideoClick3;
                mobileOfficialAppsVideoStat$TypeVideoDescriptionClick2 = mobileOfficialAppsVideoStat$TypeVideoDescriptionClick3;
                mobileOfficialAppsVideoStat$TypeVideoDownloadClick2 = mobileOfficialAppsVideoStat$TypeVideoDownloadClick3;
                m0Var2 = m0Var3;
                schemeStat$TypeSnowballEvents2 = schemeStat$TypeSnowballEvents3;
                mobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction2 = mobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction3;
                o0Var2 = o0Var3;
                k0Var2 = k0Var3;
                mobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem2 = mobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem3;
                mobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick2 = mobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick3;
                schemeStat$TypeLegalNoticeClick2 = schemeStat$TypeLegalNoticeClick3;
                commonCommunitiesStat$TypeTabItemClick2 = commonCommunitiesStat$TypeTabItemClick3;
                commonCommunitiesStat$TypeDonutGoal2 = commonCommunitiesStat$TypeDonutGoal3;
                commonCommunitiesStat$TypeDonutClick2 = commonCommunitiesStat$TypeDonutClick3;
                commonCommunitiesStat$TypeDonutBanner2 = commonCommunitiesStat$TypeDonutBanner3;
                commonCommunitiesStat$TypeDonutSupportAuthor2 = commonCommunitiesStat$TypeDonutSupportAuthor3;
                mobileOfficialAppsVideoStat$TypeVideoDirectUrlStartItem2 = mobileOfficialAppsVideoStat$TypeVideoDirectUrlStartItem3;
                mobileOfficialAppsPromoStat$TypePromoClickItem2 = mobileOfficialAppsPromoStat$TypePromoClickItem3;
                commonOnboardingStat$TypeOnboardingEvent2 = commonOnboardingStat$TypeOnboardingEvent3;
                mobileOfficialAppsFeedStat$TypeFeedOpenUserClick2 = mobileOfficialAppsFeedStat$TypeFeedOpenUserClick3;
                mobileOfficialAppsFeedStat$TypeFeedOpenGroupClick2 = mobileOfficialAppsFeedStat$TypeFeedOpenGroupClick3;
                mobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemUserClick2 = mobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemUserClick3;
                mobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick2 = mobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick3;
                mobileOfficialAppsFeedStat$TypeFeedOpenStoryClick2 = mobileOfficialAppsFeedStat$TypeFeedOpenStoryClick3;
                mobileOfficialAppsFeedStat$TypeFeedHideProductPinClick2 = mobileOfficialAppsFeedStat$TypeFeedHideProductPinClick3;
                mobileOfficialAppsFeedStat$TypeFeedHideTicketItemPin2 = mobileOfficialAppsFeedStat$TypeFeedHideTicketItemPin3;
                mobileOfficialAppsFeedStat$TypeFeedPostPauseAudio2 = mobileOfficialAppsFeedStat$TypeFeedPostPauseAudio3;
                mobileOfficialAppsFeedStat$TypeFeedPostOpenAudio2 = mobileOfficialAppsFeedStat$TypeFeedPostOpenAudio3;
                mobileOfficialAppsFeedStat$TypeFeedPostAddedAudio2 = mobileOfficialAppsFeedStat$TypeFeedPostAddedAudio3;
                mobileOfficialAppsFeedStat$TypeFeedPostRemovedAudio2 = mobileOfficialAppsFeedStat$TypeFeedPostRemovedAudio3;
                mobileOfficialAppsFeedStat$TypeFeedPostOpenPlaylist2 = mobileOfficialAppsFeedStat$TypeFeedPostOpenPlaylist3;
                mobileOfficialAppsFeedStat$TypeFeedPostAddedPlaylist2 = mobileOfficialAppsFeedStat$TypeFeedPostAddedPlaylist3;
                mobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist2 = mobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist3;
                mobileOfficialAppsFeedStat$TypeFeedCoownersEvent2 = mobileOfficialAppsFeedStat$TypeFeedCoownersEvent3;
                mobileOfficialAppsFeedStat$TypeFeedViewAuthors2 = mobileOfficialAppsFeedStat$TypeFeedViewAuthors3;
                mobileOfficialAppsFeedStat$TypeActionButtonClick2 = mobileOfficialAppsFeedStat$TypeActionButtonClick3;
                n0Var2 = n0Var3;
                mobileOfficialAppsVideoStat$TypeTvQrModalAction2 = mobileOfficialAppsVideoStat$TypeTvQrModalAction3;
                mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingItem2 = mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingItem3;
                mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem2 = mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem3;
                j0Var2 = j0Var3;
                mobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick2 = mobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick3;
                commonAudioStat$TypeAudioPopupItem2 = commonAudioStat$TypeAudioPopupItem3;
                mobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick2 = mobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick4;
                schemeStat$TypeSuperappSettingsItem2 = schemeStat$TypeSuperappSettingsItem3;
                mobileOfficialAppsMarusiaStat$TypeConversationItem2 = mobileOfficialAppsMarusiaStat$TypeConversationItem3;
                mobileOfficialAppsMarusiaStat$TypeReadingItem2 = mobileOfficialAppsMarusiaStat$TypeReadingItem3;
                schemeStat$TypeVideoPipItem2 = schemeStat$TypeVideoPipItem3;
                schemeStat$TypeVideoMiniplayerItem2 = schemeStat$TypeVideoMiniplayerItem3;
                mobileOfficialAppsVideoStat$TypeVideoDownloadItem2 = mobileOfficialAppsVideoStat$TypeVideoDownloadItem3;
                mobileOfficialAppsVideoStat$TypeVideoNotInteresting2 = mobileOfficialAppsVideoStat$TypeVideoNotInteresting3;
                mobileOfficialAppsVideoStat$TypeVideoDoNotRecommendAuthor2 = mobileOfficialAppsVideoStat$TypeVideoDoNotRecommendAuthor4;
                commonAudioStat$TypeAudioTapPopupEventItem2 = commonAudioStat$TypeAudioTapPopupEventItem3;
                mobileOfficialAppsFeedStat$TypeDzenBlockArticleClick2 = mobileOfficialAppsFeedStat$TypeDzenBlockArticleClick3;
                mobileOfficialAppsConDzenStat$TypeDzenArticleItem2 = mobileOfficialAppsConDzenStat$TypeDzenArticleItem3;
                commonAudioStat$TypeAudioTapGotoEventItem2 = commonAudioStat$TypeAudioTapGotoEventItem3;
                mobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem2 = mobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem3;
                commonAudioStat$TypeAudioTapEqualizerEventItem2 = commonAudioStat$TypeAudioTapEqualizerEventItem3;
                mobileOfficialAppsVideoStat$TypeCloseCastConnectOfferModal2 = mobileOfficialAppsVideoStat$TypeCloseCastConnectOfferModal3;
                commonAudioStat$TypeAudioTapSettingsEventItem2 = commonAudioStat$TypeAudioTapSettingsEventItem3;
                commonAudioStat$TypeAudioArtistClickItem2 = commonAudioStat$TypeAudioArtistClickItem3;
                schemeStat$TypeNavigationTabClick2 = schemeStat$TypeNavigationTabClick3;
                type2 = type3;
                schemeStat$EventItem2 = schemeStat$EventItem;
                num2 = num4;
            } else {
                mobileOfficialAppsVideoStat$TypeVideoToggleFullscreen2 = mobileOfficialAppsVideoStat$TypeVideoToggleFullscreen;
                schemeStat$TypeBadgesItem2 = schemeStat$TypeBadgesItem3;
                schemeStat$TypeWishlistItem2 = schemeStat$TypeWishlistItem3;
                schemeStat$TypeOwnerButtonAppClick2 = schemeStat$TypeOwnerButtonAppClick3;
                c0Var2 = c0Var3;
                mobileOfficialAppsSuperappStat$TypeSuperappOnboardingClickItem2 = mobileOfficialAppsSuperappStat$TypeSuperappOnboardingClickItem3;
                mobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem2 = mobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem3;
                mobileOfficialAppsProfileStat$TypeProfileItem2 = mobileOfficialAppsProfileStat$TypeProfileItem3;
                commonCommunitiesStat$TypeChannelItemClick2 = commonCommunitiesStat$TypeChannelItemClick4;
                mobileOfficialAppsFeedStat$TypeHiddenSourceOpenProfile2 = mobileOfficialAppsFeedStat$TypeHiddenSourceOpenProfile3;
                mobileOfficialAppsFeedStat$TypeHiddenSourceUnbanButton2 = mobileOfficialAppsFeedStat$TypeHiddenSourceUnbanButton3;
                mobileOfficialAppsFeedStat$TypeHiddenSourceUnbanCancelButton2 = mobileOfficialAppsFeedStat$TypeHiddenSourceUnbanCancelButton3;
                mobileOfficialAppsFeedStat$TypeFeedCarouselLongtap2 = mobileOfficialAppsFeedStat$TypeFeedCarouselLongtap3;
                mobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll2 = mobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll3;
                mobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingScroll2 = mobileOfficialAppsFeedStat$TypeFeedCarouselOnboardingScroll3;
                commonCommunitiesStat$TypeCommunityOnboardingClick2 = commonCommunitiesStat$TypeCommunityOnboardingClick3;
                mobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick2 = mobileOfficialAppsSocGraphStat$FollowersModeOnboardingClick4;
                mobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem2 = mobileOfficialAppsVideoStat$TypeVideoRestrictionClickItem3;
                mobileOfficialAppsVideoStat$TypeVideoCommentClick2 = mobileOfficialAppsVideoStat$TypeVideoCommentClick3;
                mobileOfficialAppsVideoStat$TypeVideoScreenCommentClick2 = mobileOfficialAppsVideoStat$TypeVideoScreenCommentClick3;
                mobileOfficialAppsVideoStat$TypeVideoCommentsSortTabClick2 = mobileOfficialAppsVideoStat$TypeVideoCommentsSortTabClick3;
                mobileOfficialAppsVideoStat$TypeVideoDiscoveryLogoClick2 = mobileOfficialAppsVideoStat$TypeVideoDiscoveryLogoClick3;
                mobileOfficialAppsVideoStat$TypeVideoPushesAdClick2 = mobileOfficialAppsVideoStat$TypeVideoPushesAdClick3;
                mobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator2 = mobileOfficialAppsVideoStat$TypeVideoStopRecommendingCreator3;
                mobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator2 = mobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator4;
                mobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick2 = mobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick3;
                mobileOfficialAppsFeedStat$TypeFeedTicketItemClick2 = mobileOfficialAppsFeedStat$TypeFeedTicketItemClick3;
                mobileOfficialAppsFeedStat$TypeFeedShowProductsModalCardClick2 = mobileOfficialAppsFeedStat$TypeFeedShowProductsModalCardClick3;
                mobileOfficialAppsFeedStat$TypeFeedFollowClick2 = mobileOfficialAppsFeedStat$TypeFeedFollowClick3;
                mobileOfficialAppsFeedStat$TypeFeedUnfollowClick2 = mobileOfficialAppsFeedStat$TypeFeedUnfollowClick3;
                mobileOfficialAppsFeedStat$TypeFeedPostExpandText2 = mobileOfficialAppsFeedStat$TypeFeedPostExpandText3;
                a0Var2 = a0Var3;
                mobileOfficialAppsSharingStat$TypeModalSharingOpen2 = mobileOfficialAppsSharingStat$TypeModalSharingOpen4;
                mobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick2 = mobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick3;
                commonVideoStat$TypeNextVideoAnnouncement2 = commonVideoStat$TypeNextVideoAnnouncement3;
                mobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem2 = mobileOfficialAppsImStat$TypeImShareFromChatProfileClickItem3;
                mobileOfficialAppsFeedStat$TypePhotoSaveToAlbumMenuItem2 = mobileOfficialAppsFeedStat$TypePhotoSaveToAlbumMenuItem3;
                l0Var2 = l0Var3;
                mobileOfficialAppsNotificationsStat$TypeNotificationItemClick2 = mobileOfficialAppsNotificationsStat$TypeNotificationItemClick3;
                mobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors2 = mobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors3;
                schemeStat$TypeImItem2 = schemeStat$TypeImItem3;
                mobileOfficialAppsSharingStat$TypeModalSharingClick2 = mobileOfficialAppsSharingStat$TypeModalSharingClick3;
                schemeStat$TypeMarketItem2 = schemeStat$TypeMarketItem3;
                mobileOfficialAppsSharingStat$TypeModalSharingClose2 = mobileOfficialAppsSharingStat$TypeModalSharingClose3;
                schemeStat$TypeMarketMarketplaceItem2 = schemeStat$TypeMarketMarketplaceItem3;
                mobileOfficialAppsVideoStat$TypeVideoModalSharingClick2 = mobileOfficialAppsVideoStat$TypeVideoModalSharingClick3;
                schemeStat$TypeSuperappScreenItem2 = schemeStat$TypeSuperappScreenItem3;
                mobileOfficialAppsVideoStat$TypeTvKidModeItem2 = mobileOfficialAppsVideoStat$TypeTvKidModeItem3;
                schemeStat$TypeMiniAppItem2 = schemeStat$TypeMiniAppItem3;
                mobileOfficialAppsImStat$TypeOpenCommunityChats2 = mobileOfficialAppsImStat$TypeOpenCommunityChats3;
                commonVideoStat$TypeVideoCardEvent2 = commonVideoStat$TypeVideoCardEvent3;
                mobileOfficialAppsFeedStat$TypeFeedPostUnmuteAudio2 = mobileOfficialAppsFeedStat$TypeFeedPostUnmuteAudio3;
                schemeStat$TypeClickItem2 = schemeStat$TypeClickItem3;
                mobileOfficialAppsFeedStat$TypeFeedPostMuteAudio2 = mobileOfficialAppsFeedStat$TypeFeedPostMuteAudio3;
                schemeStat$TypeGamesCatalogClick2 = schemeStat$TypeGamesCatalogClick3;
                mobileOfficialAppsVideoStat$TypeVideoCardLongtap2 = mobileOfficialAppsVideoStat$TypeVideoCardLongtap3;
                schemeStat$TypeClickPreferenceItem2 = schemeStat$TypeClickPreferenceItem3;
                mobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem2 = mobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem3;
                schemeStat$TypeClickPreferenceValueItem2 = schemeStat$TypeClickPreferenceValueItem3;
                mobileOfficialAppsVideoStat$TypeSoftUpdateClick2 = mobileOfficialAppsVideoStat$TypeSoftUpdateClick3;
                mobileOfficialAppsFeedStat$TypeFeedInteractionItem2 = mobileOfficialAppsFeedStat$TypeFeedInteractionItem3;
                commonVideoAdsStat$TypeOverlayAdClick2 = commonVideoAdsStat$TypeOverlayAdClick3;
                commonOnboardingStat$TypeUiHintItem2 = commonOnboardingStat$TypeUiHintItem3;
                schemeStat$TypeClipViewerItem2 = schemeStat$TypeClipViewerItem3;
                mobileOfficialAppsVideoStat$TypeVideoPlayerCastClick2 = mobileOfficialAppsVideoStat$TypeVideoPlayerCastClick3;
                mobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick2 = mobileOfficialAppsVideoStat$TypeVideoPlayerSeekClick3;
                mobileOfficialAppsVideoStat$TypeVideoToClipAttach2 = mobileOfficialAppsVideoStat$TypeVideoToClipAttach3;
                mobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem2 = mobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem3;
                commonVideoStat$TypeVideoCreateClip2 = commonVideoStat$TypeVideoCreateClip3;
                commonVideoStat$TypeClickToAuthorCommunity2 = commonVideoStat$TypeClickToAuthorCommunity3;
                mobileOfficialAppsClipsStat$TypeClipsGridItem2 = mobileOfficialAppsClipsStat$TypeClipsGridItem3;
                mobileOfficialAppsVideoStat$TypeVideoTvProgram2 = mobileOfficialAppsVideoStat$TypeVideoTvProgram3;
                mobileOfficialAppsVideoStat$TypeVideoWatchLater2 = mobileOfficialAppsVideoStat$TypeVideoWatchLater3;
                schemeStat$TypeVideoBackgroundListeningItem2 = schemeStat$TypeVideoBackgroundListeningItem3;
                commonVideoStat$TypeVideoClickWithActivePlayer2 = commonVideoStat$TypeVideoClickWithActivePlayer3;
                mobileOfficialAppsSearchStat$TypeSearchClickItem2 = mobileOfficialAppsSearchStat$TypeSearchClickItem3;
                commonSearchStat$TypeSearchLocalClickItem2 = commonSearchStat$TypeSearchLocalClickItem3;
                schemeStat$TypeClassifiedsClick2 = schemeStat$TypeClassifiedsClick3;
                schemeStat$TypeAliexpressClick2 = schemeStat$TypeAliexpressClick3;
                mobileOfficialAppsFeedStat$TypeMarketCarouselClick2 = mobileOfficialAppsFeedStat$TypeMarketCarouselClick3;
                mobileOfficialAppsFeedStat$TypeFeedClickToShopsMoreButton2 = mobileOfficialAppsFeedStat$TypeFeedClickToShopsMoreButton3;
                mobileOfficialAppsMarketStat$TypeMarketClick2 = mobileOfficialAppsMarketStat$TypeMarketClick3;
                schemeStat$TypeMessagingContactRecommendationsItem2 = schemeStat$TypeMessagingContactRecommendationsItem3;
                mobileOfficialAppsImStat$TypeImConversationClickItem2 = mobileOfficialAppsImStat$TypeImConversationClickItem3;
                schemeStat$TypeMessagingSyncContactsClickItem2 = schemeStat$TypeMessagingSyncContactsClickItem3;
                mobileOfficialAppsImStat$TypeImGoToProfileClickItem2 = mobileOfficialAppsImStat$TypeImGoToProfileClickItem3;
                mobileOfficialAppsImStat$TypeImPhoneNumberCallClickItem2 = mobileOfficialAppsImStat$TypeImPhoneNumberCallClickItem3;
                mobileOfficialAppsImStat$TypeImGoArchiveClickItem2 = mobileOfficialAppsImStat$TypeImGoArchiveClickItem3;
                mobileOfficialAppsImStat$TypeImPinnedMessageClickItem2 = mobileOfficialAppsImStat$TypeImPinnedMessageClickItem3;
                schemeStat$TypeImChatItem2 = schemeStat$TypeImChatItem3;
                schemeStat$TypeProfileActionButtonItem2 = schemeStat$TypeProfileActionButtonItem3;
                schemeStat$TypeShareItem2 = schemeStat$TypeShareItem3;
                mobileOfficialAppsSharingStat$TypeSharingLinkOpen2 = mobileOfficialAppsSharingStat$TypeSharingLinkOpen3;
                schemeStat$TypeQuestionItem2 = schemeStat$TypeQuestionItem3;
                mobileOfficialAppsGroupsStat$TypeGroupsEventItem2 = mobileOfficialAppsGroupsStat$TypeGroupsEventItem3;
                mobileOfficialAppsStickersStat$TypeStickersClickItem2 = mobileOfficialAppsStickersStat$TypeStickersClickItem3;
                commonMarketStat$TypeRatingClick2 = commonMarketStat$TypeRatingClick3;
                mobileOfficialAppsCallsStat$TypeCallsItem2 = mobileOfficialAppsCallsStat$TypeCallsItem3;
                mobileOfficialAppsEcommStat$TypeAdminTipsClick2 = mobileOfficialAppsEcommStat$TypeAdminTipsClick3;
                mobileOfficialAppsNftStat$TypeNftItem2 = mobileOfficialAppsNftStat$TypeNftItem3;
                mobileOfficialAppsFeedStat$TypeFeedMediaDiscoverItem2 = mobileOfficialAppsFeedStat$TypeFeedMediaDiscoverItem3;
                mobileOfficialAppsFeedStat$TypeFeedMediaDiscoverBlock2 = mobileOfficialAppsFeedStat$TypeFeedMediaDiscoverBlock3;
                mobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts2 = mobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts3;
                mobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal2 = mobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal3;
                mobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal2 = mobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal3;
                mobileOfficialAppsFeedStat$TypeFeedStartFastChat2 = mobileOfficialAppsFeedStat$TypeFeedStartFastChat3;
                mobileOfficialAppsFeedStat$TypeFeedCommentThreadButtonShowMore2 = mobileOfficialAppsFeedStat$TypeFeedCommentThreadButtonShowMore3;
                mobileOfficialAppsFeedStat$TypeFeedCommunityMediaItem2 = mobileOfficialAppsFeedStat$TypeFeedCommunityMediaItem3;
                mobileOfficialAppsFeedStat$TypeFeedItemMenuAction2 = mobileOfficialAppsFeedStat$TypeFeedItemMenuAction3;
                mobileOfficialAppsFeedStat$TypeFeedOpenItem2 = mobileOfficialAppsFeedStat$TypeFeedOpenItem3;
                mobileOfficialAppsFeedStat$TypePhotoShareToMessageItem2 = mobileOfficialAppsFeedStat$TypePhotoShareToMessageItem3;
                mobileOfficialAppsFeedStat$TypeObsceneWord2 = mobileOfficialAppsFeedStat$TypeObsceneWord3;
                mobileOfficialAppsFeedStat$TypeRevealObsceneWords2 = mobileOfficialAppsFeedStat$TypeRevealObsceneWords3;
                commonVasStat$TypeBadgesScreenItem2 = commonVasStat$TypeBadgesScreenItem3;
                mobileOfficialAppsFeedStat$TypeDzenStoryClick2 = mobileOfficialAppsFeedStat$TypeDzenStoryClick3;
                mobileOfficialAppsFeedStat$TypeDzenStoryItemClick2 = mobileOfficialAppsFeedStat$TypeDzenStoryItemClick3;
                mobileOfficialAppsFeedStat$TypeDzenShowMoreClick2 = mobileOfficialAppsFeedStat$TypeDzenShowMoreClick3;
                mobileOfficialAppsSocGraphStat$FollowersModeSwitchState2 = mobileOfficialAppsSocGraphStat$FollowersModeSwitchState3;
                mobileOfficialAppsConPostingStat$TypePostingItem2 = mobileOfficialAppsConPostingStat$TypePostingItem3;
                commonMarketStat$TypeMarketItemReviewClick2 = commonMarketStat$TypeMarketItemReviewClick3;
                mobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem2 = mobileOfficialAppsMiniappsStat$TypeMiniAppPolicyItem3;
                mobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem2 = mobileOfficialAppsMiniappsStat$TypeMiniAppPermissionBoxItem3;
                commonCommunitiesStat$TypeCommunityReviewClick2 = commonCommunitiesStat$TypeCommunityReviewClick3;
                mobileOfficialAppsConPhotosStat$TypePhotosItem2 = mobileOfficialAppsConPhotosStat$TypePhotosItem3;
                tVar2 = tVar3;
                commonVasStat$TypeUgcStickersItem2 = commonVasStat$TypeUgcStickersItem3;
                mobileOfficialAppsEcommStat$TypeBannerClick2 = mobileOfficialAppsEcommStat$TypeBannerClick3;
                mobileOfficialAppsVideoStat$TypeVideoInAppReviewClick2 = mobileOfficialAppsVideoStat$TypeVideoInAppReviewClick3;
                mobileOfficialAppsVideoStat$TypeSystemPushClick2 = mobileOfficialAppsVideoStat$TypeSystemPushClick3;
                mobileOfficialAppsVideoStat$TypeAutoplayTurnClick2 = mobileOfficialAppsVideoStat$TypeAutoplayTurnClick3;
                commonEcommStat$TypeEcommClickItem2 = commonEcommStat$TypeEcommClickItem3;
                mobileOfficialAppsVideoStat$TypeVideoSuggestDownloadsClick2 = mobileOfficialAppsVideoStat$TypeVideoSuggestDownloadsClick3;
                mobileOfficialAppsVideoStat$TypeVideoKidsModeClick2 = mobileOfficialAppsVideoStat$TypeVideoKidsModeClick3;
                p0Var2 = p0Var3;
                mobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick2 = mobileOfficialAppsVideoStat$TypeVideoCatalogButtonExtendedClick3;
                mobileOfficialAppsVideoStat$TypeVideoCatalogBlockItemClick2 = mobileOfficialAppsVideoStat$TypeVideoCatalogBlockItemClick3;
                mobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick2 = mobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick3;
                mobileOfficialAppsVideoStat$TypeEndVideoClick2 = mobileOfficialAppsVideoStat$TypeEndVideoClick3;
                mobileOfficialAppsVideoStat$TypeVideoDescriptionClick2 = mobileOfficialAppsVideoStat$TypeVideoDescriptionClick3;
                mobileOfficialAppsVideoStat$TypeVideoDownloadClick2 = mobileOfficialAppsVideoStat$TypeVideoDownloadClick3;
                m0Var2 = m0Var3;
                schemeStat$TypeSnowballEvents2 = schemeStat$TypeSnowballEvents3;
                mobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction2 = mobileOfficialAppsMiniappsStat$TypeMiniAppSnowballModalAction3;
                o0Var2 = o0Var3;
                k0Var2 = k0Var3;
                mobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem2 = mobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem3;
                mobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick2 = mobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick3;
                schemeStat$TypeLegalNoticeClick2 = schemeStat$TypeLegalNoticeClick3;
                commonCommunitiesStat$TypeTabItemClick2 = commonCommunitiesStat$TypeTabItemClick3;
                commonCommunitiesStat$TypeDonutGoal2 = commonCommunitiesStat$TypeDonutGoal3;
                commonCommunitiesStat$TypeDonutClick2 = commonCommunitiesStat$TypeDonutClick3;
                commonCommunitiesStat$TypeDonutBanner2 = commonCommunitiesStat$TypeDonutBanner3;
                commonCommunitiesStat$TypeDonutSupportAuthor2 = commonCommunitiesStat$TypeDonutSupportAuthor3;
                mobileOfficialAppsVideoStat$TypeVideoDirectUrlStartItem2 = mobileOfficialAppsVideoStat$TypeVideoDirectUrlStartItem3;
                mobileOfficialAppsPromoStat$TypePromoClickItem2 = mobileOfficialAppsPromoStat$TypePromoClickItem3;
                commonOnboardingStat$TypeOnboardingEvent2 = commonOnboardingStat$TypeOnboardingEvent3;
                mobileOfficialAppsFeedStat$TypeFeedOpenUserClick2 = mobileOfficialAppsFeedStat$TypeFeedOpenUserClick3;
                mobileOfficialAppsFeedStat$TypeFeedOpenGroupClick2 = mobileOfficialAppsFeedStat$TypeFeedOpenGroupClick3;
                mobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemUserClick2 = mobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemUserClick3;
                mobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick2 = mobileOfficialAppsFeedStat$TypeFeedOpenRepostedItemGroupClick3;
                mobileOfficialAppsFeedStat$TypeFeedOpenStoryClick2 = mobileOfficialAppsFeedStat$TypeFeedOpenStoryClick3;
                mobileOfficialAppsFeedStat$TypeFeedHideProductPinClick2 = mobileOfficialAppsFeedStat$TypeFeedHideProductPinClick3;
                mobileOfficialAppsFeedStat$TypeFeedHideTicketItemPin2 = mobileOfficialAppsFeedStat$TypeFeedHideTicketItemPin3;
                mobileOfficialAppsFeedStat$TypeFeedPostPauseAudio2 = mobileOfficialAppsFeedStat$TypeFeedPostPauseAudio3;
                mobileOfficialAppsFeedStat$TypeFeedPostOpenAudio2 = mobileOfficialAppsFeedStat$TypeFeedPostOpenAudio3;
                mobileOfficialAppsFeedStat$TypeFeedPostAddedAudio2 = mobileOfficialAppsFeedStat$TypeFeedPostAddedAudio3;
                mobileOfficialAppsFeedStat$TypeFeedPostRemovedAudio2 = mobileOfficialAppsFeedStat$TypeFeedPostRemovedAudio3;
                mobileOfficialAppsFeedStat$TypeFeedPostOpenPlaylist2 = mobileOfficialAppsFeedStat$TypeFeedPostOpenPlaylist3;
                mobileOfficialAppsFeedStat$TypeFeedPostAddedPlaylist2 = mobileOfficialAppsFeedStat$TypeFeedPostAddedPlaylist3;
                mobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist2 = mobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist3;
                mobileOfficialAppsFeedStat$TypeFeedCoownersEvent2 = mobileOfficialAppsFeedStat$TypeFeedCoownersEvent3;
                mobileOfficialAppsFeedStat$TypeFeedViewAuthors2 = mobileOfficialAppsFeedStat$TypeFeedViewAuthors3;
                mobileOfficialAppsFeedStat$TypeActionButtonClick2 = mobileOfficialAppsFeedStat$TypeActionButtonClick3;
                n0Var2 = n0Var3;
                mobileOfficialAppsVideoStat$TypeTvQrModalAction2 = mobileOfficialAppsVideoStat$TypeTvQrModalAction3;
                mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingItem2 = mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsOnboardingItem3;
                mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem2 = mobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem3;
                j0Var2 = j0Var3;
                mobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick2 = mobileOfficialAppsVideoStat$TypeSelectCreatorsScreenConfirmClick3;
                commonAudioStat$TypeAudioPopupItem2 = commonAudioStat$TypeAudioPopupItem3;
                mobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick2 = mobileOfficialAppsVideoStat$TypeVideoPlayerButtonClick4;
                schemeStat$TypeSuperappSettingsItem2 = schemeStat$TypeSuperappSettingsItem3;
                mobileOfficialAppsMarusiaStat$TypeConversationItem2 = mobileOfficialAppsMarusiaStat$TypeConversationItem3;
                mobileOfficialAppsMarusiaStat$TypeReadingItem2 = mobileOfficialAppsMarusiaStat$TypeReadingItem3;
                schemeStat$TypeVideoPipItem2 = schemeStat$TypeVideoPipItem3;
                schemeStat$TypeVideoMiniplayerItem2 = schemeStat$TypeVideoMiniplayerItem3;
                mobileOfficialAppsVideoStat$TypeVideoDownloadItem2 = mobileOfficialAppsVideoStat$TypeVideoDownloadItem3;
                mobileOfficialAppsVideoStat$TypeVideoNotInteresting2 = mobileOfficialAppsVideoStat$TypeVideoNotInteresting3;
                mobileOfficialAppsVideoStat$TypeSkipVideoButtonClick2 = mobileOfficialAppsVideoStat$TypeSkipVideoButtonClick3;
                commonAudioStat$TypeAudioTapPopupEventItem2 = commonAudioStat$TypeAudioTapPopupEventItem3;
                mobileOfficialAppsFeedStat$TypeDzenBlockArticleClick2 = mobileOfficialAppsFeedStat$TypeDzenBlockArticleClick3;
                mobileOfficialAppsConDzenStat$TypeDzenArticleItem2 = mobileOfficialAppsConDzenStat$TypeDzenArticleItem3;
                commonAudioStat$TypeAudioTapGotoEventItem2 = commonAudioStat$TypeAudioTapGotoEventItem3;
                mobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem2 = mobileOfficialAppsFeedStat$TypeFeedPostingSnippetEditItem3;
                commonAudioStat$TypeAudioTapEqualizerEventItem2 = commonAudioStat$TypeAudioTapEqualizerEventItem3;
                mobileOfficialAppsVideoStat$TypeCloseCastConnectOfferModal2 = mobileOfficialAppsVideoStat$TypeCloseCastConnectOfferModal3;
                commonAudioStat$TypeAudioTapSettingsEventItem2 = commonAudioStat$TypeAudioTapSettingsEventItem3;
                commonAudioStat$TypeAudioArtistClickItem2 = commonAudioStat$TypeAudioArtistClickItem3;
                mobileOfficialAppsVideoStat$TypeVideoDoNotRecommendAuthor2 = mobileOfficialAppsVideoStat$TypeVideoDoNotRecommendAuthor4;
                schemeStat$EventItem2 = schemeStat$EventItem;
                num2 = num4;
                schemeStat$TypeNavigationTabClick2 = schemeStat$TypeNavigationTabClick3;
                type2 = type3;
            }
        }
    }
}
