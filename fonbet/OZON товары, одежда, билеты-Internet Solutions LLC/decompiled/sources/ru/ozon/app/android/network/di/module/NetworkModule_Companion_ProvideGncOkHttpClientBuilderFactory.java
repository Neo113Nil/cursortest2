package ru.ozon.app.android.network.di.module;

import Jb.e;
import Jb.j;
import Ld0.c;
import We.B;
import We.C4871m;
import We.C4876s;
import java.util.List;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.gnc.GncOkHttpClientBuilder;

/* loaded from: classes6.dex */
public final class NetworkModule_Companion_ProvideGncOkHttpClientBuilderFactory implements e<GncOkHttpClientBuilder> {
    public static GncOkHttpClientBuilder provideGncOkHttpClientBuilder(c cVar, C4871m c4871m, List<B> list, List<B> list2, C4876s c4876s, FeatureService featureService) {
        GncOkHttpClientBuilder provideGncOkHttpClientBuilder = NetworkModule.INSTANCE.provideGncOkHttpClientBuilder(cVar, c4871m, list, list2, c4876s, featureService);
        j.d(provideGncOkHttpClientBuilder);
        return provideGncOkHttpClientBuilder;
    }
}
