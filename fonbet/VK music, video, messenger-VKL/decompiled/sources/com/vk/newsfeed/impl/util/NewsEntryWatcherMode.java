package com.vk.newsfeed.impl.util;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewsEntryWatcher.kt */
/* loaded from: classes4.dex */
public final class NewsEntryWatcherMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsEntryWatcherMode[] $VALUES;
    public static final NewsEntryWatcherMode FAST;
    public static final NewsEntryWatcherMode HALF;
    public static final NewsEntryWatcherMode NORMAL;
    private final long startDelay = 300;
    private final float visiblePercent;

    static {
        NewsEntryWatcherMode newsEntryWatcherMode = new NewsEntryWatcherMode("FAST", 0, 0.3f);
        FAST = newsEntryWatcherMode;
        NewsEntryWatcherMode newsEntryWatcherMode2 = new NewsEntryWatcherMode("NORMAL", 1, 0.45f);
        NORMAL = newsEntryWatcherMode2;
        NewsEntryWatcherMode newsEntryWatcherMode3 = new NewsEntryWatcherMode("HALF", 2, 0.5f);
        HALF = newsEntryWatcherMode3;
        NewsEntryWatcherMode[] newsEntryWatcherModeArr = {newsEntryWatcherMode, newsEntryWatcherMode2, newsEntryWatcherMode3};
        $VALUES = newsEntryWatcherModeArr;
        $ENTRIES = new asp(newsEntryWatcherModeArr);
    }

    public NewsEntryWatcherMode(String str, int i, float f) {
        this.visiblePercent = f;
    }

    public static NewsEntryWatcherMode valueOf(String str) {
        return (NewsEntryWatcherMode) Enum.valueOf(NewsEntryWatcherMode.class, str);
    }

    public static NewsEntryWatcherMode[] values() {
        return (NewsEntryWatcherMode[]) $VALUES.clone();
    }

    public final long h() {
        return this.startDelay;
    }

    public final float i() {
        return this.visiblePercent;
    }
}
