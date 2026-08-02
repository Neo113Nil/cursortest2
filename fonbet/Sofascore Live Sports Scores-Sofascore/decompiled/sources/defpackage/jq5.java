package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jq5 implements krk {
    public final ConstraintLayout a;
    public final ImageView b;
    public final ImageView c;

    public jq5(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = imageView2;
    }

    public static jq5 a(View view) {
        int i = R.id.ban_indicator_corner_end;
        ImageView imageView = (ImageView) nq8.B(R.id.ban_indicator_corner_end, view);
        if (imageView != null) {
            i = R.id.hero_icon;
            ImageView imageView2 = (ImageView) nq8.B(R.id.hero_icon, view);
            if (imageView2 != null) {
                return new jq5((ConstraintLayout) view, imageView, imageView2);
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
