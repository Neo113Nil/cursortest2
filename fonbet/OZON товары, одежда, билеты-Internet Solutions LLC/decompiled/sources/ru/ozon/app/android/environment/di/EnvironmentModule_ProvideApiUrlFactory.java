package ru.ozon.app.android.environment.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.di.component.BaseApiUrlProvider;

/* loaded from: classes6.dex */
public final class EnvironmentModule_ProvideApiUrlFactory implements e<String> {
    public static String provideApiUrl(EnvironmentModule environmentModule, BaseApiUrlProvider baseApiUrlProvider) {
        String provideApiUrl = environmentModule.provideApiUrl(baseApiUrlProvider);
        j.d(provideApiUrl);
        return provideApiUrl;
    }
}
