package ru.ozon.app.android.storefront.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefront.R$layout;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.SocialIconButtonView;
import ru.ozon.app.android.storefront.core.socialAtoms.rightPanel.RightPanelListView;
import ru.ozon.app.android.storefront.widgets.playvideo.presentation.mute.MuteButtonView;
import ru.ozon.app.android.videomolecule.presentation.view.VideoMoleculeView;

/* loaded from: classes2.dex */
public final class PlayVideoWidgetBinding implements a {

    @NonNull
    public final VideoMoleculeView moleculeView;

    @NonNull
    public final MuteButtonView muteButton;

    @NonNull
    public final SocialIconButtonView playVideoCloseButton;

    @NonNull
    public final Guideline rightPanelGuidline;

    @NonNull
    public final RightPanelListView rightPannel;

    @NonNull
    private final VideoMoleculeView rootView;

    private PlayVideoWidgetBinding(@NonNull VideoMoleculeView videoMoleculeView, @NonNull VideoMoleculeView videoMoleculeView2, @NonNull MuteButtonView muteButtonView, @NonNull SocialIconButtonView socialIconButtonView, @NonNull Guideline guideline, @NonNull RightPanelListView rightPanelListView) {
        this.rootView = videoMoleculeView;
        this.moleculeView = videoMoleculeView2;
        this.muteButton = muteButtonView;
        this.playVideoCloseButton = socialIconButtonView;
        this.rightPanelGuidline = guideline;
        this.rightPannel = rightPanelListView;
    }

    @NonNull
    public static PlayVideoWidgetBinding bind(@NonNull View view) {
        VideoMoleculeView videoMoleculeView = (VideoMoleculeView) view;
        int i11 = R$id.muteButton;
        MuteButtonView muteButtonView = (MuteButtonView) C2548q.d(i11, view);
        if (muteButtonView != null) {
            i11 = R$id.playVideoCloseButton;
            SocialIconButtonView socialIconButtonView = (SocialIconButtonView) C2548q.d(i11, view);
            if (socialIconButtonView != null) {
                i11 = R$id.rightPanelGuidline;
                Guideline guideline = (Guideline) C2548q.d(i11, view);
                if (guideline != null) {
                    i11 = R$id.rightPannel;
                    RightPanelListView rightPanelListView = (RightPanelListView) C2548q.d(i11, view);
                    if (rightPanelListView != null) {
                        return new PlayVideoWidgetBinding(videoMoleculeView, videoMoleculeView, muteButtonView, socialIconButtonView, guideline, rightPanelListView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static PlayVideoWidgetBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.play_video_widget, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public VideoMoleculeView getConstraintLayout() {
        return this.rootView;
    }
}
