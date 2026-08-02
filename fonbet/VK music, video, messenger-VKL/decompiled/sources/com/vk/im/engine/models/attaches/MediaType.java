package com.vk.im.engine.models.attaches;

import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudio;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.attaches.AttachMarket;
import com.vk.im.engine.models.attaches.miniapp.MiniAppSnippetDataAttach;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MediaType.kt */
/* loaded from: classes2.dex */
public final class MediaType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MediaType[] $VALUES;
    public static final MediaType APPS;
    public static final MediaType AUDIO;
    public static final MediaType CLIP;
    public static final MediaType DOC;
    public static final MediaType GAMES;
    public static final MediaType LINK;
    public static final MediaType MARKET;
    public static final MediaType PHOTO;
    public static final MediaType VIDEO;
    public static final MediaType WALL;
    private final String alias;
    private final Class<? extends Attach> type;

    static {
        MediaType mediaType = new MediaType(AttachImage.class, "PHOTO", "photo", 0);
        PHOTO = mediaType;
        MediaType mediaType2 = new MediaType(AttachVideo.class, SignalingProtocol.MEDIA_OPTION_VIDEO, "video", 1);
        VIDEO = mediaType2;
        MediaType mediaType3 = new MediaType(AttachVideo.class, "CLIP", "clip", 2);
        CLIP = mediaType3;
        MediaType mediaType4 = new MediaType(AttachAudio.class, SignalingProtocol.MEDIA_OPTION_AUDIO, "audio", 3);
        AUDIO = mediaType4;
        MediaType mediaType5 = new MediaType(AttachDoc.class, "DOC", "doc", 4);
        DOC = mediaType5;
        MediaType mediaType6 = new MediaType(AttachLink.class, "LINK", "share", 5);
        LINK = mediaType6;
        MediaType mediaType7 = new MediaType(AttachMarket.class, "MARKET", "market", 6);
        MARKET = mediaType7;
        MediaType mediaType8 = new MediaType(AttachWall.class, "WALL", "wall", 7);
        WALL = mediaType8;
        MediaType mediaType9 = new MediaType(MiniAppSnippetDataAttach.class, "APPS", "app_action_mini_apps", 8);
        APPS = mediaType9;
        MediaType mediaType10 = new MediaType(MiniAppSnippetDataAttach.class, "GAMES", "app_action_games", 9);
        GAMES = mediaType10;
        MediaType[] mediaTypeArr = {mediaType, mediaType2, mediaType3, mediaType4, mediaType5, mediaType6, mediaType7, mediaType8, mediaType9, mediaType10};
        $VALUES = mediaTypeArr;
        $ENTRIES = new asp(mediaTypeArr);
    }

    public MediaType(Class cls, String str, String str2, int i) {
        this.alias = str2;
        this.type = cls;
    }

    public static MediaType valueOf(String str) {
        return (MediaType) Enum.valueOf(MediaType.class, str);
    }

    public static MediaType[] values() {
        return (MediaType[]) $VALUES.clone();
    }

    public final String h() {
        return this.alias;
    }

    public final Class<? extends Attach> i() {
        return this.type;
    }
}
