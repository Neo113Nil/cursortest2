package ru.ozon.app.android.video.playerV2.videoController.poolManager.factory;

import Gg0.f;
import Sg.a;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.video.domainreplacement.domain.VideoDomainReplacementService;
import ru.ozon.app.android.video.player.audioRequestService.AudioRequestService;
import ru.ozon.app.android.video.player.logs.PlayerLogger;
import ru.ozon.app.android.video.player.performance.VideoWidgetNamesHolder;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManager;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManagerHelper;
import ru.ozon.app.android.video.player.playerpreferences.PlayerPreferences;
import ru.ozon.app.android.video.playerV2.performance.playback.PlaybackAnalyticsSender;
import ru.ozon.app.android.video.playerV2.playerController.base.factory.AbstractBasePlayerControllerFactory;
import ru.ozon.app.android.video.playerV2.playerController.base.playerConfig.PlayerConfigAlias;
import ru.ozon.app.android.video.playerV2.playerController.pool.PoolPlayerControllerImpl;
import ru.ozon.app.android.video.playerV2.playerController.pool.PoolPlayerControllerInternal;
import ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.PlayerPoolStorage;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001Bi\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b#\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010)R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010+R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010,R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010-R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010.R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/video/playerV2/videoController/poolManager/factory/PoolPlayerFactory;", "Lru/ozon/app/android/video/playerV2/playerController/base/factory/AbstractBasePlayerControllerFactory;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/video/player/audioRequestService/AudioRequestService;", "audioRequestService", "Lru/ozon/app/android/video/player/playerpreferences/PlayerPreferences;", "videoPreferences", "Lru/ozon/app/android/video/player/performance/VideoWidgetNamesHolder;", "videoWidgetNamesHolder", "LGg0/f;", "placeholderTimeHandler", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/video/domainreplacement/domain/VideoDomainReplacementService;", "videoDomainReplacementService", "LSg/a;", "analyticsScreenStorage", "Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackAnalyticsSender;", "playbackAnalyticsSender", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;", "videoPerfMetricsManager", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;", "videoPerfMetricsManagerHelper", "Lru/ozon/app/android/video/player/logs/PlayerLogger;", "playerLogger", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/video/player/audioRequestService/AudioRequestService;Lru/ozon/app/android/video/player/playerpreferences/PlayerPreferences;Lru/ozon/app/android/video/player/performance/VideoWidgetNamesHolder;LGg0/f;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/video/domainreplacement/domain/VideoDomainReplacementService;LSg/a;Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackAnalyticsSender;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;Lru/ozon/app/android/video/player/logs/PlayerLogger;)V", "Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;", "playerConfigAlias", "Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/PlayerPoolStorage;", "playerPoolStorage", "Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerControllerInternal;", "getPlayerControllerFromPull", "(Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/PlayerPoolStorage;)Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerControllerInternal;", "getPlayerControllerOutOfPool", "Landroid/content/Context;", "Lru/ozon/app/android/video/player/audioRequestService/AudioRequestService;", "Lru/ozon/app/android/video/player/playerpreferences/PlayerPreferences;", "Lru/ozon/app/android/video/player/performance/VideoWidgetNamesHolder;", "LGg0/f;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/video/domainreplacement/domain/VideoDomainReplacementService;", "LSg/a;", "Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackAnalyticsSender;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;", "Lru/ozon/app/android/video/player/logs/PlayerLogger;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PoolPlayerFactory extends AbstractBasePlayerControllerFactory {

    @NotNull
    private final a analyticsScreenStorage;

    @NotNull
    private final AudioRequestService audioRequestService;

    @NotNull
    private final Context context;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final f placeholderTimeHandler;

    @NotNull
    private final PlaybackAnalyticsSender playbackAnalyticsSender;

    @NotNull
    private final PlayerLogger playerLogger;

    @NotNull
    private final VideoDomainReplacementService videoDomainReplacementService;

    @NotNull
    private final VideoPerfMetricsManager videoPerfMetricsManager;

    @NotNull
    private final VideoPerfMetricsManagerHelper videoPerfMetricsManagerHelper;

    @NotNull
    private final PlayerPreferences videoPreferences;

    @NotNull
    private final VideoWidgetNamesHolder videoWidgetNamesHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PoolPlayerFactory(@NotNull Context context, @NotNull AudioRequestService audioRequestService, @NotNull PlayerPreferences videoPreferences, @NotNull VideoWidgetNamesHolder videoWidgetNamesHolder, @NotNull f placeholderTimeHandler, @NotNull FeatureService featureService, @NotNull VideoDomainReplacementService videoDomainReplacementService, @NotNull a analyticsScreenStorage, @NotNull PlaybackAnalyticsSender playbackAnalyticsSender, @NotNull VideoPerfMetricsManager videoPerfMetricsManager, @NotNull VideoPerfMetricsManagerHelper videoPerfMetricsManagerHelper, @NotNull PlayerLogger playerLogger) {
        super(analyticsScreenStorage, playbackAnalyticsSender, videoPerfMetricsManager, videoPerfMetricsManagerHelper, playerLogger, featureService);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(audioRequestService, "audioRequestService");
        Intrinsics.checkNotNullParameter(videoPreferences, "videoPreferences");
        Intrinsics.checkNotNullParameter(videoWidgetNamesHolder, "videoWidgetNamesHolder");
        Intrinsics.checkNotNullParameter(placeholderTimeHandler, "placeholderTimeHandler");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(videoDomainReplacementService, "videoDomainReplacementService");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        Intrinsics.checkNotNullParameter(playbackAnalyticsSender, "playbackAnalyticsSender");
        Intrinsics.checkNotNullParameter(videoPerfMetricsManager, "videoPerfMetricsManager");
        Intrinsics.checkNotNullParameter(videoPerfMetricsManagerHelper, "videoPerfMetricsManagerHelper");
        Intrinsics.checkNotNullParameter(playerLogger, "playerLogger");
        this.context = context;
        this.audioRequestService = audioRequestService;
        this.videoPreferences = videoPreferences;
        this.videoWidgetNamesHolder = videoWidgetNamesHolder;
        this.placeholderTimeHandler = placeholderTimeHandler;
        this.featureService = featureService;
        this.videoDomainReplacementService = videoDomainReplacementService;
        this.analyticsScreenStorage = analyticsScreenStorage;
        this.playbackAnalyticsSender = playbackAnalyticsSender;
        this.videoPerfMetricsManager = videoPerfMetricsManager;
        this.videoPerfMetricsManagerHelper = videoPerfMetricsManagerHelper;
        this.playerLogger = playerLogger;
    }

    @NotNull
    public final PoolPlayerControllerInternal getPlayerControllerFromPull(@NotNull PlayerConfigAlias playerConfigAlias, @NotNull PlayerPoolStorage playerPoolStorage) {
        Intrinsics.checkNotNullParameter(playerConfigAlias, "playerConfigAlias");
        Intrinsics.checkNotNullParameter(playerPoolStorage, "playerPoolStorage");
        return new PoolPlayerControllerImpl(this.context, this.videoDomainReplacementService, getPlaybackAnalyticsListenerDelegate(), getViewTimeInfoCollectorDelegate(), this.videoWidgetNamesHolder, this.placeholderTimeHandler, this.audioRequestService, this.videoPreferences, this.featureService, playerConfigAlias, this.videoPerfMetricsManagerHelper, playerPoolStorage, false);
    }

    @NotNull
    public final PoolPlayerControllerInternal getPlayerControllerOutOfPool(@NotNull PlayerConfigAlias playerConfigAlias, @NotNull PlayerPoolStorage playerPoolStorage) {
        Intrinsics.checkNotNullParameter(playerConfigAlias, "playerConfigAlias");
        Intrinsics.checkNotNullParameter(playerPoolStorage, "playerPoolStorage");
        return new PoolPlayerControllerImpl(this.context, this.videoDomainReplacementService, getPlaybackAnalyticsListenerDelegate(), getViewTimeInfoCollectorDelegate(), this.videoWidgetNamesHolder, this.placeholderTimeHandler, this.audioRequestService, this.videoPreferences, this.featureService, playerConfigAlias, this.videoPerfMetricsManagerHelper, playerPoolStorage, true);
    }
}
