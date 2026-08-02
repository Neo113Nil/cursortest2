package ru.ozon.app.android.storefront.stories.story.presentation.poll;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.storefront.stories.story.cache.StoryImageMemoryCache;

/* loaded from: classes2.dex */
public final class StoryPollViewModel_Factory implements e<StoryPollViewModel> {
    private final a<StoryImageMemoryCache> imageMemoryCacheProvider;

    public StoryPollViewModel_Factory(a<StoryImageMemoryCache> aVar) {
        this.imageMemoryCacheProvider = aVar;
    }

    public static StoryPollViewModel_Factory create(a<StoryImageMemoryCache> aVar) {
        return new StoryPollViewModel_Factory(aVar);
    }

    public static StoryPollViewModel newInstance(StoryImageMemoryCache storyImageMemoryCache) {
        return new StoryPollViewModel(storyImageMemoryCache);
    }

    @Override // Pc.a
    public StoryPollViewModel get() {
        return newInstance(this.imageMemoryCacheProvider.get());
    }
}
