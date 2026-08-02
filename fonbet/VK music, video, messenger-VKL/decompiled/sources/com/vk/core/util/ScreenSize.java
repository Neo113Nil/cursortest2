package com.vk.core.util;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScreenSize.kt */
/* loaded from: classes.dex */
public final class ScreenSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ScreenSize[] $VALUES;
    public static final ScreenSize Large;
    public static final ScreenSize Normal;
    public static final ScreenSize Xlarge;

    static {
        ScreenSize screenSize = new ScreenSize("Normal", 0);
        Normal = screenSize;
        ScreenSize screenSize2 = new ScreenSize("Large", 1);
        Large = screenSize2;
        ScreenSize screenSize3 = new ScreenSize("Xlarge", 2);
        Xlarge = screenSize3;
        ScreenSize[] screenSizeArr = {screenSize, screenSize2, screenSize3};
        $VALUES = screenSizeArr;
        $ENTRIES = new asp(screenSizeArr);
    }

    public ScreenSize() {
        throw null;
    }

    public static zrp<ScreenSize> h() {
        return $ENTRIES;
    }

    public static ScreenSize valueOf(String str) {
        return (ScreenSize) Enum.valueOf(ScreenSize.class, str);
    }

    public static ScreenSize[] values() {
        return (ScreenSize[]) $VALUES.clone();
    }
}
