package ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.preload;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.playerV2.playerController.base.playerConfig.PlayerConfigAlias;
import ru.ozon.app.android.video.playerV2.playerController.pool.PoolPlayerControllerInternal;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0001#B#\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u00072\u000e\u0010\f\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/preload/PoolPreloadInfo;", "", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoUrl;", "preloadVideoUrl", "Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerControllerInternal;", "poolPlayerController", "Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;", "playerConfigAlias", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerControllerInternal;Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;)V", "requestedConfig", "requestedUrl", "getPlayerControllerIfMatch", "(Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;Ljava/lang/String;)Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerControllerInternal;", "", "returnToPoolOrRelease", "()V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPreloadVideoUrl", "Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerControllerInternal;", "getPoolPlayerController", "()Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerControllerInternal;", "Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;", "getPlayerConfigAlias", "()Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;", "Companion", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PoolPreloadInfo {

    @NotNull
    private final PlayerConfigAlias playerConfigAlias;

    @NotNull
    private final PoolPlayerControllerInternal poolPlayerController;

    @NotNull
    private final String preloadVideoUrl;
    public static final int $stable = 8;

    public PoolPreloadInfo(@NotNull String preloadVideoUrl, @NotNull PoolPlayerControllerInternal poolPlayerController, @NotNull PlayerConfigAlias playerConfigAlias) {
        Intrinsics.checkNotNullParameter(preloadVideoUrl, "preloadVideoUrl");
        Intrinsics.checkNotNullParameter(poolPlayerController, "poolPlayerController");
        Intrinsics.checkNotNullParameter(playerConfigAlias, "playerConfigAlias");
        this.preloadVideoUrl = preloadVideoUrl;
        this.poolPlayerController = poolPlayerController;
        this.playerConfigAlias = playerConfigAlias;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PoolPreloadInfo)) {
            return false;
        }
        PoolPreloadInfo poolPreloadInfo = (PoolPreloadInfo) other;
        return Intrinsics.d(this.preloadVideoUrl, poolPreloadInfo.preloadVideoUrl) && Intrinsics.d(this.poolPlayerController, poolPreloadInfo.poolPlayerController) && Intrinsics.d(this.playerConfigAlias, poolPreloadInfo.playerConfigAlias);
    }

    public final PoolPlayerControllerInternal getPlayerControllerIfMatch(@NotNull PlayerConfigAlias requestedConfig, String requestedUrl) {
        Intrinsics.checkNotNullParameter(requestedConfig, "requestedConfig");
        if (requestedUrl != null && requestedUrl.length() != 0 && Intrinsics.d(requestedUrl, this.preloadVideoUrl) && Intrinsics.d(requestedConfig, this.playerConfigAlias) && this.poolPlayerController.isControllerPlayerActive()) {
            return this.poolPlayerController;
        }
        return null;
    }

    @NotNull
    public final PoolPlayerControllerInternal getPoolPlayerController() {
        return this.poolPlayerController;
    }

    public int hashCode() {
        return this.playerConfigAlias.hashCode() + ((this.poolPlayerController.hashCode() + (this.preloadVideoUrl.hashCode() * 31)) * 31);
    }

    public final void returnToPoolOrRelease() {
        this.poolPlayerController.returnToPoolOrRelease();
    }

    @NotNull
    public String toString() {
        return "PoolPreloadInfo(preloadVideoUrl=" + this.preloadVideoUrl + ", poolPlayerController=" + this.poolPlayerController + ", playerConfigAlias=" + this.playerConfigAlias + ")";
    }
}
