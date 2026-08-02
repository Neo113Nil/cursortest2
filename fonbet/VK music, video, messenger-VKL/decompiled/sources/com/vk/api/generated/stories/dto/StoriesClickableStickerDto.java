package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.apps.dto.AppsAppMinDto;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.api.generated.base.dto.BaseLinkDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.media.dto.MediaPopupDto;
import com.vk.api.generated.polls.dto.PollsPollDto;
import com.vk.api.generated.stickers.dto.StickersStickerVmojiDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: StoriesClickableStickerDto.kt */
/* loaded from: classes15.dex */
public final class StoriesClickableStickerDto implements Parcelable {
    public static final Parcelable.Creator<StoriesClickableStickerDto> CREATOR = new a();

    @pmi0("ads_label")
    private final String adsLabel;

    @pmi0("album_id")
    private final Integer albumId;

    @pmi0("album_owner_id")
    private final UserId albumOwnerId;

    /* renamed from: app, reason: collision with root package name */
    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    private final AppsAppMinDto f82app;

    @pmi0(X3.i.L0)
    private final String appContext;

    @pmi0("audio")
    private final AudioAudioDto audio;

    @pmi0("audio_restrictions")
    private final MediaPopupDto audioRestrictions;

    @pmi0("audio_start_time")
    private final Integer audioStartTime;

    @pmi0("channel_owner_id")
    private final UserId channelOwnerId;

    @pmi0("channel_post_id")
    private final Integer channelPostId;

    @pmi0("channel_post_owner_id")
    private final UserId channelPostOwnerId;

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

    @pmi0("photo_id")
    private final Integer photoId;

    @pmi0("photo_owner_id")
    private final UserId photoOwnerId;

    @pmi0("place_id")
    private final Integer placeId;

    @pmi0("playlist")
    private final AudioPlaylistDto playlist;

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

    @pmi0("question_default_private")
    private final Boolean questionDefaultPrivate;

    @pmi0("reaction_id")
    private final Integer reactionId;

    @pmi0("situational_app_url")
    private final String situationalAppUrl;

    @pmi0("situational_replied_users")
    private final StoriesSituationalRepliedUsersDto situationalRepliedUsers;

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

    @pmi0("video_id")
    private final Integer videoId;

    @pmi0("vmoji")
    private final StickersStickerVmojiDto vmoji;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoriesClickableStickerDto.kt */
    public static final class StyleDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;

        @pmi0("accent")
        public static final StyleDto ACCENT;

        @pmi0("accent_background")
        public static final StyleDto ACCENT_BACKGROUND;

        @pmi0("accent_text")
        public static final StyleDto ACCENT_TEXT;

        @pmi0("album")
        public static final StyleDto ALBUM;

        @pmi0("black")
        public static final StyleDto BLACK;

        @pmi0("blue")
        public static final StyleDto BLUE;

        @pmi0("blue_gradient")
        public static final StyleDto BLUE_GRADIENT;

        @pmi0("circle")
        public static final StyleDto CIRCLE;
        public static final Parcelable.Creator<StyleDto> CREATOR;

        @pmi0(X3.i.G0)
        public static final StyleDto CTA;

        @pmi0("dark")
        public static final StyleDto DARK;

        @pmi0("dark_text")
        public static final StyleDto DARK_TEXT;

        @pmi0("dark_unique")
        public static final StyleDto DARK_UNIQUE;

        @pmi0("dark_without_bg")
        public static final StyleDto DARK_WITHOUT_BG;

        @pmi0("equalizer")
        public static final StyleDto EQUALIZER;

        @pmi0("fullview")
        public static final StyleDto FULLVIEW;

        @pmi0("green")
        public static final StyleDto GREEN;

        @pmi0("header_meta")
        public static final StyleDto HEADER_META;

        @pmi0("heart")
        public static final StyleDto HEART;

        @pmi0("horizontal")
        public static final StyleDto HORIZONTAL;

        @pmi0("impressive")
        public static final StyleDto IMPRESSIVE;

        @pmi0("light")
        public static final StyleDto LIGHT;

        @pmi0("light_text")
        public static final StyleDto LIGHT_TEXT;

        @pmi0("light_unique")
        public static final StyleDto LIGHT_UNIQUE;

        @pmi0("light_without_bg")
        public static final StyleDto LIGHT_WITHOUT_BG;

        @pmi0("miniature")
        public static final StyleDto MINIATURE;

        @pmi0("poop")
        public static final StyleDto POOP;

        @pmi0("preview")
        public static final StyleDto PREVIEW;

        @pmi0("question_reply")
        public static final StyleDto QUESTION_REPLY;

        @pmi0("rectangle")
        public static final StyleDto RECTANGLE;

        @pmi0("red_gradient")
        public static final StyleDto RED_GRADIENT;

        @pmi0("star")
        public static final StyleDto STAR;

        @pmi0("sticker")
        public static final StyleDto STICKER;

        @pmi0("sticker_and_cta")
        public static final StyleDto STICKER_AND_CTA;

        @pmi0(X3.i.T)
        public static final StyleDto TRANSPARENT;

        @pmi0(TtmlNode.UNDERLINE)
        public static final StyleDto UNDERLINE;

        @pmi0("white")
        public static final StyleDto WHITE;
        private final String value;

