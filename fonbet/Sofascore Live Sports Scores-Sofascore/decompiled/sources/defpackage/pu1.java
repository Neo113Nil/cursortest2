package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pu1 implements krk {
    public final /* synthetic */ int a;
    public final LinearLayout b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;

    public pu1(LinearLayout linearLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.a = 3;
        this.b = linearLayout;
        this.d = textView;
        this.c = imageView;
        this.e = textView2;
    }

    public static pu1 a(View view) {
        int i = R.id.arrow;
        ImageView imageView = (ImageView) nq8.B(R.id.arrow, view);
        if (imageView != null) {
            i = R.id.odds_choice_text;
            TextView textView = (TextView) nq8.B(R.id.odds_choice_text, view);
            if (textView != null) {
                i = R.id.odds_choice_value;
                TextView textView2 = (TextView) nq8.B(R.id.odds_choice_value, view);
                if (textView2 != null) {
                    return new pu1((LinearLayout) view, imageView, textView, textView2, 2);
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static pu1 b(View view) {
        int i = R.id.legend_category_text;
        TextView textView = (TextView) nq8.B(R.id.legend_category_text, view);
        if (textView != null) {
            i = R.id.legend_color;
            ImageView imageView = (ImageView) nq8.B(R.id.legend_color, view);
            if (imageView != null) {
                i = R.id.legend_value_text;
                TextView textView2 = (TextView) nq8.B(R.id.legend_value_text, view);
                if (textView2 != null) {
                    return new pu1((LinearLayout) view, textView, imageView, textView2);
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

    public /* synthetic */ pu1(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, int i) {
        this.a = i;
        this.b = linearLayout;
        this.c = imageView;
        this.d = textView;
        this.e = textView2;
    }
}
