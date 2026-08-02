package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class m8g implements krk {
    public final LinearLayout a;
    public final View b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;

    public m8g(LinearLayout linearLayout, View view, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.a = linearLayout;
        this.b = view;
        this.c = imageView;
        this.d = textView;
        this.e = textView2;
        this.f = textView3;
    }

    public static m8g a(View view) {
        int i = R.id.barrier;
        View B = nq8.B(R.id.barrier, view);
        if (B != null) {
            i = R.id.change_vote_icon;
            ImageView imageView = (ImageView) nq8.B(R.id.change_vote_icon, view);
            if (imageView != null) {
                i = R.id.prediction_type;
                TextView textView = (TextView) nq8.B(R.id.prediction_type, view);
                if (textView != null) {
                    i = R.id.profile_choice_icon;
                    TextView textView2 = (TextView) nq8.B(R.id.profile_choice_icon, view);
                    if (textView2 != null) {
                        i = R.id.profile_choice_odds;
                        TextView textView3 = (TextView) nq8.B(R.id.profile_choice_odds, view);
                        if (textView3 != null) {
                            return new m8g((LinearLayout) view, B, imageView, textView, textView2, textView3);
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
