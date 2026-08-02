package com.vk.profile.design.compose.topbar;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OwnerTopBar.kt */
/* loaded from: classes5.dex */
public final class TopBarPaginationMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TopBarPaginationMode[] $VALUES;
    public static final TopBarPaginationMode Circle;
    public static final TopBarPaginationMode Progress;

    static {
        TopBarPaginationMode topBarPaginationMode = new TopBarPaginationMode("Circle", 0);
        Circle = topBarPaginationMode;
        TopBarPaginationMode topBarPaginationMode2 = new TopBarPaginationMode("Progress", 1);
        Progress = topBarPaginationMode2;
        TopBarPaginationMode[] topBarPaginationModeArr = {topBarPaginationMode, topBarPaginationMode2};
        $VALUES = topBarPaginationModeArr;
        $ENTRIES = new asp(topBarPaginationModeArr);
    }

    public TopBarPaginationMode() {
        throw null;
    }

    public static TopBarPaginationMode valueOf(String str) {
        return (TopBarPaginationMode) Enum.valueOf(TopBarPaginationMode.class, str);
    }

    public static TopBarPaginationMode[] values() {
        return (TopBarPaginationMode[]) $VALUES.clone();
    }
}
