package ru.ozon.app.android.network.di.module;

import Jb.e;
import Jb.j;
import We.E;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import ru.ozon.app.android.network.di.NetworkComponentConfig;

/* loaded from: classes6.dex */
public final class NetworkModule_Companion_ProvideMoshiRetrofitFactory implements e<Retrofit> {
    public static Retrofit provideMoshiRetrofit(NetworkComponentConfig networkComponentConfig, E e11, CallAdapter.Factory factory, ScalarsConverterFactory scalarsConverterFactory, MoshiConverterFactory moshiConverterFactory) {
        Retrofit provideMoshiRetrofit = NetworkModule.INSTANCE.provideMoshiRetrofit(networkComponentConfig, e11, factory, scalarsConverterFactory, moshiConverterFactory);
        j.d(provideMoshiRetrofit);
        return provideMoshiRetrofit;
    }
}
