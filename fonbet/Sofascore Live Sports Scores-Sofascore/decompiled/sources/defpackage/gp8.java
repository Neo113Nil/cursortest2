package defpackage;

import android.view.View;
import android.view.ViewStub;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.sofascore.results.view.typeheader.TypeHeaderView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gp8 implements krk {
    public final SwipeRefreshLayout a;
    public final AppBarLayout b;
    public final View c;
    public final ViewStub d;
    public final ComposeView e;
    public final TypeHeaderView f;
    public final RecyclerView g;
    public final SwipeRefreshLayout h;

    public gp8(SwipeRefreshLayout swipeRefreshLayout, AppBarLayout appBarLayout, View view, ViewStub viewStub, ComposeView composeView, TypeHeaderView typeHeaderView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout2) {
        this.a = swipeRefreshLayout;
        this.b = appBarLayout;
        this.c = view;
        this.d = viewStub;
        this.e = composeView;
        this.f = typeHeaderView;
        this.g = recyclerView;
        this.h = swipeRefreshLayout2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
