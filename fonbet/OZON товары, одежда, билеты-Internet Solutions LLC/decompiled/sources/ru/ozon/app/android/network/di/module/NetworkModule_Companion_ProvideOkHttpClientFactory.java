package ru.ozon.app.android.network.di.module;

import Jb.e;
import Jb.j;
import We.E;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.module.NetworkModule;

/* loaded from: classes12.dex */
public final class NetworkModule_Companion_ProvideOkHttpClientFactory implements e<E> {
    public static E provideOkHttpClient(FeatureService featureService, NetworkModule.Companion.OkHttpClientParams okHttpClientParams) {
        E provideOkHttpClient = NetworkModule.INSTANCE.provideOkHttpClient(featureService, okHttpClientParams);
        j.d(provideOkHttpClient);
        return provideOkHttpClient;
    }
}
