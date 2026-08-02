package ru.ozon.app.android.video.playerV2.performance.playback.metricsHolder;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.playerV2.performance.playback.metricsHolder.TypedLoadTimeMetrics;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0002H\u0000¢\u0006\u0002\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u00020\bH\u0000¢\u0006\u0002\u0010\t\u001a\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005*\u00020\bH\u0000¢\u0006\u0002\u0010\t¨\u0006\u000b"}, d2 = {"isStartupSucceed", "", "Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$SuccessStartMetrics;", "isPending", "getLastResumedTimeIfPending", "", "(Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$SuccessStartMetrics;)Ljava/lang/Long;", "getLoadingStartTime", "Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$FailedStartMetrics;", "(Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$FailedStartMetrics;)Ljava/lang/Long;", "getLoadStartTimeIfPending", "video_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TypedLoadTimeMetricsKt {
    public static final Long getLastResumedTimeIfPending(@NotNull TypedLoadTimeMetrics.SuccessStartMetrics successStartMetrics) {
        Intrinsics.checkNotNullParameter(successStartMetrics, "<this>");
        TypedLoadTimeMetrics.SuccessStartMetrics.PendingState pendingState = successStartMetrics instanceof TypedLoadTimeMetrics.SuccessStartMetrics.PendingState ? (TypedLoadTimeMetrics.SuccessStartMetrics.PendingState) successStartMetrics : null;
        if (pendingState != null) {
            return pendingState.getLastResumedTimeMs();
        }
        return null;
    }

    public static final Long getLoadStartTimeIfPending(@NotNull TypedLoadTimeMetrics.FailedStartMetrics failedStartMetrics) {
        Intrinsics.checkNotNullParameter(failedStartMetrics, "<this>");
        if (failedStartMetrics instanceof TypedLoadTimeMetrics.FailedStartMetrics.PendingState) {
            return ((TypedLoadTimeMetrics.FailedStartMetrics.PendingState) failedStartMetrics).getLoadStartTimeMs();
        }
        return null;
    }

    public static final Long getLoadingStartTime(@NotNull TypedLoadTimeMetrics.FailedStartMetrics failedStartMetrics) {
        Intrinsics.checkNotNullParameter(failedStartMetrics, "<this>");
        if (failedStartMetrics instanceof TypedLoadTimeMetrics.FailedStartMetrics.PendingState) {
            return ((TypedLoadTimeMetrics.FailedStartMetrics.PendingState) failedStartMetrics).getLoadStartTimeMs();
        }
        if (failedStartMetrics instanceof TypedLoadTimeMetrics.FailedStartMetrics.StartupFailedMetrics) {
            return Long.valueOf(((TypedLoadTimeMetrics.FailedStartMetrics.StartupFailedMetrics) failedStartMetrics).getLoadStartTimeMs());
        }
        throw new o();
    }

    public static final boolean isPending(@NotNull TypedLoadTimeMetrics.SuccessStartMetrics successStartMetrics) {
        Intrinsics.checkNotNullParameter(successStartMetrics, "<this>");
        return successStartMetrics instanceof TypedLoadTimeMetrics.SuccessStartMetrics.PendingState;
    }

    public static final boolean isStartupSucceed(@NotNull TypedLoadTimeMetrics.SuccessStartMetrics successStartMetrics) {
        Intrinsics.checkNotNullParameter(successStartMetrics, "<this>");
        return successStartMetrics instanceof TypedLoadTimeMetrics.SuccessStartMetrics.StartupSucceedMetrics;
    }
}
