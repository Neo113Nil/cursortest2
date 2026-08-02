package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.mvvm.base.SofaTabLayout;
import com.sofascore.results.view.ToolbarBackgroundAppBarLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vc implements krk {
    public final RelativeLayout a;
    public final AdBannerView b;
    public final LinearLayout c;
    public final ToolbarBackgroundAppBarLayout d;
    public final ExtendedFloatingActionButton e;
    public final bu1 f;
    public final ViewStub g;
    public final SofaTabLayout h;
    public final UnderlinedToolbar i;
    public final View j;
    public final ViewPager2 k;
    public final SwipeRefreshLayout l;

    public vc(RelativeLayout relativeLayout, AdBannerView adBannerView, LinearLayout linearLayout, ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton, bu1 bu1Var, ViewStub viewStub, SofaTabLayout sofaTabLayout, UnderlinedToolbar underlinedToolbar, View view, ViewPager2 viewPager2, SwipeRefreshLayout swipeRefreshLayout) {
        this.a = relativeLayout;
        this.b = adBannerView;
        this.c = linearLayout;
        this.d = toolbarBackgroundAppBarLayout;
        this.e = extendedFloatingActionButton;
        this.f = bu1Var;
        this.g = viewStub;
        this.h = sofaTabLayout;
        this.i = underlinedToolbar;
        this.j = view;
        this.k = viewPager2;
        this.l = swipeRefreshLayout;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
