package ru.ozon.app.android.environment.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.storage.hosts.CoreHosts;

/* loaded from: classes6.dex */
public final class EnvironmentModule_ProvideAppDomainFactory implements e<Fb0.e> {
    public static Fb0.e provideAppDomain(EnvironmentModule environmentModule, CoreHosts coreHosts) {
        Fb0.e provideAppDomain = environmentModule.provideAppDomain(coreHosts);
        j.d(provideAppDomain);
        return provideAppDomain;
    }
}
