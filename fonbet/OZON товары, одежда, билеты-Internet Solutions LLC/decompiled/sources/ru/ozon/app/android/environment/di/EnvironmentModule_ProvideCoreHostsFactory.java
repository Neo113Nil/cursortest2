package ru.ozon.app.android.environment.di;

import Ib.a;
import Jb.e;
import Jb.j;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.storage.hosts.CoreHosts;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes6.dex */
public final class EnvironmentModule_ProvideCoreHostsFactory implements e<CoreHosts> {
    public static CoreHosts provideCoreHosts(EnvironmentModule environmentModule, a<EnvironmentService> aVar, AppType appType) {
        CoreHosts provideCoreHosts = environmentModule.provideCoreHosts(aVar, appType);
        j.d(provideCoreHosts);
        return provideCoreHosts;
    }
}
