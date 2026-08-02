package ru.ozon.app.android.network.di.module;

import Jb.e;
import Jb.j;
import com.squareup.moshi.Moshi;
import retrofit2.converter.moshi.MoshiConverterFactory;

/* loaded from: classes6.dex */
public final class NetworkModule_Companion_ProvideMoshiConverterFactoryFactory implements e<MoshiConverterFactory> {
    public static MoshiConverterFactory provideMoshiConverterFactory(Moshi moshi) {
        MoshiConverterFactory provideMoshiConverterFactory = NetworkModule.INSTANCE.provideMoshiConverterFactory(moshi);
        j.d(provideMoshiConverterFactory);
        return provideMoshiConverterFactory;
    }
}
