package ru.ozon.app.android.storefront.stories.playstories.di;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.composer.ComposerDependenciesProvider;
import ru.ozon.app.android.composer.references.ComposerReferencesFactory;

/* loaded from: classes2.dex */
public final class StoriesActivityModule_Companion_ProvideComposerReferencesProviderFactory implements e<ComposerReferencesFactory> {
    private final a<ComposerDependenciesProvider> composerDependenciesProvider;

    public StoriesActivityModule_Companion_ProvideComposerReferencesProviderFactory(a<ComposerDependenciesProvider> aVar) {
        this.composerDependenciesProvider = aVar;
    }

    public static StoriesActivityModule_Companion_ProvideComposerReferencesProviderFactory create(a<ComposerDependenciesProvider> aVar) {
        return new StoriesActivityModule_Companion_ProvideComposerReferencesProviderFactory(aVar);
    }

    public static ComposerReferencesFactory provideComposerReferencesProvider(ComposerDependenciesProvider composerDependenciesProvider) {
        ComposerReferencesFactory provideComposerReferencesProvider = StoriesActivityModule.INSTANCE.provideComposerReferencesProvider(composerDependenciesProvider);
        j.d(provideComposerReferencesProvider);
        return provideComposerReferencesProvider;
    }

    @Override // Pc.a
    public ComposerReferencesFactory get() {
        return provideComposerReferencesProvider(this.composerDependenciesProvider.get());
    }
}
