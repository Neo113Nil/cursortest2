package com.sofascore.results.weeklyChallenge.predictions;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractActivity;
import com.sofascore.results.mvvm.base.SofaTabLayout;
import com.sofascore.results.weeklyChallenge.predictions.WeeklyPredictionsActivity;
import defpackage.b5l;
import defpackage.duf;
import defpackage.ef;
import defpackage.joa;
import defpackage.m5l;
import defpackage.n5l;
import defpackage.o02;
import defpackage.otk;
import defpackage.qdj;
import defpackage.u4g;
import defpackage.ygi;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/weeklyChallenge/predictions/WeeklyPredictionsActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WeeklyPredictionsActivity extends Hilt_WeeklyPredictionsActivity {
    public static final /* synthetic */ int O = 0;
    public final joa K;
    public final otk L;
    public final joa M;
    public final joa N;

    public WeeklyPredictionsActivity() {
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: z4l
            public final /* synthetic */ WeeklyPredictionsActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WeeklyPredictionsActivity weeklyPredictionsActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = WeeklyPredictionsActivity.O;
                        View inflate = weeklyPredictionsActivity.getLayoutInflater().inflate(R.layout.activity_weekly_challenge_predictions, (ViewGroup) null, false);
                        int i4 = R.id.collapsing_toolbar;
                        if (((CollapsingToolbarLayout) nq8.B(R.id.collapsing_toolbar, inflate)) != null) {
                            i4 = R.id.no_internet_view;
                            ViewStub viewStub = (ViewStub) nq8.B(R.id.no_internet_view, inflate);
                            if (viewStub != null) {
                                i4 = R.id.tabsView;
                                SofaTabLayout sofaTabLayout = (SofaTabLayout) nq8.B(R.id.tabsView, inflate);
                                if (sofaTabLayout != null) {
                                    i4 = R.id.toolbar;
                                    UnderlinedToolbar underlinedToolbar = (UnderlinedToolbar) nq8.B(R.id.toolbar, inflate);
                                    if (underlinedToolbar != null) {
                                        i4 = R.id.toolbar_holder;
                                        if (((AppBarLayout) nq8.B(R.id.toolbar_holder, inflate)) != null) {
                                            i4 = R.id.view_pager;
                                            ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.view_pager, inflate);
                                            if (viewPager2 != null) {
                                                return new ef((CoordinatorLayout) inflate, viewStub, sofaTabLayout, underlinedToolbar, viewPager2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
                        return null;
                    case 1:
                        int i5 = WeeklyPredictionsActivity.O;
                        return new n5l(weeklyPredictionsActivity, weeklyPredictionsActivity.Q().e, weeklyPredictionsActivity.Q().c);
                    default:
                        int i6 = WeeklyPredictionsActivity.O;
                        yk ykVar = new yk(weeklyPredictionsActivity);
                        ykVar.setOnDismissListener(new j0(weeklyPredictionsActivity, 7));
                        return ykVar;
                }
            }
        };
        ysa ysaVar = ysa.c;
        this.K = ypa.a(ysaVar, function0);
        final int i2 = 1;
        final int i3 = 2;
        this.L = new otk(duf.a.getOrCreateKotlinClass(u4g.class), new b5l(this, 1), new b5l(this, 0), new b5l(this, 2));
        this.M = ypa.a(ysaVar, new Function0(this) { // from class: z4l
            public final /* synthetic */ WeeklyPredictionsActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WeeklyPredictionsActivity weeklyPredictionsActivity = this.b;
                switch (i22) {
                    case 0:
                        int i32 = WeeklyPredictionsActivity.O;
                        View inflate = weeklyPredictionsActivity.getLayoutInflater().inflate(R.layout.activity_weekly_challenge_predictions, (ViewGroup) null, false);
                        int i4 = R.id.collapsing_toolbar;
                        if (((CollapsingToolbarLayout) nq8.B(R.id.collapsing_toolbar, inflate)) != null) {
                            i4 = R.id.no_internet_view;
                            ViewStub viewStub = (ViewStub) nq8.B(R.id.no_internet_view, inflate);
                            if (viewStub != null) {
                                i4 = R.id.tabsView;
                                SofaTabLayout sofaTabLayout = (SofaTabLayout) nq8.B(R.id.tabsView, inflate);
                                if (sofaTabLayout != null) {
                                    i4 = R.id.toolbar;
                                    UnderlinedToolbar underlinedToolbar = (UnderlinedToolbar) nq8.B(R.id.toolbar, inflate);
                                    if (underlinedToolbar != null) {
                                        i4 = R.id.toolbar_holder;
                                        if (((AppBarLayout) nq8.B(R.id.toolbar_holder, inflate)) != null) {
                                            i4 = R.id.view_pager;
                                            ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.view_pager, inflate);
                                            if (viewPager2 != null) {
                                                return new ef((CoordinatorLayout) inflate, viewStub, sofaTabLayout, underlinedToolbar, viewPager2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
                        return null;
                    case 1:
                        int i5 = WeeklyPredictionsActivity.O;
                        return new n5l(weeklyPredictionsActivity, weeklyPredictionsActivity.Q().e, weeklyPredictionsActivity.Q().c);
                    default:
                        int i6 = WeeklyPredictionsActivity.O;
                        yk ykVar = new yk(weeklyPredictionsActivity);
                        ykVar.setOnDismissListener(new j0(weeklyPredictionsActivity, 7));
                        return ykVar;
                }
            }
        });
        this.N = ypa.a(ysaVar, new Function0(this) { // from class: z4l
            public final /* synthetic */ WeeklyPredictionsActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WeeklyPredictionsActivity weeklyPredictionsActivity = this.b;
                switch (i22) {
                    case 0:
                        int i32 = WeeklyPredictionsActivity.O;
                        View inflate = weeklyPredictionsActivity.getLayoutInflater().inflate(R.layout.activity_weekly_challenge_predictions, (ViewGroup) null, false);
                        int i4 = R.id.collapsing_toolbar;
                        if (((CollapsingToolbarLayout) nq8.B(R.id.collapsing_toolbar, inflate)) != null) {
                            i4 = R.id.no_internet_view;
                            ViewStub viewStub = (ViewStub) nq8.B(R.id.no_internet_view, inflate);
                            if (viewStub != null) {
                                i4 = R.id.tabsView;
                                SofaTabLayout sofaTabLayout = (SofaTabLayout) nq8.B(R.id.tabsView, inflate);
                                if (sofaTabLayout != null) {
                                    i4 = R.id.toolbar;
                                    UnderlinedToolbar underlinedToolbar = (UnderlinedToolbar) nq8.B(R.id.toolbar, inflate);
                                    if (underlinedToolbar != null) {
                                        i4 = R.id.toolbar_holder;
                                        if (((AppBarLayout) nq8.B(R.id.toolbar_holder, inflate)) != null) {
                                            i4 = R.id.view_pager;
                                            ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.view_pager, inflate);
                                            if (viewPager2 != null) {
                                                return new ef((CoordinatorLayout) inflate, viewStub, sofaTabLayout, underlinedToolbar, viewPager2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
                        return null;
                    case 1:
                        int i5 = WeeklyPredictionsActivity.O;
                        return new n5l(weeklyPredictionsActivity, weeklyPredictionsActivity.Q().e, weeklyPredictionsActivity.Q().c);
                    default:
                        int i6 = WeeklyPredictionsActivity.O;
                        yk ykVar = new yk(weeklyPredictionsActivity);
                        ykVar.setOnDismissListener(new j0(weeklyPredictionsActivity, 7));
                        return ykVar;
                }
            }
        });
    }

    public final ef Q() {
        return (ef) this.K.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(Q().a);
        ViewPager2 viewPager2 = Q().e;
        joa joaVar = this.M;
        viewPager2.setAdapter((n5l) joaVar.getValue());
        H(Q().d);
        String string = getString(R.string.weekly_challenge_votes_this_week);
        string.getClass();
        setTitle(string);
        o02 n = n();
        if (n != null) {
            Drawable drawable = getDrawable(R.drawable.ic_arrow_back);
            if (drawable != null) {
                drawable.setTint(getColor(R.color.n_lv_1));
            } else {
                drawable = null;
            }
            n.r0(drawable);
        }
        int color = getColor(R.color.primary_default);
        AbstractActivity.P(Q().c, color, 2);
        Q().c.setTabTextColors(TabLayout.f(getColor(R.color.primary_default_60), color));
        ViewStub viewStub = Q().b;
        this.o = viewStub;
        ((n5l) joaVar.getValue()).x(m5l.e);
        ((u4g) this.L.getValue()).l.e(this, new ygi(15, new qdj(this, 19)));
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "MyPredictionsScreen";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}
