package ru.ozon.app.android.video.playerV2.playerController.pool.nestedControllers;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\b\u001a\u00020\u00052\n\u0010\t\u001a\u00060\u0004j\u0002`\nH\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/pool/nestedControllers/PoolPreloadControllerImpl;", "Lru/ozon/app/android/video/playerV2/playerController/pool/nestedControllers/PoolPreloadController;", "onPlayerStored", "Lkotlin/Function1;", "", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "storePreloadedPlayer", "preloadVideoUrl", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoUrl;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PoolPreloadControllerImpl implements PoolPreloadController {

    @NotNull
    private final Function1<String, Unit> onPlayerStored;

    /* JADX WARN: Multi-variable type inference failed */
    public PoolPreloadControllerImpl(@NotNull Function1<? super String, Unit> onPlayerStored) {
        Intrinsics.checkNotNullParameter(onPlayerStored, "onPlayerStored");
        this.onPlayerStored = onPlayerStored;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.pool.nestedControllers.PoolPreloadController
    public void storePreloadedPlayer(@NotNull String preloadVideoUrl) {
        Intrinsics.checkNotNullParameter(preloadVideoUrl, "preloadVideoUrl");
        this.onPlayerStored.invoke(preloadVideoUrl);
    }
}
