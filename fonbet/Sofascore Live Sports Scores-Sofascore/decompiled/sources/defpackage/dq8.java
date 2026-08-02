package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.sofascore.results.view.typeheader.TypeHeaderView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class dq8 implements krk {
    public final SwipeRefreshLayout a;
    public final ExtendedFloatingActionButton b;
    public final ComposeView c;
    public final NestedScrollView d;
    public final FrameLayout e;
    public final ComposeView f;
    public final SegmentedButtonsView g;
    public final RecyclerView h;
    public final SwipeRefreshLayout i;
    public final TypeHeaderView j;

    public dq8(SwipeRefreshLayout swipeRefreshLayout, ExtendedFloatingActionButton extendedFloatingActionButton, ComposeView composeView, NestedScrollView nestedScrollView, FrameLayout frameLayout, ComposeView composeView2, SegmentedButtonsView segmentedButtonsView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout2, TypeHeaderView typeHeaderView) {
        this.a = swipeRefreshLayout;
        this.b = extendedFloatingActionButton;
        this.c = composeView;
        this.d = nestedScrollView;
        this.e = frameLayout;
        this.f = composeView2;
        this.g = segmentedButtonsView;
        this.h = recyclerView;
        this.i = swipeRefreshLayout2;
        this.j = typeHeaderView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
