package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jlc implements krk {
    public final FrameLayout a;
    public final TextView b;
    public final TextView c;
    public final LinearLayout d;

    public jlc(FrameLayout frameLayout, LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.a = frameLayout;
        this.b = textView;
        this.c = textView2;
        this.d = linearLayout;
    }

    public static jlc a(View view) {
        int i = R.id.description;
        TextView textView = (TextView) nq8.B(R.id.description, view);
        if (textView != null) {
            i = R.id.main_text;
            TextView textView2 = (TextView) nq8.B(R.id.main_text, view);
            if (textView2 != null) {
                i = R.id.view_container;
                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.view_container, view);
                if (linearLayout != null) {
                    return new jlc((FrameLayout) view, linearLayout, textView, textView2);
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
