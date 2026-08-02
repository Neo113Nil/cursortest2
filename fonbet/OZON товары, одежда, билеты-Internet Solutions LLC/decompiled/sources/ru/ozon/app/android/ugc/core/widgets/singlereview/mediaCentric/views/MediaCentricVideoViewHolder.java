package ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views;

import B5.C2598b;
import B90.C2600b;
import B90.Z;
import B90.a0;
import B90.b0;
import Cy.b;
import Lm0.a;
import WZ.l;
import WZ.t;
import android.view.View;
import androidx.media3.ui.PlayerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricVO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricViewModel;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views.MediaCentricItemsDiffer;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views.MediaCentricVideoViewHolder;
import ru.ozon.app.android.video.player.PlayerState;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnPausePlayerControllerListener;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerPositionController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.BasePlayerViewController;
import ru.ozon.app.android.video.playerV2.playerController.singleInstance.SingleInstancePlayerController;
import ru.ozon.app.android.video.playerV2.playerController.singleInstance.nestedControllers.SingleInstanceMediaPlayController;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bi\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\u00020\u000f*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001f\u0010 J!\u0010$\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000fH\u0002¢\u0006\u0004\b&\u0010\u001eJ\u0017\u0010'\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J%\u0010'\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00022\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)H\u0016¢\u0006\u0004\b'\u0010,J\u000f\u0010-\u001a\u00020\u000fH\u0016¢\u0006\u0004\b-\u0010\u001eJ\u000f\u0010.\u001a\u00020\u000fH\u0016¢\u0006\u0004\b.\u0010\u001eJ\u0017\u00100\u001a\u00020\u000f2\b\b\u0002\u0010/\u001a\u00020!¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u000f2\b\b\u0002\u00102\u001a\u00020!¢\u0006\u0004\b3\u00101J\u0015\u00105\u001a\u00020\u000f2\u0006\u00104\u001a\u00020!¢\u0006\u0004\b5\u00101R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00106R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00107R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00108R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00109R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010:R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010;R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricVideoViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricItemViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO$Video;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricViewModel;", "mediaCentricViewModel", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricProgressBar;", "progressBar", "Lru/ozon/uni/android/atom/image/Image;", "previewView", "Landroidx/media3/ui/PlayerView;", "playerView", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "videoController", "Lkotlin/Function1;", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "", "previewWithPreloadVideoClickAction", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Landroid/view/View;", "containerView", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricViewModel;Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricProgressBar;Lru/ozon/uni/android/atom/image/Image;Landroidx/media3/ui/PlayerView;Lru/ozon/app/android/video/playerV2/videoController/VideoController;Lkotlin/jvm/functions/Function1;LWZ/l;Lkotlin/jvm/functions/Function1;Landroid/view/View;)V", "Lru/ozon/app/android/video/playerV2/playerController/singleInstance/SingleInstancePlayerController;", "item", "bindPlayer", "(Lru/ozon/app/android/video/playerV2/playerController/singleInstance/SingleInstancePlayerController;Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO$Video;)V", "bindProgressBar", "()V", "getOrCreatePlayer", "()Lru/ozon/app/android/video/playerV2/playerController/singleInstance/SingleInstancePlayerController;", "", "isPlaybackRequired", "isRewindRequired", "updatePlayback", "(ZZ)V", "releasePlayer", "bind", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO$Video;)V", "", "", "payloads", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO$Video;Ljava/util/List;)V", "onDetach", "onRecycle", "withAnalytics", "replayVideo", "(Z)V", "fromLifecycle", "resumePlayer", "withRewind", "pausePlayer", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricViewModel;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricProgressBar;", "Lru/ozon/uni/android/atom/image/Image;", "Landroidx/media3/ui/PlayerView;", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "playerController", "Lru/ozon/app/android/video/playerV2/playerController/singleInstance/SingleInstancePlayerController;", "isLastPlaybackRequired", "Z", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "playerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaCentricVideoViewHolder extends MediaCentricItemViewHolder<MediaCentricVO.MediaItemVO.Video> {
    private boolean isLastPlaybackRequired;
    private final MediaCentricViewModel mediaCentricViewModel;
    private SingleInstancePlayerController playerController;

    @NotNull
    private final PlayerListenersContainer playerListener;

    @NotNull
    private final PlayerView playerView;

    @NotNull
    private final Image previewView;

    @NotNull
    private final Function1<PreloadVideoInfo, Unit> previewWithPreloadVideoClickAction;

    @NotNull
    private final MediaCentricProgressBar progressBar;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final VideoController videoController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaCentricVideoViewHolder(MediaCentricViewModel mediaCentricViewModel, @NotNull MediaCentricProgressBar progressBar, @NotNull Image previewView, @NotNull PlayerView playerView, @NotNull VideoController videoController, @NotNull Function1<? super PreloadVideoInfo, Unit> previewWithPreloadVideoClickAction, @NotNull l tokenizedAnalytics, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull View containerView) {
        super(tokenizedAnalytics, containerView, null);
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(playerView, "playerView");
        Intrinsics.checkNotNullParameter(videoController, "videoController");
        Intrinsics.checkNotNullParameter(previewWithPreloadVideoClickAction, "previewWithPreloadVideoClickAction");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.mediaCentricViewModel = mediaCentricViewModel;
        this.progressBar = progressBar;
        this.previewView = previewView;
        this.playerView = playerView;
        this.videoController = videoController;
        this.previewWithPreloadVideoClickAction = previewWithPreloadVideoClickAction;
        this.tokenizedAnalytics = tokenizedAnalytics;
        PlayerListenersContainer.Builder builder = new PlayerListenersContainer.Builder();
        int i11 = 1;
        builder.onRenderedFirstFrame(new Z(this, i11));
        builder.onReady(new a0(this, i11));
        builder.onStart(new b0(this, i11));
        builder.onError(new C2598b(this));
        builder.onBuffer(new C2600b(this));
        builder.onPause(new OnPausePlayerControllerListener() { // from class: FV.b
            @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnPausePlayerControllerListener
            public final void onPause() {
                MediaCentricVideoViewHolder.playerListener$lambda$6$lambda$5(MediaCentricVideoViewHolder.this);
            }
        });
        this.playerListener = builder.build();
        containerView.setOnClickListener(new b(1, this, actionHandler));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$9(MediaCentricVideoViewHolder mediaCentricVideoViewHolder, Function1 function1, View view) {
        MediaCentricVO.MediaItemVO.Video item;
        PreloadVideoInfo fullVideoInfo;
        MediaCentricVO.MediaItemVO.Video item2 = mediaCentricVideoViewHolder.getItem();
        if (item2 != null) {
            if ((item2.getClickAction() instanceof AtomAction.Move) && (item = mediaCentricVideoViewHolder.getItem()) != null && (fullVideoInfo = item.getFullVideoInfo()) != null) {
                mediaCentricVideoViewHolder.previewWithPreloadVideoClickAction.invoke(fullVideoInfo);
            }
            function1.invoke(item2.getClickAction());
        }
    }

    private final void bindPlayer(SingleInstancePlayerController singleInstancePlayerController, MediaCentricVO.MediaItemVO.Video video) {
        BasePlayerViewController.DefaultImpls.bindPlayerView$default(singleInstancePlayerController.playerViewController(), this.playerView, null, 2, null);
        ViewExtKt.show(this.playerView);
        singleInstancePlayerController.mediaPlayController().prepareMediaToPlay(video.getVideo().getVideoUrl(), video.getVideo().getFormat() == PreloadVideoInfo.VideoFormat.MP4 ? this.videoController.getProgressiveExoManager() : this.videoController.getExoManagerLive(), video.getIsSelected() && video.getIsPlaybackAvailable(), true, true, this.playerListener, null, null);
    }

    private final void bindProgressBar() {
        this.progressBar.setAnimationListener(getAdapterPosition(), new MediaCentricVideoViewHolder$bindProgressBar$1(this));
    }

    private final SingleInstancePlayerController getOrCreatePlayer() {
        SingleInstancePlayerController singleInstancePlayerController = this.playerController;
        if (singleInstancePlayerController != null) {
            return singleInstancePlayerController;
        }
        SingleInstancePlayerController singleInstancePlayerController$default = VideoController.DefaultImpls.getSingleInstancePlayerController$default(this.videoController, null, 1, null);
        this.playerController = singleInstancePlayerController$default;
        return singleInstancePlayerController$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$6$lambda$0(MediaCentricVideoViewHolder mediaCentricVideoViewHolder) {
        ViewExtKt.gone(mediaCentricVideoViewHolder.previewView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$6$lambda$1(MediaCentricVideoViewHolder mediaCentricVideoViewHolder, PlayerState playerState) {
        MediaCentricVO.MediaItemVO.Video item;
        SingleInstanceMediaPlayController mediaPlayController;
        Intrinsics.checkNotNullParameter(playerState, "playerState");
        mediaCentricVideoViewHolder.progressBar.setProgressDuration(mediaCentricVideoViewHolder.getAdapterPosition(), playerState.getDuration());
        if (mediaCentricVideoViewHolder.progressBar.getCurrentItemPosition() != mediaCentricVideoViewHolder.getAdapterPosition() || (item = mediaCentricVideoViewHolder.getItem()) == null || !item.getIsPlaybackAvailable()) {
            mediaCentricVideoViewHolder.progressBar.pause(mediaCentricVideoViewHolder.getAdapterPosition());
            return;
        }
        ViewExtKt.gone(mediaCentricVideoViewHolder.previewView);
        resumePlayer$default(mediaCentricVideoViewHolder, false, 1, null);
        SingleInstancePlayerController singleInstancePlayerController = mediaCentricVideoViewHolder.playerController;
        if (singleInstancePlayerController == null || (mediaPlayController = singleInstancePlayerController.mediaPlayController()) == null || !mediaPlayController.isPlaying()) {
            return;
        }
        mediaCentricVideoViewHolder.progressBar.play(mediaCentricVideoViewHolder.getAdapterPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$6$lambda$2(MediaCentricVideoViewHolder mediaCentricVideoViewHolder, PlayerState state) {
        MediaCentricVO.MediaItemVO.Video item;
        t videoStartEvent;
        Intrinsics.checkNotNullParameter(state, "state");
        if (mediaCentricVideoViewHolder.progressBar.getCurrentItemPosition() == mediaCentricVideoViewHolder.getAdapterPosition()) {
            ViewExtKt.gone(mediaCentricVideoViewHolder.previewView);
            mediaCentricVideoViewHolder.progressBar.setProgressDuration(mediaCentricVideoViewHolder.getAdapterPosition(), state.getDuration());
            mediaCentricVideoViewHolder.progressBar.play(mediaCentricVideoViewHolder.getAdapterPosition());
            MediaCentricViewModel mediaCentricViewModel = mediaCentricVideoViewHolder.mediaCentricViewModel;
            if (mediaCentricViewModel == null || !mediaCentricViewModel.isVideoStartEventNotProcessed(mediaCentricVideoViewHolder.getAdapterPosition()) || (item = mediaCentricVideoViewHolder.getItem()) == null || (videoStartEvent = item.getVideoStartEvent()) == null) {
                return;
            }
            TokenizedAnalyticsExtKt.processViewEvents(mediaCentricVideoViewHolder.tokenizedAnalytics, videoStartEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$6$lambda$3(MediaCentricVideoViewHolder mediaCentricVideoViewHolder, String message, Exception exc, Boolean bool) {
        String message2;
        Intrinsics.checkNotNullParameter(message, "message");
        mediaCentricVideoViewHolder.releasePlayer();
        mediaCentricVideoViewHolder.progressBar.stopAndFill(mediaCentricVideoViewHolder.getAdapterPosition());
        ViewExtKt.show(mediaCentricVideoViewHolder.previewView);
        a.b bVar = a.f17149a;
        if (exc != null && (message2 = exc.getMessage()) != null) {
            message = message2;
        }
        bVar.e(message, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$6$lambda$4(MediaCentricVideoViewHolder mediaCentricVideoViewHolder) {
        mediaCentricVideoViewHolder.progressBar.pause(mediaCentricVideoViewHolder.getAdapterPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$6$lambda$5(MediaCentricVideoViewHolder mediaCentricVideoViewHolder) {
        mediaCentricVideoViewHolder.progressBar.pause(mediaCentricVideoViewHolder.getAdapterPosition());
    }

    private final void releasePlayer() {
        this.progressBar.removeAnimationListener(getAdapterPosition());
        SingleInstancePlayerController singleInstancePlayerController = this.playerController;
        if (singleInstancePlayerController != null) {
            singleInstancePlayerController.listenersController().removePlayerListener(this.playerListener);
            singleInstancePlayerController.playerViewController().unbindPlayerView(this.playerView);
            singleInstancePlayerController.mediaPlayController().release(new MediaCentricVideoViewHolder$releasePlayer$1$1(this));
        }
        ViewExtKt.hide(this.playerView);
    }

    public static /* synthetic */ void replayVideo$default(MediaCentricVideoViewHolder mediaCentricVideoViewHolder, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        mediaCentricVideoViewHolder.replayVideo(z11);
    }

    public static /* synthetic */ void resumePlayer$default(MediaCentricVideoViewHolder mediaCentricVideoViewHolder, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        mediaCentricVideoViewHolder.resumePlayer(z11);
    }

    private final void updatePlayback(boolean isPlaybackRequired, boolean isRewindRequired) {
        this.isLastPlaybackRequired = isPlaybackRequired;
        if (!isPlaybackRequired) {
            pausePlayer(isRewindRequired);
            return;
        }
        if (this.playerController != null) {
            resumePlayer$default(this, false, 1, null);
            return;
        }
        MediaCentricVO.MediaItemVO.Video item = getItem();
        if (item != null) {
            bind(item);
        }
    }

    @Override // jk0.j
    public void onDetach() {
        super.onDetach();
        releasePlayer();
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        releasePlayer();
    }

    public final void pausePlayer(boolean withRewind) {
        SingleInstancePlayerController singleInstancePlayerController = this.playerController;
        if (singleInstancePlayerController != null) {
            SingleInstanceMediaPlayController mediaPlayController = singleInstancePlayerController.mediaPlayController();
            if (mediaPlayController.isReadyToPlayAndPaused()) {
                return;
            }
            mediaPlayController.pause();
            if (withRewind) {
                singleInstancePlayerController.positionController().seekTo(0L);
            }
        }
    }

    public final void replayVideo(boolean withAnalytics) {
        MediaCentricViewModel mediaCentricViewModel;
        MediaCentricVO.MediaItemVO.Video item;
        t videoEndEvent;
        BasePlayerPositionController positionController;
        this.progressBar.stopAndReset();
        SingleInstancePlayerController singleInstancePlayerController = this.playerController;
        if (singleInstancePlayerController != null && (positionController = singleInstancePlayerController.positionController()) != null) {
            positionController.seekTo(0L);
        }
        MediaCentricVO.MediaItemVO.Video item2 = getItem();
        if (item2 != null && item2.getIsSelected() && item2.getIsPlaybackAvailable()) {
            resumePlayer$default(this, false, 1, null);
        }
        if (!withAnalytics || (mediaCentricViewModel = this.mediaCentricViewModel) == null || !mediaCentricViewModel.isVideoEndEventNotProcessed(getAdapterPosition()) || (item = getItem()) == null || (videoEndEvent = item.getVideoEndEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, videoEndEvent);
    }

    public final void resumePlayer(boolean fromLifecycle) {
        SingleInstancePlayerController singleInstancePlayerController;
        SingleInstanceMediaPlayController mediaPlayController;
        if ((fromLifecycle && !this.isLastPlaybackRequired) || (singleInstancePlayerController = this.playerController) == null || (mediaPlayController = singleInstancePlayerController.mediaPlayController()) == null) {
            return;
        }
        if (!mediaPlayController.isReadyToPlayAndPaused()) {
            mediaPlayController = null;
        }
        if (mediaPlayController != null) {
            mediaPlayController.resume();
        }
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views.MediaCentricItemViewHolder
    public /* bridge */ /* synthetic */ void bind(MediaCentricVO.MediaItemVO.Video video, List list) {
        bind2(video, (List<? extends Object>) list);
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views.MediaCentricItemViewHolder
    public void bind(@NotNull MediaCentricVO.MediaItemVO.Video item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind((MediaCentricVideoViewHolder) item);
        ImageHolderKt.bindOrGone$default(this.previewView, item.getPreview(), null, 2, null);
        bindProgressBar();
        bindPlayer(getOrCreatePlayer(), item);
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull MediaCentricVO.MediaItemVO.Video item, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.bind((MediaCentricVideoViewHolder) item);
        bindProgressBar();
        for (Object obj : payloads) {
            boolean z11 = false;
            boolean z12 = item.getIsSelected() && item.getIsPlaybackAvailable();
            if (obj != MediaCentricItemsDiffer.MediaCentricItemPayload.PLAYBACK_AVAILABLE_PAYLOAD) {
                z11 = true;
            }
            updatePlayback(z12, z11);
        }
    }
}
