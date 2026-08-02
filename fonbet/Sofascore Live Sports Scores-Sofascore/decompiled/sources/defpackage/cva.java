package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cva implements krk {
    public final /* synthetic */ int a = 0;
    public final LinearLayout b;
    public final TextView c;
    public final LinearLayout d;

    public cva(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView) {
        this.b = linearLayout;
        this.d = linearLayout2;
        this.c = textView;
    }

    public static cva a(View view) {
        int i = R.id.container;
        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.container, view);
        if (linearLayout != null) {
            i = R.id.subtitle;
            TextView textView = (TextView) nq8.B(R.id.subtitle, view);
            if (textView != null) {
                return new cva((LinearLayout) view, linearLayout, textView);
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        switch (this.a) {
        }
        return this.b;
    }

    public cva(LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2) {
        this.b = linearLayout;
        this.c = textView;
        this.d = linearLayout2;
    }
}
