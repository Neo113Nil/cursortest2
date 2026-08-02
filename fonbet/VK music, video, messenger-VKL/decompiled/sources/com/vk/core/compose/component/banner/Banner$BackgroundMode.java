package com.vk.core.compose.component.banner;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Banner.kt */
/* loaded from: classes17.dex */
public final class Banner$BackgroundMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Banner$BackgroundMode[] $VALUES;
    public static final Banner$BackgroundMode Auto;
    public static final Banner$BackgroundMode Dark;
    public static final Banner$BackgroundMode Light;

    static {
        Banner$BackgroundMode banner$BackgroundMode = new Banner$BackgroundMode("Auto", 0);
        Auto = banner$BackgroundMode;
        Banner$BackgroundMode banner$BackgroundMode2 = new Banner$BackgroundMode("Dark", 1);
        Dark = banner$BackgroundMode2;
        Banner$BackgroundMode banner$BackgroundMode3 = new Banner$BackgroundMode("Light", 2);
        Light = banner$BackgroundMode3;
        Banner$BackgroundMode[] banner$BackgroundModeArr = {banner$BackgroundMode, banner$BackgroundMode2, banner$BackgroundMode3};
        $VALUES = banner$BackgroundModeArr;
        $ENTRIES = new asp(banner$BackgroundModeArr);
    }

    public Banner$BackgroundMode() {
        throw null;
    }

    public static zrp<Banner$BackgroundMode> h() {
        return $ENTRIES;
    }

    public static Banner$BackgroundMode valueOf(String str) {
        return (Banner$BackgroundMode) Enum.valueOf(Banner$BackgroundMode.class, str);
    }

    public static Banner$BackgroundMode[] values() {
        return (Banner$BackgroundMode[]) $VALUES.clone();
    }
}
