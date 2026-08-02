package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vba implements krk {
    public final ConstraintLayout a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final LinearLayout e;

    public vba(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = linearLayout;
    }

    public static vba a(View view) {
        int i = R.id.statistic_label;
        TextView textView = (TextView) nq8.B(R.id.statistic_label, view);
        if (textView != null) {
            i = R.id.statistic_rank;
            TextView textView2 = (TextView) nq8.B(R.id.statistic_rank, view);
            if (textView2 != null) {
                i = R.id.statistic_value;
                TextView textView3 = (TextView) nq8.B(R.id.statistic_value, view);
                if (textView3 != null) {
                    i = R.id.statistics_container;
                    LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.statistics_container, view);
                    if (linearLayout != null) {
                        return new vba((ConstraintLayout) view, textView, textView2, textView3, linearLayout);
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
