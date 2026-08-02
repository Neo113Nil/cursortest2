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
/* compiled from: NewsfeedNewsfeedItemTypeDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedNewsfeedItemTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedNewsfeedItemTypeDto[] $VALUES;

    @pmi0("achievement_game")
    public static final NewsfeedNewsfeedItemTypeDto ACHIEVEMENT_GAME;

    @pmi0(b.JSON_KEY_ADS)
    public static final NewsfeedNewsfeedItemTypeDto ADS;

    @pmi0("ads_app")
    public static final NewsfeedNewsfeedItemTypeDto ADS_APP;

    @pmi0("ads_applovin")
    public static final NewsfeedNewsfeedItemTypeDto ADS_APPLOVIN;

    @pmi0("ads_app_slider")
    public static final NewsfeedNewsfeedItemTypeDto ADS_APP_SLIDER;

    @pmi0("ads_app_video")
    public static final NewsfeedNewsfeedItemTypeDto ADS_APP_VIDEO;

    @pmi0("ads_disabled")
    public static final NewsfeedNewsfeedItemTypeDto ADS_DISABLED;

    @pmi0("ads_post")
    public static final NewsfeedNewsfeedItemTypeDto ADS_POST;

    @pmi0("ads_post_pretty_cards")
    public static final NewsfeedNewsfeedItemTypeDto ADS_POST_PRETTY_CARDS;

    @pmi0("ads_post_snippet_video")
    public static final NewsfeedNewsfeedItemTypeDto ADS_POST_SNIPPET_VIDEO;

    @pmi0("ads_site")
    public static final NewsfeedNewsfeedItemTypeDto ADS_SITE;

    @pmi0("ads_site_slider")
    public static final NewsfeedNewsfeedItemTypeDto ADS_SITE_SLIDER;

    @pmi0("ads_site_slider_special")
    public static final NewsfeedNewsfeedItemTypeDto ADS_SITE_SLIDER_SPECIAL;

    @pmi0("ads_yandex")
    public static final NewsfeedNewsfeedItemTypeDto ADS_YANDEX;

    @pmi0("animated_block")
    public static final NewsfeedNewsfeedItemTypeDto ANIMATED_BLOCK;

    @pmi0("app_widget")
    public static final NewsfeedNewsfeedItemTypeDto APP_WIDGET;

    @pmi0("audio")
    public static final NewsfeedNewsfeedItemTypeDto AUDIO;

    @pmi0("audios_for_you_block")
    public static final NewsfeedNewsfeedItemTypeDto AUDIOS_FOR_YOU_BLOCK;

    @pmi0("audio_playlist")
    public static final NewsfeedNewsfeedItemTypeDto AUDIO_PLAYLIST;

    @pmi0("authors_rec")
    public static final NewsfeedNewsfeedItemTypeDto AUTHORS_REC;

    @pmi0("bookmark_game")
    public static final NewsfeedNewsfeedItemTypeDto BOOKMARK_GAME;

    @pmi0("clip")
    public static final NewsfeedNewsfeedItemTypeDto CLIP;

    @pmi0("clips_autoplay")
    public static final NewsfeedNewsfeedItemTypeDto CLIPS_AUTOPLAY;

    @pmi0("clips_block")
    public static final NewsfeedNewsfeedItemTypeDto CLIPS_BLOCK;

    @pmi0("clips_challenges")
    public static final NewsfeedNewsfeedItemTypeDto CLIPS_CHALLENGES;

    @pmi0("clips_ozon")
    public static final NewsfeedNewsfeedItemTypeDto CLIPS_OZON;

    @pmi0("clips_retention")
    public static final NewsfeedNewsfeedItemTypeDto CLIPS_RETENTION;

    @pmi0("clips_shops")
    public static final NewsfeedNewsfeedItemTypeDto CLIPS_SHOPS;
    public static final Parcelable.Creator<NewsfeedNewsfeedItemTypeDto> CREATOR;

    @pmi0("digest")
    public static final NewsfeedNewsfeedItemTypeDto DIGEST;

    @pmi0("discover_media_block")
    public static final NewsfeedNewsfeedItemTypeDto DISCOVER_MEDIA_BLOCK;

    @pmi0("dzen_block")
    public static final NewsfeedNewsfeedItemTypeDto DZEN_BLOCK;

    @pmi0("dzen_story_news")
    public static final NewsfeedNewsfeedItemTypeDto DZEN_STORY_NEWS;

    @pmi0("dzen_top_stories")
    public static final NewsfeedNewsfeedItemTypeDto DZEN_TOP_STORIES;

    @pmi0("expert_card")
    public static final NewsfeedNewsfeedItemTypeDto EXPERT_CARD;

    @pmi0("feedback_poll")
    public static final NewsfeedNewsfeedItemTypeDto FEEDBACK_POLL;

    @pmi0("friend")
    public static final NewsfeedNewsfeedItemTypeDto FRIEND;

    @pmi0("friends_entrypoints")
    public static final NewsfeedNewsfeedItemTypeDto FRIENDS_ENTRYPOINTS;

    @pmi0("friends_recomm")
    public static final NewsfeedNewsfeedItemTypeDto FRIENDS_RECOMM;

    @pmi0("games_carousel")
    public static final NewsfeedNewsfeedItemTypeDto GAMES_CAROUSEL;

    @pmi0("generic_webview_block")
    public static final NewsfeedNewsfeedItemTypeDto GENERIC_WEBVIEW_BLOCK;

    @pmi0("holiday_friends")
    public static final NewsfeedNewsfeedItemTypeDto HOLIDAY_FRIENDS;

    @pmi0("info_block")
    public static final NewsfeedNewsfeedItemTypeDto INFO_BLOCK;

    @pmi0("interests")
    public static final NewsfeedNewsfeedItemTypeDto INTERESTS;

    @pmi0("liked_by_friends_groups")
    public static final NewsfeedNewsfeedItemTypeDto LIKED_BY_FRIENDS_GROUPS;

    @pmi0("market")
    public static final NewsfeedNewsfeedItemTypeDto MARKET;

    @pmi0("market_carousel")
    public static final NewsfeedNewsfeedItemTypeDto MARKET_CAROUSEL;

    @pmi0("market_groups_block")
    public static final NewsfeedNewsfeedItemTypeDto MARKET_GROUPS_BLOCK;

    @pmi0("mini_apps_carousel")
    public static final NewsfeedNewsfeedItemTypeDto MINI_APPS_CAROUSEL;

    @pmi0("note")
    public static final NewsfeedNewsfeedItemTypeDto NOTE;

    @pmi0("photo")
    public static final NewsfeedNewsfeedItemTypeDto PHOTO;

    @pmi0("photo_tag")
    public static final NewsfeedNewsfeedItemTypeDto PHOTO_TAG;

    @pmi0("playlists_for_you_block")
    public static final NewsfeedNewsfeedItemTypeDto PLAYLISTS_FOR_YOU_BLOCK;

    @pmi0("post")
    public static final NewsfeedNewsfeedItemTypeDto POST;

    @pmi0("promo_button")
    public static final NewsfeedNewsfeedItemTypeDto PROMO_BUTTON;

    @pmi0("recommended_artists")
    public static final NewsfeedNewsfeedItemTypeDto RECOMMENDED_ARTISTS;

    @pmi0("recommended_audios")
    public static final NewsfeedNewsfeedItemTypeDto RECOMMENDED_AUDIOS;

    @pmi0("recommended_channels")
    public static final NewsfeedNewsfeedItemTypeDto RECOMMENDED_CHANNELS;

    @pmi0("recommended_chats")
    public static final NewsfeedNewsfeedItemTypeDto RECOMMENDED_CHATS;

    @pmi0("recommended_game")
    public static final NewsfeedNewsfeedItemTypeDto RECOMMENDED_GAME;

    @pmi0("recommended_games_carousel")
    public static final NewsfeedNewsfeedItemTypeDto RECOMMENDED_GAMES_CAROUSEL;

    @pmi0("recommended_groups")
    public static final NewsfeedNewsfeedItemTypeDto RECOMMENDED_GROUPS;

    @pmi0("recommended_mini_app")
    public static final NewsfeedNewsfeedItemTypeDto RECOMMENDED_MINI_APP;

    @pmi0("recommended_narratives")
    public static final NewsfeedNewsfeedItemTypeDto RECOMMENDED_NARRATIVES;

    @pmi0("recommended_playlists")
    public static final NewsfeedNewsfeedItemTypeDto RECOMMENDED_PLAYLISTS;

    @pmi0("signals")
    public static final NewsfeedNewsfeedItemTypeDto SIGNALS;

    @pmi0("stories")
    public static final NewsfeedNewsfeedItemTypeDto STORIES;

    @pmi0("stories_interesting_block")
    public static final NewsfeedNewsfeedItemTypeDto STORIES_INTERESTING_BLOCK;

    @pmi0("tags_suggestions")
    public static final NewsfeedNewsfeedItemTypeDto TAGS_SUGGESTIONS;

    @pmi0("textlive")
    public static final NewsfeedNewsfeedItemTypeDto TEXTLIVE;

    @pmi0("topic")
    public static final NewsfeedNewsfeedItemTypeDto TOPIC;

    @pmi0("user_rec")
    public static final NewsfeedNewsfeedItemTypeDto USER_REC;

    @pmi0("uxpolls_block")
    public static final NewsfeedNewsfeedItemTypeDto UXPOLLS_BLOCK;

    @pmi0("uxpoll_block")
    public static final NewsfeedNewsfeedItemTypeDto UXPOLL_BLOCK;

    @pmi0("video")
    public static final NewsfeedNewsfeedItemTypeDto VIDEO;

    @pmi0("videos_for_you")
    public static final NewsfeedNewsfeedItemTypeDto VIDEOS_FOR_YOU;

    @pmi0("videos_for_you_block")
    public static final NewsfeedNewsfeedItemTypeDto VIDEOS_FOR_YOU_BLOCK;

    @pmi0("videos_promo")
    public static final NewsfeedNewsfeedItemTypeDto VIDEOS_PROMO;

    @pmi0("video_postcard")
    public static final NewsfeedNewsfeedItemTypeDto VIDEO_POSTCARD;

    @pmi0("wall_photo")
    public static final NewsfeedNewsfeedItemTypeDto WALL_PHOTO;

    @pmi0("youla_carousel")
    public static final NewsfeedNewsfeedItemTypeDto YOULA_CAROUSEL;

    @pmi0("youla_groups_block")
    public static final NewsfeedNewsfeedItemTypeDto YOULA_GROUPS_BLOCK;
    private final String value;

    /* compiled from: NewsfeedNewsfeedItemTypeDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedNewsfeedItemTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemTypeDto createFromParcel(Parcel parcel) {
            return NewsfeedNewsfeedItemTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemTypeDto[] newArray(int i) {
            return new NewsfeedNewsfeedItemTypeDto[i];
        }
    }

    static {
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = new NewsfeedNewsfeedItemTypeDto("POST", 0, "post");
        POST = newsfeedNewsfeedItemTypeDto;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto2 = new NewsfeedNewsfeedItemTypeDto("PHOTO", 1, "photo");
        PHOTO = newsfeedNewsfeedItemTypeDto2;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto3 = new NewsfeedNewsfeedItemTypeDto("PHOTO_TAG", 2, "photo_tag");
        PHOTO_TAG = newsfeedNewsfeedItemTypeDto3;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto4 = new NewsfeedNewsfeedItemTypeDto("WALL_PHOTO", 3, "wall_photo");
        WALL_PHOTO = newsfeedNewsfeedItemTypeDto4;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto5 = new NewsfeedNewsfeedItemTypeDto("FRIEND", 4, "friend");
        FRIEND = newsfeedNewsfeedItemTypeDto5;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto6 = new NewsfeedNewsfeedItemTypeDto(SignalingProtocol.MEDIA_OPTION_AUDIO, 5, "audio");
        AUDIO = newsfeedNewsfeedItemTypeDto6;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto7 = new NewsfeedNewsfeedItemTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 6, "video");
        VIDEO = newsfeedNewsfeedItemTypeDto7;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto8 = new NewsfeedNewsfeedItemTypeDto("TOPIC", 7, "topic");
        TOPIC = newsfeedNewsfeedItemTypeDto8;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto9 = new NewsfeedNewsfeedItemTypeDto("DIGEST", 8, "digest");
        DIGEST = newsfeedNewsfeedItemTypeDto9;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto10 = new NewsfeedNewsfeedItemTypeDto("STORIES", 9, "stories");
        STORIES = newsfeedNewsfeedItemTypeDto10;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto11 = new NewsfeedNewsfeedItemTypeDto("PROMO_BUTTON", 10, "promo_button");
        PROMO_BUTTON = newsfeedNewsfeedItemTypeDto11;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto12 = new NewsfeedNewsfeedItemTypeDto("RECOMMENDED_GROUPS", 11, "recommended_groups");
        RECOMMENDED_GROUPS = newsfeedNewsfeedItemTypeDto12;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto13 = new NewsfeedNewsfeedItemTypeDto("TAGS_SUGGESTIONS", 12, "tags_suggestions");
        TAGS_SUGGESTIONS = newsfeedNewsfeedItemTypeDto13;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto14 = new NewsfeedNewsfeedItemTypeDto("GAMES_CAROUSEL", 13, "games_carousel");
        GAMES_CAROUSEL = newsfeedNewsfeedItemTypeDto14;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto15 = new NewsfeedNewsfeedItemTypeDto("FEEDBACK_POLL", 14, "feedback_poll");
        FEEDBACK_POLL = newsfeedNewsfeedItemTypeDto15;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto16 = new NewsfeedNewsfeedItemTypeDto("ANIMATED_BLOCK", 15, "animated_block");
        ANIMATED_BLOCK = newsfeedNewsfeedItemTypeDto16;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto17 = new NewsfeedNewsfeedItemTypeDto("TEXTLIVE", 16, "textlive");
        TEXTLIVE = newsfeedNewsfeedItemTypeDto17;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto18 = new NewsfeedNewsfeedItemTypeDto("VIDEOS_PROMO", 17, "videos_promo");
        VIDEOS_PROMO = newsfeedNewsfeedItemTypeDto18;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto19 = new NewsfeedNewsfeedItemTypeDto("RECOMMENDED_ARTISTS", 18, "recommended_artists");
        RECOMMENDED_ARTISTS = newsfeedNewsfeedItemTypeDto19;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto20 = new NewsfeedNewsfeedItemTypeDto("RECOMMENDED_PLAYLISTS", 19, "recommended_playlists");
        RECOMMENDED_PLAYLISTS = newsfeedNewsfeedItemTypeDto20;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto21 = new NewsfeedNewsfeedItemTypeDto("CLIPS_AUTOPLAY", 20, "clips_autoplay");
        CLIPS_AUTOPLAY = newsfeedNewsfeedItemTypeDto21;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto22 = new NewsfeedNewsfeedItemTypeDto("RECOMMENDED_GAME", 21, "recommended_game");
        RECOMMENDED_GAME = newsfeedNewsfeedItemTypeDto22;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto23 = new NewsfeedNewsfeedItemTypeDto("CLIPS_CHALLENGES", 22, "clips_challenges");
        CLIPS_CHALLENGES = newsfeedNewsfeedItemTypeDto23;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto24 = new NewsfeedNewsfeedItemTypeDto("EXPERT_CARD", 23, "expert_card");
        EXPERT_CARD = newsfeedNewsfeedItemTypeDto24;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto25 = new NewsfeedNewsfeedItemTypeDto("VIDEOS_FOR_YOU", 24, "videos_for_you");
        VIDEOS_FOR_YOU = newsfeedNewsfeedItemTypeDto25;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto26 = new NewsfeedNewsfeedItemTypeDto("LIKED_BY_FRIENDS_GROUPS", 25, "liked_by_friends_groups");
        LIKED_BY_FRIENDS_GROUPS = newsfeedNewsfeedItemTypeDto26;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto27 = new NewsfeedNewsfeedItemTypeDto("RECOMMENDED_MINI_APP", 26, "recommended_mini_app");
        RECOMMENDED_MINI_APP = newsfeedNewsfeedItemTypeDto27;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto28 = new NewsfeedNewsfeedItemTypeDto("NOTE", 27, "note");
        NOTE = newsfeedNewsfeedItemTypeDto28;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto29 = new NewsfeedNewsfeedItemTypeDto("AUDIO_PLAYLIST", 28, "audio_playlist");
        AUDIO_PLAYLIST = newsfeedNewsfeedItemTypeDto29;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto30 = new NewsfeedNewsfeedItemTypeDto("CLIP", 29, "clip");
        CLIP = newsfeedNewsfeedItemTypeDto30;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto31 = new NewsfeedNewsfeedItemTypeDto("CLIPS_BLOCK", 30, "clips_block");
        CLIPS_BLOCK = newsfeedNewsfeedItemTypeDto31;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto32 = new NewsfeedNewsfeedItemTypeDto("VIDEOS_FOR_YOU_BLOCK", 31, "videos_for_you_block");
        VIDEOS_FOR_YOU_BLOCK = newsfeedNewsfeedItemTypeDto32;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto33 = new NewsfeedNewsfeedItemTypeDto("MINI_APPS_CAROUSEL", 32, "mini_apps_carousel");
        MINI_APPS_CAROUSEL = newsfeedNewsfeedItemTypeDto33;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto34 = new NewsfeedNewsfeedItemTypeDto("RECOMMENDED_GAMES_CAROUSEL", 33, "recommended_games_carousel");
        RECOMMENDED_GAMES_CAROUSEL = newsfeedNewsfeedItemTypeDto34;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto35 = new NewsfeedNewsfeedItemTypeDto("VIDEO_POSTCARD", 34, "video_postcard");
        VIDEO_POSTCARD = newsfeedNewsfeedItemTypeDto35;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto36 = new NewsfeedNewsfeedItemTypeDto("ACHIEVEMENT_GAME", 35, "achievement_game");
        ACHIEVEMENT_GAME = newsfeedNewsfeedItemTypeDto36;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto37 = new NewsfeedNewsfeedItemTypeDto("MARKET", 36, "market");
        MARKET = newsfeedNewsfeedItemTypeDto37;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto38 = new NewsfeedNewsfeedItemTypeDto("FRIENDS_RECOMM", 37, "friends_recomm");
        FRIENDS_RECOMM = newsfeedNewsfeedItemTypeDto38;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto39 = new NewsfeedNewsfeedItemTypeDto("USER_REC", 38, "user_rec");
        USER_REC = newsfeedNewsfeedItemTypeDto39;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto40 = new NewsfeedNewsfeedItemTypeDto("AUTHORS_REC", 39, "authors_rec");
        AUTHORS_REC = newsfeedNewsfeedItemTypeDto40;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto41 = new NewsfeedNewsfeedItemTypeDto("HOLIDAY_FRIENDS", 40, "holiday_friends");
        HOLIDAY_FRIENDS = newsfeedNewsfeedItemTypeDto41;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto42 = new NewsfeedNewsfeedItemTypeDto("INTERESTS", 41, "interests");
        INTERESTS = newsfeedNewsfeedItemTypeDto42;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto43 = new NewsfeedNewsfeedItemTypeDto("GENERIC_WEBVIEW_BLOCK", 42, "generic_webview_block");
        GENERIC_WEBVIEW_BLOCK = newsfeedNewsfeedItemTypeDto43;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto44 = new NewsfeedNewsfeedItemTypeDto("MARKET_GROUPS_BLOCK", 43, "market_groups_block");
        MARKET_GROUPS_BLOCK = newsfeedNewsfeedItemTypeDto44;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto45 = new NewsfeedNewsfeedItemTypeDto("DZEN_TOP_STORIES", 44, "dzen_top_stories");
        DZEN_TOP_STORIES = newsfeedNewsfeedItemTypeDto45;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto46 = new NewsfeedNewsfeedItemTypeDto("DZEN_STORY_NEWS", 45, "dzen_story_news");
        DZEN_STORY_NEWS = newsfeedNewsfeedItemTypeDto46;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto47 = new NewsfeedNewsfeedItemTypeDto("BOOKMARK_GAME", 46, "bookmark_game");
        BOOKMARK_GAME = newsfeedNewsfeedItemTypeDto47;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto48 = new NewsfeedNewsfeedItemTypeDto("SIGNALS", 47, "signals");
        SIGNALS = newsfeedNewsfeedItemTypeDto48;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto49 = new NewsfeedNewsfeedItemTypeDto("STORIES_INTERESTING_BLOCK", 48, "stories_interesting_block");
        STORIES_INTERESTING_BLOCK = newsfeedNewsfeedItemTypeDto49;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto50 = new NewsfeedNewsfeedItemTypeDto("INFO_BLOCK", 49, "info_block");
        INFO_BLOCK = newsfeedNewsfeedItemTypeDto50;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto51 = new NewsfeedNewsfeedItemTypeDto("UXPOLLS_BLOCK", 50, "uxpolls_block");
        UXPOLLS_BLOCK = newsfeedNewsfeedItemTypeDto51;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto52 = new NewsfeedNewsfeedItemTypeDto("DISCOVER_MEDIA_BLOCK", 51, "discover_media_block");
        DISCOVER_MEDIA_BLOCK = newsfeedNewsfeedItemTypeDto52;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto53 = new NewsfeedNewsfeedItemTypeDto("RECOMMENDED_NARRATIVES", 52, "recommended_narratives");
        RECOMMENDED_NARRATIVES = newsfeedNewsfeedItemTypeDto53;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto54 = new NewsfeedNewsfeedItemTypeDto("UXPOLL_BLOCK", 53, "uxpoll_block");
        UXPOLL_BLOCK = newsfeedNewsfeedItemTypeDto54;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto55 = new NewsfeedNewsfeedItemTypeDto("RECOMMENDED_AUDIOS", 54, "recommended_audios");
        RECOMMENDED_AUDIOS = newsfeedNewsfeedItemTypeDto55;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto56 = new NewsfeedNewsfeedItemTypeDto("MARKET_CAROUSEL", 55, "market_carousel");
        MARKET_CAROUSEL = newsfeedNewsfeedItemTypeDto56;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto57 = new NewsfeedNewsfeedItemTypeDto("FRIENDS_ENTRYPOINTS", 56, "friends_entrypoints");
        FRIENDS_ENTRYPOINTS = newsfeedNewsfeedItemTypeDto57;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto58 = new NewsfeedNewsfeedItemTypeDto("YOULA_CAROUSEL", 57, "youla_carousel");
        YOULA_CAROUSEL = newsfeedNewsfeedItemTypeDto58;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto59 = new NewsfeedNewsfeedItemTypeDto("YOULA_GROUPS_BLOCK", 58, "youla_groups_block");
        YOULA_GROUPS_BLOCK = newsfeedNewsfeedItemTypeDto59;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto60 = new NewsfeedNewsfeedItemTypeDto("RECOMMENDED_CHATS", 59, "recommended_chats");
        RECOMMENDED_CHATS = newsfeedNewsfeedItemTypeDto60;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto61 = new NewsfeedNewsfeedItemTypeDto("ADS", 60, b.JSON_KEY_ADS);
        ADS = newsfeedNewsfeedItemTypeDto61;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto62 = new NewsfeedNewsfeedItemTypeDto("CLIPS_RETENTION", 61, "clips_retention");
        CLIPS_RETENTION = newsfeedNewsfeedItemTypeDto62;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto63 = new NewsfeedNewsfeedItemTypeDto("AUDIOS_FOR_YOU_BLOCK", 62, "audios_for_you_block");
        AUDIOS_FOR_YOU_BLOCK = newsfeedNewsfeedItemTypeDto63;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto64 = new NewsfeedNewsfeedItemTypeDto("PLAYLISTS_FOR_YOU_BLOCK", 63, "playlists_for_you_block");
        PLAYLISTS_FOR_YOU_BLOCK = newsfeedNewsfeedItemTypeDto64;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto65 = new NewsfeedNewsfeedItemTypeDto("ADS_POST", 64, "ads_post");
        ADS_POST = newsfeedNewsfeedItemTypeDto65;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto66 = new NewsfeedNewsfeedItemTypeDto("ADS_POST_SNIPPET_VIDEO", 65, "ads_post_snippet_video");
        ADS_POST_SNIPPET_VIDEO = newsfeedNewsfeedItemTypeDto66;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto67 = new NewsfeedNewsfeedItemTypeDto("ADS_APP_SLIDER", 66, "ads_app_slider");
        ADS_APP_SLIDER = newsfeedNewsfeedItemTypeDto67;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto68 = new NewsfeedNewsfeedItemTypeDto("ADS_SITE", 67, "ads_site");
        ADS_SITE = newsfeedNewsfeedItemTypeDto68;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto69 = new NewsfeedNewsfeedItemTypeDto("ADS_APPLOVIN", 68, "ads_applovin");
        ADS_APPLOVIN = newsfeedNewsfeedItemTypeDto69;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto70 = new NewsfeedNewsfeedItemTypeDto("ADS_APP", 69, "ads_app");
        ADS_APP = newsfeedNewsfeedItemTypeDto70;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto71 = new NewsfeedNewsfeedItemTypeDto("ADS_SITE_SLIDER", 70, "ads_site_slider");
        ADS_SITE_SLIDER = newsfeedNewsfeedItemTypeDto71;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto72 = new NewsfeedNewsfeedItemTypeDto("ADS_SITE_SLIDER_SPECIAL", 71, "ads_site_slider_special");
        ADS_SITE_SLIDER_SPECIAL = newsfeedNewsfeedItemTypeDto72;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto73 = new NewsfeedNewsfeedItemTypeDto("ADS_APP_VIDEO", 72, "ads_app_video");
        ADS_APP_VIDEO = newsfeedNewsfeedItemTypeDto73;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto74 = new NewsfeedNewsfeedItemTypeDto("ADS_POST_PRETTY_CARDS", 73, "ads_post_pretty_cards");
        ADS_POST_PRETTY_CARDS = newsfeedNewsfeedItemTypeDto74;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto75 = new NewsfeedNewsfeedItemTypeDto("ADS_DISABLED", 74, "ads_disabled");
        ADS_DISABLED = newsfeedNewsfeedItemTypeDto75;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto76 = new NewsfeedNewsfeedItemTypeDto("ADS_YANDEX", 75, "ads_yandex");
        ADS_YANDEX = newsfeedNewsfeedItemTypeDto76;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto77 = new NewsfeedNewsfeedItemTypeDto("APP_WIDGET", 76, "app_widget");
        APP_WIDGET = newsfeedNewsfeedItemTypeDto77;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto78 = new NewsfeedNewsfeedItemTypeDto("CLIPS_OZON", 77, "clips_ozon");
        CLIPS_OZON = newsfeedNewsfeedItemTypeDto78;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto79 = new NewsfeedNewsfeedItemTypeDto("CLIPS_SHOPS", 78, "clips_shops");
        CLIPS_SHOPS = newsfeedNewsfeedItemTypeDto79;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto80 = new NewsfeedNewsfeedItemTypeDto("RECOMMENDED_CHANNELS", 79, "recommended_channels");
        RECOMMENDED_CHANNELS = newsfeedNewsfeedItemTypeDto80;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto81 = new NewsfeedNewsfeedItemTypeDto("DZEN_BLOCK", 80, "dzen_block");
        DZEN_BLOCK = newsfeedNewsfeedItemTypeDto81;
        NewsfeedNewsfeedItemTypeDto[] newsfeedNewsfeedItemTypeDtoArr = {newsfeedNewsfeedItemTypeDto, newsfeedNewsfeedItemTypeDto2, newsfeedNewsfeedItemTypeDto3, newsfeedNewsfeedItemTypeDto4, newsfeedNewsfeedItemTypeDto5, newsfeedNewsfeedItemTypeDto6, newsfeedNewsfeedItemTypeDto7, newsfeedNewsfeedItemTypeDto8, newsfeedNewsfeedItemTypeDto9, newsfeedNewsfeedItemTypeDto10, newsfeedNewsfeedItemTypeDto11, newsfeedNewsfeedItemTypeDto12, newsfeedNewsfeedItemTypeDto13, newsfeedNewsfeedItemTypeDto14, newsfeedNewsfeedItemTypeDto15, newsfeedNewsfeedItemTypeDto16, newsfeedNewsfeedItemTypeDto17, newsfeedNewsfeedItemTypeDto18, newsfeedNewsfeedItemTypeDto19, newsfeedNewsfeedItemTypeDto20, newsfeedNewsfeedItemTypeDto21, newsfeedNewsfeedItemTypeDto22, newsfeedNewsfeedItemTypeDto23, newsfeedNewsfeedItemTypeDto24, newsfeedNewsfeedItemTypeDto25, newsfeedNewsfeedItemTypeDto26, newsfeedNewsfeedItemTypeDto27, newsfeedNewsfeedItemTypeDto28, newsfeedNewsfeedItemTypeDto29, newsfeedNewsfeedItemTypeDto30, newsfeedNewsfeedItemTypeDto31, newsfeedNewsfeedItemTypeDto32, newsfeedNewsfeedItemTypeDto33, newsfeedNewsfeedItemTypeDto34, newsfeedNewsfeedItemTypeDto35, newsfeedNewsfeedItemTypeDto36, newsfeedNewsfeedItemTypeDto37, newsfeedNewsfeedItemTypeDto38, newsfeedNewsfeedItemTypeDto39, newsfeedNewsfeedItemTypeDto40, newsfeedNewsfeedItemTypeDto41, newsfeedNewsfeedItemTypeDto42, newsfeedNewsfeedItemTypeDto43, newsfeedNewsfeedItemTypeDto44, newsfeedNewsfeedItemTypeDto45, newsfeedNewsfeedItemTypeDto46, newsfeedNewsfeedItemTypeDto47, newsfeedNewsfeedItemTypeDto48, newsfeedNewsfeedItemTypeDto49, newsfeedNewsfeedItemTypeDto50, newsfeedNewsfeedItemTypeDto51, newsfeedNewsfeedItemTypeDto52, newsfeedNewsfeedItemTypeDto53, newsfeedNewsfeedItemTypeDto54, newsfeedNewsfeedItemTypeDto55, newsfeedNewsfeedItemTypeDto56, newsfeedNewsfeedItemTypeDto57, newsfeedNewsfeedItemTypeDto58, newsfeedNewsfeedItemTypeDto59, newsfeedNewsfeedItemTypeDto60, newsfeedNewsfeedItemTypeDto61, newsfeedNewsfeedItemTypeDto62, newsfeedNewsfeedItemTypeDto63, newsfeedNewsfeedItemTypeDto64, newsfeedNewsfeedItemTypeDto65, newsfeedNewsfeedItemTypeDto66, newsfeedNewsfeedItemTypeDto67, newsfeedNewsfeedItemTypeDto68, newsfeedNewsfeedItemTypeDto69, newsfeedNewsfeedItemTypeDto70, newsfeedNewsfeedItemTypeDto71, newsfeedNewsfeedItemTypeDto72, newsfeedNewsfeedItemTypeDto73, newsfeedNewsfeedItemTypeDto74, newsfeedNewsfeedItemTypeDto75, newsfeedNewsfeedItemTypeDto76, newsfeedNewsfeedItemTypeDto77, newsfeedNewsfeedItemTypeDto78, newsfeedNewsfeedItemTypeDto79, newsfeedNewsfeedItemTypeDto80, newsfeedNewsfeedItemTypeDto81};
        $VALUES = newsfeedNewsfeedItemTypeDtoArr;
        $ENTRIES = new asp(newsfeedNewsfeedItemTypeDtoArr);
        CREATOR = new a();
    }

    private NewsfeedNewsfeedItemTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NewsfeedNewsfeedItemTypeDto valueOf(String str) {
        return (NewsfeedNewsfeedItemTypeDto) Enum.valueOf(NewsfeedNewsfeedItemTypeDto.class, str);
    }

    public static NewsfeedNewsfeedItemTypeDto[] values() {
        return (NewsfeedNewsfeedItemTypeDto[]) $VALUES.clone();
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
