package com.vk.sdk.api.newsfeed.dto;

import com.mbridge.msdk.foundation.entity.b;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewsfeedNewsfeedItemTypeDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedNewsfeedItemTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedNewsfeedItemTypeDto[] $VALUES;

    @pmi0("achievement_game")
    public static final NewsfeedNewsfeedItemTypeDto ACHIEVEMENT_GAME;

    @pmi0(b.JSON_KEY_ADS)
    public static final NewsfeedNewsfeedItemTypeDto ADS;

    @pmi0("aliexpress_carousel")
    public static final NewsfeedNewsfeedItemTypeDto ALIEXPRESS_CAROUSEL;

    @pmi0("animated_block")
    public static final NewsfeedNewsfeedItemTypeDto ANIMATED_BLOCK;

    @pmi0("audio")
    public static final NewsfeedNewsfeedItemTypeDto AUDIO;

    @pmi0("audio_playlist")
    public static final NewsfeedNewsfeedItemTypeDto AUDIO_PLAYLIST;

    @pmi0("authors_rec")
    public static final NewsfeedNewsfeedItemTypeDto AUTHORS_REC;

    @pmi0("bookmark_game")
    public static final NewsfeedNewsfeedItemTypeDto BOOKMARK_GAME;

    @pmi0("clip")
    public static final NewsfeedNewsfeedItemTypeDto CLIP;

    @pmi0("clips")
    public static final NewsfeedNewsfeedItemTypeDto CLIPS;

    @pmi0("clips_autoplay")
    public static final NewsfeedNewsfeedItemTypeDto CLIPS_AUTOPLAY;

    @pmi0("clips_block")
    public static final NewsfeedNewsfeedItemTypeDto CLIPS_BLOCK;

    @pmi0("clips_challenges")
    public static final NewsfeedNewsfeedItemTypeDto CLIPS_CHALLENGES;

    @pmi0("digest")
    public static final NewsfeedNewsfeedItemTypeDto DIGEST;

    @pmi0("discover_media_block")
    public static final NewsfeedNewsfeedItemTypeDto DISCOVER_MEDIA_BLOCK;

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

    @pmi0("post")
    public static final NewsfeedNewsfeedItemTypeDto POST;

    @pmi0("promo_button")
    public static final NewsfeedNewsfeedItemTypeDto PROMO_BUTTON;

    @pmi0("recommended_artists")
    public static final NewsfeedNewsfeedItemTypeDto RECOMMENDED_ARTISTS;

    @pmi0("recommended_audios")
    public static final NewsfeedNewsfeedItemTypeDto RECOMMENDED_AUDIOS;

    @pmi0("recommended_chats")
    public static final NewsfeedNewsfeedItemTypeDto RECOMMENDED_CHATS;

    @pmi0("recommended_game")
    public static final NewsfeedNewsfeedItemTypeDto RECOMMENDED_GAME;

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

    @pmi0("worki_carousel")
    public static final NewsfeedNewsfeedItemTypeDto WORKI_CAROUSEL;

    @pmi0("youla_carousel")
    public static final NewsfeedNewsfeedItemTypeDto YOULA_CAROUSEL;

    @pmi0("youla_groups_block")
    public static final NewsfeedNewsfeedItemTypeDto YOULA_GROUPS_BLOCK;
    private final String value;

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
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto11 = new NewsfeedNewsfeedItemTypeDto("CLIPS", 10, "clips");
        CLIPS = newsfeedNewsfeedItemTypeDto11;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto12 = new NewsfeedNewsfeedItemTypeDto("PROMO_BUTTON", 11, "promo_button");
        PROMO_BUTTON = newsfeedNewsfeedItemTypeDto12;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto13 = new NewsfeedNewsfeedItemTypeDto("RECOMMENDED_GROUPS", 12, "recommended_groups");
        RECOMMENDED_GROUPS = newsfeedNewsfeedItemTypeDto13;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto14 = new NewsfeedNewsfeedItemTypeDto("TAGS_SUGGESTIONS", 13, "tags_suggestions");
        TAGS_SUGGESTIONS = newsfeedNewsfeedItemTypeDto14;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto15 = new NewsfeedNewsfeedItemTypeDto("GAMES_CAROUSEL", 14, "games_carousel");
        GAMES_CAROUSEL = newsfeedNewsfeedItemTypeDto15;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto16 = new NewsfeedNewsfeedItemTypeDto("FEEDBACK_POLL", 15, "feedback_poll");
        FEEDBACK_POLL = newsfeedNewsfeedItemTypeDto16;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto17 = new NewsfeedNewsfeedItemTypeDto("ANIMATED_BLOCK", 16, "animated_block");
        ANIMATED_BLOCK = newsfeedNewsfeedItemTypeDto17;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto18 = new NewsfeedNewsfeedItemTypeDto("TEXTLIVE", 17, "textlive");
        TEXTLIVE = newsfeedNewsfeedItemTypeDto18;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto19 = new NewsfeedNewsfeedItemTypeDto("VIDEOS_PROMO", 18, "videos_promo");
        VIDEOS_PROMO = newsfeedNewsfeedItemTypeDto19;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto20 = new NewsfeedNewsfeedItemTypeDto("RECOMMENDED_ARTISTS", 19, "recommended_artists");
        RECOMMENDED_ARTISTS = newsfeedNewsfeedItemTypeDto20;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto21 = new NewsfeedNewsfeedItemTypeDto("RECOMMENDED_PLAYLISTS", 20, "recommended_playlists");
        RECOMMENDED_PLAYLISTS = newsfeedNewsfeedItemTypeDto21;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto22 = new NewsfeedNewsfeedItemTypeDto("CLIPS_AUTOPLAY", 21, "clips_autoplay");
        CLIPS_AUTOPLAY = newsfeedNewsfeedItemTypeDto22;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto23 = new NewsfeedNewsfeedItemTypeDto("RECOMMENDED_GAME", 22, "recommended_game");
        RECOMMENDED_GAME = newsfeedNewsfeedItemTypeDto23;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto24 = new NewsfeedNewsfeedItemTypeDto("CLIPS_CHALLENGES", 23, "clips_challenges");
        CLIPS_CHALLENGES = newsfeedNewsfeedItemTypeDto24;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto25 = new NewsfeedNewsfeedItemTypeDto("EXPERT_CARD", 24, "expert_card");
        EXPERT_CARD = newsfeedNewsfeedItemTypeDto25;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto26 = new NewsfeedNewsfeedItemTypeDto("VIDEOS_FOR_YOU", 25, "videos_for_you");
        VIDEOS_FOR_YOU = newsfeedNewsfeedItemTypeDto26;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto27 = new NewsfeedNewsfeedItemTypeDto("LIKED_BY_FRIENDS_GROUPS", 26, "liked_by_friends_groups");
        LIKED_BY_FRIENDS_GROUPS = newsfeedNewsfeedItemTypeDto27;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto28 = new NewsfeedNewsfeedItemTypeDto("RECOMMENDED_MINI_APP", 27, "recommended_mini_app");
        RECOMMENDED_MINI_APP = newsfeedNewsfeedItemTypeDto28;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto29 = new NewsfeedNewsfeedItemTypeDto("NOTE", 28, "note");
        NOTE = newsfeedNewsfeedItemTypeDto29;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto30 = new NewsfeedNewsfeedItemTypeDto("AUDIO_PLAYLIST", 29, "audio_playlist");
        AUDIO_PLAYLIST = newsfeedNewsfeedItemTypeDto30;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto31 = new NewsfeedNewsfeedItemTypeDto("CLIP", 30, "clip");
        CLIP = newsfeedNewsfeedItemTypeDto31;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto32 = new NewsfeedNewsfeedItemTypeDto("CLIPS_BLOCK", 31, "clips_block");
        CLIPS_BLOCK = newsfeedNewsfeedItemTypeDto32;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto33 = new NewsfeedNewsfeedItemTypeDto("VIDEOS_FOR_YOU_BLOCK", 32, "videos_for_you_block");
        VIDEOS_FOR_YOU_BLOCK = newsfeedNewsfeedItemTypeDto33;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto34 = new NewsfeedNewsfeedItemTypeDto("MINI_APPS_CAROUSEL", 33, "mini_apps_carousel");
        MINI_APPS_CAROUSEL = newsfeedNewsfeedItemTypeDto34;
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
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto49 = new NewsfeedNewsfeedItemTypeDto("INFO_BLOCK", 48, "info_block");
        INFO_BLOCK = newsfeedNewsfeedItemTypeDto49;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto50 = new NewsfeedNewsfeedItemTypeDto("UXPOLLS_BLOCK", 49, "uxpolls_block");
        UXPOLLS_BLOCK = newsfeedNewsfeedItemTypeDto50;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto51 = new NewsfeedNewsfeedItemTypeDto("DISCOVER_MEDIA_BLOCK", 50, "discover_media_block");
        DISCOVER_MEDIA_BLOCK = newsfeedNewsfeedItemTypeDto51;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto52 = new NewsfeedNewsfeedItemTypeDto("RECOMMENDED_NARRATIVES", 51, "recommended_narratives");
        RECOMMENDED_NARRATIVES = newsfeedNewsfeedItemTypeDto52;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto53 = new NewsfeedNewsfeedItemTypeDto("UXPOLL_BLOCK", 52, "uxpoll_block");
        UXPOLL_BLOCK = newsfeedNewsfeedItemTypeDto53;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto54 = new NewsfeedNewsfeedItemTypeDto("RECOMMENDED_AUDIOS", 53, "recommended_audios");
        RECOMMENDED_AUDIOS = newsfeedNewsfeedItemTypeDto54;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto55 = new NewsfeedNewsfeedItemTypeDto("ALIEXPRESS_CAROUSEL", 54, "aliexpress_carousel");
        ALIEXPRESS_CAROUSEL = newsfeedNewsfeedItemTypeDto55;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto56 = new NewsfeedNewsfeedItemTypeDto("FRIENDS_ENTRYPOINTS", 55, "friends_entrypoints");
        FRIENDS_ENTRYPOINTS = newsfeedNewsfeedItemTypeDto56;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto57 = new NewsfeedNewsfeedItemTypeDto("WORKI_CAROUSEL", 56, "worki_carousel");
        WORKI_CAROUSEL = newsfeedNewsfeedItemTypeDto57;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto58 = new NewsfeedNewsfeedItemTypeDto("YOULA_CAROUSEL", 57, "youla_carousel");
        YOULA_CAROUSEL = newsfeedNewsfeedItemTypeDto58;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto59 = new NewsfeedNewsfeedItemTypeDto("YOULA_GROUPS_BLOCK", 58, "youla_groups_block");
        YOULA_GROUPS_BLOCK = newsfeedNewsfeedItemTypeDto59;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto60 = new NewsfeedNewsfeedItemTypeDto("RECOMMENDED_CHATS", 59, "recommended_chats");
        RECOMMENDED_CHATS = newsfeedNewsfeedItemTypeDto60;
        NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto61 = new NewsfeedNewsfeedItemTypeDto("ADS", 60, b.JSON_KEY_ADS);
        ADS = newsfeedNewsfeedItemTypeDto61;
        NewsfeedNewsfeedItemTypeDto[] newsfeedNewsfeedItemTypeDtoArr = {newsfeedNewsfeedItemTypeDto, newsfeedNewsfeedItemTypeDto2, newsfeedNewsfeedItemTypeDto3, newsfeedNewsfeedItemTypeDto4, newsfeedNewsfeedItemTypeDto5, newsfeedNewsfeedItemTypeDto6, newsfeedNewsfeedItemTypeDto7, newsfeedNewsfeedItemTypeDto8, newsfeedNewsfeedItemTypeDto9, newsfeedNewsfeedItemTypeDto10, newsfeedNewsfeedItemTypeDto11, newsfeedNewsfeedItemTypeDto12, newsfeedNewsfeedItemTypeDto13, newsfeedNewsfeedItemTypeDto14, newsfeedNewsfeedItemTypeDto15, newsfeedNewsfeedItemTypeDto16, newsfeedNewsfeedItemTypeDto17, newsfeedNewsfeedItemTypeDto18, newsfeedNewsfeedItemTypeDto19, newsfeedNewsfeedItemTypeDto20, newsfeedNewsfeedItemTypeDto21, newsfeedNewsfeedItemTypeDto22, newsfeedNewsfeedItemTypeDto23, newsfeedNewsfeedItemTypeDto24, newsfeedNewsfeedItemTypeDto25, newsfeedNewsfeedItemTypeDto26, newsfeedNewsfeedItemTypeDto27, newsfeedNewsfeedItemTypeDto28, newsfeedNewsfeedItemTypeDto29, newsfeedNewsfeedItemTypeDto30, newsfeedNewsfeedItemTypeDto31, newsfeedNewsfeedItemTypeDto32, newsfeedNewsfeedItemTypeDto33, newsfeedNewsfeedItemTypeDto34, newsfeedNewsfeedItemTypeDto35, newsfeedNewsfeedItemTypeDto36, newsfeedNewsfeedItemTypeDto37, newsfeedNewsfeedItemTypeDto38, newsfeedNewsfeedItemTypeDto39, newsfeedNewsfeedItemTypeDto40, newsfeedNewsfeedItemTypeDto41, newsfeedNewsfeedItemTypeDto42, newsfeedNewsfeedItemTypeDto43, newsfeedNewsfeedItemTypeDto44, newsfeedNewsfeedItemTypeDto45, newsfeedNewsfeedItemTypeDto46, newsfeedNewsfeedItemTypeDto47, newsfeedNewsfeedItemTypeDto48, newsfeedNewsfeedItemTypeDto49, newsfeedNewsfeedItemTypeDto50, newsfeedNewsfeedItemTypeDto51, newsfeedNewsfeedItemTypeDto52, newsfeedNewsfeedItemTypeDto53, newsfeedNewsfeedItemTypeDto54, newsfeedNewsfeedItemTypeDto55, newsfeedNewsfeedItemTypeDto56, newsfeedNewsfeedItemTypeDto57, newsfeedNewsfeedItemTypeDto58, newsfeedNewsfeedItemTypeDto59, newsfeedNewsfeedItemTypeDto60, newsfeedNewsfeedItemTypeDto61};
        $VALUES = newsfeedNewsfeedItemTypeDtoArr;
        $ENTRIES = new asp(newsfeedNewsfeedItemTypeDtoArr);
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
}
