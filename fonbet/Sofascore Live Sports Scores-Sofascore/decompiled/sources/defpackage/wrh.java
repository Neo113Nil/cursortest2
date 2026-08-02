package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wrh implements krk {
    public final FrameLayout a;
    public final ComposeView b;
    public final FrameLayout c;

    public wrh(FrameLayout frameLayout, ComposeView composeView, FrameLayout frameLayout2) {
        this.a = frameLayout;
        this.b = composeView;
        this.c = frameLayout2;
    }

    public static wrh a(View view) {
        int i = R.id.compose_view;
        ComposeView composeView = (ComposeView) nq8.B(R.id.compose_view, view);
        if (composeView != null) {
            i = R.id.tooltip_container;
            FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.tooltip_container, view);
            if (frameLayout != null) {
                return new wrh((FrameLayout) view, composeView, frameLayout);
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static wrh b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.sofa_compose_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
