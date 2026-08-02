package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class iq5 implements krk {
    public final /* synthetic */ int a;
    public final ConstraintLayout b;
    public final TextView c;
    public final TextView d;
    public final TextView e;

    public /* synthetic */ iq5(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, int i) {
        this.a = i;
        this.b = constraintLayout;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
    }

    public static iq5 a(View view) {
        int i = R.id.first_team_score;
        TextView textView = (TextView) nq8.B(R.id.first_team_score, view);
        if (textView != null) {
            i = R.id.period_name;
            TextView textView2 = (TextView) nq8.B(R.id.period_name, view);
            if (textView2 != null) {
                i = R.id.second_team_score;
                TextView textView3 = (TextView) nq8.B(R.id.second_team_score, view);
                if (textView3 != null) {
                    return new iq5((ConstraintLayout) view, textView, textView2, textView3, 0);
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }
}