        /* compiled from: StoriesClickableStickerDto.kt */
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
            StyleDto styleDto11 = new StyleDto("DARK", 10, "dark");
            DARK = styleDto11;
            StyleDto styleDto12 = new StyleDto("ACCENT_BACKGROUND", 11, "accent_background");
            ACCENT_BACKGROUND = styleDto12;
            StyleDto styleDto13 = new StyleDto("ACCENT_TEXT", 12, "accent_text");
            ACCENT_TEXT = styleDto13;
            StyleDto styleDto14 = new StyleDto("DARK_UNIQUE", 13, "dark_unique");
            DARK_UNIQUE = styleDto14;
            StyleDto styleDto15 = new StyleDto("LIGHT_UNIQUE", 14, "light_unique");
            LIGHT_UNIQUE = styleDto15;
            StyleDto styleDto16 = new StyleDto("LIGHT_TEXT", 15, "light_text");
            LIGHT_TEXT = styleDto16;
            StyleDto styleDto17 = new StyleDto("DARK_TEXT", 16, "dark_text");
            DARK_TEXT = styleDto17;
            StyleDto styleDto18 = new StyleDto("BLACK", 17, "black");
            BLACK = styleDto18;
            StyleDto styleDto19 = new StyleDto("DARK_WITHOUT_BG", 18, "dark_without_bg");
            DARK_WITHOUT_BG = styleDto19;
            StyleDto styleDto20 = new StyleDto("LIGHT_WITHOUT_BG", 19, "light_without_bg");
            LIGHT_WITHOUT_BG = styleDto20;
            StyleDto styleDto21 = new StyleDto("RECTANGLE", 20, "rectangle");
            RECTANGLE = styleDto21;
            StyleDto styleDto22 = new StyleDto("CIRCLE", 21, "circle");
            CIRCLE = styleDto22;
            StyleDto styleDto23 = new StyleDto("POOP", 22, "poop");
            POOP = styleDto23;
            StyleDto styleDto24 = new StyleDto("HEART", 23, "heart");
            HEART = styleDto24;
            StyleDto styleDto25 = new StyleDto("STAR", 24, "star");
            STAR = styleDto25;
            StyleDto styleDto26 = new StyleDto("ALBUM", 25, "album");
            ALBUM = styleDto26;
            StyleDto styleDto27 = new StyleDto("HORIZONTAL", 26, "horizontal");
            HORIZONTAL = styleDto27;
            StyleDto styleDto28 = new StyleDto("EQUALIZER", 27, "equalizer");
            EQUALIZER = styleDto28;
            StyleDto styleDto29 = new StyleDto("HEADER_META", 28, "header_meta");
            HEADER_META = styleDto29;
            StyleDto styleDto30 = new StyleDto("PREVIEW", 29, "preview");
            PREVIEW = styleDto30;
            StyleDto styleDto31 = new StyleDto("MINIATURE", 30, "miniature");
            MINIATURE = styleDto31;
            StyleDto styleDto32 = new StyleDto("FULLVIEW", 31, "fullview");
            FULLVIEW = styleDto32;
            StyleDto styleDto33 = new StyleDto(NativeAdContent.ViewTag.CTA, 32, X3.i.G0);
            CTA = styleDto33;
            StyleDto styleDto34 = new StyleDto("STICKER", 33, "sticker");
            STICKER = styleDto34;
            StyleDto styleDto35 = new StyleDto("STICKER_AND_CTA", 34, "sticker_and_cta");
            STICKER_AND_CTA = styleDto35;
            StyleDto styleDto36 = new StyleDto("ACCENT", 35, "accent");
            ACCENT = styleDto36;
            StyleDto[] styleDtoArr = {styleDto, styleDto2, styleDto3, styleDto4, styleDto5, styleDto6, styleDto7, styleDto8, styleDto9, styleDto10, styleDto11, styleDto12, styleDto13, styleDto14, styleDto15, styleDto16, styleDto17, styleDto18, styleDto19, styleDto20, styleDto21, styleDto22, styleDto23, styleDto24, styleDto25, styleDto26, styleDto27, styleDto28, styleDto29, styleDto30, styleDto31, styleDto32, styleDto33, styleDto34, styleDto35, styleDto36};
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
    /* compiled from: StoriesClickableStickerDto.kt */
    public static final class SubtypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SubtypeDto[] $VALUES;

        @pmi0("aliexpress_product")
        public static final SubtypeDto ALIEXPRESS_PRODUCT;
        public static final Parcelable.Creator<SubtypeDto> CREATOR;

        @pmi0("market_item")
        public static final SubtypeDto MARKET_ITEM;
        private final String value;

        /* compiled from: StoriesClickableStickerDto.kt */
        public static final class a implements Parcelable.Creator<SubtypeDto> {
            @Override // android.os.Parcelable.Creator
            public final SubtypeDto createFromParcel(Parcel parcel) {
                return SubtypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SubtypeDto[] newArray(int i) {
                return new SubtypeDto[i];
            }
        }

