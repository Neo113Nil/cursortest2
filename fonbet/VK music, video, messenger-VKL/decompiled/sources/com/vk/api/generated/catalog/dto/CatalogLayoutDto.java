package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.BuildConfig;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.media.dto.MediaPopupDto;
import com.vk.dto.common.id.UserId;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.version_info.VersionConstants;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.methods.users.changePassword.ChangePasswordApiRequestV1;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.dn;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CatalogLayoutDto.kt */
/* loaded from: classes14.dex */
public final class CatalogLayoutDto implements Parcelable {
    public static final Parcelable.Creator<CatalogLayoutDto> CREATOR = new a();

    @pmi0("custom_style")
    private final String customStyle;

    @pmi0("grid_layout")
    private final List<List<String>> gridLayout;

    @pmi0("icon")
    private final String icon;

    @pmi0("infinite_repeat")
    private final Boolean infiniteRepeat;

    @pmi0("items_ignorable")
    private final BaseBoolIntDto itemsIgnorable;

    @pmi0("merge_items")
    private final Boolean mergeItems;

    @pmi0("name")
    private final NameDto name;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("placeholder_meta")
    private final MediaPopupDto placeholderMeta;

    @pmi0("size")
    private final SizeDto size;

    @pmi0(TtmlNode.TAG_STYLE)
    private final StyleDto style;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("top_title")
    private final CatalogLayoutTopTitleDto topTitle;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogLayoutDto.kt */
    /* loaded from: classes.dex */
    public static final class NameDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NameDto[] $VALUES;

        @pmi0("ad_banner")
        public static final NameDto AD_BANNER;

        @pmi0("ai_assistant_entrypoint")
        public static final NameDto AI_ASSISTANT_ENTRYPOINT;

        @pmi0("artists_slider")
        public static final NameDto ARTISTS_SLIDER;

        @pmi0("artist_header")
        public static final NameDto ARTIST_HEADER;

        @pmi0("artist_merch_slider")
        public static final NameDto ARTIST_MERCH_SLIDER;

        @pmi0("assistant_banner")
        public static final NameDto ASSISTANT_BANNER;

        @pmi0("audio_content_card_extended_slider")
        public static final NameDto AUDIO_CONTENT_CARD_EXTENDED_SLIDER;

        @pmi0("audio_stream_mix")
        public static final NameDto AUDIO_STREAM_MIX;

        @pmi0("audio_stream_mix_interactive")
        public static final NameDto AUDIO_STREAM_MIX_INTERACTIVE;

        @pmi0("banner")
        public static final NameDto BANNER;

        @pmi0("biography_layout")
        public static final NameDto BIOGRAPHY_LAYOUT;

        @pmi0("button")
        public static final NameDto BUTTON;

        @pmi0("button_group")
        public static final NameDto BUTTON_GROUP;

        @pmi0("carousel_clips")
        public static final NameDto CAROUSEL_CLIPS;

        @pmi0("carousel_clips_with_subscriptions")
        public static final NameDto CAROUSEL_CLIPS_WITH_SUBSCRIPTIONS;

        @pmi0("catalog_banner")
        public static final NameDto CATALOG_BANNER;

        @pmi0("categories_grid")
        public static final NameDto CATEGORIES_GRID;

        @pmi0("categories_list")
        public static final NameDto CATEGORIES_LIST;

        @pmi0("chips")
        public static final NameDto CHIPS;

        @pmi0("choose_authors_modal")
        public static final NameDto CHOOSE_AUTHORS_MODAL;

        @pmi0("compact_list")
        public static final NameDto COMPACT_LIST;

        @pmi0("compact_slider")
        public static final NameDto COMPACT_SLIDER;
        public static final Parcelable.Creator<NameDto> CREATOR;

        @pmi0("crop_audio_stream_mix")
        public static final NameDto CROP_AUDIO_STREAM_MIX;

        @pmi0("crop_slider")
        public static final NameDto CROP_SLIDER;

        @pmi0("double_ended_list")
        public static final NameDto DOUBLE_ENDED_LIST;

        @pmi0("double_list")
        public static final NameDto DOUBLE_LIST;

        @pmi0("double_stacked_list")
        public static final NameDto DOUBLE_STACKED_LIST;

        @pmi0("double_stacked_list_card")
        public static final NameDto DOUBLE_STACKED_LIST_CARD;

        @pmi0("double_stacked_list_minimalistic_card")
        public static final NameDto DOUBLE_STACKED_LIST_MINIMALISTIC_CARD;

        @pmi0("double_stacked_slider")
        public static final NameDto DOUBLE_STACKED_SLIDER;

        @pmi0("double_stacked_slider_card")
        public static final NameDto DOUBLE_STACKED_SLIDER_CARD;

        @pmi0("double_stacked_slider_minimalistic_card")
        public static final NameDto DOUBLE_STACKED_SLIDER_MINIMALISTIC_CARD;

        @pmi0("dynamic_grid")
        public static final NameDto DYNAMIC_GRID;

        @pmi0("entity_double_grid")
        public static final NameDto ENTITY_DOUBLE_GRID;

        @pmi0("featured_list")
        public static final NameDto FEATURED_LIST;

        @pmi0("filter_button")
        public static final NameDto FILTER_BUTTON;

        @pmi0("floor_clips")
        public static final NameDto FLOOR_CLIPS;

        @pmi0("friends_action_list_item")
        public static final NameDto FRIENDS_ACTION_LIST_ITEM;

        @pmi0("friends_birthdays_list")
        public static final NameDto FRIENDS_BIRTHDAYS_LIST;

        @pmi0("friends_button_list_wide")
        public static final NameDto FRIENDS_BUTTON_LIST_WIDE;

        @pmi0("friends_requests")
        public static final NameDto FRIENDS_REQUESTS;

        @pmi0("friends_unread_requests")
        public static final NameDto FRIENDS_UNREAD_REQUESTS;

        @pmi0("grid")
        public static final NameDto GRID;

        @pmi0("grid_banner")
        public static final NameDto GRID_BANNER;

        @pmi0("grid_five")
        public static final NameDto GRID_FIVE;

        @pmi0("grid_four")
        public static final NameDto GRID_FOUR;

        @pmi0("grid_three")
        public static final NameDto GRID_THREE;

        @pmi0("grid_three_simmetry")
        public static final NameDto GRID_THREE_SIMMETRY;

        @pmi0("header")
        public static final NameDto HEADER;

        @pmi0("header_compact")
        public static final NameDto HEADER_COMPACT;

        @pmi0("header_extended")
        public static final NameDto HEADER_EXTENDED;

        @pmi0("header_hidden")
        public static final NameDto HEADER_HIDDEN;

        @pmi0("header_large")
        public static final NameDto HEADER_LARGE;

        @pmi0("help_hint_banner")
        public static final NameDto HELP_HINT_BANNER;

        @pmi0("horizontal_buttons")
        public static final NameDto HORIZONTAL_BUTTONS;

        @pmi0("horizontal_buttons_with_scroll")
        public static final NameDto HORIZONTAL_BUTTONS_WITH_SCROLL;

        @pmi0("horizontal_button_stack")
        public static final NameDto HORIZONTAL_BUTTON_STACK;

        @pmi0("horizontal_list_friend_suggests")
        public static final NameDto HORIZONTAL_LIST_FRIEND_SUGGESTS;

        @pmi0("horizontal_showcase_stack")
        public static final NameDto HORIZONTAL_SHOWCASE_STACK;

        @pmi0("icons_slider")
        public static final NameDto ICONS_SLIDER;

        @pmi0("invisible")
        public static final NameDto INVISIBLE;

        @pmi0("kids_catalog")
        public static final NameDto KIDS_CATALOG;

        @pmi0("kids_collection")
        public static final NameDto KIDS_COLLECTION;

        @pmi0("large_list")
        public static final NameDto LARGE_LIST;

        @pmi0("large_slider")
        public static final NameDto LARGE_SLIDER;

        @pmi0("large_slider_picker")
        public static final NameDto LARGE_SLIDER_PICKER;

        @pmi0("list")
        public static final NameDto LIST;

        @pmi0("listened_list")
        public static final NameDto LISTENED_LIST;

        @pmi0("list_friends_requests")
        public static final NameDto LIST_FRIENDS_REQUESTS;

        @pmi0("list_friends_requests_out")
        public static final NameDto LIST_FRIENDS_REQUESTS_OUT;

        @pmi0("list_friend_suggests")
        public static final NameDto LIST_FRIEND_SUGGESTS;

        @pmi0("list_myfollowers")
        public static final NameDto LIST_MYFOLLOWERS;

        @pmi0("list_picker")
        public static final NameDto LIST_PICKER;

        @pmi0("list_stickers_preview")
        public static final NameDto LIST_STICKERS_PREVIEW;

        @pmi0("list_with_notification_state")
        public static final NameDto LIST_WITH_NOTIFICATION_STATE;

        @pmi0("list_with_return_state")
        public static final NameDto LIST_WITH_RETURN_STATE;

        @pmi0(ChangePasswordApiRequestV1.PARAM_NAME_LOGOUT_ALL)
        public static final NameDto LOGOUT;

        @pmi0("map")
        public static final NameDto MAP;

        @pmi0("map_preview")
        public static final NameDto MAP_PREVIEW;

        @pmi0("market_tabs")
        public static final NameDto MARKET_TABS;

        @pmi0("music_chart_large_slider")
        public static final NameDto MUSIC_CHART_LARGE_SLIDER;

        @pmi0("music_chart_list")
        public static final NameDto MUSIC_CHART_LIST;

        @pmi0("music_chart_triple_stacked_slider")
        public static final NameDto MUSIC_CHART_TRIPLE_STACKED_SLIDER;

        @pmi0("music_exclusive_slider")
        public static final NameDto MUSIC_EXCLUSIVE_SLIDER;

        @pmi0("music_navigation")
        public static final NameDto MUSIC_NAVIGATION;

        @pmi0("music_newsfeed_title")
        public static final NameDto MUSIC_NEWSFEED_TITLE;

        @pmi0("music_playable_audios_list")
        public static final NameDto MUSIC_PLAYABLE_AUDIOS_LIST;

        @pmi0("new_icons")
        public static final NameDto NEW_ICONS;

        @pmi0("none")
        public static final NameDto NONE;

        @pmi0("owner_cell")
        public static final NameDto OWNER_CELL;

        @pmi0("placeholder")
        public static final NameDto PLACEHOLDER;

        @pmi0("placeholder_big")
        public static final NameDto PLACEHOLDER_BIG;

        @pmi0("placeholder_illegal_query")
        public static final NameDto PLACEHOLDER_ILLEGAL_QUERY;

        @pmi0("placeholder_image_warning")
        public static final NameDto PLACEHOLDER_IMAGE_WARNING;

        @pmi0("placeholder_small")
        public static final NameDto PLACEHOLDER_SMALL;

        @pmi0("placeholder_with_content")
        public static final NameDto PLACEHOLDER_WITH_CONTENT;

