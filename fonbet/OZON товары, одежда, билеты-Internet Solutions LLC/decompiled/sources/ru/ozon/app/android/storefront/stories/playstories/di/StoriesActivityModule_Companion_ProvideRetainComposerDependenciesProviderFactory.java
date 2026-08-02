package ru.ozon.app.android.storefront.stories.playstories.di;

import Jb.e;
import Jb.j;
import Pc.a;
import android.app.Application;
import java.util.Set;
import ru.ozon.app.android.composer.ComposerDependenciesProvider;
import ru.ozon.app.android.composer.di.Widget;

/* loaded from: classes2.dex */
public final class StoriesActivityModule_Companion_ProvideRetainComposerDependenciesProviderFactory implements e<ComposerDependenciesProvider> {
    private final a<Application> applicationProvider;
    private final a<Set<Widget>> widgetsProvider;

    public StoriesActivityModule_Companion_ProvideRetainComposerDependenciesProviderFactory(a<Application> aVar, a<Set<Widget>> aVar2) {
        this.applicationProvider = aVar;
        this.widgetsProvider = aVar2;
    }

    public static StoriesActivityModule_Companion_ProvideRetainComposerDependenciesProviderFactory create(a<Application> aVar, a<Set<Widget>> aVar2) {
        return new StoriesActivityModule_Companion_ProvideRetainComposerDependenciesProviderFactory(aVar, aVar2);
    }

    public static ComposerDependenciesProvider provideRetainComposerDependenciesProvider(Application application, Set<Widget> set) {
        ComposerDependenciesProvider provideRetainComposerDependenciesProvider = StoriesActivityModule.INSTANCE.provideRetainComposerDependenciesProvider(application, set);
        j.d(provideRetainComposerDependenciesProvider);
        return provideRetainComposerDependenciesProvider;
    }

    @Override // Pc.a
    public ComposerDependenciesProvider get() {
        return provideRetainComposerDependenciesProvider(this.applicationProvider.get(), this.widgetsProvider.get());
    }
}
