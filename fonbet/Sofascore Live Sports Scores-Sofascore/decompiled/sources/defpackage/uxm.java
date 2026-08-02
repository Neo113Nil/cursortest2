package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.mediarouter.app.MediaRouteButton;
import com.blaze.blazesdk.custom_views.BlazeDefaultTimeBar;
import com.blaze.blazesdk.custom_views.BlazeTextView;
import com.blaze.blazesdk.custom_views.BlazeTextWithIconButton;
import com.blaze.blazesdk.players.ui.BackToLiveButtonView;
import com.blaze.blazesdk.players.ui.StatusIndicatorView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uxm implements krk {
    public final ImageView A;
    public final BlazeTextView B;
    public final BlazeTextView C;
    public final ImageView D;
    public final ImageView E;
    public final ImageView F;
    public final ImageView G;
    public final ImageView H;
    public final StatusIndicatorView I;
    public final LinearLayout J;
    public final ConstraintLayout a;
    public final ConstraintLayout b;
    public final FrameLayout c;
    public final ImageView d;
    public final ImageView e;
    public final View f;
    public final BackToLiveButtonView g;
    public final LinearLayout h;
    public final MediaRouteButton i;
    public final BlazeTextView j;
    public final ImageView k;
    public final ImageView l;
    public final BlazeTextWithIconButton m;
    public final ImageView n;
    public final ImageView o;
    public final ImageView p;
    public final BlazeTextView q;
    public final ImageView r;
    public final ImageView s;
    public final ImageView t;
    public final ImageView u;
    public final BlazeTextView v;
    public final ProgressBar w;
    public final ImageView x;
    public final BlazeTextView y;
    public final BlazeDefaultTimeBar z;

    public uxm(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, View view, BackToLiveButtonView backToLiveButtonView, LinearLayout linearLayout, MediaRouteButton mediaRouteButton, BlazeTextView blazeTextView, ImageView imageView3, ImageView imageView4, BlazeTextWithIconButton blazeTextWithIconButton, ImageView imageView5, ImageView imageView6, ImageView imageView7, BlazeTextView blazeTextView2, ImageView imageView8, ImageView imageView9, ImageView imageView10, ImageView imageView11, BlazeTextView blazeTextView3, ProgressBar progressBar, ImageView imageView12, BlazeTextView blazeTextView4, BlazeDefaultTimeBar blazeDefaultTimeBar, ImageView imageView13, BlazeTextView blazeTextView5, BlazeTextView blazeTextView6, ImageView imageView14, ImageView imageView15, ImageView imageView16, ImageView imageView17, ImageView imageView18, StatusIndicatorView statusIndicatorView, LinearLayout linearLayout2) {
        this.a = constraintLayout;
        this.b = constraintLayout2;
        this.c = frameLayout;
        this.d = imageView;
        this.e = imageView2;
        this.f = view;
        this.g = backToLiveButtonView;
        this.h = linearLayout;
        this.i = mediaRouteButton;
        this.j = blazeTextView;
        this.k = imageView3;
        this.l = imageView4;
        this.m = blazeTextWithIconButton;
        this.n = imageView5;
        this.o = imageView6;
        this.p = imageView7;
        this.q = blazeTextView2;
        this.r = imageView8;
        this.s = imageView9;
        this.t = imageView10;
        this.u = imageView11;
        this.v = blazeTextView3;
        this.w = progressBar;
        this.x = imageView12;
        this.y = blazeTextView4;
        this.z = blazeDefaultTimeBar;
        this.A = imageView13;
        this.B = blazeTextView5;
        this.C = blazeTextView6;
        this.D = imageView14;
        this.E = imageView15;
        this.F = imageView16;
        this.G = imageView17;
        this.H = imageView18;
        this.I = statusIndicatorView;
        this.J = linearLayout2;
    }

    public static uxm a(View view) {
        int i = R.id.blaze_captionsContainer;
        ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.blaze_captionsContainer, view);
        if (constraintLayout != null) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
            i = R.id.blaze_player_container;
            FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.blaze_player_container, view);
            if (frameLayout != null) {
                i = R.id.blaze_preview_image;
                ImageView imageView = (ImageView) nq8.B(R.id.blaze_preview_image, view);
                if (imageView != null) {
                    i = R.id.blaze_videoCloseButton;
                    ImageView imageView2 = (ImageView) nq8.B(R.id.blaze_videoCloseButton, view);
                    if (imageView2 != null) {
                        i = R.id.blaze_videoShadowOverlay;
                        View B = nq8.B(R.id.blaze_videoShadowOverlay, view);
                        if (B != null) {
                            i = R.id.blaze_videosBackToLiveButton;
                            BackToLiveButtonView backToLiveButtonView = (BackToLiveButtonView) nq8.B(R.id.blaze_videosBackToLiveButton, view);
                            if (backToLiveButtonView != null) {
                                i = R.id.blaze_videosBottomIconsContainer;
                                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.blaze_videosBottomIconsContainer, view);
                                if (linearLayout != null) {
                                    i = R.id.blaze_videosCastButton;
                                    MediaRouteButton mediaRouteButton = (MediaRouteButton) nq8.B(R.id.blaze_videosCastButton, view);
                                    if (mediaRouteButton != null) {
                                        i = R.id.blaze_videosCastingText;
                                        BlazeTextView blazeTextView = (BlazeTextView) nq8.B(R.id.blaze_videosCastingText, view);
                                        if (blazeTextView != null) {
                                            i = R.id.blaze_videosCenterIconsContainer;
                                            if (((LinearLayout) nq8.B(R.id.blaze_videosCenterIconsContainer, view)) != null) {
                                                i = R.id.blaze_videosClosedCaptionsButton;
                                                ImageView imageView3 = (ImageView) nq8.B(R.id.blaze_videosClosedCaptionsButton, view);
                                                if (imageView3 != null) {
                                                    i = R.id.blaze_videosControllerReplayButton;
                                                    ImageView imageView4 = (ImageView) nq8.B(R.id.blaze_videosControllerReplayButton, view);
                                                    if (imageView4 != null) {
                                                        i = R.id.blaze_videosCta;
                                                        BlazeTextWithIconButton blazeTextWithIconButton = (BlazeTextWithIconButton) nq8.B(R.id.blaze_videosCta, view);
                                                        if (blazeTextWithIconButton != null) {
                                                            i = R.id.blaze_videosFastForwardIndicator;
                                                            ImageView imageView5 = (ImageView) nq8.B(R.id.blaze_videosFastForwardIndicator, view);
                                                            if (imageView5 != null) {
                                                                i = R.id.blaze_videosForceRotationButton;
                                                                ImageView imageView6 = (ImageView) nq8.B(R.id.blaze_videosForceRotationButton, view);
                                                                if (imageView6 != null) {
                                                                    i = R.id.blaze_videosFullAreaReplayButton;
                                                                    ImageView imageView7 = (ImageView) nq8.B(R.id.blaze_videosFullAreaReplayButton, view);
                                                                    if (imageView7 != null) {
                                                                        i = R.id.blaze_videosHeadingText;
                                                                        BlazeTextView blazeTextView2 = (BlazeTextView) nq8.B(R.id.blaze_videosHeadingText, view);
                                                                        if (blazeTextView2 != null) {
                                                                            i = R.id.blaze_videosLikeButton;
                                                                            ImageView imageView8 = (ImageView) nq8.B(R.id.blaze_videosLikeButton, view);
                                                                            if (imageView8 != null) {
                                                                                i = R.id.blaze_videosMaximizeButton;
                                                                                ImageView imageView9 = (ImageView) nq8.B(R.id.blaze_videosMaximizeButton, view);
                                                                                if (imageView9 != null) {
                                                                                    i = R.id.blaze_videosPipButton;
                                                                                    ImageView imageView10 = (ImageView) nq8.B(R.id.blaze_videosPipButton, view);
                                                                                    if (imageView10 != null) {
                                                                                        i = R.id.blaze_videosPlayPause;
                                                                                        ImageView imageView11 = (ImageView) nq8.B(R.id.blaze_videosPlayPause, view);
                                                                                        if (imageView11 != null) {
                                                                                            i = R.id.blaze_videosPlayPauseReplayContainer;
                                                                                            if (((FrameLayout) nq8.B(R.id.blaze_videosPlayPauseReplayContainer, view)) != null) {
                                                                                                i = R.id.blaze_videosProgressText;
                                                                                                BlazeTextView blazeTextView3 = (BlazeTextView) nq8.B(R.id.blaze_videosProgressText, view);
                                                                                                if (blazeTextView3 != null) {
                                                                                                    i = R.id.blaze_videosProgressbar;
                                                                                                    ProgressBar progressBar = (ProgressBar) nq8.B(R.id.blaze_videosProgressbar, view);
                                                                                                    if (progressBar != null) {
                                                                                                        i = R.id.blaze_videosSeekBackwardButton;
                                                                                                        ImageView imageView12 = (ImageView) nq8.B(R.id.blaze_videosSeekBackwardButton, view);
                                                                                                        if (imageView12 != null) {
                                                                                                            i = R.id.blaze_videosSeekBackwardIndicator;
                                                                                                            BlazeTextView blazeTextView4 = (BlazeTextView) nq8.B(R.id.blaze_videosSeekBackwardIndicator, view);
                                                                                                            if (blazeTextView4 != null) {
                                                                                                                i = R.id.blaze_videosSeekBar;
                                                                                                                BlazeDefaultTimeBar blazeDefaultTimeBar = (BlazeDefaultTimeBar) nq8.B(R.id.blaze_videosSeekBar, view);
                                                                                                                if (blazeDefaultTimeBar != null) {
                                                                                                                    i = R.id.blaze_videosSeekForwardButton;
                                                                                                                    ImageView imageView13 = (ImageView) nq8.B(R.id.blaze_videosSeekForwardButton, view);
                                                                                                                    if (imageView13 != null) {
                                                                                                                        i = R.id.blaze_videosSeekForwardIndicator;
                                                                                                                        BlazeTextView blazeTextView5 = (BlazeTextView) nq8.B(R.id.blaze_videosSeekForwardIndicator, view);
                                                                                                                        if (blazeTextView5 != null) {
                                                                                                                            i = R.id.blaze_videosSeekingTextView;
                                                                                                                            BlazeTextView blazeTextView6 = (BlazeTextView) nq8.B(R.id.blaze_videosSeekingTextView, view);
                                                                                                                            if (blazeTextView6 != null) {
                                                                                                                                i = R.id.blaze_videosSettingsButton;
                                                                                                                                ImageView imageView14 = (ImageView) nq8.B(R.id.blaze_videosSettingsButton, view);
                                                                                                                                if (imageView14 != null) {
                                                                                                                                    i = R.id.blaze_videosShareButton;
                                                                                                                                    ImageView imageView15 = (ImageView) nq8.B(R.id.blaze_videosShareButton, view);
                                                                                                                                    if (imageView15 != null) {
                                                                                                                                        i = R.id.blaze_videosSkipNextButton;
                                                                                                                                        ImageView imageView16 = (ImageView) nq8.B(R.id.blaze_videosSkipNextButton, view);
                                                                                                                                        if (imageView16 != null) {
                                                                                                                                            i = R.id.blaze_videosSkipPrevButton;
                                                                                                                                            ImageView imageView17 = (ImageView) nq8.B(R.id.blaze_videosSkipPrevButton, view);
                                                                                                                                            if (imageView17 != null) {
                                                                                                                                                i = R.id.blaze_videosSoundButton;
                                                                                                                                                ImageView imageView18 = (ImageView) nq8.B(R.id.blaze_videosSoundButton, view);
                                                                                                                                                if (imageView18 != null) {
                                                                                                                                                    i = R.id.blaze_videosStatusIndicator;
                                                                                                                                                    StatusIndicatorView statusIndicatorView = (StatusIndicatorView) nq8.B(R.id.blaze_videosStatusIndicator, view);
                                                                                                                                                    if (statusIndicatorView != null) {
                                                                                                                                                        i = R.id.blaze_videosTopIconsContainer;
                                                                                                                                                        LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.blaze_videosTopIconsContainer, view);
                                                                                                                                                        if (linearLayout2 != null) {
                                                                                                                                                            return new uxm(constraintLayout2, constraintLayout, frameLayout, imageView, imageView2, B, backToLiveButtonView, linearLayout, mediaRouteButton, blazeTextView, imageView3, imageView4, blazeTextWithIconButton, imageView5, imageView6, imageView7, blazeTextView2, imageView8, imageView9, imageView10, imageView11, blazeTextView3, progressBar, imageView12, blazeTextView4, blazeDefaultTimeBar, imageView13, blazeTextView5, blazeTextView6, imageView14, imageView15, imageView16, imageView17, imageView18, statusIndicatorView, linearLayout2);
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
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