        @pmi0("playable_item_in_progress")
        public static final NameDto PLAYABLE_ITEM_IN_PROGRESS;

        @pmi0("playable_item_in_progress_slider")
        public static final NameDto PLAYABLE_ITEM_IN_PROGRESS_SLIDER;

        @pmi0("playlist_small")
        public static final NameDto PLAYLIST_SMALL;

        @pmi0("podcasts_extended_slider")
        public static final NameDto PODCASTS_EXTENDED_SLIDER;

        @pmi0("podcasts_favorites")
        public static final NameDto PODCASTS_FAVORITES;

        @pmi0("podcast_banners_slider")
        public static final NameDto PODCAST_BANNERS_SLIDER;

        @pmi0("podcast_category_genre_buttons")
        public static final NameDto PODCAST_CATEGORY_GENRE_BUTTONS;

        @pmi0("preview")
        public static final NameDto PREVIEW;

        @pmi0("promo_banners_slider")
        public static final NameDto PROMO_BANNERS_SLIDER;

        @pmi0("recomms_slider")
        public static final NameDto RECOMMS_SLIDER;

        @pmi0("right_menu")
        public static final NameDto RIGHT_MENU;

        @pmi0("search_carousel_clips")
        public static final NameDto SEARCH_CAROUSEL_CLIPS;

        @pmi0("search_floor_clips")
        public static final NameDto SEARCH_FLOOR_CLIPS;

        @pmi0("separator")
        public static final NameDto SEPARATOR;

        @pmi0("separator_compact")
        public static final NameDto SEPARATOR_COMPACT;

        @pmi0("short_video_double_stacked_list")
        public static final NameDto SHORT_VIDEO_DOUBLE_STACKED_LIST;

        @pmi0("short_video_grid")
        public static final NameDto SHORT_VIDEO_GRID;

        @pmi0("short_video_list")
        public static final NameDto SHORT_VIDEO_LIST;

        @pmi0("short_video_list_with_view_counter")
        public static final NameDto SHORT_VIDEO_LIST_WITH_VIEW_COUNTER;

        @pmi0("short_video_slider")
        public static final NameDto SHORT_VIDEO_SLIDER;

        @pmi0("short_video_slider_large")
        public static final NameDto SHORT_VIDEO_SLIDER_LARGE;

        @pmi0("short_video_slider_with_view_counter")
        public static final NameDto SHORT_VIDEO_SLIDER_WITH_VIEW_COUNTER;

        @pmi0("showcase_horizontal_cards")
        public static final NameDto SHOWCASE_HORIZONTAL_CARDS;

        @pmi0("showcase_list")
        public static final NameDto SHOWCASE_LIST;

        @pmi0("showcase_list_grid")
        public static final NameDto SHOWCASE_LIST_GRID;

        @pmi0("slider")
        public static final NameDto SLIDER;

        @pmi0("slider_card")
        public static final NameDto SLIDER_CARD;

        @pmi0("slider_event")
        public static final NameDto SLIDER_EVENT;

        @pmi0("slider_minimalistic_card")
        public static final NameDto SLIDER_MINIMALISTIC_CARD;

        @pmi0("small_banner_offer")
        public static final NameDto SMALL_BANNER_OFFER;

        @pmi0("small_list")
        public static final NameDto SMALL_LIST;

        @pmi0("small_slider")
        public static final NameDto SMALL_SLIDER;

        @pmi0("snippets_banner")
        public static final NameDto SNIPPETS_BANNER;

        @pmi0("stacked_list")
        public static final NameDto STACKED_LIST;

        @pmi0("stickers_large_slider_only_price")
        public static final NameDto STICKERS_LARGE_SLIDER_ONLY_PRICE;

        @pmi0("stickers_slider_only_price")
        public static final NameDto STICKERS_SLIDER_ONLY_PRICE;

        @pmi0("subnavigation_bar")
        public static final NameDto SUBNAVIGATION_BAR;

        @pmi0("subsection_tabs")
        public static final NameDto SUBSECTION_TABS;

        @pmi0("text")
        public static final NameDto TEXT;

        @pmi0("title_only")
        public static final NameDto TITLE_ONLY;

        @pmi0("title_subtitle_avatar")
        public static final NameDto TITLE_SUBTITLE_AVATAR;

        @pmi0("topshelf")
        public static final NameDto TOPSHELF;

        @pmi0("trailer")
        public static final NameDto TRAILER;

        @pmi0("triple_stacked_slider")
        public static final NameDto TRIPLE_STACKED_SLIDER;

        @pmi0("triple_stacked_slider_picker")
        public static final NameDto TRIPLE_STACKED_SLIDER_PICKER;

        @pmi0("tvchannels_list")
        public static final NameDto TVCHANNELS_LIST;

        @pmi0("user_profile")
        public static final NameDto USER_PROFILE;

        @pmi0("vertical_grid")
        public static final NameDto VERTICAL_GRID;

        @pmi0("vertical_list")
        public static final NameDto VERTICAL_LIST;

        @pmi0("video_music_stream_mix")
        public static final NameDto VIDEO_MUSIC_STREAM_MIX;

        @pmi0("video_quick_login")
        public static final NameDto VIDEO_QUICK_LOGIN;

        @pmi0("video_settings_pin")
        public static final NameDto VIDEO_SETTINGS_PIN;

        @pmi0("video_settings_playlists")
        public static final NameDto VIDEO_SETTINGS_PLAYLISTS;

        @pmi0("video_slider")
        public static final NameDto VIDEO_SLIDER;

        @pmi0("video_tabs_album_list")
        public static final NameDto VIDEO_TABS_ALBUM_LIST;
        private final String value;

        /* compiled from: CatalogLayoutDto.kt */
        public static final class a implements Parcelable.Creator<NameDto> {
            @Override // android.os.Parcelable.Creator
            public final NameDto createFromParcel(Parcel parcel) {
                return NameDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NameDto[] newArray(int i) {
                return new NameDto[i];
            }
        }

