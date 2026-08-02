package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.sofascore.results.R;
import com.sofascore.results.view.ToolbarBackgroundAppBarLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yd3 implements krk {
    public final CoordinatorLayout a;
    public final ToolbarBackgroundAppBarLayout b;
    public final ComposeView c;
    public final z3f d;

    public yd3(CoordinatorLayout coordinatorLayout, ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout, ComposeView composeView, z3f z3fVar) {
        this.a = coordinatorLayout;
        this.b = toolbarBackgroundAppBarLayout;
        this.c = composeView;
        this.d = z3fVar;
    }

    public static yd3 a(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.compose_activity_with_toolbar, (ViewGroup) null, false);
        int i = R.id.app_bar_layout;
        ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = (ToolbarBackgroundAppBarLayout) nq8.B(R.id.app_bar_layout, inflate);
        if (toolbarBackgroundAppBarLayout != null) {
            i = R.id.compose_view;
            ComposeView composeView = (ComposeView) nq8.B(R.id.compose_view, inflate);
            if (composeView != null) {
                i = R.id.toolbar;
                View B = nq8.B(R.id.toolbar, inflate);
                if (B != null) {
                    return new yd3((CoordinatorLayout) inflate, toolbarBackgroundAppBarLayout, composeView, z3f.b(B));
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
