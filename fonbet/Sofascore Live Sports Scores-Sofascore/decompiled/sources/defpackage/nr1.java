package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.sofascore.results.R;
import com.sofascore.results.calendar.MaterialCalendarView;
import com.sofascore.results.view.BellButton;
import com.sofascore.results.view.SofascoreSmallRatingView;
import com.sofascore.results.view.WDLView;
import com.sofascore.results.view.graph.BasketballShotmapPlayAreasGraph;
import com.sofascore.results.view.graph.SeasonRatingGraph;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nr1 implements krk {
    public final /* synthetic */ int a;
    public final TextView b;
    public final ViewGroup c;
    public final View d;
    public final View e;
    public final Object f;
    public final View g;
    public final Object h;
    public final Object i;

    public nr1(LinearLayout linearLayout, ImageView imageView, TextView textView, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout, TextView textView2, LinearLayout linearLayout2) {
        this.a = 15;
        this.d = linearLayout;
        this.e = imageView;
        this.b = textView;
        this.f = imageView2;
        this.g = imageView3;
        this.c = constraintLayout;
        this.h = textView2;
        this.i = linearLayout2;
    }

    public static nr1 a(View view) {
        int i = R.id.bell_button;
        BellButton bellButton = (BellButton) nq8.B(R.id.bell_button, view);
        if (bellButton != null) {
            i = R.id.clickable_area;
            View B = nq8.B(R.id.clickable_area, view);
            if (B != null) {
                i = R.id.on_bench_icon;
                ImageView imageView = (ImageView) nq8.B(R.id.on_bench_icon, view);
                if (imageView != null) {
                    i = R.id.player_stat_value;
                    TextView textView = (TextView) nq8.B(R.id.player_stat_value, view);
                    if (textView != null) {
                        i = R.id.player_stats_icon;
                        ImageView imageView2 = (ImageView) nq8.B(R.id.player_stats_icon, view);
                        if (imageView2 != null) {
                            i = R.id.rating_item;
                            SofascoreSmallRatingView sofascoreSmallRatingView = (SofascoreSmallRatingView) nq8.B(R.id.rating_item, view);
                            if (sofascoreSmallRatingView != null) {
                                i = R.id.wdl_item;
                                WDLView wDLView = (WDLView) nq8.B(R.id.wdl_item, view);
                                if (wDLView != null) {
                                    return new nr1((FrameLayout) view, bellButton, B, imageView, textView, imageView2, sofascoreSmallRatingView, wDLView);
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

    public static nr1 b(View view) {
        int i = R.id.highlights_image;
        ImageView imageView = (ImageView) nq8.B(R.id.highlights_image, view);
        if (imageView != null) {
            i = R.id.highlights_subtitle;
            TextView textView = (TextView) nq8.B(R.id.highlights_subtitle, view);
            if (textView != null) {
                i = R.id.highlights_time;
                TextView textView2 = (TextView) nq8.B(R.id.highlights_time, view);
                if (textView2 != null) {
                    i = R.id.highlights_title;
                    TextView textView3 = (TextView) nq8.B(R.id.highlights_title, view);
                    if (textView3 != null) {
                        i = R.id.highlights_watched;
                        TextView textView4 = (TextView) nq8.B(R.id.highlights_watched, view);
                        if (textView4 != null) {
                            i = R.id.image_overlay;
                            View B = nq8.B(R.id.image_overlay, view);
                            if (B != null) {
                                i = R.id.play_icon;
                                ImageView imageView2 = (ImageView) nq8.B(R.id.play_icon, view);
                                if (imageView2 != null) {
                                    return new nr1((ConstraintLayout) view, imageView, textView, textView2, textView3, textView4, B, imageView2);
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

    public static nr1 c(View view) {
        int i = R.id.from_team_logo;
        ImageView imageView = (ImageView) nq8.B(R.id.from_team_logo, view);
        if (imageView != null) {
            i = R.id.to_team_logo;
            ImageView imageView2 = (ImageView) nq8.B(R.id.to_team_logo, view);
            if (imageView2 != null) {
                i = R.id.transfer_amount_text;
                TextView textView = (TextView) nq8.B(R.id.transfer_amount_text, view);
                if (textView != null) {
                    i = R.id.transfer_arrow_icon;
                    if (((ImageView) nq8.B(R.id.transfer_arrow_icon, view)) != null) {
                        i = R.id.transfer_date_text;
                        TextView textView2 = (TextView) nq8.B(R.id.transfer_date_text, view);
                        if (textView2 != null) {
                            i = R.id.transfer_middle_divider_end;
                            View B = nq8.B(R.id.transfer_middle_divider_end, view);
                            if (B != null) {
                                i = R.id.transfer_middle_divider_start;
                                View B2 = nq8.B(R.id.transfer_middle_divider_start, view);
                                if (B2 != null) {
                                    i = R.id.transfer_row_divider_layout;
                                    if (((LinearLayout) nq8.B(R.id.transfer_row_divider_layout, view)) != null) {
                                        i = R.id.transfer_type_text;
                                        TextView textView3 = (TextView) nq8.B(R.id.transfer_type_text, view);
                                        if (textView3 != null) {
                                            return new nr1((ConstraintLayout) view, imageView, imageView2, textView, textView2, B, B2, textView3, 13);
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

    public static nr1 d(View view) {
        int i = R.id.guideline_end;
        Guideline guideline = (Guideline) nq8.B(R.id.guideline_end, view);
        if (guideline != null) {
            i = R.id.guideline_start;
            Guideline guideline2 = (Guideline) nq8.B(R.id.guideline_start, view);
            if (guideline2 != null) {
                i = R.id.indicator_away;
                ProgressBar progressBar = (ProgressBar) nq8.B(R.id.indicator_away, view);
                if (progressBar != null) {
                    i = R.id.indicator_home;
                    ProgressBar progressBar2 = (ProgressBar) nq8.B(R.id.indicator_home, view);
                    if (progressBar2 != null) {
                        i = R.id.label;
                        TextView textView = (TextView) nq8.B(R.id.label, view);
                        if (textView != null) {
                            i = R.id.text_layout_away;
                            View B = nq8.B(R.id.text_layout_away, view);
                            if (B != null) {
                                hrc a = hrc.a(B);
                                i = R.id.text_layout_home;
                                View B2 = nq8.B(R.id.text_layout_home, view);
                                if (B2 != null) {
                                    return new nr1((ConstraintLayout) view, guideline, guideline2, progressBar, progressBar2, textView, a, hrc.a(B2));
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

    public static nr1 e(View view) {
        int i = R.id.action_icon;
        ImageView imageView = (ImageView) nq8.B(R.id.action_icon, view);
        if (imageView != null) {
            i = R.id.action_text;
            TextView textView = (TextView) nq8.B(R.id.action_text, view);
            if (textView != null) {
                i = R.id.close;
                ImageView imageView2 = (ImageView) nq8.B(R.id.close, view);
                if (imageView2 != null) {
                    i = R.id.icon_info;
                    ImageView imageView3 = (ImageView) nq8.B(R.id.icon_info, view);
                    if (imageView3 != null) {
                        i = R.id.info_container;
                        ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.info_container, view);
                        if (constraintLayout != null) {
                            i = R.id.information_text;
                            TextView textView2 = (TextView) nq8.B(R.id.information_text, view);
                            if (textView2 != null) {
                                i = R.id.read_more;
                                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.read_more, view);
                                if (linearLayout != null) {
                                    return new nr1((LinearLayout) view, imageView, textView, imageView2, imageView3, constraintLayout, textView2, linearLayout);
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

    public static nr1 f(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.dialog_propose_follow, (ViewGroup) null, false);
        int i = R.id.body_text;
        TextView textView = (TextView) nq8.B(R.id.body_text, inflate);
        if (textView != null) {
            i = R.id.bottom_label;
            TextView textView2 = (TextView) nq8.B(R.id.bottom_label, inflate);
            if (textView2 != null) {
                i = R.id.do_not_show_again_checkbox;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) nq8.B(R.id.do_not_show_again_checkbox, inflate);
                if (materialCheckBox != null) {
                    i = R.id.follow_button;
                    MaterialButton materialButton = (MaterialButton) nq8.B(R.id.follow_button, inflate);
                    if (materialButton != null) {
                        i = R.id.logo;
                        ImageView imageView = (ImageView) nq8.B(R.id.logo, inflate);
                        if (imageView != null) {
                            i = R.id.no_thanks_button;
                            TextView textView3 = (TextView) nq8.B(R.id.no_thanks_button, inflate);
                            if (textView3 != null) {
                                i = R.id.top_label;
                                TextView textView4 = (TextView) nq8.B(R.id.top_label, inflate);
                                if (textView4 != null) {
                                    return new nr1((ConstraintLayout) inflate, textView, textView2, materialCheckBox, materialButton, imageView, textView3, textView4);
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
        ViewGroup viewGroup = this.c;
        switch (i) {
            case 0:
                return (ConstraintLayout) viewGroup;
            case 1:
                return (LinearLayout) viewGroup;
            case 2:
                return (ConstraintLayout) viewGroup;
            case 3:
                return (LinearLayout) viewGroup;
            case 4:
                return (ConstraintLayout) viewGroup;
            case 5:
                return (ConstraintLayout) viewGroup;
            case 6:
                return (ConstraintLayout) viewGroup;
            case 7:
                return (FrameLayout) viewGroup;
            case 8:
                return (ConstraintLayout) viewGroup;
            case 9:
                return (LinearLayout) viewGroup;
            case 10:
                return (LinearLayout) viewGroup;
            case 11:
                return (ConstraintLayout) viewGroup;
            case 12:
                return (LinearLayout) viewGroup;
            case 13:
                return (ConstraintLayout) viewGroup;
            case 14:
                return (ConstraintLayout) viewGroup;
            case 15:
                return (LinearLayout) this.d;
            default:
                return (RelativeLayout) viewGroup;
        }
    }

    public /* synthetic */ nr1(ViewGroup viewGroup, TextView textView, LinearLayout linearLayout, TextView textView2, View view, View view2, View view3, View view4, int i) {
        this.a = i;
        this.c = viewGroup;
        this.b = textView;
        this.d = linearLayout;
        this.e = textView2;
        this.f = view;
        this.g = view2;
        this.h = view3;
        this.i = view4;
    }

    public nr1(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, ImageView imageView, TextView textView4, TextView textView5, TextView textView6) {
        this.a = 5;
        this.c = constraintLayout;
        this.b = textView;
        this.d = textView2;
        this.f = textView3;
        this.e = imageView;
        this.g = textView4;
        this.h = textView5;
        this.i = textView6;
    }

    public nr1(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, ImageView imageView, ImageView imageView2) {
        this.a = 6;
        this.c = constraintLayout;
        this.b = textView;
        this.d = textView2;
        this.g = textView3;
        this.h = textView4;
        this.i = textView5;
        this.e = imageView;
        this.f = imageView2;
    }

    public /* synthetic */ nr1(ViewGroup viewGroup, ImageView imageView, ImageView imageView2, TextView textView, View view, View view2, View view3, View view4, int i) {
        this.a = i;
        this.c = viewGroup;
        this.e = imageView;
        this.f = imageView2;
        this.b = textView;
        this.d = view;
        this.g = view2;
        this.h = view3;
        this.i = view4;
    }

    public nr1(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view, ImageView imageView2) {
        this.a = 8;
        this.c = constraintLayout;
        this.e = imageView;
        this.b = textView;
        this.d = textView2;
        this.h = textView3;
        this.i = textView4;
        this.g = view;
        this.f = imageView2;
    }

    public nr1(ConstraintLayout constraintLayout, GridView gridView, ImageView imageView, yue yueVar, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.a = 11;
        this.c = constraintLayout;
        this.d = gridView;
        this.e = imageView;
        this.f = yueVar;
        this.b = textView;
        this.g = textView2;
        this.h = textView3;
        this.i = textView4;
    }

    public nr1(ConstraintLayout constraintLayout, TextView textView, TextView textView2, MaterialCheckBox materialCheckBox, MaterialButton materialButton, ImageView imageView, TextView textView3, TextView textView4) {
        this.a = 4;
        this.c = constraintLayout;
        this.b = textView;
        this.d = textView2;
        this.f = materialCheckBox;
        this.g = materialButton;
        this.e = imageView;
        this.h = textView3;
        this.i = textView4;
    }

    public nr1(ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, ProgressBar progressBar, ProgressBar progressBar2, TextView textView, hrc hrcVar, hrc hrcVar2) {
        this.a = 14;
        this.c = constraintLayout;
        this.d = guideline;
        this.e = guideline2;
        this.f = progressBar;
        this.g = progressBar2;
        this.b = textView;
        this.h = hrcVar;
        this.i = hrcVar2;
    }

    public nr1(FrameLayout frameLayout, BellButton bellButton, View view, ImageView imageView, TextView textView, ImageView imageView2, SofascoreSmallRatingView sofascoreSmallRatingView, WDLView wDLView) {
        this.a = 7;
        this.c = frameLayout;
        this.d = bellButton;
        this.g = view;
        this.e = imageView;
        this.b = textView;
        this.f = imageView2;
        this.h = sofascoreSmallRatingView;
        this.i = wDLView;
    }

    public nr1(LinearLayout linearLayout, TextView textView, TextView textView2, MaterialButton materialButton, ImageView imageView, ImageView imageView2, ImageView imageView3, Space space, TextView textView3) {
        this.a = 9;
        this.c = linearLayout;
        this.b = textView;
        this.d = textView2;
        this.g = materialButton;
        this.e = imageView2;
        this.f = imageView3;
        this.h = space;
        this.i = textView3;
    }

    public nr1(LinearLayout linearLayout, SeasonRatingGraph seasonRatingGraph, TextView textView, LinearLayout linearLayout2, FrameLayout frameLayout, TextView textView2, TextView textView3, hei heiVar, TextView textView4) {
        this.a = 12;
        this.c = linearLayout;
        this.d = seasonRatingGraph;
        this.b = textView;
        this.e = linearLayout2;
        this.f = frameLayout;
        this.g = textView2;
        this.h = textView3;
        this.i = heiVar;
    }

    public nr1(LinearLayout linearLayout, ImageView imageView, MaterialCalendarView materialCalendarView, LinearLayout linearLayout2, ConstraintLayout constraintLayout, TextView textView, View view, View view2, TextView textView2) {
        this.a = 3;
        this.c = linearLayout;
        this.e = imageView;
        this.d = materialCalendarView;
        this.f = linearLayout2;
        this.b = textView;
        this.g = view;
        this.h = view2;
        this.i = textView2;
    }

    public nr1(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, LinearLayout linearLayout, View view, TextView textView, BasketballShotmapPlayAreasGraph basketballShotmapPlayAreasGraph, BasketballShotmapPlayAreasGraph basketballShotmapPlayAreasGraph2, ImageView imageView2) {
        this.a = 0;
        this.c = constraintLayout;
        this.d = constraintLayout2;
        this.e = imageView;
        this.g = view;
        this.b = textView;
        this.h = basketballShotmapPlayAreasGraph;
        this.i = basketballShotmapPlayAreasGraph2;
        this.f = imageView2;
    }
}
