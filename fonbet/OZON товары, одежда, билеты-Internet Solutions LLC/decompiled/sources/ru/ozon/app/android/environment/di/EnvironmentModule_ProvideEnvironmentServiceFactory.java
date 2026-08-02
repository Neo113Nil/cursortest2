package ru.ozon.app.android.environment.di;

import Jb.e;
import Jb.j;
import android.app.Application;
import ru.ozon.app.android.platform.flavor.FlavorType;
import ru.ozon.app.android.storage.environment.EnvironmentService;

/* loaded from: classes6.dex */
public final class EnvironmentModule_ProvideEnvironmentServiceFactory implements e<EnvironmentService> {
    public static EnvironmentService provideEnvironmentService(EnvironmentModule environmentModule, Application application, FlavorType flavorType) {
        EnvironmentService provideEnvironmentService = environmentModule.provideEnvironmentService(application, flavorType);
        j.d(provideEnvironmentService);
        return provideEnvironmentService;
    }
}
