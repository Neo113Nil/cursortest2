package ru.ozon.app.android.video.playerV2.playerController.base;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseMediaPlayController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerListenersController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerPositionController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerSoundController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseVideoInfoController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.BasePlayerViewController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.BasePlayerComposableController;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H'J\b\u0010\u0006\u001a\u00020\u0007H'J\b\u0010\b\u001a\u00020\tH'J\b\u0010\n\u001a\u00020\u000bH'J\b\u0010\f\u001a\u00020\rH'J\b\u0010\u000e\u001a\u00020\u000fH'¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerController;", "", "mediaPlayController", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BaseMediaPlayController;", "playerViewController", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/BasePlayerViewController;", "playerComposableController", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/compose/BasePlayerComposableController;", "listenersController", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BasePlayerListenersController;", "positionController", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BasePlayerPositionController;", "videoInfoController", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BaseVideoInfoController;", "soundController", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BasePlayerSoundController;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface BasePlayerController {
    @NotNull
    BasePlayerListenersController listenersController();

    @NotNull
    BaseMediaPlayController mediaPlayController();

    @NotNull
    BasePlayerComposableController playerComposableController();

    @NotNull
    BasePlayerViewController playerViewController();

    @NotNull
    BasePlayerPositionController positionController();

    @NotNull
    BasePlayerSoundController soundController();

    @NotNull
    BaseVideoInfoController videoInfoController();
}
