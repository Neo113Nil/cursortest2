package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.mvvm.base.SofaTabLayout;
import com.sofascore.results.view.ToolbarBackgroundAppBarLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bti implements krk {
    public final CoordinatorLayout a;
    public final AdBannerView b;
    public final ToolbarBackgroundAppBarLayout c;
    public final CollapsingToolbarLayout d;
    public final CoordinatorLayout e;
    public final ViewStub f;
    public final SofaTabLayout g;
    public final z3f h;
    public final ViewPager2 i;

    public bti(CoordinatorLayout coordinatorLayout, AdBannerView adBannerView, ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, CoordinatorLayout coordinatorLayout2, ViewStub viewStub, SofaTabLayout sofaTabLayout, z3f z3fVar, ViewPager2 viewPager2) {
        this.a = coordinatorLayout;
        this.b = adBannerView;
        this.c = toolbarBackgroundAppBarLayout;
        this.d = collapsingToolbarLayout;
        this.e = coordinatorLayout2;
        this.f = viewStub;
        this.g = sofaTabLayout;
        this.h = z3fVar;
        this.i = viewPager2;
    }

    public static bti a(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.tabs_activity_layout, (ViewGroup) null, false);
        int i = R.id.ad_banner_view;
        AdBannerView adBannerView = (AdBannerView) nq8.B(R.id.ad_banner_view, inflate);
        if (adBannerView != null) {
            i = R.id.app_bar;
            ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = (ToolbarBackgroundAppBarLayout) nq8.B(R.id.app_bar, inflate);
            if (toolbarBackgroundAppBarLayout != null) {
                i = R.id.collapsing_toolbar;
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) nq8.B(R.id.collapsing_toolbar, inflate);
                if (collapsingToolbarLayout != null) {
                    i = R.id.content_holder;
                    if (((RelativeLayout) nq8.B(R.id.content_holder, inflate)) != null) {
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                        i = R.id.info_banner;
                        if (((ViewStub) nq8.B(R.id.info_banner, inflate)) != null) {
                            i = R.id.loading_view;
                            if (((ViewStub) nq8.B(R.id.loading_view, inflate)) != null) {
                                i = R.id.no_internet_view;
                                ViewStub viewStub = (ViewStub) nq8.B(R.id.no_internet_view, inflate);
                                if (viewStub != null) {
                                    i = R.id.tabs;
                                    SofaTabLayout sofaTabLayout = (SofaTabLayout) nq8.B(R.id.tabs, inflate);
                                    if (sofaTabLayout != null) {
                                        i = R.id.toolbar;
                                        View B = nq8.B(R.id.toolbar, inflate);
                                        if (B != null) {
                                            z3f b = z3f.b(B);
                                            i = R.id.view_pager;
                                            ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.view_pager, inflate);
                                            if (viewPager2 != null) {
                                                return new bti(coordinatorLayout, adBannerView, toolbarBackgroundAppBarLayout, collapsingToolbarLayout, coordinatorLayout, viewStub, sofaTabLayout, b, viewPager2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
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
