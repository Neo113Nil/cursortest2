package com.vk.dto.newsfeed;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WallGetMode.kt */
/* loaded from: classes18.dex */
public final class WallGetMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallGetMode[] $VALUES;
    public static final WallGetMode ALL;
    public static final WallGetMode ARCHIVED;
    public static final WallGetMode DONUT;
    public static final WallGetMode MAIN;
    public static final WallGetMode OWNER;

    static {
        WallGetMode wallGetMode = new WallGetMode("ALL", 0);
        ALL = wallGetMode;
        WallGetMode wallGetMode2 = new WallGetMode("OWNER", 1);
        OWNER = wallGetMode2;
        WallGetMode wallGetMode3 = new WallGetMode("ARCHIVED", 2);
        ARCHIVED = wallGetMode3;
        WallGetMode wallGetMode4 = new WallGetMode("DONUT", 3);
        DONUT = wallGetMode4;
        WallGetMode wallGetMode5 = new WallGetMode("MAIN", 4);
        MAIN = wallGetMode5;
        WallGetMode[] wallGetModeArr = {wallGetMode, wallGetMode2, wallGetMode3, wallGetMode4, wallGetMode5};
        $VALUES = wallGetModeArr;
        $ENTRIES = new asp(wallGetModeArr);
    }

    public WallGetMode() {
        throw null;
    }

    public static WallGetMode valueOf(String str) {
        return (WallGetMode) Enum.valueOf(WallGetMode.class, str);
    }

    public static WallGetMode[] values() {
        return (WallGetMode[]) $VALUES.clone();
    }
}