        static {
            SubtypeDto subtypeDto = new SubtypeDto("MARKET_ITEM", 0, "market_item");
            MARKET_ITEM = subtypeDto;
            SubtypeDto subtypeDto2 = new SubtypeDto("ALIEXPRESS_PRODUCT", 1, "aliexpress_product");
            ALIEXPRESS_PRODUCT = subtypeDto2;
            SubtypeDto[] subtypeDtoArr = {subtypeDto, subtypeDto2};
            $VALUES = subtypeDtoArr;
            $ENTRIES = new asp(subtypeDtoArr);
            CREATOR = new a();
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

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoriesClickableStickerDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("album")
        public static final TypeDto ALBUM;

        @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
        public static final TypeDto APP;

        @pmi0("channel_post")
        public static final TypeDto CHANNEL_POST;

        @pmi0("clip")
        public static final TypeDto CLIP;
        public static final Parcelable.Creator<TypeDto> CREATOR;

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

        @pmi0("photo")
        public static final TypeDto PHOTO;

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

        @pmi0("reaction")
        public static final TypeDto REACTION;

        @pmi0("service_yc_item")
        public static final TypeDto SERVICE_YC_ITEM;

        @pmi0("situational_template")
        public static final TypeDto SITUATIONAL_TEMPLATE;

        @pmi0("situational_theme")
        public static final TypeDto SITUATIONAL_THEME;

        @pmi0("spoiler")
        public static final TypeDto SPOILER;

        @pmi0("sticker")
        public static final TypeDto STICKER;

        @pmi0("story_reply")
        public static final TypeDto STORY_REPLY;

        @pmi0("ticket")
        public static final TypeDto TICKET;

        @pmi0("vk_video")
        public static final TypeDto VK_VIDEO;
        private final String value;

        /* compiled from: StoriesClickableStickerDto.kt */
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
            TypeDto typeDto13 = new TypeDto("ALBUM", 12, "album");
            ALBUM = typeDto13;
            TypeDto typeDto14 = new TypeDto("APP", 13, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
            APP = typeDto14;
            TypeDto typeDto15 = new TypeDto("SITUATIONAL_THEME", 14, "situational_theme");
            SITUATIONAL_THEME = typeDto15;
            TypeDto typeDto16 = new TypeDto("PLAYLIST", 15, "playlist");
            PLAYLIST = typeDto16;
            TypeDto typeDto17 = new TypeDto("CLIP", 16, "clip");
            CLIP = typeDto17;
            TypeDto typeDto18 = new TypeDto("VK_VIDEO", 17, "vk_video");
            VK_VIDEO = typeDto18;
            TypeDto typeDto19 = new TypeDto("PHOTO", 18, "photo");
            PHOTO = typeDto19;
            TypeDto typeDto20 = new TypeDto("SITUATIONAL_TEMPLATE", 19, "situational_template");
            SITUATIONAL_TEMPLATE = typeDto20;
            TypeDto typeDto21 = new TypeDto("SPOILER", 20, "spoiler");
            SPOILER = typeDto21;
            TypeDto typeDto22 = new TypeDto("SERVICE_YC_ITEM", 21, "service_yc_item");
            SERVICE_YC_ITEM = typeDto22;
            TypeDto typeDto23 = new TypeDto("CHANNEL_POST", 22, "channel_post");
            CHANNEL_POST = typeDto23;
            TypeDto typeDto24 = new TypeDto("TICKET", 23, "ticket");
            TICKET = typeDto24;
            TypeDto typeDto25 = new TypeDto("REACTION", 24, "reaction");
            REACTION = typeDto25;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6, typeDto7, typeDto8, typeDto9, typeDto10, typeDto11, typeDto12, typeDto13, typeDto14, typeDto15, typeDto16, typeDto17, typeDto18, typeDto19, typeDto20, typeDto21, typeDto22, typeDto23, typeDto24, typeDto25};
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

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: StoriesClickableStickerDto.kt */
    public static final class a implements Parcelable.Creator<StoriesClickableStickerDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesClickableStickerDto createFromParcel(Parcel parcel) {
            AudioAudioDto audioAudioDto;
            MediaPopupDto createFromParcel;
            MediaPopupDto mediaPopupDto;
            AudioPlaylistDto createFromParcel2;
            AudioPlaylistDto audioPlaylistDto;
            StoriesSituationalRepliedUsersDto createFromParcel3;
            StoriesSituationalRepliedUsersDto storiesSituationalRepliedUsersDto;
            StyleDto createFromParcel4;
            StyleDto styleDto;
            SubtypeDto createFromParcel5;
            Boolean valueOf;
            PollsPollDto pollsPollDto;
            StickersStickerVmojiDto createFromParcel6;
            Boolean valueOf2;
            Boolean valueOf3;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(StoriesClickableAreaDto.CREATOR, parcel, arrayList, i, 1);
            }
            int readInt2 = parcel.readInt();
            TypeDto createFromParcel7 = TypeDto.CREATOR.createFromParcel(parcel);
            UserId userId = (UserId) parcel.readParcelable(StoriesClickableStickerDto.class.getClassLoader());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            UserId userId2 = (UserId) parcel.readParcelable(StoriesClickableStickerDto.class.getClassLoader());
            UserId userId3 = (UserId) parcel.readParcelable(StoriesClickableStickerDto.class.getClassLoader());
            String readString = parcel.readString();
            BaseLinkDto baseLinkDto = (BaseLinkDto) parcel.readParcelable(StoriesClickableStickerDto.class.getClassLoader());
            String readString2 = parcel.readString();
            Integer num = valueOf4;
            Integer num2 = valueOf5;
            String readString3 = parcel.readString();
            UserId userId4 = (UserId) parcel.readParcelable(StoriesClickableStickerDto.class.getClassLoader());
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            UserId userId5 = (UserId) parcel.readParcelable(StoriesClickableStickerDto.class.getClassLoader());
            Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString4 = parcel.readString();
            Integer num3 = valueOf6;
            Integer num4 = valueOf8;
            Integer num5 = valueOf9;
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            Integer valueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            MarketMarketItemDto marketMarketItemDto = (MarketMarketItemDto) parcel.readParcelable(StoriesClickableStickerDto.class.getClassLoader());
            AudioAudioDto audioAudioDto2 = (AudioAudioDto) parcel.readParcelable(StoriesClickableStickerDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                audioAudioDto = audioAudioDto2;
                createFromParcel = null;
            } else {
                audioAudioDto = audioAudioDto2;
                createFromParcel = MediaPopupDto.CREATOR.createFromParcel(parcel);
            }
            MediaPopupDto mediaPopupDto2 = createFromParcel;
            Integer valueOf11 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                mediaPopupDto = mediaPopupDto2;
                createFromParcel2 = null;
            } else {
                mediaPopupDto = mediaPopupDto2;
                createFromParcel2 = AudioPlaylistDto.CREATOR.createFromParcel(parcel);
            }
            AudioPlaylistDto audioPlaylistDto2 = createFromParcel2;
            if (parcel.readInt() == 0) {
                audioPlaylistDto = audioPlaylistDto2;
                createFromParcel3 = null;
            } else {
                audioPlaylistDto = audioPlaylistDto2;
                createFromParcel3 = StoriesSituationalRepliedUsersDto.CREATOR.createFromParcel(parcel);
            }
            StoriesSituationalRepliedUsersDto storiesSituationalRepliedUsersDto2 = createFromParcel3;
            if (parcel.readInt() == 0) {
                storiesSituationalRepliedUsersDto = storiesSituationalRepliedUsersDto2;
                createFromParcel4 = null;
            } else {
                storiesSituationalRepliedUsersDto = storiesSituationalRepliedUsersDto2;
                createFromParcel4 = StyleDto.CREATOR.createFromParcel(parcel);
            }
            StyleDto styleDto2 = createFromParcel4;
            if (parcel.readInt() == 0) {
                styleDto = styleDto2;
                createFromParcel5 = null;
            } else {
                styleDto = styleDto2;
                createFromParcel5 = SubtypeDto.CREATOR.createFromParcel(parcel);
            }
            SubtypeDto subtypeDto = createFromParcel5;
            UserId userId6 = (UserId) parcel.readParcelable(StoriesClickableStickerDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf12 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            PollsPollDto pollsPollDto2 = (PollsPollDto) parcel.readParcelable(StoriesClickableStickerDto.class.getClassLoader());
            Integer num6 = valueOf10;
            AudioAudioDto audioAudioDto3 = audioAudioDto;
            AudioPlaylistDto audioPlaylistDto3 = audioPlaylistDto;
            Integer num7 = valueOf12;
            String readString7 = parcel.readString();
            Integer valueOf13 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf14 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                pollsPollDto = pollsPollDto2;
                createFromParcel6 = null;
            } else {
                pollsPollDto = pollsPollDto2;
                createFromParcel6 = StickersStickerVmojiDto.CREATOR.createFromParcel(parcel);
            }
            StickersStickerVmojiDto stickersStickerVmojiDto = createFromParcel6;
            AppsAppMinDto appsAppMinDto = (AppsAppMinDto) parcel.readParcelable(StoriesClickableStickerDto.class.getClassLoader());
            MediaPopupDto mediaPopupDto3 = mediaPopupDto;
            StyleDto styleDto3 = styleDto;
            Boolean bool = valueOf;
            PollsPollDto pollsPollDto3 = pollsPollDto;
            String readString8 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StoriesClickableStickerDto(arrayList, readInt2, createFromParcel7, userId, num, num2, userId2, userId3, readString, baseLinkDto, readString2, readString3, userId4, num3, valueOf7, num4, userId5, num5, readString4, readString5, readString6, num6, marketMarketItemDto, audioAudioDto3, mediaPopupDto3, valueOf11, audioPlaylistDto3, storiesSituationalRepliedUsersDto, styleDto3, subtypeDto, userId6, bool, num7, pollsPollDto3, readString7, valueOf13, valueOf14, stickersStickerVmojiDto, appsAppMinDto, readString8, valueOf2, valueOf3, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesClickableStickerDto[] newArray(int i) {
            return new StoriesClickableStickerDto[i];
        }
    }

