package com.vk.community.design.compose.components.channel;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MediaType.kt */
/* loaded from: classes17.dex */
public final class MediaType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MediaType[] $VALUES;
    public static final a Companion;
    public static final MediaType PHOTO;
    public static final MediaType UNKNOWN;
    public static final MediaType VIDEO;
    private final String value;

    /* compiled from: MediaType.kt */
    public static final class a {
    }

    static {
        MediaType mediaType = new MediaType(SignalingProtocol.MEDIA_OPTION_VIDEO, 0, "video");
        VIDEO = mediaType;
        MediaType mediaType2 = new MediaType("PHOTO", 1, "photo");
        PHOTO = mediaType2;
        MediaType mediaType3 = new MediaType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2, "");
        UNKNOWN = mediaType3;
        MediaType[] mediaTypeArr = {mediaType, mediaType2, mediaType3};
        $VALUES = mediaTypeArr;
        $ENTRIES = new asp(mediaTypeArr);
        Companion = new a();
    }

    public MediaType(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<MediaType> h() {
        return $ENTRIES;
    }

    public static MediaType valueOf(String str) {
        return (MediaType) Enum.valueOf(MediaType.class, str);
    }

    public static MediaType[] values() {
        return (MediaType[]) $VALUES.clone();
    }

    public final String i() {
        return this.value;
    }
}
