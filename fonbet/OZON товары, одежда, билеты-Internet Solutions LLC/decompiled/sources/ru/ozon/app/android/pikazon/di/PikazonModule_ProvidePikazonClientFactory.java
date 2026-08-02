package ru.ozon.app.android.pikazon.di;

import Jb.e;
import Jb.j;
import Ld0.c;
import We.E;
import We.InterfaceC4875q;
import ei0.InterfaceC6369b;
import ru.ozon.app.android.composer.network.cronet.ComposerCronetMetricsListener;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.cronet.CronetConfig;
import ru.ozon.app.android.network.cronet.CronetOkHttpClientProvider;
import ru.ozon.app.android.pikazon.PikazonUserAgentInterceptor;
import ru.ozon.app.android.pikazon.performance.PikazonEventListenerFactory;

/* loaded from: classes7.dex */
public final class PikazonModule_ProvidePikazonClientFactory implements e<E> {
    public static E providePikazonClient(PikazonModule pikazonModule, InterfaceC4875q interfaceC4875q, PikazonUserAgentInterceptor pikazonUserAgentInterceptor, PikazonEventListenerFactory pikazonEventListenerFactory, FeatureChecker featureChecker, CronetOkHttpClientProvider cronetOkHttpClientProvider, CronetConfig cronetConfig, ComposerCronetMetricsListener composerCronetMetricsListener, InterfaceC6369b interfaceC6369b, c cVar) {
        E providePikazonClient = pikazonModule.providePikazonClient(interfaceC4875q, pikazonUserAgentInterceptor, pikazonEventListenerFactory, featureChecker, cronetOkHttpClientProvider, cronetConfig, composerCronetMetricsListener, interfaceC6369b, cVar);
        j.d(providePikazonClient);
        return providePikazonClient;
    }
}
