package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tq5 implements krk {
    public final ConstraintLayout a;
    public final View b;
    public final ConstraintLayout c;
    public final ImageView d;
    public final TextView e;
    public final ImageView f;
    public final TextView g;
    public final View h;
    public final ImageView i;
    public final TextView j;
    public final ImageView k;
    public final TextView l;
    public final View m;
    public final sq5 n;
    public final sq5 o;
    public final sq5 p;
    public final sq5 q;
    public final sq5 r;

    public tq5(ConstraintLayout constraintLayout, View view, ConstraintLayout constraintLayout2, ImageView imageView, TextView textView, ImageView imageView2, TextView textView2, View view2, ImageView imageView3, TextView textView3, ImageView imageView4, TextView textView4, View view3, sq5 sq5Var, sq5 sq5Var2, sq5 sq5Var3, sq5 sq5Var4, sq5 sq5Var5) {
        this.a = constraintLayout;
        this.b = view;
        this.c = constraintLayout2;
        this.d = imageView;
        this.e = textView;
        this.f = imageView2;
        this.g = textView2;
        this.h = view2;
        this.i = imageView3;
        this.j = textView3;
        this.k = imageView4;
        this.l = textView4;
        this.m = view3;
        this.n = sq5Var;
        this.o = sq5Var2;
        this.p = sq5Var3;
        this.q = sq5Var4;
        this.r = sq5Var5;
    }

    public static tq5 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.esports_player_statistics_item, viewGroup, false);
        int i = R.id.bottom_divider;
        View B = nq8.B(R.id.bottom_divider, inflate);
        if (B != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
            i = R.id.center_guideline;
            if (((Guideline) nq8.B(R.id.center_guideline, inflate)) != null) {
                i = R.id.first_team_player_elimination_indicator;
                ImageView imageView = (ImageView) nq8.B(R.id.first_team_player_elimination_indicator, inflate);
                if (imageView != null) {
                    i = R.id.first_team_player_level;
                    TextView textView = (TextView) nq8.B(R.id.first_team_player_level, inflate);
                    if (textView != null) {
                        i = R.id.first_team_player_logo;
                        ImageView imageView2 = (ImageView) nq8.B(R.id.first_team_player_logo, inflate);
                        if (imageView2 != null) {
                            i = R.id.first_team_player_name;
                            TextView textView2 = (TextView) nq8.B(R.id.first_team_player_name, inflate);
                            if (textView2 != null) {
                                i = R.id.first_team_side_indicator;
                                View B2 = nq8.B(R.id.first_team_side_indicator, inflate);
                                if (B2 != null) {
                                    i = R.id.second_team_player_elimination_indicator;
                                    ImageView imageView3 = (ImageView) nq8.B(R.id.second_team_player_elimination_indicator, inflate);
                                    if (imageView3 != null) {
                                        i = R.id.second_team_player_level;
                                        TextView textView3 = (TextView) nq8.B(R.id.second_team_player_level, inflate);
                                        if (textView3 != null) {
                                            i = R.id.second_team_player_logo;
                                            ImageView imageView4 = (ImageView) nq8.B(R.id.second_team_player_logo, inflate);
                                            if (imageView4 != null) {
                                                i = R.id.second_team_player_name;
                                                TextView textView4 = (TextView) nq8.B(R.id.second_team_player_name, inflate);
                                                if (textView4 != null) {
                                                    i = R.id.second_team_side_indicator;
                                                    View B3 = nq8.B(R.id.second_team_side_indicator, inflate);
                                                    if (B3 != null) {
                                                        i = R.id.statistic_row_1;
                                                        View B4 = nq8.B(R.id.statistic_row_1, inflate);
                                                        if (B4 != null) {
                                                            sq5 a = sq5.a(B4);
                                                            i = R.id.statistic_row_2;
                                                            View B5 = nq8.B(R.id.statistic_row_2, inflate);
                                                            if (B5 != null) {
                                                                sq5 a2 = sq5.a(B5);
                                                                i = R.id.statistic_row_3;
                                                                View B6 = nq8.B(R.id.statistic_row_3, inflate);
                                                                if (B6 != null) {
                                                                    sq5 a3 = sq5.a(B6);
                                                                    i = R.id.statistic_row_4;
                                                                    View B7 = nq8.B(R.id.statistic_row_4, inflate);
                                                                    if (B7 != null) {
                                                                        sq5 a4 = sq5.a(B7);
                                                                        i = R.id.statistic_row_5;
                                                                        View B8 = nq8.B(R.id.statistic_row_5, inflate);
                                                                        if (B8 != null) {
                                                                            return new tq5(constraintLayout, B, constraintLayout, imageView, textView, imageView2, textView2, B2, imageView3, textView3, imageView4, textView4, B3, a, a2, a3, a4, sq5.a(B8));
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
                            }
                        }
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
