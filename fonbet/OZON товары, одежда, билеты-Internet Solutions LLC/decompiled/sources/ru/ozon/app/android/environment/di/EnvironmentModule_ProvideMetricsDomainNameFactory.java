package ru.ozon.app.android.environment.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.storage.hosts.CoreHosts;

/* loaded from: classes6.dex */
public final class EnvironmentModule_ProvideMetricsDomainNameFactory implements e<String> {
    public static String provideMetricsDomainName(EnvironmentModule environmentModule, CoreHosts coreHosts) {
        String provideMetricsDomainName = environmentModule.provideMetricsDomainName(coreHosts);
        j.d(provideMetricsDomainName);
        return provideMetricsDomainName;
    }
}
