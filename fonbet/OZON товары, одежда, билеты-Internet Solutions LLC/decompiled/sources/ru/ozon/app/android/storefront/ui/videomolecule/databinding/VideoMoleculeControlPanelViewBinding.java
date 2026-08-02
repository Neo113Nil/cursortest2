package ru.ozon.app.android.storefront.ui.videomolecule.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageButton;
import ru.ozon.app.android.R;
import ru.ozon.app.android.storefront.ui.videomolecule.R$id;
import ru.ozon.app.android.storefront.ui.videomolecule.R$layout;
import ru.ozon.app.android.storefrontcommonwidgets.core.views.SwitchingImageView;
import ru.ozon.app.android.videomolecule.presentation.view.controlpanel.VideoMoleculeTimeBar;

/* loaded from: classes2.dex */
public final class VideoMoleculeControlPanelViewBinding implements a {

    @NonNull
    public final TextView delimiter;

    @NonNull
    public final TextView exoDuration;

    @NonNull
    public final AppCompatImageButton exoPause;

    @NonNull
    public final AppCompatImageButton exoPlay;

    @NonNull
    public final TextView exoPosition;

    @NonNull
    public final VideoMoleculeTimeBar exoProgress;

    @NonNull
    public final SwitchingImageView modeButton;

    @NonNull
    public final FrameLayout pausePlayContainer;

    @NonNull
    private final View rootView;

    @NonNull
    public final LinearLayout timeGroup;

    private VideoMoleculeControlPanelViewBinding(@NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull AppCompatImageButton appCompatImageButton, @NonNull AppCompatImageButton appCompatImageButton2, @NonNull TextView textView3, @NonNull VideoMoleculeTimeBar videoMoleculeTimeBar, @NonNull SwitchingImageView switchingImageView, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout) {
        this.rootView = view;
        this.delimiter = textView;
        this.exoDuration = textView2;
        this.exoPause = appCompatImageButton;
        this.exoPlay = appCompatImageButton2;
        this.exoPosition = textView3;
        this.exoProgress = videoMoleculeTimeBar;
        this.modeButton = switchingImageView;
        this.pausePlayContainer = frameLayout;
        this.timeGroup = linearLayout;
    }

    @NonNull
    public static VideoMoleculeControlPanelViewBinding bind(@NonNull View view) {
        int i11 = R$id.delimiter;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R.id.exo_duration;
            TextView textView2 = (TextView) C2548q.d(R.id.exo_duration, view);
            if (textView2 != null) {
                i11 = R.id.exo_pause;
                AppCompatImageButton appCompatImageButton = (AppCompatImageButton) C2548q.d(R.id.exo_pause, view);
                if (appCompatImageButton != null) {
                    i11 = R.id.exo_play;
                    AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) C2548q.d(R.id.exo_play, view);
                    if (appCompatImageButton2 != null) {
                        i11 = R.id.exo_position;
                        TextView textView3 = (TextView) C2548q.d(R.id.exo_position, view);
                        if (textView3 != null) {
                            i11 = R.id.exo_progress;
                            VideoMoleculeTimeBar videoMoleculeTimeBar = (VideoMoleculeTimeBar) C2548q.d(R.id.exo_progress, view);
                            if (videoMoleculeTimeBar != null) {
                                i11 = R$id.modeButton;
                                SwitchingImageView switchingImageView = (SwitchingImageView) C2548q.d(i11, view);
                                if (switchingImageView != null) {
                                    i11 = R$id.pausePlayContainer;
                                    FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                                    if (frameLayout != null) {
                                        i11 = R$id.timeGroup;
                                        LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                                        if (linearLayout != null) {
                                            return new VideoMoleculeControlPanelViewBinding(view, textView, textView2, appCompatImageButton, appCompatImageButton2, textView3, videoMoleculeTimeBar, switchingImageView, frameLayout, linearLayout);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static VideoMoleculeControlPanelViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.video_molecule_control_panel_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
