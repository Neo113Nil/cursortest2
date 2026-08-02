package com.vk.newsfeed.common.recycler.holders.headers;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DisplayMode.kt */
/* loaded from: classes4.dex */
public final class DisplayMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DisplayMode[] $VALUES;
    public static final DisplayMode DEFAULT;
    public static final DisplayMode OVERLAY;

    /* compiled from: DisplayMode.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DisplayMode.values().length];
            try {
                iArr[DisplayMode.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisplayMode.OVERLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        DisplayMode displayMode = new DisplayMode("DEFAULT", 0);
        DEFAULT = displayMode;
        DisplayMode displayMode2 = new DisplayMode("OVERLAY", 1);
        OVERLAY = displayMode2;
        DisplayMode[] displayModeArr = {displayMode, displayMode2};
        $VALUES = displayModeArr;
        $ENTRIES = new asp(displayModeArr);
    }

    public DisplayMode() {
        throw null;
    }

    public static DisplayMode valueOf(String str) {
        return (DisplayMode) Enum.valueOf(DisplayMode.class, str);
    }

    public static DisplayMode[] values() {
        return (DisplayMode[]) $VALUES.clone();
    }
}
