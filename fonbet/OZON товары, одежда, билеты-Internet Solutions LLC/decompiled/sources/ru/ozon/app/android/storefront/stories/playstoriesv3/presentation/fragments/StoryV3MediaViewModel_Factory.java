package ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.storefront.stories.story.cache.StoryImageMemoryCache;
import ru.ozon.app.android.video.player.soundservice.SoundController;

/* loaded from: classes2.dex */
public final class StoryV3MediaViewModel_Factory implements e<StoryV3MediaViewModel> {
    private final a<StoryImageMemoryCache> imageMemoryCacheProvider;
    private final a<SoundController> soundControllerProvider;

    public StoryV3MediaViewModel_Factory(a<StoryImageMemoryCache> aVar, a<SoundController> aVar2) {
        this.imageMemoryCacheProvider = aVar;
        this.soundControllerProvider = aVar2;
    }

    public static StoryV3MediaViewModel_Factory create(a<StoryImageMemoryCache> aVar, a<SoundController> aVar2) {
        return new StoryV3MediaViewModel_Factory(aVar, aVar2);
    }

    public static StoryV3MediaViewModel newInstance(StoryImageMemoryCache storyImageMemoryCache, SoundController soundController) {
        return new StoryV3MediaViewModel(storyImageMemoryCache, soundController);
    }

    @Override // Pc.a
    public StoryV3MediaViewModel get() {
        return newInstance(this.imageMemoryCacheProvider.get(), this.soundControllerProvider.get());
    }
}
