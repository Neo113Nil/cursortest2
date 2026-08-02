package ru.ozon.app.android.video.di;

import We.E;
import android.content.Context;
import ei0.InterfaceC6369b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o3.InterfaceC8635b;
import o3.c;
import org.jetbrains.annotations.NotNull;
import pf0.AbstractC8919b;
import pf0.AbstractC8922e;
import pf0.InterfaceC8924g;
import pf0.h;
import pf0.i;
import qj.C9067a;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.cronet.CronetConfig;
import ru.ozon.app.android.network.cronet.CronetOkHttpClientProvider;
import ru.ozon.app.android.network.flags.BxSdkOzonNetworkEnabledFlag;
import ru.ozon.app.android.network.gnc.ExtentionsKt;
import ru.ozon.app.android.video.player.flags.CronetInPlayerEnabledFlag;
import ru.ozon.app.android.video.player.performance.VideoPerformanceEventListenerFactory;
import ru.ozon.app.android.video.player.performance.VideoPerformanceMetricsInterceptor;
import ru.ozon.app.android.video.player.performance.cronet.VideoCronetMetricListener;
import ru.ozon.app.android.video.player.performance.cronet.VideoCronetMetricsKey;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManager;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/video/di/VideoModule;", "", "Companion", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class VideoModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJW\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/video/di/VideoModule$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lo3/b;", "provideDatabaseProvider", "(Landroid/content/Context;)Lo3/b;", "Lru/ozon/app/android/network/cronet/CronetConfig;", "providerCronetConfig", "()Lru/ozon/app/android/network/cronet/CronetConfig;", "Lqj/a;", "networkInfoProvider", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;", "videoPerfMetricsManager", "Lru/ozon/app/android/network/cronet/CronetOkHttpClientProvider;", "cronetOkHttpClientProvider", "cronetConfig", "Lru/ozon/app/android/video/player/performance/cronet/VideoCronetMetricListener;", "videoCronetMetricListener", "Lei0/b;", "ozonTracker", "LLd0/c;", "ozonLimbDiStore", "LWe/E;", "provideOkHttpClient", "(Lqj/a;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;Lru/ozon/app/android/network/cronet/CronetOkHttpClientProvider;Lru/ozon/app/android/network/cronet/CronetConfig;Lru/ozon/app/android/video/player/performance/cronet/VideoCronetMetricListener;Lei0/b;LLd0/c;)LWe/E;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC8635b provideDatabaseProvider(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new c(context.getApplicationContext(), "exoplayer_internal.db", null, 1);
        }

        @NotNull
        public final E provideOkHttpClient(@NotNull C9067a networkInfoProvider, @NotNull PerformanceTrackerDelegate performanceTrackerDelegate, @NotNull final FeatureChecker featureChecker, @NotNull final VideoPerfMetricsManager videoPerfMetricsManager, @NotNull CronetOkHttpClientProvider cronetOkHttpClientProvider, @NotNull CronetConfig cronetConfig, @NotNull VideoCronetMetricListener videoCronetMetricListener, @NotNull InterfaceC6369b ozonTracker, @NotNull Ld0.c ozonLimbDiStore) {
            Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
            Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
            Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
            Intrinsics.checkNotNullParameter(videoPerfMetricsManager, "videoPerfMetricsManager");
            Intrinsics.checkNotNullParameter(cronetOkHttpClientProvider, "cronetOkHttpClientProvider");
            Intrinsics.checkNotNullParameter(cronetConfig, "cronetConfig");
            Intrinsics.checkNotNullParameter(videoCronetMetricListener, "videoCronetMetricListener");
            Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
            Intrinsics.checkNotNullParameter(ozonLimbDiStore, "ozonLimbDiStore");
            if (featureChecker.isEnabled(BxSdkOzonNetworkEnabledFlag.INSTANCE)) {
                E y11 = ((InterfaceC8924g) ozonLimbDiStore.e(h.class)).y(new i(featureChecker, videoPerfMetricsManager) { // from class: ru.ozon.app.android.video.di.VideoModule$Companion$provideOkHttpClient$1
                    private final AbstractC8919b.a consumer = AbstractC8919b.a.f80501a;
                    private final List<AbstractC8922e> interceptors;
                    private boolean isCronetEnabled;

                    {
                        this.isCronetEnabled = featureChecker.isEnabled(CronetInPlayerEnabledFlag.INSTANCE);
                        this.interceptors = C7714v.a0(ExtentionsKt.toAppInterceptor(new VideoPerformanceMetricsInterceptor(videoPerfMetricsManager)));
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
                y11.getClass();
                E.a aVar = new E.a(y11);
                aVar.k(new VideoPerformanceEventListenerFactory(networkInfoProvider, performanceTrackerDelegate, featureChecker, videoPerfMetricsManager));
                return new E(aVar);
            }
            E.a aVar2 = new E.a();
            aVar2.a(new VideoPerformanceMetricsInterceptor(videoPerfMetricsManager));
            aVar2.k(new VideoPerformanceEventListenerFactory(networkInfoProvider, performanceTrackerDelegate, featureChecker, videoPerfMetricsManager));
            E e11 = new E(aVar2);
            return !featureChecker.isEnabled(CronetInPlayerEnabledFlag.INSTANCE) ? e11 : CronetOkHttpClientProvider.DefaultImpls.provide$default(cronetOkHttpClientProvider, e11, cronetConfig, null, null, null, videoCronetMetricListener, null, ozonTracker, 92, null);
        }

        @NotNull
        public final CronetConfig providerCronetConfig() {
            return new CronetConfig(VideoModule$Companion$providerCronetConfig$1.INSTANCE, VideoCronetMetricsKey.INSTANCE);
        }

        private Companion() {
        }
    }
}
