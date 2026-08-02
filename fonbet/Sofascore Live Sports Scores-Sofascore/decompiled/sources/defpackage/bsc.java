package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.sofascore.results.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bsc extends o6 {
    public final nr1 A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final View I;
    public final View J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsc(Context context) {
        super(context);
        context.getClass();
        nr1 d = nr1.d(getRoot());
        this.A = d;
        hrc hrcVar = (hrc) d.i;
        ConstraintLayout constraintLayout = hrcVar.a;
        TextView textView = hrcVar.d;
        hrc hrcVar2 = (hrc) d.h;
        ViewGroup viewGroup = hrcVar2.a;
        TextView textView2 = hrcVar2.d;
        setupLayoutTransitions(constraintLayout, viewGroup);
        m6.r(constraintLayout, textView.getId());
        this.B = d.b;
        this.C = textView;
        this.D = textView2;
        this.E = textView;
        this.F = hrcVar.b;
        this.G = textView2;
        this.H = hrcVar2.b;
        this.I = hrcVar.e;
        this.J = hrcVar2.e;
    }

    private final void setZeroValueColor(hrc hrcVar) {
        hrcVar.d.setTextColor(getContext().getColor(R.color.n_lv_3));
    }

    @Override // defpackage.m6
    @NotNull
    public List<Group> getFractionModeOnlyViews() {
        nr1 nr1Var = this.A;
        Group group = ((hrc) nr1Var.i).c;
        if (!getHomeActive()) {
            group = null;
        }
        return ph0.x(new Group[]{group, getAwayActive() ? ((hrc) nr1Var.h).c : null});
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.statistics_linear_progress_comparison_view;
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
    public final void l() {
        final int i = 0;
        u(crc.a, new Function1(this) { // from class: asc
            public final /* synthetic */ bsc b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = i;
                bsc bscVar = this.b;
                int intValue = ((Integer) obj).intValue();
                switch (i2) {
                    case 0:
                        ((ProgressBar) bscVar.A.g).setProgress(intValue);
                        break;
                    default:
                        ((ProgressBar) bscVar.A.f).setProgress(intValue);
                        break;
                }
                return Unit.a;
            }
        });
        final int i2 = 1;
        u(crc.b, new Function1(this) { // from class: asc
            public final /* synthetic */ bsc b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i2;
                bsc bscVar = this.b;
                int intValue = ((Integer) obj).intValue();
                switch (i22) {
                    case 0:
                        ((ProgressBar) bscVar.A.g).setProgress(intValue);
                        break;
                    default:
                        ((ProgressBar) bscVar.A.f).setProgress(intValue);
                        break;
                }
                return Unit.a;
            }
        });
    }

    @Override // defpackage.m6
    public final void t() {
        boolean contains = getZeroValuesSet().contains(crc.a);
        nr1 nr1Var = this.A;
        if (contains) {
            setZeroValueColor((hrc) nr1Var.i);
        } else {
            ProgressBar progressBar = (ProgressBar) nr1Var.g;
            hrc hrcVar = (hrc) nr1Var.i;
            loc locVar = loc.a;
            int homeDefaultColor = getHomeDefaultColor();
            progressBar.setProgressTintList(ColorStateList.valueOf(homeDefaultColor));
            hrcVar.d.setTextColor(homeDefaultColor);
        }
        if (getZeroValuesSet().contains(crc.b)) {
            setZeroValueColor((hrc) nr1Var.h);
            return;
        }
        ProgressBar progressBar2 = (ProgressBar) nr1Var.f;
        hrc hrcVar2 = (hrc) nr1Var.h;
        loc locVar2 = loc.a;
        loc locVar3 = loc.a;
        int awayDefaultColor = getAwayDefaultColor();
        progressBar2.setProgressTintList(ColorStateList.valueOf(awayDefaultColor));
        hrcVar2.d.setTextColor(awayDefaultColor);
    }
}
