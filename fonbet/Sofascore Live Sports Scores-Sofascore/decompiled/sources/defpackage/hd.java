package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
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
/* loaded from: classes6.dex */
public final class hd implements krk {
    public final RelativeLayout a;
    public final AdBannerView b;
    public final LinearLayout c;
    public final ToolbarBackgroundAppBarLayout d;
    public final CollapsingToolbarLayout e;
    public final ExtendedFloatingActionButton f;
    public final bu1 g;
    public final ViewStub h;
    public final SofaTabLayout i;
    public final UnderlinedToolbar j;
    public final View k;
    public final ViewPager2 l;
    public final SwipeRefreshLayout m;

    public hd(RelativeLayout relativeLayout, AdBannerView adBannerView, LinearLayout linearLayout, ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, ExtendedFloatingActionButton extendedFloatingActionButton, bu1 bu1Var, ViewStub viewStub, SofaTabLayout sofaTabLayout, UnderlinedToolbar underlinedToolbar, View view, ViewPager2 viewPager2, SwipeRefreshLayout swipeRefreshLayout) {
        this.a = relativeLayout;
        this.b = adBannerView;
        this.c = linearLayout;
        this.d = toolbarBackgroundAppBarLayout;
        this.e = collapsingToolbarLayout;
        this.f = extendedFloatingActionButton;
        this.g = bu1Var;
        this.h = viewStub;
        this.i = sofaTabLayout;
        this.j = underlinedToolbar;
        this.k = view;
        this.l = viewPager2;
        this.m = swipeRefreshLayout;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
