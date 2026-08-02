package ru.ozon.app.android.fresh.navigation.di.modules;

import Jb.e;
import Jb.j;
import Pc.a;
import android.content.Context;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;

/* loaded from: classes6.dex */
public final class FreshNavigationModule_Companion_ProvideDispatcherProviderFactory implements e<CoroutineDispatcherProvider> {
    private final a<Context> contextProvider;

    public FreshNavigationModule_Companion_ProvideDispatcherProviderFactory(a<Context> aVar) {
        this.contextProvider = aVar;
    }

    public static FreshNavigationModule_Companion_ProvideDispatcherProviderFactory create(a<Context> aVar) {
        return new FreshNavigationModule_Companion_ProvideDispatcherProviderFactory(aVar);
    }

    public static CoroutineDispatcherProvider provideDispatcherProvider(Context context) {
        CoroutineDispatcherProvider provideDispatcherProvider = FreshNavigationModule.INSTANCE.provideDispatcherProvider(context);
        j.d(provideDispatcherProvider);
        return provideDispatcherProvider;
    }

    @Override // Pc.a
    public CoroutineDispatcherProvider get() {
        return provideDispatcherProvider(this.contextProvider.get());
    }
}
