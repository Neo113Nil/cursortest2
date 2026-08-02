package ru.ozon.app.android.storefront.widgets.playvideo.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.SocialIconButtonView;
import ru.ozon.app.android.storefront.core.socialAtoms.rightPanel.RightPanelListView;
import ru.ozon.app.android.storefront.databinding.PlayVideoWidgetBinding;
import ru.ozon.app.android.storefront.widgets.playvideo.presentation.mute.MuteButtonView;
import ru.ozon.app.android.storefront.widgets.playvideo.presentation.viewmodel.PlayVideoWidgetActions;
import ru.ozon.app.android.storefront.widgets.playvideo.presentation.viewmodel.PlayVideoWidgetViewState;
import ru.ozon.app.android.videomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegateUtils;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tJ \u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/widgets/playvideo/presentation/PlayVideoVisibilityDelegate;", "", "binding", "Lru/ozon/app/android/storefront/databinding/PlayVideoWidgetBinding;", "<init>", "(Lru/ozon/app/android/storefront/databinding/PlayVideoWidgetBinding;)V", "onOrientationChange", "", "widgetViewState", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/viewmodel/PlayVideoWidgetViewState;", "onVisibilityChanged", "action", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/viewmodel/PlayVideoWidgetActions$VisibilityChanged;", "showViews", "orientation", "", "animated", "", "shouldShowMuteBtn", "hideViews", "showPortrait", "showLandscape", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlayVideoVisibilityDelegate {

    @NotNull
    private final PlayVideoWidgetBinding binding;

    public PlayVideoVisibilityDelegate(@NotNull PlayVideoWidgetBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    private final void hideViews(boolean animated) {
        PlayVideoWidgetBinding playVideoWidgetBinding = this.binding;
        VideoMoleculeVisibilityDelegateUtils videoMoleculeVisibilityDelegateUtils = VideoMoleculeVisibilityDelegateUtils.INSTANCE;
        MuteButtonView muteButton = playVideoWidgetBinding.muteButton;
        Intrinsics.checkNotNullExpressionValue(muteButton, "muteButton");
        videoMoleculeVisibilityDelegateUtils.hide(muteButton, animated);
        RightPanelListView rightPannel = playVideoWidgetBinding.rightPannel;
        Intrinsics.checkNotNullExpressionValue(rightPannel, "rightPannel");
        videoMoleculeVisibilityDelegateUtils.hide(rightPannel, animated);
        videoMoleculeVisibilityDelegateUtils.hide(playVideoWidgetBinding.moleculeView.getBottomContainer(), animated);
        SocialIconButtonView playVideoCloseButton = playVideoWidgetBinding.playVideoCloseButton;
        Intrinsics.checkNotNullExpressionValue(playVideoCloseButton, "playVideoCloseButton");
        videoMoleculeVisibilityDelegateUtils.hide(playVideoCloseButton, animated);
    }

    private final void showLandscape(boolean animated) {
        PlayVideoWidgetBinding playVideoWidgetBinding = this.binding;
        VideoMoleculeVisibilityDelegateUtils videoMoleculeVisibilityDelegateUtils = VideoMoleculeVisibilityDelegateUtils.INSTANCE;
        MuteButtonView muteButton = playVideoWidgetBinding.muteButton;
        Intrinsics.checkNotNullExpressionValue(muteButton, "muteButton");
        videoMoleculeVisibilityDelegateUtils.hide(muteButton, animated);
        SocialIconButtonView playVideoCloseButton = playVideoWidgetBinding.playVideoCloseButton;
        Intrinsics.checkNotNullExpressionValue(playVideoCloseButton, "playVideoCloseButton");
        videoMoleculeVisibilityDelegateUtils.hide(playVideoCloseButton, animated);
        RightPanelListView rightPannel = playVideoWidgetBinding.rightPannel;
        Intrinsics.checkNotNullExpressionValue(rightPannel, "rightPannel");
        videoMoleculeVisibilityDelegateUtils.hide(rightPannel, animated);
        videoMoleculeVisibilityDelegateUtils.show(playVideoWidgetBinding.moleculeView.getBottomContainer(), animated);
    }

    private final void showPortrait(boolean animated, boolean shouldShowMuteBtn) {
        PlayVideoWidgetBinding playVideoWidgetBinding = this.binding;
        if (shouldShowMuteBtn) {
            VideoMoleculeVisibilityDelegateUtils videoMoleculeVisibilityDelegateUtils = VideoMoleculeVisibilityDelegateUtils.INSTANCE;
            MuteButtonView muteButton = playVideoWidgetBinding.muteButton;
            Intrinsics.checkNotNullExpressionValue(muteButton, "muteButton");
            videoMoleculeVisibilityDelegateUtils.show(muteButton, animated);
        }
        VideoMoleculeVisibilityDelegateUtils videoMoleculeVisibilityDelegateUtils2 = VideoMoleculeVisibilityDelegateUtils.INSTANCE;
        SocialIconButtonView playVideoCloseButton = playVideoWidgetBinding.playVideoCloseButton;
        Intrinsics.checkNotNullExpressionValue(playVideoCloseButton, "playVideoCloseButton");
        videoMoleculeVisibilityDelegateUtils2.show(playVideoCloseButton, animated);
        RightPanelListView rightPannel = playVideoWidgetBinding.rightPannel;
        Intrinsics.checkNotNullExpressionValue(rightPannel, "rightPannel");
        videoMoleculeVisibilityDelegateUtils2.show(rightPannel, animated);
        videoMoleculeVisibilityDelegateUtils2.show(playVideoWidgetBinding.moleculeView.getBottomContainer(), animated);
    }

    private final void showViews(int orientation, boolean animated, boolean shouldShowMuteBtn) {
        if (orientation == 1) {
            showPortrait(animated, shouldShowMuteBtn);
        } else {
            showLandscape(animated);
        }
    }

    public final void onOrientationChange(@NotNull PlayVideoWidgetViewState widgetViewState) {
        Intrinsics.checkNotNullParameter(widgetViewState, "widgetViewState");
        if (widgetViewState.getViewsIsVisible()) {
            showViews(widgetViewState.getOrientation(), false, widgetViewState.getMuteButtonModel().getHasAudio());
        } else {
            hideViews(false);
        }
    }

    public final void onVisibilityChanged(@NotNull PlayVideoWidgetActions.VisibilityChanged action, @NotNull PlayVideoWidgetViewState widgetViewState) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(widgetViewState, "widgetViewState");
        if (action.getIsVisible()) {
            showViews(widgetViewState.getOrientation(), action.getAnimated(), widgetViewState.getMuteButtonModel().getHasAudio());
        } else {
            hideViews(action.getAnimated());
        }
    }
}