    public StoriesClickableStickerDto(List<StoriesClickableAreaDto> list, int i, TypeDto typeDto, UserId userId, Integer num, Integer num2, UserId userId2, UserId userId3, String str, BaseLinkDto baseLinkDto, String str2, String str3, UserId userId4, Integer num3, Integer num4, Integer num5, UserId userId5, Integer num6, String str4, String str5, String str6, Integer num7, MarketMarketItemDto marketMarketItemDto, AudioAudioDto audioAudioDto, MediaPopupDto mediaPopupDto, Integer num8, AudioPlaylistDto audioPlaylistDto, StoriesSituationalRepliedUsersDto storiesSituationalRepliedUsersDto, StyleDto styleDto, SubtypeDto subtypeDto, UserId userId6, Boolean bool, Integer num9, PollsPollDto pollsPollDto, String str7, Integer num10, Integer num11, StickersStickerVmojiDto stickersStickerVmojiDto, AppsAppMinDto appsAppMinDto, String str8, Boolean bool2, Boolean bool3, Integer num12, String str9, Integer num13) {
        this.clickableArea = list;
        this.id = i;
        this.type = typeDto;
        this.albumOwnerId = userId;
        this.albumId = num;
        this.channelPostId = num2;
        this.channelPostOwnerId = userId2;
        this.channelOwnerId = userId3;
        this.hashtag = str;
        this.linkObject = baseLinkDto;
        this.mention = str2;
        this.tooltipText = str3;
        this.ownerId = userId4;
        this.storyId = num3;
        this.clipId = num4;
        this.videoId = num5;
        this.photoOwnerId = userId5;
        this.photoId = num6;
        this.question = str4;
        this.questionButton = str5;
        this.adsLabel = str6;
        this.placeId = num7;
        this.marketItem = marketMarketItemDto;
        this.audio = audioAudioDto;
        this.audioRestrictions = mediaPopupDto;
        this.audioStartTime = num8;
        this.playlist = audioPlaylistDto;
        this.situationalRepliedUsers = storiesSituationalRepliedUsersDto;
        this.style = styleDto;
        this.subtype = subtypeDto;
        this.postOwnerId = userId6;
        this.questionDefaultPrivate = bool;
        this.postId = num9;
        this.poll = pollsPollDto;
        this.color = str7;
        this.stickerId = num10;
        this.stickerPackId = num11;
        this.vmoji = stickersStickerVmojiDto;
        this.f82app = appsAppMinDto;
        this.appContext = str8;
        this.hasNewInteractions = bool2;
        this.isBroadcastNotifyAllowed = bool3;
        this.situationalThemeId = num12;
        this.situationalAppUrl = str9;
        this.reactionId = num13;
    }

