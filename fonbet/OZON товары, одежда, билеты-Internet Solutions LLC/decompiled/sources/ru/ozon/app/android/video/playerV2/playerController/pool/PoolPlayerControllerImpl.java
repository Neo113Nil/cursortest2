package ru.ozon.app.android.video.playerV2.playerController.pool;

import Gg0.f;
import Sc.InterfaceC4008j;
import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.video.domainreplacement.domain.VideoDomainReplacementService;
import ru.ozon.app.android.video.player.VideoPlaceholderTimeTracker;
import ru.ozon.app.android.video.player.audioRequestService.AudioRequestService;
import ru.ozon.app.android.video.player.performance.VideoWidgetNamesHolder;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManagerHelper;
import ru.ozon.app.android.video.player.playerpreferences.PlayerPreferences;
import ru.ozon.app.android.video.playerV2.data.ViewTimeInfoCollector;
import ru.ozon.app.android.video.playerV2.performance.placeholder.VideoComposablePlaceholderTimeTracker;
import ru.ozon.app.android.video.playerV2.performance.playback.PlaybackAnalyticsListener;
import ru.ozon.app.android.video.playerV2.playerController.base.BasePlayerControllerImpl;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseControllersHub;
import ru.ozon.app.android.video.playerV2.playerController.base.playerConfig.PlayerConfigAlias;
import ru.ozon.app.android.video.playerV2.playerController.pool.nestedControllers.PoolMediaPlayController;
import ru.ozon.app.android.video.playerV2.playerController.pool.nestedControllers.PoolMediaPlayControllerImpl;
import ru.ozon.app.android.video.playerV2.playerController.pool.nestedControllers.PoolPreloadController;
import ru.ozon.app.android.video.playerV2.playerController.pool.nestedControllers.PoolPreloadControllerImpl;
import ru.ozon.app.android.video.playerV2.utils.ExoPlayerUtilsKt;
import ru.ozon.app.android.video.playerV2.utils.VideoModuleExtKt;
import ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.PlayerPoolStorage;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B{\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020#H\u0016¢\u0006\u0004\b,\u0010%J\u0017\u0010/\u001a\n\u0018\u00010-j\u0004\u0018\u0001`.H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u001cH\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020&H\u0016¢\u0006\u0004\b3\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00104R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00105R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00105R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00106R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00107R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00108R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00109R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010:R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010;R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010<R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010=R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010>R\u001b\u0010A\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00105\u001a\u0004\b@\u0010\"R\u001b\u0010,\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u00105\u001a\u0004\bC\u0010%¨\u0006D"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerControllerImpl;", "Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerControllerImpl;", "Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerControllerInternal;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/video/domainreplacement/domain/VideoDomainReplacementService;", "videoDomainReplacementService", "LSc/j;", "Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackAnalyticsListener;", "playbackAnalyticsListenerDelegate", "Lru/ozon/app/android/video/playerV2/data/ViewTimeInfoCollector;", "viewTimeInfoCollectorDelegate", "Lru/ozon/app/android/video/player/performance/VideoWidgetNamesHolder;", "videoWidgetNamesHolder", "LGg0/f;", "placeholderTimeHandler", "Lru/ozon/app/android/video/player/audioRequestService/AudioRequestService;", "audioRequestService", "Lru/ozon/app/android/video/player/playerpreferences/PlayerPreferences;", "videoPreferences", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;", "playerConfigAlias", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;", "videoPerfMetricsManagerHelper", "Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/PlayerPoolStorage;", "playerPoolStorage", "", "releaseAfterUse", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/video/domainreplacement/domain/VideoDomainReplacementService;LSc/j;LSc/j;Lru/ozon/app/android/video/player/performance/VideoWidgetNamesHolder;LGg0/f;Lru/ozon/app/android/video/player/audioRequestService/AudioRequestService;Lru/ozon/app/android/video/player/playerpreferences/PlayerPreferences;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/PlayerPoolStorage;Z)V", "Lru/ozon/app/android/video/playerV2/playerController/pool/nestedControllers/PoolMediaPlayControllerImpl;", "createMediaPlayController", "()Lru/ozon/app/android/video/playerV2/playerController/pool/nestedControllers/PoolMediaPlayControllerImpl;", "Lru/ozon/app/android/video/playerV2/playerController/pool/nestedControllers/PoolPreloadController;", "createPoolPreloadController", "()Lru/ozon/app/android/video/playerV2/playerController/pool/nestedControllers/PoolPreloadController;", "", "release", "()V", "Lru/ozon/app/android/video/playerV2/playerController/pool/nestedControllers/PoolMediaPlayController;", "mediaPlayController", "()Lru/ozon/app/android/video/playerV2/playerController/pool/nestedControllers/PoolMediaPlayController;", "poolPreloadController", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoUrl;", "getPlayerUrl", "()Ljava/lang/String;", "isControllerPlayerActive", "()Z", "returnToPoolOrRelease", "Lru/ozon/app/android/video/domainreplacement/domain/VideoDomainReplacementService;", "LSc/j;", "Lru/ozon/app/android/video/player/performance/VideoWidgetNamesHolder;", "LGg0/f;", "Lru/ozon/app/android/video/player/audioRequestService/AudioRequestService;", "Lru/ozon/app/android/video/player/playerpreferences/PlayerPreferences;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;", "Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/PlayerPoolStorage;", "Z", "poolMediaPlayController$delegate", "getPoolMediaPlayController", "poolMediaPlayController", "poolPreloadController$delegate", "getPoolPreloadController", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PoolPlayerControllerImpl extends BasePlayerControllerImpl implements PoolPlayerControllerInternal {

    @NotNull
    private final AudioRequestService audioRequestService;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final f placeholderTimeHandler;

    @NotNull
    private final InterfaceC4008j<PlaybackAnalyticsListener> playbackAnalyticsListenerDelegate;

    @NotNull
    private final PlayerConfigAlias playerConfigAlias;

    @NotNull
    private final PlayerPoolStorage playerPoolStorage;

    /* renamed from: poolMediaPlayController$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j poolMediaPlayController;

    /* renamed from: poolPreloadController$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j poolPreloadController;
    private final boolean releaseAfterUse;

    @NotNull
    private final VideoDomainReplacementService videoDomainReplacementService;

    @NotNull
    private final VideoPerfMetricsManagerHelper videoPerfMetricsManagerHelper;

    @NotNull
    private final PlayerPreferences videoPreferences;

    @NotNull
    private final VideoWidgetNamesHolder videoWidgetNamesHolder;

    @NotNull
    private final InterfaceC4008j<ViewTimeInfoCollector> viewTimeInfoCollectorDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PoolPlayerControllerImpl(@NotNull Context context, @NotNull VideoDomainReplacementService videoDomainReplacementService, @NotNull InterfaceC4008j<PlaybackAnalyticsListener> playbackAnalyticsListenerDelegate, @NotNull InterfaceC4008j<ViewTimeInfoCollector> viewTimeInfoCollectorDelegate, @NotNull VideoWidgetNamesHolder videoWidgetNamesHolder, @NotNull f placeholderTimeHandler, @NotNull AudioRequestService audioRequestService, @NotNull PlayerPreferences videoPreferences, @NotNull FeatureService featureService, @NotNull PlayerConfigAlias playerConfigAlias, @NotNull VideoPerfMetricsManagerHelper videoPerfMetricsManagerHelper, @NotNull PlayerPoolStorage playerPoolStorage, boolean z11) {
        super(context, featureService, audioRequestService, playbackAnalyticsListenerDelegate, viewTimeInfoCollectorDelegate, videoWidgetNamesHolder, placeholderTimeHandler, playerConfigAlias);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoDomainReplacementService, "videoDomainReplacementService");
        Intrinsics.checkNotNullParameter(playbackAnalyticsListenerDelegate, "playbackAnalyticsListenerDelegate");
        Intrinsics.checkNotNullParameter(viewTimeInfoCollectorDelegate, "viewTimeInfoCollectorDelegate");
        Intrinsics.checkNotNullParameter(videoWidgetNamesHolder, "videoWidgetNamesHolder");
        Intrinsics.checkNotNullParameter(placeholderTimeHandler, "placeholderTimeHandler");
        Intrinsics.checkNotNullParameter(audioRequestService, "audioRequestService");
        Intrinsics.checkNotNullParameter(videoPreferences, "videoPreferences");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(playerConfigAlias, "playerConfigAlias");
        Intrinsics.checkNotNullParameter(videoPerfMetricsManagerHelper, "videoPerfMetricsManagerHelper");
        Intrinsics.checkNotNullParameter(playerPoolStorage, "playerPoolStorage");
        this.videoDomainReplacementService = videoDomainReplacementService;
        this.playbackAnalyticsListenerDelegate = playbackAnalyticsListenerDelegate;
        this.viewTimeInfoCollectorDelegate = viewTimeInfoCollectorDelegate;
        this.videoWidgetNamesHolder = videoWidgetNamesHolder;
        this.placeholderTimeHandler = placeholderTimeHandler;
        this.audioRequestService = audioRequestService;
        this.videoPreferences = videoPreferences;
        this.featureService = featureService;
        this.playerConfigAlias = playerConfigAlias;
        this.videoPerfMetricsManagerHelper = videoPerfMetricsManagerHelper;
        this.playerPoolStorage = playerPoolStorage;
        this.releaseAfterUse = z11;
        this.poolMediaPlayController = VideoModuleExtKt.unsafeLazy(new PoolPlayerControllerImpl$poolMediaPlayController$2(this));
        this.poolPreloadController = VideoModuleExtKt.unsafeLazy(new PoolPlayerControllerImpl$poolPreloadController$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PoolMediaPlayControllerImpl createMediaPlayController() {
        ExoPlayer exoPlayer = getExoPlayer();
        BaseControllersHub baseControllersHub = getBaseControllersHub();
        VideoDomainReplacementService videoDomainReplacementService = this.videoDomainReplacementService;
        AudioRequestService audioRequestService = this.audioRequestService;
        VideoPlaceholderTimeTracker placeholderTimeTracker = getPlaceholderTimeTracker();
        VideoComposablePlaceholderTimeTracker composablePlaceholderTimeTracker = getComposablePlaceholderTimeTracker();
        PlayerPreferences playerPreferences = this.videoPreferences;
        FeatureService featureService = this.featureService;
        Function0<String> onGetCurrentWidgetName = this.playbackAnalyticsListenerDelegate.getValue().onGetCurrentWidgetName();
        return new PoolMediaPlayControllerImpl(exoPlayer, baseControllersHub, audioRequestService, videoDomainReplacementService, this.viewTimeInfoCollectorDelegate, placeholderTimeTracker, composablePlaceholderTimeTracker, playerPreferences, featureService, this.videoPerfMetricsManagerHelper, onGetCurrentWidgetName, new PoolPlayerControllerImpl$createMediaPlayController$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PoolPreloadController createPoolPreloadController() {
        return new PoolPreloadControllerImpl(new PoolPlayerControllerImpl$createPoolPreloadController$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PoolMediaPlayControllerImpl getPoolMediaPlayController() {
        return (PoolMediaPlayControllerImpl) this.poolMediaPlayController.getValue();
    }

    private final PoolPreloadController getPoolPreloadController() {
        return (PoolPreloadController) this.poolPreloadController.getValue();
    }

    private final void release() {
        getPoolMediaPlayController().releaseInternal();
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.pool.PoolPlayerControllerInternal
    public String getPlayerUrl() {
        return ExoPlayerUtilsKt.getCurrentPlayerMediaUrl(getExoPlayer());
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.pool.PoolPlayerControllerInternal
    public boolean isControllerPlayerActive() {
        return ExoPlayerUtilsKt.isPlayerActive(getExoPlayer());
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.pool.PoolPlayerController
    @NotNull
    public PoolPreloadController poolPreloadController() {
        return getPoolPreloadController();
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.pool.PoolPlayerControllerInternal
    public void returnToPoolOrRelease() {
        if (this.releaseAfterUse) {
            release();
        } else {
            this.playerPoolStorage.returnPlayerToPool(this, this.playerConfigAlias);
        }
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.BasePlayerController
    @NotNull
    public PoolMediaPlayController mediaPlayController() {
        return getPoolMediaPlayController();
    }
}
