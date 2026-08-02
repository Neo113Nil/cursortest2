package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import j3.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import u3.InterfaceC9928b;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BasePlayerListenersController;", "", "Lj3/y$c;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addCommonExoplayerListener", "(Lj3/y$c;)V", "removeCommonExoplayerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "playerListener", "setPlayerListener", "(Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;)V", "getPlayerListener", "()Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "removePlayerListener", "Lu3/b;", "analyticsListener", "removeAnalyticsListener", "(Lu3/b;)V", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface BasePlayerListenersController {
    void addCommonExoplayerListener(@NotNull y.c listener);

    PlayerListenersContainer getPlayerListener();

    void removeAnalyticsListener(@NotNull InterfaceC9928b analyticsListener);

    void removeCommonExoplayerListener(@NotNull y.c listener);

    void removePlayerListener(@NotNull PlayerListenersContainer playerListener);

    void setPlayerListener(@NotNull PlayerListenersContainer playerListener);
}
