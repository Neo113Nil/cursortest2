package ru.ozon.app.android.video.playerV2.videoController.poolManager;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.playerV2.playerController.base.playerConfig.PlayerConfigAlias;
import ru.ozon.app.android.video.playerV2.playerController.pool.PoolPlayerController;
import ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.config.PoolStorageConfig;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J1\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/video/playerV2/videoController/poolManager/PlayerPoolManager;", "", "Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;", "playerConfigAlias", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoUrl;", "videoUrl", "Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/config/PoolStorageConfig;", "poolStorageConfig", "Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerController;", "getPoolPlayerController", "(Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;Ljava/lang/String;Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/config/PoolStorageConfig;)Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerController;", "", "stopPreloadedPlayer", "()V", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PlayerPoolManager {
    PoolPlayerController getPoolPlayerController(@NotNull PlayerConfigAlias playerConfigAlias, String videoUrl, @NotNull PoolStorageConfig poolStorageConfig);

    void stopPreloadedPlayer();
}
