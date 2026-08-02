package com.sofascore.results.profile;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.profile.ProfileActivity;
import com.sofascore.results.profile.editor.ProfileEditorSummaryItemView;
import com.sofascore.results.profile.view.ProfilePredictionStatisticsView;
import com.sofascore.results.settings.SettingsActivity;
import com.sofascore.results.view.header.CollapsibleProfileHeaderView;
import defpackage.ao2;
import defpackage.av1;
import defpackage.dla;
import defpackage.duf;
import defpackage.fc6;
import defpackage.ia0;
import defpackage.ioe;
import defpackage.joa;
import defpackage.kr9;
import defpackage.mme;
import defpackage.mqi;
import defpackage.mz5;
import defpackage.n8f;
import defpackage.nv;
import defpackage.otk;
import defpackage.p8f;
import defpackage.td;
import defpackage.u8f;
import defpackage.un0;
import defpackage.v9b;
import defpackage.xw3;
import defpackage.ybf;
import defpackage.ypa;
import defpackage.ysa;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/profile/ProfileActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "v8a", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ProfileActivity extends Hilt_ProfileActivity {
    public static final /* synthetic */ int Q = 0;
    public final otk K;
    public final mqi L;
    public final mqi M;
    public final mqi N;
    public boolean O;
    public final joa P;

    public ProfileActivity() {
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        this.K = new otk(duf.a.getOrCreateKotlinClass(ybf.class), new p8f(this, i2), new p8f(this, i), new p8f(this, i3));
        this.L = ypa.b(new Function0(this) { // from class: o8f
            public final /* synthetic */ ProfileActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                int i4 = i;
                ProfileActivity profileActivity = this.b;
                switch (i4) {
                    case 0:
                        int i5 = ProfileActivity.Q;
                        View inflate = profileActivity.getLayoutInflater().inflate(R.layout.activity_profile, (ViewGroup) null, false);
                        int i6 = R.id.ad_banner_view;
                        AdBannerView adBannerView = (AdBannerView) nq8.B(R.id.ad_banner_view, inflate);
                        if (adBannerView != null) {
                            i6 = R.id.app_bar;
                            if (((AppBarLayout) nq8.B(R.id.app_bar, inflate)) != null) {
                                i6 = R.id.collapsing_toolbar;
                                if (((CollapsingToolbarLayout) nq8.B(R.id.collapsing_toolbar, inflate)) != null) {
                                    i6 = R.id.coordinator_layout;
                                    if (((CoordinatorLayout) nq8.B(R.id.coordinator_layout, inflate)) != null) {
                                        i6 = R.id.no_internet_view;
                                        ViewStub viewStub = (ViewStub) nq8.B(R.id.no_internet_view, inflate);
                                        if (viewStub != null) {
                                            i6 = R.id.profile_header;
                                            CollapsibleProfileHeaderView collapsibleProfileHeaderView = (CollapsibleProfileHeaderView) nq8.B(R.id.profile_header, inflate);
                                            if (collapsibleProfileHeaderView != null) {
                                                i6 = R.id.profile_layout;
                                                View B = nq8.B(R.id.profile_layout, inflate);
                                                if (B != null) {
                                                    int i7 = R.id.added_matches;
                                                    ProfileEditorSummaryItemView profileEditorSummaryItemView = (ProfileEditorSummaryItemView) nq8.B(R.id.added_matches, B);
                                                    if (profileEditorSummaryItemView != null) {
                                                        i7 = R.id.buttonContributionsMore;
                                                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.buttonContributionsMore, B);
                                                        if (linearLayout != null) {
                                                            i7 = R.id.button_editor_more;
                                                            TextView textView = (TextView) nq8.B(R.id.button_editor_more, B);
                                                            if (textView != null) {
                                                                i7 = R.id.button_following_more;
                                                                TextView textView2 = (TextView) nq8.B(R.id.button_following_more, B);
                                                                if (textView2 != null) {
                                                                    i7 = R.id.container;
                                                                    LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.container, B);
                                                                    if (linearLayout2 != null) {
                                                                        i7 = R.id.contributions;
                                                                        CardView cardView = (CardView) nq8.B(R.id.contributions, B);
                                                                        if (cardView != null) {
                                                                            i7 = R.id.current_league;
                                                                            View B2 = nq8.B(R.id.current_league, B);
                                                                            if (B2 != null) {
                                                                                av1 a = av1.a(B2);
                                                                                i7 = R.id.current_streak;
                                                                                View B3 = nq8.B(R.id.current_streak, B);
                                                                                if (B3 != null) {
                                                                                    av1 a2 = av1.a(B3);
                                                                                    i7 = R.id.editor;
                                                                                    CardView cardView2 = (CardView) nq8.B(R.id.editor, B);
                                                                                    if (cardView2 != null) {
                                                                                        i7 = R.id.following;
                                                                                        CardView cardView3 = (CardView) nq8.B(R.id.following, B);
                                                                                        if (cardView3 != null) {
                                                                                            i7 = R.id.following_recycler_view;
                                                                                            RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.following_recycler_view, B);
                                                                                            if (recyclerView != null) {
                                                                                                i7 = R.id.loader;
                                                                                                CardView cardView4 = (CardView) nq8.B(R.id.loader, B);
                                                                                                if (cardView4 != null) {
                                                                                                    i7 = R.id.match_opening;
                                                                                                    ProfileEditorSummaryItemView profileEditorSummaryItemView2 = (ProfileEditorSummaryItemView) nq8.B(R.id.match_opening, B);
                                                                                                    if (profileEditorSummaryItemView2 != null) {
                                                                                                        i7 = R.id.max_streak;
                                                                                                        View B4 = nq8.B(R.id.max_streak, B);
                                                                                                        if (B4 != null) {
                                                                                                            av1 a3 = av1.a(B4);
                                                                                                            i7 = R.id.predictions;
                                                                                                            ProfilePredictionStatisticsView profilePredictionStatisticsView = (ProfilePredictionStatisticsView) nq8.B(R.id.predictions, B);
                                                                                                            if (profilePredictionStatisticsView != null) {
                                                                                                                i7 = R.id.weekly_challenge;
                                                                                                                CardView cardView5 = (CardView) nq8.B(R.id.weekly_challenge, B);
                                                                                                                if (cardView5 != null) {
                                                                                                                    xk8 xk8Var = new xk8((ScrollView) B, profileEditorSummaryItemView, linearLayout, textView, textView2, linearLayout2, cardView, a, a2, cardView2, cardView3, recyclerView, cardView4, profileEditorSummaryItemView2, a3, profilePredictionStatisticsView, cardView5);
                                                                                                                    i6 = R.id.swipe_refresh_layout;
                                                                                                                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) nq8.B(R.id.swipe_refresh_layout, inflate);
                                                                                                                    if (swipeRefreshLayout != null) {
                                                                                                                        i6 = R.id.toolbar;
                                                                                                                        UnderlinedToolbar underlinedToolbar = (UnderlinedToolbar) nq8.B(R.id.toolbar, inflate);
                                                                                                                        if (underlinedToolbar != null) {
                                                                                                                            i6 = R.id.view_pager;
                                                                                                                            if (((NestedScrollView) nq8.B(R.id.view_pager, inflate)) != null) {
                                                                                                                                return new td((LinearLayout) inflate, adBannerView, viewStub, collapsibleProfileHeaderView, xk8Var, swipeRefreshLayout, underlinedToolbar);
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
                                                                }
                                                            }
                                                        }
                                                    }
                                                    yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i7)));
                                                    return null;
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
                        int i8 = ProfileActivity.Q;
                        Bundle extras = profileActivity.getIntent().getExtras();
                        return (extras == null || (string = extras.getString("OPEN_PROFILE_ID")) == null) ? "" : string;
                    case 2:
                        int i9 = ProfileActivity.Q;
                        Bundle extras2 = profileActivity.getIntent().getExtras();
                        if (extras2 != null) {
                            return extras2.getString("OPEN_PROFILE_NAME");
                        }
                        return null;
                    case 3:
                        int i10 = ProfileActivity.Q;
                        profileActivity.N();
                        return Unit.a;
                    default:
                        int i11 = ProfileActivity.Q;
                        v82 g = v82.g(LayoutInflater.from(profileActivity), null);
                        iz8.E(g, profileActivity.getDrawable(R.drawable.no_statistics));
                        String string2 = profileActivity.getString(R.string.profile_empty_state);
                        string2.getClass();
                        iz8.G(g, string2);
                        String string3 = profileActivity.getString(R.string.profile_empty_state_body);
                        string3.getClass();
                        iz8.F(g, string3);
                        return (ConstraintLayout) g.b;
                }
            }
        });
        this.M = ypa.b(new Function0(this) { // from class: o8f
            public final /* synthetic */ ProfileActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                int i4 = i2;
                ProfileActivity profileActivity = this.b;
                switch (i4) {
                    case 0:
                        int i5 = ProfileActivity.Q;
                        View inflate = profileActivity.getLayoutInflater().inflate(R.layout.activity_profile, (ViewGroup) null, false);
                        int i6 = R.id.ad_banner_view;
                        AdBannerView adBannerView = (AdBannerView) nq8.B(R.id.ad_banner_view, inflate);
                        if (adBannerView != null) {
                            i6 = R.id.app_bar;
                            if (((AppBarLayout) nq8.B(R.id.app_bar, inflate)) != null) {
                                i6 = R.id.collapsing_toolbar;
                                if (((CollapsingToolbarLayout) nq8.B(R.id.collapsing_toolbar, inflate)) != null) {
                                    i6 = R.id.coordinator_layout;
                                    if (((CoordinatorLayout) nq8.B(R.id.coordinator_layout, inflate)) != null) {
                                        i6 = R.id.no_internet_view;
                                        ViewStub viewStub = (ViewStub) nq8.B(R.id.no_internet_view, inflate);
                                        if (viewStub != null) {
                                            i6 = R.id.profile_header;
                                            CollapsibleProfileHeaderView collapsibleProfileHeaderView = (CollapsibleProfileHeaderView) nq8.B(R.id.profile_header, inflate);
                                            if (collapsibleProfileHeaderView != null) {
                                                i6 = R.id.profile_layout;
                                                View B = nq8.B(R.id.profile_layout, inflate);
                                                if (B != null) {
                                                    int i7 = R.id.added_matches;
                                                    ProfileEditorSummaryItemView profileEditorSummaryItemView = (ProfileEditorSummaryItemView) nq8.B(R.id.added_matches, B);
                                                    if (profileEditorSummaryItemView != null) {
                                                        i7 = R.id.buttonContributionsMore;
                                                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.buttonContributionsMore, B);
                                                        if (linearLayout != null) {
                                                            i7 = R.id.button_editor_more;
                                                            TextView textView = (TextView) nq8.B(R.id.button_editor_more, B);
                                                            if (textView != null) {
                                                                i7 = R.id.button_following_more;
                                                                TextView textView2 = (TextView) nq8.B(R.id.button_following_more, B);
                                                                if (textView2 != null) {
                                                                    i7 = R.id.container;
                                                                    LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.container, B);
                                                                    if (linearLayout2 != null) {
                                                                        i7 = R.id.contributions;
                                                                        CardView cardView = (CardView) nq8.B(R.id.contributions, B);
                                                                        if (cardView != null) {
                                                                            i7 = R.id.current_league;
                                                                            View B2 = nq8.B(R.id.current_league, B);
                                                                            if (B2 != null) {
                                                                                av1 a = av1.a(B2);
                                                                                i7 = R.id.current_streak;
                                                                                View B3 = nq8.B(R.id.current_streak, B);
                                                                                if (B3 != null) {
                                                                                    av1 a2 = av1.a(B3);
                                                                                    i7 = R.id.editor;
                                                                                    CardView cardView2 = (CardView) nq8.B(R.id.editor, B);
                                                                                    if (cardView2 != null) {
                                                                                        i7 = R.id.following;
                                                                                        CardView cardView3 = (CardView) nq8.B(R.id.following, B);
                                                                                        if (cardView3 != null) {
                                                                                            i7 = R.id.following_recycler_view;
                                                                                            RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.following_recycler_view, B);
                                                                                            if (recyclerView != null) {
                                                                                                i7 = R.id.loader;
                                                                                                CardView cardView4 = (CardView) nq8.B(R.id.loader, B);
                                                                                                if (cardView4 != null) {
                                                                                                    i7 = R.id.match_opening;
                                                                                                    ProfileEditorSummaryItemView profileEditorSummaryItemView2 = (ProfileEditorSummaryItemView) nq8.B(R.id.match_opening, B);
                                                                                                    if (profileEditorSummaryItemView2 != null) {
                                                                                                        i7 = R.id.max_streak;
                                                                                                        View B4 = nq8.B(R.id.max_streak, B);
                                                                                                        if (B4 != null) {
                                                                                                            av1 a3 = av1.a(B4);
                                                                                                            i7 = R.id.predictions;
                                                                                                            ProfilePredictionStatisticsView profilePredictionStatisticsView = (ProfilePredictionStatisticsView) nq8.B(R.id.predictions, B);
                                                                                                            if (profilePredictionStatisticsView != null) {
                                                                                                                i7 = R.id.weekly_challenge;
                                                                                                                CardView cardView5 = (CardView) nq8.B(R.id.weekly_challenge, B);
                                                                                                                if (cardView5 != null) {
                                                                                                                    xk8 xk8Var = new xk8((ScrollView) B, profileEditorSummaryItemView, linearLayout, textView, textView2, linearLayout2, cardView, a, a2, cardView2, cardView3, recyclerView, cardView4, profileEditorSummaryItemView2, a3, profilePredictionStatisticsView, cardView5);
                                                                                                                    i6 = R.id.swipe_refresh_layout;
                                                                                                                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) nq8.B(R.id.swipe_refresh_layout, inflate);
                                                                                                                    if (swipeRefreshLayout != null) {
                                                                                                                        i6 = R.id.toolbar;
                                                                                                                        UnderlinedToolbar underlinedToolbar = (UnderlinedToolbar) nq8.B(R.id.toolbar, inflate);
                                                                                                                        if (underlinedToolbar != null) {
                                                                                                                            i6 = R.id.view_pager;
                                                                                                                            if (((NestedScrollView) nq8.B(R.id.view_pager, inflate)) != null) {
                                                                                                                                return new td((LinearLayout) inflate, adBannerView, viewStub, collapsibleProfileHeaderView, xk8Var, swipeRefreshLayout, underlinedToolbar);
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
                                                                }
                                                            }
                                                        }
                                                    }
                                                    yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i7)));
                                                    return null;
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
                        int i8 = ProfileActivity.Q;
                        Bundle extras = profileActivity.getIntent().getExtras();
                        return (extras == null || (string = extras.getString("OPEN_PROFILE_ID")) == null) ? "" : string;
                    case 2:
                        int i9 = ProfileActivity.Q;
                        Bundle extras2 = profileActivity.getIntent().getExtras();
                        if (extras2 != null) {
                            return extras2.getString("OPEN_PROFILE_NAME");
                        }
                        return null;
                    case 3:
                        int i10 = ProfileActivity.Q;
                        profileActivity.N();
                        return Unit.a;
                    default:
                        int i11 = ProfileActivity.Q;
                        v82 g = v82.g(LayoutInflater.from(profileActivity), null);
                        iz8.E(g, profileActivity.getDrawable(R.drawable.no_statistics));
                        String string2 = profileActivity.getString(R.string.profile_empty_state);
                        string2.getClass();
                        iz8.G(g, string2);
                        String string3 = profileActivity.getString(R.string.profile_empty_state_body);
                        string3.getClass();
                        iz8.F(g, string3);
                        return (ConstraintLayout) g.b;
                }
            }
        });
        this.N = ypa.b(new Function0(this) { // from class: o8f
            public final /* synthetic */ ProfileActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                int i4 = i3;
                ProfileActivity profileActivity = this.b;
                switch (i4) {
                    case 0:
                        int i5 = ProfileActivity.Q;
                        View inflate = profileActivity.getLayoutInflater().inflate(R.layout.activity_profile, (ViewGroup) null, false);
                        int i6 = R.id.ad_banner_view;
                        AdBannerView adBannerView = (AdBannerView) nq8.B(R.id.ad_banner_view, inflate);
                        if (adBannerView != null) {
                            i6 = R.id.app_bar;
                            if (((AppBarLayout) nq8.B(R.id.app_bar, inflate)) != null) {
                                i6 = R.id.collapsing_toolbar;
                                if (((CollapsingToolbarLayout) nq8.B(R.id.collapsing_toolbar, inflate)) != null) {
                                    i6 = R.id.coordinator_layout;
                                    if (((CoordinatorLayout) nq8.B(R.id.coordinator_layout, inflate)) != null) {
                                        i6 = R.id.no_internet_view;
                                        ViewStub viewStub = (ViewStub) nq8.B(R.id.no_internet_view, inflate);
                                        if (viewStub != null) {
                                            i6 = R.id.profile_header;
                                            CollapsibleProfileHeaderView collapsibleProfileHeaderView = (CollapsibleProfileHeaderView) nq8.B(R.id.profile_header, inflate);
                                            if (collapsibleProfileHeaderView != null) {
                                                i6 = R.id.profile_layout;
                                                View B = nq8.B(R.id.profile_layout, inflate);
                                                if (B != null) {
                                                    int i7 = R.id.added_matches;
                                                    ProfileEditorSummaryItemView profileEditorSummaryItemView = (ProfileEditorSummaryItemView) nq8.B(R.id.added_matches, B);
                                                    if (profileEditorSummaryItemView != null) {
                                                        i7 = R.id.buttonContributionsMore;
                                                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.buttonContributionsMore, B);
                                                        if (linearLayout != null) {
                                                            i7 = R.id.button_editor_more;
                                                            TextView textView = (TextView) nq8.B(R.id.button_editor_more, B);
                                                            if (textView != null) {
                                                                i7 = R.id.button_following_more;
                                                                TextView textView2 = (TextView) nq8.B(R.id.button_following_more, B);
                                                                if (textView2 != null) {
                                                                    i7 = R.id.container;
                                                                    LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.container, B);
                                                                    if (linearLayout2 != null) {
                                                                        i7 = R.id.contributions;
                                                                        CardView cardView = (CardView) nq8.B(R.id.contributions, B);
                                                                        if (cardView != null) {
                                                                            i7 = R.id.current_league;
                                                                            View B2 = nq8.B(R.id.current_league, B);
                                                                            if (B2 != null) {
                                                                                av1 a = av1.a(B2);
                                                                                i7 = R.id.current_streak;
                                                                                View B3 = nq8.B(R.id.current_streak, B);
                                                                                if (B3 != null) {
                                                                                    av1 a2 = av1.a(B3);
                                                                                    i7 = R.id.editor;
                                                                                    CardView cardView2 = (CardView) nq8.B(R.id.editor, B);
                                                                                    if (cardView2 != null) {
                                                                                        i7 = R.id.following;
                                                                                        CardView cardView3 = (CardView) nq8.B(R.id.following, B);
                                                                                        if (cardView3 != null) {
                                                                                            i7 = R.id.following_recycler_view;
                                                                                            RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.following_recycler_view, B);
                                                                                            if (recyclerView != null) {
                                                                                                i7 = R.id.loader;
                                                                                                CardView cardView4 = (CardView) nq8.B(R.id.loader, B);
                                                                                                if (cardView4 != null) {
                                                                                                    i7 = R.id.match_opening;
                                                                                                    ProfileEditorSummaryItemView profileEditorSummaryItemView2 = (ProfileEditorSummaryItemView) nq8.B(R.id.match_opening, B);
                                                                                                    if (profileEditorSummaryItemView2 != null) {
                                                                                                        i7 = R.id.max_streak;
                                                                                                        View B4 = nq8.B(R.id.max_streak, B);
                                                                                                        if (B4 != null) {
                                                                                                            av1 a3 = av1.a(B4);
                                                                                                            i7 = R.id.predictions;
                                                                                                            ProfilePredictionStatisticsView profilePredictionStatisticsView = (ProfilePredictionStatisticsView) nq8.B(R.id.predictions, B);
                                                                                                            if (profilePredictionStatisticsView != null) {
                                                                                                                i7 = R.id.weekly_challenge;
                                                                                                                CardView cardView5 = (CardView) nq8.B(R.id.weekly_challenge, B);
                                                                                                                if (cardView5 != null) {
                                                                                                                    xk8 xk8Var = new xk8((ScrollView) B, profileEditorSummaryItemView, linearLayout, textView, textView2, linearLayout2, cardView, a, a2, cardView2, cardView3, recyclerView, cardView4, profileEditorSummaryItemView2, a3, profilePredictionStatisticsView, cardView5);
                                                                                                                    i6 = R.id.swipe_refresh_layout;
                                                                                                                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) nq8.B(R.id.swipe_refresh_layout, inflate);
                                                                                                                    if (swipeRefreshLayout != null) {
                                                                                                                        i6 = R.id.toolbar;
                                                                                                                        UnderlinedToolbar underlinedToolbar = (UnderlinedToolbar) nq8.B(R.id.toolbar, inflate);
                                                                                                                        if (underlinedToolbar != null) {
                                                                                                                            i6 = R.id.view_pager;
                                                                                                                            if (((NestedScrollView) nq8.B(R.id.view_pager, inflate)) != null) {
                                                                                                                                return new td((LinearLayout) inflate, adBannerView, viewStub, collapsibleProfileHeaderView, xk8Var, swipeRefreshLayout, underlinedToolbar);
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
                                                                }
                                                            }
                                                        }
                                                    }
                                                    yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i7)));
                                                    return null;
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
                        int i8 = ProfileActivity.Q;
                        Bundle extras = profileActivity.getIntent().getExtras();
                        return (extras == null || (string = extras.getString("OPEN_PROFILE_ID")) == null) ? "" : string;
                    case 2:
                        int i9 = ProfileActivity.Q;
                        Bundle extras2 = profileActivity.getIntent().getExtras();
                        if (extras2 != null) {
                            return extras2.getString("OPEN_PROFILE_NAME");
                        }
                        return null;
                    case 3:
                        int i10 = ProfileActivity.Q;
                        profileActivity.N();
                        return Unit.a;
                    default:
                        int i11 = ProfileActivity.Q;
                        v82 g = v82.g(LayoutInflater.from(profileActivity), null);
                        iz8.E(g, profileActivity.getDrawable(R.drawable.no_statistics));
                        String string2 = profileActivity.getString(R.string.profile_empty_state);
                        string2.getClass();
                        iz8.G(g, string2);
                        String string3 = profileActivity.getString(R.string.profile_empty_state_body);
                        string3.getClass();
                        iz8.F(g, string3);
                        return (ConstraintLayout) g.b;
                }
            }
        });
        final int i4 = 3;
        new Function0(this) { // from class: o8f
            public final /* synthetic */ ProfileActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                int i42 = i4;
                ProfileActivity profileActivity = this.b;
                switch (i42) {
                    case 0:
                        int i5 = ProfileActivity.Q;
                        View inflate = profileActivity.getLayoutInflater().inflate(R.layout.activity_profile, (ViewGroup) null, false);
                        int i6 = R.id.ad_banner_view;
                        AdBannerView adBannerView = (AdBannerView) nq8.B(R.id.ad_banner_view, inflate);
                        if (adBannerView != null) {
                            i6 = R.id.app_bar;
                            if (((AppBarLayout) nq8.B(R.id.app_bar, inflate)) != null) {
                                i6 = R.id.collapsing_toolbar;
                                if (((CollapsingToolbarLayout) nq8.B(R.id.collapsing_toolbar, inflate)) != null) {
                                    i6 = R.id.coordinator_layout;
                                    if (((CoordinatorLayout) nq8.B(R.id.coordinator_layout, inflate)) != null) {
                                        i6 = R.id.no_internet_view;
                                        ViewStub viewStub = (ViewStub) nq8.B(R.id.no_internet_view, inflate);
                                        if (viewStub != null) {
                                            i6 = R.id.profile_header;
                                            CollapsibleProfileHeaderView collapsibleProfileHeaderView = (CollapsibleProfileHeaderView) nq8.B(R.id.profile_header, inflate);
                                            if (collapsibleProfileHeaderView != null) {
                                                i6 = R.id.profile_layout;
                                                View B = nq8.B(R.id.profile_layout, inflate);
                                                if (B != null) {
                                                    int i7 = R.id.added_matches;
                                                    ProfileEditorSummaryItemView profileEditorSummaryItemView = (ProfileEditorSummaryItemView) nq8.B(R.id.added_matches, B);
                                                    if (profileEditorSummaryItemView != null) {
                                                        i7 = R.id.buttonContributionsMore;
                                                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.buttonContributionsMore, B);
                                                        if (linearLayout != null) {
                                                            i7 = R.id.button_editor_more;
                                                            TextView textView = (TextView) nq8.B(R.id.button_editor_more, B);
                                                            if (textView != null) {
                                                                i7 = R.id.button_following_more;
                                                                TextView textView2 = (TextView) nq8.B(R.id.button_following_more, B);
                                                                if (textView2 != null) {
                                                                    i7 = R.id.container;
                                                                    LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.container, B);
                                                                    if (linearLayout2 != null) {
                                                                        i7 = R.id.contributions;
                                                                        CardView cardView = (CardView) nq8.B(R.id.contributions, B);
                                                                        if (cardView != null) {
                                                                            i7 = R.id.current_league;
                                                                            View B2 = nq8.B(R.id.current_league, B);
                                                                            if (B2 != null) {
                                                                                av1 a = av1.a(B2);
                                                                                i7 = R.id.current_streak;
                                                                                View B3 = nq8.B(R.id.current_streak, B);
                                                                                if (B3 != null) {
                                                                                    av1 a2 = av1.a(B3);
                                                                                    i7 = R.id.editor;
                                                                                    CardView cardView2 = (CardView) nq8.B(R.id.editor, B);
                                                                                    if (cardView2 != null) {
                                                                                        i7 = R.id.following;
                                                                                        CardView cardView3 = (CardView) nq8.B(R.id.following, B);
                                                                                        if (cardView3 != null) {
                                                                                            i7 = R.id.following_recycler_view;
                                                                                            RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.following_recycler_view, B);
                                                                                            if (recyclerView != null) {
                                                                                                i7 = R.id.loader;
                                                                                                CardView cardView4 = (CardView) nq8.B(R.id.loader, B);
                                                                                                if (cardView4 != null) {
                                                                                                    i7 = R.id.match_opening;
                                                                                                    ProfileEditorSummaryItemView profileEditorSummaryItemView2 = (ProfileEditorSummaryItemView) nq8.B(R.id.match_opening, B);
                                                                                                    if (profileEditorSummaryItemView2 != null) {
                                                                                                        i7 = R.id.max_streak;
                                                                                                        View B4 = nq8.B(R.id.max_streak, B);
                                                                                                        if (B4 != null) {
                                                                                                            av1 a3 = av1.a(B4);
                                                                                                            i7 = R.id.predictions;
                                                                                                            ProfilePredictionStatisticsView profilePredictionStatisticsView = (ProfilePredictionStatisticsView) nq8.B(R.id.predictions, B);
                                                                                                            if (profilePredictionStatisticsView != null) {
                                                                                                                i7 = R.id.weekly_challenge;
                                                                                                                CardView cardView5 = (CardView) nq8.B(R.id.weekly_challenge, B);
                                                                                                                if (cardView5 != null) {
                                                                                                                    xk8 xk8Var = new xk8((ScrollView) B, profileEditorSummaryItemView, linearLayout, textView, textView2, linearLayout2, cardView, a, a2, cardView2, cardView3, recyclerView, cardView4, profileEditorSummaryItemView2, a3, profilePredictionStatisticsView, cardView5);
                                                                                                                    i6 = R.id.swipe_refresh_layout;
                                                                                                                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) nq8.B(R.id.swipe_refresh_layout, inflate);
                                                                                                                    if (swipeRefreshLayout != null) {
                                                                                                                        i6 = R.id.toolbar;
                                                                                                                        UnderlinedToolbar underlinedToolbar = (UnderlinedToolbar) nq8.B(R.id.toolbar, inflate);
                                                                                                                        if (underlinedToolbar != null) {
                                                                                                                            i6 = R.id.view_pager;
                                                                                                                            if (((NestedScrollView) nq8.B(R.id.view_pager, inflate)) != null) {
                                                                                                                                return new td((LinearLayout) inflate, adBannerView, viewStub, collapsibleProfileHeaderView, xk8Var, swipeRefreshLayout, underlinedToolbar);
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
                                                                }
                                                            }
                                                        }
                                                    }
                                                    yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i7)));
                                                    return null;
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
                        int i8 = ProfileActivity.Q;
                        Bundle extras = profileActivity.getIntent().getExtras();
                        return (extras == null || (string = extras.getString("OPEN_PROFILE_ID")) == null) ? "" : string;
                    case 2:
                        int i9 = ProfileActivity.Q;
                        Bundle extras2 = profileActivity.getIntent().getExtras();
                        if (extras2 != null) {
                            return extras2.getString("OPEN_PROFILE_NAME");
                        }
                        return null;
                    case 3:
                        int i10 = ProfileActivity.Q;
                        profileActivity.N();
                        return Unit.a;
                    default:
                        int i11 = ProfileActivity.Q;
                        v82 g = v82.g(LayoutInflater.from(profileActivity), null);
                        iz8.E(g, profileActivity.getDrawable(R.drawable.no_statistics));
                        String string2 = profileActivity.getString(R.string.profile_empty_state);
                        string2.getClass();
                        iz8.G(g, string2);
                        String string3 = profileActivity.getString(R.string.profile_empty_state_body);
                        string3.getClass();
                        iz8.F(g, string3);
                        return (ConstraintLayout) g.b;
                }
            }
        };
        final int i5 = 4;
        this.P = ypa.a(ysa.c, new Function0(this) { // from class: o8f
            public final /* synthetic */ ProfileActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                int i42 = i5;
                ProfileActivity profileActivity = this.b;
                switch (i42) {
                    case 0:
                        int i52 = ProfileActivity.Q;
                        View inflate = profileActivity.getLayoutInflater().inflate(R.layout.activity_profile, (ViewGroup) null, false);
                        int i6 = R.id.ad_banner_view;
                        AdBannerView adBannerView = (AdBannerView) nq8.B(R.id.ad_banner_view, inflate);
                        if (adBannerView != null) {
                            i6 = R.id.app_bar;
                            if (((AppBarLayout) nq8.B(R.id.app_bar, inflate)) != null) {
                                i6 = R.id.collapsing_toolbar;
                                if (((CollapsingToolbarLayout) nq8.B(R.id.collapsing_toolbar, inflate)) != null) {
                                    i6 = R.id.coordinator_layout;
                                    if (((CoordinatorLayout) nq8.B(R.id.coordinator_layout, inflate)) != null) {
                                        i6 = R.id.no_internet_view;
                                        ViewStub viewStub = (ViewStub) nq8.B(R.id.no_internet_view, inflate);
                                        if (viewStub != null) {
                                            i6 = R.id.profile_header;
                                            CollapsibleProfileHeaderView collapsibleProfileHeaderView = (CollapsibleProfileHeaderView) nq8.B(R.id.profile_header, inflate);
                                            if (collapsibleProfileHeaderView != null) {
                                                i6 = R.id.profile_layout;
                                                View B = nq8.B(R.id.profile_layout, inflate);
                                                if (B != null) {
                                                    int i7 = R.id.added_matches;
                                                    ProfileEditorSummaryItemView profileEditorSummaryItemView = (ProfileEditorSummaryItemView) nq8.B(R.id.added_matches, B);
                                                    if (profileEditorSummaryItemView != null) {
                                                        i7 = R.id.buttonContributionsMore;
                                                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.buttonContributionsMore, B);
                                                        if (linearLayout != null) {
                                                            i7 = R.id.button_editor_more;
                                                            TextView textView = (TextView) nq8.B(R.id.button_editor_more, B);
                                                            if (textView != null) {
                                                                i7 = R.id.button_following_more;
                                                                TextView textView2 = (TextView) nq8.B(R.id.button_following_more, B);
                                                                if (textView2 != null) {
                                                                    i7 = R.id.container;
                                                                    LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.container, B);
                                                                    if (linearLayout2 != null) {
                                                                        i7 = R.id.contributions;
                                                                        CardView cardView = (CardView) nq8.B(R.id.contributions, B);
                                                                        if (cardView != null) {
                                                                            i7 = R.id.current_league;
                                                                            View B2 = nq8.B(R.id.current_league, B);
                                                                            if (B2 != null) {
                                                                                av1 a = av1.a(B2);
                                                                                i7 = R.id.current_streak;
                                                                                View B3 = nq8.B(R.id.current_streak, B);
                                                                                if (B3 != null) {
                                                                                    av1 a2 = av1.a(B3);
                                                                                    i7 = R.id.editor;
                                                                                    CardView cardView2 = (CardView) nq8.B(R.id.editor, B);
                                                                                    if (cardView2 != null) {
                                                                                        i7 = R.id.following;
                                                                                        CardView cardView3 = (CardView) nq8.B(R.id.following, B);
                                                                                        if (cardView3 != null) {
                                                                                            i7 = R.id.following_recycler_view;
                                                                                            RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.following_recycler_view, B);
                                                                                            if (recyclerView != null) {
                                                                                                i7 = R.id.loader;
                                                                                                CardView cardView4 = (CardView) nq8.B(R.id.loader, B);
                                                                                                if (cardView4 != null) {
                                                                                                    i7 = R.id.match_opening;
                                                                                                    ProfileEditorSummaryItemView profileEditorSummaryItemView2 = (ProfileEditorSummaryItemView) nq8.B(R.id.match_opening, B);
                                                                                                    if (profileEditorSummaryItemView2 != null) {
                                                                                                        i7 = R.id.max_streak;
                                                                                                        View B4 = nq8.B(R.id.max_streak, B);
                                                                                                        if (B4 != null) {
                                                                                                            av1 a3 = av1.a(B4);
                                                                                                            i7 = R.id.predictions;
                                                                                                            ProfilePredictionStatisticsView profilePredictionStatisticsView = (ProfilePredictionStatisticsView) nq8.B(R.id.predictions, B);
                                                                                                            if (profilePredictionStatisticsView != null) {
                                                                                                                i7 = R.id.weekly_challenge;
                                                                                                                CardView cardView5 = (CardView) nq8.B(R.id.weekly_challenge, B);
                                                                                                                if (cardView5 != null) {
                                                                                                                    xk8 xk8Var = new xk8((ScrollView) B, profileEditorSummaryItemView, linearLayout, textView, textView2, linearLayout2, cardView, a, a2, cardView2, cardView3, recyclerView, cardView4, profileEditorSummaryItemView2, a3, profilePredictionStatisticsView, cardView5);
                                                                                                                    i6 = R.id.swipe_refresh_layout;
                                                                                                                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) nq8.B(R.id.swipe_refresh_layout, inflate);
                                                                                                                    if (swipeRefreshLayout != null) {
                                                                                                                        i6 = R.id.toolbar;
                                                                                                                        UnderlinedToolbar underlinedToolbar = (UnderlinedToolbar) nq8.B(R.id.toolbar, inflate);
                                                                                                                        if (underlinedToolbar != null) {
                                                                                                                            i6 = R.id.view_pager;
                                                                                                                            if (((NestedScrollView) nq8.B(R.id.view_pager, inflate)) != null) {
                                                                                                                                return new td((LinearLayout) inflate, adBannerView, viewStub, collapsibleProfileHeaderView, xk8Var, swipeRefreshLayout, underlinedToolbar);
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
                                                                }
                                                            }
                                                        }
                                                    }
                                                    yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i7)));
                                                    return null;
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
                        int i8 = ProfileActivity.Q;
                        Bundle extras = profileActivity.getIntent().getExtras();
                        return (extras == null || (string = extras.getString("OPEN_PROFILE_ID")) == null) ? "" : string;
                    case 2:
                        int i9 = ProfileActivity.Q;
                        Bundle extras2 = profileActivity.getIntent().getExtras();
                        if (extras2 != null) {
                            return extras2.getString("OPEN_PROFILE_NAME");
                        }
                        return null;
                    case 3:
                        int i10 = ProfileActivity.Q;
                        profileActivity.N();
                        return Unit.a;
                    default:
                        int i11 = ProfileActivity.Q;
                        v82 g = v82.g(LayoutInflater.from(profileActivity), null);
                        iz8.E(g, profileActivity.getDrawable(R.drawable.no_statistics));
                        String string2 = profileActivity.getString(R.string.profile_empty_state);
                        string2.getClass();
                        iz8.G(g, string2);
                        String string3 = profileActivity.getString(R.string.profile_empty_state_body);
                        string3.getClass();
                        iz8.F(g, string3);
                        return (ConstraintLayout) g.b;
                }
            }
        });
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
        ybf ybfVar = (ybf) this.K.getValue();
        xw3.L(un0.z(ybfVar), null, null, new mz5(ybfVar, null), 3);
    }

    public final td Q() {
        return (td) this.L.getValue();
    }

    public final void R(av1 av1Var, Integer num, boolean z) {
        String format;
        TextView textView = av1Var.e;
        TextView textView2 = av1Var.f;
        if (num == null) {
            format = "-";
        } else {
            Locale d = dla.d();
            String quantityString = getResources().getQuantityString(R.plurals.weekly_streak_counter, num.intValue());
            quantityString.getClass();
            format = String.format(d, quantityString, Arrays.copyOf(new Object[]{num}, 1));
        }
        textView.setText(format);
        textView2.setText(getString(z ? R.string.weekly_current_streak : R.string.weekly_longest_streak));
        int i = 0;
        av1Var.d.setVisibility(0);
        if (z) {
            av1Var.b.setOnClickListener(new n8f(this, i));
            Drawable drawable = getDrawable(R.drawable.ic_info);
            if (drawable != null) {
                Drawable mutate = drawable.mutate();
                mutate.setTint(getColor(R.color.on_color_primary));
                mutate.setBounds(0, 0, ao2.s(16, this), ao2.s(16, this));
                textView2.setCompoundDrawablesRelative(null, null, mutate, null);
            }
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(Q().a);
        H(Q().g);
        Q().g.setTitle(getString(R.string.profile));
        this.o = Q().c;
        Q().d.setUserName((String) this.N.getValue());
        Q().f.setOnChildScrollUpCallback(new u8f(3));
        Q().f.setOnRefreshListener(new kr9(this, 23));
        otk otkVar = this.K;
        ((ybf) otkVar.getValue()).k.e(this, new ioe(2, new v9b(1, this, ProfileActivity.class, "onHeadersResponseReceived", "onHeadersResponseReceived(Lcom/sofascore/results/profile/ProfileViewModel$ProfileWrapper;)V", 0, 29)));
        ((ybf) otkVar.getValue()).i.e(this, new ioe(2, new mme(this, 9)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        ia0 ia0Var = ia0.q;
        if (!Intrinsics.c(fc6.e(), (String) this.M.getValue())) {
            return true;
        }
        getMenuInflater().inflate(R.menu.profile_settings_menu, menu);
        return true;
    }

    @Override // com.sofascore.results.base.BaseActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() == R.id.action_settings) {
            nv.m0(this, "settings", "other_profile");
            Intent intent = new Intent(this, (Class<?>) SettingsActivity.class);
            intent.putExtra("open", (String) null);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "ProfileScreen";
    }
}
