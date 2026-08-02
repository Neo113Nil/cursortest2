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
public final class qvk implements krk {
    public final ConstraintLayout a;
    public final nr1 b;
    public final TextView c;
    public final ImageView d;
    public final TextView e;
    public final EventListScoreTextView f;
    public final EventListScoreTextView g;
    public final EventListScoreTextView h;
    public final ImageView i;
    public final View j;
    public final ImageView k;
    public final ImageView l;
    public final ImageView m;
    public final TextView n;
    public final EventListScoreTextView o;
    public final EventListScoreTextView p;
    public final EventListScoreTextView q;
    public final ImageView r;
    public final EventListScoreTextView s;
    public final TextView t;

    public qvk(ConstraintLayout constraintLayout, nr1 nr1Var, TextView textView, ImageView imageView, TextView textView2, EventListScoreTextView eventListScoreTextView, EventListScoreTextView eventListScoreTextView2, EventListScoreTextView eventListScoreTextView3, ImageView imageView2, View view, ImageView imageView3, ImageView imageView4, ImageView imageView5, TextView textView3, EventListScoreTextView eventListScoreTextView4, EventListScoreTextView eventListScoreTextView5, EventListScoreTextView eventListScoreTextView6, ImageView imageView6, EventListScoreTextView eventListScoreTextView7, TextView textView4) {
        this.a = constraintLayout;
        this.b = nr1Var;
        this.c = textView;
        this.d = imageView;
        this.e = textView2;
        this.f = eventListScoreTextView;
        this.g = eventListScoreTextView2;
        this.h = eventListScoreTextView3;
        this.i = imageView2;
        this.j = view;
        this.k = imageView3;
        this.l = imageView4;
        this.m = imageView5;
        this.n = textView3;
        this.o = eventListScoreTextView4;
        this.p = eventListScoreTextView5;
        this.q = eventListScoreTextView6;
        this.r = imageView6;
        this.s = eventListScoreTextView7;
        this.t = textView4;
    }

    public static qvk a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.viewholder_event_tennis, viewGroup, false);
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
                            i = R.id.first_team_score_game;
                            EventListScoreTextView eventListScoreTextView2 = (EventListScoreTextView) nq8.B(R.id.first_team_score_game, inflate);
                            if (eventListScoreTextView2 != null) {
                                i = R.id.first_team_score_set;
                                EventListScoreTextView eventListScoreTextView3 = (EventListScoreTextView) nq8.B(R.id.first_team_score_set, inflate);
                                if (eventListScoreTextView3 != null) {
                                    i = R.id.first_team_serve_indicator;
                                    ImageView imageView2 = (ImageView) nq8.B(R.id.first_team_serve_indicator, inflate);
                                    if (imageView2 != null) {
                                        i = R.id.highlight;
                                        View B2 = nq8.B(R.id.highlight, inflate);
                                        if (B2 != null) {
                                            i = R.id.indicator_crowdsourcing;
                                            ImageView imageView3 = (ImageView) nq8.B(R.id.indicator_crowdsourcing, inflate);
                                            if (imageView3 != null) {
                                                i = R.id.live_stream_indicator;
                                                ImageView imageView4 = (ImageView) nq8.B(R.id.live_stream_indicator, inflate);
                                                if (imageView4 != null) {
                                                    i = R.id.score_current_start_barrier;
                                                    if (((Barrier) nq8.B(R.id.score_current_start_barrier, inflate)) != null) {
                                                        i = R.id.score_game_start_barrier;
                                                        if (((Barrier) nq8.B(R.id.score_game_start_barrier, inflate)) != null) {
                                                            i = R.id.score_set_start_barrier;
                                                            if (((Barrier) nq8.B(R.id.score_set_start_barrier, inflate)) != null) {
                                                                i = R.id.second_team_logo;
                                                                ImageView imageView5 = (ImageView) nq8.B(R.id.second_team_logo, inflate);
                                                                if (imageView5 != null) {
                                                                    i = R.id.second_team_name;
                                                                    TextView textView3 = (TextView) nq8.B(R.id.second_team_name, inflate);
                                                                    if (textView3 != null) {
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
                                                                                    ImageView imageView6 = (ImageView) nq8.B(R.id.second_team_serve_indicator, inflate);
                                                                                    if (imageView6 != null) {
                                                                                        i = R.id.serve_indicator_start_barrier;
                                                                                        if (((Barrier) nq8.B(R.id.serve_indicator_start_barrier, inflate)) != null) {
                                                                                            i = R.id.time_lower;
                                                                                            EventListScoreTextView eventListScoreTextView7 = (EventListScoreTextView) nq8.B(R.id.time_lower, inflate);
                                                                                            if (eventListScoreTextView7 != null) {
                                                                                                i = R.id.time_upper;
                                                                                                TextView textView4 = (TextView) nq8.B(R.id.time_upper, inflate);
                                                                                                if (textView4 != null) {
                                                                                                    i = R.id.vertical_guideline_start;
                                                                                                    if (((Guideline) nq8.B(R.id.vertical_guideline_start, inflate)) != null) {
                                                                                                        return new qvk((ConstraintLayout) inflate, a, textView, imageView, textView2, eventListScoreTextView, eventListScoreTextView2, eventListScoreTextView3, imageView2, B2, imageView3, imageView4, imageView5, textView3, eventListScoreTextView4, eventListScoreTextView5, eventListScoreTextView6, imageView6, eventListScoreTextView7, textView4);
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
