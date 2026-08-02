package com.vk.sdk.api.stories.dto;

import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.apps.dto.AppsAppMinDto;
import com.vk.sdk.api.audio.dto.AudioAudioDto;
import com.vk.sdk.api.base.dto.BaseLinkDto;
import com.vk.sdk.api.market.dto.MarketMarketItemDto;
import com.vk.sdk.api.polls.dto.PollsPollDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.n6j;
import xsna.pmi0;
import xsna.shy;
import xsna.sq;
import xsna.tq;
import xsna.zcl;
import xsna.zrp;

/* compiled from: StoriesClickableStickerDto.kt */
/* loaded from: classes5.dex */
public final class StoriesClickableStickerDto {

    /* renamed from: app, reason: collision with root package name */
    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    private final AppsAppMinDto f93app;

    @pmi0(X3.i.L0)
    private final String appContext;

    @pmi0("audio")
    private final AudioAudioDto audio;

    @pmi0("audio_start_time")
    private final Integer audioStartTime;

    @pmi0("clickable_area")
    private final List<StoriesClickableAreaDto> clickableArea;

    @pmi0("clip_id")
    private final Integer clipId;

    @pmi0("color")
    private final String color;

    @pmi0("has_new_interactions")
    private final Boolean hasNewInteractions;

    @pmi0("hashtag")
    private final String hashtag;

    @pmi0("id")
    private final int id;

    @pmi0("is_broadcast_notify_allowed")
    private final Boolean isBroadcastNotifyAllowed;

    @pmi0("link_object")
    private final BaseLinkDto linkObject;

    @pmi0("market_item")
    private final MarketMarketItemDto marketItem;

    @pmi0("mention")
    private final String mention;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("place_id")
    private final Integer placeId;

    @pmi0("poll")
    private final PollsPollDto poll;

    @pmi0("post_id")
    private final Integer postId;

    @pmi0("post_owner_id")
    private final UserId postOwnerId;

    @pmi0("question")
    private final String question;

    @pmi0("question_button")
    private final String questionButton;

    @pmi0("situational_app_url")
    private final String situationalAppUrl;

    @pmi0("situational_theme_id")
    private final Integer situationalThemeId;

    @pmi0("sticker_id")
    private final Integer stickerId;

    @pmi0("sticker_pack_id")
    private final Integer stickerPackId;

    @pmi0("story_id")
    private final Integer storyId;

    @pmi0(TtmlNode.TAG_STYLE)
    private final StyleDto style;

    @pmi0("subtype")
    private final SubtypeDto subtype;

    @pmi0("tooltip_text")
    private final String tooltipText;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoriesClickableStickerDto.kt */
    public static final class StyleDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;

        @pmi0("blue")
        public static final StyleDto BLUE;

        @pmi0("blue_gradient")
        public static final StyleDto BLUE_GRADIENT;

        @pmi0("green")
        public static final StyleDto GREEN;

        @pmi0("impressive")
        public static final StyleDto IMPRESSIVE;

        @pmi0("light")
        public static final StyleDto LIGHT;

        @pmi0("question_reply")
        public static final StyleDto QUESTION_REPLY;

        @pmi0("red_gradient")
        public static final StyleDto RED_GRADIENT;

        @pmi0(X3.i.T)
        public static final StyleDto TRANSPARENT;

        @pmi0(TtmlNode.UNDERLINE)
        public static final StyleDto UNDERLINE;

        @pmi0("white")
        public static final StyleDto WHITE;
        private final String value;

