package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class esc extends m6 {
    public final TextView A;
    public final TextView y;
    public final TextView z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esc(Context context) {
        super(context, null, true);
        context.getClass();
        View root = getRoot();
        int i = R.id.label;
        TextView textView = (TextView) nq8.B(R.id.label, root);
        if (textView != null) {
            i = R.id.value;
            TextView textView2 = (TextView) nq8.B(R.id.value, root);
            if (textView2 != null) {
                LinearLayout linearLayout = (LinearLayout) root;
                linearLayout.getClass();
                setupLayoutTransitions(linearLayout);
                this.y = textView;
                this.z = textView2;
                this.A = textView2;
                return;
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.mma_statistics_row_item_view;
    }

    @Override // defpackage.m6
    public /* bridge */ /* synthetic */ TextView getPrimaryDenominatorAway() {
        return (TextView) m785getPrimaryDenominatorAway();
    }

    @Override // defpackage.m6
    public /* bridge */ /* synthetic */ TextView getPrimaryDenominatorHome() {
        return (TextView) m786getPrimaryDenominatorHome();
    }

    @Override // defpackage.m6
    public /* bridge */ /* synthetic */ View getPrimaryHighlightAway() {
        return (View) m787getPrimaryHighlightAway();
    }

    @Override // defpackage.m6
    public /* bridge */ /* synthetic */ View getPrimaryHighlightHome() {
        return (View) m788getPrimaryHighlightHome();
    }

    @Override // defpackage.m6
    @NotNull
    public TextView getPrimaryLabel() {
        return this.y;
    }

    @Override // defpackage.m6
    public /* bridge */ /* synthetic */ TextView getPrimaryNumeratorAway() {
        return (TextView) m789getPrimaryNumeratorAway();
    }

    @Override // defpackage.m6
    @NotNull
    public TextView getPrimaryNumeratorHome() {
        return this.A;
    }

    @Override // defpackage.m6
    public /* bridge */ /* synthetic */ TextView getPrimaryPercentageAway() {
        return (TextView) m790getPrimaryPercentageAway();
    }

    @Override // defpackage.m6
    @NotNull
    public TextView getPrimaryPercentageHome() {
        return this.z;
    }

    @Nullable
    /* renamed from: getPrimaryDenominatorAway, reason: collision with other method in class */
    public Void m785getPrimaryDenominatorAway() {
        return null;
    }

    @Nullable
    /* renamed from: getPrimaryDenominatorHome, reason: collision with other method in class */
    public Void m786getPrimaryDenominatorHome() {
        return null;
    }

    @Nullable
    /* renamed from: getPrimaryHighlightAway, reason: collision with other method in class */
    public Void m787getPrimaryHighlightAway() {
        return null;
    }

    @Nullable
    /* renamed from: getPrimaryHighlightHome, reason: collision with other method in class */
    public Void m788getPrimaryHighlightHome() {
        return null;
    }

    @Nullable
    /* renamed from: getPrimaryNumeratorAway, reason: collision with other method in class */
    public Void m789getPrimaryNumeratorAway() {
        return null;
    }

    @Nullable
    /* renamed from: getPrimaryPercentageAway, reason: collision with other method in class */
    public Void m790getPrimaryPercentageAway() {
        return null;
    }

    @Override // defpackage.m6
    public final void l() {
    }

    @Override // defpackage.m6
    public final void t() {
    }
}
