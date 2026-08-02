package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.divider.MaterialDivider;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Score;
import com.sofascore.model.mvvm.model.ServableEvent;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yc4 extends o8 implements go1 {
    public final bu1 d;
    public final int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc4(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.divider;
        if (((MaterialDivider) nq8.B(R.id.divider, root)) != null) {
            i = R.id.label_legs;
            if (((TextView) nq8.B(R.id.label_legs, root)) != null) {
                i = R.id.label_pts;
                if (((TextView) nq8.B(R.id.label_pts, root)) != null) {
                    i = R.id.label_sets;
                    TextView textView = (TextView) nq8.B(R.id.label_sets, root);
                    if (textView != null) {
                        i = R.id.name_1;
                        TextView textView2 = (TextView) nq8.B(R.id.name_1, root);
                        if (textView2 != null) {
                            i = R.id.name_2;
                            TextView textView3 = (TextView) nq8.B(R.id.name_2, root);
                            if (textView3 != null) {
                                i = R.id.value_legs_1;
                                TextView textView4 = (TextView) nq8.B(R.id.value_legs_1, root);
                                if (textView4 != null) {
                                    i = R.id.value_legs_2;
                                    TextView textView5 = (TextView) nq8.B(R.id.value_legs_2, root);
                                    if (textView5 != null) {
                                        i = R.id.value_points_1;
                                        TextView textView6 = (TextView) nq8.B(R.id.value_points_1, root);
                                        if (textView6 != null) {
                                            i = R.id.value_points_2;
                                            TextView textView7 = (TextView) nq8.B(R.id.value_points_2, root);
                                            if (textView7 != null) {
                                                i = R.id.value_sets_1;
                                                TextView textView8 = (TextView) nq8.B(R.id.value_sets_1, root);
                                                if (textView8 != null) {
                                                    i = R.id.value_sets_2;
                                                    TextView textView9 = (TextView) nq8.B(R.id.value_sets_2, root);
                                                    if (textView9 != null) {
                                                        this.d = new bu1((ConstraintLayout) root, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
                                                        this.e = ao2.s(16, context);
                                                        setVisibility(8);
                                                        return;
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
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.go1
    public final void a(Event event) {
        Integer valueOf = Integer.valueOf(R.drawable.ic_dart_16);
        boolean z = (!ok3.D(event) || Event.getHomeScore$default(event, null, 1, null).getPoint() == null || Event.getAwayScore$default(event, null, 1, null).getPoint() == null) ? false : true;
        setVisibility(z ? 0 : 8);
        if (z) {
            bu1 bu1Var = this.d;
            TextView textView = (TextView) bu1Var.g;
            TextView textView2 = (TextView) bu1Var.k;
            TextView textView3 = (TextView) bu1Var.j;
            TextView textView4 = (TextView) bu1Var.c;
            Team homeTeam$default = Event.getHomeTeam$default(event, null, 1, null);
            Context context = getContext();
            context.getClass();
            textView.setText(tba.p(context, homeTeam$default));
            Team awayTeam$default = Event.getAwayTeam$default(event, null, 1, null);
            Context context2 = getContext();
            context2.getClass();
            textView4.setText(tba.p(context2, awayTeam$default));
            Integer firstToServe$default = ServableEvent.getFirstToServe$default((ServableEvent) event, null, 1, null);
            TextView textView5 = (TextView) bu1Var.g;
            Integer num = (firstToServe$default != null && firstToServe$default.intValue() == 1) ? valueOf : null;
            ua5 ua5Var = ua5.b;
            int i = this.e;
            haa.L(textView5, num, ua5Var, Integer.valueOf(i));
            if (firstToServe$default == null || firstToServe$default.intValue() != 2) {
                valueOf = null;
            }
            haa.L(textView4, valueOf, ua5Var, Integer.valueOf(i));
            boolean B = ok3.B(event);
            Score homeScore$default = Event.getHomeScore$default(event, null, 1, null);
            ((TextView) bu1Var.i).setText(homeScore$default.getPoint());
            ((TextView) bu1Var.f).setText(y6a.C(homeScore$default, B));
            Score awayScore$default = Event.getAwayScore$default(event, null, 1, null);
            ((TextView) bu1Var.d).setText(awayScore$default.getPoint());
            ((TextView) bu1Var.h).setText(y6a.C(awayScore$default, B));
            ((TextView) bu1Var.e).setVisibility(!B ? 4 : 0);
            textView3.setVisibility(!B ? 4 : 0);
            textView2.setVisibility(B ? 0 : 4);
            if (B) {
                textView3.setText(String.valueOf(yid.m(homeScore$default.getDisplay())));
                textView2.setText(String.valueOf(yid.m(awayScore$default.getDisplay())));
            }
        }
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.darts_table_score_view;
    }
}
