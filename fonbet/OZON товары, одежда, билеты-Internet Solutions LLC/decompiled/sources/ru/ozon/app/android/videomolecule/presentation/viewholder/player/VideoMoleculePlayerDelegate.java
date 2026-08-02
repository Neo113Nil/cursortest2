package ru.ozon.app.android.videomolecule.presentation.viewholder.player;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.manager.ExoManager;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerPositionController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerSoundController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.BasePlayerViewController;
import ru.ozon.app.android.video.playerV2.playerController.singleInstance.SingleInstancePlayerController;
import ru.ozon.app.android.video.playerV2.playerController.singleInstance.nestedControllers.SingleInstanceMediaPlayController;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.app.android.videomolecule.data.VideoFormat;
import ru.ozon.app.android.videomolecule.data.VideoMolecule;
import ru.ozon.app.android.videomolecule.presentation.view.VideoMoleculeView;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u0017J\r\u0010\u001e\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u0017J\r\u0010\u001f\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010\u0017J\u000f\u0010 \u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/videomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegate;", "", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "videoController", "<init>", "(Lru/ozon/app/android/video/playerV2/videoController/VideoController;)V", "Lru/ozon/app/android/videomolecule/data/VideoFormat;", "videoFormat", "Lru/ozon/app/android/video/manager/ExoManager;", "getExoManager", "(Lru/ozon/app/android/videomolecule/data/VideoFormat;)Lru/ozon/app/android/video/manager/ExoManager;", "Lru/ozon/app/android/videomolecule/data/VideoMolecule;", "molecule", "Lru/ozon/app/android/videomolecule/presentation/view/VideoMoleculeView;", "videoMoleculeView", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "playerListener", "", "startVideo", "", "bind", "(Lru/ozon/app/android/videomolecule/data/VideoMolecule;Lru/ozon/app/android/videomolecule/presentation/view/VideoMoleculeView;Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;Z)V", "pause", "()V", "play", "", "position", "seekTo", "(J)V", "retry", "replay", "onRemove", "switchMute", "()Ljava/lang/Boolean;", "getPlayerPosition", "()J", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "Lru/ozon/app/android/video/playerV2/playerController/singleInstance/SingleInstancePlayerController;", "playerController", "Lru/ozon/app/android/video/playerV2/playerController/singleInstance/SingleInstancePlayerController;", "videomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoMoleculePlayerDelegate {
    private SingleInstancePlayerController playerController;

    @NotNull
    private final VideoController videoController;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoFormat.values().length];
            try {
                iArr[VideoFormat.MP4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoFormat.HLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VideoMoleculePlayerDelegate(@NotNull VideoController videoController) {
        Intrinsics.checkNotNullParameter(videoController, "videoController");
        this.videoController = videoController;
    }

    private final ExoManager getExoManager(VideoFormat videoFormat) {
        VideoController videoController = this.videoController;
        int i11 = WhenMappings.$EnumSwitchMapping$0[videoFormat.ordinal()];
        if (i11 != 1 && i11 == 2) {
            return videoController.getExoManagerLive();
        }
        return videoController.getProgressiveExoManager();
    }

    public final void bind(@NotNull VideoMolecule molecule, @NotNull VideoMoleculeView videoMoleculeView, @NotNull PlayerListenersContainer playerListener, boolean startVideo) {
        SingleInstanceMediaPlayController mediaPlayController;
        BasePlayerViewController playerViewController;
        Intrinsics.checkNotNullParameter(molecule, "molecule");
        Intrinsics.checkNotNullParameter(videoMoleculeView, "videoMoleculeView");
        Intrinsics.checkNotNullParameter(playerListener, "playerListener");
        if (this.playerController == null) {
            this.playerController = VideoController.DefaultImpls.getSingleInstancePlayerController$default(this.videoController, null, 1, null);
        }
        SingleInstancePlayerController singleInstancePlayerController = this.playerController;
        if (singleInstancePlayerController != null && (playerViewController = singleInstancePlayerController.playerViewController()) != null) {
            BasePlayerViewController.DefaultImpls.bindPlayerView$default(playerViewController, videoMoleculeView.getPlayerView(), null, 2, null);
        }
        videoMoleculeView.getPlayerControllerView().A(videoMoleculeView.getPlayerView().s());
        SingleInstancePlayerController singleInstancePlayerController2 = this.playerController;
        if (singleInstancePlayerController2 == null || (mediaPlayController = singleInstancePlayerController2.mediaPlayController()) == null) {
            return;
        }
        String link = molecule.getLink();
        ExoManager exoManager = getExoManager(molecule.getFormat());
        Boolean isMuted = molecule.getPlayerState().getIsMuted();
        mediaPlayController.prepareMediaToPlay(link, exoManager, startVideo, false, isMuted != null ? isMuted.booleanValue() : false, playerListener, null, null);
    }

    public final long getPlayerPosition() {
        BasePlayerPositionController positionController;
        SingleInstancePlayerController singleInstancePlayerController = this.playerController;
        if (singleInstancePlayerController == null || (positionController = singleInstancePlayerController.positionController()) == null) {
            return 0L;
        }
        return positionController.getCurrentPosition();
    }

    public final void onRemove() {
        SingleInstanceMediaPlayController mediaPlayController;
        SingleInstancePlayerController singleInstancePlayerController = this.playerController;
        if (singleInstancePlayerController != null && (mediaPlayController = singleInstancePlayerController.mediaPlayController()) != null) {
            mediaPlayController.release(VideoMoleculePlayerDelegate$onRemove$1.INSTANCE);
        }
        this.playerController = null;
    }

    public final void pause() {
        SingleInstanceMediaPlayController mediaPlayController;
        SingleInstancePlayerController singleInstancePlayerController = this.playerController;
        if (singleInstancePlayerController == null || (mediaPlayController = singleInstancePlayerController.mediaPlayController()) == null) {
            return;
        }
        mediaPlayController.pause();
    }

    public final void play() {
        SingleInstanceMediaPlayController mediaPlayController;
        SingleInstancePlayerController singleInstancePlayerController = this.playerController;
        if (singleInstancePlayerController == null || (mediaPlayController = singleInstancePlayerController.mediaPlayController()) == null) {
            return;
        }
        mediaPlayController.resume();
        if (mediaPlayController.isReadyToPlayAndPaused() || mediaPlayController.isPlaying()) {
            return;
        }
        mediaPlayController.retryLoadMedia();
    }

    public final void replay() {
        BasePlayerPositionController positionController;
        SingleInstancePlayerController singleInstancePlayerController = this.playerController;
        if (singleInstancePlayerController == null || (positionController = singleInstancePlayerController.positionController()) == null) {
            return;
        }
        positionController.seekToStartAndReplay();
    }

    public final void retry() {
        SingleInstanceMediaPlayController mediaPlayController;
        SingleInstancePlayerController singleInstancePlayerController = this.playerController;
        if (singleInstancePlayerController == null || (mediaPlayController = singleInstancePlayerController.mediaPlayController()) == null) {
            return;
        }
        mediaPlayController.retryLoadMedia();
    }

    public final void seekTo(long position) {
        BasePlayerPositionController positionController;
        SingleInstancePlayerController singleInstancePlayerController = this.playerController;
        if (singleInstancePlayerController == null || (positionController = singleInstancePlayerController.positionController()) == null) {
            return;
        }
        positionController.seekTo(position);
    }

    public final Boolean switchMute() {
        BasePlayerSoundController soundController;
        SingleInstancePlayerController singleInstancePlayerController = this.playerController;
        if (singleInstancePlayerController == null || (soundController = singleInstancePlayerController.soundController()) == null) {
            return null;
        }
        return Boolean.valueOf(soundController.switchMute());
    }
}
