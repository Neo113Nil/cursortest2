package ru.ozon.app.android.storefront.screens.about;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.location.ComposerLocationRepository;

/* loaded from: classes2.dex */
public final class AboutViewModelImpl_Factory implements e<AboutViewModelImpl> {
    private final a<ComposerLocationRepository> composerLocationRepositoryProvider;

    public AboutViewModelImpl_Factory(a<ComposerLocationRepository> aVar) {
        this.composerLocationRepositoryProvider = aVar;
    }

    public static AboutViewModelImpl_Factory create(a<ComposerLocationRepository> aVar) {
        return new AboutViewModelImpl_Factory(aVar);
    }

    public static AboutViewModelImpl newInstance(ComposerLocationRepository composerLocationRepository) {
        return new AboutViewModelImpl(composerLocationRepository);
    }

    @Override // Pc.a
    public AboutViewModelImpl get() {
        return newInstance(this.composerLocationRepositoryProvider.get());
    }
}