        static {
            NameDto nameDto = new NameDto("HEADER", 0, "header");
            HEADER = nameDto;
            NameDto nameDto2 = new NameDto("HEADER_COMPACT", 1, "header_compact");
            HEADER_COMPACT = nameDto2;
            NameDto nameDto3 = new NameDto("SEPARATOR", 2, "separator");
            SEPARATOR = nameDto3;
            NameDto nameDto4 = new NameDto("BUTTON", 3, "button");
            BUTTON = nameDto4;
            NameDto nameDto5 = new NameDto("SEPARATOR_COMPACT", 4, "separator_compact");
            SEPARATOR_COMPACT = nameDto5;
            NameDto nameDto6 = new NameDto("PLACEHOLDER", 5, "placeholder");
            PLACEHOLDER = nameDto6;
            NameDto nameDto7 = new NameDto("PLACEHOLDER_IMAGE_WARNING", 6, "placeholder_image_warning");
            PLACEHOLDER_IMAGE_WARNING = nameDto7;
            NameDto nameDto8 = new NameDto("PLACEHOLDER_ILLEGAL_QUERY", 7, "placeholder_illegal_query");
            PLACEHOLDER_ILLEGAL_QUERY = nameDto8;
            NameDto nameDto9 = new NameDto("PLACEHOLDER_SMALL", 8, "placeholder_small");
            PLACEHOLDER_SMALL = nameDto9;
            NameDto nameDto10 = new NameDto("PLACEHOLDER_WITH_CONTENT", 9, "placeholder_with_content");
            PLACEHOLDER_WITH_CONTENT = nameDto10;
            NameDto nameDto11 = new NameDto("LIST", 10, "list");
            LIST = nameDto11;
            NameDto nameDto12 = new NameDto("LARGE_LIST", 11, "large_list");
            LARGE_LIST = nameDto12;
            NameDto nameDto13 = new NameDto("SMALL_LIST", 12, "small_list");
            SMALL_LIST = nameDto13;
            NameDto nameDto14 = new NameDto("COMPACT_LIST", 13, "compact_list");
            COMPACT_LIST = nameDto14;
            NameDto nameDto15 = new NameDto("ARTIST_MERCH_SLIDER", 14, "artist_merch_slider");
            ARTIST_MERCH_SLIDER = nameDto15;
            NameDto nameDto16 = new NameDto("SLIDER", 15, "slider");
            SLIDER = nameDto16;
            NameDto nameDto17 = new NameDto("COMPACT_SLIDER", 16, "compact_slider");
            COMPACT_SLIDER = nameDto17;
            NameDto nameDto18 = new NameDto("LARGE_SLIDER", 17, "large_slider");
            LARGE_SLIDER = nameDto18;
            NameDto nameDto19 = new NameDto("USER_PROFILE", 18, "user_profile");
            USER_PROFILE = nameDto19;
            NameDto nameDto20 = new NameDto("DOUBLE_STACKED_SLIDER", 19, "double_stacked_slider");
            DOUBLE_STACKED_SLIDER = nameDto20;
            NameDto nameDto21 = new NameDto("TRIPLE_STACKED_SLIDER", 20, "triple_stacked_slider");
            TRIPLE_STACKED_SLIDER = nameDto21;
            NameDto nameDto22 = new NameDto("DOUBLE_STACKED_SLIDER_CARD", 21, "double_stacked_slider_card");
            DOUBLE_STACKED_SLIDER_CARD = nameDto22;
            NameDto nameDto23 = new NameDto("VIDEO_SLIDER", 22, "video_slider");
            VIDEO_SLIDER = nameDto23;
            NameDto nameDto24 = new NameDto("LIST_PICKER", 23, "list_picker");
            LIST_PICKER = nameDto24;
            NameDto nameDto25 = new NameDto("LARGE_SLIDER_PICKER", 24, "large_slider_picker");
            LARGE_SLIDER_PICKER = nameDto25;
            NameDto nameDto26 = new NameDto("MAP", 25, "map");
            MAP = nameDto26;
            NameDto nameDto27 = new NameDto("MAP_PREVIEW", 26, "map_preview");
            MAP_PREVIEW = nameDto27;
            NameDto nameDto28 = new NameDto("MUSIC_PLAYABLE_AUDIOS_LIST", 27, "music_playable_audios_list");
            MUSIC_PLAYABLE_AUDIOS_LIST = nameDto28;
            NameDto nameDto29 = new NameDto("MUSIC_CHART_TRIPLE_STACKED_SLIDER", 28, "music_chart_triple_stacked_slider");
            MUSIC_CHART_TRIPLE_STACKED_SLIDER = nameDto29;
            NameDto nameDto30 = new NameDto("MUSIC_CHART_LIST", 29, "music_chart_list");
            MUSIC_CHART_LIST = nameDto30;
            NameDto nameDto31 = new NameDto("BANNER", 30, "banner");
            BANNER = nameDto31;
            NameDto nameDto32 = new NameDto("AD_BANNER", 31, "ad_banner");
            AD_BANNER = nameDto32;
            NameDto nameDto33 = new NameDto("AI_ASSISTANT_ENTRYPOINT", 32, "ai_assistant_entrypoint");
            AI_ASSISTANT_ENTRYPOINT = nameDto33;
            NameDto nameDto34 = new NameDto("ASSISTANT_BANNER", 33, "assistant_banner");
            ASSISTANT_BANNER = nameDto34;
            NameDto nameDto35 = new NameDto(SignalingProtocol.KEY_GRID, 34, "grid");
            GRID = nameDto35;
            NameDto nameDto36 = new NameDto("DOUBLE_ENDED_LIST", 35, "double_ended_list");
            DOUBLE_ENDED_LIST = nameDto36;
            NameDto nameDto37 = new NameDto("GRID_BANNER", 36, "grid_banner");
            GRID_BANNER = nameDto37;
            NameDto nameDto38 = new NameDto("GRID_FIVE", 37, "grid_five");
            GRID_FIVE = nameDto38;
            NameDto nameDto39 = new NameDto("GRID_FOUR", 38, "grid_four");
            GRID_FOUR = nameDto39;
            NameDto nameDto40 = new NameDto("GRID_THREE", 39, "grid_three");
            GRID_THREE = nameDto40;
            NameDto nameDto41 = new NameDto("GRID_THREE_SIMMETRY", 40, "grid_three_simmetry");
            GRID_THREE_SIMMETRY = nameDto41;
            NameDto nameDto42 = new NameDto("HELP_HINT_BANNER", 41, "help_hint_banner");
            HELP_HINT_BANNER = nameDto42;
            NameDto nameDto43 = new NameDto("INVISIBLE", 42, "invisible");
            INVISIBLE = nameDto43;
            NameDto nameDto44 = new NameDto("NONE", 43, "none");
            NONE = nameDto44;
            NameDto nameDto45 = new NameDto("SHORT_VIDEO_SLIDER_LARGE", 44, "short_video_slider_large");
            SHORT_VIDEO_SLIDER_LARGE = nameDto45;
            NameDto nameDto46 = new NameDto("SHOWCASE_HORIZONTAL_CARDS", 45, "showcase_horizontal_cards");
            SHOWCASE_HORIZONTAL_CARDS = nameDto46;
            NameDto nameDto47 = new NameDto("TITLE_ONLY", 46, "title_only");
            TITLE_ONLY = nameDto47;
            NameDto nameDto48 = new NameDto("TITLE_SUBTITLE_AVATAR", 47, "title_subtitle_avatar");
            TITLE_SUBTITLE_AVATAR = nameDto48;
            NameDto nameDto49 = new NameDto("VERTICAL_LIST", 48, "vertical_list");
            VERTICAL_LIST = nameDto49;
            NameDto nameDto50 = new NameDto("PLAYLIST_SMALL", 49, "playlist_small");
            PLAYLIST_SMALL = nameDto50;
            NameDto nameDto51 = new NameDto("PREVIEW", 50, "preview");
            PREVIEW = nameDto51;
            NameDto nameDto52 = new NameDto("CATALOG_BANNER", 51, "catalog_banner");
            CATALOG_BANNER = nameDto52;
            NameDto nameDto53 = new NameDto("SMALL_BANNER_OFFER", 52, "small_banner_offer");
            SMALL_BANNER_OFFER = nameDto53;
            NameDto nameDto54 = new NameDto("FEATURED_LIST", 53, "featured_list");
            FEATURED_LIST = nameDto54;
            NameDto nameDto55 = new NameDto("CATEGORIES_LIST", 54, "categories_list");
            CATEGORIES_LIST = nameDto55;
            NameDto nameDto56 = new NameDto("CATEGORIES_GRID", 55, "categories_grid");
            CATEGORIES_GRID = nameDto56;
            NameDto nameDto57 = new NameDto("RECOMMS_SLIDER", 56, "recomms_slider");
            RECOMMS_SLIDER = nameDto57;
            NameDto nameDto58 = new NameDto("ARTISTS_SLIDER", 57, "artists_slider");
            ARTISTS_SLIDER = nameDto58;
            NameDto nameDto59 = new NameDto("BIOGRAPHY_LAYOUT", 58, "biography_layout");
            BIOGRAPHY_LAYOUT = nameDto59;
            NameDto nameDto60 = new NameDto("MUSIC_NEWSFEED_TITLE", 59, "music_newsfeed_title");
            MUSIC_NEWSFEED_TITLE = nameDto60;
            NameDto nameDto61 = new NameDto("OWNER_CELL", 60, "owner_cell");
            OWNER_CELL = nameDto61;
            NameDto nameDto62 = new NameDto("TEXT", 61, "text");
            TEXT = nameDto62;
            NameDto nameDto63 = new NameDto("TRAILER", 62, "trailer");
            TRAILER = nameDto63;
            NameDto nameDto64 = new NameDto("CHIPS", 63, "chips");
            CHIPS = nameDto64;
            NameDto nameDto65 = new NameDto("MUSIC_EXCLUSIVE_SLIDER", 64, "music_exclusive_slider");
            MUSIC_EXCLUSIVE_SLIDER = nameDto65;
            NameDto nameDto66 = new NameDto("ICONS_SLIDER", 65, "icons_slider");
            ICONS_SLIDER = nameDto66;
            NameDto nameDto67 = new NameDto("DOUBLE_LIST", 66, "double_list");
            DOUBLE_LIST = nameDto67;
            NameDto nameDto68 = new NameDto("HEADER_HIDDEN", 67, "header_hidden");
            HEADER_HIDDEN = nameDto68;
            NameDto nameDto69 = new NameDto("HEADER_LARGE", 68, "header_large");
            HEADER_LARGE = nameDto69;
            NameDto nameDto70 = new NameDto("SLIDER_CARD", 69, "slider_card");
            SLIDER_CARD = nameDto70;
            NameDto nameDto71 = new NameDto("HORIZONTAL_BUTTONS", 70, "horizontal_buttons");
            HORIZONTAL_BUTTONS = nameDto71;
            NameDto nameDto72 = new NameDto("LOGOUT", 71, ChangePasswordApiRequestV1.PARAM_NAME_LOGOUT_ALL);
            LOGOUT = nameDto72;
            NameDto nameDto73 = new NameDto("TRIPLE_STACKED_SLIDER_PICKER", 72, "triple_stacked_slider_picker");
            TRIPLE_STACKED_SLIDER_PICKER = nameDto73;
            NameDto nameDto74 = new NameDto("PROMO_BANNERS_SLIDER", 73, "promo_banners_slider");
            PROMO_BANNERS_SLIDER = nameDto74;
            NameDto nameDto75 = new NameDto("HEADER_EXTENDED", 74, "header_extended");
            HEADER_EXTENDED = nameDto75;
            NameDto nameDto76 = new NameDto("SMALL_SLIDER", 75, "small_slider");
            SMALL_SLIDER = nameDto76;
            NameDto nameDto77 = new NameDto("DOUBLE_STACKED_LIST", 76, "double_stacked_list");
            DOUBLE_STACKED_LIST = nameDto77;
            NameDto nameDto78 = new NameDto("DOUBLE_STACKED_LIST_CARD", 77, "double_stacked_list_card");
            DOUBLE_STACKED_LIST_CARD = nameDto78;
            NameDto nameDto79 = new NameDto("AUDIO_CONTENT_CARD_EXTENDED_SLIDER", 78, "audio_content_card_extended_slider");
            AUDIO_CONTENT_CARD_EXTENDED_SLIDER = nameDto79;
            NameDto nameDto80 = new NameDto("SLIDER_EVENT", 79, "slider_event");
            SLIDER_EVENT = nameDto80;
            NameDto nameDto81 = new NameDto("STACKED_LIST", 80, "stacked_list");
            STACKED_LIST = nameDto81;
            NameDto nameDto82 = new NameDto("HORIZONTAL_LIST_FRIEND_SUGGESTS", 81, "horizontal_list_friend_suggests");
            HORIZONTAL_LIST_FRIEND_SUGGESTS = nameDto82;
            NameDto nameDto83 = new NameDto("LIST_MYFOLLOWERS", 82, "list_myfollowers");
            LIST_MYFOLLOWERS = nameDto83;
            NameDto nameDto84 = new NameDto("LIST_FRIEND_SUGGESTS", 83, "list_friend_suggests");
            LIST_FRIEND_SUGGESTS = nameDto84;
            NameDto nameDto85 = new NameDto("FRIENDS_REQUESTS", 84, "friends_requests");
            FRIENDS_REQUESTS = nameDto85;
            NameDto nameDto86 = new NameDto("FRIENDS_UNREAD_REQUESTS", 85, "friends_unread_requests");
            FRIENDS_UNREAD_REQUESTS = nameDto86;
            NameDto nameDto87 = new NameDto("FRIENDS_BIRTHDAYS_LIST", 86, "friends_birthdays_list");
            FRIENDS_BIRTHDAYS_LIST = nameDto87;
            NameDto nameDto88 = new NameDto("LIST_FRIENDS_REQUESTS", 87, "list_friends_requests");
            LIST_FRIENDS_REQUESTS = nameDto88;
            NameDto nameDto89 = new NameDto("LIST_FRIENDS_REQUESTS_OUT", 88, "list_friends_requests_out");
            LIST_FRIENDS_REQUESTS_OUT = nameDto89;
            NameDto nameDto90 = new NameDto("FRIENDS_ACTION_LIST_ITEM", 89, "friends_action_list_item");
            FRIENDS_ACTION_LIST_ITEM = nameDto90;
            NameDto nameDto91 = new NameDto("FRIENDS_BUTTON_LIST_WIDE", 90, "friends_button_list_wide");
            FRIENDS_BUTTON_LIST_WIDE = nameDto91;
            NameDto nameDto92 = new NameDto("PODCAST_BANNERS_SLIDER", 91, "podcast_banners_slider");
            PODCAST_BANNERS_SLIDER = nameDto92;
            NameDto nameDto93 = new NameDto("PODCAST_CATEGORY_GENRE_BUTTONS", 92, "podcast_category_genre_buttons");
            PODCAST_CATEGORY_GENRE_BUTTONS = nameDto93;
            NameDto nameDto94 = new NameDto("PODCASTS_FAVORITES", 93, "podcasts_favorites");
            PODCASTS_FAVORITES = nameDto94;
            NameDto nameDto95 = new NameDto("PODCASTS_EXTENDED_SLIDER", 94, "podcasts_extended_slider");
            PODCASTS_EXTENDED_SLIDER = nameDto95;
            NameDto nameDto96 = new NameDto("SUBSECTION_TABS", 95, "subsection_tabs");
            SUBSECTION_TABS = nameDto96;
            NameDto nameDto97 = new NameDto("PLAYABLE_ITEM_IN_PROGRESS", 96, "playable_item_in_progress");
            PLAYABLE_ITEM_IN_PROGRESS = nameDto97;
            NameDto nameDto98 = new NameDto("PLAYABLE_ITEM_IN_PROGRESS_SLIDER", 97, "playable_item_in_progress_slider");
            PLAYABLE_ITEM_IN_PROGRESS_SLIDER = nameDto98;
            NameDto nameDto99 = new NameDto("LISTENED_LIST", 98, "listened_list");
            LISTENED_LIST = nameDto99;
            NameDto nameDto100 = new NameDto("MUSIC_CHART_LARGE_SLIDER", 99, "music_chart_large_slider");
            MUSIC_CHART_LARGE_SLIDER = nameDto100;
            NameDto nameDto101 = new NameDto("FILTER_BUTTON", 100, "filter_button");
            FILTER_BUTTON = nameDto101;
            NameDto nameDto102 = new NameDto("VERTICAL_GRID", 101, "vertical_grid");
            VERTICAL_GRID = nameDto102;
            NameDto nameDto103 = new NameDto("PLACEHOLDER_BIG", 102, "placeholder_big");
            PLACEHOLDER_BIG = nameDto103;
            NameDto nameDto104 = new NameDto("SNIPPETS_BANNER", 103, "snippets_banner");
            SNIPPETS_BANNER = nameDto104;
            NameDto nameDto105 = new NameDto("LIST_WITH_NOTIFICATION_STATE", 104, "list_with_notification_state");
            LIST_WITH_NOTIFICATION_STATE = nameDto105;
            NameDto nameDto106 = new NameDto("LIST_WITH_RETURN_STATE", 105, "list_with_return_state");
            LIST_WITH_RETURN_STATE = nameDto106;
            NameDto nameDto107 = new NameDto("SLIDER_MINIMALISTIC_CARD", Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, "slider_minimalistic_card");
            SLIDER_MINIMALISTIC_CARD = nameDto107;
            NameDto nameDto108 = new NameDto("DOUBLE_STACKED_SLIDER_MINIMALISTIC_CARD", ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, "double_stacked_slider_minimalistic_card");
            DOUBLE_STACKED_SLIDER_MINIMALISTIC_CARD = nameDto108;
            NameDto nameDto109 = new NameDto("DOUBLE_STACKED_LIST_MINIMALISTIC_CARD", 108, "double_stacked_list_minimalistic_card");
            DOUBLE_STACKED_LIST_MINIMALISTIC_CARD = nameDto109;
            NameDto nameDto110 = new NameDto("CROP_SLIDER", 109, "crop_slider");
            CROP_SLIDER = nameDto110;
            NameDto nameDto111 = new NameDto("AUDIO_STREAM_MIX", 110, "audio_stream_mix");
            AUDIO_STREAM_MIX = nameDto111;
            NameDto nameDto112 = new NameDto("AUDIO_STREAM_MIX_INTERACTIVE", 111, "audio_stream_mix_interactive");
            AUDIO_STREAM_MIX_INTERACTIVE = nameDto112;
            NameDto nameDto113 = new NameDto("CROP_AUDIO_STREAM_MIX", 112, "crop_audio_stream_mix");
            CROP_AUDIO_STREAM_MIX = nameDto113;
            NameDto nameDto114 = new NameDto("VIDEO_MUSIC_STREAM_MIX", 113, "video_music_stream_mix");
            VIDEO_MUSIC_STREAM_MIX = nameDto114;
            NameDto nameDto115 = new NameDto("SHORT_VIDEO_LIST", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, "short_video_list");
            SHORT_VIDEO_LIST = nameDto115;
            NameDto nameDto116 = new NameDto("SHORT_VIDEO_SLIDER", Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, "short_video_slider");
            SHORT_VIDEO_SLIDER = nameDto116;
            NameDto nameDto117 = new NameDto("FLOOR_CLIPS", 116, "floor_clips");
            FLOOR_CLIPS = nameDto117;
            NameDto nameDto118 = new NameDto("SEARCH_FLOOR_CLIPS", Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, "search_floor_clips");
            SEARCH_FLOOR_CLIPS = nameDto118;
            NameDto nameDto119 = new NameDto("CAROUSEL_CLIPS", Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, "carousel_clips");
            CAROUSEL_CLIPS = nameDto119;
            NameDto nameDto120 = new NameDto("SEARCH_CAROUSEL_CLIPS", Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, "search_carousel_clips");
            SEARCH_CAROUSEL_CLIPS = nameDto120;
            NameDto nameDto121 = new NameDto("CAROUSEL_CLIPS_WITH_SUBSCRIPTIONS", 120, "carousel_clips_with_subscriptions");
            CAROUSEL_CLIPS_WITH_SUBSCRIPTIONS = nameDto121;
            NameDto nameDto122 = new NameDto("VIDEO_SETTINGS_PIN", Sdk.SDKError.Reason.TPAT_ERROR_VALUE, "video_settings_pin");
            VIDEO_SETTINGS_PIN = nameDto122;
            NameDto nameDto123 = new NameDto("VIDEO_SETTINGS_PLAYLISTS", Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, "video_settings_playlists");
            VIDEO_SETTINGS_PLAYLISTS = nameDto123;
            NameDto nameDto124 = new NameDto("VIDEO_QUICK_LOGIN", 123, "video_quick_login");
            VIDEO_QUICK_LOGIN = nameDto124;
            NameDto nameDto125 = new NameDto("ENTITY_DOUBLE_GRID", Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, "entity_double_grid");
            ENTITY_DOUBLE_GRID = nameDto125;
            NameDto nameDto126 = new NameDto("RIGHT_MENU", 125, "right_menu");
            RIGHT_MENU = nameDto126;
            NameDto nameDto127 = new NameDto("SHORT_VIDEO_SLIDER_WITH_VIEW_COUNTER", Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, "short_video_slider_with_view_counter");
            SHORT_VIDEO_SLIDER_WITH_VIEW_COUNTER = nameDto127;
            NameDto nameDto128 = new NameDto("SHORT_VIDEO_LIST_WITH_VIEW_COUNTER", 127, "short_video_list_with_view_counter");
            SHORT_VIDEO_LIST_WITH_VIEW_COUNTER = nameDto128;
            NameDto nameDto129 = new NameDto("CHOOSE_AUTHORS_MODAL", 128, "choose_authors_modal");
            CHOOSE_AUTHORS_MODAL = nameDto129;
            NameDto nameDto130 = new NameDto("MARKET_TABS", 129, "market_tabs");
            MARKET_TABS = nameDto130;
            NameDto nameDto131 = new NameDto("KIDS_CATALOG", 130, "kids_catalog");
            KIDS_CATALOG = nameDto131;
            NameDto nameDto132 = new NameDto("KIDS_COLLECTION", Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, "kids_collection");
            KIDS_COLLECTION = nameDto132;
            NameDto nameDto133 = new NameDto("MUSIC_NAVIGATION", Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, "music_navigation");
            MUSIC_NAVIGATION = nameDto133;
            NameDto nameDto134 = new NameDto("TVCHANNELS_LIST", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "tvchannels_list");
            TVCHANNELS_LIST = nameDto134;
            NameDto nameDto135 = new NameDto("TOPSHELF", 134, "topshelf");
            TOPSHELF = nameDto135;
            NameDto nameDto136 = new NameDto("DYNAMIC_GRID", 135, "dynamic_grid");
            DYNAMIC_GRID = nameDto136;
            NameDto nameDto137 = new NameDto("HORIZONTAL_BUTTONS_WITH_SCROLL", Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, "horizontal_buttons_with_scroll");
            HORIZONTAL_BUTTONS_WITH_SCROLL = nameDto137;
            NameDto nameDto138 = new NameDto("HORIZONTAL_BUTTON_STACK", Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "horizontal_button_stack");
            HORIZONTAL_BUTTON_STACK = nameDto138;
            NameDto nameDto139 = new NameDto("VIDEO_TABS_ALBUM_LIST", 138, "video_tabs_album_list");
            VIDEO_TABS_ALBUM_LIST = nameDto139;
            NameDto nameDto140 = new NameDto("SHOWCASE_LIST", 139, "showcase_list");
            SHOWCASE_LIST = nameDto140;
            NameDto nameDto141 = new NameDto("BUTTON_GROUP", VersionConstants.PRODUCT_MAJOR_VERSION, "button_group");
            BUTTON_GROUP = nameDto141;
            NameDto nameDto142 = new NameDto("SHOWCASE_LIST_GRID", 141, "showcase_list_grid");
            SHOWCASE_LIST_GRID = nameDto142;
            NameDto nameDto143 = new NameDto("HORIZONTAL_SHOWCASE_STACK", 142, "horizontal_showcase_stack");
            HORIZONTAL_SHOWCASE_STACK = nameDto143;
            NameDto nameDto144 = new NameDto("SHORT_VIDEO_DOUBLE_STACKED_LIST", 143, "short_video_double_stacked_list");
            SHORT_VIDEO_DOUBLE_STACKED_LIST = nameDto144;
            NameDto nameDto145 = new NameDto("NEW_ICONS", 144, "new_icons");
            NEW_ICONS = nameDto145;
            NameDto nameDto146 = new NameDto("STICKERS_SLIDER_ONLY_PRICE", 145, "stickers_slider_only_price");
            STICKERS_SLIDER_ONLY_PRICE = nameDto146;
            NameDto nameDto147 = new NameDto("STICKERS_LARGE_SLIDER_ONLY_PRICE", 146, "stickers_large_slider_only_price");
            STICKERS_LARGE_SLIDER_ONLY_PRICE = nameDto147;
            NameDto nameDto148 = new NameDto("ARTIST_HEADER", 147, "artist_header");
            ARTIST_HEADER = nameDto148;
            NameDto nameDto149 = new NameDto("SUBNAVIGATION_BAR", 148, "subnavigation_bar");
            SUBNAVIGATION_BAR = nameDto149;
            NameDto nameDto150 = new NameDto("LIST_STICKERS_PREVIEW", 149, "list_stickers_preview");
            LIST_STICKERS_PREVIEW = nameDto150;
            NameDto nameDto151 = new NameDto("SHORT_VIDEO_GRID", 150, "short_video_grid");
            SHORT_VIDEO_GRID = nameDto151;
            NameDto[] nameDtoArr = {nameDto, nameDto2, nameDto3, nameDto4, nameDto5, nameDto6, nameDto7, nameDto8, nameDto9, nameDto10, nameDto11, nameDto12, nameDto13, nameDto14, nameDto15, nameDto16, nameDto17, nameDto18, nameDto19, nameDto20, nameDto21, nameDto22, nameDto23, nameDto24, nameDto25, nameDto26, nameDto27, nameDto28, nameDto29, nameDto30, nameDto31, nameDto32, nameDto33, nameDto34, nameDto35, nameDto36, nameDto37, nameDto38, nameDto39, nameDto40, nameDto41, nameDto42, nameDto43, nameDto44, nameDto45, nameDto46, nameDto47, nameDto48, nameDto49, nameDto50, nameDto51, nameDto52, nameDto53, nameDto54, nameDto55, nameDto56, nameDto57, nameDto58, nameDto59, nameDto60, nameDto61, nameDto62, nameDto63, nameDto64, nameDto65, nameDto66, nameDto67, nameDto68, nameDto69, nameDto70, nameDto71, nameDto72, nameDto73, nameDto74, nameDto75, nameDto76, nameDto77, nameDto78, nameDto79, nameDto80, nameDto81, nameDto82, nameDto83, nameDto84, nameDto85, nameDto86, nameDto87, nameDto88, nameDto89, nameDto90, nameDto91, nameDto92, nameDto93, nameDto94, nameDto95, nameDto96, nameDto97, nameDto98, nameDto99, nameDto100, nameDto101, nameDto102, nameDto103, nameDto104, nameDto105, nameDto106, nameDto107, nameDto108, nameDto109, nameDto110, nameDto111, nameDto112, nameDto113, nameDto114, nameDto115, nameDto116, nameDto117, nameDto118, nameDto119, nameDto120, nameDto121, nameDto122, nameDto123, nameDto124, nameDto125, nameDto126, nameDto127, nameDto128, nameDto129, nameDto130, nameDto131, nameDto132, nameDto133, nameDto134, nameDto135, nameDto136, nameDto137, nameDto138, nameDto139, nameDto140, nameDto141, nameDto142, nameDto143, nameDto144, nameDto145, nameDto146, nameDto147, nameDto148, nameDto149, nameDto150, nameDto151};
            $VALUES = nameDtoArr;
            $ENTRIES = new asp(nameDtoArr);
            CREATOR = new a();
        }

