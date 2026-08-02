package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.asynclayoutinflater.view.AsyncLayoutInflater;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class f84 implements AsyncLayoutInflater.OnInflateFinishedListener {
    public final /* synthetic */ j84 a;
    public final /* synthetic */ oog b;

    public f84(j84 j84Var, oog oogVar) {
        this.a = j84Var;
        this.b = oogVar;
    }

    @Override // androidx.asynclayoutinflater.view.AsyncLayoutInflater.OnInflateFinishedListener
    public final void onInflateFinished(View view, int i, ViewGroup viewGroup) {
        view.getClass();
        int i2 = R.id.away_logo;
        ImageView imageView = (ImageView) nq8.B(R.id.away_logo, view);
        if (imageView != null) {
            i2 = R.id.away_name;
            TextView textView = (TextView) nq8.B(R.id.away_name, view);
            if (textView != null) {
                i2 = R.id.away_seeding;
                TextView textView2 = (TextView) nq8.B(R.id.away_seeding, view);
                if (textView2 != null) {
                    i2 = R.id.cup_tree_card;
                    MaterialCardView materialCardView = (MaterialCardView) nq8.B(R.id.cup_tree_card, view);
                    if (materialCardView != null) {
                        i2 = R.id.cup_tree_lower_connector;
                        View B = nq8.B(R.id.cup_tree_lower_connector, view);
                        if (B != null) {
                            i2 = R.id.cup_tree_lower_margin;
                            View B2 = nq8.B(R.id.cup_tree_lower_margin, view);
                            if (B2 != null) {
                                i2 = R.id.cup_tree_upper_connector;
                                View B3 = nq8.B(R.id.cup_tree_upper_connector, view);
                                if (B3 != null) {
                                    i2 = R.id.cup_tree_upper_margin;
                                    View B4 = nq8.B(R.id.cup_tree_upper_margin, view);
                                    if (B4 != null) {
                                        i2 = R.id.home_logo;
                                        ImageView imageView2 = (ImageView) nq8.B(R.id.home_logo, view);
                                        if (imageView2 != null) {
                                            i2 = R.id.home_name;
                                            TextView textView3 = (TextView) nq8.B(R.id.home_name, view);
                                            if (textView3 != null) {
                                                i2 = R.id.home_seeding;
                                                TextView textView4 = (TextView) nq8.B(R.id.home_seeding, view);
                                                if (textView4 != null) {
                                                    i2 = R.id.result_away;
                                                    TextView textView5 = (TextView) nq8.B(R.id.result_away, view);
                                                    if (textView5 != null) {
                                                        i2 = R.id.result_home;
                                                        TextView textView6 = (TextView) nq8.B(R.id.result_home, view);
                                                        if (textView6 != null) {
                                                            i2 = R.id.result_middle;
                                                            TextView textView7 = (TextView) nq8.B(R.id.result_middle, view);
                                                            if (textView7 != null) {
                                                                i2 = R.id.top_barrier;
                                                                if (((Barrier) nq8.B(R.id.top_barrier, view)) != null) {
                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                                    sc scVar = new sc(constraintLayout, imageView, textView, textView2, materialCardView, B, B2, B3, B4, imageView2, textView3, textView4, textView5, textView6, textView7);
                                                                    j84 j84Var = this.a;
                                                                    j84Var.a = scVar;
                                                                    j84Var.addView(constraintLayout);
                                                                    p2g p2gVar = w2g.b;
                                                                    this.b.resumeWith(j84Var);
                                                                    return;
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
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
