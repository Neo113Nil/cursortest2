package ru.ozon.app.android.travel.feature.hotels.shared.player;

import AW.c;
import AW.d;
import B90.I;
import B90.J;
import B90.K;
import B90.L;
import B90.M;
import B90.N;
import Sc.InterfaceC4008j;
import androidx.media3.ui.PlayerView;
import j3.Q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.shared.player.HotelsGalleryVideoPlayer;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.app.android.video.manager.ProgressiveExoManager;
import ru.ozon.app.android.video.player.PlayerState;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnPausePlayerControllerListener;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.BasePlayerViewController;
import ru.ozon.app.android.video.playerV2.playerController.singleInstance.SingleInstancePlayerController;
import ru.ozon.app.android.video.playerV2.playerController.singleInstance.nestedControllers.SingleInstanceMediaPlayController;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0013J\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001bJ\u0013\u0010\u001f\u001a\u00020\u000f*\u00020\u0000H\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R*\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R*\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010#\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'R*\u0010.\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010#\u001a\u0004\b/\u0010%\"\u0004\b0\u0010'R*\u00101\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010#\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'R*\u00104\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010#\u001a\u0004\b5\u0010%\"\u0004\b6\u0010'R>\u0010:\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0018\u000108j\u0004\u0018\u0001`9\u0012\u0004\u0012\u00020\u000f\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R0\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR0\u0010H\u001a\u0010\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u000f\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010B\u001a\u0004\bI\u0010D\"\u0004\bJ\u0010FR\u001b\u0010P\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006V"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/shared/player/HotelsGalleryVideoPlayer;", "", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "videoController", "<init>", "(Lru/ozon/app/android/video/playerV2/videoController/VideoController;)V", "", "videoUrl", "Landroidx/media3/ui/PlayerView;", "playerView", "", "isMuted", "", "position", "repeat", "", "bind", "(Ljava/lang/String;Landroidx/media3/ui/PlayerView;ZJZ)V", "resume", "()V", "pause", "setMuted", "(Z)V", "release", "setPosition", "(J)V", "isPlaying", "()Z", "isPaused", "clearAllCallbacks$hotels_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/travel/feature/hotels/shared/player/HotelsGalleryVideoPlayer;)V", "clearAllCallbacks", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "Lkotlin/Function0;", "onBuffering", "Lkotlin/jvm/functions/Function0;", "getOnBuffering", "()Lkotlin/jvm/functions/Function0;", "setOnBuffering", "(Lkotlin/jvm/functions/Function0;)V", "onRenderedFirstFrame", "getOnRenderedFirstFrame", "setOnRenderedFirstFrame", "onReady", "getOnReady", "setOnReady", "onStart", "getOnStart", "setOnStart", "onPause", "getOnPause", "setOnPause", "onFinish", "getOnFinish", "setOnFinish", "Lkotlin/Function2;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onError", "Lkotlin/jvm/functions/Function2;", "getOnError", "()Lkotlin/jvm/functions/Function2;", "setOnError", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "onHasAudio", "Lkotlin/jvm/functions/Function1;", "getOnHasAudio", "()Lkotlin/jvm/functions/Function1;", "setOnHasAudio", "(Lkotlin/jvm/functions/Function1;)V", "Lj3/Q;", "onVideoSizeChanged", "getOnVideoSizeChanged", "setOnVideoSizeChanged", "Lru/ozon/app/android/video/playerV2/playerController/singleInstance/SingleInstancePlayerController;", "playerController$delegate", "LSc/j;", "getPlayerController", "()Lru/ozon/app/android/video/playerV2/playerController/singleInstance/SingleInstancePlayerController;", "playerController", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "playerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "getPosition", "()J", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryVideoPlayer {
    private Function0<Unit> onBuffering;
    private Function2<? super String, ? super Exception, Unit> onError;
    private Function0<Unit> onFinish;
    private Function1<? super Boolean, Unit> onHasAudio;
    private Function0<Unit> onPause;
    private Function0<Unit> onReady;
    private Function0<Unit> onRenderedFirstFrame;
    private Function0<Unit> onStart;
    private Function1<? super Q, Unit> onVideoSizeChanged;

    /* renamed from: playerController$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j playerController;

    @NotNull
    private final PlayerListenersContainer playerListener;

    @NotNull
    private final VideoController videoController;

    public HotelsGalleryVideoPlayer(@NotNull VideoController videoController) {
        Intrinsics.checkNotNullParameter(videoController, "videoController");
        this.videoController = videoController;
        this.playerController = LazyUtilsKt.unsafeLazy(new HotelsGalleryVideoPlayer$playerController$2(this));
        PlayerListenersContainer.Builder builder = new PlayerListenersContainer.Builder();
        builder.onRenderedFirstFrame(new I(this, 2));
        builder.onError(new c(this));
        builder.onBuffer(new d(this));
        builder.onReady(new J(this));
        builder.onStart(new K(this));
        builder.onPause(new OnPausePlayerControllerListener() { // from class: MR.a
            @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnPausePlayerControllerListener
            public final void onPause() {
                HotelsGalleryVideoPlayer.playerListener$lambda$9$lambda$5(HotelsGalleryVideoPlayer.this);
            }
        });
        builder.onFinish(new L(this));
        builder.hasAudio(new M(this, 3));
        builder.onVideoSizeChanged(new N(this));
        this.playerListener = builder.build();
    }

    public static /* synthetic */ void bind$default(HotelsGalleryVideoPlayer hotelsGalleryVideoPlayer, String str, PlayerView playerView, boolean z11, long j11, boolean z12, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            j11 = 0;
        }
        long j12 = j11;
        if ((i11 & 16) != 0) {
            z12 = true;
        }
        hotelsGalleryVideoPlayer.bind(str, playerView, z11, j12, z12);
    }

    private final SingleInstancePlayerController getPlayerController() {
        return (SingleInstancePlayerController) this.playerController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$9$lambda$0(HotelsGalleryVideoPlayer hotelsGalleryVideoPlayer) {
        Function0<Unit> function0 = hotelsGalleryVideoPlayer.onRenderedFirstFrame;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$9$lambda$1(HotelsGalleryVideoPlayer hotelsGalleryVideoPlayer, String message, Exception exc, Boolean bool) {
        Intrinsics.checkNotNullParameter(message, "message");
        Function2<? super String, ? super Exception, Unit> function2 = hotelsGalleryVideoPlayer.onError;
        if (function2 != null) {
            function2.invoke(message, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$9$lambda$2(HotelsGalleryVideoPlayer hotelsGalleryVideoPlayer) {
        Function0<Unit> function0 = hotelsGalleryVideoPlayer.onBuffering;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$9$lambda$3(HotelsGalleryVideoPlayer hotelsGalleryVideoPlayer, PlayerState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Function0<Unit> function0 = hotelsGalleryVideoPlayer.onReady;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$9$lambda$4(HotelsGalleryVideoPlayer hotelsGalleryVideoPlayer, PlayerState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Function0<Unit> function0 = hotelsGalleryVideoPlayer.onStart;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$9$lambda$5(HotelsGalleryVideoPlayer hotelsGalleryVideoPlayer) {
        Function0<Unit> function0 = hotelsGalleryVideoPlayer.onPause;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$9$lambda$6(HotelsGalleryVideoPlayer hotelsGalleryVideoPlayer) {
        Function0<Unit> function0 = hotelsGalleryVideoPlayer.onFinish;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$9$lambda$7(HotelsGalleryVideoPlayer hotelsGalleryVideoPlayer, boolean z11) {
        Function1<? super Boolean, Unit> function1 = hotelsGalleryVideoPlayer.onHasAudio;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$9$lambda$8(HotelsGalleryVideoPlayer hotelsGalleryVideoPlayer, Q videoSize) {
        Intrinsics.checkNotNullParameter(videoSize, "videoSize");
        Function1<? super Q, Unit> function1 = hotelsGalleryVideoPlayer.onVideoSizeChanged;
        if (function1 != null) {
            function1.invoke(videoSize);
        }
    }

    public final void bind(@NotNull String videoUrl, @NotNull PlayerView playerView, boolean isMuted, long position, boolean repeat) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(playerView, "playerView");
        SingleInstancePlayerController playerController = getPlayerController();
        BasePlayerViewController.DefaultImpls.bindPlayerView$default(playerController.playerViewController(), playerView, null, 2, null);
        SingleInstanceMediaPlayController mediaPlayController = playerController.mediaPlayController();
        ProgressiveExoManager progressiveExoManager = this.videoController.getProgressiveExoManager();
        PlayerListenersContainer playerListenersContainer = this.playerListener;
        Long valueOf = Long.valueOf(position);
        mediaPlayController.prepareMediaToPlay(videoUrl, progressiveExoManager, false, repeat, isMuted, playerListenersContainer, null, valueOf.longValue() > 0 ? valueOf : null);
    }

    public final void clearAllCallbacks$hotels_prodGoogleAllVendorsRelease(@NotNull HotelsGalleryVideoPlayer hotelsGalleryVideoPlayer) {
        Intrinsics.checkNotNullParameter(hotelsGalleryVideoPlayer, "<this>");
        hotelsGalleryVideoPlayer.onBuffering = null;
        hotelsGalleryVideoPlayer.onRenderedFirstFrame = null;
        hotelsGalleryVideoPlayer.onReady = null;
        hotelsGalleryVideoPlayer.onStart = null;
        hotelsGalleryVideoPlayer.onPause = null;
        hotelsGalleryVideoPlayer.onError = null;
        hotelsGalleryVideoPlayer.onFinish = null;
        hotelsGalleryVideoPlayer.onHasAudio = null;
        hotelsGalleryVideoPlayer.onVideoSizeChanged = null;
    }

    public final long getPosition() {
        return getPlayerController().positionController().getCurrentPosition();
    }

    public final boolean isPaused() {
        return getPlayerController().mediaPlayController().isReadyToPlayAndPaused();
    }

    public final boolean isPlaying() {
        return getPlayerController().mediaPlayController().isPlaying();
    }

    public final void pause() {
        getPlayerController().mediaPlayController().pause();
    }

    public final void release() {
        getPlayerController().mediaPlayController().release(HotelsGalleryVideoPlayer$release$1.INSTANCE);
    }

    public final void resume() {
        SingleInstanceMediaPlayController mediaPlayController = getPlayerController().mediaPlayController();
        mediaPlayController.resume();
        if (mediaPlayController.isReadyToPlayAndPaused() || mediaPlayController.isPlaying()) {
            return;
        }
        mediaPlayController.retryLoadMedia();
    }

    public final void setMuted(boolean isMuted) {
        getPlayerController().soundController().setMute(isMuted);
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

    public final void setOnHasAudio(Function1<? super Boolean, Unit> function1) {
        this.onHasAudio = function1;
    }

    public final void setOnPause(Function0<Unit> function0) {
        this.onPause = function0;
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

    public final void setOnVideoSizeChanged(Function1<? super Q, Unit> function1) {
        this.onVideoSizeChanged = function1;
    }

    public final void setPosition(long position) {
        getPlayerController().positionController().seekTo(position);
    }
}
