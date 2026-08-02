package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Space;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.blaze.blazesdk.custom_views.BlazeDefaultTimeBar;
import com.blaze.blazesdk.custom_views.BlazeExpandableAndScrollableTextView;
import com.blaze.blazesdk.custom_views.BlazeShadingEdgeLayout;
import com.blaze.blazesdk.custom_views.BlazeTextView;
import com.blaze.blazesdk.custom_views.BlazeTextWithIconButton;
import com.blaze.blazesdk.features.shared.ui.BlazeLikesContainerView;
import com.blaze.blazesdk.follow.BlazeFollowEntityView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wgm implements krk {
    public final ProgressBar A;
    public final ImageView B;
    public final BlazeDefaultTimeBar C;
    public final ImageView D;
    public final ImageView E;
    public final FrameLayout F;
    public final ImageView G;
    public final ConstraintLayout a;
    public final ConstraintLayout b;
    public final Guideline c;
    public final Guideline d;
    public final Guideline e;
    public final Guideline f;
    public final ConstraintLayout g;
    public final ConstraintLayout h;
    public final Guideline i;
    public final Guideline j;
    public final Barrier k;
    public final View l;
    public final View m;
    public final Guideline n;
    public final Guideline o;
    public final BlazeExpandableAndScrollableTextView p;
    public final BlazeShadingEdgeLayout q;
    public final BlazeTextView r;
    public final ImageView s;
    public final BlazeTextWithIconButton t;
    public final ImageView u;
    public final BlazeFollowEntityView v;
    public final BlazeTextView w;
    public final LinearLayout x;
    public final BlazeLikesContainerView y;
    public final ImageView z;

    public wgm(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, Guideline guideline5, Guideline guideline6, Barrier barrier, View view, View view2, Guideline guideline7, Guideline guideline8, BlazeExpandableAndScrollableTextView blazeExpandableAndScrollableTextView, BlazeShadingEdgeLayout blazeShadingEdgeLayout, BlazeTextView blazeTextView, ImageView imageView, BlazeTextWithIconButton blazeTextWithIconButton, ImageView imageView2, BlazeFollowEntityView blazeFollowEntityView, BlazeTextView blazeTextView2, LinearLayout linearLayout, BlazeLikesContainerView blazeLikesContainerView, ImageView imageView3, ProgressBar progressBar, ImageView imageView4, BlazeDefaultTimeBar blazeDefaultTimeBar, ImageView imageView5, ImageView imageView6, FrameLayout frameLayout, ImageView imageView7) {
        this.a = constraintLayout;
        this.b = constraintLayout2;
        this.c = guideline;
        this.d = guideline2;
        this.e = guideline3;
        this.f = guideline4;
        this.g = constraintLayout3;
        this.h = constraintLayout4;
        this.i = guideline5;
        this.j = guideline6;
        this.k = barrier;
        this.l = view;
        this.m = view2;
        this.n = guideline7;
        this.o = guideline8;
        this.p = blazeExpandableAndScrollableTextView;
        this.q = blazeShadingEdgeLayout;
        this.r = blazeTextView;
        this.s = imageView;
        this.t = blazeTextWithIconButton;
        this.u = imageView2;
        this.v = blazeFollowEntityView;
        this.w = blazeTextView2;
        this.x = linearLayout;
        this.y = blazeLikesContainerView;
        this.z = imageView3;
        this.A = progressBar;
        this.B = imageView4;
        this.C = blazeDefaultTimeBar;
        this.D = imageView5;
        this.E = imageView6;
        this.F = frameLayout;
        this.G = imageView7;
    }

    public static wgm a(View view) {
        int i = R.id.blaze_captionsContainer;
        ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.blaze_captionsContainer, view);
        if (constraintLayout != null) {
            i = R.id.blaze_enrichment_horizontal_guideline_end;
            Guideline guideline = (Guideline) nq8.B(R.id.blaze_enrichment_horizontal_guideline_end, view);
            if (guideline != null) {
                i = R.id.blaze_enrichment_horizontal_guideline_start;
                Guideline guideline2 = (Guideline) nq8.B(R.id.blaze_enrichment_horizontal_guideline_start, view);
                if (guideline2 != null) {
                    i = R.id.blaze_enrichment_vertical_guideline_end;
                    Guideline guideline3 = (Guideline) nq8.B(R.id.blaze_enrichment_vertical_guideline_end, view);
                    if (guideline3 != null) {
                        i = R.id.blaze_enrichment_vertical_guideline_start;
                        Guideline guideline4 = (Guideline) nq8.B(R.id.blaze_enrichment_vertical_guideline_start, view);
                        if (guideline4 != null) {
                            i = R.id.blaze_extraSpaceBelowMomentHeaderBarrier;
                            if (((Space) nq8.B(R.id.blaze_extraSpaceBelowMomentHeaderBarrier, view)) != null) {
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                                i = R.id.blaze_heading_text_space_top_for_barrier;
                                if (((Space) nq8.B(R.id.blaze_heading_text_space_top_for_barrier, view)) != null) {
                                    i = R.id.blaze_icons_space_top_for_barrier;
                                    if (((Space) nq8.B(R.id.blaze_icons_space_top_for_barrier, view)) != null) {
                                        i = R.id.blaze_interactionContainer;
                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) nq8.B(R.id.blaze_interactionContainer, view);
                                        if (constraintLayout3 != null) {
                                            i = R.id.blaze_interaction_horizontal_guideline;
                                            Guideline guideline5 = (Guideline) nq8.B(R.id.blaze_interaction_horizontal_guideline, view);
                                            if (guideline5 != null) {
                                                i = R.id.blaze_interaction_vertical_guideline;
                                                Guideline guideline6 = (Guideline) nq8.B(R.id.blaze_interaction_vertical_guideline, view);
                                                if (guideline6 != null) {
                                                    i = R.id.blaze_momentFooterBarrier;
                                                    Barrier barrier = (Barrier) nq8.B(R.id.blaze_momentFooterBarrier, view);
                                                    if (barrier != null) {
                                                        i = R.id.blaze_momentFooterGradient;
                                                        View B = nq8.B(R.id.blaze_momentFooterGradient, view);
                                                        if (B != null) {
                                                            i = R.id.blaze_momentHeaderBarrier;
                                                            if (((Barrier) nq8.B(R.id.blaze_momentHeaderBarrier, view)) != null) {
                                                                i = R.id.blaze_momentHeaderGradient;
                                                                View B2 = nq8.B(R.id.blaze_momentHeaderGradient, view);
                                                                if (B2 != null) {
                                                                    i = R.id.blaze_momentHolderSafeAreaBottom;
                                                                    Guideline guideline7 = (Guideline) nq8.B(R.id.blaze_momentHolderSafeAreaBottom, view);
                                                                    if (guideline7 != null) {
                                                                        i = R.id.blaze_momentHolderSafeAreaTop;
                                                                        Guideline guideline8 = (Guideline) nq8.B(R.id.blaze_momentHolderSafeAreaTop, view);
                                                                        if (guideline8 != null) {
                                                                            i = R.id.blaze_momentsBodyTextView;
                                                                            BlazeExpandableAndScrollableTextView blazeExpandableAndScrollableTextView = (BlazeExpandableAndScrollableTextView) nq8.B(R.id.blaze_momentsBodyTextView, view);
                                                                            if (blazeExpandableAndScrollableTextView != null) {
                                                                                i = R.id.blaze_momentsBodyTextViewShadingContainer;
                                                                                BlazeShadingEdgeLayout blazeShadingEdgeLayout = (BlazeShadingEdgeLayout) nq8.B(R.id.blaze_momentsBodyTextViewShadingContainer, view);
                                                                                if (blazeShadingEdgeLayout != null) {
                                                                                    i = R.id.blaze_momentsCenterIconsContainer;
                                                                                    if (((LinearLayout) nq8.B(R.id.blaze_momentsCenterIconsContainer, view)) != null) {
                                                                                        i = R.id.blaze_momentsChip;
                                                                                        BlazeTextView blazeTextView = (BlazeTextView) nq8.B(R.id.blaze_momentsChip, view);
                                                                                        if (blazeTextView != null) {
                                                                                            i = R.id.blaze_momentsClosedCaptionsButton;
                                                                                            ImageView imageView = (ImageView) nq8.B(R.id.blaze_momentsClosedCaptionsButton, view);
                                                                                            if (imageView != null) {
                                                                                                i = R.id.blaze_momentsCta;
                                                                                                BlazeTextWithIconButton blazeTextWithIconButton = (BlazeTextWithIconButton) nq8.B(R.id.blaze_momentsCta, view);
                                                                                                if (blazeTextWithIconButton != null) {
                                                                                                    i = R.id.blaze_momentsFastForwardIndicator;
                                                                                                    ImageView imageView2 = (ImageView) nq8.B(R.id.blaze_momentsFastForwardIndicator, view);
                                                                                                    if (imageView2 != null) {
                                                                                                        i = R.id.blaze_momentsFollowEntityView;
                                                                                                        BlazeFollowEntityView blazeFollowEntityView = (BlazeFollowEntityView) nq8.B(R.id.blaze_momentsFollowEntityView, view);
                                                                                                        if (blazeFollowEntityView != null) {
                                                                                                            i = R.id.blaze_momentsHeadingTextView;
                                                                                                            BlazeTextView blazeTextView2 = (BlazeTextView) nq8.B(R.id.blaze_momentsHeadingTextView, view);
                                                                                                            if (blazeTextView2 != null) {
                                                                                                                i = R.id.blaze_momentsIconsContainer;
                                                                                                                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.blaze_momentsIconsContainer, view);
                                                                                                                if (linearLayout != null) {
                                                                                                                    i = R.id.blaze_momentsLikesContainerView;
                                                                                                                    BlazeLikesContainerView blazeLikesContainerView = (BlazeLikesContainerView) nq8.B(R.id.blaze_momentsLikesContainerView, view);
                                                                                                                    if (blazeLikesContainerView != null) {
                                                                                                                        i = R.id.blaze_momentsPlayPause;
                                                                                                                        ImageView imageView3 = (ImageView) nq8.B(R.id.blaze_momentsPlayPause, view);
                                                                                                                        if (imageView3 != null) {
                                                                                                                            i = R.id.blaze_momentsProgressbar;
                                                                                                                            ProgressBar progressBar = (ProgressBar) nq8.B(R.id.blaze_momentsProgressbar, view);
                                                                                                                            if (progressBar != null) {
                                                                                                                                i = R.id.blaze_momentsSeekBackwardButton;
                                                                                                                                ImageView imageView4 = (ImageView) nq8.B(R.id.blaze_momentsSeekBackwardButton, view);
                                                                                                                                if (imageView4 != null) {
                                                                                                                                    i = R.id.blaze_momentsSeekBar;
                                                                                                                                    BlazeDefaultTimeBar blazeDefaultTimeBar = (BlazeDefaultTimeBar) nq8.B(R.id.blaze_momentsSeekBar, view);
                                                                                                                                    if (blazeDefaultTimeBar != null) {
                                                                                                                                        i = R.id.blaze_momentsSeekForwardButton;
                                                                                                                                        ImageView imageView5 = (ImageView) nq8.B(R.id.blaze_momentsSeekForwardButton, view);
                                                                                                                                        if (imageView5 != null) {
                                                                                                                                            i = R.id.blaze_momentsShareButton;
                                                                                                                                            ImageView imageView6 = (ImageView) nq8.B(R.id.blaze_momentsShareButton, view);
                                                                                                                                            if (imageView6 != null) {
                                                                                                                                                i = R.id.blaze_player_container;
                                                                                                                                                FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.blaze_player_container, view);
                                                                                                                                                if (frameLayout != null) {
                                                                                                                                                    i = R.id.blaze_preview_image;
                                                                                                                                                    ImageView imageView7 = (ImageView) nq8.B(R.id.blaze_preview_image, view);
                                                                                                                                                    if (imageView7 != null) {
                                                                                                                                                        return new wgm(constraintLayout2, constraintLayout, guideline, guideline2, guideline3, guideline4, constraintLayout2, constraintLayout3, guideline5, guideline6, barrier, B, B2, guideline7, guideline8, blazeExpandableAndScrollableTextView, blazeShadingEdgeLayout, blazeTextView, imageView, blazeTextWithIconButton, imageView2, blazeFollowEntityView, blazeTextView2, linearLayout, blazeLikesContainerView, imageView3, progressBar, imageView4, blazeDefaultTimeBar, imageView5, imageView6, frameLayout, imageView7);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
