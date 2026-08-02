package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lqb implements krk {
    public final ConstraintLayout a;
    public final ImageView b;
    public final TextView c;

    public lqb(ImageView imageView, TextView textView, ConstraintLayout constraintLayout) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = textView;
    }

    public static lqb a(View view) {
        int i = R.id.header_icon;
        ImageView imageView = (ImageView) nq8.B(R.id.header_icon, view);
        if (imageView != null) {
            i = R.id.header_title;
            TextView textView = (TextView) nq8.B(R.id.header_title, view);
            if (textView != null) {
                return new lqb(imageView, textView, (ConstraintLayout) view);
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
