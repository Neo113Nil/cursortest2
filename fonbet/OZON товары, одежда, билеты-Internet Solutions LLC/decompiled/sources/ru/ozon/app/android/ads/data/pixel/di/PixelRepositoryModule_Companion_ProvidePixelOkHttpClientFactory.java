package ru.ozon.app.android.ads.data.pixel.di;

import Jb.e;
import Jb.j;
import Ld0.c;
import Pc.a;
import We.E;
import We.InterfaceC4875q;
import ru.ozon.app.android.ads.data.pixel.PixelHeadersInterceptor;
import ru.ozon.app.android.network.abtool.FeatureChecker;

/* loaded from: classes6.dex */
public final class PixelRepositoryModule_Companion_ProvidePixelOkHttpClientFactory implements e<E> {
    private final a<InterfaceC4875q> cookieJarProvider;
    private final a<FeatureChecker> featureCheckerProvider;
    private final a<PixelHeadersInterceptor> interceptorProvider;
    private final a<c> ozonLimbDiStoreProvider;

    public PixelRepositoryModule_Companion_ProvidePixelOkHttpClientFactory(a<PixelHeadersInterceptor> aVar, a<InterfaceC4875q> aVar2, a<FeatureChecker> aVar3, a<c> aVar4) {
        this.interceptorProvider = aVar;
        this.cookieJarProvider = aVar2;
        this.featureCheckerProvider = aVar3;
        this.ozonLimbDiStoreProvider = aVar4;
    }

    public static PixelRepositoryModule_Companion_ProvidePixelOkHttpClientFactory create(a<PixelHeadersInterceptor> aVar, a<InterfaceC4875q> aVar2, a<FeatureChecker> aVar3, a<c> aVar4) {
        return new PixelRepositoryModule_Companion_ProvidePixelOkHttpClientFactory(aVar, aVar2, aVar3, aVar4);
    }

    public static E providePixelOkHttpClient(PixelHeadersInterceptor pixelHeadersInterceptor, InterfaceC4875q interfaceC4875q, FeatureChecker featureChecker, c cVar) {
        E providePixelOkHttpClient = PixelRepositoryModule.INSTANCE.providePixelOkHttpClient(pixelHeadersInterceptor, interfaceC4875q, featureChecker, cVar);
        j.d(providePixelOkHttpClient);
        return providePixelOkHttpClient;
    }

    @Override // Pc.a
    public E get() {
        return providePixelOkHttpClient(this.interceptorProvider.get(), this.cookieJarProvider.get(), this.featureCheckerProvider.get(), this.ozonLimbDiStoreProvider.get());
    }
}
