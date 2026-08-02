package ru.ozon.app.android.environment.di;

import Jb.e;
import Jb.j;
import android.content.Context;
import ru.ozon.app.android.navigation.NativePageDomainsInteractor;

/* loaded from: classes6.dex */
public final class EnvironmentModule_ProvideNativePageDomainsInteractorFactory implements e<NativePageDomainsInteractor> {
    public static NativePageDomainsInteractor provideNativePageDomainsInteractor(EnvironmentModule environmentModule, Context context) {
        NativePageDomainsInteractor provideNativePageDomainsInteractor = environmentModule.provideNativePageDomainsInteractor(context);
        j.d(provideNativePageDomainsInteractor);
        return provideNativePageDomainsInteractor;
    }
}
