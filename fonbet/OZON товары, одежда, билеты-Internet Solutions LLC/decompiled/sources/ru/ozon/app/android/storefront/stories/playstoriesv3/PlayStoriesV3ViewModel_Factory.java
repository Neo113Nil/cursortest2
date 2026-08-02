package ru.ozon.app.android.storefront.stories.playstoriesv3;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.StoryV3UpdateStore;

/* loaded from: classes2.dex */
public final class PlayStoriesV3ViewModel_Factory implements e<PlayStoriesV3ViewModel> {
    private final a<StoryV3UpdateStore> updateStoreProvider;

    public PlayStoriesV3ViewModel_Factory(a<StoryV3UpdateStore> aVar) {
        this.updateStoreProvider = aVar;
    }

    public static PlayStoriesV3ViewModel_Factory create(a<StoryV3UpdateStore> aVar) {
        return new PlayStoriesV3ViewModel_Factory(aVar);
    }

    public static PlayStoriesV3ViewModel newInstance(StoryV3UpdateStore storyV3UpdateStore) {
        return new PlayStoriesV3ViewModel(storyV3UpdateStore);
    }

    @Override // Pc.a
    public PlayStoriesV3ViewModel get() {
        return newInstance(this.updateStoreProvider.get());
    }
}
