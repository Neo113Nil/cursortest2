package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class psk implements krk {
    public final ConstraintLayout a;
    public final TextView b;
    public final TextView c;

    public psk(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = textView2;
    }

    public static psk a(View view) {
        int i = R.id.barrier;
        if (((Barrier) nq8.B(R.id.barrier, view)) != null) {
            i = R.id.primary_label;
            TextView textView = (TextView) nq8.B(R.id.primary_label, view);
            if (textView != null) {
                i = R.id.secondary_label;
                TextView textView2 = (TextView) nq8.B(R.id.secondary_label, view);
                if (textView2 != null) {
                    return new psk((ConstraintLayout) view, textView, textView2);
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
