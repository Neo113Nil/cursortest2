package ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player;

import B90.C2611m;
import B90.C2612n;
import B90.C2613o;
import B90.C2614p;
import B90.C2615q;
import C90.c;
import Sc.InterfaceC4008j;
import androidx.media3.ui.PlayerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.video.manager.ProgressiveExoManager;
import ru.ozon.app.android.video.player.PlayerState;
import ru.ozon.app.android.video.playerV2.playerController.base.BasePlayerController;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseMediaPlayController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerSoundController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.PlayerViewBindStrategy;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.app.android.video.preload.PlayerPreloader;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ?\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J%\u0010#\u001a\u00020\"2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$J!\u0010'\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020\u0004H\u0002¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R*\u00101\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R*\u00107\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b8\u00104\"\u0004\b9\u00106R*\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u00102\u001a\u0004\b;\u00104\"\u0004\b<\u00106R*\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00102\u001a\u0004\b>\u00104\"\u0004\b?\u00106R*\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u00102\u001a\u0004\bA\u00104\"\u0004\bB\u00106R>\u0010F\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0018\u00010Dj\u0004\u0018\u0001`E\u0012\u0004\u0012\u00020\u0013\u0018\u00010C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001b\u0010Q\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010N\u001a\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bZ\u0010[¨\u0006\\"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryVideoPlayer;", "", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "videoController", "", "isPlayerPoolSupported", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "<init>", "(Lru/ozon/app/android/video/playerV2/videoController/VideoController;ZLru/ozon/app/android/video/preload/PlayerPreloader;)V", "", "videoUrl", "Landroidx/media3/ui/PlayerView;", "playerView", "isMuted", "shouldRepeat", "isFirstItem", "", "position", "", "bind", "(Ljava/lang/String;Landroidx/media3/ui/PlayerView;ZZZJ)V", "resume", "()V", "pause", "setMuted", "(Z)V", "release", "(Landroidx/media3/ui/PlayerView;)V", "setPosition", "(J)V", "isPlaying", "()Z", "usePlayerPool", "Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerController;", "playerController", "(Ljava/lang/String;Z)Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerController;", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BaseMediaPlayController;", "mediaPlayController", "shouldResumeOnBind", "(Ljava/lang/String;Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BaseMediaPlayController;)Z", "resumePlayer", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/PlayerViewBindStrategy;", "getPlayerBindStrategy", "(Z)Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/PlayerViewBindStrategy;", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "Z", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "Lkotlin/Function0;", "onBuffering", "Lkotlin/jvm/functions/Function0;", "getOnBuffering", "()Lkotlin/jvm/functions/Function0;", "setOnBuffering", "(Lkotlin/jvm/functions/Function0;)V", "onRenderedFirstFrame", "getOnRenderedFirstFrame", "setOnRenderedFirstFrame", "onReady", "getOnReady", "setOnReady", "onStart", "getOnStart", "setOnStart", "onFinish", "getOnFinish", "setOnFinish", "Lkotlin/Function2;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onError", "Lkotlin/jvm/functions/Function2;", "getOnError", "()Lkotlin/jvm/functions/Function2;", "setOnError", "(Lkotlin/jvm/functions/Function2;)V", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryPlayerProviderDelegate;", "playerProviderDelegate$delegate", "LSc/j;", "getPlayerProviderDelegate", "()Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryPlayerProviderDelegate;", "playerProviderDelegate", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryPlayerViewVisibilityDelegate;", "playerViewVisibilityDelegate$delegate", "getPlayerViewVisibilityDelegate", "()Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryPlayerViewVisibilityDelegate;", "playerViewVisibilityDelegate", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "playerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "getPosition", "()J", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryVideoPlayer {
    private final boolean isPlayerPoolSupported;
    private Function0<Unit> onBuffering;
    private Function2<? super String, ? super Exception, Unit> onError;
    private Function0<Unit> onFinish;
    private Function0<Unit> onReady;
    private Function0<Unit> onRenderedFirstFrame;
    private Function0<Unit> onStart;

    @NotNull
    private final PlayerListenersContainer playerListener;
    private final PlayerPreloader playerPreloader;

    /* renamed from: playerProviderDelegate$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j playerProviderDelegate;

    /* renamed from: playerViewVisibilityDelegate$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j playerViewVisibilityDelegate;

    @NotNull
    private final VideoController videoController;

    public GalleryVideoPlayer(@NotNull VideoController videoController, boolean z11, PlayerPreloader playerPreloader) {
        Intrinsics.checkNotNullParameter(videoController, "videoController");
        this.videoController = videoController;
        this.isPlayerPoolSupported = z11;
        this.playerPreloader = playerPreloader;
        this.playerProviderDelegate = DelegatesKt.lazyUnsafe(new GalleryVideoPlayer$playerProviderDelegate$2(this));
        this.playerViewVisibilityDelegate = DelegatesKt.lazyUnsafe(GalleryVideoPlayer$playerViewVisibilityDelegate$2.INSTANCE);
        PlayerListenersContainer.Builder builder = new PlayerListenersContainer.Builder();
        builder.onRenderedFirstFrame(new c(this));
        builder.onError(new C2611m(this));
        builder.onBuffer(new C2612n(this));
        builder.onReady(new C2613o(this, 2));
        builder.onStart(new C2614p(this));
        builder.onFinish(new C2615q(this, 4));
        this.playerListener = builder.build();
    }

    private final PlayerViewBindStrategy getPlayerBindStrategy(boolean resumePlayer) {
        return resumePlayer ? new PlayerViewBindStrategy.BindAfterLoadStarted(this.videoController.getProgressiveExoManager()) : PlayerViewBindStrategy.BindBeforeLoadStarted.INSTANCE;
    }

    private final GalleryPlayerProviderDelegate getPlayerProviderDelegate() {
        return (GalleryPlayerProviderDelegate) this.playerProviderDelegate.getValue();
    }

    private final GalleryPlayerViewVisibilityDelegate getPlayerViewVisibilityDelegate() {
        return (GalleryPlayerViewVisibilityDelegate) this.playerViewVisibilityDelegate.getValue();
    }

    private final BasePlayerController playerController(String videoUrl, boolean usePlayerPool) {
        return getPlayerProviderDelegate().getPlayerController(videoUrl, usePlayerPool);
    }

    static /* synthetic */ BasePlayerController playerController$default(GalleryVideoPlayer galleryVideoPlayer, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return galleryVideoPlayer.playerController(str, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$6$lambda$0(GalleryVideoPlayer galleryVideoPlayer) {
        Function0<Unit> function0 = galleryVideoPlayer.onRenderedFirstFrame;
        if (function0 != null) {
            function0.invoke();
        }
        galleryVideoPlayer.getPlayerViewVisibilityDelegate().onRenderedFirstFrame();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$6$lambda$1(GalleryVideoPlayer galleryVideoPlayer, String message, Exception exc, Boolean bool) {
        Intrinsics.checkNotNullParameter(message, "message");
        Function2<? super String, ? super Exception, Unit> function2 = galleryVideoPlayer.onError;
        if (function2 != null) {
            function2.invoke(message, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$6$lambda$2(GalleryVideoPlayer galleryVideoPlayer) {
        Function0<Unit> function0 = galleryVideoPlayer.onBuffering;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$6$lambda$3(GalleryVideoPlayer galleryVideoPlayer, PlayerState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Function0<Unit> function0 = galleryVideoPlayer.onReady;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$6$lambda$4(GalleryVideoPlayer galleryVideoPlayer, PlayerState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Function0<Unit> function0 = galleryVideoPlayer.onStart;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$6$lambda$5(GalleryVideoPlayer galleryVideoPlayer) {
        Function0<Unit> function0 = galleryVideoPlayer.onFinish;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final boolean shouldResumeOnBind(String videoUrl, BaseMediaPlayController mediaPlayController) {
        if (!mediaPlayController.isPlayerActive()) {
            return false;
        }
        PlayerPreloader playerPreloader = this.playerPreloader;
        return Intrinsics.d(playerPreloader != null ? playerPreloader.getLastPreloadedUrl() : null, videoUrl);
    }

    public final void bind(@NotNull String videoUrl, @NotNull PlayerView playerView, boolean isMuted, boolean shouldRepeat, boolean isFirstItem, long position) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(playerView, "playerView");
        BasePlayerController playerController = playerController(videoUrl, isFirstItem);
        boolean shouldResumeOnBind = shouldResumeOnBind(videoUrl, playerController.mediaPlayController());
        getPlayerViewVisibilityDelegate().onBindPlayerView(playerView);
        playerController.playerViewController().bindPlayerView(playerView, getPlayerBindStrategy(shouldResumeOnBind));
        if (!shouldResumeOnBind) {
            BaseMediaPlayController mediaPlayController = playerController.mediaPlayController();
            ProgressiveExoManager progressiveExoManager = this.videoController.getProgressiveExoManager();
            PlayerListenersContainer playerListenersContainer = this.playerListener;
            Long valueOf = Long.valueOf(position);
            mediaPlayController.prepareMediaToPlay(videoUrl, progressiveExoManager, false, shouldRepeat, isMuted, playerListenersContainer, null, valueOf.longValue() > 0 ? valueOf : null);
            return;
        }
        playerController.listenersController().setPlayerListener(this.playerListener);
        playerController.mediaPlayController().pause();
        BasePlayerSoundController soundController = playerController.soundController();
        soundController.checkHasAudio();
        soundController.setMute(isMuted);
        Long valueOf2 = Long.valueOf(position);
        Long l11 = valueOf2.longValue() > 0 ? valueOf2 : null;
        if (l11 != null) {
            playerController.positionController().seekTo(l11.longValue());
        }
        playerController.mediaPlayController().updateRepeatMode(shouldRepeat);
    }

    public final long getPosition() {
        return playerController$default(this, null, false, 3, null).positionController().getCurrentPosition();
    }

    public final boolean isPlaying() {
        return playerController$default(this, null, false, 3, null).mediaPlayController().isPlaying();
    }

    public final void pause() {
        playerController$default(this, null, false, 3, null).mediaPlayController().pause();
    }

    public final void release(PlayerView playerView) {
        getPlayerProviderDelegate().stopOrReleasePlayerController(playerView);
        getPlayerViewVisibilityDelegate().clear();
    }

    public final void resume() {
        BaseMediaPlayController mediaPlayController = playerController$default(this, null, false, 3, null).mediaPlayController();
        mediaPlayController.resume();
        if (mediaPlayController.isReadyToPlayAndPaused() || mediaPlayController.isPlaying()) {
            return;
        }
        mediaPlayController.retryLoadMedia();
    }

    public final void setMuted(boolean isMuted) {
        playerController$default(this, null, false, 3, null).soundController().setMute(isMuted);
    }

    public final void setOnBuffering(Function0<Unit> function0) {
        this.onBuffering = function0;
    }

    public final void setOnError(Function2<? super String, ? super Exception, Unit> function2) {
        this.onError = function2;
    }

    public final void setOnFinish(Function0<Unit> function0) {
        this.onFinish = function0;
    }

    public final void setOnReady(Function0<Unit> function0) {
        this.onReady = function0;
    }

    public final void setOnRenderedFirstFrame(Function0<Unit> function0) {
        this.onRenderedFirstFrame = function0;
    }

    public final void setOnStart(Function0<Unit> function0) {
        this.onStart = function0;
    }

    public final void setPosition(long position) {
        playerController$default(this, null, false, 3, null).positionController().seekTo(position);
    }
}
