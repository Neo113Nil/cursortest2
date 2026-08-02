package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rua implements krk {
    public final LinearLayout a;
    public final ImageView b;
    public final TextView c;

    public rua(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.a = linearLayout;
        this.b = imageView;
        this.c = textView;
    }

    public static rua a(View view) {
        int i = R.id.league_info_image;
        ImageView imageView = (ImageView) nq8.B(R.id.league_info_image, view);
        if (imageView != null) {
            i = R.id.league_info_text;
            TextView textView = (TextView) nq8.B(R.id.league_info_text, view);
            if (textView != null) {
                return new rua((LinearLayout) view, imageView, textView);
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
