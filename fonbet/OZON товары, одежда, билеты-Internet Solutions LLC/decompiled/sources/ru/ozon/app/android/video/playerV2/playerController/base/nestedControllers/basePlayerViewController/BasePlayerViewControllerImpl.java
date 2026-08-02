package ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController;

import Sc.InterfaceC4008j;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.player.VideoPlaceholderTimeTracker;
import ru.ozon.app.android.video.player.performance.VideoWidgetNamesHolder;
import ru.ozon.app.android.video.playerV2.performance.playback.PlaybackAnalyticsListener;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.PlayerViewBindStrategy;
import ru.ozon.app.android.video.playerV2.utils.ExoPlayerUtilsKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/BasePlayerViewControllerImpl;", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/BasePlayerViewController;", "Landroidx/media3/exoplayer/ExoPlayer;", "exoPlayer", "LSc/j;", "Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackAnalyticsListener;", "playbackAnalyticsListenerDelegate", "Lru/ozon/app/android/video/player/VideoPlaceholderTimeTracker;", "placeholderTimeTracker", "Lru/ozon/app/android/video/player/performance/VideoWidgetNamesHolder;", "videoWidgetNamesHolder", "<init>", "(Landroidx/media3/exoplayer/ExoPlayer;LSc/j;Lru/ozon/app/android/video/player/VideoPlaceholderTimeTracker;Lru/ozon/app/android/video/player/performance/VideoWidgetNamesHolder;)V", "Landroidx/media3/ui/PlayerView;", "playerView", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/PlayerViewBindStrategy;", "bindStrategy", "", "bindPlayerView", "(Landroidx/media3/ui/PlayerView;Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/PlayerViewBindStrategy;)V", "unbindPlayerView", "(Landroidx/media3/ui/PlayerView;)V", "Landroidx/media3/exoplayer/ExoPlayer;", "LSc/j;", "Lru/ozon/app/android/video/player/VideoPlaceholderTimeTracker;", "Lru/ozon/app/android/video/player/performance/VideoWidgetNamesHolder;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BasePlayerViewControllerImpl implements BasePlayerViewController {

    @NotNull
    private final ExoPlayer exoPlayer;

    @NotNull
    private final VideoPlaceholderTimeTracker placeholderTimeTracker;

    @NotNull
    private final InterfaceC4008j<PlaybackAnalyticsListener> playbackAnalyticsListenerDelegate;

    @NotNull
    private final VideoWidgetNamesHolder videoWidgetNamesHolder;

    public BasePlayerViewControllerImpl(@NotNull ExoPlayer exoPlayer, @NotNull InterfaceC4008j<PlaybackAnalyticsListener> playbackAnalyticsListenerDelegate, @NotNull VideoPlaceholderTimeTracker placeholderTimeTracker, @NotNull VideoWidgetNamesHolder videoWidgetNamesHolder) {
        Intrinsics.checkNotNullParameter(exoPlayer, "exoPlayer");
        Intrinsics.checkNotNullParameter(playbackAnalyticsListenerDelegate, "playbackAnalyticsListenerDelegate");
        Intrinsics.checkNotNullParameter(placeholderTimeTracker, "placeholderTimeTracker");
        Intrinsics.checkNotNullParameter(videoWidgetNamesHolder, "videoWidgetNamesHolder");
        this.exoPlayer = exoPlayer;
        this.playbackAnalyticsListenerDelegate = playbackAnalyticsListenerDelegate;
        this.placeholderTimeTracker = placeholderTimeTracker;
        this.videoWidgetNamesHolder = videoWidgetNamesHolder;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.BasePlayerViewController
    public void bindPlayerView(@NotNull PlayerView playerView, @NotNull PlayerViewBindStrategy bindStrategy) {
        String currentPlayerMediaUrl;
        Intrinsics.checkNotNullParameter(playerView, "playerView");
        Intrinsics.checkNotNullParameter(bindStrategy, "bindStrategy");
        this.placeholderTimeTracker.onPlayerViewBound(playerView);
        if ((bindStrategy instanceof PlayerViewBindStrategy.BindAfterLoadStarted) && (currentPlayerMediaUrl = ExoPlayerUtilsKt.getCurrentPlayerMediaUrl(this.exoPlayer)) != null) {
            this.placeholderTimeTracker.onVideoLoadingStarted(currentPlayerMediaUrl, ((PlayerViewBindStrategy.BindAfterLoadStarted) bindStrategy).getExoManager());
        }
        playerView.B(this.exoPlayer);
        String findWidgetName = this.videoWidgetNamesHolder.findWidgetName(playerView);
        if (findWidgetName != null) {
            this.playbackAnalyticsListenerDelegate.getValue().updateWidgetName(findWidgetName);
        }
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.BasePlayerViewController
    public void unbindPlayerView(@NotNull PlayerView playerView) {
        Intrinsics.checkNotNullParameter(playerView, "playerView");
        this.placeholderTimeTracker.onPlayerViewUnbound();
        this.exoPlayer.N();
        playerView.B(null);
    }
}
