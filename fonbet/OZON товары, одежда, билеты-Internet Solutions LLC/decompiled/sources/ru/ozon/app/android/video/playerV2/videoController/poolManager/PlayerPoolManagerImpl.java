package ru.ozon.app.android.video.playerV2.videoController.poolManager;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.playerV2.playerController.base.playerConfig.PlayerConfigAlias;
import ru.ozon.app.android.video.playerV2.playerController.pool.PoolPlayerController;
import ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.PlayerPoolStorage;
import ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.config.PoolStorageConfig;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/video/playerV2/videoController/poolManager/PlayerPoolManagerImpl;", "Lru/ozon/app/android/video/playerV2/videoController/poolManager/PlayerPoolManager;", "Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/PlayerPoolStorage;", "playerPoolStorage", "<init>", "(Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/PlayerPoolStorage;)V", "Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;", "playerConfigAlias", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoUrl;", "videoUrl", "Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/config/PoolStorageConfig;", "poolStorageConfig", "Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerController;", "getPoolPlayerController", "(Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;Ljava/lang/String;Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/config/PoolStorageConfig;)Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerController;", "", "stopPreloadedPlayer", "()V", "Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/PlayerPoolStorage;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayerPoolManagerImpl implements PlayerPoolManager {

    @NotNull
    private final PlayerPoolStorage playerPoolStorage;

    public PlayerPoolManagerImpl(@NotNull PlayerPoolStorage playerPoolStorage) {
        Intrinsics.checkNotNullParameter(playerPoolStorage, "playerPoolStorage");
        this.playerPoolStorage = playerPoolStorage;
    }

    @Override // ru.ozon.app.android.video.playerV2.videoController.poolManager.PlayerPoolManager
    public PoolPlayerController getPoolPlayerController(@NotNull PlayerConfigAlias playerConfigAlias, String videoUrl, @NotNull PoolStorageConfig poolStorageConfig) {
        Intrinsics.checkNotNullParameter(playerConfigAlias, "playerConfigAlias");
        Intrinsics.checkNotNullParameter(poolStorageConfig, "poolStorageConfig");
        return this.playerPoolStorage.getPlayerController(playerConfigAlias, videoUrl, poolStorageConfig);
    }

    @Override // ru.ozon.app.android.video.playerV2.videoController.poolManager.PlayerPoolManager
    public void stopPreloadedPlayer() {
        this.playerPoolStorage.stopPreloadedPlayer();
    }
}
