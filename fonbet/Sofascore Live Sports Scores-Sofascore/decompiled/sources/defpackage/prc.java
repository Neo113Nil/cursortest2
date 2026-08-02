package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.sofascore.results.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class prc extends o6 {
    public final dd A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final View I;
    public final View J;
    public final xxb K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prc(Context context) {
        super(context);
        context.getClass();
        View root = getRoot();
        int i = R.id.label;
        TextView textView = (TextView) nq8.B(R.id.label, root);
        if (textView != null) {
            i = R.id.progress_away;
            View B = nq8.B(R.id.progress_away, root);
            if (B != null) {
                frc a = frc.a(B);
                View B2 = nq8.B(R.id.progress_home, root);
                if (B2 != null) {
                    frc a2 = frc.a(B2);
                    this.A = new dd((ConstraintLayout) root, textView, a, a2);
                    setupLayoutTransitions(a2.a, a.a);
                    this.B = textView;
                    this.C = a2.g;
                    this.D = a.g;
                    this.E = a2.d;
                    this.F = a2.b;
                    this.G = a.d;
                    this.H = a.b;
                    this.I = a2.e;
                    this.J = a.e;
                    this.K = new xxb(this, 6);
                    return;
                }
                i = R.id.progress_home;
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    private final void setZeroValueColor(frc frcVar) {
        int color = getContext().getColor(R.color.n_lv_5);
        int color2 = getContext().getColor(R.color.n_lv_3);
        frcVar.f.setTrackColor(color);
        frcVar.g.setTextColor(color2);
        frcVar.d.setTextColor(color2);
    }

    @Override // defpackage.m6
    @NotNull
    public List<Group> getFractionModeOnlyViews() {
        dd ddVar = this.A;
        Group group = ((frc) ddVar.d).c;
        if (!getHomeActive()) {
            group = null;
        }
        return ph0.x(new Group[]{group, getAwayActive() ? ((frc) ddVar.c).c : null});
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.mma_statistics_circular_progress_comparison_view;
    }

    @Override // defpackage.m6
    @NotNull
    public List<TextView> getPercentageModeOnlyViews() {
        dd ddVar = this.A;
        TextView textView = ((frc) ddVar.d).g;
        if (!getHomeActive()) {
            textView = null;
        }
        return ph0.x(new TextView[]{textView, getAwayActive() ? ((frc) ddVar.c).g : null});
    }

    @Override // defpackage.m6
    @NotNull
    public TextView getPrimaryDenominatorAway() {
        return this.H;
    }

    @Override // defpackage.m6
    @NotNull
    public TextView getPrimaryDenominatorHome() {
        return this.F;
    }

    @Override // defpackage.m6
    @NotNull
    public View getPrimaryHighlightAway() {
        return this.J;
    }

    @Override // defpackage.m6
    @NotNull
    public View getPrimaryHighlightHome() {
        return this.I;
    }

    @Override // defpackage.m6
    @NotNull
    public TextView getPrimaryLabel() {
        return this.B;
    }

    @Override // defpackage.m6
    @NotNull
    public TextView getPrimaryNumeratorAway() {
        return this.G;
    }

    @Override // defpackage.m6
    @NotNull
    public TextView getPrimaryNumeratorHome() {
        return this.E;
    }

    @Override // defpackage.m6
    @NotNull
    public TextView getPrimaryPercentageAway() {
        return this.D;
    }

    @Override // defpackage.m6
    @NotNull
    public TextView getPrimaryPercentageHome() {
        return this.C;
    }

    @Override // defpackage.m6
    @NotNull
    public Function0<Unit> getTransitionCallback() {
        return this.K;
    }

    @Override // defpackage.m6
    public final void l() {
        final int i = 0;
        u(crc.a, new Function1(this) { // from class: orc
            public final /* synthetic */ prc b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = i;
                prc prcVar = this.b;
                int intValue = ((Integer) obj).intValue();
                switch (i2) {
                    case 0:
                        ((frc) prcVar.A.d).f.setProgress(intValue);
                        break;
                    default:
                        ((frc) prcVar.A.c).f.setProgress(intValue);
                        break;
                }
                return Unit.a;
            }
        });
        final int i2 = 1;
        u(crc.b, new Function1(this) { // from class: orc
            public final /* synthetic */ prc b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i2;
                prc prcVar = this.b;
                int intValue = ((Integer) obj).intValue();
                switch (i22) {
                    case 0:
                        ((frc) prcVar.A.d).f.setProgress(intValue);
                        break;
                    default:
                        ((frc) prcVar.A.c).f.setProgress(intValue);
                        break;
                }
                return Unit.a;
            }
        });
    }

    @Override // defpackage.m6
    public final void t() {
        boolean contains = getZeroValuesSet().contains(crc.a);
        dd ddVar = this.A;
        if (contains) {
            setZeroValueColor((frc) ddVar.d);
        } else {
            v((frc) ddVar.d, loc.a);
        }
        if (getZeroValuesSet().contains(crc.b)) {
            setZeroValueColor((frc) ddVar.c);
        } else {
            v((frc) ddVar.c, loc.b);
        }
    }

    public final void v(frc frcVar, loc locVar) {
        CircularProgressIndicator circularProgressIndicator = frcVar.f;
        loc locVar2 = loc.a;
        int homeDefaultColor = locVar == locVar2 ? getHomeDefaultColor() : getAwayDefaultColor();
        int homeHighlightColor = locVar == locVar2 ? getHomeHighlightColor() : getAwayHighlightColor();
        circularProgressIndicator.setIndicatorColor(homeDefaultColor);
        circularProgressIndicator.setTrackColor(homeHighlightColor);
        frcVar.g.setTextColor(homeDefaultColor);
        frcVar.d.setTextColor(homeDefaultColor);
    }
}
