package ru.ozon.app.android.video.player.performance;

import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"addMetricsToTrace", "", "performanceTrackerDelegate", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "metricsTraceEntity", "Lru/ozon/app/android/video/player/performance/MetricsVideoTraceEntity;", "video_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PerformanceTrackerVideoTraceWrapperKt {
    public static final void addMetricsToTrace(@NotNull PerformanceTrackerDelegate performanceTrackerDelegate, @NotNull MetricsVideoTraceEntity metricsTraceEntity) {
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
        Intrinsics.checkNotNullParameter(metricsTraceEntity, "metricsTraceEntity");
        VideoTraceEntity videoTraceEntity = metricsTraceEntity.getVideoTraceEntity();
        performanceTrackerDelegate.beginTrace(videoTraceEntity.getVideoUrl(), new PerformanceTrackerVideoTraceWrapperKt$addMetricsToTrace$1(videoTraceEntity, metricsTraceEntity));
        if (videoTraceEntity.getVideoTrackingEnabled() || videoTraceEntity.getLoadVideoTrackingEnabled()) {
            performanceTrackerDelegate.endTrace(videoTraceEntity.getVideoUrl(), U.c());
        }
    }
}
