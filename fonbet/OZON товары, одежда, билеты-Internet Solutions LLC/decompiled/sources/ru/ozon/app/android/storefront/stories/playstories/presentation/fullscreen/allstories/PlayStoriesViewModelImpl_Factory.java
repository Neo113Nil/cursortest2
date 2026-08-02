package ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories;

import Jb.e;
import K00.i;
import Pc.a;
import ru.ozon.app.android.composer.references.ComposerReferencesFactory;
import ru.ozon.composer.ui.widget.l;

/* loaded from: classes2.dex */
public final class PlayStoriesViewModelImpl_Factory implements e<PlayStoriesViewModelImpl> {
    private final a<ComposerReferencesFactory> composerReferencesFactoryProvider;
    private final a<i<l>> composerRepositoryProvider;

    public PlayStoriesViewModelImpl_Factory(a<i<l>> aVar, a<ComposerReferencesFactory> aVar2) {
        this.composerRepositoryProvider = aVar;
        this.composerReferencesFactoryProvider = aVar2;
    }

    public static PlayStoriesViewModelImpl_Factory create(a<i<l>> aVar, a<ComposerReferencesFactory> aVar2) {
        return new PlayStoriesViewModelImpl_Factory(aVar, aVar2);
    }

    public static PlayStoriesViewModelImpl newInstance(i<l> iVar, ComposerReferencesFactory composerReferencesFactory) {
        return new PlayStoriesViewModelImpl(iVar, composerReferencesFactory);
    }

    @Override // Pc.a
    public PlayStoriesViewModelImpl get() {
        return newInstance(this.composerRepositoryProvider.get(), this.composerReferencesFactoryProvider.get());
    }
}
