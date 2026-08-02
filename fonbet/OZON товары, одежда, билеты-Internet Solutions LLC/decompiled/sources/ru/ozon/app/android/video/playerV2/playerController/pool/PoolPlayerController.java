package ru.ozon.app.android.video.playerV2.playerController.pool;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.playerV2.playerController.base.BasePlayerController;
import ru.ozon.app.android.video.playerV2.playerController.pool.nestedControllers.PoolMediaPlayController;
import ru.ozon.app.android.video.playerV2.playerController.pool.nestedControllers.PoolPreloadController;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerController;", "Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerController;", "mediaPlayController", "Lru/ozon/app/android/video/playerV2/playerController/pool/nestedControllers/PoolMediaPlayController;", "poolPreloadController", "Lru/ozon/app/android/video/playerV2/playerController/pool/nestedControllers/PoolPreloadController;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PoolPlayerController extends BasePlayerController {
    @Override // ru.ozon.app.android.video.playerV2.playerController.base.BasePlayerController
    @NotNull
    PoolMediaPlayController mediaPlayController();

    @NotNull
    PoolPreloadController poolPreloadController();
}
