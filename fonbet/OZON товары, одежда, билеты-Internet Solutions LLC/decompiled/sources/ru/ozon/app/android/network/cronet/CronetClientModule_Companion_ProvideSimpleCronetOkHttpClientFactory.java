package ru.ozon.app.android.network.cronet;

import Jb.e;
import Jb.j;
import We.E;

/* loaded from: classes12.dex */
public final class CronetClientModule_Companion_ProvideSimpleCronetOkHttpClientFactory implements e<E> {
    public static E provideSimpleCronetOkHttpClient(E e11, CronetOkHttpClientProvider cronetOkHttpClientProvider, CronetConfig cronetConfig) {
        E provideSimpleCronetOkHttpClient = CronetClientModule.INSTANCE.provideSimpleCronetOkHttpClient(e11, cronetOkHttpClientProvider, cronetConfig);
        j.d(provideSimpleCronetOkHttpClient);
        return provideSimpleCronetOkHttpClient;
    }
}
