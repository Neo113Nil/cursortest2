package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\n\u0010\n\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\tH&J\b\u0010\r\u001a\u00020\u0003H&¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BaseControllersHub;", "", "setPlayerListenerOnMediaPrepare", "", "playerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "onReleasePlayerListener", "setMuteOnMediaPrepare", "isMuted", "", "getCurrentPlayerListener", "onCheckLoadErrorFlagChanged", "checkLoadError", "onDiscardHistoryStats", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface BaseControllersHub {
    PlayerListenersContainer getCurrentPlayerListener();

    void onCheckLoadErrorFlagChanged(boolean checkLoadError);

    void onDiscardHistoryStats();

    void onReleasePlayerListener();

    void setMuteOnMediaPrepare(boolean isMuted);

    void setPlayerListenerOnMediaPrepare(@NotNull PlayerListenersContainer playerListener);
}
