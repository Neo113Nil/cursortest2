package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.results.R;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rp8 implements krk {
    public final FrameLayout a;
    public final GraphicLarge b;
    public final RecyclerView c;
    public final SwipeRefreshLayout d;

    public rp8(FrameLayout frameLayout, GraphicLarge graphicLarge, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        this.a = frameLayout;
        this.b = graphicLarge;
        this.c = recyclerView;
        this.d = swipeRefreshLayout;
    }

    public static rp8 a(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.fragment_stage_series_week, (ViewGroup) null, false);
        int i = R.id.internet_connection_empty_state;
        GraphicLarge graphicLarge = (GraphicLarge) nq8.B(R.id.internet_connection_empty_state, inflate);
        if (graphicLarge != null) {
            i = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
            if (recyclerView != null) {
                i = R.id.refresh_layout;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) nq8.B(R.id.refresh_layout, inflate);
                if (swipeRefreshLayout != null) {
                    return new rp8((FrameLayout) inflate, graphicLarge, recyclerView, swipeRefreshLayout);
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
