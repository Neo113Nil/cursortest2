package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class w16 implements krk {
    public final ConstraintLayout a;
    public final GraphicLarge b;
    public final TextView c;
    public final TextView d;

    public w16(ConstraintLayout constraintLayout, GraphicLarge graphicLarge, TextView textView, TextView textView2) {
        this.a = constraintLayout;
        this.b = graphicLarge;
        this.c = textView;
        this.d = textView2;
    }

    public static w16 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.event_list_date_row, viewGroup, false);
        int i = R.id.empty_state;
        GraphicLarge graphicLarge = (GraphicLarge) nq8.B(R.id.empty_state, inflate);
        if (graphicLarge != null) {
            i = R.id.text_left;
            TextView textView = (TextView) nq8.B(R.id.text_left, inflate);
            if (textView != null) {
                i = R.id.text_right;
                TextView textView2 = (TextView) nq8.B(R.id.text_right, inflate);
                if (textView2 != null) {
                    return new w16((ConstraintLayout) inflate, graphicLarge, textView, textView2);
                }
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
