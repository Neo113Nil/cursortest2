package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nq5 implements krk {
    public final ConstraintLayout a;
    public final TextView b;
    public final ImageView c;

    public nq5(ImageView imageView, TextView textView, ConstraintLayout constraintLayout) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = imageView;
    }

    public static nq5 a(View view) {
        int i = R.id.objective_count;
        TextView textView = (TextView) nq8.B(R.id.objective_count, view);
        if (textView != null) {
            i = R.id.objective_icon;
            ImageView imageView = (ImageView) nq8.B(R.id.objective_icon, view);
            if (imageView != null) {
                return new nq5(imageView, textView, (ConstraintLayout) view);
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
