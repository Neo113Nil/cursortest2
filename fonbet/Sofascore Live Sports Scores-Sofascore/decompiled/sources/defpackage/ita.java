package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.mvvm.base.SofaTabLayout;
import com.sofascore.results.view.ToolbarBackgroundAppBarLayout;
import com.sofascore.results.view.header.CollapsibleSmallHeaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ita implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LeagueActivity b;

    public /* synthetic */ ita(LeagueActivity leagueActivity, int i) {
        this.a = i;
        this.b = leagueActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = 1;
        LeagueActivity leagueActivity = this.b;
        switch (i) {
            case 0:
                a99 a99Var = LeagueActivity.h0;
                Bundle extras = leagueActivity.getIntent().getExtras();
                return Integer.valueOf(extras != null ? extras.getInt("TOURNAMENT_ID") : 0);
            case 1:
                a99 a99Var2 = LeagueActivity.h0;
                leagueActivity.U().F();
                return Unit.a;
            case 2:
                a99 a99Var3 = LeagueActivity.h0;
                Bundle extras2 = leagueActivity.getIntent().getExtras();
                return Integer.valueOf(extras2 != null ? extras2.getInt("UNIQUE_TOURNAMENT_ID") : 0);
            case 3:
                a99 a99Var4 = LeagueActivity.h0;
                leagueActivity.R().k();
                return Unit.a;
            case 4:
                a99 a99Var5 = LeagueActivity.h0;
                Bundle extras3 = leagueActivity.getIntent().getExtras();
                if (extras3 != null) {
                    return Integer.valueOf(extras3.getInt("SEASON_ID"));
                }
                return null;
            case 5:
                a99 a99Var6 = LeagueActivity.h0;
                Bundle extras4 = leagueActivity.getIntent().getExtras();
                return Boolean.valueOf(Intrinsics.c(extras4 != null ? Boolean.valueOf(extras4.getBoolean("POSITION_ON_MEDIA")) : null, Boolean.TRUE));
            case 6:
                a99 a99Var7 = LeagueActivity.h0;
                Bundle extras5 = leagueActivity.getIntent().getExtras();
                return Boolean.valueOf(Intrinsics.c(extras5 != null ? Boolean.valueOf(extras5.getBoolean("POSITION_ON_TEAM_OF_THE_WEEK")) : null, Boolean.TRUE));
            case 7:
                a99 a99Var8 = LeagueActivity.h0;
                View inflate = leagueActivity.getLayoutInflater().inflate(R.layout.activity_league, (ViewGroup) null, false);
                int i3 = R.id.ad_banner_view;
                AdBannerView adBannerView = (AdBannerView) nq8.B(R.id.ad_banner_view, inflate);
                if (adBannerView != null) {
                    i3 = R.id.ad_container;
                    LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.ad_container, inflate);
                    if (linearLayout != null) {
                        i3 = R.id.app_bar_layout;
                        ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = (ToolbarBackgroundAppBarLayout) nq8.B(R.id.app_bar_layout, inflate);
                        if (toolbarBackgroundAppBarLayout != null) {
                            i3 = R.id.collapsing_space;
                            if (((Space) nq8.B(R.id.collapsing_space, inflate)) != null) {
                                i3 = R.id.collapsing_toolbar;
                                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) nq8.B(R.id.collapsing_toolbar, inflate);
                                if (collapsingToolbarLayout != null) {
                                    i3 = R.id.floating_action_button;
                                    ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) nq8.B(R.id.floating_action_button, inflate);
                                    if (extendedFloatingActionButton != null) {
                                        i3 = R.id.header_container;
                                        if (((CollapsibleSmallHeaderView) nq8.B(R.id.header_container, inflate)) != null) {
                                            i3 = R.id.header_view;
                                            View B = nq8.B(R.id.header_view, inflate);
                                            if (B != null) {
                                                bu1 b = bu1.b(B);
                                                i3 = R.id.info_banner;
                                                if (((ViewStub) nq8.B(R.id.info_banner, inflate)) != null) {
                                                    i3 = R.id.no_internet_view;
                                                    ViewStub viewStub = (ViewStub) nq8.B(R.id.no_internet_view, inflate);
                                                    if (viewStub != null) {
                                                        i3 = R.id.tabs;
                                                        SofaTabLayout sofaTabLayout = (SofaTabLayout) nq8.B(R.id.tabs, inflate);
                                                        if (sofaTabLayout != null) {
                                                            i3 = R.id.toolbar;
                                                            UnderlinedToolbar underlinedToolbar = (UnderlinedToolbar) nq8.B(R.id.toolbar, inflate);
                                                            if (underlinedToolbar != null) {
                                                                i3 = R.id.transparent_layer;
                                                                View B2 = nq8.B(R.id.transparent_layer, inflate);
                                                                if (B2 != null) {
                                                                    i3 = R.id.view_pager;
                                                                    ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.view_pager, inflate);
                                                                    if (viewPager2 != null) {
                                                                        i3 = R.id.viewpager_container;
                                                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) nq8.B(R.id.viewpager_container, inflate);
                                                                        if (swipeRefreshLayout != null) {
                                                                            return new hd((RelativeLayout) inflate, adBannerView, linearLayout, toolbarBackgroundAppBarLayout, collapsingToolbarLayout, extendedFloatingActionButton, b, viewStub, sofaTabLayout, underlinedToolbar, B2, viewPager2, swipeRefreshLayout);
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
                                }
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                return null;
            case 8:
                a99 a99Var9 = LeagueActivity.h0;
                ViewPager2 viewPager22 = leagueActivity.S().l;
                SofaTabLayout sofaTabLayout2 = leagueActivity.S().i;
                boolean booleanValue = ((Boolean) leagueActivity.N.getValue()).booleanValue();
                boolean booleanValue2 = ((Boolean) leagueActivity.O.getValue()).booleanValue();
                z4b z4bVar = new z4b(leagueActivity, viewPager22, sofaTabLayout2);
                z4bVar.r = booleanValue;
                z4bVar.s = booleanValue2;
                Bundle extras6 = leagueActivity.getIntent().getExtras();
                z4bVar.y = extras6 != null ? Integer.valueOf(extras6.getInt("initialFilter", -1)) : null;
                Bundle extras7 = leagueActivity.getIntent().getExtras();
                z4bVar.x = extras7 != null ? (boj) gz8.M(extras7, "initialTopStatsType", boj.class) : null;
                Bundle extras8 = leagueActivity.getIntent().getExtras();
                z4bVar.z = extras8 != null ? extras8.getString("positionOnGroup", null) : null;
                Bundle extras9 = leagueActivity.getIntent().getExtras();
                z4bVar.A = extras9 != null ? extras9.getString(MBInterstitialActivity.INTENT_CAMAPIGN) : null;
                z4bVar.o = new jta(leagueActivity, 1);
                return z4bVar;
            case 9:
                a99 a99Var10 = LeagueActivity.h0;
                leagueActivity.R().k();
                return Unit.a;
            default:
                a99 a99Var11 = LeagueActivity.h0;
                return new wq5(leagueActivity, i2);
        }
    }
}
