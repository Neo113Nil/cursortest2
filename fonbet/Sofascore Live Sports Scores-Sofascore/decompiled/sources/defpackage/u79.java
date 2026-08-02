package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class u79 implements krk {
    public final /* synthetic */ int a = 1;
    public final ConstraintLayout b;
    public final View c;
    public final View d;
    public final ImageView e;
    public final ImageView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final TextView k;

    public u79(ConstraintLayout constraintLayout, View view, ImageView imageView, TextView textView, View view2, ImageView imageView2, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.b = constraintLayout;
        this.c = view;
        this.e = imageView;
        this.g = textView;
        this.d = view2;
        this.f = imageView2;
        this.h = textView2;
        this.i = textView3;
        this.j = textView4;
        this.k = textView5;
    }

    public static u79 a(View view) {
        int i = R.id.first_team_click_area;
        View B = nq8.B(R.id.first_team_click_area, view);
        if (B != null) {
            i = R.id.first_team_image;
            ImageView imageView = (ImageView) nq8.B(R.id.first_team_image, view);
            if (imageView != null) {
                i = R.id.first_team_name;
                TextView textView = (TextView) nq8.B(R.id.first_team_name, view);
                if (textView != null) {
                    i = R.id.second_team_click_area;
                    View B2 = nq8.B(R.id.second_team_click_area, view);
                    if (B2 != null) {
                        i = R.id.second_team_image;
                        ImageView imageView2 = (ImageView) nq8.B(R.id.second_team_image, view);
                        if (imageView2 != null) {
                            i = R.id.second_team_name;
                            TextView textView2 = (TextView) nq8.B(R.id.second_team_name, view);
                            if (textView2 != null) {
                                i = R.id.value_1;
                                TextView textView3 = (TextView) nq8.B(R.id.value_1, view);
                                if (textView3 != null) {
                                    i = R.id.value_2;
                                    TextView textView4 = (TextView) nq8.B(R.id.value_2, view);
                                    if (textView4 != null) {
                                        i = R.id.value_X;
                                        TextView textView5 = (TextView) nq8.B(R.id.value_X, view);
                                        if (textView5 != null) {
                                            return new u79((ConstraintLayout) view, B, imageView, textView, B2, imageView2, textView2, textView3, textView4, textView5);
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
        int i = this.a;
        return this.b;
    }

    public u79(ConstraintLayout constraintLayout, View view, View view2, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.b = constraintLayout;
        this.c = view;
        this.d = view2;
        this.e = imageView;
        this.f = imageView2;
        this.g = textView;
        this.h = textView2;
        this.i = textView3;
        this.j = textView4;
        this.k = textView5;
    }
}
