package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dk2 implements krk {
    public final /* synthetic */ int a;
    public final LinearLayout b;
    public final TextView c;

    public dk2(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.a = 4;
        this.b = linearLayout;
        this.c = textView2;
    }

    public static dk2 a(View view) {
        int i = R.id.message;
        TextView textView = (TextView) nq8.B(R.id.message, view);
        if (textView != null) {
            i = R.id.progress_bar;
            if (((CircularProgressIndicator) nq8.B(R.id.progress_bar, view)) != null) {
                return new dk2((LinearLayout) view, textView, 8);
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static dk2 b(View view) {
        int i = R.id.image;
        if (((ImageView) nq8.B(R.id.image, view)) != null) {
            i = R.id.image_click;
            if (((LinearLayout) nq8.B(R.id.image_click, view)) != null) {
                i = R.id.title;
                TextView textView = (TextView) nq8.B(R.id.title, view);
                if (textView != null) {
                    return new dk2((LinearLayout) view, textView, 12);
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static dk2 c(LayoutInflater layoutInflater) {
        return a(layoutInflater.inflate(R.layout.progress_bar_view, (ViewGroup) null, false));
    }

    public static dk2 d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.subtitle_micro_left_with_icon, viewGroup, false);
        int i = R.id.image;
        if (((ImageView) nq8.B(R.id.image, inflate)) != null) {
            i = R.id.image_click;
            if (((LinearLayout) nq8.B(R.id.image_click, inflate)) != null) {
                i = R.id.title;
                TextView textView = (TextView) nq8.B(R.id.title, inflate);
                if (textView != null) {
                    return new dk2((LinearLayout) inflate, textView, 11);
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

    public /* synthetic */ dk2(LinearLayout linearLayout, TextView textView, int i) {
        this.a = i;
        this.b = linearLayout;
        this.c = textView;
    }
}
