package ru.ozon.app.android.network.cronet;

import Jb.e;
import Jb.j;
import We.E;
import ru.ozon.app.android.network.abtool.FeatureService;

/* loaded from: classes12.dex */
public final class CronetClientModule_Companion_ProvideSimpleOkHttpClientFactory implements e<E> {
    public static E provideSimpleOkHttpClient(FeatureService featureService) {
        E provideSimpleOkHttpClient = CronetClientModule.INSTANCE.provideSimpleOkHttpClient(featureService);
        j.d(provideSimpleOkHttpClient);
        return provideSimpleOkHttpClient;
    }
}
