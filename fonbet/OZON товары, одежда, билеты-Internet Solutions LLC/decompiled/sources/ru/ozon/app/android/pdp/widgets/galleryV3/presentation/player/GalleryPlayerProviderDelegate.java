package ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player;

import androidx.media3.ui.PlayerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.playerV2.playerController.base.BasePlayerController;
import ru.ozon.app.android.video.playerV2.playerController.base.playerConfig.PlayerConfigAlias;
import ru.ozon.app.android.video.playerV2.playerController.pool.PoolPlayerController;
import ru.ozon.app.android.video.playerV2.playerController.singleInstance.SingleInstancePlayerController;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.config.PoolStorageConfig;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\b\u0010\u0012\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryPlayerProviderDelegate;", "", "videoController", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "isPlayerPoolSupported", "", "<init>", "(Lru/ozon/app/android/video/playerV2/videoController/VideoController;Z)V", "playerController", "Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerController;", "getPlayerController", "videoUrl", "", "usePlayerPool", "stopOrReleasePlayerController", "", "playerView", "Landroidx/media3/ui/PlayerView;", "createSingleInstancePlayerController", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryPlayerProviderDelegate {
    private final boolean isPlayerPoolSupported;
    private BasePlayerController playerController;

    @NotNull
    private final VideoController videoController;

    public GalleryPlayerProviderDelegate(@NotNull VideoController videoController, boolean z11) {
        Intrinsics.checkNotNullParameter(videoController, "videoController");
        this.videoController = videoController;
        this.isPlayerPoolSupported = z11;
    }

    private final BasePlayerController createSingleInstancePlayerController() {
        return VideoController.DefaultImpls.getSingleInstancePlayerController$default(this.videoController, null, 1, null);
    }

    @NotNull
    public final BasePlayerController getPlayerController(String videoUrl, boolean usePlayerPool) {
        BasePlayerController createSingleInstancePlayerController;
        BasePlayerController basePlayerController = this.playerController;
        if (basePlayerController != null) {
            return basePlayerController;
        }
        if (this.isPlayerPoolSupported && usePlayerPool) {
            createSingleInstancePlayerController = this.videoController.getPlayerPoolManager().getPoolPlayerController(PlayerConfigAlias.Default.INSTANCE, videoUrl, PoolStorageConfig.DEFAULT);
            if (createSingleInstancePlayerController == null) {
                createSingleInstancePlayerController = createSingleInstancePlayerController();
            }
        } else {
            createSingleInstancePlayerController = createSingleInstancePlayerController();
        }
        this.playerController = createSingleInstancePlayerController;
        return createSingleInstancePlayerController;
    }

    public final void stopOrReleasePlayerController(PlayerView playerView) {
        BasePlayerController basePlayerController = this.playerController;
        if (basePlayerController instanceof PoolPlayerController) {
            ((PoolPlayerController) basePlayerController).mediaPlayController().stopAndReturnToFreePool(new GalleryPlayerProviderDelegate$stopOrReleasePlayerController$1(playerView, basePlayerController));
        } else if (basePlayerController instanceof SingleInstancePlayerController) {
            ((SingleInstancePlayerController) basePlayerController).mediaPlayController().release(GalleryPlayerProviderDelegate$stopOrReleasePlayerController$2.INSTANCE);
        }
        this.playerController = null;
    }
}
