package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gsc extends m6 {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final View F;
    public final View G;
    public final boolean y;
    public final e92 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsc(Context context, int i) {
        super(context, null, true);
        boolean z = (i & 8) == 0;
        boolean z2 = (i & 16) != 0;
        context.getClass();
        this.y = z2;
        View root = getRoot();
        int i2 = R.id.highlight_away;
        View B = nq8.B(R.id.highlight_away, root);
        if (B != null) {
            i2 = R.id.highlight_home;
            View B2 = nq8.B(R.id.highlight_home, root);
            if (B2 != null) {
                i2 = R.id.label;
                TextView textView = (TextView) nq8.B(R.id.label, root);
                if (textView != null) {
                    i2 = R.id.value_away;
                    TextView textView2 = (TextView) nq8.B(R.id.value_away, root);
                    if (textView2 != null) {
                        i2 = R.id.value_home;
                        TextView textView3 = (TextView) nq8.B(R.id.value_home, root);
                        if (textView3 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) root;
                            this.z = new e92(constraintLayout, B, B2, textView, textView2, textView3);
                            constraintLayout.getClass();
                            setupLayoutTransitions(constraintLayout);
                            if (z) {
                                textView.setTextColor(context.getColor(R.color.n_lv_1));
                            }
                            this.A = textView;
                            this.B = textView3;
                            this.C = textView2;
                            this.D = textView3;
                            this.E = textView2;
                            this.F = B2;
                            this.G = B;
                            return;
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i2)));
        throw null;
    }

    @Override // defpackage.m6
    @NotNull
    public List<View> getFractionModeOnlyViews() {
        e92 e92Var = this.z;
        View view = (View) e92Var.b;
        if (!getHomeActive()) {
            view = null;
        }
        return ph0.x(new View[]{view, getAwayActive() ? (View) e92Var.d : null});
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.mma_statistics_textual_comparison_view;
    }

    @Override // defpackage.m6
    public /* bridge */ /* synthetic */ TextView getPrimaryDenominatorAway() {
        return (TextView) m870getPrimaryDenominatorAway();
    }

    @Override // defpackage.m6
    public /* bridge */ /* synthetic */ TextView getPrimaryDenominatorHome() {
        return (TextView) m871getPrimaryDenominatorHome();
    }

    @Override // defpackage.m6
    @NotNull
    public View getPrimaryHighlightAway() {
        return this.G;
    }

    @Override // defpackage.m6
    @NotNull
    public View getPrimaryHighlightHome() {
        return this.F;
    }

    @Override // defpackage.m6
    @NotNull
    public TextView getPrimaryLabel() {
        return this.A;
    }

    @Override // defpackage.m6
    @NotNull
    public TextView getPrimaryNumeratorAway() {
        return this.E;
    }

    @Override // defpackage.m6
    @NotNull
    public TextView getPrimaryNumeratorHome() {
        return this.D;
    }

    @Override // defpackage.m6
    @NotNull
    public TextView getPrimaryPercentageAway() {
        return this.C;
    }

    @Override // defpackage.m6
    @NotNull
    public TextView getPrimaryPercentageHome() {
        return this.B;
    }

    @Override // defpackage.m6
    public void setPercentageDisplay(@NotNull yqc yqcVar) {
        yqcVar.getClass();
        if (this.y) {
            super.setPercentageDisplay(yqcVar);
        } else {
            setFractionalDisplay(yqcVar);
        }
    }

    @Override // defpackage.m6
    public final void t() {
        int color = getContext().getColor(R.color.n_lv_3);
        int homeDefaultColor = !getZeroValuesSet().contains(crc.a) ? getHomeDefaultColor() : color;
        if (!getZeroValuesSet().contains(crc.b)) {
            color = getAwayDefaultColor();
        }
        e92 e92Var = this.z;
        ((TextView) e92Var.c).setTextColor(homeDefaultColor);
        ((TextView) e92Var.f).setTextColor(color);
    }

    @Nullable
    /* renamed from: getPrimaryDenominatorAway, reason: collision with other method in class */
    public Void m870getPrimaryDenominatorAway() {
        return null;
    }

    @Nullable
    /* renamed from: getPrimaryDenominatorHome, reason: collision with other method in class */
    public Void m871getPrimaryDenominatorHome() {
        return null;
    }

    @Override // defpackage.m6
    public final void l() {
    }
}
