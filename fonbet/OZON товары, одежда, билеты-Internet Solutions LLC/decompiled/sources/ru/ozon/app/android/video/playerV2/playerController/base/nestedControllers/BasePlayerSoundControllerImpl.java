package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers;

import androidx.media3.exoplayer.ExoPlayer;
import j3.C7256L;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import ru.ozon.app.android.video.playerV2.utils.AudioUtilsKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BasePlayerSoundControllerImpl;", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BasePlayerSoundController;", "exoPlayer", "Landroidx/media3/exoplayer/ExoPlayer;", "baseControllersHub", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BaseControllersHub;", "<init>", "(Landroidx/media3/exoplayer/ExoPlayer;Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BaseControllersHub;)V", "switchMute", "", "setMute", "isMuted", "setVolume", "", "volume", "", "getVolume", "checkHasAudio", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BasePlayerSoundControllerImpl implements BasePlayerSoundController {

    @NotNull
    private final BaseControllersHub baseControllersHub;

    @NotNull
    private final ExoPlayer exoPlayer;

    public BasePlayerSoundControllerImpl(@NotNull ExoPlayer exoPlayer, @NotNull BaseControllersHub baseControllersHub) {
        Intrinsics.checkNotNullParameter(exoPlayer, "exoPlayer");
        Intrinsics.checkNotNullParameter(baseControllersHub, "baseControllersHub");
        this.exoPlayer = exoPlayer;
        this.baseControllersHub = baseControllersHub;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerSoundController
    public void checkHasAudio() {
        PlayerListenersContainer currentPlayerListener = this.baseControllersHub.getCurrentPlayerListener();
        if (currentPlayerListener != null) {
            C7256L i11 = this.exoPlayer.i();
            Intrinsics.checkNotNullExpressionValue(i11, "getCurrentTracks(...)");
            currentPlayerListener.hasAudio(AudioUtilsKt.hasAudioInTracks(i11));
        }
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerSoundController
    public float getVolume() {
        return this.exoPlayer.getVolume();
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerSoundController
    public boolean setMute(boolean isMuted) {
        this.exoPlayer.setVolume(isMuted ? 0.0f : 1.0f);
        return isMuted;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerSoundController
    public void setVolume(float volume) {
        this.exoPlayer.setVolume(volume);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerSoundController
    public boolean switchMute() {
        return setMute(!(this.exoPlayer.getVolume() == 0.0f));
    }
}
