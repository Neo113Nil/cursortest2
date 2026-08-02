package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.b;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewsfeedGetFeedExpFiltersDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetFeedExpFiltersDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedGetFeedExpFiltersDto[] $VALUES;

    @pmi0("achievement_game")
    public static final NewsfeedGetFeedExpFiltersDto ACHIEVEMENT_GAME;

    @pmi0(b.JSON_KEY_ADS)
    public static final NewsfeedGetFeedExpFiltersDto ADS;

    @pmi0("ads_app")
    public static final NewsfeedGetFeedExpFiltersDto ADS_APP;

    @pmi0("ads_applovin")
    public static final NewsfeedGetFeedExpFiltersDto ADS_APPLOVIN;

    @pmi0("ads_app_slider")
    public static final NewsfeedGetFeedExpFiltersDto ADS_APP_SLIDER;

    @pmi0("ads_app_video")
    public static final NewsfeedGetFeedExpFiltersDto ADS_APP_VIDEO;

    @pmi0("ads_disabled")
    public static final NewsfeedGetFeedExpFiltersDto ADS_DISABLED;

    @pmi0("ads_post")
    public static final NewsfeedGetFeedExpFiltersDto ADS_POST;

    @pmi0("ads_post_pretty_cards")
    public static final NewsfeedGetFeedExpFiltersDto ADS_POST_PRETTY_CARDS;

    @pmi0("ads_post_snippet_video")
    public static final NewsfeedGetFeedExpFiltersDto ADS_POST_SNIPPET_VIDEO;

    @pmi0("ads_site")
    public static final NewsfeedGetFeedExpFiltersDto ADS_SITE;

    @pmi0("ads_site_slider")
    public static final NewsfeedGetFeedExpFiltersDto ADS_SITE_SLIDER;

    @pmi0("ads_site_slider_special")
    public static final NewsfeedGetFeedExpFiltersDto ADS_SITE_SLIDER_SPECIAL;

    @pmi0("ads_yandex")
    public static final NewsfeedGetFeedExpFiltersDto ADS_YANDEX;

    @pmi0("animated_block")
    public static final NewsfeedGetFeedExpFiltersDto ANIMATED_BLOCK;

    @pmi0("app_widget")
    public static final NewsfeedGetFeedExpFiltersDto APP_WIDGET;

    @pmi0("audio")
    public static final NewsfeedGetFeedExpFiltersDto AUDIO;

    @pmi0("audios_for_you_block")
    public static final NewsfeedGetFeedExpFiltersDto AUDIOS_FOR_YOU_BLOCK;

    @pmi0("audio_playlist")
    public static final NewsfeedGetFeedExpFiltersDto AUDIO_PLAYLIST;

    @pmi0("authors_rec")
    public static final NewsfeedGetFeedExpFiltersDto AUTHORS_REC;

    @pmi0("bookmark_game")
    public static final NewsfeedGetFeedExpFiltersDto BOOKMARK_GAME;

    @pmi0("clip")
    public static final NewsfeedGetFeedExpFiltersDto CLIP;

    @pmi0("clips_autoplay")
    public static final NewsfeedGetFeedExpFiltersDto CLIPS_AUTOPLAY;

    @pmi0("clips_block")
    public static final NewsfeedGetFeedExpFiltersDto CLIPS_BLOCK;

    @pmi0("clips_challenges")
    public static final NewsfeedGetFeedExpFiltersDto CLIPS_CHALLENGES;

    @pmi0("clips_ozon")
    public static final NewsfeedGetFeedExpFiltersDto CLIPS_OZON;

    @pmi0("clips_retention")
    public static final NewsfeedGetFeedExpFiltersDto CLIPS_RETENTION;

    @pmi0("clips_shops")
    public static final NewsfeedGetFeedExpFiltersDto CLIPS_SHOPS;
    public static final Parcelable.Creator<NewsfeedGetFeedExpFiltersDto> CREATOR;

    @pmi0("digest")
    public static final NewsfeedGetFeedExpFiltersDto DIGEST;

    @pmi0("discover_media_block")
    public static final NewsfeedGetFeedExpFiltersDto DISCOVER_MEDIA_BLOCK;

    @pmi0("dzen_block")
    public static final NewsfeedGetFeedExpFiltersDto DZEN_BLOCK;

    @pmi0("dzen_story_news")
    public static final NewsfeedGetFeedExpFiltersDto DZEN_STORY_NEWS;

    @pmi0("dzen_top_stories")
    public static final NewsfeedGetFeedExpFiltersDto DZEN_TOP_STORIES;

    @pmi0("expert_card")
    public static final NewsfeedGetFeedExpFiltersDto EXPERT_CARD;

    @pmi0("feedback_poll")
    public static final NewsfeedGetFeedExpFiltersDto FEEDBACK_POLL;

    @pmi0("friend")
    public static final NewsfeedGetFeedExpFiltersDto FRIEND;

    @pmi0("friends_entrypoints")
    public static final NewsfeedGetFeedExpFiltersDto FRIENDS_ENTRYPOINTS;

    @pmi0("friends_recomm")
    public static final NewsfeedGetFeedExpFiltersDto FRIENDS_RECOMM;

    @pmi0("games_carousel")
    public static final NewsfeedGetFeedExpFiltersDto GAMES_CAROUSEL;

    @pmi0("generic_webview_block")
    public static final NewsfeedGetFeedExpFiltersDto GENERIC_WEBVIEW_BLOCK;

    @pmi0("holiday_friends")
    public static final NewsfeedGetFeedExpFiltersDto HOLIDAY_FRIENDS;

    @pmi0("info_block")
    public static final NewsfeedGetFeedExpFiltersDto INFO_BLOCK;

    @pmi0("interests")
    public static final NewsfeedGetFeedExpFiltersDto INTERESTS;

    @pmi0("liked_by_friends_groups")
    public static final NewsfeedGetFeedExpFiltersDto LIKED_BY_FRIENDS_GROUPS;

    @pmi0("market")
    public static final NewsfeedGetFeedExpFiltersDto MARKET;

    @pmi0("market_carousel")
    public static final NewsfeedGetFeedExpFiltersDto MARKET_CAROUSEL;

    @pmi0("market_groups_block")
    public static final NewsfeedGetFeedExpFiltersDto MARKET_GROUPS_BLOCK;

    @pmi0("mini_apps_carousel")
    public static final NewsfeedGetFeedExpFiltersDto MINI_APPS_CAROUSEL;

    @pmi0("note")
    public static final NewsfeedGetFeedExpFiltersDto NOTE;

    @pmi0("photo")
    public static final NewsfeedGetFeedExpFiltersDto PHOTO;

    @pmi0("photo_tag")
    public static final NewsfeedGetFeedExpFiltersDto PHOTO_TAG;

    @pmi0("playlists_for_you_block")
    public static final NewsfeedGetFeedExpFiltersDto PLAYLISTS_FOR_YOU_BLOCK;

    @pmi0("post")
    public static final NewsfeedGetFeedExpFiltersDto POST;

    @pmi0("promo_button")
    public static final NewsfeedGetFeedExpFiltersDto PROMO_BUTTON;

    @pmi0("recommended_artists")
    public static final NewsfeedGetFeedExpFiltersDto RECOMMENDED_ARTISTS;

    @pmi0("recommended_audios")
    public static final NewsfeedGetFeedExpFiltersDto RECOMMENDED_AUDIOS;

    @pmi0("recommended_channels")
    public static final NewsfeedGetFeedExpFiltersDto RECOMMENDED_CHANNELS;

    @pmi0("recommended_chats")
    public static final NewsfeedGetFeedExpFiltersDto RECOMMENDED_CHATS;

    @pmi0("recommended_game")
    public static final NewsfeedGetFeedExpFiltersDto RECOMMENDED_GAME;

    @pmi0("recommended_games_carousel")
    public static final NewsfeedGetFeedExpFiltersDto RECOMMENDED_GAMES_CAROUSEL;

    @pmi0("recommended_groups")
    public static final NewsfeedGetFeedExpFiltersDto RECOMMENDED_GROUPS;

    @pmi0("recommended_mini_app")
    public static final NewsfeedGetFeedExpFiltersDto RECOMMENDED_MINI_APP;

    @pmi0("recommended_narratives")
    public static final NewsfeedGetFeedExpFiltersDto RECOMMENDED_NARRATIVES;

    @pmi0("recommended_playlists")
    public static final NewsfeedGetFeedExpFiltersDto RECOMMENDED_PLAYLISTS;

    @pmi0("signals")
    public static final NewsfeedGetFeedExpFiltersDto SIGNALS;

    @pmi0("stories")
    public static final NewsfeedGetFeedExpFiltersDto STORIES;

    @pmi0("stories_interesting_block")
    public static final NewsfeedGetFeedExpFiltersDto STORIES_INTERESTING_BLOCK;

    @pmi0("tags_suggestions")
    public static final NewsfeedGetFeedExpFiltersDto TAGS_SUGGESTIONS;

    @pmi0("textlive")
    public static final NewsfeedGetFeedExpFiltersDto TEXTLIVE;

    @pmi0("topic")
    public static final NewsfeedGetFeedExpFiltersDto TOPIC;

    @pmi0("user_rec")
    public static final NewsfeedGetFeedExpFiltersDto USER_REC;

    @pmi0("uxpolls_block")
    public static final NewsfeedGetFeedExpFiltersDto UXPOLLS_BLOCK;

    @pmi0("uxpoll_block")
    public static final NewsfeedGetFeedExpFiltersDto UXPOLL_BLOCK;

    @pmi0("video")
    public static final NewsfeedGetFeedExpFiltersDto VIDEO;

    @pmi0("videos_for_you")
    public static final NewsfeedGetFeedExpFiltersDto VIDEOS_FOR_YOU;

    @pmi0("videos_for_you_block")
    public static final NewsfeedGetFeedExpFiltersDto VIDEOS_FOR_YOU_BLOCK;

    @pmi0("videos_promo")
    public static final NewsfeedGetFeedExpFiltersDto VIDEOS_PROMO;

    @pmi0("video_postcard")
    public static final NewsfeedGetFeedExpFiltersDto VIDEO_POSTCARD;

    @pmi0("wall_photo")
    public static final NewsfeedGetFeedExpFiltersDto WALL_PHOTO;

    @pmi0("youla_carousel")
    public static final NewsfeedGetFeedExpFiltersDto YOULA_CAROUSEL;

    @pmi0("youla_groups_block")
    public static final NewsfeedGetFeedExpFiltersDto YOULA_GROUPS_BLOCK;
    private final String value;

    /* compiled from: NewsfeedGetFeedExpFiltersDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetFeedExpFiltersDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetFeedExpFiltersDto createFromParcel(Parcel parcel) {
            return NewsfeedGetFeedExpFiltersDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetFeedExpFiltersDto[] newArray(int i) {
            return new NewsfeedGetFeedExpFiltersDto[i];
        }
    }

    static {
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto = new NewsfeedGetFeedExpFiltersDto("ACHIEVEMENT_GAME", 0, "achievement_game");
        ACHIEVEMENT_GAME = newsfeedGetFeedExpFiltersDto;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto2 = new NewsfeedGetFeedExpFiltersDto("ADS", 1, b.JSON_KEY_ADS);
        ADS = newsfeedGetFeedExpFiltersDto2;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto3 = new NewsfeedGetFeedExpFiltersDto("ADS_APP", 2, "ads_app");
        ADS_APP = newsfeedGetFeedExpFiltersDto3;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto4 = new NewsfeedGetFeedExpFiltersDto("ADS_APP_SLIDER", 3, "ads_app_slider");
        ADS_APP_SLIDER = newsfeedGetFeedExpFiltersDto4;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto5 = new NewsfeedGetFeedExpFiltersDto("ADS_APP_VIDEO", 4, "ads_app_video");
        ADS_APP_VIDEO = newsfeedGetFeedExpFiltersDto5;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto6 = new NewsfeedGetFeedExpFiltersDto("ADS_APPLOVIN", 5, "ads_applovin");
        ADS_APPLOVIN = newsfeedGetFeedExpFiltersDto6;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto7 = new NewsfeedGetFeedExpFiltersDto("ADS_DISABLED", 6, "ads_disabled");
        ADS_DISABLED = newsfeedGetFeedExpFiltersDto7;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto8 = new NewsfeedGetFeedExpFiltersDto("ADS_POST", 7, "ads_post");
        ADS_POST = newsfeedGetFeedExpFiltersDto8;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto9 = new NewsfeedGetFeedExpFiltersDto("ADS_POST_PRETTY_CARDS", 8, "ads_post_pretty_cards");
        ADS_POST_PRETTY_CARDS = newsfeedGetFeedExpFiltersDto9;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto10 = new NewsfeedGetFeedExpFiltersDto("ADS_POST_SNIPPET_VIDEO", 9, "ads_post_snippet_video");
        ADS_POST_SNIPPET_VIDEO = newsfeedGetFeedExpFiltersDto10;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto11 = new NewsfeedGetFeedExpFiltersDto("ADS_SITE", 10, "ads_site");
        ADS_SITE = newsfeedGetFeedExpFiltersDto11;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto12 = new NewsfeedGetFeedExpFiltersDto("ADS_SITE_SLIDER", 11, "ads_site_slider");
        ADS_SITE_SLIDER = newsfeedGetFeedExpFiltersDto12;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto13 = new NewsfeedGetFeedExpFiltersDto("ADS_SITE_SLIDER_SPECIAL", 12, "ads_site_slider_special");
        ADS_SITE_SLIDER_SPECIAL = newsfeedGetFeedExpFiltersDto13;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto14 = new NewsfeedGetFeedExpFiltersDto("ADS_YANDEX", 13, "ads_yandex");
        ADS_YANDEX = newsfeedGetFeedExpFiltersDto14;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto15 = new NewsfeedGetFeedExpFiltersDto("ANIMATED_BLOCK", 14, "animated_block");
        ANIMATED_BLOCK = newsfeedGetFeedExpFiltersDto15;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto16 = new NewsfeedGetFeedExpFiltersDto("APP_WIDGET", 15, "app_widget");
        APP_WIDGET = newsfeedGetFeedExpFiltersDto16;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto17 = new NewsfeedGetFeedExpFiltersDto(SignalingProtocol.MEDIA_OPTION_AUDIO, 16, "audio");
        AUDIO = newsfeedGetFeedExpFiltersDto17;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto18 = new NewsfeedGetFeedExpFiltersDto("AUDIO_PLAYLIST", 17, "audio_playlist");
        AUDIO_PLAYLIST = newsfeedGetFeedExpFiltersDto18;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto19 = new NewsfeedGetFeedExpFiltersDto("AUDIOS_FOR_YOU_BLOCK", 18, "audios_for_you_block");
        AUDIOS_FOR_YOU_BLOCK = newsfeedGetFeedExpFiltersDto19;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto20 = new NewsfeedGetFeedExpFiltersDto("AUTHORS_REC", 19, "authors_rec");
        AUTHORS_REC = newsfeedGetFeedExpFiltersDto20;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto21 = new NewsfeedGetFeedExpFiltersDto("BOOKMARK_GAME", 20, "bookmark_game");
        BOOKMARK_GAME = newsfeedGetFeedExpFiltersDto21;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto22 = new NewsfeedGetFeedExpFiltersDto("CLIP", 21, "clip");
        CLIP = newsfeedGetFeedExpFiltersDto22;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto23 = new NewsfeedGetFeedExpFiltersDto("CLIPS_AUTOPLAY", 22, "clips_autoplay");
        CLIPS_AUTOPLAY = newsfeedGetFeedExpFiltersDto23;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto24 = new NewsfeedGetFeedExpFiltersDto("CLIPS_BLOCK", 23, "clips_block");
        CLIPS_BLOCK = newsfeedGetFeedExpFiltersDto24;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto25 = new NewsfeedGetFeedExpFiltersDto("CLIPS_CHALLENGES", 24, "clips_challenges");
        CLIPS_CHALLENGES = newsfeedGetFeedExpFiltersDto25;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto26 = new NewsfeedGetFeedExpFiltersDto("CLIPS_OZON", 25, "clips_ozon");
        CLIPS_OZON = newsfeedGetFeedExpFiltersDto26;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto27 = new NewsfeedGetFeedExpFiltersDto("CLIPS_RETENTION", 26, "clips_retention");
        CLIPS_RETENTION = newsfeedGetFeedExpFiltersDto27;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto28 = new NewsfeedGetFeedExpFiltersDto("CLIPS_SHOPS", 27, "clips_shops");
        CLIPS_SHOPS = newsfeedGetFeedExpFiltersDto28;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto29 = new NewsfeedGetFeedExpFiltersDto("DIGEST", 28, "digest");
        DIGEST = newsfeedGetFeedExpFiltersDto29;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto30 = new NewsfeedGetFeedExpFiltersDto("DISCOVER_MEDIA_BLOCK", 29, "discover_media_block");
        DISCOVER_MEDIA_BLOCK = newsfeedGetFeedExpFiltersDto30;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto31 = new NewsfeedGetFeedExpFiltersDto("DZEN_STORY_NEWS", 30, "dzen_story_news");
        DZEN_STORY_NEWS = newsfeedGetFeedExpFiltersDto31;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto32 = new NewsfeedGetFeedExpFiltersDto("DZEN_TOP_STORIES", 31, "dzen_top_stories");
        DZEN_TOP_STORIES = newsfeedGetFeedExpFiltersDto32;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto33 = new NewsfeedGetFeedExpFiltersDto("EXPERT_CARD", 32, "expert_card");
        EXPERT_CARD = newsfeedGetFeedExpFiltersDto33;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto34 = new NewsfeedGetFeedExpFiltersDto("FEEDBACK_POLL", 33, "feedback_poll");
        FEEDBACK_POLL = newsfeedGetFeedExpFiltersDto34;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto35 = new NewsfeedGetFeedExpFiltersDto("FRIEND", 34, "friend");
        FRIEND = newsfeedGetFeedExpFiltersDto35;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto36 = new NewsfeedGetFeedExpFiltersDto("FRIENDS_ENTRYPOINTS", 35, "friends_entrypoints");
        FRIENDS_ENTRYPOINTS = newsfeedGetFeedExpFiltersDto36;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto37 = new NewsfeedGetFeedExpFiltersDto("FRIENDS_RECOMM", 36, "friends_recomm");
        FRIENDS_RECOMM = newsfeedGetFeedExpFiltersDto37;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto38 = new NewsfeedGetFeedExpFiltersDto("GAMES_CAROUSEL", 37, "games_carousel");
        GAMES_CAROUSEL = newsfeedGetFeedExpFiltersDto38;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto39 = new NewsfeedGetFeedExpFiltersDto("GENERIC_WEBVIEW_BLOCK", 38, "generic_webview_block");
        GENERIC_WEBVIEW_BLOCK = newsfeedGetFeedExpFiltersDto39;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto40 = new NewsfeedGetFeedExpFiltersDto("HOLIDAY_FRIENDS", 39, "holiday_friends");
        HOLIDAY_FRIENDS = newsfeedGetFeedExpFiltersDto40;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto41 = new NewsfeedGetFeedExpFiltersDto("INFO_BLOCK", 40, "info_block");
        INFO_BLOCK = newsfeedGetFeedExpFiltersDto41;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto42 = new NewsfeedGetFeedExpFiltersDto("INTERESTS", 41, "interests");
        INTERESTS = newsfeedGetFeedExpFiltersDto42;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto43 = new NewsfeedGetFeedExpFiltersDto("LIKED_BY_FRIENDS_GROUPS", 42, "liked_by_friends_groups");
        LIKED_BY_FRIENDS_GROUPS = newsfeedGetFeedExpFiltersDto43;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto44 = new NewsfeedGetFeedExpFiltersDto("MARKET", 43, "market");
        MARKET = newsfeedGetFeedExpFiltersDto44;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto45 = new NewsfeedGetFeedExpFiltersDto("MARKET_CAROUSEL", 44, "market_carousel");
        MARKET_CAROUSEL = newsfeedGetFeedExpFiltersDto45;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto46 = new NewsfeedGetFeedExpFiltersDto("MARKET_GROUPS_BLOCK", 45, "market_groups_block");
        MARKET_GROUPS_BLOCK = newsfeedGetFeedExpFiltersDto46;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto47 = new NewsfeedGetFeedExpFiltersDto("MINI_APPS_CAROUSEL", 46, "mini_apps_carousel");
        MINI_APPS_CAROUSEL = newsfeedGetFeedExpFiltersDto47;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto48 = new NewsfeedGetFeedExpFiltersDto("NOTE", 47, "note");
        NOTE = newsfeedGetFeedExpFiltersDto48;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto49 = new NewsfeedGetFeedExpFiltersDto("PHOTO", 48, "photo");
        PHOTO = newsfeedGetFeedExpFiltersDto49;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto50 = new NewsfeedGetFeedExpFiltersDto("PHOTO_TAG", 49, "photo_tag");
        PHOTO_TAG = newsfeedGetFeedExpFiltersDto50;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto51 = new NewsfeedGetFeedExpFiltersDto("PLAYLISTS_FOR_YOU_BLOCK", 50, "playlists_for_you_block");
        PLAYLISTS_FOR_YOU_BLOCK = newsfeedGetFeedExpFiltersDto51;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto52 = new NewsfeedGetFeedExpFiltersDto("POST", 51, "post");
        POST = newsfeedGetFeedExpFiltersDto52;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto53 = new NewsfeedGetFeedExpFiltersDto("PROMO_BUTTON", 52, "promo_button");
        PROMO_BUTTON = newsfeedGetFeedExpFiltersDto53;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto54 = new NewsfeedGetFeedExpFiltersDto("RECOMMENDED_ARTISTS", 53, "recommended_artists");
        RECOMMENDED_ARTISTS = newsfeedGetFeedExpFiltersDto54;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto55 = new NewsfeedGetFeedExpFiltersDto("RECOMMENDED_AUDIOS", 54, "recommended_audios");
        RECOMMENDED_AUDIOS = newsfeedGetFeedExpFiltersDto55;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto56 = new NewsfeedGetFeedExpFiltersDto("RECOMMENDED_CHANNELS", 55, "recommended_channels");
        RECOMMENDED_CHANNELS = newsfeedGetFeedExpFiltersDto56;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto57 = new NewsfeedGetFeedExpFiltersDto("RECOMMENDED_CHATS", 56, "recommended_chats");
        RECOMMENDED_CHATS = newsfeedGetFeedExpFiltersDto57;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto58 = new NewsfeedGetFeedExpFiltersDto("RECOMMENDED_GAME", 57, "recommended_game");
        RECOMMENDED_GAME = newsfeedGetFeedExpFiltersDto58;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto59 = new NewsfeedGetFeedExpFiltersDto("RECOMMENDED_GAMES_CAROUSEL", 58, "recommended_games_carousel");
        RECOMMENDED_GAMES_CAROUSEL = newsfeedGetFeedExpFiltersDto59;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto60 = new NewsfeedGetFeedExpFiltersDto("RECOMMENDED_GROUPS", 59, "recommended_groups");
        RECOMMENDED_GROUPS = newsfeedGetFeedExpFiltersDto60;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto61 = new NewsfeedGetFeedExpFiltersDto("RECOMMENDED_MINI_APP", 60, "recommended_mini_app");
        RECOMMENDED_MINI_APP = newsfeedGetFeedExpFiltersDto61;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto62 = new NewsfeedGetFeedExpFiltersDto("RECOMMENDED_NARRATIVES", 61, "recommended_narratives");
        RECOMMENDED_NARRATIVES = newsfeedGetFeedExpFiltersDto62;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto63 = new NewsfeedGetFeedExpFiltersDto("RECOMMENDED_PLAYLISTS", 62, "recommended_playlists");
        RECOMMENDED_PLAYLISTS = newsfeedGetFeedExpFiltersDto63;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto64 = new NewsfeedGetFeedExpFiltersDto("SIGNALS", 63, "signals");
        SIGNALS = newsfeedGetFeedExpFiltersDto64;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto65 = new NewsfeedGetFeedExpFiltersDto("STORIES", 64, "stories");
        STORIES = newsfeedGetFeedExpFiltersDto65;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto66 = new NewsfeedGetFeedExpFiltersDto("STORIES_INTERESTING_BLOCK", 65, "stories_interesting_block");
        STORIES_INTERESTING_BLOCK = newsfeedGetFeedExpFiltersDto66;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto67 = new NewsfeedGetFeedExpFiltersDto("TAGS_SUGGESTIONS", 66, "tags_suggestions");
        TAGS_SUGGESTIONS = newsfeedGetFeedExpFiltersDto67;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto68 = new NewsfeedGetFeedExpFiltersDto("TEXTLIVE", 67, "textlive");
        TEXTLIVE = newsfeedGetFeedExpFiltersDto68;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto69 = new NewsfeedGetFeedExpFiltersDto("TOPIC", 68, "topic");
        TOPIC = newsfeedGetFeedExpFiltersDto69;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto70 = new NewsfeedGetFeedExpFiltersDto("USER_REC", 69, "user_rec");
        USER_REC = newsfeedGetFeedExpFiltersDto70;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto71 = new NewsfeedGetFeedExpFiltersDto("UXPOLL_BLOCK", 70, "uxpoll_block");
        UXPOLL_BLOCK = newsfeedGetFeedExpFiltersDto71;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto72 = new NewsfeedGetFeedExpFiltersDto("UXPOLLS_BLOCK", 71, "uxpolls_block");
        UXPOLLS_BLOCK = newsfeedGetFeedExpFiltersDto72;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto73 = new NewsfeedGetFeedExpFiltersDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 72, "video");
        VIDEO = newsfeedGetFeedExpFiltersDto73;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto74 = new NewsfeedGetFeedExpFiltersDto("VIDEO_POSTCARD", 73, "video_postcard");
        VIDEO_POSTCARD = newsfeedGetFeedExpFiltersDto74;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto75 = new NewsfeedGetFeedExpFiltersDto("VIDEOS_FOR_YOU", 74, "videos_for_you");
        VIDEOS_FOR_YOU = newsfeedGetFeedExpFiltersDto75;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto76 = new NewsfeedGetFeedExpFiltersDto("VIDEOS_FOR_YOU_BLOCK", 75, "videos_for_you_block");
        VIDEOS_FOR_YOU_BLOCK = newsfeedGetFeedExpFiltersDto76;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto77 = new NewsfeedGetFeedExpFiltersDto("VIDEOS_PROMO", 76, "videos_promo");
        VIDEOS_PROMO = newsfeedGetFeedExpFiltersDto77;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto78 = new NewsfeedGetFeedExpFiltersDto("WALL_PHOTO", 77, "wall_photo");
        WALL_PHOTO = newsfeedGetFeedExpFiltersDto78;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto79 = new NewsfeedGetFeedExpFiltersDto("YOULA_CAROUSEL", 78, "youla_carousel");
        YOULA_CAROUSEL = newsfeedGetFeedExpFiltersDto79;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto80 = new NewsfeedGetFeedExpFiltersDto("YOULA_GROUPS_BLOCK", 79, "youla_groups_block");
        YOULA_GROUPS_BLOCK = newsfeedGetFeedExpFiltersDto80;
        NewsfeedGetFeedExpFiltersDto newsfeedGetFeedExpFiltersDto81 = new NewsfeedGetFeedExpFiltersDto("DZEN_BLOCK", 80, "dzen_block");
        DZEN_BLOCK = newsfeedGetFeedExpFiltersDto81;
        NewsfeedGetFeedExpFiltersDto[] newsfeedGetFeedExpFiltersDtoArr = {newsfeedGetFeedExpFiltersDto, newsfeedGetFeedExpFiltersDto2, newsfeedGetFeedExpFiltersDto3, newsfeedGetFeedExpFiltersDto4, newsfeedGetFeedExpFiltersDto5, newsfeedGetFeedExpFiltersDto6, newsfeedGetFeedExpFiltersDto7, newsfeedGetFeedExpFiltersDto8, newsfeedGetFeedExpFiltersDto9, newsfeedGetFeedExpFiltersDto10, newsfeedGetFeedExpFiltersDto11, newsfeedGetFeedExpFiltersDto12, newsfeedGetFeedExpFiltersDto13, newsfeedGetFeedExpFiltersDto14, newsfeedGetFeedExpFiltersDto15, newsfeedGetFeedExpFiltersDto16, newsfeedGetFeedExpFiltersDto17, newsfeedGetFeedExpFiltersDto18, newsfeedGetFeedExpFiltersDto19, newsfeedGetFeedExpFiltersDto20, newsfeedGetFeedExpFiltersDto21, newsfeedGetFeedExpFiltersDto22, newsfeedGetFeedExpFiltersDto23, newsfeedGetFeedExpFiltersDto24, newsfeedGetFeedExpFiltersDto25, newsfeedGetFeedExpFiltersDto26, newsfeedGetFeedExpFiltersDto27, newsfeedGetFeedExpFiltersDto28, newsfeedGetFeedExpFiltersDto29, newsfeedGetFeedExpFiltersDto30, newsfeedGetFeedExpFiltersDto31, newsfeedGetFeedExpFiltersDto32, newsfeedGetFeedExpFiltersDto33, newsfeedGetFeedExpFiltersDto34, newsfeedGetFeedExpFiltersDto35, newsfeedGetFeedExpFiltersDto36, newsfeedGetFeedExpFiltersDto37, newsfeedGetFeedExpFiltersDto38, newsfeedGetFeedExpFiltersDto39, newsfeedGetFeedExpFiltersDto40, newsfeedGetFeedExpFiltersDto41, newsfeedGetFeedExpFiltersDto42, newsfeedGetFeedExpFiltersDto43, newsfeedGetFeedExpFiltersDto44, newsfeedGetFeedExpFiltersDto45, newsfeedGetFeedExpFiltersDto46, newsfeedGetFeedExpFiltersDto47, newsfeedGetFeedExpFiltersDto48, newsfeedGetFeedExpFiltersDto49, newsfeedGetFeedExpFiltersDto50, newsfeedGetFeedExpFiltersDto51, newsfeedGetFeedExpFiltersDto52, newsfeedGetFeedExpFiltersDto53, newsfeedGetFeedExpFiltersDto54, newsfeedGetFeedExpFiltersDto55, newsfeedGetFeedExpFiltersDto56, newsfeedGetFeedExpFiltersDto57, newsfeedGetFeedExpFiltersDto58, newsfeedGetFeedExpFiltersDto59, newsfeedGetFeedExpFiltersDto60, newsfeedGetFeedExpFiltersDto61, newsfeedGetFeedExpFiltersDto62, newsfeedGetFeedExpFiltersDto63, newsfeedGetFeedExpFiltersDto64, newsfeedGetFeedExpFiltersDto65, newsfeedGetFeedExpFiltersDto66, newsfeedGetFeedExpFiltersDto67, newsfeedGetFeedExpFiltersDto68, newsfeedGetFeedExpFiltersDto69, newsfeedGetFeedExpFiltersDto70, newsfeedGetFeedExpFiltersDto71, newsfeedGetFeedExpFiltersDto72, newsfeedGetFeedExpFiltersDto73, newsfeedGetFeedExpFiltersDto74, newsfeedGetFeedExpFiltersDto75, newsfeedGetFeedExpFiltersDto76, newsfeedGetFeedExpFiltersDto77, newsfeedGetFeedExpFiltersDto78, newsfeedGetFeedExpFiltersDto79, newsfeedGetFeedExpFiltersDto80, newsfeedGetFeedExpFiltersDto81};
        $VALUES = newsfeedGetFeedExpFiltersDtoArr;
        $ENTRIES = new asp(newsfeedGetFeedExpFiltersDtoArr);
        CREATOR = new a();
    }

    private NewsfeedGetFeedExpFiltersDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NewsfeedGetFeedExpFiltersDto valueOf(String str) {
        return (NewsfeedGetFeedExpFiltersDto) Enum.valueOf(NewsfeedGetFeedExpFiltersDto.class, str);
    }

    public static NewsfeedGetFeedExpFiltersDto[] values() {
        return (NewsfeedGetFeedExpFiltersDto[]) $VALUES.clone();
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
