package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.results.view.ToolbarBackgroundAppBarLayout;
import com.sofascore.results.view.typeheader.TypeHeaderView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class id implements krk {
    public final RelativeLayout a;
    public final ToolbarBackgroundAppBarLayout b;
    public final w82 c;
    public final ViewStub d;
    public final RecyclerView e;
    public final TypeHeaderView f;
    public final UnderlinedToolbar g;
    public final View h;
    public final SwipeRefreshLayout i;

    public id(RelativeLayout relativeLayout, ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout, w82 w82Var, ViewStub viewStub, RecyclerView recyclerView, TypeHeaderView typeHeaderView, UnderlinedToolbar underlinedToolbar, View view, SwipeRefreshLayout swipeRefreshLayout) {
        this.a = relativeLayout;
        this.b = toolbarBackgroundAppBarLayout;
        this.c = w82Var;
        this.d = viewStub;
        this.e = recyclerView;
        this.f = typeHeaderView;
        this.g = underlinedToolbar;
        this.h = view;
        this.i = swipeRefreshLayout;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
