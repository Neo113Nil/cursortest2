package ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.playerV2.playerController.base.playerConfig.PlayerConfigAlias;
import ru.ozon.app.android.video.playerV2.playerController.pool.PoolPlayerControllerInternal;
import ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.config.PoolStorageConfig;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J1\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000f\u001a\u00020\u000e2\n\u0010\f\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH'¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/PlayerPoolStorage;", "", "Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;", "playerConfigAlias", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoUrl;", "videoUrl", "Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/config/PoolStorageConfig;", "poolStorageConfig", "Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerControllerInternal;", "getPlayerController", "(Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;Ljava/lang/String;Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/config/PoolStorageConfig;)Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerControllerInternal;", "preloadVideoUrl", "poolPlayerController", "", "storePreloadedPlayer", "(Ljava/lang/String;Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerControllerInternal;Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;)V", "returnPlayerToPool", "(Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerControllerInternal;Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;)V", "stopPreloadedPlayer", "()V", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PlayerPoolStorage {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static void storePreloadedPlayer(@NotNull PlayerPoolStorage playerPoolStorage, @NotNull String preloadVideoUrl, @NotNull PoolPlayerControllerInternal poolPlayerController, @NotNull PlayerConfigAlias playerConfigAlias) {
            Intrinsics.checkNotNullParameter(preloadVideoUrl, "preloadVideoUrl");
            Intrinsics.checkNotNullParameter(poolPlayerController, "poolPlayerController");
            Intrinsics.checkNotNullParameter(playerConfigAlias, "playerConfigAlias");
        }
    }

    PoolPlayerControllerInternal getPlayerController(@NotNull PlayerConfigAlias playerConfigAlias, String videoUrl, @NotNull PoolStorageConfig poolStorageConfig);

    void returnPlayerToPool(@NotNull PoolPlayerControllerInternal poolPlayerController, @NotNull PlayerConfigAlias playerConfigAlias);

    void stopPreloadedPlayer();

    void storePreloadedPlayer(@NotNull String preloadVideoUrl, @NotNull PoolPlayerControllerInternal poolPlayerController, @NotNull PlayerConfigAlias playerConfigAlias);
}
