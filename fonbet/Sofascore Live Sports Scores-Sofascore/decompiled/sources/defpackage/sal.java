package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.Odds;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sal extends o8 {
    public final v82 d;
    public boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sal(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.description;
        TextView textView = (TextView) nq8.B(R.id.description, root);
        if (textView != null) {
            i = R.id.dropdown_icon;
            ImageView imageView = (ImageView) nq8.B(R.id.dropdown_icon, root);
            if (imageView != null) {
                i = R.id.logo;
                ImageView imageView2 = (ImageView) nq8.B(R.id.logo, root);
                if (imageView2 != null) {
                    i = R.id.odds_actual;
                    TextView textView2 = (TextView) nq8.B(R.id.odds_actual, root);
                    if (textView2 != null) {
                        i = R.id.odds_expected;
                        TextView textView3 = (TextView) nq8.B(R.id.odds_expected, root);
                        if (textView3 != null) {
                            i = R.id.odds_separator;
                            if (((TextView) nq8.B(R.id.odds_separator, root)) != null) {
                                i = R.id.odds_value;
                                TextView textView4 = (TextView) nq8.B(R.id.odds_value, root);
                                if (textView4 != null) {
                                    this.d = new v82(imageView, imageView2, textView, textView2, textView3, textView4, (ConstraintLayout) root);
                                    textView.setVisibility(8);
                                    return;
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

    public static final void l(sal salVar, li6 li6Var) {
        salVar.e = !salVar.e;
        salVar.setExpandedStatus(true);
        li6Var.f(salVar.e);
    }

    private final void setExpandedStatus(boolean z) {
        v82 v82Var = this.d;
        ((TextView) v82Var.e).setVisibility(this.e ? 0 : 8);
        ImageView imageView = (ImageView) v82Var.d;
        if (z) {
            z8e.s(imageView, this.e);
        } else {
            imageView.setRotation(this.e ? 180.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.winning_odds_row;
    }

    public final void j(Odds odds, Team team, boolean z) {
        team.getClass();
        v82 v82Var = this.d;
        as9.o((ImageView) v82Var.h, team.getId());
        this.e = z;
        Context context = getContext();
        context.getClass();
        String m = rld.m(context, odds.getFractionalValue());
        l4a.K((TextView) v82Var.g, m);
        Context context2 = getContext();
        String r = yid.r(odds.getExpected());
        Context context3 = getContext();
        context3.getClass();
        String string = context2.getString(R.string.extended_odds_description, m, r, tba.p(context3, team), yid.r(odds.getActual()));
        string.getClass();
        ((TextView) v82Var.e).setText(string);
        ((TextView) v82Var.f).setText(String.format("%s", Arrays.copyOf(new Object[]{yid.r(odds.getExpected())}, 1)));
        TextView textView = (TextView) v82Var.c;
        textView.setText(String.format("W:%s", Arrays.copyOf(new Object[]{yid.r(odds.getActual())}, 1)));
        setExpandedStatus(false);
        if (odds.getActual() > odds.getExpected()) {
            textView.getBackground().mutate().setTintList(eq3.q(R.color.value, getContext()));
        } else {
            textView.getBackground().mutate().setTintList(eq3.q(R.color.neutral_default, getContext()));
        }
    }

    public final void setExpandedViewListener(@NotNull li6 li6Var) {
        li6Var.getClass();
        setOnClickListener(new ivj(7, this, li6Var));
    }
}
