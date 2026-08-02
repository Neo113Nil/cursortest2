package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.sofascore.results.R;
import com.sofascore.results.view.SofascoreSmallRatingView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ss9 implements krk {
    public final ConstraintLayout a;
    public final View b;
    public final ImageView c;
    public final vy1 d;
    public final TextView e;
    public final TextView f;
    public final ImageView g;

    public ss9(ConstraintLayout constraintLayout, View view, ImageView imageView, vy1 vy1Var, TextView textView, TextView textView2, ImageView imageView2) {
        this.a = constraintLayout;
        this.b = view;
        this.c = imageView;
        this.d = vy1Var;
        this.e = textView;
        this.f = textView2;
        this.g = imageView2;
    }

    public static ss9 a(View view) {
        int i = R.id.barrier;
        if (((Barrier) nq8.B(R.id.barrier, view)) != null) {
            i = R.id.bottom_divider;
            View B = nq8.B(R.id.bottom_divider, view);
            if (B != null) {
                i = R.id.end_text;
                if (((TextView) nq8.B(R.id.end_text, view)) != null) {
                    i = R.id.end_text_bottom_image;
                    if (((ImageView) nq8.B(R.id.end_text_bottom_image, view)) != null) {
                        i = R.id.jersey_number_label;
                        if (((TextView) nq8.B(R.id.jersey_number_label, view)) != null) {
                            i = R.id.layout_image;
                            ImageView imageView = (ImageView) nq8.B(R.id.layout_image, view);
                            if (imageView != null) {
                                i = R.id.logo;
                                if (((ImageView) nq8.B(R.id.logo, view)) != null) {
                                    i = R.id.missing_player_layout;
                                    View B2 = nq8.B(R.id.missing_player_layout, view);
                                    if (B2 != null) {
                                        int i2 = R.id.image;
                                        if (((ImageView) nq8.B(R.id.image, B2)) != null) {
                                            i2 = R.id.label;
                                            if (((TextView) nq8.B(R.id.label, B2)) != null) {
                                                vy1 vy1Var = new vy1((LinearLayout) B2, 3);
                                                i = R.id.mvp_badge;
                                                if (((ShapeableImageView) nq8.B(R.id.mvp_badge, view)) != null) {
                                                    i = R.id.primary_label;
                                                    TextView textView = (TextView) nq8.B(R.id.primary_label, view);
                                                    if (textView != null) {
                                                        i = R.id.rating;
                                                        if (((SofascoreSmallRatingView) nq8.B(R.id.rating, view)) != null) {
                                                            i = R.id.secondary_label;
                                                            TextView textView2 = (TextView) nq8.B(R.id.secondary_label, view);
                                                            if (textView2 != null) {
                                                                i = R.id.secondary_label_icon;
                                                                ImageView imageView2 = (ImageView) nq8.B(R.id.secondary_label_icon, view);
                                                                if (imageView2 != null) {
                                                                    i = R.id.secondary_label_time;
                                                                    if (((TextView) nq8.B(R.id.secondary_label_time, view)) != null) {
                                                                        i = R.id.tertiary_label;
                                                                        if (((TextView) nq8.B(R.id.tertiary_label, view)) != null) {
                                                                            i = R.id.tertiary_label_icon;
                                                                            if (((ImageView) nq8.B(R.id.tertiary_label_icon, view)) != null) {
                                                                                i = R.id.tertiary_label_time;
                                                                                if (((TextView) nq8.B(R.id.tertiary_label_time, view)) != null) {
                                                                                    i = R.id.test_rating;
                                                                                    if (((SofascoreSmallRatingView) nq8.B(R.id.test_rating, view)) != null) {
                                                                                        return new ss9((ConstraintLayout) view, B, imageView, vy1Var, textView, textView2, imageView2);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        yhk.s("Missing required view with ID: ".concat(B2.getResources().getResourceName(i2)));
                                        return null;
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

    public static ss9 b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater.inflate(R.layout.image_label_rating_layout, viewGroup, false));
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
