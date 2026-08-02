package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers;

import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import j3.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import u3.InterfaceC9928b;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BasePlayerListenersControllerImpl;", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BasePlayerListenersController;", "Landroidx/media3/exoplayer/ExoPlayer;", "exoPlayer", "<init>", "(Landroidx/media3/exoplayer/ExoPlayer;)V", "Lj3/y$c;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addCommonExoplayerListener", "(Lj3/y$c;)V", "removeCommonExoplayerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "playerListener", "setPlayerListener", "(Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;)V", "getPlayerListener", "()Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "removePlayerListener", "Lu3/b;", "analyticsListener", "removeAnalyticsListener", "(Lu3/b;)V", "Landroidx/media3/exoplayer/ExoPlayer;", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BasePlayerListenersControllerImpl implements BasePlayerListenersController {

    @NotNull
    private final ExoPlayer exoPlayer;
    private PlayerListenersContainer playerListener;

    public BasePlayerListenersControllerImpl(@NotNull ExoPlayer exoPlayer) {
        Intrinsics.checkNotNullParameter(exoPlayer, "exoPlayer");
        this.exoPlayer = exoPlayer;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerListenersController
    public void addCommonExoplayerListener(@NotNull y.c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.exoPlayer.t(listener);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerListenersController
    public PlayerListenersContainer getPlayerListener() {
        return this.playerListener;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerListenersController
    public void removeAnalyticsListener(@NotNull InterfaceC9928b analyticsListener) {
        Intrinsics.checkNotNullParameter(analyticsListener, "analyticsListener");
        this.exoPlayer.removeAnalyticsListener(analyticsListener);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerListenersController
    public void removeCommonExoplayerListener(@NotNull y.c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.exoPlayer.j(listener);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerListenersController
    public void removePlayerListener(@NotNull PlayerListenersContainer playerListener) {
        Intrinsics.checkNotNullParameter(playerListener, "playerListener");
        if (Intrinsics.d(this.playerListener, playerListener)) {
            this.playerListener = null;
        }
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerListenersController
    public void setPlayerListener(@NotNull PlayerListenersContainer playerListener) {
        Intrinsics.checkNotNullParameter(playerListener, "playerListener");
        this.playerListener = playerListener;
    }
}
