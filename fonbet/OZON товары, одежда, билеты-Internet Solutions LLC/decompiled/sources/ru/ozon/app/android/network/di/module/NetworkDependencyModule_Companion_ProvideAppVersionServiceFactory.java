package ru.ozon.app.android.network.di.module;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes6.dex */
public final class NetworkDependencyModule_Companion_ProvideAppVersionServiceFactory implements e<AppVersionService> {
    public static AppVersionService provideAppVersionService(AppType appType, AppVersionStorage appVersionStorage) {
        AppVersionService provideAppVersionService = NetworkDependencyModule.INSTANCE.provideAppVersionService(appType, appVersionStorage);
        j.d(provideAppVersionService);
        return provideAppVersionService;
    }
}
