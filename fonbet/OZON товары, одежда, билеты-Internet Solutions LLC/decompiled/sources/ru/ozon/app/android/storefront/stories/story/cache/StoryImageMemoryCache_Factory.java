package ru.ozon.app.android.storefront.stories.story.cache;

import Jb.e;

/* loaded from: classes2.dex */
public final class StoryImageMemoryCache_Factory implements e<StoryImageMemoryCache> {

    private static final class InstanceHolder {
        private static final StoryImageMemoryCache_Factory INSTANCE = new StoryImageMemoryCache_Factory();
    }

    public static StoryImageMemoryCache_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static StoryImageMemoryCache newInstance() {
        return new StoryImageMemoryCache();
    }

    @Override // Pc.a
    public StoryImageMemoryCache get() {
        return newInstance();
    }
}
