package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.sofascore.results.R;
import com.sofascore.results.view.EventListScoreTextView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bcb implements krk {
    public final EventListScoreTextView A;
    public final EventListScoreTextView B;
    public final EventListScoreTextView C;
    public final ImageView D;
    public final ImageView E;
    public final EventListScoreTextView F;
    public final TextView G;
    public final ImageView H;
    public final ConstraintLayout a;
    public final nr1 b;
    public final TextView c;
    public final ImageView d;
    public final TextView e;
    public final ImageView f;
    public final TextView g;
    public final ImageView h;
    public final TextView i;
    public final EventListScoreTextView j;
    public final EventListScoreTextView k;
    public final EventListScoreTextView l;
    public final ImageView m;
    public final ImageView n;
    public final View o;
    public final ImageView p;
    public final ImageView q;
    public final Barrier r;
    public final Barrier s;
    public final Barrier t;
    public final ImageView u;
    public final TextView v;
    public final ImageView w;
    public final TextView x;
    public final ImageView y;
    public final TextView z;

    public bcb(ConstraintLayout constraintLayout, nr1 nr1Var, TextView textView, ImageView imageView, TextView textView2, ImageView imageView2, TextView textView3, ImageView imageView3, TextView textView4, EventListScoreTextView eventListScoreTextView, EventListScoreTextView eventListScoreTextView2, EventListScoreTextView eventListScoreTextView3, ImageView imageView4, ImageView imageView5, View view, ImageView imageView6, ImageView imageView7, Barrier barrier, Barrier barrier2, Barrier barrier3, ImageView imageView8, TextView textView5, ImageView imageView9, TextView textView6, ImageView imageView10, TextView textView7, EventListScoreTextView eventListScoreTextView4, EventListScoreTextView eventListScoreTextView5, EventListScoreTextView eventListScoreTextView6, ImageView imageView11, ImageView imageView12, EventListScoreTextView eventListScoreTextView7, TextView textView8, ImageView imageView13) {
        this.a = constraintLayout;
        this.b = nr1Var;
        this.c = textView;
        this.d = imageView;
        this.e = textView2;
        this.f = imageView2;
        this.g = textView3;
        this.h = imageView3;
        this.i = textView4;
        this.j = eventListScoreTextView;
        this.k = eventListScoreTextView2;
        this.l = eventListScoreTextView3;
        this.m = imageView4;
        this.n = imageView5;
        this.o = view;
        this.p = imageView6;
        this.q = imageView7;
        this.r = barrier;
        this.s = barrier2;
        this.t = barrier3;
        this.u = imageView8;
        this.v = textView5;
        this.w = imageView9;
        this.x = textView6;
        this.y = imageView10;
        this.z = textView7;
        this.A = eventListScoreTextView4;
        this.B = eventListScoreTextView5;
        this.C = eventListScoreTextView6;
        this.D = imageView11;
        this.E = imageView12;
        this.F = eventListScoreTextView7;
        this.G = textView8;
        this.H = imageView13;
    }

    public static bcb a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.list_event_row, viewGroup, false);
        int i = R.id.action_layout;
        View B = nq8.B(R.id.action_layout, inflate);
        if (B != null) {
            nr1 a = nr1.a(B);
            i = R.id.description;
            TextView textView = (TextView) nq8.B(R.id.description, inflate);
            if (textView != null) {
                i = R.id.first_team_aggregated_win;
                ImageView imageView = (ImageView) nq8.B(R.id.first_team_aggregated_win, inflate);
                if (imageView != null) {
                    i = R.id.first_team_incidents_container;
                    TextView textView2 = (TextView) nq8.B(R.id.first_team_incidents_container, inflate);
                    if (textView2 != null) {
                        i = R.id.first_team_logo;
                        ImageView imageView2 = (ImageView) nq8.B(R.id.first_team_logo, inflate);
                        if (imageView2 != null) {
                            i = R.id.first_team_name;
                            TextView textView3 = (TextView) nq8.B(R.id.first_team_name, inflate);
                            if (textView3 != null) {
                                i = R.id.first_team_red_card;
                                ImageView imageView3 = (ImageView) nq8.B(R.id.first_team_red_card, inflate);
                                if (imageView3 != null) {
                                    i = R.id.first_team_red_card_count;
                                    TextView textView4 = (TextView) nq8.B(R.id.first_team_red_card_count, inflate);
                                    if (textView4 != null) {
                                        i = R.id.first_team_score_current;
                                        EventListScoreTextView eventListScoreTextView = (EventListScoreTextView) nq8.B(R.id.first_team_score_current, inflate);
                                        if (eventListScoreTextView != null) {
                                            i = R.id.first_team_score_game;
                                            EventListScoreTextView eventListScoreTextView2 = (EventListScoreTextView) nq8.B(R.id.first_team_score_game, inflate);
                                            if (eventListScoreTextView2 != null) {
                                                i = R.id.first_team_score_set;
                                                EventListScoreTextView eventListScoreTextView3 = (EventListScoreTextView) nq8.B(R.id.first_team_score_set, inflate);
                                                if (eventListScoreTextView3 != null) {
                                                    i = R.id.first_team_serve_indicator;
                                                    ImageView imageView4 = (ImageView) nq8.B(R.id.first_team_serve_indicator, inflate);
                                                    if (imageView4 != null) {
                                                        i = R.id.first_team_special_indicator;
                                                        ImageView imageView5 = (ImageView) nq8.B(R.id.first_team_special_indicator, inflate);
                                                        if (imageView5 != null) {
                                                            i = R.id.highlight;
                                                            View B2 = nq8.B(R.id.highlight, inflate);
                                                            if (B2 != null) {
                                                                i = R.id.indicator_crowdsourcing;
                                                                ImageView imageView6 = (ImageView) nq8.B(R.id.indicator_crowdsourcing, inflate);
                                                                if (imageView6 != null) {
                                                                    i = R.id.indicators_start_barrier;
                                                                    if (((Barrier) nq8.B(R.id.indicators_start_barrier, inflate)) != null) {
                                                                        i = R.id.live_stream_indicator;
                                                                        ImageView imageView7 = (ImageView) nq8.B(R.id.live_stream_indicator, inflate);
                                                                        if (imageView7 != null) {
                                                                            i = R.id.score_current_start_barrier;
                                                                            Barrier barrier = (Barrier) nq8.B(R.id.score_current_start_barrier, inflate);
                                                                            if (barrier != null) {
                                                                                i = R.id.score_game_start_barrier;
                                                                                Barrier barrier2 = (Barrier) nq8.B(R.id.score_game_start_barrier, inflate);
                                                                                if (barrier2 != null) {
                                                                                    i = R.id.score_set_start_barrier;
                                                                                    Barrier barrier3 = (Barrier) nq8.B(R.id.score_set_start_barrier, inflate);
                                                                                    if (barrier3 != null) {
                                                                                        i = R.id.second_team_aggregated_win;
                                                                                        ImageView imageView8 = (ImageView) nq8.B(R.id.second_team_aggregated_win, inflate);
                                                                                        if (imageView8 != null) {
                                                                                            i = R.id.second_team_incidents_container;
                                                                                            TextView textView5 = (TextView) nq8.B(R.id.second_team_incidents_container, inflate);
                                                                                            if (textView5 != null) {
                                                                                                i = R.id.second_team_logo;
                                                                                                ImageView imageView9 = (ImageView) nq8.B(R.id.second_team_logo, inflate);
                                                                                                if (imageView9 != null) {
                                                                                                    i = R.id.second_team_name;
                                                                                                    TextView textView6 = (TextView) nq8.B(R.id.second_team_name, inflate);
                                                                                                    if (textView6 != null) {
                                                                                                        i = R.id.second_team_red_card;
                                                                                                        ImageView imageView10 = (ImageView) nq8.B(R.id.second_team_red_card, inflate);
                                                                                                        if (imageView10 != null) {
                                                                                                            i = R.id.second_team_red_card_count;
                                                                                                            TextView textView7 = (TextView) nq8.B(R.id.second_team_red_card_count, inflate);
                                                                                                            if (textView7 != null) {
                                                                                                                i = R.id.second_team_score_current;
                                                                                                                EventListScoreTextView eventListScoreTextView4 = (EventListScoreTextView) nq8.B(R.id.second_team_score_current, inflate);
                                                                                                                if (eventListScoreTextView4 != null) {
                                                                                                                    i = R.id.second_team_score_game;
                                                                                                                    EventListScoreTextView eventListScoreTextView5 = (EventListScoreTextView) nq8.B(R.id.second_team_score_game, inflate);
                                                                                                                    if (eventListScoreTextView5 != null) {
                                                                                                                        i = R.id.second_team_score_set;
                                                                                                                        EventListScoreTextView eventListScoreTextView6 = (EventListScoreTextView) nq8.B(R.id.second_team_score_set, inflate);
                                                                                                                        if (eventListScoreTextView6 != null) {
                                                                                                                            i = R.id.second_team_serve_indicator;
                                                                                                                            ImageView imageView11 = (ImageView) nq8.B(R.id.second_team_serve_indicator, inflate);
                                                                                                                            if (imageView11 != null) {
                                                                                                                                i = R.id.second_team_special_indicator;
                                                                                                                                ImageView imageView12 = (ImageView) nq8.B(R.id.second_team_special_indicator, inflate);
                                                                                                                                if (imageView12 != null) {
                                                                                                                                    i = R.id.serve_indicator_start_barrier;
                                                                                                                                    if (((Barrier) nq8.B(R.id.serve_indicator_start_barrier, inflate)) != null) {
                                                                                                                                        i = R.id.time_lower;
                                                                                                                                        EventListScoreTextView eventListScoreTextView7 = (EventListScoreTextView) nq8.B(R.id.time_lower, inflate);
                                                                                                                                        if (eventListScoreTextView7 != null) {
                                                                                                                                            i = R.id.time_upper;
                                                                                                                                            TextView textView8 = (TextView) nq8.B(R.id.time_upper, inflate);
                                                                                                                                            if (textView8 != null) {
                                                                                                                                                i = R.id.var_indicator;
                                                                                                                                                ImageView imageView13 = (ImageView) nq8.B(R.id.var_indicator, inflate);
                                                                                                                                                if (imageView13 != null) {
                                                                                                                                                    i = R.id.vertical_guideline_start;
                                                                                                                                                    if (((Guideline) nq8.B(R.id.vertical_guideline_start, inflate)) != null) {
                                                                                                                                                        return new bcb((ConstraintLayout) inflate, a, textView, imageView, textView2, imageView2, textView3, imageView3, textView4, eventListScoreTextView, eventListScoreTextView2, eventListScoreTextView3, imageView4, imageView5, B2, imageView6, imageView7, barrier, barrier2, barrier3, imageView8, textView5, imageView9, textView6, imageView10, textView7, eventListScoreTextView4, eventListScoreTextView5, eventListScoreTextView6, imageView11, imageView12, eventListScoreTextView7, textView8, imageView13);
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
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
