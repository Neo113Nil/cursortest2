package ru.ozon.app.android.composer.di.modules;

import Jb.e;
import Jb.j;
import We.B;
import We.C4862d;
import We.E;
import We.InterfaceC4875q;
import ei0.InterfaceC6369b;
import ru.ozon.app.android.composer.network.cronet.ComposerCronetMetricsListener;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.cronet.CronetConfig;
import ru.ozon.app.android.network.cronet.CronetEventListenerFactory;
import ru.ozon.app.android.network.cronet.CronetOkHttpClientProvider;

/* loaded from: classes6.dex */
public final class ComposerNetworkModule_Companion_ProvideOkHttpClientFactory implements e<E> {
    public static E provideOkHttpClient(FeatureChecker featureChecker, OkHttpClientProvider okHttpClientProvider, CronetOkHttpClientProvider cronetOkHttpClientProvider, InterfaceC4875q interfaceC4875q, CronetEventListenerFactory cronetEventListenerFactory, CronetConfig cronetConfig, C4862d c4862d, B b11, ComposerCronetMetricsListener composerCronetMetricsListener, InterfaceC6369b interfaceC6369b) {
        E provideOkHttpClient = ComposerNetworkModule.INSTANCE.provideOkHttpClient(featureChecker, okHttpClientProvider, cronetOkHttpClientProvider, interfaceC4875q, cronetEventListenerFactory, cronetConfig, c4862d, b11, composerCronetMetricsListener, interfaceC6369b);
        j.d(provideOkHttpClient);
        return provideOkHttpClient;
    }
}
