package com.vk.libvideo.models.autoplay;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RepeatMode.kt */
/* loaded from: classes3.dex */
public final class RepeatMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RepeatMode[] $VALUES;
    public static final RepeatMode ALWAYS;
    public static final RepeatMode BY_VIDEO_PARAMS;
    public static final RepeatMode OFF;

    static {
        RepeatMode repeatMode = new RepeatMode("OFF", 0);
        OFF = repeatMode;
        RepeatMode repeatMode2 = new RepeatMode("ALWAYS", 1);
        ALWAYS = repeatMode2;
        RepeatMode repeatMode3 = new RepeatMode("BY_VIDEO_PARAMS", 2);
        BY_VIDEO_PARAMS = repeatMode3;
        RepeatMode[] repeatModeArr = {repeatMode, repeatMode2, repeatMode3};
        $VALUES = repeatModeArr;
        $ENTRIES = new asp(repeatModeArr);
    }

    public RepeatMode() {
        throw null;
    }

    public static RepeatMode valueOf(String str) {
        return (RepeatMode) Enum.valueOf(RepeatMode.class, str);
    }

    public static RepeatMode[] values() {
        return (RepeatMode[]) $VALUES.clone();
    }
}
