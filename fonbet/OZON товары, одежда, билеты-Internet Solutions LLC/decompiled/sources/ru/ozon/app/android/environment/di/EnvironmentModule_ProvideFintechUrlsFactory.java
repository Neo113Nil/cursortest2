package ru.ozon.app.android.environment.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.storage.hosts.CoreHosts;
import ru.ozon.app.android.storage.hosts.FintechUrls;

/* loaded from: classes6.dex */
public final class EnvironmentModule_ProvideFintechUrlsFactory implements e<FintechUrls> {
    public static FintechUrls provideFintechUrls(EnvironmentModule environmentModule, CoreHosts coreHosts) {
        FintechUrls provideFintechUrls = environmentModule.provideFintechUrls(coreHosts);
        j.d(provideFintechUrls);
        return provideFintechUrls;
    }
}
