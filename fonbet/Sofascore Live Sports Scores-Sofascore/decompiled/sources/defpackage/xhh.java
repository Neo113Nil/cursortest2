package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xhh implements krk {
    public final FrameLayout a;
    public final View b;
    public final ComposeView c;
    public final FrameLayout d;

    public xhh(FrameLayout frameLayout, View view, ComposeView composeView, FrameLayout frameLayout2) {
        this.a = frameLayout;
        this.b = view;
        this.c = composeView;
        this.d = frameLayout2;
    }

    public static xhh a(LayoutInflater layoutInflater, RecyclerView recyclerView) {
        View inflate = layoutInflater.inflate(R.layout.single_dropdown_layout, (ViewGroup) recyclerView, false);
        int i = R.id.bottom_divider;
        View B = nq8.B(R.id.bottom_divider, inflate);
        if (B != null) {
            i = R.id.spinner;
            ComposeView composeView = (ComposeView) nq8.B(R.id.spinner, inflate);
            if (composeView != null) {
                FrameLayout frameLayout = (FrameLayout) inflate;
                return new xhh(frameLayout, B, composeView, frameLayout);
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
