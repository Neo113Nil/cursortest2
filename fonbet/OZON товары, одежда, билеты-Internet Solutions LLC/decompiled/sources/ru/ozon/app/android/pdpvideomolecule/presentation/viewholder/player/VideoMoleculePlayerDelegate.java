package ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player;

import Sc.InterfaceC4008j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j3.Q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.utils.UtilsKt;
import ru.ozon.app.android.pdpvideomolecule.data.PlayerStateKt;
import ru.ozon.app.android.pdpvideomolecule.data.VideoFormat;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.app.android.pdpvideomolecule.presentation.view.VideoMoleculeApi;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeNamespace;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.binddelegate.OzPlayerBindingDelegate;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.binddelegate.PlayInfo;
import ru.ozon.app.android.video.manager.ExoManager;
import ru.ozon.app.android.video.playerV2.data.ViewTimeInfo;
import ru.ozon.app.android.video.playerV2.playerController.base.BasePlayerController;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseMediaPlayController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerListenersController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerPositionController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerSoundController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseVideoInfoController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.BasePlayerViewController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.PlayerViewBindStrategy;
import ru.ozon.app.android.video.playerV2.playerController.base.playerConfig.PlayerConfigAlias;
import ru.ozon.app.android.video.playerV2.playerController.pool.nestedControllers.PoolMediaPlayController;
import ru.ozon.app.android.video.playerV2.playerController.singleInstance.nestedControllers.SingleInstanceMediaPlayController;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.app.android.video.playerV2.videoController.poolManager.PlayerPoolManager;
import ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.config.PoolStorageConfig;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import sF.C9638a;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ?\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0015¢\u0006\u0004\b \u0010\u0019J\u0015\u0010!\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b!\u0010\u001cJ\u000f\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0004¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0011¢\u0006\u0004\b,\u0010-J\u0019\u00100\u001a\u0004\u0018\u00010/2\b\b\u0002\u0010.\u001a\u00020\u0004¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\u00152\u0006\u00102\u001a\u00020\u0004¢\u0006\u0004\b3\u0010'J\u000f\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b5\u00106J)\u0010;\u001a\u0004\u0018\u00010:2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020=2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010AR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010BR\u001b\u0010H\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\"\u0010I\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010A\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010'R(\u0010R\u001a\u0004\u0018\u00010:2\b\u0010M\u001a\u0004\u0018\u00010:8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010Q¨\u0006S"}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegate;", "", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "videoController", "", "usePlayerFromPool", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "<init>", "(Lru/ozon/app/android/video/playerV2/videoController/VideoController;ZLru/ozon/app/android/video/preload/PlayerPreloader;)V", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "molecule", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeApi;", "videoMoleculeView", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "playerListener", "startVideo", "", "playPosition", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/VideoMoleculeNamespace;", "videoMoleculeUsageNamespace", "", "bind", "(Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;Lru/ozon/app/android/pdpvideomolecule/presentation/view/VideoMoleculeApi;Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;ZLjava/lang/Long;Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/VideoMoleculeNamespace;)V", "pause", "()V", "play", "stop", "(Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;)V", "position", "seekTo", "(J)V", "replay", "onRemove", "", "getVolume", "()Ljava/lang/Float;", "isMuted", "setMute", "(Z)V", "", "index", "setVideoIndex", "(I)V", "getPlayerPosition", "()J", "getRelativeViewTime", "Lru/ozon/app/android/video/playerV2/data/ViewTimeInfo;", "getViewTimeInfo", "(Z)Lru/ozon/app/android/video/playerV2/data/ViewTimeInfo;", "playWhenReady", "switchPlayWhenReadyTo", "Lj3/Q;", "videoSize", "()Lj3/Q;", "", "videoUrl", "requestPreloadedPlayerFlag", "Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerController;", "createPlayer", "(Ljava/lang/String;ZLru/ozon/app/android/pdpvideomolecule/presentation/viewholder/VideoMoleculeNamespace;)Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerController;", "Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;", "getPlayerConfigAlias", "(Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/VideoMoleculeNamespace;)Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "Z", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/binddelegate/OzPlayerBindingDelegate;", "ozPlayerBindingDelegate$delegate", "LSc/j;", "getOzPlayerBindingDelegate", "()Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/binddelegate/OzPlayerBindingDelegate;", "ozPlayerBindingDelegate", "wasVideoRendered", "getWasVideoRendered", "()Z", "setWasVideoRendered", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getPlayerController", "()Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerController;", "setPlayerController", "(Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerController;)V", "playerController", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VideoMoleculePlayerDelegate {

    /* renamed from: ozPlayerBindingDelegate$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ozPlayerBindingDelegate;
    private final PlayerPreloader playerPreloader;
    private final boolean usePlayerFromPool;

    @NotNull
    private final VideoController videoController;
    private boolean wasVideoRendered;

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

    public VideoMoleculePlayerDelegate(@NotNull VideoController videoController, boolean z11, PlayerPreloader playerPreloader) {
        Intrinsics.checkNotNullParameter(videoController, "videoController");
        this.videoController = videoController;
        this.usePlayerFromPool = z11;
        this.playerPreloader = playerPreloader;
        this.ozPlayerBindingDelegate = UtilsKt.unsafeLazy(new VideoMoleculePlayerDelegate$ozPlayerBindingDelegate$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BasePlayerController bind$lambda$0(VideoMoleculePlayerDelegate videoMoleculePlayerDelegate, VideoMolecule videoMolecule, boolean z11, VideoMoleculeNamespace videoMoleculeNamespace) {
        return videoMoleculePlayerDelegate.createPlayer(videoMolecule.getLink(), z11, videoMoleculeNamespace);
    }

    private final BasePlayerController createPlayer(String videoUrl, boolean requestPreloadedPlayerFlag, VideoMoleculeNamespace videoMoleculeUsageNamespace) {
        if (!this.usePlayerFromPool) {
            return VideoController.DefaultImpls.getSingleInstancePlayerController$default(this.videoController, null, 1, null);
        }
        PlayerConfigAlias playerConfigAlias = getPlayerConfigAlias(videoMoleculeUsageNamespace);
        PlayerPoolManager playerPoolManager = this.videoController.getPlayerPoolManager();
        if (!requestPreloadedPlayerFlag) {
            videoUrl = null;
        }
        return playerPoolManager.getPoolPlayerController(playerConfigAlias, videoUrl, PoolStorageConfig.DEFAULT);
    }

    private final OzPlayerBindingDelegate getOzPlayerBindingDelegate() {
        return (OzPlayerBindingDelegate) this.ozPlayerBindingDelegate.getValue();
    }

    private final PlayerConfigAlias getPlayerConfigAlias(VideoMoleculeNamespace videoMoleculeUsageNamespace) {
        return videoMoleculeUsageNamespace instanceof VideoMoleculeNamespace.Review ? PlayerConfigAlias.ReviewsOnly.INSTANCE : PlayerConfigAlias.Default.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BasePlayerController getPlayerController() {
        return getOzPlayerBindingDelegate().getPlayerController();
    }

    private final void setPlayerController(BasePlayerController basePlayerController) {
        getOzPlayerBindingDelegate().setPlayerController(basePlayerController);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bind(@NotNull VideoMolecule molecule, @NotNull VideoMoleculeApi videoMoleculeView, @NotNull PlayerListenersContainer playerListener, boolean startVideo, Long playPosition, @NotNull VideoMoleculeNamespace videoMoleculeUsageNamespace) {
        boolean z11;
        int i11;
        ExoManager progressiveExoManager;
        BasePlayerController playerController;
        PlayerViewBindStrategy bindAfterLoadStarted;
        BasePlayerController playerController2;
        Boolean isMuted;
        BasePlayerController playerController3;
        BasePlayerSoundController soundController;
        BasePlayerViewController playerViewController;
        BaseMediaPlayController mediaPlayController;
        Intrinsics.checkNotNullParameter(molecule, "molecule");
        Intrinsics.checkNotNullParameter(videoMoleculeView, "videoMoleculeView");
        Intrinsics.checkNotNullParameter(playerListener, "playerListener");
        Intrinsics.checkNotNullParameter(videoMoleculeUsageNamespace, "videoMoleculeUsageNamespace");
        boolean z12 = false;
        if (videoMoleculeUsageNamespace instanceof VideoMoleculeNamespace.Review) {
            PlayerPreloader playerPreloader = this.playerPreloader;
            if (Intrinsics.d(playerPreloader != null ? playerPreloader.getLastPreloadedUrl() : null, molecule.getLink())) {
                z11 = true;
                getOzPlayerBindingDelegate().bind(videoMoleculeView, new PlayInfo(molecule, playerListener), new C9638a(this, molecule, z11, videoMoleculeUsageNamespace));
                i11 = WhenMappings.$EnumSwitchMapping$0[molecule.getFormat().ordinal()];
                if (i11 != 1) {
                    progressiveExoManager = this.videoController.getProgressiveExoManager();
                } else if (i11 != 2) {
                    return;
                } else {
                    progressiveExoManager = this.videoController.getExoManagerLive();
                }
                playerController = getPlayerController();
                if (playerController != null && (mediaPlayController = playerController.mediaPlayController()) != null && mediaPlayController.isPlayerActive() && z11) {
                    z12 = true;
                }
                bindAfterLoadStarted = !z12 ? new PlayerViewBindStrategy.BindAfterLoadStarted(progressiveExoManager) : PlayerViewBindStrategy.BindBeforeLoadStarted.INSTANCE;
                playerController2 = getPlayerController();
                if (playerController2 != null && (playerViewController = playerController2.playerViewController()) != null) {
                    playerViewController.bindPlayerView(videoMoleculeView.getPlayerView(), bindAfterLoadStarted);
                }
                videoMoleculeView.getPlayerControllerView().A(videoMoleculeView.getPlayerView().s());
                isMuted = molecule.getPlayerState().getIsMuted();
                if (isMuted != null) {
                    boolean booleanValue = isMuted.booleanValue();
                    BasePlayerController playerController4 = getPlayerController();
                    if (playerController4 != null && (soundController = playerController4.soundController()) != null) {
                        soundController.setMute(booleanValue);
                    }
                }
                playerController3 = getPlayerController();
                if (playerController3 == null) {
                    if (!z12) {
                        playerController3.mediaPlayController().prepareMediaToPlay(molecule.getLink(), progressiveExoManager, startVideo, PlayerStateKt.shouldRepeat(molecule), false, playerListener, null, playPosition);
                        return;
                    }
                    playerController3.listenersController().setPlayerListener(playerListener);
                    switchPlayWhenReadyTo(startVideo);
                    playerController3.soundController().checkHasAudio();
                    return;
                }
                return;
            }
        }
        z11 = false;
        getOzPlayerBindingDelegate().bind(videoMoleculeView, new PlayInfo(molecule, playerListener), new C9638a(this, molecule, z11, videoMoleculeUsageNamespace));
        i11 = WhenMappings.$EnumSwitchMapping$0[molecule.getFormat().ordinal()];
        if (i11 != 1) {
        }
        playerController = getPlayerController();
        if (playerController != null) {
            z12 = true;
        }
        if (!z12) {
        }
        playerController2 = getPlayerController();
        if (playerController2 != null) {
            playerViewController.bindPlayerView(videoMoleculeView.getPlayerView(), bindAfterLoadStarted);
        }
        videoMoleculeView.getPlayerControllerView().A(videoMoleculeView.getPlayerView().s());
        isMuted = molecule.getPlayerState().getIsMuted();
        if (isMuted != null) {
        }
        playerController3 = getPlayerController();
        if (playerController3 == null) {
        }
    }

    public final long getPlayerPosition() {
        BasePlayerPositionController positionController;
        BasePlayerController playerController = getPlayerController();
        if (playerController == null || (positionController = playerController.positionController()) == null) {
            return 0L;
        }
        return positionController.getCurrentPosition();
    }

    public final ViewTimeInfo getViewTimeInfo(boolean getRelativeViewTime) {
        BaseVideoInfoController videoInfoController;
        BasePlayerController playerController = getPlayerController();
        if (playerController == null || (videoInfoController = playerController.videoInfoController()) == null) {
            return null;
        }
        return videoInfoController.viewTimeInfo(getRelativeViewTime);
    }

    public final Float getVolume() {
        BasePlayerSoundController soundController;
        BasePlayerController playerController = getPlayerController();
        if (playerController == null || (soundController = playerController.soundController()) == null) {
            return null;
        }
        return Float.valueOf(soundController.getVolume());
    }

    public final boolean getWasVideoRendered() {
        return this.wasVideoRendered;
    }

    public final void onRemove(@NotNull PlayerListenersContainer playerListener) {
        Intrinsics.checkNotNullParameter(playerListener, "playerListener");
        BasePlayerController playerController = getPlayerController();
        if (playerController != null) {
            if (this.usePlayerFromPool) {
                BaseMediaPlayController mediaPlayController = playerController.mediaPlayController();
                PoolMediaPlayController poolMediaPlayController = mediaPlayController instanceof PoolMediaPlayController ? (PoolMediaPlayController) mediaPlayController : null;
                if (poolMediaPlayController != null) {
                    poolMediaPlayController.stopAndReturnToFreePool(VideoMoleculePlayerDelegate$onRemove$1$1$1.INSTANCE);
                }
                playerController.listenersController().removePlayerListener(playerListener);
            } else {
                BaseMediaPlayController mediaPlayController2 = playerController.mediaPlayController();
                SingleInstanceMediaPlayController singleInstanceMediaPlayController = mediaPlayController2 instanceof SingleInstanceMediaPlayController ? (SingleInstanceMediaPlayController) mediaPlayController2 : null;
                if (singleInstanceMediaPlayController != null) {
                    singleInstanceMediaPlayController.release(VideoMoleculePlayerDelegate$onRemove$1$2$1.INSTANCE);
                }
            }
        }
        setPlayerController(null);
    }

    public final void pause() {
        BaseMediaPlayController mediaPlayController;
        BasePlayerController playerController = getPlayerController();
        if (playerController == null || (mediaPlayController = playerController.mediaPlayController()) == null) {
            return;
        }
        mediaPlayController.pause();
    }

    public final void play() {
        getOzPlayerBindingDelegate().rebindAndRetry(new VideoMoleculePlayerDelegate$play$1(this));
    }

    public final void replay() {
        BasePlayerPositionController positionController;
        BasePlayerController playerController = getPlayerController();
        if (playerController == null || (positionController = playerController.positionController()) == null) {
            return;
        }
        positionController.seekToStartAndReplay();
    }

    public final void seekTo(long position) {
        BasePlayerPositionController positionController;
        BasePlayerController playerController = getPlayerController();
        if (playerController == null || (positionController = playerController.positionController()) == null) {
            return;
        }
        positionController.seekTo(position);
    }

    public final void setMute(boolean isMuted) {
        BasePlayerSoundController soundController;
        BasePlayerController playerController = getPlayerController();
        if (playerController == null || (soundController = playerController.soundController()) == null) {
            return;
        }
        soundController.setMute(isMuted);
    }

    public final void setVideoIndex(int index) {
        BaseVideoInfoController videoInfoController;
        BasePlayerController playerController = getPlayerController();
        if (playerController == null || (videoInfoController = playerController.videoInfoController()) == null) {
            return;
        }
        videoInfoController.setVideoIndex(index);
    }

    public final void setWasVideoRendered(boolean z11) {
        this.wasVideoRendered = z11;
    }

    public final void stop(@NotNull PlayerListenersContainer playerListener) {
        BasePlayerListenersController listenersController;
        Intrinsics.checkNotNullParameter(playerListener, "playerListener");
        BasePlayerController playerController = getPlayerController();
        BaseMediaPlayController mediaPlayController = playerController != null ? playerController.mediaPlayController() : null;
        PoolMediaPlayController poolMediaPlayController = mediaPlayController instanceof PoolMediaPlayController ? (PoolMediaPlayController) mediaPlayController : null;
        if (poolMediaPlayController != null) {
            poolMediaPlayController.stopAndReturnToFreePool(VideoMoleculePlayerDelegate$stop$1$1.INSTANCE);
        }
        if (this.usePlayerFromPool) {
            BasePlayerController playerController2 = getPlayerController();
            if (playerController2 != null && (listenersController = playerController2.listenersController()) != null) {
                listenersController.removePlayerListener(playerListener);
            }
            setPlayerController(null);
        }
    }

    public final void switchPlayWhenReadyTo(boolean playWhenReady) {
        BaseMediaPlayController mediaPlayController;
        BasePlayerController playerController = getPlayerController();
        if (playerController == null || (mediaPlayController = playerController.mediaPlayController()) == null) {
            return;
        }
        if (playWhenReady) {
            mediaPlayController.resume();
        } else {
            mediaPlayController.pause();
        }
    }

    public final Q videoSize() {
        BaseVideoInfoController videoInfoController;
        BasePlayerController playerController = getPlayerController();
        if (playerController == null || (videoInfoController = playerController.videoInfoController()) == null) {
            return null;
        }
        return videoInfoController.videoSize();
    }
}
