package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yue implements krk {
    public final LinearLayout a;
    public final TextView b;

    public yue(LinearLayout linearLayout, TextView textView) {
        this.a = linearLayout;
        this.b = textView;
    }

    public static yue a(View view) {
        TextView textView = (TextView) nq8.B(R.id.position, view);
        if (textView != null) {
            return new yue((LinearLayout) view, textView);
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.position)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
