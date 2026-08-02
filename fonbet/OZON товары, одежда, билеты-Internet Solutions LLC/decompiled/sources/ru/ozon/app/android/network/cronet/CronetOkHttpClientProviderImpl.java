package ru.ozon.app.android.network.cronet;

import Ib.a;
import We.B;
import We.C4862d;
import We.E;
import We.InterfaceC4875q;
import af.C5011a;
import ef.C6351a;
import ef.C6359i;
import ei0.InterfaceC6369b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.auth.flags.H3CheckEnabled;
import ru.ozon.app.android.network.cronet.metrics.BaseCronetMetricsListener;
import ru.ozon.app.android.network.cronet.metrics.CronetMetricListenersManager;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJI\u0010\u001c\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJY\u0010\"\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010'R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/network/cronet/CronetOkHttpClientProviderImpl;", "Lru/ozon/app/android/network/cronet/CronetOkHttpClientProvider;", "Lru/ozon/app/android/network/cronet/CronetPrefs;", "cronetPrefs", "Lru/ozon/app/android/network/cronet/metrics/CronetMetricListenersManager;", "cronetMetricListenersManager", "LIb/a;", "Lru/ozon/app/android/network/cronet/CronetClient;", "cronetClient", "Lru/ozon/app/android/network/cronet/CronetQuicChecker;", "cronetQuicChecker", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "<init>", "(Lru/ozon/app/android/network/cronet/CronetPrefs;Lru/ozon/app/android/network/cronet/metrics/CronetMetricListenersManager;LIb/a;Lru/ozon/app/android/network/cronet/CronetQuicChecker;Lru/ozon/app/android/network/abtool/FeatureService;)V", "LWe/E$a;", "LWe/E;", "okHttpClient", "Lru/ozon/app/android/network/cronet/CronetConfig;", "cronetConfig", "LWe/q;", "clientCookieJar", "LWe/d;", "clientCache", "LWe/B;", "encodingInterceptor", "Lei0/b;", "ozonTracker", "changeInterceptors", "(LWe/E$a;LWe/E;Lru/ozon/app/android/network/cronet/CronetConfig;LWe/q;LWe/d;LWe/B;Lei0/b;)LWe/E$a;", "Lru/ozon/app/android/network/cronet/metrics/BaseCronetMetricsListener;", "metricListener", "Lru/ozon/app/android/network/cronet/CronetEventListenerFactory;", "cronetEventListenerFactory", "provide", "(LWe/E;Lru/ozon/app/android/network/cronet/CronetConfig;LWe/q;LWe/d;LWe/B;Lru/ozon/app/android/network/cronet/metrics/BaseCronetMetricsListener;Lru/ozon/app/android/network/cronet/CronetEventListenerFactory;Lei0/b;)LWe/E;", "Lru/ozon/app/android/network/cronet/CronetPrefs;", "Lru/ozon/app/android/network/cronet/metrics/CronetMetricListenersManager;", "LIb/a;", "Lru/ozon/app/android/network/cronet/CronetQuicChecker;", "Lru/ozon/app/android/network/abtool/FeatureService;", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CronetOkHttpClientProviderImpl implements CronetOkHttpClientProvider {

    @NotNull
    private final a<CronetClient> cronetClient;

    @NotNull
    private final CronetMetricListenersManager cronetMetricListenersManager;

    @NotNull
    private final CronetPrefs cronetPrefs;

    @NotNull
    private final CronetQuicChecker cronetQuicChecker;

    @NotNull
    private final FeatureService featureService;

    public CronetOkHttpClientProviderImpl(@NotNull CronetPrefs cronetPrefs, @NotNull CronetMetricListenersManager cronetMetricListenersManager, @NotNull a<CronetClient> cronetClient, @NotNull CronetQuicChecker cronetQuicChecker, @NotNull FeatureService featureService) {
        Intrinsics.checkNotNullParameter(cronetPrefs, "cronetPrefs");
        Intrinsics.checkNotNullParameter(cronetMetricListenersManager, "cronetMetricListenersManager");
        Intrinsics.checkNotNullParameter(cronetClient, "cronetClient");
        Intrinsics.checkNotNullParameter(cronetQuicChecker, "cronetQuicChecker");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.cronetPrefs = cronetPrefs;
        this.cronetMetricListenersManager = cronetMetricListenersManager;
        this.cronetClient = cronetClient;
        this.cronetQuicChecker = cronetQuicChecker;
        this.featureService = featureService;
    }

    private final E.a changeInterceptors(E.a aVar, E e11, CronetConfig cronetConfig, InterfaceC4875q interfaceC4875q, C4862d c4862d, B b11, InterfaceC6369b interfaceC6369b) {
        if (b11 != null) {
            aVar.S().remove(b11);
        }
        aVar.a(new C6359i(e11));
        aVar.a(new C6351a(interfaceC4875q));
        if (c4862d != null) {
            aVar.a(new CronetAdaptUrlForCacheInterceptor(true));
            aVar.a(new C5011a(c4862d));
            aVar.a(new CronetAdaptUrlForCacheInterceptor(false));
        }
        aVar.S().addAll(aVar.T());
        aVar.T().clear();
        aVar.a(new CronetInterceptor(this.cronetClient, cronetConfig, this.cronetQuicChecker, this.featureService, interfaceC6369b));
        return aVar;
    }

    @Override // ru.ozon.app.android.network.cronet.CronetOkHttpClientProvider
    @NotNull
    public E provide(@NotNull E okHttpClient, @NotNull CronetConfig cronetConfig, @NotNull InterfaceC4875q clientCookieJar, C4862d clientCache, B encodingInterceptor, BaseCronetMetricsListener metricListener, CronetEventListenerFactory cronetEventListenerFactory, InterfaceC6369b ozonTracker) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(cronetConfig, "cronetConfig");
        Intrinsics.checkNotNullParameter(clientCookieJar, "clientCookieJar");
        if (!this.featureService.getBooleanKey(H3CheckEnabled.INSTANCE) || !this.cronetPrefs.shouldFallbackToH2()) {
            if (metricListener != null) {
                try {
                    this.cronetMetricListenersManager.add(metricListener);
                } catch (Throwable th2) {
                    Lm0.a.f17149a.e(th2, "Cronet client init fail!", new Object[0]);
                }
            }
            okHttpClient.getClass();
            E.a changeInterceptors = changeInterceptors(new E.a(okHttpClient), okHttpClient, cronetConfig, clientCookieJar, clientCache, encodingInterceptor, ozonTracker);
            if (cronetEventListenerFactory != null) {
                changeInterceptors.k(cronetEventListenerFactory);
            }
            changeInterceptors.getClass();
            return new E(changeInterceptors);
        }
        return okHttpClient;
    }
}
