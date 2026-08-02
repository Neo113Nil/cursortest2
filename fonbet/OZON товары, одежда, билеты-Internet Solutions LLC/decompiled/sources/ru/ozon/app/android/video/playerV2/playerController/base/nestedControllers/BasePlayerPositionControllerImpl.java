package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BasePlayerPositionControllerImpl;", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BasePlayerPositionController;", "exoPlayer", "Landroidx/media3/exoplayer/ExoPlayer;", "<init>", "(Landroidx/media3/exoplayer/ExoPlayer;)V", "seekTo", "", "position", "", "getCurrentPosition", "seekToStartAndReplay", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BasePlayerPositionControllerImpl implements BasePlayerPositionController {

    @NotNull
    private final ExoPlayer exoPlayer;

    public BasePlayerPositionControllerImpl(@NotNull ExoPlayer exoPlayer) {
        Intrinsics.checkNotNullParameter(exoPlayer, "exoPlayer");
        this.exoPlayer = exoPlayer;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerPositionController
    public long getCurrentPosition() {
        return this.exoPlayer.getCurrentPosition();
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerPositionController
    public void seekTo(long position) {
        this.exoPlayer.seekTo(position);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerPositionController
    public void seekToStartAndReplay() {
        this.exoPlayer.seekTo(0L);
        if (this.exoPlayer.isPlaying()) {
            return;
        }
        this.exoPlayer.D(true);
    }
}