        private NameDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static NameDto valueOf(String str) {
            return (NameDto) Enum.valueOf(NameDto.class, str);
        }

        public static NameDto[] values() {
            return (NameDto[]) $VALUES.clone();
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
    /* compiled from: CatalogLayoutDto.kt */
    public static final class SizeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SizeDto[] $VALUES;
        public static final Parcelable.Creator<SizeDto> CREATOR;

        @pmi0("extra_large")
        public static final SizeDto EXTRA_LARGE;

        @pmi0("extra_small")
        public static final SizeDto EXTRA_SMALL;

        @pmi0("large")
        public static final SizeDto LARGE;

        @pmi0("medium")
        public static final SizeDto MEDIUM;

        @pmi0("no_insets")
        public static final SizeDto NO_INSETS;

        @pmi0("small")
        public static final SizeDto SMALL;

        @pmi0("2_extra_large")
        public static final SizeDto TYPE_2_EXTRA_LARGE;

        @pmi0("2_extra_small")
        public static final SizeDto TYPE_2_EXTRA_SMALL;

        @pmi0("3_extra_large")
        public static final SizeDto TYPE_3_EXTRA_LARGE;

        @pmi0("4_extra_large")
        public static final SizeDto TYPE_4_EXTRA_LARGE;
        private final String value;

        /* compiled from: CatalogLayoutDto.kt */
        public static final class a implements Parcelable.Creator<SizeDto> {
            @Override // android.os.Parcelable.Creator
            public final SizeDto createFromParcel(Parcel parcel) {
                return SizeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SizeDto[] newArray(int i) {
                return new SizeDto[i];
            }
        }

        static {
            SizeDto sizeDto = new SizeDto("SMALL", 0, "small");
            SMALL = sizeDto;
            SizeDto sizeDto2 = new SizeDto("MEDIUM", 1, "medium");
            MEDIUM = sizeDto2;
            SizeDto sizeDto3 = new SizeDto("LARGE", 2, "large");
            LARGE = sizeDto3;
            SizeDto sizeDto4 = new SizeDto("NO_INSETS", 3, "no_insets");
            NO_INSETS = sizeDto4;
            SizeDto sizeDto5 = new SizeDto("EXTRA_SMALL", 4, "extra_small");
            EXTRA_SMALL = sizeDto5;
            SizeDto sizeDto6 = new SizeDto("EXTRA_LARGE", 5, "extra_large");
            EXTRA_LARGE = sizeDto6;
            SizeDto sizeDto7 = new SizeDto("TYPE_2_EXTRA_SMALL", 6, "2_extra_small");
            TYPE_2_EXTRA_SMALL = sizeDto7;
            SizeDto sizeDto8 = new SizeDto("TYPE_2_EXTRA_LARGE", 7, "2_extra_large");
            TYPE_2_EXTRA_LARGE = sizeDto8;
            SizeDto sizeDto9 = new SizeDto("TYPE_3_EXTRA_LARGE", 8, "3_extra_large");
            TYPE_3_EXTRA_LARGE = sizeDto9;
            SizeDto sizeDto10 = new SizeDto("TYPE_4_EXTRA_LARGE", 9, "4_extra_large");
            TYPE_4_EXTRA_LARGE = sizeDto10;
            SizeDto[] sizeDtoArr = {sizeDto, sizeDto2, sizeDto3, sizeDto4, sizeDto5, sizeDto6, sizeDto7, sizeDto8, sizeDto9, sizeDto10};
            $VALUES = sizeDtoArr;
            $ENTRIES = new asp(sizeDtoArr);
            CREATOR = new a();
        }

        private SizeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static SizeDto valueOf(String str) {
            return (SizeDto) Enum.valueOf(SizeDto.class, str);
        }

        public static SizeDto[] values() {
            return (SizeDto[]) $VALUES.clone();
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
    /* compiled from: CatalogLayoutDto.kt */
    /* loaded from: classes.dex */
    public static final class StyleDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;

        @pmi0("about")
        public static final StyleDto ABOUT;

        @pmi0("about_actors")
        public static final StyleDto ABOUT_ACTORS;

        @pmi0("actors")
        public static final StyleDto ACTORS;

        @pmi0("actors_large")
        public static final StyleDto ACTORS_LARGE;

        @pmi0("anchor_top")
        public static final StyleDto ANCHOR_TOP;

        @pmi0("arrow_center_md")
        public static final StyleDto ARROW_CENTER_MD;

        @pmi0("arrow_center_sm")
        public static final StyleDto ARROW_CENTER_SM;

        @pmi0("artist_merch")
        public static final StyleDto ARTIST_MERCH;

        @pmi0("artist_mix")
        public static final StyleDto ARTIST_MIX;

        @pmi0("artist_mix_blurred")
        public static final StyleDto ARTIST_MIX_BLURRED;

        @pmi0("authors_video")
        public static final StyleDto AUTHORS_VIDEO;

        @pmi0("borderless_with_icon")
        public static final StyleDto BORDERLESS_WITH_ICON;

        @pmi0("card")
        public static final StyleDto CARD;

        @pmi0("cell_button_centered_icon")
        public static final StyleDto CELL_BUTTON_CENTERED_ICON;

        @pmi0("channel_header")
        public static final StyleDto CHANNEL_HEADER;

        @pmi0("channel_videos_header")
        public static final StyleDto CHANNEL_VIDEOS_HEADER;
        public static final Parcelable.Creator<StyleDto> CREATOR;

        @pmi0(BuildConfig.FLAVOR)
        public static final StyleDto DEFAULT;

        @pmi0("description")
        public static final StyleDto DESCRIPTION;

        @pmi0("description_ratings")
        public static final StyleDto DESCRIPTION_RATINGS;

        @pmi0("elongate")
        public static final StyleDto ELONGATE;

        @pmi0("extra_large")
        public static final StyleDto EXTRA_LARGE;

        @pmi0("fit")
        public static final StyleDto FIT;

        @pmi0("flat")
        public static final StyleDto FLAT;

        @pmi0("flat_theme")
        public static final StyleDto FLAT_THEME;

        @pmi0("followers")
        public static final StyleDto FOLLOWERS;

        @pmi0("found_by_lyrics")
        public static final StyleDto FOUND_BY_LYRICS;

        @pmi0("fullplay")
        public static final StyleDto FULLPLAY;

        @pmi0("fullplay_desc_pubdate_author")
        public static final StyleDto FULLPLAY_DESC_PUBDATE_AUTHOR;

        @pmi0("fullplay_desc_views")
        public static final StyleDto FULLPLAY_DESC_VIEWS;

        @pmi0("fullplay_desc_views_author")
        public static final StyleDto FULLPLAY_DESC_VIEWS_AUTHOR;

        @pmi0("genres")
        public static final StyleDto GENRES;

        @pmi0("gray")
        public static final StyleDto GRAY;

        @pmi0("grid")
        public static final StyleDto GRID;

        @pmi0("grid_item_category_square")
        public static final StyleDto GRID_ITEM_CATEGORY_SQUARE;

        @pmi0("has_unlike_button")
        public static final StyleDto HAS_UNLIKE_BUTTON;

        @pmi0("highlight")
        public static final StyleDto HIGHLIGHT;

        @pmi0("highlight_trend")
        public static final StyleDto HIGHLIGHT_TREND;

        @pmi0("horizontal")
        public static final StyleDto HORIZONTAL;

        @pmi0("horizontal_buttons")
        public static final StyleDto HORIZONTAL_BUTTONS;

        @pmi0("horizontal_tile")
        public static final StyleDto HORIZONTAL_TILE;

        @pmi0("icon_title_button_primary_color")
        public static final StyleDto ICON_TITLE_BUTTON_PRIMARY_COLOR;

        @pmi0("invisible_author")
        public static final StyleDto INVISIBLE_AUTHOR;

        @pmi0("island")
        public static final StyleDto ISLAND;

        @pmi0("island_transparent")
        public static final StyleDto ISLAND_TRANSPARENT;

        @pmi0("large")
        public static final StyleDto LARGE;

        @pmi0("large_with_icon")
        public static final StyleDto LARGE_WITH_ICON;

        @pmi0("legal_notice")
        public static final StyleDto LEGAL_NOTICE;

        @pmi0("magic_wand")
        public static final StyleDto MAGIC_WAND;

        @pmi0("market_item_community")
        public static final StyleDto MARKET_ITEM_COMMUNITY;

        @pmi0("more_remove")
        public static final StyleDto MORE_REMOVE;

        @pmi0("my_music")
        public static final StyleDto MY_MUSIC;

        @pmi0("my_music_filters")
        public static final StyleDto MY_MUSIC_FILTERS;

        @pmi0("negative")
        public static final StyleDto NEGATIVE;

        @pmi0("new_icons")
        public static final StyleDto NEW_ICONS;

        @pmi0("open_section_arrow_button")
        public static final StyleDto OPEN_SECTION_ARROW_BUTTON;

        @pmi0("outline_with_chevron")
        public static final StyleDto OUTLINE_WITH_CHEVRON;

        @pmi0("overlap")
        public static final StyleDto OVERLAP;

        @pmi0("placeholder_with_only_title")
        public static final StyleDto PLACEHOLDER_WITH_ONLY_TITLE;

        @pmi0("playlist_showcase")
        public static final StyleDto PLAYLIST_SHOWCASE;

        @pmi0("posters")
        public static final StyleDto POSTERS;

        @pmi0("posters_and_trailer")
        public static final StyleDto POSTERS_AND_TRAILER;

        @pmi0("profile_followers")
        public static final StyleDto PROFILE_FOLLOWERS;

        @pmi0("profile_header")
        public static final StyleDto PROFILE_HEADER;

        @pmi0("rail")
        public static final StyleDto RAIL;

        @pmi0("ratings")
        public static final StyleDto RATINGS;

        @pmi0("recommended_playlists_blurred")
        public static final StyleDto RECOMMENDED_PLAYLISTS_BLURRED;

        @pmi0("rich_cell")
        public static final StyleDto RICH_CELL;

        @pmi0("right_button")
        public static final StyleDto RIGHT_BUTTON;

        @pmi0("search")
        public static final StyleDto SEARCH;

        @pmi0("search_navigation_link")
        public static final StyleDto SEARCH_NAVIGATION_LINK;

        @pmi0(X3.i.Y)
        public static final StyleDto SECONDARY;

        @pmi0("secondary_small")
        public static final StyleDto SECONDARY_SMALL;

        @pmi0("showcase")
        public static final StyleDto SHOWCASE;

        @pmi0("showcase_ad_banner")
        public static final StyleDto SHOWCASE_AD_BANNER;

        @pmi0("showcase_horizontal_cards")
        public static final StyleDto SHOWCASE_HORIZONTAL_CARDS;

        @pmi0("single_line")
        public static final StyleDto SINGLE_LINE;

        @pmi0("small")
        public static final StyleDto SMALL;

        @pmi0("small_flat")
        public static final StyleDto SMALL_FLAT;

        @pmi0("spacing")
        public static final StyleDto SPACING;

        @pmi0("square")
        public static final StyleDto SQUARE;

        @pmi0("square_theme")
        public static final StyleDto SQUARE_THEME;

        @pmi0("start_icon_with_chevron")
        public static final StyleDto START_ICON_WITH_CHEVRON;

        @pmi0("stretched")
        public static final StyleDto STRETCHED;

        @pmi0("teaserplay")
        public static final StyleDto TEASERPLAY;

        @pmi0("teaserplay_desc_pubdate_author")
        public static final StyleDto TEASERPLAY_DESC_PUBDATE_AUTHOR;

        @pmi0("teaserplay_desc_views")
        public static final StyleDto TEASERPLAY_DESC_VIEWS;

        @pmi0("teaserplay_desc_views_author")
        public static final StyleDto TEASERPLAY_DESC_VIEWS_AUTHOR;

        @pmi0("topshelf")
        public static final StyleDto TOPSHELF;

        @pmi0("topshelf_child_profile")
        public static final StyleDto TOPSHELF_CHILD_PROFILE;

        @pmi0("trailer")
        public static final StyleDto TRAILER;

        @pmi0(X3.i.T)
        public static final StyleDto TRANSPARENT;

        @pmi0("tvchannels")
        public static final StyleDto TVCHANNELS;

        @pmi0("two_line_header")
        public static final StyleDto TWO_LINE_HEADER;

        @pmi0("unopenable")
        public static final StyleDto UNOPENABLE;

        @pmi0("vertical")
        public static final StyleDto VERTICAL;

        @pmi0("videos_and_playlists")
        public static final StyleDto VIDEOS_AND_PLAYLISTS;

        @pmi0("video_favorites_library")
        public static final StyleDto VIDEO_FAVORITES_LIBRARY;

        @pmi0("video_library")
        public static final StyleDto VIDEO_LIBRARY;

        @pmi0("video_liked_library")
        public static final StyleDto VIDEO_LIKED_LIBRARY;

        @pmi0("video_page")
        public static final StyleDto VIDEO_PAGE;

        @pmi0("video_sub_ads_off_banner_chevrone")
        public static final StyleDto VIDEO_SUB_ADS_OFF_BANNER_CHEVRONE;

        @pmi0("video_sub_ads_off_banner_close")
        public static final StyleDto VIDEO_SUB_ADS_OFF_BANNER_CLOSE;

        @pmi0("vk_video_music_onboarding_banner")
        public static final StyleDto VK_VIDEO_MUSIC_ONBOARDING_BANNER;

        @pmi0("vk_video_onboarding_banner")
        public static final StyleDto VK_VIDEO_ONBOARDING_BANNER;

        @pmi0("without_avatar")
        public static final StyleDto WITHOUT_AVATAR;

        @pmi0("without_extra_info")
        public static final StyleDto WITHOUT_EXTRA_INFO;

        @pmi0("with_button")
        public static final StyleDto WITH_BUTTON;

        @pmi0("with_description")
        public static final StyleDto WITH_DESCRIPTION;

        @pmi0("with_dropdown")
        public static final StyleDto WITH_DROPDOWN;

        @pmi0("with_episodes")
        public static final StyleDto WITH_EPISODES;

        @pmi0("with_peek")
        public static final StyleDto WITH_PEEK;

        @pmi0("with_pointer")
        public static final StyleDto WITH_POINTER;

        @pmi0("with_subtitle")
        public static final StyleDto WITH_SUBTITLE;

        @pmi0("with_view_counter")
        public static final StyleDto WITH_VIEW_COUNTER;
        private final String value;

        /* compiled from: CatalogLayoutDto.kt */
        public static final class a implements Parcelable.Creator<StyleDto> {
            @Override // android.os.Parcelable.Creator
            public final StyleDto createFromParcel(Parcel parcel) {
                return StyleDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StyleDto[] newArray(int i) {
                return new StyleDto[i];
            }
        }

        static {
            StyleDto styleDto = new StyleDto("DEFAULT", 0, BuildConfig.FLAVOR);
            DEFAULT = styleDto;
            StyleDto styleDto2 = new StyleDto("OUTLINE_WITH_CHEVRON", 1, "outline_with_chevron");
            OUTLINE_WITH_CHEVRON = styleDto2;
            StyleDto styleDto3 = new StyleDto("START_ICON_WITH_CHEVRON", 2, "start_icon_with_chevron");
            START_ICON_WITH_CHEVRON = styleDto3;
            StyleDto styleDto4 = new StyleDto("ISLAND", 3, "island");
            ISLAND = styleDto4;
            StyleDto styleDto5 = new StyleDto("SECONDARY", 4, X3.i.Y);
            SECONDARY = styleDto5;
            StyleDto styleDto6 = new StyleDto("FOUND_BY_LYRICS", 5, "found_by_lyrics");
            FOUND_BY_LYRICS = styleDto6;
            StyleDto styleDto7 = new StyleDto("MY_MUSIC", 6, "my_music");
            MY_MUSIC = styleDto7;
            StyleDto styleDto8 = new StyleDto("FOLLOWERS", 7, "followers");
            FOLLOWERS = styleDto8;
            StyleDto styleDto9 = new StyleDto("SPACING", 8, "spacing");
            SPACING = styleDto9;
            StyleDto styleDto10 = new StyleDto("MAGIC_WAND", 9, "magic_wand");
            MAGIC_WAND = styleDto10;
            StyleDto styleDto11 = new StyleDto("CARD", 10, "card");
            CARD = styleDto11;
            StyleDto styleDto12 = new StyleDto("FLAT", 11, "flat");
            FLAT = styleDto12;
            StyleDto styleDto13 = new StyleDto("UNOPENABLE", 12, "unopenable");
            UNOPENABLE = styleDto13;
            StyleDto styleDto14 = new StyleDto("FULLPLAY", 13, "fullplay");
            FULLPLAY = styleDto14;
            StyleDto styleDto15 = new StyleDto("FULLPLAY_DESC_VIEWS", 14, "fullplay_desc_views");
            FULLPLAY_DESC_VIEWS = styleDto15;
            StyleDto styleDto16 = new StyleDto("FULLPLAY_DESC_VIEWS_AUTHOR", 15, "fullplay_desc_views_author");
            FULLPLAY_DESC_VIEWS_AUTHOR = styleDto16;
            StyleDto styleDto17 = new StyleDto("FULLPLAY_DESC_PUBDATE_AUTHOR", 16, "fullplay_desc_pubdate_author");
            FULLPLAY_DESC_PUBDATE_AUTHOR = styleDto17;
            StyleDto styleDto18 = new StyleDto("SHOWCASE_AD_BANNER", 17, "showcase_ad_banner");
            SHOWCASE_AD_BANNER = styleDto18;
            StyleDto styleDto19 = new StyleDto("TEASERPLAY", 18, "teaserplay");
            TEASERPLAY = styleDto19;
            StyleDto styleDto20 = new StyleDto("TEASERPLAY_DESC_VIEWS", 19, "teaserplay_desc_views");
            TEASERPLAY_DESC_VIEWS = styleDto20;
            StyleDto styleDto21 = new StyleDto("TEASERPLAY_DESC_VIEWS_AUTHOR", 20, "teaserplay_desc_views_author");
            TEASERPLAY_DESC_VIEWS_AUTHOR = styleDto21;
            StyleDto styleDto22 = new StyleDto("TEASERPLAY_DESC_PUBDATE_AUTHOR", 21, "teaserplay_desc_pubdate_author");
            TEASERPLAY_DESC_PUBDATE_AUTHOR = styleDto22;
            StyleDto styleDto23 = new StyleDto("VK_VIDEO_ONBOARDING_BANNER", 22, "vk_video_onboarding_banner");
            VK_VIDEO_ONBOARDING_BANNER = styleDto23;
            StyleDto styleDto24 = new StyleDto("VK_VIDEO_MUSIC_ONBOARDING_BANNER", 23, "vk_video_music_onboarding_banner");
            VK_VIDEO_MUSIC_ONBOARDING_BANNER = styleDto24;
            StyleDto styleDto25 = new StyleDto("OVERLAP", 24, "overlap");
            OVERLAP = styleDto25;
            StyleDto styleDto26 = new StyleDto("ANCHOR_TOP", 25, "anchor_top");
            ANCHOR_TOP = styleDto26;
            StyleDto styleDto27 = new StyleDto("NEGATIVE", 26, "negative");
            NEGATIVE = styleDto27;
            StyleDto styleDto28 = new StyleDto("FIT", 27, "fit");
            FIT = styleDto28;
            StyleDto styleDto29 = new StyleDto("WITH_POINTER", 28, "with_pointer");
            WITH_POINTER = styleDto29;
            StyleDto styleDto30 = new StyleDto("WITH_DROPDOWN", 29, "with_dropdown");
            WITH_DROPDOWN = styleDto30;
            StyleDto styleDto31 = new StyleDto("WITH_BUTTON", 30, "with_button");
            WITH_BUTTON = styleDto31;
            StyleDto styleDto32 = new StyleDto("CELL_BUTTON_CENTERED_ICON", 31, "cell_button_centered_icon");
            CELL_BUTTON_CENTERED_ICON = styleDto32;
            StyleDto styleDto33 = new StyleDto("ICON_TITLE_BUTTON_PRIMARY_COLOR", 32, "icon_title_button_primary_color");
            ICON_TITLE_BUTTON_PRIMARY_COLOR = styleDto33;
            StyleDto styleDto34 = new StyleDto("MARKET_ITEM_COMMUNITY", 33, "market_item_community");
            MARKET_ITEM_COMMUNITY = styleDto34;
            StyleDto styleDto35 = new StyleDto("ARTIST_MERCH", 34, "artist_merch");
            ARTIST_MERCH = styleDto35;
            StyleDto styleDto36 = new StyleDto("WITHOUT_AVATAR", 35, "without_avatar");
            WITHOUT_AVATAR = styleDto36;
            StyleDto styleDto37 = new StyleDto("WITHOUT_EXTRA_INFO", 36, "without_extra_info");
            WITHOUT_EXTRA_INFO = styleDto37;
            StyleDto styleDto38 = new StyleDto("TRANSPARENT", 37, X3.i.T);
            TRANSPARENT = styleDto38;
            StyleDto styleDto39 = new StyleDto("VERTICAL", 38, "vertical");
            VERTICAL = styleDto39;
            StyleDto styleDto40 = new StyleDto("SMALL", 39, "small");
            SMALL = styleDto40;
            StyleDto styleDto41 = new StyleDto("LARGE", 40, "large");
            LARGE = styleDto41;
            StyleDto styleDto42 = new StyleDto("EXTRA_LARGE", 41, "extra_large");
            EXTRA_LARGE = styleDto42;
            StyleDto styleDto43 = new StyleDto("SECONDARY_SMALL", 42, "secondary_small");
            SECONDARY_SMALL = styleDto43;
            StyleDto styleDto44 = new StyleDto("LEGAL_NOTICE", 43, "legal_notice");
            LEGAL_NOTICE = styleDto44;
            StyleDto styleDto45 = new StyleDto("SINGLE_LINE", 44, "single_line");
            SINGLE_LINE = styleDto45;
            StyleDto styleDto46 = new StyleDto("AUTHORS_VIDEO", 45, "authors_video");
            AUTHORS_VIDEO = styleDto46;
            StyleDto styleDto47 = new StyleDto("WITH_EPISODES", 46, "with_episodes");
            WITH_EPISODES = styleDto47;
            StyleDto styleDto48 = new StyleDto("STRETCHED", 47, "stretched");
            STRETCHED = styleDto48;
            StyleDto styleDto49 = new StyleDto("ARROW_CENTER_SM", 48, "arrow_center_sm");
            ARROW_CENTER_SM = styleDto49;
            StyleDto styleDto50 = new StyleDto("ARROW_CENTER_MD", 49, "arrow_center_md");
            ARROW_CENTER_MD = styleDto50;
            StyleDto styleDto51 = new StyleDto("INVISIBLE_AUTHOR", 50, "invisible_author");
            INVISIBLE_AUTHOR = styleDto51;
            StyleDto styleDto52 = new StyleDto("SEARCH", 51, "search");
            SEARCH = styleDto52;
            StyleDto styleDto53 = new StyleDto("ELONGATE", 52, "elongate");
            ELONGATE = styleDto53;
            StyleDto styleDto54 = new StyleDto("TOPSHELF", 53, "topshelf");
            TOPSHELF = styleDto54;
            StyleDto styleDto55 = new StyleDto("TOPSHELF_CHILD_PROFILE", 54, "topshelf_child_profile");
            TOPSHELF_CHILD_PROFILE = styleDto55;
            StyleDto styleDto56 = new StyleDto("TRAILER", 55, "trailer");
            TRAILER = styleDto56;
            StyleDto styleDto57 = new StyleDto("GENRES", 56, "genres");
            GENRES = styleDto57;
            StyleDto styleDto58 = new StyleDto("BORDERLESS_WITH_ICON", 57, "borderless_with_icon");
            BORDERLESS_WITH_ICON = styleDto58;
            StyleDto styleDto59 = new StyleDto("OPEN_SECTION_ARROW_BUTTON", 58, "open_section_arrow_button");
            OPEN_SECTION_ARROW_BUTTON = styleDto59;
            StyleDto styleDto60 = new StyleDto("TVCHANNELS", 59, "tvchannels");
            TVCHANNELS = styleDto60;
            StyleDto styleDto61 = new StyleDto("SHOWCASE_HORIZONTAL_CARDS", 60, "showcase_horizontal_cards");
            SHOWCASE_HORIZONTAL_CARDS = styleDto61;
            StyleDto styleDto62 = new StyleDto("VIDEO_LIBRARY", 61, "video_library");
            VIDEO_LIBRARY = styleDto62;
            StyleDto styleDto63 = new StyleDto(SignalingProtocol.KEY_GRID, 62, "grid");
            GRID = styleDto63;
            StyleDto styleDto64 = new StyleDto("RAIL", 63, "rail");
            RAIL = styleDto64;
            StyleDto styleDto65 = new StyleDto("HORIZONTAL_BUTTONS", 64, "horizontal_buttons");
            HORIZONTAL_BUTTONS = styleDto65;
            StyleDto styleDto66 = new StyleDto("SQUARE", 65, "square");
            SQUARE = styleDto66;
            StyleDto styleDto67 = new StyleDto("ISLAND_TRANSPARENT", 66, "island_transparent");
            ISLAND_TRANSPARENT = styleDto67;
            StyleDto styleDto68 = new StyleDto("PROFILE_HEADER", 67, "profile_header");
            PROFILE_HEADER = styleDto68;
            StyleDto styleDto69 = new StyleDto("GRAY", 68, "gray");
            GRAY = styleDto69;
            StyleDto styleDto70 = new StyleDto("ARTIST_MIX", 69, "artist_mix");
            ARTIST_MIX = styleDto70;
            StyleDto styleDto71 = new StyleDto("ARTIST_MIX_BLURRED", 70, "artist_mix_blurred");
            ARTIST_MIX_BLURRED = styleDto71;
            StyleDto styleDto72 = new StyleDto("RECOMMENDED_PLAYLISTS_BLURRED", 71, "recommended_playlists_blurred");
            RECOMMENDED_PLAYLISTS_BLURRED = styleDto72;
            StyleDto styleDto73 = new StyleDto("HIGHLIGHT_TREND", 72, "highlight_trend");
            HIGHLIGHT_TREND = styleDto73;
            StyleDto styleDto74 = new StyleDto("HORIZONTAL_TILE", 73, "horizontal_tile");
            HORIZONTAL_TILE = styleDto74;
            StyleDto styleDto75 = new StyleDto("SHOWCASE", 74, "showcase");
            SHOWCASE = styleDto75;
            StyleDto styleDto76 = new StyleDto("NEW_ICONS", 75, "new_icons");
            NEW_ICONS = styleDto76;
            StyleDto styleDto77 = new StyleDto("TWO_LINE_HEADER", 76, "two_line_header");
            TWO_LINE_HEADER = styleDto77;
            StyleDto styleDto78 = new StyleDto("VIDEO_FAVORITES_LIBRARY", 77, "video_favorites_library");
            VIDEO_FAVORITES_LIBRARY = styleDto78;
            StyleDto styleDto79 = new StyleDto("POSTERS_AND_TRAILER", 78, "posters_and_trailer");
            POSTERS_AND_TRAILER = styleDto79;
            StyleDto styleDto80 = new StyleDto("POSTERS", 79, "posters");
            POSTERS = styleDto80;
            StyleDto styleDto81 = new StyleDto("DESCRIPTION_RATINGS", 80, "description_ratings");
            DESCRIPTION_RATINGS = styleDto81;
            StyleDto styleDto82 = new StyleDto(NativeAdContent.ViewTag.AD_DESCRIPTION, 81, "description");
            DESCRIPTION = styleDto82;
            StyleDto styleDto83 = new StyleDto("RATINGS", 82, "ratings");
            RATINGS = styleDto83;
            StyleDto styleDto84 = new StyleDto("ABOUT_ACTORS", 83, "about_actors");
            ABOUT_ACTORS = styleDto84;
            StyleDto styleDto85 = new StyleDto("ABOUT", 84, "about");
            ABOUT = styleDto85;
            StyleDto styleDto86 = new StyleDto("ACTORS", 85, "actors");
            ACTORS = styleDto86;
            StyleDto styleDto87 = new StyleDto("ACTORS_LARGE", 86, "actors_large");
            ACTORS_LARGE = styleDto87;
            StyleDto styleDto88 = new StyleDto("VIDEO_LIKED_LIBRARY", 87, "video_liked_library");
            VIDEO_LIKED_LIBRARY = styleDto88;
            StyleDto styleDto89 = new StyleDto("WITH_SUBTITLE", 88, "with_subtitle");
            WITH_SUBTITLE = styleDto89;
            StyleDto styleDto90 = new StyleDto("RIGHT_BUTTON", 89, "right_button");
            RIGHT_BUTTON = styleDto90;
            StyleDto styleDto91 = new StyleDto("HORIZONTAL", 90, "horizontal");
            HORIZONTAL = styleDto91;
            StyleDto styleDto92 = new StyleDto("PROFILE_FOLLOWERS", 91, "profile_followers");
            PROFILE_FOLLOWERS = styleDto92;
            StyleDto styleDto93 = new StyleDto("FLAT_THEME", 92, "flat_theme");
            FLAT_THEME = styleDto93;
            StyleDto styleDto94 = new StyleDto("SQUARE_THEME", 93, "square_theme");
            SQUARE_THEME = styleDto94;
            StyleDto styleDto95 = new StyleDto("SMALL_FLAT", 94, "small_flat");
            SMALL_FLAT = styleDto95;
            StyleDto styleDto96 = new StyleDto("PLACEHOLDER_WITH_ONLY_TITLE", 95, "placeholder_with_only_title");
            PLACEHOLDER_WITH_ONLY_TITLE = styleDto96;
            StyleDto styleDto97 = new StyleDto("VIDEO_SUB_ADS_OFF_BANNER_CLOSE", 96, "video_sub_ads_off_banner_close");
            VIDEO_SUB_ADS_OFF_BANNER_CLOSE = styleDto97;
            StyleDto styleDto98 = new StyleDto("VIDEO_SUB_ADS_OFF_BANNER_CHEVRONE", 97, "video_sub_ads_off_banner_chevrone");
            VIDEO_SUB_ADS_OFF_BANNER_CHEVRONE = styleDto98;
            StyleDto styleDto99 = new StyleDto("WITH_PEEK", 98, "with_peek");
            WITH_PEEK = styleDto99;
            StyleDto styleDto100 = new StyleDto("LARGE_WITH_ICON", 99, "large_with_icon");
            LARGE_WITH_ICON = styleDto100;
            StyleDto styleDto101 = new StyleDto("HIGHLIGHT", 100, "highlight");
            HIGHLIGHT = styleDto101;
            StyleDto styleDto102 = new StyleDto("MORE_REMOVE", 101, "more_remove");
            MORE_REMOVE = styleDto102;
            StyleDto styleDto103 = new StyleDto("WITH_DESCRIPTION", 102, "with_description");
            WITH_DESCRIPTION = styleDto103;
            StyleDto styleDto104 = new StyleDto("CHANNEL_HEADER", 103, "channel_header");
            CHANNEL_HEADER = styleDto104;
            StyleDto styleDto105 = new StyleDto("CHANNEL_VIDEOS_HEADER", 104, "channel_videos_header");
            CHANNEL_VIDEOS_HEADER = styleDto105;
            StyleDto styleDto106 = new StyleDto("HAS_UNLIKE_BUTTON", 105, "has_unlike_button");
            HAS_UNLIKE_BUTTON = styleDto106;
            StyleDto styleDto107 = new StyleDto("GRID_ITEM_CATEGORY_SQUARE", Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, "grid_item_category_square");
            GRID_ITEM_CATEGORY_SQUARE = styleDto107;
            StyleDto styleDto108 = new StyleDto("RICH_CELL", ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, "rich_cell");
            RICH_CELL = styleDto108;
            StyleDto styleDto109 = new StyleDto("PLAYLIST_SHOWCASE", 108, "playlist_showcase");
            PLAYLIST_SHOWCASE = styleDto109;
            StyleDto styleDto110 = new StyleDto("VIDEOS_AND_PLAYLISTS", 109, "videos_and_playlists");
            VIDEOS_AND_PLAYLISTS = styleDto110;
            StyleDto styleDto111 = new StyleDto("VIDEO_PAGE", 110, "video_page");
            VIDEO_PAGE = styleDto111;
            StyleDto styleDto112 = new StyleDto("SEARCH_NAVIGATION_LINK", 111, "search_navigation_link");
            SEARCH_NAVIGATION_LINK = styleDto112;
            StyleDto styleDto113 = new StyleDto("MY_MUSIC_FILTERS", 112, "my_music_filters");
            MY_MUSIC_FILTERS = styleDto113;
            StyleDto styleDto114 = new StyleDto("WITH_VIEW_COUNTER", 113, "with_view_counter");
            WITH_VIEW_COUNTER = styleDto114;
            StyleDto[] styleDtoArr = {styleDto, styleDto2, styleDto3, styleDto4, styleDto5, styleDto6, styleDto7, styleDto8, styleDto9, styleDto10, styleDto11, styleDto12, styleDto13, styleDto14, styleDto15, styleDto16, styleDto17, styleDto18, styleDto19, styleDto20, styleDto21, styleDto22, styleDto23, styleDto24, styleDto25, styleDto26, styleDto27, styleDto28, styleDto29, styleDto30, styleDto31, styleDto32, styleDto33, styleDto34, styleDto35, styleDto36, styleDto37, styleDto38, styleDto39, styleDto40, styleDto41, styleDto42, styleDto43, styleDto44, styleDto45, styleDto46, styleDto47, styleDto48, styleDto49, styleDto50, styleDto51, styleDto52, styleDto53, styleDto54, styleDto55, styleDto56, styleDto57, styleDto58, styleDto59, styleDto60, styleDto61, styleDto62, styleDto63, styleDto64, styleDto65, styleDto66, styleDto67, styleDto68, styleDto69, styleDto70, styleDto71, styleDto72, styleDto73, styleDto74, styleDto75, styleDto76, styleDto77, styleDto78, styleDto79, styleDto80, styleDto81, styleDto82, styleDto83, styleDto84, styleDto85, styleDto86, styleDto87, styleDto88, styleDto89, styleDto90, styleDto91, styleDto92, styleDto93, styleDto94, styleDto95, styleDto96, styleDto97, styleDto98, styleDto99, styleDto100, styleDto101, styleDto102, styleDto103, styleDto104, styleDto105, styleDto106, styleDto107, styleDto108, styleDto109, styleDto110, styleDto111, styleDto112, styleDto113, styleDto114};
            $VALUES = styleDtoArr;
            $ENTRIES = new asp(styleDtoArr);
            CREATOR = new a();
        }

        private StyleDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StyleDto valueOf(String str) {
            return (StyleDto) Enum.valueOf(StyleDto.class, str);
        }

        public static StyleDto[] values() {
            return (StyleDto[]) $VALUES.clone();
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
    /* compiled from: CatalogLayoutDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("compact")
        public static final TypeDto COMPACT;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("detailed")
        public static final TypeDto DETAILED;
        private final String value;

        /* compiled from: CatalogLayoutDto.kt */
        public static final class a implements Parcelable.Creator<TypeDto> {
            @Override // android.os.Parcelable.Creator
            public final TypeDto createFromParcel(Parcel parcel) {
                return TypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TypeDto[] newArray(int i) {
                return new TypeDto[i];
            }
        }

        static {
            TypeDto typeDto = new TypeDto("DETAILED", 0, "detailed");
            DETAILED = typeDto;
            TypeDto typeDto2 = new TypeDto("COMPACT", 1, "compact");
            COMPACT = typeDto2;
            TypeDto[] typeDtoArr = {typeDto, typeDto2};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
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

    /* compiled from: CatalogLayoutDto.kt */
    public static final class a implements Parcelable.Creator<CatalogLayoutDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogLayoutDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            NameDto createFromParcel = NameDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(parcel.createStringArrayList());
                }
            }
            return new CatalogLayoutDto(createFromParcel, arrayList, parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel), (BaseBoolIntDto) parcel.readParcelable(CatalogLayoutDto.class.getClassLoader()), (UserId) parcel.readParcelable(CatalogLayoutDto.class.getClassLoader()), parcel.readString(), parcel.readString(), (MediaPopupDto) parcel.readParcelable(CatalogLayoutDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : StyleDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SizeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CatalogLayoutTopTitleDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogLayoutDto[] newArray(int i) {
            return new CatalogLayoutDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogLayoutDto(NameDto nameDto, List<? extends List<String>> list, TypeDto typeDto, BaseBoolIntDto baseBoolIntDto, UserId userId, String str, String str2, MediaPopupDto mediaPopupDto, Boolean bool, StyleDto styleDto, SizeDto sizeDto, CatalogLayoutTopTitleDto catalogLayoutTopTitleDto, String str3, String str4, Boolean bool2) {
        this.name = nameDto;
        this.gridLayout = list;
        this.type = typeDto;
        this.itemsIgnorable = baseBoolIntDto;
        this.ownerId = userId;
        this.title = str;
        this.subtitle = str2;
        this.placeholderMeta = mediaPopupDto;
        this.infiniteRepeat = bool;
        this.style = styleDto;
        this.size = sizeDto;
        this.topTitle = catalogLayoutTopTitleDto;
        this.icon = str3;
        this.customStyle = str4;
        this.mergeItems = bool2;
    }

    public final String d() {
        return this.icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.infiniteRepeat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogLayoutDto)) {
            return false;
        }
        CatalogLayoutDto catalogLayoutDto = (CatalogLayoutDto) obj;
        return this.name == catalogLayoutDto.name && epx.f(this.gridLayout, catalogLayoutDto.gridLayout) && this.type == catalogLayoutDto.type && this.itemsIgnorable == catalogLayoutDto.itemsIgnorable && epx.f(this.ownerId, catalogLayoutDto.ownerId) && epx.f(this.title, catalogLayoutDto.title) && epx.f(this.subtitle, catalogLayoutDto.subtitle) && epx.f(this.placeholderMeta, catalogLayoutDto.placeholderMeta) && epx.f(this.infiniteRepeat, catalogLayoutDto.infiniteRepeat) && this.style == catalogLayoutDto.style && this.size == catalogLayoutDto.size && epx.f(this.topTitle, catalogLayoutDto.topTitle) && epx.f(this.icon, catalogLayoutDto.icon) && epx.f(this.customStyle, catalogLayoutDto.customStyle) && epx.f(this.mergeItems, catalogLayoutDto.mergeItems);
    }

    public final NameDto f() {
        return this.name;
    }

    public final SizeDto g() {
        return this.size;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        List<List<String>> list = this.gridLayout;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        TypeDto typeDto = this.type;
        int hashCode3 = (hashCode2 + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.itemsIgnorable;
        int hashCode4 = (hashCode3 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        UserId userId = this.ownerId;
        int hashCode5 = (hashCode4 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str = this.title;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MediaPopupDto mediaPopupDto = this.placeholderMeta;
        int hashCode8 = (hashCode7 + (mediaPopupDto == null ? 0 : mediaPopupDto.hashCode())) * 31;
        Boolean bool = this.infiniteRepeat;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        StyleDto styleDto = this.style;
        int hashCode10 = (hashCode9 + (styleDto == null ? 0 : styleDto.hashCode())) * 31;
        SizeDto sizeDto = this.size;
        int hashCode11 = (hashCode10 + (sizeDto == null ? 0 : sizeDto.hashCode())) * 31;
        CatalogLayoutTopTitleDto catalogLayoutTopTitleDto = this.topTitle;
        int hashCode12 = (hashCode11 + (catalogLayoutTopTitleDto == null ? 0 : catalogLayoutTopTitleDto.hashCode())) * 31;
        String str3 = this.icon;
        int hashCode13 = (hashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customStyle;
        int hashCode14 = (hashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.mergeItems;
        return hashCode14 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final StyleDto i() {
        return this.style;
    }

    public final String j() {
        return this.subtitle;
    }

    public final CatalogLayoutTopTitleDto k() {
        return this.topTitle;
    }

    public final TypeDto l() {
        return this.type;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogLayoutDto(name=");
        sb.append(this.name);
        sb.append(", gridLayout=");
        sb.append(this.gridLayout);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", itemsIgnorable=");
        sb.append(this.itemsIgnorable);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", placeholderMeta=");
        sb.append(this.placeholderMeta);
        sb.append(", infiniteRepeat=");
        sb.append(this.infiniteRepeat);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", topTitle=");
        sb.append(this.topTitle);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", customStyle=");
        sb.append(this.customStyle);
        sb.append(", mergeItems=");
        return tn.a(sb, this.mergeItems, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.name.writeToParcel(parcel, i);
        List<List<String>> list = this.gridLayout;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeStringList((List) f.next());
            }
        }
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.itemsIgnorable, i);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.placeholderMeta, i);
        Boolean bool = this.infiniteRepeat;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        StyleDto styleDto = this.style;
        if (styleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            styleDto.writeToParcel(parcel, i);
        }
        SizeDto sizeDto = this.size;
        if (sizeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sizeDto.writeToParcel(parcel, i);
        }
        CatalogLayoutTopTitleDto catalogLayoutTopTitleDto = this.topTitle;
        if (catalogLayoutTopTitleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogLayoutTopTitleDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.icon);
        parcel.writeString(this.customStyle);
        Boolean bool2 = this.mergeItems;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public /* synthetic */ CatalogLayoutDto(NameDto nameDto, List list, TypeDto typeDto, BaseBoolIntDto baseBoolIntDto, UserId userId, String str, String str2, MediaPopupDto mediaPopupDto, Boolean bool, StyleDto styleDto, SizeDto sizeDto, CatalogLayoutTopTitleDto catalogLayoutTopTitleDto, String str3, String str4, Boolean bool2, int i, zcl zclVar) {
        this(nameDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : typeDto, (i & 8) != 0 ? null : baseBoolIntDto, (i & 16) != 0 ? null : userId, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : mediaPopupDto, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : styleDto, (i & 1024) != 0 ? null : sizeDto, (i & 2048) != 0 ? null : catalogLayoutTopTitleDto, (i & 4096) != 0 ? null : str3, (i & 8192) != 0 ? null : str4, (i & 16384) != 0 ? null : bool2);
    }
}
