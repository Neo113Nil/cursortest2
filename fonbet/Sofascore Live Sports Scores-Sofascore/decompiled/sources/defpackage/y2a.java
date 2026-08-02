package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class y2a implements krk {
    public final LinearLayout a;
    public final TextView b;
    public final TextView c;

    public y2a(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.a = linearLayout;
        this.b = textView;
        this.c = textView2;
    }

    public static y2a a(View view) {
        int i = R.id.data;
        TextView textView = (TextView) nq8.B(R.id.data, view);
        if (textView != null) {
            i = R.id.label;
            TextView textView2 = (TextView) nq8.B(R.id.label, view);
            if (textView2 != null) {
                return new y2a((LinearLayout) view, textView, textView2);
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
