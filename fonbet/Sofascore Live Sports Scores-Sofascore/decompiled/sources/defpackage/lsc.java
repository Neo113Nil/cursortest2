package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lsc implements krk {
    public final FrameLayout a;
    public final TextView b;
    public final LinearLayout c;
    public final TextView d;

    public lsc(FrameLayout frameLayout, LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.a = frameLayout;
        this.b = textView;
        this.c = linearLayout;
        this.d = textView2;
    }

    public static lsc a(View view) {
        int i = R.id.description;
        TextView textView = (TextView) nq8.B(R.id.description, view);
        if (textView != null) {
            i = R.id.view_container;
            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.view_container, view);
            if (linearLayout != null) {
                i = R.id.win_type;
                TextView textView2 = (TextView) nq8.B(R.id.win_type, view);
                if (textView2 != null) {
                    return new lsc((FrameLayout) view, linearLayout, textView, textView2);
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
