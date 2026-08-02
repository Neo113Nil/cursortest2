package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.mvvm.base.SofaTabLayout;
import com.sofascore.results.view.ToolbarBackgroundAppBarLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cd implements krk {
    public final RelativeLayout a;
    public final AdBannerView b;
    public final ToolbarBackgroundAppBarLayout c;
    public final CollapsingToolbarLayout d;
    public final ExtendedFloatingActionButton e;
    public final FrameLayout f;
    public final ViewStub g;
    public final SwipeRefreshLayout h;
    public final SofaTabLayout i;
    public final UnderlinedToolbar j;
    public final ViewPager2 k;

    public cd(RelativeLayout relativeLayout, AdBannerView adBannerView, ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, ExtendedFloatingActionButton extendedFloatingActionButton, FrameLayout frameLayout, ViewStub viewStub, SwipeRefreshLayout swipeRefreshLayout, SofaTabLayout sofaTabLayout, UnderlinedToolbar underlinedToolbar, ViewPager2 viewPager2) {
        this.a = relativeLayout;
        this.b = adBannerView;
        this.c = toolbarBackgroundAppBarLayout;
        this.d = collapsingToolbarLayout;
        this.e = extendedFloatingActionButton;
        this.f = frameLayout;
        this.g = viewStub;
        this.h = swipeRefreshLayout;
        this.i = sofaTabLayout;
        this.j = underlinedToolbar;
        this.k = viewPager2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
