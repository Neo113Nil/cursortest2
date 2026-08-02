package defpackage;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vxc implements krk {
    public final ConstraintLayout a;
    public final View b;
    public final ComposeView c;
    public final ComposeView d;
    public final ComposeView e;

    public vxc(ConstraintLayout constraintLayout, View view, ComposeView composeView, ComposeView composeView2, ComposeView composeView3) {
        this.a = constraintLayout;
        this.b = view;
        this.c = composeView;
        this.d = composeView2;
        this.e = composeView3;
    }

    public static vxc a(View view) {
        int i = R.id.bottom_divider;
        View B = nq8.B(R.id.bottom_divider, view);
        if (B != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.spinner_first;
            ComposeView composeView = (ComposeView) nq8.B(R.id.spinner_first, view);
            if (composeView != null) {
                i = R.id.spinner_second;
                ComposeView composeView2 = (ComposeView) nq8.B(R.id.spinner_second, view);
                if (composeView2 != null) {
                    i = R.id.spinner_third;
                    ComposeView composeView3 = (ComposeView) nq8.B(R.id.spinner_third, view);
                    if (composeView3 != null) {
                        return new vxc(constraintLayout, B, composeView, composeView2, composeView3);
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
