package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class loe implements krk {
    public final LinearLayout a;
    public final GridView b;
    public final LinearLayout c;
    public final v82 d;
    public final xz0 e;
    public final LinearLayout f;

    public loe(LinearLayout linearLayout, GridView gridView, LinearLayout linearLayout2, v82 v82Var, xz0 xz0Var, LinearLayout linearLayout3) {
        this.a = linearLayout;
        this.b = gridView;
        this.c = linearLayout2;
        this.d = v82Var;
        this.e = xz0Var;
        this.f = linearLayout3;
    }

    public static loe a(LayoutInflater layoutInflater, RecyclerView recyclerView) {
        View inflate = layoutInflater.inflate(R.layout.player_details_header, (ViewGroup) recyclerView, false);
        int i = R.id.biography_title;
        if (((TextView) nq8.B(R.id.biography_title, inflate)) != null) {
            i = R.id.player_details_grid;
            GridView gridView = (GridView) nq8.B(R.id.player_details_grid, inflate);
            if (gridView != null) {
                i = R.id.player_details_grid_wrapper;
                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.player_details_grid_wrapper, inflate);
                if (linearLayout != null) {
                    i = R.id.proposed_value_layout;
                    View B = nq8.B(R.id.proposed_value_layout, inflate);
                    if (B != null) {
                        int i2 = R.id.currency_down;
                        TextView textView = (TextView) nq8.B(R.id.currency_down, B);
                        if (textView != null) {
                            i2 = R.id.currency_up;
                            TextView textView2 = (TextView) nq8.B(R.id.currency_up, B);
                            if (textView2 != null) {
                                i2 = R.id.market_value;
                                TextView textView3 = (TextView) nq8.B(R.id.market_value, B);
                                if (textView3 != null) {
                                    i2 = R.id.player_value_container;
                                    if (((TextView) nq8.B(R.id.player_value_container, B)) != null) {
                                        i2 = R.id.player_value_guideline;
                                        if (((Guideline) nq8.B(R.id.player_value_guideline, B)) != null) {
                                            i2 = R.id.player_value_text;
                                            if (((TextView) nq8.B(R.id.player_value_text, B)) != null) {
                                                i2 = R.id.separator;
                                                View B2 = nq8.B(R.id.separator, B);
                                                if (B2 != null) {
                                                    i2 = R.id.vote_down_circle;
                                                    View B3 = nq8.B(R.id.vote_down_circle, B);
                                                    if (B3 != null) {
                                                        i2 = R.id.vote_up_circle;
                                                        View B4 = nq8.B(R.id.vote_up_circle, B);
                                                        if (B4 != null) {
                                                            v82 v82Var = new v82((ConstraintLayout) B, textView, textView2, textView3, B2, B3, B4, 11);
                                                            i = R.id.team_layout;
                                                            View B5 = nq8.B(R.id.team_layout, inflate);
                                                            if (B5 != null) {
                                                                xz0 a = xz0.a(B5);
                                                                i = R.id.team_layouts_container;
                                                                LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.team_layouts_container, inflate);
                                                                if (linearLayout2 != null) {
                                                                    return new loe((LinearLayout) inflate, gridView, linearLayout, v82Var, a, linearLayout2);
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
                        }
                        yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i2)));
                        return null;
                    }
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
