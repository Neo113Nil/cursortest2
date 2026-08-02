package ru.ozon.app.android.video.playerV2.performance.playback.playbackData;

import B0.C2454a;
import E0.C2942q;
import Kk.C3532b;
import Pk0.c;
import Rg.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricAction;
import ru.ozon.app.android.video.playerV2.performance.playback.metricsHolder.TypedLoadTimeMetrics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\b\u0081\b\u0018\u0000 32\u00020\u0001:\u00013Bk\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b\b\u0010#R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b$\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010\u0019R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b'\u0010\u0019R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b(\u0010!R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b/\u0010\u0017R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/playbackData/PlaybackData;", "", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoUrl;", "videoUrl", "", "startupTime", "", "isStartupFailed", "viewTime", "", "errorsCount", "stallCount", "stallDuration", "videoIndex", "LRg/a;", "analyticsScreen", "widgetName", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction$ErrorDetails$FatalErrorType;", "typedFatalError", "<init>", "(Ljava/lang/String;JZJIIJLjava/lang/Integer;LRg/a;Ljava/lang/String;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction$ErrorDetails$FatalErrorType;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVideoUrl", "J", "getStartupTime", "()J", "Z", "()Z", "getViewTime", "I", "getErrorsCount", "getStallCount", "getStallDuration", "Ljava/lang/Integer;", "getVideoIndex", "()Ljava/lang/Integer;", "LRg/a;", "getAnalyticsScreen", "()LRg/a;", "getWidgetName", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction$ErrorDetails$FatalErrorType;", "getTypedFatalError", "()Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction$ErrorDetails$FatalErrorType;", "Companion", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PlaybackData {
    private final a analyticsScreen;
    private final int errorsCount;
    private final boolean isStartupFailed;
    private final int stallCount;
    private final long stallDuration;
    private final long startupTime;
    private final VideoPerfMetricAction.PutVideoPlaybackMetricAction.ErrorDetails.FatalErrorType typedFatalError;
    private final Integer videoIndex;

    @NotNull
    private final String videoUrl;
    private final long viewTime;
    private final String widgetName;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u0013\u001a\u00020\u00122\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014JS\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/playbackData/PlaybackData$Companion;", "", "<init>", "()V", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoUrl;", "videoUrl", "Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$SuccessStartMetrics$StartupSucceedMetrics;", "typedPlaybackResult", "Lru/ozon/app/android/video/playerV2/performance/playback/playbackData/PlaybackStatsData;", "playbackStats", "", "videoIndex", "LRg/a;", "analyticsScreen", "widgetName", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction$ErrorDetails$FatalErrorType;", "typedFatalError", "Lru/ozon/app/android/video/playerV2/performance/playback/playbackData/PlaybackData;", "createInstanceFromStats", "(Ljava/lang/String;Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$SuccessStartMetrics$StartupSucceedMetrics;Lru/ozon/app/android/video/playerV2/performance/playback/playbackData/PlaybackStatsData;Ljava/lang/Integer;LRg/a;Ljava/lang/String;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction$ErrorDetails$FatalErrorType;)Lru/ozon/app/android/video/playerV2/performance/playback/playbackData/PlaybackData;", "Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$FailedStartMetrics$StartupFailedMetrics;", "(Ljava/lang/String;Lru/ozon/app/android/video/playerV2/performance/playback/metricsHolder/TypedLoadTimeMetrics$FailedStartMetrics$StartupFailedMetrics;Lru/ozon/app/android/video/playerV2/performance/playback/playbackData/PlaybackStatsData;Ljava/lang/Integer;LRg/a;Ljava/lang/String;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction$ErrorDetails$FatalErrorType;)Lru/ozon/app/android/video/playerV2/performance/playback/playbackData/PlaybackData;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PlaybackData createInstanceFromStats(@NotNull String videoUrl, @NotNull TypedLoadTimeMetrics.SuccessStartMetrics.StartupSucceedMetrics typedPlaybackResult, @NotNull PlaybackStatsData playbackStats, Integer videoIndex, a analyticsScreen, String widgetName, VideoPerfMetricAction.PutVideoPlaybackMetricAction.ErrorDetails.FatalErrorType typedFatalError) {
            Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
            Intrinsics.checkNotNullParameter(typedPlaybackResult, "typedPlaybackResult");
            Intrinsics.checkNotNullParameter(playbackStats, "playbackStats");
            return new PlaybackData(videoUrl, typedPlaybackResult.getSuccessStartupTime(), false, playbackStats.getViewTime(), playbackStats.getErrorsCount(), playbackStats.getStallCount(), playbackStats.getStallDuration(), videoIndex, analyticsScreen, widgetName, typedFatalError);
        }

        private Companion() {
        }

        public final PlaybackData createInstanceFromStats(@NotNull String videoUrl, @NotNull TypedLoadTimeMetrics.FailedStartMetrics.StartupFailedMetrics typedPlaybackResult, @NotNull PlaybackStatsData playbackStats, Integer videoIndex, a analyticsScreen, String widgetName, VideoPerfMetricAction.PutVideoPlaybackMetricAction.ErrorDetails.FatalErrorType typedFatalError) {
            Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
            Intrinsics.checkNotNullParameter(typedPlaybackResult, "typedPlaybackResult");
            Intrinsics.checkNotNullParameter(playbackStats, "playbackStats");
            Long failedOrFatalLoadingDuration = typedPlaybackResult.getFailedOrFatalLoadingDuration();
            if (failedOrFatalLoadingDuration != null) {
                return new PlaybackData(videoUrl, failedOrFatalLoadingDuration.longValue(), true, playbackStats.getViewTime(), playbackStats.getErrorsCount(), playbackStats.getStallCount(), playbackStats.getStallDuration(), videoIndex, analyticsScreen, widgetName, typedFatalError);
            }
            return null;
        }
    }

    public PlaybackData(@NotNull String videoUrl, long j11, boolean z11, long j12, int i11, int i12, long j13, Integer num, a aVar, String str, VideoPerfMetricAction.PutVideoPlaybackMetricAction.ErrorDetails.FatalErrorType fatalErrorType) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        this.videoUrl = videoUrl;
        this.startupTime = j11;
        this.isStartupFailed = z11;
        this.viewTime = j12;
        this.errorsCount = i11;
        this.stallCount = i12;
        this.stallDuration = j13;
        this.videoIndex = num;
        this.analyticsScreen = aVar;
        this.widgetName = str;
        this.typedFatalError = fatalErrorType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaybackData)) {
            return false;
        }
        PlaybackData playbackData = (PlaybackData) other;
        return Intrinsics.d(this.videoUrl, playbackData.videoUrl) && this.startupTime == playbackData.startupTime && this.isStartupFailed == playbackData.isStartupFailed && this.viewTime == playbackData.viewTime && this.errorsCount == playbackData.errorsCount && this.stallCount == playbackData.stallCount && this.stallDuration == playbackData.stallDuration && Intrinsics.d(this.videoIndex, playbackData.videoIndex) && Intrinsics.d(this.analyticsScreen, playbackData.analyticsScreen) && Intrinsics.d(this.widgetName, playbackData.widgetName) && this.typedFatalError == playbackData.typedFatalError;
    }

    public final a getAnalyticsScreen() {
        return this.analyticsScreen;
    }

    public final int getErrorsCount() {
        return this.errorsCount;
    }

    public final int getStallCount() {
        return this.stallCount;
    }

    public final long getStallDuration() {
        return this.stallDuration;
    }

    public final long getStartupTime() {
        return this.startupTime;
    }

    public final VideoPerfMetricAction.PutVideoPlaybackMetricAction.ErrorDetails.FatalErrorType getTypedFatalError() {
        return this.typedFatalError;
    }

    public final Integer getVideoIndex() {
        return this.videoIndex;
    }

    @NotNull
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public final long getViewTime() {
        return this.viewTime;
    }

    public final String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        int a11 = c.a(C2454a.a(this.stallCount, C2454a.a(this.errorsCount, c.a(C3532b.a(c.a(this.videoUrl.hashCode() * 31, 31, this.startupTime), 31, this.isStartupFailed), 31, this.viewTime), 31), 31), 31, this.stallDuration);
        Integer num = this.videoIndex;
        int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
        a aVar = this.analyticsScreen;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.widgetName;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        VideoPerfMetricAction.PutVideoPlaybackMetricAction.ErrorDetails.FatalErrorType fatalErrorType = this.typedFatalError;
        return hashCode3 + (fatalErrorType != null ? fatalErrorType.hashCode() : 0);
    }

    /* renamed from: isStartupFailed, reason: from getter */
    public final boolean getIsStartupFailed() {
        return this.isStartupFailed;
    }

    @NotNull
    public String toString() {
        String str = this.videoUrl;
        long j11 = this.startupTime;
        boolean z11 = this.isStartupFailed;
        long j12 = this.viewTime;
        int i11 = this.errorsCount;
        int i12 = this.stallCount;
        long j13 = this.stallDuration;
        Integer num = this.videoIndex;
        a aVar = this.analyticsScreen;
        String str2 = this.widgetName;
        VideoPerfMetricAction.PutVideoPlaybackMetricAction.ErrorDetails.FatalErrorType fatalErrorType = this.typedFatalError;
        StringBuilder d11 = C2942q.d(j11, "PlaybackData(videoUrl=", str, ", startupTime=");
        d11.append(", isStartupFailed=");
        d11.append(z11);
        d11.append(", viewTime=");
        d11.append(j12);
        d11.append(", errorsCount=");
        d11.append(i11);
        d11.append(", stallCount=");
        d11.append(i12);
        d11.append(", stallDuration=");
        d11.append(j13);
        d11.append(", videoIndex=");
        d11.append(num);
        d11.append(", analyticsScreen=");
        d11.append(aVar);
        d11.append(", widgetName=");
        d11.append(str2);
        d11.append(", typedFatalError=");
        d11.append(fatalErrorType);
        d11.append(")");
        return d11.toString();
    }
}
