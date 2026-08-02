package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.results.mvvm.base.SofaTabLayout;
import com.sofascore.results.view.ToolbarBackgroundAppBarLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class df implements krk {
    public final CoordinatorLayout a;
    public final ToolbarBackgroundAppBarLayout b;
    public final ViewStub c;
    public final TextView d;
    public final TextView e;
    public final SofaTabLayout f;
    public final UnderlinedToolbar g;
    public final FrameLayout h;
    public final ViewPager2 i;
    public final SwipeRefreshLayout j;

    public df(CoordinatorLayout coordinatorLayout, ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout, ViewStub viewStub, TextView textView, TextView textView2, SofaTabLayout sofaTabLayout, UnderlinedToolbar underlinedToolbar, FrameLayout frameLayout, ViewPager2 viewPager2, SwipeRefreshLayout swipeRefreshLayout) {
        this.a = coordinatorLayout;
        this.b = toolbarBackgroundAppBarLayout;
        this.c = viewStub;
        this.d = textView;
        this.e = textView2;
        this.f = sofaTabLayout;
        this.g = underlinedToolbar;
        this.h = frameLayout;
        this.i = viewPager2;
        this.j = swipeRefreshLayout;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
