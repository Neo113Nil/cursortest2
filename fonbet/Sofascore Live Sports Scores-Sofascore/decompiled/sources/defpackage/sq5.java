package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sq5 implements krk {
    public final ConstraintLayout a;
    public final TextView b;
    public final ImageView c;
    public final TextView d;
    public final ImageView e;
    public final TextView f;
    public final TextView g;

    public sq5(ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, ConstraintLayout constraintLayout) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = imageView;
        this.d = textView2;
        this.e = imageView2;
        this.f = textView3;
        this.g = textView4;
    }

    public static sq5 a(View view) {
        int i = R.id.diff_text;
        TextView textView = (TextView) nq8.B(R.id.diff_text, view);
        if (textView != null) {
            i = R.id.first_team_statistic_icon;
            ImageView imageView = (ImageView) nq8.B(R.id.first_team_statistic_icon, view);
            if (imageView != null) {
                i = R.id.first_team_stats;
                TextView textView2 = (TextView) nq8.B(R.id.first_team_stats, view);
                if (textView2 != null) {
                    i = R.id.second_team_statistic_icon;
                    ImageView imageView2 = (ImageView) nq8.B(R.id.second_team_statistic_icon, view);
                    if (imageView2 != null) {
                        i = R.id.second_team_stats;
                        TextView textView3 = (TextView) nq8.B(R.id.second_team_stats, view);
                        if (textView3 != null) {
                            i = R.id.stats_name;
                            TextView textView4 = (TextView) nq8.B(R.id.stats_name, view);
                            if (textView4 != null) {
                                return new sq5(imageView, imageView2, textView, textView2, textView3, textView4, (ConstraintLayout) view);
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
