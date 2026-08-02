package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers;

import F3.InterfaceC3018x;
import Sc.InterfaceC4008j;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.video.R$string;
import ru.ozon.app.android.video.manager.ExoManager;
import ru.ozon.app.android.video.player.VideoPlaceholderTimeTracker;
import ru.ozon.app.android.video.player.audioRequestService.AudioRequestService;
import ru.ozon.app.android.video.player.flags.BlockVideoPlayingFlag;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManagerHelper;
import ru.ozon.app.android.video.player.playerpreferences.PlayerPreferences;
import ru.ozon.app.android.video.playerV2.data.ViewTimeInfoCollector;
import ru.ozon.app.android.video.playerV2.data.ViewTimeInfoKt;
import ru.ozon.app.android.video.playerV2.performance.placeholder.VideoComposablePlaceholderTimeTracker;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import ru.ozon.app.android.video.playerV2.utils.AudioUtilsKt;
import ru.ozon.app.android.video.playerV2.utils.ExoPlayerUtilsKt;
import u3.InterfaceC9928b;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b!\u0018\u00002\u00020\u0001:\u0001FBe\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!JS\u0010.\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020%2\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010-\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001fH\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u001fH\u0016¢\u0006\u0004\b2\u00101J\u000f\u00103\u001a\u00020\u001fH\u0016¢\u0006\u0004\b3\u00101J\u0017\u00105\u001a\u00020\u001f2\u0006\u00104\u001a\u00020%H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020%H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020%H\u0016¢\u0006\u0004\b9\u00108J\u000f\u0010:\u001a\u00020%H\u0016¢\u0006\u0004\b:\u00108J\r\u0010;\u001a\u00020\u001f¢\u0006\u0004\b;\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010?R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010@R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010AR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010BR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010CR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010DR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010E¨\u0006G"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BaseMediaPlayControllerImpl;", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BaseMediaPlayController;", "Landroidx/media3/exoplayer/ExoPlayer;", "exoPlayer", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BaseControllersHub;", "baseControllersHub", "Lru/ozon/app/android/video/player/audioRequestService/AudioRequestService;", "audioRequestService", "Lru/ozon/app/android/video/player/VideoPlaceholderTimeTracker;", "placeholderTimeTracker", "Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker;", "composablePlaceholderTimeTracker", "Lru/ozon/app/android/video/player/playerpreferences/PlayerPreferences;", "videoPreferences", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;", "videoPerfMetricsManagerHelper", "LSc/j;", "Lru/ozon/app/android/video/playerV2/data/ViewTimeInfoCollector;", "viewTimeInfoCollectorDelegate", "Lkotlin/Function0;", "", "onGetCurrentWidgetName", "<init>", "(Landroidx/media3/exoplayer/ExoPlayer;Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BaseControllersHub;Lru/ozon/app/android/video/player/audioRequestService/AudioRequestService;Lru/ozon/app/android/video/player/VideoPlaceholderTimeTracker;Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker;Lru/ozon/app/android/video/player/playerpreferences/PlayerPreferences;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;LSc/j;Lkotlin/jvm/functions/Function0;)V", "exoplayer", "LF3/x;", "mediaSource", "", "startPositionMs", "", "setMediaSource", "(Landroidx/media3/exoplayer/ExoPlayer;LF3/x;J)V", "videoUrl", "Lru/ozon/app/android/video/manager/ExoManager;", "exoManager", "", "playWhenReady", "repeat", "mute", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lu3/b;", "analyticsListener", "position", "prepareMediaToPlay", "(Ljava/lang/String;Lru/ozon/app/android/video/manager/ExoManager;ZZZLru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;Lu3/b;Ljava/lang/Long;)V", "resume", "()V", "pause", "retryLoadMedia", "isRepeatModeEnabled", "updateRepeatMode", "(Z)V", "isPlaying", "()Z", "isReadyToPlayAndPaused", "isPlayerActive", "releaseInternal", "Landroidx/media3/exoplayer/ExoPlayer;", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BaseControllersHub;", "Lru/ozon/app/android/video/player/audioRequestService/AudioRequestService;", "Lru/ozon/app/android/video/player/VideoPlaceholderTimeTracker;", "Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker;", "Lru/ozon/app/android/video/player/playerpreferences/PlayerPreferences;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;", "LSc/j;", "Lkotlin/jvm/functions/Function0;", "EmptyMediaSourceException", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class BaseMediaPlayControllerImpl implements BaseMediaPlayController {

    @NotNull
    private final AudioRequestService audioRequestService;

    @NotNull
    private final BaseControllersHub baseControllersHub;

    @NotNull
    private final VideoComposablePlaceholderTimeTracker composablePlaceholderTimeTracker;

    @NotNull
    private final ExoPlayer exoPlayer;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final Function0<String> onGetCurrentWidgetName;

    @NotNull
    private final VideoPlaceholderTimeTracker placeholderTimeTracker;

    @NotNull
    private final VideoPerfMetricsManagerHelper videoPerfMetricsManagerHelper;

    @NotNull
    private final PlayerPreferences videoPreferences;

    @NotNull
    private final InterfaceC4008j<ViewTimeInfoCollector> viewTimeInfoCollectorDelegate;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BaseMediaPlayControllerImpl$EmptyMediaSourceException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "<init>", "()V", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class EmptyMediaSourceException extends IllegalStateException {
    }

    public BaseMediaPlayControllerImpl(@NotNull ExoPlayer exoPlayer, @NotNull BaseControllersHub baseControllersHub, @NotNull AudioRequestService audioRequestService, @NotNull VideoPlaceholderTimeTracker placeholderTimeTracker, @NotNull VideoComposablePlaceholderTimeTracker composablePlaceholderTimeTracker, @NotNull PlayerPreferences videoPreferences, @NotNull FeatureService featureService, @NotNull VideoPerfMetricsManagerHelper videoPerfMetricsManagerHelper, @NotNull InterfaceC4008j<ViewTimeInfoCollector> viewTimeInfoCollectorDelegate, @NotNull Function0<String> onGetCurrentWidgetName) {
        Intrinsics.checkNotNullParameter(exoPlayer, "exoPlayer");
        Intrinsics.checkNotNullParameter(baseControllersHub, "baseControllersHub");
        Intrinsics.checkNotNullParameter(audioRequestService, "audioRequestService");
        Intrinsics.checkNotNullParameter(placeholderTimeTracker, "placeholderTimeTracker");
        Intrinsics.checkNotNullParameter(composablePlaceholderTimeTracker, "composablePlaceholderTimeTracker");
        Intrinsics.checkNotNullParameter(videoPreferences, "videoPreferences");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(videoPerfMetricsManagerHelper, "videoPerfMetricsManagerHelper");
        Intrinsics.checkNotNullParameter(viewTimeInfoCollectorDelegate, "viewTimeInfoCollectorDelegate");
        Intrinsics.checkNotNullParameter(onGetCurrentWidgetName, "onGetCurrentWidgetName");
        this.exoPlayer = exoPlayer;
        this.baseControllersHub = baseControllersHub;
        this.audioRequestService = audioRequestService;
        this.placeholderTimeTracker = placeholderTimeTracker;
        this.composablePlaceholderTimeTracker = composablePlaceholderTimeTracker;
        this.videoPreferences = videoPreferences;
        this.featureService = featureService;
        this.videoPerfMetricsManagerHelper = videoPerfMetricsManagerHelper;
        this.viewTimeInfoCollectorDelegate = viewTimeInfoCollectorDelegate;
        this.onGetCurrentWidgetName = onGetCurrentWidgetName;
    }

    private final void setMediaSource(ExoPlayer exoplayer, InterfaceC3018x mediaSource, long startPositionMs) {
        exoplayer.X(mediaSource, startPositionMs);
        this.baseControllersHub.onDiscardHistoryStats();
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseMediaPlayController
    public boolean isPlayerActive() {
        return ExoPlayerUtilsKt.isPlayerActive(this.exoPlayer);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseMediaPlayController
    public boolean isPlaying() {
        return this.exoPlayer.isPlaying();
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseMediaPlayController
    public boolean isReadyToPlayAndPaused() {
        return this.exoPlayer.P() == 3 && !this.exoPlayer.isPlaying();
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseMediaPlayController
    public void pause() {
        this.exoPlayer.D(false);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseMediaPlayController
    public void prepareMediaToPlay(@NotNull String videoUrl, @NotNull ExoManager exoManager, boolean playWhenReady, boolean repeat, boolean mute, @NotNull PlayerListenersContainer listener, InterfaceC9928b analyticsListener, Long position) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(exoManager, "exoManager");
        Intrinsics.checkNotNullParameter(listener, "listener");
        boolean d11 = Intrinsics.d(ExoPlayerUtilsKt.getCurrentPlayerMediaUrl(this.exoPlayer), videoUrl);
        boolean d12 = Intrinsics.d(listener, this.baseControllersHub.getCurrentPlayerListener());
        boolean z11 = false;
        if (d11 && ExoPlayerUtilsKt.isPlayerActive(this.exoPlayer) && d12) {
            this.baseControllersHub.setMuteOnMediaPrepare(mute);
            this.exoPlayer.S(repeat ? 2 : 0);
            if (position != null) {
                this.exoPlayer.seekTo(position.longValue());
            }
            this.exoPlayer.D(playWhenReady);
            return;
        }
        this.exoPlayer.D(false);
        this.baseControllersHub.setPlayerListenerOnMediaPrepare(listener);
        this.baseControllersHub.setMuteOnMediaPrepare(mute);
        this.placeholderTimeTracker.onVideoLoadingStarted(videoUrl, exoManager);
        this.composablePlaceholderTimeTracker.onVideoLoadingStarted(videoUrl, exoManager);
        InterfaceC3018x mediaSource = exoManager.getMediaSource(videoUrl, null);
        if (mediaSource == null) {
            this.placeholderTimeTracker.onPlayerError(new EmptyMediaSourceException());
            this.composablePlaceholderTimeTracker.onPlayerError(new EmptyMediaSourceException());
            listener.onError(StringProvider.getString(R$string.error_common_player_error), null, null);
            return;
        }
        if (analyticsListener != null) {
            this.exoPlayer.c(analyticsListener);
        }
        setMediaSource(this.exoPlayer, mediaSource, position != null ? position.longValue() : 0L);
        this.exoPlayer.S(repeat ? 2 : 0);
        VideoPerfMetricsManagerHelper videoPerfMetricsManagerHelper = this.videoPerfMetricsManagerHelper;
        String invoke = this.onGetCurrentWidgetName.invoke();
        if (invoke == null) {
            invoke = "UNSPECIFIED";
        }
        videoPerfMetricsManagerHelper.addVideoUrlToActive(videoUrl, invoke);
        ViewTimeInfoKt.resetIfInitialized(this.viewTimeInfoCollectorDelegate);
        this.exoPlayer.prepare();
        ExoPlayer exoPlayer = this.exoPlayer;
        if (!this.videoPreferences.isBlockVideoPlaying() && playWhenReady && !this.featureService.getBooleanKey(BlockVideoPlayingFlag.INSTANCE)) {
            z11 = true;
        }
        exoPlayer.D(z11);
        this.baseControllersHub.onCheckLoadErrorFlagChanged(true);
    }

    public final void releaseInternal() {
        this.baseControllersHub.onCheckLoadErrorFlagChanged(false);
        this.exoPlayer.release();
        this.baseControllersHub.onReleasePlayerListener();
        AudioUtilsKt.abandonAudioFocusRequestForPlayer(this.audioRequestService, this.exoPlayer);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseMediaPlayController
    public void resume() {
        this.exoPlayer.D((this.videoPreferences.isBlockVideoPlaying() || this.featureService.getBooleanKey(BlockVideoPlayingFlag.INSTANCE)) ? false : true);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseMediaPlayController
    public void retryLoadMedia() {
        if (this.exoPlayer.P() != 1) {
            return;
        }
        this.exoPlayer.D(false);
        String currentPlayerMediaUrl = ExoPlayerUtilsKt.getCurrentPlayerMediaUrl(this.exoPlayer);
        if (currentPlayerMediaUrl != null) {
            VideoPerfMetricsManagerHelper videoPerfMetricsManagerHelper = this.videoPerfMetricsManagerHelper;
            String invoke = this.onGetCurrentWidgetName.invoke();
            if (invoke == null) {
                invoke = "UNSPECIFIED";
            }
            videoPerfMetricsManagerHelper.addVideoUrlToActive(currentPlayerMediaUrl, invoke);
        }
        ViewTimeInfoKt.resetIfInitialized(this.viewTimeInfoCollectorDelegate);
        this.exoPlayer.prepare();
        this.exoPlayer.D(true);
        this.baseControllersHub.onCheckLoadErrorFlagChanged(true);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseMediaPlayController
    public void updateRepeatMode(boolean isRepeatModeEnabled) {
        this.exoPlayer.S(isRepeatModeEnabled ? 2 : 0);
    }
}
