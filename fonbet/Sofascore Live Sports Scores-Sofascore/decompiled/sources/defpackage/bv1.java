package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.customui.views.YouTubePlayerSeekBar;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.results.R;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.view.BellButton;
import com.sofascore.results.view.MmaRoundInfoView;
import com.sofascore.results.view.SofascoreSmallRatingView;
import com.sofascore.results.view.header.CollapsibleProfileHeaderView;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bv1 implements krk {
    public final /* synthetic */ int a;
    public final ViewGroup b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;

    public bv1(ConstraintLayout constraintLayout, jlc jlcVar, ImageView imageView, ImageView imageView2, View view, View view2, ImageView imageView3, ImageView imageView4, ImageView imageView5, TextView textView, ImageView imageView6, TextView textView2, TextView textView3, ez0 ez0Var, FrameLayout frameLayout, MmaRoundInfoView mmaRoundInfoView, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, lsc lscVar, lsc lscVar2) {
        this.a = 16;
        this.b = constraintLayout;
        this.i = view;
        this.g = view2;
        this.e = imageView3;
        this.f = imageView6;
        this.h = ez0Var;
        this.j = frameLayout;
        this.c = textView5;
        this.d = textView7;
    }

    public static bv1 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.stage_sport_driver_list_race, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        int i = R.id.stage_sport_bottom_trophy;
        ImageView imageView = (ImageView) nq8.B(R.id.stage_sport_bottom_trophy, inflate);
        if (imageView != null) {
            i = R.id.stage_sport_category_text;
            TextView textView = (TextView) nq8.B(R.id.stage_sport_category_text, inflate);
            if (textView != null) {
                i = R.id.stage_sport_date_text;
                TextView textView2 = (TextView) nq8.B(R.id.stage_sport_date_text, inflate);
                if (textView2 != null) {
                    i = R.id.stage_sport_main_logo;
                    ImageView imageView2 = (ImageView) nq8.B(R.id.stage_sport_main_logo, inflate);
                    if (imageView2 != null) {
                        i = R.id.stage_sport_main_text;
                        TextView textView3 = (TextView) nq8.B(R.id.stage_sport_main_text, inflate);
                        if (textView3 != null) {
                            i = R.id.stage_sport_top_trophy;
                            ImageView imageView3 = (ImageView) nq8.B(R.id.stage_sport_top_trophy, inflate);
                            if (imageView3 != null) {
                                i = R.id.stage_sport_winner_text;
                                TextView textView4 = (TextView) nq8.B(R.id.stage_sport_winner_text, inflate);
                                if (textView4 != null) {
                                    return new bv1(constraintLayout, constraintLayout, imageView, textView, textView2, imageView2, textView3, imageView3, textView4);
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        int i = this.a;
        Object obj = this.i;
        ViewGroup viewGroup = this.b;
        switch (i) {
        }
        return (ConstraintLayout) viewGroup;
    }

    public bv1(ConstraintLayout constraintLayout, View view, View view2, Guideline guideline, Guideline guideline2, View view3, TextView textView, TextView textView2, TextView textView3) {
        this.a = 19;
        this.b = constraintLayout;
        this.e = view;
        this.f = view2;
        this.i = guideline;
        this.h = guideline2;
        this.j = view3;
        this.c = textView;
        this.d = textView2;
        this.g = textView3;
    }

    public bv1(ConstraintLayout constraintLayout, View view, FrameLayout frameLayout, ImageView imageView, TextView textView, FrameLayout frameLayout2, View view2, TextView textView2, ImageView imageView2) {
        this.a = 2;
        this.b = constraintLayout;
        this.i = view;
        this.g = frameLayout;
        this.e = imageView;
        this.c = textView;
        this.h = frameLayout2;
        this.j = view2;
        this.d = textView2;
        this.f = imageView2;
    }

    public bv1(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, ImageView imageView2, TextView textView4, TextView textView5, ImageView imageView3) {
        this.a = 0;
        this.b = constraintLayout;
        this.e = imageView;
        this.c = textView;
        this.d = textView2;
        this.g = textView3;
        this.f = imageView2;
        this.h = textView4;
        this.j = textView5;
        this.i = imageView3;
    }

    public bv1(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2, TextView textView3, ImageView imageView3, TextView textView4) {
        this.a = 17;
        this.b = constraintLayout;
        this.j = constraintLayout2;
        this.e = imageView;
        this.c = textView;
        this.d = textView2;
        this.f = imageView2;
        this.g = textView3;
        this.i = imageView3;
        this.h = textView4;
    }

    public bv1(CollapsibleProfileHeaderView collapsibleProfileHeaderView, FrameLayout frameLayout, ConstraintLayout constraintLayout, ImageView imageView, TextView textView, MaterialButton materialButton, ImageView imageView2, TextView textView2, TextView textView3) {
        this.a = 14;
        this.i = collapsibleProfileHeaderView;
        this.h = frameLayout;
        this.b = constraintLayout;
        this.e = imageView;
        this.c = textView;
        this.j = materialButton;
        this.f = imageView2;
        this.d = textView2;
        this.g = textView3;
    }

    public bv1(LinearLayout linearLayout, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, ImageView imageView, ImageView imageView2, TextView textView3, TextView textView4) {
        this.a = 1;
        this.i = linearLayout;
        this.b = constraintLayout;
        this.j = constraintLayout2;
        this.c = textView;
        this.d = textView2;
        this.e = imageView;
        this.f = imageView2;
        this.g = textView3;
        this.h = textView4;
    }

    public bv1(ConstraintLayout constraintLayout, ImageView imageView, View view, FrameLayout frameLayout, ImageView imageView2, TextView textView, ImageView imageView3, View view2, ImageView imageView4) {
        this.a = 4;
        this.b = constraintLayout;
        this.e = imageView;
        this.d = view;
        this.g = frameLayout;
        this.f = imageView2;
        this.c = textView;
        this.i = imageView3;
        this.h = view2;
        this.j = imageView4;
    }

    public bv1(ConstraintLayout constraintLayout, TextView textView, View view, FrameLayout frameLayout, ImageView imageView, TextView textView2, View view2, ImageView imageView2, View view3) {
        this.a = 3;
        this.b = constraintLayout;
        this.c = textView;
        this.i = view;
        this.g = frameLayout;
        this.e = imageView;
        this.d = textView2;
        this.h = view2;
        this.f = imageView2;
        this.j = view3;
    }

    public bv1(ConstraintLayout constraintLayout, LinearLayout linearLayout, TextView textView, View view, TextView textView2, ImageView imageView, TextView textView3, ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView, TextView textView4) {
        this.a = 20;
        this.b = constraintLayout;
        this.f = linearLayout;
        this.c = textView;
        this.i = view;
        this.d = textView2;
        this.e = imageView;
        this.g = textView3;
        this.j = scrollInterceptorHorizontalScrollView;
        this.h = textView4;
    }

    public bv1(ConstraintLayout constraintLayout, LinearLayout linearLayout, MaterialDivider materialDivider, View view, TextView textView, TextView textView2, TextView textView3, ImageButton imageButton, TextView textView4) {
        this.a = 13;
        this.b = constraintLayout;
        this.e = linearLayout;
        this.f = materialDivider;
        this.i = view;
        this.c = textView;
        this.d = textView2;
        this.g = textView3;
        this.j = imageButton;
        this.h = textView4;
    }

    public bv1(ConstraintLayout constraintLayout, TextView textView, ComposeView composeView, View view, ImageView imageView, TextView textView2, j22 j22Var, j22 j22Var2, j22 j22Var3) {
        this.a = 12;
        this.b = constraintLayout;
        this.c = textView;
        this.f = composeView;
        this.i = view;
        this.e = imageView;
        this.d = textView2;
        this.g = j22Var;
        this.h = j22Var2;
        this.j = j22Var3;
    }

    public bv1(ConstraintLayout constraintLayout, ImageView imageView, View view, FrameLayout frameLayout, ImageView imageView2, TextView textView, SofascoreSmallRatingView sofascoreSmallRatingView, ImageView imageView3, LinearLayout linearLayout) {
        this.a = 5;
        this.b = constraintLayout;
        this.e = imageView;
        this.d = view;
        this.g = frameLayout;
        this.f = imageView2;
        this.c = textView;
        this.h = sofascoreSmallRatingView;
        this.i = imageView3;
        this.j = linearLayout;
    }

    public bv1(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2, ImageView imageView3, TextView textView3, TextView textView4, ImageView imageView4) {
        this.a = 10;
        this.b = constraintLayout;
        this.e = imageView;
        this.c = textView;
        this.d = textView2;
        this.f = imageView2;
        this.i = imageView3;
        this.g = textView3;
        this.h = textView4;
        this.j = imageView4;
    }

    public bv1(NestedScrollView nestedScrollView, LottieAnimationView lottieAnimationView, ConstraintLayout constraintLayout, Guideline guideline, ImageView imageView, MaterialButton materialButton, MaterialButton materialButton2, LinearProgressIndicator linearProgressIndicator, ViewPager2 viewPager2) {
        this.a = 6;
        this.f = nestedScrollView;
        this.i = lottieAnimationView;
        this.b = constraintLayout;
        this.c = guideline;
        this.e = imageView;
        this.d = materialButton;
        this.g = materialButton2;
        this.h = linearProgressIndicator;
        this.j = viewPager2;
    }

    public bv1(FrameLayout frameLayout, ImageButton imageButton, RelativeLayout relativeLayout, View view, View view2, View view3, ImageView imageView, ProgressBar progressBar, ImageView imageView2, YouTubePlayerSeekBar youTubePlayerSeekBar) {
        this.a = 15;
        this.b = frameLayout;
        this.i = relativeLayout;
        this.c = view;
        this.d = view2;
        this.g = view3;
        this.e = imageView;
        this.h = progressBar;
        this.f = imageView2;
        this.j = youTubePlayerSeekBar;
    }

    public bv1(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, BellButton bellButton, TextView textView, ImageView imageView, ImageView imageView2, TextView textView2, z3f z3fVar, dk2 dk2Var) {
        this.a = 18;
        this.b = constraintLayout;
        this.i = constraintLayout2;
        this.g = bellButton;
        this.c = textView;
        this.e = imageView;
        this.f = imageView2;
        this.d = textView2;
        this.h = z3fVar;
        this.j = dk2Var;
    }

    public bv1(MaterialCardView materialCardView, ImageView imageView, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout, FrameLayout frameLayout, LinearLayout linearLayout2, ImageView imageView2) {
        this.a = 9;
        this.b = materialCardView;
        this.e = imageView;
        this.c = textView;
        this.d = textView2;
        this.g = textView3;
        this.i = linearLayout;
        this.h = frameLayout;
        this.j = linearLayout2;
        this.f = imageView2;
    }

    public bv1(ConstraintLayout constraintLayout, hz3 hz3Var, hz3 hz3Var2, GraphicLarge graphicLarge, View view, View view2, Group group, ComposeView composeView, SegmentedButtonsView segmentedButtonsView, lqb lqbVar) {
        this.a = 8;
        this.b = constraintLayout;
        this.e = hz3Var;
        this.f = hz3Var2;
        this.i = graphicLarge;
        this.c = view;
        this.d = view2;
        this.g = group;
        this.h = segmentedButtonsView;
        this.j = lqbVar;
    }

    public /* synthetic */ bv1(LinearLayout linearLayout, View view, Object obj, Object obj2, Object obj3, Object obj4, View view2, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = linearLayout;
        this.e = view;
        this.f = obj;
        this.i = obj2;
        this.c = obj3;
        this.d = obj4;
        this.g = view2;
        this.h = obj5;
        this.j = obj6;
    }
}
