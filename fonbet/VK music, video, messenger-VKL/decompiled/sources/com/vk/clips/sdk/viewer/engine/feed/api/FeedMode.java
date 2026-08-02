package com.vk.clips.sdk.viewer.engine.feed.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FeedMode.kt */
/* loaded from: classes17.dex */
public final class FeedMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FeedMode[] $VALUES;
    public static final FeedMode Horizontal;
    public static final FeedMode Vertical;

    static {
        FeedMode feedMode = new FeedMode("Vertical", 0);
        Vertical = feedMode;
        FeedMode feedMode2 = new FeedMode("Horizontal", 1);
        Horizontal = feedMode2;
        FeedMode[] feedModeArr = {feedMode, feedMode2};
        $VALUES = feedModeArr;
        $ENTRIES = new asp(feedModeArr);
    }

    public FeedMode() {
        throw null;
    }

    public static FeedMode valueOf(String str) {
        return (FeedMode) Enum.valueOf(FeedMode.class, str);
    }

    public static FeedMode[] values() {
        return (FeedMode[]) $VALUES.clone();
    }
}
