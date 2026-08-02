package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class o09 implements krk {
    public final LinearLayout a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final ImageView j;

    public o09(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, ImageView imageView) {
        this.a = linearLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = textView4;
        this.f = textView5;
        this.g = textView6;
        this.h = textView7;
        this.i = textView8;
        this.j = imageView;
    }

    public static o09 a(View view) {
        int i = R.id.count;
        TextView textView = (TextView) nq8.B(R.id.count, view);
        if (textView != null) {
            i = R.id.min15;
            TextView textView2 = (TextView) nq8.B(R.id.min15, view);
            if (textView2 != null) {
                i = R.id.min30;
                TextView textView3 = (TextView) nq8.B(R.id.min30, view);
                if (textView3 != null) {
                    i = R.id.min45;
                    TextView textView4 = (TextView) nq8.B(R.id.min45, view);
                    if (textView4 != null) {
                        i = R.id.min60;
                        TextView textView5 = (TextView) nq8.B(R.id.min60, view);
                        if (textView5 != null) {
                            i = R.id.min75;
                            TextView textView6 = (TextView) nq8.B(R.id.min75, view);
                            if (textView6 != null) {
                                i = R.id.min90;
                                TextView textView7 = (TextView) nq8.B(R.id.min90, view);
                                if (textView7 != null) {
                                    i = R.id.name;
                                    TextView textView8 = (TextView) nq8.B(R.id.name, view);
                                    if (textView8 != null) {
                                        i = R.id.team_logo;
                                        ImageView imageView = (ImageView) nq8.B(R.id.team_logo, view);
                                        if (imageView != null) {
                                            return new o09((LinearLayout) view, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, imageView);
                                        }
                                    }
                                }
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
