package com.vk.libvideo.models.videotracker;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScreenType.kt */
/* loaded from: classes3.dex */
public final class ScreenType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ScreenType[] $VALUES;
    public static final ScreenType CAROUSEL;
    public static final ScreenType INLINE;
    public static final ScreenType LANDSCAPE;
    public static final ScreenType PORTRAIT;

    static {
        ScreenType screenType = new ScreenType("INLINE", 0);
        INLINE = screenType;
        ScreenType screenType2 = new ScreenType("CAROUSEL", 1);
        CAROUSEL = screenType2;
        ScreenType screenType3 = new ScreenType("PORTRAIT", 2);
        PORTRAIT = screenType3;
        ScreenType screenType4 = new ScreenType("LANDSCAPE", 3);
        LANDSCAPE = screenType4;
        ScreenType[] screenTypeArr = {screenType, screenType2, screenType3, screenType4};
        $VALUES = screenTypeArr;
        $ENTRIES = new asp(screenTypeArr);
    }

    public ScreenType() {
        throw null;
    }

    public static ScreenType valueOf(String str) {
        return (ScreenType) Enum.valueOf(ScreenType.class, str);
    }

    public static ScreenType[] values() {
        return (ScreenType[]) $VALUES.clone();
    }
}
