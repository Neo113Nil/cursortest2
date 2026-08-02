package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class j99 implements krk {
    public final FrameLayout a;
    public final ConstraintLayout b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;

    public j99(FrameLayout frameLayout, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3) {
        this.a = frameLayout;
        this.b = constraintLayout;
        this.c = imageView;
        this.d = imageView2;
        this.e = imageView3;
    }

    public static j99 a(View view) {
        int i = R.id.field_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.field_container, view);
        if (constraintLayout != null) {
            i = R.id.field_lines;
            if (((ImageView) nq8.B(R.id.field_lines, view)) != null) {
                i = R.id.heat_map;
                ImageView imageView = (ImageView) nq8.B(R.id.heat_map, view);
                if (imageView != null) {
                    i = R.id.heat_map_arrow_left;
                    ImageView imageView2 = (ImageView) nq8.B(R.id.heat_map_arrow_left, view);
                    if (imageView2 != null) {
                        i = R.id.heat_map_arrow_right;
                        ImageView imageView3 = (ImageView) nq8.B(R.id.heat_map_arrow_right, view);
                        if (imageView3 != null) {
                            return new j99((FrameLayout) view, constraintLayout, imageView, imageView2, imageView3);
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
