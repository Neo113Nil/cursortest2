package ru.ozon.app.android.storefront.stories.playstories.di;

import Jb.e;
import Jb.j;
import K00.i;
import Pc.a;
import ru.ozon.app.android.composer.ComposerDependenciesProvider;
import ru.ozon.composer.ui.widget.l;

/* loaded from: classes2.dex */
public final class StoriesActivityModule_Companion_ProvideComposerRepositoryFactory implements e<i<l>> {
    private final a<ComposerDependenciesProvider> composerDependenciesProvider;

    public StoriesActivityModule_Companion_ProvideComposerRepositoryFactory(a<ComposerDependenciesProvider> aVar) {
        this.composerDependenciesProvider = aVar;
    }

    public static StoriesActivityModule_Companion_ProvideComposerRepositoryFactory create(a<ComposerDependenciesProvider> aVar) {
        return new StoriesActivityModule_Companion_ProvideComposerRepositoryFactory(aVar);
    }

    public static i<l> provideComposerRepository(ComposerDependenciesProvider composerDependenciesProvider) {
        i<l> provideComposerRepository = StoriesActivityModule.INSTANCE.provideComposerRepository(composerDependenciesProvider);
        j.d(provideComposerRepository);
        return provideComposerRepository;
    }

    @Override // Pc.a
    public i<l> get() {
        return provideComposerRepository(this.composerDependenciesProvider.get());
    }
}
