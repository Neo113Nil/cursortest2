package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.appbar.AppBarLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ad implements krk {
    public final LinearLayout a;
    public final ComposeView b;
    public final z3f c;

    public ad(LinearLayout linearLayout, ComposeView composeView, z3f z3fVar) {
        this.a = linearLayout;
        this.b = composeView;
        this.c = z3fVar;
    }

    public static ad a(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.activity_compose_view, (ViewGroup) null, false);
        int i = R.id.ad_view_container;
        View B = nq8.B(R.id.ad_view_container, inflate);
        if (B != null) {
            hcb.a(B);
            i = R.id.compose_view;
            ComposeView composeView = (ComposeView) nq8.B(R.id.compose_view, inflate);
            if (composeView != null) {
                i = R.id.toolbar;
                View B2 = nq8.B(R.id.toolbar, inflate);
                if (B2 != null) {
                    z3f b = z3f.b(B2);
                    if (((AppBarLayout) nq8.B(R.id.toolbar_holder, inflate)) != null) {
                        return new ad((LinearLayout) inflate, composeView, b);
                    }
                    i = R.id.toolbar_holder;
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
