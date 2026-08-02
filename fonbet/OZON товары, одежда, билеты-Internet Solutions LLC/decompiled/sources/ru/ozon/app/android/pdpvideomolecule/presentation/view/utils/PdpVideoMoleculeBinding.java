package ru.ozon.app.android.pdpvideomolecule.presentation.view.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import androidx.media3.ui.LegacyPlayerControlView;
import androidx.media3.ui.PlayerView;
import gk0.q;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpvideomolecule.R$id;
import ru.ozon.app.android.pdpvideomolecule.R$layout;
import ru.ozon.app.android.pdpvideomolecule.R$string;
import ru.ozon.app.android.pdpvideomolecule.presentation.replay.VideoMoleculeReplayView;
import ru.ozon.app.android.pdpvideomolecule.presentation.switchingimage.SwitchingImageView;
import ru.ozon.app.android.pdpvideomolecule.presentation.view.RewindableView;
import ru.ozon.app.android.pdpvideomolecule.presentation.view.VideoMoleculeRewindView;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 (2\u00020\u0001:\u0001(BY\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/presentation/view/utils/PdpVideoMoleculeBinding;", "", "root", "Landroid/view/ViewGroup;", "touchArea", "Landroid/view/View;", "topGradient", "bottomGradient", "videoMoleculePlayer", "Landroidx/media3/ui/PlayerView;", "rewindContainer", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/RewindableView;", "replayContainer", "Lru/ozon/app/android/pdpvideomolecule/presentation/replay/VideoMoleculeReplayView;", "playerControlsView", "Landroidx/media3/ui/LegacyPlayerControlView;", "videoMoleculePlayPauseButton", "Lru/ozon/app/android/pdpvideomolecule/presentation/switchingimage/SwitchingImageView;", "videoMoleculePlayPauseButtonContainer", "Landroid/widget/FrameLayout;", "<init>", "(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroidx/media3/ui/PlayerView;Lru/ozon/app/android/pdpvideomolecule/presentation/view/RewindableView;Lru/ozon/app/android/pdpvideomolecule/presentation/replay/VideoMoleculeReplayView;Landroidx/media3/ui/LegacyPlayerControlView;Lru/ozon/app/android/pdpvideomolecule/presentation/switchingimage/SwitchingImageView;Landroid/widget/FrameLayout;)V", "getRoot", "()Landroid/view/ViewGroup;", "getTouchArea", "()Landroid/view/View;", "getTopGradient", "getBottomGradient", "getVideoMoleculePlayer", "()Landroidx/media3/ui/PlayerView;", "getRewindContainer", "()Lru/ozon/app/android/pdpvideomolecule/presentation/view/RewindableView;", "getReplayContainer", "()Lru/ozon/app/android/pdpvideomolecule/presentation/replay/VideoMoleculeReplayView;", "getPlayerControlsView", "()Landroidx/media3/ui/LegacyPlayerControlView;", "getVideoMoleculePlayPauseButton", "()Lru/ozon/app/android/pdpvideomolecule/presentation/switchingimage/SwitchingImageView;", "getVideoMoleculePlayPauseButtonContainer", "()Landroid/widget/FrameLayout;", "Companion", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PdpVideoMoleculeBinding {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final View bottomGradient;

    @NotNull
    private final LegacyPlayerControlView playerControlsView;

    @NotNull
    private final VideoMoleculeReplayView replayContainer;

    @NotNull
    private final RewindableView rewindContainer;

    @NotNull
    private final ViewGroup root;

    @NotNull
    private final View topGradient;

    @NotNull
    private final View touchArea;

    @NotNull
    private final SwitchingImageView videoMoleculePlayPauseButton;

    @NotNull
    private final FrameLayout videoMoleculePlayPauseButtonContainer;

    @NotNull
    private final PlayerView videoMoleculePlayer;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"J\u0018\u0010#\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u001c\u0010%\u001a\u00020&*\u00020\u001d2\u0006\u0010'\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0014\u0010(\u001a\u00020&*\u00020\u001d2\u0006\u0010'\u001a\u00020$H\u0002R\u0014\u0010\u0004\u001a\u00020\u00058CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00058CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00058CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u00058CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0007¨\u0006)"}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/presentation/view/utils/PdpVideoMoleculeBinding$Companion;", "", "<init>", "()V", "touchAreaId", "", "getTouchAreaId", "()I", "topGradientId", "getTopGradientId", "bottomGradientId", "getBottomGradientId", "videoMoleculePlayerId", "getVideoMoleculePlayerId", "rewindContainerId", "getRewindContainerId", "replayContainerId", "getReplayContainerId", "playerControlsViewId", "getPlayerControlsViewId", "videoMoleculePlayPauseButtonId", "getVideoMoleculePlayPauseButtonId", "videoMoleculePlayPauseButtonContainerId", "getVideoMoleculePlayPauseButtonContainerId", "inflate", "Lru/ozon/app/android/pdpvideomolecule/presentation/view/utils/PdpVideoMoleculeBinding;", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "isCompactControls", "", "bind", "root", "Landroid/view/View;", "generateLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "addPlayerView", "", "params", "addRewindView", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void addPlayerView(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams, boolean z11) {
            int i11 = R$layout.view_video_molecule_player;
            View h11 = q.f64554a.h(i11);
            PlayerView playerView = h11 instanceof PlayerView ? (PlayerView) h11 : null;
            if (playerView == null) {
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i11, viewGroup, false);
                Intrinsics.g(inflate, "null cannot be cast to non-null type androidx.media3.ui.PlayerView");
                playerView = (PlayerView) inflate;
            }
            viewGroup.addView(playerView, 0, layoutParams);
            playerView.setLayoutParams(generateLayoutParams(viewGroup, z11));
        }

        private final void addRewindView(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            VideoMoleculeRewindView videoMoleculeRewindView = new VideoMoleculeRewindView(context, null, 0, 0, 14, null);
            videoMoleculeRewindView.setId(PdpVideoMoleculeBinding.INSTANCE.getRewindContainerId());
            videoMoleculeRewindView.setVisibility(8);
            videoMoleculeRewindView.setTag(Integer.valueOf(R$string.pdp_video_molecule_view_tag));
            videoMoleculeRewindView.setLayoutParams(layoutParams);
            viewGroup.addView(videoMoleculeRewindView);
        }

        private final ViewGroup.LayoutParams generateLayoutParams(ViewGroup parent, boolean isCompactControls) {
            if (!(parent instanceof ConstraintLayout)) {
                return parent instanceof RelativeLayout ? new RelativeLayout.LayoutParams(-1, -1) : new ViewGroup.LayoutParams(-1, -1);
            }
            ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
            bVar.f41636i = 0;
            if (isCompactControls) {
                bVar.f41642l = PdpVideoMoleculeBinding.INSTANCE.getReplayContainerId();
            } else {
                bVar.f41640k = PdpVideoMoleculeBinding.INSTANCE.getPlayerControlsViewId();
            }
            bVar.f41656t = 0;
            bVar.f41658v = 0;
            return bVar;
        }

        private final int getBottomGradientId() {
            return R$id.bottomGradient;
        }

        private final int getPlayerControlsViewId() {
            return R$id.playerControlsView;
        }

        private final int getReplayContainerId() {
            return R$id.replayContainer;
        }

        private final int getRewindContainerId() {
            return R$id.rewindContainer;
        }

        private final int getTopGradientId() {
            return R$id.topGradient;
        }

        private final int getTouchAreaId() {
            return R$id.touchArea;
        }

        private final int getVideoMoleculePlayPauseButtonContainerId() {
            return R$id.videoMoleculePlayPauseButtonContainer;
        }

        private final int getVideoMoleculePlayPauseButtonId() {
            return R$id.videoMoleculePlayPauseButton;
        }

        private final int getVideoMoleculePlayerId() {
            return R$id.videoMoleculePlayer;
        }

        public static /* synthetic */ PdpVideoMoleculeBinding inflate$default(Companion companion, LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            return companion.inflate(layoutInflater, viewGroup, z11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final PdpVideoMoleculeBinding bind(@NotNull View root) {
            View view;
            View view2;
            PlayerView playerView;
            RewindableView rewindableView;
            VideoMoleculeReplayView videoMoleculeReplayView;
            LegacyPlayerControlView legacyPlayerControlView;
            SwitchingImageView switchingImageView;
            FrameLayout frameLayout;
            Intrinsics.checkNotNullParameter(root, "root");
            View view3 = null;
            ViewGroup viewGroup = root instanceof ViewGroup ? (ViewGroup) root : null;
            if (viewGroup != null) {
                Iterator<View> it = C5316f0.b(viewGroup).iterator();
                view = null;
                view2 = null;
                playerView = null;
                rewindableView = null;
                videoMoleculeReplayView = null;
                legacyPlayerControlView = null;
                switchingImageView = null;
                frameLayout = null;
                while (true) {
                    C5314e0 c5314e0 = (C5314e0) it;
                    if (!c5314e0.hasNext()) {
                        break;
                    }
                    View view4 = (View) c5314e0.next();
                    int id2 = view4.getId();
                    Companion companion = PdpVideoMoleculeBinding.INSTANCE;
                    if (id2 == companion.getTouchAreaId()) {
                        view3 = view4;
                    } else if (id2 == companion.getTopGradientId()) {
                        view = view4;
                    } else if (id2 == companion.getBottomGradientId()) {
                        view2 = view4;
                    } else if (id2 == companion.getVideoMoleculePlayerId()) {
                        playerView = (PlayerView) view4;
                    } else if (id2 == companion.getRewindContainerId()) {
                        rewindableView = (RewindableView) view4;
                    } else if (id2 == companion.getReplayContainerId()) {
                        videoMoleculeReplayView = (VideoMoleculeReplayView) view4;
                    } else if (id2 == companion.getPlayerControlsViewId()) {
                        legacyPlayerControlView = (LegacyPlayerControlView) view4;
                    } else if (id2 == companion.getVideoMoleculePlayPauseButtonId()) {
                        switchingImageView = (SwitchingImageView) view4;
                    } else if (id2 == companion.getVideoMoleculePlayPauseButtonContainerId()) {
                        frameLayout = (FrameLayout) view4;
                    }
                }
            } else {
                view = null;
                view2 = null;
                playerView = null;
                rewindableView = null;
                videoMoleculeReplayView = null;
                legacyPlayerControlView = null;
                switchingImageView = null;
                frameLayout = null;
            }
            ViewGroup viewGroup2 = (ViewGroup) root;
            if (view3 == null) {
                view3 = root.findViewById(getTouchAreaId());
                Intrinsics.checkNotNullExpressionValue(view3, "findViewById(...)");
            }
            View view5 = view3;
            if (view == null) {
                view = root.findViewById(getTopGradientId());
                Intrinsics.checkNotNullExpressionValue(view, "findViewById(...)");
            }
            View view6 = view;
            if (view2 == null) {
                view2 = root.findViewById(getBottomGradientId());
                Intrinsics.checkNotNullExpressionValue(view2, "findViewById(...)");
            }
            View view7 = view2;
            if (playerView == null) {
                View findViewById = root.findViewById(getVideoMoleculePlayerId());
                Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                playerView = (PlayerView) findViewById;
            }
            PlayerView playerView2 = playerView;
            if (rewindableView == null) {
                rewindableView = (RewindableView) root.findViewById(getRewindContainerId());
            }
            RewindableView rewindableView2 = rewindableView;
            if (videoMoleculeReplayView == null) {
                View findViewById2 = root.findViewById(getReplayContainerId());
                Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
                videoMoleculeReplayView = (VideoMoleculeReplayView) findViewById2;
            }
            VideoMoleculeReplayView videoMoleculeReplayView2 = videoMoleculeReplayView;
            if (legacyPlayerControlView == null) {
                View findViewById3 = root.findViewById(getPlayerControlsViewId());
                Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
                legacyPlayerControlView = (LegacyPlayerControlView) findViewById3;
            }
            LegacyPlayerControlView legacyPlayerControlView2 = legacyPlayerControlView;
            if (switchingImageView == null) {
                View findViewById4 = root.findViewById(getVideoMoleculePlayPauseButtonId());
                Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
                switchingImageView = (SwitchingImageView) findViewById4;
            }
            SwitchingImageView switchingImageView2 = switchingImageView;
            if (frameLayout == null) {
                View findViewById5 = root.findViewById(getVideoMoleculePlayPauseButtonContainerId());
                Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
                frameLayout = (FrameLayout) findViewById5;
            }
            return new PdpVideoMoleculeBinding(viewGroup2, view5, view6, view7, playerView2, rewindableView2, videoMoleculeReplayView2, legacyPlayerControlView2, switchingImageView2, frameLayout, null);
        }

        @NotNull
        public final PdpVideoMoleculeBinding inflate(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent, boolean isCompactControls) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            Intrinsics.checkNotNullParameter(parent, "parent");
            View inflate = inflater.inflate(parent instanceof RelativeLayout ? R$layout.pdp_video_molecule_lite : isCompactControls ? R$layout.pdp_video_molecule_compact_controls : R$layout.pdp_video_molecule, parent);
            Intrinsics.g(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) inflate;
            Companion companion = PdpVideoMoleculeBinding.INSTANCE;
            ViewGroup.LayoutParams generateLayoutParams = companion.generateLayoutParams(viewGroup, isCompactControls);
            companion.addPlayerView(viewGroup, generateLayoutParams, isCompactControls);
            companion.addRewindView(viewGroup, generateLayoutParams);
            return companion.bind(viewGroup);
        }

        private Companion() {
        }
    }

    public /* synthetic */ PdpVideoMoleculeBinding(ViewGroup viewGroup, View view, View view2, View view3, PlayerView playerView, RewindableView rewindableView, VideoMoleculeReplayView videoMoleculeReplayView, LegacyPlayerControlView legacyPlayerControlView, SwitchingImageView switchingImageView, FrameLayout frameLayout, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, view, view2, view3, playerView, rewindableView, videoMoleculeReplayView, legacyPlayerControlView, switchingImageView, frameLayout);
    }

    @NotNull
    public final View getBottomGradient() {
        return this.bottomGradient;
    }

    @NotNull
    public final LegacyPlayerControlView getPlayerControlsView() {
        return this.playerControlsView;
    }

    @NotNull
    public final VideoMoleculeReplayView getReplayContainer() {
        return this.replayContainer;
    }

    @NotNull
    public final RewindableView getRewindContainer() {
        return this.rewindContainer;
    }

    @NotNull
    public final ViewGroup getRoot() {
        return this.root;
    }

    @NotNull
    public final View getTopGradient() {
        return this.topGradient;
    }

    @NotNull
    public final View getTouchArea() {
        return this.touchArea;
    }

    @NotNull
    public final SwitchingImageView getVideoMoleculePlayPauseButton() {
        return this.videoMoleculePlayPauseButton;
    }

    @NotNull
    public final FrameLayout getVideoMoleculePlayPauseButtonContainer() {
        return this.videoMoleculePlayPauseButtonContainer;
    }

    @NotNull
    public final PlayerView getVideoMoleculePlayer() {
        return this.videoMoleculePlayer;
    }

    private PdpVideoMoleculeBinding(ViewGroup viewGroup, View view, View view2, View view3, PlayerView playerView, RewindableView rewindableView, VideoMoleculeReplayView videoMoleculeReplayView, LegacyPlayerControlView legacyPlayerControlView, SwitchingImageView switchingImageView, FrameLayout frameLayout) {
        this.root = viewGroup;
        this.touchArea = view;
        this.topGradient = view2;
        this.bottomGradient = view3;
        this.videoMoleculePlayer = playerView;
        this.rewindContainer = rewindableView;
        this.replayContainer = videoMoleculeReplayView;
        this.playerControlsView = legacyPlayerControlView;
        this.videoMoleculePlayPauseButton = switchingImageView;
        this.videoMoleculePlayPauseButtonContainer = frameLayout;
    }
}
