package com.vk.catalog2.common.dto.api;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import org.chromium.base.version_info.VersionConstants;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.methods.users.changePassword.ChangePasswordApiRequestV1;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.e370;
import xsna.epx;
import xsna.ozl;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogViewType.kt */
/* loaded from: classes16.dex */
public final class CatalogViewType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogViewType[] $VALUES;
    public static final a Companion;
    private String debug;
    private final String id;
    public static final CatalogViewType LIST = new CatalogViewType("LIST", 0, "list");
    public static final CatalogViewType HEADER = new CatalogViewType("HEADER", 1, "header");
    public static final CatalogViewType HEADER_COMPACT = new CatalogViewType("HEADER_COMPACT", 2, "header_compact");
    public static final CatalogViewType HEADER_EXTENDED = new CatalogViewType("HEADER_EXTENDED", 3, "header_extended");
    public static final CatalogViewType ARTIST_HEADER = new CatalogViewType("ARTIST_HEADER", 4, "artist_header");
    public static final CatalogViewType HEADER_LARGE = new CatalogViewType("HEADER_LARGE", 5, "header_large");
    public static final CatalogViewType SEPARATOR = new CatalogViewType("SEPARATOR", 6, "separator");
    public static final CatalogViewType SEPARATOR_COMPACT = new CatalogViewType("SEPARATOR_COMPACT", 7, "separator_compact");
    public static final CatalogViewType BUTTON = new CatalogViewType("BUTTON", 8, "button");
    public static final CatalogViewType LARGE_LIST = new CatalogViewType("LARGE_LIST", 9, "large_list");
    public static final CatalogViewType SMALL_LIST = new CatalogViewType("SMALL_LIST", 10, "small_list");
    public static final CatalogViewType HORIZONTAL_BUTTONS_STACK = new CatalogViewType("HORIZONTAL_BUTTONS_STACK", 11, "horizontal_button_stack");
    public static final CatalogViewType DOUBLE_STACKED_LIST = new CatalogViewType("DOUBLE_STACKED_LIST", 12, "double_stacked_list");
    public static final CatalogViewType DOUBLE_STACKED_LIST_MINIMALISTIC_CARD = new CatalogViewType("DOUBLE_STACKED_LIST_MINIMALISTIC_CARD", 13, "double_stacked_list_minimalistic_card");
    public static final CatalogViewType SHORT_DOUBLE_STACKED_LIST = new CatalogViewType("SHORT_DOUBLE_STACKED_LIST", 14, "short_video_double_stacked_list");
    public static final CatalogViewType COMPACT_LIST = new CatalogViewType("COMPACT_LIST", 15, "compact_list");
    public static final CatalogViewType STACKED_LIST = new CatalogViewType("STACKED_LIST", 16, "stacked_list");
    public static final CatalogViewType SHORT_VIDEO_LIST = new CatalogViewType("SHORT_VIDEO_LIST", 17, "short_video_list");
    public static final CatalogViewType SLIDER = new CatalogViewType("SLIDER", 18, "slider");
    public static final CatalogViewType SLIDER_EVENT = new CatalogViewType("SLIDER_EVENT", 19, "slider_event");
    public static final CatalogViewType SLIDER_CARD = new CatalogViewType("SLIDER_CARD", 20, "slider_card");
    public static final CatalogViewType SLIDER_MINIMALISTIC_CARD = new CatalogViewType("SLIDER_MINIMALISTIC_CARD", 21, "slider_minimalistic_card");
    public static final CatalogViewType DOUBLE_STACKED_SLIDER_MINIMALISTIC_CARD = new CatalogViewType("DOUBLE_STACKED_SLIDER_MINIMALISTIC_CARD", 22, "double_stacked_slider_minimalistic_card");
    public static final CatalogViewType SMALL_SLIDER = new CatalogViewType("SMALL_SLIDER", 23, "small_slider");
    public static final CatalogViewType ICONS_SLIDER = new CatalogViewType("ICONS_SLIDER", 24, "icons_slider");
    public static final CatalogViewType STICKERS_SLIDER_ONLY_PRICE = new CatalogViewType("STICKERS_SLIDER_ONLY_PRICE", 25, "stickers_slider_only_price");
    public static final CatalogViewType STICKERS_LARGE_SLIDER_ONLY_PRICE = new CatalogViewType("STICKERS_LARGE_SLIDER_ONLY_PRICE", 26, "stickers_large_slider_only_price");
    public static final CatalogViewType LIST_STICKERS_PREVIEW = new CatalogViewType("LIST_STICKERS_PREVIEW", 27, "list_stickers_preview");
    public static final CatalogViewType PLACEHOLDER_VIDEO_EMPTY_SHORT_VIDEO = new CatalogViewType("PLACEHOLDER_VIDEO_EMPTY_SHORT_VIDEO", 28, "placeholder_video_empty_short_video");
    public static final CatalogViewType VIDEO_SLIDER = new CatalogViewType("VIDEO_SLIDER", 29, "video_slider");
    public static final CatalogViewType SLIDER_CARD_INFINITE = new CatalogViewType("SLIDER_CARD_INFINITE", 30, "infinite_slider_card");
    public static final CatalogViewType SLIDER_WITH_VERTICAL_VIDEOS = new CatalogViewType("SLIDER_WITH_VERTICAL_VIDEOS", 31, "short_video_slider");
    public static final CatalogViewType FLOOR_CLIPS = new CatalogViewType("FLOOR_CLIPS", 32, "floor_clips");
    public static final CatalogViewType SEARCH_FLOOR_CLIPS = new CatalogViewType("SEARCH_FLOOR_CLIPS", 33, "search_floor_clips");
    public static final CatalogViewType CAROUSEL_CLIPS = new CatalogViewType("CAROUSEL_CLIPS", 34, "carousel_clips");
    public static final CatalogViewType SEARCH_CAROUSEL_CLIPS = new CatalogViewType("SEARCH_CAROUSEL_CLIPS", 35, "search_carousel_clips");
    public static final CatalogViewType CAROUSEL_CLIPS_WITH_SUBSCRIPTIONS = new CatalogViewType("CAROUSEL_CLIPS_WITH_SUBSCRIPTIONS", 36, "carousel_clips_with_subscriptions");
    public static final CatalogViewType SLIDER_VERTICAL_VIDEOS_NO_AUTOPLAY = new CatalogViewType("SLIDER_VERTICAL_VIDEOS_NO_AUTOPLAY", 37, "short_video_slider_with_view_counter");
    public static final CatalogViewType LARGE_SLIDER_WITH_VERTICAL_VIDEOS = new CatalogViewType("LARGE_SLIDER_WITH_VERTICAL_VIDEOS", 38, "short_video_slider_large");
    public static final CatalogViewType LARGE_SLIDER = new CatalogViewType("LARGE_SLIDER", 39, "large_slider");
    public static final CatalogViewType SLIDER_INFINITE = new CatalogViewType("SLIDER_INFINITE", 40, "infinite_slider");
    public static final CatalogViewType RECOMMS_SLIDER = new CatalogViewType("RECOMMS_SLIDER", 41, "recomms_slider");
    public static final CatalogViewType ARTISTS_SLIDER = new CatalogViewType("ARTISTS_SLIDER", 42, "artists_slider");
    public static final CatalogViewType CROP_SLIDER = new CatalogViewType("CROP_SLIDER", 43, "crop_slider");
    public static final CatalogViewType LARGE_SLIDER_INFINITE = new CatalogViewType("LARGE_SLIDER_INFINITE", 44, "infinite_large_slider");
    public static final CatalogViewType LARGE_LIST_INFINITE = new CatalogViewType("LARGE_LIST_INFINITE", 45, "infinite_large_LIST");
    public static final CatalogViewType DOUBLE_STACKED_SLIDER = new CatalogViewType("DOUBLE_STACKED_SLIDER", 46, "double_stacked_slider");
    public static final CatalogViewType TRIPLE_STACKED_SLIDER = new CatalogViewType("TRIPLE_STACKED_SLIDER", 47, "triple_stacked_slider");
    public static final CatalogViewType TRIPLE_STACKED_SLIDER_PICKER = new CatalogViewType("TRIPLE_STACKED_SLIDER_PICKER", 48, "triple_stacked_slider_picker");
    public static final CatalogViewType MUSIC_CHART_TRIPLE_STACKED_SLIDER = new CatalogViewType("MUSIC_CHART_TRIPLE_STACKED_SLIDER", 49, "music_chart_triple_stacked_slider");
    public static final CatalogViewType MUSIC_CHART_LIST = new CatalogViewType("MUSIC_CHART_LIST", 50, "music_chart_list");
    public static final CatalogViewType MUSIC_CHART_LARGE_SLIDER = new CatalogViewType("MUSIC_CHART_LARGE_SLIDER", 51, "music_chart_large_slider");
    public static final CatalogViewType MUSIC_MAIN_NAVIGATION = new CatalogViewType("MUSIC_MAIN_NAVIGATION", 52, "music_navigation");
    public static final CatalogViewType LIST_PICKER = new CatalogViewType("LIST_PICKER", 53, "list_picker");
    public static final CatalogViewType PROMO_BANNERS_SLIDER = new CatalogViewType("PROMO_BANNERS_SLIDER", 54, "promo_banners_slider");
    public static final CatalogViewType PROMO_BANNERS_SLIDER_INFINITE = new CatalogViewType("PROMO_BANNERS_SLIDER_INFINITE", 55, "infinite_promo_banners_slider");
    public static final CatalogViewType PODCAST_BANNERS_SLIDER = new CatalogViewType("PODCAST_BANNERS_SLIDER", 56, "podcast_banners_slider");
    public static final CatalogViewType PODCAST_BANNERS_SLIDER_INFINITE = new CatalogViewType("PODCAST_BANNERS_SLIDER_INFINITE", 57, "infinite_podcast_banners_slider");
    public static final CatalogViewType PODCAST_FAVORITES = new CatalogViewType("PODCAST_FAVORITES", 58, "podcasts_favorites");
    public static final CatalogViewType PODCAST_CATEGORY_GENRE_BUTTONS = new CatalogViewType("PODCAST_CATEGORY_GENRE_BUTTONS", 59, "podcast_category_genre_buttons");
    public static final CatalogViewType PODCAST_EXTENDED_SLIDER = new CatalogViewType("PODCAST_EXTENDED_SLIDER", 60, "podcasts_extended_slider");
    public static final CatalogViewType MY_SHELF_PLAYABLE_ITEM = new CatalogViewType("MY_SHELF_PLAYABLE_ITEM", 61, "playable_item_in_progress");
    public static final CatalogViewType BANNER = new CatalogViewType("BANNER", 62, "banner");
    public static final CatalogViewType TEXT = new CatalogViewType("TEXT", 63, "text");
    public static final CatalogViewType FEATURED_LIST = new CatalogViewType("FEATURED_LIST", 64, "featured_list");
    public static final CatalogViewType SYNTHETIC_TABS = new CatalogViewType("SYNTHETIC_TABS", 65, "__synthetic_tabs__");
    public static final CatalogViewType PLACEHOLDER_SMALL = new CatalogViewType("PLACEHOLDER_SMALL", 66, "placeholder_small");
    public static final CatalogViewType PLACEHOLDER_BIG = new CatalogViewType("PLACEHOLDER_BIG", 67, "placeholder_big");
    public static final CatalogViewType PLACEHOLDER = new CatalogViewType("PLACEHOLDER", 68, "placeholder");
    public static final CatalogViewType PLACEHOLDER_IMAGE_WARNING = new CatalogViewType("PLACEHOLDER_IMAGE_WARNING", 69, "placeholder_image_warning");
    public static final CatalogViewType PLACEHOLDER_ILLEGAL_QUERY = new CatalogViewType("PLACEHOLDER_ILLEGAL_QUERY", 70, "placeholder_illegal_query");
    public static final CatalogViewType MUSIC_PLACEHOLDER_OFFLINE_SYNC = new CatalogViewType("MUSIC_PLACEHOLDER_OFFLINE_SYNC", 71, "music_placeholder_offline_sync");
    public static final CatalogViewType ASSISTANT_BANNER = new CatalogViewType("ASSISTANT_BANNER", 72, "assistant_banner");
    public static final CatalogViewType AI_ASSISTANT_ENTRYPOINT = new CatalogViewType("AI_ASSISTANT_ENTRYPOINT", 73, "ai_assistant_entrypoint");
    public static final CatalogViewType NOTIFICATION = new CatalogViewType("NOTIFICATION", 74, "notification");
    public static final CatalogViewType BUTTONS_HORIZONTAL = new CatalogViewType("BUTTONS_HORIZONTAL", 75, "horizontal_buttons");
    public static final CatalogViewType BUTTONS_HORIZONTAL_WITH_SCROLL = new CatalogViewType("BUTTONS_HORIZONTAL_WITH_SCROLL", 76, "horizontal_buttons_with_scroll");
    public static final CatalogViewType FIENDS_HORIZONTAL_ACTION = new CatalogViewType("FIENDS_HORIZONTAL_ACTION", 77, "horizontal_action");
    public static final CatalogViewType PREVIEW = new CatalogViewType("PREVIEW", 78, "preview");
    public static final CatalogViewType TITLE_SUBTITLE_AVATAR = new CatalogViewType("TITLE_SUBTITLE_AVATAR", 79, "title_subtitle_avatar");
    public static final CatalogViewType DOUBLE_LIST = new CatalogViewType("DOUBLE_LIST", 80, "double_list");
    public static final CatalogViewType GRID = new CatalogViewType(SignalingProtocol.KEY_GRID, 81, "grid");
    public static final CatalogViewType VERTICAL_GRID = new CatalogViewType("VERTICAL_GRID", 82, "vertical_grid");
    public static final CatalogViewType LIST_FRIENDS_SUGGEST = new CatalogViewType("LIST_FRIENDS_SUGGEST", 83, "list_friend_suggests");
    public static final CatalogViewType HORIZONTAL_LIST_FRIEND_SUGGESTS = new CatalogViewType("HORIZONTAL_LIST_FRIEND_SUGGESTS", 84, "horizontal_list_friend_suggests");
    public static final CatalogViewType LIST_MYFOLLOWERS = new CatalogViewType("LIST_MYFOLLOWERS", 85, "list_myfollowers");
    public static final CatalogViewType FRIENDS_REQUEST = new CatalogViewType("FRIENDS_REQUEST", 86, "friends_requests");
    public static final CatalogViewType FRIENDS_UNREAD_REQUEST = new CatalogViewType("FRIENDS_UNREAD_REQUEST", 87, "friends_unread_requests");
    public static final CatalogViewType FRIENDS_BIRTHDAYS_LIST = new CatalogViewType("FRIENDS_BIRTHDAYS_LIST", 88, "friends_birthdays_list");
    public static final CatalogViewType LIST_FRIENDS_REQUESTS = new CatalogViewType("LIST_FRIENDS_REQUESTS", 89, "list_friends_requests");
    public static final CatalogViewType LIST_FRIENDS_REQUESTS_OUT = new CatalogViewType("LIST_FRIENDS_REQUESTS_OUT", 90, "list_friends_requests_out");
    public static final CatalogViewType FRIENDS_ACTION_LIST_ITEM = new CatalogViewType("FRIENDS_ACTION_LIST_ITEM", 91, "friends_action_list_item");
    public static final CatalogViewType FRIENDS_BUTTON_LIST_WIDE = new CatalogViewType("FRIENDS_BUTTON_LIST_WIDE", 92, "friends_button_list_wide");
    public static final CatalogViewType MUSIC_NEWSFEED_TITLE = new CatalogViewType("MUSIC_NEWSFEED_TITLE", 93, "music_newsfeed_title");
    public static final CatalogViewType AUDIO_STREAM_MIX = new CatalogViewType("AUDIO_STREAM_MIX", 94, "audio_stream_mix");
    public static final CatalogViewType AUDIO_STREAM_MIX_INTERACTIVE = new CatalogViewType("AUDIO_STREAM_MIX_INTERACTIVE", 95, "audio_stream_mix_interactive");
    public static final CatalogViewType PLAYLIST_SMALL = new CatalogViewType("PLAYLIST_SMALL", 96, "playlist_small");
    public static final CatalogViewType ENTITY_DOUBLE_GRID = new CatalogViewType("ENTITY_DOUBLE_GRID", 97, "entity_double_grid");
    public static final CatalogViewType AUDIO_CONTENT_CARD_EXTENDED_SLIDER = new CatalogViewType("AUDIO_CONTENT_CARD_EXTENDED_SLIDER", 98, "audio_content_card_extended_slider");
    public static final CatalogViewType OWNER_CELL = new CatalogViewType("OWNER_CELL", 99, "owner_cell");
    public static final CatalogViewType USER_PROFILE = new CatalogViewType("USER_PROFILE", 100, "user_profile");
    public static final CatalogViewType SMALL_BANNER_OFFER = new CatalogViewType("SMALL_BANNER_OFFER", 101, "small_banner_offer");
    public static final CatalogViewType CATEGORIES_LIST = new CatalogViewType("CATEGORIES_LIST", 102, "categories_list");
    public static final CatalogViewType CATEGORIES_GRID = new CatalogViewType("CATEGORIES_GRID", 103, "categories_grid");
    public static final CatalogViewType CHIPS = new CatalogViewType("CHIPS", 104, "chips");
    public static final CatalogViewType FILTER_BUTTON = new CatalogViewType("FILTER_BUTTON", 105, "filter_button");
    public static final CatalogViewType MAP_PREVIEW = new CatalogViewType("MAP_PREVIEW", Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, "map_preview");
    public static final CatalogViewType SYNTHETIC_ACTION_OPEN_DIALOG = new CatalogViewType("SYNTHETIC_ACTION_OPEN_DIALOG", ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, "open_dialog");
    public static final CatalogViewType SYNTHETIC_ACTION_MAKE_CALL = new CatalogViewType("SYNTHETIC_ACTION_MAKE_CALL", 108, "make_call");
    public static final CatalogViewType SYNTHETIC_ACTION_REMOVE_FRIEND = new CatalogViewType("SYNTHETIC_ACTION_REMOVE_FRIEND", 109, "remove_friend");
    public static final CatalogViewType SYNTHETIC_ACTION_OPEN_GIFTS = new CatalogViewType("SYNTHETIC_ACTION_OPEN_GIFTS", 110, "open_gifst");
    public static final CatalogViewType SYNTHETIC_ACTION_SHOW_OPTIONS = new CatalogViewType("SYNTHETIC_ACTION_SHOW_OPTIONS", 111, "show_options");
    public static final CatalogViewType LISTENED_LIST = new CatalogViewType("LISTENED_LIST", 112, "listened_list");
    public static final CatalogViewType LIST_WITH_NOTIFICATION_STATE = new CatalogViewType("LIST_WITH_NOTIFICATION_STATE", 113, "list_with_notification_state");
    public static final CatalogViewType LIST_WITH_RETURN_STATE = new CatalogViewType("LIST_WITH_RETURN_STATE", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, "list_with_return_state");
    public static final CatalogViewType MUSIC_EXCLUSIVE_SLIDER = new CatalogViewType("MUSIC_EXCLUSIVE_SLIDER", Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, "music_exclusive_slider");
    public static final CatalogViewType VIDEO_TABS_ALBUM_LIST = new CatalogViewType("VIDEO_TABS_ALBUM_LIST", 116, "video_tabs_album_list");
    public static final CatalogViewType SYNTHETIC_ACTION_START_LIVE_STREAM = new CatalogViewType("SYNTHETIC_ACTION_START_LIVE_STREAM", Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, "start_live");
    public static final CatalogViewType SYNTHETIC_ACTION_ADD_VIDEOS = new CatalogViewType("SYNTHETIC_ACTION_ADD_VIDEOS", Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, "add_videos");
    public static final CatalogViewType SYNTHETIC_ACTION_TOGGLE_ALBUM_SHUFFLE = new CatalogViewType("SYNTHETIC_ACTION_TOGGLE_ALBUM_SHUFFLE", Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, "toggle_album_shuffle");
    public static final CatalogViewType SYNTHETIC_ACTION_OPEN_QOE_SURVEY = new CatalogViewType("SYNTHETIC_ACTION_OPEN_QOE_SURVEY", 120, "open_qoe_survey");
    public static final CatalogViewType SYNTHETIC_ACTION_FOLLOW = new CatalogViewType("SYNTHETIC_ACTION_FOLLOW", Sdk.SDKError.Reason.TPAT_ERROR_VALUE, "follow");
    public static final CatalogViewType SYNTHETIC_ACTION_CREATE_ALBUM = new CatalogViewType("SYNTHETIC_ACTION_CREATE_ALBUM", Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, "create_album");
    public static final CatalogViewType SYNTHETIC_ACTION_CREATE_PLAYLIST = new CatalogViewType("SYNTHETIC_ACTION_CREATE_PLAYLIST", 123, "create_playlist");
    public static final CatalogViewType SYNTHETIC_ACTION_PLAY_MIX = new CatalogViewType("SYNTHETIC_ACTION_PLAY_MIX", Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, "play_mix");
    public static final CatalogViewType SYNTHETIC_ACTION_ARTIST_MIX = new CatalogViewType("SYNTHETIC_ACTION_ARTIST_MIX", 125, "artist_mix");
    public static final CatalogViewType SYNTHETIC_ACTION_ARTIST_MIX_BLURRED = new CatalogViewType("SYNTHETIC_ACTION_ARTIST_MIX_BLURRED", Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, "artist_mix_blurred");
    public static final CatalogViewType SYNTHETIC_ACTION_PLAY_AUDIO_FROM_BLOCK = new CatalogViewType("SYNTHETIC_ACTION_PLAY_AUDIO_FROM_BLOCK", 127, "play_audios_from_block");
    public static final CatalogViewType SYNTHETIC_ACTION_PLAY_SHUFFLED_AUDIO_FROM_BLOCK = new CatalogViewType("SYNTHETIC_ACTION_PLAY_SHUFFLED_AUDIO_FROM_BLOCK", 128, "play_shuffled_audios_from_block");
    public static final CatalogViewType SYNTHETIC_ACTION_SAVE_AS_PLAYLIST = new CatalogViewType("SYNTHETIC_ACTION_SAVE_AS_PLAYLIST", 129, "save_as_playlist");
    public static final CatalogViewType SYNTHETIC_ACTION_LOGIN = new CatalogViewType("SYNTHETIC_ACTION_LOGIN", 130, "login");
    public static final CatalogViewType SYNTHETIC_ACTION_LOGOUT = new CatalogViewType("SYNTHETIC_ACTION_LOGOUT", Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, ChangePasswordApiRequestV1.PARAM_NAME_LOGOUT_ALL);
    public static final CatalogViewType SYNTHETIC_ACTION_UPLOAD_VIDEO = new CatalogViewType("SYNTHETIC_ACTION_UPLOAD_VIDEO", Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, "upload_video");
    public static final CatalogViewType SYNTHETIC_ACTION_UPLOAD_CLIP = new CatalogViewType("SYNTHETIC_ACTION_UPLOAD_CLIP", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "upload_clip");
    public static final CatalogViewType SYNTHETIC_ACTION_TOGGLE_PLAYLIST_SUBSCRIPTION = new CatalogViewType("SYNTHETIC_ACTION_TOGGLE_PLAYLIST_SUBSCRIPTION", 134, "toggle_video_album_subscription");
    public static final CatalogViewType SYNTHETIC_ACTION_ADD_FRIEND = new CatalogViewType("SYNTHETIC_ACTION_ADD_FRIEND", 135, "add_friend");
    public static final CatalogViewType SYNTHETIC_ACTION_SCAN_QR = new CatalogViewType("SYNTHETIC_ACTION_SCAN_QR", Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, "scan_qr");
    public static final CatalogViewType SYNTHETIC_ACTION_IMPORT_CONTACTS = new CatalogViewType("SYNTHETIC_ACTION_IMPORT_CONTACTS", Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "import_contacts");
    public static final CatalogViewType SYNTHETIC_ACTION_ADD_FRIENDS = new CatalogViewType("SYNTHETIC_ACTION_ADD_FRIENDS", 138, "add_friend_block");
    public static final CatalogViewType SYNTHETIC_ACTION_FRIENDS_CLEANUP = new CatalogViewType("SYNTHETIC_ACTION_FRIENDS_CLEANUP", 139, "friends_cleanup");
    public static final CatalogViewType SYNTHETIC_ACTION_OPEN_SCREEN = new CatalogViewType("SYNTHETIC_ACTION_OPEN_SCREEN", VersionConstants.PRODUCT_MAJOR_VERSION, "open_screen");
    public static final CatalogViewType SYNTHETIC_ACTION_OPEN_SCREEN_LARGE = new CatalogViewType("SYNTHETIC_ACTION_OPEN_SCREEN_LARGE", 141, "open_screen_large");
    public static final CatalogViewType SYNTHETIC_ACTION_OPEN_TAB = new CatalogViewType("SYNTHETIC_ACTION_OPEN_TAB", 142, "open_tab");
    public static final CatalogViewType SYNTHETIC_ACTION_EXPAND_BLOCK = new CatalogViewType("SYNTHETIC_ACTION_EXPAND_BLOCK", 143, "expand_block");

    @ozl
    public static final CatalogViewType SYNTHETIC_ACTION_FRIENDS_SORT_MODES = new CatalogViewType("SYNTHETIC_ACTION_FRIENDS_SORT_MODES", 144, "friends_sort_modes");
    public static final CatalogViewType SYNTHETIC_ACTION_SELECT_SORTING = new CatalogViewType("SYNTHETIC_ACTION_SELECT_SORTING", 145, "select_sorting");
    public static final CatalogViewType SYNTHETIC_ACTION_ADV_URL = new CatalogViewType("SYNTHETIC_ACTION_ADV_URL", 146, "adv_url");
    public static final CatalogViewType SYNTHETIC_ACTION_CREATE_GROUP = new CatalogViewType("SYNTHETIC_ACTION_CREATE_GROUP", 147, "create_group");
    public static final CatalogViewType SYNTHETIC_ACTION_OPEN_URL = new CatalogViewType("SYNTHETIC_ACTION_OPEN_URL", 148, "open_url");
    public static final CatalogViewType SYNTHETIC_ACTION_OPEN_URL_SLIDER = new CatalogViewType("SYNTHETIC_ACTION_OPEN_URL_SLIDER", 149, "open_url_slider");
    public static final CatalogViewType SYNTHETIC_ACTION_OPEN_URL_BOTTOM = new CatalogViewType("SYNTHETIC_ACTION_OPEN_URL_BOTTOM", 150, "open_url_bottom_button");
    public static final CatalogViewType SYNTHETIC_ACTION_SWITCH_SECTION = new CatalogViewType("SYNTHETIC_ACTION_SWITCH_SECTION", 151, "switch_section");
    public static final CatalogViewType SYNTHETIC_ACTION_SWITCH_ACCOUNT = new CatalogViewType("SYNTHETIC_ACTION_SWITCH_ACCOUNT", 152, "switch_account");
    public static final CatalogViewType SYNTHETIC_ACTION_GO_TO_OWNER = new CatalogViewType("SYNTHETIC_ACTION_GO_TO_OWNER", 153, "owner_button");
    public static final CatalogViewType SYNTHETIC_ACTION_CLOSE_BANNER = new CatalogViewType("SYNTHETIC_ACTION_CLOSE_BANNER", 154, "close_catalog_banner");
    public static final CatalogViewType SYNTHETIC_ACTION_UNFOLLOW_ARTIST = new CatalogViewType("SYNTHETIC_ACTION_UNFOLLOW_ARTIST", 155, "unfollow_artist");
    public static final CatalogViewType SYNTHETIC_ACTION_UNFOLLOW_CURATOR = new CatalogViewType("SYNTHETIC_ACTION_UNFOLLOW_CURATOR", 156, "unfollow_curator");
    public static final CatalogViewType SYNTHETIC_ACTION_TOGGLE_SUBSCRIPTION_CURATOR = new CatalogViewType("SYNTHETIC_ACTION_TOGGLE_SUBSCRIPTION_CURATOR", 157, "toggle_subscription_curator");
    public static final CatalogViewType SYNTHETIC_ACTION_MUSIC_FOLLOW_OWNER = new CatalogViewType("SYNTHETIC_ACTION_MUSIC_FOLLOW_OWNER", 158, "music_follow_owner");
    public static final CatalogViewType SYNTHETIC_ACTION_UNFOLLOW_OWNER = new CatalogViewType("SYNTHETIC_ACTION_UNFOLLOW_OWNER", 159, "unfollow_owner");
    public static final CatalogViewType SYNTHETIC_ACTION_MARKET_EDIT_ALBUM = new CatalogViewType("SYNTHETIC_ACTION_MARKET_EDIT_ALBUM", 160, "market_edit_album");
    public static final CatalogViewType SYNTHETIC_DND_ACTION_EDIT = new CatalogViewType("SYNTHETIC_DND_ACTION_EDIT", 161, "edit_items");
    public static final CatalogViewType SYNTHETIC_DND_ACTION_REORDER = new CatalogViewType("SYNTHETIC_DND_ACTION_REORDER", 162, "reorder_items");
    public static final CatalogViewType SYNTHETIC_ACTION_OPEN_SECTION = new CatalogViewType("SYNTHETIC_ACTION_OPEN_SECTION", 163, "show_all");
    public static final CatalogViewType SYNTHETIC_ACTION_OPEN_SECTION_CHIP = new CatalogViewType("SYNTHETIC_ACTION_OPEN_SECTION_CHIP", 164, "open_section_chip");
    public static final CatalogViewType SYNTHETIC_ACTION_MY_AUDIOS_SECTION_OPTIONS = new CatalogViewType("SYNTHETIC_ACTION_MY_AUDIOS_SECTION_OPTIONS", 165, "my_audios_section_options");
    public static final CatalogViewType SYNTHETIC_ACTION_OPEN_SECTION_SLIDER_DEFAULT = new CatalogViewType("SYNTHETIC_ACTION_OPEN_SECTION_SLIDER_DEFAULT", 166, "show_all_slider_default");
    public static final CatalogViewType SYNTHETIC_ACTION_OPEN_SECTION_SLIDER_VIDEOS = new CatalogViewType("SYNTHETIC_ACTION_OPEN_SECTION_SLIDER_VIDEOS", 167, "show_all_slider_videos");
    public static final CatalogViewType SYNTHETIC_ACTION_OPEN_SECTION_SLIDER_MARKET_ITEMS = new CatalogViewType("SYNTHETIC_ACTION_OPEN_SECTION_SLIDER_MARKET_ITEMS", 168, "show_all_slider_market_items");
    public static final CatalogViewType SYNTHETIC_SUBNAVIGATION_CONTAINER = new CatalogViewType("SYNTHETIC_SUBNAVIGATION_CONTAINER", 169, "_synthetic_subnavigation_container");
    public static final CatalogViewType SUBNAVIGATION_BAR = new CatalogViewType("SUBNAVIGATION_BAR", 170, "subnavigation_bar");
    public static final CatalogViewType SYNTHETIC_ACTION_OPEN_MODAL = new CatalogViewType("SYNTHETIC_ACTION_OPEN_MODAL", 171, "open_modal");
    public static final CatalogViewType SYNTHETIC_ACTION_OPEN_INFO_POPUP = new CatalogViewType("SYNTHETIC_ACTION_OPEN_INFO_POPUP", 172, "open_info_popup");
    public static final CatalogViewType SYNTHETIC_HEADER_CLEAR_RECENTS = new CatalogViewType("SYNTHETIC_HEADER_CLEAR_RECENTS", 173, "clear_recent_groups");
    public static final CatalogViewType SYNTHETIC_HEADER_CLEAR_RECENTS_COMPACT = new CatalogViewType("SYNTHETIC_HEADER_CLEAR_RECENTS_COMPACT", 174, "clear_recent_groups_compact");
    public static final CatalogViewType SYNTHETIC_HEADER_CLEAR_RECENTS_LARGE = new CatalogViewType("SYNTHETIC_HEADER_CLEAR_RECENTS_LARGE", 175, "clear_recent_groups_large");
    public static final CatalogViewType SYNTHETIC_HEADER_CLEAR_TRACKS = new CatalogViewType("SYNTHETIC_HEADER_CLEAR_TRACKS", 176, "clear_tracks");
    public static final CatalogViewType SYNTHETIC_VIDEO_VIDEOS_LARGE_LIST_NO_AUTOPLAY = new CatalogViewType("SYNTHETIC_VIDEO_VIDEOS_LARGE_LIST_NO_AUTOPLAY", 177, "synthetic_video_videos_large_list_no_autoplay");
    public static final CatalogViewType SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1 = new CatalogViewType("SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1", 178, "synthetic_video_videos_ratio_1_1");
    public static final CatalogViewType SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5 = new CatalogViewType("SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5", 179, "synthetic_video_videos_ratio_4_5");
    public static final CatalogViewType SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1_NO_AUTOPLAY = new CatalogViewType("SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1_NO_AUTOPLAY", 180, "synthetic_video_videos_ratio_1_1_no_autoplay");
    public static final CatalogViewType SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5_NO_AUTOPLAY = new CatalogViewType("SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5_NO_AUTOPLAY", 181, "synthetic_video_videos_ratio_4_5_no_autoplay");
    public static final CatalogViewType SYNTHETIC_VIDEO_VIDEOS_FIT = new CatalogViewType("SYNTHETIC_VIDEO_VIDEOS_FIT", 182, "synthetic_video_videos_fit");
    public static final CatalogViewType SYNTHETIC_VIDEO_VIDEOS_HIDE = new CatalogViewType("SYNTHETIC_VIDEO_VIDEOS_HIDE", 183, "synthetic_video_videos_hide");
    public static final CatalogViewType SYNTHETIC_VIDEO_VIDEOS_STACKED_HIDE = new CatalogViewType("SYNTHETIC_VIDEO_VIDEOS_STACKED_HIDE", 184, "synthetic_video_videos_stacked_hide");
    public static final CatalogViewType SYNTHETIC_VIDEO_VIDEOS_SLIDER_HIDE = new CatalogViewType("SYNTHETIC_VIDEO_VIDEOS_SLIDER_HIDE", 185, "synthetic_video_videos_slider_hide");
    public static final CatalogViewType SYNTHETIC_FEEDBACKS = new CatalogViewType("SYNTHETIC_FEEDBACKS", 186, "synthetic_feedbacks");
    public static final CatalogViewType SYNTHETIC_VIDEO_VIDEOS_UPLOAD = new CatalogViewType("SYNTHETIC_VIDEO_VIDEOS_UPLOAD", 187, "synthetic_video_videos_upload");
    public static final CatalogViewType SYNTHETIC_CATALOG = new CatalogViewType("SYNTHETIC_CATALOG", 188, "synthetic_catalog");
    public static final CatalogViewType SYNTHETIC_HEADER_SECTION = new CatalogViewType("SYNTHETIC_HEADER_SECTION", PsExtractor.PRIVATE_STREAM_1, "synthetic_header_section");
    public static final CatalogViewType SYNTHETIC_SEARCH_LIST = new CatalogViewType("SYNTHETIC_SEARCH_LIST", 190, "synthetic_search_list");
    public static final CatalogViewType SYNTHETIC_LIST_FOLLOWERS = new CatalogViewType("SYNTHETIC_LIST_FOLLOWERS", 191, "synthetic_list_followers");
    public static final CatalogViewType SYNTHETIC_VIDEO_VIDEOS_INTERACTIVE = new CatalogViewType("SYNTHETIC_VIDEO_VIDEOS_INTERACTIVE", PsExtractor.AUDIO_STREAM, "synthetic_video_videos_interactive");
    public static final CatalogViewType SYNTHETIC_VIDEO_SLIDER_INTERACTIVE = new CatalogViewType("SYNTHETIC_VIDEO_SLIDER_INTERACTIVE", 193, "synthetic_video_slider_interactive");
    public static final CatalogViewType SYNTHETIC_CLIP_SEARCH_SUGGESTION_HEADER = new CatalogViewType("SYNTHETIC_CLIP_SEARCH_SUGGESTION_HEADER", 194, "synthetic_clip_search_suggestion_header");
    public static final CatalogViewType SYNTHETIC_SEARCH_MAP_HEADER = new CatalogViewType("SYNTHETIC_SEARCH_MAP_HEADER", 195, "synthetic_search_map_header");
    public static final CatalogViewType SYNTHETIC_OFFLINE_MUSIC_STATUS_PLACEHOLDER = new CatalogViewType("SYNTHETIC_OFFLINE_MUSIC_STATUS_PLACEHOLDER", 196, "synthetic_offline_music_status");
    public static final CatalogViewType SYNTHETIC_OFFLINE_PODCASTS_SECTION_PLACEHOLDER = new CatalogViewType("SYNTHETIC_OFFLINE_PODCASTS_SECTION_PLACEHOLDER", 197, "synthetic_offline_podcasts_section_placeholder");
    public static final CatalogViewType SYNTHETIC_OFFLINE_AUDIO_BOOKS_SECTION_PLACEHOLDER = new CatalogViewType("SYNTHETIC_OFFLINE_AUDIO_BOOKS_SECTION_PLACEHOLDER", 198, "synthetic_offline_audio_books_section_placeholder");
    public static final CatalogViewType SYNTHETIC_OFFLINE_MAIN_TRACKS_SECTION_PLACEHOLDER = new CatalogViewType("SYNTHETIC_OFFLINE_MAIN_TRACKS_SECTION_PLACEHOLDER", 199, "synthetic_offline_main_tracks_section_placeholder");
    public static final CatalogViewType SYNTHETIC_OFFLINE_MUSIC_SUBSCRIPTION_SMALL = new CatalogViewType("SYNTHETIC_OFFLINE_MUSIC_SUBSCRIPTION_SMALL", 200, "synthetic_offline_music_subscription_small");
    public static final CatalogViewType SYNTHETIC_OFFLINE_MUSIC_SUBSCRIPTION_BIG = new CatalogViewType("SYNTHETIC_OFFLINE_MUSIC_SUBSCRIPTION_BIG", 201, "synthetic_offline_music_subscription_big");
    public static final CatalogViewType SYNTHETIC_OFFLINE_MUSIC_SUBSCRIPTION_BTN = new CatalogViewType("SYNTHETIC_OFFLINE_MUSIC_SUBSCRIPTION_BTN", 202, "synthetic_offline_music_subscription_btn");
    public static final CatalogViewType SYNTHETIC_MUSIC_TRACK_LIST = new CatalogViewType("SYNTHETIC_MUSIC_TRACK_LIST", 203, "synthetic_music_track_list");
    public static final CatalogViewType SYNTHETIC_MUSIC_DOWNLOADS_LIST = new CatalogViewType("SYNTHETIC_MUSIC_DOWNLOADS_LIST", 204, "synthetic_music_downloads_list");
    public static final CatalogViewType SYNTHETIC_MUSIC_OFFLINE_TRACKS_LIST = new CatalogViewType("SYNTHETIC_MUSIC_OFFLINE_TRACKS_LIST", 205, "synthetic_music_offline_tracks_list");
    public static final CatalogViewType SYNTHETIC_MUSIC_OFFLINE_PLAYLISTS_LIST = new CatalogViewType("SYNTHETIC_MUSIC_OFFLINE_PLAYLISTS_LIST", 206, "synthetic_music_offline_playlists_list");
    public static final CatalogViewType SYNTHETIC_SEARCH_GROUP_ITEMS_LIST = new CatalogViewType("SYNTHETIC_SEARCH_GROUP_ITEMS_LIST", 207, "synthetic_search_group_items_list");
    public static final CatalogViewType SYNTHETIC_GROUP_ITEM_BIG = new CatalogViewType("SYNTHETIC_GROUP_ITEM_BIG", Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, "synthetic_group_item_big");
    public static final CatalogViewType SYNTHETIC_STAGGERED_TRIPLE_STACKED_SLIDER = new CatalogViewType("SYNTHETIC_STAGGERED_TRIPLE_STACKED_SLIDER", Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, "synthetic_staggered_triple_stacked_slider");
    public static final CatalogViewType SYNTHETIC_SEPARATOR_TRANSPARENT = new CatalogViewType("SYNTHETIC_SEPARATOR_TRANSPARENT", Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, "synthetic_separator_transparent");
    public static final CatalogViewType SYNTHETIC_SEPARATOR_THIN = new CatalogViewType("SYNTHETIC_SEPARATOR_THIN", 211, "synthetic_separator_thin");
    public static final CatalogViewType SYNTHETIC_SEPARATOR_ISLAND = new CatalogViewType("SYNTHETIC_SEPARATOR_ISLAND", Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, "synthetic_separator_island");
    public static final CatalogViewType SYNTHETIC_SEPARATOR_ISLAND_TRANSPARENT = new CatalogViewType("SYNTHETIC_SEPARATOR_ISLAND_TRANSPARENT", Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, "synthetic_separator_island_transparent");
    public static final CatalogViewType SYNTHETIC_SEPARATOR_OVERLAP = new CatalogViewType("SYNTHETIC_SEPARATOR_OVERLAP", Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, "synthetic_separator_overlap");
    public static final CatalogViewType SYNTHETIC_PLACEHOLDER = new CatalogViewType("SYNTHETIC_PLACEHOLDER", Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, "synthetic_placeholder");
    public static final CatalogViewType SYNTHETIC_MINITAB = new CatalogViewType("SYNTHETIC_MINITAB", Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, "synthetic_minitab");
    public static final CatalogViewType SYNTHETIC_SPORT_WIDGET_SLIDER = new CatalogViewType("SYNTHETIC_SPORT_WIDGET_SLIDER", Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, "synthetic_sport_widget_slider");
    public static final CatalogViewType SYNTHETIC_SPORT_WIDGET_LIST = new CatalogViewType("SYNTHETIC_SPORT_WIDGET_LIST", Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, "synthetic_sport_widget_list");
    public static final CatalogViewType SNIPPETS_BANNER = new CatalogViewType("SNIPPETS_BANNER", Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, "snippets_banner");
    public static final CatalogViewType CATALOG_BANNER = new CatalogViewType("CATALOG_BANNER", Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, "catalog_banner");
    public static final CatalogViewType INVISIBLE = new CatalogViewType("INVISIBLE", Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, "invisible");
    public static final CatalogViewType EMPTY = new CatalogViewType("EMPTY", Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, "");
    public static final CatalogViewType SUBSECTION_TABS = new CatalogViewType("SUBSECTION_TABS", Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, "subsection_tabs");
    public static final CatalogViewType SUBSECTION_FILTER_BUTTON = new CatalogViewType("SUBSECTION_FILTER_BUTTON", 224, "subsection_filter_button");
    public static final CatalogViewType SYNTHETIC_LEGAL_NOTICE = new CatalogViewType("SYNTHETIC_LEGAL_NOTICE", Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, "synthetic_legal_notice");
    public static final CatalogViewType VIDEO_OWNER_GROUPS = new CatalogViewType("VIDEO_OWNER_GROUPS", Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, "owner_groups");
    public static final CatalogViewType VIDEO_BECOME_AUTHOR = new CatalogViewType("VIDEO_BECOME_AUTHOR", Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, "become_author_howto");
    public static final CatalogViewType VIDEO_AUTHOR_CABINET = new CatalogViewType("VIDEO_AUTHOR_CABINET", 228, "author_page");
    public static final CatalogViewType VIDEO_CHILD_MODE = new CatalogViewType("VIDEO_CHILD_MODE", 229, "child_mode");
    public static final CatalogViewType VIDEO_CHANGE_PROFILE = new CatalogViewType("VIDEO_CHANGE_PROFILE", 230, "change_profile");
    public static final CatalogViewType VIDEO_GO_TO_AUTHOR = new CatalogViewType("VIDEO_GO_TO_AUTHOR", 231, "go_to_author");
    public static final CatalogViewType KIDS_COLLECTION = new CatalogViewType("KIDS_COLLECTION", 232, "kids_collection");
    public static final CatalogViewType KIDS_CATALOG = new CatalogViewType("KIDS_CATALOG", 233, "kids_catalog");
    public static final CatalogViewType DYNAMIC_GRID = new CatalogViewType("DYNAMIC_GRID", 234, "dynamic_grid");
    public static final CatalogViewType HELP_HINT_BANNER = new CatalogViewType("HELP_HINT_BANNER", 235, "help_hint_banner");
    public static final CatalogViewType ARTIST_MERCH_SLIDER = new CatalogViewType("ARTIST_MERCH_SLIDER", 236, "artist_merch_slider");
    public static final CatalogViewType BIOGRAPHY_LAYOUT = new CatalogViewType("BIOGRAPHY_LAYOUT", 237, "biography_layout");
    public static final CatalogViewType SHOWCASE_LIST = new CatalogViewType("SHOWCASE_LIST", 238, "showcase_list");
    public static final CatalogViewType HORIZONTAL_SHOWCASE_STACK = new CatalogViewType("HORIZONTAL_SHOWCASE_STACK", 239, "horizontal_showcase_stack");
    public static final CatalogViewType PUBLISH_LOADING_VIDEOS = new CatalogViewType("PUBLISH_LOADING_VIDEOS", PsExtractor.VIDEO_STREAM_MASK, "video_uploading_published");
    public static final CatalogViewType DELAYED_LOADING_VIDEOS = new CatalogViewType("DELAYED_LOADING_VIDEOS", 241, "video_uploading_scheduled");
    public static final CatalogViewType CLIP_DRAFTS = new CatalogViewType("CLIP_DRAFTS", 242, "clip_drafts");
    public static final CatalogViewType VIDEO_MUSIC_STREAM_MIX = new CatalogViewType("VIDEO_MUSIC_STREAM_MIX", 243, "video_music_stream_mix");
    public static final CatalogViewType AD_BANNER_SHOWCASE = new CatalogViewType("AD_BANNER_SHOWCASE", 244, "showcase_ad_banner");
    public static final CatalogViewType AD_BANNER = new CatalogViewType("AD_BANNER", 245, "ad_banner");
    public static final CatalogViewType SUPERAPP_TRAFFIC_GROUP_BANNER = new CatalogViewType("SUPERAPP_TRAFFIC_GROUP_BANNER", 246, "superapp_traffic_group_banner");
    public static final CatalogViewType UNKNOWN = new CatalogViewType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 247, "unknown");

    /* compiled from: CatalogViewType.kt */
    public static final class a {
        public static CatalogViewType a(String str) {
            Object obj;
            Iterator<E> it = CatalogViewType.i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((CatalogViewType) obj).getId(), str)) {
                    break;
                }
            }
            return (CatalogViewType) obj;
        }
    }

    /* compiled from: CatalogViewType.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SLIDER_INFINITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.PROMO_BANNERS_SLIDER_INFINITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.PODCAST_BANNERS_SLIDER_INFINITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogViewType.LARGE_SLIDER_INFINITE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogViewType.LARGE_LIST_INFINITE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogViewType.SLIDER_CARD_INFINITE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION_SLIDER_DEFAULT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION_SLIDER_MARKET_ITEMS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION_SLIDER_VIDEOS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CatalogViewType.SLIDER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CatalogViewType.VIDEO_SLIDER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CatalogViewType.LARGE_SLIDER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CatalogViewType.RECOMMS_SLIDER.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CatalogViewType.ARTISTS_SLIDER.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[CatalogViewType.AUDIO_CONTENT_CARD_EXTENDED_SLIDER.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[CatalogViewType.CROP_SLIDER.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[CatalogViewType.MUSIC_CHART_TRIPLE_STACKED_SLIDER.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[CatalogViewType.MUSIC_CHART_LARGE_SLIDER.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[CatalogViewType.DOUBLE_STACKED_SLIDER.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[CatalogViewType.TRIPLE_STACKED_SLIDER.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[CatalogViewType.SLIDER_WITH_VERTICAL_VIDEOS.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[CatalogViewType.FLOOR_CLIPS.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[CatalogViewType.CAROUSEL_CLIPS.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[CatalogViewType.SEARCH_FLOOR_CLIPS.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[CatalogViewType.SEARCH_CAROUSEL_CLIPS.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[CatalogViewType.CAROUSEL_CLIPS_WITH_SUBSCRIPTIONS.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[CatalogViewType.LARGE_SLIDER_WITH_VERTICAL_VIDEOS.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[CatalogViewType.TRIPLE_STACKED_SLIDER_PICKER.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[CatalogViewType.PROMO_BANNERS_SLIDER.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[CatalogViewType.PODCAST_BANNERS_SLIDER.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[CatalogViewType.PODCAST_EXTENDED_SLIDER.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[CatalogViewType.SLIDER_EVENT.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[CatalogViewType.SLIDER_CARD.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[CatalogViewType.SLIDER_MINIMALISTIC_CARD.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[CatalogViewType.DOUBLE_STACKED_SLIDER_MINIMALISTIC_CARD.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[CatalogViewType.ICONS_SLIDER.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[CatalogViewType.STICKERS_SLIDER_ONLY_PRICE.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[CatalogViewType.STICKERS_LARGE_SLIDER_ONLY_PRICE.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[CatalogViewType.MUSIC_EXCLUSIVE_SLIDER.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[CatalogViewType.SMALL_SLIDER.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[CatalogViewType.SLIDER_VERTICAL_VIDEOS_NO_AUTOPLAY.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_OPEN_URL_SLIDER.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[CatalogViewType.ARTIST_MERCH_SLIDER.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[CatalogViewType.SHOWCASE_LIST.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[CatalogViewType.HORIZONTAL_LIST_FRIEND_SUGGESTS.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_MUSIC_DOWNLOADS_LIST.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[CatalogViewType.LIST.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[CatalogViewType.LARGE_LIST.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[CatalogViewType.DOUBLE_STACKED_LIST.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[CatalogViewType.DOUBLE_STACKED_LIST_MINIMALISTIC_CARD.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[CatalogViewType.MUSIC_CHART_LIST.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[CatalogViewType.LIST_FRIENDS_SUGGEST.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[CatalogViewType.FRIENDS_REQUEST.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[CatalogViewType.FRIENDS_UNREAD_REQUEST.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[CatalogViewType.LIST_FRIENDS_REQUESTS.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[CatalogViewType.LIST_FRIENDS_REQUESTS_OUT.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[CatalogViewType.FRIENDS_BIRTHDAYS_LIST.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[CatalogViewType.HEADER.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[CatalogViewType.HEADER_COMPACT.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[CatalogViewType.HEADER_LARGE.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[CatalogViewType.LIST_PICKER.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[CatalogViewType.SMALL_LIST.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[CatalogViewType.LISTENED_LIST.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[CatalogViewType.VERTICAL_GRID.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[CatalogViewType.CATEGORIES_LIST.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_SEARCH_LIST.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[CatalogViewType.STACKED_LIST.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[CatalogViewType.LIST_STICKERS_PREVIEW.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[CatalogViewType.SEPARATOR.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[CatalogViewType.SEPARATOR_COMPACT.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[CatalogViewType.PLACEHOLDER.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[CatalogViewType.PLACEHOLDER_BIG.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[CatalogViewType.PLACEHOLDER_SMALL.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[CatalogViewType.PLACEHOLDER_ILLEGAL_QUERY.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[CatalogViewType.PLACEHOLDER_VIDEO_EMPTY_SHORT_VIDEO.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_PLACEHOLDER.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[CatalogViewType.PLACEHOLDER_IMAGE_WARNING.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[CatalogViewType.HELP_HINT_BANNER.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        CatalogViewType[] h = h();
        $VALUES = h;
        $ENTRIES = e370.d(h);
        Companion = new a();
    }

    public CatalogViewType() {
        throw null;
    }

    public CatalogViewType(String str, int i, String str2) {
        this.id = str2;
        this.debug = null;
    }

    public static final /* synthetic */ CatalogViewType[] h() {
        return new CatalogViewType[]{LIST, HEADER, HEADER_COMPACT, HEADER_EXTENDED, ARTIST_HEADER, HEADER_LARGE, SEPARATOR, SEPARATOR_COMPACT, BUTTON, LARGE_LIST, SMALL_LIST, HORIZONTAL_BUTTONS_STACK, DOUBLE_STACKED_LIST, DOUBLE_STACKED_LIST_MINIMALISTIC_CARD, SHORT_DOUBLE_STACKED_LIST, COMPACT_LIST, STACKED_LIST, SHORT_VIDEO_LIST, SLIDER, SLIDER_EVENT, SLIDER_CARD, SLIDER_MINIMALISTIC_CARD, DOUBLE_STACKED_SLIDER_MINIMALISTIC_CARD, SMALL_SLIDER, ICONS_SLIDER, STICKERS_SLIDER_ONLY_PRICE, STICKERS_LARGE_SLIDER_ONLY_PRICE, LIST_STICKERS_PREVIEW, PLACEHOLDER_VIDEO_EMPTY_SHORT_VIDEO, VIDEO_SLIDER, SLIDER_CARD_INFINITE, SLIDER_WITH_VERTICAL_VIDEOS, FLOOR_CLIPS, SEARCH_FLOOR_CLIPS, CAROUSEL_CLIPS, SEARCH_CAROUSEL_CLIPS, CAROUSEL_CLIPS_WITH_SUBSCRIPTIONS, SLIDER_VERTICAL_VIDEOS_NO_AUTOPLAY, LARGE_SLIDER_WITH_VERTICAL_VIDEOS, LARGE_SLIDER, SLIDER_INFINITE, RECOMMS_SLIDER, ARTISTS_SLIDER, CROP_SLIDER, LARGE_SLIDER_INFINITE, LARGE_LIST_INFINITE, DOUBLE_STACKED_SLIDER, TRIPLE_STACKED_SLIDER, TRIPLE_STACKED_SLIDER_PICKER, MUSIC_CHART_TRIPLE_STACKED_SLIDER, MUSIC_CHART_LIST, MUSIC_CHART_LARGE_SLIDER, MUSIC_MAIN_NAVIGATION, LIST_PICKER, PROMO_BANNERS_SLIDER, PROMO_BANNERS_SLIDER_INFINITE, PODCAST_BANNERS_SLIDER, PODCAST_BANNERS_SLIDER_INFINITE, PODCAST_FAVORITES, PODCAST_CATEGORY_GENRE_BUTTONS, PODCAST_EXTENDED_SLIDER, MY_SHELF_PLAYABLE_ITEM, BANNER, TEXT, FEATURED_LIST, SYNTHETIC_TABS, PLACEHOLDER_SMALL, PLACEHOLDER_BIG, PLACEHOLDER, PLACEHOLDER_IMAGE_WARNING, PLACEHOLDER_ILLEGAL_QUERY, MUSIC_PLACEHOLDER_OFFLINE_SYNC, ASSISTANT_BANNER, AI_ASSISTANT_ENTRYPOINT, NOTIFICATION, BUTTONS_HORIZONTAL, BUTTONS_HORIZONTAL_WITH_SCROLL, FIENDS_HORIZONTAL_ACTION, PREVIEW, TITLE_SUBTITLE_AVATAR, DOUBLE_LIST, GRID, VERTICAL_GRID, LIST_FRIENDS_SUGGEST, HORIZONTAL_LIST_FRIEND_SUGGESTS, LIST_MYFOLLOWERS, FRIENDS_REQUEST, FRIENDS_UNREAD_REQUEST, FRIENDS_BIRTHDAYS_LIST, LIST_FRIENDS_REQUESTS, LIST_FRIENDS_REQUESTS_OUT, FRIENDS_ACTION_LIST_ITEM, FRIENDS_BUTTON_LIST_WIDE, MUSIC_NEWSFEED_TITLE, AUDIO_STREAM_MIX, AUDIO_STREAM_MIX_INTERACTIVE, PLAYLIST_SMALL, ENTITY_DOUBLE_GRID, AUDIO_CONTENT_CARD_EXTENDED_SLIDER, OWNER_CELL, USER_PROFILE, SMALL_BANNER_OFFER, CATEGORIES_LIST, CATEGORIES_GRID, CHIPS, FILTER_BUTTON, MAP_PREVIEW, SYNTHETIC_ACTION_OPEN_DIALOG, SYNTHETIC_ACTION_MAKE_CALL, SYNTHETIC_ACTION_REMOVE_FRIEND, SYNTHETIC_ACTION_OPEN_GIFTS, SYNTHETIC_ACTION_SHOW_OPTIONS, LISTENED_LIST, LIST_WITH_NOTIFICATION_STATE, LIST_WITH_RETURN_STATE, MUSIC_EXCLUSIVE_SLIDER, VIDEO_TABS_ALBUM_LIST, SYNTHETIC_ACTION_START_LIVE_STREAM, SYNTHETIC_ACTION_ADD_VIDEOS, SYNTHETIC_ACTION_TOGGLE_ALBUM_SHUFFLE, SYNTHETIC_ACTION_OPEN_QOE_SURVEY, SYNTHETIC_ACTION_FOLLOW, SYNTHETIC_ACTION_CREATE_ALBUM, SYNTHETIC_ACTION_CREATE_PLAYLIST, SYNTHETIC_ACTION_PLAY_MIX, SYNTHETIC_ACTION_ARTIST_MIX, SYNTHETIC_ACTION_ARTIST_MIX_BLURRED, SYNTHETIC_ACTION_PLAY_AUDIO_FROM_BLOCK, SYNTHETIC_ACTION_PLAY_SHUFFLED_AUDIO_FROM_BLOCK, SYNTHETIC_ACTION_SAVE_AS_PLAYLIST, SYNTHETIC_ACTION_LOGIN, SYNTHETIC_ACTION_LOGOUT, SYNTHETIC_ACTION_UPLOAD_VIDEO, SYNTHETIC_ACTION_UPLOAD_CLIP, SYNTHETIC_ACTION_TOGGLE_PLAYLIST_SUBSCRIPTION, SYNTHETIC_ACTION_ADD_FRIEND, SYNTHETIC_ACTION_SCAN_QR, SYNTHETIC_ACTION_IMPORT_CONTACTS, SYNTHETIC_ACTION_ADD_FRIENDS, SYNTHETIC_ACTION_FRIENDS_CLEANUP, SYNTHETIC_ACTION_OPEN_SCREEN, SYNTHETIC_ACTION_OPEN_SCREEN_LARGE, SYNTHETIC_ACTION_OPEN_TAB, SYNTHETIC_ACTION_EXPAND_BLOCK, SYNTHETIC_ACTION_FRIENDS_SORT_MODES, SYNTHETIC_ACTION_SELECT_SORTING, SYNTHETIC_ACTION_ADV_URL, SYNTHETIC_ACTION_CREATE_GROUP, SYNTHETIC_ACTION_OPEN_URL, SYNTHETIC_ACTION_OPEN_URL_SLIDER, SYNTHETIC_ACTION_OPEN_URL_BOTTOM, SYNTHETIC_ACTION_SWITCH_SECTION, SYNTHETIC_ACTION_SWITCH_ACCOUNT, SYNTHETIC_ACTION_GO_TO_OWNER, SYNTHETIC_ACTION_CLOSE_BANNER, SYNTHETIC_ACTION_UNFOLLOW_ARTIST, SYNTHETIC_ACTION_UNFOLLOW_CURATOR, SYNTHETIC_ACTION_TOGGLE_SUBSCRIPTION_CURATOR, SYNTHETIC_ACTION_MUSIC_FOLLOW_OWNER, SYNTHETIC_ACTION_UNFOLLOW_OWNER, SYNTHETIC_ACTION_MARKET_EDIT_ALBUM, SYNTHETIC_DND_ACTION_EDIT, SYNTHETIC_DND_ACTION_REORDER, SYNTHETIC_ACTION_OPEN_SECTION, SYNTHETIC_ACTION_OPEN_SECTION_CHIP, SYNTHETIC_ACTION_MY_AUDIOS_SECTION_OPTIONS, SYNTHETIC_ACTION_OPEN_SECTION_SLIDER_DEFAULT, SYNTHETIC_ACTION_OPEN_SECTION_SLIDER_VIDEOS, SYNTHETIC_ACTION_OPEN_SECTION_SLIDER_MARKET_ITEMS, SYNTHETIC_SUBNAVIGATION_CONTAINER, SUBNAVIGATION_BAR, SYNTHETIC_ACTION_OPEN_MODAL, SYNTHETIC_ACTION_OPEN_INFO_POPUP, SYNTHETIC_HEADER_CLEAR_RECENTS, SYNTHETIC_HEADER_CLEAR_RECENTS_COMPACT, SYNTHETIC_HEADER_CLEAR_RECENTS_LARGE, SYNTHETIC_HEADER_CLEAR_TRACKS, SYNTHETIC_VIDEO_VIDEOS_LARGE_LIST_NO_AUTOPLAY, SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1, SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5, SYNTHETIC_VIDEO_VIDEOS_RATIO_1_1_NO_AUTOPLAY, SYNTHETIC_VIDEO_VIDEOS_RATIO_4_5_NO_AUTOPLAY, SYNTHETIC_VIDEO_VIDEOS_FIT, SYNTHETIC_VIDEO_VIDEOS_HIDE, SYNTHETIC_VIDEO_VIDEOS_STACKED_HIDE, SYNTHETIC_VIDEO_VIDEOS_SLIDER_HIDE, SYNTHETIC_FEEDBACKS, SYNTHETIC_VIDEO_VIDEOS_UPLOAD, SYNTHETIC_CATALOG, SYNTHETIC_HEADER_SECTION, SYNTHETIC_SEARCH_LIST, SYNTHETIC_LIST_FOLLOWERS, SYNTHETIC_VIDEO_VIDEOS_INTERACTIVE, SYNTHETIC_VIDEO_SLIDER_INTERACTIVE, SYNTHETIC_CLIP_SEARCH_SUGGESTION_HEADER, SYNTHETIC_SEARCH_MAP_HEADER, SYNTHETIC_OFFLINE_MUSIC_STATUS_PLACEHOLDER, SYNTHETIC_OFFLINE_PODCASTS_SECTION_PLACEHOLDER, SYNTHETIC_OFFLINE_AUDIO_BOOKS_SECTION_PLACEHOLDER, SYNTHETIC_OFFLINE_MAIN_TRACKS_SECTION_PLACEHOLDER, SYNTHETIC_OFFLINE_MUSIC_SUBSCRIPTION_SMALL, SYNTHETIC_OFFLINE_MUSIC_SUBSCRIPTION_BIG, SYNTHETIC_OFFLINE_MUSIC_SUBSCRIPTION_BTN, SYNTHETIC_MUSIC_TRACK_LIST, SYNTHETIC_MUSIC_DOWNLOADS_LIST, SYNTHETIC_MUSIC_OFFLINE_TRACKS_LIST, SYNTHETIC_MUSIC_OFFLINE_PLAYLISTS_LIST, SYNTHETIC_SEARCH_GROUP_ITEMS_LIST, SYNTHETIC_GROUP_ITEM_BIG, SYNTHETIC_STAGGERED_TRIPLE_STACKED_SLIDER, SYNTHETIC_SEPARATOR_TRANSPARENT, SYNTHETIC_SEPARATOR_THIN, SYNTHETIC_SEPARATOR_ISLAND, SYNTHETIC_SEPARATOR_ISLAND_TRANSPARENT, SYNTHETIC_SEPARATOR_OVERLAP, SYNTHETIC_PLACEHOLDER, SYNTHETIC_MINITAB, SYNTHETIC_SPORT_WIDGET_SLIDER, SYNTHETIC_SPORT_WIDGET_LIST, SNIPPETS_BANNER, CATALOG_BANNER, INVISIBLE, EMPTY, SUBSECTION_TABS, SUBSECTION_FILTER_BUTTON, SYNTHETIC_LEGAL_NOTICE, VIDEO_OWNER_GROUPS, VIDEO_BECOME_AUTHOR, VIDEO_AUTHOR_CABINET, VIDEO_CHILD_MODE, VIDEO_CHANGE_PROFILE, VIDEO_GO_TO_AUTHOR, KIDS_COLLECTION, KIDS_CATALOG, DYNAMIC_GRID, HELP_HINT_BANNER, ARTIST_MERCH_SLIDER, BIOGRAPHY_LAYOUT, SHOWCASE_LIST, HORIZONTAL_SHOWCASE_STACK, PUBLISH_LOADING_VIDEOS, DELAYED_LOADING_VIDEOS, CLIP_DRAFTS, VIDEO_MUSIC_STREAM_MIX, AD_BANNER_SHOWCASE, AD_BANNER, SUPERAPP_TRAFFIC_GROUP_BANNER, UNKNOWN};
    }

    public static zrp<CatalogViewType> i() {
        return $ENTRIES;
    }

    public static CatalogViewType valueOf(String str) {
        return (CatalogViewType) Enum.valueOf(CatalogViewType.class, str);
    }

    public static CatalogViewType[] values() {
        return (CatalogViewType[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }

    public final boolean j() {
        switch (b.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                return true;
            case 5:
            default:
                return false;
        }
    }

    public final boolean k() {
        int i = b.$EnumSwitchMapping$0[ordinal()];
        return i == 4 || i == 5 || i == 12 || i == 18 || i == 48;
    }

    public final boolean l() {
        int i = b.$EnumSwitchMapping$0[ordinal()];
        return i == 69 || i == 70;
    }

    public final boolean m() {
        int i = b.$EnumSwitchMapping$0[ordinal()];
        return i == 7 || i == 8 || i == 9;
    }

    public final boolean n() {
        int i = b.$EnumSwitchMapping$0[ordinal()];
        if (i == 5) {
            return true;
        }
        switch (i) {
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return true;
            default:
                return false;
        }
    }
}
