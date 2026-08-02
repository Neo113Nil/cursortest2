package com.vk.sdk.api.wall.dto;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WallWallpostAttachmentTypeDto.kt */
/* loaded from: classes5.dex */
public final class WallWallpostAttachmentTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallWallpostAttachmentTypeDto[] $VALUES;

    @pmi0("album")
    public static final WallWallpostAttachmentTypeDto ALBUM;

    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    public static final WallWallpostAttachmentTypeDto APP;

    @pmi0("article")
    public static final WallWallpostAttachmentTypeDto ARTICLE;

    @pmi0("artist")
    public static final WallWallpostAttachmentTypeDto ARTIST;

    @pmi0("audio")
    public static final WallWallpostAttachmentTypeDto AUDIO;

    @pmi0("audio_playlist")
    public static final WallWallpostAttachmentTypeDto AUDIO_PLAYLIST;

    @pmi0("curator")
    public static final WallWallpostAttachmentTypeDto CURATOR;

    @pmi0("doc")
    public static final WallWallpostAttachmentTypeDto DOC;

    @pmi0("donut_link")
    public static final WallWallpostAttachmentTypeDto DONUT_LINK;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    public static final WallWallpostAttachmentTypeDto EVENT;

    @pmi0("geo")
    public static final WallWallpostAttachmentTypeDto GEO;

    @pmi0("graffiti")
    public static final WallWallpostAttachmentTypeDto GRAFFITI;

    @pmi0("group")
    public static final WallWallpostAttachmentTypeDto GROUP;

    @pmi0("link")
    public static final WallWallpostAttachmentTypeDto LINK;

    @pmi0("market")
    public static final WallWallpostAttachmentTypeDto MARKET;

    @pmi0("market_album")
    public static final WallWallpostAttachmentTypeDto MARKET_ALBUM;

    @pmi0("mini_app")
    public static final WallWallpostAttachmentTypeDto MINI_APP;

    @pmi0("narrative")
    public static final WallWallpostAttachmentTypeDto NARRATIVE;

    @pmi0("note")
    public static final WallWallpostAttachmentTypeDto NOTE;

    @pmi0("page")
    public static final WallWallpostAttachmentTypeDto PAGE;

    @pmi0("photo")
    public static final WallWallpostAttachmentTypeDto PHOTO;

    @pmi0("photos_list")
    public static final WallWallpostAttachmentTypeDto PHOTOS_LIST;

    @pmi0("podcast")
    public static final WallWallpostAttachmentTypeDto PODCAST;

    @pmi0("poll")
    public static final WallWallpostAttachmentTypeDto POLL;

    @pmi0("posted_photo")
    public static final WallWallpostAttachmentTypeDto POSTED_PHOTO;

    @pmi0("pretty_cards")
    public static final WallWallpostAttachmentTypeDto PRETTY_CARDS;

    @pmi0("situational_theme")
    public static final WallWallpostAttachmentTypeDto SITUATIONAL_THEME;

    @pmi0("sticker")
    public static final WallWallpostAttachmentTypeDto STICKER;

    @pmi0("textlive")
    public static final WallWallpostAttachmentTypeDto TEXTLIVE;

    @pmi0("textpost")
    public static final WallWallpostAttachmentTypeDto TEXTPOST;

    @pmi0("textpost_publish")
    public static final WallWallpostAttachmentTypeDto TEXTPOST_PUBLISH;

    @pmi0("video")
    public static final WallWallpostAttachmentTypeDto VIDEO;

    @pmi0("video_playlist")
    public static final WallWallpostAttachmentTypeDto VIDEO_PLAYLIST;
    private final String value;

    static {
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto = new WallWallpostAttachmentTypeDto("PHOTO", 0, "photo");
        PHOTO = wallWallpostAttachmentTypeDto;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto2 = new WallWallpostAttachmentTypeDto("PHOTOS_LIST", 1, "photos_list");
        PHOTOS_LIST = wallWallpostAttachmentTypeDto2;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto3 = new WallWallpostAttachmentTypeDto("POSTED_PHOTO", 2, "posted_photo");
        POSTED_PHOTO = wallWallpostAttachmentTypeDto3;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto4 = new WallWallpostAttachmentTypeDto(SignalingProtocol.MEDIA_OPTION_AUDIO, 3, "audio");
        AUDIO = wallWallpostAttachmentTypeDto4;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto5 = new WallWallpostAttachmentTypeDto("AUDIO_PLAYLIST", 4, "audio_playlist");
        AUDIO_PLAYLIST = wallWallpostAttachmentTypeDto5;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto6 = new WallWallpostAttachmentTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 5, "video");
        VIDEO = wallWallpostAttachmentTypeDto6;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto7 = new WallWallpostAttachmentTypeDto("VIDEO_PLAYLIST", 6, "video_playlist");
        VIDEO_PLAYLIST = wallWallpostAttachmentTypeDto7;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto8 = new WallWallpostAttachmentTypeDto("DOC", 7, "doc");
        DOC = wallWallpostAttachmentTypeDto8;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto9 = new WallWallpostAttachmentTypeDto("LINK", 8, "link");
        LINK = wallWallpostAttachmentTypeDto9;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto10 = new WallWallpostAttachmentTypeDto("GRAFFITI", 9, "graffiti");
        GRAFFITI = wallWallpostAttachmentTypeDto10;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto11 = new WallWallpostAttachmentTypeDto("NOTE", 10, "note");
        NOTE = wallWallpostAttachmentTypeDto11;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto12 = new WallWallpostAttachmentTypeDto("APP", 11, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        APP = wallWallpostAttachmentTypeDto12;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto13 = new WallWallpostAttachmentTypeDto("POLL", 12, "poll");
        POLL = wallWallpostAttachmentTypeDto13;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto14 = new WallWallpostAttachmentTypeDto("PAGE", 13, "page");
        PAGE = wallWallpostAttachmentTypeDto14;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto15 = new WallWallpostAttachmentTypeDto("PRETTY_CARDS", 14, "pretty_cards");
        PRETTY_CARDS = wallWallpostAttachmentTypeDto15;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto16 = new WallWallpostAttachmentTypeDto("ALBUM", 15, "album");
        ALBUM = wallWallpostAttachmentTypeDto16;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto17 = new WallWallpostAttachmentTypeDto("MARKET_ALBUM", 16, "market_album");
        MARKET_ALBUM = wallWallpostAttachmentTypeDto17;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto18 = new WallWallpostAttachmentTypeDto("MARKET", 17, "market");
        MARKET = wallWallpostAttachmentTypeDto18;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto19 = new WallWallpostAttachmentTypeDto("EVENT", 18, NotificationCompat.CATEGORY_EVENT);
        EVENT = wallWallpostAttachmentTypeDto19;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto20 = new WallWallpostAttachmentTypeDto("MINI_APP", 19, "mini_app");
        MINI_APP = wallWallpostAttachmentTypeDto20;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto21 = new WallWallpostAttachmentTypeDto("DONUT_LINK", 20, "donut_link");
        DONUT_LINK = wallWallpostAttachmentTypeDto21;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto22 = new WallWallpostAttachmentTypeDto("ARTICLE", 21, "article");
        ARTICLE = wallWallpostAttachmentTypeDto22;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto23 = new WallWallpostAttachmentTypeDto("TEXTLIVE", 22, "textlive");
        TEXTLIVE = wallWallpostAttachmentTypeDto23;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto24 = new WallWallpostAttachmentTypeDto("TEXTPOST", 23, "textpost");
        TEXTPOST = wallWallpostAttachmentTypeDto24;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto25 = new WallWallpostAttachmentTypeDto("TEXTPOST_PUBLISH", 24, "textpost_publish");
        TEXTPOST_PUBLISH = wallWallpostAttachmentTypeDto25;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto26 = new WallWallpostAttachmentTypeDto("SITUATIONAL_THEME", 25, "situational_theme");
        SITUATIONAL_THEME = wallWallpostAttachmentTypeDto26;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto27 = new WallWallpostAttachmentTypeDto("GROUP", 26, "group");
        GROUP = wallWallpostAttachmentTypeDto27;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto28 = new WallWallpostAttachmentTypeDto("STICKER", 27, "sticker");
        STICKER = wallWallpostAttachmentTypeDto28;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto29 = new WallWallpostAttachmentTypeDto("PODCAST", 28, "podcast");
        PODCAST = wallWallpostAttachmentTypeDto29;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto30 = new WallWallpostAttachmentTypeDto("CURATOR", 29, "curator");
        CURATOR = wallWallpostAttachmentTypeDto30;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto31 = new WallWallpostAttachmentTypeDto("ARTIST", 30, "artist");
        ARTIST = wallWallpostAttachmentTypeDto31;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto32 = new WallWallpostAttachmentTypeDto("NARRATIVE", 31, "narrative");
        NARRATIVE = wallWallpostAttachmentTypeDto32;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto33 = new WallWallpostAttachmentTypeDto("GEO", 32, "geo");
        GEO = wallWallpostAttachmentTypeDto33;
        WallWallpostAttachmentTypeDto[] wallWallpostAttachmentTypeDtoArr = {wallWallpostAttachmentTypeDto, wallWallpostAttachmentTypeDto2, wallWallpostAttachmentTypeDto3, wallWallpostAttachmentTypeDto4, wallWallpostAttachmentTypeDto5, wallWallpostAttachmentTypeDto6, wallWallpostAttachmentTypeDto7, wallWallpostAttachmentTypeDto8, wallWallpostAttachmentTypeDto9, wallWallpostAttachmentTypeDto10, wallWallpostAttachmentTypeDto11, wallWallpostAttachmentTypeDto12, wallWallpostAttachmentTypeDto13, wallWallpostAttachmentTypeDto14, wallWallpostAttachmentTypeDto15, wallWallpostAttachmentTypeDto16, wallWallpostAttachmentTypeDto17, wallWallpostAttachmentTypeDto18, wallWallpostAttachmentTypeDto19, wallWallpostAttachmentTypeDto20, wallWallpostAttachmentTypeDto21, wallWallpostAttachmentTypeDto22, wallWallpostAttachmentTypeDto23, wallWallpostAttachmentTypeDto24, wallWallpostAttachmentTypeDto25, wallWallpostAttachmentTypeDto26, wallWallpostAttachmentTypeDto27, wallWallpostAttachmentTypeDto28, wallWallpostAttachmentTypeDto29, wallWallpostAttachmentTypeDto30, wallWallpostAttachmentTypeDto31, wallWallpostAttachmentTypeDto32, wallWallpostAttachmentTypeDto33};
        $VALUES = wallWallpostAttachmentTypeDtoArr;
        $ENTRIES = new asp(wallWallpostAttachmentTypeDtoArr);
    }

    private WallWallpostAttachmentTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static WallWallpostAttachmentTypeDto valueOf(String str) {
        return (WallWallpostAttachmentTypeDto) Enum.valueOf(WallWallpostAttachmentTypeDto.class, str);
    }

    public static WallWallpostAttachmentTypeDto[] values() {
        return (WallWallpostAttachmentTypeDto[]) $VALUES.clone();
    }
}
