package ru.ozon.app.android.environment.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.di.component.BaseApiUrlProvider;
import ru.ozon.app.android.storage.hosts.CoreHosts;

/* loaded from: classes6.dex */
public final class EnvironmentModule_ProvideBaseUrlProviderFactory implements e<BaseApiUrlProvider> {
    public static BaseApiUrlProvider provideBaseUrlProvider(EnvironmentModule environmentModule, CoreHosts coreHosts) {
        BaseApiUrlProvider provideBaseUrlProvider = environmentModule.provideBaseUrlProvider(coreHosts);
        j.d(provideBaseUrlProvider);
        return provideBaseUrlProvider;
    }
}
