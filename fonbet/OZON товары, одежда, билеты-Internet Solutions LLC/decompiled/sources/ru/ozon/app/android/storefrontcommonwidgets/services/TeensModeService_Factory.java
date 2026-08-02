package ru.ozon.app.android.storefrontcommonwidgets.services;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.composer.network.cache.ComposerCacheService;
import ru.ozon.app.android.storage.teensMode.TeensModeStorage;

/* loaded from: classes7.dex */
public final class TeensModeService_Factory implements e<TeensModeService> {
    private final a<ComposerCacheService> composerCacheServiceProvider;
    private final a<TeensModeStorage> teensModeStorageProvider;

    public TeensModeService_Factory(a<TeensModeStorage> aVar, a<ComposerCacheService> aVar2) {
        this.teensModeStorageProvider = aVar;
        this.composerCacheServiceProvider = aVar2;
    }

    public static TeensModeService_Factory create(a<TeensModeStorage> aVar, a<ComposerCacheService> aVar2) {
        return new TeensModeService_Factory(aVar, aVar2);
    }

    public static TeensModeService newInstance(TeensModeStorage teensModeStorage, ComposerCacheService composerCacheService) {
        return new TeensModeService(teensModeStorage, composerCacheService);
    }

    @Override // Pc.a
    public TeensModeService get() {
        return newInstance(this.teensModeStorageProvider.get(), this.composerCacheServiceProvider.get());
    }
}
