package ru.ozon.app.android.pikazon.di;

import Ld0.c;
import Qj0.D;
import Qj0.H;
import We.E;
import We.InterfaceC4875q;
import android.content.Context;
import ei0.InterfaceC6369b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf0.AbstractC8919b;
import pf0.AbstractC8922e;
import pf0.InterfaceC8924g;
import pf0.h;
import pf0.i;
import qj.C9067a;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.composer.network.cronet.ComposerCronetMetricsListener;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.cronet.CronetConfig;
import ru.ozon.app.android.network.cronet.CronetOkHttpClientProvider;
import ru.ozon.app.android.network.flags.BxSdkOzonNetworkEnabledFlag;
import ru.ozon.app.android.network.gnc.ExtentionsKt;
import ru.ozon.app.android.pikazon.PikazonCronetMetricsKey;
import ru.ozon.app.android.pikazon.PikazonEventListenerInterceptor;
import ru.ozon.app.android.pikazon.PikazonUserAgentInterceptor;
import ru.ozon.app.android.pikazon.flags.QuicPikazonEnabledFlag;
import ru.ozon.app.android.pikazon.interceptors.WebPHeaderInterceptor;
import ru.ozon.app.android.pikazon.performance.PikazonEventListenerFactory;
import ru.ozon.app.android.pikazon.performance.PikazonPerformanceTraceKeyInterceptor;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010!\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b!\u0010\"J'\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/pikazon/di/PikazonModule;", "", "<init>", "()V", "LWe/q;", "cookieJar", "Lru/ozon/app/android/pikazon/PikazonUserAgentInterceptor;", "pikazonUserAgentInterceptor", "Lru/ozon/app/android/pikazon/performance/PikazonEventListenerFactory;", "pikazonEventListenerFactory", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/network/cronet/CronetOkHttpClientProvider;", "cronetOkHttpClientProvider", "Lru/ozon/app/android/network/cronet/CronetConfig;", "cronetConfig", "Lru/ozon/app/android/composer/network/cronet/ComposerCronetMetricsListener;", "composerCronetMetricsListener", "Lei0/b;", "ozonTracker", "LLd0/c;", "ozonLimbDiStore", "LWe/E;", "providePikazonClient", "(LWe/q;Lru/ozon/app/android/pikazon/PikazonUserAgentInterceptor;Lru/ozon/app/android/pikazon/performance/PikazonEventListenerFactory;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/network/cronet/CronetOkHttpClientProvider;Lru/ozon/app/android/network/cronet/CronetConfig;Lru/ozon/app/android/composer/network/cronet/ComposerCronetMetricsListener;Lei0/b;LLd0/c;)LWe/E;", "providerCronetConfig", "()Lru/ozon/app/android/network/cronet/CronetConfig;", "Lqj/a;", "networkInfoProvider", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "Lru/ozon/app/android/pikazon/PikazonEventListenerInterceptor;", "pikazonEventListenerInterceptor", "provideCronetMetricListener", "(Lqj/a;Lei0/b;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;Lru/ozon/app/android/pikazon/PikazonEventListenerInterceptor;Lru/ozon/app/android/network/cronet/CronetConfig;)Lru/ozon/app/android/composer/network/cronet/ComposerCronetMetricsListener;", "Landroid/content/Context;", "appContext", "providePikazonEventListenerFactory", "(Landroid/content/Context;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/pikazon/PikazonEventListenerInterceptor;)Lru/ozon/app/android/pikazon/performance/PikazonEventListenerFactory;", "pikazon_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PikazonModule {
    @NotNull
    public final ComposerCronetMetricsListener provideCronetMetricListener(@NotNull C9067a networkInfoProvider, @NotNull InterfaceC6369b ozonTracker, @NotNull PerformanceTrackerDelegate performanceTrackerDelegate, @NotNull PikazonEventListenerInterceptor pikazonEventListenerInterceptor, @NotNull CronetConfig cronetConfig) {
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
        Intrinsics.checkNotNullParameter(pikazonEventListenerInterceptor, "pikazonEventListenerInterceptor");
        Intrinsics.checkNotNullParameter(cronetConfig, "cronetConfig");
        return new ComposerCronetMetricsListener(networkInfoProvider, ozonTracker, performanceTrackerDelegate, pikazonEventListenerInterceptor, cronetConfig);
    }

    @NotNull
    public final E providePikazonClient(@NotNull InterfaceC4875q cookieJar, @NotNull final PikazonUserAgentInterceptor pikazonUserAgentInterceptor, @NotNull PikazonEventListenerFactory pikazonEventListenerFactory, @NotNull final FeatureChecker featureChecker, @NotNull CronetOkHttpClientProvider cronetOkHttpClientProvider, @NotNull CronetConfig cronetConfig, @NotNull ComposerCronetMetricsListener composerCronetMetricsListener, @NotNull InterfaceC6369b ozonTracker, @NotNull c ozonLimbDiStore) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        Intrinsics.checkNotNullParameter(pikazonUserAgentInterceptor, "pikazonUserAgentInterceptor");
        Intrinsics.checkNotNullParameter(pikazonEventListenerFactory, "pikazonEventListenerFactory");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(cronetOkHttpClientProvider, "cronetOkHttpClientProvider");
        Intrinsics.checkNotNullParameter(cronetConfig, "cronetConfig");
        Intrinsics.checkNotNullParameter(composerCronetMetricsListener, "composerCronetMetricsListener");
        Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
        Intrinsics.checkNotNullParameter(ozonLimbDiStore, "ozonLimbDiStore");
        if (featureChecker.isEnabled(BxSdkOzonNetworkEnabledFlag.INSTANCE)) {
            return ((InterfaceC8924g) ozonLimbDiStore.e(h.class)).y(new i(featureChecker, pikazonUserAgentInterceptor) { // from class: ru.ozon.app.android.pikazon.di.PikazonModule$providePikazonClient$1
                private final AbstractC8919b.a consumer = AbstractC8919b.a.f80501a;
                private final List<AbstractC8922e> interceptors;
                private boolean isCronetEnabled;

                {
                    this.isCronetEnabled = featureChecker.isEnabled(QuicPikazonEnabledFlag.INSTANCE);
                    this.interceptors = C7714v.b0(ExtentionsKt.toAppInterceptor(new PikazonPerformanceTraceKeyInterceptor()), ExtentionsKt.toAppInterceptor(new H()), ExtentionsKt.toAppInterceptor(new WebPHeaderInterceptor()), ExtentionsKt.toAppInterceptor(pikazonUserAgentInterceptor));
                }

                @Override // pf0.i
                public List<AbstractC8922e> getInterceptors() {
                    return this.interceptors;
                }

                @Override // pf0.i
                /* renamed from: isCronetEnabled, reason: from getter */
                public boolean getIsCronetEnabled() {
                    return this.isCronetEnabled;
                }

                @Override // pf0.i
                public void setCronetEnabled(boolean z11) {
                    this.isCronetEnabled = z11;
                }

                @Override // pf0.i
                public AbstractC8919b.a getConsumer() {
                    return this.consumer;
                }
            });
        }
        E.a aVar = new E.a();
        aVar.h(cookieJar);
        aVar.a(new PikazonPerformanceTraceKeyInterceptor());
        aVar.a(new H());
        aVar.a(new WebPHeaderInterceptor());
        aVar.a(pikazonUserAgentInterceptor);
        aVar.k(pikazonEventListenerFactory);
        E e11 = new E(aVar);
        return !featureChecker.isEnabled(QuicPikazonEnabledFlag.INSTANCE) ? e11 : CronetOkHttpClientProvider.DefaultImpls.provide$default(cronetOkHttpClientProvider, e11, cronetConfig, cookieJar, null, null, composerCronetMetricsListener, null, ozonTracker, 88, null);
    }

    @NotNull
    public final PikazonEventListenerFactory providePikazonEventListenerFactory(@NotNull Context appContext, @NotNull FeatureChecker featureChecker, @NotNull PikazonEventListenerInterceptor pikazonEventListenerInterceptor) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(pikazonEventListenerInterceptor, "pikazonEventListenerInterceptor");
        return new PikazonEventListenerFactory(featureChecker, new D(appContext, pikazonEventListenerInterceptor));
    }

    @NotNull
    public final CronetConfig providerCronetConfig() {
        return new CronetConfig(PikazonModule$providerCronetConfig$1.INSTANCE, PikazonCronetMetricsKey.INSTANCE);
    }
}
