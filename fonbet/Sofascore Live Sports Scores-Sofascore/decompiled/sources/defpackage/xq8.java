package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xq8 implements krk {
    public final SwipeRefreshLayout a;
    public final AppBarLayout b;
    public final RecyclerView c;
    public final SwipeRefreshLayout d;

    public xq8(SwipeRefreshLayout swipeRefreshLayout, AppBarLayout appBarLayout, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout2) {
        this.a = swipeRefreshLayout;
        this.b = appBarLayout;
        this.c = recyclerView;
        this.d = swipeRefreshLayout2;
    }

    public static xq8 a(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.fragment_with_appbar_layout, (ViewGroup) null, false);
        int i = R.id.app_bar_layout;
        AppBarLayout appBarLayout = (AppBarLayout) nq8.B(R.id.app_bar_layout, inflate);
        if (appBarLayout != null) {
            i = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
            if (recyclerView != null) {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate;
                return new xq8(swipeRefreshLayout, appBarLayout, recyclerView, swipeRefreshLayout);
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
