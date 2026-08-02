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
public final class cv1 implements krk {
    public final /* synthetic */ int a;
    public final ConstraintLayout b;
    public final ImageView c;
    public final TextView d;
    public final ImageView e;
    public final TextView f;

    public cv1(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2) {
        this.a = 7;
        this.b = constraintLayout;
        this.c = imageView;
        this.d = textView;
        this.f = textView2;
        this.e = imageView2;
    }

    public static cv1 a(View view) {
        int i = R.id.country_image;
        ImageView imageView = (ImageView) nq8.B(R.id.country_image, view);
        if (imageView != null) {
            i = R.id.driver_image;
            ImageView imageView2 = (ImageView) nq8.B(R.id.driver_image, view);
            if (imageView2 != null) {
                i = R.id.driver_name;
                TextView textView = (TextView) nq8.B(R.id.driver_name, view);
                if (textView != null) {
                    i = R.id.driver_number;
                    TextView textView2 = (TextView) nq8.B(R.id.driver_number, view);
                    if (textView2 != null) {
                        return new cv1((ConstraintLayout) view, imageView, imageView2, textView, textView2, 2);
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static cv1 b(View view) {
        int i = R.id.image_first_team_team;
        ImageView imageView = (ImageView) nq8.B(R.id.image_first_team_team, view);
        if (imageView != null) {
            i = R.id.image_second_team_team;
            ImageView imageView2 = (ImageView) nq8.B(R.id.image_second_team_team, view);
            if (imageView2 != null) {
                i = R.id.text_first_team_score;
                TextView textView = (TextView) nq8.B(R.id.text_first_team_score, view);
                if (textView != null) {
                    i = R.id.text_second_team_score;
                    TextView textView2 = (TextView) nq8.B(R.id.text_second_team_score, view);
                    if (textView2 != null) {
                        return new cv1((ConstraintLayout) view, imageView, imageView2, textView, textView2, 3);
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static cv1 c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.summary_info_label_row_layout, viewGroup, false);
        viewGroup.addView(inflate);
        int i = R.id.arrow_icon;
        ImageView imageView = (ImageView) nq8.B(R.id.arrow_icon, inflate);
        if (imageView != null) {
            i = R.id.info_icon;
            ImageView imageView2 = (ImageView) nq8.B(R.id.info_icon, inflate);
            if (imageView2 != null) {
                i = R.id.label;
                TextView textView = (TextView) nq8.B(R.id.label, inflate);
                if (textView != null) {
                    i = R.id.label_action;
                    TextView textView2 = (TextView) nq8.B(R.id.label_action, inflate);
                    if (textView2 != null) {
                        return new cv1((ConstraintLayout) inflate, imageView, imageView2, textView, textView2, 4);
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public static cv1 d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.summary_info_row_subtitle_title, viewGroup, false);
        viewGroup.addView(inflate);
        int i = R.id.arrow_icon;
        ImageView imageView = (ImageView) nq8.B(R.id.arrow_icon, inflate);
        if (imageView != null) {
            i = R.id.info_icon;
            ImageView imageView2 = (ImageView) nq8.B(R.id.info_icon, inflate);
            if (imageView2 != null) {
                i = R.id.text_lower;
                TextView textView = (TextView) nq8.B(R.id.text_lower, inflate);
                if (textView != null) {
                    i = R.id.text_upper;
                    TextView textView2 = (TextView) nq8.B(R.id.text_upper, inflate);
                    if (textView2 != null) {
                        return new cv1((ConstraintLayout) inflate, imageView, imageView2, textView, textView2, 5);
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public static cv1 e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.summary_info_row_title_subtitle, viewGroup, false);
        viewGroup.addView(inflate);
        int i = R.id.arrow_icon;
        ImageView imageView = (ImageView) nq8.B(R.id.arrow_icon, inflate);
        if (imageView != null) {
            i = R.id.info_icon;
            ImageView imageView2 = (ImageView) nq8.B(R.id.info_icon, inflate);
            if (imageView2 != null) {
                i = R.id.text_lower;
                TextView textView = (TextView) nq8.B(R.id.text_lower, inflate);
                if (textView != null) {
                    i = R.id.text_upper;
                    TextView textView2 = (TextView) nq8.B(R.id.text_upper, inflate);
                    if (textView2 != null) {
                        return new cv1((ConstraintLayout) inflate, imageView, imageView2, textView, textView2, 6);
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }

    public /* synthetic */ cv1(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ImageView imageView2, TextView textView2, int i) {
        this.a = i;
        this.b = constraintLayout;
        this.c = imageView;
        this.d = textView;
        this.e = imageView2;
        this.f = textView2;
    }

    public /* synthetic */ cv1(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, int i) {
        this.a = i;
        this.b = constraintLayout;
        this.c = imageView;
        this.e = imageView2;
        this.d = textView;
        this.f = textView2;
    }
}
