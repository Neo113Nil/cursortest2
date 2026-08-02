package ru.ozon.app.android.di.module;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.storage.di.StorageComponentConfig;

/* loaded from: classes6.dex */
public final class ApplicationModule_ProvideStorageComponentConfigFactory implements e<StorageComponentConfig> {
    public static StorageComponentConfig provideStorageComponentConfig(ApplicationModule applicationModule) {
        StorageComponentConfig provideStorageComponentConfig = applicationModule.provideStorageComponentConfig();
        j.d(provideStorageComponentConfig);
        return provideStorageComponentConfig;
    }
}
