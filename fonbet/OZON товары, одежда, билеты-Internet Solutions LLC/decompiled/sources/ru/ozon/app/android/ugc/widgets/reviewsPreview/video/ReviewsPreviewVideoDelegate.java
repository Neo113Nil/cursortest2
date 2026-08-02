package ru.ozon.app.android.ugc.widgets.reviewsPreview.video;

import B90.Q;
import B90.S;
import Sc.o;
import WZ.l;
import WZ.t;
import androidx.media3.ui.PlayerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerListenersController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.BasePlayerViewController;
import ru.ozon.app.android.video.playerV2.playerController.singleInstance.SingleInstancePlayerController;
import ru.ozon.app.android.video.playerV2.playerController.singleInstance.nestedControllers.SingleInstanceMediaPlayController;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u00010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010%R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010%R*\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/video/ReviewsPreviewVideoDelegate;", "", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "videoController", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/video/playerV2/videoController/VideoController;LWZ/l;)V", "Lru/ozon/app/android/video/playerV2/playerController/singleInstance/SingleInstancePlayerController;", "getOrCreatePlayer", "()Lru/ozon/app/android/video/playerV2/playerController/singleInstance/SingleInstancePlayerController;", "", "releasePlayer", "()V", "LWZ/t;", "videoStartEvent", "videoEndEvent", "bindAnalytics", "(LWZ/t;LWZ/t;)V", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "videoInfo", "Landroidx/media3/ui/PlayerView;", "playerView", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/video/VideoPreviewControl;", "videoPreviewControl", "onViewInOverlapBounds", "(Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;Landroidx/media3/ui/PlayerView;Lru/ozon/app/android/ugc/widgets/reviewsPreview/video/VideoPreviewControl;)V", "onVideoTileOutOfVisibleBounds", "(Landroidx/media3/ui/PlayerView;)V", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "LWZ/l;", "playerController", "Lru/ozon/app/android/video/playerV2/playerController/singleInstance/SingleInstancePlayerController;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/video/VideoPreviewControl;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/video/ReviewsPreviewVideoDelegate$RepeatState;", "repeatState", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/video/ReviewsPreviewVideoDelegate$RepeatState;", "LWZ/t;", "Lkotlin/Function0;", "onVideoLooped", "Lkotlin/jvm/functions/Function0;", "getOnVideoLooped", "()Lkotlin/jvm/functions/Function0;", "setOnVideoLooped", "(Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "playerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "RepeatState", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewsPreviewVideoDelegate {
    private Function0<Unit> onVideoLooped;
    private SingleInstancePlayerController playerController;

    @NotNull
    private final PlayerListenersContainer playerListener;

    @NotNull
    private RepeatState repeatState;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final VideoController videoController;
    private t videoEndEvent;
    private VideoPreviewControl videoPreviewControl;
    private t videoStartEvent;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/video/ReviewsPreviewVideoDelegate$RepeatState;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_RENDERED", "RENDERED_ONCE", "RENDERED_BY_LOOP", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class RepeatState {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ RepeatState[] $VALUES;
        public static final RepeatState NOT_RENDERED = new RepeatState("NOT_RENDERED", 0);
        public static final RepeatState RENDERED_ONCE = new RepeatState("RENDERED_ONCE", 1);
        public static final RepeatState RENDERED_BY_LOOP = new RepeatState("RENDERED_BY_LOOP", 2);

        private static final /* synthetic */ RepeatState[] $values() {
            return new RepeatState[]{NOT_RENDERED, RENDERED_ONCE, RENDERED_BY_LOOP};
        }

        static {
            RepeatState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private RepeatState(String str, int i11) {
        }

        public static RepeatState valueOf(String str) {
            return (RepeatState) Enum.valueOf(RepeatState.class, str);
        }

        public static RepeatState[] values() {
            return (RepeatState[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RepeatState.values().length];
            try {
                iArr[RepeatState.NOT_RENDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RepeatState.RENDERED_ONCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RepeatState.RENDERED_BY_LOOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ReviewsPreviewVideoDelegate(@NotNull VideoController videoController, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(videoController, "videoController");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.videoController = videoController;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.repeatState = RepeatState.NOT_RENDERED;
        PlayerListenersContainer.Builder builder = new PlayerListenersContainer.Builder();
        builder.onRenderedFirstFrame(new Q(this, 1));
        builder.onError(new S(this));
        this.playerListener = builder.build();
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
    public static final void playerListener$lambda$3$lambda$1(ReviewsPreviewVideoDelegate reviewsPreviewVideoDelegate) {
        RepeatState repeatState;
        VideoPreviewControl videoPreviewControl = reviewsPreviewVideoDelegate.videoPreviewControl;
        if (videoPreviewControl != null) {
            videoPreviewControl.hidePreview();
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[reviewsPreviewVideoDelegate.repeatState.ordinal()];
        if (i11 == 1) {
            t tVar = reviewsPreviewVideoDelegate.videoStartEvent;
            if (tVar != null) {
                TokenizedAnalyticsExtKt.processViewEvents(reviewsPreviewVideoDelegate.tokenizedAnalytics, tVar);
            }
            repeatState = RepeatState.RENDERED_ONCE;
        } else if (i11 == 2) {
            t tVar2 = reviewsPreviewVideoDelegate.videoEndEvent;
            if (tVar2 != null) {
                TokenizedAnalyticsExtKt.processViewEvents(reviewsPreviewVideoDelegate.tokenizedAnalytics, tVar2);
            }
            Function0<Unit> function0 = reviewsPreviewVideoDelegate.onVideoLooped;
            if (function0 != null) {
                function0.invoke();
            }
            repeatState = RepeatState.RENDERED_BY_LOOP;
        } else {
            if (i11 != 3) {
                throw new o();
            }
            repeatState = RepeatState.RENDERED_BY_LOOP;
        }
        reviewsPreviewVideoDelegate.repeatState = repeatState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$3$lambda$2(ReviewsPreviewVideoDelegate reviewsPreviewVideoDelegate, String str, Exception exc, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        VideoPreviewControl videoPreviewControl = reviewsPreviewVideoDelegate.videoPreviewControl;
        if (videoPreviewControl != null) {
            videoPreviewControl.showPreview();
        }
    }

    private final void releasePlayer() {
        SingleInstanceMediaPlayController mediaPlayController;
        BasePlayerListenersController listenersController;
        SingleInstancePlayerController singleInstancePlayerController = this.playerController;
        if (singleInstancePlayerController != null && (listenersController = singleInstancePlayerController.listenersController()) != null) {
            listenersController.removePlayerListener(this.playerListener);
        }
        SingleInstancePlayerController singleInstancePlayerController2 = this.playerController;
        if (singleInstancePlayerController2 != null && (mediaPlayController = singleInstancePlayerController2.mediaPlayController()) != null) {
            mediaPlayController.release(new ReviewsPreviewVideoDelegate$releasePlayer$1(this));
        }
        this.videoPreviewControl = null;
    }

    public final void bindAnalytics(t videoStartEvent, t videoEndEvent) {
        this.videoStartEvent = videoStartEvent;
        this.videoEndEvent = videoEndEvent;
    }

    public final void onVideoTileOutOfVisibleBounds(@NotNull PlayerView playerView) {
        BasePlayerViewController playerViewController;
        Intrinsics.checkNotNullParameter(playerView, "playerView");
        VideoPreviewControl videoPreviewControl = this.videoPreviewControl;
        if (videoPreviewControl != null) {
            videoPreviewControl.showPreview();
        }
        SingleInstancePlayerController singleInstancePlayerController = this.playerController;
        if (singleInstancePlayerController != null && (playerViewController = singleInstancePlayerController.playerViewController()) != null) {
            playerViewController.unbindPlayerView(playerView);
        }
        releasePlayer();
    }

    public final void onViewInOverlapBounds(@NotNull PreloadVideoInfo videoInfo, @NotNull PlayerView playerView, VideoPreviewControl videoPreviewControl) {
        Intrinsics.checkNotNullParameter(videoInfo, "videoInfo");
        Intrinsics.checkNotNullParameter(playerView, "playerView");
        this.videoPreviewControl = videoPreviewControl;
        this.repeatState = RepeatState.NOT_RENDERED;
        SingleInstancePlayerController orCreatePlayer = getOrCreatePlayer();
        BasePlayerViewController.DefaultImpls.bindPlayerView$default(orCreatePlayer.playerViewController(), playerView, null, 2, null);
        orCreatePlayer.mediaPlayController().prepareMediaToPlay(videoInfo.getVideoUrl(), this.videoController.getProgressiveWithCacheExoManager(), true, true, true, this.playerListener, null, null);
    }

    public final void setOnVideoLooped(Function0<Unit> function0) {
        this.onVideoLooped = function0;
    }
}
