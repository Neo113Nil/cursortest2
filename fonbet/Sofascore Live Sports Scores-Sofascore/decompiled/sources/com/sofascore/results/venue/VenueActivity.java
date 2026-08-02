package com.sofascore.results.venue;

import android.app.assist.AssistContent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.model.mvvm.model.Venue;
import com.sofascore.model.newNetwork.VenueResponse;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.SofaTabLayout;
import com.sofascore.results.venue.VenueActivity;
import com.sofascore.results.view.ToolbarBackgroundAppBarLayout;
import defpackage.anc;
import defpackage.bnk;
import defpackage.cnk;
import defpackage.df;
import defpackage.dnk;
import defpackage.dok;
import defpackage.duf;
import defpackage.mqi;
import defpackage.otk;
import defpackage.q5a;
import defpackage.qdj;
import defpackage.u8f;
import defpackage.un0;
import defpackage.xw3;
import defpackage.ygi;
import defpackage.ypa;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/venue/VenueActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VenueActivity extends Hilt_VenueActivity {
    public static final /* synthetic */ int Q = 0;
    public final otk K;
    public final mqi L;
    public final mqi M;
    public final mqi N;
    public boolean O;
    public final mqi P;

    public VenueActivity() {
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        this.K = new otk(duf.a.getOrCreateKotlinClass(dnk.class), new cnk(this, i2), new cnk(this, i), new cnk(this, i3));
        this.L = ypa.b(new Function0(this) { // from class: ank
            public final /* synthetic */ VenueActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i;
                VenueActivity venueActivity = this.b;
                switch (i4) {
                    case 0:
                        int i5 = VenueActivity.Q;
                        View inflate = venueActivity.getLayoutInflater().inflate(R.layout.activity_venue, (ViewGroup) null, false);
                        int i6 = R.id.app_bar_layout;
                        ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = (ToolbarBackgroundAppBarLayout) nq8.B(R.id.app_bar_layout, inflate);
                        if (toolbarBackgroundAppBarLayout != null) {
                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                            i6 = R.id.info_banner;
                            if (((ViewStub) nq8.B(R.id.info_banner, inflate)) != null) {
                                i6 = R.id.no_internet_view;
                                ViewStub viewStub = (ViewStub) nq8.B(R.id.no_internet_view, inflate);
                                if (viewStub != null) {
                                    i6 = R.id.primary_label;
                                    TextView textView = (TextView) nq8.B(R.id.primary_label, inflate);
                                    if (textView != null) {
                                        i6 = R.id.secondaryLabel;
                                        TextView textView2 = (TextView) nq8.B(R.id.secondaryLabel, inflate);
                                        if (textView2 != null) {
                                            i6 = R.id.tabs;
                                            SofaTabLayout sofaTabLayout = (SofaTabLayout) nq8.B(R.id.tabs, inflate);
                                            if (sofaTabLayout != null) {
                                                i6 = R.id.toolbar;
                                                UnderlinedToolbar underlinedToolbar = (UnderlinedToolbar) nq8.B(R.id.toolbar, inflate);
                                                if (underlinedToolbar != null) {
                                                    i6 = R.id.toolbar_holder;
                                                    FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.toolbar_holder, inflate);
                                                    if (frameLayout != null) {
                                                        i6 = R.id.view_pager;
                                                        ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.view_pager, inflate);
                                                        if (viewPager2 != null) {
                                                            i6 = R.id.viewpager_container;
                                                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) nq8.B(R.id.viewpager_container, inflate);
                                                            if (swipeRefreshLayout != null) {
                                                                return new df(coordinatorLayout, toolbarBackgroundAppBarLayout, viewStub, textView, textView2, sofaTabLayout, underlinedToolbar, frameLayout, viewPager2, swipeRefreshLayout);
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
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
                        return null;
                    case 1:
                        int i7 = VenueActivity.Q;
                        return new dok(venueActivity, venueActivity.Q().i, venueActivity.Q().f);
                    case 2:
                        int i8 = VenueActivity.Q;
                        Bundle extras = venueActivity.getIntent().getExtras();
                        return Integer.valueOf(extras != null ? extras.getInt("venue_id") : 0);
                    case 3:
                        int i9 = VenueActivity.Q;
                        venueActivity.N();
                        return Unit.a;
                    default:
                        int i10 = VenueActivity.Q;
                        return Integer.valueOf(ao2.s(12, venueActivity));
                }
            }
        });
        this.M = ypa.b(new Function0(this) { // from class: ank
            public final /* synthetic */ VenueActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i2;
                VenueActivity venueActivity = this.b;
                switch (i4) {
                    case 0:
                        int i5 = VenueActivity.Q;
                        View inflate = venueActivity.getLayoutInflater().inflate(R.layout.activity_venue, (ViewGroup) null, false);
                        int i6 = R.id.app_bar_layout;
                        ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = (ToolbarBackgroundAppBarLayout) nq8.B(R.id.app_bar_layout, inflate);
                        if (toolbarBackgroundAppBarLayout != null) {
                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                            i6 = R.id.info_banner;
                            if (((ViewStub) nq8.B(R.id.info_banner, inflate)) != null) {
                                i6 = R.id.no_internet_view;
                                ViewStub viewStub = (ViewStub) nq8.B(R.id.no_internet_view, inflate);
                                if (viewStub != null) {
                                    i6 = R.id.primary_label;
                                    TextView textView = (TextView) nq8.B(R.id.primary_label, inflate);
                                    if (textView != null) {
                                        i6 = R.id.secondaryLabel;
                                        TextView textView2 = (TextView) nq8.B(R.id.secondaryLabel, inflate);
                                        if (textView2 != null) {
                                            i6 = R.id.tabs;
                                            SofaTabLayout sofaTabLayout = (SofaTabLayout) nq8.B(R.id.tabs, inflate);
                                            if (sofaTabLayout != null) {
                                                i6 = R.id.toolbar;
                                                UnderlinedToolbar underlinedToolbar = (UnderlinedToolbar) nq8.B(R.id.toolbar, inflate);
                                                if (underlinedToolbar != null) {
                                                    i6 = R.id.toolbar_holder;
                                                    FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.toolbar_holder, inflate);
                                                    if (frameLayout != null) {
                                                        i6 = R.id.view_pager;
                                                        ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.view_pager, inflate);
                                                        if (viewPager2 != null) {
                                                            i6 = R.id.viewpager_container;
                                                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) nq8.B(R.id.viewpager_container, inflate);
                                                            if (swipeRefreshLayout != null) {
                                                                return new df(coordinatorLayout, toolbarBackgroundAppBarLayout, viewStub, textView, textView2, sofaTabLayout, underlinedToolbar, frameLayout, viewPager2, swipeRefreshLayout);
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
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
                        return null;
                    case 1:
                        int i7 = VenueActivity.Q;
                        return new dok(venueActivity, venueActivity.Q().i, venueActivity.Q().f);
                    case 2:
                        int i8 = VenueActivity.Q;
                        Bundle extras = venueActivity.getIntent().getExtras();
                        return Integer.valueOf(extras != null ? extras.getInt("venue_id") : 0);
                    case 3:
                        int i9 = VenueActivity.Q;
                        venueActivity.N();
                        return Unit.a;
                    default:
                        int i10 = VenueActivity.Q;
                        return Integer.valueOf(ao2.s(12, venueActivity));
                }
            }
        });
        this.N = ypa.b(new Function0(this) { // from class: ank
            public final /* synthetic */ VenueActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                VenueActivity venueActivity = this.b;
                switch (i4) {
                    case 0:
                        int i5 = VenueActivity.Q;
                        View inflate = venueActivity.getLayoutInflater().inflate(R.layout.activity_venue, (ViewGroup) null, false);
                        int i6 = R.id.app_bar_layout;
                        ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = (ToolbarBackgroundAppBarLayout) nq8.B(R.id.app_bar_layout, inflate);
                        if (toolbarBackgroundAppBarLayout != null) {
                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                            i6 = R.id.info_banner;
                            if (((ViewStub) nq8.B(R.id.info_banner, inflate)) != null) {
                                i6 = R.id.no_internet_view;
                                ViewStub viewStub = (ViewStub) nq8.B(R.id.no_internet_view, inflate);
                                if (viewStub != null) {
                                    i6 = R.id.primary_label;
                                    TextView textView = (TextView) nq8.B(R.id.primary_label, inflate);
                                    if (textView != null) {
                                        i6 = R.id.secondaryLabel;
                                        TextView textView2 = (TextView) nq8.B(R.id.secondaryLabel, inflate);
                                        if (textView2 != null) {
                                            i6 = R.id.tabs;
                                            SofaTabLayout sofaTabLayout = (SofaTabLayout) nq8.B(R.id.tabs, inflate);
                                            if (sofaTabLayout != null) {
                                                i6 = R.id.toolbar;
                                                UnderlinedToolbar underlinedToolbar = (UnderlinedToolbar) nq8.B(R.id.toolbar, inflate);
                                                if (underlinedToolbar != null) {
                                                    i6 = R.id.toolbar_holder;
                                                    FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.toolbar_holder, inflate);
                                                    if (frameLayout != null) {
                                                        i6 = R.id.view_pager;
                                                        ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.view_pager, inflate);
                                                        if (viewPager2 != null) {
                                                            i6 = R.id.viewpager_container;
                                                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) nq8.B(R.id.viewpager_container, inflate);
                                                            if (swipeRefreshLayout != null) {
                                                                return new df(coordinatorLayout, toolbarBackgroundAppBarLayout, viewStub, textView, textView2, sofaTabLayout, underlinedToolbar, frameLayout, viewPager2, swipeRefreshLayout);
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
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
                        return null;
                    case 1:
                        int i7 = VenueActivity.Q;
                        return new dok(venueActivity, venueActivity.Q().i, venueActivity.Q().f);
                    case 2:
                        int i8 = VenueActivity.Q;
                        Bundle extras = venueActivity.getIntent().getExtras();
                        return Integer.valueOf(extras != null ? extras.getInt("venue_id") : 0);
                    case 3:
                        int i9 = VenueActivity.Q;
                        venueActivity.N();
                        return Unit.a;
                    default:
                        int i10 = VenueActivity.Q;
                        return Integer.valueOf(ao2.s(12, venueActivity));
                }
            }
        });
        final int i4 = 3;
        new Function0(this) { // from class: ank
            public final /* synthetic */ VenueActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i42 = i4;
                VenueActivity venueActivity = this.b;
                switch (i42) {
                    case 0:
                        int i5 = VenueActivity.Q;
                        View inflate = venueActivity.getLayoutInflater().inflate(R.layout.activity_venue, (ViewGroup) null, false);
                        int i6 = R.id.app_bar_layout;
                        ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = (ToolbarBackgroundAppBarLayout) nq8.B(R.id.app_bar_layout, inflate);
                        if (toolbarBackgroundAppBarLayout != null) {
                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                            i6 = R.id.info_banner;
                            if (((ViewStub) nq8.B(R.id.info_banner, inflate)) != null) {
                                i6 = R.id.no_internet_view;
                                ViewStub viewStub = (ViewStub) nq8.B(R.id.no_internet_view, inflate);
                                if (viewStub != null) {
                                    i6 = R.id.primary_label;
                                    TextView textView = (TextView) nq8.B(R.id.primary_label, inflate);
                                    if (textView != null) {
                                        i6 = R.id.secondaryLabel;
                                        TextView textView2 = (TextView) nq8.B(R.id.secondaryLabel, inflate);
                                        if (textView2 != null) {
                                            i6 = R.id.tabs;
                                            SofaTabLayout sofaTabLayout = (SofaTabLayout) nq8.B(R.id.tabs, inflate);
                                            if (sofaTabLayout != null) {
                                                i6 = R.id.toolbar;
                                                UnderlinedToolbar underlinedToolbar = (UnderlinedToolbar) nq8.B(R.id.toolbar, inflate);
                                                if (underlinedToolbar != null) {
                                                    i6 = R.id.toolbar_holder;
                                                    FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.toolbar_holder, inflate);
                                                    if (frameLayout != null) {
                                                        i6 = R.id.view_pager;
                                                        ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.view_pager, inflate);
                                                        if (viewPager2 != null) {
                                                            i6 = R.id.viewpager_container;
                                                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) nq8.B(R.id.viewpager_container, inflate);
                                                            if (swipeRefreshLayout != null) {
                                                                return new df(coordinatorLayout, toolbarBackgroundAppBarLayout, viewStub, textView, textView2, sofaTabLayout, underlinedToolbar, frameLayout, viewPager2, swipeRefreshLayout);
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
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
                        return null;
                    case 1:
                        int i7 = VenueActivity.Q;
                        return new dok(venueActivity, venueActivity.Q().i, venueActivity.Q().f);
                    case 2:
                        int i8 = VenueActivity.Q;
                        Bundle extras = venueActivity.getIntent().getExtras();
                        return Integer.valueOf(extras != null ? extras.getInt("venue_id") : 0);
                    case 3:
                        int i9 = VenueActivity.Q;
                        venueActivity.N();
                        return Unit.a;
                    default:
                        int i10 = VenueActivity.Q;
                        return Integer.valueOf(ao2.s(12, venueActivity));
                }
            }
        };
        final int i5 = 4;
        this.P = ypa.b(new Function0(this) { // from class: ank
            public final /* synthetic */ VenueActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i42 = i5;
                VenueActivity venueActivity = this.b;
                switch (i42) {
                    case 0:
                        int i52 = VenueActivity.Q;
                        View inflate = venueActivity.getLayoutInflater().inflate(R.layout.activity_venue, (ViewGroup) null, false);
                        int i6 = R.id.app_bar_layout;
                        ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = (ToolbarBackgroundAppBarLayout) nq8.B(R.id.app_bar_layout, inflate);
                        if (toolbarBackgroundAppBarLayout != null) {
                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                            i6 = R.id.info_banner;
                            if (((ViewStub) nq8.B(R.id.info_banner, inflate)) != null) {
                                i6 = R.id.no_internet_view;
                                ViewStub viewStub = (ViewStub) nq8.B(R.id.no_internet_view, inflate);
                                if (viewStub != null) {
                                    i6 = R.id.primary_label;
                                    TextView textView = (TextView) nq8.B(R.id.primary_label, inflate);
                                    if (textView != null) {
                                        i6 = R.id.secondaryLabel;
                                        TextView textView2 = (TextView) nq8.B(R.id.secondaryLabel, inflate);
                                        if (textView2 != null) {
                                            i6 = R.id.tabs;
                                            SofaTabLayout sofaTabLayout = (SofaTabLayout) nq8.B(R.id.tabs, inflate);
                                            if (sofaTabLayout != null) {
                                                i6 = R.id.toolbar;
                                                UnderlinedToolbar underlinedToolbar = (UnderlinedToolbar) nq8.B(R.id.toolbar, inflate);
                                                if (underlinedToolbar != null) {
                                                    i6 = R.id.toolbar_holder;
                                                    FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.toolbar_holder, inflate);
                                                    if (frameLayout != null) {
                                                        i6 = R.id.view_pager;
                                                        ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.view_pager, inflate);
                                                        if (viewPager2 != null) {
                                                            i6 = R.id.viewpager_container;
                                                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) nq8.B(R.id.viewpager_container, inflate);
                                                            if (swipeRefreshLayout != null) {
                                                                return new df(coordinatorLayout, toolbarBackgroundAppBarLayout, viewStub, textView, textView2, sofaTabLayout, underlinedToolbar, frameLayout, viewPager2, swipeRefreshLayout);
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
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
                        return null;
                    case 1:
                        int i7 = VenueActivity.Q;
                        return new dok(venueActivity, venueActivity.Q().i, venueActivity.Q().f);
                    case 2:
                        int i8 = VenueActivity.Q;
                        Bundle extras = venueActivity.getIntent().getExtras();
                        return Integer.valueOf(extras != null ? extras.getInt("venue_id") : 0);
                    case 3:
                        int i9 = VenueActivity.Q;
                        venueActivity.N();
                        return Unit.a;
                    default:
                        int i10 = VenueActivity.Q;
                        return Integer.valueOf(ao2.s(12, venueActivity));
                }
            }
        });
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
        otk otkVar = this.K;
        if (((dnk) otkVar.getValue()).g.d() == null) {
            dnk dnkVar = (dnk) otkVar.getValue();
            int intValue = ((Number) this.N.getValue()).intValue();
            if (dnkVar.h) {
                dnkVar.h = false;
                xw3.L(un0.z(dnkVar), null, null, new anc(dnkVar, intValue, null, 19), 3);
                dnkVar.h = true;
            }
        }
    }

    public final df Q() {
        return (df) this.L.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(Q().a);
        G();
        Q().g.setBackground(null);
        Q().f.setSelectedTabIndicatorColor(getColor(R.color.on_color_primary));
        this.x.a = Integer.valueOf(((Number) this.N.getValue()).intValue());
        ViewPager2 viewPager2 = Q().i;
        mqi mqiVar = this.M;
        viewPager2.setAdapter((dok) mqiVar.getValue());
        Q().f.setSelectedTabIndicatorColor(getColor(R.color.on_color_primary));
        this.o = Q().c;
        Q().j.setOnChildScrollUpCallback(new u8f(3));
        Q().j.setOnRefreshListener(new bnk(this, 0));
        ((dnk) this.K.getValue()).g.e(this, new ygi(13, new qdj(this, 14)));
        q5a.I(this, (dok) mqiVar.getValue());
    }

    @Override // android.app.Activity
    public final void onProvideAssistContent(AssistContent assistContent) {
        Venue venue;
        assistContent.getClass();
        super.onProvideAssistContent(assistContent);
        VenueResponse venueResponse = (VenueResponse) ((dnk) this.K.getValue()).g.d();
        if (venueResponse == null || (venue = venueResponse.getVenue()) == null) {
            return;
        }
        assistContent.setWebUri(Uri.parse(String.format("%s%s%s", Arrays.copyOf(new Object[]{getString(R.string.share_link), venue.getWebUrl(), ""}, 3))));
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "VenueScreen";
    }
}
