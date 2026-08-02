package com.vk.sdk.api.wall.dto;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WallCommentAttachmentTypeDto.kt */
/* loaded from: classes5.dex */
public final class WallCommentAttachmentTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallCommentAttachmentTypeDto[] $VALUES;

    @pmi0("audio")
    public static final WallCommentAttachmentTypeDto AUDIO;

    @pmi0("audio_playlist")
    public static final WallCommentAttachmentTypeDto AUDIO_PLAYLIST;

    @pmi0("doc")
    public static final WallCommentAttachmentTypeDto DOC;

    @pmi0("graffiti")
    public static final WallCommentAttachmentTypeDto GRAFFITI;

    @pmi0("link")
    public static final WallCommentAttachmentTypeDto LINK;

    @pmi0("market")
    public static final WallCommentAttachmentTypeDto MARKET;

    @pmi0("market_market_album")
    public static final WallCommentAttachmentTypeDto MARKET_MARKET_ALBUM;

    @pmi0("note")
    public static final WallCommentAttachmentTypeDto NOTE;

    @pmi0("page")
    public static final WallCommentAttachmentTypeDto PAGE;

    @pmi0("photo")
    public static final WallCommentAttachmentTypeDto PHOTO;

    @pmi0("sticker")
    public static final WallCommentAttachmentTypeDto STICKER;

    @pmi0("video")
    public static final WallCommentAttachmentTypeDto VIDEO;
    private final String value;

    static {
        WallCommentAttachmentTypeDto wallCommentAttachmentTypeDto = new WallCommentAttachmentTypeDto("PHOTO", 0, "photo");
        PHOTO = wallCommentAttachmentTypeDto;
        WallCommentAttachmentTypeDto wallCommentAttachmentTypeDto2 = new WallCommentAttachmentTypeDto(SignalingProtocol.MEDIA_OPTION_AUDIO, 1, "audio");
        AUDIO = wallCommentAttachmentTypeDto2;
        WallCommentAttachmentTypeDto wallCommentAttachmentTypeDto3 = new WallCommentAttachmentTypeDto("AUDIO_PLAYLIST", 2, "audio_playlist");
        AUDIO_PLAYLIST = wallCommentAttachmentTypeDto3;
        WallCommentAttachmentTypeDto wallCommentAttachmentTypeDto4 = new WallCommentAttachmentTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 3, "video");
        VIDEO = wallCommentAttachmentTypeDto4;
        WallCommentAttachmentTypeDto wallCommentAttachmentTypeDto5 = new WallCommentAttachmentTypeDto("DOC", 4, "doc");
        DOC = wallCommentAttachmentTypeDto5;
        WallCommentAttachmentTypeDto wallCommentAttachmentTypeDto6 = new WallCommentAttachmentTypeDto("LINK", 5, "link");
        LINK = wallCommentAttachmentTypeDto6;
        WallCommentAttachmentTypeDto wallCommentAttachmentTypeDto7 = new WallCommentAttachmentTypeDto("NOTE", 6, "note");
        NOTE = wallCommentAttachmentTypeDto7;
        WallCommentAttachmentTypeDto wallCommentAttachmentTypeDto8 = new WallCommentAttachmentTypeDto("PAGE", 7, "page");
        PAGE = wallCommentAttachmentTypeDto8;
        WallCommentAttachmentTypeDto wallCommentAttachmentTypeDto9 = new WallCommentAttachmentTypeDto("MARKET_MARKET_ALBUM", 8, "market_market_album");
        MARKET_MARKET_ALBUM = wallCommentAttachmentTypeDto9;
        WallCommentAttachmentTypeDto wallCommentAttachmentTypeDto10 = new WallCommentAttachmentTypeDto("MARKET", 9, "market");
        MARKET = wallCommentAttachmentTypeDto10;
        WallCommentAttachmentTypeDto wallCommentAttachmentTypeDto11 = new WallCommentAttachmentTypeDto("STICKER", 10, "sticker");
        STICKER = wallCommentAttachmentTypeDto11;
        WallCommentAttachmentTypeDto wallCommentAttachmentTypeDto12 = new WallCommentAttachmentTypeDto("GRAFFITI", 11, "graffiti");
        GRAFFITI = wallCommentAttachmentTypeDto12;
        WallCommentAttachmentTypeDto[] wallCommentAttachmentTypeDtoArr = {wallCommentAttachmentTypeDto, wallCommentAttachmentTypeDto2, wallCommentAttachmentTypeDto3, wallCommentAttachmentTypeDto4, wallCommentAttachmentTypeDto5, wallCommentAttachmentTypeDto6, wallCommentAttachmentTypeDto7, wallCommentAttachmentTypeDto8, wallCommentAttachmentTypeDto9, wallCommentAttachmentTypeDto10, wallCommentAttachmentTypeDto11, wallCommentAttachmentTypeDto12};
        $VALUES = wallCommentAttachmentTypeDtoArr;
        $ENTRIES = new asp(wallCommentAttachmentTypeDtoArr);
    }

    private WallCommentAttachmentTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static WallCommentAttachmentTypeDto valueOf(String str) {
        return (WallCommentAttachmentTypeDto) Enum.valueOf(WallCommentAttachmentTypeDto.class, str);
    }

    public static WallCommentAttachmentTypeDto[] values() {
        return (WallCommentAttachmentTypeDto[]) $VALUES.clone();
    }
}
