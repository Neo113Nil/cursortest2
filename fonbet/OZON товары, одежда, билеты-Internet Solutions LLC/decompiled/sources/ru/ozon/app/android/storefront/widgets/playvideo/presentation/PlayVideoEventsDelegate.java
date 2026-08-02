package ru.ozon.app.android.storefront.widgets.playvideo.presentation;

import DL.a;
import Fj.c;
import K1.G;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.playvideo.presentation.viewmodel.PlayVideoViewModel;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import ru.ozon.app.android.videomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.app.android.videomolecule.presentation.viewholder.orientation.auto.OnVideoMoleculeOrientationChanged;
import ru.ozon.app.android.videomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegateListener;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0002\u0007\f\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/widgets/playvideo/presentation/PlayVideoEventsDelegate;", "", "viewModel", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/viewmodel/PlayVideoViewModel;", "<init>", "(Lru/ozon/app/android/storefront/widgets/playvideo/presentation/viewmodel/PlayVideoViewModel;)V", "orientationListener", "ru/ozon/app/android/storefront/widgets/playvideo/presentation/PlayVideoEventsDelegate$orientationListener$1", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/PlayVideoEventsDelegate$orientationListener$1;", "playerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "visibilityDelegateListener", "ru/ozon/app/android/storefront/widgets/playvideo/presentation/PlayVideoEventsDelegate$visibilityDelegateListener$1", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/PlayVideoEventsDelegate$visibilityDelegateListener$1;", "setup", "", "moleculeVh", "Lru/ozon/app/android/videomolecule/presentation/viewholder/VideoMoleculeViewHolder;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlayVideoEventsDelegate {

    @NotNull
    private final PlayVideoEventsDelegate$orientationListener$1 orientationListener;

    @NotNull
    private final PlayerListenersContainer playerListener;

    @NotNull
    private final PlayVideoViewModel viewModel;

    @NotNull
    private final PlayVideoEventsDelegate$visibilityDelegateListener$1 visibilityDelegateListener;

    /* JADX WARN: Type inference failed for: r3v1, types: [ru.ozon.app.android.storefront.widgets.playvideo.presentation.PlayVideoEventsDelegate$orientationListener$1] */
    /* JADX WARN: Type inference failed for: r3v4, types: [ru.ozon.app.android.storefront.widgets.playvideo.presentation.PlayVideoEventsDelegate$visibilityDelegateListener$1] */
    public PlayVideoEventsDelegate(@NotNull PlayVideoViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.viewModel = viewModel;
        this.orientationListener = new OnVideoMoleculeOrientationChanged() { // from class: ru.ozon.app.android.storefront.widgets.playvideo.presentation.PlayVideoEventsDelegate$orientationListener$1
            @Override // ru.ozon.app.android.videomolecule.presentation.viewholder.orientation.auto.OnVideoMoleculeOrientationChanged
            public void changedToLandscape() {
                PlayVideoViewModel playVideoViewModel;
                playVideoViewModel = PlayVideoEventsDelegate.this.viewModel;
                playVideoViewModel.orientationChanged(2);
            }

            @Override // ru.ozon.app.android.videomolecule.presentation.viewholder.orientation.auto.OnVideoMoleculeOrientationChanged
            public void changedToPortrait() {
                PlayVideoViewModel playVideoViewModel;
                playVideoViewModel = PlayVideoEventsDelegate.this.viewModel;
                playVideoViewModel.orientationChanged(1);
            }
        };
        PlayerListenersContainer.Builder builder = new PlayerListenersContainer.Builder();
        builder.onMuteAudio(new c());
        builder.onUnMuteAudio(new G());
        builder.hasAudio(new a(this, 0));
        this.playerListener = builder.build();
        this.visibilityDelegateListener = new VideoMoleculeVisibilityDelegateListener() { // from class: ru.ozon.app.android.storefront.widgets.playvideo.presentation.PlayVideoEventsDelegate$visibilityDelegateListener$1
            @Override // ru.ozon.app.android.videomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegateListener
            public void hide() {
                PlayVideoViewModel playVideoViewModel;
                playVideoViewModel = PlayVideoEventsDelegate.this.viewModel;
                playVideoViewModel.visibilityChanged(false, false);
            }

            @Override // ru.ozon.app.android.videomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegateListener
            public void hideWithAnimation() {
                PlayVideoViewModel playVideoViewModel;
                playVideoViewModel = PlayVideoEventsDelegate.this.viewModel;
                playVideoViewModel.visibilityChanged(false, true);
            }

            @Override // ru.ozon.app.android.videomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegateListener
            public void show() {
                PlayVideoViewModel playVideoViewModel;
                playVideoViewModel = PlayVideoEventsDelegate.this.viewModel;
                playVideoViewModel.visibilityChanged(true, false);
            }

            @Override // ru.ozon.app.android.videomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegateListener
            public void showWithAnimation() {
                PlayVideoViewModel playVideoViewModel;
                playVideoViewModel = PlayVideoEventsDelegate.this.viewModel;
                playVideoViewModel.visibilityChanged(true, true);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$3$lambda$2(PlayVideoEventsDelegate playVideoEventsDelegate, boolean z11) {
        playVideoEventsDelegate.viewModel.hasAudioChanged(z11);
    }

    public final void setup(@NotNull VideoMoleculeViewHolder moleculeVh) {
        Intrinsics.checkNotNullParameter(moleculeVh, "moleculeVh");
        moleculeVh.setPlayerListener(this.playerListener);
        moleculeVh.addOrientationListener(this.orientationListener);
        moleculeVh.setVisibilityListener(this.visibilityDelegateListener);
    }
}
