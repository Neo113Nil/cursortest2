package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.sofascore.results.R;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class c68 extends o8 {
    public final gy4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c68(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.aggregated_result_view;
        View B = nq8.B(R.id.aggregated_result_view, root);
        if (B != null) {
            zl a = zl.a(B);
            int i2 = R.id.first_leg_root;
            if (((LinearLayout) nq8.B(R.id.first_leg_root, root)) != null) {
                i2 = R.id.first_leg_view;
                View B2 = nq8.B(R.id.first_leg_view, root);
                if (B2 != null) {
                    this.d = new gy4((LinearLayout) root, a, zl.a(B2));
                    o8.d(this, 0, 7);
                    setVisibility(8);
                    return;
                }
            }
            i = i2;
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @NotNull
    public final gy4 getBinding() {
        return this.d;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.details_first_leg_agg;
    }
}
