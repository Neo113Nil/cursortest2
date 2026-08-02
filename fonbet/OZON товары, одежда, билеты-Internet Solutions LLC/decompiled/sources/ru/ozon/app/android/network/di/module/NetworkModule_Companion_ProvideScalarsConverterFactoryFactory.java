package ru.ozon.app.android.network.di.module;

import Jb.e;
import Jb.j;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/* loaded from: classes6.dex */
public final class NetworkModule_Companion_ProvideScalarsConverterFactoryFactory implements e<ScalarsConverterFactory> {
    public static ScalarsConverterFactory provideScalarsConverterFactory() {
        ScalarsConverterFactory provideScalarsConverterFactory = NetworkModule.INSTANCE.provideScalarsConverterFactory();
        j.d(provideScalarsConverterFactory);
        return provideScalarsConverterFactory;
    }
}
