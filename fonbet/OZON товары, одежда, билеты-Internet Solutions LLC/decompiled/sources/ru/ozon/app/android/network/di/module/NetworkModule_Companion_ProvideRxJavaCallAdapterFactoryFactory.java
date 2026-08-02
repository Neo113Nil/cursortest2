package ru.ozon.app.android.network.di.module;

import Jb.e;
import Jb.j;
import retrofit2.CallAdapter;

/* loaded from: classes6.dex */
public final class NetworkModule_Companion_ProvideRxJavaCallAdapterFactoryFactory implements e<CallAdapter.Factory> {
    public static CallAdapter.Factory provideRxJavaCallAdapterFactory() {
        CallAdapter.Factory provideRxJavaCallAdapterFactory = NetworkModule.INSTANCE.provideRxJavaCallAdapterFactory();
        j.d(provideRxJavaCallAdapterFactory);
        return provideRxJavaCallAdapterFactory;
    }
}
