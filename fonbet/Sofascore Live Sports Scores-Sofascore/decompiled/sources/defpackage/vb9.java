package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.sofascore.model.firebase.AdType;
import com.sofascore.results.R;
import com.sofascore.results.view.SofascoreRatingView;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vb9 extends g7 {
    public final mxa l;

    public vb9(Context context, mxa mxaVar) {
        super(context);
        this.l = mxaVar;
        this.a.d = new tu5(context, 4);
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return ((ub9) obj) instanceof sb9;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new th(arrayList2, arrayList, 17);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        ub9 ub9Var = (ub9) obj;
        ub9Var.getClass();
        return ub9Var.a();
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        Context context = this.b;
        switch (i) {
            case 0:
            case 1:
            case 2:
                View inflate = LayoutInflater.from(context).inflate(R.layout.historical_top_performance_item, viewGroup, false);
                int i2 = R.id.button_show_all;
                TextView textView = (TextView) nq8.B(R.id.button_show_all, inflate);
                if (textView != null) {
                    i2 = R.id.category_spinner;
                    ComposeView composeView = (ComposeView) nq8.B(R.id.category_spinner, inflate);
                    if (composeView != null) {
                        i2 = R.id.divider;
                        View B = nq8.B(R.id.divider, inflate);
                        if (B != null) {
                            i2 = R.id.info_button;
                            ImageView imageView = (ImageView) nq8.B(R.id.info_button, inflate);
                            if (imageView != null) {
                                i2 = R.id.title_text;
                                TextView textView2 = (TextView) nq8.B(R.id.title_text, inflate);
                                if (textView2 != null) {
                                    i2 = R.id.top_list_row_0;
                                    View B2 = nq8.B(R.id.top_list_row_0, inflate);
                                    if (B2 != null) {
                                        j22 b = j22.b(B2);
                                        i2 = R.id.top_list_row_1;
                                        View B3 = nq8.B(R.id.top_list_row_1, inflate);
                                        if (B3 != null) {
                                            j22 b2 = j22.b(B3);
                                            i2 = R.id.top_list_row_2;
                                            View B4 = nq8.B(R.id.top_list_row_2, inflate);
                                            if (B4 != null) {
                                                return new dc9(new bv1((ConstraintLayout) inflate, textView, composeView, B, imageView, textView2, b, b2, j22.b(B4)), this.l);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                return null;
            case 3:
            case 4:
                View inflate2 = LayoutInflater.from(context).inflate(R.layout.historical_data_comparison_item, viewGroup, false);
                int i3 = R.id.button_full_comparison;
                TextView textView3 = (TextView) nq8.B(R.id.button_full_comparison, inflate2);
                if (textView3 != null) {
                    i3 = R.id.container_end;
                    if (((ConstraintLayout) nq8.B(R.id.container_end, inflate2)) != null) {
                        i3 = R.id.container_start;
                        if (((ConstraintLayout) nq8.B(R.id.container_start, inflate2)) != null) {
                            i3 = R.id.image_large_end;
                            ImageView imageView2 = (ImageView) nq8.B(R.id.image_large_end, inflate2);
                            if (imageView2 != null) {
                                i3 = R.id.image_large_start;
                                ImageView imageView3 = (ImageView) nq8.B(R.id.image_large_start, inflate2);
                                if (imageView3 != null) {
                                    i3 = R.id.image_small_end;
                                    ImageView imageView4 = (ImageView) nq8.B(R.id.image_small_end, inflate2);
                                    if (imageView4 != null) {
                                        i3 = R.id.image_small_start;
                                        ImageView imageView5 = (ImageView) nq8.B(R.id.image_small_start, inflate2);
                                        if (imageView5 != null) {
                                            i3 = R.id.row_rating;
                                            View B5 = nq8.B(R.id.row_rating, inflate2);
                                            if (B5 != null) {
                                                int i4 = R.id.first_rating;
                                                SofascoreRatingView sofascoreRatingView = (SofascoreRatingView) nq8.B(R.id.first_rating, B5);
                                                if (sofascoreRatingView != null) {
                                                    i4 = R.id.guideline_end;
                                                    Guideline guideline = (Guideline) nq8.B(R.id.guideline_end, B5);
                                                    if (guideline != null) {
                                                        i4 = R.id.guideline_start;
                                                        Guideline guideline2 = (Guideline) nq8.B(R.id.guideline_start, B5);
                                                        if (guideline2 != null) {
                                                            i4 = R.id.label_text;
                                                            if (((TextView) nq8.B(R.id.label_text, B5)) != null) {
                                                                i4 = R.id.second_rating;
                                                                SofascoreRatingView sofascoreRatingView2 = (SofascoreRatingView) nq8.B(R.id.second_rating, B5);
                                                                if (sofascoreRatingView2 != null) {
                                                                    e92 e92Var = new e92((ConstraintLayout) B5, sofascoreRatingView, guideline, guideline2, sofascoreRatingView2, 2);
                                                                    i3 = R.id.row_team;
                                                                    View B6 = nq8.B(R.id.row_team, inflate2);
                                                                    if (B6 != null) {
                                                                        int i5 = R.id.first_team_name;
                                                                        TextView textView4 = (TextView) nq8.B(R.id.first_team_name, B6);
                                                                        if (textView4 != null) {
                                                                            i5 = R.id.second_team_name;
                                                                            TextView textView5 = (TextView) nq8.B(R.id.second_team_name, B6);
                                                                            if (textView5 != null) {
                                                                                t22 t22Var = new t22((LinearLayout) B6, textView4, textView5, 1);
                                                                                i3 = R.id.row_value_0;
                                                                                View B7 = nq8.B(R.id.row_value_0, inflate2);
                                                                                if (B7 != null) {
                                                                                    z82 a = z82.a(B7);
                                                                                    i3 = R.id.row_value_1;
                                                                                    View B8 = nq8.B(R.id.row_value_1, inflate2);
                                                                                    if (B8 != null) {
                                                                                        z82 a2 = z82.a(B8);
                                                                                        i3 = R.id.row_value_2;
                                                                                        View B9 = nq8.B(R.id.row_value_2, inflate2);
                                                                                        if (B9 != null) {
                                                                                            z82 a3 = z82.a(B9);
                                                                                            i3 = R.id.row_value_3;
                                                                                            View B10 = nq8.B(R.id.row_value_3, inflate2);
                                                                                            if (B10 != null) {
                                                                                                z82 a4 = z82.a(B10);
                                                                                                i3 = R.id.text_end;
                                                                                                TextView textView6 = (TextView) nq8.B(R.id.text_end, inflate2);
                                                                                                if (textView6 != null) {
                                                                                                    i3 = R.id.text_season_end;
                                                                                                    TextView textView7 = (TextView) nq8.B(R.id.text_season_end, inflate2);
                                                                                                    if (textView7 != null) {
                                                                                                        i3 = R.id.text_season_start;
                                                                                                        TextView textView8 = (TextView) nq8.B(R.id.text_season_start, inflate2);
                                                                                                        if (textView8 != null) {
                                                                                                            i3 = R.id.text_start;
                                                                                                            TextView textView9 = (TextView) nq8.B(R.id.text_start, inflate2);
                                                                                                            if (textView9 != null) {
                                                                                                                i3 = R.id.text_title;
                                                                                                                TextView textView10 = (TextView) nq8.B(R.id.text_title, inflate2);
                                                                                                                if (textView10 != null) {
                                                                                                                    return new mb9(new xk8((FrameLayout) inflate2, textView3, imageView2, imageView3, imageView4, imageView5, e92Var, t22Var, a, a2, a3, a4, textView6, textView7, textView8, textView9, textView10));
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
                                                                        yhk.s("Missing required view with ID: ".concat(B6.getResources().getResourceName(i5)));
                                                                        return null;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                yhk.s("Missing required view with ID: ".concat(B5.getResources().getResourceName(i4)));
                                                return null;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i3)));
                return null;
            case 5:
                return new hb9(hcb.a(LayoutInflater.from(context).inflate(R.layout.sofa_ads_view, viewGroup, false)), true, AdType.Banner.MainScreenBig);
            case 6:
                return new hb9(hcb.a(LayoutInflater.from(context).inflate(R.layout.sofa_ads_view, viewGroup, false)), false, AdType.Banner.MainScreenSmall);
            case 7:
                View inflate3 = LayoutInflater.from(context).inflate(R.layout.historical_data_info_item, viewGroup, false);
                int i6 = R.id.button_dismiss;
                ImageView imageView6 = (ImageView) nq8.B(R.id.button_dismiss, inflate3);
                if (imageView6 != null) {
                    i6 = R.id.text_disclaimer;
                    TextView textView11 = (TextView) nq8.B(R.id.text_disclaimer, inflate3);
                    if (textView11 != null) {
                        return new ja9(new ob9((FrameLayout) inflate3, imageView6, textView11, 0), new sr8(this, 5));
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i6)));
                return null;
            case 8:
                View inflate4 = LayoutInflater.from(context).inflate(R.layout.historical_data_season_button, viewGroup, false);
                TextView textView12 = (TextView) nq8.B(R.id.button_text, inflate4);
                if (textView12 != null) {
                    return new ja9(new o16((FrameLayout) inflate4, textView12, 1));
                }
                yhk.s("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(R.id.button_text)));
                return null;
            default:
                ilg.c();
                return null;
        }
    }
}
