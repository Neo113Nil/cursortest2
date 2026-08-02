package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.results.R;
import com.sofascore.results.view.EventListScoreTextView;
import com.sofascore.results.view.SofascoreRatingView;
import com.sofascore.results.view.SofascoreSmallRatingView;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class j22 implements krk {
    public final /* synthetic */ int a = 3;
    public final ConstraintLayout b;
    public final View c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final View g;
    public final View h;
    public final View i;
    public final View j;
    public final View k;
    public final View l;
    public final ImageView m;
    public final View n;
    public final Object o;
    public final View p;
    public final View q;

    public j22(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, ImageView imageView2, TextView textView2, ImageView imageView3, ImageView imageView4, TextView textView3, TextView textView4, SofascoreSmallRatingView sofascoreSmallRatingView, SofascoreRatingView sofascoreRatingView, LinearLayout linearLayout, TextView textView5, ImageView imageView5, TextView textView6, LinearLayout linearLayout2) {
        this.b = constraintLayout;
        this.d = textView;
        this.m = imageView;
        this.p = imageView2;
        this.e = textView2;
        this.c = imageView3;
        this.n = imageView4;
        this.f = textView3;
        this.g = textView4;
        this.q = sofascoreSmallRatingView;
        this.j = sofascoreRatingView;
        this.o = linearLayout;
        this.h = textView5;
        this.k = imageView5;
        this.i = textView6;
        this.l = linearLayout2;
    }

    public static j22 a(View view) {
        int i = R.id.box_score_player_image;
        ImageView imageView = (ImageView) nq8.B(R.id.box_score_player_image, view);
        if (imageView != null) {
            i = R.id.header_root;
            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.header_root, view);
            if (linearLayout != null) {
                i = R.id.horizontal_scroll;
                ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) nq8.B(R.id.horizontal_scroll, view);
                if (scrollInterceptorHorizontalScrollView != null) {
                    i = R.id.number_and_position_container;
                    if (((LinearLayout) nq8.B(R.id.number_and_position_container, view)) != null) {
                        i = R.id.rating_item;
                        SofascoreSmallRatingView sofascoreSmallRatingView = (SofascoreSmallRatingView) nq8.B(R.id.rating_item, view);
                        if (sofascoreSmallRatingView != null) {
                            i = R.id.sort_lineups_border;
                            View B = nq8.B(R.id.sort_lineups_border, view);
                            if (B != null) {
                                i = R.id.sort_lineups_player_main_1;
                                TextView textView = (TextView) nq8.B(R.id.sort_lineups_player_main_1, view);
                                if (textView != null) {
                                    i = R.id.sort_lineups_player_main_2;
                                    TextView textView2 = (TextView) nq8.B(R.id.sort_lineups_player_main_2, view);
                                    if (textView2 != null) {
                                        i = R.id.sort_lineups_player_main_3;
                                        TextView textView3 = (TextView) nq8.B(R.id.sort_lineups_player_main_3, view);
                                        if (textView3 != null) {
                                            i = R.id.sort_lineups_player_main_4;
                                            TextView textView4 = (TextView) nq8.B(R.id.sort_lineups_player_main_4, view);
                                            if (textView4 != null) {
                                                i = R.id.start_guideline;
                                                if (((Guideline) nq8.B(R.id.start_guideline, view)) != null) {
                                                    i = R.id.starting_lineups_starter_label_text;
                                                    TextView textView5 = (TextView) nq8.B(R.id.starting_lineups_starter_label_text, view);
                                                    if (textView5 != null) {
                                                        i = R.id.starting_lineups_team_color;
                                                        View B2 = nq8.B(R.id.starting_lineups_team_color, view);
                                                        if (B2 != null) {
                                                            i = R.id.stats_barrier;
                                                            if (((Barrier) nq8.B(R.id.stats_barrier, view)) != null) {
                                                                i = R.id.tvPlayerName;
                                                                TextView textView6 = (TextView) nq8.B(R.id.tvPlayerName, view);
                                                                if (textView6 != null) {
                                                                    i = R.id.tvPlayerStatus;
                                                                    TextView textView7 = (TextView) nq8.B(R.id.tvPlayerStatus, view);
                                                                    if (textView7 != null) {
                                                                        i = R.id.tvPosition;
                                                                        TextView textView8 = (TextView) nq8.B(R.id.tvPosition, view);
                                                                        if (textView8 != null) {
                                                                            i = R.id.tvShirtNumber;
                                                                            TextView textView9 = (TextView) nq8.B(R.id.tvShirtNumber, view);
                                                                            if (textView9 != null) {
                                                                                return new j22((ConstraintLayout) view, imageView, linearLayout, scrollInterceptorHorizontalScrollView, sofascoreSmallRatingView, B, textView, textView2, textView3, textView4, textView5, B2, textView6, textView7, textView8, textView9);
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

    public static j22 b(View view) {
        int i = R.id.away_result;
        TextView textView = (TextView) nq8.B(R.id.away_result, view);
        if (textView != null) {
            i = R.id.away_team_logo;
            ImageView imageView = (ImageView) nq8.B(R.id.away_team_logo, view);
            if (imageView != null) {
                i = R.id.end_icon;
                ImageView imageView2 = (ImageView) nq8.B(R.id.end_icon, view);
                if (imageView2 != null) {
                    i = R.id.home_result;
                    TextView textView2 = (TextView) nq8.B(R.id.home_result, view);
                    if (textView2 != null) {
                        i = R.id.home_team_logo;
                        ImageView imageView3 = (ImageView) nq8.B(R.id.home_team_logo, view);
                        if (imageView3 != null) {
                            i = R.id.item_image;
                            ImageView imageView4 = (ImageView) nq8.B(R.id.item_image, view);
                            if (imageView4 != null) {
                                i = R.id.position_label;
                                TextView textView3 = (TextView) nq8.B(R.id.position_label, view);
                                if (textView3 != null) {
                                    i = R.id.primary_label;
                                    TextView textView4 = (TextView) nq8.B(R.id.primary_label, view);
                                    if (textView4 != null) {
                                        i = R.id.rating_small;
                                        SofascoreSmallRatingView sofascoreSmallRatingView = (SofascoreSmallRatingView) nq8.B(R.id.rating_small, view);
                                        if (sofascoreSmallRatingView != null) {
                                            i = R.id.rating_text;
                                            SofascoreRatingView sofascoreRatingView = (SofascoreRatingView) nq8.B(R.id.rating_text, view);
                                            if (sofascoreRatingView != null) {
                                                i = R.id.secondary_holder;
                                                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.secondary_holder, view);
                                                if (linearLayout != null) {
                                                    i = R.id.secondary_label;
                                                    TextView textView5 = (TextView) nq8.B(R.id.secondary_label, view);
                                                    if (textView5 != null) {
                                                        i = R.id.secondary_logo;
                                                        ImageView imageView5 = (ImageView) nq8.B(R.id.secondary_logo, view);
                                                        if (imageView5 != null) {
                                                            i = R.id.stat_barrier;
                                                            if (((Barrier) nq8.B(R.id.stat_barrier, view)) != null) {
                                                                i = R.id.stat_value;
                                                                TextView textView6 = (TextView) nq8.B(R.id.stat_value, view);
                                                                if (textView6 != null) {
                                                                    i = R.id.tertiary_holder;
                                                                    LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.tertiary_holder, view);
                                                                    if (linearLayout2 != null) {
                                                                        return new j22((ConstraintLayout) view, textView, imageView, imageView2, textView2, imageView3, imageView4, textView3, textView4, sofascoreSmallRatingView, sofascoreRatingView, linearLayout, textView5, imageView5, textView6, linearLayout2);
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

    public static j22 c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.cricket_innings_row_layout, viewGroup, false);
        int i = R.id.background_overlay;
        View B = nq8.B(R.id.background_overlay, inflate);
        if (B != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
            i = R.id.column_1;
            TextView textView = (TextView) nq8.B(R.id.column_1, inflate);
            if (textView != null) {
                i = R.id.column_2;
                TextView textView2 = (TextView) nq8.B(R.id.column_2, inflate);
                if (textView2 != null) {
                    i = R.id.column_3;
                    TextView textView3 = (TextView) nq8.B(R.id.column_3, inflate);
                    if (textView3 != null) {
                        i = R.id.column_4;
                        TextView textView4 = (TextView) nq8.B(R.id.column_4, inflate);
                        if (textView4 != null) {
                            i = R.id.column_5;
                            TextView textView5 = (TextView) nq8.B(R.id.column_5, inflate);
                            if (textView5 != null) {
                                i = R.id.column_6;
                                TextView textView6 = (TextView) nq8.B(R.id.column_6, inflate);
                                if (textView6 != null) {
                                    i = R.id.column_7;
                                    TextView textView7 = (TextView) nq8.B(R.id.column_7, inflate);
                                    if (textView7 != null) {
                                        i = R.id.end_margin_guideline;
                                        if (((Guideline) nq8.B(R.id.end_margin_guideline, inflate)) != null) {
                                            i = R.id.item_additional_row_1;
                                            TextView textView8 = (TextView) nq8.B(R.id.item_additional_row_1, inflate);
                                            if (textView8 != null) {
                                                i = R.id.item_additional_row_2;
                                                TextView textView9 = (TextView) nq8.B(R.id.item_additional_row_2, inflate);
                                                if (textView9 != null) {
                                                    i = R.id.item_player_name;
                                                    TextView textView10 = (TextView) nq8.B(R.id.item_player_name, inflate);
                                                    if (textView10 != null) {
                                                        i = R.id.item_section_order;
                                                        TextView textView11 = (TextView) nq8.B(R.id.item_section_order, inflate);
                                                        if (textView11 != null) {
                                                            i = R.id.player_live_indicator;
                                                            ImageView imageView = (ImageView) nq8.B(R.id.player_live_indicator, inflate);
                                                            if (imageView != null) {
                                                                i = R.id.player_name_container;
                                                                if (((ConstraintLayout) nq8.B(R.id.player_name_container, inflate)) != null) {
                                                                    i = R.id.team_indicator;
                                                                    View B2 = nq8.B(R.id.team_indicator, inflate);
                                                                    if (B2 != null) {
                                                                        return new j22(constraintLayout, B, constraintLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, imageView, B2);
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
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public static j22 d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.viewholder_event_basketball, viewGroup, false);
        int i = R.id.action_layout;
        View B = nq8.B(R.id.action_layout, inflate);
        if (B != null) {
            nr1 a = nr1.a(B);
            i = R.id.description;
            TextView textView = (TextView) nq8.B(R.id.description, inflate);
            if (textView != null) {
                i = R.id.first_team_logo;
                ImageView imageView = (ImageView) nq8.B(R.id.first_team_logo, inflate);
                if (imageView != null) {
                    i = R.id.first_team_name;
                    TextView textView2 = (TextView) nq8.B(R.id.first_team_name, inflate);
                    if (textView2 != null) {
                        i = R.id.first_team_score_current;
                        EventListScoreTextView eventListScoreTextView = (EventListScoreTextView) nq8.B(R.id.first_team_score_current, inflate);
                        if (eventListScoreTextView != null) {
                            i = R.id.first_team_score_set;
                            EventListScoreTextView eventListScoreTextView2 = (EventListScoreTextView) nq8.B(R.id.first_team_score_set, inflate);
                            if (eventListScoreTextView2 != null) {
                                i = R.id.highlight;
                                View B2 = nq8.B(R.id.highlight, inflate);
                                if (B2 != null) {
                                    i = R.id.indicator_crowdsourcing;
                                    ImageView imageView2 = (ImageView) nq8.B(R.id.indicator_crowdsourcing, inflate);
                                    if (imageView2 != null) {
                                        i = R.id.live_stream_indicator;
                                        ImageView imageView3 = (ImageView) nq8.B(R.id.live_stream_indicator, inflate);
                                        if (imageView3 != null) {
                                            i = R.id.score_current_start_barrier;
                                            if (((Barrier) nq8.B(R.id.score_current_start_barrier, inflate)) != null) {
                                                i = R.id.score_game_start_barrier;
                                                if (((Barrier) nq8.B(R.id.score_game_start_barrier, inflate)) != null) {
                                                    i = R.id.score_set_start_barrier;
                                                    if (((Barrier) nq8.B(R.id.score_set_start_barrier, inflate)) != null) {
                                                        i = R.id.second_team_logo;
                                                        ImageView imageView4 = (ImageView) nq8.B(R.id.second_team_logo, inflate);
                                                        if (imageView4 != null) {
                                                            i = R.id.second_team_name;
                                                            TextView textView3 = (TextView) nq8.B(R.id.second_team_name, inflate);
                                                            if (textView3 != null) {
                                                                i = R.id.second_team_score_current;
                                                                EventListScoreTextView eventListScoreTextView3 = (EventListScoreTextView) nq8.B(R.id.second_team_score_current, inflate);
                                                                if (eventListScoreTextView3 != null) {
                                                                    i = R.id.second_team_score_set;
                                                                    EventListScoreTextView eventListScoreTextView4 = (EventListScoreTextView) nq8.B(R.id.second_team_score_set, inflate);
                                                                    if (eventListScoreTextView4 != null) {
                                                                        i = R.id.time_lower;
                                                                        EventListScoreTextView eventListScoreTextView5 = (EventListScoreTextView) nq8.B(R.id.time_lower, inflate);
                                                                        if (eventListScoreTextView5 != null) {
                                                                            i = R.id.time_upper;
                                                                            TextView textView4 = (TextView) nq8.B(R.id.time_upper, inflate);
                                                                            if (textView4 != null) {
                                                                                i = R.id.vertical_guideline_start;
                                                                                if (((Guideline) nq8.B(R.id.vertical_guideline_start, inflate)) != null) {
                                                                                    return new j22((ConstraintLayout) inflate, a, textView, imageView, textView2, eventListScoreTextView, eventListScoreTextView2, B2, imageView2, imageView3, imageView4, textView3, eventListScoreTextView3, eventListScoreTextView4, eventListScoreTextView5, textView4);
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
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            case 2:
                return this.b;
            case 3:
                return (FrameLayout) this.p;
            default:
                return this.b;
        }
    }

    public j22(ConstraintLayout constraintLayout, View view, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, ImageView imageView, View view2) {
        this.b = constraintLayout;
        this.c = view;
        this.o = constraintLayout2;
        this.d = textView;
        this.e = textView2;
        this.f = textView3;
        this.g = textView4;
        this.h = textView5;
        this.i = textView6;
        this.j = textView7;
        this.k = textView8;
        this.l = textView9;
        this.p = textView10;
        this.q = textView11;
        this.m = imageView;
        this.n = view2;
    }

    public j22(ConstraintLayout constraintLayout, ImageView imageView, LinearLayout linearLayout, ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView, SofascoreSmallRatingView sofascoreSmallRatingView, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, View view2, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        this.b = constraintLayout;
        this.m = imageView;
        this.o = linearLayout;
        this.p = scrollInterceptorHorizontalScrollView;
        this.q = sofascoreSmallRatingView;
        this.c = view;
        this.d = textView;
        this.e = textView2;
        this.f = textView3;
        this.g = textView4;
        this.h = textView5;
        this.n = view2;
        this.i = textView6;
        this.j = textView7;
        this.k = textView8;
        this.l = textView9;
    }

    public j22(ConstraintLayout constraintLayout, nr1 nr1Var, TextView textView, ImageView imageView, TextView textView2, EventListScoreTextView eventListScoreTextView, EventListScoreTextView eventListScoreTextView2, View view, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView3, EventListScoreTextView eventListScoreTextView3, EventListScoreTextView eventListScoreTextView4, EventListScoreTextView eventListScoreTextView5, TextView textView4) {
        this.b = constraintLayout;
        this.o = nr1Var;
        this.d = textView;
        this.m = imageView;
        this.e = textView2;
        this.p = eventListScoreTextView;
        this.q = eventListScoreTextView2;
        this.c = view;
        this.n = imageView2;
        this.h = imageView3;
        this.i = imageView4;
        this.f = textView3;
        this.j = eventListScoreTextView3;
        this.k = eventListScoreTextView4;
        this.l = eventListScoreTextView5;
        this.g = textView4;
    }

    public j22(FrameLayout frameLayout, RelativeLayout relativeLayout, CheckBox checkBox, ImageView imageView, View view, ConstraintLayout constraintLayout, RelativeLayout relativeLayout2, ConstraintLayout constraintLayout2, ImageView imageView2, LinearLayout linearLayout, TextView textView, TextView textView2, LinearLayout linearLayout2, HorizontalScrollView horizontalScrollView, SegmentedButtonsView segmentedButtonsView, View view2) {
        this.p = frameLayout;
        this.q = relativeLayout;
        this.f = checkBox;
        this.m = imageView;
        this.c = view;
        this.b = constraintLayout;
        this.g = relativeLayout2;
        this.h = constraintLayout2;
        this.i = imageView2;
        this.o = linearLayout;
        this.d = textView;
        this.e = textView2;
        this.j = linearLayout2;
        this.k = horizontalScrollView;
        this.l = segmentedButtonsView;
        this.n = view2;
    }
}
