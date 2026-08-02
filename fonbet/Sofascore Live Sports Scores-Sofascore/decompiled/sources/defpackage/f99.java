package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class f99 implements krk {
    public final FrameLayout a;
    public final ConstraintLayout b;
    public final ImageView c;
    public final ImageView d;

    public f99(FrameLayout frameLayout, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2) {
        this.a = frameLayout;
        this.b = constraintLayout;
        this.c = imageView;
        this.d = imageView2;
    }

    public static f99 a(View view) {
        int i = R.id.field_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.field_container, view);
        if (constraintLayout != null) {
            i = R.id.field_lines;
            if (((ImageView) nq8.B(R.id.field_lines, view)) != null) {
                i = R.id.heat_map;
                ImageView imageView = (ImageView) nq8.B(R.id.heat_map, view);
                if (imageView != null) {
                    i = R.id.heat_map_arrow;
                    ImageView imageView2 = (ImageView) nq8.B(R.id.heat_map_arrow, view);
                    if (imageView2 != null) {
                        return new f99((FrameLayout) view, constraintLayout, imageView, imageView2);
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static f99 b(LayoutInflater layoutInflater, LinearLayout linearLayout) {
        return a(layoutInflater.inflate(R.layout.heatmap_horizontal_container_view, (ViewGroup) linearLayout, false));
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
