package com.sofascore.results.league.historical;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.results.R;
import com.sofascore.results.league.historical.LeagueHistoricalDataActivity;
import com.sofascore.results.view.ToolbarBackgroundAppBarLayout;
import com.sofascore.results.view.header.CollapsibleSmallHeaderView;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import defpackage.cya;
import defpackage.duf;
import defpackage.g5k;
import defpackage.gya;
import defpackage.i1g;
import defpackage.id;
import defpackage.joa;
import defpackage.mqi;
import defpackage.mxa;
import defpackage.otk;
import defpackage.oxa;
import defpackage.qy0;
import defpackage.ur1;
import defpackage.vb9;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z1;
import defpackage.z8e;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/league/historical/LeagueHistoricalDataActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "ccd", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LeagueHistoricalDataActivity extends Hilt_LeagueHistoricalDataActivity {
    public static final /* synthetic */ int Q = 0;
    public final joa K;
    public final joa L;
    public final otk M;
    public final mqi N;
    public final joa O;
    public final joa P;

    public LeagueHistoricalDataActivity() {
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: nxa
            public final /* synthetic */ LeagueHistoricalDataActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 0;
                LeagueHistoricalDataActivity leagueHistoricalDataActivity = this.b;
                switch (i2) {
                    case 0:
                        int i4 = LeagueHistoricalDataActivity.Q;
                        return Integer.valueOf(leagueHistoricalDataActivity.getIntent().getIntExtra("uniqueTournamentId", 0));
                    case 1:
                        int i5 = LeagueHistoricalDataActivity.Q;
                        return Integer.valueOf(leagueHistoricalDataActivity.getIntent().getIntExtra("seasonId", 0));
                    case 2:
                        int i6 = LeagueHistoricalDataActivity.Q;
                        View inflate = leagueHistoricalDataActivity.getLayoutInflater().inflate(R.layout.activity_league_historical_data, (ViewGroup) null, false);
                        int i7 = R.id.adViewContainer;
                        View B = nq8.B(R.id.adViewContainer, inflate);
                        if (B != null) {
                            hcb.a(B);
                            i7 = R.id.app_bar;
                            ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = (ToolbarBackgroundAppBarLayout) nq8.B(R.id.app_bar, inflate);
                            if (toolbarBackgroundAppBarLayout != null) {
                                i7 = R.id.collapsing_space;
                                if (((Space) nq8.B(R.id.collapsing_space, inflate)) != null) {
                                    i7 = R.id.collapsing_toolbar;
                                    if (((CollapsingToolbarLayout) nq8.B(R.id.collapsing_toolbar, inflate)) != null) {
                                        i7 = R.id.floating_action_button;
                                        if (((ExtendedFloatingActionButton) nq8.B(R.id.floating_action_button, inflate)) != null) {
                                            i7 = R.id.header_container;
                                            if (((CollapsibleSmallHeaderView) nq8.B(R.id.header_container, inflate)) != null) {
                                                i7 = R.id.header_view;
                                                View B2 = nq8.B(R.id.header_view, inflate);
                                                if (B2 != null) {
                                                    int i8 = R.id.image;
                                                    ImageView imageView = (ImageView) nq8.B(R.id.image, B2);
                                                    if (imageView != null) {
                                                        i8 = R.id.primary_label;
                                                        TextView textView = (TextView) nq8.B(R.id.primary_label, B2);
                                                        if (textView != null) {
                                                            i8 = R.id.secondary_label;
                                                            TextView textView2 = (TextView) nq8.B(R.id.secondary_label, B2);
                                                            if (textView2 != null) {
                                                                w82 w82Var = new w82((ConstraintLayout) B2, imageView, textView, textView2, 2);
                                                                i7 = R.id.info_banner;
                                                                if (((ViewStub) nq8.B(R.id.info_banner, inflate)) != null) {
                                                                    i7 = R.id.no_internet_view;
                                                                    ViewStub viewStub = (ViewStub) nq8.B(R.id.no_internet_view, inflate);
                                                                    if (viewStub != null) {
                                                                        i7 = R.id.recycler_view;
                                                                        RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
                                                                        if (recyclerView != null) {
                                                                            i7 = R.id.seasons_header;
                                                                            TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.seasons_header, inflate);
                                                                            if (typeHeaderView != null) {
                                                                                i7 = R.id.toolbar;
                                                                                UnderlinedToolbar underlinedToolbar = (UnderlinedToolbar) nq8.B(R.id.toolbar, inflate);
                                                                                if (underlinedToolbar != null) {
                                                                                    i7 = R.id.transparent_layer;
                                                                                    View B3 = nq8.B(R.id.transparent_layer, inflate);
                                                                                    if (B3 != null) {
                                                                                        i7 = R.id.viewpager_container;
                                                                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) nq8.B(R.id.viewpager_container, inflate);
                                                                                        if (swipeRefreshLayout != null) {
                                                                                            return new id((RelativeLayout) inflate, toolbarBackgroundAppBarLayout, w82Var, viewStub, recyclerView, typeHeaderView, underlinedToolbar, B3, swipeRefreshLayout);
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
                                                    yhk.s("Missing required view with ID: ".concat(B2.getResources().getResourceName(i8)));
                                                    return null;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i7)));
                        return null;
                    case 3:
                        int i9 = LeagueHistoricalDataActivity.Q;
                        gya gyaVar = (gya) leagueHistoricalDataActivity.M.getValue();
                        i1g i1gVar = (i1g) leagueHistoricalDataActivity.P.getValue();
                        i1gVar.getClass();
                        gyaVar.k(i1gVar);
                        return Unit.a;
                    case 4:
                        int i10 = LeagueHistoricalDataActivity.Q;
                        return new vb9(leagueHistoricalDataActivity, new mxa(leagueHistoricalDataActivity, i3));
                    default:
                        int i11 = LeagueHistoricalDataActivity.Q;
                        Context applicationContext = leagueHistoricalDataActivity.getApplicationContext();
                        applicationContext.getClass();
                        Resources resources = leagueHistoricalDataActivity.getResources();
                        i1g i1gVar2 = new i1g(applicationContext);
                        i1gVar2.a = resources;
                        return i1gVar2;
                }
            }
        };
        ysa ysaVar = ysa.c;
        this.K = ypa.a(ysaVar, function0);
        final int i2 = 1;
        this.L = ypa.a(ysaVar, new Function0(this) { // from class: nxa
            public final /* synthetic */ LeagueHistoricalDataActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 0;
                LeagueHistoricalDataActivity leagueHistoricalDataActivity = this.b;
                switch (i22) {
                    case 0:
                        int i4 = LeagueHistoricalDataActivity.Q;
                        return Integer.valueOf(leagueHistoricalDataActivity.getIntent().getIntExtra("uniqueTournamentId", 0));
                    case 1:
                        int i5 = LeagueHistoricalDataActivity.Q;
                        return Integer.valueOf(leagueHistoricalDataActivity.getIntent().getIntExtra("seasonId", 0));
                    case 2:
                        int i6 = LeagueHistoricalDataActivity.Q;
                        View inflate = leagueHistoricalDataActivity.getLayoutInflater().inflate(R.layout.activity_league_historical_data, (ViewGroup) null, false);
                        int i7 = R.id.adViewContainer;
                        View B = nq8.B(R.id.adViewContainer, inflate);
                        if (B != null) {
                            hcb.a(B);
                            i7 = R.id.app_bar;
                            ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = (ToolbarBackgroundAppBarLayout) nq8.B(R.id.app_bar, inflate);
                            if (toolbarBackgroundAppBarLayout != null) {
                                i7 = R.id.collapsing_space;
                                if (((Space) nq8.B(R.id.collapsing_space, inflate)) != null) {
                                    i7 = R.id.collapsing_toolbar;
                                    if (((CollapsingToolbarLayout) nq8.B(R.id.collapsing_toolbar, inflate)) != null) {
                                        i7 = R.id.floating_action_button;
                                        if (((ExtendedFloatingActionButton) nq8.B(R.id.floating_action_button, inflate)) != null) {
                                            i7 = R.id.header_container;
                                            if (((CollapsibleSmallHeaderView) nq8.B(R.id.header_container, inflate)) != null) {
                                                i7 = R.id.header_view;
                                                View B2 = nq8.B(R.id.header_view, inflate);
                                                if (B2 != null) {
                                                    int i8 = R.id.image;
                                                    ImageView imageView = (ImageView) nq8.B(R.id.image, B2);
                                                    if (imageView != null) {
                                                        i8 = R.id.primary_label;
                                                        TextView textView = (TextView) nq8.B(R.id.primary_label, B2);
                                                        if (textView != null) {
                                                            i8 = R.id.secondary_label;
                                                            TextView textView2 = (TextView) nq8.B(R.id.secondary_label, B2);
                                                            if (textView2 != null) {
                                                                w82 w82Var = new w82((ConstraintLayout) B2, imageView, textView, textView2, 2);
                                                                i7 = R.id.info_banner;
                                                                if (((ViewStub) nq8.B(R.id.info_banner, inflate)) != null) {
                                                                    i7 = R.id.no_internet_view;
                                                                    ViewStub viewStub = (ViewStub) nq8.B(R.id.no_internet_view, inflate);
                                                                    if (viewStub != null) {
                                                                        i7 = R.id.recycler_view;
                                                                        RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
                                                                        if (recyclerView != null) {
                                                                            i7 = R.id.seasons_header;
                                                                            TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.seasons_header, inflate);
                                                                            if (typeHeaderView != null) {
                                                                                i7 = R.id.toolbar;
                                                                                UnderlinedToolbar underlinedToolbar = (UnderlinedToolbar) nq8.B(R.id.toolbar, inflate);
                                                                                if (underlinedToolbar != null) {
                                                                                    i7 = R.id.transparent_layer;
                                                                                    View B3 = nq8.B(R.id.transparent_layer, inflate);
                                                                                    if (B3 != null) {
                                                                                        i7 = R.id.viewpager_container;
                                                                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) nq8.B(R.id.viewpager_container, inflate);
                                                                                        if (swipeRefreshLayout != null) {
                                                                                            return new id((RelativeLayout) inflate, toolbarBackgroundAppBarLayout, w82Var, viewStub, recyclerView, typeHeaderView, underlinedToolbar, B3, swipeRefreshLayout);
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
                                                    yhk.s("Missing required view with ID: ".concat(B2.getResources().getResourceName(i8)));
                                                    return null;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i7)));
                        return null;
                    case 3:
                        int i9 = LeagueHistoricalDataActivity.Q;
                        gya gyaVar = (gya) leagueHistoricalDataActivity.M.getValue();
                        i1g i1gVar = (i1g) leagueHistoricalDataActivity.P.getValue();
                        i1gVar.getClass();
                        gyaVar.k(i1gVar);
                        return Unit.a;
                    case 4:
                        int i10 = LeagueHistoricalDataActivity.Q;
                        return new vb9(leagueHistoricalDataActivity, new mxa(leagueHistoricalDataActivity, i3));
                    default:
                        int i11 = LeagueHistoricalDataActivity.Q;
                        Context applicationContext = leagueHistoricalDataActivity.getApplicationContext();
                        applicationContext.getClass();
                        Resources resources = leagueHistoricalDataActivity.getResources();
                        i1g i1gVar2 = new i1g(applicationContext);
                        i1gVar2.a = resources;
                        return i1gVar2;
                }
            }
        });
        final int i3 = 2;
        this.M = new otk(duf.a.getOrCreateKotlinClass(gya.class), new oxa(this, i2), new oxa(this, i), new oxa(this, i3));
        this.N = ypa.b(new Function0(this) { // from class: nxa
            public final /* synthetic */ LeagueHistoricalDataActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 0;
                LeagueHistoricalDataActivity leagueHistoricalDataActivity = this.b;
                switch (i22) {
                    case 0:
                        int i4 = LeagueHistoricalDataActivity.Q;
                        return Integer.valueOf(leagueHistoricalDataActivity.getIntent().getIntExtra("uniqueTournamentId", 0));
                    case 1:
                        int i5 = LeagueHistoricalDataActivity.Q;
                        return Integer.valueOf(leagueHistoricalDataActivity.getIntent().getIntExtra("seasonId", 0));
                    case 2:
                        int i6 = LeagueHistoricalDataActivity.Q;
                        View inflate = leagueHistoricalDataActivity.getLayoutInflater().inflate(R.layout.activity_league_historical_data, (ViewGroup) null, false);
                        int i7 = R.id.adViewContainer;
                        View B = nq8.B(R.id.adViewContainer, inflate);
                        if (B != null) {
                            hcb.a(B);
                            i7 = R.id.app_bar;
                            ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = (ToolbarBackgroundAppBarLayout) nq8.B(R.id.app_bar, inflate);
                            if (toolbarBackgroundAppBarLayout != null) {
                                i7 = R.id.collapsing_space;
                                if (((Space) nq8.B(R.id.collapsing_space, inflate)) != null) {
                                    i7 = R.id.collapsing_toolbar;
                                    if (((CollapsingToolbarLayout) nq8.B(R.id.collapsing_toolbar, inflate)) != null) {
                                        i7 = R.id.floating_action_button;
                                        if (((ExtendedFloatingActionButton) nq8.B(R.id.floating_action_button, inflate)) != null) {
                                            i7 = R.id.header_container;
                                            if (((CollapsibleSmallHeaderView) nq8.B(R.id.header_container, inflate)) != null) {
                                                i7 = R.id.header_view;
                                                View B2 = nq8.B(R.id.header_view, inflate);
                                                if (B2 != null) {
                                                    int i8 = R.id.image;
                                                    ImageView imageView = (ImageView) nq8.B(R.id.image, B2);
                                                    if (imageView != null) {
                                                        i8 = R.id.primary_label;
                                                        TextView textView = (TextView) nq8.B(R.id.primary_label, B2);
                                                        if (textView != null) {
                                                            i8 = R.id.secondary_label;
                                                            TextView textView2 = (TextView) nq8.B(R.id.secondary_label, B2);
                                                            if (textView2 != null) {
                                                                w82 w82Var = new w82((ConstraintLayout) B2, imageView, textView, textView2, 2);
                                                                i7 = R.id.info_banner;
                                                                if (((ViewStub) nq8.B(R.id.info_banner, inflate)) != null) {
                                                                    i7 = R.id.no_internet_view;
                                                                    ViewStub viewStub = (ViewStub) nq8.B(R.id.no_internet_view, inflate);
                                                                    if (viewStub != null) {
                                                                        i7 = R.id.recycler_view;
                                                                        RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
                                                                        if (recyclerView != null) {
                                                                            i7 = R.id.seasons_header;
                                                                            TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.seasons_header, inflate);
                                                                            if (typeHeaderView != null) {
                                                                                i7 = R.id.toolbar;
                                                                                UnderlinedToolbar underlinedToolbar = (UnderlinedToolbar) nq8.B(R.id.toolbar, inflate);
                                                                                if (underlinedToolbar != null) {
                                                                                    i7 = R.id.transparent_layer;
                                                                                    View B3 = nq8.B(R.id.transparent_layer, inflate);
                                                                                    if (B3 != null) {
                                                                                        i7 = R.id.viewpager_container;
                                                                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) nq8.B(R.id.viewpager_container, inflate);
                                                                                        if (swipeRefreshLayout != null) {
                                                                                            return new id((RelativeLayout) inflate, toolbarBackgroundAppBarLayout, w82Var, viewStub, recyclerView, typeHeaderView, underlinedToolbar, B3, swipeRefreshLayout);
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
                                                    yhk.s("Missing required view with ID: ".concat(B2.getResources().getResourceName(i8)));
                                                    return null;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i7)));
                        return null;
                    case 3:
                        int i9 = LeagueHistoricalDataActivity.Q;
                        gya gyaVar = (gya) leagueHistoricalDataActivity.M.getValue();
                        i1g i1gVar = (i1g) leagueHistoricalDataActivity.P.getValue();
                        i1gVar.getClass();
                        gyaVar.k(i1gVar);
                        return Unit.a;
                    case 4:
                        int i10 = LeagueHistoricalDataActivity.Q;
                        return new vb9(leagueHistoricalDataActivity, new mxa(leagueHistoricalDataActivity, i32));
                    default:
                        int i11 = LeagueHistoricalDataActivity.Q;
                        Context applicationContext = leagueHistoricalDataActivity.getApplicationContext();
                        applicationContext.getClass();
                        Resources resources = leagueHistoricalDataActivity.getResources();
                        i1g i1gVar2 = new i1g(applicationContext);
                        i1gVar2.a = resources;
                        return i1gVar2;
                }
            }
        });
        final int i4 = 3;
        new Function0(this) { // from class: nxa
            public final /* synthetic */ LeagueHistoricalDataActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                int i32 = 0;
                LeagueHistoricalDataActivity leagueHistoricalDataActivity = this.b;
                switch (i22) {
                    case 0:
                        int i42 = LeagueHistoricalDataActivity.Q;
                        return Integer.valueOf(leagueHistoricalDataActivity.getIntent().getIntExtra("uniqueTournamentId", 0));
                    case 1:
                        int i5 = LeagueHistoricalDataActivity.Q;
                        return Integer.valueOf(leagueHistoricalDataActivity.getIntent().getIntExtra("seasonId", 0));
                    case 2:
                        int i6 = LeagueHistoricalDataActivity.Q;
                        View inflate = leagueHistoricalDataActivity.getLayoutInflater().inflate(R.layout.activity_league_historical_data, (ViewGroup) null, false);
                        int i7 = R.id.adViewContainer;
                        View B = nq8.B(R.id.adViewContainer, inflate);
                        if (B != null) {
                            hcb.a(B);
                            i7 = R.id.app_bar;
                            ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = (ToolbarBackgroundAppBarLayout) nq8.B(R.id.app_bar, inflate);
                            if (toolbarBackgroundAppBarLayout != null) {
                                i7 = R.id.collapsing_space;
                                if (((Space) nq8.B(R.id.collapsing_space, inflate)) != null) {
                                    i7 = R.id.collapsing_toolbar;
                                    if (((CollapsingToolbarLayout) nq8.B(R.id.collapsing_toolbar, inflate)) != null) {
                                        i7 = R.id.floating_action_button;
                                        if (((ExtendedFloatingActionButton) nq8.B(R.id.floating_action_button, inflate)) != null) {
                                            i7 = R.id.header_container;
                                            if (((CollapsibleSmallHeaderView) nq8.B(R.id.header_container, inflate)) != null) {
                                                i7 = R.id.header_view;
                                                View B2 = nq8.B(R.id.header_view, inflate);
                                                if (B2 != null) {
                                                    int i8 = R.id.image;
                                                    ImageView imageView = (ImageView) nq8.B(R.id.image, B2);
                                                    if (imageView != null) {
                                                        i8 = R.id.primary_label;
                                                        TextView textView = (TextView) nq8.B(R.id.primary_label, B2);
                                                        if (textView != null) {
                                                            i8 = R.id.secondary_label;
                                                            TextView textView2 = (TextView) nq8.B(R.id.secondary_label, B2);
                                                            if (textView2 != null) {
                                                                w82 w82Var = new w82((ConstraintLayout) B2, imageView, textView, textView2, 2);
                                                                i7 = R.id.info_banner;
                                                                if (((ViewStub) nq8.B(R.id.info_banner, inflate)) != null) {
                                                                    i7 = R.id.no_internet_view;
                                                                    ViewStub viewStub = (ViewStub) nq8.B(R.id.no_internet_view, inflate);
                                                                    if (viewStub != null) {
                                                                        i7 = R.id.recycler_view;
                                                                        RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
                                                                        if (recyclerView != null) {
                                                                            i7 = R.id.seasons_header;
                                                                            TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.seasons_header, inflate);
                                                                            if (typeHeaderView != null) {
                                                                                i7 = R.id.toolbar;
                                                                                UnderlinedToolbar underlinedToolbar = (UnderlinedToolbar) nq8.B(R.id.toolbar, inflate);
                                                                                if (underlinedToolbar != null) {
                                                                                    i7 = R.id.transparent_layer;
                                                                                    View B3 = nq8.B(R.id.transparent_layer, inflate);
                                                                                    if (B3 != null) {
                                                                                        i7 = R.id.viewpager_container;
                                                                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) nq8.B(R.id.viewpager_container, inflate);
                                                                                        if (swipeRefreshLayout != null) {
                                                                                            return new id((RelativeLayout) inflate, toolbarBackgroundAppBarLayout, w82Var, viewStub, recyclerView, typeHeaderView, underlinedToolbar, B3, swipeRefreshLayout);
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
                                                    yhk.s("Missing required view with ID: ".concat(B2.getResources().getResourceName(i8)));
                                                    return null;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i7)));
                        return null;
                    case 3:
                        int i9 = LeagueHistoricalDataActivity.Q;
                        gya gyaVar = (gya) leagueHistoricalDataActivity.M.getValue();
                        i1g i1gVar = (i1g) leagueHistoricalDataActivity.P.getValue();
                        i1gVar.getClass();
                        gyaVar.k(i1gVar);
                        return Unit.a;
                    case 4:
                        int i10 = LeagueHistoricalDataActivity.Q;
                        return new vb9(leagueHistoricalDataActivity, new mxa(leagueHistoricalDataActivity, i32));
                    default:
                        int i11 = LeagueHistoricalDataActivity.Q;
                        Context applicationContext = leagueHistoricalDataActivity.getApplicationContext();
                        applicationContext.getClass();
                        Resources resources = leagueHistoricalDataActivity.getResources();
                        i1g i1gVar2 = new i1g(applicationContext);
                        i1gVar2.a = resources;
                        return i1gVar2;
                }
            }
        };
        final int i5 = 4;
        this.O = ypa.a(ysaVar, new Function0(this) { // from class: nxa
            public final /* synthetic */ LeagueHistoricalDataActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                int i32 = 0;
                LeagueHistoricalDataActivity leagueHistoricalDataActivity = this.b;
                switch (i22) {
                    case 0:
                        int i42 = LeagueHistoricalDataActivity.Q;
                        return Integer.valueOf(leagueHistoricalDataActivity.getIntent().getIntExtra("uniqueTournamentId", 0));
                    case 1:
                        int i52 = LeagueHistoricalDataActivity.Q;
                        return Integer.valueOf(leagueHistoricalDataActivity.getIntent().getIntExtra("seasonId", 0));
                    case 2:
                        int i6 = LeagueHistoricalDataActivity.Q;
                        View inflate = leagueHistoricalDataActivity.getLayoutInflater().inflate(R.layout.activity_league_historical_data, (ViewGroup) null, false);
                        int i7 = R.id.adViewContainer;
                        View B = nq8.B(R.id.adViewContainer, inflate);
                        if (B != null) {
                            hcb.a(B);
                            i7 = R.id.app_bar;
                            ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = (ToolbarBackgroundAppBarLayout) nq8.B(R.id.app_bar, inflate);
                            if (toolbarBackgroundAppBarLayout != null) {
                                i7 = R.id.collapsing_space;
                                if (((Space) nq8.B(R.id.collapsing_space, inflate)) != null) {
                                    i7 = R.id.collapsing_toolbar;
                                    if (((CollapsingToolbarLayout) nq8.B(R.id.collapsing_toolbar, inflate)) != null) {
                                        i7 = R.id.floating_action_button;
                                        if (((ExtendedFloatingActionButton) nq8.B(R.id.floating_action_button, inflate)) != null) {
                                            i7 = R.id.header_container;
                                            if (((CollapsibleSmallHeaderView) nq8.B(R.id.header_container, inflate)) != null) {
                                                i7 = R.id.header_view;
                                                View B2 = nq8.B(R.id.header_view, inflate);
                                                if (B2 != null) {
                                                    int i8 = R.id.image;
                                                    ImageView imageView = (ImageView) nq8.B(R.id.image, B2);
                                                    if (imageView != null) {
                                                        i8 = R.id.primary_label;
                                                        TextView textView = (TextView) nq8.B(R.id.primary_label, B2);
                                                        if (textView != null) {
                                                            i8 = R.id.secondary_label;
                                                            TextView textView2 = (TextView) nq8.B(R.id.secondary_label, B2);
                                                            if (textView2 != null) {
                                                                w82 w82Var = new w82((ConstraintLayout) B2, imageView, textView, textView2, 2);
                                                                i7 = R.id.info_banner;
                                                                if (((ViewStub) nq8.B(R.id.info_banner, inflate)) != null) {
                                                                    i7 = R.id.no_internet_view;
                                                                    ViewStub viewStub = (ViewStub) nq8.B(R.id.no_internet_view, inflate);
                                                                    if (viewStub != null) {
                                                                        i7 = R.id.recycler_view;
                                                                        RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
                                                                        if (recyclerView != null) {
                                                                            i7 = R.id.seasons_header;
                                                                            TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.seasons_header, inflate);
                                                                            if (typeHeaderView != null) {
                                                                                i7 = R.id.toolbar;
                                                                                UnderlinedToolbar underlinedToolbar = (UnderlinedToolbar) nq8.B(R.id.toolbar, inflate);
                                                                                if (underlinedToolbar != null) {
                                                                                    i7 = R.id.transparent_layer;
                                                                                    View B3 = nq8.B(R.id.transparent_layer, inflate);
                                                                                    if (B3 != null) {
                                                                                        i7 = R.id.viewpager_container;
                                                                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) nq8.B(R.id.viewpager_container, inflate);
                                                                                        if (swipeRefreshLayout != null) {
                                                                                            return new id((RelativeLayout) inflate, toolbarBackgroundAppBarLayout, w82Var, viewStub, recyclerView, typeHeaderView, underlinedToolbar, B3, swipeRefreshLayout);
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
                                                    yhk.s("Missing required view with ID: ".concat(B2.getResources().getResourceName(i8)));
                                                    return null;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i7)));
                        return null;
                    case 3:
                        int i9 = LeagueHistoricalDataActivity.Q;
                        gya gyaVar = (gya) leagueHistoricalDataActivity.M.getValue();
                        i1g i1gVar = (i1g) leagueHistoricalDataActivity.P.getValue();
                        i1gVar.getClass();
                        gyaVar.k(i1gVar);
                        return Unit.a;
                    case 4:
                        int i10 = LeagueHistoricalDataActivity.Q;
                        return new vb9(leagueHistoricalDataActivity, new mxa(leagueHistoricalDataActivity, i32));
                    default:
                        int i11 = LeagueHistoricalDataActivity.Q;
                        Context applicationContext = leagueHistoricalDataActivity.getApplicationContext();
                        applicationContext.getClass();
                        Resources resources = leagueHistoricalDataActivity.getResources();
                        i1g i1gVar2 = new i1g(applicationContext);
                        i1gVar2.a = resources;
                        return i1gVar2;
                }
            }
        });
        final int i6 = 5;
        this.P = ypa.a(ysaVar, new Function0(this) { // from class: nxa
            public final /* synthetic */ LeagueHistoricalDataActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                int i32 = 0;
                LeagueHistoricalDataActivity leagueHistoricalDataActivity = this.b;
                switch (i22) {
                    case 0:
                        int i42 = LeagueHistoricalDataActivity.Q;
                        return Integer.valueOf(leagueHistoricalDataActivity.getIntent().getIntExtra("uniqueTournamentId", 0));
                    case 1:
                        int i52 = LeagueHistoricalDataActivity.Q;
                        return Integer.valueOf(leagueHistoricalDataActivity.getIntent().getIntExtra("seasonId", 0));
                    case 2:
                        int i62 = LeagueHistoricalDataActivity.Q;
                        View inflate = leagueHistoricalDataActivity.getLayoutInflater().inflate(R.layout.activity_league_historical_data, (ViewGroup) null, false);
                        int i7 = R.id.adViewContainer;
                        View B = nq8.B(R.id.adViewContainer, inflate);
                        if (B != null) {
                            hcb.a(B);
                            i7 = R.id.app_bar;
                            ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = (ToolbarBackgroundAppBarLayout) nq8.B(R.id.app_bar, inflate);
                            if (toolbarBackgroundAppBarLayout != null) {
                                i7 = R.id.collapsing_space;
                                if (((Space) nq8.B(R.id.collapsing_space, inflate)) != null) {
                                    i7 = R.id.collapsing_toolbar;
                                    if (((CollapsingToolbarLayout) nq8.B(R.id.collapsing_toolbar, inflate)) != null) {
                                        i7 = R.id.floating_action_button;
                                        if (((ExtendedFloatingActionButton) nq8.B(R.id.floating_action_button, inflate)) != null) {
                                            i7 = R.id.header_container;
                                            if (((CollapsibleSmallHeaderView) nq8.B(R.id.header_container, inflate)) != null) {
                                                i7 = R.id.header_view;
                                                View B2 = nq8.B(R.id.header_view, inflate);
                                                if (B2 != null) {
                                                    int i8 = R.id.image;
                                                    ImageView imageView = (ImageView) nq8.B(R.id.image, B2);
                                                    if (imageView != null) {
                                                        i8 = R.id.primary_label;
                                                        TextView textView = (TextView) nq8.B(R.id.primary_label, B2);
                                                        if (textView != null) {
                                                            i8 = R.id.secondary_label;
                                                            TextView textView2 = (TextView) nq8.B(R.id.secondary_label, B2);
                                                            if (textView2 != null) {
                                                                w82 w82Var = new w82((ConstraintLayout) B2, imageView, textView, textView2, 2);
                                                                i7 = R.id.info_banner;
                                                                if (((ViewStub) nq8.B(R.id.info_banner, inflate)) != null) {
                                                                    i7 = R.id.no_internet_view;
                                                                    ViewStub viewStub = (ViewStub) nq8.B(R.id.no_internet_view, inflate);
                                                                    if (viewStub != null) {
                                                                        i7 = R.id.recycler_view;
                                                                        RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
                                                                        if (recyclerView != null) {
                                                                            i7 = R.id.seasons_header;
                                                                            TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.seasons_header, inflate);
                                                                            if (typeHeaderView != null) {
                                                                                i7 = R.id.toolbar;
                                                                                UnderlinedToolbar underlinedToolbar = (UnderlinedToolbar) nq8.B(R.id.toolbar, inflate);
                                                                                if (underlinedToolbar != null) {
                                                                                    i7 = R.id.transparent_layer;
                                                                                    View B3 = nq8.B(R.id.transparent_layer, inflate);
                                                                                    if (B3 != null) {
                                                                                        i7 = R.id.viewpager_container;
                                                                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) nq8.B(R.id.viewpager_container, inflate);
                                                                                        if (swipeRefreshLayout != null) {
                                                                                            return new id((RelativeLayout) inflate, toolbarBackgroundAppBarLayout, w82Var, viewStub, recyclerView, typeHeaderView, underlinedToolbar, B3, swipeRefreshLayout);
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
                                                    yhk.s("Missing required view with ID: ".concat(B2.getResources().getResourceName(i8)));
                                                    return null;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i7)));
                        return null;
                    case 3:
                        int i9 = LeagueHistoricalDataActivity.Q;
                        gya gyaVar = (gya) leagueHistoricalDataActivity.M.getValue();
                        i1g i1gVar = (i1g) leagueHistoricalDataActivity.P.getValue();
                        i1gVar.getClass();
                        gyaVar.k(i1gVar);
                        return Unit.a;
                    case 4:
                        int i10 = LeagueHistoricalDataActivity.Q;
                        return new vb9(leagueHistoricalDataActivity, new mxa(leagueHistoricalDataActivity, i32));
                    default:
                        int i11 = LeagueHistoricalDataActivity.Q;
                        Context applicationContext = leagueHistoricalDataActivity.getApplicationContext();
                        applicationContext.getClass();
                        Resources resources = leagueHistoricalDataActivity.getResources();
                        i1g i1gVar2 = new i1g(applicationContext);
                        i1gVar2.a = resources;
                        return i1gVar2;
                }
            }
        });
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
        gya gyaVar = (gya) this.M.getValue();
        i1g i1gVar = (i1g) this.P.getValue();
        i1gVar.getClass();
        gyaVar.k(i1gVar);
    }

    public final void Q(int i) {
        List list;
        Season season;
        gya gyaVar = (gya) this.M.getValue();
        cya cyaVar = (cya) gyaVar.g.d();
        if (cyaVar == null || (list = cyaVar.b) == null || (season = (Season) CollectionsKt.a0(i, list)) == null) {
            return;
        }
        gyaVar.k = season;
        gyaVar.k((i1g) this.P.getValue());
    }

    public final id R() {
        return (id) this.N.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R().a);
        H(R().g);
        joa joaVar = this.K;
        this.x.a = Integer.valueOf(((Number) joaVar.getValue()).intValue());
        this.o = R().d;
        R().b.setBackground(new qy0(((Number) joaVar.getValue()).intValue(), 0));
        z8e.b0(R().e, this, true, false, null, 18);
        R().e.setAdapter((vb9) this.O.getValue());
        g5k g5kVar = new g5k(R().f);
        g5kVar.m = new ur1(this, 13);
        g5kVar.b();
        otk otkVar = this.M;
        ((gya) otkVar.getValue()).g.e(this, new z1(18, new mxa(this, 1)));
        ((gya) otkVar.getValue()).i.e(this, new z1(18, new mxa(this, 2)));
    }

    @Override // com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        ((i1g) this.P.getValue()).a = null;
        super.onDestroy();
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "HistoricalDataScreen";
    }
}
