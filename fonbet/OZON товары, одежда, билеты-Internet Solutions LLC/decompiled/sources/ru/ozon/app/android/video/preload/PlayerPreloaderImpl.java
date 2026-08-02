package ru.ozon.app.android.video.preload;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.MediaFormat;
import ru.ozon.app.android.video.MediaFormatKt;
import ru.ozon.app.android.video.manager.ExoManager;
import ru.ozon.app.android.video.manager.ExoManagerLive;
import ru.ozon.app.android.video.manager.ProgressiveExoManager;
import ru.ozon.app.android.video.player.performance.PlayerNamespace;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import ru.ozon.app.android.video.playerV2.playerController.base.playerConfig.PlayerConfigAlias;
import ru.ozon.app.android.video.playerV2.playerController.pool.PoolPlayerController;
import ru.ozon.app.android.video.playerV2.playerController.pool.nestedControllers.PoolMediaPlayController;
import ru.ozon.app.android.video.playerV2.playerController.pool.nestedControllers.PoolPreloadController;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.config.PoolStorageConfig;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/video/preload/PlayerPreloaderImpl;", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "videoController", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "progressiveExoManager", "Lru/ozon/app/android/video/manager/ProgressiveExoManager;", "liveExoManager", "Lru/ozon/app/android/video/manager/ExoManagerLive;", "<init>", "(Lru/ozon/app/android/video/playerV2/videoController/VideoController;Lru/ozon/app/android/video/manager/ProgressiveExoManager;Lru/ozon/app/android/video/manager/ExoManagerLive;)V", "lastPreloadedUrl", "", "tryToPreloadPdpVideo", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "getLastPreloadedUrl", "preCreatePlayer", "preloadVideoInfo", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "playerNamespace", "Lru/ozon/app/android/video/player/performance/PlayerNamespace;", "clearPreloadedPlayers", "getExoManager", "Lru/ozon/app/android/video/manager/ExoManager;", "Companion", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayerPreloaderImpl implements PlayerPreloader {
    private String lastPreloadedUrl;

    @NotNull
    private final ExoManagerLive liveExoManager;

    @NotNull
    private final ProgressiveExoManager progressiveExoManager;

    @NotNull
    private final VideoController videoController;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/video/preload/PlayerPreloaderImpl$Companion;", "", "<init>", "()V", "MP4_FORMAT_NAME", "", "HLS_FORMAT_NAME", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PlayerPreloaderImpl(@NotNull VideoController videoController, @NotNull ProgressiveExoManager progressiveExoManager, @NotNull ExoManagerLive liveExoManager) {
        Intrinsics.checkNotNullParameter(videoController, "videoController");
        Intrinsics.checkNotNullParameter(progressiveExoManager, "progressiveExoManager");
        Intrinsics.checkNotNullParameter(liveExoManager, "liveExoManager");
        this.videoController = videoController;
        this.progressiveExoManager = progressiveExoManager;
        this.liveExoManager = liveExoManager;
    }

    private final ExoManager getExoManager(PreloadVideoInfo preloadVideoInfo) {
        if (preloadVideoInfo.getFormat() == PreloadVideoInfo.VideoFormat.HLS) {
            return this.liveExoManager;
        }
        if (preloadVideoInfo.getFormat() == PreloadVideoInfo.VideoFormat.MP4) {
            return this.progressiveExoManager;
        }
        if (MediaFormatKt.extractMediaFormatFromUrl(preloadVideoInfo.getVideoUrl()) == MediaFormat.HLS) {
            return this.liveExoManager;
        }
        if (MediaFormatKt.extractMediaFormatFromUrl(preloadVideoInfo.getVideoUrl()) == MediaFormat.MP4) {
            return this.progressiveExoManager;
        }
        return null;
    }

    @Override // ru.ozon.app.android.video.preload.PlayerPreloader
    public void clearPreloadedPlayers() {
        this.videoController.getPlayerPoolManager().stopPreloadedPlayer();
    }

    @Override // ru.ozon.app.android.video.preload.PlayerPreloader
    public String getLastPreloadedUrl() {
        String str = this.lastPreloadedUrl;
        this.lastPreloadedUrl = null;
        return str;
    }

    @Override // ru.ozon.app.android.video.preload.PlayerPreloader
    public void preCreatePlayer(@NotNull PreloadVideoInfo preloadVideoInfo, @NotNull PlayerNamespace playerNamespace) {
        PoolPreloadController poolPreloadController;
        PoolMediaPlayController mediaPlayController;
        Intrinsics.checkNotNullParameter(preloadVideoInfo, "preloadVideoInfo");
        Intrinsics.checkNotNullParameter(playerNamespace, "playerNamespace");
        ExoManager exoManager = getExoManager(preloadVideoInfo);
        if (exoManager != null) {
            PoolPlayerController poolPlayerController = this.videoController.getPlayerPoolManager().getPoolPlayerController(playerNamespace == PlayerNamespace.REVIEW ? PlayerConfigAlias.ReviewsOnly.INSTANCE : PlayerConfigAlias.Default.INSTANCE, preloadVideoInfo.getVideoUrl(), PoolStorageConfig.DEFAULT);
            if (poolPlayerController != null && (mediaPlayController = poolPlayerController.mediaPlayController()) != null) {
                mediaPlayController.prepareMediaToPlay(preloadVideoInfo.getVideoUrl(), exoManager, false, false, true, new PlayerListenersContainer.Builder().build(), null, null);
                Unit unit = Unit.f71690a;
            }
            if (poolPlayerController != null && (poolPreloadController = poolPlayerController.poolPreloadController()) != null) {
                poolPreloadController.storePreloadedPlayer(preloadVideoInfo.getVideoUrl());
            }
            this.lastPreloadedUrl = preloadVideoInfo.getVideoUrl();
        }
    }

    @Override // ru.ozon.app.android.video.preload.PlayerPreloader
    public void tryToPreloadPdpVideo(@NotNull AtomAction action) {
        AtomAction.Move move;
        Map<String, String> params;
        String str;
        Map<String, String> params2;
        String str2;
        PreloadVideoInfo.VideoFormat videoFormat;
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof AtomAction.Move) || (params = (move = (AtomAction.Move) action).getParams()) == null || (str = params.get("pdpVideoFormat")) == null || (params2 = move.getParams()) == null || (str2 = params2.get("pdpVideoUrl")) == null) {
            return;
        }
        if (str.equals("mp4")) {
            videoFormat = PreloadVideoInfo.VideoFormat.MP4;
        } else if (!str.equals("hls")) {
            return;
        } else {
            videoFormat = PreloadVideoInfo.VideoFormat.HLS;
        }
        preCreatePlayer(new PreloadVideoInfo(str2, videoFormat), PlayerNamespace.GALLERY);
    }
}
