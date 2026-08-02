package ru.ozon.app.android.ugc.widgets.reviewTiles.presentation;

import AW.c;
import AW.d;
import Lm0.a;
import androidx.media3.ui.PlayerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.PlayerViewBindStrategy;
import ru.ozon.app.android.video.playerV2.playerController.base.playerConfig.PlayerConfigAlias;
import ru.ozon.app.android.video.playerV2.playerController.pool.PoolPlayerController;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.config.PoolStorageConfig;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/ReviewTilesVideoDelegate;", "", "videoController", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "<init>", "(Lru/ozon/app/android/video/playerV2/videoController/VideoController;)V", "playerController", "Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerController;", "boundPlayerView", "Landroidx/media3/ui/PlayerView;", "videoPreviewControl", "Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/VideoPreviewControl;", "playerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "startPlayback", "", "videoInfo", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "playerView", "stopPlayback", "", "clear", "acquirePoolPlayer", "videoUrl", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewTilesVideoDelegate {
    private PlayerView boundPlayerView;
    private PoolPlayerController playerController;

    @NotNull
    private final PlayerListenersContainer playerListener;

    @NotNull
    private final VideoController videoController;
    private VideoPreviewControl videoPreviewControl;

    public ReviewTilesVideoDelegate(@NotNull VideoController videoController) {
        Intrinsics.checkNotNullParameter(videoController, "videoController");
        this.videoController = videoController;
        PlayerListenersContainer.Builder builder = new PlayerListenersContainer.Builder();
        builder.onRenderedFirstFrame(new c(this));
        builder.onError(new d(this));
        this.playerListener = builder.build();
    }

    private final PoolPlayerController acquirePoolPlayer(String videoUrl) {
        return this.videoController.getPlayerPoolManager().getPoolPlayerController(PlayerConfigAlias.Default.INSTANCE, videoUrl, PoolStorageConfig.DEFAULT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$2$lambda$0(ReviewTilesVideoDelegate reviewTilesVideoDelegate) {
        VideoPreviewControl videoPreviewControl = reviewTilesVideoDelegate.videoPreviewControl;
        if (videoPreviewControl != null) {
            videoPreviewControl.hidePreview();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$2$lambda$1(ReviewTilesVideoDelegate reviewTilesVideoDelegate, String message, Exception exc, Boolean bool) {
        Intrinsics.checkNotNullParameter(message, "message");
        a.f17149a.d("Ошибка + " + message + " + " + exc, new Object[0]);
        VideoPreviewControl videoPreviewControl = reviewTilesVideoDelegate.videoPreviewControl;
        if (videoPreviewControl != null) {
            videoPreviewControl.showPreview();
        }
    }

    public final void clear() {
        stopPlayback();
        this.videoPreviewControl = null;
    }

    public final boolean startPlayback(@NotNull PreloadVideoInfo videoInfo, @NotNull PlayerView playerView, VideoPreviewControl videoPreviewControl) {
        Intrinsics.checkNotNullParameter(videoInfo, "videoInfo");
        Intrinsics.checkNotNullParameter(playerView, "playerView");
        if (videoInfo.getFormat() != PreloadVideoInfo.VideoFormat.MP4) {
            return false;
        }
        PoolPlayerController poolPlayerController = this.playerController;
        if (poolPlayerController == null && (poolPlayerController = acquirePoolPlayer(videoInfo.getVideoUrl())) == null) {
            return false;
        }
        this.playerController = poolPlayerController;
        this.boundPlayerView = playerView;
        this.videoPreviewControl = videoPreviewControl;
        poolPlayerController.playerViewController().bindPlayerView(playerView, PlayerViewBindStrategy.BindBeforeLoadStarted.INSTANCE);
        poolPlayerController.mediaPlayController().prepareMediaToPlay(videoInfo.getVideoUrl(), this.videoController.getProgressiveExoManager(), true, true, true, this.playerListener, null, null);
        return true;
    }

    public final void stopPlayback() {
        VideoPreviewControl videoPreviewControl = this.videoPreviewControl;
        if (videoPreviewControl != null) {
            videoPreviewControl.showPreview();
        }
        PoolPlayerController poolPlayerController = this.playerController;
        if (poolPlayerController == null) {
            return;
        }
        poolPlayerController.mediaPlayController().stopAndReturnToFreePool(new ReviewTilesVideoDelegate$stopPlayback$1(this.boundPlayerView, poolPlayerController));
        this.boundPlayerView = null;
        this.playerController = null;
    }
}
