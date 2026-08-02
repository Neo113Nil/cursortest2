package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.sofascore.results.R;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qrc extends q6 {
    public final xxb A;
    public final ed t;
    public final TextView u;
    public final TextView v;
    public final TextView w;
    public final TextView x;
    public final List y;
    public final List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qrc(Context context) {
        super(context);
        context.getClass();
        View root = getRoot();
        int i = R.id.label;
        TextView textView = (TextView) nq8.B(R.id.label, root);
        if (textView != null) {
            i = R.id.progress_view;
            View B = nq8.B(R.id.progress_view, root);
            if (B != null) {
                frc a = frc.a(B);
                TextView textView2 = a.g;
                this.t = new ed(15, textView, (ConstraintLayout) root, a);
                this.u = textView;
                this.v = textView2;
                this.w = a.d;
                this.x = a.b;
                this.y = a.c(a.c);
                this.z = a.c(textView2);
                this.A = new xxb(this, 7);
                return;
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
        return R.layout.mma_statistics_circular_progress_view;
    }

    @Override // defpackage.r6
    @NotNull
    public List<TextView> getPercentageModeOnlyViews() {
        return this.z;
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
    @NotNull
    public Function0<Unit> getTransitionCallback() {
        return this.A;
    }

    @Override // defpackage.r6
    public final void l() {
        q(new mnc(this, 5));
    }

    @Override // defpackage.r6
    public final void p() {
        boolean contains = getZeroValuesSet().contains(crc.a);
        ed edVar = this.t;
        if (!contains) {
            frc frcVar = (frc) edVar.c;
            frc frcVar2 = (frc) edVar.c;
            frcVar.f.setIndicatorColor(getDefaultColor());
            frcVar2.f.setTrackColor(getHighlightColor());
            frcVar2.g.setTextColor(getDefaultColor());
            frcVar2.d.setTextColor(getDefaultColor());
            return;
        }
        int color = getContext().getColor(R.color.n_lv_5);
        int color2 = getContext().getColor(R.color.n_lv_3);
        frc frcVar3 = (frc) edVar.c;
        frc frcVar4 = (frc) edVar.c;
        frcVar3.f.setTrackColor(color);
        frcVar4.g.setTextColor(color2);
        frcVar4.d.setTextColor(color2);
    }
}
