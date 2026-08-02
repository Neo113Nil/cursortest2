package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputEditText;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.results.R;
import com.sofascore.results.dialog.view.SofascoreRatingScaleView;
import com.sofascore.results.event.mmastatistics.view.MmaStatsHeadDualView;
import com.sofascore.results.event.mmastatistics.view.MmaStatsLegsDualView;
import com.sofascore.results.event.mmastatistics.view.MmaStatsTorsoDualView;
import com.sofascore.results.profile.view.ProfilePredictionStatisticsView;
import com.sofascore.results.view.BellButton;
import com.sofascore.results.view.FootballPlayAreasView;
import com.sofascore.results.view.graph.BasketballShotmapGraph;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ez0 implements krk {
    public final /* synthetic */ int a;
    public final ViewGroup b;
    public final Object c;
    public final Object d;
    public final Object e;

    public ez0(LinearLayout linearLayout, zl zlVar, woc wocVar, LinearLayout linearLayout2, zl zlVar2) {
        this.a = 24;
        this.b = linearLayout;
        this.c = zlVar;
        this.d = linearLayout2;
        this.e = zlVar2;
    }

    public static ez0 a(View view) {
        int i = R.id.header_root;
        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.header_root, view);
        if (linearLayout != null) {
            i = R.id.horizontal_scroll;
            ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) nq8.B(R.id.horizontal_scroll, view);
            if (scrollInterceptorHorizontalScrollView != null) {
                i = R.id.start_guideline;
                if (((Guideline) nq8.B(R.id.start_guideline, view)) != null) {
                    i = R.id.tvPlayerName;
                    TextView textView = (TextView) nq8.B(R.id.tvPlayerName, view);
                    if (textView != null) {
                        return new ez0((ConstraintLayout) view, linearLayout, scrollInterceptorHorizontalScrollView, textView, 1);
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static ez0 b(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.highest_concentration;
        if (((TextView) nq8.B(R.id.highest_concentration, view)) != null) {
            i = R.id.legend_background;
            View B = nq8.B(R.id.legend_background, view);
            if (B != null) {
                i = R.id.legend_scale;
                ImageView imageView = (ImageView) nq8.B(R.id.legend_scale, view);
                if (imageView != null) {
                    i = R.id.legend_text;
                    if (((LinearLayout) nq8.B(R.id.legend_text, view)) != null) {
                        i = R.id.lowest_concentration;
                        if (((TextView) nq8.B(R.id.lowest_concentration, view)) != null) {
                            i = R.id.play_areas_total;
                            FootballPlayAreasView footballPlayAreasView = (FootballPlayAreasView) nq8.B(R.id.play_areas_total, view);
                            if (footballPlayAreasView != null) {
                                return new ez0(constraintLayout, B, imageView, footballPlayAreasView, 12);
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static ez0 c(View view) {
        int i = R.id.league_info_end_date;
        TextView textView = (TextView) nq8.B(R.id.league_info_end_date, view);
        if (textView != null) {
            i = R.id.league_info_progress;
            ProgressBar progressBar = (ProgressBar) nq8.B(R.id.league_info_progress, view);
            if (progressBar != null) {
                i = R.id.league_info_start_date;
                TextView textView2 = (TextView) nq8.B(R.id.league_info_start_date, view);
                if (textView2 != null) {
                    return new ez0((ConstraintLayout) view, textView, progressBar, textView2, 20);
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static ez0 d(View view) {
        int i = R.id.bell_button;
        BellButton bellButton = (BellButton) nq8.B(R.id.bell_button, view);
        if (bellButton != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.header_logo;
            ImageView imageView = (ImageView) nq8.B(R.id.header_logo, view);
            if (imageView != null) {
                i = R.id.header_name;
                TextView textView = (TextView) nq8.B(R.id.header_name, view);
                if (textView != null) {
                    return new ez0(constraintLayout, bellButton, imageView, textView, 25);
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static ez0 e(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.dialog_follow_event, (ViewGroup) null, false);
        int i = R.id.dialog_follow_dont_show_again;
        MaterialCheckBox materialCheckBox = (MaterialCheckBox) nq8.B(R.id.dialog_follow_dont_show_again, inflate);
        if (materialCheckBox != null) {
            i = R.id.dialog_follow_text;
            TextView textView = (TextView) nq8.B(R.id.dialog_follow_text, inflate);
            if (textView != null) {
                i = R.id.dialog_follow_title;
                TextView textView2 = (TextView) nq8.B(R.id.dialog_follow_title, inflate);
                if (textView2 != null) {
                    return new ez0((ScrollView) inflate, materialCheckBox, textView, textView2, 5);
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public static ez0 f(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.feed_shotmap_basketball_player, (ViewGroup) null, false);
        int i = R.id.periods_header;
        SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) nq8.B(R.id.periods_header, inflate);
        if (segmentedButtonsView != null) {
            i = R.id.player_shot_map;
            BasketballShotmapGraph basketballShotmapGraph = (BasketballShotmapGraph) nq8.B(R.id.player_shot_map, inflate);
            if (basketballShotmapGraph != null) {
                i = R.id.shotmap_container;
                FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.shotmap_container, inflate);
                if (frameLayout != null) {
                    return new ez0((LinearLayout) inflate, segmentedButtonsView, basketballShotmapGraph, frameLayout, 10);
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        int i = this.a;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 0:
                return (ConstraintLayout) viewGroup;
            case 1:
                return (ConstraintLayout) viewGroup;
            case 2:
                return (LinearLayout) viewGroup;
            case 3:
                return (ConstraintLayout) viewGroup;
            case 4:
                return (ConstraintLayout) viewGroup;
            case 5:
                return (ScrollView) viewGroup;
            case 6:
                return (NestedScrollView) viewGroup;
            case 7:
                return (ConstraintLayout) viewGroup;
            case 8:
                return (ConstraintLayout) viewGroup;
            case 9:
                return (ConstraintLayout) viewGroup;
            case 10:
                return (LinearLayout) viewGroup;
            case 11:
                return (ConstraintLayout) viewGroup;
            case 12:
                return (ConstraintLayout) viewGroup;
            case 13:
                return (LinearLayout) viewGroup;
            case 14:
                return (LinearLayout) viewGroup;
            case 15:
                return (ConstraintLayout) viewGroup;
            case 16:
                return (LinearLayout) viewGroup;
            case 17:
                return (FrameLayout) viewGroup;
            case 18:
                return (FrameLayout) this.c;
            case 19:
                return (ProfilePredictionStatisticsView) viewGroup;
            case 20:
                return (ConstraintLayout) viewGroup;
            case 21:
                return (LinearLayout) viewGroup;
            case 22:
                return (FrameLayout) viewGroup;
            case 23:
                return (ConstraintLayout) viewGroup;
            case 24:
                return (LinearLayout) viewGroup;
            case 25:
                return (ConstraintLayout) viewGroup;
            case 26:
                return (ConstraintLayout) viewGroup;
            case 27:
                return (LinearLayout) viewGroup;
            case 28:
                return (FrameLayout) viewGroup;
            default:
                return (LinearLayout) viewGroup;
        }
    }

    public /* synthetic */ ez0(ViewGroup viewGroup, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = viewGroup;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public ez0(NestedScrollView nestedScrollView, MaterialButton materialButton, TextView textView, SofascoreRatingScaleView sofascoreRatingScaleView, TextView textView2) {
        this.a = 6;
        this.b = nestedScrollView;
        this.c = materialButton;
        this.d = textView;
        this.e = sofascoreRatingScaleView;
    }

    public ez0(FrameLayout frameLayout, LinearLayout linearLayout, ImageView imageView, ConstraintLayout constraintLayout) {
        this.a = 18;
        this.c = frameLayout;
        this.d = linearLayout;
        this.e = imageView;
        this.b = constraintLayout;
    }

    public ez0(LinearLayout linearLayout, TextView textView, MmaStatsHeadDualView mmaStatsHeadDualView, MmaStatsLegsDualView mmaStatsLegsDualView, MmaStatsTorsoDualView mmaStatsTorsoDualView) {
        this.a = 27;
        this.b = linearLayout;
        this.c = mmaStatsHeadDualView;
        this.d = mmaStatsLegsDualView;
        this.e = mmaStatsTorsoDualView;
    }

    public ez0(ConstraintLayout constraintLayout, TextView textView, MaterialButton materialButton, LinearLayout linearLayout, ViewStub viewStub) {
        this.a = 23;
        this.b = constraintLayout;
        this.d = textView;
        this.c = materialButton;
        this.e = linearLayout;
    }

    public ez0(ConstraintLayout constraintLayout, MaterialButton materialButton, TextInputEditText textInputEditText, TextView textView, RadioGroup radioGroup, MaterialButton materialButton2, TextView textView2) {
        this.a = 0;
        this.b = constraintLayout;
        this.c = materialButton;
        this.d = textInputEditText;
        this.e = radioGroup;
    }
}
