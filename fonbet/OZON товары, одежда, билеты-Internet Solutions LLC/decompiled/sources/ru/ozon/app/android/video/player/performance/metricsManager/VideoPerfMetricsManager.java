package ru.ozon.app.android.video.player.performance.metricsManager;

import We.z;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.player.performance.PlayerNamespace;
import ru.ozon.app.android.video.player.performance.VideoTraceEntity;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricAction;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\u00062\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoAsset;", "videoAsset", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction;", "metricType", "", "handleMetricActionByUrl", "(Lru/ozon/app/android/video/player/performance/metricsManager/VideoAsset;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction;)V", "LWe/z;", "headers", "extractAndPutServerTimingMetrics", "(Lru/ozon/app/android/video/player/performance/metricsManager/VideoAsset;LWe/z;)V", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction;", "playbackMetrics", "Lru/ozon/app/android/video/player/performance/VideoTraceEntity;", "videoTraceEntity", "Lru/ozon/app/android/video/player/performance/PlayerNamespace;", "playerNamespace", "sendAnalyticsByUrl", "(Lru/ozon/app/android/video/player/performance/metricsManager/VideoAsset;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction;Lru/ozon/app/android/video/player/performance/VideoTraceEntity;Lru/ozon/app/android/video/player/performance/PlayerNamespace;)V", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoUrl;", ImagesContract.URL, "releaseCachedUrls", "(Ljava/lang/String;)V", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface VideoPerfMetricsManager {
    void extractAndPutServerTimingMetrics(@NotNull VideoAsset videoAsset, @NotNull z headers);

    void handleMetricActionByUrl(@NotNull VideoAsset videoAsset, @NotNull VideoPerfMetricAction metricType);

    void releaseCachedUrls(@NotNull String url);

    void sendAnalyticsByUrl(@NotNull VideoAsset videoAsset, @NotNull VideoPerfMetricAction.PutVideoPlaybackMetricAction playbackMetrics, @NotNull VideoTraceEntity videoTraceEntity, @NotNull PlayerNamespace playerNamespace);
}
