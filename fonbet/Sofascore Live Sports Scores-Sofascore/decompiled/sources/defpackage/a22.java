package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.sofascore.results.view.typeheader.TypeHeaderView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class a22 implements krk {
    public final SwipeRefreshLayout a;
    public final AppBarLayout b;
    public final c75 c;
    public final GraphicLarge d;
    public final FrameLayout e;
    public final RecyclerView f;
    public final SwipeRefreshLayout g;
    public final TypeHeaderView h;
    public final SegmentedButtonsView i;

    public a22(SwipeRefreshLayout swipeRefreshLayout, AppBarLayout appBarLayout, c75 c75Var, GraphicLarge graphicLarge, FrameLayout frameLayout, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout2, TypeHeaderView typeHeaderView, SegmentedButtonsView segmentedButtonsView) {
        this.a = swipeRefreshLayout;
        this.b = appBarLayout;
        this.c = c75Var;
        this.d = graphicLarge;
        this.e = frameLayout;
        this.f = recyclerView;
        this.g = swipeRefreshLayout2;
        this.h = typeHeaderView;
        this.i = segmentedButtonsView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
