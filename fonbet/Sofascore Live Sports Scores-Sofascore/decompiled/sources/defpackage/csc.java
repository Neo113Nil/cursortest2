package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.sofascore.results.R;
import java.util.List;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class csc extends q6 {
    public final z3f t;
    public final TextView u;
    public final TextView v;
    public final TextView w;
    public final TextView x;
    public final List y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csc(Context context) {
        super(context);
        context.getClass();
        View root = getRoot();
        int i = R.id.indicator;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) nq8.B(R.id.indicator, root);
        if (linearProgressIndicator != null) {
            i = R.id.label;
            TextView textView = (TextView) nq8.B(R.id.label, root);
            if (textView != null) {
                i = R.id.text_layout;
                View B = nq8.B(R.id.text_layout, root);
                if (B != null) {
                    hrc a = hrc.a(B);
                    TextView textView2 = a.d;
                    this.t = new z3f((ConstraintLayout) root, linearProgressIndicator, textView, a);
                    this.u = textView;
                    this.v = textView2;
                    this.w = textView2;
                    this.x = a.b;
                    this.y = a.c(a.c);
                    return;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.r6
    @NotNull
    public List<Group> getFractionModeOnlyViews() {
        return this.y;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.statistics_linear_progress_view;
    }

    @Override // defpackage.r6
    @NotNull
    public TextView getPrimaryDenominator() {
        return this.x;
    }

    @Override // defpackage.r6
    @NotNull
    public TextView getPrimaryLabel() {
        return this.u;
    }

    @Override // defpackage.r6
    @NotNull
    public TextView getPrimaryNumerator() {
        return this.w;
    }

    @Override // defpackage.r6
    @NotNull
    public TextView getPrimaryPercentage() {
        return this.v;
    }

    @Override // defpackage.r6
    public final void l() {
        q(new mnc(this, 6));
    }

    @Override // defpackage.r6
    public final void p() {
        boolean contains = getZeroValuesSet().contains(crc.a);
        z3f z3fVar = this.t;
        if (contains) {
            ((hrc) z3fVar.d).d.setTextColor(getContext().getColor(R.color.n_lv_3));
        } else {
            ((LinearProgressIndicator) z3fVar.c).setIndicatorColor(getDefaultColor());
            ((hrc) z3fVar.d).d.setTextColor(getDefaultColor());
        }
    }
}
