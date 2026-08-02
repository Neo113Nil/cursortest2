package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation;

import B90.X;
import B90.Y;
import B90.Z;
import B90.a0;
import B90.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.app.android.pdpvideomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegateListener;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2EventsDelegate;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2ViewModel;
import ru.ozon.app.android.video.player.PlayerState;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnPausePlayerControllerListener;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnStopPlayerControllerListener;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;

@Metadata(d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\r\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ\u0006\u0010\u0011\u001a\u00020\u0010R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2EventsDelegate;", "", "<init>", "()V", "viewModel", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2ViewModel;", "moleculeVh", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/VideoMoleculeViewHolder;", "playerEventCallback", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/PlayerEventCallback;", "playerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "visibilityListener", "ru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2EventsDelegate$visibilityListener$1", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2EventsDelegate$visibilityListener$1;", "setup", "", "clear", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryV2EventsDelegate {
    private VideoMoleculeViewHolder moleculeVh;
    private PlayerEventCallback playerEventCallback;

    @NotNull
    private final PlayerListenersContainer playerListener;
    private ReviewGalleryV2ViewModel viewModel;

    @NotNull
    private final ReviewGalleryV2EventsDelegate$visibilityListener$1 visibilityListener;

    /* JADX WARN: Type inference failed for: r0v2, types: [ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2EventsDelegate$visibilityListener$1] */
    public ReviewGalleryV2EventsDelegate() {
        PlayerListenersContainer.Builder builder = new PlayerListenersContainer.Builder();
        builder.hasAudio(new X(this));
        builder.onFinish(new Y(this));
        builder.onRenderedFirstFrame(new Z(this, 3));
        int i11 = 4;
        builder.onReady(new a0(this, i11));
        builder.onStart(new b0(this, i11));
        builder.onPause(new OnPausePlayerControllerListener() { // from class: dV.a
            @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnPausePlayerControllerListener
            public final void onPause() {
                ReviewGalleryV2EventsDelegate.playerListener$lambda$7$lambda$5(ReviewGalleryV2EventsDelegate.this);
            }
        });
        builder.onStop(new OnStopPlayerControllerListener() { // from class: dV.b
            @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnStopPlayerControllerListener
            public final void onStop() {
                ReviewGalleryV2EventsDelegate.playerListener$lambda$7$lambda$6(ReviewGalleryV2EventsDelegate.this);
            }
        });
        this.playerListener = builder.build();
        this.visibilityListener = new VideoMoleculeVisibilityDelegateListener() { // from class: ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2EventsDelegate$visibilityListener$1
            /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
            
                r2 = r1.this$0.viewModel;
             */
            @Override // ru.ozon.app.android.pdpvideomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegateListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void hide(boolean isForce) {
                ReviewGalleryV2ViewModel reviewGalleryV2ViewModel;
                if (!isForce || reviewGalleryV2ViewModel == null) {
                    return;
                }
                reviewGalleryV2ViewModel.visibilityChanged(false);
            }

            @Override // ru.ozon.app.android.pdpvideomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegateListener
            public void hideWithAnimation() {
                VideoMoleculeVisibilityDelegateListener.DefaultImpls.hideWithAnimation(this);
            }

            /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
            
                r2 = r1.this$0.viewModel;
             */
            @Override // ru.ozon.app.android.pdpvideomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegateListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void show(boolean isForce) {
                ReviewGalleryV2ViewModel reviewGalleryV2ViewModel;
                if (!isForce || reviewGalleryV2ViewModel == null) {
                    return;
                }
                reviewGalleryV2ViewModel.visibilityChanged(true);
            }

            @Override // ru.ozon.app.android.pdpvideomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegateListener
            public void showWithAnimation() {
                VideoMoleculeVisibilityDelegateListener.DefaultImpls.showWithAnimation(this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$7$lambda$0(ReviewGalleryV2EventsDelegate reviewGalleryV2EventsDelegate, boolean z11) {
        ReviewGalleryV2ViewModel reviewGalleryV2ViewModel = reviewGalleryV2EventsDelegate.viewModel;
        if (reviewGalleryV2ViewModel != null) {
            reviewGalleryV2ViewModel.hasAudioChanged(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$7$lambda$1(ReviewGalleryV2EventsDelegate reviewGalleryV2EventsDelegate) {
        ReviewGalleryV2ViewModel reviewGalleryV2ViewModel = reviewGalleryV2EventsDelegate.viewModel;
        if (reviewGalleryV2ViewModel != null) {
            reviewGalleryV2ViewModel.videoFinished();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$7$lambda$2(ReviewGalleryV2EventsDelegate reviewGalleryV2EventsDelegate) {
        ReviewGalleryV2ViewModel reviewGalleryV2ViewModel = reviewGalleryV2EventsDelegate.viewModel;
        if (reviewGalleryV2ViewModel != null) {
            reviewGalleryV2ViewModel.onRenderedFirstFrame();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$7$lambda$3(ReviewGalleryV2EventsDelegate reviewGalleryV2EventsDelegate, PlayerState playerState) {
        Intrinsics.checkNotNullParameter(playerState, "playerState");
        ReviewGalleryV2ViewModel reviewGalleryV2ViewModel = reviewGalleryV2EventsDelegate.viewModel;
        if (reviewGalleryV2ViewModel != null) {
            reviewGalleryV2ViewModel.contentIsLoaded();
        }
        PlayerEventCallback playerEventCallback = reviewGalleryV2EventsDelegate.playerEventCallback;
        if (playerEventCallback != null) {
            playerEventCallback.onReady(playerState.getDuration());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$7$lambda$4(ReviewGalleryV2EventsDelegate reviewGalleryV2EventsDelegate, PlayerState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        PlayerEventCallback playerEventCallback = reviewGalleryV2EventsDelegate.playerEventCallback;
        if (playerEventCallback != null) {
            playerEventCallback.onStart();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$7$lambda$5(ReviewGalleryV2EventsDelegate reviewGalleryV2EventsDelegate) {
        PlayerEventCallback playerEventCallback = reviewGalleryV2EventsDelegate.playerEventCallback;
        if (playerEventCallback != null) {
            playerEventCallback.onPause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$7$lambda$6(ReviewGalleryV2EventsDelegate reviewGalleryV2EventsDelegate) {
        PlayerEventCallback playerEventCallback = reviewGalleryV2EventsDelegate.playerEventCallback;
        if (playerEventCallback != null) {
            playerEventCallback.onStop();
        }
    }

    public final void clear() {
        VideoMoleculeViewHolder videoMoleculeViewHolder = this.moleculeVh;
        if (videoMoleculeViewHolder != null) {
            videoMoleculeViewHolder.clearPlayerListener();
            videoMoleculeViewHolder.clearVisibilityListener();
        }
        this.viewModel = null;
        this.moleculeVh = null;
        this.playerEventCallback = null;
    }

    public final void setup(@NotNull VideoMoleculeViewHolder moleculeVh, @NotNull ReviewGalleryV2ViewModel viewModel, PlayerEventCallback playerEventCallback) {
        Intrinsics.checkNotNullParameter(moleculeVh, "moleculeVh");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.viewModel = viewModel;
        this.moleculeVh = moleculeVh;
        this.playerEventCallback = playerEventCallback;
        if (moleculeVh != null) {
            moleculeVh.setPlayerListener(this.playerListener);
            moleculeVh.setVisibilityListener(this.visibilityListener);
        }
    }
}
