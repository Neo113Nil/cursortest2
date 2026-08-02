package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController;

import androidx.media3.ui.PlayerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.PlayerViewBindStrategy;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/BasePlayerViewController;", "", "bindPlayerView", "", "playerView", "Landroidx/media3/ui/PlayerView;", "bindStrategy", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/PlayerViewBindStrategy;", "unbindPlayerView", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface BasePlayerViewController {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void bindPlayerView$default(BasePlayerViewController basePlayerViewController, PlayerView playerView, PlayerViewBindStrategy playerViewBindStrategy, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindPlayerView");
            }
            if ((i11 & 2) != 0) {
                playerViewBindStrategy = PlayerViewBindStrategy.BindBeforeLoadStarted.INSTANCE;
            }
            basePlayerViewController.bindPlayerView(playerView, playerViewBindStrategy);
        }
    }

    void bindPlayerView(@NotNull PlayerView playerView, @NotNull PlayerViewBindStrategy bindStrategy);

    void unbindPlayerView(@NotNull PlayerView playerView);
}
