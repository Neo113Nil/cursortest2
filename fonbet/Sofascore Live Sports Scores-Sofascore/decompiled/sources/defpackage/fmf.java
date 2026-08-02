package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fmf implements krk {
    public final ConstraintLayout a;
    public final TextView b;
    public final TextView c;

    public fmf(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = textView2;
    }

    public static fmf a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.ranking_row_header_layout, viewGroup, false);
        int i = R.id.ranking_section_left;
        TextView textView = (TextView) nq8.B(R.id.ranking_section_left, inflate);
        if (textView != null) {
            i = R.id.ranking_section_right;
            TextView textView2 = (TextView) nq8.B(R.id.ranking_section_right, inflate);
            if (textView2 != null) {
                return new fmf((ConstraintLayout) inflate, textView, textView2);
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