    public final String B() {
        return this.color;
    }

    public final Boolean C() {
        return this.hasNewInteractions;
    }

    public final String D() {
        return this.hashtag;
    }

    public final String D0() {
        return this.situationalAppUrl;
    }

    public final BaseLinkDto F() {
        return this.linkObject;
    }

    public final StoriesSituationalRepliedUsersDto F0() {
        return this.situationalRepliedUsers;
    }

    public final MarketMarketItemDto G() {
        return this.marketItem;
    }

    public final Integer H0() {
        return this.situationalThemeId;
    }

    public final String K() {
        return this.mention;
    }

    public final Integer K0() {
        return this.stickerId;
    }

    public final Integer M() {
        return this.photoId;
    }

    public final Integer N0() {
        return this.stickerPackId;
    }

    public final Integer P0() {
        return this.storyId;
    }

    public final UserId R() {
        return this.photoOwnerId;
    }

    public final StyleDto S0() {
        return this.style;
    }

    public final Integer T() {
        return this.placeId;
    }

    public final String U0() {
        return this.tooltipText;
    }

    public final TypeDto V0() {
        return this.type;
    }

    public final AudioPlaylistDto W() {
        return this.playlist;
    }

    public final PollsPollDto Z() {
        return this.poll;
    }

    public final Integer a0() {
        return this.postId;
    }

    public final Integer b1() {
        return this.videoId;
    }

    public final String d() {
        return this.adsLabel;
    }

