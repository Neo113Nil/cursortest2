package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import com.sofascore.results.event.graphs.view.CricketBowlerGraphView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hz3 implements krk {
    public final ConstraintLayout a;
    public final CricketBowlerGraphView b;
    public final View c;
    public final LinearLayout d;
    public final t22 e;
    public final t22 f;
    public final t22 g;
    public final TextView h;
    public final TextView i;
    public final t22 j;

    public hz3(ConstraintLayout constraintLayout, CricketBowlerGraphView cricketBowlerGraphView, View view, LinearLayout linearLayout, t22 t22Var, t22 t22Var2, t22 t22Var3, TextView textView, TextView textView2, t22 t22Var4) {
        this.a = constraintLayout;
        this.b = cricketBowlerGraphView;
        this.c = view;
        this.d = linearLayout;
        this.e = t22Var;
        this.f = t22Var2;
        this.g = t22Var3;
        this.h = textView;
        this.i = textView2;
        this.j = t22Var4;
    }

    public static hz3 a(View view) {
        int i = R.id.bowler_graph;
        CricketBowlerGraphView cricketBowlerGraphView = (CricketBowlerGraphView) nq8.B(R.id.bowler_graph, view);
        if (cricketBowlerGraphView != null) {
            i = R.id.container;
            View B = nq8.B(R.id.container, view);
            if (B != null) {
                i = R.id.description_container;
                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.description_container, view);
                if (linearLayout != null) {
                    i = R.id.full_length_description;
                    View B2 = nq8.B(R.id.full_length_description, view);
                    if (B2 != null) {
                        t22 a = t22.a(B2);
                        i = R.id.good_length_description;
                        View B3 = nq8.B(R.id.good_length_description, view);
                        if (B3 != null) {
                            t22 a2 = t22.a(B3);
                            i = R.id.short_description;
                            View B4 = nq8.B(R.id.short_description, view);
                            if (B4 != null) {
                                t22 a3 = t22.a(B4);
                                i = R.id.wicket_image;
                                if (((ImageView) nq8.B(R.id.wicket_image, view)) != null) {
                                    i = R.id.wicket_text_left;
                                    TextView textView = (TextView) nq8.B(R.id.wicket_text_left, view);
                                    if (textView != null) {
                                        i = R.id.wicket_text_right;
                                        TextView textView2 = (TextView) nq8.B(R.id.wicket_text_right, view);
                                        if (textView2 != null) {
                                            i = R.id.yorker_description;
                                            View B5 = nq8.B(R.id.yorker_description, view);
                                            if (B5 != null) {
                                                return new hz3((ConstraintLayout) view, cricketBowlerGraphView, B, linearLayout, a, a2, a3, textView, textView2, t22.a(B5));
                                            }
                                        }
                                    }
                                }
                            }
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
