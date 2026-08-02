package ru.ozon.app.android.storefront.ui.videomolecule.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.media3.ui.LegacyPlayerControlView;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.storefront.ui.videomolecule.R$id;
import ru.ozon.app.android.storefront.ui.videomolecule.R$layout;
import ru.ozon.app.android.storefrontcommonwidgets.core.views.SwitchingImageView;
import ru.ozon.app.android.videomolecule.presentation.replay.VideoMoleculeReplayView;
import ru.ozon.app.android.videomolecule.presentation.view.VideoMoleculeRewindView;

/* loaded from: classes2.dex */
public final class VideoMoleculeBinding implements a {

    @NonNull
    public final View bottomGradient;

    @NonNull
    public final LegacyPlayerControlView playerControlsView;

    @NonNull
    public final VideoMoleculeReplayView replayContainer;

    @NonNull
    public final VideoMoleculeRewindView rewindContainer;

    @NonNull
    private final View rootView;

    @NonNull
    public final View topGradient;

    @NonNull
    public final View touchArea;

    @NonNull
    public final RecyclerView videoMoleculeBottomContainer;

    @NonNull
    public final SwitchingImageView videoMoleculePlayPauseButton;

    @NonNull
    public final FrameLayout videoMoleculePlayPauseButtonContainer;

    @NonNull
    public final PlayerView videoMoleculePlayer;

    private VideoMoleculeBinding(@NonNull View view, @NonNull View view2, @NonNull LegacyPlayerControlView legacyPlayerControlView, @NonNull VideoMoleculeReplayView videoMoleculeReplayView, @NonNull VideoMoleculeRewindView videoMoleculeRewindView, @NonNull View view3, @NonNull View view4, @NonNull RecyclerView recyclerView, @NonNull SwitchingImageView switchingImageView, @NonNull FrameLayout frameLayout, @NonNull PlayerView playerView) {
        this.rootView = view;
        this.bottomGradient = view2;
        this.playerControlsView = legacyPlayerControlView;
        this.replayContainer = videoMoleculeReplayView;
        this.rewindContainer = videoMoleculeRewindView;
        this.topGradient = view3;
        this.touchArea = view4;
        this.videoMoleculeBottomContainer = recyclerView;
        this.videoMoleculePlayPauseButton = switchingImageView;
        this.videoMoleculePlayPauseButtonContainer = frameLayout;
        this.videoMoleculePlayer = playerView;
    }

    @NonNull
    public static VideoMoleculeBinding bind(@NonNull View view) {
        View d11;
        View d12;
        int i11 = R$id.bottomGradient;
        View d13 = C2548q.d(i11, view);
        if (d13 != null) {
            i11 = R$id.playerControlsView;
            LegacyPlayerControlView legacyPlayerControlView = (LegacyPlayerControlView) C2548q.d(i11, view);
            if (legacyPlayerControlView != null) {
                i11 = R$id.replayContainer;
                VideoMoleculeReplayView videoMoleculeReplayView = (VideoMoleculeReplayView) C2548q.d(i11, view);
                if (videoMoleculeReplayView != null) {
                    i11 = R$id.rewindContainer;
                    VideoMoleculeRewindView videoMoleculeRewindView = (VideoMoleculeRewindView) C2548q.d(i11, view);
                    if (videoMoleculeRewindView != null && (d11 = C2548q.d((i11 = R$id.topGradient), view)) != null && (d12 = C2548q.d((i11 = R$id.touchArea), view)) != null) {
                        i11 = R$id.videoMoleculeBottomContainer;
                        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                        if (recyclerView != null) {
                            i11 = R$id.videoMoleculePlayPauseButton;
                            SwitchingImageView switchingImageView = (SwitchingImageView) C2548q.d(i11, view);
                            if (switchingImageView != null) {
                                i11 = R$id.videoMoleculePlayPauseButtonContainer;
                                FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                                if (frameLayout != null) {
                                    i11 = R$id.videoMoleculePlayer;
                                    PlayerView playerView = (PlayerView) C2548q.d(i11, view);
                                    if (playerView != null) {
                                        return new VideoMoleculeBinding(view, d13, legacyPlayerControlView, videoMoleculeReplayView, videoMoleculeRewindView, d11, d12, recyclerView, switchingImageView, frameLayout, playerView);
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
    public static VideoMoleculeBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.video_molecule, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
