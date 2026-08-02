package ru.ozon.app.android.video.manager.progressiveImpl;

import We.E;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o3.InterfaceC8635b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.video.domainreplacement.domain.VideoDomainReplacementService;
import ru.ozon.app.android.video.manager.CacheTransferInfoProvider;
import ru.ozon.app.android.video.manager.ProgressiveWithCacheExoManager;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManager;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014BC\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/video/manager/progressiveImpl/ProgressiveWithCacheExoManagerImpl;", "Lru/ozon/app/android/video/manager/progressiveImpl/AbstractProgressiveExoManager;", "Lru/ozon/app/android/video/manager/ProgressiveWithCacheExoManager;", "Landroid/content/Context;", "context", "Lo3/b;", "databaseProvider", "LWe/E;", "okHttpClient", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;", "videoPerfMetricsManager", "Lru/ozon/app/android/video/manager/CacheTransferInfoProvider;", "cacheTransferListener", "Lru/ozon/app/android/video/domainreplacement/domain/VideoDomainReplacementService;", "videoDomainReplacementService", "<init>", "(Landroid/content/Context;Lo3/b;LWe/E;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;Lru/ozon/app/android/video/manager/CacheTransferInfoProvider;Lru/ozon/app/android/video/domainreplacement/domain/VideoDomainReplacementService;)V", "LWe/E;", "Companion", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProgressiveWithCacheExoManagerImpl extends AbstractProgressiveExoManager implements ProgressiveWithCacheExoManager {

    @NotNull
    private final E okHttpClient;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressiveWithCacheExoManagerImpl(@NotNull Context context, @NotNull InterfaceC8635b databaseProvider, @NotNull E okHttpClient, @NotNull FeatureService featureService, @NotNull VideoPerfMetricsManager videoPerfMetricsManager, @NotNull CacheTransferInfoProvider cacheTransferListener, @NotNull VideoDomainReplacementService videoDomainReplacementService) {
        super(context, databaseProvider, okHttpClient, featureService, videoPerfMetricsManager, cacheTransferListener, videoDomainReplacementService, "progressive_videos", true, false);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseProvider, "databaseProvider");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(videoPerfMetricsManager, "videoPerfMetricsManager");
        Intrinsics.checkNotNullParameter(cacheTransferListener, "cacheTransferListener");
        Intrinsics.checkNotNullParameter(videoDomainReplacementService, "videoDomainReplacementService");
        this.okHttpClient = okHttpClient;
    }
}
