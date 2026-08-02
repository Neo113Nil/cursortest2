package com.vk.music.stickybannerad;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MusicStickyBannerReporter.kt */
/* loaded from: classes3.dex */
public final class MusicStickyBannerReporter$MusicStickyBannerEventType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MusicStickyBannerReporter$MusicStickyBannerEventType[] $VALUES;
    public static final MusicStickyBannerReporter$MusicStickyBannerEventType NOT_RECEIVED;
    public static final MusicStickyBannerReporter$MusicStickyBannerEventType RECEIVED;
    public static final MusicStickyBannerReporter$MusicStickyBannerEventType REQUESTED;
    public static final MusicStickyBannerReporter$MusicStickyBannerEventType SHOW_ERROR;
    public static final MusicStickyBannerReporter$MusicStickyBannerEventType SHOW_SUCCESS;
    private final String typeName;

    static {
        MusicStickyBannerReporter$MusicStickyBannerEventType musicStickyBannerReporter$MusicStickyBannerEventType = new MusicStickyBannerReporter$MusicStickyBannerEventType("REQUESTED", 0, "requested");
        REQUESTED = musicStickyBannerReporter$MusicStickyBannerEventType;
        MusicStickyBannerReporter$MusicStickyBannerEventType musicStickyBannerReporter$MusicStickyBannerEventType2 = new MusicStickyBannerReporter$MusicStickyBannerEventType("RECEIVED", 1, "received");
        RECEIVED = musicStickyBannerReporter$MusicStickyBannerEventType2;
        MusicStickyBannerReporter$MusicStickyBannerEventType musicStickyBannerReporter$MusicStickyBannerEventType3 = new MusicStickyBannerReporter$MusicStickyBannerEventType("NOT_RECEIVED", 2, "not_received");
        NOT_RECEIVED = musicStickyBannerReporter$MusicStickyBannerEventType3;
        MusicStickyBannerReporter$MusicStickyBannerEventType musicStickyBannerReporter$MusicStickyBannerEventType4 = new MusicStickyBannerReporter$MusicStickyBannerEventType("SHOW_SUCCESS", 3, "show");
        SHOW_SUCCESS = musicStickyBannerReporter$MusicStickyBannerEventType4;
        MusicStickyBannerReporter$MusicStickyBannerEventType musicStickyBannerReporter$MusicStickyBannerEventType5 = new MusicStickyBannerReporter$MusicStickyBannerEventType("SHOW_ERROR", 4, "show_error");
        SHOW_ERROR = musicStickyBannerReporter$MusicStickyBannerEventType5;
        MusicStickyBannerReporter$MusicStickyBannerEventType[] musicStickyBannerReporter$MusicStickyBannerEventTypeArr = {musicStickyBannerReporter$MusicStickyBannerEventType, musicStickyBannerReporter$MusicStickyBannerEventType2, musicStickyBannerReporter$MusicStickyBannerEventType3, musicStickyBannerReporter$MusicStickyBannerEventType4, musicStickyBannerReporter$MusicStickyBannerEventType5};
        $VALUES = musicStickyBannerReporter$MusicStickyBannerEventTypeArr;
        $ENTRIES = new asp(musicStickyBannerReporter$MusicStickyBannerEventTypeArr);
    }

    public MusicStickyBannerReporter$MusicStickyBannerEventType(String str, int i, String str2) {
        this.typeName = str2;
    }

    public static MusicStickyBannerReporter$MusicStickyBannerEventType valueOf(String str) {
        return (MusicStickyBannerReporter$MusicStickyBannerEventType) Enum.valueOf(MusicStickyBannerReporter$MusicStickyBannerEventType.class, str);
    }

    public static MusicStickyBannerReporter$MusicStickyBannerEventType[] values() {
        return (MusicStickyBannerReporter$MusicStickyBannerEventType[]) $VALUES.clone();
    }

    public final String h() {
        return this.typeName;
    }
}
