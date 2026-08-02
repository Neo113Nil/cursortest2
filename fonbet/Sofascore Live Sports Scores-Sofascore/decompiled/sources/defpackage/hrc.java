package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hrc implements krk {
    public final ConstraintLayout a;
    public final TextView b;
    public final Group c;
    public final TextView d;
    public final View e;

    public hrc(ConstraintLayout constraintLayout, TextView textView, Group group, TextView textView2, View view) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = group;
        this.d = textView2;
        this.e = view;
    }

    public static hrc a(View view) {
        int i = R.id.barrier;
        if (((Barrier) nq8.B(R.id.barrier, view)) != null) {
            i = R.id.fraction_denominator;
            TextView textView = (TextView) nq8.B(R.id.fraction_denominator, view);
            if (textView != null) {
                i = R.id.fraction_group;
                Group group = (Group) nq8.B(R.id.fraction_group, view);
                if (group != null) {
                    i = R.id.fraction_numerator;
                    TextView textView2 = (TextView) nq8.B(R.id.fraction_numerator, view);
                    if (textView2 != null) {
                        i = R.id.highlight;
                        View B = nq8.B(R.id.highlight, view);
                        if (B != null) {
                            i = R.id.slash;
                            if (((TextView) nq8.B(R.id.slash, view)) != null) {
                                return new hrc((ConstraintLayout) view, textView, group, textView2, B);
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
