package com.vk.newsfeed.common.presentation.model.displaymode;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HeaderDisplayMode.kt */
/* loaded from: classes4.dex */
public final class HeaderDisplayMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ HeaderDisplayMode[] $VALUES;
    public static final HeaderDisplayMode DEFAULT;
    public static final HeaderDisplayMode OVERLAY;

    static {
        HeaderDisplayMode headerDisplayMode = new HeaderDisplayMode("DEFAULT", 0);
        DEFAULT = headerDisplayMode;
        HeaderDisplayMode headerDisplayMode2 = new HeaderDisplayMode("OVERLAY", 1);
        OVERLAY = headerDisplayMode2;
        HeaderDisplayMode[] headerDisplayModeArr = {headerDisplayMode, headerDisplayMode2};
        $VALUES = headerDisplayModeArr;
        $ENTRIES = new asp(headerDisplayModeArr);
    }

    public HeaderDisplayMode() {
        throw null;
    }

    public static HeaderDisplayMode valueOf(String str) {
        return (HeaderDisplayMode) Enum.valueOf(HeaderDisplayMode.class, str);
    }

    public static HeaderDisplayMode[] values() {
        return (HeaderDisplayMode[]) $VALUES.clone();
    }
}
