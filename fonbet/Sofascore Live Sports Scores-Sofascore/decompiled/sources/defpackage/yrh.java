package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yrh implements krk {
    public final CoordinatorLayout a;
    public final ComposeView b;

    public yrh(CoordinatorLayout coordinatorLayout, ComposeView composeView) {
        this.a = coordinatorLayout;
        this.b = composeView;
    }

    public static yrh a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.sofa_interop_compose_view, viewGroup, false);
        ComposeView composeView = (ComposeView) nq8.B(R.id.compose_view, inflate);
        if (composeView != null) {
            return new yrh((CoordinatorLayout) inflate, composeView);
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.compose_view)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
