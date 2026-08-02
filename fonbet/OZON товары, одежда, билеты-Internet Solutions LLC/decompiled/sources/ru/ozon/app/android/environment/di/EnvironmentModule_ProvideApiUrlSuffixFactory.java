package ru.ozon.app.android.environment.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.storage.hosts.CoreHosts;

/* loaded from: classes6.dex */
public final class EnvironmentModule_ProvideApiUrlSuffixFactory implements e<String> {
    public static String provideApiUrlSuffix(EnvironmentModule environmentModule, CoreHosts coreHosts) {
        String provideApiUrlSuffix = environmentModule.provideApiUrlSuffix(coreHosts);
        j.d(provideApiUrlSuffix);
        return provideApiUrlSuffix;
    }
}
