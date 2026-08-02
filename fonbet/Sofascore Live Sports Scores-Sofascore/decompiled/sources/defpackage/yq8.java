package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yq8 implements krk {
    public final SwipeRefreshLayout a;
    public final LinearLayout b;
    public final RecyclerView c;
    public final SwipeRefreshLayout d;
    public final FrameLayout e;

    public yq8(SwipeRefreshLayout swipeRefreshLayout, LinearLayout linearLayout, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout2, FrameLayout frameLayout) {
        this.a = swipeRefreshLayout;
        this.b = linearLayout;
        this.c = recyclerView;
        this.d = swipeRefreshLayout2;
        this.e = frameLayout;
    }

    public static yq8 a(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.fragment_with_floating_header, (ViewGroup) null, false);
        int i = R.id.floating_header_container;
        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.floating_header_container, inflate);
        if (linearLayout != null) {
            i = R.id.progress_bar;
            if (((CircularProgressIndicator) nq8.B(R.id.progress_bar, inflate)) != null) {
                i = R.id.recycler_view;
                RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
                if (recyclerView != null) {
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate;
                    i = R.id.sticky_header_container;
                    FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.sticky_header_container, inflate);
                    if (frameLayout != null) {
                        return new yq8(swipeRefreshLayout, linearLayout, recyclerView, swipeRefreshLayout, frameLayout);
                    }
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
