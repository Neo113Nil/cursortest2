package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import com.sofascore.results.dialog.SofascoreRatingBottomSheetDialog;
import com.sofascore.results.view.graph.SeasonRatingGraph;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bzg extends o8 {
    public final boolean d;
    public azg e;
    public final nr1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzg(Context context, boolean z) {
        super(context, null, 0);
        context.getClass();
        this.d = z;
        View root = getRoot();
        int i = R.id.graph;
        SeasonRatingGraph seasonRatingGraph = (SeasonRatingGraph) nq8.B(R.id.graph, root);
        if (seasonRatingGraph != null) {
            i = R.id.graph_description;
            TextView textView = (TextView) nq8.B(R.id.graph_description, root);
            if (textView != null) {
                i = R.id.graph_view;
                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.graph_view, root);
                if (linearLayout != null) {
                    i = R.id.legend_injury_icon;
                    FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.legend_injury_icon, root);
                    if (frameLayout != null) {
                        i = R.id.legend_injury_text;
                        TextView textView2 = (TextView) nq8.B(R.id.legend_injury_text, root);
                        if (textView2 != null) {
                            i = R.id.legend_transfer_text;
                            TextView textView3 = (TextView) nq8.B(R.id.legend_transfer_text, root);
                            if (textView3 != null) {
                                i = R.id.rating_layout;
                                View B = nq8.B(R.id.rating_layout, root);
                                if (B != null) {
                                    hei a = hei.a(B);
                                    i = R.id.tap_info;
                                    TextView textView4 = (TextView) nq8.B(R.id.tap_info, root);
                                    if (textView4 != null) {
                                        this.f = new nr1((LinearLayout) root, seasonRatingGraph, textView, linearLayout, frameLayout, textView2, textView3, a, textView4);
                                        if (!isInEditMode()) {
                                            setVisibility(8);
                                        }
                                        SharedPreferences sharedPreferences = uic.j;
                                        if (sharedPreferences == null) {
                                            Context applicationContext = context.getApplicationContext();
                                            synchronized (uic.i) {
                                                sharedPreferences = a5f.d(applicationContext);
                                                uic.j = sharedPreferences;
                                            }
                                            sharedPreferences.getClass();
                                        }
                                        this.e = sharedPreferences.getBoolean("SEASON_RATING_GRAPH_MONTHLY_RATING_VALUES", true) ? azg.a : azg.b;
                                        a.b.setVisibility(8);
                                        a.c.setText(context.getString(R.string.season_rating_graph_title));
                                        if (z) {
                                            a.d.setShouldAnimate(false);
                                            a.c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                                        }
                                        textView4.setVisibility(z ? 8 : 0);
                                        setWillNotDraw(false);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.player_season_rating_graph_layout;
    }

    public final boolean getShowAsMediaPost() {
        return this.d;
    }

    public final void j(List list, final Integer num, final String str, eoe eoeVar) {
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        setVisibility(0);
        nr1 nr1Var = this.f;
        SeasonRatingGraph seasonRatingGraph = (SeasonRatingGraph) nr1Var.d;
        SeasonRatingGraph seasonRatingGraph2 = (SeasonRatingGraph) nr1Var.d;
        hei heiVar = (hei) nr1Var.i;
        seasonRatingGraph.setSummary(list);
        ConstraintLayout constraintLayout = heiVar.a;
        constraintLayout.getClass();
        boolean z = this.d;
        constraintLayout.setVisibility(!z ? 0 : 8);
        if (z) {
            LinearLayout linearLayout = (LinearLayout) nr1Var.c;
            linearLayout.getClass();
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams == null) {
                yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            } else {
                setPadding(0, 0, 0, 0);
                linearLayout.setLayoutParams(layoutParams);
            }
        }
        final double averageRating = seasonRatingGraph2.getAverageRating();
        if (averageRating > 0.0d) {
            heiVar.d.m(averageRating, !z);
            if (num != null) {
                aba.t(heiVar.c);
                z8e.a0(heiVar.c, 1000L, new Function0() { // from class: yyg
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String str2 = str;
                        if (str2 != null) {
                            Context context = this.getContext();
                            context.getClass();
                            SofascoreRatingBottomSheetDialog e = v9f.e(gvh.d, Double.valueOf(averageRating), num, str2, null, 16);
                            if (context instanceof csk) {
                                context = ((csk) context).getBaseContext();
                            }
                            AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                            if (appCompatActivity != null) {
                                wca.x(appCompatActivity.getLifecycle()).b(new r1(e, appCompatActivity, null, 3));
                            }
                        }
                        return Unit.a;
                    }
                });
            }
            ((TextView) nr1Var.h).setVisibility(seasonRatingGraph2.getHasTransfers() ? 0 : 8);
            ((TextView) nr1Var.g).setVisibility(seasonRatingGraph2.getHasInjuries() ? 0 : 8);
            ((FrameLayout) nr1Var.f).setVisibility(seasonRatingGraph2.getHasInjuries() ? 0 : 8);
            l(false);
            if (!z) {
                ((LinearLayout) nr1Var.e).setOnClickListener(new cne(this, 20));
            }
            if (eoeVar != null) {
                heiVar.d.setOnClickListener(new s61(8, eoeVar));
            }
        }
    }

    public final void l(boolean z) {
        int i = zyg.a[this.e.ordinal()];
        nr1 nr1Var = this.f;
        if (i == 1) {
            nr1Var.b.setText(getContext().getString(R.string.season_rating_graph_description_ratings));
            SeasonRatingGraph seasonRatingGraph = (SeasonRatingGraph) nr1Var.d;
            seasonRatingGraph.z = true;
            seasonRatingGraph.invalidate();
        } else {
            nr1Var.b.setText(getContext().getString(R.string.season_rating_graph_description_matches));
            SeasonRatingGraph seasonRatingGraph2 = (SeasonRatingGraph) nr1Var.d;
            seasonRatingGraph2.z = false;
            seasonRatingGraph2.invalidate();
        }
        if (z) {
            Context context = getContext();
            context.getClass();
            n9e.u(context, new qfg(this, 11));
        }
    }
}
