package com.vk.story.api.domain.preload;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoryVideoMemoryCache.kt */
/* loaded from: classes6.dex */
public final class StoryVideoMemoryCache {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoryVideoMemoryCache[] $VALUES;
    public static final StoryVideoMemoryCache MEMORY_AND_DISK;
    public static final StoryVideoMemoryCache ONLY_DISK;

    static {
        StoryVideoMemoryCache storyVideoMemoryCache = new StoryVideoMemoryCache("ONLY_DISK", 0);
        ONLY_DISK = storyVideoMemoryCache;
        StoryVideoMemoryCache storyVideoMemoryCache2 = new StoryVideoMemoryCache("MEMORY_AND_DISK", 1);
        MEMORY_AND_DISK = storyVideoMemoryCache2;
        StoryVideoMemoryCache[] storyVideoMemoryCacheArr = {storyVideoMemoryCache, storyVideoMemoryCache2};
        $VALUES = storyVideoMemoryCacheArr;
        $ENTRIES = new asp(storyVideoMemoryCacheArr);
    }

    public StoryVideoMemoryCache() {
        throw null;
    }

    public static StoryVideoMemoryCache valueOf(String str) {
        return (StoryVideoMemoryCache) Enum.valueOf(StoryVideoMemoryCache.class, str);
    }

    public static StoryVideoMemoryCache[] values() {
        return (StoryVideoMemoryCache[]) $VALUES.clone();
    }
}
