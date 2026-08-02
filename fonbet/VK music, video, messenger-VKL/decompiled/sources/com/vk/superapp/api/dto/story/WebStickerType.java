package com.vk.superapp.api.dto.story;

import com.mbridge.msdk.MBridgeConstans;
import java.util.Iterator;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WebStickerType.kt */
/* loaded from: classes6.dex */
public final class WebStickerType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WebStickerType[] $VALUES;
    public static final WebStickerType APP;
    public static final WebStickerType AUDIO_TRACK;
    public static final WebStickerType CHANNEL_POST;
    public static final WebStickerType CLIP;
    public static final WebStickerType CLIP_STAT;
    public static final a Companion;
    public static final WebStickerType EMOJI;
    public static final WebStickerType GEO;
    public static final WebStickerType GIF;
    public static final WebStickerType HASHTAG;
    public static final WebStickerType LINK;
    public static final WebStickerType LOTTIE;
    public static final WebStickerType MARKET_ITEM;
    public static final WebStickerType MARKET_SERVICE_ITEM;
    public static final WebStickerType MENTION;
    public static final WebStickerType MUSIC;
    public static final WebStickerType MUSIC_PLAYLIST;
    public static final WebStickerType OWNER;
    public static final WebStickerType PHOTO;
    public static final WebStickerType PHOTO_ALBUM;
    public static final WebStickerType POLL;
    public static final WebStickerType POST;
    public static final WebStickerType QUESTION;
    public static final WebStickerType REACTION;
    public static final WebStickerType REPLY;
    public static final WebStickerType SERVICE_YC_ITEM;
    public static final WebStickerType SITUATIONAL_TEMPLATE;
    public static final WebStickerType SITUATIONAL_THEME;
    public static final WebStickerType STICKER;
    public static final WebStickerType TEXT;
    public static final WebStickerType TICKET;
    public static final WebStickerType TIME;
    public static final WebStickerType VK_VIDEO;
    private final boolean isClickable;
    private final String typeName;

    /* compiled from: WebStickerType.kt */
    public static final class a {
        public static WebStickerType a(String str) {
            Object obj;
            Iterator<E> it = WebStickerType.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((WebStickerType) obj).i(), str)) {
                    break;
                }
            }
            return (WebStickerType) obj;
        }
    }

    static {
        WebStickerType webStickerType = new WebStickerType("TEXT", 0, "text", false);
        TEXT = webStickerType;
        WebStickerType webStickerType2 = new WebStickerType("STICKER", 1, "sticker", false);
        STICKER = webStickerType2;
        WebStickerType webStickerType3 = new WebStickerType("EMOJI", 2, "emoji", false);
        EMOJI = webStickerType3;
        WebStickerType webStickerType4 = new WebStickerType("LOTTIE", 3, "lottie", false);
        LOTTIE = webStickerType4;
        WebStickerType webStickerType5 = new WebStickerType("PHOTO", 4, "photo", true);
        PHOTO = webStickerType5;
        WebStickerType webStickerType6 = new WebStickerType("HASHTAG", 5, "hashtag", true);
        HASHTAG = webStickerType6;
        WebStickerType webStickerType7 = new WebStickerType("MENTION", 6, "mention", true);
        MENTION = webStickerType7;
        WebStickerType webStickerType8 = new WebStickerType("QUESTION", 7, "question", true);
        QUESTION = webStickerType8;
        WebStickerType webStickerType9 = new WebStickerType("MUSIC", 8, "music", true);
        MUSIC = webStickerType9;
        WebStickerType webStickerType10 = new WebStickerType("REACTION", 9, "reaction", true);
        REACTION = webStickerType10;
        WebStickerType webStickerType11 = new WebStickerType("MUSIC_PLAYLIST", 10, "playlist", true);
        MUSIC_PLAYLIST = webStickerType11;
        WebStickerType webStickerType12 = new WebStickerType("GEO", 11, "place", true);
        GEO = webStickerType12;
        WebStickerType webStickerType13 = new WebStickerType("GIF", 12, "gif", false);
        GIF = webStickerType13;
        WebStickerType webStickerType14 = new WebStickerType("MARKET_ITEM", 13, "market_item", true);
        MARKET_ITEM = webStickerType14;
        WebStickerType webStickerType15 = new WebStickerType("MARKET_SERVICE_ITEM", 14, "market_service_item", true);
        MARKET_SERVICE_ITEM = webStickerType15;
        WebStickerType webStickerType16 = new WebStickerType("SERVICE_YC_ITEM", 15, "service_yc_item", true);
        SERVICE_YC_ITEM = webStickerType16;
        WebStickerType webStickerType17 = new WebStickerType("LINK", 16, "link", true);
        LINK = webStickerType17;
        WebStickerType webStickerType18 = new WebStickerType("TIME", 17, "time", true);
        TIME = webStickerType18;
        WebStickerType webStickerType19 = new WebStickerType("OWNER", 18, "owner", true);
        OWNER = webStickerType19;
        WebStickerType webStickerType20 = new WebStickerType("REPLY", 19, "story_reply", true);
        REPLY = webStickerType20;
        WebStickerType webStickerType21 = new WebStickerType("POST", 20, "post", true);
        POST = webStickerType21;
        WebStickerType webStickerType22 = new WebStickerType("CLIP_STAT", 21, "clip_stat", true);
        CLIP_STAT = webStickerType22;
        WebStickerType webStickerType23 = new WebStickerType("CLIP", 22, "clip", true);
        CLIP = webStickerType23;
        WebStickerType webStickerType24 = new WebStickerType("VK_VIDEO", 23, "vk_video", true);
        VK_VIDEO = webStickerType24;
        WebStickerType webStickerType25 = new WebStickerType("POLL", 24, "poll", true);
        POLL = webStickerType25;
        WebStickerType webStickerType26 = new WebStickerType("APP", 25, MBridgeConstans.DYNAMIC_VIEW_WX_APP, true);
        APP = webStickerType26;
        WebStickerType webStickerType27 = new WebStickerType("SITUATIONAL_THEME", 26, "situational_theme", true);
        SITUATIONAL_THEME = webStickerType27;
        WebStickerType webStickerType28 = new WebStickerType("SITUATIONAL_TEMPLATE", 27, "situational_template", true);
        SITUATIONAL_TEMPLATE = webStickerType28;
        WebStickerType webStickerType29 = new WebStickerType("AUDIO_TRACK", 28, "audio_track", true);
        AUDIO_TRACK = webStickerType29;
        WebStickerType webStickerType30 = new WebStickerType("PHOTO_ALBUM", 29, "album", true);
        PHOTO_ALBUM = webStickerType30;
        WebStickerType webStickerType31 = new WebStickerType("TICKET", 30, "ticket", true);
        TICKET = webStickerType31;
        WebStickerType webStickerType32 = new WebStickerType("CHANNEL_POST", 31, "channel_post", true);
        CHANNEL_POST = webStickerType32;
        WebStickerType[] webStickerTypeArr = {webStickerType, webStickerType2, webStickerType3, webStickerType4, webStickerType5, webStickerType6, webStickerType7, webStickerType8, webStickerType9, webStickerType10, webStickerType11, webStickerType12, webStickerType13, webStickerType14, webStickerType15, webStickerType16, webStickerType17, webStickerType18, webStickerType19, webStickerType20, webStickerType21, webStickerType22, webStickerType23, webStickerType24, webStickerType25, webStickerType26, webStickerType27, webStickerType28, webStickerType29, webStickerType30, webStickerType31, webStickerType32};
        $VALUES = webStickerTypeArr;
        $ENTRIES = new asp(webStickerTypeArr);
        Companion = new a();
    }

    public WebStickerType(String str, int i, String str2, boolean z) {
        this.typeName = str2;
        this.isClickable = z;
    }

    public static zrp<WebStickerType> h() {
        return $ENTRIES;
    }

    public static WebStickerType valueOf(String str) {
        return (WebStickerType) Enum.valueOf(WebStickerType.class, str);
    }

    public static WebStickerType[] values() {
        return (WebStickerType[]) $VALUES.clone();
    }

    public final String i() {
        return this.typeName;
    }

    public final boolean j() {
        return this.isClickable;
    }
}
