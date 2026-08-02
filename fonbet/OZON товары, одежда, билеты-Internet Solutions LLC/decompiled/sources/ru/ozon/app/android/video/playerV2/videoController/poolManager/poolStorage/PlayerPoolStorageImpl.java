package ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage;

import Sc.InterfaceC4008j;
import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.video.player.logs.PlayerLogger;
import ru.ozon.app.android.video.playerV2.playerController.base.playerConfig.PlayerConfigAlias;
import ru.ozon.app.android.video.playerV2.playerController.pool.PoolPlayerControllerInternal;
import ru.ozon.app.android.video.playerV2.utils.VideoModuleExtKt;
import ru.ozon.app.android.video.playerV2.videoController.poolManager.factory.PoolPlayerFactory;
import ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.config.PoolStorageConfig;
import ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.preload.PoolPreloadInfo;
import ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.preload.PoolPreloadInfoKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u001f\u001a\u00020\u00192\n\u0010\u001e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010-\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010,R\u001b\u00100\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b/\u0010,R\u001b\u00103\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u0010,R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/PlayerPoolStorageImpl;", "Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/PlayerPoolStorage;", "Lru/ozon/app/android/video/playerV2/videoController/poolManager/factory/PoolPlayerFactory;", "poolPlayerFactory", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/video/player/logs/PlayerLogger;", "playerLogger", "<init>", "(Lru/ozon/app/android/video/playerV2/videoController/poolManager/factory/PoolPlayerFactory;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/video/player/logs/PlayerLogger;)V", "Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;", "playerConfigAlias", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoUrl;", "videoUrl", "Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/config/PoolStorageConfig;", "poolStorageConfig", "Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerControllerInternal;", "getPlayerControllerByStorage", "(Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;Ljava/lang/String;Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/config/PoolStorageConfig;)Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerControllerInternal;", "alias", "getStorageByType", "(Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;)Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/PlayerPoolStorage;", "getPlayerController", "poolPlayerController", "", "returnPlayerToPool", "(Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerControllerInternal;Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;)V", "stopPreloadedPlayer", "()V", "preloadVideoUrl", "storePreloadedPlayer", "(Ljava/lang/String;Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerControllerInternal;Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;)V", "Lru/ozon/app/android/video/playerV2/videoController/poolManager/factory/PoolPlayerFactory;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/video/player/logs/PlayerLogger;", "", "logPlayerErrors$delegate", "LSc/j;", "getLogPlayerErrors", "()Z", "logPlayerErrors", "defaultStorage$delegate", "getDefaultStorage", "()Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/PlayerPoolStorage;", "defaultStorage", "experimentalBandwidthPlayerStorage$delegate", "getExperimentalBandwidthPlayerStorage", "experimentalBandwidthPlayerStorage", "reviewsOnlyPlayerStorage$delegate", "getReviewsOnlyPlayerStorage", "reviewsOnlyPlayerStorage", "Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/preload/PoolPreloadInfo;", "preloadedPlayerInfo", "Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/preload/PoolPreloadInfo;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayerPoolStorageImpl implements PlayerPoolStorage {

    /* renamed from: defaultStorage$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j defaultStorage;

    /* renamed from: experimentalBandwidthPlayerStorage$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j experimentalBandwidthPlayerStorage;

    @NotNull
    private final FeatureService featureService;

    /* renamed from: logPlayerErrors$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j logPlayerErrors;

    @NotNull
    private final PlayerLogger playerLogger;

    @NotNull
    private final PoolPlayerFactory poolPlayerFactory;
    private PoolPreloadInfo preloadedPlayerInfo;

    /* renamed from: reviewsOnlyPlayerStorage$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j reviewsOnlyPlayerStorage;

    public PlayerPoolStorageImpl(@NotNull PoolPlayerFactory poolPlayerFactory, @NotNull FeatureService featureService, @NotNull PlayerLogger playerLogger) {
        Intrinsics.checkNotNullParameter(poolPlayerFactory, "poolPlayerFactory");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(playerLogger, "playerLogger");
        this.poolPlayerFactory = poolPlayerFactory;
        this.featureService = featureService;
        this.playerLogger = playerLogger;
        this.logPlayerErrors = VideoModuleExtKt.publicationLazy(new PlayerPoolStorageImpl$logPlayerErrors$2(this));
        this.defaultStorage = VideoModuleExtKt.publicationLazy(new PlayerPoolStorageImpl$defaultStorage$2(this));
        this.experimentalBandwidthPlayerStorage = VideoModuleExtKt.publicationLazy(new PlayerPoolStorageImpl$experimentalBandwidthPlayerStorage$2(this));
        this.reviewsOnlyPlayerStorage = VideoModuleExtKt.publicationLazy(new PlayerPoolStorageImpl$reviewsOnlyPlayerStorage$2(this));
    }

    private final PlayerPoolStorage getDefaultStorage() {
        return (PlayerPoolStorage) this.defaultStorage.getValue();
    }

    private final PlayerPoolStorage getExperimentalBandwidthPlayerStorage() {
        return (PlayerPoolStorage) this.experimentalBandwidthPlayerStorage.getValue();
    }

    private final boolean getLogPlayerErrors() {
        return ((Boolean) this.logPlayerErrors.getValue()).booleanValue();
    }

    private final PoolPlayerControllerInternal getPlayerControllerByStorage(PlayerConfigAlias playerConfigAlias, String videoUrl, PoolStorageConfig poolStorageConfig) {
        return getStorageByType(playerConfigAlias).getPlayerController(playerConfigAlias, videoUrl, poolStorageConfig);
    }

    private final PlayerPoolStorage getReviewsOnlyPlayerStorage() {
        return (PlayerPoolStorage) this.reviewsOnlyPlayerStorage.getValue();
    }

    private final PlayerPoolStorage getStorageByType(PlayerConfigAlias alias) {
        if (Intrinsics.d(alias, PlayerConfigAlias.Default.INSTANCE)) {
            return getDefaultStorage();
        }
        if (Intrinsics.d(alias, PlayerConfigAlias.ExperimentalBandwidth.INSTANCE)) {
            return getExperimentalBandwidthPlayerStorage();
        }
        if (Intrinsics.d(alias, PlayerConfigAlias.ReviewsOnly.INSTANCE)) {
            return getReviewsOnlyPlayerStorage();
        }
        throw new o();
    }

    @Override // ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.PlayerPoolStorage
    public PoolPlayerControllerInternal getPlayerController(@NotNull PlayerConfigAlias playerConfigAlias, String videoUrl, @NotNull PoolStorageConfig poolStorageConfig) {
        Intrinsics.checkNotNullParameter(playerConfigAlias, "playerConfigAlias");
        Intrinsics.checkNotNullParameter(poolStorageConfig, "poolStorageConfig");
        PoolPreloadInfo poolPreloadInfo = this.preloadedPlayerInfo;
        if (poolPreloadInfo == null) {
            return getPlayerControllerByStorage(playerConfigAlias, videoUrl, poolStorageConfig);
        }
        PoolPlayerControllerInternal playerControllerIfMatch = poolPreloadInfo.getPlayerControllerIfMatch(playerConfigAlias, videoUrl);
        this.preloadedPlayerInfo = null;
        if (playerControllerIfMatch != null) {
            return playerControllerIfMatch;
        }
        poolPreloadInfo.returnToPoolOrRelease();
        return getPlayerControllerByStorage(playerConfigAlias, videoUrl, poolStorageConfig);
    }

    @Override // ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.PlayerPoolStorage
    public void returnPlayerToPool(@NotNull PoolPlayerControllerInternal poolPlayerController, @NotNull PlayerConfigAlias playerConfigAlias) {
        Intrinsics.checkNotNullParameter(poolPlayerController, "poolPlayerController");
        Intrinsics.checkNotNullParameter(playerConfigAlias, "playerConfigAlias");
        getStorageByType(playerConfigAlias).returnPlayerToPool(poolPlayerController, playerConfigAlias);
    }

    @Override // ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.PlayerPoolStorage
    public void stopPreloadedPlayer() {
        PoolPreloadInfo poolPreloadInfo = this.preloadedPlayerInfo;
        if (poolPreloadInfo != null) {
            poolPreloadInfo.returnToPoolOrRelease();
        }
        this.preloadedPlayerInfo = null;
    }

    @Override // ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.PlayerPoolStorage
    public void storePreloadedPlayer(@NotNull String preloadVideoUrl, @NotNull PoolPlayerControllerInternal poolPlayerController, @NotNull PlayerConfigAlias playerConfigAlias) {
        String str;
        Intrinsics.checkNotNullParameter(preloadVideoUrl, "preloadVideoUrl");
        Intrinsics.checkNotNullParameter(poolPlayerController, "poolPlayerController");
        Intrinsics.checkNotNullParameter(playerConfigAlias, "playerConfigAlias");
        if (this.preloadedPlayerInfo == null) {
            this.preloadedPlayerInfo = new PoolPreloadInfo(preloadVideoUrl, poolPlayerController, playerConfigAlias);
            return;
        }
        if (getLogPlayerErrors()) {
            PlayerLogger playerLogger = this.playerLogger;
            PoolPreloadInfo poolPreloadInfo = this.preloadedPlayerInfo;
            if (poolPreloadInfo == null || (str = PoolPreloadInfoKt.videoUrl(poolPreloadInfo)) == null) {
                str = "";
            }
            playerLogger.logNonFatalPlayerError("Unused preloaded player detected", str, "", "", "NONE");
        }
        PoolPreloadInfo poolPreloadInfo2 = this.preloadedPlayerInfo;
        if (poolPreloadInfo2 != null) {
            poolPreloadInfo2.returnToPoolOrRelease();
        }
        this.preloadedPlayerInfo = new PoolPreloadInfo(preloadVideoUrl, poolPlayerController, playerConfigAlias);
    }
}
