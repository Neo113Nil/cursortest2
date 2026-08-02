package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers;

import Sc.InterfaceC4008j;
import androidx.media3.exoplayer.ExoPlayer;
import j3.Q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.playerV2.data.ViewTimeInfo;
import ru.ozon.app.android.video.playerV2.data.ViewTimeInfoCollector;
import ru.ozon.app.android.video.playerV2.performance.playback.PlaybackAnalyticsListener;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BaseVideoInfoControllerImpl;", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BaseVideoInfoController;", "Landroidx/media3/exoplayer/ExoPlayer;", "exoPlayer", "LSc/j;", "Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackAnalyticsListener;", "playbackAnalyticsListenerDelegate", "Lru/ozon/app/android/video/playerV2/data/ViewTimeInfoCollector;", "viewTimeInfoCollectorDelegate", "<init>", "(Landroidx/media3/exoplayer/ExoPlayer;LSc/j;LSc/j;)V", "", "index", "", "setVideoIndex", "(I)V", "Lj3/Q;", "videoSize", "()Lj3/Q;", "", "getRelativeViewTime", "Lru/ozon/app/android/video/playerV2/data/ViewTimeInfo;", "viewTimeInfo", "(Z)Lru/ozon/app/android/video/playerV2/data/ViewTimeInfo;", "Landroidx/media3/exoplayer/ExoPlayer;", "LSc/j;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BaseVideoInfoControllerImpl implements BaseVideoInfoController {

    @NotNull
    private final ExoPlayer exoPlayer;

    @NotNull
    private final InterfaceC4008j<PlaybackAnalyticsListener> playbackAnalyticsListenerDelegate;

    @NotNull
    private final InterfaceC4008j<ViewTimeInfoCollector> viewTimeInfoCollectorDelegate;

    public BaseVideoInfoControllerImpl(@NotNull ExoPlayer exoPlayer, @NotNull InterfaceC4008j<PlaybackAnalyticsListener> playbackAnalyticsListenerDelegate, @NotNull InterfaceC4008j<ViewTimeInfoCollector> viewTimeInfoCollectorDelegate) {
        Intrinsics.checkNotNullParameter(exoPlayer, "exoPlayer");
        Intrinsics.checkNotNullParameter(playbackAnalyticsListenerDelegate, "playbackAnalyticsListenerDelegate");
        Intrinsics.checkNotNullParameter(viewTimeInfoCollectorDelegate, "viewTimeInfoCollectorDelegate");
        this.exoPlayer = exoPlayer;
        this.playbackAnalyticsListenerDelegate = playbackAnalyticsListenerDelegate;
        this.viewTimeInfoCollectorDelegate = viewTimeInfoCollectorDelegate;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseVideoInfoController
    public void setVideoIndex(int index) {
        this.playbackAnalyticsListenerDelegate.getValue().updateVideoIndex(index);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseVideoInfoController
    @NotNull
    public Q videoSize() {
        Q M11 = this.exoPlayer.M();
        Intrinsics.checkNotNullExpressionValue(M11, "getVideoSize(...)");
        return M11;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseVideoInfoController
    @NotNull
    public ViewTimeInfo viewTimeInfo(boolean getRelativeViewTime) {
        long totalPlayTimeMs = this.playbackAnalyticsListenerDelegate.getValue().getCombinedOzPlaybackStats().getTotalPlayTimeMs();
        long currentPosition = this.exoPlayer.getCurrentPosition();
        long max = Math.max(this.exoPlayer.getDuration(), 0L);
        if (!getRelativeViewTime) {
            return new ViewTimeInfo(totalPlayTimeMs, currentPosition, max);
        }
        ViewTimeInfo viewTimeInfo = new ViewTimeInfo(Math.max(totalPlayTimeMs - this.viewTimeInfoCollectorDelegate.getValue().getLastViewTimeMsValue(), 0L), currentPosition, max);
        this.viewTimeInfoCollectorDelegate.getValue().updateLastViewTimeMsValue(totalPlayTimeMs);
        return viewTimeInfo;
    }
}
