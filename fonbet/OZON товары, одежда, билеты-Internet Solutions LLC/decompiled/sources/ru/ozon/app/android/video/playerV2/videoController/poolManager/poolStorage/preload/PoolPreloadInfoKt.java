package ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.preload;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002*\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"videoUrl", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoUrl;", "Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/preload/PoolPreloadInfo;", "video_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PoolPreloadInfoKt {
    public static final String videoUrl(@NotNull PoolPreloadInfo poolPreloadInfo) {
        Intrinsics.checkNotNullParameter(poolPreloadInfo, "<this>");
        return poolPreloadInfo.getPoolPlayerController().getPlayerUrl();
    }
}