    public final StickersStickerVmojiDto d1() {
        return this.vmoji;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.albumId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesClickableStickerDto)) {
            return false;
        }
        StoriesClickableStickerDto storiesClickableStickerDto = (StoriesClickableStickerDto) obj;
        return epx.f(this.clickableArea, storiesClickableStickerDto.clickableArea) && this.id == storiesClickableStickerDto.id && this.type == storiesClickableStickerDto.type && epx.f(this.albumOwnerId, storiesClickableStickerDto.albumOwnerId) && epx.f(this.albumId, storiesClickableStickerDto.albumId) && epx.f(this.channelPostId, storiesClickableStickerDto.channelPostId) && epx.f(this.channelPostOwnerId, storiesClickableStickerDto.channelPostOwnerId) && epx.f(this.channelOwnerId, storiesClickableStickerDto.channelOwnerId) && epx.f(this.hashtag, storiesClickableStickerDto.hashtag) && epx.f(this.linkObject, storiesClickableStickerDto.linkObject) && epx.f(this.mention, storiesClickableStickerDto.mention) && epx.f(this.tooltipText, storiesClickableStickerDto.tooltipText) && epx.f(this.ownerId, storiesClickableStickerDto.ownerId) && epx.f(this.storyId, storiesClickableStickerDto.storyId) && epx.f(this.clipId, storiesClickableStickerDto.clipId) && epx.f(this.videoId, storiesClickableStickerDto.videoId) && epx.f(this.photoOwnerId, storiesClickableStickerDto.photoOwnerId) && epx.f(this.photoId, storiesClickableStickerDto.photoId) && epx.f(this.question, storiesClickableStickerDto.question) && epx.f(this.questionButton, storiesClickableStickerDto.questionButton) && epx.f(this.adsLabel, storiesClickableStickerDto.adsLabel) && epx.f(this.placeId, storiesClickableStickerDto.placeId) && epx.f(this.marketItem, storiesClickableStickerDto.marketItem) && epx.f(this.audio, storiesClickableStickerDto.audio) && epx.f(this.audioRestrictions, storiesClickableStickerDto.audioRestrictions) && epx.f(this.audioStartTime, storiesClickableStickerDto.audioStartTime) && epx.f(this.playlist, storiesClickableStickerDto.playlist) && epx.f(this.situationalRepliedUsers, storiesClickableStickerDto.situationalRepliedUsers) && this.style == storiesClickableStickerDto.style && this.subtype == storiesClickableStickerDto.subtype && epx.f(this.postOwnerId, storiesClickableStickerDto.postOwnerId) && epx.f(this.questionDefaultPrivate, storiesClickableStickerDto.questionDefaultPrivate) && epx.f(this.postId, storiesClickableStickerDto.postId) && epx.f(this.poll, storiesClickableStickerDto.poll) && epx.f(this.color, storiesClickableStickerDto.color) && epx.f(this.stickerId, storiesClickableStickerDto.stickerId) && epx.f(this.stickerPackId, storiesClickableStickerDto.stickerPackId) && epx.f(this.vmoji, storiesClickableStickerDto.vmoji) && epx.f(this.f82app, storiesClickableStickerDto.f82app) && epx.f(this.appContext, storiesClickableStickerDto.appContext) && epx.f(this.hasNewInteractions, storiesClickableStickerDto.hasNewInteractions) && epx.f(this.isBroadcastNotifyAllowed, storiesClickableStickerDto.isBroadcastNotifyAllowed) && epx.f(this.situationalThemeId, storiesClickableStickerDto.situationalThemeId) && epx.f(this.situationalAppUrl, storiesClickableStickerDto.situationalAppUrl) && epx.f(this.reactionId, storiesClickableStickerDto.reactionId);
    }

    public final UserId f() {
        return this.albumOwnerId;
    }

    public final AppsAppMinDto g() {
        return this.f82app;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + shy.a(this.id, this.clickableArea.hashCode() * 31, 31)) * 31;
        UserId userId = this.albumOwnerId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Integer num = this.albumId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.channelPostId;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        UserId userId2 = this.channelPostOwnerId;
        int hashCode5 = (hashCode4 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        UserId userId3 = this.channelOwnerId;
        int hashCode6 = (hashCode5 + (userId3 == null ? 0 : Long.hashCode(userId3.b))) * 31;
        String str = this.hashtag;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        BaseLinkDto baseLinkDto = this.linkObject;
        int hashCode8 = (hashCode7 + (baseLinkDto == null ? 0 : baseLinkDto.hashCode())) * 31;
        String str2 = this.mention;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tooltipText;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UserId userId4 = this.ownerId;
        int hashCode11 = (hashCode10 + (userId4 == null ? 0 : Long.hashCode(userId4.b))) * 31;
        Integer num3 = this.storyId;
        int hashCode12 = (hashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.clipId;
        int hashCode13 = (hashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.videoId;
        int hashCode14 = (hashCode13 + (num5 == null ? 0 : num5.hashCode())) * 31;
        UserId userId5 = this.photoOwnerId;
        int hashCode15 = (hashCode14 + (userId5 == null ? 0 : Long.hashCode(userId5.b))) * 31;
        Integer num6 = this.photoId;
        int hashCode16 = (hashCode15 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str4 = this.question;
        int hashCode17 = (hashCode16 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.questionButton;
        int hashCode18 = (hashCode17 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.adsLabel;
        int hashCode19 = (hashCode18 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num7 = this.placeId;
        int hashCode20 = (hashCode19 + (num7 == null ? 0 : num7.hashCode())) * 31;
        MarketMarketItemDto marketMarketItemDto = this.marketItem;
        int hashCode21 = (hashCode20 + (marketMarketItemDto == null ? 0 : marketMarketItemDto.hashCode())) * 31;
        AudioAudioDto audioAudioDto = this.audio;
        int hashCode22 = (hashCode21 + (audioAudioDto == null ? 0 : audioAudioDto.hashCode())) * 31;
        MediaPopupDto mediaPopupDto = this.audioRestrictions;
        int hashCode23 = (hashCode22 + (mediaPopupDto == null ? 0 : mediaPopupDto.hashCode())) * 31;
        Integer num8 = this.audioStartTime;
        int hashCode24 = (hashCode23 + (num8 == null ? 0 : num8.hashCode())) * 31;
        AudioPlaylistDto audioPlaylistDto = this.playlist;
        int hashCode25 = (hashCode24 + (audioPlaylistDto == null ? 0 : audioPlaylistDto.hashCode())) * 31;
        StoriesSituationalRepliedUsersDto storiesSituationalRepliedUsersDto = this.situationalRepliedUsers;
        int hashCode26 = (hashCode25 + (storiesSituationalRepliedUsersDto == null ? 0 : storiesSituationalRepliedUsersDto.hashCode())) * 31;
        StyleDto styleDto = this.style;
        int hashCode27 = (hashCode26 + (styleDto == null ? 0 : styleDto.hashCode())) * 31;
        SubtypeDto subtypeDto = this.subtype;
        int hashCode28 = (hashCode27 + (subtypeDto == null ? 0 : subtypeDto.hashCode())) * 31;
        UserId userId6 = this.postOwnerId;
        int hashCode29 = (hashCode28 + (userId6 == null ? 0 : Long.hashCode(userId6.b))) * 31;
        Boolean bool = this.questionDefaultPrivate;
        int hashCode30 = (hashCode29 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num9 = this.postId;
        int hashCode31 = (hashCode30 + (num9 == null ? 0 : num9.hashCode())) * 31;
        PollsPollDto pollsPollDto = this.poll;
        int hashCode32 = (hashCode31 + (pollsPollDto == null ? 0 : pollsPollDto.hashCode())) * 31;
        String str7 = this.color;
        int hashCode33 = (hashCode32 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num10 = this.stickerId;
        int hashCode34 = (hashCode33 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.stickerPackId;
        int hashCode35 = (hashCode34 + (num11 == null ? 0 : num11.hashCode())) * 31;
        StickersStickerVmojiDto stickersStickerVmojiDto = this.vmoji;
        int hashCode36 = (hashCode35 + (stickersStickerVmojiDto == null ? 0 : stickersStickerVmojiDto.hashCode())) * 31;
        AppsAppMinDto appsAppMinDto = this.f82app;
        int hashCode37 = (hashCode36 + (appsAppMinDto == null ? 0 : appsAppMinDto.hashCode())) * 31;
        String str8 = this.appContext;
        int hashCode38 = (hashCode37 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool2 = this.hasNewInteractions;
        int hashCode39 = (hashCode38 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isBroadcastNotifyAllowed;
        int hashCode40 = (hashCode39 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num12 = this.situationalThemeId;
        int hashCode41 = (hashCode40 + (num12 == null ? 0 : num12.hashCode())) * 31;
        String str9 = this.situationalAppUrl;
        int hashCode42 = (hashCode41 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num13 = this.reactionId;
        return hashCode42 + (num13 != null ? num13.hashCode() : 0);
    }

    public final AudioAudioDto i() {
        return this.audio;
    }

    public final MediaPopupDto j() {
        return this.audioRestrictions;
    }

    public final Integer k() {
        return this.audioStartTime;
    }

    public final UserId l() {
        return this.channelOwnerId;
    }

    public final UserId l0() {
        return this.postOwnerId;
    }

    public final Integer n() {
        return this.channelPostId;
    }

    public final UserId o() {
        return this.channelPostOwnerId;
    }

    public final List<StoriesClickableAreaDto> p() {
        return this.clickableArea;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesClickableStickerDto(clickableArea=");
        sb.append(this.clickableArea);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", albumOwnerId=");
        sb.append(this.albumOwnerId);
        sb.append(", albumId=");
        sb.append(this.albumId);
        sb.append(", channelPostId=");
        sb.append(this.channelPostId);
        sb.append(", channelPostOwnerId=");
        sb.append(this.channelPostOwnerId);
        sb.append(", channelOwnerId=");
        sb.append(this.channelOwnerId);
        sb.append(", hashtag=");
        sb.append(this.hashtag);
        sb.append(", linkObject=");
        sb.append(this.linkObject);
        sb.append(", mention=");
        sb.append(this.mention);
        sb.append(", tooltipText=");
        sb.append(this.tooltipText);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", storyId=");
        sb.append(this.storyId);
        sb.append(", clipId=");
        sb.append(this.clipId);
        sb.append(", videoId=");
        sb.append(this.videoId);
        sb.append(", photoOwnerId=");
        sb.append(this.photoOwnerId);
        sb.append(", photoId=");
        sb.append(this.photoId);
        sb.append(", question=");
        sb.append(this.question);
        sb.append(", questionButton=");
        sb.append(this.questionButton);
        sb.append(", adsLabel=");
        sb.append(this.adsLabel);
        sb.append(", placeId=");
        sb.append(this.placeId);
        sb.append(", marketItem=");
        sb.append(this.marketItem);
        sb.append(", audio=");
        sb.append(this.audio);
        sb.append(", audioRestrictions=");
        sb.append(this.audioRestrictions);
        sb.append(", audioStartTime=");
        sb.append(this.audioStartTime);
        sb.append(", playlist=");
        sb.append(this.playlist);
        sb.append(", situationalRepliedUsers=");
        sb.append(this.situationalRepliedUsers);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", subtype=");
        sb.append(this.subtype);
        sb.append(", postOwnerId=");
        sb.append(this.postOwnerId);
        sb.append(", questionDefaultPrivate=");
        sb.append(this.questionDefaultPrivate);
        sb.append(", postId=");
        sb.append(this.postId);
        sb.append(", poll=");
        sb.append(this.poll);
        sb.append(", color=");
        sb.append(this.color);
        sb.append(", stickerId=");
        sb.append(this.stickerId);
        sb.append(", stickerPackId=");
        sb.append(this.stickerPackId);
        sb.append(", vmoji=");
        sb.append(this.vmoji);
        sb.append(", app=");
        sb.append(this.f82app);
        sb.append(", appContext=");
        sb.append(this.appContext);
        sb.append(", hasNewInteractions=");
        sb.append(this.hasNewInteractions);
        sb.append(", isBroadcastNotifyAllowed=");
        sb.append(this.isBroadcastNotifyAllowed);
        sb.append(", situationalThemeId=");
        sb.append(this.situationalThemeId);
        sb.append(", situationalAppUrl=");
        sb.append(this.situationalAppUrl);
        sb.append(", reactionId=");
        return uqi.b(sb, this.reactionId, ')');
    }

    public final Integer u() {
        return this.clipId;
    }

    public final String v0() {
        return this.question;
    }

    public final String w0() {
        return this.questionButton;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.clickableArea);
        while (a2.hasNext()) {
            ((StoriesClickableAreaDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.id);
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.albumOwnerId, i);
        Integer num = this.albumId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.channelPostId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeParcelable(this.channelPostOwnerId, i);
        parcel.writeParcelable(this.channelOwnerId, i);
        parcel.writeString(this.hashtag);
        parcel.writeParcelable(this.linkObject, i);
        parcel.writeString(this.mention);
        parcel.writeString(this.tooltipText);
        parcel.writeParcelable(this.ownerId, i);
        Integer num3 = this.storyId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.clipId;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Integer num5 = this.videoId;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        parcel.writeParcelable(this.photoOwnerId, i);
        Integer num6 = this.photoId;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        parcel.writeString(this.question);
        parcel.writeString(this.questionButton);
        parcel.writeString(this.adsLabel);
        Integer num7 = this.placeId;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num7);
        }
        parcel.writeParcelable(this.marketItem, i);
        parcel.writeParcelable(this.audio, i);
        MediaPopupDto mediaPopupDto = this.audioRestrictions;
        if (mediaPopupDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mediaPopupDto.writeToParcel(parcel, i);
        }
        Integer num8 = this.audioStartTime;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num8);
        }
        AudioPlaylistDto audioPlaylistDto = this.playlist;
        if (audioPlaylistDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioPlaylistDto.writeToParcel(parcel, i);
        }
        StoriesSituationalRepliedUsersDto storiesSituationalRepliedUsersDto = this.situationalRepliedUsers;
        if (storiesSituationalRepliedUsersDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storiesSituationalRepliedUsersDto.writeToParcel(parcel, i);
        }
        StyleDto styleDto = this.style;
        if (styleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            styleDto.writeToParcel(parcel, i);
        }
        SubtypeDto subtypeDto = this.subtype;
        if (subtypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            subtypeDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.postOwnerId, i);
        Boolean bool = this.questionDefaultPrivate;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num9 = this.postId;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num9);
        }
        parcel.writeParcelable(this.poll, i);
        parcel.writeString(this.color);
        Integer num10 = this.stickerId;
        if (num10 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num10);
        }
        Integer num11 = this.stickerPackId;
        if (num11 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num11);
        }
        StickersStickerVmojiDto stickersStickerVmojiDto = this.vmoji;
        if (stickersStickerVmojiDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersStickerVmojiDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.f82app, i);
        parcel.writeString(this.appContext);
        Boolean bool2 = this.hasNewInteractions;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isBroadcastNotifyAllowed;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Integer num12 = this.situationalThemeId;
        if (num12 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num12);
        }
        parcel.writeString(this.situationalAppUrl);
        Integer num13 = this.reactionId;
        if (num13 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num13);
        }
    }

    public final Integer y0() {
        return this.reactionId;
    }

    public /* synthetic */ StoriesClickableStickerDto(List list, int i, TypeDto typeDto, UserId userId, Integer num, Integer num2, UserId userId2, UserId userId3, String str, BaseLinkDto baseLinkDto, String str2, String str3, UserId userId4, Integer num3, Integer num4, Integer num5, UserId userId5, Integer num6, String str4, String str5, String str6, Integer num7, MarketMarketItemDto marketMarketItemDto, AudioAudioDto audioAudioDto, MediaPopupDto mediaPopupDto, Integer num8, AudioPlaylistDto audioPlaylistDto, StoriesSituationalRepliedUsersDto storiesSituationalRepliedUsersDto, StyleDto styleDto, SubtypeDto subtypeDto, UserId userId6, Boolean bool, Integer num9, PollsPollDto pollsPollDto, String str7, Integer num10, Integer num11, StickersStickerVmojiDto stickersStickerVmojiDto, AppsAppMinDto appsAppMinDto, String str8, Boolean bool2, Boolean bool3, Integer num12, String str9, Integer num13, int i2, int i3, zcl zclVar) {
        this(list, i, typeDto, (i2 & 8) != 0 ? null : userId, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : num2, (i2 & 64) != 0 ? null : userId2, (i2 & 128) != 0 ? null : userId3, (i2 & 256) != 0 ? null : str, (i2 & 512) != 0 ? null : baseLinkDto, (i2 & 1024) != 0 ? null : str2, (i2 & 2048) != 0 ? null : str3, (i2 & 4096) != 0 ? null : userId4, (i2 & 8192) != 0 ? null : num3, (i2 & 16384) != 0 ? null : num4, (32768 & i2) != 0 ? null : num5, (65536 & i2) != 0 ? null : userId5, (131072 & i2) != 0 ? null : num6, (262144 & i2) != 0 ? null : str4, (524288 & i2) != 0 ? null : str5, (1048576 & i2) != 0 ? null : str6, (2097152 & i2) != 0 ? null : num7, (4194304 & i2) != 0 ? null : marketMarketItemDto, (8388608 & i2) != 0 ? null : audioAudioDto, (16777216 & i2) != 0 ? null : mediaPopupDto, (33554432 & i2) != 0 ? null : num8, (67108864 & i2) != 0 ? null : audioPlaylistDto, (134217728 & i2) != 0 ? null : storiesSituationalRepliedUsersDto, (268435456 & i2) != 0 ? null : styleDto, (536870912 & i2) != 0 ? null : subtypeDto, (1073741824 & i2) != 0 ? null : userId6, (i2 & Integer.MIN_VALUE) != 0 ? null : bool, (i3 & 1) != 0 ? null : num9, (i3 & 2) != 0 ? null : pollsPollDto, (i3 & 4) != 0 ? null : str7, (i3 & 8) != 0 ? null : num10, (i3 & 16) != 0 ? null : num11, (i3 & 32) != 0 ? null : stickersStickerVmojiDto, (i3 & 64) != 0 ? null : appsAppMinDto, (i3 & 128) != 0 ? null : str8, (i3 & 256) != 0 ? null : bool2, (i3 & 512) != 0 ? null : bool3, (i3 & 1024) != 0 ? null : num12, (i3 & 2048) != 0 ? null : str9, (i3 & 4096) != 0 ? null : num13);
    }
}
