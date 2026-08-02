package com.vk.music.player.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlayerConfig.kt */
/* loaded from: classes3.dex */
public final class BottomPlayerAppearance {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BottomPlayerAppearance[] $VALUES;
    public static final BottomPlayerAppearance COMPACT;
    public static final BottomPlayerAppearance LARGE;

    static {
        BottomPlayerAppearance bottomPlayerAppearance = new BottomPlayerAppearance("COMPACT", 0);
        COMPACT = bottomPlayerAppearance;
        BottomPlayerAppearance bottomPlayerAppearance2 = new BottomPlayerAppearance("LARGE", 1);
        LARGE = bottomPlayerAppearance2;
        BottomPlayerAppearance[] bottomPlayerAppearanceArr = {bottomPlayerAppearance, bottomPlayerAppearance2};
        $VALUES = bottomPlayerAppearanceArr;
        $ENTRIES = new asp(bottomPlayerAppearanceArr);
    }

    public BottomPlayerAppearance() {
        throw null;
    }

    public static BottomPlayerAppearance valueOf(String str) {
        return (BottomPlayerAppearance) Enum.valueOf(BottomPlayerAppearance.class, str);
    }

    public static BottomPlayerAppearance[] values() {
        return (BottomPlayerAppearance[]) $VALUES.clone();
    }
}
