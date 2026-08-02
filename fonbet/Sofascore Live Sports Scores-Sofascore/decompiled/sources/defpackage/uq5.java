package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.chat.ChatActivity;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.mvvm.base.SofaTabLayout;
import com.sofascore.results.view.ToolbarBackgroundAppBarLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class uq5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventActivity b;

    public /* synthetic */ uq5(EventActivity eventActivity, int i) {
        this.a = i;
        this.b = eventActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        int i = this.a;
        int i2 = 0;
        EventActivity eventActivity = this.b;
        switch (i) {
            case 0:
                wxf wxfVar = EventActivity.h0;
                break;
            case 1:
                wxf wxfVar2 = EventActivity.h0;
                View inflate = eventActivity.getLayoutInflater().inflate(R.layout.activity_details, (ViewGroup) null, false);
                int i3 = R.id.ad_banner_view;
                AdBannerView adBannerView = (AdBannerView) nq8.B(R.id.ad_banner_view, inflate);
                if (adBannerView != null) {
                    i3 = R.id.app_bar_layout;
                    ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = (ToolbarBackgroundAppBarLayout) nq8.B(R.id.app_bar_layout, inflate);
                    if (toolbarBackgroundAppBarLayout != null) {
                        i3 = R.id.collapsing_toolbar;
                        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) nq8.B(R.id.collapsing_toolbar, inflate);
                        if (collapsingToolbarLayout != null) {
                            i3 = R.id.coordinator;
                            if (((CoordinatorLayout) nq8.B(R.id.coordinator, inflate)) != null) {
                                i3 = R.id.floating_action_button;
                                ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) nq8.B(R.id.floating_action_button, inflate);
                                if (extendedFloatingActionButton != null) {
                                    i3 = R.id.header_container;
                                    FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.header_container, inflate);
                                    if (frameLayout != null) {
                                        i3 = R.id.no_internet_view;
                                        ViewStub viewStub = (ViewStub) nq8.B(R.id.no_internet_view, inflate);
                                        if (viewStub != null) {
                                            i3 = R.id.swipe_refresh_layout;
                                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) nq8.B(R.id.swipe_refresh_layout, inflate);
                                            if (swipeRefreshLayout != null) {
                                                i3 = R.id.tabs_view;
                                                SofaTabLayout sofaTabLayout = (SofaTabLayout) nq8.B(R.id.tabs_view, inflate);
                                                if (sofaTabLayout != null) {
                                                    i3 = R.id.toolbar;
                                                    UnderlinedToolbar underlinedToolbar = (UnderlinedToolbar) nq8.B(R.id.toolbar, inflate);
                                                    if (underlinedToolbar != null) {
                                                        i3 = R.id.view_pager;
                                                        ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.view_pager, inflate);
                                                        if (viewPager2 != null) {
                                                            break;
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
                break;
            case 2:
                wxf wxfVar3 = EventActivity.h0;
                break;
            case 3:
                wxf wxfVar4 = EventActivity.h0;
                Bundle extras = eventActivity.getIntent().getExtras();
                break;
            case 4:
                wxf wxfVar5 = EventActivity.h0;
                break;
            case 5:
                wxf wxfVar6 = EventActivity.h0;
                eventActivity.N();
                break;
            case 6:
                wxf wxfVar7 = EventActivity.h0;
                yk ykVar = new yk(eventActivity);
                ykVar.setOnDismissListener(new j0(eventActivity, 2));
                break;
            case 7:
                wxf wxfVar8 = EventActivity.h0;
                break;
            case 8:
                wxf wxfVar9 = EventActivity.h0;
                break;
            case 9:
                wxf wxfVar10 = EventActivity.h0;
                eventActivity.U().F();
                break;
            default:
                wxf wxfVar11 = EventActivity.h0;
                eventActivity.T().M = true;
                Event event = (Event) eventActivity.T().v.d();
                String s = event != null ? ok3.s(event) : null;
                Tournament tournament = event;
                if (Intrinsics.c(s, Sports.MMA)) {
                    tournament = event.getTournament();
                }
                if (tournament != null) {
                    if (eventActivity.R().k.getCurrentItem() == 0) {
                        tu[] tuVarArr = tu.a;
                        str = "bubble";
                    } else {
                        tu[] tuVarArr2 = tu.a;
                        str = "bubble_other_tab";
                    }
                    de deVar = eventActivity.e0;
                    int i4 = ChatActivity.Z;
                    deVar.a(uic.r(eventActivity, tournament, str, eventActivity.T().t, 24), null);
                }
                break;
        }
        return Unit.a;
    }
}
