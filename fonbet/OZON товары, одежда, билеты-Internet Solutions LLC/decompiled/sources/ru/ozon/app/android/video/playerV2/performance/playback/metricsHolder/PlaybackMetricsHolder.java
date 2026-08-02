package ru.ozon.app.android.video.playerV2.performance.playback.metricsHolder;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricAction;
import ru.ozon.app.android.video.playerV2.performance.playback.metricsHolder.TypedLoadTimeMetrics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000 +2\u00020\u0001:\u0001+B\u0015\b\u0002\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u0004J\r\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\r\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018J\u001a\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u00182\n\u0010 \u001a\u00060\u0003j\u0002`\u0004J\u000e\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u0018J\u000e\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u0018J\u001a\u0010%\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u00182\n\u0010 \u001a\u00060\u0003j\u0002`\u0004J\u0006\u0010&\u001a\u00020\u001cJ\u000e\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u000fJ\u000e\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\fR\u0012\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/PlaybackMetricsHolder;", "", "videoUrl", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoUrl;", "<init>", "(Ljava/lang/String;)V", "successTypedMetrics", "Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$SuccessStartMetrics;", "failedTypedMetrics", "Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$FailedStartMetrics;", "videoIndex", "", "Ljava/lang/Integer;", "typedFatalError", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction$ErrorDetails$FatalErrorType;", "getCurrentUrl", "getVideoIndex", "()Ljava/lang/Integer;", "getTypedPlaybackResult", "Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics;", "isStartupComputed", "", "getLoadingStartTime", "", "()Ljava/lang/Long;", "getTypedFatalError", "onStartPlayingWithTime", "", "playingTime", "onStartStartupFailedWithTime", "loadTime", ImagesContract.URL, "onStartupFailedWithFatalErrorTime", "loadTimeError", "updateSuccessPendingWithTime", "time", "updateFailedPendingWithTime", "discardSuccessPending", "onTypedFatalErrorRegistered", "error", "updateVideoIndex", "index", "Companion", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlaybackMetricsHolder {

    @NotNull
    private TypedLoadTimeMetrics.FailedStartMetrics failedTypedMetrics;

    @NotNull
    private TypedLoadTimeMetrics.SuccessStartMetrics successTypedMetrics;
    private VideoPerfMetricAction.PutVideoPlaybackMetricAction.ErrorDetails.FatalErrorType typedFatalError;
    private Integer videoIndex;

    @NotNull
    private final String videoUrl;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/PlaybackMetricsHolder$Companion;", "", "<init>", "()V", "getNewInstance", "Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/PlaybackMetricsHolder;", "videoUrl", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoUrl;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PlaybackMetricsHolder getNewInstance(@NotNull String videoUrl) {
            Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
            return new PlaybackMetricsHolder(videoUrl, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ PlaybackMetricsHolder(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final void discardSuccessPending() {
        if (TypedLoadTimeMetricsKt.isPending(this.successTypedMetrics)) {
            this.successTypedMetrics = TypedLoadTimeMetrics.INSTANCE.discardSuccessPendingState();
        }
    }

    @NotNull
    /* renamed from: getCurrentUrl, reason: from getter */
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public final Long getLoadingStartTime() {
        return TypedLoadTimeMetricsKt.getLoadingStartTime(this.failedTypedMetrics);
    }

    public final VideoPerfMetricAction.PutVideoPlaybackMetricAction.ErrorDetails.FatalErrorType getTypedFatalError() {
        return this.typedFatalError;
    }

    @NotNull
    public final TypedLoadTimeMetrics getTypedPlaybackResult() {
        TypedLoadTimeMetrics.SuccessStartMetrics successStartMetrics = this.successTypedMetrics;
        return TypedLoadTimeMetricsKt.isStartupSucceed(successStartMetrics) ? successStartMetrics : this.failedTypedMetrics;
    }

    public final Integer getVideoIndex() {
        return this.videoIndex;
    }

    public final boolean isStartupComputed() {
        return TypedLoadTimeMetricsKt.isStartupSucceed(this.successTypedMetrics);
    }

    public final void onStartPlayingWithTime(long playingTime) {
        Long lastResumedTimeIfPending = TypedLoadTimeMetricsKt.getLastResumedTimeIfPending(this.successTypedMetrics);
        if (lastResumedTimeIfPending != null) {
            this.successTypedMetrics = new TypedLoadTimeMetrics.SuccessStartMetrics.StartupSucceedMetrics(playingTime - lastResumedTimeIfPending.longValue());
        }
        this.typedFatalError = null;
    }

    public final void onStartStartupFailedWithTime(long loadTime, @NotNull String url) {
        Long loadStartTimeIfPending;
        Intrinsics.checkNotNullParameter(url, "url");
        if (Intrinsics.d(url, this.videoUrl) && (loadStartTimeIfPending = TypedLoadTimeMetricsKt.getLoadStartTimeIfPending(this.failedTypedMetrics)) != null) {
            this.failedTypedMetrics = new TypedLoadTimeMetrics.FailedStartMetrics.StartupFailedMetrics(loadStartTimeIfPending.longValue(), Long.valueOf(loadTime - loadStartTimeIfPending.longValue()), null);
        }
    }

    public final void onStartupFailedWithFatalErrorTime(long loadTimeError) {
        Long loadStartTimeIfPending = TypedLoadTimeMetricsKt.getLoadStartTimeIfPending(this.failedTypedMetrics);
        if (loadStartTimeIfPending != null) {
            this.failedTypedMetrics = new TypedLoadTimeMetrics.FailedStartMetrics.StartupFailedMetrics(loadStartTimeIfPending.longValue(), null, Long.valueOf(loadTimeError));
        }
    }

    public final void onTypedFatalErrorRegistered(@NotNull VideoPerfMetricAction.PutVideoPlaybackMetricAction.ErrorDetails.FatalErrorType error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.typedFatalError = error;
    }

    public final void updateFailedPendingWithTime(long time, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (Intrinsics.d(url, this.videoUrl) && TypedLoadTimeMetricsKt.getLoadStartTimeIfPending(this.failedTypedMetrics) == null) {
            this.failedTypedMetrics = new TypedLoadTimeMetrics.FailedStartMetrics.PendingState(Long.valueOf(time));
        }
    }

    public final void updateSuccessPendingWithTime(long time) {
        if (TypedLoadTimeMetricsKt.isPending(this.successTypedMetrics)) {
            this.successTypedMetrics = TypedLoadTimeMetrics.INSTANCE.createSuccessPendingStateFromTime(time);
        }
    }

    public final void updateVideoIndex(int index) {
        this.videoIndex = Integer.valueOf(index);
    }

    private PlaybackMetricsHolder(String str) {
        this.videoUrl = str;
        this.successTypedMetrics = new TypedLoadTimeMetrics.SuccessStartMetrics.PendingState(null);
        this.failedTypedMetrics = new TypedLoadTimeMetrics.FailedStartMetrics.PendingState(null);
    }
}
