package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class w03 extends ot8 implements Function1 {
    public static final w03 b = new w03(1, msk.class, "bind", "bind(Landroid/view/View;)Lcom/sofascore/results/databinding/ViewEventResultCricketBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.cricket_score_divider;
        View B = nq8.B(R.id.cricket_score_divider, view);
        if (B != null) {
            i = R.id.inning_first_team_1;
            TextView textView = (TextView) nq8.B(R.id.inning_first_team_1, view);
            if (textView != null) {
                i = R.id.inning_first_team_2;
                TextView textView2 = (TextView) nq8.B(R.id.inning_first_team_2, view);
                if (textView2 != null) {
                    i = R.id.inning_second_team_1;
                    TextView textView3 = (TextView) nq8.B(R.id.inning_second_team_1, view);
                    if (textView3 != null) {
                        i = R.id.inning_second_team_2;
                        TextView textView4 = (TextView) nq8.B(R.id.inning_second_team_2, view);
                        if (textView4 != null) {
                            i = R.id.left_result;
                            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.left_result, view);
                            if (linearLayout != null) {
                                i = R.id.overs_first_team;
                                TextView textView5 = (TextView) nq8.B(R.id.overs_first_team, view);
                                if (textView5 != null) {
                                    i = R.id.overs_second_team;
                                    TextView textView6 = (TextView) nq8.B(R.id.overs_second_team, view);
                                    if (textView6 != null) {
                                        i = R.id.right_result;
                                        LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.right_result, view);
                                        if (linearLayout2 != null) {
                                            return new msk((ConstraintLayout) view, B, textView, textView2, textView3, textView4, linearLayout, textView5, textView6, linearLayout2);
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
}
