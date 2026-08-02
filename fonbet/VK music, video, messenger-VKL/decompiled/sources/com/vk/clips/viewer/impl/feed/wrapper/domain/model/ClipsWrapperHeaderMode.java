package com.vk.clips.viewer.impl.feed.wrapper.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsWrapperHeaderMode.kt */
/* loaded from: classes17.dex */
public final class ClipsWrapperHeaderMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipsWrapperHeaderMode[] $VALUES;
    public static final ClipsWrapperHeaderMode NONE;
    public static final ClipsWrapperHeaderMode SINGLE_TITLE;
    public static final ClipsWrapperHeaderMode TABS;

    static {
        ClipsWrapperHeaderMode clipsWrapperHeaderMode = new ClipsWrapperHeaderMode("TABS", 0);
        TABS = clipsWrapperHeaderMode;
        ClipsWrapperHeaderMode clipsWrapperHeaderMode2 = new ClipsWrapperHeaderMode("SINGLE_TITLE", 1);
        SINGLE_TITLE = clipsWrapperHeaderMode2;
        ClipsWrapperHeaderMode clipsWrapperHeaderMode3 = new ClipsWrapperHeaderMode("NONE", 2);
        NONE = clipsWrapperHeaderMode3;
        ClipsWrapperHeaderMode[] clipsWrapperHeaderModeArr = {clipsWrapperHeaderMode, clipsWrapperHeaderMode2, clipsWrapperHeaderMode3};
        $VALUES = clipsWrapperHeaderModeArr;
        $ENTRIES = new asp(clipsWrapperHeaderModeArr);
    }

    public ClipsWrapperHeaderMode() {
        throw null;
    }

    public static ClipsWrapperHeaderMode valueOf(String str) {
        return (ClipsWrapperHeaderMode) Enum.valueOf(ClipsWrapperHeaderMode.class, str);
    }

    public static ClipsWrapperHeaderMode[] values() {
        return (ClipsWrapperHeaderMode[]) $VALUES.clone();
    }
}
