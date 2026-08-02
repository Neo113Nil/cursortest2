package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class v12 implements krk {
    public final ConstraintLayout a;
    public final View b;
    public final TextView c;
    public final ImageView d;

    public v12(View view, ImageView imageView, TextView textView, ConstraintLayout constraintLayout) {
        this.a = constraintLayout;
        this.b = view;
        this.c = textView;
        this.d = imageView;
    }

    public static v12 a(View view) {
        int i = R.id.sort_lineups_header_section_divider;
        View B = nq8.B(R.id.sort_lineups_header_section_divider, view);
        if (B != null) {
            i = R.id.sort_lineups_header_section_text;
            TextView textView = (TextView) nq8.B(R.id.sort_lineups_header_section_text, view);
            if (textView != null) {
                i = R.id.sort_lineups_header_section_triangle;
                ImageView imageView = (ImageView) nq8.B(R.id.sort_lineups_header_section_triangle, view);
                if (imageView != null) {
                    return new v12(B, imageView, textView, (ConstraintLayout) view);
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