        static {
            StyleDto styleDto = new StyleDto("TRANSPARENT", 0, X3.i.T);
            TRANSPARENT = styleDto;
            StyleDto styleDto2 = new StyleDto("BLUE_GRADIENT", 1, "blue_gradient");
            BLUE_GRADIENT = styleDto2;
            StyleDto styleDto3 = new StyleDto("RED_GRADIENT", 2, "red_gradient");
            RED_GRADIENT = styleDto3;
            StyleDto styleDto4 = new StyleDto("UNDERLINE", 3, TtmlNode.UNDERLINE);
            UNDERLINE = styleDto4;
            StyleDto styleDto5 = new StyleDto("BLUE", 4, "blue");
            BLUE = styleDto5;
            StyleDto styleDto6 = new StyleDto("GREEN", 5, "green");
            GREEN = styleDto6;
            StyleDto styleDto7 = new StyleDto("WHITE", 6, "white");
            WHITE = styleDto7;
            StyleDto styleDto8 = new StyleDto("QUESTION_REPLY", 7, "question_reply");
            QUESTION_REPLY = styleDto8;
            StyleDto styleDto9 = new StyleDto("LIGHT", 8, "light");
            LIGHT = styleDto9;
            StyleDto styleDto10 = new StyleDto("IMPRESSIVE", 9, "impressive");
            IMPRESSIVE = styleDto10;
            StyleDto[] styleDtoArr = {styleDto, styleDto2, styleDto3, styleDto4, styleDto5, styleDto6, styleDto7, styleDto8, styleDto9, styleDto10};
            $VALUES = styleDtoArr;
            $ENTRIES = new asp(styleDtoArr);
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
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoriesClickableStickerDto.kt */
    public static final class SubtypeDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SubtypeDto[] $VALUES;

        @pmi0("aliexpress_product")
        public static final SubtypeDto ALIEXPRESS_PRODUCT;

        @pmi0("market_item")
        public static final SubtypeDto MARKET_ITEM;
        private final String value;

        static {
            SubtypeDto subtypeDto = new SubtypeDto("MARKET_ITEM", 0, "market_item");
            MARKET_ITEM = subtypeDto;
            SubtypeDto subtypeDto2 = new SubtypeDto("ALIEXPRESS_PRODUCT", 1, "aliexpress_product");
            ALIEXPRESS_PRODUCT = subtypeDto2;
            SubtypeDto[] subtypeDtoArr = {subtypeDto, subtypeDto2};
            $VALUES = subtypeDtoArr;
            $ENTRIES = new asp(subtypeDtoArr);
        }

        private SubtypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static SubtypeDto valueOf(String str) {
            return (SubtypeDto) Enum.valueOf(SubtypeDto.class, str);
        }

        public static SubtypeDto[] values() {
            return (SubtypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoriesClickableStickerDto.kt */
    public static final class TypeDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
        public static final TypeDto APP;

        @pmi0("clip")
        public static final TypeDto CLIP;

        @pmi0("hashtag")
        public static final TypeDto HASHTAG;

        @pmi0("link")
        public static final TypeDto LINK;

        @pmi0("market_item")
        public static final TypeDto MARKET_ITEM;

        @pmi0("mention")
        public static final TypeDto MENTION;

        @pmi0("music")
        public static final TypeDto MUSIC;

        @pmi0("owner")
        public static final TypeDto OWNER;

        @pmi0("place")
        public static final TypeDto PLACE;

        @pmi0("playlist")
        public static final TypeDto PLAYLIST;

        @pmi0("poll")
        public static final TypeDto POLL;

        @pmi0("post")
        public static final TypeDto POST;

        @pmi0("question")
        public static final TypeDto QUESTION;

        @pmi0("situational_theme")
        public static final TypeDto SITUATIONAL_THEME;

        @pmi0("sticker")
        public static final TypeDto STICKER;

        @pmi0("story_reply")
        public static final TypeDto STORY_REPLY;
        private final String value;

        static {
            TypeDto typeDto = new TypeDto("HASHTAG", 0, "hashtag");
            HASHTAG = typeDto;
            TypeDto typeDto2 = new TypeDto("MENTION", 1, "mention");
            MENTION = typeDto2;
            TypeDto typeDto3 = new TypeDto("LINK", 2, "link");
            LINK = typeDto3;
            TypeDto typeDto4 = new TypeDto("QUESTION", 3, "question");
            QUESTION = typeDto4;
            TypeDto typeDto5 = new TypeDto("PLACE", 4, "place");
            PLACE = typeDto5;
            TypeDto typeDto6 = new TypeDto("MARKET_ITEM", 5, "market_item");
            MARKET_ITEM = typeDto6;
            TypeDto typeDto7 = new TypeDto("MUSIC", 6, "music");
            MUSIC = typeDto7;
            TypeDto typeDto8 = new TypeDto("STORY_REPLY", 7, "story_reply");
            STORY_REPLY = typeDto8;
            TypeDto typeDto9 = new TypeDto("OWNER", 8, "owner");
            OWNER = typeDto9;
            TypeDto typeDto10 = new TypeDto("POST", 9, "post");
            POST = typeDto10;
            TypeDto typeDto11 = new TypeDto("POLL", 10, "poll");
            POLL = typeDto11;
            TypeDto typeDto12 = new TypeDto("STICKER", 11, "sticker");
            STICKER = typeDto12;
            TypeDto typeDto13 = new TypeDto("APP", 12, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
            APP = typeDto13;
            TypeDto typeDto14 = new TypeDto("SITUATIONAL_THEME", 13, "situational_theme");
            SITUATIONAL_THEME = typeDto14;
            TypeDto typeDto15 = new TypeDto("PLAYLIST", 14, "playlist");
            PLAYLIST = typeDto15;
            TypeDto typeDto16 = new TypeDto("CLIP", 15, "clip");
            CLIP = typeDto16;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6, typeDto7, typeDto8, typeDto9, typeDto10, typeDto11, typeDto12, typeDto13, typeDto14, typeDto15, typeDto16};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
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
    }

    public StoriesClickableStickerDto(List<StoriesClickableAreaDto> list, int i, TypeDto typeDto, String str, BaseLinkDto baseLinkDto, String str2, String str3, UserId userId, Integer num, Integer num2, String str4, String str5, Integer num3, MarketMarketItemDto marketMarketItemDto, AudioAudioDto audioAudioDto, Integer num4, StyleDto styleDto, SubtypeDto subtypeDto, UserId userId2, Integer num5, PollsPollDto pollsPollDto, String str6, Integer num6, Integer num7, AppsAppMinDto appsAppMinDto, String str7, Boolean bool, Boolean bool2, Integer num8, String str8) {
        this.clickableArea = list;
        this.id = i;
        this.type = typeDto;
        this.hashtag = str;
        this.linkObject = baseLinkDto;
        this.mention = str2;
        this.tooltipText = str3;
        this.ownerId = userId;
        this.storyId = num;
        this.clipId = num2;
        this.question = str4;
        this.questionButton = str5;
        this.placeId = num3;
        this.marketItem = marketMarketItemDto;
        this.audio = audioAudioDto;
        this.audioStartTime = num4;
        this.style = styleDto;
        this.subtype = subtypeDto;
        this.postOwnerId = userId2;
        this.postId = num5;
        this.poll = pollsPollDto;
        this.color = str6;
        this.stickerId = num6;
        this.stickerPackId = num7;
        this.f93app = appsAppMinDto;
        this.appContext = str7;
        this.hasNewInteractions = bool;
        this.isBroadcastNotifyAllowed = bool2;
        this.situationalThemeId = num8;
        this.situationalAppUrl = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesClickableStickerDto)) {
            return false;
        }
        StoriesClickableStickerDto storiesClickableStickerDto = (StoriesClickableStickerDto) obj;
        return epx.f(this.clickableArea, storiesClickableStickerDto.clickableArea) && this.id == storiesClickableStickerDto.id && this.type == storiesClickableStickerDto.type && epx.f(this.hashtag, storiesClickableStickerDto.hashtag) && epx.f(this.linkObject, storiesClickableStickerDto.linkObject) && epx.f(this.mention, storiesClickableStickerDto.mention) && epx.f(this.tooltipText, storiesClickableStickerDto.tooltipText) && epx.f(this.ownerId, storiesClickableStickerDto.ownerId) && epx.f(this.storyId, storiesClickableStickerDto.storyId) && epx.f(this.clipId, storiesClickableStickerDto.clipId) && epx.f(this.question, storiesClickableStickerDto.question) && epx.f(this.questionButton, storiesClickableStickerDto.questionButton) && epx.f(this.placeId, storiesClickableStickerDto.placeId) && epx.f(this.marketItem, storiesClickableStickerDto.marketItem) && epx.f(this.audio, storiesClickableStickerDto.audio) && epx.f(this.audioStartTime, storiesClickableStickerDto.audioStartTime) && this.style == storiesClickableStickerDto.style && this.subtype == storiesClickableStickerDto.subtype && epx.f(this.postOwnerId, storiesClickableStickerDto.postOwnerId) && epx.f(this.postId, storiesClickableStickerDto.postId) && epx.f(this.poll, storiesClickableStickerDto.poll) && epx.f(this.color, storiesClickableStickerDto.color) && epx.f(this.stickerId, storiesClickableStickerDto.stickerId) && epx.f(this.stickerPackId, storiesClickableStickerDto.stickerPackId) && epx.f(this.f93app, storiesClickableStickerDto.f93app) && epx.f(this.appContext, storiesClickableStickerDto.appContext) && epx.f(this.hasNewInteractions, storiesClickableStickerDto.hasNewInteractions) && epx.f(this.isBroadcastNotifyAllowed, storiesClickableStickerDto.isBroadcastNotifyAllowed) && epx.f(this.situationalThemeId, storiesClickableStickerDto.situationalThemeId) && epx.f(this.situationalAppUrl, storiesClickableStickerDto.situationalAppUrl);
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + shy.a(this.id, this.clickableArea.hashCode() * 31, 31)) * 31;
        String str = this.hashtag;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BaseLinkDto baseLinkDto = this.linkObject;
        int hashCode3 = (hashCode2 + (baseLinkDto == null ? 0 : baseLinkDto.hashCode())) * 31;
        String str2 = this.mention;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tooltipText;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UserId userId = this.ownerId;
        int hashCode6 = (hashCode5 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Integer num = this.storyId;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.clipId;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.question;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.questionButton;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.placeId;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        MarketMarketItemDto marketMarketItemDto = this.marketItem;
        int hashCode12 = (hashCode11 + (marketMarketItemDto == null ? 0 : marketMarketItemDto.hashCode())) * 31;
        AudioAudioDto audioAudioDto = this.audio;
        int hashCode13 = (hashCode12 + (audioAudioDto == null ? 0 : audioAudioDto.hashCode())) * 31;
        Integer num4 = this.audioStartTime;
        int hashCode14 = (hashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
        StyleDto styleDto = this.style;
        int hashCode15 = (hashCode14 + (styleDto == null ? 0 : styleDto.hashCode())) * 31;
        SubtypeDto subtypeDto = this.subtype;
        int hashCode16 = (hashCode15 + (subtypeDto == null ? 0 : subtypeDto.hashCode())) * 31;
        UserId userId2 = this.postOwnerId;
        int hashCode17 = (hashCode16 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        Integer num5 = this.postId;
        int hashCode18 = (hashCode17 + (num5 == null ? 0 : num5.hashCode())) * 31;
        PollsPollDto pollsPollDto = this.poll;
        int hashCode19 = (hashCode18 + (pollsPollDto == null ? 0 : pollsPollDto.hashCode())) * 31;
        String str6 = this.color;
        int hashCode20 = (hashCode19 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num6 = this.stickerId;
        int hashCode21 = (hashCode20 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.stickerPackId;
        int hashCode22 = (hashCode21 + (num7 == null ? 0 : num7.hashCode())) * 31;
        AppsAppMinDto appsAppMinDto = this.f93app;
        int hashCode23 = (hashCode22 + (appsAppMinDto == null ? 0 : appsAppMinDto.hashCode())) * 31;
        String str7 = this.appContext;
        int hashCode24 = (hashCode23 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.hasNewInteractions;
        int hashCode25 = (hashCode24 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isBroadcastNotifyAllowed;
        int hashCode26 = (hashCode25 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num8 = this.situationalThemeId;
        int hashCode27 = (hashCode26 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str8 = this.situationalAppUrl;
        return hashCode27 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        List<StoriesClickableAreaDto> list = this.clickableArea;
        int i = this.id;
        TypeDto typeDto = this.type;
        String str = this.hashtag;
        BaseLinkDto baseLinkDto = this.linkObject;
        String str2 = this.mention;
        String str3 = this.tooltipText;
        UserId userId = this.ownerId;
        Integer num = this.storyId;
        Integer num2 = this.clipId;
        String str4 = this.question;
        String str5 = this.questionButton;
        Integer num3 = this.placeId;
        MarketMarketItemDto marketMarketItemDto = this.marketItem;
        AudioAudioDto audioAudioDto = this.audio;
        Integer num4 = this.audioStartTime;
        StyleDto styleDto = this.style;
        SubtypeDto subtypeDto = this.subtype;
        UserId userId2 = this.postOwnerId;
        Integer num5 = this.postId;
        PollsPollDto pollsPollDto = this.poll;
        String str6 = this.color;
        Integer num6 = this.stickerId;
        Integer num7 = this.stickerPackId;
        AppsAppMinDto appsAppMinDto = this.f93app;
        String str7 = this.appContext;
        Boolean bool = this.hasNewInteractions;
        Boolean bool2 = this.isBroadcastNotifyAllowed;
        Integer num8 = this.situationalThemeId;
        String str8 = this.situationalAppUrl;
        StringBuilder sb = new StringBuilder("StoriesClickableStickerDto(clickableArea=");
        sb.append(list);
        sb.append(", id=");
        sb.append(i);
        sb.append(", type=");
        sb.append(typeDto);
        sb.append(", hashtag=");
        sb.append(str);
        sb.append(", linkObject=");
        sb.append(baseLinkDto);
        sb.append(", mention=");
        sb.append(str2);
        sb.append(", tooltipText=");
        sb.append(str3);
        sb.append(", ownerId=");
        sb.append(userId);
        sb.append(", storyId=");
        sq.b(sb, num, ", clipId=", num2, ", question=");
        n6j.b(sb, str4, ", questionButton=", str5, ", placeId=");
        sb.append(num3);
        sb.append(", marketItem=");
        sb.append(marketMarketItemDto);
        sb.append(", audio=");
        sb.append(audioAudioDto);
        sb.append(", audioStartTime=");
        sb.append(num4);
        sb.append(", style=");
        sb.append(styleDto);
        sb.append(", subtype=");
        sb.append(subtypeDto);
        sb.append(", postOwnerId=");
        sb.append(userId2);
        sb.append(", postId=");
        sb.append(num5);
        sb.append(", poll=");
        sb.append(pollsPollDto);
        sb.append(", color=");
        sb.append(str6);
        sb.append(", stickerId=");
        sq.b(sb, num6, ", stickerPackId=", num7, ", app=");
        sb.append(appsAppMinDto);
        sb.append(", appContext=");
        sb.append(str7);
        sb.append(", hasNewInteractions=");
        tq.i(sb, bool, ", isBroadcastNotifyAllowed=", bool2, ", situationalThemeId=");
        sb.append(num8);
        sb.append(", situationalAppUrl=");
        sb.append(str8);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ StoriesClickableStickerDto(List list, int i, TypeDto typeDto, String str, BaseLinkDto baseLinkDto, String str2, String str3, UserId userId, Integer num, Integer num2, String str4, String str5, Integer num3, MarketMarketItemDto marketMarketItemDto, AudioAudioDto audioAudioDto, Integer num4, StyleDto styleDto, SubtypeDto subtypeDto, UserId userId2, Integer num5, PollsPollDto pollsPollDto, String str6, Integer num6, Integer num7, AppsAppMinDto appsAppMinDto, String str7, Boolean bool, Boolean bool2, Integer num8, String str8, int i2, zcl zclVar) {
        this(list, i, typeDto, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : baseLinkDto, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : userId, (i2 & 256) != 0 ? null : num, (i2 & 512) != 0 ? null : num2, (i2 & 1024) != 0 ? null : str4, (i2 & 2048) != 0 ? null : str5, (i2 & 4096) != 0 ? null : num3, (i2 & 8192) != 0 ? null : marketMarketItemDto, (i2 & 16384) != 0 ? null : audioAudioDto, (32768 & i2) != 0 ? null : num4, (65536 & i2) != 0 ? null : styleDto, (131072 & i2) != 0 ? null : subtypeDto, (262144 & i2) != 0 ? null : userId2, (524288 & i2) != 0 ? null : num5, (1048576 & i2) != 0 ? null : pollsPollDto, (2097152 & i2) != 0 ? null : str6, (4194304 & i2) != 0 ? null : num6, (8388608 & i2) != 0 ? null : num7, (16777216 & i2) != 0 ? null : appsAppMinDto, (33554432 & i2) != 0 ? null : str7, (67108864 & i2) != 0 ? null : bool, (134217728 & i2) != 0 ? null : bool2, (268435456 & i2) != 0 ? null : num8, (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str8);
    }
}
