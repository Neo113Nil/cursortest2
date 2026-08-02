package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zxd implements krk {
    public final /* synthetic */ int a = 1;
    public final ConstraintLayout b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;
    public final TextView f;
    public final TextView g;
    public final ImageView h;
    public final TextView i;
    public final TextView j;

    public zxd(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, ImageView imageView, TextView textView6, ImageView imageView2) {
        this.b = constraintLayout;
        this.c = textView;
        this.d = textView2;
        this.f = textView3;
        this.g = textView4;
        this.i = textView5;
        this.e = imageView;
        this.j = textView6;
        this.h = imageView2;
    }

    public static zxd a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.ranking_row_two_columns_layout, viewGroup, false);
        int i = R.id.ranking_item_subtitle;
        TextView textView = (TextView) nq8.B(R.id.ranking_item_subtitle, inflate);
        if (textView != null) {
            i = R.id.ranking_item_title;
            TextView textView2 = (TextView) nq8.B(R.id.ranking_item_title, inflate);
            if (textView2 != null) {
                i = R.id.ranking_main_image;
                ImageView imageView = (ImageView) nq8.B(R.id.ranking_main_image, inflate);
                if (imageView != null) {
                    i = R.id.ranking_position;
                    TextView textView3 = (TextView) nq8.B(R.id.ranking_position, inflate);
                    if (textView3 != null) {
                        i = R.id.ranking_position_diff;
                        TextView textView4 = (TextView) nq8.B(R.id.ranking_position_diff, inflate);
                        if (textView4 != null) {
                            i = R.id.ranking_secondary_image;
                            ImageView imageView2 = (ImageView) nq8.B(R.id.ranking_secondary_image, inflate);
                            if (imageView2 != null) {
                                i = R.id.ranking_value_1;
                                TextView textView5 = (TextView) nq8.B(R.id.ranking_value_1, inflate);
                                if (textView5 != null) {
                                    i = R.id.ranking_value_2;
                                    TextView textView6 = (TextView) nq8.B(R.id.ranking_value_2, inflate);
                                    if (textView6 != null) {
                                        return new zxd((ConstraintLayout) inflate, textView, textView2, imageView, textView3, textView4, imageView2, textView5, textView6);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        switch (this.a) {
        }
        return this.b;
    }

    public zxd(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, TextView textView3, TextView textView4, ImageView imageView2, TextView textView5, TextView textView6) {
        this.b = constraintLayout;
        this.c = textView;
        this.d = textView2;
        this.e = imageView;
        this.f = textView3;
        this.g = textView4;
        this.h = imageView2;
        this.i = textView5;
        this.j = textView6;
    }
}
