package ru.ozon.app.android.storefront.stories.story.presentation.media;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.storefront.stories.story.cache.StoryImageMemoryCache;
import ru.ozon.app.android.video.player.soundservice.SoundController;

/* loaded from: classes2.dex */
public final class StoryMediaViewModel_Factory implements e<StoryMediaViewModel> {
    private final a<StoryImageMemoryCache> imageMemoryCacheProvider;
    private final a<SoundController> soundControllerProvider;

    public StoryMediaViewModel_Factory(a<StoryImageMemoryCache> aVar, a<SoundController> aVar2) {
        this.imageMemoryCacheProvider = aVar;
        this.soundControllerProvider = aVar2;
    }

    public static StoryMediaViewModel_Factory create(a<StoryImageMemoryCache> aVar, a<SoundController> aVar2) {
        return new StoryMediaViewModel_Factory(aVar, aVar2);
    }

    public static StoryMediaViewModel newInstance(StoryImageMemoryCache storyImageMemoryCache, SoundController soundController) {
        return new StoryMediaViewModel(storyImageMemoryCache, soundController);
    }

    @Override // Pc.a
    public StoryMediaViewModel get() {
        return newInstance(this.imageMemoryCacheProvider.get(), this.soundControllerProvider.get());
    }
}
