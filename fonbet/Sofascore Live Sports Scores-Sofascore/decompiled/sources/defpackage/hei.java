package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import com.sofascore.results.view.SofascoreRatingView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hei implements krk {
    public final ConstraintLayout a;
    public final View b;
    public final TextView c;
    public final SofascoreRatingView d;

    public hei(ConstraintLayout constraintLayout, View view, TextView textView, SofascoreRatingView sofascoreRatingView) {
        this.a = constraintLayout;
        this.b = view;
        this.c = textView;
        this.d = sofascoreRatingView;
    }

    public static hei a(View view) {
        int i = R.id.bottom_divider;
        View B = nq8.B(R.id.bottom_divider, view);
        if (B != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i2 = R.id.label_primary;
            TextView textView = (TextView) nq8.B(R.id.label_primary, view);
            if (textView != null) {
                i2 = R.id.label_secondary;
                if (((TextView) nq8.B(R.id.label_secondary, view)) != null) {
                    i2 = R.id.rating;
                    SofascoreRatingView sofascoreRatingView = (SofascoreRatingView) nq8.B(R.id.rating, view);
                    if (sofascoreRatingView != null) {
                        return new hei(constraintLayout, B, textView, sofascoreRatingView);
                    }
                }
            }
            i = i2;
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
