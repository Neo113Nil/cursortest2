package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pn2 implements krk {
    public final /* synthetic */ int a;
    public final LinearLayout b;
    public final ImageView c;
    public final ImageView d;
    public final TextView e;

    public pn2(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, TextView textView) {
        this.a = 1;
        this.b = linearLayout;
        this.c = imageView;
        this.d = imageView2;
        this.e = textView;
    }

    public static pn2 a(View view) {
        int i = R.id.arrow;
        ImageView imageView = (ImageView) nq8.B(R.id.arrow, view);
        if (imageView != null) {
            i = R.id.tournament_logo;
            ImageView imageView2 = (ImageView) nq8.B(R.id.tournament_logo, view);
            if (imageView2 != null) {
                i = R.id.tournament_name;
                TextView textView = (TextView) nq8.B(R.id.tournament_name, view);
                if (textView != null) {
                    return new pn2((LinearLayout) view, imageView, imageView2, textView);
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

    public /* synthetic */ pn2(LinearLayout linearLayout, ImageView imageView, TextView textView, ImageView imageView2, int i) {
        this.a = i;
        this.b = linearLayout;
        this.c = imageView;
        this.e = textView;
        this.d = imageView2;
    }
}
