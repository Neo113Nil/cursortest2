package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vz9 implements krk {
    public final ConstraintLayout a;
    public final ImageView b;
    public final View c;
    public final View d;
    public final View e;
    public final View f;
    public final TextView g;
    public final View h;

    public vz9(ConstraintLayout constraintLayout, ImageView imageView, View view, View view2, View view3, View view4, TextView textView, View view5) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = view;
        this.d = view2;
        this.e = view3;
        this.f = view4;
        this.g = textView;
        this.h = view5;
    }

    public static vz9 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.incident_period_layout, viewGroup, false);
        int i = R.id.arrow;
        ImageView imageView = (ImageView) nq8.B(R.id.arrow, inflate);
        if (imageView != null) {
            i = R.id.divider_group;
            if (((Group) nq8.B(R.id.divider_group, inflate)) != null) {
                i = R.id.divider_left;
                View B = nq8.B(R.id.divider_left, inflate);
                if (B != null) {
                    i = R.id.divider_left_vertical;
                    View B2 = nq8.B(R.id.divider_left_vertical, inflate);
                    if (B2 != null) {
                        i = R.id.divider_right;
                        View B3 = nq8.B(R.id.divider_right, inflate);
                        if (B3 != null) {
                            i = R.id.divider_right_vertical;
                            View B4 = nq8.B(R.id.divider_right_vertical, inflate);
                            if (B4 != null) {
                                i = R.id.period_text;
                                TextView textView = (TextView) nq8.B(R.id.period_text, inflate);
                                if (textView != null) {
                                    i = R.id.spacer_bottom;
                                    View B5 = nq8.B(R.id.spacer_bottom, inflate);
                                    if (B5 != null) {
                                        i = R.id.text_layout;
                                        if (((LinearLayout) nq8.B(R.id.text_layout, inflate)) != null) {
                                            return new vz9((ConstraintLayout) inflate, imageView, B, B2, B3, B4, textView, B5);
                                        }
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
        return this.a;
    }
}
