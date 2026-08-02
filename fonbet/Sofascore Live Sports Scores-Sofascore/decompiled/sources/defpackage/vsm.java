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
import com.blaze.blazesdk.custom_views.BlazeTextView;
import com.blaze.blazesdk.custom_views.BlazeTextWithIconButton;
import com.blaze.blazesdk.features.stories.players.ui.progressbar.StoriesPlayerProgressBar;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vsm implements krk {
    public final BlazeTextView A;
    public final LinearLayout B;
    public final ConstraintLayout a;
    public final FrameLayout b;
    public final ImageView c;
    public final ImageView d;
    public final ConstraintLayout e;
    public final Guideline f;
    public final Guideline g;
    public final Guideline h;
    public final Guideline i;
    public final ConstraintLayout j;
    public final Guideline k;
    public final Guideline l;
    public final FrameLayout m;
    public final ImageView n;
    public final ProgressBar o;
    public final ImageView p;
    public final ImageView q;
    public final BlazeTextWithIconButton r;
    public final ImageView s;
    public final ConstraintLayout t;
    public final View u;
    public final BlazeTextView v;
    public final StoriesPlayerProgressBar w;
    public final ImageView x;
    public final View y;
    public final ImageView z;

    public vsm(ConstraintLayout constraintLayout, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, ConstraintLayout constraintLayout3, Guideline guideline5, Guideline guideline6, FrameLayout frameLayout2, ImageView imageView3, ProgressBar progressBar, ImageView imageView4, ImageView imageView5, BlazeTextWithIconButton blazeTextWithIconButton, ImageView imageView6, ConstraintLayout constraintLayout4, View view, BlazeTextView blazeTextView, StoriesPlayerProgressBar storiesPlayerProgressBar, ImageView imageView7, View view2, ImageView imageView8, BlazeTextView blazeTextView2, LinearLayout linearLayout) {
        this.a = constraintLayout;
        this.b = frameLayout;
        this.c = imageView;
        this.d = imageView2;
        this.e = constraintLayout2;
        this.f = guideline;
        this.g = guideline2;
        this.h = guideline3;
        this.i = guideline4;
        this.j = constraintLayout3;
        this.k = guideline5;
        this.l = guideline6;
        this.m = frameLayout2;
        this.n = imageView3;
        this.o = progressBar;
        this.p = imageView4;
        this.q = imageView5;
        this.r = blazeTextWithIconButton;
        this.s = imageView6;
        this.t = constraintLayout4;
        this.u = view;
        this.v = blazeTextView;
        this.w = storiesPlayerProgressBar;
        this.x = imageView7;
        this.y = view2;
        this.z = imageView8;
        this.A = blazeTextView2;
        this.B = linearLayout;
    }

    public static vsm a(View view) {
        int i = R.id.ad_banner_view_container;
        FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.ad_banner_view_container, view);
        if (frameLayout != null) {
            i = R.id.blaze_accessibility_next_page_btn;
            ImageView imageView = (ImageView) nq8.B(R.id.blaze_accessibility_next_page_btn, view);
            if (imageView != null) {
                i = R.id.blaze_accessibility_prev_page_btn;
                ImageView imageView2 = (ImageView) nq8.B(R.id.blaze_accessibility_prev_page_btn, view);
                if (imageView2 != null) {
                    i = R.id.blaze_captionsContainer;
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
                                        i = R.id.blaze_extraSpaceBelowStoryHeaderBarrier;
                                        if (((Space) nq8.B(R.id.blaze_extraSpaceBelowStoryHeaderBarrier, view)) != null) {
                                            i = R.id.blaze_interactionContainer;
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) nq8.B(R.id.blaze_interactionContainer, view);
                                            if (constraintLayout2 != null) {
                                                i = R.id.blaze_interaction_horizontal_guideline;
                                                Guideline guideline5 = (Guideline) nq8.B(R.id.blaze_interaction_horizontal_guideline, view);
                                                if (guideline5 != null) {
                                                    i = R.id.blaze_interaction_vertical_guideline;
                                                    Guideline guideline6 = (Guideline) nq8.B(R.id.blaze_interaction_vertical_guideline, view);
                                                    if (guideline6 != null) {
                                                        i = R.id.blaze_OverlayCover;
                                                        if (nq8.B(R.id.blaze_OverlayCover, view) != null) {
                                                            i = R.id.blaze_playerContainer;
                                                            FrameLayout frameLayout2 = (FrameLayout) nq8.B(R.id.blaze_playerContainer, view);
                                                            if (frameLayout2 != null) {
                                                                i = R.id.blaze_previewImage;
                                                                ImageView imageView3 = (ImageView) nq8.B(R.id.blaze_previewImage, view);
                                                                if (imageView3 != null) {
                                                                    i = R.id.blaze_storiesProgressbar;
                                                                    ProgressBar progressBar = (ProgressBar) nq8.B(R.id.blaze_storiesProgressbar, view);
                                                                    if (progressBar != null) {
                                                                        i = R.id.blaze_storyClose;
                                                                        ImageView imageView4 = (ImageView) nq8.B(R.id.blaze_storyClose, view);
                                                                        if (imageView4 != null) {
                                                                            i = R.id.blaze_storyClosedCaptionsButton;
                                                                            ImageView imageView5 = (ImageView) nq8.B(R.id.blaze_storyClosedCaptionsButton, view);
                                                                            if (imageView5 != null) {
                                                                                i = R.id.blaze_storyCta;
                                                                                BlazeTextWithIconButton blazeTextWithIconButton = (BlazeTextWithIconButton) nq8.B(R.id.blaze_storyCta, view);
                                                                                if (blazeTextWithIconButton != null) {
                                                                                    i = R.id.blaze_storyCtaUpIcon;
                                                                                    ImageView imageView6 = (ImageView) nq8.B(R.id.blaze_storyCtaUpIcon, view);
                                                                                    if (imageView6 != null) {
                                                                                        i = R.id.blaze_storyHeader;
                                                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) nq8.B(R.id.blaze_storyHeader, view);
                                                                                        if (constraintLayout3 != null) {
                                                                                            i = R.id.blaze_storyHeaderBarrier;
                                                                                            if (((Barrier) nq8.B(R.id.blaze_storyHeaderBarrier, view)) != null) {
                                                                                                i = R.id.blaze_storyHeaderGradient;
                                                                                                View B = nq8.B(R.id.blaze_storyHeaderGradient, view);
                                                                                                if (B != null) {
                                                                                                    ConstraintLayout constraintLayout4 = (ConstraintLayout) view;
                                                                                                    i = R.id.blaze_storyLiveChip;
                                                                                                    BlazeTextView blazeTextView = (BlazeTextView) nq8.B(R.id.blaze_storyLiveChip, view);
                                                                                                    if (blazeTextView != null) {
                                                                                                        i = R.id.blaze_storyMultipleProgress;
                                                                                                        StoriesPlayerProgressBar storiesPlayerProgressBar = (StoriesPlayerProgressBar) nq8.B(R.id.blaze_storyMultipleProgress, view);
                                                                                                        if (storiesPlayerProgressBar != null) {
                                                                                                            i = R.id.blaze_storyMute;
                                                                                                            ImageView imageView7 = (ImageView) nq8.B(R.id.blaze_storyMute, view);
                                                                                                            if (imageView7 != null) {
                                                                                                                i = R.id.blaze_storyPrevNextArea;
                                                                                                                View B2 = nq8.B(R.id.blaze_storyPrevNextArea, view);
                                                                                                                if (B2 != null) {
                                                                                                                    i = R.id.blaze_storyShare;
                                                                                                                    ImageView imageView8 = (ImageView) nq8.B(R.id.blaze_storyShare, view);
                                                                                                                    if (imageView8 != null) {
                                                                                                                        i = R.id.blaze_storyThumbnail;
                                                                                                                        if (((ImageView) nq8.B(R.id.blaze_storyThumbnail, view)) != null) {
                                                                                                                            i = R.id.blaze_storyTitle;
                                                                                                                            BlazeTextView blazeTextView2 = (BlazeTextView) nq8.B(R.id.blaze_storyTitle, view);
                                                                                                                            if (blazeTextView2 != null) {
                                                                                                                                i = R.id.blaze_storyTitleAndChipContainer;
                                                                                                                                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.blaze_storyTitleAndChipContainer, view);
                                                                                                                                if (linearLayout != null) {
                                                                                                                                    return new vsm(constraintLayout4, frameLayout, imageView, imageView2, constraintLayout, guideline, guideline2, guideline3, guideline4, constraintLayout2, guideline5, guideline6, frameLayout2, imageView3, progressBar, imageView4, imageView5, blazeTextWithIconButton, imageView6, constraintLayout3, B, blazeTextView, storiesPlayerProgressBar, imageView7, B2, imageView8, blazeTextView2, linearLayout);
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
