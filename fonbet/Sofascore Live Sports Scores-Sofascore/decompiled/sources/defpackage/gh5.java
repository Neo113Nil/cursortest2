package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gh5 implements krk {
    public final /* synthetic */ int a;
    public final LinearLayout b;
    public final ImageView c;
    public final TextView d;

    public /* synthetic */ gh5(LinearLayout linearLayout, ImageView imageView, TextView textView, int i) {
        this.a = i;
        this.b = linearLayout;
        this.c = imageView;
        this.d = textView;
    }

    public static gh5 a(View view) {
        int i = R.id.team_logo;
        ImageView imageView = (ImageView) nq8.B(R.id.team_logo, view);
        if (imageView != null) {
            i = R.id.team_name;
            TextView textView = (TextView) nq8.B(R.id.team_name, view);
            if (textView != null) {
                return new gh5((LinearLayout) view, imageView, textView, 0);
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static gh5 b(View view) {
        int i = R.id.icon;
        ImageView imageView = (ImageView) nq8.B(R.id.icon, view);
        if (imageView != null) {
            i = R.id.label;
            TextView textView = (TextView) nq8.B(R.id.label, view);
            if (textView != null) {
                return new gh5((LinearLayout) view, imageView, textView, 1);
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static gh5 c(View view) {
        int i = R.id.icon_info;
        ImageView imageView = (ImageView) nq8.B(R.id.icon_info, view);
        if (imageView != null) {
            i = R.id.information_text;
            TextView textView = (TextView) nq8.B(R.id.information_text, view);
            if (textView != null) {
                return new gh5((LinearLayout) view, imageView, textView, 6);
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        switch (this.a) {
        }
        return this.b;
    }

    public /* synthetic */ gh5(LinearLayout linearLayout, TextView textView, ImageView imageView, int i) {
        this.a = i;
        this.b = linearLayout;
        this.d = textView;
        this.c = imageView;
    }
}
