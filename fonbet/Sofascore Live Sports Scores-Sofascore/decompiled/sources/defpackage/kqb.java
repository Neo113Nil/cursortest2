package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import com.sofascore.results.view.BellButton;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kqb implements krk {
    public final /* synthetic */ int a;
    public final ConstraintLayout b;
    public final ImageView c;
    public final TextView d;

    public kqb(ConstraintLayout constraintLayout, BellButton bellButton, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.a = 2;
        this.b = constraintLayout;
        this.c = imageView;
        this.d = textView3;
    }

    public static kqb a(View view) {
        int i = R.id.header_icon;
        ImageView imageView = (ImageView) nq8.B(R.id.header_icon, view);
        if (imageView != null) {
            i = R.id.header_title;
            TextView textView = (TextView) nq8.B(R.id.header_title, view);
            if (textView != null) {
                return new kqb((ConstraintLayout) view, imageView, textView, 0);
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static kqb b(View view) {
        int i = R.id.sub_section_icon;
        ImageView imageView = (ImageView) nq8.B(R.id.sub_section_icon, view);
        if (imageView != null) {
            i = R.id.sub_section_title;
            TextView textView = (TextView) nq8.B(R.id.sub_section_title, view);
            if (textView != null) {
                return new kqb((ConstraintLayout) view, imageView, textView, 3);
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static kqb c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return b(layoutInflater.inflate(R.layout.sub_section_left_with_icon, viewGroup, false));
    }

    public static kqb d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.main_section_center_with_icon, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // defpackage.krk
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }

    public /* synthetic */ kqb(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, int i) {
        this.a = i;
        this.b = constraintLayout;
        this.c = imageView;
        this.d = textView;
    }
}
