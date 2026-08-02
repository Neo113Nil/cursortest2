package ru.ozon.app.android.video.playerV2.playerController.base.factory;

import Sc.InterfaceC4008j;
import Sc.k;
import Sg.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.video.player.logs.PlayerLogger;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManager;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManagerHelper;
import ru.ozon.app.android.video.playerV2.data.ViewTimeInfoCollector;
import ru.ozon.app.android.video.playerV2.performance.playback.PlaybackAnalyticsListener;
import ru.ozon.app.android.video.playerV2.performance.playback.PlaybackAnalyticsSender;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b!\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010H\u0004¢\u0006\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/factory/AbstractBasePlayerControllerFactory;", "", "LSg/a;", "analyticsScreenStorage", "Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackAnalyticsSender;", "playbackAnalyticsSender", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;", "videoPerfMetricsManager", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;", "videoPerfMetricsManagerHelper", "Lru/ozon/app/android/video/player/logs/PlayerLogger;", "playerLogger", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "<init>", "(LSg/a;Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackAnalyticsSender;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;Lru/ozon/app/android/video/player/logs/PlayerLogger;Lru/ozon/app/android/network/abtool/FeatureService;)V", "LSc/j;", "Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackAnalyticsListener;", "getPlaybackAnalyticsListenerDelegate", "()LSc/j;", "Lru/ozon/app/android/video/playerV2/data/ViewTimeInfoCollector;", "getViewTimeInfoCollectorDelegate", "LSg/a;", "Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackAnalyticsSender;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;", "Lru/ozon/app/android/video/player/logs/PlayerLogger;", "Lru/ozon/app/android/network/abtool/FeatureService;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class AbstractBasePlayerControllerFactory {

    @NotNull
    private final a analyticsScreenStorage;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final PlaybackAnalyticsSender playbackAnalyticsSender;

    @NotNull
    private final PlayerLogger playerLogger;

    @NotNull
    private final VideoPerfMetricsManager videoPerfMetricsManager;

    @NotNull
    private final VideoPerfMetricsManagerHelper videoPerfMetricsManagerHelper;

    public AbstractBasePlayerControllerFactory(@NotNull a analyticsScreenStorage, @NotNull PlaybackAnalyticsSender playbackAnalyticsSender, @NotNull VideoPerfMetricsManager videoPerfMetricsManager, @NotNull VideoPerfMetricsManagerHelper videoPerfMetricsManagerHelper, @NotNull PlayerLogger playerLogger, @NotNull FeatureService featureService) {
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        Intrinsics.checkNotNullParameter(playbackAnalyticsSender, "playbackAnalyticsSender");
        Intrinsics.checkNotNullParameter(videoPerfMetricsManager, "videoPerfMetricsManager");
        Intrinsics.checkNotNullParameter(videoPerfMetricsManagerHelper, "videoPerfMetricsManagerHelper");
        Intrinsics.checkNotNullParameter(playerLogger, "playerLogger");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.analyticsScreenStorage = analyticsScreenStorage;
        this.playbackAnalyticsSender = playbackAnalyticsSender;
        this.videoPerfMetricsManager = videoPerfMetricsManager;
        this.videoPerfMetricsManagerHelper = videoPerfMetricsManagerHelper;
        this.playerLogger = playerLogger;
        this.featureService = featureService;
    }

    @NotNull
    protected final InterfaceC4008j<PlaybackAnalyticsListener> getPlaybackAnalyticsListenerDelegate() {
        return k.b(new AbstractBasePlayerControllerFactory$getPlaybackAnalyticsListenerDelegate$1(this));
    }

    @NotNull
    protected final InterfaceC4008j<ViewTimeInfoCollector> getViewTimeInfoCollectorDelegate() {
        return k.b(AbstractBasePlayerControllerFactory$getViewTimeInfoCollectorDelegate$1.INSTANCE);
    }
}
