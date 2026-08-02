package ru.ozon.app.android.network.di.module;

import Jb.e;
import Jb.j;
import We.B;
import java.util.List;

/* loaded from: classes6.dex */
public final class NetworkInterceptorsModule_Companion_ProvideMainInterceptorsFactory implements e<List<B>> {
    public static List<B> provideMainInterceptors(List<B> list, List<B> list2, List<B> list3) {
        List<B> provideMainInterceptors = NetworkInterceptorsModule.INSTANCE.provideMainInterceptors(list, list2, list3);
        j.d(provideMainInterceptors);
        return provideMainInterceptors;
    }
}
