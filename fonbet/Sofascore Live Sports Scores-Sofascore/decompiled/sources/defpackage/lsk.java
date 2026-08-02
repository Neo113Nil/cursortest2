package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import com.sofascore.results.view.header.widget.RollingTextView;
import com.sofascore.results.view.header.widget.TimerGoalAnimatedView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class lsk implements krk {
    public final ConstraintLayout a;
    public final TextView b;
    public final ImageView c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final ImageView g;
    public final RollingTextView h;
    public final RollingTextView i;
    public final TextView j;
    public final ImageView k;
    public final TimerGoalAnimatedView l;
    public final TimerGoalAnimatedView m;

    public lsk(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, ImageView imageView2, TextView textView2, TextView textView3, ImageView imageView3, RollingTextView rollingTextView, RollingTextView rollingTextView2, TextView textView4, ImageView imageView4, TimerGoalAnimatedView timerGoalAnimatedView, TimerGoalAnimatedView timerGoalAnimatedView2) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = imageView;
        this.d = imageView2;
        this.e = textView2;
        this.f = textView3;
        this.g = imageView3;
        this.h = rollingTextView;
        this.i = rollingTextView2;
        this.j = textView4;
        this.k = imageView4;
        this.l = timerGoalAnimatedView;
        this.m = timerGoalAnimatedView2;
    }

    public static lsk a(View view) {
        int i = R.id.aggregated_score;
        TextView textView = (TextView) nq8.B(R.id.aggregated_score, view);
        if (textView != null) {
            i = R.id.ball_indicator_first;
            ImageView imageView = (ImageView) nq8.B(R.id.ball_indicator_first, view);
            if (imageView != null) {
                i = R.id.ball_indicator_second;
                ImageView imageView2 = (ImageView) nq8.B(R.id.ball_indicator_second, view);
                if (imageView2 != null) {
                    i = R.id.crowdsourcing_text;
                    TextView textView2 = (TextView) nq8.B(R.id.crowdsourcing_text, view);
                    if (textView2 != null) {
                        i = R.id.extra_time_info;
                        TextView textView3 = (TextView) nq8.B(R.id.extra_time_info, view);
                        if (textView3 != null) {
                            i = R.id.first_team_win_indicator;
                            ImageView imageView3 = (ImageView) nq8.B(R.id.first_team_win_indicator, view);
                            if (imageView3 != null) {
                                i = R.id.score_first;
                                RollingTextView rollingTextView = (RollingTextView) nq8.B(R.id.score_first, view);
                                if (rollingTextView != null) {
                                    i = R.id.score_second;
                                    RollingTextView rollingTextView2 = (RollingTextView) nq8.B(R.id.score_second, view);
                                    if (rollingTextView2 != null) {
                                        i = R.id.score_slash;
                                        TextView textView4 = (TextView) nq8.B(R.id.score_slash, view);
                                        if (textView4 != null) {
                                            i = R.id.second_team_win_indicator;
                                            ImageView imageView4 = (ImageView) nq8.B(R.id.second_team_win_indicator, view);
                                            if (imageView4 != null) {
                                                i = R.id.secondary_score;
                                                TimerGoalAnimatedView timerGoalAnimatedView = (TimerGoalAnimatedView) nq8.B(R.id.secondary_score, view);
                                                if (timerGoalAnimatedView != null) {
                                                    i = R.id.secondary_score_label;
                                                    TimerGoalAnimatedView timerGoalAnimatedView2 = (TimerGoalAnimatedView) nq8.B(R.id.secondary_score_label, view);
                                                    if (timerGoalAnimatedView2 != null) {
                                                        return new lsk((ConstraintLayout) view, textView, imageView, imageView2, textView2, textView3, imageView3, rollingTextView, rollingTextView2, textView4, imageView4, timerGoalAnimatedView, timerGoalAnimatedView2);
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
