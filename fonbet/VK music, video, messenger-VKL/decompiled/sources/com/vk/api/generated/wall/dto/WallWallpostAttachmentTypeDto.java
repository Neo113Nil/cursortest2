package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WallWallpostAttachmentTypeDto.kt */
/* loaded from: classes15.dex */
public final class WallWallpostAttachmentTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallWallpostAttachmentTypeDto[] $VALUES;

    @pmi0("action_button")
    public static final WallWallpostAttachmentTypeDto ACTION_BUTTON;

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

    @pmi0("clip")
    public static final WallWallpostAttachmentTypeDto CLIP;
    public static final Parcelable.Creator<WallWallpostAttachmentTypeDto> CREATOR;

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

    @pmi0("market_link")
    public static final WallWallpostAttachmentTypeDto MARKET_LINK;

    @pmi0("message_to_bc")
    public static final WallWallpostAttachmentTypeDto MESSAGE_TO_BC;

    @pmi0("mini_app")
    public static final WallWallpostAttachmentTypeDto MINI_APP;

    @pmi0("narrative")
    public static final WallWallpostAttachmentTypeDto NARRATIVE;

    @pmi0("note")
    public static final WallWallpostAttachmentTypeDto NOTE;

    @pmi0("online_booking")
    public static final WallWallpostAttachmentTypeDto ONLINE_BOOKING;

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

    /* compiled from: WallWallpostAttachmentTypeDto.kt */
    public static final class a implements Parcelable.Creator<WallWallpostAttachmentTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final WallWallpostAttachmentTypeDto createFromParcel(Parcel parcel) {
            return WallWallpostAttachmentTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallWallpostAttachmentTypeDto[] newArray(int i) {
            return new WallWallpostAttachmentTypeDto[i];
        }
    }

    static {
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto = new WallWallpostAttachmentTypeDto("ACTION_BUTTON", 0, "action_button");
        ACTION_BUTTON = wallWallpostAttachmentTypeDto;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto2 = new WallWallpostAttachmentTypeDto("PHOTO", 1, "photo");
        PHOTO = wallWallpostAttachmentTypeDto2;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto3 = new WallWallpostAttachmentTypeDto("PHOTOS_LIST", 2, "photos_list");
        PHOTOS_LIST = wallWallpostAttachmentTypeDto3;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto4 = new WallWallpostAttachmentTypeDto("POSTED_PHOTO", 3, "posted_photo");
        POSTED_PHOTO = wallWallpostAttachmentTypeDto4;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto5 = new WallWallpostAttachmentTypeDto(SignalingProtocol.MEDIA_OPTION_AUDIO, 4, "audio");
        AUDIO = wallWallpostAttachmentTypeDto5;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto6 = new WallWallpostAttachmentTypeDto("AUDIO_PLAYLIST", 5, "audio_playlist");
        AUDIO_PLAYLIST = wallWallpostAttachmentTypeDto6;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto7 = new WallWallpostAttachmentTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 6, "video");
        VIDEO = wallWallpostAttachmentTypeDto7;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto8 = new WallWallpostAttachmentTypeDto("CLIP", 7, "clip");
        CLIP = wallWallpostAttachmentTypeDto8;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto9 = new WallWallpostAttachmentTypeDto("VIDEO_PLAYLIST", 8, "video_playlist");
        VIDEO_PLAYLIST = wallWallpostAttachmentTypeDto9;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto10 = new WallWallpostAttachmentTypeDto("DOC", 9, "doc");
        DOC = wallWallpostAttachmentTypeDto10;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto11 = new WallWallpostAttachmentTypeDto("LINK", 10, "link");
        LINK = wallWallpostAttachmentTypeDto11;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto12 = new WallWallpostAttachmentTypeDto("GRAFFITI", 11, "graffiti");
        GRAFFITI = wallWallpostAttachmentTypeDto12;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto13 = new WallWallpostAttachmentTypeDto("NOTE", 12, "note");
        NOTE = wallWallpostAttachmentTypeDto13;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto14 = new WallWallpostAttachmentTypeDto("APP", 13, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        APP = wallWallpostAttachmentTypeDto14;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto15 = new WallWallpostAttachmentTypeDto("POLL", 14, "poll");
        POLL = wallWallpostAttachmentTypeDto15;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto16 = new WallWallpostAttachmentTypeDto("PAGE", 15, "page");
        PAGE = wallWallpostAttachmentTypeDto16;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto17 = new WallWallpostAttachmentTypeDto("PRETTY_CARDS", 16, "pretty_cards");
        PRETTY_CARDS = wallWallpostAttachmentTypeDto17;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto18 = new WallWallpostAttachmentTypeDto("ALBUM", 17, "album");
        ALBUM = wallWallpostAttachmentTypeDto18;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto19 = new WallWallpostAttachmentTypeDto("MARKET_ALBUM", 18, "market_album");
        MARKET_ALBUM = wallWallpostAttachmentTypeDto19;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto20 = new WallWallpostAttachmentTypeDto("MARKET", 19, "market");
        MARKET = wallWallpostAttachmentTypeDto20;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto21 = new WallWallpostAttachmentTypeDto("EVENT", 20, NotificationCompat.CATEGORY_EVENT);
        EVENT = wallWallpostAttachmentTypeDto21;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto22 = new WallWallpostAttachmentTypeDto("MINI_APP", 21, "mini_app");
        MINI_APP = wallWallpostAttachmentTypeDto22;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto23 = new WallWallpostAttachmentTypeDto("DONUT_LINK", 22, "donut_link");
        DONUT_LINK = wallWallpostAttachmentTypeDto23;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto24 = new WallWallpostAttachmentTypeDto("ARTICLE", 23, "article");
        ARTICLE = wallWallpostAttachmentTypeDto24;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto25 = new WallWallpostAttachmentTypeDto("TEXTLIVE", 24, "textlive");
        TEXTLIVE = wallWallpostAttachmentTypeDto25;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto26 = new WallWallpostAttachmentTypeDto("TEXTPOST", 25, "textpost");
        TEXTPOST = wallWallpostAttachmentTypeDto26;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto27 = new WallWallpostAttachmentTypeDto("TEXTPOST_PUBLISH", 26, "textpost_publish");
        TEXTPOST_PUBLISH = wallWallpostAttachmentTypeDto27;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto28 = new WallWallpostAttachmentTypeDto("SITUATIONAL_THEME", 27, "situational_theme");
        SITUATIONAL_THEME = wallWallpostAttachmentTypeDto28;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto29 = new WallWallpostAttachmentTypeDto("GROUP", 28, "group");
        GROUP = wallWallpostAttachmentTypeDto29;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto30 = new WallWallpostAttachmentTypeDto("STICKER", 29, "sticker");
        STICKER = wallWallpostAttachmentTypeDto30;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto31 = new WallWallpostAttachmentTypeDto("PODCAST", 30, "podcast");
        PODCAST = wallWallpostAttachmentTypeDto31;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto32 = new WallWallpostAttachmentTypeDto("CURATOR", 31, "curator");
        CURATOR = wallWallpostAttachmentTypeDto32;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto33 = new WallWallpostAttachmentTypeDto("ARTIST", 32, "artist");
        ARTIST = wallWallpostAttachmentTypeDto33;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto34 = new WallWallpostAttachmentTypeDto("NARRATIVE", 33, "narrative");
        NARRATIVE = wallWallpostAttachmentTypeDto34;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto35 = new WallWallpostAttachmentTypeDto("GEO", 34, "geo");
        GEO = wallWallpostAttachmentTypeDto35;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto36 = new WallWallpostAttachmentTypeDto("ONLINE_BOOKING", 35, "online_booking");
        ONLINE_BOOKING = wallWallpostAttachmentTypeDto36;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto37 = new WallWallpostAttachmentTypeDto("MARKET_LINK", 36, "market_link");
        MARKET_LINK = wallWallpostAttachmentTypeDto37;
        WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto38 = new WallWallpostAttachmentTypeDto("MESSAGE_TO_BC", 37, "message_to_bc");
        MESSAGE_TO_BC = wallWallpostAttachmentTypeDto38;
        WallWallpostAttachmentTypeDto[] wallWallpostAttachmentTypeDtoArr = {wallWallpostAttachmentTypeDto, wallWallpostAttachmentTypeDto2, wallWallpostAttachmentTypeDto3, wallWallpostAttachmentTypeDto4, wallWallpostAttachmentTypeDto5, wallWallpostAttachmentTypeDto6, wallWallpostAttachmentTypeDto7, wallWallpostAttachmentTypeDto8, wallWallpostAttachmentTypeDto9, wallWallpostAttachmentTypeDto10, wallWallpostAttachmentTypeDto11, wallWallpostAttachmentTypeDto12, wallWallpostAttachmentTypeDto13, wallWallpostAttachmentTypeDto14, wallWallpostAttachmentTypeDto15, wallWallpostAttachmentTypeDto16, wallWallpostAttachmentTypeDto17, wallWallpostAttachmentTypeDto18, wallWallpostAttachmentTypeDto19, wallWallpostAttachmentTypeDto20, wallWallpostAttachmentTypeDto21, wallWallpostAttachmentTypeDto22, wallWallpostAttachmentTypeDto23, wallWallpostAttachmentTypeDto24, wallWallpostAttachmentTypeDto25, wallWallpostAttachmentTypeDto26, wallWallpostAttachmentTypeDto27, wallWallpostAttachmentTypeDto28, wallWallpostAttachmentTypeDto29, wallWallpostAttachmentTypeDto30, wallWallpostAttachmentTypeDto31, wallWallpostAttachmentTypeDto32, wallWallpostAttachmentTypeDto33, wallWallpostAttachmentTypeDto34, wallWallpostAttachmentTypeDto35, wallWallpostAttachmentTypeDto36, wallWallpostAttachmentTypeDto37, wallWallpostAttachmentTypeDto38};
        $VALUES = wallWallpostAttachmentTypeDtoArr;
        $ENTRIES = new asp(wallWallpostAttachmentTypeDtoArr);
        CREATOR = new a();
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

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
