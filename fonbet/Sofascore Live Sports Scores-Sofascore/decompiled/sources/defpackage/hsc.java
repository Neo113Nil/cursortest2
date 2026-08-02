package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hsc extends r6 {
    public final mqb r;
    public final TextView s;
    public final TextView t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hsc(Context context) {
        super(context, true);
        context.getClass();
        View root = getRoot();
        TextView textView = (TextView) nq8.B(R.id.value, root);
        if (textView == null) {
            yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(R.id.value)));
            throw null;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) root;
        this.r = new mqb(constraintLayout, textView, 1);
        constraintLayout.getClass();
        setupLayoutTransitions(constraintLayout);
        this.s = textView;
        this.t = textView;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.mma_statistics_textual_value_view;
    }

    @Override // defpackage.r6
    public /* bridge */ /* synthetic */ TextView getPrimaryDenominator() {
        return (TextView) m874getPrimaryDenominator();
    }

    @Override // defpackage.r6
    public /* bridge */ /* synthetic */ TextView getPrimaryLabel() {
        return (TextView) m875getPrimaryLabel();
    }

    @Override // defpackage.r6
    @NotNull
    public TextView getPrimaryNumerator() {
        return this.t;
    }

    @Override // defpackage.r6
    @NotNull
    public TextView getPrimaryPercentage() {
        return this.s;
    }

    @Override // defpackage.r6
    public final void p() {
        int color = getContext().getColor(R.color.n_lv_3);
        if (!getZeroValuesSet().contains(crc.a)) {
            color = getDefaultColor();
        }
        this.r.c.setTextColor(color);
    }

    @Override // defpackage.r6
    public void setPercentageDisplay(@NotNull xqc xqcVar) {
        xqcVar.getClass();
        setFractionalDisplay(xqcVar);
    }

    @Nullable
    /* renamed from: getPrimaryDenominator, reason: collision with other method in class */
    public Void m874getPrimaryDenominator() {
        return null;
    }

    @Nullable
    /* renamed from: getPrimaryLabel, reason: collision with other method in class */
    public Void m875getPrimaryLabel() {
        return null;
    }

    @Override // defpackage.r6
    public final void l() {
    }
}
