package ru.ozon.app.android.network.di.module;

import Jb.e;
import Jb.j;
import We.B;
import java.util.List;

/* loaded from: classes6.dex */
public final class NetworkInterceptorsModule_Companion_ProvideNetworkInterceptorsFactory implements e<List<B>> {
    public static List<B> provideNetworkInterceptors(B b11, List<B> list, B b12) {
        List<B> provideNetworkInterceptors = NetworkInterceptorsModule.INSTANCE.provideNetworkInterceptors(b11, list, b12);
        j.d(provideNetworkInterceptors);
        return provideNetworkInterceptors;
    }
}
