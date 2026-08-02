package com.sofascore.results.event;

import android.app.assist.AssistContent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.sdk_base.referrer.Payload;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.Sports;
import com.sofascore.model.favorites.FavoritesEventsData;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.view.ToolbarBackgroundAppBarLayout;
import com.sofascore.results.view.follownotification.FollowActionButton;
import com.sofascore.results.view.follownotification.NotificationsActionButton;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a5f;
import defpackage.ad2;
import defpackage.ar5;
import defpackage.br5;
import defpackage.cd;
import defpackage.ce;
import defpackage.ce4;
import defpackage.cp4;
import defpackage.de;
import defpackage.dsi;
import defpackage.duf;
import defpackage.e6b;
import defpackage.f52;
import defpackage.fuf;
import defpackage.gz8;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.iz2;
import defpackage.j58;
import defpackage.jca;
import defpackage.joa;
import defpackage.kr5;
import defpackage.kt4;
import defpackage.ljg;
import defpackage.mqi;
import defpackage.mr5;
import defpackage.mz1;
import defpackage.o50;
import defpackage.otk;
import defpackage.p15;
import defpackage.pk;
import defpackage.q5a;
import defpackage.qv5;
import defpackage.r1;
import defpackage.r82;
import defpackage.rd6;
import defpackage.rq3;
import defpackage.s21;
import defpackage.s5d;
import defpackage.sd6;
import defpackage.td4;
import defpackage.u4g;
import defpackage.u8f;
import defpackage.uic;
import defpackage.un0;
import defpackage.uq5;
import defpackage.wxf;
import defpackage.xw3;
import defpackage.yea;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z1;
import defpackage.z45;
import defpackage.z8e;
import defpackage.zzc;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/event/EventActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "wxf", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventActivity extends Hilt_EventActivity {
    public static final wxf h0 = new wxf(22);
    public boolean K;
    public final mqi L;
    public final joa M;
    public s5d N;
    public final otk O;
    public final otk P;
    public final otk Q;
    public Menu R;
    public final joa S;
    public final joa T;
    public rd6 U;
    public MenuItem V;
    public NotificationsActionButton W;
    public MenuItem X;
    public FollowActionButton Y;
    public final LinkedHashSet Z;
    public Function0 a0;
    public s21 b0;
    public final joa c0;
    public final o50 d0;
    public final de e0;
    public final mqi f0;
    public final mqi g0;

    public EventActivity() {
        int i = 1;
        this.L = ypa.b(new uq5(this, i));
        int i2 = 2;
        uq5 uq5Var = new uq5(this, i2);
        ysa ysaVar = ysa.c;
        this.M = ypa.a(ysaVar, uq5Var);
        br5 br5Var = new br5(this, 0);
        fuf fufVar = duf.a;
        this.O = new otk(fufVar.getOrCreateKotlinClass(mr5.class), new br5(this, i), br5Var, new br5(this, i2));
        int i3 = 3;
        int i4 = 4;
        int i5 = 5;
        this.P = new otk(fufVar.getOrCreateKotlinClass(u4g.class), new br5(this, i4), new br5(this, i3), new br5(this, i5));
        int i6 = 6;
        int i7 = 7;
        int i8 = 8;
        this.Q = new otk(fufVar.getOrCreateKotlinClass(dsi.class), new br5(this, i7), new br5(this, i6), new br5(this, i8));
        this.S = ypa.a(ysaVar, new uq5(this, i3));
        this.T = ypa.a(ysaVar, new uq5(this, i4));
        this.Z = new LinkedHashSet();
        this.a0 = new uq5(this, i5);
        this.c0 = ypa.a(ysaVar, new uq5(this, i6));
        this.d0 = new o50(this, i);
        this.e0 = registerForActivityResult(new ce(i3), new kt4(this, i2));
        this.f0 = ypa.b(new uq5(this, i7));
        this.g0 = ypa.b(new uq5(this, i8));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
        mr5 T = T();
        iz2 z = un0.z(T);
        hs4 hs4Var = z45.a;
        xw3.L(z, hq4.c, null, new kr5(T, null), 2);
    }

    public final void Q(MenuItem menuItem, float f) {
        boolean z = f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        View actionView = menuItem.getActionView();
        if (actionView != null) {
            actionView.setAlpha(f);
            actionView.setVisibility(z ? 0 : 8);
        } else {
            Drawable icon = menuItem.getIcon();
            if (icon != null) {
                icon.setAlpha((int) (255.0f * f));
            }
            menuItem.setVisible(z && Intrinsics.c(Boolean.valueOf(menuItem.isEnabled()), Boolean.TRUE));
        }
        FollowActionButton followActionButton = this.Y;
        if (followActionButton != null) {
            followActionButton.setVisibility(z ? 0 : 8);
        }
        NotificationsActionButton notificationsActionButton = this.W;
        if (notificationsActionButton != null) {
            notificationsActionButton.setVisibility(z ? 0 : 8);
        }
    }

    public final cd R() {
        return (cd) this.L.getValue();
    }

    public final AnimatedVectorDrawable S() {
        Drawable icon = R().e.getIcon();
        if (icon instanceof AnimatedVectorDrawable) {
            return (AnimatedVectorDrawable) icon;
        }
        return null;
    }

    public final mr5 T() {
        return (mr5) this.O.getValue();
    }

    public final sd6 U() {
        return (sd6) this.M.getValue();
    }

    public final void V(Event event) {
        if (event == null) {
            return;
        }
        FavoritesEventsData favoritesEventsData = (FavoritesEventsData) T().O.a.getValue();
        s21 s21Var = this.b0;
        if (s21Var != null) {
            s21Var.c(event, favoritesEventsData);
        }
        FollowActionButton followActionButton = this.Y;
        if (followActionButton != null) {
            followActionButton.h(event, favoritesEventsData);
        }
        NotificationsActionButton notificationsActionButton = this.W;
        if (notificationsActionButton != null) {
            int i = NotificationsActionButton.g;
            notificationsActionButton.i(event, favoritesEventsData, false);
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        getIntent().removeExtra("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS");
        super.onCreate(bundle);
        setContentView(R().a);
        final int i = 1;
        R().e.y(1);
        Bundle extras = getIntent().getExtras();
        rq3 rq3Var = null;
        this.U = extras != null ? (rd6) gz8.M(extras, "initialTab", rd6.class) : null;
        R().k.setAdapter(U());
        R().k.setPageTransformer(new cp4(21));
        R().i.setSelectedTabIndicatorColor(-1);
        this.o = R().g;
        H(R().j);
        final int i2 = 3;
        R().h.setOnChildScrollUpCallback(new u8f(i2));
        final int i3 = 7;
        ((u4g) this.P.getValue()).l.e(this, new z1(7, new Function1(this) { // from class: vq5
            public final /* synthetic */ EventActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [rq3] */
            /* JADX WARN: Type inference failed for: r3v17 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                s21 z03Var;
                int i4 = i3;
                boolean z = true;
                int i5 = 0;
                EventActivity eventActivity = this.b;
                switch (i4) {
                    case 0:
                        Event event = (Event) obj;
                        wxf wxfVar = EventActivity.h0;
                        event.getClass();
                        fdi fdiVar = eventActivity.T().u;
                        fdiVar.getClass();
                        fdiVar.m(null, event);
                        break;
                    case 1:
                        List list = (List) obj;
                        if (list != null) {
                            s21 s21Var = eventActivity.b0;
                            r3 = s21Var instanceof kj8 ? (kj8) s21Var : 0;
                            if (r3 != 0) {
                                r3.setFootballGoals(list);
                            }
                        } else {
                            wxf wxfVar2 = EventActivity.h0;
                        }
                        break;
                    case 2:
                        rd6 rd6Var = (rd6) obj;
                        wxf wxfVar3 = EventActivity.h0;
                        rd6Var.getClass();
                        if (!eventActivity.U().p(rd6Var.ordinal())) {
                            eventActivity.Z.add(rd6Var);
                        }
                        int D = eventActivity.U().D(rd6Var);
                        if (D == -1) {
                            int ordinal = rd6Var.ordinal();
                            dsf dsfVar = new dsf();
                            dsfVar.a = ordinal;
                            for (int i6 = 0; i6 < ordinal; i6++) {
                                rd6 rd6Var2 = (rd6) rd6.u.get(i6);
                                int i7 = dsfVar.a;
                                int D2 = eventActivity.U().D(rd6Var2);
                                if (D2 > 0) {
                                    D2 = 0;
                                }
                                dsfVar.a = i7 + D2;
                            }
                            eventActivity.U().v(rd6Var, dsfVar.a);
                            eventActivity.R().k.post(new yq5(0, eventActivity, dsfVar));
                        } else {
                            z = q5a.K(eventActivity.R().k, D);
                        }
                        break;
                    case 3:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        wxf wxfVar4 = EventActivity.h0;
                        if (!booleanValue) {
                            eventActivity.R().e.y(0);
                        } else if (eventActivity.R().e.getVisibility() == 0) {
                            eventActivity.R().e.y(1);
                        } else {
                            eventActivity.R().e.setVisibility(8);
                        }
                        break;
                    case 4:
                        wxf wxfVar5 = EventActivity.h0;
                        ((Unit) obj).getClass();
                        eventActivity.setResult(-1, eventActivity.getIntent());
                        break;
                    case 5:
                        Boolean bool = (Boolean) obj;
                        wxf wxfVar6 = EventActivity.h0;
                        ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = eventActivity.R().c;
                        bool.getClass();
                        toolbarBackgroundAppBarLayout.g(bool.booleanValue(), true, true);
                        break;
                    case 6:
                        wxf wxfVar7 = EventActivity.h0;
                        ((Unit) obj).getClass();
                        eventActivity.z().a(new h1f(((Number) eventActivity.S.getValue()).intValue()));
                        break;
                    case 7:
                        wxf wxfVar8 = EventActivity.h0;
                        int i8 = zq5.a[((cg) obj).a.ordinal()];
                        joa joaVar = eventActivity.c0;
                        if (i8 == 1) {
                            ((yk) joaVar.getValue()).show();
                        } else {
                            ((yk) joaVar.getValue()).dismiss();
                        }
                        break;
                    case 8:
                        Event event2 = (Event) obj;
                        wxf wxfVar9 = EventActivity.h0;
                        if (event2 == null) {
                            break;
                        } else {
                            qa6 qa6Var = su8.a;
                            su suVar = eventActivity.x;
                            f5p.E(eventActivity, new d17(event2, r3, 24));
                            suVar.a = Integer.valueOf(event2.getId());
                            suVar.c = event2.getStatusType();
                            sd6 U = eventActivity.U();
                            String s = ok3.s(event2);
                            U.getClass();
                            s.getClass();
                            U.r = s;
                            eventActivity.U().s = o3a.F(event2.getTournament());
                            eventActivity.U().t = event2.getTournament().getCategory().getSlug();
                            sd6 U2 = eventActivity.U();
                            Season season = event2.getTournament().getSeason();
                            U2.u = season != null ? season.getName() : null;
                            eventActivity.V(event2);
                            if (!eventActivity.K) {
                                eventActivity.R().h.setEnabled(false);
                                AdBannerView adBannerView = eventActivity.R().b;
                                ltb ltbVar = new ltb();
                                Event event3 = (Event) eventActivity.T().v.d();
                                if (event3 != null) {
                                    ltbVar.put(SearchResponseKt.SPORT_ENTITY, event3.getSportSlug());
                                    Integer F = o3a.F(event3.getTournament());
                                    if (F != null) {
                                        ltbVar.put("unique_tournament_id", String.valueOf(F.intValue()));
                                    }
                                    if (((Boolean) eventActivity.T.getValue()).booleanValue()) {
                                        ltbVar.put("previous_page", "tournament");
                                    }
                                    ltbVar.put("event_status", event3.getStatus().getType());
                                    TeamSides teamSides = TeamSides.ORIGINAL;
                                    ltbVar.put("home_team_id", String.valueOf(event3.getHomeTeam(teamSides).getId()));
                                    ltbVar.put("away_team_id", String.valueOf(event3.getAwayTeam(teamSides).getId()));
                                    ltbVar.put("page", "event");
                                    OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) CollectionsKt.firstOrNull(eventActivity.T().l.c());
                                    if (oddsCountryProvider != null) {
                                        ltbVar.put("odds_provider", oddsCountryProvider.getSubProviderIds().toString());
                                    }
                                }
                                eventActivity.I(adBannerView, ltbVar.d());
                                Intent intent = eventActivity.getIntent();
                                intent.getClass();
                                FirebaseBundle firebaseBundle = new FirebaseBundle();
                                String F2 = nv.F(intent);
                                if (F2 != null) {
                                    firebaseBundle.putString(Payload.CAMPAIGN_ID, F2);
                                }
                                nv.h(firebaseBundle, intent);
                                firebaseBundle.putInt("id", event2.getId());
                                firebaseBundle.putString("location", nv.G(intent).a);
                                firebaseBundle.putString("status", event2.getStatus().getType());
                                nv.N(eventActivity, firebaseBundle, "open_event");
                                v38 w = eventActivity.w();
                                String sportSlug = event2.getSportSlug();
                                sportSlug.getClass();
                                String replace = sportSlug.replace('-', '_');
                                replace.getClass();
                                w.b("event_".concat(replace));
                                eventActivity.w().b("event_tournament_" + o3a.F(event2.getTournament()));
                                ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout2 = eventActivity.R().c;
                                g6b lifecycle = eventActivity.getLifecycle();
                                lifecycle.getClass();
                                toolbarBackgroundAppBarLayout2.C.a(lifecycle, event2);
                                pco.G(eventActivity.R().e, new uq5(eventActivity, 10));
                                if (!((dsi) eventActivity.Q.getValue()).d) {
                                    eventActivity.R().e.y(0);
                                }
                                Set set = aef.a;
                                x0f b = aef.b(eventActivity, event2, fv.EVENT_SCREEN);
                                if (b != null && eventActivity.z().a(b)) {
                                    aef.c(eventActivity.A(), b.i);
                                }
                                mr5 T = eventActivity.T();
                                xw3.L(un0.z(T), null, null, new cr5(T, event2, r3, i5), 3);
                            }
                            if (eventActivity.b0 == null) {
                                ViewGroup.LayoutParams layoutParams = eventActivity.R().d.getLayoutParams();
                                ta0 ta0Var = layoutParams instanceof ta0 ? (ta0) layoutParams : null;
                                if (ta0Var != null) {
                                    ta0Var.a = 19;
                                }
                                String s2 = ok3.s(event2);
                                switch (s2.hashCode()) {
                                    case -1721090992:
                                        if (s2.equals(Sports.BASEBALL)) {
                                            z03Var = new h81(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    case -1160328212:
                                        if (s2.equals(Sports.VOLLEYBALL)) {
                                            z03Var = new xwk(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    case -877324069:
                                        if (s2.equals(Sports.TENNIS)) {
                                            z03Var = new m5j(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    case 394668909:
                                        if (s2.equals(Sports.FOOTBALL)) {
                                            z03Var = new kj8(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    default:
                                        z03Var = new z03(eventActivity);
                                        break;
                                }
                                eventActivity.b0 = z03Var;
                                eventActivity.R().f.addView(eventActivity.b0);
                            }
                            s21 s21Var2 = eventActivity.b0;
                            if (s21Var2 != null) {
                                s21Var2.setEvent(event2);
                            }
                            break;
                        }
                        break;
                    default:
                        wxf wxfVar10 = EventActivity.h0;
                        Event event4 = (Event) eventActivity.T().v.d();
                        if (event4 != null && me4.t(StatusKt.STATUS_IN_PROGRESS, event4) && !event4.isCrowdsourcingLive()) {
                            s21 s21Var3 = eventActivity.b0;
                            e21 e21Var = s21Var3 instanceof e21 ? (e21) s21Var3 : null;
                            if (e21Var != null) {
                                e21Var.q(event4);
                            }
                        }
                        break;
                }
                return Unit.a;
            }
        }));
        mr5 T = T();
        Bundle extras2 = getIntent().getExtras();
        T.N = Intrinsics.c(extras2 != null ? Boolean.valueOf(extras2.getBoolean("openCrowdsourcing")) : null, Boolean.TRUE);
        final int i4 = 8;
        T().v.e(this, new z1(7, new Function1(this) { // from class: vq5
            public final /* synthetic */ EventActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [rq3] */
            /* JADX WARN: Type inference failed for: r3v17 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                s21 z03Var;
                int i42 = i4;
                boolean z = true;
                int i5 = 0;
                EventActivity eventActivity = this.b;
                switch (i42) {
                    case 0:
                        Event event = (Event) obj;
                        wxf wxfVar = EventActivity.h0;
                        event.getClass();
                        fdi fdiVar = eventActivity.T().u;
                        fdiVar.getClass();
                        fdiVar.m(null, event);
                        break;
                    case 1:
                        List list = (List) obj;
                        if (list != null) {
                            s21 s21Var = eventActivity.b0;
                            r3 = s21Var instanceof kj8 ? (kj8) s21Var : 0;
                            if (r3 != 0) {
                                r3.setFootballGoals(list);
                            }
                        } else {
                            wxf wxfVar2 = EventActivity.h0;
                        }
                        break;
                    case 2:
                        rd6 rd6Var = (rd6) obj;
                        wxf wxfVar3 = EventActivity.h0;
                        rd6Var.getClass();
                        if (!eventActivity.U().p(rd6Var.ordinal())) {
                            eventActivity.Z.add(rd6Var);
                        }
                        int D = eventActivity.U().D(rd6Var);
                        if (D == -1) {
                            int ordinal = rd6Var.ordinal();
                            dsf dsfVar = new dsf();
                            dsfVar.a = ordinal;
                            for (int i6 = 0; i6 < ordinal; i6++) {
                                rd6 rd6Var2 = (rd6) rd6.u.get(i6);
                                int i7 = dsfVar.a;
                                int D2 = eventActivity.U().D(rd6Var2);
                                if (D2 > 0) {
                                    D2 = 0;
                                }
                                dsfVar.a = i7 + D2;
                            }
                            eventActivity.U().v(rd6Var, dsfVar.a);
                            eventActivity.R().k.post(new yq5(0, eventActivity, dsfVar));
                        } else {
                            z = q5a.K(eventActivity.R().k, D);
                        }
                        break;
                    case 3:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        wxf wxfVar4 = EventActivity.h0;
                        if (!booleanValue) {
                            eventActivity.R().e.y(0);
                        } else if (eventActivity.R().e.getVisibility() == 0) {
                            eventActivity.R().e.y(1);
                        } else {
                            eventActivity.R().e.setVisibility(8);
                        }
                        break;
                    case 4:
                        wxf wxfVar5 = EventActivity.h0;
                        ((Unit) obj).getClass();
                        eventActivity.setResult(-1, eventActivity.getIntent());
                        break;
                    case 5:
                        Boolean bool = (Boolean) obj;
                        wxf wxfVar6 = EventActivity.h0;
                        ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = eventActivity.R().c;
                        bool.getClass();
                        toolbarBackgroundAppBarLayout.g(bool.booleanValue(), true, true);
                        break;
                    case 6:
                        wxf wxfVar7 = EventActivity.h0;
                        ((Unit) obj).getClass();
                        eventActivity.z().a(new h1f(((Number) eventActivity.S.getValue()).intValue()));
                        break;
                    case 7:
                        wxf wxfVar8 = EventActivity.h0;
                        int i8 = zq5.a[((cg) obj).a.ordinal()];
                        joa joaVar = eventActivity.c0;
                        if (i8 == 1) {
                            ((yk) joaVar.getValue()).show();
                        } else {
                            ((yk) joaVar.getValue()).dismiss();
                        }
                        break;
                    case 8:
                        Event event2 = (Event) obj;
                        wxf wxfVar9 = EventActivity.h0;
                        if (event2 == null) {
                            break;
                        } else {
                            qa6 qa6Var = su8.a;
                            su suVar = eventActivity.x;
                            f5p.E(eventActivity, new d17(event2, r3, 24));
                            suVar.a = Integer.valueOf(event2.getId());
                            suVar.c = event2.getStatusType();
                            sd6 U = eventActivity.U();
                            String s = ok3.s(event2);
                            U.getClass();
                            s.getClass();
                            U.r = s;
                            eventActivity.U().s = o3a.F(event2.getTournament());
                            eventActivity.U().t = event2.getTournament().getCategory().getSlug();
                            sd6 U2 = eventActivity.U();
                            Season season = event2.getTournament().getSeason();
                            U2.u = season != null ? season.getName() : null;
                            eventActivity.V(event2);
                            if (!eventActivity.K) {
                                eventActivity.R().h.setEnabled(false);
                                AdBannerView adBannerView = eventActivity.R().b;
                                ltb ltbVar = new ltb();
                                Event event3 = (Event) eventActivity.T().v.d();
                                if (event3 != null) {
                                    ltbVar.put(SearchResponseKt.SPORT_ENTITY, event3.getSportSlug());
                                    Integer F = o3a.F(event3.getTournament());
                                    if (F != null) {
                                        ltbVar.put("unique_tournament_id", String.valueOf(F.intValue()));
                                    }
                                    if (((Boolean) eventActivity.T.getValue()).booleanValue()) {
                                        ltbVar.put("previous_page", "tournament");
                                    }
                                    ltbVar.put("event_status", event3.getStatus().getType());
                                    TeamSides teamSides = TeamSides.ORIGINAL;
                                    ltbVar.put("home_team_id", String.valueOf(event3.getHomeTeam(teamSides).getId()));
                                    ltbVar.put("away_team_id", String.valueOf(event3.getAwayTeam(teamSides).getId()));
                                    ltbVar.put("page", "event");
                                    OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) CollectionsKt.firstOrNull(eventActivity.T().l.c());
                                    if (oddsCountryProvider != null) {
                                        ltbVar.put("odds_provider", oddsCountryProvider.getSubProviderIds().toString());
                                    }
                                }
                                eventActivity.I(adBannerView, ltbVar.d());
                                Intent intent = eventActivity.getIntent();
                                intent.getClass();
                                FirebaseBundle firebaseBundle = new FirebaseBundle();
                                String F2 = nv.F(intent);
                                if (F2 != null) {
                                    firebaseBundle.putString(Payload.CAMPAIGN_ID, F2);
                                }
                                nv.h(firebaseBundle, intent);
                                firebaseBundle.putInt("id", event2.getId());
                                firebaseBundle.putString("location", nv.G(intent).a);
                                firebaseBundle.putString("status", event2.getStatus().getType());
                                nv.N(eventActivity, firebaseBundle, "open_event");
                                v38 w = eventActivity.w();
                                String sportSlug = event2.getSportSlug();
                                sportSlug.getClass();
                                String replace = sportSlug.replace('-', '_');
                                replace.getClass();
                                w.b("event_".concat(replace));
                                eventActivity.w().b("event_tournament_" + o3a.F(event2.getTournament()));
                                ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout2 = eventActivity.R().c;
                                g6b lifecycle = eventActivity.getLifecycle();
                                lifecycle.getClass();
                                toolbarBackgroundAppBarLayout2.C.a(lifecycle, event2);
                                pco.G(eventActivity.R().e, new uq5(eventActivity, 10));
                                if (!((dsi) eventActivity.Q.getValue()).d) {
                                    eventActivity.R().e.y(0);
                                }
                                Set set = aef.a;
                                x0f b = aef.b(eventActivity, event2, fv.EVENT_SCREEN);
                                if (b != null && eventActivity.z().a(b)) {
                                    aef.c(eventActivity.A(), b.i);
                                }
                                mr5 T2 = eventActivity.T();
                                xw3.L(un0.z(T2), null, null, new cr5(T2, event2, r3, i5), 3);
                            }
                            if (eventActivity.b0 == null) {
                                ViewGroup.LayoutParams layoutParams = eventActivity.R().d.getLayoutParams();
                                ta0 ta0Var = layoutParams instanceof ta0 ? (ta0) layoutParams : null;
                                if (ta0Var != null) {
                                    ta0Var.a = 19;
                                }
                                String s2 = ok3.s(event2);
                                switch (s2.hashCode()) {
                                    case -1721090992:
                                        if (s2.equals(Sports.BASEBALL)) {
                                            z03Var = new h81(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    case -1160328212:
                                        if (s2.equals(Sports.VOLLEYBALL)) {
                                            z03Var = new xwk(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    case -877324069:
                                        if (s2.equals(Sports.TENNIS)) {
                                            z03Var = new m5j(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    case 394668909:
                                        if (s2.equals(Sports.FOOTBALL)) {
                                            z03Var = new kj8(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    default:
                                        z03Var = new z03(eventActivity);
                                        break;
                                }
                                eventActivity.b0 = z03Var;
                                eventActivity.R().f.addView(eventActivity.b0);
                            }
                            s21 s21Var2 = eventActivity.b0;
                            if (s21Var2 != null) {
                                s21Var2.setEvent(event2);
                            }
                            break;
                        }
                        break;
                    default:
                        wxf wxfVar10 = EventActivity.h0;
                        Event event4 = (Event) eventActivity.T().v.d();
                        if (event4 != null && me4.t(StatusKt.STATUS_IN_PROGRESS, event4) && !event4.isCrowdsourcingLive()) {
                            s21 s21Var3 = eventActivity.b0;
                            e21 e21Var = s21Var3 instanceof e21 ? (e21) s21Var3 : null;
                            if (e21Var != null) {
                                e21Var.q(event4);
                            }
                        }
                        break;
                }
                return Unit.a;
            }
        }));
        final int i5 = 9;
        T().R.e(this, new z1(7, new Function1(this) { // from class: vq5
            public final /* synthetic */ EventActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [rq3] */
            /* JADX WARN: Type inference failed for: r3v17 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                s21 z03Var;
                int i42 = i5;
                boolean z = true;
                int i52 = 0;
                EventActivity eventActivity = this.b;
                switch (i42) {
                    case 0:
                        Event event = (Event) obj;
                        wxf wxfVar = EventActivity.h0;
                        event.getClass();
                        fdi fdiVar = eventActivity.T().u;
                        fdiVar.getClass();
                        fdiVar.m(null, event);
                        break;
                    case 1:
                        List list = (List) obj;
                        if (list != null) {
                            s21 s21Var = eventActivity.b0;
                            r3 = s21Var instanceof kj8 ? (kj8) s21Var : 0;
                            if (r3 != 0) {
                                r3.setFootballGoals(list);
                            }
                        } else {
                            wxf wxfVar2 = EventActivity.h0;
                        }
                        break;
                    case 2:
                        rd6 rd6Var = (rd6) obj;
                        wxf wxfVar3 = EventActivity.h0;
                        rd6Var.getClass();
                        if (!eventActivity.U().p(rd6Var.ordinal())) {
                            eventActivity.Z.add(rd6Var);
                        }
                        int D = eventActivity.U().D(rd6Var);
                        if (D == -1) {
                            int ordinal = rd6Var.ordinal();
                            dsf dsfVar = new dsf();
                            dsfVar.a = ordinal;
                            for (int i6 = 0; i6 < ordinal; i6++) {
                                rd6 rd6Var2 = (rd6) rd6.u.get(i6);
                                int i7 = dsfVar.a;
                                int D2 = eventActivity.U().D(rd6Var2);
                                if (D2 > 0) {
                                    D2 = 0;
                                }
                                dsfVar.a = i7 + D2;
                            }
                            eventActivity.U().v(rd6Var, dsfVar.a);
                            eventActivity.R().k.post(new yq5(0, eventActivity, dsfVar));
                        } else {
                            z = q5a.K(eventActivity.R().k, D);
                        }
                        break;
                    case 3:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        wxf wxfVar4 = EventActivity.h0;
                        if (!booleanValue) {
                            eventActivity.R().e.y(0);
                        } else if (eventActivity.R().e.getVisibility() == 0) {
                            eventActivity.R().e.y(1);
                        } else {
                            eventActivity.R().e.setVisibility(8);
                        }
                        break;
                    case 4:
                        wxf wxfVar5 = EventActivity.h0;
                        ((Unit) obj).getClass();
                        eventActivity.setResult(-1, eventActivity.getIntent());
                        break;
                    case 5:
                        Boolean bool = (Boolean) obj;
                        wxf wxfVar6 = EventActivity.h0;
                        ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = eventActivity.R().c;
                        bool.getClass();
                        toolbarBackgroundAppBarLayout.g(bool.booleanValue(), true, true);
                        break;
                    case 6:
                        wxf wxfVar7 = EventActivity.h0;
                        ((Unit) obj).getClass();
                        eventActivity.z().a(new h1f(((Number) eventActivity.S.getValue()).intValue()));
                        break;
                    case 7:
                        wxf wxfVar8 = EventActivity.h0;
                        int i8 = zq5.a[((cg) obj).a.ordinal()];
                        joa joaVar = eventActivity.c0;
                        if (i8 == 1) {
                            ((yk) joaVar.getValue()).show();
                        } else {
                            ((yk) joaVar.getValue()).dismiss();
                        }
                        break;
                    case 8:
                        Event event2 = (Event) obj;
                        wxf wxfVar9 = EventActivity.h0;
                        if (event2 == null) {
                            break;
                        } else {
                            qa6 qa6Var = su8.a;
                            su suVar = eventActivity.x;
                            f5p.E(eventActivity, new d17(event2, r3, 24));
                            suVar.a = Integer.valueOf(event2.getId());
                            suVar.c = event2.getStatusType();
                            sd6 U = eventActivity.U();
                            String s = ok3.s(event2);
                            U.getClass();
                            s.getClass();
                            U.r = s;
                            eventActivity.U().s = o3a.F(event2.getTournament());
                            eventActivity.U().t = event2.getTournament().getCategory().getSlug();
                            sd6 U2 = eventActivity.U();
                            Season season = event2.getTournament().getSeason();
                            U2.u = season != null ? season.getName() : null;
                            eventActivity.V(event2);
                            if (!eventActivity.K) {
                                eventActivity.R().h.setEnabled(false);
                                AdBannerView adBannerView = eventActivity.R().b;
                                ltb ltbVar = new ltb();
                                Event event3 = (Event) eventActivity.T().v.d();
                                if (event3 != null) {
                                    ltbVar.put(SearchResponseKt.SPORT_ENTITY, event3.getSportSlug());
                                    Integer F = o3a.F(event3.getTournament());
                                    if (F != null) {
                                        ltbVar.put("unique_tournament_id", String.valueOf(F.intValue()));
                                    }
                                    if (((Boolean) eventActivity.T.getValue()).booleanValue()) {
                                        ltbVar.put("previous_page", "tournament");
                                    }
                                    ltbVar.put("event_status", event3.getStatus().getType());
                                    TeamSides teamSides = TeamSides.ORIGINAL;
                                    ltbVar.put("home_team_id", String.valueOf(event3.getHomeTeam(teamSides).getId()));
                                    ltbVar.put("away_team_id", String.valueOf(event3.getAwayTeam(teamSides).getId()));
                                    ltbVar.put("page", "event");
                                    OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) CollectionsKt.firstOrNull(eventActivity.T().l.c());
                                    if (oddsCountryProvider != null) {
                                        ltbVar.put("odds_provider", oddsCountryProvider.getSubProviderIds().toString());
                                    }
                                }
                                eventActivity.I(adBannerView, ltbVar.d());
                                Intent intent = eventActivity.getIntent();
                                intent.getClass();
                                FirebaseBundle firebaseBundle = new FirebaseBundle();
                                String F2 = nv.F(intent);
                                if (F2 != null) {
                                    firebaseBundle.putString(Payload.CAMPAIGN_ID, F2);
                                }
                                nv.h(firebaseBundle, intent);
                                firebaseBundle.putInt("id", event2.getId());
                                firebaseBundle.putString("location", nv.G(intent).a);
                                firebaseBundle.putString("status", event2.getStatus().getType());
                                nv.N(eventActivity, firebaseBundle, "open_event");
                                v38 w = eventActivity.w();
                                String sportSlug = event2.getSportSlug();
                                sportSlug.getClass();
                                String replace = sportSlug.replace('-', '_');
                                replace.getClass();
                                w.b("event_".concat(replace));
                                eventActivity.w().b("event_tournament_" + o3a.F(event2.getTournament()));
                                ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout2 = eventActivity.R().c;
                                g6b lifecycle = eventActivity.getLifecycle();
                                lifecycle.getClass();
                                toolbarBackgroundAppBarLayout2.C.a(lifecycle, event2);
                                pco.G(eventActivity.R().e, new uq5(eventActivity, 10));
                                if (!((dsi) eventActivity.Q.getValue()).d) {
                                    eventActivity.R().e.y(0);
                                }
                                Set set = aef.a;
                                x0f b = aef.b(eventActivity, event2, fv.EVENT_SCREEN);
                                if (b != null && eventActivity.z().a(b)) {
                                    aef.c(eventActivity.A(), b.i);
                                }
                                mr5 T2 = eventActivity.T();
                                xw3.L(un0.z(T2), null, null, new cr5(T2, event2, r3, i52), 3);
                            }
                            if (eventActivity.b0 == null) {
                                ViewGroup.LayoutParams layoutParams = eventActivity.R().d.getLayoutParams();
                                ta0 ta0Var = layoutParams instanceof ta0 ? (ta0) layoutParams : null;
                                if (ta0Var != null) {
                                    ta0Var.a = 19;
                                }
                                String s2 = ok3.s(event2);
                                switch (s2.hashCode()) {
                                    case -1721090992:
                                        if (s2.equals(Sports.BASEBALL)) {
                                            z03Var = new h81(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    case -1160328212:
                                        if (s2.equals(Sports.VOLLEYBALL)) {
                                            z03Var = new xwk(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    case -877324069:
                                        if (s2.equals(Sports.TENNIS)) {
                                            z03Var = new m5j(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    case 394668909:
                                        if (s2.equals(Sports.FOOTBALL)) {
                                            z03Var = new kj8(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    default:
                                        z03Var = new z03(eventActivity);
                                        break;
                                }
                                eventActivity.b0 = z03Var;
                                eventActivity.R().f.addView(eventActivity.b0);
                            }
                            s21 s21Var2 = eventActivity.b0;
                            if (s21Var2 != null) {
                                s21Var2.setEvent(event2);
                            }
                            break;
                        }
                        break;
                    default:
                        wxf wxfVar10 = EventActivity.h0;
                        Event event4 = (Event) eventActivity.T().v.d();
                        if (event4 != null && me4.t(StatusKt.STATUS_IN_PROGRESS, event4) && !event4.isCrowdsourcingLive()) {
                            s21 s21Var3 = eventActivity.b0;
                            e21 e21Var = s21Var3 instanceof e21 ? (e21) s21Var3 : null;
                            if (e21Var != null) {
                                e21Var.q(event4);
                            }
                        }
                        break;
                }
                return Unit.a;
            }
        }));
        s5d s5dVar = this.N;
        if (s5dVar == null) {
            Intrinsics.i("natsSocket");
            throw null;
        }
        e6b e6bVar = e6b.a;
        final int i6 = 0;
        s5dVar.a(this, ljg.j(((Number) this.S.getValue()).intValue(), "event."), new uq5(this, i6), false, new Function1(this) { // from class: vq5
            public final /* synthetic */ EventActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [rq3] */
            /* JADX WARN: Type inference failed for: r3v17 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                s21 z03Var;
                int i42 = i6;
                boolean z = true;
                int i52 = 0;
                EventActivity eventActivity = this.b;
                switch (i42) {
                    case 0:
                        Event event = (Event) obj;
                        wxf wxfVar = EventActivity.h0;
                        event.getClass();
                        fdi fdiVar = eventActivity.T().u;
                        fdiVar.getClass();
                        fdiVar.m(null, event);
                        break;
                    case 1:
                        List list = (List) obj;
                        if (list != null) {
                            s21 s21Var = eventActivity.b0;
                            r3 = s21Var instanceof kj8 ? (kj8) s21Var : 0;
                            if (r3 != 0) {
                                r3.setFootballGoals(list);
                            }
                        } else {
                            wxf wxfVar2 = EventActivity.h0;
                        }
                        break;
                    case 2:
                        rd6 rd6Var = (rd6) obj;
                        wxf wxfVar3 = EventActivity.h0;
                        rd6Var.getClass();
                        if (!eventActivity.U().p(rd6Var.ordinal())) {
                            eventActivity.Z.add(rd6Var);
                        }
                        int D = eventActivity.U().D(rd6Var);
                        if (D == -1) {
                            int ordinal = rd6Var.ordinal();
                            dsf dsfVar = new dsf();
                            dsfVar.a = ordinal;
                            for (int i62 = 0; i62 < ordinal; i62++) {
                                rd6 rd6Var2 = (rd6) rd6.u.get(i62);
                                int i7 = dsfVar.a;
                                int D2 = eventActivity.U().D(rd6Var2);
                                if (D2 > 0) {
                                    D2 = 0;
                                }
                                dsfVar.a = i7 + D2;
                            }
                            eventActivity.U().v(rd6Var, dsfVar.a);
                            eventActivity.R().k.post(new yq5(0, eventActivity, dsfVar));
                        } else {
                            z = q5a.K(eventActivity.R().k, D);
                        }
                        break;
                    case 3:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        wxf wxfVar4 = EventActivity.h0;
                        if (!booleanValue) {
                            eventActivity.R().e.y(0);
                        } else if (eventActivity.R().e.getVisibility() == 0) {
                            eventActivity.R().e.y(1);
                        } else {
                            eventActivity.R().e.setVisibility(8);
                        }
                        break;
                    case 4:
                        wxf wxfVar5 = EventActivity.h0;
                        ((Unit) obj).getClass();
                        eventActivity.setResult(-1, eventActivity.getIntent());
                        break;
                    case 5:
                        Boolean bool = (Boolean) obj;
                        wxf wxfVar6 = EventActivity.h0;
                        ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = eventActivity.R().c;
                        bool.getClass();
                        toolbarBackgroundAppBarLayout.g(bool.booleanValue(), true, true);
                        break;
                    case 6:
                        wxf wxfVar7 = EventActivity.h0;
                        ((Unit) obj).getClass();
                        eventActivity.z().a(new h1f(((Number) eventActivity.S.getValue()).intValue()));
                        break;
                    case 7:
                        wxf wxfVar8 = EventActivity.h0;
                        int i8 = zq5.a[((cg) obj).a.ordinal()];
                        joa joaVar = eventActivity.c0;
                        if (i8 == 1) {
                            ((yk) joaVar.getValue()).show();
                        } else {
                            ((yk) joaVar.getValue()).dismiss();
                        }
                        break;
                    case 8:
                        Event event2 = (Event) obj;
                        wxf wxfVar9 = EventActivity.h0;
                        if (event2 == null) {
                            break;
                        } else {
                            qa6 qa6Var = su8.a;
                            su suVar = eventActivity.x;
                            f5p.E(eventActivity, new d17(event2, r3, 24));
                            suVar.a = Integer.valueOf(event2.getId());
                            suVar.c = event2.getStatusType();
                            sd6 U = eventActivity.U();
                            String s = ok3.s(event2);
                            U.getClass();
                            s.getClass();
                            U.r = s;
                            eventActivity.U().s = o3a.F(event2.getTournament());
                            eventActivity.U().t = event2.getTournament().getCategory().getSlug();
                            sd6 U2 = eventActivity.U();
                            Season season = event2.getTournament().getSeason();
                            U2.u = season != null ? season.getName() : null;
                            eventActivity.V(event2);
                            if (!eventActivity.K) {
                                eventActivity.R().h.setEnabled(false);
                                AdBannerView adBannerView = eventActivity.R().b;
                                ltb ltbVar = new ltb();
                                Event event3 = (Event) eventActivity.T().v.d();
                                if (event3 != null) {
                                    ltbVar.put(SearchResponseKt.SPORT_ENTITY, event3.getSportSlug());
                                    Integer F = o3a.F(event3.getTournament());
                                    if (F != null) {
                                        ltbVar.put("unique_tournament_id", String.valueOf(F.intValue()));
                                    }
                                    if (((Boolean) eventActivity.T.getValue()).booleanValue()) {
                                        ltbVar.put("previous_page", "tournament");
                                    }
                                    ltbVar.put("event_status", event3.getStatus().getType());
                                    TeamSides teamSides = TeamSides.ORIGINAL;
                                    ltbVar.put("home_team_id", String.valueOf(event3.getHomeTeam(teamSides).getId()));
                                    ltbVar.put("away_team_id", String.valueOf(event3.getAwayTeam(teamSides).getId()));
                                    ltbVar.put("page", "event");
                                    OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) CollectionsKt.firstOrNull(eventActivity.T().l.c());
                                    if (oddsCountryProvider != null) {
                                        ltbVar.put("odds_provider", oddsCountryProvider.getSubProviderIds().toString());
                                    }
                                }
                                eventActivity.I(adBannerView, ltbVar.d());
                                Intent intent = eventActivity.getIntent();
                                intent.getClass();
                                FirebaseBundle firebaseBundle = new FirebaseBundle();
                                String F2 = nv.F(intent);
                                if (F2 != null) {
                                    firebaseBundle.putString(Payload.CAMPAIGN_ID, F2);
                                }
                                nv.h(firebaseBundle, intent);
                                firebaseBundle.putInt("id", event2.getId());
                                firebaseBundle.putString("location", nv.G(intent).a);
                                firebaseBundle.putString("status", event2.getStatus().getType());
                                nv.N(eventActivity, firebaseBundle, "open_event");
                                v38 w = eventActivity.w();
                                String sportSlug = event2.getSportSlug();
                                sportSlug.getClass();
                                String replace = sportSlug.replace('-', '_');
                                replace.getClass();
                                w.b("event_".concat(replace));
                                eventActivity.w().b("event_tournament_" + o3a.F(event2.getTournament()));
                                ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout2 = eventActivity.R().c;
                                g6b lifecycle = eventActivity.getLifecycle();
                                lifecycle.getClass();
                                toolbarBackgroundAppBarLayout2.C.a(lifecycle, event2);
                                pco.G(eventActivity.R().e, new uq5(eventActivity, 10));
                                if (!((dsi) eventActivity.Q.getValue()).d) {
                                    eventActivity.R().e.y(0);
                                }
                                Set set = aef.a;
                                x0f b = aef.b(eventActivity, event2, fv.EVENT_SCREEN);
                                if (b != null && eventActivity.z().a(b)) {
                                    aef.c(eventActivity.A(), b.i);
                                }
                                mr5 T2 = eventActivity.T();
                                xw3.L(un0.z(T2), null, null, new cr5(T2, event2, r3, i52), 3);
                            }
                            if (eventActivity.b0 == null) {
                                ViewGroup.LayoutParams layoutParams = eventActivity.R().d.getLayoutParams();
                                ta0 ta0Var = layoutParams instanceof ta0 ? (ta0) layoutParams : null;
                                if (ta0Var != null) {
                                    ta0Var.a = 19;
                                }
                                String s2 = ok3.s(event2);
                                switch (s2.hashCode()) {
                                    case -1721090992:
                                        if (s2.equals(Sports.BASEBALL)) {
                                            z03Var = new h81(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    case -1160328212:
                                        if (s2.equals(Sports.VOLLEYBALL)) {
                                            z03Var = new xwk(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    case -877324069:
                                        if (s2.equals(Sports.TENNIS)) {
                                            z03Var = new m5j(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    case 394668909:
                                        if (s2.equals(Sports.FOOTBALL)) {
                                            z03Var = new kj8(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    default:
                                        z03Var = new z03(eventActivity);
                                        break;
                                }
                                eventActivity.b0 = z03Var;
                                eventActivity.R().f.addView(eventActivity.b0);
                            }
                            s21 s21Var2 = eventActivity.b0;
                            if (s21Var2 != null) {
                                s21Var2.setEvent(event2);
                            }
                            break;
                        }
                        break;
                    default:
                        wxf wxfVar10 = EventActivity.h0;
                        Event event4 = (Event) eventActivity.T().v.d();
                        if (event4 != null && me4.t(StatusKt.STATUS_IN_PROGRESS, event4) && !event4.isCrowdsourcingLive()) {
                            s21 s21Var3 = eventActivity.b0;
                            e21 e21Var = s21Var3 instanceof e21 ? (e21) s21Var3 : null;
                            if (e21Var != null) {
                                e21Var.q(event4);
                            }
                        }
                        break;
                }
                return Unit.a;
            }
        });
        T().z.e(this, new z1(7, new Function1(this) { // from class: vq5
            public final /* synthetic */ EventActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [rq3] */
            /* JADX WARN: Type inference failed for: r3v17 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                s21 z03Var;
                int i42 = i;
                boolean z = true;
                int i52 = 0;
                EventActivity eventActivity = this.b;
                switch (i42) {
                    case 0:
                        Event event = (Event) obj;
                        wxf wxfVar = EventActivity.h0;
                        event.getClass();
                        fdi fdiVar = eventActivity.T().u;
                        fdiVar.getClass();
                        fdiVar.m(null, event);
                        break;
                    case 1:
                        List list = (List) obj;
                        if (list != null) {
                            s21 s21Var = eventActivity.b0;
                            r3 = s21Var instanceof kj8 ? (kj8) s21Var : 0;
                            if (r3 != 0) {
                                r3.setFootballGoals(list);
                            }
                        } else {
                            wxf wxfVar2 = EventActivity.h0;
                        }
                        break;
                    case 2:
                        rd6 rd6Var = (rd6) obj;
                        wxf wxfVar3 = EventActivity.h0;
                        rd6Var.getClass();
                        if (!eventActivity.U().p(rd6Var.ordinal())) {
                            eventActivity.Z.add(rd6Var);
                        }
                        int D = eventActivity.U().D(rd6Var);
                        if (D == -1) {
                            int ordinal = rd6Var.ordinal();
                            dsf dsfVar = new dsf();
                            dsfVar.a = ordinal;
                            for (int i62 = 0; i62 < ordinal; i62++) {
                                rd6 rd6Var2 = (rd6) rd6.u.get(i62);
                                int i7 = dsfVar.a;
                                int D2 = eventActivity.U().D(rd6Var2);
                                if (D2 > 0) {
                                    D2 = 0;
                                }
                                dsfVar.a = i7 + D2;
                            }
                            eventActivity.U().v(rd6Var, dsfVar.a);
                            eventActivity.R().k.post(new yq5(0, eventActivity, dsfVar));
                        } else {
                            z = q5a.K(eventActivity.R().k, D);
                        }
                        break;
                    case 3:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        wxf wxfVar4 = EventActivity.h0;
                        if (!booleanValue) {
                            eventActivity.R().e.y(0);
                        } else if (eventActivity.R().e.getVisibility() == 0) {
                            eventActivity.R().e.y(1);
                        } else {
                            eventActivity.R().e.setVisibility(8);
                        }
                        break;
                    case 4:
                        wxf wxfVar5 = EventActivity.h0;
                        ((Unit) obj).getClass();
                        eventActivity.setResult(-1, eventActivity.getIntent());
                        break;
                    case 5:
                        Boolean bool = (Boolean) obj;
                        wxf wxfVar6 = EventActivity.h0;
                        ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = eventActivity.R().c;
                        bool.getClass();
                        toolbarBackgroundAppBarLayout.g(bool.booleanValue(), true, true);
                        break;
                    case 6:
                        wxf wxfVar7 = EventActivity.h0;
                        ((Unit) obj).getClass();
                        eventActivity.z().a(new h1f(((Number) eventActivity.S.getValue()).intValue()));
                        break;
                    case 7:
                        wxf wxfVar8 = EventActivity.h0;
                        int i8 = zq5.a[((cg) obj).a.ordinal()];
                        joa joaVar = eventActivity.c0;
                        if (i8 == 1) {
                            ((yk) joaVar.getValue()).show();
                        } else {
                            ((yk) joaVar.getValue()).dismiss();
                        }
                        break;
                    case 8:
                        Event event2 = (Event) obj;
                        wxf wxfVar9 = EventActivity.h0;
                        if (event2 == null) {
                            break;
                        } else {
                            qa6 qa6Var = su8.a;
                            su suVar = eventActivity.x;
                            f5p.E(eventActivity, new d17(event2, r3, 24));
                            suVar.a = Integer.valueOf(event2.getId());
                            suVar.c = event2.getStatusType();
                            sd6 U = eventActivity.U();
                            String s = ok3.s(event2);
                            U.getClass();
                            s.getClass();
                            U.r = s;
                            eventActivity.U().s = o3a.F(event2.getTournament());
                            eventActivity.U().t = event2.getTournament().getCategory().getSlug();
                            sd6 U2 = eventActivity.U();
                            Season season = event2.getTournament().getSeason();
                            U2.u = season != null ? season.getName() : null;
                            eventActivity.V(event2);
                            if (!eventActivity.K) {
                                eventActivity.R().h.setEnabled(false);
                                AdBannerView adBannerView = eventActivity.R().b;
                                ltb ltbVar = new ltb();
                                Event event3 = (Event) eventActivity.T().v.d();
                                if (event3 != null) {
                                    ltbVar.put(SearchResponseKt.SPORT_ENTITY, event3.getSportSlug());
                                    Integer F = o3a.F(event3.getTournament());
                                    if (F != null) {
                                        ltbVar.put("unique_tournament_id", String.valueOf(F.intValue()));
                                    }
                                    if (((Boolean) eventActivity.T.getValue()).booleanValue()) {
                                        ltbVar.put("previous_page", "tournament");
                                    }
                                    ltbVar.put("event_status", event3.getStatus().getType());
                                    TeamSides teamSides = TeamSides.ORIGINAL;
                                    ltbVar.put("home_team_id", String.valueOf(event3.getHomeTeam(teamSides).getId()));
                                    ltbVar.put("away_team_id", String.valueOf(event3.getAwayTeam(teamSides).getId()));
                                    ltbVar.put("page", "event");
                                    OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) CollectionsKt.firstOrNull(eventActivity.T().l.c());
                                    if (oddsCountryProvider != null) {
                                        ltbVar.put("odds_provider", oddsCountryProvider.getSubProviderIds().toString());
                                    }
                                }
                                eventActivity.I(adBannerView, ltbVar.d());
                                Intent intent = eventActivity.getIntent();
                                intent.getClass();
                                FirebaseBundle firebaseBundle = new FirebaseBundle();
                                String F2 = nv.F(intent);
                                if (F2 != null) {
                                    firebaseBundle.putString(Payload.CAMPAIGN_ID, F2);
                                }
                                nv.h(firebaseBundle, intent);
                                firebaseBundle.putInt("id", event2.getId());
                                firebaseBundle.putString("location", nv.G(intent).a);
                                firebaseBundle.putString("status", event2.getStatus().getType());
                                nv.N(eventActivity, firebaseBundle, "open_event");
                                v38 w = eventActivity.w();
                                String sportSlug = event2.getSportSlug();
                                sportSlug.getClass();
                                String replace = sportSlug.replace('-', '_');
                                replace.getClass();
                                w.b("event_".concat(replace));
                                eventActivity.w().b("event_tournament_" + o3a.F(event2.getTournament()));
                                ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout2 = eventActivity.R().c;
                                g6b lifecycle = eventActivity.getLifecycle();
                                lifecycle.getClass();
                                toolbarBackgroundAppBarLayout2.C.a(lifecycle, event2);
                                pco.G(eventActivity.R().e, new uq5(eventActivity, 10));
                                if (!((dsi) eventActivity.Q.getValue()).d) {
                                    eventActivity.R().e.y(0);
                                }
                                Set set = aef.a;
                                x0f b = aef.b(eventActivity, event2, fv.EVENT_SCREEN);
                                if (b != null && eventActivity.z().a(b)) {
                                    aef.c(eventActivity.A(), b.i);
                                }
                                mr5 T2 = eventActivity.T();
                                xw3.L(un0.z(T2), null, null, new cr5(T2, event2, r3, i52), 3);
                            }
                            if (eventActivity.b0 == null) {
                                ViewGroup.LayoutParams layoutParams = eventActivity.R().d.getLayoutParams();
                                ta0 ta0Var = layoutParams instanceof ta0 ? (ta0) layoutParams : null;
                                if (ta0Var != null) {
                                    ta0Var.a = 19;
                                }
                                String s2 = ok3.s(event2);
                                switch (s2.hashCode()) {
                                    case -1721090992:
                                        if (s2.equals(Sports.BASEBALL)) {
                                            z03Var = new h81(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    case -1160328212:
                                        if (s2.equals(Sports.VOLLEYBALL)) {
                                            z03Var = new xwk(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    case -877324069:
                                        if (s2.equals(Sports.TENNIS)) {
                                            z03Var = new m5j(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    case 394668909:
                                        if (s2.equals(Sports.FOOTBALL)) {
                                            z03Var = new kj8(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    default:
                                        z03Var = new z03(eventActivity);
                                        break;
                                }
                                eventActivity.b0 = z03Var;
                                eventActivity.R().f.addView(eventActivity.b0);
                            }
                            s21 s21Var2 = eventActivity.b0;
                            if (s21Var2 != null) {
                                s21Var2.setEvent(event2);
                            }
                            break;
                        }
                        break;
                    default:
                        wxf wxfVar10 = EventActivity.h0;
                        Event event4 = (Event) eventActivity.T().v.d();
                        if (event4 != null && me4.t(StatusKt.STATUS_IN_PROGRESS, event4) && !event4.isCrowdsourcingLive()) {
                            s21 s21Var3 = eventActivity.b0;
                            e21 e21Var = s21Var3 instanceof e21 ? (e21) s21Var3 : null;
                            if (e21Var != null) {
                                e21Var.q(event4);
                            }
                        }
                        break;
                }
                return Unit.a;
            }
        }));
        T().x.e(this, new z1(7, new r82(22, this, bundle)));
        z8e.x(this, T().O, new r1(this, rq3Var, 19));
        sd6 U = U();
        final int i7 = 2;
        Function1 function1 = new Function1(this) { // from class: vq5
            public final /* synthetic */ EventActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [rq3] */
            /* JADX WARN: Type inference failed for: r3v17 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                s21 z03Var;
                int i42 = i7;
                boolean z = true;
                int i52 = 0;
                EventActivity eventActivity = this.b;
                switch (i42) {
                    case 0:
                        Event event = (Event) obj;
                        wxf wxfVar = EventActivity.h0;
                        event.getClass();
                        fdi fdiVar = eventActivity.T().u;
                        fdiVar.getClass();
                        fdiVar.m(null, event);
                        break;
                    case 1:
                        List list = (List) obj;
                        if (list != null) {
                            s21 s21Var = eventActivity.b0;
                            r3 = s21Var instanceof kj8 ? (kj8) s21Var : 0;
                            if (r3 != 0) {
                                r3.setFootballGoals(list);
                            }
                        } else {
                            wxf wxfVar2 = EventActivity.h0;
                        }
                        break;
                    case 2:
                        rd6 rd6Var = (rd6) obj;
                        wxf wxfVar3 = EventActivity.h0;
                        rd6Var.getClass();
                        if (!eventActivity.U().p(rd6Var.ordinal())) {
                            eventActivity.Z.add(rd6Var);
                        }
                        int D = eventActivity.U().D(rd6Var);
                        if (D == -1) {
                            int ordinal = rd6Var.ordinal();
                            dsf dsfVar = new dsf();
                            dsfVar.a = ordinal;
                            for (int i62 = 0; i62 < ordinal; i62++) {
                                rd6 rd6Var2 = (rd6) rd6.u.get(i62);
                                int i72 = dsfVar.a;
                                int D2 = eventActivity.U().D(rd6Var2);
                                if (D2 > 0) {
                                    D2 = 0;
                                }
                                dsfVar.a = i72 + D2;
                            }
                            eventActivity.U().v(rd6Var, dsfVar.a);
                            eventActivity.R().k.post(new yq5(0, eventActivity, dsfVar));
                        } else {
                            z = q5a.K(eventActivity.R().k, D);
                        }
                        break;
                    case 3:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        wxf wxfVar4 = EventActivity.h0;
                        if (!booleanValue) {
                            eventActivity.R().e.y(0);
                        } else if (eventActivity.R().e.getVisibility() == 0) {
                            eventActivity.R().e.y(1);
                        } else {
                            eventActivity.R().e.setVisibility(8);
                        }
                        break;
                    case 4:
                        wxf wxfVar5 = EventActivity.h0;
                        ((Unit) obj).getClass();
                        eventActivity.setResult(-1, eventActivity.getIntent());
                        break;
                    case 5:
                        Boolean bool = (Boolean) obj;
                        wxf wxfVar6 = EventActivity.h0;
                        ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = eventActivity.R().c;
                        bool.getClass();
                        toolbarBackgroundAppBarLayout.g(bool.booleanValue(), true, true);
                        break;
                    case 6:
                        wxf wxfVar7 = EventActivity.h0;
                        ((Unit) obj).getClass();
                        eventActivity.z().a(new h1f(((Number) eventActivity.S.getValue()).intValue()));
                        break;
                    case 7:
                        wxf wxfVar8 = EventActivity.h0;
                        int i8 = zq5.a[((cg) obj).a.ordinal()];
                        joa joaVar = eventActivity.c0;
                        if (i8 == 1) {
                            ((yk) joaVar.getValue()).show();
                        } else {
                            ((yk) joaVar.getValue()).dismiss();
                        }
                        break;
                    case 8:
                        Event event2 = (Event) obj;
                        wxf wxfVar9 = EventActivity.h0;
                        if (event2 == null) {
                            break;
                        } else {
                            qa6 qa6Var = su8.a;
                            su suVar = eventActivity.x;
                            f5p.E(eventActivity, new d17(event2, r3, 24));
                            suVar.a = Integer.valueOf(event2.getId());
                            suVar.c = event2.getStatusType();
                            sd6 U2 = eventActivity.U();
                            String s = ok3.s(event2);
                            U2.getClass();
                            s.getClass();
                            U2.r = s;
                            eventActivity.U().s = o3a.F(event2.getTournament());
                            eventActivity.U().t = event2.getTournament().getCategory().getSlug();
                            sd6 U22 = eventActivity.U();
                            Season season = event2.getTournament().getSeason();
                            U22.u = season != null ? season.getName() : null;
                            eventActivity.V(event2);
                            if (!eventActivity.K) {
                                eventActivity.R().h.setEnabled(false);
                                AdBannerView adBannerView = eventActivity.R().b;
                                ltb ltbVar = new ltb();
                                Event event3 = (Event) eventActivity.T().v.d();
                                if (event3 != null) {
                                    ltbVar.put(SearchResponseKt.SPORT_ENTITY, event3.getSportSlug());
                                    Integer F = o3a.F(event3.getTournament());
                                    if (F != null) {
                                        ltbVar.put("unique_tournament_id", String.valueOf(F.intValue()));
                                    }
                                    if (((Boolean) eventActivity.T.getValue()).booleanValue()) {
                                        ltbVar.put("previous_page", "tournament");
                                    }
                                    ltbVar.put("event_status", event3.getStatus().getType());
                                    TeamSides teamSides = TeamSides.ORIGINAL;
                                    ltbVar.put("home_team_id", String.valueOf(event3.getHomeTeam(teamSides).getId()));
                                    ltbVar.put("away_team_id", String.valueOf(event3.getAwayTeam(teamSides).getId()));
                                    ltbVar.put("page", "event");
                                    OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) CollectionsKt.firstOrNull(eventActivity.T().l.c());
                                    if (oddsCountryProvider != null) {
                                        ltbVar.put("odds_provider", oddsCountryProvider.getSubProviderIds().toString());
                                    }
                                }
                                eventActivity.I(adBannerView, ltbVar.d());
                                Intent intent = eventActivity.getIntent();
                                intent.getClass();
                                FirebaseBundle firebaseBundle = new FirebaseBundle();
                                String F2 = nv.F(intent);
                                if (F2 != null) {
                                    firebaseBundle.putString(Payload.CAMPAIGN_ID, F2);
                                }
                                nv.h(firebaseBundle, intent);
                                firebaseBundle.putInt("id", event2.getId());
                                firebaseBundle.putString("location", nv.G(intent).a);
                                firebaseBundle.putString("status", event2.getStatus().getType());
                                nv.N(eventActivity, firebaseBundle, "open_event");
                                v38 w = eventActivity.w();
                                String sportSlug = event2.getSportSlug();
                                sportSlug.getClass();
                                String replace = sportSlug.replace('-', '_');
                                replace.getClass();
                                w.b("event_".concat(replace));
                                eventActivity.w().b("event_tournament_" + o3a.F(event2.getTournament()));
                                ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout2 = eventActivity.R().c;
                                g6b lifecycle = eventActivity.getLifecycle();
                                lifecycle.getClass();
                                toolbarBackgroundAppBarLayout2.C.a(lifecycle, event2);
                                pco.G(eventActivity.R().e, new uq5(eventActivity, 10));
                                if (!((dsi) eventActivity.Q.getValue()).d) {
                                    eventActivity.R().e.y(0);
                                }
                                Set set = aef.a;
                                x0f b = aef.b(eventActivity, event2, fv.EVENT_SCREEN);
                                if (b != null && eventActivity.z().a(b)) {
                                    aef.c(eventActivity.A(), b.i);
                                }
                                mr5 T2 = eventActivity.T();
                                xw3.L(un0.z(T2), null, null, new cr5(T2, event2, r3, i52), 3);
                            }
                            if (eventActivity.b0 == null) {
                                ViewGroup.LayoutParams layoutParams = eventActivity.R().d.getLayoutParams();
                                ta0 ta0Var = layoutParams instanceof ta0 ? (ta0) layoutParams : null;
                                if (ta0Var != null) {
                                    ta0Var.a = 19;
                                }
                                String s2 = ok3.s(event2);
                                switch (s2.hashCode()) {
                                    case -1721090992:
                                        if (s2.equals(Sports.BASEBALL)) {
                                            z03Var = new h81(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    case -1160328212:
                                        if (s2.equals(Sports.VOLLEYBALL)) {
                                            z03Var = new xwk(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    case -877324069:
                                        if (s2.equals(Sports.TENNIS)) {
                                            z03Var = new m5j(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    case 394668909:
                                        if (s2.equals(Sports.FOOTBALL)) {
                                            z03Var = new kj8(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    default:
                                        z03Var = new z03(eventActivity);
                                        break;
                                }
                                eventActivity.b0 = z03Var;
                                eventActivity.R().f.addView(eventActivity.b0);
                            }
                            s21 s21Var2 = eventActivity.b0;
                            if (s21Var2 != null) {
                                s21Var2.setEvent(event2);
                            }
                            break;
                        }
                        break;
                    default:
                        wxf wxfVar10 = EventActivity.h0;
                        Event event4 = (Event) eventActivity.T().v.d();
                        if (event4 != null && me4.t(StatusKt.STATUS_IN_PROGRESS, event4) && !event4.isCrowdsourcingLive()) {
                            s21 s21Var3 = eventActivity.b0;
                            e21 e21Var = s21Var3 instanceof e21 ? (e21) s21Var3 : null;
                            if (e21Var != null) {
                                e21Var.q(event4);
                            }
                        }
                        break;
                }
                return Unit.a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: vq5
            public final /* synthetic */ EventActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [rq3] */
            /* JADX WARN: Type inference failed for: r3v17 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                s21 z03Var;
                int i42 = i2;
                boolean z = true;
                int i52 = 0;
                EventActivity eventActivity = this.b;
                switch (i42) {
                    case 0:
                        Event event = (Event) obj;
                        wxf wxfVar = EventActivity.h0;
                        event.getClass();
                        fdi fdiVar = eventActivity.T().u;
                        fdiVar.getClass();
                        fdiVar.m(null, event);
                        break;
                    case 1:
                        List list = (List) obj;
                        if (list != null) {
                            s21 s21Var = eventActivity.b0;
                            r3 = s21Var instanceof kj8 ? (kj8) s21Var : 0;
                            if (r3 != 0) {
                                r3.setFootballGoals(list);
                            }
                        } else {
                            wxf wxfVar2 = EventActivity.h0;
                        }
                        break;
                    case 2:
                        rd6 rd6Var = (rd6) obj;
                        wxf wxfVar3 = EventActivity.h0;
                        rd6Var.getClass();
                        if (!eventActivity.U().p(rd6Var.ordinal())) {
                            eventActivity.Z.add(rd6Var);
                        }
                        int D = eventActivity.U().D(rd6Var);
                        if (D == -1) {
                            int ordinal = rd6Var.ordinal();
                            dsf dsfVar = new dsf();
                            dsfVar.a = ordinal;
                            for (int i62 = 0; i62 < ordinal; i62++) {
                                rd6 rd6Var2 = (rd6) rd6.u.get(i62);
                                int i72 = dsfVar.a;
                                int D2 = eventActivity.U().D(rd6Var2);
                                if (D2 > 0) {
                                    D2 = 0;
                                }
                                dsfVar.a = i72 + D2;
                            }
                            eventActivity.U().v(rd6Var, dsfVar.a);
                            eventActivity.R().k.post(new yq5(0, eventActivity, dsfVar));
                        } else {
                            z = q5a.K(eventActivity.R().k, D);
                        }
                        break;
                    case 3:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        wxf wxfVar4 = EventActivity.h0;
                        if (!booleanValue) {
                            eventActivity.R().e.y(0);
                        } else if (eventActivity.R().e.getVisibility() == 0) {
                            eventActivity.R().e.y(1);
                        } else {
                            eventActivity.R().e.setVisibility(8);
                        }
                        break;
                    case 4:
                        wxf wxfVar5 = EventActivity.h0;
                        ((Unit) obj).getClass();
                        eventActivity.setResult(-1, eventActivity.getIntent());
                        break;
                    case 5:
                        Boolean bool = (Boolean) obj;
                        wxf wxfVar6 = EventActivity.h0;
                        ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = eventActivity.R().c;
                        bool.getClass();
                        toolbarBackgroundAppBarLayout.g(bool.booleanValue(), true, true);
                        break;
                    case 6:
                        wxf wxfVar7 = EventActivity.h0;
                        ((Unit) obj).getClass();
                        eventActivity.z().a(new h1f(((Number) eventActivity.S.getValue()).intValue()));
                        break;
                    case 7:
                        wxf wxfVar8 = EventActivity.h0;
                        int i8 = zq5.a[((cg) obj).a.ordinal()];
                        joa joaVar = eventActivity.c0;
                        if (i8 == 1) {
                            ((yk) joaVar.getValue()).show();
                        } else {
                            ((yk) joaVar.getValue()).dismiss();
                        }
                        break;
                    case 8:
                        Event event2 = (Event) obj;
                        wxf wxfVar9 = EventActivity.h0;
                        if (event2 == null) {
                            break;
                        } else {
                            qa6 qa6Var = su8.a;
                            su suVar = eventActivity.x;
                            f5p.E(eventActivity, new d17(event2, r3, 24));
                            suVar.a = Integer.valueOf(event2.getId());
                            suVar.c = event2.getStatusType();
                            sd6 U2 = eventActivity.U();
                            String s = ok3.s(event2);
                            U2.getClass();
                            s.getClass();
                            U2.r = s;
                            eventActivity.U().s = o3a.F(event2.getTournament());
                            eventActivity.U().t = event2.getTournament().getCategory().getSlug();
                            sd6 U22 = eventActivity.U();
                            Season season = event2.getTournament().getSeason();
                            U22.u = season != null ? season.getName() : null;
                            eventActivity.V(event2);
                            if (!eventActivity.K) {
                                eventActivity.R().h.setEnabled(false);
                                AdBannerView adBannerView = eventActivity.R().b;
                                ltb ltbVar = new ltb();
                                Event event3 = (Event) eventActivity.T().v.d();
                                if (event3 != null) {
                                    ltbVar.put(SearchResponseKt.SPORT_ENTITY, event3.getSportSlug());
                                    Integer F = o3a.F(event3.getTournament());
                                    if (F != null) {
                                        ltbVar.put("unique_tournament_id", String.valueOf(F.intValue()));
                                    }
                                    if (((Boolean) eventActivity.T.getValue()).booleanValue()) {
                                        ltbVar.put("previous_page", "tournament");
                                    }
                                    ltbVar.put("event_status", event3.getStatus().getType());
                                    TeamSides teamSides = TeamSides.ORIGINAL;
                                    ltbVar.put("home_team_id", String.valueOf(event3.getHomeTeam(teamSides).getId()));
                                    ltbVar.put("away_team_id", String.valueOf(event3.getAwayTeam(teamSides).getId()));
                                    ltbVar.put("page", "event");
                                    OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) CollectionsKt.firstOrNull(eventActivity.T().l.c());
                                    if (oddsCountryProvider != null) {
                                        ltbVar.put("odds_provider", oddsCountryProvider.getSubProviderIds().toString());
                                    }
                                }
                                eventActivity.I(adBannerView, ltbVar.d());
                                Intent intent = eventActivity.getIntent();
                                intent.getClass();
                                FirebaseBundle firebaseBundle = new FirebaseBundle();
                                String F2 = nv.F(intent);
                                if (F2 != null) {
                                    firebaseBundle.putString(Payload.CAMPAIGN_ID, F2);
                                }
                                nv.h(firebaseBundle, intent);
                                firebaseBundle.putInt("id", event2.getId());
                                firebaseBundle.putString("location", nv.G(intent).a);
                                firebaseBundle.putString("status", event2.getStatus().getType());
                                nv.N(eventActivity, firebaseBundle, "open_event");
                                v38 w = eventActivity.w();
                                String sportSlug = event2.getSportSlug();
                                sportSlug.getClass();
                                String replace = sportSlug.replace('-', '_');
                                replace.getClass();
                                w.b("event_".concat(replace));
                                eventActivity.w().b("event_tournament_" + o3a.F(event2.getTournament()));
                                ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout2 = eventActivity.R().c;
                                g6b lifecycle = eventActivity.getLifecycle();
                                lifecycle.getClass();
                                toolbarBackgroundAppBarLayout2.C.a(lifecycle, event2);
                                pco.G(eventActivity.R().e, new uq5(eventActivity, 10));
                                if (!((dsi) eventActivity.Q.getValue()).d) {
                                    eventActivity.R().e.y(0);
                                }
                                Set set = aef.a;
                                x0f b = aef.b(eventActivity, event2, fv.EVENT_SCREEN);
                                if (b != null && eventActivity.z().a(b)) {
                                    aef.c(eventActivity.A(), b.i);
                                }
                                mr5 T2 = eventActivity.T();
                                xw3.L(un0.z(T2), null, null, new cr5(T2, event2, r3, i52), 3);
                            }
                            if (eventActivity.b0 == null) {
                                ViewGroup.LayoutParams layoutParams = eventActivity.R().d.getLayoutParams();
                                ta0 ta0Var = layoutParams instanceof ta0 ? (ta0) layoutParams : null;
                                if (ta0Var != null) {
                                    ta0Var.a = 19;
                                }
                                String s2 = ok3.s(event2);
                                switch (s2.hashCode()) {
                                    case -1721090992:
                                        if (s2.equals(Sports.BASEBALL)) {
                                            z03Var = new h81(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    case -1160328212:
                                        if (s2.equals(Sports.VOLLEYBALL)) {
                                            z03Var = new xwk(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    case -877324069:
                                        if (s2.equals(Sports.TENNIS)) {
                                            z03Var = new m5j(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    case 394668909:
                                        if (s2.equals(Sports.FOOTBALL)) {
                                            z03Var = new kj8(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    default:
                                        z03Var = new z03(eventActivity);
                                        break;
                                }
                                eventActivity.b0 = z03Var;
                                eventActivity.R().f.addView(eventActivity.b0);
                            }
                            s21 s21Var2 = eventActivity.b0;
                            if (s21Var2 != null) {
                                s21Var2.setEvent(event2);
                            }
                            break;
                        }
                        break;
                    default:
                        wxf wxfVar10 = EventActivity.h0;
                        Event event4 = (Event) eventActivity.T().v.d();
                        if (event4 != null && me4.t(StatusKt.STATUS_IN_PROGRESS, event4) && !event4.isCrowdsourcingLive()) {
                            s21 s21Var3 = eventActivity.b0;
                            e21 e21Var = s21Var3 instanceof e21 ? (e21) s21Var3 : null;
                            if (e21Var != null) {
                                e21Var.q(event4);
                            }
                        }
                        break;
                }
                return Unit.a;
            }
        };
        U.getClass();
        q5a.H(this, U.p, U.j, function1, function12);
        R().k.a((ar5) this.f0.getValue());
        zzc zzcVar = T().B;
        final int i8 = 4;
        p15 p15Var = new p15(new Function1(this) { // from class: vq5
            public final /* synthetic */ EventActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [rq3] */
            /* JADX WARN: Type inference failed for: r3v17 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                s21 z03Var;
                int i42 = i8;
                boolean z = true;
                int i52 = 0;
                EventActivity eventActivity = this.b;
                switch (i42) {
                    case 0:
                        Event event = (Event) obj;
                        wxf wxfVar = EventActivity.h0;
                        event.getClass();
                        fdi fdiVar = eventActivity.T().u;
                        fdiVar.getClass();
                        fdiVar.m(null, event);
                        break;
                    case 1:
                        List list = (List) obj;
                        if (list != null) {
                            s21 s21Var = eventActivity.b0;
                            r3 = s21Var instanceof kj8 ? (kj8) s21Var : 0;
                            if (r3 != 0) {
                                r3.setFootballGoals(list);
                            }
                        } else {
                            wxf wxfVar2 = EventActivity.h0;
                        }
                        break;
                    case 2:
                        rd6 rd6Var = (rd6) obj;
                        wxf wxfVar3 = EventActivity.h0;
                        rd6Var.getClass();
                        if (!eventActivity.U().p(rd6Var.ordinal())) {
                            eventActivity.Z.add(rd6Var);
                        }
                        int D = eventActivity.U().D(rd6Var);
                        if (D == -1) {
                            int ordinal = rd6Var.ordinal();
                            dsf dsfVar = new dsf();
                            dsfVar.a = ordinal;
                            for (int i62 = 0; i62 < ordinal; i62++) {
                                rd6 rd6Var2 = (rd6) rd6.u.get(i62);
                                int i72 = dsfVar.a;
                                int D2 = eventActivity.U().D(rd6Var2);
                                if (D2 > 0) {
                                    D2 = 0;
                                }
                                dsfVar.a = i72 + D2;
                            }
                            eventActivity.U().v(rd6Var, dsfVar.a);
                            eventActivity.R().k.post(new yq5(0, eventActivity, dsfVar));
                        } else {
                            z = q5a.K(eventActivity.R().k, D);
                        }
                        break;
                    case 3:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        wxf wxfVar4 = EventActivity.h0;
                        if (!booleanValue) {
                            eventActivity.R().e.y(0);
                        } else if (eventActivity.R().e.getVisibility() == 0) {
                            eventActivity.R().e.y(1);
                        } else {
                            eventActivity.R().e.setVisibility(8);
                        }
                        break;
                    case 4:
                        wxf wxfVar5 = EventActivity.h0;
                        ((Unit) obj).getClass();
                        eventActivity.setResult(-1, eventActivity.getIntent());
                        break;
                    case 5:
                        Boolean bool = (Boolean) obj;
                        wxf wxfVar6 = EventActivity.h0;
                        ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = eventActivity.R().c;
                        bool.getClass();
                        toolbarBackgroundAppBarLayout.g(bool.booleanValue(), true, true);
                        break;
                    case 6:
                        wxf wxfVar7 = EventActivity.h0;
                        ((Unit) obj).getClass();
                        eventActivity.z().a(new h1f(((Number) eventActivity.S.getValue()).intValue()));
                        break;
                    case 7:
                        wxf wxfVar8 = EventActivity.h0;
                        int i82 = zq5.a[((cg) obj).a.ordinal()];
                        joa joaVar = eventActivity.c0;
                        if (i82 == 1) {
                            ((yk) joaVar.getValue()).show();
                        } else {
                            ((yk) joaVar.getValue()).dismiss();
                        }
                        break;
                    case 8:
                        Event event2 = (Event) obj;
                        wxf wxfVar9 = EventActivity.h0;
                        if (event2 == null) {
                            break;
                        } else {
                            qa6 qa6Var = su8.a;
                            su suVar = eventActivity.x;
                            f5p.E(eventActivity, new d17(event2, r3, 24));
                            suVar.a = Integer.valueOf(event2.getId());
                            suVar.c = event2.getStatusType();
                            sd6 U2 = eventActivity.U();
                            String s = ok3.s(event2);
                            U2.getClass();
                            s.getClass();
                            U2.r = s;
                            eventActivity.U().s = o3a.F(event2.getTournament());
                            eventActivity.U().t = event2.getTournament().getCategory().getSlug();
                            sd6 U22 = eventActivity.U();
                            Season season = event2.getTournament().getSeason();
                            U22.u = season != null ? season.getName() : null;
                            eventActivity.V(event2);
                            if (!eventActivity.K) {
                                eventActivity.R().h.setEnabled(false);
                                AdBannerView adBannerView = eventActivity.R().b;
                                ltb ltbVar = new ltb();
                                Event event3 = (Event) eventActivity.T().v.d();
                                if (event3 != null) {
                                    ltbVar.put(SearchResponseKt.SPORT_ENTITY, event3.getSportSlug());
                                    Integer F = o3a.F(event3.getTournament());
                                    if (F != null) {
                                        ltbVar.put("unique_tournament_id", String.valueOf(F.intValue()));
                                    }
                                    if (((Boolean) eventActivity.T.getValue()).booleanValue()) {
                                        ltbVar.put("previous_page", "tournament");
                                    }
                                    ltbVar.put("event_status", event3.getStatus().getType());
                                    TeamSides teamSides = TeamSides.ORIGINAL;
                                    ltbVar.put("home_team_id", String.valueOf(event3.getHomeTeam(teamSides).getId()));
                                    ltbVar.put("away_team_id", String.valueOf(event3.getAwayTeam(teamSides).getId()));
                                    ltbVar.put("page", "event");
                                    OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) CollectionsKt.firstOrNull(eventActivity.T().l.c());
                                    if (oddsCountryProvider != null) {
                                        ltbVar.put("odds_provider", oddsCountryProvider.getSubProviderIds().toString());
                                    }
                                }
                                eventActivity.I(adBannerView, ltbVar.d());
                                Intent intent = eventActivity.getIntent();
                                intent.getClass();
                                FirebaseBundle firebaseBundle = new FirebaseBundle();
                                String F2 = nv.F(intent);
                                if (F2 != null) {
                                    firebaseBundle.putString(Payload.CAMPAIGN_ID, F2);
                                }
                                nv.h(firebaseBundle, intent);
                                firebaseBundle.putInt("id", event2.getId());
                                firebaseBundle.putString("location", nv.G(intent).a);
                                firebaseBundle.putString("status", event2.getStatus().getType());
                                nv.N(eventActivity, firebaseBundle, "open_event");
                                v38 w = eventActivity.w();
                                String sportSlug = event2.getSportSlug();
                                sportSlug.getClass();
                                String replace = sportSlug.replace('-', '_');
                                replace.getClass();
                                w.b("event_".concat(replace));
                                eventActivity.w().b("event_tournament_" + o3a.F(event2.getTournament()));
                                ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout2 = eventActivity.R().c;
                                g6b lifecycle = eventActivity.getLifecycle();
                                lifecycle.getClass();
                                toolbarBackgroundAppBarLayout2.C.a(lifecycle, event2);
                                pco.G(eventActivity.R().e, new uq5(eventActivity, 10));
                                if (!((dsi) eventActivity.Q.getValue()).d) {
                                    eventActivity.R().e.y(0);
                                }
                                Set set = aef.a;
                                x0f b = aef.b(eventActivity, event2, fv.EVENT_SCREEN);
                                if (b != null && eventActivity.z().a(b)) {
                                    aef.c(eventActivity.A(), b.i);
                                }
                                mr5 T2 = eventActivity.T();
                                xw3.L(un0.z(T2), null, null, new cr5(T2, event2, r3, i52), 3);
                            }
                            if (eventActivity.b0 == null) {
                                ViewGroup.LayoutParams layoutParams = eventActivity.R().d.getLayoutParams();
                                ta0 ta0Var = layoutParams instanceof ta0 ? (ta0) layoutParams : null;
                                if (ta0Var != null) {
                                    ta0Var.a = 19;
                                }
                                String s2 = ok3.s(event2);
                                switch (s2.hashCode()) {
                                    case -1721090992:
                                        if (s2.equals(Sports.BASEBALL)) {
                                            z03Var = new h81(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    case -1160328212:
                                        if (s2.equals(Sports.VOLLEYBALL)) {
                                            z03Var = new xwk(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    case -877324069:
                                        if (s2.equals(Sports.TENNIS)) {
                                            z03Var = new m5j(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    case 394668909:
                                        if (s2.equals(Sports.FOOTBALL)) {
                                            z03Var = new kj8(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    default:
                                        z03Var = new z03(eventActivity);
                                        break;
                                }
                                eventActivity.b0 = z03Var;
                                eventActivity.R().f.addView(eventActivity.b0);
                            }
                            s21 s21Var2 = eventActivity.b0;
                            if (s21Var2 != null) {
                                s21Var2.setEvent(event2);
                            }
                            break;
                        }
                        break;
                    default:
                        wxf wxfVar10 = EventActivity.h0;
                        Event event4 = (Event) eventActivity.T().v.d();
                        if (event4 != null && me4.t(StatusKt.STATUS_IN_PROGRESS, event4) && !event4.isCrowdsourcingLive()) {
                            s21 s21Var3 = eventActivity.b0;
                            e21 e21Var = s21Var3 instanceof e21 ? (e21) s21Var3 : null;
                            if (e21Var != null) {
                                e21Var.q(event4);
                            }
                        }
                        break;
                }
                return Unit.a;
            }
        }, i);
        zzcVar.getClass();
        zzcVar.a.e(this, p15Var);
        final int i9 = 5;
        T().E.e(this, new z1(7, new Function1(this) { // from class: vq5
            public final /* synthetic */ EventActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [rq3] */
            /* JADX WARN: Type inference failed for: r3v17 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                s21 z03Var;
                int i42 = i9;
                boolean z = true;
                int i52 = 0;
                EventActivity eventActivity = this.b;
                switch (i42) {
                    case 0:
                        Event event = (Event) obj;
                        wxf wxfVar = EventActivity.h0;
                        event.getClass();
                        fdi fdiVar = eventActivity.T().u;
                        fdiVar.getClass();
                        fdiVar.m(null, event);
                        break;
                    case 1:
                        List list = (List) obj;
                        if (list != null) {
                            s21 s21Var = eventActivity.b0;
                            r3 = s21Var instanceof kj8 ? (kj8) s21Var : 0;
                            if (r3 != 0) {
                                r3.setFootballGoals(list);
                            }
                        } else {
                            wxf wxfVar2 = EventActivity.h0;
                        }
                        break;
                    case 2:
                        rd6 rd6Var = (rd6) obj;
                        wxf wxfVar3 = EventActivity.h0;
                        rd6Var.getClass();
                        if (!eventActivity.U().p(rd6Var.ordinal())) {
                            eventActivity.Z.add(rd6Var);
                        }
                        int D = eventActivity.U().D(rd6Var);
                        if (D == -1) {
                            int ordinal = rd6Var.ordinal();
                            dsf dsfVar = new dsf();
                            dsfVar.a = ordinal;
                            for (int i62 = 0; i62 < ordinal; i62++) {
                                rd6 rd6Var2 = (rd6) rd6.u.get(i62);
                                int i72 = dsfVar.a;
                                int D2 = eventActivity.U().D(rd6Var2);
                                if (D2 > 0) {
                                    D2 = 0;
                                }
                                dsfVar.a = i72 + D2;
                            }
                            eventActivity.U().v(rd6Var, dsfVar.a);
                            eventActivity.R().k.post(new yq5(0, eventActivity, dsfVar));
                        } else {
                            z = q5a.K(eventActivity.R().k, D);
                        }
                        break;
                    case 3:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        wxf wxfVar4 = EventActivity.h0;
                        if (!booleanValue) {
                            eventActivity.R().e.y(0);
                        } else if (eventActivity.R().e.getVisibility() == 0) {
                            eventActivity.R().e.y(1);
                        } else {
                            eventActivity.R().e.setVisibility(8);
                        }
                        break;
                    case 4:
                        wxf wxfVar5 = EventActivity.h0;
                        ((Unit) obj).getClass();
                        eventActivity.setResult(-1, eventActivity.getIntent());
                        break;
                    case 5:
                        Boolean bool = (Boolean) obj;
                        wxf wxfVar6 = EventActivity.h0;
                        ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = eventActivity.R().c;
                        bool.getClass();
                        toolbarBackgroundAppBarLayout.g(bool.booleanValue(), true, true);
                        break;
                    case 6:
                        wxf wxfVar7 = EventActivity.h0;
                        ((Unit) obj).getClass();
                        eventActivity.z().a(new h1f(((Number) eventActivity.S.getValue()).intValue()));
                        break;
                    case 7:
                        wxf wxfVar8 = EventActivity.h0;
                        int i82 = zq5.a[((cg) obj).a.ordinal()];
                        joa joaVar = eventActivity.c0;
                        if (i82 == 1) {
                            ((yk) joaVar.getValue()).show();
                        } else {
                            ((yk) joaVar.getValue()).dismiss();
                        }
                        break;
                    case 8:
                        Event event2 = (Event) obj;
                        wxf wxfVar9 = EventActivity.h0;
                        if (event2 == null) {
                            break;
                        } else {
                            qa6 qa6Var = su8.a;
                            su suVar = eventActivity.x;
                            f5p.E(eventActivity, new d17(event2, r3, 24));
                            suVar.a = Integer.valueOf(event2.getId());
                            suVar.c = event2.getStatusType();
                            sd6 U2 = eventActivity.U();
                            String s = ok3.s(event2);
                            U2.getClass();
                            s.getClass();
                            U2.r = s;
                            eventActivity.U().s = o3a.F(event2.getTournament());
                            eventActivity.U().t = event2.getTournament().getCategory().getSlug();
                            sd6 U22 = eventActivity.U();
                            Season season = event2.getTournament().getSeason();
                            U22.u = season != null ? season.getName() : null;
                            eventActivity.V(event2);
                            if (!eventActivity.K) {
                                eventActivity.R().h.setEnabled(false);
                                AdBannerView adBannerView = eventActivity.R().b;
                                ltb ltbVar = new ltb();
                                Event event3 = (Event) eventActivity.T().v.d();
                                if (event3 != null) {
                                    ltbVar.put(SearchResponseKt.SPORT_ENTITY, event3.getSportSlug());
                                    Integer F = o3a.F(event3.getTournament());
                                    if (F != null) {
                                        ltbVar.put("unique_tournament_id", String.valueOf(F.intValue()));
                                    }
                                    if (((Boolean) eventActivity.T.getValue()).booleanValue()) {
                                        ltbVar.put("previous_page", "tournament");
                                    }
                                    ltbVar.put("event_status", event3.getStatus().getType());
                                    TeamSides teamSides = TeamSides.ORIGINAL;
                                    ltbVar.put("home_team_id", String.valueOf(event3.getHomeTeam(teamSides).getId()));
                                    ltbVar.put("away_team_id", String.valueOf(event3.getAwayTeam(teamSides).getId()));
                                    ltbVar.put("page", "event");
                                    OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) CollectionsKt.firstOrNull(eventActivity.T().l.c());
                                    if (oddsCountryProvider != null) {
                                        ltbVar.put("odds_provider", oddsCountryProvider.getSubProviderIds().toString());
                                    }
                                }
                                eventActivity.I(adBannerView, ltbVar.d());
                                Intent intent = eventActivity.getIntent();
                                intent.getClass();
                                FirebaseBundle firebaseBundle = new FirebaseBundle();
                                String F2 = nv.F(intent);
                                if (F2 != null) {
                                    firebaseBundle.putString(Payload.CAMPAIGN_ID, F2);
                                }
                                nv.h(firebaseBundle, intent);
                                firebaseBundle.putInt("id", event2.getId());
                                firebaseBundle.putString("location", nv.G(intent).a);
                                firebaseBundle.putString("status", event2.getStatus().getType());
                                nv.N(eventActivity, firebaseBundle, "open_event");
                                v38 w = eventActivity.w();
                                String sportSlug = event2.getSportSlug();
                                sportSlug.getClass();
                                String replace = sportSlug.replace('-', '_');
                                replace.getClass();
                                w.b("event_".concat(replace));
                                eventActivity.w().b("event_tournament_" + o3a.F(event2.getTournament()));
                                ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout2 = eventActivity.R().c;
                                g6b lifecycle = eventActivity.getLifecycle();
                                lifecycle.getClass();
                                toolbarBackgroundAppBarLayout2.C.a(lifecycle, event2);
                                pco.G(eventActivity.R().e, new uq5(eventActivity, 10));
                                if (!((dsi) eventActivity.Q.getValue()).d) {
                                    eventActivity.R().e.y(0);
                                }
                                Set set = aef.a;
                                x0f b = aef.b(eventActivity, event2, fv.EVENT_SCREEN);
                                if (b != null && eventActivity.z().a(b)) {
                                    aef.c(eventActivity.A(), b.i);
                                }
                                mr5 T2 = eventActivity.T();
                                xw3.L(un0.z(T2), null, null, new cr5(T2, event2, r3, i52), 3);
                            }
                            if (eventActivity.b0 == null) {
                                ViewGroup.LayoutParams layoutParams = eventActivity.R().d.getLayoutParams();
                                ta0 ta0Var = layoutParams instanceof ta0 ? (ta0) layoutParams : null;
                                if (ta0Var != null) {
                                    ta0Var.a = 19;
                                }
                                String s2 = ok3.s(event2);
                                switch (s2.hashCode()) {
                                    case -1721090992:
                                        if (s2.equals(Sports.BASEBALL)) {
                                            z03Var = new h81(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    case -1160328212:
                                        if (s2.equals(Sports.VOLLEYBALL)) {
                                            z03Var = new xwk(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    case -877324069:
                                        if (s2.equals(Sports.TENNIS)) {
                                            z03Var = new m5j(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    case 394668909:
                                        if (s2.equals(Sports.FOOTBALL)) {
                                            z03Var = new kj8(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    default:
                                        z03Var = new z03(eventActivity);
                                        break;
                                }
                                eventActivity.b0 = z03Var;
                                eventActivity.R().f.addView(eventActivity.b0);
                            }
                            s21 s21Var2 = eventActivity.b0;
                            if (s21Var2 != null) {
                                s21Var2.setEvent(event2);
                            }
                            break;
                        }
                        break;
                    default:
                        wxf wxfVar10 = EventActivity.h0;
                        Event event4 = (Event) eventActivity.T().v.d();
                        if (event4 != null && me4.t(StatusKt.STATUS_IN_PROGRESS, event4) && !event4.isCrowdsourcingLive()) {
                            s21 s21Var3 = eventActivity.b0;
                            e21 e21Var = s21Var3 instanceof e21 ? (e21) s21Var3 : null;
                            if (e21Var != null) {
                                e21Var.q(event4);
                            }
                        }
                        break;
                }
                return Unit.a;
            }
        }));
        zzc zzcVar2 = T().D;
        final int i10 = 6;
        p15 p15Var2 = new p15(new Function1(this) { // from class: vq5
            public final /* synthetic */ EventActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [rq3] */
            /* JADX WARN: Type inference failed for: r3v17 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                s21 z03Var;
                int i42 = i10;
                boolean z = true;
                int i52 = 0;
                EventActivity eventActivity = this.b;
                switch (i42) {
                    case 0:
                        Event event = (Event) obj;
                        wxf wxfVar = EventActivity.h0;
                        event.getClass();
                        fdi fdiVar = eventActivity.T().u;
                        fdiVar.getClass();
                        fdiVar.m(null, event);
                        break;
                    case 1:
                        List list = (List) obj;
                        if (list != null) {
                            s21 s21Var = eventActivity.b0;
                            r3 = s21Var instanceof kj8 ? (kj8) s21Var : 0;
                            if (r3 != 0) {
                                r3.setFootballGoals(list);
                            }
                        } else {
                            wxf wxfVar2 = EventActivity.h0;
                        }
                        break;
                    case 2:
                        rd6 rd6Var = (rd6) obj;
                        wxf wxfVar3 = EventActivity.h0;
                        rd6Var.getClass();
                        if (!eventActivity.U().p(rd6Var.ordinal())) {
                            eventActivity.Z.add(rd6Var);
                        }
                        int D = eventActivity.U().D(rd6Var);
                        if (D == -1) {
                            int ordinal = rd6Var.ordinal();
                            dsf dsfVar = new dsf();
                            dsfVar.a = ordinal;
                            for (int i62 = 0; i62 < ordinal; i62++) {
                                rd6 rd6Var2 = (rd6) rd6.u.get(i62);
                                int i72 = dsfVar.a;
                                int D2 = eventActivity.U().D(rd6Var2);
                                if (D2 > 0) {
                                    D2 = 0;
                                }
                                dsfVar.a = i72 + D2;
                            }
                            eventActivity.U().v(rd6Var, dsfVar.a);
                            eventActivity.R().k.post(new yq5(0, eventActivity, dsfVar));
                        } else {
                            z = q5a.K(eventActivity.R().k, D);
                        }
                        break;
                    case 3:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        wxf wxfVar4 = EventActivity.h0;
                        if (!booleanValue) {
                            eventActivity.R().e.y(0);
                        } else if (eventActivity.R().e.getVisibility() == 0) {
                            eventActivity.R().e.y(1);
                        } else {
                            eventActivity.R().e.setVisibility(8);
                        }
                        break;
                    case 4:
                        wxf wxfVar5 = EventActivity.h0;
                        ((Unit) obj).getClass();
                        eventActivity.setResult(-1, eventActivity.getIntent());
                        break;
                    case 5:
                        Boolean bool = (Boolean) obj;
                        wxf wxfVar6 = EventActivity.h0;
                        ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = eventActivity.R().c;
                        bool.getClass();
                        toolbarBackgroundAppBarLayout.g(bool.booleanValue(), true, true);
                        break;
                    case 6:
                        wxf wxfVar7 = EventActivity.h0;
                        ((Unit) obj).getClass();
                        eventActivity.z().a(new h1f(((Number) eventActivity.S.getValue()).intValue()));
                        break;
                    case 7:
                        wxf wxfVar8 = EventActivity.h0;
                        int i82 = zq5.a[((cg) obj).a.ordinal()];
                        joa joaVar = eventActivity.c0;
                        if (i82 == 1) {
                            ((yk) joaVar.getValue()).show();
                        } else {
                            ((yk) joaVar.getValue()).dismiss();
                        }
                        break;
                    case 8:
                        Event event2 = (Event) obj;
                        wxf wxfVar9 = EventActivity.h0;
                        if (event2 == null) {
                            break;
                        } else {
                            qa6 qa6Var = su8.a;
                            su suVar = eventActivity.x;
                            f5p.E(eventActivity, new d17(event2, r3, 24));
                            suVar.a = Integer.valueOf(event2.getId());
                            suVar.c = event2.getStatusType();
                            sd6 U2 = eventActivity.U();
                            String s = ok3.s(event2);
                            U2.getClass();
                            s.getClass();
                            U2.r = s;
                            eventActivity.U().s = o3a.F(event2.getTournament());
                            eventActivity.U().t = event2.getTournament().getCategory().getSlug();
                            sd6 U22 = eventActivity.U();
                            Season season = event2.getTournament().getSeason();
                            U22.u = season != null ? season.getName() : null;
                            eventActivity.V(event2);
                            if (!eventActivity.K) {
                                eventActivity.R().h.setEnabled(false);
                                AdBannerView adBannerView = eventActivity.R().b;
                                ltb ltbVar = new ltb();
                                Event event3 = (Event) eventActivity.T().v.d();
                                if (event3 != null) {
                                    ltbVar.put(SearchResponseKt.SPORT_ENTITY, event3.getSportSlug());
                                    Integer F = o3a.F(event3.getTournament());
                                    if (F != null) {
                                        ltbVar.put("unique_tournament_id", String.valueOf(F.intValue()));
                                    }
                                    if (((Boolean) eventActivity.T.getValue()).booleanValue()) {
                                        ltbVar.put("previous_page", "tournament");
                                    }
                                    ltbVar.put("event_status", event3.getStatus().getType());
                                    TeamSides teamSides = TeamSides.ORIGINAL;
                                    ltbVar.put("home_team_id", String.valueOf(event3.getHomeTeam(teamSides).getId()));
                                    ltbVar.put("away_team_id", String.valueOf(event3.getAwayTeam(teamSides).getId()));
                                    ltbVar.put("page", "event");
                                    OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) CollectionsKt.firstOrNull(eventActivity.T().l.c());
                                    if (oddsCountryProvider != null) {
                                        ltbVar.put("odds_provider", oddsCountryProvider.getSubProviderIds().toString());
                                    }
                                }
                                eventActivity.I(adBannerView, ltbVar.d());
                                Intent intent = eventActivity.getIntent();
                                intent.getClass();
                                FirebaseBundle firebaseBundle = new FirebaseBundle();
                                String F2 = nv.F(intent);
                                if (F2 != null) {
                                    firebaseBundle.putString(Payload.CAMPAIGN_ID, F2);
                                }
                                nv.h(firebaseBundle, intent);
                                firebaseBundle.putInt("id", event2.getId());
                                firebaseBundle.putString("location", nv.G(intent).a);
                                firebaseBundle.putString("status", event2.getStatus().getType());
                                nv.N(eventActivity, firebaseBundle, "open_event");
                                v38 w = eventActivity.w();
                                String sportSlug = event2.getSportSlug();
                                sportSlug.getClass();
                                String replace = sportSlug.replace('-', '_');
                                replace.getClass();
                                w.b("event_".concat(replace));
                                eventActivity.w().b("event_tournament_" + o3a.F(event2.getTournament()));
                                ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout2 = eventActivity.R().c;
                                g6b lifecycle = eventActivity.getLifecycle();
                                lifecycle.getClass();
                                toolbarBackgroundAppBarLayout2.C.a(lifecycle, event2);
                                pco.G(eventActivity.R().e, new uq5(eventActivity, 10));
                                if (!((dsi) eventActivity.Q.getValue()).d) {
                                    eventActivity.R().e.y(0);
                                }
                                Set set = aef.a;
                                x0f b = aef.b(eventActivity, event2, fv.EVENT_SCREEN);
                                if (b != null && eventActivity.z().a(b)) {
                                    aef.c(eventActivity.A(), b.i);
                                }
                                mr5 T2 = eventActivity.T();
                                xw3.L(un0.z(T2), null, null, new cr5(T2, event2, r3, i52), 3);
                            }
                            if (eventActivity.b0 == null) {
                                ViewGroup.LayoutParams layoutParams = eventActivity.R().d.getLayoutParams();
                                ta0 ta0Var = layoutParams instanceof ta0 ? (ta0) layoutParams : null;
                                if (ta0Var != null) {
                                    ta0Var.a = 19;
                                }
                                String s2 = ok3.s(event2);
                                switch (s2.hashCode()) {
                                    case -1721090992:
                                        if (s2.equals(Sports.BASEBALL)) {
                                            z03Var = new h81(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    case -1160328212:
                                        if (s2.equals(Sports.VOLLEYBALL)) {
                                            z03Var = new xwk(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    case -877324069:
                                        if (s2.equals(Sports.TENNIS)) {
                                            z03Var = new m5j(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    case 394668909:
                                        if (s2.equals(Sports.FOOTBALL)) {
                                            z03Var = new kj8(eventActivity);
                                            break;
                                        }
                                        z03Var = new z03(eventActivity);
                                        break;
                                    default:
                                        z03Var = new z03(eventActivity);
                                        break;
                                }
                                eventActivity.b0 = z03Var;
                                eventActivity.R().f.addView(eventActivity.b0);
                            }
                            s21 s21Var2 = eventActivity.b0;
                            if (s21Var2 != null) {
                                s21Var2.setEvent(event2);
                            }
                            break;
                        }
                        break;
                    default:
                        wxf wxfVar10 = EventActivity.h0;
                        Event event4 = (Event) eventActivity.T().v.d();
                        if (event4 != null && me4.t(StatusKt.STATUS_IN_PROGRESS, event4) && !event4.isCrowdsourcingLive()) {
                            s21 s21Var3 = eventActivity.b0;
                            e21 e21Var = s21Var3 instanceof e21 ? (e21) s21Var3 : null;
                            if (e21Var != null) {
                                e21Var.q(event4);
                            }
                        }
                        break;
                }
                return Unit.a;
            }
        }, i);
        zzcVar2.getClass();
        zzcVar2.a.e(this, p15Var2);
        yea yeaVar = j58.a;
        T().I.e(this, new z1(7, new r82(23, this, j58.c())));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        View actionView;
        View actionView2;
        menu.getClass();
        getMenuInflater().inflate(R.menu.activity_details_menu, menu);
        MenuItem findItem = menu.findItem(R.id.add_to_favorites);
        this.X = findItem;
        NotificationsActionButton notificationsActionButton = null;
        this.Y = (findItem == null || (actionView2 = findItem.getActionView()) == null) ? null : (FollowActionButton) actionView2.findViewById(R.id.follow_button);
        MenuItem findItem2 = menu.findItem(R.id.receive_notifications);
        this.V = findItem2;
        if (findItem2 != null && (actionView = findItem2.getActionView()) != null) {
            notificationsActionButton = (NotificationsActionButton) actionView.findViewById(R.id.notifications_button);
        }
        this.W = notificationsActionButton;
        this.R = menu;
        return true;
    }

    @Override // com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        R().k.e((ar5) this.f0.getValue());
        if (jca.G(D()) && pk.c(this)) {
            ad2 ad2Var = qv5.a;
            qv5.a(f52.a);
        }
        super.onDestroy();
    }

    @Override // com.sofascore.results.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        T().o.a();
        AnimatedVectorDrawable S = S();
        if (S != null) {
            S.unregisterAnimationCallback(this.d0);
            S.reset();
        }
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        V((Event) T().v.d());
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final void onProvideAssistContent(AssistContent assistContent) {
        assistContent.getClass();
        super.onProvideAssistContent(assistContent);
        Event event = (Event) T().v.d();
        if (event != null) {
            assistContent.setWebUri(Uri.parse(String.format("%s%s%s", Arrays.copyOf(new Object[]{getString(R.string.share_link), event.getWebUrl(), ""}, 3))));
        }
    }

    @Override // com.sofascore.results.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        mr5 T = T();
        iz2 z = un0.z(T);
        hs4 hs4Var = z45.a;
        xw3.L(z, hq4.c, null, new ce4(T, (rq3) null, 9), 2);
        if (A().getBoolean("PREF_CHAT_SHOW_ANIMATED_CHAT_ICON", true)) {
            R().e.setIcon(td4.d0(R.drawable.chat_icon, this));
        } else {
            R().e.setIcon(td4.d0(R.drawable.ic_chat, this));
        }
        AnimatedVectorDrawable S = S();
        if (S != null) {
            S.start();
            S.registerAnimationCallback(this.d0);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putInt("TAB_POSITION", R().k.getCurrentItem());
    }

    @Override // com.sofascore.results.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT >= 34) {
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = getApplicationContext();
                synchronized (uic.i) {
                    sharedPreferences = a5f.d(applicationContext);
                    uic.j = sharedPreferences;
                }
                sharedPreferences.getClass();
            }
            if (sharedPreferences.getBoolean("PREF_SCREENSHOT_DO_NOT_SHOW_AGAIN", false)) {
                return;
            }
            registerScreenCaptureCallback(getMainExecutor(), cp4.e(this.g0.getValue()));
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (Build.VERSION.SDK_INT >= 34) {
            try {
                unregisterScreenCaptureCallback(cp4.e(this.g0.getValue()));
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "EventScreen";
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String y() {
        return mz1.j(((Number) this.S.getValue()).intValue(), super.y(), " id:");
    }
}
