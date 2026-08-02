package ru.ozon.app.android.video.playerV2.videoController;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.manager.ExoManagerProvider;
import ru.ozon.app.android.video.playerV2.playerController.base.playerConfig.PlayerConfigAlias;
import ru.ozon.app.android.video.playerV2.playerController.singleInstance.SingleInstancePlayerController;
import ru.ozon.app.android.video.playerV2.videoController.poolManager.PlayerPoolManager;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H'J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "Lru/ozon/app/android/video/manager/ExoManagerProvider;", "getSingleInstancePlayerController", "Lru/ozon/app/android/video/playerV2/playerController/singleInstance/SingleInstancePlayerController;", "playerConfigAlias", "Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;", "playerPoolManager", "Lru/ozon/app/android/video/playerV2/videoController/poolManager/PlayerPoolManager;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface VideoController extends ExoManagerProvider {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ SingleInstancePlayerController getSingleInstancePlayerController$default(VideoController videoController, PlayerConfigAlias playerConfigAlias, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSingleInstancePlayerController");
            }
            if ((i11 & 1) != 0) {
                playerConfigAlias = PlayerConfigAlias.Default.INSTANCE;
            }
            return videoController.getSingleInstancePlayerController(playerConfigAlias);
        }
    }

    @NotNull
    SingleInstancePlayerController getSingleInstancePlayerController(@NotNull PlayerConfigAlias playerConfigAlias);

    @NotNull
    PlayerPoolManager playerPoolManager();
}
