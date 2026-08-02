package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class av1 implements krk {
    public final /* synthetic */ int a;
    public final LinearLayout b;
    public final ImageView c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;

    public av1(LinearLayout linearLayout, TextView textView, TextView textView2, ImageView imageView, ImageView imageView2) {
        this.a = 2;
        this.b = linearLayout;
        this.e = textView;
        this.f = textView2;
        this.c = imageView;
        this.d = imageView2;
    }

    public static av1 a(View view) {
        int i = R.id.header_text;
        TextView textView = (TextView) nq8.B(R.id.header_text, view);
        if (textView != null) {
            i = R.id.info_text;
            TextView textView2 = (TextView) nq8.B(R.id.info_text, view);
            if (textView2 != null) {
                i = R.id.league_icon;
                ImageView imageView = (ImageView) nq8.B(R.id.league_icon, view);
                if (imageView != null) {
                    i = R.id.weekly_streak_icon;
                    ImageView imageView2 = (ImageView) nq8.B(R.id.weekly_streak_icon, view);
                    if (imageView2 != null) {
                        return new av1((LinearLayout) view, textView, textView2, imageView, imageView2);
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

    public /* synthetic */ av1(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, int i) {
        this.a = i;
        this.b = linearLayout;
        this.c = imageView;
        this.d = imageView2;
        this.e = textView;
        this.f = textView2;
    }
}
