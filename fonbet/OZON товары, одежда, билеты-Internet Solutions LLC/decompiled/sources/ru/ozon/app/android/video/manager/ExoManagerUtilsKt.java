package ru.ozon.app.android.video.manager;

import We.E;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p3.p;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.video.player.flags.CronetInPlayerEnabledFlag;
import ru.ozon.app.android.video.player.fromexoplayer.OzOkHttpDataSource;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManager;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u000b\u001a/\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LWe/E;", "okHttpClient", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;", "videoPerfMetricsManager", "Lp3/p;", "getHttpDataSourceFactory", "(LWe/E;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;)Lp3/p;", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "(LWe/E;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;)Lp3/p;", "", "useCronetInPlayer", "Lru/ozon/app/android/video/player/fromexoplayer/OzOkHttpDataSource$Factory;", "kotlin.jvm.PlatformType", "getHttpDataSourceFactoryByFlags", "(LWe/E;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;Z)Lru/ozon/app/android/video/player/fromexoplayer/OzOkHttpDataSource$Factory;", "video_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExoManagerUtilsKt {
    @NotNull
    public static final p getHttpDataSourceFactory(@NotNull E okHttpClient, @NotNull FeatureChecker featureChecker, @NotNull VideoPerfMetricsManager videoPerfMetricsManager) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(videoPerfMetricsManager, "videoPerfMetricsManager");
        OzOkHttpDataSource.Factory httpDataSourceFactoryByFlags = getHttpDataSourceFactoryByFlags(okHttpClient, videoPerfMetricsManager, featureChecker.isEnabled(CronetInPlayerEnabledFlag.INSTANCE));
        Intrinsics.checkNotNullExpressionValue(httpDataSourceFactoryByFlags, "getHttpDataSourceFactoryByFlags(...)");
        return httpDataSourceFactoryByFlags;
    }

    private static final OzOkHttpDataSource.Factory getHttpDataSourceFactoryByFlags(E e11, VideoPerfMetricsManager videoPerfMetricsManager, boolean z11) {
        return new OzOkHttpDataSource.Factory(e11, videoPerfMetricsManager, Boolean.valueOf(z11)).setUserAgent("ExoPlayer");
    }

    @NotNull
    public static final p getHttpDataSourceFactory(@NotNull E okHttpClient, @NotNull FeatureService featureService, @NotNull VideoPerfMetricsManager videoPerfMetricsManager) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(videoPerfMetricsManager, "videoPerfMetricsManager");
        OzOkHttpDataSource.Factory httpDataSourceFactoryByFlags = getHttpDataSourceFactoryByFlags(okHttpClient, videoPerfMetricsManager, featureService.getBooleanKey(CronetInPlayerEnabledFlag.INSTANCE));
        Intrinsics.checkNotNullExpressionValue(httpDataSourceFactoryByFlags, "getHttpDataSourceFactoryByFlags(...)");
        return httpDataSourceFactoryByFlags;
    }
}
