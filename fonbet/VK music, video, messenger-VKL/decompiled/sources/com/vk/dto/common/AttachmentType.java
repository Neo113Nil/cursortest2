package com.vk.dto.common;

import androidx.core.app.NotificationCompat;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.MBridgeConstans;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AttachmentType.kt */
/* loaded from: classes18.dex */
public final class AttachmentType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AttachmentType[] $VALUES;
    public static final AttachmentType ACTION_BUTTON;
    public static final AttachmentType ALBUM;
    public static final AttachmentType APP;
    public static final AttachmentType ARTICLE;
    public static final AttachmentType ARTIST;
    public static final AttachmentType AUDIO;
    public static final AttachmentType BOOKING;
    public static final AttachmentType CHANNEL_MESSAGE;
    public static final AttachmentType CHRONICLE;
    public static final AttachmentType CLIP;
    public static final AttachmentType CURATOR;
    public static final a Companion;
    public static final AttachmentType DOCUMENT;
    public static final AttachmentType DONUT_LINK;
    public static final AttachmentType EVENT;
    public static final AttachmentType GEO;
    public static final AttachmentType GRAFFITI;
    public static final AttachmentType LINK;
    public static final AttachmentType MARKET;
    public static final AttachmentType MARKET_ALBUM;
    public static final AttachmentType MARKET_LINK;
    public static final AttachmentType MESSAGE_TO_BC;
    public static final AttachmentType MINI_APP;
    public static final AttachmentType NARRATIVE;
    public static final AttachmentType NOTE;
    public static final AttachmentType PAGE;
    public static final AttachmentType PHOTO;
    public static final AttachmentType PLAYLIST;
    public static final AttachmentType PODCAST;
    public static final AttachmentType POLL;
    public static final AttachmentType POSTED_PHOTO;
    public static final AttachmentType PRETTY_CARDS;
    public static final AttachmentType PROFILE;
    public static final AttachmentType SITUATIONAL_THEME;
    public static final AttachmentType STEREO_ROOM;
    public static final AttachmentType STICKER;
    public static final AttachmentType STORY;
    public static final AttachmentType TEXT_LIVE_ANNOUNCEMENT;
    public static final AttachmentType TEXT_LIVE_POST;
    public static final AttachmentType TEXT_LIVE_POST_PUBLISH;
    public static final AttachmentType UNKNOWN;
    public static final AttachmentType VIDEO;
    public static final AttachmentType WALL;
    private final int id;
    private final String title;

    /* compiled from: AttachmentType.kt */
    public static final class a {
    }

    static {
        AttachmentType attachmentType = new AttachmentType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0, "");
        UNKNOWN = attachmentType;
        AttachmentType attachmentType2 = new AttachmentType("ALBUM", 1, 1, "album");
        ALBUM = attachmentType2;
        AttachmentType attachmentType3 = new AttachmentType("APP", 2, 2, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        APP = attachmentType3;
        AttachmentType attachmentType4 = new AttachmentType("ARTICLE", 3, 3, "article");
        ARTICLE = attachmentType4;
        AttachmentType attachmentType5 = new AttachmentType("ARTIST", 4, 4, "artist");
        ARTIST = attachmentType5;
        AttachmentType attachmentType6 = new AttachmentType("CURATOR", 5, 34, "curator");
        CURATOR = attachmentType6;
        AttachmentType attachmentType7 = new AttachmentType(SignalingProtocol.MEDIA_OPTION_AUDIO, 6, 5, "audio");
        AUDIO = attachmentType7;
        AttachmentType attachmentType8 = new AttachmentType("CHRONICLE", 7, 6, "chronicle");
        CHRONICLE = attachmentType8;
        AttachmentType attachmentType9 = new AttachmentType("CLIP", 8, 7, "clip");
        CLIP = attachmentType9;
        AttachmentType attachmentType10 = new AttachmentType("DOCUMENT", 9, 8, "doc");
        DOCUMENT = attachmentType10;
        AttachmentType attachmentType11 = new AttachmentType("DONUT_LINK", 10, 35, "donut_link");
        DONUT_LINK = attachmentType11;
        AttachmentType attachmentType12 = new AttachmentType("EVENT", 11, 9, NotificationCompat.CATEGORY_EVENT);
        EVENT = attachmentType12;
        AttachmentType attachmentType13 = new AttachmentType("GRAFFITI", 12, 10, "graffiti");
        GRAFFITI = attachmentType13;
        AttachmentType attachmentType14 = new AttachmentType("LINK", 13, 11, "link");
        LINK = attachmentType14;
        AttachmentType attachmentType15 = new AttachmentType("MARKET", 14, 12, "market");
        MARKET = attachmentType15;
        AttachmentType attachmentType16 = new AttachmentType("MARKET_ALBUM", 15, 13, "market_album");
        MARKET_ALBUM = attachmentType16;
        AttachmentType attachmentType17 = new AttachmentType("MINI_APP", 16, 14, "mini_app");
        MINI_APP = attachmentType17;
        AttachmentType attachmentType18 = new AttachmentType("NARRATIVE", 17, 15, "narrative");
        NARRATIVE = attachmentType18;
        AttachmentType attachmentType19 = new AttachmentType("NOTE", 18, 16, "note");
        NOTE = attachmentType19;
        AttachmentType attachmentType20 = new AttachmentType("PAGE", 19, 17, "page");
        PAGE = attachmentType20;
        AttachmentType attachmentType21 = new AttachmentType("PHOTO", 20, 18, "photo");
        PHOTO = attachmentType21;
        AttachmentType attachmentType22 = new AttachmentType("PLAYLIST", 21, 19, "audio_playlist");
        PLAYLIST = attachmentType22;
        AttachmentType attachmentType23 = new AttachmentType("PODCAST", 22, 20, "podcast");
        PODCAST = attachmentType23;
        AttachmentType attachmentType24 = new AttachmentType("POLL", 23, 21, "poll");
        POLL = attachmentType24;
        AttachmentType attachmentType25 = new AttachmentType("POSTED_PHOTO", 24, 22, "posted_photo");
        POSTED_PHOTO = attachmentType25;
        AttachmentType attachmentType26 = new AttachmentType("PRETTY_CARDS", 25, 23, "pretty_cards");
        PRETTY_CARDS = attachmentType26;
        AttachmentType attachmentType27 = new AttachmentType("PROFILE", 26, 24, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        PROFILE = attachmentType27;
        AttachmentType attachmentType28 = new AttachmentType("STICKER", 27, 25, "sticker");
        STICKER = attachmentType28;
        AttachmentType attachmentType29 = new AttachmentType("STORY", 28, 26, "story");
        STORY = attachmentType29;
        AttachmentType attachmentType30 = new AttachmentType("TEXT_LIVE_ANNOUNCEMENT", 29, 27, "textlive");
        TEXT_LIVE_ANNOUNCEMENT = attachmentType30;
        AttachmentType attachmentType31 = new AttachmentType("TEXT_LIVE_POST", 30, 28, "textpost");
        TEXT_LIVE_POST = attachmentType31;
        AttachmentType attachmentType32 = new AttachmentType("TEXT_LIVE_POST_PUBLISH", 31, 29, "textpost_publish");
        TEXT_LIVE_POST_PUBLISH = attachmentType32;
        AttachmentType attachmentType33 = new AttachmentType(SignalingProtocol.MEDIA_OPTION_VIDEO, 32, 30, "video");
        VIDEO = attachmentType33;
        AttachmentType attachmentType34 = new AttachmentType("WALL", 33, 31, "wall");
        WALL = attachmentType34;
        AttachmentType attachmentType35 = new AttachmentType("SITUATIONAL_THEME", 34, 36, "situational_theme");
        SITUATIONAL_THEME = attachmentType35;
        AttachmentType attachmentType36 = new AttachmentType("GEO", 35, 38, "geo");
        GEO = attachmentType36;
        AttachmentType attachmentType37 = new AttachmentType("STEREO_ROOM", 36, 44, SignalingProtocol.KEY_ROOM);
        STEREO_ROOM = attachmentType37;
        AttachmentType attachmentType38 = new AttachmentType("BOOKING", 37, 45, "online_booking");
        BOOKING = attachmentType38;
        AttachmentType attachmentType39 = new AttachmentType("MARKET_LINK", 38, 46, "market_link");
        MARKET_LINK = attachmentType39;
        AttachmentType attachmentType40 = new AttachmentType("MESSAGE_TO_BC", 39, 47, "message_to_bc");
        MESSAGE_TO_BC = attachmentType40;
        AttachmentType attachmentType41 = new AttachmentType("ACTION_BUTTON", 40, 48, "action_button");
        ACTION_BUTTON = attachmentType41;
        AttachmentType attachmentType42 = new AttachmentType("CHANNEL_MESSAGE", 41, 49, "channel_message");
        CHANNEL_MESSAGE = attachmentType42;
        AttachmentType[] attachmentTypeArr = {attachmentType, attachmentType2, attachmentType3, attachmentType4, attachmentType5, attachmentType6, attachmentType7, attachmentType8, attachmentType9, attachmentType10, attachmentType11, attachmentType12, attachmentType13, attachmentType14, attachmentType15, attachmentType16, attachmentType17, attachmentType18, attachmentType19, attachmentType20, attachmentType21, attachmentType22, attachmentType23, attachmentType24, attachmentType25, attachmentType26, attachmentType27, attachmentType28, attachmentType29, attachmentType30, attachmentType31, attachmentType32, attachmentType33, attachmentType34, attachmentType35, attachmentType36, attachmentType37, attachmentType38, attachmentType39, attachmentType40, attachmentType41, attachmentType42};
        $VALUES = attachmentTypeArr;
        $ENTRIES = new asp(attachmentTypeArr);
        Companion = new a();
    }

    public AttachmentType(String str, int i, int i2, String str2) {
        this.id = i2;
        this.title = str2;
    }

    public static zrp<AttachmentType> h() {
        return $ENTRIES;
    }

    public static AttachmentType valueOf(String str) {
        return (AttachmentType) Enum.valueOf(AttachmentType.class, str);
    }

    public static AttachmentType[] values() {
        return (AttachmentType[]) $VALUES.clone();
    }
}
