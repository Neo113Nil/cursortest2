package ru.ozon.app.android.composer.di.modules;

import K00.a;
import L00.d;
import L00.f;
import O00.b;
import Qj0.D;
import Qj0.H;
import S00.e;
import We.B;
import We.C4862d;
import We.E;
import We.InterfaceC4875q;
import android.app.Application;
import ei0.InterfaceC6369b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qj.C9067a;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.composer.di.modules.ComposerNetworkModule;
import ru.ozon.app.android.composer.domain.api.ComposerApiImpl;
import ru.ozon.app.android.composer.domain.api.ComposerJsonDeserializer;
import ru.ozon.app.android.composer.domain.api.ComposerJsonSerializer;
import ru.ozon.app.android.composer.domain.cache.ComposerCache;
import ru.ozon.app.android.composer.flags.IsTrackinOnParsingEnabled;
import ru.ozon.app.android.composer.network.cronet.ComposerCronetHttpMetricsKey;
import ru.ozon.app.android.composer.network.cronet.ComposerCronetMetricsListener;
import ru.ozon.app.android.composer.network.prefetch.PrefetchEventInterceptor;
import ru.ozon.app.android.composer.network.redirect.ComposerRedirectListener;
import ru.ozon.app.android.composer.tracker.ComposerNetworkMetricsProvider;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.abtool.OnChangeFeatureListener;
import ru.ozon.app.android.network.auth.flags.CronetEnabled;
import ru.ozon.app.android.network.cronet.CronetConfig;
import ru.ozon.app.android.network.cronet.CronetEventListenerFactory;
import ru.ozon.app.android.network.cronet.CronetOkHttpClientProvider;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.network.flags.BxSdkOzonNetworkEnabledFlag;
import ru.ozon.app.android.network.gnc.GncOkHttpClientBuilder;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/composer/di/modules/ComposerNetworkModule;", "", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ComposerNetworkModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJa\u0010+\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020&2\b\b\u0001\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b+\u0010,Jq\u0010<\u001a\u00020;2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u0002082\u0006\u0010'\u001a\u00020:2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020?2\u0006\u0010>\u001a\u00020;H\u0007¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020B2\u0006\u0010>\u001a\u00020;H\u0007¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020E2\u0006\u0010>\u001a\u00020;H\u0007¢\u0006\u0004\bF\u0010G¨\u0006H"}, d2 = {"Lru/ozon/app/android/composer/di/modules/ComposerNetworkModule$Companion;", "", "<init>", "()V", "LWe/E;", "client", "Landroid/app/Application;", "application", "Lru/ozon/app/android/network/gnc/GncOkHttpClientBuilder;", "gncOkHttpClientBuilder", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "configureClientForAsyncWidgets", "(LWe/E;Landroid/app/Application;Lru/ozon/app/android/network/gnc/GncOkHttpClientBuilder;Lru/ozon/app/android/network/abtool/FeatureService;)LWe/E;", "Lru/ozon/app/android/network/cronet/CronetConfig;", "providerCronetConfig", "()Lru/ozon/app/android/network/cronet/CronetConfig;", "Lqj/a;", "networkInfoProvider", "Lei0/b;", "ozonTracker", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "Lru/ozon/app/android/composer/network/prefetch/PrefetchEventInterceptor;", "prefetchEventInterceptor", "cronetConfig", "Lru/ozon/app/android/composer/network/cronet/ComposerCronetMetricsListener;", "provideCronetMetricListener", "(Lqj/a;Lei0/b;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;Lru/ozon/app/android/composer/network/prefetch/PrefetchEventInterceptor;Lru/ozon/app/android/network/cronet/CronetConfig;)Lru/ozon/app/android/composer/network/cronet/ComposerCronetMetricsListener;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/composer/di/modules/OkHttpClientProvider;", "okHttpClientProvider", "Lru/ozon/app/android/network/cronet/CronetOkHttpClientProvider;", "cronetOkHttpClientProvider", "LWe/q;", "cookieJar", "Lru/ozon/app/android/network/cronet/CronetEventListenerFactory;", "cronetEventListenerFactory", "LWe/d;", "cache", "LWe/B;", "encodingInterceptor", "composerCronetMetricsListener", "provideOkHttpClient", "(Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/composer/di/modules/OkHttpClientProvider;Lru/ozon/app/android/network/cronet/CronetOkHttpClientProvider;LWe/q;Lru/ozon/app/android/network/cronet/CronetEventListenerFactory;Lru/ozon/app/android/network/cronet/CronetConfig;LWe/d;LWe/B;Lru/ozon/app/android/composer/network/cronet/ComposerCronetMetricsListener;Lei0/b;)LWe/E;", "asyncWidgetsClient", "Lru/ozon/app/android/storage/appversion/AppVersionStorage;", "appVersionService", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "networkComponentConfig", "Lru/ozon/app/android/composer/domain/api/ComposerJsonSerializer;", "composerJsonSerializer", "Lru/ozon/app/android/composer/domain/api/ComposerJsonDeserializer;", "composerJsonDeserializer", "Lru/ozon/app/android/composer/tracker/ComposerNetworkMetricsProvider;", "composerNetworkMetricsProvider", "Lru/ozon/app/android/composer/network/redirect/ComposerRedirectListener;", "composerRedirectListener", "Lru/ozon/app/android/composer/domain/cache/ComposerCache;", "LK00/a;", "provideComposerNetwork", "(LWe/E;LWe/E;Landroid/app/Application;Lru/ozon/app/android/storage/appversion/AppVersionStorage;Lru/ozon/app/android/network/di/NetworkComponentConfig;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/composer/domain/api/ComposerJsonSerializer;Lru/ozon/app/android/composer/domain/api/ComposerJsonDeserializer;Lru/ozon/app/android/composer/tracker/ComposerNetworkMetricsProvider;Lru/ozon/app/android/composer/network/redirect/ComposerRedirectListener;Lru/ozon/app/android/composer/domain/cache/ComposerCache;Lru/ozon/app/android/network/gnc/GncOkHttpClientBuilder;)LK00/a;", "network", "LL00/d;", "providerComposerCallFactory", "(LK00/a;)LL00/d;", "LO00/b;", "provideComposerAsyncWidgetsRepository", "(LK00/a;)LO00/b;", "LL00/f;", "provideComposerBaseUrl", "(LK00/a;)LL00/f;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final E configureClientForAsyncWidgets(E client, Application application, GncOkHttpClientBuilder gncOkHttpClientBuilder, FeatureService featureService) {
            if (featureService.getBooleanKey(BxSdkOzonNetworkEnabledFlag.INSTANCE)) {
                return gncOkHttpClientBuilder.deepCopy().addAppInterceptor(new H(), 0).eventListenerFactory(new D(application, null)).build();
            }
            client.getClass();
            E.a aVar = new E.a(client);
            aVar.k(new D(application, null));
            aVar.S().add(0, new H());
            return new E(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void provideComposerNetwork$lambda$0(a aVar, FeatureService featureService) {
            aVar.h(featureService.getBooleanKey(IsTrackinOnParsingEnabled.INSTANCE));
        }

        @NotNull
        public final b provideComposerAsyncWidgetsRepository(@NotNull a network) {
            Intrinsics.checkNotNullParameter(network, "network");
            return network.g();
        }

        @NotNull
        public final f provideComposerBaseUrl(@NotNull a network) {
            Intrinsics.checkNotNullParameter(network, "network");
            return network.e();
        }

        @NotNull
        public final a provideComposerNetwork(@NotNull E client, @NotNull E asyncWidgetsClient, @NotNull Application application, @NotNull AppVersionStorage appVersionService, @NotNull NetworkComponentConfig networkComponentConfig, @NotNull final FeatureService featureService, @NotNull ComposerJsonSerializer composerJsonSerializer, @NotNull ComposerJsonDeserializer composerJsonDeserializer, @NotNull ComposerNetworkMetricsProvider composerNetworkMetricsProvider, @NotNull ComposerRedirectListener composerRedirectListener, @NotNull ComposerCache cache, @NotNull GncOkHttpClientBuilder gncOkHttpClientBuilder) {
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(asyncWidgetsClient, "asyncWidgetsClient");
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(appVersionService, "appVersionService");
            Intrinsics.checkNotNullParameter(networkComponentConfig, "networkComponentConfig");
            Intrinsics.checkNotNullParameter(featureService, "featureService");
            Intrinsics.checkNotNullParameter(composerJsonSerializer, "composerJsonSerializer");
            Intrinsics.checkNotNullParameter(composerJsonDeserializer, "composerJsonDeserializer");
            Intrinsics.checkNotNullParameter(composerNetworkMetricsProvider, "composerNetworkMetricsProvider");
            Intrinsics.checkNotNullParameter(composerRedirectListener, "composerRedirectListener");
            Intrinsics.checkNotNullParameter(cache, "cache");
            Intrinsics.checkNotNullParameter(gncOkHttpClientBuilder, "gncOkHttpClientBuilder");
            ComposerApiImpl composerApiImpl = new ComposerApiImpl(client, cache);
            L00.a aVar = new L00.a(appVersionService.getVersionNameWithoutSuffix(), Integer.parseInt(appVersionService.getVersionCode()), "ozonapp_android", networkComponentConfig.getDeviceTypeName());
            Y00.a aVar2 = new Y00.a(configureClientForAsyncWidgets(asyncWidgetsClient, application, gncOkHttpClientBuilder, featureService));
            a.C0284a c0284a = new a.C0284a(composerApiImpl, aVar);
            c0284a.a(networkComponentConfig.getApiUrl());
            c0284a.g(composerJsonSerializer);
            c0284a.e(composerNetworkMetricsProvider);
            c0284a.f(composerRedirectListener);
            c0284a.b(composerJsonDeserializer, aVar2);
            c0284a.d(featureService.getBooleanKey(BxSdkOzonNetworkEnabledFlag.INSTANCE));
            final a c11 = c0284a.c();
            e.f25623c = true;
            featureService.addOnChangeFeatureListener(new OnChangeFeatureListener() { // from class: Fr.a
                @Override // ru.ozon.app.android.network.abtool.OnChangeFeatureListener
                public final void onChangeFeature() {
                    ComposerNetworkModule.Companion.provideComposerNetwork$lambda$0(K00.a.this, featureService);
                }
            });
            return c11;
        }

        @NotNull
        public final ComposerCronetMetricsListener provideCronetMetricListener(@NotNull C9067a networkInfoProvider, @NotNull InterfaceC6369b ozonTracker, @NotNull PerformanceTrackerDelegate performanceTrackerDelegate, @NotNull PrefetchEventInterceptor prefetchEventInterceptor, @NotNull CronetConfig cronetConfig) {
            Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
            Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
            Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
            Intrinsics.checkNotNullParameter(prefetchEventInterceptor, "prefetchEventInterceptor");
            Intrinsics.checkNotNullParameter(cronetConfig, "cronetConfig");
            return new ComposerCronetMetricsListener(networkInfoProvider, ozonTracker, performanceTrackerDelegate, prefetchEventInterceptor, cronetConfig);
        }

        @NotNull
        public final E provideOkHttpClient(@NotNull FeatureChecker featureService, @NotNull OkHttpClientProvider okHttpClientProvider, @NotNull CronetOkHttpClientProvider cronetOkHttpClientProvider, @NotNull InterfaceC4875q cookieJar, @NotNull CronetEventListenerFactory cronetEventListenerFactory, @NotNull CronetConfig cronetConfig, @NotNull C4862d cache, @NotNull B encodingInterceptor, @NotNull ComposerCronetMetricsListener composerCronetMetricsListener, @NotNull InterfaceC6369b ozonTracker) {
            Intrinsics.checkNotNullParameter(featureService, "featureService");
            Intrinsics.checkNotNullParameter(okHttpClientProvider, "okHttpClientProvider");
            Intrinsics.checkNotNullParameter(cronetOkHttpClientProvider, "cronetOkHttpClientProvider");
            Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
            Intrinsics.checkNotNullParameter(cronetEventListenerFactory, "cronetEventListenerFactory");
            Intrinsics.checkNotNullParameter(cronetConfig, "cronetConfig");
            Intrinsics.checkNotNullParameter(cache, "cache");
            Intrinsics.checkNotNullParameter(encodingInterceptor, "encodingInterceptor");
            Intrinsics.checkNotNullParameter(composerCronetMetricsListener, "composerCronetMetricsListener");
            Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
            CronetEnabled cronetEnabled = CronetEnabled.INSTANCE;
            E provide = okHttpClientProvider.provide(featureService.isEnabled(cronetEnabled));
            return (!featureService.isEnabled(BxSdkOzonNetworkEnabledFlag.INSTANCE) && featureService.isEnabled(cronetEnabled)) ? cronetOkHttpClientProvider.provide(provide, cronetConfig, cookieJar, cache, encodingInterceptor, composerCronetMetricsListener, cronetEventListenerFactory, ozonTracker) : provide;
        }

        @NotNull
        public final d providerComposerCallFactory(@NotNull a network) {
            Intrinsics.checkNotNullParameter(network, "network");
            return network.f();
        }

        @NotNull
        public final CronetConfig providerCronetConfig() {
            return new CronetConfig(ComposerNetworkModule$Companion$providerCronetConfig$1.INSTANCE, ComposerCronetHttpMetricsKey.INSTANCE);
        }

        private Companion() {
        }
    }
}
