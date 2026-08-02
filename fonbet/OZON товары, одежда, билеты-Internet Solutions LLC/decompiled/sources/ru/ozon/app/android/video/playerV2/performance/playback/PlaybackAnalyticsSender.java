package ru.ozon.app.android.video.playerV2.performance.playback;

import Rg.a;
import Sc.InterfaceC4008j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qj.C9067a;
import ru.ozon.android.networkinfo.models.ConnectionType;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.video.player.performance.PlayerNamespace;
import ru.ozon.app.android.video.player.performance.PlayerNamespaceKt;
import ru.ozon.app.android.video.player.performance.VideoTraceEntity;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoAsset;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricAction;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManager;
import ru.ozon.app.android.video.playerV2.performance.playback.playbackData.PlaybackData;
import ru.ozon.app.android.video.playerV2.utils.VideoModuleExtKt;
import ru.ozon.tracker.performance.ObjectTypes;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001b\u0010\u0019\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackAnalyticsSender;", "", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lqj/a;", "networkInfoProvider", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;Lqj/a;)V", "", "", "toSec", "(J)D", "Lru/ozon/app/android/video/playerV2/performance/playback/playbackData/PlaybackData;", "playbackData", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;", "videoPerfMetricsManager", "", "sendPlaybackData", "(Lru/ozon/app/android/video/playerV2/performance/playback/playbackData/PlaybackData;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;)Z", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lqj/a;", "videoTrackingEnabled$delegate", "LSc/j;", "getVideoTrackingEnabled", "()Z", "videoTrackingEnabled", "loadVideoTrackingEnabled$delegate", "getLoadVideoTrackingEnabled", "loadVideoTrackingEnabled", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlaybackAnalyticsSender {

    @NotNull
    private final FeatureChecker featureChecker;

    /* renamed from: loadVideoTrackingEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j loadVideoTrackingEnabled;

    @NotNull
    private final C9067a networkInfoProvider;

    /* renamed from: videoTrackingEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j videoTrackingEnabled;

    public PlaybackAnalyticsSender(@NotNull FeatureChecker featureChecker, @NotNull C9067a networkInfoProvider) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        this.featureChecker = featureChecker;
        this.networkInfoProvider = networkInfoProvider;
        this.videoTrackingEnabled = VideoModuleExtKt.publicationLazy(new PlaybackAnalyticsSender$videoTrackingEnabled$2(this));
        this.loadVideoTrackingEnabled = VideoModuleExtKt.publicationLazy(new PlaybackAnalyticsSender$loadVideoTrackingEnabled$2(this));
    }

    private final boolean getLoadVideoTrackingEnabled() {
        return ((Boolean) this.loadVideoTrackingEnabled.getValue()).booleanValue();
    }

    private final boolean getVideoTrackingEnabled() {
        return ((Boolean) this.videoTrackingEnabled.getValue()).booleanValue();
    }

    private final double toSec(long j11) {
        return j11 / 1000.0d;
    }

    public final boolean sendPlaybackData(@NotNull PlaybackData playbackData, @NotNull VideoPerfMetricsManager videoPerfMetricsManager) {
        Intrinsics.checkNotNullParameter(playbackData, "playbackData");
        Intrinsics.checkNotNullParameter(videoPerfMetricsManager, "videoPerfMetricsManager");
        if (!getVideoTrackingEnabled()) {
            return false;
        }
        Integer videoIndex = playbackData.getVideoIndex();
        a analyticsScreen = playbackData.getAnalyticsScreen();
        String widgetName = playbackData.getWidgetName();
        PlayerNamespace mapToPlayerNamespace = PlayerNamespaceKt.mapToPlayerNamespace(widgetName);
        String name = mapToPlayerNamespace.name();
        VideoPerfMetricAction.PutVideoPlaybackMetricAction.ErrorDetails.FatalErrorType typedFatalError = playbackData.getTypedFatalError();
        String videoUrl = playbackData.getVideoUrl();
        double sec = toSec(playbackData.getStartupTime());
        ConnectionType g10 = C9067a.g(this.networkInfoProvider);
        ObjectTypes objectTypes = ObjectTypes.CUSTOM;
        String g11 = analyticsScreen != null ? analyticsScreen.g() : null;
        VideoTraceEntity videoTraceEntity = new VideoTraceEntity(g10, videoUrl, objectTypes, widgetName, videoIndex, g11, analyticsScreen != null ? analyticsScreen.f() : null, analyticsScreen != null ? analyticsScreen.c() : null, analyticsScreen != null ? analyticsScreen.i() : null, mapToPlayerNamespace.name(), getVideoTrackingEnabled(), getLoadVideoTrackingEnabled());
        VideoPerfMetricAction.PutVideoPlaybackMetricAction.ErrorDetails errorDetails = new VideoPerfMetricAction.PutVideoPlaybackMetricAction.ErrorDetails(playbackData.getErrorsCount(), typedFatalError, VideoPerfMetricAction.PutVideoPlaybackMetricAction.ErrorDetails.INSTANCE.isTimeoutError(sec));
        int stallCount = playbackData.getStallCount();
        double sec2 = toSec(playbackData.getStallDuration());
        double sec3 = toSec(playbackData.getViewTime());
        int errorsCount = playbackData.getErrorsCount();
        videoPerfMetricsManager.sendAnalyticsByUrl(VideoAsset.INSTANCE.emptyVideoAsset$video_prodGoogleAllVendorsRelease(videoUrl), new VideoPerfMetricAction.PutVideoPlaybackMetricAction(videoIndex, Integer.valueOf(stallCount), Double.valueOf(sec2), Double.valueOf(sec), Double.valueOf(sec3), name, Integer.valueOf(errorsCount), playbackData.getIsStartupFailed() ? 1 : null, errorDetails), videoTraceEntity, mapToPlayerNamespace);
        return true;
    }
}
